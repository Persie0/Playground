package p000;

import com.lingq.core.p012ui.library.CollectionLoadingItemType;

/* JADX INFO: loaded from: classes2.dex */
public abstract /* synthetic */ class j81 {

    /* JADX INFO: renamed from: a */
    public static final /* synthetic */ int[] f45176a;

    static {
        int[] iArr = new int[CollectionLoadingItemType.values().length];
        try {
            iArr[CollectionLoadingItemType.Lesson.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[CollectionLoadingItemType.Course.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        f45176a = iArr;
    }
}
