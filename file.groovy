def file = 'razon.txt'
println file
File f1 = new File(file)
contenido = f1.getText('UTF-8')
contenido.replace("razon","razón")
println contenido
File f2 = new File("out.txt")
f2.append(contenido.replace("razon","razón"))

