package p000;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import androidx.appcompat.R$styleable;
import java.util.WeakHashMap;

/* JADX INFO: renamed from: oq */
/* JADX INFO: loaded from: classes2.dex */
public final class C3422oq extends C3156jq {

    /* JADX INFO: renamed from: f */
    public final C3381nq f54708f;

    /* JADX INFO: renamed from: g */
    public Drawable f54709g;

    /* JADX INFO: renamed from: h */
    public ColorStateList f54710h;

    /* JADX INFO: renamed from: i */
    public PorterDuff.Mode f54711i;

    /* JADX INFO: renamed from: j */
    public boolean f54712j;

    /* JADX INFO: renamed from: k */
    public boolean f54713k;

    public C3422oq(C3381nq c3381nq) {
        super(c3381nq);
        this.f54710h = null;
        this.f54711i = null;
        this.f54712j = false;
        this.f54713k = false;
        this.f54708f = c3381nq;
    }

    @Override // p000.C3156jq
    /* JADX INFO: renamed from: A */
    public final void mo14587A(AttributeSet attributeSet, int i) {
        super.mo14587A(attributeSet, i);
        C3381nq c3381nq = this.f54708f;
        sq5 sq5VarM21551w = sq5.m21551w(i, 0, c3381nq.getContext(), attributeSet, R$styleable.AppCompatSeekBar);
        TypedArray typedArray = (TypedArray) sq5VarM21551w.f61249c;
        Context context = c3381nq.getContext();
        int[] iArr = R$styleable.AppCompatSeekBar;
        TypedArray typedArray2 = (TypedArray) sq5VarM21551w.f61249c;
        WeakHashMap weakHashMap = dta.f36217a;
        ata.m3035b(c3381nq, context, iArr, attributeSet, typedArray2, i, 0);
        Drawable drawableM21569k = sq5VarM21551w.m21569k(R$styleable.AppCompatSeekBar_android_thumb);
        if (drawableM21569k != null) {
            c3381nq.setThumb(drawableM21569k);
        }
        Drawable drawableM21568j = sq5VarM21551w.m21568j(R$styleable.AppCompatSeekBar_tickMark);
        Drawable drawable = this.f54709g;
        if (drawable != null) {
            drawable.setCallback(null);
        }
        this.f54709g = drawableM21568j;
        if (drawableM21568j != null) {
            drawableM21568j.setCallback(c3381nq);
            drawableM21568j.setLayoutDirection(c3381nq.getLayoutDirection());
            if (drawableM21568j.isStateful()) {
                drawableM21568j.setState(c3381nq.getDrawableState());
            }
            m18204V();
        }
        c3381nq.invalidate();
        if (typedArray.hasValue(R$styleable.AppCompatSeekBar_tickMarkTintMode)) {
            this.f54711i = wl2.m24048c(typedArray.getInt(R$styleable.AppCompatSeekBar_tickMarkTintMode, -1), this.f54711i);
            this.f54713k = true;
        }
        if (typedArray.hasValue(R$styleable.AppCompatSeekBar_tickMarkTint)) {
            this.f54710h = sq5VarM21551w.m21567i(R$styleable.AppCompatSeekBar_tickMarkTint);
            this.f54712j = true;
        }
        sq5VarM21551w.m21582y();
        m18204V();
    }

    /* JADX INFO: renamed from: V */
    public final void m18204V() {
        Drawable drawable = this.f54709g;
        if (drawable != null) {
            if (this.f54712j || this.f54713k) {
                Drawable drawableMutate = drawable.mutate();
                this.f54709g = drawableMutate;
                if (this.f54712j) {
                    drawableMutate.setTintList(this.f54710h);
                }
                if (this.f54713k) {
                    this.f54709g.setTintMode(this.f54711i);
                }
                if (this.f54709g.isStateful()) {
                    this.f54709g.setState(this.f54708f.getDrawableState());
                }
            }
        }
    }

    /* JADX INFO: renamed from: W */
    public final void m18205W(Canvas canvas) {
        if (this.f54709g != null) {
            C3381nq c3381nq = this.f54708f;
            int max = c3381nq.getMax();
            if (max > 1) {
                int intrinsicWidth = this.f54709g.getIntrinsicWidth();
                int intrinsicHeight = this.f54709g.getIntrinsicHeight();
                int i = intrinsicWidth >= 0 ? intrinsicWidth / 2 : 1;
                int i2 = intrinsicHeight >= 0 ? intrinsicHeight / 2 : 1;
                this.f54709g.setBounds(-i, -i2, i, i2);
                float width = ((c3381nq.getWidth() - c3381nq.getPaddingLeft()) - c3381nq.getPaddingRight()) / max;
                int iSave = canvas.save();
                canvas.translate(c3381nq.getPaddingLeft(), c3381nq.getHeight() / 2);
                for (int i3 = 0; i3 <= max; i3++) {
                    this.f54709g.draw(canvas);
                    canvas.translate(width, 0.0f);
                }
                canvas.restoreToCount(iSave);
            }
        }
    }
}
