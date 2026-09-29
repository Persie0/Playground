package p000;

/* JADX INFO: loaded from: classes3.dex */
public final class tt6 extends ut6 {

    /* JADX INFO: renamed from: a */
    public final String f62861a;

    public tt6(String str) {
        str.getClass();
        this.f62861a = str;
    }

    /* JADX INFO: renamed from: a */
    public final String m22306a() {
        return this.f62861a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof tt6) && fa4.m11650l(this.f62861a, ((tt6) obj).f62861a);
    }

    public final int hashCode() {
        return this.f62861a.hashCode();
    }

    public final String toString() {
        return wq1.m24118n("RegistrationFailed(message=", this.f62861a, ")");
    }
}
