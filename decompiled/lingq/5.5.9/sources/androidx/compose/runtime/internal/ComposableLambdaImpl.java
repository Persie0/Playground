package androidx.compose.runtime.internal;

import androidx.compose.runtime.ComposerImpl;
import androidx.compose.runtime.InterfaceC0476a;
import cm.InterfaceC2042b;
import cm.InterfaceC2043c;
import cm.InterfaceC2045e;
import cm.InterfaceC2046f;
import cm.InterfaceC2047g;
import cm.InterfaceC2048h;
import cm.InterfaceC2049i;
import cm.InterfaceC2050j;
import cm.InterfaceC2051k;
import cm.InterfaceC2053m;
import cm.InterfaceC2054n;
import cm.InterfaceC2056p;
import cm.InterfaceC2057q;
import cm.InterfaceC2058r;
import cm.InterfaceC2059s;
import cm.InterfaceC2060t;
import cm.InterfaceC2061u;
import cm.InterfaceC2062v;
import cm.InterfaceC2063w;
import dm.C5207g;
import dm.C5213m;
import java.util.ArrayList;
import kotlin.jvm.internal.Lambda;
import p081e0.C5332q0;
import p081e0.InterfaceC5330p0;
import p230l0.C7204a;
import sl.C9072e;

/* JADX INFO: loaded from: classes.dex */
public final class ComposableLambdaImpl implements InterfaceC2056p, InterfaceC2057q, InterfaceC2058r, InterfaceC2059s, InterfaceC2060t, InterfaceC2061u, InterfaceC2062v, InterfaceC2063w, InterfaceC2042b, InterfaceC2043c, InterfaceC2045e, InterfaceC2046f, InterfaceC2047g, InterfaceC2048h, InterfaceC2049i, InterfaceC2050j, InterfaceC2051k, InterfaceC2053m, InterfaceC2054n {

    /* JADX INFO: renamed from: a */
    public final int f3199a;

    /* JADX INFO: renamed from: b */
    public final boolean f3200b;

    /* JADX INFO: renamed from: c */
    public Object f3201c;

    /* JADX INFO: renamed from: d */
    public InterfaceC5330p0 f3202d;

    /* JADX INFO: renamed from: e */
    public ArrayList f3203e;

    public ComposableLambdaImpl(int i10, boolean z10) {
        this.f3199a = i10;
        this.f3200b = z10;
    }

    @Override // cm.InterfaceC2057q
    /* JADX INFO: renamed from: M */
    public final /* bridge */ /* synthetic */ Object mo1343M(Object obj, Object obj2, Object obj3) {
        return m1852a(obj, (InterfaceC0476a) obj2, ((Number) obj3).intValue());
    }

    @Override // cm.InterfaceC2058r
    /* JADX INFO: renamed from: T */
    public final /* bridge */ /* synthetic */ Object mo1851T(Object obj, Object obj2, Object obj3, Object obj4) {
        return m1853b(obj, obj2, (InterfaceC0476a) obj3, ((Number) obj4).intValue());
    }

    /* JADX INFO: renamed from: a */
    public final Object m1852a(final Object obj, InterfaceC0476a interfaceC0476a, final int i10) {
        C5207g.m11111f(interfaceC0476a, "c");
        ComposerImpl composerImplMo1636j = interfaceC0476a.mo1636j(this.f3199a);
        m1856e(composerImplMo1636j);
        int iM14521a = composerImplMo1636j.mo1665y(this) ? C7204a.m14521a(2, 1) : C7204a.m14521a(1, 1);
        Object obj2 = this.f3201c;
        C5207g.m11109d(obj2, "null cannot be cast to non-null type kotlin.Function3<@[ParameterName(name = 'p1')] kotlin.Any?, @[ParameterName(name = 'c')] androidx.compose.runtime.Composer, @[ParameterName(name = 'changed')] kotlin.Int, kotlin.Any?>");
        C5213m.m11200e(3, obj2);
        Object objMo1343M = ((InterfaceC2057q) obj2).mo1343M(obj, composerImplMo1636j, Integer.valueOf(iM14521a | i10));
        C5332q0 c5332q0M1612T = composerImplMo1636j.m1612T();
        if (c5332q0M1612T != null) {
            c5332q0M1612T.f33605d = new InterfaceC2056p<InterfaceC0476a, Integer, C9072e>() { // from class: androidx.compose.runtime.internal.ComposableLambdaImpl$invoke$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // cm.InterfaceC2056p
                /* JADX INFO: renamed from: m0 */
                public final C9072e mo1337m0(InterfaceC0476a interfaceC0476a2, Integer num) {
                    InterfaceC0476a interfaceC0476a3 = interfaceC0476a2;
                    num.intValue();
                    C5207g.m11111f(interfaceC0476a3, "nc");
                    this.f3204b.m1852a(obj, interfaceC0476a3, i10 | 1);
                    return C9072e.f47360a;
                }
            };
        }
        return objMo1343M;
    }

    /* JADX INFO: renamed from: b */
    public final Object m1853b(final Object obj, final Object obj2, InterfaceC0476a interfaceC0476a, final int i10) {
        C5207g.m11111f(interfaceC0476a, "c");
        ComposerImpl composerImplMo1636j = interfaceC0476a.mo1636j(this.f3199a);
        m1856e(composerImplMo1636j);
        int iM14521a = composerImplMo1636j.mo1665y(this) ? C7204a.m14521a(2, 2) : C7204a.m14521a(1, 2);
        Object obj3 = this.f3201c;
        C5207g.m11109d(obj3, "null cannot be cast to non-null type kotlin.Function4<@[ParameterName(name = 'p1')] kotlin.Any?, @[ParameterName(name = 'p2')] kotlin.Any?, @[ParameterName(name = 'c')] androidx.compose.runtime.Composer, @[ParameterName(name = 'changed')] kotlin.Int, kotlin.Any?>");
        C5213m.m11200e(4, obj3);
        Object objMo1851T = ((InterfaceC2058r) obj3).mo1851T(obj, obj2, composerImplMo1636j, Integer.valueOf(iM14521a | i10));
        C5332q0 c5332q0M1612T = composerImplMo1636j.m1612T();
        if (c5332q0M1612T != null) {
            c5332q0M1612T.f33605d = new InterfaceC2056p<InterfaceC0476a, Integer, C9072e>() { // from class: androidx.compose.runtime.internal.ComposableLambdaImpl$invoke$2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // cm.InterfaceC2056p
                /* JADX INFO: renamed from: m0 */
                public final C9072e mo1337m0(InterfaceC0476a interfaceC0476a2, Integer num) {
                    InterfaceC0476a interfaceC0476a3 = interfaceC0476a2;
                    num.intValue();
                    C5207g.m11111f(interfaceC0476a3, "nc");
                    int i11 = i10 | 1;
                    this.f3207b.m1853b(obj, obj2, interfaceC0476a3, i11);
                    return C9072e.f47360a;
                }
            };
        }
        return objMo1851T;
    }

    /* JADX INFO: renamed from: c */
    public final Object m1854c(final Object obj, final Object obj2, final Object obj3, InterfaceC0476a interfaceC0476a, final int i10) {
        C5207g.m11111f(interfaceC0476a, "c");
        ComposerImpl composerImplMo1636j = interfaceC0476a.mo1636j(this.f3199a);
        m1856e(composerImplMo1636j);
        int iM14521a = composerImplMo1636j.mo1665y(this) ? C7204a.m14521a(2, 3) : C7204a.m14521a(1, 3);
        Object obj4 = this.f3201c;
        C5207g.m11109d(obj4, "null cannot be cast to non-null type kotlin.Function5<@[ParameterName(name = 'p1')] kotlin.Any?, @[ParameterName(name = 'p2')] kotlin.Any?, @[ParameterName(name = 'p3')] kotlin.Any?, @[ParameterName(name = 'c')] androidx.compose.runtime.Composer, @[ParameterName(name = 'changed')] kotlin.Int, kotlin.Any?>");
        C5213m.m11200e(5, obj4);
        Object objMo1501o0 = ((InterfaceC2059s) obj4).mo1501o0(obj, obj2, obj3, composerImplMo1636j, Integer.valueOf(iM14521a | i10));
        C5332q0 c5332q0M1612T = composerImplMo1636j.m1612T();
        if (c5332q0M1612T != null) {
            c5332q0M1612T.f33605d = new InterfaceC2056p<InterfaceC0476a, Integer, C9072e>() { // from class: androidx.compose.runtime.internal.ComposableLambdaImpl$invoke$3
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // cm.InterfaceC2056p
                /* JADX INFO: renamed from: m0 */
                public final C9072e mo1337m0(InterfaceC0476a interfaceC0476a2, Integer num) {
                    InterfaceC0476a interfaceC0476a3 = interfaceC0476a2;
                    num.intValue();
                    C5207g.m11111f(interfaceC0476a3, "nc");
                    this.f3211b.m1854c(obj, obj2, obj3, interfaceC0476a3, i10 | 1);
                    return C9072e.f47360a;
                }
            };
        }
        return objMo1501o0;
    }

    /* JADX INFO: renamed from: d */
    public final Object m1855d(final Object obj, final Object obj2, final Object obj3, final Object obj4, InterfaceC0476a interfaceC0476a, final int i10) {
        C5207g.m11111f(interfaceC0476a, "c");
        ComposerImpl composerImplMo1636j = interfaceC0476a.mo1636j(this.f3199a);
        m1856e(composerImplMo1636j);
        int iM14521a = composerImplMo1636j.mo1665y(this) ? C7204a.m14521a(2, 4) : C7204a.m14521a(1, 4);
        Object obj5 = this.f3201c;
        C5207g.m11109d(obj5, "null cannot be cast to non-null type kotlin.Function6<@[ParameterName(name = 'p1')] kotlin.Any?, @[ParameterName(name = 'p2')] kotlin.Any?, @[ParameterName(name = 'p3')] kotlin.Any?, @[ParameterName(name = 'p4')] kotlin.Any?, @[ParameterName(name = 'c')] androidx.compose.runtime.Composer, @[ParameterName(name = 'changed')] kotlin.Int, kotlin.Any?>");
        C5213m.m11200e(6, obj5);
        Object objMo1858g0 = ((InterfaceC2060t) obj5).mo1858g0(obj, obj2, obj3, obj4, composerImplMo1636j, Integer.valueOf(iM14521a | i10));
        C5332q0 c5332q0M1612T = composerImplMo1636j.m1612T();
        if (c5332q0M1612T != null) {
            c5332q0M1612T.f33605d = new InterfaceC2056p<InterfaceC0476a, Integer, C9072e>() { // from class: androidx.compose.runtime.internal.ComposableLambdaImpl$invoke$4
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // cm.InterfaceC2056p
                /* JADX INFO: renamed from: m0 */
                public final C9072e mo1337m0(InterfaceC0476a interfaceC0476a2, Integer num) {
                    InterfaceC0476a interfaceC0476a3 = interfaceC0476a2;
                    num.intValue();
                    C5207g.m11111f(interfaceC0476a3, "nc");
                    this.f3216b.m1855d(obj, obj2, obj3, obj4, interfaceC0476a3, i10 | 1);
                    return C9072e.f47360a;
                }
            };
        }
        return objMo1858g0;
    }

    /* JADX INFO: renamed from: e */
    public final void m1856e(InterfaceC0476a interfaceC0476a) {
        C5332q0 c5332q0Mo1620b;
        if (this.f3200b && (c5332q0Mo1620b = interfaceC0476a.mo1620b()) != null) {
            interfaceC0476a.mo1667z(c5332q0Mo1620b);
            if (C7204a.m14524d(this.f3202d, c5332q0Mo1620b)) {
                this.f3202d = c5332q0Mo1620b;
                return;
            }
            ArrayList arrayList = this.f3203e;
            if (arrayList == null) {
                ArrayList arrayList2 = new ArrayList();
                this.f3203e = arrayList2;
                arrayList2.add(c5332q0Mo1620b);
                return;
            }
            int size = arrayList.size();
            for (int i10 = 0; i10 < size; i10++) {
                if (C7204a.m14524d((InterfaceC5330p0) arrayList.get(i10), c5332q0Mo1620b)) {
                    arrayList.set(i10, c5332q0Mo1620b);
                    return;
                }
            }
            arrayList.add(c5332q0Mo1620b);
        }
    }

    /* JADX INFO: renamed from: f */
    public final void m1857f(Lambda lambda) {
        C5207g.m11111f(lambda, "block");
        if (!C5207g.m11106a(this.f3201c, lambda)) {
            boolean z10 = this.f3201c == null;
            this.f3201c = lambda;
            if (!z10 && this.f3200b) {
                InterfaceC5330p0 interfaceC5330p0 = this.f3202d;
                if (interfaceC5330p0 != null) {
                    interfaceC5330p0.invalidate();
                    this.f3202d = null;
                }
                ArrayList arrayList = this.f3203e;
                if (arrayList != null) {
                    int size = arrayList.size();
                    for (int i10 = 0; i10 < size; i10++) {
                        ((InterfaceC5330p0) arrayList.get(i10)).invalidate();
                    }
                    arrayList.clear();
                }
            }
        }
    }

    @Override // cm.InterfaceC2060t
    /* JADX INFO: renamed from: g0 */
    public final /* bridge */ /* synthetic */ Object mo1858g0(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6) {
        return m1855d(obj, obj2, obj3, obj4, (InterfaceC0476a) obj5, ((Number) obj6).intValue());
    }

    @Override // cm.InterfaceC2056p
    /* JADX INFO: renamed from: m0 */
    public final Object mo1337m0(Object obj, Object obj2) {
        InterfaceC0476a interfaceC0476a = (InterfaceC0476a) obj;
        int iIntValue = ((Number) obj2).intValue();
        C5207g.m11111f(interfaceC0476a, "c");
        ComposerImpl composerImplMo1636j = interfaceC0476a.mo1636j(this.f3199a);
        m1856e(composerImplMo1636j);
        int iM14521a = iIntValue | (composerImplMo1636j.mo1665y(this) ? C7204a.m14521a(2, 0) : C7204a.m14521a(1, 0));
        Object obj3 = this.f3201c;
        C5207g.m11109d(obj3, "null cannot be cast to non-null type kotlin.Function2<@[ParameterName(name = 'c')] androidx.compose.runtime.Composer, @[ParameterName(name = 'changed')] kotlin.Int, kotlin.Any?>");
        C5213m.m11200e(2, obj3);
        Object objMo1337m0 = ((InterfaceC2056p) obj3).mo1337m0(composerImplMo1636j, Integer.valueOf(iM14521a));
        C5332q0 c5332q0M1612T = composerImplMo1636j.m1612T();
        if (c5332q0M1612T != null) {
            C5213m.m11200e(2, this);
            c5332q0M1612T.f33605d = this;
        }
        return objMo1337m0;
    }

    @Override // cm.InterfaceC2059s
    /* JADX INFO: renamed from: o0 */
    public final /* bridge */ /* synthetic */ Object mo1501o0(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        return m1854c(obj, obj2, obj3, (InterfaceC0476a) obj4, ((Number) obj5).intValue());
    }
}
