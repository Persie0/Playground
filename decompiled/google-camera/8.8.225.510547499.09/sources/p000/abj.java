package p000;

import android.app.Notification;
import android.view.ViewGroup;
import android.widget.RemoteViews;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class abj {
    /* JADX INFO: renamed from: a */
    public static Notification.Action.Builder m112a(Notification.Action.Builder builder, boolean z) {
        return builder.setAllowGeneratedReplies(z);
    }

    /* JADX INFO: renamed from: b */
    static Notification.Builder m113b(Notification.Builder builder, RemoteViews remoteViews) {
        return builder.setCustomBigContentView(remoteViews);
    }

    /* JADX INFO: renamed from: c */
    static Notification.Builder m114c(Notification.Builder builder, RemoteViews remoteViews) {
        return builder.setCustomContentView(remoteViews);
    }

    /* JADX INFO: renamed from: d */
    static Notification.Builder m115d(Notification.Builder builder, RemoteViews remoteViews) {
        return builder.setCustomHeadsUpContentView(remoteViews);
    }

    /* JADX INFO: renamed from: e */
    public static Notification.Builder m116e(Notification.Builder builder, CharSequence[] charSequenceArr) {
        return builder.setRemoteInputHistory(charSequenceArr);
    }

    /* JADX INFO: renamed from: f */
    public static final opa m117f(ViewGroup viewGroup) {
        viewGroup.getClass();
        return ooc.m18743i(new afu(viewGroup, null));
    }
}
