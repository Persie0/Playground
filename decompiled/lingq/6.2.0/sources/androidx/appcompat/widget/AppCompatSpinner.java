package androidx.appcompat.widget;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.ArrayAdapter;
import android.widget.ListAdapter;
import android.widget.Spinner;
import android.widget.SpinnerAdapter;
import android.widget.ThemedSpinnerAdapter;
import androidx.appcompat.R$attr;
import androidx.appcompat.R$layout;
import androidx.appcompat.R$styleable;
import p000.AbstractC3545rq;
import p000.C3469pq;
import p000.C3488q8;
import p000.C3620tq;
import p000.C3731wq;
import p000.DialogInterfaceOnClickListenerC3583sq;
import p000.InterfaceC3768xq;
import p000.ViewTreeObserverOnGlobalLayoutListenerC3507qq;
import p000.bna;
import p000.oz9;
import p000.sq5;
import p000.wl1;

/* JADX INFO: loaded from: classes2.dex */
public class AppCompatSpinner extends Spinner {

    /* JADX INFO: renamed from: i */
    public static final int[] f1128i = {R.attr.spinnerMode};

    /* JADX INFO: renamed from: a */
    public final C3488q8 f1129a;

    /* JADX INFO: renamed from: b */
    public final Context f1130b;

    /* JADX INFO: renamed from: c */
    public final C3469pq f1131c;

    /* JADX INFO: renamed from: d */
    public SpinnerAdapter f1132d;

    /* JADX INFO: renamed from: e */
    public final boolean f1133e;

    /* JADX INFO: renamed from: f */
    public final InterfaceC3768xq f1134f;

    /* JADX INFO: renamed from: g */
    public int f1135g;

    /* JADX INFO: renamed from: h */
    public final Rect f1136h;

    public static class SavedState extends View.BaseSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new C0036c();

        /* JADX INFO: renamed from: a */
        public boolean f1137a;

        @Override // android.view.View.BaseSavedState, android.view.AbsSavedState, android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeByte(this.f1137a ? (byte) 1 : (byte) 0);
        }
    }

    /* JADX WARN: Code duplicated, block: B:33:0x0076 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:35:0x0079  */
    /* JADX WARN: Code duplicated, block: B:36:0x00b3  */
    /* JADX WARN: Code duplicated, block: B:39:0x00ca  */
    /* JADX WARN: Code duplicated, block: B:42:0x00e3  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r12v10 */
    /* JADX WARN: Type inference failed for: r12v11 */
    /* JADX WARN: Type inference failed for: r12v12 */
    /* JADX WARN: Type inference failed for: r12v3 */
    /* JADX WARN: Type inference failed for: r12v4 */
    /* JADX WARN: Type inference failed for: r12v7, types: [android.content.res.TypedArray] */
    /* JADX WARN: Type inference failed for: r3v2 */
    /* JADX WARN: Type inference failed for: r3v3 */
    /* JADX WARN: Type inference failed for: r3v4, types: [android.content.res.TypedArray] */
    /* JADX WARN: Type inference failed for: r7v0, types: [android.view.View, androidx.appcompat.widget.AppCompatSpinner] */
    public AppCompatSpinner(Context context, AttributeSet attributeSet, int i, int i2, Resources.Theme theme) throws Throwable {
        TypedArray typedArrayObtainStyledAttributes;
        CharSequence[] textArray;
        SpinnerAdapter spinnerAdapter;
        super(context, attributeSet, i);
        this.f1136h = new Rect();
        oz9.m18842a(this, getContext());
        sq5 sq5VarM21551w = sq5.m21551w(i, 0, context, attributeSet, R$styleable.Spinner);
        TypedArray typedArray = (TypedArray) sq5VarM21551w.f61249c;
        this.f1129a = new C3488q8((View) this);
        if (theme != null) {
            wl1 wl1Var = new wl1(context);
            wl1Var.f66990b = theme;
            this.f1130b = wl1Var;
        } else {
            int resourceId = typedArray.getResourceId(R$styleable.Spinner_popupTheme, 0);
            if (resourceId != 0) {
                this.f1130b = new wl1(context, resourceId);
            } else {
                this.f1130b = context;
            }
        }
        ?? r12 = -1;
        ?? r3 = 0;
        try {
            if (i2 == -1) {
                try {
                    typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, f1128i, i, 0);
                    try {
                        boolean zHasValue = typedArrayObtainStyledAttributes.hasValue(0);
                        r12 = typedArrayObtainStyledAttributes;
                        if (zHasValue) {
                            i2 = typedArrayObtainStyledAttributes.getInt(0, 0);
                            r12 = typedArrayObtainStyledAttributes;
                        }
                    } catch (Exception e) {
                        e = e;
                        Log.i("AppCompatSpinner", "Could not read android:spinnerMode", e);
                        r12 = typedArrayObtainStyledAttributes;
                        if (typedArrayObtainStyledAttributes != null) {
                        }
                        if (i2 != 0) {
                            DialogInterfaceOnClickListenerC3583sq dialogInterfaceOnClickListenerC3583sq = new DialogInterfaceOnClickListenerC3583sq(this);
                            this.f1134f = dialogInterfaceOnClickListenerC3583sq;
                            dialogInterfaceOnClickListenerC3583sq.f61218c = typedArray.getString(R$styleable.Spinner_android_prompt);
                        } else if (i2 == 1) {
                            C3731wq c3731wq = new C3731wq(this, this.f1130b, attributeSet, i);
                            sq5 sq5VarM21551w2 = sq5.m21551w(i, 0, this.f1130b, attributeSet, R$styleable.Spinner);
                            this.f1135g = ((TypedArray) sq5VarM21551w2.f61249c).getLayoutDimension(R$styleable.Spinner_android_dropDownWidth, -2);
                            c3731wq.m10362i(sq5VarM21551w2.m21568j(R$styleable.Spinner_android_popupBackground));
                            c3731wq.f67163V = typedArray.getString(R$styleable.Spinner_android_prompt);
                            sq5VarM21551w2.m21582y();
                            this.f1134f = c3731wq;
                            this.f1131c = new C3469pq(this, this, c3731wq);
                        }
                        textArray = typedArray.getTextArray(R$styleable.Spinner_android_entries);
                        if (textArray != null) {
                            ArrayAdapter arrayAdapter = new ArrayAdapter(context, R.layout.simple_spinner_item, textArray);
                            arrayAdapter.setDropDownViewResource(R$layout.support_simple_spinner_dropdown_item);
                            setAdapter(arrayAdapter);
                        }
                        sq5VarM21551w.m21582y();
                        this.f1133e = true;
                        spinnerAdapter = this.f1132d;
                        if (spinnerAdapter != null) {
                            setAdapter(spinnerAdapter);
                            this.f1132d = null;
                        }
                        this.f1129a.m19756y(attributeSet, i);
                    }
                } catch (Exception e2) {
                    e = e2;
                    typedArrayObtainStyledAttributes = null;
                } catch (Throwable th) {
                    th = th;
                    if (r3 != 0) {
                        r3.recycle();
                    }
                    throw th;
                }
                r12.recycle();
            }
            if (i2 != 0) {
                DialogInterfaceOnClickListenerC3583sq dialogInterfaceOnClickListenerC3583sq2 = new DialogInterfaceOnClickListenerC3583sq(this);
                this.f1134f = dialogInterfaceOnClickListenerC3583sq2;
                dialogInterfaceOnClickListenerC3583sq2.f61218c = typedArray.getString(R$styleable.Spinner_android_prompt);
            } else if (i2 == 1) {
                C3731wq c3731wq2 = new C3731wq(this, this.f1130b, attributeSet, i);
                sq5 sq5VarM21551w3 = sq5.m21551w(i, 0, this.f1130b, attributeSet, R$styleable.Spinner);
                this.f1135g = ((TypedArray) sq5VarM21551w3.f61249c).getLayoutDimension(R$styleable.Spinner_android_dropDownWidth, -2);
                c3731wq2.m10362i(sq5VarM21551w3.m21568j(R$styleable.Spinner_android_popupBackground));
                c3731wq2.f67163V = typedArray.getString(R$styleable.Spinner_android_prompt);
                sq5VarM21551w3.m21582y();
                this.f1134f = c3731wq2;
                this.f1131c = new C3469pq(this, this, c3731wq2);
            }
            textArray = typedArray.getTextArray(R$styleable.Spinner_android_entries);
            if (textArray != null) {
                ArrayAdapter arrayAdapter2 = new ArrayAdapter(context, R.layout.simple_spinner_item, textArray);
                arrayAdapter2.setDropDownViewResource(R$layout.support_simple_spinner_dropdown_item);
                setAdapter(arrayAdapter2);
            }
            sq5VarM21551w.m21582y();
            this.f1133e = true;
            spinnerAdapter = this.f1132d;
            if (spinnerAdapter != null) {
                setAdapter(spinnerAdapter);
                this.f1132d = null;
            }
            this.f1129a.m19756y(attributeSet, i);
        } catch (Throwable th2) {
            th = th2;
            r3 = r12;
        }
    }

    /* JADX INFO: renamed from: a */
    public final int m679a(SpinnerAdapter spinnerAdapter, Drawable drawable) {
        int i = 0;
        if (spinnerAdapter == null) {
            return 0;
        }
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 0);
        int iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), 0);
        int iMax = Math.max(0, getSelectedItemPosition());
        int iMin = Math.min(spinnerAdapter.getCount(), iMax + 15);
        View view = null;
        int iMax2 = 0;
        for (int iMax3 = Math.max(0, iMax - (15 - (iMin - iMax))); iMax3 < iMin; iMax3++) {
            int itemViewType = spinnerAdapter.getItemViewType(iMax3);
            if (itemViewType != i) {
                view = null;
                i = itemViewType;
            }
            view = spinnerAdapter.getView(iMax3, view, this);
            if (view.getLayoutParams() == null) {
                view.setLayoutParams(new ViewGroup.LayoutParams(-2, -2));
            }
            view.measure(iMakeMeasureSpec, iMakeMeasureSpec2);
            iMax2 = Math.max(iMax2, view.getMeasuredWidth());
        }
        if (drawable == null) {
            return iMax2;
        }
        Rect rect = this.f1136h;
        drawable.getPadding(rect);
        return rect.left + rect.right + iMax2;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        C3488q8 c3488q8 = this.f1129a;
        if (c3488q8 != null) {
            c3488q8.m19734b();
        }
    }

    @Override // android.widget.Spinner
    public int getDropDownHorizontalOffset() {
        InterfaceC3768xq interfaceC3768xq = this.f1134f;
        return interfaceC3768xq != null ? interfaceC3768xq.mo21536b() : super.getDropDownHorizontalOffset();
    }

    @Override // android.widget.Spinner
    public int getDropDownVerticalOffset() {
        InterfaceC3768xq interfaceC3768xq = this.f1134f;
        return interfaceC3768xq != null ? interfaceC3768xq.mo21545o() : super.getDropDownVerticalOffset();
    }

    @Override // android.widget.Spinner
    public int getDropDownWidth() {
        return this.f1134f != null ? this.f1135g : super.getDropDownWidth();
    }

    public final InterfaceC3768xq getInternalPopup() {
        return this.f1134f;
    }

    @Override // android.widget.Spinner
    public Drawable getPopupBackground() {
        InterfaceC3768xq interfaceC3768xq = this.f1134f;
        return interfaceC3768xq != null ? interfaceC3768xq.mo21539g() : super.getPopupBackground();
    }

    @Override // android.widget.Spinner
    public Context getPopupContext() {
        return this.f1130b;
    }

    @Override // android.widget.Spinner
    public CharSequence getPrompt() {
        InterfaceC3768xq interfaceC3768xq = this.f1134f;
        return interfaceC3768xq != null ? interfaceC3768xq.mo21538e() : super.getPrompt();
    }

    public ColorStateList getSupportBackgroundTintList() {
        C3488q8 c3488q8 = this.f1129a;
        if (c3488q8 != null) {
            return c3488q8.m19753v();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        C3488q8 c3488q8 = this.f1129a;
        if (c3488q8 != null) {
            return c3488q8.m19754w();
        }
        return null;
    }

    @Override // android.widget.Spinner, android.widget.AdapterView, android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        InterfaceC3768xq interfaceC3768xq = this.f1134f;
        if (interfaceC3768xq == null || !interfaceC3768xq.mo21535a()) {
            return;
        }
        interfaceC3768xq.dismiss();
    }

    @Override // android.widget.Spinner, android.widget.AbsSpinner, android.view.View
    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        if (this.f1134f == null || View.MeasureSpec.getMode(i) != Integer.MIN_VALUE) {
            return;
        }
        setMeasuredDimension(Math.min(Math.max(getMeasuredWidth(), m679a(getAdapter(), getBackground())), View.MeasureSpec.getSize(i)), getMeasuredHeight());
    }

    @Override // android.widget.Spinner, android.widget.AbsSpinner, android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        ViewTreeObserver viewTreeObserver;
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.getSuperState());
        if (!savedState.f1137a || (viewTreeObserver = getViewTreeObserver()) == null) {
            return;
        }
        viewTreeObserver.addOnGlobalLayoutListener(new ViewTreeObserverOnGlobalLayoutListenerC3507qq(this, 0));
    }

    @Override // android.widget.Spinner, android.widget.AbsSpinner, android.view.View
    public final Parcelable onSaveInstanceState() {
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        InterfaceC3768xq interfaceC3768xq = this.f1134f;
        savedState.f1137a = interfaceC3768xq != null && interfaceC3768xq.mo21535a();
        return savedState;
    }

    @Override // android.widget.Spinner, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        C3469pq c3469pq = this.f1131c;
        if (c3469pq == null || !c3469pq.onTouch(this, motionEvent)) {
            return super.onTouchEvent(motionEvent);
        }
        return true;
    }

    @Override // android.widget.Spinner, android.view.View
    public final boolean performClick() {
        InterfaceC3768xq interfaceC3768xq = this.f1134f;
        if (interfaceC3768xq == null) {
            return super.performClick();
        }
        if (interfaceC3768xq.mo21535a()) {
            return true;
        }
        interfaceC3768xq.mo21544n(getTextDirection(), getTextAlignment());
        return true;
    }

    @Override // android.widget.AdapterView
    public void setAdapter(SpinnerAdapter spinnerAdapter) {
        if (!this.f1133e) {
            this.f1132d = spinnerAdapter;
            return;
        }
        super.setAdapter(spinnerAdapter);
        InterfaceC3768xq interfaceC3768xq = this.f1134f;
        if (interfaceC3768xq != null) {
            Context context = this.f1130b;
            if (context == null) {
                context = getContext();
            }
            Resources.Theme theme = context.getTheme();
            C3620tq c3620tq = new C3620tq();
            c3620tq.f62718a = spinnerAdapter;
            if (spinnerAdapter instanceof ListAdapter) {
                c3620tq.f62719b = (ListAdapter) spinnerAdapter;
            }
            if (theme != null && (spinnerAdapter instanceof ThemedSpinnerAdapter)) {
                AbstractC3545rq.m20743a((ThemedSpinnerAdapter) spinnerAdapter, theme);
            }
            interfaceC3768xq.mo10366p(c3620tq);
        }
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        C3488q8 c3488q8 = this.f1129a;
        if (c3488q8 != null) {
            c3488q8.m19715A();
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i) {
        super.setBackgroundResource(i);
        C3488q8 c3488q8 = this.f1129a;
        if (c3488q8 != null) {
            c3488q8.m19716B(i);
        }
    }

    @Override // android.widget.Spinner
    public void setDropDownHorizontalOffset(int i) {
        InterfaceC3768xq interfaceC3768xq = this.f1134f;
        if (interfaceC3768xq == null) {
            super.setDropDownHorizontalOffset(i);
        } else {
            interfaceC3768xq.mo21543l(i);
            interfaceC3768xq.mo21537d(i);
        }
    }

    @Override // android.widget.Spinner
    public void setDropDownVerticalOffset(int i) {
        InterfaceC3768xq interfaceC3768xq = this.f1134f;
        if (interfaceC3768xq != null) {
            interfaceC3768xq.mo21542j(i);
        } else {
            super.setDropDownVerticalOffset(i);
        }
    }

    @Override // android.widget.Spinner
    public void setDropDownWidth(int i) {
        if (this.f1134f != null) {
            this.f1135g = i;
        } else {
            super.setDropDownWidth(i);
        }
    }

    @Override // android.widget.Spinner
    public void setPopupBackgroundDrawable(Drawable drawable) {
        InterfaceC3768xq interfaceC3768xq = this.f1134f;
        if (interfaceC3768xq != null) {
            interfaceC3768xq.mo21541i(drawable);
        } else {
            super.setPopupBackgroundDrawable(drawable);
        }
    }

    @Override // android.widget.Spinner
    public void setPopupBackgroundResource(int i) {
        setPopupBackgroundDrawable(bna.m3932U(getPopupContext(), i));
    }

    @Override // android.widget.Spinner
    public void setPrompt(CharSequence charSequence) {
        InterfaceC3768xq interfaceC3768xq = this.f1134f;
        if (interfaceC3768xq != null) {
            interfaceC3768xq.mo21540h(charSequence);
        } else {
            super.setPrompt(charSequence);
        }
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        C3488q8 c3488q8 = this.f1129a;
        if (c3488q8 != null) {
            c3488q8.m19726L(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        C3488q8 c3488q8 = this.f1129a;
        if (c3488q8 != null) {
            c3488q8.m19727M(mode);
        }
    }

    public AppCompatSpinner(Context context, int i) {
        this(context, null, R$attr.spinnerStyle, i);
    }

    public AppCompatSpinner(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R$attr.spinnerStyle);
    }

    public AppCompatSpinner(Context context, AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, -1);
    }

    public AppCompatSpinner(Context context, AttributeSet attributeSet, int i, int i2) {
        this(context, attributeSet, i, i2, null);
    }

    public AppCompatSpinner(Context context) {
        this(context, (AttributeSet) null);
    }
}
