package ro;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.util.Log;
import java.util.TimeZone;
import org.joda.time.DateTimeZone;
import org.joda.time.JodaTimePermission;

/* JADX INFO: renamed from: ro.c */
/* JADX INFO: loaded from: classes2.dex */
public final class C8894c extends BroadcastReceiver {
    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        String stringExtra = intent.getStringExtra("time-zone");
        try {
            DateTimeZone dateTimeZoneM16015d = DateTimeZone.m16015d(TimeZone.getDefault());
            SecurityManager securityManager = System.getSecurityManager();
            if (securityManager != null) {
                securityManager.checkPermission(new JodaTimePermission("DateTimeZone.setDefault"));
            }
            if (dateTimeZoneM16015d == null) {
                throw new IllegalArgumentException("The datetime zone must not be null");
            }
            DateTimeZone.f43952d.set(dateTimeZoneM16015d);
            Log.d("joda-time-android", "TIMEZONE_CHANGED received, changed default timezone to \"" + stringExtra + "\"");
        } catch (IllegalArgumentException e10) {
            Log.e("joda-time-android", "Could not recognize timezone id \"" + stringExtra + "\"", e10);
        }
    }
}
