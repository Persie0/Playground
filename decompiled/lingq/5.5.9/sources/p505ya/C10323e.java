package p505ya;

import com.google.android.exoplayer2.ParserException;
import java.util.Collections;
import java.util.List;
import p385sf.C9000b;
import p479xa.C10148q;
import p479xa.C10151t;

/* JADX INFO: renamed from: ya.e */
/* JADX INFO: loaded from: classes.dex */
public final class C10323e {

    /* JADX INFO: renamed from: a */
    public final List<byte[]> f51915a;

    /* JADX INFO: renamed from: b */
    public final int f51916b;

    /* JADX INFO: renamed from: c */
    public final float f51917c;

    /* JADX INFO: renamed from: d */
    public final String f51918d;

    public C10323e(List list, int i10, float f3, String str) {
        this.f51915a = list;
        this.f51916b = i10;
        this.f51917c = f3;
        this.f51918d = str;
    }

    /* JADX INFO: renamed from: a */
    public static C10323e m19325a(C10151t c10151t) throws ParserException {
        try {
            c10151t.m19125F(21);
            int iM19145t = c10151t.m19145t() & 3;
            int iM19145t2 = c10151t.m19145t();
            int i10 = c10151t.f51439b;
            int i11 = 0;
            int i12 = 0;
            for (int i13 = 0; i13 < iM19145t2; i13++) {
                c10151t.m19125F(1);
                int iM19150y = c10151t.m19150y();
                for (int i14 = 0; i14 < iM19150y; i14++) {
                    int iM19150y2 = c10151t.m19150y();
                    i12 += iM19150y2 + 4;
                    c10151t.m19125F(iM19150y2);
                }
            }
            c10151t.m19124E(i10);
            byte[] bArr = new byte[i12];
            float f3 = 1.0f;
            String strM17241g = null;
            int i15 = 0;
            int i16 = 0;
            while (i15 < iM19145t2) {
                int iM19145t3 = c10151t.m19145t() & 63;
                int iM19150y3 = c10151t.m19150y();
                int i17 = i11;
                while (i17 < iM19150y3) {
                    int iM19150y4 = c10151t.m19150y();
                    System.arraycopy(C10148q.f51402a, i11, bArr, i16, 4);
                    int i18 = i16 + 4;
                    System.arraycopy(c10151t.f51438a, c10151t.f51439b, bArr, i18, iM19150y4);
                    if (iM19145t3 == 33 && i17 == 0) {
                        C10148q.a aVarM19115c = C10148q.m19115c(bArr, i18, i18 + iM19150y4);
                        float f10 = aVarM19115c.f51412g;
                        strM17241g = C9000b.m17241g(aVarM19115c.f51406a, aVarM19115c.f51408c, aVarM19115c.f51409d, aVarM19115c.f51411f, aVarM19115c.f51407b, aVarM19115c.f51410e);
                        f3 = f10;
                    }
                    i16 = i18 + iM19150y4;
                    c10151t.m19125F(iM19150y4);
                    i17++;
                    iM19145t2 = iM19145t2;
                    i11 = 0;
                }
                i15++;
                i11 = 0;
            }
            return new C10323e(i12 == 0 ? Collections.emptyList() : Collections.singletonList(bArr), iM19145t + 1, f3, strM17241g);
        } catch (ArrayIndexOutOfBoundsException e10) {
            throw ParserException.m6770a("Error parsing HEVC config", e10);
        }
    }
}
