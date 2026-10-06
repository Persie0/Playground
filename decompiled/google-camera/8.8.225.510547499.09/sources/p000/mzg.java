package p000;

import java.io.Serializable;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class mzg extends mzh implements Serializable {

    /* JADX INFO: renamed from: a */
    public static final mzg f41839a = new mzg();
    private static final long serialVersionUID = 0;

    private mzg() {
    }

    private Object readResolve() {
        return f41839a;
    }

    @Override // p000.mzh
    /* JADX INFO: renamed from: a */
    public final mzh mo17165a() {
        return mzz.f41883a;
    }

    @Override // p000.mzh, java.util.Comparator
    public final /* bridge */ /* synthetic */ int compare(Object obj, Object obj2) {
        Comparable comparable = (Comparable) obj;
        Comparable comparable2 = (Comparable) obj2;
        comparable.getClass();
        comparable2.getClass();
        return comparable.compareTo(comparable2);
    }

    public final String toString() {
        return "Ordering.natural()";
    }
}
