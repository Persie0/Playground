package androidx.appcompat.widget;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.Window;
import androidx.appcompat.view.menu.C0224f;
import androidx.appcompat.view.menu.C0226h;
import androidx.appcompat.widget.Toolbar.C0291f;
import com.linguist.R;
import p058d.C4999a;
import p080e.LayoutInflaterFactory2C5275g;
import p104f.C5452a;
import p471x2.C10029b0;
import p471x2.C10049l0;
import p471x2.C10053n0;

/* JADX INFO: renamed from: androidx.appcompat.widget.d1 */
/* JADX INFO: loaded from: classes.dex */
public final class C0306d1 implements InterfaceC0305d0 {

    /* JADX INFO: renamed from: a */
    public final Toolbar f1148a;

    /* JADX INFO: renamed from: b */
    public int f1149b;

    /* JADX INFO: renamed from: c */
    public C0345u0 f1150c;

    /* JADX INFO: renamed from: d */
    public View f1151d;

    /* JADX INFO: renamed from: e */
    public Drawable f1152e;

    /* JADX INFO: renamed from: f */
    public Drawable f1153f;

    /* JADX INFO: renamed from: g */
    public Drawable f1154g;

    /* JADX INFO: renamed from: h */
    public boolean f1155h;

    /* JADX INFO: renamed from: i */
    public CharSequence f1156i;

    /* JADX INFO: renamed from: j */
    public CharSequence f1157j;

    /* JADX INFO: renamed from: k */
    public CharSequence f1158k;

    /* JADX INFO: renamed from: l */
    public Window.Callback f1159l;

    /* JADX INFO: renamed from: m */
    public boolean f1160m;

    /* JADX INFO: renamed from: n */
    public ActionMenuPresenter f1161n;

    /* JADX INFO: renamed from: o */
    public int f1162o;

    /* JADX INFO: renamed from: p */
    public Drawable f1163p;

    /* JADX INFO: renamed from: androidx.appcompat.widget.d1$a */
    public class a extends C10053n0 {

        /* JADX INFO: renamed from: a */
        public boolean f1164a = false;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ int f1165b;

        public a(int i10) {
            this.f1165b = i10;
        }

        @Override // p471x2.InterfaceC10051m0
        /* JADX INFO: renamed from: a */
        public final void mo1078a() {
            if (this.f1164a) {
                return;
            }
            C0306d1.this.f1148a.setVisibility(this.f1165b);
        }

        @Override // p471x2.C10053n0, p471x2.InterfaceC10051m0
        /* JADX INFO: renamed from: b */
        public final void mo1079b(View view) {
            this.f1164a = true;
        }

        @Override // p471x2.C10053n0, p471x2.InterfaceC10051m0
        /* JADX INFO: renamed from: c */
        public final void mo1080c() {
            C0306d1.this.f1148a.setVisibility(0);
        }
    }

    /* JADX WARN: Code duplicated, block: B:76:0x01ad  */
    /* JADX WARN: Code duplicated, block: B:77:0x01af  */
    /* JADX WARN: Code duplicated, block: B:79:0x01bc  */
    /* JADX WARN: Code duplicated, block: B:81:0x01c2  */
    /* JADX WARN: Code duplicated, block: B:82:0x01c4  */
    /* JADX WARN: Code duplicated, block: B:85:0x01d6  */
    /* JADX WARN: Code duplicated, block: B:87:0x01dd  */
    /* JADX WARN: Code duplicated, block: B:88:0x01e3  */
    /* JADX WARN: Code duplicated, block: B:89:0x01e9  */
    public C0306d1(Toolbar toolbar, boolean z10) {
        int i10;
        Drawable drawable;
        this.f1162o = 0;
        this.f1148a = toolbar;
        this.f1156i = toolbar.getTitle();
        this.f1157j = toolbar.getSubtitle();
        this.f1155h = this.f1156i != null;
        this.f1154g = toolbar.getNavigationIcon();
        String string = null;
        C0300b1 c0300b1M1111m = C0300b1.m1111m(toolbar.getContext(), null, C4999a.f32587a, R.attr.actionBarStyle);
        int i11 = 15;
        this.f1163p = c0300b1M1111m.m1116e(15);
        if (z10) {
            CharSequence charSequenceM1122k = c0300b1M1111m.m1122k(27);
            if (!TextUtils.isEmpty(charSequenceM1122k)) {
                setTitle(charSequenceM1122k);
            }
            CharSequence charSequenceM1122k2 = c0300b1M1111m.m1122k(25);
            if (!TextUtils.isEmpty(charSequenceM1122k2)) {
                this.f1157j = charSequenceM1122k2;
                if ((this.f1149b & 8) != 0) {
                    toolbar.setSubtitle(charSequenceM1122k2);
                }
            }
            Drawable drawableM1116e = c0300b1M1111m.m1116e(20);
            if (drawableM1116e != null) {
                this.f1153f = drawableM1116e;
                m1154u();
            }
            Drawable drawableM1116e2 = c0300b1M1111m.m1116e(17);
            if (drawableM1116e2 != null) {
                setIcon(drawableM1116e2);
            }
            if (this.f1154g == null && (drawable = this.f1163p) != null) {
                this.f1154g = drawable;
                if ((this.f1149b & 4) != 0) {
                    toolbar.setNavigationIcon(drawable);
                } else {
                    toolbar.setNavigationIcon((Drawable) null);
                }
            }
            mo1145l(c0300b1M1111m.m1119h(10, 0));
            int iM1120i = c0300b1M1111m.m1120i(9, 0);
            if (iM1120i != 0) {
                View viewInflate = LayoutInflater.from(toolbar.getContext()).inflate(iM1120i, (ViewGroup) toolbar, false);
                View view = this.f1151d;
                if (view != null && (this.f1149b & 16) != 0) {
                    toolbar.removeView(view);
                }
                this.f1151d = viewInflate;
                if (viewInflate != null && (this.f1149b & 16) != 0) {
                    toolbar.addView(viewInflate);
                }
                mo1145l(this.f1149b | 16);
            }
            int layoutDimension = c0300b1M1111m.f1134b.getLayoutDimension(13, 0);
            if (layoutDimension > 0) {
                ViewGroup.LayoutParams layoutParams = toolbar.getLayoutParams();
                layoutParams.height = layoutDimension;
                toolbar.setLayoutParams(layoutParams);
            }
            int iM1114c = c0300b1M1111m.m1114c(7, -1);
            int iM1114c2 = c0300b1M1111m.m1114c(3, -1);
            if (iM1114c >= 0 || iM1114c2 >= 0) {
                int iMax = Math.max(iM1114c, 0);
                int iMax2 = Math.max(iM1114c2, 0);
                if (toolbar.f1065O == null) {
                    toolbar.f1065O = new C0343t0();
                }
                toolbar.f1065O.m1267a(iMax, iMax2);
            }
            int iM1120i2 = c0300b1M1111m.m1120i(28, 0);
            if (iM1120i2 != 0) {
                Context context = toolbar.getContext();
                toolbar.f1096l = iM1120i2;
                AppCompatTextView appCompatTextView = toolbar.f1076b;
                if (appCompatTextView != null) {
                    appCompatTextView.setTextAppearance(context, iM1120i2);
                }
            }
            int iM1120i3 = c0300b1M1111m.m1120i(26, 0);
            if (iM1120i3 != 0) {
                Context context2 = toolbar.getContext();
                toolbar.f1058H = iM1120i3;
                AppCompatTextView appCompatTextView2 = toolbar.f1078c;
                if (appCompatTextView2 != null) {
                    appCompatTextView2.setTextAppearance(context2, iM1120i3);
                }
            }
            int iM1120i4 = c0300b1M1111m.m1120i(22, 0);
            if (iM1120i4 != 0) {
                toolbar.setPopupTheme(iM1120i4);
            }
            c0300b1M1111m.m1124n();
            if (R.string.abc_action_bar_up_description == this.f1162o) {
                this.f1162o = R.string.abc_action_bar_up_description;
                if (!TextUtils.isEmpty(toolbar.getNavigationContentDescription())) {
                    i10 = this.f1162o;
                    if (i10 == 0) {
                        string = mo1138e().getString(i10);
                    }
                    this.f1158k = string;
                    if ((this.f1149b & 4) == 0) {
                        if (TextUtils.isEmpty(string)) {
                            toolbar.setNavigationContentDescription(this.f1162o);
                        } else {
                            toolbar.setNavigationContentDescription(this.f1158k);
                        }
                    }
                }
            }
            this.f1158k = toolbar.getNavigationContentDescription();
            toolbar.setNavigationOnClickListener(new ViewOnClickListenerC0303c1(this));
        }
        if (toolbar.getNavigationIcon() != null) {
            this.f1163p = toolbar.getNavigationIcon();
        } else {
            i11 = 11;
        }
        this.f1149b = i11;
        c0300b1M1111m.m1124n();
        if (R.string.abc_action_bar_up_description == this.f1162o) {
            this.f1162o = R.string.abc_action_bar_up_description;
            if (!TextUtils.isEmpty(toolbar.getNavigationContentDescription())) {
                i10 = this.f1162o;
                if (i10 == 0) {
                    string = mo1138e().getString(i10);
                }
                this.f1158k = string;
                if ((this.f1149b & 4) == 0) {
                    if (TextUtils.isEmpty(string)) {
                        toolbar.setNavigationContentDescription(this.f1162o);
                    } else {
                        toolbar.setNavigationContentDescription(this.f1158k);
                    }
                }
            }
        }
        this.f1158k = toolbar.getNavigationContentDescription();
        toolbar.setNavigationOnClickListener(new ViewOnClickListenerC0303c1(this));
    }

    @Override // androidx.appcompat.widget.InterfaceC0305d0
    /* JADX INFO: renamed from: a */
    public final boolean mo1134a() {
        ActionMenuView actionMenuView = this.f1148a.f1074a;
        if (actionMenuView == null) {
            return false;
        }
        ActionMenuPresenter actionMenuPresenter = actionMenuView.f870O;
        return actionMenuPresenter != null && actionMenuPresenter.m980j();
    }

    @Override // androidx.appcompat.widget.InterfaceC0305d0
    /* JADX INFO: renamed from: b */
    public final void mo1135b() {
        this.f1160m = true;
    }

    @Override // androidx.appcompat.widget.InterfaceC0305d0
    /* JADX INFO: renamed from: c */
    public final void mo1136c(C0224f c0224f, LayoutInflaterFactory2C5275g.c cVar) {
        ActionMenuPresenter actionMenuPresenter = this.f1161n;
        Toolbar toolbar = this.f1148a;
        if (actionMenuPresenter == null) {
            ActionMenuPresenter actionMenuPresenter2 = new ActionMenuPresenter(toolbar.getContext());
            this.f1161n = actionMenuPresenter2;
            actionMenuPresenter2.f641i = R.id.action_menu_presenter;
        }
        ActionMenuPresenter actionMenuPresenter3 = this.f1161n;
        actionMenuPresenter3.f637e = cVar;
        if (c0224f == null && toolbar.f1074a == null) {
            return;
        }
        toolbar.m1056e();
        C0224f c0224f2 = toolbar.f1074a.f866K;
        if (c0224f2 == c0224f) {
            return;
        }
        if (c0224f2 != null) {
            c0224f2.m934r(toolbar.f1093j0);
            c0224f2.m934r(toolbar.f1095k0);
        }
        if (toolbar.f1095k0 == null) {
            toolbar.f1095k0 = toolbar.new C0291f();
        }
        actionMenuPresenter3.f846M = true;
        if (c0224f != null) {
            c0224f.m918b(actionMenuPresenter3, toolbar.f1092j);
            c0224f.m918b(toolbar.f1095k0, toolbar.f1092j);
        } else {
            actionMenuPresenter3.mo913h(toolbar.f1092j, null);
            toolbar.f1095k0.mo913h(toolbar.f1092j, null);
            actionMenuPresenter3.mo896d(true);
            toolbar.f1095k0.mo896d(true);
        }
        toolbar.f1074a.setPopupTheme(toolbar.f1094k);
        toolbar.f1074a.setPresenter(actionMenuPresenter3);
        toolbar.f1093j0 = actionMenuPresenter3;
        toolbar.m1067s();
    }

    @Override // androidx.appcompat.widget.InterfaceC0305d0
    public final void collapseActionView() {
        Toolbar.C0291f c0291f = this.f1148a.f1095k0;
        C0226h c0226h = c0291f == null ? null : c0291f.f1111b;
        if (c0226h != null) {
            c0226h.collapseActionView();
        }
    }

    @Override // androidx.appcompat.widget.InterfaceC0305d0
    /* JADX INFO: renamed from: d */
    public final boolean mo1137d() {
        ActionMenuView actionMenuView;
        Toolbar toolbar = this.f1148a;
        return toolbar.getVisibility() == 0 && (actionMenuView = toolbar.f1074a) != null && actionMenuView.f869N;
    }

    @Override // androidx.appcompat.widget.InterfaceC0305d0
    /* JADX INFO: renamed from: e */
    public final Context mo1138e() {
        return this.f1148a.getContext();
    }

    /* JADX WARN: Code duplicated, block: B:16:0x0026  */
    @Override // androidx.appcompat.widget.InterfaceC0305d0
    /* JADX INFO: renamed from: f */
    public final boolean mo1139f() {
        boolean z10;
        ActionMenuView actionMenuView = this.f1148a.f1074a;
        boolean z11 = false;
        if (actionMenuView != null) {
            ActionMenuPresenter actionMenuPresenter = actionMenuView.f870O;
            if (actionMenuPresenter == null) {
                z10 = false;
            } else {
                if (actionMenuPresenter.f850Q != null || actionMenuPresenter.m980j()) {
                    z10 = true;
                } else {
                    z10 = false;
                }
            }
            if (z10) {
                z11 = true;
            }
        }
        return z11;
    }

    @Override // androidx.appcompat.widget.InterfaceC0305d0
    /* JADX INFO: renamed from: g */
    public final boolean mo1140g() {
        ActionMenuView actionMenuView = this.f1148a.f1074a;
        if (actionMenuView == null) {
            return false;
        }
        ActionMenuPresenter actionMenuPresenter = actionMenuView.f870O;
        return actionMenuPresenter != null && actionMenuPresenter.m979b();
    }

    @Override // androidx.appcompat.widget.InterfaceC0305d0
    public final CharSequence getTitle() {
        return this.f1148a.getTitle();
    }

    @Override // androidx.appcompat.widget.InterfaceC0305d0
    /* JADX INFO: renamed from: h */
    public final boolean mo1141h() {
        ActionMenuView actionMenuView = this.f1148a.f1074a;
        if (actionMenuView == null) {
            return false;
        }
        ActionMenuPresenter actionMenuPresenter = actionMenuView.f870O;
        return actionMenuPresenter != null && actionMenuPresenter.m981n();
    }

    @Override // androidx.appcompat.widget.InterfaceC0305d0
    /* JADX INFO: renamed from: i */
    public final void mo1142i() {
        ActionMenuPresenter actionMenuPresenter;
        ActionMenuView actionMenuView = this.f1148a.f1074a;
        if (actionMenuView == null || (actionMenuPresenter = actionMenuView.f870O) == null) {
            return;
        }
        actionMenuPresenter.m979b();
        ActionMenuPresenter.C0239a c0239a = actionMenuPresenter.f849P;
        if (c0239a == null || !c0239a.m951b()) {
            return;
        }
        c0239a.f759j.dismiss();
    }

    @Override // androidx.appcompat.widget.InterfaceC0305d0
    /* JADX INFO: renamed from: j */
    public final void mo1143j() {
    }

    @Override // androidx.appcompat.widget.InterfaceC0305d0
    /* JADX INFO: renamed from: k */
    public final boolean mo1144k() {
        Toolbar.C0291f c0291f = this.f1148a.f1095k0;
        return (c0291f == null || c0291f.f1111b == null) ? false : true;
    }

    @Override // androidx.appcompat.widget.InterfaceC0305d0
    /* JADX INFO: renamed from: l */
    public final void mo1145l(int i10) {
        View view;
        int i11 = this.f1149b ^ i10;
        this.f1149b = i10;
        if (i11 != 0) {
            int i12 = i11 & 4;
            Toolbar toolbar = this.f1148a;
            if (i12 != 0) {
                if ((i10 & 4) != 0 && (i10 & 4) != 0) {
                    if (TextUtils.isEmpty(this.f1158k)) {
                        toolbar.setNavigationContentDescription(this.f1162o);
                    } else {
                        toolbar.setNavigationContentDescription(this.f1158k);
                    }
                }
                if ((this.f1149b & 4) != 0) {
                    Drawable drawable = this.f1154g;
                    if (drawable == null) {
                        drawable = this.f1163p;
                    }
                    toolbar.setNavigationIcon(drawable);
                } else {
                    toolbar.setNavigationIcon((Drawable) null);
                }
            }
            if ((i11 & 3) != 0) {
                m1154u();
            }
            if ((i11 & 8) != 0) {
                if ((i10 & 8) != 0) {
                    toolbar.setTitle(this.f1156i);
                    toolbar.setSubtitle(this.f1157j);
                } else {
                    toolbar.setTitle((CharSequence) null);
                    toolbar.setSubtitle((CharSequence) null);
                }
            }
            if ((i11 & 16) != 0 && (view = this.f1151d) != null) {
                if ((i10 & 16) != 0) {
                    toolbar.addView(view);
                    return;
                }
                toolbar.removeView(view);
            }
        }
    }

    @Override // androidx.appcompat.widget.InterfaceC0305d0
    /* JADX INFO: renamed from: m */
    public final void mo1146m() {
        C0345u0 c0345u0 = this.f1150c;
        if (c0345u0 != null) {
            ViewParent parent = c0345u0.getParent();
            Toolbar toolbar = this.f1148a;
            if (parent == toolbar) {
                toolbar.removeView(this.f1150c);
            }
        }
        this.f1150c = null;
    }

    @Override // androidx.appcompat.widget.InterfaceC0305d0
    /* JADX INFO: renamed from: n */
    public final void mo1147n(int i10) {
        this.f1153f = i10 != 0 ? C5452a.m11672a(mo1138e(), i10) : null;
        m1154u();
    }

    @Override // androidx.appcompat.widget.InterfaceC0305d0
    /* JADX INFO: renamed from: o */
    public final void mo1148o() {
    }

    @Override // androidx.appcompat.widget.InterfaceC0305d0
    /* JADX INFO: renamed from: p */
    public final C10049l0 mo1149p(int i10, long j10) {
        C10049l0 c10049l0M18645a = C10029b0.m18645a(this.f1148a);
        c10049l0M18645a.m18835a(i10 == 0 ? 1.0f : 0.0f);
        c10049l0M18645a.m18837c(j10);
        c10049l0M18645a.m18838d(new a(i10));
        return c10049l0M18645a;
    }

    @Override // androidx.appcompat.widget.InterfaceC0305d0
    /* JADX INFO: renamed from: q */
    public final int mo1150q() {
        return this.f1149b;
    }

    @Override // androidx.appcompat.widget.InterfaceC0305d0
    /* JADX INFO: renamed from: r */
    public final void mo1151r() {
        Log.i("ToolbarWidgetWrapper", "Progress display unsupported");
    }

    @Override // androidx.appcompat.widget.InterfaceC0305d0
    /* JADX INFO: renamed from: s */
    public final void mo1152s() {
        Log.i("ToolbarWidgetWrapper", "Progress display unsupported");
    }

    @Override // androidx.appcompat.widget.InterfaceC0305d0
    public final void setIcon(int i10) {
        setIcon(i10 != 0 ? C5452a.m11672a(mo1138e(), i10) : null);
    }

    @Override // androidx.appcompat.widget.InterfaceC0305d0
    public final void setIcon(Drawable drawable) {
        this.f1152e = drawable;
        m1154u();
    }

    @Override // androidx.appcompat.widget.InterfaceC0305d0
    public final void setTitle(CharSequence charSequence) {
        this.f1155h = true;
        this.f1156i = charSequence;
        if ((this.f1149b & 8) != 0) {
            Toolbar toolbar = this.f1148a;
            toolbar.setTitle(charSequence);
            if (this.f1155h) {
                C10029b0.m18659o(toolbar.getRootView(), charSequence);
            }
        }
    }

    @Override // androidx.appcompat.widget.InterfaceC0305d0
    public final void setVisibility(int i10) {
        this.f1148a.setVisibility(i10);
    }

    @Override // androidx.appcompat.widget.InterfaceC0305d0
    public final void setWindowCallback(Window.Callback callback) {
        this.f1159l = callback;
    }

    @Override // androidx.appcompat.widget.InterfaceC0305d0
    public final void setWindowTitle(CharSequence charSequence) {
        if (this.f1155h) {
            return;
        }
        this.f1156i = charSequence;
        if ((this.f1149b & 8) != 0) {
            Toolbar toolbar = this.f1148a;
            toolbar.setTitle(charSequence);
            if (this.f1155h) {
                C10029b0.m18659o(toolbar.getRootView(), charSequence);
            }
        }
    }

    @Override // androidx.appcompat.widget.InterfaceC0305d0
    /* JADX INFO: renamed from: t */
    public final void mo1153t(boolean z10) {
        this.f1148a.setCollapsible(z10);
    }

    /* JADX INFO: renamed from: u */
    public final void m1154u() {
        Drawable drawable;
        int i10 = this.f1149b;
        if ((i10 & 2) == 0) {
            drawable = null;
        } else if ((i10 & 1) == 0 || (drawable = this.f1153f) == null) {
            drawable = this.f1152e;
        }
        this.f1148a.setLogo(drawable);
    }
}
