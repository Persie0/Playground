package p081e0;

import dm.C5207g;

/* JADX INFO: renamed from: e0.w */
/* JADX INFO: loaded from: classes.dex */
public final class C5343w {

    /* JADX INFO: renamed from: a */
    public final Object f33632a;

    /* JADX INFO: renamed from: b */
    public final Object f33633b;

    public C5343w(Integer num, Object obj) {
        this.f33632a = num;
        this.f33633b = obj;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C5343w)) {
            return false;
        }
        C5343w c5343w = (C5343w) obj;
        return C5207g.m11106a(this.f33632a, c5343w.f33632a) && C5207g.m11106a(this.f33633b, c5343w.f33633b);
    }

    public final int hashCode() {
        int iHashCode;
        Object obj = this.f33632a;
        int iHashCode2 = 0;
        if (obj instanceof Enum) {
            iHashCode = ((Enum) obj).ordinal();
        } else {
            iHashCode = obj != null ? obj.hashCode() : 0;
        }
        int i10 = iHashCode * 31;
        Object obj2 = this.f33633b;
        if (obj2 instanceof Enum) {
            iHashCode2 = ((Enum) obj2).ordinal();
        } else if (obj2 != null) {
            iHashCode2 = obj2.hashCode();
        }
        return iHashCode2 + i10;
    }

    public final String toString() {
        return "JoinedKey(left=" + this.f33632a + ", right=" + this.f33633b + ')';
    }
}
