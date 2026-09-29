package p000;

import com.kochava.tracker.BuildConfig;
import java.util.UUID;

/* JADX INFO: loaded from: classes.dex */
public final class em7 extends AbstractC3572sf {

    /* JADX INFO: renamed from: i */
    public static final sq5 f37460i;

    /* JADX INFO: renamed from: b */
    public final long f37461b;

    /* JADX INFO: renamed from: c */
    public long f37462c;

    /* JADX INFO: renamed from: d */
    public long f37463d;

    /* JADX INFO: renamed from: e */
    public boolean f37464e;

    /* JADX INFO: renamed from: f */
    public String f37465f;

    /* JADX INFO: renamed from: g */
    public String f37466g;

    /* JADX INFO: renamed from: h */
    public String f37467h;

    static {
        sj5 sj5VarM20396w = r46.m20396w();
        f37460i = ux5.m22983f(sj5VarM20396w, sj5VarM20396w, BuildConfig.SDK_MODULE_NAME, "ProfileMain");
    }

    public em7(cj9 cj9Var, long j) {
        super(cj9Var);
        this.f37463d = 0L;
        this.f37464e = false;
        this.f37465f = null;
        this.f37466g = "";
        this.f37467h = null;
        this.f37461b = j;
        this.f37462c = j;
    }

    /* JADX INFO: renamed from: E */
    public static String m11224E() {
        return "KA" + (System.currentTimeMillis() / 1000) + "T" + "5.7.1".replace(".", "") + "V" + UUID.randomUUID().toString().replaceAll("-", "");
    }

    /* JADX INFO: renamed from: F */
    public final synchronized void m11225F() {
        boolean zContains;
        try {
            f37460i.m21555D("Creating a new Kochava Device ID");
            String strM11224E = m11224E();
            synchronized (this) {
                this.f37466g = strM11224E;
                ((cj9) this.f60774a).m4783k("main.device_id", strM11224E);
            }
        } catch (Throwable th) {
            throw th;
        }
        cj9 cj9Var = (cj9) this.f60774a;
        synchronized (cj9Var) {
            zContains = cj9Var.f10176a.contains("main.device_id_original");
        }
        if (!zContains) {
            String str = this.f37466g;
            synchronized (this) {
                ((cj9) this.f60774a).m4783k("main.device_id_original", str);
            }
        }
        m11229J(null);
    }

    /* JADX INFO: renamed from: G */
    public final synchronized long m11226G() {
        return this.f37463d;
    }

    /* JADX INFO: renamed from: H */
    public final synchronized void m11227H() {
        try {
            long jLongValue = ((cj9) this.f60774a).m4776d("main.first_start_time_millis", Long.valueOf(this.f37461b)).longValue();
            this.f37462c = jLongValue;
            if (jLongValue == this.f37461b) {
                ((cj9) this.f60774a).m4782j("main.first_start_time_millis", jLongValue);
            }
            long jLongValue2 = ((cj9) this.f60774a).m4776d("main.start_count", Long.valueOf(this.f37463d)).longValue() + 1;
            this.f37463d = jLongValue2;
            ((cj9) this.f60774a).m4782j("main.start_count", jLongValue2);
            this.f37464e = ((cj9) this.f60774a).m4773a("main.last_launch_instant_app", Boolean.valueOf(this.f37464e)).booleanValue();
            this.f37465f = ((cj9) this.f60774a).m4777e("main.app_guid_override", null);
            String strM4777e = ((cj9) this.f60774a).m4777e("main.device_id", null);
            if (b34.m3255w(strM4777e)) {
                m11225F();
            } else {
                this.f37466g = strM4777e;
            }
            ((cj9) this.f60774a).m4777e("main.device_id_original", this.f37466g);
            this.f37467h = ((cj9) this.f60774a).m4777e("main.device_id_override", null);
        } catch (Throwable th) {
            throw th;
        }
    }

    /* JADX INFO: renamed from: I */
    public final synchronized void m11228I(String str) {
        try {
            this.f37465f = str;
            cj9 cj9Var = (cj9) this.f60774a;
            if (str != null) {
                cj9Var.m4783k("main.app_guid_override", str);
            } else {
                cj9Var.m4778f("main.app_guid_override");
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    /* JADX INFO: renamed from: J */
    public final synchronized void m11229J(String str) {
        try {
            this.f37467h = str;
            cj9 cj9Var = (cj9) this.f60774a;
            if (str != null) {
                cj9Var.m4783k("main.device_id_override", str);
            } else {
                cj9Var.m4778f("main.device_id_override");
            }
        } catch (Throwable th) {
            throw th;
        }
    }
}
