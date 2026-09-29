package androidx.compose.p002ui.node;

import androidx.compose.p002ui.platform.ViewTreeObserverOnGlobalLayoutListenerC0391c;
import p000.d16;
import p000.qp6;
import p000.rp6;
import p000.te1;
import p000.ui3;

/* JADX INFO: renamed from: androidx.compose.ui.node.f */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0356f {
    /* JADX INFO: renamed from: a */
    public static ui3 m1551a() {
        return LayoutNode$Companion$Constructor$1.f4230b;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: b */
    public static final void m1552b(d16 d16Var, ui3 ui3Var) {
        rp6 rp6Var = d16Var.f34843g;
        if (rp6Var == null) {
            rp6Var = new rp6((qp6) d16Var);
            d16Var.f34843g = rp6Var;
        }
        C0364n snapshotObserver = ((ViewTreeObserverOnGlobalLayoutListenerC0391c) te1.m21980M(d16Var)).getSnapshotObserver();
        snapshotObserver.f4460a.m11067c(rp6Var, ObserverNodeOwnerScope$Companion$OnObserveReadsChanged$1.f4280b, ui3Var);
    }
}
