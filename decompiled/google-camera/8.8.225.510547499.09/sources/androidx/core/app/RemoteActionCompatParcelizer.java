package androidx.core.app;

import android.app.PendingIntent;
import androidx.core.graphics.drawable.IconCompat;
import p000.att;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public class RemoteActionCompatParcelizer {
    public static RemoteActionCompat read(att attVar) {
        RemoteActionCompat remoteActionCompat = new RemoteActionCompat();
        remoteActionCompat.f1468a = (IconCompat) attVar.m2012t(remoteActionCompat.f1468a);
        remoteActionCompat.f1469b = attVar.m1996d(remoteActionCompat.f1469b, 2);
        remoteActionCompat.f1470c = attVar.m1996d(remoteActionCompat.f1470c, 3);
        remoteActionCompat.f1471d = (PendingIntent) attVar.m1994b(remoteActionCompat.f1471d, 4);
        remoteActionCompat.f1472e = attVar.m2004l(remoteActionCompat.f1472e, 5);
        remoteActionCompat.f1473f = attVar.m2004l(remoteActionCompat.f1473f, 6);
        return remoteActionCompat;
    }

    public static void write(RemoteActionCompat remoteActionCompat, att attVar) {
        attVar.m2013u(remoteActionCompat.f1468a);
        attVar.m1999g(remoteActionCompat.f1469b, 2);
        attVar.m1999g(remoteActionCompat.f1470c, 3);
        attVar.m2001i(remoteActionCompat.f1471d, 4);
        attVar.m1998f(remoteActionCompat.f1472e, 5);
        attVar.m1998f(remoteActionCompat.f1473f, 6);
    }
}
