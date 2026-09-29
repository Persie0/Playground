package p396t9;

import com.google.android.exoplayer2.C2416m;
import com.google.android.exoplayer2.ParserException;
import com.google.android.exoplayer2.metadata.Metadata;
import com.google.android.exoplayer2.metadata.id3.MlltFrame;
import com.google.android.exoplayer2.metadata.id3.TextInformationFrame;
import ge.C5789m;
import java.io.EOFException;
import java.io.IOException;
import p195j9.C6436m;
import p261m9.C7504e;
import p261m9.C7506g;
import p261m9.C7516q;
import p261m9.C7517r;
import p261m9.C7519t;
import p261m9.InterfaceC7507h;
import p261m9.InterfaceC7508i;
import p261m9.InterfaceC7509j;
import p261m9.InterfaceC7522w;
import p479xa.C10129a;
import p479xa.C10134c0;
import p479xa.C10145n;
import p479xa.C10151t;

/* JADX INFO: renamed from: t9.d */
/* JADX INFO: loaded from: classes.dex */
public final class C9229d implements InterfaceC7507h {

    /* JADX INFO: renamed from: u */
    public static final C5789m f47844u = new C5789m(15);

    /* JADX INFO: renamed from: a */
    public final int f47845a;

    /* JADX INFO: renamed from: b */
    public final long f47846b;

    /* JADX INFO: renamed from: c */
    public final C10151t f47847c;

    /* JADX INFO: renamed from: d */
    public final C6436m.a f47848d;

    /* JADX INFO: renamed from: e */
    public final C7516q f47849e;

    /* JADX INFO: renamed from: f */
    public final C7517r f47850f;

    /* JADX INFO: renamed from: g */
    public final C7506g f47851g;

    /* JADX INFO: renamed from: h */
    public InterfaceC7509j f47852h;

    /* JADX INFO: renamed from: i */
    public InterfaceC7522w f47853i;

    /* JADX INFO: renamed from: j */
    public InterfaceC7522w f47854j;

    /* JADX INFO: renamed from: k */
    public int f47855k;

    /* JADX INFO: renamed from: l */
    public Metadata f47856l;

    /* JADX INFO: renamed from: m */
    public long f47857m;

    /* JADX INFO: renamed from: n */
    public long f47858n;

    /* JADX INFO: renamed from: o */
    public long f47859o;

    /* JADX INFO: renamed from: p */
    public int f47860p;

    /* JADX INFO: renamed from: q */
    public InterfaceC9230e f47861q;

    /* JADX INFO: renamed from: r */
    public boolean f47862r;

    /* JADX INFO: renamed from: s */
    public boolean f47863s;

    /* JADX INFO: renamed from: t */
    public long f47864t;

    public C9229d() {
        this(0);
    }

    public C9229d(int i10) {
        this(i10, -9223372036854775807L);
    }

    public C9229d(int i10, long j10) {
        this.f47845a = (i10 & 2) != 0 ? i10 | 1 : i10;
        this.f47846b = j10;
        this.f47847c = new C10151t(10);
        this.f47848d = new C6436m.a();
        this.f47849e = new C7516q();
        this.f47857m = -9223372036854775807L;
        this.f47850f = new C7517r();
        C7506g c7506g = new C7506g();
        this.f47851g = c7506g;
        this.f47854j = c7506g;
    }

    /* JADX INFO: renamed from: b */
    public static long m17587b(Metadata metadata) {
        if (metadata == null) {
            return -9223372036854775807L;
        }
        for (Metadata.Entry entry : metadata.f12627a) {
            if (entry instanceof TextInformationFrame) {
                TextInformationFrame textInformationFrame = (TextInformationFrame) entry;
                if (textInformationFrame.f12691a.equals("TLEN")) {
                    return C10134c0.m19026K(Long.parseLong(textInformationFrame.f12703c.get(0)));
                }
            }
        }
        return -9223372036854775807L;
    }

    /* JADX INFO: renamed from: a */
    public final C9226a m17588a(C7504e c7504e, boolean z10) throws IOException {
        C10151t c10151t = this.f47847c;
        c7504e.mo14994c(c10151t.f51438a, 0, 4, false);
        c10151t.m19124E(0);
        this.f47848d.m13060a(c10151t.m19129d());
        return new C9226a(c7504e.f41476c, c7504e.f41477d, this.f47848d, z10);
    }

    /* JADX INFO: renamed from: c */
    public final boolean m17589c(C7504e c7504e) throws IOException {
        InterfaceC9230e interfaceC9230e = this.f47861q;
        if (interfaceC9230e != null) {
            long jMo17583a = interfaceC9230e.mo17583a();
            if (jMo17583a != -1 && c7504e.mo14995d() > jMo17583a - 4) {
                return true;
            }
        }
        try {
            return !c7504e.mo14994c(this.f47847c.f51438a, 0, 4, true);
        } catch (EOFException unused) {
            return true;
        }
    }

    /* JADX WARN: Code duplicated, block: B:143:0x0323  */
    /* JADX WARN: Code duplicated, block: B:145:0x0327  */
    /* JADX WARN: Code duplicated, block: B:146:0x032a  */
    /* JADX WARN: Code duplicated, block: B:16:0x004c  */
    /* JADX WARN: Code duplicated, block: B:190:0x0453  */
    /* JADX WARN: Code duplicated, block: B:191:0x0455  */
    /* JADX WARN: Code duplicated, block: B:194:0x045e  */
    /* JADX WARN: Code duplicated, block: B:24:0x006c  */
    /* JADX WARN: Code duplicated, block: B:26:0x0074  */
    /* JADX WARN: Code duplicated, block: B:28:0x007d  */
    /* JADX WARN: Code duplicated, block: B:29:0x007f  */
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
        C9229d c9229d;
        C6436m.a aVar;
        int i10;
        int i11;
        C10151t c10151t;
        InterfaceC7508i interfaceC7508i2;
        int iM15022d;
        int i12;
        int i13;
        int i14;
        int iM19129d;
        C7504e c7504e;
        int i15;
        InterfaceC9230e interfaceC9230eM17588a;
        C7516q c7516q;
        int iM19148w;
        C7516q c7516q2;
        C6436m.a aVar2;
        C9228c c9228c;
        InterfaceC9230e interfaceC9230e;
        boolean z10;
        InterfaceC9230e interfaceC9230eM17588a2;
        long jM17587b;
        long j10;
        C7516q c7516q3;
        int iM19145t;
        C10129a.m18993e(this.f47853i);
        int i16 = C10134c0.f51354a;
        int i17 = this.f47855k;
        C6436m.a aVar3 = this.f47848d;
        if (i17 == 0) {
            try {
                m17590h((C7504e) interfaceC7508i, false);
            } catch (EOFException unused) {
                c9229d = this;
                aVar = aVar3;
                i10 = -1;
                i11 = -1;
            }
        }
        InterfaceC9230e interfaceC9230e2 = this.f47861q;
        C10151t c10151t2 = this.f47847c;
        if (interfaceC9230e2 == null) {
            C10151t c10151t3 = new C10151t(aVar3.f36960c);
            C7504e c7504e2 = (C7504e) interfaceC7508i;
            c7504e2.mo14994c(c10151t3.f51438a, 0, aVar3.f36960c, false);
            if ((aVar3.f36958a & 1) != 0) {
                if (aVar3.f36962e != 1) {
                    i14 = 36;
                } else {
                    i14 = 21;
                }
            } else if (aVar3.f36962e != 1) {
                i14 = 21;
            } else {
                i14 = 13;
            }
            if (c10151t3.f51440c >= i14 + 4) {
                c10151t3.m19124E(i14);
                iM19129d = c10151t3.m19129d();
                if (iM19129d != 1483304551 && iM19129d != 1231971951) {
                    if (c10151t3.f51440c >= 40) {
                        c10151t3.m19124E(36);
                        if (c10151t3.m19129d() == 1447187017) {
                            iM19129d = 1447187017;
                        } else {
                            iM19129d = 0;
                        }
                    } else {
                        iM19129d = 0;
                    }
                }
            } else if (c10151t3.f51440c >= 40) {
                c10151t3.m19124E(36);
                if (c10151t3.m19129d() == 1447187017) {
                    iM19129d = 1447187017;
                } else {
                    iM19129d = 0;
                }
            } else {
                iM19129d = 0;
            }
            long j11 = c7504e2.f41476c;
            C7516q c7516q4 = this.f47849e;
            long jMo17583a = -1;
            if (iM19129d == 1483304551 || iM19129d == 1231971951) {
                c7504e = c7504e2;
                long j12 = c7504e.f41477d;
                int i18 = aVar3.f36964g;
                int i19 = aVar3.f36961d;
                int iM19129d2 = c10151t3.m19129d();
                if ((iM19129d2 & 1) != 1 || (iM19148w = c10151t3.m19148w()) == 0) {
                    i15 = i14;
                    interfaceC9230eM17588a = null;
                } else {
                    i15 = i14;
                    long jM19030O = C10134c0.m19030O(iM19148w, ((long) i18) * 1000000, i19);
                    if ((iM19129d2 & 6) != 6) {
                        interfaceC9230eM17588a = new C9232g(j12, aVar3.f36960c, jM19030O, -1L, null);
                    } else {
                        long jM19146u = c10151t3.m19146u();
                        long[] jArr = new long[100];
                        for (int i20 = 0; i20 < 100; i20++) {
                            jArr[i20] = c10151t3.m19145t();
                        }
                        if (j11 != -1) {
                            long j13 = j12 + jM19146u;
                            if (j11 != j13) {
                                C10145n.m19099g("XingSeeker", "XING data size mismatch: " + j11 + ", " + j13);
                            }
                        }
                        interfaceC9230eM17588a = new C9232g(j12, aVar3.f36960c, jM19030O, jM19146u, jArr);
                    }
                }
                if (interfaceC9230eM17588a != null) {
                    c7516q = c7516q4;
                    if ((c7516q.f41509a == -1 || c7516q.f41510b == -1) ? false : true) {
                        c10151t = c10151t2;
                    } else {
                        c7504e.f41479f = 0;
                        c7504e.m15001n(i15 + 141, false);
                        c10151t = c10151t2;
                        c7504e.mo14994c(c10151t.f51438a, 0, 3, false);
                        c10151t.m19124E(0);
                        int iM19147v = c10151t.m19147v();
                        int i21 = iM19147v >> 12;
                        int i22 = iM19147v & 4095;
                        if (i21 > 0 || i22 > 0) {
                            c7516q.f41509a = i21;
                            c7516q.f41510b = i22;
                        }
                    }
                } else {
                    c10151t = c10151t2;
                    c7516q = c7516q4;
                }
                c7504e.mo14998j(aVar3.f36960c);
                if (interfaceC9230eM17588a == null || interfaceC9230eM17588a.mo14982b() || iM19129d != 1231971951) {
                    c9229d = this;
                } else {
                    c9229d = this;
                    interfaceC9230eM17588a = c9229d.m17588a(c7504e, false);
                }
            } else {
                if (iM19129d == 1447187017) {
                    long j14 = c7504e2.f41477d;
                    c10151t3.m19125F(10);
                    int iM19129d3 = c10151t3.m19129d();
                    if (iM19129d3 <= 0) {
                        c7504e = c7504e2;
                        c7516q3 = c7516q4;
                    } else {
                        int i23 = aVar3.f36961d;
                        long jM19030O2 = C10134c0.m19030O(iM19129d3, ((long) (i23 >= 32000 ? 1152 : 576)) * 1000000, i23);
                        int iM19150y = c10151t3.m19150y();
                        int iM19150y2 = c10151t3.m19150y();
                        int iM19150y3 = c10151t3.m19150y();
                        c10151t3.m19125F(2);
                        long j15 = ((long) aVar3.f36960c) + j14;
                        long[] jArr2 = new long[iM19150y];
                        long[] jArr3 = new long[iM19150y];
                        c7516q3 = c7516q4;
                        c7504e = c7504e2;
                        long j16 = j14;
                        int i24 = 0;
                        while (true) {
                            if (i24 >= iM19150y) {
                                long j17 = j11;
                                if (j17 != -1 && j17 != j16) {
                                    C10145n.m19099g("VbriSeeker", "VBRI data size mismatch: " + j17 + ", " + j16);
                                }
                                interfaceC9230eM17588a = new C9231f(jArr2, jArr3, jM19030O2, j16);
                                break;
                            }
                            long j18 = j11;
                            int i25 = iM19150y2;
                            C10151t c10151t4 = c10151t3;
                            jArr2[i24] = (((long) i24) * jM19030O2) / ((long) iM19150y);
                            jArr3[i24] = Math.max(j16, j15);
                            if (iM19150y3 == 1) {
                                iM19145t = c10151t4.m19145t();
                            } else if (iM19150y3 == 2) {
                                iM19145t = c10151t4.m19150y();
                            } else if (iM19150y3 == 3) {
                                iM19145t = c10151t4.m19147v();
                            } else if (iM19150y3 == 4) {
                                iM19145t = c10151t4.m19148w();
                            }
                            iM19150y2 = i25;
                            j16 += ((long) iM19145t) * ((long) iM19150y2);
                            i24++;
                            iM19150y3 = iM19150y3;
                            j11 = j18;
                            c10151t3 = c10151t4;
                        }
                        c7504e.mo14998j(aVar3.f36960c);
                    }
                    interfaceC9230eM17588a = null;
                    c7504e.mo14998j(aVar3.f36960c);
                } else {
                    c7504e = c7504e2;
                    c7516q3 = c7516q4;
                    c7504e.f41479f = 0;
                    interfaceC9230eM17588a = null;
                }
                c9229d = this;
                c10151t = c10151t2;
                c7516q = c7516q3;
            }
            Metadata metadata = c9229d.f47856l;
            long j19 = c7504e.f41477d;
            if (metadata == null) {
                c7516q2 = c7516q;
                aVar2 = aVar3;
                c9228c = null;
                break;
            }
            Metadata.Entry[] entryArr = metadata.f12627a;
            int length = entryArr.length;
            int i26 = 0;
            while (true) {
                if (i26 >= length) {
                    c7516q2 = c7516q;
                    aVar2 = aVar3;
                    c9228c = null;
                    break;
                }
                Metadata.Entry entry = entryArr[i26];
                if (entry instanceof MlltFrame) {
                    MlltFrame mlltFrame = (MlltFrame) entry;
                    long jM17587b2 = m17587b(metadata);
                    int length2 = mlltFrame.f12698e.length;
                    int i27 = length2 + 1;
                    long[] jArr4 = new long[i27];
                    long[] jArr5 = new long[i27];
                    jArr4[0] = j19;
                    jArr5[0] = 0;
                    int i28 = 1;
                    long j20 = 0;
                    while (i28 <= length2) {
                        int i29 = i28 - 1;
                        j19 += (long) (mlltFrame.f12696c + mlltFrame.f12698e[i29]);
                        j20 += (long) (mlltFrame.f12697d + mlltFrame.f12699f[i29]);
                        jArr4[i28] = j19;
                        jArr5[i28] = j20;
                        i28++;
                        length2 = length2;
                        aVar3 = aVar3;
                        c7516q = c7516q;
                    }
                    c7516q2 = c7516q;
                    aVar2 = aVar3;
                    c9228c = new C9228c(jM17587b2, jArr4, jArr5);
                    break;
                }
                i26++;
            }
            boolean z11 = c9229d.f47862r;
            int i30 = c9229d.f47845a;
            if (z11) {
                interfaceC9230eM17588a2 = new InterfaceC9230e.a();
            } else {
                if ((i30 & 4) != 0) {
                    if (c9228c != null) {
                        jM17587b = c9228c.f47843c;
                    } else {
                        if (interfaceC9230eM17588a != null) {
                            long jMo14984i = interfaceC9230eM17588a.mo14984i();
                            jMo17583a = interfaceC9230eM17588a.mo17583a();
                            j10 = jMo14984i;
                        } else {
                            jM17587b = m17587b(c9229d.f47856l);
                        }
                        interfaceC9230eM17588a = new C9227b(j10, c7504e.f41477d, jMo17583a);
                    }
                    j10 = jM17587b;
                    interfaceC9230eM17588a = new C9227b(j10, c7504e.f41477d, jMo17583a);
                } else {
                    if (c9228c == null) {
                        if (interfaceC9230eM17588a == null) {
                            interfaceC9230e = null;
                        }
                    }
                    if (interfaceC9230e == null && (interfaceC9230e.mo14982b() || (i30 & 1) == 0)) {
                        interfaceC9230eM17588a2 = interfaceC9230e;
                    } else {
                        if ((i30 & 2) != 0) {
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                        interfaceC9230eM17588a2 = c9229d.m17588a(c7504e, z10);
                    }
                }
                interfaceC9230e = interfaceC9230eM17588a;
                if (interfaceC9230e == null) {
                    if ((i30 & 2) != 0) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    interfaceC9230eM17588a2 = c9229d.m17588a(c7504e, z10);
                } else {
                    if ((i30 & 2) != 0) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    interfaceC9230eM17588a2 = c9229d.m17588a(c7504e, z10);
                }
            }
            c9229d.f47861q = interfaceC9230eM17588a2;
            c9229d.f47852h.mo7364c(interfaceC9230eM17588a2);
            InterfaceC7522w interfaceC7522w = c9229d.f47854j;
            C2416m.a aVar4 = new C2416m.a();
            aVar = aVar2;
            aVar4.f12501k = aVar.f36959b;
            aVar4.f12502l = 4096;
            aVar4.f12514x = aVar.f36962e;
            aVar4.f12515y = aVar.f36961d;
            C7516q c7516q5 = c7516q2;
            aVar4.f12485A = c7516q5.f41509a;
            aVar4.f12486B = c7516q5.f41510b;
            aVar4.f12499i = (i30 & 8) != 0 ? null : c9229d.f47856l;
            interfaceC7522w.mo7388f(new C2416m(aVar4));
            c9229d.f47859o = c7504e.f41477d;
            interfaceC7508i2 = interfaceC7508i;
        } else {
            c9229d = this;
            aVar = aVar3;
            c10151t = c10151t2;
            long j21 = c9229d.f47859o;
            interfaceC7508i2 = interfaceC7508i;
            if (j21 != 0) {
                C7504e c7504e3 = (C7504e) interfaceC7508i2;
                long j22 = c7504e3.f41477d;
                if (j22 < j21) {
                    c7504e3.mo14998j((int) (j21 - j22));
                }
            }
        }
        if (c9229d.f47860p == 0) {
            C7504e c7504e4 = (C7504e) interfaceC7508i2;
            c7504e4.f41479f = 0;
            if (c9229d.m17589c(c7504e4)) {
                i13 = -1;
            } else {
                C10151t c10151t5 = c10151t;
                c10151t5.m19124E(0);
                int iM19129d4 = c10151t5.m19129d();
                if (!(((long) ((-128000) & iM19129d4)) == (((long) c9229d.f47855k) & (-128000))) || C6436m.m13058a(iM19129d4) == -1) {
                    c7504e4.mo14998j(1);
                    c9229d.f47855k = 0;
                } else {
                    aVar.m13060a(iM19129d4);
                    if (c9229d.f47857m == -9223372036854775807L) {
                        c9229d.f47857m = c9229d.f47861q.mo17584c(c7504e4.f41477d);
                        long j23 = c9229d.f47846b;
                        if (j23 != -9223372036854775807L) {
                            c9229d.f47857m = (j23 - c9229d.f47861q.mo17584c(0L)) + c9229d.f47857m;
                        }
                    }
                    int i31 = aVar.f36960c;
                    c9229d.f47860p = i31;
                    InterfaceC9230e interfaceC9230e3 = c9229d.f47861q;
                    if (interfaceC9230e3 instanceof C9227b) {
                        C9227b c9227b = (C9227b) interfaceC9230e3;
                        long j24 = (((c9229d.f47858n + ((long) aVar.f36964g)) * 1000000) / ((long) aVar.f36961d)) + c9229d.f47857m;
                        long j25 = c7504e4.f41477d + ((long) i31);
                        if (!c9227b.m17585d(j24)) {
                            c9227b.f47838b.m12659a(j24);
                            c9227b.f47839c.m12659a(j25);
                        }
                        if (c9229d.f47863s && c9227b.m17585d(c9229d.f47864t)) {
                            c9229d.f47863s = false;
                            c9229d.f47854j = c9229d.f47853i;
                        }
                    }
                    iM15022d = c9229d.f47854j.m15022d(interfaceC7508i2, c9229d.f47860p, true);
                    if (iM15022d == -1) {
                        i13 = -1;
                    } else {
                        i12 = c9229d.f47860p - iM15022d;
                        c9229d.f47860p = i12;
                        if (i12 <= 0) {
                            c9229d.f47854j.mo7387e(c9229d.f47857m + ((c9229d.f47858n * 1000000) / ((long) aVar.f36961d)), 1, aVar.f36960c, 0, null);
                            c9229d.f47858n += (long) aVar.f36964g;
                            c9229d.f47860p = 0;
                            i13 = 0;
                        }
                    }
                }
                i13 = 0;
            }
        } else {
            iM15022d = c9229d.f47854j.m15022d(interfaceC7508i2, c9229d.f47860p, true);
            if (iM15022d == -1) {
                i13 = -1;
            } else {
                i12 = c9229d.f47860p - iM15022d;
                c9229d.f47860p = i12;
                if (i12 <= 0) {
                    i13 = 0;
                } else {
                    c9229d.f47854j.mo7387e(c9229d.f47857m + ((c9229d.f47858n * 1000000) / ((long) aVar.f36961d)), 1, aVar.f36960c, 0, null);
                    c9229d.f47858n += (long) aVar.f36964g;
                    c9229d.f47860p = 0;
                    i13 = 0;
                }
            }
        }
        i11 = i13;
        i10 = -1;
        if (i11 == i10) {
            InterfaceC9230e interfaceC9230e4 = c9229d.f47861q;
            if (interfaceC9230e4 instanceof C9227b) {
                long j26 = ((c9229d.f47858n * 1000000) / ((long) aVar.f36961d)) + c9229d.f47857m;
                if (interfaceC9230e4.mo14984i() != j26) {
                    InterfaceC9230e interfaceC9230e5 = c9229d.f47861q;
                    ((C9227b) interfaceC9230e5).f47840d = j26;
                    c9229d.f47852h.mo7364c(interfaceC9230e5);
                }
            }
        }
        return i11;
    }

    @Override // p261m9.InterfaceC7507h
    /* JADX INFO: renamed from: e */
    public final void mo12866e(long j10, long j11) {
        this.f47855k = 0;
        this.f47857m = -9223372036854775807L;
        this.f47858n = 0L;
        this.f47860p = 0;
        this.f47864t = j11;
        InterfaceC9230e interfaceC9230e = this.f47861q;
        if ((interfaceC9230e instanceof C9227b) && !((C9227b) interfaceC9230e).m17585d(j11)) {
            this.f47863s = true;
            this.f47854j = this.f47851g;
        }
    }

    @Override // p261m9.InterfaceC7507h
    /* JADX INFO: renamed from: f */
    public final void mo12867f(InterfaceC7509j interfaceC7509j) {
        this.f47852h = interfaceC7509j;
        InterfaceC7522w interfaceC7522wMo7366q = interfaceC7509j.mo7366q(0, 1);
        this.f47853i = interfaceC7522wMo7366q;
        this.f47854j = interfaceC7522wMo7366q;
        this.f47852h.mo7365i();
    }

    @Override // p261m9.InterfaceC7507h
    /* JADX INFO: renamed from: g */
    public final boolean mo12868g(InterfaceC7508i interfaceC7508i) throws IOException {
        return m17590h((C7504e) interfaceC7508i, true);
    }

    /* JADX WARN: Code duplicated, block: B:36:0x0076  */
    /* JADX WARN: Code duplicated, block: B:41:0x0083 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:42:0x0084  */
    /* JADX WARN: Code duplicated, block: B:44:0x008b A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:45:0x008d  */
    /* JADX WARN: Code duplicated, block: B:46:0x0095  */
    /* JADX WARN: Code duplicated, block: B:50:0x00a0  */
    /* JADX WARN: Code duplicated, block: B:51:0x00a7  */
    /* JADX WARN: Code duplicated, block: B:59:0x009c A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:60:0x0081 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:63:0x007d A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:64:0x00aa A[EDGE_INSN: B:64:0x00aa->B:53:0x00aa BREAK  A[LOOP:0: B:23:0x0049->B:65:0x0049], SYNTHETIC] */
    /* JADX INFO: renamed from: h */
    public final boolean m17590h(C7504e c7504e, boolean z10) throws IOException {
        int iMo14995d;
        int iM13058a;
        int i10;
        int i11 = z10 ? 32768 : 131072;
        c7504e.f41479f = 0;
        if (c7504e.f41477d == 0) {
            Metadata metadataM15020a = this.f47850f.m15020a(c7504e, (this.f47845a & 8) == 0 ? null : f47844u);
            this.f47856l = metadataM15020a;
            if (metadataM15020a != null) {
                this.f47849e.m15019b(metadataM15020a);
            }
            iMo14995d = (int) c7504e.mo14995d();
            if (!z10) {
                c7504e.mo14998j(iMo14995d);
            }
        } else {
            iMo14995d = 0;
        }
        int i12 = 0;
        int i13 = 0;
        int i14 = 0;
        while (true) {
            if (m17589c(c7504e)) {
                if (i13 > 0) {
                    break;
                }
                throw new EOFException();
            }
            C10151t c10151t = this.f47847c;
            c10151t.m19124E(0);
            int iM19129d = c10151t.m19129d();
            if (i12 == 0) {
                iM13058a = C6436m.m13058a(iM19129d);
                if (iM13058a != -1) {
                    i10 = i14 + 1;
                    if (i14 == i11) {
                        if (z10) {
                            return false;
                        }
                        throw ParserException.m6770a("Searched too many bytes.", null);
                    }
                    if (z10) {
                        c7504e.f41479f = 0;
                        c7504e.m15001n(iMo14995d + i10, false);
                    } else {
                        c7504e.mo14998j(1);
                    }
                    i13 = 0;
                    i14 = i10;
                    i12 = 0;
                } else {
                    i13++;
                    if (i13 == 1) {
                        if (i13 == 4) {
                            break;
                        }
                    } else {
                        this.f47848d.m13060a(iM19129d);
                        i12 = iM19129d;
                    }
                    c7504e.m15001n(iM13058a - 4, false);
                }
            } else {
                if (((long) ((-128000) & iM19129d)) == (((long) i12) & (-128000))) {
                    iM13058a = C6436m.m13058a(iM19129d);
                    if (iM13058a != -1) {
                        i13++;
                        if (i13 == 1) {
                            if (i13 == 4) {
                                break;
                                break;
                            }
                        } else {
                            this.f47848d.m13060a(iM19129d);
                            i12 = iM19129d;
                        }
                        c7504e.m15001n(iM13058a - 4, false);
                    }
                }
                i10 = i14 + 1;
                if (i14 == i11) {
                    if (z10) {
                        return false;
                    }
                    throw ParserException.m6770a("Searched too many bytes.", null);
                }
                if (z10) {
                    c7504e.f41479f = 0;
                    c7504e.m15001n(iMo14995d + i10, false);
                } else {
                    c7504e.mo14998j(1);
                }
                i13 = 0;
                i14 = i10;
                i12 = 0;
            }
        }
        if (z10) {
            c7504e.mo14998j(iMo14995d + i14);
        } else {
            c7504e.f41479f = 0;
        }
        this.f47855k = i12;
        return true;
    }

    @Override // p261m9.InterfaceC7507h
    public final void release() {
    }
}
