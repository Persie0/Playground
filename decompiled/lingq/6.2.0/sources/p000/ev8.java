package p000;

/* JADX INFO: loaded from: classes3.dex */
public final class ev8 {

    /* JADX INFO: renamed from: a */
    public final Integer f37939a;

    /* JADX INFO: renamed from: b */
    public final String f37940b;

    /* JADX INFO: renamed from: c */
    public final boolean f37941c;

    /* JADX INFO: renamed from: d */
    public final String f37942d;

    public ev8(int i, Integer num, String str, String str2, boolean z) {
        num = (i & 1) != 0 ? null : num;
        str = (i & 2) != 0 ? "" : str;
        str.getClass();
        str2.getClass();
        this.f37939a = num;
        this.f37940b = str;
        this.f37941c = z;
        this.f37942d = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ev8)) {
            return false;
        }
        ev8 ev8Var = (ev8) obj;
        return fa4.m11650l(this.f37939a, ev8Var.f37939a) && this.f37940b.equals(ev8Var.f37940b) && this.f37941c == ev8Var.f37941c && fa4.m11650l(this.f37942d, ev8Var.f37942d);
    }

    public final int hashCode() {
        Integer num = this.f37939a;
        return this.f37942d.hashCode() + g9a.m12428e(ux5.m22980c((num == null ? 0 : num.hashCode()) * 31, this.f37940b, 31), 31, this.f37941c);
    }

    public final String toString() {
        return "SelectionItem(text=" + this.f37939a + ", dynamicText=" + this.f37940b + ", isSelected=" + this.f37941c + ", key=" + this.f37942d + ")";
    }
}
