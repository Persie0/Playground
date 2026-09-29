package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.window.OnBackInvokedCallback;
import android.window.OnBackInvokedDispatcher;
import androidx.appcompat.R$attr;
import androidx.appcompat.R$string;
import androidx.appcompat.R$styleable;
import androidx.customview.view.AbsSavedState;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.WeakHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import p000.C3010fq;
import p000.C3048gr;
import p000.RunnableC0002a0;
import p000.RunnableC3795yg;
import p000.ViewOnClickListenerC3135j5;
import p000.a6a;
import p000.ata;
import p000.bna;
import p000.ce3;
import p000.dta;
import p000.hw5;
import p000.mt6;
import p000.mw5;
import p000.nr9;
import p000.p32;
import p000.r5a;
import p000.s5a;
import p000.sq5;
import p000.t5a;
import p000.u5a;
import p000.ued;
import p000.un9;
import p000.v5a;
import p000.web;
import p000.x5a;
import p000.xj8;

/* JADX INFO: loaded from: classes.dex */
public class Toolbar extends ViewGroup {

    /* JADX INFO: renamed from: H */
    public int f1152H;

    /* JADX INFO: renamed from: I */
    public final int f1153I;

    /* JADX INFO: renamed from: J */
    public final int f1154J;

    /* JADX INFO: renamed from: K */
    public int f1155K;

    /* JADX INFO: renamed from: L */
    public int f1156L;

    /* JADX INFO: renamed from: M */
    public int f1157M;

    /* JADX INFO: renamed from: N */
    public int f1158N;

    /* JADX INFO: renamed from: O */
    public xj8 f1159O;

    /* JADX INFO: renamed from: P */
    public int f1160P;

    /* JADX INFO: renamed from: Q */
    public int f1161Q;

    /* JADX INFO: renamed from: R */
    public final int f1162R;

    /* JADX INFO: renamed from: S */
    public CharSequence f1163S;

    /* JADX INFO: renamed from: T */
    public CharSequence f1164T;

    /* JADX INFO: renamed from: U */
    public ColorStateList f1165U;

    /* JADX INFO: renamed from: V */
    public ColorStateList f1166V;

    /* JADX INFO: renamed from: W */
    public boolean f1167W;

    /* JADX INFO: renamed from: a */
    public ActionMenuView f1168a;

    /* JADX INFO: renamed from: a0 */
    public boolean f1169a0;

    /* JADX INFO: renamed from: b */
    public C3048gr f1170b;

    /* JADX INFO: renamed from: b0 */
    public final ArrayList f1171b0;

    /* JADX INFO: renamed from: c */
    public C3048gr f1172c;

    /* JADX INFO: renamed from: c0 */
    public final ArrayList f1173c0;

    /* JADX INFO: renamed from: d */
    public C3010fq f1174d;

    /* JADX INFO: renamed from: d0 */
    public final int[] f1175d0;

    /* JADX INFO: renamed from: e */
    public AppCompatImageView f1176e;

    /* JADX INFO: renamed from: e0 */
    public final sq5 f1177e0;

    /* JADX INFO: renamed from: f */
    public final Drawable f1178f;

    /* JADX INFO: renamed from: f0 */
    public ArrayList f1179f0;

    /* JADX INFO: renamed from: g */
    public final CharSequence f1180g;

    /* JADX INFO: renamed from: g0 */
    public final nr9 f1181g0;

    /* JADX INFO: renamed from: h */
    public C3010fq f1182h;

    /* JADX INFO: renamed from: h0 */
    public x5a f1183h0;

    /* JADX INFO: renamed from: i */
    public View f1184i;

    /* JADX INFO: renamed from: i0 */
    public C0035b f1185i0;

    /* JADX INFO: renamed from: j */
    public Context f1186j;

    /* JADX INFO: renamed from: j0 */
    public s5a f1187j0;

    /* JADX INFO: renamed from: k */
    public int f1188k;

    /* JADX INFO: renamed from: k0 */
    public boolean f1189k0;

    /* JADX INFO: renamed from: l */
    public int f1190l;

    /* JADX INFO: renamed from: l0 */
    public OnBackInvokedCallback f1191l0;

    /* JADX INFO: renamed from: m0 */
    public OnBackInvokedDispatcher f1192m0;

    /* JADX INFO: renamed from: n0 */
    public boolean f1193n0;

    /* JADX INFO: renamed from: o0 */
    public final RunnableC3795yg f1194o0;

    public Toolbar(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f1162R = 8388627;
        this.f1171b0 = new ArrayList();
        this.f1173c0 = new ArrayList();
        this.f1175d0 = new int[2];
        this.f1177e0 = new sq5(new RunnableC0002a0(this, 17));
        this.f1179f0 = new ArrayList();
        this.f1181g0 = new nr9(this);
        this.f1194o0 = new RunnableC3795yg(this, 9);
        sq5 sq5VarM21551w = sq5.m21551w(i, 0, getContext(), attributeSet, R$styleable.Toolbar);
        int[] iArr = R$styleable.Toolbar;
        TypedArray typedArray = (TypedArray) sq5VarM21551w.f61249c;
        WeakHashMap weakHashMap = dta.f36217a;
        ata.m3035b(this, context, iArr, attributeSet, typedArray, i, 0);
        int i2 = R$styleable.Toolbar_titleTextAppearance;
        TypedArray typedArray2 = (TypedArray) sq5VarM21551w.f61249c;
        this.f1190l = typedArray2.getResourceId(i2, 0);
        this.f1152H = typedArray2.getResourceId(R$styleable.Toolbar_subtitleTextAppearance, 0);
        this.f1162R = typedArray2.getInteger(R$styleable.Toolbar_android_gravity, 8388627);
        this.f1153I = typedArray2.getInteger(R$styleable.Toolbar_buttonGravity, 48);
        int dimensionPixelOffset = typedArray2.getDimensionPixelOffset(R$styleable.Toolbar_titleMargin, 0);
        dimensionPixelOffset = typedArray2.hasValue(R$styleable.Toolbar_titleMargins) ? typedArray2.getDimensionPixelOffset(R$styleable.Toolbar_titleMargins, dimensionPixelOffset) : dimensionPixelOffset;
        this.f1158N = dimensionPixelOffset;
        this.f1157M = dimensionPixelOffset;
        this.f1156L = dimensionPixelOffset;
        this.f1155K = dimensionPixelOffset;
        int dimensionPixelOffset2 = typedArray2.getDimensionPixelOffset(R$styleable.Toolbar_titleMarginStart, -1);
        if (dimensionPixelOffset2 >= 0) {
            this.f1155K = dimensionPixelOffset2;
        }
        int dimensionPixelOffset3 = typedArray2.getDimensionPixelOffset(R$styleable.Toolbar_titleMarginEnd, -1);
        if (dimensionPixelOffset3 >= 0) {
            this.f1156L = dimensionPixelOffset3;
        }
        int dimensionPixelOffset4 = typedArray2.getDimensionPixelOffset(R$styleable.Toolbar_titleMarginTop, -1);
        if (dimensionPixelOffset4 >= 0) {
            this.f1157M = dimensionPixelOffset4;
        }
        int dimensionPixelOffset5 = typedArray2.getDimensionPixelOffset(R$styleable.Toolbar_titleMarginBottom, -1);
        if (dimensionPixelOffset5 >= 0) {
            this.f1158N = dimensionPixelOffset5;
        }
        this.f1154J = typedArray2.getDimensionPixelSize(R$styleable.Toolbar_maxButtonHeight, -1);
        int dimensionPixelOffset6 = typedArray2.getDimensionPixelOffset(R$styleable.Toolbar_contentInsetStart, Integer.MIN_VALUE);
        int dimensionPixelOffset7 = typedArray2.getDimensionPixelOffset(R$styleable.Toolbar_contentInsetEnd, Integer.MIN_VALUE);
        int dimensionPixelSize = typedArray2.getDimensionPixelSize(R$styleable.Toolbar_contentInsetLeft, 0);
        int dimensionPixelSize2 = typedArray2.getDimensionPixelSize(R$styleable.Toolbar_contentInsetRight, 0);
        m687d();
        xj8 xj8Var = this.f1159O;
        xj8Var.f68301h = false;
        if (dimensionPixelSize != Integer.MIN_VALUE) {
            xj8Var.f68298e = dimensionPixelSize;
            xj8Var.f68294a = dimensionPixelSize;
        }
        if (dimensionPixelSize2 != Integer.MIN_VALUE) {
            xj8Var.f68299f = dimensionPixelSize2;
            xj8Var.f68295b = dimensionPixelSize2;
        }
        if (dimensionPixelOffset6 != Integer.MIN_VALUE || dimensionPixelOffset7 != Integer.MIN_VALUE) {
            xj8Var.m24572a(dimensionPixelOffset6, dimensionPixelOffset7);
        }
        this.f1160P = typedArray2.getDimensionPixelOffset(R$styleable.Toolbar_contentInsetStartWithNavigation, Integer.MIN_VALUE);
        this.f1161Q = typedArray2.getDimensionPixelOffset(R$styleable.Toolbar_contentInsetEndWithActions, Integer.MIN_VALUE);
        this.f1178f = sq5VarM21551w.m21568j(R$styleable.Toolbar_collapseIcon);
        this.f1180g = typedArray2.getText(R$styleable.Toolbar_collapseContentDescription);
        CharSequence text = typedArray2.getText(R$styleable.Toolbar_title);
        if (!TextUtils.isEmpty(text)) {
            setTitle(text);
        }
        CharSequence text2 = typedArray2.getText(R$styleable.Toolbar_subtitle);
        if (!TextUtils.isEmpty(text2)) {
            setSubtitle(text2);
        }
        this.f1186j = getContext();
        setPopupTheme(typedArray2.getResourceId(R$styleable.Toolbar_popupTheme, 0));
        Drawable drawableM21568j = sq5VarM21551w.m21568j(R$styleable.Toolbar_navigationIcon);
        if (drawableM21568j != null) {
            setNavigationIcon(drawableM21568j);
        }
        CharSequence text3 = typedArray2.getText(R$styleable.Toolbar_navigationContentDescription);
        if (!TextUtils.isEmpty(text3)) {
            setNavigationContentDescription(text3);
        }
        Drawable drawableM21568j2 = sq5VarM21551w.m21568j(R$styleable.Toolbar_logo);
        if (drawableM21568j2 != null) {
            setLogo(drawableM21568j2);
        }
        CharSequence text4 = typedArray2.getText(R$styleable.Toolbar_logoDescription);
        if (!TextUtils.isEmpty(text4)) {
            setLogoDescription(text4);
        }
        if (typedArray2.hasValue(R$styleable.Toolbar_titleTextColor)) {
            setTitleTextColor(sq5VarM21551w.m21567i(R$styleable.Toolbar_titleTextColor));
        }
        if (typedArray2.hasValue(R$styleable.Toolbar_subtitleTextColor)) {
            setSubtitleTextColor(sq5VarM21551w.m21567i(R$styleable.Toolbar_subtitleTextColor));
        }
        if (typedArray2.hasValue(R$styleable.Toolbar_menu)) {
            getMenuInflater().inflate(typedArray2.getResourceId(R$styleable.Toolbar_menu, 0), getMenu());
        }
        sq5VarM21551w.m21582y();
    }

    private ArrayList<MenuItem> getCurrentMenuItems() {
        ArrayList<MenuItem> arrayList = new ArrayList<>();
        Menu menu = getMenu();
        for (int i = 0; i < menu.size(); i++) {
            arrayList.add(menu.getItem(i));
        }
        return arrayList;
    }

    private MenuInflater getMenuInflater() {
        return new un9(getContext());
    }

    /* JADX INFO: renamed from: h */
    public static t5a m680h() {
        t5a t5aVar = new t5a(-2, -2);
        t5aVar.f61890b = 0;
        t5aVar.f61889a = 8388627;
        return t5aVar;
    }

    /* JADX INFO: renamed from: i */
    public static t5a m681i(ViewGroup.LayoutParams layoutParams) {
        boolean z = layoutParams instanceof t5a;
        if (z) {
            t5a t5aVar = (t5a) layoutParams;
            t5a t5aVar2 = new t5a(t5aVar);
            t5aVar2.f61890b = 0;
            t5aVar2.f61890b = t5aVar.f61890b;
            return t5aVar2;
        }
        if (z) {
            t5a t5aVar3 = new t5a((t5a) layoutParams);
            t5aVar3.f61890b = 0;
            return t5aVar3;
        }
        if (!(layoutParams instanceof ViewGroup.MarginLayoutParams)) {
            t5a t5aVar4 = new t5a(layoutParams);
            t5aVar4.f61890b = 0;
            return t5aVar4;
        }
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
        t5a t5aVar5 = new t5a(marginLayoutParams);
        t5aVar5.f61890b = 0;
        ((ViewGroup.MarginLayoutParams) t5aVar5).leftMargin = marginLayoutParams.leftMargin;
        ((ViewGroup.MarginLayoutParams) t5aVar5).topMargin = marginLayoutParams.topMargin;
        ((ViewGroup.MarginLayoutParams) t5aVar5).rightMargin = marginLayoutParams.rightMargin;
        ((ViewGroup.MarginLayoutParams) t5aVar5).bottomMargin = marginLayoutParams.bottomMargin;
        return t5aVar5;
    }

    /* JADX INFO: renamed from: k */
    public static int m682k(View view) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        return marginLayoutParams.getMarginEnd() + marginLayoutParams.getMarginStart();
    }

    /* JADX INFO: renamed from: l */
    public static int m683l(View view) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        return marginLayoutParams.topMargin + marginLayoutParams.bottomMargin;
    }

    /* JADX INFO: renamed from: a */
    public final void m684a(int i, ArrayList arrayList) {
        boolean z = getLayoutDirection() == 1;
        int childCount = getChildCount();
        int iM22721a = ued.m22721a(i, getLayoutDirection());
        arrayList.clear();
        if (!z) {
            for (int i2 = 0; i2 < childCount; i2++) {
                View childAt = getChildAt(i2);
                t5a t5aVar = (t5a) childAt.getLayoutParams();
                if (t5aVar.f61890b == 0 && m698s(childAt)) {
                    int i3 = t5aVar.f61889a;
                    int layoutDirection = getLayoutDirection();
                    int iM22721a2 = ued.m22721a(i3, layoutDirection) & 7;
                    if (iM22721a2 != 1 && iM22721a2 != 3 && iM22721a2 != 5) {
                        iM22721a2 = layoutDirection == 1 ? 5 : 3;
                    }
                    if (iM22721a2 == iM22721a) {
                        arrayList.add(childAt);
                    }
                }
            }
            return;
        }
        for (int i4 = childCount - 1; i4 >= 0; i4--) {
            View childAt2 = getChildAt(i4);
            t5a t5aVar2 = (t5a) childAt2.getLayoutParams();
            if (t5aVar2.f61890b == 0 && m698s(childAt2)) {
                int i5 = t5aVar2.f61889a;
                int layoutDirection2 = getLayoutDirection();
                int iM22721a3 = ued.m22721a(i5, layoutDirection2) & 7;
                if (iM22721a3 != 1 && iM22721a3 != 3 && iM22721a3 != 5) {
                    iM22721a3 = layoutDirection2 == 1 ? 5 : 3;
                }
                if (iM22721a3 == iM22721a) {
                    arrayList.add(childAt2);
                }
            }
        }
    }

    /* JADX INFO: renamed from: b */
    public final void m685b(View view, boolean z) {
        t5a t5aVarM681i;
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams == null) {
            t5aVarM681i = m680h();
        } else {
            t5aVarM681i = !checkLayoutParams(layoutParams) ? m681i(layoutParams) : (t5a) layoutParams;
        }
        t5aVarM681i.f61890b = 1;
        if (!z || this.f1184i == null) {
            addView(view, t5aVarM681i);
        } else {
            view.setLayoutParams(t5aVarM681i);
            this.f1173c0.add(view);
        }
    }

    /* JADX INFO: renamed from: c */
    public final void m686c() {
        if (this.f1182h == null) {
            C3010fq c3010fq = new C3010fq(getContext(), null, R$attr.toolbarNavigationButtonStyle);
            this.f1182h = c3010fq;
            c3010fq.setImageDrawable(this.f1178f);
            this.f1182h.setContentDescription(this.f1180g);
            t5a t5aVarM680h = m680h();
            t5aVarM680h.f61889a = (this.f1153I & 112) | 8388611;
            t5aVarM680h.f61890b = 2;
            this.f1182h.setLayoutParams(t5aVarM680h);
            this.f1182h.setOnClickListener(new ViewOnClickListenerC3135j5(this, 6));
        }
    }

    @Override // android.view.ViewGroup
    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return super.checkLayoutParams(layoutParams) && (layoutParams instanceof t5a);
    }

    /* JADX INFO: renamed from: d */
    public final void m687d() {
        if (this.f1159O == null) {
            xj8 xj8Var = new xj8();
            xj8Var.f68294a = 0;
            xj8Var.f68295b = 0;
            xj8Var.f68296c = Integer.MIN_VALUE;
            xj8Var.f68297d = Integer.MIN_VALUE;
            xj8Var.f68298e = 0;
            xj8Var.f68299f = 0;
            xj8Var.f68300g = false;
            xj8Var.f68301h = false;
            this.f1159O = xj8Var;
        }
    }

    /* JADX INFO: renamed from: e */
    public final void m688e() {
        m689f();
        ActionMenuView actionMenuView = this.f1168a;
        if (actionMenuView.f1108K == null) {
            hw5 hw5Var = (hw5) actionMenuView.getMenu();
            if (this.f1187j0 == null) {
                this.f1187j0 = new s5a(this);
            }
            this.f1168a.setExpandedActionViewsExclusive(true);
            hw5Var.m13519b(this.f1187j0, this.f1186j);
            m699t();
        }
    }

    /* JADX INFO: renamed from: f */
    public final void m689f() {
        if (this.f1168a == null) {
            ActionMenuView actionMenuView = new ActionMenuView(getContext());
            this.f1168a = actionMenuView;
            actionMenuView.setPopupTheme(this.f1188k);
            this.f1168a.setOnMenuItemClickListener(this.f1181g0);
            ActionMenuView actionMenuView2 = this.f1168a;
            web webVar = new web(this);
            actionMenuView2.getClass();
            actionMenuView2.f1113P = webVar;
            t5a t5aVarM680h = m680h();
            t5aVarM680h.f61889a = (this.f1153I & 112) | 8388613;
            this.f1168a.setLayoutParams(t5aVarM680h);
            m685b(this.f1168a, false);
        }
    }

    /* JADX INFO: renamed from: g */
    public final void m690g() {
        if (this.f1174d == null) {
            this.f1174d = new C3010fq(getContext(), null, R$attr.toolbarNavigationButtonStyle);
            t5a t5aVarM680h = m680h();
            t5aVarM680h.f61889a = (this.f1153I & 112) | 8388611;
            this.f1174d.setLayoutParams(t5aVarM680h);
        }
    }

    @Override // android.view.ViewGroup
    public final /* bridge */ /* synthetic */ ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return m680h();
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        Context context = getContext();
        t5a t5aVar = new t5a(context, attributeSet);
        t5aVar.f61889a = 0;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.ActionBarLayout);
        t5aVar.f61889a = typedArrayObtainStyledAttributes.getInt(R$styleable.ActionBarLayout_android_layout_gravity, 0);
        typedArrayObtainStyledAttributes.recycle();
        t5aVar.f61890b = 0;
        return t5aVar;
    }

    public CharSequence getCollapseContentDescription() {
        C3010fq c3010fq = this.f1182h;
        if (c3010fq != null) {
            return c3010fq.getContentDescription();
        }
        return null;
    }

    public Drawable getCollapseIcon() {
        C3010fq c3010fq = this.f1182h;
        if (c3010fq != null) {
            return c3010fq.getDrawable();
        }
        return null;
    }

    public int getContentInsetEnd() {
        xj8 xj8Var = this.f1159O;
        if (xj8Var != null) {
            return xj8Var.f68300g ? xj8Var.f68294a : xj8Var.f68295b;
        }
        return 0;
    }

    public int getContentInsetEndWithActions() {
        int i = this.f1161Q;
        return i != Integer.MIN_VALUE ? i : getContentInsetEnd();
    }

    public int getContentInsetLeft() {
        xj8 xj8Var = this.f1159O;
        if (xj8Var != null) {
            return xj8Var.f68294a;
        }
        return 0;
    }

    public int getContentInsetRight() {
        xj8 xj8Var = this.f1159O;
        if (xj8Var != null) {
            return xj8Var.f68295b;
        }
        return 0;
    }

    public int getContentInsetStart() {
        xj8 xj8Var = this.f1159O;
        if (xj8Var != null) {
            return xj8Var.f68300g ? xj8Var.f68295b : xj8Var.f68294a;
        }
        return 0;
    }

    public int getContentInsetStartWithNavigation() {
        int i = this.f1160P;
        return i != Integer.MIN_VALUE ? i : getContentInsetStart();
    }

    public int getCurrentContentInsetEnd() {
        hw5 hw5Var;
        ActionMenuView actionMenuView = this.f1168a;
        return (actionMenuView == null || (hw5Var = actionMenuView.f1108K) == null || !hw5Var.hasVisibleItems()) ? getContentInsetEnd() : Math.max(getContentInsetEnd(), Math.max(this.f1161Q, 0));
    }

    public int getCurrentContentInsetLeft() {
        return getLayoutDirection() == 1 ? getCurrentContentInsetEnd() : getCurrentContentInsetStart();
    }

    public int getCurrentContentInsetRight() {
        return getLayoutDirection() == 1 ? getCurrentContentInsetStart() : getCurrentContentInsetEnd();
    }

    public int getCurrentContentInsetStart() {
        return getNavigationIcon() != null ? Math.max(getContentInsetStart(), Math.max(this.f1160P, 0)) : getContentInsetStart();
    }

    public Drawable getLogo() {
        AppCompatImageView appCompatImageView = this.f1176e;
        if (appCompatImageView != null) {
            return appCompatImageView.getDrawable();
        }
        return null;
    }

    public CharSequence getLogoDescription() {
        AppCompatImageView appCompatImageView = this.f1176e;
        if (appCompatImageView != null) {
            return appCompatImageView.getContentDescription();
        }
        return null;
    }

    public Menu getMenu() {
        m688e();
        return this.f1168a.getMenu();
    }

    public View getNavButtonView() {
        return this.f1174d;
    }

    public CharSequence getNavigationContentDescription() {
        C3010fq c3010fq = this.f1174d;
        if (c3010fq != null) {
            return c3010fq.getContentDescription();
        }
        return null;
    }

    public Drawable getNavigationIcon() {
        C3010fq c3010fq = this.f1174d;
        if (c3010fq != null) {
            return c3010fq.getDrawable();
        }
        return null;
    }

    public C0035b getOuterActionMenuPresenter() {
        return this.f1185i0;
    }

    public Drawable getOverflowIcon() {
        m688e();
        return this.f1168a.getOverflowIcon();
    }

    public Context getPopupContext() {
        return this.f1186j;
    }

    public int getPopupTheme() {
        return this.f1188k;
    }

    public CharSequence getSubtitle() {
        return this.f1164T;
    }

    public final TextView getSubtitleTextView() {
        return this.f1172c;
    }

    public CharSequence getTitle() {
        return this.f1163S;
    }

    public int getTitleMarginBottom() {
        return this.f1158N;
    }

    public int getTitleMarginEnd() {
        return this.f1156L;
    }

    public int getTitleMarginStart() {
        return this.f1155K;
    }

    public int getTitleMarginTop() {
        return this.f1157M;
    }

    public final TextView getTitleTextView() {
        return this.f1170b;
    }

    public p32 getWrapper() {
        Drawable drawable;
        if (this.f1183h0 == null) {
            int i = R$string.abc_action_bar_up_description;
            x5a x5aVar = new x5a();
            x5aVar.f67799n = 0;
            x5aVar.f67786a = this;
            x5aVar.f67793h = getTitle();
            x5aVar.f67794i = getSubtitle();
            x5aVar.f67792g = x5aVar.f67793h != null;
            x5aVar.f67791f = getNavigationIcon();
            sq5 sq5VarM21551w = sq5.m21551w(R$attr.actionBarStyle, 0, getContext(), null, R$styleable.ActionBar);
            TypedArray typedArray = (TypedArray) sq5VarM21551w.f61249c;
            x5aVar.f67800o = sq5VarM21551w.m21568j(R$styleable.ActionBar_homeAsUpIndicator);
            CharSequence text = typedArray.getText(R$styleable.ActionBar_title);
            if (!TextUtils.isEmpty(text)) {
                x5aVar.f67792g = true;
                x5aVar.f67793h = text;
                if ((x5aVar.f67787b & 8) != 0) {
                    setTitle(text);
                    if (x5aVar.f67792g) {
                        dta.m10641l(getRootView(), text);
                    }
                }
            }
            CharSequence text2 = typedArray.getText(R$styleable.ActionBar_subtitle);
            if (!TextUtils.isEmpty(text2)) {
                x5aVar.f67794i = text2;
                if ((x5aVar.f67787b & 8) != 0) {
                    setSubtitle(text2);
                }
            }
            Drawable drawableM21568j = sq5VarM21551w.m21568j(R$styleable.ActionBar_logo);
            if (drawableM21568j != null) {
                x5aVar.f67790e = drawableM21568j;
                x5aVar.m24290c();
            }
            Drawable drawableM21568j2 = sq5VarM21551w.m21568j(R$styleable.ActionBar_icon);
            if (drawableM21568j2 != null) {
                x5aVar.f67789d = drawableM21568j2;
                x5aVar.m24290c();
            }
            if (x5aVar.f67791f == null && (drawable = x5aVar.f67800o) != null) {
                x5aVar.f67791f = drawable;
                if ((x5aVar.f67787b & 4) != 0) {
                    setNavigationIcon(drawable);
                } else {
                    setNavigationIcon((Drawable) null);
                }
            }
            x5aVar.m24288a(typedArray.getInt(R$styleable.ActionBar_displayOptions, 0));
            int resourceId = typedArray.getResourceId(R$styleable.ActionBar_customNavigationLayout, 0);
            if (resourceId != 0) {
                View viewInflate = LayoutInflater.from(getContext()).inflate(resourceId, (ViewGroup) this, false);
                View view = x5aVar.f67788c;
                if (view != null && (x5aVar.f67787b & 16) != 0) {
                    removeView(view);
                }
                x5aVar.f67788c = viewInflate;
                if (viewInflate != null && (x5aVar.f67787b & 16) != 0) {
                    addView(viewInflate);
                }
                x5aVar.m24288a(x5aVar.f67787b | 16);
            }
            int layoutDimension = typedArray.getLayoutDimension(R$styleable.ActionBar_height, 0);
            if (layoutDimension > 0) {
                ViewGroup.LayoutParams layoutParams = getLayoutParams();
                layoutParams.height = layoutDimension;
                setLayoutParams(layoutParams);
            }
            int dimensionPixelOffset = typedArray.getDimensionPixelOffset(R$styleable.ActionBar_contentInsetStart, -1);
            int dimensionPixelOffset2 = typedArray.getDimensionPixelOffset(R$styleable.ActionBar_contentInsetEnd, -1);
            if (dimensionPixelOffset >= 0 || dimensionPixelOffset2 >= 0) {
                int iMax = Math.max(dimensionPixelOffset, 0);
                int iMax2 = Math.max(dimensionPixelOffset2, 0);
                m687d();
                this.f1159O.m24572a(iMax, iMax2);
            }
            int resourceId2 = typedArray.getResourceId(R$styleable.ActionBar_titleTextStyle, 0);
            if (resourceId2 != 0) {
                Context context = getContext();
                this.f1190l = resourceId2;
                C3048gr c3048gr = this.f1170b;
                if (c3048gr != null) {
                    c3048gr.setTextAppearance(context, resourceId2);
                }
            }
            int resourceId3 = typedArray.getResourceId(R$styleable.ActionBar_subtitleTextStyle, 0);
            if (resourceId3 != 0) {
                Context context2 = getContext();
                this.f1152H = resourceId3;
                C3048gr c3048gr2 = this.f1172c;
                if (c3048gr2 != null) {
                    c3048gr2.setTextAppearance(context2, resourceId3);
                }
            }
            int resourceId4 = typedArray.getResourceId(R$styleable.ActionBar_popupTheme, 0);
            if (resourceId4 != 0) {
                setPopupTheme(resourceId4);
            }
            sq5VarM21551w.m21582y();
            if (i != x5aVar.f67799n) {
                x5aVar.f67799n = i;
                if (TextUtils.isEmpty(getNavigationContentDescription())) {
                    int i2 = x5aVar.f67799n;
                    x5aVar.f67795j = i2 != 0 ? getContext().getString(i2) : null;
                    x5aVar.m24289b();
                }
            }
            x5aVar.f67795j = getNavigationContentDescription();
            setNavigationOnClickListener(new v5a(x5aVar));
            this.f1183h0 = x5aVar;
        }
        return this.f1183h0;
    }

    /* JADX INFO: renamed from: j */
    public final int m691j(View view, int i) {
        t5a t5aVar = (t5a) view.getLayoutParams();
        int measuredHeight = view.getMeasuredHeight();
        int i2 = i > 0 ? (measuredHeight - i) / 2 : 0;
        int i3 = t5aVar.f61889a & 112;
        if (i3 != 16 && i3 != 48 && i3 != 80) {
            i3 = this.f1162R & 112;
        }
        if (i3 == 48) {
            return getPaddingTop() - i2;
        }
        if (i3 == 80) {
            return (((getHeight() - getPaddingBottom()) - measuredHeight) - ((ViewGroup.MarginLayoutParams) t5aVar).bottomMargin) - i2;
        }
        int paddingTop = getPaddingTop();
        int paddingBottom = getPaddingBottom();
        int height = getHeight();
        int iMax = (((height - paddingTop) - paddingBottom) - measuredHeight) / 2;
        int i4 = ((ViewGroup.MarginLayoutParams) t5aVar).topMargin;
        if (iMax < i4) {
            iMax = i4;
        } else {
            int i5 = (((height - paddingBottom) - measuredHeight) - iMax) - paddingTop;
            int i6 = ((ViewGroup.MarginLayoutParams) t5aVar).bottomMargin;
            if (i5 < i6) {
                iMax = Math.max(0, iMax - (i6 - i5));
            }
        }
        return paddingTop + iMax;
    }

    /* JADX INFO: renamed from: m */
    public final void m692m() {
        Iterator it = this.f1179f0.iterator();
        while (it.hasNext()) {
            getMenu().removeItem(((MenuItem) it.next()).getItemId());
        }
        getMenu();
        ArrayList<MenuItem> currentMenuItems = getCurrentMenuItems();
        getMenuInflater();
        Iterator it2 = ((CopyOnWriteArrayList) this.f1177e0.f61249c).iterator();
        while (it2.hasNext()) {
            ((ce3) it2.next()).f9965a.m2173k();
        }
        ArrayList<MenuItem> currentMenuItems2 = getCurrentMenuItems();
        currentMenuItems2.removeAll(currentMenuItems);
        this.f1179f0 = currentMenuItems2;
    }

    /* JADX INFO: renamed from: n */
    public final boolean m693n(View view) {
        return view.getParent() == this || this.f1173c0.contains(view);
    }

    /* JADX INFO: renamed from: o */
    public final int m694o(View view, int i, int i2, int[] iArr) {
        t5a t5aVar = (t5a) view.getLayoutParams();
        int i3 = ((ViewGroup.MarginLayoutParams) t5aVar).leftMargin - iArr[0];
        int iMax = Math.max(0, i3) + i;
        iArr[0] = Math.max(0, -i3);
        int iM691j = m691j(view, i2);
        int measuredWidth = view.getMeasuredWidth();
        view.layout(iMax, iM691j, iMax + measuredWidth, view.getMeasuredHeight() + iM691j);
        return measuredWidth + ((ViewGroup.MarginLayoutParams) t5aVar).rightMargin + iMax;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        m699t();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        removeCallbacks(this.f1194o0);
        m699t();
    }

    @Override // android.view.View
    public final boolean onHoverEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 9) {
            this.f1169a0 = false;
        }
        if (!this.f1169a0) {
            boolean zOnHoverEvent = super.onHoverEvent(motionEvent);
            if (actionMasked == 9 && !zOnHoverEvent) {
                this.f1169a0 = true;
            }
        }
        if (actionMasked != 10 && actionMasked != 3) {
            return true;
        }
        this.f1169a0 = false;
        return true;
    }

    /* JADX WARN: Code duplicated, block: B:100:0x024b  */
    /* JADX WARN: Code duplicated, block: B:102:0x024e  */
    /* JADX WARN: Code duplicated, block: B:103:0x0270  */
    /* JADX WARN: Code duplicated, block: B:105:0x0273  */
    /* JADX WARN: Code duplicated, block: B:108:0x0285 A[LOOP:0: B:107:0x0283->B:108:0x0285, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:111:0x029d A[LOOP:1: B:110:0x029b->B:111:0x029d, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:114:0x02bd A[LOOP:2: B:113:0x02bb->B:114:0x02bd, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:118:0x0303 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:119:0x0305  */
    /* JADX WARN: Code duplicated, block: B:120:0x0309  */
    /* JADX WARN: Code duplicated, block: B:123:0x0310 A[LOOP:3: B:122:0x030e->B:123:0x0310, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:20:0x0060  */
    /* JADX WARN: Code duplicated, block: B:22:0x0064  */
    /* JADX WARN: Code duplicated, block: B:23:0x0069  */
    /* JADX WARN: Code duplicated, block: B:26:0x0075  */
    /* JADX WARN: Code duplicated, block: B:28:0x0079  */
    /* JADX WARN: Code duplicated, block: B:29:0x007e  */
    /* JADX WARN: Code duplicated, block: B:32:0x00b0  */
    /* JADX WARN: Code duplicated, block: B:34:0x00b4  */
    /* JADX WARN: Code duplicated, block: B:35:0x00b9  */
    /* JADX WARN: Code duplicated, block: B:38:0x00c5  */
    /* JADX WARN: Code duplicated, block: B:40:0x00c9  */
    /* JADX WARN: Code duplicated, block: B:41:0x00ce  */
    /* JADX WARN: Code duplicated, block: B:44:0x00e0  */
    /* JADX WARN: Code duplicated, block: B:45:0x00f7  */
    /* JADX WARN: Code duplicated, block: B:47:0x00fc  */
    /* JADX WARN: Code duplicated, block: B:48:0x0115  */
    /* JADX WARN: Code duplicated, block: B:51:0x011b A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:52:0x011d  */
    /* JADX WARN: Code duplicated, block: B:53:0x0120  */
    /* JADX WARN: Code duplicated, block: B:55:0x0124  */
    /* JADX WARN: Code duplicated, block: B:56:0x0127  */
    /* JADX WARN: Code duplicated, block: B:59:0x0139  */
    /* JADX WARN: Code duplicated, block: B:61:0x0141 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:68:0x015a  */
    /* JADX WARN: Code duplicated, block: B:70:0x015e  */
    /* JADX WARN: Code duplicated, block: B:72:0x016f  */
    /* JADX WARN: Code duplicated, block: B:73:0x0171  */
    /* JADX WARN: Code duplicated, block: B:75:0x017d  */
    /* JADX WARN: Code duplicated, block: B:77:0x0189  */
    /* JADX WARN: Code duplicated, block: B:78:0x0193  */
    /* JADX WARN: Code duplicated, block: B:80:0x01a0 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:81:0x01a2  */
    /* JADX WARN: Code duplicated, block: B:82:0x01a5  */
    /* JADX WARN: Code duplicated, block: B:85:0x01b8  */
    /* JADX WARN: Code duplicated, block: B:86:0x01dc  */
    /* JADX WARN: Code duplicated, block: B:88:0x01df  */
    /* JADX WARN: Code duplicated, block: B:89:0x0203  */
    /* JADX WARN: Code duplicated, block: B:91:0x0206  */
    /* JADX WARN: Code duplicated, block: B:93:0x020e A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:94:0x0210  */
    /* JADX WARN: Code duplicated, block: B:96:0x0214  */
    /* JADX WARN: Code duplicated, block: B:99:0x0228  */
    @Override // android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int iM694o;
        int iM695p;
        int iMax;
        int iMin;
        boolean zM698s;
        boolean zM698s2;
        int measuredHeight;
        C3048gr c3048gr;
        C3048gr c3048gr2;
        t5a t5aVar;
        t5a t5aVar2;
        int i5;
        boolean z2;
        int i6;
        int i7;
        int paddingTop;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        int iMax2;
        int i14;
        int i15;
        int i16;
        int i17;
        ArrayList arrayList;
        int size;
        int iM694o2;
        int i18;
        int size2;
        int i19;
        int i20;
        int size3;
        int i21;
        int i22;
        int measuredWidth;
        int i23;
        int i24;
        int i25;
        int size4;
        AppCompatImageView appCompatImageView;
        View view;
        ActionMenuView actionMenuView;
        C3010fq c3010fq;
        boolean z3 = getLayoutDirection() == 1;
        int width = getWidth();
        int height = getHeight();
        int paddingLeft = getPaddingLeft();
        int paddingRight = getPaddingRight();
        int paddingTop2 = getPaddingTop();
        int paddingBottom = getPaddingBottom();
        int i26 = width - paddingRight;
        int[] iArr = this.f1175d0;
        iArr[1] = 0;
        iArr[0] = 0;
        WeakHashMap weakHashMap = dta.f36217a;
        int minimumHeight = getMinimumHeight();
        int iMin2 = minimumHeight >= 0 ? Math.min(minimumHeight, i4 - i2) : 0;
        if (m698s(this.f1174d)) {
            C3010fq c3010fq2 = this.f1174d;
            if (z3) {
                iM695p = m695p(c3010fq2, i26, iMin2, iArr);
                iM694o = paddingLeft;
            } else {
                iM694o = m694o(c3010fq2, paddingLeft, iMin2, iArr);
            }
            if (m698s(this.f1182h)) {
                c3010fq = this.f1182h;
                if (z3) {
                    iM695p = m695p(c3010fq, iM695p, iMin2, iArr);
                } else {
                    iM694o = m694o(c3010fq, iM694o, iMin2, iArr);
                }
            }
            if (m698s(this.f1168a)) {
                actionMenuView = this.f1168a;
                if (z3) {
                    iM694o = m694o(actionMenuView, iM694o, iMin2, iArr);
                } else {
                    iM695p = m695p(actionMenuView, iM695p, iMin2, iArr);
                }
            }
            int currentContentInsetLeft = getCurrentContentInsetLeft();
            int currentContentInsetRight = getCurrentContentInsetRight();
            iArr[0] = Math.max(0, currentContentInsetLeft - iM694o);
            iArr[1] = Math.max(0, currentContentInsetRight - (i26 - iM695p));
            iMax = Math.max(iM694o, currentContentInsetLeft);
            iMin = Math.min(iM695p, i26 - currentContentInsetRight);
            if (m698s(this.f1184i)) {
                view = this.f1184i;
                if (z3) {
                    iMin = m695p(view, iMin, iMin2, iArr);
                } else {
                    iMax = m694o(view, iMax, iMin2, iArr);
                }
            }
            if (m698s(this.f1176e)) {
                appCompatImageView = this.f1176e;
                if (z3) {
                    iMin = m695p(appCompatImageView, iMin, iMin2, iArr);
                } else {
                    iMax = m694o(appCompatImageView, iMax, iMin2, iArr);
                }
            }
            zM698s = m698s(this.f1170b);
            zM698s2 = m698s(this.f1172c);
            if (zM698s) {
                t5a t5aVar3 = (t5a) this.f1170b.getLayoutParams();
                measuredHeight = this.f1170b.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) t5aVar3).topMargin + ((ViewGroup.MarginLayoutParams) t5aVar3).bottomMargin;
            } else {
                measuredHeight = 0;
            }
            if (zM698s2) {
                t5a t5aVar4 = (t5a) this.f1172c.getLayoutParams();
                measuredHeight = this.f1172c.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) t5aVar4).topMargin + ((ViewGroup.MarginLayoutParams) t5aVar4).bottomMargin + measuredHeight;
            }
            if (zM698s || zM698s2) {
                if (zM698s) {
                    c3048gr = this.f1170b;
                } else {
                    c3048gr = this.f1172c;
                }
                if (zM698s2) {
                    c3048gr2 = this.f1172c;
                } else {
                    c3048gr2 = this.f1170b;
                }
                t5aVar = (t5a) c3048gr.getLayoutParams();
                t5aVar2 = (t5a) c3048gr2.getLayoutParams();
                i5 = measuredHeight;
                z2 = (!zM698s && this.f1170b.getMeasuredWidth() > 0) || (zM698s2 && this.f1172c.getMeasuredWidth() > 0);
                i6 = this.f1162R & 112;
                i7 = iMax;
                if (i6 == 48) {
                    paddingTop = getPaddingTop() + ((ViewGroup.MarginLayoutParams) t5aVar).topMargin + this.f1157M;
                } else if (i6 != 80) {
                    iMax2 = (((height - paddingTop2) - paddingBottom) - i5) / 2;
                    i14 = ((ViewGroup.MarginLayoutParams) t5aVar).topMargin + this.f1157M;
                    if (iMax2 < i14) {
                        iMax2 = i14;
                    } else {
                        i15 = (((height - paddingBottom) - i5) - iMax2) - paddingTop2;
                        i16 = ((ViewGroup.MarginLayoutParams) t5aVar).bottomMargin;
                        i17 = this.f1158N;
                        if (i15 < i16 + i17) {
                            iMax2 = Math.max(0, iMax2 - ((((ViewGroup.MarginLayoutParams) t5aVar2).bottomMargin + i17) - i15));
                        }
                    }
                    paddingTop = paddingTop2 + iMax2;
                } else {
                    paddingTop = (((height - paddingBottom) - ((ViewGroup.MarginLayoutParams) t5aVar2).bottomMargin) - this.f1158N) - i5;
                }
                if (z3) {
                    if (z2) {
                        i11 = this.f1155K;
                    } else {
                        i11 = 0;
                    }
                    int i27 = i11 - iArr[1];
                    iMin -= Math.max(0, i27);
                    iArr[1] = Math.max(0, -i27);
                    if (zM698s) {
                        t5a t5aVar5 = (t5a) this.f1170b.getLayoutParams();
                        int measuredWidth2 = iMin - this.f1170b.getMeasuredWidth();
                        int measuredHeight2 = this.f1170b.getMeasuredHeight() + paddingTop;
                        this.f1170b.layout(measuredWidth2, paddingTop, iMin, measuredHeight2);
                        i12 = measuredWidth2 - this.f1156L;
                        paddingTop = measuredHeight2 + ((ViewGroup.MarginLayoutParams) t5aVar5).bottomMargin;
                    } else {
                        i12 = iMin;
                    }
                    if (zM698s2) {
                        int i28 = paddingTop + ((ViewGroup.MarginLayoutParams) ((t5a) this.f1172c.getLayoutParams())).topMargin;
                        this.f1172c.layout(iMin - this.f1172c.getMeasuredWidth(), i28, iMin, this.f1172c.getMeasuredHeight() + i28);
                        i13 = iMin - this.f1156L;
                    } else {
                        i13 = iMin;
                    }
                    if (z2) {
                        iMin = Math.min(i12, i13);
                    }
                    iMax = i7;
                } else {
                    if (z2) {
                        i8 = this.f1155K;
                    } else {
                        i8 = 0;
                    }
                    int i29 = i8 - iArr[0];
                    iMax = Math.max(0, i29) + i7;
                    iArr[0] = Math.max(0, -i29);
                    if (zM698s) {
                        t5a t5aVar6 = (t5a) this.f1170b.getLayoutParams();
                        int measuredWidth3 = this.f1170b.getMeasuredWidth() + iMax;
                        int measuredHeight3 = this.f1170b.getMeasuredHeight() + paddingTop;
                        this.f1170b.layout(iMax, paddingTop, measuredWidth3, measuredHeight3);
                        i9 = measuredWidth3 + this.f1156L;
                        paddingTop = measuredHeight3 + ((ViewGroup.MarginLayoutParams) t5aVar6).bottomMargin;
                    } else {
                        i9 = iMax;
                    }
                    if (zM698s2) {
                        int i30 = paddingTop + ((ViewGroup.MarginLayoutParams) ((t5a) this.f1172c.getLayoutParams())).topMargin;
                        int measuredWidth4 = this.f1172c.getMeasuredWidth() + iMax;
                        this.f1172c.layout(iMax, i30, measuredWidth4, this.f1172c.getMeasuredHeight() + i30);
                        i10 = measuredWidth4 + this.f1156L;
                    } else {
                        i10 = iMax;
                    }
                    if (z2) {
                        iMax = Math.max(i9, i10);
                    }
                }
            }
            arrayList = this.f1171b0;
            m684a(3, arrayList);
            size = arrayList.size();
            iM694o2 = iMax;
            for (i18 = 0; i18 < size; i18++) {
                iM694o2 = m694o((View) arrayList.get(i18), iM694o2, iMin2, iArr);
            }
            m684a(5, arrayList);
            size2 = arrayList.size();
            for (i19 = 0; i19 < size2; i19++) {
                iMin = m695p((View) arrayList.get(i19), iMin, iMin2, iArr);
            }
            m684a(1, arrayList);
            int i31 = iArr[0];
            i20 = iArr[1];
            size3 = arrayList.size();
            i21 = i31;
            i22 = 0;
            measuredWidth = 0;
            while (i22 < size3) {
                View view2 = (View) arrayList.get(i22);
                t5a t5aVar7 = (t5a) view2.getLayoutParams();
                int i32 = i20;
                int i33 = ((ViewGroup.MarginLayoutParams) t5aVar7).leftMargin - i21;
                int i34 = ((ViewGroup.MarginLayoutParams) t5aVar7).rightMargin - i32;
                int iMax3 = Math.max(0, i33);
                int iMax4 = Math.max(0, i34);
                int iMax5 = Math.max(0, -i33);
                int iMax6 = Math.max(0, -i34);
                measuredWidth += view2.getMeasuredWidth() + iMax3 + iMax4;
                i22++;
                i21 = iMax5;
                i20 = iMax6;
            }
            i24 = ((((width - paddingLeft) - paddingRight) / 2) + paddingLeft) - (measuredWidth / 2);
            i25 = measuredWidth + i24;
            if (i24 >= iM694o2) {
                if (i25 > iMin) {
                    iM694o2 = i24 - (i25 - iMin);
                } else {
                    iM694o2 = i24;
                }
            }
            size4 = arrayList.size();
            for (i23 = 0; i23 < size4; i23++) {
                iM694o2 = m694o((View) arrayList.get(i23), iM694o2, iMin2, iArr);
            }
            arrayList.clear();
        }
        iM694o = paddingLeft;
        iM695p = i26;
        if (m698s(this.f1182h)) {
            c3010fq = this.f1182h;
            if (z3) {
                iM695p = m695p(c3010fq, iM695p, iMin2, iArr);
            } else {
                iM694o = m694o(c3010fq, iM694o, iMin2, iArr);
            }
        }
        if (m698s(this.f1168a)) {
            actionMenuView = this.f1168a;
            if (z3) {
                iM694o = m694o(actionMenuView, iM694o, iMin2, iArr);
            } else {
                iM695p = m695p(actionMenuView, iM695p, iMin2, iArr);
            }
        }
        int currentContentInsetLeft2 = getCurrentContentInsetLeft();
        int currentContentInsetRight2 = getCurrentContentInsetRight();
        iArr[0] = Math.max(0, currentContentInsetLeft2 - iM694o);
        iArr[1] = Math.max(0, currentContentInsetRight2 - (i26 - iM695p));
        iMax = Math.max(iM694o, currentContentInsetLeft2);
        iMin = Math.min(iM695p, i26 - currentContentInsetRight2);
        if (m698s(this.f1184i)) {
            view = this.f1184i;
            if (z3) {
                iMin = m695p(view, iMin, iMin2, iArr);
            } else {
                iMax = m694o(view, iMax, iMin2, iArr);
            }
        }
        if (m698s(this.f1176e)) {
            appCompatImageView = this.f1176e;
            if (z3) {
                iMin = m695p(appCompatImageView, iMin, iMin2, iArr);
            } else {
                iMax = m694o(appCompatImageView, iMax, iMin2, iArr);
            }
        }
        zM698s = m698s(this.f1170b);
        zM698s2 = m698s(this.f1172c);
        if (zM698s) {
            t5a t5aVar8 = (t5a) this.f1170b.getLayoutParams();
            measuredHeight = this.f1170b.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) t5aVar8).topMargin + ((ViewGroup.MarginLayoutParams) t5aVar8).bottomMargin;
        } else {
            measuredHeight = 0;
        }
        if (zM698s2) {
            t5a t5aVar9 = (t5a) this.f1172c.getLayoutParams();
            measuredHeight = this.f1172c.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) t5aVar9).topMargin + ((ViewGroup.MarginLayoutParams) t5aVar9).bottomMargin + measuredHeight;
        }
        if (zM698s) {
            if (zM698s) {
                c3048gr = this.f1170b;
            } else {
                c3048gr = this.f1172c;
            }
            if (zM698s2) {
                c3048gr2 = this.f1172c;
            } else {
                c3048gr2 = this.f1170b;
            }
            t5aVar = (t5a) c3048gr.getLayoutParams();
            t5aVar2 = (t5a) c3048gr2.getLayoutParams();
            i5 = measuredHeight;
            if (zM698s) {
            }
            i6 = this.f1162R & 112;
            i7 = iMax;
            if (i6 == 48) {
                paddingTop = getPaddingTop() + ((ViewGroup.MarginLayoutParams) t5aVar).topMargin + this.f1157M;
            } else if (i6 != 80) {
                iMax2 = (((height - paddingTop2) - paddingBottom) - i5) / 2;
                i14 = ((ViewGroup.MarginLayoutParams) t5aVar).topMargin + this.f1157M;
                if (iMax2 < i14) {
                    iMax2 = i14;
                } else {
                    i15 = (((height - paddingBottom) - i5) - iMax2) - paddingTop2;
                    i16 = ((ViewGroup.MarginLayoutParams) t5aVar).bottomMargin;
                    i17 = this.f1158N;
                    if (i15 < i16 + i17) {
                        iMax2 = Math.max(0, iMax2 - ((((ViewGroup.MarginLayoutParams) t5aVar2).bottomMargin + i17) - i15));
                    }
                }
                paddingTop = paddingTop2 + iMax2;
            } else {
                paddingTop = (((height - paddingBottom) - ((ViewGroup.MarginLayoutParams) t5aVar2).bottomMargin) - this.f1158N) - i5;
            }
            if (z3) {
                if (z2) {
                    i11 = this.f1155K;
                } else {
                    i11 = 0;
                }
                int i210 = i11 - iArr[1];
                iMin -= Math.max(0, i210);
                iArr[1] = Math.max(0, -i210);
                if (zM698s) {
                    t5a t5aVar10 = (t5a) this.f1170b.getLayoutParams();
                    int measuredWidth5 = iMin - this.f1170b.getMeasuredWidth();
                    int measuredHeight4 = this.f1170b.getMeasuredHeight() + paddingTop;
                    this.f1170b.layout(measuredWidth5, paddingTop, iMin, measuredHeight4);
                    i12 = measuredWidth5 - this.f1156L;
                    paddingTop = measuredHeight4 + ((ViewGroup.MarginLayoutParams) t5aVar10).bottomMargin;
                } else {
                    i12 = iMin;
                }
                if (zM698s2) {
                    int i211 = paddingTop + ((ViewGroup.MarginLayoutParams) ((t5a) this.f1172c.getLayoutParams())).topMargin;
                    this.f1172c.layout(iMin - this.f1172c.getMeasuredWidth(), i211, iMin, this.f1172c.getMeasuredHeight() + i211);
                    i13 = iMin - this.f1156L;
                } else {
                    i13 = iMin;
                }
                if (z2) {
                    iMin = Math.min(i12, i13);
                }
                iMax = i7;
            } else {
                if (z2) {
                    i8 = this.f1155K;
                } else {
                    i8 = 0;
                }
                int i212 = i8 - iArr[0];
                iMax = Math.max(0, i212) + i7;
                iArr[0] = Math.max(0, -i212);
                if (zM698s) {
                    t5a t5aVar11 = (t5a) this.f1170b.getLayoutParams();
                    int measuredWidth6 = this.f1170b.getMeasuredWidth() + iMax;
                    int measuredHeight5 = this.f1170b.getMeasuredHeight() + paddingTop;
                    this.f1170b.layout(iMax, paddingTop, measuredWidth6, measuredHeight5);
                    i9 = measuredWidth6 + this.f1156L;
                    paddingTop = measuredHeight5 + ((ViewGroup.MarginLayoutParams) t5aVar11).bottomMargin;
                } else {
                    i9 = iMax;
                }
                if (zM698s2) {
                    int i35 = paddingTop + ((ViewGroup.MarginLayoutParams) ((t5a) this.f1172c.getLayoutParams())).topMargin;
                    int measuredWidth7 = this.f1172c.getMeasuredWidth() + iMax;
                    this.f1172c.layout(iMax, i35, measuredWidth7, this.f1172c.getMeasuredHeight() + i35);
                    i10 = measuredWidth7 + this.f1156L;
                } else {
                    i10 = iMax;
                }
                if (z2) {
                    iMax = Math.max(i9, i10);
                }
            }
        } else {
            if (zM698s) {
                c3048gr = this.f1170b;
            } else {
                c3048gr = this.f1172c;
            }
            if (zM698s2) {
                c3048gr2 = this.f1172c;
            } else {
                c3048gr2 = this.f1170b;
            }
            t5aVar = (t5a) c3048gr.getLayoutParams();
            t5aVar2 = (t5a) c3048gr2.getLayoutParams();
            i5 = measuredHeight;
            if (zM698s) {
            }
            i6 = this.f1162R & 112;
            i7 = iMax;
            if (i6 == 48) {
                paddingTop = getPaddingTop() + ((ViewGroup.MarginLayoutParams) t5aVar).topMargin + this.f1157M;
            } else if (i6 != 80) {
                iMax2 = (((height - paddingTop2) - paddingBottom) - i5) / 2;
                i14 = ((ViewGroup.MarginLayoutParams) t5aVar).topMargin + this.f1157M;
                if (iMax2 < i14) {
                    iMax2 = i14;
                } else {
                    i15 = (((height - paddingBottom) - i5) - iMax2) - paddingTop2;
                    i16 = ((ViewGroup.MarginLayoutParams) t5aVar).bottomMargin;
                    i17 = this.f1158N;
                    if (i15 < i16 + i17) {
                        iMax2 = Math.max(0, iMax2 - ((((ViewGroup.MarginLayoutParams) t5aVar2).bottomMargin + i17) - i15));
                    }
                }
                paddingTop = paddingTop2 + iMax2;
            } else {
                paddingTop = (((height - paddingBottom) - ((ViewGroup.MarginLayoutParams) t5aVar2).bottomMargin) - this.f1158N) - i5;
            }
            if (z3) {
                if (z2) {
                    i11 = this.f1155K;
                } else {
                    i11 = 0;
                }
                int i213 = i11 - iArr[1];
                iMin -= Math.max(0, i213);
                iArr[1] = Math.max(0, -i213);
                if (zM698s) {
                    t5a t5aVar12 = (t5a) this.f1170b.getLayoutParams();
                    int measuredWidth8 = iMin - this.f1170b.getMeasuredWidth();
                    int measuredHeight6 = this.f1170b.getMeasuredHeight() + paddingTop;
                    this.f1170b.layout(measuredWidth8, paddingTop, iMin, measuredHeight6);
                    i12 = measuredWidth8 - this.f1156L;
                    paddingTop = measuredHeight6 + ((ViewGroup.MarginLayoutParams) t5aVar12).bottomMargin;
                } else {
                    i12 = iMin;
                }
                if (zM698s2) {
                    int i214 = paddingTop + ((ViewGroup.MarginLayoutParams) ((t5a) this.f1172c.getLayoutParams())).topMargin;
                    this.f1172c.layout(iMin - this.f1172c.getMeasuredWidth(), i214, iMin, this.f1172c.getMeasuredHeight() + i214);
                    i13 = iMin - this.f1156L;
                } else {
                    i13 = iMin;
                }
                if (z2) {
                    iMin = Math.min(i12, i13);
                }
                iMax = i7;
            } else {
                if (z2) {
                    i8 = this.f1155K;
                } else {
                    i8 = 0;
                }
                int i215 = i8 - iArr[0];
                iMax = Math.max(0, i215) + i7;
                iArr[0] = Math.max(0, -i215);
                if (zM698s) {
                    t5a t5aVar13 = (t5a) this.f1170b.getLayoutParams();
                    int measuredWidth9 = this.f1170b.getMeasuredWidth() + iMax;
                    int measuredHeight7 = this.f1170b.getMeasuredHeight() + paddingTop;
                    this.f1170b.layout(iMax, paddingTop, measuredWidth9, measuredHeight7);
                    i9 = measuredWidth9 + this.f1156L;
                    paddingTop = measuredHeight7 + ((ViewGroup.MarginLayoutParams) t5aVar13).bottomMargin;
                } else {
                    i9 = iMax;
                }
                if (zM698s2) {
                    int i36 = paddingTop + ((ViewGroup.MarginLayoutParams) ((t5a) this.f1172c.getLayoutParams())).topMargin;
                    int measuredWidth10 = this.f1172c.getMeasuredWidth() + iMax;
                    this.f1172c.layout(iMax, i36, measuredWidth10, this.f1172c.getMeasuredHeight() + i36);
                    i10 = measuredWidth10 + this.f1156L;
                } else {
                    i10 = iMax;
                }
                if (z2) {
                    iMax = Math.max(i9, i10);
                }
            }
        }
        arrayList = this.f1171b0;
        m684a(3, arrayList);
        size = arrayList.size();
        iM694o2 = iMax;
        while (i18 < size) {
            iM694o2 = m694o((View) arrayList.get(i18), iM694o2, iMin2, iArr);
        }
        m684a(5, arrayList);
        size2 = arrayList.size();
        while (i19 < size2) {
            iMin = m695p((View) arrayList.get(i19), iMin, iMin2, iArr);
        }
        m684a(1, arrayList);
        int i37 = iArr[0];
        i20 = iArr[1];
        size3 = arrayList.size();
        i21 = i37;
        i22 = 0;
        measuredWidth = 0;
        while (i22 < size3) {
            View view3 = (View) arrayList.get(i22);
            t5a t5aVar14 = (t5a) view3.getLayoutParams();
            int i38 = i20;
            int i39 = ((ViewGroup.MarginLayoutParams) t5aVar14).leftMargin - i21;
            int i310 = ((ViewGroup.MarginLayoutParams) t5aVar14).rightMargin - i38;
            int iMax7 = Math.max(0, i39);
            int iMax8 = Math.max(0, i310);
            int iMax9 = Math.max(0, -i39);
            int iMax10 = Math.max(0, -i310);
            measuredWidth += view3.getMeasuredWidth() + iMax7 + iMax8;
            i22++;
            i21 = iMax9;
            i20 = iMax10;
        }
        i24 = ((((width - paddingLeft) - paddingRight) / 2) + paddingLeft) - (measuredWidth / 2);
        i25 = measuredWidth + i24;
        if (i24 >= iM694o2) {
            if (i25 > iMin) {
                iM694o2 = i24 - (i25 - iMin);
            } else {
                iM694o2 = i24;
            }
        }
        size4 = arrayList.size();
        while (i23 < size4) {
            iM694o2 = m694o((View) arrayList.get(i23), iM694o2, iMin2, iArr);
        }
        arrayList.clear();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        char c;
        Object[] objArr;
        int iM682k;
        int iMax;
        int iCombineMeasuredStates;
        int iM682k2;
        int iM683l;
        int iCombineMeasuredStates2;
        int iMax2;
        int i3 = 0;
        if (getLayoutDirection() == 1) {
            objArr = true;
            c = 0;
        } else {
            c = 1;
            objArr = false;
        }
        if (m698s(this.f1174d)) {
            m697r(this.f1174d, i, 0, i2, this.f1154J);
            iM682k = m682k(this.f1174d) + this.f1174d.getMeasuredWidth();
            iMax = Math.max(0, m683l(this.f1174d) + this.f1174d.getMeasuredHeight());
            iCombineMeasuredStates = View.combineMeasuredStates(0, this.f1174d.getMeasuredState());
        } else {
            iM682k = 0;
            iMax = 0;
            iCombineMeasuredStates = 0;
        }
        if (m698s(this.f1182h)) {
            m697r(this.f1182h, i, 0, i2, this.f1154J);
            iM682k = m682k(this.f1182h) + this.f1182h.getMeasuredWidth();
            iMax = Math.max(iMax, m683l(this.f1182h) + this.f1182h.getMeasuredHeight());
            iCombineMeasuredStates = View.combineMeasuredStates(iCombineMeasuredStates, this.f1182h.getMeasuredState());
        }
        int currentContentInsetStart = getCurrentContentInsetStart();
        int iMax3 = Math.max(currentContentInsetStart, iM682k);
        int iMax4 = Math.max(0, currentContentInsetStart - iM682k);
        Object[] objArr2 = objArr;
        int[] iArr = this.f1175d0;
        iArr[objArr2 == true ? 1 : 0] = iMax4;
        if (m698s(this.f1168a)) {
            m697r(this.f1168a, i, iMax3, i2, this.f1154J);
            iM682k2 = m682k(this.f1168a) + this.f1168a.getMeasuredWidth();
            iMax = Math.max(iMax, m683l(this.f1168a) + this.f1168a.getMeasuredHeight());
            iCombineMeasuredStates = View.combineMeasuredStates(iCombineMeasuredStates, this.f1168a.getMeasuredState());
        } else {
            iM682k2 = 0;
        }
        int currentContentInsetEnd = getCurrentContentInsetEnd();
        int iMax5 = iMax3 + Math.max(currentContentInsetEnd, iM682k2);
        iArr[c] = Math.max(0, currentContentInsetEnd - iM682k2);
        if (m698s(this.f1184i)) {
            iMax5 += m696q(this.f1184i, i, iMax5, i2, 0, iArr);
            iMax = Math.max(iMax, m683l(this.f1184i) + this.f1184i.getMeasuredHeight());
            iCombineMeasuredStates = View.combineMeasuredStates(iCombineMeasuredStates, this.f1184i.getMeasuredState());
        }
        if (m698s(this.f1176e)) {
            iMax5 += m696q(this.f1176e, i, iMax5, i2, 0, iArr);
            iMax = Math.max(iMax, m683l(this.f1176e) + this.f1176e.getMeasuredHeight());
            iCombineMeasuredStates = View.combineMeasuredStates(iCombineMeasuredStates, this.f1176e.getMeasuredState());
        }
        int childCount = getChildCount();
        for (int i4 = 0; i4 < childCount; i4++) {
            View childAt = getChildAt(i4);
            if (((t5a) childAt.getLayoutParams()).f61890b == 0 && m698s(childAt)) {
                iMax5 += m696q(childAt, i, iMax5, i2, 0, iArr);
                int iMax6 = Math.max(iMax, m683l(childAt) + childAt.getMeasuredHeight());
                iCombineMeasuredStates = View.combineMeasuredStates(iCombineMeasuredStates, childAt.getMeasuredState());
                iMax = iMax6;
            } else {
                iMax5 = iMax5;
            }
        }
        int i5 = iMax5;
        int i6 = this.f1157M + this.f1158N;
        int i7 = this.f1155K + this.f1156L;
        if (m698s(this.f1170b)) {
            m696q(this.f1170b, i, i5 + i7, i2, i6, iArr);
            int iM682k3 = m682k(this.f1170b) + this.f1170b.getMeasuredWidth();
            iM683l = m683l(this.f1170b) + this.f1170b.getMeasuredHeight();
            iCombineMeasuredStates2 = View.combineMeasuredStates(iCombineMeasuredStates, this.f1170b.getMeasuredState());
            iMax2 = iM682k3;
        } else {
            iM683l = 0;
            iCombineMeasuredStates2 = iCombineMeasuredStates;
            iMax2 = 0;
        }
        if (m698s(this.f1172c)) {
            iMax2 = Math.max(iMax2, m696q(this.f1172c, i, i5 + i7, i2, i6 + iM683l, iArr));
            iM683l += m683l(this.f1172c) + this.f1172c.getMeasuredHeight();
            iCombineMeasuredStates2 = View.combineMeasuredStates(iCombineMeasuredStates2, this.f1172c.getMeasuredState());
        }
        int iMax7 = Math.max(iMax, iM683l);
        int paddingRight = getPaddingRight() + getPaddingLeft() + i5 + iMax2;
        int paddingBottom = getPaddingBottom() + getPaddingTop() + iMax7;
        int iResolveSizeAndState = View.resolveSizeAndState(Math.max(paddingRight, getSuggestedMinimumWidth()), i, (-16777216) & iCombineMeasuredStates2);
        int iResolveSizeAndState2 = View.resolveSizeAndState(Math.max(paddingBottom, getSuggestedMinimumHeight()), i2, iCombineMeasuredStates2 << 16);
        if (!this.f1189k0) {
            i3 = iResolveSizeAndState2;
            break;
        }
        int childCount2 = getChildCount();
        for (int i8 = 0; i8 < childCount2; i8++) {
            View childAt2 = getChildAt(i8);
            if (m698s(childAt2) && childAt2.getMeasuredWidth() > 0 && childAt2.getMeasuredHeight() > 0) {
                i3 = iResolveSizeAndState2;
                break;
            }
        }
        setMeasuredDimension(iResolveSizeAndState, i3);
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        MenuItem menuItemFindItem;
        if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.f5563a);
        ActionMenuView actionMenuView = this.f1168a;
        hw5 hw5Var = actionMenuView != null ? actionMenuView.f1108K : null;
        int i = savedState.f1195c;
        if (i != 0 && this.f1187j0 != null && hw5Var != null && (menuItemFindItem = hw5Var.findItem(i)) != null) {
            menuItemFindItem.expandActionView();
        }
        if (savedState.f1196d) {
            RunnableC3795yg runnableC3795yg = this.f1194o0;
            removeCallbacks(runnableC3795yg);
            post(runnableC3795yg);
        }
    }

    @Override // android.view.View
    public final void onRtlPropertiesChanged(int i) {
        super.onRtlPropertiesChanged(i);
        m687d();
        xj8 xj8Var = this.f1159O;
        boolean z = i == 1;
        if (z == xj8Var.f68300g) {
            return;
        }
        xj8Var.f68300g = z;
        if (!xj8Var.f68301h) {
            xj8Var.f68294a = xj8Var.f68298e;
            xj8Var.f68295b = xj8Var.f68299f;
            return;
        }
        if (z) {
            int i2 = xj8Var.f68297d;
            if (i2 == Integer.MIN_VALUE) {
                i2 = xj8Var.f68298e;
            }
            xj8Var.f68294a = i2;
            int i3 = xj8Var.f68296c;
            if (i3 == Integer.MIN_VALUE) {
                i3 = xj8Var.f68299f;
            }
            xj8Var.f68295b = i3;
            return;
        }
        int i4 = xj8Var.f68296c;
        if (i4 == Integer.MIN_VALUE) {
            i4 = xj8Var.f68298e;
        }
        xj8Var.f68294a = i4;
        int i5 = xj8Var.f68297d;
        if (i5 == Integer.MIN_VALUE) {
            i5 = xj8Var.f68299f;
        }
        xj8Var.f68295b = i5;
    }

    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        C0035b c0035b;
        mw5 mw5Var;
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        s5a s5aVar = this.f1187j0;
        if (s5aVar != null && (mw5Var = s5aVar.f60391b) != null) {
            savedState.f1195c = mw5Var.f51942a;
        }
        ActionMenuView actionMenuView = this.f1168a;
        savedState.f1196d = (actionMenuView == null || (c0035b = actionMenuView.f1112O) == null || !c0035b.m711k()) ? false : true;
        return savedState;
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            this.f1167W = false;
        }
        if (!this.f1167W) {
            boolean zOnTouchEvent = super.onTouchEvent(motionEvent);
            if (actionMasked == 0 && !zOnTouchEvent) {
                this.f1167W = true;
            }
        }
        if (actionMasked != 1 && actionMasked != 3) {
            return true;
        }
        this.f1167W = false;
        return true;
    }

    /* JADX INFO: renamed from: p */
    public final int m695p(View view, int i, int i2, int[] iArr) {
        t5a t5aVar = (t5a) view.getLayoutParams();
        int i3 = ((ViewGroup.MarginLayoutParams) t5aVar).rightMargin - iArr[1];
        int iMax = i - Math.max(0, i3);
        iArr[1] = Math.max(0, -i3);
        int iM691j = m691j(view, i2);
        int measuredWidth = view.getMeasuredWidth();
        view.layout(iMax - measuredWidth, iM691j, iMax, view.getMeasuredHeight() + iM691j);
        return iMax - (measuredWidth + ((ViewGroup.MarginLayoutParams) t5aVar).leftMargin);
    }

    /* JADX INFO: renamed from: q */
    public final int m696q(View view, int i, int i2, int i3, int i4, int[] iArr) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        int i5 = marginLayoutParams.leftMargin - iArr[0];
        int i6 = marginLayoutParams.rightMargin - iArr[1];
        int iMax = Math.max(0, i6) + Math.max(0, i5);
        iArr[0] = Math.max(0, -i5);
        iArr[1] = Math.max(0, -i6);
        view.measure(ViewGroup.getChildMeasureSpec(i, getPaddingRight() + getPaddingLeft() + iMax + i2, marginLayoutParams.width), ViewGroup.getChildMeasureSpec(i3, getPaddingBottom() + getPaddingTop() + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin + i4, marginLayoutParams.height));
        return view.getMeasuredWidth() + iMax;
    }

    /* JADX INFO: renamed from: r */
    public final void m697r(View view, int i, int i2, int i3, int i4) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        int childMeasureSpec = ViewGroup.getChildMeasureSpec(i, getPaddingRight() + getPaddingLeft() + marginLayoutParams.leftMargin + marginLayoutParams.rightMargin + i2, marginLayoutParams.width);
        int childMeasureSpec2 = ViewGroup.getChildMeasureSpec(i3, getPaddingBottom() + getPaddingTop() + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin, marginLayoutParams.height);
        int mode = View.MeasureSpec.getMode(childMeasureSpec2);
        if (mode != 1073741824 && i4 >= 0) {
            if (mode != 0) {
                i4 = Math.min(View.MeasureSpec.getSize(childMeasureSpec2), i4);
            }
            childMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(i4, 1073741824);
        }
        view.measure(childMeasureSpec, childMeasureSpec2);
    }

    /* JADX INFO: renamed from: s */
    public final boolean m698s(View view) {
        return (view == null || view.getParent() != this || view.getVisibility() == 8) ? false : true;
    }

    public void setBackInvokedCallbackEnabled(boolean z) {
        if (this.f1193n0 != z) {
            this.f1193n0 = z;
            m699t();
        }
    }

    public void setCollapseContentDescription(CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence)) {
            m686c();
        }
        C3010fq c3010fq = this.f1182h;
        if (c3010fq != null) {
            c3010fq.setContentDescription(charSequence);
        }
    }

    public void setCollapseIcon(Drawable drawable) {
        if (drawable != null) {
            m686c();
            this.f1182h.setImageDrawable(drawable);
        } else {
            C3010fq c3010fq = this.f1182h;
            if (c3010fq != null) {
                c3010fq.setImageDrawable(this.f1178f);
            }
        }
    }

    public void setCollapsible(boolean z) {
        this.f1189k0 = z;
        requestLayout();
    }

    public void setContentInsetEndWithActions(int i) {
        if (i < 0) {
            i = Integer.MIN_VALUE;
        }
        if (i != this.f1161Q) {
            this.f1161Q = i;
            if (getNavigationIcon() != null) {
                requestLayout();
            }
        }
    }

    public void setContentInsetStartWithNavigation(int i) {
        if (i < 0) {
            i = Integer.MIN_VALUE;
        }
        if (i != this.f1160P) {
            this.f1160P = i;
            if (getNavigationIcon() != null) {
                requestLayout();
            }
        }
    }

    public void setLogo(Drawable drawable) {
        AppCompatImageView appCompatImageView = this.f1176e;
        if (drawable != null) {
            if (appCompatImageView == null) {
                this.f1176e = new AppCompatImageView(getContext());
            }
            if (!m693n(this.f1176e)) {
                m685b(this.f1176e, true);
            }
        } else if (appCompatImageView != null && m693n(appCompatImageView)) {
            removeView(this.f1176e);
            this.f1173c0.remove(this.f1176e);
        }
        AppCompatImageView appCompatImageView2 = this.f1176e;
        if (appCompatImageView2 != null) {
            appCompatImageView2.setImageDrawable(drawable);
        }
    }

    public void setLogoDescription(CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence) && this.f1176e == null) {
            this.f1176e = new AppCompatImageView(getContext());
        }
        AppCompatImageView appCompatImageView = this.f1176e;
        if (appCompatImageView != null) {
            appCompatImageView.setContentDescription(charSequence);
        }
    }

    public void setNavigationContentDescription(CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence)) {
            m690g();
        }
        C3010fq c3010fq = this.f1174d;
        if (c3010fq != null) {
            c3010fq.setContentDescription(charSequence);
            a6a.m135a(this.f1174d, charSequence);
        }
    }

    public void setNavigationIcon(Drawable drawable) {
        if (drawable != null) {
            m690g();
            if (!m693n(this.f1174d)) {
                m685b(this.f1174d, true);
            }
        } else {
            C3010fq c3010fq = this.f1174d;
            if (c3010fq != null && m693n(c3010fq)) {
                removeView(this.f1174d);
                this.f1173c0.remove(this.f1174d);
            }
        }
        C3010fq c3010fq2 = this.f1174d;
        if (c3010fq2 != null) {
            c3010fq2.setImageDrawable(drawable);
        }
    }

    public void setNavigationOnClickListener(View.OnClickListener onClickListener) {
        m690g();
        this.f1174d.setOnClickListener(onClickListener);
    }

    public void setOnMenuItemClickListener(u5a u5aVar) {
    }

    public void setOverflowIcon(Drawable drawable) {
        m688e();
        this.f1168a.setOverflowIcon(drawable);
    }

    public void setPopupTheme(int i) {
        if (this.f1188k != i) {
            this.f1188k = i;
            if (i == 0) {
                this.f1186j = getContext();
            } else {
                this.f1186j = new ContextThemeWrapper(getContext(), i);
            }
        }
    }

    public void setSubtitle(CharSequence charSequence) {
        boolean zIsEmpty = TextUtils.isEmpty(charSequence);
        C3048gr c3048gr = this.f1172c;
        if (!zIsEmpty) {
            if (c3048gr == null) {
                Context context = getContext();
                C3048gr c3048gr2 = new C3048gr(context, null);
                this.f1172c = c3048gr2;
                c3048gr2.setSingleLine();
                this.f1172c.setEllipsize(TextUtils.TruncateAt.END);
                int i = this.f1152H;
                if (i != 0) {
                    this.f1172c.setTextAppearance(context, i);
                }
                ColorStateList colorStateList = this.f1166V;
                if (colorStateList != null) {
                    this.f1172c.setTextColor(colorStateList);
                }
            }
            if (!m693n(this.f1172c)) {
                m685b(this.f1172c, true);
            }
        } else if (c3048gr != null && m693n(c3048gr)) {
            removeView(this.f1172c);
            this.f1173c0.remove(this.f1172c);
        }
        C3048gr c3048gr3 = this.f1172c;
        if (c3048gr3 != null) {
            c3048gr3.setText(charSequence);
        }
        this.f1164T = charSequence;
    }

    public void setSubtitleTextColor(ColorStateList colorStateList) {
        this.f1166V = colorStateList;
        C3048gr c3048gr = this.f1172c;
        if (c3048gr != null) {
            c3048gr.setTextColor(colorStateList);
        }
    }

    public void setTitle(CharSequence charSequence) {
        boolean zIsEmpty = TextUtils.isEmpty(charSequence);
        C3048gr c3048gr = this.f1170b;
        if (!zIsEmpty) {
            if (c3048gr == null) {
                Context context = getContext();
                C3048gr c3048gr2 = new C3048gr(context, null);
                this.f1170b = c3048gr2;
                c3048gr2.setSingleLine();
                this.f1170b.setEllipsize(TextUtils.TruncateAt.END);
                int i = this.f1190l;
                if (i != 0) {
                    this.f1170b.setTextAppearance(context, i);
                }
                ColorStateList colorStateList = this.f1165U;
                if (colorStateList != null) {
                    this.f1170b.setTextColor(colorStateList);
                }
            }
            if (!m693n(this.f1170b)) {
                m685b(this.f1170b, true);
            }
        } else if (c3048gr != null && m693n(c3048gr)) {
            removeView(this.f1170b);
            this.f1173c0.remove(this.f1170b);
        }
        C3048gr c3048gr3 = this.f1170b;
        if (c3048gr3 != null) {
            c3048gr3.setText(charSequence);
        }
        this.f1163S = charSequence;
    }

    public void setTitleMarginBottom(int i) {
        this.f1158N = i;
        requestLayout();
    }

    public void setTitleMarginEnd(int i) {
        this.f1156L = i;
        requestLayout();
    }

    public void setTitleMarginStart(int i) {
        this.f1155K = i;
        requestLayout();
    }

    public void setTitleMarginTop(int i) {
        this.f1157M = i;
        requestLayout();
    }

    public void setTitleTextColor(ColorStateList colorStateList) {
        this.f1165U = colorStateList;
        C3048gr c3048gr = this.f1170b;
        if (c3048gr != null) {
            c3048gr.setTextColor(colorStateList);
        }
    }

    /* JADX INFO: renamed from: t */
    public final void m699t() {
        OnBackInvokedDispatcher onBackInvokedDispatcher;
        if (Build.VERSION.SDK_INT >= 33) {
            OnBackInvokedDispatcher onBackInvokedDispatcherM20412a = r5a.m20412a(this);
            s5a s5aVar = this.f1187j0;
            boolean z = (s5aVar == null || s5aVar.f60391b == null || onBackInvokedDispatcherM20412a == null || !isAttachedToWindow() || !this.f1193n0) ? false : true;
            if (z && this.f1192m0 == null) {
                if (this.f1191l0 == null) {
                    this.f1191l0 = r5a.m20413b(new mt6(this, 14));
                }
                r5a.m20414c(onBackInvokedDispatcherM20412a, this.f1191l0);
                this.f1192m0 = onBackInvokedDispatcherM20412a;
                return;
            }
            if (z || (onBackInvokedDispatcher = this.f1192m0) == null) {
                return;
            }
            r5a.m20415d(onBackInvokedDispatcher, this.f1191l0);
            this.f1192m0 = null;
        }
    }

    public void setSubtitleTextColor(int i) {
        setSubtitleTextColor(ColorStateList.valueOf(i));
    }

    public void setTitleTextColor(int i) {
        setTitleTextColor(ColorStateList.valueOf(i));
    }

    public void setCollapseContentDescription(int i) {
        setCollapseContentDescription(i != 0 ? getContext().getText(i) : null);
    }

    /* JADX INFO: loaded from: classes2.dex */
    public static class SavedState extends AbsSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new C0037d();

        /* JADX INFO: renamed from: c */
        public int f1195c;

        /* JADX INFO: renamed from: d */
        public boolean f1196d;

        public SavedState(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.f1195c = parcel.readInt();
            this.f1196d = parcel.readInt() != 0;
        }

        @Override // androidx.customview.view.AbsSavedState, android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeInt(this.f1195c);
            parcel.writeInt(this.f1196d ? 1 : 0);
        }

        public SavedState(Parcelable parcelable) {
            super(parcelable);
        }
    }

    public void setCollapseIcon(int i) {
        setCollapseIcon(bna.m3932U(getContext(), i));
    }

    public void setNavigationContentDescription(int i) {
        setNavigationContentDescription(i != 0 ? getContext().getText(i) : null);
    }

    public void setLogoDescription(int i) {
        setLogoDescription(getContext().getText(i));
    }

    @Override // android.view.ViewGroup
    public final /* bridge */ /* synthetic */ ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return m681i(layoutParams);
    }

    public void setNavigationIcon(int i) {
        setNavigationIcon(bna.m3932U(getContext(), i));
    }

    public void setLogo(int i) {
        setLogo(bna.m3932U(getContext(), i));
    }

    public void setSubtitle(int i) {
        setSubtitle(getContext().getText(i));
    }

    public void setTitle(int i) {
        setTitle(getContext().getText(i));
    }

    public Toolbar(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R$attr.toolbarStyle);
    }

    public Toolbar(Context context) {
        this(context, null);
    }
}
