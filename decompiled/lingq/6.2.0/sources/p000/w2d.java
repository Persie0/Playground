package p000;

import android.view.View;
import android.view.ViewParent;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.TextView;

/* JADX INFO: loaded from: classes2.dex */
public abstract class w2d {

    /* JADX INFO: renamed from: a */
    public static p04 f66312a;

    /* JADX INFO: renamed from: a */
    public static void m23691a(EditorInfo editorInfo, InputConnection inputConnection, TextView textView) {
        if (inputConnection == null || editorInfo.hintText != null) {
            return;
        }
        for (ViewParent parent = textView.getParent(); parent instanceof View; parent = parent.getParent()) {
        }
    }
}
