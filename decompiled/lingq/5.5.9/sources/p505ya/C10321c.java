package p505ya;

import p479xa.C10151t;

/* JADX INFO: renamed from: ya.c */
/* JADX INFO: loaded from: classes.dex */
public final class C10321c {

    /* JADX INFO: renamed from: a */
    public final String f51901a;

    public C10321c(String str) {
        this.f51901a = str;
    }

    /* JADX INFO: renamed from: a */
    public static C10321c m19320a(C10151t c10151t) {
        String str;
        c10151t.m19125F(2);
        int iM19145t = c10151t.m19145t();
        int i10 = iM19145t >> 1;
        int iM19145t2 = ((c10151t.m19145t() >> 3) & 31) | ((iM19145t & 1) << 5);
        if (i10 == 4 || i10 == 5 || i10 == 7) {
            str = "dvhe";
        } else if (i10 == 8) {
            str = "hev1";
        } else {
            if (i10 != 9) {
                return null;
            }
            str = "avc3";
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append(str);
        sb2.append(".0");
        sb2.append(i10);
        sb2.append(iM19145t2 >= 10 ? "." : ".0");
        sb2.append(iM19145t2);
        return new C10321c(sb2.toString());
    }
}
