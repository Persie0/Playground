package p000;

import android.opengl.GLES20;
import android.opengl.Matrix;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class ejn implements ejc {

    /* JADX INFO: renamed from: a */
    private final float[] f14343a = new float[16];

    /* JADX INFO: renamed from: b */
    private final float[] f14344b = {1.0f, 1.0f, 1.0f, 1.0f};

    /* JADX INFO: renamed from: c */
    private els f14345c = new els();

    /* JADX INFO: renamed from: d */
    private final ejd f14346d;

    public ejn(ejd ejdVar) {
        this.f14346d = ejdVar;
    }

    @Override // p000.ejc
    /* JADX INFO: renamed from: a */
    public final void mo7390a() {
        els elsVar = this.f14345c;
        if (elsVar != null) {
            luq luqVar = elsVar.f14645f;
            if (luqVar != null) {
                luqVar.m16023b();
                elsVar.f14645f = null;
            }
            this.f14345c = null;
        }
    }

    @Override // p000.ejc
    /* JADX INFO: renamed from: b */
    public final void mo7391b() {
        if (this.f14345c == null || !this.f14346d.f14318n) {
            return;
        }
        GLES20.glEnable(3042);
        GLES20.glBlendFunc(770, 771);
        float[] fArr = this.f14346d.f14313i;
        float f = fArr[0];
        float f2 = fArr[1];
        float f3 = fArr[2];
        float[] fArr2 = this.f14344b;
        fArr2[0] = f;
        fArr2[1] = f2;
        fArr2[2] = f3;
        Matrix.setIdentityM(this.f14343a, 0);
        float[] fArr3 = this.f14343a;
        ejd ejdVar = this.f14346d;
        Matrix.translateM(fArr3, 0, ejdVar.f14306b, ejdVar.f14307c, 0.0f);
        float[] fArr4 = this.f14343a;
        Matrix.multiplyMM(fArr4, 0, fArr4, 0, this.f14346d.f14310f, 0);
        els elsVar = this.f14345c;
        elsVar.getClass();
        ejd ejdVar2 = this.f14346d;
        float f4 = ejdVar2.f14308d;
        float f5 = -f4;
        float f6 = ejdVar2.f14309e;
        float f7 = f6 / 2.0f;
        float f8 = f4 / 2.0f;
        float[] fArr5 = els.f14640a;
        float f9 = f5 / 2.0f;
        fArr5[0] = f9;
        fArr5[1] = f7;
        fArr5[2] = f9;
        float f10 = f7 - 0.01f;
        fArr5[3] = f10;
        fArr5[4] = f8;
        fArr5[5] = f10;
        fArr5[6] = f9;
        fArr5[7] = f7;
        fArr5[8] = f8;
        fArr5[9] = f10;
        fArr5[10] = f8;
        fArr5[11] = f7;
        fArr5[12] = f9;
        float f11 = (-f6) / 2.0f;
        float f12 = f11 + 0.01f;
        float f13 = (-0.01f) + f8;
        float f14 = 0.01f + f9;
        fArr5[13] = f10;
        fArr5[14] = f9;
        fArr5[15] = f12;
        fArr5[16] = f14;
        fArr5[17] = f10;
        fArr5[18] = f14;
        fArr5[19] = f10;
        fArr5[20] = f9;
        fArr5[21] = f12;
        fArr5[22] = f14;
        fArr5[23] = f12;
        fArr5[24] = f13;
        fArr5[25] = f10;
        fArr5[26] = f13;
        fArr5[27] = f12;
        fArr5[28] = f8;
        fArr5[29] = f10;
        fArr5[30] = f8;
        fArr5[31] = f10;
        fArr5[32] = f13;
        fArr5[33] = f12;
        fArr5[34] = f8;
        fArr5[35] = f12;
        fArr5[36] = f9;
        fArr5[37] = f12;
        fArr5[38] = f9;
        fArr5[39] = f11;
        fArr5[40] = f8;
        fArr5[41] = f11;
        fArr5[42] = f9;
        fArr5[43] = f12;
        fArr5[44] = f8;
        fArr5[45] = f11;
        fArr5[46] = f8;
        fArr5[47] = f12;
        elsVar.f14641b = lle.m15690j(fArr5);
        els elsVar2 = this.f14345c;
        elsVar2.getClass();
        System.arraycopy(this.f14343a, 0, elsVar2.f14642c, 0, 16);
        els elsVar3 = this.f14345c;
        elsVar3.getClass();
        System.arraycopy(this.f14344b, 0, elsVar3.f14644e, 0, 4);
        els elsVar4 = this.f14345c;
        elsVar4.getClass();
        if (elsVar4.f14645f == null) {
            elsVar4.f14645f = new luq("attribute vec2 vertexAttrib;uniform mat4 projectionMatrix;uniform mat4 vertexTransform;void main() {  gl_Position = projectionMatrix * vertexTransform * vec4(vertexAttrib, 0., 1.);}", "precision mediump float;uniform vec4 fillColor;void main() {  gl_FragColor = fillColor;}");
            elsVar4.f14646g = elsVar4.f14645f.m16025d("vertexTransform");
            elsVar4.f14647h = elsVar4.f14645f.m16025d("projectionMatrix");
            elsVar4.f14648i = elsVar4.f14645f.m16025d("fillColor");
            elsVar4.f14649j = elsVar4.f14645f.m16026e("vertexAttrib");
        }
        luq luqVar = elsVar4.f14645f;
        luqVar.getClass();
        luqVar.m16022a();
        elsVar4.f14649j.m19201e();
        elsVar4.f14649j.m19202f(elsVar4.f14641b, 2);
        elsVar4.f14646g.m19197a(elsVar4.f14642c);
        elsVar4.f14647h.m19197a(elsVar4.f14643d);
        elsVar4.f14648i.m19198b(elsVar4.f14644e);
        GLES20.glDrawArrays(4, 0, elsVar4.f14641b.capacity() / 2);
        elsVar4.f14649j.m19200d();
        luqVar.m16024c();
    }

    @Override // p000.ejc
    /* JADX INFO: renamed from: c */
    public final void mo7392c(int i, int i2) {
        els elsVar = this.f14345c;
        if (elsVar != null) {
            float f = i / i2;
            Matrix.orthoM(elsVar.f14643d, 0, -f, f, -1.0f, 1.0f, -1.0f, 1.0f);
        }
    }
}
