package p000;

import android.app.AlarmManager;
import android.app.PendingIntent;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class azv {
    /* JADX INFO: renamed from: a */
    static void m2140a(AlarmManager alarmManager, int i, long j, PendingIntent pendingIntent) {
        alarmManager.setExact(i, j, pendingIntent);
    }

    /* JADX INFO: renamed from: b */
    public static final bcd m2141b(bcj bcjVar, int i) {
        return new bcd(bcjVar.f2946a, bcjVar.f2947b, i);
    }
}
