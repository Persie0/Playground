package p000;

/* JADX INFO: loaded from: classes3.dex */
public final class nx4 extends rx4 {

    /* JADX INFO: renamed from: a */
    public final int f53359a;

    /* JADX INFO: renamed from: b */
    public final String f53360b;

    public nx4(int i, String str) {
        str.getClass();
        this.f53359a = i;
        this.f53360b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof nx4)) {
            return false;
        }
        nx4 nx4Var = (nx4) obj;
        return this.f53359a == nx4Var.f53359a && fa4.m11650l(this.f53360b, nx4Var.f53360b);
    }

    public final int hashCode() {
        return this.f53360b.hashCode() + (Integer.hashCode(this.f53359a) * 31);
    }

    public final String toString() {
        return hn1.m13354d(this.f53359a, "Download(lessonId=", ", audioUrl=", this.f53360b, ")");
    }
}
