package p000;

/* JADX INFO: loaded from: classes2.dex */
public final class sw0 {

    /* JADX INFO: renamed from: a */
    public final String f61506a;

    public sw0(String str) {
        str.getClass();
        this.f61506a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof sw0) && fa4.m11650l(this.f61506a, ((sw0) obj).f61506a);
    }

    public final int hashCode() {
        return this.f61506a.hashCode();
    }

    public final String toString() {
        return wq1.m24118n("Message(message=", this.f61506a, ")");
    }
}
