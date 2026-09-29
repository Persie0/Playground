package p293o9;

import androidx.datastore.preferences.PreferencesProto$Value;
import com.android.installreferrer.api.InstallReferrerClient;
import com.google.android.exoplayer2.C2416m;
import com.google.android.exoplayer2.ParserException;
import com.google.common.collect.ImmutableList;
import dm.C5212l;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import p261m9.C7504e;
import p261m9.C7519t;
import p261m9.InterfaceC7507h;
import p261m9.InterfaceC7508i;
import p261m9.InterfaceC7509j;
import p261m9.InterfaceC7520u;
import p261m9.InterfaceC7522w;
import p479xa.C10134c0;
import p479xa.C10145n;
import p479xa.C10147p;
import p479xa.C10151t;

/* JADX INFO: renamed from: o9.b */
/* JADX INFO: loaded from: classes.dex */
public final class C8020b implements InterfaceC7507h {

    /* JADX INFO: renamed from: c */
    public int f43614c;

    /* JADX INFO: renamed from: e */
    public C8021c f43616e;

    /* JADX INFO: renamed from: h */
    public long f43619h;

    /* JADX INFO: renamed from: i */
    public C8023e f43620i;

    /* JADX INFO: renamed from: m */
    public int f43624m;

    /* JADX INFO: renamed from: n */
    public boolean f43625n;

    /* JADX INFO: renamed from: a */
    public final C10151t f43612a = new C10151t(12);

    /* JADX INFO: renamed from: b */
    public final b f43613b = new b();

    /* JADX INFO: renamed from: d */
    public InterfaceC7509j f43615d = new C5212l();

    /* JADX INFO: renamed from: g */
    public C8023e[] f43618g = new C8023e[0];

    /* JADX INFO: renamed from: k */
    public long f43622k = -1;

    /* JADX INFO: renamed from: l */
    public long f43623l = -1;

    /* JADX INFO: renamed from: j */
    public int f43621j = -1;

    /* JADX INFO: renamed from: f */
    public long f43617f = -9223372036854775807L;

    /* JADX INFO: renamed from: o9.b$a */
    public class a implements InterfaceC7520u {

        /* JADX INFO: renamed from: a */
        public final long f43626a;

        public a(long j10) {
            this.f43626a = j10;
        }

        @Override // p261m9.InterfaceC7520u
        /* JADX INFO: renamed from: b */
        public final boolean mo14982b() {
            return true;
        }

        @Override // p261m9.InterfaceC7520u
        /* JADX INFO: renamed from: h */
        public final InterfaceC7520u.a mo14983h(long j10) {
            C8020b c8020b = C8020b.this;
            InterfaceC7520u.a aVarM15896b = c8020b.f43618g[0].m15896b(j10);
            int i10 = 1;
            while (true) {
                C8023e[] c8023eArr = c8020b.f43618g;
                if (i10 >= c8023eArr.length) {
                    return aVarM15896b;
                }
                InterfaceC7520u.a aVarM15896b2 = c8023eArr[i10].m15896b(j10);
                if (aVarM15896b2.f41517a.f41523b < aVarM15896b.f41517a.f41523b) {
                    aVarM15896b = aVarM15896b2;
                }
                i10++;
            }
        }

        @Override // p261m9.InterfaceC7520u
        /* JADX INFO: renamed from: i */
        public final long mo14984i() {
            return this.f43626a;
        }
    }

    /* JADX INFO: renamed from: o9.b$b */
    public static class b {

        /* JADX INFO: renamed from: a */
        public int f43628a;

        /* JADX INFO: renamed from: b */
        public int f43629b;

        /* JADX INFO: renamed from: c */
        public int f43630c;
    }

    /* JADX INFO: renamed from: a */
    public final C8023e m15894a(int i10) {
        for (C8023e c8023e : this.f43618g) {
            if (c8023e.f43640b == i10 || c8023e.f43641c == i10) {
                return c8023e;
            }
        }
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:140:0x034e  */
    @Override // p261m9.InterfaceC7507h
    /* JADX INFO: renamed from: d */
    public final int mo12865d(InterfaceC7508i interfaceC7508i, C7519t c7519t) throws IOException {
        boolean z10;
        C8023e c8023e;
        long j10;
        long j11 = this.f43619h;
        int i10 = 0;
        if (j11 != -1) {
            C7504e c7504e = (C7504e) interfaceC7508i;
            long j12 = c7504e.f41477d;
            if (j11 < j12 || j11 > 262144 + j12) {
                c7519t.f41516a = j11;
                z10 = true;
            } else {
                c7504e.mo14998j((int) (j11 - j12));
                z10 = false;
            }
        } else {
            z10 = false;
        }
        this.f43619h = -1L;
        if (z10) {
            return 1;
        }
        int i11 = this.f43614c;
        b bVar = this.f43613b;
        C10151t c10151t = this.f43612a;
        switch (i11) {
            case InstallReferrerClient.InstallReferrerResponse.f10530OK /* 0 */:
                if (!mo12868g(interfaceC7508i)) {
                    throw ParserException.m6770a("AVI Header List not found", null);
                }
                ((C7504e) interfaceC7508i).mo14998j(12);
                this.f43614c = 1;
                return 0;
            case 1:
                ((C7504e) interfaceC7508i).mo14993b(c10151t.f51438a, 0, 12, false);
                c10151t.m19124E(0);
                bVar.getClass();
                bVar.f43628a = c10151t.m19132g();
                bVar.f43629b = c10151t.m19132g();
                bVar.f43630c = 0;
                if (bVar.f43628a != 1414744396) {
                    throw ParserException.m6770a("LIST expected, found: " + bVar.f43628a, null);
                }
                int iM19132g = c10151t.m19132g();
                bVar.f43630c = iM19132g;
                if (iM19132g == 1819436136) {
                    this.f43621j = bVar.f43629b;
                    this.f43614c = 2;
                    return 0;
                }
                throw ParserException.m6770a("hdrl expected, found: " + bVar.f43630c, null);
            case 2:
                int i12 = this.f43621j - 4;
                C10151t c10151t2 = new C10151t(i12);
                ((C7504e) interfaceC7508i).mo14993b(c10151t2.f51438a, 0, i12, false);
                C8024f c8024fM15897b = C8024f.m15897b(1819436136, c10151t2);
                int i13 = c8024fM15897b.f43652b;
                if (i13 != 1819436136) {
                    throw ParserException.m6770a("Unexpected header list type " + i13, null);
                }
                C8021c c8021c = (C8021c) c8024fM15897b.m15898a(C8021c.class);
                if (c8021c == null) {
                    throw ParserException.m6770a("AviHeader not found", null);
                }
                this.f43616e = c8021c;
                this.f43617f = ((long) c8021c.f43633c) * ((long) c8021c.f43631a);
                ArrayList arrayList = new ArrayList();
                ImmutableList.C3147b c3147bListIterator = c8024fM15897b.f43651a.listIterator(0);
                int i14 = 0;
                while (c3147bListIterator.hasNext()) {
                    InterfaceC8019a interfaceC8019a = (InterfaceC8019a) c3147bListIterator.next();
                    if (interfaceC8019a.mo15893c() == 1819440243) {
                        C8024f c8024f = (C8024f) interfaceC8019a;
                        int i15 = i14 + 1;
                        C8022d c8022d = (C8022d) c8024f.m15898a(C8022d.class);
                        C8025g c8025g = (C8025g) c8024f.m15898a(C8025g.class);
                        if (c8022d == null) {
                            C10145n.m19099g("AviExtractor", "Missing Stream Header");
                        } else if (c8025g == null) {
                            C10145n.m19099g("AviExtractor", "Missing Stream Format");
                        } else {
                            long jM19030O = C10134c0.m19030O(c8022d.f43637d, ((long) c8022d.f43635b) * 1000000, c8022d.f43636c);
                            C2416m c2416m = c8025g.f43653a;
                            c2416m.getClass();
                            C2416m.a aVar = new C2416m.a(c2416m);
                            aVar.m7129b(i14);
                            int i16 = c8022d.f43638e;
                            if (i16 != 0) {
                                aVar.f12502l = i16;
                            }
                            C8026h c8026h = (C8026h) c8024f.m15898a(C8026h.class);
                            if (c8026h != null) {
                                aVar.f12492b = c8026h.f43654a;
                            }
                            int iM19108h = C10147p.m19108h(c2416m.f12484l);
                            if (iM19108h == 1 || iM19108h == 2) {
                                InterfaceC7522w interfaceC7522wMo7366q = this.f43615d.mo7366q(i14, iM19108h);
                                interfaceC7522wMo7366q.mo7388f(new C2416m(aVar));
                                c8023e = new C8023e(i14, iM19108h, jM19030O, c8022d.f43637d, interfaceC7522wMo7366q);
                                this.f43617f = jM19030O;
                            }
                            if (c8023e != null) {
                                arrayList.add(c8023e);
                            }
                            i14 = i15;
                            i10 = 0;
                        }
                        c8023e = null;
                        if (c8023e != null) {
                            arrayList.add(c8023e);
                        }
                        i14 = i15;
                        i10 = 0;
                    }
                }
                int i17 = i10;
                this.f43618g = (C8023e[]) arrayList.toArray(new C8023e[i17]);
                this.f43615d.mo7365i();
                this.f43614c = 3;
                return i17;
            case 3:
                long j13 = this.f43622k;
                if (j13 != -1 && ((C7504e) interfaceC7508i).f41477d != j13) {
                    this.f43619h = j13;
                    return 0;
                }
                C7504e c7504e2 = (C7504e) interfaceC7508i;
                c7504e2.mo14994c(c10151t.f51438a, 0, 12, false);
                c7504e2.f41479f = 0;
                c10151t.m19124E(0);
                bVar.getClass();
                bVar.f43628a = c10151t.m19132g();
                bVar.f43629b = c10151t.m19132g();
                bVar.f43630c = 0;
                int iM19132g2 = c10151t.m19132g();
                int i18 = bVar.f43628a;
                if (i18 == 1179011410) {
                    c7504e2.mo14998j(12);
                    return 0;
                }
                if (i18 != 1414744396 || iM19132g2 != 1769369453) {
                    this.f43619h = c7504e2.f41477d + ((long) bVar.f43629b) + 8;
                    return 0;
                }
                long j14 = c7504e2.f41477d;
                this.f43622k = j14;
                this.f43623l = j14 + ((long) bVar.f43629b) + 8;
                if (!this.f43625n) {
                    C8021c c8021c2 = this.f43616e;
                    c8021c2.getClass();
                    if ((c8021c2.f43632b & 16) == 16) {
                        this.f43614c = 4;
                        this.f43619h = this.f43623l;
                        return 0;
                    }
                    this.f43615d.mo7364c(new InterfaceC7520u.b(this.f43617f));
                    this.f43625n = true;
                }
                this.f43619h = c7504e2.f41477d + 12;
                this.f43614c = 6;
                return 0;
            case 4:
                C7504e c7504e3 = (C7504e) interfaceC7508i;
                c7504e3.mo14993b(c10151t.f51438a, 0, 8, false);
                c10151t.m19124E(0);
                int iM19132g3 = c10151t.m19132g();
                int iM19132g4 = c10151t.m19132g();
                if (iM19132g3 == 829973609) {
                    this.f43614c = 5;
                    this.f43624m = iM19132g4;
                } else {
                    this.f43619h = c7504e3.f41477d + ((long) iM19132g4);
                }
                return 0;
            case 5:
                C10151t c10151t3 = new C10151t(this.f43624m);
                ((C7504e) interfaceC7508i).mo14993b(c10151t3.f51438a, 0, this.f43624m, false);
                int i19 = c10151t3.f51440c;
                int i20 = c10151t3.f51439b;
                if (i19 - i20 < 16) {
                    j10 = 0;
                } else {
                    c10151t3.m19125F(8);
                    long jM19132g = c10151t3.m19132g();
                    long j15 = this.f43622k;
                    j10 = jM19132g > j15 ? 0L : j15 + 8;
                    c10151t3.m19124E(i20);
                }
                while (c10151t3.f51440c - c10151t3.f51439b >= 16) {
                    int iM19132g5 = c10151t3.m19132g();
                    int iM19132g6 = c10151t3.m19132g();
                    long jM19132g2 = ((long) c10151t3.m19132g()) + j10;
                    c10151t3.m19132g();
                    C8023e c8023eM15894a = m15894a(iM19132g5);
                    if (c8023eM15894a != null) {
                        if ((iM19132g6 & 16) == 16) {
                            if (c8023eM15894a.f43648j == c8023eM15894a.f43650l.length) {
                                long[] jArr = c8023eM15894a.f43649k;
                                c8023eM15894a.f43649k = Arrays.copyOf(jArr, (jArr.length * 3) / 2);
                                int[] iArr = c8023eM15894a.f43650l;
                                c8023eM15894a.f43650l = Arrays.copyOf(iArr, (iArr.length * 3) / 2);
                            }
                            long[] jArr2 = c8023eM15894a.f43649k;
                            int i21 = c8023eM15894a.f43648j;
                            jArr2[i21] = jM19132g2;
                            c8023eM15894a.f43650l[i21] = c8023eM15894a.f43647i;
                            c8023eM15894a.f43648j = i21 + 1;
                        }
                        c8023eM15894a.f43647i++;
                    }
                }
                for (C8023e c8023e2 : this.f43618g) {
                    c8023e2.f43649k = Arrays.copyOf(c8023e2.f43649k, c8023e2.f43648j);
                    c8023e2.f43650l = Arrays.copyOf(c8023e2.f43650l, c8023e2.f43648j);
                }
                this.f43625n = true;
                this.f43615d.mo7364c(new a(this.f43617f));
                this.f43614c = 6;
                this.f43619h = this.f43622k;
                return 0;
            case PreferencesProto$Value.STRING_SET_FIELD_NUMBER /* 6 */:
                C7504e c7504e4 = (C7504e) interfaceC7508i;
                long j16 = c7504e4.f41477d;
                if (j16 >= this.f43623l) {
                    return -1;
                }
                C8023e c8023e3 = this.f43620i;
                if (c8023e3 != null) {
                    int i22 = c8023e3.f43645g;
                    int iM15022d = i22 - c8023e3.f43639a.m15022d(interfaceC7508i, i22, false);
                    c8023e3.f43645g = iM15022d;
                    boolean z11 = iM15022d == 0;
                    if (z11) {
                        if (c8023e3.f43644f > 0) {
                            InterfaceC7522w interfaceC7522w = c8023e3.f43639a;
                            int i23 = c8023e3.f43646h;
                            interfaceC7522w.mo7387e((c8023e3.f43642d * ((long) i23)) / ((long) c8023e3.f43643e), Arrays.binarySearch(c8023e3.f43650l, i23) >= 0 ? 1 : 0, c8023e3.f43644f, 0, null);
                        }
                        c8023e3.f43646h++;
                    }
                    if (!z11) {
                        return 0;
                    }
                    this.f43620i = null;
                    return 0;
                }
                if ((j16 & 1) == 1) {
                    c7504e4.mo14998j(1);
                }
                c7504e4.mo14994c(c10151t.f51438a, 0, 12, false);
                c10151t.m19124E(0);
                int iM19132g7 = c10151t.m19132g();
                if (iM19132g7 == 1414744396) {
                    c10151t.m19124E(8);
                    c7504e4.mo14998j(c10151t.m19132g() == 1769369453 ? 12 : 8);
                    c7504e4.f41479f = 0;
                    return 0;
                }
                int iM19132g8 = c10151t.m19132g();
                if (iM19132g7 == 1263424842) {
                    this.f43619h = c7504e4.f41477d + ((long) iM19132g8) + 8;
                    return 0;
                }
                c7504e4.mo14998j(8);
                c7504e4.f41479f = 0;
                C8023e c8023eM15894a2 = m15894a(iM19132g7);
                if (c8023eM15894a2 == null) {
                    this.f43619h = c7504e4.f41477d + ((long) iM19132g8);
                    return 0;
                }
                c8023eM15894a2.f43644f = iM19132g8;
                c8023eM15894a2.f43645g = iM19132g8;
                this.f43620i = c8023eM15894a2;
                return 0;
            default:
                throw new AssertionError();
        }
    }

    @Override // p261m9.InterfaceC7507h
    /* JADX INFO: renamed from: e */
    public final void mo12866e(long j10, long j11) {
        this.f43619h = -1L;
        this.f43620i = null;
        for (C8023e c8023e : this.f43618g) {
            if (c8023e.f43648j == 0) {
                c8023e.f43646h = 0;
            } else {
                c8023e.f43646h = c8023e.f43650l[C10134c0.m19039f(c8023e.f43649k, j10, true)];
            }
        }
        if (j10 != 0) {
            this.f43614c = 6;
        } else if (this.f43618g.length == 0) {
            this.f43614c = 0;
        } else {
            this.f43614c = 3;
        }
    }

    @Override // p261m9.InterfaceC7507h
    /* JADX INFO: renamed from: f */
    public final void mo12867f(InterfaceC7509j interfaceC7509j) {
        this.f43614c = 0;
        this.f43615d = interfaceC7509j;
        this.f43619h = -1L;
    }

    @Override // p261m9.InterfaceC7507h
    /* JADX INFO: renamed from: g */
    public final boolean mo12868g(InterfaceC7508i interfaceC7508i) throws IOException {
        C10151t c10151t = this.f43612a;
        ((C7504e) interfaceC7508i).mo14994c(c10151t.f51438a, 0, 12, false);
        c10151t.m19124E(0);
        if (c10151t.m19132g() != 1179011410) {
            return false;
        }
        c10151t.m19125F(4);
        return c10151t.m19132g() == 541677121;
    }

    @Override // p261m9.InterfaceC7507h
    public final void release() {
    }
}
