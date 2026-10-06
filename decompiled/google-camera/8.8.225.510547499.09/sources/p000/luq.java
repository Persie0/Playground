package p000;

import android.opengl.GLES20;
import android.util.Log;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class luq {

    /* JADX INFO: renamed from: a */
    private static final String f39247a = luq.class.getSimpleName();

    /* JADX INFO: renamed from: b */
    private int f39248b;

    /* JADX INFO: renamed from: c */
    private int f39249c;

    /* JADX INFO: renamed from: d */
    private int f39250d;

    public luq(String str, String str2) {
        this.f39248b = -1;
        this.f39249c = -1;
        this.f39250d = -1;
        this.f39248b = m16021f(35633, str);
        this.f39249c = m16021f(35632, str2);
        int iGlCreateProgram = GLES20.glCreateProgram();
        this.f39250d = iGlCreateProgram;
        GLES20.glAttachShader(iGlCreateProgram, this.f39248b);
        GLES20.glAttachShader(this.f39250d, this.f39249c);
        GLES20.glLinkProgram(this.f39250d);
    }

    /* JADX INFO: renamed from: f */
    private static int m16021f(int i, String str) {
        int iGlCreateShader = GLES20.glCreateShader(i);
        GLES20.glShaderSource(iGlCreateShader, str);
        GLES20.glCompileShader(iGlCreateShader);
        int[] iArr = new int[1];
        GLES20.glGetShaderiv(iGlCreateShader, 35713, iArr, 0);
        if (iArr[0] != 0) {
            return iGlCreateShader;
        }
        String strGlGetShaderInfoLog = GLES20.glGetShaderInfoLog(iGlCreateShader);
        Log.e(f39247a, strGlGetShaderInfoLog);
        GLES20.glDeleteShader(iGlCreateShader);
        throw new IllegalArgumentException("Shader compilation failed: ".concat(String.valueOf(strGlGetShaderInfoLog)));
    }

    /* JADX INFO: renamed from: a */
    public final void m16022a() {
        GLES20.glUseProgram(this.f39250d);
    }

    /* JADX INFO: renamed from: b */
    public final void m16023b() {
        GLES20.glDeleteShader(this.f39248b);
        GLES20.glDeleteShader(this.f39249c);
        GLES20.glDeleteProgram(this.f39250d);
    }

    /* JADX INFO: renamed from: c */
    public final void m16024c() {
        GLES20.glUseProgram(0);
    }

    /* JADX INFO: renamed from: d */
    public final oyo m16025d(String str) {
        int iGlGetUniformLocation = GLES20.glGetUniformLocation(this.f39250d, str);
        if (iGlGetUniformLocation >= 0) {
            return new oyo(iGlGetUniformLocation);
        }
        Log.e(f39247a, "Could not find uniform named ".concat(str));
        return null;
    }

    /* JADX INFO: renamed from: e */
    public final oyo m16026e(String str) {
        int iGlGetAttribLocation = GLES20.glGetAttribLocation(this.f39250d, str);
        if (iGlGetAttribLocation >= 0) {
            return new oyo(iGlGetAttribLocation);
        }
        Log.e(f39247a, "Could not find attribute named ".concat(str));
        return null;
    }
}
