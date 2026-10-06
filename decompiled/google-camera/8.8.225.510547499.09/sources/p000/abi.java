package p000;

import android.app.Notification;
import android.app.PendingIntent;
import android.graphics.drawable.Icon;
import android.view.MotionEvent;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class abi {
    /* JADX INFO: renamed from: a */
    public static Notification.Action.Builder m109a(Icon icon, CharSequence charSequence, PendingIntent pendingIntent) {
        return new Notification.Action.Builder(icon, charSequence, pendingIntent);
    }

    /* JADX INFO: renamed from: b */
    static Notification.Builder m110b(Notification.Builder builder, Object obj) {
        return builder.setSmallIcon((Icon) obj);
    }

    /* JADX INFO: renamed from: c */
    public static boolean m111c(MotionEvent motionEvent, int i) {
        return (motionEvent.getSource() & i) == i;
    }
}
