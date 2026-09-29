package p000;

import com.lingq.core.settings.ViewKeys;

/* JADX INFO: loaded from: classes2.dex */
public final class e29 extends h29 {

    /* JADX INFO: renamed from: a */
    public final int f36624a;

    /* JADX INFO: renamed from: b */
    public final Integer f36625b;

    /* JADX INFO: renamed from: c */
    public final ViewKeys f36626c;

    /* JADX INFO: renamed from: d */
    public final String f36627d;

    /* JADX INFO: renamed from: e */
    public final String f36628e;

    /* JADX INFO: renamed from: f */
    public final boolean f36629f;

    public e29(int i, Integer num, ViewKeys viewKeys, String str, String str2, int i2) {
        str = (i2 & 16) != 0 ? null : str;
        str2 = (i2 & 32) != 0 ? "" : str2;
        boolean z = (i2 & 64) == 0;
        viewKeys.getClass();
        str2.getClass();
        this.f36624a = i;
        this.f36625b = num;
        this.f36626c = viewKeys;
        this.f36627d = str;
        this.f36628e = str2;
        this.f36629f = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e29)) {
            return false;
        }
        e29 e29Var = (e29) obj;
        return this.f36624a == e29Var.f36624a && fa4.m11650l(this.f36625b, e29Var.f36625b) && this.f36626c == e29Var.f36626c && fa4.m11650l(this.f36627d, e29Var.f36627d) && this.f36628e.equals(e29Var.f36628e) && this.f36629f == e29Var.f36629f;
    }

    public final int hashCode() {
        int iHashCode = Integer.hashCode(this.f36624a) * 31;
        Integer num = this.f36625b;
        int iHashCode2 = (this.f36626c.hashCode() + ((iHashCode + (num == null ? 0 : num.hashCode())) * 31)) * 961;
        String str = this.f36627d;
        return Boolean.hashCode(this.f36629f) + ux5.m22980c((iHashCode2 + (str != null ? str.hashCode() : 0)) * 31, this.f36628e, 31);
    }

    public final String toString() {
        return "TitleDescription(title=" + this.f36624a + ", description=" + this.f36625b + ", key=" + this.f36626c + ", dynamicTitle=null, dynamicDescription=" + this.f36627d + ", value=" + this.f36628e + ", isDestructive=" + this.f36629f + ")";
    }
}
