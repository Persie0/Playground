package p127g1;

import androidx.compose.p017ui.layout.InterfaceC0524e;
import androidx.compose.p017ui.layout.IntrinsicMinMax;
import androidx.compose.p017ui.layout.IntrinsicWidthHeight;
import androidx.compose.p017ui.node.NodeCoordinator;
import dm.C5207g;
import java.util.ArrayList;
import java.util.List;
import p470x1.C10014b;

/* JADX INFO: renamed from: g1.p */
/* JADX INFO: loaded from: classes.dex */
public interface InterfaceC5652p {
    /* JADX INFO: renamed from: a */
    InterfaceC5653q mo1328a(InterfaceC0524e interfaceC0524e, List<? extends InterfaceC5651o> list, long j10);

    /* JADX INFO: renamed from: b */
    default int mo1329b(NodeCoordinator nodeCoordinator, List list, int i10) {
        C5207g.m11111f(nodeCoordinator, "<this>");
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        for (int i11 = 0; i11 < size; i11++) {
            arrayList.add(new C5640d((InterfaceC5644h) list.get(i11), IntrinsicMinMax.Min, IntrinsicWidthHeight.Width));
        }
        return mo1328a(new C5646j(nodeCoordinator, nodeCoordinator.f3844g.f3747J), arrayList, C10014b.m18612b(0, i10, 7)).mo2039b();
    }

    /* JADX INFO: renamed from: c */
    default int mo1330c(NodeCoordinator nodeCoordinator, List list, int i10) {
        C5207g.m11111f(nodeCoordinator, "<this>");
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        for (int i11 = 0; i11 < size; i11++) {
            arrayList.add(new C5640d((InterfaceC5644h) list.get(i11), IntrinsicMinMax.Min, IntrinsicWidthHeight.Height));
        }
        return mo1328a(new C5646j(nodeCoordinator, nodeCoordinator.f3844g.f3747J), arrayList, C10014b.m18612b(i10, 0, 13)).mo2038a();
    }

    /* JADX INFO: renamed from: d */
    default int mo1331d(NodeCoordinator nodeCoordinator, List list, int i10) {
        C5207g.m11111f(nodeCoordinator, "<this>");
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        for (int i11 = 0; i11 < size; i11++) {
            arrayList.add(new C5640d((InterfaceC5644h) list.get(i11), IntrinsicMinMax.Max, IntrinsicWidthHeight.Width));
        }
        return mo1328a(new C5646j(nodeCoordinator, nodeCoordinator.f3844g.f3747J), arrayList, C10014b.m18612b(0, i10, 7)).mo2039b();
    }

    /* JADX INFO: renamed from: e */
    default int mo1332e(NodeCoordinator nodeCoordinator, List list, int i10) {
        C5207g.m11111f(nodeCoordinator, "<this>");
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        for (int i11 = 0; i11 < size; i11++) {
            arrayList.add(new C5640d((InterfaceC5644h) list.get(i11), IntrinsicMinMax.Max, IntrinsicWidthHeight.Height));
        }
        return mo1328a(new C5646j(nodeCoordinator, nodeCoordinator.f3844g.f3747J), arrayList, C10014b.m18612b(i10, 0, 13)).mo2038a();
    }
}
