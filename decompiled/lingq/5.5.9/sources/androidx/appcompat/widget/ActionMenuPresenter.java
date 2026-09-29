package androidx.appcompat.widget;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.SparseBooleanArray;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.appcompat.view.menu.AbstractC0219a;
import androidx.appcompat.view.menu.ActionMenuItemView;
import androidx.appcompat.view.menu.C0224f;
import androidx.appcompat.view.menu.C0226h;
import androidx.appcompat.view.menu.C0227i;
import androidx.appcompat.view.menu.InterfaceC0228j;
import androidx.appcompat.view.menu.InterfaceC0229k;
import androidx.appcompat.view.menu.SubMenuC0231m;
import com.linguist.R;
import java.util.ArrayList;
import p185j.AbstractC6394d;
import p185j.InterfaceC6396f;
import p329q2.C8488a;
import p471x2.AbstractC10028b;

/* JADX INFO: loaded from: classes.dex */
public final class ActionMenuPresenter extends AbstractC0219a {

    /* JADX INFO: renamed from: H */
    public boolean f841H;

    /* JADX INFO: renamed from: I */
    public boolean f842I;

    /* JADX INFO: renamed from: J */
    public int f843J;

    /* JADX INFO: renamed from: K */
    public int f844K;

    /* JADX INFO: renamed from: L */
    public int f845L;

    /* JADX INFO: renamed from: M */
    public boolean f846M;

    /* JADX INFO: renamed from: N */
    public final SparseBooleanArray f847N;

    /* JADX INFO: renamed from: O */
    public C0243e f848O;

    /* JADX INFO: renamed from: P */
    public C0239a f849P;

    /* JADX INFO: renamed from: Q */
    public RunnableC0241c f850Q;

    /* JADX INFO: renamed from: R */
    public C0240b f851R;

    /* JADX INFO: renamed from: S */
    public final C0244f f852S;

    /* JADX INFO: renamed from: T */
    public int f853T;

    /* JADX INFO: renamed from: j */
    public C0242d f854j;

    /* JADX INFO: renamed from: k */
    public Drawable f855k;

    /* JADX INFO: renamed from: l */
    public boolean f856l;

    @SuppressLint({"BanParcelableUsage"})
    public static class SavedState implements Parcelable {
        public static final Parcelable.Creator<SavedState> CREATOR = new C0238a();

        /* JADX INFO: renamed from: a */
        public int f857a;

        /* JADX INFO: renamed from: androidx.appcompat.widget.ActionMenuPresenter$SavedState$a */
        public class C0238a implements Parcelable.Creator<SavedState> {
            @Override // android.os.Parcelable.Creator
            public final SavedState createFromParcel(Parcel parcel) {
                return new SavedState(parcel);
            }

            @Override // android.os.Parcelable.Creator
            public final SavedState[] newArray(int i10) {
                return new SavedState[i10];
            }
        }

        public SavedState() {
        }

        public SavedState(Parcel parcel) {
            this.f857a = parcel.readInt();
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i10) {
            parcel.writeInt(this.f857a);
        }
    }

    /* JADX INFO: renamed from: androidx.appcompat.widget.ActionMenuPresenter$a */
    public class C0239a extends C0227i {
        public C0239a(Context context, SubMenuC0231m subMenuC0231m, View view) {
            super(context, subMenuC0231m, view, false);
            if (!((subMenuC0231m.f785A.f746x & 32) == 32)) {
                View view2 = ActionMenuPresenter.this.f854j;
                this.f755f = view2 == null ? (View) ActionMenuPresenter.this.f640h : view2;
            }
            C0244f c0244f = ActionMenuPresenter.this.f852S;
            this.f758i = c0244f;
            AbstractC6394d abstractC6394d = this.f759j;
            if (abstractC6394d != null) {
                abstractC6394d.mo890f(c0244f);
            }
        }

        @Override // androidx.appcompat.view.menu.C0227i
        /* JADX INFO: renamed from: c */
        public final void mo952c() {
            ActionMenuPresenter actionMenuPresenter = ActionMenuPresenter.this;
            actionMenuPresenter.f849P = null;
            actionMenuPresenter.f853T = 0;
            super.mo952c();
        }
    }

    /* JADX INFO: renamed from: androidx.appcompat.widget.ActionMenuPresenter$b */
    public class C0240b extends ActionMenuItemView.AbstractC0218b {
        public C0240b() {
        }
    }

    /* JADX INFO: renamed from: androidx.appcompat.widget.ActionMenuPresenter$c */
    public class RunnableC0241c implements Runnable {

        /* JADX INFO: renamed from: a */
        public final C0243e f860a;

        public RunnableC0241c(C0243e c0243e) {
            this.f860a = c0243e;
        }

        @Override // java.lang.Runnable
        public final void run() {
            C0224f.a aVar;
            ActionMenuPresenter actionMenuPresenter = ActionMenuPresenter.this;
            C0224f c0224f = actionMenuPresenter.f635c;
            if (c0224f != null && (aVar = c0224f.f697e) != null) {
                aVar.mo941b(c0224f);
            }
            View view = (View) actionMenuPresenter.f640h;
            if (view != null && view.getWindowToken() != null) {
                C0243e c0243e = this.f860a;
                boolean z10 = true;
                if (!c0243e.m951b()) {
                    if (c0243e.f755f == null) {
                        z10 = false;
                    } else {
                        c0243e.m953d(0, 0, false, false);
                    }
                }
                if (z10) {
                    actionMenuPresenter.f848O = c0243e;
                }
            }
            actionMenuPresenter.f850Q = null;
        }
    }

    /* JADX INFO: renamed from: androidx.appcompat.widget.ActionMenuPresenter$d */
    public class C0242d extends AppCompatImageView implements ActionMenuView.InterfaceC0245a {

        /* JADX INFO: renamed from: androidx.appcompat.widget.ActionMenuPresenter$d$a */
        public class a extends AbstractViewOnTouchListenerC0320i0 {
            public a(View view) {
                super(view);
            }

            @Override // androidx.appcompat.widget.AbstractViewOnTouchListenerC0320i0
            /* JADX INFO: renamed from: b */
            public final InterfaceC6396f mo887b() {
                C0243e c0243e = ActionMenuPresenter.this.f848O;
                if (c0243e == null) {
                    return null;
                }
                return c0243e.m950a();
            }

            @Override // androidx.appcompat.widget.AbstractViewOnTouchListenerC0320i0
            /* JADX INFO: renamed from: c */
            public final boolean mo888c() {
                ActionMenuPresenter.this.m981n();
                return true;
            }

            @Override // androidx.appcompat.widget.AbstractViewOnTouchListenerC0320i0
            /* JADX INFO: renamed from: d */
            public final boolean mo982d() {
                ActionMenuPresenter actionMenuPresenter = ActionMenuPresenter.this;
                if (actionMenuPresenter.f850Q != null) {
                    return false;
                }
                actionMenuPresenter.m979b();
                return true;
            }
        }

        public C0242d(Context context) {
            super(context, null, R.attr.actionOverflowButtonStyle);
            setClickable(true);
            setFocusable(true);
            setVisibility(0);
            setEnabled(true);
            C0309e1.m1185a(this, getContentDescription());
            setOnTouchListener(new a(this));
        }

        @Override // androidx.appcompat.widget.ActionMenuView.InterfaceC0245a
        /* JADX INFO: renamed from: a */
        public final boolean mo882a() {
            return false;
        }

        @Override // androidx.appcompat.widget.ActionMenuView.InterfaceC0245a
        /* JADX INFO: renamed from: b */
        public final boolean mo883b() {
            return false;
        }

        @Override // android.view.View
        public final boolean performClick() {
            if (super.performClick()) {
                return true;
            }
            playSoundEffect(0);
            ActionMenuPresenter.this.m981n();
            return true;
        }

        @Override // android.widget.ImageView
        public final boolean setFrame(int i10, int i11, int i12, int i13) {
            boolean frame = super.setFrame(i10, i11, i12, i13);
            Drawable drawable = getDrawable();
            Drawable background = getBackground();
            if (drawable != null && background != null) {
                int width = getWidth();
                int height = getHeight();
                int iMax = Math.max(width, height) / 2;
                int paddingLeft = (width + (getPaddingLeft() - getPaddingRight())) / 2;
                int paddingTop = (height + (getPaddingTop() - getPaddingBottom())) / 2;
                C8488a.b.m16568f(background, paddingLeft - iMax, paddingTop - iMax, paddingLeft + iMax, paddingTop + iMax);
            }
            return frame;
        }
    }

    /* JADX INFO: renamed from: androidx.appcompat.widget.ActionMenuPresenter$e */
    public class C0243e extends C0227i {
        public C0243e(Context context, C0224f c0224f, C0242d c0242d) {
            super(context, c0224f, c0242d, true);
            this.f756g = 8388613;
            C0244f c0244f = ActionMenuPresenter.this.f852S;
            this.f758i = c0244f;
            AbstractC6394d abstractC6394d = this.f759j;
            if (abstractC6394d != null) {
                abstractC6394d.mo890f(c0244f);
            }
        }

        @Override // androidx.appcompat.view.menu.C0227i
        /* JADX INFO: renamed from: c */
        public final void mo952c() {
            ActionMenuPresenter actionMenuPresenter = ActionMenuPresenter.this;
            C0224f c0224f = actionMenuPresenter.f635c;
            if (c0224f != null) {
                c0224f.m919c(true);
            }
            actionMenuPresenter.f848O = null;
            super.mo952c();
        }
    }

    /* JADX INFO: renamed from: androidx.appcompat.widget.ActionMenuPresenter$f */
    public class C0244f implements InterfaceC0228j.a {
        public C0244f() {
        }

        @Override // androidx.appcompat.view.menu.InterfaceC0228j.a
        /* JADX INFO: renamed from: c */
        public final void mo942c(C0224f c0224f, boolean z10) {
            if (c0224f instanceof SubMenuC0231m) {
                c0224f.mo927k().m919c(false);
            }
            InterfaceC0228j.a aVar = ActionMenuPresenter.this.f637e;
            if (aVar != null) {
                aVar.mo942c(c0224f, z10);
            }
        }

        @Override // androidx.appcompat.view.menu.InterfaceC0228j.a
        /* JADX INFO: renamed from: d */
        public final boolean mo943d(C0224f c0224f) {
            ActionMenuPresenter actionMenuPresenter = ActionMenuPresenter.this;
            if (c0224f == actionMenuPresenter.f635c) {
                return false;
            }
            actionMenuPresenter.f853T = ((SubMenuC0231m) c0224f).f785A.f723a;
            InterfaceC0228j.a aVar = actionMenuPresenter.f637e;
            return aVar != null ? aVar.mo943d(c0224f) : false;
        }
    }

    public ActionMenuPresenter(Context context) {
        super(context);
        this.f847N = new SparseBooleanArray();
        this.f852S = new C0244f();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: a */
    public final View m978a(C0226h c0226h, View view, ViewGroup viewGroup) {
        InterfaceC0229k.a aVar;
        View actionView = c0226h.getActionView();
        int i10 = 0;
        if (actionView == null || c0226h.m948e()) {
            if (view instanceof InterfaceC0229k.a) {
                aVar = (InterfaceC0229k.a) view;
            } else {
                aVar = (InterfaceC0229k.a) this.f636d.inflate(this.f639g, viewGroup, false);
            }
            aVar.mo232d(c0226h);
            ActionMenuItemView actionMenuItemView = (ActionMenuItemView) aVar;
            actionMenuItemView.setItemInvoker((ActionMenuView) this.f640h);
            if (this.f851R == null) {
                this.f851R = new C0240b();
            }
            actionMenuItemView.setPopupCallback(this.f851R);
            actionView = (View) aVar;
        }
        if (c0226h.f722C) {
            i10 = 8;
        }
        actionView.setVisibility(i10);
        ViewGroup.LayoutParams layoutParams = actionView.getLayoutParams();
        if (!((ActionMenuView) viewGroup).checkLayoutParams(layoutParams)) {
            actionView.setLayoutParams(ActionMenuView.m983l(layoutParams));
        }
        return actionView;
    }

    /* JADX INFO: renamed from: b */
    public final boolean m979b() {
        Object obj;
        RunnableC0241c runnableC0241c = this.f850Q;
        if (runnableC0241c != null && (obj = this.f640h) != null) {
            ((View) obj).removeCallbacks(runnableC0241c);
            this.f850Q = null;
            return true;
        }
        C0243e c0243e = this.f848O;
        if (c0243e == null) {
            return false;
        }
        if (c0243e.m951b()) {
            c0243e.f759j.dismiss();
        }
        return true;
    }

    @Override // androidx.appcompat.view.menu.InterfaceC0228j
    /* JADX INFO: renamed from: c */
    public final void mo895c(C0224f c0224f, boolean z10) {
        m979b();
        C0239a c0239a = this.f849P;
        if (c0239a != null && c0239a.m951b()) {
            c0239a.f759j.dismiss();
        }
        InterfaceC0228j.a aVar = this.f637e;
        if (aVar != null) {
            aVar.mo942c(c0224f, z10);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.appcompat.view.menu.InterfaceC0228j
    /* JADX INFO: renamed from: d */
    public final void mo896d(boolean z10) {
        int i10;
        boolean z11;
        ViewGroup viewGroup = (ViewGroup) this.f640h;
        ArrayList<C0226h> arrayList = null;
        boolean z12 = false;
        if (viewGroup != null) {
            C0224f c0224f = this.f635c;
            if (c0224f != null) {
                c0224f.m925i();
                ArrayList<C0226h> arrayListM928l = this.f635c.m928l();
                int size = arrayListM928l.size();
                i10 = 0;
                for (int i11 = 0; i11 < size; i11++) {
                    C0226h c0226h = arrayListM928l.get(i11);
                    if ((c0226h.f746x & 32) == 32) {
                        View childAt = viewGroup.getChildAt(i10);
                        C0226h itemData = childAt instanceof InterfaceC0229k.a ? ((InterfaceC0229k.a) childAt).getItemData() : null;
                        View viewM978a = m978a(c0226h, childAt, viewGroup);
                        if (c0226h != itemData) {
                            viewM978a.setPressed(false);
                            viewM978a.jumpDrawablesToCurrentState();
                        }
                        if (viewM978a != childAt) {
                            ViewGroup viewGroup2 = (ViewGroup) viewM978a.getParent();
                            if (viewGroup2 != null) {
                                viewGroup2.removeView(viewM978a);
                            }
                            ((ViewGroup) this.f640h).addView(viewM978a, i10);
                        }
                        i10++;
                    }
                }
            } else {
                i10 = 0;
            }
            while (i10 < viewGroup.getChildCount()) {
                if (viewGroup.getChildAt(i10) == this.f854j) {
                    z11 = false;
                } else {
                    viewGroup.removeViewAt(i10);
                    z11 = true;
                }
                if (!z11) {
                    i10++;
                }
            }
        }
        ((View) this.f640h).requestLayout();
        C0224f c0224f2 = this.f635c;
        if (c0224f2 != null) {
            c0224f2.m925i();
            ArrayList<C0226h> arrayList2 = c0224f2.f701i;
            int size2 = arrayList2.size();
            for (int i12 = 0; i12 < size2; i12++) {
                AbstractC10028b abstractC10028b = arrayList2.get(i12).f720A;
            }
        }
        C0224f c0224f3 = this.f635c;
        if (c0224f3 != null) {
            c0224f3.m925i();
            arrayList = c0224f3.f702j;
        }
        if (this.f841H && arrayList != null) {
            int size3 = arrayList.size();
            if (size3 == 1) {
                z12 = !arrayList.get(0).f722C;
            } else if (size3 > 0) {
                z12 = true;
            }
        }
        if (z12) {
            if (this.f854j == null) {
                this.f854j = new C0242d(this.f633a);
            }
            ViewGroup viewGroup3 = (ViewGroup) this.f854j.getParent();
            if (viewGroup3 != this.f640h) {
                if (viewGroup3 != null) {
                    viewGroup3.removeView(this.f854j);
                }
                ActionMenuView actionMenuView = (ActionMenuView) this.f640h;
                C0242d c0242d = this.f854j;
                actionMenuView.getClass();
                ActionMenuView.C0247c c0247c = new ActionMenuView.C0247c();
                ((LinearLayout.LayoutParams) c0247c).gravity = 16;
                c0247c.f878a = true;
                actionMenuView.addView(c0242d, c0247c);
            }
            ((ActionMenuView) this.f640h).setOverflowReserved(this.f841H);
        }
        C0242d c0242d2 = this.f854j;
        if (c0242d2 != null) {
            Object parent = c0242d2.getParent();
            Object obj = this.f640h;
            if (parent == obj) {
                ((ViewGroup) obj).removeView(this.f854j);
            }
        }
        ((ActionMenuView) this.f640h).setOverflowReserved(this.f841H);
    }

    @Override // androidx.appcompat.view.menu.InterfaceC0228j
    /* JADX INFO: renamed from: e */
    public final boolean mo897e() {
        int size;
        ArrayList<C0226h> arrayListM928l;
        int i10;
        boolean z10;
        ActionMenuPresenter actionMenuPresenter = this;
        C0224f c0224f = actionMenuPresenter.f635c;
        if (c0224f != null) {
            arrayListM928l = c0224f.m928l();
            size = arrayListM928l.size();
        } else {
            size = 0;
            arrayListM928l = null;
        }
        int i11 = actionMenuPresenter.f845L;
        int i12 = actionMenuPresenter.f844K;
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
        ViewGroup viewGroup = (ViewGroup) actionMenuPresenter.f640h;
        int i13 = 0;
        boolean z11 = false;
        int i14 = 0;
        int i15 = 0;
        while (true) {
            i10 = 2;
            z10 = true;
            if (i13 >= size) {
                break;
            }
            C0226h c0226h = arrayListM928l.get(i13);
            int i16 = c0226h.f747y;
            if ((i16 & 2) == 2) {
                i14++;
            } else if ((i16 & 1) == 1) {
                i15++;
            } else {
                z11 = true;
            }
            if (actionMenuPresenter.f846M && c0226h.f722C) {
                i11 = 0;
            }
            i13++;
        }
        if (actionMenuPresenter.f841H && (z11 || i15 + i14 > i11)) {
            i11--;
        }
        int i17 = i11 - i14;
        SparseBooleanArray sparseBooleanArray = actionMenuPresenter.f847N;
        sparseBooleanArray.clear();
        int i18 = 0;
        int i19 = 0;
        while (i18 < size) {
            C0226h c0226h2 = arrayListM928l.get(i18);
            int i20 = c0226h2.f747y;
            boolean z12 = (i20 & 2) == i10 ? z10 : false;
            int i21 = c0226h2.f724b;
            if (z12) {
                View viewM978a = actionMenuPresenter.m978a(c0226h2, null, viewGroup);
                viewM978a.measure(iMakeMeasureSpec, iMakeMeasureSpec);
                int measuredWidth = viewM978a.getMeasuredWidth();
                i12 -= measuredWidth;
                if (i19 == 0) {
                    i19 = measuredWidth;
                }
                if (i21 != 0) {
                    sparseBooleanArray.put(i21, z10);
                }
                c0226h2.m949f(z10);
            } else {
                if ((i20 & 1) == z10 ? z10 : false) {
                    boolean z13 = sparseBooleanArray.get(i21);
                    boolean z14 = ((i17 > 0 || z13) && i12 > 0) ? z10 : false;
                    if (z14) {
                        View viewM978a2 = actionMenuPresenter.m978a(c0226h2, null, viewGroup);
                        viewM978a2.measure(iMakeMeasureSpec, iMakeMeasureSpec);
                        int measuredWidth2 = viewM978a2.getMeasuredWidth();
                        i12 -= measuredWidth2;
                        if (i19 == 0) {
                            i19 = measuredWidth2;
                        }
                        z14 &= i12 + i19 > 0;
                    }
                    if (z14 && i21 != 0) {
                        sparseBooleanArray.put(i21, true);
                    } else if (z13) {
                        sparseBooleanArray.put(i21, false);
                        for (int i22 = 0; i22 < i18; i22++) {
                            C0226h c0226h3 = arrayListM928l.get(i22);
                            if (c0226h3.f724b == i21) {
                                if ((c0226h3.f746x & 32) == 32) {
                                    i17++;
                                }
                                c0226h3.m949f(false);
                            }
                        }
                    }
                    if (z14) {
                        i17--;
                    }
                    c0226h2.m949f(z14);
                } else {
                    c0226h2.m949f(false);
                }
                i18++;
                i10 = 2;
                actionMenuPresenter = this;
                z10 = true;
            }
            i18++;
            i10 = 2;
            actionMenuPresenter = this;
            z10 = true;
        }
        return z10;
    }

    /* JADX WARN: Code duplicated, block: B:33:0x0086  */
    /* JADX WARN: Code duplicated, block: B:35:0x008c  */
    /* JADX WARN: Code duplicated, block: B:37:0x009c  */
    /* JADX WARN: Code duplicated, block: B:40:0x00be  */
    @Override // androidx.appcompat.view.menu.InterfaceC0228j
    /* JADX INFO: renamed from: h */
    public final void mo913h(Context context, C0224f c0224f) {
        int measuredWidth;
        C0242d c0242d;
        this.f634b = context;
        LayoutInflater.from(context);
        this.f635c = c0224f;
        Resources resources = context.getResources();
        if (!this.f842I) {
            this.f841H = true;
        }
        int i10 = 2;
        this.f843J = context.getResources().getDisplayMetrics().widthPixels / 2;
        Configuration configuration = context.getResources().getConfiguration();
        int i11 = configuration.screenWidthDp;
        int i12 = configuration.screenHeightDp;
        if (configuration.smallestScreenWidthDp <= 600 && i11 <= 600 && ((i11 <= 960 || i12 <= 720) && (i11 <= 720 || i12 <= 960))) {
            if (i11 < 500 && (i11 <= 640 || i12 <= 480)) {
                if (i11 <= 480 || i12 <= 640) {
                    if (i11 >= 360) {
                        i10 = 3;
                    }
                }
                this.f845L = i10;
                measuredWidth = this.f843J;
                if (this.f841H) {
                    if (this.f854j == null) {
                        c0242d = new C0242d(this.f633a);
                        this.f854j = c0242d;
                        if (this.f856l) {
                            c0242d.setImageDrawable(this.f855k);
                            this.f855k = null;
                            this.f856l = false;
                        }
                        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
                        this.f854j.measure(iMakeMeasureSpec, iMakeMeasureSpec);
                    }
                    measuredWidth -= this.f854j.getMeasuredWidth();
                } else {
                    this.f854j = null;
                }
                this.f844K = measuredWidth;
                float f3 = resources.getDisplayMetrics().density;
            }
            i10 = 4;
            this.f845L = i10;
            measuredWidth = this.f843J;
            if (this.f841H) {
                if (this.f854j == null) {
                    c0242d = new C0242d(this.f633a);
                    this.f854j = c0242d;
                    if (this.f856l) {
                        c0242d.setImageDrawable(this.f855k);
                        this.f855k = null;
                        this.f856l = false;
                    }
                    int iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(0, 0);
                    this.f854j.measure(iMakeMeasureSpec2, iMakeMeasureSpec2);
                }
                measuredWidth -= this.f854j.getMeasuredWidth();
            } else {
                this.f854j = null;
            }
            this.f844K = measuredWidth;
            float f10 = resources.getDisplayMetrics().density;
        }
        i10 = 5;
        this.f845L = i10;
        measuredWidth = this.f843J;
        if (this.f841H) {
            if (this.f854j == null) {
                c0242d = new C0242d(this.f633a);
                this.f854j = c0242d;
                if (this.f856l) {
                    c0242d.setImageDrawable(this.f855k);
                    this.f855k = null;
                    this.f856l = false;
                }
                int iMakeMeasureSpec3 = View.MeasureSpec.makeMeasureSpec(0, 0);
                this.f854j.measure(iMakeMeasureSpec3, iMakeMeasureSpec3);
            }
            measuredWidth -= this.f854j.getMeasuredWidth();
        } else {
            this.f854j = null;
        }
        this.f844K = measuredWidth;
        float f11 = resources.getDisplayMetrics().density;
    }

    @Override // androidx.appcompat.view.menu.InterfaceC0228j
    /* JADX INFO: renamed from: i */
    public final void mo898i(Parcelable parcelable) {
        MenuItem menuItemFindItem;
        if (parcelable instanceof SavedState) {
            int i10 = ((SavedState) parcelable).f857a;
            if (i10 > 0 && (menuItemFindItem = this.f635c.findItem(i10)) != null) {
                mo900k((SubMenuC0231m) menuItemFindItem.getSubMenu());
            }
        }
    }

    /* JADX INFO: renamed from: j */
    public final boolean m980j() {
        C0243e c0243e = this.f848O;
        return c0243e != null && c0243e.m951b();
    }

    /* JADX WARN: Code duplicated, block: B:23:0x004b A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:24:0x004c  */
    /* JADX WARN: Code duplicated, block: B:27:0x005c  */
    /* JADX WARN: Code duplicated, block: B:36:0x008a  */
    /* JADX WARN: Code duplicated, block: B:39:0x0097  */
    /* JADX WARN: Code duplicated, block: B:40:0x0099  */
    /* JADX WARN: Code duplicated, block: B:42:0x009e  */
    /* JADX WARN: Code duplicated, block: B:43:0x00a0  */
    /* JADX WARN: Code duplicated, block: B:46:0x00a7  */
    /* JADX WARN: Code duplicated, block: B:48:0x00ac  */
    /* JADX WARN: Code duplicated, block: B:50:0x00b1  */
    /* JADX WARN: Code duplicated, block: B:54:0x0076 A[SYNTHETIC] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v1, types: [android.view.View] */
    /* JADX WARN: Type inference failed for: r5v2 */
    /* JADX WARN: Type inference failed for: r5v3 */
    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @Override // androidx.appcompat.view.menu.InterfaceC0228j
    /* JADX INFO: renamed from: k */
    public final boolean mo900k(SubMenuC0231m subMenuC0231m) {
        ?? r10;
        int size;
        int i10;
        boolean z10;
        AbstractC6394d abstractC6394d;
        C0239a c0239a;
        InterfaceC0228j.a aVar;
        MenuItem item;
        boolean z11 = false;
        if (!subMenuC0231m.hasVisibleItems()) {
            return false;
        }
        SubMenuC0231m subMenuC0231m2 = subMenuC0231m;
        while (true) {
            C0224f c0224f = subMenuC0231m2.f786z;
            if (c0224f == this.f635c) {
                break;
            }
            subMenuC0231m2 = (SubMenuC0231m) c0224f;
        }
        ViewGroup viewGroup = (ViewGroup) this.f640h;
        if (viewGroup != null) {
            int childCount = viewGroup.getChildCount();
            int i11 = 0;
            while (true) {
                if (i11 < childCount) {
                    KeyEvent.Callback childAt = viewGroup.getChildAt(i11);
                    if ((childAt instanceof InterfaceC0229k.a) && ((InterfaceC0229k.a) childAt).getItemData() == subMenuC0231m2.f785A) {
                        r10 = childAt;
                        break;
                    }
                    i11++;
                }
            }
            if (r10 == 0) {
                return false;
            }
            this.f853T = subMenuC0231m.f785A.f723a;
            size = subMenuC0231m.size();
            i10 = 0;
            while (true) {
                if (i10 < size) {
                    z10 = false;
                    break;
                }
                item = subMenuC0231m.getItem(i10);
                if (!item.isVisible() && item.getIcon() != null) {
                    z10 = true;
                    break;
                }
                i10++;
            }
            C0239a c0239a2 = new C0239a(this.f634b, subMenuC0231m, r10);
            this.f849P = c0239a2;
            c0239a2.f757h = z10;
            abstractC6394d = c0239a2.f759j;
            if (abstractC6394d != null) {
                abstractC6394d.mo904q(z10);
            }
            c0239a = this.f849P;
            if (!c0239a.m951b()) {
                if (c0239a.f755f == null) {
                    c0239a.m953d(0, 0, false, false);
                }
                if (z11) {
                    throw new IllegalStateException("MenuPopupHelper cannot be used without an anchor");
                }
                aVar = this.f637e;
                if (aVar != null) {
                    aVar.mo943d(subMenuC0231m);
                }
                return true;
            }
            z11 = true;
            if (z11) {
                throw new IllegalStateException("MenuPopupHelper cannot be used without an anchor");
            }
            aVar = this.f637e;
            if (aVar != null) {
                aVar.mo943d(subMenuC0231m);
            }
            return true;
        }
        r10 = 0;
        if (r10 == 0) {
            return false;
        }
        this.f853T = subMenuC0231m.f785A.f723a;
        size = subMenuC0231m.size();
        i10 = 0;
        while (true) {
            if (i10 < size) {
                z10 = false;
                break;
            }
            item = subMenuC0231m.getItem(i10);
            if (!item.isVisible()) {
            }
            i10++;
        }
        C0239a c0239a3 = new C0239a(this.f634b, subMenuC0231m, r10);
        this.f849P = c0239a3;
        c0239a3.f757h = z10;
        abstractC6394d = c0239a3.f759j;
        if (abstractC6394d != null) {
            abstractC6394d.mo904q(z10);
        }
        c0239a = this.f849P;
        if (!c0239a.m951b()) {
            if (c0239a.f755f == null) {
                c0239a.m953d(0, 0, false, false);
            }
            if (z11) {
                throw new IllegalStateException("MenuPopupHelper cannot be used without an anchor");
            }
            aVar = this.f637e;
            if (aVar != null) {
                aVar.mo943d(subMenuC0231m);
            }
            return true;
        }
        z11 = true;
        if (z11) {
            throw new IllegalStateException("MenuPopupHelper cannot be used without an anchor");
        }
        aVar = this.f637e;
        if (aVar != null) {
            aVar.mo943d(subMenuC0231m);
        }
        return true;
    }

    @Override // androidx.appcompat.view.menu.InterfaceC0228j
    /* JADX INFO: renamed from: l */
    public final Parcelable mo901l() {
        SavedState savedState = new SavedState();
        savedState.f857a = this.f853T;
        return savedState;
    }

    /* JADX INFO: renamed from: n */
    public final boolean m981n() {
        C0224f c0224f;
        if (this.f841H && !m980j() && (c0224f = this.f635c) != null && this.f640h != null && this.f850Q == null) {
            c0224f.m925i();
            if (!c0224f.f702j.isEmpty()) {
                RunnableC0241c runnableC0241c = new RunnableC0241c(new C0243e(this.f634b, this.f635c, this.f854j));
                this.f850Q = runnableC0241c;
                ((View) this.f640h).post(runnableC0241c);
                return true;
            }
        }
        return false;
    }
}
