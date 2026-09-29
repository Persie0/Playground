package p000;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.SeekBar;
import androidx.appcompat.R$attr;

/* JADX INFO: renamed from: nq */
/* JADX INFO: loaded from: classes2.dex */
public final class C3381nq extends SeekBar {

    /* JADX INFO: renamed from: a */
    public final C3422oq f53111a;

    /* JADX WARN: Illegal instructions before constructor call */
    public C3381nq(Context context, AttributeSet attributeSet) {
        int i = R$attr.seekBarStyle;
        super(context, attributeSet, i);
        oz9.m18842a(this, getContext());
        C3422oq c3422oq = new C3422oq(this);
        this.f53111a = c3422oq;
        c3422oq.mo14587A(attributeSet, i);
    }

    @Override // android.widget.AbsSeekBar, android.widget.ProgressBar, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        C3422oq c3422oq = this.f53111a;
        C3381nq c3381nq = c3422oq.f54708f;
        Drawable drawable = c3422oq.f54709g;
        if (drawable != null && drawable.isStateful() && drawable.setState(c3381nq.getDrawableState())) {
            c3381nq.invalidateDrawable(drawable);
        }
    }

    @Override // android.widget.AbsSeekBar, android.widget.ProgressBar, android.view.View
    public final void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        Drawable drawable = this.f53111a.f54709g;
        if (drawable != null) {
            drawable.jumpToCurrentState();
        }
    }

    @Override // android.widget.AbsSeekBar, android.widget.ProgressBar, android.view.View
    public final synchronized void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        this.f53111a.m18205W(canvas);
    }
}
