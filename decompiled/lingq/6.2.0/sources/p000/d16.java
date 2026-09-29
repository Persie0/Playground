package p000;

import androidx.compose.p002ui.ModifierNodeDetachedCancellationException;
import androidx.compose.p002ui.node.AbstractC0362l;
import androidx.compose.p002ui.platform.ViewTreeObserverOnGlobalLayoutListenerC0391c;

/* JADX INFO: loaded from: classes.dex */
public abstract class d16 implements ea2 {

    /* JADX INFO: renamed from: H */
    public ui3 f34835H;

    /* JADX INFO: renamed from: I */
    public boolean f34836I;

    /* JADX INFO: renamed from: b */
    public vl1 f34838b;

    /* JADX INFO: renamed from: c */
    public int f34839c;

    /* JADX INFO: renamed from: e */
    public d16 f34841e;

    /* JADX INFO: renamed from: f */
    public d16 f34842f;

    /* JADX INFO: renamed from: g */
    public rp6 f34843g;

    /* JADX INFO: renamed from: h */
    public AbstractC0362l f34844h;

    /* JADX INFO: renamed from: i */
    public boolean f34845i;

    /* JADX INFO: renamed from: j */
    public boolean f34846j;

    /* JADX INFO: renamed from: k */
    public boolean f34847k;

    /* JADX INFO: renamed from: l */
    public boolean f34848l;

    /* JADX INFO: renamed from: a */
    public d16 f34837a = this;

    /* JADX INFO: renamed from: d */
    public int f34840d = -1;

    /* JADX INFO: renamed from: N0 */
    public final un1 m9971N0() {
        vl1 vl1Var = this.f34838b;
        if (vl1Var != null) {
            return vl1Var;
        }
        vl1 vl1VarM23619a = vz1.m23619a(((ViewTreeObserverOnGlobalLayoutListenerC0391c) te1.m21980M(this)).getCoroutineContext().plus(new sd4((cd4) ((ViewTreeObserverOnGlobalLayoutListenerC0391c) te1.m21980M(this)).getCoroutineContext().get(nj0.f52795N))));
        this.f34838b = vl1VarM23619a;
        return vl1VarM23619a;
    }

    /* JADX INFO: renamed from: O0 */
    public boolean mo574O0() {
        return !(this instanceof p70);
    }

    /* JADX INFO: renamed from: P0 */
    public void mo9972P0() {
        if (this.f34836I) {
            i54.m13663b("node attached multiple times");
        }
        if (this.f34844h == null) {
            i54.m13663b("attach invoked on a node without a coordinator");
        }
        this.f34836I = true;
        this.f34847k = true;
    }

    /* JADX INFO: renamed from: Q0 */
    public void mo9973Q0() {
        if (!this.f34836I) {
            i54.m13663b("Cannot detach a node that is not attached");
        }
        if (this.f34847k) {
            i54.m13663b("Must run runAttachLifecycle() before markAsDetached()");
        }
        if (this.f34848l) {
            i54.m13663b("Must run runDetachLifecycle() before markAsDetached()");
        }
        this.f34836I = false;
        vl1 vl1Var = this.f34838b;
        if (vl1Var != null) {
            vz1.m23637j(vl1Var, new ModifierNodeDetachedCancellationException("The Modifier.Node was detached"));
            this.f34838b = null;
        }
    }

    /* JADX INFO: renamed from: R0 */
    public void mo36R0() {
    }

    /* JADX INFO: renamed from: S0 */
    public void mo37S0() {
    }

    /* JADX INFO: renamed from: T0 */
    public void mo763T0() {
    }

    /* JADX INFO: renamed from: U0 */
    public void mo9974U0() {
        if (!this.f34836I) {
            i54.m13663b("reset() called on an unattached node");
        }
        mo763T0();
    }

    /* JADX INFO: renamed from: V0 */
    public void mo9975V0() {
        if (!this.f34836I) {
            i54.m13663b("Must run markAsAttached() prior to runAttachLifecycle");
        }
        if (!this.f34847k) {
            i54.m13663b("Must run runAttachLifecycle() only once after markAsAttached()");
        }
        this.f34847k = false;
        mo36R0();
        this.f34848l = true;
    }

    /* JADX INFO: renamed from: W0 */
    public void mo9976W0() {
        if (!this.f34836I) {
            i54.m13663b("node detached multiple times");
        }
        if (this.f34844h == null) {
            i54.m13663b("detach invoked on a node without a coordinator");
        }
        if (!this.f34848l) {
            i54.m13663b("Must run runDetachLifecycle() once after runAttachLifecycle() and before markAsDetached()");
        }
        this.f34848l = false;
        ui3 ui3Var = this.f34835H;
        if (ui3Var != null) {
            ui3Var.mo0a();
        }
        mo37S0();
    }

    /* JADX INFO: renamed from: X0 */
    public void mo9977X0(d16 d16Var) {
        this.f34837a = d16Var;
    }

    /* JADX INFO: renamed from: Y0 */
    public void mo9978Y0(AbstractC0362l abstractC0362l) {
        this.f34844h = abstractC0362l;
    }
}
