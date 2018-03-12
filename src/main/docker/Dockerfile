FROM java:8
ARG ARTIFACT_NAME
ADD ${ARTIFACT_NAME}.jar app.jar
ADD wrapper.sh wrapper.sh
RUN bash -c 'chmod +x /wrapper.sh'
RUN bash -c 'touch /app.jar'
EXPOSE ${EXPOSED_PORT}
ENTRYPOINT ["/bin/bash", "/wrapper.sh"]
