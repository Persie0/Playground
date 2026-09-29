package com.google.android.exoplayer2.util;

import android.opengl.GLES20;
import java.util.HashMap;

/* JADX INFO: renamed from: com.google.android.exoplayer2.util.b */
/* JADX INFO: loaded from: classes.dex */
public final class C2531b {

    /* JADX INFO: renamed from: a */
    public final int f13749a;

    /* JADX INFO: renamed from: b */
    public final a[] f13750b;

    /* JADX INFO: renamed from: c */
    public final b[] f13751c;

    /* JADX INFO: renamed from: d */
    public final HashMap f13752d;

    /* JADX INFO: renamed from: e */
    public final HashMap f13753e;

    /* JADX INFO: renamed from: com.google.android.exoplayer2.util.b$a */
    public static final class a {
        public a(String str) {
        }
    }

    /* JADX INFO: renamed from: com.google.android.exoplayer2.util.b$b */
    public static final class b {
        public b(String str) {
        }
    }

    public C2531b(String str, String str2) throws GlUtil.GlException {
        byte[] bArr;
        byte[] bArr2;
        int iGlCreateProgram = GLES20.glCreateProgram();
        this.f13749a = iGlCreateProgram;
        GlUtil.m7476b();
        m7480a(str, iGlCreateProgram, 35633);
        m7480a(str2, iGlCreateProgram, 35632);
        GLES20.glLinkProgram(iGlCreateProgram);
        int i10 = 1;
        int[] iArr = {0};
        GLES20.glGetProgramiv(iGlCreateProgram, 35714, iArr, 0);
        GlUtil.m7477c("Unable to link shader program: \n" + GLES20.glGetProgramInfoLog(iGlCreateProgram), iArr[0] == 1);
        GLES20.glUseProgram(iGlCreateProgram);
        this.f13752d = new HashMap();
        int[] iArr2 = new int[1];
        GLES20.glGetProgramiv(iGlCreateProgram, 35721, iArr2, 0);
        this.f13750b = new a[iArr2[0]];
        int i11 = 0;
        while (i11 < iArr2[0]) {
            int i12 = this.f13749a;
            int[] iArr3 = new int[i10];
            GLES20.glGetProgramiv(i12, 35722, iArr3, 0);
            int i13 = iArr3[0];
            byte[] bArr3 = new byte[i13];
            GLES20.glGetActiveAttrib(i12, i11, i13, new int[i10], 0, new int[i10], 0, new int[i10], 0, bArr3, 0);
            int i14 = 0;
            while (true) {
                if (i14 >= i13) {
                    bArr2 = bArr3;
                    i14 = i13;
                    break;
                } else {
                    bArr2 = bArr3;
                    if (bArr2[i14] == 0) {
                        break;
                    }
                    i14++;
                    bArr3 = bArr2;
                }
            }
            String str3 = new String(bArr2, 0, i14);
            GLES20.glGetAttribLocation(i12, str3);
            a aVar = new a(str3);
            this.f13750b[i11] = aVar;
            this.f13752d.put(str3, aVar);
            i11++;
            i10 = 1;
        }
        this.f13753e = new HashMap();
        int i15 = 1;
        int[] iArr4 = new int[1];
        GLES20.glGetProgramiv(this.f13749a, 35718, iArr4, 0);
        this.f13751c = new b[iArr4[0]];
        int i16 = 0;
        while (i16 < iArr4[0]) {
            int i17 = this.f13749a;
            int[] iArr5 = new int[i15];
            GLES20.glGetProgramiv(i17, 35719, iArr5, 0);
            int i18 = iArr5[0];
            byte[] bArr4 = new byte[i18];
            GLES20.glGetActiveUniform(i17, i16, i18, new int[i15], 0, new int[i15], 0, new int[i15], 0, bArr4, 0);
            int i19 = 0;
            while (true) {
                if (i19 >= i18) {
                    bArr = bArr4;
                    i19 = i18;
                    break;
                } else {
                    bArr = bArr4;
                    if (bArr[i19] == 0) {
                        break;
                    }
                    i19++;
                    bArr4 = bArr;
                }
            }
            String str4 = new String(bArr, 0, i19);
            GLES20.glGetUniformLocation(i17, str4);
            b bVar = new b(str4);
            this.f13751c[i16] = bVar;
            this.f13753e.put(str4, bVar);
            i16++;
            i15 = 1;
        }
        GlUtil.m7476b();
    }

    /* JADX INFO: renamed from: a */
    public static void m7480a(String str, int i10, int i11) throws GlUtil.GlException {
        int iGlCreateShader = GLES20.glCreateShader(i11);
        GLES20.glShaderSource(iGlCreateShader, str);
        GLES20.glCompileShader(iGlCreateShader);
        boolean z10 = true;
        int[] iArr = {0};
        GLES20.glGetShaderiv(iGlCreateShader, 35713, iArr, 0);
        if (iArr[0] != 1) {
            z10 = false;
        }
        GlUtil.m7477c(GLES20.glGetShaderInfoLog(iGlCreateShader) + ", source: " + str, z10);
        GLES20.glAttachShader(i10, iGlCreateShader);
        GLES20.glDeleteShader(iGlCreateShader);
        GlUtil.m7476b();
    }

    /* JADX INFO: renamed from: b */
    public final int m7481b(String str) throws GlUtil.GlException {
        int iGlGetAttribLocation = GLES20.glGetAttribLocation(this.f13749a, str);
        GLES20.glEnableVertexAttribArray(iGlGetAttribLocation);
        GlUtil.m7476b();
        return iGlGetAttribLocation;
    }
}
