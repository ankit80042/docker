FROM docker.io/library/python:3.11

# Copy requirements file and install dependencies
COPY requirements.txt /requirements.txt
RUN --mount=type=cache,target=/root/.cache python3 -m pip install --no-cache-dir -r /requirements.txt

# Copy the entire local directory into the Docker image
COPY . .

# Add any additional commands as needed
