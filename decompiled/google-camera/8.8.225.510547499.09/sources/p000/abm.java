package p000;

import android.app.Notification;
import android.content.LocusId;
import android.graphics.drawable.Drawable;
import android.view.ActionMode;
import android.widget.TextView;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class abm {
    /* JADX INFO: renamed from: a */
    public static Notification.Action.Builder m134a(Notification.Action.Builder builder, boolean z) {
        return builder.setContextual(z);
    }

    /* JADX INFO: renamed from: b */
    public static Notification.Builder m135b(Notification.Builder builder, boolean z) {
        return builder.setAllowSystemGeneratedContextualActions(z);
    }

    /* JADX INFO: renamed from: c */
    public static Notification.Builder m136c(Notification.Builder builder, Notification.BubbleMetadata bubbleMetadata) {
        return builder.setBubbleMetadata(bubbleMetadata);
    }

    /* JADX INFO: renamed from: d */
    static Notification.Builder m137d(Notification.Builder builder, Object obj) {
        return builder.setLocusId((LocusId) obj);
    }

    /* JADX INFO: renamed from: e */
    public static void m138e(TextView textView, int i) {
        abf.m89b(i);
        int fontMetricsInt = textView.getPaint().getFontMetricsInt(null);
        if (i != fontMetricsInt) {
            textView.setLineSpacing(i - fontMetricsInt, 1.0f);
        }
    }

    /* JADX INFO: renamed from: f */
    public static void m139f(TextView textView, Drawable drawable, Drawable drawable2, Drawable drawable3) {
        ahr.m691d(textView, drawable, drawable2, drawable3, null);
    }

    /* JADX INFO: renamed from: g */
    public static void m140g(ActionMode.Callback callback) {
        if (callback instanceof ahu) {
            throw null;
        }
    }
}
