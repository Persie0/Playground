package com.lingq.core.p012ui.chart;

import androidx.compose.animation.core.C0059a;
import androidx.compose.p002ui.graphics.drawscope.InterfaceC0310a;
import androidx.compose.p002ui.input.pointer.PointerInputEventHandler;
import androidx.compose.runtime.AbstractC0278f;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Pair;
import kotlin.collections.EmptyList;
import p000.AbstractC3489q9;
import p000.b16;
import p000.c99;
import p000.d32;
import p000.dv0;
import p000.e16;
import p000.eh0;
import p000.gq6;
import p000.ic5;
import p000.kc5;
import p000.lc5;
import p000.mo9;
import p000.qc9;
import p000.sc9;
import p000.t66;
import p000.tj3;
import p000.v91;
import p000.vi3;
import p000.we1;
import p000.x18;
import p000.xfa;
import p000.ye1;
import p000.zi3;

/* JADX INFO: renamed from: com.lingq.core.ui.chart.a */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC1917a {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v15, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r2v16, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r2v17 */
    /* JADX WARN: Type inference failed for: r8v1, types: [tj3, ye1] */
    /* JADX INFO: renamed from: a */
    public static final void m8795a(e16 e16Var, ic5 ic5Var, vi3 vi3Var, ye1 ye1Var, int i) {
        e16 e16Var2;
        Object lineChartKt$LineChart$2$1;
        sc9 sc9Var;
        qc9 qc9Var;
        sc9 sc9Var2;
        final C0059a c0059a;
        final ?? arrayList;
        Float fValueOf;
        Float fValueOf2;
        final ic5 ic5Var2 = ic5Var;
        ArrayList arrayList2 = ic5Var2.f43926a;
        vi3Var.getClass();
        ?? r8 = (tj3) ye1Var;
        r8.m22115d0(1251670855);
        int i2 = i | 6 | (r8.m22124i(ic5Var2) ? 32 : 16) | (r8.m22124i(vi3Var) ? 256 : 128);
        if (r8.m22099R(i2 & 1, (i2 & 147) != 146)) {
            Object objM22097O = r8.m22097O();
            Object obj = we1.f66679a;
            if (objM22097O == obj) {
                objM22097O = AbstractC0278f.m1257g(-1);
                r8.m22131l0(objM22097O);
            }
            sc9 sc9Var3 = (sc9) objM22097O;
            Object objM22097O2 = r8.m22097O();
            if (objM22097O2 == obj) {
                objM22097O2 = AbstractC0278f.m1257g(-1);
                r8.m22131l0(objM22097O2);
            }
            sc9 sc9Var4 = (sc9) objM22097O2;
            Object objM22097O3 = r8.m22097O();
            if (objM22097O3 == obj) {
                objM22097O3 = AbstractC0278f.m1260j(new gq6((((long) Float.floatToRawIntBits(Float.NaN)) & 4294967295L) | (((long) Float.floatToRawIntBits(Float.NaN)) << 32)));
                r8.m22131l0(objM22097O3);
            }
            t66 t66Var = (t66) objM22097O3;
            Object objM22097O4 = r8.m22097O();
            if (objM22097O4 == obj) {
                objM22097O4 = AbstractC0278f.m1256f(0.0f);
                r8.m22131l0(objM22097O4);
            }
            qc9 qc9Var2 = (qc9) objM22097O4;
            Object objM22097O5 = r8.m22097O();
            if (objM22097O5 == obj) {
                objM22097O5 = AbstractC3489q9.m19771a(0.0f);
                r8.m22131l0(objM22097O5);
            }
            C0059a c0059a2 = (C0059a) objM22097O5;
            Object objM22097O6 = r8.m22097O();
            if (objM22097O6 == obj) {
                objM22097O6 = new LineChartKt$LineChart$1$1(sc9Var4, null);
                r8.m22131l0(objM22097O6);
            }
            d32.m10047k(r8, (zi3) objM22097O6, arrayList2);
            gq6 gq6Var = new gq6(((gq6) t66Var.getValue()).f41189a);
            boolean zM22124i = ((i2 & 896) == 256) | r8.m22124i(ic5Var2);
            Object objM22097O7 = r8.m22097O();
            if (zM22124i || objM22097O7 == obj) {
                sc9Var = sc9Var4;
                lineChartKt$LineChart$2$1 = new LineChartKt$LineChart$2$1(ic5Var2, vi3Var, t66Var, qc9Var2, sc9Var, null);
                qc9Var = qc9Var2;
                r8.m22131l0(lineChartKt$LineChart$2$1);
            } else {
                lineChartKt$LineChart$2$1 = objM22097O7;
                qc9Var = qc9Var2;
                sc9Var = sc9Var4;
            }
            d32.m10047k(r8, (zi3) lineChartKt$LineChart$2$1, gq6Var);
            Integer numValueOf = Integer.valueOf(sc9Var.m21222h());
            boolean zM22124i2 = r8.m22124i(c0059a2) | r8.m22124i(ic5Var2);
            Object objM22097O8 = r8.m22097O();
            if (zM22124i2 || objM22097O8 == obj) {
                sc9Var2 = sc9Var3;
                LineChartKt$LineChart$3$1 lineChartKt$LineChart$3$1 = new LineChartKt$LineChart$3$1(c0059a2, ic5Var2, sc9Var, sc9Var2, null);
                c0059a = c0059a2;
                ic5Var2 = ic5Var2;
                r8.m22131l0(lineChartKt$LineChart$3$1);
                objM22097O8 = lineChartKt$LineChart$3$1;
            } else {
                c0059a = c0059a2;
                sc9Var2 = sc9Var3;
            }
            d32.m10047k(r8, (zi3) objM22097O8, numValueOf);
            ArrayList arrayList3 = new ArrayList(v91.m23189q0(arrayList2, 10));
            Iterator it = arrayList2.iterator();
            while (it.hasNext()) {
                arrayList3.add(Float.valueOf(((lc5) it.next()).f49474c));
            }
            Iterator it2 = arrayList3.iterator();
            if (it2.hasNext()) {
                arrayList = new ArrayList();
                Object next = it2.next();
                while (it2.hasNext()) {
                    Object next2 = it2.next();
                    arrayList.add(new Pair(next, next2));
                    next = next2;
                }
            } else {
                arrayList = EmptyList.f47638a;
            }
            Iterator it3 = arrayList2.iterator();
            if (it3.hasNext()) {
                float fMax = ((lc5) it3.next()).f49474c;
                while (it3.hasNext()) {
                    fMax = Math.max(fMax, ((lc5) it3.next()).f49474c);
                }
                fValueOf = Float.valueOf(fMax);
            } else {
                fValueOf = null;
            }
            final float fM8796b = m8796b(fValueOf != null ? fValueOf.floatValue() : 0.0f);
            Iterator it4 = arrayList2.iterator();
            if (it4.hasNext()) {
                float fMin = ((lc5) it4.next()).f49474c;
                while (it4.hasNext()) {
                    fMin = Math.min(fMin, ((lc5) it4.next()).f49474c);
                }
                fValueOf2 = Float.valueOf(fMin);
            } else {
                fValueOf2 = null;
            }
            final float fMin2 = Math.min(0.0f, fValueOf2 != null ? fValueOf2.floatValue() : 0.0f);
            b16 b16Var = b16.f7762a;
            e16 e16VarM4411d = c99.m4411d(b16Var, 1.0f);
            Object objM22097O9 = r8.m22097O();
            if (objM22097O9 == obj) {
                objM22097O9 = new kc5(t66Var, 0);
                r8.m22131l0(objM22097O9);
            }
            e16 e16VarM16957a = mo9.m16957a(e16VarM4411d, xfa.f68157a, (PointerInputEventHandler) objM22097O9);
            boolean zM22124i3 = r8.m22124i(ic5Var2) | r8.m22124i(arrayList) | r8.m22114d(fM8796b) | r8.m22114d(fMin2) | r8.m22124i(c0059a);
            Object objM22097O10 = r8.m22097O();
            if (zM22124i3 || objM22097O10 == obj) {
                final sc9 sc9Var5 = sc9Var2;
                final qc9 qc9Var3 = qc9Var;
                vi3 vi3Var2 = new vi3() { // from class: jc5
                    @Override // p000.vi3
                    public final Object invoke(Object obj2) {
                        InterfaceC0310a interfaceC0310a = (InterfaceC0310a) obj2;
                        interfaceC0310a.getClass();
                        char c = ' ';
                        qc9Var3.m19862i(Float.intBitsToFloat((int) (interfaceC0310a.mo1422h() >> 32)));
                        float fIntBitsToFloat = Float.intBitsToFloat((int) (interfaceC0310a.mo1422h() >> 32));
                        ic5 ic5Var3 = ic5Var2;
                        ArrayList arrayList4 = ic5Var3.f43926a;
                        float size = fIntBitsToFloat / (arrayList4.size() - 1);
                        ArrayList arrayList5 = new ArrayList();
                        List<Pair> list = arrayList;
                        float f = 0.0f;
                        for (Pair pair : list) {
                            float fFloatValue = ((Number) pair.f47623a).floatValue();
                            float f2 = fMin2;
                            float f3 = fM8796b - f2;
                            float fFloatValue2 = (((Number) pair.f47624b).floatValue() - f2) / f3;
                            long jFloatToRawIntBits = (((long) Float.floatToRawIntBits((1.0f - ((fFloatValue - f2) / f3)) * Float.intBitsToFloat((int) (interfaceC0310a.mo1422h() & 4294967295L)))) & 4294967295L) | (((long) Float.floatToRawIntBits(f)) << c);
                            float f4 = f + size;
                            long jFloatToRawIntBits2 = (((long) Float.floatToRawIntBits(f4)) << c) | (((long) Float.floatToRawIntBits((1.0f - fFloatValue2) * Float.intBitsToFloat((int) (interfaceC0310a.mo1422h() & 4294967295L)))) & 4294967295L);
                            arrayList5.add(new Pair(new gq6(jFloatToRawIntBits), new gq6(jFloatToRawIntBits2)));
                            interfaceC0310a.mo604w(ic5Var3.f43927b, jFloatToRawIntBits, jFloatToRawIntBits2, ic5Var3.f43930e, (496 & 16) != 0 ? 0 : 1, (496 & 32) != 0 ? null : null);
                            arrayList5 = arrayList5;
                            list = list;
                            f = f4;
                            c = ' ';
                        }
                        ArrayList arrayList6 = arrayList5;
                        List list2 = list;
                        int size2 = list2.size();
                        for (int i3 = 0; i3 < size2; i3++) {
                            sc9 sc9Var6 = sc9Var5;
                            if (sc9Var6.m21222h() == i3 || (sc9Var6.m21222h() == arrayList4.size() - 1 && i3 == list2.size() - 1)) {
                                long j = sc9Var6.m21222h() == arrayList4.size() + (-1) ? ((gq6) ((Pair) arrayList6.get(i3)).f47624b).f41189a : ((gq6) ((Pair) arrayList6.get(i3)).f47623a).f41189a;
                                InterfaceC0310a.m1417c0(interfaceC0310a, ic5Var3.f43928c, 12.0f, j, 0.0f, null, 120);
                                InterfaceC0310a.m1417c0(interfaceC0310a, ic5Var3.f43928c, ((Number) c0059a.m745d()).floatValue() * 2.0f, j, 0.0f, new el9(ic5Var3.f43930e, 0.0f, 0, 0, 30), 104);
                            }
                        }
                        return xfa.f68157a;
                    }
                };
                r8.m22131l0(vi3Var2);
                objM22097O10 = vi3Var2;
            }
            eh0.m11124d(e16VarM16957a, (vi3) objM22097O10, r8, 0);
            e16Var2 = b16Var;
        } else {
            r8.m22102U();
            e16Var2 = e16Var;
        }
        x18 x18VarM22143u = r8.m22143u();
        if (x18VarM22143u != null) {
            x18VarM22143u.f67642d = new dv0(e16Var2, ic5Var, vi3Var, i, 1);
        }
    }

    /* JADX INFO: renamed from: b */
    public static final float m8796b(float f) {
        if (f <= 0.0f) {
            return 1.0f;
        }
        if (f < 1.0f) {
            return ((float) Math.ceil(f * 10.0f)) / 10.0f;
        }
        return f < 10.0f ? (float) Math.ceil(f) : (((int) (f / 10.0f)) * 10) + 10;
    }
}
