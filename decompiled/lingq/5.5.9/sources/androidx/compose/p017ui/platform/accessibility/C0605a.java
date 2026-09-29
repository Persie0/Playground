package androidx.compose.p017ui.platform.accessibility;

import androidx.compose.p017ui.semantics.C0685a;
import androidx.compose.p017ui.semantics.SemanticsConfigurationKt;
import androidx.compose.p017ui.semantics.SemanticsNode;
import androidx.compose.p017ui.semantics.SemanticsProperties;
import dm.C5207g;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.C6752c;
import kotlin.collections.EmptyList;
import p210k1.C6564b;
import p210k1.C6565c;
import p210k1.C6572j;
import p260m8.C7499b;
import p375s0.C8941c;
import p385sf.C9000b;
import p497y2.C10284f;

/* JADX INFO: renamed from: androidx.compose.ui.platform.accessibility.a */
/* JADX INFO: loaded from: classes.dex */
public final class C0605a {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v2, types: [kotlin.collections.EmptyList] */
    /* JADX WARN: Type inference failed for: r0v3, types: [java.util.Collection, java.util.List] */
    /* JADX WARN: Type inference failed for: r0v7, types: [java.util.ArrayList] */
    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    /* JADX INFO: renamed from: a */
    public static final boolean m2331a(ArrayList arrayList) {
        ?? arrayList2;
        long j10;
        if (arrayList.size() < 2) {
            return true;
        }
        if (arrayList.size() == 0 || arrayList.size() == 1) {
            arrayList2 = EmptyList.f38032a;
        } else {
            arrayList2 = new ArrayList();
            Object obj = arrayList.get(0);
            int iM17249o = C9000b.m17249o(arrayList);
            int i10 = 0;
            while (i10 < iM17249o) {
                i10++;
                Object obj2 = arrayList.get(i10);
                SemanticsNode semanticsNode = (SemanticsNode) obj2;
                SemanticsNode semanticsNode2 = (SemanticsNode) obj;
                arrayList2.add(new C8941c(C7499b.m14932c(Math.abs(C8941c.m17164c(semanticsNode2.m2533d().m17170a()) - C8941c.m17164c(semanticsNode.m2533d().m17170a())), Math.abs(C8941c.m17165d(semanticsNode2.m2533d().m17170a()) - C8941c.m17165d(semanticsNode.m2533d().m17170a())))));
                obj = obj2;
            }
        }
        if (arrayList2.size() == 1) {
            j10 = ((C8941c) C6752c.m13423Q(arrayList2)).f46892a;
        } else {
            if (arrayList2.isEmpty()) {
                throw new UnsupportedOperationException("Empty collection can't be reduced.");
            }
            Object objM13423Q = C6752c.m13423Q(arrayList2);
            int iM17249o2 = C9000b.m17249o(arrayList2);
            if (1 <= iM17249o2) {
                int i11 = 1;
                while (true) {
                    objM13423Q = new C8941c(C8941c.m17167f(((C8941c) objM13423Q).f46892a, ((C8941c) arrayList2.get(i11)).f46892a));
                    if (i11 == iM17249o2) {
                        break;
                    }
                    i11++;
                }
            }
            j10 = ((C8941c) objM13423Q).f46892a;
        }
        return C8941c.m17165d(j10) < C8941c.m17164c(j10);
    }

    /* JADX INFO: renamed from: b */
    public static final boolean m2332b(SemanticsNode semanticsNode) {
        return (SemanticsConfigurationKt.m2529a(semanticsNode.m2536g(), SemanticsProperties.f4413f) == null && SemanticsConfigurationKt.m2529a(semanticsNode.m2536g(), SemanticsProperties.f4412e) == null) ? false : true;
    }

    /* JADX INFO: renamed from: c */
    public static final void m2333c(C10284f c10284f, SemanticsNode semanticsNode) {
        if (((C6564b) SemanticsConfigurationKt.m2529a(semanticsNode.m2536g(), SemanticsProperties.f4413f)) != null) {
            c10284f.m19265j(C10284f.b.m19274a(0, 0, 0));
            return;
        }
        ArrayList arrayList = new ArrayList();
        if (SemanticsConfigurationKt.m2529a(semanticsNode.m2536g(), SemanticsProperties.f4412e) != null) {
            List<SemanticsNode> listM2538i = semanticsNode.m2538i();
            int size = listM2538i.size();
            for (int i10 = 0; i10 < size; i10++) {
                SemanticsNode semanticsNode2 = listM2538i.get(i10);
                if (semanticsNode2.m2536g().m13163f(SemanticsProperties.f4429v)) {
                    arrayList.add(semanticsNode2);
                }
            }
        }
        if (!arrayList.isEmpty()) {
            boolean zM2331a = m2331a(arrayList);
            c10284f.m19265j(C10284f.b.m19274a(zM2331a ? 1 : arrayList.size(), zM2331a ? arrayList.size() : 1, 0));
        }
    }

    /* JADX INFO: renamed from: d */
    public static final void m2334d(C10284f c10284f, SemanticsNode semanticsNode) {
        if (((C6565c) SemanticsConfigurationKt.m2529a(semanticsNode.m2536g(), SemanticsProperties.f4414g)) != null) {
            C6572j c6572jM2536g = semanticsNode.m2536g();
            C0685a<Boolean> c0685a = SemanticsProperties.f4429v;
            CollectionInfoKt$toAccessibilityCollectionItemInfo$1 collectionInfoKt$toAccessibilityCollectionItemInfo$1 = CollectionInfoKt$toAccessibilityCollectionItemInfo$1.f4282b;
            c6572jM2536g.getClass();
            C5207g.m11111f(c0685a, "key");
            C5207g.m11111f(collectionInfoKt$toAccessibilityCollectionItemInfo$1, "defaultValue");
            Object objMo807E = c6572jM2536g.f37391a.get(c0685a);
            if (objMo807E == null) {
                objMo807E = collectionInfoKt$toAccessibilityCollectionItemInfo$1.mo807E();
            }
            c10284f.m19266k(C10284f.c.m19275a(0, 0, 0, 0, ((Boolean) objMo807E).booleanValue()));
        }
        SemanticsNode semanticsNodeM2537h = semanticsNode.m2537h();
        if (semanticsNodeM2537h == null || SemanticsConfigurationKt.m2529a(semanticsNodeM2537h.m2536g(), SemanticsProperties.f4412e) == null) {
            return;
        }
        if (semanticsNode.m2536g().m13163f(SemanticsProperties.f4429v)) {
            ArrayList arrayList = new ArrayList();
            List<SemanticsNode> listM2538i = semanticsNodeM2537h.m2538i();
            int size = listM2538i.size();
            int i10 = 0;
            for (int i11 = 0; i11 < size; i11++) {
                SemanticsNode semanticsNode2 = listM2538i.get(i11);
                if (semanticsNode2.m2536g().m13163f(SemanticsProperties.f4429v)) {
                    arrayList.add(semanticsNode2);
                    if (semanticsNode2.f4398c.f3750M < semanticsNode.f4398c.f3750M) {
                        i10++;
                    }
                }
            }
            if (!arrayList.isEmpty()) {
                boolean zM2331a = m2331a(arrayList);
                int i12 = zM2331a ? 0 : i10;
                int i13 = zM2331a ? i10 : 0;
                C6572j c6572jM2536g2 = semanticsNode.m2536g();
                C0685a<Boolean> c0685a2 = SemanticsProperties.f4429v;
                CollectionInfoKt$setCollectionItemInfo$itemInfo$1 collectionInfoKt$setCollectionItemInfo$itemInfo$1 = CollectionInfoKt$setCollectionItemInfo$itemInfo$1.f4281b;
                c6572jM2536g2.getClass();
                C5207g.m11111f(c0685a2, "key");
                C5207g.m11111f(collectionInfoKt$setCollectionItemInfo$itemInfo$1, "defaultValue");
                Object objMo807E2 = c6572jM2536g2.f37391a.get(c0685a2);
                if (objMo807E2 == null) {
                    objMo807E2 = collectionInfoKt$setCollectionItemInfo$itemInfo$1.mo807E();
                }
                c10284f.m19266k(C10284f.c.m19275a(i12, 1, i13, 1, ((Boolean) objMo807E2).booleanValue()));
            }
        }
    }
}
