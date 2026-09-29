package p000;

/* JADX INFO: loaded from: classes2.dex */
public final class a8b {

    /* JADX INFO: renamed from: a */
    public final String f364a;

    /* JADX INFO: renamed from: b */
    public final int f365b;

    public a8b(String str, int i) {
        str.getClass();
        this.f364a = str;
        this.f365b = i;
    }

    /* JADX INFO: renamed from: a */
    public final int m180a() {
        return this.f365b;
    }

    /* JADX INFO: renamed from: b */
    public final String m181b() {
        return this.f364a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a8b)) {
            return false;
        }
        a8b a8bVar = (a8b) obj;
        return fa4.m11650l(this.f364a, a8bVar.f364a) && this.f365b == a8bVar.f365b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f365b) + (this.f364a.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("WorkGenerationalId(workSpecId=");
        sb.append(this.f364a);
        sb.append(", generation=");
        return wq1.m24122r(sb, this.f365b, ')');
    }
}
