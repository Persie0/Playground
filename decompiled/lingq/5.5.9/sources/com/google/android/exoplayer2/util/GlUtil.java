package com.google.android.exoplayer2.util;

import android.opengl.GLES20;
import android.opengl.GLU;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.FloatBuffer;

/* JADX INFO: loaded from: classes.dex */
public final class GlUtil {

    public static final class GlException extends Exception {
        public GlException(String str) {
            super(str);
        }
    }

    /* JADX INFO: renamed from: a */
    public static void m7475a(int i10, int i11) throws GlException {
        GLES20.glBindTexture(i10, i11);
        m7476b();
        GLES20.glTexParameteri(i10, 10240, 9729);
        m7476b();
        GLES20.glTexParameteri(i10, 10241, 9729);
        m7476b();
        GLES20.glTexParameteri(i10, 10242, 33071);
        m7476b();
        GLES20.glTexParameteri(i10, 10243, 33071);
        m7476b();
    }

    /* JADX INFO: renamed from: b */
    public static void m7476b() throws GlException {
        boolean z10;
        StringBuilder sb2 = new StringBuilder();
        boolean z11 = false;
        while (true) {
            z10 = z11;
            int iGlGetError = GLES20.glGetError();
            if (iGlGetError == 0) {
                break;
            }
            if (z10) {
                sb2.append('\n');
            }
            sb2.append("glError: ");
            sb2.append(GLU.gluErrorString(iGlGetError));
            z11 = true;
        }
        if (z10) {
            throw new GlException(sb2.toString());
        }
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    /* JADX INFO: renamed from: c */
    public static void m7477c(String str, boolean z10) throws GlException {
        if (!z10) {
            throw new GlException(str);
        }
    }

    /* JADX INFO: renamed from: d */
    public static FloatBuffer m7478d(float[] fArr) {
        return (FloatBuffer) ByteBuffer.allocateDirect(fArr.length * 4).order(ByteOrder.nativeOrder()).asFloatBuffer().put(fArr).flip();
    }
}
