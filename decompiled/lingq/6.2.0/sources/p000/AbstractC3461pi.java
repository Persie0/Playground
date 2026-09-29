package p000;

import android.text.GraphemeClusterSegmentFinder;
import android.text.SegmentFinder;
import android.text.TextPaint;
import android.view.inputmethod.DeleteGesture;
import android.view.inputmethod.DeleteRangeGesture;
import android.view.inputmethod.InsertGesture;
import android.view.inputmethod.JoinOrSplitGesture;
import android.view.inputmethod.RemoveSpaceGesture;
import android.view.inputmethod.SelectGesture;
import android.view.inputmethod.SelectRangeGesture;

/* JADX INFO: renamed from: pi */
/* JADX INFO: loaded from: classes2.dex */
public abstract /* synthetic */ class AbstractC3461pi {
    /* JADX INFO: renamed from: A */
    public static /* bridge */ /* synthetic */ Class m19148A() {
        return DeleteGesture.class;
    }

    /* JADX INFO: renamed from: B */
    public static /* bridge */ /* synthetic */ Class m19149B() {
        return JoinOrSplitGesture.class;
    }

    /* JADX INFO: renamed from: C */
    public static /* bridge */ /* synthetic */ Class m19150C() {
        return InsertGesture.class;
    }

    /* JADX INFO: renamed from: D */
    public static /* bridge */ /* synthetic */ Class m19151D() {
        return RemoveSpaceGesture.class;
    }

    /* JADX INFO: renamed from: k */
    public static /* synthetic */ GraphemeClusterSegmentFinder m19162k(CharSequence charSequence, TextPaint textPaint) {
        return new GraphemeClusterSegmentFinder(charSequence, textPaint);
    }

    /* JADX INFO: renamed from: l */
    public static /* bridge */ /* synthetic */ SegmentFinder m19163l(Object obj) {
        return (SegmentFinder) obj;
    }

    /* JADX INFO: renamed from: m */
    public static /* bridge */ /* synthetic */ Class m19164m() {
        return SelectGesture.class;
    }

    /* JADX INFO: renamed from: n */
    public static /* synthetic */ void m19165n() {
    }

    /* JADX INFO: renamed from: s */
    public static /* bridge */ /* synthetic */ boolean m19170s(Object obj) {
        return obj instanceof SelectGesture;
    }

    /* JADX INFO: renamed from: x */
    public static /* bridge */ /* synthetic */ Class m19175x() {
        return SelectRangeGesture.class;
    }

    /* JADX INFO: renamed from: z */
    public static /* bridge */ /* synthetic */ Class m19177z() {
        return DeleteRangeGesture.class;
    }
}
