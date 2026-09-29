package androidx.appcompat.view.menu;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;
import androidx.appcompat.R$styleable;
import p000.AbstractC3599t5;
import p000.C3048gr;
import p000.C3561s5;
import p000.InterfaceC3784y5;
import p000.a6a;
import p000.gw5;
import p000.hw5;
import p000.hx5;
import p000.mw5;

/* JADX INFO: loaded from: classes2.dex */
public class ActionMenuItemView extends C3048gr implements hx5, View.OnClickListener, InterfaceC3784y5 {

    /* JADX INFO: renamed from: H */
    public boolean f1017H;

    /* JADX INFO: renamed from: I */
    public boolean f1018I;

    /* JADX INFO: renamed from: J */
    public final int f1019J;

    /* JADX INFO: renamed from: K */
    public int f1020K;

    /* JADX INFO: renamed from: L */
    public final int f1021L;

    /* JADX INFO: renamed from: g */
    public mw5 f1022g;

    /* JADX INFO: renamed from: h */
    public CharSequence f1023h;

    /* JADX INFO: renamed from: i */
    public Drawable f1024i;

    /* JADX INFO: renamed from: j */
    public gw5 f1025j;

    /* JADX INFO: renamed from: k */
    public C3561s5 f1026k;

    /* JADX INFO: renamed from: l */
    public AbstractC3599t5 f1027l;

    public ActionMenuItemView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Resources resources = context.getResources();
        this.f1017H = m645f();
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.ActionMenuItemView, i, 0);
        this.f1019J = typedArrayObtainStyledAttributes.getDimensionPixelSize(R$styleable.ActionMenuItemView_android_minWidth, 0);
        typedArrayObtainStyledAttributes.recycle();
        this.f1021L = (int) ((resources.getDisplayMetrics().density * 32.0f) + 0.5f);
        setOnClickListener(this);
        this.f1020K = -1;
        setSaveEnabled(false);
    }

    @Override // p000.InterfaceC3784y5
    /* JADX INFO: renamed from: a */
    public final boolean mo641a() {
        return m644e();
    }

    @Override // p000.InterfaceC3784y5
    /* JADX INFO: renamed from: b */
    public final boolean mo642b() {
        return m644e() && this.f1022g.getIcon() == null;
    }

    @Override // p000.hx5
    /* JADX INFO: renamed from: c */
    public final void mo643c(mw5 mw5Var) {
        this.f1022g = mw5Var;
        setIcon(mw5Var.getIcon());
        setTitle(mw5Var.getTitleCondensed());
        setId(mw5Var.f51942a);
        setVisibility(mw5Var.isVisible() ? 0 : 8);
        setEnabled(mw5Var.isEnabled());
        if (mw5Var.hasSubMenu() && this.f1026k == null) {
            this.f1026k = new C3561s5(this);
        }
    }

    /* JADX INFO: renamed from: e */
    public final boolean m644e() {
        return !TextUtils.isEmpty(getText());
    }

    /* JADX INFO: renamed from: f */
    public final boolean m645f() {
        Configuration configuration = getContext().getResources().getConfiguration();
        int i = configuration.screenWidthDp;
        int i2 = configuration.screenHeightDp;
        if (i < 480) {
            return (i >= 640 && i2 >= 480) || configuration.orientation == 2;
        }
        return true;
    }

    /* JADX INFO: renamed from: g */
    public final void m646g() {
        boolean z = true;
        boolean z2 = !TextUtils.isEmpty(this.f1023h);
        if (this.f1024i != null && ((this.f1022g.f51966y & 4) != 4 || (!this.f1017H && !this.f1018I))) {
            z = false;
        }
        boolean z3 = z2 & z;
        setText(z3 ? this.f1023h : null);
        CharSequence charSequence = this.f1022g.f51958q;
        if (TextUtils.isEmpty(charSequence)) {
            setContentDescription(z3 ? null : this.f1022g.f51946e);
        } else {
            setContentDescription(charSequence);
        }
        CharSequence charSequence2 = this.f1022g.f51959r;
        if (TextUtils.isEmpty(charSequence2)) {
            a6a.m135a(this, z3 ? null : this.f1022g.f51946e);
        } else {
            a6a.m135a(this, charSequence2);
        }
    }

    @Override // android.widget.TextView, android.view.View
    public CharSequence getAccessibilityClassName() {
        return Button.class.getName();
    }

    @Override // p000.hx5
    public mw5 getItemData() {
        return this.f1022g;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        gw5 gw5Var = this.f1025j;
        if (gw5Var != null) {
            gw5Var.mo647a(this.f1022g);
        }
    }

    @Override // android.widget.TextView, android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        this.f1017H = m645f();
        m646g();
    }

    @Override // p000.C3048gr, android.widget.TextView, android.view.View
    public final void onMeasure(int i, int i2) {
        int i3;
        boolean zM644e = m644e();
        if (zM644e && (i3 = this.f1020K) >= 0) {
            super.setPadding(i3, getPaddingTop(), getPaddingRight(), getPaddingBottom());
        }
        super.onMeasure(i, i2);
        int mode = View.MeasureSpec.getMode(i);
        int size = View.MeasureSpec.getSize(i);
        int measuredWidth = getMeasuredWidth();
        int i4 = this.f1019J;
        int iMin = mode == Integer.MIN_VALUE ? Math.min(size, i4) : i4;
        if (mode != 1073741824 && i4 > 0 && measuredWidth < iMin) {
            super.onMeasure(View.MeasureSpec.makeMeasureSpec(iMin, 1073741824), i2);
        }
        if (zM644e || this.f1024i == null) {
            return;
        }
        super.setPadding((getMeasuredWidth() - this.f1024i.getBounds().width()) / 2, getPaddingTop(), getPaddingRight(), getPaddingBottom());
    }

    @Override // android.widget.TextView, android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        super.onRestoreInstanceState(null);
    }

    @Override // android.widget.TextView, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        C3561s5 c3561s5;
        if (this.f1022g.hasSubMenu() && (c3561s5 = this.f1026k) != null && c3561s5.onTouch(this, motionEvent)) {
            return true;
        }
        return super.onTouchEvent(motionEvent);
    }

    public void setCheckable(boolean z) {
    }

    public void setChecked(boolean z) {
    }

    public void setExpandedFormat(boolean z) {
        if (this.f1018I != z) {
            this.f1018I = z;
            mw5 mw5Var = this.f1022g;
            if (mw5Var != null) {
                hw5 hw5Var = mw5Var.f51955n;
                hw5Var.f43047k = true;
                hw5Var.m13533p(true);
            }
        }
    }

    public void setIcon(Drawable drawable) {
        this.f1024i = drawable;
        if (drawable != null) {
            int intrinsicWidth = drawable.getIntrinsicWidth();
            int intrinsicHeight = drawable.getIntrinsicHeight();
            int i = this.f1021L;
            if (intrinsicWidth > i) {
                intrinsicHeight = (int) (intrinsicHeight * (i / intrinsicWidth));
                intrinsicWidth = i;
            }
            if (intrinsicHeight > i) {
                intrinsicWidth = (int) (intrinsicWidth * (i / intrinsicHeight));
            } else {
                i = intrinsicHeight;
            }
            drawable.setBounds(0, 0, intrinsicWidth, i);
        }
        setCompoundDrawables(drawable, null, null, null);
        m646g();
    }

    public void setItemInvoker(gw5 gw5Var) {
        this.f1025j = gw5Var;
    }

    @Override // android.widget.TextView, android.view.View
    public final void setPadding(int i, int i2, int i3, int i4) {
        this.f1020K = i;
        super.setPadding(i, i2, i3, i4);
    }

    public void setPopupCallback(AbstractC3599t5 abstractC3599t5) {
        this.f1027l = abstractC3599t5;
    }

    public void setTitle(CharSequence charSequence) {
        this.f1023h = charSequence;
        m646g();
    }

    public ActionMenuItemView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public ActionMenuItemView(Context context) {
        this(context, null);
    }
}
