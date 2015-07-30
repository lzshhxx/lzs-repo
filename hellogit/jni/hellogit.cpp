#include <jni.h>

#include <string.h>

#include "lzs.h"
#include "com_example_hellogit_GitMainActivity.h"


jstring Java_com_example_hellogit_GitMainActivity_stringFirst(JNIEnv *env,jobject obj,jstring str)
{
	return str;
}
jstring Java_com_example_hellogit_GitMainActivity_stringSecond(JNIEnv *env,jobject obj,jstring str)
{
	char buf[30];
	jboolean iscopy;
    const char *ch = env->GetStringUTFChars(str,&iscopy);
    jstring strin = env->NewStringUTF(lzs(ch,buf));


	return strin;
}
