package p000;

import java.io.Serializable;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class mrn implements Serializable {
    private static final long serialVersionUID = 747826592375603043L;

    /* JADX INFO: renamed from: a */
    public final Object f41479a;

    /* JADX INFO: renamed from: b */
    public final Object f41480b;

    protected mrn(Object obj, Object obj2) {
        this.f41479a = obj;
        this.f41480b = obj2;
    }

    /* JADX INFO: renamed from: a */
    public static mrn m16830a(Object obj, Object obj2) {
        return new mrn(obj, obj2);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof mrn) {
            mrn mrnVar = (mrn) obj;
            if (mpw.m16768g(this.f41479a, mrnVar.f41479a) && mpw.m16768g(this.f41480b, mrnVar.f41480b)) {
                return true;
            }
        }
        return false;
    }

    public final String toString() {
        return "(" + this.f41479a + ", " + this.f41480b + ")";
    }

    public final int hashCode() {
        Object obj = this.f41479a;
        int iHashCode = obj == null ? 0 : obj.hashCode();
        Object obj2 = this.f41480b;
        return (iHashCode * 31) + (obj2 != null ? obj2.hashCode() : 0);
    }
}
