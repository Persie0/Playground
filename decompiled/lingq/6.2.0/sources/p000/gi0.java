package p000;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.ProtocolException;
import java.net.Proxy;
import java.net.SocketTimeoutException;
import java.security.cert.CertificateException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import java.util.regex.Pattern;
import javax.net.ssl.SSLHandshakeException;
import javax.net.ssl.SSLPeerUnverifiedException;
import javax.net.ssl.SSLSocketFactory;
import kotlin.collections.EmptyList;
import kotlin.text.Regex;
import okhttp3.Protocol;
import okhttp3.internal.http2.ConnectionShutdownException;

/* JADX INFO: loaded from: classes.dex */
public final class gi0 implements x84 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f40842a = 2;

    /* JADX INFO: renamed from: b */
    public final Object f40843b;

    public gi0(u06 u06Var) {
        u06Var.getClass();
        this.f40843b = u06Var;
    }

    /* JADX INFO: renamed from: d */
    public static int m12670d(j88 j88Var, int i) {
        String strM20121d = j88Var.f45206f.m20121d("Retry-After");
        if (strM20121d == null) {
            strM20121d = null;
        }
        if (strM20121d == null) {
            return i;
        }
        if (!new Regex("\\d+").m15427f(strM20121d)) {
            return Integer.MAX_VALUE;
        }
        Integer numValueOf = Integer.valueOf(strM20121d);
        numValueOf.getClass();
        return numValueOf.intValue();
    }

    /* JADX WARN: Code duplicated, block: B:185:0x042a  */
    /* JADX WARN: Code duplicated, block: B:188:0x0432  */
    /* JADX WARN: Code duplicated, block: B:191:0x0440  */
    /* JADX WARN: Code duplicated, block: B:192:0x0446  */
    /* JADX WARN: Code duplicated, block: B:198:0x0457  */
    /* JADX WARN: Code duplicated, block: B:201:0x045d  */
    /* JADX WARN: Code duplicated, block: B:203:0x0463  */
    /* JADX WARN: Code duplicated, block: B:205:0x046b  */
    /* JADX WARN: Code duplicated, block: B:213:0x049a A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:214:0x049c  */
    /* JADX WARN: Code duplicated, block: B:215:0x04a1 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:216:0x04a3  */
    /* JADX WARN: Code duplicated, block: B:218:0x04a8 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:219:0x04aa  */
    /* JADX WARN: Code duplicated, block: B:221:0x04d1  */
    /* JADX WARN: Code duplicated, block: B:293:0x06a2  */
    /* JADX WARN: Code duplicated, block: B:294:0x06a7  */
    /* JADX WARN: Code duplicated, block: B:297:0x06c4  */
    /* JADX WARN: Code duplicated, block: B:304:0x06f0  */
    /* JADX WARN: Code duplicated, block: B:323:0x074a  */
    /* JADX WARN: Code duplicated, block: B:325:0x0767  */
    /* JADX WARN: Code duplicated, block: B:326:0x0769  */
    /* JADX WARN: Code duplicated, block: B:328:0x0786  */
    /* JADX WARN: Code duplicated, block: B:389:0x0790 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // p000.x84
    /* JADX INFO: renamed from: a */
    public final j88 mo8434a(at4 at4Var) {
        boolean z;
        m88 m88Var;
        j88 j88Var;
        int iM13779o;
        long j;
        long time;
        Date dateM35a;
        Date dateM35a2;
        Date dateM35a3;
        String str;
        String str2;
        String str3;
        j88 j88Var2;
        b64 b64Var;
        long j2;
        long time2;
        String string;
        int i;
        int i2;
        long millis;
        long millis2;
        String str4;
        String str5;
        long j3;
        h88 h88VarM14326b;
        int i3;
        j88 j88VarM14445e;
        j88 j88VarM13143a;
        pc0 pc0Var;
        String strM20121d;
        String str6;
        j88 j88VarM13143a2;
        C3552rx c3552rxM12646c;
        C3552rx c3552rxM12646c2;
        j88 j88Var3;
        boolean z2;
        SSLSocketFactory sSLSocketFactory;
        yq6 yq6Var;
        xo0 xo0Var;
        switch (this.f40842a) {
            case 0:
                u06 u06Var = (u06) this.f40843b;
                co7 co7Var = (co7) at4Var.f7465i;
                w41 w41VarM4938s = co7Var.m4938s();
                ex3 ex3Var = (ex3) co7Var.f10360c;
                qr3 qr3Var = (qr3) co7Var.f10361d;
                z68 z68Var = (z68) co7Var.f10362e;
                if (z68Var != null) {
                    xv5 xv5VarMo160b = z68Var.mo160b();
                    if (xv5VarMo160b != null) {
                        w41VarM4938s.m23732u("Content-Type", xv5VarMo160b.f68847a);
                    }
                    long jMo159a = z68Var.mo159a();
                    if (jMo159a != -1) {
                        w41VarM4938s.m23732u("Content-Length", String.valueOf(jMo159a));
                        ((or3) w41VarM4938s.f66367c).m18300M("Transfer-Encoding");
                    } else {
                        w41VarM4938s.m23732u("Transfer-Encoding", "chunked");
                        ((or3) w41VarM4938s.f66367c).m18300M("Content-Length");
                    }
                }
                if (qr3Var.m20121d("Host") == null) {
                    w41VarM4938s.m23732u("Host", kcb.m15118i(ex3Var, false));
                }
                if (qr3Var.m20121d("Connection") == null) {
                    w41VarM4938s.m23732u("Connection", "Keep-Alive");
                }
                if (qr3Var.m20121d("Accept-Encoding") == null && qr3Var.m20121d("Range") == null) {
                    w41VarM4938s.m23732u("Accept-Encoding", "gzip");
                    z = true;
                } else {
                    z = false;
                }
                u06Var.getClass();
                ex3Var.getClass();
                if (qr3Var.m20121d("User-Agent") == null) {
                    w41VarM4938s.m23732u("User-Agent", "okhttp/5.3.2");
                }
                co7 co7Var2 = new co7(w41VarM4938s);
                j88 j88VarM3031f = at4Var.m3031f(co7Var2);
                qr3 qr3Var2 = j88VarM3031f.f45206f;
                ex3 ex3Var2 = (ex3) co7Var2.f10360c;
                int i4 = xw3.f68902a;
                u06Var.getClass();
                ex3Var2.getClass();
                if (u06Var != u06.f63174b) {
                    Pattern pattern = gm1.f40991k;
                    f9d.m11622c(ex3Var2, qr3Var2).isEmpty();
                }
                h88 h88VarM14326b2 = j88VarM3031f.m14326b();
                h88VarM14326b2.f41979a = co7Var2;
                if (z) {
                    String strM20121d2 = qr3Var2.m20121d("Content-Encoding");
                    if (strM20121d2 == null) {
                        strM20121d2 = null;
                    }
                    if ("gzip".equalsIgnoreCase(strM20121d2) && xw3.m24724a(j88VarM3031f) && (m88Var = j88VarM3031f.f45207g) != null) {
                        iq3 iq3Var = new iq3(m88Var.mo3003e());
                        or3 or3VarM20123g = qr3Var2.m20123g();
                        or3VarM20123g.m18300M("Content-Encoding");
                        or3VarM20123g.m18300M("Content-Length");
                        h88VarM14326b2.f41984f = or3VarM20123g.m18309w().m20123g();
                        String strM20121d3 = qr3Var2.m20121d("Content-Type");
                        h88VarM14326b2.f41985g = new o18(strM20121d3 == null ? null : strM20121d3, -1L, new e18(iq3Var));
                    }
                }
                return h88VarM14326b2.m13143a();
            case 1:
                fl0 fl0Var = (fl0) this.f40843b;
                if (fl0Var != null) {
                    co7 co7Var3 = (co7) at4Var.f7465i;
                    co7Var3.getClass();
                    ex3 ex3Var3 = (ex3) co7Var3.f10360c;
                    try {
                        bh2 bh2VarM12647e = fl0Var.f39240a.m12647e(AbstractC3423or.m18218C(ex3Var3));
                        if (bh2VarM12647e == null) {
                            j88Var3 = null;
                        } else {
                            try {
                                dl0 dl0Var = new dl0((yd9) bh2VarM12647e.f8535c.get(0));
                                String str7 = dl0Var.f35768c;
                                qr3 qr3Var3 = dl0Var.f35767b;
                                ex3 ex3Var4 = dl0Var.f35766a;
                                qr3 qr3Var4 = dl0Var.f35772g;
                                String strM20121d4 = qr3Var4.m20121d("Content-Type");
                                String strM20121d5 = qr3Var4.m20121d("Content-Length");
                                ex3Var4.getClass();
                                qr3Var3.getClass();
                                str7.getClass();
                                w41 w41Var = new w41(13);
                                w41Var.f66365a = ex3Var4;
                                w41Var.f66367c = qr3Var3.m20123g();
                                w41Var.m23736y(!str7.equals("\u0000") ? str7 : "GET", null);
                                co7 co7Var4 = new co7(w41Var);
                                l88 l88Var = m88.f50759b;
                                iy5 iy5Var = b9a.f8185x;
                                new ArrayList(20);
                                Protocol protocol = dl0Var.f35769d;
                                protocol.getClass();
                                int i5 = dl0Var.f35770e;
                                String str8 = dl0Var.f35771f;
                                str8.getClass();
                                or3 or3VarM20123g2 = qr3Var4.m20123g();
                                cl0 cl0Var = new cl0(bh2VarM12647e, strM20121d4, strM20121d5);
                                ar3 ar3Var = dl0Var.f35773h;
                                long j4 = dl0Var.f35774i;
                                long j5 = dl0Var.f35775j;
                                if (i5 < 0) {
                                    gm5.m12751g(ux5.m22988k(i5, "code < 0: "));
                                    return null;
                                }
                                qr3 qr3VarM18309w = or3VarM20123g2.m18309w();
                                j88Var3 = new j88(co7Var4, protocol, str8, i5, ar3Var, qr3VarM18309w, cl0Var, null, null, null, null, j4, j5, null, iy5Var);
                                if (ex3Var4.equals(ex3Var3) && str7.equals((String) co7Var3.f10359b)) {
                                    Set setM18277r0 = AbstractC3423or.m18277r0(qr3VarM18309w);
                                    if (!(setM18277r0 instanceof Collection) || !setM18277r0.isEmpty()) {
                                        Iterator it = setM18277r0.iterator();
                                        while (true) {
                                            if (it.hasNext()) {
                                                String str9 = (String) it.next();
                                                if (!qr3Var3.m20125i(str9).equals(((qr3) co7Var3.f10361d).m20125i(str9))) {
                                                }
                                            }
                                        }
                                    }
                                }
                                icb.m13766b(j88Var3.f45207g);
                                j88Var3 = null;
                            } catch (IOException unused) {
                                icb.m13766b(bh2VarM12647e);
                            }
                        }
                    } catch (IOException unused2) {
                    }
                    j88Var = j88Var3;
                } else {
                    j88Var = null;
                }
                long jCurrentTimeMillis = System.currentTimeMillis();
                co7 co7Var5 = (co7) at4Var.f7465i;
                co7Var5.getClass();
                if (j88Var != null) {
                    j = j88Var.f45212l;
                    time = j88Var.f45196H;
                    qr3 qr3Var5 = j88Var.f45206f;
                    int size = qr3Var5.size();
                    int i6 = 0;
                    iM13779o = -1;
                    dateM35a = null;
                    dateM35a2 = null;
                    dateM35a3 = null;
                    str = null;
                    str2 = null;
                    str3 = null;
                    while (i6 < size) {
                        String strM20122f = qr3Var5.m20122f(i6);
                        long j6 = jCurrentTimeMillis;
                        String strM20124h = qr3Var5.m20124h(i6);
                        if (strM20122f.equalsIgnoreCase("Date")) {
                            str3 = strM20124h;
                            dateM35a3 = a12.m35a(strM20124h);
                        } else if (strM20122f.equalsIgnoreCase("Expires")) {
                            dateM35a = a12.m35a(strM20124h);
                        } else if (strM20122f.equalsIgnoreCase("Last-Modified")) {
                            str2 = strM20124h;
                            dateM35a2 = a12.m35a(strM20124h);
                        } else if (strM20122f.equalsIgnoreCase("ETag")) {
                            str = strM20124h;
                        } else if (strM20122f.equalsIgnoreCase("Age")) {
                            iM13779o = icb.m13779o(-1, strM20124h);
                        }
                        i6++;
                        jCurrentTimeMillis = j6;
                    }
                } else {
                    iM13779o = -1;
                    j = 0;
                    time = 0;
                    dateM35a = null;
                    dateM35a2 = null;
                    dateM35a3 = null;
                    str = null;
                    str2 = null;
                    str3 = null;
                }
                long j7 = jCurrentTimeMillis;
                TimeUnit timeUnit = TimeUnit.SECONDS;
                if (j88Var == null) {
                    j88Var2 = null;
                    b64Var = new b64(co7Var5, j88Var2);
                } else {
                    j88Var2 = null;
                    ex3 ex3Var5 = (ex3) co7Var5.f10360c;
                    qr3 qr3Var6 = (qr3) co7Var5.f10361d;
                    if (!(ex3Var5.m11380f() && j88Var.f45205e == null) && AbstractC3489q9.m19790t(j88Var, co7Var5)) {
                        gl0 gl0VarM4934j = co7Var5.m4934j();
                        if (!gl0VarM4934j.f40926a && qr3Var6.m20121d("If-Modified-Since") == null && qr3Var6.m20121d("If-None-Match") == null) {
                            gl0 gl0VarM14325a = j88Var.m14325a();
                            long jMax = dateM35a3 != null ? Math.max(0L, time - dateM35a3.getTime()) : 0L;
                            if (iM13779o != -1) {
                                jMax = Math.max(jMax, timeUnit.toMillis(iM13779o));
                            }
                            long jMax2 = jMax + Math.max(0L, time - j) + Math.max(0L, j7 - time);
                            int i7 = j88Var.m14325a().f40928c;
                            if (i7 != -1) {
                                time2 = timeUnit.toMillis(i7);
                            } else {
                                if (dateM35a != null) {
                                    if (dateM35a3 != null) {
                                        time = dateM35a3.getTime();
                                    }
                                    time2 = dateM35a.getTime() - time;
                                    if (time2 <= 0) {
                                        time2 = 0;
                                    }
                                } else if (dateM35a2 == null) {
                                    j2 = 0;
                                    time2 = j2;
                                } else {
                                    List list = ((ex3) j88Var.f45201a.f10360c).f38030g;
                                    if (list == null) {
                                        string = null;
                                    } else {
                                        StringBuilder sb = new StringBuilder();
                                        p84.m18963h(list, sb);
                                        string = sb.toString();
                                    }
                                    if (string == null) {
                                        long time3 = (dateM35a3 != null ? dateM35a3.getTime() : j) - dateM35a2.getTime();
                                        j2 = 0;
                                        if (time3 > 0) {
                                            time2 = time3 / 10;
                                        }
                                    } else {
                                        j2 = 0;
                                    }
                                    time2 = j2;
                                }
                                i = gl0VarM4934j.f40928c;
                                if (i != -1) {
                                    time2 = Math.min(time2, timeUnit.toMillis(i));
                                }
                                i2 = gl0VarM4934j.f40934i;
                                if (i2 != -1) {
                                    millis = timeUnit.toMillis(i2);
                                } else {
                                    millis = j2;
                                }
                                if (!gl0VarM14325a.f40932g || (i3 = gl0VarM4934j.f40933h) == -1) {
                                    millis2 = j2;
                                } else {
                                    millis2 = timeUnit.toMillis(i3);
                                }
                                if (gl0VarM14325a.f40926a) {
                                    if (str != null) {
                                        str4 = str;
                                        str5 = "If-None-Match";
                                    } else {
                                        if (dateM35a2 != null) {
                                            str4 = str2;
                                        } else if (dateM35a3 != null) {
                                            str4 = str3;
                                        } else {
                                            j88Var2 = null;
                                            b64Var = new b64(co7Var5, j88Var2);
                                        }
                                        str5 = "If-Modified-Since";
                                    }
                                    or3 or3VarM20123g3 = qr3Var6.m20123g();
                                    str4.getClass();
                                    oha.m17995a(or3VarM20123g3, str5, str4);
                                    w41 w41VarM4938s2 = co7Var5.m4938s();
                                    w41VarM4938s2.f66367c = or3VarM20123g3.m18309w().m20123g();
                                    b64Var = new b64(new co7(w41VarM4938s2), j88Var);
                                    j88Var2 = null;
                                } else {
                                    j3 = millis + jMax2;
                                    if (j3 < millis2 + time2) {
                                        h88VarM14326b = j88Var.m14326b();
                                        if (j3 >= time2) {
                                            h88VarM14326b.f41984f.m18305j("Warning", "110 HttpURLConnection \"Response is stale\"");
                                        }
                                        if (jMax2 > 86400000 && j88Var.m14325a().f40928c == -1 && dateM35a == null) {
                                            h88VarM14326b.f41984f.m18305j("Warning", "113 HttpURLConnection \"Heuristic expiration\"");
                                        }
                                        j88Var2 = null;
                                        b64Var = new b64(j88Var2, h88VarM14326b.m13143a());
                                    } else {
                                        if (str != null) {
                                            str4 = str;
                                            str5 = "If-None-Match";
                                        } else {
                                            if (dateM35a2 != null) {
                                                str4 = str2;
                                            } else if (dateM35a3 != null) {
                                                str4 = str3;
                                            } else {
                                                j88Var2 = null;
                                                b64Var = new b64(co7Var5, j88Var2);
                                            }
                                            str5 = "If-Modified-Since";
                                        }
                                        or3 or3VarM20123g4 = qr3Var6.m20123g();
                                        str4.getClass();
                                        oha.m17995a(or3VarM20123g4, str5, str4);
                                        w41 w41VarM4938s3 = co7Var5.m4938s();
                                        w41VarM4938s3.f66367c = or3VarM20123g4.m18309w().m20123g();
                                        b64Var = new b64(new co7(w41VarM4938s3), j88Var);
                                        j88Var2 = null;
                                    }
                                }
                            }
                            j2 = 0;
                            i = gl0VarM4934j.f40928c;
                            if (i != -1) {
                                time2 = Math.min(time2, timeUnit.toMillis(i));
                            }
                            i2 = gl0VarM4934j.f40934i;
                            if (i2 != -1) {
                                millis = timeUnit.toMillis(i2);
                            } else {
                                millis = j2;
                            }
                            if (gl0VarM14325a.f40932g) {
                                millis2 = j2;
                            } else {
                                millis2 = j2;
                            }
                            if (gl0VarM14325a.f40926a) {
                                j3 = millis + jMax2;
                                if (j3 < millis2 + time2) {
                                    h88VarM14326b = j88Var.m14326b();
                                    if (j3 >= time2) {
                                        h88VarM14326b.f41984f.m18305j("Warning", "110 HttpURLConnection \"Response is stale\"");
                                    }
                                    if (jMax2 > 86400000) {
                                        h88VarM14326b.f41984f.m18305j("Warning", "113 HttpURLConnection \"Heuristic expiration\"");
                                    }
                                    j88Var2 = null;
                                    b64Var = new b64(j88Var2, h88VarM14326b.m13143a());
                                } else {
                                    if (str != null) {
                                        str4 = str;
                                        str5 = "If-None-Match";
                                    } else {
                                        if (dateM35a2 != null) {
                                            str4 = str2;
                                        } else if (dateM35a3 != null) {
                                            str4 = str3;
                                        } else {
                                            j88Var2 = null;
                                            b64Var = new b64(co7Var5, j88Var2);
                                        }
                                        str5 = "If-Modified-Since";
                                    }
                                    or3 or3VarM20123g5 = qr3Var6.m20123g();
                                    str4.getClass();
                                    oha.m17995a(or3VarM20123g5, str5, str4);
                                    w41 w41VarM4938s4 = co7Var5.m4938s();
                                    w41VarM4938s4.f66367c = or3VarM20123g5.m18309w().m20123g();
                                    b64Var = new b64(new co7(w41VarM4938s4), j88Var);
                                    j88Var2 = null;
                                }
                            } else {
                                if (str != null) {
                                    str4 = str;
                                    str5 = "If-None-Match";
                                } else {
                                    if (dateM35a2 != null) {
                                        str4 = str2;
                                    } else if (dateM35a3 != null) {
                                        str4 = str3;
                                    } else {
                                        j88Var2 = null;
                                        b64Var = new b64(co7Var5, j88Var2);
                                    }
                                    str5 = "If-Modified-Since";
                                }
                                or3 or3VarM20123g6 = qr3Var6.m20123g();
                                str4.getClass();
                                oha.m17995a(or3VarM20123g6, str5, str4);
                                w41 w41VarM4938s5 = co7Var5.m4938s();
                                w41VarM4938s5.f66367c = or3VarM20123g6.m18309w().m20123g();
                                b64Var = new b64(new co7(w41VarM4938s5), j88Var);
                                j88Var2 = null;
                            }
                        } else {
                            j88Var2 = null;
                            b64Var = new b64(co7Var5, j88Var2);
                        }
                    } else {
                        b64Var = new b64(co7Var5, j88Var2);
                    }
                }
                if (((co7) b64Var.f8006a) != null && co7Var5.m4934j().f40935j) {
                    b64Var = new b64(j88Var2, j88Var2);
                }
                co7 co7Var6 = (co7) b64Var.f8006a;
                j88 j88Var4 = (j88) b64Var.f8007b;
                fl0 fl0Var2 = (fl0) this.f40843b;
                if (fl0Var2 != null) {
                    synchronized (fl0Var2) {
                    }
                }
                if (j88Var != null && j88Var4 == null) {
                    icb.m13766b(j88Var.f45207g);
                }
                if (co7Var6 == null && j88Var4 == null) {
                    l88 l88Var2 = m88.f50759b;
                    iy5 iy5Var2 = b9a.f8185x;
                    ArrayList arrayList = new ArrayList(20);
                    co7 co7Var7 = (co7) at4Var.f7465i;
                    co7Var7.getClass();
                    Protocol protocol2 = Protocol.HTTP_1_1;
                    protocol2.getClass();
                    return new j88(co7Var7, protocol2, "Unsatisfiable Request (only-if-cached)", 504, null, new qr3((String[]) arrayList.toArray(new String[0])), l88Var2, null, null, null, null, -1L, System.currentTimeMillis(), null, iy5Var2);
                }
                if (co7Var6 == null) {
                    j88Var4.getClass();
                    h88 h88VarM14326b3 = j88Var4.m14326b();
                    j88 j88VarM14445e2 = jga.m14445e(j88Var4);
                    h88.m13142b("cacheResponse", j88VarM14445e2);
                    h88VarM14326b3.f41988j = j88VarM14445e2;
                    return h88VarM14326b3.m13143a();
                }
                try {
                    j88 j88VarM3031f2 = at4Var.m3031f(co7Var6);
                    if (j88Var4 == null) {
                        h88 h88VarM14326b4 = j88VarM3031f2.m14326b();
                        if (j88Var4 != null) {
                            j88VarM14445e = jga.m14445e(j88Var4);
                        } else {
                            j88VarM14445e = j88Var2;
                        }
                        h88.m13142b("cacheResponse", j88VarM14445e);
                        h88VarM14326b4.f41988j = j88VarM14445e;
                        j88 j88VarM14445e3 = jga.m14445e(j88VarM3031f2);
                        h88.m13142b("networkResponse", j88VarM14445e3);
                        h88VarM14326b4.f41987i = j88VarM14445e3;
                        j88VarM13143a = h88VarM14326b4.m13143a();
                        if (((fl0) this.f40843b) != null) {
                            if (!xw3.m24724a(j88VarM13143a) && AbstractC3489q9.m19790t(j88VarM13143a, co7Var6)) {
                                fl0 fl0Var3 = (fl0) this.f40843b;
                                h88 h88VarM14326b5 = j88VarM13143a.m14326b();
                                h88VarM14326b5.f41979a = co7Var6;
                                j88 j88VarM13143a3 = h88VarM14326b5.m13143a();
                                fl0Var3.getClass();
                                co7 co7Var8 = j88VarM13143a3.f45201a;
                                String str10 = (String) co7Var8.f10359b;
                                try {
                                    if (l70.m15960w(str10)) {
                                        fl0Var3.m11929a(co7Var8);
                                    } else {
                                        if (str10.equals("GET") && !AbstractC3423or.m18277r0(j88VarM13143a3.f45206f).contains("*")) {
                                            dl0 dl0Var2 = new dl0(j88VarM13143a3);
                                            try {
                                                gh2 gh2Var = fl0Var3.f39240a;
                                                String strM18218C = AbstractC3423or.m18218C((ex3) co7Var8.f10360c);
                                                Regex regex = gh2.f40794O;
                                                c3552rxM12646c = gh2Var.m12646c(strM18218C, -1L);
                                                if (c3552rxM12646c == 0) {
                                                    pc0Var = j88Var2;
                                                } else {
                                                    try {
                                                        dl0Var2.m10448c(c3552rxM12646c);
                                                        pc0 pc0Var2 = new pc0();
                                                        pc0Var2.f55941e = fl0Var3;
                                                        pc0Var2.f55938b = c3552rxM12646c;
                                                        t89 t89VarM20975j = c3552rxM12646c.m20975j(1);
                                                        pc0Var2.f55939c = t89VarM20975j;
                                                        pc0Var2.f55940d = new el0(fl0Var3, pc0Var2, t89VarM20975j);
                                                        pc0Var = pc0Var2;
                                                    } catch (IOException unused3) {
                                                        if (c3552rxM12646c != 0) {
                                                            c3552rxM12646c.m20967a();
                                                        }
                                                        pc0Var = j88Var2;
                                                    }
                                                }
                                            } catch (IOException unused4) {
                                                c3552rxM12646c = j88Var2;
                                            }
                                        } else {
                                            pc0Var = j88Var2;
                                        }
                                        if (pc0Var != 0) {
                                            hl0 hl0Var = new hl0(j88VarM13143a.f45207g.mo3003e(), pc0Var, r46.m20389o((el0) pc0Var.f55940d));
                                            strM20121d = j88VarM13143a.f45206f.m20121d("Content-Type");
                                            if (strM20121d == null) {
                                                str6 = j88Var2;
                                            } else {
                                                str6 = strM20121d;
                                            }
                                            long jMo3001b = j88VarM13143a.f45207g.mo3001b();
                                            h88 h88VarM14326b6 = j88VarM13143a.m14326b();
                                            h88VarM14326b6.f41985g = new o18(str6, jMo3001b, new e18(hl0Var));
                                            j88VarM13143a2 = h88VarM14326b6.m13143a();
                                        }
                                    }
                                    break;
                                } catch (IOException unused5) {
                                }
                                pc0Var = j88Var2;
                                if (pc0Var != 0) {
                                    hl0 hl0Var2 = new hl0(j88VarM13143a.f45207g.mo3003e(), pc0Var, r46.m20389o((el0) pc0Var.f55940d));
                                    strM20121d = j88VarM13143a.f45206f.m20121d("Content-Type");
                                    if (strM20121d == null) {
                                        str6 = j88Var2;
                                    } else {
                                        str6 = strM20121d;
                                    }
                                    long jMo3001b2 = j88VarM13143a.f45207g.mo3001b();
                                    h88 h88VarM14326b7 = j88VarM13143a.m14326b();
                                    h88VarM14326b7.f41985g = new o18(str6, jMo3001b2, new e18(hl0Var2));
                                    j88VarM13143a2 = h88VarM14326b7.m13143a();
                                }
                            } else if (l70.m15960w((String) co7Var6.f10359b)) {
                                try {
                                    ((fl0) this.f40843b).m11929a(co7Var6);
                                    break;
                                } catch (IOException unused6) {
                                }
                            }
                        }
                        return j88VarM13143a;
                    }
                    if (j88VarM3031f2.f45204d != 304) {
                        icb.m13766b(j88Var4.f45207g);
                        h88 h88VarM14326b8 = j88VarM3031f2.m14326b();
                        if (j88Var4 != null) {
                            j88VarM14445e = jga.m14445e(j88Var4);
                        } else {
                            j88VarM14445e = j88Var2;
                        }
                        h88.m13142b("cacheResponse", j88VarM14445e);
                        h88VarM14326b8.f41988j = j88VarM14445e;
                        j88 j88VarM14445e4 = jga.m14445e(j88VarM3031f2);
                        h88.m13142b("networkResponse", j88VarM14445e4);
                        h88VarM14326b8.f41987i = j88VarM14445e4;
                        j88VarM13143a = h88VarM14326b8.m13143a();
                        if (((fl0) this.f40843b) != null) {
                            if (!xw3.m24724a(j88VarM13143a)) {
                                if (l70.m15960w((String) co7Var6.f10359b)) {
                                    ((fl0) this.f40843b).m11929a(co7Var6);
                                }
                            } else if (l70.m15960w((String) co7Var6.f10359b)) {
                                ((fl0) this.f40843b).m11929a(co7Var6);
                            }
                            break;
                        }
                        return j88VarM13143a;
                    }
                    h88 h88VarM14326b9 = j88Var4.m14326b();
                    qr3 qr3Var7 = j88Var4.f45206f;
                    qr3 qr3Var8 = j88VarM3031f2.f45206f;
                    ArrayList arrayList2 = new ArrayList(20);
                    int size2 = qr3Var7.size();
                    for (int i8 = 0; i8 < size2; i8++) {
                        String strM20122f2 = qr3Var7.m20122f(i8);
                        String strM20124h2 = qr3Var7.m20124h(i8);
                        if ((!"Warning".equalsIgnoreCase(strM20122f2) || !cl9.m4842Y(strM20124h2, "1", false)) && ("Content-Length".equalsIgnoreCase(strM20122f2) || "Content-Encoding".equalsIgnoreCase(strM20122f2) || "Content-Type".equalsIgnoreCase(strM20122f2) || !AbstractC3695vr.m23513x(strM20122f2) || qr3Var8.m20121d(strM20122f2) == null)) {
                            arrayList2.add(strM20122f2);
                            arrayList2.add(vk9.m23376L0(strM20124h2).toString());
                        }
                    }
                    int size3 = qr3Var8.size();
                    for (int i9 = 0; i9 < size3; i9++) {
                        String strM20122f3 = qr3Var8.m20122f(i9);
                        if (!"Content-Length".equalsIgnoreCase(strM20122f3) && !"Content-Encoding".equalsIgnoreCase(strM20122f3) && !"Content-Type".equalsIgnoreCase(strM20122f3) && AbstractC3695vr.m23513x(strM20122f3)) {
                            String strM20124h3 = qr3Var8.m20124h(i9);
                            arrayList2.add(strM20122f3);
                            arrayList2.add(vk9.m23376L0(strM20124h3).toString());
                        }
                    }
                    h88VarM14326b9.f41984f = new qr3((String[]) arrayList2.toArray(new String[0])).m20123g();
                    h88VarM14326b9.f41990l = j88VarM3031f2.f45212l;
                    h88VarM14326b9.f41991m = j88VarM3031f2.f45196H;
                    j88 j88VarM14445e5 = jga.m14445e(j88Var4);
                    h88.m13142b("cacheResponse", j88VarM14445e5);
                    h88VarM14326b9.f41988j = j88VarM14445e5;
                    j88 j88VarM14445e6 = jga.m14445e(j88VarM3031f2);
                    h88.m13142b("networkResponse", j88VarM14445e6);
                    h88VarM14326b9.f41987i = j88VarM14445e6;
                    j88VarM13143a2 = h88VarM14326b9.m13143a();
                    j88VarM3031f2.f45207g.close();
                    fl0 fl0Var4 = (fl0) this.f40843b;
                    fl0Var4.getClass();
                    synchronized (fl0Var4) {
                    }
                    ((fl0) this.f40843b).getClass();
                    dl0 dl0Var3 = new dl0(j88VarM13143a2);
                    m88 m88Var2 = j88Var4.f45207g;
                    m88Var2.getClass();
                    bh2 bh2Var = ((cl0) m88Var2).f10218c;
                    try {
                        c3552rxM12646c2 = bh2Var.f8536d.m12646c(bh2Var.f8533a, bh2Var.f8534b);
                        if (c3552rxM12646c2 != 0) {
                            try {
                                dl0Var3.m10448c(c3552rxM12646c2);
                                c3552rxM12646c2.m20968c();
                                break;
                            } catch (IOException unused7) {
                                if (c3552rxM12646c2 != 0) {
                                    try {
                                        c3552rxM12646c2.m20967a();
                                        break;
                                    } catch (IOException unused8) {
                                    }
                                }
                            }
                        }
                    } catch (IOException unused9) {
                        c3552rxM12646c2 = j88Var2;
                    }
                    return j88VarM13143a2;
                } catch (Throwable th) {
                    if (j88Var != null) {
                        icb.m13766b(j88Var.f45207g);
                    }
                    throw th;
                }
            default:
                co7 co7Var9 = (co7) at4Var.f7465i;
                i18 i18Var = (i18) at4Var.f7463g;
                List listM22604V0 = EmptyList.f47638a;
                j88 j88Var5 = null;
                int i10 = 0;
                co7 co7VarM12671b = co7Var9;
                while (true) {
                    boolean z3 = true;
                    while (true) {
                        co7VarM12671b.getClass();
                        if (i18Var.f43351j == null) {
                            synchronized (i18Var) {
                                if (i18Var.f43353l) {
                                    throw new IllegalStateException("cannot make a new request because the previous response is still open: please call response.close()");
                                }
                                if (i18Var.f43352k || i18Var.f43337I || i18Var.f43336H) {
                                    throw new IllegalStateException("Check failed.");
                                }
                            }
                            if (z3) {
                                dr6 dr6Var = i18Var.f43342a;
                                as9 as9Var = dr6Var.f36083A;
                                kl2 kl2Var = i18Var.f43344c;
                                int i11 = dr6Var.f36108x;
                                int i12 = dr6Var.f36109y;
                                int i13 = at4Var.f7459c;
                                int i14 = at4Var.f7460d;
                                boolean z4 = dr6Var.f36089e;
                                boolean z5 = dr6Var.f36090f;
                                ex3 ex3Var6 = (ex3) co7VarM12671b.f10360c;
                                ex3Var6.getClass();
                                if (ex3Var6.m11380f()) {
                                    SSLSocketFactory sSLSocketFactory2 = dr6Var.f36100p;
                                    if (sSLSocketFactory2 != null) {
                                        yq6 yq6Var2 = dr6Var.f36104t;
                                        xo0Var = dr6Var.f36105u;
                                        sSLSocketFactory = sSLSocketFactory2;
                                        yq6Var = yq6Var2;
                                    } else {
                                        C3386nv.m17633t("CLEARTEXT-only client");
                                    }
                                } else {
                                    sSLSocketFactory = null;
                                    yq6Var = null;
                                    xo0Var = null;
                                }
                                p18 p18Var = new p18(as9Var, kl2Var, i11, i12, i13, i14, z4, z5, new C3104i9(ex3Var6.f38027d, ex3Var6.f38028e, dr6Var.f36096l, dr6Var.f36099o, sSLSocketFactory, yq6Var, xo0Var, dr6Var.f36098n, dr6Var.f36103s, dr6Var.f36102r, dr6Var.f36097m), i18Var.f43342a.f36110z, i18Var, co7VarM12671b);
                                co7VarM12671b = co7VarM12671b;
                                dr6 dr6Var2 = i18Var.f43342a;
                                i18Var.f43348g = dr6Var2.f36090f ? new pz2(p18Var, dr6Var2.f36083A) : new or3(p18Var);
                            }
                            try {
                                if (i18Var.f43339K) {
                                    throw new IOException("Canceled");
                                }
                                try {
                                } catch (IOException e) {
                                    if (!m12672c(e, i18Var, co7VarM12671b)) {
                                        byte[] bArr = icb.f43946a;
                                        Iterator it2 = listM22604V0.iterator();
                                        while (it2.hasNext()) {
                                            lda.m16117c(e, (Exception) it2.next());
                                        }
                                        throw e;
                                    }
                                    listM22604V0 = u91.m22604V0(listM22604V0, e);
                                    i18Var.m13622e(true);
                                    z3 = false;
                                }
                            } catch (Throwable th2) {
                                i18Var.m13622e(true);
                                throw th2;
                            }
                        } else {
                            C3386nv.m17633t("Check failed.");
                        }
                        break;
                    }
                    h88 h88VarM14326b10 = at4Var.m3031f(co7VarM12671b).m14326b();
                    h88VarM14326b10.f41979a = co7VarM12671b;
                    h88VarM14326b10.f41989k = j88Var5 != null ? jga.m14445e(j88Var5) : null;
                    j88 j88VarM13143a4 = h88VarM14326b10.m13143a();
                    co7VarM12671b = m12671b(j88VarM13143a4, i18Var.f43351j);
                    if (co7VarM12671b == null) {
                        z2 = false;
                    } else {
                        z2 = false;
                        z68 z68Var2 = (z68) co7VarM12671b.f10362e;
                        if (z68Var2 == null || !z68Var2.mo16636c()) {
                            icb.m13766b(j88VarM13143a4.f45207g);
                            int i15 = i10 + 1;
                            if (i15 > 20) {
                                throw new ProtocolException("Too many follow-up requests: " + i15);
                            }
                            i18Var.m13622e(true);
                            j88Var5 = j88VarM13143a4;
                            i10 = i15;
                        }
                    }
                    i18Var.m13622e(z2);
                    return j88VarM13143a4;
                }
                return null;
        }
    }

    /* JADX WARN: Code duplicated, block: B:103:0x0147  */
    /* JADX WARN: Code duplicated, block: B:109:0x0158 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:110:0x015a  */
    /* JADX WARN: Code duplicated, block: B:113:0x0164  */
    /* JADX WARN: Code duplicated, block: B:116:0x0189  */
    /* JADX WARN: Code duplicated, block: B:74:0x00e7  */
    /* JADX WARN: Code duplicated, block: B:77:0x00f2  */
    /* JADX WARN: Code duplicated, block: B:79:0x00fc  */
    /* JADX WARN: Code duplicated, block: B:83:0x0102  */
    /* JADX WARN: Code duplicated, block: B:88:0x0115  */
    /* JADX WARN: Code duplicated, block: B:89:0x011a  */
    /* JADX WARN: Code duplicated, block: B:99:0x013b  */
    /* JADX INFO: renamed from: b */
    public co7 m12671b(j88 j88Var, C3552rx c3552rx) throws ProtocolException {
        dr6 dr6Var;
        String strM20121d;
        co7 co7Var;
        dx3 dx3Var;
        ex3 ex3VarM10734a;
        w41 w41VarM4938s;
        boolean z;
        z68 z68Var;
        j88 j88Var2;
        ij8 ij8Var = c3552rx != null ? c3552rx.m20972g().f44898c : null;
        int i = j88Var.f45204d;
        co7 co7Var2 = j88Var.f45201a;
        String str = (String) co7Var2.f10359b;
        if (i == 307 || i == 308) {
            dr6Var = (dr6) this.f40843b;
            if (dr6Var.f36092h) {
                strM20121d = j88Var.f45206f.m20121d("Location");
                if (strM20121d == null) {
                    strM20121d = null;
                }
                co7Var = j88Var.f45201a;
                if (strM20121d != null) {
                    ex3 ex3Var = (ex3) co7Var.f10360c;
                    ex3Var.getClass();
                    try {
                        dx3Var = new dx3();
                        dx3Var.m10737d(ex3Var, strM20121d);
                    } catch (IllegalArgumentException unused) {
                        dx3Var = null;
                    }
                    if (dx3Var != null) {
                        ex3VarM10734a = dx3Var.m10734a();
                    } else {
                        ex3VarM10734a = null;
                    }
                    if (ex3VarM10734a != null && (fa4.m11650l(ex3VarM10734a.f38024a, ((ex3) co7Var.f10360c).f38024a) || dr6Var.f36093i)) {
                        w41VarM4938s = co7Var.m4938s();
                        if (l70.m15963z(str)) {
                            int i2 = j88Var.f45204d;
                            z = !str.equals("PROPFIND") || i2 == 308 || i2 == 307;
                            if (!str.equals("PROPFIND") || i2 == 308 || i2 == 307) {
                                w41VarM4938s.m23736y(str, z ? (z68) co7Var.f10362e : null);
                            } else {
                                w41VarM4938s.m23736y("GET", null);
                            }
                            if (!z) {
                                ((or3) w41VarM4938s.f66367c).m18300M("Transfer-Encoding");
                                ((or3) w41VarM4938s.f66367c).m18300M("Content-Length");
                                ((or3) w41VarM4938s.f66367c).m18300M("Content-Type");
                            }
                        }
                        if (!kcb.m15110a((ex3) co7Var.f10360c, ex3VarM10734a)) {
                            ((or3) w41VarM4938s.f66367c).m18300M("Authorization");
                        }
                        w41VarM4938s.f66365a = ex3VarM10734a;
                        return new co7(w41VarM4938s);
                    }
                }
            }
        } else {
            if (i == 401) {
                ((dr6) this.f40843b).f36091g.getClass();
                return null;
            }
            if (i == 421) {
                z68 z68Var2 = (z68) co7Var2.f10362e;
                if ((z68Var2 == null || !z68Var2.mo16636c()) && c3552rx != null && !fa4.m11650l(((su2) c3552rx.f59988c).mo18304d().f55446i.f43720h.f38027d, ((ru2) c3552rx.f59989d).mo12228h().mo11850h().f44192a.f43720h.f38027d)) {
                    j18 j18VarM20972g = c3552rx.m20972g();
                    synchronized (j18VarM20972g) {
                        j18VarM20972g.f44906k = true;
                    }
                    return j88Var.f45201a;
                }
            } else if (i == 503) {
                j88 j88Var3 = j88Var.f45211k;
                if ((j88Var3 == null || j88Var3.f45204d != 503) && m12670d(j88Var, Integer.MAX_VALUE) == 0) {
                    return j88Var.f45201a;
                }
            } else {
                if (i == 407) {
                    ij8Var.getClass();
                    if (ij8Var.f44193b.type() != Proxy.Type.HTTP) {
                        throw new ProtocolException("Received HTTP_PROXY_AUTH (407) code while not using proxy");
                    }
                    ((dr6) this.f40843b).f36098n.getClass();
                    return null;
                }
                if (i != 408) {
                    switch (i) {
                        case 300:
                        case 301:
                        case 302:
                        case 303:
                            dr6Var = (dr6) this.f40843b;
                            if (dr6Var.f36092h) {
                                strM20121d = j88Var.f45206f.m20121d("Location");
                                if (strM20121d == null) {
                                    strM20121d = null;
                                }
                                co7Var = j88Var.f45201a;
                                if (strM20121d != null) {
                                    ex3 ex3Var2 = (ex3) co7Var.f10360c;
                                    ex3Var2.getClass();
                                    dx3Var = new dx3();
                                    dx3Var.m10737d(ex3Var2, strM20121d);
                                    if (dx3Var != null) {
                                        ex3VarM10734a = dx3Var.m10734a();
                                    } else {
                                        ex3VarM10734a = null;
                                    }
                                    if (ex3VarM10734a != null) {
                                        w41VarM4938s = co7Var.m4938s();
                                        if (l70.m15963z(str)) {
                                            int i3 = j88Var.f45204d;
                                            if (str.equals("PROPFIND")) {
                                            }
                                            if (str.equals("PROPFIND")) {
                                                w41VarM4938s.m23736y(str, z ? (z68) co7Var.f10362e : null);
                                            } else {
                                                w41VarM4938s.m23736y(str, z ? (z68) co7Var.f10362e : null);
                                            }
                                            if (!z) {
                                                ((or3) w41VarM4938s.f66367c).m18300M("Transfer-Encoding");
                                                ((or3) w41VarM4938s.f66367c).m18300M("Content-Length");
                                                ((or3) w41VarM4938s.f66367c).m18300M("Content-Type");
                                            }
                                        }
                                        if (!kcb.m15110a((ex3) co7Var.f10360c, ex3VarM10734a)) {
                                            ((or3) w41VarM4938s.f66367c).m18300M("Authorization");
                                        }
                                        w41VarM4938s.f66365a = ex3VarM10734a;
                                        return new co7(w41VarM4938s);
                                    }
                                }
                            }
                        default:
                            return null;
                    }
                } else if (((dr6) this.f40843b).f36089e && (((z68Var = (z68) co7Var2.f10362e) == null || !z68Var.mo16636c()) && (((j88Var2 = j88Var.f45211k) == null || j88Var2.f45204d != 408) && m12670d(j88Var, 0) <= 0))) {
                    return j88Var.f45201a;
                }
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: c */
    public boolean m12672c(IOException iOException, i18 i18Var, co7 co7Var) {
        z68 z68Var;
        boolean z = iOException instanceof ConnectionShutdownException;
        if (!((dr6) this.f40843b).f36089e) {
            return false;
        }
        if ((!z && (((z68Var = (z68) co7Var.f10362e) != null && z68Var.mo16636c()) || (iOException instanceof FileNotFoundException))) || (iOException instanceof ProtocolException)) {
            return false;
        }
        if (iOException instanceof InterruptedIOException) {
            if (!(iOException instanceof SocketTimeoutException) || !z) {
                return false;
            }
        } else if (((iOException instanceof SSLHandshakeException) && (iOException.getCause() instanceof CertificateException)) || (iOException instanceof SSLPeerUnverifiedException)) {
            return false;
        }
        C3552rx c3552rx = i18Var.f43340L;
        if (c3552rx == null || !c3552rx.f59986a) {
            return false;
        }
        su2 su2Var = i18Var.f43348g;
        su2Var.getClass();
        p18 p18VarMo18304d = su2Var.mo18304d();
        C3552rx c3552rx2 = i18Var.f43340L;
        return p18VarMo18304d.m18853a(c3552rx2 != null ? c3552rx2.m20972g() : null);
    }

    public gi0(fl0 fl0Var) {
        this.f40843b = fl0Var;
    }

    public gi0(dr6 dr6Var) {
        dr6Var.getClass();
        this.f40843b = dr6Var;
    }
}
