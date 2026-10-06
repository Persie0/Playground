package p000;

import android.opengl.GLES20;
import android.opengl.Matrix;
import com.google.android.libraries.vision.opengl.Texture;
import java.nio.FloatBuffer;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class elt {

    /* JADX INFO: renamed from: a */
    public FloatBuffer f14650a;

    /* JADX INFO: renamed from: b */
    public Texture f14651b = null;

    /* JADX INFO: renamed from: c */
    public int f14652c = 33071;

    /* JADX INFO: renamed from: d */
    public boolean f14653d = false;

    /* JADX INFO: renamed from: e */
    public final float[] f14654e = {1.0f, 1.0f, 1.0f, 1.0f};

    /* JADX INFO: renamed from: f */
    private final float[] f14655f;

    /* JADX INFO: renamed from: g */
    private FloatBuffer f14656g;

    /* JADX INFO: renamed from: h */
    private final float[] f14657h;

    /* JADX INFO: renamed from: i */
    private final float[] f14658i;

    /* JADX INFO: renamed from: j */
    private final float[] f14659j;

    /* JADX INFO: renamed from: k */
    private final float[] f14660k;

    /* JADX INFO: renamed from: l */
    private luq f14661l;

    /* JADX INFO: renamed from: m */
    private oyo f14662m;

    /* JADX INFO: renamed from: n */
    private oyo f14663n;

    /* JADX INFO: renamed from: o */
    private oyo f14664o;

    /* JADX INFO: renamed from: p */
    private oyo f14665p;

    /* JADX INFO: renamed from: q */
    private oyo f14666q;

    /* JADX INFO: renamed from: r */
    private oyo f14667r;

    /* JADX INFO: renamed from: s */
    private oyo f14668s;

    /* JADX INFO: renamed from: t */
    private oyo f14669t;

    public elt() {
        float[] fArr = {-1.0f, 1.0f, -1.0f, -1.0f, 1.0f, 1.0f, 1.0f, -1.0f};
        this.f14655f = fArr;
        this.f14656g = lle.m15690j(fArr);
        float[] fArr2 = {0.0f, 1.0f, 0.0f, 0.0f, 1.0f, 1.0f, 1.0f, 0.0f};
        this.f14657h = fArr2;
        this.f14650a = lle.m15690j(fArr2);
        float[] fArr3 = new float[16];
        this.f14658i = fArr3;
        float[] fArr4 = new float[16];
        this.f14659j = fArr4;
        float[] fArr5 = new float[16];
        this.f14660k = fArr5;
        Matrix.setIdentityM(fArr3, 0);
        Matrix.setIdentityM(fArr4, 0);
        Matrix.setIdentityM(fArr5, 0);
    }

    /* JADX INFO: renamed from: a */
    public final void m7473a() {
        luq luqVar = this.f14661l;
        if (luqVar != null) {
            luqVar.m16023b();
            this.f14661l = null;
        }
    }

    /* JADX INFO: renamed from: b */
    public final void m7474b() {
        Texture texture = this.f14651b;
        if (texture == null) {
            return;
        }
        if (this.f14661l == null) {
            luq luqVar = new luq("attribute vec2 vertexAttrib;attribute vec2 texCoordAttrib;varying vec2 texCoord;uniform mat4 projectionMatrix;uniform mat4 vertexTransform;uniform mat4 textureTransform;void main() {  texCoord = (textureTransform * vec4(texCoordAttrib, 0., 1.)).xy;  gl_Position = projectionMatrix * vertexTransform * vec4(vertexAttrib, 0., 1.);}", texture.getType() == 36197 ? "#extension GL_OES_EGL_image_external : require \nprecision mediump float;uniform samplerExternalOES texture;uniform bool overrideColorActive;uniform vec4 overrideColor;varying vec2 texCoord;void main() {  vec4 texColor = texture2D(texture, texCoord);  gl_FragColor = (overrideColorActive && texColor.a > 0.01) ? overrideColor : texColor;}" : "precision mediump float;uniform sampler2D texture;uniform bool overrideColorActive;uniform vec4 overrideColor;varying vec2 texCoord;void main() {  vec4 texColor = texture2D(texture, texCoord);  gl_FragColor = (overrideColorActive && texColor.a > 0.01) ? overrideColor : texColor;}");
            this.f14661l = luqVar;
            this.f14664o = luqVar.m16025d("texture");
            this.f14662m = this.f14661l.m16025d("vertexTransform");
            this.f14663n = this.f14661l.m16025d("textureTransform");
            this.f14665p = this.f14661l.m16025d("projectionMatrix");
            this.f14666q = this.f14661l.m16025d("overrideColor");
            this.f14667r = this.f14661l.m16025d("overrideColorActive");
            this.f14668s = this.f14661l.m16026e("vertexAttrib");
            this.f14669t = this.f14661l.m16026e("texCoordAttrib");
        }
        luq luqVar2 = this.f14661l;
        luqVar2.getClass();
        luqVar2.m16022a();
        this.f14668s.m19201e();
        this.f14668s.m19202f(this.f14656g, 2);
        this.f14669t.m19201e();
        this.f14669t.m19202f(this.f14650a, 2);
        oyo oyoVar = this.f14664o;
        Texture texture2 = this.f14651b;
        texture2.getClass();
        oyoVar.m19199c(texture2);
        this.f14662m.m19197a(this.f14658i);
        this.f14665p.m19197a(this.f14660k);
        this.f14663n.m19197a(this.f14659j);
        GLES20.glUniform1i(this.f14667r.f46847a, this.f14653d ? 1 : 0);
        this.f14666q.m19198b(this.f14654e);
        GLES20.glTexParameteri(3553, 10242, this.f14652c);
        GLES20.glTexParameteri(3553, 10243, this.f14652c);
        GLES20.glDrawArrays(5, 0, this.f14656g.capacity() / 2);
        this.f14669t.m19200d();
        this.f14668s.m19200d();
        luqVar2.m16024c();
    }

    /* JADX INFO: renamed from: c */
    public final void m7475c(float f, float f2) {
        float f3 = f / f2;
        Matrix.orthoM(this.f14660k, 0, -f3, f3, -1.0f, 1.0f, -1.0f, 1.0f);
    }

    /* JADX INFO: renamed from: d */
    public final void m7476d(float f, float f2) {
        float f3 = f / 2.0f;
        float f4 = -f3;
        float[] fArr = this.f14655f;
        fArr[0] = f4;
        float f5 = f2 / 2.0f;
        fArr[1] = f5;
        fArr[2] = f4;
        float f6 = -f5;
        fArr[3] = f6;
        fArr[4] = f3;
        fArr[5] = f5;
        fArr[6] = f3;
        fArr[7] = f6;
        this.f14656g = lle.m15690j(fArr);
    }

    /* JADX INFO: renamed from: e */
    public final void m7477e(float[] fArr) {
        System.arraycopy(fArr, 0, this.f14659j, 0, 16);
    }

    /* JADX INFO: renamed from: f */
    public final void m7478f(float[] fArr) {
        System.arraycopy(fArr, 0, this.f14658i, 0, 16);
    }
}
