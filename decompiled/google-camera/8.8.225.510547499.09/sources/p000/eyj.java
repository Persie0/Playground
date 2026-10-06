package p000;

import android.opengl.GLES20;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class eyj extends ewz {

    /* JADX INFO: renamed from: e */
    private int f20982e;

    public eyj() {
        this.f20982e = 0;
        int iA = m7964a("uniform mat4 uMvpMatrix;                   \nattribute vec4 aPosition;                   \nattribute vec2 aTextureCoord;               \nvarying vec2 vTexCoord;                     \nvoid main()                                 \n{                                           \n   gl_Position = uMvpMatrix * aPosition;    \n   vTexCoord = aTextureCoord;               \n}                                           \n", "precision mediump float;                            \nuniform float uAlphaFactor;                         \nvarying vec2 vTexCoord;                             \nuniform sampler2D sTexture;                         \nvoid main()                                         \n{                                                   \n  gl_FragColor = texture2D( sTexture, vTexCoord);   \n  gl_FragColor.a = gl_FragColor.a * uAlphaFactor;   \n}                                                   \n");
        this.f20708d = iA;
        this.f20705a = m7966h(iA, "aPosition");
        this.f20706b = m7966h(this.f20708d, "aTextureCoord");
        this.f20707c = m7967i(this.f20708d, "uMvpMatrix");
        this.f20982e = m7967i(this.f20708d, "uAlphaFactor");
        m7968c();
        GLES20.glUniform1f(this.f20982e, 1.0f);
    }

    /* JADX INFO: renamed from: j */
    public final void m8047j(float f) {
        GLES20.glUniform1f(this.f20982e, f);
    }
}
