package p453w9;

import com.google.android.exoplayer2.C2416m;
import com.kochava.tracker.BuildConfig;
import java.util.Arrays;
import java.util.Collections;
import p261m9.InterfaceC7509j;
import p261m9.InterfaceC7522w;
import p357r6.C8739a;
import p479xa.C10129a;
import p479xa.C10134c0;
import p479xa.C10145n;
import p479xa.C10148q;
import p479xa.C10151t;

/* JADX INFO: renamed from: w9.l */
/* JADX INFO: loaded from: classes.dex */
public final class C9861l implements InterfaceC9859j {

    /* JADX INFO: renamed from: l */
    public static final float[] f50219l = {1.0f, 1.0f, 1.0909091f, 0.90909094f, 1.4545455f, 1.2121212f, 1.0f};

    /* JADX INFO: renamed from: a */
    public final C9854e0 f50220a;

    /* JADX INFO: renamed from: f */
    public b f50225f;

    /* JADX INFO: renamed from: g */
    public long f50226g;

    /* JADX INFO: renamed from: h */
    public String f50227h;

    /* JADX INFO: renamed from: i */
    public InterfaceC7522w f50228i;

    /* JADX INFO: renamed from: j */
    public boolean f50229j;

    /* JADX INFO: renamed from: c */
    public final boolean[] f50222c = new boolean[4];

    /* JADX INFO: renamed from: d */
    public final a f50223d = new a();

    /* JADX INFO: renamed from: k */
    public long f50230k = -9223372036854775807L;

    /* JADX INFO: renamed from: e */
    public final C9867r f50224e = new C9867r(178);

    /* JADX INFO: renamed from: b */
    public final C10151t f50221b = new C10151t();

    /* JADX INFO: renamed from: w9.l$a */
    public static final class a {

        /* JADX INFO: renamed from: f */
        public static final byte[] f50231f = {0, 0, 1};

        /* JADX INFO: renamed from: a */
        public boolean f50232a;

        /* JADX INFO: renamed from: b */
        public int f50233b;

        /* JADX INFO: renamed from: c */
        public int f50234c;

        /* JADX INFO: renamed from: d */
        public int f50235d;

        /* JADX INFO: renamed from: e */
        public byte[] f50236e = new byte[BuildConfig.SDK_TRUNCATE_LENGTH];

        /* JADX INFO: renamed from: a */
        public final void m18357a(byte[] bArr, int i10, int i11) {
            if (this.f50232a) {
                int i12 = i11 - i10;
                byte[] bArr2 = this.f50236e;
                int length = bArr2.length;
                int i13 = this.f50234c;
                if (length < i13 + i12) {
                    this.f50236e = Arrays.copyOf(bArr2, (i13 + i12) * 2);
                }
                System.arraycopy(bArr, i10, this.f50236e, this.f50234c, i12);
                this.f50234c += i12;
            }
        }
    }

    /* JADX INFO: renamed from: w9.l$b */
    public static final class b {

        /* JADX INFO: renamed from: a */
        public final InterfaceC7522w f50237a;

        /* JADX INFO: renamed from: b */
        public boolean f50238b;

        /* JADX INFO: renamed from: c */
        public boolean f50239c;

        /* JADX INFO: renamed from: d */
        public boolean f50240d;

        /* JADX INFO: renamed from: e */
        public int f50241e;

        /* JADX INFO: renamed from: f */
        public int f50242f;

        /* JADX INFO: renamed from: g */
        public long f50243g;

        /* JADX INFO: renamed from: h */
        public long f50244h;

        public b(InterfaceC7522w interfaceC7522w) {
            this.f50237a = interfaceC7522w;
        }

        /* JADX INFO: renamed from: a */
        public final void m18358a(byte[] bArr, int i10, int i11) {
            if (this.f50239c) {
                int i12 = this.f50242f;
                int i13 = (i10 + 1) - i12;
                if (i13 < i11) {
                    this.f50240d = ((bArr[i13] & 192) >> 6) == 0;
                    this.f50239c = false;
                    return;
                }
                this.f50242f = (i11 - i10) + i12;
            }
        }
    }

    public C9861l(C9854e0 c9854e0) {
        this.f50220a = c9854e0;
    }

    /* JADX WARN: Code duplicated, block: B:53:0x00e3  */
    /* JADX WARN: Code duplicated, block: B:55:0x0112  */
    /* JADX WARN: Code duplicated, block: B:58:0x0127  */
    /* JADX WARN: Code duplicated, block: B:60:0x0133  */
    /* JADX WARN: Code duplicated, block: B:61:0x0137  */
    /* JADX WARN: Code duplicated, block: B:62:0x013b  */
    /* JADX WARN: Code duplicated, block: B:64:0x013e  */
    /* JADX WARN: Code duplicated, block: B:65:0x0143  */
    /* JADX WARN: Code duplicated, block: B:69:0x014e  */
    /* JADX WARN: Code duplicated, block: B:71:0x015e  */
    /* JADX WARN: Code duplicated, block: B:74:0x018e  */
    /* JADX WARN: Code duplicated, block: B:77:0x01a7 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:78:0x01a9  */
    /* JADX WARN: Code duplicated, block: B:79:0x01af  */
    /* JADX WARN: Code duplicated, block: B:81:0x01b5 A[LOOP:1: B:80:0x01b3->B:81:0x01b5, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:84:0x01f7  */
    /* JADX WARN: Code duplicated, block: B:98:0x023b  */
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
        boolean z10;
        int i10;
        boolean z11;
        C8739a c8739a;
        int iM16970g;
        float f3;
        int iM16970g2;
        int i11;
        int i12;
        int iM16970g3;
        int iM16970g4;
        C10129a.m18993e(this.f50225f);
        C10129a.m18993e(this.f50228i);
        int i13 = c10151t.f51439b;
        int i14 = c10151t.f51440c;
        byte[] bArr = c10151t.f51438a;
        int i15 = i14 - i13;
        this.f50226g += (long) i15;
        this.f50228i.m15021c(i15, c10151t);
        while (true) {
            int iM19114b = C10148q.m19114b(bArr, i13, i14, this.f50222c);
            a aVar = this.f50223d;
            C9867r c9867r = this.f50224e;
            if (iM19114b == i14) {
                if (!this.f50229j) {
                    aVar.m18357a(bArr, i13, i14);
                }
                this.f50225f.m18358a(bArr, i13, i14);
                if (c9867r != null) {
                    c9867r.m18361a(bArr, i13, i14);
                    return;
                }
                return;
            }
            int i16 = iM19114b + 3;
            int i17 = c10151t.f51438a[i16] & 255;
            int i18 = iM19114b - i13;
            if (!this.f50229j) {
                if (i18 > 0) {
                    aVar.m18357a(bArr, i13, iM19114b);
                }
                int i19 = i18 < 0 ? -i18 : 0;
                int i20 = aVar.f50233b;
                if (i20 != 0) {
                    if (i20 != 1) {
                        if (i20 != 2) {
                            if (i20 != 3) {
                                if (i20 != 4) {
                                    throw new IllegalStateException();
                                }
                                if (i17 == 179 || i17 == 181) {
                                    aVar.f50234c -= i19;
                                    aVar.f50232a = false;
                                    z11 = true;
                                }
                                if (z11) {
                                    InterfaceC7522w interfaceC7522w = this.f50228i;
                                    int i21 = aVar.f50235d;
                                    String str = this.f50227h;
                                    str.getClass();
                                    byte[] bArrCopyOf = Arrays.copyOf(aVar.f50236e, aVar.f50234c);
                                    c8739a = new C8739a(bArrCopyOf, bArrCopyOf.length);
                                    c8739a.m16977n(i21);
                                    c8739a.m16977n(4);
                                    c8739a.m16975l();
                                    c8739a.m16976m(8);
                                    if (c8739a.m16969f()) {
                                        c8739a.m16976m(4);
                                        c8739a.m16976m(3);
                                    }
                                    iM16970g = c8739a.m16970g(4);
                                    if (iM16970g == 15) {
                                        iM16970g3 = c8739a.m16970g(8);
                                        iM16970g4 = c8739a.m16970g(8);
                                        if (iM16970g4 == 0) {
                                            C10145n.m19099g("H263Reader", "Invalid aspect ratio");
                                            f3 = 1.0f;
                                        } else {
                                            f3 = iM16970g3 / iM16970g4;
                                        }
                                    } else if (iM16970g < 7) {
                                        f3 = f50219l[iM16970g];
                                    } else {
                                        C10145n.m19099g("H263Reader", "Invalid aspect ratio");
                                        f3 = 1.0f;
                                    }
                                    if (c8739a.m16969f()) {
                                        c8739a.m16976m(2);
                                        c8739a.m16976m(1);
                                        if (c8739a.m16969f()) {
                                            c8739a.m16976m(15);
                                            c8739a.m16975l();
                                            c8739a.m16976m(15);
                                            c8739a.m16975l();
                                            c8739a.m16976m(15);
                                            c8739a.m16975l();
                                            c8739a.m16976m(3);
                                            c8739a.m16976m(11);
                                            c8739a.m16975l();
                                            c8739a.m16976m(15);
                                            c8739a.m16975l();
                                        }
                                    }
                                    if (c8739a.m16970g(2) != 0) {
                                        C10145n.m19099g("H263Reader", "Unhandled video object layer shape");
                                    }
                                    c8739a.m16975l();
                                    iM16970g2 = c8739a.m16970g(16);
                                    c8739a.m16975l();
                                    if (c8739a.m16969f()) {
                                        if (iM16970g2 == 0) {
                                            C10145n.m19099g("H263Reader", "Invalid vop_increment_time_resolution");
                                        } else {
                                            i12 = 0;
                                            for (i11 = iM16970g2 - 1; i11 > 0; i11 >>= 1) {
                                                i12++;
                                            }
                                            c8739a.m16976m(i12);
                                        }
                                    }
                                    c8739a.m16975l();
                                    int iM16970g5 = c8739a.m16970g(13);
                                    c8739a.m16975l();
                                    int iM16970g6 = c8739a.m16970g(13);
                                    c8739a.m16975l();
                                    c8739a.m16975l();
                                    C2416m.a aVar2 = new C2416m.a();
                                    aVar2.f12491a = str;
                                    aVar2.f12501k = "video/mp4v-es";
                                    aVar2.f12506p = iM16970g5;
                                    aVar2.f12507q = iM16970g6;
                                    aVar2.f12510t = f3;
                                    aVar2.f12503m = Collections.singletonList(bArrCopyOf);
                                    interfaceC7522w.mo7388f(new C2416m(aVar2));
                                    this.f50229j = true;
                                }
                            } else if ((i17 & 240) != 32) {
                                C10145n.m19099g("H263Reader", "Unexpected start code value");
                                aVar.f50232a = false;
                                aVar.f50234c = 0;
                                aVar.f50233b = 0;
                            } else {
                                aVar.f50235d = aVar.f50234c;
                                aVar.f50233b = 4;
                            }
                        } else if (i17 > 31) {
                            C10145n.m19099g("H263Reader", "Unexpected start code value");
                            aVar.f50232a = false;
                            aVar.f50234c = 0;
                            aVar.f50233b = 0;
                        } else {
                            aVar.f50233b = 3;
                        }
                    } else if (i17 != 181) {
                        C10145n.m19099g("H263Reader", "Unexpected start code value");
                        aVar.f50232a = false;
                        aVar.f50234c = 0;
                        aVar.f50233b = 0;
                    } else {
                        aVar.f50233b = 2;
                    }
                } else if (i17 == 176) {
                    aVar.f50233b = 1;
                    aVar.f50232a = true;
                }
                aVar.m18357a(a.f50231f, 0, 3);
                z11 = false;
                if (z11) {
                    InterfaceC7522w interfaceC7522w2 = this.f50228i;
                    int i22 = aVar.f50235d;
                    String str2 = this.f50227h;
                    str2.getClass();
                    byte[] bArrCopyOf2 = Arrays.copyOf(aVar.f50236e, aVar.f50234c);
                    c8739a = new C8739a(bArrCopyOf2, bArrCopyOf2.length);
                    c8739a.m16977n(i22);
                    c8739a.m16977n(4);
                    c8739a.m16975l();
                    c8739a.m16976m(8);
                    if (c8739a.m16969f()) {
                        c8739a.m16976m(4);
                        c8739a.m16976m(3);
                    }
                    iM16970g = c8739a.m16970g(4);
                    if (iM16970g == 15) {
                        iM16970g3 = c8739a.m16970g(8);
                        iM16970g4 = c8739a.m16970g(8);
                        if (iM16970g4 == 0) {
                            C10145n.m19099g("H263Reader", "Invalid aspect ratio");
                            f3 = 1.0f;
                        } else {
                            f3 = iM16970g3 / iM16970g4;
                        }
                    } else if (iM16970g < 7) {
                        f3 = f50219l[iM16970g];
                    } else {
                        C10145n.m19099g("H263Reader", "Invalid aspect ratio");
                        f3 = 1.0f;
                    }
                    if (c8739a.m16969f()) {
                        c8739a.m16976m(2);
                        c8739a.m16976m(1);
                        if (c8739a.m16969f()) {
                            c8739a.m16976m(15);
                            c8739a.m16975l();
                            c8739a.m16976m(15);
                            c8739a.m16975l();
                            c8739a.m16976m(15);
                            c8739a.m16975l();
                            c8739a.m16976m(3);
                            c8739a.m16976m(11);
                            c8739a.m16975l();
                            c8739a.m16976m(15);
                            c8739a.m16975l();
                        }
                    }
                    if (c8739a.m16970g(2) != 0) {
                        C10145n.m19099g("H263Reader", "Unhandled video object layer shape");
                    }
                    c8739a.m16975l();
                    iM16970g2 = c8739a.m16970g(16);
                    c8739a.m16975l();
                    if (c8739a.m16969f()) {
                        if (iM16970g2 == 0) {
                            C10145n.m19099g("H263Reader", "Invalid vop_increment_time_resolution");
                        } else {
                            i12 = 0;
                            while (i11 > 0) {
                                i12++;
                            }
                            c8739a.m16976m(i12);
                        }
                    }
                    c8739a.m16975l();
                    int iM16970g7 = c8739a.m16970g(13);
                    c8739a.m16975l();
                    int iM16970g8 = c8739a.m16970g(13);
                    c8739a.m16975l();
                    c8739a.m16975l();
                    C2416m.a aVar3 = new C2416m.a();
                    aVar3.f12491a = str2;
                    aVar3.f12501k = "video/mp4v-es";
                    aVar3.f12506p = iM16970g7;
                    aVar3.f12507q = iM16970g8;
                    aVar3.f12510t = f3;
                    aVar3.f12503m = Collections.singletonList(bArrCopyOf2);
                    interfaceC7522w2.mo7388f(new C2416m(aVar3));
                    this.f50229j = true;
                }
            }
            this.f50225f.m18358a(bArr, i13, iM19114b);
            if (c9867r == null) {
                z10 = true;
            } else {
                if (i18 > 0) {
                    c9867r.m18361a(bArr, i13, iM19114b);
                    i10 = 0;
                } else {
                    i10 = -i18;
                }
                if (c9867r.m18362b(i10)) {
                    int iM19117e = C10148q.m19117e(c9867r.f50363d, c9867r.f50364e);
                    int i23 = C10134c0.f51354a;
                    byte[] bArr2 = c9867r.f50363d;
                    C10151t c10151t2 = this.f50221b;
                    c10151t2.m19122C(bArr2, iM19117e);
                    this.f50220a.m18351a(this.f50230k, c10151t2);
                }
                if (i17 == 178) {
                    z10 = true;
                    if (c10151t.f51438a[iM19114b + 2] == 1) {
                        c9867r.m18364d(i17);
                    }
                } else {
                    z10 = true;
                }
            }
            int i24 = i14 - iM19114b;
            long j10 = this.f50226g - ((long) i24);
            b bVar = this.f50225f;
            boolean z12 = this.f50229j;
            if (bVar.f50241e == 182 && z12 && bVar.f50238b) {
                long j11 = bVar.f50244h;
                if (j11 != -9223372036854775807L) {
                    bVar.f50237a.mo7387e(j11, bVar.f50240d ? 1 : 0, (int) (j10 - bVar.f50243g), i24, null);
                }
            }
            if (bVar.f50241e != 179) {
                bVar.f50243g = j10;
            }
            b bVar2 = this.f50225f;
            long j12 = this.f50230k;
            bVar2.f50241e = i17;
            bVar2.f50240d = false;
            bVar2.f50238b = (i17 == 182 || i17 == 179) ? z10 : false;
            bVar2.f50239c = i17 == 182 ? z10 : false;
            bVar2.f50242f = 0;
            bVar2.f50244h = j12;
            i13 = i16;
            i14 = i14;
        }
    }

    @Override // p453w9.InterfaceC9859j
    /* JADX INFO: renamed from: b */
    public final void mo18337b() {
        C10148q.m19113a(this.f50222c);
        a aVar = this.f50223d;
        aVar.f50232a = false;
        aVar.f50234c = 0;
        aVar.f50233b = 0;
        b bVar = this.f50225f;
        if (bVar != null) {
            bVar.f50238b = false;
            bVar.f50239c = false;
            bVar.f50240d = false;
            bVar.f50241e = -1;
        }
        C9867r c9867r = this.f50224e;
        if (c9867r != null) {
            c9867r.m18363c();
        }
        this.f50226g = 0L;
        this.f50230k = -9223372036854775807L;
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
        this.f50227h = dVar.f50141e;
        dVar.m18349b();
        InterfaceC7522w interfaceC7522wMo7366q = interfaceC7509j.mo7366q(dVar.f50140d, 2);
        this.f50228i = interfaceC7522wMo7366q;
        this.f50225f = new b(interfaceC7522wMo7366q);
        C9854e0 c9854e0 = this.f50220a;
        if (c9854e0 != null) {
            c9854e0.m18352b(interfaceC7509j, dVar);
        }
    }

    @Override // p453w9.InterfaceC9859j
    /* JADX INFO: renamed from: e */
    public final void mo18340e(int i10, long j10) {
        if (j10 != -9223372036854775807L) {
            this.f50230k = j10;
        }
    }
}
