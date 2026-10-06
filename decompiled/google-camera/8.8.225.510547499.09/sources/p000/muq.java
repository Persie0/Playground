package p000;

import java.io.Serializable;
import java.util.Comparator;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class muq extends mzh implements Serializable {
    private static final long serialVersionUID = 0;

    /* JADX INFO: renamed from: a */
    final Comparator f41664a;

    public muq(Comparator comparator) {
        comparator.getClass();
        this.f41664a = comparator;
    }

    @Override // p000.mzh, java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        return this.f41664a.compare(obj, obj2);
    }

    @Override // java.util.Comparator
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof muq) {
            return this.f41664a.equals(((muq) obj).f41664a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f41664a.hashCode();
    }

    public final String toString() {
        return this.f41664a.toString();
    }
}
