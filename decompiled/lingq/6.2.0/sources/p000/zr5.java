package p000;

import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import com.google.android.material.checkbox.MaterialCheckBox;

/* JADX INFO: loaded from: classes2.dex */
public final class zr5 extends AbstractC3689vl {

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ MaterialCheckBox f72005b;

    public zr5(MaterialCheckBox materialCheckBox) {
        this.f72005b = materialCheckBox;
    }

    @Override // p000.AbstractC3689vl
    /* JADX INFO: renamed from: a */
    public final void mo23406a(Drawable drawable) {
        ColorStateList colorStateList = this.f72005b.f12833J;
        if (colorStateList != null) {
            drawable.setTintList(colorStateList);
        }
    }

    @Override // p000.AbstractC3689vl
    /* JADX INFO: renamed from: b */
    public final void mo23407b(Drawable drawable) {
        MaterialCheckBox materialCheckBox = this.f72005b;
        ColorStateList colorStateList = materialCheckBox.f12833J;
        if (colorStateList != null) {
            drawable.setTint(colorStateList.getColorForState(materialCheckBox.f12837N, colorStateList.getDefaultColor()));
        }
    }
}
