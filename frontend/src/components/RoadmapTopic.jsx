import { useState } from "react";
import { Box, Typography, IconButton } from "@mui/material";
import KeyboardArrowDownIcon from "@mui/icons-material/KeyboardArrowDown";
import KeyboardArrowRightIcon from "@mui/icons-material/KeyboardArrowRight";
import { Card } from "./ui";
import "./RoadmapTopic.css";

const RoadmapTopic = ({ topic, onTopicClick, level = 0 }) => {
  const [expanded, setExpanded] = useState(false);

  if (!topic) return null;

  const hasChildren = topic.children && topic.children.length > 0;

  const handleCardClick = () => {
    if (hasChildren) {
      setExpanded(!expanded);
      onTopicClick(null);
    } else {
      onTopicClick(topic);
    }
  };

  return (
    <Box className="roadmap-topic" style={{ marginLeft: level * 24 }}>
      {level > 0 && (
        <>
          <Box className="roadmap-topic__connector-h" />
          <Box className="roadmap-topic__connector-v" />
        </>
      )}

      <Card
        variant="outlined"
        onClick={handleCardClick}
        className="roadmap-topic__card"
        sx={{ cursor: "pointer" }}
      >
        {topic.level && (
          <span className={`roadmap-topic__level roadmap-topic__level--${topic.level}`}>
            {topic.level}
          </span>
        )}
        <Box className="roadmap-topic__content">
          <Box sx={{ display: "flex", alignItems: "center", gap: 1 }}>
            {hasChildren && (
              <Box
                sx={{
                  display: "flex",
                  alignItems: "center",
                  justifyContent: "center",
                  width: 24,
                  height: 24,
                  marginLeft: -1,
                  color: "action.active",
                }}
              >
                {expanded ? (
                  <KeyboardArrowDownIcon fontSize="small" />
                ) : (
                  <KeyboardArrowRightIcon fontSize="small" />
                )}
              </Box>
            )}
            <Typography variant="subtitle1" fontWeight="bold">
              {topic.label}
            </Typography>
          </Box>
          {topic.description && (
            <Typography variant="caption" color="text.secondary">
              {topic.description}
            </Typography>
          )}
        </Box>
      </Card>

      {hasChildren && expanded && (
        <Box
          className={`roadmap-topic__children ${level === 0 ? "roadmap-topic__children--root" : ""}`}
        >
          {topic.children.map((child) => (
            <RoadmapTopic
              key={child.id}
              topic={child}
              onTopicClick={onTopicClick}
              level={level + 1}
            />
          ))}
        </Box>
      )}
    </Box>
  );
};

export default RoadmapTopic;
