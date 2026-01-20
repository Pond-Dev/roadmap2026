import { ToggleButton, ToggleButtonGroup } from "@mui/material";
import "./ToggleGroup.css";

const ToggleGroup = ({ value, onChange, options, size = "small" }) => {
  return (
    <ToggleButtonGroup
      value={value}
      exclusive
      onChange={onChange}
      size={size}
      className="ui-toggle-group"
    >
      {options.map((option) => (
        <ToggleButton key={option.value} value={option.value}>
          {option.label}
        </ToggleButton>
      ))}
    </ToggleButtonGroup>
  );
};

export default ToggleGroup;
