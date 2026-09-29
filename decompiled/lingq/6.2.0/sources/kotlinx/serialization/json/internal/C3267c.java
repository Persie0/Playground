package kotlinx.serialization.json.internal;

import java.util.ArrayList;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.MissingFieldException;
import kotlinx.serialization.SerializationException;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.json.AbstractC3262b;
import kotlinx.serialization.json.C3263c;
import kotlinx.serialization.json.JsonDecodingException;
import p000.AbstractC3168k1;
import p000.AbstractC3695vr;
import p000.C0842cc;
import p000.C3488q8;
import p000.bq1;
import p000.d32;
import p000.df1;
import p000.df4;
import p000.fa4;
import p000.ho5;
import p000.kf4;
import p000.kk9;
import p000.mfc;
import p000.nk9;
import p000.p84;
import p000.pf4;
import p000.pfa;
import p000.qf4;
import p000.sf4;
import p000.sfc;
import p000.sg3;
import p000.u8d;
import p000.u91;
import p000.ux5;
import p000.vk9;
import p000.w41;
import p000.xgd;
import p000.xo2;
import p000.y38;
import p000.zi3;

/* JADX INFO: renamed from: kotlinx.serialization.json.internal.c */
/* JADX INFO: loaded from: classes.dex */
public final class C3267c extends bq1 implements pf4 {

    /* JADX INFO: renamed from: K */
    public final df4 f48259K;

    /* JADX INFO: renamed from: L */
    public final WriteMode f48260L;

    /* JADX INFO: renamed from: M */
    public final C3488q8 f48261M;

    /* JADX INFO: renamed from: N */
    public final w41 f48262N;

    /* JADX INFO: renamed from: O */
    public int f48263O;

    /* JADX INFO: renamed from: P */
    public C0842cc f48264P;

    /* JADX INFO: renamed from: Q */
    public final kf4 f48265Q;

    /* JADX INFO: renamed from: R */
    public final C3265a f48266R;

    public C3267c(df4 df4Var, WriteMode writeMode, C3488q8 c3488q8, SerialDescriptor serialDescriptor, C0842cc c0842cc) {
        writeMode.getClass();
        serialDescriptor.getClass();
        this.f48259K = df4Var;
        this.f48260L = writeMode;
        this.f48261M = c3488q8;
        this.f48262N = df4Var.f35561b;
        this.f48263O = -1;
        this.f48264P = c0842cc;
        kf4 kf4Var = df4Var.f35560a;
        this.f48265Q = kf4Var;
        this.f48266R = kf4Var.f47128d ? null : new C3265a(serialDescriptor);
    }

    @Override // p000.df1
    /* JADX INFO: renamed from: A */
    public final int mo10319A(SerialDescriptor serialDescriptor) {
        char c;
        C3488q8 c3488q8 = this.f48261M;
        sg3 sg3Var = (sg3) c3488q8.f57370d;
        serialDescriptor.getClass();
        int[] iArr = kk9.f47457a;
        WriteMode writeMode = this.f48260L;
        int i = iArr[writeMode.ordinal()];
        char c2 = ':';
        boolean zM19729O = false;
        int i2 = 0;
        zM19729O = false;
        byte b = 1;
        int i3 = -1;
        if (i == 2) {
            int i4 = this.f48263O;
            boolean z = i4 % 2 != 0;
            if (!z) {
                c3488q8.m19741i(':');
            } else if (i4 != -1) {
                zM19729O = c3488q8.m19729O();
            }
            if (c3488q8.m19735c()) {
                if (z) {
                    int i5 = this.f48263O;
                    int i6 = c3488q8.f57368b;
                    if (i5 == -1) {
                        if (zM19729O) {
                            C3488q8.m19714s(c3488q8, "Unexpected leading comma", i6, null, 4);
                            throw null;
                        }
                    } else if (!zM19729O) {
                        C3488q8.m19714s(c3488q8, "Expected comma after the key-value pair", i6, null, 4);
                        throw null;
                    }
                }
                i3 = this.f48263O + 1;
                this.f48263O = i3;
            } else if (zM19729O) {
                fa4.m11662x(c3488q8, "object");
                throw null;
            }
        } else if (i != 4) {
            boolean zM19729O2 = c3488q8.m19729O();
            if (c3488q8.m19735c()) {
                int i7 = this.f48263O;
                if (i7 != -1 && !zM19729O2) {
                    C3488q8.m19714s(c3488q8, "Expected end of the array or comma", 0, null, 6);
                    throw null;
                }
                i3 = i7 + 1;
                this.f48263O = i3;
            } else if (zM19729O2) {
                fa4.m11662x(c3488q8, "array");
                throw null;
            }
        } else {
            boolean zM19729O3 = c3488q8.m19729O();
            while (true) {
                boolean zM19735c = c3488q8.m19735c();
                C3265a c3265a = this.f48266R;
                if (zM19735c) {
                    boolean z2 = this.f48265Q.f47127c;
                    String strM19746n = z2 ? c3488q8.m19746n() : c3488q8.m19738f();
                    c3488q8.m19741i(c2);
                    df4 df4Var = this.f48259K;
                    byte b2 = b;
                    int iM23505p = AbstractC3695vr.m23505p(serialDescriptor, df4Var, strM19746n);
                    if (iM23505p != -3) {
                        if (c3265a != null) {
                            xo2 xo2Var = c3265a.f48254a;
                            if (iM23505p < 64) {
                                xo2Var.f68425a |= 1 << iM23505p;
                            } else {
                                int i8 = (iM23505p >>> 6) - 1;
                                long[] jArr = (long[]) xo2Var.f68428d;
                                jArr[i8] = jArr[i8] | (1 << (iM23505p & 63));
                            }
                        }
                        i3 = iM23505p;
                        break;
                    }
                    if (!AbstractC3695vr.m23509t(df4Var, serialDescriptor)) {
                        C0842cc c0842cc = this.f48264P;
                        if (c0842cc == null || !fa4.m11650l(c0842cc.f9872b, strM19746n)) {
                            int i9 = sg3Var.f60816b;
                            int[] iArr2 = (int[]) sg3Var.f60819e;
                            if (iArr2[i9] == -2) {
                                iArr2[i9] = -1;
                                sg3Var.f60816b = i9 - 1;
                            }
                            int i10 = sg3Var.f60816b;
                            if (i10 != -1) {
                                sg3Var.f60816b = i10 - 1;
                            }
                            c3488q8.m19750r(ux5.m22986i('\'', "Encountered an unknown key '", strM19746n), vk9.m23394q0(((String) c3488q8.f57373g).subSequence(0, c3488q8.f57368b).toString(), 6, strM19746n), "Use 'ignoreUnknownKeys = true' in 'Json {}' builder or '@JsonIgnoreUnknownKeys' annotation to ignore unknown keys.");
                            throw null;
                        }
                        c0842cc.f9872b = null;
                    }
                    ArrayList arrayList = new ArrayList();
                    byte bM19718D = c3488q8.m19718D();
                    if (bM19718D == 8 || bM19718D == 6) {
                        while (true) {
                            byte bM19718D2 = c3488q8.m19718D();
                            if (bM19718D2 != b2) {
                                c = 6;
                                if (bM19718D2 == 8 || bM19718D2 == 6) {
                                    arrayList.add(Byte.valueOf(bM19718D2));
                                } else if (bM19718D2 == 9) {
                                    if (((Number) u91.m22597O0(arrayList)).byteValue() != 8) {
                                        C3488q8.m19714s(c3488q8, "found ] instead of }", 0, null, 6);
                                        throw null;
                                    }
                                    u91.m22608Z0(arrayList);
                                } else if (bM19718D2 == 7) {
                                    if (((Number) u91.m22597O0(arrayList)).byteValue() != 6) {
                                        C3488q8.m19714s(c3488q8, "found } instead of ]", 0, null, 6);
                                        throw null;
                                    }
                                    u91.m22608Z0(arrayList);
                                } else if (bM19718D2 == 10) {
                                    C3488q8.m19714s(c3488q8, "Unexpected end of input due to malformed JSON during ignoring unknown keys", 0, null, 6);
                                    throw null;
                                }
                                c3488q8.m19739g();
                                if (arrayList.size() == 0) {
                                    break;
                                }
                            } else if (z2) {
                                c3488q8.m19745m();
                            } else {
                                c3488q8.m19738f();
                            }
                            b2 = 1;
                        }
                    } else {
                        c3488q8.m19745m();
                        c = 6;
                    }
                    zM19729O3 = c3488q8.m19729O();
                    c2 = ':';
                    b = 1;
                } else if (!zM19729O3) {
                    if (c3265a == null) {
                        break;
                    }
                    xo2 xo2Var2 = c3265a.f48254a;
                    zi3 zi3Var = (zi3) xo2Var2.f68427c;
                    SerialDescriptor serialDescriptor2 = (SerialDescriptor) xo2Var2.f68426b;
                    int iMo3697e = serialDescriptor2.mo3697e();
                    while (true) {
                        long j = xo2Var2.f68425a;
                        long j2 = -1;
                        if (j == -1) {
                            if (iMo3697e <= 64) {
                                break;
                            }
                            long[] jArr2 = (long[]) xo2Var2.f68428d;
                            int length = jArr2.length;
                            loop3: while (i2 < length) {
                                int i11 = i2 + 1;
                                int i12 = i11 * 64;
                                long j3 = jArr2[i2];
                                while (true) {
                                    if (j3 != j2) {
                                        int iNumberOfTrailingZeros = Long.numberOfTrailingZeros(~j3);
                                        j3 |= 1 << iNumberOfTrailingZeros;
                                        int i13 = iNumberOfTrailingZeros + i12;
                                        if (((Boolean) ((JsonElementMarker$origin$1) zi3Var).invoke(serialDescriptor2, Integer.valueOf(i13))).booleanValue()) {
                                            jArr2[i2] = j3;
                                            i3 = i13;
                                            break;
                                        }
                                        j2 = -1;
                                    } else {
                                        jArr2[i2] = j3;
                                        i2 = i11;
                                        j2 = -1;
                                    }
                                }
                            }
                            break;
                        }
                        int iNumberOfTrailingZeros2 = Long.numberOfTrailingZeros(~j);
                        xo2Var2.f68425a |= 1 << iNumberOfTrailingZeros2;
                        if (((Boolean) ((JsonElementMarker$origin$1) zi3Var).invoke(serialDescriptor2, Integer.valueOf(iNumberOfTrailingZeros2))).booleanValue()) {
                            i3 = iNumberOfTrailingZeros2;
                            break;
                        }
                    }
                } else {
                    fa4.m11662x(c3488q8, "object");
                    throw null;
                }
            }
        }
        if (writeMode != WriteMode.MAP) {
            ((int[]) sg3Var.f60819e)[sg3Var.f60816b] = i3;
        }
        return i3;
    }

    @Override // p000.pf4
    /* JADX INFO: renamed from: C */
    public final df4 mo15627C() {
        return this.f48259K;
    }

    @Override // p000.bq1, kotlinx.serialization.encoding.Decoder
    /* JADX INFO: renamed from: E */
    public final Decoder mo4071E(SerialDescriptor serialDescriptor) {
        serialDescriptor.getClass();
        return nk9.m17482b(serialDescriptor) ? new qf4(this.f48261M, this.f48259K) : this;
    }

    @Override // p000.bq1, p000.df1
    /* JADX INFO: renamed from: G */
    public final Object mo4073G(SerialDescriptor serialDescriptor, int i, KSerializer kSerializer, Object obj) {
        sg3 sg3Var = (sg3) this.f48261M.f57370d;
        serialDescriptor.getClass();
        kSerializer.getClass();
        boolean z = this.f48260L == WriteMode.MAP && (i & 1) == 0;
        if (z) {
            int[] iArr = (int[]) sg3Var.f60819e;
            int i2 = sg3Var.f60816b;
            if (iArr[i2] == -2) {
                ((Object[]) sg3Var.f60818d)[i2] = ho5.f42704h;
            }
        }
        Object objMo15604w = mo15604w(kSerializer);
        if (z) {
            int[] iArr2 = (int[]) sg3Var.f60819e;
            int i3 = sg3Var.f60816b;
            if (iArr2[i3] != -2) {
                int i4 = i3 + 1;
                sg3Var.f60816b = i4;
                if (i4 == ((Object[]) sg3Var.f60818d).length) {
                    sg3Var.m21360l();
                }
            }
            Object[] objArr = (Object[]) sg3Var.f60818d;
            int i5 = sg3Var.f60816b;
            objArr[i5] = ((kf4) sg3Var.f60817c).f47133i ? objMo15604w : p84.f55745g;
            ((int[]) sg3Var.f60819e)[i5] = -2;
        }
        return objMo15604w;
    }

    @Override // p000.bq1, kotlinx.serialization.encoding.Decoder
    /* JADX INFO: renamed from: H */
    public final byte mo4074H() {
        C3488q8 c3488q8 = this.f48261M;
        long jM19742j = c3488q8.m19742j();
        byte b = (byte) jM19742j;
        if (jM19742j == b) {
            return b;
        }
        C3488q8.m19714s(c3488q8, "Failed to parse byte for input '" + jM19742j + '\'', 0, null, 6);
        throw null;
    }

    @Override // p000.bq1, kotlinx.serialization.encoding.Decoder
    /* JADX INFO: renamed from: I */
    public final short mo4075I() {
        C3488q8 c3488q8 = this.f48261M;
        long jM19742j = c3488q8.m19742j();
        short s = (short) jM19742j;
        if (jM19742j == s) {
            return s;
        }
        C3488q8.m19714s(c3488q8, "Failed to parse short for input '" + jM19742j + '\'', 0, null, 6);
        throw null;
    }

    @Override // p000.bq1, kotlinx.serialization.encoding.Decoder
    /* JADX INFO: renamed from: J */
    public final float mo4076J() {
        C3488q8 c3488q8 = this.f48261M;
        String strM19745m = c3488q8.m19745m();
        try {
            float f = Float.parseFloat(strM19745m);
            if (Math.abs(f) <= Float.MAX_VALUE) {
                return f;
            }
            C3488q8.m19714s(c3488q8, fa4.m11628B(Float.valueOf(f), null), 0, "It is possible to deserialize them using 'JsonBuilder.allowSpecialFloatingPointValues = true'", 2);
            throw null;
        } catch (IllegalArgumentException unused) {
            C3488q8.m19714s(c3488q8, ux5.m22986i('\'', "Failed to parse type 'float' for input '", strM19745m), 0, null, 6);
            throw null;
        }
    }

    @Override // p000.bq1, kotlinx.serialization.encoding.Decoder
    /* JADX INFO: renamed from: M */
    public final double mo4078M() {
        C3488q8 c3488q8 = this.f48261M;
        String strM19745m = c3488q8.m19745m();
        try {
            double d = Double.parseDouble(strM19745m);
            if (Math.abs(d) <= Double.MAX_VALUE) {
                return d;
            }
            C3488q8.m19714s(c3488q8, fa4.m11628B(Double.valueOf(d), null), 0, "It is possible to deserialize them using 'JsonBuilder.allowSpecialFloatingPointValues = true'", 2);
            throw null;
        } catch (IllegalArgumentException unused) {
            C3488q8.m19714s(c3488q8, ux5.m22986i('\'', "Failed to parse type 'double' for input '", strM19745m), 0, null, 6);
            throw null;
        }
    }

    @Override // kotlinx.serialization.encoding.Decoder, p000.df1
    /* JADX INFO: renamed from: a */
    public final w41 mo10320a() {
        return this.f48262N;
    }

    @Override // p000.bq1, kotlinx.serialization.encoding.Decoder
    /* JADX INFO: renamed from: b */
    public final df1 mo4079b(SerialDescriptor serialDescriptor) {
        serialDescriptor.getClass();
        df4 df4Var = this.f48259K;
        WriteMode writeModeM19113c = pfa.m19113c(df4Var, serialDescriptor);
        C3488q8 c3488q8 = this.f48261M;
        sg3 sg3Var = (sg3) c3488q8.f57370d;
        sg3Var.getClass();
        int i = sg3Var.f60816b + 1;
        sg3Var.f60816b = i;
        if (i == ((Object[]) sg3Var.f60818d).length) {
            sg3Var.m21360l();
        }
        ((Object[]) sg3Var.f60818d)[i] = serialDescriptor;
        c3488q8.m19741i(writeModeM19113c.begin);
        if (c3488q8.m19718D() == 4) {
            C3488q8.m19714s(c3488q8, "Unexpected leading comma", 0, null, 6);
            throw null;
        }
        int i2 = kk9.f47457a[writeModeM19113c.ordinal()];
        if (i2 == 1 || i2 == 2 || i2 == 3) {
            return new C3267c(df4Var, writeModeM19113c, c3488q8, serialDescriptor, this.f48264P);
        }
        return (this.f48260L == writeModeM19113c && df4Var.f35560a.f47128d) ? this : new C3267c(df4Var, writeModeM19113c, c3488q8, serialDescriptor, this.f48264P);
    }

    @Override // p000.bq1, kotlinx.serialization.encoding.Decoder
    /* JADX INFO: renamed from: e */
    public final boolean mo4082e() {
        boolean z;
        boolean z2;
        C3488q8 c3488q8 = this.f48261M;
        int iM19728N = c3488q8.m19728N();
        String str = (String) c3488q8.f57373g;
        if (iM19728N == str.length()) {
            C3488q8.m19714s(c3488q8, "EOF", 0, null, 6);
            throw null;
        }
        if (str.charAt(iM19728N) == '\"') {
            iM19728N++;
            z = true;
        } else {
            z = false;
        }
        int iM19722H = c3488q8.m19722H(iM19728N);
        if (iM19722H >= str.length() || iM19722H == -1) {
            C3488q8.m19714s(c3488q8, "EOF", 0, null, 6);
            throw null;
        }
        int i = iM19722H + 1;
        int iCharAt = str.charAt(iM19722H) | ' ';
        if (iCharAt == 102) {
            c3488q8.m19737e(i, "alse");
            z2 = false;
        } else {
            if (iCharAt != 116) {
                C3488q8.m19714s(c3488q8, "Expected valid boolean literal prefix, but had '" + c3488q8.m19745m() + '\'', 0, null, 6);
                throw null;
            }
            c3488q8.m19737e(i, "rue");
            z2 = true;
        }
        if (!z) {
            return z2;
        }
        if (c3488q8.f57368b == str.length()) {
            C3488q8.m19714s(c3488q8, "EOF", 0, null, 6);
            throw null;
        }
        if (str.charAt(c3488q8.f57368b) == '\"') {
            c3488q8.f57368b++;
            return z2;
        }
        C3488q8.m19714s(c3488q8, "Expected closing quotation mark", 0, null, 6);
        throw null;
    }

    @Override // p000.bq1, kotlinx.serialization.encoding.Decoder
    /* JADX INFO: renamed from: f */
    public final char mo4083f() {
        C3488q8 c3488q8 = this.f48261M;
        String strM19745m = c3488q8.m19745m();
        if (strM19745m.length() == 1) {
            return strM19745m.charAt(0);
        }
        C3488q8.m19714s(c3488q8, ux5.m22986i('\'', "Expected single char, but got '", strM19745m), 0, null, 6);
        throw null;
    }

    @Override // p000.bq1, kotlinx.serialization.encoding.Decoder
    /* JADX INFO: renamed from: h */
    public final int mo4084h(SerialDescriptor serialDescriptor) {
        serialDescriptor.getClass();
        return AbstractC3695vr.m23506q(serialDescriptor, this.f48259K, mo4092s(), " at path ".concat(((sg3) this.f48261M.f57370d).m21355g()));
    }

    @Override // p000.bq1, p000.df1
    /* JADX INFO: renamed from: j */
    public final void mo4086j(SerialDescriptor serialDescriptor) {
        serialDescriptor.getClass();
        if (serialDescriptor.mo3697e() == 0 && AbstractC3695vr.m23509t(this.f48259K, serialDescriptor)) {
            while (mo10319A(serialDescriptor) != -1) {
            }
        }
        C3488q8 c3488q8 = this.f48261M;
        if (c3488q8.m19729O()) {
            fa4.m11662x(c3488q8, "");
            throw null;
        }
        c3488q8.m19741i(this.f48260L.end);
        sg3 sg3Var = (sg3) c3488q8.f57370d;
        int i = sg3Var.f60816b;
        int[] iArr = (int[]) sg3Var.f60819e;
        if (iArr[i] == -2) {
            iArr[i] = -1;
            sg3Var.f60816b = i - 1;
        }
        int i2 = sg3Var.f60816b;
        if (i2 != -1) {
            sg3Var.f60816b = i2 - 1;
        }
    }

    @Override // p000.pf4
    /* JADX INFO: renamed from: l */
    public final AbstractC3262b mo15628l() {
        return new C3266b(this.f48259K.f35560a, this.f48261M).m15624b();
    }

    @Override // p000.bq1, kotlinx.serialization.encoding.Decoder
    /* JADX INFO: renamed from: n */
    public final int mo4089n() {
        C3488q8 c3488q8 = this.f48261M;
        long jM19742j = c3488q8.m19742j();
        int i = (int) jM19742j;
        if (jM19742j == i) {
            return i;
        }
        C3488q8.m19714s(c3488q8, "Failed to parse int for input '" + jM19742j + '\'', 0, null, 6);
        throw null;
    }

    @Override // p000.bq1, kotlinx.serialization.encoding.Decoder
    /* JADX INFO: renamed from: s */
    public final String mo4092s() {
        boolean z = this.f48265Q.f47127c;
        C3488q8 c3488q8 = this.f48261M;
        return z ? c3488q8.m19746n() : c3488q8.m19744l();
    }

    @Override // p000.bq1, kotlinx.serialization.encoding.Decoder
    /* JADX INFO: renamed from: u */
    public final long mo4093u() {
        return this.f48261M.m19742j();
    }

    /* JADX WARN: Code duplicated, block: B:49:0x014f  */
    /* JADX WARN: Code duplicated, block: B:50:0x0150  */
    /* JADX WARN: Instruction removed from duplicated block: B:50:0x0150, please report this as an issue */
    @Override // kotlinx.serialization.encoding.Decoder
    /* JADX INFO: renamed from: w */
    public final Object mo15604w(KSerializer kSerializer) {
        String message;
        df4 df4Var = this.f48259K;
        C3488q8 c3488q8 = this.f48261M;
        sg3 sg3Var = (sg3) c3488q8.f57370d;
        kSerializer.getClass();
        try {
            if (!(kSerializer instanceof AbstractC3168k1)) {
                return kSerializer.deserialize(this);
            }
            String strM16808c = mfc.m16808c(df4Var, ((AbstractC3168k1) kSerializer).getDescriptor());
            String strM19717C = c3488q8.m19717C(strM16808c, this.f48265Q.f47127c);
            if (strM19717C == null) {
                String strM16808c2 = mfc.m16808c(df4Var, ((AbstractC3168k1) kSerializer).getDescriptor());
                AbstractC3262b abstractC3262bMo15628l = mo15628l();
                String strMo3694a = ((AbstractC3168k1) kSerializer).getDescriptor().mo3694a();
                if (abstractC3262bMo15628l instanceof C3263c) {
                    C3263c c3263c = (C3263c) abstractC3262bMo15628l;
                    AbstractC3262b abstractC3262b = (AbstractC3262b) c3263c.get(strM16808c2);
                    try {
                        return u8d.m22578b(df4Var, strM16808c2, c3263c, sfc.m21342a((AbstractC3168k1) kSerializer, this, abstractC3262b != null ? sf4.m21337d(sf4.m21339f(abstractC3262b)) : null));
                    } catch (SerializationException e) {
                        String message2 = e.getMessage();
                        message2.getClass();
                        throw new JsonDecodingException(fa4.m11656r(-1, message2, null, null, df4Var.f35560a.f47133i ? fa4.m11627A(c3263c.toString(), -1).toString() : null), message2);
                    }
                }
                String str = "Expected " + y38.m24933a(C3263c.class).m25414c() + ", but had " + y38.m24933a(abstractC3262bMo15628l.getClass()).m25414c() + " as the serialized body of " + strMo3694a;
                throw new JsonDecodingException(fa4.m11656r(-1, str, sg3Var.m21355g(), null, df4Var.f35560a.f47133i ? fa4.m11627A(abstractC3262bMo15628l.toString(), -1).toString() : null), str);
            }
            try {
                KSerializer kSerializerM21342a = sfc.m21342a((AbstractC3168k1) kSerializer, this, strM19717C);
                C0842cc c0842cc = new C0842cc(4);
                c0842cc.f9872b = strM16808c;
                this.f48264P = c0842cc;
                return kSerializerM21342a.deserialize(this);
            } catch (SerializationException e2) {
                String message3 = e2.getMessage();
                message3.getClass();
                String strM23370F0 = vk9.m23370F0(message3, '\n');
                if (vk9.m23383f0(strM23370F0, ".")) {
                    strM23370F0 = strM23370F0.substring(0, strM23370F0.length() - ".".length());
                }
                String message4 = e2.getMessage();
                message4.getClass();
                String strSubstring = "";
                int iM23388k0 = vk9.m23388k0(message4, '\n', 0, 6);
                if (iM23388k0 != -1) {
                    strSubstring = message4.substring(iM23388k0 + 1, message4.length());
                }
                C3488q8.m19714s(c3488q8, strM23370F0, 0, strSubstring, 2);
                throw null;
            }
            message = e.getMessage();
            message.getClass();
            if (vk9.m23380c0(message, "at path", false)) {
                throw e;
            }
            throw xgd.m24514a(e, e.getMessage() + " at path: " + sg3Var.m21355g());
        } catch (MissingFieldException e3) {
            message = e3.getMessage();
            message.getClass();
            if (vk9.m23380c0(message, "at path", false)) {
                throw e3;
            }
            throw xgd.m24514a(e3, e3.getMessage() + " at path: " + sg3Var.m21355g());
        }
    }

    @Override // p000.bq1, kotlinx.serialization.encoding.Decoder
    /* JADX INFO: renamed from: y */
    public final boolean mo4098y() {
        boolean z;
        C3265a c3265a = this.f48266R;
        if (!(c3265a != null ? c3265a.f48255b : false)) {
            C3488q8 c3488q8 = this.f48261M;
            int iM19722H = c3488q8.m19722H(c3488q8.m19728N());
            String str = (String) c3488q8.f57373g;
            int length = str.length() - iM19722H;
            if (length >= 4 && iM19722H != -1) {
                int i = 0;
                while (true) {
                    if (i >= 4) {
                        if (length <= 4 || d32.m10008F(str.charAt(iM19722H + 4)) != 0) {
                            c3488q8.f57368b = iM19722H + 4;
                            z = true;
                            break;
                        }
                    } else if ("null".charAt(i) == str.charAt(iM19722H + i)) {
                        i++;
                    }
                    z = false;
                    break;
                }
            } else {
                z = false;
                break;
            }
            if (!z) {
                return true;
            }
        }
        return false;
    }
}
