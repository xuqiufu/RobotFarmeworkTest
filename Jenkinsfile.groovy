pipeline {

    agent any  
    stages {  
        stage("build") {
            steps {
                // 步骤内构建脚本  
				bat '''
				${build_commnd}
				'''
					}
				}
    post {
        always {  
            echo "Say goodbye!"
			}
		}
	}
}