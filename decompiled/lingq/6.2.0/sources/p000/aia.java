package p000;

/* JADX INFO: loaded from: classes2.dex */
public final class aia {

    /* JADX INFO: renamed from: a */
    public final String f701a;

    /* JADX INFO: renamed from: b */
    public final String f702b;

    /* JADX INFO: renamed from: c */
    public final String f703c;

    /* JADX INFO: renamed from: d */
    public final String f704d;

    /* JADX INFO: renamed from: e */
    public final String f705e;

    /* JADX INFO: renamed from: f */
    public final String f706f;

    /* JADX INFO: renamed from: g */
    public final String f707g;

    /* JADX INFO: renamed from: h */
    public final boolean f708h;

    /* JADX INFO: renamed from: i */
    public final boolean f709i;

    /* JADX INFO: renamed from: j */
    public final boolean f710j;

    /* JADX INFO: renamed from: k */
    public final boolean f711k;

    /* JADX INFO: renamed from: l */
    public final vk8 f712l;

    public /* synthetic */ aia(String str, int i, String str2, String str3, String str4, String str5) {
        this(str, str2, str3, (i & 8) != 0 ? "" : "$109,99", str4, "", (i & 64) != 0 ? "" : str5, (i & 128) == 0, (i & 256) == 0, false, false, new vk8(0, 0, 0, 0, 31));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof aia)) {
            return false;
        }
        aia aiaVar = (aia) obj;
        return fa4.m11650l(this.f701a, aiaVar.f701a) && fa4.m11650l(this.f702b, aiaVar.f702b) && fa4.m11650l(this.f703c, aiaVar.f703c) && fa4.m11650l(this.f704d, aiaVar.f704d) && fa4.m11650l(this.f705e, aiaVar.f705e) && fa4.m11650l(this.f706f, aiaVar.f706f) && fa4.m11650l(this.f707g, aiaVar.f707g) && this.f708h == aiaVar.f708h && this.f709i == aiaVar.f709i && this.f710j == aiaVar.f710j && this.f711k == aiaVar.f711k && fa4.m11650l(this.f712l, aiaVar.f712l);
    }

    public final int hashCode() {
        return this.f712l.hashCode() + g9a.m12428e(g9a.m12428e(g9a.m12428e(g9a.m12428e(ux5.m22980c(ux5.m22980c(ux5.m22980c(ux5.m22980c(ux5.m22980c(ux5.m22980c(this.f701a.hashCode() * 31, this.f702b, 31), this.f703c, 31), this.f704d, 31), this.f705e, 31), this.f706f, 31), this.f707g, 31), 31, this.f708h), 31, this.f709i), 31, this.f710j), 31, this.f711k);
    }

    public final String toString() {
        StringBuilder sbM23000w = ux5.m23000w("UpgradeItem(id=", this.f701a, ", upgradeTitle=", this.f702b, ", price=");
        AbstractC3393o1.m17725C(sbM23000w, this.f703c, ", priceFull=", this.f704d, ", pricePerMonth=");
        AbstractC3393o1.m17725C(sbM23000w, this.f705e, ", pricePerMonthFull=", this.f706f, ", savePercentage=");
        ux5.m22976C(this.f707g, ", isPopular=", ", isOffer=", sbM23000w, this.f708h);
        wq1.m24101A(sbM23000w, this.f709i, ", isSpecialOffer=", this.f710j, ", welcomeOffer=");
        sbM23000w.append(this.f711k);
        sbM23000w.append(", saleTimeRemaining=");
        sbM23000w.append(this.f712l);
        sbM23000w.append(")");
        return sbM23000w.toString();
    }

    public aia(String str, String str2, String str3, String str4, String str5, String str6, String str7, boolean z, boolean z2, boolean z3, boolean z4, vk8 vk8Var) {
        str.getClass();
        str2.getClass();
        str4.getClass();
        str7.getClass();
        vk8Var.getClass();
        this.f701a = str;
        this.f702b = str2;
        this.f703c = str3;
        this.f704d = str4;
        this.f705e = str5;
        this.f706f = str6;
        this.f707g = str7;
        this.f708h = z;
        this.f709i = z2;
        this.f710j = z3;
        this.f711k = z4;
        this.f712l = vk8Var;
    }
}
