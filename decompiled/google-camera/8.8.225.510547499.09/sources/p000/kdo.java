package p000;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class kdo {

    /* JADX INFO: renamed from: a */
    public final boolean f35659a;

    public kdo() {
    }

    public kdo(boolean z) {
        this.f35659a = z;
    }

    /* JADX INFO: renamed from: a */
    public static kdo m13999a(boolean z) {
        return new kdo(z);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        return (obj instanceof kdo) && this.f35659a == ((kdo) obj).f35659a;
    }

    public final int hashCode() {
        return (((true != this.f35659a ? 1237 : 1231) ^ 1000003) * 1000003) ^ 1000;
    }

    public final String toString() {
        return "Config{closeImmediately=" + this.f35659a + ", foregroundTimeoutMillis=1000}";
    }
}
