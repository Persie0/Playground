package androidx.viewpager2.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.view.Gravity;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityNodeInfo;
import androidx.fragment.app.AbstractC0638f;
import androidx.fragment.app.AbstractComponentCallbacksC0635c;
import androidx.fragment.app.Fragment$SavedState;
import androidx.viewpager2.R$styleable;
import java.util.ArrayList;
import java.util.WeakHashMap;
import p000.C0006a4;
import p000.C3329mb;
import p000.C3386nv;
import p000.RunnableC3468pp;
import p000.ata;
import p000.ck6;
import p000.dta;
import p000.e27;
import p000.ea0;
import p000.hf1;
import p000.hy7;
import p000.kf3;
import p000.nua;
import p000.on8;
import p000.oua;
import p000.p28;
import p000.pn8;
import p000.pua;
import p000.qua;
import p000.tk5;
import p000.tua;
import p000.uk9;
import p000.uua;
import p000.v28;
import p000.vua;
import p000.wq1;
import p000.y28;

/* JADX INFO: loaded from: classes2.dex */
public final class ViewPager2 extends ViewGroup {

    /* JADX INFO: renamed from: H */
    public hf1 f7110H;

    /* JADX INFO: renamed from: I */
    public ck6 f7111I;

    /* JADX INFO: renamed from: J */
    public e27 f7112J;

    /* JADX INFO: renamed from: K */
    public v28 f7113K;

    /* JADX INFO: renamed from: L */
    public boolean f7114L;

    /* JADX INFO: renamed from: M */
    public boolean f7115M;

    /* JADX INFO: renamed from: N */
    public int f7116N;

    /* JADX INFO: renamed from: O */
    public C3329mb f7117O;

    /* JADX INFO: renamed from: a */
    public final Rect f7118a;

    /* JADX INFO: renamed from: b */
    public final Rect f7119b;

    /* JADX INFO: renamed from: c */
    public final hf1 f7120c;

    /* JADX INFO: renamed from: d */
    public int f7121d;

    /* JADX INFO: renamed from: e */
    public boolean f7122e;

    /* JADX INFO: renamed from: f */
    public final nua f7123f;

    /* JADX INFO: renamed from: g */
    public qua f7124g;

    /* JADX INFO: renamed from: h */
    public int f7125h;

    /* JADX INFO: renamed from: i */
    public Parcelable f7126i;

    /* JADX INFO: renamed from: j */
    public vua f7127j;

    /* JADX INFO: renamed from: k */
    public uua f7128k;

    /* JADX INFO: renamed from: l */
    public pn8 f7129l;

    public static class SavedState extends View.BaseSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new C0767a();

        /* JADX INFO: renamed from: a */
        public int f7130a;

        /* JADX INFO: renamed from: b */
        public int f7131b;

        /* JADX INFO: renamed from: c */
        public Parcelable f7132c;

        @Override // android.view.View.BaseSavedState, android.view.AbsSavedState, android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeInt(this.f7130a);
            parcel.writeInt(this.f7131b);
            parcel.writeParcelable(this.f7132c, i);
        }
    }

    public ViewPager2(Context context) {
        super(context);
        this.f7118a = new Rect();
        this.f7119b = new Rect();
        this.f7120c = new hf1();
        this.f7122e = false;
        this.f7123f = new nua(this, 0);
        this.f7125h = -1;
        this.f7113K = null;
        this.f7114L = false;
        this.f7115M = true;
        this.f7116N = -1;
        m2890a(context, null);
    }

    /* JADX INFO: renamed from: a */
    public final void m2890a(Context context, AttributeSet attributeSet) {
        this.f7117O = new C3329mb(this);
        vua vuaVar = new vua(this, context);
        this.f7127j = vuaVar;
        vuaVar.setId(View.generateViewId());
        this.f7127j.setDescendantFocusability(131072);
        qua quaVar = new qua(this);
        this.f7124g = quaVar;
        this.f7127j.setLayoutManager(quaVar);
        int i = 1;
        this.f7127j.setScrollingTouchSlop(1);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.ViewPager2);
        int[] iArr = R$styleable.ViewPager2;
        WeakHashMap weakHashMap = dta.f36217a;
        ata.m3035b(this, context, iArr, attributeSet, typedArrayObtainStyledAttributes, 0, 0);
        try {
            int i2 = 0;
            setOrientation(typedArrayObtainStyledAttributes.getInt(R$styleable.ViewPager2_android_orientation, 0));
            typedArrayObtainStyledAttributes.recycle();
            this.f7127j.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
            vua vuaVar2 = this.f7127j;
            pua puaVar = new pua();
            if (vuaVar2.f6644a0 == null) {
                vuaVar2.f6644a0 = new ArrayList();
            }
            vuaVar2.f6644a0.add(puaVar);
            pn8 pn8Var = new pn8(this);
            this.f7129l = pn8Var;
            this.f7111I = new ck6(pn8Var, 12);
            uua uuaVar = new uua(this);
            this.f7128k = uuaVar;
            uuaVar.m20255b(this.f7127j);
            this.f7127j.m2743j(this.f7129l);
            hf1 hf1Var = new hf1();
            this.f7110H = hf1Var;
            this.f7129l.f56518a = hf1Var;
            oua ouaVar = new oua(this, i2);
            oua ouaVar2 = new oua(this, i);
            ((ArrayList) hf1Var.f42294b).add(ouaVar);
            ((ArrayList) this.f7110H.f42294b).add(ouaVar2);
            C3329mb c3329mb = this.f7117O;
            vua vuaVar3 = this.f7127j;
            c3329mb.getClass();
            vuaVar3.setImportantForAccessibility(2);
            c3329mb.f50862d = new nua(c3329mb, i);
            ViewPager2 viewPager2 = (ViewPager2) c3329mb.f50863e;
            if (viewPager2.getImportantForAccessibility() == 0) {
                viewPager2.setImportantForAccessibility(1);
            }
            ((ArrayList) this.f7110H.f42294b).add(this.f7120c);
            e27 e27Var = new e27();
            this.f7112J = e27Var;
            ((ArrayList) this.f7110H.f42294b).add(e27Var);
            vua vuaVar4 = this.f7127j;
            attachViewToParent(vuaVar4, 0, vuaVar4.getLayoutParams());
        } catch (Throwable th) {
            typedArrayObtainStyledAttributes.recycle();
            throw th;
        }
    }

    /* JADX INFO: renamed from: b */
    public final void m2891b() {
        p28 adapter;
        AbstractComponentCallbacksC0635c abstractComponentCallbacksC0635cM17701u;
        if (this.f7125h == -1 || (adapter = getAdapter()) == null) {
            return;
        }
        Parcelable parcelable = this.f7126i;
        int i = 1;
        if (parcelable != null) {
            if (adapter instanceof hy7) {
                hy7 hy7Var = (hy7) adapter;
                tk5 tk5Var = hy7Var.f43208f;
                tk5 tk5Var2 = hy7Var.f43209g;
                if (!tk5Var2.m22178d() || !tk5Var.m22178d()) {
                    C3386nv.m17633t("Expected the adapter to be 'fresh' while restoring state.");
                    return;
                }
                Bundle bundle = (Bundle) parcelable;
                if (bundle.getClassLoader() == null) {
                    bundle.setClassLoader(hy7Var.getClass().getClassLoader());
                }
                for (String str : bundle.keySet()) {
                    if (str.startsWith("f#") && str.length() > 2) {
                        long j = Long.parseLong(str.substring(2));
                        AbstractC0638f abstractC0638f = hy7Var.f43207e;
                        abstractC0638f.getClass();
                        String string = bundle.getString(str);
                        if (string == null) {
                            abstractComponentCallbacksC0635cM17701u = null;
                        } else {
                            abstractComponentCallbacksC0635cM17701u = abstractC0638f.f5742c.m17701u(string);
                            if (abstractComponentCallbacksC0635cM17701u == null) {
                                abstractC0638f.m2174k0(new IllegalStateException(wq1.m24119o("Fragment no longer exists for key ", str, ": unique id ", string)));
                                throw null;
                            }
                        }
                        tk5Var.m22180f(abstractComponentCallbacksC0635cM17701u, j);
                    } else {
                        if (!str.startsWith("s#") || str.length() <= 2) {
                            C3386nv.m17626m("Unexpected key in savedState: ".concat(str));
                            return;
                        }
                        long j2 = Long.parseLong(str.substring(2));
                        Fragment$SavedState fragment$SavedState = (Fragment$SavedState) bundle.getParcelable(str);
                        if (hy7Var.m13586l(j2)) {
                            tk5Var2.m22180f(fragment$SavedState, j2);
                        }
                    }
                }
                if (!tk5Var.m22178d()) {
                    hy7Var.f43214l = true;
                    hy7Var.f43213k = true;
                    hy7Var.m13587m();
                    Handler handler = new Handler(Looper.getMainLooper());
                    RunnableC3468pp runnableC3468pp = new RunnableC3468pp(hy7Var, 7);
                    hy7Var.f43206d.mo21323g(new kf3(i, handler, runnableC3468pp));
                    handler.postDelayed(runnableC3468pp, 10000L);
                }
            }
            this.f7126i = null;
        }
        int iMax = Math.max(0, Math.min(this.f7125h, adapter.mo6133a() - 1));
        this.f7121d = iMax;
        this.f7125h = -1;
        this.f7127j.m2742i0(iMax);
        this.f7117O.m16732j();
    }

    /* JADX INFO: renamed from: c */
    public final void m2892c(int i, boolean z) {
        Object obj = this.f7111I.f10194b;
        m2893d(i, z);
    }

    @Override // android.view.View
    public final boolean canScrollHorizontally(int i) {
        return this.f7127j.canScrollHorizontally(i);
    }

    @Override // android.view.View
    public final boolean canScrollVertically(int i) {
        return this.f7127j.canScrollVertically(i);
    }

    /* JADX INFO: renamed from: d */
    public final void m2893d(int i, boolean z) {
        hf1 hf1Var;
        p28 adapter = getAdapter();
        if (adapter == null) {
            if (this.f7125h != -1) {
                this.f7125h = Math.max(i, 0);
                return;
            }
            return;
        }
        if (adapter.mo6133a() <= 0) {
            return;
        }
        int iMin = Math.min(Math.max(i, 0), adapter.mo6133a() - 1);
        int i2 = this.f7121d;
        if (iMin == i2 && this.f7129l.f56523f == 0) {
            return;
        }
        if (iMin == i2 && z) {
            return;
        }
        double d = i2;
        this.f7121d = iMin;
        this.f7117O.m16732j();
        pn8 pn8Var = this.f7129l;
        if (pn8Var.f56523f != 0) {
            pn8Var.m19413e();
            on8 on8Var = pn8Var.f56524g;
            d = ((double) on8Var.f54622b) + ((double) on8Var.f54621a);
        }
        pn8 pn8Var2 = this.f7129l;
        pn8Var2.getClass();
        pn8Var2.f56522e = z ? 2 : 3;
        boolean z2 = pn8Var2.f56526i != iMin;
        pn8Var2.f56526i = iMin;
        pn8Var2.m19411c(2);
        if (z2 && (hf1Var = pn8Var2.f56518a) != null) {
            hf1Var.mo10799c(iMin);
        }
        if (!z) {
            this.f7127j.m2742i0(iMin);
            return;
        }
        double d2 = iMin;
        double dAbs = Math.abs(d2 - d);
        vua vuaVar = this.f7127j;
        if (dAbs <= 3.0d) {
            vuaVar.m2747l0(iMin);
            return;
        }
        vuaVar.m2742i0(d2 > d ? iMin - 3 : iMin + 3);
        vua vuaVar2 = this.f7127j;
        vuaVar2.post(new ea0(iMin, vuaVar2));
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchRestoreInstanceState(SparseArray sparseArray) {
        Parcelable parcelable = (Parcelable) sparseArray.get(getId());
        if (parcelable instanceof SavedState) {
            int i = ((SavedState) parcelable).f7130a;
            sparseArray.put(this.f7127j.getId(), (Parcelable) sparseArray.get(i));
            sparseArray.remove(i);
        }
        super.dispatchRestoreInstanceState(sparseArray);
        m2891b();
    }

    /* JADX INFO: renamed from: e */
    public final void m2894e() {
        uua uuaVar = this.f7128k;
        if (uuaVar == null) {
            C3386nv.m17633t("Design assumption violated.");
            return;
        }
        View viewMo20257f = uuaVar.mo20257f(this.f7124g);
        if (viewMo20257f == null) {
            return;
        }
        this.f7124g.getClass();
        int iM24878K = y28.m24878K(viewMo20257f);
        if (iM24878K != this.f7121d && getScrollState() == 0) {
            this.f7110H.mo10799c(iM24878K);
        }
        this.f7122e = false;
    }

    @Override // android.view.ViewGroup, android.view.View
    public CharSequence getAccessibilityClassName() {
        this.f7117O.getClass();
        this.f7117O.getClass();
        return "androidx.viewpager.widget.ViewPager";
    }

    public p28 getAdapter() {
        return this.f7127j.getAdapter();
    }

    public int getCurrentItem() {
        return this.f7121d;
    }

    public int getItemDecorationCount() {
        return this.f7127j.getItemDecorationCount();
    }

    public int getOffscreenPageLimit() {
        return this.f7116N;
    }

    public int getOrientation() {
        return this.f7124g.f6581p == 1 ? 1 : 0;
    }

    public int getPageSize() {
        int height;
        int paddingBottom;
        vua vuaVar = this.f7127j;
        if (getOrientation() == 0) {
            height = vuaVar.getWidth() - vuaVar.getPaddingLeft();
            paddingBottom = vuaVar.getPaddingRight();
        } else {
            height = vuaVar.getHeight() - vuaVar.getPaddingTop();
            paddingBottom = vuaVar.getPaddingBottom();
        }
        return height - paddingBottom;
    }

    public int getScrollState() {
        return this.f7129l.f56523f;
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        int iMo6133a;
        int iMo6133a2;
        int iMo6133a3;
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        ViewPager2 viewPager2 = (ViewPager2) this.f7117O.f50863e;
        if (viewPager2.getAdapter() == null) {
            iMo6133a = 0;
            iMo6133a2 = 0;
        } else if (viewPager2.getOrientation() == 1) {
            iMo6133a = viewPager2.getAdapter().mo6133a();
            iMo6133a2 = 1;
        } else {
            iMo6133a2 = viewPager2.getAdapter().mo6133a();
            iMo6133a = 1;
        }
        accessibilityNodeInfo.setCollectionInfo((AccessibilityNodeInfo.CollectionInfo) C0006a4.m94b(iMo6133a, iMo6133a2, 0).f193a);
        p28 adapter = viewPager2.getAdapter();
        if (adapter == null || (iMo6133a3 = adapter.mo6133a()) == 0 || !viewPager2.f7115M) {
            return;
        }
        if (viewPager2.f7121d > 0) {
            accessibilityNodeInfo.addAction(8192);
        }
        if (viewPager2.f7121d < iMo6133a3 - 1) {
            accessibilityNodeInfo.addAction(4096);
        }
        accessibilityNodeInfo.setScrollable(true);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int measuredWidth = this.f7127j.getMeasuredWidth();
        int measuredHeight = this.f7127j.getMeasuredHeight();
        int paddingLeft = getPaddingLeft();
        Rect rect = this.f7118a;
        rect.left = paddingLeft;
        rect.right = (i3 - i) - getPaddingRight();
        rect.top = getPaddingTop();
        rect.bottom = (i4 - i2) - getPaddingBottom();
        Rect rect2 = this.f7119b;
        Gravity.apply(8388659, measuredWidth, measuredHeight, rect, rect2);
        this.f7127j.layout(rect2.left, rect2.top, rect2.right, rect2.bottom);
        if (this.f7122e) {
            m2894e();
        }
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        measureChild(this.f7127j, i, i2);
        int measuredWidth = this.f7127j.getMeasuredWidth();
        int measuredHeight = this.f7127j.getMeasuredHeight();
        int measuredState = this.f7127j.getMeasuredState();
        int paddingRight = getPaddingRight() + getPaddingLeft() + measuredWidth;
        int paddingBottom = getPaddingBottom() + getPaddingTop() + measuredHeight;
        setMeasuredDimension(View.resolveSizeAndState(Math.max(paddingRight, getSuggestedMinimumWidth()), i, measuredState), View.resolveSizeAndState(Math.max(paddingBottom, getSuggestedMinimumHeight()), i2, measuredState << 16));
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.getSuperState());
        this.f7125h = savedState.f7131b;
        this.f7126i = savedState.f7132c;
    }

    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        savedState.f7130a = this.f7127j.getId();
        int i = this.f7125h;
        if (i == -1) {
            i = this.f7121d;
        }
        savedState.f7131b = i;
        Parcelable parcelable = this.f7126i;
        if (parcelable != null) {
            savedState.f7132c = parcelable;
            return savedState;
        }
        p28 adapter = this.f7127j.getAdapter();
        if (adapter instanceof hy7) {
            hy7 hy7Var = (hy7) adapter;
            tk5 tk5Var = hy7Var.f43208f;
            int iM22182h = tk5Var.m22182h();
            tk5 tk5Var2 = hy7Var.f43209g;
            Bundle bundle = new Bundle(tk5Var2.m22182h() + iM22182h);
            for (int i2 = 0; i2 < tk5Var.m22182h(); i2++) {
                long jM22179e = tk5Var.m22179e(i2);
                AbstractComponentCallbacksC0635c abstractComponentCallbacksC0635c = (AbstractComponentCallbacksC0635c) tk5Var.m22176b(jM22179e);
                if (abstractComponentCallbacksC0635c != null && abstractComponentCallbacksC0635c.m2115q()) {
                    String strM24116l = wq1.m24116l("f#", jM22179e);
                    AbstractC0638f abstractC0638f = hy7Var.f43207e;
                    abstractC0638f.getClass();
                    if (abstractComponentCallbacksC0635c.f5674P != abstractC0638f) {
                        abstractC0638f.m2174k0(new IllegalStateException(wq1.m24117m("Fragment ", abstractComponentCallbacksC0635c, " is not currently in the FragmentManager")));
                        throw null;
                    }
                    bundle.putString(strM24116l, abstractComponentCallbacksC0635c.f5693e);
                }
            }
            for (int i3 = 0; i3 < tk5Var2.m22182h(); i3++) {
                long jM22179e2 = tk5Var2.m22179e(i3);
                if (hy7Var.m13586l(jM22179e2)) {
                    bundle.putParcelable(wq1.m24116l("s#", jM22179e2), (Parcelable) tk5Var2.m22176b(jM22179e2));
                }
            }
            savedState.f7132c = bundle;
        }
        return savedState;
    }

    @Override // android.view.ViewGroup
    public final void onViewAdded(View view) {
        throw new IllegalStateException("ViewPager2 does not support direct child views");
    }

    @Override // android.view.View
    public final boolean performAccessibilityAction(int i, Bundle bundle) {
        this.f7117O.getClass();
        if (i != 8192 && i != 4096) {
            return super.performAccessibilityAction(i, bundle);
        }
        C3329mb c3329mb = this.f7117O;
        c3329mb.getClass();
        ViewPager2 viewPager2 = (ViewPager2) c3329mb.f50863e;
        if (i != 8192 && i != 4096) {
            uk9.m22770c();
            return false;
        }
        int currentItem = i == 8192 ? viewPager2.getCurrentItem() - 1 : viewPager2.getCurrentItem() + 1;
        if (viewPager2.f7115M) {
            viewPager2.m2893d(currentItem, true);
        }
        return true;
    }

    public void setAdapter(p28 p28Var) {
        p28 adapter = this.f7127j.getAdapter();
        C3329mb c3329mb = this.f7117O;
        if (adapter != null) {
            adapter.f55486a.unregisterObserver((nua) c3329mb.f50862d);
        } else {
            c3329mb.getClass();
        }
        nua nuaVar = this.f7123f;
        if (adapter != null) {
            adapter.f55486a.unregisterObserver(nuaVar);
        }
        this.f7127j.setAdapter(p28Var);
        this.f7121d = 0;
        m2891b();
        C3329mb c3329mb2 = this.f7117O;
        c3329mb2.m16732j();
        if (p28Var != null) {
            p28Var.f55486a.registerObserver((nua) c3329mb2.f50862d);
        }
        if (p28Var != null) {
            p28Var.f55486a.registerObserver(nuaVar);
        }
    }

    public void setCurrentItem(int i) {
        m2892c(i, true);
    }

    @Override // android.view.View
    public void setLayoutDirection(int i) {
        super.setLayoutDirection(i);
        this.f7117O.m16732j();
    }

    public void setOffscreenPageLimit(int i) {
        if (i < 1 && i != -1) {
            C3386nv.m17626m("Offscreen page limit must be OFFSCREEN_PAGE_LIMIT_DEFAULT or a number > 0");
        } else {
            this.f7116N = i;
            this.f7127j.requestLayout();
        }
    }

    public void setOrientation(int i) {
        this.f7124g.m2691k1(i);
        this.f7117O.m16732j();
    }

    public void setPageTransformer(tua tuaVar) {
        boolean z = this.f7114L;
        if (tuaVar != null) {
            if (!z) {
                this.f7113K = this.f7127j.getItemAnimator();
                this.f7114L = true;
            }
            this.f7127j.setItemAnimator(null);
        } else if (z) {
            this.f7127j.setItemAnimator(this.f7113K);
            this.f7113K = null;
            this.f7114L = false;
        }
        this.f7112J.getClass();
        if (tuaVar == null) {
            return;
        }
        this.f7112J.getClass();
        this.f7112J.getClass();
    }

    public void setUserInputEnabled(boolean z) {
        this.f7115M = z;
        this.f7117O.m16732j();
    }

    public ViewPager2(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f7118a = new Rect();
        this.f7119b = new Rect();
        this.f7120c = new hf1();
        this.f7122e = false;
        this.f7123f = new nua(this, 0);
        this.f7125h = -1;
        this.f7113K = null;
        this.f7114L = false;
        this.f7115M = true;
        this.f7116N = -1;
        m2890a(context, attributeSet);
    }

    public ViewPager2(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f7118a = new Rect();
        this.f7119b = new Rect();
        this.f7120c = new hf1();
        this.f7122e = false;
        this.f7123f = new nua(this, 0);
        this.f7125h = -1;
        this.f7113K = null;
        this.f7114L = false;
        this.f7115M = true;
        this.f7116N = -1;
        m2890a(context, attributeSet);
    }

    public ViewPager2(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        this.f7118a = new Rect();
        this.f7119b = new Rect();
        this.f7120c = new hf1();
        this.f7122e = false;
        this.f7123f = new nua(this, 0);
        this.f7125h = -1;
        this.f7113K = null;
        this.f7114L = false;
        this.f7115M = true;
        this.f7116N = -1;
        m2890a(context, attributeSet);
    }
}
