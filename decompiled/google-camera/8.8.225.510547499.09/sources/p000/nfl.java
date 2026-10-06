package p000;

import java.io.IOException;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class nfl extends nfo {

    /* JADX INFO: renamed from: a */
    final char[] f42194a;

    public nfl(nfk nfkVar) {
        super(nfkVar, null);
        this.f42194a = new char[512];
        lku.m15669w(nfkVar.f42186b.length == 16);
        for (int i = 0; i < 256; i++) {
            this.f42194a[i] = nfkVar.m17446a(i >>> 4);
            this.f42194a[i | 256] = nfkVar.m17446a(i & 15);
        }
    }

    @Override // p000.nfo, p000.nfp
    /* JADX INFO: renamed from: a */
    public final int mo17449a(byte[] bArr, CharSequence charSequence) throws nfm {
        bArr.getClass();
        if (charSequence.length() % 2 == 1) {
            throw new nfm("Invalid input length " + charSequence.length());
        }
        int i = 0;
        int i2 = 0;
        while (i < charSequence.length()) {
            bArr[i2] = (byte) ((this.f42197b.m17447b(charSequence.charAt(i)) << 4) | this.f42197b.m17447b(charSequence.charAt(i + 1)));
            i += 2;
            i2++;
        }
        return i2;
    }

    @Override // p000.nfo, p000.nfp
    /* JADX INFO: renamed from: b */
    public final void mo17450b(Appendable appendable, byte[] bArr, int i) throws IOException {
        appendable.getClass();
        lku.m15612G(0, i, bArr.length);
        for (int i2 = 0; i2 < i; i2++) {
            int i3 = bArr[i2] & 255;
            appendable.append(this.f42194a[i3]);
            appendable.append(this.f42194a[i3 | 256]);
        }
    }
}
