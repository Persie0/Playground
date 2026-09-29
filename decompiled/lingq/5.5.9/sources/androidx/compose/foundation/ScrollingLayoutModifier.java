package androidx.compose.foundation;

import ae.C0062b;
import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.p017ui.layout.AbstractC0526g;
import androidx.compose.p017ui.layout.InterfaceC0521b;
import androidx.compose.p017ui.layout.InterfaceC0524e;
import cm.InterfaceC2052l;
import dm.C5207g;
import kotlin.collections.C6753d;
import p127g1.InterfaceC5644h;
import p127g1.InterfaceC5645i;
import p127g1.InterfaceC5651o;
import p127g1.InterfaceC5653q;
import p470x1.C10013a;
import sl.C9072e;

/* JADX INFO: loaded from: classes.dex */
public final class ScrollingLayoutModifier implements InterfaceC0521b {

    /* JADX INFO: renamed from: a */
    public final ScrollState f1938a;

    /* JADX INFO: renamed from: b */
    public final boolean f1939b;

    /* JADX INFO: renamed from: c */
    public final boolean f1940c;

    public ScrollingLayoutModifier(ScrollState scrollState, boolean z10, boolean z11) {
        C5207g.m11111f(scrollState, "scrollerState");
        this.f1938a = scrollState;
        this.f1939b = z10;
        this.f1940c = z11;
    }

    @Override // androidx.compose.p017ui.layout.InterfaceC0521b
    /* JADX INFO: renamed from: a */
    public final int mo1422a(InterfaceC5645i interfaceC5645i, InterfaceC5644h interfaceC5644h, int i10) {
        C5207g.m11111f(interfaceC5645i, "<this>");
        return this.f1940c ? interfaceC5644h.mo2045a(i10) : interfaceC5644h.mo2045a(Integer.MAX_VALUE);
    }

    @Override // androidx.compose.p017ui.layout.InterfaceC0521b
    /* JADX INFO: renamed from: b */
    public final int mo1423b(InterfaceC5645i interfaceC5645i, InterfaceC5644h interfaceC5644h, int i10) {
        C5207g.m11111f(interfaceC5645i, "<this>");
        return this.f1940c ? interfaceC5644h.mo2044R(i10) : interfaceC5644h.mo2044R(Integer.MAX_VALUE);
    }

    @Override // androidx.compose.p017ui.layout.InterfaceC0521b
    /* JADX INFO: renamed from: e */
    public final InterfaceC5653q mo1352e(InterfaceC0524e interfaceC0524e, InterfaceC5651o interfaceC5651o, long j10) {
        C5207g.m11111f(interfaceC0524e, "$this$measure");
        boolean z10 = this.f1940c;
        Orientation orientation = z10 ? Orientation.Vertical : Orientation.Horizontal;
        C5207g.m11111f(orientation, "orientation");
        if (orientation == Orientation.Vertical) {
            if (!(C10013a.m18602g(j10) != Integer.MAX_VALUE)) {
                throw new IllegalStateException("Vertically scrollable component was measured with an infinity maximum height constraints, which is disallowed. One of the common reasons is nesting layouts like LazyColumn and Column(Modifier.verticalScroll()). If you want to add a header before the list of items please add a header as a separate item() before the main items() inside the LazyColumn scope. There are could be other reasons for this to happen: your ComposeView was added into a LinearLayout with some weight, you applied Modifier.wrapContentSize(unbounded = true) or wrote a custom layout. Please try to remove the source of infinite constraints in the hierarchy above the scrolling container.".toString());
            }
        } else {
            if (!(C10013a.m18603h(j10) != Integer.MAX_VALUE)) {
                throw new IllegalStateException("Horizontally scrollable component was measured with an infinity maximum width constraints, which is disallowed. One of the common reasons is nesting layouts like LazyRow and Row(Modifier.horizontalScroll()). If you want to add a header before the list of items please add a header as a separate item() before the main items() inside the LazyRow scope. There are could be other reasons for this to happen: your ComposeView was added into a LinearLayout with some weight, you applied Modifier.wrapContentSize(unbounded = true) or wrote a custom layout. Please try to remove the source of infinite constraints in the hierarchy above the scrolling container.".toString());
            }
        }
        final AbstractC0526g abstractC0526gMo2048w = interfaceC5651o.mo2048w(C10013a.m18596a(j10, 0, z10 ? C10013a.m18603h(j10) : Integer.MAX_VALUE, 0, z10 ? Integer.MAX_VALUE : C10013a.m18602g(j10), 5));
        int i10 = abstractC0526gMo2048w.f3686a;
        int iM18603h = C10013a.m18603h(j10);
        if (i10 > iM18603h) {
            i10 = iM18603h;
        }
        int i11 = abstractC0526gMo2048w.f3687b;
        int iM18602g = C10013a.m18602g(j10);
        if (i11 > iM18602g) {
            i11 = iM18602g;
        }
        final int i12 = abstractC0526gMo2048w.f3687b - i11;
        int i13 = abstractC0526gMo2048w.f3686a - i10;
        if (!z10) {
            i12 = i13;
        }
        ScrollState scrollState = this.f1938a;
        scrollState.f1928d.setValue(Integer.valueOf(i12));
        if (scrollState.m1421g() > i12) {
            scrollState.f1925a.setValue(Integer.valueOf(i12));
        }
        scrollState.f1926b.setValue(Integer.valueOf(z10 ? i11 : i10));
        return interfaceC0524e.m2043P(i10, i11, C6753d.m13459L0(), new InterfaceC2052l<AbstractC0526g.a, C9072e>() { // from class: androidx.compose.foundation.ScrollingLayoutModifier$measure$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // cm.InterfaceC2052l
            /* JADX INFO: renamed from: n */
            public final C9072e mo528n(AbstractC0526g.a aVar) {
                AbstractC0526g.a aVar2 = aVar;
                C5207g.m11111f(aVar2, "$this$layout");
                ScrollingLayoutModifier scrollingLayoutModifier = this.f1941b;
                int iM1421g = scrollingLayoutModifier.f1938a.m1421g();
                int i14 = i12;
                int iM361k0 = C0062b.m361k0(iM1421g, 0, i14);
                int i15 = scrollingLayoutModifier.f1939b ? iM361k0 - i14 : -iM361k0;
                boolean z11 = scrollingLayoutModifier.f1940c;
                AbstractC0526g.a.m2060f(aVar2, abstractC0526gMo2048w, z11 ? 0 : i15, z11 ? i15 : 0);
                return C9072e.f47360a;
            }
        });
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ScrollingLayoutModifier)) {
            return false;
        }
        ScrollingLayoutModifier scrollingLayoutModifier = (ScrollingLayoutModifier) obj;
        return C5207g.m11106a(this.f1938a, scrollingLayoutModifier.f1938a) && this.f1939b == scrollingLayoutModifier.f1939b && this.f1940c == scrollingLayoutModifier.f1940c;
    }

    @Override // androidx.compose.p017ui.layout.InterfaceC0521b
    /* JADX INFO: renamed from: f */
    public final int mo1424f(InterfaceC5645i interfaceC5645i, InterfaceC5644h interfaceC5644h, int i10) {
        C5207g.m11111f(interfaceC5645i, "<this>");
        return this.f1940c ? interfaceC5644h.mo2047u(Integer.MAX_VALUE) : interfaceC5644h.mo2047u(i10);
    }

    @Override // androidx.compose.p017ui.layout.InterfaceC0521b
    /* JADX INFO: renamed from: g */
    public final int mo1425g(InterfaceC5645i interfaceC5645i, InterfaceC5644h interfaceC5644h, int i10) {
        C5207g.m11111f(interfaceC5645i, "<this>");
        return this.f1940c ? interfaceC5644h.mo2046s(Integer.MAX_VALUE) : interfaceC5644h.mo2046s(i10);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v3, types: [int] */
    /* JADX WARN: Type inference failed for: r0v5, types: [int] */
    /* JADX WARN: Type inference failed for: r1v0 */
    /* JADX WARN: Type inference failed for: r1v1 */
    /* JADX WARN: Type inference failed for: r1v2, types: [int] */
    /* JADX WARN: Type inference failed for: r2v1, types: [int] */
    /* JADX WARN: Type inference failed for: r2v3 */
    /* JADX WARN: Type inference failed for: r2v4 */
    public final int hashCode() {
        int iHashCode = this.f1938a.hashCode() * 31;
        ?? r10 = 1;
        boolean z10 = this.f1939b;
        ?? r11 = z10;
        if (z10) {
            r11 = 1;
        }
        int i10 = (iHashCode + r11) * 31;
        boolean z11 = this.f1940c;
        if (!z11) {
            r10 = z11;
        }
        return i10 + r10;
    }

    public final String toString() {
        return "ScrollingLayoutModifier(scrollerState=" + this.f1938a + ", isReversed=" + this.f1939b + ", isVertical=" + this.f1940c + ')';
    }
}
