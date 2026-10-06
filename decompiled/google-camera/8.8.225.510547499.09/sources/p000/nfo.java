package p000;

import java.io.IOException;
import java.math.RoundingMode;
import p021j$.util.Objects;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public class nfo extends nfp {

    /* JADX INFO: renamed from: b */
    public final nfk f42197b;

    /* JADX INFO: renamed from: c */
    public final Character f42198c;

    /* JADX INFO: renamed from: d */
    public volatile nfp f42199d;

    public nfo(nfk nfkVar, Character ch) {
        this.f42197b = nfkVar;
        boolean z = true;
        if (ch != null) {
            ch.charValue();
            if (nfkVar.m17448c('=')) {
                z = false;
            }
        }
        lku.m15607B(z, "Padding character %s was already in alphabet", ch);
        this.f42198c = ch;
    }

    @Override // p000.nfp
    /* JADX INFO: renamed from: a */
    public int mo17449a(byte[] bArr, CharSequence charSequence) throws nfm {
        nfk nfkVar;
        bArr.getClass();
        CharSequence charSequenceMo17453e = mo17453e(charSequence);
        nfk nfkVar2 = this.f42197b;
        if (!nfkVar2.f42192h[charSequenceMo17453e.length() % nfkVar2.f42189e]) {
            throw new nfm("Invalid input length " + charSequenceMo17453e.length());
        }
        int i = 0;
        int i2 = 0;
        while (i < charSequenceMo17453e.length()) {
            long jM17447b = 0;
            int i3 = 0;
            int i4 = 0;
            while (true) {
                nfkVar = this.f42197b;
                if (i3 >= nfkVar.f42189e) {
                    break;
                }
                jM17447b <<= nfkVar.f42188d;
                if (i + i3 < charSequenceMo17453e.length()) {
                    jM17447b |= (long) this.f42197b.m17447b(charSequenceMo17453e.charAt(i4 + i));
                    i4++;
                }
                i3++;
            }
            int i5 = nfkVar.f42190f;
            int i6 = i5 * 8;
            int i7 = i4 * nfkVar.f42188d;
            int i8 = (i5 - 1) * 8;
            while (i8 >= i6 - i7) {
                bArr[i2] = (byte) ((jM17447b >>> i8) & 255);
                i8 -= 8;
                i2++;
            }
            i += this.f42197b.f42189e;
        }
        return i2;
    }

    @Override // p000.nfp
    /* JADX INFO: renamed from: b */
    public void mo17450b(Appendable appendable, byte[] bArr, int i) throws IOException {
        appendable.getClass();
        lku.m15612G(0, i, bArr.length);
        int i2 = 0;
        while (i2 < i) {
            int iMin = Math.min(this.f42197b.f42190f, i - i2);
            lku.m15612G(i2, i2 + iMin, bArr.length);
            lku.m15669w(iMin <= this.f42197b.f42190f);
            long j = 0;
            for (int i3 = 0; i3 < iMin; i3++) {
                j = (j | ((long) (bArr[i2 + i3] & 255))) << 8;
            }
            int i4 = ((iMin + 1) * 8) - this.f42197b.f42188d;
            int i5 = 0;
            while (i5 < iMin * 8) {
                nfk nfkVar = this.f42197b;
                appendable.append(nfkVar.m17446a(((int) (j >>> (i4 - i5))) & nfkVar.f42187c));
                i5 += this.f42197b.f42188d;
            }
            if (this.f42198c != null) {
                while (i5 < this.f42197b.f42190f * 8) {
                    this.f42198c.charValue();
                    appendable.append('=');
                    i5 += this.f42197b.f42188d;
                }
            }
            i2 += this.f42197b.f42190f;
        }
    }

    @Override // p000.nfp
    /* JADX INFO: renamed from: c */
    public final int mo17451c(int i) {
        return (int) (((((long) this.f42197b.f42188d) * ((long) i)) + 7) / 8);
    }

    @Override // p000.nfp
    /* JADX INFO: renamed from: d */
    public final int mo17452d(int i) {
        nfk nfkVar = this.f42197b;
        return nfkVar.f42189e * kxk.m14998ap(i, nfkVar.f42190f, RoundingMode.CEILING);
    }

    @Override // p000.nfp
    /* JADX INFO: renamed from: e */
    public final CharSequence mo17453e(CharSequence charSequence) {
        charSequence.getClass();
        Character ch = this.f42198c;
        if (ch == null) {
            return charSequence;
        }
        ch.charValue();
        int length = charSequence.length() - 1;
        while (length >= 0 && charSequence.charAt(length) == '=') {
            length--;
        }
        return charSequence.subSequence(0, length + 1);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof nfo) {
            nfo nfoVar = (nfo) obj;
            if (this.f42197b.equals(nfoVar.f42197b) && Objects.equals(this.f42198c, nfoVar.f42198c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.f42197b.hashCode() ^ Objects.hashCode(this.f42198c);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("BaseEncoding.");
        sb.append(this.f42197b);
        if (8 % this.f42197b.f42188d != 0) {
            if (this.f42198c == null) {
                sb.append(".omitPadding()");
            } else {
                sb.append(".withPadChar('");
                sb.append(this.f42198c);
                sb.append("')");
            }
        }
        return sb.toString();
    }

    public nfo(String str, String str2, Character ch) {
        this(new nfk(str, str2.toCharArray()), ch);
    }
}
