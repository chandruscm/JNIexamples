//reverse.c
 
#include <jni.h>
#include <stdio.h>
 
JNIEXPORT jstring JNICALL Java_reverse_reversefunc
(JNIEnv *env,jobject jobj,jstring original)
{
  const char *org;
  char *rev;
 
  org = (*env)->GetStringUTFChars(env,original,NULL);
 
  int i;
  int size = (*env)->GetStringUTFLength(env,original);
   
  for(i=0;i<size;i++)
        rev[i]=org[size-i-1];
 
  rev[size]='\0';
 
return (*env)->NewStringUTF(env,rev);
}