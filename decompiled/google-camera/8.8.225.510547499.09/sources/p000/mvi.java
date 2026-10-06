package p000;

import java.io.Serializable;
import java.util.ArrayDeque;
import java.util.Collection;
import java.util.Queue;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class mvi extends mvr implements Serializable {
    private static final long serialVersionUID = 0;

    /* JADX INFO: renamed from: a */
    final int f41682a;

    /* JADX INFO: renamed from: b */
    private final Queue f41683b;

    private mvi(int i) {
        lku.m15672z(i >= 0, "maxSize (%s) must >= 0", i);
        this.f41683b = new ArrayDeque(i);
        this.f41682a = i;
    }

    /* JADX INFO: renamed from: c */
    public static mvi m17027c(int i) {
        return new mvi(i);
    }

    @Override // p000.mvl, p000.mvq
    /* JADX INFO: renamed from: a */
    protected final /* synthetic */ Object mo3817b() {
        return this.f41683b;
    }

    @Override // p000.mvl, java.util.Collection, java.util.Queue
    public final boolean add(Object obj) {
        obj.getClass();
        if (this.f41682a == 0) {
            return true;
        }
        if (size() == this.f41682a) {
            this.f41683b.remove();
        }
        this.f41683b.add(obj);
        return true;
    }

    @Override // p000.mvl, java.util.Collection
    public final boolean addAll(Collection collection) {
        int size = collection.size();
        if (size < this.f41682a) {
            return mkv.m16512T(this, collection.iterator());
        }
        clear();
        int i = size - this.f41682a;
        collection.getClass();
        lku.m15670x(i >= 0, "number to skip cannot be negative");
        return mkv.m16512T(this, new mxy(collection, i).iterator());
    }

    @Override // p000.mvr, p000.mvl
    /* JADX INFO: renamed from: b */
    protected final /* synthetic */ Collection mo3817b() {
        return this.f41683b;
    }

    @Override // p000.mvr
    /* JADX INFO: renamed from: d */
    protected final Queue mo17028d() {
        return this.f41683b;
    }

    @Override // p000.mvr, java.util.Queue
    public final boolean offer(Object obj) {
        add(obj);
        return true;
    }
}
