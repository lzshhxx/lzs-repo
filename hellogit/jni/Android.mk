LOCAL_PATH := $(call my-dir)

include $(CLEAR_VARS)

LOCAL_MODULE    := hellogit
LOCAL_SRC_FILES := hellogit.cpp

include $(BUILD_SHARED_LIBRARY)
