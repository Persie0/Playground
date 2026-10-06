package p000;

import java.io.Serializable;
import java.util.Iterator;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
final class naa extends mzh implements Serializable {
    private static final long serialVersionUID = 0;

    /* JADX INFO: renamed from: a */
    final mzh f41888a;

    public naa(mzh mzhVar) {
        this.f41888a = mzhVar;
    }

    @Override // p000.mzh
    /* JADX INFO: renamed from: a */
    public final mzh mo17165a() {
        return this.f41888a;
    }

    @Override // p000.mzh
    /* JADX INFO: renamed from: c */
    public final Object mo17167c(Iterator it) {
        return this.f41888a.mo17170f(it);
    }

    @Override // p000.mzh, java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        return this.f41888a.compare(obj2, obj);
    }

    @Override // p000.mzh
    /* JADX INFO: renamed from: d */
    public final Object mo17168d(Object obj, Object obj2) {
        return this.f41888a.mo17171g(obj, obj2);
    }

    @Override // java.util.Comparator
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof naa) {
            return this.f41888a.equals(((naa) obj).f41888a);
        }
        return false;
    }

    @Override // p000.mzh
    /* JADX INFO: renamed from: f */
    public final Object mo17170f(Iterator it) {
        return this.f41888a.mo17167c(it);
    }

    @Override // p000.mzh
    /* JADX INFO: renamed from: g */
    public final Object mo17171g(Object obj, Object obj2) {
        return this.f41888a.mo17168d(obj, obj2);
    }

    public final int hashCode() {
        return -this.f41888a.hashCode();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        mzh mzhVar = this.f41888a;
        sb.append(mzhVar);
        sb.append(".reverse()");
        return mzhVar.toString().concat(".reverse()");
    }
}
