package tl;

import android.support.v4.media.C0141b;
import cm.InterfaceC2052l;
import dm.C5207g;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import jm.C6525h;
import jm.C6526i;
import p385sf.C9000b;

/* JADX INFO: renamed from: tl.o */
/* JADX INFO: loaded from: classes2.dex */
public class C9327o extends C9326n {
    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    /* JADX INFO: renamed from: C */
    public static final int m17683C(int i10, List list) {
        if (new C6526i(0, C9000b.m17249o(list)).m13106i(i10)) {
            return C9000b.m17249o(list) - i10;
        }
        StringBuilder sbM614j = C0141b.m614j("Element index ", i10, " must be in range [");
        sbM614j.append(new C6526i(0, C9000b.m17249o(list)));
        sbM614j.append("].");
        throw new IndexOutOfBoundsException(sbM614j.toString());
    }

    /* JADX INFO: renamed from: D */
    public static final void m17684D(Iterable iterable, Collection collection) {
        C5207g.m11111f(collection, "<this>");
        C5207g.m11111f(iterable, "elements");
        if (iterable instanceof Collection) {
            collection.addAll((Collection) iterable);
            return;
        }
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            collection.add(it.next());
        }
    }

    /* JADX INFO: renamed from: E */
    public static final boolean m17685E(Collection collection, InterfaceC2052l interfaceC2052l) {
        Iterator it = collection.iterator();
        boolean z10 = false;
        while (it.hasNext()) {
            if (((Boolean) interfaceC2052l.mo528n(it.next())).booleanValue()) {
                it.remove();
                z10 = true;
            }
        }
        return z10;
    }

    /* JADX INFO: renamed from: F */
    public static final void m17686F(ArrayList arrayList, InterfaceC2052l interfaceC2052l) {
        int iM17249o;
        C5207g.m11111f(arrayList, "<this>");
        int i10 = 0;
        C6525h it = new C6526i(0, C9000b.m17249o(arrayList)).iterator();
        while (it.f37168c) {
            int iMo13105a = it.mo13105a();
            Object obj = arrayList.get(iMo13105a);
            if (!((Boolean) interfaceC2052l.mo528n(obj)).booleanValue()) {
                if (i10 != iMo13105a) {
                    arrayList.set(i10, obj);
                }
                i10++;
            }
        }
        if (i10 < arrayList.size() && i10 <= (iM17249o = C9000b.m17249o(arrayList))) {
            while (true) {
                arrayList.remove(iM17249o);
                if (iM17249o == i10) {
                    break;
                } else {
                    iM17249o--;
                }
            }
        }
    }
}
