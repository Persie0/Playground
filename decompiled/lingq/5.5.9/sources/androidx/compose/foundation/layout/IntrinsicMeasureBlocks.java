package androidx.compose.foundation.layout;

import cm.InterfaceC2056p;
import cm.InterfaceC2057q;
import dm.C5207g;
import java.util.List;
import p127g1.InterfaceC5644h;
import p338qd.C8584v;

/* JADX INFO: loaded from: classes.dex */
public final class IntrinsicMeasureBlocks {

    /* JADX INFO: renamed from: a */
    public static final InterfaceC2057q<List<? extends InterfaceC5644h>, Integer, Integer, Integer> f2334a = new InterfaceC2057q<List<? extends InterfaceC5644h>, Integer, Integer, Integer>() { // from class: androidx.compose.foundation.layout.IntrinsicMeasureBlocks$HorizontalMinWidth$1
        @Override // cm.InterfaceC2057q
        /* JADX INFO: renamed from: M */
        public final Integer mo1343M(List<? extends InterfaceC5644h> list, Integer num, Integer num2) {
            List<? extends InterfaceC5644h> list2 = list;
            int iIntValue = num.intValue();
            int iIntValue2 = num2.intValue();
            C5207g.m11111f(list2, "measurables");
            C04281 c04281 = new InterfaceC2056p<InterfaceC5644h, Integer, Integer>() { // from class: androidx.compose.foundation.layout.IntrinsicMeasureBlocks$HorizontalMinWidth$1.1
                @Override // cm.InterfaceC2056p
                /* JADX INFO: renamed from: m0 */
                public final Integer mo1337m0(InterfaceC5644h interfaceC5644h, Integer num3) {
                    InterfaceC5644h interfaceC5644h2 = interfaceC5644h;
                    int iIntValue3 = num3.intValue();
                    C5207g.m11111f(interfaceC5644h2, "$this$intrinsicSize");
                    return Integer.valueOf(interfaceC5644h2.mo2046s(iIntValue3));
                }
            };
            C04292 c04292 = new InterfaceC2056p<InterfaceC5644h, Integer, Integer>() { // from class: androidx.compose.foundation.layout.IntrinsicMeasureBlocks$HorizontalMinWidth$1.2
                @Override // cm.InterfaceC2056p
                /* JADX INFO: renamed from: m0 */
                public final Integer mo1337m0(InterfaceC5644h interfaceC5644h, Integer num3) {
                    InterfaceC5644h interfaceC5644h2 = interfaceC5644h;
                    int iIntValue3 = num3.intValue();
                    C5207g.m11111f(interfaceC5644h2, "$this$intrinsicSize");
                    return Integer.valueOf(interfaceC5644h2.mo2045a(iIntValue3));
                }
            };
            LayoutOrientation layoutOrientation = LayoutOrientation.Horizontal;
            return Integer.valueOf(C8584v.m16789n(list2, c04281, c04292, iIntValue, iIntValue2, layoutOrientation, layoutOrientation));
        }
    };

    /* JADX INFO: renamed from: b */
    public static final InterfaceC2057q<List<? extends InterfaceC5644h>, Integer, Integer, Integer> f2335b = new InterfaceC2057q<List<? extends InterfaceC5644h>, Integer, Integer, Integer>() { // from class: androidx.compose.foundation.layout.IntrinsicMeasureBlocks$VerticalMinWidth$1
        @Override // cm.InterfaceC2057q
        /* JADX INFO: renamed from: M */
        public final Integer mo1343M(List<? extends InterfaceC5644h> list, Integer num, Integer num2) {
            List<? extends InterfaceC5644h> list2 = list;
            int iIntValue = num.intValue();
            int iIntValue2 = num2.intValue();
            C5207g.m11111f(list2, "measurables");
            return Integer.valueOf(C8584v.m16789n(list2, new InterfaceC2056p<InterfaceC5644h, Integer, Integer>() { // from class: androidx.compose.foundation.layout.IntrinsicMeasureBlocks$VerticalMinWidth$1.1
                @Override // cm.InterfaceC2056p
                /* JADX INFO: renamed from: m0 */
                public final Integer mo1337m0(InterfaceC5644h interfaceC5644h, Integer num3) {
                    InterfaceC5644h interfaceC5644h2 = interfaceC5644h;
                    int iIntValue3 = num3.intValue();
                    C5207g.m11111f(interfaceC5644h2, "$this$intrinsicSize");
                    return Integer.valueOf(interfaceC5644h2.mo2046s(iIntValue3));
                }
            }, new InterfaceC2056p<InterfaceC5644h, Integer, Integer>() { // from class: androidx.compose.foundation.layout.IntrinsicMeasureBlocks$VerticalMinWidth$1.2
                @Override // cm.InterfaceC2056p
                /* JADX INFO: renamed from: m0 */
                public final Integer mo1337m0(InterfaceC5644h interfaceC5644h, Integer num3) {
                    InterfaceC5644h interfaceC5644h2 = interfaceC5644h;
                    int iIntValue3 = num3.intValue();
                    C5207g.m11111f(interfaceC5644h2, "$this$intrinsicSize");
                    return Integer.valueOf(interfaceC5644h2.mo2045a(iIntValue3));
                }
            }, iIntValue, iIntValue2, LayoutOrientation.Vertical, LayoutOrientation.Horizontal));
        }
    };

    /* JADX INFO: renamed from: c */
    public static final InterfaceC2057q<List<? extends InterfaceC5644h>, Integer, Integer, Integer> f2336c = new InterfaceC2057q<List<? extends InterfaceC5644h>, Integer, Integer, Integer>() { // from class: androidx.compose.foundation.layout.IntrinsicMeasureBlocks$HorizontalMinHeight$1
        @Override // cm.InterfaceC2057q
        /* JADX INFO: renamed from: M */
        public final Integer mo1343M(List<? extends InterfaceC5644h> list, Integer num, Integer num2) {
            List<? extends InterfaceC5644h> list2 = list;
            int iIntValue = num.intValue();
            int iIntValue2 = num2.intValue();
            C5207g.m11111f(list2, "measurables");
            return Integer.valueOf(C8584v.m16789n(list2, new InterfaceC2056p<InterfaceC5644h, Integer, Integer>() { // from class: androidx.compose.foundation.layout.IntrinsicMeasureBlocks$HorizontalMinHeight$1.1
                @Override // cm.InterfaceC2056p
                /* JADX INFO: renamed from: m0 */
                public final Integer mo1337m0(InterfaceC5644h interfaceC5644h, Integer num3) {
                    InterfaceC5644h interfaceC5644h2 = interfaceC5644h;
                    int iIntValue3 = num3.intValue();
                    C5207g.m11111f(interfaceC5644h2, "$this$intrinsicSize");
                    return Integer.valueOf(interfaceC5644h2.mo2044R(iIntValue3));
                }
            }, new InterfaceC2056p<InterfaceC5644h, Integer, Integer>() { // from class: androidx.compose.foundation.layout.IntrinsicMeasureBlocks$HorizontalMinHeight$1.2
                @Override // cm.InterfaceC2056p
                /* JADX INFO: renamed from: m0 */
                public final Integer mo1337m0(InterfaceC5644h interfaceC5644h, Integer num3) {
                    InterfaceC5644h interfaceC5644h2 = interfaceC5644h;
                    int iIntValue3 = num3.intValue();
                    C5207g.m11111f(interfaceC5644h2, "$this$intrinsicSize");
                    return Integer.valueOf(interfaceC5644h2.mo2047u(iIntValue3));
                }
            }, iIntValue, iIntValue2, LayoutOrientation.Horizontal, LayoutOrientation.Vertical));
        }
    };

    /* JADX INFO: renamed from: d */
    public static final InterfaceC2057q<List<? extends InterfaceC5644h>, Integer, Integer, Integer> f2337d = new InterfaceC2057q<List<? extends InterfaceC5644h>, Integer, Integer, Integer>() { // from class: androidx.compose.foundation.layout.IntrinsicMeasureBlocks$VerticalMinHeight$1
        @Override // cm.InterfaceC2057q
        /* JADX INFO: renamed from: M */
        public final Integer mo1343M(List<? extends InterfaceC5644h> list, Integer num, Integer num2) {
            List<? extends InterfaceC5644h> list2 = list;
            int iIntValue = num.intValue();
            int iIntValue2 = num2.intValue();
            C5207g.m11111f(list2, "measurables");
            C04341 c04341 = new InterfaceC2056p<InterfaceC5644h, Integer, Integer>() { // from class: androidx.compose.foundation.layout.IntrinsicMeasureBlocks$VerticalMinHeight$1.1
                @Override // cm.InterfaceC2056p
                /* JADX INFO: renamed from: m0 */
                public final Integer mo1337m0(InterfaceC5644h interfaceC5644h, Integer num3) {
                    InterfaceC5644h interfaceC5644h2 = interfaceC5644h;
                    int iIntValue3 = num3.intValue();
                    C5207g.m11111f(interfaceC5644h2, "$this$intrinsicSize");
                    return Integer.valueOf(interfaceC5644h2.mo2044R(iIntValue3));
                }
            };
            C04352 c04352 = new InterfaceC2056p<InterfaceC5644h, Integer, Integer>() { // from class: androidx.compose.foundation.layout.IntrinsicMeasureBlocks$VerticalMinHeight$1.2
                @Override // cm.InterfaceC2056p
                /* JADX INFO: renamed from: m0 */
                public final Integer mo1337m0(InterfaceC5644h interfaceC5644h, Integer num3) {
                    InterfaceC5644h interfaceC5644h2 = interfaceC5644h;
                    int iIntValue3 = num3.intValue();
                    C5207g.m11111f(interfaceC5644h2, "$this$intrinsicSize");
                    return Integer.valueOf(interfaceC5644h2.mo2047u(iIntValue3));
                }
            };
            LayoutOrientation layoutOrientation = LayoutOrientation.Vertical;
            return Integer.valueOf(C8584v.m16789n(list2, c04341, c04352, iIntValue, iIntValue2, layoutOrientation, layoutOrientation));
        }
    };

    /* JADX INFO: renamed from: e */
    public static final InterfaceC2057q<List<? extends InterfaceC5644h>, Integer, Integer, Integer> f2338e = new InterfaceC2057q<List<? extends InterfaceC5644h>, Integer, Integer, Integer>() { // from class: androidx.compose.foundation.layout.IntrinsicMeasureBlocks$HorizontalMaxWidth$1
        @Override // cm.InterfaceC2057q
        /* JADX INFO: renamed from: M */
        public final Integer mo1343M(List<? extends InterfaceC5644h> list, Integer num, Integer num2) {
            List<? extends InterfaceC5644h> list2 = list;
            int iIntValue = num.intValue();
            int iIntValue2 = num2.intValue();
            C5207g.m11111f(list2, "measurables");
            C04241 c04241 = new InterfaceC2056p<InterfaceC5644h, Integer, Integer>() { // from class: androidx.compose.foundation.layout.IntrinsicMeasureBlocks$HorizontalMaxWidth$1.1
                @Override // cm.InterfaceC2056p
                /* JADX INFO: renamed from: m0 */
                public final Integer mo1337m0(InterfaceC5644h interfaceC5644h, Integer num3) {
                    InterfaceC5644h interfaceC5644h2 = interfaceC5644h;
                    int iIntValue3 = num3.intValue();
                    C5207g.m11111f(interfaceC5644h2, "$this$intrinsicSize");
                    return Integer.valueOf(interfaceC5644h2.mo2047u(iIntValue3));
                }
            };
            C04252 c04252 = new InterfaceC2056p<InterfaceC5644h, Integer, Integer>() { // from class: androidx.compose.foundation.layout.IntrinsicMeasureBlocks$HorizontalMaxWidth$1.2
                @Override // cm.InterfaceC2056p
                /* JADX INFO: renamed from: m0 */
                public final Integer mo1337m0(InterfaceC5644h interfaceC5644h, Integer num3) {
                    InterfaceC5644h interfaceC5644h2 = interfaceC5644h;
                    int iIntValue3 = num3.intValue();
                    C5207g.m11111f(interfaceC5644h2, "$this$intrinsicSize");
                    return Integer.valueOf(interfaceC5644h2.mo2045a(iIntValue3));
                }
            };
            LayoutOrientation layoutOrientation = LayoutOrientation.Horizontal;
            return Integer.valueOf(C8584v.m16789n(list2, c04241, c04252, iIntValue, iIntValue2, layoutOrientation, layoutOrientation));
        }
    };

    /* JADX INFO: renamed from: f */
    public static final InterfaceC2057q<List<? extends InterfaceC5644h>, Integer, Integer, Integer> f2339f = new InterfaceC2057q<List<? extends InterfaceC5644h>, Integer, Integer, Integer>() { // from class: androidx.compose.foundation.layout.IntrinsicMeasureBlocks$VerticalMaxWidth$1
        @Override // cm.InterfaceC2057q
        /* JADX INFO: renamed from: M */
        public final Integer mo1343M(List<? extends InterfaceC5644h> list, Integer num, Integer num2) {
            List<? extends InterfaceC5644h> list2 = list;
            int iIntValue = num.intValue();
            int iIntValue2 = num2.intValue();
            C5207g.m11111f(list2, "measurables");
            return Integer.valueOf(C8584v.m16789n(list2, new InterfaceC2056p<InterfaceC5644h, Integer, Integer>() { // from class: androidx.compose.foundation.layout.IntrinsicMeasureBlocks$VerticalMaxWidth$1.1
                @Override // cm.InterfaceC2056p
                /* JADX INFO: renamed from: m0 */
                public final Integer mo1337m0(InterfaceC5644h interfaceC5644h, Integer num3) {
                    InterfaceC5644h interfaceC5644h2 = interfaceC5644h;
                    int iIntValue3 = num3.intValue();
                    C5207g.m11111f(interfaceC5644h2, "$this$intrinsicSize");
                    return Integer.valueOf(interfaceC5644h2.mo2047u(iIntValue3));
                }
            }, new InterfaceC2056p<InterfaceC5644h, Integer, Integer>() { // from class: androidx.compose.foundation.layout.IntrinsicMeasureBlocks$VerticalMaxWidth$1.2
                @Override // cm.InterfaceC2056p
                /* JADX INFO: renamed from: m0 */
                public final Integer mo1337m0(InterfaceC5644h interfaceC5644h, Integer num3) {
                    InterfaceC5644h interfaceC5644h2 = interfaceC5644h;
                    int iIntValue3 = num3.intValue();
                    C5207g.m11111f(interfaceC5644h2, "$this$intrinsicSize");
                    return Integer.valueOf(interfaceC5644h2.mo2045a(iIntValue3));
                }
            }, iIntValue, iIntValue2, LayoutOrientation.Vertical, LayoutOrientation.Horizontal));
        }
    };

    /* JADX INFO: renamed from: g */
    public static final InterfaceC2057q<List<? extends InterfaceC5644h>, Integer, Integer, Integer> f2340g = new InterfaceC2057q<List<? extends InterfaceC5644h>, Integer, Integer, Integer>() { // from class: androidx.compose.foundation.layout.IntrinsicMeasureBlocks$HorizontalMaxHeight$1
        @Override // cm.InterfaceC2057q
        /* JADX INFO: renamed from: M */
        public final Integer mo1343M(List<? extends InterfaceC5644h> list, Integer num, Integer num2) {
            List<? extends InterfaceC5644h> list2 = list;
            int iIntValue = num.intValue();
            int iIntValue2 = num2.intValue();
            C5207g.m11111f(list2, "measurables");
            return Integer.valueOf(C8584v.m16789n(list2, new InterfaceC2056p<InterfaceC5644h, Integer, Integer>() { // from class: androidx.compose.foundation.layout.IntrinsicMeasureBlocks$HorizontalMaxHeight$1.1
                @Override // cm.InterfaceC2056p
                /* JADX INFO: renamed from: m0 */
                public final Integer mo1337m0(InterfaceC5644h interfaceC5644h, Integer num3) {
                    InterfaceC5644h interfaceC5644h2 = interfaceC5644h;
                    int iIntValue3 = num3.intValue();
                    C5207g.m11111f(interfaceC5644h2, "$this$intrinsicSize");
                    return Integer.valueOf(interfaceC5644h2.mo2045a(iIntValue3));
                }
            }, new InterfaceC2056p<InterfaceC5644h, Integer, Integer>() { // from class: androidx.compose.foundation.layout.IntrinsicMeasureBlocks$HorizontalMaxHeight$1.2
                @Override // cm.InterfaceC2056p
                /* JADX INFO: renamed from: m0 */
                public final Integer mo1337m0(InterfaceC5644h interfaceC5644h, Integer num3) {
                    InterfaceC5644h interfaceC5644h2 = interfaceC5644h;
                    int iIntValue3 = num3.intValue();
                    C5207g.m11111f(interfaceC5644h2, "$this$intrinsicSize");
                    return Integer.valueOf(interfaceC5644h2.mo2047u(iIntValue3));
                }
            }, iIntValue, iIntValue2, LayoutOrientation.Horizontal, LayoutOrientation.Vertical));
        }
    };

    /* JADX INFO: renamed from: h */
    public static final InterfaceC2057q<List<? extends InterfaceC5644h>, Integer, Integer, Integer> f2341h = new InterfaceC2057q<List<? extends InterfaceC5644h>, Integer, Integer, Integer>() { // from class: androidx.compose.foundation.layout.IntrinsicMeasureBlocks$VerticalMaxHeight$1
        @Override // cm.InterfaceC2057q
        /* JADX INFO: renamed from: M */
        public final Integer mo1343M(List<? extends InterfaceC5644h> list, Integer num, Integer num2) {
            List<? extends InterfaceC5644h> list2 = list;
            int iIntValue = num.intValue();
            int iIntValue2 = num2.intValue();
            C5207g.m11111f(list2, "measurables");
            C04301 c04301 = new InterfaceC2056p<InterfaceC5644h, Integer, Integer>() { // from class: androidx.compose.foundation.layout.IntrinsicMeasureBlocks$VerticalMaxHeight$1.1
                @Override // cm.InterfaceC2056p
                /* JADX INFO: renamed from: m0 */
                public final Integer mo1337m0(InterfaceC5644h interfaceC5644h, Integer num3) {
                    InterfaceC5644h interfaceC5644h2 = interfaceC5644h;
                    int iIntValue3 = num3.intValue();
                    C5207g.m11111f(interfaceC5644h2, "$this$intrinsicSize");
                    return Integer.valueOf(interfaceC5644h2.mo2045a(iIntValue3));
                }
            };
            C04312 c04312 = new InterfaceC2056p<InterfaceC5644h, Integer, Integer>() { // from class: androidx.compose.foundation.layout.IntrinsicMeasureBlocks$VerticalMaxHeight$1.2
                @Override // cm.InterfaceC2056p
                /* JADX INFO: renamed from: m0 */
                public final Integer mo1337m0(InterfaceC5644h interfaceC5644h, Integer num3) {
                    InterfaceC5644h interfaceC5644h2 = interfaceC5644h;
                    int iIntValue3 = num3.intValue();
                    C5207g.m11111f(interfaceC5644h2, "$this$intrinsicSize");
                    return Integer.valueOf(interfaceC5644h2.mo2047u(iIntValue3));
                }
            };
            LayoutOrientation layoutOrientation = LayoutOrientation.Vertical;
            return Integer.valueOf(C8584v.m16789n(list2, c04301, c04312, iIntValue, iIntValue2, layoutOrientation, layoutOrientation));
        }
    };
}
