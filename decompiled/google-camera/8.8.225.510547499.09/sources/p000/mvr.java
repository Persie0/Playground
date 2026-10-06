package p000;

import java.util.Collection;
import java.util.Queue;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public abstract class mvr extends mvl implements Queue {
    protected mvr() {
    }

    @Override // p000.mvl
    /* JADX INFO: renamed from: b */
    protected /* bridge */ /* synthetic */ Collection mo3817b() {
        throw null;
    }

    /* JADX INFO: renamed from: d */
    protected abstract Queue mo17028d();

    @Override // java.util.Queue
    public final Object element() {
        return mo17028d().element();
    }

    public boolean offer(Object obj) {
        return mo17028d().offer(obj);
    }

    @Override // java.util.Queue
    public final Object peek() {
        return mo17028d().peek();
    }

    @Override // java.util.Queue
    public final Object poll() {
        return mo17028d().poll();
    }

    @Override // java.util.Queue
    public final Object remove() {
        return mo17028d().remove();
    }
}
