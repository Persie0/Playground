package p453w9;

import android.util.Pair;
import com.google.android.exoplayer2.C2416m;
import com.kochava.tracker.BuildConfig;
import java.util.Arrays;
import java.util.Collections;
import p261m9.InterfaceC7509j;
import p261m9.InterfaceC7522w;
import p479xa.C10129a;
import p479xa.C10134c0;
import p479xa.C10148q;
import p479xa.C10151t;

/* JADX INFO: renamed from: w9.k */
/* JADX INFO: loaded from: classes.dex */
public final class C9860k implements InterfaceC9859j {

    /* JADX INFO: renamed from: q */
    public static final double[] f50197q = {23.976023976023978d, 24.0d, 25.0d, 29.97002997002997d, 30.0d, 50.0d, 59.94005994005994d, 60.0d};

    /* JADX INFO: renamed from: a */
    public String f50198a;

    /* JADX INFO: renamed from: b */
    public InterfaceC7522w f50199b;

    /* JADX INFO: renamed from: c */
    public final C9854e0 f50200c;

    /* JADX INFO: renamed from: d */
    public final C10151t f50201d;

    /* JADX INFO: renamed from: e */
    public final C9867r f50202e;

    /* JADX INFO: renamed from: f */
    public final boolean[] f50203f = new boolean[4];

    /* JADX INFO: renamed from: g */
    public final a f50204g = new a();

    /* JADX INFO: renamed from: h */
    public long f50205h;

    /* JADX INFO: renamed from: i */
    public boolean f50206i;

    /* JADX INFO: renamed from: j */
    public boolean f50207j;

    /* JADX INFO: renamed from: k */
    public long f50208k;

    /* JADX INFO: renamed from: l */
    public long f50209l;

    /* JADX INFO: renamed from: m */
    public long f50210m;

    /* JADX INFO: renamed from: n */
    public long f50211n;

    /* JADX INFO: renamed from: o */
    public boolean f50212o;

    /* JADX INFO: renamed from: p */
    public boolean f50213p;

    /* JADX INFO: renamed from: w9.k$a */
    public static final class a {

        /* JADX INFO: renamed from: e */
        public static final byte[] f50214e = {0, 0, 1};

        /* JADX INFO: renamed from: a */
        public boolean f50215a;

        /* JADX INFO: renamed from: b */
        public int f50216b;

        /* JADX INFO: renamed from: c */
        public int f50217c;

        /* JADX INFO: renamed from: d */
        public byte[] f50218d = new byte[BuildConfig.SDK_TRUNCATE_LENGTH];

        /* JADX INFO: renamed from: a */
        public final void m18356a(byte[] bArr, int i10, int i11) {
            if (this.f50215a) {
                int i12 = i11 - i10;
                byte[] bArr2 = this.f50218d;
                int length = bArr2.length;
                int i13 = this.f50216b;
                if (length < i13 + i12) {
                    this.f50218d = Arrays.copyOf(bArr2, (i13 + i12) * 2);
                }
                System.arraycopy(bArr, i10, this.f50218d, this.f50216b, i12);
                this.f50216b += i12;
            }
        }
    }

    public C9860k(C9854e0 c9854e0) {
        this.f50200c = c9854e0;
        if (c9854e0 != null) {
            this.f50202e = new C9867r(178);
            this.f50201d = new C10151t();
        } else {
            this.f50202e = null;
            this.f50201d = null;
        }
        this.f50209l = -9223372036854775807L;
        this.f50211n = -9223372036854775807L;
    }

    /* JADX WARN: Code duplicated, block: B:30:0x007c  */
    /* JADX WARN: Code duplicated, block: B:32:0x00b5  */
    /* JADX WARN: Code duplicated, block: B:34:0x00b8  */
    /* JADX WARN: Code duplicated, block: B:36:0x00bc  */
    /* JADX WARN: Code duplicated, block: B:37:0x00bf  */
    /* JADX WARN: Code duplicated, block: B:38:0x00c5  */
    /* JADX WARN: Code duplicated, block: B:39:0x00cb  */
    /* JADX WARN: Code duplicated, block: B:43:0x00f8  */
    /* JADX WARN: Code duplicated, block: B:50:0x0123  */
    /* JADX WARN: Code duplicated, block: B:52:0x0146  */
    /* JADX WARN: Code duplicated, block: B:65:0x0188  */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // p453w9.InterfaceC9859j
    /* JADX INFO: renamed from: a */
    public final void mo18336a(C10151t c10151t) {
        a aVar;
        C9867r c9867r;
        boolean z10;
        boolean z11;
        int i10;
        boolean z12;
        int i11;
        int i12;
        int i13;
        float f3;
        int i14;
        float f10;
        int i15;
        long j10;
        C10151t c10151t2 = c10151t;
        C10129a.m18993e(this.f50199b);
        int i16 = c10151t2.f51439b;
        int i17 = c10151t2.f51440c;
        byte[] bArr = c10151t2.f51438a;
        int i18 = i17 - i16;
        this.f50205h += (long) i18;
        this.f50199b.m15021c(i18, c10151t2);
        while (true) {
            int iM19114b = C10148q.m19114b(bArr, i16, i17, this.f50203f);
            aVar = this.f50204g;
            c9867r = this.f50202e;
            if (iM19114b == i17) {
                break;
            }
            int i19 = iM19114b + 3;
            int i20 = c10151t2.f51438a[i19] & 255;
            int i21 = iM19114b - i16;
            if (this.f50207j) {
                i16 = i16;
            } else {
                if (i21 > 0) {
                    aVar.m18356a(bArr, i16, iM19114b);
                }
                int i22 = i21 < 0 ? -i21 : 0;
                if (aVar.f50215a) {
                    int i23 = aVar.f50216b - i22;
                    aVar.f50216b = i23;
                    if (aVar.f50217c == 0 && i20 == 181) {
                        aVar.f50217c = i23;
                    } else {
                        aVar.f50215a = false;
                        z12 = true;
                    }
                    if (z12) {
                        String str = this.f50198a;
                        str.getClass();
                        byte[] bArrCopyOf = Arrays.copyOf(aVar.f50218d, aVar.f50216b);
                        int i24 = bArrCopyOf[4] & 255;
                        int i25 = bArrCopyOf[5] & 255;
                        i11 = (i24 << 4) | (i25 >> 4);
                        i12 = (bArrCopyOf[6] & 255) | ((i25 & 15) << 8);
                        i13 = (bArrCopyOf[7] & 240) >> 4;
                        if (i13 != 2) {
                            f3 = i12 * 4;
                            i14 = i11 * 3;
                        } else if (i13 != 3) {
                            if (i13 != 4) {
                                f10 = 1.0f;
                            } else {
                                f3 = i12 * 121;
                                i14 = i11 * 100;
                            }
                            C2416m.a aVar2 = new C2416m.a();
                            aVar2.f12491a = str;
                            aVar2.f12501k = "video/mpeg2";
                            aVar2.f12506p = i11;
                            aVar2.f12507q = i12;
                            aVar2.f12510t = f10;
                            aVar2.f12503m = Collections.singletonList(bArrCopyOf);
                            C2416m c2416m = new C2416m(aVar2);
                            i15 = (bArrCopyOf[7] & 15) - 1;
                            if (i15 >= 0 || i15 >= 8) {
                                i16 = i16;
                                j10 = 0;
                            } else {
                                double d10 = f50197q[i15];
                                byte b10 = bArrCopyOf[aVar.f50217c + 9];
                                int i26 = (b10 & 96) >> 5;
                                int i27 = b10 & 31;
                                if (i26 != i27) {
                                    d10 *= (((double) i26) + 1.0d) / ((double) (i27 + 1));
                                }
                                j10 = (long) (1000000.0d / d10);
                            }
                            Pair pairCreate = Pair.create(c2416m, Long.valueOf(j10));
                            this.f50199b.mo7388f((C2416m) pairCreate.first);
                            this.f50208k = ((Long) pairCreate.second).longValue();
                            this.f50207j = true;
                        } else {
                            f3 = i12 * 16;
                            i14 = i11 * 9;
                        }
                        f10 = f3 / i14;
                        C2416m.a aVar3 = new C2416m.a();
                        aVar3.f12491a = str;
                        aVar3.f12501k = "video/mpeg2";
                        aVar3.f12506p = i11;
                        aVar3.f12507q = i12;
                        aVar3.f12510t = f10;
                        aVar3.f12503m = Collections.singletonList(bArrCopyOf);
                        C2416m c2416m2 = new C2416m(aVar3);
                        i15 = (bArrCopyOf[7] & 15) - 1;
                        if (i15 >= 0) {
                            i16 = i16;
                            j10 = 0;
                        } else {
                            i16 = i16;
                            j10 = 0;
                        }
                        Pair pairCreate2 = Pair.create(c2416m2, Long.valueOf(j10));
                        this.f50199b.mo7388f((C2416m) pairCreate2.first);
                        this.f50208k = ((Long) pairCreate2.second).longValue();
                        this.f50207j = true;
                    } else {
                        i16 = i16;
                    }
                } else if (i20 == 179) {
                    aVar.f50215a = true;
                }
                aVar.m18356a(a.f50214e, 0, 3);
                z12 = false;
                if (z12) {
                    String str2 = this.f50198a;
                    str2.getClass();
                    byte[] bArrCopyOf2 = Arrays.copyOf(aVar.f50218d, aVar.f50216b);
                    int i28 = bArrCopyOf2[4] & 255;
                    int i29 = bArrCopyOf2[5] & 255;
                    i11 = (i28 << 4) | (i29 >> 4);
                    i12 = (bArrCopyOf2[6] & 255) | ((i29 & 15) << 8);
                    i13 = (bArrCopyOf2[7] & 240) >> 4;
                    if (i13 != 2) {
                        f3 = i12 * 4;
                        i14 = i11 * 3;
                    } else if (i13 != 3) {
                        if (i13 != 4) {
                            f10 = 1.0f;
                        } else {
                            f3 = i12 * 121;
                            i14 = i11 * 100;
                        }
                        C2416m.a aVar4 = new C2416m.a();
                        aVar4.f12491a = str2;
                        aVar4.f12501k = "video/mpeg2";
                        aVar4.f12506p = i11;
                        aVar4.f12507q = i12;
                        aVar4.f12510t = f10;
                        aVar4.f12503m = Collections.singletonList(bArrCopyOf2);
                        C2416m c2416m3 = new C2416m(aVar4);
                        i15 = (bArrCopyOf2[7] & 15) - 1;
                        if (i15 >= 0) {
                            i16 = i16;
                            j10 = 0;
                        } else {
                            i16 = i16;
                            j10 = 0;
                        }
                        Pair pairCreate3 = Pair.create(c2416m3, Long.valueOf(j10));
                        this.f50199b.mo7388f((C2416m) pairCreate3.first);
                        this.f50208k = ((Long) pairCreate3.second).longValue();
                        this.f50207j = true;
                    } else {
                        f3 = i12 * 16;
                        i14 = i11 * 9;
                    }
                    f10 = f3 / i14;
                    C2416m.a aVar5 = new C2416m.a();
                    aVar5.f12491a = str2;
                    aVar5.f12501k = "video/mpeg2";
                    aVar5.f12506p = i11;
                    aVar5.f12507q = i12;
                    aVar5.f12510t = f10;
                    aVar5.f12503m = Collections.singletonList(bArrCopyOf2);
                    C2416m c2416m4 = new C2416m(aVar5);
                    i15 = (bArrCopyOf2[7] & 15) - 1;
                    if (i15 >= 0) {
                        i16 = i16;
                        j10 = 0;
                    } else {
                        i16 = i16;
                        j10 = 0;
                    }
                    Pair pairCreate4 = Pair.create(c2416m4, Long.valueOf(j10));
                    this.f50199b.mo7388f((C2416m) pairCreate4.first);
                    this.f50208k = ((Long) pairCreate4.second).longValue();
                    this.f50207j = true;
                } else {
                    i16 = i16;
                }
            }
            if (c9867r == null) {
                c10151t2 = c10151t;
            } else {
                if (i21 > 0) {
                    c9867r.m18361a(bArr, i16, iM19114b);
                    i10 = 0;
                } else {
                    i10 = -i21;
                }
                if (c9867r.m18362b(i10)) {
                    int iM19117e = C10148q.m19117e(c9867r.f50363d, c9867r.f50364e);
                    int i30 = C10134c0.f51354a;
                    byte[] bArr2 = c9867r.f50363d;
                    C10151t c10151t3 = this.f50201d;
                    c10151t3.m19122C(bArr2, iM19117e);
                    this.f50200c.m18351a(this.f50211n, c10151t3);
                }
                if (i20 == 178) {
                    c10151t2 = c10151t;
                    if (c10151t2.f51438a[iM19114b + 2] == 1) {
                        c9867r.m18364d(i20);
                    }
                } else {
                    c10151t2 = c10151t;
                }
            }
            if (i20 == 0 || i20 == 179) {
                int i31 = i17 - iM19114b;
                if (this.f50213p && this.f50207j) {
                    long j11 = this.f50211n;
                    if (j11 != -9223372036854775807L) {
                        this.f50199b.mo7387e(j11, this.f50212o ? 1 : 0, ((int) (this.f50205h - this.f50210m)) - i31, i31, null);
                    }
                }
                if (!this.f50206i || this.f50213p) {
                    this.f50210m = this.f50205h - ((long) i31);
                    long j12 = this.f50209l;
                    if (j12 == -9223372036854775807L) {
                        long j13 = this.f50211n;
                        j12 = j13 != -9223372036854775807L ? j13 + this.f50208k : -9223372036854775807L;
                    }
                    this.f50211n = j12;
                    z10 = false;
                    this.f50212o = false;
                    this.f50209l = -9223372036854775807L;
                    z11 = true;
                    this.f50206i = true;
                } else {
                    z10 = false;
                    z11 = true;
                }
                this.f50213p = i20 == 0 ? z11 : z10;
            } else if (i20 == 184) {
                this.f50212o = true;
            }
            i16 = i19;
        }
        if (!this.f50207j) {
            aVar.m18356a(bArr, i16, i17);
        }
        if (c9867r != null) {
            c9867r.m18361a(bArr, i16, i17);
        }
    }

    @Override // p453w9.InterfaceC9859j
    /* JADX INFO: renamed from: b */
    public final void mo18337b() {
        C10148q.m19113a(this.f50203f);
        a aVar = this.f50204g;
        aVar.f50215a = false;
        aVar.f50216b = 0;
        aVar.f50217c = 0;
        C9867r c9867r = this.f50202e;
        if (c9867r != null) {
            c9867r.m18363c();
        }
        this.f50205h = 0L;
        this.f50206i = false;
        this.f50209l = -9223372036854775807L;
        this.f50211n = -9223372036854775807L;
    }

    @Override // p453w9.InterfaceC9859j
    /* JADX INFO: renamed from: c */
    public final void mo18338c() {
    }

    @Override // p453w9.InterfaceC9859j
    /* JADX INFO: renamed from: d */
    public final void mo18339d(InterfaceC7509j interfaceC7509j, InterfaceC9852d0.d dVar) {
        dVar.m18348a();
        dVar.m18349b();
        this.f50198a = dVar.f50141e;
        dVar.m18349b();
        this.f50199b = interfaceC7509j.mo7366q(dVar.f50140d, 2);
        C9854e0 c9854e0 = this.f50200c;
        if (c9854e0 != null) {
            c9854e0.m18352b(interfaceC7509j, dVar);
        }
    }

    @Override // p453w9.InterfaceC9859j
    /* JADX INFO: renamed from: e */
    public final void mo18340e(int i10, long j10) {
        this.f50209l = j10;
    }
}
