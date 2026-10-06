package p000;

import android.content.Context;
import android.graphics.Matrix;
import android.util.AttributeSet;
import android.view.View;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public class dng extends View {

    /* JADX INFO: renamed from: b */
    public final kcg f12088b;

    public dng(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f12088b = new kcg();
    }

    /* JADX INFO: renamed from: a */
    public final Matrix m6431a() {
        return this.f12088b.m13966a();
    }

    @Override // android.view.View
    public final void layout(int i, int i2, int i3, int i4) {
        super.layout(i, i2, i3, i4);
        this.f12088b.m13968c(i, i2, i3, i4, kay.m13892e(oyo.m19193i(getContext())));
    }
}
