package p000;

import java.nio.charset.Charset;
import okhttp3.logging.HttpLoggingInterceptor$Level;

/* JADX INFO: loaded from: classes.dex */
public final class yw3 implements x84 {

    /* JADX INFO: renamed from: a */
    public final gr7 f70565a = gr7.f41238c;

    /* JADX INFO: renamed from: b */
    public volatile HttpLoggingInterceptor$Level f70566b = HttpLoggingInterceptor$Level.NONE;

    /* JADX WARN: Code duplicated, block: B:46:0x0105 A[LOOP:0: B:45:0x0103->B:46:0x0105, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:85:0x0229  */
    /* JADX WARN: Instruction removed from duplicated block: B:85:0x0229, please report this as an issue */
    @Override // p000.x84
    /* JADX INFO: renamed from: a */
    public final j88 mo8434a(at4 at4Var) throws Exception {
        boolean z;
        String str;
        Long lValueOf;
        Charset charsetM24709a;
        int size;
        int i;
        Long lValueOf2;
        Charset charsetM24709a2;
        HttpLoggingInterceptor$Level httpLoggingInterceptor$Level = this.f70566b;
        co7 co7Var = (co7) at4Var.f7465i;
        if (httpLoggingInterceptor$Level == HttpLoggingInterceptor$Level.NONE) {
            return at4Var.m3031f(co7Var);
        }
        boolean z2 = true;
        boolean z3 = httpLoggingInterceptor$Level == HttpLoggingInterceptor$Level.BODY;
        if (!z3 && httpLoggingInterceptor$Level != HttpLoggingInterceptor$Level.HEADERS) {
            z2 = false;
        }
        z68 z68Var = (z68) co7Var.f10362e;
        C3552rx c3552rx = (C3552rx) at4Var.f7464h;
        j18 j18VarM20972g = c3552rx != null ? c3552rx.m20972g() : null;
        StringBuilder sb = new StringBuilder("--> ");
        sb.append((String) co7Var.f10359b);
        sb.append(' ');
        ex3 ex3Var = (ex3) co7Var.f10360c;
        ex3Var.getClass();
        sb.append(ex3Var.f38032i);
        String str2 = " ";
        sb.append(j18VarM20972g != null ? " " + j18VarM20972g.f44902g : "");
        String string = sb.toString();
        if (!z2 && z68Var != null) {
            StringBuilder sbM22999v = ux5.m22999v(string, " (");
            sbM22999v.append(z68Var.mo159a());
            sbM22999v.append("-byte body)");
            string = sbM22999v.toString();
        }
        this.f70565a.m12856f(string);
        if (z2) {
            qr3 qr3Var = (qr3) co7Var.f10361d;
            if (z68Var != null) {
                xv5 xv5VarMo160b = z68Var.mo160b();
                z = z3;
                if (xv5VarMo160b != null && qr3Var.m20121d("Content-Type") == null) {
                    this.f70565a.m12856f("Content-Type: " + xv5VarMo160b);
                }
                if (z68Var.mo159a() != -1 && qr3Var.m20121d("Content-Length") == null) {
                    this.f70565a.m12856f("Content-Length: " + z68Var.mo159a());
                }
                size = qr3Var.size();
                for (i = 0; i < size; i++) {
                    m25359b(qr3Var, i);
                }
                if (z || z68Var == null) {
                    this.f70565a.m12856f("--> END " + ((String) co7Var.f10359b));
                } else {
                    String strM20121d = ((qr3) co7Var.f10361d).m20121d("Content-Encoding");
                    if (strM20121d != null && !strM20121d.equalsIgnoreCase("identity") && !strM20121d.equalsIgnoreCase("gzip")) {
                        this.f70565a.m12856f(AbstractC3393o1.m17738m(new StringBuilder("--> END "), (String) co7Var.f10359b, " (encoded body omitted)"));
                    } else if (z68Var.mo16636c()) {
                        this.f70565a.m12856f(AbstractC3393o1.m17738m(new StringBuilder("--> END "), (String) co7Var.f10359b, " (one-shot body omitted)"));
                    } else {
                        aj0 aj0Var = new aj0();
                        z68Var.mo161d(aj0Var);
                        if ("gzip".equalsIgnoreCase(qr3Var.m20121d("Content-Encoding"))) {
                            lValueOf2 = Long.valueOf(aj0Var.f723b);
                            iq3 iq3Var = new iq3(aj0Var);
                            try {
                                aj0Var = new aj0();
                                aj0Var.mo456B(iq3Var);
                                iq3Var.close();
                            } catch (Throwable th) {
                                try {
                                    throw th;
                                } catch (Throwable th2) {
                                    AbstractC3584sr.m21646y(iq3Var, th);
                                    throw th2;
                                }
                            }
                        } else {
                            lValueOf2 = null;
                        }
                        xv5 xv5VarMo160b2 = z68Var.mo160b();
                        if (xv5VarMo160b2 == null || (charsetM24709a2 = xv5.m24709a(xv5VarMo160b2)) == null) {
                            charsetM24709a2 = yu0.f70463a;
                        }
                        this.f70565a.m12856f("");
                        boolean zM17088G = AbstractC3352my.m17088G(aj0Var);
                        gr7 gr7Var = this.f70565a;
                        if (!zM17088G) {
                            gr7Var.m12856f("--> END " + ((String) co7Var.f10359b) + " (binary " + z68Var.mo159a() + "-byte body omitted)");
                        } else if (lValueOf2 != null) {
                            gr7Var.m12856f("--> END " + ((String) co7Var.f10359b) + " (" + aj0Var.f723b + "-byte, " + lValueOf2.longValue() + "-gzipped-byte body)");
                        } else {
                            gr7Var.m12856f(aj0Var.mo462K(charsetM24709a2));
                            this.f70565a.m12856f("--> END " + ((String) co7Var.f10359b) + " (" + z68Var.mo159a() + "-byte body)");
                        }
                    }
                }
            } else {
                z = z3;
                z2 = z2;
                str2 = " ";
            }
            size = qr3Var.size();
            while (i < size) {
                m25359b(qr3Var, i);
            }
            if (z) {
                this.f70565a.m12856f("--> END " + ((String) co7Var.f10359b));
            } else {
                this.f70565a.m12856f("--> END " + ((String) co7Var.f10359b));
            }
        } else {
            z = z3;
            z2 = z2;
            str2 = " ";
        }
        long jNanoTime = System.nanoTime();
        try {
            j88 j88VarM3031f = at4Var.m3031f(co7Var);
            long jNanoTime2 = (System.nanoTime() - jNanoTime) / 1000000;
            m88 m88Var = j88VarM3031f.f45207g;
            m88Var.getClass();
            long jMo3001b = m88Var.mo3001b();
            String str3 = jMo3001b != -1 ? jMo3001b + "-byte" : "unknown-length";
            gr7 gr7Var2 = this.f70565a;
            StringBuilder sb2 = new StringBuilder();
            sb2.append("<-- " + j88VarM3031f.f45204d);
            if (j88VarM3031f.f45203c.length() > 0) {
                str = str2;
                sb2.append(str + j88VarM3031f.f45203c);
            } else {
                str = str2;
            }
            StringBuilder sb3 = new StringBuilder(str);
            ex3 ex3Var2 = (ex3) j88VarM3031f.f45201a.f10360c;
            ex3Var2.getClass();
            sb3.append(ex3Var2.f38032i);
            sb3.append(" (");
            sb3.append(jNanoTime2);
            sb3.append("ms");
            sb2.append(sb3.toString());
            if (!z2) {
                sb2.append(", " + str3 + " body");
            }
            sb2.append(")");
            gr7Var2.m12856f(sb2.toString());
            if (z2) {
                qr3 qr3Var2 = j88VarM3031f.f45206f;
                int size2 = qr3Var2.size();
                for (int i2 = 0; i2 < size2; i2++) {
                    m25359b(qr3Var2, i2);
                }
                if (z && xw3.m24724a(j88VarM3031f)) {
                    String strM20121d2 = j88VarM3031f.f45206f.m20121d("Content-Encoding");
                    if (strM20121d2 != null && !strM20121d2.equalsIgnoreCase("identity") && !strM20121d2.equalsIgnoreCase("gzip")) {
                        this.f70565a.m12856f("<-- END HTTP (encoded body omitted)");
                        return j88VarM3031f;
                    }
                    xv5 xv5VarMo3002c = j88VarM3031f.f45207g.mo3002c();
                    if (xv5VarMo3002c != null && xv5VarMo3002c.f68848b.equals("text") && xv5VarMo3002c.f68849c.equals("event-stream")) {
                        this.f70565a.m12856f("<-- END HTTP (streaming)");
                        return j88VarM3031f;
                    }
                    hj0 hj0VarMo3003e = m88Var.mo3003e();
                    hj0VarMo3003e.mo464P(Long.MAX_VALUE);
                    long jNanoTime3 = (System.nanoTime() - jNanoTime) / 1000000;
                    aj0 aj0VarMo482h = hj0VarMo3003e.mo482h();
                    if ("gzip".equalsIgnoreCase(qr3Var2.m20121d("Content-Encoding"))) {
                        lValueOf = Long.valueOf(aj0VarMo482h.f723b);
                        iq3 iq3Var2 = new iq3(aj0VarMo482h.clone());
                        try {
                            aj0VarMo482h = new aj0();
                            aj0VarMo482h.mo456B(iq3Var2);
                            iq3Var2.close();
                        } catch (Throwable th3) {
                            try {
                                throw th3;
                            } catch (Throwable th4) {
                                AbstractC3584sr.m21646y(iq3Var2, th3);
                                throw th4;
                            }
                        }
                    } else {
                        lValueOf = null;
                    }
                    xv5 xv5VarMo3002c2 = m88Var.mo3002c();
                    if (xv5VarMo3002c2 == null || (charsetM24709a = xv5.m24709a(xv5VarMo3002c2)) == null) {
                        charsetM24709a = yu0.f70463a;
                    }
                    if (!AbstractC3352my.m17088G(aj0VarMo482h)) {
                        this.f70565a.m12856f("");
                        this.f70565a.m12856f(wq1.m24113i(aj0VarMo482h.f723b, "-byte body omitted)", ux5.m22996s(jNanoTime3, "<-- END HTTP (", "ms, binary ")));
                        return j88VarM3031f;
                    }
                    if (jMo3001b != 0) {
                        this.f70565a.m12856f("");
                        this.f70565a.m12856f(aj0VarMo482h.clone().mo462K(charsetM24709a));
                    }
                    gr7 gr7Var3 = this.f70565a;
                    StringBuilder sb4 = new StringBuilder();
                    StringBuilder sbM22996s = ux5.m22996s(jNanoTime3, "<-- END HTTP (", "ms, ");
                    sbM22996s.append(aj0VarMo482h.f723b);
                    sbM22996s.append("-byte");
                    sb4.append(sbM22996s.toString());
                    if (lValueOf != null) {
                        sb4.append(", " + lValueOf.longValue() + "-gzipped-byte");
                    }
                    sb4.append(" body)");
                    gr7Var3.m12856f(sb4.toString());
                    return j88VarM3031f;
                }
                this.f70565a.m12856f("<-- END HTTP");
            }
            return j88VarM3031f;
        } catch (Exception e) {
            long jNanoTime4 = (System.nanoTime() - jNanoTime) / 1000000;
            StringBuilder sb5 = new StringBuilder(str2);
            ex3 ex3Var3 = (ex3) co7Var.f10360c;
            ex3Var3.getClass();
            sb5.append(ex3Var3.f38032i);
            sb5.append(" (");
            sb5.append(jNanoTime4);
            sb5.append("ms)");
            this.f70565a.m12856f(("<-- HTTP FAILED: " + e + '.').concat(sb5.toString()));
            throw e;
        }
    }

    /* JADX INFO: renamed from: b */
    public final void m25359b(qr3 qr3Var, int i) {
        qr3Var.m20122f(i);
        this.f70565a.m12856f(qr3Var.m20122f(i) + ": " + qr3Var.m20124h(i));
    }
}
