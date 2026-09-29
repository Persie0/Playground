package p000;

import com.lingq.core.domain.model.language.LanguageProgressMetric;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class cn4 {

    /* JADX INFO: renamed from: a */
    public final LanguageProgressMetric f10320a;

    /* JADX INFO: renamed from: b */
    public final int f10321b;

    /* JADX INFO: renamed from: c */
    public final List f10322c;

    /* JADX INFO: renamed from: d */
    public final int f10323d;

    /* JADX INFO: renamed from: e */
    public final int f10324e;

    /* JADX INFO: renamed from: f */
    public final dn4 f10325f;

    public /* synthetic */ cn4(LanguageProgressMetric languageProgressMetric, int i, List list, int i2, int i3) {
        this(languageProgressMetric, i, list, -1, (i3 & 16) != 0 ? -1 : i2, (i3 & 32) != 0 ? dn4.f35893c : dn4.f35891a);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cn4)) {
            return false;
        }
        cn4 cn4Var = (cn4) obj;
        return this.f10320a == cn4Var.f10320a && this.f10321b == cn4Var.f10321b && fa4.m11650l(this.f10322c, cn4Var.f10322c) && this.f10323d == cn4Var.f10323d && this.f10324e == cn4Var.f10324e && fa4.m11650l(this.f10325f, cn4Var.f10325f);
    }

    public final int hashCode() {
        return this.f10325f.hashCode() + wq1.m24106b(this.f10324e, wq1.m24106b(this.f10323d, ux5.m22979b(wq1.m24106b(this.f10321b, this.f10320a.hashCode() * 31, 31), 31, this.f10322c), 31), 31);
    }

    public final String toString() {
        return "LanguageStat(id=" + this.f10320a + ", title=" + this.f10321b + ", data=" + this.f10322c + ", actionMessage=" + this.f10323d + ", actionTitle=" + this.f10324e + ", action=" + this.f10325f + ")";
    }

    public cn4(LanguageProgressMetric languageProgressMetric, int i, List list, int i2, int i3, dn4 dn4Var) {
        languageProgressMetric.getClass();
        dn4Var.getClass();
        this.f10320a = languageProgressMetric;
        this.f10321b = i;
        this.f10322c = list;
        this.f10323d = i2;
        this.f10324e = i3;
        this.f10325f = dn4Var;
    }
}
