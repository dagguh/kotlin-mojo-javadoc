package pl.mkwidzinski.kotlin.mojo;


import org.apache.maven.plugin.AbstractMojo;
import org.apache.maven.plugin.MojoExecutionException;
import org.apache.maven.plugins.annotations.Mojo;
import org.apache.maven.plugins.annotations.Parameter;

/**
 * The goal Javadoc
 */
@Mojo(name = "java-mojo")
class JavaMojo extends AbstractMojo {

    /**
     * The foo Javadoc
     */
    @Parameter
    private String foo;

    /**
     * The bar Javadoc
     */
    @Parameter
    private String bar;

    public void execute() throws MojoExecutionException {
        getLog().info("Hello World!");
    }
}
