package p000;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.os.SystemClock;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ProgressBar;
import com.google.android.apps.camera.bottombar.C0100R;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public abstract class mji extends ProgressBar {

    /* JADX INFO: renamed from: a */
    public final mjj f40731a;

    /* JADX INFO: renamed from: b */
    public int f40732b;

    /* JADX INFO: renamed from: c */
    public boolean f40733c;

    /* JADX INFO: renamed from: d */
    public final int f40734d;

    /* JADX INFO: renamed from: e */
    private final boolean f40735e;

    /* JADX INFO: renamed from: f */
    private final int f40736f;

    /* JADX INFO: renamed from: g */
    private final Runnable f40737g;

    /* JADX INFO: renamed from: h */
    private final Runnable f40738h;

    /* JADX INFO: renamed from: i */
    private final atc f40739i;

    /* JADX INFO: renamed from: j */
    private final atc f40740j;

    protected mji(Context context, AttributeSet attributeSet, int i, int i2) {
        super(mmp.m16632a(context, attributeSet, i, C0100R.style.Widget_MaterialComponents_ProgressIndicator), attributeSet, i);
        this.f40733c = false;
        this.f40734d = 4;
        this.f40737g = new lmg(this, 12);
        this.f40738h = new lmg(this, 13);
        this.f40739i = new mjg(this);
        this.f40740j = new mjh(this);
        Context context2 = getContext();
        this.f40731a = mo4845a(context2, attributeSet);
        TypedArray typedArrayM16438a = mjb.m16438a(context2, attributeSet, mkj.f40839a, i, i2, new int[0]);
        typedArrayM16438a.getInt(5, -1);
        this.f40736f = Math.min(typedArrayM16438a.getInt(3, -1), 1000);
        typedArrayM16438a.recycle();
        this.f40735e = true;
    }

    /* JADX INFO: renamed from: a */
    public abstract mjj mo4845a(Context context, AttributeSet attributeSet);

    @Override // android.widget.ProgressBar
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public final mjs getProgressDrawable() {
        return (mjs) super.getProgressDrawable();
    }

    @Override // android.widget.ProgressBar
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public final mjz getIndeterminateDrawable() {
        return (mjz) super.getIndeterminateDrawable();
    }

    /* JADX INFO: renamed from: d */
    protected final void m16446d(boolean z) {
        if (this.f40735e) {
            ((mjw) getCurrentDrawable()).m16473h(m16448f(), false, z);
        }
    }

    /* JADX INFO: renamed from: e */
    public final void m16447e() {
        if (this.f40736f > 0) {
            SystemClock.uptimeMillis();
        }
        setVisibility(0);
    }

    /* JADX INFO: renamed from: f */
    final boolean m16448f() {
        if (!afe.m461e(this) || getWindowVisibility() != 0) {
            return false;
        }
        View view = this;
        while (view.getVisibility() == 0) {
            Object parent = view.getParent();
            if (parent == null) {
                return getWindowVisibility() == 0;
            }
            if (!(parent instanceof View)) {
                return true;
            }
            view = (View) parent;
        }
        return false;
    }

    /* JADX INFO: renamed from: g */
    public void mo4846g(int i) {
        if (!isIndeterminate()) {
            super.setProgress(i);
            if (getProgressDrawable() != null) {
                getProgressDrawable().jumpToCurrentState();
                return;
            }
            return;
        }
        if (getProgressDrawable() != null) {
            this.f40732b = i;
            this.f40733c = true;
            if (!getIndeterminateDrawable().isVisible() || lij.m15397E(getContext().getContentResolver()) == 0.0f) {
                this.f40739i.mo1979b(getIndeterminateDrawable());
            } else {
                getIndeterminateDrawable().f40794b.mo16461c();
            }
        }
    }

    @Override // android.widget.ProgressBar
    public final Drawable getCurrentDrawable() {
        return isIndeterminate() ? getIndeterminateDrawable() : getProgressDrawable();
    }

    @Override // android.view.View
    public final void invalidate() {
        super.invalidate();
        if (getCurrentDrawable() != null) {
            getCurrentDrawable().invalidateSelf();
        }
    }

    @Override // android.widget.ProgressBar, android.view.View
    protected final void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (getProgressDrawable() != null && getIndeterminateDrawable() != null) {
            getIndeterminateDrawable().f40794b.mo16460b(this.f40739i);
        }
        if (getProgressDrawable() != null) {
            getProgressDrawable().m16469d(this.f40740j);
        }
        if (getIndeterminateDrawable() != null) {
            getIndeterminateDrawable().m16469d(this.f40740j);
        }
        if (m16448f()) {
            m16447e();
        }
    }

    @Override // android.widget.ProgressBar, android.view.View
    protected final void onDetachedFromWindow() {
        removeCallbacks(this.f40738h);
        removeCallbacks(this.f40737g);
        ((mjw) getCurrentDrawable()).m16474j();
        if (getIndeterminateDrawable() != null) {
            getIndeterminateDrawable().m16475k(this.f40740j);
            getIndeterminateDrawable().f40794b.mo16463e();
        }
        if (getProgressDrawable() != null) {
            getProgressDrawable().m16475k(this.f40740j);
        }
        super.onDetachedFromWindow();
    }

    @Override // android.widget.ProgressBar, android.view.View
    protected final synchronized void onDraw(Canvas canvas) {
        int iSave = canvas.save();
        if (getPaddingLeft() != 0 || getPaddingTop() != 0) {
            canvas.translate(getPaddingLeft(), getPaddingTop());
        }
        if (getPaddingRight() != 0 || getPaddingBottom() != 0) {
            canvas.clipRect(0, 0, getWidth() - (getPaddingLeft() + getPaddingRight()), getHeight() - (getPaddingTop() + getPaddingBottom()));
        }
        getCurrentDrawable().draw(canvas);
        canvas.restoreToCount(iSave);
    }

    @Override // android.widget.ProgressBar, android.view.View
    protected final synchronized void onMeasure(int i, int i2) {
        mjx mjxVar = null;
        if (!isIndeterminate()) {
            mjxVar = getProgressDrawable() != null ? getProgressDrawable().f40771a : null;
        } else if (getIndeterminateDrawable() != null) {
            mjxVar = getIndeterminateDrawable().f40793a;
        }
        if (mjxVar == null) {
            return;
        }
        setMeasuredDimension(mjxVar.mo16455b() < 0 ? getDefaultSize(getSuggestedMinimumWidth(), i) : mjxVar.mo16455b() + getPaddingLeft() + getPaddingRight(), mjxVar.mo16454a() < 0 ? getDefaultSize(getSuggestedMinimumHeight(), i2) : mjxVar.mo16454a() + getPaddingTop() + getPaddingBottom());
    }

    @Override // android.view.View
    protected final void onVisibilityChanged(View view, int i) {
        super.onVisibilityChanged(view, i);
        m16446d(i == 0);
    }

    @Override // android.view.View
    protected final void onWindowVisibilityChanged(int i) {
        super.onWindowVisibilityChanged(i);
        m16446d(false);
    }

    @Override // android.widget.ProgressBar
    public final synchronized void setIndeterminate(boolean z) {
        if (z == isIndeterminate()) {
            return;
        }
        Drawable currentDrawable = getCurrentDrawable();
        if (currentDrawable != null) {
            ((mjw) currentDrawable).m16474j();
        }
        super.setIndeterminate(z);
        Drawable currentDrawable2 = getCurrentDrawable();
        if (currentDrawable2 != null) {
            ((mjw) currentDrawable2).m16473h(m16448f(), false, false);
        }
        if ((currentDrawable2 instanceof mjz) && m16448f()) {
            ((mjz) currentDrawable2).f40794b.mo16462d();
        }
        this.f40733c = false;
    }

    @Override // android.widget.ProgressBar
    public final void setIndeterminateDrawable(Drawable drawable) {
        if (drawable == null) {
            super.setIndeterminateDrawable(null);
        } else {
            if (!(drawable instanceof mjz)) {
                throw new IllegalArgumentException("Cannot set framework drawable as indeterminate drawable.");
            }
            ((mjw) drawable).m16474j();
            super.setIndeterminateDrawable(drawable);
        }
    }

    @Override // android.widget.ProgressBar
    public final synchronized void setProgress(int i) {
        if (isIndeterminate()) {
            return;
        }
        mo4846g(i);
    }

    @Override // android.widget.ProgressBar
    public final void setProgressDrawable(Drawable drawable) {
        if (drawable == null) {
            super.setProgressDrawable(null);
        } else {
            if (!(drawable instanceof mjs)) {
                throw new IllegalArgumentException("Cannot set framework drawable as progress drawable.");
            }
            mjs mjsVar = (mjs) drawable;
            mjsVar.m16474j();
            super.setProgressDrawable(mjsVar);
            mjsVar.setLevel((int) ((getProgress() / getMax()) * 10000.0f));
        }
    }
}
