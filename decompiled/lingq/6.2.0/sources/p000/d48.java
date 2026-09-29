package p000;

/* JADX INFO: loaded from: classes3.dex */
public final class d48 implements f48 {

    /* JADX INFO: renamed from: a */
    public final String f34994a;

    public d48(String str) {
        this.f34994a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof d48) && this.f34994a.equals(((d48) obj).f34994a);
    }

    public final int hashCode() {
        return this.f34994a.hashCode();
    }

    public final String toString() {
        return wq1.m24118n("RegistrationFailed(message=", this.f34994a, ")");
    }
}
