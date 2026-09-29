package p000;

/* JADX INFO: loaded from: classes.dex */
public final class af4 {

    /* JADX INFO: renamed from: a */
    public final Integer f581a;

    /* JADX INFO: renamed from: b */
    public final Object f582b;

    public af4(Integer num, Object obj) {
        this.f581a = num;
        this.f582b = obj;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof af4)) {
            return false;
        }
        af4 af4Var = (af4) obj;
        return this.f581a.equals(af4Var.f581a) && fa4.m11650l(this.f582b, af4Var.f582b);
    }

    public final int hashCode() {
        int iHashCode;
        int iHashCode2 = this.f581a.hashCode() * 31;
        Object obj = this.f582b;
        if (obj instanceof Enum) {
            iHashCode = ((Enum) obj).ordinal();
        } else {
            iHashCode = obj != null ? obj.hashCode() : 0;
        }
        return iHashCode + iHashCode2;
    }

    public final String toString() {
        return "JoinedKey(left=" + this.f581a + ", right=" + this.f582b + ')';
    }
}
