package com.airbnb.lottie.model.content;

/* JADX INFO: loaded from: classes2.dex */
public enum MergePaths$MergePathsMode {
    MERGE,
    ADD,
    SUBTRACT,
    INTERSECT,
    EXCLUDE_INTERSECTIONS;

    public static MergePaths$MergePathsMode forId(int i) {
        if (i == 1) {
            return MERGE;
        }
        if (i == 2) {
            return ADD;
        }
        if (i == 3) {
            return SUBTRACT;
        }
        if (i != 4) {
            return i != 5 ? MERGE : EXCLUDE_INTERSECTIONS;
        }
        return INTERSECT;
    }
}
