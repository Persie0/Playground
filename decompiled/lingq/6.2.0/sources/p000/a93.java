package p000;

import androidx.compose.foundation.layout.FlowLayoutOverflow$OverflowType;

/* JADX INFO: loaded from: classes.dex */
public abstract /* synthetic */ class a93 {

    /* JADX INFO: renamed from: a */
    public static final /* synthetic */ int[] f378a;

    static {
        int[] iArr = new int[FlowLayoutOverflow$OverflowType.values().length];
        try {
            iArr[FlowLayoutOverflow$OverflowType.ExpandIndicator.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[FlowLayoutOverflow$OverflowType.ExpandOrCollapseIndicator.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        f378a = iArr;
    }
}
