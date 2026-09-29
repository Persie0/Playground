package p000;

/* JADX INFO: loaded from: classes2.dex */
public final class tz8 implements vz8 {

    /* JADX INFO: renamed from: a */
    public final String f63149a;

    public tz8(String str) {
        this.f63149a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof tz8) && this.f63149a.equals(((tz8) obj).f63149a);
    }

    public final int hashCode() {
        return this.f63149a.hashCode();
    }

    public final String toString() {
        return wq1.m24118n("ServerMessage(message=", this.f63149a, ")");
    }
}
