package p000;

import androidx.compose.foundation.layout.FlowLayoutOverflow$OverflowType;

/* JADX INFO: loaded from: classes.dex */
public abstract /* synthetic */ class b93 {

    /* JADX INFO: renamed from: a */
    public static final /* synthetic */ int[] f8172a;

    static {
        int[] iArr = new int[FlowLayoutOverflow$OverflowType.values().length];
        try {
            iArr[FlowLayoutOverflow$OverflowType.Visible.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[FlowLayoutOverflow$OverflowType.Clip.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[FlowLayoutOverflow$OverflowType.ExpandIndicator.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[FlowLayoutOverflow$OverflowType.ExpandOrCollapseIndicator.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        f8172a = iArr;
    }
}
