package p000;

import com.lingq.core.settings.FilterType;

/* JADX INFO: loaded from: classes3.dex */
public abstract /* synthetic */ class hza {

    /* JADX INFO: renamed from: a */
    public static final /* synthetic */ int[] f43262a;

    static {
        int[] iArr = new int[FilterType.values().length];
        try {
            iArr[FilterType.Status.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[FilterType.SortBy.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[FilterType.SearchTerm.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[FilterType.Course.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr[FilterType.Lesson.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            iArr[FilterType.Tags.ordinal()] = 6;
        } catch (NoSuchFieldError unused6) {
        }
        try {
            iArr[FilterType.SRSDate.ordinal()] = 7;
        } catch (NoSuchFieldError unused7) {
        }
        f43262a = iArr;
    }
}
