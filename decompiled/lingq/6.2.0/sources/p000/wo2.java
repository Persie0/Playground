package p000;

import android.view.inputmethod.EditorInfo;
import androidx.core.widget.NestedScrollView;

/* JADX INFO: loaded from: classes2.dex */
public abstract class wo2 {
    /* JADX INFO: renamed from: a */
    public static void m24088a(NestedScrollView nestedScrollView, float f) {
        try {
            nestedScrollView.setFrameContentVelocity(f);
        } catch (LinkageError unused) {
        }
    }

    /* JADX INFO: renamed from: b */
    public static void m24089b(EditorInfo editorInfo, boolean z) {
        editorInfo.setStylusHandwritingEnabled(z);
    }
}
