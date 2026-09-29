package p000;

import com.google.firebase.perf.config.RemoteConfigManager;

/* JADX INFO: loaded from: classes.dex */
public final class dh1 {

    /* JADX INFO: renamed from: d */
    public static final C3723wi f35640d = C3723wi.m23970d();

    /* JADX INFO: renamed from: e */
    public static volatile dh1 f35641e;

    /* JADX INFO: renamed from: a */
    public final RemoteConfigManager f35642a = RemoteConfigManager.getInstance();

    /* JADX INFO: renamed from: b */
    public a14 f35643b = new a14();

    /* JADX INFO: renamed from: c */
    public final wc2 f35644c = wc2.m23844b();

    /* JADX INFO: renamed from: e */
    public static synchronized dh1 m10376e() {
        try {
            if (f35641e == null) {
                f35641e = new dh1();
            }
        } catch (Throwable th) {
            throw th;
        }
        return f35641e;
    }

    /* JADX INFO: renamed from: k */
    public static boolean m10377k(long j) {
        return j >= 0;
    }

    /* JADX INFO: renamed from: l */
    public static boolean m10378l(String str) {
        if (!str.trim().isEmpty()) {
            for (String str2 : str.split(";")) {
                if (str2.trim().equals("22.0.5")) {
                    return true;
                }
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: m */
    public static boolean m10379m(long j) {
        return j >= 0;
    }

    /* JADX INFO: renamed from: o */
    public static boolean m10380o(double d) {
        return 0.0d <= d && d <= 1.0d;
    }

    /* JADX INFO: renamed from: a */
    public final mz6 m10381a(omd omdVar) {
        wc2 wc2Var = this.f35644c;
        String strMo433I = omdVar.mo433I();
        if (strMo433I == null) {
            wc2Var.getClass();
            wc2.f66611c.m23971a("Key is null when getting boolean value on device cache.");
            return new mz6();
        }
        if (wc2Var.f66613a == null) {
            wc2Var.m23845c(wc2.m23843a());
            if (wc2Var.f66613a == null) {
                return new mz6();
            }
        }
        if (!wc2Var.f66613a.contains(strMo433I)) {
            return new mz6();
        }
        try {
            return new mz6(Boolean.valueOf(wc2Var.f66613a.getBoolean(strMo433I, false)));
        } catch (ClassCastException e) {
            wc2.f66611c.m23972b("Key %s from sharedPreferences has type other than long: %s", strMo433I, e.getMessage());
            return new mz6();
        }
    }

    /* JADX INFO: renamed from: b */
    public final mz6 m10382b(omd omdVar) {
        wc2 wc2Var = this.f35644c;
        String strMo433I = omdVar.mo433I();
        if (strMo433I == null) {
            wc2Var.getClass();
            wc2.f66611c.m23971a("Key is null when getting double value on device cache.");
            return new mz6();
        }
        if (wc2Var.f66613a == null) {
            wc2Var.m23845c(wc2.m23843a());
            if (wc2Var.f66613a == null) {
                return new mz6();
            }
        }
        if (!wc2Var.f66613a.contains(strMo433I)) {
            return new mz6();
        }
        try {
            try {
                return new mz6(Double.valueOf(Double.longBitsToDouble(wc2Var.f66613a.getLong(strMo433I, 0L))));
            } catch (ClassCastException e) {
                wc2.f66611c.m23972b("Key %s from sharedPreferences has type other than double: %s", strMo433I, e.getMessage());
                return new mz6();
            }
        } catch (ClassCastException unused) {
            return new mz6(Double.valueOf(Float.valueOf(wc2Var.f66613a.getFloat(strMo433I, 0.0f)).doubleValue()));
        }
    }

    /* JADX INFO: renamed from: c */
    public final mz6 m10383c(omd omdVar) {
        wc2 wc2Var = this.f35644c;
        String strMo433I = omdVar.mo433I();
        if (strMo433I == null) {
            wc2Var.getClass();
            wc2.f66611c.m23971a("Key is null when getting long value on device cache.");
            return new mz6();
        }
        if (wc2Var.f66613a == null) {
            wc2Var.m23845c(wc2.m23843a());
            if (wc2Var.f66613a == null) {
                return new mz6();
            }
        }
        if (!wc2Var.f66613a.contains(strMo433I)) {
            return new mz6();
        }
        try {
            return new mz6(Long.valueOf(wc2Var.f66613a.getLong(strMo433I, 0L)));
        } catch (ClassCastException e) {
            wc2.f66611c.m23972b("Key %s from sharedPreferences has type other than long: %s", strMo433I, e.getMessage());
            return new mz6();
        }
    }

    /* JADX INFO: renamed from: d */
    public final mz6 m10384d(omd omdVar) {
        wc2 wc2Var = this.f35644c;
        String strMo433I = omdVar.mo433I();
        if (strMo433I == null) {
            wc2Var.getClass();
            wc2.f66611c.m23971a("Key is null when getting String value on device cache.");
            return new mz6();
        }
        if (wc2Var.f66613a == null) {
            wc2Var.m23845c(wc2.m23843a());
            if (wc2Var.f66613a == null) {
                return new mz6();
            }
        }
        if (!wc2Var.f66613a.contains(strMo433I)) {
            return new mz6();
        }
        try {
            return new mz6(wc2Var.f66613a.getString(strMo433I, ""));
        } catch (ClassCastException e) {
            wc2.f66611c.m23972b("Key %s from sharedPreferences has type other than String: %s", strMo433I, e.getMessage());
            return new mz6();
        }
    }

    /* JADX INFO: renamed from: f */
    public final Boolean m10385f() {
        ih1 ih1Var;
        jh1 jh1Var;
        synchronized (ih1.class) {
            try {
                if (ih1.f44102h == null) {
                    ih1.f44102h = new ih1();
                }
                ih1Var = ih1.f44102h;
            } catch (Throwable th) {
                throw th;
            }
        }
        mz6 mz6VarM10386g = m10386g(ih1Var);
        if ((mz6VarM10386g.m17160b() ? (Boolean) mz6VarM10386g.m17159a() : Boolean.FALSE).booleanValue()) {
            return Boolean.FALSE;
        }
        synchronized (jh1.class) {
            try {
                if (jh1.f45540h == null) {
                    jh1.f45540h = new jh1();
                }
                jh1Var = jh1.f45540h;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        mz6 mz6VarM10381a = m10381a(jh1Var);
        if (mz6VarM10381a.m17160b()) {
            return (Boolean) mz6VarM10381a.m17159a();
        }
        mz6 mz6VarM10386g2 = m10386g(jh1Var);
        if (mz6VarM10386g2.m17160b()) {
            return (Boolean) mz6VarM10386g2.m17159a();
        }
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0018  */
    /* JADX WARN: Code duplicated, block: B:14:0x0028 A[Catch: ClassCastException -> 0x0034, TryCatch #0 {ClassCastException -> 0x0034, blocks: (B:12:0x001e, B:14:0x0028, B:16:0x002e), top: B:21:0x001e }] */
    /* JADX WARN: Code duplicated, block: B:16:0x002e A[Catch: ClassCastException -> 0x0034, TRY_LEAVE, TryCatch #0 {ClassCastException -> 0x0034, blocks: (B:12:0x001e, B:14:0x0028, B:16:0x002e), top: B:21:0x001e }] */
    /* JADX WARN: Code duplicated, block: B:21:0x001e A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX INFO: renamed from: g */
    public final mz6 m10386g(omd omdVar) {
        boolean z;
        a14 a14Var = this.f35643b;
        String strMo13907K = omdVar.mo13907K();
        if (strMo13907K != null) {
            z = a14Var.f62a.containsKey(strMo13907K);
            if (!z) {
                return new mz6();
            }
            try {
                Boolean bool = (Boolean) a14Var.f62a.get(strMo13907K);
                return bool == null ? new mz6() : new mz6(bool);
            } catch (ClassCastException e) {
                a14.f61b.m23972b("Metadata key %s contains type other than boolean: %s", strMo13907K, e.getMessage());
                return new mz6();
            }
        }
        a14Var.getClass();
        if (!z) {
            return new mz6();
        }
        Boolean bool2 = (Boolean) a14Var.f62a.get(strMo13907K);
        if (bool2 == null) {
        }
    }

    /* JADX WARN: Code duplicated, block: B:18:0x0030  */
    /* JADX WARN: Code duplicated, block: B:20:0x0040  */
    /* JADX WARN: Code duplicated, block: B:22:0x0044  */
    /* JADX WARN: Code duplicated, block: B:24:0x004c  */
    /* JADX INFO: renamed from: h */
    public final mz6 m10387h(omd omdVar) {
        boolean z;
        Object obj;
        a14 a14Var = this.f35643b;
        String strMo13907K = omdVar.mo13907K();
        if (strMo13907K != null) {
            z = a14Var.f62a.containsKey(strMo13907K);
            if (!z && (obj = a14Var.f62a.get(strMo13907K)) != null) {
                if (obj instanceof Float) {
                    return new mz6(Double.valueOf(((Float) obj).doubleValue()));
                }
                if (obj instanceof Double) {
                    return new mz6((Double) obj);
                }
                a14.f61b.m23972b("Metadata key %s contains type other than double: %s", strMo13907K);
                return new mz6();
            }
            return new mz6();
        }
        a14Var.getClass();
        if (!z) {
            return new mz6();
        }
        if (obj instanceof Float) {
            return new mz6(Double.valueOf(((Float) obj).doubleValue()));
        }
        if (obj instanceof Double) {
            return new mz6((Double) obj);
        }
        a14.f61b.m23972b("Metadata key %s contains type other than double: %s", strMo13907K);
        return new mz6();
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0018  */
    /* JADX WARN: Code duplicated, block: B:13:0x0028 A[Catch: ClassCastException -> 0x0035, TryCatch #0 {ClassCastException -> 0x0035, blocks: (B:11:0x001e, B:13:0x0028, B:14:0x002e), top: B:24:0x001e }] */
    /* JADX WARN: Code duplicated, block: B:14:0x002e A[Catch: ClassCastException -> 0x0035, TRY_LEAVE, TryCatch #0 {ClassCastException -> 0x0035, blocks: (B:11:0x001e, B:13:0x0028, B:14:0x002e), top: B:24:0x001e }] */
    /* JADX WARN: Code duplicated, block: B:20:0x0050  */
    /* JADX WARN: Code duplicated, block: B:21:0x0065  */
    /* JADX WARN: Code duplicated, block: B:24:0x001e A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX INFO: renamed from: i */
    public final mz6 m10388i(omd omdVar) {
        boolean z;
        mz6 mz6Var;
        Integer num;
        a14 a14Var = this.f35643b;
        String strMo13907K = omdVar.mo13907K();
        if (strMo13907K != null) {
            z = a14Var.f62a.containsKey(strMo13907K);
            if (z) {
                try {
                    num = (Integer) a14Var.f62a.get(strMo13907K);
                    if (num == null) {
                        mz6Var = new mz6();
                    } else {
                        mz6Var = new mz6(num);
                    }
                } catch (ClassCastException e) {
                    a14.f61b.m23972b("Metadata key %s contains type other than int: %s", strMo13907K, e.getMessage());
                    mz6Var = new mz6();
                }
            } else {
                mz6Var = new mz6();
            }
            return mz6Var.m17160b() ? new mz6(Long.valueOf(((Integer) mz6Var.m17159a()).intValue())) : new mz6();
        }
        a14Var.getClass();
        if (z) {
            mz6Var = new mz6();
        } else {
            num = (Integer) a14Var.f62a.get(strMo13907K);
            if (num == null) {
                mz6Var = new mz6();
            } else {
                mz6Var = new mz6(num);
            }
        }
        if (mz6Var.m17160b()) {
        }
    }

    /* JADX INFO: renamed from: j */
    public final long m10389j() {
        ph1 ph1Var;
        synchronized (ph1.class) {
            try {
                if (ph1.f56211h == null) {
                    ph1.f56211h = new ph1();
                }
                ph1Var = ph1.f56211h;
            } catch (Throwable th) {
                throw th;
            }
        }
        RemoteConfigManager remoteConfigManager = this.f35642a;
        ph1Var.getClass();
        mz6 mz6Var = remoteConfigManager.getLong("fpr_rl_time_limit_sec");
        if (mz6Var.m17160b() && ((Long) mz6Var.m17159a()).longValue() > 0) {
            this.f35644c.m23847e("com.google.firebase.perf.TimeLimitSec", ((Long) mz6Var.m17159a()).longValue());
            return ((Long) mz6Var.m17159a()).longValue();
        }
        mz6 mz6VarM10383c = m10383c(ph1Var);
        if (!mz6VarM10383c.m17160b() || ((Long) mz6VarM10383c.m17159a()).longValue() <= 0) {
            return 600L;
        }
        return ((Long) mz6VarM10383c.m17159a()).longValue();
    }

    /* JADX INFO: renamed from: n */
    public final boolean m10390n() {
        rh1 rh1Var;
        boolean zBooleanValue;
        qh1 qh1Var;
        boolean zM10378l;
        Boolean boolM10385f = m10385f();
        if (boolM10385f == null || boolM10385f.booleanValue()) {
            synchronized (rh1.class) {
                try {
                    if (rh1.f59261h == null) {
                        rh1.f59261h = new rh1();
                    }
                    rh1Var = rh1.f59261h;
                } catch (Throwable th) {
                    throw th;
                }
            }
            mz6 mz6VarM10381a = m10381a(rh1Var);
            mz6 mz6Var = this.f35642a.getBoolean("fpr_enabled");
            if (!mz6Var.m17160b()) {
                zBooleanValue = mz6VarM10381a.m17160b() ? ((Boolean) mz6VarM10381a.m17159a()).booleanValue() : true;
            } else if (this.f35642a.isLastFetchFailed()) {
                zBooleanValue = false;
            } else {
                Boolean bool = (Boolean) mz6Var.m17159a();
                if (!mz6VarM10381a.m17160b() || mz6VarM10381a.m17159a() != bool) {
                    this.f35644c.m23849g("com.google.firebase.perf.SdkEnabled", bool.booleanValue());
                }
                zBooleanValue = bool.booleanValue();
            }
            if (zBooleanValue) {
                synchronized (qh1.class) {
                    try {
                        if (qh1.f57778h == null) {
                            qh1.f57778h = new qh1();
                        }
                        qh1Var = qh1.f57778h;
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
                mz6 mz6VarM10384d = m10384d(qh1Var);
                mz6 string = this.f35642a.getString("fpr_disabled_android_versions");
                if (string.m17160b()) {
                    String str = (String) string.m17159a();
                    if (!mz6VarM10384d.m17160b() || !((String) mz6VarM10384d.m17159a()).equals(str)) {
                        this.f35644c.m23848f("com.google.firebase.perf.SdkDisabledVersions", str);
                    }
                    zM10378l = m10378l(str);
                } else {
                    zM10378l = mz6VarM10384d.m17160b() ? m10378l((String) mz6VarM10384d.m17159a()) : m10378l("");
                }
                if (!zM10378l) {
                    return true;
                }
            }
        }
        return false;
    }
}
