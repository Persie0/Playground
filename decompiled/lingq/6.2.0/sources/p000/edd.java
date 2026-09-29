package p000;

import java.util.Collection;
import java.util.Iterator;
import java.util.Set;

/* JADX INFO: loaded from: classes2.dex */
public abstract class edd {

    /* JADX INFO: renamed from: a */
    public static p04 f37095a;

    /* JADX INFO: renamed from: a */
    public static boolean m11079a(htb htbVar, Collection collection) {
        collection.getClass();
        if (collection instanceof ksb) {
            collection = ((ksb) collection).zza();
        }
        boolean zRemove = false;
        if (!(collection instanceof Set) || collection.size() <= htbVar.size()) {
            Iterator it = collection.iterator();
            while (it.hasNext()) {
                zRemove |= htbVar.remove(it.next());
            }
            return zRemove;
        }
        Iterator<E> it2 = htbVar.iterator();
        while (it2.hasNext()) {
            if (collection.contains(it2.next())) {
                it2.remove();
                zRemove = true;
            }
        }
        return zRemove;
    }
}
