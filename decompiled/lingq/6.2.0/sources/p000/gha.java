package p000;

/* JADX INFO: loaded from: classes2.dex */
public final class gha implements iha {

    /* JADX INFO: renamed from: a */
    public final int f40831a;

    /* JADX INFO: renamed from: b */
    public final Integer f40832b;

    /* JADX INFO: renamed from: c */
    public final boolean f40833c;

    /* JADX INFO: renamed from: d */
    public final boolean f40834d;

    public gha(int i, Integer num, boolean z, boolean z2) {
        this.f40831a = i;
        this.f40832b = num;
        this.f40833c = z;
        this.f40834d = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gha)) {
            return false;
        }
        gha ghaVar = (gha) obj;
        return this.f40831a == ghaVar.f40831a && fa4.m11650l(this.f40832b, ghaVar.f40832b) && this.f40833c == ghaVar.f40833c && this.f40834d == ghaVar.f40834d;
    }

    public final int hashCode() {
        int iHashCode = Integer.hashCode(this.f40831a) * 31;
        Integer num = this.f40832b;
        return Boolean.hashCode(this.f40834d) + g9a.m12428e((iHashCode + (num == null ? 0 : num.hashCode())) * 31, 31, this.f40833c);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AddOrReplace(bookId=");
        sb.append(this.f40831a);
        sb.append(", replaceBookId=");
        sb.append(this.f40832b);
        sb.append(", isJoined=");
        return e65.m10875g(sb, this.f40833c, ", multiBookEnabled=", this.f40834d, ")");
    }
}
