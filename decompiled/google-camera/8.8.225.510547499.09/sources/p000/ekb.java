package p000;

import android.opengl.GLES20;
import com.google.android.libraries.vision.opengl.Texture;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class ekb implements ejc {

    /* JADX INFO: renamed from: a */
    public final elt f14439a;

    /* JADX INFO: renamed from: b */
    private final ejd f14440b;

    /* JADX INFO: renamed from: c */
    private final elr f14441c;

    /* JADX INFO: renamed from: d */
    private final elq f14442d;

    /* JADX INFO: renamed from: e */
    private final float[] f14443e = {0.0f, 0.0f, 0.0f, 0.5f, 0.0f, 0.0f, 0.0f, 0.5f, 0.0f, 0.0f, 0.0f, 0.5f, 0.0f, 0.0f, 0.0f, 0.5f};

    /* JADX INFO: renamed from: f */
    private final float[] f14444f = new float[8];

    public ekb(Texture texture, ejd ejdVar) {
        this.f14440b = ejdVar;
        elt eltVar = new elt();
        this.f14439a = eltVar;
        eltVar.f14651b = texture;
        eltVar.f14652c = 33069;
        this.f14441c = new elr();
        this.f14442d = new elq();
    }

    @Override // p000.ejc
    /* JADX INFO: renamed from: a */
    public final void mo7390a() {
        this.f14439a.m7473a();
        this.f14441c.m7468a();
        this.f14442d.m7464a();
    }

    @Override // p000.ejc
    /* JADX INFO: renamed from: b */
    public final void mo7391b() {
        ejd ejdVar = this.f14440b;
        GLES20.glViewport(0, 0, ejdVar.f14314j, ejdVar.f14315k);
        GLES20.glClear(16384);
        this.f14439a.m7474b();
        GLES20.glEnable(3042);
        GLES20.glBlendFunc(770, 771);
        this.f14441c.m7472e(this.f14443e);
        elr elrVar = this.f14441c;
        float f = this.f14440b.f14305a;
        elrVar.m7471d(-f, 1.0f, f, -1.0f);
        this.f14441c.m7469b();
        GLES20.glDisable(3042);
        ejd ejdVar2 = this.f14440b;
        if (!ejdVar2.f14318n) {
            int i = ejdVar2.f14314j;
            int i2 = ejdVar2.f14315k;
            GLES20.glViewport(i / 4, i2 / 4, i / 2, i2 / 2);
            ejd ejdVar3 = this.f14440b;
            if (ejdVar3.f14312h) {
                int i3 = ejdVar3.f14314j;
                ejdVar3.getClass();
                int i4 = ejdVar3.f14315k;
                ejdVar3.getClass();
                GLES20.glScissor((int) ((i3 / 4) * 1.1f), i4 / 4, (int) ((i3 / 2) * 0.9f), i4 / 2);
            } else {
                int i5 = ejdVar3.f14314j;
                int i6 = ejdVar3.f14315k;
                ejdVar3.getClass();
                ejdVar3.getClass();
                GLES20.glScissor(i5 / 4, (int) ((i6 / 4) * 1.1f), i5 / 2, (int) ((i6 / 2) * 0.9f));
            }
            GLES20.glEnable(3089);
            this.f14439a.m7474b();
            GLES20.glDisable(3089);
        }
        ejd ejdVar4 = this.f14440b;
        GLES20.glViewport(0, 0, ejdVar4.f14314j, ejdVar4.f14315k);
        ejd ejdVar5 = this.f14440b;
        if (ejdVar5.f14312h) {
            float f2 = ejdVar5.f14308d / 2.0f;
            float[] fArr = this.f14444f;
            float f3 = -f2;
            fArr[0] = f3;
            fArr[1] = 1.0f;
            fArr[2] = f3;
            fArr[3] = -1.0f;
            fArr[4] = f2;
            fArr[5] = 1.0f;
            fArr[6] = f2;
            fArr[7] = -1.0f;
        } else {
            float f4 = ejdVar5.f14309e / 2.0f;
            float[] fArr2 = this.f14444f;
            float f5 = ejdVar5.f14305a;
            float f6 = -f5;
            fArr2[0] = f6;
            fArr2[1] = f4;
            fArr2[2] = f5;
            fArr2[3] = f4;
            fArr2[4] = f6;
            float f7 = -f4;
            fArr2[5] = f7;
            fArr2[6] = f5;
            fArr2[7] = f7;
        }
        this.f14442d.m7466c(this.f14444f, 2.0f);
        this.f14442d.m7465b();
    }

    @Override // p000.ejc
    /* JADX INFO: renamed from: c */
    public final void mo7392c(int i, int i2) {
        float f = i;
        float f2 = i2;
        this.f14441c.m7470c(f, f2);
        this.f14442d.m7467d(f, f2);
    }
}
