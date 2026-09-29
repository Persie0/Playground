package p296oc;

import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Build;
import android.util.AttributeSet;
import android.view.View;
import androidx.cardview.widget.CardView;
import com.google.android.material.card.MaterialCardView;
import com.linguist.R;
import dm.C5206f;
import gd.C5765d;
import gd.C5768g;
import gd.C5771j;
import gd.C5772k;
import java.util.WeakHashMap;
import p093ed.C5397a;
import p153hc.C6031a;
import p177ic.C6308a;
import p329q2.C8488a;
import p471x2.C10029b0;
import p471x2.C10049l0;
import p531zc.C10477a;
import va.C9700n;

/* JADX INFO: renamed from: oc.b */
/* JADX INFO: loaded from: classes.dex */
public final class C8034b {

    /* JADX INFO: renamed from: y */
    public static final double f43663y = Math.cos(Math.toRadians(45.0d));

    /* JADX INFO: renamed from: z */
    public static final ColorDrawable f43664z;

    /* JADX INFO: renamed from: a */
    public final MaterialCardView f43665a;

    /* JADX INFO: renamed from: c */
    public final C5768g f43667c;

    /* JADX INFO: renamed from: d */
    public final C5768g f43668d;

    /* JADX INFO: renamed from: e */
    public int f43669e;

    /* JADX INFO: renamed from: f */
    public int f43670f;

    /* JADX INFO: renamed from: g */
    public int f43671g;

    /* JADX INFO: renamed from: h */
    public int f43672h;

    /* JADX INFO: renamed from: i */
    public Drawable f43673i;

    /* JADX INFO: renamed from: j */
    public Drawable f43674j;

    /* JADX INFO: renamed from: k */
    public ColorStateList f43675k;

    /* JADX INFO: renamed from: l */
    public ColorStateList f43676l;

    /* JADX INFO: renamed from: m */
    public C5772k f43677m;

    /* JADX INFO: renamed from: n */
    public ColorStateList f43678n;

    /* JADX INFO: renamed from: o */
    public RippleDrawable f43679o;

    /* JADX INFO: renamed from: p */
    public LayerDrawable f43680p;

    /* JADX INFO: renamed from: q */
    public C5768g f43681q;

    /* JADX INFO: renamed from: s */
    public boolean f43683s;

    /* JADX INFO: renamed from: t */
    public ValueAnimator f43684t;

    /* JADX INFO: renamed from: u */
    public final TimeInterpolator f43685u;

    /* JADX INFO: renamed from: v */
    public final int f43686v;

    /* JADX INFO: renamed from: w */
    public final int f43687w;

    /* JADX INFO: renamed from: b */
    public final Rect f43666b = new Rect();

    /* JADX INFO: renamed from: r */
    public boolean f43682r = false;

    /* JADX INFO: renamed from: x */
    public float f43688x = 0.0f;

    static {
        f43664z = Build.VERSION.SDK_INT <= 28 ? new ColorDrawable() : null;
    }

    public C8034b(MaterialCardView materialCardView, AttributeSet attributeSet) {
        this.f43665a = materialCardView;
        C5768g c5768g = new C5768g(materialCardView.getContext(), attributeSet, R.attr.materialCardViewStyle, R.style.Widget_MaterialComponents_CardView);
        this.f43667c = c5768g;
        c5768g.m12138j(materialCardView.getContext());
        c5768g.m12143o();
        C5772k c5772k = c5768g.f34857a.f34870a;
        c5772k.getClass();
        C5772k.a aVar = new C5772k.a(c5772k);
        TypedArray typedArrayObtainStyledAttributes = materialCardView.getContext().obtainStyledAttributes(attributeSet, C6031a.f35657g, R.attr.materialCardViewStyle, R.style.CardView);
        if (typedArrayObtainStyledAttributes.hasValue(3)) {
            aVar.m12156c(typedArrayObtainStyledAttributes.getDimension(3, 0.0f));
        }
        this.f43668d = new C5768g();
        m15910h(new C5772k(aVar));
        this.f43685u = C10477a.m19429d(materialCardView.getContext(), R.attr.motionEasingLinearInterpolator, C6308a.f36523a);
        this.f43686v = C10477a.m19428c(R.attr.motionDurationShort2, materialCardView.getContext(), 300);
        this.f43687w = C10477a.m19428c(R.attr.motionDurationShort1, materialCardView.getContext(), 300);
        typedArrayObtainStyledAttributes.recycle();
    }

    /* JADX INFO: renamed from: b */
    public static float m15903b(C5206f c5206f, float f3) {
        if (c5206f instanceof C5771j) {
            return (float) ((1.0d - f43663y) * ((double) f3));
        }
        if (c5206f instanceof C5765d) {
            return f3 / 2.0f;
        }
        return 0.0f;
    }

    /* JADX INFO: renamed from: a */
    public final float m15904a() {
        C5206f c5206f = this.f43677m.f34895a;
        C5768g c5768g = this.f43667c;
        return Math.max(Math.max(m15903b(c5206f, c5768g.m12137i()), m15903b(this.f43677m.f34896b, c5768g.f34857a.f34870a.f34900f.mo12127a(c5768g.m12136h()))), Math.max(m15903b(this.f43677m.f34897c, c5768g.f34857a.f34870a.f34901g.mo12127a(c5768g.m12136h())), m15903b(this.f43677m.f34898d, c5768g.f34857a.f34870a.f34902h.mo12127a(c5768g.m12136h()))));
    }

    /* JADX INFO: renamed from: c */
    public final LayerDrawable m15905c() {
        if (this.f43679o == null) {
            int[] iArr = C5397a.f33812a;
            this.f43681q = new C5768g(this.f43677m);
            this.f43679o = new RippleDrawable(this.f43675k, null, this.f43681q);
        }
        if (this.f43680p == null) {
            LayerDrawable layerDrawable = new LayerDrawable(new Drawable[]{this.f43679o, this.f43668d, this.f43674j});
            this.f43680p = layerDrawable;
            layerDrawable.setId(2, R.id.mtrl_card_checked_layer_id);
        }
        return this.f43680p;
    }

    /* JADX INFO: renamed from: d */
    public final C8033a m15906d(Drawable drawable) {
        int iCeil;
        int i10;
        MaterialCardView materialCardView = this.f43665a;
        if (materialCardView.getUseCompatPadding()) {
            int iCeil2 = (int) Math.ceil((materialCardView.getMaxCardElevation() * 1.5f) + (m15911i() ? m15904a() : 0.0f));
            iCeil = (int) Math.ceil(materialCardView.getMaxCardElevation() + (m15911i() ? m15904a() : 0.0f));
            i10 = iCeil2;
        } else {
            iCeil = 0;
            i10 = 0;
        }
        return new C8033a(drawable, iCeil, i10, iCeil, i10);
    }

    /* JADX INFO: renamed from: e */
    public final void m15907e(int i10, int i11) {
        int iCeil;
        int iCeil2;
        int i12;
        int i13;
        if (this.f43680p != null) {
            MaterialCardView materialCardView = this.f43665a;
            if (materialCardView.getUseCompatPadding()) {
                iCeil = (int) Math.ceil(((materialCardView.getMaxCardElevation() * 1.5f) + (m15911i() ? m15904a() : 0.0f)) * 2.0f);
                iCeil2 = (int) Math.ceil((materialCardView.getMaxCardElevation() + (m15911i() ? m15904a() : 0.0f)) * 2.0f);
            } else {
                iCeil = 0;
                iCeil2 = 0;
            }
            int i14 = this.f43671g;
            int i15 = (i14 & 8388613) == 8388613 ? ((i10 - this.f43669e) - this.f43670f) - iCeil2 : this.f43669e;
            int i16 = (i14 & 80) == 80 ? this.f43669e : ((i11 - this.f43669e) - this.f43670f) - iCeil;
            int i17 = (i14 & 8388613) == 8388613 ? this.f43669e : ((i10 - this.f43669e) - this.f43670f) - iCeil2;
            int i18 = (i14 & 80) == 80 ? ((i11 - this.f43669e) - this.f43670f) - iCeil : this.f43669e;
            WeakHashMap<View, C10049l0> weakHashMap = C10029b0.f50993a;
            if (C10029b0.e.m18686d(materialCardView) == 1) {
                i13 = i17;
                i12 = i15;
            } else {
                i12 = i17;
                i13 = i15;
            }
            this.f43680p.setLayerInset(2, i13, i18, i12, i16);
        }
    }

    /* JADX INFO: renamed from: f */
    public final void m15908f(boolean z10, boolean z11) {
        Drawable drawable = this.f43674j;
        if (drawable != null) {
            if (z11) {
                float f3 = z10 ? 1.0f : 0.0f;
                float f10 = z10 ? 1.0f - this.f43688x : this.f43688x;
                ValueAnimator valueAnimator = this.f43684t;
                if (valueAnimator != null) {
                    valueAnimator.cancel();
                    this.f43684t = null;
                }
                ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(this.f43688x, f3);
                this.f43684t = valueAnimatorOfFloat;
                valueAnimatorOfFloat.addUpdateListener(new C9700n(1, this));
                this.f43684t.setInterpolator(this.f43685u);
                this.f43684t.setDuration((long) ((z10 ? this.f43686v : this.f43687w) * f10));
                this.f43684t.start();
                return;
            }
            drawable.setAlpha(z10 ? 255 : 0);
            this.f43688x = z10 ? 1.0f : 0.0f;
        }
    }

    /* JADX INFO: renamed from: g */
    public final void m15909g(Drawable drawable) {
        if (drawable != null) {
            Drawable drawableMutate = drawable.mutate();
            this.f43674j = drawableMutate;
            C8488a.b.m16570h(drawableMutate, this.f43676l);
            m15908f(this.f43665a.isChecked(), false);
        } else {
            this.f43674j = f43664z;
        }
        LayerDrawable layerDrawable = this.f43680p;
        if (layerDrawable != null) {
            layerDrawable.setDrawableByLayerId(R.id.mtrl_card_checked_layer_id, this.f43674j);
        }
    }

    /* JADX INFO: renamed from: h */
    public final void m15910h(C5772k c5772k) {
        this.f43677m = c5772k;
        C5768g c5768g = this.f43667c;
        c5768g.setShapeAppearanceModel(c5772k);
        c5768g.f34856Q = !c5768g.m12139k();
        C5768g c5768g2 = this.f43668d;
        if (c5768g2 != null) {
            c5768g2.setShapeAppearanceModel(c5772k);
        }
        C5768g c5768g3 = this.f43681q;
        if (c5768g3 != null) {
            c5768g3.setShapeAppearanceModel(c5772k);
        }
    }

    /* JADX INFO: renamed from: i */
    public final boolean m15911i() {
        MaterialCardView materialCardView = this.f43665a;
        return materialCardView.getPreventCornerOverlap() && this.f43667c.m12139k() && materialCardView.getUseCompatPadding();
    }

    /* JADX INFO: renamed from: j */
    public final void m15912j() {
        MaterialCardView materialCardView = this.f43665a;
        boolean z10 = true;
        if (!(materialCardView.getPreventCornerOverlap() && !this.f43667c.m12139k())) {
            z10 = m15911i();
        }
        float cardViewRadius = 0.0f;
        float fM15904a = z10 ? m15904a() : 0.0f;
        if (materialCardView.getPreventCornerOverlap() && materialCardView.getUseCompatPadding()) {
            cardViewRadius = (float) ((1.0d - f43663y) * ((double) materialCardView.getCardViewRadius()));
        }
        int i10 = (int) (fM15904a - cardViewRadius);
        Rect rect = this.f43666b;
        materialCardView.f1417c.set(rect.left + i10, rect.top + i10, rect.right + i10, rect.bottom + i10);
        CardView.f1414g.m11104x1(materialCardView.f1419e);
    }

    /* JADX INFO: renamed from: k */
    public final void m15913k() {
        boolean z10 = this.f43682r;
        MaterialCardView materialCardView = this.f43665a;
        if (!z10) {
            materialCardView.setBackgroundInternal(m15906d(this.f43667c));
        }
        materialCardView.setForeground(m15906d(this.f43673i));
    }
}
