package p000;

import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class dda {

    /* JADX INFO: renamed from: a */
    public final String f35467a;

    /* JADX INFO: renamed from: b */
    public final String f35468b;

    /* JADX INFO: renamed from: c */
    public final List f35469c;

    /* JADX INFO: renamed from: d */
    public final Boolean f35470d;

    /* JADX INFO: renamed from: e */
    public final boolean f35471e;

    /* JADX INFO: renamed from: f */
    public final boolean f35472f;

    /* JADX INFO: renamed from: g */
    public final List f35473g;

    /* JADX INFO: renamed from: h */
    public final String f35474h;

    /* JADX INFO: renamed from: i */
    public final boolean f35475i;

    /* JADX INFO: renamed from: j */
    public final List f35476j;

    public dda(Boolean bool, String str, String str2, String str3, List list, List list2, List list3, boolean z, boolean z2, boolean z3) {
        str.getClass();
        str2.getClass();
        list.getClass();
        list2.getClass();
        list3.getClass();
        this.f35467a = str;
        this.f35468b = str2;
        this.f35469c = list;
        this.f35470d = bool;
        this.f35471e = z;
        this.f35472f = z2;
        this.f35473g = list2;
        this.f35474h = str3;
        this.f35475i = z3;
        this.f35476j = list3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dda)) {
            return false;
        }
        dda ddaVar = (dda) obj;
        return fa4.m11650l(this.f35467a, ddaVar.f35467a) && fa4.m11650l(this.f35468b, ddaVar.f35468b) && fa4.m11650l(this.f35469c, ddaVar.f35469c) && fa4.m11650l(this.f35470d, ddaVar.f35470d) && this.f35471e == ddaVar.f35471e && this.f35472f == ddaVar.f35472f && fa4.m11650l(this.f35473g, ddaVar.f35473g) && fa4.m11650l(this.f35474h, ddaVar.f35474h) && this.f35475i == ddaVar.f35475i && fa4.m11650l(this.f35476j, ddaVar.f35476j);
    }

    public final int hashCode() {
        int iM22979b = ux5.m22979b(ux5.m22980c(this.f35467a.hashCode() * 31, this.f35468b, 31), 31, this.f35469c);
        Boolean bool = this.f35470d;
        int iM22979b2 = ux5.m22979b(g9a.m12428e(g9a.m12428e((iM22979b + (bool == null ? 0 : bool.hashCode())) * 31, 31, this.f35471e), 31, this.f35472f), 31, this.f35473g);
        String str = this.f35474h;
        return this.f35476j.hashCode() + g9a.m12428e((iM22979b2 + (str != null ? str.hashCode() : 0)) * 31, 31, this.f35475i);
    }

    public final String toString() {
        StringBuilder sbM23000w = ux5.m23000w("TtsVoiceEntity(name=", this.f35467a, ", title=", this.f35468b, ", voicesByApp=");
        sbM23000w.append(this.f35469c);
        sbM23000w.append(", alternative=");
        sbM23000w.append(this.f35470d);
        sbM23000w.append(", isPremium=");
        wq1.m24101A(sbM23000w, this.f35471e, ", freeTrial=", this.f35472f, ", priority=");
        wq1.m24130z(", accentCode=", this.f35474h, ", isSelectable=", sbM23000w, this.f35473g);
        sbM23000w.append(this.f35475i);
        sbM23000w.append(", tags=");
        sbM23000w.append(this.f35476j);
        sbM23000w.append(")");
        return sbM23000w.toString();
    }
}
