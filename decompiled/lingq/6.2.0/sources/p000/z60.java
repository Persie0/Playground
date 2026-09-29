package p000;

/* JADX INFO: loaded from: classes.dex */
public final class z60 extends omd {

    /* JADX INFO: renamed from: h */
    public final Object f70973h;

    /* JADX INFO: renamed from: i */
    public final long f70974i;

    public z60(Object obj, long j) {
        this.f70973h = obj;
        this.f70974i = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof z60)) {
            return false;
        }
        z60 z60Var = (z60) obj;
        return this.f70973h.equals(z60Var.f70973h) && this.f70974i == z60Var.f70974i;
    }

    public final int hashCode() {
        return Long.hashCode(this.f70974i) + (this.f70973h.hashCode() * 31);
    }

    public final String toString() {
        return "BackHandlerInfo(owner=" + this.f70973h + ", compositeKey=" + this.f70974i + ')';
    }
}
