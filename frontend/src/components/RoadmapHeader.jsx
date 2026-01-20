import { Header, ToggleGroup } from "./ui";

const ROADMAP_OPTIONS = [
  { value: "java", label: "Java Developer" },
  { value: "backend", label: "Backend Developer" },
];

const RoadmapHeader = ({ label, description, roadmapId, onRoadmapChange }) => {
  return (
    <Header title={label} subtitle={description}>
      <ToggleGroup
        value={roadmapId}
        onChange={onRoadmapChange}
        options={ROADMAP_OPTIONS}
      />
    </Header>
  );
};

export default RoadmapHeader;
