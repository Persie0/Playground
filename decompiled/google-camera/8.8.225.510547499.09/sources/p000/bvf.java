package p000;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class bvf {

    /* JADX INFO: renamed from: a */
    public final String f4529a;

    public bvf(String str) {
        this.f4529a = str;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof bvf) {
            return this.f4529a.equals(((bvf) obj).f4529a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f4529a.hashCode();
    }

    public final String toString() {
        return "StringHeaderFactory{value='" + this.f4529a + "'}";
    }
}
