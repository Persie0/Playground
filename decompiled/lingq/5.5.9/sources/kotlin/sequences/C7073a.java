package kotlin.sequences;

import android.support.v4.media.session.C0166e;
import cm.InterfaceC2052l;
import dm.C5207g;
import java.util.AbstractCollection;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import p249lo.C7409b;
import p249lo.C7412e;
import p249lo.C7413f;
import p249lo.C7419l;
import p249lo.C7423p;
import p249lo.InterfaceC7410c;
import p249lo.InterfaceC7415h;
import p385sf.C9000b;

/* JADX INFO: renamed from: kotlin.sequences.a */
/* JADX INFO: loaded from: classes2.dex */
public class C7073a extends C7419l {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    /* JADX INFO: renamed from: O2 */
    public static final <T> InterfaceC7415h<T> m14254O2(InterfaceC7415h<? extends T> interfaceC7415h, int i10) {
        if (!(i10 >= 0)) {
            throw new IllegalArgumentException(C0166e.m762h("Requested element count ", i10, " is less than zero.").toString());
        }
        if (i10 == 0) {
            return interfaceC7415h;
        }
        return interfaceC7415h instanceof InterfaceC7410c ? ((InterfaceC7410c) interfaceC7415h).mo14815a(i10) : new C7409b(interfaceC7415h, i10);
    }

    /* JADX INFO: renamed from: P2 */
    public static final C7412e m14255P2(InterfaceC7415h interfaceC7415h, InterfaceC2052l interfaceC2052l) {
        C5207g.m11111f(interfaceC2052l, "predicate");
        return new C7412e(interfaceC7415h, true, interfaceC2052l);
    }

    /* JADX INFO: renamed from: Q2 */
    public static final C7412e m14256Q2(InterfaceC7415h interfaceC7415h, InterfaceC2052l interfaceC2052l) {
        C5207g.m11111f(interfaceC2052l, "predicate");
        return new C7412e(interfaceC7415h, false, interfaceC2052l);
    }

    /* JADX INFO: renamed from: R2 */
    public static final C7412e m14257R2(InterfaceC7415h interfaceC7415h) {
        return m14256Q2(interfaceC7415h, SequencesKt___SequencesKt$filterNotNull$1.f39964b);
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    /* JADX INFO: renamed from: S2 */
    public static final Object m14258S2(C7423p c7423p) {
        Iterator it = c7423p.f41267a.iterator();
        if (it.hasNext()) {
            return c7423p.f41268b.mo528n((T) it.next());
        }
        throw new NoSuchElementException("Sequence is empty.");
    }

    /* JADX INFO: renamed from: T2 */
    public static final Object m14259T2(C7412e c7412e) {
        C7412e.a aVar = new C7412e.a(c7412e);
        if (aVar.hasNext()) {
            return aVar.next();
        }
        return null;
    }

    /* JADX INFO: renamed from: U2 */
    public static final C7413f m14260U2(InterfaceC7415h interfaceC7415h, InterfaceC2052l interfaceC2052l) {
        C5207g.m11111f(interfaceC2052l, "transform");
        return new C7413f(interfaceC7415h, interfaceC2052l, SequencesKt___SequencesKt$flatMap$2.f39965j);
    }

    /* JADX INFO: renamed from: V2 */
    public static final C7423p m14261V2(InterfaceC7415h interfaceC7415h, InterfaceC2052l interfaceC2052l) {
        C5207g.m11111f(interfaceC2052l, "transform");
        return new C7423p(interfaceC7415h, interfaceC2052l);
    }

    /* JADX INFO: renamed from: W2 */
    public static final C7412e m14262W2(InterfaceC7415h interfaceC7415h, InterfaceC2052l interfaceC2052l) {
        C5207g.m11111f(interfaceC2052l, "transform");
        return m14256Q2(new C7423p(interfaceC7415h, interfaceC2052l), SequencesKt___SequencesKt$filterNotNull$1.f39964b);
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    /* JADX INFO: renamed from: X2 */
    public static final Comparable m14263X2(C7423p c7423p) {
        Iterator it = c7423p.f41267a.iterator();
        if (!it.hasNext()) {
            return null;
        }
        Object next = it.next();
        InterfaceC2052l<T, R> interfaceC2052l = c7423p.f41268b;
        Comparable comparable = (Comparable) interfaceC2052l.mo528n((T) next);
        while (it.hasNext()) {
            Comparable comparable2 = (Comparable) interfaceC2052l.mo528n((T) it.next());
            if (comparable.compareTo(comparable2) < 0) {
                comparable = comparable2;
            }
        }
        return comparable;
    }

    /* JADX INFO: renamed from: Y2 */
    public static final C7413f m14264Y2(C7423p c7423p, Object obj) {
        return SequencesKt__SequencesKt.m14250K2(SequencesKt__SequencesKt.m14253N2(c7423p, SequencesKt__SequencesKt.m14253N2(obj)));
    }

    /* JADX INFO: renamed from: Z2 */
    public static final void m14265Z2(InterfaceC7415h interfaceC7415h, AbstractCollection abstractCollection) {
        C5207g.m11111f(interfaceC7415h, "<this>");
        Iterator it = interfaceC7415h.iterator();
        while (it.hasNext()) {
            abstractCollection.add(it.next());
        }
    }

    /* JADX INFO: renamed from: a3 */
    public static final <T> List<T> m14266a3(InterfaceC7415h<? extends T> interfaceC7415h) {
        return C9000b.m17255u(m14267b3(interfaceC7415h));
    }

    /* JADX INFO: renamed from: b3 */
    public static final <T> List<T> m14267b3(InterfaceC7415h<? extends T> interfaceC7415h) {
        C5207g.m11111f(interfaceC7415h, "<this>");
        ArrayList arrayList = new ArrayList();
        m14265Z2(interfaceC7415h, arrayList);
        return arrayList;
    }
}
