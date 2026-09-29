package p000;

import androidx.glance.appwidget.action.ActionTrampolineType;

/* JADX INFO: renamed from: i6 */
/* JADX INFO: loaded from: classes2.dex */
public abstract /* synthetic */ class AbstractC3101i6 {

    /* JADX INFO: renamed from: a */
    public static final /* synthetic */ int[] f43561a;

    static {
        int[] iArr = new int[ActionTrampolineType.values().length];
        try {
            iArr[ActionTrampolineType.ACTIVITY.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[ActionTrampolineType.BROADCAST.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[ActionTrampolineType.CALLBACK.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[ActionTrampolineType.SERVICE.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr[ActionTrampolineType.FOREGROUND_SERVICE.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
        f43561a = iArr;
    }
}
