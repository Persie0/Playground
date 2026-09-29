package p000;

/* JADX INFO: loaded from: classes3.dex */
public final class r96 extends tqb {

    /* JADX INFO: renamed from: b */
    public final String f58945b;

    /* JADX INFO: renamed from: c */
    public final int f58946c;

    public /* synthetic */ r96(int i) {
        this((i & 1) != 0 ? "" : "lesson complete", -1);
    }

    /* JADX INFO: renamed from: a */
    public final int m20451a() {
        return this.f58946c;
    }

    /* JADX INFO: renamed from: b */
    public final String m20452b() {
        return this.f58945b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof r96)) {
            return false;
        }
        r96 r96Var = (r96) obj;
        return fa4.m11650l(this.f58945b, r96Var.f58945b) && this.f58946c == r96Var.f58946c;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f58946c) + (this.f58945b.hashCode() * 31);
    }

    public final String toString() {
        return "Chat(openLocation=" + this.f58945b + ", chatId=" + this.f58946c + ")";
    }

    public r96(String str, int i) {
        str.getClass();
        this.f58945b = str;
        this.f58946c = i;
    }
}
