package org.camunda.bpm.extension.swagger.generator.fn;

/**
 * @see "https://github.com/mbenson/annotation-processing-support/blob/master/src/main/java/mbenson/annotationprocessing/CodeModelProcessorBase.java"
 */
public class CodeWriter {

 // public final boolean process(final Set<? extends TypeElement> annotations, RoundEnvironment roundEnv) {
//    final JCodeModel codeModel = new JCodeModel();
//    boolean result;
//    try {
//      result = processTo(codeModel, annotations, roundEnv);
//    } catch (Throwable t) {
//      error(t, "Error creating code model");
//      result = false;
//    }
//    if (result) {
//      try {
//        final AbstractCodeWriter codeWriter = new AbstractCodeWriter(Charset.forName("UTF-8"), System.getProperty("line.separator")) {
//
//          @Override
//          public OutputStream openBinary(JPackage pkg, String fileName) throws IOException {
//            final JavaFileObject sourceFile = processingEnv.getFiler().createSourceFile(
//              StringUtils.join(pkg.name(), ".", StringUtils.removeEnd(fileName, JAVA_FILE_EXTENSION)),
//              annotations.toArray(new TypeElement[annotations.size()]));
//            return sourceFile.openOutputStream();
//          }
//
//          @Override
//          public void close() throws IOException {
//          }
//        };
//        codeModel
//          .build(new PrologCodeWriter(codeWriter, String.format("generated by %s\n", getClass().getName())));
//      } catch (IOException e) {
//        error(e, "Error generating code");
//      }
//    }
//    return result;
//  }

}