import { useState, useEffect } from "react";
import { Box, CircularProgress, Backdrop } from "@mui/material";
import RoadmapHeader from "./components/RoadmapHeader";
import RoadmapTopic from "./components/RoadmapTopic";
import RoadmapDetail from "./components/RoadmapDetail";
import { getRoadmap, getTopicContent } from "./services/roadmapService";
import "./Roadmap.css";

export default function Roadmap() {
  const [data, setData] = useState(null);
  const [roadmapId, setRoadmapId] = useState("java");
  const [selectedTopic, setSelectedTopic] = useState(null);
  const [loading, setLoading] = useState(false);

  const fetchRoadmapData = async (id) => {
    setLoading(true);
    try {
      const result = await getRoadmap(id);
      setData(result);
      setSelectedTopic(null);
    } catch (error) {
      console.error(error);
    } finally {
      setLoading(false);
    }
  };

  const handleTopicClick = async (topic) => {
    if (!topic) {
      setSelectedTopic(null);
      return;
    }
    try {
      const fullTopic = await getTopicContent(roadmapId, topic.id);
      setSelectedTopic(fullTopic);
    } catch (error) {
      console.error("Error fetching topic details:", error);
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
      <Backdrop sx={{ color: "#fff", zIndex: (theme) => theme.zIndex.drawer + 1 }} open={loading}>
        <CircularProgress color="inherit" />
      </Backdrop>

      <RoadmapHeader
        label={data.label}
        description={data.description}
        roadmapId={roadmapId}
        onRoadmapChange={handleRoadmapChange}
      />

      <Box className="roadmap-main">
        <Box className={`roadmap-tree ${selectedTopic ? "roadmap-tree--reformed" : ""}`}>
          {data.children?.map((child) => (
            <RoadmapTopic key={child.id} topic={child} onTopicClick={handleTopicClick} />
          ))}
        </Box>

        {selectedTopic && (
          <RoadmapDetail topic={selectedTopic} onClose={() => setSelectedTopic(null)} />
        )}
      </Box>
    </Box>
  );
}
