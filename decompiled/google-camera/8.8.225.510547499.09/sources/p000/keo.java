package p000;

import android.util.Log;
import com.google.android.gms.common.annotation.HJo.JrxsYuVZZqnFC;
import com.google.android.libraries.camera.exif.ExifInterface;
import java.io.IOException;
import java.io.OutputStream;
import java.nio.ByteOrder;
import java.util.ArrayList;
import java.util.Collections;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class keo extends ket {

    /* JADX INFO: renamed from: a */
    public static final /* synthetic */ int f35772a = 0;

    /* JADX INFO: renamed from: f */
    private static final byte[] f35773f = {69, 120, 105, 102, 0, 0};

    /* JADX INFO: renamed from: g */
    private static final byte[] f35774g = {73, 67, 67, 95, 80, 82, 79, 70, 73, 76, 69, 0};

    /* JADX INFO: renamed from: h */
    private final kef f35775h;

    /* JADX INFO: renamed from: i */
    private final ExifInterface f35776i;

    /* JADX INFO: renamed from: j */
    private short f35777j;

    /* JADX INFO: renamed from: k */
    private short f35778k;

    /* JADX INFO: renamed from: l */
    private int f35779l;

    /* JADX INFO: renamed from: m */
    private boolean f35780m;

    public keo(OutputStream outputStream, ExifInterface exifInterface, kef kefVar) {
        super(outputStream, new ked());
        this.f35777j = (short) 0;
        this.f35778k = (short) 0;
        this.f35779l = 0;
        this.f35780m = true;
        this.f35776i = exifInterface;
        this.f35775h = kefVar;
    }

    /* JADX INFO: renamed from: k */
    private static void m14058k(int i, short s) {
        if (i < 0) {
            throw new IllegalStateException(String.format("Negative section length: section length read was 0x%02X%02X", Integer.valueOf((s >> 8) & 255), Integer.valueOf(s & 255)));
        }
    }

    /* JADX INFO: renamed from: m */
    private static final int m14060m(keq keqVar, int i) {
        int iM14074a = keqVar.m14074a() * 12;
        int iM14047a = i + iM14074a + 6;
        for (ken kenVar : keqVar.m14077d()) {
            if (kenVar != null && kenVar.m14047a() > 4) {
                kenVar.f35771g = iM14047a;
                iM14047a += kenVar.m14047a();
            }
        }
        return iM14047a;
    }

    /* JADX INFO: renamed from: n */
    private static final void m14061n(keq keqVar, ker kerVar) throws IOException {
        ken[] kenVarArrM14077d = keqVar.m14077d();
        kerVar.m14080b((short) kenVarArrM14077d.length);
        for (ken kenVar : kenVarArrM14077d) {
            if (kenVar != null) {
                kerVar.m14080b(kenVar.f35765a);
                kerVar.m14080b(kenVar.f35766b);
                kerVar.m14079a(kenVar.f35768d);
                if (kenVar.m14047a() > 4) {
                    kerVar.m14079a(kenVar.f35771g);
                } else {
                    m14059l(kenVar, kerVar);
                    int iM14047a = 4 - kenVar.m14047a();
                    for (int i = 0; i < iM14047a; i++) {
                        kerVar.write(0);
                    }
                }
            }
        }
        kerVar.m14079a(keqVar.f35786c);
        for (ken kenVar2 : kenVarArrM14077d) {
            if (kenVar2 != null && kenVar2.m14047a() > 4) {
                m14059l(kenVar2, kerVar);
            }
        }
    }

    /* JADX INFO: renamed from: l */
    private static void m14059l(ken kenVar, ker kerVar) throws IOException {
        short s = kenVar.f35766b;
        int i = 0;
        switch (s) {
            case 1:
            case 7:
                int i2 = kenVar.f35768d;
                byte[] bArr = new byte[i2];
                if (s != 7 && s != 1) {
                    throw new IllegalArgumentException("Cannot get BYTE value from ".concat(ken.m14044c(s)));
                }
                Object obj = kenVar.f35770f;
                obj.getClass();
                System.arraycopy(obj, 0, bArr, 0, i2);
                kerVar.write(bArr);
                return;
            case 2:
                Object obj2 = kenVar.f35770f;
                obj2.getClass();
                byte[] bArr2 = (byte[]) obj2;
                int length = bArr2.length;
                if (length != kenVar.f35768d || length <= 0) {
                    kerVar.write(bArr2);
                    kerVar.write(0);
                    return;
                } else {
                    bArr2[length - 1] = 0;
                    kerVar.write(bArr2);
                    return;
                }
            case 3:
                int i3 = kenVar.f35768d;
                while (i < i3) {
                    kerVar.m14080b((short) kenVar.m14048b(i));
                    i++;
                }
                return;
            case 4:
            case 9:
                int i4 = kenVar.f35768d;
                while (i < i4) {
                    kerVar.m14079a((int) kenVar.m14048b(i));
                    i++;
                }
                return;
            case 5:
            case 10:
                int i5 = kenVar.f35768d;
                while (i < i5) {
                    short s2 = kenVar.f35766b;
                    if (s2 != 10 && s2 != 5) {
                        throw new IllegalArgumentException("Cannot get RATIONAL value from ".concat(ken.m14044c(s2)));
                    }
                    Object obj3 = kenVar.f35770f;
                    obj3.getClass();
                    kaz kazVar = ((kaz[]) obj3)[i];
                    kerVar.m14079a((int) kazVar.f35504a);
                    kerVar.m14079a((int) kazVar.f35505b);
                    i++;
                }
                return;
            case 6:
            case 8:
            default:
                return;
        }
    }

    @Override // p000.ket
    /* JADX INFO: renamed from: a */
    protected final int mo14062a(int i) throws kes, IOException {
        kef kefVar;
        int iM14060m;
        switch (i) {
            case 0:
                short sM14081b = m14081b(0);
                this.f35777j = sM14081b;
                if ((sM14081b & (-256)) != -256) {
                    throw new IllegalStateException(String.format("Unexpected section marker: %02X%02X", Integer.valueOf((sM14081b >> 8) & 255), Integer.valueOf(this.f35777j & 255)));
                }
                if (sM14081b == -40 || sM14081b == -39) {
                    m14087h(sM14081b);
                    if (this.f35777j == -40 && (kefVar = this.f35775h) != null) {
                        ArrayList arrayList = new ArrayList();
                        for (ken kenVar : kefVar.m14024c()) {
                            if (kenVar.f35770f == null && !ExifInterface.m4677t(kenVar.f35765a)) {
                                kefVar.m14029h(kenVar.f35765a, kenVar.f35769e);
                                arrayList.add(kenVar);
                            }
                        }
                        keq keqVarM14023b = this.f35775h.m14023b(0);
                        if (keqVarM14023b == null) {
                            keqVarM14023b = new keq(0);
                            this.f35775h.m14025d(keqVarM14023b);
                        }
                        ken kenVarM4685j = this.f35776i.m4685j(ExifInterface.f7788B);
                        if (kenVarM4685j == null) {
                            throw new IOException("No definition for crucial exif tag: " + ExifInterface.f7788B);
                        }
                        keqVarM14023b.m14078e(kenVarM4685j);
                        keq keqVarM14023b2 = this.f35775h.m14023b(2);
                        if (keqVarM14023b2 == null) {
                            keqVarM14023b2 = new keq(2);
                            this.f35775h.m14025d(keqVarM14023b2);
                        }
                        if (this.f35775h.m14023b(4) != null) {
                            ken kenVarM4685j2 = this.f35776i.m4685j(ExifInterface.f7789C);
                            if (kenVarM4685j2 == null) {
                                throw new IOException("No definition for crucial exif tag: " + ExifInterface.f7789C);
                            }
                            keqVarM14023b.m14078e(kenVarM4685j2);
                        }
                        if (this.f35775h.m14023b(3) != null) {
                            ken kenVarM4685j3 = this.f35776i.m4685j(ExifInterface.f7851al);
                            if (kenVarM4685j3 == null) {
                                throw new IOException("No definition for crucial exif tag: " + ExifInterface.f7851al);
                            }
                            keqVarM14023b2.m14078e(kenVarM4685j3);
                        }
                        keq keqVarM14023b3 = this.f35775h.m14023b(1);
                        if (this.f35775h.m14027f()) {
                            if (keqVarM14023b3 == null) {
                                keqVarM14023b3 = new keq(1);
                                this.f35775h.m14025d(keqVarM14023b3);
                            }
                            ken kenVarM4685j4 = this.f35776i.m4685j(ExifInterface.f7790D);
                            if (kenVarM4685j4 == null) {
                                throw new IOException("No definition for crucial exif tag: " + ExifInterface.f7790D);
                            }
                            keqVarM14023b3.m14078e(kenVarM4685j4);
                            ken kenVarM4685j5 = this.f35776i.m4685j(ExifInterface.f7791E);
                            if (kenVarM4685j5 == null) {
                                throw new IOException("No definition for crucial exif tag: " + ExifInterface.f7791E);
                            }
                            byte[] bArr = this.f35775h.f35719b;
                            bArr.getClass();
                            kenVarM4685j5.m14051g(bArr.length);
                            keqVarM14023b3.m14078e(kenVarM4685j5);
                            keqVarM14023b3.m14076c(ExifInterface.m4674n(ExifInterface.f7900i));
                            keqVarM14023b3.m14076c(ExifInterface.m4674n(ExifInterface.f7904m));
                        } else if (this.f35775h.m14028g()) {
                            if (keqVarM14023b3 == null) {
                                keqVarM14023b3 = new keq(1);
                                this.f35775h.m14025d(keqVarM14023b3);
                            }
                            int iM14022a = this.f35775h.m14022a();
                            ken kenVarM4685j6 = this.f35776i.m4685j(ExifInterface.f7900i);
                            if (kenVarM4685j6 == null) {
                                throw new IOException("No definition for crucial exif tag: " + ExifInterface.f7900i);
                            }
                            ken kenVarM4685j7 = this.f35776i.m4685j(ExifInterface.f7904m);
                            if (kenVarM4685j7 == null) {
                                throw new IOException("No definition for crucial exif tag: " + ExifInterface.f7904m);
                            }
                            long[] jArr = new long[iM14022a];
                            for (int i2 = 0; i2 < this.f35775h.m14022a(); i2++) {
                                jArr[i2] = this.f35775h.m14030i(i2).length;
                            }
                            kenVarM4685j7.m14055k(jArr);
                            keqVarM14023b3.m14078e(kenVarM4685j6);
                            keqVarM14023b3.m14078e(kenVarM4685j7);
                            keqVarM14023b3.m14076c(ExifInterface.m4674n(ExifInterface.f7790D));
                            keqVarM14023b3.m14076c(ExifInterface.m4674n(ExifInterface.f7791E));
                        } else if (keqVarM14023b3 != null) {
                            keqVarM14023b3.m14076c(ExifInterface.m4674n(ExifInterface.f7900i));
                            keqVarM14023b3.m14076c(ExifInterface.m4674n(ExifInterface.f7904m));
                            keqVarM14023b3.m14076c(ExifInterface.m4674n(ExifInterface.f7790D));
                            keqVarM14023b3.m14076c(ExifInterface.m4674n(ExifInterface.f7791E));
                        }
                        ArrayList arrayList2 = new ArrayList(this.f35775h.m14024c());
                        if (this.f35775h.m14027f()) {
                            byte[] bArr2 = this.f35775h.f35719b;
                            bArr2.getClass();
                            arrayList2.add(new ken((short) 0, (short) 1, bArr2.length, 0, false));
                        }
                        Collections.sort(arrayList2, amx.f751o);
                        keq keqVarM14023b4 = this.f35775h.m14023b(0);
                        if (keqVarM14023b4 == null) {
                            iM14060m = 8;
                        } else {
                            iM14060m = m14060m(keqVarM14023b4, 8);
                            ken kenVarM14075b = keqVarM14023b4.m14075b(ExifInterface.m4674n(ExifInterface.f7788B));
                            kenVarM14075b.getClass();
                            kenVarM14075b.m14051g(iM14060m);
                            keq keqVarM14023b5 = this.f35775h.m14023b(2);
                            if (keqVarM14023b5 != null) {
                                iM14060m = m14060m(keqVarM14023b5, iM14060m);
                                keq keqVarM14023b6 = this.f35775h.m14023b(3);
                                if (keqVarM14023b6 != null) {
                                    ken kenVarM14075b2 = keqVarM14023b5.m14075b(ExifInterface.m4674n(ExifInterface.f7851al));
                                    kenVarM14075b2.getClass();
                                    kenVarM14075b2.m14051g(iM14060m);
                                    iM14060m = m14060m(keqVarM14023b6, iM14060m);
                                }
                                keq keqVarM14023b7 = this.f35775h.m14023b(4);
                                if (keqVarM14023b7 != null) {
                                    ken kenVarM14075b3 = keqVarM14023b4.m14075b(ExifInterface.m4674n(ExifInterface.f7789C));
                                    kenVarM14075b3.getClass();
                                    kenVarM14075b3.m14051g(iM14060m);
                                    iM14060m = m14060m(keqVarM14023b7, iM14060m);
                                }
                                keq keqVarM14023b8 = this.f35775h.m14023b(1);
                                if (keqVarM14023b8 != null) {
                                    keqVarM14023b4.f35786c = iM14060m;
                                    iM14060m = m14060m(keqVarM14023b8, iM14060m);
                                }
                                if (this.f35775h.m14027f()) {
                                    if (keqVarM14023b8 != null) {
                                        ken kenVarM14075b4 = keqVarM14023b8.m14075b(ExifInterface.m4674n(ExifInterface.f7790D));
                                        kenVarM14075b4.getClass();
                                        kenVarM14075b4.m14051g(iM14060m);
                                    }
                                    byte[] bArr3 = this.f35775h.f35719b;
                                    bArr3.getClass();
                                    iM14060m += bArr3.length;
                                } else if (this.f35775h.m14028g()) {
                                    long[] jArr2 = new long[this.f35775h.m14022a()];
                                    for (int i3 = 0; i3 < this.f35775h.m14022a(); i3++) {
                                        jArr2[i3] = iM14060m;
                                        iM14060m += this.f35775h.m14030i(i3).length;
                                    }
                                    if (keqVarM14023b8 != null) {
                                        ken kenVarM14075b5 = keqVarM14023b8.m14075b(ExifInterface.m4674n(ExifInterface.f7900i));
                                        kenVarM14075b5.getClass();
                                        kenVarM14075b5.m14055k(jArr2);
                                    }
                                }
                            }
                        }
                        for (int i4 = 0; i4 < arrayList2.size() && iM14060m > 65535; i4++) {
                            ken kenVar2 = (ken) arrayList2.get(i4);
                            short s = kenVar2.f35765a;
                            if (s == 0) {
                                kef kefVar2 = this.f35775h;
                                kefVar2.m14026e();
                                kefVar2.f35718a[1] = null;
                                Log.w("CAM_ExifTransFSM", "Removed thumbnail with size " + kenVar2.m14047a() + " as Exif data exceeds max size 65535!");
                                iM14060m -= kenVar2.m14047a();
                            } else if (s != ExifInterface.m4674n(ExifInterface.f7788B) && s != ExifInterface.m4674n(ExifInterface.f7851al) && s != ExifInterface.m4674n(ExifInterface.f7789C) && s != ExifInterface.m4674n(ExifInterface.f7790D) && s != ExifInterface.m4674n(ExifInterface.f7900i) && this.f35775h.m14029h(s, kenVar2.f35769e)) {
                                Log.w("CAM_ExifTransFSM", "Removed tag " + ((int) kenVar2.f35765a) + JrxsYuVZZqnFC.kNAHxJokP + kenVar2.m14047a() + " as Exif data exceeds max size 65535!");
                                iM14060m -= kenVar2.m14047a();
                            }
                        }
                        if (iM14060m > 65535) {
                            throw new IOException("Exif header is too large (>65535), even after pruning non-essential tags!");
                        }
                        m14087h((short) -31);
                        m14087h((short) (iM14060m + 8));
                        m14086g(f35773f);
                        if (kefVar.f35721d == ByteOrder.BIG_ENDIAN) {
                            m14087h((short) 19789);
                        } else {
                            m14087h((short) 18761);
                        }
                        ker kerVar = new ker(this.f35793c);
                        kerVar.f35788a.order(kefVar.f35721d);
                        kerVar.m14080b((short) 42);
                        kerVar.m14079a(8);
                        keq keqVarM14023b9 = this.f35775h.m14023b(0);
                        keqVarM14023b9.getClass();
                        m14061n(keqVarM14023b9, kerVar);
                        keq keqVarM14023b10 = this.f35775h.m14023b(2);
                        keqVarM14023b10.getClass();
                        m14061n(keqVarM14023b10, kerVar);
                        keq keqVarM14023b11 = this.f35775h.m14023b(3);
                        if (keqVarM14023b11 != null) {
                            m14061n(keqVarM14023b11, kerVar);
                        }
                        keq keqVarM14023b12 = this.f35775h.m14023b(4);
                        if (keqVarM14023b12 != null) {
                            m14061n(keqVarM14023b12, kerVar);
                        }
                        keq keqVarM14023b13 = this.f35775h.m14023b(1);
                        if (keqVarM14023b13 != null) {
                            m14061n(keqVarM14023b13, kerVar);
                        }
                        if (this.f35775h.m14027f()) {
                            byte[] bArr4 = this.f35775h.f35719b;
                            bArr4.getClass();
                            kerVar.write(bArr4);
                        } else if (this.f35775h.m14028g()) {
                            for (int i5 = 0; i5 < this.f35775h.m14022a(); i5++) {
                                kerVar.write(this.f35775h.m14030i(i5));
                            }
                        }
                        int size = arrayList.size();
                        for (int i6 = 0; i6 < size; i6++) {
                            kefVar.m14031j((ken) arrayList.get(i6));
                        }
                    }
                    return 0;
                }
                if (kfv.m14175y(sM14081b)) {
                    if (this.f35780m) {
                        char[] cArr = this.f35776i.f7924bz == 2 ? ojs.f46181a : ojt.f46182a;
                        lku.m15670x(true, "ICC profile does not fit in one marker segment!");
                        m14087h((short) -30);
                        int length = cArr.length;
                        m14087h((short) (length + length + 16));
                        m14086g(f35774g);
                        m14087h((short) 257);
                        for (char c : cArr) {
                            m14087h((short) c);
                        }
                    }
                    m14087h(this.f35777j);
                    return 4;
                }
                if (this.f35775h != null && sM14081b == -31) {
                    return 2;
                }
                if (sM14081b == -30) {
                    if (this.f35776i.f7924bz != 0) {
                        return 5;
                    }
                    this.f35780m = false;
                }
                m14087h(sM14081b);
                break;
            case 1:
                short sM14081b2 = m14081b(1);
                this.f35778k = sM14081b2;
                m14087h(sM14081b2);
                int i7 = ((char) this.f35778k) - 2;
                this.f35779l = i7;
                m14058k(i7, this.f35777j);
                m14088i(this.f35779l);
                return 0;
            case 2:
                short sM14081b3 = m14081b(2);
                this.f35778k = sM14081b3;
                int i8 = ((char) sM14081b3) - 2;
                this.f35779l = i8;
                m14058k(i8, this.f35777j);
                if (this.f35779l < 5) {
                    m14087h(this.f35777j);
                    m14087h(this.f35778k);
                    m14088i(this.f35779l);
                    return 0;
                }
            case 3:
                super.m14082c(4, 3);
                super.m14083d();
                ked kedVar = this.f35792b;
                int i9 = kedVar.f35713b;
                if (i9 + 4 > kedVar.f35714c) {
                    throw new IllegalStateException("Byte queue is too short");
                }
                byte[] bArr5 = new byte[4];
                System.arraycopy(kedVar.f35712a, i9, bArr5, 0, 4);
                kedVar.f35713b += 4;
                this.f35779l -= 4;
                for (int i10 = 0; i10 < 4; i10++) {
                    if (bArr5[i10] != f35773f[i10]) {
                        m14087h(this.f35777j);
                        m14087h(this.f35778k);
                        m14086g(bArr5);
                        m14088i(this.f35779l);
                        return 0;
                    }
                }
                m14089j(this.f35779l);
                return 0;
            case 4:
                super.m14083d();
                ked kedVar2 = this.f35792b;
                kedVar2.m14014c(this.f35793c, kedVar2.m14012a());
                this.f35795e = -1;
                return 4;
            default:
                short sM14081b4 = m14081b(5);
                this.f35778k = sM14081b4;
                int i11 = ((char) sM14081b4) - 2;
                this.f35779l = i11;
                m14058k(i11, this.f35777j);
                m14089j(this.f35779l);
                return 0;
        }
    }
}
