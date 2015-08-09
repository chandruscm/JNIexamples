#include <jni.h>
#include <stdio.h>

JNIEXPORT void JNICALL Java_HelloWorld_cfunction
(JNIEnv *env, jobject jobj)
{
      printf("\n > C says HelloWorld !\n");
}
