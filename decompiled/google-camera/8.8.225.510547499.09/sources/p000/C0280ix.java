package p000;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.SeekBar;
import com.google.android.apps.camera.bottombar.C0100R;

/* JADX INFO: renamed from: ix */
/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public class C0280ix extends SeekBar {

    /* JADX INFO: renamed from: a */
    private final C0281iy f32526a;

    public C0280ix(Context context) {
        this(context, null);
    }

    @Override // android.widget.AbsSeekBar, android.widget.ProgressBar, android.view.View
    protected final void drawableStateChanged() {
        super.drawableStateChanged();
        C0281iy c0281iy = this.f32526a;
        Drawable drawable = c0281iy.f32626c;
        if (drawable != null && drawable.isStateful() && drawable.setState(c0281iy.f32625b.getDrawableState())) {
            c0281iy.f32625b.invalidateDrawable(drawable);
        }
    }

    @Override // android.widget.AbsSeekBar, android.widget.ProgressBar, android.view.View
    public final void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        Drawable drawable = this.f32526a.f32626c;
        if (drawable != null) {
            drawable.jumpToCurrentState();
        }
    }

    @Override // android.widget.AbsSeekBar, android.widget.ProgressBar, android.view.View
    protected synchronized void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        C0281iy c0281iy = this.f32526a;
        if (c0281iy.f32626c != null) {
            int max = c0281iy.f32625b.getMax();
            if (max > 1) {
                int intrinsicWidth = c0281iy.f32626c.getIntrinsicWidth();
                int intrinsicHeight = c0281iy.f32626c.getIntrinsicHeight();
                int i = intrinsicWidth >= 0 ? intrinsicWidth >> 1 : 1;
                int i2 = intrinsicHeight >= 0 ? intrinsicHeight >> 1 : 1;
                c0281iy.f32626c.setBounds(-i, -i2, i, i2);
                int width = (c0281iy.f32625b.getWidth() - c0281iy.f32625b.getPaddingLeft()) - c0281iy.f32625b.getPaddingRight();
                int iSave = canvas.save();
                canvas.translate(c0281iy.f32625b.getPaddingLeft(), c0281iy.f32625b.getHeight() / 2);
                for (int i3 = 0; i3 <= max; i3++) {
                    c0281iy.f32626c.draw(canvas);
                    canvas.translate(width / max, 0.0f);
                }
                canvas.restoreToCount(iSave);
            }
        }
    }

    public C0280ix(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C0100R.attr.seekBarStyle);
    }

    public C0280ix(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        C0847nf.m17435d(this, getContext());
        C0281iy c0281iy = new C0281iy(this);
        this.f32526a = c0281iy;
        c0281iy.mo11798b(attributeSet, i);
    }
}
