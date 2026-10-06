package p000;

import android.util.Log;
import androidx.work.impl.background.systemalarm.vIy.VCYBIzY;
import com.google.android.clockwork.common.wearable.wearmaterial.selectioncontrol.eMjB.VzWFSVj;
import com.google.android.libraries.camera.exif.ExifInterface;
import com.google.common.p019io.ByteStreams;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteOrder;
import java.nio.charset.Charset;
import java.util.Map;
import java.util.TreeMap;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class kem {

    /* JADX INFO: renamed from: h */
    private static final Charset f35739h = Charset.forName("US-ASCII");

    /* JADX INFO: renamed from: i */
    private static final short f35740i = ExifInterface.m4674n(ExifInterface.f7788B);

    /* JADX INFO: renamed from: j */
    private static final short f35741j = ExifInterface.m4674n(ExifInterface.f7789C);

    /* JADX INFO: renamed from: k */
    private static final short f35742k = ExifInterface.m4674n(ExifInterface.f7851al);

    /* JADX INFO: renamed from: l */
    private static final short f35743l = ExifInterface.m4674n(ExifInterface.f7790D);

    /* JADX INFO: renamed from: m */
    private static final short f35744m = ExifInterface.m4674n(ExifInterface.f7791E);

    /* JADX INFO: renamed from: n */
    private static final short f35745n = ExifInterface.m4674n(ExifInterface.f7900i);

    /* JADX INFO: renamed from: o */
    private static final short f35746o = ExifInterface.m4674n(ExifInterface.f7904m);

    /* JADX INFO: renamed from: a */
    public final kee f35747a;

    /* JADX INFO: renamed from: b */
    public int f35748b;

    /* JADX INFO: renamed from: c */
    public ken f35749c;

    /* JADX INFO: renamed from: d */
    public kel f35750d;

    /* JADX INFO: renamed from: e */
    public ken f35751e;

    /* JADX INFO: renamed from: f */
    public ken f35752f;

    /* JADX INFO: renamed from: r */
    private boolean f35756r;

    /* JADX INFO: renamed from: s */
    private boolean f35757s;

    /* JADX INFO: renamed from: t */
    private int f35758t;

    /* JADX INFO: renamed from: u */
    private byte[] f35759u;

    /* JADX INFO: renamed from: v */
    private int f35760v;

    /* JADX INFO: renamed from: w */
    private final ExifInterface f35761w;

    /* JADX INFO: renamed from: p */
    private int f35754p = 0;

    /* JADX INFO: renamed from: q */
    private int f35755q = 0;

    /* JADX INFO: renamed from: g */
    public final TreeMap f35753g = new TreeMap();

    /* JADX WARN: Code duplicated, block: B:31:0x0079  */
    /* JADX WARN: Code duplicated, block: B:33:0x0083  */
    /* JADX WARN: Code duplicated, block: B:34:0x0089  */
    /* JADX WARN: Code duplicated, block: B:36:0x008d  */
    /* JADX WARN: Code duplicated, block: B:39:0x009b  */
    /* JADX WARN: Code duplicated, block: B:41:0x00a6  */
    /* JADX WARN: Code duplicated, block: B:43:0x00b4  */
    /* JADX WARN: Code duplicated, block: B:45:0x00be  */
    /* JADX WARN: Code duplicated, block: B:47:0x00d5  */
    /* JADX WARN: Code duplicated, block: B:49:0x00db  */
    /* JADX WARN: Code duplicated, block: B:51:0x00e1 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:63:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Instruction removed from duplicated block: B:45:0x00be, please report this as an issue */
    public kem(InputStream inputStream, ExifInterface exifInterface) throws IOException, keh {
        boolean z;
        kee keeVar;
        short sM14019d;
        long jM14018c;
        int i;
        this.f35757s = false;
        this.f35761w = exifInterface;
        kee keeVar2 = new kee(inputStream);
        short sM14019d2 = keeVar2.m14019d();
        while (true) {
            if (sM14019d2 != -39 && !kfv.m14175y(sM14019d2)) {
                if (sM14019d2 == -40) {
                    sM14019d2 = keeVar2.m14019d();
                } else {
                    int iM14017b = keeVar2.m14017b();
                    if (sM14019d2 == -31 && iM14017b >= 8) {
                        int iM14016a = keeVar2.m14016a();
                        short sM14019d3 = keeVar2.m14019d();
                        iM14017b -= 6;
                        if (iM14016a == 1165519206 && sM14019d3 == 0) {
                            this.f35758t = iM14017b;
                            z = true;
                        }
                        this.f35757s = z;
                        keeVar = new kee(inputStream);
                        this.f35747a = keeVar;
                        if (this.f35757s) {
                            sM14019d = keeVar.m14019d();
                            if (sM14019d == 18761) {
                                keeVar.m14020e(ByteOrder.LITTLE_ENDIAN);
                            } else {
                                if (sM14019d == 19789) {
                                    throw new keh("Invalid TIFF header");
                                }
                                keeVar.m14020e(ByteOrder.BIG_ENDIAN);
                            }
                            if (keeVar.m14019d() == 42) {
                                throw new keh("Invalid TIFF header");
                            }
                            jM14018c = keeVar.m14018c();
                            if (jM14018c <= 2147483647L) {
                                throw new keh("Invalid offset " + jM14018c);
                            }
                            i = (int) jM14018c;
                            this.f35760v = i;
                            this.f35748b = 0;
                            m14036g(0, jM14018c);
                            if (jM14018c != 8) {
                                byte[] bArr = new byte[i - 8];
                                this.f35759u = bArr;
                                m14040b(bArr);
                                return;
                            }
                            return;
                        }
                        return;
                    }
                    if (iM14017b >= 2) {
                        try {
                            ByteStreams.skipFully(keeVar2, iM14017b - 2);
                            sM14019d2 = keeVar2.m14019d();
                        } catch (IOException e) {
                        }
                    }
                    Log.w("CAM_ExifParser", "Invalid JPEG format.");
                }
            }
            z = false;
            this.f35757s = z;
            keeVar = new kee(inputStream);
            this.f35747a = keeVar;
            if (this.f35757s) {
                sM14019d = keeVar.m14019d();
                if (sM14019d == 18761) {
                    keeVar.m14020e(ByteOrder.LITTLE_ENDIAN);
                } else {
                    if (sM14019d == 19789) {
                        throw new keh("Invalid TIFF header");
                    }
                    keeVar.m14020e(ByteOrder.BIG_ENDIAN);
                }
                if (keeVar.m14019d() == 42) {
                    throw new keh("Invalid TIFF header");
                }
                jM14018c = keeVar.m14018c();
                if (jM14018c <= 2147483647L) {
                    throw new keh("Invalid offset " + jM14018c);
                }
                i = (int) jM14018c;
                this.f35760v = i;
                this.f35748b = 0;
                m14036g(0, jM14018c);
                if (jM14018c != 8) {
                    byte[] bArr2 = new byte[i - 8];
                    this.f35759u = bArr2;
                    m14040b(bArr2);
                    return;
                }
                return;
            }
            return;
        }
    }

    /* JADX INFO: renamed from: f */
    private final void m14035f(ken kenVar) {
        if (kenVar == null || kenVar.f35768d == 0) {
            return;
        }
        short s = kenVar.f35765a;
        int i = kenVar.f35769e;
        if (s == f35740i && m14038i(i, ExifInterface.f7788B)) {
            m14036g(2, kenVar.m14048b(0));
            return;
        }
        if (s == f35741j && m14038i(i, ExifInterface.f7789C)) {
            m14036g(4, kenVar.m14048b(0));
            return;
        }
        if (s == f35742k && m14038i(i, ExifInterface.f7851al)) {
            m14036g(3, kenVar.m14048b(0));
            return;
        }
        if (s == f35743l && m14038i(i, ExifInterface.f7790D)) {
            this.f35753g.put(Integer.valueOf((int) kenVar.m14048b(0)), new kel());
            return;
        }
        if (s == f35744m && m14038i(i, ExifInterface.f7791E)) {
            this.f35752f = kenVar;
            return;
        }
        if (s != f35745n || !m14038i(i, ExifInterface.f7900i)) {
            if (s == f35746o && m14038i(i, ExifInterface.f7904m) && kenVar.m14050e()) {
                this.f35751e = kenVar;
                return;
            }
            return;
        }
        if (!kenVar.m14050e()) {
            this.f35753g.put(Integer.valueOf(kenVar.f35771g), new kej(kenVar, false));
            return;
        }
        for (int i2 = 0; i2 < kenVar.f35768d; i2++) {
            if (kenVar.f35766b == 3) {
                m14037h(i2, kenVar.m14048b(i2));
            } else {
                m14037h(i2, kenVar.m14048b(i2));
            }
        }
    }

    /* JADX INFO: renamed from: g */
    private final void m14036g(int i, long j) {
        this.f35753g.put(Integer.valueOf((int) j), new kek(i));
    }

    /* JADX INFO: renamed from: h */
    private final void m14037h(int i, long j) {
        this.f35753g.put(Integer.valueOf((int) j), new kel(i));
    }

    /* JADX INFO: renamed from: i */
    private final boolean m14038i(int i, int i2) {
        int i3 = this.f35761w.m4683h().get(i2);
        if (i3 == 0) {
            return false;
        }
        return ExifInterface.m4676s(i3, i);
    }

    /* JADX INFO: renamed from: a */
    public final int m14039a() {
        int iIntValue;
        ken kenVar;
        if (!this.f35757s) {
            return 5;
        }
        kee keeVar = this.f35747a;
        int i = keeVar.f35715a;
        int i2 = this.f35754p + 2 + (this.f35755q * 12);
        boolean z = true;
        if (i < i2) {
            short sM14019d = keeVar.m14019d();
            short sM14019d2 = this.f35747a.m14019d();
            long jM14018c = this.f35747a.m14018c();
            if (jM14018c > 2147483647L) {
                throw new keh("Number of component is larger then Integer.MAX_VALUE");
            }
            int i3 = ken.f35762h;
            if (sM14019d2 == 1 || sM14019d2 == 2 || sM14019d2 == 3 || sM14019d2 == 4 || sM14019d2 == 5 || sM14019d2 == 7 || sM14019d2 == 9 || sM14019d2 == 10) {
                int i4 = (int) jM14018c;
                ken kenVar2 = new ken(sM14019d, sM14019d2, i4, this.f35748b, i4 != 0);
                int iM14047a = kenVar2.m14047a();
                if (iM14047a > 4) {
                    long jM14018c2 = this.f35747a.m14018c();
                    if (jM14018c2 > 2147483647L) {
                        throw new keh("offset is larger then Integer.MAX_VALUE");
                    }
                    if (jM14018c2 >= this.f35760v || sM14019d2 != 7) {
                        kenVar2.f35771g = (int) jM14018c2;
                    } else {
                        byte[] bArr = new byte[i4];
                        System.arraycopy(this.f35759u, ((int) jM14018c2) - 8, bArr, 0, i4);
                        kenVar2.m14053i(bArr);
                    }
                } else {
                    boolean z2 = kenVar2.f35767c;
                    kenVar2.f35767c = false;
                    m14043e(kenVar2);
                    kenVar2.f35767c = z2;
                    ByteStreams.skipFully(this.f35747a, 4 - iM14047a);
                    kenVar2.f35771g = this.f35747a.f35715a - 4;
                }
                kenVar = kenVar2;
            } else {
                Log.w("CAM_ExifParser", String.format("Tag %04x: Invalid data type %d", Short.valueOf(sM14019d), Short.valueOf(sM14019d2)));
                ByteStreams.skipFully(this.f35747a, 4L);
                kenVar = null;
            }
            this.f35749c = kenVar;
            if (kenVar == null) {
                return m14039a();
            }
            if (this.f35756r) {
                m14035f(kenVar);
            }
            return 1;
        }
        if (i == i2) {
            if (this.f35748b == 0) {
                long jM14042d = m14042d();
                if (jM14042d != 0) {
                    m14036g(1, jM14042d);
                }
            } else {
                if (this.f35753g.isEmpty()) {
                    iIntValue = 4;
                } else {
                    Map.Entry entryFirstEntry = this.f35753g.firstEntry();
                    entryFirstEntry.getClass();
                    iIntValue = ((Integer) entryFirstEntry.getKey()).intValue() - this.f35747a.f35715a;
                }
                if (iIntValue < 4) {
                    Log.w("CAM_ExifParser", "Invalid size of link to next IFD: " + iIntValue);
                } else {
                    long jM14042d2 = m14042d();
                    if (jM14042d2 != 0) {
                        Log.w("CAM_ExifParser", VCYBIzY.IUhg + jM14042d2);
                    }
                }
            }
        }
        while (!this.f35753g.isEmpty()) {
            Map.Entry entryPollFirstEntry = this.f35753g.pollFirstEntry();
            entryPollFirstEntry.getClass();
            Object value = entryPollFirstEntry.getValue();
            try {
                int iIntValue2 = ((Integer) entryPollFirstEntry.getKey()).intValue();
                kee keeVar2 = this.f35747a;
                ByteStreams.skipFully(keeVar2, ((long) iIntValue2) - ((long) keeVar2.f35715a));
                while (!this.f35753g.isEmpty() && ((Integer) this.f35753g.firstKey()).intValue() < iIntValue2) {
                    this.f35753g.pollFirstEntry();
                }
                if (value instanceof kek) {
                    kek kekVar = (kek) value;
                    this.f35748b = kekVar.f35735a;
                    this.f35755q = this.f35747a.m14017b();
                    int iIntValue3 = ((Integer) entryPollFirstEntry.getKey()).intValue();
                    this.f35754p = iIntValue3;
                    if ((this.f35755q * 12) + iIntValue3 + 2 > this.f35758t) {
                        Log.w("CAM_ExifParser", VzWFSVj.uZhg + this.f35748b);
                        return 5;
                    }
                    switch (this.f35748b) {
                        case 0:
                        case 1:
                        case 2:
                            break;
                        default:
                            z = false;
                            break;
                    }
                    this.f35756r = z;
                    boolean z3 = kekVar.f35736b;
                    return 0;
                }
                if (value instanceof kel) {
                    kel kelVar = (kel) value;
                    this.f35750d = kelVar;
                    return kelVar.f35738b;
                }
                kej kejVar = (kej) value;
                ken kenVar3 = kejVar.f35733a;
                this.f35749c = kenVar3;
                if (kenVar3 != null && kenVar3.f35766b != 7) {
                    m14043e(kenVar3);
                    m14035f(this.f35749c);
                }
                if (kejVar.f35734b) {
                    return 2;
                }
            } catch (IOException e) {
                Log.w("CAM_ExifParser", "Failed to skip to data at: " + String.valueOf(entryPollFirstEntry.getKey()) + " for " + value.getClass().getName() + ", the file may be broken.");
            }
        }
        return 5;
    }

    /* JADX INFO: renamed from: b */
    public final int m14040b(byte[] bArr) {
        return ByteStreams.read(this.f35747a, bArr, 0, bArr.length);
    }

    /* JADX INFO: renamed from: c */
    protected final int m14041c() {
        return this.f35747a.m14016a();
    }

    /* JADX INFO: renamed from: d */
    protected final long m14042d() {
        return ((long) m14041c()) & 4294967295L;
    }

    /* JADX INFO: renamed from: e */
    public final void m14043e(ken kenVar) {
        String str;
        short s = kenVar.f35766b;
        if (s == 2 || s == 7 || s == 1) {
            int i = kenVar.f35768d;
            if (!this.f35753g.isEmpty()) {
                Map.Entry entryFirstEntry = this.f35753g.firstEntry();
                entryFirstEntry.getClass();
                if (((Integer) entryFirstEntry.getKey()).intValue() < this.f35747a.f35715a + i) {
                    Map.Entry entryFirstEntry2 = this.f35753g.firstEntry();
                    entryFirstEntry2.getClass();
                    Object value = entryFirstEntry2.getValue();
                    if (value instanceof kel) {
                        Log.w("CAM_ExifParser", "Thumbnail overlaps value for tag: \n".concat(kenVar.toString()));
                        Map.Entry entryPollFirstEntry = this.f35753g.pollFirstEntry();
                        entryPollFirstEntry.getClass();
                        Log.w("CAM_ExifParser", "Invalid thumbnail offset: ".concat(String.valueOf(String.valueOf(entryPollFirstEntry.getKey()))));
                    } else {
                        if (value instanceof kek) {
                            Log.w("CAM_ExifParser", "Ifd " + ((kek) value).f35735a + " overlaps value for tag: \n" + kenVar.toString());
                        } else if (value instanceof kej) {
                            Log.w("CAM_ExifParser", "Tag value for tag: \n" + ((kej) value).f35733a.toString() + " overlaps value for tag: \n" + kenVar.toString());
                        }
                        Map.Entry entryFirstEntry3 = this.f35753g.firstEntry();
                        entryFirstEntry3.getClass();
                        int iIntValue = ((Integer) entryFirstEntry3.getKey()).intValue() - this.f35747a.f35715a;
                        Log.w("CAM_ExifParser", "Invalid size of tag: \n" + kenVar.toString() + " setting count to: " + iIntValue);
                        kenVar.f35768d = iIntValue;
                    }
                }
            }
        }
        int i2 = 0;
        switch (kenVar.f35766b) {
            case 1:
            case 7:
                byte[] bArr = new byte[kenVar.f35768d];
                m14040b(bArr);
                kenVar.m14053i(bArr);
                break;
            case 2:
                int i3 = kenVar.f35768d;
                Charset charset = f35739h;
                if (i3 > 0) {
                    byte[] bArr2 = new byte[i3];
                    this.f35747a.m14021f(bArr2, i3);
                    str = new String(bArr2, charset);
                } else {
                    str = "";
                }
                kenVar.m14052h(str);
                break;
            case 3:
                int i4 = kenVar.f35768d;
                int[] iArr = new int[i4];
                while (i2 < i4) {
                    iArr[i2] = (char) this.f35747a.m14019d();
                    i2++;
                }
                kenVar.m14054j(iArr);
                break;
            case 4:
                int i5 = kenVar.f35768d;
                long[] jArr = new long[i5];
                while (i2 < i5) {
                    jArr[i2] = m14042d();
                    i2++;
                }
                kenVar.m14055k(jArr);
                break;
            case 5:
                int i6 = kenVar.f35768d;
                kaz[] kazVarArr = new kaz[i6];
                while (i2 < i6) {
                    kazVarArr[i2] = new kaz(m14042d(), m14042d());
                    i2++;
                }
                kenVar.m14056l(kazVarArr);
                break;
            case 9:
                int i7 = kenVar.f35768d;
                int[] iArr2 = new int[i7];
                while (i2 < i7) {
                    iArr2[i2] = m14041c();
                    i2++;
                }
                kenVar.m14054j(iArr2);
                break;
            case 10:
                int i8 = kenVar.f35768d;
                kaz[] kazVarArr2 = new kaz[i8];
                while (i2 < i8) {
                    kazVarArr2[i2] = new kaz(m14041c(), m14041c());
                    i2++;
                }
                kenVar.m14056l(kazVarArr2);
                break;
        }
    }
}
