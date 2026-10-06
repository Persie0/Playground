package p000;

import android.app.Activity;
import android.content.Intent;
import android.content.IntentSender;
import android.graphics.Shader;
import android.os.Bundle;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class aap {
    /* JADX INFO: renamed from: a */
    public static void m29a(Activity activity) {
        activity.finishAffinity();
    }

    /* JADX INFO: renamed from: b */
    public static void m30b(Activity activity, Intent intent, int i, Bundle bundle) {
        activity.startActivityForResult(intent, i, bundle);
    }

    /* JADX INFO: renamed from: c */
    public static void m31c(Activity activity, IntentSender intentSender, int i, Intent intent, int i2, int i3, int i4, Bundle bundle) throws IntentSender.SendIntentException {
        activity.startIntentSenderForResult(intentSender, i, intent, i2, i3, i4, bundle);
    }

    /* JADX INFO: renamed from: d */
    public static Shader.TileMode m32d(int i) {
        switch (i) {
            case 1:
                return Shader.TileMode.REPEAT;
            case 2:
                return Shader.TileMode.MIRROR;
            default:
                return Shader.TileMode.CLAMP;
        }
    }
}
