package p000;

import androidx.constraintlayout.core.widgets.ConstraintAnchor$Type;

/* JADX INFO: loaded from: classes2.dex */
public abstract /* synthetic */ class l4b {

    /* JADX INFO: renamed from: a */
    public static final /* synthetic */ int[] f49056a;

    static {
        int[] iArr = new int[ConstraintAnchor$Type.values().length];
        f49056a = iArr;
        try {
            iArr[ConstraintAnchor$Type.LEFT.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            f49056a[ConstraintAnchor$Type.RIGHT.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            f49056a[ConstraintAnchor$Type.TOP.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            f49056a[ConstraintAnchor$Type.BASELINE.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            f49056a[ConstraintAnchor$Type.BOTTOM.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
    }
}
