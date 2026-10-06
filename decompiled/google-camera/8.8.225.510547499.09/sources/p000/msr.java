package p000;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class msr extends mvs {

    /* JADX INFO: renamed from: a */
    final Set f41558a;

    /* JADX INFO: renamed from: b */
    final /* synthetic */ msv f41559b;

    public msr(msv msvVar) {
        this.f41559b = msvVar;
        this.f41558a = msvVar.f41563a.entrySet();
    }

    @Override // p000.mvl, p000.mvq
    /* JADX INFO: renamed from: a */
    protected final /* synthetic */ Object mo3817b() {
        return this.f41558a;
    }

    @Override // p000.mvs, p000.mvl
    /* JADX INFO: renamed from: b */
    protected final /* synthetic */ Collection mo3817b() {
        return this.f41558a;
    }

    @Override // p000.mvs
    /* JADX INFO: renamed from: c */
    protected final Set mo3816a() {
        return this.f41558a;
    }

    @Override // p000.mvl, java.util.Collection, java.util.Set
    public final void clear() {
        this.f41559b.clear();
    }

    @Override // p000.mvl, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        Set set = this.f41558a;
        if (obj instanceof Map.Entry) {
            return set.contains(mkv.m16497E((Map.Entry) obj));
        }
        return false;
    }

    @Override // p000.mvl, java.util.Collection, java.util.Set
    public final boolean containsAll(Collection collection) {
        return lku.m15651e(this, collection);
    }

    @Override // p000.mvl, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        msv msvVar = this.f41559b;
        return new msp(msvVar, msvVar.f41563a.entrySet().iterator());
    }

    @Override // p000.mvl, java.util.Collection, java.util.Set
    public final boolean remove(Object obj) {
        if (!this.f41558a.contains(obj) || !(obj instanceof Map.Entry)) {
            return false;
        }
        Map.Entry entry = (Map.Entry) obj;
        this.f41559b.f41564b.f41563a.remove(entry.getValue());
        this.f41558a.remove(entry);
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

    @Override // p000.mvl, java.util.Collection, java.util.Set
    public final Object[] toArray() {
        return m17030u();
    }

    @Override // p000.mvl, java.util.Collection, java.util.Set
    public final Object[] toArray(Object[] objArr) {
        return mkv.m16550o(this, objArr);
    }
}
