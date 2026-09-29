package p384s9;

import android.support.v4.media.C0141b;
import android.util.Pair;
import android.util.SparseArray;
import androidx.datastore.preferences.PreferencesProto$Value;
import com.android.installreferrer.api.InstallReferrerClient;
import com.google.android.exoplayer2.C2416m;
import com.google.android.exoplayer2.ParserException;
import com.google.android.exoplayer2.drm.DrmInitData;
import com.google.common.collect.ImmutableList;
import com.kochava.tracker.BuildConfig;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.UUID;
import org.checkerframework.checker.nullness.qual.EnsuresNonNull;
import org.checkerframework.checker.nullness.qual.RequiresNonNull;
import p150h9.C5903b;
import p166i1.C6153k;
import p195j9.C6424a;
import p261m9.C7502c;
import p261m9.C7504e;
import p261m9.C7519t;
import p261m9.C7523x;
import p261m9.InterfaceC7507h;
import p261m9.InterfaceC7508i;
import p261m9.InterfaceC7509j;
import p261m9.InterfaceC7520u;
import p261m9.InterfaceC7522w;
import p357r6.C8739a;
import p479xa.C10129a;
import p479xa.C10134c0;
import p479xa.C10145n;
import p479xa.C10147p;
import p479xa.C10148q;
import p479xa.C10151t;
import p505ya.C10319a;
import p505ya.C10320b;
import p505ya.C10321c;
import p505ya.C10323e;

/* JADX INFO: renamed from: s9.d */
/* JADX INFO: loaded from: classes.dex */
public final class C8982d implements InterfaceC7507h {

    /* JADX INFO: renamed from: c0 */
    public static final byte[] f47044c0 = {49, 10, 48, 48, 58, 48, 48, 58, 48, 48, 44, 48, 48, 48, 32, 45, 45, 62, 32, 48, 48, 58, 48, 48, 58, 48, 48, 44, 48, 48, 48, 10};

    /* JADX INFO: renamed from: d0 */
    public static final byte[] f47045d0 = C10134c0.m19018C("Format: Start, End, ReadOrder, Layer, Style, Name, MarginL, MarginR, MarginV, Effect, Text");

    /* JADX INFO: renamed from: e0 */
    public static final byte[] f47046e0 = {68, 105, 97, 108, 111, 103, 117, 101, 58, 32, 48, 58, 48, 48, 58, 48, 48, 58, 48, 48, 44, 48, 58, 48, 48, 58, 48, 48, 58, 48, 48, 44};

    /* JADX INFO: renamed from: f0 */
    public static final byte[] f47047f0 = {87, 69, 66, 86, 84, 84, 10, 10, 48, 48, 58, 48, 48, 58, 48, 48, 46, 48, 48, 48, 32, 45, 45, 62, 32, 48, 48, 58, 48, 48, 58, 48, 48, 46, 48, 48, 48, 10};

    /* JADX INFO: renamed from: g0 */
    public static final UUID f47048g0 = new UUID(72057594037932032L, -9223371306706625679L);

    /* JADX INFO: renamed from: h0 */
    public static final Map<String, Integer> f47049h0;

    /* JADX INFO: renamed from: A */
    public long f47050A;

    /* JADX INFO: renamed from: B */
    public long f47051B;

    /* JADX INFO: renamed from: C */
    public C6153k f47052C;

    /* JADX INFO: renamed from: D */
    public C6153k f47053D;

    /* JADX INFO: renamed from: E */
    public boolean f47054E;

    /* JADX INFO: renamed from: F */
    public boolean f47055F;

    /* JADX INFO: renamed from: G */
    public int f47056G;

    /* JADX INFO: renamed from: H */
    public long f47057H;

    /* JADX INFO: renamed from: I */
    public long f47058I;

    /* JADX INFO: renamed from: J */
    public int f47059J;

    /* JADX INFO: renamed from: K */
    public int f47060K;

    /* JADX INFO: renamed from: L */
    public int[] f47061L;

    /* JADX INFO: renamed from: M */
    public int f47062M;

    /* JADX INFO: renamed from: N */
    public int f47063N;

    /* JADX INFO: renamed from: O */
    public int f47064O;

    /* JADX INFO: renamed from: P */
    public int f47065P;

    /* JADX INFO: renamed from: Q */
    public boolean f47066Q;

    /* JADX INFO: renamed from: R */
    public long f47067R;

    /* JADX INFO: renamed from: S */
    public int f47068S;

    /* JADX INFO: renamed from: T */
    public int f47069T;

    /* JADX INFO: renamed from: U */
    public int f47070U;

    /* JADX INFO: renamed from: V */
    public boolean f47071V;

    /* JADX INFO: renamed from: W */
    public boolean f47072W;

    /* JADX INFO: renamed from: X */
    public boolean f47073X;

    /* JADX INFO: renamed from: Y */
    public int f47074Y;

    /* JADX INFO: renamed from: Z */
    public byte f47075Z;

    /* JADX INFO: renamed from: a */
    public final InterfaceC8981c f47076a;

    /* JADX INFO: renamed from: a0 */
    public boolean f47077a0;

    /* JADX INFO: renamed from: b */
    public final C8984f f47078b;

    /* JADX INFO: renamed from: b0 */
    public InterfaceC7509j f47079b0;

    /* JADX INFO: renamed from: c */
    public final SparseArray<b> f47080c;

    /* JADX INFO: renamed from: d */
    public final boolean f47081d;

    /* JADX INFO: renamed from: e */
    public final C10151t f47082e;

    /* JADX INFO: renamed from: f */
    public final C10151t f47083f;

    /* JADX INFO: renamed from: g */
    public final C10151t f47084g;

    /* JADX INFO: renamed from: h */
    public final C10151t f47085h;

    /* JADX INFO: renamed from: i */
    public final C10151t f47086i;

    /* JADX INFO: renamed from: j */
    public final C10151t f47087j;

    /* JADX INFO: renamed from: k */
    public final C10151t f47088k;

    /* JADX INFO: renamed from: l */
    public final C10151t f47089l;

    /* JADX INFO: renamed from: m */
    public final C10151t f47090m;

    /* JADX INFO: renamed from: n */
    public final C10151t f47091n;

    /* JADX INFO: renamed from: o */
    public ByteBuffer f47092o;

    /* JADX INFO: renamed from: p */
    public long f47093p;

    /* JADX INFO: renamed from: q */
    public long f47094q;

    /* JADX INFO: renamed from: r */
    public long f47095r;

    /* JADX INFO: renamed from: s */
    public long f47096s;

    /* JADX INFO: renamed from: t */
    public long f47097t;

    /* JADX INFO: renamed from: u */
    public b f47098u;

    /* JADX INFO: renamed from: v */
    public boolean f47099v;

    /* JADX INFO: renamed from: w */
    public int f47100w;

    /* JADX INFO: renamed from: x */
    public long f47101x;

    /* JADX INFO: renamed from: y */
    public boolean f47102y;

    /* JADX INFO: renamed from: z */
    public long f47103z;

    /* JADX INFO: renamed from: s9.d$a */
    public final class a implements InterfaceC8980b {
        public a() {
        }

        /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
        /* JADX WARN: Code duplicated, block: B:217:0x03a8 A[PHI: r6 r25 r26
          0x03a8: PHI (r6v48 java.lang.Object) = 
          (r6v5 java.lang.Object)
          (r6v6 java.lang.Object)
          (r6v8 java.lang.Object)
          (r6v10 java.lang.Object)
          (r6v12 java.lang.Object)
          (r6v14 java.lang.Object)
          (r6v18 java.lang.Object)
          (r6v49 java.lang.Object)
         binds: [B:214:0x03a2, B:210:0x0397, B:206:0x038c, B:202:0x037e, B:198:0x0370, B:194:0x0362, B:180:0x032c, B:82:0x01d9] A[DONT_GENERATE, DONT_INLINE]
          0x03a8: PHI (r25v6 java.lang.Object) = 
          (r25v0 java.lang.Object)
          (r25v0 java.lang.Object)
          (r25v0 java.lang.Object)
          (r25v0 java.lang.Object)
          (r25v0 java.lang.Object)
          (r25v0 java.lang.Object)
          (r25v0 java.lang.Object)
          (r25v7 java.lang.Object)
         binds: [B:214:0x03a2, B:210:0x0397, B:206:0x038c, B:202:0x037e, B:198:0x0370, B:194:0x0362, B:180:0x032c, B:82:0x01d9] A[DONT_GENERATE, DONT_INLINE]
          0x03a8: PHI (r26v4 java.lang.Object) = 
          (r26v0 java.lang.Object)
          (r26v0 java.lang.Object)
          (r26v0 java.lang.Object)
          (r26v0 java.lang.Object)
          (r26v0 java.lang.Object)
          (r26v0 java.lang.Object)
          (r26v0 java.lang.Object)
          (r26v5 java.lang.Object)
         binds: [B:214:0x03a2, B:210:0x0397, B:206:0x038c, B:202:0x037e, B:198:0x0370, B:194:0x0362, B:180:0x032c, B:82:0x01d9] A[DONT_GENERATE, DONT_INLINE]] */
        /* JADX WARN: Code duplicated, block: B:357:0x0588  */
        /* JADX WARN: Code duplicated, block: B:491:0x08ed  */
        /* JADX WARN: Code duplicated, block: B:493:0x08f5  */
        /* JADX WARN: Code duplicated, block: B:496:0x0914  */
        /* JADX WARN: Code duplicated, block: B:511:0x0947  */
        /* JADX WARN: Code duplicated, block: B:516:0x0960  */
        /* JADX WARN: Code duplicated, block: B:517:0x0962  */
        /* JADX WARN: Code duplicated, block: B:520:0x096f  */
        /* JADX WARN: Code duplicated, block: B:521:0x097b  */
        /* JADX WARN: Code duplicated, block: B:523:0x0981  */
        /* JADX WARN: Code duplicated, block: B:525:0x0985  */
        /* JADX WARN: Code duplicated, block: B:527:0x098a  */
        /* JADX WARN: Code duplicated, block: B:530:0x0992  */
        /* JADX WARN: Code duplicated, block: B:532:0x0997  */
        /* JADX WARN: Code duplicated, block: B:535:0x099c  */
        /* JADX WARN: Code duplicated, block: B:538:0x09aa  */
        /* JADX WARN: Code duplicated, block: B:541:0x09b0  */
        /* JADX WARN: Code duplicated, block: B:543:0x09b8  */
        /* JADX WARN: Code duplicated, block: B:563:0x0a6f  */
        /* JADX WARN: Code duplicated, block: B:565:0x0a7c  */
        /* JADX WARN: Code duplicated, block: B:568:0x0a81  */
        /* JADX WARN: Code duplicated, block: B:570:0x0a89  */
        /* JADX WARN: Code duplicated, block: B:571:0x0a96  */
        /* JADX WARN: Code duplicated, block: B:574:0x0a9b  */
        /* JADX WARN: Code duplicated, block: B:593:0x0aec  */
        /* JADX WARN: Code duplicated, block: B:595:0x0b05  */
        /* JADX WARN: Code duplicated, block: B:597:0x0b0d  */
        /* JADX WARN: Code duplicated, block: B:613:0x0b43  */
        /* JADX WARN: Code duplicated, block: B:82:0x01d9 A[PHI: r25 r26
          0x01d9: PHI (r25v7 java.lang.Object) = 
          (r25v0 java.lang.Object)
          (r25v0 java.lang.Object)
          (r25v2 java.lang.Object)
          (r25v0 java.lang.Object)
          (r25v0 java.lang.Object)
          (r25v0 java.lang.Object)
          (r25v0 java.lang.Object)
          (r25v0 java.lang.Object)
          (r25v0 java.lang.Object)
          (r25v0 java.lang.Object)
          (r25v0 java.lang.Object)
          (r25v0 java.lang.Object)
          (r25v0 java.lang.Object)
          (r25v0 java.lang.Object)
          (r25v0 java.lang.Object)
          (r25v0 java.lang.Object)
          (r25v0 java.lang.Object)
          (r25v0 java.lang.Object)
          (r25v0 java.lang.Object)
          (r25v0 java.lang.Object)
          (r25v0 java.lang.Object)
          (r25v0 java.lang.Object)
          (r25v0 java.lang.Object)
          (r25v0 java.lang.Object)
          (r25v0 java.lang.Object)
          (r25v0 java.lang.Object)
          (r25v0 java.lang.Object)
         binds: [B:81:0x01d6, B:190:0x034f, B:185:0x033c, B:176:0x031d, B:172:0x0312, B:168:0x0307, B:164:0x02fc, B:160:0x02ef, B:156:0x02e2, B:152:0x02d2, B:148:0x02c4, B:144:0x02b8, B:140:0x02ac, B:136:0x029e, B:132:0x0292, B:128:0x0284, B:124:0x0276, B:120:0x0268, B:116:0x0257, B:112:0x0248, B:108:0x0239, B:104:0x022a, B:100:0x021b, B:96:0x020c, B:92:0x01ff, B:88:0x01f2, B:84:0x01e1] A[DONT_GENERATE, DONT_INLINE]
          0x01d9: PHI (r26v5 java.lang.Object) = 
          (r26v0 java.lang.Object)
          (r26v1 java.lang.Object)
          (r26v0 java.lang.Object)
          (r26v0 java.lang.Object)
          (r26v0 java.lang.Object)
          (r26v0 java.lang.Object)
          (r26v0 java.lang.Object)
          (r26v0 java.lang.Object)
          (r26v0 java.lang.Object)
          (r26v0 java.lang.Object)
          (r26v0 java.lang.Object)
          (r26v0 java.lang.Object)
          (r26v0 java.lang.Object)
          (r26v0 java.lang.Object)
          (r26v0 java.lang.Object)
          (r26v0 java.lang.Object)
          (r26v0 java.lang.Object)
          (r26v0 java.lang.Object)
          (r26v0 java.lang.Object)
          (r26v0 java.lang.Object)
          (r26v0 java.lang.Object)
          (r26v0 java.lang.Object)
          (r26v0 java.lang.Object)
          (r26v0 java.lang.Object)
          (r26v0 java.lang.Object)
          (r26v0 java.lang.Object)
          (r26v0 java.lang.Object)
         binds: [B:81:0x01d6, B:190:0x034f, B:185:0x033c, B:176:0x031d, B:172:0x0312, B:168:0x0307, B:164:0x02fc, B:160:0x02ef, B:156:0x02e2, B:152:0x02d2, B:148:0x02c4, B:144:0x02b8, B:140:0x02ac, B:136:0x029e, B:132:0x0292, B:128:0x0284, B:124:0x0276, B:120:0x0268, B:116:0x0257, B:112:0x0248, B:108:0x0239, B:104:0x022a, B:100:0x021b, B:96:0x020c, B:92:0x01ff, B:88:0x01f2, B:84:0x01e1] A[DONT_GENERATE, DONT_INLINE]] */
        /* JADX WARN: Instruction removed from duplicated block: B:493:0x08f5, please report this as an issue */
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r0v129 */
        /* JADX WARN: Type inference failed for: r0v130, types: [java.lang.Exception] */
        /* JADX WARN: Type inference failed for: r2v39 */
        /* JADX WARN: Type inference failed for: r2v41 */
        /* JADX WARN: Type inference failed for: r2v51 */
        /* JADX WARN: Type inference failed for: r2v52, types: [java.lang.Exception] */
        /* JADX WARN: Type inference failed for: r2v53, types: [int] */
        /* JADX WARN: Type inference failed for: r2v54 */
        /* JADX WARN: Type inference failed for: r2v69 */
        /* JADX WARN: Type inference failed for: r2v72 */
        /* JADX WARN: Type inference failed for: r2v73 */
        /* JADX WARN: Type inference failed for: r3v13 */
        /* JADX WARN: Type inference failed for: r6v41 */
        /* JADX INFO: renamed from: a */
        public final void m17226a(int i10) throws ParserException {
            Object obj;
            byte b10;
            Object obj2;
            boolean z10;
            b bVar;
            C8982d c8982d;
            byte b11;
            int i11;
            int i12;
            List<byte[]> listSingletonList;
            boolean z11;
            int iM19054u;
            ArrayList arrayList;
            String str;
            int i13;
            String str2;
            int i14;
            List<byte[]> list;
            ?? r10;
            Pair pair;
            List<byte[]> list2;
            List<byte[]> listM9064b0;
            String str3;
            List<byte[]> list3;
            String str4;
            String str5;
            String str6;
            String str7;
            List<byte[]> list4;
            int i15;
            String str8;
            int i16;
            C2416m.a aVar;
            int i17;
            int i18;
            float f3;
            C10320b c10320b;
            String str9;
            int iIntValue;
            int i19;
            Map<String, Integer> map;
            byte[] bArr;
            int i20;
            int i21;
            int i22;
            String str10;
            C10321c c10321cM19320a;
            InterfaceC7520u bVar2;
            int i23;
            int i24;
            C8982d c8982d2 = C8982d.this;
            C10129a.m18993e(c8982d2.f47079b0);
            SparseArray<b> sparseArray = c8982d2.f47080c;
            if (i10 == 160) {
                if (c8982d2.f47056G != 2) {
                    return;
                }
                b bVar3 = sparseArray.get(c8982d2.f47062M);
                bVar3.f47128X.getClass();
                if (c8982d2.f47067R > 0 && "A_OPUS".equals(bVar3.f47131b)) {
                    byte[] bArrArray = ByteBuffer.allocate(8).order(ByteOrder.LITTLE_ENDIAN).putLong(c8982d2.f47067R).array();
                    C10151t c10151t = c8982d2.f47091n;
                    c10151t.getClass();
                    c10151t.m19122C(bArrArray, bArrArray.length);
                }
                int i25 = 0;
                for (int i26 = 0; i26 < c8982d2.f47060K; i26++) {
                    i25 += c8982d2.f47061L[i26];
                }
                int i27 = 0;
                while (i27 < c8982d2.f47060K) {
                    long j10 = c8982d2.f47057H + ((long) ((bVar3.f47134e * i27) / 1000));
                    int i28 = c8982d2.f47064O;
                    if (i27 == 0 && !c8982d2.f47066Q) {
                        i28 |= 1;
                    }
                    int i29 = c8982d2.f47061L[i27];
                    int i30 = i25 - i29;
                    c8982d2.m17220c(bVar3, j10, i28, i29, i30);
                    i27++;
                    i25 = i30;
                }
                c8982d2.f47056G = 0;
                return;
            }
            if (i10 != 174) {
                if (i10 == 19899) {
                    int i31 = c8982d2.f47100w;
                    if (i31 != -1) {
                        long j11 = c8982d2.f47101x;
                        if (j11 != -1) {
                            if (i31 == 475249515) {
                                c8982d2.f47103z = j11;
                                return;
                            }
                            return;
                        }
                    }
                    throw ParserException.m6770a("Mandatory element SeekID or SeekPosition not found", null);
                }
                if (i10 == 25152) {
                    c8982d2.m17219b(i10);
                    b bVar4 = c8982d2.f47098u;
                    if (bVar4.f47137h) {
                        InterfaceC7522w.a aVar2 = bVar4.f47139j;
                        if (aVar2 == null) {
                            throw ParserException.m6770a("Encrypted Track found but ContentEncKeyID was not found", null);
                        }
                        bVar4.f47141l = new DrmInitData(null, true, new DrmInitData.SchemeData(C5903b.f35258a, null, "video/webm", aVar2.f41525b));
                        return;
                    }
                    return;
                }
                if (i10 == 28032) {
                    c8982d2.m17219b(i10);
                    b bVar5 = c8982d2.f47098u;
                    if (bVar5.f47137h && bVar5.f47138i != null) {
                        throw ParserException.m6770a("Combining encryption and compression is not supported", null);
                    }
                    return;
                }
                if (i10 == 357149030) {
                    if (c8982d2.f47095r == -9223372036854775807L) {
                        c8982d2.f47095r = 1000000L;
                    }
                    long j12 = c8982d2.f47096s;
                    if (j12 != -9223372036854775807L) {
                        c8982d2.f47097t = c8982d2.m17223k(j12);
                        return;
                    }
                    return;
                }
                if (i10 == 374648427) {
                    if (sparseArray.size() == 0) {
                        throw ParserException.m6770a("No valid tracks were found", null);
                    }
                    c8982d2.f47079b0.mo7365i();
                    return;
                }
                if (i10 != 475249515) {
                    return;
                }
                if (!c8982d2.f47099v) {
                    InterfaceC7509j interfaceC7509j = c8982d2.f47079b0;
                    C6153k c6153k = c8982d2.f47052C;
                    C6153k c6153k2 = c8982d2.f47053D;
                    if (c8982d2.f47094q == -1 || c8982d2.f47097t == -9223372036854775807L || c6153k == null || (i23 = c6153k.f35977a) == 0 || c6153k2 == null || c6153k2.f35977a != i23) {
                        bVar2 = new InterfaceC7520u.b(c8982d2.f47097t);
                    } else {
                        int[] iArrCopyOf = new int[i23];
                        long[] jArrCopyOf = new long[i23];
                        long[] jArrCopyOf2 = new long[i23];
                        long[] jArrCopyOf3 = new long[i23];
                        for (int i32 = 0; i32 < i23; i32++) {
                            jArrCopyOf3[i32] = c6153k.m12660b(i32);
                            jArrCopyOf[i32] = c6153k2.m12660b(i32) + c8982d2.f47094q;
                        }
                        int i33 = 0;
                        while (true) {
                            i24 = i23 - 1;
                            if (i33 >= i24) {
                                break;
                            }
                            int i34 = i33 + 1;
                            iArrCopyOf[i33] = (int) (jArrCopyOf[i34] - jArrCopyOf[i33]);
                            jArrCopyOf2[i33] = jArrCopyOf3[i34] - jArrCopyOf3[i33];
                            i33 = i34;
                        }
                        iArrCopyOf[i24] = (int) ((c8982d2.f47094q + c8982d2.f47093p) - jArrCopyOf[i24]);
                        long j13 = c8982d2.f47097t - jArrCopyOf3[i24];
                        jArrCopyOf2[i24] = j13;
                        if (j13 <= 0) {
                            C10145n.m19099g("MatroskaExtractor", "Discarding last cue point with unexpected duration: " + j13);
                            iArrCopyOf = Arrays.copyOf(iArrCopyOf, i24);
                            jArrCopyOf = Arrays.copyOf(jArrCopyOf, i24);
                            jArrCopyOf2 = Arrays.copyOf(jArrCopyOf2, i24);
                            jArrCopyOf3 = Arrays.copyOf(jArrCopyOf3, i24);
                        }
                        bVar2 = new C7502c(iArrCopyOf, jArrCopyOf, jArrCopyOf2, jArrCopyOf3);
                    }
                    interfaceC7509j.mo7364c(bVar2);
                    c8982d2.f47099v = true;
                }
                c8982d2.f47052C = null;
                c8982d2.f47053D = null;
                return;
            }
            b bVar6 = c8982d2.f47098u;
            C10129a.m18993e(bVar6);
            String str11 = bVar6.f47131b;
            if (str11 == null) {
                throw ParserException.m6770a("CodecId is missing in TrackEntry element", null);
            }
            Object obj3 = "V_MS/VFW/FOURCC";
            Object obj4 = "A_MPEG/L3";
            switch (str11.hashCode()) {
                case -2095576542:
                    obj = "V_MPEG4/ISO/SP";
                    if (str11.equals("V_MPEG4/ISO/AP")) {
                        b10 = 0;
                    } else {
                        b10 = -1;
                    }
                    break;
                case -2095575984:
                    obj = "V_MPEG4/ISO/SP";
                    if (str11.equals(obj)) {
                        b10 = 1;
                    } else {
                        b10 = -1;
                    }
                    break;
                case -1985379776:
                    obj = "V_MPEG4/ISO/SP";
                    if (str11.equals("A_MS/ACM")) {
                        b10 = 2;
                    } else {
                        b10 = -1;
                    }
                    break;
                case -1784763192:
                    obj = "V_MPEG4/ISO/SP";
                    if (str11.equals("A_TRUEHD")) {
                        b10 = 3;
                    } else {
                        b10 = -1;
                    }
                    break;
                case -1730367663:
                    obj = "V_MPEG4/ISO/SP";
                    if (str11.equals("A_VORBIS")) {
                        b10 = 4;
                    } else {
                        b10 = -1;
                    }
                    break;
                case -1482641358:
                    obj = "V_MPEG4/ISO/SP";
                    if (str11.equals("A_MPEG/L2")) {
                        b10 = 5;
                    } else {
                        b10 = -1;
                    }
                    break;
                case -1482641357:
                    obj2 = obj4;
                    if (str11.equals(obj2)) {
                        b10 = 6;
                        obj4 = obj2;
                        obj = "V_MPEG4/ISO/SP";
                    } else {
                        obj4 = obj2;
                        obj = "V_MPEG4/ISO/SP";
                        b10 = -1;
                    }
                    break;
                case -1373388978:
                    if (str11.equals(obj3)) {
                        b10 = 7;
                        obj3 = obj3;
                        obj2 = obj4;
                        obj4 = obj2;
                        obj = "V_MPEG4/ISO/SP";
                    } else {
                        obj3 = obj3;
                        obj = "V_MPEG4/ISO/SP";
                        b10 = -1;
                    }
                    break;
                case -933872740:
                    obj = "V_MPEG4/ISO/SP";
                    if (str11.equals("S_DVBSUB")) {
                        b10 = 8;
                    } else {
                        b10 = -1;
                    }
                    break;
                case -538363189:
                    if (str11.equals("V_MPEG4/ISO/ASP")) {
                        b10 = 9;
                        obj2 = obj4;
                        obj4 = obj2;
                        obj = "V_MPEG4/ISO/SP";
                    }
                    obj = "V_MPEG4/ISO/SP";
                    b10 = -1;
                    break;
                case -538363109:
                    if (str11.equals("V_MPEG4/ISO/AVC")) {
                        b10 = 10;
                        obj2 = obj4;
                        obj4 = obj2;
                        obj = "V_MPEG4/ISO/SP";
                    }
                    obj = "V_MPEG4/ISO/SP";
                    b10 = -1;
                    break;
                case -425012669:
                    if (str11.equals("S_VOBSUB")) {
                        b10 = 11;
                        obj2 = obj4;
                        obj4 = obj2;
                        obj = "V_MPEG4/ISO/SP";
                    }
                    obj = "V_MPEG4/ISO/SP";
                    b10 = -1;
                    break;
                case -356037306:
                    if (str11.equals("A_DTS/LOSSLESS")) {
                        b10 = 12;
                        obj2 = obj4;
                        obj4 = obj2;
                        obj = "V_MPEG4/ISO/SP";
                    }
                    obj = "V_MPEG4/ISO/SP";
                    b10 = -1;
                    break;
                case 62923557:
                    if (str11.equals("A_AAC")) {
                        b10 = 13;
                        obj2 = obj4;
                        obj4 = obj2;
                        obj = "V_MPEG4/ISO/SP";
                    }
                    obj = "V_MPEG4/ISO/SP";
                    b10 = -1;
                    break;
                case 62923603:
                    if (str11.equals("A_AC3")) {
                        b10 = 14;
                        obj2 = obj4;
                        obj4 = obj2;
                        obj = "V_MPEG4/ISO/SP";
                    }
                    obj = "V_MPEG4/ISO/SP";
                    b10 = -1;
                    break;
                case 62927045:
                    if (str11.equals("A_DTS")) {
                        obj = "V_MPEG4/ISO/SP";
                        b10 = 15;
                    } else {
                        obj = "V_MPEG4/ISO/SP";
                        b10 = -1;
                    }
                    break;
                case 82318131:
                    if (str11.equals("V_AV1")) {
                        b10 = 16;
                        obj2 = obj4;
                        obj4 = obj2;
                        obj = "V_MPEG4/ISO/SP";
                    }
                    obj = "V_MPEG4/ISO/SP";
                    b10 = -1;
                    break;
                case 82338133:
                    if (str11.equals("V_VP8")) {
                        b10 = 17;
                        obj2 = obj4;
                        obj4 = obj2;
                        obj = "V_MPEG4/ISO/SP";
                    }
                    obj = "V_MPEG4/ISO/SP";
                    b10 = -1;
                    break;
                case 82338134:
                    if (str11.equals("V_VP9")) {
                        b10 = 18;
                        obj2 = obj4;
                        obj4 = obj2;
                        obj = "V_MPEG4/ISO/SP";
                    }
                    obj = "V_MPEG4/ISO/SP";
                    b10 = -1;
                    break;
                case 99146302:
                    if (str11.equals("S_HDMV/PGS")) {
                        b10 = 19;
                        obj2 = obj4;
                        obj4 = obj2;
                        obj = "V_MPEG4/ISO/SP";
                    }
                    obj = "V_MPEG4/ISO/SP";
                    b10 = -1;
                    break;
                case 444813526:
                    if (str11.equals("V_THEORA")) {
                        b10 = 20;
                        obj2 = obj4;
                        obj4 = obj2;
                        obj = "V_MPEG4/ISO/SP";
                    }
                    obj = "V_MPEG4/ISO/SP";
                    b10 = -1;
                    break;
                case 542569478:
                    if (str11.equals("A_DTS/EXPRESS")) {
                        b10 = 21;
                        obj2 = obj4;
                        obj4 = obj2;
                        obj = "V_MPEG4/ISO/SP";
                    }
                    obj = "V_MPEG4/ISO/SP";
                    b10 = -1;
                    break;
                case 635596514:
                    if (str11.equals("A_PCM/FLOAT/IEEE")) {
                        b10 = 22;
                        obj2 = obj4;
                        obj4 = obj2;
                        obj = "V_MPEG4/ISO/SP";
                    }
                    obj = "V_MPEG4/ISO/SP";
                    b10 = -1;
                    break;
                case 725948237:
                    if (str11.equals("A_PCM/INT/BIG")) {
                        b10 = 23;
                        obj2 = obj4;
                        obj4 = obj2;
                        obj = "V_MPEG4/ISO/SP";
                    }
                    obj = "V_MPEG4/ISO/SP";
                    b10 = -1;
                    break;
                case 725957860:
                    if (str11.equals("A_PCM/INT/LIT")) {
                        obj = "V_MPEG4/ISO/SP";
                        b10 = 24;
                    } else {
                        obj = "V_MPEG4/ISO/SP";
                        b10 = -1;
                    }
                    break;
                case 738597099:
                    if (str11.equals("S_TEXT/ASS")) {
                        obj = "V_MPEG4/ISO/SP";
                        b10 = 25;
                    } else {
                        obj = "V_MPEG4/ISO/SP";
                        b10 = -1;
                    }
                    break;
                case 855502857:
                    if (str11.equals("V_MPEGH/ISO/HEVC")) {
                        b10 = 26;
                        obj2 = obj4;
                        obj4 = obj2;
                        obj = "V_MPEG4/ISO/SP";
                    }
                    obj = "V_MPEG4/ISO/SP";
                    b10 = -1;
                    break;
                case 1045209816:
                    if (str11.equals("S_TEXT/WEBVTT")) {
                        b10 = 27;
                        obj2 = obj4;
                        obj4 = obj2;
                        obj = "V_MPEG4/ISO/SP";
                    }
                    obj = "V_MPEG4/ISO/SP";
                    b10 = -1;
                    break;
                case 1422270023:
                    if (str11.equals("S_TEXT/UTF8")) {
                        b10 = 28;
                        obj2 = obj4;
                        obj4 = obj2;
                        obj = "V_MPEG4/ISO/SP";
                    }
                    obj = "V_MPEG4/ISO/SP";
                    b10 = -1;
                    break;
                case 1809237540:
                    if (str11.equals("V_MPEG2")) {
                        b10 = 29;
                        obj2 = obj4;
                        obj4 = obj2;
                        obj = "V_MPEG4/ISO/SP";
                    }
                    obj = "V_MPEG4/ISO/SP";
                    b10 = -1;
                    break;
                case 1950749482:
                    if (str11.equals("A_EAC3")) {
                        b10 = 30;
                        obj2 = obj4;
                        obj4 = obj2;
                        obj = "V_MPEG4/ISO/SP";
                    }
                    obj = "V_MPEG4/ISO/SP";
                    b10 = -1;
                    break;
                case 1950789798:
                    if (str11.equals("A_FLAC")) {
                        b10 = 31;
                        obj2 = obj4;
                        obj4 = obj2;
                        obj = "V_MPEG4/ISO/SP";
                    }
                    obj = "V_MPEG4/ISO/SP";
                    b10 = -1;
                    break;
                case 1951062397:
                    if (str11.equals("A_OPUS")) {
                        obj2 = obj4;
                        b10 = 32;
                        obj4 = obj2;
                        obj = "V_MPEG4/ISO/SP";
                    }
                    obj = "V_MPEG4/ISO/SP";
                    b10 = -1;
                    break;
                default:
                    obj = "V_MPEG4/ISO/SP";
                    b10 = -1;
                    break;
            }
            switch (b10) {
                case InstallReferrerClient.InstallReferrerResponse.f10530OK /* 0 */:
                case 1:
                case 2:
                case 3:
                case 4:
                case 5:
                case PreferencesProto$Value.STRING_SET_FIELD_NUMBER /* 6 */:
                case PreferencesProto$Value.DOUBLE_FIELD_NUMBER /* 7 */:
                case 8:
                case 9:
                case 10:
                case 11:
                case 12:
                case 13:
                case 14:
                case 15:
                case 16:
                case 17:
                case 18:
                case 19:
                case 20:
                case 21:
                case 22:
                case 23:
                case 24:
                case 25:
                case 26:
                case 27:
                case 28:
                case 29:
                case 30:
                case 31:
                case 32:
                    z10 = true;
                    break;
                default:
                    z10 = false;
                    break;
            }
            if (z10) {
                InterfaceC7509j interfaceC7509j2 = c8982d2.f47079b0;
                int i35 = bVar6.f47132c;
                String str12 = bVar6.f47131b;
                str12.getClass();
                b bVar7 = bVar6;
                switch (str12.hashCode()) {
                    case -2095576542:
                        if (str12.equals("V_MPEG4/ISO/AP")) {
                            b11 = 0;
                        } else {
                            b11 = -1;
                        }
                        break;
                    case -2095575984:
                        if (str12.equals(obj)) {
                            b11 = 1;
                        } else {
                            b11 = -1;
                        }
                        break;
                    case -1985379776:
                        if (str12.equals("A_MS/ACM")) {
                            b11 = 2;
                        } else {
                            b11 = -1;
                        }
                        break;
                    case -1784763192:
                        if (str12.equals("A_TRUEHD")) {
                            b11 = 3;
                        } else {
                            b11 = -1;
                        }
                        break;
                    case -1730367663:
                        if (str12.equals("A_VORBIS")) {
                            b11 = 4;
                        } else {
                            b11 = -1;
                        }
                        break;
                    case -1482641358:
                        if (str12.equals("A_MPEG/L2")) {
                            b11 = 5;
                        } else {
                            b11 = -1;
                        }
                        break;
                    case -1482641357:
                        if (str12.equals(obj4)) {
                            b11 = 6;
                        } else {
                            b11 = -1;
                        }
                        break;
                    case -1373388978:
                        if (str12.equals(obj3)) {
                            b11 = 7;
                        } else {
                            b11 = -1;
                        }
                        break;
                    case -933872740:
                        if (str12.equals("S_DVBSUB")) {
                            b11 = 8;
                        } else {
                            b11 = -1;
                        }
                        break;
                    case -538363189:
                        if (str12.equals("V_MPEG4/ISO/ASP")) {
                            b11 = 9;
                        } else {
                            b11 = -1;
                        }
                        break;
                    case -538363109:
                        if (str12.equals("V_MPEG4/ISO/AVC")) {
                            b11 = 10;
                        } else {
                            b11 = -1;
                        }
                        break;
                    case -425012669:
                        if (str12.equals("S_VOBSUB")) {
                            b11 = 11;
                        } else {
                            b11 = -1;
                        }
                        break;
                    case -356037306:
                        if (str12.equals("A_DTS/LOSSLESS")) {
                            b11 = 12;
                        } else {
                            b11 = -1;
                        }
                        break;
                    case 62923557:
                        if (str12.equals("A_AAC")) {
                            b11 = 13;
                        } else {
                            b11 = -1;
                        }
                        break;
                    case 62923603:
                        if (str12.equals("A_AC3")) {
                            b11 = 14;
                        } else {
                            b11 = -1;
                        }
                        break;
                    case 62927045:
                        if (str12.equals("A_DTS")) {
                            b11 = 15;
                        } else {
                            b11 = -1;
                        }
                        break;
                    case 82318131:
                        if (str12.equals("V_AV1")) {
                            b11 = 16;
                        } else {
                            b11 = -1;
                        }
                        break;
                    case 82338133:
                        if (str12.equals("V_VP8")) {
                            b11 = 17;
                        } else {
                            b11 = -1;
                        }
                        break;
                    case 82338134:
                        if (str12.equals("V_VP9")) {
                            b11 = 18;
                        } else {
                            b11 = -1;
                        }
                        break;
                    case 99146302:
                        if (str12.equals("S_HDMV/PGS")) {
                            b11 = 19;
                        } else {
                            b11 = -1;
                        }
                        break;
                    case 444813526:
                        if (str12.equals("V_THEORA")) {
                            b11 = 20;
                        } else {
                            b11 = -1;
                        }
                        break;
                    case 542569478:
                        if (str12.equals("A_DTS/EXPRESS")) {
                            b11 = 21;
                        } else {
                            b11 = -1;
                        }
                        break;
                    case 635596514:
                        if (str12.equals("A_PCM/FLOAT/IEEE")) {
                            b11 = 22;
                        } else {
                            b11 = -1;
                        }
                        break;
                    case 725948237:
                        if (str12.equals("A_PCM/INT/BIG")) {
                            b11 = 23;
                        } else {
                            b11 = -1;
                        }
                        break;
                    case 725957860:
                        if (str12.equals("A_PCM/INT/LIT")) {
                            b11 = 24;
                        } else {
                            b11 = -1;
                        }
                        break;
                    case 738597099:
                        if (str12.equals("S_TEXT/ASS")) {
                            b11 = 25;
                        } else {
                            b11 = -1;
                        }
                        break;
                    case 855502857:
                        if (str12.equals("V_MPEGH/ISO/HEVC")) {
                            b11 = 26;
                        } else {
                            b11 = -1;
                        }
                        break;
                    case 1045209816:
                        if (str12.equals("S_TEXT/WEBVTT")) {
                            b11 = 27;
                        } else {
                            b11 = -1;
                        }
                        break;
                    case 1422270023:
                        if (str12.equals("S_TEXT/UTF8")) {
                            b11 = 28;
                        } else {
                            b11 = -1;
                        }
                        break;
                    case 1809237540:
                        if (str12.equals("V_MPEG2")) {
                            b11 = 29;
                        } else {
                            b11 = -1;
                        }
                        break;
                    case 1950749482:
                        if (str12.equals("A_EAC3")) {
                            b11 = 30;
                        } else {
                            b11 = -1;
                        }
                        break;
                    case 1950789798:
                        if (str12.equals("A_FLAC")) {
                            b11 = 31;
                        } else {
                            b11 = -1;
                        }
                        break;
                    case 1951062397:
                        if (str12.equals("A_OPUS")) {
                            b11 = 32;
                        } else {
                            b11 = -1;
                        }
                        break;
                    default:
                        b11 = -1;
                        break;
                }
                String str13 = "video/x-unknown";
                switch (b11) {
                    case InstallReferrerClient.InstallReferrerResponse.f10530OK /* 0 */:
                    case 1:
                    case 9:
                        bVar7 = bVar7;
                        i11 = 1;
                        i12 = 3;
                        byte[] bArr2 = bVar7.f47140k;
                        listSingletonList = bArr2 == null ? null : Collections.singletonList(bArr2);
                        str13 = "video/mp4v-es";
                        str5 = null;
                        str8 = str5;
                        list = listSingletonList;
                        str2 = str13;
                        i14 = -1;
                        str7 = str8;
                        list4 = list;
                        i15 = i14;
                        str3 = str2;
                        iM19054u = -1;
                        if (bVar7.f47118N != null && (c10321cM19320a = C10321c.m19320a(new C10151t(bVar7.f47118N))) != null) {
                            str7 = c10321cM19320a.f51901a;
                            str3 = "video/dolby-vision";
                        }
                        int i36 = (bVar7.f47126V ? 1 : 0) | 0;
                        if (bVar7.f47125U) {
                            i16 = 2;
                        } else {
                            i16 = 0;
                        }
                        int i37 = i36 | i16;
                        aVar = new C2416m.a();
                        if (C10147p.m19109i(str3)) {
                            aVar.f12514x = bVar7.f47119O;
                            aVar.f12515y = bVar7.f47121Q;
                            aVar.f12516z = iM19054u;
                        } else if (C10147p.m19111k(str3)) {
                            if (bVar7.f47146q == 0) {
                                i21 = bVar7.f47144o;
                                i17 = -1;
                                if (i21 == -1) {
                                    i21 = bVar7.f47142m;
                                }
                                bVar7.f47144o = i21;
                                i22 = bVar7.f47145p;
                                if (i22 == -1) {
                                    i22 = bVar7.f47143n;
                                }
                                bVar7.f47145p = i22;
                            } else {
                                i17 = -1;
                            }
                            i18 = bVar7.f47144o;
                            if (i18 != i17 || (i20 = bVar7.f47145p) == i17) {
                                f3 = -1.0f;
                            } else {
                                f3 = (bVar7.f47143n * i18) / (bVar7.f47142m * i20);
                            }
                            if (bVar7.f47153x) {
                                if (bVar7.f47108D != -1.0f || bVar7.f47109E == -1.0f || bVar7.f47110F == -1.0f || bVar7.f47111G == -1.0f || bVar7.f47112H == -1.0f || bVar7.f47113I == -1.0f || bVar7.f47114J == -1.0f || bVar7.f47115K == -1.0f || bVar7.f47116L == -1.0f || bVar7.f47117M == -1.0f) {
                                    bArr = null;
                                } else {
                                    bArr = new byte[25];
                                    ByteBuffer byteBufferOrder = ByteBuffer.wrap(bArr).order(ByteOrder.LITTLE_ENDIAN);
                                    byteBufferOrder.put((byte) 0);
                                    byteBufferOrder.putShort((short) ((bVar7.f47108D * 50000.0f) + 0.5f));
                                    byteBufferOrder.putShort((short) ((bVar7.f47109E * 50000.0f) + 0.5f));
                                    byteBufferOrder.putShort((short) ((bVar7.f47110F * 50000.0f) + 0.5f));
                                    byteBufferOrder.putShort((short) ((bVar7.f47111G * 50000.0f) + 0.5f));
                                    byteBufferOrder.putShort((short) ((bVar7.f47112H * 50000.0f) + 0.5f));
                                    byteBufferOrder.putShort((short) ((bVar7.f47113I * 50000.0f) + 0.5f));
                                    byteBufferOrder.putShort((short) ((bVar7.f47114J * 50000.0f) + 0.5f));
                                    byteBufferOrder.putShort((short) ((bVar7.f47115K * 50000.0f) + 0.5f));
                                    byteBufferOrder.putShort((short) (bVar7.f47116L + 0.5f));
                                    byteBufferOrder.putShort((short) (bVar7.f47117M + 0.5f));
                                    byteBufferOrder.putShort((short) bVar7.f47106B);
                                    byteBufferOrder.putShort((short) bVar7.f47107C);
                                }
                                c10320b = new C10320b(bVar7.f47154y, bVar7.f47105A, bVar7.f47155z, bArr);
                            } else {
                                c10320b = null;
                            }
                            str9 = bVar7.f47130a;
                            if (str9 != null) {
                                map = C8982d.f47049h0;
                                if (map.containsKey(str9)) {
                                    iIntValue = map.get(bVar7.f47130a).intValue();
                                } else {
                                    iIntValue = i17;
                                }
                            } else {
                                iIntValue = i17;
                            }
                            if (bVar7.f47147r == 0 || Float.compare(bVar7.f47148s, 0.0f) != 0 || Float.compare(bVar7.f47149t, 0.0f) != 0) {
                                i19 = iIntValue;
                            } else if (Float.compare(bVar7.f47150u, 0.0f) == 0) {
                                i19 = 0;
                            } else if (Float.compare(bVar7.f47149t, 90.0f) == 0) {
                                i19 = 90;
                            } else if (Float.compare(bVar7.f47149t, -180.0f) == 0 || Float.compare(bVar7.f47149t, 180.0f) == 0) {
                                i19 = 180;
                            } else if (Float.compare(bVar7.f47149t, -90.0f) == 0) {
                                i19 = 270;
                            } else {
                                i19 = iIntValue;
                            }
                            aVar.f12506p = bVar7.f47142m;
                            aVar.f12507q = bVar7.f47143n;
                            aVar.f12510t = f3;
                            aVar.f12509s = i19;
                            aVar.f12511u = bVar7.f47151v;
                            aVar.f12512v = bVar7.f47152w;
                            aVar.f12513w = c10320b;
                            i11 = 2;
                        } else {
                            if ("application/x-subrip".equals(str3) && !"text/x-ssa".equals(str3) && !"text/vtt".equals(str3) && !"application/vobsub".equals(str3) && !"application/pgs".equals(str3) && !"application/dvbsubs".equals(str3)) {
                                throw ParserException.m6770a("Unexpected MIME type.", null);
                            }
                            i11 = i12;
                        }
                        str10 = bVar7.f47130a;
                        if (str10 != null && !C8982d.f47049h0.containsKey(str10)) {
                            aVar.f12492b = bVar7.f47130a;
                        }
                        aVar.m7129b(i35);
                        aVar.f12501k = str3;
                        aVar.f12502l = i15;
                        aVar.f12493c = bVar7.f47127W;
                        aVar.f12494d = i37;
                        aVar.f12503m = list4;
                        aVar.f12498h = str7;
                        aVar.f12504n = bVar7.f47141l;
                        C2416m c2416mM7128a = aVar.m7128a();
                        InterfaceC7522w interfaceC7522wMo7366q = interfaceC7509j2.mo7366q(bVar7.f47132c, i11);
                        bVar7.f47128X = interfaceC7522wMo7366q;
                        interfaceC7522wMo7366q.mo7388f(c2416mM7128a);
                        sparseArray.put(bVar7.f47132c, bVar7);
                        c8982d = c8982d2;
                        bVar = null;
                        break;
                    case 2:
                        bVar7 = bVar7;
                        i12 = 3;
                        C10151t c10151t2 = new C10151t(bVar7.m17227a(bVar7.f47131b));
                        try {
                            int iM19137l = c10151t2.m19137l();
                            i11 = 1;
                            if (iM19137l != 1) {
                                if (iM19137l == 65534) {
                                    c10151t2.m19124E(24);
                                    long jM19138m = c10151t2.m19138m();
                                    UUID uuid = C8982d.f47048g0;
                                    if (jM19138m != uuid.getMostSignificantBits() || c10151t2.m19138m() != uuid.getLeastSignificantBits()) {
                                    }
                                    if (z11) {
                                        iM19054u = C10134c0.m19054u(bVar7.f47120P);
                                        if (iM19054u == 0) {
                                            C10145n.m19099g("MatroskaExtractor", "Unsupported PCM bit depth: " + bVar7.f47120P + ". Setting mimeType to audio/x-unknown");
                                        }
                                        str3 = "audio/raw";
                                        list3 = null;
                                        str6 = null;
                                        str7 = str6;
                                        list4 = list3;
                                        i15 = -1;
                                        if (bVar7.f47118N != null) {
                                            str7 = c10321cM19320a.f51901a;
                                            str3 = "video/dolby-vision";
                                        }
                                        int i38 = (bVar7.f47126V ? 1 : 0) | 0;
                                        if (bVar7.f47125U) {
                                            i16 = 2;
                                        } else {
                                            i16 = 0;
                                        }
                                        int i39 = i38 | i16;
                                        aVar = new C2416m.a();
                                        if (C10147p.m19109i(str3)) {
                                            aVar.f12514x = bVar7.f47119O;
                                            aVar.f12515y = bVar7.f47121Q;
                                            aVar.f12516z = iM19054u;
                                        } else if (C10147p.m19111k(str3)) {
                                            if (bVar7.f47146q == 0) {
                                                i21 = bVar7.f47144o;
                                                i17 = -1;
                                                if (i21 == -1) {
                                                    i21 = bVar7.f47142m;
                                                }
                                                bVar7.f47144o = i21;
                                                i22 = bVar7.f47145p;
                                                if (i22 == -1) {
                                                    i22 = bVar7.f47143n;
                                                }
                                                bVar7.f47145p = i22;
                                            } else {
                                                i17 = -1;
                                            }
                                            i18 = bVar7.f47144o;
                                            if (i18 != i17) {
                                                f3 = -1.0f;
                                            } else {
                                                f3 = -1.0f;
                                            }
                                            if (bVar7.f47153x) {
                                                if (bVar7.f47108D != -1.0f) {
                                                    bArr = null;
                                                } else {
                                                    bArr = null;
                                                }
                                                c10320b = new C10320b(bVar7.f47154y, bVar7.f47105A, bVar7.f47155z, bArr);
                                            } else {
                                                c10320b = null;
                                            }
                                            str9 = bVar7.f47130a;
                                            if (str9 != null) {
                                                map = C8982d.f47049h0;
                                                if (map.containsKey(str9)) {
                                                    iIntValue = map.get(bVar7.f47130a).intValue();
                                                } else {
                                                    iIntValue = i17;
                                                }
                                            } else {
                                                iIntValue = i17;
                                            }
                                            if (bVar7.f47147r == 0) {
                                                i19 = iIntValue;
                                            } else {
                                                i19 = iIntValue;
                                            }
                                            aVar.f12506p = bVar7.f47142m;
                                            aVar.f12507q = bVar7.f47143n;
                                            aVar.f12510t = f3;
                                            aVar.f12509s = i19;
                                            aVar.f12511u = bVar7.f47151v;
                                            aVar.f12512v = bVar7.f47152w;
                                            aVar.f12513w = c10320b;
                                            i11 = 2;
                                        } else {
                                            if ("application/x-subrip".equals(str3)) {
                                            }
                                            i11 = i12;
                                        }
                                        str10 = bVar7.f47130a;
                                        if (str10 != null) {
                                            aVar.f12492b = bVar7.f47130a;
                                        }
                                        aVar.m7129b(i35);
                                        aVar.f12501k = str3;
                                        aVar.f12502l = i15;
                                        aVar.f12493c = bVar7.f47127W;
                                        aVar.f12494d = i39;
                                        aVar.f12503m = list4;
                                        aVar.f12498h = str7;
                                        aVar.f12504n = bVar7.f47141l;
                                        C2416m c2416mM7128a2 = aVar.m7128a();
                                        InterfaceC7522w interfaceC7522wMo7366q2 = interfaceC7509j2.mo7366q(bVar7.f47132c, i11);
                                        bVar7.f47128X = interfaceC7522wMo7366q2;
                                        interfaceC7522wMo7366q2.mo7388f(c2416mM7128a2);
                                        sparseArray.put(bVar7.f47132c, bVar7);
                                        c8982d = c8982d2;
                                        bVar = null;
                                    } else {
                                        C10145n.m19099g("MatroskaExtractor", "Non-PCM MS/ACM is unsupported. Setting mimeType to audio/x-unknown");
                                    }
                                    str13 = "audio/x-unknown";
                                    listSingletonList = null;
                                    str5 = null;
                                    str8 = str5;
                                    list = listSingletonList;
                                    str2 = str13;
                                    i14 = -1;
                                    str7 = str8;
                                    list4 = list;
                                    i15 = i14;
                                    str3 = str2;
                                    iM19054u = -1;
                                    if (bVar7.f47118N != null) {
                                        str7 = c10321cM19320a.f51901a;
                                        str3 = "video/dolby-vision";
                                    }
                                    int i310 = (bVar7.f47126V ? 1 : 0) | 0;
                                    if (bVar7.f47125U) {
                                        i16 = 2;
                                    } else {
                                        i16 = 0;
                                    }
                                    int i311 = i310 | i16;
                                    aVar = new C2416m.a();
                                    if (C10147p.m19109i(str3)) {
                                        aVar.f12514x = bVar7.f47119O;
                                        aVar.f12515y = bVar7.f47121Q;
                                        aVar.f12516z = iM19054u;
                                    } else if (C10147p.m19111k(str3)) {
                                        if (bVar7.f47146q == 0) {
                                            i21 = bVar7.f47144o;
                                            i17 = -1;
                                            if (i21 == -1) {
                                                i21 = bVar7.f47142m;
                                            }
                                            bVar7.f47144o = i21;
                                            i22 = bVar7.f47145p;
                                            if (i22 == -1) {
                                                i22 = bVar7.f47143n;
                                            }
                                            bVar7.f47145p = i22;
                                        } else {
                                            i17 = -1;
                                        }
                                        i18 = bVar7.f47144o;
                                        if (i18 != i17) {
                                            f3 = -1.0f;
                                        } else {
                                            f3 = -1.0f;
                                        }
                                        if (bVar7.f47153x) {
                                            if (bVar7.f47108D != -1.0f) {
                                                bArr = null;
                                            } else {
                                                bArr = null;
                                            }
                                            c10320b = new C10320b(bVar7.f47154y, bVar7.f47105A, bVar7.f47155z, bArr);
                                        } else {
                                            c10320b = null;
                                        }
                                        str9 = bVar7.f47130a;
                                        if (str9 != null) {
                                            map = C8982d.f47049h0;
                                            if (map.containsKey(str9)) {
                                                iIntValue = map.get(bVar7.f47130a).intValue();
                                            } else {
                                                iIntValue = i17;
                                            }
                                        } else {
                                            iIntValue = i17;
                                        }
                                        if (bVar7.f47147r == 0) {
                                            i19 = iIntValue;
                                        } else {
                                            i19 = iIntValue;
                                        }
                                        aVar.f12506p = bVar7.f47142m;
                                        aVar.f12507q = bVar7.f47143n;
                                        aVar.f12510t = f3;
                                        aVar.f12509s = i19;
                                        aVar.f12511u = bVar7.f47151v;
                                        aVar.f12512v = bVar7.f47152w;
                                        aVar.f12513w = c10320b;
                                        i11 = 2;
                                    } else {
                                        if ("application/x-subrip".equals(str3)) {
                                        }
                                        i11 = i12;
                                    }
                                    str10 = bVar7.f47130a;
                                    if (str10 != null) {
                                        aVar.f12492b = bVar7.f47130a;
                                    }
                                    aVar.m7129b(i35);
                                    aVar.f12501k = str3;
                                    aVar.f12502l = i15;
                                    aVar.f12493c = bVar7.f47127W;
                                    aVar.f12494d = i311;
                                    aVar.f12503m = list4;
                                    aVar.f12498h = str7;
                                    aVar.f12504n = bVar7.f47141l;
                                    C2416m c2416mM7128a3 = aVar.m7128a();
                                    InterfaceC7522w interfaceC7522wMo7366q3 = interfaceC7509j2.mo7366q(bVar7.f47132c, i11);
                                    bVar7.f47128X = interfaceC7522wMo7366q3;
                                    interfaceC7522wMo7366q3.mo7388f(c2416mM7128a3);
                                    sparseArray.put(bVar7.f47132c, bVar7);
                                    c8982d = c8982d2;
                                    bVar = null;
                                }
                                z11 = false;
                                if (z11) {
                                    iM19054u = C10134c0.m19054u(bVar7.f47120P);
                                    if (iM19054u == 0) {
                                        C10145n.m19099g("MatroskaExtractor", "Unsupported PCM bit depth: " + bVar7.f47120P + ". Setting mimeType to audio/x-unknown");
                                    }
                                    str3 = "audio/raw";
                                    list3 = null;
                                    str6 = null;
                                    str7 = str6;
                                    list4 = list3;
                                    i15 = -1;
                                    if (bVar7.f47118N != null) {
                                        str7 = c10321cM19320a.f51901a;
                                        str3 = "video/dolby-vision";
                                    }
                                    int i312 = (bVar7.f47126V ? 1 : 0) | 0;
                                    if (bVar7.f47125U) {
                                        i16 = 2;
                                    } else {
                                        i16 = 0;
                                    }
                                    int i313 = i312 | i16;
                                    aVar = new C2416m.a();
                                    if (C10147p.m19109i(str3)) {
                                        aVar.f12514x = bVar7.f47119O;
                                        aVar.f12515y = bVar7.f47121Q;
                                        aVar.f12516z = iM19054u;
                                    } else if (C10147p.m19111k(str3)) {
                                        if (bVar7.f47146q == 0) {
                                            i21 = bVar7.f47144o;
                                            i17 = -1;
                                            if (i21 == -1) {
                                                i21 = bVar7.f47142m;
                                            }
                                            bVar7.f47144o = i21;
                                            i22 = bVar7.f47145p;
                                            if (i22 == -1) {
                                                i22 = bVar7.f47143n;
                                            }
                                            bVar7.f47145p = i22;
                                        } else {
                                            i17 = -1;
                                        }
                                        i18 = bVar7.f47144o;
                                        if (i18 != i17) {
                                            f3 = -1.0f;
                                        } else {
                                            f3 = -1.0f;
                                        }
                                        if (bVar7.f47153x) {
                                            if (bVar7.f47108D != -1.0f) {
                                                bArr = null;
                                            } else {
                                                bArr = null;
                                            }
                                            c10320b = new C10320b(bVar7.f47154y, bVar7.f47105A, bVar7.f47155z, bArr);
                                        } else {
                                            c10320b = null;
                                        }
                                        str9 = bVar7.f47130a;
                                        if (str9 != null) {
                                            map = C8982d.f47049h0;
                                            if (map.containsKey(str9)) {
                                                iIntValue = map.get(bVar7.f47130a).intValue();
                                            } else {
                                                iIntValue = i17;
                                            }
                                        } else {
                                            iIntValue = i17;
                                        }
                                        if (bVar7.f47147r == 0) {
                                            i19 = iIntValue;
                                        } else {
                                            i19 = iIntValue;
                                        }
                                        aVar.f12506p = bVar7.f47142m;
                                        aVar.f12507q = bVar7.f47143n;
                                        aVar.f12510t = f3;
                                        aVar.f12509s = i19;
                                        aVar.f12511u = bVar7.f47151v;
                                        aVar.f12512v = bVar7.f47152w;
                                        aVar.f12513w = c10320b;
                                        i11 = 2;
                                    } else {
                                        if ("application/x-subrip".equals(str3)) {
                                        }
                                        i11 = i12;
                                    }
                                    str10 = bVar7.f47130a;
                                    if (str10 != null) {
                                        aVar.f12492b = bVar7.f47130a;
                                    }
                                    aVar.m7129b(i35);
                                    aVar.f12501k = str3;
                                    aVar.f12502l = i15;
                                    aVar.f12493c = bVar7.f47127W;
                                    aVar.f12494d = i313;
                                    aVar.f12503m = list4;
                                    aVar.f12498h = str7;
                                    aVar.f12504n = bVar7.f47141l;
                                    C2416m c2416mM7128a4 = aVar.m7128a();
                                    InterfaceC7522w interfaceC7522wMo7366q4 = interfaceC7509j2.mo7366q(bVar7.f47132c, i11);
                                    bVar7.f47128X = interfaceC7522wMo7366q4;
                                    interfaceC7522wMo7366q4.mo7388f(c2416mM7128a4);
                                    sparseArray.put(bVar7.f47132c, bVar7);
                                    c8982d = c8982d2;
                                    bVar = null;
                                } else {
                                    C10145n.m19099g("MatroskaExtractor", "Non-PCM MS/ACM is unsupported. Setting mimeType to audio/x-unknown");
                                }
                                str13 = "audio/x-unknown";
                                listSingletonList = null;
                                str5 = null;
                                str8 = str5;
                                list = listSingletonList;
                                str2 = str13;
                                i14 = -1;
                                str7 = str8;
                                list4 = list;
                                i15 = i14;
                                str3 = str2;
                                iM19054u = -1;
                                if (bVar7.f47118N != null) {
                                    str7 = c10321cM19320a.f51901a;
                                    str3 = "video/dolby-vision";
                                }
                                int i314 = (bVar7.f47126V ? 1 : 0) | 0;
                                if (bVar7.f47125U) {
                                    i16 = 2;
                                } else {
                                    i16 = 0;
                                }
                                int i315 = i314 | i16;
                                aVar = new C2416m.a();
                                if (C10147p.m19109i(str3)) {
                                    aVar.f12514x = bVar7.f47119O;
                                    aVar.f12515y = bVar7.f47121Q;
                                    aVar.f12516z = iM19054u;
                                } else if (C10147p.m19111k(str3)) {
                                    if (bVar7.f47146q == 0) {
                                        i21 = bVar7.f47144o;
                                        i17 = -1;
                                        if (i21 == -1) {
                                            i21 = bVar7.f47142m;
                                        }
                                        bVar7.f47144o = i21;
                                        i22 = bVar7.f47145p;
                                        if (i22 == -1) {
                                            i22 = bVar7.f47143n;
                                        }
                                        bVar7.f47145p = i22;
                                    } else {
                                        i17 = -1;
                                    }
                                    i18 = bVar7.f47144o;
                                    if (i18 != i17) {
                                        f3 = -1.0f;
                                    } else {
                                        f3 = -1.0f;
                                    }
                                    if (bVar7.f47153x) {
                                        if (bVar7.f47108D != -1.0f) {
                                            bArr = null;
                                        } else {
                                            bArr = null;
                                        }
                                        c10320b = new C10320b(bVar7.f47154y, bVar7.f47105A, bVar7.f47155z, bArr);
                                    } else {
                                        c10320b = null;
                                    }
                                    str9 = bVar7.f47130a;
                                    if (str9 != null) {
                                        map = C8982d.f47049h0;
                                        if (map.containsKey(str9)) {
                                            iIntValue = map.get(bVar7.f47130a).intValue();
                                        } else {
                                            iIntValue = i17;
                                        }
                                    } else {
                                        iIntValue = i17;
                                    }
                                    if (bVar7.f47147r == 0) {
                                        i19 = iIntValue;
                                    } else {
                                        i19 = iIntValue;
                                    }
                                    aVar.f12506p = bVar7.f47142m;
                                    aVar.f12507q = bVar7.f47143n;
                                    aVar.f12510t = f3;
                                    aVar.f12509s = i19;
                                    aVar.f12511u = bVar7.f47151v;
                                    aVar.f12512v = bVar7.f47152w;
                                    aVar.f12513w = c10320b;
                                    i11 = 2;
                                } else {
                                    if ("application/x-subrip".equals(str3)) {
                                    }
                                    i11 = i12;
                                }
                                str10 = bVar7.f47130a;
                                if (str10 != null) {
                                    aVar.f12492b = bVar7.f47130a;
                                }
                                aVar.m7129b(i35);
                                aVar.f12501k = str3;
                                aVar.f12502l = i15;
                                aVar.f12493c = bVar7.f47127W;
                                aVar.f12494d = i315;
                                aVar.f12503m = list4;
                                aVar.f12498h = str7;
                                aVar.f12504n = bVar7.f47141l;
                                C2416m c2416mM7128a5 = aVar.m7128a();
                                InterfaceC7522w interfaceC7522wMo7366q5 = interfaceC7509j2.mo7366q(bVar7.f47132c, i11);
                                bVar7.f47128X = interfaceC7522wMo7366q5;
                                interfaceC7522wMo7366q5.mo7388f(c2416mM7128a5);
                                sparseArray.put(bVar7.f47132c, bVar7);
                                c8982d = c8982d2;
                                bVar = null;
                                break;
                            }
                            z11 = true;
                            if (z11) {
                                iM19054u = C10134c0.m19054u(bVar7.f47120P);
                                if (iM19054u == 0) {
                                    C10145n.m19099g("MatroskaExtractor", "Unsupported PCM bit depth: " + bVar7.f47120P + ". Setting mimeType to audio/x-unknown");
                                }
                                str3 = "audio/raw";
                                list3 = null;
                                str6 = null;
                                str7 = str6;
                                list4 = list3;
                                i15 = -1;
                                if (bVar7.f47118N != null) {
                                    str7 = c10321cM19320a.f51901a;
                                    str3 = "video/dolby-vision";
                                }
                                int i316 = (bVar7.f47126V ? 1 : 0) | 0;
                                if (bVar7.f47125U) {
                                    i16 = 2;
                                } else {
                                    i16 = 0;
                                }
                                int i317 = i316 | i16;
                                aVar = new C2416m.a();
                                if (C10147p.m19109i(str3)) {
                                    aVar.f12514x = bVar7.f47119O;
                                    aVar.f12515y = bVar7.f47121Q;
                                    aVar.f12516z = iM19054u;
                                } else if (C10147p.m19111k(str3)) {
                                    if (bVar7.f47146q == 0) {
                                        i21 = bVar7.f47144o;
                                        i17 = -1;
                                        if (i21 == -1) {
                                            i21 = bVar7.f47142m;
                                        }
                                        bVar7.f47144o = i21;
                                        i22 = bVar7.f47145p;
                                        if (i22 == -1) {
                                            i22 = bVar7.f47143n;
                                        }
                                        bVar7.f47145p = i22;
                                    } else {
                                        i17 = -1;
                                    }
                                    i18 = bVar7.f47144o;
                                    if (i18 != i17) {
                                        f3 = -1.0f;
                                    } else {
                                        f3 = -1.0f;
                                    }
                                    if (bVar7.f47153x) {
                                        if (bVar7.f47108D != -1.0f) {
                                            bArr = null;
                                        } else {
                                            bArr = null;
                                        }
                                        c10320b = new C10320b(bVar7.f47154y, bVar7.f47105A, bVar7.f47155z, bArr);
                                    } else {
                                        c10320b = null;
                                    }
                                    str9 = bVar7.f47130a;
                                    if (str9 != null) {
                                        map = C8982d.f47049h0;
                                        if (map.containsKey(str9)) {
                                            iIntValue = map.get(bVar7.f47130a).intValue();
                                        } else {
                                            iIntValue = i17;
                                        }
                                    } else {
                                        iIntValue = i17;
                                    }
                                    if (bVar7.f47147r == 0) {
                                        i19 = iIntValue;
                                    } else {
                                        i19 = iIntValue;
                                    }
                                    aVar.f12506p = bVar7.f47142m;
                                    aVar.f12507q = bVar7.f47143n;
                                    aVar.f12510t = f3;
                                    aVar.f12509s = i19;
                                    aVar.f12511u = bVar7.f47151v;
                                    aVar.f12512v = bVar7.f47152w;
                                    aVar.f12513w = c10320b;
                                    i11 = 2;
                                } else {
                                    if ("application/x-subrip".equals(str3)) {
                                    }
                                    i11 = i12;
                                }
                                str10 = bVar7.f47130a;
                                if (str10 != null) {
                                    aVar.f12492b = bVar7.f47130a;
                                }
                                aVar.m7129b(i35);
                                aVar.f12501k = str3;
                                aVar.f12502l = i15;
                                aVar.f12493c = bVar7.f47127W;
                                aVar.f12494d = i317;
                                aVar.f12503m = list4;
                                aVar.f12498h = str7;
                                aVar.f12504n = bVar7.f47141l;
                                C2416m c2416mM7128a6 = aVar.m7128a();
                                InterfaceC7522w interfaceC7522wMo7366q6 = interfaceC7509j2.mo7366q(bVar7.f47132c, i11);
                                bVar7.f47128X = interfaceC7522wMo7366q6;
                                interfaceC7522wMo7366q6.mo7388f(c2416mM7128a6);
                                sparseArray.put(bVar7.f47132c, bVar7);
                                c8982d = c8982d2;
                                bVar = null;
                            } else {
                                C10145n.m19099g("MatroskaExtractor", "Non-PCM MS/ACM is unsupported. Setting mimeType to audio/x-unknown");
                            }
                            str13 = "audio/x-unknown";
                            listSingletonList = null;
                            str5 = null;
                            str8 = str5;
                            list = listSingletonList;
                            str2 = str13;
                            i14 = -1;
                            str7 = str8;
                            list4 = list;
                            i15 = i14;
                            str3 = str2;
                            iM19054u = -1;
                            if (bVar7.f47118N != null) {
                                str7 = c10321cM19320a.f51901a;
                                str3 = "video/dolby-vision";
                            }
                            int i318 = (bVar7.f47126V ? 1 : 0) | 0;
                            if (bVar7.f47125U) {
                                i16 = 2;
                            } else {
                                i16 = 0;
                            }
                            int i319 = i318 | i16;
                            aVar = new C2416m.a();
                            if (C10147p.m19109i(str3)) {
                                aVar.f12514x = bVar7.f47119O;
                                aVar.f12515y = bVar7.f47121Q;
                                aVar.f12516z = iM19054u;
                            } else if (C10147p.m19111k(str3)) {
                                if (bVar7.f47146q == 0) {
                                    i21 = bVar7.f47144o;
                                    i17 = -1;
                                    if (i21 == -1) {
                                        i21 = bVar7.f47142m;
                                    }
                                    bVar7.f47144o = i21;
                                    i22 = bVar7.f47145p;
                                    if (i22 == -1) {
                                        i22 = bVar7.f47143n;
                                    }
                                    bVar7.f47145p = i22;
                                } else {
                                    i17 = -1;
                                }
                                i18 = bVar7.f47144o;
                                if (i18 != i17) {
                                    f3 = -1.0f;
                                } else {
                                    f3 = -1.0f;
                                }
                                if (bVar7.f47153x) {
                                    if (bVar7.f47108D != -1.0f) {
                                        bArr = null;
                                    } else {
                                        bArr = null;
                                    }
                                    c10320b = new C10320b(bVar7.f47154y, bVar7.f47105A, bVar7.f47155z, bArr);
                                } else {
                                    c10320b = null;
                                }
                                str9 = bVar7.f47130a;
                                if (str9 != null) {
                                    map = C8982d.f47049h0;
                                    if (map.containsKey(str9)) {
                                        iIntValue = map.get(bVar7.f47130a).intValue();
                                    } else {
                                        iIntValue = i17;
                                    }
                                } else {
                                    iIntValue = i17;
                                }
                                if (bVar7.f47147r == 0) {
                                    i19 = iIntValue;
                                } else {
                                    i19 = iIntValue;
                                }
                                aVar.f12506p = bVar7.f47142m;
                                aVar.f12507q = bVar7.f47143n;
                                aVar.f12510t = f3;
                                aVar.f12509s = i19;
                                aVar.f12511u = bVar7.f47151v;
                                aVar.f12512v = bVar7.f47152w;
                                aVar.f12513w = c10320b;
                                i11 = 2;
                            } else {
                                if ("application/x-subrip".equals(str3)) {
                                }
                                i11 = i12;
                            }
                            str10 = bVar7.f47130a;
                            if (str10 != null) {
                                aVar.f12492b = bVar7.f47130a;
                            }
                            aVar.m7129b(i35);
                            aVar.f12501k = str3;
                            aVar.f12502l = i15;
                            aVar.f12493c = bVar7.f47127W;
                            aVar.f12494d = i319;
                            aVar.f12503m = list4;
                            aVar.f12498h = str7;
                            aVar.f12504n = bVar7.f47141l;
                            C2416m c2416mM7128a7 = aVar.m7128a();
                            InterfaceC7522w interfaceC7522wMo7366q7 = interfaceC7509j2.mo7366q(bVar7.f47132c, i11);
                            bVar7.f47128X = interfaceC7522wMo7366q7;
                            interfaceC7522wMo7366q7.mo7388f(c2416mM7128a7);
                            sparseArray.put(bVar7.f47132c, bVar7);
                            c8982d = c8982d2;
                            bVar = null;
                        } catch (ArrayIndexOutOfBoundsException unused) {
                            throw ParserException.m6770a("Error parsing MS/ACM codec private", null);
                        }
                        break;
                    case 3:
                        bVar7 = bVar7;
                        i12 = 3;
                        bVar7.f47124T = new C7523x();
                        str13 = "audio/true-hd";
                        i11 = 1;
                        listSingletonList = null;
                        str5 = null;
                        str8 = str5;
                        list = listSingletonList;
                        str2 = str13;
                        i14 = -1;
                        str7 = str8;
                        list4 = list;
                        i15 = i14;
                        str3 = str2;
                        iM19054u = -1;
                        if (bVar7.f47118N != null) {
                            str7 = c10321cM19320a.f51901a;
                            str3 = "video/dolby-vision";
                        }
                        int i3110 = (bVar7.f47126V ? 1 : 0) | 0;
                        if (bVar7.f47125U) {
                            i16 = 2;
                        } else {
                            i16 = 0;
                        }
                        int i3111 = i3110 | i16;
                        aVar = new C2416m.a();
                        if (C10147p.m19109i(str3)) {
                            aVar.f12514x = bVar7.f47119O;
                            aVar.f12515y = bVar7.f47121Q;
                            aVar.f12516z = iM19054u;
                        } else if (C10147p.m19111k(str3)) {
                            if (bVar7.f47146q == 0) {
                                i21 = bVar7.f47144o;
                                i17 = -1;
                                if (i21 == -1) {
                                    i21 = bVar7.f47142m;
                                }
                                bVar7.f47144o = i21;
                                i22 = bVar7.f47145p;
                                if (i22 == -1) {
                                    i22 = bVar7.f47143n;
                                }
                                bVar7.f47145p = i22;
                            } else {
                                i17 = -1;
                            }
                            i18 = bVar7.f47144o;
                            if (i18 != i17) {
                                f3 = -1.0f;
                            } else {
                                f3 = -1.0f;
                            }
                            if (bVar7.f47153x) {
                                if (bVar7.f47108D != -1.0f) {
                                    bArr = null;
                                } else {
                                    bArr = null;
                                }
                                c10320b = new C10320b(bVar7.f47154y, bVar7.f47105A, bVar7.f47155z, bArr);
                            } else {
                                c10320b = null;
                            }
                            str9 = bVar7.f47130a;
                            if (str9 != null) {
                                map = C8982d.f47049h0;
                                if (map.containsKey(str9)) {
                                    iIntValue = map.get(bVar7.f47130a).intValue();
                                } else {
                                    iIntValue = i17;
                                }
                            } else {
                                iIntValue = i17;
                            }
                            if (bVar7.f47147r == 0) {
                                i19 = iIntValue;
                            } else {
                                i19 = iIntValue;
                            }
                            aVar.f12506p = bVar7.f47142m;
                            aVar.f12507q = bVar7.f47143n;
                            aVar.f12510t = f3;
                            aVar.f12509s = i19;
                            aVar.f12511u = bVar7.f47151v;
                            aVar.f12512v = bVar7.f47152w;
                            aVar.f12513w = c10320b;
                            i11 = 2;
                        } else {
                            if ("application/x-subrip".equals(str3)) {
                            }
                            i11 = i12;
                        }
                        str10 = bVar7.f47130a;
                        if (str10 != null) {
                            aVar.f12492b = bVar7.f47130a;
                        }
                        aVar.m7129b(i35);
                        aVar.f12501k = str3;
                        aVar.f12502l = i15;
                        aVar.f12493c = bVar7.f47127W;
                        aVar.f12494d = i3111;
                        aVar.f12503m = list4;
                        aVar.f12498h = str7;
                        aVar.f12504n = bVar7.f47141l;
                        C2416m c2416mM7128a8 = aVar.m7128a();
                        InterfaceC7522w interfaceC7522wMo7366q8 = interfaceC7509j2.mo7366q(bVar7.f47132c, i11);
                        bVar7.f47128X = interfaceC7522wMo7366q8;
                        interfaceC7522wMo7366q8.mo7388f(c2416mM7128a8);
                        sparseArray.put(bVar7.f47132c, bVar7);
                        c8982d = c8982d2;
                        bVar = null;
                        break;
                    case 4:
                        bVar7 = bVar7;
                        byte[] bArrM17227a = bVar7.m17227a(bVar7.f47131b);
                        try {
                            try {
                                if (bArrM17227a[0] != 2) {
                                    throw ParserException.m6770a("Error parsing vorbis codec private", null);
                                }
                                int i40 = 0;
                                int i41 = 1;
                                while (true) {
                                    int i42 = bArrM17227a[i41] & 255;
                                    if (i42 != 255) {
                                        int i43 = i41 + 1;
                                        int i44 = i40 + i42;
                                        int i45 = 0;
                                        while (true) {
                                            int i46 = bArrM17227a[i43] & 255;
                                            if (i46 != 255) {
                                                int i47 = i43 + 1;
                                                int i48 = i45 + i46;
                                                if (bArrM17227a[i47] != 1) {
                                                    throw ParserException.m6770a("Error parsing vorbis codec private", null);
                                                }
                                                byte[] bArr3 = new byte[i44];
                                                System.arraycopy(bArrM17227a, i47, bArr3, 0, i44);
                                                int i49 = i47 + i44;
                                                i12 = 3;
                                                if (bArrM17227a[i49] != 3) {
                                                    throw ParserException.m6770a("Error parsing vorbis codec private", null);
                                                }
                                                int i50 = i49 + i48;
                                                if (bArrM17227a[i50] != 5) {
                                                    throw ParserException.m6770a("Error parsing vorbis codec private", null);
                                                }
                                                byte[] bArr4 = new byte[bArrM17227a.length - i50];
                                                System.arraycopy(bArrM17227a, i50, bArr4, 0, bArrM17227a.length - i50);
                                                arrayList = new ArrayList(2);
                                                arrayList.add(bArr3);
                                                arrayList.add(bArr4);
                                                str = "audio/vorbis";
                                                i13 = 8192;
                                                int i51 = i13;
                                                list = arrayList;
                                                str2 = str;
                                                i14 = i51;
                                                str8 = null;
                                                i11 = 1;
                                                str7 = str8;
                                                list4 = list;
                                                i15 = i14;
                                                str3 = str2;
                                                iM19054u = -1;
                                                if (bVar7.f47118N != null) {
                                                    str7 = c10321cM19320a.f51901a;
                                                    str3 = "video/dolby-vision";
                                                }
                                                int i3112 = (bVar7.f47126V ? 1 : 0) | 0;
                                                if (bVar7.f47125U) {
                                                    i16 = 2;
                                                } else {
                                                    i16 = 0;
                                                }
                                                int i3113 = i3112 | i16;
                                                aVar = new C2416m.a();
                                                if (C10147p.m19109i(str3)) {
                                                    aVar.f12514x = bVar7.f47119O;
                                                    aVar.f12515y = bVar7.f47121Q;
                                                    aVar.f12516z = iM19054u;
                                                } else if (C10147p.m19111k(str3)) {
                                                    if (bVar7.f47146q == 0) {
                                                        i21 = bVar7.f47144o;
                                                        i17 = -1;
                                                        if (i21 == -1) {
                                                            i21 = bVar7.f47142m;
                                                        }
                                                        bVar7.f47144o = i21;
                                                        i22 = bVar7.f47145p;
                                                        if (i22 == -1) {
                                                            i22 = bVar7.f47143n;
                                                        }
                                                        bVar7.f47145p = i22;
                                                    } else {
                                                        i17 = -1;
                                                    }
                                                    i18 = bVar7.f47144o;
                                                    if (i18 != i17) {
                                                        f3 = -1.0f;
                                                    } else {
                                                        f3 = -1.0f;
                                                    }
                                                    if (bVar7.f47153x) {
                                                        if (bVar7.f47108D != -1.0f) {
                                                            bArr = null;
                                                        } else {
                                                            bArr = null;
                                                        }
                                                        c10320b = new C10320b(bVar7.f47154y, bVar7.f47105A, bVar7.f47155z, bArr);
                                                    } else {
                                                        c10320b = null;
                                                    }
                                                    str9 = bVar7.f47130a;
                                                    if (str9 != null) {
                                                        map = C8982d.f47049h0;
                                                        if (map.containsKey(str9)) {
                                                            iIntValue = map.get(bVar7.f47130a).intValue();
                                                        } else {
                                                            iIntValue = i17;
                                                        }
                                                    } else {
                                                        iIntValue = i17;
                                                    }
                                                    if (bVar7.f47147r == 0) {
                                                        i19 = iIntValue;
                                                    } else {
                                                        i19 = iIntValue;
                                                    }
                                                    aVar.f12506p = bVar7.f47142m;
                                                    aVar.f12507q = bVar7.f47143n;
                                                    aVar.f12510t = f3;
                                                    aVar.f12509s = i19;
                                                    aVar.f12511u = bVar7.f47151v;
                                                    aVar.f12512v = bVar7.f47152w;
                                                    aVar.f12513w = c10320b;
                                                    i11 = 2;
                                                } else {
                                                    if ("application/x-subrip".equals(str3)) {
                                                    }
                                                    i11 = i12;
                                                }
                                                str10 = bVar7.f47130a;
                                                if (str10 != null) {
                                                    aVar.f12492b = bVar7.f47130a;
                                                }
                                                aVar.m7129b(i35);
                                                aVar.f12501k = str3;
                                                aVar.f12502l = i15;
                                                aVar.f12493c = bVar7.f47127W;
                                                aVar.f12494d = i3113;
                                                aVar.f12503m = list4;
                                                aVar.f12498h = str7;
                                                aVar.f12504n = bVar7.f47141l;
                                                C2416m c2416mM7128a9 = aVar.m7128a();
                                                InterfaceC7522w interfaceC7522wMo7366q9 = interfaceC7509j2.mo7366q(bVar7.f47132c, i11);
                                                bVar7.f47128X = interfaceC7522wMo7366q9;
                                                interfaceC7522wMo7366q9.mo7388f(c2416mM7128a9);
                                                sparseArray.put(bVar7.f47132c, bVar7);
                                                c8982d = c8982d2;
                                                bVar = null;
                                            } else {
                                                i45 += 255;
                                                i43++;
                                            }
                                        }
                                    } else {
                                        i40 += 255;
                                        i41++;
                                    }
                                }
                            } catch (ArrayIndexOutOfBoundsException unused2) {
                                throw ParserException.m6770a("Error parsing vorbis codec private", bArrM17227a);
                            }
                        } catch (ArrayIndexOutOfBoundsException unused3) {
                            bArrM17227a = 0;
                        }
                        break;
                    case 5:
                        str2 = "audio/mpeg-L2";
                        i14 = 4096;
                        list = null;
                        i12 = 3;
                        str8 = null;
                        i11 = 1;
                        str7 = str8;
                        list4 = list;
                        i15 = i14;
                        str3 = str2;
                        iM19054u = -1;
                        if (bVar7.f47118N != null) {
                            str7 = c10321cM19320a.f51901a;
                            str3 = "video/dolby-vision";
                        }
                        int i3114 = (bVar7.f47126V ? 1 : 0) | 0;
                        if (bVar7.f47125U) {
                            i16 = 2;
                        } else {
                            i16 = 0;
                        }
                        int i3115 = i3114 | i16;
                        aVar = new C2416m.a();
                        if (C10147p.m19109i(str3)) {
                            aVar.f12514x = bVar7.f47119O;
                            aVar.f12515y = bVar7.f47121Q;
                            aVar.f12516z = iM19054u;
                        } else if (C10147p.m19111k(str3)) {
                            if (bVar7.f47146q == 0) {
                                i21 = bVar7.f47144o;
                                i17 = -1;
                                if (i21 == -1) {
                                    i21 = bVar7.f47142m;
                                }
                                bVar7.f47144o = i21;
                                i22 = bVar7.f47145p;
                                if (i22 == -1) {
                                    i22 = bVar7.f47143n;
                                }
                                bVar7.f47145p = i22;
                            } else {
                                i17 = -1;
                            }
                            i18 = bVar7.f47144o;
                            if (i18 != i17) {
                                f3 = -1.0f;
                            } else {
                                f3 = -1.0f;
                            }
                            if (bVar7.f47153x) {
                                if (bVar7.f47108D != -1.0f) {
                                    bArr = null;
                                } else {
                                    bArr = null;
                                }
                                c10320b = new C10320b(bVar7.f47154y, bVar7.f47105A, bVar7.f47155z, bArr);
                            } else {
                                c10320b = null;
                            }
                            str9 = bVar7.f47130a;
                            if (str9 != null) {
                                map = C8982d.f47049h0;
                                if (map.containsKey(str9)) {
                                    iIntValue = map.get(bVar7.f47130a).intValue();
                                } else {
                                    iIntValue = i17;
                                }
                            } else {
                                iIntValue = i17;
                            }
                            if (bVar7.f47147r == 0) {
                                i19 = iIntValue;
                            } else {
                                i19 = iIntValue;
                            }
                            aVar.f12506p = bVar7.f47142m;
                            aVar.f12507q = bVar7.f47143n;
                            aVar.f12510t = f3;
                            aVar.f12509s = i19;
                            aVar.f12511u = bVar7.f47151v;
                            aVar.f12512v = bVar7.f47152w;
                            aVar.f12513w = c10320b;
                            i11 = 2;
                        } else {
                            if ("application/x-subrip".equals(str3)) {
                            }
                            i11 = i12;
                        }
                        str10 = bVar7.f47130a;
                        if (str10 != null) {
                            aVar.f12492b = bVar7.f47130a;
                        }
                        aVar.m7129b(i35);
                        aVar.f12501k = str3;
                        aVar.f12502l = i15;
                        aVar.f12493c = bVar7.f47127W;
                        aVar.f12494d = i3115;
                        aVar.f12503m = list4;
                        aVar.f12498h = str7;
                        aVar.f12504n = bVar7.f47141l;
                        C2416m c2416mM7128a10 = aVar.m7128a();
                        InterfaceC7522w interfaceC7522wMo7366q10 = interfaceC7509j2.mo7366q(bVar7.f47132c, i11);
                        bVar7.f47128X = interfaceC7522wMo7366q10;
                        interfaceC7522wMo7366q10.mo7388f(c2416mM7128a10);
                        sparseArray.put(bVar7.f47132c, bVar7);
                        c8982d = c8982d2;
                        bVar = null;
                        break;
                    case PreferencesProto$Value.STRING_SET_FIELD_NUMBER /* 6 */:
                        str2 = "audio/mpeg";
                        i14 = 4096;
                        list = null;
                        i12 = 3;
                        str8 = null;
                        i11 = 1;
                        str7 = str8;
                        list4 = list;
                        i15 = i14;
                        str3 = str2;
                        iM19054u = -1;
                        if (bVar7.f47118N != null) {
                            str7 = c10321cM19320a.f51901a;
                            str3 = "video/dolby-vision";
                        }
                        int i3116 = (bVar7.f47126V ? 1 : 0) | 0;
                        if (bVar7.f47125U) {
                            i16 = 2;
                        } else {
                            i16 = 0;
                        }
                        int i3117 = i3116 | i16;
                        aVar = new C2416m.a();
                        if (C10147p.m19109i(str3)) {
                            aVar.f12514x = bVar7.f47119O;
                            aVar.f12515y = bVar7.f47121Q;
                            aVar.f12516z = iM19054u;
                        } else if (C10147p.m19111k(str3)) {
                            if (bVar7.f47146q == 0) {
                                i21 = bVar7.f47144o;
                                i17 = -1;
                                if (i21 == -1) {
                                    i21 = bVar7.f47142m;
                                }
                                bVar7.f47144o = i21;
                                i22 = bVar7.f47145p;
                                if (i22 == -1) {
                                    i22 = bVar7.f47143n;
                                }
                                bVar7.f47145p = i22;
                            } else {
                                i17 = -1;
                            }
                            i18 = bVar7.f47144o;
                            if (i18 != i17) {
                                f3 = -1.0f;
                            } else {
                                f3 = -1.0f;
                            }
                            if (bVar7.f47153x) {
                                if (bVar7.f47108D != -1.0f) {
                                    bArr = null;
                                } else {
                                    bArr = null;
                                }
                                c10320b = new C10320b(bVar7.f47154y, bVar7.f47105A, bVar7.f47155z, bArr);
                            } else {
                                c10320b = null;
                            }
                            str9 = bVar7.f47130a;
                            if (str9 != null) {
                                map = C8982d.f47049h0;
                                if (map.containsKey(str9)) {
                                    iIntValue = map.get(bVar7.f47130a).intValue();
                                } else {
                                    iIntValue = i17;
                                }
                            } else {
                                iIntValue = i17;
                            }
                            if (bVar7.f47147r == 0) {
                                i19 = iIntValue;
                            } else {
                                i19 = iIntValue;
                            }
                            aVar.f12506p = bVar7.f47142m;
                            aVar.f12507q = bVar7.f47143n;
                            aVar.f12510t = f3;
                            aVar.f12509s = i19;
                            aVar.f12511u = bVar7.f47151v;
                            aVar.f12512v = bVar7.f47152w;
                            aVar.f12513w = c10320b;
                            i11 = 2;
                        } else {
                            if ("application/x-subrip".equals(str3)) {
                            }
                            i11 = i12;
                        }
                        str10 = bVar7.f47130a;
                        if (str10 != null) {
                            aVar.f12492b = bVar7.f47130a;
                        }
                        aVar.m7129b(i35);
                        aVar.f12501k = str3;
                        aVar.f12502l = i15;
                        aVar.f12493c = bVar7.f47127W;
                        aVar.f12494d = i3117;
                        aVar.f12503m = list4;
                        aVar.f12498h = str7;
                        aVar.f12504n = bVar7.f47141l;
                        C2416m c2416mM7128a11 = aVar.m7128a();
                        InterfaceC7522w interfaceC7522wMo7366q11 = interfaceC7509j2.mo7366q(bVar7.f47132c, i11);
                        bVar7.f47128X = interfaceC7522wMo7366q11;
                        interfaceC7522wMo7366q11.mo7388f(c2416mM7128a11);
                        sparseArray.put(bVar7.f47132c, bVar7);
                        c8982d = c8982d2;
                        bVar = null;
                        break;
                    case PreferencesProto$Value.DOUBLE_FIELD_NUMBER /* 7 */:
                        bVar7 = bVar7;
                        C10151t c10151t3 = new C10151t(bVar7.m17227a(bVar7.f47131b));
                        try {
                            c10151t3.m19125F(16);
                            long jM19135j = c10151t3.m19135j();
                            r10 = (jM19135j > 1482049860L ? 1 : (jM19135j == 1482049860L ? 0 : -1));
                            try {
                                if (r10 != 0) {
                                    if (jM19135j == 859189832) {
                                        r10 = 0;
                                        pair = new Pair("video/3gpp", null);
                                    } else if (jM19135j == 826496599) {
                                        int i52 = c10151t3.f51439b + 20;
                                        byte[] bArr5 = c10151t3.f51438a;
                                        while (true) {
                                            if (i52 >= bArr5.length - 4) {
                                                throw ParserException.m6770a("Failed to find FourCC VC1 initialization data", null);
                                            }
                                            if (bArr5[i52] == 0 && bArr5[i52 + 1] == 0 && bArr5[i52 + 2] == 1) {
                                                if (bArr5[i52 + 3] == 15) {
                                                    pair = new Pair("video/wvc1", Collections.singletonList(Arrays.copyOfRange(bArr5, i52, bArr5.length)));
                                                }
                                            }
                                            i52++;
                                        }
                                    } else {
                                        C10145n.m19099g("MatroskaExtractor", "Unknown FourCC. Setting mimeType to video/x-unknown");
                                        pair = new Pair("video/x-unknown", null);
                                    }
                                    str13 = (String) pair.first;
                                    list2 = (List) pair.second;
                                    listSingletonList = list2;
                                    i11 = 1;
                                    i12 = 3;
                                    str5 = null;
                                    str8 = str5;
                                    list = listSingletonList;
                                    str2 = str13;
                                    i14 = -1;
                                    str7 = str8;
                                    list4 = list;
                                    i15 = i14;
                                    str3 = str2;
                                    iM19054u = -1;
                                    if (bVar7.f47118N != null) {
                                        str7 = c10321cM19320a.f51901a;
                                        str3 = "video/dolby-vision";
                                    }
                                    int i3118 = (bVar7.f47126V ? 1 : 0) | 0;
                                    if (bVar7.f47125U) {
                                        i16 = 2;
                                    } else {
                                        i16 = 0;
                                    }
                                    int i3119 = i3118 | i16;
                                    aVar = new C2416m.a();
                                    if (C10147p.m19109i(str3)) {
                                        aVar.f12514x = bVar7.f47119O;
                                        aVar.f12515y = bVar7.f47121Q;
                                        aVar.f12516z = iM19054u;
                                    } else if (C10147p.m19111k(str3)) {
                                        if (bVar7.f47146q == 0) {
                                            i21 = bVar7.f47144o;
                                            i17 = -1;
                                            if (i21 == -1) {
                                                i21 = bVar7.f47142m;
                                            }
                                            bVar7.f47144o = i21;
                                            i22 = bVar7.f47145p;
                                            if (i22 == -1) {
                                                i22 = bVar7.f47143n;
                                            }
                                            bVar7.f47145p = i22;
                                        } else {
                                            i17 = -1;
                                        }
                                        i18 = bVar7.f47144o;
                                        if (i18 != i17) {
                                            f3 = -1.0f;
                                        } else {
                                            f3 = -1.0f;
                                        }
                                        if (bVar7.f47153x) {
                                            if (bVar7.f47108D != -1.0f) {
                                                bArr = null;
                                            } else {
                                                bArr = null;
                                            }
                                            c10320b = new C10320b(bVar7.f47154y, bVar7.f47105A, bVar7.f47155z, bArr);
                                        } else {
                                            c10320b = null;
                                        }
                                        str9 = bVar7.f47130a;
                                        if (str9 != null) {
                                            map = C8982d.f47049h0;
                                            if (map.containsKey(str9)) {
                                                iIntValue = map.get(bVar7.f47130a).intValue();
                                            } else {
                                                iIntValue = i17;
                                            }
                                        } else {
                                            iIntValue = i17;
                                        }
                                        if (bVar7.f47147r == 0) {
                                            i19 = iIntValue;
                                        } else {
                                            i19 = iIntValue;
                                        }
                                        aVar.f12506p = bVar7.f47142m;
                                        aVar.f12507q = bVar7.f47143n;
                                        aVar.f12510t = f3;
                                        aVar.f12509s = i19;
                                        aVar.f12511u = bVar7.f47151v;
                                        aVar.f12512v = bVar7.f47152w;
                                        aVar.f12513w = c10320b;
                                        i11 = 2;
                                    } else {
                                        if ("application/x-subrip".equals(str3)) {
                                        }
                                        i11 = i12;
                                    }
                                    str10 = bVar7.f47130a;
                                    if (str10 != null) {
                                        aVar.f12492b = bVar7.f47130a;
                                    }
                                    aVar.m7129b(i35);
                                    aVar.f12501k = str3;
                                    aVar.f12502l = i15;
                                    aVar.f12493c = bVar7.f47127W;
                                    aVar.f12494d = i3119;
                                    aVar.f12503m = list4;
                                    aVar.f12498h = str7;
                                    aVar.f12504n = bVar7.f47141l;
                                    C2416m c2416mM7128a12 = aVar.m7128a();
                                    InterfaceC7522w interfaceC7522wMo7366q12 = interfaceC7509j2.mo7366q(bVar7.f47132c, i11);
                                    bVar7.f47128X = interfaceC7522wMo7366q12;
                                    interfaceC7522wMo7366q12.mo7388f(c2416mM7128a12);
                                    sparseArray.put(bVar7.f47132c, bVar7);
                                    c8982d = c8982d2;
                                    bVar = null;
                                } else {
                                    r10 = 0;
                                    pair = new Pair("video/divx", null);
                                }
                                str13 = (String) pair.first;
                                list2 = (List) pair.second;
                                listSingletonList = list2;
                                i11 = 1;
                                i12 = 3;
                                str5 = null;
                                str8 = str5;
                                list = listSingletonList;
                                str2 = str13;
                                i14 = -1;
                                str7 = str8;
                                list4 = list;
                                i15 = i14;
                                str3 = str2;
                                iM19054u = -1;
                                if (bVar7.f47118N != null) {
                                    str7 = c10321cM19320a.f51901a;
                                    str3 = "video/dolby-vision";
                                }
                                int i31110 = (bVar7.f47126V ? 1 : 0) | 0;
                                if (bVar7.f47125U) {
                                    i16 = 2;
                                } else {
                                    i16 = 0;
                                }
                                int i31111 = i31110 | i16;
                                aVar = new C2416m.a();
                                if (C10147p.m19109i(str3)) {
                                    aVar.f12514x = bVar7.f47119O;
                                    aVar.f12515y = bVar7.f47121Q;
                                    aVar.f12516z = iM19054u;
                                } else if (C10147p.m19111k(str3)) {
                                    if (bVar7.f47146q == 0) {
                                        i21 = bVar7.f47144o;
                                        i17 = -1;
                                        if (i21 == -1) {
                                            i21 = bVar7.f47142m;
                                        }
                                        bVar7.f47144o = i21;
                                        i22 = bVar7.f47145p;
                                        if (i22 == -1) {
                                            i22 = bVar7.f47143n;
                                        }
                                        bVar7.f47145p = i22;
                                    } else {
                                        i17 = -1;
                                    }
                                    i18 = bVar7.f47144o;
                                    if (i18 != i17) {
                                        f3 = -1.0f;
                                    } else {
                                        f3 = -1.0f;
                                    }
                                    if (bVar7.f47153x) {
                                        if (bVar7.f47108D != -1.0f) {
                                            bArr = null;
                                        } else {
                                            bArr = null;
                                        }
                                        c10320b = new C10320b(bVar7.f47154y, bVar7.f47105A, bVar7.f47155z, bArr);
                                    } else {
                                        c10320b = null;
                                    }
                                    str9 = bVar7.f47130a;
                                    if (str9 != null) {
                                        map = C8982d.f47049h0;
                                        if (map.containsKey(str9)) {
                                            iIntValue = map.get(bVar7.f47130a).intValue();
                                        } else {
                                            iIntValue = i17;
                                        }
                                    } else {
                                        iIntValue = i17;
                                    }
                                    if (bVar7.f47147r == 0) {
                                        i19 = iIntValue;
                                    } else {
                                        i19 = iIntValue;
                                    }
                                    aVar.f12506p = bVar7.f47142m;
                                    aVar.f12507q = bVar7.f47143n;
                                    aVar.f12510t = f3;
                                    aVar.f12509s = i19;
                                    aVar.f12511u = bVar7.f47151v;
                                    aVar.f12512v = bVar7.f47152w;
                                    aVar.f12513w = c10320b;
                                    i11 = 2;
                                } else {
                                    if ("application/x-subrip".equals(str3)) {
                                    }
                                    i11 = i12;
                                }
                                str10 = bVar7.f47130a;
                                if (str10 != null) {
                                    aVar.f12492b = bVar7.f47130a;
                                }
                                aVar.m7129b(i35);
                                aVar.f12501k = str3;
                                aVar.f12502l = i15;
                                aVar.f12493c = bVar7.f47127W;
                                aVar.f12494d = i31111;
                                aVar.f12503m = list4;
                                aVar.f12498h = str7;
                                aVar.f12504n = bVar7.f47141l;
                                C2416m c2416mM7128a13 = aVar.m7128a();
                                InterfaceC7522w interfaceC7522wMo7366q13 = interfaceC7509j2.mo7366q(bVar7.f47132c, i11);
                                bVar7.f47128X = interfaceC7522wMo7366q13;
                                interfaceC7522wMo7366q13.mo7388f(c2416mM7128a13);
                                sparseArray.put(bVar7.f47132c, bVar7);
                                c8982d = c8982d2;
                                bVar = null;
                            } catch (ArrayIndexOutOfBoundsException unused4) {
                                throw ParserException.m6770a("Error parsing FourCC private data", r10);
                            }
                        } catch (ArrayIndexOutOfBoundsException unused5) {
                            r10 = 0;
                        }
                        break;
                    case 8:
                        bVar7 = bVar7;
                        byte[] bArr6 = new byte[4];
                        System.arraycopy(bVar7.m17227a(bVar7.f47131b), 0, bArr6, 0, 4);
                        listM9064b0 = ImmutableList.m9064b0(bArr6);
                        str13 = "application/dvbsubs";
                        list2 = listM9064b0;
                        listSingletonList = list2;
                        i11 = 1;
                        i12 = 3;
                        str5 = null;
                        str8 = str5;
                        list = listSingletonList;
                        str2 = str13;
                        i14 = -1;
                        str7 = str8;
                        list4 = list;
                        i15 = i14;
                        str3 = str2;
                        iM19054u = -1;
                        if (bVar7.f47118N != null) {
                            str7 = c10321cM19320a.f51901a;
                            str3 = "video/dolby-vision";
                        }
                        int i31112 = (bVar7.f47126V ? 1 : 0) | 0;
                        if (bVar7.f47125U) {
                            i16 = 2;
                        } else {
                            i16 = 0;
                        }
                        int i31113 = i31112 | i16;
                        aVar = new C2416m.a();
                        if (C10147p.m19109i(str3)) {
                            aVar.f12514x = bVar7.f47119O;
                            aVar.f12515y = bVar7.f47121Q;
                            aVar.f12516z = iM19054u;
                        } else if (C10147p.m19111k(str3)) {
                            if (bVar7.f47146q == 0) {
                                i21 = bVar7.f47144o;
                                i17 = -1;
                                if (i21 == -1) {
                                    i21 = bVar7.f47142m;
                                }
                                bVar7.f47144o = i21;
                                i22 = bVar7.f47145p;
                                if (i22 == -1) {
                                    i22 = bVar7.f47143n;
                                }
                                bVar7.f47145p = i22;
                            } else {
                                i17 = -1;
                            }
                            i18 = bVar7.f47144o;
                            if (i18 != i17) {
                                f3 = -1.0f;
                            } else {
                                f3 = -1.0f;
                            }
                            if (bVar7.f47153x) {
                                if (bVar7.f47108D != -1.0f) {
                                    bArr = null;
                                } else {
                                    bArr = null;
                                }
                                c10320b = new C10320b(bVar7.f47154y, bVar7.f47105A, bVar7.f47155z, bArr);
                            } else {
                                c10320b = null;
                            }
                            str9 = bVar7.f47130a;
                            if (str9 != null) {
                                map = C8982d.f47049h0;
                                if (map.containsKey(str9)) {
                                    iIntValue = map.get(bVar7.f47130a).intValue();
                                } else {
                                    iIntValue = i17;
                                }
                            } else {
                                iIntValue = i17;
                            }
                            if (bVar7.f47147r == 0) {
                                i19 = iIntValue;
                            } else {
                                i19 = iIntValue;
                            }
                            aVar.f12506p = bVar7.f47142m;
                            aVar.f12507q = bVar7.f47143n;
                            aVar.f12510t = f3;
                            aVar.f12509s = i19;
                            aVar.f12511u = bVar7.f47151v;
                            aVar.f12512v = bVar7.f47152w;
                            aVar.f12513w = c10320b;
                            i11 = 2;
                        } else {
                            if ("application/x-subrip".equals(str3)) {
                            }
                            i11 = i12;
                        }
                        str10 = bVar7.f47130a;
                        if (str10 != null) {
                            aVar.f12492b = bVar7.f47130a;
                        }
                        aVar.m7129b(i35);
                        aVar.f12501k = str3;
                        aVar.f12502l = i15;
                        aVar.f12493c = bVar7.f47127W;
                        aVar.f12494d = i31113;
                        aVar.f12503m = list4;
                        aVar.f12498h = str7;
                        aVar.f12504n = bVar7.f47141l;
                        C2416m c2416mM7128a14 = aVar.m7128a();
                        InterfaceC7522w interfaceC7522wMo7366q14 = interfaceC7509j2.mo7366q(bVar7.f47132c, i11);
                        bVar7.f47128X = interfaceC7522wMo7366q14;
                        interfaceC7522wMo7366q14.mo7388f(c2416mM7128a14);
                        sparseArray.put(bVar7.f47132c, bVar7);
                        c8982d = c8982d2;
                        bVar = null;
                        break;
                    case 10:
                        bVar7 = bVar7;
                        C10319a c10319aM19319a = C10319a.m19319a(new C10151t(bVar7.m17227a(bVar7.f47131b)));
                        bVar7.f47129Y = c10319aM19319a.f51886b;
                        str3 = "video/avc";
                        list3 = c10319aM19319a.f51885a;
                        str4 = c10319aM19319a.f51890f;
                        str6 = str4;
                        iM19054u = -1;
                        i11 = 1;
                        i12 = 3;
                        str7 = str6;
                        list4 = list3;
                        i15 = -1;
                        if (bVar7.f47118N != null) {
                            str7 = c10321cM19320a.f51901a;
                            str3 = "video/dolby-vision";
                        }
                        int i31114 = (bVar7.f47126V ? 1 : 0) | 0;
                        if (bVar7.f47125U) {
                            i16 = 2;
                        } else {
                            i16 = 0;
                        }
                        int i31115 = i31114 | i16;
                        aVar = new C2416m.a();
                        if (C10147p.m19109i(str3)) {
                            aVar.f12514x = bVar7.f47119O;
                            aVar.f12515y = bVar7.f47121Q;
                            aVar.f12516z = iM19054u;
                        } else if (C10147p.m19111k(str3)) {
                            if (bVar7.f47146q == 0) {
                                i21 = bVar7.f47144o;
                                i17 = -1;
                                if (i21 == -1) {
                                    i21 = bVar7.f47142m;
                                }
                                bVar7.f47144o = i21;
                                i22 = bVar7.f47145p;
                                if (i22 == -1) {
                                    i22 = bVar7.f47143n;
                                }
                                bVar7.f47145p = i22;
                            } else {
                                i17 = -1;
                            }
                            i18 = bVar7.f47144o;
                            if (i18 != i17) {
                                f3 = -1.0f;
                            } else {
                                f3 = -1.0f;
                            }
                            if (bVar7.f47153x) {
                                if (bVar7.f47108D != -1.0f) {
                                    bArr = null;
                                } else {
                                    bArr = null;
                                }
                                c10320b = new C10320b(bVar7.f47154y, bVar7.f47105A, bVar7.f47155z, bArr);
                            } else {
                                c10320b = null;
                            }
                            str9 = bVar7.f47130a;
                            if (str9 != null) {
                                map = C8982d.f47049h0;
                                if (map.containsKey(str9)) {
                                    iIntValue = map.get(bVar7.f47130a).intValue();
                                } else {
                                    iIntValue = i17;
                                }
                            } else {
                                iIntValue = i17;
                            }
                            if (bVar7.f47147r == 0) {
                                i19 = iIntValue;
                            } else {
                                i19 = iIntValue;
                            }
                            aVar.f12506p = bVar7.f47142m;
                            aVar.f12507q = bVar7.f47143n;
                            aVar.f12510t = f3;
                            aVar.f12509s = i19;
                            aVar.f12511u = bVar7.f47151v;
                            aVar.f12512v = bVar7.f47152w;
                            aVar.f12513w = c10320b;
                            i11 = 2;
                        } else {
                            if ("application/x-subrip".equals(str3)) {
                            }
                            i11 = i12;
                        }
                        str10 = bVar7.f47130a;
                        if (str10 != null) {
                            aVar.f12492b = bVar7.f47130a;
                        }
                        aVar.m7129b(i35);
                        aVar.f12501k = str3;
                        aVar.f12502l = i15;
                        aVar.f12493c = bVar7.f47127W;
                        aVar.f12494d = i31115;
                        aVar.f12503m = list4;
                        aVar.f12498h = str7;
                        aVar.f12504n = bVar7.f47141l;
                        C2416m c2416mM7128a15 = aVar.m7128a();
                        InterfaceC7522w interfaceC7522wMo7366q15 = interfaceC7509j2.mo7366q(bVar7.f47132c, i11);
                        bVar7.f47128X = interfaceC7522wMo7366q15;
                        interfaceC7522wMo7366q15.mo7388f(c2416mM7128a15);
                        sparseArray.put(bVar7.f47132c, bVar7);
                        c8982d = c8982d2;
                        bVar = null;
                        break;
                    case 11:
                        bVar7 = bVar7;
                        listM9064b0 = ImmutableList.m9064b0(bVar7.m17227a(bVar7.f47131b));
                        str13 = "application/vobsub";
                        list2 = listM9064b0;
                        listSingletonList = list2;
                        i11 = 1;
                        i12 = 3;
                        str5 = null;
                        str8 = str5;
                        list = listSingletonList;
                        str2 = str13;
                        i14 = -1;
                        str7 = str8;
                        list4 = list;
                        i15 = i14;
                        str3 = str2;
                        iM19054u = -1;
                        if (bVar7.f47118N != null) {
                            str7 = c10321cM19320a.f51901a;
                            str3 = "video/dolby-vision";
                        }
                        int i31116 = (bVar7.f47126V ? 1 : 0) | 0;
                        if (bVar7.f47125U) {
                            i16 = 2;
                        } else {
                            i16 = 0;
                        }
                        int i31117 = i31116 | i16;
                        aVar = new C2416m.a();
                        if (C10147p.m19109i(str3)) {
                            aVar.f12514x = bVar7.f47119O;
                            aVar.f12515y = bVar7.f47121Q;
                            aVar.f12516z = iM19054u;
                        } else if (C10147p.m19111k(str3)) {
                            if (bVar7.f47146q == 0) {
                                i21 = bVar7.f47144o;
                                i17 = -1;
                                if (i21 == -1) {
                                    i21 = bVar7.f47142m;
                                }
                                bVar7.f47144o = i21;
                                i22 = bVar7.f47145p;
                                if (i22 == -1) {
                                    i22 = bVar7.f47143n;
                                }
                                bVar7.f47145p = i22;
                            } else {
                                i17 = -1;
                            }
                            i18 = bVar7.f47144o;
                            if (i18 != i17) {
                                f3 = -1.0f;
                            } else {
                                f3 = -1.0f;
                            }
                            if (bVar7.f47153x) {
                                if (bVar7.f47108D != -1.0f) {
                                    bArr = null;
                                } else {
                                    bArr = null;
                                }
                                c10320b = new C10320b(bVar7.f47154y, bVar7.f47105A, bVar7.f47155z, bArr);
                            } else {
                                c10320b = null;
                            }
                            str9 = bVar7.f47130a;
                            if (str9 != null) {
                                map = C8982d.f47049h0;
                                if (map.containsKey(str9)) {
                                    iIntValue = map.get(bVar7.f47130a).intValue();
                                } else {
                                    iIntValue = i17;
                                }
                            } else {
                                iIntValue = i17;
                            }
                            if (bVar7.f47147r == 0) {
                                i19 = iIntValue;
                            } else {
                                i19 = iIntValue;
                            }
                            aVar.f12506p = bVar7.f47142m;
                            aVar.f12507q = bVar7.f47143n;
                            aVar.f12510t = f3;
                            aVar.f12509s = i19;
                            aVar.f12511u = bVar7.f47151v;
                            aVar.f12512v = bVar7.f47152w;
                            aVar.f12513w = c10320b;
                            i11 = 2;
                        } else {
                            if ("application/x-subrip".equals(str3)) {
                            }
                            i11 = i12;
                        }
                        str10 = bVar7.f47130a;
                        if (str10 != null) {
                            aVar.f12492b = bVar7.f47130a;
                        }
                        aVar.m7129b(i35);
                        aVar.f12501k = str3;
                        aVar.f12502l = i15;
                        aVar.f12493c = bVar7.f47127W;
                        aVar.f12494d = i31117;
                        aVar.f12503m = list4;
                        aVar.f12498h = str7;
                        aVar.f12504n = bVar7.f47141l;
                        C2416m c2416mM7128a16 = aVar.m7128a();
                        InterfaceC7522w interfaceC7522wMo7366q16 = interfaceC7509j2.mo7366q(bVar7.f47132c, i11);
                        bVar7.f47128X = interfaceC7522wMo7366q16;
                        interfaceC7522wMo7366q16.mo7388f(c2416mM7128a16);
                        sparseArray.put(bVar7.f47132c, bVar7);
                        c8982d = c8982d2;
                        bVar = null;
                        break;
                    case 12:
                        str13 = "audio/vnd.dts.hd";
                        i12 = 3;
                        i11 = 1;
                        listSingletonList = null;
                        str5 = null;
                        str8 = str5;
                        list = listSingletonList;
                        str2 = str13;
                        i14 = -1;
                        str7 = str8;
                        list4 = list;
                        i15 = i14;
                        str3 = str2;
                        iM19054u = -1;
                        if (bVar7.f47118N != null) {
                            str7 = c10321cM19320a.f51901a;
                            str3 = "video/dolby-vision";
                        }
                        int i31118 = (bVar7.f47126V ? 1 : 0) | 0;
                        if (bVar7.f47125U) {
                            i16 = 2;
                        } else {
                            i16 = 0;
                        }
                        int i31119 = i31118 | i16;
                        aVar = new C2416m.a();
                        if (C10147p.m19109i(str3)) {
                            aVar.f12514x = bVar7.f47119O;
                            aVar.f12515y = bVar7.f47121Q;
                            aVar.f12516z = iM19054u;
                        } else if (C10147p.m19111k(str3)) {
                            if (bVar7.f47146q == 0) {
                                i21 = bVar7.f47144o;
                                i17 = -1;
                                if (i21 == -1) {
                                    i21 = bVar7.f47142m;
                                }
                                bVar7.f47144o = i21;
                                i22 = bVar7.f47145p;
                                if (i22 == -1) {
                                    i22 = bVar7.f47143n;
                                }
                                bVar7.f47145p = i22;
                            } else {
                                i17 = -1;
                            }
                            i18 = bVar7.f47144o;
                            if (i18 != i17) {
                                f3 = -1.0f;
                            } else {
                                f3 = -1.0f;
                            }
                            if (bVar7.f47153x) {
                                if (bVar7.f47108D != -1.0f) {
                                    bArr = null;
                                } else {
                                    bArr = null;
                                }
                                c10320b = new C10320b(bVar7.f47154y, bVar7.f47105A, bVar7.f47155z, bArr);
                            } else {
                                c10320b = null;
                            }
                            str9 = bVar7.f47130a;
                            if (str9 != null) {
                                map = C8982d.f47049h0;
                                if (map.containsKey(str9)) {
                                    iIntValue = map.get(bVar7.f47130a).intValue();
                                } else {
                                    iIntValue = i17;
                                }
                            } else {
                                iIntValue = i17;
                            }
                            if (bVar7.f47147r == 0) {
                                i19 = iIntValue;
                            } else {
                                i19 = iIntValue;
                            }
                            aVar.f12506p = bVar7.f47142m;
                            aVar.f12507q = bVar7.f47143n;
                            aVar.f12510t = f3;
                            aVar.f12509s = i19;
                            aVar.f12511u = bVar7.f47151v;
                            aVar.f12512v = bVar7.f47152w;
                            aVar.f12513w = c10320b;
                            i11 = 2;
                        } else {
                            if ("application/x-subrip".equals(str3)) {
                            }
                            i11 = i12;
                        }
                        str10 = bVar7.f47130a;
                        if (str10 != null) {
                            aVar.f12492b = bVar7.f47130a;
                        }
                        aVar.m7129b(i35);
                        aVar.f12501k = str3;
                        aVar.f12502l = i15;
                        aVar.f12493c = bVar7.f47127W;
                        aVar.f12494d = i31119;
                        aVar.f12503m = list4;
                        aVar.f12498h = str7;
                        aVar.f12504n = bVar7.f47141l;
                        C2416m c2416mM7128a17 = aVar.m7128a();
                        InterfaceC7522w interfaceC7522wMo7366q17 = interfaceC7509j2.mo7366q(bVar7.f47132c, i11);
                        bVar7.f47128X = interfaceC7522wMo7366q17;
                        interfaceC7522wMo7366q17.mo7388f(c2416mM7128a17);
                        sparseArray.put(bVar7.f47132c, bVar7);
                        c8982d = c8982d2;
                        bVar = null;
                        break;
                    case 13:
                        bVar7 = bVar7;
                        listSingletonList = Collections.singletonList(bVar7.m17227a(bVar7.f47131b));
                        byte[] bArr7 = bVar7.f47140k;
                        C6424a.a aVarM13046b = C6424a.m13046b(new C8739a(bArr7, bArr7.length), false);
                        bVar7.f47121Q = aVarM13046b.f36903a;
                        bVar7.f47119O = aVarM13046b.f36904b;
                        str13 = "audio/mp4a-latm";
                        str5 = aVarM13046b.f36905c;
                        i11 = 1;
                        i12 = 3;
                        str8 = str5;
                        list = listSingletonList;
                        str2 = str13;
                        i14 = -1;
                        str7 = str8;
                        list4 = list;
                        i15 = i14;
                        str3 = str2;
                        iM19054u = -1;
                        if (bVar7.f47118N != null) {
                            str7 = c10321cM19320a.f51901a;
                            str3 = "video/dolby-vision";
                        }
                        int i311110 = (bVar7.f47126V ? 1 : 0) | 0;
                        if (bVar7.f47125U) {
                            i16 = 2;
                        } else {
                            i16 = 0;
                        }
                        int i311111 = i311110 | i16;
                        aVar = new C2416m.a();
                        if (C10147p.m19109i(str3)) {
                            aVar.f12514x = bVar7.f47119O;
                            aVar.f12515y = bVar7.f47121Q;
                            aVar.f12516z = iM19054u;
                        } else if (C10147p.m19111k(str3)) {
                            if (bVar7.f47146q == 0) {
                                i21 = bVar7.f47144o;
                                i17 = -1;
                                if (i21 == -1) {
                                    i21 = bVar7.f47142m;
                                }
                                bVar7.f47144o = i21;
                                i22 = bVar7.f47145p;
                                if (i22 == -1) {
                                    i22 = bVar7.f47143n;
                                }
                                bVar7.f47145p = i22;
                            } else {
                                i17 = -1;
                            }
                            i18 = bVar7.f47144o;
                            if (i18 != i17) {
                                f3 = -1.0f;
                            } else {
                                f3 = -1.0f;
                            }
                            if (bVar7.f47153x) {
                                if (bVar7.f47108D != -1.0f) {
                                    bArr = null;
                                } else {
                                    bArr = null;
                                }
                                c10320b = new C10320b(bVar7.f47154y, bVar7.f47105A, bVar7.f47155z, bArr);
                            } else {
                                c10320b = null;
                            }
                            str9 = bVar7.f47130a;
                            if (str9 != null) {
                                map = C8982d.f47049h0;
                                if (map.containsKey(str9)) {
                                    iIntValue = map.get(bVar7.f47130a).intValue();
                                } else {
                                    iIntValue = i17;
                                }
                            } else {
                                iIntValue = i17;
                            }
                            if (bVar7.f47147r == 0) {
                                i19 = iIntValue;
                            } else {
                                i19 = iIntValue;
                            }
                            aVar.f12506p = bVar7.f47142m;
                            aVar.f12507q = bVar7.f47143n;
                            aVar.f12510t = f3;
                            aVar.f12509s = i19;
                            aVar.f12511u = bVar7.f47151v;
                            aVar.f12512v = bVar7.f47152w;
                            aVar.f12513w = c10320b;
                            i11 = 2;
                        } else {
                            if ("application/x-subrip".equals(str3)) {
                            }
                            i11 = i12;
                        }
                        str10 = bVar7.f47130a;
                        if (str10 != null) {
                            aVar.f12492b = bVar7.f47130a;
                        }
                        aVar.m7129b(i35);
                        aVar.f12501k = str3;
                        aVar.f12502l = i15;
                        aVar.f12493c = bVar7.f47127W;
                        aVar.f12494d = i311111;
                        aVar.f12503m = list4;
                        aVar.f12498h = str7;
                        aVar.f12504n = bVar7.f47141l;
                        C2416m c2416mM7128a18 = aVar.m7128a();
                        InterfaceC7522w interfaceC7522wMo7366q18 = interfaceC7509j2.mo7366q(bVar7.f47132c, i11);
                        bVar7.f47128X = interfaceC7522wMo7366q18;
                        interfaceC7522wMo7366q18.mo7388f(c2416mM7128a18);
                        sparseArray.put(bVar7.f47132c, bVar7);
                        c8982d = c8982d2;
                        bVar = null;
                        break;
                    case 14:
                        str13 = "audio/ac3";
                        i12 = 3;
                        i11 = 1;
                        listSingletonList = null;
                        str5 = null;
                        str8 = str5;
                        list = listSingletonList;
                        str2 = str13;
                        i14 = -1;
                        str7 = str8;
                        list4 = list;
                        i15 = i14;
                        str3 = str2;
                        iM19054u = -1;
                        if (bVar7.f47118N != null) {
                            str7 = c10321cM19320a.f51901a;
                            str3 = "video/dolby-vision";
                        }
                        int i311112 = (bVar7.f47126V ? 1 : 0) | 0;
                        if (bVar7.f47125U) {
                            i16 = 2;
                        } else {
                            i16 = 0;
                        }
                        int i311113 = i311112 | i16;
                        aVar = new C2416m.a();
                        if (C10147p.m19109i(str3)) {
                            aVar.f12514x = bVar7.f47119O;
                            aVar.f12515y = bVar7.f47121Q;
                            aVar.f12516z = iM19054u;
                        } else if (C10147p.m19111k(str3)) {
                            if (bVar7.f47146q == 0) {
                                i21 = bVar7.f47144o;
                                i17 = -1;
                                if (i21 == -1) {
                                    i21 = bVar7.f47142m;
                                }
                                bVar7.f47144o = i21;
                                i22 = bVar7.f47145p;
                                if (i22 == -1) {
                                    i22 = bVar7.f47143n;
                                }
                                bVar7.f47145p = i22;
                            } else {
                                i17 = -1;
                            }
                            i18 = bVar7.f47144o;
                            if (i18 != i17) {
                                f3 = -1.0f;
                            } else {
                                f3 = -1.0f;
                            }
                            if (bVar7.f47153x) {
                                if (bVar7.f47108D != -1.0f) {
                                    bArr = null;
                                } else {
                                    bArr = null;
                                }
                                c10320b = new C10320b(bVar7.f47154y, bVar7.f47105A, bVar7.f47155z, bArr);
                            } else {
                                c10320b = null;
                            }
                            str9 = bVar7.f47130a;
                            if (str9 != null) {
                                map = C8982d.f47049h0;
                                if (map.containsKey(str9)) {
                                    iIntValue = map.get(bVar7.f47130a).intValue();
                                } else {
                                    iIntValue = i17;
                                }
                            } else {
                                iIntValue = i17;
                            }
                            if (bVar7.f47147r == 0) {
                                i19 = iIntValue;
                            } else {
                                i19 = iIntValue;
                            }
                            aVar.f12506p = bVar7.f47142m;
                            aVar.f12507q = bVar7.f47143n;
                            aVar.f12510t = f3;
                            aVar.f12509s = i19;
                            aVar.f12511u = bVar7.f47151v;
                            aVar.f12512v = bVar7.f47152w;
                            aVar.f12513w = c10320b;
                            i11 = 2;
                        } else {
                            if ("application/x-subrip".equals(str3)) {
                            }
                            i11 = i12;
                        }
                        str10 = bVar7.f47130a;
                        if (str10 != null) {
                            aVar.f12492b = bVar7.f47130a;
                        }
                        aVar.m7129b(i35);
                        aVar.f12501k = str3;
                        aVar.f12502l = i15;
                        aVar.f12493c = bVar7.f47127W;
                        aVar.f12494d = i311113;
                        aVar.f12503m = list4;
                        aVar.f12498h = str7;
                        aVar.f12504n = bVar7.f47141l;
                        C2416m c2416mM7128a19 = aVar.m7128a();
                        InterfaceC7522w interfaceC7522wMo7366q19 = interfaceC7509j2.mo7366q(bVar7.f47132c, i11);
                        bVar7.f47128X = interfaceC7522wMo7366q19;
                        interfaceC7522wMo7366q19.mo7388f(c2416mM7128a19);
                        sparseArray.put(bVar7.f47132c, bVar7);
                        c8982d = c8982d2;
                        bVar = null;
                        break;
                    case 15:
                    case 21:
                        str13 = "audio/vnd.dts";
                        i12 = 3;
                        i11 = 1;
                        listSingletonList = null;
                        str5 = null;
                        str8 = str5;
                        list = listSingletonList;
                        str2 = str13;
                        i14 = -1;
                        str7 = str8;
                        list4 = list;
                        i15 = i14;
                        str3 = str2;
                        iM19054u = -1;
                        if (bVar7.f47118N != null) {
                            str7 = c10321cM19320a.f51901a;
                            str3 = "video/dolby-vision";
                        }
                        int i311114 = (bVar7.f47126V ? 1 : 0) | 0;
                        if (bVar7.f47125U) {
                            i16 = 2;
                        } else {
                            i16 = 0;
                        }
                        int i311115 = i311114 | i16;
                        aVar = new C2416m.a();
                        if (C10147p.m19109i(str3)) {
                            aVar.f12514x = bVar7.f47119O;
                            aVar.f12515y = bVar7.f47121Q;
                            aVar.f12516z = iM19054u;
                        } else if (C10147p.m19111k(str3)) {
                            if (bVar7.f47146q == 0) {
                                i21 = bVar7.f47144o;
                                i17 = -1;
                                if (i21 == -1) {
                                    i21 = bVar7.f47142m;
                                }
                                bVar7.f47144o = i21;
                                i22 = bVar7.f47145p;
                                if (i22 == -1) {
                                    i22 = bVar7.f47143n;
                                }
                                bVar7.f47145p = i22;
                            } else {
                                i17 = -1;
                            }
                            i18 = bVar7.f47144o;
                            if (i18 != i17) {
                                f3 = -1.0f;
                            } else {
                                f3 = -1.0f;
                            }
                            if (bVar7.f47153x) {
                                if (bVar7.f47108D != -1.0f) {
                                    bArr = null;
                                } else {
                                    bArr = null;
                                }
                                c10320b = new C10320b(bVar7.f47154y, bVar7.f47105A, bVar7.f47155z, bArr);
                            } else {
                                c10320b = null;
                            }
                            str9 = bVar7.f47130a;
                            if (str9 != null) {
                                map = C8982d.f47049h0;
                                if (map.containsKey(str9)) {
                                    iIntValue = map.get(bVar7.f47130a).intValue();
                                } else {
                                    iIntValue = i17;
                                }
                            } else {
                                iIntValue = i17;
                            }
                            if (bVar7.f47147r == 0) {
                                i19 = iIntValue;
                            } else {
                                i19 = iIntValue;
                            }
                            aVar.f12506p = bVar7.f47142m;
                            aVar.f12507q = bVar7.f47143n;
                            aVar.f12510t = f3;
                            aVar.f12509s = i19;
                            aVar.f12511u = bVar7.f47151v;
                            aVar.f12512v = bVar7.f47152w;
                            aVar.f12513w = c10320b;
                            i11 = 2;
                        } else {
                            if ("application/x-subrip".equals(str3)) {
                            }
                            i11 = i12;
                        }
                        str10 = bVar7.f47130a;
                        if (str10 != null) {
                            aVar.f12492b = bVar7.f47130a;
                        }
                        aVar.m7129b(i35);
                        aVar.f12501k = str3;
                        aVar.f12502l = i15;
                        aVar.f12493c = bVar7.f47127W;
                        aVar.f12494d = i311115;
                        aVar.f12503m = list4;
                        aVar.f12498h = str7;
                        aVar.f12504n = bVar7.f47141l;
                        C2416m c2416mM7128a110 = aVar.m7128a();
                        InterfaceC7522w interfaceC7522wMo7366q110 = interfaceC7509j2.mo7366q(bVar7.f47132c, i11);
                        bVar7.f47128X = interfaceC7522wMo7366q110;
                        interfaceC7522wMo7366q110.mo7388f(c2416mM7128a110);
                        sparseArray.put(bVar7.f47132c, bVar7);
                        c8982d = c8982d2;
                        bVar = null;
                        break;
                    case 16:
                        str13 = "video/av01";
                        i12 = 3;
                        i11 = 1;
                        listSingletonList = null;
                        str5 = null;
                        str8 = str5;
                        list = listSingletonList;
                        str2 = str13;
                        i14 = -1;
                        str7 = str8;
                        list4 = list;
                        i15 = i14;
                        str3 = str2;
                        iM19054u = -1;
                        if (bVar7.f47118N != null) {
                            str7 = c10321cM19320a.f51901a;
                            str3 = "video/dolby-vision";
                        }
                        int i311116 = (bVar7.f47126V ? 1 : 0) | 0;
                        if (bVar7.f47125U) {
                            i16 = 2;
                        } else {
                            i16 = 0;
                        }
                        int i311117 = i311116 | i16;
                        aVar = new C2416m.a();
                        if (C10147p.m19109i(str3)) {
                            aVar.f12514x = bVar7.f47119O;
                            aVar.f12515y = bVar7.f47121Q;
                            aVar.f12516z = iM19054u;
                        } else if (C10147p.m19111k(str3)) {
                            if (bVar7.f47146q == 0) {
                                i21 = bVar7.f47144o;
                                i17 = -1;
                                if (i21 == -1) {
                                    i21 = bVar7.f47142m;
                                }
                                bVar7.f47144o = i21;
                                i22 = bVar7.f47145p;
                                if (i22 == -1) {
                                    i22 = bVar7.f47143n;
                                }
                                bVar7.f47145p = i22;
                            } else {
                                i17 = -1;
                            }
                            i18 = bVar7.f47144o;
                            if (i18 != i17) {
                                f3 = -1.0f;
                            } else {
                                f3 = -1.0f;
                            }
                            if (bVar7.f47153x) {
                                if (bVar7.f47108D != -1.0f) {
                                    bArr = null;
                                } else {
                                    bArr = null;
                                }
                                c10320b = new C10320b(bVar7.f47154y, bVar7.f47105A, bVar7.f47155z, bArr);
                            } else {
                                c10320b = null;
                            }
                            str9 = bVar7.f47130a;
                            if (str9 != null) {
                                map = C8982d.f47049h0;
                                if (map.containsKey(str9)) {
                                    iIntValue = map.get(bVar7.f47130a).intValue();
                                } else {
                                    iIntValue = i17;
                                }
                            } else {
                                iIntValue = i17;
                            }
                            if (bVar7.f47147r == 0) {
                                i19 = iIntValue;
                            } else {
                                i19 = iIntValue;
                            }
                            aVar.f12506p = bVar7.f47142m;
                            aVar.f12507q = bVar7.f47143n;
                            aVar.f12510t = f3;
                            aVar.f12509s = i19;
                            aVar.f12511u = bVar7.f47151v;
                            aVar.f12512v = bVar7.f47152w;
                            aVar.f12513w = c10320b;
                            i11 = 2;
                        } else {
                            if ("application/x-subrip".equals(str3)) {
                            }
                            i11 = i12;
                        }
                        str10 = bVar7.f47130a;
                        if (str10 != null) {
                            aVar.f12492b = bVar7.f47130a;
                        }
                        aVar.m7129b(i35);
                        aVar.f12501k = str3;
                        aVar.f12502l = i15;
                        aVar.f12493c = bVar7.f47127W;
                        aVar.f12494d = i311117;
                        aVar.f12503m = list4;
                        aVar.f12498h = str7;
                        aVar.f12504n = bVar7.f47141l;
                        C2416m c2416mM7128a111 = aVar.m7128a();
                        InterfaceC7522w interfaceC7522wMo7366q111 = interfaceC7509j2.mo7366q(bVar7.f47132c, i11);
                        bVar7.f47128X = interfaceC7522wMo7366q111;
                        interfaceC7522wMo7366q111.mo7388f(c2416mM7128a111);
                        sparseArray.put(bVar7.f47132c, bVar7);
                        c8982d = c8982d2;
                        bVar = null;
                        break;
                    case 17:
                        str13 = "video/x-vnd.on2.vp8";
                        i12 = 3;
                        i11 = 1;
                        listSingletonList = null;
                        str5 = null;
                        str8 = str5;
                        list = listSingletonList;
                        str2 = str13;
                        i14 = -1;
                        str7 = str8;
                        list4 = list;
                        i15 = i14;
                        str3 = str2;
                        iM19054u = -1;
                        if (bVar7.f47118N != null) {
                            str7 = c10321cM19320a.f51901a;
                            str3 = "video/dolby-vision";
                        }
                        int i311118 = (bVar7.f47126V ? 1 : 0) | 0;
                        if (bVar7.f47125U) {
                            i16 = 2;
                        } else {
                            i16 = 0;
                        }
                        int i311119 = i311118 | i16;
                        aVar = new C2416m.a();
                        if (C10147p.m19109i(str3)) {
                            aVar.f12514x = bVar7.f47119O;
                            aVar.f12515y = bVar7.f47121Q;
                            aVar.f12516z = iM19054u;
                        } else if (C10147p.m19111k(str3)) {
                            if (bVar7.f47146q == 0) {
                                i21 = bVar7.f47144o;
                                i17 = -1;
                                if (i21 == -1) {
                                    i21 = bVar7.f47142m;
                                }
                                bVar7.f47144o = i21;
                                i22 = bVar7.f47145p;
                                if (i22 == -1) {
                                    i22 = bVar7.f47143n;
                                }
                                bVar7.f47145p = i22;
                            } else {
                                i17 = -1;
                            }
                            i18 = bVar7.f47144o;
                            if (i18 != i17) {
                                f3 = -1.0f;
                            } else {
                                f3 = -1.0f;
                            }
                            if (bVar7.f47153x) {
                                if (bVar7.f47108D != -1.0f) {
                                    bArr = null;
                                } else {
                                    bArr = null;
                                }
                                c10320b = new C10320b(bVar7.f47154y, bVar7.f47105A, bVar7.f47155z, bArr);
                            } else {
                                c10320b = null;
                            }
                            str9 = bVar7.f47130a;
                            if (str9 != null) {
                                map = C8982d.f47049h0;
                                if (map.containsKey(str9)) {
                                    iIntValue = map.get(bVar7.f47130a).intValue();
                                } else {
                                    iIntValue = i17;
                                }
                            } else {
                                iIntValue = i17;
                            }
                            if (bVar7.f47147r == 0) {
                                i19 = iIntValue;
                            } else {
                                i19 = iIntValue;
                            }
                            aVar.f12506p = bVar7.f47142m;
                            aVar.f12507q = bVar7.f47143n;
                            aVar.f12510t = f3;
                            aVar.f12509s = i19;
                            aVar.f12511u = bVar7.f47151v;
                            aVar.f12512v = bVar7.f47152w;
                            aVar.f12513w = c10320b;
                            i11 = 2;
                        } else {
                            if ("application/x-subrip".equals(str3)) {
                            }
                            i11 = i12;
                        }
                        str10 = bVar7.f47130a;
                        if (str10 != null) {
                            aVar.f12492b = bVar7.f47130a;
                        }
                        aVar.m7129b(i35);
                        aVar.f12501k = str3;
                        aVar.f12502l = i15;
                        aVar.f12493c = bVar7.f47127W;
                        aVar.f12494d = i311119;
                        aVar.f12503m = list4;
                        aVar.f12498h = str7;
                        aVar.f12504n = bVar7.f47141l;
                        C2416m c2416mM7128a112 = aVar.m7128a();
                        InterfaceC7522w interfaceC7522wMo7366q112 = interfaceC7509j2.mo7366q(bVar7.f47132c, i11);
                        bVar7.f47128X = interfaceC7522wMo7366q112;
                        interfaceC7522wMo7366q112.mo7388f(c2416mM7128a112);
                        sparseArray.put(bVar7.f47132c, bVar7);
                        c8982d = c8982d2;
                        bVar = null;
                        break;
                    case 18:
                        str13 = "video/x-vnd.on2.vp9";
                        i12 = 3;
                        i11 = 1;
                        listSingletonList = null;
                        str5 = null;
                        str8 = str5;
                        list = listSingletonList;
                        str2 = str13;
                        i14 = -1;
                        str7 = str8;
                        list4 = list;
                        i15 = i14;
                        str3 = str2;
                        iM19054u = -1;
                        if (bVar7.f47118N != null) {
                            str7 = c10321cM19320a.f51901a;
                            str3 = "video/dolby-vision";
                        }
                        int i3111110 = (bVar7.f47126V ? 1 : 0) | 0;
                        if (bVar7.f47125U) {
                            i16 = 2;
                        } else {
                            i16 = 0;
                        }
                        int i3111111 = i3111110 | i16;
                        aVar = new C2416m.a();
                        if (C10147p.m19109i(str3)) {
                            aVar.f12514x = bVar7.f47119O;
                            aVar.f12515y = bVar7.f47121Q;
                            aVar.f12516z = iM19054u;
                        } else if (C10147p.m19111k(str3)) {
                            if (bVar7.f47146q == 0) {
                                i21 = bVar7.f47144o;
                                i17 = -1;
                                if (i21 == -1) {
                                    i21 = bVar7.f47142m;
                                }
                                bVar7.f47144o = i21;
                                i22 = bVar7.f47145p;
                                if (i22 == -1) {
                                    i22 = bVar7.f47143n;
                                }
                                bVar7.f47145p = i22;
                            } else {
                                i17 = -1;
                            }
                            i18 = bVar7.f47144o;
                            if (i18 != i17) {
                                f3 = -1.0f;
                            } else {
                                f3 = -1.0f;
                            }
                            if (bVar7.f47153x) {
                                if (bVar7.f47108D != -1.0f) {
                                    bArr = null;
                                } else {
                                    bArr = null;
                                }
                                c10320b = new C10320b(bVar7.f47154y, bVar7.f47105A, bVar7.f47155z, bArr);
                            } else {
                                c10320b = null;
                            }
                            str9 = bVar7.f47130a;
                            if (str9 != null) {
                                map = C8982d.f47049h0;
                                if (map.containsKey(str9)) {
                                    iIntValue = map.get(bVar7.f47130a).intValue();
                                } else {
                                    iIntValue = i17;
                                }
                            } else {
                                iIntValue = i17;
                            }
                            if (bVar7.f47147r == 0) {
                                i19 = iIntValue;
                            } else {
                                i19 = iIntValue;
                            }
                            aVar.f12506p = bVar7.f47142m;
                            aVar.f12507q = bVar7.f47143n;
                            aVar.f12510t = f3;
                            aVar.f12509s = i19;
                            aVar.f12511u = bVar7.f47151v;
                            aVar.f12512v = bVar7.f47152w;
                            aVar.f12513w = c10320b;
                            i11 = 2;
                        } else {
                            if ("application/x-subrip".equals(str3)) {
                            }
                            i11 = i12;
                        }
                        str10 = bVar7.f47130a;
                        if (str10 != null) {
                            aVar.f12492b = bVar7.f47130a;
                        }
                        aVar.m7129b(i35);
                        aVar.f12501k = str3;
                        aVar.f12502l = i15;
                        aVar.f12493c = bVar7.f47127W;
                        aVar.f12494d = i3111111;
                        aVar.f12503m = list4;
                        aVar.f12498h = str7;
                        aVar.f12504n = bVar7.f47141l;
                        C2416m c2416mM7128a113 = aVar.m7128a();
                        InterfaceC7522w interfaceC7522wMo7366q113 = interfaceC7509j2.mo7366q(bVar7.f47132c, i11);
                        bVar7.f47128X = interfaceC7522wMo7366q113;
                        interfaceC7522wMo7366q113.mo7388f(c2416mM7128a113);
                        sparseArray.put(bVar7.f47132c, bVar7);
                        c8982d = c8982d2;
                        bVar = null;
                        break;
                    case 19:
                        str13 = "application/pgs";
                        i12 = 3;
                        i11 = 1;
                        listSingletonList = null;
                        str5 = null;
                        str8 = str5;
                        list = listSingletonList;
                        str2 = str13;
                        i14 = -1;
                        str7 = str8;
                        list4 = list;
                        i15 = i14;
                        str3 = str2;
                        iM19054u = -1;
                        if (bVar7.f47118N != null) {
                            str7 = c10321cM19320a.f51901a;
                            str3 = "video/dolby-vision";
                        }
                        int i3111112 = (bVar7.f47126V ? 1 : 0) | 0;
                        if (bVar7.f47125U) {
                            i16 = 2;
                        } else {
                            i16 = 0;
                        }
                        int i3111113 = i3111112 | i16;
                        aVar = new C2416m.a();
                        if (C10147p.m19109i(str3)) {
                            aVar.f12514x = bVar7.f47119O;
                            aVar.f12515y = bVar7.f47121Q;
                            aVar.f12516z = iM19054u;
                        } else if (C10147p.m19111k(str3)) {
                            if (bVar7.f47146q == 0) {
                                i21 = bVar7.f47144o;
                                i17 = -1;
                                if (i21 == -1) {
                                    i21 = bVar7.f47142m;
                                }
                                bVar7.f47144o = i21;
                                i22 = bVar7.f47145p;
                                if (i22 == -1) {
                                    i22 = bVar7.f47143n;
                                }
                                bVar7.f47145p = i22;
                            } else {
                                i17 = -1;
                            }
                            i18 = bVar7.f47144o;
                            if (i18 != i17) {
                                f3 = -1.0f;
                            } else {
                                f3 = -1.0f;
                            }
                            if (bVar7.f47153x) {
                                if (bVar7.f47108D != -1.0f) {
                                    bArr = null;
                                } else {
                                    bArr = null;
                                }
                                c10320b = new C10320b(bVar7.f47154y, bVar7.f47105A, bVar7.f47155z, bArr);
                            } else {
                                c10320b = null;
                            }
                            str9 = bVar7.f47130a;
                            if (str9 != null) {
                                map = C8982d.f47049h0;
                                if (map.containsKey(str9)) {
                                    iIntValue = map.get(bVar7.f47130a).intValue();
                                } else {
                                    iIntValue = i17;
                                }
                            } else {
                                iIntValue = i17;
                            }
                            if (bVar7.f47147r == 0) {
                                i19 = iIntValue;
                            } else {
                                i19 = iIntValue;
                            }
                            aVar.f12506p = bVar7.f47142m;
                            aVar.f12507q = bVar7.f47143n;
                            aVar.f12510t = f3;
                            aVar.f12509s = i19;
                            aVar.f12511u = bVar7.f47151v;
                            aVar.f12512v = bVar7.f47152w;
                            aVar.f12513w = c10320b;
                            i11 = 2;
                        } else {
                            if ("application/x-subrip".equals(str3)) {
                            }
                            i11 = i12;
                        }
                        str10 = bVar7.f47130a;
                        if (str10 != null) {
                            aVar.f12492b = bVar7.f47130a;
                        }
                        aVar.m7129b(i35);
                        aVar.f12501k = str3;
                        aVar.f12502l = i15;
                        aVar.f12493c = bVar7.f47127W;
                        aVar.f12494d = i3111113;
                        aVar.f12503m = list4;
                        aVar.f12498h = str7;
                        aVar.f12504n = bVar7.f47141l;
                        C2416m c2416mM7128a114 = aVar.m7128a();
                        InterfaceC7522w interfaceC7522wMo7366q114 = interfaceC7509j2.mo7366q(bVar7.f47132c, i11);
                        bVar7.f47128X = interfaceC7522wMo7366q114;
                        interfaceC7522wMo7366q114.mo7388f(c2416mM7128a114);
                        sparseArray.put(bVar7.f47132c, bVar7);
                        c8982d = c8982d2;
                        bVar = null;
                        break;
                    case 20:
                        i12 = 3;
                        i11 = 1;
                        listSingletonList = null;
                        str5 = null;
                        str8 = str5;
                        list = listSingletonList;
                        str2 = str13;
                        i14 = -1;
                        str7 = str8;
                        list4 = list;
                        i15 = i14;
                        str3 = str2;
                        iM19054u = -1;
                        if (bVar7.f47118N != null) {
                            str7 = c10321cM19320a.f51901a;
                            str3 = "video/dolby-vision";
                        }
                        int i3111114 = (bVar7.f47126V ? 1 : 0) | 0;
                        if (bVar7.f47125U) {
                            i16 = 2;
                        } else {
                            i16 = 0;
                        }
                        int i3111115 = i3111114 | i16;
                        aVar = new C2416m.a();
                        if (C10147p.m19109i(str3)) {
                            aVar.f12514x = bVar7.f47119O;
                            aVar.f12515y = bVar7.f47121Q;
                            aVar.f12516z = iM19054u;
                        } else if (C10147p.m19111k(str3)) {
                            if (bVar7.f47146q == 0) {
                                i21 = bVar7.f47144o;
                                i17 = -1;
                                if (i21 == -1) {
                                    i21 = bVar7.f47142m;
                                }
                                bVar7.f47144o = i21;
                                i22 = bVar7.f47145p;
                                if (i22 == -1) {
                                    i22 = bVar7.f47143n;
                                }
                                bVar7.f47145p = i22;
                            } else {
                                i17 = -1;
                            }
                            i18 = bVar7.f47144o;
                            if (i18 != i17) {
                                f3 = -1.0f;
                            } else {
                                f3 = -1.0f;
                            }
                            if (bVar7.f47153x) {
                                if (bVar7.f47108D != -1.0f) {
                                    bArr = null;
                                } else {
                                    bArr = null;
                                }
                                c10320b = new C10320b(bVar7.f47154y, bVar7.f47105A, bVar7.f47155z, bArr);
                            } else {
                                c10320b = null;
                            }
                            str9 = bVar7.f47130a;
                            if (str9 != null) {
                                map = C8982d.f47049h0;
                                if (map.containsKey(str9)) {
                                    iIntValue = map.get(bVar7.f47130a).intValue();
                                } else {
                                    iIntValue = i17;
                                }
                            } else {
                                iIntValue = i17;
                            }
                            if (bVar7.f47147r == 0) {
                                i19 = iIntValue;
                            } else {
                                i19 = iIntValue;
                            }
                            aVar.f12506p = bVar7.f47142m;
                            aVar.f12507q = bVar7.f47143n;
                            aVar.f12510t = f3;
                            aVar.f12509s = i19;
                            aVar.f12511u = bVar7.f47151v;
                            aVar.f12512v = bVar7.f47152w;
                            aVar.f12513w = c10320b;
                            i11 = 2;
                        } else {
                            if ("application/x-subrip".equals(str3)) {
                            }
                            i11 = i12;
                        }
                        str10 = bVar7.f47130a;
                        if (str10 != null) {
                            aVar.f12492b = bVar7.f47130a;
                        }
                        aVar.m7129b(i35);
                        aVar.f12501k = str3;
                        aVar.f12502l = i15;
                        aVar.f12493c = bVar7.f47127W;
                        aVar.f12494d = i3111115;
                        aVar.f12503m = list4;
                        aVar.f12498h = str7;
                        aVar.f12504n = bVar7.f47141l;
                        C2416m c2416mM7128a115 = aVar.m7128a();
                        InterfaceC7522w interfaceC7522wMo7366q115 = interfaceC7509j2.mo7366q(bVar7.f47132c, i11);
                        bVar7.f47128X = interfaceC7522wMo7366q115;
                        interfaceC7522wMo7366q115.mo7388f(c2416mM7128a115);
                        sparseArray.put(bVar7.f47132c, bVar7);
                        c8982d = c8982d2;
                        bVar = null;
                        break;
                    case 22:
                        bVar7 = bVar7;
                        if (bVar7.f47120P == 32) {
                            iM19054u = 4;
                            i11 = 1;
                            i12 = 3;
                            str3 = "audio/raw";
                            list3 = null;
                            str6 = null;
                            str7 = str6;
                            list4 = list3;
                            i15 = -1;
                            if (bVar7.f47118N != null) {
                                str7 = c10321cM19320a.f51901a;
                                str3 = "video/dolby-vision";
                            }
                            int i3111116 = (bVar7.f47126V ? 1 : 0) | 0;
                            if (bVar7.f47125U) {
                                i16 = 2;
                            } else {
                                i16 = 0;
                            }
                            int i3111117 = i3111116 | i16;
                            aVar = new C2416m.a();
                            if (C10147p.m19109i(str3)) {
                                aVar.f12514x = bVar7.f47119O;
                                aVar.f12515y = bVar7.f47121Q;
                                aVar.f12516z = iM19054u;
                            } else if (C10147p.m19111k(str3)) {
                                if (bVar7.f47146q == 0) {
                                    i21 = bVar7.f47144o;
                                    i17 = -1;
                                    if (i21 == -1) {
                                        i21 = bVar7.f47142m;
                                    }
                                    bVar7.f47144o = i21;
                                    i22 = bVar7.f47145p;
                                    if (i22 == -1) {
                                        i22 = bVar7.f47143n;
                                    }
                                    bVar7.f47145p = i22;
                                } else {
                                    i17 = -1;
                                }
                                i18 = bVar7.f47144o;
                                if (i18 != i17) {
                                    f3 = -1.0f;
                                } else {
                                    f3 = -1.0f;
                                }
                                if (bVar7.f47153x) {
                                    if (bVar7.f47108D != -1.0f) {
                                        bArr = null;
                                    } else {
                                        bArr = null;
                                    }
                                    c10320b = new C10320b(bVar7.f47154y, bVar7.f47105A, bVar7.f47155z, bArr);
                                } else {
                                    c10320b = null;
                                }
                                str9 = bVar7.f47130a;
                                if (str9 != null) {
                                    map = C8982d.f47049h0;
                                    if (map.containsKey(str9)) {
                                        iIntValue = map.get(bVar7.f47130a).intValue();
                                    } else {
                                        iIntValue = i17;
                                    }
                                } else {
                                    iIntValue = i17;
                                }
                                if (bVar7.f47147r == 0) {
                                    i19 = iIntValue;
                                } else {
                                    i19 = iIntValue;
                                }
                                aVar.f12506p = bVar7.f47142m;
                                aVar.f12507q = bVar7.f47143n;
                                aVar.f12510t = f3;
                                aVar.f12509s = i19;
                                aVar.f12511u = bVar7.f47151v;
                                aVar.f12512v = bVar7.f47152w;
                                aVar.f12513w = c10320b;
                                i11 = 2;
                            } else {
                                if ("application/x-subrip".equals(str3)) {
                                }
                                i11 = i12;
                            }
                            str10 = bVar7.f47130a;
                            if (str10 != null) {
                                aVar.f12492b = bVar7.f47130a;
                            }
                            aVar.m7129b(i35);
                            aVar.f12501k = str3;
                            aVar.f12502l = i15;
                            aVar.f12493c = bVar7.f47127W;
                            aVar.f12494d = i3111117;
                            aVar.f12503m = list4;
                            aVar.f12498h = str7;
                            aVar.f12504n = bVar7.f47141l;
                            C2416m c2416mM7128a116 = aVar.m7128a();
                            InterfaceC7522w interfaceC7522wMo7366q116 = interfaceC7509j2.mo7366q(bVar7.f47132c, i11);
                            bVar7.f47128X = interfaceC7522wMo7366q116;
                            interfaceC7522wMo7366q116.mo7388f(c2416mM7128a116);
                            sparseArray.put(bVar7.f47132c, bVar7);
                            c8982d = c8982d2;
                            bVar = null;
                        } else {
                            C10145n.m19099g("MatroskaExtractor", "Unsupported floating point PCM bit depth: " + bVar7.f47120P + ". Setting mimeType to audio/x-unknown");
                            i11 = 1;
                            i12 = 3;
                            str13 = "audio/x-unknown";
                            listSingletonList = null;
                            str5 = null;
                            str8 = str5;
                            list = listSingletonList;
                            str2 = str13;
                            i14 = -1;
                            str7 = str8;
                            list4 = list;
                            i15 = i14;
                            str3 = str2;
                            iM19054u = -1;
                            if (bVar7.f47118N != null) {
                                str7 = c10321cM19320a.f51901a;
                                str3 = "video/dolby-vision";
                            }
                            int i3111118 = (bVar7.f47126V ? 1 : 0) | 0;
                            if (bVar7.f47125U) {
                                i16 = 2;
                            } else {
                                i16 = 0;
                            }
                            int i3111119 = i3111118 | i16;
                            aVar = new C2416m.a();
                            if (C10147p.m19109i(str3)) {
                                aVar.f12514x = bVar7.f47119O;
                                aVar.f12515y = bVar7.f47121Q;
                                aVar.f12516z = iM19054u;
                            } else if (C10147p.m19111k(str3)) {
                                if (bVar7.f47146q == 0) {
                                    i21 = bVar7.f47144o;
                                    i17 = -1;
                                    if (i21 == -1) {
                                        i21 = bVar7.f47142m;
                                    }
                                    bVar7.f47144o = i21;
                                    i22 = bVar7.f47145p;
                                    if (i22 == -1) {
                                        i22 = bVar7.f47143n;
                                    }
                                    bVar7.f47145p = i22;
                                } else {
                                    i17 = -1;
                                }
                                i18 = bVar7.f47144o;
                                if (i18 != i17) {
                                    f3 = -1.0f;
                                } else {
                                    f3 = -1.0f;
                                }
                                if (bVar7.f47153x) {
                                    if (bVar7.f47108D != -1.0f) {
                                        bArr = null;
                                    } else {
                                        bArr = null;
                                    }
                                    c10320b = new C10320b(bVar7.f47154y, bVar7.f47105A, bVar7.f47155z, bArr);
                                } else {
                                    c10320b = null;
                                }
                                str9 = bVar7.f47130a;
                                if (str9 != null) {
                                    map = C8982d.f47049h0;
                                    if (map.containsKey(str9)) {
                                        iIntValue = map.get(bVar7.f47130a).intValue();
                                    } else {
                                        iIntValue = i17;
                                    }
                                } else {
                                    iIntValue = i17;
                                }
                                if (bVar7.f47147r == 0) {
                                    i19 = iIntValue;
                                } else {
                                    i19 = iIntValue;
                                }
                                aVar.f12506p = bVar7.f47142m;
                                aVar.f12507q = bVar7.f47143n;
                                aVar.f12510t = f3;
                                aVar.f12509s = i19;
                                aVar.f12511u = bVar7.f47151v;
                                aVar.f12512v = bVar7.f47152w;
                                aVar.f12513w = c10320b;
                                i11 = 2;
                            } else {
                                if ("application/x-subrip".equals(str3)) {
                                }
                                i11 = i12;
                            }
                            str10 = bVar7.f47130a;
                            if (str10 != null) {
                                aVar.f12492b = bVar7.f47130a;
                            }
                            aVar.m7129b(i35);
                            aVar.f12501k = str3;
                            aVar.f12502l = i15;
                            aVar.f12493c = bVar7.f47127W;
                            aVar.f12494d = i3111119;
                            aVar.f12503m = list4;
                            aVar.f12498h = str7;
                            aVar.f12504n = bVar7.f47141l;
                            C2416m c2416mM7128a117 = aVar.m7128a();
                            InterfaceC7522w interfaceC7522wMo7366q117 = interfaceC7509j2.mo7366q(bVar7.f47132c, i11);
                            bVar7.f47128X = interfaceC7522wMo7366q117;
                            interfaceC7522wMo7366q117.mo7388f(c2416mM7128a117);
                            sparseArray.put(bVar7.f47132c, bVar7);
                            c8982d = c8982d2;
                            bVar = null;
                        }
                        break;
                    case 23:
                        bVar7 = bVar7;
                        int i53 = bVar7.f47120P;
                        if (i53 == 8) {
                            iM19054u = 3;
                        } else if (i53 != 16) {
                            C10145n.m19099g("MatroskaExtractor", "Unsupported big endian PCM bit depth: " + bVar7.f47120P + ". Setting mimeType to audio/x-unknown");
                            i11 = 1;
                            i12 = 3;
                            str13 = "audio/x-unknown";
                            listSingletonList = null;
                            str5 = null;
                            str8 = str5;
                            list = listSingletonList;
                            str2 = str13;
                            i14 = -1;
                            str7 = str8;
                            list4 = list;
                            i15 = i14;
                            str3 = str2;
                            iM19054u = -1;
                            if (bVar7.f47118N != null) {
                                str7 = c10321cM19320a.f51901a;
                                str3 = "video/dolby-vision";
                            }
                            int i31111110 = (bVar7.f47126V ? 1 : 0) | 0;
                            if (bVar7.f47125U) {
                                i16 = 2;
                            } else {
                                i16 = 0;
                            }
                            int i31111111 = i31111110 | i16;
                            aVar = new C2416m.a();
                            if (C10147p.m19109i(str3)) {
                                aVar.f12514x = bVar7.f47119O;
                                aVar.f12515y = bVar7.f47121Q;
                                aVar.f12516z = iM19054u;
                            } else if (C10147p.m19111k(str3)) {
                                if (bVar7.f47146q == 0) {
                                    i21 = bVar7.f47144o;
                                    i17 = -1;
                                    if (i21 == -1) {
                                        i21 = bVar7.f47142m;
                                    }
                                    bVar7.f47144o = i21;
                                    i22 = bVar7.f47145p;
                                    if (i22 == -1) {
                                        i22 = bVar7.f47143n;
                                    }
                                    bVar7.f47145p = i22;
                                } else {
                                    i17 = -1;
                                }
                                i18 = bVar7.f47144o;
                                if (i18 != i17) {
                                    f3 = -1.0f;
                                } else {
                                    f3 = -1.0f;
                                }
                                if (bVar7.f47153x) {
                                    if (bVar7.f47108D != -1.0f) {
                                        bArr = null;
                                    } else {
                                        bArr = null;
                                    }
                                    c10320b = new C10320b(bVar7.f47154y, bVar7.f47105A, bVar7.f47155z, bArr);
                                } else {
                                    c10320b = null;
                                }
                                str9 = bVar7.f47130a;
                                if (str9 != null) {
                                    map = C8982d.f47049h0;
                                    if (map.containsKey(str9)) {
                                        iIntValue = map.get(bVar7.f47130a).intValue();
                                    } else {
                                        iIntValue = i17;
                                    }
                                } else {
                                    iIntValue = i17;
                                }
                                if (bVar7.f47147r == 0) {
                                    i19 = iIntValue;
                                } else {
                                    i19 = iIntValue;
                                }
                                aVar.f12506p = bVar7.f47142m;
                                aVar.f12507q = bVar7.f47143n;
                                aVar.f12510t = f3;
                                aVar.f12509s = i19;
                                aVar.f12511u = bVar7.f47151v;
                                aVar.f12512v = bVar7.f47152w;
                                aVar.f12513w = c10320b;
                                i11 = 2;
                            } else {
                                if ("application/x-subrip".equals(str3)) {
                                }
                                i11 = i12;
                            }
                            str10 = bVar7.f47130a;
                            if (str10 != null) {
                                aVar.f12492b = bVar7.f47130a;
                            }
                            aVar.m7129b(i35);
                            aVar.f12501k = str3;
                            aVar.f12502l = i15;
                            aVar.f12493c = bVar7.f47127W;
                            aVar.f12494d = i31111111;
                            aVar.f12503m = list4;
                            aVar.f12498h = str7;
                            aVar.f12504n = bVar7.f47141l;
                            C2416m c2416mM7128a118 = aVar.m7128a();
                            InterfaceC7522w interfaceC7522wMo7366q118 = interfaceC7509j2.mo7366q(bVar7.f47132c, i11);
                            bVar7.f47128X = interfaceC7522wMo7366q118;
                            interfaceC7522wMo7366q118.mo7388f(c2416mM7128a118);
                            sparseArray.put(bVar7.f47132c, bVar7);
                            c8982d = c8982d2;
                            bVar = null;
                        } else {
                            iM19054u = 268435456;
                        }
                        i11 = 1;
                        i12 = 3;
                        str3 = "audio/raw";
                        list3 = null;
                        str6 = null;
                        str7 = str6;
                        list4 = list3;
                        i15 = -1;
                        if (bVar7.f47118N != null) {
                            str7 = c10321cM19320a.f51901a;
                            str3 = "video/dolby-vision";
                        }
                        int i31111112 = (bVar7.f47126V ? 1 : 0) | 0;
                        if (bVar7.f47125U) {
                            i16 = 2;
                        } else {
                            i16 = 0;
                        }
                        int i31111113 = i31111112 | i16;
                        aVar = new C2416m.a();
                        if (C10147p.m19109i(str3)) {
                            aVar.f12514x = bVar7.f47119O;
                            aVar.f12515y = bVar7.f47121Q;
                            aVar.f12516z = iM19054u;
                        } else if (C10147p.m19111k(str3)) {
                            if (bVar7.f47146q == 0) {
                                i21 = bVar7.f47144o;
                                i17 = -1;
                                if (i21 == -1) {
                                    i21 = bVar7.f47142m;
                                }
                                bVar7.f47144o = i21;
                                i22 = bVar7.f47145p;
                                if (i22 == -1) {
                                    i22 = bVar7.f47143n;
                                }
                                bVar7.f47145p = i22;
                            } else {
                                i17 = -1;
                            }
                            i18 = bVar7.f47144o;
                            if (i18 != i17) {
                                f3 = -1.0f;
                            } else {
                                f3 = -1.0f;
                            }
                            if (bVar7.f47153x) {
                                if (bVar7.f47108D != -1.0f) {
                                    bArr = null;
                                } else {
                                    bArr = null;
                                }
                                c10320b = new C10320b(bVar7.f47154y, bVar7.f47105A, bVar7.f47155z, bArr);
                            } else {
                                c10320b = null;
                            }
                            str9 = bVar7.f47130a;
                            if (str9 != null) {
                                map = C8982d.f47049h0;
                                if (map.containsKey(str9)) {
                                    iIntValue = map.get(bVar7.f47130a).intValue();
                                } else {
                                    iIntValue = i17;
                                }
                            } else {
                                iIntValue = i17;
                            }
                            if (bVar7.f47147r == 0) {
                                i19 = iIntValue;
                            } else {
                                i19 = iIntValue;
                            }
                            aVar.f12506p = bVar7.f47142m;
                            aVar.f12507q = bVar7.f47143n;
                            aVar.f12510t = f3;
                            aVar.f12509s = i19;
                            aVar.f12511u = bVar7.f47151v;
                            aVar.f12512v = bVar7.f47152w;
                            aVar.f12513w = c10320b;
                            i11 = 2;
                        } else {
                            if ("application/x-subrip".equals(str3)) {
                            }
                            i11 = i12;
                        }
                        str10 = bVar7.f47130a;
                        if (str10 != null) {
                            aVar.f12492b = bVar7.f47130a;
                        }
                        aVar.m7129b(i35);
                        aVar.f12501k = str3;
                        aVar.f12502l = i15;
                        aVar.f12493c = bVar7.f47127W;
                        aVar.f12494d = i31111113;
                        aVar.f12503m = list4;
                        aVar.f12498h = str7;
                        aVar.f12504n = bVar7.f47141l;
                        C2416m c2416mM7128a119 = aVar.m7128a();
                        InterfaceC7522w interfaceC7522wMo7366q119 = interfaceC7509j2.mo7366q(bVar7.f47132c, i11);
                        bVar7.f47128X = interfaceC7522wMo7366q119;
                        interfaceC7522wMo7366q119.mo7388f(c2416mM7128a119);
                        sparseArray.put(bVar7.f47132c, bVar7);
                        c8982d = c8982d2;
                        bVar = null;
                        break;
                    case 24:
                        bVar7 = bVar7;
                        iM19054u = C10134c0.m19054u(bVar7.f47120P);
                        if (iM19054u == 0) {
                            C10145n.m19099g("MatroskaExtractor", "Unsupported little endian PCM bit depth: " + bVar7.f47120P + ". Setting mimeType to audio/x-unknown");
                            i11 = 1;
                            i12 = 3;
                            str13 = "audio/x-unknown";
                            listSingletonList = null;
                            str5 = null;
                            str8 = str5;
                            list = listSingletonList;
                            str2 = str13;
                            i14 = -1;
                            str7 = str8;
                            list4 = list;
                            i15 = i14;
                            str3 = str2;
                            iM19054u = -1;
                            if (bVar7.f47118N != null) {
                                str7 = c10321cM19320a.f51901a;
                                str3 = "video/dolby-vision";
                            }
                            int i31111114 = (bVar7.f47126V ? 1 : 0) | 0;
                            if (bVar7.f47125U) {
                                i16 = 2;
                            } else {
                                i16 = 0;
                            }
                            int i31111115 = i31111114 | i16;
                            aVar = new C2416m.a();
                            if (C10147p.m19109i(str3)) {
                                aVar.f12514x = bVar7.f47119O;
                                aVar.f12515y = bVar7.f47121Q;
                                aVar.f12516z = iM19054u;
                            } else if (C10147p.m19111k(str3)) {
                                if (bVar7.f47146q == 0) {
                                    i21 = bVar7.f47144o;
                                    i17 = -1;
                                    if (i21 == -1) {
                                        i21 = bVar7.f47142m;
                                    }
                                    bVar7.f47144o = i21;
                                    i22 = bVar7.f47145p;
                                    if (i22 == -1) {
                                        i22 = bVar7.f47143n;
                                    }
                                    bVar7.f47145p = i22;
                                } else {
                                    i17 = -1;
                                }
                                i18 = bVar7.f47144o;
                                if (i18 != i17) {
                                    f3 = -1.0f;
                                } else {
                                    f3 = -1.0f;
                                }
                                if (bVar7.f47153x) {
                                    if (bVar7.f47108D != -1.0f) {
                                        bArr = null;
                                    } else {
                                        bArr = null;
                                    }
                                    c10320b = new C10320b(bVar7.f47154y, bVar7.f47105A, bVar7.f47155z, bArr);
                                } else {
                                    c10320b = null;
                                }
                                str9 = bVar7.f47130a;
                                if (str9 != null) {
                                    map = C8982d.f47049h0;
                                    if (map.containsKey(str9)) {
                                        iIntValue = map.get(bVar7.f47130a).intValue();
                                    } else {
                                        iIntValue = i17;
                                    }
                                } else {
                                    iIntValue = i17;
                                }
                                if (bVar7.f47147r == 0) {
                                    i19 = iIntValue;
                                } else {
                                    i19 = iIntValue;
                                }
                                aVar.f12506p = bVar7.f47142m;
                                aVar.f12507q = bVar7.f47143n;
                                aVar.f12510t = f3;
                                aVar.f12509s = i19;
                                aVar.f12511u = bVar7.f47151v;
                                aVar.f12512v = bVar7.f47152w;
                                aVar.f12513w = c10320b;
                                i11 = 2;
                            } else {
                                if ("application/x-subrip".equals(str3)) {
                                }
                                i11 = i12;
                            }
                            str10 = bVar7.f47130a;
                            if (str10 != null) {
                                aVar.f12492b = bVar7.f47130a;
                            }
                            aVar.m7129b(i35);
                            aVar.f12501k = str3;
                            aVar.f12502l = i15;
                            aVar.f12493c = bVar7.f47127W;
                            aVar.f12494d = i31111115;
                            aVar.f12503m = list4;
                            aVar.f12498h = str7;
                            aVar.f12504n = bVar7.f47141l;
                            C2416m c2416mM7128a1110 = aVar.m7128a();
                            InterfaceC7522w interfaceC7522wMo7366q1110 = interfaceC7509j2.mo7366q(bVar7.f47132c, i11);
                            bVar7.f47128X = interfaceC7522wMo7366q1110;
                            interfaceC7522wMo7366q1110.mo7388f(c2416mM7128a1110);
                            sparseArray.put(bVar7.f47132c, bVar7);
                            c8982d = c8982d2;
                            bVar = null;
                        }
                        i11 = 1;
                        i12 = 3;
                        str3 = "audio/raw";
                        list3 = null;
                        str6 = null;
                        str7 = str6;
                        list4 = list3;
                        i15 = -1;
                        if (bVar7.f47118N != null) {
                            str7 = c10321cM19320a.f51901a;
                            str3 = "video/dolby-vision";
                        }
                        int i31111116 = (bVar7.f47126V ? 1 : 0) | 0;
                        if (bVar7.f47125U) {
                            i16 = 2;
                        } else {
                            i16 = 0;
                        }
                        int i31111117 = i31111116 | i16;
                        aVar = new C2416m.a();
                        if (C10147p.m19109i(str3)) {
                            aVar.f12514x = bVar7.f47119O;
                            aVar.f12515y = bVar7.f47121Q;
                            aVar.f12516z = iM19054u;
                        } else if (C10147p.m19111k(str3)) {
                            if (bVar7.f47146q == 0) {
                                i21 = bVar7.f47144o;
                                i17 = -1;
                                if (i21 == -1) {
                                    i21 = bVar7.f47142m;
                                }
                                bVar7.f47144o = i21;
                                i22 = bVar7.f47145p;
                                if (i22 == -1) {
                                    i22 = bVar7.f47143n;
                                }
                                bVar7.f47145p = i22;
                            } else {
                                i17 = -1;
                            }
                            i18 = bVar7.f47144o;
                            if (i18 != i17) {
                                f3 = -1.0f;
                            } else {
                                f3 = -1.0f;
                            }
                            if (bVar7.f47153x) {
                                if (bVar7.f47108D != -1.0f) {
                                    bArr = null;
                                } else {
                                    bArr = null;
                                }
                                c10320b = new C10320b(bVar7.f47154y, bVar7.f47105A, bVar7.f47155z, bArr);
                            } else {
                                c10320b = null;
                            }
                            str9 = bVar7.f47130a;
                            if (str9 != null) {
                                map = C8982d.f47049h0;
                                if (map.containsKey(str9)) {
                                    iIntValue = map.get(bVar7.f47130a).intValue();
                                } else {
                                    iIntValue = i17;
                                }
                            } else {
                                iIntValue = i17;
                            }
                            if (bVar7.f47147r == 0) {
                                i19 = iIntValue;
                            } else {
                                i19 = iIntValue;
                            }
                            aVar.f12506p = bVar7.f47142m;
                            aVar.f12507q = bVar7.f47143n;
                            aVar.f12510t = f3;
                            aVar.f12509s = i19;
                            aVar.f12511u = bVar7.f47151v;
                            aVar.f12512v = bVar7.f47152w;
                            aVar.f12513w = c10320b;
                            i11 = 2;
                        } else {
                            if ("application/x-subrip".equals(str3)) {
                            }
                            i11 = i12;
                        }
                        str10 = bVar7.f47130a;
                        if (str10 != null) {
                            aVar.f12492b = bVar7.f47130a;
                        }
                        aVar.m7129b(i35);
                        aVar.f12501k = str3;
                        aVar.f12502l = i15;
                        aVar.f12493c = bVar7.f47127W;
                        aVar.f12494d = i31111117;
                        aVar.f12503m = list4;
                        aVar.f12498h = str7;
                        aVar.f12504n = bVar7.f47141l;
                        C2416m c2416mM7128a1111 = aVar.m7128a();
                        InterfaceC7522w interfaceC7522wMo7366q1111 = interfaceC7509j2.mo7366q(bVar7.f47132c, i11);
                        bVar7.f47128X = interfaceC7522wMo7366q1111;
                        interfaceC7522wMo7366q1111.mo7388f(c2416mM7128a1111);
                        sparseArray.put(bVar7.f47132c, bVar7);
                        c8982d = c8982d2;
                        bVar = null;
                        break;
                    case 25:
                        bVar7 = bVar7;
                        listM9064b0 = ImmutableList.m9059G(C8982d.f47045d0, bVar7.m17227a(bVar7.f47131b));
                        str13 = "text/x-ssa";
                        list2 = listM9064b0;
                        listSingletonList = list2;
                        i11 = 1;
                        i12 = 3;
                        str5 = null;
                        str8 = str5;
                        list = listSingletonList;
                        str2 = str13;
                        i14 = -1;
                        str7 = str8;
                        list4 = list;
                        i15 = i14;
                        str3 = str2;
                        iM19054u = -1;
                        if (bVar7.f47118N != null) {
                            str7 = c10321cM19320a.f51901a;
                            str3 = "video/dolby-vision";
                        }
                        int i31111118 = (bVar7.f47126V ? 1 : 0) | 0;
                        if (bVar7.f47125U) {
                            i16 = 2;
                        } else {
                            i16 = 0;
                        }
                        int i31111119 = i31111118 | i16;
                        aVar = new C2416m.a();
                        if (C10147p.m19109i(str3)) {
                            aVar.f12514x = bVar7.f47119O;
                            aVar.f12515y = bVar7.f47121Q;
                            aVar.f12516z = iM19054u;
                        } else if (C10147p.m19111k(str3)) {
                            if (bVar7.f47146q == 0) {
                                i21 = bVar7.f47144o;
                                i17 = -1;
                                if (i21 == -1) {
                                    i21 = bVar7.f47142m;
                                }
                                bVar7.f47144o = i21;
                                i22 = bVar7.f47145p;
                                if (i22 == -1) {
                                    i22 = bVar7.f47143n;
                                }
                                bVar7.f47145p = i22;
                            } else {
                                i17 = -1;
                            }
                            i18 = bVar7.f47144o;
                            if (i18 != i17) {
                                f3 = -1.0f;
                            } else {
                                f3 = -1.0f;
                            }
                            if (bVar7.f47153x) {
                                if (bVar7.f47108D != -1.0f) {
                                    bArr = null;
                                } else {
                                    bArr = null;
                                }
                                c10320b = new C10320b(bVar7.f47154y, bVar7.f47105A, bVar7.f47155z, bArr);
                            } else {
                                c10320b = null;
                            }
                            str9 = bVar7.f47130a;
                            if (str9 != null) {
                                map = C8982d.f47049h0;
                                if (map.containsKey(str9)) {
                                    iIntValue = map.get(bVar7.f47130a).intValue();
                                } else {
                                    iIntValue = i17;
                                }
                            } else {
                                iIntValue = i17;
                            }
                            if (bVar7.f47147r == 0) {
                                i19 = iIntValue;
                            } else {
                                i19 = iIntValue;
                            }
                            aVar.f12506p = bVar7.f47142m;
                            aVar.f12507q = bVar7.f47143n;
                            aVar.f12510t = f3;
                            aVar.f12509s = i19;
                            aVar.f12511u = bVar7.f47151v;
                            aVar.f12512v = bVar7.f47152w;
                            aVar.f12513w = c10320b;
                            i11 = 2;
                        } else {
                            if ("application/x-subrip".equals(str3)) {
                            }
                            i11 = i12;
                        }
                        str10 = bVar7.f47130a;
                        if (str10 != null) {
                            aVar.f12492b = bVar7.f47130a;
                        }
                        aVar.m7129b(i35);
                        aVar.f12501k = str3;
                        aVar.f12502l = i15;
                        aVar.f12493c = bVar7.f47127W;
                        aVar.f12494d = i31111119;
                        aVar.f12503m = list4;
                        aVar.f12498h = str7;
                        aVar.f12504n = bVar7.f47141l;
                        C2416m c2416mM7128a1112 = aVar.m7128a();
                        InterfaceC7522w interfaceC7522wMo7366q1112 = interfaceC7509j2.mo7366q(bVar7.f47132c, i11);
                        bVar7.f47128X = interfaceC7522wMo7366q1112;
                        interfaceC7522wMo7366q1112.mo7388f(c2416mM7128a1112);
                        sparseArray.put(bVar7.f47132c, bVar7);
                        c8982d = c8982d2;
                        bVar = null;
                        break;
                    case 26:
                        bVar7 = bVar7;
                        C10323e c10323eM19325a = C10323e.m19325a(new C10151t(bVar7.m17227a(bVar7.f47131b)));
                        bVar7.f47129Y = c10323eM19325a.f51916b;
                        str3 = "video/hevc";
                        list3 = c10323eM19325a.f51915a;
                        str4 = c10323eM19325a.f51918d;
                        str6 = str4;
                        iM19054u = -1;
                        i11 = 1;
                        i12 = 3;
                        str7 = str6;
                        list4 = list3;
                        i15 = -1;
                        if (bVar7.f47118N != null) {
                            str7 = c10321cM19320a.f51901a;
                            str3 = "video/dolby-vision";
                        }
                        int i311111110 = (bVar7.f47126V ? 1 : 0) | 0;
                        if (bVar7.f47125U) {
                            i16 = 2;
                        } else {
                            i16 = 0;
                        }
                        int i311111111 = i311111110 | i16;
                        aVar = new C2416m.a();
                        if (C10147p.m19109i(str3)) {
                            aVar.f12514x = bVar7.f47119O;
                            aVar.f12515y = bVar7.f47121Q;
                            aVar.f12516z = iM19054u;
                        } else if (C10147p.m19111k(str3)) {
                            if (bVar7.f47146q == 0) {
                                i21 = bVar7.f47144o;
                                i17 = -1;
                                if (i21 == -1) {
                                    i21 = bVar7.f47142m;
                                }
                                bVar7.f47144o = i21;
                                i22 = bVar7.f47145p;
                                if (i22 == -1) {
                                    i22 = bVar7.f47143n;
                                }
                                bVar7.f47145p = i22;
                            } else {
                                i17 = -1;
                            }
                            i18 = bVar7.f47144o;
                            if (i18 != i17) {
                                f3 = -1.0f;
                            } else {
                                f3 = -1.0f;
                            }
                            if (bVar7.f47153x) {
                                if (bVar7.f47108D != -1.0f) {
                                    bArr = null;
                                } else {
                                    bArr = null;
                                }
                                c10320b = new C10320b(bVar7.f47154y, bVar7.f47105A, bVar7.f47155z, bArr);
                            } else {
                                c10320b = null;
                            }
                            str9 = bVar7.f47130a;
                            if (str9 != null) {
                                map = C8982d.f47049h0;
                                if (map.containsKey(str9)) {
                                    iIntValue = map.get(bVar7.f47130a).intValue();
                                } else {
                                    iIntValue = i17;
                                }
                            } else {
                                iIntValue = i17;
                            }
                            if (bVar7.f47147r == 0) {
                                i19 = iIntValue;
                            } else {
                                i19 = iIntValue;
                            }
                            aVar.f12506p = bVar7.f47142m;
                            aVar.f12507q = bVar7.f47143n;
                            aVar.f12510t = f3;
                            aVar.f12509s = i19;
                            aVar.f12511u = bVar7.f47151v;
                            aVar.f12512v = bVar7.f47152w;
                            aVar.f12513w = c10320b;
                            i11 = 2;
                        } else {
                            if ("application/x-subrip".equals(str3)) {
                            }
                            i11 = i12;
                        }
                        str10 = bVar7.f47130a;
                        if (str10 != null) {
                            aVar.f12492b = bVar7.f47130a;
                        }
                        aVar.m7129b(i35);
                        aVar.f12501k = str3;
                        aVar.f12502l = i15;
                        aVar.f12493c = bVar7.f47127W;
                        aVar.f12494d = i311111111;
                        aVar.f12503m = list4;
                        aVar.f12498h = str7;
                        aVar.f12504n = bVar7.f47141l;
                        C2416m c2416mM7128a1113 = aVar.m7128a();
                        InterfaceC7522w interfaceC7522wMo7366q1113 = interfaceC7509j2.mo7366q(bVar7.f47132c, i11);
                        bVar7.f47128X = interfaceC7522wMo7366q1113;
                        interfaceC7522wMo7366q1113.mo7388f(c2416mM7128a1113);
                        sparseArray.put(bVar7.f47132c, bVar7);
                        c8982d = c8982d2;
                        bVar = null;
                        break;
                    case 27:
                        str13 = "text/vtt";
                        i12 = 3;
                        i11 = 1;
                        listSingletonList = null;
                        str5 = null;
                        str8 = str5;
                        list = listSingletonList;
                        str2 = str13;
                        i14 = -1;
                        str7 = str8;
                        list4 = list;
                        i15 = i14;
                        str3 = str2;
                        iM19054u = -1;
                        if (bVar7.f47118N != null) {
                            str7 = c10321cM19320a.f51901a;
                            str3 = "video/dolby-vision";
                        }
                        int i311111112 = (bVar7.f47126V ? 1 : 0) | 0;
                        if (bVar7.f47125U) {
                            i16 = 2;
                        } else {
                            i16 = 0;
                        }
                        int i311111113 = i311111112 | i16;
                        aVar = new C2416m.a();
                        if (C10147p.m19109i(str3)) {
                            aVar.f12514x = bVar7.f47119O;
                            aVar.f12515y = bVar7.f47121Q;
                            aVar.f12516z = iM19054u;
                        } else if (C10147p.m19111k(str3)) {
                            if (bVar7.f47146q == 0) {
                                i21 = bVar7.f47144o;
                                i17 = -1;
                                if (i21 == -1) {
                                    i21 = bVar7.f47142m;
                                }
                                bVar7.f47144o = i21;
                                i22 = bVar7.f47145p;
                                if (i22 == -1) {
                                    i22 = bVar7.f47143n;
                                }
                                bVar7.f47145p = i22;
                            } else {
                                i17 = -1;
                            }
                            i18 = bVar7.f47144o;
                            if (i18 != i17) {
                                f3 = -1.0f;
                            } else {
                                f3 = -1.0f;
                            }
                            if (bVar7.f47153x) {
                                if (bVar7.f47108D != -1.0f) {
                                    bArr = null;
                                } else {
                                    bArr = null;
                                }
                                c10320b = new C10320b(bVar7.f47154y, bVar7.f47105A, bVar7.f47155z, bArr);
                            } else {
                                c10320b = null;
                            }
                            str9 = bVar7.f47130a;
                            if (str9 != null) {
                                map = C8982d.f47049h0;
                                if (map.containsKey(str9)) {
                                    iIntValue = map.get(bVar7.f47130a).intValue();
                                } else {
                                    iIntValue = i17;
                                }
                            } else {
                                iIntValue = i17;
                            }
                            if (bVar7.f47147r == 0) {
                                i19 = iIntValue;
                            } else {
                                i19 = iIntValue;
                            }
                            aVar.f12506p = bVar7.f47142m;
                            aVar.f12507q = bVar7.f47143n;
                            aVar.f12510t = f3;
                            aVar.f12509s = i19;
                            aVar.f12511u = bVar7.f47151v;
                            aVar.f12512v = bVar7.f47152w;
                            aVar.f12513w = c10320b;
                            i11 = 2;
                        } else {
                            if ("application/x-subrip".equals(str3)) {
                            }
                            i11 = i12;
                        }
                        str10 = bVar7.f47130a;
                        if (str10 != null) {
                            aVar.f12492b = bVar7.f47130a;
                        }
                        aVar.m7129b(i35);
                        aVar.f12501k = str3;
                        aVar.f12502l = i15;
                        aVar.f12493c = bVar7.f47127W;
                        aVar.f12494d = i311111113;
                        aVar.f12503m = list4;
                        aVar.f12498h = str7;
                        aVar.f12504n = bVar7.f47141l;
                        C2416m c2416mM7128a1114 = aVar.m7128a();
                        InterfaceC7522w interfaceC7522wMo7366q1114 = interfaceC7509j2.mo7366q(bVar7.f47132c, i11);
                        bVar7.f47128X = interfaceC7522wMo7366q1114;
                        interfaceC7522wMo7366q1114.mo7388f(c2416mM7128a1114);
                        sparseArray.put(bVar7.f47132c, bVar7);
                        c8982d = c8982d2;
                        bVar = null;
                        break;
                    case 28:
                        str13 = "application/x-subrip";
                        i12 = 3;
                        i11 = 1;
                        listSingletonList = null;
                        str5 = null;
                        str8 = str5;
                        list = listSingletonList;
                        str2 = str13;
                        i14 = -1;
                        str7 = str8;
                        list4 = list;
                        i15 = i14;
                        str3 = str2;
                        iM19054u = -1;
                        if (bVar7.f47118N != null) {
                            str7 = c10321cM19320a.f51901a;
                            str3 = "video/dolby-vision";
                        }
                        int i311111114 = (bVar7.f47126V ? 1 : 0) | 0;
                        if (bVar7.f47125U) {
                            i16 = 2;
                        } else {
                            i16 = 0;
                        }
                        int i311111115 = i311111114 | i16;
                        aVar = new C2416m.a();
                        if (C10147p.m19109i(str3)) {
                            aVar.f12514x = bVar7.f47119O;
                            aVar.f12515y = bVar7.f47121Q;
                            aVar.f12516z = iM19054u;
                        } else if (C10147p.m19111k(str3)) {
                            if (bVar7.f47146q == 0) {
                                i21 = bVar7.f47144o;
                                i17 = -1;
                                if (i21 == -1) {
                                    i21 = bVar7.f47142m;
                                }
                                bVar7.f47144o = i21;
                                i22 = bVar7.f47145p;
                                if (i22 == -1) {
                                    i22 = bVar7.f47143n;
                                }
                                bVar7.f47145p = i22;
                            } else {
                                i17 = -1;
                            }
                            i18 = bVar7.f47144o;
                            if (i18 != i17) {
                                f3 = -1.0f;
                            } else {
                                f3 = -1.0f;
                            }
                            if (bVar7.f47153x) {
                                if (bVar7.f47108D != -1.0f) {
                                    bArr = null;
                                } else {
                                    bArr = null;
                                }
                                c10320b = new C10320b(bVar7.f47154y, bVar7.f47105A, bVar7.f47155z, bArr);
                            } else {
                                c10320b = null;
                            }
                            str9 = bVar7.f47130a;
                            if (str9 != null) {
                                map = C8982d.f47049h0;
                                if (map.containsKey(str9)) {
                                    iIntValue = map.get(bVar7.f47130a).intValue();
                                } else {
                                    iIntValue = i17;
                                }
                            } else {
                                iIntValue = i17;
                            }
                            if (bVar7.f47147r == 0) {
                                i19 = iIntValue;
                            } else {
                                i19 = iIntValue;
                            }
                            aVar.f12506p = bVar7.f47142m;
                            aVar.f12507q = bVar7.f47143n;
                            aVar.f12510t = f3;
                            aVar.f12509s = i19;
                            aVar.f12511u = bVar7.f47151v;
                            aVar.f12512v = bVar7.f47152w;
                            aVar.f12513w = c10320b;
                            i11 = 2;
                        } else {
                            if ("application/x-subrip".equals(str3)) {
                            }
                            i11 = i12;
                        }
                        str10 = bVar7.f47130a;
                        if (str10 != null) {
                            aVar.f12492b = bVar7.f47130a;
                        }
                        aVar.m7129b(i35);
                        aVar.f12501k = str3;
                        aVar.f12502l = i15;
                        aVar.f12493c = bVar7.f47127W;
                        aVar.f12494d = i311111115;
                        aVar.f12503m = list4;
                        aVar.f12498h = str7;
                        aVar.f12504n = bVar7.f47141l;
                        C2416m c2416mM7128a1115 = aVar.m7128a();
                        InterfaceC7522w interfaceC7522wMo7366q1115 = interfaceC7509j2.mo7366q(bVar7.f47132c, i11);
                        bVar7.f47128X = interfaceC7522wMo7366q1115;
                        interfaceC7522wMo7366q1115.mo7388f(c2416mM7128a1115);
                        sparseArray.put(bVar7.f47132c, bVar7);
                        c8982d = c8982d2;
                        bVar = null;
                        break;
                    case 29:
                        str13 = "video/mpeg2";
                        i12 = 3;
                        i11 = 1;
                        listSingletonList = null;
                        str5 = null;
                        str8 = str5;
                        list = listSingletonList;
                        str2 = str13;
                        i14 = -1;
                        str7 = str8;
                        list4 = list;
                        i15 = i14;
                        str3 = str2;
                        iM19054u = -1;
                        if (bVar7.f47118N != null) {
                            str7 = c10321cM19320a.f51901a;
                            str3 = "video/dolby-vision";
                        }
                        int i311111116 = (bVar7.f47126V ? 1 : 0) | 0;
                        if (bVar7.f47125U) {
                            i16 = 2;
                        } else {
                            i16 = 0;
                        }
                        int i311111117 = i311111116 | i16;
                        aVar = new C2416m.a();
                        if (C10147p.m19109i(str3)) {
                            aVar.f12514x = bVar7.f47119O;
                            aVar.f12515y = bVar7.f47121Q;
                            aVar.f12516z = iM19054u;
                        } else if (C10147p.m19111k(str3)) {
                            if (bVar7.f47146q == 0) {
                                i21 = bVar7.f47144o;
                                i17 = -1;
                                if (i21 == -1) {
                                    i21 = bVar7.f47142m;
                                }
                                bVar7.f47144o = i21;
                                i22 = bVar7.f47145p;
                                if (i22 == -1) {
                                    i22 = bVar7.f47143n;
                                }
                                bVar7.f47145p = i22;
                            } else {
                                i17 = -1;
                            }
                            i18 = bVar7.f47144o;
                            if (i18 != i17) {
                                f3 = -1.0f;
                            } else {
                                f3 = -1.0f;
                            }
                            if (bVar7.f47153x) {
                                if (bVar7.f47108D != -1.0f) {
                                    bArr = null;
                                } else {
                                    bArr = null;
                                }
                                c10320b = new C10320b(bVar7.f47154y, bVar7.f47105A, bVar7.f47155z, bArr);
                            } else {
                                c10320b = null;
                            }
                            str9 = bVar7.f47130a;
                            if (str9 != null) {
                                map = C8982d.f47049h0;
                                if (map.containsKey(str9)) {
                                    iIntValue = map.get(bVar7.f47130a).intValue();
                                } else {
                                    iIntValue = i17;
                                }
                            } else {
                                iIntValue = i17;
                            }
                            if (bVar7.f47147r == 0) {
                                i19 = iIntValue;
                            } else {
                                i19 = iIntValue;
                            }
                            aVar.f12506p = bVar7.f47142m;
                            aVar.f12507q = bVar7.f47143n;
                            aVar.f12510t = f3;
                            aVar.f12509s = i19;
                            aVar.f12511u = bVar7.f47151v;
                            aVar.f12512v = bVar7.f47152w;
                            aVar.f12513w = c10320b;
                            i11 = 2;
                        } else {
                            if ("application/x-subrip".equals(str3)) {
                            }
                            i11 = i12;
                        }
                        str10 = bVar7.f47130a;
                        if (str10 != null) {
                            aVar.f12492b = bVar7.f47130a;
                        }
                        aVar.m7129b(i35);
                        aVar.f12501k = str3;
                        aVar.f12502l = i15;
                        aVar.f12493c = bVar7.f47127W;
                        aVar.f12494d = i311111117;
                        aVar.f12503m = list4;
                        aVar.f12498h = str7;
                        aVar.f12504n = bVar7.f47141l;
                        C2416m c2416mM7128a1116 = aVar.m7128a();
                        InterfaceC7522w interfaceC7522wMo7366q1116 = interfaceC7509j2.mo7366q(bVar7.f47132c, i11);
                        bVar7.f47128X = interfaceC7522wMo7366q1116;
                        interfaceC7522wMo7366q1116.mo7388f(c2416mM7128a1116);
                        sparseArray.put(bVar7.f47132c, bVar7);
                        c8982d = c8982d2;
                        bVar = null;
                        break;
                    case 30:
                        str13 = "audio/eac3";
                        i12 = 3;
                        i11 = 1;
                        listSingletonList = null;
                        str5 = null;
                        str8 = str5;
                        list = listSingletonList;
                        str2 = str13;
                        i14 = -1;
                        str7 = str8;
                        list4 = list;
                        i15 = i14;
                        str3 = str2;
                        iM19054u = -1;
                        if (bVar7.f47118N != null) {
                            str7 = c10321cM19320a.f51901a;
                            str3 = "video/dolby-vision";
                        }
                        int i311111118 = (bVar7.f47126V ? 1 : 0) | 0;
                        if (bVar7.f47125U) {
                            i16 = 2;
                        } else {
                            i16 = 0;
                        }
                        int i311111119 = i311111118 | i16;
                        aVar = new C2416m.a();
                        if (C10147p.m19109i(str3)) {
                            aVar.f12514x = bVar7.f47119O;
                            aVar.f12515y = bVar7.f47121Q;
                            aVar.f12516z = iM19054u;
                        } else if (C10147p.m19111k(str3)) {
                            if (bVar7.f47146q == 0) {
                                i21 = bVar7.f47144o;
                                i17 = -1;
                                if (i21 == -1) {
                                    i21 = bVar7.f47142m;
                                }
                                bVar7.f47144o = i21;
                                i22 = bVar7.f47145p;
                                if (i22 == -1) {
                                    i22 = bVar7.f47143n;
                                }
                                bVar7.f47145p = i22;
                            } else {
                                i17 = -1;
                            }
                            i18 = bVar7.f47144o;
                            if (i18 != i17) {
                                f3 = -1.0f;
                            } else {
                                f3 = -1.0f;
                            }
                            if (bVar7.f47153x) {
                                if (bVar7.f47108D != -1.0f) {
                                    bArr = null;
                                } else {
                                    bArr = null;
                                }
                                c10320b = new C10320b(bVar7.f47154y, bVar7.f47105A, bVar7.f47155z, bArr);
                            } else {
                                c10320b = null;
                            }
                            str9 = bVar7.f47130a;
                            if (str9 != null) {
                                map = C8982d.f47049h0;
                                if (map.containsKey(str9)) {
                                    iIntValue = map.get(bVar7.f47130a).intValue();
                                } else {
                                    iIntValue = i17;
                                }
                            } else {
                                iIntValue = i17;
                            }
                            if (bVar7.f47147r == 0) {
                                i19 = iIntValue;
                            } else {
                                i19 = iIntValue;
                            }
                            aVar.f12506p = bVar7.f47142m;
                            aVar.f12507q = bVar7.f47143n;
                            aVar.f12510t = f3;
                            aVar.f12509s = i19;
                            aVar.f12511u = bVar7.f47151v;
                            aVar.f12512v = bVar7.f47152w;
                            aVar.f12513w = c10320b;
                            i11 = 2;
                        } else {
                            if ("application/x-subrip".equals(str3)) {
                            }
                            i11 = i12;
                        }
                        str10 = bVar7.f47130a;
                        if (str10 != null) {
                            aVar.f12492b = bVar7.f47130a;
                        }
                        aVar.m7129b(i35);
                        aVar.f12501k = str3;
                        aVar.f12502l = i15;
                        aVar.f12493c = bVar7.f47127W;
                        aVar.f12494d = i311111119;
                        aVar.f12503m = list4;
                        aVar.f12498h = str7;
                        aVar.f12504n = bVar7.f47141l;
                        C2416m c2416mM7128a1117 = aVar.m7128a();
                        InterfaceC7522w interfaceC7522wMo7366q1117 = interfaceC7509j2.mo7366q(bVar7.f47132c, i11);
                        bVar7.f47128X = interfaceC7522wMo7366q1117;
                        interfaceC7522wMo7366q1117.mo7388f(c2416mM7128a1117);
                        sparseArray.put(bVar7.f47132c, bVar7);
                        c8982d = c8982d2;
                        bVar = null;
                        break;
                    case 31:
                        bVar7 = bVar7;
                        listM9064b0 = Collections.singletonList(bVar7.m17227a(bVar7.f47131b));
                        str13 = "audio/flac";
                        list2 = listM9064b0;
                        listSingletonList = list2;
                        i11 = 1;
                        i12 = 3;
                        str5 = null;
                        str8 = str5;
                        list = listSingletonList;
                        str2 = str13;
                        i14 = -1;
                        str7 = str8;
                        list4 = list;
                        i15 = i14;
                        str3 = str2;
                        iM19054u = -1;
                        if (bVar7.f47118N != null) {
                            str7 = c10321cM19320a.f51901a;
                            str3 = "video/dolby-vision";
                        }
                        int i3111111110 = (bVar7.f47126V ? 1 : 0) | 0;
                        if (bVar7.f47125U) {
                            i16 = 2;
                        } else {
                            i16 = 0;
                        }
                        int i3111111111 = i3111111110 | i16;
                        aVar = new C2416m.a();
                        if (C10147p.m19109i(str3)) {
                            aVar.f12514x = bVar7.f47119O;
                            aVar.f12515y = bVar7.f47121Q;
                            aVar.f12516z = iM19054u;
                        } else if (C10147p.m19111k(str3)) {
                            if (bVar7.f47146q == 0) {
                                i21 = bVar7.f47144o;
                                i17 = -1;
                                if (i21 == -1) {
                                    i21 = bVar7.f47142m;
                                }
                                bVar7.f47144o = i21;
                                i22 = bVar7.f47145p;
                                if (i22 == -1) {
                                    i22 = bVar7.f47143n;
                                }
                                bVar7.f47145p = i22;
                            } else {
                                i17 = -1;
                            }
                            i18 = bVar7.f47144o;
                            if (i18 != i17) {
                                f3 = -1.0f;
                            } else {
                                f3 = -1.0f;
                            }
                            if (bVar7.f47153x) {
                                if (bVar7.f47108D != -1.0f) {
                                    bArr = null;
                                } else {
                                    bArr = null;
                                }
                                c10320b = new C10320b(bVar7.f47154y, bVar7.f47105A, bVar7.f47155z, bArr);
                            } else {
                                c10320b = null;
                            }
                            str9 = bVar7.f47130a;
                            if (str9 != null) {
                                map = C8982d.f47049h0;
                                if (map.containsKey(str9)) {
                                    iIntValue = map.get(bVar7.f47130a).intValue();
                                } else {
                                    iIntValue = i17;
                                }
                            } else {
                                iIntValue = i17;
                            }
                            if (bVar7.f47147r == 0) {
                                i19 = iIntValue;
                            } else {
                                i19 = iIntValue;
                            }
                            aVar.f12506p = bVar7.f47142m;
                            aVar.f12507q = bVar7.f47143n;
                            aVar.f12510t = f3;
                            aVar.f12509s = i19;
                            aVar.f12511u = bVar7.f47151v;
                            aVar.f12512v = bVar7.f47152w;
                            aVar.f12513w = c10320b;
                            i11 = 2;
                        } else {
                            if ("application/x-subrip".equals(str3)) {
                            }
                            i11 = i12;
                        }
                        str10 = bVar7.f47130a;
                        if (str10 != null) {
                            aVar.f12492b = bVar7.f47130a;
                        }
                        aVar.m7129b(i35);
                        aVar.f12501k = str3;
                        aVar.f12502l = i15;
                        aVar.f12493c = bVar7.f47127W;
                        aVar.f12494d = i3111111111;
                        aVar.f12503m = list4;
                        aVar.f12498h = str7;
                        aVar.f12504n = bVar7.f47141l;
                        C2416m c2416mM7128a1118 = aVar.m7128a();
                        InterfaceC7522w interfaceC7522wMo7366q1118 = interfaceC7509j2.mo7366q(bVar7.f47132c, i11);
                        bVar7.f47128X = interfaceC7522wMo7366q1118;
                        interfaceC7522wMo7366q1118.mo7388f(c2416mM7128a1118);
                        sparseArray.put(bVar7.f47132c, bVar7);
                        c8982d = c8982d2;
                        bVar = null;
                        break;
                    case 32:
                        arrayList = new ArrayList(3);
                        bVar7 = bVar7;
                        arrayList.add(bVar7.m17227a(bVar7.f47131b));
                        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(8);
                        ByteOrder byteOrder = ByteOrder.LITTLE_ENDIAN;
                        arrayList.add(byteBufferAllocate.order(byteOrder).putLong(bVar7.f47122R).array());
                        arrayList.add(ByteBuffer.allocate(8).order(byteOrder).putLong(bVar7.f47123S).array());
                        str = "audio/opus";
                        i13 = 5760;
                        i12 = 3;
                        int i54 = i13;
                        list = arrayList;
                        str2 = str;
                        i14 = i54;
                        str8 = null;
                        i11 = 1;
                        str7 = str8;
                        list4 = list;
                        i15 = i14;
                        str3 = str2;
                        iM19054u = -1;
                        if (bVar7.f47118N != null) {
                            str7 = c10321cM19320a.f51901a;
                            str3 = "video/dolby-vision";
                        }
                        int i3111111112 = (bVar7.f47126V ? 1 : 0) | 0;
                        if (bVar7.f47125U) {
                            i16 = 2;
                        } else {
                            i16 = 0;
                        }
                        int i3111111113 = i3111111112 | i16;
                        aVar = new C2416m.a();
                        if (C10147p.m19109i(str3)) {
                            aVar.f12514x = bVar7.f47119O;
                            aVar.f12515y = bVar7.f47121Q;
                            aVar.f12516z = iM19054u;
                        } else if (C10147p.m19111k(str3)) {
                            if (bVar7.f47146q == 0) {
                                i21 = bVar7.f47144o;
                                i17 = -1;
                                if (i21 == -1) {
                                    i21 = bVar7.f47142m;
                                }
                                bVar7.f47144o = i21;
                                i22 = bVar7.f47145p;
                                if (i22 == -1) {
                                    i22 = bVar7.f47143n;
                                }
                                bVar7.f47145p = i22;
                            } else {
                                i17 = -1;
                            }
                            i18 = bVar7.f47144o;
                            if (i18 != i17) {
                                f3 = -1.0f;
                            } else {
                                f3 = -1.0f;
                            }
                            if (bVar7.f47153x) {
                                if (bVar7.f47108D != -1.0f) {
                                    bArr = null;
                                } else {
                                    bArr = null;
                                }
                                c10320b = new C10320b(bVar7.f47154y, bVar7.f47105A, bVar7.f47155z, bArr);
                            } else {
                                c10320b = null;
                            }
                            str9 = bVar7.f47130a;
                            if (str9 != null) {
                                map = C8982d.f47049h0;
                                if (map.containsKey(str9)) {
                                    iIntValue = map.get(bVar7.f47130a).intValue();
                                } else {
                                    iIntValue = i17;
                                }
                            } else {
                                iIntValue = i17;
                            }
                            if (bVar7.f47147r == 0) {
                                i19 = iIntValue;
                            } else {
                                i19 = iIntValue;
                            }
                            aVar.f12506p = bVar7.f47142m;
                            aVar.f12507q = bVar7.f47143n;
                            aVar.f12510t = f3;
                            aVar.f12509s = i19;
                            aVar.f12511u = bVar7.f47151v;
                            aVar.f12512v = bVar7.f47152w;
                            aVar.f12513w = c10320b;
                            i11 = 2;
                        } else {
                            if ("application/x-subrip".equals(str3)) {
                            }
                            i11 = i12;
                        }
                        str10 = bVar7.f47130a;
                        if (str10 != null) {
                            aVar.f12492b = bVar7.f47130a;
                        }
                        aVar.m7129b(i35);
                        aVar.f12501k = str3;
                        aVar.f12502l = i15;
                        aVar.f12493c = bVar7.f47127W;
                        aVar.f12494d = i3111111113;
                        aVar.f12503m = list4;
                        aVar.f12498h = str7;
                        aVar.f12504n = bVar7.f47141l;
                        C2416m c2416mM7128a1119 = aVar.m7128a();
                        InterfaceC7522w interfaceC7522wMo7366q1119 = interfaceC7509j2.mo7366q(bVar7.f47132c, i11);
                        bVar7.f47128X = interfaceC7522wMo7366q1119;
                        interfaceC7522wMo7366q1119.mo7388f(c2416mM7128a1119);
                        sparseArray.put(bVar7.f47132c, bVar7);
                        c8982d = c8982d2;
                        bVar = null;
                        break;
                    default:
                        throw ParserException.m6770a("Unrecognized codec identifier.", null);
                }
            } else {
                bVar = null;
                c8982d = c8982d2;
            }
            c8982d.f47098u = bVar;
        }
    }

    /* JADX INFO: renamed from: s9.d$b */
    public static final class b {

        /* JADX INFO: renamed from: N */
        public byte[] f47118N;

        /* JADX INFO: renamed from: T */
        public C7523x f47124T;

        /* JADX INFO: renamed from: U */
        public boolean f47125U;

        /* JADX INFO: renamed from: X */
        public InterfaceC7522w f47128X;

        /* JADX INFO: renamed from: Y */
        public int f47129Y;

        /* JADX INFO: renamed from: a */
        public String f47130a;

        /* JADX INFO: renamed from: b */
        public String f47131b;

        /* JADX INFO: renamed from: c */
        public int f47132c;

        /* JADX INFO: renamed from: d */
        public int f47133d;

        /* JADX INFO: renamed from: e */
        public int f47134e;

        /* JADX INFO: renamed from: f */
        public int f47135f;

        /* JADX INFO: renamed from: g */
        public int f47136g;

        /* JADX INFO: renamed from: h */
        public boolean f47137h;

        /* JADX INFO: renamed from: i */
        public byte[] f47138i;

        /* JADX INFO: renamed from: j */
        public InterfaceC7522w.a f47139j;

        /* JADX INFO: renamed from: k */
        public byte[] f47140k;

        /* JADX INFO: renamed from: l */
        public DrmInitData f47141l;

        /* JADX INFO: renamed from: m */
        public int f47142m = -1;

        /* JADX INFO: renamed from: n */
        public int f47143n = -1;

        /* JADX INFO: renamed from: o */
        public int f47144o = -1;

        /* JADX INFO: renamed from: p */
        public int f47145p = -1;

        /* JADX INFO: renamed from: q */
        public int f47146q = 0;

        /* JADX INFO: renamed from: r */
        public int f47147r = -1;

        /* JADX INFO: renamed from: s */
        public float f47148s = 0.0f;

        /* JADX INFO: renamed from: t */
        public float f47149t = 0.0f;

        /* JADX INFO: renamed from: u */
        public float f47150u = 0.0f;

        /* JADX INFO: renamed from: v */
        public byte[] f47151v = null;

        /* JADX INFO: renamed from: w */
        public int f47152w = -1;

        /* JADX INFO: renamed from: x */
        public boolean f47153x = false;

        /* JADX INFO: renamed from: y */
        public int f47154y = -1;

        /* JADX INFO: renamed from: z */
        public int f47155z = -1;

        /* JADX INFO: renamed from: A */
        public int f47105A = -1;

        /* JADX INFO: renamed from: B */
        public int f47106B = 1000;

        /* JADX INFO: renamed from: C */
        public int f47107C = 200;

        /* JADX INFO: renamed from: D */
        public float f47108D = -1.0f;

        /* JADX INFO: renamed from: E */
        public float f47109E = -1.0f;

        /* JADX INFO: renamed from: F */
        public float f47110F = -1.0f;

        /* JADX INFO: renamed from: G */
        public float f47111G = -1.0f;

        /* JADX INFO: renamed from: H */
        public float f47112H = -1.0f;

        /* JADX INFO: renamed from: I */
        public float f47113I = -1.0f;

        /* JADX INFO: renamed from: J */
        public float f47114J = -1.0f;

        /* JADX INFO: renamed from: K */
        public float f47115K = -1.0f;

        /* JADX INFO: renamed from: L */
        public float f47116L = -1.0f;

        /* JADX INFO: renamed from: M */
        public float f47117M = -1.0f;

        /* JADX INFO: renamed from: O */
        public int f47119O = 1;

        /* JADX INFO: renamed from: P */
        public int f47120P = -1;

        /* JADX INFO: renamed from: Q */
        public int f47121Q = 8000;

        /* JADX INFO: renamed from: R */
        public long f47122R = 0;

        /* JADX INFO: renamed from: S */
        public long f47123S = 0;

        /* JADX INFO: renamed from: V */
        public boolean f47126V = true;

        /* JADX INFO: renamed from: W */
        public String f47127W = "eng";

        /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
        @EnsuresNonNull({"codecPrivate"})
        /* JADX INFO: renamed from: a */
        public final byte[] m17227a(String str) throws ParserException {
            byte[] bArr = this.f47140k;
            if (bArr != null) {
                return bArr;
            }
            throw ParserException.m6770a("Missing CodecPrivate for codec " + str, null);
        }
    }

    static {
        HashMap map = new HashMap();
        C0141b.m618n(0, map, "htc_video_rotA-000", 90, "htc_video_rotA-090", 180, "htc_video_rotA-180", 270, "htc_video_rotA-270");
        f47049h0 = Collections.unmodifiableMap(map);
    }

    public C8982d() {
        C8979a c8979a = new C8979a();
        this.f47094q = -1L;
        this.f47095r = -9223372036854775807L;
        this.f47096s = -9223372036854775807L;
        this.f47097t = -9223372036854775807L;
        this.f47103z = -1L;
        this.f47050A = -1L;
        this.f47051B = -9223372036854775807L;
        this.f47076a = c8979a;
        c8979a.f47038d = new a();
        this.f47081d = true;
        this.f47078b = new C8984f();
        this.f47080c = new SparseArray<>();
        this.f47084g = new C10151t(4);
        this.f47085h = new C10151t(ByteBuffer.allocate(4).putInt(-1).array());
        this.f47086i = new C10151t(4);
        this.f47082e = new C10151t(C10148q.f51402a);
        this.f47083f = new C10151t(4);
        this.f47087j = new C10151t();
        this.f47088k = new C10151t();
        this.f47089l = new C10151t(8);
        this.f47090m = new C10151t();
        this.f47091n = new C10151t();
        this.f47061L = new int[1];
    }

    /* JADX INFO: renamed from: h */
    public static byte[] m17217h(long j10, long j11, String str) {
        C10129a.m18990b(j10 != -9223372036854775807L);
        int i10 = (int) (j10 / 3600000000L);
        long j12 = j10 - ((((long) i10) * 3600) * 1000000);
        int i11 = (int) (j12 / 60000000);
        long j13 = j12 - ((((long) i11) * 60) * 1000000);
        int i12 = (int) (j13 / 1000000);
        return C10134c0.m19018C(String.format(Locale.US, str, Integer.valueOf(i10), Integer.valueOf(i11), Integer.valueOf(i12), Integer.valueOf((int) ((j13 - (((long) i12) * 1000000)) / j11))));
    }

    @EnsuresNonNull({"cueTimesUs", "cueClusterPositions"})
    /* JADX INFO: renamed from: a */
    public final void m17218a(int i10) throws ParserException {
        if (this.f47052C == null || this.f47053D == null) {
            throw ParserException.m6770a("Element " + i10 + " must be in a Cues", null);
        }
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @EnsuresNonNull({"currentTrack"})
    /* JADX INFO: renamed from: b */
    public final void m17219b(int i10) throws ParserException {
        if (this.f47098u != null) {
            return;
        }
        throw ParserException.m6770a("Element " + i10 + " must be in a TrackEntry", null);
    }

    /* JADX WARN: Code duplicated, block: B:35:0x0092  */
    @RequiresNonNull({"#1.output"})
    /* JADX INFO: renamed from: c */
    public final void m17220c(b bVar, long j10, int i10, int i11, int i12) {
        byte b10;
        byte[] bArrM17217h;
        int i13;
        int i14;
        C7523x c7523x = bVar.f47124T;
        if (c7523x != null) {
            c7523x.m15024b(bVar.f47128X, j10, i10, i11, i12, bVar.f47139j);
        } else {
            if ("S_TEXT/UTF8".equals(bVar.f47131b) || "S_TEXT/ASS".equals(bVar.f47131b) || "S_TEXT/WEBVTT".equals(bVar.f47131b)) {
                if (this.f47060K > 1) {
                    C10145n.m19099g("MatroskaExtractor", "Skipping subtitle sample in laced block.");
                } else {
                    long j11 = this.f47058I;
                    if (j11 == -9223372036854775807L) {
                        C10145n.m19099g("MatroskaExtractor", "Skipping subtitle sample with no duration.");
                    } else {
                        String str = bVar.f47131b;
                        C10151t c10151t = this.f47088k;
                        byte[] bArr = c10151t.f51438a;
                        str.getClass();
                        int iHashCode = str.hashCode();
                        if (iHashCode != 738597099) {
                            if (iHashCode != 1045209816) {
                                if (iHashCode == 1422270023 && str.equals("S_TEXT/UTF8")) {
                                    b10 = 2;
                                } else {
                                    b10 = -1;
                                }
                            } else if (str.equals("S_TEXT/WEBVTT")) {
                                b10 = 1;
                            } else {
                                b10 = -1;
                            }
                        } else if (str.equals("S_TEXT/ASS")) {
                            b10 = 0;
                        } else {
                            b10 = -1;
                        }
                        if (b10 == 0) {
                            bArrM17217h = m17217h(j11, 10000L, "%01d:%02d:%02d:%02d");
                            i13 = 21;
                        } else if (b10 == 1) {
                            bArrM17217h = m17217h(j11, 1000L, "%02d:%02d:%02d.%03d");
                            i13 = 25;
                        } else {
                            if (b10 != 2) {
                                throw new IllegalArgumentException();
                            }
                            bArrM17217h = m17217h(j11, 1000L, "%02d:%02d:%02d,%03d");
                            i13 = 19;
                        }
                        System.arraycopy(bArrM17217h, 0, bArr, i13, bArrM17217h.length);
                        for (int i15 = c10151t.f51439b; i15 < c10151t.f51440c; i15++) {
                            if (c10151t.f51438a[i15] == 0) {
                                c10151t.m19123D(i15);
                                break;
                            }
                        }
                        bVar.f47128X.m15021c(c10151t.f51440c, c10151t);
                        i14 = i11 + c10151t.f51440c;
                    }
                }
                i14 = i11;
            } else {
                i14 = i11;
            }
            if ((i10 & 268435456) != 0) {
                int i16 = this.f47060K;
                C10151t c10151t2 = this.f47091n;
                if (i16 > 1) {
                    c10151t2.m19121B(0);
                } else {
                    int i17 = c10151t2.f51440c;
                    bVar.f47128X.mo7386b(i17, c10151t2);
                    i14 += i17;
                }
            }
            bVar.f47128X.mo7387e(j10, i10, i14, i12, bVar.f47139j);
        }
        this.f47055F = true;
    }

    /* JADX WARN: Code duplicated, block: B:411:0x08e2  */
    /* JADX WARN: Code duplicated, block: B:528:0x0a61 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:530:0x0a66 A[SYNTHETIC] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v11, types: [int[]] */
    /* JADX WARN: Type inference failed for: r12v17 */
    /* JADX WARN: Type inference failed for: r12v18, types: [int] */
    /* JADX WARN: Type inference failed for: r12v28 */
    /* JADX WARN: Type inference failed for: r14v9, types: [int] */
    /* JADX WARN: Type inference failed for: r2v121 */
    /* JADX WARN: Type inference failed for: r2v128 */
    /* JADX WARN: Type inference failed for: r2v184 */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // p261m9.InterfaceC7507h
    /* JADX INFO: renamed from: d */
    public final int mo12865d(InterfaceC7508i interfaceC7508i, C7519t c7519t) throws IOException {
        int i10;
        int i11;
        int i12;
        int i13;
        String str;
        int i14;
        C7504e c7504e;
        long j10;
        int i15;
        int i16;
        long j11;
        boolean z10;
        C7519t c7519t2;
        boolean z11;
        C7519t c7519t3 = c7519t;
        boolean z12 = false;
        this.f47055F = false;
        boolean z13 = true;
        boolean z14 = true;
        while (true) {
            byte b10 = -1;
            if (z14 && !this.f47055F) {
                C8979a c8979a = (C8979a) this.f47076a;
                C10129a.m18993e(c8979a.f47038d);
                boolean z15 = z12;
                while (true) {
                    ArrayDeque<C8979a.a> arrayDeque = c8979a.f47036b;
                    C8979a.a aVarPeek = arrayDeque.peek();
                    if (aVarPeek == null || ((C7504e) interfaceC7508i).f41477d < aVarPeek.f47043b) {
                        int i17 = c8979a.f47039e;
                        char c10 = '\b';
                        int i18 = 4;
                        byte[] bArr = c8979a.f47035a;
                        C8984f c8984f = c8979a.f47037c;
                        if (i17 == 0) {
                            C7504e c7504e2 = (C7504e) interfaceC7508i;
                            long jM17230b = c8984f.m17230b(c7504e2, z13, z15, 4);
                            if (jM17230b == -2) {
                                c7504e2.f41479f = z15 ? 1 : 0;
                                while (true) {
                                    c7504e2.mo14994c(bArr, z15 ? 1 : 0, i18, z15);
                                    byte b11 = bArr[z15 ? 1 : 0];
                                    int i19 = z15 ? 1 : 0;
                                    while (true) {
                                        if (i19 < c10) {
                                            long j12 = C8984f.f47158d[i19] & ((long) b11);
                                            i19++;
                                            if (j12 == 0) {
                                                c10 = '\b';
                                            }
                                        } else {
                                            i19 = b10;
                                        }
                                    }
                                    if (i19 != b10 && i19 <= 4) {
                                        int iM17229a = (int) C8984f.m17229a(bArr, i19, z15);
                                        C8982d.this.getClass();
                                        if ((iM17229a == 357149030 || iM17229a == 524531317 || iM17229a == 475249515 || iM17229a == 374648427) ? true : z15 ? 1 : 0) {
                                            c7504e2.mo14998j(i19);
                                            j11 = iM17229a;
                                            z13 = true;
                                        }
                                    }
                                    c7504e2.mo14998j(1);
                                    c10 = '\b';
                                    i18 = 4;
                                }
                            } else {
                                j11 = jM17230b;
                            }
                            if (j11 == -1) {
                                z10 = z15 ? 1 : 0;
                            } else {
                                c8979a.f47040f = (int) j11;
                                c8979a.f47039e = z13 ? 1 : 0;
                            }
                        }
                        if (c8979a.f47039e == z13) {
                            c8979a.f47041g = c8984f.m17230b((C7504e) interfaceC7508i, z15, z13, 8);
                            c8979a.f47039e = 2;
                        }
                        InterfaceC8980b interfaceC8980b = c8979a.f47038d;
                        int i20 = c8979a.f47040f;
                        C8982d.this.getClass();
                        switch (i20) {
                            case 131:
                            case 136:
                            case 155:
                            case 159:
                            case 176:
                            case 179:
                            case 186:
                            case 215:
                            case 231:
                            case 238:
                            case 241:
                            case 251:
                            case 16871:
                            case 16980:
                            case 17029:
                            case 17143:
                            case 18401:
                            case 18408:
                            case 20529:
                            case 20530:
                            case 21420:
                            case 21432:
                            case 21680:
                            case 21682:
                            case 21690:
                            case 21930:
                            case 21945:
                            case 21946:
                            case 21947:
                            case 21948:
                            case 21949:
                            case 21998:
                            case 22186:
                            case 22203:
                            case 25188:
                            case 30114:
                            case 30321:
                            case 2352003:
                            case 2807729:
                                i10 = 2;
                                break;
                            case 134:
                            case 17026:
                            case 21358:
                            case 2274716:
                                i10 = 3;
                                break;
                            case 160:
                            case 166:
                            case 174:
                            case 183:
                            case 187:
                            case 224:
                            case 225:
                            case 16868:
                            case 18407:
                            case 19899:
                            case 20532:
                            case 20533:
                            case 21936:
                            case 21968:
                            case 25152:
                            case 28032:
                            case 30113:
                            case 30320:
                            case 290298740:
                            case 357149030:
                            case 374648427:
                            case 408125543:
                            case 440786851:
                            case 475249515:
                            case 524531317:
                                i10 = 1;
                                break;
                            case 161:
                            case 163:
                            case 165:
                            case 16877:
                            case 16981:
                            case 18402:
                            case 21419:
                            case 25506:
                            case 30322:
                                i10 = 4;
                                break;
                            case 181:
                            case 17545:
                            case 21969:
                            case 21970:
                            case 21971:
                            case 21972:
                            case 21973:
                            case 21974:
                            case 21975:
                            case 21976:
                            case 21977:
                            case 21978:
                            case 30323:
                            case 30324:
                            case 30325:
                                i10 = 5;
                                break;
                            default:
                                i10 = z15 ? 1 : 0;
                                break;
                        }
                        if (i10 == 0) {
                            ((C7504e) interfaceC7508i).mo14998j((int) c8979a.f47041g);
                            z15 = false;
                            c8979a.f47039e = 0;
                            b10 = -1;
                            z13 = true;
                            c7519t3 = c7519t3;
                        } else if (i10 == 1) {
                            long j13 = ((C7504e) interfaceC7508i).f41477d;
                            arrayDeque.push(new C8979a.a(c8979a.f47040f, c8979a.f47041g + j13));
                            InterfaceC8980b interfaceC8980b2 = c8979a.f47038d;
                            int i21 = c8979a.f47040f;
                            long j14 = c8979a.f47041g;
                            C8982d c8982d = C8982d.this;
                            C10129a.m18993e(c8982d.f47079b0);
                            if (i21 == 160) {
                                i11 = 0;
                                c8982d.f47066Q = false;
                                c8982d.f47067R = 0L;
                            } else if (i21 == 174) {
                                i11 = 0;
                                c8982d.f47098u = new b();
                            } else if (i21 != 187) {
                                if (i21 == 19899) {
                                    c8982d.f47100w = -1;
                                    c8982d.f47101x = -1L;
                                } else if (i21 == 20533) {
                                    c8982d.m17219b(i21);
                                    c8982d.f47098u.f47137h = true;
                                } else if (i21 == 21968) {
                                    c8982d.m17219b(i21);
                                    c8982d.f47098u.f47153x = true;
                                } else if (i21 == 408125543) {
                                    long j15 = c8982d.f47094q;
                                    if (j15 != -1 && j15 != j13) {
                                        throw ParserException.m6770a("Multiple Segment elements not supported", null);
                                    }
                                    c8982d.f47094q = j13;
                                    c8982d.f47093p = j14;
                                } else if (i21 == 475249515) {
                                    c8982d.f47052C = new C6153k(2);
                                    c8982d.f47053D = new C6153k(2);
                                } else if (i21 == 524531317 && !c8982d.f47099v) {
                                    if (!c8982d.f47081d || c8982d.f47103z == -1) {
                                        c8982d.f47079b0.mo7364c(new InterfaceC7520u.b(c8982d.f47097t));
                                        c8982d.f47099v = true;
                                    } else {
                                        c8982d.f47102y = true;
                                    }
                                }
                                i11 = 0;
                            } else {
                                i11 = 0;
                                c8982d.f47054E = false;
                            }
                            c8979a.f47039e = i11;
                        } else if (i10 == 2) {
                            long j16 = c8979a.f47041g;
                            if (j16 > 8) {
                                throw ParserException.m6770a("Invalid integer size: " + c8979a.f47041g, null);
                            }
                            InterfaceC8980b interfaceC8980b3 = c8979a.f47038d;
                            int i22 = c8979a.f47040f;
                            int i23 = (int) j16;
                            ((C7504e) interfaceC7508i).mo14993b(bArr, 0, i23, false);
                            long j17 = 0;
                            for (int i24 = 0; i24 < i23; i24++) {
                                j17 = (j17 << 8) | ((long) (bArr[i24] & 255));
                            }
                            C8982d c8982d2 = C8982d.this;
                            c8982d2.getClass();
                            if (i22 != 20529) {
                                if (i22 != 20530) {
                                    switch (i22) {
                                        case 131:
                                            c8982d2.m17219b(i22);
                                            c8982d2.f47098u.f47133d = (int) j17;
                                            break;
                                        case 136:
                                            c8982d2.m17219b(i22);
                                            c8982d2.f47098u.f47126V = j17 == 1;
                                            break;
                                        case 155:
                                            c8982d2.f47058I = c8982d2.m17223k(j17);
                                            break;
                                        case 159:
                                            c8982d2.m17219b(i22);
                                            c8982d2.f47098u.f47119O = (int) j17;
                                            break;
                                        case 176:
                                            c8982d2.m17219b(i22);
                                            c8982d2.f47098u.f47142m = (int) j17;
                                            break;
                                        case 179:
                                            c8982d2.m17218a(i22);
                                            c8982d2.f47052C.m12659a(c8982d2.m17223k(j17));
                                            break;
                                        case 186:
                                            c8982d2.m17219b(i22);
                                            c8982d2.f47098u.f47143n = (int) j17;
                                            break;
                                        case 215:
                                            c8982d2.m17219b(i22);
                                            c8982d2.f47098u.f47132c = (int) j17;
                                            break;
                                        case 231:
                                            c8982d2.f47051B = c8982d2.m17223k(j17);
                                            break;
                                        case 238:
                                            c8982d2.f47065P = (int) j17;
                                            break;
                                        case 241:
                                            if (!c8982d2.f47054E) {
                                                c8982d2.m17218a(i22);
                                                c8982d2.f47053D.m12659a(j17);
                                                c8982d2.f47054E = true;
                                            }
                                            break;
                                        case 251:
                                            c8982d2.f47066Q = true;
                                            break;
                                        case 16871:
                                            c8982d2.m17219b(i22);
                                            c8982d2.f47098u.f47136g = (int) j17;
                                            break;
                                        case 16980:
                                            if (j17 != 3) {
                                                throw ParserException.m6770a("ContentCompAlgo " + j17 + " not supported", null);
                                            }
                                            break;
                                        case 17029:
                                            if (j17 < 1 || j17 > 2) {
                                                throw ParserException.m6770a("DocTypeReadVersion " + j17 + " not supported", null);
                                            }
                                            break;
                                        case 17143:
                                            if (j17 != 1) {
                                                throw ParserException.m6770a("EBMLReadVersion " + j17 + " not supported", null);
                                            }
                                            break;
                                        case 18401:
                                            if (j17 != 5) {
                                                throw ParserException.m6770a("ContentEncAlgo " + j17 + " not supported", null);
                                            }
                                            break;
                                        case 18408:
                                            if (j17 != 1) {
                                                throw ParserException.m6770a("AESSettingsCipherMode " + j17 + " not supported", null);
                                            }
                                            break;
                                        case 21420:
                                            c8982d2.f47101x = j17 + c8982d2.f47094q;
                                            break;
                                        case 21432:
                                            int i25 = (int) j17;
                                            c8982d2.m17219b(i22);
                                            if (i25 == 0) {
                                                c8982d2.f47098u.f47152w = 0;
                                            } else if (i25 == 1) {
                                                c8982d2.f47098u.f47152w = 2;
                                            } else if (i25 == 3) {
                                                c8982d2.f47098u.f47152w = 1;
                                            } else if (i25 == 15) {
                                                c8982d2.f47098u.f47152w = 3;
                                            }
                                            break;
                                        case 21680:
                                            c8982d2.m17219b(i22);
                                            c8982d2.f47098u.f47144o = (int) j17;
                                            break;
                                        case 21682:
                                            c8982d2.m17219b(i22);
                                            c8982d2.f47098u.f47146q = (int) j17;
                                            break;
                                        case 21690:
                                            c8982d2.m17219b(i22);
                                            c8982d2.f47098u.f47145p = (int) j17;
                                            break;
                                        case 21930:
                                            c8982d2.m17219b(i22);
                                            c8982d2.f47098u.f47125U = j17 == 1;
                                            break;
                                        case 21998:
                                            c8982d2.m17219b(i22);
                                            c8982d2.f47098u.f47135f = (int) j17;
                                            break;
                                        case 22186:
                                            c8982d2.m17219b(i22);
                                            c8982d2.f47098u.f47122R = j17;
                                            break;
                                        case 22203:
                                            c8982d2.m17219b(i22);
                                            c8982d2.f47098u.f47123S = j17;
                                            break;
                                        case 25188:
                                            c8982d2.m17219b(i22);
                                            c8982d2.f47098u.f47120P = (int) j17;
                                            break;
                                        case 30114:
                                            c8982d2.f47067R = j17;
                                            break;
                                        case 30321:
                                            c8982d2.m17219b(i22);
                                            int i26 = (int) j17;
                                            if (i26 == 0) {
                                                c8982d2.f47098u.f47147r = 0;
                                            } else if (i26 == 1) {
                                                c8982d2.f47098u.f47147r = 1;
                                            } else if (i26 == 2) {
                                                c8982d2.f47098u.f47147r = 2;
                                            } else if (i26 == 3) {
                                                c8982d2.f47098u.f47147r = 3;
                                            }
                                            break;
                                        case 2352003:
                                            c8982d2.m17219b(i22);
                                            c8982d2.f47098u.f47134e = (int) j17;
                                            break;
                                        case 2807729:
                                            c8982d2.f47095r = j17;
                                            break;
                                        default:
                                            switch (i22) {
                                                case 21945:
                                                    c8982d2.m17219b(i22);
                                                    int i27 = (int) j17;
                                                    if (i27 == 1) {
                                                        c8982d2.f47098u.f47105A = 2;
                                                    } else if (i27 == 2) {
                                                        c8982d2.f47098u.f47105A = 1;
                                                    }
                                                    break;
                                                case 21946:
                                                    c8982d2.m17219b(i22);
                                                    int i28 = (int) j17;
                                                    String str2 = C10320b.f51891f;
                                                    if (i28 == 1) {
                                                        i12 = 3;
                                                    } else if (i28 == 16) {
                                                        i12 = 6;
                                                    } else if (i28 == 18) {
                                                        i12 = 7;
                                                    } else if (i28 == 6 || i28 == 7) {
                                                        i12 = 3;
                                                    } else {
                                                        i12 = -1;
                                                    }
                                                    if (i12 != -1) {
                                                        c8982d2.f47098u.f47155z = i12;
                                                    }
                                                    break;
                                                case 21947:
                                                    c8982d2.m17219b(i22);
                                                    b bVar = c8982d2.f47098u;
                                                    bVar.f47153x = true;
                                                    int i29 = (int) j17;
                                                    String str3 = C10320b.f51891f;
                                                    if (i29 == 1) {
                                                        i13 = 1;
                                                    } else if (i29 != 9) {
                                                        i13 = (i29 == 4 || i29 == 5 || i29 == 6 || i29 == 7) ? 2 : -1;
                                                    } else {
                                                        i13 = 6;
                                                    }
                                                    if (i13 != -1) {
                                                        bVar.f47154y = i13;
                                                    }
                                                    break;
                                                case 21948:
                                                    c8982d2.m17219b(i22);
                                                    c8982d2.f47098u.f47106B = (int) j17;
                                                    break;
                                                case 21949:
                                                    c8982d2.m17219b(i22);
                                                    c8982d2.f47098u.f47107C = (int) j17;
                                                    break;
                                            }
                                            break;
                                    }
                                } else if (j17 != 1) {
                                    throw ParserException.m6770a("ContentEncodingScope " + j17 + " not supported", null);
                                }
                            } else if (j17 != 0) {
                                throw ParserException.m6770a("ContentEncodingOrder " + j17 + " not supported", null);
                            }
                            c8979a.f47039e = 0;
                        } else if (i10 == 3) {
                            long j18 = c8979a.f47041g;
                            if (j18 > 2147483647L) {
                                throw ParserException.m6770a("String element size: " + c8979a.f47041g, null);
                            }
                            InterfaceC8980b interfaceC8980b4 = c8979a.f47038d;
                            int i30 = c8979a.f47040f;
                            int i31 = (int) j18;
                            if (i31 == 0) {
                                str = "";
                            } else {
                                byte[] bArr2 = new byte[i31];
                                ((C7504e) interfaceC7508i).mo14993b(bArr2, 0, i31, false);
                                while (i31 > 0) {
                                    int i32 = i31 - 1;
                                    if (bArr2[i32] == 0) {
                                        i31 = i32;
                                    } else {
                                        str = new String(bArr2, 0, i31);
                                    }
                                }
                                str = new String(bArr2, 0, i31);
                            }
                            C8982d c8982d3 = C8982d.this;
                            c8982d3.getClass();
                            if (i30 == 134) {
                                c8982d3.m17219b(i30);
                                c8982d3.f47098u.f47131b = str;
                            } else if (i30 != 17026) {
                                if (i30 == 21358) {
                                    c8982d3.m17219b(i30);
                                    c8982d3.f47098u.f47130a = str;
                                } else if (i30 == 2274716) {
                                    c8982d3.m17219b(i30);
                                    c8982d3.f47098u.f47127W = str;
                                }
                            } else if (!"webm".equals(str) && !"matroska".equals(str)) {
                                throw ParserException.m6770a("DocType " + str + " not supported", null);
                            }
                            c8979a.f47039e = 0;
                        } else if (i10 == 4) {
                            InterfaceC8980b interfaceC8980b5 = c8979a.f47038d;
                            int i33 = c8979a.f47040f;
                            int i34 = (int) c8979a.f47041g;
                            C8982d c8982d4 = C8982d.this;
                            SparseArray<b> sparseArray = c8982d4.f47080c;
                            if (i33 == 161 || i33 == 163) {
                                int i35 = c8982d4.f47056G;
                                C10151t c10151t = c8982d4.f47084g;
                                if (i35 == 0) {
                                    C8984f c8984f2 = c8982d4.f47078b;
                                    c8982d4.f47062M = (int) c8984f2.m17230b((C7504e) interfaceC7508i, z15, true, 8);
                                    c8982d4.f47063N = c8984f2.f47161c;
                                    c8982d4.f47058I = -9223372036854775807L;
                                    c8982d4.f47056G = 1;
                                    c10151t.m19121B(z15 ? 1 : 0);
                                }
                                b bVar2 = sparseArray.get(c8982d4.f47062M);
                                if (bVar2 == null) {
                                    ((C7504e) interfaceC7508i).mo14998j(i34 - c8982d4.f47063N);
                                    c8982d4.f47056G = z15 ? 1 : 0;
                                } else {
                                    bVar2.f47128X.getClass();
                                    if (c8982d4.f47056G == 1) {
                                        C7504e c7504e3 = (C7504e) interfaceC7508i;
                                        c8982d4.m17221i(c7504e3, 3);
                                        int i36 = (c10151t.f51438a[2] & 6) >> 1;
                                        if (i36 == 0) {
                                            c8982d4.f47060K = 1;
                                            int[] iArr = c8982d4.f47061L;
                                            if (iArr == null) {
                                                iArr = new int[1];
                                            } else if (iArr.length < 1) {
                                                iArr = new int[Math.max(iArr.length * 2, 1)];
                                            }
                                            c8982d4.f47061L = iArr;
                                            iArr[z15 ? 1 : 0] = (i34 - c8982d4.f47063N) - 3;
                                        } else {
                                            c8982d4.m17221i(c7504e3, 4);
                                            int i37 = (c10151t.f51438a[3] & 255) + 1;
                                            c8982d4.f47060K = i37;
                                            int[] iArr2 = c8982d4.f47061L;
                                            if (iArr2 == null) {
                                                iArr2 = new int[i37];
                                            } else if (iArr2.length < i37) {
                                                iArr2 = new int[Math.max(iArr2.length * 2, i37)];
                                            }
                                            c8982d4.f47061L = iArr2;
                                            if (i36 == 2) {
                                                int i38 = (i34 - c8982d4.f47063N) - 4;
                                                int i39 = c8982d4.f47060K;
                                                Arrays.fill(iArr2, z15 ? 1 : 0, i39, i38 / i39);
                                            } else if (i36 == 1) {
                                                int i40 = z15 ? 1 : 0;
                                                int i41 = i40;
                                                int i42 = 4;
                                                while (true) {
                                                    int i43 = c8982d4.f47060K - 1;
                                                    if (i40 < i43) {
                                                        c8982d4.f47061L[i40] = z15 ? 1 : 0;
                                                        while (true) {
                                                            i15 = i42 + 1;
                                                            c8982d4.m17221i(c7504e3, i15);
                                                            int i44 = c10151t.f51438a[i15 - 1] & 255;
                                                            int[] iArr3 = c8982d4.f47061L;
                                                            i16 = iArr3[i40] + i44;
                                                            iArr3[i40] = i16;
                                                            if (i44 != 255) {
                                                                break;
                                                            }
                                                            i42 = i15;
                                                        }
                                                        i41 += i16;
                                                        i40++;
                                                        i42 = i15;
                                                    } else {
                                                        c8982d4.f47061L[i43] = ((i34 - c8982d4.f47063N) - i42) - i41;
                                                    }
                                                }
                                            } else {
                                                if (i36 != 3) {
                                                    throw ParserException.m6770a("Unexpected lacing value: " + i36, null);
                                                }
                                                int i45 = z15 ? 1 : 0;
                                                int i46 = i45;
                                                int i47 = 4;
                                                ?? r10 = z15;
                                                while (true) {
                                                    int i48 = c8982d4.f47060K - 1;
                                                    if (i45 < i48) {
                                                        c8982d4.f47061L[i45] = r10;
                                                        int i49 = i47 + 1;
                                                        c8982d4.m17221i(c7504e3, i49);
                                                        int i50 = i49 - 1;
                                                        if (c10151t.f51438a[i50] == 0) {
                                                            throw ParserException.m6770a("No valid varint length mask found", null);
                                                        }
                                                        ?? r12 = r10;
                                                        while (true) {
                                                            if (r12 < 8) {
                                                                int i51 = 1 << (7 - r12);
                                                                if ((c10151t.f51438a[i50] & i51) != 0) {
                                                                    int i52 = i49 + r12;
                                                                    c8982d4.m17221i(c7504e3, i52);
                                                                    int i53 = i50 + 1;
                                                                    j10 = c10151t.f51438a[i50] & 255 & (~i51);
                                                                    for (int i54 = i53; i54 < i52; i54++) {
                                                                        j10 = (j10 << 8) | ((long) (c10151t.f51438a[i54] & 255));
                                                                        c7504e3 = c7504e3;
                                                                    }
                                                                    c7504e = c7504e3;
                                                                    if (i45 > 0) {
                                                                        j10 -= (1 << ((r12 * 7) + 6)) - 1;
                                                                    }
                                                                    i47 = i52;
                                                                } else {
                                                                    r12++;
                                                                }
                                                            } else {
                                                                c7504e = c7504e3;
                                                                i47 = i49;
                                                                j10 = 0;
                                                            }
                                                        }
                                                        if (j10 < -2147483648L || j10 > 2147483647L) {
                                                            throw ParserException.m6770a("EBML lacing sample size out of range.", null);
                                                        }
                                                        int i55 = (int) j10;
                                                        int[] iArr4 = c8982d4.f47061L;
                                                        if (i45 != 0) {
                                                            i55 += iArr4[i45 - 1];
                                                        }
                                                        iArr4[i45] = i55;
                                                        i46 += i55;
                                                        i45++;
                                                        c7504e3 = c7504e;
                                                        r10 = 0;
                                                    } else {
                                                        c8982d4.f47061L[i48] = ((i34 - c8982d4.f47063N) - i47) - i46;
                                                    }
                                                }
                                            }
                                        }
                                        byte[] bArr3 = c10151t.f51438a;
                                        c8982d4.f47057H = c8982d4.m17223k((bArr3[1] & 255) | (bArr3[0] << 8)) + c8982d4.f47051B;
                                        c8982d4.f47064O = (bVar2.f47133d == 2 || (i33 == 163 && (c10151t.f51438a[2] & 128) == 128)) ? 1 : 0;
                                        c8982d4.f47056G = 2;
                                        c8982d4.f47059J = 0;
                                    }
                                    if (i33 == 163) {
                                        while (true) {
                                            int i56 = c8982d4.f47059J;
                                            if (i56 < c8982d4.f47060K) {
                                                c8982d4.m17220c(bVar2, ((long) ((c8982d4.f47059J * bVar2.f47134e) / 1000)) + c8982d4.f47057H, c8982d4.f47064O, c8982d4.m17224l((C7504e) interfaceC7508i, bVar2, c8982d4.f47061L[i56], false), 0);
                                                c8982d4.f47059J++;
                                            } else {
                                                i14 = 0;
                                                c8982d4.f47056G = 0;
                                            }
                                        }
                                    } else {
                                        while (true) {
                                            int i57 = c8982d4.f47059J;
                                            if (i57 < c8982d4.f47060K) {
                                                int[] iArr5 = c8982d4.f47061L;
                                                iArr5[i57] = c8982d4.m17224l((C7504e) interfaceC7508i, bVar2, iArr5[i57], true);
                                                c8982d4.f47059J++;
                                            } else {
                                                i14 = 0;
                                            }
                                        }
                                    }
                                }
                                c8979a.f47039e = i14;
                            } else if (i33 != 165) {
                                if (i33 == 16877) {
                                    c8982d4.m17219b(i33);
                                    b bVar3 = c8982d4.f47098u;
                                    int i58 = bVar3.f47136g;
                                    if (i58 == 1685485123 || i58 == 1685480259) {
                                        byte[] bArr4 = new byte[i34];
                                        bVar3.f47118N = bArr4;
                                        ((C7504e) interfaceC7508i).mo14993b(bArr4, z15 ? 1 : 0, i34, z15);
                                    } else {
                                        ((C7504e) interfaceC7508i).mo14998j(i34);
                                    }
                                } else if (i33 == 16981) {
                                    c8982d4.m17219b(i33);
                                    byte[] bArr5 = new byte[i34];
                                    c8982d4.f47098u.f47138i = bArr5;
                                    ((C7504e) interfaceC7508i).mo14993b(bArr5, z15 ? 1 : 0, i34, z15);
                                } else if (i33 == 18402) {
                                    byte[] bArr6 = new byte[i34];
                                    ((C7504e) interfaceC7508i).mo14993b(bArr6, z15 ? 1 : 0, i34, z15);
                                    c8982d4.m17219b(i33);
                                    c8982d4.f47098u.f47139j = new InterfaceC7522w.a(1, z15 ? 1 : 0, z15 ? 1 : 0, bArr6);
                                } else if (i33 == 21419) {
                                    C10151t c10151t2 = c8982d4.f47086i;
                                    Arrays.fill(c10151t2.f51438a, z15 ? (byte) 1 : (byte) 0);
                                    ((C7504e) interfaceC7508i).mo14993b(c10151t2.f51438a, 4 - i34, i34, z15);
                                    c10151t2.m19124E(z15 ? 1 : 0);
                                    c8982d4.f47100w = (int) c10151t2.m19146u();
                                } else if (i33 == 25506) {
                                    c8982d4.m17219b(i33);
                                    byte[] bArr7 = new byte[i34];
                                    c8982d4.f47098u.f47140k = bArr7;
                                    ((C7504e) interfaceC7508i).mo14993b(bArr7, z15 ? 1 : 0, i34, z15);
                                } else {
                                    if (i33 != 30322) {
                                        throw ParserException.m6770a("Unexpected id: " + i33, null);
                                    }
                                    c8982d4.m17219b(i33);
                                    byte[] bArr8 = new byte[i34];
                                    c8982d4.f47098u.f47151v = bArr8;
                                    ((C7504e) interfaceC7508i).mo14993b(bArr8, z15 ? 1 : 0, i34, z15);
                                }
                            } else if (c8982d4.f47056G == 2) {
                                b bVar4 = sparseArray.get(c8982d4.f47062M);
                                if (c8982d4.f47065P == 4 && "V_VP9".equals(bVar4.f47131b)) {
                                    C10151t c10151t3 = c8982d4.f47091n;
                                    c10151t3.m19121B(i34);
                                    ((C7504e) interfaceC7508i).mo14993b(c10151t3.f51438a, z15 ? 1 : 0, i34, z15);
                                } else {
                                    ((C7504e) interfaceC7508i).mo14998j(i34);
                                }
                            }
                            i14 = z15 ? 1 : 0;
                            c8979a.f47039e = i14;
                        } else {
                            if (i10 != 5) {
                                throw ParserException.m6770a("Invalid element type " + i10, null);
                            }
                            long j19 = c8979a.f47041g;
                            if (j19 != 4 && j19 != 8) {
                                throw ParserException.m6770a("Invalid float size: " + c8979a.f47041g, null);
                            }
                            InterfaceC8980b interfaceC8980b6 = c8979a.f47038d;
                            int i59 = c8979a.f47040f;
                            int i60 = (int) j19;
                            ((C7504e) interfaceC7508i).mo14993b(bArr, z15 ? 1 : 0, i60, z15);
                            long j20 = 0;
                            for (int i61 = z15 ? 1 : 0; i61 < i60; i61++) {
                                j20 = (j20 << 8) | ((long) (bArr[i61] & 255));
                            }
                            double dIntBitsToFloat = i60 == 4 ? Float.intBitsToFloat((int) j20) : Double.longBitsToDouble(j20);
                            C8982d c8982d5 = C8982d.this;
                            if (i59 == 181) {
                                c8982d5.m17219b(i59);
                                c8982d5.f47098u.f47121Q = (int) dIntBitsToFloat;
                            } else if (i59 != 17545) {
                                switch (i59) {
                                    case 21969:
                                        c8982d5.m17219b(i59);
                                        c8982d5.f47098u.f47108D = (float) dIntBitsToFloat;
                                        break;
                                    case 21970:
                                        c8982d5.m17219b(i59);
                                        c8982d5.f47098u.f47109E = (float) dIntBitsToFloat;
                                        break;
                                    case 21971:
                                        c8982d5.m17219b(i59);
                                        c8982d5.f47098u.f47110F = (float) dIntBitsToFloat;
                                        break;
                                    case 21972:
                                        c8982d5.m17219b(i59);
                                        c8982d5.f47098u.f47111G = (float) dIntBitsToFloat;
                                        break;
                                    case 21973:
                                        c8982d5.m17219b(i59);
                                        c8982d5.f47098u.f47112H = (float) dIntBitsToFloat;
                                        break;
                                    case 21974:
                                        c8982d5.m17219b(i59);
                                        c8982d5.f47098u.f47113I = (float) dIntBitsToFloat;
                                        break;
                                    case 21975:
                                        c8982d5.m17219b(i59);
                                        c8982d5.f47098u.f47114J = (float) dIntBitsToFloat;
                                        break;
                                    case 21976:
                                        c8982d5.m17219b(i59);
                                        c8982d5.f47098u.f47115K = (float) dIntBitsToFloat;
                                        break;
                                    case 21977:
                                        c8982d5.m17219b(i59);
                                        c8982d5.f47098u.f47116L = (float) dIntBitsToFloat;
                                        break;
                                    case 21978:
                                        c8982d5.m17219b(i59);
                                        c8982d5.f47098u.f47117M = (float) dIntBitsToFloat;
                                        break;
                                    default:
                                        switch (i59) {
                                            case 30323:
                                                c8982d5.m17219b(i59);
                                                c8982d5.f47098u.f47148s = (float) dIntBitsToFloat;
                                                break;
                                            case 30324:
                                                c8982d5.m17219b(i59);
                                                c8982d5.f47098u.f47149t = (float) dIntBitsToFloat;
                                                break;
                                            case 30325:
                                                c8982d5.m17219b(i59);
                                                c8982d5.f47098u.f47150u = (float) dIntBitsToFloat;
                                                break;
                                            default:
                                                c8982d5.getClass();
                                                break;
                                        }
                                        break;
                                }
                            } else {
                                c8982d5.f47096s = (long) dIntBitsToFloat;
                            }
                            c8979a.f47039e = z15 ? 1 : 0;
                        }
                    } else {
                        ((a) c8979a.f47038d).m17226a(arrayDeque.pop().f47042a);
                    }
                    z10 = true;
                }
                if (z10) {
                    long j21 = ((C7504e) interfaceC7508i).f41477d;
                    if (this.f47102y) {
                        this.f47050A = j21;
                        c7519t2 = c7519t;
                        c7519t2.f41516a = this.f47103z;
                        this.f47102y = false;
                    } else {
                        c7519t2 = c7519t;
                        if (this.f47099v) {
                            long j22 = this.f47050A;
                            if (j22 != -1) {
                                c7519t2.f41516a = j22;
                                this.f47050A = -1L;
                            }
                            if (z11) {
                                return 1;
                            }
                        }
                        z11 = false;
                        if (z11) {
                            return 1;
                        }
                    }
                    z11 = true;
                    if (z11) {
                        return 1;
                    }
                } else {
                    c7519t2 = c7519t;
                }
                z12 = false;
                C7519t c7519t4 = c7519t2;
                z13 = true;
                c7519t3 = c7519t4;
                z14 = z10;
            }
        }
        if (z14) {
            return 0;
        }
        int i62 = 0;
        while (true) {
            SparseArray<b> sparseArray2 = this.f47080c;
            if (i62 >= sparseArray2.size()) {
                return -1;
            }
            b bVarValueAt = sparseArray2.valueAt(i62);
            bVarValueAt.f47128X.getClass();
            C7523x c7523x = bVarValueAt.f47124T;
            if (c7523x != null) {
                c7523x.m15023a(bVarValueAt.f47128X, bVarValueAt.f47139j);
            }
            i62++;
        }
    }

    @Override // p261m9.InterfaceC7507h
    /* JADX INFO: renamed from: e */
    public final void mo12866e(long j10, long j11) {
        this.f47051B = -9223372036854775807L;
        this.f47056G = 0;
        C8979a c8979a = (C8979a) this.f47076a;
        c8979a.f47039e = 0;
        c8979a.f47036b.clear();
        C8984f c8984f = c8979a.f47037c;
        c8984f.f47160b = 0;
        c8984f.f47161c = 0;
        C8984f c8984f2 = this.f47078b;
        c8984f2.f47160b = 0;
        c8984f2.f47161c = 0;
        m17222j();
        int i10 = 0;
        while (true) {
            SparseArray<b> sparseArray = this.f47080c;
            if (i10 >= sparseArray.size()) {
                return;
            }
            C7523x c7523x = sparseArray.valueAt(i10).f47124T;
            if (c7523x != null) {
                c7523x.f41529b = false;
                c7523x.f41530c = 0;
            }
            i10++;
        }
    }

    @Override // p261m9.InterfaceC7507h
    /* JADX INFO: renamed from: f */
    public final void mo12867f(InterfaceC7509j interfaceC7509j) {
        this.f47079b0 = interfaceC7509j;
    }

    @Override // p261m9.InterfaceC7507h
    /* JADX INFO: renamed from: g */
    public final boolean mo12868g(InterfaceC7508i interfaceC7508i) throws IOException {
        C8983e c8983e = new C8983e();
        C7504e c7504e = (C7504e) interfaceC7508i;
        long j10 = c7504e.f41476c;
        long j11 = 1024;
        if (j10 != -1 && j10 <= 1024) {
            j11 = j10;
        }
        int i10 = (int) j11;
        C10151t c10151t = c8983e.f47156a;
        c7504e.mo14994c(c10151t.f51438a, 0, 4, false);
        c8983e.f47157b = 4;
        for (long jM19146u = c10151t.m19146u(); jM19146u != 440786851; jM19146u = ((jM19146u << 8) & (-256)) | ((long) (c10151t.f51438a[0] & 255))) {
            int i11 = c8983e.f47157b + 1;
            c8983e.f47157b = i11;
            if (i11 == i10) {
                return false;
            }
            c7504e.mo14994c(c10151t.f51438a, 0, 1, false);
        }
        long jM17228a = c8983e.m17228a(c7504e);
        long j12 = c8983e.f47157b;
        if (jM17228a == Long.MIN_VALUE) {
            return false;
        }
        if (j10 != -1 && j12 + jM17228a >= j10) {
            return false;
        }
        while (true) {
            long j13 = c8983e.f47157b;
            long j14 = j12 + jM17228a;
            if (j13 >= j14) {
                return j13 == j14;
            }
            if (c8983e.m17228a(c7504e) == Long.MIN_VALUE) {
                return false;
            }
            long jM17228a2 = c8983e.m17228a(c7504e);
            if (jM17228a2 < 0 || jM17228a2 > 2147483647L) {
                return false;
            }
            if (jM17228a2 != 0) {
                int i12 = (int) jM17228a2;
                c7504e.m15001n(i12, false);
                c8983e.f47157b += i12;
            }
        }
    }

    /* JADX INFO: renamed from: i */
    public final void m17221i(C7504e c7504e, int i10) throws IOException {
        C10151t c10151t = this.f47084g;
        if (c10151t.f51440c >= i10) {
            return;
        }
        byte[] bArr = c10151t.f51438a;
        if (bArr.length < i10) {
            c10151t.m19126a(Math.max(bArr.length * 2, i10));
        }
        byte[] bArr2 = c10151t.f51438a;
        int i11 = c10151t.f51440c;
        c7504e.mo14993b(bArr2, i11, i10 - i11, false);
        c10151t.m19123D(i10);
    }

    /* JADX INFO: renamed from: j */
    public final void m17222j() {
        this.f47068S = 0;
        this.f47069T = 0;
        this.f47070U = 0;
        this.f47071V = false;
        this.f47072W = false;
        this.f47073X = false;
        this.f47074Y = 0;
        this.f47075Z = (byte) 0;
        this.f47077a0 = false;
        this.f47087j.m19121B(0);
    }

    /* JADX INFO: renamed from: k */
    public final long m17223k(long j10) throws ParserException {
        long j11 = this.f47095r;
        if (j11 != -9223372036854775807L) {
            return C10134c0.m19030O(j10, j11, 1000L);
        }
        throw ParserException.m6770a("Can't scale timecode prior to timecodeScale being set.", null);
    }

    @RequiresNonNull({"#2.output"})
    /* JADX INFO: renamed from: l */
    public final int m17224l(C7504e c7504e, b bVar, int i10, boolean z10) throws IOException {
        int iM15022d;
        int iM15022d2;
        boolean z11;
        int i11;
        if ("S_TEXT/UTF8".equals(bVar.f47131b)) {
            m17225m(c7504e, f47044c0, i10);
            int i12 = this.f47069T;
            m17222j();
            return i12;
        }
        if ("S_TEXT/ASS".equals(bVar.f47131b)) {
            m17225m(c7504e, f47046e0, i10);
            int i13 = this.f47069T;
            m17222j();
            return i13;
        }
        if ("S_TEXT/WEBVTT".equals(bVar.f47131b)) {
            m17225m(c7504e, f47047f0, i10);
            int i14 = this.f47069T;
            m17222j();
            return i14;
        }
        InterfaceC7522w interfaceC7522w = bVar.f47128X;
        boolean z12 = this.f47071V;
        C10151t c10151t = this.f47087j;
        if (!z12) {
            boolean z13 = bVar.f47137h;
            C10151t c10151t2 = this.f47084g;
            if (z13) {
                this.f47064O &= -1073741825;
                boolean z14 = this.f47072W;
                int i15 = BuildConfig.SDK_TRUNCATE_LENGTH;
                if (!z14) {
                    c7504e.mo14993b(c10151t2.f51438a, 0, 1, false);
                    this.f47068S++;
                    byte b10 = c10151t2.f51438a[0];
                    if ((b10 & 128) == 128) {
                        throw ParserException.m6770a("Extension bit is set in signal byte", null);
                    }
                    this.f47075Z = b10;
                    this.f47072W = true;
                }
                byte b11 = this.f47075Z;
                if ((b11 & 1) == 1) {
                    boolean z15 = (b11 & 2) == 2;
                    this.f47064O |= 1073741824;
                    if (!this.f47077a0) {
                        C10151t c10151t3 = this.f47089l;
                        c7504e.mo14993b(c10151t3.f51438a, 0, 8, false);
                        this.f47068S += 8;
                        this.f47077a0 = true;
                        byte[] bArr = c10151t2.f51438a;
                        if (!z15) {
                            i15 = 0;
                        }
                        bArr[0] = (byte) (i15 | 8);
                        c10151t2.m19124E(0);
                        interfaceC7522w.mo7386b(1, c10151t2);
                        this.f47069T++;
                        c10151t3.m19124E(0);
                        interfaceC7522w.mo7386b(8, c10151t3);
                        this.f47069T += 8;
                    }
                    if (z15) {
                        if (!this.f47073X) {
                            c7504e.mo14993b(c10151t2.f51438a, 0, 1, false);
                            this.f47068S++;
                            c10151t2.m19124E(0);
                            this.f47074Y = c10151t2.m19145t();
                            this.f47073X = true;
                        }
                        int i16 = this.f47074Y * 4;
                        c10151t2.m19121B(i16);
                        c7504e.mo14993b(c10151t2.f51438a, 0, i16, false);
                        this.f47068S += i16;
                        short s10 = (short) ((this.f47074Y / 2) + 1);
                        int i17 = (s10 * 6) + 2;
                        ByteBuffer byteBuffer = this.f47092o;
                        if (byteBuffer == null || byteBuffer.capacity() < i17) {
                            this.f47092o = ByteBuffer.allocate(i17);
                        }
                        this.f47092o.position(0);
                        this.f47092o.putShort(s10);
                        int i18 = 0;
                        int i19 = 0;
                        while (true) {
                            i11 = this.f47074Y;
                            if (i18 >= i11) {
                                break;
                            }
                            int iM19148w = c10151t2.m19148w();
                            if (i18 % 2 == 0) {
                                this.f47092o.putShort((short) (iM19148w - i19));
                            } else {
                                this.f47092o.putInt(iM19148w - i19);
                            }
                            i18++;
                            i19 = iM19148w;
                        }
                        int i20 = (i10 - this.f47068S) - i19;
                        if (i11 % 2 == 1) {
                            this.f47092o.putInt(i20);
                        } else {
                            this.f47092o.putShort((short) i20);
                            this.f47092o.putInt(0);
                        }
                        byte[] bArrArray = this.f47092o.array();
                        C10151t c10151t4 = this.f47090m;
                        c10151t4.m19122C(bArrArray, i17);
                        interfaceC7522w.mo7386b(i17, c10151t4);
                        this.f47069T += i17;
                    }
                }
            } else {
                byte[] bArr2 = bVar.f47138i;
                if (bArr2 != null) {
                    c10151t.m19122C(bArr2, bArr2.length);
                }
            }
            if ("A_OPUS".equals(bVar.f47131b)) {
                z11 = z10;
            } else {
                z11 = bVar.f47135f > 0;
            }
            if (z11) {
                this.f47064O |= 268435456;
                this.f47091n.m19121B(0);
                int i21 = (c10151t.f51440c + i10) - this.f47068S;
                c10151t2.m19121B(4);
                byte[] bArr3 = c10151t2.f51438a;
                bArr3[0] = (byte) ((i21 >> 24) & 255);
                bArr3[1] = (byte) ((i21 >> 16) & 255);
                bArr3[2] = (byte) ((i21 >> 8) & 255);
                bArr3[3] = (byte) (i21 & 255);
                interfaceC7522w.mo7386b(4, c10151t2);
                this.f47069T += 4;
            }
            this.f47071V = true;
        }
        int i22 = i10 + c10151t.f51440c;
        if (!"V_MPEG4/ISO/AVC".equals(bVar.f47131b) && !"V_MPEGH/ISO/HEVC".equals(bVar.f47131b)) {
            if (bVar.f47124T != null) {
                C10129a.m18992d(c10151t.f51440c == 0);
                bVar.f47124T.m15025c(c7504e);
            }
            while (true) {
                int i23 = this.f47068S;
                if (i23 >= i22) {
                    break;
                }
                int i24 = i22 - i23;
                int i25 = c10151t.f51440c - c10151t.f51439b;
                if (i25 > 0) {
                    iM15022d2 = Math.min(i24, i25);
                    interfaceC7522w.m15021c(iM15022d2, c10151t);
                } else {
                    iM15022d2 = interfaceC7522w.m15022d(c7504e, i24, false);
                }
                this.f47068S += iM15022d2;
                this.f47069T += iM15022d2;
            }
        } else {
            C10151t c10151t5 = this.f47083f;
            byte[] bArr4 = c10151t5.f51438a;
            bArr4[0] = 0;
            bArr4[1] = 0;
            bArr4[2] = 0;
            int i26 = bVar.f47129Y;
            int i27 = 4 - i26;
            while (this.f47068S < i22) {
                int i28 = this.f47070U;
                if (i28 == 0) {
                    int iMin = Math.min(i26, c10151t.f51440c - c10151t.f51439b);
                    c7504e.mo14993b(bArr4, i27 + iMin, i26 - iMin, false);
                    if (iMin > 0) {
                        c10151t.m19127b(bArr4, i27, iMin);
                    }
                    this.f47068S += i26;
                    c10151t5.m19124E(0);
                    this.f47070U = c10151t5.m19148w();
                    C10151t c10151t6 = this.f47082e;
                    c10151t6.m19124E(0);
                    interfaceC7522w.m15021c(4, c10151t6);
                    this.f47069T += 4;
                } else {
                    int i29 = c10151t.f51440c - c10151t.f51439b;
                    if (i29 > 0) {
                        iM15022d = Math.min(i28, i29);
                        interfaceC7522w.m15021c(iM15022d, c10151t);
                    } else {
                        iM15022d = interfaceC7522w.m15022d(c7504e, i28, false);
                    }
                    this.f47068S += iM15022d;
                    this.f47069T += iM15022d;
                    this.f47070U -= iM15022d;
                }
            }
        }
        if ("A_VORBIS".equals(bVar.f47131b)) {
            C10151t c10151t7 = this.f47085h;
            c10151t7.m19124E(0);
            interfaceC7522w.m15021c(4, c10151t7);
            this.f47069T += 4;
        }
        int i30 = this.f47069T;
        m17222j();
        return i30;
    }

    /* JADX INFO: renamed from: m */
    public final void m17225m(C7504e c7504e, byte[] bArr, int i10) throws IOException {
        int length = bArr.length + i10;
        C10151t c10151t = this.f47088k;
        byte[] bArr2 = c10151t.f51438a;
        if (bArr2.length < length) {
            byte[] bArrCopyOf = Arrays.copyOf(bArr, length + i10);
            c10151t.m19122C(bArrCopyOf, bArrCopyOf.length);
        } else {
            System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
        }
        c7504e.mo14993b(c10151t.f51438a, bArr.length, i10, false);
        c10151t.m19124E(0);
        c10151t.m19123D(length);
    }

    @Override // p261m9.InterfaceC7507h
    public final void release() {
    }
}
