package p000;

import kotlinx.serialization.descriptors.SerialDescriptor;

/* JADX INFO: loaded from: classes3.dex */
public final class qf4 extends bq1 {

    /* JADX INFO: renamed from: K */
    public final C3488q8 f57690K;

    /* JADX INFO: renamed from: L */
    public final w41 f57691L;

    public qf4(C3488q8 c3488q8, df4 df4Var) {
        df4Var.getClass();
        this.f57690K = c3488q8;
        this.f57691L = df4Var.f35561b;
    }

    @Override // p000.df1
    /* JADX INFO: renamed from: A */
    public final int mo10319A(SerialDescriptor serialDescriptor) {
        serialDescriptor.getClass();
        throw new IllegalStateException("unsupported");
    }

    @Override // p000.bq1, kotlinx.serialization.encoding.Decoder
    /* JADX INFO: renamed from: H */
    public final byte mo4074H() {
        eea eeaVar;
        C3488q8 c3488q8 = this.f57690K;
        String strM19745m = c3488q8.m19745m();
        try {
            strM19745m.getClass();
            jea jeaVarM355e = afa.m355e(strM19745m);
            if (jeaVarM355e != null) {
                int i = jeaVarM355e.f45490a;
                eeaVar = Integer.compareUnsigned(i, 255) > 0 ? null : new eea((byte) i);
            }
            if (eeaVar != null) {
                return eeaVar.f37135a;
            }
            cl9.m4835R(strM19745m);
            throw null;
        } catch (IllegalArgumentException unused) {
            C3488q8.m19714s(c3488q8, ux5.m22986i('\'', "Failed to parse type 'UByte' for input '", strM19745m), 0, null, 6);
            throw null;
        }
    }

    @Override // p000.bq1, kotlinx.serialization.encoding.Decoder
    /* JADX INFO: renamed from: I */
    public final short mo4075I() {
        vea veaVar;
        C3488q8 c3488q8 = this.f57690K;
        String strM19745m = c3488q8.m19745m();
        try {
            strM19745m.getClass();
            jea jeaVarM355e = afa.m355e(strM19745m);
            if (jeaVarM355e != null) {
                int i = jeaVarM355e.f45490a;
                veaVar = Integer.compareUnsigned(i, 65535) > 0 ? null : new vea((short) i);
            }
            if (veaVar != null) {
                return veaVar.f65284a;
            }
            cl9.m4835R(strM19745m);
            throw null;
        } catch (IllegalArgumentException unused) {
            C3488q8.m19714s(c3488q8, ux5.m22986i('\'', "Failed to parse type 'UShort' for input '", strM19745m), 0, null, 6);
            throw null;
        }
    }

    @Override // kotlinx.serialization.encoding.Decoder, p000.df1
    /* JADX INFO: renamed from: a */
    public final w41 mo10320a() {
        return this.f57691L;
    }

    @Override // p000.bq1, kotlinx.serialization.encoding.Decoder
    /* JADX INFO: renamed from: n */
    public final int mo4089n() {
        C3488q8 c3488q8 = this.f57690K;
        String strM19745m = c3488q8.m19745m();
        try {
            strM19745m.getClass();
            jea jeaVarM355e = afa.m355e(strM19745m);
            if (jeaVarM355e != null) {
                return jeaVarM355e.f45490a;
            }
            cl9.m4835R(strM19745m);
            throw null;
        } catch (IllegalArgumentException unused) {
            C3488q8.m19714s(c3488q8, ux5.m22986i('\'', "Failed to parse type 'UInt' for input '", strM19745m), 0, null, 6);
            throw null;
        }
    }

    @Override // p000.bq1, kotlinx.serialization.encoding.Decoder
    /* JADX INFO: renamed from: u */
    public final long mo4093u() {
        C3488q8 c3488q8 = this.f57690K;
        String strM19745m = c3488q8.m19745m();
        try {
            strM19745m.getClass();
            oea oeaVarM356f = afa.m356f(strM19745m);
            if (oeaVarM356f != null) {
                return oeaVarM356f.f54251a;
            }
            cl9.m4835R(strM19745m);
            throw null;
        } catch (IllegalArgumentException unused) {
            C3488q8.m19714s(c3488q8, ux5.m22986i('\'', "Failed to parse type 'ULong' for input '", strM19745m), 0, null, 6);
            throw null;
        }
    }
}
