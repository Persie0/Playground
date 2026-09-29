package p000;

/* JADX INFO: loaded from: classes3.dex */
public final class pp8 extends sp8 {

    /* JADX INFO: renamed from: a */
    public final int f56636a;

    public pp8(int i) {
        this.f56636a = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof pp8) && this.f56636a == ((pp8) obj).f56636a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f56636a);
    }

    public final String toString() {
        return ux5.m22989l("OnContentTypeChanged(contentTypeLabel=", this.f56636a, ")");
    }
}
