package p000;

import com.lingq.feature.search.filter.model.FilterType;

/* JADX INFO: loaded from: classes3.dex */
public abstract /* synthetic */ class lq8 {

    /* JADX INFO: renamed from: a */
    public static final /* synthetic */ int[] f50009a;

    static {
        int[] iArr = new int[FilterType.values().length];
        try {
            iArr[FilterType.ProviderSharedBy.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[FilterType.Accent.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[FilterType.LessonTags.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        f50009a = iArr;
    }
}
