package pl.mkwidzinski.kotlin.mojo


import org.apache.maven.plugin.AbstractMojo
import org.apache.maven.plugin.MojoExecutionException
import org.apache.maven.plugins.annotations.Mojo
import org.apache.maven.plugins.annotations.Parameter

/**
 * The goal Javadoc
 */
@Mojo(name = "kotlin-mojo")
class KotlinMojo : AbstractMojo() {

    /**
     * The foo Javadoc
     */
    @Parameter
    private val foo: String? = null

    /**
     * The bar Javadoc
     */
    @Parameter
    private val bar: String? = null

    @Throws(MojoExecutionException::class)
    override fun execute() {
        log.info("Hello World!")
    }
}
