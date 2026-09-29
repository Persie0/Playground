package p000;

import com.lingq.core.domain.model.notification.InAppNotificationType;

/* JADX INFO: loaded from: classes3.dex */
public abstract class vfd {
    /* JADX INFO: renamed from: a */
    public static final int m23266a(InAppNotificationType inAppNotificationType) {
        inAppNotificationType.getClass();
        int i = i24.f43381a[inAppNotificationType.ordinal()];
        return (i == 1 || i == 2 || i == 3 || i == 4 || i == 5) ? 5 : -1;
    }
}
