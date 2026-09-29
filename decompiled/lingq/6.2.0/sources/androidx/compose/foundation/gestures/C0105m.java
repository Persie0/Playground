package androidx.compose.foundation.gestures;

import androidx.compose.foundation.MutatePriority;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlinx.coroutines.CoroutineStart;
import p000.aj3;
import p000.fa4;
import p000.hl2;
import p000.rk2;
import p000.wfb;
import p000.xfa;
import p000.zi3;

/* JADX INFO: renamed from: androidx.compose.foundation.gestures.m */
/* JADX INFO: loaded from: classes.dex */
public final class C0105m extends AbstractC0103k {

    /* JADX INFO: renamed from: e0 */
    public hl2 f2288e0;

    /* JADX INFO: renamed from: f0 */
    public boolean f2289f0;

    /* JADX INFO: renamed from: g0 */
    public aj3 f2290g0;

    /* JADX INFO: renamed from: h0 */
    public aj3 f2291h0;

    /* JADX INFO: renamed from: i0 */
    public boolean f2292i0;

    @Override // androidx.compose.foundation.gestures.AbstractC0103k
    /* JADX INFO: renamed from: g1 */
    public final Object mo841g1(zi3 zi3Var, Continuation continuation) {
        Object objMo861a;
        Orientation orientation = this.f2267L;
        return (orientation != null && (objMo861a = this.f2288e0.mo861a(MutatePriority.UserInput, new DraggableNode$drag$2(zi3Var, this, orientation, null), continuation)) == CoroutineSingletons.COROUTINE_SUSPENDED) ? objMo861a : xfa.f68157a;
    }

    @Override // androidx.compose.foundation.gestures.AbstractC0103k
    /* JADX INFO: renamed from: l1 */
    public final void mo842l1(long j) {
        if (!this.f34836I || fa4.m11650l(this.f2290g0, AbstractC0104l.f2286a)) {
            return;
        }
        wfb.m23926u(m9971N0(), null, CoroutineStart.UNDISPATCHED, new DraggableNode$onDragStarted$1(this, j, null), 1);
    }

    @Override // androidx.compose.foundation.gestures.AbstractC0103k
    /* JADX INFO: renamed from: m1 */
    public final void mo843m1(rk2 rk2Var) {
        Orientation orientation;
        if (!this.f34836I || fa4.m11650l(this.f2291h0, AbstractC0104l.f2287b) || (orientation = this.f2267L) == null) {
            return;
        }
        wfb.m23926u(m9971N0(), null, CoroutineStart.UNDISPATCHED, new DraggableNode$onDragStopped$1(this, rk2Var, orientation, null), 1);
    }

    @Override // androidx.compose.foundation.gestures.AbstractC0103k
    /* JADX INFO: renamed from: r1 */
    public final boolean mo844r1() {
        return this.f2289f0;
    }
}
