package p000;

import android.content.Context;
import android.util.AttributeSet;
import android.view.SurfaceView;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public class drg extends SurfaceView {

    /* JADX INFO: renamed from: a */
    public final kcg f12390a;

    public drg(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f12390a = new kcg();
    }

    @Override // android.view.View
    public final void layout(int i, int i2, int i3, int i4) {
        super.layout(i, i2, i3, i4);
        this.f12390a.m13968c(i, i2, i3, i4, kay.m13892e(oyo.m19193i(getContext())));
    }
}
