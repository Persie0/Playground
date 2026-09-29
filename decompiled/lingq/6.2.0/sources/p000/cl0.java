package p000;

import kotlin.text.Regex;

/* JADX INFO: loaded from: classes.dex */
public final class cl0 extends m88 {

    /* JADX INFO: renamed from: c */
    public final bh2 f10218c;

    /* JADX INFO: renamed from: d */
    public final String f10219d;

    /* JADX INFO: renamed from: e */
    public final String f10220e;

    /* JADX INFO: renamed from: f */
    public final e18 f10221f;

    public cl0(bh2 bh2Var, String str, String str2) {
        this.f10218c = bh2Var;
        this.f10219d = str;
        this.f10220e = str2;
        this.f10221f = new e18(new bd0((yd9) bh2Var.f8535c.get(1), this));
    }

    @Override // p000.m88
    /* JADX INFO: renamed from: b */
    public final long mo3001b() {
        String str = this.f10220e;
        if (str == null) {
            return -1L;
        }
        byte[] bArr = icb.f43946a;
        try {
            return Long.parseLong(str);
        } catch (NumberFormatException unused) {
            return -1L;
        }
    }

    @Override // p000.m88
    /* JADX INFO: renamed from: c */
    public final xv5 mo3002c() {
        String str = this.f10219d;
        if (str != null) {
            Regex regex = xv5.f68845e;
            try {
                return AbstractC3122is.m14103q(str);
            } catch (IllegalArgumentException unused) {
            }
        }
        return null;
    }

    @Override // p000.m88
    /* JADX INFO: renamed from: e */
    public final hj0 mo3003e() {
        return this.f10221f;
    }
}
