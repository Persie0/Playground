package p000;

import java.util.Iterator;

/* JADX INFO: loaded from: classes2.dex */
public final class zgb implements Iterator {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ Iterator f71561a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Iterator f71562b;

    public zgb(cib cibVar, Iterator it, Iterator it2) {
        this.f71561a = it;
        this.f71562b = it2;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        if (this.f71561a.hasNext()) {
            return true;
        }
        return this.f71562b.hasNext();
    }

    @Override // java.util.Iterator
    public final /* bridge */ /* synthetic */ Object next() {
        Iterator it = this.f71561a;
        if (it.hasNext()) {
            return new xmb(((Integer) it.next()).toString());
        }
        Iterator it2 = this.f71562b;
        if (it2.hasNext()) {
            return new xmb((String) it2.next());
        }
        uk9.m22784s();
        return null;
    }
}
