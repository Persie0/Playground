package p000;

/* JADX INFO: loaded from: classes3.dex */
public final class m45 implements q45 {

    /* JADX INFO: renamed from: a */
    public final int f50570a;

    /* JADX INFO: renamed from: b */
    public final boolean f50571b;

    /* JADX INFO: renamed from: c */
    public final boolean f50572c;

    public m45(int i, boolean z, boolean z2) {
        this.f50570a = i;
        this.f50571b = z;
        this.f50572c = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m45)) {
            return false;
        }
        m45 m45Var = (m45) obj;
        return this.f50570a == m45Var.f50570a && this.f50571b == m45Var.f50571b && this.f50572c == m45Var.f50572c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f50572c) + g9a.m12428e(Integer.hashCode(this.f50570a) * 31, 31, this.f50571b);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Like(lessonId=");
        sb.append(this.f50570a);
        sb.append(", isPrivate=");
        sb.append(this.f50571b);
        sb.append(", isCurrentlyLiked=");
        return AbstractC3393o1.m17740o(sb, this.f50572c, ")");
    }
}
