document.addEventListener('DOMContentLoaded', () => {
    fetchRoadmap();

    // Modal close logic
    const modal = document.getElementById('modal');
    const closeBtn = document.querySelector('.close-btn');
    closeBtn.addEventListener('click', () => {
        modal.classList.add('hidden');
    });
    window.addEventListener('click', (e) => {
        if (e.target === modal) {
            modal.classList.add('hidden');
        }
    });
});

async function fetchRoadmap() {
    try {
        const response = await fetch('/api/roadmaps/java');
        const data = await response.json();
        const container = document.getElementById('roadmap-container');
        container.innerHTML = ''; // Clear loading text

        container.appendChild(renderNode(data));
    } catch (error) {
        console.error('Error fetching roadmap:', error);
        document.getElementById('roadmap-container').innerHTML = '<div class="error">Failed to load roadmap. Is the server running?</div>';
    }
}

function renderNode(node) {
    const group = document.createElement('div');
    group.className = 'group-container';

    // Create the Node Element itself
    const nodeEl = document.createElement('div');
    nodeEl.className = 'node';

    // Add content
    const title = document.createElement('div');
    title.className = 'node-title';
    title.textContent = node.label;
    nodeEl.appendChild(title);

    if (node.status) {
        const status = document.createElement('div');
        status.className = 'node-status';
        status.textContent = node.status;
        nodeEl.appendChild(status);
    }

    // Click event for modal
    nodeEl.addEventListener('click', () => {
        showModal(node);
    });

    group.appendChild(nodeEl);

    // Render Children if they exist
    if (node.children && node.children.length > 0) {
        const childrenContainer = document.createElement('div');
        childrenContainer.className = 'children-container';

        node.children.forEach(child => {
            childrenContainer.appendChild(renderNode(child));
        });

        group.appendChild(childrenContainer);
    }

    return group;
}

function showModal(node) {
    const modal = document.getElementById('modal');
    document.getElementById('modal-title').textContent = node.label;
    document.getElementById('modal-desc').textContent = node.description || "No description available.";
    modal.classList.remove('hidden');
}
