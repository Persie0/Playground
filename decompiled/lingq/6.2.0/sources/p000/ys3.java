package p000;

import com.lingq.core.domain.model.theme.TextHighlightStyle;

/* JADX INFO: loaded from: classes2.dex */
public abstract /* synthetic */ class ys3 {

    /* JADX INFO: renamed from: a */
    public static final /* synthetic */ int[] f70368a;

    static {
        int[] iArr = new int[TextHighlightStyle.values().length];
        try {
            iArr[TextHighlightStyle.Default.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[TextHighlightStyle.ForegroundColor.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[TextHighlightStyle.Underlined.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[TextHighlightStyle.Off.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        f70368a = iArr;
    }
}
