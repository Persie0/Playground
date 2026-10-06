package p000;

import android.opengl.GLES20;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class exa extends ewz {

    /* JADX INFO: renamed from: e */
    private final int f20710e;

    public exa() {
        int iA = m7964a("uniform mat4 uMvpMatrix;                   \nattribute vec4 aPosition;                   \nvoid main()                                 \n{                                           \n   gl_Position = uMvpMatrix * aPosition;    \n   gl_PointSize = 5.5;                      \n}                                           \n", "precision mediump float;                       \nuniform vec4 uDrawColor;                       \nvoid main()                                    \n{                                              \n  gl_FragColor = uDrawColor;                   \n}                                              \n");
        this.f20708d = iA;
        this.f20705a = m7966h(iA, "aPosition");
        this.f20707c = m7967i(this.f20708d, "uMvpMatrix");
        this.f20710e = m7967i(this.f20708d, "uDrawColor");
    }

    /* JADX INFO: renamed from: j */
    public final void m7973j(float[] fArr) {
        m7968c();
        GLES20.glUniform4f(this.f20710e, fArr[0], fArr[1], fArr[2], fArr[3]);
    }
}
