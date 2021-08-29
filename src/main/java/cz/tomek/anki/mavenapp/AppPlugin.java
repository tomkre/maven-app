package cz.tomek.anki.mavenapp;

import org.apache.maven.plugin.AbstractMojo;
import org.apache.maven.plugin.MojoExecutionException;
import org.apache.maven.plugin.MojoFailureException;
import org.apache.maven.plugins.annotations.LifecyclePhase;
import org.apache.maven.plugins.annotations.Mojo;
import org.apache.maven.plugins.annotations.Parameter;
import org.apache.maven.project.MavenProject;

@Mojo(name = "develop", defaultPhase = LifecyclePhase.PACKAGE)
public class AppPlugin extends AbstractMojo {

	@Parameter(required = true, alias = "author", property = "developer")
	private String developer;
	
	@Parameter(defaultValue = "${project}", required = true, readonly = true)
	private MavenProject project;
	
	@Parameter(defaultValue = "${project.artifactId}", property = "projectName", required = true, readonly = true)
	private String projectName;
	
	@Override
	public void execute() throws MojoExecutionException, MojoFailureException {
		getLog().info(String.format("%s develops %s in flow and with passion", 
				developer, projectName));
	}
	
}
