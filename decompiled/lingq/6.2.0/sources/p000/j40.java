package p000;

import com.google.android.datatransport.Priority;

/* JADX INFO: loaded from: classes.dex */
public final class j40 {

    /* JADX INFO: renamed from: a */
    public final Object f45029a;

    /* JADX INFO: renamed from: b */
    public final Priority f45030b;

    /* JADX INFO: renamed from: c */
    public final ml7 f45031c;

    public j40(Object obj, Priority priority, d50 d50Var) {
        if (obj == null) {
            C3386nv.m17635v("Null payload");
            throw null;
        }
        this.f45029a = obj;
        if (priority == null) {
            C3386nv.m17635v("Null priority");
            throw null;
        }
        this.f45030b = priority;
        this.f45031c = d50Var;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof j40) {
            j40 j40Var = (j40) obj;
            if (this.f45029a.equals(j40Var.f45029a) && this.f45030b.equals(j40Var.f45030b)) {
                ml7 ml7Var = j40Var.f45031c;
                ml7 ml7Var2 = this.f45031c;
                if (ml7Var2 != null ? ml7Var2.equals(ml7Var) : ml7Var == null) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = ((((1000003 * 1000003) ^ this.f45029a.hashCode()) * 1000003) ^ this.f45030b.hashCode()) * 1000003;
        ml7 ml7Var = this.f45031c;
        return ((ml7Var == null ? 0 : ml7Var.hashCode()) ^ iHashCode) * 1000003;
    }

    public final String toString() {
        return "Event{code=null, payload=" + this.f45029a + ", priority=" + this.f45030b + ", productData=" + this.f45031c + ", eventContext=null}";
    }
}
