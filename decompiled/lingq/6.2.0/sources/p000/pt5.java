package p000;

import android.app.PendingIntent;
import android.content.BroadcastReceiver;
import android.content.ComponentName;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.ResolveInfo;
import android.os.Build;
import android.util.Log;
import android.view.KeyEvent;
import com.lingq.core.player.service.PlayerService;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public abstract class pt5 extends BroadcastReceiver {
    /* JADX INFO: renamed from: a */
    public static PendingIntent m19475a(PlayerService playerService, long j) {
        int i;
        ComponentName componentNameM19476b = m19476b(playerService);
        if (componentNameM19476b == null) {
            Log.w("MediaButtonReceiver", "A unique media button receiver could not be found in the given context, so couldn't build a pending intent.");
            return null;
        }
        if (j == 4) {
            i = 126;
        } else if (j == 2) {
            i = 127;
        } else if (j == 32) {
            i = 87;
        } else if (j == 16) {
            i = 88;
        } else if (j == 1) {
            i = 86;
        } else if (j == 64) {
            i = 90;
        } else if (j == 8) {
            i = 89;
        } else {
            i = j == 512 ? 85 : 0;
        }
        if (i == 0) {
            Log.w("MediaButtonReceiver", "Cannot build a media button pending intent with the given action: " + j);
            return null;
        }
        Intent intent = new Intent("android.intent.action.MEDIA_BUTTON");
        intent.setComponent(componentNameM19476b);
        intent.putExtra("android.intent.extra.KEY_EVENT", new KeyEvent(0, i));
        intent.addFlags(268435456);
        return PendingIntent.getBroadcast(playerService, i, intent, Build.VERSION.SDK_INT >= 31 ? 33554432 : 0);
    }

    /* JADX INFO: renamed from: b */
    public static ComponentName m19476b(PlayerService playerService) {
        Intent intent = new Intent("android.intent.action.MEDIA_BUTTON");
        intent.setPackage(playerService.getPackageName());
        List<ResolveInfo> listQueryBroadcastReceivers = playerService.getPackageManager().queryBroadcastReceivers(intent, 0);
        if (listQueryBroadcastReceivers.size() == 1) {
            ActivityInfo activityInfo = listQueryBroadcastReceivers.get(0).activityInfo;
            return new ComponentName(activityInfo.packageName, activityInfo.name);
        }
        if (listQueryBroadcastReceivers.size() <= 1) {
            return null;
        }
        Log.w("MediaButtonReceiver", "More than one BroadcastReceiver that handles android.intent.action.MEDIA_BUTTON was found, returning null.");
        return null;
    }
}
