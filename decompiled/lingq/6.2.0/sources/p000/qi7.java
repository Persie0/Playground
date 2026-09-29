package p000;

/* JADX INFO: loaded from: classes.dex */
public final class qi7 {

    /* JADX INFO: renamed from: a */
    public final String f57821a;

    /* JADX INFO: renamed from: b */
    public final Long f57822b;

    public qi7(String str, Long l) {
        this.f57821a = str;
        this.f57822b = l;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qi7)) {
            return false;
        }
        qi7 qi7Var = (qi7) obj;
        return this.f57821a.equals(qi7Var.f57821a) && this.f57822b.equals(qi7Var.f57822b);
    }

    public final int hashCode() {
        return this.f57822b.hashCode() + (this.f57821a.hashCode() * 31);
    }

    public final String toString() {
        return "Preference(key=" + this.f57821a + ", value=" + this.f57822b + ')';
    }
}
