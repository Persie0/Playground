package p000;

import android.graphics.Rect;
import android.text.method.TransformationMethod;
import android.view.View;

/* JADX INFO: loaded from: classes.dex */
public final class ir2 implements TransformationMethod {

    /* JADX INFO: renamed from: a */
    public final TransformationMethod f44453a;

    public ir2(TransformationMethod transformationMethod) {
        this.f44453a = transformationMethod;
    }

    @Override // android.text.method.TransformationMethod
    public final CharSequence getTransformation(CharSequence charSequence, View view) {
        if (view.isInEditMode()) {
            return charSequence;
        }
        TransformationMethod transformationMethod = this.f44453a;
        if (transformationMethod != null) {
            charSequence = transformationMethod.getTransformation(charSequence, view);
        }
        if (charSequence == null || pq2.m19448a().m19451c() != 1) {
            return charSequence;
        }
        pq2 pq2VarM19448a = pq2.m19448a();
        pq2VarM19448a.getClass();
        return pq2VarM19448a.m19454g(0, charSequence.length(), 0, charSequence);
    }

    @Override // android.text.method.TransformationMethod
    public final void onFocusChanged(View view, CharSequence charSequence, boolean z, int i, Rect rect) {
        TransformationMethod transformationMethod = this.f44453a;
        if (transformationMethod != null) {
            transformationMethod.onFocusChanged(view, charSequence, z, i, rect);
        }
    }
}
