package p000;

import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.foundation.lazy.C0127b;

/* JADX INFO: loaded from: classes.dex */
public final class tu4 implements pt4 {

    /* JADX INFO: renamed from: a */
    public final C0127b f62884a;

    public tu4(C0127b c0127b) {
        this.f62884a = c0127b;
    }

    @Override // p000.pt4
    /* JADX INFO: renamed from: a */
    public final int mo11505a() {
        return this.f62884a.m980j().f42988n;
    }

    @Override // p000.pt4
    /* JADX INFO: renamed from: b */
    public final int mo11506b() {
        return Math.min(mo11505a() - 1, ((iv4) u91.m22597O0(this.f62884a.m980j().f42985k)).f44648a);
    }

    @Override // p000.pt4
    /* JADX INFO: renamed from: c */
    public final int mo11507c() {
        int i;
        C0127b c0127b = this.f62884a;
        if (c0127b.m980j().f42985k.isEmpty()) {
            return 0;
        }
        hv4 hv4VarM980j = c0127b.m980j();
        int iM13486g = (int) (hv4VarM980j.f42989o == Orientation.Vertical ? hv4VarM980j.m13486g() & 4294967295L : hv4VarM980j.m13486g() >> 32);
        int iM22039D = thb.m22039D(c0127b.m980j());
        if (iM22039D != 0 && (i = iM13486g / iM22039D) >= 1) {
            return i;
        }
        return 1;
    }

    @Override // p000.pt4
    /* JADX INFO: renamed from: d */
    public final boolean mo11508d() {
        return !this.f62884a.m980j().f42985k.isEmpty();
    }

    @Override // p000.pt4
    /* JADX INFO: renamed from: e */
    public final int mo11509e() {
        return Math.max(0, this.f62884a.m978h());
    }
}
