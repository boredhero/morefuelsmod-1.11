Mod by boredherobrine13!

To Compile a build:

Clone repository
Go to cloned repository folder
Open windows command prompt/linux terminal
run "gradlew build"
Go into \build\libs
You will find the compiled jar here and a source jar.

To set up a development workspace for ECLIPSE:

Clone repository
Go to cloned repository folder
Open windows command prompt/linux terminal
run "gradlew setupDecompWorkspace  --refresh-dependencies"
run "gradlew eclipse"
Open eclipse, set your workspace.
In the diologue box, navigate into the cloned repo.
Navigate into the "eclipse" folder
Hit okay, let eclipse load the project in.

To set up a development workspace for IntelliJ IDEA (Untested by me):

Same as for eclipse, just change "gradlew eclipse" to "gradlew idea"

To update the forge version that the mod is built on:

Clone repository
Go to cloned repository folder
Open windows command prompt/linux terminal
run "gradlew cleanCache"
Open build.gradle and change the build to the number you want instead
run "gradlew setupDecompWorkspace --refresh-dependencies"
run "gradlew eclipse"


