package p291o7;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.ComponentCallbacks2;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Typeface;
import android.util.AttributeSet;
import android.view.View;
import android.widget.Button;
import androidx.activity.result.InterfaceC0208g;
import androidx.fragment.app.Fragment;
import com.clevertap.android.sdk.inapp.ViewOnClickListenerC2238x;
import com.facebook.FacebookException;
import com.linguist.R;
import dm.C5207g;
import p081e0.C5298b1;
import p173i8.C6205a;
import p254m2.C7472a;
import p317p7.C8201h;

/* JADX INFO: renamed from: o7.i */
/* JADX INFO: loaded from: classes.dex */
@SuppressLint({"ResourceType"})
public abstract class AbstractC7999i extends Button {

    /* JADX INFO: renamed from: i */
    public static final /* synthetic */ int f43538i = 0;

    /* JADX INFO: renamed from: a */
    public final String f43539a;

    /* JADX INFO: renamed from: b */
    public final String f43540b;

    /* JADX INFO: renamed from: c */
    public View.OnClickListener f43541c;

    /* JADX INFO: renamed from: d */
    public View.OnClickListener f43542d;

    /* JADX INFO: renamed from: e */
    public boolean f43543e;

    /* JADX INFO: renamed from: f */
    public int f43544f;

    /* JADX INFO: renamed from: g */
    public int f43545g;

    /* JADX INFO: renamed from: h */
    public C5298b1 f43546h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AbstractC7999i(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        C5207g.m11111f(context, "context");
        int defaultStyleResource = getDefaultStyleResource();
        mo6732a(context, attributeSet, defaultStyleResource == 0 ? R.style.com_facebook_button : defaultStyleResource);
        this.f43539a = "fb_login_button_create";
        this.f43540b = "fb_login_button_did_tap";
        setClickable(true);
        setFocusable(true);
    }

    /* JADX INFO: renamed from: a */
    public void mo6732a(Context context, AttributeSet attributeSet, int i10) {
        if (C6205a.m12742b(this)) {
            return;
        }
        try {
            C5207g.m11111f(context, "context");
            m15867b(context, attributeSet, i10);
            m15868c(context, attributeSet, i10);
            m15869d(context, attributeSet, i10);
            m15870e(context, attributeSet, i10);
            if (C6205a.m12742b(this)) {
                return;
            }
            try {
                super.setOnClickListener(new ViewOnClickListenerC2238x(1, this));
            } catch (Throwable th2) {
                C6205a.m12741a(this, th2);
            }
        } catch (Throwable th3) {
            C6205a.m12741a(this, th3);
        }
    }

    /* JADX INFO: renamed from: b */
    public final void m15867b(Context context, AttributeSet attributeSet, int i10) {
        if (C6205a.m12742b(this)) {
            return;
        }
        try {
            if (isInEditMode()) {
                return;
            }
            TypedArray typedArrayObtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet, new int[]{android.R.attr.background}, 0, i10);
            C5207g.m11110e(typedArrayObtainStyledAttributes, "context.theme.obtainStyledAttributes(attrs, attrsResources, defStyleAttr, defStyleRes)");
            try {
                if (typedArrayObtainStyledAttributes.hasValue(0)) {
                    int resourceId = typedArrayObtainStyledAttributes.getResourceId(0, 0);
                    if (resourceId != 0) {
                        setBackgroundResource(resourceId);
                    } else {
                        setBackgroundColor(typedArrayObtainStyledAttributes.getColor(0, 0));
                    }
                } else {
                    Object obj = C7472a.f41322a;
                    setBackgroundColor(C7472a.d.m14851a(context, R.color.com_facebook_blue));
                }
            } finally {
                typedArrayObtainStyledAttributes.recycle();
            }
        } catch (Throwable th2) {
            C6205a.m12741a(this, th2);
        }
    }

    @SuppressLint({"ResourceType"})
    /* JADX INFO: renamed from: c */
    public final void m15868c(Context context, AttributeSet attributeSet, int i10) {
        if (C6205a.m12742b(this)) {
            return;
        }
        try {
            TypedArray typedArrayObtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet, new int[]{android.R.attr.drawableLeft, android.R.attr.drawableTop, android.R.attr.drawableRight, android.R.attr.drawableBottom, android.R.attr.drawablePadding}, 0, i10);
            C5207g.m11110e(typedArrayObtainStyledAttributes, "context.theme.obtainStyledAttributes(attrs, attrsResources, defStyleAttr, defStyleRes)");
            try {
                setCompoundDrawablesWithIntrinsicBounds(typedArrayObtainStyledAttributes.getResourceId(0, 0), typedArrayObtainStyledAttributes.getResourceId(1, 0), typedArrayObtainStyledAttributes.getResourceId(2, 0), typedArrayObtainStyledAttributes.getResourceId(3, 0));
                int dimensionPixelSize = typedArrayObtainStyledAttributes.getDimensionPixelSize(4, 0);
                typedArrayObtainStyledAttributes.recycle();
                setCompoundDrawablePadding(dimensionPixelSize);
            } catch (Throwable th2) {
                typedArrayObtainStyledAttributes.recycle();
                throw th2;
            }
        } catch (Throwable th3) {
            C6205a.m12741a(this, th3);
        }
    }

    /* JADX INFO: renamed from: d */
    public final void m15869d(Context context, AttributeSet attributeSet, int i10) {
        if (C6205a.m12742b(this)) {
            return;
        }
        try {
            TypedArray typedArrayObtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet, new int[]{android.R.attr.paddingLeft, android.R.attr.paddingTop, android.R.attr.paddingRight, android.R.attr.paddingBottom}, 0, i10);
            C5207g.m11110e(typedArrayObtainStyledAttributes, "context.theme.obtainStyledAttributes(attrs, attrsResources, defStyleAttr, defStyleRes)");
            try {
                setPadding(typedArrayObtainStyledAttributes.getDimensionPixelSize(0, 0), typedArrayObtainStyledAttributes.getDimensionPixelSize(1, 0), typedArrayObtainStyledAttributes.getDimensionPixelSize(2, 0), typedArrayObtainStyledAttributes.getDimensionPixelSize(3, 0));
                typedArrayObtainStyledAttributes.recycle();
            } catch (Throwable th2) {
                typedArrayObtainStyledAttributes.recycle();
                throw th2;
            }
        } catch (Throwable th3) {
            C6205a.m12741a(this, th3);
        }
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    /* JADX INFO: renamed from: e */
    public final void m15870e(Context context, AttributeSet attributeSet, int i10) {
        if (C6205a.m12742b(this)) {
            return;
        }
        try {
            TypedArray typedArrayObtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet, new int[]{android.R.attr.textColor}, 0, i10);
            C5207g.m11110e(typedArrayObtainStyledAttributes, "context.theme.obtainStyledAttributes(attrs, colorResources, defStyleAttr, defStyleRes)");
            try {
                setTextColor(typedArrayObtainStyledAttributes.getColorStateList(0));
                typedArrayObtainStyledAttributes.recycle();
                TypedArray typedArrayObtainStyledAttributes2 = context.getTheme().obtainStyledAttributes(attributeSet, new int[]{android.R.attr.gravity}, 0, i10);
                C5207g.m11110e(typedArrayObtainStyledAttributes2, "context.theme.obtainStyledAttributes(attrs, gravityResources, defStyleAttr, defStyleRes)");
                try {
                    int i11 = typedArrayObtainStyledAttributes2.getInt(0, 17);
                    typedArrayObtainStyledAttributes2.recycle();
                    setGravity(i11);
                    TypedArray typedArrayObtainStyledAttributes3 = context.getTheme().obtainStyledAttributes(attributeSet, new int[]{android.R.attr.textSize, android.R.attr.textStyle, android.R.attr.text}, 0, i10);
                    C5207g.m11110e(typedArrayObtainStyledAttributes3, "context.theme.obtainStyledAttributes(attrs, attrsResources, defStyleAttr, defStyleRes)");
                    try {
                        setTextSize(0, typedArrayObtainStyledAttributes3.getDimensionPixelSize(0, 0));
                        setTypeface(Typeface.create(getTypeface(), 1));
                        String string = typedArrayObtainStyledAttributes3.getString(2);
                        typedArrayObtainStyledAttributes3.recycle();
                        setText(string);
                    } catch (Throwable th2) {
                        typedArrayObtainStyledAttributes3.recycle();
                        throw th2;
                    }
                } catch (Throwable th3) {
                    typedArrayObtainStyledAttributes2.recycle();
                    throw th3;
                }
            } catch (Throwable th4) {
                typedArrayObtainStyledAttributes.recycle();
                throw th4;
            }
        } catch (Throwable th5) {
            C6205a.m12741a(this, th5);
        }
    }

    public Activity getActivity() {
        if (C6205a.m12742b(this)) {
            return null;
        }
        try {
            Context context = getContext();
            while (!(context instanceof Activity) && (context instanceof ContextWrapper)) {
                context = ((ContextWrapper) context).getBaseContext();
            }
            if (context instanceof Activity) {
                return (Activity) context;
            }
            throw new FacebookException("Unable to get Activity.");
        } catch (Throwable th2) {
            C6205a.m12741a(this, th2);
            return null;
        }
    }

    public final String getAnalyticsButtonCreatedEventName() {
        if (C6205a.m12742b(this)) {
            return null;
        }
        try {
            return this.f43539a;
        } catch (Throwable th2) {
            C6205a.m12741a(this, th2);
            return null;
        }
    }

    public final String getAnalyticsButtonTappedEventName() {
        if (C6205a.m12742b(this)) {
            return null;
        }
        try {
            return this.f43540b;
        } catch (Throwable th2) {
            C6205a.m12741a(this, th2);
            return null;
        }
    }

    public final InterfaceC0208g getAndroidxActivityResultRegistryOwner() {
        InterfaceC0208g interfaceC0208g = null;
        if (C6205a.m12742b(this)) {
            return null;
        }
        try {
            ComponentCallbacks2 activity = getActivity();
            if (activity instanceof InterfaceC0208g) {
                interfaceC0208g = (InterfaceC0208g) activity;
            }
            return interfaceC0208g;
        } catch (Throwable th2) {
            C6205a.m12741a(this, th2);
            return null;
        }
    }

    @Override // android.widget.TextView
    public int getCompoundPaddingLeft() {
        if (C6205a.m12742b(this)) {
            return 0;
        }
        try {
            return this.f43543e ? this.f43544f : super.getCompoundPaddingLeft();
        } catch (Throwable th2) {
            C6205a.m12741a(this, th2);
            return 0;
        }
    }

    @Override // android.widget.TextView
    public int getCompoundPaddingRight() {
        if (C6205a.m12742b(this)) {
            return 0;
        }
        try {
            return this.f43543e ? this.f43545g : super.getCompoundPaddingRight();
        } catch (Throwable th2) {
            C6205a.m12741a(this, th2);
            return 0;
        }
    }

    public abstract int getDefaultRequestCode();

    public int getDefaultStyleResource() {
        C6205a.m12742b(this);
        return 0;
    }

    public final Fragment getFragment() {
        if (C6205a.m12742b(this)) {
            return null;
        }
        try {
            C5298b1 c5298b1 = this.f43546h;
            if (c5298b1 == null) {
                return null;
            }
            return (Fragment) c5298b1.f33572a;
        } catch (Throwable th2) {
            C6205a.m12741a(this, th2);
            return null;
        }
    }

    public final android.app.Fragment getNativeFragment() {
        if (C6205a.m12742b(this)) {
            return null;
        }
        try {
            C5298b1 c5298b1 = this.f43546h;
            if (c5298b1 == null) {
                return null;
            }
            return (android.app.Fragment) c5298b1.f33573b;
        } catch (Throwable th2) {
            C6205a.m12741a(this, th2);
            return null;
        }
    }

    public int getRequestCode() {
        if (C6205a.m12742b(this)) {
            return 0;
        }
        try {
            return getDefaultRequestCode();
        } catch (Throwable th2) {
            C6205a.m12741a(this, th2);
            return 0;
        }
    }

    @Override // android.widget.TextView, android.view.View
    public void onAttachedToWindow() {
        if (C6205a.m12742b(this)) {
            return;
        }
        try {
            super.onAttachedToWindow();
            if (!isInEditMode()) {
                Context context = getContext();
                if (C6205a.m12742b(this)) {
                    return;
                }
                try {
                    C8201h c8201h = new C8201h(context, (String) null);
                    String str = this.f43539a;
                    C8004n c8004n = C8004n.f43550a;
                    if (C7993c0.m15849b()) {
                        c8201h.m16334f(str, null);
                    }
                } catch (Throwable th2) {
                    C6205a.m12741a(this, th2);
                }
            }
        } catch (Throwable th3) {
            C6205a.m12741a(this, th3);
        }
    }

    @Override // android.widget.TextView, android.view.View
    public void onDraw(Canvas canvas) {
        int iCeil;
        if (C6205a.m12742b(this)) {
            return;
        }
        try {
            C5207g.m11111f(canvas, "canvas");
            if ((getGravity() & 1) != 0) {
                int compoundPaddingLeft = getCompoundPaddingLeft();
                int compoundPaddingRight = getCompoundPaddingRight();
                int width = (getWidth() - (getCompoundDrawablePadding() + compoundPaddingLeft)) - compoundPaddingRight;
                String string = getText().toString();
                if (!C6205a.m12742b(this)) {
                    try {
                        iCeil = (int) Math.ceil(getPaint().measureText(string));
                    } catch (Throwable th2) {
                        C6205a.m12741a(this, th2);
                        iCeil = 0;
                    }
                    int iMin = Math.min((width - iCeil) / 2, (compoundPaddingLeft - getPaddingLeft()) / 2);
                    this.f43544f = compoundPaddingLeft - iMin;
                    this.f43545g = compoundPaddingRight + iMin;
                    this.f43543e = true;
                }
                iCeil = 0;
                int iMin2 = Math.min((width - iCeil) / 2, (compoundPaddingLeft - getPaddingLeft()) / 2);
                this.f43544f = compoundPaddingLeft - iMin2;
                this.f43545g = compoundPaddingRight + iMin2;
                this.f43543e = true;
            }
            super.onDraw(canvas);
            this.f43543e = false;
        } catch (Throwable th3) {
            C6205a.m12741a(this, th3);
        }
    }

    public final void setFragment(android.app.Fragment fragment) {
        if (C6205a.m12742b(this)) {
            return;
        }
        try {
            C5207g.m11111f(fragment, "fragment");
            this.f43546h = new C5298b1(fragment);
        } catch (Throwable th2) {
            C6205a.m12741a(this, th2);
        }
    }

    public final void setFragment(Fragment fragment) {
        if (C6205a.m12742b(this)) {
            return;
        }
        try {
            C5207g.m11111f(fragment, "fragment");
            this.f43546h = new C5298b1(fragment);
        } catch (Throwable th2) {
            C6205a.m12741a(this, th2);
        }
    }

    public void setInternalOnClickListener(View.OnClickListener onClickListener) {
        if (C6205a.m12742b(this)) {
            return;
        }
        try {
            this.f43542d = onClickListener;
        } catch (Throwable th2) {
            C6205a.m12741a(this, th2);
        }
    }

    @Override // android.view.View
    public void setOnClickListener(View.OnClickListener onClickListener) {
        if (C6205a.m12742b(this)) {
            return;
        }
        try {
            this.f43541c = onClickListener;
        } catch (Throwable th2) {
            C6205a.m12741a(this, th2);
        }
    }
}
