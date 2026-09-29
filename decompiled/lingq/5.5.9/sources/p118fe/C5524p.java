package p118fe;

import cf.InterfaceC2005b;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: renamed from: fe.p */
/* JADX INFO: loaded from: classes.dex */
public final class C5524p<T> implements InterfaceC2005b<Set<T>> {

    /* JADX INFO: renamed from: b */
    public volatile Set<T> f34192b = null;

    /* JADX INFO: renamed from: a */
    public volatile Set<InterfaceC2005b<T>> f34191a = Collections.newSetFromMap(new ConcurrentHashMap());

    public C5524p(Collection<InterfaceC2005b<T>> collection) {
        this.f34191a.addAll(collection);
    }

    @Override // cf.InterfaceC2005b
    public final Object get() {
        if (this.f34192b == null) {
            synchronized (this) {
                if (this.f34192b == null) {
                    this.f34192b = Collections.newSetFromMap(new ConcurrentHashMap());
                    synchronized (this) {
                        Iterator<InterfaceC2005b<T>> it = this.f34191a.iterator();
                        while (it.hasNext()) {
                            this.f34192b.add(it.next().get());
                        }
                        this.f34191a = null;
                    }
                }
            }
        }
        return Collections.unmodifiableSet(this.f34192b);
    }
}
