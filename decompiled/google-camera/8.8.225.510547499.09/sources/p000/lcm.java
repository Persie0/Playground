package p000;

import android.opengl.GLES20;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class lcm implements lcs {

    /* JADX INFO: renamed from: a */
    final /* synthetic */ String f37928a = "weightLen";

    /* JADX INFO: renamed from: b */
    final /* synthetic */ int f37929b;

    public lcm(int i) {
        this.f37929b = i;
    }

    @Override // p000.lcs
    /* JADX INFO: renamed from: a */
    public final void mo15168a(lds ldsVar) {
        GLES20.glUniform1i(ldsVar.m15210b(this.f37928a), this.f37929b);
    }
}
