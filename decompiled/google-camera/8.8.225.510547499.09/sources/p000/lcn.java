package p000;

import android.opengl.GLES20;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class lcn implements lcs {

    /* JADX INFO: renamed from: a */
    final /* synthetic */ String f37930a;

    /* JADX INFO: renamed from: b */
    final /* synthetic */ float f37931b;

    public lcn(String str, float f) {
        this.f37930a = str;
        this.f37931b = f;
    }

    @Override // p000.lcs
    /* JADX INFO: renamed from: a */
    public final void mo15168a(lds ldsVar) {
        GLES20.glUniform1f(ldsVar.m15210b(this.f37930a), this.f37931b);
    }
}
