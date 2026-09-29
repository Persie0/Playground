package p000;

/* JADX INFO: loaded from: classes3.dex */
public final class fv8 {

    /* JADX INFO: renamed from: a */
    public final Integer f39758a;

    /* JADX INFO: renamed from: b */
    public final String f39759b;

    /* JADX INFO: renamed from: c */
    public final boolean f39760c;

    /* JADX INFO: renamed from: d */
    public final String f39761d;

    public fv8(int i, Integer num, String str, String str2, boolean z) {
        num = (i & 1) != 0 ? null : num;
        str = (i & 2) != 0 ? "" : str;
        str.getClass();
        str2.getClass();
        this.f39758a = num;
        this.f39759b = str;
        this.f39760c = z;
        this.f39761d = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fv8)) {
            return false;
        }
        fv8 fv8Var = (fv8) obj;
        return fa4.m11650l(this.f39758a, fv8Var.f39758a) && this.f39759b.equals(fv8Var.f39759b) && this.f39760c == fv8Var.f39760c && fa4.m11650l(this.f39761d, fv8Var.f39761d);
    }

    public final int hashCode() {
        Integer num = this.f39758a;
        return this.f39761d.hashCode() + g9a.m12428e(ux5.m22980c((num == null ? 0 : num.hashCode()) * 31, this.f39759b, 31), 31, this.f39760c);
    }

    public final String toString() {
        return "SelectionItem(text=" + this.f39758a + ", dynamicText=" + this.f39759b + ", isSelected=" + this.f39760c + ", key=" + this.f39761d + ")";
    }
}
