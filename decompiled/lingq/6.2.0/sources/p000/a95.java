package p000;

/* JADX INFO: loaded from: classes3.dex */
public final class a95 extends h95 {

    /* JADX INFO: renamed from: b */
    public final ws1 f379b;

    /* JADX INFO: renamed from: c */
    public final String f380c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a95(ws1 ws1Var) {
        super("cup_banner");
        ws1Var.getClass();
        this.f379b = ws1Var;
        this.f380c = "cup_banner";
    }

    @Override // p000.h95
    /* JADX INFO: renamed from: a */
    public final String mo188a() {
        return this.f380c;
    }

    /* JADX INFO: renamed from: b */
    public final ws1 m189b() {
        return this.f379b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a95)) {
            return false;
        }
        a95 a95Var = (a95) obj;
        return fa4.m11650l(this.f379b, a95Var.f379b) && this.f380c.equals(a95Var.f380c);
    }

    public final int hashCode() {
        return this.f380c.hashCode() + (this.f379b.hashCode() * 31);
    }

    public final String toString() {
        return "Cup(banner=" + this.f379b + ", key=" + this.f380c + ")";
    }
}
