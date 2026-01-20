import { Paper } from "@mui/material";
import "./Card.css";

const Card = ({
  children,
  className = "",
  variant = "default",
  onClick,
  ...props
}) => {
  const baseClass = "ui-card";
  const variantClass = variant !== "default" ? `ui-card--${variant}` : "";
  const clickableClass = onClick ? "ui-card--clickable" : "";

  return (
    <Paper
      elevation={variant === "elevated" ? 4 : 1}
      className={`${baseClass} ${variantClass} ${clickableClass} ${className}`}
      onClick={onClick}
      {...props}
    >
      {children}
    </Paper>
  );
};

export default Card;
