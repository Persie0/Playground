package p000;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public abstract class v91 extends vz1 {
    /* JADX INFO: renamed from: q0 */
    public static int m23189q0(Iterable iterable, int i) {
        iterable.getClass();
        return iterable instanceof Collection ? ((Collection) iterable).size() : i;
    }

    /* JADX INFO: renamed from: r0 */
    public static ArrayList m23190r0(Iterable iterable) {
        iterable.getClass();
        ArrayList arrayList = new ArrayList();
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            u91.m22630w0((Iterable) it.next(), arrayList);
        }
        return arrayList;
    }
}
