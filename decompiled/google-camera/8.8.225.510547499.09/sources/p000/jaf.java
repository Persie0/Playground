package p000;

import android.app.job.JobInfo;
import android.app.job.JobScheduler;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.database.Cursor;
import android.database.sqlite.SQLiteException;
import android.os.PersistableBundle;
import android.os.SystemClock;
import android.os.UserHandle;
import android.util.Log;
import com.google.android.apps.camera.evcomp.AZCp.HRLmc;
import com.google.android.apps.camera.jni.tracking.yRU.CswIK;
import com.google.android.apps.camera.rectiface.jni.cxx.hsSUWRJfoeC;
import com.google.android.apps.camera.util.p015ui.mfv.EArqVBjecl;
import com.google.android.libraries.lens.lenslite.api.arLu.YmzeHXaMYOLk;
import com.google.android.libraries.lens.lenslite.dynamicloading.QSK.hIAHJKEnGsNbz;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.zip.GZIPOutputStream;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class jaf extends izs {

    /* JADX INFO: renamed from: a */
    public boolean f33554a;

    /* JADX INFO: renamed from: c */
    public final jaa f33555c;

    /* JADX INFO: renamed from: d */
    public final jai f33556d;

    /* JADX INFO: renamed from: e */
    public long f33557e;

    /* JADX INFO: renamed from: f */
    public boolean f33558f;

    /* JADX INFO: renamed from: g */
    private final jat f33559g;

    /* JADX INFO: renamed from: h */
    private final jas f33560h;

    /* JADX INFO: renamed from: i */
    private final izy f33561i;

    /* JADX INFO: renamed from: j */
    private final jai f33562j;

    /* JADX INFO: renamed from: k */
    private final jay f33563k;

    protected jaf(izv izvVar) {
        super(izvVar);
        this.f33560h = new jas(izvVar);
        this.f33555c = new jaa(izvVar);
        this.f33559g = new jat(izvVar);
        this.f33561i = new izy(izvVar);
        this.f33563k = new jay();
        this.f33562j = new jac(this, izvVar);
        this.f33556d = new jad(this, izvVar);
    }

    /* JADX INFO: renamed from: H */
    private final void m12762H() {
        if (this.f33562j.m12783e()) {
            m11936q(YmzeHXaMYOLk.maaTaV);
        }
        this.f33562j.m12781c();
        jak jakVarM11928h = m11928h();
        if (jakVarM11928h.f33573c) {
            jakVarM11928h.m12785c();
        }
    }

    /* JADX WARN: Code duplicated, block: B:31:0x0050 A[Catch: SQLiteException -> 0x0054, TRY_ENTER, TryCatch #2 {SQLiteException -> 0x0054, blocks: (B:7:0x0015, B:14:0x0034, B:17:0x003b, B:31:0x0050, B:32:0x0053), top: B:76:0x0015 }] */
    /* JADX WARN: Code duplicated, block: B:59:0x0132  */
    /* JADX INFO: renamed from: I */
    private final void m12763I() throws Throwable {
        long j;
        int iIntValue;
        jak jakVarM11928h = m11928h();
        if (!jakVarM11928h.f33572a || jakVarM11928h.f33573c) {
            return;
        }
        izo.m11916a();
        m11946z();
        try {
            jaa jaaVar = this.f33555c;
            izo.m11916a();
            jaaVar.m11946z();
            String str = jaa.f33546c;
            Cursor cursorRawQuery = null;
            try {
                cursorRawQuery = jaaVar.m12759b().rawQuery(str, null);
                try {
                    if (cursorRawQuery.moveToFirst()) {
                        j = cursorRawQuery.getLong(0);
                        if (cursorRawQuery != null) {
                            cursorRawQuery.close();
                        }
                    } else {
                        if (cursorRawQuery != null) {
                            cursorRawQuery.close();
                        }
                        j = 0;
                    }
                    if (j == 0 || Math.abs(System.currentTimeMillis() - j) > ((Long) jam.f33584f.m11334D()).longValue()) {
                        return;
                    }
                    m11937r("Dispatch alarm scheduled (ms)", Long.valueOf(jah.m12771b()));
                    jakVarM11928h.m11946z();
                    jib.m13202g(jakVarM11928h.f33572a, "Receiver not registered");
                    jakVarM11928h.m11927g();
                    long jM12771b = jah.m12771b();
                    if (jM12771b > 0) {
                        jakVarM11928h.m12785c();
                        jakVarM11928h.m11943y();
                        SystemClock.elapsedRealtime();
                        jakVarM11928h.f33573c = true;
                        ((Boolean) jam.f33578C.m11334D()).booleanValue();
                        jakVarM11928h.m11936q("Scheduling upload with JobScheduler");
                        Context contextM11924d = jakVarM11928h.m11924d();
                        ComponentName componentName = new ComponentName(contextM11924d, "com.google.android.gms.analytics.AnalyticsJobService");
                        int iM12784b = jakVarM11928h.m12784b();
                        PersistableBundle persistableBundle = new PersistableBundle();
                        persistableBundle.putString("action", "com.google.android.gms.analytics.ANALYTICS_DISPATCH");
                        JobInfo jobInfoBuild = new JobInfo.Builder(iM12784b, componentName).setMinimumLatency(jM12771b).setOverrideDeadline(jM12771b + jM12771b).setExtras(persistableBundle).build();
                        jakVarM11928h.m11937r("Scheduling job. JobID", Integer.valueOf(iM12784b));
                        JobScheduler jobScheduler = (JobScheduler) contextM11924d.getSystemService("jobscheduler");
                        jobScheduler.getClass();
                        if (jmu.f34377a == null || contextM11924d.checkSelfPermission("android.permission.UPDATE_DEVICE_STATS") != 0) {
                            jobScheduler.schedule(jobInfoBuild);
                            return;
                        }
                        Method method = jmu.f34378b;
                        if (method != null) {
                            try {
                                Integer num = (Integer) method.invoke(UserHandle.class, new Object[0]);
                                if (num != null) {
                                    iIntValue = num.intValue();
                                } else {
                                    iIntValue = 0;
                                }
                            } catch (IllegalAccessException | InvocationTargetException e) {
                                if (Log.isLoggable("JobSchedulerCompat", 6)) {
                                    Log.e("JobSchedulerCompat", "myUserId invocation illegal", e);
                                    iIntValue = 0;
                                } else {
                                    iIntValue = 0;
                                }
                            }
                        } else {
                            iIntValue = 0;
                        }
                        Method method2 = jmu.f34377a;
                        if (method2 != null) {
                            try {
                                Integer num2 = (Integer) method2.invoke(jobScheduler, jobInfoBuild, "com.google.android.gms", Integer.valueOf(iIntValue), "DispatchAlarm");
                                if (num2 != null) {
                                    num2.intValue();
                                    return;
                                }
                                return;
                            } catch (IllegalAccessException | InvocationTargetException e2) {
                                Log.e("DispatchAlarm", "error calling scheduleAsPackage", e2);
                            }
                        }
                        jobScheduler.schedule(jobInfoBuild);
                    }
                } catch (SQLiteException e3) {
                    e = e3;
                    try {
                        jaaVar.m11935p("Database error", str, e);
                        throw e;
                    } catch (Throwable th) {
                        th = th;
                        if (cursorRawQuery != null) {
                            cursorRawQuery.close();
                        }
                        throw th;
                    }
                } catch (Throwable th2) {
                    th = th2;
                    if (cursorRawQuery != null) {
                        cursorRawQuery.close();
                    }
                    throw th;
                }
            } catch (SQLiteException e4) {
                e = e4;
            } catch (Throwable th3) {
                th = th3;
            }
        } catch (SQLiteException e5) {
            m11934o("Failed to get min/max hit times from local store", e5);
            j = 0;
        }
    }

    /* JADX INFO: renamed from: C */
    public final void m12764C() {
        jap japVar;
        if (this.f33558f || !jah.m12778i() || this.f33561i.m11955D()) {
            return;
        }
        if (this.f33563k.m12812c(((Long) jam.f33604z.m11334D()).longValue())) {
            this.f33563k.m12811b();
            m11936q("Connecting to service");
            izy izyVar = this.f33561i;
            izo.m11916a();
            izyVar.m11946z();
            if (izyVar.f32743c == null) {
                izx izxVar = izyVar.f32742a;
                izy izyVar2 = izxVar.f32740b;
                izo.m11916a();
                Intent intent = new Intent("com.google.android.gms.analytics.service.START");
                intent.setComponent(new ComponentName("com.google.android.gms", "com.google.android.gms.analytics.service.AnalyticsService"));
                Context contextM11924d = izxVar.f32740b.m11924d();
                intent.putExtra("app_package_name", contextM11924d.getPackageName());
                jir jirVarM13228a = jir.m13228a();
                synchronized (izxVar) {
                    japVar = null;
                    izxVar.f32741c = null;
                    izxVar.f32739a = true;
                    boolean zM13232c = jirVarM13228a.m13232c(contextM11924d, contextM11924d.getClass().getName(), intent, izxVar.f32740b.f32742a, 129);
                    izxVar.f32740b.m11937r("Bind to service requested", Boolean.valueOf(zM13232c));
                    if (zM13232c) {
                        try {
                            izxVar.wait(((Long) jam.f33603y.m11334D()).longValue());
                        } catch (InterruptedException e) {
                            izxVar.f32740b.m11939t("Wait for service connect was interrupted");
                        }
                        izxVar.f32739a = false;
                        jap japVar2 = izxVar.f32741c;
                        izxVar.f32741c = null;
                        if (japVar2 == null) {
                            izxVar.f32740b.m11933n("Successfully bound to service but never got onServiceConnected callback");
                        }
                        japVar = japVar2;
                    } else {
                        izxVar.f32739a = false;
                    }
                }
                if (japVar == null) {
                    return;
                }
                izyVar.f32743c = japVar;
                izyVar.m11954C();
            }
            m11936q("Connected to service");
            this.f33563k.m12810a();
            m12765D();
        }
    }

    /* JADX INFO: renamed from: D */
    public final void m12765D() {
        izo.m11916a();
        izo.m11916a();
        m11946z();
        if (!jah.m12778i()) {
            m11939t("Service client disabled. Can't dispatch local hits to device AnalyticsService");
        }
        if (!this.f33561i.m11955D()) {
            m11936q("Service not connected");
            return;
        }
        if (this.f33555c.m12758H()) {
            return;
        }
        m11936q("Dispatching local hits to device AnalyticsService");
        while (true) {
            try {
                List listM12760c = this.f33555c.m12760c(jah.m12774e());
                if (listM12760c.isEmpty()) {
                    m12767F();
                    return;
                }
                while (!listM12760c.isEmpty()) {
                    jao jaoVar = (jao) listM12760c.get(0);
                    if (!this.f33561i.m11956E(jaoVar)) {
                        m12767F();
                        return;
                    }
                    listM12760c.remove(jaoVar);
                    try {
                        this.f33555c.m12754D(jaoVar.f33611b);
                    } catch (SQLiteException e) {
                        m11934o("Failed to remove hit that was send for delivery", e);
                        m12762H();
                        return;
                    }
                }
            } catch (SQLiteException e2) {
                m11934o("Failed to read hits from store", e2);
                m12762H();
                return;
            }
        }
    }

    /* JADX INFO: renamed from: E */
    public final void m12766E() {
        m11946z();
        izo.m11916a();
        this.f33558f = true;
        this.f33561i.m11957b();
        m12767F();
    }

    /* JADX INFO: renamed from: F */
    public final void m12767F() {
        long jMin;
        long jAbs;
        izo.m11916a();
        m11946z();
        if (!this.f33558f) {
            if (m12769b() > 0) {
                if (this.f33555c.m12758H()) {
                    this.f33560h.m12796c();
                    m12762H();
                    return;
                }
                if (!((Boolean) jam.f33601w.m11334D()).booleanValue()) {
                    jas jasVar = this.f33560h;
                    jasVar.m12795b();
                    if (!jasVar.f33619c) {
                        Context contextM12794a = jasVar.m12794a();
                        contextM12794a.registerReceiver(jasVar, new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE"));
                        IntentFilter intentFilter = new IntentFilter("com.google.analytics.RADIO_POWERED");
                        intentFilter.addCategory(contextM12794a.getPackageName());
                        contextM12794a.registerReceiver(jasVar, intentFilter);
                        jasVar.f33620d = jasVar.m12797d();
                        jasVar.f33618b.m11951d().m11937r("Registering connectivity change receiver. Network connected", Boolean.valueOf(jasVar.f33620d));
                        jasVar.f33619c = true;
                    }
                    jas jasVar2 = this.f33560h;
                    if (!jasVar2.f33619c) {
                        jasVar2.f33618b.m11951d().m11939t("Connectivity unknown. Receiver not registered");
                    }
                    if (!jasVar2.f33620d) {
                        m12762H();
                        m12763I();
                        return;
                    }
                }
                m12763I();
                long jM12769b = m12769b();
                long jM12807b = m11930j().m12807b();
                if (jM12807b != 0) {
                    jMin = jM12769b - Math.abs(System.currentTimeMillis() - jM12807b);
                    if (jMin <= 0) {
                        jMin = Math.min(jah.m12772c(), jM12769b);
                    }
                } else {
                    jMin = Math.min(jah.m12772c(), jM12769b);
                }
                m11937r("Dispatch scheduled (ms)", Long.valueOf(jMin));
                if (!this.f33562j.m12783e()) {
                    this.f33562j.m12782d(jMin);
                    return;
                }
                jai jaiVar = this.f33562j;
                if (jaiVar.f33571d == 0) {
                    jAbs = 0;
                } else {
                    izv izvVar = jaiVar.f33569b;
                    jAbs = Math.abs(System.currentTimeMillis() - jaiVar.f33571d);
                }
                long jMax = Math.max(1L, jMin + jAbs);
                jai jaiVar2 = this.f33562j;
                if (jaiVar2.m12783e()) {
                    if (jMax < 0) {
                        jaiVar2.m12781c();
                        return;
                    }
                    izv izvVar2 = jaiVar2.f33569b;
                    long jAbs2 = jMax - Math.abs(System.currentTimeMillis() - jaiVar2.f33571d);
                    long j = jAbs2 >= 0 ? jAbs2 : 0L;
                    jaiVar2.m12780b().removeCallbacks(jaiVar2.f33570c);
                    if (jaiVar2.m12780b().postDelayed(jaiVar2.f33570c, j)) {
                        return;
                    }
                    jaiVar2.f33569b.m11951d().m11934o("Failed to adjust delayed post. time", Long.valueOf(j));
                    return;
                }
                return;
            }
        }
        this.f33560h.m12796c();
        m12762H();
    }

    /* JADX INFO: renamed from: G */
    public final boolean m12768G(String str) {
        return jiz.m13300b(m11924d()).m14246l(str) == 0;
    }

    @Override // p000.izs
    /* JADX INFO: renamed from: a */
    protected final void mo11918a() {
        this.f33555c.m11944A();
        this.f33559g.m11944A();
        this.f33561i.m11944A();
    }

    /* JADX INFO: renamed from: b */
    public final long m12769b() {
        long jLongValue = ((Long) jam.f33581c.m11334D()).longValue();
        jaz jazVarM11931k = m11931k();
        jazVarM11931k.m11946z();
        if (!jazVarM11931k.f33638d) {
            return jLongValue;
        }
        jaz jazVarM11931k2 = m11931k();
        jazVarM11931k2.m11946z();
        return ((long) jazVarM11931k2.f33639e) * 1000;
    }

    /* JADX WARN: Code duplicated, block: B:101:0x027e A[Catch: IOException -> 0x0289, all -> 0x0566, TryCatch #9 {IOException -> 0x0289, blocks: (B:99:0x0278, B:101:0x027e, B:102:0x0283), top: B:298:0x0278, outer: #3 }] */
    /* JADX WARN: Code duplicated, block: B:108:0x029a A[Catch: all -> 0x0566, TryCatch #3 {all -> 0x0566, blocks: (B:12:0x006c, B:13:0x007b, B:15:0x0087, B:21:0x00a0, B:22:0x00ad, B:23:0x00b1, B:25:0x00b7, B:27:0x00c3, B:34:0x00ed, B:36:0x00f6, B:37:0x00fb, B:39:0x0101, B:53:0x0151, B:55:0x0159, B:57:0x016f, B:82:0x01e0, B:83:0x020b, B:85:0x0211, B:236:0x04e0, B:237:0x04e6, B:239:0x04ec, B:241:0x04fb, B:251:0x0520, B:244:0x0505, B:113:0x02ac, B:115:0x02b2, B:117:0x02bf, B:132:0x0349, B:175:0x03a2, B:177:0x03af, B:179:0x03c6, B:180:0x03d0, B:164:0x0385, B:170:0x0390, B:171:0x0393, B:168:0x038b, B:152:0x036e, B:158:0x0379, B:156:0x0374, B:172:0x0394, B:88:0x0227, B:90:0x022f, B:106:0x028f, B:108:0x029a, B:91:0x023c, B:93:0x0253, B:94:0x025d, B:96:0x0263, B:97:0x0265, B:99:0x0278, B:101:0x027e, B:102:0x0283, B:105:0x028a, B:181:0x03d6, B:182:0x03e5, B:184:0x03eb, B:186:0x03fe, B:232:0x04cb, B:187:0x040c, B:189:0x041e, B:191:0x0424, B:192:0x042b, B:199:0x0457, B:218:0x047d, B:219:0x0480, B:214:0x0475, B:220:0x0481, B:222:0x0489, B:223:0x0495, B:225:0x04a8, B:226:0x04b4, B:228:0x04ba, B:229:0x04c0, B:60:0x018b, B:76:0x01c8, B:63:0x019d, B:66:0x01a7, B:69:0x01b2, B:72:0x01bc, B:42:0x0112, B:43:0x0122, B:46:0x0136, B:264:0x054d), top: B:291:0x006c, outer: #1, inners: #6, #9, #10 }] */
    /* JADX WARN: Code duplicated, block: B:112:0x02a8  */
    /* JADX WARN: Code duplicated, block: B:113:0x02ac A[Catch: all -> 0x0566, TryCatch #3 {all -> 0x0566, blocks: (B:12:0x006c, B:13:0x007b, B:15:0x0087, B:21:0x00a0, B:22:0x00ad, B:23:0x00b1, B:25:0x00b7, B:27:0x00c3, B:34:0x00ed, B:36:0x00f6, B:37:0x00fb, B:39:0x0101, B:53:0x0151, B:55:0x0159, B:57:0x016f, B:82:0x01e0, B:83:0x020b, B:85:0x0211, B:236:0x04e0, B:237:0x04e6, B:239:0x04ec, B:241:0x04fb, B:251:0x0520, B:244:0x0505, B:113:0x02ac, B:115:0x02b2, B:117:0x02bf, B:132:0x0349, B:175:0x03a2, B:177:0x03af, B:179:0x03c6, B:180:0x03d0, B:164:0x0385, B:170:0x0390, B:171:0x0393, B:168:0x038b, B:152:0x036e, B:158:0x0379, B:156:0x0374, B:172:0x0394, B:88:0x0227, B:90:0x022f, B:106:0x028f, B:108:0x029a, B:91:0x023c, B:93:0x0253, B:94:0x025d, B:96:0x0263, B:97:0x0265, B:99:0x0278, B:101:0x027e, B:102:0x0283, B:105:0x028a, B:181:0x03d6, B:182:0x03e5, B:184:0x03eb, B:186:0x03fe, B:232:0x04cb, B:187:0x040c, B:189:0x041e, B:191:0x0424, B:192:0x042b, B:199:0x0457, B:218:0x047d, B:219:0x0480, B:214:0x0475, B:220:0x0481, B:222:0x0489, B:223:0x0495, B:225:0x04a8, B:226:0x04b4, B:228:0x04ba, B:229:0x04c0, B:60:0x018b, B:76:0x01c8, B:63:0x019d, B:66:0x01a7, B:69:0x01b2, B:72:0x01bc, B:42:0x0112, B:43:0x0122, B:46:0x0136, B:264:0x054d), top: B:291:0x006c, outer: #1, inners: #6, #9, #10 }] */
    /* JADX WARN: Code duplicated, block: B:115:0x02b2 A[Catch: all -> 0x0566, TryCatch #3 {all -> 0x0566, blocks: (B:12:0x006c, B:13:0x007b, B:15:0x0087, B:21:0x00a0, B:22:0x00ad, B:23:0x00b1, B:25:0x00b7, B:27:0x00c3, B:34:0x00ed, B:36:0x00f6, B:37:0x00fb, B:39:0x0101, B:53:0x0151, B:55:0x0159, B:57:0x016f, B:82:0x01e0, B:83:0x020b, B:85:0x0211, B:236:0x04e0, B:237:0x04e6, B:239:0x04ec, B:241:0x04fb, B:251:0x0520, B:244:0x0505, B:113:0x02ac, B:115:0x02b2, B:117:0x02bf, B:132:0x0349, B:175:0x03a2, B:177:0x03af, B:179:0x03c6, B:180:0x03d0, B:164:0x0385, B:170:0x0390, B:171:0x0393, B:168:0x038b, B:152:0x036e, B:158:0x0379, B:156:0x0374, B:172:0x0394, B:88:0x0227, B:90:0x022f, B:106:0x028f, B:108:0x029a, B:91:0x023c, B:93:0x0253, B:94:0x025d, B:96:0x0263, B:97:0x0265, B:99:0x0278, B:101:0x027e, B:102:0x0283, B:105:0x028a, B:181:0x03d6, B:182:0x03e5, B:184:0x03eb, B:186:0x03fe, B:232:0x04cb, B:187:0x040c, B:189:0x041e, B:191:0x0424, B:192:0x042b, B:199:0x0457, B:218:0x047d, B:219:0x0480, B:214:0x0475, B:220:0x0481, B:222:0x0489, B:223:0x0495, B:225:0x04a8, B:226:0x04b4, B:228:0x04ba, B:229:0x04c0, B:60:0x018b, B:76:0x01c8, B:63:0x019d, B:66:0x01a7, B:69:0x01b2, B:72:0x01bc, B:42:0x0112, B:43:0x0122, B:46:0x0136, B:264:0x054d), top: B:291:0x006c, outer: #1, inners: #6, #9, #10 }] */
    /* JADX WARN: Code duplicated, block: B:116:0x02bd A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:117:0x02bf A[Catch: all -> 0x0566, TRY_LEAVE, TryCatch #3 {all -> 0x0566, blocks: (B:12:0x006c, B:13:0x007b, B:15:0x0087, B:21:0x00a0, B:22:0x00ad, B:23:0x00b1, B:25:0x00b7, B:27:0x00c3, B:34:0x00ed, B:36:0x00f6, B:37:0x00fb, B:39:0x0101, B:53:0x0151, B:55:0x0159, B:57:0x016f, B:82:0x01e0, B:83:0x020b, B:85:0x0211, B:236:0x04e0, B:237:0x04e6, B:239:0x04ec, B:241:0x04fb, B:251:0x0520, B:244:0x0505, B:113:0x02ac, B:115:0x02b2, B:117:0x02bf, B:132:0x0349, B:175:0x03a2, B:177:0x03af, B:179:0x03c6, B:180:0x03d0, B:164:0x0385, B:170:0x0390, B:171:0x0393, B:168:0x038b, B:152:0x036e, B:158:0x0379, B:156:0x0374, B:172:0x0394, B:88:0x0227, B:90:0x022f, B:106:0x028f, B:108:0x029a, B:91:0x023c, B:93:0x0253, B:94:0x025d, B:96:0x0263, B:97:0x0265, B:99:0x0278, B:101:0x027e, B:102:0x0283, B:105:0x028a, B:181:0x03d6, B:182:0x03e5, B:184:0x03eb, B:186:0x03fe, B:232:0x04cb, B:187:0x040c, B:189:0x041e, B:191:0x0424, B:192:0x042b, B:199:0x0457, B:218:0x047d, B:219:0x0480, B:214:0x0475, B:220:0x0481, B:222:0x0489, B:223:0x0495, B:225:0x04a8, B:226:0x04b4, B:228:0x04ba, B:229:0x04c0, B:60:0x018b, B:76:0x01c8, B:63:0x019d, B:66:0x01a7, B:69:0x01b2, B:72:0x01bc, B:42:0x0112, B:43:0x0122, B:46:0x0136, B:264:0x054d), top: B:291:0x006c, outer: #1, inners: #6, #9, #10 }] */
    /* JADX WARN: Code duplicated, block: B:122:0x02ff A[Catch: IOException -> 0x035b, all -> 0x035d, TryCatch #27 {all -> 0x035d, blocks: (B:118:0x02c6, B:120:0x02eb, B:122:0x02ff, B:123:0x0308), top: B:320:0x02c6 }] */
    /* JADX WARN: Code duplicated, block: B:129:0x0335 A[Catch: all -> 0x0353, IOException -> 0x0358, TryCatch #27 {IOException -> 0x0358, all -> 0x0353, blocks: (B:125:0x0310, B:127:0x032a, B:129:0x0335, B:130:0x033e), top: B:330:0x0310 }] */
    /* JADX WARN: Code duplicated, block: B:132:0x0349 A[Catch: all -> 0x0566, TRY_ENTER, TRY_LEAVE, TryCatch #3 {all -> 0x0566, blocks: (B:12:0x006c, B:13:0x007b, B:15:0x0087, B:21:0x00a0, B:22:0x00ad, B:23:0x00b1, B:25:0x00b7, B:27:0x00c3, B:34:0x00ed, B:36:0x00f6, B:37:0x00fb, B:39:0x0101, B:53:0x0151, B:55:0x0159, B:57:0x016f, B:82:0x01e0, B:83:0x020b, B:85:0x0211, B:236:0x04e0, B:237:0x04e6, B:239:0x04ec, B:241:0x04fb, B:251:0x0520, B:244:0x0505, B:113:0x02ac, B:115:0x02b2, B:117:0x02bf, B:132:0x0349, B:175:0x03a2, B:177:0x03af, B:179:0x03c6, B:180:0x03d0, B:164:0x0385, B:170:0x0390, B:171:0x0393, B:168:0x038b, B:152:0x036e, B:158:0x0379, B:156:0x0374, B:172:0x0394, B:88:0x0227, B:90:0x022f, B:106:0x028f, B:108:0x029a, B:91:0x023c, B:93:0x0253, B:94:0x025d, B:96:0x0263, B:97:0x0265, B:99:0x0278, B:101:0x027e, B:102:0x0283, B:105:0x028a, B:181:0x03d6, B:182:0x03e5, B:184:0x03eb, B:186:0x03fe, B:232:0x04cb, B:187:0x040c, B:189:0x041e, B:191:0x0424, B:192:0x042b, B:199:0x0457, B:218:0x047d, B:219:0x0480, B:214:0x0475, B:220:0x0481, B:222:0x0489, B:223:0x0495, B:225:0x04a8, B:226:0x04b4, B:228:0x04ba, B:229:0x04c0, B:60:0x018b, B:76:0x01c8, B:63:0x019d, B:66:0x01a7, B:69:0x01b2, B:72:0x01bc, B:42:0x0112, B:43:0x0122, B:46:0x0136, B:264:0x054d), top: B:291:0x006c, outer: #1, inners: #6, #9, #10 }] */
    /* JADX WARN: Code duplicated, block: B:158:0x0379 A[Catch: all -> 0x0566, TRY_LEAVE, TryCatch #3 {all -> 0x0566, blocks: (B:12:0x006c, B:13:0x007b, B:15:0x0087, B:21:0x00a0, B:22:0x00ad, B:23:0x00b1, B:25:0x00b7, B:27:0x00c3, B:34:0x00ed, B:36:0x00f6, B:37:0x00fb, B:39:0x0101, B:53:0x0151, B:55:0x0159, B:57:0x016f, B:82:0x01e0, B:83:0x020b, B:85:0x0211, B:236:0x04e0, B:237:0x04e6, B:239:0x04ec, B:241:0x04fb, B:251:0x0520, B:244:0x0505, B:113:0x02ac, B:115:0x02b2, B:117:0x02bf, B:132:0x0349, B:175:0x03a2, B:177:0x03af, B:179:0x03c6, B:180:0x03d0, B:164:0x0385, B:170:0x0390, B:171:0x0393, B:168:0x038b, B:152:0x036e, B:158:0x0379, B:156:0x0374, B:172:0x0394, B:88:0x0227, B:90:0x022f, B:106:0x028f, B:108:0x029a, B:91:0x023c, B:93:0x0253, B:94:0x025d, B:96:0x0263, B:97:0x0265, B:99:0x0278, B:101:0x027e, B:102:0x0283, B:105:0x028a, B:181:0x03d6, B:182:0x03e5, B:184:0x03eb, B:186:0x03fe, B:232:0x04cb, B:187:0x040c, B:189:0x041e, B:191:0x0424, B:192:0x042b, B:199:0x0457, B:218:0x047d, B:219:0x0480, B:214:0x0475, B:220:0x0481, B:222:0x0489, B:223:0x0495, B:225:0x04a8, B:226:0x04b4, B:228:0x04ba, B:229:0x04c0, B:60:0x018b, B:76:0x01c8, B:63:0x019d, B:66:0x01a7, B:69:0x01b2, B:72:0x01bc, B:42:0x0112, B:43:0x0122, B:46:0x0136, B:264:0x054d), top: B:291:0x006c, outer: #1, inners: #6, #9, #10 }] */
    /* JADX WARN: Code duplicated, block: B:160:0x037e  */
    /* JADX WARN: Code duplicated, block: B:170:0x0390 A[Catch: all -> 0x0566, TryCatch #3 {all -> 0x0566, blocks: (B:12:0x006c, B:13:0x007b, B:15:0x0087, B:21:0x00a0, B:22:0x00ad, B:23:0x00b1, B:25:0x00b7, B:27:0x00c3, B:34:0x00ed, B:36:0x00f6, B:37:0x00fb, B:39:0x0101, B:53:0x0151, B:55:0x0159, B:57:0x016f, B:82:0x01e0, B:83:0x020b, B:85:0x0211, B:236:0x04e0, B:237:0x04e6, B:239:0x04ec, B:241:0x04fb, B:251:0x0520, B:244:0x0505, B:113:0x02ac, B:115:0x02b2, B:117:0x02bf, B:132:0x0349, B:175:0x03a2, B:177:0x03af, B:179:0x03c6, B:180:0x03d0, B:164:0x0385, B:170:0x0390, B:171:0x0393, B:168:0x038b, B:152:0x036e, B:158:0x0379, B:156:0x0374, B:172:0x0394, B:88:0x0227, B:90:0x022f, B:106:0x028f, B:108:0x029a, B:91:0x023c, B:93:0x0253, B:94:0x025d, B:96:0x0263, B:97:0x0265, B:99:0x0278, B:101:0x027e, B:102:0x0283, B:105:0x028a, B:181:0x03d6, B:182:0x03e5, B:184:0x03eb, B:186:0x03fe, B:232:0x04cb, B:187:0x040c, B:189:0x041e, B:191:0x0424, B:192:0x042b, B:199:0x0457, B:218:0x047d, B:219:0x0480, B:214:0x0475, B:220:0x0481, B:222:0x0489, B:223:0x0495, B:225:0x04a8, B:226:0x04b4, B:228:0x04ba, B:229:0x04c0, B:60:0x018b, B:76:0x01c8, B:63:0x019d, B:66:0x01a7, B:69:0x01b2, B:72:0x01bc, B:42:0x0112, B:43:0x0122, B:46:0x0136, B:264:0x054d), top: B:291:0x006c, outer: #1, inners: #6, #9, #10 }] */
    /* JADX WARN: Code duplicated, block: B:172:0x0394 A[Catch: all -> 0x0566, TryCatch #3 {all -> 0x0566, blocks: (B:12:0x006c, B:13:0x007b, B:15:0x0087, B:21:0x00a0, B:22:0x00ad, B:23:0x00b1, B:25:0x00b7, B:27:0x00c3, B:34:0x00ed, B:36:0x00f6, B:37:0x00fb, B:39:0x0101, B:53:0x0151, B:55:0x0159, B:57:0x016f, B:82:0x01e0, B:83:0x020b, B:85:0x0211, B:236:0x04e0, B:237:0x04e6, B:239:0x04ec, B:241:0x04fb, B:251:0x0520, B:244:0x0505, B:113:0x02ac, B:115:0x02b2, B:117:0x02bf, B:132:0x0349, B:175:0x03a2, B:177:0x03af, B:179:0x03c6, B:180:0x03d0, B:164:0x0385, B:170:0x0390, B:171:0x0393, B:168:0x038b, B:152:0x036e, B:158:0x0379, B:156:0x0374, B:172:0x0394, B:88:0x0227, B:90:0x022f, B:106:0x028f, B:108:0x029a, B:91:0x023c, B:93:0x0253, B:94:0x025d, B:96:0x0263, B:97:0x0265, B:99:0x0278, B:101:0x027e, B:102:0x0283, B:105:0x028a, B:181:0x03d6, B:182:0x03e5, B:184:0x03eb, B:186:0x03fe, B:232:0x04cb, B:187:0x040c, B:189:0x041e, B:191:0x0424, B:192:0x042b, B:199:0x0457, B:218:0x047d, B:219:0x0480, B:214:0x0475, B:220:0x0481, B:222:0x0489, B:223:0x0495, B:225:0x04a8, B:226:0x04b4, B:228:0x04ba, B:229:0x04c0, B:60:0x018b, B:76:0x01c8, B:63:0x019d, B:66:0x01a7, B:69:0x01b2, B:72:0x01bc, B:42:0x0112, B:43:0x0122, B:46:0x0136, B:264:0x054d), top: B:291:0x006c, outer: #1, inners: #6, #9, #10 }] */
    /* JADX WARN: Code duplicated, block: B:175:0x03a2 A[Catch: all -> 0x0566, TryCatch #3 {all -> 0x0566, blocks: (B:12:0x006c, B:13:0x007b, B:15:0x0087, B:21:0x00a0, B:22:0x00ad, B:23:0x00b1, B:25:0x00b7, B:27:0x00c3, B:34:0x00ed, B:36:0x00f6, B:37:0x00fb, B:39:0x0101, B:53:0x0151, B:55:0x0159, B:57:0x016f, B:82:0x01e0, B:83:0x020b, B:85:0x0211, B:236:0x04e0, B:237:0x04e6, B:239:0x04ec, B:241:0x04fb, B:251:0x0520, B:244:0x0505, B:113:0x02ac, B:115:0x02b2, B:117:0x02bf, B:132:0x0349, B:175:0x03a2, B:177:0x03af, B:179:0x03c6, B:180:0x03d0, B:164:0x0385, B:170:0x0390, B:171:0x0393, B:168:0x038b, B:152:0x036e, B:158:0x0379, B:156:0x0374, B:172:0x0394, B:88:0x0227, B:90:0x022f, B:106:0x028f, B:108:0x029a, B:91:0x023c, B:93:0x0253, B:94:0x025d, B:96:0x0263, B:97:0x0265, B:99:0x0278, B:101:0x027e, B:102:0x0283, B:105:0x028a, B:181:0x03d6, B:182:0x03e5, B:184:0x03eb, B:186:0x03fe, B:232:0x04cb, B:187:0x040c, B:189:0x041e, B:191:0x0424, B:192:0x042b, B:199:0x0457, B:218:0x047d, B:219:0x0480, B:214:0x0475, B:220:0x0481, B:222:0x0489, B:223:0x0495, B:225:0x04a8, B:226:0x04b4, B:228:0x04ba, B:229:0x04c0, B:60:0x018b, B:76:0x01c8, B:63:0x019d, B:66:0x01a7, B:69:0x01b2, B:72:0x01bc, B:42:0x0112, B:43:0x0122, B:46:0x0136, B:264:0x054d), top: B:291:0x006c, outer: #1, inners: #6, #9, #10 }] */
    /* JADX WARN: Code duplicated, block: B:177:0x03af A[Catch: all -> 0x0566, TryCatch #3 {all -> 0x0566, blocks: (B:12:0x006c, B:13:0x007b, B:15:0x0087, B:21:0x00a0, B:22:0x00ad, B:23:0x00b1, B:25:0x00b7, B:27:0x00c3, B:34:0x00ed, B:36:0x00f6, B:37:0x00fb, B:39:0x0101, B:53:0x0151, B:55:0x0159, B:57:0x016f, B:82:0x01e0, B:83:0x020b, B:85:0x0211, B:236:0x04e0, B:237:0x04e6, B:239:0x04ec, B:241:0x04fb, B:251:0x0520, B:244:0x0505, B:113:0x02ac, B:115:0x02b2, B:117:0x02bf, B:132:0x0349, B:175:0x03a2, B:177:0x03af, B:179:0x03c6, B:180:0x03d0, B:164:0x0385, B:170:0x0390, B:171:0x0393, B:168:0x038b, B:152:0x036e, B:158:0x0379, B:156:0x0374, B:172:0x0394, B:88:0x0227, B:90:0x022f, B:106:0x028f, B:108:0x029a, B:91:0x023c, B:93:0x0253, B:94:0x025d, B:96:0x0263, B:97:0x0265, B:99:0x0278, B:101:0x027e, B:102:0x0283, B:105:0x028a, B:181:0x03d6, B:182:0x03e5, B:184:0x03eb, B:186:0x03fe, B:232:0x04cb, B:187:0x040c, B:189:0x041e, B:191:0x0424, B:192:0x042b, B:199:0x0457, B:218:0x047d, B:219:0x0480, B:214:0x0475, B:220:0x0481, B:222:0x0489, B:223:0x0495, B:225:0x04a8, B:226:0x04b4, B:228:0x04ba, B:229:0x04c0, B:60:0x018b, B:76:0x01c8, B:63:0x019d, B:66:0x01a7, B:69:0x01b2, B:72:0x01bc, B:42:0x0112, B:43:0x0122, B:46:0x0136, B:264:0x054d), top: B:291:0x006c, outer: #1, inners: #6, #9, #10 }] */
    /* JADX WARN: Code duplicated, block: B:179:0x03c6 A[Catch: all -> 0x0566, TryCatch #3 {all -> 0x0566, blocks: (B:12:0x006c, B:13:0x007b, B:15:0x0087, B:21:0x00a0, B:22:0x00ad, B:23:0x00b1, B:25:0x00b7, B:27:0x00c3, B:34:0x00ed, B:36:0x00f6, B:37:0x00fb, B:39:0x0101, B:53:0x0151, B:55:0x0159, B:57:0x016f, B:82:0x01e0, B:83:0x020b, B:85:0x0211, B:236:0x04e0, B:237:0x04e6, B:239:0x04ec, B:241:0x04fb, B:251:0x0520, B:244:0x0505, B:113:0x02ac, B:115:0x02b2, B:117:0x02bf, B:132:0x0349, B:175:0x03a2, B:177:0x03af, B:179:0x03c6, B:180:0x03d0, B:164:0x0385, B:170:0x0390, B:171:0x0393, B:168:0x038b, B:152:0x036e, B:158:0x0379, B:156:0x0374, B:172:0x0394, B:88:0x0227, B:90:0x022f, B:106:0x028f, B:108:0x029a, B:91:0x023c, B:93:0x0253, B:94:0x025d, B:96:0x0263, B:97:0x0265, B:99:0x0278, B:101:0x027e, B:102:0x0283, B:105:0x028a, B:181:0x03d6, B:182:0x03e5, B:184:0x03eb, B:186:0x03fe, B:232:0x04cb, B:187:0x040c, B:189:0x041e, B:191:0x0424, B:192:0x042b, B:199:0x0457, B:218:0x047d, B:219:0x0480, B:214:0x0475, B:220:0x0481, B:222:0x0489, B:223:0x0495, B:225:0x04a8, B:226:0x04b4, B:228:0x04ba, B:229:0x04c0, B:60:0x018b, B:76:0x01c8, B:63:0x019d, B:66:0x01a7, B:69:0x01b2, B:72:0x01bc, B:42:0x0112, B:43:0x0122, B:46:0x0136, B:264:0x054d), top: B:291:0x006c, outer: #1, inners: #6, #9, #10 }] */
    /* JADX WARN: Code duplicated, block: B:181:0x03d6 A[Catch: all -> 0x0566, TryCatch #3 {all -> 0x0566, blocks: (B:12:0x006c, B:13:0x007b, B:15:0x0087, B:21:0x00a0, B:22:0x00ad, B:23:0x00b1, B:25:0x00b7, B:27:0x00c3, B:34:0x00ed, B:36:0x00f6, B:37:0x00fb, B:39:0x0101, B:53:0x0151, B:55:0x0159, B:57:0x016f, B:82:0x01e0, B:83:0x020b, B:85:0x0211, B:236:0x04e0, B:237:0x04e6, B:239:0x04ec, B:241:0x04fb, B:251:0x0520, B:244:0x0505, B:113:0x02ac, B:115:0x02b2, B:117:0x02bf, B:132:0x0349, B:175:0x03a2, B:177:0x03af, B:179:0x03c6, B:180:0x03d0, B:164:0x0385, B:170:0x0390, B:171:0x0393, B:168:0x038b, B:152:0x036e, B:158:0x0379, B:156:0x0374, B:172:0x0394, B:88:0x0227, B:90:0x022f, B:106:0x028f, B:108:0x029a, B:91:0x023c, B:93:0x0253, B:94:0x025d, B:96:0x0263, B:97:0x0265, B:99:0x0278, B:101:0x027e, B:102:0x0283, B:105:0x028a, B:181:0x03d6, B:182:0x03e5, B:184:0x03eb, B:186:0x03fe, B:232:0x04cb, B:187:0x040c, B:189:0x041e, B:191:0x0424, B:192:0x042b, B:199:0x0457, B:218:0x047d, B:219:0x0480, B:214:0x0475, B:220:0x0481, B:222:0x0489, B:223:0x0495, B:225:0x04a8, B:226:0x04b4, B:228:0x04ba, B:229:0x04c0, B:60:0x018b, B:76:0x01c8, B:63:0x019d, B:66:0x01a7, B:69:0x01b2, B:72:0x01bc, B:42:0x0112, B:43:0x0122, B:46:0x0136, B:264:0x054d), top: B:291:0x006c, outer: #1, inners: #6, #9, #10 }] */
    /* JADX WARN: Code duplicated, block: B:184:0x03eb A[Catch: all -> 0x0566, TryCatch #3 {all -> 0x0566, blocks: (B:12:0x006c, B:13:0x007b, B:15:0x0087, B:21:0x00a0, B:22:0x00ad, B:23:0x00b1, B:25:0x00b7, B:27:0x00c3, B:34:0x00ed, B:36:0x00f6, B:37:0x00fb, B:39:0x0101, B:53:0x0151, B:55:0x0159, B:57:0x016f, B:82:0x01e0, B:83:0x020b, B:85:0x0211, B:236:0x04e0, B:237:0x04e6, B:239:0x04ec, B:241:0x04fb, B:251:0x0520, B:244:0x0505, B:113:0x02ac, B:115:0x02b2, B:117:0x02bf, B:132:0x0349, B:175:0x03a2, B:177:0x03af, B:179:0x03c6, B:180:0x03d0, B:164:0x0385, B:170:0x0390, B:171:0x0393, B:168:0x038b, B:152:0x036e, B:158:0x0379, B:156:0x0374, B:172:0x0394, B:88:0x0227, B:90:0x022f, B:106:0x028f, B:108:0x029a, B:91:0x023c, B:93:0x0253, B:94:0x025d, B:96:0x0263, B:97:0x0265, B:99:0x0278, B:101:0x027e, B:102:0x0283, B:105:0x028a, B:181:0x03d6, B:182:0x03e5, B:184:0x03eb, B:186:0x03fe, B:232:0x04cb, B:187:0x040c, B:189:0x041e, B:191:0x0424, B:192:0x042b, B:199:0x0457, B:218:0x047d, B:219:0x0480, B:214:0x0475, B:220:0x0481, B:222:0x0489, B:223:0x0495, B:225:0x04a8, B:226:0x04b4, B:228:0x04ba, B:229:0x04c0, B:60:0x018b, B:76:0x01c8, B:63:0x019d, B:66:0x01a7, B:69:0x01b2, B:72:0x01bc, B:42:0x0112, B:43:0x0122, B:46:0x0136, B:264:0x054d), top: B:291:0x006c, outer: #1, inners: #6, #9, #10 }] */
    /* JADX WARN: Code duplicated, block: B:186:0x03fe A[Catch: all -> 0x0566, TryCatch #3 {all -> 0x0566, blocks: (B:12:0x006c, B:13:0x007b, B:15:0x0087, B:21:0x00a0, B:22:0x00ad, B:23:0x00b1, B:25:0x00b7, B:27:0x00c3, B:34:0x00ed, B:36:0x00f6, B:37:0x00fb, B:39:0x0101, B:53:0x0151, B:55:0x0159, B:57:0x016f, B:82:0x01e0, B:83:0x020b, B:85:0x0211, B:236:0x04e0, B:237:0x04e6, B:239:0x04ec, B:241:0x04fb, B:251:0x0520, B:244:0x0505, B:113:0x02ac, B:115:0x02b2, B:117:0x02bf, B:132:0x0349, B:175:0x03a2, B:177:0x03af, B:179:0x03c6, B:180:0x03d0, B:164:0x0385, B:170:0x0390, B:171:0x0393, B:168:0x038b, B:152:0x036e, B:158:0x0379, B:156:0x0374, B:172:0x0394, B:88:0x0227, B:90:0x022f, B:106:0x028f, B:108:0x029a, B:91:0x023c, B:93:0x0253, B:94:0x025d, B:96:0x0263, B:97:0x0265, B:99:0x0278, B:101:0x027e, B:102:0x0283, B:105:0x028a, B:181:0x03d6, B:182:0x03e5, B:184:0x03eb, B:186:0x03fe, B:232:0x04cb, B:187:0x040c, B:189:0x041e, B:191:0x0424, B:192:0x042b, B:199:0x0457, B:218:0x047d, B:219:0x0480, B:214:0x0475, B:220:0x0481, B:222:0x0489, B:223:0x0495, B:225:0x04a8, B:226:0x04b4, B:228:0x04ba, B:229:0x04c0, B:60:0x018b, B:76:0x01c8, B:63:0x019d, B:66:0x01a7, B:69:0x01b2, B:72:0x01bc, B:42:0x0112, B:43:0x0122, B:46:0x0136, B:264:0x054d), top: B:291:0x006c, outer: #1, inners: #6, #9, #10 }] */
    /* JADX WARN: Code duplicated, block: B:187:0x040c A[Catch: all -> 0x0566, TryCatch #3 {all -> 0x0566, blocks: (B:12:0x006c, B:13:0x007b, B:15:0x0087, B:21:0x00a0, B:22:0x00ad, B:23:0x00b1, B:25:0x00b7, B:27:0x00c3, B:34:0x00ed, B:36:0x00f6, B:37:0x00fb, B:39:0x0101, B:53:0x0151, B:55:0x0159, B:57:0x016f, B:82:0x01e0, B:83:0x020b, B:85:0x0211, B:236:0x04e0, B:237:0x04e6, B:239:0x04ec, B:241:0x04fb, B:251:0x0520, B:244:0x0505, B:113:0x02ac, B:115:0x02b2, B:117:0x02bf, B:132:0x0349, B:175:0x03a2, B:177:0x03af, B:179:0x03c6, B:180:0x03d0, B:164:0x0385, B:170:0x0390, B:171:0x0393, B:168:0x038b, B:152:0x036e, B:158:0x0379, B:156:0x0374, B:172:0x0394, B:88:0x0227, B:90:0x022f, B:106:0x028f, B:108:0x029a, B:91:0x023c, B:93:0x0253, B:94:0x025d, B:96:0x0263, B:97:0x0265, B:99:0x0278, B:101:0x027e, B:102:0x0283, B:105:0x028a, B:181:0x03d6, B:182:0x03e5, B:184:0x03eb, B:186:0x03fe, B:232:0x04cb, B:187:0x040c, B:189:0x041e, B:191:0x0424, B:192:0x042b, B:199:0x0457, B:218:0x047d, B:219:0x0480, B:214:0x0475, B:220:0x0481, B:222:0x0489, B:223:0x0495, B:225:0x04a8, B:226:0x04b4, B:228:0x04ba, B:229:0x04c0, B:60:0x018b, B:76:0x01c8, B:63:0x019d, B:66:0x01a7, B:69:0x01b2, B:72:0x01bc, B:42:0x0112, B:43:0x0122, B:46:0x0136, B:264:0x054d), top: B:291:0x006c, outer: #1, inners: #6, #9, #10 }] */
    /* JADX WARN: Code duplicated, block: B:189:0x041e A[Catch: all -> 0x0566, TryCatch #3 {all -> 0x0566, blocks: (B:12:0x006c, B:13:0x007b, B:15:0x0087, B:21:0x00a0, B:22:0x00ad, B:23:0x00b1, B:25:0x00b7, B:27:0x00c3, B:34:0x00ed, B:36:0x00f6, B:37:0x00fb, B:39:0x0101, B:53:0x0151, B:55:0x0159, B:57:0x016f, B:82:0x01e0, B:83:0x020b, B:85:0x0211, B:236:0x04e0, B:237:0x04e6, B:239:0x04ec, B:241:0x04fb, B:251:0x0520, B:244:0x0505, B:113:0x02ac, B:115:0x02b2, B:117:0x02bf, B:132:0x0349, B:175:0x03a2, B:177:0x03af, B:179:0x03c6, B:180:0x03d0, B:164:0x0385, B:170:0x0390, B:171:0x0393, B:168:0x038b, B:152:0x036e, B:158:0x0379, B:156:0x0374, B:172:0x0394, B:88:0x0227, B:90:0x022f, B:106:0x028f, B:108:0x029a, B:91:0x023c, B:93:0x0253, B:94:0x025d, B:96:0x0263, B:97:0x0265, B:99:0x0278, B:101:0x027e, B:102:0x0283, B:105:0x028a, B:181:0x03d6, B:182:0x03e5, B:184:0x03eb, B:186:0x03fe, B:232:0x04cb, B:187:0x040c, B:189:0x041e, B:191:0x0424, B:192:0x042b, B:199:0x0457, B:218:0x047d, B:219:0x0480, B:214:0x0475, B:220:0x0481, B:222:0x0489, B:223:0x0495, B:225:0x04a8, B:226:0x04b4, B:228:0x04ba, B:229:0x04c0, B:60:0x018b, B:76:0x01c8, B:63:0x019d, B:66:0x01a7, B:69:0x01b2, B:72:0x01bc, B:42:0x0112, B:43:0x0122, B:46:0x0136, B:264:0x054d), top: B:291:0x006c, outer: #1, inners: #6, #9, #10 }] */
    /* JADX WARN: Code duplicated, block: B:192:0x042b A[Catch: all -> 0x0566, TRY_LEAVE, TryCatch #3 {all -> 0x0566, blocks: (B:12:0x006c, B:13:0x007b, B:15:0x0087, B:21:0x00a0, B:22:0x00ad, B:23:0x00b1, B:25:0x00b7, B:27:0x00c3, B:34:0x00ed, B:36:0x00f6, B:37:0x00fb, B:39:0x0101, B:53:0x0151, B:55:0x0159, B:57:0x016f, B:82:0x01e0, B:83:0x020b, B:85:0x0211, B:236:0x04e0, B:237:0x04e6, B:239:0x04ec, B:241:0x04fb, B:251:0x0520, B:244:0x0505, B:113:0x02ac, B:115:0x02b2, B:117:0x02bf, B:132:0x0349, B:175:0x03a2, B:177:0x03af, B:179:0x03c6, B:180:0x03d0, B:164:0x0385, B:170:0x0390, B:171:0x0393, B:168:0x038b, B:152:0x036e, B:158:0x0379, B:156:0x0374, B:172:0x0394, B:88:0x0227, B:90:0x022f, B:106:0x028f, B:108:0x029a, B:91:0x023c, B:93:0x0253, B:94:0x025d, B:96:0x0263, B:97:0x0265, B:99:0x0278, B:101:0x027e, B:102:0x0283, B:105:0x028a, B:181:0x03d6, B:182:0x03e5, B:184:0x03eb, B:186:0x03fe, B:232:0x04cb, B:187:0x040c, B:189:0x041e, B:191:0x0424, B:192:0x042b, B:199:0x0457, B:218:0x047d, B:219:0x0480, B:214:0x0475, B:220:0x0481, B:222:0x0489, B:223:0x0495, B:225:0x04a8, B:226:0x04b4, B:228:0x04ba, B:229:0x04c0, B:60:0x018b, B:76:0x01c8, B:63:0x019d, B:66:0x01a7, B:69:0x01b2, B:72:0x01bc, B:42:0x0112, B:43:0x0122, B:46:0x0136, B:264:0x054d), top: B:291:0x006c, outer: #1, inners: #6, #9, #10 }] */
    /* JADX WARN: Code duplicated, block: B:196:0x0443 A[Catch: all -> 0x0465, IOException -> 0x0467, TryCatch #29 {IOException -> 0x0467, all -> 0x0465, blocks: (B:194:0x0435, B:196:0x0443, B:197:0x044c), top: B:326:0x0435 }] */
    /* JADX WARN: Code duplicated, block: B:199:0x0457 A[Catch: all -> 0x0566, TRY_ENTER, TRY_LEAVE, TryCatch #3 {all -> 0x0566, blocks: (B:12:0x006c, B:13:0x007b, B:15:0x0087, B:21:0x00a0, B:22:0x00ad, B:23:0x00b1, B:25:0x00b7, B:27:0x00c3, B:34:0x00ed, B:36:0x00f6, B:37:0x00fb, B:39:0x0101, B:53:0x0151, B:55:0x0159, B:57:0x016f, B:82:0x01e0, B:83:0x020b, B:85:0x0211, B:236:0x04e0, B:237:0x04e6, B:239:0x04ec, B:241:0x04fb, B:251:0x0520, B:244:0x0505, B:113:0x02ac, B:115:0x02b2, B:117:0x02bf, B:132:0x0349, B:175:0x03a2, B:177:0x03af, B:179:0x03c6, B:180:0x03d0, B:164:0x0385, B:170:0x0390, B:171:0x0393, B:168:0x038b, B:152:0x036e, B:158:0x0379, B:156:0x0374, B:172:0x0394, B:88:0x0227, B:90:0x022f, B:106:0x028f, B:108:0x029a, B:91:0x023c, B:93:0x0253, B:94:0x025d, B:96:0x0263, B:97:0x0265, B:99:0x0278, B:101:0x027e, B:102:0x0283, B:105:0x028a, B:181:0x03d6, B:182:0x03e5, B:184:0x03eb, B:186:0x03fe, B:232:0x04cb, B:187:0x040c, B:189:0x041e, B:191:0x0424, B:192:0x042b, B:199:0x0457, B:218:0x047d, B:219:0x0480, B:214:0x0475, B:220:0x0481, B:222:0x0489, B:223:0x0495, B:225:0x04a8, B:226:0x04b4, B:228:0x04ba, B:229:0x04c0, B:60:0x018b, B:76:0x01c8, B:63:0x019d, B:66:0x01a7, B:69:0x01b2, B:72:0x01bc, B:42:0x0112, B:43:0x0122, B:46:0x0136, B:264:0x054d), top: B:291:0x006c, outer: #1, inners: #6, #9, #10 }] */
    /* JADX WARN: Code duplicated, block: B:203:0x0460  */
    /* JADX WARN: Code duplicated, block: B:218:0x047d A[Catch: all -> 0x0566, TryCatch #3 {all -> 0x0566, blocks: (B:12:0x006c, B:13:0x007b, B:15:0x0087, B:21:0x00a0, B:22:0x00ad, B:23:0x00b1, B:25:0x00b7, B:27:0x00c3, B:34:0x00ed, B:36:0x00f6, B:37:0x00fb, B:39:0x0101, B:53:0x0151, B:55:0x0159, B:57:0x016f, B:82:0x01e0, B:83:0x020b, B:85:0x0211, B:236:0x04e0, B:237:0x04e6, B:239:0x04ec, B:241:0x04fb, B:251:0x0520, B:244:0x0505, B:113:0x02ac, B:115:0x02b2, B:117:0x02bf, B:132:0x0349, B:175:0x03a2, B:177:0x03af, B:179:0x03c6, B:180:0x03d0, B:164:0x0385, B:170:0x0390, B:171:0x0393, B:168:0x038b, B:152:0x036e, B:158:0x0379, B:156:0x0374, B:172:0x0394, B:88:0x0227, B:90:0x022f, B:106:0x028f, B:108:0x029a, B:91:0x023c, B:93:0x0253, B:94:0x025d, B:96:0x0263, B:97:0x0265, B:99:0x0278, B:101:0x027e, B:102:0x0283, B:105:0x028a, B:181:0x03d6, B:182:0x03e5, B:184:0x03eb, B:186:0x03fe, B:232:0x04cb, B:187:0x040c, B:189:0x041e, B:191:0x0424, B:192:0x042b, B:199:0x0457, B:218:0x047d, B:219:0x0480, B:214:0x0475, B:220:0x0481, B:222:0x0489, B:223:0x0495, B:225:0x04a8, B:226:0x04b4, B:228:0x04ba, B:229:0x04c0, B:60:0x018b, B:76:0x01c8, B:63:0x019d, B:66:0x01a7, B:69:0x01b2, B:72:0x01bc, B:42:0x0112, B:43:0x0122, B:46:0x0136, B:264:0x054d), top: B:291:0x006c, outer: #1, inners: #6, #9, #10 }] */
    /* JADX WARN: Code duplicated, block: B:220:0x0481 A[Catch: all -> 0x0566, TryCatch #3 {all -> 0x0566, blocks: (B:12:0x006c, B:13:0x007b, B:15:0x0087, B:21:0x00a0, B:22:0x00ad, B:23:0x00b1, B:25:0x00b7, B:27:0x00c3, B:34:0x00ed, B:36:0x00f6, B:37:0x00fb, B:39:0x0101, B:53:0x0151, B:55:0x0159, B:57:0x016f, B:82:0x01e0, B:83:0x020b, B:85:0x0211, B:236:0x04e0, B:237:0x04e6, B:239:0x04ec, B:241:0x04fb, B:251:0x0520, B:244:0x0505, B:113:0x02ac, B:115:0x02b2, B:117:0x02bf, B:132:0x0349, B:175:0x03a2, B:177:0x03af, B:179:0x03c6, B:180:0x03d0, B:164:0x0385, B:170:0x0390, B:171:0x0393, B:168:0x038b, B:152:0x036e, B:158:0x0379, B:156:0x0374, B:172:0x0394, B:88:0x0227, B:90:0x022f, B:106:0x028f, B:108:0x029a, B:91:0x023c, B:93:0x0253, B:94:0x025d, B:96:0x0263, B:97:0x0265, B:99:0x0278, B:101:0x027e, B:102:0x0283, B:105:0x028a, B:181:0x03d6, B:182:0x03e5, B:184:0x03eb, B:186:0x03fe, B:232:0x04cb, B:187:0x040c, B:189:0x041e, B:191:0x0424, B:192:0x042b, B:199:0x0457, B:218:0x047d, B:219:0x0480, B:214:0x0475, B:220:0x0481, B:222:0x0489, B:223:0x0495, B:225:0x04a8, B:226:0x04b4, B:228:0x04ba, B:229:0x04c0, B:60:0x018b, B:76:0x01c8, B:63:0x019d, B:66:0x01a7, B:69:0x01b2, B:72:0x01bc, B:42:0x0112, B:43:0x0122, B:46:0x0136, B:264:0x054d), top: B:291:0x006c, outer: #1, inners: #6, #9, #10 }] */
    /* JADX WARN: Code duplicated, block: B:222:0x0489 A[Catch: all -> 0x0566, TryCatch #3 {all -> 0x0566, blocks: (B:12:0x006c, B:13:0x007b, B:15:0x0087, B:21:0x00a0, B:22:0x00ad, B:23:0x00b1, B:25:0x00b7, B:27:0x00c3, B:34:0x00ed, B:36:0x00f6, B:37:0x00fb, B:39:0x0101, B:53:0x0151, B:55:0x0159, B:57:0x016f, B:82:0x01e0, B:83:0x020b, B:85:0x0211, B:236:0x04e0, B:237:0x04e6, B:239:0x04ec, B:241:0x04fb, B:251:0x0520, B:244:0x0505, B:113:0x02ac, B:115:0x02b2, B:117:0x02bf, B:132:0x0349, B:175:0x03a2, B:177:0x03af, B:179:0x03c6, B:180:0x03d0, B:164:0x0385, B:170:0x0390, B:171:0x0393, B:168:0x038b, B:152:0x036e, B:158:0x0379, B:156:0x0374, B:172:0x0394, B:88:0x0227, B:90:0x022f, B:106:0x028f, B:108:0x029a, B:91:0x023c, B:93:0x0253, B:94:0x025d, B:96:0x0263, B:97:0x0265, B:99:0x0278, B:101:0x027e, B:102:0x0283, B:105:0x028a, B:181:0x03d6, B:182:0x03e5, B:184:0x03eb, B:186:0x03fe, B:232:0x04cb, B:187:0x040c, B:189:0x041e, B:191:0x0424, B:192:0x042b, B:199:0x0457, B:218:0x047d, B:219:0x0480, B:214:0x0475, B:220:0x0481, B:222:0x0489, B:223:0x0495, B:225:0x04a8, B:226:0x04b4, B:228:0x04ba, B:229:0x04c0, B:60:0x018b, B:76:0x01c8, B:63:0x019d, B:66:0x01a7, B:69:0x01b2, B:72:0x01bc, B:42:0x0112, B:43:0x0122, B:46:0x0136, B:264:0x054d), top: B:291:0x006c, outer: #1, inners: #6, #9, #10 }] */
    /* JADX WARN: Code duplicated, block: B:223:0x0495 A[Catch: all -> 0x0566, TryCatch #3 {all -> 0x0566, blocks: (B:12:0x006c, B:13:0x007b, B:15:0x0087, B:21:0x00a0, B:22:0x00ad, B:23:0x00b1, B:25:0x00b7, B:27:0x00c3, B:34:0x00ed, B:36:0x00f6, B:37:0x00fb, B:39:0x0101, B:53:0x0151, B:55:0x0159, B:57:0x016f, B:82:0x01e0, B:83:0x020b, B:85:0x0211, B:236:0x04e0, B:237:0x04e6, B:239:0x04ec, B:241:0x04fb, B:251:0x0520, B:244:0x0505, B:113:0x02ac, B:115:0x02b2, B:117:0x02bf, B:132:0x0349, B:175:0x03a2, B:177:0x03af, B:179:0x03c6, B:180:0x03d0, B:164:0x0385, B:170:0x0390, B:171:0x0393, B:168:0x038b, B:152:0x036e, B:158:0x0379, B:156:0x0374, B:172:0x0394, B:88:0x0227, B:90:0x022f, B:106:0x028f, B:108:0x029a, B:91:0x023c, B:93:0x0253, B:94:0x025d, B:96:0x0263, B:97:0x0265, B:99:0x0278, B:101:0x027e, B:102:0x0283, B:105:0x028a, B:181:0x03d6, B:182:0x03e5, B:184:0x03eb, B:186:0x03fe, B:232:0x04cb, B:187:0x040c, B:189:0x041e, B:191:0x0424, B:192:0x042b, B:199:0x0457, B:218:0x047d, B:219:0x0480, B:214:0x0475, B:220:0x0481, B:222:0x0489, B:223:0x0495, B:225:0x04a8, B:226:0x04b4, B:228:0x04ba, B:229:0x04c0, B:60:0x018b, B:76:0x01c8, B:63:0x019d, B:66:0x01a7, B:69:0x01b2, B:72:0x01bc, B:42:0x0112, B:43:0x0122, B:46:0x0136, B:264:0x054d), top: B:291:0x006c, outer: #1, inners: #6, #9, #10 }] */
    /* JADX WARN: Code duplicated, block: B:225:0x04a8 A[Catch: all -> 0x0566, TryCatch #3 {all -> 0x0566, blocks: (B:12:0x006c, B:13:0x007b, B:15:0x0087, B:21:0x00a0, B:22:0x00ad, B:23:0x00b1, B:25:0x00b7, B:27:0x00c3, B:34:0x00ed, B:36:0x00f6, B:37:0x00fb, B:39:0x0101, B:53:0x0151, B:55:0x0159, B:57:0x016f, B:82:0x01e0, B:83:0x020b, B:85:0x0211, B:236:0x04e0, B:237:0x04e6, B:239:0x04ec, B:241:0x04fb, B:251:0x0520, B:244:0x0505, B:113:0x02ac, B:115:0x02b2, B:117:0x02bf, B:132:0x0349, B:175:0x03a2, B:177:0x03af, B:179:0x03c6, B:180:0x03d0, B:164:0x0385, B:170:0x0390, B:171:0x0393, B:168:0x038b, B:152:0x036e, B:158:0x0379, B:156:0x0374, B:172:0x0394, B:88:0x0227, B:90:0x022f, B:106:0x028f, B:108:0x029a, B:91:0x023c, B:93:0x0253, B:94:0x025d, B:96:0x0263, B:97:0x0265, B:99:0x0278, B:101:0x027e, B:102:0x0283, B:105:0x028a, B:181:0x03d6, B:182:0x03e5, B:184:0x03eb, B:186:0x03fe, B:232:0x04cb, B:187:0x040c, B:189:0x041e, B:191:0x0424, B:192:0x042b, B:199:0x0457, B:218:0x047d, B:219:0x0480, B:214:0x0475, B:220:0x0481, B:222:0x0489, B:223:0x0495, B:225:0x04a8, B:226:0x04b4, B:228:0x04ba, B:229:0x04c0, B:60:0x018b, B:76:0x01c8, B:63:0x019d, B:66:0x01a7, B:69:0x01b2, B:72:0x01bc, B:42:0x0112, B:43:0x0122, B:46:0x0136, B:264:0x054d), top: B:291:0x006c, outer: #1, inners: #6, #9, #10 }] */
    /* JADX WARN: Code duplicated, block: B:226:0x04b4 A[Catch: all -> 0x0566, TryCatch #3 {all -> 0x0566, blocks: (B:12:0x006c, B:13:0x007b, B:15:0x0087, B:21:0x00a0, B:22:0x00ad, B:23:0x00b1, B:25:0x00b7, B:27:0x00c3, B:34:0x00ed, B:36:0x00f6, B:37:0x00fb, B:39:0x0101, B:53:0x0151, B:55:0x0159, B:57:0x016f, B:82:0x01e0, B:83:0x020b, B:85:0x0211, B:236:0x04e0, B:237:0x04e6, B:239:0x04ec, B:241:0x04fb, B:251:0x0520, B:244:0x0505, B:113:0x02ac, B:115:0x02b2, B:117:0x02bf, B:132:0x0349, B:175:0x03a2, B:177:0x03af, B:179:0x03c6, B:180:0x03d0, B:164:0x0385, B:170:0x0390, B:171:0x0393, B:168:0x038b, B:152:0x036e, B:158:0x0379, B:156:0x0374, B:172:0x0394, B:88:0x0227, B:90:0x022f, B:106:0x028f, B:108:0x029a, B:91:0x023c, B:93:0x0253, B:94:0x025d, B:96:0x0263, B:97:0x0265, B:99:0x0278, B:101:0x027e, B:102:0x0283, B:105:0x028a, B:181:0x03d6, B:182:0x03e5, B:184:0x03eb, B:186:0x03fe, B:232:0x04cb, B:187:0x040c, B:189:0x041e, B:191:0x0424, B:192:0x042b, B:199:0x0457, B:218:0x047d, B:219:0x0480, B:214:0x0475, B:220:0x0481, B:222:0x0489, B:223:0x0495, B:225:0x04a8, B:226:0x04b4, B:228:0x04ba, B:229:0x04c0, B:60:0x018b, B:76:0x01c8, B:63:0x019d, B:66:0x01a7, B:69:0x01b2, B:72:0x01bc, B:42:0x0112, B:43:0x0122, B:46:0x0136, B:264:0x054d), top: B:291:0x006c, outer: #1, inners: #6, #9, #10 }] */
    /* JADX WARN: Code duplicated, block: B:229:0x04c0 A[Catch: all -> 0x0566, TryCatch #3 {all -> 0x0566, blocks: (B:12:0x006c, B:13:0x007b, B:15:0x0087, B:21:0x00a0, B:22:0x00ad, B:23:0x00b1, B:25:0x00b7, B:27:0x00c3, B:34:0x00ed, B:36:0x00f6, B:37:0x00fb, B:39:0x0101, B:53:0x0151, B:55:0x0159, B:57:0x016f, B:82:0x01e0, B:83:0x020b, B:85:0x0211, B:236:0x04e0, B:237:0x04e6, B:239:0x04ec, B:241:0x04fb, B:251:0x0520, B:244:0x0505, B:113:0x02ac, B:115:0x02b2, B:117:0x02bf, B:132:0x0349, B:175:0x03a2, B:177:0x03af, B:179:0x03c6, B:180:0x03d0, B:164:0x0385, B:170:0x0390, B:171:0x0393, B:168:0x038b, B:152:0x036e, B:158:0x0379, B:156:0x0374, B:172:0x0394, B:88:0x0227, B:90:0x022f, B:106:0x028f, B:108:0x029a, B:91:0x023c, B:93:0x0253, B:94:0x025d, B:96:0x0263, B:97:0x0265, B:99:0x0278, B:101:0x027e, B:102:0x0283, B:105:0x028a, B:181:0x03d6, B:182:0x03e5, B:184:0x03eb, B:186:0x03fe, B:232:0x04cb, B:187:0x040c, B:189:0x041e, B:191:0x0424, B:192:0x042b, B:199:0x0457, B:218:0x047d, B:219:0x0480, B:214:0x0475, B:220:0x0481, B:222:0x0489, B:223:0x0495, B:225:0x04a8, B:226:0x04b4, B:228:0x04ba, B:229:0x04c0, B:60:0x018b, B:76:0x01c8, B:63:0x019d, B:66:0x01a7, B:69:0x01b2, B:72:0x01bc, B:42:0x0112, B:43:0x0122, B:46:0x0136, B:264:0x054d), top: B:291:0x006c, outer: #1, inners: #6, #9, #10 }] */
    /* JADX WARN: Code duplicated, block: B:239:0x04ec A[Catch: all -> 0x0566, LOOP:4: B:237:0x04e6->B:239:0x04ec, LOOP_END, TRY_LEAVE, TryCatch #3 {all -> 0x0566, blocks: (B:12:0x006c, B:13:0x007b, B:15:0x0087, B:21:0x00a0, B:22:0x00ad, B:23:0x00b1, B:25:0x00b7, B:27:0x00c3, B:34:0x00ed, B:36:0x00f6, B:37:0x00fb, B:39:0x0101, B:53:0x0151, B:55:0x0159, B:57:0x016f, B:82:0x01e0, B:83:0x020b, B:85:0x0211, B:236:0x04e0, B:237:0x04e6, B:239:0x04ec, B:241:0x04fb, B:251:0x0520, B:244:0x0505, B:113:0x02ac, B:115:0x02b2, B:117:0x02bf, B:132:0x0349, B:175:0x03a2, B:177:0x03af, B:179:0x03c6, B:180:0x03d0, B:164:0x0385, B:170:0x0390, B:171:0x0393, B:168:0x038b, B:152:0x036e, B:158:0x0379, B:156:0x0374, B:172:0x0394, B:88:0x0227, B:90:0x022f, B:106:0x028f, B:108:0x029a, B:91:0x023c, B:93:0x0253, B:94:0x025d, B:96:0x0263, B:97:0x0265, B:99:0x0278, B:101:0x027e, B:102:0x0283, B:105:0x028a, B:181:0x03d6, B:182:0x03e5, B:184:0x03eb, B:186:0x03fe, B:232:0x04cb, B:187:0x040c, B:189:0x041e, B:191:0x0424, B:192:0x042b, B:199:0x0457, B:218:0x047d, B:219:0x0480, B:214:0x0475, B:220:0x0481, B:222:0x0489, B:223:0x0495, B:225:0x04a8, B:226:0x04b4, B:228:0x04ba, B:229:0x04c0, B:60:0x018b, B:76:0x01c8, B:63:0x019d, B:66:0x01a7, B:69:0x01b2, B:72:0x01bc, B:42:0x0112, B:43:0x0122, B:46:0x0136, B:264:0x054d), top: B:291:0x006c, outer: #1, inners: #6, #9, #10 }] */
    /* JADX WARN: Code duplicated, block: B:250:0x051e  */
    /* JADX WARN: Code duplicated, block: B:277:0x0584 A[Catch: Exception -> 0x05ac, TryCatch #1 {Exception -> 0x05ac, blocks: (B:7:0x0035, B:10:0x0053, B:275:0x0578, B:277:0x0584, B:278:0x0587, B:280:0x058d, B:11:0x005a, B:16:0x008f, B:19:0x009c, B:32:0x00e8, B:28:0x00d8, B:31:0x00e5, B:253:0x0526, B:258:0x0537, B:256:0x0532, B:261:0x0547, B:245:0x050d, B:248:0x0519, B:47:0x013e, B:50:0x014b, B:271:0x0567, B:272:0x0571, B:274:0x0573, B:265:0x0555, B:268:0x0561, B:12:0x006c, B:13:0x007b, B:15:0x0087, B:21:0x00a0, B:22:0x00ad, B:23:0x00b1, B:25:0x00b7, B:27:0x00c3, B:34:0x00ed, B:36:0x00f6, B:37:0x00fb, B:39:0x0101, B:53:0x0151, B:55:0x0159, B:57:0x016f, B:82:0x01e0, B:83:0x020b, B:85:0x0211, B:236:0x04e0, B:237:0x04e6, B:239:0x04ec, B:241:0x04fb, B:251:0x0520, B:244:0x0505, B:113:0x02ac, B:115:0x02b2, B:117:0x02bf, B:132:0x0349, B:175:0x03a2, B:177:0x03af, B:179:0x03c6, B:180:0x03d0, B:164:0x0385, B:170:0x0390, B:171:0x0393, B:168:0x038b, B:152:0x036e, B:158:0x0379, B:156:0x0374, B:172:0x0394, B:88:0x0227, B:90:0x022f, B:106:0x028f, B:108:0x029a, B:91:0x023c, B:93:0x0253, B:94:0x025d, B:96:0x0263, B:97:0x0265, B:99:0x0278, B:101:0x027e, B:102:0x0283, B:105:0x028a, B:181:0x03d6, B:182:0x03e5, B:184:0x03eb, B:186:0x03fe, B:232:0x04cb, B:187:0x040c, B:189:0x041e, B:191:0x0424, B:192:0x042b, B:199:0x0457, B:218:0x047d, B:219:0x0480, B:214:0x0475, B:220:0x0481, B:222:0x0489, B:223:0x0495, B:225:0x04a8, B:226:0x04b4, B:228:0x04ba, B:229:0x04c0, B:60:0x018b, B:76:0x01c8, B:63:0x019d, B:66:0x01a7, B:69:0x01b2, B:72:0x01bc, B:42:0x0112, B:43:0x0122, B:46:0x0136, B:264:0x054d), top: B:290:0x0035, inners: #0, #3, #4, #7, #11, #12, #14, #17, #20, #23, #24, #26 }] */
    /* JADX WARN: Code duplicated, block: B:280:0x058d A[Catch: Exception -> 0x05ac, TRY_LEAVE, TryCatch #1 {Exception -> 0x05ac, blocks: (B:7:0x0035, B:10:0x0053, B:275:0x0578, B:277:0x0584, B:278:0x0587, B:280:0x058d, B:11:0x005a, B:16:0x008f, B:19:0x009c, B:32:0x00e8, B:28:0x00d8, B:31:0x00e5, B:253:0x0526, B:258:0x0537, B:256:0x0532, B:261:0x0547, B:245:0x050d, B:248:0x0519, B:47:0x013e, B:50:0x014b, B:271:0x0567, B:272:0x0571, B:274:0x0573, B:265:0x0555, B:268:0x0561, B:12:0x006c, B:13:0x007b, B:15:0x0087, B:21:0x00a0, B:22:0x00ad, B:23:0x00b1, B:25:0x00b7, B:27:0x00c3, B:34:0x00ed, B:36:0x00f6, B:37:0x00fb, B:39:0x0101, B:53:0x0151, B:55:0x0159, B:57:0x016f, B:82:0x01e0, B:83:0x020b, B:85:0x0211, B:236:0x04e0, B:237:0x04e6, B:239:0x04ec, B:241:0x04fb, B:251:0x0520, B:244:0x0505, B:113:0x02ac, B:115:0x02b2, B:117:0x02bf, B:132:0x0349, B:175:0x03a2, B:177:0x03af, B:179:0x03c6, B:180:0x03d0, B:164:0x0385, B:170:0x0390, B:171:0x0393, B:168:0x038b, B:152:0x036e, B:158:0x0379, B:156:0x0374, B:172:0x0394, B:88:0x0227, B:90:0x022f, B:106:0x028f, B:108:0x029a, B:91:0x023c, B:93:0x0253, B:94:0x025d, B:96:0x0263, B:97:0x0265, B:99:0x0278, B:101:0x027e, B:102:0x0283, B:105:0x028a, B:181:0x03d6, B:182:0x03e5, B:184:0x03eb, B:186:0x03fe, B:232:0x04cb, B:187:0x040c, B:189:0x041e, B:191:0x0424, B:192:0x042b, B:199:0x0457, B:218:0x047d, B:219:0x0480, B:214:0x0475, B:220:0x0481, B:222:0x0489, B:223:0x0495, B:225:0x04a8, B:226:0x04b4, B:228:0x04ba, B:229:0x04c0, B:60:0x018b, B:76:0x01c8, B:63:0x019d, B:66:0x01a7, B:69:0x01b2, B:72:0x01bc, B:42:0x0112, B:43:0x0122, B:46:0x0136, B:264:0x054d), top: B:290:0x0035, inners: #0, #3, #4, #7, #11, #12, #14, #17, #20, #23, #24, #26 }] */
    /* JADX WARN: Code duplicated, block: B:285:0x05be  */
    /* JADX WARN: Code duplicated, block: B:287:0x05c2 A[ORIG_RETURN, RETURN] */
    /* JADX WARN: Code duplicated, block: B:294:0x036e A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:298:0x0278 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:300:0x0385 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:308:0x0526 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:318:0x0537 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:340:0x02a4 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:341:0x0223 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:342:0x02a6 A[EDGE_INSN: B:342:0x02a6->B:111:0x02a6 BREAK  A[LOOP:3: B:83:0x020b->B:109:0x029e], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:344:0x029e A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:345:0x04e0 A[EDGE_INSN: B:345:0x04e0->B:236:0x04e0 BREAK  A[LOOP:5: B:182:0x03e5->B:351:?], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:346:0x04ba A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:347:0x04ca A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:348:0x04de A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:350:0x0424 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:351:? A[LOOP:5: B:182:0x03e5->B:351:?, LOOP_END, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:352:? A[Catch: all -> 0x0566, SYNTHETIC, TryCatch #3 {all -> 0x0566, blocks: (B:12:0x006c, B:13:0x007b, B:15:0x0087, B:21:0x00a0, B:22:0x00ad, B:23:0x00b1, B:25:0x00b7, B:27:0x00c3, B:34:0x00ed, B:36:0x00f6, B:37:0x00fb, B:39:0x0101, B:53:0x0151, B:55:0x0159, B:57:0x016f, B:82:0x01e0, B:83:0x020b, B:85:0x0211, B:236:0x04e0, B:237:0x04e6, B:239:0x04ec, B:241:0x04fb, B:251:0x0520, B:244:0x0505, B:113:0x02ac, B:115:0x02b2, B:117:0x02bf, B:132:0x0349, B:175:0x03a2, B:177:0x03af, B:179:0x03c6, B:180:0x03d0, B:164:0x0385, B:170:0x0390, B:171:0x0393, B:168:0x038b, B:152:0x036e, B:158:0x0379, B:156:0x0374, B:172:0x0394, B:88:0x0227, B:90:0x022f, B:106:0x028f, B:108:0x029a, B:91:0x023c, B:93:0x0253, B:94:0x025d, B:96:0x0263, B:97:0x0265, B:99:0x0278, B:101:0x027e, B:102:0x0283, B:105:0x028a, B:181:0x03d6, B:182:0x03e5, B:184:0x03eb, B:186:0x03fe, B:232:0x04cb, B:187:0x040c, B:189:0x041e, B:191:0x0424, B:192:0x042b, B:199:0x0457, B:218:0x047d, B:219:0x0480, B:214:0x0475, B:220:0x0481, B:222:0x0489, B:223:0x0495, B:225:0x04a8, B:226:0x04b4, B:228:0x04ba, B:229:0x04c0, B:60:0x018b, B:76:0x01c8, B:63:0x019d, B:66:0x01a7, B:69:0x01b2, B:72:0x01bc, B:42:0x0112, B:43:0x0122, B:46:0x0136, B:264:0x054d), top: B:291:0x006c, outer: #1, inners: #6, #9, #10 }] */
    /* JADX WARN: Code duplicated, block: B:353:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:55:0x0159 A[Catch: all -> 0x0566, TryCatch #3 {all -> 0x0566, blocks: (B:12:0x006c, B:13:0x007b, B:15:0x0087, B:21:0x00a0, B:22:0x00ad, B:23:0x00b1, B:25:0x00b7, B:27:0x00c3, B:34:0x00ed, B:36:0x00f6, B:37:0x00fb, B:39:0x0101, B:53:0x0151, B:55:0x0159, B:57:0x016f, B:82:0x01e0, B:83:0x020b, B:85:0x0211, B:236:0x04e0, B:237:0x04e6, B:239:0x04ec, B:241:0x04fb, B:251:0x0520, B:244:0x0505, B:113:0x02ac, B:115:0x02b2, B:117:0x02bf, B:132:0x0349, B:175:0x03a2, B:177:0x03af, B:179:0x03c6, B:180:0x03d0, B:164:0x0385, B:170:0x0390, B:171:0x0393, B:168:0x038b, B:152:0x036e, B:158:0x0379, B:156:0x0374, B:172:0x0394, B:88:0x0227, B:90:0x022f, B:106:0x028f, B:108:0x029a, B:91:0x023c, B:93:0x0253, B:94:0x025d, B:96:0x0263, B:97:0x0265, B:99:0x0278, B:101:0x027e, B:102:0x0283, B:105:0x028a, B:181:0x03d6, B:182:0x03e5, B:184:0x03eb, B:186:0x03fe, B:232:0x04cb, B:187:0x040c, B:189:0x041e, B:191:0x0424, B:192:0x042b, B:199:0x0457, B:218:0x047d, B:219:0x0480, B:214:0x0475, B:220:0x0481, B:222:0x0489, B:223:0x0495, B:225:0x04a8, B:226:0x04b4, B:228:0x04ba, B:229:0x04c0, B:60:0x018b, B:76:0x01c8, B:63:0x019d, B:66:0x01a7, B:69:0x01b2, B:72:0x01bc, B:42:0x0112, B:43:0x0122, B:46:0x0136, B:264:0x054d), top: B:291:0x006c, outer: #1, inners: #6, #9, #10 }] */
    /* JADX WARN: Code duplicated, block: B:82:0x01e0 A[Catch: all -> 0x0566, TryCatch #3 {all -> 0x0566, blocks: (B:12:0x006c, B:13:0x007b, B:15:0x0087, B:21:0x00a0, B:22:0x00ad, B:23:0x00b1, B:25:0x00b7, B:27:0x00c3, B:34:0x00ed, B:36:0x00f6, B:37:0x00fb, B:39:0x0101, B:53:0x0151, B:55:0x0159, B:57:0x016f, B:82:0x01e0, B:83:0x020b, B:85:0x0211, B:236:0x04e0, B:237:0x04e6, B:239:0x04ec, B:241:0x04fb, B:251:0x0520, B:244:0x0505, B:113:0x02ac, B:115:0x02b2, B:117:0x02bf, B:132:0x0349, B:175:0x03a2, B:177:0x03af, B:179:0x03c6, B:180:0x03d0, B:164:0x0385, B:170:0x0390, B:171:0x0393, B:168:0x038b, B:152:0x036e, B:158:0x0379, B:156:0x0374, B:172:0x0394, B:88:0x0227, B:90:0x022f, B:106:0x028f, B:108:0x029a, B:91:0x023c, B:93:0x0253, B:94:0x025d, B:96:0x0263, B:97:0x0265, B:99:0x0278, B:101:0x027e, B:102:0x0283, B:105:0x028a, B:181:0x03d6, B:182:0x03e5, B:184:0x03eb, B:186:0x03fe, B:232:0x04cb, B:187:0x040c, B:189:0x041e, B:191:0x0424, B:192:0x042b, B:199:0x0457, B:218:0x047d, B:219:0x0480, B:214:0x0475, B:220:0x0481, B:222:0x0489, B:223:0x0495, B:225:0x04a8, B:226:0x04b4, B:228:0x04ba, B:229:0x04c0, B:60:0x018b, B:76:0x01c8, B:63:0x019d, B:66:0x01a7, B:69:0x01b2, B:72:0x01bc, B:42:0x0112, B:43:0x0122, B:46:0x0136, B:264:0x054d), top: B:291:0x006c, outer: #1, inners: #6, #9, #10 }] */
    /* JADX WARN: Code duplicated, block: B:85:0x0211 A[Catch: all -> 0x0566, TryCatch #3 {all -> 0x0566, blocks: (B:12:0x006c, B:13:0x007b, B:15:0x0087, B:21:0x00a0, B:22:0x00ad, B:23:0x00b1, B:25:0x00b7, B:27:0x00c3, B:34:0x00ed, B:36:0x00f6, B:37:0x00fb, B:39:0x0101, B:53:0x0151, B:55:0x0159, B:57:0x016f, B:82:0x01e0, B:83:0x020b, B:85:0x0211, B:236:0x04e0, B:237:0x04e6, B:239:0x04ec, B:241:0x04fb, B:251:0x0520, B:244:0x0505, B:113:0x02ac, B:115:0x02b2, B:117:0x02bf, B:132:0x0349, B:175:0x03a2, B:177:0x03af, B:179:0x03c6, B:180:0x03d0, B:164:0x0385, B:170:0x0390, B:171:0x0393, B:168:0x038b, B:152:0x036e, B:158:0x0379, B:156:0x0374, B:172:0x0394, B:88:0x0227, B:90:0x022f, B:106:0x028f, B:108:0x029a, B:91:0x023c, B:93:0x0253, B:94:0x025d, B:96:0x0263, B:97:0x0265, B:99:0x0278, B:101:0x027e, B:102:0x0283, B:105:0x028a, B:181:0x03d6, B:182:0x03e5, B:184:0x03eb, B:186:0x03fe, B:232:0x04cb, B:187:0x040c, B:189:0x041e, B:191:0x0424, B:192:0x042b, B:199:0x0457, B:218:0x047d, B:219:0x0480, B:214:0x0475, B:220:0x0481, B:222:0x0489, B:223:0x0495, B:225:0x04a8, B:226:0x04b4, B:228:0x04ba, B:229:0x04c0, B:60:0x018b, B:76:0x01c8, B:63:0x019d, B:66:0x01a7, B:69:0x01b2, B:72:0x01bc, B:42:0x0112, B:43:0x0122, B:46:0x0136, B:264:0x054d), top: B:291:0x006c, outer: #1, inners: #6, #9, #10 }] */
    /* JADX WARN: Code duplicated, block: B:88:0x0227 A[Catch: all -> 0x0566, TryCatch #3 {all -> 0x0566, blocks: (B:12:0x006c, B:13:0x007b, B:15:0x0087, B:21:0x00a0, B:22:0x00ad, B:23:0x00b1, B:25:0x00b7, B:27:0x00c3, B:34:0x00ed, B:36:0x00f6, B:37:0x00fb, B:39:0x0101, B:53:0x0151, B:55:0x0159, B:57:0x016f, B:82:0x01e0, B:83:0x020b, B:85:0x0211, B:236:0x04e0, B:237:0x04e6, B:239:0x04ec, B:241:0x04fb, B:251:0x0520, B:244:0x0505, B:113:0x02ac, B:115:0x02b2, B:117:0x02bf, B:132:0x0349, B:175:0x03a2, B:177:0x03af, B:179:0x03c6, B:180:0x03d0, B:164:0x0385, B:170:0x0390, B:171:0x0393, B:168:0x038b, B:152:0x036e, B:158:0x0379, B:156:0x0374, B:172:0x0394, B:88:0x0227, B:90:0x022f, B:106:0x028f, B:108:0x029a, B:91:0x023c, B:93:0x0253, B:94:0x025d, B:96:0x0263, B:97:0x0265, B:99:0x0278, B:101:0x027e, B:102:0x0283, B:105:0x028a, B:181:0x03d6, B:182:0x03e5, B:184:0x03eb, B:186:0x03fe, B:232:0x04cb, B:187:0x040c, B:189:0x041e, B:191:0x0424, B:192:0x042b, B:199:0x0457, B:218:0x047d, B:219:0x0480, B:214:0x0475, B:220:0x0481, B:222:0x0489, B:223:0x0495, B:225:0x04a8, B:226:0x04b4, B:228:0x04ba, B:229:0x04c0, B:60:0x018b, B:76:0x01c8, B:63:0x019d, B:66:0x01a7, B:69:0x01b2, B:72:0x01bc, B:42:0x0112, B:43:0x0122, B:46:0x0136, B:264:0x054d), top: B:291:0x006c, outer: #1, inners: #6, #9, #10 }] */
    /* JADX WARN: Code duplicated, block: B:90:0x022f A[Catch: all -> 0x0566, TryCatch #3 {all -> 0x0566, blocks: (B:12:0x006c, B:13:0x007b, B:15:0x0087, B:21:0x00a0, B:22:0x00ad, B:23:0x00b1, B:25:0x00b7, B:27:0x00c3, B:34:0x00ed, B:36:0x00f6, B:37:0x00fb, B:39:0x0101, B:53:0x0151, B:55:0x0159, B:57:0x016f, B:82:0x01e0, B:83:0x020b, B:85:0x0211, B:236:0x04e0, B:237:0x04e6, B:239:0x04ec, B:241:0x04fb, B:251:0x0520, B:244:0x0505, B:113:0x02ac, B:115:0x02b2, B:117:0x02bf, B:132:0x0349, B:175:0x03a2, B:177:0x03af, B:179:0x03c6, B:180:0x03d0, B:164:0x0385, B:170:0x0390, B:171:0x0393, B:168:0x038b, B:152:0x036e, B:158:0x0379, B:156:0x0374, B:172:0x0394, B:88:0x0227, B:90:0x022f, B:106:0x028f, B:108:0x029a, B:91:0x023c, B:93:0x0253, B:94:0x025d, B:96:0x0263, B:97:0x0265, B:99:0x0278, B:101:0x027e, B:102:0x0283, B:105:0x028a, B:181:0x03d6, B:182:0x03e5, B:184:0x03eb, B:186:0x03fe, B:232:0x04cb, B:187:0x040c, B:189:0x041e, B:191:0x0424, B:192:0x042b, B:199:0x0457, B:218:0x047d, B:219:0x0480, B:214:0x0475, B:220:0x0481, B:222:0x0489, B:223:0x0495, B:225:0x04a8, B:226:0x04b4, B:228:0x04ba, B:229:0x04c0, B:60:0x018b, B:76:0x01c8, B:63:0x019d, B:66:0x01a7, B:69:0x01b2, B:72:0x01bc, B:42:0x0112, B:43:0x0122, B:46:0x0136, B:264:0x054d), top: B:291:0x006c, outer: #1, inners: #6, #9, #10 }] */
    /* JADX WARN: Code duplicated, block: B:91:0x023c A[Catch: all -> 0x0566, TryCatch #3 {all -> 0x0566, blocks: (B:12:0x006c, B:13:0x007b, B:15:0x0087, B:21:0x00a0, B:22:0x00ad, B:23:0x00b1, B:25:0x00b7, B:27:0x00c3, B:34:0x00ed, B:36:0x00f6, B:37:0x00fb, B:39:0x0101, B:53:0x0151, B:55:0x0159, B:57:0x016f, B:82:0x01e0, B:83:0x020b, B:85:0x0211, B:236:0x04e0, B:237:0x04e6, B:239:0x04ec, B:241:0x04fb, B:251:0x0520, B:244:0x0505, B:113:0x02ac, B:115:0x02b2, B:117:0x02bf, B:132:0x0349, B:175:0x03a2, B:177:0x03af, B:179:0x03c6, B:180:0x03d0, B:164:0x0385, B:170:0x0390, B:171:0x0393, B:168:0x038b, B:152:0x036e, B:158:0x0379, B:156:0x0374, B:172:0x0394, B:88:0x0227, B:90:0x022f, B:106:0x028f, B:108:0x029a, B:91:0x023c, B:93:0x0253, B:94:0x025d, B:96:0x0263, B:97:0x0265, B:99:0x0278, B:101:0x027e, B:102:0x0283, B:105:0x028a, B:181:0x03d6, B:182:0x03e5, B:184:0x03eb, B:186:0x03fe, B:232:0x04cb, B:187:0x040c, B:189:0x041e, B:191:0x0424, B:192:0x042b, B:199:0x0457, B:218:0x047d, B:219:0x0480, B:214:0x0475, B:220:0x0481, B:222:0x0489, B:223:0x0495, B:225:0x04a8, B:226:0x04b4, B:228:0x04ba, B:229:0x04c0, B:60:0x018b, B:76:0x01c8, B:63:0x019d, B:66:0x01a7, B:69:0x01b2, B:72:0x01bc, B:42:0x0112, B:43:0x0122, B:46:0x0136, B:264:0x054d), top: B:291:0x006c, outer: #1, inners: #6, #9, #10 }] */
    /* JADX WARN: Code duplicated, block: B:93:0x0253 A[Catch: all -> 0x0566, TryCatch #3 {all -> 0x0566, blocks: (B:12:0x006c, B:13:0x007b, B:15:0x0087, B:21:0x00a0, B:22:0x00ad, B:23:0x00b1, B:25:0x00b7, B:27:0x00c3, B:34:0x00ed, B:36:0x00f6, B:37:0x00fb, B:39:0x0101, B:53:0x0151, B:55:0x0159, B:57:0x016f, B:82:0x01e0, B:83:0x020b, B:85:0x0211, B:236:0x04e0, B:237:0x04e6, B:239:0x04ec, B:241:0x04fb, B:251:0x0520, B:244:0x0505, B:113:0x02ac, B:115:0x02b2, B:117:0x02bf, B:132:0x0349, B:175:0x03a2, B:177:0x03af, B:179:0x03c6, B:180:0x03d0, B:164:0x0385, B:170:0x0390, B:171:0x0393, B:168:0x038b, B:152:0x036e, B:158:0x0379, B:156:0x0374, B:172:0x0394, B:88:0x0227, B:90:0x022f, B:106:0x028f, B:108:0x029a, B:91:0x023c, B:93:0x0253, B:94:0x025d, B:96:0x0263, B:97:0x0265, B:99:0x0278, B:101:0x027e, B:102:0x0283, B:105:0x028a, B:181:0x03d6, B:182:0x03e5, B:184:0x03eb, B:186:0x03fe, B:232:0x04cb, B:187:0x040c, B:189:0x041e, B:191:0x0424, B:192:0x042b, B:199:0x0457, B:218:0x047d, B:219:0x0480, B:214:0x0475, B:220:0x0481, B:222:0x0489, B:223:0x0495, B:225:0x04a8, B:226:0x04b4, B:228:0x04ba, B:229:0x04c0, B:60:0x018b, B:76:0x01c8, B:63:0x019d, B:66:0x01a7, B:69:0x01b2, B:72:0x01bc, B:42:0x0112, B:43:0x0122, B:46:0x0136, B:264:0x054d), top: B:291:0x006c, outer: #1, inners: #6, #9, #10 }] */
    /* JADX WARN: Code duplicated, block: B:94:0x025d A[Catch: all -> 0x0566, TryCatch #3 {all -> 0x0566, blocks: (B:12:0x006c, B:13:0x007b, B:15:0x0087, B:21:0x00a0, B:22:0x00ad, B:23:0x00b1, B:25:0x00b7, B:27:0x00c3, B:34:0x00ed, B:36:0x00f6, B:37:0x00fb, B:39:0x0101, B:53:0x0151, B:55:0x0159, B:57:0x016f, B:82:0x01e0, B:83:0x020b, B:85:0x0211, B:236:0x04e0, B:237:0x04e6, B:239:0x04ec, B:241:0x04fb, B:251:0x0520, B:244:0x0505, B:113:0x02ac, B:115:0x02b2, B:117:0x02bf, B:132:0x0349, B:175:0x03a2, B:177:0x03af, B:179:0x03c6, B:180:0x03d0, B:164:0x0385, B:170:0x0390, B:171:0x0393, B:168:0x038b, B:152:0x036e, B:158:0x0379, B:156:0x0374, B:172:0x0394, B:88:0x0227, B:90:0x022f, B:106:0x028f, B:108:0x029a, B:91:0x023c, B:93:0x0253, B:94:0x025d, B:96:0x0263, B:97:0x0265, B:99:0x0278, B:101:0x027e, B:102:0x0283, B:105:0x028a, B:181:0x03d6, B:182:0x03e5, B:184:0x03eb, B:186:0x03fe, B:232:0x04cb, B:187:0x040c, B:189:0x041e, B:191:0x0424, B:192:0x042b, B:199:0x0457, B:218:0x047d, B:219:0x0480, B:214:0x0475, B:220:0x0481, B:222:0x0489, B:223:0x0495, B:225:0x04a8, B:226:0x04b4, B:228:0x04ba, B:229:0x04c0, B:60:0x018b, B:76:0x01c8, B:63:0x019d, B:66:0x01a7, B:69:0x01b2, B:72:0x01bc, B:42:0x0112, B:43:0x0122, B:46:0x0136, B:264:0x054d), top: B:291:0x006c, outer: #1, inners: #6, #9, #10 }] */
    /* JADX WARN: Code duplicated, block: B:96:0x0263 A[Catch: all -> 0x0566, TryCatch #3 {all -> 0x0566, blocks: (B:12:0x006c, B:13:0x007b, B:15:0x0087, B:21:0x00a0, B:22:0x00ad, B:23:0x00b1, B:25:0x00b7, B:27:0x00c3, B:34:0x00ed, B:36:0x00f6, B:37:0x00fb, B:39:0x0101, B:53:0x0151, B:55:0x0159, B:57:0x016f, B:82:0x01e0, B:83:0x020b, B:85:0x0211, B:236:0x04e0, B:237:0x04e6, B:239:0x04ec, B:241:0x04fb, B:251:0x0520, B:244:0x0505, B:113:0x02ac, B:115:0x02b2, B:117:0x02bf, B:132:0x0349, B:175:0x03a2, B:177:0x03af, B:179:0x03c6, B:180:0x03d0, B:164:0x0385, B:170:0x0390, B:171:0x0393, B:168:0x038b, B:152:0x036e, B:158:0x0379, B:156:0x0374, B:172:0x0394, B:88:0x0227, B:90:0x022f, B:106:0x028f, B:108:0x029a, B:91:0x023c, B:93:0x0253, B:94:0x025d, B:96:0x0263, B:97:0x0265, B:99:0x0278, B:101:0x027e, B:102:0x0283, B:105:0x028a, B:181:0x03d6, B:182:0x03e5, B:184:0x03eb, B:186:0x03fe, B:232:0x04cb, B:187:0x040c, B:189:0x041e, B:191:0x0424, B:192:0x042b, B:199:0x0457, B:218:0x047d, B:219:0x0480, B:214:0x0475, B:220:0x0481, B:222:0x0489, B:223:0x0495, B:225:0x04a8, B:226:0x04b4, B:228:0x04ba, B:229:0x04c0, B:60:0x018b, B:76:0x01c8, B:63:0x019d, B:66:0x01a7, B:69:0x01b2, B:72:0x01bc, B:42:0x0112, B:43:0x0122, B:46:0x0136, B:264:0x054d), top: B:291:0x006c, outer: #1, inners: #6, #9, #10 }] */
    /* JADX INFO: renamed from: c */
    public final void m12770c(jal jalVar) {
        long j;
        jat jatVar;
        boolean z;
        boolean z2;
        long j2;
        List arrayList;
        String strM12805b;
        String strM12805b2;
        byte[] bytes;
        URL urlM12800D;
        URL urlM12801E;
        HttpURLConnection httpURLConnectionM12806c;
        int responseCode;
        Iterator it;
        ByteArrayOutputStream byteArrayOutputStream;
        ArrayList arrayList2;
        Iterator it2;
        int i;
        int i2;
        URL urlM12799C;
        ArrayList arrayList3;
        int iM12804H;
        Integer numValueOf;
        Throwable th;
        HttpURLConnection httpURLConnectionM12806c2;
        OutputStream outputStream;
        int length;
        Integer numValueOf2;
        int length2;
        int responseCode2;
        jao jaoVar;
        int i3;
        String strM12805b3;
        byte[] bytes2;
        int length3;
        long j3 = this.f33557e;
        izo.m11916a();
        m11946z();
        long jM12807b = m11930j().m12807b();
        long jMax = 0;
        m11932m("Dispatching local hits. Elapsed time since last dispatch (ms)", Long.valueOf(jM12807b != 0 ? Math.abs(System.currentTimeMillis() - jM12807b) : -1L));
        m12764C();
        try {
            izo.m11916a();
            m11946z();
            m11936q("Dispatching a batch of local hits");
            boolean z3 = true;
            boolean z4 = !this.f33561i.m11955D();
            boolean z5 = !this.f33559g.m12803G();
            if (z4 && z5) {
                m11936q("No network or service available. Will retry later");
            } else {
                long jMax2 = Math.max(jah.m12774e(), jah.m12773d());
                ArrayList arrayList4 = new ArrayList();
                loop0: while (true) {
                    try {
                        jaa jaaVar = this.f33555c;
                        jaaVar.m11946z();
                        jaaVar.m12759b().beginTransaction();
                        arrayList4.clear();
                        try {
                            List<jao> listM12760c = this.f33555c.m12760c(jMax2);
                            if (!listM12760c.isEmpty()) {
                                m11937r("Hits loaded from store. count", Integer.valueOf(listM12760c.size()));
                                Iterator it3 = listM12760c.iterator();
                                while (it3.hasNext()) {
                                    if (((jao) it3.next()).f33611b == jMax) {
                                        m11935p(hIAHJKEnGsNbz.guyHM, Long.valueOf(jMax), Integer.valueOf(listM12760c.size()));
                                        m12762H();
                                        try {
                                            this.f33555c.m12757G();
                                            this.f33555c.m12756F();
                                            break loop0;
                                        } catch (SQLiteException e) {
                                            m11934o("Failed to commit local dispatch transaction", e);
                                            m12762H();
                                        }
                                    }
                                }
                                if (!this.f33561i.m11955D()) {
                                    j = jMax2;
                                    if (this.f33559g.m12803G()) {
                                        jatVar = this.f33559g;
                                        izo.m11916a();
                                        jatVar.m11946z();
                                        if (jatVar.m11927g().m12779a().isEmpty()) {
                                            z = false;
                                            z2 = false;
                                        } else {
                                            z = false;
                                            z2 = false;
                                        }
                                        if (z) {
                                            j2 = jMax;
                                            arrayList = new ArrayList(listM12760c.size());
                                            for (jao jaoVar2 : listM12760c) {
                                                jib.m13205j(jaoVar2);
                                                strM12805b = jatVar.m12805b(jaoVar2, !jaoVar2.f33614e);
                                                if (strM12805b == null) {
                                                    jatVar.m11929i().m12790b(jaoVar2, "Error formatting hit for upload");
                                                } else if (strM12805b.length() > ((Integer) jam.f33591m.m11334D()).intValue()) {
                                                    urlM12801E = jatVar.m12801E(jaoVar2, strM12805b);
                                                    if (urlM12801E == null) {
                                                        jatVar.m11933n("Failed to build collect GET endpoint url");
                                                        break;
                                                    }
                                                    jatVar.m11932m(EArqVBjecl.ehFCOiR, urlM12801E);
                                                    httpURLConnectionM12806c = jatVar.m12806c(urlM12801E);
                                                    httpURLConnectionM12806c.connect();
                                                    jatVar.m12802F(httpURLConnectionM12806c);
                                                    responseCode = httpURLConnectionM12806c.getResponseCode();
                                                    if (responseCode == 200) {
                                                        jatVar.m11926f().m11920c();
                                                        responseCode = 200;
                                                    }
                                                    jatVar.m11932m("GET status", Integer.valueOf(responseCode));
                                                    if (httpURLConnectionM12806c != null) {
                                                        httpURLConnectionM12806c.disconnect();
                                                    }
                                                    if (responseCode != 200) {
                                                        break;
                                                        break;
                                                    }
                                                } else {
                                                    strM12805b2 = jatVar.m12805b(jaoVar2, false);
                                                    if (strM12805b2 == null) {
                                                        bytes = strM12805b2.getBytes();
                                                        if (bytes.length > ((Integer) jam.f33595q.m11334D()).intValue()) {
                                                            urlM12800D = jatVar.m12800D(jaoVar2);
                                                            if (urlM12800D == null) {
                                                                int i4 = jaoVar2.f33613d;
                                                                if (jatVar.m12804H(urlM12800D, bytes) == 200) {
                                                                    break;
                                                                }
                                                                break;
                                                                break;
                                                            }
                                                            jatVar.m11933n("Failed to build collect POST endpoint url");
                                                            break;
                                                        }
                                                        jatVar.m11929i().m12790b(jaoVar2, "Hit payload exceeds size limit");
                                                    } else {
                                                        jatVar.m11929i().m12790b(jaoVar2, "Error formatting hit for POST upload");
                                                    }
                                                }
                                                arrayList.add(Long.valueOf(jaoVar2.f33611b));
                                                if (arrayList.size() >= jah.m12774e()) {
                                                    break;
                                                    break;
                                                }
                                            }
                                        } else {
                                            jib.m13196a(listM12760c.isEmpty() ^ z3);
                                            jatVar.m11938s("Uploading batched hits. compression, count", Boolean.valueOf(z2), Integer.valueOf(listM12760c.size()));
                                            byteArrayOutputStream = new ByteArrayOutputStream();
                                            arrayList2 = new ArrayList();
                                            it2 = listM12760c.iterator();
                                            i = 0;
                                            i2 = 0;
                                            while (true) {
                                                if (it2.hasNext()) {
                                                    j2 = jMax;
                                                    break;
                                                }
                                                jaoVar = (jao) it2.next();
                                                jib.m13205j(jaoVar);
                                                i3 = i2 + 1;
                                                if (i3 > jah.m12773d()) {
                                                    j2 = jMax;
                                                    break;
                                                }
                                                strM12805b3 = jatVar.m12805b(jaoVar, false);
                                                if (strM12805b3 == null) {
                                                    jatVar.m11929i().m12790b(jaoVar, CswIK.FrRPHL);
                                                    j2 = jMax;
                                                } else {
                                                    bytes2 = strM12805b3.getBytes();
                                                    length3 = bytes2.length;
                                                    j2 = jMax;
                                                    if (length3 > ((Integer) jam.f33594p.m11334D()).intValue()) {
                                                        jatVar.m11929i().m12790b(jaoVar, "Hit size exceeds the maximum size limit");
                                                    } else {
                                                        if (byteArrayOutputStream.size() > 0) {
                                                            length3++;
                                                        }
                                                        if (byteArrayOutputStream.size() + length3 <= ((Integer) jam.f33596r.m11334D()).intValue()) {
                                                            break;
                                                            break;
                                                        }
                                                        if (byteArrayOutputStream.size() > 0) {
                                                            byteArrayOutputStream.write(jat.f33621a);
                                                        }
                                                        byteArrayOutputStream.write(bytes2);
                                                        i2 = i3;
                                                        m12762H();
                                                    }
                                                }
                                                arrayList2.add(Long.valueOf(jaoVar.f33611b));
                                                if (i <= 0) {
                                                    i = jaoVar.f33613d;
                                                }
                                                jMax = j2;
                                            }
                                            if (i2 == 0) {
                                                arrayList3 = arrayList2;
                                            } else {
                                                urlM12799C = jatVar.m12799C();
                                                if (urlM12799C == null) {
                                                    jatVar.m11933n("Failed to build batching endpoint url");
                                                    arrayList = Collections.emptyList();
                                                } else {
                                                    if (z2) {
                                                        byte[] byteArray = byteArrayOutputStream.toByteArray();
                                                        jib.m13205j(byteArray);
                                                        ByteArrayOutputStream byteArrayOutputStream2 = new ByteArrayOutputStream();
                                                        GZIPOutputStream gZIPOutputStream = new GZIPOutputStream(byteArrayOutputStream2);
                                                        gZIPOutputStream.write(byteArray);
                                                        gZIPOutputStream.close();
                                                        byteArrayOutputStream2.close();
                                                        byte[] byteArray2 = byteArrayOutputStream2.toByteArray();
                                                        length = byteArray2.length;
                                                        numValueOf2 = Integer.valueOf(length);
                                                        long j4 = length;
                                                        length2 = byteArray.length;
                                                        arrayList3 = arrayList2;
                                                        super.m11942w(3, "POST compressed size, ratio %, url", numValueOf2, Long.valueOf((j4 * 100) / ((long) length2)), urlM12799C);
                                                        if (length > length2) {
                                                            jatVar.m11941v("Compressed payload is larger then uncompressed. compressed, uncompressed", numValueOf2, Integer.valueOf(length2));
                                                        }
                                                        jat.m11923x();
                                                        httpURLConnectionM12806c2 = jatVar.m12806c(urlM12799C);
                                                        httpURLConnectionM12806c2.setDoOutput(true);
                                                        httpURLConnectionM12806c2.addRequestProperty("Content-Encoding", "gzip");
                                                        httpURLConnectionM12806c2.setFixedLengthStreamingMode(length);
                                                        httpURLConnectionM12806c2.connect();
                                                        outputStream = httpURLConnectionM12806c2.getOutputStream();
                                                        outputStream.write(byteArray2);
                                                        outputStream.close();
                                                        jatVar.m12802F(httpURLConnectionM12806c2);
                                                        responseCode2 = httpURLConnectionM12806c2.getResponseCode();
                                                        if (responseCode2 == 200) {
                                                            jatVar.m11926f().m11920c();
                                                            responseCode2 = 200;
                                                        }
                                                        jatVar.m11932m("POST status", Integer.valueOf(responseCode2));
                                                        if (httpURLConnectionM12806c2 != null) {
                                                            httpURLConnectionM12806c2.disconnect();
                                                        }
                                                        iM12804H = responseCode2;
                                                    } else {
                                                        arrayList3 = arrayList2;
                                                        iM12804H = jatVar.m12804H(urlM12799C, byteArrayOutputStream.toByteArray());
                                                    }
                                                    if (iM12804H == 200) {
                                                        jatVar.m11937r("Batched upload completed. Hits batched", Integer.valueOf(i2));
                                                    } else {
                                                        numValueOf = Integer.valueOf(iM12804H);
                                                        jatVar.m11937r("Network error uploading hits. status code", numValueOf);
                                                        if (jatVar.m11927g().m12779a().contains(numValueOf)) {
                                                            jatVar.m11939t("Server instructed the client to stop batching");
                                                            jatVar.f33622c.m12811b();
                                                        }
                                                        arrayList = Collections.emptyList();
                                                    }
                                                }
                                            }
                                            arrayList = arrayList3;
                                        }
                                        it = arrayList.iterator();
                                        jMax = j2;
                                        while (it.hasNext()) {
                                            jMax = Math.max(jMax, ((Long) it.next()).longValue());
                                        }
                                        this.f33555c.m12755E(arrayList);
                                        arrayList4.addAll(arrayList);
                                    }
                                    if (arrayList4.isEmpty()) {
                                        this.f33555c.m12757G();
                                        this.f33555c.m12756F();
                                        break;
                                    } else {
                                        this.f33555c.m12757G();
                                        this.f33555c.m12756F();
                                        jMax2 = j;
                                        z3 = true;
                                    }
                                    m11934o("Local dispatch failed", e);
                                    m11930j().m12808c();
                                    m12767F();
                                    if (jalVar != null) {
                                        jalVar.mo12761a();
                                    }
                                }
                                m11936q("Service connected, sending hits to the service");
                                while (true) {
                                    if (listM12760c.isEmpty()) {
                                        j = jMax2;
                                        break;
                                    }
                                    jao jaoVar3 = (jao) listM12760c.get(0);
                                    if (!this.f33561i.m11956E(jaoVar3)) {
                                        j = jMax2;
                                        break;
                                    }
                                    long j5 = jMax2;
                                    jMax = Math.max(jMax, jaoVar3.f33611b);
                                    listM12760c.remove(jaoVar3);
                                    m11932m("Hit sent do device AnalyticsService for delivery", jaoVar3);
                                    try {
                                        this.f33555c.m12754D(jaoVar3.f33611b);
                                        arrayList4.add(Long.valueOf(jaoVar3.f33611b));
                                        jMax2 = j5;
                                    } catch (SQLiteException e2) {
                                        m11934o("Failed to remove hit that was send for delivery", e2);
                                        m12762H();
                                        try {
                                            this.f33555c.m12757G();
                                            this.f33555c.m12756F();
                                        } catch (SQLiteException e3) {
                                            m11934o("Failed to commit local dispatch transaction", e3);
                                            m12762H();
                                        }
                                        m11930j().m12808c();
                                        m12767F();
                                        if (jalVar != null) {
                                            jalVar.mo12761a();
                                        }
                                        if (this.f33557e != j3) {
                                            Context contextM12794a = this.f33560h.m12794a();
                                            Intent intent = new Intent("com.google.analytics.RADIO_POWERED");
                                            intent.addCategory(contextM12794a.getPackageName());
                                            intent.putExtra(jas.f33617a, true);
                                            contextM12794a.sendOrderedBroadcast(intent, null);
                                        }
                                    }
                                }
                                if (this.f33559g.m12803G()) {
                                    jatVar = this.f33559g;
                                    izo.m11916a();
                                    jatVar.m11946z();
                                    if (jatVar.m11927g().m12779a().isEmpty() || !jatVar.f33622c.m12812c(((long) ((Integer) jam.f33598t.m11334D()).intValue()) * 1000)) {
                                        z = false;
                                        z2 = false;
                                    } else {
                                        String str = (String) jam.f33592n.m11334D();
                                        z = "BATCH_BY_SESSION".equalsIgnoreCase(str) || "BATCH_BY_TIME".equalsIgnoreCase(str) || hsSUWRJfoeC.HxEde.equalsIgnoreCase(str) || "BATCH_BY_COUNT".equalsIgnoreCase(str) || HRLmc.ewgrcczqKGpkp.equalsIgnoreCase(str);
                                        z2 = z3 == "GZIP".equalsIgnoreCase((String) jam.f33593o.m11334D());
                                    }
                                    if (z) {
                                        j2 = jMax;
                                        arrayList = new ArrayList(listM12760c.size());
                                        while (r0.hasNext()) {
                                            jib.m13205j(jaoVar2);
                                            strM12805b = jatVar.m12805b(jaoVar2, !jaoVar2.f33614e);
                                            if (strM12805b == null) {
                                                jatVar.m11929i().m12790b(jaoVar2, "Error formatting hit for upload");
                                            } else if (strM12805b.length() > ((Integer) jam.f33591m.m11334D()).intValue()) {
                                                strM12805b2 = jatVar.m12805b(jaoVar2, false);
                                                if (strM12805b2 == null) {
                                                    bytes = strM12805b2.getBytes();
                                                    if (bytes.length > ((Integer) jam.f33595q.m11334D()).intValue()) {
                                                        urlM12800D = jatVar.m12800D(jaoVar2);
                                                        if (urlM12800D == null) {
                                                            int i5 = jaoVar2.f33613d;
                                                            if (jatVar.m12804H(urlM12800D, bytes) == 200) {
                                                                break;
                                                            } else {
                                                                break;
                                                            }
                                                        }
                                                        jatVar.m11933n("Failed to build collect POST endpoint url");
                                                        break;
                                                    }
                                                    jatVar.m11929i().m12790b(jaoVar2, "Hit payload exceeds size limit");
                                                } else {
                                                    jatVar.m11929i().m12790b(jaoVar2, "Error formatting hit for POST upload");
                                                }
                                            } else {
                                                urlM12801E = jatVar.m12801E(jaoVar2, strM12805b);
                                                if (urlM12801E == null) {
                                                    jatVar.m11933n("Failed to build collect GET endpoint url");
                                                    break;
                                                }
                                                jatVar.m11932m(EArqVBjecl.ehFCOiR, urlM12801E);
                                                try {
                                                    httpURLConnectionM12806c = jatVar.m12806c(urlM12801E);
                                                    try {
                                                        httpURLConnectionM12806c.connect();
                                                        jatVar.m12802F(httpURLConnectionM12806c);
                                                        responseCode = httpURLConnectionM12806c.getResponseCode();
                                                        if (responseCode == 200) {
                                                            jatVar.m11926f().m11920c();
                                                            responseCode = 200;
                                                        }
                                                        jatVar.m11932m("GET status", Integer.valueOf(responseCode));
                                                        if (httpURLConnectionM12806c != null) {
                                                            httpURLConnectionM12806c.disconnect();
                                                        }
                                                        if (responseCode != 200) {
                                                            break;
                                                        }
                                                    } catch (IOException e4) {
                                                        e = e4;
                                                        try {
                                                            jatVar.m11940u("Network GET connection error", e);
                                                            if (httpURLConnectionM12806c != null) {
                                                                httpURLConnectionM12806c.disconnect();
                                                            }
                                                        } catch (Throwable th2) {
                                                            th = th2;
                                                            if (httpURLConnectionM12806c != null) {
                                                                httpURLConnectionM12806c.disconnect();
                                                            }
                                                            throw th;
                                                        }
                                                    } catch (Throwable th3) {
                                                        th = th3;
                                                        if (httpURLConnectionM12806c != null) {
                                                            httpURLConnectionM12806c.disconnect();
                                                        }
                                                        throw th;
                                                    }
                                                } catch (IOException e5) {
                                                    e = e5;
                                                    httpURLConnectionM12806c = null;
                                                } catch (Throwable th4) {
                                                    th = th4;
                                                    httpURLConnectionM12806c = null;
                                                }
                                            }
                                            arrayList.add(Long.valueOf(jaoVar2.f33611b));
                                            if (arrayList.size() >= jah.m12774e()) {
                                                break;
                                            }
                                        }
                                    } else {
                                        jib.m13196a(listM12760c.isEmpty() ^ z3);
                                        jatVar.m11938s("Uploading batched hits. compression, count", Boolean.valueOf(z2), Integer.valueOf(listM12760c.size()));
                                        byteArrayOutputStream = new ByteArrayOutputStream();
                                        arrayList2 = new ArrayList();
                                        it2 = listM12760c.iterator();
                                        i = 0;
                                        i2 = 0;
                                        while (true) {
                                            if (it2.hasNext()) {
                                                j2 = jMax;
                                                break;
                                            }
                                            jaoVar = (jao) it2.next();
                                            jib.m13205j(jaoVar);
                                            i3 = i2 + 1;
                                            if (i3 > jah.m12773d()) {
                                                j2 = jMax;
                                                break;
                                            }
                                            strM12805b3 = jatVar.m12805b(jaoVar, false);
                                            if (strM12805b3 == null) {
                                                jatVar.m11929i().m12790b(jaoVar, CswIK.FrRPHL);
                                                j2 = jMax;
                                            } else {
                                                bytes2 = strM12805b3.getBytes();
                                                length3 = bytes2.length;
                                                j2 = jMax;
                                                if (length3 > ((Integer) jam.f33594p.m11334D()).intValue()) {
                                                    jatVar.m11929i().m12790b(jaoVar, "Hit size exceeds the maximum size limit");
                                                } else {
                                                    if (byteArrayOutputStream.size() > 0) {
                                                        length3++;
                                                    }
                                                    if (byteArrayOutputStream.size() + length3 <= ((Integer) jam.f33596r.m11334D()).intValue()) {
                                                        break;
                                                    }
                                                    try {
                                                        if (byteArrayOutputStream.size() > 0) {
                                                            byteArrayOutputStream.write(jat.f33621a);
                                                        }
                                                        byteArrayOutputStream.write(bytes2);
                                                        i2 = i3;
                                                    } catch (IOException e6) {
                                                        jatVar.m11934o("Failed to write payload when batching hits", e6);
                                                    }
                                                    m12762H();
                                                }
                                            }
                                            arrayList2.add(Long.valueOf(jaoVar.f33611b));
                                            if (i <= 0) {
                                                i = jaoVar.f33613d;
                                            }
                                            jMax = j2;
                                        }
                                        if (i2 == 0) {
                                            arrayList3 = arrayList2;
                                        } else {
                                            urlM12799C = jatVar.m12799C();
                                            if (urlM12799C == null) {
                                                jatVar.m11933n("Failed to build batching endpoint url");
                                                arrayList = Collections.emptyList();
                                            } else {
                                                if (z2) {
                                                    byte[] byteArray3 = byteArrayOutputStream.toByteArray();
                                                    jib.m13205j(byteArray3);
                                                    try {
                                                        try {
                                                            ByteArrayOutputStream byteArrayOutputStream3 = new ByteArrayOutputStream();
                                                            GZIPOutputStream gZIPOutputStream2 = new GZIPOutputStream(byteArrayOutputStream3);
                                                            gZIPOutputStream2.write(byteArray3);
                                                            gZIPOutputStream2.close();
                                                            byteArrayOutputStream3.close();
                                                            byte[] byteArray4 = byteArrayOutputStream3.toByteArray();
                                                            length = byteArray4.length;
                                                            numValueOf2 = Integer.valueOf(length);
                                                            long j6 = length;
                                                            length2 = byteArray3.length;
                                                            arrayList3 = arrayList2;
                                                            try {
                                                                super.m11942w(3, "POST compressed size, ratio %, url", numValueOf2, Long.valueOf((j6 * 100) / ((long) length2)), urlM12799C);
                                                                if (length > length2) {
                                                                    jatVar.m11941v("Compressed payload is larger then uncompressed. compressed, uncompressed", numValueOf2, Integer.valueOf(length2));
                                                                }
                                                                jat.m11923x();
                                                                httpURLConnectionM12806c2 = jatVar.m12806c(urlM12799C);
                                                                try {
                                                                    httpURLConnectionM12806c2.setDoOutput(true);
                                                                    httpURLConnectionM12806c2.addRequestProperty("Content-Encoding", "gzip");
                                                                    httpURLConnectionM12806c2.setFixedLengthStreamingMode(length);
                                                                    httpURLConnectionM12806c2.connect();
                                                                    outputStream = httpURLConnectionM12806c2.getOutputStream();
                                                                    try {
                                                                        outputStream.write(byteArray4);
                                                                        outputStream.close();
                                                                        jatVar.m12802F(httpURLConnectionM12806c2);
                                                                        responseCode2 = httpURLConnectionM12806c2.getResponseCode();
                                                                        if (responseCode2 == 200) {
                                                                            jatVar.m11926f().m11920c();
                                                                            responseCode2 = 200;
                                                                        }
                                                                        jatVar.m11932m("POST status", Integer.valueOf(responseCode2));
                                                                        if (httpURLConnectionM12806c2 != null) {
                                                                            httpURLConnectionM12806c2.disconnect();
                                                                        }
                                                                        iM12804H = responseCode2;
                                                                    } catch (IOException e7) {
                                                                        e = e7;
                                                                        try {
                                                                            jatVar.m11940u("Network compressed POST connection error", e);
                                                                            if (outputStream != null) {
                                                                                try {
                                                                                    outputStream.close();
                                                                                } catch (IOException e8) {
                                                                                    jatVar.m11934o("Error closing http compressed post connection output stream", e8);
                                                                                }
                                                                            }
                                                                            if (httpURLConnectionM12806c2 != null) {
                                                                                httpURLConnectionM12806c2.disconnect();
                                                                                iM12804H = 0;
                                                                            } else {
                                                                                iM12804H = 0;
                                                                            }
                                                                        } catch (Throwable th5) {
                                                                            httpURLConnectionM12806c2 = httpURLConnectionM12806c2;
                                                                            th = th5;
                                                                            if (outputStream != null) {
                                                                                try {
                                                                                    outputStream.close();
                                                                                } catch (IOException e9) {
                                                                                    jatVar.m11934o("Error closing http compressed post connection output stream", e9);
                                                                                }
                                                                            }
                                                                            if (httpURLConnectionM12806c2 != null) {
                                                                                throw th;
                                                                            }
                                                                            httpURLConnectionM12806c2.disconnect();
                                                                            throw th;
                                                                        }
                                                                    } catch (Throwable th6) {
                                                                        th = th6;
                                                                        th = th;
                                                                        if (outputStream != null) {
                                                                            outputStream.close();
                                                                        }
                                                                        if (httpURLConnectionM12806c2 != null) {
                                                                            throw th;
                                                                        }
                                                                        httpURLConnectionM12806c2.disconnect();
                                                                        throw th;
                                                                    }
                                                                } catch (IOException e10) {
                                                                    e = e10;
                                                                    outputStream = null;
                                                                } catch (Throwable th7) {
                                                                    th = th7;
                                                                    outputStream = null;
                                                                }
                                                            } catch (IOException e11) {
                                                                e = e11;
                                                                httpURLConnectionM12806c2 = null;
                                                                outputStream = null;
                                                                jatVar.m11940u("Network compressed POST connection error", e);
                                                                if (outputStream != null) {
                                                                    outputStream.close();
                                                                }
                                                                if (httpURLConnectionM12806c2 != null) {
                                                                    httpURLConnectionM12806c2.disconnect();
                                                                    iM12804H = 0;
                                                                } else {
                                                                    iM12804H = 0;
                                                                }
                                                                if (iM12804H == 200) {
                                                                    jatVar.m11937r("Batched upload completed. Hits batched", Integer.valueOf(i2));
                                                                    arrayList = arrayList3;
                                                                } else {
                                                                    numValueOf = Integer.valueOf(iM12804H);
                                                                    jatVar.m11937r("Network error uploading hits. status code", numValueOf);
                                                                    if (jatVar.m11927g().m12779a().contains(numValueOf)) {
                                                                        jatVar.m11939t("Server instructed the client to stop batching");
                                                                        jatVar.f33622c.m12811b();
                                                                    }
                                                                    arrayList = Collections.emptyList();
                                                                }
                                                                it = arrayList.iterator();
                                                                jMax = j2;
                                                                while (it.hasNext()) {
                                                                    jMax = Math.max(jMax, ((Long) it.next()).longValue());
                                                                }
                                                                this.f33555c.m12755E(arrayList);
                                                                arrayList4.addAll(arrayList);
                                                                if (arrayList4.isEmpty()) {
                                                                    try {
                                                                        this.f33555c.m12757G();
                                                                        this.f33555c.m12756F();
                                                                        break;
                                                                    } catch (SQLiteException e12) {
                                                                        m11934o("Failed to commit local dispatch transaction", e12);
                                                                        m12762H();
                                                                    }
                                                                    m11930j().m12808c();
                                                                    m12767F();
                                                                    if (jalVar != null) {
                                                                        jalVar.mo12761a();
                                                                    }
                                                                    if (this.f33557e != j3) {
                                                                        Context contextM12794a2 = this.f33560h.m12794a();
                                                                        Intent intent2 = new Intent("com.google.analytics.RADIO_POWERED");
                                                                        intent2.addCategory(contextM12794a2.getPackageName());
                                                                        intent2.putExtra(jas.f33617a, true);
                                                                        contextM12794a2.sendOrderedBroadcast(intent2, null);
                                                                    }
                                                                }
                                                                try {
                                                                    this.f33555c.m12757G();
                                                                    this.f33555c.m12756F();
                                                                    jMax2 = j;
                                                                    z3 = true;
                                                                } catch (SQLiteException e13) {
                                                                    m11934o("Failed to commit local dispatch transaction", e13);
                                                                }
                                                                m11934o("Local dispatch failed", e);
                                                                m11930j().m12808c();
                                                                m12767F();
                                                                if (jalVar != null) {
                                                                    jalVar.mo12761a();
                                                                }
                                                            }
                                                        } catch (IOException e14) {
                                                            e = e14;
                                                            arrayList3 = arrayList2;
                                                        }
                                                    } catch (Throwable th8) {
                                                        th = th8;
                                                        httpURLConnectionM12806c2 = null;
                                                        outputStream = null;
                                                    }
                                                } else {
                                                    arrayList3 = arrayList2;
                                                    iM12804H = jatVar.m12804H(urlM12799C, byteArrayOutputStream.toByteArray());
                                                }
                                                if (iM12804H == 200) {
                                                    jatVar.m11937r("Batched upload completed. Hits batched", Integer.valueOf(i2));
                                                } else {
                                                    numValueOf = Integer.valueOf(iM12804H);
                                                    jatVar.m11937r("Network error uploading hits. status code", numValueOf);
                                                    if (jatVar.m11927g().m12779a().contains(numValueOf)) {
                                                        jatVar.m11939t("Server instructed the client to stop batching");
                                                        jatVar.f33622c.m12811b();
                                                    }
                                                    arrayList = Collections.emptyList();
                                                }
                                            }
                                        }
                                        arrayList = arrayList3;
                                    }
                                    it = arrayList.iterator();
                                    jMax = j2;
                                    while (it.hasNext()) {
                                        jMax = Math.max(jMax, ((Long) it.next()).longValue());
                                    }
                                    try {
                                        this.f33555c.m12755E(arrayList);
                                        arrayList4.addAll(arrayList);
                                    } catch (SQLiteException e15) {
                                        m11934o("Failed to remove successfully uploaded hits", e15);
                                        m12762H();
                                        try {
                                            this.f33555c.m12757G();
                                            this.f33555c.m12756F();
                                        } catch (SQLiteException e16) {
                                            m11934o("Failed to commit local dispatch transaction", e16);
                                            m12762H();
                                        }
                                    }
                                }
                                if (arrayList4.isEmpty()) {
                                    this.f33555c.m12757G();
                                    this.f33555c.m12756F();
                                    break;
                                } else {
                                    this.f33555c.m12757G();
                                    this.f33555c.m12756F();
                                    jMax2 = j;
                                    z3 = true;
                                }
                                m11934o("Local dispatch failed", e);
                                m11930j().m12808c();
                                m12767F();
                                if (jalVar != null) {
                                    jalVar.mo12761a();
                                }
                            }
                            m11936q("Store is empty, nothing to dispatch");
                            m12762H();
                            try {
                                this.f33555c.m12757G();
                                this.f33555c.m12756F();
                                break;
                            } catch (SQLiteException e17) {
                                m11934o("Failed to commit local dispatch transaction", e17);
                                m12762H();
                            }
                        } catch (SQLiteException e18) {
                            m11940u("Failed to read hits from persisted store", e18);
                            m12762H();
                            try {
                                this.f33555c.m12757G();
                                this.f33555c.m12756F();
                            } catch (SQLiteException e19) {
                                m11934o("Failed to commit local dispatch transaction", e19);
                                m12762H();
                            }
                        }
                    } catch (Throwable th9) {
                        try {
                            this.f33555c.m12757G();
                            this.f33555c.m12756F();
                            throw th9;
                        } catch (SQLiteException e20) {
                            m11934o("Failed to commit local dispatch transaction", e20);
                        }
                    }
                }
            }
            m11930j().m12808c();
            m12767F();
            if (jalVar != null) {
                jalVar.mo12761a();
            }
            if (this.f33557e != j3) {
                Context contextM12794a3 = this.f33560h.m12794a();
                Intent intent3 = new Intent("com.google.analytics.RADIO_POWERED");
                intent3.addCategory(contextM12794a3.getPackageName());
                intent3.putExtra(jas.f33617a, true);
                contextM12794a3.sendOrderedBroadcast(intent3, null);
            }
        } catch (Exception e21) {
            m11934o("Local dispatch failed", e21);
            m11930j().m12808c();
            m12767F();
            if (jalVar != null) {
                jalVar.mo12761a();
            }
        }
    }
}
