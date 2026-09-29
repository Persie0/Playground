package androidx.compose.p002ui.input.pointer;

import androidx.compose.p002ui.node.TraversableNode$Companion$TraverseDescendantsAction;
import java.util.List;
import kotlin.jvm.internal.Ref$BooleanRef;
import kotlin.jvm.internal.Ref$ObjectRef;
import p000.C3724wj;
import p000.ck2;
import p000.d16;
import p000.fb2;
import p000.fg7;
import p000.ho5;
import p000.ig7;
import p000.kg7;
import p000.ng7;
import p000.pba;
import p000.qba;
import p000.te1;
import p000.tf1;
import p000.vi3;
import p000.x7a;

/* JADX INFO: renamed from: androidx.compose.ui.input.pointer.b */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0328b extends d16 implements pba, ng7, tf1 {

    /* JADX INFO: renamed from: J */
    public ck2 f4124J;

    /* JADX INFO: renamed from: K */
    public C3724wj f4125K;

    /* JADX INFO: renamed from: L */
    public boolean f4126L;

    public AbstractC0328b(C3724wj c3724wj, ck2 ck2Var) {
        this.f4124J = ck2Var;
        this.f4125K = c3724wj;
    }

    @Override // p000.ng7
    /* JADX INFO: renamed from: D */
    public final void mo786D(fg7 fg7Var, PointerEventPass pointerEventPass, long j) {
        if (pointerEventPass == PointerEventPass.Main) {
            List list = fg7Var.f39071a;
            int size = list.size();
            for (int i = 0; i < size; i++) {
                if (mo1460c1(((kg7) list.get(i)).f47243i)) {
                    int i2 = fg7Var.f39076f;
                    if (i2 == 4) {
                        this.f4126L = true;
                        m1459b1();
                        return;
                    } else {
                        if (i2 == 5) {
                            m1461d1();
                            return;
                        }
                        return;
                    }
                }
            }
        }
    }

    @Override // p000.ng7
    /* JADX INFO: renamed from: K */
    public final void mo818K() {
        m1461d1();
    }

    @Override // p000.d16
    /* JADX INFO: renamed from: S0 */
    public final void mo37S0() {
        m1461d1();
    }

    /* JADX INFO: renamed from: Z0 */
    public final void m1457Z0() {
        C3724wj c3724wj;
        final Ref$ObjectRef ref$ObjectRef = new Ref$ObjectRef();
        qba.m19853e(this, new vi3(ref$ObjectRef) { // from class: androidx.compose.ui.input.pointer.HoverIconModifierNode$findOverridingAncestorNode$1
            {
                super(1);
            }

            @Override // p000.vi3
            public final Object invoke(Object obj) {
                ((AbstractC0328b) obj).getClass();
                return Boolean.TRUE;
            }
        });
        AbstractC0328b abstractC0328b = (AbstractC0328b) ref$ObjectRef.f47718a;
        if (abstractC0328b == null || (c3724wj = abstractC0328b.f4125K) == null) {
            c3724wj = this.f4125K;
        }
        mo1458a1(c3724wj);
    }

    /* JADX INFO: renamed from: a1 */
    public abstract void mo1458a1(ig7 ig7Var);

    /* JADX INFO: renamed from: b1 */
    public final void m1459b1() {
        final Ref$BooleanRef ref$BooleanRef = new Ref$BooleanRef();
        ref$BooleanRef.f47713a = true;
        qba.m19855g(this, new vi3() { // from class: androidx.compose.ui.input.pointer.HoverIconModifierNode$displayIconIfDescendantsDoNotHavePriority$1
            {
                super(1);
            }

            @Override // p000.vi3
            public final Object invoke(Object obj) {
                if (!((AbstractC0328b) obj).f4126L) {
                    return TraversableNode$Companion$TraverseDescendantsAction.ContinueTraversal;
                }
                ref$BooleanRef.f47713a = false;
                return TraversableNode$Companion$TraverseDescendantsAction.CancelTraversal;
            }
        });
        if (ref$BooleanRef.f47713a) {
            m1457Z0();
        }
    }

    /* JADX INFO: renamed from: c1 */
    public abstract boolean mo1460c1(int i);

    /* JADX INFO: renamed from: d1 */
    public final void m1461d1() {
        if (this.f4126L) {
            this.f4126L = false;
            if (this.f34836I) {
                final Ref$ObjectRef ref$ObjectRef = new Ref$ObjectRef();
                qba.m19853e(this, new vi3() { // from class: androidx.compose.ui.input.pointer.HoverIconModifierNode$displayIconFromAncestorNodeWithCursorInBoundsOrDefaultIcon$1
                    {
                        super(1);
                    }

                    @Override // p000.vi3
                    public final Object invoke(Object obj) {
                        AbstractC0328b abstractC0328b = (AbstractC0328b) obj;
                        Ref$ObjectRef ref$ObjectRef2 = ref$ObjectRef;
                        Object obj2 = ref$ObjectRef2.f47718a;
                        if (obj2 == null && abstractC0328b.f4126L) {
                            ref$ObjectRef2.f47718a = abstractC0328b;
                        } else if (obj2 != null) {
                            abstractC0328b.getClass();
                        }
                        return Boolean.TRUE;
                    }
                });
                AbstractC0328b abstractC0328b = (AbstractC0328b) ref$ObjectRef.f47718a;
                if (abstractC0328b != null) {
                    abstractC0328b.m1457Z0();
                } else {
                    mo1458a1(null);
                }
            }
        }
    }

    @Override // p000.ng7
    /* JADX INFO: renamed from: s */
    public final long mo1462s() {
        if (this.f4124J == null) {
            return x7a.f67905a;
        }
        fb2 fb2Var = te1.m21979L(this).f4327T;
        int i = x7a.f67906b;
        return ho5.m13404z(fb2Var.mo916w0(10.0f), fb2Var.mo916w0(40.0f), fb2Var.mo916w0(10.0f), fb2Var.mo916w0(40.0f));
    }
}
