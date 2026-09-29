package sa;

import android.support.v4.media.C0141b;
import android.text.SpannableStringBuilder;
import android.text.style.ForegroundColorSpan;
import android.text.style.StyleSpan;
import android.text.style.TypefaceSpan;
import android.text.style.UnderlineSpan;
import com.google.android.exoplayer2.text.SubtitleDecoderException;
import java.nio.charset.Charset;
import java.util.List;
import p003a2.C0009a;
import p219ka.AbstractC6645f;
import p219ka.C6640a;
import p219ka.InterfaceC6646g;
import p479xa.C10134c0;
import p479xa.C10145n;
import p479xa.C10151t;
import p482xd.C10170b;

/* JADX INFO: renamed from: sa.a */
/* JADX INFO: loaded from: classes.dex */
public final class C8985a extends AbstractC6645f {

    /* JADX INFO: renamed from: m */
    public final C10151t f47162m = new C10151t();

    /* JADX INFO: renamed from: n */
    public final boolean f47163n;

    /* JADX INFO: renamed from: o */
    public final int f47164o;

    /* JADX INFO: renamed from: p */
    public final int f47165p;

    /* JADX INFO: renamed from: q */
    public final String f47166q;

    /* JADX INFO: renamed from: r */
    public final float f47167r;

    /* JADX INFO: renamed from: s */
    public final int f47168s;

    public C8985a(List<byte[]> list) {
        String str = "sans-serif";
        boolean z10 = false;
        if (list.size() != 1 || (list.get(0).length != 48 && list.get(0).length != 53)) {
            this.f47164o = 0;
            this.f47165p = -1;
            this.f47166q = str;
            this.f47163n = false;
            this.f47167r = 0.85f;
            this.f47168s = -1;
            return;
        }
        byte[] bArr = list.get(0);
        this.f47164o = bArr[24];
        this.f47165p = ((bArr[26] & 255) << 24) | ((bArr[27] & 255) << 16) | ((bArr[28] & 255) << 8) | (bArr[29] & 255);
        int length = bArr.length - 43;
        int i10 = C10134c0.f51354a;
        this.f47166q = "Serif".equals(new String(bArr, 43, length, C10170b.f51477c)) ? "serif" : "sans-serif";
        int i11 = bArr[25] * 20;
        this.f47168s = i11;
        z10 = (bArr[0] & 32) != 0 ? true : z10;
        this.f47163n = z10;
        if (z10) {
            this.f47167r = C10134c0.m19040g(((bArr[11] & 255) | ((bArr[10] & 255) << 8)) / i11, 0.0f, 0.95f);
        } else {
            this.f47167r = 0.85f;
        }
    }

    /* JADX INFO: renamed from: h */
    public static void m17231h(SpannableStringBuilder spannableStringBuilder, int i10, int i11, int i12, int i13, int i14) {
        if (i10 != i11) {
            int i15 = i14 | 33;
            boolean z10 = true;
            boolean z11 = (i10 & 1) != 0;
            boolean z12 = (i10 & 2) != 0;
            if (z11) {
                if (z12) {
                    spannableStringBuilder.setSpan(new StyleSpan(3), i12, i13, i15);
                } else {
                    spannableStringBuilder.setSpan(new StyleSpan(1), i12, i13, i15);
                }
            } else if (z12) {
                spannableStringBuilder.setSpan(new StyleSpan(2), i12, i13, i15);
            }
            if ((i10 & 4) == 0) {
                z10 = false;
            }
            if (z10) {
                spannableStringBuilder.setSpan(new UnderlineSpan(), i12, i13, i15);
            }
            if (z10 || z11 || z12) {
                return;
            }
            spannableStringBuilder.setSpan(new StyleSpan(0), i12, i13, i15);
        }
    }

    @Override // p219ka.AbstractC6645f
    /* JADX INFO: renamed from: g */
    public final InterfaceC6646g mo13279g(byte[] bArr, int i10, boolean z10) throws SubtitleDecoderException {
        String strM19143r;
        float f3;
        int i11;
        C10151t c10151t = this.f47162m;
        c10151t.m19122C(bArr, i10);
        int i12 = 2;
        int i13 = 1;
        int i14 = 0;
        if (!(c10151t.f51440c - c10151t.f51439b >= 2)) {
            throw new SubtitleDecoderException("Unexpected subtitle format.");
        }
        int iM19150y = c10151t.m19150y();
        if (iM19150y == 0) {
            strM19143r = "";
        } else {
            int i15 = c10151t.f51439b;
            Charset charsetM19120A = c10151t.m19120A();
            int i16 = iM19150y - (c10151t.f51439b - i15);
            if (charsetM19120A == null) {
                charsetM19120A = C10170b.f51477c;
            }
            strM19143r = c10151t.m19143r(i16, charsetM19120A);
        }
        if (strM19143r.isEmpty()) {
            return C8986b.f47169b;
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(strM19143r);
        m17231h(spannableStringBuilder, this.f47164o, 0, 0, spannableStringBuilder.length(), 16711680);
        int length = spannableStringBuilder.length();
        int i17 = this.f47165p;
        if (i17 != -1) {
            spannableStringBuilder.setSpan(new ForegroundColorSpan(((i17 & 255) << 24) | (i17 >>> 8)), 0, length, 16711713);
        }
        int length2 = spannableStringBuilder.length();
        String str = this.f47166q;
        if (str != "sans-serif") {
            spannableStringBuilder.setSpan(new TypefaceSpan(str), 0, length2, 16711713);
        }
        float fM19040g = this.f47167r;
        while (true) {
            int i18 = c10151t.f51440c;
            int i19 = c10151t.f51439b;
            if (i18 - i19 < 8) {
                float f10 = fM19040g;
                C6640a.a aVar = new C6640a.a();
                aVar.f37671a = spannableStringBuilder;
                aVar.f37675e = f10;
                aVar.f37676f = 0;
                aVar.f37677g = 0;
                return new C8986b(aVar.m13277a());
            }
            int iM19129d = c10151t.m19129d();
            int iM19129d2 = c10151t.m19129d();
            if (iM19129d2 == 1937013100) {
                if ((c10151t.f51440c - c10151t.f51439b >= i12 ? i13 : i14) == 0) {
                    throw new SubtitleDecoderException("Unexpected subtitle format.");
                }
                int iM19150y2 = c10151t.m19150y();
                int i20 = i14;
                while (i14 < iM19150y2) {
                    if (c10151t.f51440c - c10151t.f51439b >= 12) {
                        i20 = i13;
                    }
                    if (i20 == 0) {
                        throw new SubtitleDecoderException("Unexpected subtitle format.");
                    }
                    int iM19150y3 = c10151t.m19150y();
                    int iM19150y4 = c10151t.m19150y();
                    c10151t.m19125F(i12);
                    int iM19145t = c10151t.m19145t();
                    c10151t.m19125F(i13);
                    int iM19129d3 = c10151t.m19129d();
                    if (iM19150y4 > spannableStringBuilder.length()) {
                        StringBuilder sbM614j = C0141b.m614j("Truncating styl end (", iM19150y4, ") to cueText.length() (");
                        sbM614j.append(spannableStringBuilder.length());
                        sbM614j.append(").");
                        C10145n.m19099g("Tx3gDecoder", sbM614j.toString());
                        iM19150y4 = spannableStringBuilder.length();
                    }
                    int i21 = iM19150y4;
                    if (iM19150y3 >= i21) {
                        C10145n.m19099g("Tx3gDecoder", C0009a.m20h("Ignoring styl with start (", iM19150y3, ") >= end (", i21, ")."));
                        i11 = iM19150y2;
                        f3 = fM19040g;
                    } else {
                        f3 = fM19040g;
                        i11 = iM19150y2;
                        m17231h(spannableStringBuilder, iM19145t, this.f47164o, iM19150y3, i21, 0);
                        if (iM19129d3 != i17) {
                            spannableStringBuilder.setSpan(new ForegroundColorSpan((iM19129d3 >>> 8) | ((iM19129d3 & 255) << 24)), iM19150y3, i21, 33);
                        }
                    }
                    i14++;
                    i12 = 2;
                    i13 = 1;
                    i20 = 0;
                    fM19040g = f3;
                    iM19150y2 = i11;
                }
            } else {
                float f11 = fM19040g;
                if (iM19129d2 == 1952608120 && this.f47163n) {
                    i12 = 2;
                    if (!(c10151t.f51440c - c10151t.f51439b >= 2)) {
                        throw new SubtitleDecoderException("Unexpected subtitle format.");
                    }
                    fM19040g = C10134c0.m19040g(c10151t.m19150y() / this.f47168s, 0.0f, 0.95f);
                } else {
                    i12 = 2;
                    fM19040g = f11;
                }
            }
            c10151t.m19124E(i19 + iM19129d);
            i13 = 1;
            i14 = 0;
        }
    }
}
