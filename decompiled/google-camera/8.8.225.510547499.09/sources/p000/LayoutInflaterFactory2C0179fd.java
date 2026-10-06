package p000;

import android.R;
import android.app.Activity;
import android.app.Dialog;
import android.app.UiModeManager;
import android.content.ComponentName;
import android.content.Context;
import android.content.ContextWrapper;
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
import android.support.v7.app.AppCompatViewInflater;
import android.support.v7.view.menu.ExpandedMenuView;
import android.support.v7.widget.ActionBarContextView;
import android.support.v7.widget.AppCompatImageView;
import android.support.v7.widget.ContentFrameLayout;
import android.text.TextUtils;
import android.util.AndroidRuntimeException;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import android.view.KeyCharacterMap;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
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
import androidx.wear.ambient.AmbientDelegate;
import androidx.wear.ambient.AmbientMode;
import com.google.android.apps.camera.bottombar.C0100R;
import com.google.android.apps.camera.evcomp.AZCp.HRLmc;
import com.google.android.libraries.camera.jni.graphics.bVLS.aJFPpVSaoDO;
import com.google.lens.sdk.LensApi;
import java.lang.ref.WeakReference;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Calendar;

/* JADX INFO: renamed from: fd */
/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class LayoutInflaterFactory2C0179fd extends AbstractC0160el implements LayoutInflater.Factory2, InterfaceC0223gu {

    /* JADX INFO: renamed from: L */
    private static final C1117xf f21338L = new C1117xf();

    /* JADX INFO: renamed from: M */
    private static final int[] f21339M = {R.attr.windowBackground};

    /* JADX INFO: renamed from: f */
    public static final boolean f21340f = !aJFPpVSaoDO.FmzPYSeoVWW.equals(Build.FINGERPRINT);

    /* JADX INFO: renamed from: g */
    public static final boolean f21341g = true;

    /* JADX INFO: renamed from: A */
    boolean f21342A;

    /* JADX INFO: renamed from: B */
    public C0177fb f21343B;

    /* JADX INFO: renamed from: C */
    public boolean f21344C;

    /* JADX INFO: renamed from: D */
    boolean f21345D;

    /* JADX INFO: renamed from: E */
    public Configuration f21346E;

    /* JADX INFO: renamed from: F */
    public int f21347F;

    /* JADX INFO: renamed from: G */
    public boolean f21348G;

    /* JADX INFO: renamed from: H */
    public int f21349H;

    /* JADX INFO: renamed from: I */
    public Rect f21350I;

    /* JADX INFO: renamed from: J */
    public Rect f21351J;

    /* JADX INFO: renamed from: N */
    private CharSequence f21353N;

    /* JADX INFO: renamed from: O */
    private C0178fc f21354O;

    /* JADX INFO: renamed from: P */
    private TextView f21355P;

    /* JADX INFO: renamed from: Q */
    private boolean f21356Q;

    /* JADX INFO: renamed from: R */
    private boolean f21357R;

    /* JADX INFO: renamed from: S */
    private boolean f21358S;

    /* JADX INFO: renamed from: T */
    private C0177fb[] f21359T;

    /* JADX INFO: renamed from: U */
    private boolean f21360U;

    /* JADX INFO: renamed from: V */
    private boolean f21361V;

    /* JADX INFO: renamed from: W */
    private int f21362W;

    /* JADX INFO: renamed from: X */
    private int f21363X;

    /* JADX INFO: renamed from: Y */
    private boolean f21364Y;

    /* JADX INFO: renamed from: Z */
    private AbstractC0173ey f21365Z;

    /* JADX INFO: renamed from: aa */
    private AbstractC0173ey f21366aa;

    /* JADX INFO: renamed from: ac */
    private boolean f21368ac;

    /* JADX INFO: renamed from: ad */
    private AppCompatViewInflater f21369ad;

    /* JADX INFO: renamed from: ae */
    private OnBackInvokedDispatcher f21370ae;

    /* JADX INFO: renamed from: af */
    private OnBackInvokedCallback f21371af;

    /* JADX INFO: renamed from: ag */
    private C0178fc f21372ag;

    /* JADX INFO: renamed from: h */
    public final Object f21373h;

    /* JADX INFO: renamed from: i */
    final Context f21374i;

    /* JADX INFO: renamed from: j */
    public Window f21375j;

    /* JADX INFO: renamed from: k */
    public C0170ev f21376k;

    /* JADX INFO: renamed from: l */
    public AbstractC0146dy f21377l;

    /* JADX INFO: renamed from: m */
    public MenuInflater f21378m;

    /* JADX INFO: renamed from: n */
    public InterfaceC0757jx f21379n;

    /* JADX INFO: renamed from: o */
    AbstractC0199fx f21380o;

    /* JADX INFO: renamed from: p */
    public ActionBarContextView f21381p;

    /* JADX INFO: renamed from: q */
    public PopupWindow f21382q;

    /* JADX INFO: renamed from: r */
    public Runnable f21383r;

    /* JADX INFO: renamed from: t */
    public boolean f21385t;

    /* JADX INFO: renamed from: u */
    ViewGroup f21386u;

    /* JADX INFO: renamed from: v */
    public View f21387v;

    /* JADX INFO: renamed from: w */
    boolean f21388w;

    /* JADX INFO: renamed from: x */
    boolean f21389x;

    /* JADX INFO: renamed from: y */
    boolean f21390y;

    /* JADX INFO: renamed from: z */
    boolean f21391z;

    /* JADX INFO: renamed from: K */
    public bkn f21352K = null;

    /* JADX INFO: renamed from: s */
    public boolean f21384s = true;

    /* JADX INFO: renamed from: ab */
    private final Runnable f21367ab = new RunnableC0059be(this, 8);

    public LayoutInflaterFactory2C0179fd(Context context, Window window, Object obj) {
        ActivityC0157ei activityC0157ei = null;
        this.f21362W = -100;
        this.f21374i = context;
        this.f21373h = obj;
        if (obj instanceof Dialog) {
            while (context != null) {
                if (!(context instanceof ActivityC0157ei)) {
                    if (!(context instanceof ContextWrapper)) {
                        break;
                    } else {
                        context = ((ContextWrapper) context).getBaseContext();
                    }
                } else {
                    activityC0157ei = (ActivityC0157ei) context;
                    break;
                }
            }
            if (activityC0157ei != null) {
                this.f21362W = ((LayoutInflaterFactory2C0179fd) activityC0157ei.m7343j()).f21362W;
            }
        }
        if (this.f21362W == -100) {
            C1117xf c1117xf = f21338L;
            Integer num = (Integer) c1117xf.get(this.f21373h.getClass().getName());
            if (num != null) {
                this.f21362W = num.intValue();
                c1117xf.remove(this.f21373h.getClass().getName());
            }
        }
        if (window != null) {
            m8229S(window);
        }
        C0271io.m11553f();
    }

    /* JADX INFO: renamed from: Q */
    private final AbstractC0173ey m8227Q(Context context) {
        if (this.f21366aa == null) {
            this.f21366aa = new C0171ew(this, context);
        }
        return this.f21366aa;
    }

    /* JADX INFO: renamed from: R */
    private final AbstractC0173ey m8228R(Context context) {
        if (this.f21365Z == null) {
            if (C1058va.f47801d == null) {
                Context applicationContext = context.getApplicationContext();
                C1058va.f47801d = new C1058va(applicationContext, (LocationManager) applicationContext.getSystemService("location"));
            }
            this.f21365Z = new C0174ez(this, C1058va.f47801d, null, null);
        }
        return this.f21365Z;
    }

    /* JADX INFO: renamed from: S */
    private final void m8229S(Window window) {
        if (this.f21375j != null) {
            throw new IllegalStateException("AppCompat has already installed itself into the Window");
        }
        Window.Callback callback = window.getCallback();
        if (callback instanceof C0170ev) {
            throw new IllegalStateException("AppCompat has already installed itself into the Window");
        }
        C0170ev c0170ev = new C0170ev(this, callback);
        this.f21376k = c0170ev;
        window.setCallback(c0170ev);
        AmbientDelegate ambientDelegateM1567C = AmbientDelegate.m1567C(this.f21374i, null, f21339M);
        Drawable drawableM1619v = ambientDelegateM1567C.m1619v(0);
        if (drawableM1619v != null) {
            window.setBackgroundDrawable(drawableM1619v);
        }
        ambientDelegateM1567C.m1622y();
        this.f21375j = window;
        if (this.f21370ae == null) {
            Object obj = this.f21373h;
            if (!(obj instanceof Activity) || ((Activity) obj).getWindow() == null) {
                this.f21370ae = null;
            } else {
                this.f21370ae = C0169eu.m7872b((Activity) this.f21373h);
            }
            m8238E();
        }
    }

    /* JADX INFO: renamed from: T */
    private final void m8230T() {
        if (this.f21375j == null) {
            Object obj = this.f21373h;
            if (obj instanceof Activity) {
                m8229S(((Activity) obj).getWindow());
            }
        }
        if (this.f21375j == null) {
            throw new IllegalStateException("We have not been given a Window");
        }
    }

    /* JADX INFO: renamed from: U */
    private final void m8231U(int i) {
        this.f21349H = (1 << i) | this.f21349H;
        if (this.f21348G) {
            return;
        }
        afb.m428i(this.f21375j.getDecorView(), this.f21367ab);
        this.f21348G = true;
    }

    /* JADX INFO: renamed from: V */
    private final void m8232V(C0177fb c0177fb, KeyEvent keyEvent) {
        int i;
        ViewGroup.LayoutParams layoutParams;
        if (c0177fb.f21182m || this.f21345D) {
            return;
        }
        if (c0177fb.f21170a == 0 && (this.f21374i.getResources().getConfiguration().screenLayout & 15) == 4) {
            return;
        }
        Window.Callback callbackM8254u = m8254u();
        if (callbackM8254u != null && !callbackM8254u.onMenuOpened(c0177fb.f21170a, c0177fb.f21177h)) {
            m8258y(c0177fb, true);
            return;
        }
        WindowManager windowManager = (WindowManager) this.f21374i.getSystemService("window");
        if (windowManager != null && m8242I(c0177fb, keyEvent)) {
            ViewGroup viewGroup = c0177fb.f21174e;
            if (viewGroup == null || c0177fb.f21183n) {
                if (viewGroup == null) {
                    Context contextM8252s = m8252s();
                    TypedValue typedValue = new TypedValue();
                    Resources.Theme themeNewTheme = contextM8252s.getResources().newTheme();
                    themeNewTheme.setTo(contextM8252s.getTheme());
                    themeNewTheme.resolveAttribute(C0100R.attr.actionBarPopupTheme, typedValue, true);
                    if (typedValue.resourceId != 0) {
                        themeNewTheme.applyStyle(typedValue.resourceId, true);
                    }
                    themeNewTheme.resolveAttribute(C0100R.attr.panelMenuListTheme, typedValue, true);
                    if (typedValue.resourceId != 0) {
                        themeNewTheme.applyStyle(typedValue.resourceId, true);
                    } else {
                        themeNewTheme.applyStyle(C0100R.style.Theme_AppCompat_CompactMenu, true);
                    }
                    C0931qi c0931qi = new C0931qi(contextM8252s, 0);
                    c0931qi.getTheme().setTo(themeNewTheme);
                    c0177fb.f21179j = c0931qi;
                    TypedArray typedArrayObtainStyledAttributes = c0931qi.obtainStyledAttributes(C0193fr.f23266j);
                    c0177fb.f21171b = typedArrayObtainStyledAttributes.getResourceId(86, 0);
                    c0177fb.f21173d = typedArrayObtainStyledAttributes.getResourceId(1, 0);
                    typedArrayObtainStyledAttributes.recycle();
                    c0177fb.f21174e = new C0176fa(this, c0177fb.f21179j);
                    c0177fb.f21172c = 81;
                    if (c0177fb.f21174e == null) {
                        return;
                    }
                } else if (c0177fb.f21183n && viewGroup.getChildCount() > 0) {
                    c0177fb.f21174e.removeAllViews();
                }
                View view = c0177fb.f21176g;
                if (view == null) {
                    if (c0177fb.f21177h != null) {
                        if (this.f21354O == null) {
                            this.f21354O = new C0178fc(this, 0);
                        }
                        C0178fc c0178fc = this.f21354O;
                        if (c0177fb.f21178i == null) {
                            c0177fb.f21178i = new C0221gs(c0177fb.f21179j);
                            C0221gs c0221gs = c0177fb.f21178i;
                            c0221gs.f26205e = c0178fc;
                            c0177fb.f21177h.m9827g(c0221gs);
                        }
                        C0221gs c0221gs2 = c0177fb.f21178i;
                        ViewGroup viewGroup2 = c0177fb.f21174e;
                        if (c0221gs2.f26204d == null) {
                            c0221gs2.f26204d = (ExpandedMenuView) c0221gs2.f26202b.inflate(C0100R.layout.abc_expanded_menu_layout, viewGroup2, false);
                            if (c0221gs2.f26206f == null) {
                                c0221gs2.f26206f = new C0220gr(c0221gs2);
                            }
                            c0221gs2.f26204d.setAdapter((ListAdapter) c0221gs2.f26206f);
                            c0221gs2.f26204d.setOnItemClickListener(c0221gs2);
                        }
                        c0177fb.f21175f = c0221gs2.f26204d;
                        if (c0177fb.f21175f != null) {
                        }
                    }
                    c0177fb.f21183n = true;
                    return;
                }
                c0177fb.f21175f = view;
                if (c0177fb.f21175f != null && (c0177fb.f21176g != null || c0177fb.f21178i.m9696a().getCount() > 0)) {
                    ViewGroup.LayoutParams layoutParams2 = c0177fb.f21175f.getLayoutParams();
                    if (layoutParams2 == null) {
                        layoutParams2 = new ViewGroup.LayoutParams(-2, -2);
                    }
                    c0177fb.f21174e.setBackgroundResource(c0177fb.f21171b);
                    ViewParent parent = c0177fb.f21175f.getParent();
                    if (parent instanceof ViewGroup) {
                        ((ViewGroup) parent).removeView(c0177fb.f21175f);
                    }
                    c0177fb.f21174e.addView(c0177fb.f21175f, layoutParams2);
                    if (c0177fb.f21175f.hasFocus()) {
                        i = -2;
                    } else {
                        c0177fb.f21175f.requestFocus();
                        i = -2;
                    }
                }
                c0177fb.f21183n = true;
                return;
            }
            View view2 = c0177fb.f21176g;
            i = (view2 == null || (layoutParams = view2.getLayoutParams()) == null || layoutParams.width != -1) ? -2 : -1;
            c0177fb.f21181l = false;
            WindowManager.LayoutParams layoutParams3 = new WindowManager.LayoutParams(i, -2, 0, 0, 1002, 8519680, -3);
            layoutParams3.gravity = c0177fb.f21172c;
            layoutParams3.windowAnimations = c0177fb.f21173d;
            windowManager.addView(c0177fb.f21174e, layoutParams3);
            c0177fb.f21182m = true;
            if (c0177fb.f21170a == 0) {
                m8238E();
            }
        }
    }

    /* JADX INFO: renamed from: W */
    private final void m8233W() {
        if (this.f21385t) {
            throw new AndroidRuntimeException("Window feature must be requested before adding content");
        }
    }

    /* JADX INFO: renamed from: A */
    public final void m8234A() {
        bkn bknVar = this.f21352K;
        if (bknVar != null) {
            bknVar.m2593n();
        }
    }

    /* JADX INFO: renamed from: B */
    public final void m8235B() {
        ViewGroup viewGroup;
        if (this.f21385t) {
            return;
        }
        TypedArray typedArrayObtainStyledAttributes = this.f21374i.obtainStyledAttributes(C0193fr.f23266j);
        if (!typedArrayObtainStyledAttributes.hasValue(117)) {
            typedArrayObtainStyledAttributes.recycle();
            throw new IllegalStateException("You need to use a Theme.AppCompat theme (or descendant) with this activity.");
        }
        if (typedArrayObtainStyledAttributes.getBoolean(C0100R.styleable.AppCompatTheme_windowNoTitle, false)) {
            mo7445p(1);
        } else if (typedArrayObtainStyledAttributes.getBoolean(117, false)) {
            mo7445p(108);
        }
        if (typedArrayObtainStyledAttributes.getBoolean(118, false)) {
            mo7445p(109);
        }
        if (typedArrayObtainStyledAttributes.getBoolean(119, false)) {
            mo7445p(10);
        }
        this.f21391z = typedArrayObtainStyledAttributes.getBoolean(0, false);
        typedArrayObtainStyledAttributes.recycle();
        m8230T();
        this.f21375j.getDecorView();
        LayoutInflater layoutInflaterFrom = LayoutInflater.from(this.f21374i);
        if (this.f21342A) {
            viewGroup = this.f21390y ? (ViewGroup) layoutInflaterFrom.inflate(C0100R.layout.abc_screen_simple_overlay_action_mode, (ViewGroup) null) : (ViewGroup) layoutInflaterFrom.inflate(C0100R.layout.abc_screen_simple, (ViewGroup) null);
        } else if (this.f21391z) {
            viewGroup = (ViewGroup) layoutInflaterFrom.inflate(C0100R.layout.abc_dialog_title_material, (ViewGroup) null);
            this.f21389x = false;
            this.f21388w = false;
        } else if (this.f21388w) {
            TypedValue typedValue = new TypedValue();
            this.f21374i.getTheme().resolveAttribute(C0100R.attr.actionBarTheme, typedValue, true);
            viewGroup = (ViewGroup) LayoutInflater.from(typedValue.resourceId != 0 ? new C0931qi(this.f21374i, typedValue.resourceId) : this.f21374i).inflate(C0100R.layout.abc_screen_toolbar, (ViewGroup) null);
            InterfaceC0757jx interfaceC0757jx = (InterfaceC0757jx) viewGroup.findViewById(C0100R.id.decor_content_parent);
            this.f21379n = interfaceC0757jx;
            interfaceC0757jx.mo1061n(m8254u());
            if (this.f21389x) {
                this.f21379n.mo1055c(109);
            }
            if (this.f21356Q) {
                this.f21379n.mo1055c(2);
            }
            if (this.f21357R) {
                this.f21379n.mo1055c(5);
            }
        } else {
            viewGroup = null;
        }
        if (viewGroup == null) {
            throw new IllegalArgumentException("AppCompat does not support the current theme features: { windowActionBar: " + this.f21388w + ", windowActionBarOverlay: " + this.f21389x + ", android:windowIsFloating: " + this.f21391z + ", windowActionModeOverlay: " + this.f21390y + ", windowNoTitle: " + this.f21342A + " }");
        }
        afh.m483n(viewGroup, new C0161em(this));
        if (this.f21379n == null) {
            this.f21355P = (TextView) viewGroup.findViewById(C0100R.id.title);
        }
        Method method = C0864nw.f44818a;
        try {
            Method method2 = viewGroup.getClass().getMethod("makeOptionalFitsSystemWindows", new Class[0]);
            if (!method2.isAccessible()) {
                method2.setAccessible(true);
            }
            method2.invoke(viewGroup, new Object[0]);
        } catch (IllegalAccessException e) {
        } catch (NoSuchMethodException e2) {
        } catch (InvocationTargetException e3) {
        }
        ContentFrameLayout contentFrameLayout = (ContentFrameLayout) viewGroup.findViewById(C0100R.id.action_bar_activity_content);
        ViewGroup viewGroup2 = (ViewGroup) this.f21375j.findViewById(R.id.content);
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
        this.f21375j.setContentView(viewGroup);
        contentFrameLayout.f1016i = new AmbientMode.AmbientController(this);
        this.f21386u = viewGroup;
        CharSequence charSequenceM8255v = m8255v();
        if (!TextUtils.isEmpty(charSequenceM8255v)) {
            InterfaceC0757jx interfaceC0757jx2 = this.f21379n;
            if (interfaceC0757jx2 != null) {
                interfaceC0757jx2.mo1062o(charSequenceM8255v);
            } else {
                AbstractC0146dy abstractC0146dy = this.f21377l;
                if (abstractC0146dy != null) {
                    abstractC0146dy.mo6903j(charSequenceM8255v);
                } else {
                    TextView textView = this.f21355P;
                    if (textView != null) {
                        textView.setText(charSequenceM8255v);
                    }
                }
            }
        }
        ContentFrameLayout contentFrameLayout2 = (ContentFrameLayout) this.f21386u.findViewById(R.id.content);
        View decorView = this.f21375j.getDecorView();
        contentFrameLayout2.f1015h.set(decorView.getPaddingLeft(), decorView.getPaddingTop(), decorView.getPaddingRight(), decorView.getPaddingBottom());
        if (afe.m462f(contentFrameLayout2)) {
            contentFrameLayout2.requestLayout();
        }
        TypedArray typedArrayObtainStyledAttributes2 = this.f21374i.obtainStyledAttributes(C0193fr.f23266j);
        if (contentFrameLayout2.f1009b == null) {
            contentFrameLayout2.f1009b = new TypedValue();
        }
        typedArrayObtainStyledAttributes2.getValue(C0100R.styleable.AppCompatTheme_windowMinWidthMajor, contentFrameLayout2.f1009b);
        if (contentFrameLayout2.f1010c == null) {
            contentFrameLayout2.f1010c = new TypedValue();
        }
        typedArrayObtainStyledAttributes2.getValue(C0100R.styleable.AppCompatTheme_windowMinWidthMinor, contentFrameLayout2.f1010c);
        if (typedArrayObtainStyledAttributes2.hasValue(122)) {
            if (contentFrameLayout2.f1011d == null) {
                contentFrameLayout2.f1011d = new TypedValue();
            }
            typedArrayObtainStyledAttributes2.getValue(122, contentFrameLayout2.f1011d);
        }
        if (typedArrayObtainStyledAttributes2.hasValue(123)) {
            if (contentFrameLayout2.f1012e == null) {
                contentFrameLayout2.f1012e = new TypedValue();
            }
            typedArrayObtainStyledAttributes2.getValue(123, contentFrameLayout2.f1012e);
        }
        if (typedArrayObtainStyledAttributes2.hasValue(120)) {
            if (contentFrameLayout2.f1013f == null) {
                contentFrameLayout2.f1013f = new TypedValue();
            }
            typedArrayObtainStyledAttributes2.getValue(120, contentFrameLayout2.f1013f);
        }
        if (typedArrayObtainStyledAttributes2.hasValue(121)) {
            if (contentFrameLayout2.f1014g == null) {
                contentFrameLayout2.f1014g = new TypedValue();
            }
            typedArrayObtainStyledAttributes2.getValue(121, contentFrameLayout2.f1014g);
        }
        typedArrayObtainStyledAttributes2.recycle();
        contentFrameLayout2.requestLayout();
        this.f21385t = true;
        C0177fb c0177fbM8246M = m8246M(0);
        if (this.f21345D || c0177fbM8246M.f21177h != null) {
            return;
        }
        m8231U(108);
    }

    /* JADX INFO: renamed from: C */
    public final void m8236C() {
        m8235B();
        if (this.f21388w && this.f21377l == null) {
            Object obj = this.f21373h;
            if (obj instanceof Activity) {
                this.f21377l = new C0192fq((Activity) this.f21373h, this.f21389x);
            } else if (obj instanceof Dialog) {
                this.f21377l = new C0192fq((Dialog) this.f21373h);
            }
            AbstractC0146dy abstractC0146dy = this.f21377l;
            if (abstractC0146dy != null) {
                abstractC0146dy.mo6899f(this.f21368ac);
            }
        }
    }

    @Override // p000.InterfaceC0223gu
    /* JADX INFO: renamed from: D */
    public final void mo8237D(C0225gw c0225gw) {
        InterfaceC0757jx interfaceC0757jx = this.f21379n;
        if (interfaceC0757jx == null || !interfaceC0757jx.mo1063p() || (ViewConfiguration.get(this.f21374i).hasPermanentMenuKey() && !this.f21379n.mo1065r())) {
            C0177fb c0177fbM8246M = m8246M(0);
            c0177fbM8246M.f21183n = true;
            m8258y(c0177fbM8246M, false);
            m8232V(c0177fbM8246M, null);
            return;
        }
        Window.Callback callbackM8254u = m8254u();
        if (this.f21379n.mo1066s()) {
            this.f21379n.mo1064q();
            if (this.f21345D) {
                return;
            }
            callbackM8254u.onPanelClosed(108, m8246M(0).f21177h);
            return;
        }
        if (callbackM8254u == null || this.f21345D) {
            return;
        }
        if (this.f21348G && (1 & this.f21349H) != 0) {
            this.f21375j.getDecorView().removeCallbacks(this.f21367ab);
            this.f21367ab.run();
        }
        C0177fb c0177fbM8246M2 = m8246M(0);
        C0225gw c0225gw2 = c0177fbM8246M2.f21177h;
        if (c0225gw2 == null || c0177fbM8246M2.f21184o || !callbackM8254u.onPreparePanel(0, c0177fbM8246M2.f21176g, c0225gw2)) {
            return;
        }
        callbackM8254u.onMenuOpened(108, c0177fbM8246M2.f21177h);
        this.f21379n.mo1067u();
    }

    /* JADX WARN: Code duplicated, block: B:72:0x00e3  */
    /* JADX WARN: Code duplicated, block: B:73:0x00e8  */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x00c5, code lost:
    
        if (m8242I(r0, r6) != false) goto L66;
     */
    /* JADX INFO: renamed from: F */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    final boolean m8239F(KeyEvent keyEvent) {
        boolean zMo1064q;
        AudioManager audioManager;
        Object obj = this.f21373h;
        if (((obj instanceof aen) || (obj instanceof DialogC0181ff)) && this.f21375j.getDecorView() != null) {
            int[] iArr = afq.f274a;
        }
        if (keyEvent.getKeyCode() == 82) {
            C0170ev c0170ev = this.f21376k;
            Window.Callback callback = this.f21375j.getCallback();
            try {
                c0170ev.f20274a = true;
                boolean zDispatchKeyEvent = callback.dispatchKeyEvent(keyEvent);
                c0170ev.f20274a = false;
                if (zDispatchKeyEvent) {
                    return true;
                }
            } catch (Throwable th) {
                c0170ev.f20274a = false;
                throw th;
            }
        }
        int keyCode = keyEvent.getKeyCode();
        if (keyEvent.getAction() == 0) {
            switch (keyCode) {
                case 4:
                    this.f21360U = (keyEvent.getFlags() & 128) != 0;
                    return false;
                case 82:
                    if (keyEvent.getRepeatCount() == 0) {
                        C0177fb c0177fbM8246M = m8246M(0);
                        if (!c0177fbM8246M.f21182m) {
                            m8242I(c0177fbM8246M, keyEvent);
                        }
                    }
                    return true;
                default:
                    return false;
            }
        }
        switch (keyCode) {
            case 4:
                return m8240G();
            case 82:
                if (this.f21380o == null) {
                    C0177fb c0177fbM8246M2 = m8246M(0);
                    InterfaceC0757jx interfaceC0757jx = this.f21379n;
                    if (interfaceC0757jx == null || !interfaceC0757jx.mo1063p() || ViewConfiguration.get(this.f21374i).hasPermanentMenuKey()) {
                        boolean z = c0177fbM8246M2.f21182m;
                        if (!z && !c0177fbM8246M2.f21181l) {
                            if (c0177fbM8246M2.f21180k) {
                                if (c0177fbM8246M2.f21184o) {
                                    c0177fbM8246M2.f21180k = false;
                                }
                                m8232V(c0177fbM8246M2, keyEvent);
                                break;
                            }
                            return true;
                        }
                        m8258y(c0177fbM8246M2, true);
                        zMo1064q = z;
                        audioManager = (AudioManager) this.f21374i.getApplicationContext().getSystemService("audio");
                        if (audioManager != null) {
                            audioManager.playSoundEffect(0);
                            return true;
                        }
                        Log.w("AppCompatDelegate", "Couldn't get audio manager");
                        return true;
                    }
                    if (!this.f21379n.mo1066s()) {
                        if (!this.f21345D && m8242I(c0177fbM8246M2, keyEvent)) {
                            zMo1064q = this.f21379n.mo1067u();
                        }
                        return true;
                    }
                    zMo1064q = this.f21379n.mo1064q();
                    if (zMo1064q) {
                        audioManager = (AudioManager) this.f21374i.getApplicationContext().getSystemService("audio");
                        if (audioManager != null) {
                            audioManager.playSoundEffect(0);
                            return true;
                        }
                        Log.w("AppCompatDelegate", "Couldn't get audio manager");
                    }
                    return true;
                }
            default:
                return false;
        }
    }

    /* JADX INFO: renamed from: G */
    public final boolean m8240G() {
        boolean z = this.f21360U;
        this.f21360U = false;
        C0177fb c0177fbM8246M = m8246M(0);
        if (c0177fbM8246M.f21182m) {
            if (!z) {
                m8258y(c0177fbM8246M, true);
            }
            return true;
        }
        AbstractC0199fx abstractC0199fx = this.f21380o;
        if (abstractC0199fx != null) {
            abstractC0199fx.mo8648f();
            return true;
        }
        AbstractC0146dy abstractC0146dyMo7433b = mo7433b();
        return abstractC0146dyMo7433b != null && abstractC0146dyMo7433b.mo6905l();
    }

    @Override // p000.InterfaceC0223gu
    /* JADX INFO: renamed from: H */
    public final boolean mo8241H(C0225gw c0225gw, MenuItem menuItem) {
        C0177fb c0177fbM8253t;
        Window.Callback callbackM8254u = m8254u();
        if (callbackM8254u == null || this.f21345D || (c0177fbM8253t = m8253t(c0225gw.mo9821a())) == null) {
            return false;
        }
        return callbackM8254u.onMenuItemSelected(c0177fbM8253t.f21170a, menuItem);
    }

    /* JADX INFO: renamed from: I */
    public final boolean m8242I(C0177fb c0177fb, KeyEvent keyEvent) {
        InterfaceC0757jx interfaceC0757jx;
        InterfaceC0757jx interfaceC0757jx2;
        Resources.Theme themeNewTheme;
        InterfaceC0757jx interfaceC0757jx3;
        InterfaceC0757jx interfaceC0757jx4;
        if (this.f21345D) {
            return false;
        }
        if (c0177fb.f21180k) {
            return true;
        }
        C0177fb c0177fb2 = this.f21343B;
        if (c0177fb2 != null && c0177fb2 != c0177fb) {
            m8258y(c0177fb2, false);
        }
        Window.Callback callbackM8254u = m8254u();
        if (callbackM8254u != null) {
            c0177fb.f21176g = callbackM8254u.onCreatePanelView(c0177fb.f21170a);
        }
        int i = c0177fb.f21170a;
        boolean z = i == 0 || i == 108;
        if (z && (interfaceC0757jx4 = this.f21379n) != null) {
            interfaceC0757jx4.mo1060m();
        }
        if (c0177fb.f21176g == null && (!z || !(this.f21377l instanceof C0186fk))) {
            C0225gw c0225gw = c0177fb.f21177h;
            if (c0225gw == null || c0177fb.f21184o) {
                if (c0225gw == null) {
                    Context context = this.f21374i;
                    int i2 = c0177fb.f21170a;
                    if ((i2 == 0 || i2 == 108) && this.f21379n != null) {
                        TypedValue typedValue = new TypedValue();
                        Resources.Theme theme = context.getTheme();
                        theme.resolveAttribute(C0100R.attr.actionBarTheme, typedValue, true);
                        if (typedValue.resourceId != 0) {
                            themeNewTheme = context.getResources().newTheme();
                            themeNewTheme.setTo(theme);
                            themeNewTheme.applyStyle(typedValue.resourceId, true);
                            themeNewTheme.resolveAttribute(C0100R.attr.actionBarWidgetTheme, typedValue, true);
                        } else {
                            theme.resolveAttribute(C0100R.attr.actionBarWidgetTheme, typedValue, true);
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
                            C0931qi c0931qi = new C0931qi(context, 0);
                            c0931qi.getTheme().setTo(themeNewTheme);
                            context = c0931qi;
                        }
                    }
                    C0225gw c0225gw2 = new C0225gw(context);
                    c0225gw2.f26548b = this;
                    c0177fb.m8090a(c0225gw2);
                    if (c0177fb.f21177h == null) {
                        return false;
                    }
                }
                if (z && (interfaceC0757jx2 = this.f21379n) != null) {
                    if (this.f21372ag == null) {
                        this.f21372ag = new C0178fc(this, 1);
                    }
                    interfaceC0757jx2.mo1059l(c0177fb.f21177h, this.f21372ag);
                }
                c0177fb.f21177h.m9839s();
                if (!callbackM8254u.onCreatePanelMenu(c0177fb.f21170a, c0177fb.f21177h)) {
                    c0177fb.m8090a(null);
                    if (z && (interfaceC0757jx = this.f21379n) != null) {
                        interfaceC0757jx.mo1059l(null, this.f21372ag);
                    }
                    return false;
                }
                c0177fb.f21184o = false;
            }
            c0177fb.f21177h.m9839s();
            Bundle bundle = c0177fb.f21185p;
            if (bundle != null) {
                c0177fb.f21177h.m9834n(bundle);
                c0177fb.f21185p = null;
            }
            if (!callbackM8254u.onPreparePanel(0, c0177fb.f21176g, c0177fb.f21177h)) {
                if (z && (interfaceC0757jx3 = this.f21379n) != null) {
                    interfaceC0757jx3.mo1059l(null, this.f21372ag);
                }
                c0177fb.f21177h.m9838r();
                return false;
            }
            c0177fb.f21177h.setQwertyMode(KeyCharacterMap.load(keyEvent != null ? keyEvent.getDeviceId() : -1).getKeyboardType() != 1);
            c0177fb.f21177h.m9838r();
        }
        c0177fb.f21180k = true;
        c0177fb.f21181l = false;
        this.f21343B = c0177fb;
        return true;
    }

    /* JADX INFO: renamed from: J */
    public final boolean m8243J() {
        ViewGroup viewGroup;
        return this.f21385t && (viewGroup = this.f21386u) != null && afe.m462f(viewGroup);
    }

    /* JADX INFO: renamed from: K */
    public final void m8244K() {
        m8248O(true);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:64:0x0106  */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX INFO: renamed from: L */
    public final View m8245L(String str, Context context, AttributeSet attributeSet) {
        View viewMo1026e;
        if (this.f21369ad == null) {
            String string = this.f21374i.obtainStyledAttributes(C0193fr.f23266j).getString(116);
            if (string == null) {
                this.f21369ad = new AppCompatViewInflater();
            } else {
                try {
                    this.f21369ad = (AppCompatViewInflater) this.f21374i.getClassLoader().loadClass(string).getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
                } catch (Throwable th) {
                    this.f21369ad = new AppCompatViewInflater();
                }
            }
        }
        AppCompatViewInflater appCompatViewInflater = this.f21369ad;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C0193fr.f23281y, 0, 0);
        byte b = 4;
        int resourceId = typedArrayObtainStyledAttributes.getResourceId(4, 0);
        typedArrayObtainStyledAttributes.recycle();
        Context c0931qi = (resourceId == 0 || ((context instanceof C0931qi) && ((C0931qi) context).f47480a == resourceId)) ? context : new C0931qi(context, resourceId);
        switch (str.hashCode()) {
            case -1946472170:
                if (!str.equals("RatingBar")) {
                    b = -1;
                } else {
                    b = 11;
                }
                break;
            case -1455429095:
                if (!str.equals("CheckedTextView")) {
                    b = -1;
                } else {
                    b = 8;
                }
                break;
            case -1346021293:
                if (!str.equals("MultiAutoCompleteTextView")) {
                    b = -1;
                } else {
                    b = 10;
                }
                break;
            case -938935918:
                if (!str.equals("TextView")) {
                    b = -1;
                } else {
                    b = 0;
                }
                break;
            case -937446323:
                if (!str.equals("ImageButton")) {
                    b = -1;
                } else {
                    b = 5;
                }
                break;
            case -658531749:
                if (!str.equals("SeekBar")) {
                    b = -1;
                } else {
                    b = 12;
                }
                break;
            case -339785223:
                if (!str.equals("Spinner")) {
                    b = -1;
                }
                break;
            case 776382189:
                if (!str.equals("RadioButton")) {
                    b = -1;
                } else {
                    b = 7;
                }
                break;
            case 799298502:
                if (!str.equals("ToggleButton")) {
                    b = -1;
                } else {
                    b = 13;
                }
                break;
            case 1125864064:
                if (!str.equals("ImageView")) {
                    b = -1;
                } else {
                    b = 1;
                }
                break;
            case 1413872058:
                if (!str.equals("AutoCompleteTextView")) {
                    b = -1;
                } else {
                    b = 9;
                }
                break;
            case 1601505219:
                if (!str.equals("CheckBox")) {
                    b = -1;
                } else {
                    b = 6;
                }
                break;
            case 1666676343:
                if (!str.equals("EditText")) {
                    b = -1;
                } else {
                    b = 3;
                }
                break;
            case 2001146706:
                if (!str.equals("Button")) {
                    b = -1;
                } else {
                    b = 2;
                }
                break;
            default:
                b = -1;
                break;
        }
        View view = null;
        switch (b) {
            case 0:
                viewMo1026e = appCompatViewInflater.mo1026e(c0931qi, attributeSet);
                break;
            case 1:
                viewMo1026e = new AppCompatImageView(c0931qi, attributeSet);
                break;
            case 2:
                viewMo1026e = appCompatViewInflater.mo1023b(c0931qi, attributeSet);
                break;
            case 3:
                viewMo1026e = new C0272ip(c0931qi, attributeSet);
                break;
            case 4:
                viewMo1026e = new C0743jj(c0931qi, attributeSet);
                break;
            case 5:
                viewMo1026e = new C0273iq(c0931qi, attributeSet);
                break;
            case 6:
                viewMo1026e = appCompatViewInflater.mo1024c(c0931qi, attributeSet);
                break;
            case 7:
                viewMo1026e = appCompatViewInflater.mo1025d(c0931qi, attributeSet);
                break;
            case 8:
                viewMo1026e = new C0268il(c0931qi, attributeSet);
                break;
            case 9:
                viewMo1026e = appCompatViewInflater.mo1022a(c0931qi, attributeSet);
                break;
            case 10:
                viewMo1026e = new C0275is(c0931qi, attributeSet);
                break;
            case 11:
                viewMo1026e = new C0279iw(c0931qi, attributeSet);
                break;
            case 12:
                viewMo1026e = new C0280ix(c0931qi, attributeSet);
                break;
            case 13:
                viewMo1026e = new C0754ju(c0931qi, attributeSet);
                break;
            default:
                viewMo1026e = null;
                break;
        }
        if (viewMo1026e == null && context != c0931qi) {
            if (str.equals("view")) {
                str = attributeSet.getAttributeValue(null, "class");
            }
            try {
                Object[] objArr = appCompatViewInflater.f908c;
                objArr[0] = c0931qi;
                objArr[1] = attributeSet;
                if (str.indexOf(46) == -1) {
                    int i = 0;
                    while (true) {
                        if (i >= 3) {
                            Object[] objArr2 = appCompatViewInflater.f908c;
                            objArr2[0] = null;
                            objArr2[1] = null;
                        } else {
                            View viewM1027f = appCompatViewInflater.m1027f(c0931qi, str, AppCompatViewInflater.f905b[i]);
                            if (viewM1027f != null) {
                                Object[] objArr3 = appCompatViewInflater.f908c;
                                objArr3[0] = null;
                                objArr3[1] = null;
                                view = viewM1027f;
                            } else {
                                i++;
                            }
                        }
                    }
                } else {
                    View viewM1027f2 = appCompatViewInflater.m1027f(c0931qi, str, null);
                    Object[] objArr4 = appCompatViewInflater.f908c;
                    objArr4[0] = null;
                    objArr4[1] = null;
                    view = viewM1027f2;
                }
            } catch (Exception e) {
                Object[] objArr5 = appCompatViewInflater.f908c;
                objArr5[0] = null;
                objArr5[1] = null;
            } catch (Throwable th2) {
                Object[] objArr6 = appCompatViewInflater.f908c;
                objArr6[0] = null;
                objArr6[1] = null;
                throw th2;
            }
            viewMo1026e = view;
        }
        if (viewMo1026e != null) {
            Context context2 = viewMo1026e.getContext();
            if ((context2 instanceof ContextWrapper) && afa.m418a(viewMo1026e)) {
                TypedArray typedArrayObtainStyledAttributes2 = context2.obtainStyledAttributes(attributeSet, AppCompatViewInflater.f904a);
                String string2 = typedArrayObtainStyledAttributes2.getString(0);
                if (string2 != null) {
                    viewMo1026e.setOnClickListener(new ViewOnClickListenerC0182fg(viewMo1026e, string2));
                }
                typedArrayObtainStyledAttributes2.recycle();
            }
        }
        return viewMo1026e;
    }

    /* JADX INFO: renamed from: N */
    public final boolean m8247N(C0177fb c0177fb, int i, KeyEvent keyEvent) {
        C0225gw c0225gw;
        if (keyEvent.isSystem()) {
            return false;
        }
        if ((c0177fb.f21180k || m8242I(c0177fb, keyEvent)) && (c0225gw = c0177fb.f21177h) != null) {
            return c0225gw.performShortcut(i, keyEvent, 1);
        }
        return false;
    }

    /* JADX WARN: Code duplicated, block: B:40:0x0095 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:41:0x0097  */
    /* JADX WARN: Code duplicated, block: B:43:0x00ba  */
    /* JADX WARN: Code duplicated, block: B:45:0x00cc  */
    /* JADX WARN: Code duplicated, block: B:47:0x00d2  */
    /* JADX WARN: Code duplicated, block: B:49:0x00d8  */
    /* JADX WARN: Code duplicated, block: B:51:0x00e9  */
    /* JADX WARN: Code duplicated, block: B:52:0x00ed  */
    /* JADX WARN: Code duplicated, block: B:59:0x00fe  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: O */
    public final void m8248O(boolean z) {
        int i;
        int i2;
        Configuration configuration;
        int i3;
        Object obj;
        Activity activity;
        Object obj2;
        if (this.f21345D) {
            return;
        }
        int iM8250q = m8250q();
        Configuration configurationM8249P = m8249P(this.f21374i, m8251r(this.f21374i, iM8250q), null, false);
        Context context = this.f21374i;
        if (this.f21364Y || !(this.f21373h instanceof Activity)) {
            this.f21364Y = true;
            i = this.f21363X;
        } else {
            PackageManager packageManager = context.getPackageManager();
            if (packageManager == null) {
                i = 0;
            } else {
                try {
                    ActivityInfo activityInfo = packageManager.getActivityInfo(new ComponentName(context, this.f21373h.getClass()), 269221888);
                    if (activityInfo != null) {
                        this.f21363X = activityInfo.configChanges;
                    }
                } catch (PackageManager.NameNotFoundException e) {
                    this.f21363X = 0;
                }
                this.f21364Y = true;
                i = this.f21363X;
            }
        }
        Configuration configuration2 = this.f21346E;
        if (configuration2 == null) {
            configuration2 = this.f21374i.getResources().getConfiguration();
        }
        int i4 = configuration2.uiMode & 48;
        int i5 = configurationM8249P.uiMode & 48;
        C0168et.m7832a(configuration2);
        int i6 = i4 != i5 ? 512 : 0;
        if (((i ^ (-1)) & i6) != 0 && z && this.f21344C && (f21340f || this.f21361V)) {
            Object obj3 = this.f21373h;
            if ((obj3 instanceof Activity) && !((Activity) obj3).isChild()) {
                ((Activity) this.f21373h).recreate();
            } else if (i6 != 0) {
                i2 = i & 512;
                Resources resources = this.f21374i.getResources();
                configuration = new Configuration(resources.getConfiguration());
                configuration.uiMode = i5 | (resources.getConfiguration().uiMode & (-49));
                resources.updateConfiguration(configuration, null);
                i3 = this.f21347F;
                if (i3 != 0) {
                    this.f21374i.setTheme(i3);
                    this.f21374i.getTheme().applyStyle(this.f21347F, true);
                }
                if (i2 == 512) {
                    obj = this.f21373h;
                    if (obj instanceof Activity) {
                        activity = (Activity) obj;
                        if (activity instanceof akv) {
                            if (((akv) activity).getLifecycle().f598a.m872a(akr.CREATED)) {
                                activity.onConfigurationChanged(configuration);
                            }
                        } else if (this.f21361V) {
                            activity.onConfigurationChanged(configuration);
                        }
                    }
                }
            }
            obj2 = this.f21373h;
            if (obj2 instanceof ActivityC0157ei) {
            }
        } else if (i6 != 0) {
            i2 = i & 512;
            Resources resources2 = this.f21374i.getResources();
            configuration = new Configuration(resources2.getConfiguration());
            configuration.uiMode = i5 | (resources2.getConfiguration().uiMode & (-49));
            resources2.updateConfiguration(configuration, null);
            i3 = this.f21347F;
            if (i3 != 0) {
                this.f21374i.setTheme(i3);
                this.f21374i.getTheme().applyStyle(this.f21347F, true);
            }
            if (i2 == 512) {
                obj = this.f21373h;
                if (obj instanceof Activity) {
                    activity = (Activity) obj;
                    if (activity instanceof akv) {
                        if (((akv) activity).getLifecycle().f598a.m872a(akr.CREATED)) {
                            activity.onConfigurationChanged(configuration);
                        }
                    } else if (this.f21361V && !this.f21345D) {
                        activity.onConfigurationChanged(configuration);
                    }
                }
            }
            obj2 = this.f21373h;
            if (obj2 instanceof ActivityC0157ei) {
            }
        }
        if (iM8250q == 0) {
            m8228R(this.f21374i).m8038d();
        } else {
            AbstractC0173ey abstractC0173ey = this.f21365Z;
            if (abstractC0173ey != null) {
                abstractC0173ey.m8037c();
            }
            if (iM8250q == 3) {
                m8227Q(this.f21374i).m8038d();
                return;
            }
        }
        AbstractC0173ey abstractC0173ey2 = this.f21366aa;
        if (abstractC0173ey2 != null) {
            abstractC0173ey2.m8037c();
        }
    }

    @Override // p000.AbstractC0160el
    /* JADX INFO: renamed from: a */
    public final Context mo7432a() {
        return this.f21374i;
    }

    @Override // p000.AbstractC0160el
    /* JADX INFO: renamed from: b */
    public final AbstractC0146dy mo7433b() {
        m8236C();
        return this.f21377l;
    }

    @Override // p000.AbstractC0160el
    /* JADX INFO: renamed from: c */
    public final View mo7434c(int i) {
        m8235B();
        return this.f21375j.findViewById(i);
    }

    @Override // p000.AbstractC0160el
    /* JADX INFO: renamed from: d */
    public final void mo7435d(View view, ViewGroup.LayoutParams layoutParams) {
        m8235B();
        ((ViewGroup) this.f21386u.findViewById(R.id.content)).addView(view, layoutParams);
        this.f21376k.m7918a(this.f21375j.getCallback());
    }

    @Override // p000.AbstractC0160el
    /* JADX INFO: renamed from: e */
    public final void mo7436e() {
        LayoutInflater layoutInflaterFrom = LayoutInflater.from(this.f21374i);
        if (layoutInflaterFrom.getFactory() == null) {
            layoutInflaterFrom.setFactory2(this);
        } else {
            layoutInflaterFrom.getFactory2();
        }
    }

    @Override // p000.AbstractC0160el
    /* JADX INFO: renamed from: f */
    public final void mo7437f() {
        if (this.f21377l == null || mo7433b().mo6906m()) {
            return;
        }
        m8231U(0);
    }

    /* JADX WARN: Code duplicated, block: B:22:0x004d  */
    @Override // p000.AbstractC0160el
    /* JADX INFO: renamed from: g */
    public final void mo7438g() {
        if (this.f21373h instanceof Activity) {
            synchronized (AbstractC0160el.f14537e) {
                AbstractC0160el.m7430i(this);
            }
        }
        if (this.f21348G) {
            this.f21375j.getDecorView().removeCallbacks(this.f21367ab);
        }
        this.f21345D = true;
        if (this.f21362W != -100) {
            Object obj = this.f21373h;
            if ((obj instanceof Activity) && ((Activity) obj).isChangingConfigurations()) {
                f21338L.put(this.f21373h.getClass().getName(), Integer.valueOf(this.f21362W));
            } else {
                f21338L.remove(this.f21373h.getClass().getName());
            }
        } else {
            f21338L.remove(this.f21373h.getClass().getName());
        }
        AbstractC0146dy abstractC0146dy = this.f21377l;
        if (abstractC0146dy != null) {
            abstractC0146dy.mo6898e();
        }
        AbstractC0173ey abstractC0173ey = this.f21365Z;
        if (abstractC0173ey != null) {
            abstractC0173ey.m8037c();
        }
        AbstractC0173ey abstractC0173ey2 = this.f21366aa;
        if (abstractC0173ey2 != null) {
            abstractC0173ey2.m8037c();
        }
    }

    @Override // p000.AbstractC0160el
    /* JADX INFO: renamed from: h */
    public final void mo7439h() {
        AbstractC0146dy abstractC0146dyMo7433b = mo7433b();
        if (abstractC0146dyMo7433b != null) {
            abstractC0146dyMo7433b.mo6901h(false);
        }
    }

    @Override // p000.AbstractC0160el
    /* JADX INFO: renamed from: j */
    public final void mo7440j(int i) {
        m8235B();
        ViewGroup viewGroup = (ViewGroup) this.f21386u.findViewById(R.id.content);
        viewGroup.removeAllViews();
        LayoutInflater.from(this.f21374i).inflate(i, viewGroup);
        this.f21376k.m7918a(this.f21375j.getCallback());
    }

    @Override // p000.AbstractC0160el
    /* JADX INFO: renamed from: k */
    public final void mo7441k(View view) {
        m8235B();
        ViewGroup viewGroup = (ViewGroup) this.f21386u.findViewById(R.id.content);
        viewGroup.removeAllViews();
        viewGroup.addView(view);
        this.f21376k.m7918a(this.f21375j.getCallback());
    }

    @Override // p000.AbstractC0160el
    /* JADX INFO: renamed from: l */
    public final void mo7442l(View view, ViewGroup.LayoutParams layoutParams) {
        m8235B();
        ViewGroup viewGroup = (ViewGroup) this.f21386u.findViewById(R.id.content);
        viewGroup.removeAllViews();
        viewGroup.addView(view, layoutParams);
        this.f21376k.m7918a(this.f21375j.getCallback());
    }

    @Override // p000.AbstractC0160el
    /* JADX INFO: renamed from: m */
    public final void mo7443m(CharSequence charSequence) {
        this.f21353N = charSequence;
        InterfaceC0757jx interfaceC0757jx = this.f21379n;
        if (interfaceC0757jx != null) {
            interfaceC0757jx.mo1062o(charSequence);
            return;
        }
        AbstractC0146dy abstractC0146dy = this.f21377l;
        if (abstractC0146dy != null) {
            abstractC0146dy.mo6903j(charSequence);
            return;
        }
        TextView textView = this.f21355P;
        if (textView != null) {
            textView.setText(charSequence);
        }
    }

    @Override // p000.AbstractC0160el
    /* JADX INFO: renamed from: o */
    public final void mo7444o() {
        String strM19426h;
        this.f21344C = true;
        m8248O(false);
        m8230T();
        Object obj = this.f21373h;
        if (obj instanceof Activity) {
            try {
                strM19426h = C0995ss.m19426h((Activity) obj);
            } catch (IllegalArgumentException e) {
                strM19426h = null;
            }
            if (strM19426h != null) {
                AbstractC0146dy abstractC0146dy = this.f21377l;
                if (abstractC0146dy == null) {
                    this.f21368ac = true;
                } else {
                    abstractC0146dy.mo6899f(true);
                }
            }
            synchronized (AbstractC0160el.f14537e) {
                AbstractC0160el.m7430i(this);
                AbstractC0160el.f14536d.add(new WeakReference(this));
            }
        }
        this.f21346E = new Configuration(this.f21374i.getResources().getConfiguration());
        this.f21361V = true;
    }

    @Override // android.view.LayoutInflater.Factory2
    public final View onCreateView(View view, String str, Context context, AttributeSet attributeSet) {
        return m8245L(str, context, attributeSet);
    }

    /* JADX INFO: renamed from: q */
    public final int m8250q() {
        int i = this.f21362W;
        return i != -100 ? i : AbstractC0160el.f14534b;
    }

    /* JADX INFO: renamed from: s */
    final Context m8252s() {
        AbstractC0146dy abstractC0146dyMo7433b = mo7433b();
        Context contextMo6895b = abstractC0146dyMo7433b != null ? abstractC0146dyMo7433b.mo6895b() : null;
        return contextMo6895b == null ? this.f21374i : contextMo6895b;
    }

    /* JADX INFO: renamed from: t */
    final C0177fb m8253t(Menu menu) {
        C0177fb[] c0177fbArr = this.f21359T;
        int length = c0177fbArr != null ? c0177fbArr.length : 0;
        for (int i = 0; i < length; i++) {
            C0177fb c0177fb = c0177fbArr[i];
            if (c0177fb != null && c0177fb.f21177h == menu) {
                return c0177fb;
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: u */
    final Window.Callback m8254u() {
        return this.f21375j.getCallback();
    }

    /* JADX INFO: renamed from: v */
    public final CharSequence m8255v() {
        Object obj = this.f21373h;
        return obj instanceof Activity ? ((Activity) obj).getTitle() : this.f21353N;
    }

    /* JADX INFO: renamed from: w */
    final void m8256w(int i, C0177fb c0177fb, Menu menu) {
        if (menu == null) {
            menu = c0177fb.f21177h;
        }
        if (!c0177fb.f21182m || this.f21345D) {
            return;
        }
        C0170ev c0170ev = this.f21376k;
        Window.Callback callback = this.f21375j.getCallback();
        try {
            c0170ev.f20275b = true;
            callback.onPanelClosed(i, menu);
        } finally {
            c0170ev.f20275b = false;
        }
    }

    /* JADX INFO: renamed from: x */
    final void m8257x(C0225gw c0225gw) {
        if (this.f21358S) {
            return;
        }
        this.f21358S = true;
        this.f21379n.mo1053a();
        Window.Callback callbackM8254u = m8254u();
        if (callbackM8254u != null && !this.f21345D) {
            callbackM8254u.onPanelClosed(108, c0225gw);
        }
        this.f21358S = false;
    }

    /* JADX INFO: renamed from: y */
    final void m8258y(C0177fb c0177fb, boolean z) {
        ViewGroup viewGroup;
        InterfaceC0757jx interfaceC0757jx;
        if (z && c0177fb.f21170a == 0 && (interfaceC0757jx = this.f21379n) != null && interfaceC0757jx.mo1066s()) {
            m8257x(c0177fb.f21177h);
            return;
        }
        WindowManager windowManager = (WindowManager) this.f21374i.getSystemService("window");
        if (windowManager != null && c0177fb.f21182m && (viewGroup = c0177fb.f21174e) != null) {
            windowManager.removeView(viewGroup);
            if (z) {
                m8256w(c0177fb.f21170a, c0177fb, null);
            }
        }
        c0177fb.f21180k = false;
        c0177fb.f21181l = false;
        c0177fb.f21182m = false;
        c0177fb.f21175f = null;
        c0177fb.f21183n = true;
        if (this.f21343B == c0177fb) {
            this.f21343B = null;
        }
        if (c0177fb.f21170a == 0) {
            m8238E();
        }
    }

    /* JADX INFO: renamed from: z */
    public final void m8259z(int i) {
        C0177fb c0177fbM8246M = m8246M(i);
        if (c0177fbM8246M.f21177h != null) {
            Bundle bundle = new Bundle();
            c0177fbM8246M.f21177h.m9835o(bundle);
            if (bundle.size() > 0) {
                c0177fbM8246M.f21185p = bundle;
            }
            c0177fbM8246M.f21177h.m9839s();
            c0177fbM8246M.f21177h.clear();
        }
        c0177fbM8246M.f21184o = true;
        c0177fbM8246M.f21183n = true;
        if ((i == 108 || i == 0) && this.f21379n != null) {
            C0177fb c0177fbM8246M2 = m8246M(0);
            c0177fbM8246M2.f21180k = false;
            m8242I(c0177fbM8246M2, null);
        }
    }

    /* JADX INFO: renamed from: E */
    final void m8238E() {
        if (this.f21370ae != null && (m8246M(0).f21182m || this.f21380o != null)) {
            if (this.f21371af == null) {
                this.f21371af = C0169eu.m7871a(this.f21370ae, this);
            }
        } else {
            OnBackInvokedCallback onBackInvokedCallback = this.f21371af;
            if (onBackInvokedCallback != null) {
                C0169eu.m7873c(this.f21370ae, onBackInvokedCallback);
            }
        }
    }

    @Override // android.view.LayoutInflater.Factory
    public final View onCreateView(String str, Context context, AttributeSet attributeSet) {
        return m8245L(str, context, attributeSet);
    }

    /* JADX INFO: renamed from: M */
    public final C0177fb m8246M(int i) {
        C0177fb[] c0177fbArr = this.f21359T;
        if (c0177fbArr == null || c0177fbArr.length <= i) {
            C0177fb[] c0177fbArr2 = new C0177fb[i + 1];
            if (c0177fbArr != null) {
                System.arraycopy(c0177fbArr, 0, c0177fbArr2, 0, c0177fbArr.length);
            }
            this.f21359T = c0177fbArr2;
            c0177fbArr = c0177fbArr2;
        }
        C0177fb c0177fb = c0177fbArr[i];
        if (c0177fb != null) {
            return c0177fb;
        }
        C0177fb c0177fb2 = new C0177fb(i);
        c0177fbArr[i] = c0177fb2;
        return c0177fb2;
    }

    /* JADX INFO: renamed from: P */
    public final Configuration m8249P(Context context, int i, Configuration configuration, boolean z) {
        int i2;
        switch (i) {
            case 1:
                i2 = 16;
                break;
            case 2:
                i2 = 32;
                break;
            default:
                i2 = !z ? context.getApplicationContext().getResources().getConfiguration().uiMode & 48 : 0;
                break;
        }
        Configuration configuration2 = new Configuration();
        configuration2.fontScale = 0.0f;
        if (configuration != null) {
            configuration2.setTo(configuration);
        }
        configuration2.uiMode = i2 | (configuration2.uiMode & (-49));
        return configuration2;
    }

    /* JADX INFO: renamed from: r */
    final int m8251r(Context context, int i) {
        long j;
        boolean z;
        switch (i) {
            case -100:
                return -1;
            case LensApi.LensAvailabilityStatus.LENS_AVAILABILITY_UNKNOWN /* -1 */:
            case 1:
            case 2:
                return i;
            case 0:
                if (((UiModeManager) context.getApplicationContext().getSystemService(HRLmc.SLBIpvfPQpL)).getNightMode() == 0) {
                    return -1;
                }
                C1058va c1058va = ((C0174ez) m8228R(context)).f21025b;
                C0188fm c0188fm = (C0188fm) c1058va.f47802a;
                if (c0188fm.f22535b > System.currentTimeMillis()) {
                    z = c0188fm.f22534a;
                } else {
                    Location locationM19475c = aae.m0a((Context) c1058va.f47804c, "android.permission.ACCESS_COARSE_LOCATION") == 0 ? c1058va.m19475c("network") : null;
                    Location locationM19475c2 = aae.m0a((Context) c1058va.f47804c, "android.permission.ACCESS_FINE_LOCATION") == 0 ? c1058va.m19475c("gps") : null;
                    if (locationM19475c2 == null || locationM19475c == null ? locationM19475c2 != null : locationM19475c2.getTime() > locationM19475c.getTime()) {
                        locationM19475c = locationM19475c2;
                    }
                    if (locationM19475c == null) {
                        int i2 = Calendar.getInstance().get(11);
                        return (i2 < 6 || i2 >= 22) ? 2 : 1;
                    }
                    Object obj = c1058va.f47802a;
                    long jCurrentTimeMillis = System.currentTimeMillis();
                    if (C0187fl.f22444a == null) {
                        C0187fl.f22444a = new C0187fl();
                    }
                    C0187fl c0187fl = C0187fl.f22444a;
                    c0187fl.m8538a(jCurrentTimeMillis - 86400000, locationM19475c.getLatitude(), locationM19475c.getLongitude());
                    c0187fl.m8538a(jCurrentTimeMillis, locationM19475c.getLatitude(), locationM19475c.getLongitude());
                    int i3 = c0187fl.f22447d;
                    long j2 = c0187fl.f22446c;
                    long j3 = c0187fl.f22445b;
                    c0187fl.m8538a(jCurrentTimeMillis + 86400000, locationM19475c.getLatitude(), locationM19475c.getLongitude());
                    long j4 = c0187fl.f22446c;
                    if (j2 == -1 || j3 == -1) {
                        j = jCurrentTimeMillis + 43200000;
                    } else {
                        if (jCurrentTimeMillis <= j3) {
                            j4 = jCurrentTimeMillis > j2 ? j3 : j2;
                        }
                        j = j4 + 60000;
                    }
                    C0188fm c0188fm2 = (C0188fm) obj;
                    c0188fm2.f22534a = 1 == i3;
                    c0188fm2.f22535b = j;
                    z = c0188fm.f22534a;
                }
                return !z ? 1 : 2;
            case 3:
                return C0167es.m7753b(((C0171ew) m8227Q(context)).f20495a) ? 2 : 1;
            default:
                throw new IllegalStateException("Unknown value set for night mode. Please use one of the MODE_NIGHT values from AppCompatDelegate.");
        }
    }

    @Override // p000.AbstractC0160el
    /* JADX INFO: renamed from: p */
    public final void mo7445p(int i) {
        if (i == 8) {
            i = 108;
        } else if (i == 9) {
            i = 109;
        }
        if (this.f21342A && i == 108) {
        }
        if (this.f21388w && i == 1) {
            this.f21388w = false;
        }
        switch (i) {
            case 1:
                m8233W();
                this.f21342A = true;
                break;
            case 2:
                m8233W();
                this.f21356Q = true;
                break;
            case 5:
                m8233W();
                this.f21357R = true;
                break;
            case 10:
                m8233W();
                this.f21390y = true;
                break;
            case 108:
                m8233W();
                this.f21388w = true;
                break;
            case 109:
                m8233W();
                this.f21389x = true;
                break;
            default:
                this.f21375j.requestFeature(i);
                break;
        }
    }
}
