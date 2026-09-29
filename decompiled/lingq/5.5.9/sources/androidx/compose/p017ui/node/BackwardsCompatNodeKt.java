package androidx.compose.p017ui.node;

import cm.InterfaceC2052l;
import dm.C5207g;
import p142h1.C5877h;
import p142h1.InterfaceC5876g;
import p166i1.C6145g;
import sl.C9072e;

/* JADX INFO: loaded from: classes.dex */
public final class BackwardsCompatNodeKt {

    /* JADX INFO: renamed from: a */
    public static final C0528a f3721a = new C0528a();

    /* JADX INFO: renamed from: b */
    public static final InterfaceC2052l<BackwardsCompatNode, C9072e> f3722b = new InterfaceC2052l<BackwardsCompatNode, C9072e>() { // from class: androidx.compose.ui.node.BackwardsCompatNodeKt$onDrawCacheReadsChanged$1
        @Override // cm.InterfaceC2052l
        /* JADX INFO: renamed from: n */
        public final C9072e mo528n(BackwardsCompatNode backwardsCompatNode) {
            BackwardsCompatNode backwardsCompatNode2 = backwardsCompatNode;
            C5207g.m11111f(backwardsCompatNode2, "it");
            backwardsCompatNode2.f3715l = true;
            C6145g.m12654a(backwardsCompatNode2);
            return C9072e.f47360a;
        }
    };

    /* JADX INFO: renamed from: c */
    public static final InterfaceC2052l<BackwardsCompatNode, C9072e> f3723c = new InterfaceC2052l<BackwardsCompatNode, C9072e>() { // from class: androidx.compose.ui.node.BackwardsCompatNodeKt$updateModifierLocalConsumer$1
        @Override // cm.InterfaceC2052l
        /* JADX INFO: renamed from: n */
        public final C9072e mo528n(BackwardsCompatNode backwardsCompatNode) {
            BackwardsCompatNode backwardsCompatNode2 = backwardsCompatNode;
            C5207g.m11111f(backwardsCompatNode2, "it");
            backwardsCompatNode2.m2082K();
            return C9072e.f47360a;
        }
    };

    /* JADX INFO: renamed from: androidx.compose.ui.node.BackwardsCompatNodeKt$a */
    public static final class C0528a implements InterfaceC5876g {
        @Override // p142h1.InterfaceC5876g
        /* JADX INFO: renamed from: c */
        public final Object mo2083c(C5877h c5877h) {
            C5207g.m11111f(c5877h, "<this>");
            return c5877h.f35151a.mo807E();
        }
    }
}
