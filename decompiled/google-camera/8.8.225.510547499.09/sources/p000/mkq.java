package p000;

import android.R;
import android.content.res.ColorStateList;
import android.graphics.Color;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class mkq {

    /* JADX INFO: renamed from: a */
    public static final int[] f40863a = {R.attr.state_pressed};

    /* JADX INFO: renamed from: b */
    public static final int[] f40864b = {R.attr.state_focused};

    /* JADX INFO: renamed from: c */
    public static final int[] f40865c = {R.attr.state_selected, R.attr.state_pressed};

    /* JADX INFO: renamed from: d */
    public static final int[] f40866d = {R.attr.state_selected};

    static {
        mkq.class.getSimpleName();
    }

    private mkq() {
    }

    /* JADX INFO: renamed from: a */
    public static int m16489a(ColorStateList colorStateList, int[] iArr) {
        int colorForState = colorStateList != null ? colorStateList.getColorForState(iArr, colorStateList.getDefaultColor()) : 0;
        int iAlpha = Color.alpha(colorForState);
        return acp.m212d(colorForState, Math.min(iAlpha + iAlpha, 255));
    }

    /* JADX INFO: renamed from: b */
    public static ColorStateList m16490b(ColorStateList colorStateList) {
        return colorStateList != null ? colorStateList : ColorStateList.valueOf(0);
    }
}
