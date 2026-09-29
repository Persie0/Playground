package p000;

import java.io.IOException;
import java.net.ProtocolException;
import okhttp3.internal.http2.ConnectionShutdownException;

/* JADX INFO: loaded from: classes.dex */
public final class yl0 implements x84 {

    /* JADX INFO: renamed from: b */
    public static final yl0 f69969b = new yl0(0);

    /* JADX INFO: renamed from: c */
    public static final yl0 f69970c = new yl0(1);

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f69971a;

    public /* synthetic */ yl0(int i) {
        this.f69971a = i;
    }

    /* JADX WARN: Code duplicated, block: B:148:0x0292 A[Catch: IOException -> 0x019b, TryCatch #11 {IOException -> 0x019b, blocks: (B:98:0x0191, B:102:0x019e, B:116:0x01f0, B:122:0x01fe, B:123:0x0205, B:125:0x0208, B:128:0x020f, B:133:0x021a, B:140:0x026e, B:142:0x0281, B:146:0x028c, B:153:0x02a1, B:156:0x02ae, B:157:0x02d2, B:148:0x0292, B:139:0x025b, B:159:0x02d4, B:160:0x02d7, B:110:0x01c7, B:135:0x0239, B:138:0x0242), top: B:185:0x0191, inners: #2 }] */
    /* JADX WARN: Code duplicated, block: B:166:0x02e0 A[ADDED_TO_REGION, REMOVE] */
    /* JADX WARN: Code duplicated, block: B:94:0x018a  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v0 */
    /* JADX WARN: Type inference failed for: r3v15 */
    /* JADX WARN: Type inference failed for: r3v16 */
    /* JADX WARN: Type inference failed for: r3v17 */
    /* JADX WARN: Type inference failed for: r3v18 */
    /* JADX WARN: Type inference failed for: r3v19 */
    /* JADX WARN: Type inference failed for: r3v2 */
    /* JADX WARN: Type inference failed for: r3v20 */
    /* JADX WARN: Type inference failed for: r3v21 */
    /* JADX WARN: Type inference failed for: r3v22 */
    /* JADX WARN: Type inference failed for: r3v23 */
    /* JADX WARN: Type inference failed for: r3v24 */
    /* JADX WARN: Type inference failed for: r3v25 */
    /* JADX WARN: Type inference failed for: r3v26 */
    /* JADX WARN: Type inference failed for: r3v3 */
    /* JADX WARN: Type inference failed for: r3v4, types: [long] */
    @Override // p000.x84
    /* JADX INFO: renamed from: a */
    public final j88 mo8434a(at4 at4Var) throws IOException {
        h88 h88VarM20977l;
        ?? r3;
        IOException iOException;
        ?? r4;
        j88 j88VarM13143a;
        int i;
        qr3 qr3Var;
        m88 m88Var;
        j88 j88VarM13143a2;
        ru2 fw3Var;
        boolean z = false;
        ?? r5 = 1;
        ?? r6 = 1;
        switch (this.f69971a) {
            case 0:
                C3552rx c3552rx = (C3552rx) at4Var.f7464h;
                c3552rx.getClass();
                i18 i18Var = (i18) c3552rx.f59987b;
                ru2 ru2Var = (ru2) c3552rx.f59989d;
                co7 co7Var = (co7) at4Var.f7465i;
                z68 z68Var = (z68) co7Var.f10362e;
                qr3 qr3Var2 = (qr3) co7Var.f10361d;
                long jCurrentTimeMillis = System.currentTimeMillis();
                boolean z2 = l70.m15963z((String) co7Var.f10359b) && z68Var != null;
                boolean zEqualsIgnoreCase = "upgrade".equalsIgnoreCase(qr3Var2.m20121d("Connection"));
                try {
                    try {
                        ru2Var.mo12230j(co7Var);
                        try {
                            if (z2) {
                                try {
                                    try {
                                        if ("100-continue".equalsIgnoreCase(qr3Var2.m20121d("Expect"))) {
                                            try {
                                                ru2Var.mo12226f();
                                                h88VarM20977l = c3552rx.m20977l(true);
                                            } catch (IOException e) {
                                                c3552rx.m20978m(e);
                                                throw e;
                                            }
                                        } else {
                                            h88VarM20977l = null;
                                        }
                                        if (h88VarM20977l == null) {
                                            try {
                                                z68Var.getClass();
                                                z68 z68Var2 = (z68) co7Var.f10362e;
                                                z68Var2.getClass();
                                                long jMo159a = z68Var2.mo159a();
                                                r6 = jCurrentTimeMillis;
                                                d18 d18Var = new d18(new ou2(c3552rx, ru2Var.mo12229i(co7Var, jMo159a), jMo159a, false));
                                                z68Var.mo161d(d18Var);
                                                d18Var.close();
                                            } catch (IOException e2) {
                                                e = e2;
                                                r3 = jCurrentTimeMillis;
                                                if (!(e instanceof ConnectionShutdownException) || !c3552rx.f59986a) {
                                                    throw e;
                                                }
                                                iOException = e;
                                            }
                                        } else {
                                            r6 = jCurrentTimeMillis;
                                            i18Var.m13624g(c3552rx, true, false, false, false, null);
                                            if (!(c3552rx.m20972g().f44904i != null)) {
                                                ru2Var.mo12228h().mo11847e();
                                            }
                                        }
                                    } catch (IOException e3) {
                                        e = e3;
                                        h88VarM20977l = null;
                                    }
                                } catch (IOException e4) {
                                    e = e4;
                                    r5 = jCurrentTimeMillis;
                                    h88VarM20977l = null;
                                    r3 = r5;
                                    if (!(e instanceof ConnectionShutdownException)) {
                                        throw e;
                                    }
                                    throw e;
                                }
                            } else {
                                r6 = jCurrentTimeMillis;
                                i18Var.m13624g(c3552rx, true, false, false, false, null);
                                h88VarM20977l = null;
                            }
                            try {
                                ru2Var.mo12222b();
                                iOException = null;
                                r4 = r6;
                                while (true) {
                                    qr3Var = j88VarM13143a.f45206f;
                                    m88Var = j88VarM13143a.f45207g;
                                    if (i == 100 || (102 <= i && i < 200)) {
                                        h88 h88VarM20977l2 = c3552rx.m20977l(false);
                                        h88VarM20977l2.getClass();
                                        h88VarM20977l2.f41979a = co7Var;
                                        h88VarM20977l2.f41983e = c3552rx.m20972g().f44901f;
                                        h88VarM20977l2.f41990l = r4;
                                        h88VarM20977l2.f41991m = System.currentTimeMillis();
                                        j88VarM13143a = h88VarM20977l2.m13143a();
                                        i = j88VarM13143a.f45204d;
                                    }
                                }
                            } catch (IOException e5) {
                                c3552rx.m20978m(e5);
                                throw e5;
                            }
                        } catch (IOException e6) {
                            e = e6;
                            r3 = r6;
                            if (!(e instanceof ConnectionShutdownException)) {
                                throw e;
                            }
                            throw e;
                        }
                    } catch (IOException e7) {
                        c3552rx.m20978m(e7);
                        throw e7;
                    }
                } catch (IOException e8) {
                    e = e8;
                }
                if (h88VarM20977l == null) {
                    try {
                        r4 = r3;
                        h88VarM20977l = c3552rx.m20977l(false);
                        h88VarM20977l.getClass();
                    } catch (IOException e9) {
                        if (iOException == null) {
                            throw e9;
                        }
                        lda.m16117c(iOException, e9);
                        throw iOException;
                    }
                }
                r4 = r3;
                h88 h88Var = h88VarM20977l;
                h88Var.f41979a = co7Var;
                h88Var.f41983e = c3552rx.m20972g().f44901f;
                h88Var.f41990l = r4;
                h88Var.f41991m = System.currentTimeMillis();
                j88VarM13143a = h88Var.m13143a();
                i = j88VarM13143a.f45204d;
                boolean z3 = i == 101;
                if (z3) {
                    if (c3552rx.m20972g().f44904i != null) {
                        throw new ProtocolException("Unexpected 101 code on HTTP/2 connection");
                    }
                }
                if (z3) {
                    String strM20121d = qr3Var.m20121d("Connection");
                    if (strM20121d == null) {
                        strM20121d = null;
                    }
                    if ("upgrade".equalsIgnoreCase(strM20121d)) {
                        z = true;
                    }
                }
                if (zEqualsIgnoreCase && z) {
                    h88 h88VarM14326b = j88VarM13143a.m14326b();
                    h88VarM14326b.f41985g = new iga(m88Var.mo3002c(), m88Var.mo3001b());
                    h88VarM14326b.f41986h = c3552rx.m20979n();
                    j88VarM13143a2 = h88VarM14326b.m13143a();
                } else {
                    try {
                        String strM20121d2 = qr3Var.m20121d("Content-Type");
                        if (strM20121d2 == null) {
                            strM20121d2 = null;
                        }
                        long jMo12224d = ru2Var.mo12224d(j88VarM13143a);
                        o18 o18Var = new o18(strM20121d2, jMo12224d, new e18(new pu2(c3552rx, ru2Var.mo12221a(j88VarM13143a), jMo12224d, false)));
                        h88 h88VarM14326b2 = j88VarM13143a.m14326b();
                        h88VarM14326b2.f41985g = o18Var;
                        h88VarM14326b2.f41993o = new e41(8);
                        j88VarM13143a2 = h88VarM14326b2.m13143a();
                    } catch (IOException e10) {
                        c3552rx.m20978m(e10);
                        throw e10;
                    }
                }
                co7 co7Var2 = j88VarM13143a2.f45201a;
                co7Var2.getClass();
                if ("close".equalsIgnoreCase(((qr3) co7Var2.f10361d).m20121d("Connection"))) {
                    ru2Var.mo12228h().mo11847e();
                } else {
                    String strM20121d3 = j88VarM13143a2.f45206f.m20121d("Connection");
                    if ("close".equalsIgnoreCase(strM20121d3 == null ? null : strM20121d3)) {
                        ru2Var.mo12228h().mo11847e();
                    }
                }
                if ((i != 204 && i != 205) || j88VarM13143a2.f45207g.mo3001b() <= 0) {
                    return j88VarM13143a2;
                }
                throw new ProtocolException("HTTP " + i + " had non-zero Content-Length: " + j88VarM13143a2.f45207g.mo3001b());
            default:
                i18 i18Var2 = (i18) at4Var.f7463g;
                synchronized (i18Var2) {
                    if (!i18Var2.f43338J) {
                        throw new IllegalStateException("released");
                    }
                    if (i18Var2.f43353l || i18Var2.f43352k || i18Var2.f43337I || i18Var2.f43336H) {
                        throw new IllegalStateException("Check failed.");
                    }
                }
                su2 su2Var = i18Var2.f43348g;
                su2Var.getClass();
                j18 j18VarMo18303b = su2Var.mo18303b();
                dr6 dr6Var = i18Var2.f43342a;
                j18VarMo18303b.getClass();
                dr6Var.getClass();
                int i2 = at4Var.f7460d;
                C3309ls c3309ls = j18VarMo18303b.f44903h;
                mw3 mw3Var = j18VarMo18303b.f44904i;
                if (mw3Var != null) {
                    fw3Var = new nw3(dr6Var, j18VarMo18303b, at4Var, mw3Var);
                } else {
                    j18VarMo18303b.f44900e.setSoTimeout(i2);
                    ((e18) c3309ls.f50065c).f36574a.mo484i().mo3173g(i2);
                    ((d18) c3309ls.f50066d).f34849a.mo484i().mo3173g(at4Var.f7461e);
                    fw3Var = new fw3(dr6Var, j18VarMo18303b, c3309ls);
                }
                C3552rx c3552rx2 = new C3552rx(i18Var2, su2Var, fw3Var);
                i18Var2.f43351j = c3552rx2;
                i18Var2.f43340L = c3552rx2;
                synchronized (i18Var2) {
                    i18Var2.f43352k = true;
                    i18Var2.f43353l = true;
                }
                if (!i18Var2.f43339K) {
                    return at4.m3026a(at4Var, 0, c3552rx2, null, 61).m3031f((co7) at4Var.f7465i);
                }
                v63.m23133k("Canceled");
                return null;
        }
    }
}
