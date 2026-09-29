package androidx.appcompat.widget;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.SeekBar;
import com.linguist.R;

/* JADX INFO: renamed from: androidx.appcompat.widget.t */
/* JADX INFO: loaded from: classes.dex */
public final class C0342t extends SeekBar {

    /* JADX INFO: renamed from: a */
    public final C0344u f1328a;

    public C0342t(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.seekBarStyle);
        C0349w0.m1279a(getContext(), this);
        C0344u c0344u = new C0344u(this);
        this.f1328a = c0344u;
        c0344u.mo1254a(attributeSet, R.attr.seekBarStyle);
    }

    @Override // android.widget.AbsSeekBar, android.widget.ProgressBar, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        C0344u c0344u = this.f1328a;
        Drawable drawable = c0344u.f1338e;
        if (drawable == null || !drawable.isStateful()) {
            return;
        }
        SeekBar seekBar = c0344u.f1337d;
        if (drawable.setState(seekBar.getDrawableState())) {
            seekBar.invalidateDrawable(drawable);
        }
    }

    @Override // android.widget.AbsSeekBar, android.widget.ProgressBar, android.view.View
    public final void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        Drawable drawable = this.f1328a.f1338e;
        if (drawable != null) {
            drawable.jumpToCurrentState();
        }
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @Override // android.widget.AbsSeekBar, android.widget.ProgressBar, android.view.View
    public final synchronized void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        this.f1328a.m1269d(canvas);
    }
}
