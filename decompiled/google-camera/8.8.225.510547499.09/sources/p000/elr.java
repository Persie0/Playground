package p000;

import android.opengl.GLES20;
import android.opengl.Matrix;
import com.google.android.apps.camera.p014ui.captureframe.Tjcw.gBCSQzBeB;
import com.google.android.apps.camera.zoomui.view.WdNM.xPAWq;
import com.google.android.material.snackbar.VMX.rgoX;
import java.nio.FloatBuffer;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class elr {

    /* JADX INFO: renamed from: a */
    public final float[] f14629a;

    /* JADX INFO: renamed from: b */
    private final float[] f14630b;

    /* JADX INFO: renamed from: c */
    private FloatBuffer f14631c;

    /* JADX INFO: renamed from: d */
    private final float[] f14632d;

    /* JADX INFO: renamed from: e */
    private FloatBuffer f14633e;

    /* JADX INFO: renamed from: f */
    private final float[] f14634f = new float[16];

    /* JADX INFO: renamed from: g */
    private luq f14635g;

    /* JADX INFO: renamed from: h */
    private oyo f14636h;

    /* JADX INFO: renamed from: i */
    private oyo f14637i;

    /* JADX INFO: renamed from: j */
    private oyo f14638j;

    /* JADX INFO: renamed from: k */
    private oyo f14639k;

    public elr() {
        float[] fArr = {-1.0f, 1.0f, -1.0f, -1.0f, 1.0f, 1.0f, 1.0f, -1.0f};
        this.f14630b = fArr;
        this.f14631c = lle.m15690j(fArr);
        float[] fArr2 = {0.0f, 0.0f, 0.0f, 0.5f, 0.0f, 0.0f, 0.0f, 0.5f, 0.0f, 0.0f, 0.0f, 0.5f, 0.0f, 0.0f, 0.0f, 0.5f};
        this.f14632d = fArr2;
        this.f14633e = lle.m15690j(fArr2);
        float[] fArr3 = new float[16];
        this.f14629a = fArr3;
        Matrix.setIdentityM(fArr3, 0);
    }

    /* JADX INFO: renamed from: a */
    public final void m7468a() {
        luq luqVar = this.f14635g;
        if (luqVar != null) {
            luqVar.m16023b();
            this.f14635g = null;
        }
    }

    /* JADX INFO: renamed from: b */
    public final void m7469b() {
        if (this.f14635g == null) {
            luq luqVar = new luq("attribute vec2 vertexAttrib;attribute vec4 vertexColorAttrib;varying vec4 vertexColor;uniform mat4 projectionMatrix;uniform mat4 vertexTransform;void main() {  vertexColor = vertexColorAttrib;  gl_Position = projectionMatrix * vertexTransform * vec4(vertexAttrib, 0., 1.);}", "precision mediump float;varying vec4 vertexColor;void main() {  gl_FragColor = vertexColor;}");
            this.f14635g = luqVar;
            this.f14636h = luqVar.m16025d(xPAWq.OtJLhjSBtd);
            this.f14637i = this.f14635g.m16025d("projectionMatrix");
            this.f14638j = this.f14635g.m16026e(gBCSQzBeB.rDr);
            this.f14639k = this.f14635g.m16026e(rgoX.KbQwWvEfCaCqouy);
        }
        luq luqVar2 = this.f14635g;
        luqVar2.getClass();
        luqVar2.m16022a();
        this.f14638j.m19201e();
        this.f14638j.m19202f(this.f14631c, 2);
        this.f14639k.m19201e();
        this.f14639k.m19202f(this.f14633e, 4);
        this.f14636h.m19197a(this.f14629a);
        this.f14637i.m19197a(this.f14634f);
        GLES20.glDrawArrays(5, 0, this.f14631c.capacity() / 2);
        this.f14639k.m19200d();
        this.f14638j.m19200d();
        luqVar2.m16024c();
    }

    /* JADX INFO: renamed from: c */
    public final void m7470c(float f, float f2) {
        float f3 = f / f2;
        Matrix.orthoM(this.f14634f, 0, -f3, f3, -1.0f, 1.0f, -1.0f, 1.0f);
    }

    /* JADX INFO: renamed from: d */
    public final void m7471d(float f, float f2, float f3, float f4) {
        float[] fArr = this.f14630b;
        fArr[0] = f;
        fArr[1] = f2;
        fArr[2] = f;
        fArr[3] = f4;
        fArr[4] = f3;
        fArr[5] = f2;
        fArr[6] = f3;
        fArr[7] = f4;
        this.f14631c = lle.m15690j(fArr);
    }

    /* JADX INFO: renamed from: e */
    public final void m7472e(float[] fArr) {
        this.f14633e = lle.m15690j(fArr);
    }
}
