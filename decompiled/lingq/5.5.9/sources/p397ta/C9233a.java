package p397ta;

import com.google.android.exoplayer2.text.SubtitleDecoderException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.regex.Pattern;
import p219ka.AbstractC6645f;
import p219ka.C6640a;
import p219ka.InterfaceC6646g;
import p479xa.C10134c0;
import p479xa.C10151t;
import p482xd.C10170b;

/* JADX INFO: renamed from: ta.a */
/* JADX INFO: loaded from: classes.dex */
public final class C9233a extends AbstractC6645f {

    /* JADX INFO: renamed from: m */
    public final C10151t f47875m = new C10151t();

    @Override // p219ka.AbstractC6645f
    /* JADX INFO: renamed from: g */
    public final InterfaceC6646g mo13279g(byte[] bArr, int i10, boolean z10) throws SubtitleDecoderException {
        C6640a c6640aM13277a;
        C10151t c10151t = this.f47875m;
        c10151t.m19122C(bArr, i10);
        ArrayList arrayList = new ArrayList();
        while (true) {
            int i11 = c10151t.f51440c - c10151t.f51439b;
            if (i11 <= 0) {
                return new C9234b(arrayList);
            }
            if (i11 < 8) {
                throw new SubtitleDecoderException("Incomplete Mp4Webvtt Top Level box header found.");
            }
            int iM19129d = c10151t.m19129d();
            if (c10151t.m19129d() == 1987343459) {
                int i12 = iM19129d - 8;
                CharSequence charSequenceM17600f = null;
                C6640a.a aVarM17602a = null;
                while (i12 > 0) {
                    if (i12 < 8) {
                        throw new SubtitleDecoderException("Incomplete vtt cue box header found.");
                    }
                    int iM19129d2 = c10151t.m19129d();
                    int iM19129d3 = c10151t.m19129d();
                    int i13 = iM19129d2 - 8;
                    byte[] bArr2 = c10151t.f51438a;
                    int i14 = c10151t.f51439b;
                    int i15 = C10134c0.f51354a;
                    String str = new String(bArr2, i14, i13, C10170b.f51477c);
                    c10151t.m19125F(i13);
                    i12 = (i12 - 8) - i13;
                    if (iM19129d3 == 1937011815) {
                        C9238f.d dVar = new C9238f.d();
                        C9238f.m17599e(str, dVar);
                        aVarM17602a = dVar.m17602a();
                    } else if (iM19129d3 == 1885436268) {
                        charSequenceM17600f = C9238f.m17600f(null, str.trim(), Collections.emptyList());
                    }
                }
                if (charSequenceM17600f == null) {
                    charSequenceM17600f = "";
                }
                if (aVarM17602a != null) {
                    aVarM17602a.f37671a = charSequenceM17600f;
                    c6640aM13277a = aVarM17602a.m13277a();
                } else {
                    Pattern pattern = C9238f.f47901a;
                    C9238f.d dVar2 = new C9238f.d();
                    dVar2.f47916c = charSequenceM17600f;
                    c6640aM13277a = dVar2.m17602a().m13277a();
                }
                arrayList.add(c6640aM13277a);
            } else {
                c10151t.m19125F(iM19129d - 8);
            }
        }
    }
}
