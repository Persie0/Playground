package p000;

import com.lingq.core.settings.ViewKeys;

/* JADX INFO: loaded from: classes2.dex */
public final class y29 extends c39 {

    /* JADX INFO: renamed from: e */
    public final ViewKeys f69186e;

    /* JADX INFO: renamed from: f */
    public final String f69187f;

    /* JADX INFO: renamed from: g */
    public final String f69188g;

    /* JADX INFO: renamed from: h */
    public final boolean f69189h;

    /* JADX INFO: renamed from: i */
    public final int f69190i;

    /* JADX INFO: renamed from: j */
    public final boolean f69191j;

    /* JADX INFO: renamed from: k */
    public final boolean f69192k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y29(int i, int i2, ViewKeys viewKeys, String str, String str2, boolean z, boolean z2, boolean z3) {
        super(viewKeys, str, str2, z);
        i = (i2 & 16) != 0 ? 0 : i;
        z2 = (i2 & 32) != 0 ? false : z2;
        z3 = (i2 & 64) != 0 ? false : z3;
        viewKeys.getClass();
        str.getClass();
        str2.getClass();
        this.f69186e = viewKeys;
        this.f69187f = str;
        this.f69188g = str2;
        this.f69189h = z;
        this.f69190i = i;
        this.f69191j = z2;
        this.f69192k = z3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof y29)) {
            return false;
        }
        y29 y29Var = (y29) obj;
        return this.f69186e == y29Var.f69186e && fa4.m11650l(this.f69187f, y29Var.f69187f) && fa4.m11650l(this.f69188g, y29Var.f69188g) && this.f69189h == y29Var.f69189h && this.f69190i == y29Var.f69190i && this.f69191j == y29Var.f69191j && this.f69192k == y29Var.f69192k;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f69192k) + g9a.m12428e(wq1.m24106b(this.f69190i, g9a.m12428e(ux5.m22980c(ux5.m22980c(this.f69186e.hashCode() * 31, this.f69187f, 31), this.f69188g, 31), 31, this.f69189h), 31), 31, this.f69191j);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Selection(selectionKey=");
        sb.append(this.f69186e);
        sb.append(", selectionText=");
        sb.append(this.f69187f);
        sb.append(", selectionValue=");
        ux5.m22976C(this.f69188g, ", selectionIsSelected=", ", idText=", sb, this.f69189h);
        hn1.m13368r(sb, this.f69190i, ", hasAi=", this.f69191j, ", hasPremium=");
        return AbstractC3393o1.m17740o(sb, this.f69192k, ")");
    }
}
