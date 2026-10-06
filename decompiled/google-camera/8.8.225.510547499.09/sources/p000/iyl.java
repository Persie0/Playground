package p000;

import android.content.res.ColorStateList;
import com.google.android.clockwork.common.wearable.wearmaterial.progressindicator.ProgressSpinnerDrawable;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class iyl {

    /* JADX INFO: renamed from: a */
    public ColorStateList f32658a;

    /* JADX INFO: renamed from: b */
    public ColorStateList f32659b;

    /* JADX INFO: renamed from: c */
    final /* synthetic */ ProgressSpinnerDrawable f32660c;

    public iyl(ProgressSpinnerDrawable progressSpinnerDrawable) {
        this.f32660c = progressSpinnerDrawable;
    }

    /* JADX INFO: renamed from: a */
    public final void m11906a() {
        ColorStateList colorStateList = this.f32658a;
        if (colorStateList != null) {
            this.f32660c.setProgressColor(colorStateList);
        }
        this.f32660c.setTrackColor(this.f32659b);
    }
}
