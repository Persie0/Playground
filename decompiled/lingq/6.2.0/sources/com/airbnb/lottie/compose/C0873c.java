package com.airbnb.lottie.compose;

import androidx.compose.p002ui.layout.AbstractC0343j;
import androidx.compose.p002ui.node.InterfaceC0354d;
import kotlin.collections.AbstractC3194a;
import p000.bk1;
import p000.ct5;
import p000.d16;
import p000.dk1;
import p000.it5;
import p000.jt5;
import p000.l87;
import p000.omd;
import p000.vi3;
import p000.xfa;

/* JADX INFO: renamed from: com.airbnb.lottie.compose.c */
/* JADX INFO: loaded from: classes2.dex */
public final class C0873c extends d16 implements InterfaceC0354d {

    /* JADX INFO: renamed from: J */
    public int f10728J;

    /* JADX INFO: renamed from: K */
    public int f10729K;

    @Override // androidx.compose.p002ui.node.InterfaceC0354d
    /* JADX INFO: renamed from: f */
    public final it5 mo575f(jt5 jt5Var, ct5 ct5Var, long j) {
        long jM10423a;
        ct5Var.getClass();
        long jM10426d = dk1.m10426d(j, omd.m18149g(this.f10728J, this.f10729K));
        if (bk1.m3800h(j) == Integer.MAX_VALUE && bk1.m3801i(j) != Integer.MAX_VALUE) {
            int i = (int) (jM10426d >> 32);
            int i2 = (this.f10729K * i) / this.f10728J;
            jM10423a = dk1.m10423a(i, i, i2, i2);
        } else if (bk1.m3801i(j) != Integer.MAX_VALUE || bk1.m3800h(j) == Integer.MAX_VALUE) {
            int i3 = (int) (jM10426d >> 32);
            int i4 = (int) (jM10426d & 4294967295L);
            jM10423a = dk1.m10423a(i3, i3, i4, i4);
        } else {
            int i5 = (int) (jM10426d & 4294967295L);
            int i6 = (this.f10728J * i5) / this.f10729K;
            jM10423a = dk1.m10423a(i6, i6, i5, i5);
        }
        final l87 l87VarMo1514r = ct5Var.mo1514r(jM10423a);
        return jt5Var.mo9895M0(l87VarMo1514r.f49301a, l87VarMo1514r.f49302b, AbstractC3194a.m15360M(), new vi3() { // from class: com.airbnb.lottie.compose.LottieAnimationSizeNode$measure$1
            {
                super(1);
            }

            @Override // p000.vi3
            public final Object invoke(Object obj) {
                AbstractC0343j abstractC0343j = (AbstractC0343j) obj;
                abstractC0343j.getClass();
                AbstractC0343j.m1521j(abstractC0343j, l87VarMo1514r, 0, 0);
                return xfa.f68157a;
            }
        });
    }
}
