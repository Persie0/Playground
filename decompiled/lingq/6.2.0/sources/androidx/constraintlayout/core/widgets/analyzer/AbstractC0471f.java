package androidx.constraintlayout.core.widgets.analyzer;

/* JADX INFO: renamed from: androidx.constraintlayout.core.widgets.analyzer.f */
/* JADX INFO: loaded from: classes2.dex */
public abstract /* synthetic */ class AbstractC0471f {

    /* JADX INFO: renamed from: a */
    public static final /* synthetic */ int[] f5347a;

    static {
        int[] iArr = new int[WidgetRun$RunType.values().length];
        f5347a = iArr;
        try {
            iArr[WidgetRun$RunType.START.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            f5347a[WidgetRun$RunType.END.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            f5347a[WidgetRun$RunType.CENTER.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
    }
}
