package p000;

/* JADX INFO: loaded from: classes2.dex */
public final class y61 extends z7d {

    /* JADX INFO: renamed from: a */
    public final int f69353a;

    /* JADX INFO: renamed from: b */
    public final int f69354b;

    /* JADX INFO: renamed from: c */
    public final String f69355c;

    public y61(int i, String str, int i2) {
        this.f69353a = i;
        this.f69354b = i2;
        this.f69355c = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof y61)) {
            return false;
        }
        y61 y61Var = (y61) obj;
        return this.f69353a == y61Var.f69353a && this.f69354b == y61Var.f69354b && fa4.m11650l(this.f69355c, y61Var.f69355c);
    }

    public final int hashCode() {
        int iM24106b = wq1.m24106b(this.f69354b, Integer.hashCode(this.f69353a) * 31, 31);
        String str = this.f69355c;
        return Boolean.hashCode(false) + ((iM24106b + (str == null ? 0 : str.hashCode())) * 31);
    }

    public final String toString() {
        return AbstractC3393o1.m17738m(ux5.m22994q(this.f69353a, this.f69354b, "RemoveLessonWarning(lessonId=", ", lessonPrice=", ", sharedByName="), this.f69355c, ", save=false)");
    }
}
