pipeline{
	agent any
	stages{
		
		stage('clean')
                {
                        steps{
                                sh 'mvn clean'

                        }
                }
		stage('validate')
				{
						steps{
								sh 'mvn validate'

						}
				}
		stage('compile the project')
				{
						steps{
								sh 'mvn compile'

						}
				}
		stage('compile the test src')
				{
						steps{
								sh 'mvn test-compile'

						}
				}
		stage('run the test cases')
				{
						steps{
								sh 'mvn test'

						}
				}
		stage('packaging')
				{
						steps{
								sh 'mvn package'

						}
				}

	}
}
