package p269n3;

import android.graphics.Rect;
import android.text.method.TransformationMethod;
import android.view.View;
import androidx.emoji2.text.C0892f;

/* JADX INFO: renamed from: n3.h */
/* JADX INFO: loaded from: classes.dex */
public final class C7703h implements TransformationMethod {

    /* JADX INFO: renamed from: a */
    public final TransformationMethod f42229a;

    public C7703h(TransformationMethod transformationMethod) {
        this.f42229a = transformationMethod;
    }

    @Override // android.text.method.TransformationMethod
    public final CharSequence getTransformation(CharSequence charSequence, View view) {
        if (view.isInEditMode()) {
            return charSequence;
        }
        TransformationMethod transformationMethod = this.f42229a;
        if (transformationMethod != null) {
            charSequence = transformationMethod.getTransformation(charSequence, view);
        }
        return (charSequence == null || C0892f.m3519a().m3521b() != 1) ? charSequence : C0892f.m3519a().m3526h(charSequence);
    }

    @Override // android.text.method.TransformationMethod
    public final void onFocusChanged(View view, CharSequence charSequence, boolean z10, int i10, Rect rect) {
        TransformationMethod transformationMethod = this.f42229a;
        if (transformationMethod != null) {
            transformationMethod.onFocusChanged(view, charSequence, z10, i10, rect);
        }
    }
}
