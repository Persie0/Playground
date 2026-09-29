package p479xa;

import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* JADX INFO: renamed from: xa.g */
/* JADX INFO: loaded from: classes.dex */
public final class C10138g<E> implements Iterable<E> {

    /* JADX INFO: renamed from: a */
    public final Object f51372a = new Object();

    /* JADX INFO: renamed from: b */
    public final HashMap f51373b = new HashMap();

    /* JADX INFO: renamed from: c */
    public Set<E> f51374c = Collections.emptySet();

    /* JADX INFO: renamed from: d */
    public List<E> f51375d = Collections.emptyList();

    /* JADX INFO: renamed from: a */
    public final int m19063a(E e10) {
        int iIntValue;
        synchronized (this.f51372a) {
            iIntValue = this.f51373b.containsKey(e10) ? ((Integer) this.f51373b.get(e10)).intValue() : 0;
        }
        return iIntValue;
    }

    @Override // java.lang.Iterable
    public final Iterator<E> iterator() {
        Iterator<E> it;
        synchronized (this.f51372a) {
            it = this.f51375d.iterator();
        }
        return it;
    }
}
