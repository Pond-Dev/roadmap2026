import axios from "axios";

const API_URL = "http://localhost:8080/api/roadmaps";

export const getRoadmap = async (id) => {
  try {
    const response = await axios.get(`${API_URL}/${id}`);
    return response.data;
  } catch (error) {
    console.error("Error fetching roadmap:", error);
    throw error;
  }
};
