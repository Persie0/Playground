package androidx.compose.p002ui;

import androidx.compose.p002ui.layout.AbstractC0343j;
import androidx.compose.p002ui.node.InterfaceC0354d;
import kotlin.collections.AbstractC3194a;
import p000.AbstractC3393o1;
import p000.ct5;
import p000.d16;
import p000.it5;
import p000.jt5;
import p000.l87;
import p000.vi3;
import p000.xfa;

/* JADX INFO: renamed from: androidx.compose.ui.c */
/* JADX INFO: loaded from: classes2.dex */
public final class C0288c extends d16 implements InterfaceC0354d {

    /* JADX INFO: renamed from: J */
    public float f3817J;

    @Override // androidx.compose.p002ui.node.InterfaceC0354d
    /* JADX INFO: renamed from: f */
    public final it5 mo575f(jt5 jt5Var, ct5 ct5Var, long j) {
        final l87 l87VarMo1514r = ct5Var.mo1514r(j);
        return jt5Var.mo9895M0(l87VarMo1514r.f49301a, l87VarMo1514r.f49302b, AbstractC3194a.m15360M(), new vi3() { // from class: androidx.compose.ui.ZIndexNode$measure$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // p000.vi3
            public final Object invoke(Object obj) {
                ((AbstractC0343j) obj).m1530f(l87VarMo1514r, 0, 0, this.f3817J);
                return xfa.f68157a;
            }
        });
    }

    public final String toString() {
        return AbstractC3393o1.m17737l(new StringBuilder("ZIndexModifier(zIndex="), this.f3817J, ')');
    }
}
