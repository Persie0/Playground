package bd;

import ae.C0062b;
import android.content.ContentResolver;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.os.SystemClock;
import android.provider.Settings;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ProgressBar;
import bd.AbstractC1359c;
import com.linguist.R;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.WeakHashMap;
import md.C7542a;
import p153hc.C6031a;
import p428v4.AbstractC9640c;
import p471x2.C10029b0;
import p471x2.C10049l0;
import p507yc.C10344k;

/* JADX INFO: renamed from: bd.b */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1358b<S extends AbstractC1359c> extends ProgressBar {

    /* JADX INFO: renamed from: H */
    public final c f8192H;

    /* JADX INFO: renamed from: I */
    public final d f8193I;

    /* JADX INFO: renamed from: a */
    public final S f8194a;

    /* JADX INFO: renamed from: b */
    public int f8195b;

    /* JADX INFO: renamed from: c */
    public boolean f8196c;

    /* JADX INFO: renamed from: d */
    public final boolean f8197d;

    /* JADX INFO: renamed from: e */
    public final int f8198e;

    /* JADX INFO: renamed from: f */
    public final int f8199f;

    /* JADX INFO: renamed from: g */
    public long f8200g;

    /* JADX INFO: renamed from: h */
    public C1357a f8201h;

    /* JADX INFO: renamed from: i */
    public boolean f8202i;

    /* JADX INFO: renamed from: j */
    public int f8203j;

    /* JADX INFO: renamed from: k */
    public final a f8204k;

    /* JADX INFO: renamed from: l */
    public final b f8205l;

    /* JADX INFO: renamed from: bd.b$a */
    public class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            AbstractC1358b abstractC1358b = AbstractC1358b.this;
            if (abstractC1358b.f8199f > 0) {
                abstractC1358b.f8200g = SystemClock.uptimeMillis();
            }
            abstractC1358b.setVisibility(0);
        }
    }

    /* JADX INFO: renamed from: bd.b$b */
    public class b implements Runnable {
        public b() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            AbstractC1358b abstractC1358b = AbstractC1358b.this;
            boolean z10 = false;
            ((AbstractC1368l) abstractC1358b.getCurrentDrawable()).m4959e(false, false, true);
            if ((abstractC1358b.getProgressDrawable() == null || !abstractC1358b.getProgressDrawable().isVisible()) && (abstractC1358b.getIndeterminateDrawable() == null || !abstractC1358b.getIndeterminateDrawable().isVisible())) {
                z10 = true;
            }
            if (z10) {
                abstractC1358b.setVisibility(4);
            }
            abstractC1358b.f8200g = -1L;
        }
    }

    /* JADX INFO: renamed from: bd.b$c */
    public class c extends AbstractC9640c {
        public c() {
        }

        @Override // p428v4.AbstractC9640c
        /* JADX INFO: renamed from: a */
        public final void mo4937a(Drawable drawable) {
            AbstractC1358b abstractC1358b = AbstractC1358b.this;
            abstractC1358b.setIndeterminate(false);
            abstractC1358b.mo4934c(abstractC1358b.f8195b, abstractC1358b.f8196c);
        }
    }

    /* JADX INFO: renamed from: bd.b$d */
    public class d extends AbstractC9640c {
        public d() {
        }

        @Override // p428v4.AbstractC9640c
        /* JADX INFO: renamed from: a */
        public final void mo4937a(Drawable drawable) {
            AbstractC1358b abstractC1358b = AbstractC1358b.this;
            if (!abstractC1358b.f8202i) {
                abstractC1358b.setVisibility(abstractC1358b.f8203j);
            }
        }
    }

    public AbstractC1358b(Context context, AttributeSet attributeSet, int i10, int i11) {
        super(C7542a.m15048a(context, attributeSet, i10, R.style.Widget_MaterialComponents_ProgressIndicator), attributeSet, i10);
        this.f8200g = -1L;
        this.f8202i = false;
        this.f8203j = 4;
        this.f8204k = new a();
        this.f8205l = new b();
        this.f8192H = new c();
        this.f8193I = new d();
        Context context2 = getContext();
        this.f8194a = (S) mo4932a(context2, attributeSet);
        TypedArray typedArrayM19357d = C10344k.m19357d(context2, attributeSet, C6031a.f35654d, i10, i11, new int[0]);
        this.f8198e = typedArrayM19357d.getInt(5, -1);
        this.f8199f = Math.min(typedArrayM19357d.getInt(3, -1), 1000);
        typedArrayM19357d.recycle();
        this.f8201h = new C1357a();
        this.f8197d = true;
    }

    private AbstractC1369m<S> getCurrentDrawingDelegate() {
        if (isIndeterminate()) {
            if (getIndeterminateDrawable() == null) {
                return null;
            }
            return getIndeterminateDrawable().f8260l;
        }
        if (getProgressDrawable() == null) {
            return null;
        }
        return getProgressDrawable().f8243l;
    }

    /* JADX INFO: renamed from: a */
    public abstract S mo4932a(Context context, AttributeSet attributeSet);

    /* JADX INFO: renamed from: b */
    public final void m4933b() {
        if (getVisibility() != 0) {
            removeCallbacks(this.f8204k);
            return;
        }
        b bVar = this.f8205l;
        removeCallbacks(bVar);
        long jUptimeMillis = SystemClock.uptimeMillis() - this.f8200g;
        long j10 = this.f8199f;
        if (jUptimeMillis >= j10) {
            bVar.run();
        } else {
            postDelayed(bVar, j10 - jUptimeMillis);
        }
    }

    /* JADX INFO: renamed from: c */
    public void mo4934c(int i10, boolean z10) {
        if (!isIndeterminate()) {
            super.setProgress(i10);
            if (getProgressDrawable() == null || z10) {
                return;
            }
            getProgressDrawable().jumpToCurrentState();
            return;
        }
        if (getProgressDrawable() != null) {
            this.f8195b = i10;
            this.f8196c = z10;
            this.f8202i = true;
            if (getIndeterminateDrawable().isVisible()) {
                C1357a c1357a = this.f8201h;
                ContentResolver contentResolver = getContext().getContentResolver();
                c1357a.getClass();
                if (Settings.Global.getFloat(contentResolver, "animator_duration_scale", 1.0f) != 0.0f) {
                    getIndeterminateDrawable().f8259H.mo4948h();
                    return;
                }
            }
            this.f8192H.mo4937a(getIndeterminateDrawable());
        }
    }

    /* JADX INFO: renamed from: d */
    public final void m4935d() {
        a aVar = this.f8204k;
        int i10 = this.f8198e;
        if (i10 <= 0) {
            aVar.run();
        } else {
            removeCallbacks(aVar);
            postDelayed(aVar, i10);
        }
    }

    /* JADX WARN: Code duplicated, block: B:21:0x003a  */
    /* JADX WARN: Code duplicated, block: B:28:? A[RETURN, SYNTHETIC] */
    /* JADX INFO: renamed from: e */
    public final boolean m4936e() {
        boolean z10;
        WeakHashMap<View, C10049l0> weakHashMap = C10029b0.f50993a;
        if (!C10029b0.g.m18698b(this) || getWindowVisibility() != 0) {
            return false;
        }
        View view = this;
        while (true) {
            if (view.getVisibility() == 0) {
                Object parent = view.getParent();
                if (parent == null) {
                    if (getWindowVisibility() == 0) {
                    }
                    if (z10) {
                        return true;
                    }
                    return false;
                }
                if (parent instanceof View) {
                    view = (View) parent;
                }
                z10 = true;
                if (z10) {
                    return true;
                }
                return false;
            }
            z10 = false;
            if (z10) {
                return true;
            }
            return false;
        }
    }

    @Override // android.widget.ProgressBar
    public Drawable getCurrentDrawable() {
        return isIndeterminate() ? getIndeterminateDrawable() : getProgressDrawable();
    }

    public int getHideAnimationBehavior() {
        return this.f8194a.f8215f;
    }

    @Override // android.widget.ProgressBar
    public C1370n<S> getIndeterminateDrawable() {
        return (C1370n) super.getIndeterminateDrawable();
    }

    public int[] getIndicatorColor() {
        return this.f8194a.f8212c;
    }

    @Override // android.widget.ProgressBar
    public C1365i<S> getProgressDrawable() {
        return (C1365i) super.getProgressDrawable();
    }

    public int getShowAnimationBehavior() {
        return this.f8194a.f8214e;
    }

    public int getTrackColor() {
        return this.f8194a.f8213d;
    }

    public int getTrackCornerRadius() {
        return this.f8194a.f8211b;
    }

    public int getTrackThickness() {
        return this.f8194a.f8210a;
    }

    @Override // android.view.View
    public final void invalidate() {
        super.invalidate();
        if (getCurrentDrawable() != null) {
            getCurrentDrawable().invalidateSelf();
        }
    }

    @Override // android.widget.ProgressBar, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (getProgressDrawable() != null && getIndeterminateDrawable() != null) {
            getIndeterminateDrawable().f8259H.mo4947g(this.f8192H);
        }
        C1365i<S> progressDrawable = getProgressDrawable();
        d dVar = this.f8193I;
        if (progressDrawable != null) {
            C1365i<S> progressDrawable2 = getProgressDrawable();
            if (progressDrawable2.f8252f == null) {
                progressDrawable2.f8252f = new ArrayList();
            }
            if (!progressDrawable2.f8252f.contains(dVar)) {
                progressDrawable2.f8252f.add(dVar);
            }
        }
        if (getIndeterminateDrawable() != null) {
            C1370n<S> indeterminateDrawable = getIndeterminateDrawable();
            if (indeterminateDrawable.f8252f == null) {
                indeterminateDrawable.f8252f = new ArrayList();
            }
            if (!indeterminateDrawable.f8252f.contains(dVar)) {
                indeterminateDrawable.f8252f.add(dVar);
            }
        }
        if (m4936e()) {
            if (this.f8199f > 0) {
                this.f8200g = SystemClock.uptimeMillis();
            }
            setVisibility(0);
        }
    }

    @Override // android.widget.ProgressBar, android.view.View
    public final void onDetachedFromWindow() {
        removeCallbacks(this.f8205l);
        removeCallbacks(this.f8204k);
        ((AbstractC1368l) getCurrentDrawable()).m4959e(false, false, false);
        C1370n<S> indeterminateDrawable = getIndeterminateDrawable();
        d dVar = this.f8193I;
        if (indeterminateDrawable != null) {
            getIndeterminateDrawable().m4960g(dVar);
            getIndeterminateDrawable().f8259H.mo4950j();
        }
        if (getProgressDrawable() != null) {
            getProgressDrawable().m4960g(dVar);
        }
        super.onDetachedFromWindow();
    }

    @Override // android.widget.ProgressBar, android.view.View
    public final synchronized void onDraw(Canvas canvas) {
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
    public final synchronized void onMeasure(int i10, int i11) {
        AbstractC1369m<S> currentDrawingDelegate = getCurrentDrawingDelegate();
        if (currentDrawingDelegate == null) {
            return;
        }
        setMeasuredDimension(currentDrawingDelegate.mo4943e() < 0 ? View.getDefaultSize(getSuggestedMinimumWidth(), i10) : currentDrawingDelegate.mo4943e() + getPaddingLeft() + getPaddingRight(), currentDrawingDelegate.mo4942d() < 0 ? View.getDefaultSize(getSuggestedMinimumHeight(), i11) : currentDrawingDelegate.mo4942d() + getPaddingTop() + getPaddingBottom());
    }

    @Override // android.view.View
    public final void onVisibilityChanged(View view, int i10) {
        super.onVisibilityChanged(view, i10);
        boolean z10 = i10 == 0;
        if (this.f8197d) {
            ((AbstractC1368l) getCurrentDrawable()).m4959e(m4936e(), false, z10);
        }
    }

    @Override // android.view.View
    public final void onWindowVisibilityChanged(int i10) {
        super.onWindowVisibilityChanged(i10);
        if (this.f8197d) {
            ((AbstractC1368l) getCurrentDrawable()).m4959e(m4936e(), false, false);
        }
    }

    public void setAnimatorDurationScaleProvider(C1357a c1357a) {
        this.f8201h = c1357a;
        if (getProgressDrawable() != null) {
            getProgressDrawable().f8249c = c1357a;
        }
        if (getIndeterminateDrawable() != null) {
            getIndeterminateDrawable().f8249c = c1357a;
        }
    }

    public void setHideAnimationBehavior(int i10) {
        this.f8194a.f8215f = i10;
        invalidate();
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @Override // android.widget.ProgressBar
    public synchronized void setIndeterminate(boolean z10) {
        try {
            if (z10 == isIndeterminate()) {
                return;
            }
            AbstractC1368l abstractC1368l = (AbstractC1368l) getCurrentDrawable();
            if (abstractC1368l != null) {
                abstractC1368l.m4959e(false, false, false);
            }
            super.setIndeterminate(z10);
            AbstractC1368l abstractC1368l2 = (AbstractC1368l) getCurrentDrawable();
            if (abstractC1368l2 != null) {
                abstractC1368l2.m4959e(m4936e(), false, false);
            }
            if ((abstractC1368l2 instanceof C1370n) && m4936e()) {
                ((C1370n) abstractC1368l2).f8259H.mo4949i();
            }
            this.f8202i = false;
        } catch (Throwable th2) {
            throw th2;
        }
    }

    @Override // android.widget.ProgressBar
    public void setIndeterminateDrawable(Drawable drawable) {
        if (drawable == null) {
            super.setIndeterminateDrawable(null);
        } else {
            if (!(drawable instanceof C1370n)) {
                throw new IllegalArgumentException("Cannot set framework drawable as indeterminate drawable.");
            }
            ((AbstractC1368l) drawable).m4959e(false, false, false);
            super.setIndeterminateDrawable(drawable);
        }
    }

    public void setIndicatorColor(int... iArr) {
        if (iArr.length == 0) {
            iArr = new int[]{C0062b.m334b1(R.attr.colorPrimary, getContext(), -1)};
        }
        if (!Arrays.equals(getIndicatorColor(), iArr)) {
            this.f8194a.f8212c = iArr;
            getIndeterminateDrawable().f8259H.mo4946f();
            invalidate();
        }
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @Override // android.widget.ProgressBar
    public synchronized void setProgress(int i10) {
        try {
            if (isIndeterminate()) {
                return;
            }
            mo4934c(i10, false);
        } catch (Throwable th2) {
            throw th2;
        }
    }

    @Override // android.widget.ProgressBar
    public void setProgressDrawable(Drawable drawable) {
        if (drawable == null) {
            super.setProgressDrawable(null);
        } else {
            if (!(drawable instanceof C1365i)) {
                throw new IllegalArgumentException("Cannot set framework drawable as progress drawable.");
            }
            C1365i c1365i = (C1365i) drawable;
            c1365i.m4959e(false, false, false);
            super.setProgressDrawable(c1365i);
            c1365i.setLevel((int) ((getProgress() / getMax()) * 10000.0f));
        }
    }

    public void setShowAnimationBehavior(int i10) {
        this.f8194a.f8214e = i10;
        invalidate();
    }

    public void setTrackColor(int i10) {
        S s10 = this.f8194a;
        if (s10.f8213d != i10) {
            s10.f8213d = i10;
            invalidate();
        }
    }

    public void setTrackCornerRadius(int i10) {
        S s10 = this.f8194a;
        if (s10.f8211b != i10) {
            s10.f8211b = Math.min(i10, s10.f8210a / 2);
        }
    }

    public void setTrackThickness(int i10) {
        S s10 = this.f8194a;
        if (s10.f8210a != i10) {
            s10.f8210a = i10;
            requestLayout();
        }
    }

    public void setVisibilityAfterHide(int i10) {
        if (i10 != 0 && i10 != 4 && i10 != 8) {
            throw new IllegalArgumentException("The component's visibility must be one of VISIBLE, INVISIBLE, and GONE defined in View.");
        }
        this.f8203j = i10;
    }
}
