import { AppBar, Toolbar, Box, Typography } from "@mui/material";
import "./Header.css";

const Header = ({ title, subtitle, children }) => {
  return (
    <AppBar
      position="static"
      color="default"
      elevation={1}
      className="ui-header"
    >
      <Toolbar className="ui-header__toolbar">
        <Box className="ui-header__title-section">
          <Typography variant="h6" component="div" className="ui-header__title">
            {title}
          </Typography>
          {subtitle && (
            <Typography variant="body2" color="text.secondary">
              {subtitle}
            </Typography>
          )}
        </Box>
        {children && <Box className="ui-header__actions">{children}</Box>}
      </Toolbar>
    </AppBar>
  );
};

export default Header;
