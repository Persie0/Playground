package p000;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class mef extends kxk {

    /* JADX INFO: renamed from: a */
    public final String f40169a;

    public mef(String str) {
        super((char[]) null);
        this.f40169a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof mef) && ooc.m18737c(this.f40169a, ((mef) obj).f40169a);
    }

    public final int hashCode() {
        return this.f40169a.hashCode();
    }

    public final String toString() {
        return "UploadTransferHandle(uploadTransferHandle=" + this.f40169a + ")";
    }
}
