package p000;

import android.R;
import android.animation.Animator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.AnimatedStateListDrawable;
import android.graphics.drawable.AnimatedVectorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.autofill.AutofillManager;
import android.widget.CompoundButton;
import androidx.wear.ambient.AmbientDelegate;
import com.google.android.apps.camera.bottombar.C0100R;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashSet;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class mhm extends C0267ik {

    /* JADX INFO: renamed from: e */
    private static final int f40511e = C0100R.style.Widget_MaterialComponents_CompoundButton_CheckBox;

    /* JADX INFO: renamed from: f */
    private static final int[] f40512f = {C0100R.attr.state_indeterminate};

    /* JADX INFO: renamed from: g */
    private static final int[] f40513g = {C0100R.attr.state_error};

    /* JADX INFO: renamed from: h */
    private static final int[][] f40514h = {new int[]{R.attr.state_enabled, C0100R.attr.state_error}, new int[]{R.attr.state_enabled, R.attr.state_checked}, new int[]{R.attr.state_enabled, -16842912}, new int[]{-16842910, R.attr.state_checked}, new int[]{-16842910, -16842912}};

    /* JADX INFO: renamed from: i */
    private static final int f40515i = Resources.getSystem().getIdentifier("btn_check_material_anim", "drawable", "android");

    /* JADX INFO: renamed from: b */
    ColorStateList f40516b;

    /* JADX INFO: renamed from: c */
    final ColorStateList f40517c;

    /* JADX INFO: renamed from: d */
    public int[] f40518d;

    /* JADX INFO: renamed from: j */
    private final LinkedHashSet f40519j;

    /* JADX INFO: renamed from: k */
    private ColorStateList f40520k;

    /* JADX INFO: renamed from: l */
    private boolean f40521l;

    /* JADX INFO: renamed from: m */
    private final boolean f40522m;

    /* JADX INFO: renamed from: n */
    private final boolean f40523n;

    /* JADX INFO: renamed from: o */
    private final CharSequence f40524o;

    /* JADX INFO: renamed from: p */
    private Drawable f40525p;

    /* JADX INFO: renamed from: q */
    private Drawable f40526q;

    /* JADX INFO: renamed from: r */
    private boolean f40527r;

    /* JADX INFO: renamed from: s */
    private final PorterDuff.Mode f40528s;

    /* JADX INFO: renamed from: t */
    private int f40529t;

    /* JADX INFO: renamed from: u */
    private boolean f40530u;

    /* JADX INFO: renamed from: v */
    private CharSequence f40531v;

    /* JADX INFO: renamed from: w */
    private CompoundButton.OnCheckedChangeListener f40532w;

    /* JADX INFO: renamed from: x */
    private final ati f40533x;

    /* JADX INFO: renamed from: y */
    private final atc f40534y;

    /* JADX WARN: Illegal instructions before constructor call */
    public mhm(Context context, AttributeSet attributeSet) {
        int iM1616s;
        ColorStateList colorStateListM171c;
        int i = f40511e;
        super(mmp.m16632a(context, attributeSet, C0100R.attr.checkboxStyle, i), attributeSet);
        new LinkedHashSet();
        this.f40519j = new LinkedHashSet();
        Context context2 = getContext();
        ati atiVar = new ati(context2);
        Drawable drawableM188a = ach.m188a(context2.getResources(), C0100R.drawable.mtrl_checkbox_button_checked_unchecked, context2.getTheme());
        drawableM188a.setCallback(atiVar.f2306d);
        new atg(drawableM188a.getConstantState());
        atiVar.f2308e = drawableM188a;
        this.f40533x = atiVar;
        this.f40534y = new mhj(this);
        Context context3 = getContext();
        this.f40525p = ahh.m669a(this);
        ColorStateList buttonTintList = this.f40516b;
        if (buttonTintList == null) {
            buttonTintList = super.getButtonTintList() != null ? super.getButtonTintList() : null;
        }
        this.f40516b = buttonTintList;
        C0269im c0269im = this.f31268a;
        if (c0269im != null) {
            c0269im.f31468b = true;
            c0269im.m11454a();
        }
        int[] iArr = mhn.f40535a;
        mjb.m16439b(context3, attributeSet, C0100R.attr.checkboxStyle, i);
        mjb.m16440c(context3, attributeSet, iArr, C0100R.attr.checkboxStyle, i, new int[0]);
        AmbientDelegate ambientDelegateM1568D = AmbientDelegate.m1568D(context3, attributeSet, iArr, C0100R.attr.checkboxStyle, i);
        this.f40526q = ambientDelegateM1568D.m1618u(2);
        if (this.f40525p != null && mjb.m16441d(context3)) {
            int iM1616s2 = ambientDelegateM1568D.m1616s(0, 0);
            int iM1616s3 = ambientDelegateM1568D.m1616s(1, 0);
            if (iM1616s2 == f40515i && iM1616s3 == 0) {
                super.setButtonDrawable((Drawable) null);
                this.f40525p = C0194fs.m8752a(context3, C0100R.drawable.mtrl_checkbox_button);
                this.f40527r = true;
                if (this.f40526q == null) {
                    this.f40526q = C0194fs.m8752a(context3, C0100R.drawable.mtrl_checkbox_button_icon);
                }
            }
        }
        this.f40517c = (!ambientDelegateM1568D.m1575A(3) || (iM1616s = ambientDelegateM1568D.m1616s(3, 0)) == 0 || (colorStateListM171c = abx.m171c(context3, iM1616s)) == null) ? ambientDelegateM1568D.m1617t(3) : colorStateListM171c;
        this.f40528s = lij.m15400H(ambientDelegateM1568D.m1613p(4, -1), PorterDuff.Mode.SRC_IN);
        this.f40521l = ambientDelegateM1568D.m1623z(10, false);
        this.f40522m = ambientDelegateM1568D.m1623z(6, true);
        this.f40523n = ambientDelegateM1568D.m1623z(9, false);
        this.f40524o = ambientDelegateM1568D.m1620w(8);
        if (ambientDelegateM1568D.m1575A(7)) {
            m16380a(ambientDelegateM1568D.m1613p(7, 0));
        }
        ambientDelegateM1568D.m1622y();
        m16378b();
    }

    /* JADX INFO: renamed from: b */
    private final void m16378b() {
        int intrinsicHeight;
        int intrinsicWidth;
        ColorStateList colorStateList;
        ColorStateList colorStateList2;
        ati atiVar;
        Animator.AnimatorListener animatorListener;
        this.f40525p = kxk.m15021n(this.f40525p, this.f40516b, ahg.m666b(this));
        this.f40526q = kxk.m15021n(this.f40526q, this.f40517c, this.f40528s);
        if (this.f40527r) {
            ati atiVar2 = this.f40533x;
            if (atiVar2 != null) {
                atc atcVar = this.f40534y;
                if (atcVar != null) {
                    Drawable drawable = atiVar2.f2308e;
                    if (drawable != null) {
                        ath.m1983c((AnimatedVectorDrawable) drawable, atcVar.m1978a());
                    }
                    ArrayList arrayList = atiVar2.f2305c;
                    if (arrayList != null) {
                        arrayList.remove(atcVar);
                        if (atiVar2.f2305c.size() == 0 && (animatorListener = atiVar2.f2304b) != null) {
                            atiVar2.f2303a.f2299c.removeListener(animatorListener);
                            atiVar2.f2304b = null;
                        }
                    }
                }
                ati atiVar3 = this.f40533x;
                atc atcVar2 = this.f40534y;
                if (atcVar2 != null) {
                    Drawable drawable2 = atiVar3.f2308e;
                    if (drawable2 != null) {
                        ath.m1982b((AnimatedVectorDrawable) drawable2, atcVar2.m1978a());
                    } else {
                        if (atiVar3.f2305c == null) {
                            atiVar3.f2305c = new ArrayList();
                        }
                        if (!atiVar3.f2305c.contains(atcVar2)) {
                            atiVar3.f2305c.add(atcVar2);
                            if (atiVar3.f2304b == null) {
                                atiVar3.f2304b = new ate(atiVar3);
                            }
                            atiVar3.f2303a.f2299c.addListener(atiVar3.f2304b);
                        }
                    }
                }
            }
            Drawable drawable3 = this.f40525p;
            if ((drawable3 instanceof AnimatedStateListDrawable) && (atiVar = this.f40533x) != null) {
                ((AnimatedStateListDrawable) drawable3).addTransition(C0100R.id.checked, C0100R.id.unchecked, atiVar, false);
                ((AnimatedStateListDrawable) this.f40525p).addTransition(C0100R.id.indeterminate, C0100R.id.unchecked, this.f40533x, false);
            }
        }
        Drawable drawable4 = this.f40525p;
        if (drawable4 != null && (colorStateList2 = this.f40516b) != null) {
            acv.m238g(drawable4, colorStateList2);
        }
        Drawable drawable5 = this.f40526q;
        if (drawable5 != null && (colorStateList = this.f40517c) != null) {
            acv.m238g(drawable5, colorStateList);
        }
        Drawable drawable6 = this.f40525p;
        Drawable drawable7 = this.f40526q;
        if (drawable6 == null) {
            drawable6 = drawable7;
        } else if (drawable7 != null) {
            LayerDrawable layerDrawable = new LayerDrawable(new Drawable[]{drawable6, drawable7});
            if (drawable7.getIntrinsicWidth() == -1 || drawable7.getIntrinsicHeight() == -1) {
                int intrinsicWidth2 = drawable6.getIntrinsicWidth();
                intrinsicHeight = drawable6.getIntrinsicHeight();
                intrinsicWidth = intrinsicWidth2;
            } else if (drawable7.getIntrinsicWidth() > drawable6.getIntrinsicWidth() || drawable7.getIntrinsicHeight() > drawable6.getIntrinsicHeight()) {
                float intrinsicWidth3 = drawable7.getIntrinsicWidth() / drawable7.getIntrinsicHeight();
                if (intrinsicWidth3 >= drawable6.getIntrinsicWidth() / drawable6.getIntrinsicHeight()) {
                    intrinsicWidth = drawable6.getIntrinsicWidth();
                    intrinsicHeight = (int) (intrinsicWidth / intrinsicWidth3);
                } else {
                    intrinsicHeight = drawable6.getIntrinsicHeight();
                    intrinsicWidth = (int) (intrinsicWidth3 * intrinsicHeight);
                }
            } else {
                intrinsicWidth = drawable7.getIntrinsicWidth();
                intrinsicHeight = drawable7.getIntrinsicHeight();
            }
            layerDrawable.setLayerSize(1, intrinsicWidth, intrinsicHeight);
            layerDrawable.setLayerGravity(1, 17);
            drawable6 = layerDrawable;
        }
        super.setButtonDrawable(drawable6);
        refreshDrawableState();
    }

    /* JADX INFO: renamed from: c */
    private final void m16379c() {
        String string;
        if (this.f40531v == null) {
            int i = this.f40529t;
            if (i == 1) {
                string = getResources().getString(C0100R.string.mtrl_checkbox_state_description_checked);
            } else {
                string = i == 0 ? getResources().getString(C0100R.string.mtrl_checkbox_state_description_unchecked) : getResources().getString(C0100R.string.mtrl_checkbox_state_description_indeterminate);
            }
            super.setStateDescription(string);
        }
    }

    /* JADX INFO: renamed from: a */
    public final void m16380a(int i) {
        CompoundButton.OnCheckedChangeListener onCheckedChangeListener;
        if (this.f40529t != i) {
            this.f40529t = i;
            super.setChecked(i == 1);
            refreshDrawableState();
            m16379c();
            if (this.f40530u) {
                return;
            }
            this.f40530u = true;
            LinkedHashSet linkedHashSet = this.f40519j;
            if (linkedHashSet != null) {
                Iterator it = linkedHashSet.iterator();
                while (it.hasNext()) {
                    ((mhk) it.next()).m16377a();
                }
            }
            if (this.f40529t != 2 && (onCheckedChangeListener = this.f40532w) != null) {
                onCheckedChangeListener.onCheckedChanged(this, isChecked());
            }
            AutofillManager autofillManager = (AutofillManager) getContext().getSystemService(AutofillManager.class);
            if (autofillManager != null) {
                autofillManager.notifyValueChanged(this);
            }
            this.f40530u = false;
        }
    }

    @Override // android.widget.CompoundButton
    public final Drawable getButtonDrawable() {
        return this.f40525p;
    }

    @Override // android.widget.CompoundButton
    public final ColorStateList getButtonTintList() {
        return this.f40516b;
    }

    @Override // android.widget.CompoundButton, android.widget.Checkable
    public final boolean isChecked() {
        return this.f40529t == 1;
    }

    @Override // android.widget.TextView, android.view.View
    protected final void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.f40521l && this.f40516b == null && this.f40517c == null) {
            this.f40521l = true;
            if (this.f40520k == null) {
                int[][] iArr = f40514h;
                int length = iArr.length;
                int iM15024q = kxk.m15024q(this, C0100R.attr.colorControlActivated);
                int iM15024q2 = kxk.m15024q(this, C0100R.attr.colorError);
                int iM15024q3 = kxk.m15024q(this, C0100R.attr.colorSurface);
                int iM15024q4 = kxk.m15024q(this, C0100R.attr.colorOnSurface);
                this.f40520k = new ColorStateList(iArr, new int[]{kxk.m15026s(iM15024q3, iM15024q2, 1.0f), kxk.m15026s(iM15024q3, iM15024q, 1.0f), kxk.m15026s(iM15024q3, iM15024q4, 0.54f), kxk.m15026s(iM15024q3, iM15024q4, 0.38f), kxk.m15026s(iM15024q3, iM15024q4, 0.38f)});
            }
            ahg.m667c(this, this.f40520k);
        }
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    protected final int[] onCreateDrawableState(int i) {
        int[] iArr;
        int[] iArrOnCreateDrawableState = super.onCreateDrawableState(i + 2);
        if (this.f40529t == 2) {
            mergeDrawableStates(iArrOnCreateDrawableState, f40512f);
        }
        if (this.f40523n) {
            mergeDrawableStates(iArrOnCreateDrawableState, f40513g);
        }
        int i2 = 0;
        while (true) {
            int length = iArrOnCreateDrawableState.length;
            if (i2 >= length) {
                int[] iArrCopyOf = Arrays.copyOf(iArrOnCreateDrawableState, length + 1);
                iArrCopyOf[length] = 16842912;
                iArr = iArrCopyOf;
                break;
            }
            int i3 = iArrOnCreateDrawableState[i2];
            if (i3 == 16842912) {
                iArr = iArrOnCreateDrawableState;
                break;
            }
            if (i3 == 0) {
                iArr = (int[]) iArrOnCreateDrawableState.clone();
                iArr[i2] = 16842912;
                break;
            }
            i2++;
        }
        this.f40518d = iArr;
        return iArrOnCreateDrawableState;
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    protected final void onDraw(Canvas canvas) {
        Drawable drawableM669a;
        if (!this.f40522m || !TextUtils.isEmpty(getText()) || (drawableM669a = ahh.m669a(this)) == null) {
            super.onDraw(canvas);
            return;
        }
        int i = true == lij.m15401I(this) ? -1 : 1;
        int width = getWidth() - drawableM669a.getIntrinsicWidth();
        int iSave = canvas.save();
        int i2 = (width / 2) * i;
        canvas.translate(i2, 0.0f);
        super.onDraw(canvas);
        canvas.restoreToCount(iSave);
        if (getBackground() != null) {
            Rect bounds = drawableM669a.getBounds();
            acv.m236e(getBackground(), bounds.left + i2, bounds.top, bounds.right + i2, bounds.bottom);
        }
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        if (accessibilityNodeInfo != null && this.f40523n) {
            accessibilityNodeInfo.setText(String.valueOf(accessibilityNodeInfo.getText()) + ", " + String.valueOf(this.f40524o));
        }
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof mhl)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        mhl mhlVar = (mhl) parcelable;
        super.onRestoreInstanceState(mhlVar.getSuperState());
        m16380a(mhlVar.f40510a);
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final Parcelable onSaveInstanceState() {
        mhl mhlVar = new mhl(super.onSaveInstanceState());
        mhlVar.f40510a = this.f40529t;
        return mhlVar;
    }

    @Override // p000.C0267ik, android.widget.CompoundButton
    public final void setButtonDrawable(int i) {
        setButtonDrawable(C0194fs.m8752a(getContext(), i));
    }

    @Override // android.widget.CompoundButton
    public final void setButtonTintList(ColorStateList colorStateList) {
        if (this.f40516b == colorStateList) {
            return;
        }
        this.f40516b = colorStateList;
        m16378b();
    }

    @Override // android.widget.CompoundButton
    public final void setButtonTintMode(PorterDuff.Mode mode) {
        C0269im c0269im = this.f31268a;
        if (c0269im != null) {
            c0269im.f31467a = mode;
            c0269im.f31469c = true;
            c0269im.m11454a();
        }
        m16378b();
    }

    @Override // android.widget.CompoundButton, android.widget.Checkable
    public final void setChecked(boolean z) {
        m16380a(z ? 1 : 0);
    }

    @Override // android.widget.CompoundButton
    public final void setOnCheckedChangeListener(CompoundButton.OnCheckedChangeListener onCheckedChangeListener) {
        this.f40532w = onCheckedChangeListener;
    }

    @Override // android.widget.CompoundButton, android.view.View
    public final void setStateDescription(CharSequence charSequence) {
        this.f40531v = charSequence;
        if (charSequence == null) {
            m16379c();
        } else {
            super.setStateDescription(charSequence);
        }
    }

    @Override // android.widget.CompoundButton, android.widget.Checkable
    public final void toggle() {
        m16380a(!isChecked() ? 1 : 0);
    }

    @Override // p000.C0267ik, android.widget.CompoundButton
    public final void setButtonDrawable(Drawable drawable) {
        this.f40525p = drawable;
        this.f40527r = false;
        m16378b();
    }
}
