#include <jni.h>
#include <stdio.h>

JNIEXPORT jint JNICALL Java_factorial_fact
(JNIEnv *env, jobject jobj, jint num)
{
  jint result=1;

  while(num)
  {
	result*=num;
	num--;
  }

return result;
}

