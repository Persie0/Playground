package p000;

/* JADX INFO: loaded from: classes2.dex */
public final class jx4 {

    /* JADX INFO: renamed from: a */
    public final int f46344a;

    /* JADX INFO: renamed from: b */
    public final String f46345b;

    /* JADX INFO: renamed from: c */
    public final String f46346c;

    /* JADX INFO: renamed from: d */
    public final String f46347d;

    public jx4(String str, int i, String str2, String str3) {
        ux5.m22974A(str, str2, str3);
        this.f46344a = i;
        this.f46345b = str;
        this.f46346c = str2;
        this.f46347d = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jx4)) {
            return false;
        }
        jx4 jx4Var = (jx4) obj;
        return this.f46344a == jx4Var.f46344a && fa4.m11650l(this.f46345b, jx4Var.f46345b) && fa4.m11650l(this.f46346c, jx4Var.f46346c) && fa4.m11650l(this.f46347d, jx4Var.f46347d);
    }

    public final int hashCode() {
        return this.f46347d.hashCode() + ux5.m22980c(ux5.m22980c(Integer.hashCode(this.f46344a) * 31, this.f46345b, 31), this.f46346c, 31);
    }

    public final String toString() {
        return wq1.m24125u(ux5.m22995r(this.f46344a, "LessonAchievementEntity(lessonId=", ", language=", this.f46345b, ", type="), this.f46346c, ", dataJson=", this.f46347d, ")");
    }
}
