package p000;

/* JADX INFO: loaded from: classes2.dex */
public final class dkd {

    /* JADX INFO: renamed from: a */
    public final String f35762a;

    public dkd(String str) {
        this.f35762a = str;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        return (obj instanceof dkd) && this.f35762a.equals(((dkd) obj).f35762a);
    }

    public final int hashCode() {
        return ((((this.f35762a.hashCode() ^ 1000003) * 1000003) ^ 1231) * 1000003) ^ 1;
    }

    public final String toString() {
        return AbstractC3393o1.m17738m(new StringBuilder("MLKitLoggingOptions{libraryName="), this.f35762a, ", enableFirelog=true, firelogEventType=1}");
    }
}
