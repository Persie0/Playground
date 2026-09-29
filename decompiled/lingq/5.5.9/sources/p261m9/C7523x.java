package p261m9;

import java.io.IOException;

/* JADX INFO: renamed from: m9.x */
/* JADX INFO: loaded from: classes.dex */
public final class C7523x {

    /* JADX INFO: renamed from: a */
    public final byte[] f41528a = new byte[10];

    /* JADX INFO: renamed from: b */
    public boolean f41529b;

    /* JADX INFO: renamed from: c */
    public int f41530c;

    /* JADX INFO: renamed from: d */
    public long f41531d;

    /* JADX INFO: renamed from: e */
    public int f41532e;

    /* JADX INFO: renamed from: f */
    public int f41533f;

    /* JADX INFO: renamed from: g */
    public int f41534g;

    /* JADX INFO: renamed from: a */
    public final void m15023a(InterfaceC7522w interfaceC7522w, InterfaceC7522w.a aVar) {
        if (this.f41530c > 0) {
            interfaceC7522w.mo7387e(this.f41531d, this.f41532e, this.f41533f, this.f41534g, aVar);
            this.f41530c = 0;
        }
    }

    /* JADX INFO: renamed from: b */
    public final void m15024b(InterfaceC7522w interfaceC7522w, long j10, int i10, int i11, int i12, InterfaceC7522w.a aVar) {
        if (!(this.f41534g <= i11 + i12)) {
            throw new IllegalStateException("TrueHD chunk samples must be contiguous in the sample queue.");
        }
        if (this.f41529b) {
            int i13 = this.f41530c;
            int i14 = i13 + 1;
            this.f41530c = i14;
            if (i13 == 0) {
                this.f41531d = j10;
                this.f41532e = i10;
                this.f41533f = 0;
            }
            this.f41533f += i11;
            this.f41534g = i12;
            if (i14 >= 16) {
                m15023a(interfaceC7522w, aVar);
            }
        }
    }

    /* JADX INFO: renamed from: c */
    public final void m15025c(InterfaceC7508i interfaceC7508i) throws IOException {
        if (this.f41529b) {
            return;
        }
        byte[] bArr = this.f41528a;
        int i10 = 0;
        interfaceC7508i.mo14999l(bArr, 0, 10);
        interfaceC7508i.mo14997i();
        if (bArr[4] == -8 && bArr[5] == 114 && bArr[6] == 111) {
            byte b10 = bArr[7];
            if ((b10 & 254) == 186) {
                if ((b10 & 255) == 187) {
                    i10 = 1;
                }
                i10 = 40 << ((bArr[i10 != 0 ? '\t' : '\b'] >> 4) & 7);
            }
        }
        if (i10 == 0) {
            return;
        }
        this.f41529b = true;
    }
}
