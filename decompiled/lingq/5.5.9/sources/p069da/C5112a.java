package p069da;

import ae.C0062b;
import android.support.v4.media.AbstractC0140a;
import android.support.v4.media.C0141b;
import com.google.android.exoplayer2.metadata.Metadata;
import com.google.android.exoplayer2.metadata.id3.ApicFrame;
import com.google.android.exoplayer2.metadata.id3.BinaryFrame;
import com.google.android.exoplayer2.metadata.id3.ChapterFrame;
import com.google.android.exoplayer2.metadata.id3.ChapterTocFrame;
import com.google.android.exoplayer2.metadata.id3.CommentFrame;
import com.google.android.exoplayer2.metadata.id3.GeobFrame;
import com.google.android.exoplayer2.metadata.id3.Id3Frame;
import com.google.android.exoplayer2.metadata.id3.MlltFrame;
import com.google.android.exoplayer2.metadata.id3.PrivFrame;
import com.google.android.exoplayer2.metadata.id3.TextInformationFrame;
import com.google.android.exoplayer2.metadata.id3.UrlLinkFrame;
import com.google.common.collect.ImmutableList;
import com.kochava.tracker.BuildConfig;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Locale;
import p357r6.C8739a;
import p402u0.C9362e;
import p479xa.C10134c0;
import p479xa.C10145n;
import p479xa.C10151t;
import p482xd.C10170b;
import p529z9.C10463c;

/* JADX INFO: renamed from: da.a */
/* JADX INFO: loaded from: classes.dex */
public final class C5112a extends AbstractC0140a {

    /* JADX INFO: renamed from: b */
    public static final C9362e f33077b = new C9362e(21);

    /* JADX INFO: renamed from: a */
    public final a f33078a;

    /* JADX INFO: renamed from: da.a$a */
    public interface a {
        /* JADX INFO: renamed from: f */
        boolean mo10892f(int i10, int i11, int i12, int i13, int i14);
    }

    /* JADX INFO: renamed from: da.a$b */
    public static final class b {

        /* JADX INFO: renamed from: a */
        public final int f33079a;

        /* JADX INFO: renamed from: b */
        public final boolean f33080b;

        /* JADX INFO: renamed from: c */
        public final int f33081c;

        public b(int i10, int i11, boolean z10) {
            this.f33079a = i10;
            this.f33080b = z10;
            this.f33081c = i11;
        }
    }

    public C5112a(a aVar) {
        this.f33078a = aVar;
    }

    /* JADX WARN: Code duplicated, block: B:41:0x008f A[PHI: r3
      0x008f: PHI (r3v19 int) = (r3v7 int), (r3v22 int) binds: [B:39:0x008c, B:31:0x007e] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX INFO: renamed from: A0 */
    public static boolean m10875A0(C10151t c10151t, int i10, int i11, boolean z10) {
        int iM19147v;
        long jM19147v;
        int iM19150y;
        int i12;
        int i13 = c10151t.f51439b;
        while (true) {
            try {
                boolean z11 = true;
                if (c10151t.f51440c - c10151t.f51439b < i11) {
                    c10151t.m19124E(i13);
                    return true;
                }
                if (i10 >= 3) {
                    iM19147v = c10151t.m19129d();
                    jM19147v = c10151t.m19146u();
                    iM19150y = c10151t.m19150y();
                } else {
                    iM19147v = c10151t.m19147v();
                    jM19147v = c10151t.m19147v();
                    iM19150y = 0;
                }
                if (iM19147v == 0 && jM19147v == 0 && iM19150y == 0) {
                    c10151t.m19124E(i13);
                    return true;
                }
                if (i10 == 4 && !z10) {
                    if ((8421504 & jM19147v) != 0) {
                        c10151t.m19124E(i13);
                        return false;
                    }
                    jM19147v = (((jM19147v >> 24) & 255) << 21) | (jM19147v & 255) | (((jM19147v >> 8) & 255) << 7) | (((jM19147v >> 16) & 255) << 14);
                }
                if (i10 == 4) {
                    i12 = (iM19150y & 64) != 0 ? 1 : 0;
                    if ((iM19150y & 1) == 0) {
                        z11 = false;
                    }
                } else if (i10 == 3) {
                    i12 = (iM19150y & 32) != 0 ? 1 : 0;
                    if ((iM19150y & BuildConfig.SDK_TRUNCATE_LENGTH) == 0) {
                        z11 = false;
                    }
                } else {
                    i12 = 0;
                    z11 = false;
                }
                if (z11) {
                    i12 += 4;
                }
                if (jM19147v < i12) {
                    c10151t.m19124E(i13);
                    return false;
                }
                if (c10151t.f51440c - c10151t.f51439b < jM19147v) {
                    c10151t.m19124E(i13);
                    return false;
                }
                c10151t.m19125F((int) jM19147v);
            } catch (Throwable th2) {
                c10151t.m19124E(i13);
                throw th2;
            }
        }
    }

    /* JADX INFO: renamed from: l0 */
    public static ApicFrame m10876l0(int i10, int i11, C10151t c10151t) {
        int iM10889y0;
        String strConcat;
        int iM19145t = c10151t.m19145t();
        Charset charsetM10886v0 = m10886v0(iM19145t);
        int i12 = i10 - 1;
        byte[] bArr = new byte[i12];
        c10151t.m19127b(bArr, 0, i12);
        if (i11 == 2) {
            String str = "image/" + C0062b.m383p2(new String(bArr, 0, 3, C10170b.f51476b));
            if ("image/jpg".equals(str)) {
                str = "image/jpeg";
            }
            strConcat = str;
            iM10889y0 = 2;
        } else {
            iM10889y0 = m10889y0(bArr, 0);
            String strM383p2 = C0062b.m383p2(new String(bArr, 0, iM10889y0, C10170b.f51476b));
            strConcat = strM383p2.indexOf(47) == -1 ? "image/".concat(strM383p2) : strM383p2;
        }
        int i13 = bArr[iM10889y0 + 1] & 255;
        int i14 = iM10889y0 + 2;
        int iM10888x0 = m10888x0(bArr, i14, iM19145t);
        String str2 = new String(bArr, i14, iM10888x0 - i14, charsetM10886v0);
        int iM10885u0 = m10885u0(iM19145t) + iM10888x0;
        return new ApicFrame(strConcat, str2, i13, i12 <= iM10885u0 ? C10134c0.f51359f : Arrays.copyOfRange(bArr, iM10885u0, i12));
    }

    /* JADX INFO: renamed from: m0 */
    public static ChapterFrame m10877m0(C10151t c10151t, int i10, int i11, boolean z10, int i12, a aVar) {
        int i13 = c10151t.f51439b;
        int iM10889y0 = m10889y0(c10151t.f51438a, i13);
        String str = new String(c10151t.f51438a, i13, iM10889y0 - i13, C10170b.f51476b);
        c10151t.m19124E(iM10889y0 + 1);
        int iM19129d = c10151t.m19129d();
        int iM19129d2 = c10151t.m19129d();
        long jM19146u = c10151t.m19146u();
        long j10 = jM19146u == 4294967295L ? -1L : jM19146u;
        long jM19146u2 = c10151t.m19146u();
        long j11 = jM19146u2 == 4294967295L ? -1L : jM19146u2;
        ArrayList arrayList = new ArrayList();
        int i14 = i13 + i10;
        while (c10151t.f51439b < i14) {
            Id3Frame id3FrameM10880p0 = m10880p0(i11, c10151t, z10, i12, aVar);
            if (id3FrameM10880p0 != null) {
                arrayList.add(id3FrameM10880p0);
            }
        }
        return new ChapterFrame(str, iM19129d, iM19129d2, j10, j11, (Id3Frame[]) arrayList.toArray(new Id3Frame[0]));
    }

    /* JADX INFO: renamed from: n0 */
    public static ChapterTocFrame m10878n0(C10151t c10151t, int i10, int i11, boolean z10, int i12, a aVar) {
        int i13 = c10151t.f51439b;
        int iM10889y0 = m10889y0(c10151t.f51438a, i13);
        String str = new String(c10151t.f51438a, i13, iM10889y0 - i13, C10170b.f51476b);
        c10151t.m19124E(iM10889y0 + 1);
        int iM19145t = c10151t.m19145t();
        boolean z11 = (iM19145t & 2) != 0;
        boolean z12 = (iM19145t & 1) != 0;
        int iM19145t2 = c10151t.m19145t();
        String[] strArr = new String[iM19145t2];
        for (int i14 = 0; i14 < iM19145t2; i14++) {
            int i15 = c10151t.f51439b;
            int iM10889y1 = m10889y0(c10151t.f51438a, i15);
            strArr[i14] = new String(c10151t.f51438a, i15, iM10889y1 - i15, C10170b.f51476b);
            c10151t.m19124E(iM10889y1 + 1);
        }
        ArrayList arrayList = new ArrayList();
        int i16 = i13 + i10;
        while (c10151t.f51439b < i16) {
            Id3Frame id3FrameM10880p0 = m10880p0(i11, c10151t, z10, i12, aVar);
            if (id3FrameM10880p0 != null) {
                arrayList.add(id3FrameM10880p0);
            }
        }
        return new ChapterTocFrame(str, z11, z12, strArr, (Id3Frame[]) arrayList.toArray(new Id3Frame[0]));
    }

    /* JADX INFO: renamed from: o0 */
    public static CommentFrame m10879o0(int i10, C10151t c10151t) {
        if (i10 < 4) {
            return null;
        }
        int iM19145t = c10151t.m19145t();
        Charset charsetM10886v0 = m10886v0(iM19145t);
        byte[] bArr = new byte[3];
        c10151t.m19127b(bArr, 0, 3);
        String str = new String(bArr, 0, 3);
        int i11 = i10 - 4;
        byte[] bArr2 = new byte[i11];
        c10151t.m19127b(bArr2, 0, i11);
        int iM10888x0 = m10888x0(bArr2, 0, iM19145t);
        String str2 = new String(bArr2, 0, iM10888x0, charsetM10886v0);
        int iM10885u0 = m10885u0(iM19145t) + iM10888x0;
        return new CommentFrame(str, str2, m10883s0(bArr2, iM10885u0, m10888x0(bArr2, iM10885u0, iM19145t), charsetM10886v0));
    }

    /* JADX WARN: Code duplicated, block: B:107:0x0181  */
    /* JADX WARN: Code duplicated, block: B:146:0x0249  */
    /* JADX WARN: Code duplicated, block: B:153:0x025c A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:154:0x025e  */
    /* JADX WARN: Code duplicated, block: B:159:0x0276 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:160:0x0278 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:164:0x028e A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:165:0x0290  */
    /* JADX WARN: Code duplicated, block: B:170:0x029f A[Catch: all -> 0x01fd, TryCatch #0 {all -> 0x01fd, blocks: (B:94:0x0125, B:172:0x02b0, B:96:0x0153, B:99:0x015a, B:108:0x0184, B:110:0x01b7, B:119:0x01e6, B:121:0x01fa, B:125:0x0204, B:124:0x0200, B:134:0x0224, B:145:0x0243, B:152:0x0257, B:158:0x0266, B:163:0x027e, B:169:0x029a, B:170:0x029f), top: B:179:0x0118 }] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r15v2 */
    /* JADX WARN: Type inference failed for: r15v3, types: [com.google.android.exoplayer2.metadata.id3.Id3Frame, java.lang.String] */
    /* JADX WARN: Type inference failed for: r15v6 */
    /* JADX WARN: Type inference failed for: r5v25 */
    /* JADX WARN: Type inference failed for: r5v26, types: [com.google.android.exoplayer2.metadata.id3.Id3Frame] */
    /* JADX WARN: Type inference failed for: r5v27 */
    /* JADX WARN: Type inference failed for: r5v32 */
    /* JADX WARN: Type inference failed for: r5v33 */
    /* JADX WARN: Type inference failed for: r5v34 */
    /* JADX WARN: Type inference failed for: r5v35 */
    /* JADX WARN: Type inference failed for: r5v36 */
    /* JADX WARN: Type inference failed for: r5v37 */
    /* JADX WARN: Type inference failed for: r5v38 */
    /* JADX WARN: Type inference failed for: r5v39 */
    /* JADX INFO: renamed from: p0 */
    public static Id3Frame m10880p0(int i10, C10151t c10151t, boolean z10, int i11, a aVar) {
        int iM19148w;
        int i12;
        ?? r15;
        boolean z11;
        boolean z12;
        boolean z13;
        boolean z14;
        boolean z15;
        boolean z16;
        boolean z17;
        boolean z18;
        boolean z19;
        MlltFrame mlltFrameM10882r0;
        ChapterTocFrame chapterTocFrameM10878n0;
        ChapterFrame chapterFrameM10877m0;
        Id3Frame privFrame;
        TextInformationFrame textInformationFrame;
        ?? binaryFrame;
        int iM19145t = c10151t.m19145t();
        int iM19145t2 = c10151t.m19145t();
        int iM19145t3 = c10151t.m19145t();
        int iM19145t4 = i10 >= 3 ? c10151t.m19145t() : 0;
        if (i10 == 4) {
            iM19148w = c10151t.m19148w();
            if (!z10) {
                iM19148w = (((iM19148w >> 24) & 255) << 21) | (iM19148w & 255) | (((iM19148w >> 8) & 255) << 7) | (((iM19148w >> 16) & 255) << 14);
            }
        } else {
            iM19148w = i10 == 3 ? c10151t.m19148w() : c10151t.m19147v();
        }
        int i13 = iM19148w;
        int iM19150y = i10 >= 3 ? c10151t.m19150y() : 0;
        if (iM19145t == 0 && iM19145t2 == 0 && iM19145t3 == 0 && iM19145t4 == 0 && i13 == 0 && iM19150y == 0) {
            c10151t.m19124E(c10151t.f51440c);
            return null;
        }
        int i14 = c10151t.f51439b + i13;
        if (i14 > c10151t.f51440c) {
            C10145n.m19099g("Id3Decoder", "Frame size exceeds remaining tag data");
            c10151t.m19124E(c10151t.f51440c);
            return null;
        }
        if (aVar != null) {
            i12 = i14;
            r15 = 0;
            if (!aVar.mo10892f(i10, iM19145t, iM19145t2, iM19145t3, iM19145t4)) {
                c10151t.m19124E(i12);
                return null;
            }
        } else {
            i12 = i14;
            r15 = 0;
        }
        if (i10 != 3) {
            int i15 = iM19150y;
            if (i10 == 4) {
                z15 = (i15 & 64) != 0;
                z16 = (i15 & 8) != 0;
                z17 = (i15 & 4) != 0;
                z18 = (i15 & 2) != 0;
                z19 = (i15 & 1) != 0;
            } else {
                z11 = false;
                z12 = false;
                z13 = false;
                z14 = false;
            }
            if (!z16 || z17) {
                C10145n.m19099g("Id3Decoder", "Skipping unsupported compressed or encrypted frame");
                c10151t.m19124E(i12);
                return r15;
            }
            if (z15) {
                i13--;
                c10151t.m19125F(1);
            }
            if (z19) {
                i13 -= 4;
                c10151t.m19125F(4);
            }
            int iM10890z0 = i13;
            if (z18) {
                iM10890z0 = m10890z0(iM10890z0, c10151t);
            }
            int i16 = iM10890z0;
            try {
                if (iM19145t == 84 && iM19145t2 == 88 && iM19145t3 == 88 && (i10 == 2 || iM19145t4 == 88)) {
                    if (i16 < 1) {
                        binaryFrame = r15;
                    } else {
                        int iM19145t5 = c10151t.m19145t();
                        int i17 = i16 - 1;
                        byte[] bArr = new byte[i17];
                        c10151t.m19127b(bArr, 0, i17);
                        int iM10888x0 = m10888x0(bArr, 0, iM19145t5);
                        privFrame = new TextInformationFrame("TXXX", new String(bArr, 0, iM10888x0, m10886v0(iM19145t5)), m10884t0(bArr, iM19145t5, m10885u0(iM19145t5) + iM10888x0));
                        binaryFrame = privFrame;
                    }
                } else if (iM19145t == 84) {
                    String strM10887w0 = m10887w0(i10, iM19145t, iM19145t2, iM19145t3, iM19145t4);
                    if (i16 < 1) {
                        binaryFrame = r15;
                    } else {
                        int iM19145t6 = c10151t.m19145t();
                        int i18 = i16 - 1;
                        byte[] bArr2 = new byte[i18];
                        c10151t.m19127b(bArr2, 0, i18);
                        textInformationFrame = new TextInformationFrame(strM10887w0, r15, m10884t0(bArr2, iM19145t6, 0));
                    }
                } else {
                    if (iM19145t == 87 && iM19145t2 == 88 && iM19145t3 == 88 && (i10 == 2 || iM19145t4 == 88)) {
                        if (i16 < 1) {
                            binaryFrame = r15;
                        } else {
                            int iM19145t7 = c10151t.m19145t();
                            int i19 = i16 - 1;
                            byte[] bArr3 = new byte[i19];
                            c10151t.m19127b(bArr3, 0, i19);
                            int iM10888x1 = m10888x0(bArr3, 0, iM19145t7);
                            String str = new String(bArr3, 0, iM10888x1, m10886v0(iM19145t7));
                            int iM10885u0 = m10885u0(iM19145t7) + iM10888x1;
                            privFrame = new UrlLinkFrame("WXXX", str, m10883s0(bArr3, iM10885u0, m10889y0(bArr3, iM10885u0), C10170b.f51476b));
                        }
                    } else if (iM19145t == 87) {
                        String strM10887w1 = m10887w0(i10, iM19145t, iM19145t2, iM19145t3, iM19145t4);
                        byte[] bArr4 = new byte[i16];
                        c10151t.m19127b(bArr4, 0, i16);
                        privFrame = new UrlLinkFrame(strM10887w1, r15, new String(bArr4, 0, m10889y0(bArr4, 0), C10170b.f51476b));
                    } else if (iM19145t == 80 && iM19145t2 == 82 && iM19145t3 == 73 && iM19145t4 == 86) {
                        byte[] bArr5 = new byte[i16];
                        c10151t.m19127b(bArr5, 0, i16);
                        int iM10889y0 = m10889y0(bArr5, 0);
                        String str2 = new String(bArr5, 0, iM10889y0, C10170b.f51476b);
                        int i20 = iM10889y0 + 1;
                        privFrame = new PrivFrame(str2, i16 <= i20 ? C10134c0.f51359f : Arrays.copyOfRange(bArr5, i20, i16));
                    } else if (iM19145t == 71 && iM19145t2 == 69 && iM19145t3 == 79 && (iM19145t4 == 66 || i10 == 2)) {
                        binaryFrame = m10881q0(i16, c10151t);
                    } else if (i10 == 2) {
                        if (iM19145t == 80 && iM19145t2 == 73 && iM19145t3 == 67) {
                            binaryFrame = m10876l0(i16, i10, c10151t);
                        } else if (iM19145t != 67 && iM19145t2 == 79 && iM19145t3 == 77 && (iM19145t4 == 77 || i10 == 2)) {
                            binaryFrame = m10879o0(i16, c10151t);
                        } else if (iM19145t != 67 && iM19145t2 == 72 && iM19145t3 == 65 && iM19145t4 == 80) {
                            chapterFrameM10877m0 = m10877m0(c10151t, i16, i10, z10, i11, aVar);
                        } else if (iM19145t != 67 && iM19145t2 == 84 && iM19145t3 == 79 && iM19145t4 == 67) {
                            chapterTocFrameM10878n0 = m10878n0(c10151t, i16, i10, z10, i11, aVar);
                        } else if (iM19145t != 77 && iM19145t2 == 76 && iM19145t3 == 76 && iM19145t4 == 84) {
                            mlltFrameM10882r0 = m10882r0(i16, c10151t);
                        } else {
                            String strM10887w2 = m10887w0(i10, iM19145t, iM19145t2, iM19145t3, iM19145t4);
                            byte[] bArr6 = new byte[i16];
                            c10151t.m19127b(bArr6, 0, i16);
                            binaryFrame = new BinaryFrame(strM10887w2, bArr6);
                        }
                    } else if (iM19145t == 65 && iM19145t2 == 80 && iM19145t3 == 73 && iM19145t4 == 67) {
                        binaryFrame = m10876l0(i16, i10, c10151t);
                    } else if (iM19145t != 67) {
                        if (iM19145t != 67) {
                            if (iM19145t != 67) {
                                if (iM19145t != 77) {
                                    String strM10887w3 = m10887w0(i10, iM19145t, iM19145t2, iM19145t3, iM19145t4);
                                    byte[] bArr7 = new byte[i16];
                                    c10151t.m19127b(bArr7, 0, i16);
                                    binaryFrame = new BinaryFrame(strM10887w3, bArr7);
                                } else {
                                    String strM10887w4 = m10887w0(i10, iM19145t, iM19145t2, iM19145t3, iM19145t4);
                                    byte[] bArr8 = new byte[i16];
                                    c10151t.m19127b(bArr8, 0, i16);
                                    binaryFrame = new BinaryFrame(strM10887w4, bArr8);
                                }
                            } else if (iM19145t != 77) {
                                String strM10887w5 = m10887w0(i10, iM19145t, iM19145t2, iM19145t3, iM19145t4);
                                byte[] bArr9 = new byte[i16];
                                c10151t.m19127b(bArr9, 0, i16);
                                binaryFrame = new BinaryFrame(strM10887w5, bArr9);
                            } else {
                                String strM10887w6 = m10887w0(i10, iM19145t, iM19145t2, iM19145t3, iM19145t4);
                                byte[] bArr10 = new byte[i16];
                                c10151t.m19127b(bArr10, 0, i16);
                                binaryFrame = new BinaryFrame(strM10887w6, bArr10);
                            }
                        } else if (iM19145t != 67) {
                            if (iM19145t != 77) {
                                String strM10887w7 = m10887w0(i10, iM19145t, iM19145t2, iM19145t3, iM19145t4);
                                byte[] bArr11 = new byte[i16];
                                c10151t.m19127b(bArr11, 0, i16);
                                binaryFrame = new BinaryFrame(strM10887w7, bArr11);
                            } else {
                                String strM10887w8 = m10887w0(i10, iM19145t, iM19145t2, iM19145t3, iM19145t4);
                                byte[] bArr12 = new byte[i16];
                                c10151t.m19127b(bArr12, 0, i16);
                                binaryFrame = new BinaryFrame(strM10887w8, bArr12);
                            }
                        } else if (iM19145t != 77) {
                            String strM10887w9 = m10887w0(i10, iM19145t, iM19145t2, iM19145t3, iM19145t4);
                            byte[] bArr13 = new byte[i16];
                            c10151t.m19127b(bArr13, 0, i16);
                            binaryFrame = new BinaryFrame(strM10887w9, bArr13);
                        } else {
                            String strM10887w10 = m10887w0(i10, iM19145t, iM19145t2, iM19145t3, iM19145t4);
                            byte[] bArr14 = new byte[i16];
                            c10151t.m19127b(bArr14, 0, i16);
                            binaryFrame = new BinaryFrame(strM10887w10, bArr14);
                        }
                    } else if (iM19145t != 67) {
                        if (iM19145t != 67) {
                            if (iM19145t != 77) {
                                String strM10887w11 = m10887w0(i10, iM19145t, iM19145t2, iM19145t3, iM19145t4);
                                byte[] bArr15 = new byte[i16];
                                c10151t.m19127b(bArr15, 0, i16);
                                binaryFrame = new BinaryFrame(strM10887w11, bArr15);
                            } else {
                                String strM10887w12 = m10887w0(i10, iM19145t, iM19145t2, iM19145t3, iM19145t4);
                                byte[] bArr16 = new byte[i16];
                                c10151t.m19127b(bArr16, 0, i16);
                                binaryFrame = new BinaryFrame(strM10887w12, bArr16);
                            }
                        } else if (iM19145t != 77) {
                            String strM10887w13 = m10887w0(i10, iM19145t, iM19145t2, iM19145t3, iM19145t4);
                            byte[] bArr17 = new byte[i16];
                            c10151t.m19127b(bArr17, 0, i16);
                            binaryFrame = new BinaryFrame(strM10887w13, bArr17);
                        } else {
                            String strM10887w14 = m10887w0(i10, iM19145t, iM19145t2, iM19145t3, iM19145t4);
                            byte[] bArr18 = new byte[i16];
                            c10151t.m19127b(bArr18, 0, i16);
                            binaryFrame = new BinaryFrame(strM10887w14, bArr18);
                        }
                    } else if (iM19145t != 67) {
                        if (iM19145t != 77) {
                            String strM10887w15 = m10887w0(i10, iM19145t, iM19145t2, iM19145t3, iM19145t4);
                            byte[] bArr19 = new byte[i16];
                            c10151t.m19127b(bArr19, 0, i16);
                            binaryFrame = new BinaryFrame(strM10887w15, bArr19);
                        } else {
                            String strM10887w16 = m10887w0(i10, iM19145t, iM19145t2, iM19145t3, iM19145t4);
                            byte[] bArr110 = new byte[i16];
                            c10151t.m19127b(bArr110, 0, i16);
                            binaryFrame = new BinaryFrame(strM10887w16, bArr110);
                        }
                    } else if (iM19145t != 77) {
                        String strM10887w17 = m10887w0(i10, iM19145t, iM19145t2, iM19145t3, iM19145t4);
                        byte[] bArr111 = new byte[i16];
                        c10151t.m19127b(bArr111, 0, i16);
                        binaryFrame = new BinaryFrame(strM10887w17, bArr111);
                    } else {
                        String strM10887w18 = m10887w0(i10, iM19145t, iM19145t2, iM19145t3, iM19145t4);
                        byte[] bArr112 = new byte[i16];
                        c10151t.m19127b(bArr112, 0, i16);
                        binaryFrame = new BinaryFrame(strM10887w18, bArr112);
                    }
                    binaryFrame = privFrame;
                }
                if (binaryFrame == 0) {
                    binaryFrame = mlltFrameM10882r0;
                    binaryFrame = chapterTocFrameM10878n0;
                    binaryFrame = chapterFrameM10877m0;
                    binaryFrame = textInformationFrame;
                    C10145n.m19099g("Id3Decoder", "Failed to decode frame: id=" + m10887w0(i10, iM19145t, iM19145t2, iM19145t3, iM19145t4) + ", frameSize=" + i16);
                }
                binaryFrame = mlltFrameM10882r0;
                binaryFrame = chapterTocFrameM10878n0;
                binaryFrame = chapterFrameM10877m0;
                binaryFrame = textInformationFrame;
                c10151t.m19124E(i12);
                return binaryFrame;
            } catch (Throwable th2) {
                c10151t.m19124E(i12);
                throw th2;
            }
        }
        int i21 = iM19150y;
        z12 = (i21 & BuildConfig.SDK_TRUNCATE_LENGTH) != 0;
        z13 = (i21 & 64) != 0;
        z11 = (i21 & 32) != 0;
        z14 = z12;
        z18 = false;
        boolean z20 = z12;
        z15 = z11;
        z19 = z14;
        z17 = z13;
        z16 = z20;
        if (z16) {
        }
        C10145n.m19099g("Id3Decoder", "Skipping unsupported compressed or encrypted frame");
        c10151t.m19124E(i12);
        return r15;
    }

    /* JADX INFO: renamed from: q0 */
    public static GeobFrame m10881q0(int i10, C10151t c10151t) {
        int iM19145t = c10151t.m19145t();
        Charset charsetM10886v0 = m10886v0(iM19145t);
        int i11 = i10 - 1;
        byte[] bArr = new byte[i11];
        c10151t.m19127b(bArr, 0, i11);
        int iM10889y0 = m10889y0(bArr, 0);
        String str = new String(bArr, 0, iM10889y0, C10170b.f51476b);
        int i12 = iM10889y0 + 1;
        int iM10888x0 = m10888x0(bArr, i12, iM19145t);
        String strM10883s0 = m10883s0(bArr, i12, iM10888x0, charsetM10886v0);
        int iM10885u0 = m10885u0(iM19145t) + iM10888x0;
        int iM10888x1 = m10888x0(bArr, iM10885u0, iM19145t);
        String strM10883s1 = m10883s0(bArr, iM10885u0, iM10888x1, charsetM10886v0);
        int iM10885u1 = m10885u0(iM19145t) + iM10888x1;
        return new GeobFrame(str, strM10883s0, strM10883s1, i11 <= iM10885u1 ? C10134c0.f51359f : Arrays.copyOfRange(bArr, iM10885u1, i11));
    }

    /* JADX INFO: renamed from: r0 */
    public static MlltFrame m10882r0(int i10, C10151t c10151t) {
        int iM19150y = c10151t.m19150y();
        int iM19147v = c10151t.m19147v();
        int iM19147v2 = c10151t.m19147v();
        int iM19145t = c10151t.m19145t();
        int iM19145t2 = c10151t.m19145t();
        C8739a c8739a = new C8739a();
        c8739a.m16973j(c10151t.f51438a, c10151t.f51440c);
        c8739a.m16974k(c10151t.f51439b * 8);
        int i11 = ((i10 - 10) * 8) / (iM19145t + iM19145t2);
        int[] iArr = new int[i11];
        int[] iArr2 = new int[i11];
        for (int i12 = 0; i12 < i11; i12++) {
            int iM16970g = c8739a.m16970g(iM19145t);
            int iM16970g2 = c8739a.m16970g(iM19145t2);
            iArr[i12] = iM16970g;
            iArr2[i12] = iM16970g2;
        }
        return new MlltFrame(iM19150y, iM19147v, iM19147v2, iArr, iArr2);
    }

    /* JADX INFO: renamed from: s0 */
    public static String m10883s0(byte[] bArr, int i10, int i11, Charset charset) {
        if (i11 > i10 && i11 <= bArr.length) {
            return new String(bArr, i10, i11 - i10, charset);
        }
        return "";
    }

    /* JADX INFO: renamed from: t0 */
    public static ImmutableList<String> m10884t0(byte[] bArr, int i10, int i11) {
        if (i11 >= bArr.length) {
            return ImmutableList.m9064b0("");
        }
        ImmutableList.C3147b c3147b = ImmutableList.f16043b;
        ImmutableList.C3146a c3146a = new ImmutableList.C3146a();
        int iM10888x0 = m10888x0(bArr, i11, i10);
        while (i11 < iM10888x0) {
            c3146a.m9055b(new String(bArr, i11, iM10888x0 - i11, m10886v0(i10)));
            i11 = m10885u0(i10) + iM10888x0;
            iM10888x0 = m10888x0(bArr, i11, i10);
        }
        ImmutableList<String> immutableListM9068e = c3146a.m9068e();
        return immutableListM9068e.isEmpty() ? ImmutableList.m9064b0("") : immutableListM9068e;
    }

    /* JADX INFO: renamed from: u0 */
    public static int m10885u0(int i10) {
        return (i10 == 0 || i10 == 3) ? 1 : 2;
    }

    /* JADX INFO: renamed from: v0 */
    public static Charset m10886v0(int i10) {
        if (i10 == 1) {
            return C10170b.f51480f;
        }
        if (i10 != 2) {
            return i10 != 3 ? C10170b.f51476b : C10170b.f51477c;
        }
        return C10170b.f51478d;
    }

    /* JADX INFO: renamed from: w0 */
    public static String m10887w0(int i10, int i11, int i12, int i13, int i14) {
        return i10 == 2 ? String.format(Locale.US, "%c%c%c", Integer.valueOf(i11), Integer.valueOf(i12), Integer.valueOf(i13)) : String.format(Locale.US, "%c%c%c%c", Integer.valueOf(i11), Integer.valueOf(i12), Integer.valueOf(i13), Integer.valueOf(i14));
    }

    /* JADX INFO: renamed from: x0 */
    public static int m10888x0(byte[] bArr, int i10, int i11) {
        int iM10889y0 = m10889y0(bArr, i10);
        if (i11 != 0 && i11 != 3) {
            while (iM10889y0 < bArr.length - 1) {
                if ((iM10889y0 - i10) % 2 == 0 && bArr[iM10889y0 + 1] == 0) {
                    return iM10889y0;
                }
                iM10889y0 = m10889y0(bArr, iM10889y0 + 1);
            }
            return bArr.length;
        }
        return iM10889y0;
    }

    /* JADX INFO: renamed from: y0 */
    public static int m10889y0(byte[] bArr, int i10) {
        while (i10 < bArr.length) {
            if (bArr[i10] == 0) {
                return i10;
            }
            i10++;
        }
        return bArr.length;
    }

    /* JADX INFO: renamed from: z0 */
    public static int m10890z0(int i10, C10151t c10151t) {
        byte[] bArr = c10151t.f51438a;
        int i11 = c10151t.f51439b;
        int i12 = i11;
        while (true) {
            int i13 = i12 + 1;
            if (i13 >= i11 + i10) {
                return i10;
            }
            if ((bArr[i12] & 255) == 255 && bArr[i13] == 0) {
                System.arraycopy(bArr, i12 + 2, bArr, i13, (i10 - (i12 - i11)) - 2);
                i10--;
            }
            i12 = i13;
        }
    }

    /* JADX WARN: Code duplicated, block: B:41:0x00ce  */
    /* JADX WARN: Code duplicated, block: B:46:0x00e2  */
    /* JADX WARN: Code duplicated, block: B:48:0x00e4  */
    /* JADX WARN: Code duplicated, block: B:50:0x00eb  */
    /* JADX WARN: Code duplicated, block: B:53:0x00f5  */
    /* JADX WARN: Code duplicated, block: B:56:0x0107  */
    /* JADX WARN: Code duplicated, block: B:62:0x011b  */
    /* JADX WARN: Code duplicated, block: B:66:0x0126  */
    /* JADX WARN: Code duplicated, block: B:73:0x0131 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:74:0x011c A[SYNTHETIC] */
    /* JADX INFO: renamed from: k0 */
    public final Metadata m10891k0(byte[] bArr, int i10) {
        boolean z10;
        b bVar;
        int i11;
        int i12;
        int iM10890z0;
        Id3Frame id3FrameM10880p0;
        ArrayList arrayList = new ArrayList();
        C10151t c10151t = new C10151t(bArr, i10);
        boolean z11 = true;
        if (c10151t.f51440c - c10151t.f51439b < 10) {
            C10145n.m19099g("Id3Decoder", "Data too short to be an ID3 tag");
        } else {
            int iM19147v = c10151t.m19147v();
            if (iM19147v == 4801587) {
                int iM19145t = c10151t.m19145t();
                c10151t.m19125F(1);
                int iM19145t2 = c10151t.m19145t();
                int iM19144s = c10151t.m19144s();
                if (iM19145t == 2) {
                    if ((iM19145t2 & 64) != 0) {
                        C10145n.m19099g("Id3Decoder", "Skipped ID3 tag with majorVersion=2 and undefined compression scheme");
                    } else {
                        if (iM19145t < 4 || (iM19145t2 & BuildConfig.SDK_TRUNCATE_LENGTH) == 0) {
                            z10 = false;
                        } else {
                            z10 = true;
                        }
                        bVar = new b(iM19145t, iM19144s, z10);
                    }
                } else {
                    if (iM19145t == 3) {
                        if ((iM19145t2 & 64) != 0) {
                            int iM19129d = c10151t.m19129d();
                            c10151t.m19125F(iM19129d);
                            iM19144s -= iM19129d + 4;
                        }
                    } else if (iM19145t == 4) {
                        if ((iM19145t2 & 64) != 0) {
                            int iM19144s2 = c10151t.m19144s();
                            c10151t.m19125F(iM19144s2 - 4);
                            iM19144s -= iM19144s2;
                        }
                        if ((iM19145t2 & 16) != 0) {
                            iM19144s -= 10;
                        }
                    } else {
                        C0141b.m620p("Skipped ID3 tag with unsupported majorVersion=", iM19145t, "Id3Decoder");
                    }
                    if (iM19145t < 4) {
                        z10 = false;
                    } else {
                        z10 = false;
                    }
                    bVar = new b(iM19145t, iM19144s, z10);
                }
                if (bVar == null) {
                    return null;
                }
                int i13 = c10151t.f51439b;
                i11 = bVar.f33079a;
                i12 = i11 == 2 ? 6 : 10;
                iM10890z0 = bVar.f33081c;
                if (bVar.f33080b) {
                    iM10890z0 = m10890z0(iM10890z0, c10151t);
                }
                c10151t.m19123D(i13 + iM10890z0);
                if (m10875A0(c10151t, i11, i12, false)) {
                    z11 = false;
                } else if (i11 == 4 || !m10875A0(c10151t, 4, i12, true)) {
                    C0141b.m620p("Failed to validate ID3 tag with majorVersion=", i11, "Id3Decoder");
                    return null;
                }
                while (c10151t.f51440c - c10151t.f51439b >= i12) {
                    id3FrameM10880p0 = m10880p0(i11, c10151t, z11, i12, this.f33078a);
                    if (id3FrameM10880p0 != null) {
                        arrayList.add(id3FrameM10880p0);
                    }
                }
                return new Metadata(arrayList);
            }
            C10145n.m19099g("Id3Decoder", "Unexpected first three bytes of ID3 tag header: 0x" + String.format("%06X", Integer.valueOf(iM19147v)));
        }
        bVar = null;
        if (bVar == null) {
            return null;
        }
        int i14 = c10151t.f51439b;
        i11 = bVar.f33079a;
        if (i11 == 2) {
        }
        iM10890z0 = bVar.f33081c;
        if (bVar.f33080b) {
            iM10890z0 = m10890z0(iM10890z0, c10151t);
        }
        c10151t.m19123D(i14 + iM10890z0);
        if (m10875A0(c10151t, i11, i12, false)) {
            if (i11 == 4) {
            }
            C0141b.m620p("Failed to validate ID3 tag with majorVersion=", i11, "Id3Decoder");
            return null;
        }
        z11 = false;
        while (c10151t.f51440c - c10151t.f51439b >= i12) {
            id3FrameM10880p0 = m10880p0(i11, c10151t, z11, i12, this.f33078a);
            if (id3FrameM10880p0 != null) {
                arrayList.add(id3FrameM10880p0);
            }
        }
        return new Metadata(arrayList);
    }

    @Override // android.support.v4.media.AbstractC0140a
    /* JADX INFO: renamed from: p */
    public final Metadata mo211p(C10463c c10463c, ByteBuffer byteBuffer) {
        return m10891k0(byteBuffer.array(), byteBuffer.limit());
    }
}
