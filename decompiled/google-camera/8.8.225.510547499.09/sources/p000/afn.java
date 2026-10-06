package p000;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import java.util.List;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class afn {
    /* JADX INFO: renamed from: a */
    public static View.AccessibilityDelegate m534a(View view) {
        return view.getAccessibilityDelegate();
    }

    /* JADX INFO: renamed from: b */
    static List m535b(View view) {
        return view.getSystemGestureExclusionRects();
    }

    /* JADX INFO: renamed from: c */
    public static void m536c(View view, Context context, int[] iArr, AttributeSet attributeSet, TypedArray typedArray, int i, int i2) {
        view.saveAttributeDataForStyleable(context, iArr, attributeSet, typedArray, i, i2);
    }

    /* JADX INFO: renamed from: d */
    static void m537d(View view, List list) {
        view.setSystemGestureExclusionRects(list);
    }
}
