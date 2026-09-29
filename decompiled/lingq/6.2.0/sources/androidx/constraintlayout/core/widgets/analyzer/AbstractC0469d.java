package androidx.constraintlayout.core.widgets.analyzer;

/* JADX INFO: renamed from: androidx.constraintlayout.core.widgets.analyzer.d */
/* JADX INFO: loaded from: classes2.dex */
public abstract /* synthetic */ class AbstractC0469d {

    /* JADX INFO: renamed from: a */
    public static final /* synthetic */ int[] f5345a;

    static {
        int[] iArr = new int[WidgetRun$RunType.values().length];
        f5345a = iArr;
        try {
            iArr[WidgetRun$RunType.START.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            f5345a[WidgetRun$RunType.END.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            f5345a[WidgetRun$RunType.CENTER.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
    }
}
