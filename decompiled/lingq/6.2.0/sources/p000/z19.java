package p000;

import com.lingq.core.settings.ViewKeys;

/* JADX INFO: loaded from: classes2.dex */
public final class z19 extends h29 {

    /* JADX INFO: renamed from: a */
    public final int f70753a;

    /* JADX INFO: renamed from: b */
    public final Integer f70754b;

    /* JADX INFO: renamed from: c */
    public final boolean f70755c;

    /* JADX INFO: renamed from: d */
    public final ViewKeys f70756d;

    /* JADX INFO: renamed from: e */
    public final boolean f70757e;

    public z19(int i, Integer num, boolean z, ViewKeys viewKeys, boolean z2) {
        viewKeys.getClass();
        this.f70753a = i;
        this.f70754b = num;
        this.f70755c = z;
        this.f70756d = viewKeys;
        this.f70757e = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof z19)) {
            return false;
        }
        z19 z19Var = (z19) obj;
        return this.f70753a == z19Var.f70753a && fa4.m11650l(this.f70754b, z19Var.f70754b) && this.f70755c == z19Var.f70755c && this.f70756d == z19Var.f70756d && this.f70757e == z19Var.f70757e;
    }

    public final int hashCode() {
        int iHashCode = Integer.hashCode(this.f70753a) * 31;
        Integer num = this.f70754b;
        return Boolean.hashCode(this.f70757e) + ((this.f70756d.hashCode() + g9a.m12428e((iHashCode + (num == null ? 0 : num.hashCode())) * 31, 31, this.f70755c)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Switch(title=");
        sb.append(this.f70753a);
        sb.append(", description=");
        sb.append(this.f70754b);
        sb.append(", switchState=");
        sb.append(this.f70755c);
        sb.append(", key=");
        sb.append(this.f70756d);
        sb.append(", manualSwitch=");
        return AbstractC3393o1.m17740o(sb, this.f70757e, ")");
    }
}
