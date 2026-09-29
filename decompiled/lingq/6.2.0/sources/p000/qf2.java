package p000;

/* JADX INFO: loaded from: classes.dex */
public final class qf2 {

    /* JADX INFO: renamed from: a */
    public final String f57682a;

    /* JADX INFO: renamed from: b */
    public final String f57683b;

    public qf2(String str, String str2) {
        str.getClass();
        str2.getClass();
        this.f57682a = str;
        this.f57683b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qf2)) {
            return false;
        }
        qf2 qf2Var = (qf2) obj;
        return fa4.m11650l(this.f57682a, qf2Var.f57682a) && fa4.m11650l(this.f57683b, qf2Var.f57683b);
    }

    public final int hashCode() {
        return this.f57683b.hashCode() + (this.f57682a.hashCode() * 31);
    }

    public final String toString() {
        return ux5.m22991n("DictionaryLocaleEntity(code=", this.f57682a, ", title=", this.f57683b, ")");
    }
}
