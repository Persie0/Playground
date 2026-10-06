package p000;

import android.opengl.GLES20;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class lck implements lcs {

    /* JADX INFO: renamed from: a */
    final /* synthetic */ String f37924a;

    /* JADX INFO: renamed from: b */
    final /* synthetic */ float[] f37925b;

    /* JADX INFO: renamed from: c */
    private final /* synthetic */ int f37926c;

    public lck(String str, float[] fArr, int i) {
        this.f37926c = i;
        this.f37924a = str;
        this.f37925b = fArr;
    }

    public lck(float[] fArr, int i) {
        this.f37926c = i;
        this.f37924a = "uTransform";
        this.f37925b = fArr;
    }

    @Override // p000.lcs
    /* JADX INFO: renamed from: a */
    public final void mo15168a(lds ldsVar) {
        switch (this.f37926c) {
            case 0:
                GLES20.glUniform1fv(ldsVar.m15210b(this.f37924a), 128, this.f37925b, 0);
                break;
            default:
                GLES20.glUniformMatrix4fv(ldsVar.m15210b(this.f37924a), 1, false, this.f37925b, 0);
                break;
        }
    }
}
