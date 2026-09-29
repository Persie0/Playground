package androidx.compose.foundation.layout;

import androidx.compose.p017ui.InterfaceC0500b;
import androidx.compose.p017ui.platform.C0635j1;
import androidx.compose.p017ui.platform.C0661s0;
import androidx.compose.p017ui.platform.InspectableValueKt;
import androidx.compose.p017ui.unit.LayoutDirection;
import cm.InterfaceC2052l;
import cm.InterfaceC2056p;
import dm.C5207g;
import p284o0.C7886b;
import p284o0.InterfaceC7885a;
import p338qd.C8573r0;
import p470x1.C10020h;
import p470x1.C10022j;
import sl.C9072e;

/* JADX INFO: loaded from: classes.dex */
public final class SizeKt {

    /* JADX INFO: renamed from: a */
    public static final FillModifier f2390a;

    /* JADX INFO: renamed from: b */
    public static final FillModifier f2391b;

    /* JADX INFO: renamed from: c */
    public static final WrapContentModifier f2392c;

    /* JADX INFO: renamed from: d */
    public static final WrapContentModifier f2393d;

    /* JADX INFO: renamed from: e */
    public static final WrapContentModifier f2394e;

    /* JADX INFO: renamed from: f */
    public static final WrapContentModifier f2395f;

    /* JADX INFO: renamed from: g */
    public static final WrapContentModifier f2396g;

    /* JADX INFO: renamed from: h */
    public static final WrapContentModifier f2397h;

    static {
        final float f3 = 1.0f;
        f2390a = new FillModifier(Direction.Horizontal, 1.0f, new InterfaceC2052l<C0661s0, C9072e>() { // from class: androidx.compose.foundation.layout.SizeKt$createFillWidthModifier$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // cm.InterfaceC2052l
            /* JADX INFO: renamed from: n */
            public final C9072e mo528n(C0661s0 c0661s0) {
                C0661s0 c0661s1 = c0661s0;
                C5207g.m11111f(c0661s1, "$this$$receiver");
                c0661s1.f4341a.m2359b(Float.valueOf(f3), "fraction");
                return C9072e.f47360a;
            }
        });
        C5207g.m11111f(Direction.Vertical, "direction");
        f2391b = new FillModifier(Direction.Both, 1.0f, new InterfaceC2052l<C0661s0, C9072e>() { // from class: androidx.compose.foundation.layout.SizeKt$createFillSizeModifier$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // cm.InterfaceC2052l
            /* JADX INFO: renamed from: n */
            public final C9072e mo528n(C0661s0 c0661s0) {
                C0661s0 c0661s1 = c0661s0;
                C5207g.m11111f(c0661s1, "$this$$receiver");
                c0661s1.f4341a.m2359b(Float.valueOf(f3), "fraction");
                return C9072e.f47360a;
            }
        });
        f2392c = m1506c(InterfaceC7885a.a.f42996h, false);
        f2393d = m1506c(InterfaceC7885a.a.f42995g, false);
        f2394e = m1504a(InterfaceC7885a.a.f42994f, false);
        f2395f = m1504a(InterfaceC7885a.a.f42993e, false);
        f2396g = m1505b(InterfaceC7885a.a.f42991c, false);
        f2397h = m1505b(InterfaceC7885a.a.f42989a, false);
    }

    /* JADX INFO: renamed from: a */
    public static final WrapContentModifier m1504a(final InterfaceC7885a.c cVar, final boolean z10) {
        return new WrapContentModifier(Direction.Vertical, z10, new InterfaceC2056p<C10022j, LayoutDirection, C10020h>() { // from class: androidx.compose.foundation.layout.SizeKt$createWrapContentHeightModifier$1
            {
                super(2);
            }

            @Override // cm.InterfaceC2056p
            /* JADX INFO: renamed from: m0 */
            public final C10020h mo1337m0(C10022j c10022j, LayoutDirection layoutDirection) {
                long j10 = c10022j.f50980a;
                C5207g.m11111f(layoutDirection, "<anonymous parameter 1>");
                return new C10020h(C8573r0.m16752r(0, cVar.mo15657a(C10022j.m18628b(j10))));
            }
        }, cVar, new InterfaceC2052l<C0661s0, C9072e>() { // from class: androidx.compose.foundation.layout.SizeKt$createWrapContentHeightModifier$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // cm.InterfaceC2052l
            /* JADX INFO: renamed from: n */
            public final C9072e mo528n(C0661s0 c0661s0) {
                C0661s0 c0661s1 = c0661s0;
                C5207g.m11111f(c0661s1, "$this$$receiver");
                C0635j1 c0635j1 = c0661s1.f4341a;
                c0635j1.m2359b(cVar, "align");
                c0635j1.m2359b(Boolean.valueOf(z10), "unbounded");
                return C9072e.f47360a;
            }
        });
    }

    /* JADX INFO: renamed from: b */
    public static final WrapContentModifier m1505b(final InterfaceC7885a interfaceC7885a, final boolean z10) {
        return new WrapContentModifier(Direction.Both, z10, new InterfaceC2056p<C10022j, LayoutDirection, C10020h>() { // from class: androidx.compose.foundation.layout.SizeKt$createWrapContentSizeModifier$1
            {
                super(2);
            }

            @Override // cm.InterfaceC2056p
            /* JADX INFO: renamed from: m0 */
            public final C10020h mo1337m0(C10022j c10022j, LayoutDirection layoutDirection) {
                long j10 = c10022j.f50980a;
                LayoutDirection layoutDirection2 = layoutDirection;
                C5207g.m11111f(layoutDirection2, "layoutDirection");
                return new C10020h(interfaceC7885a.mo15655a(0L, j10, layoutDirection2));
            }
        }, interfaceC7885a, new InterfaceC2052l<C0661s0, C9072e>() { // from class: androidx.compose.foundation.layout.SizeKt$createWrapContentSizeModifier$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // cm.InterfaceC2052l
            /* JADX INFO: renamed from: n */
            public final C9072e mo528n(C0661s0 c0661s0) {
                C0661s0 c0661s1 = c0661s0;
                C5207g.m11111f(c0661s1, "$this$$receiver");
                C0635j1 c0635j1 = c0661s1.f4341a;
                c0635j1.m2359b(interfaceC7885a, "align");
                c0635j1.m2359b(Boolean.valueOf(z10), "unbounded");
                return C9072e.f47360a;
            }
        });
    }

    /* JADX INFO: renamed from: c */
    public static final WrapContentModifier m1506c(final InterfaceC7885a.b bVar, final boolean z10) {
        return new WrapContentModifier(Direction.Horizontal, z10, new InterfaceC2056p<C10022j, LayoutDirection, C10020h>() { // from class: androidx.compose.foundation.layout.SizeKt$createWrapContentWidthModifier$1
            {
                super(2);
            }

            @Override // cm.InterfaceC2056p
            /* JADX INFO: renamed from: m0 */
            public final C10020h mo1337m0(C10022j c10022j, LayoutDirection layoutDirection) {
                long j10 = c10022j.f50980a;
                LayoutDirection layoutDirection2 = layoutDirection;
                C5207g.m11111f(layoutDirection2, "layoutDirection");
                return new C10020h(C8573r0.m16752r(bVar.mo15656a((int) (j10 >> 32), layoutDirection2), 0));
            }
        }, bVar, new InterfaceC2052l<C0661s0, C9072e>() { // from class: androidx.compose.foundation.layout.SizeKt$createWrapContentWidthModifier$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // cm.InterfaceC2052l
            /* JADX INFO: renamed from: n */
            public final C9072e mo528n(C0661s0 c0661s0) {
                C0661s0 c0661s1 = c0661s0;
                C5207g.m11111f(c0661s1, "$this$$receiver");
                C0635j1 c0635j1 = c0661s1.f4341a;
                c0635j1.m2359b(bVar, "align");
                c0635j1.m2359b(Boolean.valueOf(z10), "unbounded");
                return C9072e.f47360a;
            }
        });
    }

    /* JADX INFO: renamed from: d */
    public static InterfaceC0500b m1507d() {
        FillModifier fillModifier = f2391b;
        C5207g.m11111f(fillModifier, "other");
        return fillModifier;
    }

    /* JADX INFO: renamed from: e */
    public static InterfaceC0500b m1508e(InterfaceC0500b interfaceC0500b) {
        C5207g.m11111f(interfaceC0500b, "<this>");
        return interfaceC0500b.mo1929K(f2390a);
    }

    /* JADX INFO: renamed from: f */
    public static final InterfaceC0500b m1509f(InterfaceC0500b interfaceC0500b, float f3) {
        C5207g.m11111f(interfaceC0500b, "$this$height");
        return interfaceC0500b.mo1929K(new SizeModifier(0.0f, f3, 0.0f, f3, InspectableValueKt.f4184a, 5));
    }

    /* JADX INFO: renamed from: g */
    public static final InterfaceC0500b m1510g(InterfaceC0500b interfaceC0500b, float f3) {
        C5207g.m11111f(interfaceC0500b, "$this$size");
        return interfaceC0500b.mo1929K(new SizeModifier(f3, f3, f3, f3, InspectableValueKt.f4184a));
    }

    /* JADX INFO: renamed from: h */
    public static final InterfaceC0500b m1511h(InterfaceC0500b interfaceC0500b, float f3) {
        C5207g.m11111f(interfaceC0500b, "$this$width");
        return interfaceC0500b.mo1929K(new SizeModifier(f3, 0.0f, f3, 0.0f, InspectableValueKt.f4184a, 10));
    }

    /* JADX INFO: renamed from: i */
    public static InterfaceC0500b m1512i(InterfaceC0500b interfaceC0500b) {
        WrapContentModifier wrapContentModifierM1504a;
        C7886b.b bVar = InterfaceC7885a.a.f42994f;
        C5207g.m11111f(interfaceC0500b, "<this>");
        if (C5207g.m11106a(bVar, bVar)) {
            wrapContentModifierM1504a = f2394e;
        } else {
            wrapContentModifierM1504a = C5207g.m11106a(bVar, InterfaceC7885a.a.f42993e) ? f2395f : m1504a(bVar, false);
        }
        return interfaceC0500b.mo1929K(wrapContentModifierM1504a);
    }

    /* JADX INFO: renamed from: j */
    public static InterfaceC0500b m1513j(InterfaceC0500b interfaceC0500b, C7886b c7886b, int i10) {
        WrapContentModifier wrapContentModifierM1505b;
        int i11 = i10 & 1;
        C7886b c7886b2 = InterfaceC7885a.a.f42991c;
        if (i11 != 0) {
            c7886b = c7886b2;
        }
        C5207g.m11111f(interfaceC0500b, "<this>");
        C5207g.m11111f(c7886b, "align");
        if (C5207g.m11106a(c7886b, c7886b2)) {
            wrapContentModifierM1505b = f2396g;
        } else {
            wrapContentModifierM1505b = C5207g.m11106a(c7886b, InterfaceC7885a.a.f42989a) ? f2397h : m1505b(c7886b, false);
        }
        return interfaceC0500b.mo1929K(wrapContentModifierM1505b);
    }

    /* JADX INFO: renamed from: k */
    public static InterfaceC0500b m1514k(InterfaceC0500b interfaceC0500b) {
        WrapContentModifier wrapContentModifierM1506c;
        C7886b.a aVar = InterfaceC7885a.a.f42996h;
        C5207g.m11111f(interfaceC0500b, "<this>");
        if (C5207g.m11106a(aVar, aVar)) {
            wrapContentModifierM1506c = f2392c;
        } else {
            wrapContentModifierM1506c = C5207g.m11106a(aVar, InterfaceC7885a.a.f42995g) ? f2393d : m1506c(aVar, false);
        }
        return interfaceC0500b.mo1929K(wrapContentModifierM1506c);
    }
}
