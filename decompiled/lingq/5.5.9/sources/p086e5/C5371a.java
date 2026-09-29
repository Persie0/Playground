package p086e5;

import android.app.AlarmManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.background.systemalarm.C1250a;
import androidx.work.impl.background.systemalarm.SystemAlarmService;
import dm.C5207g;
import p026b5.AbstractC1314g;
import p214k5.C6607i;
import p214k5.C6610l;
import p214k5.InterfaceC6608j;
import p235l5.CallableC7262i;
import p290o6.C7967l0;

/* JADX INFO: renamed from: e5.a */
/* JADX INFO: loaded from: classes.dex */
public final class C5371a {

    /* JADX INFO: renamed from: a */
    public static final String f33746a = AbstractC1314g.m4868f("Alarms");

    /* JADX INFO: renamed from: e5.a$a */
    public static class a {
        /* JADX INFO: renamed from: a */
        public static void m11543a(AlarmManager alarmManager, int i10, long j10, PendingIntent pendingIntent) {
            alarmManager.setExact(i10, j10, pendingIntent);
        }
    }

    /* JADX INFO: renamed from: a */
    public static void m11541a(Context context, C6610l c6610l, int i10) {
        AlarmManager alarmManager = (AlarmManager) context.getSystemService("alarm");
        String str = C1250a.f7852e;
        Intent intent = new Intent(context, (Class<?>) SystemAlarmService.class);
        intent.setAction("ACTION_DELAY_MET");
        C1250a.m4728c(intent, c6610l);
        PendingIntent service = PendingIntent.getService(context, i10, intent, 603979776);
        if (service == null || alarmManager == null) {
            return;
        }
        AbstractC1314g.m4867d().mo4869a(f33746a, "Cancelling existing alarm with (workSpecId, systemId) (" + c6610l + ", " + i10 + ")");
        alarmManager.cancel(service);
    }

    /* JADX INFO: renamed from: b */
    public static void m11542b(Context context, WorkDatabase workDatabase, C6610l c6610l, long j10) {
        InterfaceC6608j interfaceC6608jMo4715w = workDatabase.mo4715w();
        C6607i c6607iMo13209a = interfaceC6608jMo4715w.mo13209a(c6610l);
        int i10 = 0;
        if (c6607iMo13209a != null) {
            int i11 = c6607iMo13209a.f37509c;
            m11541a(context, c6610l, i11);
            AlarmManager alarmManager = (AlarmManager) context.getSystemService("alarm");
            String str = C1250a.f7852e;
            Intent intent = new Intent(context, (Class<?>) SystemAlarmService.class);
            intent.setAction("ACTION_DELAY_MET");
            C1250a.m4728c(intent, c6610l);
            PendingIntent service = PendingIntent.getService(context, i11, intent, 201326592);
            if (alarmManager != null) {
                a.m11543a(alarmManager, 0, j10, service);
            }
        } else {
            C7967l0 c7967l0 = new C7967l0(workDatabase);
            Object objM4567r = ((WorkDatabase) c7967l0.f43382a).m4567r(new CallableC7262i(i10, c7967l0));
            C5207g.m11110e(objM4567r, "workDatabase.runInTransa…ANAGER_ID_KEY)\n        })");
            int iIntValue = ((Number) objM4567r).intValue();
            interfaceC6608jMo4715w.mo13212d(new C6607i(c6610l.f37514a, c6610l.f37515b, iIntValue));
            AlarmManager alarmManager2 = (AlarmManager) context.getSystemService("alarm");
            String str2 = C1250a.f7852e;
            Intent intent2 = new Intent(context, (Class<?>) SystemAlarmService.class);
            intent2.setAction("ACTION_DELAY_MET");
            C1250a.m4728c(intent2, c6610l);
            PendingIntent service2 = PendingIntent.getService(context, iIntValue, intent2, 201326592);
            if (alarmManager2 != null) {
                a.m11543a(alarmManager2, 0, j10, service2);
            }
        }
    }
}
