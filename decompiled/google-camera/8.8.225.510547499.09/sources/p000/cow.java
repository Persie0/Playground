package p000;

import android.net.Uri;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class cow {

    /* JADX INFO: renamed from: a */
    public final String f8504a;

    /* JADX INFO: renamed from: b */
    public final boolean f8505b;

    /* JADX INFO: renamed from: c */
    private final Uri f8506c;

    public cow() {
    }

    public cow(Uri uri, String str, boolean z) {
        this.f8506c = uri;
        this.f8504a = str;
        this.f8505b = z;
    }

    /* JADX INFO: renamed from: a */
    public static gyo m5217a() {
        return new gyo();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof cow) {
            cow cowVar = (cow) obj;
            if (this.f8506c.equals(cowVar.f8506c) && this.f8504a.equals(cowVar.f8504a) && this.f8505b == cowVar.f8505b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((this.f8506c.hashCode() ^ 1000003) * 1000003) ^ this.f8504a.hashCode()) * 1000003) ^ (true != this.f8505b ? 1237 : 1231);
    }

    public final String toString() {
        return "MediaRecordInfo{uri=" + String.valueOf(this.f8506c) + ", mediaId=" + this.f8504a + ", isDeleted=" + this.f8505b + "}";
    }
}
