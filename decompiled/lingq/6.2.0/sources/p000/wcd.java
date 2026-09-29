package p000;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.util.Log;
import java.util.TimeZone;
import org.joda.time.DateTimeZone;
import org.joda.time.JodaTimePermission;

/* JADX INFO: loaded from: classes.dex */
public final class wcd extends BroadcastReceiver {

    /* JADX INFO: renamed from: b */
    public static volatile gw9 f66630b;

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f66631a;

    public /* synthetic */ wcd(int i) {
        this.f66631a = i;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        switch (this.f66631a) {
            case 0:
                String stringExtra = intent.getStringExtra("com.google.android.gms.phenotype.PACKAGE_NAME");
                if (stringExtra == null) {
                    return;
                }
                if (stringExtra.contains("../") || stringExtra.contains("/..")) {
                    StringBuilder sb = new StringBuilder(stringExtra.length() + 68);
                    sb.append("Got an invalid config package for P/H that includes '..': ");
                    sb.append(stringExtra);
                    sb.append(". Exiting.");
                    Log.w("PhUpdateBroadcastRecv", sb.toString());
                    return;
                }
                gw9 gw9Var = f66630b;
                if (gw9Var == null) {
                    Log.w("PhUpdateBroadcastRecv", "No callback registered for P/H UPDATE broadcast. Exiting.");
                    return;
                }
                x7d x7dVar = (x7d) ((li1) gw9Var.f41432b).f49695a.get(stringExtra);
                if (x7dVar != null) {
                    x7dVar.f67910a.m21919b();
                    return;
                }
                return;
            default:
                String stringExtra2 = intent.getStringExtra("time-zone");
                try {
                    DateTimeZone dateTimeZoneM18339e = DateTimeZone.m18339e(TimeZone.getDefault());
                    SecurityManager securityManager = System.getSecurityManager();
                    if (securityManager != null) {
                        securityManager.checkPermission(new JodaTimePermission("DateTimeZone.setDefault"));
                    }
                    if (dateTimeZoneM18339e == null) {
                        throw new IllegalArgumentException("The datetime zone must not be null");
                    }
                    DateTimeZone.f54832d.set(dateTimeZoneM18339e);
                    Log.d("joda-time-android", "TIMEZONE_CHANGED received, changed default timezone to \"" + stringExtra2 + "\"");
                    return;
                } catch (IllegalArgumentException e) {
                    Log.e("joda-time-android", "Could not recognize timezone id \"" + stringExtra2 + "\"", e);
                    return;
                }
        }
    }
}
