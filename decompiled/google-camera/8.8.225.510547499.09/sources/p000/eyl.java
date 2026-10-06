package p000;

import android.opengl.GLES20;
import com.google.android.apps.camera.smarts.ScBZ.IuyLAqNmW;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class eyl extends ewz {

    /* JADX INFO: renamed from: e */
    private int f20985e;

    public eyl() {
        this.f20985e = 0;
        int iA = m7964a("uniform mat4 uMvpMatrix;                   \nattribute vec4 aPosition;                   \nattribute vec2 aTextureCoord;               \nvarying vec2 vTexCoord;                     \nvoid main()                                 \n{                                           \n   gl_Position = uMvpMatrix * aPosition;    \n   vTexCoord = aTextureCoord;               \n}                                           \n", "precision highp float;                            \nuniform float uAlphaFactor;                         \nvarying vec2 vTexCoord;                             \nuniform sampler2D sTexture;                         \nvoid main()                                         \n{                                                   \n  vec4 texcolor;                                    \n  texcolor = texture2D( sTexture, vTexCoord );      \n  texcolor.a = uAlphaFactor;                        \n  gl_FragColor = texcolor;                          \n}                                                   \n");
        this.f20708d = iA;
        this.f20705a = m7966h(iA, "aPosition");
        this.f20706b = m7966h(this.f20708d, IuyLAqNmW.HcAKcwDYAPqDJ);
        this.f20707c = m7967i(this.f20708d, "uMvpMatrix");
        this.f20985e = m7967i(this.f20708d, "uAlphaFactor");
        m7968c();
        GLES20.glUniform1f(this.f20985e, 0.9f);
    }

    /* JADX INFO: renamed from: j */
    public final void m8049j(float f) {
        GLES20.glUniform1f(this.f20985e, f);
    }
}
