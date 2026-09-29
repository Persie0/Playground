package p000;

import com.airbnb.lottie.model.content.MergePaths$MergePathsMode;

/* JADX INFO: loaded from: classes2.dex */
public abstract /* synthetic */ class lx5 {

    /* JADX INFO: renamed from: a */
    public static final /* synthetic */ int[] f50241a;

    static {
        int[] iArr = new int[MergePaths$MergePathsMode.values().length];
        f50241a = iArr;
        try {
            iArr[MergePaths$MergePathsMode.MERGE.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            f50241a[MergePaths$MergePathsMode.ADD.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            f50241a[MergePaths$MergePathsMode.SUBTRACT.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            f50241a[MergePaths$MergePathsMode.INTERSECT.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            f50241a[MergePaths$MergePathsMode.EXCLUDE_INTERSECTIONS.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
    }
}
