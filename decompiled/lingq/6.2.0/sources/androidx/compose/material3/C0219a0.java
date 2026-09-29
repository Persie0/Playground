package androidx.compose.material3;

import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.p002ui.layout.AbstractC0343j;
import java.util.List;
import kotlin.collections.AbstractC3194a;
import kotlin.jvm.internal.Ref$IntRef;
import p000.AbstractC3550rv;
import p000.C3386nv;
import p000.bk1;
import p000.ct5;
import p000.dk1;
import p000.fa4;
import p000.hg5;
import p000.ht5;
import p000.ii3;
import p000.it5;
import p000.jt5;
import p000.l70;
import p000.l87;
import p000.oq7;
import p000.qc9;
import p000.sc9;
import p000.ss5;
import p000.vi3;
import p000.xc9;

/* JADX INFO: renamed from: androidx.compose.material3.a0 */
/* JADX INFO: loaded from: classes2.dex */
public final class C0219a0 implements ht5 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f3368a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Object f3369b;

    public /* synthetic */ C0219a0(Object obj, int i) {
        this.f3368a = i;
        this.f3369b = obj;
    }

    @Override // p000.ht5
    /* JADX INFO: renamed from: b */
    public final it5 mo738b(jt5 jt5Var, List list, long j) {
        int iMax;
        int iMax2;
        int i;
        int i2;
        int i3 = this.f3368a;
        Object obj = this.f3369b;
        boolean z = true;
        switch (i3) {
            case 0:
                oq7 oq7Var = (oq7) obj;
                int size = list.size();
                for (int i4 = 0; i4 < size; i4++) {
                    ct5 ct5Var = (ct5) list.get(i4);
                    if (l70.m15957t(ct5Var) == RangeSliderComponents.STARTTHUMB) {
                        final l87 l87VarMo1514r = ct5Var.mo1514r(j);
                        List list2 = list;
                        int size2 = list2.size();
                        for (int i5 = 0; i5 < size2; i5++) {
                            ct5 ct5Var2 = (ct5) list.get(i5);
                            if (l70.m15957t(ct5Var2) == RangeSliderComponents.ENDTHUMB) {
                                final l87 l87VarMo1514r2 = ct5Var2.mo1514r(j);
                                int size3 = list2.size();
                                for (int i6 = 0; i6 < size3; i6++) {
                                    ct5 ct5Var3 = (ct5) list.get(i6);
                                    if (l70.m15957t(ct5Var3) == RangeSliderComponents.TRACK) {
                                        final l87 l87VarMo1514r3 = ct5Var3.mo1514r(bk1.m3794b(0, 0, 0, 0, 11, dk1.m10432j((-(l87VarMo1514r.f49301a + l87VarMo1514r2.f49301a)) / 2, 0, 2, j)));
                                        int i7 = ((l87VarMo1514r.f49301a + l87VarMo1514r2.f49301a) / 2) + l87VarMo1514r3.f49301a;
                                        int iMax3 = Math.max(l87VarMo1514r3.f49302b, Math.max(l87VarMo1514r.f49302b, l87VarMo1514r2.f49302b));
                                        sc9 sc9Var = oq7Var.f54745k;
                                        int i8 = oq7Var.f54735a;
                                        float[] fArr = oq7Var.f54740f;
                                        sc9Var.m21223i(i7);
                                        qc9 qc9Var = oq7Var.f54739e;
                                        qc9 qc9Var2 = oq7Var.f54738d;
                                        qc9 qc9Var3 = oq7Var.f54751q;
                                        qc9 qc9Var4 = oq7Var.f54752r;
                                        float fMax = Math.max(oq7Var.f54745k.m21222h() - (oq7Var.f54743i.m19861h() / 2.0f), 0.0f);
                                        float fMin = Math.min(oq7Var.f54741g.m19861h() / 2.0f, fMax);
                                        if (!((Boolean) ((xc9) oq7Var.f54748n).getValue()).booleanValue() && (qc9Var4.m19861h() != fMin || qc9Var3.m19861h() != fMax || qc9Var2.m19861h() != qc9Var.m19861h())) {
                                            qc9Var4.m19862i(fMin);
                                            qc9Var3.m19862i(fMax);
                                            oq7Var.f54746l.m19862i(oq7Var.m18213g(qc9Var4.m19861h(), qc9Var3.m19861h(), qc9Var2.m19861h()));
                                            oq7Var.f54747m.m19862i(oq7Var.m18213g(qc9Var4.m19861h(), qc9Var3.m19861h(), qc9Var.m19861h()));
                                        }
                                        float fM18208b = oq7Var.m18208b();
                                        boolean z2 = fa4.m11648j(fM18208b, AbstractC3550rv.m20839g0(fArr)) || fa4.m11648j(fM18208b, AbstractC3550rv.m20845m0(fArr));
                                        float fM18207a = oq7Var.m18207a();
                                        boolean z3 = fa4.m11648j(fM18207a, AbstractC3550rv.m20839g0(fArr)) || fa4.m11648j(fM18207a, AbstractC3550rv.m20845m0(fArr));
                                        final int i9 = l87VarMo1514r.f49301a / 2;
                                        int iMo1630V = l87VarMo1514r3.mo1630V(AbstractC0226d0.f3394f);
                                        int i10 = iMo1630V != Integer.MIN_VALUE ? iMo1630V : 0;
                                        final int iM21693T = (i8 <= 0 || z2) ? ss5.m21693T(l87VarMo1514r3.f49301a * fM18208b) : ss5.m21693T((l87VarMo1514r3.f49301a - (i10 * 2)) * fM18208b) + i10;
                                        int i11 = (l87VarMo1514r.f49301a - l87VarMo1514r2.f49301a) / 2;
                                        final int iM21693T2 = (i8 <= 0 || z3) ? ss5.m21693T((l87VarMo1514r3.f49301a * fM18207a) + i11) : ss5.m21693T(((l87VarMo1514r3.f49301a - (i10 * 2)) * fM18207a) + i11) + i10;
                                        final int i12 = (iMax3 - l87VarMo1514r3.f49302b) / 2;
                                        final int i13 = (iMax3 - l87VarMo1514r.f49302b) / 2;
                                        final int i14 = (iMax3 - l87VarMo1514r2.f49302b) / 2;
                                        return jt5Var.mo9895M0(i7, iMax3, AbstractC3194a.m15360M(), new vi3() { // from class: ta9
                                            @Override // p000.vi3
                                            public final Object invoke(Object obj2) {
                                                AbstractC0343j abstractC0343j = (AbstractC0343j) obj2;
                                                AbstractC0343j.m1521j(abstractC0343j, l87VarMo1514r3, i9, i12);
                                                AbstractC0343j.m1521j(abstractC0343j, l87VarMo1514r, iM21693T, i13);
                                                AbstractC0343j.m1521j(abstractC0343j, l87VarMo1514r2, iM21693T2, i14);
                                                return xfa.f68157a;
                                            }
                                        });
                                    }
                                }
                                hg5.m13230b("Collection contains no element matching the predicate.");
                                C3386nv.m17631r();
                                return null;
                            }
                        }
                        hg5.m13230b("Collection contains no element matching the predicate.");
                        C3386nv.m17631r();
                        return null;
                    }
                }
                hg5.m13230b("Collection contains no element matching the predicate.");
                C3386nv.m17631r();
                return null;
            default:
                C0228e0 c0228e0 = (C0228e0) obj;
                int i15 = c0228e0.f3400a;
                float[] fArr2 = c0228e0.f3406g;
                Orientation orientation = c0228e0.f3412m;
                int size4 = list.size();
                for (int i16 = 0; i16 < size4; i16++) {
                    ct5 ct5Var4 = (ct5) list.get(i16);
                    if (l70.m15957t(ct5Var4) == SliderComponents.THUMB) {
                        l87 l87VarMo1514r4 = ct5Var4.mo1514r(j);
                        int size5 = list.size();
                        for (int i17 = 0; i17 < size5; i17++) {
                            ct5 ct5Var5 = (ct5) list.get(i17);
                            if (l70.m15957t(ct5Var5) == SliderComponents.TRACK) {
                                Orientation orientation2 = Orientation.Vertical;
                                l87 l87VarMo1514r5 = orientation == orientation2 ? ct5Var5.mo1514r(bk1.m3794b(0, 0, 0, 0, 14, dk1.m10432j(0, -l87VarMo1514r4.f49302b, 1, j))) : ct5Var5.mo1514r(bk1.m3794b(0, 0, 0, 0, 11, dk1.m10432j(-l87VarMo1514r4.f49301a, 0, 2, j)));
                                Ref$IntRef ref$IntRef = new Ref$IntRef();
                                Ref$IntRef ref$IntRef2 = new Ref$IntRef();
                                float fM1142c = c0228e0.m1142c();
                                if (!fa4.m11648j(fM1142c, AbstractC3550rv.m20839g0(fArr2)) && !fa4.m11648j(fM1142c, AbstractC3550rv.m20845m0(fArr2))) {
                                    z = false;
                                }
                                int iMo1630V2 = l87VarMo1514r5.mo1630V(AbstractC0226d0.f3394f);
                                int i18 = iMo1630V2 != Integer.MIN_VALUE ? iMo1630V2 : 0;
                                if (orientation == orientation2) {
                                    iMax = Math.max(l87VarMo1514r5.f49301a, l87VarMo1514r4.f49301a);
                                    int i19 = l87VarMo1514r4.f49302b;
                                    int i20 = l87VarMo1514r5.f49302b;
                                    iMax2 = i19 + i20;
                                    i = (iMax - l87VarMo1514r5.f49301a) / 2;
                                    i2 = i19 / 2;
                                    ref$IntRef.f47716a = (iMax - l87VarMo1514r4.f49301a) / 2;
                                    ref$IntRef2.f47716a = (i2 - (l87VarMo1514r4.f49302b / 2)) + ((i15 <= 0 || z) ? ss5.m21693T(i20 * fM1142c) : ss5.m21693T((i20 - (i18 * 2)) * fM1142c) + i18);
                                } else {
                                    iMax = l87VarMo1514r4.f49301a + l87VarMo1514r5.f49301a;
                                    iMax2 = Math.max(l87VarMo1514r5.f49302b, l87VarMo1514r4.f49302b);
                                    i = l87VarMo1514r4.f49301a / 2;
                                    i2 = (iMax2 - l87VarMo1514r5.f49302b) / 2;
                                    ref$IntRef.f47716a = (i - (l87VarMo1514r4.f49301a / 2)) + ((i15 <= 0 || z) ? ss5.m21693T(l87VarMo1514r5.f49301a * fM1142c) : ss5.m21693T((l87VarMo1514r5.f49301a - (i18 * 2)) * fM1142c) + i18);
                                    ref$IntRef2.f47716a = (iMax2 - l87VarMo1514r4.f49302b) / 2;
                                }
                                int i21 = i2;
                                int i22 = i;
                                c0228e0.f3407h.m21223i(iMax);
                                c0228e0.f3408i.m21223i(iMax2);
                                return jt5Var.mo9895M0(iMax, iMax2, AbstractC3194a.m15360M(), new ii3(l87VarMo1514r5, i22, i21, l87VarMo1514r4, ref$IntRef, ref$IntRef2));
                            }
                        }
                        hg5.m13230b("Collection contains no element matching the predicate.");
                        C3386nv.m17631r();
                        return null;
                    }
                }
                hg5.m13230b("Collection contains no element matching the predicate.");
                C3386nv.m17631r();
                return null;
        }
    }
}
