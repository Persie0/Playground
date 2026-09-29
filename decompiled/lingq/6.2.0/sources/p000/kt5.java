package p000;

import androidx.compose.p002ui.node.LayoutNode$LayoutState;

/* JADX INFO: loaded from: classes.dex */
public abstract /* synthetic */ class kt5 {

    /* JADX INFO: renamed from: a */
    public static final /* synthetic */ int[] f48413a;

    static {
        int[] iArr = new int[LayoutNode$LayoutState.values().length];
        try {
            iArr[LayoutNode$LayoutState.LookaheadMeasuring.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[LayoutNode$LayoutState.LookaheadLayingOut.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[LayoutNode$LayoutState.Measuring.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[LayoutNode$LayoutState.LayingOut.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr[LayoutNode$LayoutState.Idle.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
        f48413a = iArr;
    }
}
