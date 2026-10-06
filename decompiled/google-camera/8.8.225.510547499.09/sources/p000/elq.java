package p000;

import android.opengl.GLES20;
import android.opengl.Matrix;
import com.google.android.apps.camera.util.p015ui.mfv.EArqVBjecl;
import java.nio.FloatBuffer;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class elq {

    /* JADX INFO: renamed from: b */
    private static final nbh f14618b = nbh.m17259h("com/google/android/apps/camera/imax/rendering/shaders/LineShader");

    /* JADX INFO: renamed from: d */
    private final float[] f14621d;

    /* JADX INFO: renamed from: f */
    private luq f14623f;

    /* JADX INFO: renamed from: h */
    private oyo f14625h;

    /* JADX INFO: renamed from: i */
    private oyo f14626i;

    /* JADX INFO: renamed from: j */
    private oyo f14627j;

    /* JADX INFO: renamed from: k */
    private oyo f14628k;

    /* JADX INFO: renamed from: c */
    private FloatBuffer f14620c = null;

    /* JADX INFO: renamed from: e */
    private final float[] f14622e = new float[16];

    /* JADX INFO: renamed from: a */
    public final float[] f14619a = {1.0f, 1.0f, 1.0f, 1.0f};

    /* JADX INFO: renamed from: g */
    private float f14624g = 1.0f;

    public elq() {
        float[] fArr = new float[16];
        this.f14621d = fArr;
        Matrix.setIdentityM(fArr, 0);
    }

    /* JADX INFO: renamed from: a */
    public final void m7464a() {
        luq luqVar = this.f14623f;
        if (luqVar != null) {
            luqVar.m16023b();
            this.f14623f = null;
        }
    }

    /* JADX INFO: renamed from: b */
    public final void m7465b() {
        if (this.f14623f == null) {
            luq luqVar = new luq("attribute vec2 vertexAttrib;uniform mat4 projectionMatrix;uniform mat4 vertexTransform;void main() {  gl_Position = projectionMatrix * vertexTransform * vec4(vertexAttrib, 0., 1.);}", EArqVBjecl.HCYQfxSCjzq);
            this.f14623f = luqVar;
            this.f14625h = luqVar.m16025d("vertexTransform");
            this.f14626i = this.f14623f.m16025d("projectionMatrix");
            this.f14627j = this.f14623f.m16025d("fillColor");
            this.f14628k = this.f14623f.m16026e("vertexAttrib");
        }
        if (this.f14620c == null) {
            return;
        }
        luq luqVar2 = this.f14623f;
        luqVar2.getClass();
        luqVar2.m16022a();
        this.f14628k.m19201e();
        this.f14628k.m19202f(this.f14620c, 2);
        this.f14625h.m19197a(this.f14621d);
        this.f14626i.m19197a(this.f14622e);
        this.f14627j.m19198b(this.f14619a);
        GLES20.glLineWidth(this.f14624g);
        GLES20.glDrawArrays(1, 0, this.f14620c.capacity() / 2);
        this.f14628k.m19200d();
        luqVar2.m16024c();
    }

    /* JADX INFO: renamed from: c */
    public final void m7466c(float[] fArr, float f) {
        if (fArr == null || (fArr.length & 3) != 0) {
            ((nbe) ((nbe) f14618b.m17251b()).mo17276G(1595)).mo17291p("Tried to draw a set of lines with %d floats", fArr.length);
            this.f14620c = null;
        } else {
            this.f14624g = f;
            this.f14620c = lle.m15690j(fArr);
        }
    }

    /* JADX INFO: renamed from: d */
    public final void m7467d(float f, float f2) {
        float f3 = f / f2;
        Matrix.orthoM(this.f14622e, 0, -f3, f3, -1.0f, 1.0f, -1.0f, 1.0f);
    }
}
