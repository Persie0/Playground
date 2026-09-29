package androidx.compose.p002ui.contentcapture;

/* JADX INFO: renamed from: androidx.compose.ui.contentcapture.b */
/* JADX INFO: loaded from: classes2.dex */
public abstract /* synthetic */ class AbstractC0290b {

    /* JADX INFO: renamed from: a */
    public static final /* synthetic */ int[] f3827a;

    static {
        int[] iArr = new int[ContentCaptureEventType.values().length];
        try {
            iArr[ContentCaptureEventType.VIEW_APPEAR.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[ContentCaptureEventType.VIEW_DISAPPEAR.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        f3827a = iArr;
    }
}
