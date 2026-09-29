package androidx.compose.p017ui.layout;

import androidx.compose.p017ui.node.LayoutNode;
import cm.InterfaceC2052l;
import dm.C5207g;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.C6753d;
import p127g1.InterfaceC5651o;
import p127g1.InterfaceC5653q;
import p470x1.C10013a;
import p470x1.C10014b;
import sl.C9072e;

/* JADX INFO: loaded from: classes.dex */
public final class RootMeasurePolicy extends LayoutNode.AbstractC0531c {

    /* JADX INFO: renamed from: b */
    public static final RootMeasurePolicy f3673b = new RootMeasurePolicy();

    @Override // p127g1.InterfaceC5652p
    /* JADX INFO: renamed from: a */
    public final InterfaceC5653q mo1328a(InterfaceC0524e interfaceC0524e, List<? extends InterfaceC5651o> list, long j10) {
        C5207g.m11111f(interfaceC0524e, "$this$measure");
        if (list.isEmpty()) {
            return interfaceC0524e.m2043P(C10013a.m18605j(j10), C10013a.m18604i(j10), C6753d.m13459L0(), new InterfaceC2052l<AbstractC0526g.a, C9072e>() { // from class: androidx.compose.ui.layout.RootMeasurePolicy$measure$1
                @Override // cm.InterfaceC2052l
                /* JADX INFO: renamed from: n */
                public final C9072e mo528n(AbstractC0526g.a aVar) {
                    C5207g.m11111f(aVar, "$this$layout");
                    return C9072e.f47360a;
                }
            });
        }
        if (list.size() == 1) {
            final AbstractC0526g abstractC0526gMo2048w = list.get(0).mo2048w(j10);
            return interfaceC0524e.m2043P(C10014b.m18616f(abstractC0526gMo2048w.f3686a, j10), C10014b.m18615e(abstractC0526gMo2048w.f3687b, j10), C6753d.m13459L0(), new InterfaceC2052l<AbstractC0526g.a, C9072e>() { // from class: androidx.compose.ui.layout.RootMeasurePolicy$measure$2
                {
                    super(1);
                }

                @Override // cm.InterfaceC2052l
                /* JADX INFO: renamed from: n */
                public final C9072e mo528n(AbstractC0526g.a aVar) {
                    AbstractC0526g.a aVar2 = aVar;
                    C5207g.m11111f(aVar2, "$this$layout");
                    AbstractC0526g.a.m2060f(aVar2, abstractC0526gMo2048w, 0, 0);
                    return C9072e.f47360a;
                }
            });
        }
        final ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        for (int i10 = 0; i10 < size; i10++) {
            arrayList.add(list.get(i10).mo2048w(j10));
        }
        int size2 = arrayList.size();
        int iMax = 0;
        int iMax2 = 0;
        for (int i11 = 0; i11 < size2; i11++) {
            AbstractC0526g abstractC0526g = (AbstractC0526g) arrayList.get(i11);
            iMax = Math.max(abstractC0526g.f3686a, iMax);
            iMax2 = Math.max(abstractC0526g.f3687b, iMax2);
        }
        return interfaceC0524e.m2043P(C10014b.m18616f(iMax, j10), C10014b.m18615e(iMax2, j10), C6753d.m13459L0(), new InterfaceC2052l<AbstractC0526g.a, C9072e>() { // from class: androidx.compose.ui.layout.RootMeasurePolicy$measure$4
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // cm.InterfaceC2052l
            /* JADX INFO: renamed from: n */
            public final C9072e mo528n(AbstractC0526g.a aVar) {
                AbstractC0526g.a aVar2 = aVar;
                C5207g.m11111f(aVar2, "$this$layout");
                List<AbstractC0526g> list2 = arrayList;
                int size3 = list2.size();
                for (int i12 = 0; i12 < size3; i12++) {
                    AbstractC0526g.a.m2060f(aVar2, list2.get(i12), 0, 0);
                }
                return C9072e.f47360a;
            }
        });
    }
}
