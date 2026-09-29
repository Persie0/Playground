package com.clevertap.android.sdk.pushnotification;

import android.app.AlarmManager;
import android.app.Notification;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.app.job.JobInfo;
import android.app.job.JobParameters;
import android.app.job.JobScheduler;
import android.content.ComponentName;
import android.content.ContentValues;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ServiceInfo;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.graphics.Bitmap;
import android.graphics.Color;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.SystemClock;
import android.text.TextUtils;
import androidx.activity.result.C0204c;
import androidx.core.graphics.drawable.IconCompat;
import androidx.fragment.app.C0987y;
import com.clevertap.android.sdk.AnalyticsManager;
import com.clevertap.android.sdk.C2181a;
import com.clevertap.android.sdk.CleverTapInstanceConfig;
import com.clevertap.android.sdk.p049db.AbstractC2184a;
import com.clevertap.android.sdk.p049db.C2185b;
import com.clevertap.android.sdk.p049db.DBAdapter;
import com.clevertap.android.sdk.pushnotification.amp.CTBackgroundJobService;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.Iterator;
import java.util.Locale;
import java.util.concurrent.Callable;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p043c7.C1735a;
import p088e7.C5382b;
import p088e7.C5383c;
import p232l2.AbstractC7237p;
import p232l2.C7233l;
import p232l2.C7234m;
import p232l2.C7235n;
import p232l2.C7236o;
import p254m2.C7472a;
import p290o6.C7967l0;
import p290o6.C7977q0;
import p290o6.C7979r0;
import p430v6.InterfaceC9656b;
import p526z6.C10445a;
import p526z6.CallableC10449e;
import p526z6.CallableC10450f;
import p526z6.InterfaceC10446b;

/* JADX INFO: renamed from: com.clevertap.android.sdk.pushnotification.f */
/* JADX INFO: loaded from: classes.dex */
public final class C2260f implements InterfaceC2256b {

    /* JADX INFO: renamed from: e */
    public final AnalyticsManager f11342e;

    /* JADX INFO: renamed from: f */
    public final AbstractC2184a f11343f;

    /* JADX INFO: renamed from: g */
    public final CleverTapInstanceConfig f11344g;

    /* JADX INFO: renamed from: h */
    public final Context f11345h;

    /* JADX INFO: renamed from: j */
    public final C5383c f11347j;

    /* JADX INFO: renamed from: a */
    public final ArrayList<PushConstants.PushType> f11338a = new ArrayList<>();

    /* JADX INFO: renamed from: b */
    public final ArrayList<PushConstants.PushType> f11339b = new ArrayList<>();

    /* JADX INFO: renamed from: c */
    public final ArrayList<InterfaceC2254a> f11340c = new ArrayList<>();

    /* JADX INFO: renamed from: d */
    public final ArrayList<PushConstants.PushType> f11341d = new ArrayList<>();

    /* JADX INFO: renamed from: i */
    public InterfaceC10446b f11346i = new C10445a();

    /* JADX INFO: renamed from: k */
    public final Object f11348k = new Object();

    /* JADX INFO: renamed from: l */
    public final Object f11349l = new Object();

    /* JADX INFO: renamed from: com.clevertap.android.sdk.pushnotification.f$a */
    public class a implements Callable<Void> {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ Context f11350a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ JobParameters f11351b;

        public a(Context context, JobParameters jobParameters) {
            this.f11350a = context;
            this.f11351b = jobParameters;
        }

        /* JADX WARN: Code duplicated, block: B:31:0x00e4  */
        /* JADX WARN: Code duplicated, block: B:42:0x0117 A[Catch: all -> 0x01d7, PHI: r6 r7
          0x0117: PHI (r6v3 android.database.Cursor) = (r6v2 android.database.Cursor), (r6v15 android.database.Cursor) binds: [B:41:0x0115, B:33:0x00eb] A[DONT_GENERATE, DONT_INLINE]
          0x0117: PHI (r7v2 long) = (r7v1 long), (r7v16 long) binds: [B:41:0x0115, B:33:0x00eb] A[DONT_GENERATE, DONT_INLINE], TRY_LEAVE, TryCatch #1 {, blocks: (B:21:0x00b1, B:32:0x00e6, B:42:0x0117, B:40:0x010e, B:67:0x01cc, B:69:0x01d3, B:70:0x01d6), top: B:76:0x00b1 }] */
        /* JADX WARN: Code duplicated, block: B:69:0x01d3 A[Catch: all -> 0x01d7, TryCatch #1 {, blocks: (B:21:0x00b1, B:32:0x00e6, B:42:0x0117, B:40:0x010e, B:67:0x01cc, B:69:0x01d3, B:70:0x01d6), top: B:76:0x00b1 }] */
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r2v1 */
        /* JADX WARN: Type inference failed for: r2v2, types: [android.database.Cursor] */
        /* JADX WARN: Type inference failed for: r2v3 */
        @Override // java.util.concurrent.Callable
        public final Void call() throws Exception {
            Cursor cursorQuery;
            long j10;
            ?? r10 = 0;
            if (C2260f.this.m6579i()) {
                Calendar calendar = Calendar.getInstance();
                int i10 = calendar.get(11);
                int i11 = calendar.get(12);
                Date dateM6573d = C2260f.m6573d(C2260f.this, i10 + ":" + i11);
                Date dateM6573d2 = C2260f.m6573d(C2260f.this, "22:00");
                Date dateM6573d3 = C2260f.m6573d(C2260f.this, "06:00");
                C2260f.this.getClass();
                Calendar calendar2 = Calendar.getInstance();
                calendar2.setTime(dateM6573d2);
                Calendar calendar3 = Calendar.getInstance();
                calendar3.setTime(dateM6573d);
                Calendar calendar4 = Calendar.getInstance();
                calendar4.setTime(dateM6573d3);
                if (dateM6573d3.compareTo(dateM6573d2) < 0) {
                    if (calendar3.compareTo(calendar4) < 0) {
                        calendar3.add(5, 1);
                    }
                    calendar4.add(5, 1);
                }
                if (calendar3.compareTo(calendar2) >= 0 && calendar3.compareTo(calendar4) < 0) {
                    C2181a.m6456i(C2260f.this.f11344g.f10995a, "Job Service won't run in default DND hours");
                } else {
                    DBAdapter dBAdapterMo6479b = C2260f.this.f11343f.mo6479b(this.f11350a);
                    synchronized (dBAdapterMo6479b) {
                        String name = DBAdapter.Table.UNINSTALL_TS.getName();
                        try {
                            try {
                                cursorQuery = dBAdapterMo6479b.f11040b.getReadableDatabase().query(name, null, null, null, null, null, "created_at DESC", "1");
                                if (cursorQuery != null) {
                                    try {
                                        if (cursorQuery.moveToFirst()) {
                                            j10 = cursorQuery.getLong(cursorQuery.getColumnIndex("created_at"));
                                        } else {
                                            j10 = 0;
                                        }
                                    } catch (SQLiteException e10) {
                                        e = e10;
                                        dBAdapterMo6479b.m6470g().getClass();
                                        C2181a.m6459l("Could not fetch records out of database " + name + ".", e);
                                        dBAdapterMo6479b.f11040b.close();
                                        j10 = 0;
                                        if (cursorQuery != null) {
                                            cursorQuery.close();
                                        }
                                    }
                                } else {
                                    j10 = 0;
                                }
                                dBAdapterMo6479b.f11040b.close();
                                if (cursorQuery != null) {
                                    cursorQuery.close();
                                }
                            } catch (Throwable th2) {
                                th = th2;
                                r10 = calendar3;
                                dBAdapterMo6479b.f11040b.close();
                                if (r10 != 0) {
                                    r10.close();
                                }
                                throw th;
                            }
                        } catch (SQLiteException e11) {
                            e = e11;
                            cursorQuery = null;
                        } catch (Throwable th3) {
                            th = th3;
                            dBAdapterMo6479b.f11040b.close();
                            if (r10 != 0) {
                                r10.close();
                            }
                            throw th;
                        }
                    }
                    if (j10 == 0 || j10 > System.currentTimeMillis() - 86400000) {
                        try {
                            JSONObject jSONObject = new JSONObject();
                            jSONObject.put("bk", 1);
                            AnalyticsManager analyticsManager = C2260f.this.f11342e;
                            analyticsManager.f10947c.mo595e0(analyticsManager.f10950f, jSONObject, 2);
                            int i12 = Build.VERSION.SDK_INT >= 31 ? 167772160 : 134217728;
                            if (this.f11351b == null) {
                                C2260f c2260f = C2260f.this;
                                Context context = this.f11350a;
                                c2260f.getClass();
                                int iM15824b = C7977q0.m15824b(context, 240, "pf");
                                AlarmManager alarmManager = (AlarmManager) this.f11350a.getSystemService("alarm");
                                Intent intent = new Intent("com.clevertap.BG_EVENT");
                                intent.setPackage(this.f11350a.getPackageName());
                                PendingIntent service = PendingIntent.getService(this.f11350a, C2260f.this.f11344g.f10995a.hashCode(), intent, i12);
                                if (alarmManager != null) {
                                    alarmManager.cancel(service);
                                }
                                Intent intent2 = new Intent("com.clevertap.BG_EVENT");
                                intent2.setPackage(this.f11350a.getPackageName());
                                PendingIntent service2 = PendingIntent.getService(this.f11350a, C2260f.this.f11344g.f10995a.hashCode(), intent2, i12);
                                if (alarmManager != null && iM15824b != -1) {
                                    long j11 = 60000 * ((long) iM15824b);
                                    alarmManager.setInexactRepeating(2, SystemClock.elapsedRealtime() + j11, j11, service2);
                                }
                            }
                        } catch (JSONException unused) {
                            C2181a.m6455h("Unable to raise background Ping event");
                        }
                    }
                }
            } else {
                C2181a.m6456i(C2260f.this.f11344g.f10995a, "Token is not present, not running the Job");
            }
            return null;
        }
    }

    /* JADX INFO: renamed from: com.clevertap.android.sdk.pushnotification.f$b */
    public static /* synthetic */ class b {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f11353a;

        static {
            int[] iArr = new int[PushConstants.PushType.values().length];
            f11353a = iArr;
            try {
                iArr[PushConstants.PushType.FCM.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f11353a[PushConstants.PushType.XPS.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f11353a[PushConstants.PushType.HPS.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f11353a[PushConstants.PushType.BPS.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f11353a[PushConstants.PushType.ADM.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
        }
    }

    public C2260f(Context context, CleverTapInstanceConfig cleverTapInstanceConfig, C2185b c2185b, C5383c c5383c, AnalyticsManager analyticsManager) {
        this.f11345h = context;
        this.f11344g = cleverTapInstanceConfig;
        this.f11343f = c2185b;
        this.f11347j = c5383c;
        this.f11342e = analyticsManager;
        if (!cleverTapInstanceConfig.f11000f || cleverTapInstanceConfig.f10999e) {
            return;
        }
        C1735a.m5472a(cleverTapInstanceConfig).m5474b().m6585b("createOrResetJobScheduler", new CallableC10450f(this));
    }

    /* JADX INFO: renamed from: c */
    public static void m6572c(Context context, C2260f c2260f) {
        JobInfo next;
        c2260f.getClass();
        int iM15824b = C7977q0.m15824b(context, -1, "pfjobid");
        JobScheduler jobScheduler = (JobScheduler) context.getSystemService("jobscheduler");
        if (jobScheduler == null) {
            return;
        }
        int iM15824b2 = C7977q0.m15824b(context, 240, "pf");
        if (iM15824b >= 0 || iM15824b2 >= 0) {
            if (iM15824b2 < 0) {
                jobScheduler.cancel(iM15824b);
                C7977q0.m15831i(context, -1, "pfjobid");
                return;
            }
            ComponentName componentName = new ComponentName(context, (Class<?>) CTBackgroundJobService.class);
            boolean z10 = false;
            boolean z11 = iM15824b < 0 && iM15824b2 > 0;
            Iterator<JobInfo> it = jobScheduler.getAllPendingJobs().iterator();
            do {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
            } while (next.getId() != iM15824b);
            if (next != null && next.getIntervalMillis() != ((long) iM15824b2) * 60000) {
                jobScheduler.cancel(iM15824b);
                C7977q0.m15831i(context, -1, "pfjobid");
                z11 = true;
            }
            if (z11) {
                CleverTapInstanceConfig cleverTapInstanceConfig = c2260f.f11344g;
                int iHashCode = cleverTapInstanceConfig.f10995a.hashCode();
                JobInfo.Builder builder = new JobInfo.Builder(iHashCode, componentName);
                builder.setRequiredNetworkType(1);
                builder.setRequiresCharging(false);
                builder.setPeriodic(((long) iM15824b2) * 60000, 300000L);
                builder.setRequiresBatteryNotLow(true);
                boolean z12 = C7979r0.f43406a;
                try {
                    if (C7472a.m14841a(context, "android.permission.RECEIVE_BOOT_COMPLETED") == 0) {
                        z10 = true;
                    }
                } catch (Throwable unused) {
                }
                if (z10) {
                    builder.setPersisted(true);
                }
                int iSchedule = jobScheduler.schedule(builder.build());
                String str = cleverTapInstanceConfig.f10995a;
                if (iSchedule != 1) {
                    C2181a.m6450b(str, "Job not scheduled - " + iHashCode);
                } else {
                    C2181a.m6450b(str, "Job scheduled - " + iHashCode);
                    C7977q0.m15831i(context, iHashCode, "pfjobid");
                }
            }
        }
    }

    /* JADX INFO: renamed from: d */
    public static Date m6573d(C2260f c2260f, String str) {
        c2260f.getClass();
        try {
            return new SimpleDateFormat("HH:mm", Locale.US).parse(str);
        } catch (ParseException unused) {
            return new Date(0L);
        }
    }

    @Override // com.clevertap.android.sdk.pushnotification.InterfaceC2256b
    /* JADX INFO: renamed from: a */
    public final void mo6568a(String str, PushConstants.PushType pushType) {
        if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(str)) {
            if (pushType == null) {
                return;
            }
            int i10 = b.f11353a[pushType.ordinal()];
            if (i10 != 1) {
                if (i10 == 2) {
                    m6578h(PushConstants.PushType.XPS, str);
                    return;
                }
                if (i10 == 3) {
                    m6578h(PushConstants.PushType.HPS, str);
                    return;
                } else if (i10 == 4) {
                    m6578h(PushConstants.PushType.BPS, str);
                    return;
                } else {
                    if (i10 != 5) {
                        return;
                    }
                    m6578h(PushConstants.PushType.ADM, str);
                    return;
                }
            }
            m6578h(PushConstants.PushType.FCM, str);
        }
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    /* JADX INFO: renamed from: b */
    public final void m6574b(Context context, Bundle bundle, int i10) {
        boolean zEquals;
        if (bundle != null && bundle.get("wzrk_pn") != null) {
            CleverTapInstanceConfig cleverTapInstanceConfig = this.f11344g;
            if (cleverTapInstanceConfig.f10999e) {
                C2181a c2181aM6433b = cleverTapInstanceConfig.m6433b();
                String str = cleverTapInstanceConfig.f10995a;
                c2181aM6433b.getClass();
                C2181a.m6452d(str, "Instance is set for Analytics only, cannot create notification");
                return;
            }
            try {
                if (bundle.getString("wzrk_pn_s", "").equalsIgnoreCase("true")) {
                    this.f11342e.m6417z0(bundle);
                    return;
                }
                String string = bundle.getString("extras_from");
                if (string == null || !string.equals("PTReceiver")) {
                    C2181a c2181aM6433b2 = cleverTapInstanceConfig.m6433b();
                    c2181aM6433b2.getClass();
                    C2181a.m6452d(cleverTapInstanceConfig.f10995a, "Handling notification: " + bundle);
                    C2181a c2181aM6433b3 = cleverTapInstanceConfig.m6433b();
                    String str2 = cleverTapInstanceConfig.f10995a;
                    String str3 = "Handling notification::nh_source = " + bundle.getString("nh_source", "source not available");
                    c2181aM6433b3.getClass();
                    C2181a.m6452d(str2, str3);
                    String string2 = bundle.getString("wzrk_pid");
                    AbstractC2184a abstractC2184a = this.f11343f;
                    if (string2 != null) {
                        DBAdapter dBAdapterMo6479b = abstractC2184a.mo6479b(context);
                        String string3 = bundle.getString("wzrk_pid");
                        synchronized (dBAdapterMo6479b) {
                            try {
                                zEquals = string3.equals(dBAdapterMo6479b.m6468e(string3));
                            } catch (Throwable th2) {
                                throw th2;
                            }
                        }
                        if (zEquals) {
                            C2181a c2181aM6433b4 = cleverTapInstanceConfig.m6433b();
                            String str4 = cleverTapInstanceConfig.f10995a;
                            c2181aM6433b4.getClass();
                            C2181a.m6452d(str4, "Push Notification already rendered, not showing again");
                            return;
                        }
                    }
                    C10445a c10445a = (C10445a) this.f11346i;
                    c10445a.getClass();
                    String string4 = bundle.getString("nm");
                    c10445a.f52292a = string4;
                    if (string4 == null) {
                        string4 = "";
                    }
                    if (string4.isEmpty()) {
                        C2181a c2181aM6433b5 = cleverTapInstanceConfig.m6433b();
                        String str5 = cleverTapInstanceConfig.f10995a;
                        c2181aM6433b5.getClass();
                        C2181a.m6460m(str5, "Push notification message is empty, not rendering");
                        abstractC2184a.mo6479b(context).m6474k();
                        String string5 = bundle.getString("pf", "");
                        if (TextUtils.isEmpty(string5)) {
                            return;
                        }
                        m6583m(Integer.parseInt(string5), context);
                        return;
                    }
                }
                if (!C0987y.m3822d(context, bundle.getString("wzrk_cid", ""))) {
                    C2181a c2181aM6433b6 = cleverTapInstanceConfig.m6433b();
                    String str6 = cleverTapInstanceConfig.f10995a;
                    String str7 = "Not rendering push notification as channel = " + bundle.getString("wzrk_cid", "") + " is blocked by user";
                    c2181aM6433b6.getClass();
                    C2181a.m6460m(str6, str7);
                    return;
                }
                C10445a c10445a2 = (C10445a) this.f11346i;
                c10445a2.getClass();
                String string6 = bundle.getString("nt", "");
                if (string6.isEmpty()) {
                    string6 = context.getApplicationInfo().name;
                }
                c10445a2.f52293b = string6;
                if (string6.isEmpty()) {
                    String str8 = context.getApplicationInfo().name;
                }
                m6582l(context, bundle, i10);
            } catch (Throwable th3) {
                C2181a c2181aM6433b7 = cleverTapInstanceConfig.m6433b();
                String str9 = cleverTapInstanceConfig.f10995a;
                c2181aM6433b7.getClass();
                C2181a.m6453e(str9, "Couldn't render notification: ", th3);
            }
        }
    }

    /* JADX INFO: renamed from: e */
    public final ArrayList<PushConstants.PushType> m6575e() {
        ArrayList<PushConstants.PushType> arrayList = new ArrayList<>();
        Iterator<InterfaceC2254a> it = this.f11340c.iterator();
        while (it.hasNext()) {
            arrayList.add(it.next().getPushType());
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: f */
    public final InterfaceC2254a m6576f(PushConstants.PushType pushType, boolean z10) {
        InterfaceC2254a interfaceC2254a;
        CleverTapInstanceConfig cleverTapInstanceConfig = this.f11344g;
        String ctProviderClassName = pushType.getCtProviderClassName();
        try {
            Class<?> cls = Class.forName(ctProviderClassName);
            Context context = this.f11345h;
            interfaceC2254a = z10 ? (InterfaceC2254a) cls.getConstructor(InterfaceC2256b.class, Context.class, CleverTapInstanceConfig.class).newInstance(this, context, cleverTapInstanceConfig) : (InterfaceC2254a) cls.getConstructor(InterfaceC2256b.class, Context.class, CleverTapInstanceConfig.class, Boolean.class).newInstance(this, context, cleverTapInstanceConfig, Boolean.FALSE);
            try {
                cleverTapInstanceConfig.m6434c("PushProvider", "Found provider:" + ctProviderClassName);
            } catch (ClassNotFoundException unused) {
                cleverTapInstanceConfig.m6434c("PushProvider", "Unable to create provider ClassNotFoundException" + ctProviderClassName);
            } catch (IllegalAccessException unused2) {
                cleverTapInstanceConfig.m6434c("PushProvider", "Unable to create provider IllegalAccessException" + ctProviderClassName);
            } catch (InstantiationException unused3) {
                cleverTapInstanceConfig.m6434c("PushProvider", "Unable to create provider InstantiationException" + ctProviderClassName);
            } catch (Exception e10) {
                e = e10;
                StringBuilder sbM854m = C0204c.m854m("Unable to create provider ", ctProviderClassName, " Exception:");
                sbM854m.append(e.getClass().getName());
                cleverTapInstanceConfig.m6434c("PushProvider", sbM854m.toString());
            }
        } catch (ClassNotFoundException unused4) {
            interfaceC2254a = null;
        } catch (IllegalAccessException unused5) {
            interfaceC2254a = null;
        } catch (InstantiationException unused6) {
            interfaceC2254a = null;
        } catch (Exception e11) {
            e = e11;
            interfaceC2254a = null;
        }
        return interfaceC2254a;
    }

    /* JADX INFO: renamed from: g */
    public final String m6577g(PushConstants.PushType pushType) {
        CleverTapInstanceConfig cleverTapInstanceConfig = this.f11344g;
        if (pushType != null) {
            String tokenPrefKey = pushType.getTokenPrefKey();
            if (!TextUtils.isEmpty(tokenPrefKey)) {
                String strM15829g = C7977q0.m15829g(this.f11345h, cleverTapInstanceConfig, tokenPrefKey, null);
                cleverTapInstanceConfig.m6434c("PushProvider", pushType + "getting Cached Token - " + strM15829g);
                return strM15829g;
            }
        }
        if (pushType != null) {
            cleverTapInstanceConfig.m6434c("PushProvider", pushType + " Unable to find cached Token for type ");
        }
        return null;
    }

    /* JADX INFO: renamed from: h */
    public final void m6578h(PushConstants.PushType pushType, String str) {
        m6580j(pushType, str, true);
        CleverTapInstanceConfig cleverTapInstanceConfig = this.f11344g;
        if (!TextUtils.isEmpty(str)) {
            if (pushType == null) {
                return;
            }
            try {
                C1735a.m5472a(cleverTapInstanceConfig).m5473a().m6585b("PushProviders#cacheToken", new CallableC2259e(this, str, pushType));
            } catch (Throwable th2) {
                cleverTapInstanceConfig.m6435d(pushType + "Unable to cache token " + str, th2);
            }
        }
    }

    /* JADX INFO: renamed from: i */
    public final boolean m6579i() {
        Iterator<PushConstants.PushType> it = m6575e().iterator();
        while (it.hasNext()) {
            if (m6577g(it.next()) != null) {
                return true;
            }
        }
        return false;
    }

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
    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    /* JADX INFO: renamed from: j */
    public final void m6580j(PushConstants.PushType pushType, String str, boolean z10) {
        if (pushType == null) {
            return;
        }
        if (TextUtils.isEmpty(str)) {
            str = m6577g(pushType);
        }
        if (TextUtils.isEmpty(str)) {
            return;
        }
        synchronized (this.f11348k) {
            JSONObject jSONObject = new JSONObject();
            JSONObject jSONObject2 = new JSONObject();
            String str2 = z10 ? "register" : "unregister";
            try {
                jSONObject2.put("action", str2);
                jSONObject2.put("id", str);
                jSONObject2.put("type", pushType.getType());
                if (pushType == PushConstants.PushType.XPS) {
                    this.f11344g.m6433b().getClass();
                    C2181a.m6458k("PushProviders: pushDeviceTokenEvent requesting device region");
                    jSONObject2.put("region", pushType.getServerRegion());
                }
                jSONObject.put("data", jSONObject2);
                C2181a c2181aM6433b = this.f11344g.m6433b();
                c2181aM6433b.getClass();
                C2181a.m6460m(this.f11344g.f10995a, pushType + str2 + " device token " + str);
                AnalyticsManager analyticsManager = this.f11342e;
                analyticsManager.f10947c.mo595e0(analyticsManager.f10950f, jSONObject, 5);
            } catch (Throwable th2) {
                C2181a c2181aM6433b2 = this.f11344g.m6433b();
                c2181aM6433b2.getClass();
                C2181a.m6461n(this.f11344g.f10995a, pushType + str2 + " device token failed", th2);
            }
        }
    }

    /* JADX INFO: renamed from: k */
    public final void m6581k(Context context, JobParameters jobParameters) {
        C1735a.m5472a(this.f11344g).m5474b().m6585b("runningJobService", new a(context, jobParameters));
    }

    /* JADX WARN: Code duplicated, block: B:117:0x039d  */
    /* JADX WARN: Code duplicated, block: B:120:0x03b1 A[Catch: NameNotFoundException -> 0x03e5, TryCatch #5 {NameNotFoundException -> 0x03e5, blocks: (B:118:0x03a7, B:120:0x03b1, B:122:0x03c1), top: B:278:0x03a7 }] */
    /* JADX WARN: Code duplicated, block: B:124:0x03de A[LOOP:0: B:119:0x03af->B:124:0x03de, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:127:0x03fb A[EDGE_INSN: B:127:0x03fb->B:128:0x03fc BREAK  A[LOOP:0: B:119:0x03af->B:124:0x03de]] */
    /* JADX WARN: Code duplicated, block: B:163:0x0488  */
    /* JADX WARN: Code duplicated, block: B:177:0x04b2  */
    /* JADX WARN: Code duplicated, block: B:188:0x04ce A[Catch: all -> 0x0561, TryCatch #0 {all -> 0x0561, blocks: (B:158:0x0479, B:164:0x0489, B:167:0x0493, B:169:0x0499, B:172:0x04a5, B:179:0x04b6, B:182:0x04be, B:188:0x04ce, B:190:0x04e9, B:192:0x04ef, B:155:0x045c), top: B:269:0x0479 }] */
    /* JADX WARN: Code duplicated, block: B:190:0x04e9 A[Catch: all -> 0x0561, TryCatch #0 {all -> 0x0561, blocks: (B:158:0x0479, B:164:0x0489, B:167:0x0493, B:169:0x0499, B:172:0x04a5, B:179:0x04b6, B:182:0x04be, B:188:0x04ce, B:190:0x04e9, B:192:0x04ef, B:155:0x045c), top: B:269:0x0479 }] */
    /* JADX WARN: Code duplicated, block: B:192:0x04ef A[Catch: all -> 0x0561, TRY_LEAVE, TryCatch #0 {all -> 0x0561, blocks: (B:158:0x0479, B:164:0x0489, B:167:0x0493, B:169:0x0499, B:172:0x04a5, B:179:0x04b6, B:182:0x04be, B:188:0x04ce, B:190:0x04e9, B:192:0x04ef, B:155:0x045c), top: B:269:0x0479 }] */
    /* JADX WARN: Code duplicated, block: B:199:0x0508 A[Catch: all -> 0x055e, TryCatch #22 {all -> 0x055e, blocks: (B:201:0x0518, B:196:0x04fd, B:199:0x0508), top: B:308:0x0518 }] */
    /* JADX WARN: Code duplicated, block: B:206:0x0540  */
    /* JADX WARN: Code duplicated, block: B:208:0x0547 A[Catch: all -> 0x0558, TryCatch #14 {all -> 0x0558, blocks: (B:207:0x0542, B:209:0x054d, B:208:0x0547, B:218:0x0566), top: B:295:0x0542 }] */
    /* JADX WARN: Code duplicated, block: B:218:0x0566 A[Catch: all -> 0x0558, TRY_LEAVE, TryCatch #14 {all -> 0x0558, blocks: (B:207:0x0542, B:209:0x054d, B:208:0x0547, B:218:0x0566), top: B:295:0x0542 }] */
    /* JADX WARN: Code duplicated, block: B:237:0x0643 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:238:0x0645 A[DONT_GENERATE] */
    /* JADX WARN: Code duplicated, block: B:242:0x064e A[Catch: all -> 0x073d, TRY_LEAVE, TryCatch #19 {all -> 0x073d, blocks: (B:240:0x0648, B:242:0x064e, B:245:0x065c, B:247:0x0668, B:252:0x06d0, B:261:0x0737, B:262:0x073c, B:249:0x066d, B:251:0x06b0), top: B:304:0x0648, inners: #11 }] */
    /* JADX WARN: Code duplicated, block: B:245:0x065c A[Catch: all -> 0x073d, TRY_ENTER, TryCatch #19 {all -> 0x073d, blocks: (B:240:0x0648, B:242:0x064e, B:245:0x065c, B:247:0x0668, B:252:0x06d0, B:261:0x0737, B:262:0x073c, B:249:0x066d, B:251:0x06b0), top: B:304:0x0648, inners: #11 }] */
    /* JADX WARN: Code duplicated, block: B:247:0x0668 A[Catch: all -> 0x073d, TRY_LEAVE, TryCatch #19 {all -> 0x073d, blocks: (B:240:0x0648, B:242:0x064e, B:245:0x065c, B:247:0x0668, B:252:0x06d0, B:261:0x0737, B:262:0x073c, B:249:0x066d, B:251:0x06b0), top: B:304:0x0648, inners: #11 }] */
    /* JADX WARN: Code duplicated, block: B:256:0x06e6  */
    /* JADX WARN: Code duplicated, block: B:258:0x070e  */
    /* JADX WARN: Code duplicated, block: B:274:0x04f5 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:276:0x040c A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:304:0x0648 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:308:0x0518 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:312:0x03fb A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:313:0x03c1 A[SYNTHETIC] */
    /* JADX WARN: Instruction removed from duplicated block: B:258:0x070e, please report this as an issue */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v29 */
    /* JADX WARN: Type inference failed for: r10v32 */
    /* JADX WARN: Type inference failed for: r10v7 */
    /* JADX WARN: Type inference failed for: r10v8, types: [int] */
    /* JADX WARN: Unreachable blocks removed: 2, instructions: 4 */
    /* JADX INFO: renamed from: l */
    public final void m6582l(Context context, Bundle bundle, int i10) {
        int i11;
        int identifier;
        ?? r10;
        AbstractC7237p abstractC7237p;
        PendingIntent broadcast;
        JSONArray jSONArray;
        Class cls;
        boolean z10;
        String string;
        long jCurrentTimeMillis;
        String string2;
        DBAdapter dBAdapterMo6479b;
        String name;
        int i12;
        JSONArray jSONArray2;
        String str;
        String str2;
        String str3;
        String strOptString;
        String str4;
        int identifier2;
        boolean z11;
        boolean z12;
        Intent intent;
        int iCurrentTimeMillis;
        PendingIntent activity;
        ServiceInfo[] serviceInfoArr;
        int length;
        int i13;
        ServiceInfo serviceInfo;
        ServiceInfo[] serviceInfoArr2;
        Intent launchIntentForPackage;
        boolean zEquals;
        int iHashCode = i10;
        NotificationManager notificationManager = (NotificationManager) context.getSystemService("notification");
        if (notificationManager == null) {
            C2181a c2181aM6433b = this.f11344g.m6433b();
            String str5 = this.f11344g.f10995a;
            c2181aM6433b.getClass();
            C2181a.m6452d(str5, "Unable to render notification, Notification Manager is null.");
            return;
        }
        String string3 = bundle.getString("wzrk_cid", "");
        String string4 = "";
        if (string3.isEmpty()) {
            string4 = bundle.toString();
            i11 = 8;
        } else if (notificationManager.getNotificationChannel(string3) == null) {
            i11 = 9;
            string4 = string3;
        } else {
            i11 = -1;
        }
        if (i11 != -1) {
            C5382b c5382bM3821c = C0987y.m3821c(512, i11, string4);
            C2181a c2181aM6433b2 = this.f11344g.m6433b();
            String str6 = this.f11344g.f10995a;
            String str7 = c5382bM3821c.f33798b;
            c2181aM6433b2.getClass();
            C2181a.m6452d(str6, str7);
            this.f11347j.m11556b(c5382bM3821c);
            return;
        }
        try {
            C7967l0.m15806h(context).getClass();
            String str8 = C7967l0.f43376g;
            if (str8 == null) {
                throw new IllegalArgumentException();
            }
            identifier = context.getResources().getIdentifier(str8, "drawable", context.getPackageName());
            if (identifier == 0) {
                throw new IllegalArgumentException();
            }
            ((C10445a) this.f11346i).f52294c = identifier;
            String string5 = bundle.getString("pr");
            if (string5 != null) {
                zEquals = string5.equals("high");
                if (string5.equals("max")) {
                    r10 = zEquals;
                    r10 = 2;
                }
            } else {
                r10 = 0;
            }
            r10 = zEquals;
            if (iHashCode == -1000) {
                try {
                    ((C10445a) this.f11346i).getClass();
                    Object obj = bundle.get("wzrk_ck");
                    if (obj != null) {
                        if (obj instanceof Number) {
                            iHashCode = ((Number) obj).intValue();
                        } else if (obj instanceof String) {
                            try {
                                iHashCode = Integer.parseInt(obj.toString());
                                C2181a c2181aM6433b3 = this.f11344g.m6433b();
                                c2181aM6433b3.getClass();
                                C2181a.m6460m(this.f11344g.f10995a, "Converting collapse_key: " + obj + " to notificationId int: " + iHashCode);
                            } catch (NumberFormatException unused) {
                                iHashCode = obj.toString().hashCode();
                                C2181a c2181aM6433b4 = this.f11344g.m6433b();
                                c2181aM6433b4.getClass();
                                C2181a.m6460m(this.f11344g.f10995a, "Converting collapse_key: " + obj + " to notificationId int: " + iHashCode);
                            }
                        }
                        iHashCode = Math.abs(iHashCode);
                        C2181a c2181aM6433b5 = this.f11344g.m6433b();
                        c2181aM6433b5.getClass();
                        C2181a.m6452d(this.f11344g.f10995a, "Creating the notification id: " + iHashCode + " from collapse_key: " + obj);
                    }
                } catch (NumberFormatException unused2) {
                }
            } else {
                C2181a c2181aM6433b6 = this.f11344g.m6433b();
                c2181aM6433b6.getClass();
                C2181a.m6452d(this.f11344g.f10995a, "Have user provided notificationId: " + iHashCode + " won't use collapse_key (if any) as basis for notificationId");
            }
            if (iHashCode == -1000) {
                iHashCode = (int) (Math.random() * 100.0d);
                C2181a c2181aM6433b7 = this.f11344g.m6433b();
                c2181aM6433b7.getClass();
                C2181a.m6452d(this.f11344g.f10995a, "Setting random notificationId: " + iHashCode);
            }
            int i14 = iHashCode;
            C7236o c7236o = new C7236o(context, string3);
            String string6 = bundle.getString("wzrk_bi", null);
            if (string6 != null) {
                try {
                    int i15 = Integer.parseInt(string6);
                    if (i15 >= 0) {
                        c7236o.f40661u = i15;
                    }
                } catch (Throwable unused3) {
                }
            }
            String string7 = bundle.getString("wzrk_bc", null);
            if (string7 != null) {
                try {
                    int i16 = Integer.parseInt(string7);
                    if (i16 >= 0) {
                        c7236o.f40649i = i16;
                    }
                } catch (Throwable unused4) {
                }
            }
            c7236o.f40650j = r10;
            InterfaceC10446b interfaceC10446b = this.f11346i;
            if (interfaceC10446b instanceof InterfaceC9656b) {
                c7236o = ((InterfaceC9656b) interfaceC10446b).mo18117a(context, bundle, c7236o, this.f11344g);
            }
            C7236o c7236o2 = c7236o;
            InterfaceC10446b interfaceC10446b2 = this.f11346i;
            CleverTapInstanceConfig cleverTapInstanceConfig = this.f11344g;
            C10445a c10445a = (C10445a) interfaceC10446b2;
            c10445a.getClass();
            String str9 = "ico";
            String string8 = bundle.getString("ico");
            String string9 = bundle.getString("wzrk_bp");
            if (string9 == null || !string9.startsWith("http")) {
                C7235n c7235n = new C7235n();
                c7235n.f40640d = C7236o.m14576c(c10445a.f52292a);
                abstractC7237p = c7235n;
            } else {
                try {
                    Bitmap bitmapM15841h = C7979r0.m15841h(context, string9, false);
                    if (bitmapM15841h == null) {
                        throw new Exception("Failed to fetch big picture!");
                    }
                    if (bundle.containsKey("wzrk_nms")) {
                        String string10 = bundle.getString("wzrk_nms");
                        C7234m c7234m = new C7234m();
                        c7234m.f40667b = C7236o.m14576c(string10);
                        c7234m.f40668c = true;
                        IconCompat iconCompat = new IconCompat(1);
                        iconCompat.f5583b = bitmapM15841h;
                        c7234m.f40637d = iconCompat;
                        abstractC7237p = c7234m;
                    } else {
                        C7234m c7234m2 = new C7234m();
                        c7234m2.f40667b = C7236o.m14576c(c10445a.f52292a);
                        c7234m2.f40668c = true;
                        IconCompat iconCompat2 = new IconCompat(1);
                        iconCompat2.f5583b = bitmapM15841h;
                        c7234m2.f40637d = iconCompat2;
                        abstractC7237p = c7234m2;
                    }
                } catch (Throwable th2) {
                    C7235n c7235n2 = new C7235n();
                    c7235n2.f40640d = C7236o.m14576c(c10445a.f52292a);
                    C2181a c2181aM6433b8 = cleverTapInstanceConfig.m6433b();
                    String str10 = cleverTapInstanceConfig.f10995a;
                    c2181aM6433b8.getClass();
                    C2181a.m6461n(str10, "Falling back to big text notification, couldn't fetch big picture", th2);
                    abstractC7237p = c7235n2;
                }
            }
            int i17 = Build.VERSION.SDK_INT;
            if (bundle.containsKey("wzrk_st")) {
                String string11 = bundle.getString("wzrk_st");
                c7236o2.getClass();
                c7236o2.f40653m = C7236o.m14576c(string11);
            }
            if (bundle.containsKey("wzrk_clr")) {
                c7236o2.f40658r = Color.parseColor(bundle.getString("wzrk_clr"));
                c7236o2.f40655o = true;
                c7236o2.f40656p = true;
            }
            c7236o2.m14579d(c10445a.f52293b);
            c7236o2.f40646f = C7236o.m14576c(c10445a.f52292a);
            String str11 = "android.intent.action.VIEW";
            if (i17 >= 31) {
                if (!bundle.containsKey("wzrk_dl") || bundle.getString("wzrk_dl") == null) {
                    launchIntentForPackage = context.getPackageManager().getLaunchIntentForPackage(context.getPackageName());
                    if (launchIntentForPackage == null) {
                        broadcast = null;
                    }
                } else {
                    launchIntentForPackage = new Intent("android.intent.action.VIEW", Uri.parse(bundle.getString("wzrk_dl")));
                    C7979r0.m15843j(context, launchIntentForPackage);
                }
                launchIntentForPackage.setFlags(872415232);
                launchIntentForPackage.putExtras(bundle);
                launchIntentForPackage.removeExtra("wzrk_acts");
                broadcast = PendingIntent.getActivity(context, (int) System.currentTimeMillis(), launchIntentForPackage, 201326592);
            } else {
                Intent intent2 = new Intent(context, (Class<?>) CTPushNotificationReceiver.class);
                intent2.putExtras(bundle);
                intent2.removeExtra("wzrk_acts");
                broadcast = PendingIntent.getBroadcast(context, (int) System.currentTimeMillis(), intent2, 201326592);
            }
            c7236o2.f40647g = broadcast;
            c7236o2.m14580e(16, true);
            c7236o2.m14583h(abstractC7237p);
            c7236o2.f40664x.icon = c10445a.f52294c;
            c7236o2.m14581f(C7979r0.m15841h(context, string8, true));
            String string12 = bundle.getString("wzrk_acts");
            if (string12 != null) {
                try {
                    jSONArray = new JSONArray(string12);
                } catch (Throwable th3) {
                    C2181a c2181aM6433b9 = cleverTapInstanceConfig.m6433b();
                    String str12 = "error parsing notification actions: " + th3.getLocalizedMessage();
                    String str13 = cleverTapInstanceConfig.f10995a;
                    c2181aM6433b9.getClass();
                    C2181a.m6452d(str13, str12);
                    jSONArray = null;
                }
            } else {
                jSONArray = null;
            }
            String str14 = "dl";
            C7967l0.m15806h(context).getClass();
            String str15 = C7967l0.f43368K;
            if (str15 != null) {
                try {
                    try {
                        cls = Class.forName(str15);
                    } catch (ClassNotFoundException unused5) {
                        String str16 = CTNotificationIntentService.MAIN_ACTION;
                        cls = CTNotificationIntentService.class;
                        boolean z13 = C7979r0.f43406a;
                        if (cls != null) {
                            z10 = false;
                            break;
                        }
                        try {
                            serviceInfoArr = context.getPackageManager().getPackageInfo(context.getPackageName(), 4).services;
                            length = serviceInfoArr.length;
                            i13 = 0;
                            while (true) {
                                if (i13 < length) {
                                    z10 = false;
                                    break;
                                }
                                serviceInfo = serviceInfoArr[i13];
                                serviceInfoArr2 = serviceInfoArr;
                                if (serviceInfo.name.equals(cls.getName())) {
                                    C2181a.m6455h("Service " + serviceInfo.name + " found");
                                    z10 = true;
                                    break;
                                }
                                i13++;
                                serviceInfoArr = serviceInfoArr2;
                                z10 = false;
                                break;
                            }
                        } catch (PackageManager.NameNotFoundException e10) {
                            C2181a.m6449a("Intent Service name not found exception - " + e10.getLocalizedMessage());
                        }
                        if (jSONArray != null) {
                            i12 = 0;
                            while (i12 < jSONArray.length()) {
                                try {
                                    JSONObject jSONObject = jSONArray.getJSONObject(i12);
                                    strOptString = jSONObject.optString("l");
                                    String strOptString2 = jSONObject.optString(str14);
                                    String strOptString3 = jSONObject.optString(str9);
                                    jSONArray2 = jSONArray;
                                    try {
                                        String strOptString4 = jSONObject.optString("id");
                                        str = str9;
                                        str4 = str11;
                                        try {
                                            boolean zOptBoolean = jSONObject.optBoolean("ac", true);
                                            if (strOptString.isEmpty()) {
                                                notificationManager = notificationManager;
                                                str3 = str14;
                                                str2 = str4;
                                                C2181a.m6449a("not adding push notification action: action label or id missing");
                                            } else {
                                                notificationManager = notificationManager;
                                                str3 = str14;
                                                str2 = str4;
                                                C2181a.m6449a("not adding push notification action: action label or id missing");
                                            }
                                        } catch (Throwable th4) {
                                            th = th4;
                                            notificationManager = notificationManager;
                                        }
                                    } catch (Throwable th5) {
                                        th = th5;
                                        str = str9;
                                        str2 = str11;
                                        str3 = str14;
                                        C2181a.m6449a("error adding notification action : " + th.getLocalizedMessage());
                                        i12++;
                                        str14 = str3;
                                        str11 = str2;
                                        jSONArray = jSONArray2;
                                        str9 = str;
                                        notificationManager = notificationManager;
                                    }
                                } catch (Throwable th6) {
                                    th = th6;
                                    jSONArray2 = jSONArray;
                                }
                                i12++;
                                str14 = str3;
                                str11 = str2;
                                jSONArray = jSONArray2;
                                str9 = str;
                                notificationManager = notificationManager;
                            }
                        }
                        Notification notificationM14578b = c7236o2.m14578b();
                        notificationManager.notify(i14, notificationM14578b);
                        C2181a c2181aM6433b10 = this.f11344g.m6433b();
                        String str17 = this.f11344g.f10995a;
                        String str18 = "Rendered notification: " + notificationM14578b.toString();
                        c2181aM6433b10.getClass();
                        C2181a.m6452d(str17, str18);
                        string = bundle.getString("extras_from");
                        if (string == null) {
                        }
                        String string13 = bundle.getString("wzrk_ttl", ((System.currentTimeMillis() + 345600000) / 1000) + "");
                        jCurrentTimeMillis = Long.parseLong(string13);
                        string2 = bundle.getString("wzrk_pid");
                        dBAdapterMo6479b = this.f11343f.mo6479b(context);
                        this.f11344g.m6433b().getClass();
                        C2181a.m6458k("Storing Push Notification..." + string2 + " - with ttl - " + string13);
                        synchronized (dBAdapterMo6479b) {
                            if (string2 == null) {
                                try {
                                    if (dBAdapterMo6479b.m6464a()) {
                                        name = DBAdapter.Table.PUSH_NOTIFICATIONS.getName();
                                        if (jCurrentTimeMillis <= 0) {
                                            jCurrentTimeMillis = System.currentTimeMillis() + 345600000;
                                        }
                                        try {
                                            try {
                                                SQLiteDatabase writableDatabase = dBAdapterMo6479b.f11040b.getWritableDatabase();
                                                ContentValues contentValues = new ContentValues();
                                                contentValues.put("data", string2);
                                                contentValues.put("created_at", Long.valueOf(jCurrentTimeMillis));
                                                contentValues.put("isRead", (Integer) 0);
                                                writableDatabase.insert(name, null, contentValues);
                                                dBAdapterMo6479b.f11041c = true;
                                                C2181a.m6455h("Stored PN - " + string2 + " with TTL - " + jCurrentTimeMillis);
                                            } catch (Throwable th7) {
                                                dBAdapterMo6479b.f11040b.close();
                                                throw th7;
                                            }
                                        } catch (SQLiteException unused6) {
                                            dBAdapterMo6479b.m6470g().getClass();
                                            C2181a.m6458k("Error adding data to table " + name + " Recreating DB");
                                            dBAdapterMo6479b.f11040b.m6477a();
                                        }
                                        dBAdapterMo6479b.f11040b.close();
                                    } else {
                                        dBAdapterMo6479b.m6470g().getClass();
                                        C2181a.m6458k("There is not enough space left on the device to store data, data discarded");
                                    }
                                } catch (Throwable th8) {
                                    throw th8;
                                }
                            }
                            if (!"true".equals(bundle.getString("wzrk_rnv", ""))) {
                                C5382b c5382bM3821c2 = C0987y.m3821c(512, 10, bundle.toString());
                                C2181a c2181aM6433b11 = this.f11344g.m6433b();
                                String str19 = c5382bM3821c2.f33798b;
                                c2181aM6433b11.getClass();
                                C2181a.m6451c(str19);
                                this.f11347j.m11556b(c5382bM3821c2);
                                return;
                            }
                            this.f11342e.m6417z0(bundle);
                            C2181a c2181aM6433b12 = this.f11344g.m6433b();
                            String str20 = "Rendered Push Notification... from nh_source = " + bundle.getString("nh_source", "source not available");
                            c2181aM6433b12.getClass();
                            C2181a.m6458k(str20);
                        }
                    }
                } catch (ClassNotFoundException unused7) {
                    C2181a.m6449a("No Intent Service found");
                    cls = null;
                }
            } else {
                try {
                    String str21 = CTNotificationIntentService.MAIN_ACTION;
                    cls = CTNotificationIntentService.class;
                } catch (ClassNotFoundException unused8) {
                    C2181a.m6449a("No Intent Service found");
                    cls = null;
                }
            }
            boolean z14 = C7979r0.f43406a;
            if (cls != null) {
                serviceInfoArr = context.getPackageManager().getPackageInfo(context.getPackageName(), 4).services;
                length = serviceInfoArr.length;
                i13 = 0;
                while (true) {
                    if (i13 < length) {
                        z10 = false;
                        break;
                    }
                    serviceInfo = serviceInfoArr[i13];
                    serviceInfoArr2 = serviceInfoArr;
                    if (serviceInfo.name.equals(cls.getName())) {
                        C2181a.m6455h("Service " + serviceInfo.name + " found");
                        z10 = true;
                        break;
                    }
                    i13++;
                    serviceInfoArr = serviceInfoArr2;
                    z10 = false;
                    break;
                }
            }
            z10 = false;
            break;
            if (jSONArray != null && jSONArray.length() > 0) {
                i12 = 0;
                while (i12 < jSONArray.length()) {
                    JSONObject jSONObject2 = jSONArray.getJSONObject(i12);
                    strOptString = jSONObject2.optString("l");
                    String strOptString5 = jSONObject2.optString(str14);
                    String strOptString6 = jSONObject2.optString(str9);
                    jSONArray2 = jSONArray;
                    String strOptString7 = jSONObject2.optString("id");
                    str = str9;
                    str4 = str11;
                    boolean zOptBoolean2 = jSONObject2.optBoolean("ac", true);
                    if (strOptString.isEmpty() || strOptString7.isEmpty()) {
                        notificationManager = notificationManager;
                        str3 = str14;
                        str2 = str4;
                        C2181a.m6449a("not adding push notification action: action label or id missing");
                    } else {
                        try {
                            try {
                                if (strOptString6.isEmpty()) {
                                    notificationManager = notificationManager;
                                } else {
                                    try {
                                        notificationManager = notificationManager;
                                        try {
                                            identifier2 = context.getResources().getIdentifier(strOptString6, "drawable", context.getPackageName());
                                        } catch (Throwable th9) {
                                            th = th9;
                                            C2181a.m6449a("unable to add notification action icon: " + th.getLocalizedMessage());
                                            identifier2 = 0;
                                        }
                                    } catch (Throwable th10) {
                                        th = th10;
                                        notificationManager = notificationManager;
                                    }
                                    if (Build.VERSION.SDK_INT >= 31 && zOptBoolean2 && z10) {
                                        z11 = true;
                                    } else {
                                        z11 = false;
                                    }
                                    String string14 = bundle.getString("pt_dismiss_on_click");
                                    if (z11 && C2257c.m6569b(bundle)) {
                                        z12 = z11;
                                        if (strOptString7.contains("remind") && string14 != null && string14.equalsIgnoreCase("true") && zOptBoolean2 && z10) {
                                            z12 = true;
                                        }
                                    } else {
                                        z12 = z11;
                                    }
                                    if (!z12 && C2257c.m6569b(bundle) && string14 != null && string14.equalsIgnoreCase("true") && zOptBoolean2 && z10) {
                                        z12 = true;
                                    }
                                    if (z12) {
                                        intent = new Intent("com.clevertap.PUSH_EVENT");
                                        intent.setPackage(context.getPackageName());
                                        intent.putExtra("ct_type", CTNotificationIntentService.TYPE_BUTTON_CLICK);
                                        if (!strOptString5.isEmpty()) {
                                            intent.putExtra(str14, strOptString5);
                                        }
                                        str2 = str4;
                                    } else if (strOptString5.isEmpty()) {
                                        str2 = str4;
                                        intent = context.getPackageManager().getLaunchIntentForPackage(context.getPackageName());
                                    } else {
                                        try {
                                            str2 = str4;
                                            intent = new Intent(str2, Uri.parse(strOptString5));
                                            C7979r0.m15843j(context, intent);
                                        } catch (Throwable th11) {
                                            th = th11;
                                            str2 = str4;
                                            str3 = str14;
                                            C2181a.m6449a("error adding notification action : " + th.getLocalizedMessage());
                                            i12++;
                                            str14 = str3;
                                            str11 = str2;
                                            jSONArray = jSONArray2;
                                            str9 = str;
                                            notificationManager = notificationManager;
                                        }
                                    }
                                    if (intent != null) {
                                        try {
                                            intent.putExtras(bundle);
                                            intent.removeExtra("wzrk_acts");
                                            intent.putExtra("actionId", strOptString7);
                                            intent.putExtra("autoCancel", zOptBoolean2);
                                            intent.putExtra("wzrk_c2a", strOptString7);
                                            intent.putExtra("notificationId", i14);
                                            intent.setFlags(603979776);
                                        } catch (Throwable th12) {
                                            th = th12;
                                            str3 = str14;
                                            C2181a.m6449a("error adding notification action : " + th.getLocalizedMessage());
                                            i12++;
                                            str14 = str3;
                                            str11 = str2;
                                            jSONArray = jSONArray2;
                                            str9 = str;
                                            notificationManager = notificationManager;
                                        }
                                    }
                                    str3 = str14;
                                    iCurrentTimeMillis = ((int) System.currentTimeMillis()) + i12;
                                    if (z12) {
                                        try {
                                            activity = PendingIntent.getService(context, iCurrentTimeMillis, intent, 201326592);
                                        } catch (Throwable th13) {
                                            th = th13;
                                            C2181a.m6449a("error adding notification action : " + th.getLocalizedMessage());
                                        }
                                    } else {
                                        activity = PendingIntent.getActivity(context, iCurrentTimeMillis, intent, 201326592);
                                    }
                                    c7236o2.f40642b.add(new C7233l(identifier2, strOptString, activity));
                                }
                                iCurrentTimeMillis = ((int) System.currentTimeMillis()) + i12;
                                if (z12) {
                                    activity = PendingIntent.getService(context, iCurrentTimeMillis, intent, 201326592);
                                } else {
                                    activity = PendingIntent.getActivity(context, iCurrentTimeMillis, intent, 201326592);
                                }
                                c7236o2.f40642b.add(new C7233l(identifier2, strOptString, activity));
                            } catch (Throwable th14) {
                                th = th14;
                                C2181a.m6449a("error adding notification action : " + th.getLocalizedMessage());
                                i12++;
                                str14 = str3;
                                str11 = str2;
                                jSONArray = jSONArray2;
                                str9 = str;
                                notificationManager = notificationManager;
                            }
                            if (Build.VERSION.SDK_INT >= 31) {
                                z11 = false;
                            } else {
                                z11 = false;
                            }
                            String string15 = bundle.getString("pt_dismiss_on_click");
                            if (z11) {
                                z12 = z11;
                            } else {
                                z12 = z11;
                            }
                            if (!z12) {
                                z12 = true;
                            }
                            if (z12) {
                                intent = new Intent("com.clevertap.PUSH_EVENT");
                                intent.setPackage(context.getPackageName());
                                intent.putExtra("ct_type", CTNotificationIntentService.TYPE_BUTTON_CLICK);
                                if (!strOptString5.isEmpty()) {
                                    intent.putExtra(str14, strOptString5);
                                }
                                str2 = str4;
                            } else if (strOptString5.isEmpty()) {
                                str2 = str4;
                                intent = new Intent(str2, Uri.parse(strOptString5));
                                C7979r0.m15843j(context, intent);
                            } else {
                                str2 = str4;
                                intent = context.getPackageManager().getLaunchIntentForPackage(context.getPackageName());
                            }
                            if (intent != null) {
                                intent.putExtras(bundle);
                                intent.removeExtra("wzrk_acts");
                                intent.putExtra("actionId", strOptString7);
                                intent.putExtra("autoCancel", zOptBoolean2);
                                intent.putExtra("wzrk_c2a", strOptString7);
                                intent.putExtra("notificationId", i14);
                                intent.setFlags(603979776);
                            }
                            str3 = str14;
                        } catch (Throwable th15) {
                            th = th15;
                            str3 = str14;
                            str2 = str4;
                            C2181a.m6449a("error adding notification action : " + th.getLocalizedMessage());
                            i12++;
                            str14 = str3;
                            str11 = str2;
                            jSONArray = jSONArray2;
                            str9 = str;
                            notificationManager = notificationManager;
                        }
                        identifier2 = 0;
                    }
                    i12++;
                    str14 = str3;
                    str11 = str2;
                    jSONArray = jSONArray2;
                    str9 = str;
                    notificationManager = notificationManager;
                }
            }
            Notification notificationM14578b2 = c7236o2.m14578b();
            notificationManager.notify(i14, notificationM14578b2);
            C2181a c2181aM6433b13 = this.f11344g.m6433b();
            String str110 = this.f11344g.f10995a;
            String str111 = "Rendered notification: " + notificationM14578b2.toString();
            c2181aM6433b13.getClass();
            C2181a.m6452d(str110, str111);
            string = bundle.getString("extras_from");
            if (string == null && string.equals("PTReceiver")) {
                return;
            }
            String string16 = bundle.getString("wzrk_ttl", ((System.currentTimeMillis() + 345600000) / 1000) + "");
            jCurrentTimeMillis = Long.parseLong(string16);
            string2 = bundle.getString("wzrk_pid");
            dBAdapterMo6479b = this.f11343f.mo6479b(context);
            this.f11344g.m6433b().getClass();
            C2181a.m6458k("Storing Push Notification..." + string2 + " - with ttl - " + string16);
            synchronized (dBAdapterMo6479b) {
                if (string2 == null) {
                    if (dBAdapterMo6479b.m6464a()) {
                        dBAdapterMo6479b.m6470g().getClass();
                        C2181a.m6458k("There is not enough space left on the device to store data, data discarded");
                    } else {
                        name = DBAdapter.Table.PUSH_NOTIFICATIONS.getName();
                        if (jCurrentTimeMillis <= 0) {
                            jCurrentTimeMillis = System.currentTimeMillis() + 345600000;
                        }
                        SQLiteDatabase writableDatabase2 = dBAdapterMo6479b.f11040b.getWritableDatabase();
                        ContentValues contentValues2 = new ContentValues();
                        contentValues2.put("data", string2);
                        contentValues2.put("created_at", Long.valueOf(jCurrentTimeMillis));
                        contentValues2.put("isRead", (Integer) 0);
                        writableDatabase2.insert(name, null, contentValues2);
                        dBAdapterMo6479b.f11041c = true;
                        C2181a.m6455h("Stored PN - " + string2 + " with TTL - " + jCurrentTimeMillis);
                        dBAdapterMo6479b.f11040b.close();
                    }
                }
            }
            if (!"true".equals(bundle.getString("wzrk_rnv", ""))) {
                C5382b c5382bM3821c3 = C0987y.m3821c(512, 10, bundle.toString());
                C2181a c2181aM6433b14 = this.f11344g.m6433b();
                String str112 = c5382bM3821c3.f33798b;
                c2181aM6433b14.getClass();
                C2181a.m6451c(str112);
                this.f11347j.m11556b(c5382bM3821c3);
                return;
            }
            this.f11342e.m6417z0(bundle);
            C2181a c2181aM6433b15 = this.f11344g.m6433b();
            String str22 = "Rendered Push Notification... from nh_source = " + bundle.getString("nh_source", "source not available");
            c2181aM6433b15.getClass();
            C2181a.m6458k(str22);
        } catch (Throwable unused9) {
            identifier = context.getApplicationInfo().icon;
        }
    }

    /* JADX INFO: renamed from: m */
    public final void m6583m(int i10, Context context) {
        CleverTapInstanceConfig cleverTapInstanceConfig = this.f11344g;
        cleverTapInstanceConfig.m6433b().getClass();
        C2181a.m6458k("Ping frequency received - " + i10);
        C2181a c2181aM6433b = cleverTapInstanceConfig.m6433b();
        String str = "Stored Ping Frequency - " + C7977q0.m15824b(context, 240, "pf");
        c2181aM6433b.getClass();
        C2181a.m6458k(str);
        if (i10 != C7977q0.m15824b(context, 240, "pf")) {
            C7977q0.m15831i(context, i10, "pf");
            if (!cleverTapInstanceConfig.f11000f || cleverTapInstanceConfig.f10999e) {
                return;
            }
            C1735a.m5472a(cleverTapInstanceConfig).m5474b().m6585b("createOrResetJobScheduler", new CallableC10449e(context, this));
        }
    }
}
