package p000;

import com.lingq.feature.search.filter.model.ViewKeys;

/* JADX INFO: loaded from: classes2.dex */
public final class y19 extends g29 {

    /* JADX INFO: renamed from: a */
    public final String f69097a;

    /* JADX INFO: renamed from: b */
    public final String f69098b;

    /* JADX INFO: renamed from: c */
    public final String f69099c;

    /* JADX INFO: renamed from: d */
    public final ViewKeys f69100d;

    public y19(String str, String str2, String str3, ViewKeys viewKeys) {
        viewKeys.getClass();
        this.f69097a = str;
        this.f69098b = str2;
        this.f69099c = str3;
        this.f69100d = viewKeys;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof y19)) {
            return false;
        }
        y19 y19Var = (y19) obj;
        return fa4.m11650l(this.f69097a, y19Var.f69097a) && fa4.m11650l(this.f69098b, y19Var.f69098b) && fa4.m11650l(this.f69099c, y19Var.f69099c) && this.f69100d == y19Var.f69100d;
    }

    public final int hashCode() {
        String str = this.f69097a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f69098b;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f69099c;
        return this.f69100d.hashCode() + ((iHashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31);
    }

    public final String toString() {
        StringBuilder sbM23000w = ux5.m23000w("SharedBy(name=", this.f69097a, ", photo=", this.f69098b, ", role=");
        sbM23000w.append(this.f69099c);
        sbM23000w.append(", key=");
        sbM23000w.append(this.f69100d);
        sbM23000w.append(")");
        return sbM23000w.toString();
    }
}
