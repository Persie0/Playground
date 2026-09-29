package no;

import android.content.ContentValues;
import android.support.v4.media.session.C0166e;
import androidx.sqlite.p018db.framework.FrameworkSQLiteDatabase;
import com.google.zxing.BarcodeFormat;
import com.google.zxing.EncodeHintType;
import dm.C5212l;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.Collections;
import java.util.EnumMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import kotlin.Result;
import kotlinx.coroutines.internal.C7156f;
import nf.C7770a;
import nf.C7771b;
import p234l4.InterfaceC7251a;
import p242lf.InterfaceC7358c;
import p260m8.C7499b;
import p263mf.AbstractC7556f;
import p263mf.C7552b;
import p263mf.C7553c;
import p263mf.C7555e;
import p338qd.C8534e0;
import p464wl.InterfaceC9968c;
import pf.C8241d;
import pf.InterfaceC8240c;
import td.InterfaceC9271s;

/* JADX INFO: renamed from: no.a0 */
/* JADX INFO: loaded from: classes2.dex */
public class C7814a0 implements InterfaceC7251a, InterfaceC9271s, InterfaceC7358c, InterfaceC8240c {
    /* JADX INFO: renamed from: c */
    public static final String m15551c(Object obj) {
        return Integer.toHexString(System.identityHashCode(obj));
    }

    /* JADX INFO: renamed from: e */
    public static final String m15552e(InterfaceC9968c interfaceC9968c) {
        Object objM14967u;
        if (interfaceC9968c instanceof C7156f) {
            return interfaceC9968c.toString();
        }
        try {
            objM14967u = interfaceC9968c + '@' + m15551c(interfaceC9968c);
        } catch (Throwable th2) {
            objM14967u = C7499b.m14967u(th2);
        }
        if (Result.m13371a(objM14967u) != null) {
            objM14967u = interfaceC9968c.getClass().getName() + '@' + m15551c(interfaceC9968c);
        }
        return (String) objM14967u;
    }

    /* JADX INFO: renamed from: f */
    public static void m15553f(C8241d c8241d, StringBuilder sb2) {
        int iCharAt = (sb2.charAt(1) * '(') + (sb2.charAt(0) * 1600) + sb2.charAt(2) + 1;
        c8241d.f44514e.append(new String(new char[]{(char) (iCharAt / 256), (char) (iCharAt % 256)}));
        sb2.delete(0, 3);
    }

    /* JADX INFO: renamed from: a */
    public int mo15554a(char c10, StringBuilder sb2) {
        if (c10 == ' ') {
            sb2.append((char) 3);
            return 1;
        }
        if (c10 >= '0' && c10 <= '9') {
            sb2.append((char) ((c10 - '0') + 4));
            return 1;
        }
        if (c10 >= 'A' && c10 <= 'Z') {
            sb2.append((char) ((c10 - 'A') + 14));
            return 1;
        }
        if (c10 < ' ') {
            sb2.append((char) 0);
            sb2.append(c10);
            return 2;
        }
        if (c10 >= '!' && c10 <= '/') {
            sb2.append((char) 1);
            sb2.append((char) (c10 - '!'));
            return 2;
        }
        if (c10 >= ':' && c10 <= '@') {
            sb2.append((char) 1);
            sb2.append((char) ((c10 - ':') + 15));
            return 2;
        }
        if (c10 >= '[' && c10 <= '_') {
            sb2.append((char) 1);
            sb2.append((char) ((c10 - '[') + 22));
            return 2;
        }
        if (c10 < '`' || c10 > 127) {
            sb2.append("\u0001\u001e");
            return mo15554a((char) (c10 - 128), sb2) + 2;
        }
        sb2.append((char) 2);
        sb2.append((char) (c10 - '`'));
        return 2;
    }

    /* JADX INFO: renamed from: b */
    public int mo15555b() {
        return 1;
    }

    /* JADX INFO: renamed from: d */
    public void mo15556d(C8241d c8241d, StringBuilder sb2) {
        int length = (sb2.length() / 3) << 1;
        int length2 = sb2.length() % 3;
        int iM16384a = c8241d.m16384a() + length;
        c8241d.m16387d(iM16384a);
        int i10 = c8241d.f44517h.f44525b - iM16384a;
        if (length2 == 2) {
            sb2.append((char) 0);
            while (sb2.length() >= 3) {
                m15553f(c8241d, sb2);
            }
            if (c8241d.m16386c()) {
                c8241d.m16388e((char) 254);
            }
        } else if (i10 == 1 && length2 == 1) {
            while (sb2.length() >= 3) {
                m15553f(c8241d, sb2);
            }
            if (c8241d.m16386c()) {
                c8241d.m16388e((char) 254);
            }
            c8241d.f44515f--;
        } else {
            if (length2 != 0) {
                throw new IllegalStateException("Unexpected case. Please report!");
            }
            while (sb2.length() >= 3) {
                m15553f(c8241d, sb2);
            }
            if (i10 > 0 || c8241d.m16386c()) {
                c8241d.m16388e((char) 254);
            }
        }
        c8241d.f44516g = 0;
    }

    @Override // pf.InterfaceC8240c
    /* JADX INFO: renamed from: h */
    public void mo15557h(C8241d c8241d) {
        StringBuilder sb2 = new StringBuilder();
        while (c8241d.m16386c()) {
            char cM16385b = c8241d.m16385b();
            c8241d.f44515f++;
            int iMo15554a = mo15554a(cM16385b, sb2);
            int iM16384a = c8241d.m16384a() + ((sb2.length() / 3) << 1);
            c8241d.m16387d(iM16384a);
            int i10 = c8241d.f44517h.f44525b - iM16384a;
            if (!c8241d.m16386c()) {
                StringBuilder sb3 = new StringBuilder();
                if (sb2.length() % 3 == 2 && (i10 < 2 || i10 > 2)) {
                    int length = sb2.length();
                    sb2.delete(length - iMo15554a, length);
                    c8241d.f44515f--;
                    iMo15554a = mo15554a(c8241d.m16385b(), sb3);
                    c8241d.f44517h = null;
                }
                while (sb2.length() % 3 == 1) {
                    if (iMo15554a > 3 || i10 == 1) {
                        if (iMo15554a <= 3) {
                            break;
                        }
                    }
                    int length2 = sb2.length();
                    sb2.delete(length2 - iMo15554a, length2);
                    c8241d.f44515f--;
                    iMo15554a = mo15554a(c8241d.m16385b(), sb3);
                    c8241d.f44517h = null;
                }
                break;
            }
            if (sb2.length() % 3 == 0) {
                if (C5212l.m11154a0(c8241d.f44510a, c8241d.f44515f, mo15555b()) != mo15555b()) {
                    c8241d.f44516g = 0;
                    break;
                }
            }
        }
        mo15556d(c8241d, sb2);
    }

    @Override // p234l4.InterfaceC7251a
    /* JADX INFO: renamed from: j */
    public final void mo14599j(FrameworkSQLiteDatabase frameworkSQLiteDatabase) {
        frameworkSQLiteDatabase.mo4600u("UPDATE workspec SET period_count = 1 WHERE last_enqueue_time <> 0 AND interval_duration <> 0");
        ContentValues contentValues = new ContentValues(1);
        contentValues.put("last_enqueue_time", Long.valueOf(System.currentTimeMillis()));
        frameworkSQLiteDatabase.m4598l(contentValues, new Object[0]);
    }

    /* JADX WARN: Code duplicated, block: B:39:0x00a1  */
    @Override // p242lf.InterfaceC7358c
    /* JADX INFO: renamed from: j0 */
    public final C7771b mo9303j0(String str, BarcodeFormat barcodeFormat, EnumMap enumMap) {
        byte[] bArr;
        boolean z10;
        int i10;
        C7770a c7770aM11170n0;
        int iAbs;
        int i11;
        C7770a c7770aM11144Q;
        int i12;
        int i13;
        int i14;
        Charset charsetForName = StandardCharsets.ISO_8859_1;
        EncodeHintType encodeHintType = EncodeHintType.CHARACTER_SET;
        if (enumMap.containsKey(encodeHintType)) {
            charsetForName = Charset.forName(enumMap.get(encodeHintType).toString());
        }
        EncodeHintType encodeHintType2 = EncodeHintType.ERROR_CORRECTION;
        int i15 = enumMap.containsKey(encodeHintType2) ? Integer.parseInt(enumMap.get(encodeHintType2).toString()) : 33;
        EncodeHintType encodeHintType3 = EncodeHintType.AZTEC_LAYERS;
        int i16 = enumMap.containsKey(encodeHintType3) ? Integer.parseInt(enumMap.get(encodeHintType3).toString()) : 0;
        if (barcodeFormat != BarcodeFormat.AZTEC) {
            throw new IllegalArgumentException("Can only encode AZTEC, but got ".concat(String.valueOf(barcodeFormat)));
        }
        C7553c c7553c = new C7553c(str.getBytes(charsetForName));
        List<C7555e> listSingletonList = Collections.singletonList(C7555e.f41664e);
        int i17 = 0;
        while (true) {
            bArr = c7553c.f41661a;
            int i18 = 4;
            int i19 = 2;
            int i20 = 1;
            if (i17 >= bArr.length) {
                break;
            }
            int i21 = i17 + 1;
            byte b10 = i21 < bArr.length ? bArr[i21] : (byte) 0;
            byte b11 = bArr[i17];
            if (b11 != 13) {
                if (b11 != 44) {
                    if (b11 != 46) {
                        if (b11 == 58 && b10 == 32) {
                            i13 = 5;
                        } else {
                            i13 = 0;
                        }
                    } else if (b10 == 32) {
                        i13 = 3;
                    } else {
                        i13 = 0;
                    }
                } else if (b10 == 32) {
                    i13 = 4;
                } else {
                    i13 = 0;
                }
            } else if (b10 == 10) {
                i13 = 2;
            } else {
                i13 = 0;
            }
            if (i13 > 0) {
                LinkedList linkedList = new LinkedList();
                for (C7555e c7555e : listSingletonList) {
                    C7555e c7555eM15073b = c7555e.m15073b(i17);
                    linkedList.add(c7555eM15073b.m15075d(4, i13));
                    if (c7555e.f41665a != 4) {
                        linkedList.add(c7555eM15073b.m15076e(4, i13));
                    }
                    if (i13 == 3 || i13 == 4) {
                        linkedList.add(c7555eM15073b.m15075d(2, 16 - i13).m15075d(2, 1));
                    }
                    if (c7555e.f41667c > 0) {
                        linkedList.add(c7555e.m15072a(i17).m15072a(i21));
                    }
                }
                listSingletonList = C7553c.m15071a(linkedList);
                i17 = i21;
            } else {
                LinkedList linkedList2 = new LinkedList();
                for (C7555e c7555e2 : listSingletonList) {
                    char c10 = (char) (bArr[i17] & 255);
                    int i22 = c7555e2.f41665a;
                    int[][] iArr = C7553c.f41659d;
                    if (iArr[i22][c10] <= 0) {
                        i20 = 0;
                    }
                    int i23 = 0;
                    C7555e c7555eM15073b2 = null;
                    while (true) {
                        i14 = c7555e2.f41665a;
                        if (i23 > i18) {
                            break;
                        }
                        int i24 = iArr[i23][c10];
                        if (i24 > 0) {
                            if (c7555eM15073b2 == null) {
                                c7555eM15073b2 = c7555e2.m15073b(i17);
                            }
                            if (i20 == 0 || i23 == i14 || i23 == i19) {
                                linkedList2.add(c7555eM15073b2.m15075d(i23, i24));
                            }
                            if (i20 == 0 && C7553c.f41660e[i14][i23] >= 0) {
                                linkedList2.add(c7555eM15073b2.m15076e(i23, i24));
                            }
                        }
                        i23++;
                        i18 = 4;
                        i19 = 2;
                    }
                    if (c7555e2.f41667c > 0 || iArr[i14][c10] == 0) {
                        linkedList2.add(c7555e2.m15072a(i17));
                    }
                    i18 = 4;
                    i19 = 2;
                    i20 = 1;
                }
                listSingletonList = C7553c.m15071a(linkedList2);
                i20 = 1;
            }
            i17 += i20;
        }
        C7555e c7555e3 = (C7555e) Collections.min(listSingletonList, new C7552b());
        c7555e3.getClass();
        LinkedList linkedList3 = new LinkedList();
        for (AbstractC7556f abstractC7556f = c7555e3.m15073b(bArr.length).f41666b; abstractC7556f != null; abstractC7556f = abstractC7556f.f41670a) {
            linkedList3.addFirst(abstractC7556f);
        }
        C7770a c7770a = new C7770a();
        Iterator it = linkedList3.iterator();
        while (it.hasNext()) {
            ((AbstractC7556f) it.next()).mo15070a(c7770a, bArr);
        }
        int i25 = c7770a.f42693b;
        int iM757a = C0166e.m757a(i15, i25, 100, 11);
        int i26 = i25 + iM757a;
        int[] iArr2 = C5212l.f33291j;
        if (i16 != 0) {
            z10 = i16 < 0;
            iAbs = Math.abs(i16);
            if (iAbs > (z10 ? 4 : 32)) {
                throw new IllegalArgumentException(String.format("Illegal value %s for layers", Integer.valueOf(i16)));
            }
            i11 = ((z10 ? 88 : 112) + (iAbs << 4)) * iAbs;
            i10 = iArr2[iAbs];
            int i27 = i11 - (i11 % i10);
            c7770aM11170n0 = C5212l.m11170n0(i10, c7770a);
            int i28 = c7770aM11170n0.f42693b;
            if (iM757a + i28 > i27) {
                throw new IllegalArgumentException("Data to large for user specified layer");
            }
            if (z10 && i28 > (i10 << 6)) {
                throw new IllegalArgumentException("Data to large for user specified layer");
            }
        } else {
            int i29 = 0;
            C7770a c7770aM11170n1 = null;
            int i30 = 3;
            boolean z11 = false;
            int i31 = 0;
            while (true) {
                if (i29 > 32) {
                    throw new IllegalArgumentException("Data too large for an Aztec code");
                }
                if (i29 <= i30) {
                    z11 = true;
                }
                int i32 = z11 ? i29 + 1 : i29;
                int i33 = ((z11 ? 88 : 112) + (i32 << 4)) * i32;
                if (i26 <= i33) {
                    if (c7770aM11170n1 == null || i31 != iArr2[i32]) {
                        i31 = iArr2[i32];
                        c7770aM11170n1 = C5212l.m11170n0(i31, c7770a);
                    }
                    int i34 = i33 - (i33 % i31);
                    if ((!z11 || c7770aM11170n1.f42693b <= (i31 << 6)) && c7770aM11170n1.f42693b + iM757a <= i34) {
                        z10 = z11;
                        i10 = i31;
                        c7770aM11170n0 = c7770aM11170n1;
                        iAbs = i32;
                        i11 = i33;
                        break;
                    }
                }
                i29++;
                z11 = false;
                i30 = 3;
            }
        }
        C7770a c7770aM11144Q2 = C5212l.m11144Q(c7770aM11170n0, i11, i10);
        int i35 = c7770aM11170n0.f42693b / i10;
        C7770a c7770a2 = new C7770a();
        if (z10) {
            c7770a2.m15473c(iAbs - 1, 2);
            c7770a2.m15473c(i35 - 1, 6);
            c7770aM11144Q = C5212l.m11144Q(c7770a2, 28, 4);
        } else {
            c7770a2.m15473c(iAbs - 1, 5);
            c7770a2.m15473c(i35 - 1, 11);
            c7770aM11144Q = C5212l.m11144Q(c7770a2, 40, 4);
        }
        int i36 = (z10 ? 11 : 14) + (iAbs << 2);
        int[] iArr3 = new int[i36];
        if (z10) {
            for (int i37 = 0; i37 < i36; i37++) {
                iArr3[i37] = i37;
            }
            i12 = i36;
        } else {
            int i38 = i36 / 2;
            i12 = (((i38 - 1) / 15) * 2) + i36 + 1;
            int i39 = i12 / 2;
            for (int i40 = 0; i40 < i38; i40++) {
                int i41 = (i40 / 15) + i40;
                iArr3[(i38 - i40) - 1] = (i39 - i41) - 1;
                iArr3[i38 + i40] = i41 + i39 + 1;
            }
        }
        C7771b c7771b = new C7771b(i12, i12);
        int i42 = 0;
        for (int i43 = 0; i43 < iAbs; i43++) {
            int i44 = ((iAbs - i43) << 2) + (z10 ? 9 : 12);
            for (int i45 = 0; i45 < i44; i45++) {
                int i46 = i45 << 1;
                for (int i47 = 0; i47 < 2; i47++) {
                    if (c7770aM11144Q2.m15475e(i42 + i46 + i47)) {
                        int i48 = i43 << 1;
                        c7771b.m15477c(iArr3[i48 + i47], iArr3[i48 + i45]);
                    }
                    if (c7770aM11144Q2.m15475e((i44 << 1) + i42 + i46 + i47)) {
                        int i49 = i43 << 1;
                        c7771b.m15477c(iArr3[i49 + i45], iArr3[((i36 - 1) - i49) - i47]);
                    }
                    if (c7770aM11144Q2.m15475e((i44 << 2) + i42 + i46 + i47)) {
                        int i50 = (i36 - 1) - (i43 << 1);
                        c7771b.m15477c(iArr3[i50 - i47], iArr3[i50 - i45]);
                    }
                    if (c7770aM11144Q2.m15475e((i44 * 6) + i42 + i46 + i47)) {
                        int i51 = i43 << 1;
                        c7771b.m15477c(iArr3[((i36 - 1) - i51) - i45], iArr3[i51 + i47]);
                    }
                }
            }
            i42 += i44 << 3;
        }
        int i52 = i12 / 2;
        if (z10) {
            for (int i53 = 0; i53 < 7; i53++) {
                int i54 = (i52 - 3) + i53;
                if (c7770aM11144Q.m15475e(i53)) {
                    c7771b.m15477c(i54, i52 - 5);
                }
                if (c7770aM11144Q.m15475e(i53 + 7)) {
                    c7771b.m15477c(i52 + 5, i54);
                }
                if (c7770aM11144Q.m15475e(20 - i53)) {
                    c7771b.m15477c(i54, i52 + 5);
                }
                if (c7770aM11144Q.m15475e(27 - i53)) {
                    c7771b.m15477c(i52 - 5, i54);
                }
            }
        } else {
            for (int i55 = 0; i55 < 10; i55++) {
                int i56 = (i55 / 5) + (i52 - 5) + i55;
                if (c7770aM11144Q.m15475e(i55)) {
                    c7771b.m15477c(i56, i52 - 7);
                }
                if (c7770aM11144Q.m15475e(i55 + 10)) {
                    c7771b.m15477c(i52 + 7, i56);
                }
                if (c7770aM11144Q.m15475e(29 - i55)) {
                    c7771b.m15477c(i56, i52 + 7);
                }
                if (c7770aM11144Q.m15475e(39 - i55)) {
                    c7771b.m15477c(i52 - 7, i56);
                }
            }
        }
        if (z10) {
            C5212l.m11138K(c7771b, i52, 5);
        } else {
            C5212l.m11138K(c7771b, i52, 7);
            int i57 = 0;
            int i58 = 0;
            while (i57 < (i36 / 2) - 1) {
                for (int i59 = i52 & 1; i59 < i12; i59 += 2) {
                    int i60 = i52 - i58;
                    c7771b.m15477c(i60, i59);
                    int i61 = i52 + i58;
                    c7771b.m15477c(i61, i59);
                    c7771b.m15477c(i59, i60);
                    c7771b.m15477c(i59, i61);
                }
                i57 += 15;
                i58 += 16;
            }
        }
        int i62 = c7771b.f42694a;
        int iMax = Math.max(200, i62);
        int i63 = c7771b.f42695b;
        int iMax2 = Math.max(200, i63);
        int iMin = Math.min(iMax / i62, iMax2 / i63);
        int i64 = (iMax - (i62 * iMin)) / 2;
        int i65 = (iMax2 - (i63 * iMin)) / 2;
        C7771b c7771b2 = new C7771b(iMax, iMax2);
        int i66 = 0;
        while (i66 < i63) {
            int i67 = 0;
            int i68 = i64;
            while (i67 < i62) {
                if (c7771b.m15476b(i67, i66)) {
                    c7771b2.m15478d(i68, i65, iMin, iMin);
                }
                i67++;
                i68 += iMin;
            }
            i66++;
            i65 += iMin;
        }
        return c7771b2;
    }

    @Override // td.InterfaceC9271s
    public final /* synthetic */ Object zza() {
        return new C8534e0();
    }
}
