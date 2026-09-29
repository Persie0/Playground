package androidx.compose.p002ui.text.input;

/* JADX INFO: renamed from: androidx.compose.ui.text.input.d */
/* JADX INFO: loaded from: classes.dex */
public abstract /* synthetic */ class AbstractC0438d {

    /* JADX INFO: renamed from: a */
    public static final /* synthetic */ int[] f5089a;

    static {
        int[] iArr = new int[TextInputServiceAndroid$TextInputCommand.values().length];
        try {
            iArr[TextInputServiceAndroid$TextInputCommand.StartInput.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[TextInputServiceAndroid$TextInputCommand.StopInput.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[TextInputServiceAndroid$TextInputCommand.ShowKeyboard.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[TextInputServiceAndroid$TextInputCommand.HideKeyboard.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        f5089a = iArr;
    }
}
