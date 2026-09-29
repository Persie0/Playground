package androidx.work.impl.utils;

import android.annotation.SuppressLint;
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
import android.database.sqlite.SQLiteTableLockedException;
import android.os.Build;
import android.text.TextUtils;
import android.util.Log;
import androidx.work.C1243a;
import androidx.work.WorkInfo$State;
import androidx.work.impl.WorkDatabase;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;
import p026b5.AbstractC1314g;
import p041c5.C1699a0;
import p041c5.C1721s;
import p109f5.C5469b;
import p214k5.C6602d;
import p214k5.C6610l;
import p214k5.C6617s;
import p214k5.InterfaceC6615q;
import p214k5.InterfaceC6618t;
import p235l5.C7260g;
import p235l5.C7268o;
import p235l5.C7269p;
import p338qd.C8573r0;

/* JADX INFO: loaded from: classes.dex */
public final class ForceStopRunnable implements Runnable {

    /* JADX INFO: renamed from: e */
    public static final String f7913e = AbstractC1314g.m4868f("ForceStopRunnable");

    /* JADX INFO: renamed from: f */
    public static final long f7914f = TimeUnit.DAYS.toMillis(3650);

    /* JADX INFO: renamed from: a */
    public final Context f7915a;

    /* JADX INFO: renamed from: b */
    public final C1699a0 f7916b;

    /* JADX INFO: renamed from: c */
    public final C7268o f7917c;

    /* JADX INFO: renamed from: d */
    public int f7918d = 0;

    public static class BroadcastReceiver extends android.content.BroadcastReceiver {

        /* JADX INFO: renamed from: a */
        public static final String f7919a = AbstractC1314g.m4868f("ForceStopRunnable$Rcvr");

        @Override // android.content.BroadcastReceiver
        public final void onReceive(Context context, Intent intent) {
            if (intent != null && "ACTION_FORCE_STOP_RESCHEDULE".equals(intent.getAction())) {
                if (((AbstractC1314g.a) AbstractC1314g.m4867d()).f8062c <= 2) {
                    Log.v(f7919a, "Rescheduling alarm that keeps track of force-stops.");
                }
                ForceStopRunnable.m4751c(context);
            }
        }
    }

    public ForceStopRunnable(Context context, C1699a0 c1699a0) {
        this.f7915a = context.getApplicationContext();
        this.f7916b = c1699a0;
        this.f7917c = c1699a0.f9481g;
    }

    @SuppressLint({"ClassVerificationFailure"})
    /* JADX INFO: renamed from: c */
    public static void m4751c(Context context) {
        AlarmManager alarmManager = (AlarmManager) context.getSystemService("alarm");
        int i10 = Build.VERSION.SDK_INT >= 31 ? 167772160 : 134217728;
        Intent intent = new Intent();
        intent.setComponent(new ComponentName(context, (Class<?>) BroadcastReceiver.class));
        intent.setAction("ACTION_FORCE_STOP_RESCHEDULE");
        PendingIntent broadcast = PendingIntent.getBroadcast(context, -1, intent, i10);
        long jCurrentTimeMillis = System.currentTimeMillis() + f7914f;
        if (alarmManager != null) {
            alarmManager.setExact(0, jCurrentTimeMillis, broadcast);
        }
    }

    /* JADX INFO: renamed from: a */
    public final void m4752a() {
        boolean z10;
        boolean z11;
        C7268o c7268o = this.f7917c;
        String str = C5469b.f34052e;
        Context context = this.f7915a;
        JobScheduler jobScheduler = (JobScheduler) context.getSystemService("jobscheduler");
        ArrayList<JobInfo> arrayListM11709e = C5469b.m11709e(context, jobScheduler);
        C1699a0 c1699a0 = this.f7916b;
        ArrayList arrayListMo13210b = c1699a0.f9477c.mo4715w().mo13210b();
        HashSet hashSet = new HashSet(arrayListM11709e != null ? arrayListM11709e.size() : 0);
        if (arrayListM11709e != null && !arrayListM11709e.isEmpty()) {
            for (JobInfo jobInfo : arrayListM11709e) {
                C6610l c6610lM11710f = C5469b.m11710f(jobInfo);
                if (c6610lM11710f != null) {
                    hashSet.add(c6610lM11710f.f37514a);
                } else {
                    C5469b.m11708d(jobInfo.getId(), jobScheduler);
                }
            }
        }
        Iterator it = arrayListMo13210b.iterator();
        while (true) {
            if (it.hasNext()) {
                if (!hashSet.contains((String) it.next())) {
                    AbstractC1314g.m4867d().mo4869a(C5469b.f34052e, "Reconciling jobs");
                    z10 = true;
                    break;
                }
            } else {
                z10 = false;
                break;
            }
        }
        if (z10) {
            WorkDatabase workDatabase = c1699a0.f9477c;
            workDatabase.m4552c();
            try {
                InterfaceC6618t interfaceC6618tMo4718z = workDatabase.mo4718z();
                Iterator it2 = arrayListMo13210b.iterator();
                while (it2.hasNext()) {
                    interfaceC6618tMo4718z.mo13226d((String) it2.next(), -1L);
                }
                workDatabase.m4568s();
                workDatabase.m4563n();
            } catch (Throwable th2) {
                workDatabase.m4563n();
                throw th2;
            }
        }
        WorkDatabase workDatabase2 = c1699a0.f9477c;
        InterfaceC6618t interfaceC6618tMo4718z2 = workDatabase2.mo4718z();
        InterfaceC6615q interfaceC6615qMo4717y = workDatabase2.mo4717y();
        workDatabase2.m4552c();
        try {
            ArrayList<C6617s> arrayListMo13233k = interfaceC6618tMo4718z2.mo13233k();
            boolean z12 = (arrayListMo13233k == null || arrayListMo13233k.isEmpty()) ? false : true;
            if (z12) {
                for (C6617s c6617s : arrayListMo13233k) {
                    interfaceC6618tMo4718z2.mo13230h(WorkInfo$State.ENQUEUED, c6617s.f37524a);
                    interfaceC6618tMo4718z2.mo13226d(c6617s.f37524a, -1L);
                }
            }
            interfaceC6615qMo4717y.mo13219b();
            workDatabase2.m4568s();
            workDatabase2.m4563n();
            boolean z13 = z12 || z10;
            Long lMo13207a = c1699a0.f9481g.f40758a.mo4714v().mo13207a("reschedule_needed");
            boolean z14 = lMo13207a != null && lMo13207a.longValue() == 1;
            String str2 = f7913e;
            if (z14) {
                AbstractC1314g.m4867d().mo4869a(str2, "Rescheduling Workers.");
                c1699a0.m5433g();
                C7268o c7268o2 = c1699a0.f9481g;
                c7268o2.getClass();
                c7268o2.f40758a.mo4714v().mo13208b(new C6602d("reschedule_needed", 0L));
                return;
            }
            try {
                int i10 = Build.VERSION.SDK_INT;
                int i11 = i10 >= 31 ? 570425344 : 536870912;
                Intent intent = new Intent();
                intent.setComponent(new ComponentName(context, (Class<?>) BroadcastReceiver.class));
                intent.setAction("ACTION_FORCE_STOP_RESCHEDULE");
                PendingIntent broadcast = PendingIntent.getBroadcast(context, -1, intent, i11);
                if (i10 >= 30) {
                    if (broadcast != null) {
                        broadcast.cancel();
                    }
                    List historicalProcessExitReasons = ((ActivityManager) context.getSystemService("activity")).getHistoricalProcessExitReasons(null, 0, 0);
                    if (historicalProcessExitReasons != null && !historicalProcessExitReasons.isEmpty()) {
                        Long lMo13207a2 = c7268o.f40758a.mo4714v().mo13207a("last_force_stop_ms");
                        long jLongValue = lMo13207a2 != null ? lMo13207a2.longValue() : 0L;
                        int i12 = 0;
                        while (true) {
                            if (i12 < historicalProcessExitReasons.size()) {
                                ApplicationExitInfo applicationExitInfoM14624c = C7260g.m14624c(historicalProcessExitReasons.get(i12));
                                if (applicationExitInfoM14624c.getReason() != 10 || applicationExitInfoM14624c.getTimestamp() < jLongValue) {
                                    i12++;
                                } else {
                                    z11 = true;
                                }
                            }
                        }
                    }
                    z11 = false;
                } else if (broadcast == null) {
                    m4751c(context);
                    z11 = true;
                } else {
                    z11 = false;
                }
            } catch (IllegalArgumentException | SecurityException e10) {
                if (((AbstractC1314g.a) AbstractC1314g.m4867d()).f8062c <= 5) {
                    Log.w(str2, "Ignoring exception", e10);
                }
            }
            if (!z11) {
                if (z13) {
                    AbstractC1314g.m4867d().mo4869a(str2, "Found unfinished work, scheduling it.");
                    C1721s.m5463a(c1699a0.f9476b, c1699a0.f9477c, c1699a0.f9479e);
                    return;
                }
                return;
            }
            AbstractC1314g.m4867d().mo4869a(str2, "Application was force-stopped, rescheduling.");
            c1699a0.m5433g();
            long jCurrentTimeMillis = System.currentTimeMillis();
            c7268o.getClass();
            c7268o.f40758a.mo4714v().mo13208b(new C6602d("last_force_stop_ms", Long.valueOf(jCurrentTimeMillis)));
        } catch (Throwable th3) {
            workDatabase2.m4563n();
            throw th3;
        }
    }

    /* JADX INFO: renamed from: b */
    public final boolean m4753b() {
        C1243a c1243a = this.f7916b.f9476b;
        c1243a.getClass();
        boolean zIsEmpty = TextUtils.isEmpty(null);
        String str = f7913e;
        if (zIsEmpty) {
            AbstractC1314g.m4867d().mo4869a(str, "The default process name was not specified.");
            return true;
        }
        boolean zM14659a = C7269p.m14659a(this.f7915a, c1243a);
        AbstractC1314g.m4867d().mo4869a(str, "Is default app process = " + zM14659a);
        return zM14659a;
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @Override // java.lang.Runnable
    public final void run() {
        String str = f7913e;
        C1699a0 c1699a0 = this.f7916b;
        try {
            if (!m4753b()) {
                c1699a0.m5432f();
                return;
            }
            while (true) {
                try {
                    C8573r0.m16678I0(this.f7915a);
                    AbstractC1314g.m4867d().mo4869a(str, "Performing cleanup operations.");
                    try {
                        m4752a();
                        c1699a0.m5432f();
                        return;
                    } catch (SQLiteAccessPermException | SQLiteCantOpenDatabaseException | SQLiteConstraintException | SQLiteDatabaseCorruptException | SQLiteDatabaseLockedException | SQLiteDiskIOException | SQLiteTableLockedException e10) {
                        int i10 = this.f7918d + 1;
                        this.f7918d = i10;
                        if (i10 >= 3) {
                            AbstractC1314g.m4867d().mo4871c(str, "The file system on the device is in a bad state. WorkManager cannot access the app's internal data store.", e10);
                            IllegalStateException illegalStateException = new IllegalStateException("The file system on the device is in a bad state. WorkManager cannot access the app's internal data store.", e10);
                            c1699a0.f9476b.getClass();
                            throw illegalStateException;
                        }
                        long j10 = ((long) i10) * 300;
                        String str2 = "Retrying after " + j10;
                        if (((AbstractC1314g.a) AbstractC1314g.m4867d()).f8062c <= 3) {
                            Log.d(str, str2, e10);
                        }
                        try {
                            Thread.sleep(((long) this.f7918d) * 300);
                        } catch (InterruptedException unused) {
                        }
                    }
                } catch (SQLiteException e11) {
                    AbstractC1314g.m4867d().mo4870b(str, "Unexpected SQLite exception during migrations");
                    IllegalStateException illegalStateException2 = new IllegalStateException("Unexpected SQLite exception during migrations", e11);
                    c1699a0.f9476b.getClass();
                    throw illegalStateException2;
                }
            }
        } catch (Throwable th2) {
            c1699a0.m5432f();
            throw th2;
        }
    }
}
