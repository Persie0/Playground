package p000;

/* JADX INFO: loaded from: classes3.dex */
public final class u1b extends v1b {

    /* JADX INFO: renamed from: a */
    public final String f63256a;

    /* JADX INFO: renamed from: b */
    public final int f63257b;

    public u1b(String str, int i) {
        this.f63256a = str;
        this.f63257b = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof u1b)) {
            return false;
        }
        u1b u1bVar = (u1b) obj;
        return this.f63256a.equals(u1bVar.f63256a) && this.f63257b == u1bVar.f63257b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f63257b) + (this.f63256a.hashCode() * 31);
    }

    public final String toString() {
        return "TokenStatusClicked(term=" + this.f63256a + ", status=" + this.f63257b + ")";
    }
}
