package p000;

import android.app.ActivityManager;
import android.app.AlarmManager;
import android.app.ApplicationExitInfo;
import android.app.PendingIntent;
import android.app.job.JobInfo;
import android.app.job.JobScheduler;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.database.sqlite.SQLiteAccessPermException;
import android.database.sqlite.SQLiteCantOpenDatabaseException;
import android.database.sqlite.SQLiteConstraintException;
import android.database.sqlite.SQLiteDatabaseCorruptException;
import android.database.sqlite.SQLiteDatabaseLockedException;
import android.database.sqlite.SQLiteDiskIOException;
import android.database.sqlite.SQLiteException;
import android.database.sqlite.SQLiteFullException;
import android.database.sqlite.SQLiteTableLockedException;
import android.os.Build;
import android.text.TextUtils;
import android.util.Log;
import androidx.room.util.AbstractC0758a;
import androidx.work.WorkInfo$State;
import androidx.work.impl.C0773b;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.utils.ForceStopRunnable$BroadcastReceiver;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class fc3 implements Runnable {

    /* JADX INFO: renamed from: e */
    public static final String f38838e = oj5.m18041h("ForceStopRunnable");

    /* JADX INFO: renamed from: f */
    public static final long f38839f = 315360000000L;

    /* JADX INFO: renamed from: a */
    public final Context f38840a;

    /* JADX INFO: renamed from: b */
    public final C0773b f38841b;

    /* JADX INFO: renamed from: c */
    public final cc4 f38842c;

    /* JADX INFO: renamed from: d */
    public int f38843d = 0;

    public fc3(Context context, C0773b c0773b) {
        this.f38840a = context.getApplicationContext();
        this.f38841b = c0773b;
        this.f38842c = c0773b.f7210g;
    }

    /* JADX INFO: renamed from: c */
    public static void m11765c(Context context) {
        AlarmManager alarmManager = (AlarmManager) context.getSystemService("alarm");
        int i = Build.VERSION.SDK_INT >= 31 ? 167772160 : 134217728;
        Intent intent = new Intent();
        intent.setComponent(new ComponentName(context, (Class<?>) ForceStopRunnable$BroadcastReceiver.class));
        intent.setAction("ACTION_FORCE_STOP_RESCHEDULE");
        PendingIntent broadcast = PendingIntent.getBroadcast(context, -1, intent, i);
        long jCurrentTimeMillis = System.currentTimeMillis() + f38839f;
        if (alarmManager != null) {
            alarmManager.setExact(0, jCurrentTimeMillis, broadcast);
        }
    }

    /* JADX WARN: Code duplicated, block: B:124:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:95:0x01f4  */
    /* JADX INFO: renamed from: a */
    public final void m11766a() {
        boolean z;
        cc4 cc4Var = this.f38842c;
        C0773b c0773b = this.f38841b;
        WorkDatabase workDatabase = c0773b.f7206c;
        hh1 hh1Var = c0773b.f7205b;
        cc4 cc4Var2 = c0773b.f7210g;
        WorkDatabase workDatabase2 = c0773b.f7206c;
        String str = xp9.f68501f;
        Context context = this.f38840a;
        JobScheduler jobSchedulerM17403a = ne4.m17403a(context);
        ArrayList<JobInfo> arrayListM24632b = xp9.m24632b(context, jobSchedulerM17403a);
        List list = (List) AbstractC0758a.m2859b(workDatabase.mo2906w().f61206a, true, false, new wx8(4));
        HashSet hashSet = new HashSet(arrayListM24632b != null ? arrayListM24632b.size() : 0);
        if (arrayListM24632b != null && !arrayListM24632b.isEmpty()) {
            for (JobInfo jobInfo : arrayListM24632b) {
                a8b a8bVarM24633f = xp9.m24633f(jobInfo);
                if (a8bVarM24633f != null) {
                    hashSet.add(a8bVarM24633f.m181b());
                } else {
                    xp9.m24631a(jobSchedulerM17403a, jobInfo.getId());
                }
            }
        }
        Iterator it = list.iterator();
        while (true) {
            if (it.hasNext()) {
                if (!hashSet.contains((String) it.next())) {
                    oj5.m18040f().m18042a(xp9.f68501f, "Reconciling jobs");
                    z = true;
                    break;
                }
            } else {
                z = false;
                break;
            }
        }
        if (z) {
            workDatabase.m2830c();
            try {
                u8b u8bVarMo2909z = workDatabase.mo2909z();
                Iterator it2 = list.iterator();
                while (it2.hasNext()) {
                    u8bVarMo2909z.m22571g((String) it2.next(), -1L);
                }
                workDatabase.m2846s();
                workDatabase.m2835h();
            } catch (Throwable th) {
                workDatabase.m2835h();
                throw th;
            }
        }
        u8b u8bVarMo2909z2 = workDatabase2.mo2909z();
        h8b h8bVarMo2908y = workDatabase2.mo2908y();
        workDatabase2.m2830c();
        try {
            List<p8b> list2 = (List) AbstractC0758a.m2859b(u8bVarMo2909z2.f63598a, true, false, new foa(14));
            boolean z2 = (list2 == null || list2.isEmpty()) ? false : true;
            if (z2) {
                for (p8b p8bVar : list2) {
                    WorkInfo$State workInfo$State = WorkInfo$State.ENQUEUED;
                    String str2 = p8bVar.f55772a;
                    u8bVarMo2909z2.m22574j(workInfo$State, str2);
                    u8bVarMo2909z2.m22575k(-512, str2);
                    u8bVarMo2909z2.m22571g(str2, -1L);
                }
            }
            AbstractC0758a.m2859b(h8bVarMo2908y.f42000a, false, true, new foa(13));
            workDatabase2.m2846s();
            workDatabase2.m2835h();
            boolean z3 = z2 || z;
            Long lM20666a = ((WorkDatabase) cc4Var2.f9881a).mo2905v().m20666a("reschedule_needed");
            int i = 10;
            String str3 = f38838e;
            if (lM20666a != null && lM20666a.longValue() == 1) {
                oj5.m18040f().m18042a(str3, "Rescheduling Workers.");
                c0773b.m2915f();
                cc4Var2.getClass();
                qi7 qi7Var = new qi7("reschedule_needed", 0L);
                ri7 ri7VarMo2905v = ((WorkDatabase) cc4Var2.f9881a).mo2905v();
                AbstractC0758a.m2859b(ri7VarMo2905v.f59365a, false, true, new ui5(i, ri7VarMo2905v, qi7Var));
                return;
            }
            try {
                int i2 = Build.VERSION.SDK_INT;
                int i3 = i2 >= 31 ? 570425344 : 536870912;
                Intent intent = new Intent();
                intent.setComponent(new ComponentName(context, (Class<?>) ForceStopRunnable$BroadcastReceiver.class));
                intent.setAction("ACTION_FORCE_STOP_RESCHEDULE");
                PendingIntent broadcast = PendingIntent.getBroadcast(context, -1, intent, i3);
                if (i2 < 30) {
                    if (broadcast == null) {
                        m11765c(context);
                        oj5.m18040f().m18042a(str3, "Application was force-stopped, rescheduling.");
                        c0773b.m2915f();
                        hh1Var.f42350d.getClass();
                        long jCurrentTimeMillis = System.currentTimeMillis();
                        cc4Var.getClass();
                        qi7 qi7Var2 = new qi7("last_force_stop_ms", Long.valueOf(jCurrentTimeMillis));
                        ri7 ri7VarMo2905v2 = ((WorkDatabase) cc4Var.f9881a).mo2905v();
                        AbstractC0758a.m2859b(ri7VarMo2905v2.f59365a, false, true, new ui5(i, ri7VarMo2905v2, qi7Var2));
                        return;
                    }
                    if (z3) {
                        oj5.m18040f().m18042a(str3, "Found unfinished work, scheduling it.");
                        um8.m22795b(hh1Var, workDatabase2, c0773b.f7208e);
                    }
                }
                if (broadcast != null) {
                    broadcast.cancel();
                }
                List historicalProcessExitReasons = ((ActivityManager) context.getSystemService("activity")).getHistoricalProcessExitReasons(null, 0, 0);
                if (historicalProcessExitReasons != null && !historicalProcessExitReasons.isEmpty()) {
                    Long lM20666a2 = ((WorkDatabase) cc4Var.f9881a).mo2905v().m20666a("last_force_stop_ms");
                    long jLongValue = lM20666a2 != null ? lM20666a2.longValue() : 0L;
                    for (int i4 = 0; i4 < historicalProcessExitReasons.size(); i4++) {
                        ApplicationExitInfo applicationExitInfoM21020d = AbstractC3559s3.m21020d(historicalProcessExitReasons.get(i4));
                        if (applicationExitInfoM21020d.getReason() == 10 && applicationExitInfoM21020d.getTimestamp() >= jLongValue) {
                            oj5.m18040f().m18042a(str3, "Application was force-stopped, rescheduling.");
                            c0773b.m2915f();
                            hh1Var.f42350d.getClass();
                            long jCurrentTimeMillis2 = System.currentTimeMillis();
                            cc4Var.getClass();
                            qi7 qi7Var3 = new qi7("last_force_stop_ms", Long.valueOf(jCurrentTimeMillis2));
                            ri7 ri7VarMo2905v3 = ((WorkDatabase) cc4Var.f9881a).mo2905v();
                            AbstractC0758a.m2859b(ri7VarMo2905v3.f59365a, false, true, new ui5(i, ri7VarMo2905v3, qi7Var3));
                            return;
                        }
                    }
                }
                if (z3) {
                    oj5.m18040f().m18042a(str3, "Found unfinished work, scheduling it.");
                    um8.m22795b(hh1Var, workDatabase2, c0773b.f7208e);
                }
            } catch (IllegalArgumentException | SecurityException e) {
                if (oj5.m18040f().f54464a <= 5) {
                    Log.w(str3, "Ignoring exception", e);
                }
            }
        } catch (Throwable th2) {
            workDatabase2.m2835h();
            throw th2;
        }
    }

    /* JADX INFO: renamed from: b */
    public final boolean m11767b() {
        hh1 hh1Var = this.f38841b.f7205b;
        hh1Var.getClass();
        boolean zIsEmpty = TextUtils.isEmpty(null);
        String str = f38838e;
        if (zIsEmpty) {
            oj5.m18040f().m18042a(str, "The default process name was not specified.");
            return true;
        }
        boolean zM12735a = gl7.m12735a(this.f38840a, hh1Var);
        oj5.m18040f().m18042a(str, "Is default app process = " + zM12735a);
        return zM12735a;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Context context = this.f38840a;
        String str = f38838e;
        C0773b c0773b = this.f38841b;
        try {
            if (!m11767b()) {
                c0773b.m2914e();
                return;
            }
            while (true) {
                try {
                    afa.m353c(context);
                    oj5.m18040f().m18042a(str, "Performing cleanup operations.");
                    try {
                        m11766a();
                        c0773b.m2914e();
                        return;
                    } catch (SQLiteAccessPermException | SQLiteCantOpenDatabaseException | SQLiteConstraintException | SQLiteDatabaseCorruptException | SQLiteDatabaseLockedException | SQLiteDiskIOException | SQLiteFullException | SQLiteTableLockedException e) {
                        int i = this.f38843d + 1;
                        this.f38843d = i;
                        if (i >= 3) {
                            String str2 = bma.m3879a(context) ? "The file system on the device is in a bad state. WorkManager cannot access the app's internal data store." : "WorkManager can't be accessed from direct boot, because credential encrypted storage isn't accessible.\nDon't access or initialise WorkManager from directAware components. See https://developer.android.com/training/articles/direct-boot";
                            oj5.m18040f().m18044e(str, str2, e);
                            IllegalStateException illegalStateException = new IllegalStateException(str2, e);
                            c0773b.f7205b.getClass();
                            throw illegalStateException;
                        }
                        long j = ((long) i) * 300;
                        String str3 = "Retrying after " + j;
                        if (oj5.m18040f().f54464a <= 3) {
                            Log.d(str, str3, e);
                        }
                        try {
                            Thread.sleep(((long) this.f38843d) * 300);
                        } catch (InterruptedException unused) {
                        }
                    }
                } catch (SQLiteException e2) {
                    oj5.m18040f().m18043c(str, "Unexpected SQLite exception during migrations");
                    IllegalStateException illegalStateException2 = new IllegalStateException("Unexpected SQLite exception during migrations", e2);
                    c0773b.f7205b.getClass();
                    throw illegalStateException2;
                }
            }
        } catch (Throwable th) {
            c0773b.m2914e();
            throw th;
        }
    }
}
