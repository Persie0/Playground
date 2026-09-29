package p000;

import androidx.compose.foundation.text.contextmenu.modifier.C0174c;
import androidx.compose.foundation.text.contextmenu.modifier.ToolbarHandlerState;
import androidx.compose.runtime.AbstractC0278f;

/* JADX INFO: loaded from: classes.dex */
public final class qt9 extends fa2 implements tf1, dt9 {

    /* JADX INFO: renamed from: L */
    public C0174c f58192L;

    /* JADX INFO: renamed from: M */
    public vi3 f58193M;

    /* JADX INFO: renamed from: N */
    public vi3 f58194N;

    /* JADX INFO: renamed from: O */
    public vm1 f58195O;

    /* JADX INFO: renamed from: P */
    public pg9 f58196P;

    /* JADX INFO: renamed from: Q */
    public final gc2 f58197Q = AbstractC0278f.m1254d(new y47(this, 17));

    /* JADX INFO: renamed from: R */
    public e28 f58198R = e28.f36619e;

    public qt9(C0174c c0174c, vi3 vi3Var, vi3 vi3Var2, vm1 vm1Var) {
        this.f58192L = c0174c;
        this.f58193M = vi3Var;
        this.f58194N = vi3Var2;
        this.f58195O = vm1Var;
    }

    @Override // p000.d16
    /* JADX INFO: renamed from: R0 */
    public final void mo36R0() {
        C0174c c0174c = this.f58192L;
        c0174c.f2883b = ToolbarHandlerState.Attached;
        c0174c.f2882a = this;
    }

    @Override // p000.d16
    /* JADX INFO: renamed from: S0 */
    public final void mo37S0() {
        C0174c c0174c = this.f58192L;
        c0174c.f2883b = ToolbarHandlerState.Detached;
        c0174c.f2882a = null;
    }

    @Override // p000.dt9
    /* JADX INFO: renamed from: U */
    public final ct9 mo10627U() {
        return (ct9) this.f58197Q.getValue();
    }

    @Override // p000.dt9
    /* JADX INFO: renamed from: l */
    public final long mo10628l(aq4 aq4Var) {
        return mo10629p(aq4Var).m10805f();
    }

    @Override // p000.dt9
    /* JADX INFO: renamed from: p */
    public final e28 mo10629p(aq4 aq4Var) {
        e28 e28Var;
        if (this.f34836I && (e28Var = (e28) this.f58195O.invoke(aq4Var)) != null) {
            this.f58198R = e28Var;
            return e28Var;
        }
        return this.f58198R;
    }
}
