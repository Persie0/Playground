package p000;

/* JADX INFO: loaded from: classes3.dex */
public final class zx4 {

    /* JADX INFO: renamed from: a */
    public final int f72337a;

    /* JADX INFO: renamed from: b */
    public final int f72338b;

    /* JADX INFO: renamed from: c */
    public final String f72339c;

    /* JADX INFO: renamed from: d */
    public final String f72340d;

    public zx4(String str, int i, int i2, String str2) {
        str.getClass();
        this.f72337a = i;
        this.f72338b = i2;
        this.f72339c = str;
        this.f72340d = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zx4)) {
            return false;
        }
        zx4 zx4Var = (zx4) obj;
        return this.f72337a == zx4Var.f72337a && this.f72338b == zx4Var.f72338b && fa4.m11650l(this.f72339c, zx4Var.f72339c) && fa4.m11650l(this.f72340d, zx4Var.f72340d);
    }

    public final int hashCode() {
        int iM22980c = ux5.m22980c(wq1.m24106b(this.f72338b, Integer.hashCode(this.f72337a) * 31, 31), this.f72339c, 31);
        String str = this.f72340d;
        return iM22980c + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        return wq1.m24125u(ux5.m22994q(this.f72337a, this.f72338b, "LessonCoachChat(chatId=", ", messageIndex=", ", message="), this.f72339c, ", translation=", this.f72340d, ")");
    }
}
