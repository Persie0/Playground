package p000;

import com.lingq.core.domain.model.notification.InAppNotificationAction;

/* JADX INFO: loaded from: classes2.dex */
public abstract /* synthetic */ class si2 {

    /* JADX INFO: renamed from: a */
    public static final /* synthetic */ int[] f60888a;

    static {
        int[] iArr = new int[InAppNotificationAction.values().length];
        try {
            iArr[InAppNotificationAction.Yes.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[InAppNotificationAction.No.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[InAppNotificationAction.AdjustSettings.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[InAppNotificationAction.Reload.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr[InAppNotificationAction.Close.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            iArr[InAppNotificationAction.Understood.ordinal()] = 6;
        } catch (NoSuchFieldError unused6) {
        }
        f60888a = iArr;
    }
}
