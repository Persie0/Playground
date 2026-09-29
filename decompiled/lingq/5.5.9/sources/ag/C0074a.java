package ag;

import p003a2.C0009a;

/* JADX INFO: renamed from: ag.a */
/* JADX INFO: loaded from: classes.dex */
public final class C0074a {

    /* JADX INFO: renamed from: a */
    public final int f194a;

    /* JADX INFO: renamed from: b */
    public final String f195b = "KVA";

    /* JADX INFO: renamed from: c */
    public final String f196c;

    /* JADX INFO: renamed from: d */
    public final String f197d;

    /* JADX INFO: renamed from: e */
    public final String f198e;

    public C0074a(int i10, String str, String str2, String str3) {
        this.f194a = i10;
        this.f196c = str;
        this.f197d = str2;
        this.f198e = str3;
    }

    public final String toString() {
        StringBuilder sbM26o = C0009a.m26o(C0075b.m455a(this.f194a, false), "/");
        sbM26o.append(this.f195b);
        sbM26o.append("/");
        sbM26o.append(this.f196c);
        sbM26o.append(": ");
        sbM26o.append(this.f197d);
        sbM26o.append(": ");
        sbM26o.append(this.f198e);
        return sbM26o.toString();
    }
}
