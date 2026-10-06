package p000;

import android.opengl.GLES20;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class lco implements lcs {

    /* JADX INFO: renamed from: a */
    final /* synthetic */ String f37932a;

    /* JADX INFO: renamed from: b */
    final /* synthetic */ float f37933b;

    /* JADX INFO: renamed from: c */
    final /* synthetic */ float f37934c;

    public lco(String str, float f, float f2) {
        this.f37932a = str;
        this.f37933b = f;
        this.f37934c = f2;
    }

    @Override // p000.lcs
    /* JADX INFO: renamed from: a */
    public final void mo15168a(lds ldsVar) {
        GLES20.glUniform2f(ldsVar.m15210b(this.f37932a), this.f37933b, this.f37934c);
    }
}
