package p000;

import android.util.Pair;
import android.util.SparseArray;
import androidx.datastore.preferences.protobuf.DescriptorProtos;
import androidx.media3.common.C0713b;
import androidx.media3.common.DrmInitData;
import androidx.media3.common.ParserException;
import com.google.common.collect.ImmutableList;
import java.io.EOFException;
import java.io.InterruptedIOException;
import java.math.RoundingMode;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.charset.StandardCharsets;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.UUID;

/* JADX INFO: loaded from: classes2.dex */
public final class zs5 implements hy2 {

    /* JADX INFO: renamed from: k0 */
    public static final byte[] f72040k0 = {49, 10, 48, 48, 58, 48, 48, 58, 48, 48, 44, 48, 48, 48, 32, 45, 45, 62, 32, 48, 48, 58, 48, 48, 58, 48, 48, 44, 48, 48, 48, 10};

    /* JADX INFO: renamed from: l0 */
    public static final byte[] f72041l0;

    /* JADX INFO: renamed from: m0 */
    public static final byte[] f72042m0;

    /* JADX INFO: renamed from: n0 */
    public static final byte[] f72043n0;

    /* JADX INFO: renamed from: o0 */
    public static final UUID f72044o0;

    /* JADX INFO: renamed from: p0 */
    public static final Map f72045p0;

    /* JADX INFO: renamed from: A */
    public int f72046A;

    /* JADX INFO: renamed from: B */
    public long f72047B;

    /* JADX INFO: renamed from: C */
    public final SparseArray f72048C;

    /* JADX INFO: renamed from: D */
    public boolean f72049D;

    /* JADX INFO: renamed from: E */
    public long f72050E;

    /* JADX INFO: renamed from: F */
    public int f72051F;

    /* JADX INFO: renamed from: G */
    public long f72052G;

    /* JADX INFO: renamed from: H */
    public long f72053H;

    /* JADX INFO: renamed from: I */
    public int f72054I;

    /* JADX INFO: renamed from: J */
    public boolean f72055J;

    /* JADX INFO: renamed from: K */
    public long f72056K;

    /* JADX INFO: renamed from: L */
    public long f72057L;

    /* JADX INFO: renamed from: M */
    public long f72058M;

    /* JADX INFO: renamed from: N */
    public boolean f72059N;

    /* JADX INFO: renamed from: O */
    public int f72060O;

    /* JADX INFO: renamed from: P */
    public long f72061P;

    /* JADX INFO: renamed from: Q */
    public long f72062Q;

    /* JADX INFO: renamed from: R */
    public int f72063R;

    /* JADX INFO: renamed from: S */
    public int f72064S;

    /* JADX INFO: renamed from: T */
    public int[] f72065T;

    /* JADX INFO: renamed from: U */
    public int f72066U;

    /* JADX INFO: renamed from: V */
    public int f72067V;

    /* JADX INFO: renamed from: W */
    public int f72068W;

    /* JADX INFO: renamed from: X */
    public int f72069X;

    /* JADX INFO: renamed from: Y */
    public boolean f72070Y;

    /* JADX INFO: renamed from: Z */
    public long f72071Z;

    /* JADX INFO: renamed from: a */
    public final e62 f72072a;

    /* JADX INFO: renamed from: a0 */
    public int f72073a0;

    /* JADX INFO: renamed from: b */
    public final doa f72074b;

    /* JADX INFO: renamed from: b0 */
    public int f72075b0;

    /* JADX INFO: renamed from: c */
    public final SparseArray f72076c;

    /* JADX INFO: renamed from: c0 */
    public int f72077c0;

    /* JADX INFO: renamed from: d */
    public final boolean f72078d;

    /* JADX INFO: renamed from: d0 */
    public boolean f72079d0;

    /* JADX INFO: renamed from: e */
    public final boolean f72080e;

    /* JADX INFO: renamed from: e0 */
    public boolean f72081e0;

    /* JADX INFO: renamed from: f */
    public final bn9 f72082f;

    /* JADX INFO: renamed from: f0 */
    public boolean f72083f0;

    /* JADX INFO: renamed from: g */
    public final k47 f72084g;

    /* JADX INFO: renamed from: g0 */
    public int f72085g0;

    /* JADX INFO: renamed from: h */
    public final k47 f72086h;

    /* JADX INFO: renamed from: h0 */
    public byte f72087h0;

    /* JADX INFO: renamed from: i */
    public final k47 f72088i;

    /* JADX INFO: renamed from: i0 */
    public boolean f72089i0;

    /* JADX INFO: renamed from: j */
    public final k47 f72090j;

    /* JADX INFO: renamed from: j0 */
    public jy2 f72091j0;

    /* JADX INFO: renamed from: k */
    public final k47 f72092k;

    /* JADX INFO: renamed from: l */
    public final k47 f72093l;

    /* JADX INFO: renamed from: m */
    public final k47 f72094m;

    /* JADX INFO: renamed from: n */
    public final k47 f72095n;

    /* JADX INFO: renamed from: o */
    public final k47 f72096o;

    /* JADX INFO: renamed from: p */
    public final k47 f72097p;

    /* JADX INFO: renamed from: q */
    public ByteBuffer f72098q;

    /* JADX INFO: renamed from: r */
    public long f72099r;

    /* JADX INFO: renamed from: s */
    public long f72100s;

    /* JADX INFO: renamed from: t */
    public long f72101t;

    /* JADX INFO: renamed from: u */
    public long f72102u;

    /* JADX INFO: renamed from: v */
    public long f72103v;

    /* JADX INFO: renamed from: w */
    public boolean f72104w;

    /* JADX INFO: renamed from: x */
    public boolean f72105x;

    /* JADX INFO: renamed from: y */
    public ys5 f72106y;

    /* JADX INFO: renamed from: z */
    public boolean f72107z;

    static {
        String str = uma.f64080a;
        f72041l0 = "Format: Start, End, ReadOrder, Layer, Style, Name, MarginL, MarginR, MarginV, Effect, Text".getBytes(StandardCharsets.UTF_8);
        f72042m0 = new byte[]{68, 105, 97, 108, 111, 103, 117, 101, 58, 32, 48, 58, 48, 48, 58, 48, 48, 58, 48, 48, 44, 48, 58, 48, 48, 58, 48, 48, 58, 48, 48, 44};
        f72043n0 = new byte[]{87, 69, 66, 86, 84, 84, 10, 10, 48, 48, 58, 48, 48, 58, 48, 48, 46, 48, 48, 48, 32, 45, 45, 62, 32, 48, 48, 58, 48, 48, 58, 48, 48, 46, 48, 48, 48, 10};
        f72044o0 = new UUID(72057594037932032L, -9223371306706625679L);
        HashMap map = new HashMap();
        AbstractC3393o1.m17750y(0, map, "htc_video_rotA-000", 90, "htc_video_rotA-090");
        AbstractC3393o1.m17750y(180, map, "htc_video_rotA-180", 270, "htc_video_rotA-270");
        f72045p0 = Collections.unmodifiableMap(map);
    }

    public zs5(bn9 bn9Var, int i) {
        e62 e62Var = new e62();
        this.f72100s = -1L;
        this.f72101t = -9223372036854775807L;
        this.f72102u = -9223372036854775807L;
        this.f72103v = -9223372036854775807L;
        this.f72050E = -9223372036854775807L;
        this.f72051F = -1;
        this.f72052G = -1L;
        this.f72053H = -1L;
        this.f72054I = -1;
        this.f72056K = -1L;
        this.f72057L = -1L;
        this.f72058M = -9223372036854775807L;
        this.f72072a = e62Var;
        e62Var.f36750d = new vqb(this, 20);
        this.f72082f = bn9Var;
        this.f72048C = new SparseArray();
        this.f72078d = true;
        this.f72080e = (i & 2) == 0;
        this.f72074b = new doa();
        this.f72076c = new SparseArray();
        this.f72088i = new k47(4);
        this.f72090j = new k47(ByteBuffer.allocate(4).putInt(-1).array());
        this.f72092k = new k47(4);
        this.f72084g = new k47(zuc.f72211a);
        this.f72086h = new k47(4);
        this.f72093l = new k47();
        this.f72094m = new k47();
        this.f72095n = new k47(8);
        this.f72096o = new k47();
        this.f72097p = new k47();
        this.f72065T = new int[1];
        this.f72105x = true;
    }

    /* JADX INFO: renamed from: j */
    public static byte[] m25760j(long j, long j2, String str) {
        bna.m3969q(j != -9223372036854775807L);
        int i = (int) (j / 3600000000L);
        long j3 = j - (((long) i) * 3600000000L);
        int i2 = (int) (j3 / 60000000);
        long j4 = j3 - (((long) i2) * 60000000);
        int i3 = (int) (j4 / 1000000);
        String str2 = String.format(Locale.US, str, Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf((int) ((j4 - (((long) i3) * 1000000)) / j2)));
        String str3 = uma.f64080a;
        return str2.getBytes(StandardCharsets.UTF_8);
    }

    @Override // p000.hy2
    /* JADX INFO: renamed from: a */
    public final void mo109a() {
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:184:0x035e  */
    /* JADX WARN: Code duplicated, block: B:325:0x0523  */
    /* JADX WARN: Code duplicated, block: B:487:0x07af A[PHI: r0
      0x07af: PHI (r0v124 int) = (r0v68 int), (r0v120 int), (r0v121 int), (r0v122 int), (r0v126 int) binds: [B:610:0x0a1c, B:499:0x07ce, B:496:0x07c7, B:493:0x07c0, B:484:0x0794] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:622:0x0a57  */
    /* JADX WARN: Code duplicated, block: B:627:0x0a6e  */
    /* JADX WARN: Code duplicated, block: B:628:0x0a71  */
    /* JADX WARN: Code duplicated, block: B:631:0x0a84  */
    /* JADX WARN: Code duplicated, block: B:632:0x0a90  */
    /* JADX WARN: Code duplicated, block: B:634:0x0a96  */
    /* JADX WARN: Code duplicated, block: B:636:0x0a9a  */
    /* JADX WARN: Code duplicated, block: B:638:0x0a9f  */
    /* JADX WARN: Code duplicated, block: B:641:0x0aa7  */
    /* JADX WARN: Code duplicated, block: B:643:0x0aac  */
    /* JADX WARN: Code duplicated, block: B:646:0x0ab3  */
    /* JADX WARN: Code duplicated, block: B:649:0x0ac1  */
    /* JADX WARN: Code duplicated, block: B:652:0x0ac6  */
    /* JADX WARN: Code duplicated, block: B:654:0x0acc  */
    /* JADX WARN: Code duplicated, block: B:674:0x0b82  */
    /* JADX WARN: Code duplicated, block: B:676:0x0b9e  */
    /* JADX WARN: Code duplicated, block: B:679:0x0ba3  */
    /* JADX WARN: Code duplicated, block: B:682:0x0bb6  */
    /* JADX WARN: Code duplicated, block: B:685:0x0bbb  */
    /* JADX WARN: Code duplicated, block: B:691:0x0bd4  */
    /* JADX WARN: Code duplicated, block: B:692:0x0bd6  */
    /* JADX WARN: Code duplicated, block: B:694:0x0be0  */
    /* JADX WARN: Code duplicated, block: B:695:0x0be3  */
    /* JADX WARN: Code duplicated, block: B:697:0x0bed  */
    /* JADX WARN: Code duplicated, block: B:703:0x0c05  */
    /* JADX WARN: Code duplicated, block: B:705:0x0c1e  */
    /* JADX WARN: Code duplicated, block: B:707:0x0c24  */
    /* JADX WARN: Code duplicated, block: B:722:0x0c4f  */
    /* JADX WARN: Code duplicated, block: B:727:0x0c63  */
    /* JADX WARN: Code duplicated, block: B:728:0x0c66  */
    /* JADX WARN: Code duplicated, block: B:76:0x0191  */
    /* JADX WARN: Code duplicated, block: B:79:0x019d  */
    /* JADX WARN: Code duplicated, block: B:81:0x01ab  */
    /* JADX WARN: Code duplicated, block: B:82:0x01b7  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v4, types: [vqb] */
    /* JADX WARN: Type inference failed for: r1v107 */
    /* JADX WARN: Type inference failed for: r1v108 */
    /* JADX WARN: Type inference failed for: r1v109 */
    /* JADX WARN: Type inference failed for: r1v110 */
    /* JADX WARN: Type inference failed for: r1v111 */
    /* JADX WARN: Type inference failed for: r1v112 */
    /* JADX WARN: Type inference failed for: r1v113 */
    /* JADX WARN: Type inference failed for: r1v16, types: [iy2] */
    /* JADX WARN: Type inference failed for: r1v19 */
    /* JADX WARN: Type inference failed for: r1v33 */
    /* JADX WARN: Type inference failed for: r1v4, types: [iy2] */
    /* JADX WARN: Type inference failed for: r2v40 */
    /* JADX WARN: Type inference failed for: r2v41, types: [java.lang.RuntimeException] */
    /* JADX WARN: Type inference failed for: r2v42 */
    /* JADX WARN: Type inference failed for: r35v5, types: [int] */
    /* JADX WARN: Type inference failed for: r4v114 */
    /* JADX WARN: Type inference failed for: r4v120 */
    /* JADX WARN: Type inference failed for: r4v25 */
    /* JADX WARN: Type inference failed for: r4v26, types: [int] */
    /* JADX WARN: Type inference failed for: r4v31 */
    /* JADX WARN: Type inference failed for: r4v37, types: [boolean] */
    /* JADX WARN: Type inference failed for: r7v1, types: [e62] */
    /* JADX WARN: Type inference failed for: r8v0, types: [doa] */
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
    @Override // p000.hy2
    /* JADX INFO: renamed from: b */
    public final int mo110b(iy2 iy2Var, n63 n63Var) throws ParserException {
        boolean z;
        int i;
        int i2;
        int i3;
        String str;
        ?? r4;
        int i4;
        int iM10552d;
        ?? r1;
        boolean z2;
        ?? r2;
        int i5;
        byte b;
        List listSingletonList;
        int iM22825t;
        ?? r3;
        int i6;
        ArrayList arrayList;
        RuntimeException runtimeException;
        Pair pair;
        String str2;
        String str3;
        List list;
        List listM6291y;
        String str4;
        List list2;
        List list3;
        int i7;
        lc3 lc3Var;
        boolean zM11398h;
        int i8;
        int i9;
        float f;
        ga1 ga1Var;
        String str5;
        int iIntValue;
        byte[] bArr;
        int i10;
        int i11;
        int i12;
        String str6;
        String str7;
        C3404oc c3404ocM17906c;
        List list4;
        int i13;
        List list5;
        int i14;
        long j;
        long j2;
        long j3;
        ey5 ey5Var;
        c0a c0aVar;
        ey5 ey5VarM11386a;
        zs5 zs5Var = this;
        boolean z3 = false;
        zs5Var.f72059N = false;
        boolean z4 = true;
        boolean z5 = true;
        while (z5 && !zs5Var.f72059N) {
            ?? r7 = zs5Var.f72072a;
            ?? r8 = r7.f36749c;
            ArrayDeque arrayDeque = r7.f36748b;
            r7.f36750d.getClass();
            while (true) {
                d62 d62Var = (d62) arrayDeque.peek();
                if (d62Var == null || iy2Var.getPosition() < d62Var.f35033b) {
                    boolean z6 = z3 ? 1 : 0;
                    ?? r5 = iy2Var;
                    if (r7.f36751e == 0) {
                        int i15 = 4;
                        long jM10558g = r8.m10558g(r5, true, z6, 4);
                        if (jM10558g == -2) {
                            byte[] bArr2 = r7.f36747a;
                            r5.mo13080i();
                            ?? r6 = z6;
                            while (true) {
                                r5.mo13085o(bArr2, r6, i15);
                                byte b2 = bArr2[r6];
                                int i16 = 0;
                                while (true) {
                                    if (i16 >= 8) {
                                        i4 = -1;
                                    } else if ((doa.f35970e[i16] & ((long) b2)) != 0) {
                                        i4 = i16 + 1;
                                    } else {
                                        i16++;
                                    }
                                }
                                if (i4 != -1 && i4 <= 4) {
                                    iM10552d = (int) doa.m10552d(bArr2, i4, false);
                                    Object obj = r7.f36750d.f65802b;
                                    if (iM10552d == 357149030 || iM10552d == 524531317 || iM10552d == 475249515 || iM10552d == 374648427) {
                                    }
                                }
                                r5.mo13082k(1);
                                i15 = 4;
                                r6 = 0;
                            }
                            r5.mo13082k(i4);
                            jM10558g = iM10552d;
                        }
                        z = true;
                        if (jM10558g == -1) {
                            r4 = 0;
                            z5 = false;
                            r1 = r5;
                        } else {
                            r7.f36752f = (int) jM10558g;
                            r7.f36751e = 1;
                        }
                    } else {
                        z = true;
                    }
                    if (r7.f36751e == z) {
                        r7.f36753g = r8.m10558g(r5, false, z, 8);
                        r7.f36751e = 2;
                    }
                    ?? r0 = r7.f36750d;
                    int i17 = r7.f36752f;
                    Object obj2 = r0.f65802b;
                    switch (i17) {
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
                        case 240:
                        case 241:
                        case 247:
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
                        case 21938:
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
                            i = 2;
                            break;
                        case 134:
                        case 17026:
                        case 21358:
                        case 2274716:
                            i = 3;
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
                            i = 1;
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
                            i = 4;
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
                            i = 5;
                            break;
                        default:
                            i = 0;
                            break;
                    }
                    if (i == 0) {
                        r5.mo13082k((int) r7.f36753g);
                        r7.f36751e = 0;
                        z3 = false;
                        z4 = true;
                    } else if (i == 1) {
                        long position = r5.getPosition();
                        arrayDeque.push(new d62(r7.f36752f, r7.f36753g + position));
                        r7.f36750d.m23470B(r7.f36752f, position, r7.f36753g);
                        i2 = 0;
                        r7.f36751e = 0;
                        r2 = r5;
                    } else if (i == 2) {
                        long j4 = r7.f36753g;
                        if (j4 > 8) {
                            throw ParserException.m2516a(null, "Invalid integer size: " + r7.f36753g);
                        }
                        r0.m23476u(i17, r7.m10864a(r5, (int) j4));
                        i2 = 0;
                        r7.f36751e = 0;
                        r2 = r5;
                    } else if (i == 3) {
                        long j5 = r7.f36753g;
                        if (j5 > 2147483647L) {
                            throw ParserException.m2516a(null, "String element size: " + r7.f36753g);
                        }
                        int i18 = (int) j5;
                        if (i18 == 0) {
                            str = "";
                            i3 = 0;
                        } else {
                            byte[] bArr3 = new byte[i18];
                            r5.readFully(bArr3, 0, i18);
                            while (i18 > 0 && bArr3[i18 - 1] == 0) {
                                i18--;
                            }
                            i3 = 0;
                            str = new String(bArr3, 0, i18);
                        }
                        r0.m23471C(i17, str);
                        r7.f36751e = i3;
                        i2 = i3;
                        r2 = r5;
                    } else if (i == 4) {
                        r0.m23474q(i17, (int) r7.f36753g, r5);
                        i2 = 0;
                        r7.f36751e = 0;
                        r2 = r5;
                    } else {
                        if (i != 5) {
                            throw ParserException.m2516a(null, "Invalid element type " + i);
                        }
                        long j6 = r7.f36753g;
                        if (j6 != 4 && j6 != 8) {
                            throw ParserException.m2516a(null, "Invalid float size: " + r7.f36753g);
                        }
                        int i19 = (int) j6;
                        long jM10864a = r7.m10864a(r5, i19);
                        double dIntBitsToFloat = i19 == 4 ? Float.intBitsToFloat((int) jM10864a) : Double.longBitsToDouble(jM10864a);
                        zs5 zs5Var2 = (zs5) r0.f65802b;
                        if (i17 == 181) {
                            zs5Var2.m25762h(i17);
                            zs5Var2.f72106y.f70389S = (int) dIntBitsToFloat;
                        } else if (i17 != 17545) {
                            switch (i17) {
                                case 21969:
                                    zs5Var2.m25762h(i17);
                                    zs5Var2.f72106y.f70376F = (float) dIntBitsToFloat;
                                    break;
                                case 21970:
                                    zs5Var2.m25762h(i17);
                                    zs5Var2.f72106y.f70377G = (float) dIntBitsToFloat;
                                    break;
                                case 21971:
                                    zs5Var2.m25762h(i17);
                                    zs5Var2.f72106y.f70378H = (float) dIntBitsToFloat;
                                    break;
                                case 21972:
                                    zs5Var2.m25762h(i17);
                                    zs5Var2.f72106y.f70379I = (float) dIntBitsToFloat;
                                    break;
                                case 21973:
                                    zs5Var2.m25762h(i17);
                                    zs5Var2.f72106y.f70380J = (float) dIntBitsToFloat;
                                    break;
                                case 21974:
                                    zs5Var2.m25762h(i17);
                                    zs5Var2.f72106y.f70381K = (float) dIntBitsToFloat;
                                    break;
                                case 21975:
                                    zs5Var2.m25762h(i17);
                                    zs5Var2.f72106y.f70382L = (float) dIntBitsToFloat;
                                    break;
                                case 21976:
                                    zs5Var2.m25762h(i17);
                                    zs5Var2.f72106y.f70383M = (float) dIntBitsToFloat;
                                    break;
                                case 21977:
                                    zs5Var2.m25762h(i17);
                                    zs5Var2.f72106y.f70384N = (float) dIntBitsToFloat;
                                    break;
                                case 21978:
                                    zs5Var2.m25762h(i17);
                                    zs5Var2.f72106y.f70385O = (float) dIntBitsToFloat;
                                    break;
                                default:
                                    switch (i17) {
                                        case 30323:
                                            zs5Var2.m25762h(i17);
                                            zs5Var2.f72106y.f70420u = (float) dIntBitsToFloat;
                                            break;
                                        case 30324:
                                            zs5Var2.m25762h(i17);
                                            zs5Var2.f72106y.f70421v = (float) dIntBitsToFloat;
                                            break;
                                        case 30325:
                                            zs5Var2.m25762h(i17);
                                            zs5Var2.f72106y.f70422w = (float) dIntBitsToFloat;
                                            break;
                                    }
                                    break;
                            }
                        } else {
                            zs5Var2.f72102u = (long) dIntBitsToFloat;
                        }
                        i2 = 0;
                        r7.f36751e = 0;
                        r2 = r5;
                    }
                } else {
                    vqb vqbVar = r7.f36750d;
                    int i20 = ((d62) arrayDeque.pop()).f35032a;
                    zs5 zs5Var3 = (zs5) vqbVar.f65802b;
                    SparseArray sparseArray = zs5Var3.f72048C;
                    SparseArray sparseArray2 = zs5Var3.f72076c;
                    zs5Var3.f72091j0.getClass();
                    if (i20 != 160) {
                        if (i20 == 174) {
                            ys5 ys5Var = zs5Var3.f72106y;
                            ys5Var.getClass();
                            String str8 = ys5Var.f70401c;
                            if (str8 == null) {
                                throw ParserException.m2516a(null, "CodecId is missing in TrackEntry element");
                            }
                            switch (str8) {
                                case "V_MPEG4/ISO/AP":
                                case "V_MPEG4/ISO/SP":
                                case "A_MS/ACM":
                                case "A_TRUEHD":
                                case "A_VORBIS":
                                case "A_MPEG/L2":
                                case "A_MPEG/L3":
                                case "V_MS/VFW/FOURCC":
                                case "S_DVBSUB":
                                case "V_MPEG4/ISO/ASP":
                                case "V_MPEG4/ISO/AVC":
                                case "S_VOBSUB":
                                case "A_DTS/LOSSLESS":
                                case "A_AAC":
                                case "A_AC3":
                                case "A_DTS":
                                case "V_AV1":
                                case "V_VP8":
                                case "V_VP9":
                                case "S_HDMV/PGS":
                                case "V_THEORA":
                                case "A_DTS/EXPRESS":
                                case "A_PCM/FLOAT/IEEE":
                                case "A_PCM/INT/BIG":
                                case "A_PCM/INT/LIT":
                                case "S_TEXT/ASS":
                                case "S_TEXT/SSA":
                                case "V_MPEGH/ISO/HEVC":
                                case "S_TEXT/WEBVTT":
                                case "S_TEXT/UTF8":
                                case "V_MPEG2":
                                case "A_EAC3":
                                case "A_FLAC":
                                case "A_OPUS":
                                    int i21 = ys5Var.f70403d;
                                    switch (str8) {
                                        case "V_MPEG4/ISO/AP":
                                            b = 0;
                                            break;
                                        case "V_MPEG4/ISO/SP":
                                            b = 1;
                                            break;
                                        case "A_MS/ACM":
                                            b = 2;
                                            break;
                                        case "A_TRUEHD":
                                            b = 3;
                                            break;
                                        case "A_VORBIS":
                                            b = 4;
                                            break;
                                        case "A_MPEG/L2":
                                            b = 5;
                                            break;
                                        case "A_MPEG/L3":
                                            b = 6;
                                            break;
                                        case "V_MS/VFW/FOURCC":
                                            b = 7;
                                            break;
                                        case "S_DVBSUB":
                                            b = 8;
                                            break;
                                        case "V_MPEG4/ISO/ASP":
                                            b = 9;
                                            break;
                                        case "V_MPEG4/ISO/AVC":
                                            b = 10;
                                            break;
                                        case "S_VOBSUB":
                                            b = 11;
                                            break;
                                        case "A_DTS/LOSSLESS":
                                            b = 12;
                                            break;
                                        case "A_AAC":
                                            b = 13;
                                            break;
                                        case "A_AC3":
                                            b = 14;
                                            break;
                                        case "A_DTS":
                                            b = 15;
                                            break;
                                        case "V_AV1":
                                            b = 16;
                                            break;
                                        case "V_VP8":
                                            b = 17;
                                            break;
                                        case "V_VP9":
                                            b = 18;
                                            break;
                                        case "S_HDMV/PGS":
                                            b = 19;
                                            break;
                                        case "V_THEORA":
                                            b = 20;
                                            break;
                                        case "A_DTS/EXPRESS":
                                            b = 21;
                                            break;
                                        case "A_PCM/FLOAT/IEEE":
                                            b = 22;
                                            break;
                                        case "A_PCM/INT/BIG":
                                            b = 23;
                                            break;
                                        case "A_PCM/INT/LIT":
                                            b = 24;
                                            break;
                                        case "S_TEXT/ASS":
                                            b = 25;
                                            break;
                                        case "S_TEXT/SSA":
                                            b = 26;
                                            break;
                                        case "V_MPEGH/ISO/HEVC":
                                            b = 27;
                                            break;
                                        case "S_TEXT/WEBVTT":
                                            b = 28;
                                            break;
                                        case "S_TEXT/UTF8":
                                            b = 29;
                                            break;
                                        case "V_MPEG2":
                                            b = 30;
                                            break;
                                        case "A_EAC3":
                                            b = 31;
                                            break;
                                        case "A_FLAC":
                                            b = 32;
                                            break;
                                        case "A_OPUS":
                                            b = 33;
                                            break;
                                        default:
                                            b = -1;
                                            break;
                                    }
                                    String str9 = "video/x-unknown";
                                    switch (b) {
                                        case 0:
                                        case 1:
                                        case 9:
                                            byte[] bArr4 = ys5Var.f70411l;
                                            listSingletonList = bArr4 == null ? null : Collections.singletonList(bArr4);
                                            str9 = "video/mp4v-es";
                                            listM6291y = listSingletonList;
                                            iM22825t = -1;
                                            i6 = -1;
                                            list4 = listM6291y;
                                            str3 = null;
                                            list3 = list4;
                                            if (ys5Var.f70386P != null && (c3404ocM17906c = C3404oc.m17906c(new k47(ys5Var.f70386P))) != null) {
                                                str3 = c3404ocM17906c.f54162b;
                                                str9 = "video/dolby-vision";
                                            }
                                            boolean z7 = ys5Var.f70395Y;
                                            if (ys5Var.f70394X) {
                                                i7 = 2;
                                            } else {
                                                i7 = 0;
                                            }
                                            int i22 = (z7 ? 1 : 0) | i7;
                                            lc3Var = new lc3();
                                            zM11398h = ez5.m11398h(str9);
                                            Map map = f72045p0;
                                            if (zM11398h) {
                                                lc3Var.f49430F = ys5Var.f70387Q;
                                                lc3Var.f49431G = ys5Var.f70389S;
                                                lc3Var.f49432H = iM22825t;
                                            } else if (ez5.m11401k(str9)) {
                                                if (ys5Var.f70418s == 0) {
                                                    i11 = ys5Var.f70416q;
                                                    i8 = -1;
                                                    if (i11 == -1) {
                                                        i11 = ys5Var.f70413n;
                                                    }
                                                    ys5Var.f70416q = i11;
                                                    i12 = ys5Var.f70417r;
                                                    if (i12 == -1) {
                                                        i12 = ys5Var.f70414o;
                                                    }
                                                    ys5Var.f70417r = i12;
                                                } else {
                                                    i8 = -1;
                                                }
                                                i9 = ys5Var.f70416q;
                                                if (i9 != i8 || (i10 = ys5Var.f70417r) == i8) {
                                                    f = -1.0f;
                                                } else {
                                                    f = (ys5Var.f70414o * i9) / (ys5Var.f70413n * i10);
                                                }
                                                if (ys5Var.f70425z) {
                                                    if (ys5Var.f70376F != -1.0f || ys5Var.f70377G == -1.0f || ys5Var.f70378H == -1.0f || ys5Var.f70379I == -1.0f || ys5Var.f70380J == -1.0f || ys5Var.f70381K == -1.0f || ys5Var.f70382L == -1.0f || ys5Var.f70383M == -1.0f || ys5Var.f70384N == -1.0f || ys5Var.f70385O == -1.0f) {
                                                        bArr = null;
                                                    } else {
                                                        byte[] bArr5 = new byte[25];
                                                        ByteBuffer byteBufferOrder = ByteBuffer.wrap(bArr5).order(ByteOrder.LITTLE_ENDIAN);
                                                        byteBufferOrder.put((byte) 0);
                                                        byteBufferOrder.putShort((short) ((ys5Var.f70376F * 50000.0f) + 0.5f));
                                                        byteBufferOrder.putShort((short) ((ys5Var.f70377G * 50000.0f) + 0.5f));
                                                        byteBufferOrder.putShort((short) ((ys5Var.f70378H * 50000.0f) + 0.5f));
                                                        byteBufferOrder.putShort((short) ((ys5Var.f70379I * 50000.0f) + 0.5f));
                                                        byteBufferOrder.putShort((short) ((ys5Var.f70380J * 50000.0f) + 0.5f));
                                                        byteBufferOrder.putShort((short) ((ys5Var.f70381K * 50000.0f) + 0.5f));
                                                        byteBufferOrder.putShort((short) ((ys5Var.f70382L * 50000.0f) + 0.5f));
                                                        byteBufferOrder.putShort((short) ((ys5Var.f70383M * 50000.0f) + 0.5f));
                                                        byteBufferOrder.putShort((short) (ys5Var.f70384N + 0.5f));
                                                        byteBufferOrder.putShort((short) (ys5Var.f70385O + 0.5f));
                                                        byteBufferOrder.putShort((short) ys5Var.f70374D);
                                                        byteBufferOrder.putShort((short) ys5Var.f70375E);
                                                        bArr = bArr5;
                                                    }
                                                    int i23 = ys5Var.f70371A;
                                                    int i24 = ys5Var.f70373C;
                                                    int i25 = ys5Var.f70372B;
                                                    int i26 = ys5Var.f70415p;
                                                    ga1Var = new ga1(i23, i24, i25, bArr, i26, i26);
                                                } else {
                                                    ga1Var = null;
                                                }
                                                str5 = ys5Var.f70399b;
                                                if (str5 == null && map.containsKey(str5)) {
                                                    iIntValue = ((Integer) map.get(ys5Var.f70399b)).intValue();
                                                } else {
                                                    iIntValue = -1;
                                                }
                                                if (ys5Var.f70419t == 0 && Float.compare(ys5Var.f70420u, 0.0f) == 0 && Float.compare(ys5Var.f70421v, 0.0f) == 0) {
                                                    if (Float.compare(ys5Var.f70422w, 0.0f) == 0) {
                                                        iIntValue = 0;
                                                    } else if (Float.compare(ys5Var.f70422w, 90.0f) == 0) {
                                                        iIntValue = 90;
                                                    } else if (Float.compare(ys5Var.f70422w, -180.0f) != 0 || Float.compare(ys5Var.f70422w, 180.0f) == 0) {
                                                        iIntValue = 180;
                                                    } else if (Float.compare(ys5Var.f70422w, -90.0f) == 0) {
                                                        iIntValue = 270;
                                                    }
                                                }
                                                lc3Var.f49460u = ys5Var.f70413n;
                                                lc3Var.f49461v = ys5Var.f70414o;
                                                lc3Var.f49425A = f;
                                                lc3Var.f49465z = iIntValue;
                                                lc3Var.f49426B = ys5Var.f70423x;
                                                lc3Var.f49427C = ys5Var.f70424y;
                                                lc3Var.f49428D = ga1Var;
                                            } else if (!"application/x-subrip".equals(str9) && !"text/x-ssa".equals(str9) && !"text/vtt".equals(str9) && !"application/vobsub".equals(str9) && !"application/pgs".equals(str9) && !"application/dvbsubs".equals(str9)) {
                                                throw ParserException.m2516a(null, "Unexpected MIME type.");
                                            }
                                            str6 = ys5Var.f70399b;
                                            if (str6 != null && !map.containsKey(str6)) {
                                                lc3Var.f49441b = ys5Var.f70399b;
                                            }
                                            lc3Var.f49440a = Integer.toString(i21);
                                            if (ys5Var.f70397a) {
                                                str7 = "video/webm";
                                            } else {
                                                str7 = "video/x-matroska";
                                            }
                                            lc3Var.f49452m = ez5.m11402l(str7);
                                            lc3Var.f49453n = ez5.m11402l(str9);
                                            lc3Var.f49454o = i6;
                                            lc3Var.f49443d = ys5Var.f70396Z;
                                            lc3Var.f49444e = i22;
                                            lc3Var.f49456q = list3;
                                            lc3Var.f49449j = str3;
                                            lc3Var.f49457r = ys5Var.f70412m;
                                            ys5Var.f70400b0 = lc3Var.m16068a();
                                            ys5Var.f70398a0 = zs5Var3.f72091j0.mo2555n(ys5Var.f70403d, ys5Var.f70404e);
                                            sparseArray2.put(ys5Var.f70403d, ys5Var);
                                            break;
                                        case 2:
                                            k47 k47Var = new k47(ys5Var.m25306a(ys5Var.f70401c));
                                            try {
                                                int iM14835s = k47Var.m14835s();
                                                if (iM14835s != 1) {
                                                    if (iM14835s == 65534) {
                                                        k47Var.m14818M(24);
                                                        long jM14836t = k47Var.m14836t();
                                                        UUID uuid = f72044o0;
                                                        if (jM14836t != uuid.getMostSignificantBits() || k47Var.m14836t() != uuid.getLeastSignificantBits()) {
                                                        }
                                                        str9 = "audio/x-unknown";
                                                        iM22825t = -1;
                                                        i6 = -1;
                                                        str3 = null;
                                                        list3 = null;
                                                        if (ys5Var.f70386P != null) {
                                                            str3 = c3404ocM17906c.f54162b;
                                                            str9 = "video/dolby-vision";
                                                        }
                                                        boolean z8 = ys5Var.f70395Y;
                                                        if (ys5Var.f70394X) {
                                                            i7 = 2;
                                                        } else {
                                                            i7 = 0;
                                                        }
                                                        int i27 = (z8 ? 1 : 0) | i7;
                                                        lc3Var = new lc3();
                                                        zM11398h = ez5.m11398h(str9);
                                                        Map map2 = f72045p0;
                                                        if (zM11398h) {
                                                            lc3Var.f49430F = ys5Var.f70387Q;
                                                            lc3Var.f49431G = ys5Var.f70389S;
                                                            lc3Var.f49432H = iM22825t;
                                                        } else if (ez5.m11401k(str9)) {
                                                            if (ys5Var.f70418s == 0) {
                                                                i11 = ys5Var.f70416q;
                                                                i8 = -1;
                                                                if (i11 == -1) {
                                                                    i11 = ys5Var.f70413n;
                                                                }
                                                                ys5Var.f70416q = i11;
                                                                i12 = ys5Var.f70417r;
                                                                if (i12 == -1) {
                                                                    i12 = ys5Var.f70414o;
                                                                }
                                                                ys5Var.f70417r = i12;
                                                            } else {
                                                                i8 = -1;
                                                            }
                                                            i9 = ys5Var.f70416q;
                                                            if (i9 != i8) {
                                                                f = -1.0f;
                                                            } else {
                                                                f = -1.0f;
                                                            }
                                                            if (ys5Var.f70425z) {
                                                                if (ys5Var.f70376F != -1.0f) {
                                                                    bArr = null;
                                                                } else {
                                                                    bArr = null;
                                                                }
                                                                int i28 = ys5Var.f70371A;
                                                                int i29 = ys5Var.f70373C;
                                                                int i210 = ys5Var.f70372B;
                                                                int i211 = ys5Var.f70415p;
                                                                ga1Var = new ga1(i28, i29, i210, bArr, i211, i211);
                                                            } else {
                                                                ga1Var = null;
                                                            }
                                                            str5 = ys5Var.f70399b;
                                                            if (str5 == null) {
                                                                iIntValue = -1;
                                                            } else {
                                                                iIntValue = -1;
                                                            }
                                                            if (ys5Var.f70419t == 0) {
                                                                if (Float.compare(ys5Var.f70422w, 0.0f) == 0) {
                                                                    iIntValue = 0;
                                                                } else if (Float.compare(ys5Var.f70422w, 90.0f) == 0) {
                                                                    iIntValue = 90;
                                                                } else if (Float.compare(ys5Var.f70422w, -180.0f) != 0) {
                                                                    iIntValue = 180;
                                                                } else {
                                                                    iIntValue = 180;
                                                                }
                                                            }
                                                            lc3Var.f49460u = ys5Var.f70413n;
                                                            lc3Var.f49461v = ys5Var.f70414o;
                                                            lc3Var.f49425A = f;
                                                            lc3Var.f49465z = iIntValue;
                                                            lc3Var.f49426B = ys5Var.f70423x;
                                                            lc3Var.f49427C = ys5Var.f70424y;
                                                            lc3Var.f49428D = ga1Var;
                                                        } else if (!"application/x-subrip".equals(str9)) {
                                                            throw ParserException.m2516a(null, "Unexpected MIME type.");
                                                        }
                                                        str6 = ys5Var.f70399b;
                                                        if (str6 != null) {
                                                            lc3Var.f49441b = ys5Var.f70399b;
                                                        }
                                                        lc3Var.f49440a = Integer.toString(i21);
                                                        if (ys5Var.f70397a) {
                                                            str7 = "video/webm";
                                                        } else {
                                                            str7 = "video/x-matroska";
                                                        }
                                                        lc3Var.f49452m = ez5.m11402l(str7);
                                                        lc3Var.f49453n = ez5.m11402l(str9);
                                                        lc3Var.f49454o = i6;
                                                        lc3Var.f49443d = ys5Var.f70396Z;
                                                        lc3Var.f49444e = i27;
                                                        lc3Var.f49456q = list3;
                                                        lc3Var.f49449j = str3;
                                                        lc3Var.f49457r = ys5Var.f70412m;
                                                        ys5Var.f70400b0 = lc3Var.m16068a();
                                                        ys5Var.f70398a0 = zs5Var3.f72091j0.mo2555n(ys5Var.f70403d, ys5Var.f70404e);
                                                        sparseArray2.put(ys5Var.f70403d, ys5Var);
                                                    }
                                                    ss5.m21707d0("MatroskaExtractor", "Non-PCM MS/ACM is unsupported. Setting mimeType to audio/x-unknown");
                                                    str9 = "audio/x-unknown";
                                                    iM22825t = -1;
                                                    i6 = -1;
                                                    str3 = null;
                                                    list3 = null;
                                                    if (ys5Var.f70386P != null) {
                                                        str3 = c3404ocM17906c.f54162b;
                                                        str9 = "video/dolby-vision";
                                                    }
                                                    boolean z9 = ys5Var.f70395Y;
                                                    if (ys5Var.f70394X) {
                                                        i7 = 2;
                                                    } else {
                                                        i7 = 0;
                                                    }
                                                    int i212 = (z9 ? 1 : 0) | i7;
                                                    lc3Var = new lc3();
                                                    zM11398h = ez5.m11398h(str9);
                                                    Map map3 = f72045p0;
                                                    if (zM11398h) {
                                                        lc3Var.f49430F = ys5Var.f70387Q;
                                                        lc3Var.f49431G = ys5Var.f70389S;
                                                        lc3Var.f49432H = iM22825t;
                                                    } else if (ez5.m11401k(str9)) {
                                                        if (ys5Var.f70418s == 0) {
                                                            i11 = ys5Var.f70416q;
                                                            i8 = -1;
                                                            if (i11 == -1) {
                                                                i11 = ys5Var.f70413n;
                                                            }
                                                            ys5Var.f70416q = i11;
                                                            i12 = ys5Var.f70417r;
                                                            if (i12 == -1) {
                                                                i12 = ys5Var.f70414o;
                                                            }
                                                            ys5Var.f70417r = i12;
                                                        } else {
                                                            i8 = -1;
                                                        }
                                                        i9 = ys5Var.f70416q;
                                                        if (i9 != i8) {
                                                            f = -1.0f;
                                                        } else {
                                                            f = -1.0f;
                                                        }
                                                        if (ys5Var.f70425z) {
                                                            if (ys5Var.f70376F != -1.0f) {
                                                                bArr = null;
                                                            } else {
                                                                bArr = null;
                                                            }
                                                            int i213 = ys5Var.f70371A;
                                                            int i214 = ys5Var.f70373C;
                                                            int i215 = ys5Var.f70372B;
                                                            int i216 = ys5Var.f70415p;
                                                            ga1Var = new ga1(i213, i214, i215, bArr, i216, i216);
                                                        } else {
                                                            ga1Var = null;
                                                        }
                                                        str5 = ys5Var.f70399b;
                                                        if (str5 == null) {
                                                            iIntValue = -1;
                                                        } else {
                                                            iIntValue = -1;
                                                        }
                                                        if (ys5Var.f70419t == 0) {
                                                            if (Float.compare(ys5Var.f70422w, 0.0f) == 0) {
                                                                iIntValue = 0;
                                                            } else if (Float.compare(ys5Var.f70422w, 90.0f) == 0) {
                                                                iIntValue = 90;
                                                            } else if (Float.compare(ys5Var.f70422w, -180.0f) != 0) {
                                                                iIntValue = 180;
                                                            } else {
                                                                iIntValue = 180;
                                                            }
                                                        }
                                                        lc3Var.f49460u = ys5Var.f70413n;
                                                        lc3Var.f49461v = ys5Var.f70414o;
                                                        lc3Var.f49425A = f;
                                                        lc3Var.f49465z = iIntValue;
                                                        lc3Var.f49426B = ys5Var.f70423x;
                                                        lc3Var.f49427C = ys5Var.f70424y;
                                                        lc3Var.f49428D = ga1Var;
                                                    } else if (!"application/x-subrip".equals(str9)) {
                                                        throw ParserException.m2516a(null, "Unexpected MIME type.");
                                                    }
                                                    str6 = ys5Var.f70399b;
                                                    if (str6 != null) {
                                                        lc3Var.f49441b = ys5Var.f70399b;
                                                    }
                                                    lc3Var.f49440a = Integer.toString(i21);
                                                    if (ys5Var.f70397a) {
                                                        str7 = "video/webm";
                                                    } else {
                                                        str7 = "video/x-matroska";
                                                    }
                                                    lc3Var.f49452m = ez5.m11402l(str7);
                                                    lc3Var.f49453n = ez5.m11402l(str9);
                                                    lc3Var.f49454o = i6;
                                                    lc3Var.f49443d = ys5Var.f70396Z;
                                                    lc3Var.f49444e = i212;
                                                    lc3Var.f49456q = list3;
                                                    lc3Var.f49449j = str3;
                                                    lc3Var.f49457r = ys5Var.f70412m;
                                                    ys5Var.f70400b0 = lc3Var.m16068a();
                                                    ys5Var.f70398a0 = zs5Var3.f72091j0.mo2555n(ys5Var.f70403d, ys5Var.f70404e);
                                                    sparseArray2.put(ys5Var.f70403d, ys5Var);
                                                    break;
                                                }
                                                int i30 = ys5Var.f70388R;
                                                String str10 = uma.f64080a;
                                                iM22825t = uma.m22825t(i30, ByteOrder.LITTLE_ENDIAN);
                                                if (iM22825t == 0) {
                                                    ss5.m21707d0("MatroskaExtractor", "Unsupported PCM bit depth: " + ys5Var.f70388R + ". Setting mimeType to audio/x-unknown");
                                                    str9 = "audio/x-unknown";
                                                    iM22825t = -1;
                                                } else {
                                                    str9 = "audio/raw";
                                                }
                                                i6 = -1;
                                                str3 = null;
                                                list3 = null;
                                                if (ys5Var.f70386P != null) {
                                                    str3 = c3404ocM17906c.f54162b;
                                                    str9 = "video/dolby-vision";
                                                }
                                                boolean z10 = ys5Var.f70395Y;
                                                if (ys5Var.f70394X) {
                                                    i7 = 2;
                                                } else {
                                                    i7 = 0;
                                                }
                                                int i217 = (z10 ? 1 : 0) | i7;
                                                lc3Var = new lc3();
                                                zM11398h = ez5.m11398h(str9);
                                                Map map4 = f72045p0;
                                                if (zM11398h) {
                                                    lc3Var.f49430F = ys5Var.f70387Q;
                                                    lc3Var.f49431G = ys5Var.f70389S;
                                                    lc3Var.f49432H = iM22825t;
                                                } else if (ez5.m11401k(str9)) {
                                                    if (ys5Var.f70418s == 0) {
                                                        i11 = ys5Var.f70416q;
                                                        i8 = -1;
                                                        if (i11 == -1) {
                                                            i11 = ys5Var.f70413n;
                                                        }
                                                        ys5Var.f70416q = i11;
                                                        i12 = ys5Var.f70417r;
                                                        if (i12 == -1) {
                                                            i12 = ys5Var.f70414o;
                                                        }
                                                        ys5Var.f70417r = i12;
                                                    } else {
                                                        i8 = -1;
                                                    }
                                                    i9 = ys5Var.f70416q;
                                                    if (i9 != i8) {
                                                        f = -1.0f;
                                                    } else {
                                                        f = -1.0f;
                                                    }
                                                    if (ys5Var.f70425z) {
                                                        if (ys5Var.f70376F != -1.0f) {
                                                            bArr = null;
                                                        } else {
                                                            bArr = null;
                                                        }
                                                        int i218 = ys5Var.f70371A;
                                                        int i219 = ys5Var.f70373C;
                                                        int i2110 = ys5Var.f70372B;
                                                        int i2111 = ys5Var.f70415p;
                                                        ga1Var = new ga1(i218, i219, i2110, bArr, i2111, i2111);
                                                    } else {
                                                        ga1Var = null;
                                                    }
                                                    str5 = ys5Var.f70399b;
                                                    if (str5 == null) {
                                                        iIntValue = -1;
                                                    } else {
                                                        iIntValue = -1;
                                                    }
                                                    if (ys5Var.f70419t == 0) {
                                                        if (Float.compare(ys5Var.f70422w, 0.0f) == 0) {
                                                            iIntValue = 0;
                                                        } else if (Float.compare(ys5Var.f70422w, 90.0f) == 0) {
                                                            iIntValue = 90;
                                                        } else if (Float.compare(ys5Var.f70422w, -180.0f) != 0) {
                                                            iIntValue = 180;
                                                        } else {
                                                            iIntValue = 180;
                                                        }
                                                    }
                                                    lc3Var.f49460u = ys5Var.f70413n;
                                                    lc3Var.f49461v = ys5Var.f70414o;
                                                    lc3Var.f49425A = f;
                                                    lc3Var.f49465z = iIntValue;
                                                    lc3Var.f49426B = ys5Var.f70423x;
                                                    lc3Var.f49427C = ys5Var.f70424y;
                                                    lc3Var.f49428D = ga1Var;
                                                } else if (!"application/x-subrip".equals(str9)) {
                                                    throw ParserException.m2516a(null, "Unexpected MIME type.");
                                                }
                                                str6 = ys5Var.f70399b;
                                                if (str6 != null) {
                                                    lc3Var.f49441b = ys5Var.f70399b;
                                                }
                                                lc3Var.f49440a = Integer.toString(i21);
                                                if (ys5Var.f70397a) {
                                                    str7 = "video/webm";
                                                } else {
                                                    str7 = "video/x-matroska";
                                                }
                                                lc3Var.f49452m = ez5.m11402l(str7);
                                                lc3Var.f49453n = ez5.m11402l(str9);
                                                lc3Var.f49454o = i6;
                                                lc3Var.f49443d = ys5Var.f70396Z;
                                                lc3Var.f49444e = i217;
                                                lc3Var.f49456q = list3;
                                                lc3Var.f49449j = str3;
                                                lc3Var.f49457r = ys5Var.f70412m;
                                                ys5Var.f70400b0 = lc3Var.m16068a();
                                                ys5Var.f70398a0 = zs5Var3.f72091j0.mo2555n(ys5Var.f70403d, ys5Var.f70404e);
                                                sparseArray2.put(ys5Var.f70403d, ys5Var);
                                            } catch (ArrayIndexOutOfBoundsException unused) {
                                                throw ParserException.m2516a(null, "Error parsing MS/ACM codec private");
                                            }
                                            break;
                                        case 3:
                                            ys5Var.f70392V = new ica();
                                            str9 = "audio/true-hd";
                                            iM22825t = -1;
                                            i6 = -1;
                                            str3 = null;
                                            list3 = null;
                                            if (ys5Var.f70386P != null) {
                                                str3 = c3404ocM17906c.f54162b;
                                                str9 = "video/dolby-vision";
                                            }
                                            boolean z11 = ys5Var.f70395Y;
                                            if (ys5Var.f70394X) {
                                                i7 = 2;
                                            } else {
                                                i7 = 0;
                                            }
                                            int i2112 = (z11 ? 1 : 0) | i7;
                                            lc3Var = new lc3();
                                            zM11398h = ez5.m11398h(str9);
                                            Map map5 = f72045p0;
                                            if (zM11398h) {
                                                lc3Var.f49430F = ys5Var.f70387Q;
                                                lc3Var.f49431G = ys5Var.f70389S;
                                                lc3Var.f49432H = iM22825t;
                                            } else if (ez5.m11401k(str9)) {
                                                if (ys5Var.f70418s == 0) {
                                                    i11 = ys5Var.f70416q;
                                                    i8 = -1;
                                                    if (i11 == -1) {
                                                        i11 = ys5Var.f70413n;
                                                    }
                                                    ys5Var.f70416q = i11;
                                                    i12 = ys5Var.f70417r;
                                                    if (i12 == -1) {
                                                        i12 = ys5Var.f70414o;
                                                    }
                                                    ys5Var.f70417r = i12;
                                                } else {
                                                    i8 = -1;
                                                }
                                                i9 = ys5Var.f70416q;
                                                if (i9 != i8) {
                                                    f = -1.0f;
                                                } else {
                                                    f = -1.0f;
                                                }
                                                if (ys5Var.f70425z) {
                                                    if (ys5Var.f70376F != -1.0f) {
                                                        bArr = null;
                                                    } else {
                                                        bArr = null;
                                                    }
                                                    int i2113 = ys5Var.f70371A;
                                                    int i2114 = ys5Var.f70373C;
                                                    int i2115 = ys5Var.f70372B;
                                                    int i2116 = ys5Var.f70415p;
                                                    ga1Var = new ga1(i2113, i2114, i2115, bArr, i2116, i2116);
                                                } else {
                                                    ga1Var = null;
                                                }
                                                str5 = ys5Var.f70399b;
                                                if (str5 == null) {
                                                    iIntValue = -1;
                                                } else {
                                                    iIntValue = -1;
                                                }
                                                if (ys5Var.f70419t == 0) {
                                                    if (Float.compare(ys5Var.f70422w, 0.0f) == 0) {
                                                        iIntValue = 0;
                                                    } else if (Float.compare(ys5Var.f70422w, 90.0f) == 0) {
                                                        iIntValue = 90;
                                                    } else if (Float.compare(ys5Var.f70422w, -180.0f) != 0) {
                                                        iIntValue = 180;
                                                    } else {
                                                        iIntValue = 180;
                                                    }
                                                }
                                                lc3Var.f49460u = ys5Var.f70413n;
                                                lc3Var.f49461v = ys5Var.f70414o;
                                                lc3Var.f49425A = f;
                                                lc3Var.f49465z = iIntValue;
                                                lc3Var.f49426B = ys5Var.f70423x;
                                                lc3Var.f49427C = ys5Var.f70424y;
                                                lc3Var.f49428D = ga1Var;
                                            } else if (!"application/x-subrip".equals(str9)) {
                                                throw ParserException.m2516a(null, "Unexpected MIME type.");
                                            }
                                            str6 = ys5Var.f70399b;
                                            if (str6 != null) {
                                                lc3Var.f49441b = ys5Var.f70399b;
                                            }
                                            lc3Var.f49440a = Integer.toString(i21);
                                            if (ys5Var.f70397a) {
                                                str7 = "video/webm";
                                            } else {
                                                str7 = "video/x-matroska";
                                            }
                                            lc3Var.f49452m = ez5.m11402l(str7);
                                            lc3Var.f49453n = ez5.m11402l(str9);
                                            lc3Var.f49454o = i6;
                                            lc3Var.f49443d = ys5Var.f70396Z;
                                            lc3Var.f49444e = i2112;
                                            lc3Var.f49456q = list3;
                                            lc3Var.f49449j = str3;
                                            lc3Var.f49457r = ys5Var.f70412m;
                                            ys5Var.f70400b0 = lc3Var.m16068a();
                                            ys5Var.f70398a0 = zs5Var3.f72091j0.mo2555n(ys5Var.f70403d, ys5Var.f70404e);
                                            sparseArray2.put(ys5Var.f70403d, ys5Var);
                                            break;
                                        case 4:
                                            byte[] bArrM25306a = ys5Var.m25306a(str8);
                                            try {
                                                r3 = bArrM25306a[0];
                                                try {
                                                    if (r3 != 2) {
                                                        throw ParserException.m2516a(null, "Error parsing vorbis codec private");
                                                    }
                                                    int i31 = 0;
                                                    int i32 = 1;
                                                    while (true) {
                                                        int i33 = bArrM25306a[i32] & 255;
                                                        if (i33 != 255) {
                                                            int i34 = i32 + 1;
                                                            int i35 = i31 + i33;
                                                            int i36 = 0;
                                                            while (true) {
                                                                int i37 = bArrM25306a[i34] & 255;
                                                                if (i37 != 255) {
                                                                    int i38 = i34 + 1;
                                                                    int i39 = i36 + i37;
                                                                    if (bArrM25306a[i38] != 1) {
                                                                        throw ParserException.m2516a(null, "Error parsing vorbis codec private");
                                                                    }
                                                                    byte[] bArr6 = new byte[i35];
                                                                    System.arraycopy(bArrM25306a, i38, bArr6, 0, i35);
                                                                    int i40 = i38 + i35;
                                                                    if (bArrM25306a[i40] != 3) {
                                                                        throw ParserException.m2516a(null, "Error parsing vorbis codec private");
                                                                    }
                                                                    int i41 = i40 + i39;
                                                                    if (bArrM25306a[i41] != 5) {
                                                                        throw ParserException.m2516a(null, "Error parsing vorbis codec private");
                                                                    }
                                                                    byte[] bArr7 = new byte[bArrM25306a.length - i41];
                                                                    System.arraycopy(bArrM25306a, i41, bArr7, 0, bArrM25306a.length - i41);
                                                                    ArrayList arrayList2 = new ArrayList(2);
                                                                    arrayList2.add(bArr6);
                                                                    arrayList2.add(bArr7);
                                                                    str9 = "audio/vorbis";
                                                                    i6 = 8192;
                                                                    arrayList = arrayList2;
                                                                    iM22825t = -1;
                                                                    list4 = arrayList;
                                                                    str3 = null;
                                                                    list3 = list4;
                                                                    if (ys5Var.f70386P != null) {
                                                                        str3 = c3404ocM17906c.f54162b;
                                                                        str9 = "video/dolby-vision";
                                                                    }
                                                                    boolean z12 = ys5Var.f70395Y;
                                                                    if (ys5Var.f70394X) {
                                                                        i7 = 2;
                                                                    } else {
                                                                        i7 = 0;
                                                                    }
                                                                    int i2117 = (z12 ? 1 : 0) | i7;
                                                                    lc3Var = new lc3();
                                                                    zM11398h = ez5.m11398h(str9);
                                                                    Map map6 = f72045p0;
                                                                    if (zM11398h) {
                                                                        lc3Var.f49430F = ys5Var.f70387Q;
                                                                        lc3Var.f49431G = ys5Var.f70389S;
                                                                        lc3Var.f49432H = iM22825t;
                                                                    } else if (ez5.m11401k(str9)) {
                                                                        if (ys5Var.f70418s == 0) {
                                                                            i11 = ys5Var.f70416q;
                                                                            i8 = -1;
                                                                            if (i11 == -1) {
                                                                                i11 = ys5Var.f70413n;
                                                                            }
                                                                            ys5Var.f70416q = i11;
                                                                            i12 = ys5Var.f70417r;
                                                                            if (i12 == -1) {
                                                                                i12 = ys5Var.f70414o;
                                                                            }
                                                                            ys5Var.f70417r = i12;
                                                                        } else {
                                                                            i8 = -1;
                                                                        }
                                                                        i9 = ys5Var.f70416q;
                                                                        if (i9 != i8) {
                                                                            f = -1.0f;
                                                                        } else {
                                                                            f = -1.0f;
                                                                        }
                                                                        if (ys5Var.f70425z) {
                                                                            if (ys5Var.f70376F != -1.0f) {
                                                                                bArr = null;
                                                                            } else {
                                                                                bArr = null;
                                                                            }
                                                                            int i2118 = ys5Var.f70371A;
                                                                            int i2119 = ys5Var.f70373C;
                                                                            int i21110 = ys5Var.f70372B;
                                                                            int i21111 = ys5Var.f70415p;
                                                                            ga1Var = new ga1(i2118, i2119, i21110, bArr, i21111, i21111);
                                                                        } else {
                                                                            ga1Var = null;
                                                                        }
                                                                        str5 = ys5Var.f70399b;
                                                                        if (str5 == null) {
                                                                            iIntValue = -1;
                                                                        } else {
                                                                            iIntValue = -1;
                                                                        }
                                                                        if (ys5Var.f70419t == 0) {
                                                                            if (Float.compare(ys5Var.f70422w, 0.0f) == 0) {
                                                                                iIntValue = 0;
                                                                            } else if (Float.compare(ys5Var.f70422w, 90.0f) == 0) {
                                                                                iIntValue = 90;
                                                                            } else if (Float.compare(ys5Var.f70422w, -180.0f) != 0) {
                                                                                iIntValue = 180;
                                                                            } else {
                                                                                iIntValue = 180;
                                                                            }
                                                                        }
                                                                        lc3Var.f49460u = ys5Var.f70413n;
                                                                        lc3Var.f49461v = ys5Var.f70414o;
                                                                        lc3Var.f49425A = f;
                                                                        lc3Var.f49465z = iIntValue;
                                                                        lc3Var.f49426B = ys5Var.f70423x;
                                                                        lc3Var.f49427C = ys5Var.f70424y;
                                                                        lc3Var.f49428D = ga1Var;
                                                                    } else if (!"application/x-subrip".equals(str9)) {
                                                                        throw ParserException.m2516a(null, "Unexpected MIME type.");
                                                                    }
                                                                    str6 = ys5Var.f70399b;
                                                                    if (str6 != null) {
                                                                        lc3Var.f49441b = ys5Var.f70399b;
                                                                    }
                                                                    lc3Var.f49440a = Integer.toString(i21);
                                                                    if (ys5Var.f70397a) {
                                                                        str7 = "video/webm";
                                                                    } else {
                                                                        str7 = "video/x-matroska";
                                                                    }
                                                                    lc3Var.f49452m = ez5.m11402l(str7);
                                                                    lc3Var.f49453n = ez5.m11402l(str9);
                                                                    lc3Var.f49454o = i6;
                                                                    lc3Var.f49443d = ys5Var.f70396Z;
                                                                    lc3Var.f49444e = i2117;
                                                                    lc3Var.f49456q = list3;
                                                                    lc3Var.f49449j = str3;
                                                                    lc3Var.f49457r = ys5Var.f70412m;
                                                                    ys5Var.f70400b0 = lc3Var.m16068a();
                                                                    ys5Var.f70398a0 = zs5Var3.f72091j0.mo2555n(ys5Var.f70403d, ys5Var.f70404e);
                                                                    sparseArray2.put(ys5Var.f70403d, ys5Var);
                                                                } else {
                                                                    i36 += 255;
                                                                    i34++;
                                                                }
                                                            }
                                                        } else {
                                                            i31 += 255;
                                                            i32++;
                                                        }
                                                    }
                                                } catch (ArrayIndexOutOfBoundsException unused2) {
                                                    throw ParserException.m2516a(r3, "Error parsing vorbis codec private");
                                                }
                                            } catch (ArrayIndexOutOfBoundsException unused3) {
                                                r3 = 0;
                                            }
                                            break;
                                        case 5:
                                            str9 = "audio/mpeg-L2";
                                            iM22825t = -1;
                                            i6 = 4096;
                                            str3 = null;
                                            list3 = null;
                                            if (ys5Var.f70386P != null) {
                                                str3 = c3404ocM17906c.f54162b;
                                                str9 = "video/dolby-vision";
                                            }
                                            boolean z13 = ys5Var.f70395Y;
                                            if (ys5Var.f70394X) {
                                                i7 = 2;
                                            } else {
                                                i7 = 0;
                                            }
                                            int i21112 = (z13 ? 1 : 0) | i7;
                                            lc3Var = new lc3();
                                            zM11398h = ez5.m11398h(str9);
                                            Map map7 = f72045p0;
                                            if (zM11398h) {
                                                lc3Var.f49430F = ys5Var.f70387Q;
                                                lc3Var.f49431G = ys5Var.f70389S;
                                                lc3Var.f49432H = iM22825t;
                                            } else if (ez5.m11401k(str9)) {
                                                if (ys5Var.f70418s == 0) {
                                                    i11 = ys5Var.f70416q;
                                                    i8 = -1;
                                                    if (i11 == -1) {
                                                        i11 = ys5Var.f70413n;
                                                    }
                                                    ys5Var.f70416q = i11;
                                                    i12 = ys5Var.f70417r;
                                                    if (i12 == -1) {
                                                        i12 = ys5Var.f70414o;
                                                    }
                                                    ys5Var.f70417r = i12;
                                                } else {
                                                    i8 = -1;
                                                }
                                                i9 = ys5Var.f70416q;
                                                if (i9 != i8) {
                                                    f = -1.0f;
                                                } else {
                                                    f = -1.0f;
                                                }
                                                if (ys5Var.f70425z) {
                                                    if (ys5Var.f70376F != -1.0f) {
                                                        bArr = null;
                                                    } else {
                                                        bArr = null;
                                                    }
                                                    int i21113 = ys5Var.f70371A;
                                                    int i21114 = ys5Var.f70373C;
                                                    int i21115 = ys5Var.f70372B;
                                                    int i21116 = ys5Var.f70415p;
                                                    ga1Var = new ga1(i21113, i21114, i21115, bArr, i21116, i21116);
                                                } else {
                                                    ga1Var = null;
                                                }
                                                str5 = ys5Var.f70399b;
                                                if (str5 == null) {
                                                    iIntValue = -1;
                                                } else {
                                                    iIntValue = -1;
                                                }
                                                if (ys5Var.f70419t == 0) {
                                                    if (Float.compare(ys5Var.f70422w, 0.0f) == 0) {
                                                        iIntValue = 0;
                                                    } else if (Float.compare(ys5Var.f70422w, 90.0f) == 0) {
                                                        iIntValue = 90;
                                                    } else if (Float.compare(ys5Var.f70422w, -180.0f) != 0) {
                                                        iIntValue = 180;
                                                    } else {
                                                        iIntValue = 180;
                                                    }
                                                }
                                                lc3Var.f49460u = ys5Var.f70413n;
                                                lc3Var.f49461v = ys5Var.f70414o;
                                                lc3Var.f49425A = f;
                                                lc3Var.f49465z = iIntValue;
                                                lc3Var.f49426B = ys5Var.f70423x;
                                                lc3Var.f49427C = ys5Var.f70424y;
                                                lc3Var.f49428D = ga1Var;
                                            } else if (!"application/x-subrip".equals(str9)) {
                                                throw ParserException.m2516a(null, "Unexpected MIME type.");
                                            }
                                            str6 = ys5Var.f70399b;
                                            if (str6 != null) {
                                                lc3Var.f49441b = ys5Var.f70399b;
                                            }
                                            lc3Var.f49440a = Integer.toString(i21);
                                            if (ys5Var.f70397a) {
                                                str7 = "video/webm";
                                            } else {
                                                str7 = "video/x-matroska";
                                            }
                                            lc3Var.f49452m = ez5.m11402l(str7);
                                            lc3Var.f49453n = ez5.m11402l(str9);
                                            lc3Var.f49454o = i6;
                                            lc3Var.f49443d = ys5Var.f70396Z;
                                            lc3Var.f49444e = i21112;
                                            lc3Var.f49456q = list3;
                                            lc3Var.f49449j = str3;
                                            lc3Var.f49457r = ys5Var.f70412m;
                                            ys5Var.f70400b0 = lc3Var.m16068a();
                                            ys5Var.f70398a0 = zs5Var3.f72091j0.mo2555n(ys5Var.f70403d, ys5Var.f70404e);
                                            sparseArray2.put(ys5Var.f70403d, ys5Var);
                                            break;
                                        case 6:
                                            str9 = "audio/mpeg";
                                            iM22825t = -1;
                                            i6 = 4096;
                                            str3 = null;
                                            list3 = null;
                                            if (ys5Var.f70386P != null) {
                                                str3 = c3404ocM17906c.f54162b;
                                                str9 = "video/dolby-vision";
                                            }
                                            boolean z14 = ys5Var.f70395Y;
                                            if (ys5Var.f70394X) {
                                                i7 = 2;
                                            } else {
                                                i7 = 0;
                                            }
                                            int i21117 = (z14 ? 1 : 0) | i7;
                                            lc3Var = new lc3();
                                            zM11398h = ez5.m11398h(str9);
                                            Map map8 = f72045p0;
                                            if (zM11398h) {
                                                lc3Var.f49430F = ys5Var.f70387Q;
                                                lc3Var.f49431G = ys5Var.f70389S;
                                                lc3Var.f49432H = iM22825t;
                                            } else if (ez5.m11401k(str9)) {
                                                if (ys5Var.f70418s == 0) {
                                                    i11 = ys5Var.f70416q;
                                                    i8 = -1;
                                                    if (i11 == -1) {
                                                        i11 = ys5Var.f70413n;
                                                    }
                                                    ys5Var.f70416q = i11;
                                                    i12 = ys5Var.f70417r;
                                                    if (i12 == -1) {
                                                        i12 = ys5Var.f70414o;
                                                    }
                                                    ys5Var.f70417r = i12;
                                                } else {
                                                    i8 = -1;
                                                }
                                                i9 = ys5Var.f70416q;
                                                if (i9 != i8) {
                                                    f = -1.0f;
                                                } else {
                                                    f = -1.0f;
                                                }
                                                if (ys5Var.f70425z) {
                                                    if (ys5Var.f70376F != -1.0f) {
                                                        bArr = null;
                                                    } else {
                                                        bArr = null;
                                                    }
                                                    int i21118 = ys5Var.f70371A;
                                                    int i21119 = ys5Var.f70373C;
                                                    int i211110 = ys5Var.f70372B;
                                                    int i211111 = ys5Var.f70415p;
                                                    ga1Var = new ga1(i21118, i21119, i211110, bArr, i211111, i211111);
                                                } else {
                                                    ga1Var = null;
                                                }
                                                str5 = ys5Var.f70399b;
                                                if (str5 == null) {
                                                    iIntValue = -1;
                                                } else {
                                                    iIntValue = -1;
                                                }
                                                if (ys5Var.f70419t == 0) {
                                                    if (Float.compare(ys5Var.f70422w, 0.0f) == 0) {
                                                        iIntValue = 0;
                                                    } else if (Float.compare(ys5Var.f70422w, 90.0f) == 0) {
                                                        iIntValue = 90;
                                                    } else if (Float.compare(ys5Var.f70422w, -180.0f) != 0) {
                                                        iIntValue = 180;
                                                    } else {
                                                        iIntValue = 180;
                                                    }
                                                }
                                                lc3Var.f49460u = ys5Var.f70413n;
                                                lc3Var.f49461v = ys5Var.f70414o;
                                                lc3Var.f49425A = f;
                                                lc3Var.f49465z = iIntValue;
                                                lc3Var.f49426B = ys5Var.f70423x;
                                                lc3Var.f49427C = ys5Var.f70424y;
                                                lc3Var.f49428D = ga1Var;
                                            } else if (!"application/x-subrip".equals(str9)) {
                                                throw ParserException.m2516a(null, "Unexpected MIME type.");
                                            }
                                            str6 = ys5Var.f70399b;
                                            if (str6 != null) {
                                                lc3Var.f49441b = ys5Var.f70399b;
                                            }
                                            lc3Var.f49440a = Integer.toString(i21);
                                            if (ys5Var.f70397a) {
                                                str7 = "video/webm";
                                            } else {
                                                str7 = "video/x-matroska";
                                            }
                                            lc3Var.f49452m = ez5.m11402l(str7);
                                            lc3Var.f49453n = ez5.m11402l(str9);
                                            lc3Var.f49454o = i6;
                                            lc3Var.f49443d = ys5Var.f70396Z;
                                            lc3Var.f49444e = i21117;
                                            lc3Var.f49456q = list3;
                                            lc3Var.f49449j = str3;
                                            lc3Var.f49457r = ys5Var.f70412m;
                                            ys5Var.f70400b0 = lc3Var.m16068a();
                                            ys5Var.f70398a0 = zs5Var3.f72091j0.mo2555n(ys5Var.f70403d, ys5Var.f70404e);
                                            sparseArray2.put(ys5Var.f70403d, ys5Var);
                                            break;
                                        case 7:
                                            k47 k47Var2 = new k47(ys5Var.m25306a(ys5Var.f70401c));
                                            try {
                                                k47Var2.m14819N(16);
                                                long jM14833q = k47Var2.m14833q();
                                                if (jM14833q == 1482049860) {
                                                    try {
                                                        pair = new Pair("video/divx", null);
                                                        str2 = null;
                                                    } catch (ArrayIndexOutOfBoundsException unused4) {
                                                        runtimeException = null;
                                                    }
                                                } else {
                                                    if (jM14833q == 859189832) {
                                                        pair = new Pair("video/3gpp", null);
                                                    } else {
                                                        if (jM14833q == 826496599) {
                                                            int i42 = k47Var2.f46701b + 20;
                                                            byte[] bArr8 = k47Var2.f46700a;
                                                            while (true) {
                                                                if (i42 < bArr8.length - 4) {
                                                                    if (bArr8[i42] == 0 && bArr8[i42 + 1] == 0 && bArr8[i42 + 2] == 1) {
                                                                        if (bArr8[i42 + 3] == 15) {
                                                                            pair = new Pair("video/wvc1", Collections.singletonList(Arrays.copyOfRange(bArr8, i42, bArr8.length)));
                                                                        }
                                                                    }
                                                                    i42++;
                                                                } else {
                                                                    runtimeException = null;
                                                                    try {
                                                                        throw ParserException.m2516a(null, "Failed to find FourCC VC1 initialization data");
                                                                    } catch (ArrayIndexOutOfBoundsException unused5) {
                                                                    }
                                                                }
                                                                throw ParserException.m2516a(runtimeException, "Error parsing FourCC private data");
                                                            }
                                                        }
                                                        ss5.m21707d0("MatroskaExtractor", "Unknown FourCC. Setting mimeType to video/x-unknown");
                                                        str2 = null;
                                                        pair = new Pair("video/x-unknown", null);
                                                    }
                                                    str2 = null;
                                                }
                                                str9 = (String) pair.first;
                                                str3 = str2;
                                                list = (List) pair.second;
                                                iM22825t = -1;
                                                i6 = -1;
                                                list3 = list;
                                                if (ys5Var.f70386P != null) {
                                                    str3 = c3404ocM17906c.f54162b;
                                                    str9 = "video/dolby-vision";
                                                }
                                                boolean z15 = ys5Var.f70395Y;
                                                if (ys5Var.f70394X) {
                                                    i7 = 2;
                                                } else {
                                                    i7 = 0;
                                                }
                                                int i211112 = (z15 ? 1 : 0) | i7;
                                                lc3Var = new lc3();
                                                zM11398h = ez5.m11398h(str9);
                                                Map map9 = f72045p0;
                                                if (zM11398h) {
                                                    lc3Var.f49430F = ys5Var.f70387Q;
                                                    lc3Var.f49431G = ys5Var.f70389S;
                                                    lc3Var.f49432H = iM22825t;
                                                } else if (ez5.m11401k(str9)) {
                                                    if (ys5Var.f70418s == 0) {
                                                        i11 = ys5Var.f70416q;
                                                        i8 = -1;
                                                        if (i11 == -1) {
                                                            i11 = ys5Var.f70413n;
                                                        }
                                                        ys5Var.f70416q = i11;
                                                        i12 = ys5Var.f70417r;
                                                        if (i12 == -1) {
                                                            i12 = ys5Var.f70414o;
                                                        }
                                                        ys5Var.f70417r = i12;
                                                    } else {
                                                        i8 = -1;
                                                    }
                                                    i9 = ys5Var.f70416q;
                                                    if (i9 != i8) {
                                                        f = -1.0f;
                                                    } else {
                                                        f = -1.0f;
                                                    }
                                                    if (ys5Var.f70425z) {
                                                        if (ys5Var.f70376F != -1.0f) {
                                                            bArr = null;
                                                        } else {
                                                            bArr = null;
                                                        }
                                                        int i211113 = ys5Var.f70371A;
                                                        int i211114 = ys5Var.f70373C;
                                                        int i211115 = ys5Var.f70372B;
                                                        int i211116 = ys5Var.f70415p;
                                                        ga1Var = new ga1(i211113, i211114, i211115, bArr, i211116, i211116);
                                                    } else {
                                                        ga1Var = null;
                                                    }
                                                    str5 = ys5Var.f70399b;
                                                    if (str5 == null) {
                                                        iIntValue = -1;
                                                    } else {
                                                        iIntValue = -1;
                                                    }
                                                    if (ys5Var.f70419t == 0) {
                                                        if (Float.compare(ys5Var.f70422w, 0.0f) == 0) {
                                                            iIntValue = 0;
                                                        } else if (Float.compare(ys5Var.f70422w, 90.0f) == 0) {
                                                            iIntValue = 90;
                                                        } else if (Float.compare(ys5Var.f70422w, -180.0f) != 0) {
                                                            iIntValue = 180;
                                                        } else {
                                                            iIntValue = 180;
                                                        }
                                                    }
                                                    lc3Var.f49460u = ys5Var.f70413n;
                                                    lc3Var.f49461v = ys5Var.f70414o;
                                                    lc3Var.f49425A = f;
                                                    lc3Var.f49465z = iIntValue;
                                                    lc3Var.f49426B = ys5Var.f70423x;
                                                    lc3Var.f49427C = ys5Var.f70424y;
                                                    lc3Var.f49428D = ga1Var;
                                                } else if (!"application/x-subrip".equals(str9)) {
                                                    throw ParserException.m2516a(null, "Unexpected MIME type.");
                                                }
                                                str6 = ys5Var.f70399b;
                                                if (str6 != null) {
                                                    lc3Var.f49441b = ys5Var.f70399b;
                                                }
                                                lc3Var.f49440a = Integer.toString(i21);
                                                if (ys5Var.f70397a) {
                                                    str7 = "video/webm";
                                                } else {
                                                    str7 = "video/x-matroska";
                                                }
                                                lc3Var.f49452m = ez5.m11402l(str7);
                                                lc3Var.f49453n = ez5.m11402l(str9);
                                                lc3Var.f49454o = i6;
                                                lc3Var.f49443d = ys5Var.f70396Z;
                                                lc3Var.f49444e = i211112;
                                                lc3Var.f49456q = list3;
                                                lc3Var.f49449j = str3;
                                                lc3Var.f49457r = ys5Var.f70412m;
                                                ys5Var.f70400b0 = lc3Var.m16068a();
                                                ys5Var.f70398a0 = zs5Var3.f72091j0.mo2555n(ys5Var.f70403d, ys5Var.f70404e);
                                                sparseArray2.put(ys5Var.f70403d, ys5Var);
                                            } catch (ArrayIndexOutOfBoundsException unused6) {
                                                runtimeException = null;
                                            }
                                            break;
                                        case 8:
                                            byte[] bArr9 = new byte[4];
                                            System.arraycopy(ys5Var.m25306a(str8), 0, bArr9, 0, 4);
                                            listM6291y = ImmutableList.m6291y(bArr9);
                                            str9 = "application/dvbsubs";
                                            iM22825t = -1;
                                            i6 = -1;
                                            list4 = listM6291y;
                                            str3 = null;
                                            list3 = list4;
                                            if (ys5Var.f70386P != null) {
                                                str3 = c3404ocM17906c.f54162b;
                                                str9 = "video/dolby-vision";
                                            }
                                            boolean z16 = ys5Var.f70395Y;
                                            if (ys5Var.f70394X) {
                                                i7 = 2;
                                            } else {
                                                i7 = 0;
                                            }
                                            int i211117 = (z16 ? 1 : 0) | i7;
                                            lc3Var = new lc3();
                                            zM11398h = ez5.m11398h(str9);
                                            Map map10 = f72045p0;
                                            if (zM11398h) {
                                                lc3Var.f49430F = ys5Var.f70387Q;
                                                lc3Var.f49431G = ys5Var.f70389S;
                                                lc3Var.f49432H = iM22825t;
                                            } else if (ez5.m11401k(str9)) {
                                                if (ys5Var.f70418s == 0) {
                                                    i11 = ys5Var.f70416q;
                                                    i8 = -1;
                                                    if (i11 == -1) {
                                                        i11 = ys5Var.f70413n;
                                                    }
                                                    ys5Var.f70416q = i11;
                                                    i12 = ys5Var.f70417r;
                                                    if (i12 == -1) {
                                                        i12 = ys5Var.f70414o;
                                                    }
                                                    ys5Var.f70417r = i12;
                                                } else {
                                                    i8 = -1;
                                                }
                                                i9 = ys5Var.f70416q;
                                                if (i9 != i8) {
                                                    f = -1.0f;
                                                } else {
                                                    f = -1.0f;
                                                }
                                                if (ys5Var.f70425z) {
                                                    if (ys5Var.f70376F != -1.0f) {
                                                        bArr = null;
                                                    } else {
                                                        bArr = null;
                                                    }
                                                    int i211118 = ys5Var.f70371A;
                                                    int i211119 = ys5Var.f70373C;
                                                    int i2111110 = ys5Var.f70372B;
                                                    int i2111111 = ys5Var.f70415p;
                                                    ga1Var = new ga1(i211118, i211119, i2111110, bArr, i2111111, i2111111);
                                                } else {
                                                    ga1Var = null;
                                                }
                                                str5 = ys5Var.f70399b;
                                                if (str5 == null) {
                                                    iIntValue = -1;
                                                } else {
                                                    iIntValue = -1;
                                                }
                                                if (ys5Var.f70419t == 0) {
                                                    if (Float.compare(ys5Var.f70422w, 0.0f) == 0) {
                                                        iIntValue = 0;
                                                    } else if (Float.compare(ys5Var.f70422w, 90.0f) == 0) {
                                                        iIntValue = 90;
                                                    } else if (Float.compare(ys5Var.f70422w, -180.0f) != 0) {
                                                        iIntValue = 180;
                                                    } else {
                                                        iIntValue = 180;
                                                    }
                                                }
                                                lc3Var.f49460u = ys5Var.f70413n;
                                                lc3Var.f49461v = ys5Var.f70414o;
                                                lc3Var.f49425A = f;
                                                lc3Var.f49465z = iIntValue;
                                                lc3Var.f49426B = ys5Var.f70423x;
                                                lc3Var.f49427C = ys5Var.f70424y;
                                                lc3Var.f49428D = ga1Var;
                                            } else if (!"application/x-subrip".equals(str9)) {
                                                throw ParserException.m2516a(null, "Unexpected MIME type.");
                                            }
                                            str6 = ys5Var.f70399b;
                                            if (str6 != null) {
                                                lc3Var.f49441b = ys5Var.f70399b;
                                            }
                                            lc3Var.f49440a = Integer.toString(i21);
                                            if (ys5Var.f70397a) {
                                                str7 = "video/webm";
                                            } else {
                                                str7 = "video/x-matroska";
                                            }
                                            lc3Var.f49452m = ez5.m11402l(str7);
                                            lc3Var.f49453n = ez5.m11402l(str9);
                                            lc3Var.f49454o = i6;
                                            lc3Var.f49443d = ys5Var.f70396Z;
                                            lc3Var.f49444e = i211117;
                                            lc3Var.f49456q = list3;
                                            lc3Var.f49449j = str3;
                                            lc3Var.f49457r = ys5Var.f70412m;
                                            ys5Var.f70400b0 = lc3Var.m16068a();
                                            ys5Var.f70398a0 = zs5Var3.f72091j0.mo2555n(ys5Var.f70403d, ys5Var.f70404e);
                                            sparseArray2.put(ys5Var.f70403d, ys5Var);
                                            break;
                                        case 10:
                                            e60 e60VarM10863a = e60.m10863a(new k47(ys5Var.m25306a(ys5Var.f70401c)));
                                            ArrayList arrayList3 = e60VarM10863a.f36733a;
                                            ys5Var.f70402c0 = e60VarM10863a.f36734b;
                                            str4 = e60VarM10863a.f36744l;
                                            str9 = "video/avc";
                                            list2 = arrayList3;
                                            str3 = str4;
                                            list = list2;
                                            iM22825t = -1;
                                            i6 = -1;
                                            list3 = list;
                                            if (ys5Var.f70386P != null) {
                                                str3 = c3404ocM17906c.f54162b;
                                                str9 = "video/dolby-vision";
                                            }
                                            boolean z17 = ys5Var.f70395Y;
                                            if (ys5Var.f70394X) {
                                                i7 = 2;
                                            } else {
                                                i7 = 0;
                                            }
                                            int i2111112 = (z17 ? 1 : 0) | i7;
                                            lc3Var = new lc3();
                                            zM11398h = ez5.m11398h(str9);
                                            Map map11 = f72045p0;
                                            if (zM11398h) {
                                                lc3Var.f49430F = ys5Var.f70387Q;
                                                lc3Var.f49431G = ys5Var.f70389S;
                                                lc3Var.f49432H = iM22825t;
                                            } else if (ez5.m11401k(str9)) {
                                                if (ys5Var.f70418s == 0) {
                                                    i11 = ys5Var.f70416q;
                                                    i8 = -1;
                                                    if (i11 == -1) {
                                                        i11 = ys5Var.f70413n;
                                                    }
                                                    ys5Var.f70416q = i11;
                                                    i12 = ys5Var.f70417r;
                                                    if (i12 == -1) {
                                                        i12 = ys5Var.f70414o;
                                                    }
                                                    ys5Var.f70417r = i12;
                                                } else {
                                                    i8 = -1;
                                                }
                                                i9 = ys5Var.f70416q;
                                                if (i9 != i8) {
                                                    f = -1.0f;
                                                } else {
                                                    f = -1.0f;
                                                }
                                                if (ys5Var.f70425z) {
                                                    if (ys5Var.f70376F != -1.0f) {
                                                        bArr = null;
                                                    } else {
                                                        bArr = null;
                                                    }
                                                    int i2111113 = ys5Var.f70371A;
                                                    int i2111114 = ys5Var.f70373C;
                                                    int i2111115 = ys5Var.f70372B;
                                                    int i2111116 = ys5Var.f70415p;
                                                    ga1Var = new ga1(i2111113, i2111114, i2111115, bArr, i2111116, i2111116);
                                                } else {
                                                    ga1Var = null;
                                                }
                                                str5 = ys5Var.f70399b;
                                                if (str5 == null) {
                                                    iIntValue = -1;
                                                } else {
                                                    iIntValue = -1;
                                                }
                                                if (ys5Var.f70419t == 0) {
                                                    if (Float.compare(ys5Var.f70422w, 0.0f) == 0) {
                                                        iIntValue = 0;
                                                    } else if (Float.compare(ys5Var.f70422w, 90.0f) == 0) {
                                                        iIntValue = 90;
                                                    } else if (Float.compare(ys5Var.f70422w, -180.0f) != 0) {
                                                        iIntValue = 180;
                                                    } else {
                                                        iIntValue = 180;
                                                    }
                                                }
                                                lc3Var.f49460u = ys5Var.f70413n;
                                                lc3Var.f49461v = ys5Var.f70414o;
                                                lc3Var.f49425A = f;
                                                lc3Var.f49465z = iIntValue;
                                                lc3Var.f49426B = ys5Var.f70423x;
                                                lc3Var.f49427C = ys5Var.f70424y;
                                                lc3Var.f49428D = ga1Var;
                                            } else if (!"application/x-subrip".equals(str9)) {
                                                throw ParserException.m2516a(null, "Unexpected MIME type.");
                                            }
                                            str6 = ys5Var.f70399b;
                                            if (str6 != null) {
                                                lc3Var.f49441b = ys5Var.f70399b;
                                            }
                                            lc3Var.f49440a = Integer.toString(i21);
                                            if (ys5Var.f70397a) {
                                                str7 = "video/webm";
                                            } else {
                                                str7 = "video/x-matroska";
                                            }
                                            lc3Var.f49452m = ez5.m11402l(str7);
                                            lc3Var.f49453n = ez5.m11402l(str9);
                                            lc3Var.f49454o = i6;
                                            lc3Var.f49443d = ys5Var.f70396Z;
                                            lc3Var.f49444e = i2111112;
                                            lc3Var.f49456q = list3;
                                            lc3Var.f49449j = str3;
                                            lc3Var.f49457r = ys5Var.f70412m;
                                            ys5Var.f70400b0 = lc3Var.m16068a();
                                            ys5Var.f70398a0 = zs5Var3.f72091j0.mo2555n(ys5Var.f70403d, ys5Var.f70404e);
                                            sparseArray2.put(ys5Var.f70403d, ys5Var);
                                            break;
                                        case 11:
                                            listM6291y = ImmutableList.m6291y(ys5Var.m25306a(str8));
                                            str9 = "application/vobsub";
                                            iM22825t = -1;
                                            i6 = -1;
                                            list4 = listM6291y;
                                            str3 = null;
                                            list3 = list4;
                                            if (ys5Var.f70386P != null) {
                                                str3 = c3404ocM17906c.f54162b;
                                                str9 = "video/dolby-vision";
                                            }
                                            boolean z18 = ys5Var.f70395Y;
                                            if (ys5Var.f70394X) {
                                                i7 = 2;
                                            } else {
                                                i7 = 0;
                                            }
                                            int i2111117 = (z18 ? 1 : 0) | i7;
                                            lc3Var = new lc3();
                                            zM11398h = ez5.m11398h(str9);
                                            Map map12 = f72045p0;
                                            if (zM11398h) {
                                                lc3Var.f49430F = ys5Var.f70387Q;
                                                lc3Var.f49431G = ys5Var.f70389S;
                                                lc3Var.f49432H = iM22825t;
                                            } else if (ez5.m11401k(str9)) {
                                                if (ys5Var.f70418s == 0) {
                                                    i11 = ys5Var.f70416q;
                                                    i8 = -1;
                                                    if (i11 == -1) {
                                                        i11 = ys5Var.f70413n;
                                                    }
                                                    ys5Var.f70416q = i11;
                                                    i12 = ys5Var.f70417r;
                                                    if (i12 == -1) {
                                                        i12 = ys5Var.f70414o;
                                                    }
                                                    ys5Var.f70417r = i12;
                                                } else {
                                                    i8 = -1;
                                                }
                                                i9 = ys5Var.f70416q;
                                                if (i9 != i8) {
                                                    f = -1.0f;
                                                } else {
                                                    f = -1.0f;
                                                }
                                                if (ys5Var.f70425z) {
                                                    if (ys5Var.f70376F != -1.0f) {
                                                        bArr = null;
                                                    } else {
                                                        bArr = null;
                                                    }
                                                    int i2111118 = ys5Var.f70371A;
                                                    int i2111119 = ys5Var.f70373C;
                                                    int i21111110 = ys5Var.f70372B;
                                                    int i21111111 = ys5Var.f70415p;
                                                    ga1Var = new ga1(i2111118, i2111119, i21111110, bArr, i21111111, i21111111);
                                                } else {
                                                    ga1Var = null;
                                                }
                                                str5 = ys5Var.f70399b;
                                                if (str5 == null) {
                                                    iIntValue = -1;
                                                } else {
                                                    iIntValue = -1;
                                                }
                                                if (ys5Var.f70419t == 0) {
                                                    if (Float.compare(ys5Var.f70422w, 0.0f) == 0) {
                                                        iIntValue = 0;
                                                    } else if (Float.compare(ys5Var.f70422w, 90.0f) == 0) {
                                                        iIntValue = 90;
                                                    } else if (Float.compare(ys5Var.f70422w, -180.0f) != 0) {
                                                        iIntValue = 180;
                                                    } else {
                                                        iIntValue = 180;
                                                    }
                                                }
                                                lc3Var.f49460u = ys5Var.f70413n;
                                                lc3Var.f49461v = ys5Var.f70414o;
                                                lc3Var.f49425A = f;
                                                lc3Var.f49465z = iIntValue;
                                                lc3Var.f49426B = ys5Var.f70423x;
                                                lc3Var.f49427C = ys5Var.f70424y;
                                                lc3Var.f49428D = ga1Var;
                                            } else if (!"application/x-subrip".equals(str9)) {
                                                throw ParserException.m2516a(null, "Unexpected MIME type.");
                                            }
                                            str6 = ys5Var.f70399b;
                                            if (str6 != null) {
                                                lc3Var.f49441b = ys5Var.f70399b;
                                            }
                                            lc3Var.f49440a = Integer.toString(i21);
                                            if (ys5Var.f70397a) {
                                                str7 = "video/webm";
                                            } else {
                                                str7 = "video/x-matroska";
                                            }
                                            lc3Var.f49452m = ez5.m11402l(str7);
                                            lc3Var.f49453n = ez5.m11402l(str9);
                                            lc3Var.f49454o = i6;
                                            lc3Var.f49443d = ys5Var.f70396Z;
                                            lc3Var.f49444e = i2111117;
                                            lc3Var.f49456q = list3;
                                            lc3Var.f49449j = str3;
                                            lc3Var.f49457r = ys5Var.f70412m;
                                            ys5Var.f70400b0 = lc3Var.m16068a();
                                            ys5Var.f70398a0 = zs5Var3.f72091j0.mo2555n(ys5Var.f70403d, ys5Var.f70404e);
                                            sparseArray2.put(ys5Var.f70403d, ys5Var);
                                            break;
                                        case 12:
                                            str9 = "audio/vnd.dts.hd";
                                            iM22825t = -1;
                                            i6 = -1;
                                            str3 = null;
                                            list3 = null;
                                            if (ys5Var.f70386P != null) {
                                                str3 = c3404ocM17906c.f54162b;
                                                str9 = "video/dolby-vision";
                                            }
                                            boolean z19 = ys5Var.f70395Y;
                                            if (ys5Var.f70394X) {
                                                i7 = 2;
                                            } else {
                                                i7 = 0;
                                            }
                                            int i21111112 = (z19 ? 1 : 0) | i7;
                                            lc3Var = new lc3();
                                            zM11398h = ez5.m11398h(str9);
                                            Map map13 = f72045p0;
                                            if (zM11398h) {
                                                lc3Var.f49430F = ys5Var.f70387Q;
                                                lc3Var.f49431G = ys5Var.f70389S;
                                                lc3Var.f49432H = iM22825t;
                                            } else if (ez5.m11401k(str9)) {
                                                if (ys5Var.f70418s == 0) {
                                                    i11 = ys5Var.f70416q;
                                                    i8 = -1;
                                                    if (i11 == -1) {
                                                        i11 = ys5Var.f70413n;
                                                    }
                                                    ys5Var.f70416q = i11;
                                                    i12 = ys5Var.f70417r;
                                                    if (i12 == -1) {
                                                        i12 = ys5Var.f70414o;
                                                    }
                                                    ys5Var.f70417r = i12;
                                                } else {
                                                    i8 = -1;
                                                }
                                                i9 = ys5Var.f70416q;
                                                if (i9 != i8) {
                                                    f = -1.0f;
                                                } else {
                                                    f = -1.0f;
                                                }
                                                if (ys5Var.f70425z) {
                                                    if (ys5Var.f70376F != -1.0f) {
                                                        bArr = null;
                                                    } else {
                                                        bArr = null;
                                                    }
                                                    int i21111113 = ys5Var.f70371A;
                                                    int i21111114 = ys5Var.f70373C;
                                                    int i21111115 = ys5Var.f70372B;
                                                    int i21111116 = ys5Var.f70415p;
                                                    ga1Var = new ga1(i21111113, i21111114, i21111115, bArr, i21111116, i21111116);
                                                } else {
                                                    ga1Var = null;
                                                }
                                                str5 = ys5Var.f70399b;
                                                if (str5 == null) {
                                                    iIntValue = -1;
                                                } else {
                                                    iIntValue = -1;
                                                }
                                                if (ys5Var.f70419t == 0) {
                                                    if (Float.compare(ys5Var.f70422w, 0.0f) == 0) {
                                                        iIntValue = 0;
                                                    } else if (Float.compare(ys5Var.f70422w, 90.0f) == 0) {
                                                        iIntValue = 90;
                                                    } else if (Float.compare(ys5Var.f70422w, -180.0f) != 0) {
                                                        iIntValue = 180;
                                                    } else {
                                                        iIntValue = 180;
                                                    }
                                                }
                                                lc3Var.f49460u = ys5Var.f70413n;
                                                lc3Var.f49461v = ys5Var.f70414o;
                                                lc3Var.f49425A = f;
                                                lc3Var.f49465z = iIntValue;
                                                lc3Var.f49426B = ys5Var.f70423x;
                                                lc3Var.f49427C = ys5Var.f70424y;
                                                lc3Var.f49428D = ga1Var;
                                            } else if (!"application/x-subrip".equals(str9)) {
                                                throw ParserException.m2516a(null, "Unexpected MIME type.");
                                            }
                                            str6 = ys5Var.f70399b;
                                            if (str6 != null) {
                                                lc3Var.f49441b = ys5Var.f70399b;
                                            }
                                            lc3Var.f49440a = Integer.toString(i21);
                                            if (ys5Var.f70397a) {
                                                str7 = "video/webm";
                                            } else {
                                                str7 = "video/x-matroska";
                                            }
                                            lc3Var.f49452m = ez5.m11402l(str7);
                                            lc3Var.f49453n = ez5.m11402l(str9);
                                            lc3Var.f49454o = i6;
                                            lc3Var.f49443d = ys5Var.f70396Z;
                                            lc3Var.f49444e = i21111112;
                                            lc3Var.f49456q = list3;
                                            lc3Var.f49449j = str3;
                                            lc3Var.f49457r = ys5Var.f70412m;
                                            ys5Var.f70400b0 = lc3Var.m16068a();
                                            ys5Var.f70398a0 = zs5Var3.f72091j0.mo2555n(ys5Var.f70403d, ys5Var.f70404e);
                                            sparseArray2.put(ys5Var.f70403d, ys5Var);
                                            break;
                                        case 13:
                                            List listSingletonList2 = Collections.singletonList(ys5Var.m25306a(str8));
                                            byte[] bArr10 = ys5Var.f70411l;
                                            C3354n c3354nM18560f = ox1.m18560f(new so0(bArr10.length, bArr10), false);
                                            ys5Var.f70389S = c3354nM18560f.f52093b;
                                            ys5Var.f70387Q = c3354nM18560f.f52094c;
                                            str9 = "audio/mp4a-latm";
                                            list = listSingletonList2;
                                            str3 = c3354nM18560f.f52092a;
                                            iM22825t = -1;
                                            i6 = -1;
                                            list3 = list;
                                            if (ys5Var.f70386P != null) {
                                                str3 = c3404ocM17906c.f54162b;
                                                str9 = "video/dolby-vision";
                                            }
                                            boolean z110 = ys5Var.f70395Y;
                                            if (ys5Var.f70394X) {
                                                i7 = 2;
                                            } else {
                                                i7 = 0;
                                            }
                                            int i21111117 = (z110 ? 1 : 0) | i7;
                                            lc3Var = new lc3();
                                            zM11398h = ez5.m11398h(str9);
                                            Map map14 = f72045p0;
                                            if (zM11398h) {
                                                lc3Var.f49430F = ys5Var.f70387Q;
                                                lc3Var.f49431G = ys5Var.f70389S;
                                                lc3Var.f49432H = iM22825t;
                                            } else if (ez5.m11401k(str9)) {
                                                if (ys5Var.f70418s == 0) {
                                                    i11 = ys5Var.f70416q;
                                                    i8 = -1;
                                                    if (i11 == -1) {
                                                        i11 = ys5Var.f70413n;
                                                    }
                                                    ys5Var.f70416q = i11;
                                                    i12 = ys5Var.f70417r;
                                                    if (i12 == -1) {
                                                        i12 = ys5Var.f70414o;
                                                    }
                                                    ys5Var.f70417r = i12;
                                                } else {
                                                    i8 = -1;
                                                }
                                                i9 = ys5Var.f70416q;
                                                if (i9 != i8) {
                                                    f = -1.0f;
                                                } else {
                                                    f = -1.0f;
                                                }
                                                if (ys5Var.f70425z) {
                                                    if (ys5Var.f70376F != -1.0f) {
                                                        bArr = null;
                                                    } else {
                                                        bArr = null;
                                                    }
                                                    int i21111118 = ys5Var.f70371A;
                                                    int i21111119 = ys5Var.f70373C;
                                                    int i211111110 = ys5Var.f70372B;
                                                    int i211111111 = ys5Var.f70415p;
                                                    ga1Var = new ga1(i21111118, i21111119, i211111110, bArr, i211111111, i211111111);
                                                } else {
                                                    ga1Var = null;
                                                }
                                                str5 = ys5Var.f70399b;
                                                if (str5 == null) {
                                                    iIntValue = -1;
                                                } else {
                                                    iIntValue = -1;
                                                }
                                                if (ys5Var.f70419t == 0) {
                                                    if (Float.compare(ys5Var.f70422w, 0.0f) == 0) {
                                                        iIntValue = 0;
                                                    } else if (Float.compare(ys5Var.f70422w, 90.0f) == 0) {
                                                        iIntValue = 90;
                                                    } else if (Float.compare(ys5Var.f70422w, -180.0f) != 0) {
                                                        iIntValue = 180;
                                                    } else {
                                                        iIntValue = 180;
                                                    }
                                                }
                                                lc3Var.f49460u = ys5Var.f70413n;
                                                lc3Var.f49461v = ys5Var.f70414o;
                                                lc3Var.f49425A = f;
                                                lc3Var.f49465z = iIntValue;
                                                lc3Var.f49426B = ys5Var.f70423x;
                                                lc3Var.f49427C = ys5Var.f70424y;
                                                lc3Var.f49428D = ga1Var;
                                            } else if (!"application/x-subrip".equals(str9)) {
                                                throw ParserException.m2516a(null, "Unexpected MIME type.");
                                            }
                                            str6 = ys5Var.f70399b;
                                            if (str6 != null) {
                                                lc3Var.f49441b = ys5Var.f70399b;
                                            }
                                            lc3Var.f49440a = Integer.toString(i21);
                                            if (ys5Var.f70397a) {
                                                str7 = "video/webm";
                                            } else {
                                                str7 = "video/x-matroska";
                                            }
                                            lc3Var.f49452m = ez5.m11402l(str7);
                                            lc3Var.f49453n = ez5.m11402l(str9);
                                            lc3Var.f49454o = i6;
                                            lc3Var.f49443d = ys5Var.f70396Z;
                                            lc3Var.f49444e = i21111117;
                                            lc3Var.f49456q = list3;
                                            lc3Var.f49449j = str3;
                                            lc3Var.f49457r = ys5Var.f70412m;
                                            ys5Var.f70400b0 = lc3Var.m16068a();
                                            ys5Var.f70398a0 = zs5Var3.f72091j0.mo2555n(ys5Var.f70403d, ys5Var.f70404e);
                                            sparseArray2.put(ys5Var.f70403d, ys5Var);
                                            break;
                                        case 14:
                                            str9 = "audio/ac3";
                                            iM22825t = -1;
                                            i6 = -1;
                                            str3 = null;
                                            list3 = null;
                                            if (ys5Var.f70386P != null) {
                                                str3 = c3404ocM17906c.f54162b;
                                                str9 = "video/dolby-vision";
                                            }
                                            boolean z111 = ys5Var.f70395Y;
                                            if (ys5Var.f70394X) {
                                                i7 = 2;
                                            } else {
                                                i7 = 0;
                                            }
                                            int i211111112 = (z111 ? 1 : 0) | i7;
                                            lc3Var = new lc3();
                                            zM11398h = ez5.m11398h(str9);
                                            Map map15 = f72045p0;
                                            if (zM11398h) {
                                                lc3Var.f49430F = ys5Var.f70387Q;
                                                lc3Var.f49431G = ys5Var.f70389S;
                                                lc3Var.f49432H = iM22825t;
                                            } else if (ez5.m11401k(str9)) {
                                                if (ys5Var.f70418s == 0) {
                                                    i11 = ys5Var.f70416q;
                                                    i8 = -1;
                                                    if (i11 == -1) {
                                                        i11 = ys5Var.f70413n;
                                                    }
                                                    ys5Var.f70416q = i11;
                                                    i12 = ys5Var.f70417r;
                                                    if (i12 == -1) {
                                                        i12 = ys5Var.f70414o;
                                                    }
                                                    ys5Var.f70417r = i12;
                                                } else {
                                                    i8 = -1;
                                                }
                                                i9 = ys5Var.f70416q;
                                                if (i9 != i8) {
                                                    f = -1.0f;
                                                } else {
                                                    f = -1.0f;
                                                }
                                                if (ys5Var.f70425z) {
                                                    if (ys5Var.f70376F != -1.0f) {
                                                        bArr = null;
                                                    } else {
                                                        bArr = null;
                                                    }
                                                    int i211111113 = ys5Var.f70371A;
                                                    int i211111114 = ys5Var.f70373C;
                                                    int i211111115 = ys5Var.f70372B;
                                                    int i211111116 = ys5Var.f70415p;
                                                    ga1Var = new ga1(i211111113, i211111114, i211111115, bArr, i211111116, i211111116);
                                                } else {
                                                    ga1Var = null;
                                                }
                                                str5 = ys5Var.f70399b;
                                                if (str5 == null) {
                                                    iIntValue = -1;
                                                } else {
                                                    iIntValue = -1;
                                                }
                                                if (ys5Var.f70419t == 0) {
                                                    if (Float.compare(ys5Var.f70422w, 0.0f) == 0) {
                                                        iIntValue = 0;
                                                    } else if (Float.compare(ys5Var.f70422w, 90.0f) == 0) {
                                                        iIntValue = 90;
                                                    } else if (Float.compare(ys5Var.f70422w, -180.0f) != 0) {
                                                        iIntValue = 180;
                                                    } else {
                                                        iIntValue = 180;
                                                    }
                                                }
                                                lc3Var.f49460u = ys5Var.f70413n;
                                                lc3Var.f49461v = ys5Var.f70414o;
                                                lc3Var.f49425A = f;
                                                lc3Var.f49465z = iIntValue;
                                                lc3Var.f49426B = ys5Var.f70423x;
                                                lc3Var.f49427C = ys5Var.f70424y;
                                                lc3Var.f49428D = ga1Var;
                                            } else if (!"application/x-subrip".equals(str9)) {
                                                throw ParserException.m2516a(null, "Unexpected MIME type.");
                                            }
                                            str6 = ys5Var.f70399b;
                                            if (str6 != null) {
                                                lc3Var.f49441b = ys5Var.f70399b;
                                            }
                                            lc3Var.f49440a = Integer.toString(i21);
                                            if (ys5Var.f70397a) {
                                                str7 = "video/webm";
                                            } else {
                                                str7 = "video/x-matroska";
                                            }
                                            lc3Var.f49452m = ez5.m11402l(str7);
                                            lc3Var.f49453n = ez5.m11402l(str9);
                                            lc3Var.f49454o = i6;
                                            lc3Var.f49443d = ys5Var.f70396Z;
                                            lc3Var.f49444e = i211111112;
                                            lc3Var.f49456q = list3;
                                            lc3Var.f49449j = str3;
                                            lc3Var.f49457r = ys5Var.f70412m;
                                            ys5Var.f70400b0 = lc3Var.m16068a();
                                            ys5Var.f70398a0 = zs5Var3.f72091j0.mo2555n(ys5Var.f70403d, ys5Var.f70404e);
                                            sparseArray2.put(ys5Var.f70403d, ys5Var);
                                            break;
                                        case 15:
                                        case 21:
                                            ys5Var.f70393W = true;
                                            str9 = "audio/vnd.dts";
                                            iM22825t = -1;
                                            i6 = -1;
                                            str3 = null;
                                            list3 = null;
                                            if (ys5Var.f70386P != null) {
                                                str3 = c3404ocM17906c.f54162b;
                                                str9 = "video/dolby-vision";
                                            }
                                            boolean z112 = ys5Var.f70395Y;
                                            if (ys5Var.f70394X) {
                                                i7 = 2;
                                            } else {
                                                i7 = 0;
                                            }
                                            int i211111117 = (z112 ? 1 : 0) | i7;
                                            lc3Var = new lc3();
                                            zM11398h = ez5.m11398h(str9);
                                            Map map16 = f72045p0;
                                            if (zM11398h) {
                                                lc3Var.f49430F = ys5Var.f70387Q;
                                                lc3Var.f49431G = ys5Var.f70389S;
                                                lc3Var.f49432H = iM22825t;
                                            } else if (ez5.m11401k(str9)) {
                                                if (ys5Var.f70418s == 0) {
                                                    i11 = ys5Var.f70416q;
                                                    i8 = -1;
                                                    if (i11 == -1) {
                                                        i11 = ys5Var.f70413n;
                                                    }
                                                    ys5Var.f70416q = i11;
                                                    i12 = ys5Var.f70417r;
                                                    if (i12 == -1) {
                                                        i12 = ys5Var.f70414o;
                                                    }
                                                    ys5Var.f70417r = i12;
                                                } else {
                                                    i8 = -1;
                                                }
                                                i9 = ys5Var.f70416q;
                                                if (i9 != i8) {
                                                    f = -1.0f;
                                                } else {
                                                    f = -1.0f;
                                                }
                                                if (ys5Var.f70425z) {
                                                    if (ys5Var.f70376F != -1.0f) {
                                                        bArr = null;
                                                    } else {
                                                        bArr = null;
                                                    }
                                                    int i211111118 = ys5Var.f70371A;
                                                    int i211111119 = ys5Var.f70373C;
                                                    int i2111111110 = ys5Var.f70372B;
                                                    int i2111111111 = ys5Var.f70415p;
                                                    ga1Var = new ga1(i211111118, i211111119, i2111111110, bArr, i2111111111, i2111111111);
                                                } else {
                                                    ga1Var = null;
                                                }
                                                str5 = ys5Var.f70399b;
                                                if (str5 == null) {
                                                    iIntValue = -1;
                                                } else {
                                                    iIntValue = -1;
                                                }
                                                if (ys5Var.f70419t == 0) {
                                                    if (Float.compare(ys5Var.f70422w, 0.0f) == 0) {
                                                        iIntValue = 0;
                                                    } else if (Float.compare(ys5Var.f70422w, 90.0f) == 0) {
                                                        iIntValue = 90;
                                                    } else if (Float.compare(ys5Var.f70422w, -180.0f) != 0) {
                                                        iIntValue = 180;
                                                    } else {
                                                        iIntValue = 180;
                                                    }
                                                }
                                                lc3Var.f49460u = ys5Var.f70413n;
                                                lc3Var.f49461v = ys5Var.f70414o;
                                                lc3Var.f49425A = f;
                                                lc3Var.f49465z = iIntValue;
                                                lc3Var.f49426B = ys5Var.f70423x;
                                                lc3Var.f49427C = ys5Var.f70424y;
                                                lc3Var.f49428D = ga1Var;
                                            } else if (!"application/x-subrip".equals(str9)) {
                                                throw ParserException.m2516a(null, "Unexpected MIME type.");
                                            }
                                            str6 = ys5Var.f70399b;
                                            if (str6 != null) {
                                                lc3Var.f49441b = ys5Var.f70399b;
                                            }
                                            lc3Var.f49440a = Integer.toString(i21);
                                            if (ys5Var.f70397a) {
                                                str7 = "video/webm";
                                            } else {
                                                str7 = "video/x-matroska";
                                            }
                                            lc3Var.f49452m = ez5.m11402l(str7);
                                            lc3Var.f49453n = ez5.m11402l(str9);
                                            lc3Var.f49454o = i6;
                                            lc3Var.f49443d = ys5Var.f70396Z;
                                            lc3Var.f49444e = i211111117;
                                            lc3Var.f49456q = list3;
                                            lc3Var.f49449j = str3;
                                            lc3Var.f49457r = ys5Var.f70412m;
                                            ys5Var.f70400b0 = lc3Var.m16068a();
                                            ys5Var.f70398a0 = zs5Var3.f72091j0.mo2555n(ys5Var.f70403d, ys5Var.f70404e);
                                            sparseArray2.put(ys5Var.f70403d, ys5Var);
                                            break;
                                        case 16:
                                            byte[] bArr11 = ys5Var.f70411l;
                                            listSingletonList = bArr11 == null ? null : ImmutableList.m6291y(bArr11);
                                            str9 = "video/av01";
                                            listM6291y = listSingletonList;
                                            iM22825t = -1;
                                            i6 = -1;
                                            list4 = listM6291y;
                                            str3 = null;
                                            list3 = list4;
                                            if (ys5Var.f70386P != null) {
                                                str3 = c3404ocM17906c.f54162b;
                                                str9 = "video/dolby-vision";
                                            }
                                            boolean z113 = ys5Var.f70395Y;
                                            if (ys5Var.f70394X) {
                                                i7 = 2;
                                            } else {
                                                i7 = 0;
                                            }
                                            int i2111111112 = (z113 ? 1 : 0) | i7;
                                            lc3Var = new lc3();
                                            zM11398h = ez5.m11398h(str9);
                                            Map map17 = f72045p0;
                                            if (zM11398h) {
                                                lc3Var.f49430F = ys5Var.f70387Q;
                                                lc3Var.f49431G = ys5Var.f70389S;
                                                lc3Var.f49432H = iM22825t;
                                            } else if (ez5.m11401k(str9)) {
                                                if (ys5Var.f70418s == 0) {
                                                    i11 = ys5Var.f70416q;
                                                    i8 = -1;
                                                    if (i11 == -1) {
                                                        i11 = ys5Var.f70413n;
                                                    }
                                                    ys5Var.f70416q = i11;
                                                    i12 = ys5Var.f70417r;
                                                    if (i12 == -1) {
                                                        i12 = ys5Var.f70414o;
                                                    }
                                                    ys5Var.f70417r = i12;
                                                } else {
                                                    i8 = -1;
                                                }
                                                i9 = ys5Var.f70416q;
                                                if (i9 != i8) {
                                                    f = -1.0f;
                                                } else {
                                                    f = -1.0f;
                                                }
                                                if (ys5Var.f70425z) {
                                                    if (ys5Var.f70376F != -1.0f) {
                                                        bArr = null;
                                                    } else {
                                                        bArr = null;
                                                    }
                                                    int i2111111113 = ys5Var.f70371A;
                                                    int i2111111114 = ys5Var.f70373C;
                                                    int i2111111115 = ys5Var.f70372B;
                                                    int i2111111116 = ys5Var.f70415p;
                                                    ga1Var = new ga1(i2111111113, i2111111114, i2111111115, bArr, i2111111116, i2111111116);
                                                } else {
                                                    ga1Var = null;
                                                }
                                                str5 = ys5Var.f70399b;
                                                if (str5 == null) {
                                                    iIntValue = -1;
                                                } else {
                                                    iIntValue = -1;
                                                }
                                                if (ys5Var.f70419t == 0) {
                                                    if (Float.compare(ys5Var.f70422w, 0.0f) == 0) {
                                                        iIntValue = 0;
                                                    } else if (Float.compare(ys5Var.f70422w, 90.0f) == 0) {
                                                        iIntValue = 90;
                                                    } else if (Float.compare(ys5Var.f70422w, -180.0f) != 0) {
                                                        iIntValue = 180;
                                                    } else {
                                                        iIntValue = 180;
                                                    }
                                                }
                                                lc3Var.f49460u = ys5Var.f70413n;
                                                lc3Var.f49461v = ys5Var.f70414o;
                                                lc3Var.f49425A = f;
                                                lc3Var.f49465z = iIntValue;
                                                lc3Var.f49426B = ys5Var.f70423x;
                                                lc3Var.f49427C = ys5Var.f70424y;
                                                lc3Var.f49428D = ga1Var;
                                            } else if (!"application/x-subrip".equals(str9)) {
                                                throw ParserException.m2516a(null, "Unexpected MIME type.");
                                            }
                                            str6 = ys5Var.f70399b;
                                            if (str6 != null) {
                                                lc3Var.f49441b = ys5Var.f70399b;
                                            }
                                            lc3Var.f49440a = Integer.toString(i21);
                                            if (ys5Var.f70397a) {
                                                str7 = "video/webm";
                                            } else {
                                                str7 = "video/x-matroska";
                                            }
                                            lc3Var.f49452m = ez5.m11402l(str7);
                                            lc3Var.f49453n = ez5.m11402l(str9);
                                            lc3Var.f49454o = i6;
                                            lc3Var.f49443d = ys5Var.f70396Z;
                                            lc3Var.f49444e = i2111111112;
                                            lc3Var.f49456q = list3;
                                            lc3Var.f49449j = str3;
                                            lc3Var.f49457r = ys5Var.f70412m;
                                            ys5Var.f70400b0 = lc3Var.m16068a();
                                            ys5Var.f70398a0 = zs5Var3.f72091j0.mo2555n(ys5Var.f70403d, ys5Var.f70404e);
                                            sparseArray2.put(ys5Var.f70403d, ys5Var);
                                            break;
                                        case 17:
                                            str9 = "video/x-vnd.on2.vp8";
                                            iM22825t = -1;
                                            i6 = -1;
                                            str3 = null;
                                            list3 = null;
                                            if (ys5Var.f70386P != null) {
                                                str3 = c3404ocM17906c.f54162b;
                                                str9 = "video/dolby-vision";
                                            }
                                            boolean z114 = ys5Var.f70395Y;
                                            if (ys5Var.f70394X) {
                                                i7 = 2;
                                            } else {
                                                i7 = 0;
                                            }
                                            int i2111111117 = (z114 ? 1 : 0) | i7;
                                            lc3Var = new lc3();
                                            zM11398h = ez5.m11398h(str9);
                                            Map map18 = f72045p0;
                                            if (zM11398h) {
                                                lc3Var.f49430F = ys5Var.f70387Q;
                                                lc3Var.f49431G = ys5Var.f70389S;
                                                lc3Var.f49432H = iM22825t;
                                            } else if (ez5.m11401k(str9)) {
                                                if (ys5Var.f70418s == 0) {
                                                    i11 = ys5Var.f70416q;
                                                    i8 = -1;
                                                    if (i11 == -1) {
                                                        i11 = ys5Var.f70413n;
                                                    }
                                                    ys5Var.f70416q = i11;
                                                    i12 = ys5Var.f70417r;
                                                    if (i12 == -1) {
                                                        i12 = ys5Var.f70414o;
                                                    }
                                                    ys5Var.f70417r = i12;
                                                } else {
                                                    i8 = -1;
                                                }
                                                i9 = ys5Var.f70416q;
                                                if (i9 != i8) {
                                                    f = -1.0f;
                                                } else {
                                                    f = -1.0f;
                                                }
                                                if (ys5Var.f70425z) {
                                                    if (ys5Var.f70376F != -1.0f) {
                                                        bArr = null;
                                                    } else {
                                                        bArr = null;
                                                    }
                                                    int i2111111118 = ys5Var.f70371A;
                                                    int i2111111119 = ys5Var.f70373C;
                                                    int i21111111110 = ys5Var.f70372B;
                                                    int i21111111111 = ys5Var.f70415p;
                                                    ga1Var = new ga1(i2111111118, i2111111119, i21111111110, bArr, i21111111111, i21111111111);
                                                } else {
                                                    ga1Var = null;
                                                }
                                                str5 = ys5Var.f70399b;
                                                if (str5 == null) {
                                                    iIntValue = -1;
                                                } else {
                                                    iIntValue = -1;
                                                }
                                                if (ys5Var.f70419t == 0) {
                                                    if (Float.compare(ys5Var.f70422w, 0.0f) == 0) {
                                                        iIntValue = 0;
                                                    } else if (Float.compare(ys5Var.f70422w, 90.0f) == 0) {
                                                        iIntValue = 90;
                                                    } else if (Float.compare(ys5Var.f70422w, -180.0f) != 0) {
                                                        iIntValue = 180;
                                                    } else {
                                                        iIntValue = 180;
                                                    }
                                                }
                                                lc3Var.f49460u = ys5Var.f70413n;
                                                lc3Var.f49461v = ys5Var.f70414o;
                                                lc3Var.f49425A = f;
                                                lc3Var.f49465z = iIntValue;
                                                lc3Var.f49426B = ys5Var.f70423x;
                                                lc3Var.f49427C = ys5Var.f70424y;
                                                lc3Var.f49428D = ga1Var;
                                            } else if (!"application/x-subrip".equals(str9)) {
                                                throw ParserException.m2516a(null, "Unexpected MIME type.");
                                            }
                                            str6 = ys5Var.f70399b;
                                            if (str6 != null) {
                                                lc3Var.f49441b = ys5Var.f70399b;
                                            }
                                            lc3Var.f49440a = Integer.toString(i21);
                                            if (ys5Var.f70397a) {
                                                str7 = "video/webm";
                                            } else {
                                                str7 = "video/x-matroska";
                                            }
                                            lc3Var.f49452m = ez5.m11402l(str7);
                                            lc3Var.f49453n = ez5.m11402l(str9);
                                            lc3Var.f49454o = i6;
                                            lc3Var.f49443d = ys5Var.f70396Z;
                                            lc3Var.f49444e = i2111111117;
                                            lc3Var.f49456q = list3;
                                            lc3Var.f49449j = str3;
                                            lc3Var.f49457r = ys5Var.f70412m;
                                            ys5Var.f70400b0 = lc3Var.m16068a();
                                            ys5Var.f70398a0 = zs5Var3.f72091j0.mo2555n(ys5Var.f70403d, ys5Var.f70404e);
                                            sparseArray2.put(ys5Var.f70403d, ys5Var);
                                            break;
                                        case 18:
                                            byte[] bArr12 = ys5Var.f70411l;
                                            listSingletonList = bArr12 == null ? null : ImmutableList.m6291y(bArr12);
                                            str9 = "video/x-vnd.on2.vp9";
                                            listM6291y = listSingletonList;
                                            iM22825t = -1;
                                            i6 = -1;
                                            list4 = listM6291y;
                                            str3 = null;
                                            list3 = list4;
                                            if (ys5Var.f70386P != null) {
                                                str3 = c3404ocM17906c.f54162b;
                                                str9 = "video/dolby-vision";
                                            }
                                            boolean z115 = ys5Var.f70395Y;
                                            if (ys5Var.f70394X) {
                                                i7 = 2;
                                            } else {
                                                i7 = 0;
                                            }
                                            int i21111111112 = (z115 ? 1 : 0) | i7;
                                            lc3Var = new lc3();
                                            zM11398h = ez5.m11398h(str9);
                                            Map map19 = f72045p0;
                                            if (zM11398h) {
                                                lc3Var.f49430F = ys5Var.f70387Q;
                                                lc3Var.f49431G = ys5Var.f70389S;
                                                lc3Var.f49432H = iM22825t;
                                            } else if (ez5.m11401k(str9)) {
                                                if (ys5Var.f70418s == 0) {
                                                    i11 = ys5Var.f70416q;
                                                    i8 = -1;
                                                    if (i11 == -1) {
                                                        i11 = ys5Var.f70413n;
                                                    }
                                                    ys5Var.f70416q = i11;
                                                    i12 = ys5Var.f70417r;
                                                    if (i12 == -1) {
                                                        i12 = ys5Var.f70414o;
                                                    }
                                                    ys5Var.f70417r = i12;
                                                } else {
                                                    i8 = -1;
                                                }
                                                i9 = ys5Var.f70416q;
                                                if (i9 != i8) {
                                                    f = -1.0f;
                                                } else {
                                                    f = -1.0f;
                                                }
                                                if (ys5Var.f70425z) {
                                                    if (ys5Var.f70376F != -1.0f) {
                                                        bArr = null;
                                                    } else {
                                                        bArr = null;
                                                    }
                                                    int i21111111113 = ys5Var.f70371A;
                                                    int i21111111114 = ys5Var.f70373C;
                                                    int i21111111115 = ys5Var.f70372B;
                                                    int i21111111116 = ys5Var.f70415p;
                                                    ga1Var = new ga1(i21111111113, i21111111114, i21111111115, bArr, i21111111116, i21111111116);
                                                } else {
                                                    ga1Var = null;
                                                }
                                                str5 = ys5Var.f70399b;
                                                if (str5 == null) {
                                                    iIntValue = -1;
                                                } else {
                                                    iIntValue = -1;
                                                }
                                                if (ys5Var.f70419t == 0) {
                                                    if (Float.compare(ys5Var.f70422w, 0.0f) == 0) {
                                                        iIntValue = 0;
                                                    } else if (Float.compare(ys5Var.f70422w, 90.0f) == 0) {
                                                        iIntValue = 90;
                                                    } else if (Float.compare(ys5Var.f70422w, -180.0f) != 0) {
                                                        iIntValue = 180;
                                                    } else {
                                                        iIntValue = 180;
                                                    }
                                                }
                                                lc3Var.f49460u = ys5Var.f70413n;
                                                lc3Var.f49461v = ys5Var.f70414o;
                                                lc3Var.f49425A = f;
                                                lc3Var.f49465z = iIntValue;
                                                lc3Var.f49426B = ys5Var.f70423x;
                                                lc3Var.f49427C = ys5Var.f70424y;
                                                lc3Var.f49428D = ga1Var;
                                            } else if (!"application/x-subrip".equals(str9)) {
                                                throw ParserException.m2516a(null, "Unexpected MIME type.");
                                            }
                                            str6 = ys5Var.f70399b;
                                            if (str6 != null) {
                                                lc3Var.f49441b = ys5Var.f70399b;
                                            }
                                            lc3Var.f49440a = Integer.toString(i21);
                                            if (ys5Var.f70397a) {
                                                str7 = "video/webm";
                                            } else {
                                                str7 = "video/x-matroska";
                                            }
                                            lc3Var.f49452m = ez5.m11402l(str7);
                                            lc3Var.f49453n = ez5.m11402l(str9);
                                            lc3Var.f49454o = i6;
                                            lc3Var.f49443d = ys5Var.f70396Z;
                                            lc3Var.f49444e = i21111111112;
                                            lc3Var.f49456q = list3;
                                            lc3Var.f49449j = str3;
                                            lc3Var.f49457r = ys5Var.f70412m;
                                            ys5Var.f70400b0 = lc3Var.m16068a();
                                            ys5Var.f70398a0 = zs5Var3.f72091j0.mo2555n(ys5Var.f70403d, ys5Var.f70404e);
                                            sparseArray2.put(ys5Var.f70403d, ys5Var);
                                            break;
                                        case 19:
                                            str9 = "application/pgs";
                                            iM22825t = -1;
                                            i6 = -1;
                                            str3 = null;
                                            list3 = null;
                                            if (ys5Var.f70386P != null) {
                                                str3 = c3404ocM17906c.f54162b;
                                                str9 = "video/dolby-vision";
                                            }
                                            boolean z116 = ys5Var.f70395Y;
                                            if (ys5Var.f70394X) {
                                                i7 = 2;
                                            } else {
                                                i7 = 0;
                                            }
                                            int i21111111117 = (z116 ? 1 : 0) | i7;
                                            lc3Var = new lc3();
                                            zM11398h = ez5.m11398h(str9);
                                            Map map110 = f72045p0;
                                            if (zM11398h) {
                                                lc3Var.f49430F = ys5Var.f70387Q;
                                                lc3Var.f49431G = ys5Var.f70389S;
                                                lc3Var.f49432H = iM22825t;
                                            } else if (ez5.m11401k(str9)) {
                                                if (ys5Var.f70418s == 0) {
                                                    i11 = ys5Var.f70416q;
                                                    i8 = -1;
                                                    if (i11 == -1) {
                                                        i11 = ys5Var.f70413n;
                                                    }
                                                    ys5Var.f70416q = i11;
                                                    i12 = ys5Var.f70417r;
                                                    if (i12 == -1) {
                                                        i12 = ys5Var.f70414o;
                                                    }
                                                    ys5Var.f70417r = i12;
                                                } else {
                                                    i8 = -1;
                                                }
                                                i9 = ys5Var.f70416q;
                                                if (i9 != i8) {
                                                    f = -1.0f;
                                                } else {
                                                    f = -1.0f;
                                                }
                                                if (ys5Var.f70425z) {
                                                    if (ys5Var.f70376F != -1.0f) {
                                                        bArr = null;
                                                    } else {
                                                        bArr = null;
                                                    }
                                                    int i21111111118 = ys5Var.f70371A;
                                                    int i21111111119 = ys5Var.f70373C;
                                                    int i211111111110 = ys5Var.f70372B;
                                                    int i211111111111 = ys5Var.f70415p;
                                                    ga1Var = new ga1(i21111111118, i21111111119, i211111111110, bArr, i211111111111, i211111111111);
                                                } else {
                                                    ga1Var = null;
                                                }
                                                str5 = ys5Var.f70399b;
                                                if (str5 == null) {
                                                    iIntValue = -1;
                                                } else {
                                                    iIntValue = -1;
                                                }
                                                if (ys5Var.f70419t == 0) {
                                                    if (Float.compare(ys5Var.f70422w, 0.0f) == 0) {
                                                        iIntValue = 0;
                                                    } else if (Float.compare(ys5Var.f70422w, 90.0f) == 0) {
                                                        iIntValue = 90;
                                                    } else if (Float.compare(ys5Var.f70422w, -180.0f) != 0) {
                                                        iIntValue = 180;
                                                    } else {
                                                        iIntValue = 180;
                                                    }
                                                }
                                                lc3Var.f49460u = ys5Var.f70413n;
                                                lc3Var.f49461v = ys5Var.f70414o;
                                                lc3Var.f49425A = f;
                                                lc3Var.f49465z = iIntValue;
                                                lc3Var.f49426B = ys5Var.f70423x;
                                                lc3Var.f49427C = ys5Var.f70424y;
                                                lc3Var.f49428D = ga1Var;
                                            } else if (!"application/x-subrip".equals(str9)) {
                                                throw ParserException.m2516a(null, "Unexpected MIME type.");
                                            }
                                            str6 = ys5Var.f70399b;
                                            if (str6 != null) {
                                                lc3Var.f49441b = ys5Var.f70399b;
                                            }
                                            lc3Var.f49440a = Integer.toString(i21);
                                            if (ys5Var.f70397a) {
                                                str7 = "video/webm";
                                            } else {
                                                str7 = "video/x-matroska";
                                            }
                                            lc3Var.f49452m = ez5.m11402l(str7);
                                            lc3Var.f49453n = ez5.m11402l(str9);
                                            lc3Var.f49454o = i6;
                                            lc3Var.f49443d = ys5Var.f70396Z;
                                            lc3Var.f49444e = i21111111117;
                                            lc3Var.f49456q = list3;
                                            lc3Var.f49449j = str3;
                                            lc3Var.f49457r = ys5Var.f70412m;
                                            ys5Var.f70400b0 = lc3Var.m16068a();
                                            ys5Var.f70398a0 = zs5Var3.f72091j0.mo2555n(ys5Var.f70403d, ys5Var.f70404e);
                                            sparseArray2.put(ys5Var.f70403d, ys5Var);
                                            break;
                                        case 20:
                                            iM22825t = -1;
                                            i6 = -1;
                                            str3 = null;
                                            list3 = null;
                                            if (ys5Var.f70386P != null) {
                                                str3 = c3404ocM17906c.f54162b;
                                                str9 = "video/dolby-vision";
                                            }
                                            boolean z117 = ys5Var.f70395Y;
                                            if (ys5Var.f70394X) {
                                                i7 = 2;
                                            } else {
                                                i7 = 0;
                                            }
                                            int i211111111112 = (z117 ? 1 : 0) | i7;
                                            lc3Var = new lc3();
                                            zM11398h = ez5.m11398h(str9);
                                            Map map111 = f72045p0;
                                            if (zM11398h) {
                                                lc3Var.f49430F = ys5Var.f70387Q;
                                                lc3Var.f49431G = ys5Var.f70389S;
                                                lc3Var.f49432H = iM22825t;
                                            } else if (ez5.m11401k(str9)) {
                                                if (ys5Var.f70418s == 0) {
                                                    i11 = ys5Var.f70416q;
                                                    i8 = -1;
                                                    if (i11 == -1) {
                                                        i11 = ys5Var.f70413n;
                                                    }
                                                    ys5Var.f70416q = i11;
                                                    i12 = ys5Var.f70417r;
                                                    if (i12 == -1) {
                                                        i12 = ys5Var.f70414o;
                                                    }
                                                    ys5Var.f70417r = i12;
                                                } else {
                                                    i8 = -1;
                                                }
                                                i9 = ys5Var.f70416q;
                                                if (i9 != i8) {
                                                    f = -1.0f;
                                                } else {
                                                    f = -1.0f;
                                                }
                                                if (ys5Var.f70425z) {
                                                    if (ys5Var.f70376F != -1.0f) {
                                                        bArr = null;
                                                    } else {
                                                        bArr = null;
                                                    }
                                                    int i211111111113 = ys5Var.f70371A;
                                                    int i211111111114 = ys5Var.f70373C;
                                                    int i211111111115 = ys5Var.f70372B;
                                                    int i211111111116 = ys5Var.f70415p;
                                                    ga1Var = new ga1(i211111111113, i211111111114, i211111111115, bArr, i211111111116, i211111111116);
                                                } else {
                                                    ga1Var = null;
                                                }
                                                str5 = ys5Var.f70399b;
                                                if (str5 == null) {
                                                    iIntValue = -1;
                                                } else {
                                                    iIntValue = -1;
                                                }
                                                if (ys5Var.f70419t == 0) {
                                                    if (Float.compare(ys5Var.f70422w, 0.0f) == 0) {
                                                        iIntValue = 0;
                                                    } else if (Float.compare(ys5Var.f70422w, 90.0f) == 0) {
                                                        iIntValue = 90;
                                                    } else if (Float.compare(ys5Var.f70422w, -180.0f) != 0) {
                                                        iIntValue = 180;
                                                    } else {
                                                        iIntValue = 180;
                                                    }
                                                }
                                                lc3Var.f49460u = ys5Var.f70413n;
                                                lc3Var.f49461v = ys5Var.f70414o;
                                                lc3Var.f49425A = f;
                                                lc3Var.f49465z = iIntValue;
                                                lc3Var.f49426B = ys5Var.f70423x;
                                                lc3Var.f49427C = ys5Var.f70424y;
                                                lc3Var.f49428D = ga1Var;
                                            } else if (!"application/x-subrip".equals(str9)) {
                                                throw ParserException.m2516a(null, "Unexpected MIME type.");
                                            }
                                            str6 = ys5Var.f70399b;
                                            if (str6 != null) {
                                                lc3Var.f49441b = ys5Var.f70399b;
                                            }
                                            lc3Var.f49440a = Integer.toString(i21);
                                            if (ys5Var.f70397a) {
                                                str7 = "video/webm";
                                            } else {
                                                str7 = "video/x-matroska";
                                            }
                                            lc3Var.f49452m = ez5.m11402l(str7);
                                            lc3Var.f49453n = ez5.m11402l(str9);
                                            lc3Var.f49454o = i6;
                                            lc3Var.f49443d = ys5Var.f70396Z;
                                            lc3Var.f49444e = i211111111112;
                                            lc3Var.f49456q = list3;
                                            lc3Var.f49449j = str3;
                                            lc3Var.f49457r = ys5Var.f70412m;
                                            ys5Var.f70400b0 = lc3Var.m16068a();
                                            ys5Var.f70398a0 = zs5Var3.f72091j0.mo2555n(ys5Var.f70403d, ys5Var.f70404e);
                                            sparseArray2.put(ys5Var.f70403d, ys5Var);
                                            break;
                                        case 22:
                                            if (ys5Var.f70388R == 32) {
                                                str9 = "audio/raw";
                                                iM22825t = 4;
                                            } else {
                                                ss5.m21707d0("MatroskaExtractor", "Unsupported floating point PCM bit depth: " + ys5Var.f70388R + ". Setting mimeType to audio/x-unknown");
                                                str9 = "audio/x-unknown";
                                                iM22825t = -1;
                                            }
                                            i6 = -1;
                                            str3 = null;
                                            list3 = null;
                                            if (ys5Var.f70386P != null) {
                                                str3 = c3404ocM17906c.f54162b;
                                                str9 = "video/dolby-vision";
                                            }
                                            boolean z118 = ys5Var.f70395Y;
                                            if (ys5Var.f70394X) {
                                                i7 = 2;
                                            } else {
                                                i7 = 0;
                                            }
                                            int i211111111117 = (z118 ? 1 : 0) | i7;
                                            lc3Var = new lc3();
                                            zM11398h = ez5.m11398h(str9);
                                            Map map112 = f72045p0;
                                            if (zM11398h) {
                                                lc3Var.f49430F = ys5Var.f70387Q;
                                                lc3Var.f49431G = ys5Var.f70389S;
                                                lc3Var.f49432H = iM22825t;
                                            } else if (ez5.m11401k(str9)) {
                                                if (ys5Var.f70418s == 0) {
                                                    i11 = ys5Var.f70416q;
                                                    i8 = -1;
                                                    if (i11 == -1) {
                                                        i11 = ys5Var.f70413n;
                                                    }
                                                    ys5Var.f70416q = i11;
                                                    i12 = ys5Var.f70417r;
                                                    if (i12 == -1) {
                                                        i12 = ys5Var.f70414o;
                                                    }
                                                    ys5Var.f70417r = i12;
                                                } else {
                                                    i8 = -1;
                                                }
                                                i9 = ys5Var.f70416q;
                                                if (i9 != i8) {
                                                    f = -1.0f;
                                                } else {
                                                    f = -1.0f;
                                                }
                                                if (ys5Var.f70425z) {
                                                    if (ys5Var.f70376F != -1.0f) {
                                                        bArr = null;
                                                    } else {
                                                        bArr = null;
                                                    }
                                                    int i211111111118 = ys5Var.f70371A;
                                                    int i211111111119 = ys5Var.f70373C;
                                                    int i2111111111110 = ys5Var.f70372B;
                                                    int i2111111111111 = ys5Var.f70415p;
                                                    ga1Var = new ga1(i211111111118, i211111111119, i2111111111110, bArr, i2111111111111, i2111111111111);
                                                } else {
                                                    ga1Var = null;
                                                }
                                                str5 = ys5Var.f70399b;
                                                if (str5 == null) {
                                                    iIntValue = -1;
                                                } else {
                                                    iIntValue = -1;
                                                }
                                                if (ys5Var.f70419t == 0) {
                                                    if (Float.compare(ys5Var.f70422w, 0.0f) == 0) {
                                                        iIntValue = 0;
                                                    } else if (Float.compare(ys5Var.f70422w, 90.0f) == 0) {
                                                        iIntValue = 90;
                                                    } else if (Float.compare(ys5Var.f70422w, -180.0f) != 0) {
                                                        iIntValue = 180;
                                                    } else {
                                                        iIntValue = 180;
                                                    }
                                                }
                                                lc3Var.f49460u = ys5Var.f70413n;
                                                lc3Var.f49461v = ys5Var.f70414o;
                                                lc3Var.f49425A = f;
                                                lc3Var.f49465z = iIntValue;
                                                lc3Var.f49426B = ys5Var.f70423x;
                                                lc3Var.f49427C = ys5Var.f70424y;
                                                lc3Var.f49428D = ga1Var;
                                            } else if (!"application/x-subrip".equals(str9)) {
                                                throw ParserException.m2516a(null, "Unexpected MIME type.");
                                            }
                                            str6 = ys5Var.f70399b;
                                            if (str6 != null) {
                                                lc3Var.f49441b = ys5Var.f70399b;
                                            }
                                            lc3Var.f49440a = Integer.toString(i21);
                                            if (ys5Var.f70397a) {
                                                str7 = "video/webm";
                                            } else {
                                                str7 = "video/x-matroska";
                                            }
                                            lc3Var.f49452m = ez5.m11402l(str7);
                                            lc3Var.f49453n = ez5.m11402l(str9);
                                            lc3Var.f49454o = i6;
                                            lc3Var.f49443d = ys5Var.f70396Z;
                                            lc3Var.f49444e = i211111111117;
                                            lc3Var.f49456q = list3;
                                            lc3Var.f49449j = str3;
                                            lc3Var.f49457r = ys5Var.f70412m;
                                            ys5Var.f70400b0 = lc3Var.m16068a();
                                            ys5Var.f70398a0 = zs5Var3.f72091j0.mo2555n(ys5Var.f70403d, ys5Var.f70404e);
                                            sparseArray2.put(ys5Var.f70403d, ys5Var);
                                            break;
                                        case DescriptorProtos.FileOptions.DEPRECATED_FIELD_NUMBER /* 23 */:
                                            int i43 = ys5Var.f70388R;
                                            if (i43 == 8) {
                                                str9 = "audio/raw";
                                                iM22825t = 3;
                                            } else {
                                                if (i43 == 16) {
                                                    iM22825t = 268435456;
                                                } else if (i43 == 24) {
                                                    iM22825t = 1342177280;
                                                } else if (i43 == 32) {
                                                    iM22825t = 1610612736;
                                                } else {
                                                    ss5.m21707d0("MatroskaExtractor", "Unsupported big endian PCM bit depth: " + ys5Var.f70388R + ". Setting mimeType to audio/x-unknown");
                                                    str9 = "audio/x-unknown";
                                                    iM22825t = -1;
                                                }
                                                str9 = "audio/raw";
                                            }
                                            i6 = -1;
                                            str3 = null;
                                            list3 = null;
                                            if (ys5Var.f70386P != null) {
                                                str3 = c3404ocM17906c.f54162b;
                                                str9 = "video/dolby-vision";
                                            }
                                            boolean z119 = ys5Var.f70395Y;
                                            if (ys5Var.f70394X) {
                                                i7 = 2;
                                            } else {
                                                i7 = 0;
                                            }
                                            int i2111111111112 = (z119 ? 1 : 0) | i7;
                                            lc3Var = new lc3();
                                            zM11398h = ez5.m11398h(str9);
                                            Map map113 = f72045p0;
                                            if (zM11398h) {
                                                lc3Var.f49430F = ys5Var.f70387Q;
                                                lc3Var.f49431G = ys5Var.f70389S;
                                                lc3Var.f49432H = iM22825t;
                                            } else if (ez5.m11401k(str9)) {
                                                if (ys5Var.f70418s == 0) {
                                                    i11 = ys5Var.f70416q;
                                                    i8 = -1;
                                                    if (i11 == -1) {
                                                        i11 = ys5Var.f70413n;
                                                    }
                                                    ys5Var.f70416q = i11;
                                                    i12 = ys5Var.f70417r;
                                                    if (i12 == -1) {
                                                        i12 = ys5Var.f70414o;
                                                    }
                                                    ys5Var.f70417r = i12;
                                                } else {
                                                    i8 = -1;
                                                }
                                                i9 = ys5Var.f70416q;
                                                if (i9 != i8) {
                                                    f = -1.0f;
                                                } else {
                                                    f = -1.0f;
                                                }
                                                if (ys5Var.f70425z) {
                                                    if (ys5Var.f70376F != -1.0f) {
                                                        bArr = null;
                                                    } else {
                                                        bArr = null;
                                                    }
                                                    int i2111111111113 = ys5Var.f70371A;
                                                    int i2111111111114 = ys5Var.f70373C;
                                                    int i2111111111115 = ys5Var.f70372B;
                                                    int i2111111111116 = ys5Var.f70415p;
                                                    ga1Var = new ga1(i2111111111113, i2111111111114, i2111111111115, bArr, i2111111111116, i2111111111116);
                                                } else {
                                                    ga1Var = null;
                                                }
                                                str5 = ys5Var.f70399b;
                                                if (str5 == null) {
                                                    iIntValue = -1;
                                                } else {
                                                    iIntValue = -1;
                                                }
                                                if (ys5Var.f70419t == 0) {
                                                    if (Float.compare(ys5Var.f70422w, 0.0f) == 0) {
                                                        iIntValue = 0;
                                                    } else if (Float.compare(ys5Var.f70422w, 90.0f) == 0) {
                                                        iIntValue = 90;
                                                    } else if (Float.compare(ys5Var.f70422w, -180.0f) != 0) {
                                                        iIntValue = 180;
                                                    } else {
                                                        iIntValue = 180;
                                                    }
                                                }
                                                lc3Var.f49460u = ys5Var.f70413n;
                                                lc3Var.f49461v = ys5Var.f70414o;
                                                lc3Var.f49425A = f;
                                                lc3Var.f49465z = iIntValue;
                                                lc3Var.f49426B = ys5Var.f70423x;
                                                lc3Var.f49427C = ys5Var.f70424y;
                                                lc3Var.f49428D = ga1Var;
                                            } else if (!"application/x-subrip".equals(str9)) {
                                                throw ParserException.m2516a(null, "Unexpected MIME type.");
                                            }
                                            str6 = ys5Var.f70399b;
                                            if (str6 != null) {
                                                lc3Var.f49441b = ys5Var.f70399b;
                                            }
                                            lc3Var.f49440a = Integer.toString(i21);
                                            if (ys5Var.f70397a) {
                                                str7 = "video/webm";
                                            } else {
                                                str7 = "video/x-matroska";
                                            }
                                            lc3Var.f49452m = ez5.m11402l(str7);
                                            lc3Var.f49453n = ez5.m11402l(str9);
                                            lc3Var.f49454o = i6;
                                            lc3Var.f49443d = ys5Var.f70396Z;
                                            lc3Var.f49444e = i2111111111112;
                                            lc3Var.f49456q = list3;
                                            lc3Var.f49449j = str3;
                                            lc3Var.f49457r = ys5Var.f70412m;
                                            ys5Var.f70400b0 = lc3Var.m16068a();
                                            ys5Var.f70398a0 = zs5Var3.f72091j0.mo2555n(ys5Var.f70403d, ys5Var.f70404e);
                                            sparseArray2.put(ys5Var.f70403d, ys5Var);
                                            break;
                                        case 24:
                                            int i44 = ys5Var.f70388R;
                                            String str11 = uma.f64080a;
                                            iM22825t = uma.m22825t(i44, ByteOrder.LITTLE_ENDIAN);
                                            if (iM22825t == 0) {
                                                ss5.m21707d0("MatroskaExtractor", "Unsupported little endian PCM bit depth: " + ys5Var.f70388R + ". Setting mimeType to audio/x-unknown");
                                                str9 = "audio/x-unknown";
                                                iM22825t = -1;
                                            } else {
                                                str9 = "audio/raw";
                                            }
                                            i6 = -1;
                                            str3 = null;
                                            list3 = null;
                                            if (ys5Var.f70386P != null) {
                                                str3 = c3404ocM17906c.f54162b;
                                                str9 = "video/dolby-vision";
                                            }
                                            boolean z1110 = ys5Var.f70395Y;
                                            if (ys5Var.f70394X) {
                                                i7 = 2;
                                            } else {
                                                i7 = 0;
                                            }
                                            int i2111111111117 = (z1110 ? 1 : 0) | i7;
                                            lc3Var = new lc3();
                                            zM11398h = ez5.m11398h(str9);
                                            Map map114 = f72045p0;
                                            if (zM11398h) {
                                                lc3Var.f49430F = ys5Var.f70387Q;
                                                lc3Var.f49431G = ys5Var.f70389S;
                                                lc3Var.f49432H = iM22825t;
                                            } else if (ez5.m11401k(str9)) {
                                                if (ys5Var.f70418s == 0) {
                                                    i11 = ys5Var.f70416q;
                                                    i8 = -1;
                                                    if (i11 == -1) {
                                                        i11 = ys5Var.f70413n;
                                                    }
                                                    ys5Var.f70416q = i11;
                                                    i12 = ys5Var.f70417r;
                                                    if (i12 == -1) {
                                                        i12 = ys5Var.f70414o;
                                                    }
                                                    ys5Var.f70417r = i12;
                                                } else {
                                                    i8 = -1;
                                                }
                                                i9 = ys5Var.f70416q;
                                                if (i9 != i8) {
                                                    f = -1.0f;
                                                } else {
                                                    f = -1.0f;
                                                }
                                                if (ys5Var.f70425z) {
                                                    if (ys5Var.f70376F != -1.0f) {
                                                        bArr = null;
                                                    } else {
                                                        bArr = null;
                                                    }
                                                    int i2111111111118 = ys5Var.f70371A;
                                                    int i2111111111119 = ys5Var.f70373C;
                                                    int i21111111111110 = ys5Var.f70372B;
                                                    int i21111111111111 = ys5Var.f70415p;
                                                    ga1Var = new ga1(i2111111111118, i2111111111119, i21111111111110, bArr, i21111111111111, i21111111111111);
                                                } else {
                                                    ga1Var = null;
                                                }
                                                str5 = ys5Var.f70399b;
                                                if (str5 == null) {
                                                    iIntValue = -1;
                                                } else {
                                                    iIntValue = -1;
                                                }
                                                if (ys5Var.f70419t == 0) {
                                                    if (Float.compare(ys5Var.f70422w, 0.0f) == 0) {
                                                        iIntValue = 0;
                                                    } else if (Float.compare(ys5Var.f70422w, 90.0f) == 0) {
                                                        iIntValue = 90;
                                                    } else if (Float.compare(ys5Var.f70422w, -180.0f) != 0) {
                                                        iIntValue = 180;
                                                    } else {
                                                        iIntValue = 180;
                                                    }
                                                }
                                                lc3Var.f49460u = ys5Var.f70413n;
                                                lc3Var.f49461v = ys5Var.f70414o;
                                                lc3Var.f49425A = f;
                                                lc3Var.f49465z = iIntValue;
                                                lc3Var.f49426B = ys5Var.f70423x;
                                                lc3Var.f49427C = ys5Var.f70424y;
                                                lc3Var.f49428D = ga1Var;
                                            } else if (!"application/x-subrip".equals(str9)) {
                                                throw ParserException.m2516a(null, "Unexpected MIME type.");
                                            }
                                            str6 = ys5Var.f70399b;
                                            if (str6 != null) {
                                                lc3Var.f49441b = ys5Var.f70399b;
                                            }
                                            lc3Var.f49440a = Integer.toString(i21);
                                            if (ys5Var.f70397a) {
                                                str7 = "video/webm";
                                            } else {
                                                str7 = "video/x-matroska";
                                            }
                                            lc3Var.f49452m = ez5.m11402l(str7);
                                            lc3Var.f49453n = ez5.m11402l(str9);
                                            lc3Var.f49454o = i6;
                                            lc3Var.f49443d = ys5Var.f70396Z;
                                            lc3Var.f49444e = i2111111111117;
                                            lc3Var.f49456q = list3;
                                            lc3Var.f49449j = str3;
                                            lc3Var.f49457r = ys5Var.f70412m;
                                            ys5Var.f70400b0 = lc3Var.m16068a();
                                            ys5Var.f70398a0 = zs5Var3.f72091j0.mo2555n(ys5Var.f70403d, ys5Var.f70404e);
                                            sparseArray2.put(ys5Var.f70403d, ys5Var);
                                            break;
                                        case 25:
                                        case 26:
                                            listM6291y = ImmutableList.m6280B(f72041l0, ys5Var.m25306a(str8));
                                            str9 = "text/x-ssa";
                                            iM22825t = -1;
                                            i6 = -1;
                                            list4 = listM6291y;
                                            str3 = null;
                                            list3 = list4;
                                            if (ys5Var.f70386P != null) {
                                                str3 = c3404ocM17906c.f54162b;
                                                str9 = "video/dolby-vision";
                                            }
                                            boolean z1111 = ys5Var.f70395Y;
                                            if (ys5Var.f70394X) {
                                                i7 = 2;
                                            } else {
                                                i7 = 0;
                                            }
                                            int i21111111111112 = (z1111 ? 1 : 0) | i7;
                                            lc3Var = new lc3();
                                            zM11398h = ez5.m11398h(str9);
                                            Map map115 = f72045p0;
                                            if (zM11398h) {
                                                lc3Var.f49430F = ys5Var.f70387Q;
                                                lc3Var.f49431G = ys5Var.f70389S;
                                                lc3Var.f49432H = iM22825t;
                                            } else if (ez5.m11401k(str9)) {
                                                if (ys5Var.f70418s == 0) {
                                                    i11 = ys5Var.f70416q;
                                                    i8 = -1;
                                                    if (i11 == -1) {
                                                        i11 = ys5Var.f70413n;
                                                    }
                                                    ys5Var.f70416q = i11;
                                                    i12 = ys5Var.f70417r;
                                                    if (i12 == -1) {
                                                        i12 = ys5Var.f70414o;
                                                    }
                                                    ys5Var.f70417r = i12;
                                                } else {
                                                    i8 = -1;
                                                }
                                                i9 = ys5Var.f70416q;
                                                if (i9 != i8) {
                                                    f = -1.0f;
                                                } else {
                                                    f = -1.0f;
                                                }
                                                if (ys5Var.f70425z) {
                                                    if (ys5Var.f70376F != -1.0f) {
                                                        bArr = null;
                                                    } else {
                                                        bArr = null;
                                                    }
                                                    int i21111111111113 = ys5Var.f70371A;
                                                    int i21111111111114 = ys5Var.f70373C;
                                                    int i21111111111115 = ys5Var.f70372B;
                                                    int i21111111111116 = ys5Var.f70415p;
                                                    ga1Var = new ga1(i21111111111113, i21111111111114, i21111111111115, bArr, i21111111111116, i21111111111116);
                                                } else {
                                                    ga1Var = null;
                                                }
                                                str5 = ys5Var.f70399b;
                                                if (str5 == null) {
                                                    iIntValue = -1;
                                                } else {
                                                    iIntValue = -1;
                                                }
                                                if (ys5Var.f70419t == 0) {
                                                    if (Float.compare(ys5Var.f70422w, 0.0f) == 0) {
                                                        iIntValue = 0;
                                                    } else if (Float.compare(ys5Var.f70422w, 90.0f) == 0) {
                                                        iIntValue = 90;
                                                    } else if (Float.compare(ys5Var.f70422w, -180.0f) != 0) {
                                                        iIntValue = 180;
                                                    } else {
                                                        iIntValue = 180;
                                                    }
                                                }
                                                lc3Var.f49460u = ys5Var.f70413n;
                                                lc3Var.f49461v = ys5Var.f70414o;
                                                lc3Var.f49425A = f;
                                                lc3Var.f49465z = iIntValue;
                                                lc3Var.f49426B = ys5Var.f70423x;
                                                lc3Var.f49427C = ys5Var.f70424y;
                                                lc3Var.f49428D = ga1Var;
                                            } else if (!"application/x-subrip".equals(str9)) {
                                                throw ParserException.m2516a(null, "Unexpected MIME type.");
                                            }
                                            str6 = ys5Var.f70399b;
                                            if (str6 != null) {
                                                lc3Var.f49441b = ys5Var.f70399b;
                                            }
                                            lc3Var.f49440a = Integer.toString(i21);
                                            if (ys5Var.f70397a) {
                                                str7 = "video/webm";
                                            } else {
                                                str7 = "video/x-matroska";
                                            }
                                            lc3Var.f49452m = ez5.m11402l(str7);
                                            lc3Var.f49453n = ez5.m11402l(str9);
                                            lc3Var.f49454o = i6;
                                            lc3Var.f49443d = ys5Var.f70396Z;
                                            lc3Var.f49444e = i21111111111112;
                                            lc3Var.f49456q = list3;
                                            lc3Var.f49449j = str3;
                                            lc3Var.f49457r = ys5Var.f70412m;
                                            ys5Var.f70400b0 = lc3Var.m16068a();
                                            ys5Var.f70398a0 = zs5Var3.f72091j0.mo2555n(ys5Var.f70403d, ys5Var.f70404e);
                                            sparseArray2.put(ys5Var.f70403d, ys5Var);
                                            break;
                                        case DescriptorProtos.FileOptions.JAVA_STRING_CHECK_UTF8_FIELD_NUMBER /* 27 */:
                                            ps3 ps3VarM19467a = ps3.m19467a(new k47(ys5Var.m25306a(ys5Var.f70401c)), false, null);
                                            List list6 = ps3VarM19467a.f56742a;
                                            ys5Var.f70402c0 = ps3VarM19467a.f56743b;
                                            str4 = ps3VarM19467a.f56755n;
                                            str9 = "video/hevc";
                                            list2 = list6;
                                            str3 = str4;
                                            list = list2;
                                            iM22825t = -1;
                                            i6 = -1;
                                            list3 = list;
                                            if (ys5Var.f70386P != null) {
                                                str3 = c3404ocM17906c.f54162b;
                                                str9 = "video/dolby-vision";
                                            }
                                            boolean z1112 = ys5Var.f70395Y;
                                            if (ys5Var.f70394X) {
                                                i7 = 2;
                                            } else {
                                                i7 = 0;
                                            }
                                            int i21111111111117 = (z1112 ? 1 : 0) | i7;
                                            lc3Var = new lc3();
                                            zM11398h = ez5.m11398h(str9);
                                            Map map116 = f72045p0;
                                            if (zM11398h) {
                                                lc3Var.f49430F = ys5Var.f70387Q;
                                                lc3Var.f49431G = ys5Var.f70389S;
                                                lc3Var.f49432H = iM22825t;
                                            } else if (ez5.m11401k(str9)) {
                                                if (ys5Var.f70418s == 0) {
                                                    i11 = ys5Var.f70416q;
                                                    i8 = -1;
                                                    if (i11 == -1) {
                                                        i11 = ys5Var.f70413n;
                                                    }
                                                    ys5Var.f70416q = i11;
                                                    i12 = ys5Var.f70417r;
                                                    if (i12 == -1) {
                                                        i12 = ys5Var.f70414o;
                                                    }
                                                    ys5Var.f70417r = i12;
                                                } else {
                                                    i8 = -1;
                                                }
                                                i9 = ys5Var.f70416q;
                                                if (i9 != i8) {
                                                    f = -1.0f;
                                                } else {
                                                    f = -1.0f;
                                                }
                                                if (ys5Var.f70425z) {
                                                    if (ys5Var.f70376F != -1.0f) {
                                                        bArr = null;
                                                    } else {
                                                        bArr = null;
                                                    }
                                                    int i21111111111118 = ys5Var.f70371A;
                                                    int i21111111111119 = ys5Var.f70373C;
                                                    int i211111111111110 = ys5Var.f70372B;
                                                    int i211111111111111 = ys5Var.f70415p;
                                                    ga1Var = new ga1(i21111111111118, i21111111111119, i211111111111110, bArr, i211111111111111, i211111111111111);
                                                } else {
                                                    ga1Var = null;
                                                }
                                                str5 = ys5Var.f70399b;
                                                if (str5 == null) {
                                                    iIntValue = -1;
                                                } else {
                                                    iIntValue = -1;
                                                }
                                                if (ys5Var.f70419t == 0) {
                                                    if (Float.compare(ys5Var.f70422w, 0.0f) == 0) {
                                                        iIntValue = 0;
                                                    } else if (Float.compare(ys5Var.f70422w, 90.0f) == 0) {
                                                        iIntValue = 90;
                                                    } else if (Float.compare(ys5Var.f70422w, -180.0f) != 0) {
                                                        iIntValue = 180;
                                                    } else {
                                                        iIntValue = 180;
                                                    }
                                                }
                                                lc3Var.f49460u = ys5Var.f70413n;
                                                lc3Var.f49461v = ys5Var.f70414o;
                                                lc3Var.f49425A = f;
                                                lc3Var.f49465z = iIntValue;
                                                lc3Var.f49426B = ys5Var.f70423x;
                                                lc3Var.f49427C = ys5Var.f70424y;
                                                lc3Var.f49428D = ga1Var;
                                            } else if (!"application/x-subrip".equals(str9)) {
                                                throw ParserException.m2516a(null, "Unexpected MIME type.");
                                            }
                                            str6 = ys5Var.f70399b;
                                            if (str6 != null) {
                                                lc3Var.f49441b = ys5Var.f70399b;
                                            }
                                            lc3Var.f49440a = Integer.toString(i21);
                                            if (ys5Var.f70397a) {
                                                str7 = "video/webm";
                                            } else {
                                                str7 = "video/x-matroska";
                                            }
                                            lc3Var.f49452m = ez5.m11402l(str7);
                                            lc3Var.f49453n = ez5.m11402l(str9);
                                            lc3Var.f49454o = i6;
                                            lc3Var.f49443d = ys5Var.f70396Z;
                                            lc3Var.f49444e = i21111111111117;
                                            lc3Var.f49456q = list3;
                                            lc3Var.f49449j = str3;
                                            lc3Var.f49457r = ys5Var.f70412m;
                                            ys5Var.f70400b0 = lc3Var.m16068a();
                                            ys5Var.f70398a0 = zs5Var3.f72091j0.mo2555n(ys5Var.f70403d, ys5Var.f70404e);
                                            sparseArray2.put(ys5Var.f70403d, ys5Var);
                                            break;
                                        case 28:
                                            str9 = "text/vtt";
                                            iM22825t = -1;
                                            i6 = -1;
                                            str3 = null;
                                            list3 = null;
                                            if (ys5Var.f70386P != null) {
                                                str3 = c3404ocM17906c.f54162b;
                                                str9 = "video/dolby-vision";
                                            }
                                            boolean z1113 = ys5Var.f70395Y;
                                            if (ys5Var.f70394X) {
                                                i7 = 2;
                                            } else {
                                                i7 = 0;
                                            }
                                            int i211111111111112 = (z1113 ? 1 : 0) | i7;
                                            lc3Var = new lc3();
                                            zM11398h = ez5.m11398h(str9);
                                            Map map117 = f72045p0;
                                            if (zM11398h) {
                                                lc3Var.f49430F = ys5Var.f70387Q;
                                                lc3Var.f49431G = ys5Var.f70389S;
                                                lc3Var.f49432H = iM22825t;
                                            } else if (ez5.m11401k(str9)) {
                                                if (ys5Var.f70418s == 0) {
                                                    i11 = ys5Var.f70416q;
                                                    i8 = -1;
                                                    if (i11 == -1) {
                                                        i11 = ys5Var.f70413n;
                                                    }
                                                    ys5Var.f70416q = i11;
                                                    i12 = ys5Var.f70417r;
                                                    if (i12 == -1) {
                                                        i12 = ys5Var.f70414o;
                                                    }
                                                    ys5Var.f70417r = i12;
                                                } else {
                                                    i8 = -1;
                                                }
                                                i9 = ys5Var.f70416q;
                                                if (i9 != i8) {
                                                    f = -1.0f;
                                                } else {
                                                    f = -1.0f;
                                                }
                                                if (ys5Var.f70425z) {
                                                    if (ys5Var.f70376F != -1.0f) {
                                                        bArr = null;
                                                    } else {
                                                        bArr = null;
                                                    }
                                                    int i211111111111113 = ys5Var.f70371A;
                                                    int i211111111111114 = ys5Var.f70373C;
                                                    int i211111111111115 = ys5Var.f70372B;
                                                    int i211111111111116 = ys5Var.f70415p;
                                                    ga1Var = new ga1(i211111111111113, i211111111111114, i211111111111115, bArr, i211111111111116, i211111111111116);
                                                } else {
                                                    ga1Var = null;
                                                }
                                                str5 = ys5Var.f70399b;
                                                if (str5 == null) {
                                                    iIntValue = -1;
                                                } else {
                                                    iIntValue = -1;
                                                }
                                                if (ys5Var.f70419t == 0) {
                                                    if (Float.compare(ys5Var.f70422w, 0.0f) == 0) {
                                                        iIntValue = 0;
                                                    } else if (Float.compare(ys5Var.f70422w, 90.0f) == 0) {
                                                        iIntValue = 90;
                                                    } else if (Float.compare(ys5Var.f70422w, -180.0f) != 0) {
                                                        iIntValue = 180;
                                                    } else {
                                                        iIntValue = 180;
                                                    }
                                                }
                                                lc3Var.f49460u = ys5Var.f70413n;
                                                lc3Var.f49461v = ys5Var.f70414o;
                                                lc3Var.f49425A = f;
                                                lc3Var.f49465z = iIntValue;
                                                lc3Var.f49426B = ys5Var.f70423x;
                                                lc3Var.f49427C = ys5Var.f70424y;
                                                lc3Var.f49428D = ga1Var;
                                            } else if (!"application/x-subrip".equals(str9)) {
                                                throw ParserException.m2516a(null, "Unexpected MIME type.");
                                            }
                                            str6 = ys5Var.f70399b;
                                            if (str6 != null) {
                                                lc3Var.f49441b = ys5Var.f70399b;
                                            }
                                            lc3Var.f49440a = Integer.toString(i21);
                                            if (ys5Var.f70397a) {
                                                str7 = "video/webm";
                                            } else {
                                                str7 = "video/x-matroska";
                                            }
                                            lc3Var.f49452m = ez5.m11402l(str7);
                                            lc3Var.f49453n = ez5.m11402l(str9);
                                            lc3Var.f49454o = i6;
                                            lc3Var.f49443d = ys5Var.f70396Z;
                                            lc3Var.f49444e = i211111111111112;
                                            lc3Var.f49456q = list3;
                                            lc3Var.f49449j = str3;
                                            lc3Var.f49457r = ys5Var.f70412m;
                                            ys5Var.f70400b0 = lc3Var.m16068a();
                                            ys5Var.f70398a0 = zs5Var3.f72091j0.mo2555n(ys5Var.f70403d, ys5Var.f70404e);
                                            sparseArray2.put(ys5Var.f70403d, ys5Var);
                                            break;
                                        case 29:
                                            str9 = "application/x-subrip";
                                            iM22825t = -1;
                                            i6 = -1;
                                            str3 = null;
                                            list3 = null;
                                            if (ys5Var.f70386P != null) {
                                                str3 = c3404ocM17906c.f54162b;
                                                str9 = "video/dolby-vision";
                                            }
                                            boolean z1114 = ys5Var.f70395Y;
                                            if (ys5Var.f70394X) {
                                                i7 = 2;
                                            } else {
                                                i7 = 0;
                                            }
                                            int i211111111111117 = (z1114 ? 1 : 0) | i7;
                                            lc3Var = new lc3();
                                            zM11398h = ez5.m11398h(str9);
                                            Map map118 = f72045p0;
                                            if (zM11398h) {
                                                lc3Var.f49430F = ys5Var.f70387Q;
                                                lc3Var.f49431G = ys5Var.f70389S;
                                                lc3Var.f49432H = iM22825t;
                                            } else if (ez5.m11401k(str9)) {
                                                if (ys5Var.f70418s == 0) {
                                                    i11 = ys5Var.f70416q;
                                                    i8 = -1;
                                                    if (i11 == -1) {
                                                        i11 = ys5Var.f70413n;
                                                    }
                                                    ys5Var.f70416q = i11;
                                                    i12 = ys5Var.f70417r;
                                                    if (i12 == -1) {
                                                        i12 = ys5Var.f70414o;
                                                    }
                                                    ys5Var.f70417r = i12;
                                                } else {
                                                    i8 = -1;
                                                }
                                                i9 = ys5Var.f70416q;
                                                if (i9 != i8) {
                                                    f = -1.0f;
                                                } else {
                                                    f = -1.0f;
                                                }
                                                if (ys5Var.f70425z) {
                                                    if (ys5Var.f70376F != -1.0f) {
                                                        bArr = null;
                                                    } else {
                                                        bArr = null;
                                                    }
                                                    int i211111111111118 = ys5Var.f70371A;
                                                    int i211111111111119 = ys5Var.f70373C;
                                                    int i2111111111111110 = ys5Var.f70372B;
                                                    int i2111111111111111 = ys5Var.f70415p;
                                                    ga1Var = new ga1(i211111111111118, i211111111111119, i2111111111111110, bArr, i2111111111111111, i2111111111111111);
                                                } else {
                                                    ga1Var = null;
                                                }
                                                str5 = ys5Var.f70399b;
                                                if (str5 == null) {
                                                    iIntValue = -1;
                                                } else {
                                                    iIntValue = -1;
                                                }
                                                if (ys5Var.f70419t == 0) {
                                                    if (Float.compare(ys5Var.f70422w, 0.0f) == 0) {
                                                        iIntValue = 0;
                                                    } else if (Float.compare(ys5Var.f70422w, 90.0f) == 0) {
                                                        iIntValue = 90;
                                                    } else if (Float.compare(ys5Var.f70422w, -180.0f) != 0) {
                                                        iIntValue = 180;
                                                    } else {
                                                        iIntValue = 180;
                                                    }
                                                }
                                                lc3Var.f49460u = ys5Var.f70413n;
                                                lc3Var.f49461v = ys5Var.f70414o;
                                                lc3Var.f49425A = f;
                                                lc3Var.f49465z = iIntValue;
                                                lc3Var.f49426B = ys5Var.f70423x;
                                                lc3Var.f49427C = ys5Var.f70424y;
                                                lc3Var.f49428D = ga1Var;
                                            } else if (!"application/x-subrip".equals(str9)) {
                                                throw ParserException.m2516a(null, "Unexpected MIME type.");
                                            }
                                            str6 = ys5Var.f70399b;
                                            if (str6 != null) {
                                                lc3Var.f49441b = ys5Var.f70399b;
                                            }
                                            lc3Var.f49440a = Integer.toString(i21);
                                            if (ys5Var.f70397a) {
                                                str7 = "video/webm";
                                            } else {
                                                str7 = "video/x-matroska";
                                            }
                                            lc3Var.f49452m = ez5.m11402l(str7);
                                            lc3Var.f49453n = ez5.m11402l(str9);
                                            lc3Var.f49454o = i6;
                                            lc3Var.f49443d = ys5Var.f70396Z;
                                            lc3Var.f49444e = i211111111111117;
                                            lc3Var.f49456q = list3;
                                            lc3Var.f49449j = str3;
                                            lc3Var.f49457r = ys5Var.f70412m;
                                            ys5Var.f70400b0 = lc3Var.m16068a();
                                            ys5Var.f70398a0 = zs5Var3.f72091j0.mo2555n(ys5Var.f70403d, ys5Var.f70404e);
                                            sparseArray2.put(ys5Var.f70403d, ys5Var);
                                            break;
                                        case 30:
                                            str9 = "video/mpeg2";
                                            iM22825t = -1;
                                            i6 = -1;
                                            str3 = null;
                                            list3 = null;
                                            if (ys5Var.f70386P != null) {
                                                str3 = c3404ocM17906c.f54162b;
                                                str9 = "video/dolby-vision";
                                            }
                                            boolean z1115 = ys5Var.f70395Y;
                                            if (ys5Var.f70394X) {
                                                i7 = 2;
                                            } else {
                                                i7 = 0;
                                            }
                                            int i2111111111111112 = (z1115 ? 1 : 0) | i7;
                                            lc3Var = new lc3();
                                            zM11398h = ez5.m11398h(str9);
                                            Map map119 = f72045p0;
                                            if (zM11398h) {
                                                lc3Var.f49430F = ys5Var.f70387Q;
                                                lc3Var.f49431G = ys5Var.f70389S;
                                                lc3Var.f49432H = iM22825t;
                                            } else if (ez5.m11401k(str9)) {
                                                if (ys5Var.f70418s == 0) {
                                                    i11 = ys5Var.f70416q;
                                                    i8 = -1;
                                                    if (i11 == -1) {
                                                        i11 = ys5Var.f70413n;
                                                    }
                                                    ys5Var.f70416q = i11;
                                                    i12 = ys5Var.f70417r;
                                                    if (i12 == -1) {
                                                        i12 = ys5Var.f70414o;
                                                    }
                                                    ys5Var.f70417r = i12;
                                                } else {
                                                    i8 = -1;
                                                }
                                                i9 = ys5Var.f70416q;
                                                if (i9 != i8) {
                                                    f = -1.0f;
                                                } else {
                                                    f = -1.0f;
                                                }
                                                if (ys5Var.f70425z) {
                                                    if (ys5Var.f70376F != -1.0f) {
                                                        bArr = null;
                                                    } else {
                                                        bArr = null;
                                                    }
                                                    int i2111111111111113 = ys5Var.f70371A;
                                                    int i2111111111111114 = ys5Var.f70373C;
                                                    int i2111111111111115 = ys5Var.f70372B;
                                                    int i2111111111111116 = ys5Var.f70415p;
                                                    ga1Var = new ga1(i2111111111111113, i2111111111111114, i2111111111111115, bArr, i2111111111111116, i2111111111111116);
                                                } else {
                                                    ga1Var = null;
                                                }
                                                str5 = ys5Var.f70399b;
                                                if (str5 == null) {
                                                    iIntValue = -1;
                                                } else {
                                                    iIntValue = -1;
                                                }
                                                if (ys5Var.f70419t == 0) {
                                                    if (Float.compare(ys5Var.f70422w, 0.0f) == 0) {
                                                        iIntValue = 0;
                                                    } else if (Float.compare(ys5Var.f70422w, 90.0f) == 0) {
                                                        iIntValue = 90;
                                                    } else if (Float.compare(ys5Var.f70422w, -180.0f) != 0) {
                                                        iIntValue = 180;
                                                    } else {
                                                        iIntValue = 180;
                                                    }
                                                }
                                                lc3Var.f49460u = ys5Var.f70413n;
                                                lc3Var.f49461v = ys5Var.f70414o;
                                                lc3Var.f49425A = f;
                                                lc3Var.f49465z = iIntValue;
                                                lc3Var.f49426B = ys5Var.f70423x;
                                                lc3Var.f49427C = ys5Var.f70424y;
                                                lc3Var.f49428D = ga1Var;
                                            } else if (!"application/x-subrip".equals(str9)) {
                                                throw ParserException.m2516a(null, "Unexpected MIME type.");
                                            }
                                            str6 = ys5Var.f70399b;
                                            if (str6 != null) {
                                                lc3Var.f49441b = ys5Var.f70399b;
                                            }
                                            lc3Var.f49440a = Integer.toString(i21);
                                            if (ys5Var.f70397a) {
                                                str7 = "video/webm";
                                            } else {
                                                str7 = "video/x-matroska";
                                            }
                                            lc3Var.f49452m = ez5.m11402l(str7);
                                            lc3Var.f49453n = ez5.m11402l(str9);
                                            lc3Var.f49454o = i6;
                                            lc3Var.f49443d = ys5Var.f70396Z;
                                            lc3Var.f49444e = i2111111111111112;
                                            lc3Var.f49456q = list3;
                                            lc3Var.f49449j = str3;
                                            lc3Var.f49457r = ys5Var.f70412m;
                                            ys5Var.f70400b0 = lc3Var.m16068a();
                                            ys5Var.f70398a0 = zs5Var3.f72091j0.mo2555n(ys5Var.f70403d, ys5Var.f70404e);
                                            sparseArray2.put(ys5Var.f70403d, ys5Var);
                                            break;
                                        case DescriptorProtos.FileOptions.CC_ENABLE_ARENAS_FIELD_NUMBER /* 31 */:
                                            str9 = "audio/eac3";
                                            iM22825t = -1;
                                            i6 = -1;
                                            str3 = null;
                                            list3 = null;
                                            if (ys5Var.f70386P != null) {
                                                str3 = c3404ocM17906c.f54162b;
                                                str9 = "video/dolby-vision";
                                            }
                                            boolean z1116 = ys5Var.f70395Y;
                                            if (ys5Var.f70394X) {
                                                i7 = 2;
                                            } else {
                                                i7 = 0;
                                            }
                                            int i2111111111111117 = (z1116 ? 1 : 0) | i7;
                                            lc3Var = new lc3();
                                            zM11398h = ez5.m11398h(str9);
                                            Map map1110 = f72045p0;
                                            if (zM11398h) {
                                                lc3Var.f49430F = ys5Var.f70387Q;
                                                lc3Var.f49431G = ys5Var.f70389S;
                                                lc3Var.f49432H = iM22825t;
                                            } else if (ez5.m11401k(str9)) {
                                                if (ys5Var.f70418s == 0) {
                                                    i11 = ys5Var.f70416q;
                                                    i8 = -1;
                                                    if (i11 == -1) {
                                                        i11 = ys5Var.f70413n;
                                                    }
                                                    ys5Var.f70416q = i11;
                                                    i12 = ys5Var.f70417r;
                                                    if (i12 == -1) {
                                                        i12 = ys5Var.f70414o;
                                                    }
                                                    ys5Var.f70417r = i12;
                                                } else {
                                                    i8 = -1;
                                                }
                                                i9 = ys5Var.f70416q;
                                                if (i9 != i8) {
                                                    f = -1.0f;
                                                } else {
                                                    f = -1.0f;
                                                }
                                                if (ys5Var.f70425z) {
                                                    if (ys5Var.f70376F != -1.0f) {
                                                        bArr = null;
                                                    } else {
                                                        bArr = null;
                                                    }
                                                    int i2111111111111118 = ys5Var.f70371A;
                                                    int i2111111111111119 = ys5Var.f70373C;
                                                    int i21111111111111110 = ys5Var.f70372B;
                                                    int i21111111111111111 = ys5Var.f70415p;
                                                    ga1Var = new ga1(i2111111111111118, i2111111111111119, i21111111111111110, bArr, i21111111111111111, i21111111111111111);
                                                } else {
                                                    ga1Var = null;
                                                }
                                                str5 = ys5Var.f70399b;
                                                if (str5 == null) {
                                                    iIntValue = -1;
                                                } else {
                                                    iIntValue = -1;
                                                }
                                                if (ys5Var.f70419t == 0) {
                                                    if (Float.compare(ys5Var.f70422w, 0.0f) == 0) {
                                                        iIntValue = 0;
                                                    } else if (Float.compare(ys5Var.f70422w, 90.0f) == 0) {
                                                        iIntValue = 90;
                                                    } else if (Float.compare(ys5Var.f70422w, -180.0f) != 0) {
                                                        iIntValue = 180;
                                                    } else {
                                                        iIntValue = 180;
                                                    }
                                                }
                                                lc3Var.f49460u = ys5Var.f70413n;
                                                lc3Var.f49461v = ys5Var.f70414o;
                                                lc3Var.f49425A = f;
                                                lc3Var.f49465z = iIntValue;
                                                lc3Var.f49426B = ys5Var.f70423x;
                                                lc3Var.f49427C = ys5Var.f70424y;
                                                lc3Var.f49428D = ga1Var;
                                            } else if (!"application/x-subrip".equals(str9)) {
                                                throw ParserException.m2516a(null, "Unexpected MIME type.");
                                            }
                                            str6 = ys5Var.f70399b;
                                            if (str6 != null) {
                                                lc3Var.f49441b = ys5Var.f70399b;
                                            }
                                            lc3Var.f49440a = Integer.toString(i21);
                                            if (ys5Var.f70397a) {
                                                str7 = "video/webm";
                                            } else {
                                                str7 = "video/x-matroska";
                                            }
                                            lc3Var.f49452m = ez5.m11402l(str7);
                                            lc3Var.f49453n = ez5.m11402l(str9);
                                            lc3Var.f49454o = i6;
                                            lc3Var.f49443d = ys5Var.f70396Z;
                                            lc3Var.f49444e = i2111111111111117;
                                            lc3Var.f49456q = list3;
                                            lc3Var.f49449j = str3;
                                            lc3Var.f49457r = ys5Var.f70412m;
                                            ys5Var.f70400b0 = lc3Var.m16068a();
                                            ys5Var.f70398a0 = zs5Var3.f72091j0.mo2555n(ys5Var.f70403d, ys5Var.f70404e);
                                            sparseArray2.put(ys5Var.f70403d, ys5Var);
                                            break;
                                        case 32:
                                            listSingletonList = Collections.singletonList(ys5Var.m25306a(str8));
                                            str9 = "audio/flac";
                                            listM6291y = listSingletonList;
                                            iM22825t = -1;
                                            i6 = -1;
                                            list4 = listM6291y;
                                            str3 = null;
                                            list3 = list4;
                                            if (ys5Var.f70386P != null) {
                                                str3 = c3404ocM17906c.f54162b;
                                                str9 = "video/dolby-vision";
                                            }
                                            boolean z1117 = ys5Var.f70395Y;
                                            if (ys5Var.f70394X) {
                                                i7 = 2;
                                            } else {
                                                i7 = 0;
                                            }
                                            int i21111111111111112 = (z1117 ? 1 : 0) | i7;
                                            lc3Var = new lc3();
                                            zM11398h = ez5.m11398h(str9);
                                            Map map1111 = f72045p0;
                                            if (zM11398h) {
                                                lc3Var.f49430F = ys5Var.f70387Q;
                                                lc3Var.f49431G = ys5Var.f70389S;
                                                lc3Var.f49432H = iM22825t;
                                            } else if (ez5.m11401k(str9)) {
                                                if (ys5Var.f70418s == 0) {
                                                    i11 = ys5Var.f70416q;
                                                    i8 = -1;
                                                    if (i11 == -1) {
                                                        i11 = ys5Var.f70413n;
                                                    }
                                                    ys5Var.f70416q = i11;
                                                    i12 = ys5Var.f70417r;
                                                    if (i12 == -1) {
                                                        i12 = ys5Var.f70414o;
                                                    }
                                                    ys5Var.f70417r = i12;
                                                } else {
                                                    i8 = -1;
                                                }
                                                i9 = ys5Var.f70416q;
                                                if (i9 != i8) {
                                                    f = -1.0f;
                                                } else {
                                                    f = -1.0f;
                                                }
                                                if (ys5Var.f70425z) {
                                                    if (ys5Var.f70376F != -1.0f) {
                                                        bArr = null;
                                                    } else {
                                                        bArr = null;
                                                    }
                                                    int i21111111111111113 = ys5Var.f70371A;
                                                    int i21111111111111114 = ys5Var.f70373C;
                                                    int i21111111111111115 = ys5Var.f70372B;
                                                    int i21111111111111116 = ys5Var.f70415p;
                                                    ga1Var = new ga1(i21111111111111113, i21111111111111114, i21111111111111115, bArr, i21111111111111116, i21111111111111116);
                                                } else {
                                                    ga1Var = null;
                                                }
                                                str5 = ys5Var.f70399b;
                                                if (str5 == null) {
                                                    iIntValue = -1;
                                                } else {
                                                    iIntValue = -1;
                                                }
                                                if (ys5Var.f70419t == 0) {
                                                    if (Float.compare(ys5Var.f70422w, 0.0f) == 0) {
                                                        iIntValue = 0;
                                                    } else if (Float.compare(ys5Var.f70422w, 90.0f) == 0) {
                                                        iIntValue = 90;
                                                    } else if (Float.compare(ys5Var.f70422w, -180.0f) != 0) {
                                                        iIntValue = 180;
                                                    } else {
                                                        iIntValue = 180;
                                                    }
                                                }
                                                lc3Var.f49460u = ys5Var.f70413n;
                                                lc3Var.f49461v = ys5Var.f70414o;
                                                lc3Var.f49425A = f;
                                                lc3Var.f49465z = iIntValue;
                                                lc3Var.f49426B = ys5Var.f70423x;
                                                lc3Var.f49427C = ys5Var.f70424y;
                                                lc3Var.f49428D = ga1Var;
                                            } else if (!"application/x-subrip".equals(str9)) {
                                                throw ParserException.m2516a(null, "Unexpected MIME type.");
                                            }
                                            str6 = ys5Var.f70399b;
                                            if (str6 != null) {
                                                lc3Var.f49441b = ys5Var.f70399b;
                                            }
                                            lc3Var.f49440a = Integer.toString(i21);
                                            if (ys5Var.f70397a) {
                                                str7 = "video/webm";
                                            } else {
                                                str7 = "video/x-matroska";
                                            }
                                            lc3Var.f49452m = ez5.m11402l(str7);
                                            lc3Var.f49453n = ez5.m11402l(str9);
                                            lc3Var.f49454o = i6;
                                            lc3Var.f49443d = ys5Var.f70396Z;
                                            lc3Var.f49444e = i21111111111111112;
                                            lc3Var.f49456q = list3;
                                            lc3Var.f49449j = str3;
                                            lc3Var.f49457r = ys5Var.f70412m;
                                            ys5Var.f70400b0 = lc3Var.m16068a();
                                            ys5Var.f70398a0 = zs5Var3.f72091j0.mo2555n(ys5Var.f70403d, ys5Var.f70404e);
                                            sparseArray2.put(ys5Var.f70403d, ys5Var);
                                            break;
                                        case 33:
                                            ArrayList arrayList4 = new ArrayList(3);
                                            arrayList4.add(ys5Var.m25306a(ys5Var.f70401c));
                                            ByteBuffer byteBufferAllocate = ByteBuffer.allocate(8);
                                            ByteOrder byteOrder = ByteOrder.LITTLE_ENDIAN;
                                            arrayList4.add(byteBufferAllocate.order(byteOrder).putLong(ys5Var.f70390T).array());
                                            arrayList4.add(ByteBuffer.allocate(8).order(byteOrder).putLong(ys5Var.f70391U).array());
                                            str9 = "audio/opus";
                                            i6 = 5760;
                                            arrayList = arrayList4;
                                            iM22825t = -1;
                                            list4 = arrayList;
                                            str3 = null;
                                            list3 = list4;
                                            if (ys5Var.f70386P != null) {
                                                str3 = c3404ocM17906c.f54162b;
                                                str9 = "video/dolby-vision";
                                            }
                                            boolean z1118 = ys5Var.f70395Y;
                                            if (ys5Var.f70394X) {
                                                i7 = 2;
                                            } else {
                                                i7 = 0;
                                            }
                                            int i21111111111111117 = (z1118 ? 1 : 0) | i7;
                                            lc3Var = new lc3();
                                            zM11398h = ez5.m11398h(str9);
                                            Map map1112 = f72045p0;
                                            if (zM11398h) {
                                                lc3Var.f49430F = ys5Var.f70387Q;
                                                lc3Var.f49431G = ys5Var.f70389S;
                                                lc3Var.f49432H = iM22825t;
                                            } else if (ez5.m11401k(str9)) {
                                                if (ys5Var.f70418s == 0) {
                                                    i11 = ys5Var.f70416q;
                                                    i8 = -1;
                                                    if (i11 == -1) {
                                                        i11 = ys5Var.f70413n;
                                                    }
                                                    ys5Var.f70416q = i11;
                                                    i12 = ys5Var.f70417r;
                                                    if (i12 == -1) {
                                                        i12 = ys5Var.f70414o;
                                                    }
                                                    ys5Var.f70417r = i12;
                                                } else {
                                                    i8 = -1;
                                                }
                                                i9 = ys5Var.f70416q;
                                                if (i9 != i8) {
                                                    f = -1.0f;
                                                } else {
                                                    f = -1.0f;
                                                }
                                                if (ys5Var.f70425z) {
                                                    if (ys5Var.f70376F != -1.0f) {
                                                        bArr = null;
                                                    } else {
                                                        bArr = null;
                                                    }
                                                    int i21111111111111118 = ys5Var.f70371A;
                                                    int i21111111111111119 = ys5Var.f70373C;
                                                    int i211111111111111110 = ys5Var.f70372B;
                                                    int i211111111111111111 = ys5Var.f70415p;
                                                    ga1Var = new ga1(i21111111111111118, i21111111111111119, i211111111111111110, bArr, i211111111111111111, i211111111111111111);
                                                } else {
                                                    ga1Var = null;
                                                }
                                                str5 = ys5Var.f70399b;
                                                if (str5 == null) {
                                                    iIntValue = -1;
                                                } else {
                                                    iIntValue = -1;
                                                }
                                                if (ys5Var.f70419t == 0) {
                                                    if (Float.compare(ys5Var.f70422w, 0.0f) == 0) {
                                                        iIntValue = 0;
                                                    } else if (Float.compare(ys5Var.f70422w, 90.0f) == 0) {
                                                        iIntValue = 90;
                                                    } else if (Float.compare(ys5Var.f70422w, -180.0f) != 0) {
                                                        iIntValue = 180;
                                                    } else {
                                                        iIntValue = 180;
                                                    }
                                                }
                                                lc3Var.f49460u = ys5Var.f70413n;
                                                lc3Var.f49461v = ys5Var.f70414o;
                                                lc3Var.f49425A = f;
                                                lc3Var.f49465z = iIntValue;
                                                lc3Var.f49426B = ys5Var.f70423x;
                                                lc3Var.f49427C = ys5Var.f70424y;
                                                lc3Var.f49428D = ga1Var;
                                            } else if (!"application/x-subrip".equals(str9)) {
                                                throw ParserException.m2516a(null, "Unexpected MIME type.");
                                            }
                                            str6 = ys5Var.f70399b;
                                            if (str6 != null) {
                                                lc3Var.f49441b = ys5Var.f70399b;
                                            }
                                            lc3Var.f49440a = Integer.toString(i21);
                                            if (ys5Var.f70397a) {
                                                str7 = "video/webm";
                                            } else {
                                                str7 = "video/x-matroska";
                                            }
                                            lc3Var.f49452m = ez5.m11402l(str7);
                                            lc3Var.f49453n = ez5.m11402l(str9);
                                            lc3Var.f49454o = i6;
                                            lc3Var.f49443d = ys5Var.f70396Z;
                                            lc3Var.f49444e = i21111111111111117;
                                            lc3Var.f49456q = list3;
                                            lc3Var.f49449j = str3;
                                            lc3Var.f49457r = ys5Var.f70412m;
                                            ys5Var.f70400b0 = lc3Var.m16068a();
                                            ys5Var.f70398a0 = zs5Var3.f72091j0.mo2555n(ys5Var.f70403d, ys5Var.f70404e);
                                            sparseArray2.put(ys5Var.f70403d, ys5Var);
                                            break;
                                        default:
                                            throw ParserException.m2516a(null, "Unrecognized codec identifier.");
                                    }
                                default:
                                    zs5Var3.f72106y = null;
                                    break;
                            }
                        } else if (i20 != 183) {
                            if (i20 == 19899) {
                                int i45 = zs5Var3.f72046A;
                                if (i45 != -1) {
                                    long j7 = zs5Var3.f72047B;
                                    if (j7 != -1) {
                                        if (i45 == 475249515) {
                                            zs5Var3.f72056K = j7;
                                        }
                                    }
                                }
                                throw ParserException.m2516a(null, "Mandatory element SeekID or SeekPosition not found");
                            }
                            if (i20 == 25152) {
                                zs5Var3.m25762h(i20);
                                ys5 ys5Var2 = zs5Var3.f72106y;
                                if (ys5Var2.f70408i) {
                                    m8a m8aVar = ys5Var2.f70410k;
                                    if (m8aVar == null) {
                                        throw ParserException.m2516a(null, "Encrypted Track found but ContentEncKeyID was not found");
                                    }
                                    ys5Var2.f70412m = new DrmInitData(null, true, new DrmInitData.SchemeData(zk0.f71668a, null, "video/webm", m8aVar.f50765b));
                                }
                            } else if (i20 == 28032) {
                                zs5Var3.m25762h(i20);
                                ys5 ys5Var3 = zs5Var3.f72106y;
                                if (ys5Var3.f70408i && ys5Var3.f70409j != null) {
                                    throw ParserException.m2516a(null, "Combining encryption and compression is not supported");
                                }
                            } else if (i20 == 357149030) {
                                if (zs5Var3.f72101t == -9223372036854775807L) {
                                    zs5Var3.f72101t = 1000000L;
                                }
                                long j8 = zs5Var3.f72102u;
                                if (j8 != -9223372036854775807L) {
                                    zs5Var3.f72103v = zs5Var3.m25767n(j8);
                                }
                            } else if (i20 == 374648427) {
                                boolean z20 = z3 ? 1 : 0;
                                if (sparseArray2.size() == 0) {
                                    throw ParserException.m2516a(null, "No valid tracks were found");
                                }
                                boolean z21 = (!zs5Var3.f72078d || zs5Var3.f72056K == -1) ? true : z20 ? 1 : 0;
                                int i46 = -1;
                                int i47 = -1;
                                int i48 = -1;
                                int i49 = -1;
                                for (int i50 = z20 ? 1 : 0; i50 < sparseArray2.size(); i50++) {
                                    ys5 ys5Var4 = (ys5) sparseArray2.valueAt(i50);
                                    int i51 = ys5Var4.f70404e;
                                    if (i51 == 2) {
                                        if (ys5Var4.f70395Y) {
                                            i46 = ys5Var4.f70403d;
                                        }
                                        if (i47 == -1) {
                                            i47 = ys5Var4.f70403d;
                                        }
                                    } else if (i51 == 1) {
                                        if (ys5Var4.f70395Y) {
                                            i48 = ys5Var4.f70403d;
                                        }
                                        if (i49 == -1) {
                                            i49 = ys5Var4.f70403d;
                                        }
                                    }
                                    if (z21) {
                                        ys5Var4.f70398a0.getClass();
                                        if (!ys5Var4.f70393W) {
                                            n8a n8aVar = ys5Var4.f70398a0;
                                            C0713b c0713b = ys5Var4.f70400b0;
                                            c0713b.getClass();
                                            n8aVar.mo2537g(c0713b);
                                        }
                                    }
                                }
                                if (i46 != -1) {
                                    zs5Var3.f72054I = i46;
                                } else if (i47 != -1) {
                                    zs5Var3.f72054I = i47;
                                } else if (i48 != -1) {
                                    zs5Var3.f72054I = i48;
                                } else if (i49 != -1) {
                                    zs5Var3.f72054I = i49;
                                } else {
                                    zs5Var3.f72054I = sparseArray2.size() > 0 ? ((ys5) sparseArray2.valueAt(z20 ? 1 : 0)).f70403d : -1;
                                }
                                if (z21) {
                                    zs5Var3.m25764k();
                                }
                            } else if (i20 == 475249515 && !zs5Var3.f72107z) {
                                int i52 = z3 ? 1 : 0;
                                while (true) {
                                    if (i52 < sparseArray.size()) {
                                        if (((List) sparseArray.valueAt(i52)).isEmpty()) {
                                            i52++;
                                        } else if (zs5Var3.f72103v != -9223372036854775807L) {
                                            for (int i53 = z3 ? 1 : 0; i53 < sparseArray.size(); i53++) {
                                                Collections.sort((List) sparseArray.valueAt(i53));
                                            }
                                            zs5Var3.f72091j0.mo2558q(new xs5(sparseArray, zs5Var3.f72103v, zs5Var3.f72054I, zs5Var3.f72100s, zs5Var3.f72099r));
                                        }
                                    }
                                    zs5Var3.f72091j0.mo2558q(new h60(zs5Var3.f72103v));
                                }
                                zs5Var3.f72107z = z4;
                                zs5Var3.f72049D = z3;
                                int i54 = z3 ? 1 : 0;
                                while (i54 < sparseArray2.size()) {
                                    ys5 ys5Var5 = (ys5) sparseArray2.valueAt(i54);
                                    long j9 = zs5Var3.f72103v;
                                    long j10 = zs5Var3.f72100s;
                                    long j11 = zs5Var3.f72099r;
                                    boolean z22 = z3;
                                    int i55 = z4;
                                    if (ys5Var5.f70404e != 2 || (list5 = (List) sparseArray.get(ys5Var5.f70403d)) == null || list5.isEmpty()) {
                                        i14 = i54;
                                    } else {
                                        if (list5.isEmpty()) {
                                            i14 = i54;
                                        } else {
                                            i14 = i54;
                                            int iMin = Math.min(list5.size(), 20);
                                            double d = 0.0d;
                                            int i56 = z22 ? 1 : 0;
                                            int i57 = -1;
                                            while (i56 < iMin) {
                                                ws5 ws5Var = (ws5) list5.get(i56);
                                                long j12 = j10;
                                                long j13 = ws5Var.f67250a;
                                                long j14 = ws5Var.f67252c;
                                                long j15 = ws5Var.f67251b;
                                                if (j13 > 10000000) {
                                                    if (i57 == -1) {
                                                        j = ((ws5) list5.get(i57 == true ? 1 : 0)).f67250a;
                                                    }
                                                    if (j != -9223372036854775807L) {
                                                        C0713b c0713b2 = ys5Var5.f70400b0;
                                                        c0713b2.getClass();
                                                        ey5Var = c0713b2.f6403l;
                                                        c0aVar = new c0a(j);
                                                        if (ey5Var == null) {
                                                            dy5[] dy5VarArr = new dy5[i55];
                                                            dy5VarArr[z22 ? 1 : 0] = c0aVar;
                                                            ey5VarM11386a = new ey5(dy5VarArr);
                                                        } else {
                                                            dy5[] dy5VarArr2 = new dy5[i55];
                                                            dy5VarArr2[z22 ? 1 : 0] = c0aVar;
                                                            ey5VarM11386a = ey5Var.m11386a(dy5VarArr2);
                                                        }
                                                        lc3 lc3VarM2520a = ys5Var5.f70400b0.m2520a();
                                                        lc3VarM2520a.f49450k = ey5VarM11386a;
                                                        ys5Var5.f70400b0 = new C0713b(lc3VarM2520a);
                                                    }
                                                } else {
                                                    if (i56 < list5.size() - 1) {
                                                        ws5 ws5Var2 = (ws5) list5.get(i56 + 1);
                                                        j2 = (ws5Var2.f67251b + ws5Var2.f67252c) - (j15 + j14);
                                                        j3 = ws5Var2.f67250a - j13;
                                                    } else {
                                                        j2 = (j12 + j11) - (j15 + j14);
                                                        j3 = j9 - j13;
                                                    }
                                                    if (j3 > 0) {
                                                        double d2 = j2 / j3;
                                                        if (d2 > d) {
                                                            d = d2;
                                                            i57 = i56;
                                                        }
                                                    }
                                                    i56++;
                                                    j10 = j12;
                                                }
                                            }
                                            if (i57 == -1) {
                                                j = ((ws5) list5.get(i57 == true ? 1 : 0)).f67250a;
                                            }
                                            if (j != -9223372036854775807L) {
                                                C0713b c0713b3 = ys5Var5.f70400b0;
                                                c0713b3.getClass();
                                                ey5Var = c0713b3.f6403l;
                                                c0aVar = new c0a(j);
                                                if (ey5Var == null) {
                                                    dy5[] dy5VarArr3 = new dy5[i55];
                                                    dy5VarArr3[z22 ? 1 : 0] = c0aVar;
                                                    ey5VarM11386a = new ey5(dy5VarArr3);
                                                } else {
                                                    dy5[] dy5VarArr4 = new dy5[i55];
                                                    dy5VarArr4[z22 ? 1 : 0] = c0aVar;
                                                    ey5VarM11386a = ey5Var.m11386a(dy5VarArr4);
                                                }
                                                lc3 lc3VarM2520a2 = ys5Var5.f70400b0.m2520a();
                                                lc3VarM2520a2.f49450k = ey5VarM11386a;
                                                ys5Var5.f70400b0 = new C0713b(lc3VarM2520a2);
                                            }
                                        }
                                        j = -9223372036854775807L;
                                        if (j != -9223372036854775807L) {
                                            C0713b c0713b4 = ys5Var5.f70400b0;
                                            c0713b4.getClass();
                                            ey5Var = c0713b4.f6403l;
                                            c0aVar = new c0a(j);
                                            if (ey5Var == null) {
                                                dy5[] dy5VarArr5 = new dy5[i55];
                                                dy5VarArr5[z22 ? 1 : 0] = c0aVar;
                                                ey5VarM11386a = new ey5(dy5VarArr5);
                                            } else {
                                                dy5[] dy5VarArr6 = new dy5[i55];
                                                dy5VarArr6[z22 ? 1 : 0] = c0aVar;
                                                ey5VarM11386a = ey5Var.m11386a(dy5VarArr6);
                                            }
                                            lc3 lc3VarM2520a3 = ys5Var5.f70400b0.m2520a();
                                            lc3VarM2520a3.f49450k = ey5VarM11386a;
                                            ys5Var5.f70400b0 = new C0713b(lc3VarM2520a3);
                                        }
                                    }
                                    if (!ys5Var5.f70393W) {
                                        ys5Var5.f70398a0.getClass();
                                        n8a n8aVar2 = ys5Var5.f70398a0;
                                        C0713b c0713b5 = ys5Var5.f70400b0;
                                        c0713b5.getClass();
                                        n8aVar2.mo2537g(c0713b5);
                                    }
                                    i54 = i14 + 1;
                                    z3 = z22 ? 1 : 0;
                                    z4 = true;
                                }
                                zs5Var3.m25764k();
                                i5 = z3 ? 1 : 0;
                            }
                        } else if (!zs5Var3.f72107z) {
                            zs5Var3.m25761g(i20);
                            if (zs5Var3.f72050E != -9223372036854775807L && (i13 = zs5Var3.f72051F) != -1 && zs5Var3.f72052G != -1) {
                                List arrayList5 = (List) sparseArray.get(i13);
                                if (arrayList5 == null) {
                                    arrayList5 = new ArrayList();
                                    sparseArray.put(zs5Var3.f72051F, arrayList5);
                                }
                                arrayList5.add(new ws5(zs5Var3.f72050E, zs5Var3.f72100s + zs5Var3.f72052G, zs5Var3.f72053H));
                            }
                        }
                        i5 = 0;
                    } else if (zs5Var3.f72060O != 2) {
                        i5 = 0;
                    } else {
                        ys5 ys5Var6 = (ys5) sparseArray2.get(zs5Var3.f72066U);
                        ys5Var6.f70398a0.getClass();
                        if (zs5Var3.f72071Z > 0 && "A_OPUS".equals(ys5Var6.f70401c)) {
                            k47 k47Var3 = zs5Var3.f72097p;
                            byte[] bArrArray = ByteBuffer.allocate(8).order(ByteOrder.LITTLE_ENDIAN).putLong(zs5Var3.f72071Z).array();
                            k47Var3.getClass();
                            k47Var3.m14816K(bArrArray.length, bArrArray);
                        }
                        int i58 = 0;
                        for (int i59 = 0; i59 < zs5Var3.f72064S; i59++) {
                            i58 += zs5Var3.f72065T[i59];
                        }
                        int i60 = 0;
                        while (i60 < zs5Var3.f72064S) {
                            long j16 = zs5Var3.f72061P + ((long) ((ys5Var6.f70405f * i60) / DescriptorProtos.Edition.EDITION_2023_VALUE));
                            int i61 = zs5Var3.f72068W;
                            if (i60 == 0 && !zs5Var3.f72070Y) {
                                i61 |= 1;
                            }
                            int i62 = zs5Var3.f72065T[i60];
                            int i63 = i58 - i62;
                            zs5Var3.m25763i(ys5Var6, j16, i61, i62, i63);
                            i60++;
                            i58 = i63;
                        }
                        i5 = 0;
                        zs5Var3.f72060O = 0;
                    }
                    r2 = iy2Var;
                    i2 = i5;
                }
                z5 = true;
                r1 = r2;
                r4 = i2;
            }
            if (z5) {
                long position2 = r1.getPosition();
                zs5Var = this;
                if (zs5Var.f72055J) {
                    zs5Var.f72057L = position2;
                    n63Var.f52394a = zs5Var.f72056K;
                    zs5Var.f72055J = r4;
                    return 1;
                }
                z2 = true;
                if (zs5Var.f72107z) {
                    long j17 = zs5Var.f72057L;
                    if (j17 != -1) {
                        n63Var.f52394a = j17;
                        zs5Var.f72057L = -1L;
                        return 1;
                    }
                } else {
                    continue;
                }
            } else {
                z2 = true;
                zs5Var = this;
            }
            z4 = z2;
            z3 = false;
        }
        if (z5) {
            return 0;
        }
        int i64 = 0;
        while (true) {
            SparseArray sparseArray3 = zs5Var.f72076c;
            if (i64 >= sparseArray3.size()) {
                return -1;
            }
            ys5 ys5Var7 = (ys5) sparseArray3.valueAt(i64);
            ys5Var7.f70398a0.getClass();
            ica icaVar = ys5Var7.f70392V;
            if (icaVar != null) {
                icaVar.m13762a(ys5Var7.f70398a0, ys5Var7.f70410k);
            }
            i64++;
        }
    }

    @Override // p000.hy2
    /* JADX INFO: renamed from: c */
    public final boolean mo111c(iy2 iy2Var) throws EOFException, InterruptedIOException {
        ztb ztbVar = new ztb(8, (byte) 0);
        k47 k47Var = (k47) ztbVar.f72162c;
        h62 h62Var = (h62) iy2Var;
        long j = h62Var.f41832c;
        long j2 = 1024;
        if (j != -1 && j <= 1024) {
            j2 = j;
        }
        int i = (int) j2;
        h62Var.mo13076d(k47Var.f46700a, 0, 4, false);
        ztbVar.f72161b = 4;
        for (long jM14807B = k47Var.m14807B(); jM14807B != 440786851; jM14807B = ((long) (k47Var.f46700a[0] & 255)) | ((jM14807B << 8) & (-256))) {
            int i2 = ztbVar.f72161b + 1;
            ztbVar.f72161b = i2;
            if (i2 == i) {
                return false;
            }
            h62Var.mo13076d(k47Var.f46700a, 0, 1, false);
        }
        long jM25784f = ztbVar.m25784f(h62Var);
        long j3 = ztbVar.f72161b;
        if (jM25784f != Long.MIN_VALUE && (j == -1 || j3 + jM25784f < j)) {
            while (true) {
                long j4 = ztbVar.f72161b;
                long j5 = j3 + jM25784f;
                if (j4 < j5) {
                    if (ztbVar.m25784f(h62Var) == Long.MIN_VALUE) {
                        break;
                    }
                    long jM25784f2 = ztbVar.m25784f(h62Var);
                    if (jM25784f2 < 0 || jM25784f2 > 2147483647L) {
                        break;
                    }
                    if (jM25784f2 != 0) {
                        int i3 = (int) jM25784f2;
                        h62Var.m13081j(i3, false);
                        ztbVar.f72161b += i3;
                    }
                } else if (j4 == j5) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // p000.hy2
    /* JADX INFO: renamed from: d */
    public final void mo112d(long j, long j2) {
        this.f72058M = -9223372036854775807L;
        this.f72060O = 0;
        e62 e62Var = this.f72072a;
        e62Var.f36751e = 0;
        e62Var.f36748b.clear();
        doa doaVar = e62Var.f36749c;
        doaVar.f35972b = 0;
        doaVar.f35973c = 0;
        doa doaVar2 = this.f72074b;
        doaVar2.f35972b = 0;
        doaVar2.f35973c = 0;
        m25766m();
        this.f72049D = false;
        this.f72050E = -9223372036854775807L;
        this.f72051F = -1;
        this.f72052G = -1L;
        this.f72053H = -1L;
        if (!this.f72107z) {
            this.f72048C.clear();
        }
        int i = 0;
        while (true) {
            SparseArray sparseArray = this.f72076c;
            if (i >= sparseArray.size()) {
                return;
            }
            ica icaVar = ((ys5) sparseArray.valueAt(i)).f70392V;
            if (icaVar != null) {
                icaVar.f43940b = false;
                icaVar.f43941c = 0;
            }
            i++;
        }
    }

    @Override // p000.hy2
    /* JADX INFO: renamed from: f */
    public final void mo113f(jy2 jy2Var) {
        if (this.f72080e) {
            jy2Var = new nc0(jy2Var, this.f72082f);
        }
        this.f72091j0 = jy2Var;
    }

    /* JADX INFO: renamed from: g */
    public final void m25761g(int i) {
        if (this.f72049D) {
            return;
        }
        throw ParserException.m2516a(null, "Element " + i + " must be in a Cues");
    }

    /* JADX INFO: renamed from: h */
    public final void m25762h(int i) {
        if (this.f72106y != null) {
            return;
        }
        throw ParserException.m2516a(null, "Element " + i + " must be in a TrackEntry");
    }

    /* JADX INFO: renamed from: i */
    public final void m25763i(ys5 ys5Var, long j, int i, int i2, int i3) {
        byte[] bArrM25760j;
        int i4;
        int i5;
        ica icaVar = ys5Var.f70392V;
        if (icaVar != null) {
            icaVar.m13763b(ys5Var.f70398a0, j, i, i2, i3, ys5Var.f70410k);
        } else {
            if ("S_TEXT/UTF8".equals(ys5Var.f70401c) || "S_TEXT/ASS".equals(ys5Var.f70401c) || "S_TEXT/SSA".equals(ys5Var.f70401c) || "S_TEXT/WEBVTT".equals(ys5Var.f70401c)) {
                if (this.f72064S > 1) {
                    ss5.m21707d0("MatroskaExtractor", "Skipping subtitle sample in laced block.");
                } else {
                    long j2 = this.f72062Q;
                    if (j2 == -9223372036854775807L) {
                        ss5.m21707d0("MatroskaExtractor", "Skipping subtitle sample with no duration.");
                    } else {
                        String str = ys5Var.f70401c;
                        k47 k47Var = this.f72094m;
                        byte[] bArr = k47Var.f46700a;
                        str.getClass();
                        switch (str) {
                            case "S_TEXT/ASS":
                            case "S_TEXT/SSA":
                                bArrM25760j = m25760j(j2, 10000L, "%01d:%02d:%02d:%02d");
                                i4 = 21;
                                break;
                            case "S_TEXT/WEBVTT":
                                bArrM25760j = m25760j(j2, 1000L, "%02d:%02d:%02d.%03d");
                                i4 = 25;
                                break;
                            case "S_TEXT/UTF8":
                                bArrM25760j = m25760j(j2, 1000L, "%02d:%02d:%02d,%03d");
                                i4 = 19;
                                break;
                            default:
                                ij6.m13959q();
                                return;
                        }
                        System.arraycopy(bArrM25760j, 0, bArr, i4, bArrM25760j.length);
                        for (int i6 = k47Var.f46701b; i6 < k47Var.f46702c; i6++) {
                            if (k47Var.f46700a[i6] == 0) {
                                k47Var.m14817L(i6);
                                ys5Var.f70398a0.mo2535e(k47Var.f46702c, k47Var);
                                i5 = i2 + k47Var.f46702c;
                            }
                        }
                        ys5Var.f70398a0.mo2535e(k47Var.f46702c, k47Var);
                        i5 = i2 + k47Var.f46702c;
                    }
                }
                i5 = i2;
            } else {
                i5 = i2;
            }
            if ((i & 268435456) != 0) {
                int i7 = this.f72064S;
                k47 k47Var2 = this.f72097p;
                if (i7 > 1) {
                    k47Var2.m14815J(0);
                } else {
                    int i8 = k47Var2.f46702c;
                    ys5Var.f70398a0.mo2532b(k47Var2, i8, 2);
                    i5 += i8;
                }
            }
            ys5Var.f70398a0.mo2531a(j, i, i5, i3, ys5Var.f70410k);
        }
        this.f72059N = true;
    }

    /* JADX INFO: renamed from: k */
    public final void m25764k() {
        if (!this.f72105x) {
            return;
        }
        int i = 0;
        while (true) {
            SparseArray sparseArray = this.f72076c;
            if (i >= sparseArray.size()) {
                jy2 jy2Var = this.f72091j0;
                jy2Var.getClass();
                jy2Var.mo2551j();
                this.f72105x = false;
                return;
            }
            if (((ys5) sparseArray.valueAt(i)).f70393W) {
                return;
            } else {
                i++;
            }
        }
    }

    /* JADX INFO: renamed from: l */
    public final void m25765l(iy2 iy2Var, int i) {
        k47 k47Var = this.f72088i;
        if (k47Var.f46702c >= i) {
            return;
        }
        byte[] bArr = k47Var.f46700a;
        if (bArr.length < i) {
            k47Var.m14821c(Math.max(bArr.length * 2, i));
        }
        byte[] bArr2 = k47Var.f46700a;
        int i2 = k47Var.f46702c;
        iy2Var.readFully(bArr2, i2, i - i2);
        k47Var.m14817L(i);
    }

    /* JADX INFO: renamed from: m */
    public final void m25766m() {
        this.f72073a0 = 0;
        this.f72075b0 = 0;
        this.f72077c0 = 0;
        this.f72079d0 = false;
        this.f72081e0 = false;
        this.f72083f0 = false;
        this.f72085g0 = 0;
        this.f72087h0 = (byte) 0;
        this.f72089i0 = false;
        this.f72093l.m14815J(0);
    }

    /* JADX INFO: renamed from: n */
    public final long m25767n(long j) throws ParserException {
        long j2 = this.f72101t;
        if (j2 == -9223372036854775807L) {
            throw ParserException.m2516a(null, "Can't scale timecode prior to timecodeScale being set.");
        }
        String str = uma.f64080a;
        return uma.m22803H(j, j2, 1000L, RoundingMode.DOWN);
    }

    /* JADX WARN: Code duplicated, block: B:80:0x01df  */
    /* JADX INFO: renamed from: o */
    public final int m25768o(iy2 iy2Var, ys5 ys5Var, int i, boolean z) {
        int iMo2533c;
        int iMo2533c2;
        int i2;
        boolean z2;
        int i3;
        if ("S_TEXT/UTF8".equals(ys5Var.f70401c)) {
            m25769p(iy2Var, f72040k0, i);
            int i4 = this.f72075b0;
            m25766m();
            return i4;
        }
        if ("S_TEXT/ASS".equals(ys5Var.f70401c) || "S_TEXT/SSA".equals(ys5Var.f70401c)) {
            m25769p(iy2Var, f72042m0, i);
            int i5 = this.f72075b0;
            m25766m();
            return i5;
        }
        if ("S_TEXT/WEBVTT".equals(ys5Var.f70401c)) {
            m25769p(iy2Var, f72043n0, i);
            int i6 = this.f72075b0;
            m25766m();
            return i6;
        }
        int i7 = 2;
        if (ys5Var.f70393W) {
            ys5Var.f70400b0.getClass();
            k47 k47Var = new k47(i);
            if (iy2Var.mo13076d(k47Var.f46700a, 0, i, true)) {
                iy2Var.mo13080i();
                if (auc.m3074b(k47Var.m14825i()) == 1 && k47Var.m14820a() >= 10) {
                    byte[] bArr = new byte[10];
                    k47Var.m14827k(bArr, 0, 10);
                    k47Var.m14818M(0);
                    int iM3073a = auc.m3073a(bArr);
                    if (iM3073a > 0 && k47Var.m14820a() >= iM3073a + 4) {
                        k47Var.m14819N(iM3073a);
                        if (auc.m3074b(k47Var.m14829m()) == 2) {
                            lc3 lc3VarM2520a = ys5Var.f70400b0.m2520a();
                            lc3VarM2520a.f49453n = ez5.m11402l("audio/vnd.dts.hd");
                            ys5Var.f70400b0 = new C0713b(lc3VarM2520a);
                        }
                    }
                }
            }
            ys5Var.f70398a0.mo2537g(ys5Var.f70400b0);
            ys5Var.f70393W = false;
            m25764k();
        }
        n8a n8aVar = ys5Var.f70398a0;
        boolean z3 = this.f72079d0;
        k47 k47Var2 = this.f72093l;
        if (!z3) {
            boolean z4 = ys5Var.f70408i;
            k47 k47Var3 = this.f72088i;
            if (z4) {
                this.f72068W &= -1073741825;
                if (!this.f72081e0) {
                    iy2Var.readFully(k47Var3.f46700a, 0, 1);
                    this.f72073a0++;
                    byte b = k47Var3.f46700a[0];
                    if ((b & 128) == 128) {
                        throw ParserException.m2516a(null, "Extension bit is set in signal byte");
                    }
                    this.f72087h0 = b;
                    this.f72081e0 = true;
                }
                byte b2 = this.f72087h0;
                if ((b2 & 1) != 1) {
                    i2 = 2;
                } else {
                    boolean z5 = (b2 & 2) == 2;
                    this.f72068W |= 1073741824;
                    if (!this.f72089i0) {
                        k47 k47Var4 = this.f72095n;
                        iy2Var.readFully(k47Var4.f46700a, 0, 8);
                        this.f72073a0 += 8;
                        this.f72089i0 = true;
                        k47Var3.f46700a[0] = (byte) ((z5 ? 128 : 0) | 8);
                        k47Var3.m14818M(0);
                        n8aVar.mo2532b(k47Var3, 1, 1);
                        this.f72075b0++;
                        k47Var4.m14818M(0);
                        n8aVar.mo2532b(k47Var4, 8, 1);
                        this.f72075b0 += 8;
                    }
                    if (z5) {
                        if (!this.f72083f0) {
                            iy2Var.readFully(k47Var3.f46700a, 0, 1);
                            this.f72073a0++;
                            k47Var3.m14818M(0);
                            this.f72085g0 = k47Var3.m14842z();
                            this.f72083f0 = true;
                        }
                        int i8 = this.f72085g0 * 4;
                        k47Var3.m14815J(i8);
                        iy2Var.readFully(k47Var3.f46700a, 0, i8);
                        this.f72073a0 += i8;
                        short s = (short) ((this.f72085g0 / 2) + 1);
                        int i9 = (s * 6) + 2;
                        ByteBuffer byteBuffer = this.f72098q;
                        if (byteBuffer == null || byteBuffer.capacity() < i9) {
                            this.f72098q = ByteBuffer.allocate(i9);
                        }
                        this.f72098q.position(0);
                        this.f72098q.putShort(s);
                        int i10 = 0;
                        int i11 = 0;
                        while (true) {
                            i3 = this.f72085g0;
                            if (i10 >= i3) {
                                break;
                            }
                            int iM14809D = k47Var3.m14809D();
                            int i12 = i10 % 2;
                            int i13 = i7;
                            ByteBuffer byteBuffer2 = this.f72098q;
                            if (i12 == 0) {
                                byteBuffer2.putShort((short) (iM14809D - i11));
                            } else {
                                byteBuffer2.putInt(iM14809D - i11);
                            }
                            i10++;
                            i11 = iM14809D;
                            i7 = i13;
                        }
                        i2 = i7;
                        int i14 = (i - this.f72073a0) - i11;
                        int i15 = i3 % 2;
                        ByteBuffer byteBuffer3 = this.f72098q;
                        if (i15 == 1) {
                            byteBuffer3.putInt(i14);
                        } else {
                            byteBuffer3.putShort((short) i14);
                            this.f72098q.putInt(0);
                        }
                        byte[] bArrArray = this.f72098q.array();
                        k47 k47Var5 = this.f72096o;
                        k47Var5.m14816K(i9, bArrArray);
                        n8aVar.mo2532b(k47Var5, i9, 1);
                        this.f72075b0 += i9;
                    } else {
                        i2 = 2;
                    }
                }
            } else {
                i2 = 2;
                byte[] bArr2 = ys5Var.f70409j;
                if (bArr2 != null) {
                    k47Var2.m14816K(bArr2.length, bArr2);
                }
            }
            if ("A_OPUS".equals(ys5Var.f70401c)) {
                z2 = z;
            } else {
                z2 = ys5Var.f70406g > 0;
            }
            if (z2) {
                this.f72068W |= 268435456;
                this.f72097p.m14815J(0);
                int i16 = (k47Var2.f46702c + i) - this.f72073a0;
                k47Var3.m14815J(4);
                byte[] bArr3 = k47Var3.f46700a;
                bArr3[0] = (byte) ((i16 >> 24) & 255);
                bArr3[1] = (byte) ((i16 >> 16) & 255);
                bArr3[i2] = (byte) ((i16 >> 8) & 255);
                bArr3[3] = (byte) (i16 & 255);
                n8aVar.mo2532b(k47Var3, 4, i2);
                this.f72075b0 += 4;
            }
            this.f72079d0 = true;
        }
        int i17 = i + k47Var2.f46702c;
        if (!"V_MPEG4/ISO/AVC".equals(ys5Var.f70401c) && !"V_MPEGH/ISO/HEVC".equals(ys5Var.f70401c)) {
            if (ys5Var.f70392V != null) {
                bna.m3987z(k47Var2.f46702c == 0);
                ys5Var.f70392V.m13764c(iy2Var);
            }
            while (true) {
                int i18 = this.f72073a0;
                if (i18 >= i17) {
                    break;
                }
                int i19 = i17 - i18;
                int iM14820a = k47Var2.m14820a();
                if (iM14820a > 0) {
                    iMo2533c2 = Math.min(i19, iM14820a);
                    n8aVar.mo2535e(iMo2533c2, k47Var2);
                } else {
                    iMo2533c2 = n8aVar.mo2533c(iy2Var, i19, false);
                }
                this.f72073a0 += iMo2533c2;
                this.f72075b0 += iMo2533c2;
            }
        } else {
            k47 k47Var6 = this.f72086h;
            byte[] bArr4 = k47Var6.f46700a;
            bArr4[0] = 0;
            bArr4[1] = 0;
            bArr4[2] = 0;
            int i20 = ys5Var.f70402c0;
            int i21 = 4 - i20;
            while (this.f72073a0 < i17) {
                int i22 = this.f72077c0;
                if (i22 == 0) {
                    int iMin = Math.min(i20, k47Var2.m14820a());
                    iy2Var.readFully(bArr4, i21 + iMin, i20 - iMin);
                    if (iMin > 0) {
                        k47Var2.m14827k(bArr4, i21, iMin);
                    }
                    this.f72073a0 += i20;
                    k47Var6.m14818M(0);
                    this.f72077c0 = k47Var6.m14809D();
                    k47 k47Var7 = this.f72084g;
                    k47Var7.m14818M(0);
                    n8aVar.mo2535e(4, k47Var7);
                    this.f72075b0 += 4;
                } else {
                    int iM14820a2 = k47Var2.m14820a();
                    if (iM14820a2 > 0) {
                        iMo2533c = Math.min(i22, iM14820a2);
                        n8aVar.mo2535e(iMo2533c, k47Var2);
                    } else {
                        iMo2533c = n8aVar.mo2533c(iy2Var, i22, false);
                    }
                    this.f72073a0 += iMo2533c;
                    this.f72075b0 += iMo2533c;
                    this.f72077c0 -= iMo2533c;
                }
            }
        }
        if ("A_VORBIS".equals(ys5Var.f70401c)) {
            k47 k47Var8 = this.f72090j;
            k47Var8.m14818M(0);
            n8aVar.mo2535e(4, k47Var8);
            this.f72075b0 += 4;
        }
        int i23 = this.f72075b0;
        m25766m();
        return i23;
    }

    /* JADX INFO: renamed from: p */
    public final void m25769p(iy2 iy2Var, byte[] bArr, int i) {
        int length = bArr.length + i;
        k47 k47Var = this.f72094m;
        byte[] bArr2 = k47Var.f46700a;
        if (bArr2.length < length) {
            byte[] bArrCopyOf = Arrays.copyOf(bArr, length + i);
            k47Var.getClass();
            k47Var.m14816K(bArrCopyOf.length, bArrCopyOf);
        } else {
            System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
        }
        iy2Var.readFully(k47Var.f46700a, bArr.length, i);
        k47Var.m14818M(0);
        k47Var.m14817L(length);
    }
}
