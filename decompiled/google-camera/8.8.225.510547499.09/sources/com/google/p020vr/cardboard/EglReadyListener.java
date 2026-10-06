package com.google.p020vr.cardboard;

import android.opengl.GLES20;
import android.util.Log;
import javax.microedition.khronos.egl.EGL10;
import javax.microedition.khronos.egl.EGLContext;
import p000.oez;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public class EglReadyListener {

    /* JADX INFO: renamed from: a */
    private volatile EGLContext f8436a;

    /* JADX INFO: renamed from: b */
    private volatile int f8437b;

    /* JADX INFO: renamed from: e */
    private volatile oez f8440e;

    /* JADX INFO: renamed from: c */
    private volatile int f8438c = 2;

    /* JADX INFO: renamed from: d */
    private final Object f8439d = new Object();

    /* JADX INFO: renamed from: f */
    private final Object f8441f = new Object();

    public void onEglReady() {
        int iIndexOf;
        int numericValue;
        synchronized (this.f8439d) {
            this.f8436a = ((EGL10) EGLContext.getEGL()).eglGetCurrentContext();
            if (this.f8436a == null || this.f8436a == EGL10.EGL_NO_CONTEXT) {
                Log.e("EglReadyListener", "Unable to obtain the application's OpenGL context.");
            }
            String strGlGetString = GLES20.glGetString(7938);
            int i = 2;
            if (strGlGetString != null && (iIndexOf = strGlGetString.indexOf(46)) > 0 && (numericValue = Character.getNumericValue(strGlGetString.charAt(iIndexOf - 1))) >= 0) {
                i = numericValue;
            } else {
                Log.e("EglReadyListener", "Unable to determine the OpenGL major version.");
            }
            this.f8438c = i;
            int[] iArr = new int[1];
            GLES20.glGetIntegerv(33310, iArr, 0);
            GLES20.glGetError();
            this.f8437b = iArr[0];
        }
        synchronized (this.f8441f) {
        }
    }
}
