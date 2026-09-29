package p000;

import com.lingq.core.settings.ViewKeys;

/* JADX INFO: loaded from: classes2.dex */
public final class x19 extends h29 {

    /* JADX INFO: renamed from: a */
    public final Integer f67646a;

    /* JADX INFO: renamed from: b */
    public final String f67647b;

    /* JADX INFO: renamed from: c */
    public final ViewKeys f67648c;

    public x19(Integer num, String str, ViewKeys viewKeys, int i) {
        num = (i & 1) != 0 ? null : num;
        str = (i & 2) != 0 ? null : str;
        viewKeys.getClass();
        this.f67646a = num;
        this.f67647b = str;
        this.f67648c = viewKeys;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof x19)) {
            return false;
        }
        x19 x19Var = (x19) obj;
        return fa4.m11650l(this.f67646a, x19Var.f67646a) && fa4.m11650l(this.f67647b, x19Var.f67647b) && this.f67648c == x19Var.f67648c;
    }

    public final int hashCode() {
        Integer num = this.f67646a;
        int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
        String str = this.f67647b;
        return this.f67648c.hashCode() + ((iHashCode + (str != null ? str.hashCode() : 0)) * 31);
    }

    public final String toString() {
        return "Selection(title=" + this.f67646a + ", dynamicTitle=" + this.f67647b + ", key=" + this.f67648c + ")";
    }
}
