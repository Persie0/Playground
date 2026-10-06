package p000;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class meb extends kxk {

    /* JADX INFO: renamed from: a */
    public final String f40164a;

    public meb(String str) {
        super((char[]) null);
        this.f40164a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof meb) && ooc.m18737c(this.f40164a, ((meb) obj).f40164a);
    }

    public final int hashCode() {
        return this.f40164a.hashCode();
    }

    public final String toString() {
        return "UploadAttachmentComplete(blobstoreId=" + this.f40164a + ")";
    }
}
