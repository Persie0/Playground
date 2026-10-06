package p000;

import android.app.AlarmManager;
import android.app.PendingIntent;
import android.content.Context;
import androidx.work.impl.WorkDatabase;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class azw {

    /* JADX INFO: renamed from: a */
    public static final /* synthetic */ int f2824a = 0;

    static {
        ayc.m2100b("Alarms");
    }

    /* JADX INFO: renamed from: a */
    public static void m2142a(Context context, bcj bcjVar, int i) {
        AlarmManager alarmManager = (AlarmManager) context.getSystemService("alarm");
        PendingIntent service = PendingIntent.getService(context, i, azx.m2146c(context, bcjVar), 603979776);
        if (service == null || alarmManager == null) {
            return;
        }
        ayc.m2099a();
        StringBuilder sb = new StringBuilder();
        sb.append("Cancelling existing alarm with (workSpecId, systemId) (");
        sb.append(bcjVar);
        sb.append(", ");
        sb.append(i);
        sb.append(")");
        alarmManager.cancel(service);
    }

    /* JADX INFO: renamed from: b */
    public static void m2143b(Context context, WorkDatabase workDatabase, bcj bcjVar, long j) {
        bce bceVarMo1704y = workDatabase.mo1704y();
        bcd bcdVarM2124b = azo.m2124b(bceVarMo1704y, bcjVar);
        if (bcdVarM2124b != null) {
            m2142a(context, bcjVar, bcdVarM2124b.f2941c);
            m2144c(context, bcjVar, bcdVarM2124b.f2941c, j);
            return;
        }
        bkn bknVar = new bkn(workDatabase, (byte[]) null);
        Object objM1819d = ((apt) bknVar.f3651a).m1819d(new bdv(bknVar, 0, null, null));
        objM1819d.getClass();
        int iIntValue = ((Number) objM1819d).intValue();
        bceVarMo1704y.mo2193a(azv.m2141b(bcjVar, iIntValue));
        m2144c(context, bcjVar, iIntValue, j);
    }

    /* JADX INFO: renamed from: c */
    private static void m2144c(Context context, bcj bcjVar, int i, long j) {
        AlarmManager alarmManager = (AlarmManager) context.getSystemService("alarm");
        PendingIntent service = PendingIntent.getService(context, i, azx.m2146c(context, bcjVar), 201326592);
        if (alarmManager != null) {
            azv.m2140a(alarmManager, 0, j, service);
        }
    }
}
