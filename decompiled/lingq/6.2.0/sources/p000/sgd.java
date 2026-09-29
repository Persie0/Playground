package p000;

import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public abstract class sgd {
    /* JADX INFO: renamed from: a */
    public static Object m21369a(Iterable iterable) {
        Object next;
        if (!(iterable instanceof List)) {
            Iterator it = iterable.iterator();
            do {
                next = it.next();
            } while (it.hasNext());
            return next;
        }
        List list = (List) iterable;
        if (!list.isEmpty()) {
            return list.get(list.size() - 1);
        }
        uk9.m22784s();
        return null;
    }

    /* JADX INFO: renamed from: b */
    public static void m21370b(List list, li7 li7Var, int i, int i2) {
        for (int size = list.size() - 1; size > i2; size--) {
            if (li7Var.apply(list.get(size))) {
                list.remove(size);
            }
        }
        for (int i3 = i2 - 1; i3 >= i; i3--) {
            list.remove(i3);
        }
    }
}
