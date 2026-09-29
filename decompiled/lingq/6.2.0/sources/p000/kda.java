package p000;

import android.text.SpannableStringBuilder;
import android.text.style.ForegroundColorSpan;
import android.text.style.StyleSpan;
import android.text.style.TypefaceSpan;
import android.text.style.UnderlineSpan;
import com.google.common.collect.ImmutableList;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class kda implements cn9 {

    /* JADX INFO: renamed from: a */
    public final k47 f47069a = new k47();

    /* JADX INFO: renamed from: b */
    public final boolean f47070b;

    /* JADX INFO: renamed from: c */
    public final int f47071c;

    /* JADX INFO: renamed from: d */
    public final int f47072d;

    /* JADX INFO: renamed from: e */
    public final String f47073e;

    /* JADX INFO: renamed from: f */
    public final float f47074f;

    /* JADX INFO: renamed from: g */
    public final int f47075g;

    public kda(List list) {
        if (list.size() != 1 || (((byte[]) list.get(0)).length != 48 && ((byte[]) list.get(0)).length != 53)) {
            this.f47071c = 0;
            this.f47072d = -1;
            this.f47073e = "sans-serif";
            this.f47070b = false;
            this.f47074f = 0.85f;
            this.f47075g = -1;
            return;
        }
        byte[] bArr = (byte[]) list.get(0);
        this.f47071c = bArr[24];
        this.f47072d = ((bArr[26] & 255) << 24) | ((bArr[27] & 255) << 16) | ((bArr[28] & 255) << 8) | (bArr[29] & 255);
        this.f47073e = "Serif".equals(new String(bArr, 43, bArr.length - 43, StandardCharsets.UTF_8)) ? "serif" : "sans-serif";
        int i = bArr[25] * 20;
        this.f47075g = i;
        boolean z = (bArr[0] & 32) != 0;
        this.f47070b = z;
        if (z) {
            this.f47074f = uma.m22811f(((bArr[11] & 255) | ((bArr[10] & 255) << 8)) / i, 0.0f, 0.95f);
        } else {
            this.f47074f = 0.85f;
        }
    }

    /* JADX INFO: renamed from: a */
    public static void m15139a(SpannableStringBuilder spannableStringBuilder, int i, int i2, int i3, int i4, int i5) {
        if (i != i2) {
            spannableStringBuilder.setSpan(new ForegroundColorSpan((i >>> 8) | ((i & 255) << 24)), i3, i4, i5 | 33);
        }
    }

    /* JADX INFO: renamed from: b */
    public static void m15140b(SpannableStringBuilder spannableStringBuilder, int i, int i2, int i3, int i4, int i5) {
        if (i != i2) {
            int i6 = i5 | 33;
            boolean z = (i & 1) != 0;
            boolean z2 = (i & 2) != 0;
            if (z) {
                if (z2) {
                    spannableStringBuilder.setSpan(new StyleSpan(3), i3, i4, i6);
                } else {
                    spannableStringBuilder.setSpan(new StyleSpan(1), i3, i4, i6);
                }
            } else if (z2) {
                spannableStringBuilder.setSpan(new StyleSpan(2), i3, i4, i6);
            }
            boolean z3 = (i & 4) != 0;
            if (z3) {
                spannableStringBuilder.setSpan(new UnderlineSpan(), i3, i4, i6);
            }
            if (z3 || z || z2) {
                return;
            }
            spannableStringBuilder.setSpan(new StyleSpan(0), i3, i4, i6);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p000.cn9
    /* JADX INFO: renamed from: C */
    public final void mo4902C(byte[] bArr, int i, int i2, kk1 kk1Var) {
        String strM14840x;
        int i3;
        k47 k47Var = this.f47069a;
        k47Var.m14816K(i + i2, bArr);
        k47Var.m14818M(i);
        int i4 = 1;
        int i5 = 0;
        int i6 = 2;
        bna.m3969q(k47Var.m14820a() >= 2);
        int iM14812G = k47Var.m14812G();
        if (iM14812G == 0) {
            strM14840x = "";
        } else {
            int i7 = k47Var.f46701b;
            Charset charsetM14814I = k47Var.m14814I();
            int i8 = iM14812G - (k47Var.f46701b - i7);
            if (charsetM14814I == null) {
                charsetM14814I = StandardCharsets.UTF_8;
            }
            strM14840x = k47Var.m14840x(i8, charsetM14814I);
        }
        if (strM14840x.isEmpty()) {
            kk1Var.accept(new gs1(-9223372036854775807L, -9223372036854775807L, ImmutableList.m6289v()));
            return;
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(strM14840x);
        m15140b(spannableStringBuilder, this.f47071c, 0, 0, spannableStringBuilder.length(), 16711680);
        m15139a(spannableStringBuilder, this.f47072d, -1, 0, spannableStringBuilder.length(), 16711680);
        int length = spannableStringBuilder.length();
        String str = this.f47073e;
        if (str != "sans-serif") {
            spannableStringBuilder.setSpan(new TypefaceSpan(str), 0, length, 16711713);
        }
        float fM22811f = this.f47074f;
        while (k47Var.m14820a() >= 8) {
            int i9 = k47Var.f46701b;
            int iM14829m = k47Var.m14829m();
            int iM14829m2 = k47Var.m14829m();
            if (iM14829m2 == 1937013100) {
                bna.m3969q(k47Var.m14820a() >= i6 ? i4 : i5);
                int iM14812G2 = k47Var.m14812G();
                int i10 = i5;
                while (i10 < iM14812G2) {
                    bna.m3969q(k47Var.m14820a() >= 12 ? i4 : i5);
                    int iM14812G3 = k47Var.m14812G();
                    int iM14812G4 = k47Var.m14812G();
                    k47Var.m14819N(i6);
                    int i11 = i10;
                    int iM14842z = k47Var.m14842z();
                    k47Var.m14819N(i4);
                    int iM14829m3 = k47Var.m14829m();
                    if (iM14812G4 > spannableStringBuilder.length()) {
                        StringBuilder sbM22998u = ux5.m22998u("Truncating styl end (", iM14812G4, ") to cueText.length() (");
                        sbM22998u.append(spannableStringBuilder.length());
                        sbM22998u.append(").");
                        ss5.m21707d0("Tx3gParser", sbM22998u.toString());
                        iM14812G4 = spannableStringBuilder.length();
                    }
                    if (iM14812G3 >= iM14812G4) {
                        ss5.m21707d0("Tx3gParser", ux5.m22987j(iM14812G3, iM14812G4, "Ignoring styl with start (", ") >= end (", ")."));
                    } else {
                        int i12 = iM14812G4;
                        m15140b(spannableStringBuilder, iM14842z, this.f47071c, iM14812G3, i12, 0);
                        m15139a(spannableStringBuilder, iM14829m3, this.f47072d, iM14812G3, i12, 0);
                    }
                    i10 = i11 + 1;
                    i4 = 1;
                    i5 = 0;
                    i6 = 2;
                }
                i3 = i6;
            } else if (iM14829m2 == 1952608120 && this.f47070b) {
                i3 = 2;
                bna.m3969q(k47Var.m14820a() >= 2);
                fM22811f = uma.m22811f(k47Var.m14812G() / this.f47075g, 0.0f, 0.95f);
            } else {
                i3 = 2;
            }
            k47Var.m14818M(i9 + iM14829m);
            i6 = i3;
            i4 = 1;
            i5 = 0;
        }
        kk1Var.accept(new gs1(-9223372036854775807L, -9223372036854775807L, ImmutableList.m6291y(new cs1(spannableStringBuilder, null, null, null, fM22811f, 0, 0, -3.4028235E38f, Integer.MIN_VALUE, Integer.MIN_VALUE, -3.4028235E38f, -3.4028235E38f, -3.4028235E38f, false, -16777216, Integer.MIN_VALUE, 0.0f, 0))));
    }
}
