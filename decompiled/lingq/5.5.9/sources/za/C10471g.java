package za;

import android.opengl.GLES20;
import android.util.Log;
import com.google.android.exoplayer2.util.C2531b;
import com.google.android.exoplayer2.util.GlUtil;
import java.nio.FloatBuffer;

/* JADX INFO: renamed from: za.g */
/* JADX INFO: loaded from: classes.dex */
public final class C10471g {

    /* JADX INFO: renamed from: i */
    public static final float[] f52356i = {1.0f, 0.0f, 0.0f, 0.0f, -1.0f, 0.0f, 0.0f, 1.0f, 1.0f};

    /* JADX INFO: renamed from: j */
    public static final float[] f52357j = {1.0f, 0.0f, 0.0f, 0.0f, -0.5f, 0.0f, 0.0f, 0.5f, 1.0f};

    /* JADX INFO: renamed from: k */
    public static final float[] f52358k = {0.5f, 0.0f, 0.0f, 0.0f, -1.0f, 0.0f, 0.0f, 1.0f, 1.0f};

    /* JADX INFO: renamed from: a */
    public int f52359a;

    /* JADX INFO: renamed from: b */
    public a f52360b;

    /* JADX INFO: renamed from: c */
    public C2531b f52361c;

    /* JADX INFO: renamed from: d */
    public int f52362d;

    /* JADX INFO: renamed from: e */
    public int f52363e;

    /* JADX INFO: renamed from: f */
    public int f52364f;

    /* JADX INFO: renamed from: g */
    public int f52365g;

    /* JADX INFO: renamed from: h */
    public int f52366h;

    /* JADX INFO: renamed from: za.g$a */
    public static class a {

        /* JADX INFO: renamed from: a */
        public final int f52367a;

        /* JADX INFO: renamed from: b */
        public final FloatBuffer f52368b;

        /* JADX INFO: renamed from: c */
        public final FloatBuffer f52369c;

        /* JADX INFO: renamed from: d */
        public final int f52370d;

        public a(C10469e.b bVar) {
            float[] fArr = bVar.f52354c;
            this.f52367a = fArr.length / 3;
            this.f52368b = GlUtil.m7478d(fArr);
            this.f52369c = GlUtil.m7478d(bVar.f52355d);
            int i10 = bVar.f52353b;
            if (i10 == 1) {
                this.f52370d = 5;
            } else if (i10 != 2) {
                this.f52370d = 4;
            } else {
                this.f52370d = 6;
            }
        }
    }

    /* JADX INFO: renamed from: b */
    public static boolean m19422b(C10469e c10469e) {
        C10469e.b[] bVarArr = c10469e.f52347a.f52351a;
        if (bVarArr.length != 1 || bVarArr[0].f52352a != 0) {
            return false;
        }
        C10469e.b[] bVarArr2 = c10469e.f52348b.f52351a;
        return bVarArr2.length == 1 && bVarArr2[0].f52352a == 0;
    }

    /* JADX INFO: renamed from: a */
    public final void m19423a() {
        try {
            C2531b c2531b = new C2531b("uniform mat4 uMvpMatrix;\nuniform mat3 uTexMatrix;\nattribute vec4 aPosition;\nattribute vec2 aTexCoords;\nvarying vec2 vTexCoords;\n// Standard transformation.\nvoid main() {\n  gl_Position = uMvpMatrix * aPosition;\n  vTexCoords = (uTexMatrix * vec3(aTexCoords, 1)).xy;\n}\n", "// This is required since the texture data is GL_TEXTURE_EXTERNAL_OES.\n#extension GL_OES_EGL_image_external : require\nprecision mediump float;\n// Standard texture rendering shader.\nuniform samplerExternalOES uTexture;\nvarying vec2 vTexCoords;\nvoid main() {\n  gl_FragColor = texture2D(uTexture, vTexCoords);\n}\n");
            this.f52361c = c2531b;
            this.f52362d = GLES20.glGetUniformLocation(c2531b.f13749a, "uMvpMatrix");
            this.f52363e = GLES20.glGetUniformLocation(this.f52361c.f13749a, "uTexMatrix");
            this.f52364f = this.f52361c.m7481b("aPosition");
            this.f52365g = this.f52361c.m7481b("aTexCoords");
            this.f52366h = GLES20.glGetUniformLocation(this.f52361c.f13749a, "uTexture");
        } catch (GlUtil.GlException e10) {
            Log.e("ProjectionRenderer", "Failed to initialize the program", e10);
        }
    }
}
