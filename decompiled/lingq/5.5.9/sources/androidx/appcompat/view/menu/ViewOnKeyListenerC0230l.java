package androidx.appcompat.view.menu;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Rect;
import android.os.Parcelable;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import android.widget.PopupWindow;
import android.widget.TextView;
import androidx.appcompat.widget.C0314g0;
import androidx.appcompat.widget.C0331n0;
import androidx.appcompat.widget.C0332o;
import com.linguist.R;
import java.util.WeakHashMap;
import p185j.AbstractC6394d;
import p471x2.C10029b0;
import p471x2.C10049l0;

/* JADX INFO: renamed from: androidx.appcompat.view.menu.l */
/* JADX INFO: loaded from: classes.dex */
public final class ViewOnKeyListenerC0230l extends AbstractC6394d implements PopupWindow.OnDismissListener, View.OnKeyListener {

    /* JADX INFO: renamed from: H */
    public View f763H;

    /* JADX INFO: renamed from: I */
    public View f764I;

    /* JADX INFO: renamed from: J */
    public InterfaceC0228j.a f765J;

    /* JADX INFO: renamed from: K */
    public ViewTreeObserver f766K;

    /* JADX INFO: renamed from: L */
    public boolean f767L;

    /* JADX INFO: renamed from: M */
    public boolean f768M;

    /* JADX INFO: renamed from: N */
    public int f769N;

    /* JADX INFO: renamed from: P */
    public boolean f771P;

    /* JADX INFO: renamed from: b */
    public final Context f772b;

    /* JADX INFO: renamed from: c */
    public final C0224f f773c;

    /* JADX INFO: renamed from: d */
    public final C0223e f774d;

    /* JADX INFO: renamed from: e */
    public final boolean f775e;

    /* JADX INFO: renamed from: f */
    public final int f776f;

    /* JADX INFO: renamed from: g */
    public final int f777g;

    /* JADX INFO: renamed from: h */
    public final int f778h;

    /* JADX INFO: renamed from: i */
    public final C0331n0 f779i;

    /* JADX INFO: renamed from: l */
    public PopupWindow.OnDismissListener f782l;

    /* JADX INFO: renamed from: j */
    public final a f780j = new a();

    /* JADX INFO: renamed from: k */
    public final b f781k = new b();

    /* JADX INFO: renamed from: O */
    public int f770O = 0;

    /* JADX INFO: renamed from: androidx.appcompat.view.menu.l$a */
    public class a implements ViewTreeObserver.OnGlobalLayoutListener {
        public a() {
        }

        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        public final void onGlobalLayout() {
            ViewOnKeyListenerC0230l viewOnKeyListenerC0230l = ViewOnKeyListenerC0230l.this;
            if (viewOnKeyListenerC0230l.mo893a() && !viewOnKeyListenerC0230l.f779i.f1275T) {
                View view = viewOnKeyListenerC0230l.f764I;
                if (view != null && view.isShown()) {
                    viewOnKeyListenerC0230l.f779i.mo894b();
                    return;
                }
                viewOnKeyListenerC0230l.dismiss();
            }
        }
    }

    /* JADX INFO: renamed from: androidx.appcompat.view.menu.l$b */
    public class b implements View.OnAttachStateChangeListener {
        public b() {
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public final void onViewAttachedToWindow(View view) {
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public final void onViewDetachedFromWindow(View view) {
            ViewOnKeyListenerC0230l viewOnKeyListenerC0230l = ViewOnKeyListenerC0230l.this;
            ViewTreeObserver viewTreeObserver = viewOnKeyListenerC0230l.f766K;
            if (viewTreeObserver != null) {
                if (!viewTreeObserver.isAlive()) {
                    viewOnKeyListenerC0230l.f766K = view.getViewTreeObserver();
                }
                viewOnKeyListenerC0230l.f766K.removeGlobalOnLayoutListener(viewOnKeyListenerC0230l.f780j);
            }
            view.removeOnAttachStateChangeListener(this);
        }
    }

    public ViewOnKeyListenerC0230l(int i10, int i11, Context context, View view, C0224f c0224f, boolean z10) {
        this.f772b = context;
        this.f773c = c0224f;
        this.f775e = z10;
        this.f774d = new C0223e(c0224f, LayoutInflater.from(context), z10, R.layout.abc_popup_menu_item_layout);
        this.f777g = i10;
        this.f778h = i11;
        Resources resources = context.getResources();
        this.f776f = Math.max(resources.getDisplayMetrics().widthPixels / 2, resources.getDimensionPixelSize(R.dimen.abc_config_prefDialogWidth));
        this.f763H = view;
        this.f779i = new C0331n0(context, i10, i11);
        c0224f.m918b(this, context);
    }

    @Override // p185j.InterfaceC6396f
    /* JADX INFO: renamed from: a */
    public final boolean mo893a() {
        return !this.f767L && this.f779i.mo893a();
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // p185j.InterfaceC6396f
    /* JADX INFO: renamed from: b */
    public final void mo894b() {
        View view;
        boolean z10 = true;
        if (!mo893a()) {
            if (this.f767L || (view = this.f763H) == null) {
                z10 = false;
            } else {
                this.f764I = view;
                C0331n0 c0331n0 = this.f779i;
                c0331n0.f1276U.setOnDismissListener(this);
                c0331n0.f1266K = this;
                c0331n0.f1275T = true;
                C0332o c0332o = c0331n0.f1276U;
                c0332o.setFocusable(true);
                View view2 = this.f764I;
                boolean z11 = this.f766K == null;
                ViewTreeObserver viewTreeObserver = view2.getViewTreeObserver();
                this.f766K = viewTreeObserver;
                if (z11) {
                    viewTreeObserver.addOnGlobalLayoutListener(this.f780j);
                }
                view2.addOnAttachStateChangeListener(this.f781k);
                c0331n0.f1265J = view2;
                c0331n0.f1288l = this.f770O;
                boolean z12 = this.f768M;
                Context context = this.f772b;
                C0223e c0223e = this.f774d;
                if (!z12) {
                    this.f769N = AbstractC6394d.m13025o(c0223e, context, this.f776f);
                    this.f768M = true;
                }
                c0331n0.m1243r(this.f769N);
                c0332o.setInputMethodMode(2);
                Rect rect = this.f36849a;
                c0331n0.f1274S = rect != null ? new Rect(rect) : null;
                c0331n0.mo894b();
                C0314g0 c0314g0 = c0331n0.f1279c;
                c0314g0.setOnKeyListener(this);
                if (this.f771P) {
                    C0224f c0224f = this.f773c;
                    if (c0224f.f705m != null) {
                        FrameLayout frameLayout = (FrameLayout) LayoutInflater.from(context).inflate(R.layout.abc_popup_menu_header_item_layout, (ViewGroup) c0314g0, false);
                        TextView textView = (TextView) frameLayout.findViewById(android.R.id.title);
                        if (textView != null) {
                            textView.setText(c0224f.f705m);
                        }
                        frameLayout.setEnabled(false);
                        c0314g0.addHeaderView(frameLayout, null, false);
                    }
                }
                c0331n0.mo1009p(c0223e);
                c0331n0.mo894b();
            }
        }
        if (!z10) {
            throw new IllegalStateException("StandardMenuPopup cannot be used without an anchor");
        }
    }

    @Override // androidx.appcompat.view.menu.InterfaceC0228j
    /* JADX INFO: renamed from: c */
    public final void mo895c(C0224f c0224f, boolean z10) {
        if (c0224f != this.f773c) {
            return;
        }
        dismiss();
        InterfaceC0228j.a aVar = this.f765J;
        if (aVar != null) {
            aVar.mo942c(c0224f, z10);
        }
    }

    @Override // androidx.appcompat.view.menu.InterfaceC0228j
    /* JADX INFO: renamed from: d */
    public final void mo896d(boolean z10) {
        this.f768M = false;
        C0223e c0223e = this.f774d;
        if (c0223e != null) {
            c0223e.notifyDataSetChanged();
        }
    }

    @Override // p185j.InterfaceC6396f
    public final void dismiss() {
        if (mo893a()) {
            this.f779i.dismiss();
        }
    }

    @Override // androidx.appcompat.view.menu.InterfaceC0228j
    /* JADX INFO: renamed from: e */
    public final boolean mo897e() {
        return false;
    }

    @Override // androidx.appcompat.view.menu.InterfaceC0228j
    /* JADX INFO: renamed from: f */
    public final void mo890f(InterfaceC0228j.a aVar) {
        this.f765J = aVar;
    }

    @Override // androidx.appcompat.view.menu.InterfaceC0228j
    /* JADX INFO: renamed from: i */
    public final void mo898i(Parcelable parcelable) {
    }

    @Override // p185j.InterfaceC6396f
    /* JADX INFO: renamed from: j */
    public final C0314g0 mo899j() {
        return this.f779i.f1279c;
    }

    @Override // androidx.appcompat.view.menu.InterfaceC0228j
    /* JADX INFO: renamed from: k */
    public final boolean mo900k(SubMenuC0231m subMenuC0231m) {
        boolean z10;
        if (subMenuC0231m.hasVisibleItems()) {
            C0227i c0227i = new C0227i(this.f777g, this.f778h, this.f772b, this.f764I, subMenuC0231m, this.f775e);
            InterfaceC0228j.a aVar = this.f765J;
            c0227i.f758i = aVar;
            AbstractC6394d abstractC6394d = c0227i.f759j;
            if (abstractC6394d != null) {
                abstractC6394d.mo890f(aVar);
            }
            boolean zM13026w = AbstractC6394d.m13026w(subMenuC0231m);
            c0227i.f757h = zM13026w;
            AbstractC6394d abstractC6394d2 = c0227i.f759j;
            if (abstractC6394d2 != null) {
                abstractC6394d2.mo904q(zM13026w);
            }
            c0227i.f760k = this.f782l;
            this.f782l = null;
            this.f773c.m919c(false);
            C0331n0 c0331n0 = this.f779i;
            int width = c0331n0.f1282f;
            int iM1241o = c0331n0.m1241o();
            int i10 = this.f770O;
            View view = this.f763H;
            WeakHashMap<View, C10049l0> weakHashMap = C10029b0.f50993a;
            if ((Gravity.getAbsoluteGravity(i10, C10029b0.e.m18686d(view)) & 7) == 5) {
                width += this.f763H.getWidth();
            }
            if (c0227i.m951b()) {
                z10 = true;
            } else if (c0227i.f755f == null) {
                z10 = false;
            } else {
                c0227i.m953d(width, iM1241o, true, true);
                z10 = true;
            }
            if (z10) {
                InterfaceC0228j.a aVar2 = this.f765J;
                if (aVar2 != null) {
                    aVar2.mo943d(subMenuC0231m);
                }
                return true;
            }
        }
        return false;
    }

    @Override // androidx.appcompat.view.menu.InterfaceC0228j
    /* JADX INFO: renamed from: l */
    public final Parcelable mo901l() {
        return null;
    }

    @Override // p185j.AbstractC6394d
    /* JADX INFO: renamed from: n */
    public final void mo902n(C0224f c0224f) {
    }

    @Override // android.widget.PopupWindow.OnDismissListener
    public final void onDismiss() {
        this.f767L = true;
        this.f773c.m919c(true);
        ViewTreeObserver viewTreeObserver = this.f766K;
        if (viewTreeObserver != null) {
            if (!viewTreeObserver.isAlive()) {
                this.f766K = this.f764I.getViewTreeObserver();
            }
            this.f766K.removeGlobalOnLayoutListener(this.f780j);
            this.f766K = null;
        }
        this.f764I.removeOnAttachStateChangeListener(this.f781k);
        PopupWindow.OnDismissListener onDismissListener = this.f782l;
        if (onDismissListener != null) {
            onDismissListener.onDismiss();
        }
    }

    @Override // android.view.View.OnKeyListener
    public final boolean onKey(View view, int i10, KeyEvent keyEvent) {
        if (keyEvent.getAction() != 1 || i10 != 82) {
            return false;
        }
        dismiss();
        return true;
    }

    @Override // p185j.AbstractC6394d
    /* JADX INFO: renamed from: p */
    public final void mo903p(View view) {
        this.f763H = view;
    }

    @Override // p185j.AbstractC6394d
    /* JADX INFO: renamed from: q */
    public final void mo904q(boolean z10) {
        this.f774d.f688c = z10;
    }

    @Override // p185j.AbstractC6394d
    /* JADX INFO: renamed from: r */
    public final void mo905r(int i10) {
        this.f770O = i10;
    }

    @Override // p185j.AbstractC6394d
    /* JADX INFO: renamed from: s */
    public final void mo906s(int i10) {
        this.f779i.f1282f = i10;
    }

    @Override // p185j.AbstractC6394d
    /* JADX INFO: renamed from: t */
    public final void mo907t(PopupWindow.OnDismissListener onDismissListener) {
        this.f782l = onDismissListener;
    }

    @Override // p185j.AbstractC6394d
    /* JADX INFO: renamed from: u */
    public final void mo908u(boolean z10) {
        this.f771P = z10;
    }

    @Override // p185j.AbstractC6394d
    /* JADX INFO: renamed from: v */
    public final void mo909v(int i10) {
        this.f779i.m1240l(i10);
    }
}
