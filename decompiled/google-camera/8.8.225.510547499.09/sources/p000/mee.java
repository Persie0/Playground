package p000;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class mee extends kxk {

    /* JADX INFO: renamed from: a */
    public final String f40168a;

    public mee(String str) {
        super((char[]) null);
        this.f40168a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof mee) && ooc.m18737c(this.f40168a, ((mee) obj).f40168a);
    }

    public final int hashCode() {
        return this.f40168a.hashCode();
    }

    public final String toString() {
        return "UploadResourceComplete(f250ResourceId=" + this.f40168a + ")";
    }
}
