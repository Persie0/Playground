package p000;

/* JADX INFO: loaded from: classes2.dex */
public final class m55 {

    /* JADX INFO: renamed from: a */
    public final int f50602a;

    /* JADX INFO: renamed from: b */
    public final String f50603b;

    public m55(int i, String str) {
        str.getClass();
        this.f50602a = i;
        this.f50603b = str;
    }

    /* JADX INFO: renamed from: a */
    public final int m16634a() {
        return this.f50602a;
    }

    /* JADX INFO: renamed from: b */
    public final String m16635b() {
        return this.f50603b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m55)) {
            return false;
        }
        m55 m55Var = (m55) obj;
        return this.f50602a == m55Var.f50602a && fa4.m11650l(this.f50603b, m55Var.f50603b);
    }

    public final int hashCode() {
        return this.f50603b.hashCode() + (Integer.hashCode(this.f50602a) * 31);
    }

    public final String toString() {
        return hn1.m13354d(this.f50602a, "LessonPreviewEntity(lessonId=", ", preview=", this.f50603b, ")");
    }
}
