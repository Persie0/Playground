package p000;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class cnp {

    /* JADX INFO: renamed from: a */
    public final String f6364a;

    /* JADX INFO: renamed from: b */
    public final String f6365b;

    public cnp() {
    }

    public cnp(String str, String str2) {
        this.f6364a = str;
        this.f6365b = str2;
    }

    /* JADX INFO: renamed from: a */
    public static cnp m3991a(String str, String str2) {
        return new cnp(str, str2);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof cnp) {
            cnp cnpVar = (cnp) obj;
            if (this.f6364a.equals(cnpVar.f6364a) && this.f6365b.equals(cnpVar.f6365b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.f6364a.hashCode() ^ 1000003) * 1000003) ^ this.f6365b.hashCode();
    }

    public final String toString() {
        return "ExampleStoreColumn{columnName=" + this.f6364a + ", columnType=" + this.f6365b + "}";
    }
}
