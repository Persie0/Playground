package p000;

/* JADX INFO: loaded from: classes3.dex */
public final class ex9 implements qm5 {

    /* JADX INFO: renamed from: a */
    public final String f38055a;

    public ex9(String str) {
        this.f38055a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ex9) && this.f38055a.equals(((ex9) obj).f38055a);
    }

    public final int hashCode() {
        return this.f38055a.hashCode();
    }

    public final String toString() {
        return wq1.m24118n("NotOperational(message=", this.f38055a, ")");
    }
}
