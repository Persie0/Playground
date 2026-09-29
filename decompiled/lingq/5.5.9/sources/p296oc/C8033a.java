package p296oc;

import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;

/* JADX INFO: renamed from: oc.a */
/* JADX INFO: loaded from: classes.dex */
public final class C8033a extends InsetDrawable {
    public C8033a(Drawable drawable, int i10, int i11, int i12, int i13) {
        super(drawable, i10, i11, i12, i13);
    }

    @Override // android.graphics.drawable.Drawable
    public final int getMinimumHeight() {
        return -1;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getMinimumWidth() {
        return -1;
    }

    @Override // android.graphics.drawable.InsetDrawable, android.graphics.drawable.DrawableWrapper, android.graphics.drawable.Drawable
    public final boolean getPadding(Rect rect) {
        return false;
    }
}
