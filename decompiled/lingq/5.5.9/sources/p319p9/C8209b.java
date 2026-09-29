package p319p9;

import com.google.android.exoplayer2.ParserException;
import com.google.android.exoplayer2.metadata.Metadata;
import com.google.android.exoplayer2.metadata.flac.PictureFrame;
import com.google.common.collect.ImmutableList;
import java.io.EOFException;
import java.io.IOException;
import java.util.Arrays;
import p069da.C5112a;
import p261m9.C7504e;
import p261m9.C7512m;
import p261m9.C7513n;
import p261m9.C7514o;
import p261m9.C7515p;
import p261m9.C7519t;
import p261m9.C7525z;
import p261m9.InterfaceC7507h;
import p261m9.InterfaceC7508i;
import p261m9.InterfaceC7509j;
import p261m9.InterfaceC7520u;
import p261m9.InterfaceC7522w;
import p357r6.C8739a;
import p402u0.C9362e;
import p479xa.C10134c0;
import p479xa.C10151t;

/* JADX INFO: renamed from: p9.b */
/* JADX INFO: loaded from: classes.dex */
public final class C8209b implements InterfaceC7507h {

    /* JADX INFO: renamed from: e */
    public InterfaceC7509j f44423e;

    /* JADX INFO: renamed from: f */
    public InterfaceC7522w f44424f;

    /* JADX INFO: renamed from: h */
    public Metadata f44426h;

    /* JADX INFO: renamed from: i */
    public C7515p f44427i;

    /* JADX INFO: renamed from: j */
    public int f44428j;

    /* JADX INFO: renamed from: k */
    public int f44429k;

    /* JADX INFO: renamed from: l */
    public C8208a f44430l;

    /* JADX INFO: renamed from: m */
    public int f44431m;

    /* JADX INFO: renamed from: n */
    public long f44432n;

    /* JADX INFO: renamed from: a */
    public final byte[] f44419a = new byte[42];

    /* JADX INFO: renamed from: b */
    public final C10151t f44420b = new C10151t(new byte[32768], 0);

    /* JADX INFO: renamed from: c */
    public final boolean f44421c = false;

    /* JADX INFO: renamed from: d */
    public final C7512m.a f44422d = new C7512m.a();

    /* JADX INFO: renamed from: g */
    public int f44425g = 0;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r15v0, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r15v2 */
    /* JADX WARN: Type inference failed for: r15v3 */
    /* JADX WARN: Type inference failed for: r5v0 */
    /* JADX WARN: Type inference failed for: r5v14 */
    /* JADX WARN: Type inference failed for: r5v2, types: [boolean, int] */
    @Override // p261m9.InterfaceC7507h
    /* JADX INFO: renamed from: d */
    public final int mo12865d(InterfaceC7508i interfaceC7508i, C7519t c7519t) throws IOException {
        ?? r15;
        boolean z10;
        Metadata metadata;
        C7515p c7515p;
        Metadata metadata2;
        InterfaceC7520u bVar;
        long j10;
        boolean zM15011a;
        int i10 = this.f44425g;
        Metadata metadata3 = null;
        boolean z11 = true;
        ?? r10 = 0;
        if (i10 == 0) {
            boolean z12 = !this.f44421c;
            C7504e c7504e = (C7504e) interfaceC7508i;
            c7504e.f41479f = 0;
            long jMo14995d = c7504e.mo14995d();
            C9362e c9362e = z12 ? null : C5112a.f33077b;
            C10151t c10151t = new C10151t(10);
            Metadata metadataM10891k0 = null;
            int i11 = 0;
            while (true) {
                try {
                    try {
                        c7504e.mo14994c(c10151t.f51438a, 0, 10, false);
                        c10151t.m19124E(0);
                        if (c10151t.m19147v() != 4801587) {
                            break;
                        }
                        c10151t.m19125F(3);
                        int iM19144s = c10151t.m19144s();
                        int i12 = iM19144s + 10;
                        if (metadataM10891k0 == null) {
                            byte[] bArr = new byte[i12];
                            System.arraycopy(c10151t.f51438a, 0, bArr, 0, 10);
                            c7504e.mo14994c(bArr, 10, iM19144s, false);
                            metadataM10891k0 = new C5112a(c9362e).m10891k0(bArr, i12);
                        } else {
                            c7504e.m15001n(iM19144s, false);
                        }
                        i11 += i12;
                    } catch (EOFException unused) {
                        r15 = 0;
                    }
                } catch (EOFException unused2) {
                }
            }
            r15 = 0;
            c7504e.f41479f = r15;
            c7504e.m15001n(i11, r15);
            if (metadataM10891k0 != null && metadataM10891k0.f12627a.length != 0) {
                metadata3 = metadataM10891k0;
            }
            c7504e.mo14998j((int) (c7504e.mo14995d() - jMo14995d));
            this.f44426h = metadata3;
            this.f44425g = 1;
            return 0;
        }
        byte[] bArr2 = this.f44419a;
        if (i10 == 1) {
            C7504e c7504e2 = (C7504e) interfaceC7508i;
            c7504e2.mo14994c(bArr2, 0, bArr2.length, false);
            c7504e2.f41479f = 0;
            this.f44425g = 2;
            return 0;
        }
        int i13 = 4;
        if (i10 == 2) {
            C10151t c10151t2 = new C10151t(4);
            ((C7504e) interfaceC7508i).mo14993b(c10151t2.f51438a, 0, 4, false);
            if (c10151t2.m19146u() != 1716281667) {
                throw ParserException.m6770a("Failed to read FLAC stream marker.", null);
            }
            this.f44425g = 3;
            return 0;
        }
        int i14 = 7;
        if (i10 == 3) {
            C7515p c7515p2 = this.f44427i;
            boolean z13 = false;
            while (!z13) {
                C7504e c7504e3 = (C7504e) interfaceC7508i;
                c7504e3.f41479f = r10;
                C8739a c8739a = new C8739a(new byte[i13], i13);
                c7504e3.mo14994c((byte[]) c8739a.f46335d, r10, i13, r10);
                boolean zM16969f = c8739a.m16969f();
                int iM16970g = c8739a.m16970g(i14);
                int iM16970g2 = c8739a.m16970g(24) + i13;
                if (iM16970g == 0) {
                    byte[] bArr3 = new byte[38];
                    c7504e3.mo14993b(bArr3, r10, 38, r10);
                    c7515p2 = new C7515p(bArr3, i13);
                    z10 = zM16969f;
                } else {
                    if (c7515p2 == null) {
                        throw new IllegalArgumentException();
                    }
                    if (iM16970g == 3) {
                        C10151t c10151t3 = new C10151t(iM16970g2);
                        c7504e3.mo14993b(c10151t3.f51438a, r10, iM16970g2, r10);
                        z10 = zM16969f;
                        c7515p = new C7515p(c7515p2.f41494a, c7515p2.f41495b, c7515p2.f41496c, c7515p2.f41497d, c7515p2.f41498e, c7515p2.f41500g, c7515p2.f41501h, c7515p2.f41503j, C7513n.m15013a(c10151t3), c7515p2.f41505l);
                    } else {
                        z10 = zM16969f;
                        Metadata metadata4 = c7515p2.f41505l;
                        if (iM16970g == i13) {
                            C10151t c10151t4 = new C10151t(iM16970g2);
                            c7504e3.mo14993b(c10151t4.f51438a, 0, iM16970g2, false);
                            c10151t4.m19125F(i13);
                            Metadata metadataM15031a = C7525z.m15031a(Arrays.asList(C7525z.m15032b(c10151t4, false, false).f41539a));
                            if (metadata4 == null) {
                                metadata2 = metadataM15031a;
                            } else {
                                if (metadataM15031a != null) {
                                    Metadata.Entry[] entryArr = metadataM15031a.f12627a;
                                    if (entryArr.length != 0) {
                                        int i15 = C10134c0.f51354a;
                                        Metadata.Entry[] entryArr2 = metadata4.f12627a;
                                        Object[] objArrCopyOf = Arrays.copyOf(entryArr2, entryArr2.length + entryArr.length);
                                        System.arraycopy(entryArr, 0, objArrCopyOf, entryArr2.length, entryArr.length);
                                        metadata4 = new Metadata(metadata4.f12628b, (Metadata.Entry[]) objArrCopyOf);
                                    }
                                }
                                metadata2 = metadata4;
                            }
                            c7515p = new C7515p(c7515p2.f41494a, c7515p2.f41495b, c7515p2.f41496c, c7515p2.f41497d, c7515p2.f41498e, c7515p2.f41500g, c7515p2.f41501h, c7515p2.f41503j, c7515p2.f41504k, metadata2);
                        } else if (iM16970g == 6) {
                            C10151t c10151t5 = new C10151t(iM16970g2);
                            c7504e3.mo14993b(c10151t5.f51438a, 0, iM16970g2, false);
                            c10151t5.m19125F(4);
                            Metadata metadata5 = new Metadata(ImmutableList.m9064b0(PictureFrame.m7209a(c10151t5)));
                            if (metadata4 == null) {
                                metadata = metadata5;
                            } else {
                                Metadata.Entry[] entryArr3 = metadata5.f12627a;
                                if (entryArr3.length != 0) {
                                    int i16 = C10134c0.f51354a;
                                    Metadata.Entry[] entryArr4 = metadata4.f12627a;
                                    Object[] objArrCopyOf2 = Arrays.copyOf(entryArr4, entryArr4.length + entryArr3.length);
                                    System.arraycopy(entryArr3, 0, objArrCopyOf2, entryArr4.length, entryArr3.length);
                                    metadata4 = new Metadata(metadata4.f12628b, (Metadata.Entry[]) objArrCopyOf2);
                                }
                                metadata = metadata4;
                            }
                            c7515p = new C7515p(c7515p2.f41494a, c7515p2.f41495b, c7515p2.f41496c, c7515p2.f41497d, c7515p2.f41498e, c7515p2.f41500g, c7515p2.f41501h, c7515p2.f41503j, c7515p2.f41504k, metadata);
                        } else {
                            c7504e3.mo14998j(iM16970g2);
                        }
                    }
                    c7515p2 = c7515p;
                }
                int i17 = C10134c0.f51354a;
                this.f44427i = c7515p2;
                z13 = z10;
                r10 = 0;
                i13 = 4;
                i14 = 7;
            }
            this.f44427i.getClass();
            this.f44428j = Math.max(this.f44427i.f41496c, 6);
            InterfaceC7522w interfaceC7522w = this.f44424f;
            int i18 = C10134c0.f51354a;
            interfaceC7522w.mo7388f(this.f44427i.m15017c(bArr2, this.f44426h));
            this.f44425g = 4;
            return 0;
        }
        long jM19151z = 0;
        if (i10 == 4) {
            C7504e c7504e4 = (C7504e) interfaceC7508i;
            c7504e4.f41479f = 0;
            C10151t c10151t6 = new C10151t(2);
            c7504e4.mo14994c(c10151t6.f51438a, 0, 2, false);
            int iM19150y = c10151t6.m19150y();
            if ((iM19150y >> 2) != 16382) {
                c7504e4.f41479f = 0;
                throw ParserException.m6770a("First frame does not start with sync code.", null);
            }
            c7504e4.f41479f = 0;
            this.f44429k = iM19150y;
            InterfaceC7509j interfaceC7509j = this.f44423e;
            int i19 = C10134c0.f51354a;
            long j11 = c7504e4.f41477d;
            long j12 = c7504e4.f41476c;
            this.f44427i.getClass();
            C7515p c7515p3 = this.f44427i;
            if (c7515p3.f41504k != null) {
                bVar = new C7514o(c7515p3, j11);
            } else if (j12 == -1 || c7515p3.f41503j <= 0) {
                bVar = new InterfaceC7520u.b(c7515p3.m15016b());
            } else {
                C8208a c8208a = new C8208a(c7515p3, this.f44429k, j11, j12);
                this.f44430l = c8208a;
                bVar = c8208a.f41438a;
            }
            interfaceC7509j.mo7364c(bVar);
            this.f44425g = 5;
            return 0;
        }
        if (i10 != 5) {
            throw new IllegalStateException();
        }
        this.f44424f.getClass();
        this.f44427i.getClass();
        C8208a c8208a2 = this.f44430l;
        if (c8208a2 != null) {
            if (c8208a2.f41440c != null) {
                return c8208a2.m14980a((C7504e) interfaceC7508i, c7519t);
            }
        }
        if (this.f44432n == -1) {
            C7515p c7515p4 = this.f44427i;
            C7504e c7504e5 = (C7504e) interfaceC7508i;
            c7504e5.f41479f = 0;
            c7504e5.m15001n(1, false);
            byte[] bArr4 = new byte[1];
            c7504e5.mo14994c(bArr4, 0, 1, false);
            boolean z14 = (bArr4[0] & 1) == 1;
            c7504e5.m15001n(2, false);
            i14 = z14 ? 7 : 6;
            C10151t c10151t7 = new C10151t(i14);
            byte[] bArr5 = c10151t7.f51438a;
            int i20 = 0;
            while (i20 < i14) {
                int iM15003p = c7504e5.m15003p(bArr5, 0 + i20, i14 - i20);
                if (iM15003p == -1) {
                    break;
                }
                i20 += iM15003p;
            }
            c10151t7.m19123D(i20);
            c7504e5.f41479f = 0;
            try {
                jM19151z = c10151t7.m19151z();
                if (!z14) {
                    jM19151z *= (long) c7515p4.f41495b;
                }
            } catch (NumberFormatException unused3) {
                z11 = false;
            }
            if (!z11) {
                throw ParserException.m6770a(null, null);
            }
            this.f44432n = jM19151z;
            return 0;
        }
        C10151t c10151t8 = this.f44420b;
        int i21 = c10151t8.f51440c;
        if (i21 < 32768) {
            int i22 = ((C7504e) interfaceC7508i).read(c10151t8.f51438a, i21, 32768 - i21);
            z11 = i22 == -1;
            if (!z11) {
                c10151t8.m19123D(i21 + i22);
            } else if (c10151t8.f51440c - c10151t8.f51439b == 0) {
                long j13 = this.f44432n * 1000000;
                C7515p c7515p5 = this.f44427i;
                int i23 = C10134c0.f51354a;
                this.f44424f.mo7387e(j13 / ((long) c7515p5.f41498e), 1, this.f44431m, 0, null);
                return -1;
            }
        } else {
            z11 = false;
        }
        int i24 = c10151t8.f51439b;
        int i25 = this.f44431m;
        int i26 = this.f44428j;
        if (i25 < i26) {
            c10151t8.m19125F(Math.min(i26 - i25, c10151t8.f51440c - i24));
        }
        this.f44427i.getClass();
        int i27 = c10151t8.f51439b;
        while (true) {
            int i28 = c10151t8.f51440c - 16;
            C7512m.a aVar = this.f44422d;
            if (i27 > i28) {
                if (z11) {
                    while (true) {
                        int i29 = c10151t8.f51440c;
                        if (i27 <= i29 - this.f44428j) {
                            c10151t8.m19124E(i27);
                            try {
                                zM15011a = C7512m.m15011a(c10151t8, this.f44427i, this.f44429k, aVar);
                            } catch (IndexOutOfBoundsException unused4) {
                                zM15011a = false;
                            }
                            if (c10151t8.f51439b > c10151t8.f51440c) {
                                zM15011a = false;
                            }
                            if (zM15011a) {
                                c10151t8.m19124E(i27);
                                j10 = aVar.f41491a;
                                break;
                            }
                            i27++;
                        } else {
                            c10151t8.m19124E(i29);
                        }
                    }
                } else {
                    c10151t8.m19124E(i27);
                }
                j10 = -1;
                break;
            }
            c10151t8.m19124E(i27);
            if (C7512m.m15011a(c10151t8, this.f44427i, this.f44429k, aVar)) {
                c10151t8.m19124E(i27);
                j10 = aVar.f41491a;
                break;
            }
            i27++;
        }
        int i30 = c10151t8.f51439b - i24;
        c10151t8.m19124E(i24);
        this.f44424f.m15021c(i30, c10151t8);
        int i31 = this.f44431m + i30;
        this.f44431m = i31;
        if (j10 != -1) {
            long j14 = this.f44432n * 1000000;
            C7515p c7515p6 = this.f44427i;
            int i32 = C10134c0.f51354a;
            this.f44424f.mo7387e(j14 / ((long) c7515p6.f41498e), 1, i31, 0, null);
            this.f44431m = 0;
            this.f44432n = j10;
        }
        int i33 = c10151t8.f51440c;
        int i34 = c10151t8.f51439b;
        int i35 = i33 - i34;
        if (i35 >= 16) {
            return 0;
        }
        byte[] bArr6 = c10151t8.f51438a;
        System.arraycopy(bArr6, i34, bArr6, 0, i35);
        c10151t8.m19124E(0);
        c10151t8.m19123D(i35);
        return 0;
    }

    @Override // p261m9.InterfaceC7507h
    /* JADX INFO: renamed from: e */
    public final void mo12866e(long j10, long j11) {
        long j12 = 0;
        if (j10 == 0) {
            this.f44425g = 0;
        } else {
            C8208a c8208a = this.f44430l;
            if (c8208a != null) {
                c8208a.m14981c(j11);
            }
        }
        if (j11 != 0) {
            j12 = -1;
        }
        this.f44432n = j12;
        this.f44431m = 0;
        this.f44420b.m19121B(0);
    }

    @Override // p261m9.InterfaceC7507h
    /* JADX INFO: renamed from: f */
    public final void mo12867f(InterfaceC7509j interfaceC7509j) {
        this.f44423e = interfaceC7509j;
        this.f44424f = interfaceC7509j.mo7366q(0, 1);
        interfaceC7509j.mo7365i();
    }

    @Override // p261m9.InterfaceC7507h
    /* JADX INFO: renamed from: g */
    public final boolean mo12868g(InterfaceC7508i interfaceC7508i) throws IOException {
        C7504e c7504e = (C7504e) interfaceC7508i;
        C9362e c9362e = C5112a.f33077b;
        C10151t c10151t = new C10151t(10);
        Metadata metadataM10891k0 = null;
        int i10 = 0;
        while (true) {
            try {
                c7504e.mo14994c(c10151t.f51438a, 0, 10, false);
                c10151t.m19124E(0);
                if (c10151t.m19147v() != 4801587) {
                    break;
                }
                c10151t.m19125F(3);
                int iM19144s = c10151t.m19144s();
                int i11 = iM19144s + 10;
                if (metadataM10891k0 == null) {
                    byte[] bArr = new byte[i11];
                    System.arraycopy(c10151t.f51438a, 0, bArr, 0, 10);
                    c7504e.mo14994c(bArr, 10, iM19144s, false);
                    metadataM10891k0 = new C5112a(c9362e).m10891k0(bArr, i11);
                } else {
                    c7504e.m15001n(iM19144s, false);
                }
                i10 += i11;
            } catch (EOFException unused) {
            }
        }
        c7504e.f41479f = 0;
        c7504e.m15001n(i10, false);
        if (metadataM10891k0 != null) {
            int length = metadataM10891k0.f12627a.length;
        }
        C10151t c10151t2 = new C10151t(4);
        c7504e.mo14994c(c10151t2.f51438a, 0, 4, false);
        return c10151t2.m19146u() == 1716281667;
    }

    @Override // p261m9.InterfaceC7507h
    public final void release() {
    }
}
