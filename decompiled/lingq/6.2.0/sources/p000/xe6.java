package p000;

/* JADX INFO: loaded from: classes2.dex */
public final class xe6 extends hf6 {

    /* JADX INFO: renamed from: a */
    public final String f68128a;

    /* JADX INFO: renamed from: b */
    public final Integer f68129b;

    public xe6(Integer num, String str) {
        str.getClass();
        this.f68128a = str;
        this.f68129b = num;
    }

    /* JADX INFO: renamed from: a */
    public final Integer m24476a() {
        return this.f68129b;
    }

    /* JADX INFO: renamed from: b */
    public final String m24477b() {
        return this.f68128a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xe6)) {
            return false;
        }
        xe6 xe6Var = (xe6) obj;
        return fa4.m11650l(this.f68128a, xe6Var.f68128a) && fa4.m11650l(this.f68129b, xe6Var.f68129b);
    }

    public final int hashCode() {
        int iHashCode = this.f68128a.hashCode() * 31;
        Integer num = this.f68129b;
        return iHashCode + (num == null ? 0 : num.hashCode());
    }

    public final String toString() {
        return "Playlist(language=" + this.f68128a + ", folderId=" + this.f68129b + ")";
    }
}
