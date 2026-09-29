package p000;

import android.content.Context;
import android.graphics.drawable.Drawable;
import androidx.appcompat.R$attr;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.C0035b;

/* JADX INFO: renamed from: x5 */
/* JADX INFO: loaded from: classes.dex */
public final class C3747x5 extends AppCompatImageView implements InterfaceC3784y5 {

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ C0035b f67764d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3747x5(C0035b c0035b, Context context) {
        super(context, null, R$attr.actionOverflowButtonStyle);
        this.f67764d = c0035b;
        setClickable(true);
        setFocusable(true);
        setVisibility(0);
        setEnabled(true);
        a6a.m135a(this, getContentDescription());
        setOnTouchListener(new C3710w5(this, this));
    }

    @Override // p000.InterfaceC3784y5
    /* JADX INFO: renamed from: a */
    public final boolean mo641a() {
        return false;
    }

    @Override // p000.InterfaceC3784y5
    /* JADX INFO: renamed from: b */
    public final boolean mo642b() {
        return false;
    }

    @Override // android.view.View
    public final boolean performClick() {
        if (super.performClick()) {
            return true;
        }
        playSoundEffect(0);
        this.f67764d.m714n();
        return true;
    }

    @Override // android.widget.ImageView
    public final boolean setFrame(int i, int i2, int i3, int i4) {
        boolean frame = super.setFrame(i, i2, i3, i4);
        Drawable drawable = getDrawable();
        Drawable background = getBackground();
        if (drawable != null && background != null) {
            int width = getWidth();
            int height = getHeight();
            int iMax = Math.max(width, height) / 2;
            int paddingLeft = (width + (getPaddingLeft() - getPaddingRight())) / 2;
            int paddingTop = (height + (getPaddingTop() - getPaddingBottom())) / 2;
            background.setHotspotBounds(paddingLeft - iMax, paddingTop - iMax, paddingLeft + iMax, paddingTop + iMax);
        }
        return frame;
    }
}
