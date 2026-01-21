import { Paper, Box, Typography, IconButton } from "@mui/material";
import CloseIcon from "@mui/icons-material/Close";
import CircleIcon from "@mui/icons-material/Circle";
import ReactMarkdown from "react-markdown";
import "./RoadmapDetail.css";

const RoadmapDetail = ({ topic, onClose }) => {
  return (
    <Paper elevation={4} className="detail-panel">
      <Box className="detail-header">
        <Typography variant="h5" component="h2" fontWeight="bold" color="primary">
          {topic.label}
        </Typography>
        <IconButton onClick={onClose}>
          <CloseIcon />
        </IconButton>
      </Box>

      <Box className="detail-content">
        {topic.content ? (
          <Box className="markdown-content">
            <ReactMarkdown>{topic.content}</ReactMarkdown>
          </Box>
        ) : (
          <Box className="empty-state">
            <CircleIcon sx={{ fontSize: 60, mb: 2, color: "grey.300" }} />
            <Typography>Select a topic to view details</Typography>
          </Box>
        )}
      </Box>
    </Paper>
  );
};

export default RoadmapDetail;
