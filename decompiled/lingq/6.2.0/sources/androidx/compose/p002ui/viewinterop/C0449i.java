package androidx.compose.p002ui.viewinterop;

import androidx.compose.p002ui.focus.C0302d;
import androidx.compose.p002ui.node.AbstractC0356f;
import kotlin.jvm.internal.Ref$ObjectRef;
import p000.fa2;
import p000.hu4;
import p000.qp6;
import p000.tf1;

/* JADX INFO: renamed from: androidx.compose.ui.viewinterop.i */
/* JADX INFO: loaded from: classes2.dex */
public final class C0449i extends fa2 implements qp6, tf1 {

    /* JADX INFO: renamed from: L */
    public final C0302d f5212L;

    /* JADX INFO: renamed from: M */
    public hu4 f5213M;

    public C0449i() {
        C0302d c0302d = new C0302d(0, new FocusTargetInteropNode$focusTargetNode$1(2, this, C0449i.class, "onFocusStateChange", "onFocusStateChange(Landroidx/compose/ui/focus/FocusState;Landroidx/compose/ui/focus/FocusState;)V", 0), 9);
        m11624Z0(c0302d);
        this.f5212L = c0302d;
    }

    @Override // p000.qp6
    /* JADX INFO: renamed from: r0 */
    public final void mo804r0() {
        Ref$ObjectRef ref$ObjectRef = new Ref$ObjectRef();
        AbstractC0356f.m1552b(this, new FocusTargetInteropNode$retrievePinnableContainer$1(ref$ObjectRef, this));
        hu4 hu4Var = (hu4) ref$ObjectRef.f47718a;
        if (this.f5212L.m1373e1().isFocused()) {
            hu4 hu4Var2 = this.f5213M;
            if (hu4Var2 != null) {
                hu4Var2.m13464b();
            }
            if (hu4Var != null) {
                hu4Var.m13463a();
            } else {
                hu4Var = null;
            }
            this.f5213M = hu4Var;
        }
    }
}
