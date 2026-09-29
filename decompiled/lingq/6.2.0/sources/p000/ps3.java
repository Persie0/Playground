package p000;

import androidx.media3.common.ParserException;
import com.google.common.collect.ImmutableList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class ps3 {

    /* JADX INFO: renamed from: a */
    public final List f56742a;

    /* JADX INFO: renamed from: b */
    public final int f56743b;

    /* JADX INFO: renamed from: c */
    public final int f56744c;

    /* JADX INFO: renamed from: d */
    public final int f56745d;

    /* JADX INFO: renamed from: e */
    public final int f56746e;

    /* JADX INFO: renamed from: f */
    public final int f56747f;

    /* JADX INFO: renamed from: g */
    public final int f56748g;

    /* JADX INFO: renamed from: h */
    public final int f56749h;

    /* JADX INFO: renamed from: i */
    public final int f56750i;

    /* JADX INFO: renamed from: j */
    public final int f56751j;

    /* JADX INFO: renamed from: k */
    public final int f56752k;

    /* JADX INFO: renamed from: l */
    public final float f56753l;

    /* JADX INFO: renamed from: m */
    public final int f56754m;

    /* JADX INFO: renamed from: n */
    public final String f56755n;

    /* JADX INFO: renamed from: o */
    public final C3329mb f56756o;

    public ps3(List list, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, int i10, float f, int i11, String str, C3329mb c3329mb) {
        this.f56742a = list;
        this.f56743b = i;
        this.f56744c = i2;
        this.f56745d = i3;
        this.f56746e = i4;
        this.f56747f = i5;
        this.f56748g = i6;
        this.f56749h = i7;
        this.f56750i = i8;
        this.f56751j = i9;
        this.f56752k = i10;
        this.f56753l = f;
        this.f56754m = i11;
        this.f56755n = str;
        this.f56756o = c3329mb;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: a */
    public static ps3 m19467a(k47 k47Var, boolean z, C3329mb c3329mb) throws ParserException {
        boolean z2;
        cp3 cp3VarM25800h;
        int i = 4;
        try {
            if (z) {
                k47Var.m14819N(4);
            } else {
                k47Var.m14819N(21);
            }
            int iM14842z = k47Var.m14842z() & 3;
            int iM14842z2 = k47Var.m14842z();
            int i2 = k47Var.f46701b;
            int i3 = 0;
            int i4 = 0;
            int i5 = 0;
            while (true) {
                z2 = true;
                if (i4 >= iM14842z2) {
                    break;
                }
                k47Var.m14819N(1);
                int iM14812G = k47Var.m14812G();
                for (int i6 = 0; i6 < iM14812G; i6++) {
                    int iM14812G2 = k47Var.m14812G();
                    i5 += iM14812G2 + 4;
                    k47Var.m14819N(iM14812G2);
                }
                i4++;
            }
            k47Var.m14818M(i2);
            byte[] bArr = new byte[i5];
            C3329mb c3329mb2 = c3329mb;
            int i7 = -1;
            int i8 = -1;
            int i9 = -1;
            int i10 = -1;
            int i11 = -1;
            int i12 = -1;
            int i13 = -1;
            int i14 = -1;
            int i15 = -1;
            int i16 = -1;
            float f = 1.0f;
            String strM16615a = null;
            int i17 = 0;
            int i18 = 0;
            while (i17 < iM14842z2) {
                int iM14842z3 = k47Var.m14842z() & 63;
                int iM14812G3 = k47Var.m14812G();
                int i19 = i3;
                C3329mb c3329mbM25802j = c3329mb2;
                while (i19 < iM14812G3) {
                    boolean z3 = z2;
                    int iM14812G4 = k47Var.m14812G();
                    int i20 = iM14842z;
                    System.arraycopy(zuc.f72211a, i3, bArr, i18, i);
                    int i21 = i18 + 4;
                    System.arraycopy(k47Var.f46700a, k47Var.f46701b, bArr, i21, iM14812G4);
                    if (iM14842z3 == 32 && i19 == 0) {
                        c3329mbM25802j = zuc.m25802j(bArr, i21, i21 + iM14812G4);
                    } else {
                        if (iM14842z3 == 33 && i19 == 0) {
                            j76 j76VarM25801i = zuc.m25801i(bArr, i21, i21 + iM14812G4, c3329mbM25802j);
                            i7 = j76VarM25801i.f45148a + 1;
                            i8 = j76VarM25801i.f45154g;
                            int i22 = j76VarM25801i.f45155h;
                            i10 = j76VarM25801i.f45150c + 8;
                            i11 = j76VarM25801i.f45151d + 8;
                            int i23 = j76VarM25801i.f45158k;
                            i9 = i22;
                            int i24 = j76VarM25801i.f45159l;
                            int i25 = j76VarM25801i.f45160m;
                            float f2 = j76VarM25801i.f45156i;
                            int i26 = j76VarM25801i.f45157j;
                            g76 g76Var = j76VarM25801i.f45149b;
                            if (g76Var != null) {
                                strM16615a = m41.m16615a(g76Var.f40325a, g76Var.f40326b, g76Var.f40327c, g76Var.f40328d, g76Var.f40329e, g76Var.f40330f);
                            }
                            i16 = i26;
                            f = f2;
                            i14 = i25;
                            i13 = i24;
                            i12 = i23;
                        } else if (iM14842z3 == 39 && i19 == 0 && (cp3VarM25800h = zuc.m25800h(bArr, i21, i21 + iM14812G4)) != null && c3329mbM25802j != null) {
                            i3 = 0;
                            i15 = cp3VarM25800h.f34342b == ((f76) ((ImmutableList) c3329mbM25802j.f50860b).get(0)).f38574b ? 4 : 5;
                        }
                        i3 = 0;
                    }
                    i18 = i21 + iM14812G4;
                    k47Var.m14819N(iM14812G4);
                    i19++;
                    z2 = z3;
                    iM14842z = i20;
                    i = 4;
                }
                i17++;
                c3329mb2 = c3329mbM25802j;
                i = 4;
            }
            return new ps3(i5 == 0 ? Collections.EMPTY_LIST : Collections.singletonList(bArr), iM14842z + 1, i7, i8, i9, i10, i11, i12, i13, i14, i15, f, i16, strM16615a, c3329mb2);
        } catch (ArrayIndexOutOfBoundsException e) {
            throw ParserException.m2516a(e, "Error parsing".concat(z ? "L-HEVC config" : "HEVC config"));
        }
    }
}
