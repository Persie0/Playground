package p000;

import java.io.Serializable;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class okb implements Serializable {

    /* JADX INFO: renamed from: a */
    public final Object f46186a;

    /* JADX INFO: renamed from: b */
    public final Object f46187b;

    public okb(Object obj, Object obj2) {
        this.f46186a = obj;
        this.f46187b = obj2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof okb)) {
            return false;
        }
        okb okbVar = (okb) obj;
        return ooc.m18737c(this.f46186a, okbVar.f46186a) && ooc.m18737c(this.f46187b, okbVar.f46187b);
    }

    public final int hashCode() {
        Object obj = this.f46186a;
        int iHashCode = obj == null ? 0 : obj.hashCode();
        Object obj2 = this.f46187b;
        return (iHashCode * 31) + (obj2 != null ? obj2.hashCode() : 0);
    }

    public final String toString() {
        return '(' + this.f46186a + ", " + this.f46187b + ')';
    }
}
