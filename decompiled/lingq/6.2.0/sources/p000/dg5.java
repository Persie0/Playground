package p000;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.util.AttributeSet;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListAdapter;
import androidx.appcompat.R$styleable;

/* JADX INFO: loaded from: classes2.dex */
public class dg5 implements k69 {

    /* JADX INFO: renamed from: I */
    public ag5 f35595I;

    /* JADX INFO: renamed from: J */
    public View f35596J;

    /* JADX INFO: renamed from: K */
    public AdapterView.OnItemClickListener f35597K;

    /* JADX INFO: renamed from: L */
    public AdapterView.OnItemSelectedListener f35598L;

    /* JADX INFO: renamed from: Q */
    public final Handler f35603Q;

    /* JADX INFO: renamed from: S */
    public Rect f35605S;

    /* JADX INFO: renamed from: T */
    public boolean f35606T;

    /* JADX INFO: renamed from: U */
    public final C3120iq f35607U;

    /* JADX INFO: renamed from: a */
    public final Context f35608a;

    /* JADX INFO: renamed from: b */
    public ListAdapter f35609b;

    /* JADX INFO: renamed from: c */
    public nm2 f35610c;

    /* JADX INFO: renamed from: f */
    public int f35613f;

    /* JADX INFO: renamed from: g */
    public int f35614g;

    /* JADX INFO: renamed from: i */
    public boolean f35616i;

    /* JADX INFO: renamed from: j */
    public boolean f35617j;

    /* JADX INFO: renamed from: k */
    public boolean f35618k;

    /* JADX INFO: renamed from: d */
    public final int f35611d = -2;

    /* JADX INFO: renamed from: e */
    public int f35612e = -2;

    /* JADX INFO: renamed from: h */
    public final int f35615h = 1002;

    /* JADX INFO: renamed from: l */
    public int f35619l = 0;

    /* JADX INFO: renamed from: H */
    public final int f35594H = Integer.MAX_VALUE;

    /* JADX INFO: renamed from: M */
    public final zf5 f35599M = new zf5(this, 1);

    /* JADX INFO: renamed from: N */
    public final cg5 f35600N = new cg5(this, 0);

    /* JADX INFO: renamed from: O */
    public final bg5 f35601O = new bg5(this);

    /* JADX INFO: renamed from: P */
    public final zf5 f35602P = new zf5(this, 0);

    /* JADX INFO: renamed from: R */
    public final Rect f35604R = new Rect();

    public dg5(Context context, AttributeSet attributeSet, int i, int i2) {
        int resourceId;
        this.f35608a = context;
        this.f35603Q = new Handler(context.getMainLooper());
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.ListPopupWindow, i, i2);
        this.f35613f = typedArrayObtainStyledAttributes.getDimensionPixelOffset(R$styleable.ListPopupWindow_android_dropDownHorizontalOffset, 0);
        int dimensionPixelOffset = typedArrayObtainStyledAttributes.getDimensionPixelOffset(R$styleable.ListPopupWindow_android_dropDownVerticalOffset, 0);
        this.f35614g = dimensionPixelOffset;
        if (dimensionPixelOffset != 0) {
            this.f35616i = true;
        }
        typedArrayObtainStyledAttributes.recycle();
        C3120iq c3120iq = new C3120iq(context, attributeSet, i, i2);
        TypedArray typedArrayObtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, R$styleable.PopupWindow, i, i2);
        if (typedArrayObtainStyledAttributes2.hasValue(R$styleable.PopupWindow_overlapAnchor)) {
            c3120iq.setOverlapAnchor(typedArrayObtainStyledAttributes2.getBoolean(R$styleable.PopupWindow_overlapAnchor, false));
        }
        int i3 = R$styleable.PopupWindow_android_popupBackground;
        c3120iq.setBackgroundDrawable((!typedArrayObtainStyledAttributes2.hasValue(i3) || (resourceId = typedArrayObtainStyledAttributes2.getResourceId(i3, 0)) == 0) ? typedArrayObtainStyledAttributes2.getDrawable(i3) : bna.m3932U(context, resourceId));
        typedArrayObtainStyledAttributes2.recycle();
        this.f35607U = c3120iq;
        c3120iq.setInputMethodMode(1);
    }

    @Override // p000.k69
    /* JADX INFO: renamed from: a */
    public final boolean mo10357a() {
        return this.f35607U.isShowing();
    }

    /* JADX INFO: renamed from: b */
    public final int m10358b() {
        return this.f35613f;
    }

    /* JADX INFO: renamed from: d */
    public final void m10359d(int i) {
        this.f35613f = i;
    }

    @Override // p000.k69
    public final void dismiss() {
        C3120iq c3120iq = this.f35607U;
        c3120iq.dismiss();
        c3120iq.setContentView(null);
        this.f35610c = null;
        this.f35603Q.removeCallbacks(this.f35599M);
    }

    @Override // p000.k69
    /* JADX INFO: renamed from: f */
    public final void mo10360f() {
        int i;
        int iMakeMeasureSpec;
        int paddingBottom;
        nm2 nm2Var;
        nm2 nm2Var2 = this.f35610c;
        Context context = this.f35608a;
        C3120iq c3120iq = this.f35607U;
        if (nm2Var2 == null) {
            nm2 nm2VarMo3114q = mo3114q(context, !this.f35606T);
            this.f35610c = nm2VarMo3114q;
            nm2VarMo3114q.setAdapter(this.f35609b);
            this.f35610c.setOnItemClickListener(this.f35597K);
            this.f35610c.setFocusable(true);
            this.f35610c.setFocusableInTouchMode(true);
            this.f35610c.setOnItemSelectedListener(new wf5(this));
            this.f35610c.setOnScrollListener(this.f35601O);
            AdapterView.OnItemSelectedListener onItemSelectedListener = this.f35598L;
            if (onItemSelectedListener != null) {
                this.f35610c.setOnItemSelectedListener(onItemSelectedListener);
            }
            c3120iq.setContentView(this.f35610c);
        }
        Drawable background = c3120iq.getBackground();
        Rect rect = this.f35604R;
        if (background != null) {
            background.getPadding(rect);
            int i2 = rect.top;
            i = rect.bottom + i2;
            if (!this.f35616i) {
                this.f35614g = -i2;
            }
        } else {
            rect.setEmpty();
            i = 0;
        }
        int iM24484a = xf5.m24484a(c3120iq, this.f35596J, this.f35614g, c3120iq.getInputMethodMode() == 2);
        int i3 = this.f35611d;
        if (i3 == -1) {
            paddingBottom = iM24484a + i;
        } else {
            int i4 = this.f35612e;
            if (i4 != -2) {
                iMakeMeasureSpec = i4 != -1 ? View.MeasureSpec.makeMeasureSpec(i4, 1073741824) : View.MeasureSpec.makeMeasureSpec(context.getResources().getDisplayMetrics().widthPixels - (rect.left + rect.right), 1073741824);
            } else {
                iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(context.getResources().getDisplayMetrics().widthPixels - (rect.left + rect.right), Integer.MIN_VALUE);
            }
            int iM17494a = this.f35610c.m17494a(iMakeMeasureSpec, iM24484a);
            paddingBottom = iM17494a + (iM17494a > 0 ? this.f35610c.getPaddingBottom() + this.f35610c.getPaddingTop() + i : 0);
        }
        boolean z = c3120iq.getInputMethodMode() == 2;
        c3120iq.setWindowLayoutType(this.f35615h);
        if (c3120iq.isShowing()) {
            if (this.f35596J.isAttachedToWindow()) {
                int width = this.f35612e;
                if (width == -1) {
                    width = -1;
                } else if (width == -2) {
                    width = this.f35596J.getWidth();
                }
                if (i3 == -1) {
                    i3 = z ? paddingBottom : -1;
                    int i5 = this.f35612e;
                    if (z) {
                        c3120iq.setWidth(i5 == -1 ? -1 : 0);
                        c3120iq.setHeight(0);
                    } else {
                        c3120iq.setWidth(i5 == -1 ? -1 : 0);
                        c3120iq.setHeight(-1);
                    }
                } else if (i3 == -2) {
                    i3 = paddingBottom;
                }
                c3120iq.setOutsideTouchable(true);
                int i6 = width;
                View view = this.f35596J;
                int i7 = this.f35613f;
                int i8 = this.f35614g;
                int i9 = i6 < 0 ? -1 : i6;
                if (i3 < 0) {
                    i3 = -1;
                }
                c3120iq.update(view, i7, i8, i9, i3);
                return;
            }
            return;
        }
        int width2 = this.f35612e;
        if (width2 == -1) {
            width2 = -1;
        } else if (width2 == -2) {
            width2 = this.f35596J.getWidth();
        }
        if (i3 == -1) {
            i3 = -1;
        } else if (i3 == -2) {
            i3 = paddingBottom;
        }
        c3120iq.setWidth(width2);
        c3120iq.setHeight(i3);
        yf5.m25115b(c3120iq, true);
        c3120iq.setOutsideTouchable(true);
        c3120iq.setTouchInterceptor(this.f35600N);
        if (this.f35618k) {
            c3120iq.setOverlapAnchor(this.f35617j);
        }
        yf5.m25114a(c3120iq, this.f35605S);
        c3120iq.showAsDropDown(this.f35596J, this.f35613f, this.f35614g, this.f35619l);
        this.f35610c.setSelection(-1);
        if ((!this.f35606T || this.f35610c.isInTouchMode()) && (nm2Var = this.f35610c) != null) {
            nm2Var.setListSelectionHidden(true);
            nm2Var.requestLayout();
        }
        if (this.f35606T) {
            return;
        }
        this.f35603Q.post(this.f35602P);
    }

    /* JADX INFO: renamed from: g */
    public final Drawable m10361g() {
        return this.f35607U.getBackground();
    }

    /* JADX INFO: renamed from: i */
    public final void m10362i(Drawable drawable) {
        this.f35607U.setBackgroundDrawable(drawable);
    }

    /* JADX INFO: renamed from: j */
    public final void m10363j(int i) {
        this.f35614g = i;
        this.f35616i = true;
    }

    @Override // p000.k69
    /* JADX INFO: renamed from: k */
    public final nm2 mo10364k() {
        return this.f35610c;
    }

    /* JADX INFO: renamed from: o */
    public final int m10365o() {
        if (this.f35616i) {
            return this.f35614g;
        }
        return 0;
    }

    /* JADX INFO: renamed from: p */
    public void mo10366p(ListAdapter listAdapter) {
        ag5 ag5Var = this.f35595I;
        if (ag5Var == null) {
            this.f35595I = new ag5(this);
        } else {
            ListAdapter listAdapter2 = this.f35609b;
            if (listAdapter2 != null) {
                listAdapter2.unregisterDataSetObserver(ag5Var);
            }
        }
        this.f35609b = listAdapter;
        if (listAdapter != null) {
            listAdapter.registerDataSetObserver(this.f35595I);
        }
        nm2 nm2Var = this.f35610c;
        if (nm2Var != null) {
            nm2Var.setAdapter(this.f35609b);
        }
    }

    /* JADX INFO: renamed from: q */
    public nm2 mo3114q(Context context, boolean z) {
        return new nm2(context, z);
    }

    /* JADX INFO: renamed from: r */
    public final void m10367r(int i) {
        Drawable background = this.f35607U.getBackground();
        if (background == null) {
            this.f35612e = i;
            return;
        }
        Rect rect = this.f35604R;
        background.getPadding(rect);
        this.f35612e = rect.left + rect.right + i;
    }
}
