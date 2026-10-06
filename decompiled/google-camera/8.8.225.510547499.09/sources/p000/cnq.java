package p000;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class cnq {

    /* JADX INFO: renamed from: a */
    public final String f6366a;

    /* JADX INFO: renamed from: b */
    public final mws f6367b;

    /* JADX INFO: renamed from: c */
    public final cnf f6368c;

    public cnq(String str, mws mwsVar, cnf cnfVar) {
        this.f6366a = str;
        this.f6367b = mwsVar;
        if (cnfVar == null) {
            throw new NullPointerException("Null converter");
        }
        this.f6368c = cnfVar;
    }

    /* JADX INFO: renamed from: a */
    public static cnq m3992a(String str, mws mwsVar, cnf cnfVar) {
        return new cnq(str, mwsVar, cnfVar);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof cnq) {
            cnq cnqVar = (cnq) obj;
            if (this.f6366a.equals(cnqVar.f6366a) && mkv.m16505M(this.f6367b, cnqVar.f6367b) && this.f6368c.equals(cnqVar.f6368c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((this.f6366a.hashCode() ^ 1000003) * 1000003) ^ this.f6367b.hashCode()) * 1000003) ^ this.f6368c.hashCode();
    }

    public final String toString() {
        return "ExampleStoreTable{tableName=" + this.f6366a + ", customColumns=" + this.f6367b.toString() + ", converter=" + this.f6368c.toString() + "}";
    }

    public cnq() {
    }
}
