package p000;

import android.view.KeyEvent;

/* JADX INFO: loaded from: classes.dex */
public final class hi4 extends d16 implements gi4 {

    /* JADX INFO: renamed from: J */
    public vi3 f42402J;

    /* JADX INFO: renamed from: K */
    public vi3 f42403K;

    @Override // p000.gi4
    /* JADX INFO: renamed from: I */
    public final boolean mo788I(KeyEvent keyEvent) {
        vi3 vi3Var = this.f42402J;
        if (vi3Var != null) {
            return ((Boolean) vi3Var.invoke(bi4.m3728a(keyEvent))).booleanValue();
        }
        return false;
    }

    @Override // p000.gi4
    /* JADX INFO: renamed from: n */
    public final boolean mo801n(KeyEvent keyEvent) {
        vi3 vi3Var = this.f42403K;
        if (vi3Var != null) {
            return ((Boolean) vi3Var.invoke(bi4.m3728a(keyEvent))).booleanValue();
        }
        return false;
    }
}
