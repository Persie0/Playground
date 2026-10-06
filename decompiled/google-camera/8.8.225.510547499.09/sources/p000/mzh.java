package p000;

import java.util.Comparator;
import java.util.Iterator;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public abstract class mzh implements Comparator {
    protected mzh() {
    }

    /* JADX INFO: renamed from: b */
    public static mzh m17166b(Comparator comparator) {
        return comparator instanceof mzh ? (mzh) comparator : new muq(comparator);
    }

    /* JADX INFO: renamed from: a */
    public mzh mo17165a() {
        return new naa(this);
    }

    /* JADX INFO: renamed from: c */
    public Object mo17167c(Iterator it) {
        Object next = it.next();
        while (it.hasNext()) {
            next = mo17168d(next, it.next());
        }
        return next;
    }

    @Override // java.util.Comparator
    public abstract int compare(Object obj, Object obj2);

    /* JADX INFO: renamed from: d */
    public Object mo17168d(Object obj, Object obj2) {
        return compare(obj, obj2) >= 0 ? obj : obj2;
    }

    /* JADX INFO: renamed from: e */
    public final Object m17169e(Iterable iterable) {
        return mo17170f(iterable.iterator());
    }

    /* JADX INFO: renamed from: f */
    public Object mo17170f(Iterator it) {
        Object next = it.next();
        while (it.hasNext()) {
            next = mo17171g(next, it.next());
        }
        return next;
    }

    /* JADX INFO: renamed from: g */
    public Object mo17171g(Object obj, Object obj2) {
        return compare(obj, obj2) <= 0 ? obj : obj2;
    }
}
