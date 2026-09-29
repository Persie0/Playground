package p000;

/* JADX INFO: loaded from: classes2.dex */
public final class kd7 implements nd7 {

    /* JADX INFO: renamed from: a */
    public final String f47067a;

    public kd7(String str) {
        this.f47067a = str;
    }

    /* JADX INFO: renamed from: a */
    public final String m15137a() {
        return this.f47067a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof kd7) && fa4.m11650l(this.f47067a, ((kd7) obj).f47067a);
    }

    public final int hashCode() {
        String str = this.f47067a;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }

    public final String toString() {
        return wq1.m24118n("Create(errorMessage=", this.f47067a, ")");
    }
}
