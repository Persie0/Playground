package p000;

/* JADX INFO: loaded from: classes3.dex */
public final class pv6 extends vv6 {

    /* JADX INFO: renamed from: a */
    public final String f56855a;

    public pv6(String str) {
        str.getClass();
        this.f56855a = str;
    }

    /* JADX INFO: renamed from: a */
    public final String m19491a() {
        return this.f56855a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof pv6) && fa4.m11650l(this.f56855a, ((pv6) obj).f56855a);
    }

    public final int hashCode() {
        return this.f56855a.hashCode();
    }

    public final String toString() {
        return wq1.m24118n("SpeakingSelected(confidence=", this.f56855a, ")");
    }
}
