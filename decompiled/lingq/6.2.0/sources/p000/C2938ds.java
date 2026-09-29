package p000;

/* JADX INFO: renamed from: ds */
/* JADX INFO: loaded from: classes2.dex */
public final class C2938ds {

    /* JADX INFO: renamed from: a */
    public final String f36146a;

    /* JADX INFO: renamed from: b */
    public final String f36147b;

    /* JADX INFO: renamed from: c */
    public final String f36148c;

    public C2938ds(String str, String str2, String str3) {
        this.f36146a = str;
        this.f36147b = str2;
        this.f36148c = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2938ds)) {
            return false;
        }
        C2938ds c2938ds = (C2938ds) obj;
        return this.f36146a.equals(c2938ds.f36146a) && this.f36147b.equals(c2938ds.f36147b) && this.f36148c.equals(c2938ds.f36148c);
    }

    public final int hashCode() {
        return this.f36148c.hashCode() + ux5.m22980c(this.f36146a.hashCode() * 31, this.f36147b, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("CloudBridgeCredentials(datasetID=");
        sb.append(this.f36146a);
        sb.append(", cloudBridgeURL=");
        sb.append(this.f36147b);
        sb.append(", accessKey=");
        return ux5.m22992o(sb, this.f36148c, ')');
    }
}
