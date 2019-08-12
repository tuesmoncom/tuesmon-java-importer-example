package demo;

import net.kaleidos.domain.Project;
import net.kaleidos.tuesmon.TuesmonClient;

public class Application {

    public static void main(String[] args) {
        TuesmonClient tuesmonClient = new TuesmonClient("http://localhost:8000");
        tuesmonClient.authenticate("user1", "123123");

        Project project = new Project()
            .setName("Test project")
            .setDescription("My super awesome project");

        project = tuesmonClient.createProject(project);

        System.out.println(project);

        tuesmonClient.deleteProject(project);
    }
}