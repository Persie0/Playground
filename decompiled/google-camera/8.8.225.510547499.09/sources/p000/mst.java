package p000;

import java.util.Collection;
import java.util.Iterator;
import java.util.Set;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class mst extends mvs {

    /* JADX INFO: renamed from: a */
    final /* synthetic */ msv f41560a;

    public mst(msv msvVar) {
        this.f41560a = msvVar;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // p000.mvs, p000.mvl
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public final Set mo3817b() {
        return this.f41560a.f41563a.keySet();
    }

    @Override // p000.mvl, java.util.Collection, java.util.Set
    public final void clear() {
        this.f41560a.clear();
    }

    @Override // p000.mvl, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        return mkv.m16494B(this.f41560a.entrySet().iterator());
    }

    @Override // p000.mvl, java.util.Collection, java.util.Set
    public final boolean remove(Object obj) {
        if (!contains(obj)) {
            return false;
        }
        this.f41560a.m16878f(obj);
        return true;
    }

    @Override // p000.mvl, java.util.Collection, java.util.Set
    public final boolean removeAll(Collection collection) {
        return m17031d(collection);
    }

    @Override // p000.mvl, java.util.Collection, java.util.Set
    public final boolean retainAll(Collection collection) {
        return m17029t(collection);
    }
}
