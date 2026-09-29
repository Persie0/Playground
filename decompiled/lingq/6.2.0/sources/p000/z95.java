package p000;

import com.lingq.core.domain.model.library.SortType;

/* JADX INFO: loaded from: classes2.dex */
public abstract /* synthetic */ class z95 {

    /* JADX INFO: renamed from: a */
    public static final /* synthetic */ int[] f71225a;

    static {
        int[] iArr = new int[SortType.values().length];
        try {
            iArr[SortType.New.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[SortType.MyLessons.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[SortType.MyCourses.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[SortType.Collection.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        f71225a = iArr;
    }
}
