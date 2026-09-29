package p000;

/* JADX INFO: loaded from: classes.dex */
public final class q2b {

    /* JADX INFO: renamed from: a */
    public final String f57173a;

    public q2b(String str) {
        this.f57173a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof q2b) && fa4.m11650l(this.f57173a, ((q2b) obj).f57173a);
    }

    public final int hashCode() {
        String str = this.f57173a;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }

    public final String toString() {
        return wq1.m24118n("Web2WaveIdentification(userId=", this.f57173a, ")");
    }
}
