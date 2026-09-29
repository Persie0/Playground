package p025b4;

import android.app.PendingIntent;
import android.content.BroadcastReceiver;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.ResolveInfo;
import android.os.Build;
import android.util.Log;
import android.view.KeyEvent;
import java.util.List;

/* JADX INFO: renamed from: b4.a */
/* JADX INFO: loaded from: classes.dex */
public final class C1307a extends BroadcastReceiver {
    /* JADX INFO: renamed from: a */
    public static PendingIntent m4865a(Context context, long j10) {
        int i10;
        ComponentName componentNameM4866b = m4866b(context);
        if (componentNameM4866b == null) {
            Log.w("MediaButtonReceiver", "A unique media button receiver could not be found in the given context, so couldn't build a pending intent.");
            return null;
        }
        if (j10 == 4) {
            i10 = 126;
        } else if (j10 == 2) {
            i10 = 127;
        } else if (j10 == 32) {
            i10 = 87;
        } else if (j10 == 16) {
            i10 = 88;
        } else if (j10 == 1) {
            i10 = 86;
        } else if (j10 == 64) {
            i10 = 90;
        } else if (j10 == 8) {
            i10 = 89;
        } else {
            i10 = j10 == 512 ? 85 : 0;
        }
        if (i10 == 0) {
            Log.w("MediaButtonReceiver", "Cannot build a media button pending intent with the given action: " + j10);
            return null;
        }
        Intent intent = new Intent("android.intent.action.MEDIA_BUTTON");
        intent.setComponent(componentNameM4866b);
        intent.putExtra("android.intent.extra.KEY_EVENT", new KeyEvent(0, i10));
        int i11 = Build.VERSION.SDK_INT;
        intent.addFlags(268435456);
        return PendingIntent.getBroadcast(context, i10, intent, i11 >= 31 ? 33554432 : 0);
    }

    /* JADX INFO: renamed from: b */
    public static ComponentName m4866b(Context context) {
        Intent intent = new Intent("android.intent.action.MEDIA_BUTTON");
        intent.setPackage(context.getPackageName());
        List<ResolveInfo> listQueryBroadcastReceivers = context.getPackageManager().queryBroadcastReceivers(intent, 0);
        if (listQueryBroadcastReceivers.size() == 1) {
            ActivityInfo activityInfo = listQueryBroadcastReceivers.get(0).activityInfo;
            return new ComponentName(activityInfo.packageName, activityInfo.name);
        }
        if (listQueryBroadcastReceivers.size() > 1) {
            Log.w("MediaButtonReceiver", "More than one BroadcastReceiver that handles android.intent.action.MEDIA_BUTTON was found, returning null.");
        }
        return null;
    }
}
