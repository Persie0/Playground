package lk;

import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.Transformation;

/* JADX INFO: renamed from: lk.b */
/* JADX INFO: loaded from: classes2.dex */
public final class C7386b extends Animation {

    /* JADX INFO: renamed from: a */
    public final ViewGroup f41187a;

    /* JADX INFO: renamed from: b */
    public final int f41188b;

    /* JADX INFO: renamed from: c */
    public final int f41189c;

    public C7386b(ViewGroup viewGroup, int i10, int i11) {
        this.f41187a = viewGroup;
        this.f41188b = i10;
        this.f41189c = i11;
    }

    @Override // android.view.animation.Animation
    public final void applyTransformation(float f3, Transformation transformation) {
        int i10 = this.f41188b;
        int i11 = this.f41189c;
        int i12 = i10 < i11 ? i11 - ((int) (f3 * (i11 - i10))) : i11 + ((int) (f3 * (i10 - i11)));
        ViewGroup viewGroup = this.f41187a;
        viewGroup.getLayoutParams().width = i12;
        viewGroup.requestLayout();
    }

    @Override // android.view.animation.Animation
    public final boolean willChangeBounds() {
        return true;
    }
}
