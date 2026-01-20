import { Box, Typography } from "@mui/material";
import { Card } from "./ui";
import "./RoadmapNode.css";

const RoadmapNode = ({ node, onNodeClick, level = 0 }) => {
  if (!node) return null;

  return (
    <Box className="roadmap-node" style={{ marginLeft: level * 24 }}>
      {level > 0 && (
        <>
          <Box className="roadmap-node__connector-h" />
          <Box className="roadmap-node__connector-v" />
        </>
      )}

      <Card
        variant="outlined"
        onClick={() => onNodeClick(node)}
        className="roadmap-node__card"
      >
        {node.level && (
          <span
            className={`roadmap-node__level roadmap-node__level--${node.level}`}
          >
            {node.level}
          </span>
        )}
        <Box className="roadmap-node__content">
          <Typography variant="subtitle1" fontWeight="bold">
            {node.label}
          </Typography>
          {node.description && (
            <Typography variant="caption" color="text.secondary">
              {node.description}
            </Typography>
          )}
        </Box>
      </Card>

      {node.children && node.children.length > 0 && (
        <Box
          className={`roadmap-node__children ${level === 0 ? "roadmap-node__children--root" : ""}`}
        >
          {node.children.map((child) => (
            <RoadmapNode
              key={child.id}
              node={child}
              onNodeClick={onNodeClick}
              level={level + 1}
            />
          ))}
        </Box>
      )}
    </Box>
  );
};

export default RoadmapNode;
