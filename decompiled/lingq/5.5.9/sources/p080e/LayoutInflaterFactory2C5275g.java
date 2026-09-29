package p080e;

import android.R;
import android.app.Activity;
import android.app.Dialog;
import android.app.UiModeManager;
import android.content.BroadcastReceiver;
import android.content.ComponentName;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.location.Location;
import android.location.LocationManager;
import android.media.AudioManager;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.LocaleList;
import android.os.PowerManager;
import android.support.v4.media.session.C0166e;
import android.text.TextUtils;
import android.util.AndroidRuntimeException;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import android.view.ActionMode;
import android.view.ContextThemeWrapper;
import android.view.KeyCharacterMap;
import android.view.KeyEvent;
import android.view.KeyboardShortcutGroup;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.Window;
import android.view.WindowManager;
import android.widget.FrameLayout;
import android.widget.ListAdapter;
import android.widget.PopupWindow;
import android.widget.TextView;
import android.window.OnBackInvokedCallback;
import android.window.OnBackInvokedDispatcher;
import androidx.activity.C0196o;
import androidx.activity.C0197p;
import androidx.activity.RunnableC0183b;
import androidx.appcompat.app.ActivityC0216c;
import androidx.appcompat.view.menu.C0222d;
import androidx.appcompat.view.menu.C0222d.a;
import androidx.appcompat.view.menu.C0224f;
import androidx.appcompat.view.menu.ExpandedMenuView;
import androidx.appcompat.view.menu.InterfaceC0228j;
import androidx.appcompat.widget.ActionBarContextView;
import androidx.appcompat.widget.AppCompatCheckBox;
import androidx.appcompat.widget.AppCompatEditText;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatSpinner;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.appcompat.widget.C0299b0;
import androidx.appcompat.widget.C0301c;
import androidx.appcompat.widget.C0307e;
import androidx.appcompat.widget.C0310f;
import androidx.appcompat.widget.C0315g1;
import androidx.appcompat.widget.C0318h1;
import androidx.appcompat.widget.C0319i;
import androidx.appcompat.widget.C0326l;
import androidx.appcompat.widget.C0330n;
import androidx.appcompat.widget.C0336q;
import androidx.appcompat.widget.C0338r;
import androidx.appcompat.widget.C0339r0;
import androidx.appcompat.widget.C0342t;
import androidx.appcompat.widget.ContentFrameLayout;
import androidx.appcompat.widget.InterfaceC0302c0;
import androidx.appcompat.widget.ViewStubCompat;
import androidx.datastore.preferences.PreferencesProto$Value;
import androidx.view.InterfaceC1051q;
import androidx.view.Lifecycle;
import com.android.installreferrer.api.InstallReferrerClient;
import com.google.android.material.appbar.MaterialToolbar;
import com.kochava.tracker.BuildConfig;
import java.lang.ref.WeakReference;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Calendar;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Locale;
import java.util.Objects;
import java.util.WeakHashMap;
import p024b3.C1303j;
import p058d.C4999a;
import p104f.C5452a;
import p164i.AbstractC6100a;
import p164i.C6102c;
import p164i.C6103d;
import p164i.C6104e;
import p164i.C6105f;
import p164i.WindowCallbackC6107h;
import p232l2.C7222a;
import p232l2.C7232k;
import p286o2.C7909i;
import p286o2.C7910j;
import p326q.AbstractC8451g;
import p326q.C8449e;
import p326q.C8452h;
import p338qd.C8573r0;
import p389t2.C9182a;
import p389t2.C9188g;
import p389t2.C9190i;
import p389t2.InterfaceC9189h;
import p471x2.C10027a0;
import p471x2.C10029b0;
import p471x2.C10038g;
import p471x2.C10049l0;
import p471x2.C10053n0;
import p471x2.C10070x;

/* JADX INFO: renamed from: e.g */
/* JADX INFO: loaded from: classes.dex */
public final class LayoutInflaterFactory2C5275g extends AbstractC5274f implements C0224f.a, LayoutInflater.Factory2 {

    /* JADX INFO: renamed from: D0 */
    public static final C8452h<String, Integer> f33377D0 = new C8452h<>();

    /* JADX INFO: renamed from: E0 */
    public static final int[] f33378E0 = {R.attr.windowBackground};

    /* JADX INFO: renamed from: F0 */
    public static final boolean f33379F0 = !"robolectric".equals(Build.FINGERPRINT);

    /* JADX INFO: renamed from: G0 */
    public static final boolean f33380G0 = true;

    /* JADX INFO: renamed from: A0 */
    public C5284p f33381A0;

    /* JADX INFO: renamed from: B0 */
    public OnBackInvokedDispatcher f33382B0;

    /* JADX INFO: renamed from: C0 */
    public OnBackInvokedCallback f33383C0;

    /* JADX INFO: renamed from: H */
    public g f33384H;

    /* JADX INFO: renamed from: I */
    public final InterfaceC5272d f33385I;

    /* JADX INFO: renamed from: J */
    public AbstractC5269a f33386J;

    /* JADX INFO: renamed from: K */
    public C6105f f33387K;

    /* JADX INFO: renamed from: L */
    public CharSequence f33388L;

    /* JADX INFO: renamed from: M */
    public InterfaceC0302c0 f33389M;

    /* JADX INFO: renamed from: N */
    public c f33390N;

    /* JADX INFO: renamed from: O */
    public m f33391O;

    /* JADX INFO: renamed from: P */
    public AbstractC6100a f33392P;

    /* JADX INFO: renamed from: Q */
    public ActionBarContextView f33393Q;

    /* JADX INFO: renamed from: R */
    public PopupWindow f33394R;

    /* JADX INFO: renamed from: S */
    public RunnableC5278j f33395S;

    /* JADX INFO: renamed from: V */
    public boolean f33398V;

    /* JADX INFO: renamed from: W */
    public ViewGroup f33399W;

    /* JADX INFO: renamed from: X */
    public TextView f33400X;

    /* JADX INFO: renamed from: Y */
    public View f33401Y;

    /* JADX INFO: renamed from: Z */
    public boolean f33402Z;

    /* JADX INFO: renamed from: a0 */
    public boolean f33403a0;

    /* JADX INFO: renamed from: b0 */
    public boolean f33404b0;

    /* JADX INFO: renamed from: c0 */
    public boolean f33405c0;

    /* JADX INFO: renamed from: d0 */
    public boolean f33406d0;

    /* JADX INFO: renamed from: e0 */
    public boolean f33407e0;

    /* JADX INFO: renamed from: f0 */
    public boolean f33408f0;

    /* JADX INFO: renamed from: g0 */
    public boolean f33409g0;

    /* JADX INFO: renamed from: h0 */
    public l[] f33410h0;

    /* JADX INFO: renamed from: i0 */
    public l f33411i0;

    /* JADX INFO: renamed from: j */
    public final Object f33412j;

    /* JADX INFO: renamed from: j0 */
    public boolean f33413j0;

    /* JADX INFO: renamed from: k */
    public final Context f33414k;

    /* JADX INFO: renamed from: k0 */
    public boolean f33415k0;

    /* JADX INFO: renamed from: l */
    public Window f33416l;

    /* JADX INFO: renamed from: l0 */
    public boolean f33417l0;

    /* JADX INFO: renamed from: m0 */
    public boolean f33418m0;

    /* JADX INFO: renamed from: n0 */
    public Configuration f33419n0;

    /* JADX INFO: renamed from: o0 */
    public int f33420o0;

    /* JADX INFO: renamed from: p0 */
    public int f33421p0;

    /* JADX INFO: renamed from: q0 */
    public int f33422q0;

    /* JADX INFO: renamed from: r0 */
    public boolean f33423r0;

    /* JADX INFO: renamed from: s0 */
    public j f33424s0;

    /* JADX INFO: renamed from: t0 */
    public h f33425t0;

    /* JADX INFO: renamed from: u0 */
    public boolean f33426u0;

    /* JADX INFO: renamed from: v0 */
    public int f33427v0;

    /* JADX INFO: renamed from: x0 */
    public boolean f33429x0;

    /* JADX INFO: renamed from: y0 */
    public Rect f33430y0;

    /* JADX INFO: renamed from: z0 */
    public Rect f33431z0;

    /* JADX INFO: renamed from: T */
    public C10049l0 f33396T = null;

    /* JADX INFO: renamed from: U */
    public final boolean f33397U = true;

    /* JADX INFO: renamed from: w0 */
    public final a f33428w0 = new a();

    /* JADX INFO: renamed from: e.g$a */
    public class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            LayoutInflaterFactory2C5275g layoutInflaterFactory2C5275g = LayoutInflaterFactory2C5275g.this;
            if ((layoutInflaterFactory2C5275g.f33427v0 & 1) != 0) {
                layoutInflaterFactory2C5275g.m11362J(0);
            }
            if ((layoutInflaterFactory2C5275g.f33427v0 & 4096) != 0) {
                layoutInflaterFactory2C5275g.m11362J(108);
            }
            layoutInflaterFactory2C5275g.f33426u0 = false;
            layoutInflaterFactory2C5275g.f33427v0 = 0;
        }
    }

    /* JADX INFO: renamed from: e.g$b */
    public interface b {
    }

    /* JADX INFO: renamed from: e.g$c */
    public final class c implements InterfaceC0228j.a {
        public c() {
        }

        @Override // androidx.appcompat.view.menu.InterfaceC0228j.a
        /* JADX INFO: renamed from: c */
        public final void mo942c(C0224f c0224f, boolean z10) {
            LayoutInflaterFactory2C5275g.this.m11359F(c0224f);
        }

        @Override // androidx.appcompat.view.menu.InterfaceC0228j.a
        /* JADX INFO: renamed from: d */
        public final boolean mo943d(C0224f c0224f) {
            Window.Callback callbackM11367O = LayoutInflaterFactory2C5275g.this.m11367O();
            if (callbackM11367O != null) {
                callbackM11367O.onMenuOpened(108, c0224f);
            }
            return true;
        }
    }

    /* JADX INFO: renamed from: e.g$d */
    public class d implements AbstractC6100a.a {

        /* JADX INFO: renamed from: a */
        public final AbstractC6100a.a f33434a;

        /* JADX INFO: renamed from: e.g$d$a */
        public class a extends C10053n0 {
            public a() {
            }

            @Override // p471x2.InterfaceC10051m0
            /* JADX INFO: renamed from: a */
            public final void mo1078a() {
                d dVar = d.this;
                LayoutInflaterFactory2C5275g.this.f33393Q.setVisibility(8);
                LayoutInflaterFactory2C5275g layoutInflaterFactory2C5275g = LayoutInflaterFactory2C5275g.this;
                PopupWindow popupWindow = layoutInflaterFactory2C5275g.f33394R;
                if (popupWindow != null) {
                    popupWindow.dismiss();
                } else if (layoutInflaterFactory2C5275g.f33393Q.getParent() instanceof View) {
                    View view = (View) layoutInflaterFactory2C5275g.f33393Q.getParent();
                    WeakHashMap<View, C10049l0> weakHashMap = C10029b0.f50993a;
                    C10029b0.h.m18706c(view);
                }
                layoutInflaterFactory2C5275g.f33393Q.m958h();
                layoutInflaterFactory2C5275g.f33396T.m18838d(null);
                layoutInflaterFactory2C5275g.f33396T = null;
                ViewGroup viewGroup = layoutInflaterFactory2C5275g.f33399W;
                WeakHashMap<View, C10049l0> weakHashMap2 = C10029b0.f50993a;
                C10029b0.h.m18706c(viewGroup);
            }
        }

        public d(C6104e.a aVar) {
            this.f33434a = aVar;
        }

        @Override // p164i.AbstractC6100a.a
        /* JADX INFO: renamed from: a */
        public final boolean mo11376a(AbstractC6100a abstractC6100a, MenuItem menuItem) {
            return this.f33434a.mo11376a(abstractC6100a, menuItem);
        }

        @Override // p164i.AbstractC6100a.a
        /* JADX INFO: renamed from: b */
        public final void mo11377b(AbstractC6100a abstractC6100a) {
            this.f33434a.mo11377b(abstractC6100a);
            LayoutInflaterFactory2C5275g layoutInflaterFactory2C5275g = LayoutInflaterFactory2C5275g.this;
            if (layoutInflaterFactory2C5275g.f33394R != null) {
                layoutInflaterFactory2C5275g.f33416l.getDecorView().removeCallbacks(layoutInflaterFactory2C5275g.f33395S);
            }
            if (layoutInflaterFactory2C5275g.f33393Q != null) {
                C10049l0 c10049l0 = layoutInflaterFactory2C5275g.f33396T;
                if (c10049l0 != null) {
                    c10049l0.m18836b();
                }
                C10049l0 c10049l0M18645a = C10029b0.m18645a(layoutInflaterFactory2C5275g.f33393Q);
                c10049l0M18645a.m18835a(0.0f);
                layoutInflaterFactory2C5275g.f33396T = c10049l0M18645a;
                c10049l0M18645a.m18838d(new a());
            }
            InterfaceC5272d interfaceC5272d = layoutInflaterFactory2C5275g.f33385I;
            if (interfaceC5272d != null) {
                interfaceC5272d.mo881x();
            }
            layoutInflaterFactory2C5275g.f33392P = null;
            ViewGroup viewGroup = layoutInflaterFactory2C5275g.f33399W;
            WeakHashMap<View, C10049l0> weakHashMap = C10029b0.f50993a;
            C10029b0.h.m18706c(viewGroup);
            layoutInflaterFactory2C5275g.m11375W();
        }

        @Override // p164i.AbstractC6100a.a
        /* JADX INFO: renamed from: c */
        public final boolean mo11378c(AbstractC6100a abstractC6100a, C0224f c0224f) {
            ViewGroup viewGroup = LayoutInflaterFactory2C5275g.this.f33399W;
            WeakHashMap<View, C10049l0> weakHashMap = C10029b0.f50993a;
            C10029b0.h.m18706c(viewGroup);
            return this.f33434a.mo11378c(abstractC6100a, c0224f);
        }

        @Override // p164i.AbstractC6100a.a
        /* JADX INFO: renamed from: d */
        public final boolean mo11379d(AbstractC6100a abstractC6100a, C0224f c0224f) {
            return this.f33434a.mo11379d(abstractC6100a, c0224f);
        }
    }

    /* JADX INFO: renamed from: e.g$e */
    public static class e {
        /* JADX INFO: renamed from: a */
        public static void m11380a(Configuration configuration, Configuration configuration2, Configuration configuration3) {
            LocaleList locales = configuration.getLocales();
            LocaleList locales2 = configuration2.getLocales();
            if (locales.equals(locales2)) {
                return;
            }
            configuration3.setLocales(locales2);
            configuration3.locale = configuration2.locale;
        }

        /* JADX INFO: renamed from: b */
        public static C9188g m11381b(Configuration configuration) {
            return C9188g.m17523a(configuration.getLocales().toLanguageTags());
        }

        /* JADX INFO: renamed from: c */
        public static void m11382c(C9188g c9188g) {
            LocaleList.setDefault(LocaleList.forLanguageTags(c9188g.f47728a.mo17529a()));
        }

        /* JADX INFO: renamed from: d */
        public static void m11383d(Configuration configuration, C9188g c9188g) {
            configuration.setLocales(LocaleList.forLanguageTags(c9188g.f47728a.mo17529a()));
        }
    }

    /* JADX INFO: renamed from: e.g$f */
    public static class f {
        /* JADX INFO: renamed from: a */
        public static OnBackInvokedDispatcher m11384a(Activity activity) {
            return activity.getOnBackInvokedDispatcher();
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [android.window.OnBackInvokedCallback, e.l] */
        /* JADX INFO: renamed from: b */
        public static OnBackInvokedCallback m11385b(Object obj, final LayoutInflaterFactory2C5275g layoutInflaterFactory2C5275g) {
            Objects.requireNonNull(layoutInflaterFactory2C5275g);
            ?? r10 = new OnBackInvokedCallback() { // from class: e.l
                @Override // android.window.OnBackInvokedCallback
                public final void onBackInvoked() {
                    layoutInflaterFactory2C5275g.m11370R();
                }
            };
            C0196o.m827d(obj).registerOnBackInvokedCallback(1000000, r10);
            return r10;
        }

        /* JADX INFO: renamed from: c */
        public static void m11386c(Object obj, Object obj2) {
            C0196o.m827d(obj).unregisterOnBackInvokedCallback(C0197p.m836e(obj2));
        }
    }

    /* JADX INFO: renamed from: e.g$g */
    public class g extends WindowCallbackC6107h {

        /* JADX INFO: renamed from: b */
        public b f33437b;

        /* JADX INFO: renamed from: c */
        public boolean f33438c;

        /* JADX INFO: renamed from: d */
        public boolean f33439d;

        /* JADX INFO: renamed from: e */
        public boolean f33440e;

        public g(Window.Callback callback) {
            super(callback);
        }

        /* JADX INFO: renamed from: a */
        public final void m11387a(Window.Callback callback) {
            try {
                this.f33438c = true;
                callback.onContentChanged();
                this.f33438c = false;
            } catch (Throwable th2) {
                this.f33438c = false;
                throw th2;
            }
        }

        @Override // p164i.WindowCallbackC6107h, android.view.Window.Callback
        public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
            if (this.f33439d) {
                return this.f35919a.dispatchKeyEvent(keyEvent);
            }
            if (!LayoutInflaterFactory2C5275g.this.m11361I(keyEvent) && !super.dispatchKeyEvent(keyEvent)) {
                return false;
            }
            return true;
        }

        @Override // p164i.WindowCallbackC6107h, android.view.Window.Callback
        public final boolean dispatchKeyShortcutEvent(KeyEvent keyEvent) {
            boolean z10;
            if (super.dispatchKeyShortcutEvent(keyEvent)) {
                return true;
            }
            int keyCode = keyEvent.getKeyCode();
            LayoutInflaterFactory2C5275g layoutInflaterFactory2C5275g = LayoutInflaterFactory2C5275g.this;
            layoutInflaterFactory2C5275g.m11368P();
            AbstractC5269a abstractC5269a = layoutInflaterFactory2C5275g.f33386J;
            if (abstractC5269a == null || !abstractC5269a.mo11317i(keyCode, keyEvent)) {
                l lVar = layoutInflaterFactory2C5275g.f33411i0;
                if (lVar == null || !layoutInflaterFactory2C5275g.m11372T(lVar, keyEvent.getKeyCode(), keyEvent)) {
                    if (layoutInflaterFactory2C5275g.f33411i0 == null) {
                        l lVarM11366N = layoutInflaterFactory2C5275g.m11366N(0);
                        layoutInflaterFactory2C5275g.m11373U(lVarM11366N, keyEvent);
                        boolean zM11372T = layoutInflaterFactory2C5275g.m11372T(lVarM11366N, keyEvent.getKeyCode(), keyEvent);
                        lVarM11366N.f33460k = false;
                        if (zM11372T) {
                        }
                    }
                    z10 = false;
                } else {
                    l lVar2 = layoutInflaterFactory2C5275g.f33411i0;
                    if (lVar2 != null) {
                        lVar2.f33461l = true;
                    }
                    z10 = true;
                }
                z10 = true;
            } else {
                z10 = true;
            }
            return z10;
        }

        @Override // android.view.Window.Callback
        public final void onContentChanged() {
            if (this.f33438c) {
                this.f35919a.onContentChanged();
            }
        }

        @Override // p164i.WindowCallbackC6107h, android.view.Window.Callback
        public final boolean onCreatePanelMenu(int i10, Menu menu) {
            if (i10 != 0 || (menu instanceof C0224f)) {
                return super.onCreatePanelMenu(i10, menu);
            }
            return false;
        }

        @Override // p164i.WindowCallbackC6107h, android.view.Window.Callback
        public final View onCreatePanelView(int i10) {
            b bVar = this.f33437b;
            if (bVar != null) {
                View view = i10 == 0 ? new View(C5289u.this.f33504a.mo1138e()) : null;
                if (view != null) {
                    return view;
                }
            }
            return super.onCreatePanelView(i10);
        }

        @Override // p164i.WindowCallbackC6107h, android.view.Window.Callback
        public final boolean onMenuOpened(int i10, Menu menu) {
            super.onMenuOpened(i10, menu);
            LayoutInflaterFactory2C5275g layoutInflaterFactory2C5275g = LayoutInflaterFactory2C5275g.this;
            if (i10 == 108) {
                layoutInflaterFactory2C5275g.m11368P();
                AbstractC5269a abstractC5269a = layoutInflaterFactory2C5275g.f33386J;
                if (abstractC5269a != null) {
                    abstractC5269a.mo11311c(true);
                }
            } else {
                layoutInflaterFactory2C5275g.getClass();
            }
            return true;
        }

        @Override // p164i.WindowCallbackC6107h, android.view.Window.Callback
        public final void onPanelClosed(int i10, Menu menu) {
            if (this.f33440e) {
                this.f35919a.onPanelClosed(i10, menu);
                return;
            }
            super.onPanelClosed(i10, menu);
            LayoutInflaterFactory2C5275g layoutInflaterFactory2C5275g = LayoutInflaterFactory2C5275g.this;
            if (i10 == 108) {
                layoutInflaterFactory2C5275g.m11368P();
                AbstractC5269a abstractC5269a = layoutInflaterFactory2C5275g.f33386J;
                if (abstractC5269a != null) {
                    abstractC5269a.mo11311c(false);
                    return;
                }
                return;
            }
            if (i10 != 0) {
                layoutInflaterFactory2C5275g.getClass();
                return;
            }
            l lVarM11366N = layoutInflaterFactory2C5275g.m11366N(i10);
            if (lVarM11366N.f33462m) {
                layoutInflaterFactory2C5275g.m11360G(lVarM11366N, false);
            }
        }

        @Override // p164i.WindowCallbackC6107h, android.view.Window.Callback
        public final boolean onPreparePanel(int i10, View view, Menu menu) {
            C0224f c0224f = menu instanceof C0224f ? (C0224f) menu : null;
            if (i10 == 0 && c0224f == null) {
                return false;
            }
            if (c0224f != null) {
                c0224f.f716x = true;
            }
            b bVar = this.f33437b;
            if (bVar != null) {
                C5289u.e eVar = (C5289u.e) bVar;
                if (i10 == 0) {
                    C5289u c5289u = C5289u.this;
                    if (!c5289u.f33507d) {
                        c5289u.f33504a.f1160m = true;
                        c5289u.f33507d = true;
                    }
                }
            }
            boolean zOnPreparePanel = super.onPreparePanel(i10, view, menu);
            if (c0224f != null) {
                c0224f.f716x = false;
            }
            return zOnPreparePanel;
        }

        @Override // p164i.WindowCallbackC6107h, android.view.Window.Callback
        public final void onProvideKeyboardShortcuts(List<KeyboardShortcutGroup> list, Menu menu, int i10) {
            C0224f c0224f = LayoutInflaterFactory2C5275g.this.m11366N(0).f33457h;
            if (c0224f != null) {
                super.onProvideKeyboardShortcuts(list, c0224f, i10);
            } else {
                super.onProvideKeyboardShortcuts(list, menu, i10);
            }
        }

        @Override // android.view.Window.Callback
        public final ActionMode onWindowStartingActionMode(ActionMode.Callback callback) {
            return null;
        }

        /* JADX WARN: Code duplicated, block: B:61:0x017e  */
        /* JADX WARN: Type inference fix 'apply assigned field type' failed
        java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
        	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
        	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
        	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
         */
        @Override // p164i.WindowCallbackC6107h, android.view.Window.Callback
        public final ActionMode onWindowStartingActionMode(ActionMode.Callback callback, int i10) {
            ViewGroup viewGroup;
            LayoutInflaterFactory2C5275g layoutInflaterFactory2C5275g = LayoutInflaterFactory2C5275g.this;
            if (!layoutInflaterFactory2C5275g.f33397U || i10 != 0) {
                return super.onWindowStartingActionMode(callback, i10);
            }
            C6104e.a aVar = new C6104e.a(layoutInflaterFactory2C5275g.f33414k, callback);
            AbstractC6100a abstractC6100a = layoutInflaterFactory2C5275g.f33392P;
            if (abstractC6100a != null) {
                abstractC6100a.mo11416c();
            }
            d dVar = layoutInflaterFactory2C5275g.new d(aVar);
            layoutInflaterFactory2C5275g.m11368P();
            AbstractC5269a abstractC5269a = layoutInflaterFactory2C5275g.f33386J;
            InterfaceC5272d interfaceC5272d = layoutInflaterFactory2C5275g.f33385I;
            if (abstractC5269a != null) {
                AbstractC6100a abstractC6100aMo11324p = abstractC5269a.mo11324p(dVar);
                layoutInflaterFactory2C5275g.f33392P = abstractC6100aMo11324p;
                if (abstractC6100aMo11324p != null && interfaceC5272d != null) {
                    interfaceC5272d.mo877C();
                }
            }
            C6104e c6104eM12602e = null;
            if (layoutInflaterFactory2C5275g.f33392P == null) {
                C10049l0 c10049l0 = layoutInflaterFactory2C5275g.f33396T;
                if (c10049l0 != null) {
                    c10049l0.m18836b();
                }
                AbstractC6100a abstractC6100a2 = layoutInflaterFactory2C5275g.f33392P;
                if (abstractC6100a2 != null) {
                    abstractC6100a2.mo11416c();
                }
                if (interfaceC5272d != null && !layoutInflaterFactory2C5275g.f33418m0) {
                    try {
                        interfaceC5272d.mo880o();
                    } catch (AbstractMethodError unused) {
                    }
                }
                boolean z10 = true;
                if (layoutInflaterFactory2C5275g.f33393Q == null) {
                    boolean z11 = layoutInflaterFactory2C5275g.f33407e0;
                    Context context = layoutInflaterFactory2C5275g.f33414k;
                    if (z11) {
                        TypedValue typedValue = new TypedValue();
                        Resources.Theme theme = context.getTheme();
                        theme.resolveAttribute(com.linguist.R.attr.actionBarTheme, typedValue, true);
                        if (typedValue.resourceId != 0) {
                            Resources.Theme themeNewTheme = context.getResources().newTheme();
                            themeNewTheme.setTo(theme);
                            themeNewTheme.applyStyle(typedValue.resourceId, true);
                            C6102c c6102c = new C6102c(context, 0);
                            c6102c.getTheme().setTo(themeNewTheme);
                            context = c6102c;
                        }
                        layoutInflaterFactory2C5275g.f33393Q = new ActionBarContextView(context, null);
                        PopupWindow popupWindow = new PopupWindow(context, (AttributeSet) null, com.linguist.R.attr.actionModePopupWindowStyle);
                        layoutInflaterFactory2C5275g.f33394R = popupWindow;
                        C1303j.m4825d(popupWindow, 2);
                        layoutInflaterFactory2C5275g.f33394R.setContentView(layoutInflaterFactory2C5275g.f33393Q);
                        layoutInflaterFactory2C5275g.f33394R.setWidth(-1);
                        context.getTheme().resolveAttribute(com.linguist.R.attr.actionBarSize, typedValue, true);
                        layoutInflaterFactory2C5275g.f33393Q.setContentHeight(TypedValue.complexToDimensionPixelSize(typedValue.data, context.getResources().getDisplayMetrics()));
                        layoutInflaterFactory2C5275g.f33394R.setHeight(-2);
                        layoutInflaterFactory2C5275g.f33395S = new RunnableC5278j(layoutInflaterFactory2C5275g);
                    } else {
                        ViewStubCompat viewStubCompat = (ViewStubCompat) layoutInflaterFactory2C5275g.f33399W.findViewById(com.linguist.R.id.action_mode_bar_stub);
                        if (viewStubCompat != null) {
                            layoutInflaterFactory2C5275g.m11368P();
                            AbstractC5269a abstractC5269a2 = layoutInflaterFactory2C5275g.f33386J;
                            Context contextMo11313e = abstractC5269a2 != null ? abstractC5269a2.mo11313e() : null;
                            if (contextMo11313e != null) {
                                context = contextMo11313e;
                            }
                            viewStubCompat.setLayoutInflater(LayoutInflater.from(context));
                            layoutInflaterFactory2C5275g.f33393Q = (ActionBarContextView) viewStubCompat.m1072a();
                        }
                    }
                }
                if (layoutInflaterFactory2C5275g.f33393Q != null) {
                    C10049l0 c10049l1 = layoutInflaterFactory2C5275g.f33396T;
                    if (c10049l1 != null) {
                        c10049l1.m18836b();
                    }
                    layoutInflaterFactory2C5275g.f33393Q.m958h();
                    C6103d c6103d = new C6103d(layoutInflaterFactory2C5275g.f33393Q.getContext(), layoutInflaterFactory2C5275g.f33393Q, dVar);
                    if (dVar.mo11379d(c6103d, c6103d.f35863h)) {
                        c6103d.mo11422i();
                        layoutInflaterFactory2C5275g.f33393Q.m956f(c6103d);
                        layoutInflaterFactory2C5275g.f33392P = c6103d;
                        if (!layoutInflaterFactory2C5275g.f33398V || (viewGroup = layoutInflaterFactory2C5275g.f33399W) == null) {
                            z10 = false;
                        } else {
                            WeakHashMap<View, C10049l0> weakHashMap = C10029b0.f50993a;
                            if (!C10029b0.g.m18699c(viewGroup)) {
                                z10 = false;
                            }
                        }
                        if (z10) {
                            layoutInflaterFactory2C5275g.f33393Q.setAlpha(0.0f);
                            C10049l0 c10049l0M18645a = C10029b0.m18645a(layoutInflaterFactory2C5275g.f33393Q);
                            c10049l0M18645a.m18835a(1.0f);
                            layoutInflaterFactory2C5275g.f33396T = c10049l0M18645a;
                            c10049l0M18645a.m18838d(new C5279k(layoutInflaterFactory2C5275g));
                        } else {
                            layoutInflaterFactory2C5275g.f33393Q.setAlpha(1.0f);
                            layoutInflaterFactory2C5275g.f33393Q.setVisibility(0);
                            if (layoutInflaterFactory2C5275g.f33393Q.getParent() instanceof View) {
                                View view = (View) layoutInflaterFactory2C5275g.f33393Q.getParent();
                                WeakHashMap<View, C10049l0> weakHashMap2 = C10029b0.f50993a;
                                C10029b0.h.m18706c(view);
                            }
                        }
                        if (layoutInflaterFactory2C5275g.f33394R != null) {
                            layoutInflaterFactory2C5275g.f33416l.getDecorView().post(layoutInflaterFactory2C5275g.f33395S);
                        }
                    } else {
                        layoutInflaterFactory2C5275g.f33392P = null;
                    }
                }
                if (layoutInflaterFactory2C5275g.f33392P != null && interfaceC5272d != null) {
                    interfaceC5272d.mo877C();
                }
                layoutInflaterFactory2C5275g.m11375W();
                layoutInflaterFactory2C5275g.f33392P = layoutInflaterFactory2C5275g.f33392P;
            }
            layoutInflaterFactory2C5275g.m11375W();
            AbstractC6100a abstractC6100a3 = layoutInflaterFactory2C5275g.f33392P;
            if (abstractC6100a3 != null) {
                c6104eM12602e = aVar.m12602e(abstractC6100a3);
            }
            return c6104eM12602e;
        }
    }

    /* JADX INFO: renamed from: e.g$h */
    public class h extends i {

        /* JADX INFO: renamed from: c */
        public final PowerManager f33442c;

        public h(Context context) {
            super();
            this.f33442c = (PowerManager) context.getApplicationContext().getSystemService("power");
        }

        @Override // p080e.LayoutInflaterFactory2C5275g.i
        /* JADX INFO: renamed from: b */
        public final IntentFilter mo11388b() {
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addAction("android.os.action.POWER_SAVE_MODE_CHANGED");
            return intentFilter;
        }

        @Override // p080e.LayoutInflaterFactory2C5275g.i
        /* JADX INFO: renamed from: c */
        public final int mo11389c() {
            return this.f33442c.isPowerSaveMode() ? 2 : 1;
        }

        @Override // p080e.LayoutInflaterFactory2C5275g.i
        /* JADX INFO: renamed from: d */
        public final void mo11390d() {
            LayoutInflaterFactory2C5275g.this.m11356B(true, true);
        }
    }

    /* JADX INFO: renamed from: e.g$i */
    public abstract class i {

        /* JADX INFO: renamed from: a */
        public a f33444a;

        /* JADX INFO: renamed from: e.g$i$a */
        public class a extends BroadcastReceiver {
            public a() {
            }

            @Override // android.content.BroadcastReceiver
            public final void onReceive(Context context, Intent intent) {
                i.this.mo11390d();
            }
        }

        public i() {
        }

        /* JADX INFO: renamed from: a */
        public final void m11391a() {
            a aVar = this.f33444a;
            if (aVar != null) {
                try {
                    LayoutInflaterFactory2C5275g.this.f33414k.unregisterReceiver(aVar);
                } catch (IllegalArgumentException unused) {
                }
                this.f33444a = null;
            }
        }

        /* JADX INFO: renamed from: b */
        public abstract IntentFilter mo11388b();

        /* JADX INFO: renamed from: c */
        public abstract int mo11389c();

        /* JADX INFO: renamed from: d */
        public abstract void mo11390d();

        /* JADX INFO: renamed from: e */
        public final void m11392e() {
            m11391a();
            IntentFilter intentFilterMo11388b = mo11388b();
            if (intentFilterMo11388b != null) {
                if (intentFilterMo11388b.countActions() == 0) {
                    return;
                }
                if (this.f33444a == null) {
                    this.f33444a = new a();
                }
                LayoutInflaterFactory2C5275g.this.f33414k.registerReceiver(this.f33444a, intentFilterMo11388b);
            }
        }
    }

    /* JADX INFO: renamed from: e.g$j */
    public class j extends i {

        /* JADX INFO: renamed from: c */
        public final C5291w f33447c;

        public j(C5291w c5291w) {
            super();
            this.f33447c = c5291w;
        }

        @Override // p080e.LayoutInflaterFactory2C5275g.i
        /* JADX INFO: renamed from: b */
        public final IntentFilter mo11388b() {
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addAction("android.intent.action.TIME_SET");
            intentFilter.addAction("android.intent.action.TIMEZONE_CHANGED");
            intentFilter.addAction("android.intent.action.TIME_TICK");
            return intentFilter;
        }

        @Override // p080e.LayoutInflaterFactory2C5275g.i
        /* JADX INFO: renamed from: c */
        public final int mo11389c() {
            Location location;
            boolean z10;
            long j10;
            long j11;
            Location lastKnownLocation;
            C5291w c5291w = this.f33447c;
            C5291w.a aVar = c5291w.f33525c;
            boolean z11 = false;
            if (aVar.f33527b > System.currentTimeMillis()) {
                z10 = aVar.f33526a;
            } else {
                Context context = c5291w.f33523a;
                int iM16691P = C8573r0.m16691P(context, "android.permission.ACCESS_COARSE_LOCATION");
                Location lastKnownLocation2 = null;
                LocationManager locationManager = c5291w.f33524b;
                if (iM16691P == 0) {
                    try {
                        lastKnownLocation = locationManager.isProviderEnabled("network") ? locationManager.getLastKnownLocation("network") : null;
                    } catch (Exception e10) {
                        Log.d("TwilightManager", "Failed to get last known location", e10);
                    }
                    location = lastKnownLocation;
                } else {
                    location = null;
                }
                if (C8573r0.m16691P(context, "android.permission.ACCESS_FINE_LOCATION") == 0) {
                    try {
                        if (locationManager.isProviderEnabled("gps")) {
                            lastKnownLocation2 = locationManager.getLastKnownLocation("gps");
                        }
                    } catch (Exception e11) {
                        Log.d("TwilightManager", "Failed to get last known location", e11);
                    }
                }
                if (lastKnownLocation2 == null || location == null ? lastKnownLocation2 != null : lastKnownLocation2.getTime() > location.getTime()) {
                    location = lastKnownLocation2;
                }
                if (location != null) {
                    long jCurrentTimeMillis = System.currentTimeMillis();
                    if (C5290v.f33518d == null) {
                        C5290v.f33518d = new C5290v();
                    }
                    C5290v c5290v = C5290v.f33518d;
                    c5290v.m11411a(location.getLatitude(), location.getLongitude(), jCurrentTimeMillis - 86400000);
                    c5290v.m11411a(location.getLatitude(), location.getLongitude(), jCurrentTimeMillis);
                    z11 = c5290v.f33521c == 1;
                    long j12 = c5290v.f33520b;
                    long j13 = c5290v.f33519a;
                    c5290v.m11411a(location.getLatitude(), location.getLongitude(), 86400000 + jCurrentTimeMillis);
                    long j14 = c5290v.f33520b;
                    if (j12 == -1 || j13 == -1) {
                        j10 = 43200000 + jCurrentTimeMillis;
                    } else {
                        if (jCurrentTimeMillis > j13) {
                            j11 = j14 + 0;
                        } else {
                            j11 = jCurrentTimeMillis > j12 ? j13 + 0 : j12 + 0;
                        }
                        j10 = j11 + 60000;
                    }
                    aVar.f33526a = z11;
                    aVar.f33527b = j10;
                } else {
                    Log.i("TwilightManager", "Could not get last known location. This is probably because the app does not have any location permissions. Falling back to hardcoded sunrise/sunset values.");
                    int i10 = Calendar.getInstance().get(11);
                    if (i10 < 6 || i10 >= 22) {
                        z11 = true;
                    }
                }
                z10 = z11;
            }
            return z10 ? 2 : 1;
        }

        @Override // p080e.LayoutInflaterFactory2C5275g.i
        /* JADX INFO: renamed from: d */
        public final void mo11390d() {
            LayoutInflaterFactory2C5275g.this.m11356B(true, true);
        }
    }

    /* JADX INFO: renamed from: e.g$k */
    public class k extends ContentFrameLayout {
        public k(C6102c c6102c) {
            super(c6102c, null);
        }

        @Override // android.view.ViewGroup, android.view.View
        public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
            if (!LayoutInflaterFactory2C5275g.this.m11361I(keyEvent) && !super.dispatchKeyEvent(keyEvent)) {
                return false;
            }
            return true;
        }

        /* JADX WARN: Code duplicated, block: B:17:0x0036  */
        @Override // android.view.ViewGroup
        public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
            boolean z10;
            if (motionEvent.getAction() == 0) {
                int x10 = (int) motionEvent.getX();
                int y10 = (int) motionEvent.getY();
                if (x10 >= -5 && y10 >= -5 && x10 <= getWidth() + 5) {
                    if (y10 <= getHeight() + 5) {
                        z10 = false;
                    }
                    if (z10) {
                        LayoutInflaterFactory2C5275g layoutInflaterFactory2C5275g = LayoutInflaterFactory2C5275g.this;
                        layoutInflaterFactory2C5275g.m11360G(layoutInflaterFactory2C5275g.m11366N(0), true);
                        return true;
                    }
                }
                z10 = true;
                if (z10) {
                    LayoutInflaterFactory2C5275g layoutInflaterFactory2C5275g2 = LayoutInflaterFactory2C5275g.this;
                    layoutInflaterFactory2C5275g2.m11360G(layoutInflaterFactory2C5275g2.m11366N(0), true);
                    return true;
                }
            }
            return super.onInterceptTouchEvent(motionEvent);
        }

        @Override // android.view.View
        public final void setBackgroundResource(int i10) {
            setBackgroundDrawable(C5452a.m11672a(getContext(), i10));
        }
    }

    /* JADX INFO: renamed from: e.g$l */
    public static final class l {

        /* JADX INFO: renamed from: a */
        public final int f33450a;

        /* JADX INFO: renamed from: b */
        public int f33451b;

        /* JADX INFO: renamed from: c */
        public int f33452c;

        /* JADX INFO: renamed from: d */
        public int f33453d;

        /* JADX INFO: renamed from: e */
        public k f33454e;

        /* JADX INFO: renamed from: f */
        public View f33455f;

        /* JADX INFO: renamed from: g */
        public View f33456g;

        /* JADX INFO: renamed from: h */
        public C0224f f33457h;

        /* JADX INFO: renamed from: i */
        public C0222d f33458i;

        /* JADX INFO: renamed from: j */
        public C6102c f33459j;

        /* JADX INFO: renamed from: k */
        public boolean f33460k;

        /* JADX INFO: renamed from: l */
        public boolean f33461l;

        /* JADX INFO: renamed from: m */
        public boolean f33462m;

        /* JADX INFO: renamed from: n */
        public boolean f33463n = false;

        /* JADX INFO: renamed from: o */
        public boolean f33464o;

        /* JADX INFO: renamed from: p */
        public Bundle f33465p;

        public l(int i10) {
            this.f33450a = i10;
        }
    }

    /* JADX INFO: renamed from: e.g$m */
    public final class m implements InterfaceC0228j.a {
        public m() {
        }

        @Override // androidx.appcompat.view.menu.InterfaceC0228j.a
        /* JADX INFO: renamed from: c */
        public final void mo942c(C0224f c0224f, boolean z10) {
            l lVar;
            C0224f c0224fMo927k = c0224f.mo927k();
            int i10 = 0;
            boolean z11 = c0224fMo927k != c0224f;
            if (z11) {
                c0224f = c0224fMo927k;
            }
            LayoutInflaterFactory2C5275g layoutInflaterFactory2C5275g = LayoutInflaterFactory2C5275g.this;
            l[] lVarArr = layoutInflaterFactory2C5275g.f33410h0;
            int length = lVarArr != null ? lVarArr.length : 0;
            while (true) {
                if (i10 < length) {
                    lVar = lVarArr[i10];
                    if (lVar != null && lVar.f33457h == c0224f) {
                        break;
                    } else {
                        i10++;
                    }
                } else {
                    lVar = null;
                    break;
                }
            }
            if (lVar != null) {
                if (!z11) {
                    layoutInflaterFactory2C5275g.m11360G(lVar, z10);
                } else {
                    layoutInflaterFactory2C5275g.m11358E(lVar.f33450a, lVar, c0224fMo927k);
                    layoutInflaterFactory2C5275g.m11360G(lVar, true);
                }
            }
        }

        @Override // androidx.appcompat.view.menu.InterfaceC0228j.a
        /* JADX INFO: renamed from: d */
        public final boolean mo943d(C0224f c0224f) {
            Window.Callback callbackM11367O;
            if (c0224f == c0224f.mo927k()) {
                LayoutInflaterFactory2C5275g layoutInflaterFactory2C5275g = LayoutInflaterFactory2C5275g.this;
                if (layoutInflaterFactory2C5275g.f33404b0 && (callbackM11367O = layoutInflaterFactory2C5275g.m11367O()) != null && !layoutInflaterFactory2C5275g.f33418m0) {
                    callbackM11367O.onMenuOpened(108, c0224f);
                }
            }
            return true;
        }
    }

    public LayoutInflaterFactory2C5275g(Context context, Window window, InterfaceC5272d interfaceC5272d, Object obj) {
        C8452h<String, Integer> c8452h;
        Integer orDefault;
        ActivityC0216c activityC0216c;
        this.f33420o0 = -100;
        this.f33414k = context;
        this.f33385I = interfaceC5272d;
        this.f33412j = obj;
        if (obj instanceof Dialog) {
            while (true) {
                if (context != null) {
                    if (context instanceof ActivityC0216c) {
                        activityC0216c = (ActivityC0216c) context;
                        break;
                    } else if (context instanceof ContextWrapper) {
                        context = ((ContextWrapper) context).getBaseContext();
                    }
                }
                activityC0216c = null;
                break;
            }
            if (activityC0216c != null) {
                this.f33420o0 = activityC0216c.m879M().mo11333g();
            }
        }
        if (this.f33420o0 == -100 && (orDefault = (c8452h = f33377D0).getOrDefault(this.f33412j.getClass().getName(), null)) != null) {
            this.f33420o0 = orDefault.intValue();
            c8452h.remove(this.f33412j.getClass().getName());
        }
        if (window != null) {
            m11357C(window);
        }
        C0319i.m1203d();
    }

    /* JADX INFO: renamed from: D */
    public static C9188g m11354D(Context context) {
        C9188g c9188g;
        C9188g c9188g2;
        if (Build.VERSION.SDK_INT < 33 && (c9188g = AbstractC5274f.f33370c) != null) {
            C9188g c9188gM11381b = e.m11381b(context.getApplicationContext().getResources().getConfiguration());
            InterfaceC9189h interfaceC9189h = c9188g.f47728a;
            if (interfaceC9189h.isEmpty()) {
                c9188g2 = C9188g.f47727b;
            } else {
                LinkedHashSet linkedHashSet = new LinkedHashSet();
                int i10 = 0;
                while (i10 < c9188gM11381b.f47728a.size() + interfaceC9189h.size()) {
                    Locale locale = i10 < interfaceC9189h.size() ? interfaceC9189h.get(i10) : c9188gM11381b.f47728a.get(i10 - interfaceC9189h.size());
                    if (locale != null) {
                        linkedHashSet.add(locale);
                    }
                    i10++;
                }
                c9188g2 = new C9188g(new C9190i(C9188g.b.m17526a((Locale[]) linkedHashSet.toArray(new Locale[linkedHashSet.size()]))));
            }
            return c9188g2.f47728a.isEmpty() ? c9188gM11381b : c9188g2;
        }
        return null;
    }

    /* JADX INFO: renamed from: H */
    public static Configuration m11355H(Context context, int i10, C9188g c9188g, Configuration configuration, boolean z10) {
        int i11;
        if (i10 == 1) {
            i11 = 16;
        } else if (i10 != 2) {
            i11 = z10 ? 0 : context.getApplicationContext().getResources().getConfiguration().uiMode & 48;
        } else {
            i11 = 32;
        }
        Configuration configuration2 = new Configuration();
        configuration2.fontScale = 0.0f;
        if (configuration != null) {
            configuration2.setTo(configuration);
        }
        configuration2.uiMode = i11 | (configuration2.uiMode & (-49));
        if (c9188g != null) {
            e.m11383d(configuration2, c9188g);
        }
        return configuration2;
    }

    @Override // p080e.AbstractC5274f
    /* JADX INFO: renamed from: A */
    public final void mo11328A(CharSequence charSequence) {
        this.f33388L = charSequence;
        InterfaceC0302c0 interfaceC0302c0 = this.f33389M;
        if (interfaceC0302c0 != null) {
            interfaceC0302c0.setWindowTitle(charSequence);
            return;
        }
        AbstractC5269a abstractC5269a = this.f33386J;
        if (abstractC5269a != null) {
            abstractC5269a.mo11323o(charSequence);
            return;
        }
        TextView textView = this.f33400X;
        if (textView != null) {
            textView.setText(charSequence);
        }
    }

    /* JADX WARN: Code duplicated, block: B:102:0x01ab  */
    /* JADX WARN: Code duplicated, block: B:105:0x01b7  */
    /* JADX WARN: Code duplicated, block: B:111:0x01d6  */
    /* JADX WARN: Code duplicated, block: B:112:0x01e0  */
    /* JADX WARN: Code duplicated, block: B:114:0x01e4  */
    /* JADX WARN: Code duplicated, block: B:118:0x01ed  */
    /* JADX WARN: Code duplicated, block: B:120:0x01f2  */
    /* JADX WARN: Code duplicated, block: B:122:0x0204  */
    /* JADX WARN: Code duplicated, block: B:124:0x0209  */
    /* JADX WARN: Code duplicated, block: B:33:0x008d  */
    /* JADX WARN: Code duplicated, block: B:69:0x0117  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: B */
    public final boolean m11356B(boolean z10, boolean z11) {
        int i10;
        boolean z12;
        j jVar;
        h hVar;
        if (this.f33418m0) {
            return false;
        }
        int i11 = this.f33420o0;
        if (i11 == -100) {
            i11 = AbstractC5274f.f33369b;
        }
        Context context = this.f33414k;
        int iM11369Q = m11369Q(i11, context);
        int i12 = Build.VERSION.SDK_INT;
        C9188g c9188gM11354D = i12 < 33 ? m11354D(context) : null;
        if (!z11 && c9188gM11354D != null) {
            c9188gM11354D = e.m11381b(context.getResources().getConfiguration());
        }
        Configuration configurationM11355H = m11355H(context, iM11369Q, c9188gM11354D, null, false);
        boolean z13 = this.f33423r0;
        boolean z14 = true;
        Object obj = this.f33412j;
        if (z13 || !(obj instanceof Activity)) {
            this.f33423r0 = true;
            i10 = this.f33422q0;
        } else {
            PackageManager packageManager = context.getPackageManager();
            if (packageManager == null) {
                i10 = 0;
            } else {
                try {
                    ActivityInfo activityInfo = packageManager.getActivityInfo(new ComponentName(context, obj.getClass()), i12 >= 29 ? 269221888 : 786432);
                    if (activityInfo != null) {
                        this.f33422q0 = activityInfo.configChanges;
                    }
                } catch (PackageManager.NameNotFoundException e10) {
                    Log.d("AppCompatDelegate", "Exception while getting ActivityInfo", e10);
                    this.f33422q0 = 0;
                }
                this.f33423r0 = true;
                i10 = this.f33422q0;
            }
        }
        Configuration configuration = this.f33419n0;
        if (configuration == null) {
            configuration = context.getResources().getConfiguration();
        }
        int i13 = configuration.uiMode & 48;
        int i14 = configurationM11355H.uiMode & 48;
        C9188g c9188gM11381b = e.m11381b(configuration);
        C9188g c9188gM11381b2 = c9188gM11354D == null ? null : e.m11381b(configurationM11355H);
        int i15 = i13 != i14 ? 512 : 0;
        if (c9188gM11381b2 != null && !c9188gM11381b.equals(c9188gM11381b2)) {
            i15 = i15 | 4 | 8192;
        }
        if (((~i10) & i15) == 0 || !z10 || !this.f33415k0 || (!f33379F0 && !this.f33417l0)) {
            z12 = false;
        } else if (obj instanceof Activity) {
            Activity activity = (Activity) obj;
            if (activity.isChild()) {
                z12 = false;
            } else {
                int i16 = C7222a.f40604c;
                if (Build.VERSION.SDK_INT >= 28) {
                    activity.recreate();
                } else {
                    new Handler(activity.getMainLooper()).post(new RunnableC0183b(2, activity));
                }
                z12 = true;
            }
        } else {
            z12 = false;
        }
        if (!z12 && i15 != 0) {
            boolean z15 = (i15 & i10) == i15;
            Resources resources = context.getResources();
            Configuration configuration2 = new Configuration(resources.getConfiguration());
            configuration2.uiMode = (resources.getConfiguration().uiMode & (-49)) | i14;
            if (c9188gM11381b2 != null) {
                e.m11383d(configuration2, c9188gM11381b2);
            }
            resources.updateConfiguration(configuration2, null);
            int i17 = this.f33421p0;
            if (i17 != 0) {
                context.setTheme(i17);
                context.getTheme().applyStyle(this.f33421p0, true);
            }
            if (z15 && (obj instanceof Activity)) {
                Activity activity2 = (Activity) obj;
                if (activity2 instanceof InterfaceC1051q) {
                    if (((InterfaceC1051q) activity2).mo786G().f6681d.isAtLeast(Lifecycle.State.CREATED)) {
                        activity2.onConfigurationChanged(configuration2);
                    }
                } else if (this.f33417l0 && !this.f33418m0) {
                    activity2.onConfigurationChanged(configuration2);
                }
            }
            if (z14 && (obj instanceof ActivityC0216c)) {
                if ((i15 & 512) != 0) {
                    ((ActivityC0216c) obj).getClass();
                }
                if ((i15 & 4) != 0) {
                    ((ActivityC0216c) obj).getClass();
                }
            }
            if (z14 && c9188gM11381b2 != null) {
                e.m11382c(e.m11381b(context.getResources().getConfiguration()));
            }
            if (i11 == 0) {
                m11365M(context).m11392e();
            } else {
                jVar = this.f33424s0;
                if (jVar != null) {
                    jVar.m11391a();
                }
            }
            if (i11 == 3) {
                if (this.f33425t0 == null) {
                    this.f33425t0 = new h(context);
                }
                this.f33425t0.m11392e();
            } else {
                hVar = this.f33425t0;
                if (hVar != null) {
                    hVar.m11391a();
                }
            }
            return z14;
        }
        z14 = z12;
        if (z14) {
            if ((i15 & 512) != 0) {
                ((ActivityC0216c) obj).getClass();
            }
            if ((i15 & 4) != 0) {
                ((ActivityC0216c) obj).getClass();
            }
        }
        if (z14) {
            e.m11382c(e.m11381b(context.getResources().getConfiguration()));
        }
        if (i11 == 0) {
            m11365M(context).m11392e();
        } else {
            jVar = this.f33424s0;
            if (jVar != null) {
                jVar.m11391a();
            }
        }
        if (i11 == 3) {
            if (this.f33425t0 == null) {
                this.f33425t0 = new h(context);
            }
            this.f33425t0.m11392e();
        } else {
            hVar = this.f33425t0;
            if (hVar != null) {
                hVar.m11391a();
            }
        }
        return z14;
    }

    /* JADX WARN: Code duplicated, block: B:35:0x0090  */
    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    /* JADX INFO: renamed from: C */
    public final void m11357C(Window window) {
        Drawable drawableM1262f;
        OnBackInvokedDispatcher onBackInvokedDispatcher;
        OnBackInvokedCallback onBackInvokedCallback;
        int resourceId;
        if (this.f33416l != null) {
            throw new IllegalStateException("AppCompat has already installed itself into the Window");
        }
        Window.Callback callback = window.getCallback();
        if (callback instanceof g) {
            throw new IllegalStateException("AppCompat has already installed itself into the Window");
        }
        g gVar = new g(callback);
        this.f33384H = gVar;
        window.setCallback(gVar);
        Context context = this.f33414k;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes((AttributeSet) null, f33378E0);
        if (!typedArrayObtainStyledAttributes.hasValue(0) || (resourceId = typedArrayObtainStyledAttributes.getResourceId(0, 0)) == 0) {
            drawableM1262f = null;
        } else {
            C0319i c0319iM1201a = C0319i.m1201a();
            synchronized (c0319iM1201a) {
                try {
                    drawableM1262f = c0319iM1201a.f1219a.m1262f(context, resourceId, true);
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        if (drawableM1262f != null) {
            window.setBackgroundDrawable(drawableM1262f);
        }
        typedArrayObtainStyledAttributes.recycle();
        this.f33416l = window;
        if (Build.VERSION.SDK_INT < 33 || (onBackInvokedDispatcher = this.f33382B0) != null) {
            return;
        }
        if (onBackInvokedDispatcher != null && (onBackInvokedCallback = this.f33383C0) != null) {
            f.m11386c(onBackInvokedDispatcher, onBackInvokedCallback);
            this.f33383C0 = null;
        }
        Object obj = this.f33412j;
        if (obj instanceof Activity) {
            Activity activity = (Activity) obj;
            if (activity.getWindow() != null) {
                this.f33382B0 = f.m11384a(activity);
            } else {
                this.f33382B0 = null;
            }
        } else {
            this.f33382B0 = null;
        }
        m11375W();
    }

    /* JADX INFO: renamed from: E */
    public final void m11358E(int i10, l lVar, C0224f c0224f) {
        if (c0224f == null) {
            if (lVar == null && i10 >= 0) {
                l[] lVarArr = this.f33410h0;
                if (i10 < lVarArr.length) {
                    lVar = lVarArr[i10];
                }
            }
            if (lVar != null) {
                c0224f = lVar.f33457h;
            }
        }
        if ((lVar == null || lVar.f33462m) && !this.f33418m0) {
            g gVar = this.f33384H;
            Window.Callback callback = this.f33416l.getCallback();
            gVar.getClass();
            try {
                gVar.f33440e = true;
                callback.onPanelClosed(i10, c0224f);
                gVar.f33440e = false;
            } catch (Throwable th2) {
                gVar.f33440e = false;
                throw th2;
            }
        }
    }

    /* JADX INFO: renamed from: F */
    public final void m11359F(C0224f c0224f) {
        if (this.f33409g0) {
            return;
        }
        this.f33409g0 = true;
        this.f33389M.mo969j();
        Window.Callback callbackM11367O = m11367O();
        if (callbackM11367O != null && !this.f33418m0) {
            callbackM11367O.onPanelClosed(108, c0224f);
        }
        this.f33409g0 = false;
    }

    /* JADX INFO: renamed from: G */
    public final void m11360G(l lVar, boolean z10) {
        k kVar;
        InterfaceC0302c0 interfaceC0302c0;
        if (z10 && lVar.f33450a == 0 && (interfaceC0302c0 = this.f33389M) != null && interfaceC0302c0.mo960a()) {
            m11359F(lVar.f33457h);
            return;
        }
        WindowManager windowManager = (WindowManager) this.f33414k.getSystemService("window");
        if (windowManager != null && lVar.f33462m && (kVar = lVar.f33454e) != null) {
            windowManager.removeView(kVar);
            if (z10) {
                m11358E(lVar.f33450a, lVar, null);
            }
        }
        lVar.f33460k = false;
        lVar.f33461l = false;
        lVar.f33462m = false;
        lVar.f33455f = null;
        lVar.f33463n = true;
        if (this.f33411i0 == lVar) {
            this.f33411i0 = null;
        }
        if (lVar.f33450a == 0) {
            m11375W();
        }
    }

    /* JADX WARN: Code duplicated, block: B:78:0x010a  */
    /* JADX INFO: renamed from: I */
    public final boolean m11361I(KeyEvent keyEvent) {
        View decorView;
        boolean zMo966g;
        boolean zM11373U;
        Object obj = this.f33412j;
        boolean z10 = true;
        if (((obj instanceof C10038g.a) || (obj instanceof DialogC5282n)) && (decorView = this.f33416l.getDecorView()) != null && C10038g.m18802a(decorView, keyEvent)) {
            return true;
        }
        if (keyEvent.getKeyCode() == 82) {
            g gVar = this.f33384H;
            Window.Callback callback = this.f33416l.getCallback();
            gVar.getClass();
            try {
                gVar.f33439d = true;
                boolean zDispatchKeyEvent = callback.dispatchKeyEvent(keyEvent);
                gVar.f33439d = false;
                if (zDispatchKeyEvent) {
                    return true;
                }
            } catch (Throwable th2) {
                gVar.f33439d = false;
                throw th2;
            }
        }
        int keyCode = keyEvent.getKeyCode();
        if (keyEvent.getAction() == 0) {
            if (keyCode == 4) {
                if ((keyEvent.getFlags() & BuildConfig.SDK_TRUNCATE_LENGTH) == 0) {
                    z10 = false;
                }
                this.f33413j0 = z10;
            } else if (keyCode == 82) {
                if (keyEvent.getRepeatCount() != 0) {
                    return true;
                }
                l lVarM11366N = m11366N(0);
                if (lVarM11366N.f33462m) {
                    return true;
                }
                m11373U(lVarM11366N, keyEvent);
                return true;
            }
        } else if (keyCode != 4) {
            if (keyCode == 82) {
                if (this.f33392P != null) {
                    return true;
                }
                l lVarM11366N2 = m11366N(0);
                InterfaceC0302c0 interfaceC0302c0 = this.f33389M;
                Context context = this.f33414k;
                if (interfaceC0302c0 == null || !interfaceC0302c0.mo963d() || ViewConfiguration.get(context).hasPermanentMenuKey()) {
                    boolean z11 = lVarM11366N2.f33462m;
                    if (z11 || lVarM11366N2.f33461l) {
                        m11360G(lVarM11366N2, true);
                        zMo966g = z11;
                    } else if (lVarM11366N2.f33460k) {
                        if (lVarM11366N2.f33464o) {
                            lVarM11366N2.f33460k = false;
                            zM11373U = m11373U(lVarM11366N2, keyEvent);
                        } else {
                            zM11373U = true;
                        }
                        if (zM11373U) {
                            m11371S(lVarM11366N2, keyEvent);
                            zMo966g = true;
                        } else {
                            zMo966g = false;
                        }
                    } else {
                        zMo966g = false;
                    }
                } else if (this.f33389M.mo960a()) {
                    zMo966g = this.f33389M.mo966g();
                } else if (this.f33418m0 || !m11373U(lVarM11366N2, keyEvent)) {
                    zMo966g = false;
                } else {
                    zMo966g = this.f33389M.mo967h();
                }
                if (!zMo966g) {
                    return true;
                }
                AudioManager audioManager = (AudioManager) context.getApplicationContext().getSystemService("audio");
                if (audioManager != null) {
                    audioManager.playSoundEffect(0);
                    return true;
                }
                Log.w("AppCompatDelegate", "Couldn't get audio manager");
                return true;
            }
        } else if (m11370R()) {
            return true;
        }
        return false;
    }

    /* JADX INFO: renamed from: J */
    public final void m11362J(int i10) {
        l lVarM11366N = m11366N(i10);
        if (lVarM11366N.f33457h != null) {
            Bundle bundle = new Bundle();
            lVarM11366N.f33457h.m936t(bundle);
            if (bundle.size() > 0) {
                lVarM11366N.f33465p = bundle;
            }
            lVarM11366N.f33457h.m939w();
            lVarM11366N.f33457h.clear();
        }
        lVarM11366N.f33464o = true;
        lVarM11366N.f33463n = true;
        if (i10 != 108 && i10 != 0) {
            return;
        }
        if (this.f33389M != null) {
            l lVarM11366N2 = m11366N(0);
            lVarM11366N2.f33460k = false;
            m11373U(lVarM11366N2, null);
        }
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    /* JADX INFO: renamed from: K */
    public final void m11363K() {
        ViewGroup viewGroup;
        if (!this.f33398V) {
            int[] iArr = C4999a.f32596j;
            Context context = this.f33414k;
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(iArr);
            if (!typedArrayObtainStyledAttributes.hasValue(117)) {
                typedArrayObtainStyledAttributes.recycle();
                throw new IllegalStateException("You need to use a Theme.AppCompat theme (or descendant) with this activity.");
            }
            if (typedArrayObtainStyledAttributes.getBoolean(126, false)) {
                mo11344t(1);
            } else if (typedArrayObtainStyledAttributes.getBoolean(117, false)) {
                mo11344t(108);
            }
            if (typedArrayObtainStyledAttributes.getBoolean(118, false)) {
                mo11344t(109);
            }
            if (typedArrayObtainStyledAttributes.getBoolean(119, false)) {
                mo11344t(10);
            }
            this.f33407e0 = typedArrayObtainStyledAttributes.getBoolean(0, false);
            typedArrayObtainStyledAttributes.recycle();
            m11364L();
            this.f33416l.getDecorView();
            LayoutInflater layoutInflaterFrom = LayoutInflater.from(context);
            if (this.f33408f0) {
                viewGroup = this.f33406d0 ? (ViewGroup) layoutInflaterFrom.inflate(com.linguist.R.layout.abc_screen_simple_overlay_action_mode, (ViewGroup) null) : (ViewGroup) layoutInflaterFrom.inflate(com.linguist.R.layout.abc_screen_simple, (ViewGroup) null);
            } else if (this.f33407e0) {
                viewGroup = (ViewGroup) layoutInflaterFrom.inflate(com.linguist.R.layout.abc_dialog_title_material, (ViewGroup) null);
                this.f33405c0 = false;
                this.f33404b0 = false;
            } else if (this.f33404b0) {
                TypedValue typedValue = new TypedValue();
                context.getTheme().resolveAttribute(com.linguist.R.attr.actionBarTheme, typedValue, true);
                viewGroup = (ViewGroup) LayoutInflater.from(typedValue.resourceId != 0 ? new C6102c(context, typedValue.resourceId) : context).inflate(com.linguist.R.layout.abc_screen_toolbar, (ViewGroup) null);
                InterfaceC0302c0 interfaceC0302c0 = (InterfaceC0302c0) viewGroup.findViewById(com.linguist.R.id.decor_content_parent);
                this.f33389M = interfaceC0302c0;
                interfaceC0302c0.setWindowCallback(m11367O());
                if (this.f33405c0) {
                    this.f33389M.mo968i(109);
                }
                if (this.f33402Z) {
                    this.f33389M.mo968i(2);
                }
                if (this.f33403a0) {
                    this.f33389M.mo968i(5);
                }
            } else {
                viewGroup = null;
            }
            if (viewGroup == null) {
                StringBuilder sb2 = new StringBuilder("AppCompat does not support the current theme features: { windowActionBar: ");
                sb2.append(this.f33404b0);
                sb2.append(", windowActionBarOverlay: ");
                sb2.append(this.f33405c0);
                sb2.append(", android:windowIsFloating: ");
                sb2.append(this.f33407e0);
                sb2.append(", windowActionModeOverlay: ");
                sb2.append(this.f33406d0);
                sb2.append(", windowNoTitle: ");
                throw new IllegalArgumentException(C0166e.m769p(sb2, this.f33408f0, " }"));
            }
            C5276h c5276h = new C5276h(this);
            WeakHashMap<View, C10049l0> weakHashMap = C10029b0.f50993a;
            C10029b0.i.m18727u(viewGroup, c5276h);
            if (this.f33389M == null) {
                this.f33400X = (TextView) viewGroup.findViewById(com.linguist.R.id.title);
            }
            Method method = C0318h1.f1215a;
            try {
                Method method2 = viewGroup.getClass().getMethod("makeOptionalFitsSystemWindows", new Class[0]);
                if (!method2.isAccessible()) {
                    method2.setAccessible(true);
                }
                method2.invoke(viewGroup, new Object[0]);
            } catch (IllegalAccessException e10) {
                Log.d("ViewUtils", "Could not invoke makeOptionalFitsSystemWindows", e10);
            } catch (NoSuchMethodException unused) {
                Log.d("ViewUtils", "Could not find method makeOptionalFitsSystemWindows. Oh well...");
            } catch (InvocationTargetException e11) {
                Log.d("ViewUtils", "Could not invoke makeOptionalFitsSystemWindows", e11);
            }
            ContentFrameLayout contentFrameLayout = (ContentFrameLayout) viewGroup.findViewById(com.linguist.R.id.action_bar_activity_content);
            ViewGroup viewGroup2 = (ViewGroup) this.f33416l.findViewById(R.id.content);
            if (viewGroup2 != null) {
                while (viewGroup2.getChildCount() > 0) {
                    View childAt = viewGroup2.getChildAt(0);
                    viewGroup2.removeViewAt(0);
                    contentFrameLayout.addView(childAt);
                }
                viewGroup2.setId(-1);
                contentFrameLayout.setId(R.id.content);
                if (viewGroup2 instanceof FrameLayout) {
                    ((FrameLayout) viewGroup2).setForeground(null);
                }
            }
            this.f33416l.setContentView(viewGroup);
            contentFrameLayout.setAttachListener(new C5277i(this));
            this.f33399W = viewGroup;
            Object obj = this.f33412j;
            CharSequence title = obj instanceof Activity ? ((Activity) obj).getTitle() : this.f33388L;
            if (!TextUtils.isEmpty(title)) {
                InterfaceC0302c0 interfaceC0302c1 = this.f33389M;
                if (interfaceC0302c1 != null) {
                    interfaceC0302c1.setWindowTitle(title);
                } else {
                    AbstractC5269a abstractC5269a = this.f33386J;
                    if (abstractC5269a != null) {
                        abstractC5269a.mo11323o(title);
                    } else {
                        TextView textView = this.f33400X;
                        if (textView != null) {
                            textView.setText(title);
                        }
                    }
                }
            }
            ContentFrameLayout contentFrameLayout2 = (ContentFrameLayout) this.f33399W.findViewById(R.id.content);
            View decorView = this.f33416l.getDecorView();
            contentFrameLayout2.f944g.set(decorView.getPaddingLeft(), decorView.getPaddingTop(), decorView.getPaddingRight(), decorView.getPaddingBottom());
            WeakHashMap<View, C10049l0> weakHashMap2 = C10029b0.f50993a;
            if (C10029b0.g.m18699c(contentFrameLayout2)) {
                contentFrameLayout2.requestLayout();
            }
            TypedArray typedArrayObtainStyledAttributes2 = context.obtainStyledAttributes(iArr);
            typedArrayObtainStyledAttributes2.getValue(124, contentFrameLayout2.getMinWidthMajor());
            typedArrayObtainStyledAttributes2.getValue(125, contentFrameLayout2.getMinWidthMinor());
            if (typedArrayObtainStyledAttributes2.hasValue(122)) {
                typedArrayObtainStyledAttributes2.getValue(122, contentFrameLayout2.getFixedWidthMajor());
            }
            if (typedArrayObtainStyledAttributes2.hasValue(123)) {
                typedArrayObtainStyledAttributes2.getValue(123, contentFrameLayout2.getFixedWidthMinor());
            }
            if (typedArrayObtainStyledAttributes2.hasValue(120)) {
                typedArrayObtainStyledAttributes2.getValue(120, contentFrameLayout2.getFixedHeightMajor());
            }
            if (typedArrayObtainStyledAttributes2.hasValue(121)) {
                typedArrayObtainStyledAttributes2.getValue(121, contentFrameLayout2.getFixedHeightMinor());
            }
            typedArrayObtainStyledAttributes2.recycle();
            contentFrameLayout2.requestLayout();
            this.f33398V = true;
            l lVarM11366N = m11366N(0);
            if (!this.f33418m0 && lVarM11366N.f33457h == null) {
                this.f33427v0 |= 4096;
                if (!this.f33426u0) {
                    C10029b0.d.m18676m(this.f33416l.getDecorView(), this.f33428w0);
                    this.f33426u0 = true;
                }
            }
        }
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    /* JADX INFO: renamed from: L */
    public final void m11364L() {
        if (this.f33416l == null) {
            Object obj = this.f33412j;
            if (obj instanceof Activity) {
                m11357C(((Activity) obj).getWindow());
            }
        }
        if (this.f33416l == null) {
            throw new IllegalStateException("We have not been given a Window");
        }
    }

    /* JADX INFO: renamed from: M */
    public final i m11365M(Context context) {
        if (this.f33424s0 == null) {
            if (C5291w.f33522d == null) {
                Context applicationContext = context.getApplicationContext();
                C5291w.f33522d = new C5291w(applicationContext, (LocationManager) applicationContext.getSystemService("location"));
            }
            this.f33424s0 = new j(C5291w.f33522d);
        }
        return this.f33424s0;
    }

    /* JADX INFO: renamed from: N */
    public final l m11366N(int i10) {
        l[] lVarArr = this.f33410h0;
        if (lVarArr == null || lVarArr.length <= i10) {
            l[] lVarArr2 = new l[i10 + 1];
            if (lVarArr != null) {
                System.arraycopy(lVarArr, 0, lVarArr2, 0, lVarArr.length);
            }
            this.f33410h0 = lVarArr2;
            lVarArr = lVarArr2;
        }
        l lVar = lVarArr[i10];
        if (lVar == null) {
            lVar = new l(i10);
            lVarArr[i10] = lVar;
        }
        return lVar;
    }

    /* JADX INFO: renamed from: O */
    public final Window.Callback m11367O() {
        return this.f33416l.getCallback();
    }

    /* JADX INFO: renamed from: P */
    public final void m11368P() {
        m11363K();
        if (this.f33404b0 && this.f33386J == null) {
            Object obj = this.f33412j;
            if (obj instanceof Activity) {
                this.f33386J = new C5292x((Activity) obj, this.f33405c0);
            } else if (obj instanceof Dialog) {
                this.f33386J = new C5292x((Dialog) obj);
            }
            AbstractC5269a abstractC5269a = this.f33386J;
            if (abstractC5269a != null) {
                abstractC5269a.mo11320l(this.f33429x0);
            }
        }
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    /* JADX INFO: renamed from: Q */
    public final int m11369Q(int i10, Context context) {
        if (i10 == -100) {
            return -1;
        }
        if (i10 != -1) {
            if (i10 != 0) {
                if (i10 != 1 && i10 != 2) {
                    if (i10 != 3) {
                        throw new IllegalStateException("Unknown value set for night mode. Please use one of the MODE_NIGHT values from AppCompatDelegate.");
                    }
                    if (this.f33425t0 == null) {
                        this.f33425t0 = new h(context);
                    }
                    return this.f33425t0.mo11389c();
                }
            } else {
                if (((UiModeManager) context.getApplicationContext().getSystemService("uimode")).getNightMode() == 0) {
                    return -1;
                }
                i10 = m11365M(context).mo11389c();
            }
        }
        return i10;
    }

    /* JADX INFO: renamed from: R */
    public final boolean m11370R() {
        boolean z10 = this.f33413j0;
        this.f33413j0 = false;
        l lVarM11366N = m11366N(0);
        if (lVarM11366N.f33462m) {
            if (!z10) {
                m11360G(lVarM11366N, true);
            }
            return true;
        }
        AbstractC6100a abstractC6100a = this.f33392P;
        if (abstractC6100a != null) {
            abstractC6100a.mo11416c();
            return true;
        }
        m11368P();
        AbstractC5269a abstractC5269a = this.f33386J;
        return abstractC5269a != null && abstractC5269a.mo11310b();
    }

    /* JADX WARN: Code duplicated, block: B:100:0x018c  */
    /* JADX WARN: Code duplicated, block: B:103:0x01a2  */
    /* JADX WARN: Code duplicated, block: B:106:0x01b8  */
    /* JADX WARN: Code duplicated, block: B:110:0x01e1  */
    /* JADX WARN: Code duplicated, block: B:114:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:83:0x015f  */
    /* JADX WARN: Code duplicated, block: B:86:0x0164  */
    /* JADX WARN: Code duplicated, block: B:89:0x0169  */
    /* JADX WARN: Code duplicated, block: B:91:0x016f  */
    /* JADX WARN: Code duplicated, block: B:95:0x0180  */
    /* JADX WARN: Code duplicated, block: B:98:0x0184  */
    /* JADX INFO: renamed from: S */
    public final void m11371S(l lVar, KeyEvent keyEvent) {
        boolean z10;
        boolean z11;
        ViewGroup.LayoutParams layoutParams;
        ViewParent parent;
        C0222d c0222d;
        int i10;
        ViewGroup.LayoutParams layoutParams2;
        if (lVar.f33462m || this.f33418m0) {
            return;
        }
        Context context = this.f33414k;
        int i11 = lVar.f33450a;
        if (i11 == 0) {
            if ((context.getResources().getConfiguration().screenLayout & 15) == 4) {
                return;
            }
        }
        Window.Callback callbackM11367O = m11367O();
        if (callbackM11367O != null && !callbackM11367O.onMenuOpened(i11, lVar.f33457h)) {
            m11360G(lVar, true);
            return;
        }
        WindowManager windowManager = (WindowManager) context.getSystemService("window");
        if (windowManager != null && m11373U(lVar, keyEvent)) {
            k kVar = lVar.f33454e;
            if (kVar != null && !lVar.f33463n) {
                View view = lVar.f33456g;
                if (view != null && (layoutParams2 = view.getLayoutParams()) != null && layoutParams2.width == -1) {
                    i10 = -1;
                }
                lVar.f33461l = false;
                WindowManager.LayoutParams layoutParams3 = new WindowManager.LayoutParams(i10, -2, 0, 0, 1002, 8519680, -3);
                layoutParams3.gravity = lVar.f33452c;
                layoutParams3.windowAnimations = lVar.f33453d;
                windowManager.addView(lVar.f33454e, layoutParams3);
                lVar.f33462m = true;
                if (i11 == 0) {
                    m11375W();
                }
            }
            if (kVar == null) {
                m11368P();
                AbstractC5269a abstractC5269a = this.f33386J;
                Context contextMo11313e = abstractC5269a != null ? abstractC5269a.mo11313e() : null;
                if (contextMo11313e != null) {
                    context = contextMo11313e;
                }
                TypedValue typedValue = new TypedValue();
                Resources.Theme themeNewTheme = context.getResources().newTheme();
                themeNewTheme.setTo(context.getTheme());
                themeNewTheme.resolveAttribute(com.linguist.R.attr.actionBarPopupTheme, typedValue, true);
                int i12 = typedValue.resourceId;
                if (i12 != 0) {
                    themeNewTheme.applyStyle(i12, true);
                }
                themeNewTheme.resolveAttribute(com.linguist.R.attr.panelMenuListTheme, typedValue, true);
                int i13 = typedValue.resourceId;
                if (i13 != 0) {
                    themeNewTheme.applyStyle(i13, true);
                } else {
                    themeNewTheme.applyStyle(com.linguist.R.style.Theme_AppCompat_CompactMenu, true);
                }
                C6102c c6102c = new C6102c(context, 0);
                c6102c.getTheme().setTo(themeNewTheme);
                lVar.f33459j = c6102c;
                TypedArray typedArrayObtainStyledAttributes = c6102c.obtainStyledAttributes(C4999a.f32596j);
                lVar.f33451b = typedArrayObtainStyledAttributes.getResourceId(86, 0);
                lVar.f33453d = typedArrayObtainStyledAttributes.getResourceId(1, 0);
                typedArrayObtainStyledAttributes.recycle();
                lVar.f33454e = new k(lVar.f33459j);
                lVar.f33452c = 81;
            } else if (lVar.f33463n && kVar.getChildCount() > 0) {
                lVar.f33454e.removeAllViews();
            }
            View view2 = lVar.f33456g;
            if (view2 == null) {
                if (lVar.f33457h != null) {
                    if (this.f33391O == null) {
                        this.f33391O = new m();
                    }
                    m mVar = this.f33391O;
                    if (lVar.f33458i == null) {
                        C0222d c0222d2 = new C0222d(lVar.f33459j);
                        lVar.f33458i = c0222d2;
                        c0222d2.f682e = mVar;
                        C0224f c0224f = lVar.f33457h;
                        c0224f.m918b(c0222d2, c0224f.f693a);
                    }
                    C0222d c0222d3 = lVar.f33458i;
                    k kVar2 = lVar.f33454e;
                    if (c0222d3.f681d == null) {
                        c0222d3.f681d = (ExpandedMenuView) c0222d3.f679b.inflate(com.linguist.R.layout.abc_expanded_menu_layout, (ViewGroup) kVar2, false);
                        if (c0222d3.f683f == null) {
                            c0222d3.f683f = c0222d3.new a();
                        }
                        c0222d3.f681d.setAdapter((ListAdapter) c0222d3.f683f);
                        c0222d3.f681d.setOnItemClickListener(c0222d3);
                    }
                    ExpandedMenuView expandedMenuView = c0222d3.f681d;
                    lVar.f33455f = expandedMenuView;
                    if (expandedMenuView != null) {
                    }
                    if (z10) {
                        if (lVar.f33455f != null) {
                            if (lVar.f33456g == null) {
                                c0222d = lVar.f33458i;
                                if (c0222d.f683f == null) {
                                    c0222d.f683f = c0222d.new a();
                                }
                                if (c0222d.f683f.getCount() <= 0) {
                                    z11 = false;
                                }
                            }
                            z11 = true;
                        } else {
                            z11 = false;
                        }
                        if (z11) {
                            layoutParams = lVar.f33455f.getLayoutParams();
                            if (layoutParams == null) {
                                layoutParams = new ViewGroup.LayoutParams(-2, -2);
                            }
                            lVar.f33454e.setBackgroundResource(lVar.f33451b);
                            parent = lVar.f33455f.getParent();
                            if (parent instanceof ViewGroup) {
                                ((ViewGroup) parent).removeView(lVar.f33455f);
                            }
                            lVar.f33454e.addView(lVar.f33455f, layoutParams);
                            if (!lVar.f33455f.hasFocus()) {
                                lVar.f33455f.requestFocus();
                            }
                        }
                    }
                    lVar.f33463n = true;
                    return;
                }
                z10 = false;
                if (z10) {
                    if (lVar.f33455f != null) {
                        if (lVar.f33456g == null) {
                            c0222d = lVar.f33458i;
                            if (c0222d.f683f == null) {
                                c0222d.f683f = c0222d.new a();
                            }
                            if (c0222d.f683f.getCount() <= 0) {
                                z11 = false;
                            }
                        }
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    if (z11) {
                        layoutParams = lVar.f33455f.getLayoutParams();
                        if (layoutParams == null) {
                            layoutParams = new ViewGroup.LayoutParams(-2, -2);
                        }
                        lVar.f33454e.setBackgroundResource(lVar.f33451b);
                        parent = lVar.f33455f.getParent();
                        if (parent instanceof ViewGroup) {
                            ((ViewGroup) parent).removeView(lVar.f33455f);
                        }
                        lVar.f33454e.addView(lVar.f33455f, layoutParams);
                        if (!lVar.f33455f.hasFocus()) {
                            lVar.f33455f.requestFocus();
                        }
                    }
                }
                lVar.f33463n = true;
                return;
            }
            lVar.f33455f = view2;
            z10 = true;
            if (z10) {
                if (lVar.f33455f != null) {
                    if (lVar.f33456g == null) {
                        c0222d = lVar.f33458i;
                        if (c0222d.f683f == null) {
                            c0222d.f683f = c0222d.new a();
                        }
                        if (c0222d.f683f.getCount() <= 0) {
                            z11 = false;
                        }
                    }
                    z11 = true;
                } else {
                    z11 = false;
                }
                if (z11) {
                    layoutParams = lVar.f33455f.getLayoutParams();
                    if (layoutParams == null) {
                        layoutParams = new ViewGroup.LayoutParams(-2, -2);
                    }
                    lVar.f33454e.setBackgroundResource(lVar.f33451b);
                    parent = lVar.f33455f.getParent();
                    if (parent instanceof ViewGroup) {
                        ((ViewGroup) parent).removeView(lVar.f33455f);
                    }
                    lVar.f33454e.addView(lVar.f33455f, layoutParams);
                    if (!lVar.f33455f.hasFocus()) {
                        lVar.f33455f.requestFocus();
                    }
                }
            }
            lVar.f33463n = true;
            return;
            i10 = -2;
            lVar.f33461l = false;
            WindowManager.LayoutParams layoutParams4 = new WindowManager.LayoutParams(i10, -2, 0, 0, 1002, 8519680, -3);
            layoutParams4.gravity = lVar.f33452c;
            layoutParams4.windowAnimations = lVar.f33453d;
            windowManager.addView(lVar.f33454e, layoutParams4);
            lVar.f33462m = true;
            if (i11 == 0) {
                m11375W();
            }
        }
    }

    /* JADX INFO: renamed from: T */
    public final boolean m11372T(l lVar, int i10, KeyEvent keyEvent) {
        C0224f c0224f;
        if (keyEvent.isSystem()) {
            return false;
        }
        if ((lVar.f33460k || m11373U(lVar, keyEvent)) && (c0224f = lVar.f33457h) != null) {
            return c0224f.performShortcut(i10, keyEvent, 1);
        }
        return false;
    }

    /* JADX INFO: renamed from: U */
    public final boolean m11373U(l lVar, KeyEvent keyEvent) {
        InterfaceC0302c0 interfaceC0302c0;
        InterfaceC0302c0 interfaceC0302c1;
        Resources.Theme themeNewTheme;
        InterfaceC0302c0 interfaceC0302c2;
        InterfaceC0302c0 interfaceC0302c3;
        if (this.f33418m0) {
            return false;
        }
        if (lVar.f33460k) {
            return true;
        }
        l lVar2 = this.f33411i0;
        if (lVar2 != null && lVar2 != lVar) {
            m11360G(lVar2, false);
        }
        Window.Callback callbackM11367O = m11367O();
        int i10 = lVar.f33450a;
        if (callbackM11367O != null) {
            lVar.f33456g = callbackM11367O.onCreatePanelView(i10);
        }
        boolean z10 = i10 == 0 || i10 == 108;
        if (z10 && (interfaceC0302c3 = this.f33389M) != null) {
            interfaceC0302c3.mo961b();
        }
        if (lVar.f33456g == null && (!z10 || !(this.f33386J instanceof C5289u))) {
            C0224f c0224f = lVar.f33457h;
            if (c0224f == null || lVar.f33464o) {
                if (c0224f == null) {
                    Context context = this.f33414k;
                    if ((i10 == 0 || i10 == 108) && this.f33389M != null) {
                        TypedValue typedValue = new TypedValue();
                        Resources.Theme theme = context.getTheme();
                        theme.resolveAttribute(com.linguist.R.attr.actionBarTheme, typedValue, true);
                        if (typedValue.resourceId != 0) {
                            themeNewTheme = context.getResources().newTheme();
                            themeNewTheme.setTo(theme);
                            themeNewTheme.applyStyle(typedValue.resourceId, true);
                            themeNewTheme.resolveAttribute(com.linguist.R.attr.actionBarWidgetTheme, typedValue, true);
                        } else {
                            theme.resolveAttribute(com.linguist.R.attr.actionBarWidgetTheme, typedValue, true);
                            themeNewTheme = null;
                        }
                        if (typedValue.resourceId != 0) {
                            if (themeNewTheme == null) {
                                themeNewTheme = context.getResources().newTheme();
                                themeNewTheme.setTo(theme);
                            }
                            themeNewTheme.applyStyle(typedValue.resourceId, true);
                        }
                        if (themeNewTheme != null) {
                            C6102c c6102c = new C6102c(context, 0);
                            c6102c.getTheme().setTo(themeNewTheme);
                            context = c6102c;
                        }
                    }
                    C0224f c0224f2 = new C0224f(context);
                    c0224f2.f697e = this;
                    C0224f c0224f3 = lVar.f33457h;
                    if (c0224f2 != c0224f3) {
                        if (c0224f3 != null) {
                            c0224f3.m934r(lVar.f33458i);
                        }
                        lVar.f33457h = c0224f2;
                        C0222d c0222d = lVar.f33458i;
                        if (c0222d != null) {
                            c0224f2.m918b(c0222d, c0224f2.f693a);
                        }
                    }
                    if (lVar.f33457h == null) {
                        return false;
                    }
                }
                if (z10 && (interfaceC0302c1 = this.f33389M) != null) {
                    if (this.f33390N == null) {
                        this.f33390N = new c();
                    }
                    interfaceC0302c1.mo962c(lVar.f33457h, this.f33390N);
                }
                lVar.f33457h.m939w();
                if (!callbackM11367O.onCreatePanelMenu(i10, lVar.f33457h)) {
                    C0224f c0224f4 = lVar.f33457h;
                    if (c0224f4 != null) {
                        if (c0224f4 != null) {
                            c0224f4.m934r(lVar.f33458i);
                        }
                        lVar.f33457h = null;
                    }
                    if (z10 && (interfaceC0302c0 = this.f33389M) != null) {
                        interfaceC0302c0.mo962c(null, this.f33390N);
                    }
                    return false;
                }
                lVar.f33464o = false;
            }
            lVar.f33457h.m939w();
            Bundle bundle = lVar.f33465p;
            if (bundle != null) {
                lVar.f33457h.m935s(bundle);
                lVar.f33465p = null;
            }
            if (!callbackM11367O.onPreparePanel(0, lVar.f33456g, lVar.f33457h)) {
                if (z10 && (interfaceC0302c2 = this.f33389M) != null) {
                    interfaceC0302c2.mo962c(null, this.f33390N);
                }
                lVar.f33457h.m938v();
                return false;
            }
            lVar.f33457h.setQwertyMode(KeyCharacterMap.load(keyEvent != null ? keyEvent.getDeviceId() : -1).getKeyboardType() != 1);
            lVar.f33457h.m938v();
        }
        lVar.f33460k = true;
        lVar.f33461l = false;
        this.f33411i0 = lVar;
        return true;
    }

    /* JADX INFO: renamed from: V */
    public final void m11374V() {
        if (this.f33398V) {
            throw new AndroidRuntimeException("Window feature must be requested before adding content");
        }
    }

    /* JADX INFO: renamed from: W */
    public final void m11375W() {
        OnBackInvokedCallback onBackInvokedCallback;
        if (Build.VERSION.SDK_INT >= 33) {
            boolean z10 = false;
            if (this.f33382B0 != null) {
                z10 = m11366N(0).f33462m || this.f33392P != null;
            }
            if (z10 && this.f33383C0 == null) {
                this.f33383C0 = f.m11385b(this.f33382B0, this);
            } else if (!z10 && (onBackInvokedCallback = this.f33383C0) != null) {
                f.m11386c(this.f33382B0, onBackInvokedCallback);
            }
        }
    }

    @Override // androidx.appcompat.view.menu.C0224f.a
    /* JADX INFO: renamed from: a */
    public final boolean mo940a(C0224f c0224f, MenuItem menuItem) {
        int length;
        int i10;
        l lVar;
        Window.Callback callbackM11367O = m11367O();
        if (callbackM11367O != null && !this.f33418m0) {
            C0224f c0224fMo927k = c0224f.mo927k();
            l[] lVarArr = this.f33410h0;
            if (lVarArr != null) {
                length = lVarArr.length;
                i10 = 0;
            } else {
                length = 0;
                i10 = 0;
            }
            while (true) {
                if (i10 < length) {
                    lVar = lVarArr[i10];
                    if (lVar != null && lVar.f33457h == c0224fMo927k) {
                        break;
                    }
                    i10++;
                } else {
                    lVar = null;
                    break;
                }
            }
            if (lVar != null) {
                return callbackM11367O.onMenuItemSelected(lVar.f33450a, menuItem);
            }
        }
        return false;
    }

    @Override // androidx.appcompat.view.menu.C0224f.a
    /* JADX INFO: renamed from: b */
    public final void mo941b(C0224f c0224f) {
        InterfaceC0302c0 interfaceC0302c0 = this.f33389M;
        if (interfaceC0302c0 == null || !interfaceC0302c0.mo963d() || (ViewConfiguration.get(this.f33414k).hasPermanentMenuKey() && !this.f33389M.mo965f())) {
            l lVarM11366N = m11366N(0);
            lVarM11366N.f33463n = true;
            m11360G(lVarM11366N, false);
            m11371S(lVarM11366N, null);
        } else {
            Window.Callback callbackM11367O = m11367O();
            if (this.f33389M.mo960a()) {
                this.f33389M.mo966g();
                if (!this.f33418m0) {
                    callbackM11367O.onPanelClosed(108, m11366N(0).f33457h);
                }
            } else if (callbackM11367O != null && !this.f33418m0) {
                if (this.f33426u0 && (1 & this.f33427v0) != 0) {
                    View decorView = this.f33416l.getDecorView();
                    a aVar = this.f33428w0;
                    decorView.removeCallbacks(aVar);
                    aVar.run();
                }
                l lVarM11366N2 = m11366N(0);
                C0224f c0224f2 = lVarM11366N2.f33457h;
                if (c0224f2 != null && !lVarM11366N2.f33464o && callbackM11367O.onPreparePanel(0, lVarM11366N2.f33456g, c0224f2)) {
                    callbackM11367O.onMenuOpened(108, lVarM11366N2.f33457h);
                    this.f33389M.mo967h();
                }
            }
        }
    }

    @Override // p080e.AbstractC5274f
    /* JADX INFO: renamed from: c */
    public final void mo11329c(View view, ViewGroup.LayoutParams layoutParams) {
        m11363K();
        ((ViewGroup) this.f33399W.findViewById(R.id.content)).addView(view, layoutParams);
        this.f33384H.m11387a(this.f33416l.getCallback());
    }

    /* JADX WARN: Code duplicated, block: B:126:0x023f  */
    /* JADX WARN: Code duplicated, block: B:127:0x0241  */
    /* JADX WARN: Code duplicated, block: B:129:0x0244  */
    /* JADX WARN: Code duplicated, block: B:131:0x024f  */
    /* JADX WARN: Code duplicated, block: B:132:0x0255  */
    /* JADX WARN: Code duplicated, block: B:136:0x025e  */
    /* JADX WARN: Code duplicated, block: B:150:0x0298  */
    /* JADX WARN: Code duplicated, block: B:165:0x0259 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:171:0x0283 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @Override // p080e.AbstractC5274f
    /* JADX INFO: renamed from: d */
    public final Context mo11330d(final Context context) {
        Configuration configuration;
        C6102c c6102c;
        boolean z10;
        Resources.Theme theme;
        Method method;
        this.f33415k0 = true;
        int i10 = this.f33420o0;
        if (i10 == -100) {
            i10 = AbstractC5274f.f33369b;
        }
        int iM11369Q = m11369Q(i10, context);
        if (AbstractC5274f.m11326l(context) && AbstractC5274f.m11326l(context)) {
            if (!C9182a.m17515a()) {
                synchronized (AbstractC5274f.f33376i) {
                    C9188g c9188g = AbstractC5274f.f33370c;
                    if (c9188g == null) {
                        if (AbstractC5274f.f33371d == null) {
                            AbstractC5274f.f33371d = C9188g.m17523a(C5287s.m11400b(context));
                        }
                        if (!AbstractC5274f.f33371d.f47728a.isEmpty()) {
                            AbstractC5274f.f33370c = AbstractC5274f.f33371d;
                        }
                    } else if (!c9188g.equals(AbstractC5274f.f33371d)) {
                        C9188g c9188g2 = AbstractC5274f.f33370c;
                        AbstractC5274f.f33371d = c9188g2;
                        C5287s.m11399a(context, c9188g2.f47728a.mo17529a());
                    }
                }
            } else if (!AbstractC5274f.f33373f) {
                AbstractC5274f.f33368a.execute(new Runnable() { // from class: e.e
                    /* JADX WARN: Code duplicated, block: B:22:0x0079  */
                    @Override // java.lang.Runnable
                    public final void run() {
                        C9188g c9188g3;
                        Object systemService;
                        Context contextMo11332f;
                        if (Build.VERSION.SDK_INT >= 33) {
                            Context context2 = context;
                            ComponentName componentName = new ComponentName(context2, "androidx.appcompat.app.AppLocalesMetadataHolderService");
                            if (context2.getPackageManager().getComponentEnabledSetting(componentName) != 1) {
                                if (C9182a.m17515a()) {
                                    Iterator<WeakReference<AbstractC5274f>> it = AbstractC5274f.f33374g.iterator();
                                    while (true) {
                                        AbstractC8451g.a aVar = (AbstractC8451g.a) it;
                                        if (!aVar.hasNext()) {
                                            systemService = null;
                                            break;
                                        }
                                        AbstractC5274f abstractC5274f = (AbstractC5274f) ((WeakReference) aVar.next()).get();
                                        if (abstractC5274f != null && (contextMo11332f = abstractC5274f.mo11332f()) != null) {
                                            systemService = contextMo11332f.getSystemService("locale");
                                            break;
                                        }
                                    }
                                    if (systemService != null) {
                                        c9188g3 = new C9188g(new C9190i(AbstractC5274f.b.m11352a(systemService)));
                                    } else {
                                        c9188g3 = C9188g.f47727b;
                                    }
                                } else {
                                    c9188g3 = AbstractC5274f.f33370c;
                                    if (c9188g3 == null) {
                                        c9188g3 = C9188g.f47727b;
                                    }
                                }
                                if (c9188g3.f47728a.isEmpty()) {
                                    String strM11400b = C5287s.m11400b(context2);
                                    Object systemService2 = context2.getSystemService("locale");
                                    if (systemService2 != null) {
                                        AbstractC5274f.b.m11353b(systemService2, AbstractC5274f.a.m11351a(strM11400b));
                                    }
                                }
                                context2.getPackageManager().setComponentEnabledSetting(componentName, 1, 1);
                            }
                        }
                        AbstractC5274f.f33373f = true;
                    }
                });
            }
        }
        C9188g c9188gM11354D = m11354D(context);
        if (f33380G0 && (context instanceof ContextThemeWrapper)) {
            try {
                ((ContextThemeWrapper) context).applyOverrideConfiguration(m11355H(context, iM11369Q, c9188gM11354D, null, false));
                return context;
            } catch (IllegalStateException unused) {
            }
        }
        if (context instanceof C6102c) {
            try {
                ((C6102c) context).m12599a(m11355H(context, iM11369Q, c9188gM11354D, null, false));
                return context;
            } catch (IllegalStateException unused2) {
            }
        }
        if (!f33379F0) {
            return context;
        }
        Configuration configuration2 = new Configuration();
        configuration2.uiMode = -1;
        configuration2.fontScale = 0.0f;
        Configuration configuration3 = context.createConfigurationContext(configuration2).getResources().getConfiguration();
        Configuration configuration4 = context.getResources().getConfiguration();
        configuration3.uiMode = configuration4.uiMode;
        try {
            if (!configuration3.equals(configuration4)) {
                configuration = new Configuration();
                configuration.fontScale = 0.0f;
                if (configuration3.diff(configuration4) != 0) {
                    float f3 = configuration3.fontScale;
                    float f10 = configuration4.fontScale;
                    if (f3 != f10) {
                        configuration.fontScale = f10;
                    }
                    int i11 = configuration3.mcc;
                    int i12 = configuration4.mcc;
                    if (i11 != i12) {
                        configuration.mcc = i12;
                    }
                    int i13 = configuration3.mnc;
                    int i14 = configuration4.mnc;
                    if (i13 != i14) {
                        configuration.mnc = i14;
                    }
                    e.m11380a(configuration3, configuration4, configuration);
                    int i15 = configuration3.touchscreen;
                    int i16 = configuration4.touchscreen;
                    if (i15 != i16) {
                        configuration.touchscreen = i16;
                    }
                    int i17 = configuration3.keyboard;
                    int i18 = configuration4.keyboard;
                    if (i17 != i18) {
                        configuration.keyboard = i18;
                    }
                    int i19 = configuration3.keyboardHidden;
                    int i20 = configuration4.keyboardHidden;
                    if (i19 != i20) {
                        configuration.keyboardHidden = i20;
                    }
                    int i21 = configuration3.navigation;
                    int i22 = configuration4.navigation;
                    if (i21 != i22) {
                        configuration.navigation = i22;
                    }
                    int i23 = configuration3.navigationHidden;
                    int i24 = configuration4.navigationHidden;
                    if (i23 != i24) {
                        configuration.navigationHidden = i24;
                    }
                    int i25 = configuration3.orientation;
                    int i26 = configuration4.orientation;
                    if (i25 != i26) {
                        configuration.orientation = i26;
                    }
                    int i27 = configuration3.screenLayout & 15;
                    int i28 = configuration4.screenLayout & 15;
                    if (i27 != i28) {
                        configuration.screenLayout |= i28;
                    }
                    int i29 = configuration3.screenLayout & 192;
                    int i30 = configuration4.screenLayout & 192;
                    if (i29 != i30) {
                        configuration.screenLayout |= i30;
                    }
                    int i31 = configuration3.screenLayout & 48;
                    int i32 = configuration4.screenLayout & 48;
                    if (i31 != i32) {
                        configuration.screenLayout |= i32;
                    }
                    int i33 = configuration3.screenLayout & 768;
                    int i34 = configuration4.screenLayout & 768;
                    if (i33 != i34) {
                        configuration.screenLayout |= i34;
                    }
                    int i35 = configuration3.colorMode & 3;
                    int i36 = configuration4.colorMode & 3;
                    if (i35 != i36) {
                        configuration.colorMode |= i36;
                    }
                    int i37 = configuration3.colorMode & 12;
                    int i38 = configuration4.colorMode & 12;
                    if (i37 != i38) {
                        configuration.colorMode |= i38;
                    }
                    int i39 = configuration3.uiMode & 15;
                    int i40 = configuration4.uiMode & 15;
                    if (i39 != i40) {
                        configuration.uiMode |= i40;
                    }
                    int i41 = configuration3.uiMode & 48;
                    int i42 = configuration4.uiMode & 48;
                    if (i41 != i42) {
                        configuration.uiMode |= i42;
                    }
                    int i43 = configuration3.screenWidthDp;
                    int i44 = configuration4.screenWidthDp;
                    if (i43 != i44) {
                        configuration.screenWidthDp = i44;
                    }
                    int i45 = configuration3.screenHeightDp;
                    int i46 = configuration4.screenHeightDp;
                    if (i45 != i46) {
                        configuration.screenHeightDp = i46;
                    }
                    int i47 = configuration3.smallestScreenWidthDp;
                    int i48 = configuration4.smallestScreenWidthDp;
                    if (i47 != i48) {
                        configuration.smallestScreenWidthDp = i48;
                    }
                    int i49 = configuration3.densityDpi;
                    int i50 = configuration4.densityDpi;
                    if (i49 != i50) {
                        configuration.densityDpi = i50;
                    }
                }
                Configuration configurationM11355H = m11355H(context, iM11369Q, c9188gM11354D, configuration, true);
                c6102c = new C6102c(context, com.linguist.R.style.Theme_AppCompat_Empty);
                c6102c.m12599a(configurationM11355H);
                if (context.getTheme() != null) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (z10) {
                    theme = c6102c.getTheme();
                    if (Build.VERSION.SDK_INT >= 29) {
                        C7910j.m15682a(theme);
                    } else {
                        synchronized (C7909i.f43069a) {
                            if (!C7909i.f43071c) {
                                try {
                                    Method declaredMethod = Resources.Theme.class.getDeclaredMethod("rebase", new Class[0]);
                                    C7909i.f43070b = declaredMethod;
                                    declaredMethod.setAccessible(true);
                                } catch (NoSuchMethodException e10) {
                                    Log.i("ResourcesCompat", "Failed to retrieve rebase() method", e10);
                                }
                                C7909i.f43071c = true;
                            }
                            method = C7909i.f43070b;
                            if (method != null) {
                                try {
                                    method.invoke(theme, new Object[0]);
                                } catch (IllegalAccessException | InvocationTargetException e11) {
                                    Log.i("ResourcesCompat", "Failed to invoke rebase() method via reflection", e11);
                                    C7909i.f43070b = null;
                                }
                            }
                        }
                    }
                }
                return c6102c;
            }
            configuration = null;
            if (context.getTheme() != null) {
                z10 = true;
            } else {
                z10 = false;
            }
        } catch (NullPointerException unused3) {
        }
        Configuration configurationM11355H2 = m11355H(context, iM11369Q, c9188gM11354D, configuration, true);
        c6102c = new C6102c(context, com.linguist.R.style.Theme_AppCompat_Empty);
        c6102c.m12599a(configurationM11355H2);
        if (z10) {
            theme = c6102c.getTheme();
            if (Build.VERSION.SDK_INT >= 29) {
                C7910j.m15682a(theme);
            } else {
                synchronized (C7909i.f43069a) {
                    if (!C7909i.f43071c) {
                        Method declaredMethod2 = Resources.Theme.class.getDeclaredMethod("rebase", new Class[0]);
                        C7909i.f43070b = declaredMethod2;
                        declaredMethod2.setAccessible(true);
                        C7909i.f43071c = true;
                    }
                    method = C7909i.f43070b;
                    if (method != null) {
                        method.invoke(theme, new Object[0]);
                    }
                }
            }
        }
        return c6102c;
    }

    @Override // p080e.AbstractC5274f
    /* JADX INFO: renamed from: e */
    public final <T extends View> T mo11331e(int i10) {
        m11363K();
        return (T) this.f33416l.findViewById(i10);
    }

    @Override // p080e.AbstractC5274f
    /* JADX INFO: renamed from: f */
    public final Context mo11332f() {
        return this.f33414k;
    }

    @Override // p080e.AbstractC5274f
    /* JADX INFO: renamed from: g */
    public final int mo11333g() {
        return this.f33420o0;
    }

    @Override // p080e.AbstractC5274f
    /* JADX INFO: renamed from: h */
    public final MenuInflater mo11334h() {
        if (this.f33387K == null) {
            m11368P();
            AbstractC5269a abstractC5269a = this.f33386J;
            this.f33387K = new C6105f(abstractC5269a != null ? abstractC5269a.mo11313e() : this.f33414k);
        }
        return this.f33387K;
    }

    @Override // p080e.AbstractC5274f
    /* JADX INFO: renamed from: i */
    public final AbstractC5269a mo11335i() {
        m11368P();
        return this.f33386J;
    }

    @Override // p080e.AbstractC5274f
    /* JADX INFO: renamed from: j */
    public final void mo11336j() {
        LayoutInflater layoutInflaterFrom = LayoutInflater.from(this.f33414k);
        if (layoutInflaterFrom.getFactory() == null) {
            layoutInflaterFrom.setFactory2(this);
        } else {
            if (!(layoutInflaterFrom.getFactory2() instanceof LayoutInflaterFactory2C5275g)) {
                Log.i("AppCompatDelegate", "The Activity's LayoutInflater already has a Factory installed so we can not install AppCompat's");
            }
        }
    }

    @Override // p080e.AbstractC5274f
    /* JADX INFO: renamed from: k */
    public final void mo11337k() {
        if (this.f33386J != null) {
            m11368P();
            if (this.f33386J.mo11314f()) {
                return;
            }
            this.f33427v0 |= 1;
            if (this.f33426u0) {
                return;
            }
            View decorView = this.f33416l.getDecorView();
            WeakHashMap<View, C10049l0> weakHashMap = C10029b0.f50993a;
            C10029b0.d.m18676m(decorView, this.f33428w0);
            this.f33426u0 = true;
        }
    }

    @Override // p080e.AbstractC5274f
    /* JADX INFO: renamed from: m */
    public final void mo11338m(Configuration configuration) {
        if (this.f33404b0 && this.f33398V) {
            m11368P();
            AbstractC5269a abstractC5269a = this.f33386J;
            if (abstractC5269a != null) {
                abstractC5269a.mo11315g();
            }
        }
        C0319i c0319iM1201a = C0319i.m1201a();
        Context context = this.f33414k;
        synchronized (c0319iM1201a) {
            try {
                C0339r0 c0339r0 = c0319iM1201a.f1219a;
                synchronized (c0339r0) {
                    try {
                        C8449e<WeakReference<Drawable.ConstantState>> c8449e = c0339r0.f1324b.get(context);
                        if (c8449e != null) {
                            c8449e.m16507b();
                        }
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
            } catch (Throwable th3) {
                throw th3;
            }
        }
        this.f33419n0 = new Configuration(this.f33414k.getResources().getConfiguration());
        m11356B(false, false);
    }

    @Override // p080e.AbstractC5274f
    /* JADX INFO: renamed from: n */
    public final void mo11339n() {
        String strM14564c;
        this.f33415k0 = true;
        m11356B(false, true);
        m11364L();
        Object obj = this.f33412j;
        if (obj instanceof Activity) {
            try {
                Activity activity = (Activity) obj;
                try {
                    strM14564c = C7232k.m14564c(activity, activity.getComponentName());
                } catch (PackageManager.NameNotFoundException e10) {
                    throw new IllegalArgumentException(e10);
                }
            } catch (IllegalArgumentException unused) {
                strM14564c = null;
            }
            if (strM14564c != null) {
                AbstractC5269a abstractC5269a = this.f33386J;
                if (abstractC5269a == null) {
                    this.f33429x0 = true;
                } else {
                    abstractC5269a.mo11320l(true);
                }
            }
            synchronized (AbstractC5274f.f33375h) {
                AbstractC5274f.m11327s(this);
                AbstractC5274f.f33374g.add(new WeakReference<>(this));
            }
        }
        this.f33419n0 = new Configuration(this.f33414k.getResources().getConfiguration());
        this.f33417l0 = true;
    }

    /* JADX WARN: Code duplicated, block: B:23:0x0060  */
    @Override // p080e.AbstractC5274f
    /* JADX INFO: renamed from: o */
    public final void mo11340o() {
        if (this.f33412j instanceof Activity) {
            synchronized (AbstractC5274f.f33375h) {
                AbstractC5274f.m11327s(this);
            }
        }
        if (this.f33426u0) {
            this.f33416l.getDecorView().removeCallbacks(this.f33428w0);
        }
        this.f33418m0 = true;
        if (this.f33420o0 != -100) {
            Object obj = this.f33412j;
            if ((obj instanceof Activity) && ((Activity) obj).isChangingConfigurations()) {
                f33377D0.put(this.f33412j.getClass().getName(), Integer.valueOf(this.f33420o0));
            } else {
                f33377D0.remove(this.f33412j.getClass().getName());
            }
        } else {
            f33377D0.remove(this.f33412j.getClass().getName());
        }
        AbstractC5269a abstractC5269a = this.f33386J;
        if (abstractC5269a != null) {
            abstractC5269a.mo11316h();
        }
        j jVar = this.f33424s0;
        if (jVar != null) {
            jVar.m11391a();
        }
        h hVar = this.f33425t0;
        if (hVar != null) {
            hVar.m11391a();
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:81:0x018d  */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @Override // android.view.LayoutInflater.Factory2
    public final View onCreateView(View view, String str, Context context, AttributeSet attributeSet) {
        View c0338r;
        if (this.f33381A0 == null) {
            int[] iArr = C4999a.f32596j;
            Context context2 = this.f33414k;
            String string = context2.obtainStyledAttributes(iArr).getString(116);
            if (string == null) {
                this.f33381A0 = new C5284p();
            } else {
                try {
                    this.f33381A0 = (C5284p) context2.getClassLoader().loadClass(string).getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
                } catch (Throwable th2) {
                    Log.i("AppCompatDelegate", "Failed to instantiate custom view inflater " + string + ". Falling back to default.", th2);
                    this.f33381A0 = new C5284p();
                }
            }
        }
        C5284p c5284p = this.f33381A0;
        int i10 = C0315g1.f1208a;
        c5284p.getClass();
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C4999a.f32612z, 0, 0);
        byte b10 = 4;
        int resourceId = typedArrayObtainStyledAttributes.getResourceId(4, 0);
        if (resourceId != 0) {
            Log.i("AppCompatViewInflater", "app:theme is now deprecated. Please move to using android:theme instead.");
        }
        typedArrayObtainStyledAttributes.recycle();
        Context c6102c = (resourceId == 0 || ((context instanceof C6102c) && ((C6102c) context).f35853a == resourceId)) ? context : new C6102c(context, resourceId);
        str.getClass();
        switch (str.hashCode()) {
            case -1946472170:
                if (!str.equals("RatingBar")) {
                    b10 = -1;
                } else {
                    b10 = 0;
                }
                break;
            case -1455429095:
                if (!str.equals("CheckedTextView")) {
                    b10 = -1;
                } else {
                    b10 = 1;
                }
                break;
            case -1346021293:
                if (!str.equals("MultiAutoCompleteTextView")) {
                    b10 = -1;
                } else {
                    b10 = 2;
                }
                break;
            case -938935918:
                if (!str.equals("TextView")) {
                    b10 = -1;
                } else {
                    b10 = 3;
                }
                break;
            case -937446323:
                if (!str.equals("ImageButton")) {
                    b10 = -1;
                }
                break;
            case -658531749:
                if (!str.equals("SeekBar")) {
                    b10 = -1;
                } else {
                    b10 = 5;
                }
                break;
            case -339785223:
                if (!str.equals("Spinner")) {
                    b10 = -1;
                } else {
                    b10 = 6;
                }
                break;
            case 776382189:
                if (!str.equals("RadioButton")) {
                    b10 = -1;
                } else {
                    b10 = 7;
                }
                break;
            case 799298502:
                if (!str.equals("ToggleButton")) {
                    b10 = -1;
                } else {
                    b10 = 8;
                }
                break;
            case 1125864064:
                if (!str.equals("ImageView")) {
                    b10 = -1;
                } else {
                    b10 = 9;
                }
                break;
            case 1413872058:
                if (!str.equals("AutoCompleteTextView")) {
                    b10 = -1;
                } else {
                    b10 = 10;
                }
                break;
            case 1601505219:
                if (!str.equals("CheckBox")) {
                    b10 = -1;
                } else {
                    b10 = 11;
                }
                break;
            case 1666676343:
                if (!str.equals("EditText")) {
                    b10 = -1;
                } else {
                    b10 = 12;
                }
                break;
            case 2001146706:
                if (!str.equals("Button")) {
                    b10 = -1;
                } else {
                    b10 = 13;
                }
                break;
            default:
                b10 = -1;
                break;
        }
        View view2 = null;
        switch (b10) {
            case InstallReferrerClient.InstallReferrerResponse.f10530OK /* 0 */:
                c0338r = new C0338r(c6102c, attributeSet);
                break;
            case 1:
                c0338r = new C0310f(c6102c, attributeSet);
                break;
            case 2:
                c0338r = new C0330n(c6102c, attributeSet);
                break;
            case 3:
                AppCompatTextView appCompatTextViewMo8925e = c5284p.mo8925e(c6102c, attributeSet);
                c5284p.m11397g(appCompatTextViewMo8925e, str);
                c0338r = appCompatTextViewMo8925e;
                break;
            case 4:
                c0338r = new C0326l(c6102c, attributeSet);
                break;
            case 5:
                c0338r = new C0342t(c6102c, attributeSet);
                break;
            case PreferencesProto$Value.STRING_SET_FIELD_NUMBER /* 6 */:
                c0338r = new AppCompatSpinner(c6102c, attributeSet);
                break;
            case PreferencesProto$Value.DOUBLE_FIELD_NUMBER /* 7 */:
                C0336q c0336qMo8924d = c5284p.mo8924d(c6102c, attributeSet);
                c5284p.m11397g(c0336qMo8924d, str);
                c0338r = c0336qMo8924d;
                break;
            case 8:
                c0338r = new C0299b0(c6102c, attributeSet);
                break;
            case 9:
                c0338r = new AppCompatImageView(c6102c, attributeSet);
                break;
            case 10:
                C0301c c0301cMo8921a = c5284p.mo8921a(c6102c, attributeSet);
                c5284p.m11397g(c0301cMo8921a, str);
                c0338r = c0301cMo8921a;
                break;
            case 11:
                AppCompatCheckBox appCompatCheckBoxMo8923c = c5284p.mo8923c(c6102c, attributeSet);
                c5284p.m11397g(appCompatCheckBoxMo8923c, str);
                c0338r = appCompatCheckBoxMo8923c;
                break;
            case 12:
                c0338r = new AppCompatEditText(c6102c, attributeSet);
                break;
            case 13:
                C0307e c0307eMo8922b = c5284p.mo8922b(c6102c, attributeSet);
                c5284p.m11397g(c0307eMo8922b, str);
                c0338r = c0307eMo8922b;
                break;
            default:
                c0338r = null;
                break;
        }
        if (c0338r == null && context != c6102c) {
            Object[] objArr = c5284p.f33483a;
            if (str.equals("view")) {
                str = attributeSet.getAttributeValue(null, "class");
            }
            try {
                objArr[0] = c6102c;
                objArr[1] = attributeSet;
                if (-1 == str.indexOf(46)) {
                    int i11 = 0;
                    while (true) {
                        String[] strArr = C5284p.f33481g;
                        if (i11 < 3) {
                            View viewM11396f = c5284p.m11396f(c6102c, str, strArr[i11]);
                            if (viewM11396f != null) {
                                objArr[0] = null;
                                objArr[1] = null;
                                view2 = viewM11396f;
                            } else {
                                i11++;
                            }
                        } else {
                            objArr[0] = null;
                            objArr[1] = null;
                        }
                    }
                } else {
                    View viewM11396f2 = c5284p.m11396f(c6102c, str, null);
                    objArr[0] = null;
                    objArr[1] = null;
                    view2 = viewM11396f2;
                }
            } catch (Exception unused) {
                objArr[0] = view2;
                objArr[1] = view2;
            } catch (Throwable th3) {
                objArr[0] = view2;
                objArr[1] = view2;
                throw th3;
            }
            c0338r = view2;
        }
        if (c0338r != null) {
            Context context3 = c0338r.getContext();
            if (context3 instanceof ContextWrapper) {
                WeakHashMap<View, C10049l0> weakHashMap = C10029b0.f50993a;
                if (C10029b0.c.m18663a(c0338r)) {
                    TypedArray typedArrayObtainStyledAttributes2 = context3.obtainStyledAttributes(attributeSet, C5284p.f33477c);
                    String string2 = typedArrayObtainStyledAttributes2.getString(0);
                    if (string2 != null) {
                        c0338r.setOnClickListener(new C5284p.a(c0338r, string2));
                    }
                    typedArrayObtainStyledAttributes2.recycle();
                }
            }
            if (Build.VERSION.SDK_INT <= 28) {
                TypedArray typedArrayObtainStyledAttributes3 = c6102c.obtainStyledAttributes(attributeSet, C5284p.f33478d);
                if (typedArrayObtainStyledAttributes3.hasValue(0)) {
                    boolean z10 = typedArrayObtainStyledAttributes3.getBoolean(0, false);
                    WeakHashMap<View, C10049l0> weakHashMap2 = C10029b0.f50993a;
                    new C10027a0().m18662e(c0338r, Boolean.valueOf(z10));
                }
                typedArrayObtainStyledAttributes3.recycle();
                TypedArray typedArrayObtainStyledAttributes4 = c6102c.obtainStyledAttributes(attributeSet, C5284p.f33479e);
                if (typedArrayObtainStyledAttributes4.hasValue(0)) {
                    C10029b0.m18659o(c0338r, typedArrayObtainStyledAttributes4.getString(0));
                }
                typedArrayObtainStyledAttributes4.recycle();
                TypedArray typedArrayObtainStyledAttributes5 = c6102c.obtainStyledAttributes(attributeSet, C5284p.f33480f);
                if (typedArrayObtainStyledAttributes5.hasValue(0)) {
                    boolean z11 = typedArrayObtainStyledAttributes5.getBoolean(0, false);
                    WeakHashMap<View, C10049l0> weakHashMap3 = C10029b0.f50993a;
                    new C10070x().m18662e(c0338r, Boolean.valueOf(z11));
                }
                typedArrayObtainStyledAttributes5.recycle();
            }
        }
        return c0338r;
    }

    @Override // android.view.LayoutInflater.Factory
    public final View onCreateView(String str, Context context, AttributeSet attributeSet) {
        return onCreateView(null, str, context, attributeSet);
    }

    @Override // p080e.AbstractC5274f
    /* JADX INFO: renamed from: p */
    public final void mo11341p() {
        m11368P();
        AbstractC5269a abstractC5269a = this.f33386J;
        if (abstractC5269a != null) {
            abstractC5269a.mo11321m(true);
        }
    }

    @Override // p080e.AbstractC5274f
    /* JADX INFO: renamed from: q */
    public final void mo11342q() {
        m11356B(true, false);
    }

    @Override // p080e.AbstractC5274f
    /* JADX INFO: renamed from: r */
    public final void mo11343r() {
        m11368P();
        AbstractC5269a abstractC5269a = this.f33386J;
        if (abstractC5269a != null) {
            abstractC5269a.mo11321m(false);
        }
    }

    @Override // p080e.AbstractC5274f
    /* JADX INFO: renamed from: t */
    public final boolean mo11344t(int i10) {
        if (i10 == 8) {
            Log.i("AppCompatDelegate", "You should now use the AppCompatDelegate.FEATURE_SUPPORT_ACTION_BAR id when requesting this feature.");
            i10 = 108;
        } else if (i10 == 9) {
            Log.i("AppCompatDelegate", "You should now use the AppCompatDelegate.FEATURE_SUPPORT_ACTION_BAR_OVERLAY id when requesting this feature.");
            i10 = 109;
        }
        if (this.f33408f0 && i10 == 108) {
            return false;
        }
        if (this.f33404b0 && i10 == 1) {
            this.f33404b0 = false;
        }
        if (i10 == 1) {
            m11374V();
            this.f33408f0 = true;
            return true;
        }
        if (i10 == 2) {
            m11374V();
            this.f33402Z = true;
            return true;
        }
        if (i10 == 5) {
            m11374V();
            this.f33403a0 = true;
            return true;
        }
        if (i10 == 10) {
            m11374V();
            this.f33406d0 = true;
            return true;
        }
        if (i10 == 108) {
            m11374V();
            this.f33404b0 = true;
            return true;
        }
        if (i10 != 109) {
            return this.f33416l.requestFeature(i10);
        }
        m11374V();
        this.f33405c0 = true;
        return true;
    }

    @Override // p080e.AbstractC5274f
    /* JADX INFO: renamed from: u */
    public final void mo11345u(int i10) {
        m11363K();
        ViewGroup viewGroup = (ViewGroup) this.f33399W.findViewById(R.id.content);
        viewGroup.removeAllViews();
        LayoutInflater.from(this.f33414k).inflate(i10, viewGroup);
        this.f33384H.m11387a(this.f33416l.getCallback());
    }

    @Override // p080e.AbstractC5274f
    /* JADX INFO: renamed from: v */
    public final void mo11346v(View view) {
        m11363K();
        ViewGroup viewGroup = (ViewGroup) this.f33399W.findViewById(R.id.content);
        viewGroup.removeAllViews();
        viewGroup.addView(view);
        this.f33384H.m11387a(this.f33416l.getCallback());
    }

    @Override // p080e.AbstractC5274f
    /* JADX INFO: renamed from: w */
    public final void mo11347w(View view, ViewGroup.LayoutParams layoutParams) {
        m11363K();
        ViewGroup viewGroup = (ViewGroup) this.f33399W.findViewById(R.id.content);
        viewGroup.removeAllViews();
        viewGroup.addView(view, layoutParams);
        this.f33384H.m11387a(this.f33416l.getCallback());
    }

    @Override // p080e.AbstractC5274f
    /* JADX INFO: renamed from: x */
    public final void mo11348x(int i10) {
        if (this.f33420o0 != i10) {
            this.f33420o0 = i10;
            if (this.f33415k0) {
                m11356B(true, true);
            }
        }
    }

    @Override // p080e.AbstractC5274f
    /* JADX INFO: renamed from: y */
    public final void mo11349y(MaterialToolbar materialToolbar) {
        Object obj = this.f33412j;
        if (obj instanceof Activity) {
            m11368P();
            AbstractC5269a abstractC5269a = this.f33386J;
            if (abstractC5269a instanceof C5292x) {
                throw new IllegalStateException("This Activity already has an action bar supplied by the window decor. Do not request Window.FEATURE_SUPPORT_ACTION_BAR and set windowActionBar to false in your theme to use a Toolbar instead.");
            }
            this.f33387K = null;
            if (abstractC5269a != null) {
                abstractC5269a.mo11316h();
            }
            this.f33386J = null;
            if (materialToolbar != null) {
                C5289u c5289u = new C5289u(materialToolbar, obj instanceof Activity ? ((Activity) obj).getTitle() : this.f33388L, this.f33384H);
                this.f33386J = c5289u;
                this.f33384H.f33437b = c5289u.f33506c;
                materialToolbar.setBackInvokedCallbackEnabled(true);
            } else {
                this.f33384H.f33437b = null;
            }
            mo11337k();
        }
    }

    @Override // p080e.AbstractC5274f
    /* JADX INFO: renamed from: z */
    public final void mo11350z(int i10) {
        this.f33421p0 = i10;
    }
}
