package p000;

import android.app.Notification;
import android.app.PendingIntent;
import android.app.RemoteInput;
import android.os.Bundle;
import android.view.KeyEvent;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class abg {
    /* JADX INFO: renamed from: a */
    public static Notification.Action.Builder m92a(Notification.Action.Builder builder, Bundle bundle) {
        return builder.addExtras(bundle);
    }

    /* JADX INFO: renamed from: b */
    static Notification.Action.Builder m93b(Notification.Action.Builder builder, RemoteInput remoteInput) {
        return builder.addRemoteInput(remoteInput);
    }

    /* JADX INFO: renamed from: c */
    static Notification.Action.Builder m94c(int i, CharSequence charSequence, PendingIntent pendingIntent) {
        return new Notification.Action.Builder(i, charSequence, pendingIntent);
    }

    /* JADX INFO: renamed from: d */
    public static Notification.Action m95d(Notification.Action.Builder builder) {
        return builder.build();
    }

    /* JADX INFO: renamed from: e */
    public static Notification.Builder m96e(Notification.Builder builder, Notification.Action action) {
        return builder.addAction(action);
    }

    /* JADX INFO: renamed from: f */
    public static Notification.Builder m97f(Notification.Builder builder, String str) {
        return builder.setGroup(str);
    }

    /* JADX INFO: renamed from: g */
    public static Notification.Builder m98g(Notification.Builder builder, boolean z) {
        return builder.setGroupSummary(z);
    }

    /* JADX INFO: renamed from: h */
    public static Notification.Builder m99h(Notification.Builder builder, boolean z) {
        return builder.setLocalOnly(z);
    }

    /* JADX INFO: renamed from: i */
    public static Notification.Builder m100i(Notification.Builder builder, String str) {
        return builder.setSortKey(str);
    }

    /* JADX INFO: renamed from: j */
    static String m101j(Notification notification) {
        return notification.getGroup();
    }

    /* JADX INFO: renamed from: k */
    public static boolean m102k(aen aenVar, KeyEvent keyEvent) {
        if (aenVar == null) {
            return false;
        }
        return aenVar.mo354g(keyEvent);
    }
}
