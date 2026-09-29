package p000;

import com.facebook.appevents.p008ml.ModelManager$Task;

/* JADX INFO: loaded from: classes2.dex */
public abstract /* synthetic */ class v06 {

    /* JADX INFO: renamed from: a */
    public static final /* synthetic */ int[] f64659a;

    static {
        int[] iArr = new int[ModelManager$Task.values().length];
        try {
            iArr[ModelManager$Task.MTML_INTEGRITY_DETECT.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[ModelManager$Task.MTML_APP_EVENT_PREDICTION.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        f64659a = iArr;
    }
}
