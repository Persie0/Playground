package p000;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import androidx.coordinatorlayout.R$styleable;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import java.lang.reflect.Constructor;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public final class lm1 extends ViewGroup.MarginLayoutParams {

    /* JADX INFO: renamed from: a */
    public im1 f49814a;

    /* JADX INFO: renamed from: b */
    public boolean f49815b;

    /* JADX INFO: renamed from: c */
    public final int f49816c;

    /* JADX INFO: renamed from: d */
    public final int f49817d;

    /* JADX INFO: renamed from: e */
    public final int f49818e;

    /* JADX INFO: renamed from: f */
    public final int f49819f;

    /* JADX INFO: renamed from: g */
    public final int f49820g;

    /* JADX INFO: renamed from: h */
    public int f49821h;

    /* JADX INFO: renamed from: i */
    public int f49822i;

    /* JADX INFO: renamed from: j */
    public int f49823j;

    /* JADX INFO: renamed from: k */
    public View f49824k;

    /* JADX INFO: renamed from: l */
    public View f49825l;

    /* JADX INFO: renamed from: m */
    public boolean f49826m;

    /* JADX INFO: renamed from: n */
    public boolean f49827n;

    /* JADX INFO: renamed from: o */
    public boolean f49828o;

    /* JADX INFO: renamed from: p */
    public final Rect f49829p;

    public lm1(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f49815b = false;
        this.f49816c = 0;
        this.f49817d = 0;
        this.f49818e = -1;
        this.f49819f = -1;
        this.f49820g = 0;
        this.f49821h = 0;
        this.f49829p = new Rect();
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.CoordinatorLayout_Layout);
        this.f49816c = typedArrayObtainStyledAttributes.getInteger(R$styleable.CoordinatorLayout_Layout_android_layout_gravity, 0);
        this.f49819f = typedArrayObtainStyledAttributes.getResourceId(R$styleable.CoordinatorLayout_Layout_layout_anchor, -1);
        this.f49817d = typedArrayObtainStyledAttributes.getInteger(R$styleable.CoordinatorLayout_Layout_layout_anchorGravity, 0);
        this.f49818e = typedArrayObtainStyledAttributes.getInteger(R$styleable.CoordinatorLayout_Layout_layout_keyline, -1);
        this.f49820g = typedArrayObtainStyledAttributes.getInt(R$styleable.CoordinatorLayout_Layout_layout_insetEdge, 0);
        this.f49821h = typedArrayObtainStyledAttributes.getInt(R$styleable.CoordinatorLayout_Layout_layout_dodgeInsetEdges, 0);
        boolean zHasValue = typedArrayObtainStyledAttributes.hasValue(R$styleable.CoordinatorLayout_Layout_layout_behavior);
        this.f49815b = zHasValue;
        if (zHasValue) {
            String string = typedArrayObtainStyledAttributes.getString(R$styleable.CoordinatorLayout_Layout_layout_behavior);
            String str = CoordinatorLayout.f5464O;
            im1 im1Var = null;
            if (!TextUtils.isEmpty(string)) {
                if (string.startsWith(".")) {
                    string = context.getPackageName() + string;
                } else if (string.indexOf(46) < 0) {
                    String str2 = CoordinatorLayout.f5464O;
                    if (!TextUtils.isEmpty(str2)) {
                        string = str2 + '.' + string;
                    }
                }
                try {
                    ThreadLocal threadLocal = CoordinatorLayout.f5466Q;
                    Map map = (Map) threadLocal.get();
                    if (map == null) {
                        map = new HashMap();
                        threadLocal.set(map);
                    }
                    Constructor<?> constructor = (Constructor) map.get(string);
                    if (constructor == null) {
                        constructor = Class.forName(string, false, context.getClassLoader()).getConstructor(CoordinatorLayout.f5465P);
                        constructor.setAccessible(true);
                        map.put(string, constructor);
                    }
                    im1Var = (im1) constructor.newInstance(context, attributeSet);
                } catch (Exception e) {
                    ij6.m13958p("Could not inflate Behavior subclass ".concat(string), e);
                    throw null;
                }
            }
            this.f49814a = im1Var;
        }
        typedArrayObtainStyledAttributes.recycle();
        im1 im1Var2 = this.f49814a;
        if (im1Var2 != null) {
            im1Var2.mo6044g(this);
        }
    }

    /* JADX INFO: renamed from: a */
    public final boolean m16361a(int i) {
        if (i == 0) {
            return this.f49826m;
        }
        if (i != 1) {
            return false;
        }
        return this.f49827n;
    }

    public lm1() {
        super(-2, -2);
        this.f49815b = false;
        this.f49816c = 0;
        this.f49817d = 0;
        this.f49818e = -1;
        this.f49819f = -1;
        this.f49820g = 0;
        this.f49821h = 0;
        this.f49829p = new Rect();
    }

    public lm1(lm1 lm1Var) {
        super((ViewGroup.MarginLayoutParams) lm1Var);
        this.f49815b = false;
        this.f49816c = 0;
        this.f49817d = 0;
        this.f49818e = -1;
        this.f49819f = -1;
        this.f49820g = 0;
        this.f49821h = 0;
        this.f49829p = new Rect();
    }

    public lm1(ViewGroup.MarginLayoutParams marginLayoutParams) {
        super(marginLayoutParams);
        this.f49815b = false;
        this.f49816c = 0;
        this.f49817d = 0;
        this.f49818e = -1;
        this.f49819f = -1;
        this.f49820g = 0;
        this.f49821h = 0;
        this.f49829p = new Rect();
    }

    public lm1(ViewGroup.LayoutParams layoutParams) {
        super(layoutParams);
        this.f49815b = false;
        this.f49816c = 0;
        this.f49817d = 0;
        this.f49818e = -1;
        this.f49819f = -1;
        this.f49820g = 0;
        this.f49821h = 0;
        this.f49829p = new Rect();
    }
}
