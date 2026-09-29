package p000;

import com.lingq.core.settings.ViewKeys;

/* JADX INFO: loaded from: classes3.dex */
public abstract /* synthetic */ class sza {

    /* JADX INFO: renamed from: a */
    public static final /* synthetic */ int[] f61682a;

    static {
        int[] iArr = new int[ViewKeys.values().length];
        try {
            iArr[ViewKeys.SearchTerm.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[ViewKeys.SortBy.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[ViewKeys.Course.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[ViewKeys.Lesson.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr[ViewKeys.Tags.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            iArr[ViewKeys.VocabularySrsDate.ordinal()] = 6;
        } catch (NoSuchFieldError unused6) {
        }
        f61682a = iArr;
    }
}
