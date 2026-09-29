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
import android.media.AudioManager;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.AndroidRuntimeException;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import android.view.KeyCharacterMap;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.Window;
import android.view.WindowManager;
import android.widget.FrameLayout;
import android.widget.PopupWindow;
import android.widget.TextView;
import android.window.OnBackInvokedCallback;
import android.window.OnBackInvokedDispatcher;
import androidx.appcompat.R$attr;
import androidx.appcompat.R$id;
import androidx.appcompat.R$layout;
import androidx.appcompat.R$style;
import androidx.appcompat.R$styleable;
import androidx.appcompat.widget.ActionBarContextView;
import androidx.appcompat.widget.ActionBarOverlayLayout;
import androidx.appcompat.widget.ActionMenuView;
import androidx.appcompat.widget.AppCompatEditText;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatSpinner;
import androidx.appcompat.widget.C0035b;
import androidx.appcompat.widget.ContentFrameLayout;
import androidx.appcompat.widget.Toolbar;
import androidx.lifecycle.Lifecycle$State;
import java.lang.ref.WeakReference;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.WeakHashMap;

/* JADX INFO: renamed from: yp */
/* JADX INFO: loaded from: classes.dex */
public final class LayoutInflaterFactory2C3804yp extends AbstractC3343mp implements fw5, LayoutInflater.Factory2 {

    /* JADX INFO: renamed from: B0 */
    public static final l79 f70181B0 = new l79(0);

    /* JADX INFO: renamed from: C0 */
    public static final int[] f70182C0 = {R.attr.windowBackground};

    /* JADX INFO: renamed from: D0 */
    public static final boolean f70183D0 = !"robolectric".equals(Build.FINGERPRINT);

    /* JADX INFO: renamed from: A0 */
    public OnBackInvokedCallback f70184A0;

    /* JADX INFO: renamed from: H */
    public C3619tp f70185H;

    /* JADX INFO: renamed from: I */
    public z4b f70186I;

    /* JADX INFO: renamed from: J */
    public un9 f70187J;

    /* JADX INFO: renamed from: K */
    public CharSequence f70188K;

    /* JADX INFO: renamed from: L */
    public ActionBarOverlayLayout f70189L;

    /* JADX INFO: renamed from: M */
    public C3380np f70190M;

    /* JADX INFO: renamed from: N */
    public web f70191N;

    /* JADX INFO: renamed from: O */
    public AbstractC0799b6 f70192O;

    /* JADX INFO: renamed from: P */
    public ActionBarContextView f70193P;

    /* JADX INFO: renamed from: Q */
    public PopupWindow f70194Q;

    /* JADX INFO: renamed from: R */
    public RunnableC3468pp f70195R;

    /* JADX INFO: renamed from: T */
    public boolean f70197T;

    /* JADX INFO: renamed from: U */
    public ViewGroup f70198U;

    /* JADX INFO: renamed from: V */
    public TextView f70199V;

    /* JADX INFO: renamed from: W */
    public View f70200W;

    /* JADX INFO: renamed from: X */
    public boolean f70201X;

    /* JADX INFO: renamed from: Y */
    public boolean f70202Y;

    /* JADX INFO: renamed from: Z */
    public boolean f70203Z;

    /* JADX INFO: renamed from: a0 */
    public boolean f70204a0;

    /* JADX INFO: renamed from: b0 */
    public boolean f70205b0;

    /* JADX INFO: renamed from: c0 */
    public boolean f70206c0;

    /* JADX INFO: renamed from: d0 */
    public boolean f70207d0;

    /* JADX INFO: renamed from: e0 */
    public boolean f70208e0;

    /* JADX INFO: renamed from: f0 */
    public C3767xp[] f70209f0;

    /* JADX INFO: renamed from: g0 */
    public C3767xp f70210g0;

    /* JADX INFO: renamed from: h0 */
    public boolean f70211h0;

    /* JADX INFO: renamed from: i0 */
    public boolean f70212i0;

    /* JADX INFO: renamed from: j */
    public final Object f70213j;

    /* JADX INFO: renamed from: j0 */
    public boolean f70214j0;

    /* JADX INFO: renamed from: k */
    public final Context f70215k;

    /* JADX INFO: renamed from: k0 */
    public boolean f70216k0;

    /* JADX INFO: renamed from: l */
    public Window f70217l;

    /* JADX INFO: renamed from: l0 */
    public Configuration f70218l0;

    /* JADX INFO: renamed from: m0 */
    public final int f70219m0;

    /* JADX INFO: renamed from: n0 */
    public int f70220n0;

    /* JADX INFO: renamed from: o0 */
    public int f70221o0;

    /* JADX INFO: renamed from: p0 */
    public boolean f70222p0;

    /* JADX INFO: renamed from: q0 */
    public C3656up f70223q0;

    /* JADX INFO: renamed from: r0 */
    public C3656up f70224r0;

    /* JADX INFO: renamed from: s0 */
    public boolean f70225s0;

    /* JADX INFO: renamed from: t0 */
    public int f70226t0;

    /* JADX INFO: renamed from: v0 */
    public boolean f70228v0;

    /* JADX INFO: renamed from: w0 */
    public Rect f70229w0;

    /* JADX INFO: renamed from: x0 */
    public Rect f70230x0;

    /* JADX INFO: renamed from: y0 */
    public C3382nr f70231y0;

    /* JADX INFO: renamed from: z0 */
    public OnBackInvokedDispatcher f70232z0;

    /* JADX INFO: renamed from: S */
    public xua f70196S = null;

    /* JADX INFO: renamed from: u0 */
    public final RunnableC3795yg f70227u0 = new RunnableC3795yg(this, 1);

    public LayoutInflaterFactory2C3804yp(Context context, Window window, InterfaceC3046gp interfaceC3046gp, Object obj) {
        AbstractActivityC2935dp abstractActivityC2935dp = null;
        this.f70219m0 = -100;
        this.f70215k = context;
        this.f70213j = obj;
        if (obj instanceof Dialog) {
            while (context != null) {
                if (!(context instanceof AbstractActivityC2935dp)) {
                    if (!(context instanceof ContextWrapper)) {
                        break;
                    } else {
                        context = ((ContextWrapper) context).getBaseContext();
                    }
                } else {
                    abstractActivityC2935dp = (AbstractActivityC2935dp) context;
                    break;
                }
            }
            if (abstractActivityC2935dp != null) {
                this.f70219m0 = ((LayoutInflaterFactory2C3804yp) abstractActivityC2935dp.m10565l()).f70219m0;
            }
        }
        if (this.f70219m0 == -100) {
            String name = this.f70213j.getClass().getName();
            l79 l79Var = f70181B0;
            Integer num = (Integer) l79Var.get(name);
            if (num != null) {
                this.f70219m0 = num.intValue();
                l79Var.remove(this.f70213j.getClass().getName());
            }
        }
        if (window != null) {
            m25230m(window);
        }
        C2893cq.m9845d();
    }

    /* JADX INFO: renamed from: n */
    public static yi5 m25220n(Context context) {
        yi5 yi5Var;
        if (Build.VERSION.SDK_INT >= 33 || (yi5Var = AbstractC3343mp.f51675c) == null) {
            return null;
        }
        yi5 yi5VarM20736b = AbstractC3544rp.m20736b(context.getApplicationContext().getResources().getConfiguration());
        yi5 yi5VarM11772a = fcb.m11772a(yi5Var, yi5VarM20736b);
        return yi5VarM11772a.f69868a.f71609a.isEmpty() ? yi5VarM20736b : yi5VarM11772a;
    }

    /* JADX INFO: renamed from: r */
    public static Configuration m25221r(Context context, int i, yi5 yi5Var, Configuration configuration, boolean z) {
        int i2;
        if (i == 1) {
            i2 = 16;
        } else if (i != 2) {
            i2 = z ? 0 : context.getApplicationContext().getResources().getConfiguration().uiMode & 48;
        } else {
            i2 = 32;
        }
        Configuration configuration2 = new Configuration();
        configuration2.fontScale = 0.0f;
        if (configuration != null) {
            configuration2.setTo(configuration);
        }
        configuration2.uiMode = i2 | (configuration2.uiMode & (-49));
        if (yi5Var != null) {
            AbstractC3544rp.m20738d(configuration2, yi5Var);
        }
        return configuration2;
    }

    /* JADX INFO: renamed from: A */
    public final int m25222A(Context context, int i) {
        if (i != -100) {
            if (i != -1) {
                if (i != 0) {
                    if (i != 1 && i != 2) {
                        if (i != 3) {
                            C3386nv.m17633t("Unknown value set for night mode. Please use one of the MODE_NIGHT values from AppCompatDelegate.");
                            return 0;
                        }
                        if (this.f70224r0 == null) {
                            this.f70224r0 = new C3656up(this, context);
                        }
                        return this.f70224r0.m22847m();
                    }
                } else if (((UiModeManager) context.getApplicationContext().getSystemService("uimode")).getNightMode() != 0) {
                    if (this.f70223q0 == null) {
                        this.f70223q0 = new C3656up(this, mq7.m16997a(context));
                    }
                    return this.f70223q0.m22847m();
                }
            }
            return i;
        }
        return -1;
    }

    /* JADX INFO: renamed from: B */
    public final boolean m25223B() {
        p32 p32Var;
        s5a s5aVar;
        boolean z = this.f70211h0;
        this.f70211h0 = false;
        C3767xp c3767xpM25238x = m25238x(0);
        if (!c3767xpM25238x.f68476m) {
            AbstractC0799b6 abstractC0799b6 = this.f70192O;
            if (abstractC0799b6 != null) {
                abstractC0799b6.mo3327a();
                return true;
            }
            m25239y();
            z4b z4bVar = this.f70186I;
            if (z4bVar == null || (p32Var = z4bVar.f70909e) == null || (s5aVar = ((x5a) p32Var).f67786a.f1187j0) == null || s5aVar.f60391b == null) {
                return false;
            }
            s5a s5aVar2 = ((x5a) p32Var).f67786a.f1187j0;
            mw5 mw5Var = s5aVar2 == null ? null : s5aVar2.f60391b;
            if (mw5Var != null) {
                mw5Var.collapseActionView();
            }
        } else if (!z) {
            m25233q(c3767xpM25238x, true);
            return true;
        }
        return true;
    }

    /* JADX WARN: Code duplicated, block: B:91:0x01a8  */
    /* JADX WARN: Code duplicated, block: B:96:? A[RETURN, SYNTHETIC] */
    /* JADX INFO: renamed from: C */
    public final void m25224C(C3767xp c3767xp, KeyEvent keyEvent) {
        int i;
        ViewGroup.LayoutParams layoutParams;
        boolean z = c3767xp.f68476m;
        int i2 = c3767xp.f68464a;
        if (z || this.f70216k0) {
            return;
        }
        Context context = this.f70215k;
        if (i2 == 0 && (context.getResources().getConfiguration().screenLayout & 15) == 4) {
            return;
        }
        Window.Callback callback = this.f70217l.getCallback();
        if (callback != null && !callback.onMenuOpened(i2, c3767xp.f68471h)) {
            m25233q(c3767xp, true);
            return;
        }
        WindowManager windowManager = (WindowManager) context.getSystemService("window");
        if (windowManager != null && m25226E(c3767xp, keyEvent)) {
            C3730wp c3730wp = c3767xp.f68468e;
            if (c3730wp != null && !c3767xp.f68477n) {
                View view = c3767xp.f68470g;
                if (view != null && (layoutParams = view.getLayoutParams()) != null && layoutParams.width == -1) {
                    i = -1;
                }
                c3767xp.f68475l = false;
                WindowManager.LayoutParams layoutParams2 = new WindowManager.LayoutParams(i, -2, 0, 0, 1002, 8519680, -3);
                layoutParams2.gravity = c3767xp.f68466c;
                layoutParams2.windowAnimations = c3767xp.f68467d;
                windowManager.addView(c3767xp.f68468e, layoutParams2);
                c3767xp.f68476m = true;
                if (i2 == 0) {
                    m25228G();
                }
            }
            if (c3730wp == null) {
                m25239y();
                z4b z4bVar = this.f70186I;
                Context contextM25459b = z4bVar != null ? z4bVar.m25459b() : null;
                if (contextM25459b != null) {
                    context = contextM25459b;
                }
                TypedValue typedValue = new TypedValue();
                Resources.Theme themeNewTheme = context.getResources().newTheme();
                themeNewTheme.setTo(context.getTheme());
                themeNewTheme.resolveAttribute(R$attr.actionBarPopupTheme, typedValue, true);
                int i3 = typedValue.resourceId;
                if (i3 != 0) {
                    themeNewTheme.applyStyle(i3, true);
                }
                themeNewTheme.resolveAttribute(R$attr.panelMenuListTheme, typedValue, true);
                int i4 = typedValue.resourceId;
                if (i4 != 0) {
                    themeNewTheme.applyStyle(i4, true);
                } else {
                    themeNewTheme.applyStyle(R$style.Theme_AppCompat_CompactMenu, true);
                }
                wl1 wl1Var = new wl1(context, 0);
                wl1Var.getTheme().setTo(themeNewTheme);
                c3767xp.f68473j = wl1Var;
                TypedArray typedArrayObtainStyledAttributes = wl1Var.obtainStyledAttributes(R$styleable.AppCompatTheme);
                c3767xp.f68465b = typedArrayObtainStyledAttributes.getResourceId(R$styleable.AppCompatTheme_panelBackground, 0);
                c3767xp.f68467d = typedArrayObtainStyledAttributes.getResourceId(R$styleable.AppCompatTheme_android_windowAnimationStyle, 0);
                typedArrayObtainStyledAttributes.recycle();
                c3767xp.f68468e = new C3730wp(this, c3767xp.f68473j);
                c3767xp.f68466c = 81;
            } else if (c3767xp.f68477n && c3730wp.getChildCount() > 0) {
                c3767xp.f68468e.removeAllViews();
            }
            View view2 = c3767xp.f68470g;
            if (view2 == null) {
                if (c3767xp.f68471h != null) {
                    if (this.f70191N == null) {
                        this.f70191N = new web(this);
                    }
                    web webVar = this.f70191N;
                    if (c3767xp.f68472i == null) {
                        uf5 uf5Var = new uf5(c3767xp.f68473j, R$layout.abc_list_menu_item_layout);
                        c3767xp.f68472i = uf5Var;
                        uf5Var.mo709i(webVar);
                        hw5 hw5Var = c3767xp.f68471h;
                        hw5Var.m13519b(c3767xp.f68472i, hw5Var.f43037a);
                    }
                    View view3 = (View) c3767xp.f68472i.m22724f(c3767xp.f68468e);
                    c3767xp.f68469f = view3;
                    if (view3 != null) {
                    }
                }
                c3767xp.f68477n = true;
                return;
            }
            c3767xp.f68469f = view2;
            if (c3767xp.f68469f != null && (c3767xp.f68470g != null || c3767xp.f68472i.m22723a().getCount() > 0)) {
                ViewGroup.LayoutParams layoutParams3 = c3767xp.f68469f.getLayoutParams();
                if (layoutParams3 == null) {
                    layoutParams3 = new ViewGroup.LayoutParams(-2, -2);
                }
                c3767xp.f68468e.setBackgroundResource(c3767xp.f68465b);
                ViewParent parent = c3767xp.f68469f.getParent();
                if (parent instanceof ViewGroup) {
                    ((ViewGroup) parent).removeView(c3767xp.f68469f);
                }
                c3767xp.f68468e.addView(c3767xp.f68469f, layoutParams3);
                if (!c3767xp.f68469f.hasFocus()) {
                    c3767xp.f68469f.requestFocus();
                }
            }
            c3767xp.f68477n = true;
            return;
            i = -2;
            c3767xp.f68475l = false;
            WindowManager.LayoutParams layoutParams4 = new WindowManager.LayoutParams(i, -2, 0, 0, 1002, 8519680, -3);
            layoutParams4.gravity = c3767xp.f68466c;
            layoutParams4.windowAnimations = c3767xp.f68467d;
            windowManager.addView(c3767xp.f68468e, layoutParams4);
            c3767xp.f68476m = true;
            if (i2 == 0) {
                m25228G();
            }
        }
    }

    /* JADX INFO: renamed from: D */
    public final boolean m25225D(C3767xp c3767xp, int i, KeyEvent keyEvent) {
        hw5 hw5Var;
        if (keyEvent.isSystem()) {
            return false;
        }
        if ((c3767xp.f68474k || m25226E(c3767xp, keyEvent)) && (hw5Var = c3767xp.f68471h) != null) {
            return hw5Var.performShortcut(i, keyEvent, 1);
        }
        return false;
    }

    /* JADX WARN: Code duplicated, block: B:59:0x00ce  */
    /* JADX WARN: Code duplicated, block: B:64:0x00d8  */
    /* JADX WARN: Code duplicated, block: B:68:0x00f3  */
    /* JADX WARN: Code duplicated, block: B:71:0x00f8 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:72:0x00fa  */
    /* JADX WARN: Code duplicated, block: B:79:0x010d  */
    /* JADX INFO: renamed from: E */
    public final boolean m25226E(C3767xp c3767xp, KeyEvent keyEvent) {
        hw5 hw5Var;
        ActionBarOverlayLayout actionBarOverlayLayout;
        ActionBarOverlayLayout actionBarOverlayLayout2;
        Resources.Theme themeNewTheme;
        ActionBarOverlayLayout actionBarOverlayLayout3;
        ActionBarOverlayLayout actionBarOverlayLayout4;
        if (!this.f70216k0) {
            boolean z = c3767xp.f68474k;
            int i = c3767xp.f68464a;
            if (z) {
                return true;
            }
            C3767xp c3767xp2 = this.f70210g0;
            if (c3767xp2 != null && c3767xp2 != c3767xp) {
                m25233q(c3767xp2, false);
            }
            Window.Callback callback = this.f70217l.getCallback();
            if (callback != null) {
                c3767xp.f68470g = callback.onCreatePanelView(i);
            }
            boolean z2 = i == 0 || i == 108;
            if (z2 && (actionBarOverlayLayout4 = this.f70189L) != null) {
                actionBarOverlayLayout4.m668k();
                ((x5a) actionBarOverlayLayout4.f1099e).f67797l = true;
            }
            if (c3767xp.f68470g == null) {
                hw5 hw5Var2 = c3767xp.f68471h;
                if (hw5Var2 == null || c3767xp.f68478o) {
                    if (hw5Var2 == null) {
                        Context context = this.f70215k;
                        if ((i == 0 || i == 108) && this.f70189L != null) {
                            TypedValue typedValue = new TypedValue();
                            Resources.Theme theme = context.getTheme();
                            theme.resolveAttribute(R$attr.actionBarTheme, typedValue, true);
                            if (typedValue.resourceId != 0) {
                                themeNewTheme = context.getResources().newTheme();
                                themeNewTheme.setTo(theme);
                                themeNewTheme.applyStyle(typedValue.resourceId, true);
                                themeNewTheme.resolveAttribute(R$attr.actionBarWidgetTheme, typedValue, true);
                            } else {
                                theme.resolveAttribute(R$attr.actionBarWidgetTheme, typedValue, true);
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
                                wl1 wl1Var = new wl1(context, 0);
                                wl1Var.getTheme().setTo(themeNewTheme);
                                context = wl1Var;
                            }
                        }
                        hw5 hw5Var3 = new hw5(context);
                        hw5Var3.f43041e = this;
                        hw5 hw5Var4 = c3767xp.f68471h;
                        if (hw5Var3 != hw5Var4) {
                            if (hw5Var4 != null) {
                                hw5Var4.m13535r(c3767xp.f68472i);
                            }
                            c3767xp.f68471h = hw5Var3;
                            uf5 uf5Var = c3767xp.f68472i;
                            if (uf5Var != null) {
                                hw5Var3.m13519b(uf5Var, hw5Var3.f43037a);
                            }
                        }
                        if (c3767xp.f68471h != null) {
                            if (z2 && (actionBarOverlayLayout2 = this.f70189L) != null) {
                                if (this.f70190M == null) {
                                    this.f70190M = new C3380np(this);
                                }
                                actionBarOverlayLayout2.m669l(c3767xp.f68471h, this.f70190M);
                            }
                            c3767xp.f68471h.m13540w();
                            if (callback.onCreatePanelMenu(i, c3767xp.f68471h)) {
                                c3767xp.f68478o = false;
                            } else {
                                hw5Var = c3767xp.f68471h;
                                if (hw5Var != null) {
                                    if (hw5Var != null) {
                                        hw5Var.m13535r(c3767xp.f68472i);
                                    }
                                    c3767xp.f68471h = null;
                                }
                                if (z2 && (actionBarOverlayLayout = this.f70189L) != null) {
                                    actionBarOverlayLayout.m669l(null, this.f70190M);
                                }
                            }
                        }
                    } else {
                        if (z2) {
                            if (this.f70190M == null) {
                                this.f70190M = new C3380np(this);
                            }
                            actionBarOverlayLayout2.m669l(c3767xp.f68471h, this.f70190M);
                        }
                        c3767xp.f68471h.m13540w();
                        if (callback.onCreatePanelMenu(i, c3767xp.f68471h)) {
                            hw5Var = c3767xp.f68471h;
                            if (hw5Var != null) {
                                if (hw5Var != null) {
                                    hw5Var.m13535r(c3767xp.f68472i);
                                }
                                c3767xp.f68471h = null;
                            }
                            if (z2) {
                                actionBarOverlayLayout.m669l(null, this.f70190M);
                            }
                        } else {
                            c3767xp.f68478o = false;
                        }
                    }
                }
                c3767xp.f68471h.m13540w();
                Bundle bundle = c3767xp.f68479p;
                if (bundle != null) {
                    c3767xp.f68471h.m13536s(bundle);
                    c3767xp.f68479p = null;
                }
                if (!callback.onPreparePanel(0, c3767xp.f68470g, c3767xp.f68471h)) {
                    if (z2 && (actionBarOverlayLayout3 = this.f70189L) != null) {
                        actionBarOverlayLayout3.m669l(null, this.f70190M);
                    }
                    c3767xp.f68471h.m13539v();
                    return false;
                }
                c3767xp.f68471h.setQwertyMode(KeyCharacterMap.load(keyEvent != null ? keyEvent.getDeviceId() : -1).getKeyboardType() != 1);
                c3767xp.f68471h.m13539v();
            }
            c3767xp.f68474k = true;
            c3767xp.f68475l = false;
            this.f70210g0 = c3767xp;
            return true;
        }
        return false;
    }

    /* JADX INFO: renamed from: F */
    public final void m25227F() {
        if (this.f70197T) {
            throw new AndroidRuntimeException("Window feature must be requested before adding content");
        }
    }

    /* JADX INFO: renamed from: G */
    public final void m25228G() {
        OnBackInvokedCallback onBackInvokedCallback;
        if (Build.VERSION.SDK_INT >= 33) {
            boolean z = false;
            if (this.f70232z0 != null && (m25238x(0).f68476m || this.f70192O != null)) {
                z = true;
            }
            if (z && this.f70184A0 == null) {
                this.f70184A0 = AbstractC3582sp.m21524b(this.f70232z0, this);
            } else {
                if (z || (onBackInvokedCallback = this.f70184A0) == null) {
                    return;
                }
                AbstractC3582sp.m21525c(this.f70232z0, onBackInvokedCallback);
                this.f70184A0 = null;
            }
        }
    }

    @Override // p000.AbstractC3343mp
    /* JADX INFO: renamed from: a */
    public final void mo16967a() {
        LayoutInflater layoutInflaterFrom = LayoutInflater.from(this.f70215k);
        if (layoutInflaterFrom.getFactory() == null) {
            layoutInflaterFrom.setFactory2(this);
        } else {
            if (layoutInflaterFrom.getFactory2() instanceof LayoutInflaterFactory2C3804yp) {
                return;
            }
            Log.i("AppCompatDelegate", "The Activity's LayoutInflater already has a Factory installed so we can not install AppCompat's");
        }
    }

    @Override // p000.AbstractC3343mp
    /* JADX INFO: renamed from: c */
    public final void mo16968c() {
        String strM19525u;
        this.f70212i0 = true;
        m25229l(false, true);
        m25237w();
        Object obj = this.f70213j;
        if (obj instanceof Activity) {
            try {
                Activity activity = (Activity) obj;
                try {
                    strM19525u = pvc.m19525u(activity, activity.getComponentName());
                } catch (PackageManager.NameNotFoundException e) {
                    throw new IllegalArgumentException(e);
                }
            } catch (IllegalArgumentException unused) {
                strM19525u = null;
            }
            if (strM19525u != null) {
                z4b z4bVar = this.f70186I;
                if (z4bVar == null) {
                    this.f70228v0 = true;
                } else {
                    z4bVar.m25461d(true);
                }
            }
            synchronized (AbstractC3343mp.f51680h) {
                AbstractC3343mp.m16966f(this);
                AbstractC3343mp.f51679g.add(new WeakReference(this));
            }
        }
        this.f70218l0 = new Configuration(this.f70215k.getResources().getConfiguration());
        this.f70214j0 = true;
    }

    /* JADX WARN: Code duplicated, block: B:22:0x004d  */
    @Override // p000.AbstractC3343mp
    /* JADX INFO: renamed from: d */
    public final void mo16969d() {
        if (this.f70213j instanceof Activity) {
            synchronized (AbstractC3343mp.f51680h) {
                AbstractC3343mp.m16966f(this);
            }
        }
        if (this.f70225s0) {
            this.f70217l.getDecorView().removeCallbacks(this.f70227u0);
        }
        this.f70216k0 = true;
        if (this.f70219m0 != -100) {
            Object obj = this.f70213j;
            if ((obj instanceof Activity) && ((Activity) obj).isChangingConfigurations()) {
                f70181B0.put(this.f70213j.getClass().getName(), Integer.valueOf(this.f70219m0));
            } else {
                f70181B0.remove(this.f70213j.getClass().getName());
            }
        } else {
            f70181B0.remove(this.f70213j.getClass().getName());
        }
        C3656up c3656up = this.f70223q0;
        if (c3656up != null) {
            c3656up.m15758c();
        }
        C3656up c3656up2 = this.f70224r0;
        if (c3656up2 != null) {
            c3656up2.m15758c();
        }
    }

    /* JADX WARN: Code duplicated, block: B:20:0x002a  */
    @Override // p000.fw5
    /* JADX INFO: renamed from: e */
    public final boolean mo12237e(hw5 hw5Var, MenuItem menuItem) {
        C3767xp c3767xp;
        Window.Callback callback = this.f70217l.getCallback();
        if (callback != null && !this.f70216k0) {
            hw5 hw5VarMo13528k = hw5Var.mo13528k();
            C3767xp[] c3767xpArr = this.f70209f0;
            int length = c3767xpArr != null ? c3767xpArr.length : 0;
            for (int i = 0; i < length; i++) {
                c3767xp = c3767xpArr[i];
                if (c3767xp != null && c3767xp.f68471h == hw5VarMo13528k) {
                    if (c3767xp != null) {
                        return callback.onMenuItemSelected(c3767xp.f68464a, menuItem);
                    }
                }
            }
            c3767xp = null;
            if (c3767xp != null) {
                return callback.onMenuItemSelected(c3767xp.f68464a, menuItem);
            }
        }
        return false;
    }

    @Override // p000.AbstractC3343mp
    /* JADX INFO: renamed from: g */
    public final boolean mo16970g(int i) {
        if (i == 8) {
            Log.i("AppCompatDelegate", "You should now use the AppCompatDelegate.FEATURE_SUPPORT_ACTION_BAR id when requesting this feature.");
            i = 108;
        } else if (i == 9) {
            Log.i("AppCompatDelegate", "You should now use the AppCompatDelegate.FEATURE_SUPPORT_ACTION_BAR_OVERLAY id when requesting this feature.");
            i = 109;
        }
        if (this.f70207d0 && i == 108) {
            return false;
        }
        if (this.f70203Z && i == 1) {
            this.f70203Z = false;
        }
        if (i == 1) {
            m25227F();
            this.f70207d0 = true;
            return true;
        }
        if (i == 2) {
            m25227F();
            this.f70201X = true;
            return true;
        }
        if (i == 5) {
            m25227F();
            this.f70202Y = true;
            return true;
        }
        if (i == 10) {
            m25227F();
            this.f70205b0 = true;
            return true;
        }
        if (i == 108) {
            m25227F();
            this.f70203Z = true;
            return true;
        }
        if (i != 109) {
            return this.f70217l.requestFeature(i);
        }
        m25227F();
        this.f70204a0 = true;
        return true;
    }

    @Override // p000.AbstractC3343mp
    /* JADX INFO: renamed from: h */
    public final void mo16971h(int i) {
        m25236v();
        ViewGroup viewGroup = (ViewGroup) this.f70198U.findViewById(R.id.content);
        viewGroup.removeAllViews();
        LayoutInflater.from(this.f70215k).inflate(i, viewGroup);
        this.f70185H.m22259b(this.f70217l.getCallback());
    }

    @Override // p000.AbstractC3343mp
    /* JADX INFO: renamed from: i */
    public final void mo16972i(View view) {
        m25236v();
        ViewGroup viewGroup = (ViewGroup) this.f70198U.findViewById(R.id.content);
        viewGroup.removeAllViews();
        viewGroup.addView(view);
        this.f70185H.m22259b(this.f70217l.getCallback());
    }

    @Override // p000.AbstractC3343mp
    /* JADX INFO: renamed from: j */
    public final void mo16973j(View view, ViewGroup.LayoutParams layoutParams) {
        m25236v();
        ViewGroup viewGroup = (ViewGroup) this.f70198U.findViewById(R.id.content);
        viewGroup.removeAllViews();
        viewGroup.addView(view, layoutParams);
        this.f70185H.m22259b(this.f70217l.getCallback());
    }

    @Override // p000.AbstractC3343mp
    /* JADX INFO: renamed from: k */
    public final void mo16974k(CharSequence charSequence) {
        this.f70188K = charSequence;
        ActionBarOverlayLayout actionBarOverlayLayout = this.f70189L;
        if (actionBarOverlayLayout != null) {
            actionBarOverlayLayout.setWindowTitle(charSequence);
            return;
        }
        z4b z4bVar = this.f70186I;
        if (z4bVar == null) {
            TextView textView = this.f70199V;
            if (textView != null) {
                textView.setText(charSequence);
                return;
            }
            return;
        }
        x5a x5aVar = (x5a) z4bVar.f70909e;
        if (x5aVar.f67792g) {
            return;
        }
        Toolbar toolbar = x5aVar.f67786a;
        x5aVar.f67793h = charSequence;
        if ((x5aVar.f67787b & 8) != 0) {
            toolbar.setTitle(charSequence);
            if (x5aVar.f67792g) {
                dta.m10641l(toolbar.getRootView(), charSequence);
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:63:0x00da  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: l */
    public final boolean m25229l(boolean z, boolean z2) {
        int i;
        boolean z3;
        if (this.f70216k0) {
            return false;
        }
        int i2 = this.f70219m0;
        if (i2 == -100) {
            i2 = AbstractC3343mp.f51674b;
        }
        Context context = this.f70215k;
        int iM25222A = m25222A(context, i2);
        yi5 yi5VarM25220n = Build.VERSION.SDK_INT < 33 ? m25220n(context) : null;
        if (!z2 && yi5VarM25220n != null) {
            yi5VarM25220n = AbstractC3544rp.m20736b(context.getResources().getConfiguration());
        }
        Configuration configurationM25221r = m25221r(context, iM25222A, yi5VarM25220n, null, false);
        boolean z4 = this.f70222p0;
        boolean z5 = true;
        Object obj = this.f70213j;
        if (z4 || !(obj instanceof Activity)) {
            this.f70222p0 = true;
            i = this.f70221o0;
        } else {
            PackageManager packageManager = context.getPackageManager();
            if (packageManager == null) {
                i = 0;
            } else {
                try {
                    ActivityInfo activityInfo = packageManager.getActivityInfo(new ComponentName(context, obj.getClass()), 269221888);
                    if (activityInfo != null) {
                        this.f70221o0 = activityInfo.configChanges;
                    }
                } catch (PackageManager.NameNotFoundException e) {
                    Log.d("AppCompatDelegate", "Exception while getting ActivityInfo", e);
                    this.f70221o0 = 0;
                }
                this.f70222p0 = true;
                i = this.f70221o0;
            }
        }
        Configuration configuration = this.f70218l0;
        if (configuration == null) {
            configuration = context.getResources().getConfiguration();
        }
        int i3 = configuration.uiMode & 48;
        int i4 = configurationM25221r.uiMode & 48;
        yi5 yi5VarM20736b = AbstractC3544rp.m20736b(configuration);
        yi5 yi5VarM20736b2 = yi5VarM25220n == null ? null : AbstractC3544rp.m20736b(configurationM25221r);
        int i5 = i3 != i4 ? 512 : 0;
        if (yi5VarM20736b2 != null && !yi5VarM20736b.equals(yi5VarM20736b2)) {
            i5 |= 8196;
        }
        if (((~i) & i5) != 0 && z && this.f70212i0 && ((f70183D0 || this.f70214j0) && (obj instanceof Activity))) {
            Activity activity = (Activity) obj;
            if (activity.isChild()) {
                z3 = false;
            } else {
                if (Build.VERSION.SDK_INT >= 31 && (i5 & 8192) != 0) {
                    activity.getWindow().getDecorView().setLayoutDirection(configurationM25221r.getLayoutDirection());
                }
                activity.recreate();
                z3 = true;
            }
        } else {
            z3 = false;
        }
        if (z3 || i5 == 0) {
            z5 = z3;
        } else {
            boolean z6 = (i5 & i) == i5;
            Resources resources = context.getResources();
            Configuration configuration2 = new Configuration(resources.getConfiguration());
            configuration2.uiMode = (resources.getConfiguration().uiMode & (-49)) | i4;
            if (yi5VarM20736b2 != null) {
                AbstractC3544rp.m20738d(configuration2, yi5VarM20736b2);
            }
            resources.updateConfiguration(configuration2, null);
            int i6 = this.f70220n0;
            if (i6 != 0) {
                context.setTheme(i6);
                context.getTheme().applyStyle(this.f70220n0, true);
            }
            if (z6 && (obj instanceof Activity)) {
                Activity activity2 = (Activity) obj;
                if (activity2 instanceof ub5) {
                    if (((ub5) activity2).mo256K().mo21327q().isAtLeast(Lifecycle$State.CREATED)) {
                        activity2.onConfigurationChanged(configuration2);
                    }
                } else if (this.f70214j0 && !this.f70216k0) {
                    activity2.onConfigurationChanged(configuration2);
                }
            }
        }
        if (yi5VarM20736b2 != null) {
            AbstractC3544rp.m20737c(AbstractC3544rp.m20736b(context.getResources().getConfiguration()));
        }
        C3656up c3656up = this.f70223q0;
        if (i2 == 0) {
            if (c3656up == null) {
                this.f70223q0 = new C3656up(this, mq7.m16997a(context));
            }
            this.f70223q0.m15767l();
        } else if (c3656up != null) {
            c3656up.m15758c();
        }
        C3656up c3656up2 = this.f70224r0;
        if (i2 == 3) {
            if (c3656up2 == null) {
                this.f70224r0 = new C3656up(this, context);
            }
            this.f70224r0.m15767l();
        } else if (c3656up2 != null) {
            c3656up2.m15758c();
        }
        return z5;
    }

    /* JADX WARN: Code duplicated, block: B:35:0x0074  */
    /* JADX INFO: renamed from: m */
    public final void m25230m(Window window) {
        Drawable drawableM177e;
        OnBackInvokedDispatcher onBackInvokedDispatcher;
        OnBackInvokedCallback onBackInvokedCallback;
        int resourceId;
        if (this.f70217l != null) {
            C3386nv.m17633t("AppCompat has already installed itself into the Window");
            return;
        }
        Window.Callback callback = window.getCallback();
        if (callback instanceof C3619tp) {
            C3386nv.m17633t("AppCompat has already installed itself into the Window");
            return;
        }
        C3619tp c3619tp = new C3619tp(this, callback);
        this.f70185H = c3619tp;
        window.setCallback(c3619tp);
        Context context = this.f70215k;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes((AttributeSet) null, f70182C0);
        if (!typedArrayObtainStyledAttributes.hasValue(0) || (resourceId = typedArrayObtainStyledAttributes.getResourceId(0, 0)) == 0) {
            drawableM177e = null;
        } else {
            C2893cq c2893cqM9843a = C2893cq.m9843a();
            synchronized (c2893cqM9843a) {
                drawableM177e = c2893cqM9843a.f34366a.m177e(context, resourceId, true);
            }
        }
        if (drawableM177e != null) {
            window.setBackgroundDrawable(drawableM177e);
        }
        typedArrayObtainStyledAttributes.recycle();
        this.f70217l = window;
        if (Build.VERSION.SDK_INT < 33 || (onBackInvokedDispatcher = this.f70232z0) != null) {
            return;
        }
        Object obj = this.f70213j;
        if (onBackInvokedDispatcher != null && (onBackInvokedCallback = this.f70184A0) != null) {
            AbstractC3582sp.m21525c(onBackInvokedDispatcher, onBackInvokedCallback);
            this.f70184A0 = null;
        }
        if (obj instanceof Activity) {
            Activity activity = (Activity) obj;
            if (activity.getWindow() != null) {
                this.f70232z0 = AbstractC3582sp.m21523a(activity);
            } else {
                this.f70232z0 = null;
            }
        } else {
            this.f70232z0 = null;
        }
        m25228G();
    }

    /* JADX INFO: renamed from: o */
    public final void m25231o(int i, C3767xp c3767xp, hw5 hw5Var) {
        if (hw5Var == null) {
            if (c3767xp == null && i >= 0) {
                C3767xp[] c3767xpArr = this.f70209f0;
                if (i < c3767xpArr.length) {
                    c3767xp = c3767xpArr[i];
                }
            }
            if (c3767xp != null) {
                hw5Var = c3767xp.f68471h;
            }
        }
        if ((c3767xp == null || c3767xp.f68476m) && !this.f70216k0) {
            C3619tp c3619tp = this.f70185H;
            Window.Callback callback = this.f70217l.getCallback();
            c3619tp.getClass();
            try {
                c3619tp.f62649c = true;
                callback.onPanelClosed(i, hw5Var);
            } finally {
                c3619tp.f62649c = false;
            }
        }
    }

    @Override // android.view.LayoutInflater.Factory2
    public final View onCreateView(View view, String str, Context context, AttributeSet attributeSet) {
        View c3307lq;
        View view2 = null;
        if (this.f70231y0 == null) {
            int[] iArr = R$styleable.AppCompatTheme;
            Context context2 = this.f70215k;
            TypedArray typedArrayObtainStyledAttributes = context2.obtainStyledAttributes(iArr);
            String string = typedArrayObtainStyledAttributes.getString(R$styleable.AppCompatTheme_viewInflaterClass);
            typedArrayObtainStyledAttributes.recycle();
            if (string == null) {
                this.f70231y0 = new C3382nr();
            } else {
                try {
                    this.f70231y0 = (C3382nr) context2.getClassLoader().loadClass(string).getDeclaredConstructor(null).newInstance(null);
                } catch (Throwable th) {
                    Log.i("AppCompatDelegate", "Failed to instantiate custom view inflater " + string + ". Falling back to default.", th);
                    this.f70231y0 = new C3382nr();
                }
            }
        }
        C3382nr c3382nr = this.f70231y0;
        int i = qoa.f58020a;
        c3382nr.getClass();
        TypedArray typedArrayObtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, R$styleable.View, 0, 0);
        int resourceId = typedArrayObtainStyledAttributes2.getResourceId(R$styleable.View_theme, 0);
        if (resourceId != 0) {
            Log.i("AppCompatViewInflater", "app:theme is now deprecated. Please move to using android:theme instead.");
        }
        typedArrayObtainStyledAttributes2.recycle();
        Context wl1Var = (resourceId == 0 || ((context instanceof wl1) && ((wl1) context).f66989a == resourceId)) ? context : new wl1(context, resourceId);
        str.getClass();
        switch (str) {
            case "RatingBar":
                c3307lq = new C3307lq(wl1Var, attributeSet);
                break;
            case "CheckedTextView":
                c3307lq = new C3119ip(wl1Var, attributeSet);
                break;
            case "MultiAutoCompleteTextView":
                c3307lq = new C3084hq(wl1Var, attributeSet);
                break;
            case "TextView":
                c3307lq = c3382nr.mo6248e(wl1Var, attributeSet);
                break;
            case "ImageButton":
                c3307lq = new C3010fq(wl1Var, attributeSet, R$attr.imageButtonStyle);
                break;
            case "SeekBar":
                c3307lq = new C3381nq(wl1Var, attributeSet);
                break;
            case "Spinner":
                c3307lq = new AppCompatSpinner(wl1Var, attributeSet);
                break;
            case "RadioButton":
                c3307lq = c3382nr.mo6247d(wl1Var, attributeSet);
                break;
            case "ToggleButton":
                c3307lq = new C3308lr(wl1Var, attributeSet);
                break;
            case "ImageView":
                c3307lq = new AppCompatImageView(wl1Var, attributeSet);
                break;
            case "AutoCompleteTextView":
                c3307lq = c3382nr.mo6244a(wl1Var, attributeSet);
                break;
            case "CheckBox":
                c3307lq = c3382nr.mo6246c(wl1Var, attributeSet);
                break;
            case "EditText":
                c3307lq = new AppCompatEditText(wl1Var, attributeSet);
                break;
            case "Button":
                c3307lq = c3382nr.mo6245b(wl1Var, attributeSet);
                break;
            default:
                c3307lq = null;
                break;
        }
        if (c3307lq == null && context != wl1Var) {
            Object[] objArr = c3382nr.f53160a;
            if (str.equals("view")) {
                str = attributeSet.getAttributeValue(null, "class");
            }
            try {
                objArr[0] = wl1Var;
                objArr[1] = attributeSet;
                if (-1 == str.indexOf(46)) {
                    int i2 = 0;
                    while (true) {
                        String[] strArr = C3382nr.f53158d;
                        if (i2 < 3) {
                            View viewM17596f = c3382nr.m17596f(wl1Var, str, strArr[i2]);
                            if (viewM17596f != null) {
                                objArr[0] = null;
                                objArr[1] = null;
                                view2 = viewM17596f;
                            } else {
                                i2++;
                            }
                        } else {
                            objArr[0] = null;
                            objArr[1] = null;
                        }
                    }
                } else {
                    View viewM17596f2 = c3382nr.m17596f(wl1Var, str, null);
                    objArr[0] = null;
                    objArr[1] = null;
                    view2 = viewM17596f2;
                }
            } catch (Exception unused) {
                objArr[0] = null;
                objArr[1] = null;
            } catch (Throwable th2) {
                objArr[0] = null;
                objArr[1] = null;
                throw th2;
            }
            c3307lq = view2;
        }
        if (c3307lq != null) {
            Context context3 = c3307lq.getContext();
            if ((context3 instanceof ContextWrapper) && c3307lq.hasOnClickListeners()) {
                TypedArray typedArrayObtainStyledAttributes3 = context3.obtainStyledAttributes(attributeSet, C3382nr.f53157c);
                String string2 = typedArrayObtainStyledAttributes3.getString(0);
                if (string2 != null) {
                    c3307lq.setOnClickListener(new ViewOnClickListenerC3345mr(c3307lq, string2));
                }
                typedArrayObtainStyledAttributes3.recycle();
            }
        }
        return c3307lq;
    }

    /* JADX INFO: renamed from: p */
    public final void m25232p(hw5 hw5Var) {
        C0035b c0035b;
        if (this.f70208e0) {
            return;
        }
        this.f70208e0 = true;
        ActionBarOverlayLayout actionBarOverlayLayout = this.f70189L;
        actionBarOverlayLayout.m668k();
        ActionMenuView actionMenuView = ((x5a) actionBarOverlayLayout.f1099e).f67786a.f1168a;
        if (actionMenuView != null && (c0035b = actionMenuView.f1112O) != null) {
            c0035b.m706f();
            C3636u5 c3636u5 = c0035b.f1209P;
            if (c3636u5 != null) {
                c3636u5.m24176a();
            }
        }
        Window.Callback callback = this.f70217l.getCallback();
        if (callback != null && !this.f70216k0) {
            callback.onPanelClosed(108, hw5Var);
        }
        this.f70208e0 = false;
    }

    /* JADX INFO: renamed from: q */
    public final void m25233q(C3767xp c3767xp, boolean z) {
        C3730wp c3730wp;
        ActionBarOverlayLayout actionBarOverlayLayout;
        C0035b c0035b;
        if (z && c3767xp.f68464a == 0 && (actionBarOverlayLayout = this.f70189L) != null) {
            actionBarOverlayLayout.m668k();
            ActionMenuView actionMenuView = ((x5a) actionBarOverlayLayout.f1099e).f67786a.f1168a;
            if (actionMenuView != null && (c0035b = actionMenuView.f1112O) != null && c0035b.m711k()) {
                m25232p(c3767xp.f68471h);
                return;
            }
        }
        WindowManager windowManager = (WindowManager) this.f70215k.getSystemService("window");
        if (windowManager != null && c3767xp.f68476m && (c3730wp = c3767xp.f68468e) != null) {
            windowManager.removeView(c3730wp);
            if (z) {
                m25231o(c3767xp.f68464a, c3767xp, null);
            }
        }
        c3767xp.f68474k = false;
        c3767xp.f68475l = false;
        c3767xp.f68476m = false;
        c3767xp.f68469f = null;
        c3767xp.f68477n = true;
        if (this.f70210g0 == c3767xp) {
            this.f70210g0 = null;
        }
        if (c3767xp.f68464a == 0) {
            m25228G();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0044, code lost:
    
        if (r6.m711k() != false) goto L20;
     */
    @Override // p000.fw5
    /* JADX INFO: renamed from: s */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void mo12238s(hw5 hw5Var) {
        ActionMenuView actionMenuView;
        C0035b c0035b;
        C0035b c0035b2;
        C0035b c0035b3;
        ActionBarOverlayLayout actionBarOverlayLayout = this.f70189L;
        if (actionBarOverlayLayout != null) {
            actionBarOverlayLayout.m668k();
            Toolbar toolbar = ((x5a) actionBarOverlayLayout.f1099e).f67786a;
            if (toolbar.getVisibility() == 0 && (actionMenuView = toolbar.f1168a) != null && actionMenuView.f1111N) {
                if (ViewConfiguration.get(this.f70215k).hasPermanentMenuKey()) {
                    ActionBarOverlayLayout actionBarOverlayLayout2 = this.f70189L;
                    actionBarOverlayLayout2.m668k();
                    ActionMenuView actionMenuView2 = ((x5a) actionBarOverlayLayout2.f1099e).f67786a.f1168a;
                    if (actionMenuView2 != null) {
                        C0035b c0035b4 = actionMenuView2.f1112O;
                        if (c0035b4 != null) {
                            if (c0035b4.f1210Q == null) {
                            }
                        }
                    }
                }
                Window.Callback callback = this.f70217l.getCallback();
                ActionBarOverlayLayout actionBarOverlayLayout3 = this.f70189L;
                actionBarOverlayLayout3.m668k();
                ActionMenuView actionMenuView3 = ((x5a) actionBarOverlayLayout3.f1099e).f67786a.f1168a;
                if (actionMenuView3 != null && (c0035b2 = actionMenuView3.f1112O) != null && c0035b2.m711k()) {
                    ActionBarOverlayLayout actionBarOverlayLayout4 = this.f70189L;
                    actionBarOverlayLayout4.m668k();
                    ActionMenuView actionMenuView4 = ((x5a) actionBarOverlayLayout4.f1099e).f67786a.f1168a;
                    if (actionMenuView4 != null && (c0035b3 = actionMenuView4.f1112O) != null) {
                        c0035b3.m706f();
                    }
                    if (this.f70216k0) {
                        return;
                    }
                    callback.onPanelClosed(108, m25238x(0).f68471h);
                    return;
                }
                if (callback == null || this.f70216k0) {
                    return;
                }
                if (this.f70225s0 && (1 & this.f70226t0) != 0) {
                    View decorView = this.f70217l.getDecorView();
                    RunnableC3795yg runnableC3795yg = this.f70227u0;
                    decorView.removeCallbacks(runnableC3795yg);
                    runnableC3795yg.run();
                }
                C3767xp c3767xpM25238x = m25238x(0);
                hw5 hw5Var2 = c3767xpM25238x.f68471h;
                if (hw5Var2 == null || c3767xpM25238x.f68478o || !callback.onPreparePanel(0, c3767xpM25238x.f68470g, hw5Var2)) {
                    return;
                }
                callback.onMenuOpened(108, c3767xpM25238x.f68471h);
                ActionBarOverlayLayout actionBarOverlayLayout5 = this.f70189L;
                actionBarOverlayLayout5.m668k();
                ActionMenuView actionMenuView5 = ((x5a) actionBarOverlayLayout5.f1099e).f67786a.f1168a;
                if (actionMenuView5 == null || (c0035b = actionMenuView5.f1112O) == null) {
                    return;
                }
                c0035b.m714n();
                return;
            }
        }
        C3767xp c3767xpM25238x2 = m25238x(0);
        c3767xpM25238x2.f68477n = true;
        m25233q(c3767xpM25238x2, false);
        m25224C(c3767xpM25238x2, null);
    }

    /* JADX WARN: Code duplicated, block: B:102:0x0140 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:19:0x0039  */
    /* JADX WARN: Code duplicated, block: B:21:0x0044 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:22:0x0046 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:24:0x004a  */
    /* JADX WARN: Code duplicated, block: B:26:0x0050  */
    /* JADX WARN: Code duplicated, block: B:28:0x0058  */
    /* JADX WARN: Code duplicated, block: B:30:0x005c  */
    /* JADX WARN: Code duplicated, block: B:33:0x0065  */
    /* JADX WARN: Code duplicated, block: B:36:0x0069 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:37:0x006b A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:39:0x006f  */
    /* JADX WARN: Code duplicated, block: B:42:0x0075  */
    /* JADX WARN: Code duplicated, block: B:44:0x007f  */
    /* JADX WARN: Code duplicated, block: B:76:0x00f7  */
    /* JADX WARN: Code duplicated, block: B:78:0x00fb  */
    /* JADX WARN: Code duplicated, block: B:89:0x0115  */
    /* JADX WARN: Code duplicated, block: B:93:0x011f  */
    /* JADX WARN: Code duplicated, block: B:95:0x012d  */
    /* JADX WARN: Code duplicated, block: B:97:0x0131  */
    /* JADX WARN: Code duplicated, block: B:99:0x0139  */
    /* JADX INFO: renamed from: t */
    public final boolean m25234t(KeyEvent keyEvent) {
        int keyCode;
        C3767xp c3767xpM25238x;
        ActionBarOverlayLayout actionBarOverlayLayout;
        Context context;
        boolean z;
        boolean z2;
        boolean zM25226E;
        AudioManager audioManager;
        Toolbar toolbar;
        ActionMenuView actionMenuView;
        C0035b c0035b;
        C0035b c0035b2;
        C0035b c0035b3;
        C3767xp c3767xpM25238x2;
        Object obj = this.f70213j;
        if (((obj instanceof ci4) || (obj instanceof DialogC0782aq)) && this.f70217l.getDecorView() != null) {
            WeakHashMap weakHashMap = dta.f36217a;
        }
        if (keyEvent.getKeyCode() == 82) {
            C3619tp c3619tp = this.f70185H;
            Window.Callback callback = this.f70217l.getCallback();
            c3619tp.getClass();
            try {
                c3619tp.f62648b = true;
                boolean zDispatchKeyEvent = callback.dispatchKeyEvent(keyEvent);
                c3619tp.f62648b = false;
                if (!zDispatchKeyEvent) {
                    keyCode = keyEvent.getKeyCode();
                    if (keyEvent.getAction() == 0) {
                        if (keyCode != 4) {
                            this.f70211h0 = (keyEvent.getFlags() & 128) != 0;
                            return false;
                        }
                        if (keyCode == 82) {
                            if (keyEvent.getRepeatCount() == 0) {
                                c3767xpM25238x2 = m25238x(0);
                                if (!c3767xpM25238x2.f68476m) {
                                    m25226E(c3767xpM25238x2, keyEvent);
                                    return true;
                                }
                            }
                        }
                        return false;
                    }
                    if (keyCode != 4) {
                        if (keyCode == 82) {
                            if (this.f70192O == null) {
                                c3767xpM25238x = m25238x(0);
                                actionBarOverlayLayout = this.f70189L;
                                context = this.f70215k;
                                if (actionBarOverlayLayout != null) {
                                    actionBarOverlayLayout.m668k();
                                    toolbar = ((x5a) actionBarOverlayLayout.f1099e).f67786a;
                                    if (toolbar.getVisibility() == 0 || (actionMenuView = toolbar.f1168a) == null || !actionMenuView.f1111N || ViewConfiguration.get(context).hasPermanentMenuKey()) {
                                        z = c3767xpM25238x.f68476m;
                                        if (!z || c3767xpM25238x.f68475l) {
                                            m25233q(c3767xpM25238x, true);
                                            z2 = z;
                                        } else {
                                            if (c3767xpM25238x.f68474k) {
                                                if (c3767xpM25238x.f68478o) {
                                                    c3767xpM25238x.f68474k = false;
                                                    zM25226E = m25226E(c3767xpM25238x, keyEvent);
                                                } else {
                                                    zM25226E = true;
                                                }
                                                if (zM25226E) {
                                                    m25224C(c3767xpM25238x, keyEvent);
                                                    z2 = true;
                                                }
                                            }
                                            z2 = false;
                                        }
                                    } else {
                                        ActionBarOverlayLayout actionBarOverlayLayout2 = this.f70189L;
                                        actionBarOverlayLayout2.m668k();
                                        ActionMenuView actionMenuView2 = ((x5a) actionBarOverlayLayout2.f1099e).f67786a.f1168a;
                                        if (actionMenuView2 == null || (c0035b2 = actionMenuView2.f1112O) == null || !c0035b2.m711k()) {
                                            if (!this.f70216k0 && m25226E(c3767xpM25238x, keyEvent)) {
                                                ActionBarOverlayLayout actionBarOverlayLayout3 = this.f70189L;
                                                actionBarOverlayLayout3.m668k();
                                                ActionMenuView actionMenuView3 = ((x5a) actionBarOverlayLayout3.f1099e).f67786a.f1168a;
                                                if (actionMenuView3 != null && (c0035b = actionMenuView3.f1112O) != null && c0035b.m714n()) {
                                                    z2 = true;
                                                }
                                            }
                                            z2 = false;
                                        } else {
                                            ActionBarOverlayLayout actionBarOverlayLayout4 = this.f70189L;
                                            actionBarOverlayLayout4.m668k();
                                            ActionMenuView actionMenuView4 = ((x5a) actionBarOverlayLayout4.f1099e).f67786a.f1168a;
                                            if (actionMenuView4 == null || (c0035b3 = actionMenuView4.f1112O) == null || !c0035b3.m706f()) {
                                                z2 = false;
                                            } else {
                                                z2 = true;
                                            }
                                        }
                                    }
                                } else {
                                    z = c3767xpM25238x.f68476m;
                                    if (z) {
                                    }
                                    m25233q(c3767xpM25238x, true);
                                    z2 = z;
                                }
                                if (z2) {
                                    audioManager = (AudioManager) context.getApplicationContext().getSystemService("audio");
                                    if (audioManager != null) {
                                        audioManager.playSoundEffect(0);
                                        return true;
                                    }
                                    Log.w("AppCompatDelegate", "Couldn't get audio manager");
                                    return true;
                                }
                            }
                        }
                        return false;
                    }
                    if (m25223B()) {
                        return false;
                    }
                }
            } catch (Throwable th) {
                c3619tp.f62648b = false;
                throw th;
            }
        } else {
            keyCode = keyEvent.getKeyCode();
            if (keyEvent.getAction() == 0) {
                if (keyCode != 4) {
                    this.f70211h0 = (keyEvent.getFlags() & 128) != 0;
                    return false;
                }
                if (keyCode == 82) {
                    if (keyEvent.getRepeatCount() == 0) {
                        c3767xpM25238x2 = m25238x(0);
                        if (!c3767xpM25238x2.f68476m) {
                            m25226E(c3767xpM25238x2, keyEvent);
                            return true;
                        }
                    }
                }
                return false;
            }
            if (keyCode != 4) {
                if (keyCode == 82) {
                    if (this.f70192O == null) {
                        c3767xpM25238x = m25238x(0);
                        actionBarOverlayLayout = this.f70189L;
                        context = this.f70215k;
                        if (actionBarOverlayLayout != null) {
                            actionBarOverlayLayout.m668k();
                            toolbar = ((x5a) actionBarOverlayLayout.f1099e).f67786a;
                            if (toolbar.getVisibility() == 0) {
                                z = c3767xpM25238x.f68476m;
                                if (z) {
                                }
                                m25233q(c3767xpM25238x, true);
                                z2 = z;
                            } else {
                                z = c3767xpM25238x.f68476m;
                                if (z) {
                                }
                                m25233q(c3767xpM25238x, true);
                                z2 = z;
                            }
                        } else {
                            z = c3767xpM25238x.f68476m;
                            if (z) {
                            }
                            m25233q(c3767xpM25238x, true);
                            z2 = z;
                        }
                        if (z2) {
                            audioManager = (AudioManager) context.getApplicationContext().getSystemService("audio");
                            if (audioManager != null) {
                                audioManager.playSoundEffect(0);
                                return true;
                            }
                            Log.w("AppCompatDelegate", "Couldn't get audio manager");
                            return true;
                        }
                    }
                }
                return false;
            }
            if (m25223B()) {
                return false;
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: u */
    public final void m25235u(int i) {
        C3767xp c3767xpM25238x = m25238x(i);
        if (c3767xpM25238x.f68471h != null) {
            Bundle bundle = new Bundle();
            c3767xpM25238x.f68471h.m13537t(bundle);
            if (bundle.size() > 0) {
                c3767xpM25238x.f68479p = bundle;
            }
            c3767xpM25238x.f68471h.m13540w();
            c3767xpM25238x.f68471h.clear();
        }
        c3767xpM25238x.f68478o = true;
        c3767xpM25238x.f68477n = true;
        if ((i == 108 || i == 0) && this.f70189L != null) {
            C3767xp c3767xpM25238x2 = m25238x(0);
            c3767xpM25238x2.f68474k = false;
            m25226E(c3767xpM25238x2, null);
        }
    }

    /* JADX INFO: renamed from: v */
    public final void m25236v() {
        ViewGroup viewGroup;
        if (this.f70197T) {
            return;
        }
        int[] iArr = R$styleable.AppCompatTheme;
        Context context = this.f70215k;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(iArr);
        if (!typedArrayObtainStyledAttributes.hasValue(R$styleable.AppCompatTheme_windowActionBar)) {
            typedArrayObtainStyledAttributes.recycle();
            C3386nv.m17633t("You need to use a Theme.AppCompat theme (or descendant) with this activity.");
            return;
        }
        if (typedArrayObtainStyledAttributes.getBoolean(R$styleable.AppCompatTheme_windowNoTitle, false)) {
            mo16970g(1);
        } else if (typedArrayObtainStyledAttributes.getBoolean(R$styleable.AppCompatTheme_windowActionBar, false)) {
            mo16970g(108);
        }
        if (typedArrayObtainStyledAttributes.getBoolean(R$styleable.AppCompatTheme_windowActionBarOverlay, false)) {
            mo16970g(109);
        }
        if (typedArrayObtainStyledAttributes.getBoolean(R$styleable.AppCompatTheme_windowActionModeOverlay, false)) {
            mo16970g(10);
        }
        this.f70206c0 = typedArrayObtainStyledAttributes.getBoolean(R$styleable.AppCompatTheme_android_windowIsFloating, false);
        typedArrayObtainStyledAttributes.recycle();
        m25237w();
        this.f70217l.getDecorView();
        LayoutInflater layoutInflaterFrom = LayoutInflater.from(context);
        if (this.f70207d0) {
            viewGroup = this.f70205b0 ? (ViewGroup) layoutInflaterFrom.inflate(R$layout.abc_screen_simple_overlay_action_mode, (ViewGroup) null) : (ViewGroup) layoutInflaterFrom.inflate(R$layout.abc_screen_simple, (ViewGroup) null);
        } else if (this.f70206c0) {
            viewGroup = (ViewGroup) layoutInflaterFrom.inflate(R$layout.abc_dialog_title_material, (ViewGroup) null);
            this.f70204a0 = false;
            this.f70203Z = false;
        } else if (this.f70203Z) {
            TypedValue typedValue = new TypedValue();
            context.getTheme().resolveAttribute(R$attr.actionBarTheme, typedValue, true);
            viewGroup = (ViewGroup) LayoutInflater.from(typedValue.resourceId != 0 ? new wl1(context, typedValue.resourceId) : context).inflate(R$layout.abc_screen_toolbar, (ViewGroup) null);
            ActionBarOverlayLayout actionBarOverlayLayout = (ActionBarOverlayLayout) viewGroup.findViewById(R$id.decor_content_parent);
            this.f70189L = actionBarOverlayLayout;
            actionBarOverlayLayout.setWindowCallback(this.f70217l.getCallback());
            if (this.f70204a0) {
                this.f70189L.m667j(109);
            }
            if (this.f70201X) {
                this.f70189L.m667j(2);
            }
            if (this.f70202Y) {
                this.f70189L.m667j(5);
            }
        } else {
            viewGroup = null;
        }
        if (viewGroup == null) {
            StringBuilder sb = new StringBuilder("AppCompat does not support the current theme features: { windowActionBar: ");
            sb.append(this.f70203Z);
            sb.append(", windowActionBarOverlay: ");
            sb.append(this.f70204a0);
            sb.append(", android:windowIsFloating: ");
            sb.append(this.f70206c0);
            sb.append(", windowActionModeOverlay: ");
            sb.append(this.f70205b0);
            sb.append(", windowNoTitle: ");
            C3386nv.m17626m(AbstractC3393o1.m17740o(sb, this.f70207d0, " }"));
            return;
        }
        C3380np c3380np = new C3380np(this);
        WeakHashMap weakHashMap = dta.f36217a;
        wsa.m24145c(viewGroup, c3380np);
        if (this.f70189L == null) {
            this.f70199V = (TextView) viewGroup.findViewById(R$id.title);
        }
        try {
            Method method = viewGroup.getClass().getMethod("makeOptionalFitsSystemWindows", null);
            if (!method.isAccessible()) {
                method.setAccessible(true);
            }
            method.invoke(viewGroup, null);
        } catch (IllegalAccessException e) {
            Log.d("ViewUtils", "Could not invoke makeOptionalFitsSystemWindows", e);
        } catch (NoSuchMethodException unused) {
            Log.d("ViewUtils", "Could not find method makeOptionalFitsSystemWindows. Oh well...");
        } catch (InvocationTargetException e2) {
            Log.d("ViewUtils", "Could not invoke makeOptionalFitsSystemWindows", e2);
        }
        ContentFrameLayout contentFrameLayout = (ContentFrameLayout) viewGroup.findViewById(R$id.action_bar_activity_content);
        ViewGroup viewGroup2 = (ViewGroup) this.f70217l.findViewById(R.id.content);
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
        this.f70217l.setContentView(viewGroup);
        contentFrameLayout.setAttachListener(new qn3(this));
        this.f70198U = viewGroup;
        Object obj = this.f70213j;
        CharSequence title = obj instanceof Activity ? ((Activity) obj).getTitle() : this.f70188K;
        if (!TextUtils.isEmpty(title)) {
            ActionBarOverlayLayout actionBarOverlayLayout2 = this.f70189L;
            if (actionBarOverlayLayout2 != null) {
                actionBarOverlayLayout2.setWindowTitle(title);
            } else {
                z4b z4bVar = this.f70186I;
                if (z4bVar != null) {
                    x5a x5aVar = (x5a) z4bVar.f70909e;
                    if (!x5aVar.f67792g) {
                        Toolbar toolbar = x5aVar.f67786a;
                        x5aVar.f67793h = title;
                        if ((x5aVar.f67787b & 8) != 0) {
                            toolbar.setTitle(title);
                            if (x5aVar.f67792g) {
                                dta.m10641l(toolbar.getRootView(), title);
                            }
                        }
                    }
                } else {
                    TextView textView = this.f70199V;
                    if (textView != null) {
                        textView.setText(title);
                    }
                }
            }
        }
        ContentFrameLayout contentFrameLayout2 = (ContentFrameLayout) this.f70198U.findViewById(R.id.content);
        View decorView = this.f70217l.getDecorView();
        contentFrameLayout2.f1147g.set(decorView.getPaddingLeft(), decorView.getPaddingTop(), decorView.getPaddingRight(), decorView.getPaddingBottom());
        if (contentFrameLayout2.isLaidOut()) {
            contentFrameLayout2.requestLayout();
        }
        TypedArray typedArrayObtainStyledAttributes2 = context.obtainStyledAttributes(R$styleable.AppCompatTheme);
        typedArrayObtainStyledAttributes2.getValue(R$styleable.AppCompatTheme_windowMinWidthMajor, contentFrameLayout2.getMinWidthMajor());
        typedArrayObtainStyledAttributes2.getValue(R$styleable.AppCompatTheme_windowMinWidthMinor, contentFrameLayout2.getMinWidthMinor());
        if (typedArrayObtainStyledAttributes2.hasValue(R$styleable.AppCompatTheme_windowFixedWidthMajor)) {
            typedArrayObtainStyledAttributes2.getValue(R$styleable.AppCompatTheme_windowFixedWidthMajor, contentFrameLayout2.getFixedWidthMajor());
        }
        if (typedArrayObtainStyledAttributes2.hasValue(R$styleable.AppCompatTheme_windowFixedWidthMinor)) {
            typedArrayObtainStyledAttributes2.getValue(R$styleable.AppCompatTheme_windowFixedWidthMinor, contentFrameLayout2.getFixedWidthMinor());
        }
        if (typedArrayObtainStyledAttributes2.hasValue(R$styleable.AppCompatTheme_windowFixedHeightMajor)) {
            typedArrayObtainStyledAttributes2.getValue(R$styleable.AppCompatTheme_windowFixedHeightMajor, contentFrameLayout2.getFixedHeightMajor());
        }
        if (typedArrayObtainStyledAttributes2.hasValue(R$styleable.AppCompatTheme_windowFixedHeightMinor)) {
            typedArrayObtainStyledAttributes2.getValue(R$styleable.AppCompatTheme_windowFixedHeightMinor, contentFrameLayout2.getFixedHeightMinor());
        }
        typedArrayObtainStyledAttributes2.recycle();
        contentFrameLayout2.requestLayout();
        this.f70197T = true;
        C3767xp c3767xpM25238x = m25238x(0);
        if (this.f70216k0 || c3767xpM25238x.f68471h != null) {
            return;
        }
        m25240z(108);
    }

    /* JADX INFO: renamed from: w */
    public final void m25237w() {
        if (this.f70217l == null) {
            Object obj = this.f70213j;
            if (obj instanceof Activity) {
                m25230m(((Activity) obj).getWindow());
            }
        }
        if (this.f70217l != null) {
            return;
        }
        C3386nv.m17633t("We have not been given a Window");
    }

    /* JADX INFO: renamed from: x */
    public final C3767xp m25238x(int i) {
        C3767xp[] c3767xpArr = this.f70209f0;
        if (c3767xpArr == null || c3767xpArr.length <= i) {
            C3767xp[] c3767xpArr2 = new C3767xp[i + 1];
            if (c3767xpArr != null) {
                System.arraycopy(c3767xpArr, 0, c3767xpArr2, 0, c3767xpArr.length);
            }
            this.f70209f0 = c3767xpArr2;
            c3767xpArr = c3767xpArr2;
        }
        C3767xp c3767xp = c3767xpArr[i];
        if (c3767xp != null) {
            return c3767xp;
        }
        C3767xp c3767xp2 = new C3767xp();
        c3767xp2.f68464a = i;
        c3767xp2.f68477n = false;
        c3767xpArr[i] = c3767xp2;
        return c3767xp2;
    }

    /* JADX INFO: renamed from: y */
    public final void m25239y() {
        m25236v();
        if (this.f70203Z && this.f70186I == null) {
            Object obj = this.f70213j;
            if (obj instanceof Activity) {
                this.f70186I = new z4b((Activity) obj, this.f70204a0);
            } else if (obj instanceof Dialog) {
                this.f70186I = new z4b((Dialog) obj);
            }
            z4b z4bVar = this.f70186I;
            if (z4bVar != null) {
                z4bVar.m25461d(this.f70228v0);
            }
        }
    }

    /* JADX INFO: renamed from: z */
    public final void m25240z(int i) {
        this.f70226t0 = (1 << i) | this.f70226t0;
        if (this.f70225s0) {
            return;
        }
        View decorView = this.f70217l.getDecorView();
        WeakHashMap weakHashMap = dta.f36217a;
        decorView.postOnAnimation(this.f70227u0);
        this.f70225s0 = true;
    }

    @Override // android.view.LayoutInflater.Factory
    public final View onCreateView(String str, Context context, AttributeSet attributeSet) {
        return onCreateView(null, str, context, attributeSet);
    }
}
