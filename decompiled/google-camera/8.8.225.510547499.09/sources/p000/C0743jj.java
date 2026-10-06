package p000;

import android.R;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.SpinnerAdapter;
import androidx.wear.ambient.AmbientDelegate;
import com.google.android.apps.camera.bottombar.C0100R;

/* JADX INFO: renamed from: jj */
/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class C0743jj extends Spinner {

    /* JADX INFO: renamed from: e */
    private static final int[] f34154e = {R.attr.spinnerMode};

    /* JADX INFO: renamed from: a */
    public final Context f34155a;

    /* JADX INFO: renamed from: b */
    public InterfaceC0742ji f34156b;

    /* JADX INFO: renamed from: c */
    int f34157c;

    /* JADX INFO: renamed from: d */
    final Rect f34158d;

    /* JADX INFO: renamed from: f */
    private final C0266ij f34159f;

    /* JADX INFO: renamed from: g */
    private AbstractViewOnTouchListenerC0777kq f34160g;

    /* JADX INFO: renamed from: h */
    private SpinnerAdapter f34161h;

    /* JADX INFO: renamed from: i */
    private final boolean f34162i;

    public C0743jj(Context context, AttributeSet attributeSet) throws Throwable {
        TypedArray typedArrayObtainStyledAttributes;
        super(context, attributeSet, C0100R.attr.spinnerStyle);
        this.f34158d = new Rect();
        C0847nf.m17435d(this, getContext());
        AmbientDelegate ambientDelegateM1568D = AmbientDelegate.m1568D(context, attributeSet, C0193fr.f23277u, C0100R.attr.spinnerStyle, 0);
        this.f34159f = new C0266ij(this);
        int iM1616s = ambientDelegateM1568D.m1616s(4, 0);
        if (iM1616s != 0) {
            this.f34155a = new C0931qi(context, iM1616s);
        } else {
            this.f34155a = context;
        }
        TypedArray typedArray = null;
        try {
            typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, f34154e, C0100R.attr.spinnerStyle, 0);
            try {
                int i = typedArrayObtainStyledAttributes.hasValue(0) ? typedArrayObtainStyledAttributes.getInt(0, 0) : -1;
                if (typedArrayObtainStyledAttributes != null) {
                    typedArrayObtainStyledAttributes.recycle();
                }
                switch (i) {
                    case 0:
                        DialogInterfaceOnClickListenerC0737jd dialogInterfaceOnClickListenerC0737jd = new DialogInterfaceOnClickListenerC0737jd(this);
                        this.f34156b = dialogInterfaceOnClickListenerC0737jd;
                        dialogInterfaceOnClickListenerC0737jd.mo12913i(ambientDelegateM1568D.m1621x(2));
                        break;
                    case 1:
                        C0740jg c0740jg = new C0740jg(this, this.f34155a, attributeSet);
                        AmbientDelegate ambientDelegateM1568D2 = AmbientDelegate.m1568D(this.f34155a, attributeSet, C0193fr.f23277u, C0100R.attr.spinnerStyle, 0);
                        this.f34157c = ambientDelegateM1568D2.m1615r(3, -2);
                        c0740jg.m15300f(ambientDelegateM1568D2.m1618u(1));
                        c0740jg.f33933a = ambientDelegateM1568D.m1621x(2);
                        ambientDelegateM1568D2.m1622y();
                        this.f34156b = c0740jg;
                        this.f34160g = new C0282iz(this, this, c0740jg);
                        break;
                }
            } catch (Exception e) {
                if (typedArrayObtainStyledAttributes != null) {
                    typedArrayObtainStyledAttributes.recycle();
                }
            } catch (Throwable th) {
                th = th;
                typedArray = typedArrayObtainStyledAttributes;
                if (typedArray != null) {
                    typedArray.recycle();
                }
                throw th;
            }
        } catch (Exception e2) {
            typedArrayObtainStyledAttributes = null;
        } catch (Throwable th2) {
            th = th2;
        }
        CharSequence[] textArray = ((TypedArray) ambientDelegateM1568D.f1686b).getTextArray(0);
        if (textArray != null) {
            ArrayAdapter arrayAdapter = new ArrayAdapter(context, R.layout.simple_spinner_item, textArray);
            arrayAdapter.setDropDownViewResource(C0100R.layout.support_simple_spinner_dropdown_item);
            setAdapter((SpinnerAdapter) arrayAdapter);
        }
        ambientDelegateM1568D.m1622y();
        this.f34162i = true;
        SpinnerAdapter spinnerAdapter = this.f34161h;
        if (spinnerAdapter != null) {
            setAdapter(spinnerAdapter);
            this.f34161h = null;
        }
        this.f34159f.m11393d(attributeSet, C0100R.attr.spinnerStyle);
    }

    /* JADX INFO: renamed from: a */
    final int m13302a(SpinnerAdapter spinnerAdapter, Drawable drawable) {
        int i = 0;
        if (spinnerAdapter == null) {
            return 0;
        }
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 0);
        int iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), 0);
        int iMax = Math.max(0, getSelectedItemPosition());
        int iMin = Math.min(spinnerAdapter.getCount(), iMax + 15);
        int iMax2 = Math.max(0, iMax - (15 - (iMin - iMax)));
        View view = null;
        int iMax3 = 0;
        while (iMax2 < iMin) {
            int itemViewType = spinnerAdapter.getItemViewType(iMax2);
            int i2 = itemViewType != i ? itemViewType : i;
            if (itemViewType != i) {
                view = null;
            }
            view = spinnerAdapter.getView(iMax2, view, this);
            if (view.getLayoutParams() == null) {
                view.setLayoutParams(new ViewGroup.LayoutParams(-2, -2));
            }
            view.measure(iMakeMeasureSpec, iMakeMeasureSpec2);
            iMax3 = Math.max(iMax3, view.getMeasuredWidth());
            iMax2++;
            i = i2;
        }
        if (drawable == null) {
            return iMax3;
        }
        drawable.getPadding(this.f34158d);
        return iMax3 + this.f34158d.left + this.f34158d.right;
    }

    /* JADX INFO: renamed from: b */
    public final void m13303b() {
        this.f34156b.mo12916l(C0735jb.m12824b(this), C0735jb.m12823a(this));
    }

    @Override // android.view.ViewGroup, android.view.View
    protected final void drawableStateChanged() {
        super.drawableStateChanged();
        C0266ij c0266ij = this.f34159f;
        if (c0266ij != null) {
            c0266ij.m11392c();
        }
    }

    @Override // android.widget.Spinner
    public final int getDropDownHorizontalOffset() {
        InterfaceC0742ji interfaceC0742ji = this.f34156b;
        return interfaceC0742ji != null ? interfaceC0742ji.mo12905a() : super.getDropDownHorizontalOffset();
    }

    @Override // android.widget.Spinner
    public final int getDropDownVerticalOffset() {
        InterfaceC0742ji interfaceC0742ji = this.f34156b;
        return interfaceC0742ji != null ? interfaceC0742ji.mo12906b() : super.getDropDownVerticalOffset();
    }

    @Override // android.widget.Spinner
    public final int getDropDownWidth() {
        return this.f34156b != null ? this.f34157c : super.getDropDownWidth();
    }

    @Override // android.widget.Spinner
    public final Drawable getPopupBackground() {
        InterfaceC0742ji interfaceC0742ji = this.f34156b;
        return interfaceC0742ji != null ? interfaceC0742ji.mo12907c() : super.getPopupBackground();
    }

    @Override // android.widget.Spinner
    public final Context getPopupContext() {
        return this.f34155a;
    }

    @Override // android.widget.Spinner
    public final CharSequence getPrompt() {
        InterfaceC0742ji interfaceC0742ji = this.f34156b;
        return interfaceC0742ji != null ? interfaceC0742ji.mo12908d() : super.getPrompt();
    }

    @Override // android.widget.Spinner, android.widget.AdapterView, android.view.ViewGroup, android.view.View
    protected final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        InterfaceC0742ji interfaceC0742ji = this.f34156b;
        if (interfaceC0742ji == null || !interfaceC0742ji.mo12917u()) {
            return;
        }
        this.f34156b.mo12915k();
    }

    @Override // android.widget.Spinner, android.widget.AbsSpinner, android.view.View
    protected final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        if (this.f34156b == null || View.MeasureSpec.getMode(i) != Integer.MIN_VALUE) {
            return;
        }
        setMeasuredDimension(Math.min(Math.max(getMeasuredWidth(), m13302a(getAdapter(), getBackground())), View.MeasureSpec.getSize(i)), getMeasuredHeight());
    }

    @Override // android.widget.Spinner, android.widget.AbsSpinner, android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        ViewTreeObserver viewTreeObserver;
        C0741jh c0741jh = (C0741jh) parcelable;
        super.onRestoreInstanceState(c0741jh.getSuperState());
        if (!c0741jh.f34022a || (viewTreeObserver = getViewTreeObserver()) == null) {
            return;
        }
        viewTreeObserver.addOnGlobalLayoutListener(new ViewTreeObserverOnGlobalLayoutListenerC0244ho(this, 2));
    }

    @Override // android.widget.Spinner, android.widget.AbsSpinner, android.view.View
    public final Parcelable onSaveInstanceState() {
        C0741jh c0741jh = new C0741jh(super.onSaveInstanceState());
        InterfaceC0742ji interfaceC0742ji = this.f34156b;
        boolean z = false;
        if (interfaceC0742ji != null && interfaceC0742ji.mo12917u()) {
            z = true;
        }
        c0741jh.f34022a = z;
        return c0741jh;
    }

    @Override // android.widget.Spinner, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        AbstractViewOnTouchListenerC0777kq abstractViewOnTouchListenerC0777kq = this.f34160g;
        if (abstractViewOnTouchListenerC0777kq == null || !abstractViewOnTouchListenerC0777kq.onTouch(this, motionEvent)) {
            return super.onTouchEvent(motionEvent);
        }
        return true;
    }

    @Override // android.widget.Spinner, android.view.View
    public final boolean performClick() {
        InterfaceC0742ji interfaceC0742ji = this.f34156b;
        if (interfaceC0742ji == null) {
            return super.performClick();
        }
        if (interfaceC0742ji.mo12917u()) {
            return true;
        }
        m13303b();
        return true;
    }

    @Override // android.view.View
    public final void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        C0266ij c0266ij = this.f34159f;
        if (c0266ij != null) {
            c0266ij.m11398i();
        }
    }

    @Override // android.view.View
    public final void setBackgroundResource(int i) {
        super.setBackgroundResource(i);
        C0266ij c0266ij = this.f34159f;
        if (c0266ij != null) {
            c0266ij.m11394e(i);
        }
    }

    @Override // android.widget.Spinner
    public final void setDropDownHorizontalOffset(int i) {
        InterfaceC0742ji interfaceC0742ji = this.f34156b;
        if (interfaceC0742ji == null) {
            super.setDropDownHorizontalOffset(i);
        } else {
            interfaceC0742ji.mo12912h(i);
            this.f34156b.mo12911g(i);
        }
    }

    @Override // android.widget.Spinner
    public final void setDropDownVerticalOffset(int i) {
        InterfaceC0742ji interfaceC0742ji = this.f34156b;
        if (interfaceC0742ji != null) {
            interfaceC0742ji.mo12914j(i);
        } else {
            super.setDropDownVerticalOffset(i);
        }
    }

    @Override // android.widget.Spinner
    public final void setDropDownWidth(int i) {
        if (this.f34156b != null) {
            this.f34157c = i;
        } else {
            super.setDropDownWidth(i);
        }
    }

    @Override // android.widget.Spinner
    public final void setPopupBackgroundDrawable(Drawable drawable) {
        InterfaceC0742ji interfaceC0742ji = this.f34156b;
        if (interfaceC0742ji != null) {
            interfaceC0742ji.mo12910f(drawable);
        } else {
            super.setPopupBackgroundDrawable(drawable);
        }
    }

    @Override // android.widget.Spinner
    public final void setPopupBackgroundResource(int i) {
        setPopupBackgroundDrawable(C0194fs.m8752a(this.f34155a, i));
    }

    @Override // android.widget.Spinner
    public final void setPrompt(CharSequence charSequence) {
        InterfaceC0742ji interfaceC0742ji = this.f34156b;
        if (interfaceC0742ji != null) {
            interfaceC0742ji.mo12913i(charSequence);
        } else {
            super.setPrompt(charSequence);
        }
    }

    @Override // android.widget.AdapterView
    public final void setAdapter(SpinnerAdapter spinnerAdapter) {
        if (!this.f34162i) {
            this.f34161h = spinnerAdapter;
            return;
        }
        super.setAdapter(spinnerAdapter);
        if (this.f34156b != null) {
            Context context = this.f34155a;
            if (context == null) {
                context = getContext();
            }
            this.f34156b.mo12909e(new C0738je(spinnerAdapter, context.getTheme()));
        }
    }
}
