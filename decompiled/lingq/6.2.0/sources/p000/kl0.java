package p000;

import android.graphics.Bitmap;
import coil.util.AbstractC0866b;
import java.util.Date;
import java.util.List;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes.dex */
public final class kl0 {

    /* JADX INFO: renamed from: a */
    public final co7 f47467a;

    /* JADX INFO: renamed from: b */
    public final jl0 f47468b;

    /* JADX INFO: renamed from: c */
    public final Date f47469c;

    /* JADX INFO: renamed from: d */
    public final String f47470d;

    /* JADX INFO: renamed from: e */
    public final Date f47471e;

    /* JADX INFO: renamed from: f */
    public final String f47472f;

    /* JADX INFO: renamed from: g */
    public final Date f47473g;

    /* JADX INFO: renamed from: h */
    public final long f47474h;

    /* JADX INFO: renamed from: i */
    public final long f47475i;

    /* JADX INFO: renamed from: j */
    public final String f47476j;

    /* JADX INFO: renamed from: k */
    public final int f47477k;

    public kl0(co7 co7Var, jl0 jl0Var) {
        int i;
        this.f47467a = co7Var;
        this.f47468b = jl0Var;
        this.f47477k = -1;
        if (jl0Var != null) {
            this.f47474h = jl0Var.f45662c;
            this.f47475i = jl0Var.f45663d;
            qr3 qr3Var = jl0Var.f45665f;
            int size = qr3Var.size();
            for (int i2 = 0; i2 < size; i2++) {
                String strM20122f = qr3Var.m20122f(i2);
                if (strM20122f.equalsIgnoreCase("Date")) {
                    String strM20121d = qr3Var.m20121d("Date");
                    this.f47469c = strM20121d != null ? a12.m35a(strM20121d) : null;
                    this.f47470d = qr3Var.m20124h(i2);
                } else if (strM20122f.equalsIgnoreCase("Expires")) {
                    String strM20121d2 = qr3Var.m20121d("Expires");
                    this.f47473g = strM20121d2 != null ? a12.m35a(strM20121d2) : null;
                } else if (strM20122f.equalsIgnoreCase("Last-Modified")) {
                    String strM20121d3 = qr3Var.m20121d("Last-Modified");
                    this.f47471e = strM20121d3 != null ? a12.m35a(strM20121d3) : null;
                    this.f47472f = qr3Var.m20124h(i2);
                } else if (strM20122f.equalsIgnoreCase("ETag")) {
                    this.f47476j = qr3Var.m20124h(i2);
                } else if (strM20122f.equalsIgnoreCase("Age")) {
                    String strM20124h = qr3Var.m20124h(i2);
                    Bitmap.Config[] configArr = AbstractC3057h.f41581a;
                    Long lM4845b0 = cl9.m4845b0(strM20124h);
                    if (lM4845b0 != null) {
                        long jLongValue = lM4845b0.longValue();
                        i = jLongValue > 2147483647L ? Integer.MAX_VALUE : jLongValue < 0 ? 0 : (int) jLongValue;
                    } else {
                        i = -1;
                    }
                    this.f47477k = i;
                }
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:42:0x00cc  */
    /* JADX INFO: renamed from: a */
    public final ll0 m15327a() {
        String string;
        long time;
        int i;
        co7 co7Var = this.f47467a;
        ex3 ex3Var = (ex3) co7Var.f10360c;
        jl0 jl0Var = this.f47468b;
        if (jl0Var == null) {
            return new ll0(co7Var, null);
        }
        cs4 cs4Var = jl0Var.f45660a;
        if (ex3Var.m11380f() && !jl0Var.f45664e) {
            return new ll0(co7Var, null);
        }
        gl0 gl0Var = (gl0) cs4Var.getValue();
        if (co7Var.m4934j().f40927b || ((gl0) cs4Var.getValue()).f40927b || fa4.m11650l(jl0Var.f45665f.m20121d("Vary"), "*")) {
            return new ll0(co7Var, null);
        }
        gl0 gl0VarM4934j = co7Var.m4934j();
        if (!gl0VarM4934j.f40926a) {
            qr3 qr3Var = (qr3) co7Var.f10361d;
            String str = "If-Modified-Since";
            if (qr3Var.m20121d("If-Modified-Since") == null && qr3Var.m20121d("If-None-Match") == null) {
                long time2 = this.f47475i;
                Date date = this.f47469c;
                long jMax = date != null ? Math.max(0L, time2 - date.getTime()) : 0L;
                TimeUnit timeUnit = TimeUnit.SECONDS;
                int i2 = this.f47477k;
                if (i2 != -1) {
                    jMax = Math.max(jMax, timeUnit.toMillis(i2));
                }
                long time3 = this.f47474h;
                long jM4982a = jMax + (time2 - time3) + (AbstractC0866b.m4982a() - time2);
                int i3 = ((gl0) cs4Var.getValue()).f40928c;
                Date date2 = this.f47471e;
                if (i3 != -1) {
                    time = timeUnit.toMillis(i3);
                } else {
                    Date date3 = this.f47473g;
                    if (date3 != null) {
                        if (date != null) {
                            time2 = date.getTime();
                        }
                        time = date3.getTime() - time2;
                        if (time <= 0) {
                            time = 0;
                        }
                    } else if (date2 == null) {
                        time = 0;
                    } else {
                        List list = ex3Var.f38030g;
                        if (list == null) {
                            string = null;
                        } else {
                            StringBuilder sb = new StringBuilder();
                            p84.m18963h(list, sb);
                            string = sb.toString();
                        }
                        if (string != null) {
                            time = 0;
                        } else {
                            if (date != null) {
                                time3 = date.getTime();
                            }
                            long time4 = time3 - date2.getTime();
                            if (time4 > 0) {
                                time = time4 / 10;
                            } else {
                                time = 0;
                            }
                        }
                    }
                }
                int i4 = gl0VarM4934j.f40928c;
                if (i4 != -1) {
                    time = Math.min(time, timeUnit.toMillis(i4));
                }
                int i5 = gl0VarM4934j.f40934i;
                long millis = i5 != -1 ? timeUnit.toMillis(i5) : 0L;
                long millis2 = (gl0Var.f40932g || (i = gl0VarM4934j.f40933h) == -1) ? 0L : timeUnit.toMillis(i);
                if (!gl0Var.f40926a && jM4982a + millis < time + millis2) {
                    return new ll0(null, jl0Var);
                }
                String str2 = this.f47476j;
                if (str2 != null) {
                    str = "If-None-Match";
                } else if (date2 != null) {
                    str2 = this.f47472f;
                    str2.getClass();
                } else {
                    if (date == null) {
                        return new ll0(co7Var, null);
                    }
                    str2 = this.f47470d;
                    str2.getClass();
                }
                w41 w41VarM4938s = co7Var.m4938s();
                ((or3) w41VarM4938s.f66367c).m18305j(str, str2);
                return new ll0(new co7(w41VarM4938s), jl0Var);
            }
        }
        return new ll0(co7Var, null);
    }
}
