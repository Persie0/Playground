package p000;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class mec extends kxk {

    /* JADX INFO: renamed from: a */
    public final oer f40165a;

    /* JADX INFO: renamed from: b */
    public final Throwable f40166b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mec(oer oerVar, Throwable th) {
        super((char[]) null);
        oerVar.getClass();
        this.f40165a = oerVar;
        this.f40166b = th;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof mec)) {
            return false;
        }
        mec mecVar = (mec) obj;
        return this.f40165a == mecVar.f40165a && ooc.m18737c(this.f40166b, mecVar.f40166b);
    }

    public final int hashCode() {
        return (this.f40165a.hashCode() * 31) + this.f40166b.hashCode();
    }

    public final String toString() {
        return "UploadError(f250LogReason=" + this.f40165a + ", error=" + this.f40166b + ")";
    }
}
