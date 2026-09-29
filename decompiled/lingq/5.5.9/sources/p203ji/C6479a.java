package p203ji;

import android.support.v4.media.session.C0166e;
import dm.C5207g;
import p003a2.C0009a;

/* JADX INFO: renamed from: ji.a */
/* JADX INFO: loaded from: classes.dex */
public final class C6479a {

    /* JADX INFO: renamed from: a */
    public final int f37052a;

    /* JADX INFO: renamed from: b */
    public final String f37053b;

    /* JADX INFO: renamed from: c */
    public final String f37054c;

    /* JADX INFO: renamed from: d */
    public final String f37055d;

    /* JADX INFO: renamed from: e */
    public final String f37056e;

    /* JADX INFO: renamed from: f */
    public final String f37057f;

    /* JADX INFO: renamed from: g */
    public final boolean f37058g;

    /* JADX INFO: renamed from: h */
    public final String f37059h;

    public C6479a(int i10, String str, String str2, String str3, String str4, String str5, boolean z10, String str6) {
        C5207g.m11111f(str, "title");
        C5207g.m11111f(str6, "timestamp");
        this.f37052a = i10;
        this.f37053b = str;
        this.f37054c = str2;
        this.f37055d = str3;
        this.f37056e = str4;
        this.f37057f = str5;
        this.f37058g = z10;
        this.f37059h = str6;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C6479a)) {
            return false;
        }
        C6479a c6479a = (C6479a) obj;
        return this.f37052a == c6479a.f37052a && C5207g.m11106a(this.f37053b, c6479a.f37053b) && C5207g.m11106a(this.f37054c, c6479a.f37054c) && C5207g.m11106a(this.f37055d, c6479a.f37055d) && C5207g.m11106a(this.f37056e, c6479a.f37056e) && C5207g.m11106a(this.f37057f, c6479a.f37057f) && this.f37058g == c6479a.f37058g && C5207g.m11106a(this.f37059h, c6479a.f37059h);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v12, types: [int] */
    /* JADX WARN: Type inference failed for: r1v10 */
    /* JADX WARN: Type inference failed for: r1v5, types: [int] */
    /* JADX WARN: Type inference failed for: r1v9 */
    public final int hashCode() {
        int iM758d = C0166e.m758d(this.f37053b, Integer.hashCode(this.f37052a) * 31, 31);
        int iHashCode = 0;
        String str = this.f37054c;
        int iHashCode2 = (iM758d + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f37055d;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f37056e;
        int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.f37057f;
        if (str4 != null) {
            iHashCode = str4.hashCode();
        }
        int i10 = (iHashCode4 + iHashCode) * 31;
        boolean z10 = this.f37058g;
        ?? r10 = z10;
        if (z10) {
            r10 = 1;
        }
        return this.f37059h.hashCode() + ((i10 + r10) * 31);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("UserNotification(pk=");
        sb2.append(this.f37052a);
        sb2.append(", title=");
        sb2.append(this.f37053b);
        sb2.append(", message=");
        sb2.append(this.f37054c);
        sb2.append(", image=");
        sb2.append(this.f37055d);
        sb2.append(", url=");
        sb2.append(this.f37056e);
        sb2.append(", notificationLanguage=");
        sb2.append(this.f37057f);
        sb2.append(", isNew=");
        sb2.append(this.f37058g);
        sb2.append(", timestamp=");
        return C0009a.m23l(sb2, this.f37059h, ")");
    }
}
