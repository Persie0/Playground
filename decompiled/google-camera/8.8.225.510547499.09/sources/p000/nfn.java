package p000;

import java.math.RoundingMode;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class nfn extends nfp {

    /* JADX INFO: renamed from: a */
    private final nfp f42195a;

    /* JADX INFO: renamed from: b */
    private final String f42196b = ":";

    public nfn(nfp nfpVar) {
        this.f42195a = nfpVar;
        lku.m15672z(true, "Cannot add a separator after every %s chars", 2);
    }

    @Override // p000.nfp
    /* JADX INFO: renamed from: a */
    public final int mo17449a(byte[] bArr, CharSequence charSequence) {
        StringBuilder sb = new StringBuilder(charSequence.length());
        for (int i = 0; i < charSequence.length(); i++) {
            char cCharAt = charSequence.charAt(i);
            if (this.f42196b.indexOf(cCharAt) < 0) {
                sb.append(cCharAt);
            }
        }
        return this.f42195a.mo17449a(bArr, sb);
    }

    @Override // p000.nfp
    /* JADX INFO: renamed from: b */
    public final void mo17450b(Appendable appendable, byte[] bArr, int i) {
        nfp nfpVar = this.f42195a;
        appendable.getClass();
        lku.m15669w(true);
        nfpVar.mo17450b(new nfj(appendable), bArr, i);
    }

    @Override // p000.nfp
    /* JADX INFO: renamed from: c */
    public final int mo17451c(int i) {
        return this.f42195a.mo17451c(i);
    }

    @Override // p000.nfp
    /* JADX INFO: renamed from: d */
    public final int mo17452d(int i) {
        int iMo17452d = this.f42195a.mo17452d(i);
        return iMo17452d + (this.f42196b.length() * kxk.m14998ap(Math.max(0, iMo17452d - 1), 2, RoundingMode.FLOOR));
    }

    @Override // p000.nfp
    /* JADX INFO: renamed from: e */
    public final CharSequence mo17453e(CharSequence charSequence) {
        return this.f42195a.mo17453e(charSequence);
    }

    public final String toString() {
        return this.f42195a + ".withSeparator(\"" + this.f42196b + "\", 2)";
    }
}
