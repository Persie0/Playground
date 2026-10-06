package p000;

import android.opengl.GLES20;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class eyk extends ewz {

    /* JADX INFO: renamed from: e */
    public final int f20983e;

    /* JADX INFO: renamed from: f */
    private final int f20984f;

    public eyk() {
        int iA = m7964a("uniform mat4 uMvpMatrix;                   \nattribute vec4 aPosition;                   \nattribute vec2 aTextureCoord;               \nvarying vec2 vTexCoord;                     \nvoid main()                                 \n{                                           \n   gl_Position = uMvpMatrix * aPosition;    \n   vTexCoord = aTextureCoord;               \n}                                           \n", "precision mediump float;                            \nuniform float uBrightness;                          \nuniform float uAlpha;                               \nvarying vec2 vTexCoord;                             \nuniform sampler2D sTexture;                         \nvoid main()                                         \n{                                                   \n  gl_FragColor = texture2D( sTexture, vTexCoord);   \n  gl_FragColor.rgb *= uBrightness * uAlpha;         \n  gl_FragColor.a = gl_FragColor.a * uAlpha;         \n}                                                   \n");
        this.f20708d = iA;
        this.f20705a = m7966h(iA, "aPosition");
        this.f20706b = m7966h(this.f20708d, "aTextureCoord");
        this.f20707c = m7967i(this.f20708d, "uMvpMatrix");
        int i = m7967i(this.f20708d, "uBrightness");
        this.f20983e = i;
        int i2 = m7967i(this.f20708d, "uAlpha");
        this.f20984f = i2;
        m7968c();
        GLES20.glUniform1f(i, 0.5f);
        GLES20.glUniform1f(i2, 0.5f);
    }

    /* JADX INFO: renamed from: j */
    public final void m8048j(float f) {
        GLES20.glUniform1f(this.f20984f, f);
    }
}
