package androidx.viewpager2.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.os.Bundle;
import android.os.Parcelable;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.view.Gravity;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityNodeInfo;
import java.util.ArrayList;
import p000.AbstractC0806ls;
import p000.C0158ej;
import p000.C0805lr;
import p000.afb;
import p000.afc;
import p000.afn;
import p000.agt;
import p000.asr;
import p000.ath;
import p000.auc;
import p000.aud;
import p000.auf;
import p000.aug;
import p000.auh;
import p000.aui;
import p000.auj;
import p000.auk;
import p000.aul;
import p000.aun;
import p000.aup;
import p000.auq;
import p000.aur;
import p000.aus;
import p000.aut;
import p000.auu;
import p000.bkn;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class ViewPager2 extends ViewGroup {

    /* JADX INFO: renamed from: a */
    public final auf f1666a;

    /* JADX INFO: renamed from: b */
    public int f1667b;

    /* JADX INFO: renamed from: c */
    public boolean f1668c;

    /* JADX INFO: renamed from: d */
    LinearLayoutManager f1669d;

    /* JADX INFO: renamed from: e */
    public RecyclerView f1670e;

    /* JADX INFO: renamed from: f */
    public aui f1671f;

    /* JADX INFO: renamed from: g */
    public boolean f1672g;

    /* JADX INFO: renamed from: h */
    public final int f1673h;

    /* JADX INFO: renamed from: i */
    public final C0158ej f1674i;

    /* JADX INFO: renamed from: j */
    public ath f1675j;

    /* JADX INFO: renamed from: k */
    private final Rect f1676k;

    /* JADX INFO: renamed from: l */
    private final Rect f1677l;

    /* JADX INFO: renamed from: m */
    private int f1678m;

    /* JADX INFO: renamed from: n */
    private Parcelable f1679n;

    /* JADX INFO: renamed from: o */
    private C0805lr f1680o;

    /* JADX INFO: renamed from: p */
    private auf f1681p;

    /* JADX INFO: renamed from: q */
    private aug f1682q;

    /* JADX INFO: renamed from: r */
    private bkn f1683r;

    public ViewPager2(Context context) {
        super(context);
        this.f1676k = new Rect();
        this.f1677l = new Rect();
        this.f1666a = new auf();
        this.f1668c = false;
        this.f1674i = new auj(this);
        this.f1678m = -1;
        this.f1672g = true;
        this.f1673h = -1;
        m1557i(context, null);
    }

    /* JADX INFO: renamed from: i */
    private final void m1557i(Context context, AttributeSet attributeSet) {
        this.f1675j = new auq(this);
        aus ausVar = new aus(this, context);
        this.f1670e = ausVar;
        ausVar.setId(afc.m440a());
        this.f1670e.setDescendantFocusability(131072);
        aun aunVar = new aun(this);
        this.f1669d = aunVar;
        this.f1670e.m1228aa(aunVar);
        RecyclerView recyclerView = this.f1670e;
        recyclerView.f1069G = ViewConfiguration.get(recyclerView.getContext()).getScaledPagingTouchSlop();
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, auc.f2405a);
        afn.m536c(this, context, auc.f2405a, attributeSet, typedArrayObtainStyledAttributes, 0, 0);
        try {
            this.f1669d.m1160T(typedArrayObtainStyledAttributes.getInt(0, 0));
            ((auq) this.f1675j).m2045f();
            typedArrayObtainStyledAttributes.recycle();
            this.f1670e.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
            RecyclerView recyclerView2 = this.f1670e;
            asr asrVar = new asr();
            if (recyclerView2.f1135y == null) {
                recyclerView2.f1135y = new ArrayList();
            }
            recyclerView2.f1135y.add(asrVar);
            this.f1671f = new aui(this);
            aui auiVar = this.f1671f;
            RecyclerView recyclerView3 = this.f1670e;
            this.f1683r = new bkn(auiVar);
            aur aurVar = new aur(this);
            this.f1680o = aurVar;
            aurVar.mo11874e(recyclerView3);
            this.f1670e.m1247aw(this.f1671f);
            auf aufVar = new auf();
            this.f1681p = aufVar;
            this.f1671f.f2416f = aufVar;
            auk aukVar = new auk(this);
            aul aulVar = new aul(this);
            aufVar.m2029d(aukVar);
            this.f1681p.m2029d(aulVar);
            ath athVar = this.f1675j;
            afb.m434o(this.f1670e, 2);
            auq auqVar = (auq) athVar;
            auqVar.f2431b = new aup(auqVar);
            if (afb.m420a(auqVar.f2430a) == 0) {
                afb.m434o(auqVar.f2430a, 1);
            }
            this.f1681p.m2029d(this.f1666a);
            aug augVar = new aug();
            this.f1682q = augVar;
            this.f1681p.m2029d(augVar);
            RecyclerView recyclerView4 = this.f1670e;
            attachViewToParent(recyclerView4, 0, recyclerView4.getLayoutParams());
        } catch (Throwable th) {
            typedArrayObtainStyledAttributes.recycle();
            throw th;
        }
    }

    /* JADX INFO: renamed from: a */
    public final int m1558a() {
        return this.f1669d.f1048i == 1 ? 1 : 0;
    }

    /* JADX INFO: renamed from: b */
    public final AbstractC0806ls m1559b() {
        return this.f1670e.f1123m;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: c */
    public final void m1560c() {
        AbstractC0806ls abstractC0806lsM1559b;
        if (this.f1678m == -1 || (abstractC0806lsM1559b = m1559b()) == 0) {
            return;
        }
        if (this.f1679n != null) {
            if (abstractC0806lsM1559b instanceof aud) {
                ((aud) abstractC0806lsM1559b).m2026b();
            }
            this.f1679n = null;
        }
        int iMax = Math.max(0, Math.min(this.f1678m, abstractC0806lsM1559b.mo1762a() - 1));
        this.f1667b = iMax;
        this.f1678m = -1;
        this.f1670e.m1224W(iMax);
        ((auq) this.f1675j).m2045f();
    }

    @Override // android.view.View
    public final boolean canScrollHorizontally(int i) {
        return this.f1670e.canScrollHorizontally(i);
    }

    @Override // android.view.View
    public final boolean canScrollVertically(int i) {
        return this.f1670e.canScrollVertically(i);
    }

    /* JADX INFO: renamed from: d */
    public final void m1561d(int i, boolean z) {
        m1565h();
        m1562e(i, z);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected final void dispatchRestoreInstanceState(SparseArray sparseArray) {
        Parcelable parcelable = (Parcelable) sparseArray.get(getId());
        if (parcelable instanceof aut) {
            int i = ((aut) parcelable).f2436a;
            sparseArray.put(this.f1670e.getId(), (Parcelable) sparseArray.get(i));
            sparseArray.remove(i);
        }
        super.dispatchRestoreInstanceState(sparseArray);
        m1560c();
    }

    /* JADX INFO: renamed from: e */
    public final void m1562e(int i, boolean z) {
        AbstractC0806ls abstractC0806lsM1559b = m1559b();
        if (abstractC0806lsM1559b == null) {
            if (this.f1678m != -1) {
                this.f1678m = Math.max(i, 0);
                return;
            }
            return;
        }
        if (abstractC0806lsM1559b.mo1762a() <= 0) {
            return;
        }
        int iMin = Math.min(Math.max(i, 0), abstractC0806lsM1559b.mo1762a() - 1);
        if (iMin == this.f1667b && this.f1671f.m2039j()) {
            return;
        }
        int i2 = this.f1667b;
        if (iMin == i2 && z) {
            return;
        }
        this.f1667b = iMin;
        ((auq) this.f1675j).m2045f();
        double d = i2;
        if (!this.f1671f.m2039j()) {
            aui auiVar = this.f1671f;
            auiVar.m2038i();
            auh auhVar = auiVar.f2413c;
            double d2 = auhVar.f2408a;
            double d3 = auhVar.f2409b;
            Double.isNaN(d2);
            Double.isNaN(d3);
            d = d2 + d3;
        }
        aui auiVar2 = this.f1671f;
        auiVar2.f2411a = true != z ? 3 : 2;
        int i3 = auiVar2.f2414d;
        auiVar2.f2414d = iMin;
        auiVar2.m2037h(2);
        if (i3 != iMin) {
            auiVar2.m2036g(iMin);
        }
        if (!z) {
            this.f1670e.m1224W(iMin);
            return;
        }
        double d4 = iMin;
        Double.isNaN(d4);
        if (Math.abs(d4 - d) <= 3.0d) {
            this.f1670e.m1231ad(iMin);
            return;
        }
        this.f1670e.m1224W(d4 > d ? iMin - 3 : iMin + 3);
        RecyclerView recyclerView = this.f1670e;
        recyclerView.post(new auu(iMin, recyclerView));
    }

    /* JADX INFO: renamed from: f */
    public final void m1563f() {
        C0805lr c0805lr = this.f1680o;
        if (c0805lr == null) {
            throw new IllegalStateException("Design assumption violated.");
        }
        View viewMo2046b = c0805lr.mo2046b(this.f1669d);
        if (viewMo2046b == null) {
            return;
        }
        int iBe = LinearLayoutManager.m16136be(viewMo2046b);
        if (iBe != this.f1667b && this.f1671f.f2412b == 0) {
            this.f1681p.mo1627c(iBe);
        }
        this.f1668c = false;
    }

    /* JADX INFO: renamed from: g */
    public final boolean m1564g() {
        return this.f1669d.m16166am() == 1;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final CharSequence getAccessibilityClassName() {
        return "androidx.viewpager.widget.ViewPager";
    }

    /* JADX INFO: renamed from: h */
    public final void m1565h() {
        Object obj = this.f1683r.f3651a;
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        int iMo1762a;
        int iMo1762a2;
        int iMo1762a3;
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        ath athVar = this.f1675j;
        agt agtVarM622a = agt.m622a(accessibilityNodeInfo);
        auq auqVar = (auq) athVar;
        if (auqVar.f2430a.m1559b() == null) {
            iMo1762a = 0;
            iMo1762a2 = 0;
        } else if (auqVar.f2430a.m1558a() == 1) {
            iMo1762a = auqVar.f2430a.m1559b().mo1762a();
            iMo1762a2 = 1;
        } else {
            iMo1762a2 = auqVar.f2430a.m1559b().mo1762a();
            iMo1762a = 1;
        }
        agtVarM622a.m633k(bkn.m2549A(iMo1762a, iMo1762a2, 0));
        AbstractC0806ls abstractC0806lsM1559b = auqVar.f2430a.m1559b();
        if (abstractC0806lsM1559b == null || (iMo1762a3 = abstractC0806lsM1559b.mo1762a()) == 0) {
            return;
        }
        ViewPager2 viewPager2 = auqVar.f2430a;
        if (viewPager2.f1672g) {
            if (viewPager2.f1667b > 0) {
                agtVarM622a.m627e(8192);
            }
            if (auqVar.f2430a.f1667b < iMo1762a3 - 1) {
                agtVarM622a.m627e(4096);
            }
            agtVarM622a.m636n(true);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    protected final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int measuredWidth = this.f1670e.getMeasuredWidth();
        int measuredHeight = this.f1670e.getMeasuredHeight();
        this.f1676k.left = getPaddingLeft();
        this.f1676k.right = (i3 - i) - getPaddingRight();
        this.f1676k.top = getPaddingTop();
        this.f1676k.bottom = (i4 - i2) - getPaddingBottom();
        Gravity.apply(8388659, measuredWidth, measuredHeight, this.f1676k, this.f1677l);
        this.f1670e.layout(this.f1677l.left, this.f1677l.top, this.f1677l.right, this.f1677l.bottom);
        if (this.f1668c) {
            m1563f();
        }
    }

    @Override // android.view.View
    protected final void onMeasure(int i, int i2) {
        measureChild(this.f1670e, i, i2);
        int measuredWidth = this.f1670e.getMeasuredWidth();
        int measuredHeight = this.f1670e.getMeasuredHeight();
        int measuredState = this.f1670e.getMeasuredState();
        int paddingLeft = measuredWidth + getPaddingLeft() + getPaddingRight();
        int paddingTop = measuredHeight + getPaddingTop() + getPaddingBottom();
        setMeasuredDimension(resolveSizeAndState(Math.max(paddingLeft, getSuggestedMinimumWidth()), i, measuredState), resolveSizeAndState(Math.max(paddingTop, getSuggestedMinimumHeight()), i2, measuredState << 16));
    }

    @Override // android.view.View
    protected final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof aut)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        aut autVar = (aut) parcelable;
        super.onRestoreInstanceState(autVar.getSuperState());
        this.f1678m = autVar.f2437b;
        this.f1679n = autVar.f2438c;
    }

    @Override // android.view.View
    protected final Parcelable onSaveInstanceState() {
        aut autVar = new aut(super.onSaveInstanceState());
        autVar.f2436a = this.f1670e.getId();
        int i = this.f1678m;
        if (i == -1) {
            i = this.f1667b;
        }
        autVar.f2437b = i;
        Parcelable parcelable = this.f1679n;
        if (parcelable != null) {
            autVar.f2438c = parcelable;
        } else {
            Object obj = this.f1670e.f1123m;
            if (obj instanceof aud) {
                autVar.f2438c = ((aud) obj).m2025a();
            }
        }
        return autVar;
    }

    @Override // android.view.ViewGroup
    public final void onViewAdded(View view) {
        throw new IllegalStateException(String.valueOf(getClass().getSimpleName()).concat(" does not support direct child views"));
    }

    @Override // android.view.View
    public final boolean performAccessibilityAction(int i, Bundle bundle) {
        if (!this.f1675j.mo1984d(i)) {
            return super.performAccessibilityAction(i, bundle);
        }
        ath athVar = this.f1675j;
        if (!athVar.mo1984d(i)) {
            throw new IllegalStateException();
        }
        ((auq) athVar).m2044e(i == 8192 ? ((auq) athVar).f2430a.f1667b - 1 : ((auq) athVar).f2430a.f1667b + 1);
        return true;
    }

    @Override // android.view.View
    public final void setLayoutDirection(int i) {
        super.setLayoutDirection(i);
        ((auq) this.f1675j).m2045f();
    }

    public ViewPager2(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f1676k = new Rect();
        this.f1677l = new Rect();
        this.f1666a = new auf();
        this.f1668c = false;
        this.f1674i = new auj(this);
        this.f1678m = -1;
        this.f1672g = true;
        this.f1673h = -1;
        m1557i(context, attributeSet);
    }

    public ViewPager2(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f1676k = new Rect();
        this.f1677l = new Rect();
        this.f1666a = new auf();
        this.f1668c = false;
        this.f1674i = new auj(this);
        this.f1678m = -1;
        this.f1672g = true;
        this.f1673h = -1;
        m1557i(context, attributeSet);
    }

    public ViewPager2(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        this.f1676k = new Rect();
        this.f1677l = new Rect();
        this.f1666a = new auf();
        this.f1668c = false;
        this.f1674i = new auj(this);
        this.f1678m = -1;
        this.f1672g = true;
        this.f1673h = -1;
        m1557i(context, attributeSet);
    }
}
