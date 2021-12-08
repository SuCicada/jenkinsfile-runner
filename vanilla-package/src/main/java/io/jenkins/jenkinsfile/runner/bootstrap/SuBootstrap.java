package io.jenkins.jenkinsfile.runner.bootstrap;

public class SuBootstrap {
    public static void main(String[] args) throws Throwable {

        Bootstrap.main(new String[]{
            "run"
            , "-w", "C:\\Users\\ZQ091606\\Documents\\PROGRAM\\GitHub\\jenkinsfile-runner\\dist\\target\\jenkinsfile-runner.jar"
            , "-f", "C:\\Users\\ZQ091606\\Documents\\PROGRAM\\GitHub\\jenkinsfile-runner\\vanilla-package\\src\\test\\Jenkinsfile"
            , "-p", "C:\\Users\\ZQ091606\\Documents\\PROGRAM\\GitHub\\jenkinsfile-runner\\plugins.txt"
            , "-a", "WORK_SPACE=$project_path"
//            , "--openWebUI"
//            ,"--httpPort", "9999"
//            ,"--httpPath", "/job"
        });
    }
}
