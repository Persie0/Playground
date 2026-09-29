package p000;

import com.amplitude.android.utilities.ActivityCallbackType;

/* JADX INFO: renamed from: ti */
/* JADX INFO: loaded from: classes.dex */
public abstract /* synthetic */ class AbstractC3612ti {

    /* JADX INFO: renamed from: a */
    public static final /* synthetic */ int[] f62333a;

    static {
        int[] iArr = new int[ActivityCallbackType.values().length];
        try {
            iArr[ActivityCallbackType.Created.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[ActivityCallbackType.Started.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[ActivityCallbackType.Resumed.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[ActivityCallbackType.Paused.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr[ActivityCallbackType.Stopped.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            iArr[ActivityCallbackType.Destroyed.ordinal()] = 6;
        } catch (NoSuchFieldError unused6) {
        }
        f62333a = iArr;
    }
}
