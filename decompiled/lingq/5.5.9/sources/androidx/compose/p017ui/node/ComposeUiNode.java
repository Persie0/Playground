package androidx.compose.p017ui.node;

import androidx.compose.p017ui.InterfaceC0500b;
import androidx.compose.p017ui.platform.InterfaceC0647n1;
import androidx.compose.p017ui.unit.LayoutDirection;
import cm.InterfaceC2041a;
import cm.InterfaceC2056p;
import dm.C5207g;
import p127g1.InterfaceC5652p;
import p470x1.InterfaceC10015c;
import sl.C9072e;

/* JADX INFO: loaded from: classes.dex */
public interface ComposeUiNode {

    /* JADX INFO: renamed from: n */
    public static final Companion f3726n = Companion.f3727a;

    public static final class Companion {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ Companion f3727a = new Companion();

        /* JADX INFO: renamed from: b */
        public static final InterfaceC2041a<ComposeUiNode> f3728b;

        /* JADX INFO: renamed from: c */
        public static final InterfaceC2056p<ComposeUiNode, InterfaceC0500b, C9072e> f3729c;

        /* JADX INFO: renamed from: d */
        public static final InterfaceC2056p<ComposeUiNode, InterfaceC10015c, C9072e> f3730d;

        /* JADX INFO: renamed from: e */
        public static final InterfaceC2056p<ComposeUiNode, InterfaceC5652p, C9072e> f3731e;

        /* JADX INFO: renamed from: f */
        public static final InterfaceC2056p<ComposeUiNode, LayoutDirection, C9072e> f3732f;

        /* JADX INFO: renamed from: g */
        public static final InterfaceC2056p<ComposeUiNode, InterfaceC0647n1, C9072e> f3733g;

        static {
            LayoutNode.C0530b c0530b = LayoutNode.f3741d0;
            f3728b = LayoutNode.f3742e0;
            int i10 = ComposeUiNode$Companion$VirtualConstructor$1.f3739b;
            f3729c = new InterfaceC2056p<ComposeUiNode, InterfaceC0500b, C9072e>() { // from class: androidx.compose.ui.node.ComposeUiNode$Companion$SetModifier$1
                @Override // cm.InterfaceC2056p
                /* JADX INFO: renamed from: m0 */
                public final C9072e mo1337m0(ComposeUiNode composeUiNode, InterfaceC0500b interfaceC0500b) {
                    ComposeUiNode composeUiNode2 = composeUiNode;
                    InterfaceC0500b interfaceC0500b2 = interfaceC0500b;
                    C5207g.m11111f(composeUiNode2, "$this$null");
                    C5207g.m11111f(interfaceC0500b2, "it");
                    composeUiNode2.mo2100d(interfaceC0500b2);
                    return C9072e.f47360a;
                }
            };
            f3730d = new InterfaceC2056p<ComposeUiNode, InterfaceC10015c, C9072e>() { // from class: androidx.compose.ui.node.ComposeUiNode$Companion$SetDensity$1
                @Override // cm.InterfaceC2056p
                /* JADX INFO: renamed from: m0 */
                public final C9072e mo1337m0(ComposeUiNode composeUiNode, InterfaceC10015c interfaceC10015c) {
                    ComposeUiNode composeUiNode2 = composeUiNode;
                    InterfaceC10015c interfaceC10015c2 = interfaceC10015c;
                    C5207g.m11111f(composeUiNode2, "$this$null");
                    C5207g.m11111f(interfaceC10015c2, "it");
                    composeUiNode2.mo2101e(interfaceC10015c2);
                    return C9072e.f47360a;
                }
            };
            f3731e = new InterfaceC2056p<ComposeUiNode, InterfaceC5652p, C9072e>() { // from class: androidx.compose.ui.node.ComposeUiNode$Companion$SetMeasurePolicy$1
                @Override // cm.InterfaceC2056p
                /* JADX INFO: renamed from: m0 */
                public final C9072e mo1337m0(ComposeUiNode composeUiNode, InterfaceC5652p interfaceC5652p) {
                    ComposeUiNode composeUiNode2 = composeUiNode;
                    InterfaceC5652p interfaceC5652p2 = interfaceC5652p;
                    C5207g.m11111f(composeUiNode2, "$this$null");
                    C5207g.m11111f(interfaceC5652p2, "it");
                    composeUiNode2.mo2102f(interfaceC5652p2);
                    return C9072e.f47360a;
                }
            };
            f3732f = new InterfaceC2056p<ComposeUiNode, LayoutDirection, C9072e>() { // from class: androidx.compose.ui.node.ComposeUiNode$Companion$SetLayoutDirection$1
                @Override // cm.InterfaceC2056p
                /* JADX INFO: renamed from: m0 */
                public final C9072e mo1337m0(ComposeUiNode composeUiNode, LayoutDirection layoutDirection) {
                    ComposeUiNode composeUiNode2 = composeUiNode;
                    LayoutDirection layoutDirection2 = layoutDirection;
                    C5207g.m11111f(composeUiNode2, "$this$null");
                    C5207g.m11111f(layoutDirection2, "it");
                    composeUiNode2.mo2099b(layoutDirection2);
                    return C9072e.f47360a;
                }
            };
            f3733g = new InterfaceC2056p<ComposeUiNode, InterfaceC0647n1, C9072e>() { // from class: androidx.compose.ui.node.ComposeUiNode$Companion$SetViewConfiguration$1
                @Override // cm.InterfaceC2056p
                /* JADX INFO: renamed from: m0 */
                public final C9072e mo1337m0(ComposeUiNode composeUiNode, InterfaceC0647n1 interfaceC0647n1) {
                    ComposeUiNode composeUiNode2 = composeUiNode;
                    InterfaceC0647n1 interfaceC0647n2 = interfaceC0647n1;
                    C5207g.m11111f(composeUiNode2, "$this$null");
                    C5207g.m11111f(interfaceC0647n2, "it");
                    composeUiNode2.mo2103g(interfaceC0647n2);
                    return C9072e.f47360a;
                }
            };
        }
    }

    /* JADX INFO: renamed from: b */
    void mo2099b(LayoutDirection layoutDirection);

    /* JADX INFO: renamed from: d */
    void mo2100d(InterfaceC0500b interfaceC0500b);

    /* JADX INFO: renamed from: e */
    void mo2101e(InterfaceC10015c interfaceC10015c);

    /* JADX INFO: renamed from: f */
    void mo2102f(InterfaceC5652p interfaceC5652p);

    /* JADX INFO: renamed from: g */
    void mo2103g(InterfaceC0647n1 interfaceC0647n1);
}
