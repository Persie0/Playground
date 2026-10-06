package android.support.v7.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.ContextThemeWrapper;
import android.view.Gravity;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;
import android.window.OnBackInvokedCallback;
import android.window.OnBackInvokedDispatcher;
import androidx.wear.ambient.AmbientDelegate;
import androidx.wear.ambient.AmbientMode;
import com.google.android.apps.camera.bottombar.C0100R;
import java.util.ArrayList;
import java.util.List;
import p000.C0144dw;
import p000.C0193fr;
import p000.C0206gd;
import p000.C0225gw;
import p000.C0227gy;
import p000.C0259ic;
import p000.C0263ig;
import p000.C0273iq;
import p000.C0752js;
import p000.C0835mu;
import p000.C0854nm;
import p000.C0855nn;
import p000.C0856no;
import p000.C0857np;
import p000.C0860ns;
import p000.C0861nt;
import p000.C0864nw;
import p000.C1058va;
import p000.InterfaceC0223gu;
import p000.InterfaceC0238hi;
import p000.InterfaceC0758jy;
import p000.RunnableC0852nk;
import p000.aeo;
import p000.aep;
import p000.afb;
import p000.afc;
import p000.afe;
import p000.afn;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public class Toolbar extends ViewGroup implements aep {

    /* JADX INFO: renamed from: A */
    public boolean f1205A;

    /* JADX INFO: renamed from: B */
    public final C1058va f1206B;

    /* JADX INFO: renamed from: C */
    public AmbientMode.AmbientController f1207C;

    /* JADX INFO: renamed from: D */
    private ImageView f1208D;

    /* JADX INFO: renamed from: E */
    private int f1209E;

    /* JADX INFO: renamed from: F */
    private int f1210F;

    /* JADX INFO: renamed from: G */
    private int f1211G;

    /* JADX INFO: renamed from: H */
    private int f1212H;

    /* JADX INFO: renamed from: I */
    private ColorStateList f1213I;

    /* JADX INFO: renamed from: J */
    private ColorStateList f1214J;

    /* JADX INFO: renamed from: K */
    private boolean f1215K;

    /* JADX INFO: renamed from: L */
    private boolean f1216L;

    /* JADX INFO: renamed from: M */
    private final ArrayList f1217M;

    /* JADX INFO: renamed from: N */
    private final int[] f1218N;

    /* JADX INFO: renamed from: O */
    private C0860ns f1219O;

    /* JADX INFO: renamed from: P */
    private OnBackInvokedCallback f1220P;

    /* JADX INFO: renamed from: Q */
    private OnBackInvokedDispatcher f1221Q;

    /* JADX INFO: renamed from: R */
    private final Runnable f1222R;

    /* JADX INFO: renamed from: S */
    private final AmbientMode.AmbientController f1223S;

    /* JADX INFO: renamed from: a */
    public ActionMenuView f1224a;

    /* JADX INFO: renamed from: b */
    public TextView f1225b;

    /* JADX INFO: renamed from: c */
    public TextView f1226c;

    /* JADX INFO: renamed from: d */
    public ImageButton f1227d;

    /* JADX INFO: renamed from: e */
    public Drawable f1228e;

    /* JADX INFO: renamed from: f */
    public CharSequence f1229f;

    /* JADX INFO: renamed from: g */
    public ImageButton f1230g;

    /* JADX INFO: renamed from: h */
    public View f1231h;

    /* JADX INFO: renamed from: i */
    public Context f1232i;

    /* JADX INFO: renamed from: j */
    public int f1233j;

    /* JADX INFO: renamed from: k */
    public int f1234k;

    /* JADX INFO: renamed from: l */
    public int f1235l;

    /* JADX INFO: renamed from: m */
    public int f1236m;

    /* JADX INFO: renamed from: n */
    public int f1237n;

    /* JADX INFO: renamed from: o */
    public int f1238o;

    /* JADX INFO: renamed from: p */
    public int f1239p;

    /* JADX INFO: renamed from: q */
    public int f1240q;

    /* JADX INFO: renamed from: r */
    public C0835mu f1241r;

    /* JADX INFO: renamed from: s */
    public CharSequence f1242s;

    /* JADX INFO: renamed from: t */
    public CharSequence f1243t;

    /* JADX INFO: renamed from: u */
    public final ArrayList f1244u;

    /* JADX INFO: renamed from: v */
    public ArrayList f1245v;

    /* JADX INFO: renamed from: w */
    public C0259ic f1246w;

    /* JADX INFO: renamed from: x */
    public C0855nn f1247x;

    /* JADX INFO: renamed from: y */
    public InterfaceC0238hi f1248y;

    /* JADX INFO: renamed from: z */
    public InterfaceC0223gu f1249z;

    public Toolbar(Context context) {
        this(context, null);
    }

    /* JADX INFO: renamed from: A */
    private final int m1318A(int i) {
        int iM442c = afc.m442c(this);
        int absoluteGravity = Gravity.getAbsoluteGravity(i, iM442c) & 7;
        switch (absoluteGravity) {
            case 1:
            case 3:
            case 5:
                return absoluteGravity;
            case 2:
            case 4:
            default:
                return iM442c == 1 ? 5 : 3;
        }
    }

    /* JADX INFO: renamed from: B */
    private final int m1319B(View view, int i) {
        C0856no c0856no = (C0856no) view.getLayoutParams();
        int measuredHeight = view.getMeasuredHeight();
        int i2 = i > 0 ? (measuredHeight - i) / 2 : 0;
        int i3 = c0856no.f12698a & 112;
        switch (i3) {
            case 16:
            case 48:
            case 80:
                break;
            default:
                i3 = this.f1212H & 112;
                break;
        }
        switch (i3) {
            case 48:
                return getPaddingTop() - i2;
            case 80:
                return (((getHeight() - getPaddingBottom()) - measuredHeight) - c0856no.bottomMargin) - i2;
            default:
                int paddingTop = getPaddingTop();
                int paddingBottom = getPaddingBottom();
                int height = getHeight();
                int iMax = (((height - paddingTop) - paddingBottom) - measuredHeight) / 2;
                if (iMax < c0856no.topMargin) {
                    iMax = c0856no.topMargin;
                } else {
                    int i4 = (((height - paddingBottom) - measuredHeight) - iMax) - paddingTop;
                    if (i4 < c0856no.bottomMargin) {
                        iMax = Math.max(0, iMax - (c0856no.bottomMargin - i4));
                    }
                }
                return paddingTop + iMax;
        }
    }

    /* JADX INFO: renamed from: C */
    private final int m1320C(View view, int i, int[] iArr, int i2) {
        C0856no c0856no = (C0856no) view.getLayoutParams();
        int i3 = c0856no.leftMargin - iArr[0];
        int iMax = i + Math.max(0, i3);
        iArr[0] = Math.max(0, -i3);
        int iM1319B = m1319B(view, i2);
        int measuredWidth = view.getMeasuredWidth();
        view.layout(iMax, iM1319B, iMax + measuredWidth, view.getMeasuredHeight() + iM1319B);
        return iMax + measuredWidth + c0856no.rightMargin;
    }

    /* JADX INFO: renamed from: D */
    private final int m1321D(View view, int i, int[] iArr, int i2) {
        C0856no c0856no = (C0856no) view.getLayoutParams();
        int i3 = c0856no.rightMargin - iArr[1];
        int iMax = i - Math.max(0, i3);
        iArr[1] = Math.max(0, -i3);
        int iM1319B = m1319B(view, i2);
        int measuredWidth = view.getMeasuredWidth();
        view.layout(iMax - measuredWidth, iM1319B, iMax, view.getMeasuredHeight() + iM1319B);
        return iMax - (measuredWidth + c0856no.leftMargin);
    }

    /* JADX INFO: renamed from: E */
    private final int m1322E(View view, int i, int i2, int i3, int i4, int[] iArr) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        int i5 = marginLayoutParams.leftMargin - iArr[0];
        int i6 = marginLayoutParams.rightMargin - iArr[1];
        int iMax = Math.max(0, i5) + Math.max(0, i6);
        iArr[0] = Math.max(0, -i5);
        iArr[1] = Math.max(0, -i6);
        view.measure(getChildMeasureSpec(i, getPaddingLeft() + getPaddingRight() + iMax + i2, marginLayoutParams.width), getChildMeasureSpec(i3, getPaddingTop() + getPaddingBottom() + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin + i4, marginLayoutParams.height));
        return view.getMeasuredWidth() + iMax;
    }

    /* JADX INFO: renamed from: F */
    private final void m1323F(List list, int i) {
        int iM442c = afc.m442c(this);
        int childCount = getChildCount();
        int absoluteGravity = Gravity.getAbsoluteGravity(i, afc.m442c(this));
        list.clear();
        if (iM442c == 1) {
            for (int i2 = childCount - 1; i2 >= 0; i2--) {
                View childAt = getChildAt(i2);
                C0856no c0856no = (C0856no) childAt.getLayoutParams();
                if (c0856no.f43969b == 0 && m1327J(childAt) && m1318A(c0856no.f12698a) == absoluteGravity) {
                    list.add(childAt);
                }
            }
            return;
        }
        for (int i3 = 0; i3 < childCount; i3++) {
            View childAt2 = getChildAt(i3);
            C0856no c0856no2 = (C0856no) childAt2.getLayoutParams();
            if (c0856no2.f43969b == 0 && m1327J(childAt2) && m1318A(c0856no2.f12698a) == absoluteGravity) {
                list.add(childAt2);
            }
        }
    }

    /* JADX INFO: renamed from: G */
    private final void m1324G(View view, boolean z) {
        C0856no c0856noM1332z;
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams == null) {
            c0856noM1332z = m1331y();
        } else {
            c0856noM1332z = !checkLayoutParams(layoutParams) ? m1332z(layoutParams) : (C0856no) layoutParams;
        }
        c0856noM1332z.f43969b = 1;
        if (!z || this.f1231h == null) {
            addView(view, c0856noM1332z);
        } else {
            view.setLayoutParams(c0856noM1332z);
            this.f1244u.add(view);
        }
    }

    /* JADX INFO: renamed from: H */
    private final void m1325H() {
        if (this.f1208D == null) {
            this.f1208D = new AppCompatImageView(getContext());
        }
    }

    /* JADX INFO: renamed from: I */
    private final boolean m1326I(View view) {
        return view.getParent() == this || this.f1244u.contains(view);
    }

    /* JADX INFO: renamed from: J */
    private final boolean m1327J(View view) {
        return (view == null || view.getParent() != this || view.getVisibility() == 8) ? false : true;
    }

    /* JADX INFO: renamed from: K */
    private static final int m1328K(View view) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        return aeo.m357c(marginLayoutParams) + aeo.m356b(marginLayoutParams);
    }

    /* JADX INFO: renamed from: L */
    private static final int m1329L(View view) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        return marginLayoutParams.topMargin + marginLayoutParams.bottomMargin;
    }

    /* JADX INFO: renamed from: M */
    private final void m1330M(View view, int i, int i2, int i3, int i4) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        int childMeasureSpec = getChildMeasureSpec(i, getPaddingLeft() + getPaddingRight() + marginLayoutParams.leftMargin + marginLayoutParams.rightMargin + i2, marginLayoutParams.width);
        int childMeasureSpec2 = getChildMeasureSpec(i3, getPaddingTop() + getPaddingBottom() + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin, marginLayoutParams.height);
        int mode = View.MeasureSpec.getMode(childMeasureSpec2);
        if (mode != 1073741824 && i4 >= 0) {
            if (mode != 0) {
                i4 = Math.min(View.MeasureSpec.getSize(childMeasureSpec2), i4);
            }
            childMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(i4, 1073741824);
        }
        view.measure(childMeasureSpec, childMeasureSpec2);
    }

    /* JADX INFO: renamed from: y */
    public static final C0856no m1331y() {
        return new C0856no();
    }

    /* JADX INFO: renamed from: z */
    protected static final C0856no m1332z(ViewGroup.LayoutParams layoutParams) {
        if (layoutParams instanceof C0856no) {
            return new C0856no((C0856no) layoutParams);
        }
        if (layoutParams instanceof C0144dw) {
            return new C0856no((C0144dw) layoutParams);
        }
        return layoutParams instanceof ViewGroup.MarginLayoutParams ? new C0856no((ViewGroup.MarginLayoutParams) layoutParams) : new C0856no(layoutParams);
    }

    /* JADX INFO: renamed from: a */
    public final int m1333a() {
        C0835mu c0835mu = this.f1241r;
        if (c0835mu != null) {
            return c0835mu.f41618g ? c0835mu.f41612a : c0835mu.f41613b;
        }
        return 0;
    }

    /* JADX INFO: renamed from: b */
    public final int m1334b() {
        C0835mu c0835mu = this.f1241r;
        if (c0835mu != null) {
            return c0835mu.f41618g ? c0835mu.f41613b : c0835mu.f41612a;
        }
        return 0;
    }

    /* JADX INFO: renamed from: c */
    public final int m1335c() {
        C0225gw c0225gw;
        ActionMenuView actionMenuView = this.f1224a;
        return (actionMenuView == null || (c0225gw = actionMenuView.f987a) == null || !c0225gw.hasVisibleItems()) ? m1333a() : Math.max(m1333a(), Math.max(this.f1211G, 0));
    }

    @Override // android.view.ViewGroup
    protected final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return super.checkLayoutParams(layoutParams) && (layoutParams instanceof C0856no);
    }

    /* JADX INFO: renamed from: d */
    public final int m1336d() {
        return m1337e() != null ? Math.max(m1334b(), Math.max(this.f1210F, 0)) : m1334b();
    }

    /* JADX INFO: renamed from: e */
    public final Drawable m1337e() {
        ImageButton imageButton = this.f1227d;
        if (imageButton != null) {
            return imageButton.getDrawable();
        }
        return null;
    }

    /* JADX INFO: renamed from: f */
    public final InterfaceC0758jy m1338f() {
        if (this.f1219O == null) {
            this.f1219O = new C0860ns(this, true);
        }
        return this.f1219O;
    }

    /* JADX INFO: renamed from: g */
    public final Menu m1339g() {
        m1345m();
        ActionMenuView actionMenuView = this.f1224a;
        if (actionMenuView.f987a == null) {
            Menu menuM1074g = actionMenuView.m1074g();
            if (this.f1247x == null) {
                this.f1247x = new C0855nn(this);
            }
            this.f1224a.f989c.m11040o();
            ((C0225gw) menuM1074g).m9828h(this.f1247x, this.f1232i);
            m1353u();
        }
        return this.f1224a.m1074g();
    }

    @Override // android.view.ViewGroup
    protected final /* bridge */ /* synthetic */ ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return m1331y();
    }

    @Override // android.view.ViewGroup
    public final /* bridge */ /* synthetic */ ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new C0856no(getContext(), attributeSet);
    }

    /* JADX INFO: renamed from: h */
    public final MenuInflater m1340h() {
        return new C0206gd(getContext());
    }

    /* JADX INFO: renamed from: i */
    public final CharSequence m1341i() {
        ImageButton imageButton = this.f1227d;
        if (imageButton != null) {
            return imageButton.getContentDescription();
        }
        return null;
    }

    /* JADX INFO: renamed from: j */
    public final ArrayList m1342j() {
        ArrayList arrayList = new ArrayList();
        Menu menuM1339g = m1339g();
        for (int i = 0; i < menuM1339g.size(); i++) {
            arrayList.add(menuM1339g.getItem(i));
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: k */
    public final void m1343k() {
        C0855nn c0855nn = this.f1247x;
        C0227gy c0227gy = c0855nn == null ? null : c0855nn.f43922b;
        if (c0227gy != null) {
            c0227gy.collapseActionView();
        }
    }

    /* JADX INFO: renamed from: l */
    public final void m1344l() {
        if (this.f1241r == null) {
            this.f1241r = new C0835mu();
        }
    }

    /* JADX INFO: renamed from: m */
    public final void m1345m() {
        if (this.f1224a == null) {
            ActionMenuView actionMenuView = new ActionMenuView(getContext());
            this.f1224a = actionMenuView;
            actionMenuView.m1077j(this.f1233j);
            ActionMenuView actionMenuView2 = this.f1224a;
            actionMenuView2.f991e = this.f1223S;
            actionMenuView2.m1076i(this.f1248y, new C0263ig(this, 2));
            C0856no c0856noM1331y = m1331y();
            c0856noM1331y.f12698a = (this.f1236m & 112) | 8388613;
            this.f1224a.setLayoutParams(c0856noM1331y);
            m1324G(this.f1224a, false);
        }
    }

    /* JADX INFO: renamed from: n */
    public final void m1346n() {
        if (this.f1227d == null) {
            this.f1227d = new C0273iq(getContext(), null, C0100R.attr.toolbarNavigationButtonStyle);
            C0856no c0856noM1331y = m1331y();
            c0856noM1331y.f12698a = (this.f1236m & 112) | 8388611;
            this.f1227d.setLayoutParams(c0856noM1331y);
        }
    }

    /* JADX INFO: renamed from: o */
    public final void m1347o(Drawable drawable) {
        if (drawable != null) {
            m1325H();
            if (!m1326I(this.f1208D)) {
                m1324G(this.f1208D, true);
            }
        } else {
            ImageView imageView = this.f1208D;
            if (imageView != null && m1326I(imageView)) {
                removeView(this.f1208D);
                this.f1244u.remove(this.f1208D);
            }
        }
        ImageView imageView2 = this.f1208D;
        if (imageView2 != null) {
            imageView2.setImageDrawable(drawable);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    protected final void onAttachedToWindow() {
        super.onAttachedToWindow();
        m1353u();
    }

    @Override // android.view.ViewGroup, android.view.View
    protected final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        removeCallbacks(this.f1222R);
        m1353u();
    }

    /* JADX WARN: Code duplicated, block: B:11:0x001d  */
    @Override // android.view.View
    public final boolean onHoverEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        int i = 9;
        if (actionMasked == 9) {
            this.f1216L = false;
            actionMasked = 9;
        }
        if (this.f1216L) {
            i = actionMasked;
        } else {
            boolean zOnHoverEvent = super.onHoverEvent(motionEvent);
            if (actionMasked != 9) {
                i = actionMasked;
            } else if (!zOnHoverEvent) {
                this.f1216L = true;
            }
        }
        if (i == 10 || i == 3) {
            this.f1216L = false;
        }
        return true;
    }

    /* JADX WARN: Code duplicated, block: B:100:0x0240  */
    /* JADX WARN: Code duplicated, block: B:101:0x0243  */
    /* JADX WARN: Code duplicated, block: B:104:0x0258  */
    /* JADX WARN: Code duplicated, block: B:105:0x027b  */
    /* JADX WARN: Code duplicated, block: B:107:0x027e  */
    /* JADX WARN: Code duplicated, block: B:108:0x02a2  */
    /* JADX WARN: Code duplicated, block: B:110:0x02a5  */
    /* JADX WARN: Code duplicated, block: B:114:0x02ba A[LOOP:0: B:113:0x02b8->B:114:0x02ba, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:117:0x02dc A[LOOP:1: B:116:0x02da->B:117:0x02dc, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:120:0x0300 A[LOOP:2: B:119:0x02fe->B:120:0x0300, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:124:0x0341 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:125:0x0343  */
    /* JADX WARN: Code duplicated, block: B:126:0x0347  */
    /* JADX WARN: Code duplicated, block: B:129:0x0350 A[LOOP:3: B:128:0x034e->B:129:0x0350, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:18:0x005f A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:19:0x0061  */
    /* JADX WARN: Code duplicated, block: B:20:0x0068  */
    /* JADX WARN: Code duplicated, block: B:23:0x0076 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:24:0x0078  */
    /* JADX WARN: Code duplicated, block: B:25:0x007f  */
    /* JADX WARN: Code duplicated, block: B:28:0x008b  */
    /* JADX WARN: Code duplicated, block: B:29:0x0090  */
    /* JADX WARN: Code duplicated, block: B:32:0x009a  */
    /* JADX WARN: Code duplicated, block: B:33:0x009f  */
    /* JADX WARN: Code duplicated, block: B:36:0x00ca A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:37:0x00cc  */
    /* JADX WARN: Code duplicated, block: B:38:0x00d3  */
    /* JADX WARN: Code duplicated, block: B:41:0x00e1 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:42:0x00e3  */
    /* JADX WARN: Code duplicated, block: B:43:0x00ea  */
    /* JADX WARN: Code duplicated, block: B:46:0x00fe  */
    /* JADX WARN: Code duplicated, block: B:47:0x0113  */
    /* JADX WARN: Code duplicated, block: B:49:0x0116  */
    /* JADX WARN: Code duplicated, block: B:50:0x012e  */
    /* JADX WARN: Code duplicated, block: B:55:0x013b A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:56:0x013d  */
    /* JADX WARN: Code duplicated, block: B:57:0x0140  */
    /* JADX WARN: Code duplicated, block: B:59:0x0144  */
    /* JADX WARN: Code duplicated, block: B:60:0x0147  */
    /* JADX WARN: Code duplicated, block: B:63:0x0157  */
    /* JADX WARN: Code duplicated, block: B:67:0x0162 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:68:0x0164  */
    /* JADX WARN: Code duplicated, block: B:71:0x016e  */
    /* JADX WARN: Code duplicated, block: B:74:0x0178  */
    /* JADX WARN: Code duplicated, block: B:76:0x0189  */
    /* JADX WARN: Code duplicated, block: B:77:0x0190  */
    /* JADX WARN: Code duplicated, block: B:78:0x019d  */
    /* JADX WARN: Code duplicated, block: B:79:0x01ac  */
    /* JADX WARN: Code duplicated, block: B:81:0x01b7  */
    /* JADX WARN: Code duplicated, block: B:85:0x01c9 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:86:0x01cb  */
    /* JADX WARN: Code duplicated, block: B:87:0x01ce  */
    /* JADX WARN: Code duplicated, block: B:90:0x01e3  */
    /* JADX WARN: Code duplicated, block: B:91:0x0207  */
    /* JADX WARN: Code duplicated, block: B:93:0x020a  */
    /* JADX WARN: Code duplicated, block: B:94:0x0230  */
    /* JADX WARN: Code duplicated, block: B:96:0x0233  */
    /* JADX WARN: Code duplicated, block: B:99:0x023e A[DONT_INVERT] */
    @Override // android.view.ViewGroup, android.view.View
    protected final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int iM1320C;
        int iM1321D;
        int iM1336d;
        int iM1335c;
        int iMax;
        int iMin;
        boolean zM1327J;
        boolean zM1327J2;
        int measuredHeight;
        TextView textView;
        TextView textView2;
        C0856no c0856no;
        C0856no c0856no2;
        boolean z2;
        int i5;
        int paddingTop;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        int iMax2;
        int i12;
        int size;
        int i13;
        int i14;
        int size2;
        int i15;
        ArrayList arrayList;
        int i16;
        int i17;
        int size3;
        int i18;
        int measuredWidth;
        int i19;
        int i20;
        int i21;
        int size4;
        int iM442c = afc.m442c(this);
        int width = getWidth();
        int height = getHeight();
        int paddingLeft = getPaddingLeft();
        int paddingRight = getPaddingRight();
        int i22 = width - paddingRight;
        int paddingTop2 = getPaddingTop();
        int paddingBottom = getPaddingBottom();
        int[] iArr = this.f1218N;
        iArr[1] = 0;
        iArr[0] = 0;
        int iM421b = afb.m421b(this);
        int iMin2 = iM421b >= 0 ? Math.min(iM421b, i4 - i2) : 0;
        boolean z3 = iM442c == 1;
        if (m1327J(this.f1227d)) {
            if (z3) {
                iM1321D = m1321D(this.f1227d, i22, iArr, iMin2);
                iM1320C = paddingLeft;
            } else {
                iM1320C = m1320C(this.f1227d, paddingLeft, iArr, iMin2);
            }
            if (m1327J(this.f1230g)) {
                if (z3) {
                    iM1321D = m1321D(this.f1230g, iM1321D, iArr, iMin2);
                } else {
                    iM1320C = m1320C(this.f1230g, iM1320C, iArr, iMin2);
                }
            }
            if (m1327J(this.f1224a)) {
                if (z3) {
                    iM1320C = m1320C(this.f1224a, iM1320C, iArr, iMin2);
                } else {
                    iM1321D = m1321D(this.f1224a, iM1321D, iArr, iMin2);
                }
            }
            if (afc.m442c(this) == 1) {
                iM1336d = m1335c();
            } else {
                iM1336d = m1336d();
            }
            if (afc.m442c(this) == 1) {
                iM1335c = m1336d();
            } else {
                iM1335c = m1335c();
            }
            iArr[0] = Math.max(0, iM1336d - iM1320C);
            iArr[1] = Math.max(0, iM1335c - (i22 - iM1321D));
            iMax = Math.max(iM1320C, iM1336d);
            iMin = Math.min(iM1321D, i22 - iM1335c);
            if (m1327J(this.f1231h)) {
                if (z3) {
                    iMin = m1321D(this.f1231h, iMin, iArr, iMin2);
                } else {
                    iMax = m1320C(this.f1231h, iMax, iArr, iMin2);
                }
            }
            if (m1327J(this.f1208D)) {
                if (z3) {
                    iMin = m1321D(this.f1208D, iMin, iArr, iMin2);
                } else {
                    iMax = m1320C(this.f1208D, iMax, iArr, iMin2);
                }
            }
            zM1327J = m1327J(this.f1225b);
            zM1327J2 = m1327J(this.f1226c);
            if (zM1327J) {
                C0856no c0856no3 = (C0856no) this.f1225b.getLayoutParams();
                measuredHeight = c0856no3.bottomMargin + c0856no3.topMargin + this.f1225b.getMeasuredHeight();
            } else {
                measuredHeight = 0;
            }
            if (zM1327J2) {
                C0856no c0856no4 = (C0856no) this.f1226c.getLayoutParams();
                measuredHeight += c0856no4.topMargin + this.f1226c.getMeasuredHeight() + c0856no4.bottomMargin;
            }
            if (!zM1327J || zM1327J2) {
                if (zM1327J) {
                    textView = this.f1225b;
                } else {
                    textView = this.f1226c;
                }
                if (zM1327J2) {
                    textView2 = this.f1226c;
                } else {
                    textView2 = this.f1225b;
                }
                c0856no = (C0856no) textView.getLayoutParams();
                c0856no2 = (C0856no) textView2.getLayoutParams();
                if (!zM1327J && this.f1225b.getMeasuredWidth() > 0) {
                    z2 = true;
                } else if (zM1327J2 || this.f1226c.getMeasuredWidth() <= 0) {
                    z2 = false;
                } else {
                    z2 = true;
                }
                i5 = paddingLeft;
                switch (this.f1212H & 112) {
                    case 48:
                        paddingTop = getPaddingTop() + c0856no.topMargin + this.f1239p;
                        break;
                    case 80:
                        paddingTop = (((height - paddingBottom) - c0856no2.bottomMargin) - this.f1240q) - measuredHeight;
                        break;
                    default:
                        iMax2 = (((height - paddingTop2) - paddingBottom) - measuredHeight) / 2;
                        if (iMax2 < c0856no.topMargin + this.f1239p) {
                            iMax2 = c0856no.topMargin + this.f1239p;
                        } else {
                            i12 = (((height - paddingBottom) - measuredHeight) - iMax2) - paddingTop2;
                            if (i12 < c0856no.bottomMargin + this.f1240q) {
                                iMax2 = Math.max(0, iMax2 - ((c0856no2.bottomMargin + this.f1240q) - i12));
                            }
                        }
                        paddingTop = paddingTop2 + iMax2;
                        break;
                }
                if (z3) {
                    if (z2) {
                        i9 = this.f1237n;
                    } else {
                        i9 = 0;
                    }
                    int i23 = i9 - iArr[1];
                    iMin -= Math.max(0, i23);
                    iArr[1] = Math.max(0, -i23);
                    if (zM1327J) {
                        C0856no c0856no5 = (C0856no) this.f1225b.getLayoutParams();
                        int measuredWidth2 = iMin - this.f1225b.getMeasuredWidth();
                        int measuredHeight2 = this.f1225b.getMeasuredHeight() + paddingTop;
                        this.f1225b.layout(measuredWidth2, paddingTop, iMin, measuredHeight2);
                        i10 = measuredWidth2 - this.f1238o;
                        paddingTop = measuredHeight2 + c0856no5.bottomMargin;
                    } else {
                        i10 = iMin;
                    }
                    if (zM1327J2) {
                        C0856no c0856no6 = (C0856no) this.f1226c.getLayoutParams();
                        int i24 = paddingTop + c0856no6.topMargin;
                        this.f1226c.layout(iMin - this.f1226c.getMeasuredWidth(), i24, iMin, this.f1226c.getMeasuredHeight() + i24);
                        i11 = iMin - this.f1238o;
                        int i25 = c0856no6.bottomMargin;
                    } else {
                        i11 = iMin;
                    }
                    if (z2) {
                        iMin = Math.min(i10, i11);
                    }
                    iMax = iMax;
                } else {
                    if (z2) {
                        i6 = this.f1237n;
                    } else {
                        i6 = 0;
                    }
                    int i26 = i6 - iArr[0];
                    iMax += Math.max(0, i26);
                    iArr[0] = Math.max(0, -i26);
                    if (zM1327J) {
                        C0856no c0856no7 = (C0856no) this.f1225b.getLayoutParams();
                        int measuredWidth3 = this.f1225b.getMeasuredWidth() + iMax;
                        int measuredHeight3 = this.f1225b.getMeasuredHeight() + paddingTop;
                        this.f1225b.layout(iMax, paddingTop, measuredWidth3, measuredHeight3);
                        i7 = measuredWidth3 + this.f1238o;
                        paddingTop = measuredHeight3 + c0856no7.bottomMargin;
                    } else {
                        i7 = iMax;
                    }
                    if (zM1327J2) {
                        C0856no c0856no8 = (C0856no) this.f1226c.getLayoutParams();
                        int i27 = paddingTop + c0856no8.topMargin;
                        int measuredWidth4 = this.f1226c.getMeasuredWidth() + iMax;
                        this.f1226c.layout(iMax, i27, measuredWidth4, this.f1226c.getMeasuredHeight() + i27);
                        i8 = measuredWidth4 + this.f1238o;
                        int i28 = c0856no8.bottomMargin;
                    } else {
                        i8 = iMax;
                    }
                    if (z2) {
                        iMax = Math.max(i7, i8);
                    }
                }
            } else {
                i5 = paddingLeft;
                iMin2 = iMin2;
            }
            m1323F(this.f1217M, 3);
            size = this.f1217M.size();
            for (i13 = 0; i13 < size; i13++) {
                iMax = m1320C((View) this.f1217M.get(i13), iMax, iArr, iMin2);
            }
            i14 = iMin2;
            m1323F(this.f1217M, 5);
            size2 = this.f1217M.size();
            for (i15 = 0; i15 < size2; i15++) {
                iMin = m1321D((View) this.f1217M.get(i15), iMin, iArr, i14);
            }
            m1323F(this.f1217M, 1);
            arrayList = this.f1217M;
            i16 = iArr[0];
            i17 = iArr[1];
            size3 = arrayList.size();
            i18 = 0;
            measuredWidth = 0;
            while (i18 < size3) {
                View view = (View) arrayList.get(i18);
                C0856no c0856no9 = (C0856no) view.getLayoutParams();
                int i29 = c0856no9.leftMargin - i16;
                int i30 = c0856no9.rightMargin - i17;
                int iMax3 = Math.max(0, i29);
                int iMax4 = Math.max(0, i30);
                int iMax5 = Math.max(0, -i29);
                int iMax6 = Math.max(0, -i30);
                measuredWidth += iMax3 + view.getMeasuredWidth() + iMax4;
                i18++;
                i17 = iMax6;
                i16 = iMax5;
            }
            i20 = (i5 + (((width - i5) - paddingRight) / 2)) - (measuredWidth / 2);
            i21 = measuredWidth + i20;
            if (i20 >= iMax) {
                if (i21 > iMin) {
                    iMax = i20 - (i21 - iMin);
                } else {
                    iMax = i20;
                }
            }
            size4 = this.f1217M.size();
            for (i19 = 0; i19 < size4; i19++) {
                iMax = m1320C((View) this.f1217M.get(i19), iMax, iArr, i14);
            }
            this.f1217M.clear();
        }
        iM1320C = paddingLeft;
        iM1321D = i22;
        if (m1327J(this.f1230g)) {
            if (z3) {
                iM1321D = m1321D(this.f1230g, iM1321D, iArr, iMin2);
            } else {
                iM1320C = m1320C(this.f1230g, iM1320C, iArr, iMin2);
            }
        }
        if (m1327J(this.f1224a)) {
            if (z3) {
                iM1320C = m1320C(this.f1224a, iM1320C, iArr, iMin2);
            } else {
                iM1321D = m1321D(this.f1224a, iM1321D, iArr, iMin2);
            }
        }
        if (afc.m442c(this) == 1) {
            iM1336d = m1335c();
        } else {
            iM1336d = m1336d();
        }
        if (afc.m442c(this) == 1) {
            iM1335c = m1336d();
        } else {
            iM1335c = m1335c();
        }
        iArr[0] = Math.max(0, iM1336d - iM1320C);
        iArr[1] = Math.max(0, iM1335c - (i22 - iM1321D));
        iMax = Math.max(iM1320C, iM1336d);
        iMin = Math.min(iM1321D, i22 - iM1335c);
        if (m1327J(this.f1231h)) {
            if (z3) {
                iMin = m1321D(this.f1231h, iMin, iArr, iMin2);
            } else {
                iMax = m1320C(this.f1231h, iMax, iArr, iMin2);
            }
        }
        if (m1327J(this.f1208D)) {
            if (z3) {
                iMin = m1321D(this.f1208D, iMin, iArr, iMin2);
            } else {
                iMax = m1320C(this.f1208D, iMax, iArr, iMin2);
            }
        }
        zM1327J = m1327J(this.f1225b);
        zM1327J2 = m1327J(this.f1226c);
        if (zM1327J) {
            C0856no c0856no10 = (C0856no) this.f1225b.getLayoutParams();
            measuredHeight = c0856no10.bottomMargin + c0856no10.topMargin + this.f1225b.getMeasuredHeight();
        } else {
            measuredHeight = 0;
        }
        if (zM1327J2) {
            C0856no c0856no11 = (C0856no) this.f1226c.getLayoutParams();
            measuredHeight += c0856no11.topMargin + this.f1226c.getMeasuredHeight() + c0856no11.bottomMargin;
        }
        if (zM1327J) {
            if (zM1327J) {
                textView = this.f1225b;
            } else {
                textView = this.f1226c;
            }
            if (zM1327J2) {
                textView2 = this.f1226c;
            } else {
                textView2 = this.f1225b;
            }
            c0856no = (C0856no) textView.getLayoutParams();
            c0856no2 = (C0856no) textView2.getLayoutParams();
            if (!zM1327J) {
                if (zM1327J2) {
                    z2 = false;
                } else {
                    z2 = false;
                }
            } else if (zM1327J2) {
                z2 = false;
            } else {
                z2 = false;
            }
            i5 = paddingLeft;
            switch (this.f1212H & 112) {
                case 48:
                    paddingTop = getPaddingTop() + c0856no.topMargin + this.f1239p;
                    break;
                case 80:
                    paddingTop = (((height - paddingBottom) - c0856no2.bottomMargin) - this.f1240q) - measuredHeight;
                    break;
                default:
                    iMax2 = (((height - paddingTop2) - paddingBottom) - measuredHeight) / 2;
                    if (iMax2 < c0856no.topMargin + this.f1239p) {
                        iMax2 = c0856no.topMargin + this.f1239p;
                    } else {
                        i12 = (((height - paddingBottom) - measuredHeight) - iMax2) - paddingTop2;
                        if (i12 < c0856no.bottomMargin + this.f1240q) {
                            iMax2 = Math.max(0, iMax2 - ((c0856no2.bottomMargin + this.f1240q) - i12));
                        }
                    }
                    paddingTop = paddingTop2 + iMax2;
                    break;
            }
            if (z3) {
                if (z2) {
                    i9 = this.f1237n;
                } else {
                    i9 = 0;
                }
                int i210 = i9 - iArr[1];
                iMin -= Math.max(0, i210);
                iArr[1] = Math.max(0, -i210);
                if (zM1327J) {
                    C0856no c0856no12 = (C0856no) this.f1225b.getLayoutParams();
                    int measuredWidth5 = iMin - this.f1225b.getMeasuredWidth();
                    int measuredHeight4 = this.f1225b.getMeasuredHeight() + paddingTop;
                    this.f1225b.layout(measuredWidth5, paddingTop, iMin, measuredHeight4);
                    i10 = measuredWidth5 - this.f1238o;
                    paddingTop = measuredHeight4 + c0856no12.bottomMargin;
                } else {
                    i10 = iMin;
                }
                if (zM1327J2) {
                    C0856no c0856no13 = (C0856no) this.f1226c.getLayoutParams();
                    int i211 = paddingTop + c0856no13.topMargin;
                    this.f1226c.layout(iMin - this.f1226c.getMeasuredWidth(), i211, iMin, this.f1226c.getMeasuredHeight() + i211);
                    i11 = iMin - this.f1238o;
                    int i212 = c0856no13.bottomMargin;
                } else {
                    i11 = iMin;
                }
                if (z2) {
                    iMin = Math.min(i10, i11);
                }
                iMax = iMax;
            } else {
                if (z2) {
                    i6 = this.f1237n;
                } else {
                    i6 = 0;
                }
                int i213 = i6 - iArr[0];
                iMax += Math.max(0, i213);
                iArr[0] = Math.max(0, -i213);
                if (zM1327J) {
                    C0856no c0856no14 = (C0856no) this.f1225b.getLayoutParams();
                    int measuredWidth6 = this.f1225b.getMeasuredWidth() + iMax;
                    int measuredHeight5 = this.f1225b.getMeasuredHeight() + paddingTop;
                    this.f1225b.layout(iMax, paddingTop, measuredWidth6, measuredHeight5);
                    i7 = measuredWidth6 + this.f1238o;
                    paddingTop = measuredHeight5 + c0856no14.bottomMargin;
                } else {
                    i7 = iMax;
                }
                if (zM1327J2) {
                    C0856no c0856no15 = (C0856no) this.f1226c.getLayoutParams();
                    int i214 = paddingTop + c0856no15.topMargin;
                    int measuredWidth7 = this.f1226c.getMeasuredWidth() + iMax;
                    this.f1226c.layout(iMax, i214, measuredWidth7, this.f1226c.getMeasuredHeight() + i214);
                    i8 = measuredWidth7 + this.f1238o;
                    int i215 = c0856no15.bottomMargin;
                } else {
                    i8 = iMax;
                }
                if (z2) {
                    iMax = Math.max(i7, i8);
                }
            }
        } else {
            if (zM1327J) {
                textView = this.f1225b;
            } else {
                textView = this.f1226c;
            }
            if (zM1327J2) {
                textView2 = this.f1226c;
            } else {
                textView2 = this.f1225b;
            }
            c0856no = (C0856no) textView.getLayoutParams();
            c0856no2 = (C0856no) textView2.getLayoutParams();
            if (!zM1327J) {
                if (zM1327J2) {
                    z2 = false;
                } else {
                    z2 = false;
                }
            } else if (zM1327J2) {
                z2 = false;
            } else {
                z2 = false;
            }
            i5 = paddingLeft;
            switch (this.f1212H & 112) {
                case 48:
                    paddingTop = getPaddingTop() + c0856no.topMargin + this.f1239p;
                    break;
                case 80:
                    paddingTop = (((height - paddingBottom) - c0856no2.bottomMargin) - this.f1240q) - measuredHeight;
                    break;
                default:
                    iMax2 = (((height - paddingTop2) - paddingBottom) - measuredHeight) / 2;
                    if (iMax2 < c0856no.topMargin + this.f1239p) {
                        iMax2 = c0856no.topMargin + this.f1239p;
                    } else {
                        i12 = (((height - paddingBottom) - measuredHeight) - iMax2) - paddingTop2;
                        if (i12 < c0856no.bottomMargin + this.f1240q) {
                            iMax2 = Math.max(0, iMax2 - ((c0856no2.bottomMargin + this.f1240q) - i12));
                        }
                    }
                    paddingTop = paddingTop2 + iMax2;
                    break;
            }
            if (z3) {
                if (z2) {
                    i9 = this.f1237n;
                } else {
                    i9 = 0;
                }
                int i216 = i9 - iArr[1];
                iMin -= Math.max(0, i216);
                iArr[1] = Math.max(0, -i216);
                if (zM1327J) {
                    C0856no c0856no16 = (C0856no) this.f1225b.getLayoutParams();
                    int measuredWidth8 = iMin - this.f1225b.getMeasuredWidth();
                    int measuredHeight6 = this.f1225b.getMeasuredHeight() + paddingTop;
                    this.f1225b.layout(measuredWidth8, paddingTop, iMin, measuredHeight6);
                    i10 = measuredWidth8 - this.f1238o;
                    paddingTop = measuredHeight6 + c0856no16.bottomMargin;
                } else {
                    i10 = iMin;
                }
                if (zM1327J2) {
                    C0856no c0856no17 = (C0856no) this.f1226c.getLayoutParams();
                    int i217 = paddingTop + c0856no17.topMargin;
                    this.f1226c.layout(iMin - this.f1226c.getMeasuredWidth(), i217, iMin, this.f1226c.getMeasuredHeight() + i217);
                    i11 = iMin - this.f1238o;
                    int i218 = c0856no17.bottomMargin;
                } else {
                    i11 = iMin;
                }
                if (z2) {
                    iMin = Math.min(i10, i11);
                }
                iMax = iMax;
            } else {
                if (z2) {
                    i6 = this.f1237n;
                } else {
                    i6 = 0;
                }
                int i219 = i6 - iArr[0];
                iMax += Math.max(0, i219);
                iArr[0] = Math.max(0, -i219);
                if (zM1327J) {
                    C0856no c0856no18 = (C0856no) this.f1225b.getLayoutParams();
                    int measuredWidth9 = this.f1225b.getMeasuredWidth() + iMax;
                    int measuredHeight7 = this.f1225b.getMeasuredHeight() + paddingTop;
                    this.f1225b.layout(iMax, paddingTop, measuredWidth9, measuredHeight7);
                    i7 = measuredWidth9 + this.f1238o;
                    paddingTop = measuredHeight7 + c0856no18.bottomMargin;
                } else {
                    i7 = iMax;
                }
                if (zM1327J2) {
                    C0856no c0856no19 = (C0856no) this.f1226c.getLayoutParams();
                    int i2110 = paddingTop + c0856no19.topMargin;
                    int measuredWidth10 = this.f1226c.getMeasuredWidth() + iMax;
                    this.f1226c.layout(iMax, i2110, measuredWidth10, this.f1226c.getMeasuredHeight() + i2110);
                    i8 = measuredWidth10 + this.f1238o;
                    int i2111 = c0856no19.bottomMargin;
                } else {
                    i8 = iMax;
                }
                if (z2) {
                    iMax = Math.max(i7, i8);
                }
            }
        }
        m1323F(this.f1217M, 3);
        size = this.f1217M.size();
        while (i13 < size) {
            iMax = m1320C((View) this.f1217M.get(i13), iMax, iArr, iMin2);
        }
        i14 = iMin2;
        m1323F(this.f1217M, 5);
        size2 = this.f1217M.size();
        while (i15 < size2) {
            iMin = m1321D((View) this.f1217M.get(i15), iMin, iArr, i14);
        }
        m1323F(this.f1217M, 1);
        arrayList = this.f1217M;
        i16 = iArr[0];
        i17 = iArr[1];
        size3 = arrayList.size();
        i18 = 0;
        measuredWidth = 0;
        while (i18 < size3) {
            View view2 = (View) arrayList.get(i18);
            C0856no c0856no20 = (C0856no) view2.getLayoutParams();
            int i220 = c0856no20.leftMargin - i16;
            int i31 = c0856no20.rightMargin - i17;
            int iMax7 = Math.max(0, i220);
            int iMax8 = Math.max(0, i31);
            int iMax9 = Math.max(0, -i220);
            int iMax10 = Math.max(0, -i31);
            measuredWidth += iMax7 + view2.getMeasuredWidth() + iMax8;
            i18++;
            i17 = iMax10;
            i16 = iMax9;
        }
        i20 = (i5 + (((width - i5) - paddingRight) / 2)) - (measuredWidth / 2);
        i21 = measuredWidth + i20;
        if (i20 >= iMax) {
            if (i21 > iMin) {
                iMax = i20 - (i21 - iMin);
            } else {
                iMax = i20;
            }
        }
        size4 = this.f1217M.size();
        while (i19 < size4) {
            iMax = m1320C((View) this.f1217M.get(i19), iMax, iArr, i14);
        }
        this.f1217M.clear();
    }

    @Override // android.view.View
    protected final void onMeasure(int i, int i2) {
        int measuredWidth;
        int iMax;
        int iCombineMeasuredStates;
        int measuredWidth2;
        int iCombineMeasuredStates2;
        int measuredHeight;
        int[] iArr = this.f1218N;
        boolean zM17748a = C0864nw.m17748a(this);
        int i3 = !zM17748a ? 1 : 0;
        int iMax2 = 0;
        if (m1327J(this.f1227d)) {
            m1330M(this.f1227d, i, 0, i2, this.f1209E);
            measuredWidth = this.f1227d.getMeasuredWidth() + m1328K(this.f1227d);
            iMax = Math.max(0, this.f1227d.getMeasuredHeight() + m1329L(this.f1227d));
            iCombineMeasuredStates = View.combineMeasuredStates(0, this.f1227d.getMeasuredState());
        } else {
            measuredWidth = 0;
            iMax = 0;
            iCombineMeasuredStates = 0;
        }
        if (m1327J(this.f1230g)) {
            m1330M(this.f1230g, i, 0, i2, this.f1209E);
            measuredWidth = this.f1230g.getMeasuredWidth() + m1328K(this.f1230g);
            iMax = Math.max(iMax, this.f1230g.getMeasuredHeight() + m1329L(this.f1230g));
            iCombineMeasuredStates = View.combineMeasuredStates(iCombineMeasuredStates, this.f1230g.getMeasuredState());
        }
        int iM1336d = m1336d();
        int iMax3 = Math.max(iM1336d, measuredWidth);
        iArr[zM17748a ? 1 : 0] = Math.max(0, iM1336d - measuredWidth);
        if (m1327J(this.f1224a)) {
            m1330M(this.f1224a, i, iMax3, i2, this.f1209E);
            measuredWidth2 = this.f1224a.getMeasuredWidth() + m1328K(this.f1224a);
            iMax = Math.max(iMax, this.f1224a.getMeasuredHeight() + m1329L(this.f1224a));
            iCombineMeasuredStates = View.combineMeasuredStates(iCombineMeasuredStates, this.f1224a.getMeasuredState());
        } else {
            measuredWidth2 = 0;
        }
        int iM1335c = m1335c();
        int iMax4 = iMax3 + Math.max(iM1335c, measuredWidth2);
        iArr[i3] = Math.max(0, iM1335c - measuredWidth2);
        if (m1327J(this.f1231h)) {
            iMax4 += m1322E(this.f1231h, i, iMax4, i2, 0, iArr);
            iMax = Math.max(iMax, this.f1231h.getMeasuredHeight() + m1329L(this.f1231h));
            iCombineMeasuredStates = View.combineMeasuredStates(iCombineMeasuredStates, this.f1231h.getMeasuredState());
        }
        if (m1327J(this.f1208D)) {
            iMax4 += m1322E(this.f1208D, i, iMax4, i2, 0, iArr);
            iMax = Math.max(iMax, this.f1208D.getMeasuredHeight() + m1329L(this.f1208D));
            iCombineMeasuredStates = View.combineMeasuredStates(iCombineMeasuredStates, this.f1208D.getMeasuredState());
        }
        int childCount = getChildCount();
        for (int i4 = 0; i4 < childCount; i4++) {
            View childAt = getChildAt(i4);
            if (((C0856no) childAt.getLayoutParams()).f43969b == 0 && m1327J(childAt)) {
                iMax4 += m1322E(childAt, i, iMax4, i2, 0, iArr);
                iMax = Math.max(iMax, childAt.getMeasuredHeight() + m1329L(childAt));
                iCombineMeasuredStates = View.combineMeasuredStates(iCombineMeasuredStates, childAt.getMeasuredState());
            }
        }
        int i5 = this.f1239p + this.f1240q;
        int i6 = this.f1237n + this.f1238o;
        if (m1327J(this.f1225b)) {
            m1322E(this.f1225b, i, iMax4 + i6, i2, i5, iArr);
            iMax2 = this.f1225b.getMeasuredWidth() + m1328K(this.f1225b);
            int measuredHeight2 = this.f1225b.getMeasuredHeight() + m1329L(this.f1225b);
            iCombineMeasuredStates2 = View.combineMeasuredStates(iCombineMeasuredStates, this.f1225b.getMeasuredState());
            measuredHeight = measuredHeight2;
        } else {
            iCombineMeasuredStates2 = iCombineMeasuredStates;
            measuredHeight = 0;
        }
        if (m1327J(this.f1226c)) {
            iMax2 = Math.max(iMax2, m1322E(this.f1226c, i, iMax4 + i6, i2, measuredHeight + i5, iArr));
            measuredHeight += this.f1226c.getMeasuredHeight() + m1329L(this.f1226c);
            iCombineMeasuredStates2 = View.combineMeasuredStates(iCombineMeasuredStates2, this.f1226c.getMeasuredState());
        }
        int iMax5 = Math.max(iMax, measuredHeight);
        int paddingLeft = getPaddingLeft() + getPaddingRight();
        int i7 = iMax4 + iMax2 + paddingLeft;
        setMeasuredDimension(View.resolveSizeAndState(Math.max(i7, getSuggestedMinimumWidth()), i, (-16777216) & iCombineMeasuredStates2), View.resolveSizeAndState(Math.max(iMax5 + getPaddingTop() + getPaddingBottom(), getSuggestedMinimumHeight()), i2, iCombineMeasuredStates2 << 16));
    }

    @Override // android.view.View
    protected final void onRestoreInstanceState(Parcelable parcelable) {
        MenuItem menuItemFindItem;
        if (!(parcelable instanceof C0857np)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        C0857np c0857np = (C0857np) parcelable;
        super.onRestoreInstanceState(c0857np.f394d);
        ActionMenuView actionMenuView = this.f1224a;
        C0225gw c0225gw = actionMenuView != null ? actionMenuView.f987a : null;
        int i = c0857np.f44014a;
        if (i != 0 && this.f1247x != null && c0225gw != null && (menuItemFindItem = c0225gw.findItem(i)) != null) {
            menuItemFindItem.expandActionView();
        }
        if (c0857np.f44015b) {
            removeCallbacks(this.f1222R);
            post(this.f1222R);
        }
    }

    @Override // android.view.View
    public final void onRtlPropertiesChanged(int i) {
        super.onRtlPropertiesChanged(i);
        m1344l();
        C0835mu c0835mu = this.f1241r;
        boolean z = c0835mu.f41618g;
        boolean z2 = i == 1;
        if (z2 == z) {
            return;
        }
        c0835mu.f41618g = z2;
        if (!c0835mu.f41619h) {
            c0835mu.f41612a = c0835mu.f41616e;
            c0835mu.f41613b = c0835mu.f41617f;
            return;
        }
        if (z2) {
            int i2 = c0835mu.f41615d;
            if (i2 == Integer.MIN_VALUE) {
                i2 = c0835mu.f41616e;
            }
            c0835mu.f41612a = i2;
            int i3 = c0835mu.f41614c;
            if (i3 == Integer.MIN_VALUE) {
                i3 = c0835mu.f41617f;
            }
            c0835mu.f41613b = i3;
            return;
        }
        int i4 = c0835mu.f41614c;
        if (i4 == Integer.MIN_VALUE) {
            i4 = c0835mu.f41616e;
        }
        c0835mu.f41612a = i4;
        int i5 = c0835mu.f41615d;
        if (i5 == Integer.MIN_VALUE) {
            i5 = c0835mu.f41617f;
        }
        c0835mu.f41613b = i5;
    }

    @Override // android.view.View
    protected final Parcelable onSaveInstanceState() {
        C0227gy c0227gy;
        C0857np c0857np = new C0857np(super.onSaveInstanceState());
        C0855nn c0855nn = this.f1247x;
        if (c0855nn != null && (c0227gy = c0855nn.f43922b) != null) {
            c0857np.f44014a = c0227gy.f26787a;
        }
        c0857np.f44015b = m1355w();
        return c0857np;
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            this.f1215K = false;
            actionMasked = 0;
        }
        if (!this.f1215K) {
            boolean zOnTouchEvent = super.onTouchEvent(motionEvent);
            if (actionMasked == 0) {
                if (!zOnTouchEvent) {
                    this.f1215K = true;
                }
                actionMasked = 0;
            }
        }
        if (actionMasked == 1 || actionMasked == 3) {
            this.f1215K = false;
        }
        return true;
    }

    /* JADX INFO: renamed from: p */
    public final void m1348p(CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence)) {
            m1346n();
        }
        ImageButton imageButton = this.f1227d;
        if (imageButton != null) {
            imageButton.setContentDescription(charSequence);
            C0861nt.m17652a(this.f1227d, charSequence);
        }
    }

    /* JADX INFO: renamed from: q */
    public final void m1349q(Drawable drawable) {
        if (drawable != null) {
            m1346n();
            if (!m1326I(this.f1227d)) {
                m1324G(this.f1227d, true);
            }
        } else {
            ImageButton imageButton = this.f1227d;
            if (imageButton != null && m1326I(imageButton)) {
                removeView(this.f1227d);
                this.f1244u.remove(this.f1227d);
            }
        }
        ImageButton imageButton2 = this.f1227d;
        if (imageButton2 != null) {
            imageButton2.setImageDrawable(drawable);
        }
    }

    /* JADX INFO: renamed from: r */
    public final void m1350r(int i) {
        if (this.f1233j != i) {
            this.f1233j = i;
            if (i == 0) {
                this.f1232i = getContext();
            } else {
                this.f1232i = new ContextThemeWrapper(getContext(), i);
            }
        }
    }

    /* JADX INFO: renamed from: s */
    public final void m1351s(CharSequence charSequence) {
        if (TextUtils.isEmpty(charSequence)) {
            TextView textView = this.f1226c;
            if (textView != null && m1326I(textView)) {
                removeView(this.f1226c);
                this.f1244u.remove(this.f1226c);
            }
        } else {
            if (this.f1226c == null) {
                Context context = getContext();
                C0752js c0752js = new C0752js(context);
                this.f1226c = c0752js;
                c0752js.setSingleLine();
                this.f1226c.setEllipsize(TextUtils.TruncateAt.END);
                int i = this.f1235l;
                if (i != 0) {
                    this.f1226c.setTextAppearance(context, i);
                }
                ColorStateList colorStateList = this.f1214J;
                if (colorStateList != null) {
                    this.f1226c.setTextColor(colorStateList);
                }
            }
            if (!m1326I(this.f1226c)) {
                m1324G(this.f1226c, true);
            }
        }
        TextView textView2 = this.f1226c;
        if (textView2 != null) {
            textView2.setText(charSequence);
        }
        this.f1243t = charSequence;
    }

    /* JADX INFO: renamed from: t */
    public final void m1352t(CharSequence charSequence) {
        if (TextUtils.isEmpty(charSequence)) {
            TextView textView = this.f1225b;
            if (textView != null && m1326I(textView)) {
                removeView(this.f1225b);
                this.f1244u.remove(this.f1225b);
            }
        } else {
            if (this.f1225b == null) {
                Context context = getContext();
                C0752js c0752js = new C0752js(context);
                this.f1225b = c0752js;
                c0752js.setSingleLine();
                this.f1225b.setEllipsize(TextUtils.TruncateAt.END);
                int i = this.f1234k;
                if (i != 0) {
                    this.f1225b.setTextAppearance(context, i);
                }
                ColorStateList colorStateList = this.f1213I;
                if (colorStateList != null) {
                    this.f1225b.setTextColor(colorStateList);
                }
            }
            if (!m1326I(this.f1225b)) {
                m1324G(this.f1225b, true);
            }
        }
        TextView textView2 = this.f1225b;
        if (textView2 != null) {
            textView2.setText(charSequence);
        }
        this.f1242s = charSequence;
    }

    /* JADX INFO: renamed from: u */
    public final void m1353u() {
        OnBackInvokedDispatcher onBackInvokedDispatcherM17507b = C0854nm.m17507b(this);
        if (!m1354v() || onBackInvokedDispatcherM17507b == null || !afe.m461e(this) || !this.f1205A) {
            OnBackInvokedDispatcher onBackInvokedDispatcher = this.f1221Q;
            if (onBackInvokedDispatcher != null) {
                C0854nm.m17509d(onBackInvokedDispatcher, this.f1220P);
                this.f1221Q = null;
                return;
            }
            return;
        }
        if (this.f1221Q == null) {
            if (this.f1220P == null) {
                this.f1220P = C0854nm.m17506a(new RunnableC0852nk(this, 2));
            }
            C0854nm.m17508c(onBackInvokedDispatcherM17507b, this.f1220P);
            this.f1221Q = onBackInvokedDispatcherM17507b;
        }
    }

    /* JADX INFO: renamed from: v */
    public final boolean m1354v() {
        C0855nn c0855nn = this.f1247x;
        return (c0855nn == null || c0855nn.f43922b == null) ? false : true;
    }

    /* JADX INFO: renamed from: w */
    public final boolean m1355w() {
        ActionMenuView actionMenuView = this.f1224a;
        return actionMenuView != null && actionMenuView.m1080m();
    }

    /* JADX INFO: renamed from: x */
    public final boolean m1356x() {
        C0259ic c0259ic;
        ActionMenuView actionMenuView = this.f1224a;
        return (actionMenuView == null || (c0259ic = actionMenuView.f989c) == null || !c0259ic.m11038m()) ? false : true;
    }

    public Toolbar(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C0100R.attr.toolbarStyle);
    }

    @Override // android.view.ViewGroup
    protected final /* bridge */ /* synthetic */ ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return m1332z(layoutParams);
    }

    public Toolbar(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f1212H = 8388627;
        this.f1217M = new ArrayList();
        this.f1244u = new ArrayList();
        this.f1218N = new int[2];
        this.f1206B = new C1058va(new RunnableC0852nk(this, 0));
        this.f1245v = new ArrayList();
        this.f1223S = new AmbientMode.AmbientController(this);
        this.f1222R = new RunnableC0852nk(this, 3, (byte[]) null);
        AmbientDelegate ambientDelegateM1568D = AmbientDelegate.m1568D(getContext(), attributeSet, C0193fr.f23280x, i, 0);
        afn.m536c(this, context, C0193fr.f23280x, attributeSet, (TypedArray) ambientDelegateM1568D.f1686b, i, 0);
        this.f1234k = ambientDelegateM1568D.m1616s(28, 0);
        this.f1235l = ambientDelegateM1568D.m1616s(19, 0);
        this.f1212H = ambientDelegateM1568D.m1614q(0, this.f1212H);
        this.f1236m = ambientDelegateM1568D.m1614q(2, 48);
        int iM1611n = ambientDelegateM1568D.m1611n(22, 0);
        iM1611n = ambientDelegateM1568D.m1575A(27) ? ambientDelegateM1568D.m1611n(27, iM1611n) : iM1611n;
        this.f1240q = iM1611n;
        this.f1239p = iM1611n;
        this.f1238o = iM1611n;
        this.f1237n = iM1611n;
        int iM1611n2 = ambientDelegateM1568D.m1611n(25, -1);
        if (iM1611n2 >= 0) {
            this.f1237n = iM1611n2;
        }
        int iM1611n3 = ambientDelegateM1568D.m1611n(24, -1);
        if (iM1611n3 >= 0) {
            this.f1238o = iM1611n3;
        }
        int iM1611n4 = ambientDelegateM1568D.m1611n(26, -1);
        if (iM1611n4 >= 0) {
            this.f1239p = iM1611n4;
        }
        int iM1611n5 = ambientDelegateM1568D.m1611n(23, -1);
        if (iM1611n5 >= 0) {
            this.f1240q = iM1611n5;
        }
        this.f1209E = ambientDelegateM1568D.m1612o(13, -1);
        int iM1611n6 = ambientDelegateM1568D.m1611n(9, Integer.MIN_VALUE);
        int iM1611n7 = ambientDelegateM1568D.m1611n(5, Integer.MIN_VALUE);
        int iM1612o = ambientDelegateM1568D.m1612o(7, 0);
        int iM1612o2 = ambientDelegateM1568D.m1612o(8, 0);
        m1344l();
        C0835mu c0835mu = this.f1241r;
        c0835mu.f41619h = false;
        if (iM1612o != Integer.MIN_VALUE) {
            c0835mu.f41616e = iM1612o;
            c0835mu.f41612a = iM1612o;
        }
        if (iM1612o2 != Integer.MIN_VALUE) {
            c0835mu.f41617f = iM1612o2;
            c0835mu.f41613b = iM1612o2;
        }
        if (iM1611n6 != Integer.MIN_VALUE || iM1611n7 != Integer.MIN_VALUE) {
            c0835mu.m16938a(iM1611n6, iM1611n7);
        }
        this.f1210F = ambientDelegateM1568D.m1611n(10, Integer.MIN_VALUE);
        this.f1211G = ambientDelegateM1568D.m1611n(6, Integer.MIN_VALUE);
        this.f1228e = ambientDelegateM1568D.m1618u(4);
        this.f1229f = ambientDelegateM1568D.m1620w(3);
        CharSequence charSequenceM1620w = ambientDelegateM1568D.m1620w(21);
        if (!TextUtils.isEmpty(charSequenceM1620w)) {
            m1352t(charSequenceM1620w);
        }
        CharSequence charSequenceM1620w2 = ambientDelegateM1568D.m1620w(18);
        if (!TextUtils.isEmpty(charSequenceM1620w2)) {
            m1351s(charSequenceM1620w2);
        }
        this.f1232i = getContext();
        m1350r(ambientDelegateM1568D.m1616s(17, 0));
        Drawable drawableM1618u = ambientDelegateM1568D.m1618u(16);
        if (drawableM1618u != null) {
            m1349q(drawableM1618u);
        }
        CharSequence charSequenceM1620w3 = ambientDelegateM1568D.m1620w(15);
        if (!TextUtils.isEmpty(charSequenceM1620w3)) {
            m1348p(charSequenceM1620w3);
        }
        Drawable drawableM1618u2 = ambientDelegateM1568D.m1618u(11);
        if (drawableM1618u2 != null) {
            m1347o(drawableM1618u2);
        }
        CharSequence charSequenceM1620w4 = ambientDelegateM1568D.m1620w(12);
        if (!TextUtils.isEmpty(charSequenceM1620w4)) {
            if (!TextUtils.isEmpty(charSequenceM1620w4)) {
                m1325H();
            }
            ImageView imageView = this.f1208D;
            if (imageView != null) {
                imageView.setContentDescription(charSequenceM1620w4);
            }
        }
        if (ambientDelegateM1568D.m1575A(29)) {
            ColorStateList colorStateListM1617t = ambientDelegateM1568D.m1617t(29);
            this.f1213I = colorStateListM1617t;
            TextView textView = this.f1225b;
            if (textView != null) {
                textView.setTextColor(colorStateListM1617t);
            }
        }
        if (ambientDelegateM1568D.m1575A(20)) {
            ColorStateList colorStateListM1617t2 = ambientDelegateM1568D.m1617t(20);
            this.f1214J = colorStateListM1617t2;
            TextView textView2 = this.f1226c;
            if (textView2 != null) {
                textView2.setTextColor(colorStateListM1617t2);
            }
        }
        if (ambientDelegateM1568D.m1575A(14)) {
            m1340h().inflate(ambientDelegateM1568D.m1616s(14, 0), m1339g());
        }
        ambientDelegateM1568D.m1622y();
    }
}
