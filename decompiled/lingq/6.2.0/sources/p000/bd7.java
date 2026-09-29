package p000;

/* JADX INFO: loaded from: classes2.dex */
public final class bd7 {

    /* JADX INFO: renamed from: a */
    public final String f8383a;

    /* JADX INFO: renamed from: b */
    public final String f8384b;

    /* JADX INFO: renamed from: c */
    public final int f8385c;

    /* JADX INFO: renamed from: d */
    public final Integer f8386d;

    /* JADX INFO: renamed from: e */
    public final boolean f8387e;

    public bd7(int i, Integer num, String str, String str2, boolean z) {
        str.getClass();
        str2.getClass();
        this.f8383a = str;
        this.f8384b = str2;
        this.f8385c = i;
        this.f8386d = num;
        this.f8387e = z;
    }

    /* JADX INFO: renamed from: a */
    public final int m3646a() {
        return this.f8385c;
    }

    /* JADX INFO: renamed from: b */
    public final String m3647b() {
        return this.f8384b;
    }

    /* JADX INFO: renamed from: c */
    public final String m3648c() {
        return this.f8383a;
    }

    /* JADX INFO: renamed from: d */
    public final Integer m3649d() {
        return this.f8386d;
    }

    /* JADX INFO: renamed from: e */
    public final boolean m3650e() {
        return this.f8387e;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bd7)) {
            return false;
        }
        bd7 bd7Var = (bd7) obj;
        return fa4.m11650l(this.f8383a, bd7Var.f8383a) && fa4.m11650l(this.f8384b, bd7Var.f8384b) && this.f8385c == bd7Var.f8385c && fa4.m11650l(this.f8386d, bd7Var.f8386d) && this.f8387e == bd7Var.f8387e;
    }

    public final int hashCode() {
        int iM24106b = wq1.m24106b(this.f8385c, ux5.m22980c(this.f8383a.hashCode() * 31, this.f8384b, 31), 31);
        Integer num = this.f8386d;
        return Boolean.hashCode(this.f8387e) + ((iM24106b + (num == null ? 0 : num.hashCode())) * 31);
    }

    public final String toString() {
        StringBuilder sbM23000w = ux5.m23000w("PlaylistAndLessonsJoin(nameWithLanguage=", this.f8383a, ", language=", this.f8384b, ", contentId=");
        sbM23000w.append(this.f8385c);
        sbM23000w.append(", order=");
        sbM23000w.append(this.f8386d);
        sbM23000w.append(", isCourse=");
        return AbstractC3393o1.m17740o(sbM23000w, this.f8387e, ")");
    }
}
