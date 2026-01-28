def call(Map args = [:]) {

    def extraArgs = args.get('additionalArguments', '--scan ./')

    dependencyCheck(
        additionalArguments: extraArgs,
        odcInstallation: 'OWASP'
    )

    dependencyCheckPublisher(
        pattern: '**/dependency-check-report.xml'
    )
}
