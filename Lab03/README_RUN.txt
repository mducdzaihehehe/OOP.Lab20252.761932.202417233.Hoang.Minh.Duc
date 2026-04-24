HOW TO COMPILE AND RUN IN VS CODE / POWERSHELL

1. Compile and run AimsProject:

   cd AimsProject
   javac -d bin -cp src (Get-ChildItem -Recurse -Filter *.java src | ForEach-Object FullName)
   java -cp bin hust.soict.hedspi.aims.Aims
   java -cp bin hust.soict.hedspi.test.cart.CartTest
   java -cp bin hust.soict.hedspi.test.store.StoreTest
   java -cp bin hust.soict.hedspi.test.disc.TestPassingParameter

2. Compile and run OtherProjects:

   cd ../OtherProjects
   javac -d bin -cp src (Get-ChildItem -Recurse -Filter *.java src | ForEach-Object FullName)
   java -cp bin hust.soict.hedspi.garbage.ConcatenationInLoops
   java -cp bin hust.soict.hedspi.garbage.GarbageCreator
   java -cp bin hust.soict.hedspi.garbage.NoGarbage

NOTE:
- The package root follows the teacher's sample: hust.soict.hedspi.
- This zip includes PUML diagrams and simple notes, but it does not include proprietary Astah .asta files.
