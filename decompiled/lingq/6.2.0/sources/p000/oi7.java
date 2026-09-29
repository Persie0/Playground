package p000;

/* JADX INFO: loaded from: classes2.dex */
public final class oi7 extends omd {

    /* JADX INFO: renamed from: h */
    public final Object f54378h;

    /* JADX INFO: renamed from: i */
    public final long f54379i;

    public oi7(Object obj, long j) {
        this.f54378h = obj;
        this.f54379i = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof oi7)) {
            return false;
        }
        oi7 oi7Var = (oi7) obj;
        return this.f54378h.equals(oi7Var.f54378h) && this.f54379i == oi7Var.f54379i;
    }

    public final int hashCode() {
        return Long.hashCode(this.f54379i) + (this.f54378h.hashCode() * 31);
    }

    public final String toString() {
        return "PredictiveBackHandlerInfo(owner=" + this.f54378h + ", compositeKey=" + this.f54379i + ')';
    }
}
