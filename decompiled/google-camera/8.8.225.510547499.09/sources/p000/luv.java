package p000;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class luv {

    /* JADX INFO: renamed from: a */
    public final mrm f39302a;

    /* JADX INFO: renamed from: b */
    public final mws f39303b;

    /* JADX INFO: renamed from: c */
    public final mws f39304c;

    /* JADX INFO: renamed from: d */
    public final mrm f39305d;

    /* JADX INFO: renamed from: e */
    public final mrm f39306e;

    /* JADX INFO: renamed from: f */
    public final mrm f39307f;

    /* JADX INFO: renamed from: g */
    public final mrm f39308g;

    /* JADX INFO: renamed from: h */
    private final mws f39309h;

    public luv() {
    }

    public luv(mrm mrmVar, mws mwsVar, mws mwsVar2, mrm mrmVar2, mrm mrmVar3, mrm mrmVar4, mws mwsVar3, mrm mrmVar5) {
        this.f39302a = mrmVar;
        this.f39303b = mwsVar;
        this.f39304c = mwsVar2;
        this.f39305d = mrmVar2;
        this.f39306e = mrmVar3;
        this.f39307f = mrmVar4;
        this.f39309h = mwsVar3;
        this.f39308g = mrmVar5;
    }

    /* JADX INFO: renamed from: a */
    public static luu m16035a() {
        return new luu(null);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof luv) {
            luv luvVar = (luv) obj;
            if (this.f39302a.equals(luvVar.f39302a) && mkv.m16505M(this.f39303b, luvVar.f39303b) && mkv.m16505M(this.f39304c, luvVar.f39304c) && this.f39305d.equals(luvVar.f39305d) && this.f39306e.equals(luvVar.f39306e) && this.f39307f.equals(luvVar.f39307f) && mkv.m16505M(this.f39309h, luvVar.f39309h) && this.f39308g.equals(luvVar.f39308g)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((((((((((((this.f39302a.hashCode() ^ 1000003) * 1000003) ^ this.f39303b.hashCode()) * 1000003) ^ this.f39304c.hashCode()) * 1000003) ^ this.f39305d.hashCode()) * 1000003) ^ this.f39306e.hashCode()) * 1000003) ^ this.f39307f.hashCode()) * 1000003) ^ this.f39309h.hashCode()) * 1000003) ^ this.f39308g.hashCode();
    }

    public final String toString() {
        return "Contact{name=" + String.valueOf(this.f39302a) + ", emailAddresses=" + String.valueOf(this.f39303b) + ", phoneNumbers=" + String.valueOf(this.f39304c) + ", postalAddress=" + String.valueOf(this.f39305d) + ", website=" + String.valueOf(this.f39306e) + ", notes=" + String.valueOf(this.f39307f) + ", allPossibleNames=" + String.valueOf(this.f39309h) + ", organization=" + String.valueOf(this.f39308g) + "}";
    }
}
