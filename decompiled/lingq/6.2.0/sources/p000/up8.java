package p000;

import com.lingq.feature.search.filter.model.ViewKeys;

/* JADX INFO: loaded from: classes3.dex */
public abstract /* synthetic */ class up8 {

    /* JADX INFO: renamed from: a */
    public static final /* synthetic */ int[] f64192a;

    static {
        int[] iArr = new int[ViewKeys.values().length];
        try {
            iArr[ViewKeys.ProviderSharedBy.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[ViewKeys.LessonTags.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[ViewKeys.Accent.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        f64192a = iArr;
    }
}
