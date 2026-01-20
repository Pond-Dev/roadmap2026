import { useState, useEffect } from "react";
import { Box, CircularProgress, Backdrop } from "@mui/material";
import RoadmapHeader from "./components/RoadmapHeader";
import RoadmapNode from "./components/RoadmapNode";
import RoadmapDetail from "./components/RoadmapDetail";
import { getRoadmap } from "./services/roadmapService";
import "./Roadmap.css";

export default function Roadmap() {
  const [data, setData] = useState(null);
  const [roadmapId, setRoadmapId] = useState("java");
  const [selectedNode, setSelectedNode] = useState(null);
  const [loading, setLoading] = useState(false);

  const fetchRoadmapData = async (id) => {
    setLoading(true);
    try {
      const result = await getRoadmap(id);
      setData(result);
      setSelectedNode(null);
    } catch (error) {
      console.error(error);
    } finally {
      setLoading(false);
    }
  };

  useEffect(() => {
    fetchRoadmapData(roadmapId);
  }, [roadmapId]);

  const handleRoadmapChange = (event, newRoadmapId) => {
    if (newRoadmapId !== null) {
      setRoadmapId(newRoadmapId);
    }
  };

  if (!data) {
    return (
      <Box className="roadmap-loading">
        <CircularProgress />
      </Box>
    );
  }

  return (
    <Box className="roadmap-container">
      <Backdrop
        sx={{ color: "#fff", zIndex: (theme) => theme.zIndex.drawer + 1 }}
        open={loading}
      >
        <CircularProgress color="inherit" />
      </Backdrop>

      <RoadmapHeader
        label={data.label}
        description={data.description}
        roadmapId={roadmapId}
        onRoadmapChange={handleRoadmapChange}
      />

      <Box className="roadmap-main">
        <Box className="roadmap-tree">
          {data.children?.map((child) => (
            <RoadmapNode
              key={child.id}
              node={child}
              onNodeClick={setSelectedNode}
            />
          ))}
        </Box>

        {selectedNode && (
          <RoadmapDetail
            node={selectedNode}
            onClose={() => setSelectedNode(null)}
          />
        )}
      </Box>
    </Box>
  );
}
