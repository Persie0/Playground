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
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.TextView;
import android.window.OnBackInvokedCallback;
import android.window.OnBackInvokedDispatcher;
import androidx.activity.C0196o;
import androidx.activity.C0197p;
import androidx.activity.C0199r;
import androidx.activity.RunnableC0191j;
import androidx.activity.RunnableC0193l;
import androidx.appcompat.view.menu.C0224f;
import androidx.appcompat.view.menu.C0226h;
import androidx.appcompat.view.menu.InterfaceC0228j;
import androidx.appcompat.view.menu.SubMenuC0231m;
import androidx.customview.view.AbsSavedState;
import androidx.fragment.app.FragmentManager;
import com.linguist.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Objects;
import java.util.WeakHashMap;
import p058d.C4999a;
import p080e.AbstractC5269a;
import p104f.C5452a;
import p164i.C6105f;
import p164i.InterfaceC6101b;
import p471x2.C10029b0;
import p471x2.C10040h;
import p471x2.C10044j;
import p471x2.C10049l0;
import p471x2.InterfaceC10042i;
import p471x2.InterfaceC10048l;

/* JADX INFO: loaded from: classes.dex */
public class Toolbar extends ViewGroup implements InterfaceC10042i {

    /* JADX INFO: renamed from: H */
    public int f1058H;

    /* JADX INFO: renamed from: I */
    public final int f1059I;

    /* JADX INFO: renamed from: J */
    public final int f1060J;

    /* JADX INFO: renamed from: K */
    public int f1061K;

    /* JADX INFO: renamed from: L */
    public int f1062L;

    /* JADX INFO: renamed from: M */
    public int f1063M;

    /* JADX INFO: renamed from: N */
    public int f1064N;

    /* JADX INFO: renamed from: O */
    public C0343t0 f1065O;

    /* JADX INFO: renamed from: P */
    public int f1066P;

    /* JADX INFO: renamed from: Q */
    public int f1067Q;

    /* JADX INFO: renamed from: R */
    public final int f1068R;

    /* JADX INFO: renamed from: S */
    public CharSequence f1069S;

    /* JADX INFO: renamed from: T */
    public CharSequence f1070T;

    /* JADX INFO: renamed from: U */
    public ColorStateList f1071U;

    /* JADX INFO: renamed from: V */
    public ColorStateList f1072V;

    /* JADX INFO: renamed from: W */
    public boolean f1073W;

    /* JADX INFO: renamed from: a */
    public ActionMenuView f1074a;

    /* JADX INFO: renamed from: a0 */
    public boolean f1075a0;

    /* JADX INFO: renamed from: b */
    public AppCompatTextView f1076b;

    /* JADX INFO: renamed from: b0 */
    public final ArrayList<View> f1077b0;

    /* JADX INFO: renamed from: c */
    public AppCompatTextView f1078c;

    /* JADX INFO: renamed from: c0 */
    public final ArrayList<View> f1079c0;

    /* JADX INFO: renamed from: d */
    public C0326l f1080d;

    /* JADX INFO: renamed from: d0 */
    public final int[] f1081d0;

    /* JADX INFO: renamed from: e */
    public AppCompatImageView f1082e;

    /* JADX INFO: renamed from: e0 */
    public final C10044j f1083e0;

    /* JADX INFO: renamed from: f */
    public final Drawable f1084f;

    /* JADX INFO: renamed from: f0 */
    public ArrayList<MenuItem> f1085f0;

    /* JADX INFO: renamed from: g */
    public final CharSequence f1086g;

    /* JADX INFO: renamed from: g0 */
    public InterfaceC0293h f1087g0;

    /* JADX INFO: renamed from: h */
    public C0326l f1088h;

    /* JADX INFO: renamed from: h0 */
    public final C0286a f1089h0;

    /* JADX INFO: renamed from: i */
    public View f1090i;

    /* JADX INFO: renamed from: i0 */
    public C0306d1 f1091i0;

    /* JADX INFO: renamed from: j */
    public Context f1092j;

    /* JADX INFO: renamed from: j0 */
    public ActionMenuPresenter f1093j0;

    /* JADX INFO: renamed from: k */
    public int f1094k;

    /* JADX INFO: renamed from: k0 */
    public C0291f f1095k0;

    /* JADX INFO: renamed from: l */
    public int f1096l;

    /* JADX INFO: renamed from: l0 */
    public InterfaceC0228j.a f1097l0;

    /* JADX INFO: renamed from: m0 */
    public C0224f.a f1098m0;

    /* JADX INFO: renamed from: n0 */
    public boolean f1099n0;

    /* JADX INFO: renamed from: o0 */
    public OnBackInvokedCallback f1100o0;

    /* JADX INFO: renamed from: p0 */
    public OnBackInvokedDispatcher f1101p0;

    /* JADX INFO: renamed from: q0 */
    public boolean f1102q0;

    /* JADX INFO: renamed from: r0 */
    public final RunnableC0287b f1103r0;

    public static class SavedState extends AbsSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new C0285a();

        /* JADX INFO: renamed from: c */
        public int f1104c;

        /* JADX INFO: renamed from: d */
        public boolean f1105d;

        /* JADX INFO: renamed from: androidx.appcompat.widget.Toolbar$SavedState$a */
        public class C0285a implements Parcelable.ClassLoaderCreator<SavedState> {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                return new SavedState(parcel, null);
            }

            @Override // android.os.Parcelable.ClassLoaderCreator
            public final SavedState createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new SavedState(parcel, classLoader);
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i10) {
                return new SavedState[i10];
            }
        }

        public SavedState(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.f1104c = parcel.readInt();
            this.f1105d = parcel.readInt() != 0;
        }

        public SavedState(Parcelable parcelable) {
            super(parcelable);
        }

        @Override // androidx.customview.view.AbsSavedState, android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i10) {
            parcel.writeParcelable(this.f5635a, i10);
            parcel.writeInt(this.f1104c);
            parcel.writeInt(this.f1105d ? 1 : 0);
        }
    }

    /* JADX INFO: renamed from: androidx.appcompat.widget.Toolbar$a */
    public class C0286a implements ActionMenuView.InterfaceC0249e {
        public C0286a() {
        }
    }

    /* JADX INFO: renamed from: androidx.appcompat.widget.Toolbar$b */
    public class RunnableC0287b implements Runnable {
        public RunnableC0287b() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            ActionMenuPresenter actionMenuPresenter;
            ActionMenuView actionMenuView = Toolbar.this.f1074a;
            if (actionMenuView == null || (actionMenuPresenter = actionMenuView.f870O) == null) {
                return;
            }
            actionMenuPresenter.m981n();
        }
    }

    /* JADX INFO: renamed from: androidx.appcompat.widget.Toolbar$c */
    public class C0288c implements C0224f.a {
        public C0288c() {
        }

        @Override // androidx.appcompat.view.menu.C0224f.a
        /* JADX INFO: renamed from: a */
        public final boolean mo940a(C0224f c0224f, MenuItem menuItem) {
            C0224f.a aVar = Toolbar.this.f1098m0;
            return aVar != null && aVar.mo940a(c0224f, menuItem);
        }

        @Override // androidx.appcompat.view.menu.C0224f.a
        /* JADX INFO: renamed from: b */
        public final void mo941b(C0224f c0224f) {
            Toolbar toolbar = Toolbar.this;
            ActionMenuPresenter actionMenuPresenter = toolbar.f1074a.f870O;
            if (!(actionMenuPresenter != null && actionMenuPresenter.m980j())) {
                Iterator<InterfaceC10048l> it = toolbar.f1083e0.f51036b.iterator();
                while (it.hasNext()) {
                    it.next().mo3673d(c0224f);
                }
            }
            C0224f.a aVar = toolbar.f1098m0;
            if (aVar != null) {
                aVar.mo941b(c0224f);
            }
        }
    }

    /* JADX INFO: renamed from: androidx.appcompat.widget.Toolbar$d */
    public class ViewOnClickListenerC0289d implements View.OnClickListener {
        public ViewOnClickListenerC0289d() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            C0291f c0291f = Toolbar.this.f1095k0;
            C0226h c0226h = c0291f == null ? null : c0291f.f1111b;
            if (c0226h != null) {
                c0226h.collapseActionView();
            }
        }
    }

    /* JADX INFO: renamed from: androidx.appcompat.widget.Toolbar$e */
    public static class C0290e {
        /* JADX INFO: renamed from: a */
        public static OnBackInvokedDispatcher m1068a(View view) {
            return view.findOnBackInvokedDispatcher();
        }

        /* JADX INFO: renamed from: b */
        public static OnBackInvokedCallback m1069b(Runnable runnable) {
            Objects.requireNonNull(runnable);
            return new C0199r(1, runnable);
        }

        /* JADX INFO: renamed from: c */
        public static void m1070c(Object obj, Object obj2) {
            C0196o.m827d(obj).registerOnBackInvokedCallback(1000000, C0197p.m836e(obj2));
        }

        /* JADX INFO: renamed from: d */
        public static void m1071d(Object obj, Object obj2) {
            C0196o.m827d(obj).unregisterOnBackInvokedCallback(C0197p.m836e(obj2));
        }
    }

    /* JADX INFO: renamed from: androidx.appcompat.widget.Toolbar$f */
    public class C0291f implements InterfaceC0228j {

        /* JADX INFO: renamed from: a */
        public C0224f f1110a;

        /* JADX INFO: renamed from: b */
        public C0226h f1111b;

        public C0291f() {
        }

        @Override // androidx.appcompat.view.menu.InterfaceC0228j
        /* JADX INFO: renamed from: c */
        public final void mo895c(C0224f c0224f, boolean z10) {
        }

        @Override // androidx.appcompat.view.menu.InterfaceC0228j
        /* JADX INFO: renamed from: d */
        public final void mo896d(boolean z10) {
            if (this.f1111b != null) {
                C0224f c0224f = this.f1110a;
                boolean z11 = false;
                if (c0224f == null) {
                    break;
                    break;
                }
                int size = c0224f.size();
                int i10 = 0;
                while (true) {
                    if (i10 >= size) {
                        break;
                    }
                    if (this.f1110a.getItem(i10) == this.f1111b) {
                        z11 = true;
                        break;
                    }
                    i10++;
                }
                if (z11) {
                    return;
                }
                mo891g(this.f1111b);
            }
        }

        @Override // androidx.appcompat.view.menu.InterfaceC0228j
        /* JADX INFO: renamed from: e */
        public final boolean mo897e() {
            return false;
        }

        @Override // androidx.appcompat.view.menu.InterfaceC0228j
        /* JADX INFO: renamed from: g */
        public final boolean mo891g(C0226h c0226h) {
            Toolbar toolbar = Toolbar.this;
            KeyEvent.Callback callback = toolbar.f1090i;
            if (callback instanceof InterfaceC6101b) {
                ((InterfaceC6101b) callback).mo1022e();
            }
            toolbar.removeView(toolbar.f1090i);
            toolbar.removeView(toolbar.f1088h);
            toolbar.f1090i = null;
            ArrayList<View> arrayList = toolbar.f1079c0;
            int size = arrayList.size();
            while (true) {
                size--;
                if (size < 0) {
                    arrayList.clear();
                    this.f1111b = null;
                    toolbar.requestLayout();
                    c0226h.f722C = false;
                    c0226h.f736n.m932p(false);
                    toolbar.m1067s();
                    return true;
                }
                toolbar.addView(arrayList.get(size));
            }
        }

        @Override // androidx.appcompat.view.menu.InterfaceC0228j
        public final int getId() {
            return 0;
        }

        @Override // androidx.appcompat.view.menu.InterfaceC0228j
        /* JADX INFO: renamed from: h */
        public final void mo913h(Context context, C0224f c0224f) {
            C0226h c0226h;
            C0224f c0224f2 = this.f1110a;
            if (c0224f2 != null && (c0226h = this.f1111b) != null) {
                c0224f2.mo920d(c0226h);
            }
            this.f1110a = c0224f;
        }

        @Override // androidx.appcompat.view.menu.InterfaceC0228j
        /* JADX INFO: renamed from: i */
        public final void mo898i(Parcelable parcelable) {
        }

        @Override // androidx.appcompat.view.menu.InterfaceC0228j
        /* JADX INFO: renamed from: k */
        public final boolean mo900k(SubMenuC0231m subMenuC0231m) {
            return false;
        }

        @Override // androidx.appcompat.view.menu.InterfaceC0228j
        /* JADX INFO: renamed from: l */
        public final Parcelable mo901l() {
            return null;
        }

        @Override // androidx.appcompat.view.menu.InterfaceC0228j
        /* JADX INFO: renamed from: m */
        public final boolean mo892m(C0226h c0226h) {
            Toolbar toolbar = Toolbar.this;
            toolbar.m1054c();
            ViewParent parent = toolbar.f1088h.getParent();
            if (parent != toolbar) {
                if (parent instanceof ViewGroup) {
                    ((ViewGroup) parent).removeView(toolbar.f1088h);
                }
                toolbar.addView(toolbar.f1088h);
            }
            View actionView = c0226h.getActionView();
            toolbar.f1090i = actionView;
            this.f1111b = c0226h;
            ViewParent parent2 = actionView.getParent();
            if (parent2 != toolbar) {
                if (parent2 instanceof ViewGroup) {
                    ((ViewGroup) parent2).removeView(toolbar.f1090i);
                }
                C0292g c0292g = new C0292g();
                c0292g.f33364a = (toolbar.f1059I & 112) | 8388611;
                c0292g.f1113b = 2;
                toolbar.f1090i.setLayoutParams(c0292g);
                toolbar.addView(toolbar.f1090i);
            }
            int childCount = toolbar.getChildCount();
            loop0: while (true) {
                while (true) {
                    childCount--;
                    if (childCount < 0) {
                        break loop0;
                    }
                    View childAt = toolbar.getChildAt(childCount);
                    if (((C0292g) childAt.getLayoutParams()).f1113b == 2 || childAt == toolbar.f1074a) {
                        break;
                    }
                    toolbar.removeViewAt(childCount);
                    toolbar.f1079c0.add(childAt);
                }
            }
            toolbar.requestLayout();
            c0226h.f722C = true;
            c0226h.f736n.m932p(false);
            KeyEvent.Callback callback = toolbar.f1090i;
            if (callback instanceof InterfaceC6101b) {
                ((InterfaceC6101b) callback).mo1021c();
            }
            toolbar.m1067s();
            return true;
        }
    }

    /* JADX INFO: renamed from: androidx.appcompat.widget.Toolbar$g */
    public static class C0292g extends AbstractC5269a.a {

        /* JADX INFO: renamed from: b */
        public int f1113b;

        public C0292g() {
            this.f1113b = 0;
            this.f33364a = 8388627;
        }

        public C0292g(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.f1113b = 0;
        }

        public C0292g(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
            this.f1113b = 0;
        }

        public C0292g(ViewGroup.MarginLayoutParams marginLayoutParams) {
            super(marginLayoutParams);
            this.f1113b = 0;
            ((ViewGroup.MarginLayoutParams) this).leftMargin = marginLayoutParams.leftMargin;
            ((ViewGroup.MarginLayoutParams) this).topMargin = marginLayoutParams.topMargin;
            ((ViewGroup.MarginLayoutParams) this).rightMargin = marginLayoutParams.rightMargin;
            ((ViewGroup.MarginLayoutParams) this).bottomMargin = marginLayoutParams.bottomMargin;
        }

        public C0292g(C0292g c0292g) {
            super((AbstractC5269a.a) c0292g);
            this.f1113b = 0;
            this.f1113b = c0292g.f1113b;
        }

        public C0292g(AbstractC5269a.a aVar) {
            super(aVar);
            this.f1113b = 0;
        }
    }

    /* JADX INFO: renamed from: androidx.appcompat.widget.Toolbar$h */
    public interface InterfaceC0293h {
        boolean onMenuItemClick(MenuItem menuItem);
    }

    public Toolbar(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public Toolbar(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, R.attr.toolbarStyle);
        this.f1068R = 8388627;
        this.f1077b0 = new ArrayList<>();
        this.f1079c0 = new ArrayList<>();
        this.f1081d0 = new int[2];
        this.f1083e0 = new C10044j(new RunnableC0191j(1, this));
        this.f1085f0 = new ArrayList<>();
        this.f1089h0 = new C0286a();
        this.f1103r0 = new RunnableC0287b();
        Context context2 = getContext();
        int[] iArr = C4999a.f32611y;
        C0300b1 c0300b1M1111m = C0300b1.m1111m(context2, attributeSet, iArr, R.attr.toolbarStyle);
        C10029b0.m18657m(this, context, iArr, attributeSet, c0300b1M1111m.f1134b, R.attr.toolbarStyle);
        this.f1096l = c0300b1M1111m.m1120i(28, 0);
        this.f1058H = c0300b1M1111m.m1120i(19, 0);
        TypedArray typedArray = c0300b1M1111m.f1134b;
        this.f1068R = typedArray.getInteger(0, 8388627);
        this.f1059I = typedArray.getInteger(2, 48);
        int iM1114c = c0300b1M1111m.m1114c(22, 0);
        iM1114c = c0300b1M1111m.m1123l(27) ? c0300b1M1111m.m1114c(27, iM1114c) : iM1114c;
        this.f1064N = iM1114c;
        this.f1063M = iM1114c;
        this.f1062L = iM1114c;
        this.f1061K = iM1114c;
        int iM1114c2 = c0300b1M1111m.m1114c(25, -1);
        if (iM1114c2 >= 0) {
            this.f1061K = iM1114c2;
        }
        int iM1114c3 = c0300b1M1111m.m1114c(24, -1);
        if (iM1114c3 >= 0) {
            this.f1062L = iM1114c3;
        }
        int iM1114c4 = c0300b1M1111m.m1114c(26, -1);
        if (iM1114c4 >= 0) {
            this.f1063M = iM1114c4;
        }
        int iM1114c5 = c0300b1M1111m.m1114c(23, -1);
        if (iM1114c5 >= 0) {
            this.f1064N = iM1114c5;
        }
        this.f1060J = c0300b1M1111m.m1115d(13, -1);
        int iM1114c6 = c0300b1M1111m.m1114c(9, Integer.MIN_VALUE);
        int iM1114c7 = c0300b1M1111m.m1114c(5, Integer.MIN_VALUE);
        int iM1115d = c0300b1M1111m.m1115d(7, 0);
        int iM1115d2 = c0300b1M1111m.m1115d(8, 0);
        if (this.f1065O == null) {
            this.f1065O = new C0343t0();
        }
        C0343t0 c0343t0 = this.f1065O;
        c0343t0.f1336h = false;
        if (iM1115d != Integer.MIN_VALUE) {
            c0343t0.f1333e = iM1115d;
            c0343t0.f1329a = iM1115d;
        }
        if (iM1115d2 != Integer.MIN_VALUE) {
            c0343t0.f1334f = iM1115d2;
            c0343t0.f1330b = iM1115d2;
        }
        if (iM1114c6 != Integer.MIN_VALUE || iM1114c7 != Integer.MIN_VALUE) {
            c0343t0.m1267a(iM1114c6, iM1114c7);
        }
        this.f1066P = c0300b1M1111m.m1114c(10, Integer.MIN_VALUE);
        this.f1067Q = c0300b1M1111m.m1114c(6, Integer.MIN_VALUE);
        this.f1084f = c0300b1M1111m.m1116e(4);
        this.f1086g = c0300b1M1111m.m1122k(3);
        CharSequence charSequenceM1122k = c0300b1M1111m.m1122k(21);
        if (!TextUtils.isEmpty(charSequenceM1122k)) {
            setTitle(charSequenceM1122k);
        }
        CharSequence charSequenceM1122k2 = c0300b1M1111m.m1122k(18);
        if (!TextUtils.isEmpty(charSequenceM1122k2)) {
            setSubtitle(charSequenceM1122k2);
        }
        this.f1092j = getContext();
        setPopupTheme(c0300b1M1111m.m1120i(17, 0));
        Drawable drawableM1116e = c0300b1M1111m.m1116e(16);
        if (drawableM1116e != null) {
            setNavigationIcon(drawableM1116e);
        }
        CharSequence charSequenceM1122k3 = c0300b1M1111m.m1122k(15);
        if (!TextUtils.isEmpty(charSequenceM1122k3)) {
            setNavigationContentDescription(charSequenceM1122k3);
        }
        Drawable drawableM1116e2 = c0300b1M1111m.m1116e(11);
        if (drawableM1116e2 != null) {
            setLogo(drawableM1116e2);
        }
        CharSequence charSequenceM1122k4 = c0300b1M1111m.m1122k(12);
        if (!TextUtils.isEmpty(charSequenceM1122k4)) {
            setLogoDescription(charSequenceM1122k4);
        }
        if (c0300b1M1111m.m1123l(29)) {
            setTitleTextColor(c0300b1M1111m.m1113b(29));
        }
        if (c0300b1M1111m.m1123l(20)) {
            setSubtitleTextColor(c0300b1M1111m.m1113b(20));
        }
        if (c0300b1M1111m.m1123l(14)) {
            mo1059k(c0300b1M1111m.m1120i(14, 0));
        }
        c0300b1M1111m.m1124n();
    }

    /* JADX INFO: renamed from: g */
    public static C0292g m1049g(ViewGroup.LayoutParams layoutParams) {
        if (layoutParams instanceof C0292g) {
            return new C0292g((C0292g) layoutParams);
        }
        if (layoutParams instanceof AbstractC5269a.a) {
            return new C0292g((AbstractC5269a.a) layoutParams);
        }
        return layoutParams instanceof ViewGroup.MarginLayoutParams ? new C0292g((ViewGroup.MarginLayoutParams) layoutParams) : new C0292g(layoutParams);
    }

    private ArrayList<MenuItem> getCurrentMenuItems() {
        ArrayList<MenuItem> arrayList = new ArrayList<>();
        Menu menu = getMenu();
        for (int i10 = 0; i10 < menu.size(); i10++) {
            arrayList.add(menu.getItem(i10));
        }
        return arrayList;
    }

    private MenuInflater getMenuInflater() {
        return new C6105f(getContext());
    }

    /* JADX INFO: renamed from: i */
    public static int m1050i(View view) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        return C10040h.m18808b(marginLayoutParams) + C10040h.m18809c(marginLayoutParams);
    }

    /* JADX INFO: renamed from: j */
    public static int m1051j(View view) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        return marginLayoutParams.topMargin + marginLayoutParams.bottomMargin;
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @Override // p471x2.InterfaceC10042i
    /* JADX INFO: renamed from: A */
    public final void mo783A(FragmentManager.C0918c c0918c) {
        C10044j c10044j = this.f1083e0;
        c10044j.f51036b.remove(c0918c);
        if (((C10044j.a) c10044j.f51037c.remove(c0918c)) != null) {
            throw null;
        }
        c10044j.f51035a.run();
    }

    /* JADX INFO: renamed from: a */
    public final void m1052a(int i10, ArrayList arrayList) {
        WeakHashMap<View, C10049l0> weakHashMap = C10029b0.f50993a;
        boolean z10 = C10029b0.e.m18686d(this) == 1;
        int childCount = getChildCount();
        int absoluteGravity = Gravity.getAbsoluteGravity(i10, C10029b0.e.m18686d(this));
        arrayList.clear();
        if (z10) {
            for (int i11 = childCount - 1; i11 >= 0; i11--) {
                View childAt = getChildAt(i11);
                C0292g c0292g = (C0292g) childAt.getLayoutParams();
                if (c0292g.f1113b == 0 && m1066r(childAt)) {
                    int i12 = c0292g.f33364a;
                    WeakHashMap<View, C10049l0> weakHashMap2 = C10029b0.f50993a;
                    int iM18686d = C10029b0.e.m18686d(this);
                    int absoluteGravity2 = Gravity.getAbsoluteGravity(i12, iM18686d) & 7;
                    if (absoluteGravity2 != 1 && absoluteGravity2 != 3 && absoluteGravity2 != 5) {
                        absoluteGravity2 = iM18686d == 1 ? 5 : 3;
                    }
                    if (absoluteGravity2 == absoluteGravity) {
                        arrayList.add(childAt);
                    }
                }
            }
            return;
        }
        for (int i13 = 0; i13 < childCount; i13++) {
            View childAt2 = getChildAt(i13);
            C0292g c0292g2 = (C0292g) childAt2.getLayoutParams();
            if (c0292g2.f1113b == 0 && m1066r(childAt2)) {
                int i14 = c0292g2.f33364a;
                WeakHashMap<View, C10049l0> weakHashMap3 = C10029b0.f50993a;
                int iM18686d2 = C10029b0.e.m18686d(this);
                int absoluteGravity3 = Gravity.getAbsoluteGravity(i14, iM18686d2) & 7;
                if (absoluteGravity3 != 1 && absoluteGravity3 != 3 && absoluteGravity3 != 5) {
                    if (iM18686d2 == 1) {
                        absoluteGravity3 = 5;
                    } else {
                        absoluteGravity3 = 3;
                    }
                }
                if (absoluteGravity3 == absoluteGravity) {
                    arrayList.add(childAt2);
                }
            }
        }
    }

    /* JADX INFO: renamed from: b */
    public final void m1053b(View view, boolean z10) {
        C0292g c0292gM1049g;
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams == null) {
            c0292gM1049g = new C0292g();
        } else {
            c0292gM1049g = !checkLayoutParams(layoutParams) ? m1049g(layoutParams) : (C0292g) layoutParams;
        }
        c0292gM1049g.f1113b = 1;
        if (!z10 || this.f1090i == null) {
            addView(view, c0292gM1049g);
        } else {
            view.setLayoutParams(c0292gM1049g);
            this.f1079c0.add(view);
        }
    }

    /* JADX INFO: renamed from: c */
    public final void m1054c() {
        if (this.f1088h == null) {
            C0326l c0326l = new C0326l(getContext(), null, R.attr.toolbarNavigationButtonStyle);
            this.f1088h = c0326l;
            c0326l.setImageDrawable(this.f1084f);
            this.f1088h.setContentDescription(this.f1086g);
            C0292g c0292g = new C0292g();
            c0292g.f33364a = (this.f1059I & 112) | 8388611;
            c0292g.f1113b = 2;
            this.f1088h.setLayoutParams(c0292g);
            this.f1088h.setOnClickListener(new ViewOnClickListenerC0289d());
        }
    }

    @Override // android.view.ViewGroup
    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return super.checkLayoutParams(layoutParams) && (layoutParams instanceof C0292g);
    }

    /* JADX INFO: renamed from: d */
    public final void m1055d() {
        m1056e();
        ActionMenuView actionMenuView = this.f1074a;
        if (actionMenuView.f866K == null) {
            C0224f c0224f = (C0224f) actionMenuView.getMenu();
            if (this.f1095k0 == null) {
                this.f1095k0 = new C0291f();
            }
            this.f1074a.setExpandedActionViewsExclusive(true);
            c0224f.m918b(this.f1095k0, this.f1092j);
            m1067s();
        }
    }

    /* JADX INFO: renamed from: e */
    public final void m1056e() {
        if (this.f1074a == null) {
            ActionMenuView actionMenuView = new ActionMenuView(getContext(), null);
            this.f1074a = actionMenuView;
            actionMenuView.setPopupTheme(this.f1094k);
            this.f1074a.setOnMenuItemClickListener(this.f1089h0);
            ActionMenuView actionMenuView2 = this.f1074a;
            InterfaceC0228j.a aVar = this.f1097l0;
            C0288c c0288c = new C0288c();
            actionMenuView2.f871P = aVar;
            actionMenuView2.f872Q = c0288c;
            C0292g c0292g = new C0292g();
            c0292g.f33364a = (this.f1059I & 112) | 8388613;
            this.f1074a.setLayoutParams(c0292g);
            m1053b(this.f1074a, false);
        }
    }

    /* JADX INFO: renamed from: f */
    public final void m1057f() {
        if (this.f1080d == null) {
            this.f1080d = new C0326l(getContext(), null, R.attr.toolbarNavigationButtonStyle);
            C0292g c0292g = new C0292g();
            c0292g.f33364a = (this.f1059I & 112) | 8388611;
            this.f1080d.setLayoutParams(c0292g);
        }
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new C0292g();
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new C0292g(getContext(), attributeSet);
    }

    @Override // android.view.ViewGroup
    public final /* bridge */ /* synthetic */ ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return m1049g(layoutParams);
    }

    public CharSequence getCollapseContentDescription() {
        C0326l c0326l = this.f1088h;
        if (c0326l != null) {
            return c0326l.getContentDescription();
        }
        return null;
    }

    public Drawable getCollapseIcon() {
        C0326l c0326l = this.f1088h;
        if (c0326l != null) {
            return c0326l.getDrawable();
        }
        return null;
    }

    public int getContentInsetEnd() {
        C0343t0 c0343t0 = this.f1065O;
        if (c0343t0 != null) {
            return c0343t0.f1335g ? c0343t0.f1329a : c0343t0.f1330b;
        }
        return 0;
    }

    public int getContentInsetEndWithActions() {
        int i10 = this.f1067Q;
        return i10 != Integer.MIN_VALUE ? i10 : getContentInsetEnd();
    }

    public int getContentInsetLeft() {
        C0343t0 c0343t0 = this.f1065O;
        if (c0343t0 != null) {
            return c0343t0.f1329a;
        }
        return 0;
    }

    public int getContentInsetRight() {
        C0343t0 c0343t0 = this.f1065O;
        if (c0343t0 != null) {
            return c0343t0.f1330b;
        }
        return 0;
    }

    public int getContentInsetStart() {
        C0343t0 c0343t0 = this.f1065O;
        if (c0343t0 != null) {
            return c0343t0.f1335g ? c0343t0.f1330b : c0343t0.f1329a;
        }
        return 0;
    }

    public int getContentInsetStartWithNavigation() {
        int i10 = this.f1066P;
        return i10 != Integer.MIN_VALUE ? i10 : getContentInsetStart();
    }

    public int getCurrentContentInsetEnd() {
        C0224f c0224f;
        ActionMenuView actionMenuView = this.f1074a;
        return actionMenuView != null && (c0224f = actionMenuView.f866K) != null && c0224f.hasVisibleItems() ? Math.max(getContentInsetEnd(), Math.max(this.f1067Q, 0)) : getContentInsetEnd();
    }

    public int getCurrentContentInsetLeft() {
        WeakHashMap<View, C10049l0> weakHashMap = C10029b0.f50993a;
        return C10029b0.e.m18686d(this) == 1 ? getCurrentContentInsetEnd() : getCurrentContentInsetStart();
    }

    public int getCurrentContentInsetRight() {
        WeakHashMap<View, C10049l0> weakHashMap = C10029b0.f50993a;
        return C10029b0.e.m18686d(this) == 1 ? getCurrentContentInsetStart() : getCurrentContentInsetEnd();
    }

    public int getCurrentContentInsetStart() {
        return getNavigationIcon() != null ? Math.max(getContentInsetStart(), Math.max(this.f1066P, 0)) : getContentInsetStart();
    }

    public Drawable getLogo() {
        AppCompatImageView appCompatImageView = this.f1082e;
        if (appCompatImageView != null) {
            return appCompatImageView.getDrawable();
        }
        return null;
    }

    public CharSequence getLogoDescription() {
        AppCompatImageView appCompatImageView = this.f1082e;
        if (appCompatImageView != null) {
            return appCompatImageView.getContentDescription();
        }
        return null;
    }

    public Menu getMenu() {
        m1055d();
        return this.f1074a.getMenu();
    }

    public View getNavButtonView() {
        return this.f1080d;
    }

    public CharSequence getNavigationContentDescription() {
        C0326l c0326l = this.f1080d;
        if (c0326l != null) {
            return c0326l.getContentDescription();
        }
        return null;
    }

    public Drawable getNavigationIcon() {
        C0326l c0326l = this.f1080d;
        if (c0326l != null) {
            return c0326l.getDrawable();
        }
        return null;
    }

    public ActionMenuPresenter getOuterActionMenuPresenter() {
        return this.f1093j0;
    }

    public Drawable getOverflowIcon() {
        m1055d();
        return this.f1074a.getOverflowIcon();
    }

    Context getPopupContext() {
        return this.f1092j;
    }

    public int getPopupTheme() {
        return this.f1094k;
    }

    public CharSequence getSubtitle() {
        return this.f1070T;
    }

    public final TextView getSubtitleTextView() {
        return this.f1078c;
    }

    public CharSequence getTitle() {
        return this.f1069S;
    }

    public int getTitleMarginBottom() {
        return this.f1064N;
    }

    public int getTitleMarginEnd() {
        return this.f1062L;
    }

    public int getTitleMarginStart() {
        return this.f1061K;
    }

    public int getTitleMarginTop() {
        return this.f1063M;
    }

    public final TextView getTitleTextView() {
        return this.f1076b;
    }

    public InterfaceC0305d0 getWrapper() {
        if (this.f1091i0 == null) {
            this.f1091i0 = new C0306d1(this, true);
        }
        return this.f1091i0;
    }

    /* JADX INFO: renamed from: h */
    public final int m1058h(View view, int i10) {
        C0292g c0292g = (C0292g) view.getLayoutParams();
        int measuredHeight = view.getMeasuredHeight();
        int i11 = i10 > 0 ? (measuredHeight - i10) / 2 : 0;
        int i12 = c0292g.f33364a & 112;
        if (i12 != 16 && i12 != 48 && i12 != 80) {
            i12 = this.f1068R & 112;
        }
        if (i12 == 48) {
            return getPaddingTop() - i11;
        }
        if (i12 == 80) {
            return (((getHeight() - getPaddingBottom()) - measuredHeight) - ((ViewGroup.MarginLayoutParams) c0292g).bottomMargin) - i11;
        }
        int paddingTop = getPaddingTop();
        int paddingBottom = getPaddingBottom();
        int height = getHeight();
        int iMax = (((height - paddingTop) - paddingBottom) - measuredHeight) / 2;
        int i13 = ((ViewGroup.MarginLayoutParams) c0292g).topMargin;
        if (iMax < i13) {
            iMax = i13;
        } else {
            int i14 = (((height - paddingBottom) - measuredHeight) - iMax) - paddingTop;
            int i15 = ((ViewGroup.MarginLayoutParams) c0292g).bottomMargin;
            if (i14 < i15) {
                iMax = Math.max(0, iMax - (i15 - i14));
            }
        }
        return paddingTop + iMax;
    }

    /* JADX INFO: renamed from: k */
    public void mo1059k(int i10) {
        getMenuInflater().inflate(i10, getMenu());
    }

    /* JADX INFO: renamed from: l */
    public final void m1060l() {
        Iterator<MenuItem> it = this.f1085f0.iterator();
        while (it.hasNext()) {
            getMenu().removeItem(it.next().getItemId());
        }
        Menu menu = getMenu();
        ArrayList<MenuItem> currentMenuItems = getCurrentMenuItems();
        MenuInflater menuInflater = getMenuInflater();
        Iterator<InterfaceC10048l> it2 = this.f1083e0.f51036b.iterator();
        while (it2.hasNext()) {
            it2.next().mo3672c(menu, menuInflater);
        }
        ArrayList<MenuItem> currentMenuItems2 = getCurrentMenuItems();
        currentMenuItems2.removeAll(currentMenuItems);
        this.f1085f0 = currentMenuItems2;
    }

    /* JADX INFO: renamed from: m */
    public final boolean m1061m(View view) {
        return view.getParent() == this || this.f1079c0.contains(view);
    }

    /* JADX INFO: renamed from: n */
    public final int m1062n(View view, int i10, int i11, int[] iArr) {
        C0292g c0292g = (C0292g) view.getLayoutParams();
        int i12 = ((ViewGroup.MarginLayoutParams) c0292g).leftMargin - iArr[0];
        int iMax = Math.max(0, i12) + i10;
        iArr[0] = Math.max(0, -i12);
        int iM1058h = m1058h(view, i11);
        int measuredWidth = view.getMeasuredWidth();
        view.layout(iMax, iM1058h, iMax + measuredWidth, view.getMeasuredHeight() + iM1058h);
        return measuredWidth + ((ViewGroup.MarginLayoutParams) c0292g).rightMargin + iMax;
    }

    /* JADX INFO: renamed from: o */
    public final int m1063o(View view, int i10, int i11, int[] iArr) {
        C0292g c0292g = (C0292g) view.getLayoutParams();
        int i12 = ((ViewGroup.MarginLayoutParams) c0292g).rightMargin - iArr[1];
        int iMax = i10 - Math.max(0, i12);
        iArr[1] = Math.max(0, -i12);
        int iM1058h = m1058h(view, i11);
        int measuredWidth = view.getMeasuredWidth();
        view.layout(iMax - measuredWidth, iM1058h, iMax, view.getMeasuredHeight() + iM1058h);
        return iMax - (measuredWidth + ((ViewGroup.MarginLayoutParams) c0292g).leftMargin);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        m1067s();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        removeCallbacks(this.f1103r0);
        m1067s();
    }

    @Override // android.view.View
    public final boolean onHoverEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 9) {
            this.f1075a0 = false;
        }
        if (!this.f1075a0) {
            boolean zOnHoverEvent = super.onHoverEvent(motionEvent);
            if (actionMasked == 9 && !zOnHoverEvent) {
                this.f1075a0 = true;
            }
        }
        if (actionMasked == 10 || actionMasked == 3) {
            this.f1075a0 = false;
        }
        return true;
    }

    /* JADX WARN: Code duplicated, block: B:100:0x0288  */
    /* JADX WARN: Code duplicated, block: B:103:0x029b A[LOOP:0: B:102:0x0299->B:103:0x029b, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:106:0x02b8 A[LOOP:1: B:105:0x02b6->B:106:0x02b8, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:109:0x02d9 A[LOOP:2: B:108:0x02d7->B:109:0x02d9, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:113:0x031b A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:114:0x031d  */
    /* JADX WARN: Code duplicated, block: B:115:0x0321  */
    /* JADX WARN: Code duplicated, block: B:118:0x0328 A[LOOP:3: B:117:0x0326->B:118:0x0328, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:19:0x0063 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:20:0x0065  */
    /* JADX WARN: Code duplicated, block: B:21:0x006c  */
    /* JADX WARN: Code duplicated, block: B:24:0x007a A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:25:0x007c  */
    /* JADX WARN: Code duplicated, block: B:26:0x0083  */
    /* JADX WARN: Code duplicated, block: B:29:0x00b7 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:30:0x00b9  */
    /* JADX WARN: Code duplicated, block: B:31:0x00c0  */
    /* JADX WARN: Code duplicated, block: B:34:0x00ce A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:35:0x00d0  */
    /* JADX WARN: Code duplicated, block: B:36:0x00d7  */
    /* JADX WARN: Code duplicated, block: B:39:0x00eb  */
    /* JADX WARN: Code duplicated, block: B:40:0x0105  */
    /* JADX WARN: Code duplicated, block: B:42:0x010a  */
    /* JADX WARN: Code duplicated, block: B:43:0x0122  */
    /* JADX WARN: Code duplicated, block: B:48:0x012f A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:49:0x0131  */
    /* JADX WARN: Code duplicated, block: B:50:0x0134  */
    /* JADX WARN: Code duplicated, block: B:52:0x0138  */
    /* JADX WARN: Code duplicated, block: B:53:0x013b  */
    /* JADX WARN: Code duplicated, block: B:56:0x014b  */
    /* JADX WARN: Code duplicated, block: B:58:0x0153 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:65:0x016e  */
    /* JADX WARN: Code duplicated, block: B:67:0x0172  */
    /* JADX WARN: Code duplicated, block: B:69:0x0181  */
    /* JADX WARN: Code duplicated, block: B:70:0x0183  */
    /* JADX WARN: Code duplicated, block: B:72:0x018e  */
    /* JADX WARN: Code duplicated, block: B:74:0x019b  */
    /* JADX WARN: Code duplicated, block: B:75:0x01a7  */
    /* JADX WARN: Code duplicated, block: B:77:0x01b6 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:78:0x01b8  */
    /* JADX WARN: Code duplicated, block: B:79:0x01bb  */
    /* JADX WARN: Code duplicated, block: B:82:0x01d0  */
    /* JADX WARN: Code duplicated, block: B:83:0x01f4  */
    /* JADX WARN: Code duplicated, block: B:85:0x01f7  */
    /* JADX WARN: Code duplicated, block: B:86:0x021b  */
    /* JADX WARN: Code duplicated, block: B:88:0x021e  */
    /* JADX WARN: Code duplicated, block: B:89:0x0224 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:90:0x0226  */
    /* JADX WARN: Code duplicated, block: B:91:0x0229  */
    /* JADX WARN: Code duplicated, block: B:94:0x023d  */
    /* JADX WARN: Code duplicated, block: B:95:0x0260  */
    /* JADX WARN: Code duplicated, block: B:97:0x0263  */
    /* JADX WARN: Code duplicated, block: B:98:0x0285  */
    @Override // android.view.ViewGroup, android.view.View
    public void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        int iM1062n;
        int iM1063o;
        int iMax;
        int iMin;
        boolean zM1066r;
        boolean zM1066r2;
        int measuredHeight;
        AppCompatTextView appCompatTextView;
        AppCompatTextView appCompatTextView2;
        C0292g c0292g;
        C0292g c0292g2;
        boolean z11;
        int i14;
        int i15;
        int paddingTop;
        int i16;
        int i17;
        int i18;
        int i19;
        int i20;
        int i21;
        int iMax2;
        int i22;
        int i23;
        int i24;
        int i25;
        ArrayList<View> arrayList;
        int size;
        int iM1062n2;
        int i26;
        int i27;
        int size2;
        int i28;
        int i29;
        int size3;
        int i30;
        int i31;
        int measuredWidth;
        int i32;
        int i33;
        int i34;
        int size4;
        WeakHashMap<View, C10049l0> weakHashMap = C10029b0.f50993a;
        boolean z12 = C10029b0.e.m18686d(this) == 1;
        int width = getWidth();
        int height = getHeight();
        int paddingLeft = getPaddingLeft();
        int paddingRight = getPaddingRight();
        int paddingTop2 = getPaddingTop();
        int paddingBottom = getPaddingBottom();
        int i35 = width - paddingRight;
        int[] iArr = this.f1081d0;
        iArr[1] = 0;
        iArr[0] = 0;
        int iM18667d = C10029b0.d.m18667d(this);
        int iMin2 = iM18667d >= 0 ? Math.min(iM18667d, i13 - i11) : 0;
        if (m1066r(this.f1080d)) {
            if (z12) {
                iM1063o = m1063o(this.f1080d, i35, iMin2, iArr);
                iM1062n = paddingLeft;
            } else {
                iM1062n = m1062n(this.f1080d, paddingLeft, iMin2, iArr);
            }
            if (m1066r(this.f1088h)) {
                if (z12) {
                    iM1063o = m1063o(this.f1088h, iM1063o, iMin2, iArr);
                } else {
                    iM1062n = m1062n(this.f1088h, iM1062n, iMin2, iArr);
                }
            }
            if (m1066r(this.f1074a)) {
                if (z12) {
                    iM1062n = m1062n(this.f1074a, iM1062n, iMin2, iArr);
                } else {
                    iM1063o = m1063o(this.f1074a, iM1063o, iMin2, iArr);
                }
            }
            int currentContentInsetLeft = getCurrentContentInsetLeft();
            int currentContentInsetRight = getCurrentContentInsetRight();
            iArr[0] = Math.max(0, currentContentInsetLeft - iM1062n);
            iArr[1] = Math.max(0, currentContentInsetRight - (i35 - iM1063o));
            iMax = Math.max(iM1062n, currentContentInsetLeft);
            iMin = Math.min(iM1063o, i35 - currentContentInsetRight);
            if (m1066r(this.f1090i)) {
                if (z12) {
                    iMin = m1063o(this.f1090i, iMin, iMin2, iArr);
                } else {
                    iMax = m1062n(this.f1090i, iMax, iMin2, iArr);
                }
            }
            if (m1066r(this.f1082e)) {
                if (z12) {
                    iMin = m1063o(this.f1082e, iMin, iMin2, iArr);
                } else {
                    iMax = m1062n(this.f1082e, iMax, iMin2, iArr);
                }
            }
            zM1066r = m1066r(this.f1076b);
            zM1066r2 = m1066r(this.f1078c);
            if (zM1066r) {
                C0292g c0292g3 = (C0292g) this.f1076b.getLayoutParams();
                measuredHeight = this.f1076b.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) c0292g3).topMargin + ((ViewGroup.MarginLayoutParams) c0292g3).bottomMargin + 0;
            } else {
                measuredHeight = 0;
            }
            if (zM1066r2) {
                C0292g c0292g4 = (C0292g) this.f1078c.getLayoutParams();
                measuredHeight += this.f1078c.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) c0292g4).topMargin + ((ViewGroup.MarginLayoutParams) c0292g4).bottomMargin;
            }
            if (!zM1066r || zM1066r2) {
                if (zM1066r) {
                    appCompatTextView = this.f1076b;
                } else {
                    appCompatTextView = this.f1078c;
                }
                if (zM1066r2) {
                    appCompatTextView2 = this.f1078c;
                } else {
                    appCompatTextView2 = this.f1076b;
                }
                c0292g = (C0292g) appCompatTextView.getLayoutParams();
                c0292g2 = (C0292g) appCompatTextView2.getLayoutParams();
                z11 = (!zM1066r && this.f1076b.getMeasuredWidth() > 0) || (zM1066r2 && this.f1078c.getMeasuredWidth() > 0);
                i14 = this.f1068R & 112;
                i15 = paddingLeft;
                if (i14 == 48) {
                    paddingTop = getPaddingTop() + ((ViewGroup.MarginLayoutParams) c0292g).topMargin + this.f1063M;
                } else if (i14 != 80) {
                    iMax2 = (((height - paddingTop2) - paddingBottom) - measuredHeight) / 2;
                    i22 = ((ViewGroup.MarginLayoutParams) c0292g).topMargin + this.f1063M;
                    if (iMax2 < i22) {
                        iMax2 = i22;
                    } else {
                        i23 = (((height - paddingBottom) - measuredHeight) - iMax2) - paddingTop2;
                        i24 = ((ViewGroup.MarginLayoutParams) c0292g).bottomMargin;
                        i25 = this.f1064N;
                        if (i23 < i24 + i25) {
                            iMax2 = Math.max(0, iMax2 - ((((ViewGroup.MarginLayoutParams) c0292g2).bottomMargin + i25) - i23));
                        }
                    }
                    paddingTop = paddingTop2 + iMax2;
                } else {
                    paddingTop = (((height - paddingBottom) - ((ViewGroup.MarginLayoutParams) c0292g2).bottomMargin) - this.f1064N) - measuredHeight;
                }
                if (z12) {
                    if (z11) {
                        i19 = this.f1061K;
                    } else {
                        i19 = 0;
                    }
                    int i36 = i19 - iArr[1];
                    iMin -= Math.max(0, i36);
                    iArr[1] = Math.max(0, -i36);
                    if (zM1066r) {
                        C0292g c0292g5 = (C0292g) this.f1076b.getLayoutParams();
                        int measuredWidth2 = iMin - this.f1076b.getMeasuredWidth();
                        int measuredHeight2 = this.f1076b.getMeasuredHeight() + paddingTop;
                        this.f1076b.layout(measuredWidth2, paddingTop, iMin, measuredHeight2);
                        i20 = measuredWidth2 - this.f1062L;
                        paddingTop = measuredHeight2 + ((ViewGroup.MarginLayoutParams) c0292g5).bottomMargin;
                    } else {
                        i20 = iMin;
                    }
                    if (zM1066r2) {
                        int i37 = paddingTop + ((ViewGroup.MarginLayoutParams) ((C0292g) this.f1078c.getLayoutParams())).topMargin;
                        this.f1078c.layout(iMin - this.f1078c.getMeasuredWidth(), i37, iMin, this.f1078c.getMeasuredHeight() + i37);
                        i21 = iMin - this.f1062L;
                    } else {
                        i21 = iMin;
                    }
                    if (z11) {
                        iMin = Math.min(i20, i21);
                    }
                } else {
                    if (z11) {
                        i16 = this.f1061K;
                    } else {
                        i16 = 0;
                    }
                    int i38 = i16 - iArr[0];
                    iMax += Math.max(0, i38);
                    iArr[0] = Math.max(0, -i38);
                    if (zM1066r) {
                        C0292g c0292g6 = (C0292g) this.f1076b.getLayoutParams();
                        int measuredWidth3 = this.f1076b.getMeasuredWidth() + iMax;
                        int measuredHeight3 = this.f1076b.getMeasuredHeight() + paddingTop;
                        this.f1076b.layout(iMax, paddingTop, measuredWidth3, measuredHeight3);
                        i17 = measuredWidth3 + this.f1062L;
                        paddingTop = measuredHeight3 + ((ViewGroup.MarginLayoutParams) c0292g6).bottomMargin;
                    } else {
                        i17 = iMax;
                    }
                    if (zM1066r2) {
                        int i39 = paddingTop + ((ViewGroup.MarginLayoutParams) ((C0292g) this.f1078c.getLayoutParams())).topMargin;
                        int measuredWidth4 = this.f1078c.getMeasuredWidth() + iMax;
                        this.f1078c.layout(iMax, i39, measuredWidth4, this.f1078c.getMeasuredHeight() + i39);
                        i18 = measuredWidth4 + this.f1062L;
                    } else {
                        i18 = iMax;
                    }
                    if (z11) {
                        iMax = Math.max(i17, i18);
                    }
                }
            } else {
                i15 = paddingLeft;
                iMin2 = iMin2;
            }
            arrayList = this.f1077b0;
            m1052a(3, arrayList);
            size = arrayList.size();
            iM1062n2 = iMax;
            for (i26 = 0; i26 < size; i26++) {
                iM1062n2 = m1062n(arrayList.get(i26), iM1062n2, iMin2, iArr);
            }
            i27 = iMin2;
            m1052a(5, arrayList);
            size2 = arrayList.size();
            for (i28 = 0; i28 < size2; i28++) {
                iMin = m1063o(arrayList.get(i28), iMin, i27, iArr);
            }
            m1052a(1, arrayList);
            int i40 = iArr[0];
            i29 = iArr[1];
            size3 = arrayList.size();
            i30 = i40;
            i31 = 0;
            measuredWidth = 0;
            while (i31 < size3) {
                View view = arrayList.get(i31);
                C0292g c0292g7 = (C0292g) view.getLayoutParams();
                int i41 = ((ViewGroup.MarginLayoutParams) c0292g7).leftMargin - i30;
                int i42 = ((ViewGroup.MarginLayoutParams) c0292g7).rightMargin - i29;
                int iMax3 = Math.max(0, i41);
                int iMax4 = Math.max(0, i42);
                int iMax5 = Math.max(0, -i41);
                int iMax6 = Math.max(0, -i42);
                measuredWidth += view.getMeasuredWidth() + iMax3 + iMax4;
                i31++;
                i29 = iMax6;
                i30 = iMax5;
            }
            i33 = ((((width - i15) - paddingRight) / 2) + i15) - (measuredWidth / 2);
            i34 = measuredWidth + i33;
            if (i33 >= iM1062n2) {
                if (i34 > iMin) {
                    iM1062n2 = i33 - (i34 - iMin);
                } else {
                    iM1062n2 = i33;
                }
            }
            size4 = arrayList.size();
            for (i32 = 0; i32 < size4; i32++) {
                iM1062n2 = m1062n(arrayList.get(i32), iM1062n2, i27, iArr);
            }
            arrayList.clear();
        }
        iM1062n = paddingLeft;
        iM1063o = i35;
        if (m1066r(this.f1088h)) {
            if (z12) {
                iM1063o = m1063o(this.f1088h, iM1063o, iMin2, iArr);
            } else {
                iM1062n = m1062n(this.f1088h, iM1062n, iMin2, iArr);
            }
        }
        if (m1066r(this.f1074a)) {
            if (z12) {
                iM1062n = m1062n(this.f1074a, iM1062n, iMin2, iArr);
            } else {
                iM1063o = m1063o(this.f1074a, iM1063o, iMin2, iArr);
            }
        }
        int currentContentInsetLeft2 = getCurrentContentInsetLeft();
        int currentContentInsetRight2 = getCurrentContentInsetRight();
        iArr[0] = Math.max(0, currentContentInsetLeft2 - iM1062n);
        iArr[1] = Math.max(0, currentContentInsetRight2 - (i35 - iM1063o));
        iMax = Math.max(iM1062n, currentContentInsetLeft2);
        iMin = Math.min(iM1063o, i35 - currentContentInsetRight2);
        if (m1066r(this.f1090i)) {
            if (z12) {
                iMin = m1063o(this.f1090i, iMin, iMin2, iArr);
            } else {
                iMax = m1062n(this.f1090i, iMax, iMin2, iArr);
            }
        }
        if (m1066r(this.f1082e)) {
            if (z12) {
                iMin = m1063o(this.f1082e, iMin, iMin2, iArr);
            } else {
                iMax = m1062n(this.f1082e, iMax, iMin2, iArr);
            }
        }
        zM1066r = m1066r(this.f1076b);
        zM1066r2 = m1066r(this.f1078c);
        if (zM1066r) {
            C0292g c0292g8 = (C0292g) this.f1076b.getLayoutParams();
            measuredHeight = this.f1076b.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) c0292g8).topMargin + ((ViewGroup.MarginLayoutParams) c0292g8).bottomMargin + 0;
        } else {
            measuredHeight = 0;
        }
        if (zM1066r2) {
            C0292g c0292g9 = (C0292g) this.f1078c.getLayoutParams();
            measuredHeight += this.f1078c.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) c0292g9).topMargin + ((ViewGroup.MarginLayoutParams) c0292g9).bottomMargin;
        }
        if (zM1066r) {
            if (zM1066r) {
                appCompatTextView = this.f1076b;
            } else {
                appCompatTextView = this.f1078c;
            }
            if (zM1066r2) {
                appCompatTextView2 = this.f1078c;
            } else {
                appCompatTextView2 = this.f1076b;
            }
            c0292g = (C0292g) appCompatTextView.getLayoutParams();
            c0292g2 = (C0292g) appCompatTextView2.getLayoutParams();
            if (zM1066r) {
            }
            i14 = this.f1068R & 112;
            i15 = paddingLeft;
            if (i14 == 48) {
                paddingTop = getPaddingTop() + ((ViewGroup.MarginLayoutParams) c0292g).topMargin + this.f1063M;
            } else if (i14 != 80) {
                iMax2 = (((height - paddingTop2) - paddingBottom) - measuredHeight) / 2;
                i22 = ((ViewGroup.MarginLayoutParams) c0292g).topMargin + this.f1063M;
                if (iMax2 < i22) {
                    iMax2 = i22;
                } else {
                    i23 = (((height - paddingBottom) - measuredHeight) - iMax2) - paddingTop2;
                    i24 = ((ViewGroup.MarginLayoutParams) c0292g).bottomMargin;
                    i25 = this.f1064N;
                    if (i23 < i24 + i25) {
                        iMax2 = Math.max(0, iMax2 - ((((ViewGroup.MarginLayoutParams) c0292g2).bottomMargin + i25) - i23));
                    }
                }
                paddingTop = paddingTop2 + iMax2;
            } else {
                paddingTop = (((height - paddingBottom) - ((ViewGroup.MarginLayoutParams) c0292g2).bottomMargin) - this.f1064N) - measuredHeight;
            }
            if (z12) {
                if (z11) {
                    i19 = this.f1061K;
                } else {
                    i19 = 0;
                }
                int i310 = i19 - iArr[1];
                iMin -= Math.max(0, i310);
                iArr[1] = Math.max(0, -i310);
                if (zM1066r) {
                    C0292g c0292g10 = (C0292g) this.f1076b.getLayoutParams();
                    int measuredWidth5 = iMin - this.f1076b.getMeasuredWidth();
                    int measuredHeight4 = this.f1076b.getMeasuredHeight() + paddingTop;
                    this.f1076b.layout(measuredWidth5, paddingTop, iMin, measuredHeight4);
                    i20 = measuredWidth5 - this.f1062L;
                    paddingTop = measuredHeight4 + ((ViewGroup.MarginLayoutParams) c0292g10).bottomMargin;
                } else {
                    i20 = iMin;
                }
                if (zM1066r2) {
                    int i311 = paddingTop + ((ViewGroup.MarginLayoutParams) ((C0292g) this.f1078c.getLayoutParams())).topMargin;
                    this.f1078c.layout(iMin - this.f1078c.getMeasuredWidth(), i311, iMin, this.f1078c.getMeasuredHeight() + i311);
                    i21 = iMin - this.f1062L;
                } else {
                    i21 = iMin;
                }
                if (z11) {
                    iMin = Math.min(i20, i21);
                }
            } else {
                if (z11) {
                    i16 = this.f1061K;
                } else {
                    i16 = 0;
                }
                int i312 = i16 - iArr[0];
                iMax += Math.max(0, i312);
                iArr[0] = Math.max(0, -i312);
                if (zM1066r) {
                    C0292g c0292g11 = (C0292g) this.f1076b.getLayoutParams();
                    int measuredWidth6 = this.f1076b.getMeasuredWidth() + iMax;
                    int measuredHeight5 = this.f1076b.getMeasuredHeight() + paddingTop;
                    this.f1076b.layout(iMax, paddingTop, measuredWidth6, measuredHeight5);
                    i17 = measuredWidth6 + this.f1062L;
                    paddingTop = measuredHeight5 + ((ViewGroup.MarginLayoutParams) c0292g11).bottomMargin;
                } else {
                    i17 = iMax;
                }
                if (zM1066r2) {
                    int i313 = paddingTop + ((ViewGroup.MarginLayoutParams) ((C0292g) this.f1078c.getLayoutParams())).topMargin;
                    int measuredWidth7 = this.f1078c.getMeasuredWidth() + iMax;
                    this.f1078c.layout(iMax, i313, measuredWidth7, this.f1078c.getMeasuredHeight() + i313);
                    i18 = measuredWidth7 + this.f1062L;
                } else {
                    i18 = iMax;
                }
                if (z11) {
                    iMax = Math.max(i17, i18);
                }
            }
        } else {
            if (zM1066r) {
                appCompatTextView = this.f1076b;
            } else {
                appCompatTextView = this.f1078c;
            }
            if (zM1066r2) {
                appCompatTextView2 = this.f1078c;
            } else {
                appCompatTextView2 = this.f1076b;
            }
            c0292g = (C0292g) appCompatTextView.getLayoutParams();
            c0292g2 = (C0292g) appCompatTextView2.getLayoutParams();
            if (zM1066r) {
            }
            i14 = this.f1068R & 112;
            i15 = paddingLeft;
            if (i14 == 48) {
                paddingTop = getPaddingTop() + ((ViewGroup.MarginLayoutParams) c0292g).topMargin + this.f1063M;
            } else if (i14 != 80) {
                iMax2 = (((height - paddingTop2) - paddingBottom) - measuredHeight) / 2;
                i22 = ((ViewGroup.MarginLayoutParams) c0292g).topMargin + this.f1063M;
                if (iMax2 < i22) {
                    iMax2 = i22;
                } else {
                    i23 = (((height - paddingBottom) - measuredHeight) - iMax2) - paddingTop2;
                    i24 = ((ViewGroup.MarginLayoutParams) c0292g).bottomMargin;
                    i25 = this.f1064N;
                    if (i23 < i24 + i25) {
                        iMax2 = Math.max(0, iMax2 - ((((ViewGroup.MarginLayoutParams) c0292g2).bottomMargin + i25) - i23));
                    }
                }
                paddingTop = paddingTop2 + iMax2;
            } else {
                paddingTop = (((height - paddingBottom) - ((ViewGroup.MarginLayoutParams) c0292g2).bottomMargin) - this.f1064N) - measuredHeight;
            }
            if (z12) {
                if (z11) {
                    i19 = this.f1061K;
                } else {
                    i19 = 0;
                }
                int i314 = i19 - iArr[1];
                iMin -= Math.max(0, i314);
                iArr[1] = Math.max(0, -i314);
                if (zM1066r) {
                    C0292g c0292g12 = (C0292g) this.f1076b.getLayoutParams();
                    int measuredWidth8 = iMin - this.f1076b.getMeasuredWidth();
                    int measuredHeight6 = this.f1076b.getMeasuredHeight() + paddingTop;
                    this.f1076b.layout(measuredWidth8, paddingTop, iMin, measuredHeight6);
                    i20 = measuredWidth8 - this.f1062L;
                    paddingTop = measuredHeight6 + ((ViewGroup.MarginLayoutParams) c0292g12).bottomMargin;
                } else {
                    i20 = iMin;
                }
                if (zM1066r2) {
                    int i315 = paddingTop + ((ViewGroup.MarginLayoutParams) ((C0292g) this.f1078c.getLayoutParams())).topMargin;
                    this.f1078c.layout(iMin - this.f1078c.getMeasuredWidth(), i315, iMin, this.f1078c.getMeasuredHeight() + i315);
                    i21 = iMin - this.f1062L;
                } else {
                    i21 = iMin;
                }
                if (z11) {
                    iMin = Math.min(i20, i21);
                }
            } else {
                if (z11) {
                    i16 = this.f1061K;
                } else {
                    i16 = 0;
                }
                int i316 = i16 - iArr[0];
                iMax += Math.max(0, i316);
                iArr[0] = Math.max(0, -i316);
                if (zM1066r) {
                    C0292g c0292g13 = (C0292g) this.f1076b.getLayoutParams();
                    int measuredWidth9 = this.f1076b.getMeasuredWidth() + iMax;
                    int measuredHeight7 = this.f1076b.getMeasuredHeight() + paddingTop;
                    this.f1076b.layout(iMax, paddingTop, measuredWidth9, measuredHeight7);
                    i17 = measuredWidth9 + this.f1062L;
                    paddingTop = measuredHeight7 + ((ViewGroup.MarginLayoutParams) c0292g13).bottomMargin;
                } else {
                    i17 = iMax;
                }
                if (zM1066r2) {
                    int i317 = paddingTop + ((ViewGroup.MarginLayoutParams) ((C0292g) this.f1078c.getLayoutParams())).topMargin;
                    int measuredWidth10 = this.f1078c.getMeasuredWidth() + iMax;
                    this.f1078c.layout(iMax, i317, measuredWidth10, this.f1078c.getMeasuredHeight() + i317);
                    i18 = measuredWidth10 + this.f1062L;
                } else {
                    i18 = iMax;
                }
                if (z11) {
                    iMax = Math.max(i17, i18);
                }
            }
        }
        arrayList = this.f1077b0;
        m1052a(3, arrayList);
        size = arrayList.size();
        iM1062n2 = iMax;
        while (i26 < size) {
            iM1062n2 = m1062n(arrayList.get(i26), iM1062n2, iMin2, iArr);
        }
        i27 = iMin2;
        m1052a(5, arrayList);
        size2 = arrayList.size();
        while (i28 < size2) {
            iMin = m1063o(arrayList.get(i28), iMin, i27, iArr);
        }
        m1052a(1, arrayList);
        int i43 = iArr[0];
        i29 = iArr[1];
        size3 = arrayList.size();
        i30 = i43;
        i31 = 0;
        measuredWidth = 0;
        while (i31 < size3) {
            View view2 = arrayList.get(i31);
            C0292g c0292g14 = (C0292g) view2.getLayoutParams();
            int i44 = ((ViewGroup.MarginLayoutParams) c0292g14).leftMargin - i30;
            int i45 = ((ViewGroup.MarginLayoutParams) c0292g14).rightMargin - i29;
            int iMax7 = Math.max(0, i44);
            int iMax8 = Math.max(0, i45);
            int iMax9 = Math.max(0, -i44);
            int iMax10 = Math.max(0, -i45);
            measuredWidth += view2.getMeasuredWidth() + iMax7 + iMax8;
            i31++;
            i29 = iMax10;
            i30 = iMax9;
        }
        i33 = ((((width - i15) - paddingRight) / 2) + i15) - (measuredWidth / 2);
        i34 = measuredWidth + i33;
        if (i33 >= iM1062n2) {
            if (i34 > iMin) {
                iM1062n2 = i33 - (i34 - iMin);
            } else {
                iM1062n2 = i33;
            }
        }
        size4 = arrayList.size();
        while (i32 < size4) {
            iM1062n2 = m1062n(arrayList.get(i32), iM1062n2, i27, iArr);
        }
        arrayList.clear();
    }

    @Override // android.view.View
    public void onMeasure(int i10, int i11) {
        int iM1050i;
        int iMax;
        int iCombineMeasuredStates;
        int iM1050i2;
        int iM1051j;
        int iCombineMeasuredStates2;
        int iMax2;
        boolean z10;
        boolean zM1200a = C0318h1.m1200a(this);
        int i12 = !zM1200a ? 1 : 0;
        if (m1066r(this.f1080d)) {
            m1065q(this.f1080d, i10, 0, i11, this.f1060J);
            iM1050i = m1050i(this.f1080d) + this.f1080d.getMeasuredWidth();
            iMax = Math.max(0, m1051j(this.f1080d) + this.f1080d.getMeasuredHeight());
            iCombineMeasuredStates = View.combineMeasuredStates(0, this.f1080d.getMeasuredState());
        } else {
            iM1050i = 0;
            iMax = 0;
            iCombineMeasuredStates = 0;
        }
        if (m1066r(this.f1088h)) {
            m1065q(this.f1088h, i10, 0, i11, this.f1060J);
            iM1050i = m1050i(this.f1088h) + this.f1088h.getMeasuredWidth();
            iMax = Math.max(iMax, m1051j(this.f1088h) + this.f1088h.getMeasuredHeight());
            iCombineMeasuredStates = View.combineMeasuredStates(iCombineMeasuredStates, this.f1088h.getMeasuredState());
        }
        int currentContentInsetStart = getCurrentContentInsetStart();
        int iMax3 = Math.max(currentContentInsetStart, iM1050i) + 0;
        int iMax4 = Math.max(0, currentContentInsetStart - iM1050i);
        int[] iArr = this.f1081d0;
        iArr[zM1200a ? 1 : 0] = iMax4;
        if (m1066r(this.f1074a)) {
            m1065q(this.f1074a, i10, iMax3, i11, this.f1060J);
            iM1050i2 = m1050i(this.f1074a) + this.f1074a.getMeasuredWidth();
            iMax = Math.max(iMax, m1051j(this.f1074a) + this.f1074a.getMeasuredHeight());
            iCombineMeasuredStates = View.combineMeasuredStates(iCombineMeasuredStates, this.f1074a.getMeasuredState());
        } else {
            iM1050i2 = 0;
        }
        int currentContentInsetEnd = getCurrentContentInsetEnd();
        int iMax5 = iMax3 + Math.max(currentContentInsetEnd, iM1050i2);
        iArr[i12] = Math.max(0, currentContentInsetEnd - iM1050i2);
        if (m1066r(this.f1090i)) {
            iMax5 += m1064p(this.f1090i, i10, iMax5, i11, 0, iArr);
            iMax = Math.max(iMax, m1051j(this.f1090i) + this.f1090i.getMeasuredHeight());
            iCombineMeasuredStates = View.combineMeasuredStates(iCombineMeasuredStates, this.f1090i.getMeasuredState());
        }
        if (m1066r(this.f1082e)) {
            iMax5 += m1064p(this.f1082e, i10, iMax5, i11, 0, iArr);
            iMax = Math.max(iMax, m1051j(this.f1082e) + this.f1082e.getMeasuredHeight());
            iCombineMeasuredStates = View.combineMeasuredStates(iCombineMeasuredStates, this.f1082e.getMeasuredState());
        }
        int childCount = getChildCount();
        for (int i13 = 0; i13 < childCount; i13++) {
            View childAt = getChildAt(i13);
            if (((C0292g) childAt.getLayoutParams()).f1113b == 0 && m1066r(childAt)) {
                iMax5 += m1064p(childAt, i10, iMax5, i11, 0, iArr);
                iMax = Math.max(iMax, m1051j(childAt) + childAt.getMeasuredHeight());
                iCombineMeasuredStates = View.combineMeasuredStates(iCombineMeasuredStates, childAt.getMeasuredState());
            }
        }
        int i14 = this.f1063M + this.f1064N;
        int i15 = this.f1061K + this.f1062L;
        if (m1066r(this.f1076b)) {
            m1064p(this.f1076b, i10, iMax5 + i15, i11, i14, iArr);
            int iM1050i3 = m1050i(this.f1076b) + this.f1076b.getMeasuredWidth();
            iM1051j = m1051j(this.f1076b) + this.f1076b.getMeasuredHeight();
            iCombineMeasuredStates2 = View.combineMeasuredStates(iCombineMeasuredStates, this.f1076b.getMeasuredState());
            iMax2 = iM1050i3;
        } else {
            iM1051j = 0;
            iCombineMeasuredStates2 = iCombineMeasuredStates;
            iMax2 = 0;
        }
        if (m1066r(this.f1078c)) {
            iMax2 = Math.max(iMax2, m1064p(this.f1078c, i10, iMax5 + i15, i11, iM1051j + i14, iArr));
            iM1051j += m1051j(this.f1078c) + this.f1078c.getMeasuredHeight();
            iCombineMeasuredStates2 = View.combineMeasuredStates(iCombineMeasuredStates2, this.f1078c.getMeasuredState());
        }
        int iMax6 = Math.max(iMax, iM1051j);
        int paddingRight = getPaddingRight() + getPaddingLeft();
        int paddingBottom = getPaddingBottom() + getPaddingTop() + iMax6;
        int iResolveSizeAndState = View.resolveSizeAndState(Math.max(paddingRight + iMax5 + iMax2, getSuggestedMinimumWidth()), i10, (-16777216) & iCombineMeasuredStates2);
        int iResolveSizeAndState2 = View.resolveSizeAndState(Math.max(paddingBottom, getSuggestedMinimumHeight()), i11, iCombineMeasuredStates2 << 16);
        if (!this.f1099n0) {
            z10 = false;
            break;
        }
        int childCount2 = getChildCount();
        int i16 = 0;
        while (true) {
            if (i16 >= childCount2) {
                z10 = true;
                break;
            }
            View childAt2 = getChildAt(i16);
            if (m1066r(childAt2) && childAt2.getMeasuredWidth() > 0 && childAt2.getMeasuredHeight() > 0) {
                z10 = false;
                break;
            }
            i16++;
        }
        setMeasuredDimension(iResolveSizeAndState, z10 ? 0 : iResolveSizeAndState2);
    }

    @Override // android.view.View
    public void onRestoreInstanceState(Parcelable parcelable) {
        MenuItem menuItemFindItem;
        if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.f5635a);
        ActionMenuView actionMenuView = this.f1074a;
        C0224f c0224f = actionMenuView != null ? actionMenuView.f866K : null;
        int i10 = savedState.f1104c;
        if (i10 != 0 && this.f1095k0 != null && c0224f != null && (menuItemFindItem = c0224f.findItem(i10)) != null) {
            menuItemFindItem.expandActionView();
        }
        if (savedState.f1105d) {
            RunnableC0287b runnableC0287b = this.f1103r0;
            removeCallbacks(runnableC0287b);
            post(runnableC0287b);
        }
    }

    @Override // android.view.View
    public final void onRtlPropertiesChanged(int i10) {
        super.onRtlPropertiesChanged(i10);
        if (this.f1065O == null) {
            this.f1065O = new C0343t0();
        }
        C0343t0 c0343t0 = this.f1065O;
        boolean z10 = true;
        if (i10 != 1) {
            z10 = false;
        }
        if (z10 == c0343t0.f1335g) {
            return;
        }
        c0343t0.f1335g = z10;
        if (!c0343t0.f1336h) {
            c0343t0.f1329a = c0343t0.f1333e;
            c0343t0.f1330b = c0343t0.f1334f;
            return;
        }
        if (z10) {
            int i11 = c0343t0.f1332d;
            if (i11 == Integer.MIN_VALUE) {
                i11 = c0343t0.f1333e;
            }
            c0343t0.f1329a = i11;
            int i12 = c0343t0.f1331c;
            if (i12 == Integer.MIN_VALUE) {
                i12 = c0343t0.f1334f;
            }
            c0343t0.f1330b = i12;
            return;
        }
        int i13 = c0343t0.f1331c;
        if (i13 == Integer.MIN_VALUE) {
            i13 = c0343t0.f1333e;
        }
        c0343t0.f1329a = i13;
        int i14 = c0343t0.f1332d;
        if (i14 == Integer.MIN_VALUE) {
            i14 = c0343t0.f1334f;
        }
        c0343t0.f1330b = i14;
    }

    @Override // android.view.View
    public Parcelable onSaveInstanceState() {
        C0226h c0226h;
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        C0291f c0291f = this.f1095k0;
        if (c0291f != null && (c0226h = c0291f.f1111b) != null) {
            savedState.f1104c = c0226h.f723a;
        }
        ActionMenuView actionMenuView = this.f1074a;
        boolean z10 = false;
        if (actionMenuView != null) {
            ActionMenuPresenter actionMenuPresenter = actionMenuView.f870O;
            if (actionMenuPresenter != null && actionMenuPresenter.m980j()) {
                z10 = true;
            }
        }
        savedState.f1105d = z10;
        return savedState;
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            this.f1073W = false;
        }
        if (!this.f1073W) {
            boolean zOnTouchEvent = super.onTouchEvent(motionEvent);
            if (actionMasked == 0 && !zOnTouchEvent) {
                this.f1073W = true;
            }
        }
        if (actionMasked == 1 || actionMasked == 3) {
            this.f1073W = false;
        }
        return true;
    }

    /* JADX INFO: renamed from: p */
    public final int m1064p(View view, int i10, int i11, int i12, int i13, int[] iArr) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        int i14 = marginLayoutParams.leftMargin - iArr[0];
        int i15 = marginLayoutParams.rightMargin - iArr[1];
        int iMax = Math.max(0, i15) + Math.max(0, i14);
        iArr[0] = Math.max(0, -i14);
        iArr[1] = Math.max(0, -i15);
        view.measure(ViewGroup.getChildMeasureSpec(i10, getPaddingRight() + getPaddingLeft() + iMax + i11, marginLayoutParams.width), ViewGroup.getChildMeasureSpec(i12, getPaddingBottom() + getPaddingTop() + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin + i13, marginLayoutParams.height));
        return view.getMeasuredWidth() + iMax;
    }

    /* JADX INFO: renamed from: q */
    public final void m1065q(View view, int i10, int i11, int i12, int i13) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        int childMeasureSpec = ViewGroup.getChildMeasureSpec(i10, getPaddingRight() + getPaddingLeft() + marginLayoutParams.leftMargin + marginLayoutParams.rightMargin + i11, marginLayoutParams.width);
        int childMeasureSpec2 = ViewGroup.getChildMeasureSpec(i12, getPaddingBottom() + getPaddingTop() + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin + 0, marginLayoutParams.height);
        int mode = View.MeasureSpec.getMode(childMeasureSpec2);
        if (mode != 1073741824 && i13 >= 0) {
            if (mode != 0) {
                i13 = Math.min(View.MeasureSpec.getSize(childMeasureSpec2), i13);
            }
            childMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(i13, 1073741824);
        }
        view.measure(childMeasureSpec, childMeasureSpec2);
    }

    /* JADX INFO: renamed from: r */
    public final boolean m1066r(View view) {
        return (view == null || view.getParent() != this || view.getVisibility() == 8) ? false : true;
    }

    /* JADX INFO: renamed from: s */
    final void m1067s() {
        OnBackInvokedDispatcher onBackInvokedDispatcher;
        if (Build.VERSION.SDK_INT >= 33) {
            OnBackInvokedDispatcher onBackInvokedDispatcherM1068a = C0290e.m1068a(this);
            C0291f c0291f = this.f1095k0;
            int i10 = 1;
            boolean z10 = false;
            if (((c0291f == null || c0291f.f1111b == null) ? false : true) && onBackInvokedDispatcherM1068a != null) {
                WeakHashMap<View, C10049l0> weakHashMap = C10029b0.f50993a;
                if (C10029b0.g.m18698b(this) && this.f1102q0) {
                    z10 = true;
                }
            }
            if (z10 && this.f1101p0 == null) {
                if (this.f1100o0 == null) {
                    this.f1100o0 = C0290e.m1069b(new RunnableC0193l(i10, this));
                }
                C0290e.m1070c(onBackInvokedDispatcherM1068a, this.f1100o0);
                this.f1101p0 = onBackInvokedDispatcherM1068a;
                return;
            }
            if (z10 || (onBackInvokedDispatcher = this.f1101p0) == null) {
                return;
            }
            C0290e.m1071d(onBackInvokedDispatcher, this.f1100o0);
            this.f1101p0 = null;
        }
    }

    public void setBackInvokedCallbackEnabled(boolean z10) {
        if (this.f1102q0 != z10) {
            this.f1102q0 = z10;
            m1067s();
        }
    }

    public void setCollapseContentDescription(int i10) {
        setCollapseContentDescription(i10 != 0 ? getContext().getText(i10) : null);
    }

    public void setCollapseContentDescription(CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence)) {
            m1054c();
        }
        C0326l c0326l = this.f1088h;
        if (c0326l != null) {
            c0326l.setContentDescription(charSequence);
        }
    }

    public void setCollapseIcon(int i10) {
        setCollapseIcon(C5452a.m11672a(getContext(), i10));
    }

    public void setCollapseIcon(Drawable drawable) {
        if (drawable != null) {
            m1054c();
            this.f1088h.setImageDrawable(drawable);
        } else {
            C0326l c0326l = this.f1088h;
            if (c0326l != null) {
                c0326l.setImageDrawable(this.f1084f);
            }
        }
    }

    public void setCollapsible(boolean z10) {
        this.f1099n0 = z10;
        requestLayout();
    }

    public void setContentInsetEndWithActions(int i10) {
        if (i10 < 0) {
            i10 = Integer.MIN_VALUE;
        }
        if (i10 != this.f1067Q) {
            this.f1067Q = i10;
            if (getNavigationIcon() != null) {
                requestLayout();
            }
        }
    }

    public void setContentInsetStartWithNavigation(int i10) {
        if (i10 < 0) {
            i10 = Integer.MIN_VALUE;
        }
        if (i10 != this.f1066P) {
            this.f1066P = i10;
            if (getNavigationIcon() != null) {
                requestLayout();
            }
        }
    }

    public void setLogo(int i10) {
        setLogo(C5452a.m11672a(getContext(), i10));
    }

    /* JADX WARN: Code duplicated, block: B:17:0x0047  */
    public void setLogo(Drawable drawable) {
        AppCompatImageView appCompatImageView;
        if (drawable != null) {
            if (this.f1082e == null) {
                this.f1082e = new AppCompatImageView(getContext(), null);
            }
            if (!m1061m(this.f1082e)) {
                m1053b(this.f1082e, true);
            }
            appCompatImageView = this.f1082e;
            if (appCompatImageView != null) {
                appCompatImageView.setImageDrawable(drawable);
            }
        }
        AppCompatImageView appCompatImageView2 = this.f1082e;
        if (appCompatImageView2 != null && m1061m(appCompatImageView2)) {
            removeView(this.f1082e);
            this.f1079c0.remove(this.f1082e);
        }
        appCompatImageView = this.f1082e;
        if (appCompatImageView != null) {
            appCompatImageView.setImageDrawable(drawable);
        }
    }

    public void setLogoDescription(int i10) {
        setLogoDescription(getContext().getText(i10));
    }

    public void setLogoDescription(CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence) && this.f1082e == null) {
            this.f1082e = new AppCompatImageView(getContext(), null);
        }
        AppCompatImageView appCompatImageView = this.f1082e;
        if (appCompatImageView != null) {
            appCompatImageView.setContentDescription(charSequence);
        }
    }

    public void setNavigationContentDescription(int i10) {
        setNavigationContentDescription(i10 != 0 ? getContext().getText(i10) : null);
    }

    public void setNavigationContentDescription(CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence)) {
            m1057f();
        }
        C0326l c0326l = this.f1080d;
        if (c0326l != null) {
            c0326l.setContentDescription(charSequence);
            C0309e1.m1185a(this.f1080d, charSequence);
        }
    }

    public void setNavigationIcon(int i10) {
        setNavigationIcon(C5452a.m11672a(getContext(), i10));
    }

    /* JADX WARN: Code duplicated, block: B:14:0x0039  */
    public void setNavigationIcon(Drawable drawable) {
        C0326l c0326l;
        if (drawable != null) {
            m1057f();
            if (!m1061m(this.f1080d)) {
                m1053b(this.f1080d, true);
            }
            c0326l = this.f1080d;
            if (c0326l != null) {
                c0326l.setImageDrawable(drawable);
            }
        }
        C0326l c0326l2 = this.f1080d;
        if (c0326l2 != null && m1061m(c0326l2)) {
            removeView(this.f1080d);
            this.f1079c0.remove(this.f1080d);
        }
        c0326l = this.f1080d;
        if (c0326l != null) {
            c0326l.setImageDrawable(drawable);
        }
    }

    public void setNavigationOnClickListener(View.OnClickListener onClickListener) {
        m1057f();
        this.f1080d.setOnClickListener(onClickListener);
    }

    public void setOnMenuItemClickListener(InterfaceC0293h interfaceC0293h) {
        this.f1087g0 = interfaceC0293h;
    }

    public void setOverflowIcon(Drawable drawable) {
        m1055d();
        this.f1074a.setOverflowIcon(drawable);
    }

    public void setPopupTheme(int i10) {
        if (this.f1094k != i10) {
            this.f1094k = i10;
            if (i10 == 0) {
                this.f1092j = getContext();
                return;
            }
            this.f1092j = new ContextThemeWrapper(getContext(), i10);
        }
    }

    public void setSubtitle(int i10) {
        setSubtitle(getContext().getText(i10));
    }

    /* JADX WARN: Code duplicated, block: B:23:0x0075  */
    public void setSubtitle(CharSequence charSequence) {
        AppCompatTextView appCompatTextView;
        if (!TextUtils.isEmpty(charSequence)) {
            if (this.f1078c == null) {
                Context context = getContext();
                AppCompatTextView appCompatTextView2 = new AppCompatTextView(context, null);
                this.f1078c = appCompatTextView2;
                appCompatTextView2.setSingleLine();
                this.f1078c.setEllipsize(TextUtils.TruncateAt.END);
                int i10 = this.f1058H;
                if (i10 != 0) {
                    this.f1078c.setTextAppearance(context, i10);
                }
                ColorStateList colorStateList = this.f1072V;
                if (colorStateList != null) {
                    this.f1078c.setTextColor(colorStateList);
                }
            }
            if (!m1061m(this.f1078c)) {
                m1053b(this.f1078c, true);
            }
            appCompatTextView = this.f1078c;
            if (appCompatTextView != null) {
                appCompatTextView.setText(charSequence);
            }
            this.f1070T = charSequence;
        }
        AppCompatTextView appCompatTextView3 = this.f1078c;
        if (appCompatTextView3 != null && m1061m(appCompatTextView3)) {
            removeView(this.f1078c);
            this.f1079c0.remove(this.f1078c);
        }
        appCompatTextView = this.f1078c;
        if (appCompatTextView != null) {
            appCompatTextView.setText(charSequence);
        }
        this.f1070T = charSequence;
    }

    public void setSubtitleTextColor(int i10) {
        setSubtitleTextColor(ColorStateList.valueOf(i10));
    }

    public void setSubtitleTextColor(ColorStateList colorStateList) {
        this.f1072V = colorStateList;
        AppCompatTextView appCompatTextView = this.f1078c;
        if (appCompatTextView != null) {
            appCompatTextView.setTextColor(colorStateList);
        }
    }

    public void setTitle(int i10) {
        setTitle(getContext().getText(i10));
    }

    public void setTitle(CharSequence charSequence) {
        if (TextUtils.isEmpty(charSequence)) {
            AppCompatTextView appCompatTextView = this.f1076b;
            if (appCompatTextView != null && m1061m(appCompatTextView)) {
                removeView(this.f1076b);
                this.f1079c0.remove(this.f1076b);
            }
        } else {
            if (this.f1076b == null) {
                Context context = getContext();
                AppCompatTextView appCompatTextView2 = new AppCompatTextView(context, null);
                this.f1076b = appCompatTextView2;
                appCompatTextView2.setSingleLine();
                this.f1076b.setEllipsize(TextUtils.TruncateAt.END);
                int i10 = this.f1096l;
                if (i10 != 0) {
                    this.f1076b.setTextAppearance(context, i10);
                }
                ColorStateList colorStateList = this.f1071U;
                if (colorStateList != null) {
                    this.f1076b.setTextColor(colorStateList);
                }
            }
            if (!m1061m(this.f1076b)) {
                m1053b(this.f1076b, true);
            }
        }
        AppCompatTextView appCompatTextView3 = this.f1076b;
        if (appCompatTextView3 != null) {
            appCompatTextView3.setText(charSequence);
        }
        this.f1069S = charSequence;
    }

    public void setTitleMarginBottom(int i10) {
        this.f1064N = i10;
        requestLayout();
    }

    public void setTitleMarginEnd(int i10) {
        this.f1062L = i10;
        requestLayout();
    }

    public void setTitleMarginStart(int i10) {
        this.f1061K = i10;
        requestLayout();
    }

    public void setTitleMarginTop(int i10) {
        this.f1063M = i10;
        requestLayout();
    }

    public void setTitleTextColor(int i10) {
        setTitleTextColor(ColorStateList.valueOf(i10));
    }

    public void setTitleTextColor(ColorStateList colorStateList) {
        this.f1071U = colorStateList;
        AppCompatTextView appCompatTextView = this.f1076b;
        if (appCompatTextView != null) {
            appCompatTextView.setTextColor(colorStateList);
        }
    }

    @Override // p471x2.InterfaceC10042i
    /* JADX INFO: renamed from: t */
    public final void mo798t(FragmentManager.C0918c c0918c) {
        C10044j c10044j = this.f1083e0;
        c10044j.f51036b.add(c0918c);
        c10044j.f51035a.run();
    }
}
