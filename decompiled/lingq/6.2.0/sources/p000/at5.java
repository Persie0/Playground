package p000;

import com.google.common.primitives.AbstractC1110a;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Arrays;

/* JADX INFO: loaded from: classes2.dex */
public final class at5 implements dy5 {

    /* JADX INFO: renamed from: a */
    public final String f7466a;

    /* JADX INFO: renamed from: b */
    public final byte[] f7467b;

    /* JADX INFO: renamed from: c */
    public final int f7468c;

    /* JADX INFO: renamed from: d */
    public final int f7469d;

    public at5(String str, byte[] bArr, int i, int i2) {
        byte b;
        str.getClass();
        boolean z = false;
        switch (str) {
            case "com.android.capture.fps":
                if (i2 == 23 && bArr.length == 4) {
                    z = true;
                }
                bna.m3969q(z);
                break;
            case "auxiliary.tracks.interleaved":
                if (i2 == 75 && bArr.length == 1 && ((b = bArr[0]) == 0 || b == 1)) {
                    z = true;
                }
                bna.m3969q(z);
                break;
            case "auxiliary.tracks.length":
            case "auxiliary.tracks.offset":
                if (i2 == 78 && bArr.length == 8) {
                    z = true;
                }
                bna.m3969q(z);
                break;
            case "auxiliary.tracks.map":
                bna.m3969q(i2 == 0);
                break;
        }
        this.f7466a = str;
        this.f7467b = bArr;
        this.f7468c = i;
        this.f7469d = i2;
    }

    /* JADX INFO: renamed from: d */
    public final ArrayList m3033d() {
        bna.m3985y("Metadata is not an auxiliary tracks map", this.f7466a.equals("auxiliary.tracks.map"));
        byte[] bArr = this.f7467b;
        byte b = bArr[1];
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < b; i++) {
            arrayList.add(Integer.valueOf(bArr[i + 2]));
        }
        return arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && at5.class == obj.getClass()) {
            at5 at5Var = (at5) obj;
            if (this.f7466a.equals(at5Var.f7466a) && Arrays.equals(this.f7467b, at5Var.f7467b) && this.f7468c == at5Var.f7468c && this.f7469d == at5Var.f7469d) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((Arrays.hashCode(this.f7467b) + ux5.m22980c(527, this.f7466a, 31)) * 31) + this.f7468c) * 31) + this.f7469d;
    }

    /* JADX WARN: Code duplicated, block: B:30:0x00af  */
    /* JADX WARN: Code duplicated, block: B:32:0x00b7  */
    /* JADX WARN: Code duplicated, block: B:34:0x00bf  */
    /* JADX WARN: Code duplicated, block: B:38:0x00cb  */
    /* JADX WARN: Code duplicated, block: B:48:0x00e8  */
    /* JADX WARN: Code duplicated, block: B:50:0x00f0  */
    /* JADX WARN: Code duplicated, block: B:54:0x010e  */
    /* JADX WARN: Code duplicated, block: B:57:0x0115  */
    /* JADX WARN: Code duplicated, block: B:60:0x0120  */
    /* JADX WARN: Code duplicated, block: B:62:0x0129  */
    /* JADX WARN: Code duplicated, block: B:63:0x012c A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:64:0x012e  */
    /* JADX WARN: Code duplicated, block: B:65:0x0130  */
    /* JADX WARN: Code duplicated, block: B:68:0x0135  */
    /* JADX WARN: Code duplicated, block: B:73:0x0166 A[EDGE_INSN: B:73:0x0166->B:75:0x016c BREAK  A[LOOP:0: B:33:0x00bd->B:74:0x0168]] */
    /* JADX WARN: Code duplicated, block: B:74:0x0168 A[LOOP:0: B:33:0x00bd->B:74:0x0168, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:77:0x0170  */
    /* JADX WARN: Code duplicated, block: B:78:0x0172  */
    /* JADX WARN: Code duplicated, block: B:84:0x00c7 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:85:0x00da A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:91:0x00f3 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:92:0x013a A[SYNTHETIC] */
    /* JADX WARN: Instruction removed from duplicated block: B:32:0x00b7, please report this as an issue */
    public final String toString() {
        String string;
        y80 y80Var;
        a90 y80Var2;
        x80 x80Var;
        char[] cArr;
        int i;
        int length;
        int i2;
        boolean z;
        char[] cArr2;
        int i3;
        x80 x80Var2;
        byte[] bArr;
        byte[] bArrCopyOf;
        int i4;
        int i5;
        byte b;
        byte b2;
        boolean z2;
        char c;
        char c2;
        char c3;
        char c4;
        String str = this.f7466a;
        byte[] bArr2 = this.f7467b;
        int i6 = this.f7469d;
        if (i6 != 0) {
            if (i6 == 1) {
                String str2 = uma.f64080a;
                string = new String(bArr2, StandardCharsets.UTF_8);
            } else if (i6 == 23) {
                bna.m3961m(bArr2.length, 4, "array too small: %s < %s", bArr2.length >= 4);
                string = String.valueOf(Float.intBitsToFloat(AbstractC1110a.m6363c(bArr2[0], bArr2[1], bArr2[2], bArr2[3])));
            } else if (i6 == 67) {
                bna.m3961m(bArr2.length, 4, "array too small: %s < %s", bArr2.length >= 4);
                string = String.valueOf(AbstractC1110a.m6363c(bArr2[0], bArr2[1], bArr2[2], bArr2[3]));
            } else if (i6 == 75) {
                string = String.valueOf(Byte.toUnsignedInt(bArr2[0]));
            } else if (i6 != 78) {
                String str3 = uma.f64080a;
                y80Var = a90.f372e;
                y80Var2 = y80Var.f375c;
                if (y80Var2 == null) {
                    x80Var = y80Var.f373a;
                    cArr = x80Var.f67913b;
                    for (char c5 : cArr) {
                        if (AbstractC3584sr.m21603N(c5)) {
                            length = cArr.length;
                            i2 = 0;
                            while (true) {
                                if (i2 >= length) {
                                    z = false;
                                    break;
                                }
                                c4 = cArr[i2];
                                if (c4 < 'a' && c4 <= 'z') {
                                    z = true;
                                    break;
                                }
                                i2++;
                            }
                            bna.m3985y("Cannot call lowerCase() on a mixed-case alphabet", !z);
                            cArr2 = new char[cArr.length];
                            for (i3 = 0; i3 < cArr.length; i3++) {
                                c3 = cArr[i3];
                                if (AbstractC3584sr.m21603N(c3)) {
                                    c3 = (char) (c3 ^ ' ');
                                }
                                cArr2[i3] = c3;
                            }
                            x80Var2 = new x80(AbstractC3393o1.m17738m(new StringBuilder(), x80Var.f67912a, ".lowerCase()"), cArr2);
                            if (x80Var.f67919h) {
                                x80Var = x80Var2;
                                break;
                            }
                            bArr = x80Var2.f67918g;
                            if (x80Var2.f67919h) {
                                bArrCopyOf = Arrays.copyOf(bArr, bArr.length);
                                for (i4 = 65; i4 <= 90; i4++) {
                                    i5 = i4 | 32;
                                    b = bArr[i4];
                                    b2 = bArr[i5];
                                    if (b == -1) {
                                        bArrCopyOf[i4] = b2;
                                    } else {
                                        if (b2 == -1) {
                                            z2 = true;
                                        } else {
                                            z2 = false;
                                        }
                                        c = (char) i4;
                                        c2 = (char) i5;
                                        if (z2) {
                                            C3386nv.m17633t(b34.m3207B("Can't ignoreCase() since '%s' and '%s' encode different values", Character.valueOf(c), Character.valueOf(c2)));
                                            return null;
                                        }
                                        bArrCopyOf[i5] = b;
                                    }
                                }
                                x80Var = new x80(AbstractC3393o1.m17738m(new StringBuilder(), x80Var2.f67912a, ".ignoreCase()"), x80Var2.f67913b, bArrCopyOf, true);
                                break;
                            }
                            x80Var = x80Var2;
                            break;
                        }
                    }
                    if (x80Var == y80Var.f373a) {
                        y80Var2 = y80Var;
                    } else {
                        Character ch = y80Var.f374b;
                        y80Var2 = new y80(x80Var);
                    }
                    y80Var.f375c = y80Var2;
                }
                string = y80Var2.m183a(bArr2);
            } else {
                string = String.valueOf(new k47(bArr2).m14811F());
            }
        } else if (str.equals("auxiliary.tracks.map")) {
            ArrayList arrayListM3033d = m3033d();
            StringBuilder sbM22997t = ux5.m22997t("track types = ");
            new si4(String.valueOf(','), 1).m21394a(sbM22997t, arrayListM3033d.iterator());
            string = sbM22997t.toString();
        } else {
            String str4 = uma.f64080a;
            y80Var = a90.f372e;
            y80Var2 = y80Var.f375c;
            if (y80Var2 == null) {
                x80Var = y80Var.f373a;
                cArr = x80Var.f67913b;
                while (i < r6) {
                    if (AbstractC3584sr.m21603N(c5)) {
                        length = cArr.length;
                        i2 = 0;
                        while (true) {
                            if (i2 >= length) {
                                z = false;
                                break;
                            }
                            c4 = cArr[i2];
                            if (c4 < 'a') {
                            }
                            i2++;
                        }
                        bna.m3985y("Cannot call lowerCase() on a mixed-case alphabet", !z);
                        cArr2 = new char[cArr.length];
                        while (i3 < cArr.length) {
                            c3 = cArr[i3];
                            if (AbstractC3584sr.m21603N(c3)) {
                                c3 = (char) (c3 ^ ' ');
                            }
                            cArr2[i3] = c3;
                        }
                        x80Var2 = new x80(AbstractC3393o1.m17738m(new StringBuilder(), x80Var.f67912a, ".lowerCase()"), cArr2);
                        if (x80Var.f67919h) {
                            x80Var = x80Var2;
                            break;
                        }
                        bArr = x80Var2.f67918g;
                        if (x80Var2.f67919h) {
                            bArrCopyOf = Arrays.copyOf(bArr, bArr.length);
                            while (i4 <= 90) {
                                i5 = i4 | 32;
                                b = bArr[i4];
                                b2 = bArr[i5];
                                if (b == -1) {
                                    bArrCopyOf[i4] = b2;
                                } else {
                                    if (b2 == -1) {
                                        z2 = true;
                                    } else {
                                        z2 = false;
                                    }
                                    c = (char) i4;
                                    c2 = (char) i5;
                                    if (z2) {
                                        C3386nv.m17633t(b34.m3207B("Can't ignoreCase() since '%s' and '%s' encode different values", Character.valueOf(c), Character.valueOf(c2)));
                                        return null;
                                    }
                                    bArrCopyOf[i5] = b;
                                }
                            }
                            x80Var = new x80(AbstractC3393o1.m17738m(new StringBuilder(), x80Var2.f67912a, ".ignoreCase()"), x80Var2.f67913b, bArrCopyOf, true);
                            break;
                        }
                        x80Var = x80Var2;
                        break;
                    }
                }
                if (x80Var == y80Var.f373a) {
                    y80Var2 = y80Var;
                } else {
                    Character ch2 = y80Var.f374b;
                    y80Var2 = new y80(x80Var);
                }
                y80Var.f375c = y80Var2;
            }
            string = y80Var2.m183a(bArr2);
        }
        return wq1.m24119o("mdta: key=", str, ", value=", string);
    }
}
