package androidx.compose.p002ui.text;

/* JADX INFO: renamed from: androidx.compose.ui.text.c */
/* JADX INFO: loaded from: classes.dex */
public abstract /* synthetic */ class AbstractC0432c {

    /* JADX INFO: renamed from: a */
    public static final /* synthetic */ int[] f5042a;

    static {
        int[] iArr = new int[AnnotationType.values().length];
        try {
            iArr[AnnotationType.Paragraph.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[AnnotationType.Span.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[AnnotationType.VerbatimTts.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[AnnotationType.Url.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr[AnnotationType.Link.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            iArr[AnnotationType.Clickable.ordinal()] = 6;
        } catch (NoSuchFieldError unused6) {
        }
        try {
            iArr[AnnotationType.String.ordinal()] = 7;
        } catch (NoSuchFieldError unused7) {
        }
        f5042a = iArr;
    }
}
