package p000;

import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.RippleDrawable;
import android.util.AttributeSet;
import android.view.View;
import androidx.cardview.R$style;
import androidx.cardview.R$styleable;
import androidx.cardview.widget.CardView;
import com.google.android.material.R$attr;
import com.google.android.material.R$id;
import com.google.android.material.card.MaterialCardView;
import com.google.android.material.focus.FocusRingDrawable;

/* JADX INFO: loaded from: classes2.dex */
public final class yr5 {

    /* JADX INFO: renamed from: z */
    public static final double f70324z = Math.cos(Math.toRadians(45.0d));

    /* JADX INFO: renamed from: a */
    public final MaterialCardView f70325a;

    /* JADX INFO: renamed from: b */
    public final Rect f70326b;

    /* JADX INFO: renamed from: c */
    public final fs5 f70327c;

    /* JADX INFO: renamed from: d */
    public final fs5 f70328d;

    /* JADX INFO: renamed from: e */
    public float f70329e;

    /* JADX INFO: renamed from: f */
    public int f70330f;

    /* JADX INFO: renamed from: g */
    public int f70331g;

    /* JADX INFO: renamed from: h */
    public int f70332h;

    /* JADX INFO: renamed from: i */
    public int f70333i;

    /* JADX INFO: renamed from: j */
    public Drawable f70334j;

    /* JADX INFO: renamed from: k */
    public Drawable f70335k;

    /* JADX INFO: renamed from: l */
    public ColorStateList f70336l;

    /* JADX INFO: renamed from: m */
    public ColorStateList f70337m;

    /* JADX INFO: renamed from: n */
    public p39 f70338n;

    /* JADX INFO: renamed from: o */
    public ColorStateList f70339o;

    /* JADX INFO: renamed from: p */
    public RippleDrawable f70340p;

    /* JADX INFO: renamed from: q */
    public LayerDrawable f70341q;

    /* JADX INFO: renamed from: r */
    public fs5 f70342r;

    /* JADX INFO: renamed from: s */
    public boolean f70343s;

    /* JADX INFO: renamed from: t */
    public boolean f70344t;

    /* JADX INFO: renamed from: u */
    public ValueAnimator f70345u;

    /* JADX INFO: renamed from: v */
    public final TimeInterpolator f70346v;

    /* JADX INFO: renamed from: w */
    public final int f70347w;

    /* JADX INFO: renamed from: x */
    public final int f70348x;

    /* JADX INFO: renamed from: y */
    public float f70349y;

    public yr5(MaterialCardView materialCardView, AttributeSet attributeSet, int i) {
        int i2 = MaterialCardView.f12816J;
        this.f70326b = new Rect();
        this.f70329e = -1.0f;
        this.f70343s = false;
        this.f70349y = 0.0f;
        this.f70325a = materialCardView;
        TypedArray typedArrayObtainStyledAttributes = materialCardView.getContext().obtainStyledAttributes(attributeSet, R$styleable.CardView, i, R$style.CardView);
        fs5 fs5Var = new fs5(materialCardView.getContext(), attributeSet, i, i2);
        this.f70327c = fs5Var;
        fs5Var.m12072p(materialCardView.getContext());
        fs5Var.m12078v();
        q39 q39VarM20285l = fs5Var.m12067k().m20285l();
        if (typedArrayObtainStyledAttributes.hasValue(R$styleable.CardView_cardCornerRadius)) {
            float dimension = typedArrayObtainStyledAttributes.getDimension(R$styleable.CardView_cardCornerRadius, 0.0f);
            this.f70329e = dimension;
            q39VarM20285l.m19628b(dimension);
        }
        this.f70328d = new fs5();
        m25299h(q39VarM20285l.m19627a());
        this.f70346v = r46.m20365H(materialCardView.getContext(), R$attr.motionEasingLinearInterpolator, AbstractC0853cn.f10296a);
        this.f70347w = r46.m20364G(materialCardView.getContext(), R$attr.motionDurationShort2, 300);
        this.f70348x = r46.m20364G(materialCardView.getContext(), R$attr.motionDurationShort1, 300);
        typedArrayObtainStyledAttributes.recycle();
    }

    /* JADX INFO: renamed from: b */
    public static float m25292b(i9d i9dVar, float f) {
        if (i9dVar instanceof vi8) {
            return (float) ((1.0d - f70324z) * ((double) f));
        }
        if (i9dVar instanceof tx1) {
            return f / 2.0f;
        }
        return 0.0f;
    }

    /* JADX INFO: renamed from: a */
    public final float m25293a() {
        float fMax = 0.0f;
        for (r39 r39Var : this.f70338n.mo13919c()) {
            if (r39Var != null) {
                i9d i9dVar = r39Var.f58562a;
                fs5 fs5Var = this.f70327c;
                float fM25292b = m25292b(i9dVar, fs5Var.m12069m());
                i9d i9dVar2 = r39Var.f58563b;
                float[] fArr = fs5Var.f39574X;
                float fMax2 = Math.max(fM25292b, m25292b(i9dVar2, fArr != null ? fArr[0] : fs5Var.f39578b.f36160a.mo13920d().f58567f.mo11947a(fs5Var.m12065i())));
                i9d i9dVar3 = r39Var.f58564c;
                float[] fArr2 = fs5Var.f39574X;
                float fM25292b2 = m25292b(i9dVar3, fArr2 != null ? fArr2[1] : fs5Var.f39578b.f36160a.mo13920d().f58568g.mo11947a(fs5Var.m12065i()));
                i9d i9dVar4 = r39Var.f58565d;
                float[] fArr3 = fs5Var.f39574X;
                fMax = Math.max(fMax, Math.max(fMax2, Math.max(fM25292b2, m25292b(i9dVar4, fArr3 != null ? fArr3[2] : fs5Var.f39578b.f36160a.mo13920d().f58569h.mo11947a(fs5Var.m12065i())))));
            }
        }
        return fMax;
    }

    /* JADX INFO: renamed from: c */
    public final LayerDrawable m25294c() {
        if (this.f70340p == null) {
            this.f70342r = new fs5(this.f70338n);
            this.f70340p = new RippleDrawable(this.f70336l, null, this.f70342r);
        }
        if (this.f70341q == null) {
            LayerDrawable layerDrawable = new LayerDrawable(new Drawable[]{this.f70340p, this.f70328d, this.f70335k});
            FocusRingDrawable.m6147f(this.f70325a.getContext(), layerDrawable, this.f70342r);
            layerDrawable.setId(2, R$id.mtrl_card_checked_layer_id);
            this.f70341q = layerDrawable;
        }
        return this.f70341q;
    }

    /* JADX INFO: renamed from: d */
    public final xr5 m25295d(Drawable drawable) {
        int iCeil;
        int i;
        MaterialCardView materialCardView = this.f70325a;
        if (materialCardView.getUseCompatPadding()) {
            int iCeil2 = (int) Math.ceil((materialCardView.getMaxCardElevation() * 1.5f) + (m25300i() ? m25293a() : 0.0f));
            iCeil = (int) Math.ceil(materialCardView.getMaxCardElevation() + (m25300i() ? m25293a() : 0.0f));
            i = iCeil2;
        } else {
            iCeil = 0;
            i = 0;
        }
        return new xr5(drawable, iCeil, i, iCeil, i);
    }

    /* JADX INFO: renamed from: e */
    public final void m25296e(int i, int i2) {
        int iCeil;
        int iCeil2;
        int i3;
        int i4;
        if (this.f70341q != null) {
            MaterialCardView materialCardView = this.f70325a;
            if (materialCardView.getUseCompatPadding()) {
                iCeil = (int) Math.ceil(((materialCardView.getMaxCardElevation() * 1.5f) + (m25300i() ? m25293a() : 0.0f)) * 2.0f);
                iCeil2 = (int) Math.ceil((materialCardView.getMaxCardElevation() + (m25300i() ? m25293a() : 0.0f)) * 2.0f);
            } else {
                iCeil = 0;
                iCeil2 = 0;
            }
            int i5 = this.f70332h;
            boolean z = (i5 & 8388613) == 8388613;
            int i6 = this.f70330f;
            int i7 = z ? ((i - i6) - this.f70331g) - iCeil2 : i6;
            int i8 = (i5 & 80) == 80 ? i6 : ((i2 - i6) - this.f70331g) - iCeil;
            int i9 = (i5 & 8388613) == 8388613 ? i6 : ((i - i6) - this.f70331g) - iCeil2;
            if ((i5 & 80) == 80) {
                i6 = ((i2 - i6) - this.f70331g) - iCeil;
            }
            int i10 = i6;
            if (materialCardView.getLayoutDirection() == 1) {
                i4 = i9;
                i3 = i7;
            } else {
                i3 = i9;
                i4 = i7;
            }
            this.f70341q.setLayerInset(2, i4, i10, i3, i8);
        }
    }

    /* JADX INFO: renamed from: f */
    public final void m25297f(boolean z, boolean z2) {
        Drawable drawable = this.f70335k;
        if (drawable != null) {
            if (!z2) {
                drawable.setAlpha(z ? 255 : 0);
                this.f70349y = z ? 1.0f : 0.0f;
                return;
            }
            float f = z ? 1.0f : 0.0f;
            float f2 = this.f70349y;
            if (z) {
                f2 = 1.0f - f2;
            }
            ValueAnimator valueAnimator = this.f70345u;
            if (valueAnimator != null) {
                valueAnimator.cancel();
                this.f70345u = null;
            }
            ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(this.f70349y, f);
            this.f70345u = valueAnimatorOfFloat;
            valueAnimatorOfFloat.addUpdateListener(new ba0(this, 5));
            this.f70345u.setInterpolator(this.f70346v);
            this.f70345u.setDuration((long) ((z ? this.f70347w : this.f70348x) * f2));
            this.f70345u.start();
        }
    }

    /* JADX INFO: renamed from: g */
    public final void m25298g(Drawable drawable) {
        if (drawable != null) {
            Drawable drawableMutate = drawable.mutate();
            this.f70335k = drawableMutate;
            drawableMutate.setTintList(this.f70337m);
            m25297f(this.f70325a.f12821i, false);
        } else {
            this.f70335k = null;
        }
        LayerDrawable layerDrawable = this.f70341q;
        if (layerDrawable != null) {
            layerDrawable.setDrawableByLayerId(R$id.mtrl_card_checked_layer_id, this.f70335k);
        }
    }

    /* JADX INFO: renamed from: h */
    public final void m25299h(p39 p39Var) {
        this.f70338n = p39Var;
        fs5 fs5Var = this.f70327c;
        fs5Var.m12080x(p39Var);
        this.f70328d.m12080x(p39Var);
        fs5 fs5Var2 = this.f70342r;
        if (fs5Var2 != null) {
            fs5Var2.m12080x(p39Var);
        }
        fs5Var.f39569S = !fs5Var.m12073q();
    }

    /* JADX INFO: renamed from: i */
    public final boolean m25300i() {
        MaterialCardView materialCardView = this.f70325a;
        return materialCardView.getPreventCornerOverlap() && this.f70327c.m12073q() && materialCardView.getUseCompatPadding();
    }

    /* JADX INFO: renamed from: j */
    public final boolean m25301j() {
        View view = this.f70325a;
        if (view.isClickable()) {
            return true;
        }
        while (view.isDuplicateParentStateEnabled() && (view.getParent() instanceof View)) {
            view = (View) view.getParent();
        }
        return view.isClickable();
    }

    /* JADX INFO: renamed from: k */
    public final void m25302k() {
        Drawable drawable = this.f70334j;
        Drawable drawableM25294c = m25301j() ? m25294c() : this.f70328d;
        this.f70334j = drawableM25294c;
        if (drawable != drawableM25294c) {
            MaterialCardView materialCardView = this.f70325a;
            if (materialCardView.getForeground() instanceof InsetDrawable) {
                ((InsetDrawable) materialCardView.getForeground()).setDrawable(drawableM25294c);
            } else {
                materialCardView.setForeground(m25295d(drawableM25294c));
            }
        }
    }

    /* JADX INFO: renamed from: l */
    public final void m25303l() {
        MaterialCardView materialCardView = this.f70325a;
        float cardViewRadius = 0.0f;
        float fM25293a = ((!materialCardView.getPreventCornerOverlap() || this.f70327c.m12073q()) && !m25300i()) ? 0.0f : m25293a();
        if (materialCardView.getPreventCornerOverlap() && materialCardView.getUseCompatPadding()) {
            cardViewRadius = (float) ((1.0d - f70324z) * ((double) materialCardView.getCardViewRadius()));
        }
        int i = (int) (fM25293a - cardViewRadius);
        Rect rect = this.f70326b;
        materialCardView.f1231c.set(rect.left + i, rect.top + i, rect.right + i, rect.bottom + i);
        C3156jq c3156jq = materialCardView.f1233e;
        CardView cardView = (CardView) c3156jq.f45991b;
        if (!cardView.getUseCompatPadding()) {
            c3156jq.m14604R(0, 0, 0, 0);
            return;
        }
        ni8 ni8Var = (ni8) c3156jq.f45990a;
        float f = ni8Var.f52767e;
        float f2 = ni8Var.f52763a;
        int iCeil = (int) Math.ceil(oi8.m18033a(f, f2, cardView.getPreventCornerOverlap()));
        int iCeil2 = (int) Math.ceil(oi8.m18034b(f, f2, cardView.getPreventCornerOverlap()));
        c3156jq.m14604R(iCeil, iCeil2, iCeil, iCeil2);
    }

    /* JADX INFO: renamed from: m */
    public final void m25304m() {
        boolean z = this.f70343s;
        MaterialCardView materialCardView = this.f70325a;
        if (!z) {
            materialCardView.setBackgroundInternal(m25295d(this.f70327c));
        }
        materialCardView.setForeground(m25295d(this.f70334j));
    }
}
