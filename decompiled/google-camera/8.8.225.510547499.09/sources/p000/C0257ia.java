package p000;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.support.v7.widget.AppCompatImageView;
import com.google.android.apps.camera.bottombar.C0100R;

/* JADX INFO: renamed from: ia */
/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class C0257ia extends AppCompatImageView implements InterfaceC0260id {

    /* JADX INFO: renamed from: a */
    final /* synthetic */ C0259ic f30115a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0257ia(C0259ic c0259ic, Context context) {
        super(context, null, C0100R.attr.actionOverflowButtonStyle);
        this.f30115a = c0259ic;
        setClickable(true);
        setFocusable(true);
        setVisibility(0);
        setEnabled(true);
        C0861nt.m17652a(this, getContentDescription());
        setOnTouchListener(new C0255hz(this, this));
    }

    @Override // p000.InterfaceC0260id
    /* JADX INFO: renamed from: c */
    public final boolean mo1032c() {
        return false;
    }

    @Override // p000.InterfaceC0260id
    /* JADX INFO: renamed from: d */
    public final boolean mo1033d() {
        return false;
    }

    @Override // android.view.View
    public final boolean performClick() {
        if (super.performClick()) {
            return true;
        }
        playSoundEffect(0);
        this.f30115a.m11038m();
        return true;
    }

    @Override // android.widget.ImageView
    protected final boolean setFrame(int i, int i2, int i3, int i4) {
        boolean frame = super.setFrame(i, i2, i3, i4);
        Drawable drawable = getDrawable();
        Drawable background = getBackground();
        if (drawable != null && background != null) {
            int width = getWidth();
            int height = getHeight();
            int iMax = Math.max(width, height) / 2;
            int paddingLeft = (width + (getPaddingLeft() - getPaddingRight())) / 2;
            int paddingTop = (height + (getPaddingTop() - getPaddingBottom())) / 2;
            acv.m236e(background, paddingLeft - iMax, paddingTop - iMax, paddingLeft + iMax, paddingTop + iMax);
        }
        return frame;
    }
}
