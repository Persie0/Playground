package p000;

import java.io.Serializable;
import java.util.Iterator;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class mzz extends mzh implements Serializable {

    /* JADX INFO: renamed from: a */
    static final mzz f41883a = new mzz();
    private static final long serialVersionUID = 0;

    private mzz() {
    }

    private Object readResolve() {
        return f41883a;
    }

    @Override // p000.mzh
    /* JADX INFO: renamed from: a */
    public final mzh mo17165a() {
        return mzg.f41839a;
    }

    @Override // p000.mzh
    /* JADX INFO: renamed from: c */
    public final /* bridge */ /* synthetic */ Object mo17167c(Iterator it) {
        return (Comparable) mzg.f41839a.mo17170f(it);
    }

    @Override // p000.mzh, java.util.Comparator
    public final /* bridge */ /* synthetic */ int compare(Object obj, Object obj2) {
        Comparable comparable = (Comparable) obj;
        Comparable comparable2 = (Comparable) obj2;
        comparable.getClass();
        if (comparable == comparable2) {
            return 0;
        }
        return comparable2.compareTo(comparable);
    }

    @Override // p000.mzh
    /* JADX INFO: renamed from: d */
    public final /* bridge */ /* synthetic */ Object mo17168d(Object obj, Object obj2) {
        return (Comparable) mzg.f41839a.mo17171g((Comparable) obj, (Comparable) obj2);
    }

    @Override // p000.mzh
    /* JADX INFO: renamed from: f */
    public final /* bridge */ /* synthetic */ Object mo17170f(Iterator it) {
        return (Comparable) mzg.f41839a.mo17167c(it);
    }

    @Override // p000.mzh
    /* JADX INFO: renamed from: g */
    public final /* bridge */ /* synthetic */ Object mo17171g(Object obj, Object obj2) {
        return (Comparable) mzg.f41839a.mo17168d((Comparable) obj, (Comparable) obj2);
    }

    public final String toString() {
        return "Ordering.natural().reverse()";
    }
}
