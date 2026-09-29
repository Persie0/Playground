package p000;

import com.lingq.core.domain.model.CoursePlaylistSort;

/* JADX INFO: loaded from: classes2.dex */
public abstract /* synthetic */ class dd7 {

    /* JADX INFO: renamed from: a */
    public static final /* synthetic */ int[] f35448a;

    static {
        int[] iArr = new int[CoursePlaylistSort.values().length];
        try {
            iArr[CoursePlaylistSort.Completed.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[CoursePlaylistSort.Opened.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        f35448a = iArr;
    }
}
