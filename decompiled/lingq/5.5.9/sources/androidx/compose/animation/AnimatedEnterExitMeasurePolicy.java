package androidx.compose.animation;

import androidx.compose.p017ui.layout.AbstractC0526g;
import androidx.compose.p017ui.layout.InterfaceC0524e;
import androidx.compose.p017ui.node.NodeCoordinator;
import cm.InterfaceC2052l;
import dm.C5207g;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.C6752c;
import kotlin.collections.C6753d;
import kotlin.sequences.C7073a;
import p127g1.InterfaceC5644h;
import p127g1.InterfaceC5651o;
import p127g1.InterfaceC5652p;
import p127g1.InterfaceC5653q;
import p350r.C8668b;
import p385sf.C9000b;
import p470x1.C10022j;
import sl.C9072e;
import tl.C9325m;

/* JADX INFO: loaded from: classes.dex */
public final class AnimatedEnterExitMeasurePolicy implements InterfaceC5652p {

    /* JADX INFO: renamed from: a */
    public final C8668b f1422a;

    public AnimatedEnterExitMeasurePolicy(C8668b c8668b) {
        C5207g.m11111f(c8668b, "scope");
        this.f1422a = c8668b;
    }

    @Override // p127g1.InterfaceC5652p
    /* JADX INFO: renamed from: a */
    public final InterfaceC5653q mo1328a(InterfaceC0524e interfaceC0524e, List<? extends InterfaceC5651o> list, long j10) {
        Object obj;
        C5207g.m11111f(interfaceC0524e, "$this$measure");
        final ArrayList arrayList = new ArrayList(C9325m.m17681z(list, 10));
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(((InterfaceC5651o) it.next()).mo2048w(j10));
        }
        int i10 = 1;
        Object obj2 = null;
        int i11 = 0;
        if (!arrayList.isEmpty()) {
            obj = arrayList.get(0);
            int i12 = ((AbstractC0526g) obj).f3686a;
            int iM17249o = C9000b.m17249o(arrayList);
            if (1 <= iM17249o) {
                int i13 = 1;
                while (true) {
                    Object obj3 = arrayList.get(i13);
                    int i14 = ((AbstractC0526g) obj3).f3686a;
                    if (i12 < i14) {
                        obj = obj3;
                        i12 = i14;
                    }
                    if (i13 == iM17249o) {
                        break;
                    }
                    i13++;
                }
            }
        } else {
            obj = null;
        }
        AbstractC0526g abstractC0526g = (AbstractC0526g) obj;
        int i15 = abstractC0526g != null ? abstractC0526g.f3686a : 0;
        if (!arrayList.isEmpty()) {
            obj2 = arrayList.get(0);
            int i16 = ((AbstractC0526g) obj2).f3687b;
            int iM17249o2 = C9000b.m17249o(arrayList);
            if (1 <= iM17249o2) {
                while (true) {
                    Object obj4 = arrayList.get(i10);
                    int i17 = ((AbstractC0526g) obj4).f3687b;
                    if (i16 < i17) {
                        obj2 = obj4;
                        i16 = i17;
                    }
                    if (i10 == iM17249o2) {
                        break;
                    }
                    i10++;
                }
            }
        }
        AbstractC0526g abstractC0526g2 = (AbstractC0526g) obj2;
        if (abstractC0526g2 != null) {
            i11 = abstractC0526g2.f3687b;
        }
        this.f1422a.f46250b.setValue(new C10022j(C9000b.m17236a(i15, i11)));
        return interfaceC0524e.m2043P(i15, i11, C6753d.m13459L0(), new InterfaceC2052l<AbstractC0526g.a, C9072e>() { // from class: androidx.compose.animation.AnimatedEnterExitMeasurePolicy$measure$1
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
                int size = list2.size();
                for (int i18 = 0; i18 < size; i18++) {
                    AbstractC0526g.a.m2057c(aVar2, list2.get(i18), 0, 0);
                }
                return C9072e.f47360a;
            }
        });
    }

    @Override // p127g1.InterfaceC5652p
    /* JADX INFO: renamed from: b */
    public final int mo1329b(NodeCoordinator nodeCoordinator, List list, final int i10) {
        C5207g.m11111f(nodeCoordinator, "<this>");
        Integer num = (Integer) C7073a.m14263X2(C7073a.m14261V2(C6752c.m13413G(list), new InterfaceC2052l<InterfaceC5644h, Integer>() { // from class: androidx.compose.animation.AnimatedEnterExitMeasurePolicy$minIntrinsicWidth$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // cm.InterfaceC2052l
            /* JADX INFO: renamed from: n */
            public final Integer mo528n(InterfaceC5644h interfaceC5644h) {
                InterfaceC5644h interfaceC5644h2 = interfaceC5644h;
                C5207g.m11111f(interfaceC5644h2, "it");
                return Integer.valueOf(interfaceC5644h2.mo2046s(i10));
            }
        }));
        if (num != null) {
            return num.intValue();
        }
        return 0;
    }

    @Override // p127g1.InterfaceC5652p
    /* JADX INFO: renamed from: c */
    public final int mo1330c(NodeCoordinator nodeCoordinator, List list, final int i10) {
        C5207g.m11111f(nodeCoordinator, "<this>");
        Integer num = (Integer) C7073a.m14263X2(C7073a.m14261V2(C6752c.m13413G(list), new InterfaceC2052l<InterfaceC5644h, Integer>() { // from class: androidx.compose.animation.AnimatedEnterExitMeasurePolicy$minIntrinsicHeight$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // cm.InterfaceC2052l
            /* JADX INFO: renamed from: n */
            public final Integer mo528n(InterfaceC5644h interfaceC5644h) {
                InterfaceC5644h interfaceC5644h2 = interfaceC5644h;
                C5207g.m11111f(interfaceC5644h2, "it");
                return Integer.valueOf(interfaceC5644h2.mo2044R(i10));
            }
        }));
        if (num != null) {
            return num.intValue();
        }
        return 0;
    }

    @Override // p127g1.InterfaceC5652p
    /* JADX INFO: renamed from: d */
    public final int mo1331d(NodeCoordinator nodeCoordinator, List list, final int i10) {
        C5207g.m11111f(nodeCoordinator, "<this>");
        Integer num = (Integer) C7073a.m14263X2(C7073a.m14261V2(C6752c.m13413G(list), new InterfaceC2052l<InterfaceC5644h, Integer>() { // from class: androidx.compose.animation.AnimatedEnterExitMeasurePolicy$maxIntrinsicWidth$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // cm.InterfaceC2052l
            /* JADX INFO: renamed from: n */
            public final Integer mo528n(InterfaceC5644h interfaceC5644h) {
                InterfaceC5644h interfaceC5644h2 = interfaceC5644h;
                C5207g.m11111f(interfaceC5644h2, "it");
                return Integer.valueOf(interfaceC5644h2.mo2047u(i10));
            }
        }));
        if (num != null) {
            return num.intValue();
        }
        return 0;
    }

    @Override // p127g1.InterfaceC5652p
    /* JADX INFO: renamed from: e */
    public final int mo1332e(NodeCoordinator nodeCoordinator, List list, final int i10) {
        C5207g.m11111f(nodeCoordinator, "<this>");
        Integer num = (Integer) C7073a.m14263X2(C7073a.m14261V2(C6752c.m13413G(list), new InterfaceC2052l<InterfaceC5644h, Integer>() { // from class: androidx.compose.animation.AnimatedEnterExitMeasurePolicy$maxIntrinsicHeight$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // cm.InterfaceC2052l
            /* JADX INFO: renamed from: n */
            public final Integer mo528n(InterfaceC5644h interfaceC5644h) {
                InterfaceC5644h interfaceC5644h2 = interfaceC5644h;
                C5207g.m11111f(interfaceC5644h2, "it");
                return Integer.valueOf(interfaceC5644h2.mo2045a(i10));
            }
        }));
        if (num != null) {
            return num.intValue();
        }
        return 0;
    }
}
