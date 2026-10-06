package android.support.v7.view.menu;

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
import androidx.wear.ambient.AmbientMode;
import p000.AbstractViewOnTouchListenerC0777kq;
import p000.C0193fr;
import p000.C0214gl;
import p000.C0227gy;
import p000.C0752js;
import p000.C0861nt;
import p000.InterfaceC0224gv;
import p000.InterfaceC0240hk;
import p000.InterfaceC0260id;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public class ActionMenuItemView extends C0752js implements View.OnClickListener, InterfaceC0240hk, InterfaceC0260id {

    /* JADX INFO: renamed from: a */
    public C0227gy f909a;

    /* JADX INFO: renamed from: b */
    public InterfaceC0224gv f910b;

    /* JADX INFO: renamed from: c */
    public AmbientMode.AmbientController f911c;

    /* JADX INFO: renamed from: d */
    private CharSequence f912d;

    /* JADX INFO: renamed from: e */
    private Drawable f913e;

    /* JADX INFO: renamed from: f */
    private AbstractViewOnTouchListenerC0777kq f914f;

    /* JADX INFO: renamed from: g */
    private boolean f915g;

    /* JADX INFO: renamed from: h */
    private int f916h;

    /* JADX INFO: renamed from: i */
    private int f917i;

    /* JADX INFO: renamed from: j */
    private int f918j;

    public ActionMenuItemView(Context context) {
        this(context, null);
    }

    /* JADX INFO: renamed from: h */
    private final void m1028h() {
        boolean z = true;
        boolean z2 = !TextUtils.isEmpty(this.f912d);
        if (this.f913e != null && ((this.f909a.f26800n & 4) != 4 || !this.f915g)) {
            z = false;
        }
        boolean z3 = z2 & z;
        setText(z3 ? this.f912d : null);
        CharSequence charSequence = this.f909a.f26798l;
        if (TextUtils.isEmpty(charSequence)) {
            setContentDescription(z3 ? null : this.f909a.f26790d);
        } else {
            setContentDescription(charSequence);
        }
        CharSequence charSequence2 = this.f909a.f26799m;
        if (TextUtils.isEmpty(charSequence2)) {
            C0861nt.m17652a(this, z3 ? null : this.f909a.f26790d);
        } else {
            C0861nt.m17652a(this, charSequence2);
        }
    }

    /* JADX INFO: renamed from: i */
    private final boolean m1029i() {
        Configuration configuration = getContext().getResources().getConfiguration();
        int i = configuration.screenWidthDp;
        int i2 = configuration.screenHeightDp;
        return i >= 480 || configuration.orientation == 2;
    }

    @Override // p000.InterfaceC0240hk
    /* JADX INFO: renamed from: a */
    public final C0227gy mo1030a() {
        return this.f909a;
    }

    /* JADX INFO: renamed from: b */
    public final boolean m1031b() {
        return !TextUtils.isEmpty(getText());
    }

    @Override // p000.InterfaceC0260id
    /* JADX INFO: renamed from: c */
    public final boolean mo1032c() {
        return m1031b();
    }

    @Override // p000.InterfaceC0260id
    /* JADX INFO: renamed from: d */
    public final boolean mo1033d() {
        return m1031b() && this.f909a.getIcon() == null;
    }

    @Override // p000.InterfaceC0240hk
    /* JADX INFO: renamed from: e */
    public final boolean mo1034e() {
        return true;
    }

    @Override // p000.InterfaceC0240hk
    /* JADX INFO: renamed from: f */
    public final void mo1035f(C0227gy c0227gy) {
        this.f909a = c0227gy;
        Drawable icon = c0227gy.getIcon();
        this.f913e = icon;
        if (icon != null) {
            int intrinsicWidth = icon.getIntrinsicWidth();
            int intrinsicHeight = icon.getIntrinsicHeight();
            int i = this.f918j;
            if (intrinsicWidth > i) {
                intrinsicHeight = (int) (intrinsicHeight * (i / intrinsicWidth));
                intrinsicWidth = i;
            }
            if (intrinsicHeight > i) {
                intrinsicWidth = (int) (intrinsicWidth * (i / intrinsicHeight));
            } else {
                i = intrinsicHeight;
            }
            icon.setBounds(0, 0, intrinsicWidth, i);
        }
        setCompoundDrawables(icon, null, null, null);
        m1028h();
        this.f912d = c0227gy.m9950f(this);
        m1028h();
        setId(c0227gy.f26787a);
        setVisibility(true != c0227gy.isVisible() ? 8 : 0);
        setEnabled(c0227gy.isEnabled());
        if (c0227gy.hasSubMenu() && this.f914f == null) {
            this.f914f = new C0214gl(this);
        }
    }

    @Override // android.widget.TextView, android.view.View
    public final CharSequence getAccessibilityClassName() {
        return Button.class.getName();
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        InterfaceC0224gv interfaceC0224gv = this.f910b;
        if (interfaceC0224gv != null) {
            interfaceC0224gv.mo1037b(this.f909a);
        }
    }

    @Override // android.widget.TextView, android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        this.f915g = m1029i();
        m1028h();
    }

    @Override // p000.C0752js, android.widget.TextView, android.view.View
    protected final void onMeasure(int i, int i2) {
        int i3;
        boolean zM1031b = m1031b();
        if (zM1031b && (i3 = this.f917i) >= 0) {
            super.setPadding(i3, getPaddingTop(), getPaddingRight(), getPaddingBottom());
        }
        super.onMeasure(i, i2);
        int mode = View.MeasureSpec.getMode(i);
        int size = View.MeasureSpec.getSize(i);
        int measuredWidth = getMeasuredWidth();
        int iMin = mode == Integer.MIN_VALUE ? Math.min(size, this.f916h) : this.f916h;
        if (mode != 1073741824 && this.f916h > 0 && measuredWidth < iMin) {
            super.onMeasure(View.MeasureSpec.makeMeasureSpec(iMin, 1073741824), i2);
        }
        if (zM1031b || this.f913e == null) {
            return;
        }
        super.setPadding((getMeasuredWidth() - this.f913e.getBounds().width()) / 2, getPaddingTop(), getPaddingRight(), getPaddingBottom());
    }

    @Override // android.widget.TextView, android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        super.onRestoreInstanceState(null);
    }

    @Override // android.widget.TextView, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        AbstractViewOnTouchListenerC0777kq abstractViewOnTouchListenerC0777kq;
        if (this.f909a.hasSubMenu() && (abstractViewOnTouchListenerC0777kq = this.f914f) != null && abstractViewOnTouchListenerC0777kq.onTouch(this, motionEvent)) {
            return true;
        }
        return super.onTouchEvent(motionEvent);
    }

    @Override // android.widget.TextView, android.view.View
    public final void setPadding(int i, int i2, int i3, int i4) {
        this.f917i = i;
        super.setPadding(i, i2, i3, i4);
    }

    public ActionMenuItemView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public ActionMenuItemView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Resources resources = context.getResources();
        this.f915g = m1029i();
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C0193fr.f23259c, i, 0);
        this.f916h = typedArrayObtainStyledAttributes.getDimensionPixelSize(0, 0);
        typedArrayObtainStyledAttributes.recycle();
        this.f918j = (int) ((resources.getDisplayMetrics().density * 32.0f) + 0.5f);
        setOnClickListener(this);
        this.f917i = -1;
        setSaveEnabled(false);
    }
}
