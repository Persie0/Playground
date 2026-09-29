package p000;

/* JADX INFO: loaded from: classes3.dex */
public final class db8 extends nb8 implements eg8 {

    /* JADX INFO: renamed from: a */
    public final v0b f35360a;

    /* JADX INFO: renamed from: b */
    public final String f35361b;

    public db8(v0b v0bVar, String str) {
        str.getClass();
        this.f35360a = v0bVar;
        this.f35361b = str;
    }

    @Override // p000.eg8
    /* JADX INFO: renamed from: a */
    public final v0b mo10270a() {
        return this.f35360a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof db8)) {
            return false;
        }
        db8 db8Var = (db8) obj;
        return this.f35360a.equals(db8Var.f35360a) && fa4.m11650l(this.f35361b, db8Var.f35361b);
    }

    public final int hashCode() {
        return this.f35361b.hashCode() + (this.f35360a.hashCode() * 31);
    }

    public final String toString() {
        return "ClozeActivity(cardVocabulary=" + this.f35360a + ", correctAnswer=" + this.f35361b + ")";
    }
}
