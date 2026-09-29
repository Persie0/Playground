package p000;

import androidx.compose.p002ui.node.LayoutNode$LayoutState;
import androidx.compose.p002ui.node.LayoutNode$UsageByParent;

/* JADX INFO: loaded from: classes.dex */
public abstract /* synthetic */ class gt5 {

    /* JADX INFO: renamed from: a */
    public static final /* synthetic */ int[] f41298a;

    /* JADX INFO: renamed from: b */
    public static final /* synthetic */ int[] f41299b;

    static {
        int[] iArr = new int[LayoutNode$LayoutState.values().length];
        try {
            iArr[LayoutNode$LayoutState.Measuring.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[LayoutNode$LayoutState.LayingOut.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        f41298a = iArr;
        int[] iArr2 = new int[LayoutNode$UsageByParent.values().length];
        try {
            iArr2[LayoutNode$UsageByParent.InMeasureBlock.ordinal()] = 1;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr2[LayoutNode$UsageByParent.InLayoutBlock.ordinal()] = 2;
        } catch (NoSuchFieldError unused4) {
        }
        f41299b = iArr2;
    }
}
