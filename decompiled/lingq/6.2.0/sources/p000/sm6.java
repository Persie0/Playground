package p000;

import android.app.Notification;
import android.graphics.drawable.Icon;

/* JADX INFO: loaded from: classes2.dex */
public abstract class sm6 {
    /* JADX INFO: renamed from: a */
    public static void m21474a(Notification.BigPictureStyle bigPictureStyle, Icon icon) {
        bigPictureStyle.bigPicture(icon);
    }

    /* JADX INFO: renamed from: b */
    public static void m21475b(Notification.BigPictureStyle bigPictureStyle, CharSequence charSequence) {
        bigPictureStyle.setContentDescription(charSequence);
    }

    /* JADX INFO: renamed from: c */
    public static void m21476c(Notification.BigPictureStyle bigPictureStyle, boolean z) {
        bigPictureStyle.showBigPictureWhenCollapsed(z);
    }
}
