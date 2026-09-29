package p000;

import com.lingq.core.domain.model.notification.MessageType;

/* JADX INFO: loaded from: classes2.dex */
public final class fm7 {

    /* JADX INFO: renamed from: a */
    public final MessageType f39287a;

    /* JADX INFO: renamed from: b */
    public final String f39288b;

    /* JADX INFO: renamed from: c */
    public final String f39289c;

    /* JADX INFO: renamed from: d */
    public final boolean f39290d;

    /* JADX INFO: renamed from: e */
    public final String f39291e;

    /* JADX INFO: renamed from: f */
    public final String f39292f;

    /* JADX INFO: renamed from: g */
    public final String f39293g;

    public fm7(MessageType messageType, String str, String str2, boolean z, String str3, String str4, String str5) {
        messageType.getClass();
        this.f39287a = messageType;
        this.f39288b = str;
        this.f39289c = str2;
        this.f39290d = z;
        this.f39291e = str3;
        this.f39292f = str4;
        this.f39293g = str5;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fm7)) {
            return false;
        }
        fm7 fm7Var = (fm7) obj;
        return this.f39287a == fm7Var.f39287a && this.f39288b.equals(fm7Var.f39288b) && this.f39289c.equals(fm7Var.f39289c) && this.f39290d == fm7Var.f39290d && fa4.m11650l(this.f39291e, fm7Var.f39291e) && fa4.m11650l(this.f39292f, fm7Var.f39292f) && fa4.m11650l(this.f39293g, fm7Var.f39293g);
    }

    public final int hashCode() {
        int iM12428e = g9a.m12428e(ux5.m22980c(ux5.m22980c(this.f39287a.hashCode() * 31, this.f39288b, 31), this.f39289c, 31), 31, this.f39290d);
        String str = this.f39291e;
        int iHashCode = (iM12428e + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f39292f;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f39293g;
        return iHashCode2 + (str3 != null ? str3.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ProfileMessage(type=");
        sb.append(this.f39287a);
        sb.append(", title=");
        sb.append(this.f39288b);
        sb.append(", message=");
        ux5.m22976C(this.f39289c, ", isChallenge=", ", image=", sb, this.f39290d);
        AbstractC3393o1.m17725C(sb, this.f39291e, ", url=", this.f39292f, ", challengeType=");
        return AbstractC3393o1.m17738m(sb, this.f39293g, ")");
    }
}
