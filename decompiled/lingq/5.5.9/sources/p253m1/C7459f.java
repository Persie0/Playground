package p253m1;

import android.text.Layout;
import android.text.TextUtils;
import dm.C5207g;
import java.text.Bidi;
import java.util.ArrayList;
import kotlin.text.C7076b;
import p003a2.C0009a;
import p385sf.C9000b;

/* JADX INFO: renamed from: m1.f */
/* JADX INFO: loaded from: classes.dex */
public final class C7459f {

    /* JADX INFO: renamed from: a */
    public final Layout f41279a;

    /* JADX INFO: renamed from: b */
    public final ArrayList f41280b;

    /* JADX INFO: renamed from: c */
    public final ArrayList f41281c;

    /* JADX INFO: renamed from: d */
    public final boolean[] f41282d;

    /* JADX INFO: renamed from: e */
    public char[] f41283e;

    /* JADX INFO: renamed from: m1.f$a */
    public static final class a {

        /* JADX INFO: renamed from: a */
        public final int f41284a;

        /* JADX INFO: renamed from: b */
        public final int f41285b;

        /* JADX INFO: renamed from: c */
        public final boolean f41286c;

        public a(int i10, int i11, boolean z10) {
            this.f41284a = i10;
            this.f41285b = i11;
            this.f41286c = z10;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return this.f41284a == aVar.f41284a && this.f41285b == aVar.f41285b && this.f41286c == aVar.f41286c;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r0v4, types: [int] */
        /* JADX WARN: Type inference failed for: r1v2, types: [int] */
        /* JADX WARN: Type inference failed for: r1v3 */
        /* JADX WARN: Type inference failed for: r1v4 */
        public final int hashCode() {
            int iM16d = C0009a.m16d(this.f41285b, Integer.hashCode(this.f41284a) * 31, 31);
            boolean z10 = this.f41286c;
            ?? r10 = z10;
            if (z10) {
                r10 = 1;
            }
            return iM16d + r10;
        }

        public final String toString() {
            return "BidiRun(start=" + this.f41284a + ", end=" + this.f41285b + ", isRtl=" + this.f41286c + ')';
        }
    }

    public C7459f(Layout layout) {
        C5207g.m11111f(layout, "layout");
        this.f41279a = layout;
        ArrayList arrayList = new ArrayList();
        int length = 0;
        do {
            CharSequence text = this.f41279a.getText();
            C5207g.m11110e(text, "layout.text");
            int iM14284d3 = C7076b.m14284d3(text, '\n', length, false, 4);
            length = iM14284d3 < 0 ? this.f41279a.getText().length() : iM14284d3 + 1;
            arrayList.add(Integer.valueOf(length));
        } while (length < this.f41279a.getText().length());
        this.f41280b = arrayList;
        int size = arrayList.size();
        ArrayList arrayList2 = new ArrayList(size);
        for (int i10 = 0; i10 < size; i10++) {
            arrayList2.add(null);
        }
        this.f41281c = arrayList2;
        this.f41282d = new boolean[this.f41280b.size()];
        this.f41280b.size();
    }

    /* JADX WARN: Code duplicated, block: B:136:0x0211  */
    /* JADX WARN: Code duplicated, block: B:138:0x021d  */
    /* JADX WARN: Code duplicated, block: B:83:0x016a  */
    /* JADX WARN: Code duplicated, block: B:85:0x016e  */
    /* JADX WARN: Code duplicated, block: B:86:0x0171  */
    /* JADX INFO: renamed from: a */
    public final float m14829a(int i10, boolean z10, boolean z11) {
        int lineForOffset;
        boolean z12;
        Bidi bidi;
        char[] cArr;
        boolean z13;
        boolean z14;
        int iM14830b = i10;
        Layout layout = this.f41279a;
        if (!z11) {
            return z10 ? layout.getPrimaryHorizontal(iM14830b) : layout.getSecondaryHorizontal(iM14830b);
        }
        C5207g.m11111f(layout, "<this>");
        if (iM14830b <= 0) {
            lineForOffset = 0;
        } else if (iM14830b >= layout.getText().length()) {
            lineForOffset = layout.getLineCount() - 1;
        } else {
            lineForOffset = layout.getLineForOffset(iM14830b);
            int lineStart = layout.getLineStart(lineForOffset);
            int lineEnd = layout.getLineEnd(lineForOffset);
            if (lineStart == iM14830b || lineEnd == iM14830b) {
                if (lineStart == iM14830b) {
                    if (z11) {
                        lineForOffset--;
                    }
                } else if (!z11) {
                    lineForOffset++;
                }
            }
        }
        int lineStart2 = layout.getLineStart(lineForOffset);
        int lineEnd2 = layout.getLineEnd(lineForOffset);
        if (iM14830b != lineStart2 && iM14830b != lineEnd2) {
            return z10 ? layout.getPrimaryHorizontal(iM14830b) : layout.getSecondaryHorizontal(iM14830b);
        }
        if (iM14830b == 0 || iM14830b == layout.getText().length()) {
            return z10 ? layout.getPrimaryHorizontal(iM14830b) : layout.getSecondaryHorizontal(iM14830b);
        }
        ArrayList arrayList = this.f41280b;
        int iM17238d = C9000b.m17238d(arrayList, Integer.valueOf(i10));
        int i11 = iM17238d < 0 ? -(iM17238d + 1) : iM17238d + 1;
        if (z11 && i11 > 0) {
            int i12 = i11 - 1;
            if (iM14830b == ((Number) arrayList.get(i12)).intValue()) {
                i11 = i12;
            }
        }
        boolean z15 = layout.getParagraphDirection(layout.getLineForOffset(i11 == 0 ? 0 : ((Number) arrayList.get(i11 + (-1))).intValue())) == -1;
        int iM14830b2 = m14830b(lineEnd2);
        int iIntValue = i11 == 0 ? 0 : ((Number) arrayList.get(i11 - 1)).intValue();
        int i13 = lineStart2 - iIntValue;
        int i14 = iM14830b2 - iIntValue;
        boolean[] zArr = this.f41282d;
        boolean z16 = zArr[i11];
        ArrayList arrayList2 = this.f41281c;
        if (z16) {
            bidi = (Bidi) arrayList2.get(i11);
        } else {
            int iIntValue2 = i11 == 0 ? 0 : ((Number) arrayList.get(i11 - 1)).intValue();
            int iIntValue3 = ((Number) arrayList.get(i11)).intValue();
            int i15 = iIntValue3 - iIntValue2;
            char[] cArr2 = this.f41283e;
            if (cArr2 == null || cArr2.length < i15) {
                cArr2 = new char[i15];
            }
            TextUtils.getChars(layout.getText(), iIntValue2, iIntValue3, cArr2, 0);
            if (Bidi.requiresBidi(cArr2, 0, i15)) {
                Bidi bidi2 = new Bidi(cArr2, 0, null, 0, i15, layout.getParagraphDirection(layout.getLineForOffset(i11 == 0 ? 0 : ((Number) arrayList.get(i11 + (-1))).intValue())) == -1 ? 1 : 0);
                z12 = true;
                if (bidi2.getRunCount() != 1) {
                    bidi = bidi2;
                }
                arrayList2.set(i11, bidi);
                zArr[i11] = z12;
                if (bidi != null) {
                    cArr = this.f41283e;
                    if (cArr2 == cArr) {
                        cArr2 = null;
                    } else {
                        cArr2 = cArr;
                    }
                }
                this.f41283e = cArr2;
            } else {
                z12 = true;
            }
            bidi = null;
            arrayList2.set(i11, bidi);
            zArr[i11] = z12;
            if (bidi != null) {
                cArr = this.f41283e;
                if (cArr2 == cArr) {
                    cArr2 = null;
                } else {
                    cArr2 = cArr;
                }
            }
            this.f41283e = cArr2;
        }
        Bidi bidiCreateLineBidi = bidi != null ? bidi.createLineBidi(i13, i14) : null;
        if (bidiCreateLineBidi == null) {
            z13 = true;
        } else {
            if (bidiCreateLineBidi.getRunCount() != 1) {
                int runCount = bidiCreateLineBidi.getRunCount();
                a[] aVarArr = new a[runCount];
                for (int i16 = 0; i16 < runCount; i16++) {
                    aVarArr[i16] = new a(bidiCreateLineBidi.getRunStart(i16) + lineStart2, bidiCreateLineBidi.getRunLimit(i16) + lineStart2, bidiCreateLineBidi.getRunLevel(i16) % 2 == 1);
                }
                int runCount2 = bidiCreateLineBidi.getRunCount();
                byte[] bArr = new byte[runCount2];
                for (int i17 = 0; i17 < runCount2; i17++) {
                    bArr[i17] = (byte) bidiCreateLineBidi.getRunLevel(i17);
                }
                Bidi.reorderVisually(bArr, 0, aVarArr, 0, runCount);
                if (iM14830b != lineStart2) {
                    int i18 = lineForOffset;
                    boolean z17 = z15;
                    if (iM14830b > iM14830b2) {
                        iM14830b = m14830b(i10);
                    }
                    int i19 = 0;
                    while (true) {
                        if (i19 >= runCount) {
                            i19 = -1;
                            break;
                        }
                        if (aVarArr[i19].f41285b == iM14830b) {
                            break;
                        }
                        i19++;
                    }
                    a aVar = aVarArr[i19];
                    if (!z10 && z17 != aVar.f41286c) {
                        z17 = !z17;
                    }
                    if (i19 == 0 && z17) {
                        return layout.getLineLeft(i18);
                    }
                    if (i19 != runCount - 1 || z17) {
                        return z17 ? layout.getPrimaryHorizontal(aVarArr[i19 - 1].f41285b) : layout.getPrimaryHorizontal(aVarArr[i19 + 1].f41285b);
                    }
                    return layout.getLineRight(i18);
                }
                int i20 = 0;
                while (true) {
                    if (i20 >= runCount) {
                        i20 = -1;
                        break;
                    }
                    if (aVarArr[i20].f41284a == iM14830b) {
                        break;
                    }
                    i20++;
                }
                a aVar2 = aVarArr[i20];
                if (!z10) {
                    z14 = z15;
                    if (z14 == aVar2.f41286c) {
                    }
                    if (i20 != 0 && z14) {
                        return layout.getLineLeft(lineForOffset);
                    }
                    int i21 = lineForOffset;
                    if (i20 == runCount - 1 || z14) {
                        return z14 ? layout.getPrimaryHorizontal(aVarArr[i20 - 1].f41284a) : layout.getPrimaryHorizontal(aVarArr[i20 + 1].f41284a);
                    }
                    return layout.getLineRight(i21);
                }
                z14 = z15;
                z14 = !z14;
                if (i20 != 0) {
                }
                int i22 = lineForOffset;
                if (i20 == runCount - 1) {
                }
                if (z14) {
                }
            }
            z13 = true;
        }
        boolean zIsRtlCharAt = layout.isRtlCharAt(lineStart2);
        if (z10 || z15 == zIsRtlCharAt) {
            z15 = z15 == 0 ? z13 : false;
        }
        return iM14830b == lineStart2 ? z15 : !z15 ? z13 : false ? layout.getLineLeft(lineForOffset) : layout.getLineRight(lineForOffset);
    }

    /* JADX WARN: Code duplicated, block: B:26:0x0041 A[PHI: r2
      0x0041: PHI (r2v1 boolean) = (r2v0 boolean), (r2v0 boolean), (r2v0 boolean), (r2v0 boolean), (r2v3 boolean), (r2v0 boolean) binds: [B:5:0x0016, B:7:0x001b, B:9:0x001f, B:21:0x0039, B:25:0x0040, B:18:0x0033] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX INFO: renamed from: b */
    public final int m14830b(int i10) {
        while (i10 > 0) {
            char cCharAt = this.f41279a.getText().charAt(i10 - 1);
            boolean z10 = true;
            if (cCharAt != ' ' && cCharAt != '\n' && cCharAt != 5760) {
                if (!(8192 <= cCharAt && cCharAt < 8203) || cCharAt == 8199) {
                    if (cCharAt != 8287) {
                        if (cCharAt != 12288) {
                            z10 = false;
                        }
                    }
                }
            }
            if (!z10) {
                break;
            }
            i10--;
        }
        return i10;
    }
}
