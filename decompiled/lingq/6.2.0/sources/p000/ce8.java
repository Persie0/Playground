package p000;

/* JADX INFO: loaded from: classes3.dex */
public final class ce8 {

    /* JADX INFO: renamed from: a */
    public final String f9987a;

    public ce8(String str) {
        str.getClass();
        this.f9987a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ce8) && fa4.m11650l(this.f9987a, ((ce8) obj).f9987a);
    }

    public final int hashCode() {
        return Boolean.hashCode(true) + ux5.m22980c(Boolean.hashCode(true) * 31, this.f9987a, 31);
    }

    public final String toString() {
        return wq1.m24118n("ReviewResultOverlayState(isCorrect=true, emoji=", this.f9987a, ", show=true)");
    }
}
