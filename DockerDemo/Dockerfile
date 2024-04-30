FROM docker.io/library/python:3.11
RUN --mount=type=cache,target=/root/.cache     python3 -m pip install --no-cache-dir -r /requirements.txt
COPY . .
