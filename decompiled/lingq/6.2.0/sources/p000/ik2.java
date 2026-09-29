package p000;

import androidx.compose.p002ui.node.TraversableNode$Companion$TraverseDescendantsAction;
import androidx.compose.p002ui.platform.ViewTreeObserverOnGlobalLayoutListenerC0391c;
import kotlin.jvm.internal.Ref$ObjectRef;
import p000.ik2;
import p000.jbd;
import p000.kbd;
import p000.pba;
import p000.te1;

/* JADX INFO: loaded from: classes.dex */
public final class ik2 extends d16 implements pba, yp4 {

    /* JADX INFO: renamed from: J */
    public ik2 f44218J;

    /* JADX INFO: renamed from: K */
    public ik2 f44219K;

    /* JADX INFO: renamed from: L */
    public long f44220L;

    @Override // p000.d16
    /* JADX INFO: renamed from: S0 */
    public final void mo37S0() {
        this.f44219K = null;
        this.f44218J = null;
    }

    /* JADX INFO: renamed from: Z0 */
    public final boolean m13986Z0(hi8 hi8Var) {
        ik2 ik2Var = this.f44218J;
        if (ik2Var != null) {
            return ik2Var.m13986Z0(hi8Var);
        }
        ik2 ik2Var2 = this.f44219K;
        if (ik2Var2 != null) {
            return ik2Var2.m13986Z0(hi8Var);
        }
        return false;
    }

    /* JADX INFO: renamed from: a1 */
    public final void m13987a1(hi8 hi8Var) {
        ik2 ik2Var = this.f44219K;
        if (ik2Var != null) {
            ik2Var.m13987a1(hi8Var);
            return;
        }
        ik2 ik2Var2 = this.f44218J;
        if (ik2Var2 != null) {
            ik2Var2.m13987a1(hi8Var);
        }
    }

    /* JADX INFO: renamed from: b1 */
    public final void m13988b1(hi8 hi8Var) {
        ik2 ik2Var = this.f44219K;
        if (ik2Var != null) {
            ik2Var.m13988b1(hi8Var);
        }
        ik2 ik2Var2 = this.f44218J;
        if (ik2Var2 != null) {
            ik2Var2.m13988b1(hi8Var);
        }
        this.f44218J = null;
    }

    @Override // p000.yp4, p000.mt5
    /* JADX INFO: renamed from: c */
    public final void mo858c(long j) {
        this.f44220L = j;
    }

    /* JADX INFO: renamed from: c1 */
    public final void m13989c1(final hi8 hi8Var) {
        pba pbaVar;
        ik2 ik2Var;
        ik2 ik2Var2 = this.f44218J;
        if (ik2Var2 == null || !jbd.m14379a(ik2Var2, kbd.m15081a(hi8Var))) {
            if (this.f34837a.f34836I) {
                final Ref$ObjectRef ref$ObjectRef = new Ref$ObjectRef();
                qba.m19855g(this, new vi3() { // from class: androidx.compose.ui.draganddrop.DragAndDropNode$onMoved$$inlined$firstDescendantOrNull$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(1);
                    }

                    @Override // p000.vi3
                    public final Object invoke(Object obj) {
                        pba pbaVar2 = (pba) obj;
                        ik2 ik2Var3 = (ik2) pbaVar2;
                        if (!((ViewOnDragListenerC0293a) ((ViewTreeObserverOnGlobalLayoutListenerC0391c) te1.m21980M(this)).m25910getDragAndDropManager()).f3852b.contains(ik2Var3) || !jbd.m14379a(ik2Var3, kbd.m15081a(hi8Var))) {
                            return TraversableNode$Companion$TraverseDescendantsAction.ContinueTraversal;
                        }
                        ref$ObjectRef.f47718a = pbaVar2;
                        return TraversableNode$Companion$TraverseDescendantsAction.CancelTraversal;
                    }
                });
                pbaVar = (pba) ref$ObjectRef.f47718a;
            } else {
                pbaVar = null;
            }
            ik2Var = (ik2) pbaVar;
        } else {
            ik2Var = ik2Var2;
        }
        if (ik2Var != null && ik2Var2 == null) {
            jbd.m14380b(ik2Var, hi8Var);
            ik2 ik2Var3 = this.f44219K;
            if (ik2Var3 != null) {
                ik2Var3.m13988b1(hi8Var);
            }
        } else if (ik2Var == null && ik2Var2 != null) {
            ik2 ik2Var4 = this.f44219K;
            if (ik2Var4 != null) {
                jbd.m14380b(ik2Var4, hi8Var);
            }
            ik2Var2.m13988b1(hi8Var);
        } else if (!fa4.m11650l(ik2Var, ik2Var2)) {
            if (ik2Var != null) {
                jbd.m14380b(ik2Var, hi8Var);
            }
            if (ik2Var2 != null) {
                ik2Var2.m13988b1(hi8Var);
            }
        } else if (ik2Var != null) {
            ik2Var.m13989c1(hi8Var);
        } else {
            ik2 ik2Var5 = this.f44219K;
            if (ik2Var5 != null) {
                ik2Var5.m13989c1(hi8Var);
            }
        }
        this.f44218J = ik2Var;
    }

    /* JADX INFO: renamed from: d1 */
    public final void m13990d1(hi8 hi8Var) {
        ik2 ik2Var = this.f44219K;
        if (ik2Var != null) {
            ik2Var.m13990d1(hi8Var);
            return;
        }
        ik2 ik2Var2 = this.f44218J;
        if (ik2Var2 != null) {
            ik2Var2.m13990d1(hi8Var);
        }
    }

    @Override // p000.pba
    /* JADX INFO: renamed from: r */
    public final Object mo956r() {
        return nj0.f52794M;
    }
}
