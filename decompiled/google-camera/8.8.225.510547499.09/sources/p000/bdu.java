package p000;

import android.app.ActivityManager;
import android.app.ApplicationExitInfo;
import android.app.PendingIntent;
import android.app.job.JobInfo;
import android.app.job.JobScheduler;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.database.Cursor;
import android.database.sqlite.SQLiteAccessPermException;
import android.database.sqlite.SQLiteCantOpenDatabaseException;
import android.database.sqlite.SQLiteConstraintException;
import android.database.sqlite.SQLiteDatabaseCorruptException;
import android.database.sqlite.SQLiteDatabaseLockedException;
import android.database.sqlite.SQLiteDiskIOException;
import android.database.sqlite.SQLiteException;
import android.database.sqlite.SQLiteTableLockedException;
import android.text.TextUtils;
import android.util.Log;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.utils.ForceStopRunnable$BroadcastReceiver;
import com.google.android.gms.dynamite.p017ho.DNTdN;
import java.io.File;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class bdu implements Runnable {

    /* JADX INFO: renamed from: c */
    private final Context f3012c;

    /* JADX INFO: renamed from: d */
    private final azp f3013d;

    /* JADX INFO: renamed from: e */
    private int f3014e = 0;

    /* JADX INFO: renamed from: f */
    private final bkn f3015f;

    /* JADX INFO: renamed from: b */
    private static final String f3011b = ayc.m2100b("ForceStopRunnable");

    /* JADX INFO: renamed from: a */
    public static final long f3010a = TimeUnit.DAYS.toMillis(3650);

    public bdu(Context context, azp azpVar) {
        this.f3012c = context.getApplicationContext();
        this.f3013d = azpVar;
        this.f3015f = azpVar.f2788j;
    }

    /* JADX INFO: renamed from: a */
    public static PendingIntent m2251a(Context context, int i) {
        Intent intent = new Intent();
        intent.setComponent(new ComponentName(context, (Class<?>) ForceStopRunnable$BroadcastReceiver.class));
        intent.setAction("ACTION_FORCE_STOP_RESCHEDULE");
        return PendingIntent.getBroadcast(context, -1, intent, i);
    }

    /* JADX WARN: Code duplicated, block: B:133:0x0310 A[Catch: IllegalArgumentException -> 0x0348, SecurityException -> 0x034a, SQLiteAccessPermException -> 0x03b9, SQLiteConstraintException -> 0x03bb, SQLiteTableLockedException -> 0x03bd, SQLiteDatabaseLockedException -> 0x03bf, SQLiteDatabaseCorruptException -> 0x03c1, SQLiteDiskIOException -> 0x03c3, SQLiteCantOpenDatabaseException -> 0x03c5, all -> 0x0412, TryCatch #36 {all -> 0x0412, blocks: (B:3:0x0007, B:5:0x0012, B:11:0x0027, B:13:0x0038, B:15:0x0063, B:16:0x009d, B:17:0x00ad, B:19:0x00b3, B:21:0x00cb, B:23:0x00d1, B:24:0x00ee, B:26:0x00f4, B:28:0x0124, B:27:0x010a, B:30:0x0128, B:32:0x012c, B:42:0x017a, B:44:0x0182, B:46:0x0188, B:48:0x018f, B:50:0x0195, B:51:0x0199, B:53:0x019f, B:55:0x01ab, B:56:0x01b1, B:57:0x01b9, B:58:0x01bd, B:60:0x01c3, B:62:0x01cf, B:66:0x01d9, B:72:0x01f9, B:74:0x01fe, B:75:0x0202, B:76:0x0203, B:184:0x03ab, B:185:0x03ae, B:90:0x0277, B:96:0x0283, B:99:0x0297, B:101:0x02a1, B:117:0x02d4, B:119:0x02de, B:125:0x02e9, B:127:0x02f4, B:129:0x02fa, B:131:0x0300, B:133:0x0310, B:136:0x0317, B:138:0x031d, B:140:0x032b, B:157:0x035b, B:146:0x0339, B:156:0x0351, B:218:0x03d6, B:220:0x03de, B:222:0x03e8, B:226:0x03f0, B:227:0x03ff, B:187:0x03b0, B:188:0x03b8, B:229:0x0401, B:230:0x0411, B:6:0x0016), top: B:253:0x0007, inners: #28 }] */
    /* JADX WARN: Code duplicated, block: B:138:0x031d A[Catch: IllegalArgumentException -> 0x0348, SecurityException -> 0x034a, SQLiteAccessPermException -> 0x03b9, SQLiteConstraintException -> 0x03bb, SQLiteTableLockedException -> 0x03bd, SQLiteDatabaseLockedException -> 0x03bf, SQLiteDatabaseCorruptException -> 0x03c1, SQLiteDiskIOException -> 0x03c3, SQLiteCantOpenDatabaseException -> 0x03c5, all -> 0x0412, TryCatch #36 {all -> 0x0412, blocks: (B:3:0x0007, B:5:0x0012, B:11:0x0027, B:13:0x0038, B:15:0x0063, B:16:0x009d, B:17:0x00ad, B:19:0x00b3, B:21:0x00cb, B:23:0x00d1, B:24:0x00ee, B:26:0x00f4, B:28:0x0124, B:27:0x010a, B:30:0x0128, B:32:0x012c, B:42:0x017a, B:44:0x0182, B:46:0x0188, B:48:0x018f, B:50:0x0195, B:51:0x0199, B:53:0x019f, B:55:0x01ab, B:56:0x01b1, B:57:0x01b9, B:58:0x01bd, B:60:0x01c3, B:62:0x01cf, B:66:0x01d9, B:72:0x01f9, B:74:0x01fe, B:75:0x0202, B:76:0x0203, B:184:0x03ab, B:185:0x03ae, B:90:0x0277, B:96:0x0283, B:99:0x0297, B:101:0x02a1, B:117:0x02d4, B:119:0x02de, B:125:0x02e9, B:127:0x02f4, B:129:0x02fa, B:131:0x0300, B:133:0x0310, B:136:0x0317, B:138:0x031d, B:140:0x032b, B:157:0x035b, B:146:0x0339, B:156:0x0351, B:218:0x03d6, B:220:0x03de, B:222:0x03e8, B:226:0x03f0, B:227:0x03ff, B:187:0x03b0, B:188:0x03b8, B:229:0x0401, B:230:0x0411, B:6:0x0016), top: B:253:0x0007, inners: #28 }] */
    /* JADX WARN: Code duplicated, block: B:146:0x0339 A[Catch: SQLiteAccessPermException -> 0x03b9, SQLiteConstraintException -> 0x03bb, SQLiteTableLockedException -> 0x03bd, SQLiteDatabaseLockedException -> 0x03bf, SQLiteDatabaseCorruptException -> 0x03c1, SQLiteDiskIOException -> 0x03c3, SQLiteCantOpenDatabaseException -> 0x03c5, all -> 0x0412, EDGE_INSN: B:146:0x0339->B:158:0x037d BREAK  A[LOOP:0: B:249:0x0027->B:223:0x03eb], TRY_ENTER, TryCatch #36 {all -> 0x0412, blocks: (B:3:0x0007, B:5:0x0012, B:11:0x0027, B:13:0x0038, B:15:0x0063, B:16:0x009d, B:17:0x00ad, B:19:0x00b3, B:21:0x00cb, B:23:0x00d1, B:24:0x00ee, B:26:0x00f4, B:28:0x0124, B:27:0x010a, B:30:0x0128, B:32:0x012c, B:42:0x017a, B:44:0x0182, B:46:0x0188, B:48:0x018f, B:50:0x0195, B:51:0x0199, B:53:0x019f, B:55:0x01ab, B:56:0x01b1, B:57:0x01b9, B:58:0x01bd, B:60:0x01c3, B:62:0x01cf, B:66:0x01d9, B:72:0x01f9, B:74:0x01fe, B:75:0x0202, B:76:0x0203, B:184:0x03ab, B:185:0x03ae, B:90:0x0277, B:96:0x0283, B:99:0x0297, B:101:0x02a1, B:117:0x02d4, B:119:0x02de, B:125:0x02e9, B:127:0x02f4, B:129:0x02fa, B:131:0x0300, B:133:0x0310, B:136:0x0317, B:138:0x031d, B:140:0x032b, B:157:0x035b, B:146:0x0339, B:156:0x0351, B:218:0x03d6, B:220:0x03de, B:222:0x03e8, B:226:0x03f0, B:227:0x03ff, B:187:0x03b0, B:188:0x03b8, B:229:0x0401, B:230:0x0411, B:6:0x0016), top: B:253:0x0007, inners: #28 }] */
    /* JADX WARN: Code duplicated, block: B:220:0x03de A[Catch: all -> 0x0412, TRY_LEAVE, TryCatch #36 {all -> 0x0412, blocks: (B:3:0x0007, B:5:0x0012, B:11:0x0027, B:13:0x0038, B:15:0x0063, B:16:0x009d, B:17:0x00ad, B:19:0x00b3, B:21:0x00cb, B:23:0x00d1, B:24:0x00ee, B:26:0x00f4, B:28:0x0124, B:27:0x010a, B:30:0x0128, B:32:0x012c, B:42:0x017a, B:44:0x0182, B:46:0x0188, B:48:0x018f, B:50:0x0195, B:51:0x0199, B:53:0x019f, B:55:0x01ab, B:56:0x01b1, B:57:0x01b9, B:58:0x01bd, B:60:0x01c3, B:62:0x01cf, B:66:0x01d9, B:72:0x01f9, B:74:0x01fe, B:75:0x0202, B:76:0x0203, B:184:0x03ab, B:185:0x03ae, B:90:0x0277, B:96:0x0283, B:99:0x0297, B:101:0x02a1, B:117:0x02d4, B:119:0x02de, B:125:0x02e9, B:127:0x02f4, B:129:0x02fa, B:131:0x0300, B:133:0x0310, B:136:0x0317, B:138:0x031d, B:140:0x032b, B:157:0x035b, B:146:0x0339, B:156:0x0351, B:218:0x03d6, B:220:0x03de, B:222:0x03e8, B:226:0x03f0, B:227:0x03ff, B:187:0x03b0, B:188:0x03b8, B:229:0x0401, B:230:0x0411, B:6:0x0016), top: B:253:0x0007, inners: #28 }] */
    /* JADX WARN: Code duplicated, block: B:254:0x02de A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:258:0x02d4 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:267:0x03f0 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:290:0x0337 A[SYNTHETIC] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r14v10, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r14v11 */
    /* JADX WARN: Type inference failed for: r14v9, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r5v0 */
    /* JADX WARN: Type inference failed for: r5v1 */
    /* JADX WARN: Type inference failed for: r5v37 */
    /* JADX WARN: Type inference failed for: r5v4 */
    /* JADX WARN: Type inference failed for: r5v41 */
    /* JADX WARN: Type inference failed for: r5v42 */
    /* JADX WARN: Type inference failed for: r5v6 */
    /* JADX WARN: Type inference failed for: r7v0 */
    /* JADX WARN: Type inference failed for: r7v1 */
    /* JADX WARN: Type inference failed for: r7v18 */
    /* JADX WARN: Type inference failed for: r7v19 */
    /* JADX WARN: Type inference failed for: r7v2 */
    /* JADX WARN: Type inference failed for: r7v28 */
    /* JADX WARN: Type inference failed for: r7v29 */
    /* JADX WARN: Type inference failed for: r7v3 */
    /* JADX WARN: Type inference failed for: r7v30 */
    /* JADX WARN: Type inference failed for: r7v31 */
    /* JADX WARN: Type inference failed for: r7v32 */
    /* JADX WARN: Type inference failed for: r7v33 */
    /* JADX WARN: Type inference failed for: r7v34 */
    /* JADX WARN: Type inference failed for: r7v4 */
    /* JADX WARN: Type inference failed for: r7v5 */
    @Override // java.lang.Runnable
    public final void run() {
        azp azpVar;
        Throwable th;
        ?? r7;
        int i;
        boolean z;
        Throwable th2;
        Throwable th3;
        PendingIntent pendingIntentM2251a;
        List<ApplicationExitInfo> historicalProcessExitReasons;
        ApplicationExitInfo applicationExitInfo;
        String str = DNTdN.mTVxHXrvaYbMf;
        try {
            axp axpVar = this.f3013d.f2781c;
            ?? r5 = 0;
            if (!TextUtils.isEmpty(null)) {
                boolean zM2262a = bea.m2262a(this.f3012c, axpVar);
                ayc.m2099a();
                if (!zM2262a) {
                    azpVar = this.f3013d;
                }
                azpVar.m2126f();
            }
            ayc.m2099a();
            while (true) {
                try {
                    Context context = this.f3012c;
                    context.getClass();
                    ?? r8 = 3;
                    r8 = 3;
                    r8 = 3;
                    r8 = 3;
                    r8 = 3;
                    r8 = 3;
                    r8 = 3;
                    int i2 = 0;
                    if (C0159ek.m7406d(context).exists()) {
                        ayc.m2099a();
                        String str2 = azj.f2774a;
                        File fileM7406d = C0159ek.m7406d(context);
                        File file = new File(aym.f2726a.m2108a(context), "androidx.work.workdb");
                        String[] strArr = azj.f2775b;
                        int length = strArr.length;
                        LinkedHashMap linkedHashMap = new LinkedHashMap(ook.m18789c(omn.m18721z(3), 16));
                        for (int i3 = 0; i3 < 3; i3++) {
                            String str3 = strArr[i3];
                            okb okbVarM15590q = lkm.m15590q(new File(String.valueOf(fileM7406d.getPath()).concat(String.valueOf(str3))), new File(String.valueOf(file.getPath()).concat(String.valueOf(str3))));
                            linkedHashMap.put(okbVarM15590q.f46186a, okbVarM15590q.f46187b);
                        }
                        for (Map.Entry entry : omn.m18662B(linkedHashMap, lkm.m15590q(fileM7406d, file)).entrySet()) {
                            File file2 = (File) entry.getKey();
                            File file3 = (File) entry.getValue();
                            if (file2.exists()) {
                                if (file3.exists()) {
                                    ayc.m2099a();
                                    String str4 = azj.f2774a;
                                    StringBuilder sb = new StringBuilder();
                                    sb.append("Over-writing contents of ");
                                    sb.append(file3);
                                    Log.w(str4, "Over-writing contents of ".concat(String.valueOf(file3)));
                                }
                                if (file2.renameTo(file3)) {
                                    StringBuilder sb2 = new StringBuilder();
                                    sb2.append("Migrated ");
                                    sb2.append(file2);
                                    sb2.append("to ");
                                    sb2.append(file3);
                                } else {
                                    StringBuilder sb3 = new StringBuilder();
                                    sb3.append("Renaming ");
                                    sb3.append(file2);
                                    sb3.append(" to ");
                                    sb3.append(file3);
                                    sb3.append(" failed");
                                }
                                ayc.m2099a();
                            }
                        }
                    }
                    ayc.m2099a();
                    try {
                        try {
                            Context context2 = this.f3012c;
                            azp azpVar2 = this.f3013d;
                            int i4 = bai.f2868a;
                            JobScheduler jobScheduler = (JobScheduler) context2.getSystemService("jobscheduler");
                            List<JobInfo> listM2158e = bai.m2158e(context2, jobScheduler);
                            bce bceVarMo1704y = azpVar2.f2782d.mo1704y();
                            apy apyVarM1841a = apy.m1841a("SELECT DISTINCT work_spec_id FROM SystemIdInfo", 0);
                            ((bci) bceVarMo1704y).f2942a.m1824l();
                            Cursor cursorM409e = aey.m409e(((bci) bceVarMo1704y).f2942a, apyVarM1841a, false);
                            try {
                                ArrayList arrayList = new ArrayList(cursorM409e.getCount());
                                while (cursorM409e.moveToNext()) {
                                    arrayList.add(cursorM409e.isNull(0) ? r5 : cursorM409e.getString(0));
                                }
                                cursorM409e.close();
                                apyVarM1841a.m1850j();
                                HashSet hashSet = new HashSet(listM2158e != null ? listM2158e.size() : 0);
                                if (listM2158e != null && !listM2158e.isEmpty()) {
                                    for (JobInfo jobInfo : listM2158e) {
                                        bcj bcjVarM2157a = bai.m2157a(jobInfo);
                                        if (bcjVarM2157a != null) {
                                            hashSet.add(bcjVarM2157a.f2946a);
                                        } else {
                                            bai.m2159f(jobScheduler, jobInfo.getId());
                                        }
                                    }
                                }
                                Iterator it = arrayList.iterator();
                                while (true) {
                                    if (it.hasNext()) {
                                        if (!hashSet.contains((String) it.next())) {
                                            ayc.m2099a();
                                            z = true;
                                            break;
                                        }
                                    } else {
                                        z = false;
                                        break;
                                    }
                                }
                                if (z) {
                                    WorkDatabase workDatabase = azpVar2.f2782d;
                                    workDatabase.m1825m();
                                    try {
                                        bcw bcwVarMo1700B = workDatabase.mo1700B();
                                        Iterator it2 = arrayList.iterator();
                                        while (it2.hasNext()) {
                                            bcwVarMo1700B.mo2241j((String) it2.next(), -1L);
                                        }
                                        workDatabase.m1829q();
                                        workDatabase.m1827o();
                                    } catch (Throwable th4) {
                                        workDatabase.m1827o();
                                        throw th4;
                                    }
                                }
                                WorkDatabase workDatabase2 = this.f3013d.f2782d;
                                bcw bcwVarMo1700B2 = workDatabase2.mo1700B();
                                bco bcoVarMo1699A = workDatabase2.mo1699A();
                                workDatabase2.m1825m();
                                try {
                                    List<bcv> listMo2233b = bcwVarMo1700B2.mo2233b();
                                    boolean z2 = !listMo2233b.isEmpty();
                                    if (z2) {
                                        r5 = r5;
                                        for (bcv bcvVar : listMo2233b) {
                                            try {
                                                bcwVarMo1700B2.mo2242k(1, bcvVar.f2964a);
                                                bcwVarMo1700B2.mo2241j(bcvVar.f2964a, -1L);
                                                r5 = 0;
                                            } catch (Throwable th5) {
                                                th2 = th5;
                                                workDatabase2.m1827o();
                                                throw th2;
                                            }
                                        }
                                    }
                                    try {
                                        ((bcs) bcoVarMo1699A).f2952a.m1824l();
                                        arf arfVarM1853e = ((bcs) bcoVarMo1699A).f2954c.m1853e();
                                        ((bcs) bcoVarMo1699A).f2952a.m1825m();
                                        try {
                                            arfVarM1853e.m1883a();
                                            ((bcs) bcoVarMo1699A).f2952a.m1829q();
                                            ((bcs) bcoVarMo1699A).f2952a.m1827o();
                                            ((bcs) bcoVarMo1699A).f2954c.m1855g(arfVarM1853e);
                                            workDatabase2.m1829q();
                                            try {
                                                workDatabase2.m1827o();
                                                boolean z3 = z2 || z;
                                                Long lMo2191a = ((WorkDatabase) this.f3013d.f2788j.f3651a).mo1703x().mo2191a("reschedule_needed");
                                                if (lMo2191a == null) {
                                                    pendingIntentM2251a = m2251a(this.f3012c, 570425344);
                                                    if (pendingIntentM2251a != null) {
                                                        pendingIntentM2251a.cancel();
                                                    }
                                                    historicalProcessExitReasons = ((ActivityManager) this.f3012c.getSystemService("activity")).getHistoricalProcessExitReasons(null, 0, 0);
                                                    if (historicalProcessExitReasons != null) {
                                                        Long lMo2191a2 = ((WorkDatabase) this.f3015f.f3651a).mo1703x().mo2191a(str);
                                                        if (lMo2191a2 != null) {
                                                        }
                                                        while (true) {
                                                            if (i2 < historicalProcessExitReasons.size()) {
                                                                applicationExitInfo = historicalProcessExitReasons.get(i2);
                                                                if (applicationExitInfo.getReason() != 10) {
                                                                }
                                                                i2++;
                                                            }
                                                        }
                                                    }
                                                    if (z3) {
                                                        break;
                                                    }
                                                    ayc.m2099a();
                                                    azp azpVar3 = this.f3013d;
                                                    azf.m2120a(azpVar3.f2781c, azpVar3.f2782d, azpVar3.f2783e);
                                                    break;
                                                }
                                                try {
                                                    if (lMo2191a.longValue() == 1) {
                                                        ayc.m2099a();
                                                        this.f3013d.m2127g();
                                                        ((WorkDatabase) this.f3013d.f2788j.f3651a).mo1703x().mo2192b(new bby("reschedule_needed", 0L));
                                                        break;
                                                    }
                                                    try {
                                                        pendingIntentM2251a = m2251a(this.f3012c, 570425344);
                                                        if (pendingIntentM2251a != null) {
                                                            try {
                                                                pendingIntentM2251a.cancel();
                                                            } catch (IllegalArgumentException | SecurityException e) {
                                                                th3 = e;
                                                                ayc.m2099a();
                                                                Log.w(f3011b, "Ignoring exception", th3);
                                                            }
                                                        }
                                                        try {
                                                            historicalProcessExitReasons = ((ActivityManager) this.f3012c.getSystemService("activity")).getHistoricalProcessExitReasons(null, 0, 0);
                                                            if (historicalProcessExitReasons != null && !historicalProcessExitReasons.isEmpty()) {
                                                                Long lMo2191a3 = ((WorkDatabase) this.f3015f.f3651a).mo1703x().mo2191a(str);
                                                                long jLongValue = lMo2191a3 != null ? lMo2191a3.longValue() : 0L;
                                                                while (true) {
                                                                    if (i2 < historicalProcessExitReasons.size()) {
                                                                        applicationExitInfo = historicalProcessExitReasons.get(i2);
                                                                        if (applicationExitInfo.getReason() != 10 && applicationExitInfo.getTimestamp() >= jLongValue) {
                                                                            ayc.m2099a();
                                                                            this.f3013d.m2127g();
                                                                            ((WorkDatabase) this.f3015f.f3651a).mo1703x().mo2192b(new bby(str, Long.valueOf(System.currentTimeMillis())));
                                                                            break;
                                                                        }
                                                                        i2++;
                                                                    }
                                                                }
                                                            }
                                                            if (z3) {
                                                                break;
                                                            }
                                                            ayc.m2099a();
                                                            azp azpVar4 = this.f3013d;
                                                            azf.m2120a(azpVar4.f2781c, azpVar4.f2782d, azpVar4.f2783e);
                                                            break;
                                                        } catch (IllegalArgumentException e2) {
                                                            e = e2;
                                                            th3 = e;
                                                            ayc.m2099a();
                                                            Log.w(f3011b, "Ignoring exception", th3);
                                                        } catch (SecurityException e3) {
                                                            e = e3;
                                                            th3 = e;
                                                            ayc.m2099a();
                                                            Log.w(f3011b, "Ignoring exception", th3);
                                                        }
                                                    } catch (IllegalArgumentException e4) {
                                                        e = e4;
                                                        th3 = e;
                                                        ayc.m2099a();
                                                        Log.w(f3011b, "Ignoring exception", th3);
                                                        ayc.m2099a();
                                                        this.f3013d.m2127g();
                                                        ((WorkDatabase) this.f3015f.f3651a).mo1703x().mo2192b(new bby(str, Long.valueOf(System.currentTimeMillis())));
                                                        azpVar = this.f3013d;
                                                        azpVar.m2126f();
                                                    } catch (SecurityException e5) {
                                                        e = e5;
                                                        th3 = e;
                                                        ayc.m2099a();
                                                        Log.w(f3011b, "Ignoring exception", th3);
                                                        ayc.m2099a();
                                                        this.f3013d.m2127g();
                                                        ((WorkDatabase) this.f3015f.f3651a).mo1703x().mo2192b(new bby(str, Long.valueOf(System.currentTimeMillis())));
                                                        azpVar = this.f3013d;
                                                        azpVar.m2126f();
                                                    }
                                                } catch (SQLiteAccessPermException | SQLiteCantOpenDatabaseException | SQLiteConstraintException | SQLiteDatabaseCorruptException | SQLiteDatabaseLockedException | SQLiteDiskIOException | SQLiteTableLockedException e6) {
                                                    th = e6;
                                                    r7 = 0;
                                                    i = this.f3014e + 1;
                                                    this.f3014e = i;
                                                    if (i < 3) {
                                                        ayc.m2099a();
                                                        Log.e(f3011b, "The file system on the device is in a bad state. WorkManager cannot access the app's internal data store.", th);
                                                        throw new IllegalStateException("The file system on the device is in a bad state. WorkManager cannot access the app's internal data store.", th);
                                                    }
                                                    ayc.m2099a();
                                                    try {
                                                        Thread.sleep(((long) this.f3014e) * 300);
                                                    } catch (InterruptedException e7) {
                                                    }
                                                    r5 = r7;
                                                }
                                            } catch (SQLiteAccessPermException | SQLiteCantOpenDatabaseException | SQLiteConstraintException | SQLiteDatabaseCorruptException | SQLiteDatabaseLockedException | SQLiteDiskIOException | SQLiteTableLockedException e8) {
                                                e = e8;
                                                r8 = 0;
                                                th = e;
                                                r7 = r8;
                                                i = this.f3014e + 1;
                                                this.f3014e = i;
                                                if (i < 3) {
                                                    ayc.m2099a();
                                                    Log.e(f3011b, "The file system on the device is in a bad state. WorkManager cannot access the app's internal data store.", th);
                                                    throw new IllegalStateException("The file system on the device is in a bad state. WorkManager cannot access the app's internal data store.", th);
                                                }
                                                ayc.m2099a();
                                                Thread.sleep(((long) this.f3014e) * 300);
                                                r5 = r7;
                                            }
                                        } catch (Throwable th6) {
                                            try {
                                                ((bcs) bcoVarMo1699A).f2952a.m1827o();
                                                ((bcs) bcoVarMo1699A).f2954c.m1855g(arfVarM1853e);
                                                throw th6;
                                            } catch (Throwable th7) {
                                                th = th7;
                                                th2 = th;
                                                workDatabase2.m1827o();
                                                throw th2;
                                            }
                                        }
                                    } catch (Throwable th8) {
                                        th = th8;
                                    }
                                } catch (Throwable th9) {
                                    th = th9;
                                }
                            } catch (Throwable th10) {
                                cursorM409e.close();
                                apyVarM1841a.m1850j();
                                throw th10;
                            }
                        } catch (SQLiteAccessPermException | SQLiteCantOpenDatabaseException | SQLiteConstraintException | SQLiteDatabaseCorruptException | SQLiteDatabaseLockedException | SQLiteDiskIOException | SQLiteTableLockedException e9) {
                            e = e9;
                            r8 = r5;
                        }
                    } catch (SQLiteAccessPermException e10) {
                        e = e10;
                    } catch (SQLiteCantOpenDatabaseException e11) {
                        e = e11;
                    } catch (SQLiteConstraintException e12) {
                        e = e12;
                    } catch (SQLiteDatabaseCorruptException e13) {
                        e = e13;
                    } catch (SQLiteDatabaseLockedException e14) {
                        e = e14;
                    } catch (SQLiteDiskIOException e15) {
                        e = e15;
                    } catch (SQLiteTableLockedException e16) {
                        e = e16;
                    }
                    r5 = r7;
                } catch (SQLiteException e17) {
                    ayc.m2099a();
                    Log.e(f3011b, "Unexpected SQLite exception during migrations");
                    throw new IllegalStateException("Unexpected SQLite exception during migrations", e17);
                }
            }
            azpVar = this.f3013d;
            azpVar.m2126f();
        } catch (Throwable th11) {
            this.f3013d.m2126f();
            throw th11;
        }
    }
}
