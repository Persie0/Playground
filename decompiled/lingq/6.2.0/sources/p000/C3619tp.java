package p000;

import android.content.Context;
import android.content.res.Resources;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.ActionMode;
import android.view.KeyCharacterMap;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.PopupWindow;
import androidx.appcompat.R$attr;
import androidx.appcompat.R$id;
import androidx.appcompat.view.WindowCallbackWrapper;
import androidx.appcompat.widget.ActionBarContextView;
import androidx.appcompat.widget.ViewStubCompat;
import java.util.ArrayList;
import java.util.List;
import java.util.WeakHashMap;

/* JADX INFO: renamed from: tp */
/* JADX INFO: loaded from: classes.dex */
public final class C3619tp extends WindowCallbackWrapper {

    /* JADX INFO: renamed from: a */
    public boolean f62647a;

    /* JADX INFO: renamed from: b */
    public boolean f62648b;

    /* JADX INFO: renamed from: c */
    public boolean f62649c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ LayoutInflaterFactory2C3804yp f62650d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3619tp(LayoutInflaterFactory2C3804yp layoutInflaterFactory2C3804yp, Window.Callback callback) {
        super(callback);
        this.f62650d = layoutInflaterFactory2C3804yp;
    }

    /* JADX INFO: renamed from: b */
    public final void m22259b(Window.Callback callback) {
        try {
            this.f62647a = true;
            callback.onContentChanged();
        } finally {
            this.f62647a = false;
        }
    }

    @Override // androidx.appcompat.view.WindowCallbackWrapper, android.view.Window.Callback
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        if (this.f62648b) {
            return m640a().dispatchKeyEvent(keyEvent);
        }
        return this.f62650d.m25234t(keyEvent) || super.dispatchKeyEvent(keyEvent);
    }

    /* JADX WARN: Code duplicated, block: B:18:0x003c  */
    /* JADX WARN: Code duplicated, block: B:26:0x0051  */
    /* JADX WARN: Code duplicated, block: B:28:0x0055  */
    @Override // androidx.appcompat.view.WindowCallbackWrapper, android.view.Window.Callback
    public final boolean dispatchKeyShortcutEvent(KeyEvent keyEvent) {
        C3767xp c3767xp;
        boolean zM25225D;
        hw5 hw5VarMo3329c;
        boolean zPerformShortcut;
        if (!super.dispatchKeyShortcutEvent(keyEvent)) {
            int keyCode = keyEvent.getKeyCode();
            LayoutInflaterFactory2C3804yp layoutInflaterFactory2C3804yp = this.f62650d;
            layoutInflaterFactory2C3804yp.m25239y();
            z4b z4bVar = layoutInflaterFactory2C3804yp.f70186I;
            if (z4bVar == null) {
                c3767xp = layoutInflaterFactory2C3804yp.f70210g0;
                if (c3767xp != null || !layoutInflaterFactory2C3804yp.m25225D(c3767xp, keyEvent.getKeyCode(), keyEvent)) {
                    if (layoutInflaterFactory2C3804yp.f70210g0 == null) {
                        C3767xp c3767xpM25238x = layoutInflaterFactory2C3804yp.m25238x(0);
                        layoutInflaterFactory2C3804yp.m25226E(c3767xpM25238x, keyEvent);
                        zM25225D = layoutInflaterFactory2C3804yp.m25225D(c3767xpM25238x, keyEvent.getKeyCode(), keyEvent);
                        c3767xpM25238x.f68474k = false;
                        if (zM25225D) {
                        }
                    }
                    return false;
                }
                C3767xp c3767xp2 = layoutInflaterFactory2C3804yp.f70210g0;
                if (c3767xp2 != null) {
                    c3767xp2.f68475l = true;
                    return true;
                }
            } else {
                y4b y4bVar = z4bVar.f70913i;
                if (y4bVar == null || (hw5VarMo3329c = y4bVar.mo3329c()) == null) {
                    zPerformShortcut = false;
                } else {
                    hw5VarMo3329c.setQwertyMode(KeyCharacterMap.load(keyEvent.getDeviceId()).getKeyboardType() != 1);
                    zPerformShortcut = hw5VarMo3329c.performShortcut(keyCode, keyEvent, 0);
                }
                if (!zPerformShortcut) {
                    c3767xp = layoutInflaterFactory2C3804yp.f70210g0;
                    if (c3767xp != null) {
                        if (layoutInflaterFactory2C3804yp.f70210g0 == null) {
                            C3767xp c3767xpM25238x2 = layoutInflaterFactory2C3804yp.m25238x(0);
                            layoutInflaterFactory2C3804yp.m25226E(c3767xpM25238x2, keyEvent);
                            zM25225D = layoutInflaterFactory2C3804yp.m25225D(c3767xpM25238x2, keyEvent.getKeyCode(), keyEvent);
                            c3767xpM25238x2.f68474k = false;
                            if (zM25225D) {
                            }
                        }
                        return false;
                    }
                    if (layoutInflaterFactory2C3804yp.f70210g0 == null) {
                        C3767xp c3767xpM25238x3 = layoutInflaterFactory2C3804yp.m25238x(0);
                        layoutInflaterFactory2C3804yp.m25226E(c3767xpM25238x3, keyEvent);
                        zM25225D = layoutInflaterFactory2C3804yp.m25225D(c3767xpM25238x3, keyEvent.getKeyCode(), keyEvent);
                        c3767xpM25238x3.f68474k = false;
                        if (zM25225D) {
                        }
                    }
                    return false;
                }
            }
        }
        return true;
    }

    @Override // androidx.appcompat.view.WindowCallbackWrapper, android.view.Window.Callback
    public final void onContentChanged() {
        if (this.f62647a) {
            m640a().onContentChanged();
        }
    }

    @Override // androidx.appcompat.view.WindowCallbackWrapper, android.view.Window.Callback
    public final boolean onCreatePanelMenu(int i, Menu menu) {
        if (i != 0 || (menu instanceof hw5)) {
            return super.onCreatePanelMenu(i, menu);
        }
        return false;
    }

    @Override // androidx.appcompat.view.WindowCallbackWrapper, android.view.Window.Callback
    public final boolean onMenuOpened(int i, Menu menu) {
        super.onMenuOpened(i, menu);
        if (i == 108) {
            LayoutInflaterFactory2C3804yp layoutInflaterFactory2C3804yp = this.f62650d;
            layoutInflaterFactory2C3804yp.m25239y();
            z4b z4bVar = layoutInflaterFactory2C3804yp.f70186I;
            if (z4bVar != null) {
                ArrayList arrayList = z4bVar.f70917m;
                if (true != z4bVar.f70916l) {
                    z4bVar.f70916l = true;
                    if (arrayList.size() > 0) {
                        g9a.m12435l(arrayList.get(0));
                        throw null;
                    }
                }
            }
        }
        return true;
    }

    @Override // androidx.appcompat.view.WindowCallbackWrapper, android.view.Window.Callback
    public final void onPanelClosed(int i, Menu menu) {
        if (this.f62649c) {
            m640a().onPanelClosed(i, menu);
            return;
        }
        super.onPanelClosed(i, menu);
        LayoutInflaterFactory2C3804yp layoutInflaterFactory2C3804yp = this.f62650d;
        if (i != 108) {
            if (i == 0) {
                C3767xp c3767xpM25238x = layoutInflaterFactory2C3804yp.m25238x(i);
                if (c3767xpM25238x.f68476m) {
                    layoutInflaterFactory2C3804yp.m25233q(c3767xpM25238x, false);
                    return;
                }
                return;
            }
            return;
        }
        layoutInflaterFactory2C3804yp.m25239y();
        z4b z4bVar = layoutInflaterFactory2C3804yp.f70186I;
        if (z4bVar != null) {
            ArrayList arrayList = z4bVar.f70917m;
            if (z4bVar.f70916l) {
                z4bVar.f70916l = false;
                if (arrayList.size() <= 0) {
                    return;
                }
                g9a.m12435l(arrayList.get(0));
                throw null;
            }
        }
    }

    @Override // androidx.appcompat.view.WindowCallbackWrapper, android.view.Window.Callback
    public final boolean onPreparePanel(int i, View view, Menu menu) {
        hw5 hw5Var = menu instanceof hw5 ? (hw5) menu : null;
        if (i == 0 && hw5Var == null) {
            return false;
        }
        if (hw5Var != null) {
            hw5Var.f43060x = true;
        }
        boolean zOnPreparePanel = super.onPreparePanel(i, view, menu);
        if (hw5Var != null) {
            hw5Var.f43060x = false;
        }
        return zOnPreparePanel;
    }

    @Override // androidx.appcompat.view.WindowCallbackWrapper, android.view.Window.Callback
    public final void onProvideKeyboardShortcuts(List list, Menu menu, int i) {
        hw5 hw5Var = this.f62650d.m25238x(0).f68471h;
        if (hw5Var != null) {
            super.onProvideKeyboardShortcuts(list, hw5Var, i);
        } else {
            super.onProvideKeyboardShortcuts(list, menu, i);
        }
    }

    @Override // androidx.appcompat.view.WindowCallbackWrapper, android.view.Window.Callback
    public final ActionMode onWindowStartingActionMode(ActionMode.Callback callback, int i) {
        ViewGroup viewGroup;
        LayoutInflaterFactory2C3804yp layoutInflaterFactory2C3804yp = this.f62650d;
        Context context = layoutInflaterFactory2C3804yp.f70215k;
        if (i != 0) {
            return super.onWindowStartingActionMode(callback, i);
        }
        C3329mb c3329mb = new C3329mb(context, callback);
        AbstractC0799b6 abstractC0799b6 = layoutInflaterFactory2C3804yp.f70192O;
        if (abstractC0799b6 != null) {
            abstractC0799b6.mo3327a();
        }
        int i2 = 0;
        C3156jq c3156jq = new C3156jq(layoutInflaterFactory2C3804yp, c3329mb, false);
        layoutInflaterFactory2C3804yp.m25239y();
        z4b z4bVar = layoutInflaterFactory2C3804yp.f70186I;
        int i3 = 1;
        if (z4bVar != null) {
            y4b y4bVar = z4bVar.f70913i;
            if (y4bVar != null) {
                y4bVar.mo3327a();
            }
            z4bVar.f70907c.setHideOnContentScrollEnabled(false);
            z4bVar.f70910f.m655e();
            y4b y4bVar2 = new y4b(z4bVar, z4bVar.f70910f.getContext(), c3156jq);
            if (y4bVar2.m24938p()) {
                z4bVar.f70913i = y4bVar2;
                y4bVar2.mo3333h();
                z4bVar.f70910f.m653c(y4bVar2);
                z4bVar.m25458a(true);
            } else {
                y4bVar2 = null;
            }
            layoutInflaterFactory2C3804yp.f70192O = y4bVar2;
        }
        if (layoutInflaterFactory2C3804yp.f70192O == null) {
            xua xuaVar = layoutInflaterFactory2C3804yp.f70196S;
            if (xuaVar != null) {
                xuaVar.m24704b();
            }
            AbstractC0799b6 abstractC0799b7 = layoutInflaterFactory2C3804yp.f70192O;
            if (abstractC0799b7 != null) {
                abstractC0799b7.mo3327a();
            }
            if (layoutInflaterFactory2C3804yp.f70193P == null) {
                if (layoutInflaterFactory2C3804yp.f70206c0) {
                    TypedValue typedValue = new TypedValue();
                    Resources.Theme theme = context.getTheme();
                    theme.resolveAttribute(R$attr.actionBarTheme, typedValue, true);
                    if (typedValue.resourceId != 0) {
                        Resources.Theme themeNewTheme = context.getResources().newTheme();
                        themeNewTheme.setTo(theme);
                        themeNewTheme.applyStyle(typedValue.resourceId, true);
                        wl1 wl1Var = new wl1(context, 0);
                        wl1Var.getTheme().setTo(themeNewTheme);
                        context = wl1Var;
                    }
                    layoutInflaterFactory2C3804yp.f70193P = new ActionBarContextView(context);
                    PopupWindow popupWindow = new PopupWindow(context, (AttributeSet) null, R$attr.actionModePopupWindowStyle);
                    layoutInflaterFactory2C3804yp.f70194Q = popupWindow;
                    igc.m13901a(popupWindow);
                    layoutInflaterFactory2C3804yp.f70194Q.setContentView(layoutInflaterFactory2C3804yp.f70193P);
                    layoutInflaterFactory2C3804yp.f70194Q.setWidth(-1);
                    context.getTheme().resolveAttribute(R$attr.actionBarSize, typedValue, true);
                    layoutInflaterFactory2C3804yp.f70193P.setContentHeight(TypedValue.complexToDimensionPixelSize(typedValue.data, context.getResources().getDisplayMetrics()));
                    layoutInflaterFactory2C3804yp.f70194Q.setHeight(-2);
                    layoutInflaterFactory2C3804yp.f70195R = new RunnableC3468pp(layoutInflaterFactory2C3804yp, i2);
                } else {
                    ViewStubCompat viewStubCompat = (ViewStubCompat) layoutInflaterFactory2C3804yp.f70198U.findViewById(R$id.action_mode_bar_stub);
                    if (viewStubCompat != null) {
                        layoutInflaterFactory2C3804yp.m25239y();
                        z4b z4bVar2 = layoutInflaterFactory2C3804yp.f70186I;
                        Context contextM25459b = z4bVar2 != null ? z4bVar2.m25459b() : null;
                        if (contextM25459b != null) {
                            context = contextM25459b;
                        }
                        viewStubCompat.setLayoutInflater(LayoutInflater.from(context));
                        layoutInflaterFactory2C3804yp.f70193P = (ActionBarContextView) viewStubCompat.m700a();
                    }
                }
            }
            if (layoutInflaterFactory2C3804yp.f70193P != null) {
                xua xuaVar2 = layoutInflaterFactory2C3804yp.f70196S;
                if (xuaVar2 != null) {
                    xuaVar2.m24704b();
                }
                layoutInflaterFactory2C3804yp.f70193P.m655e();
                og9 og9Var = new og9(layoutInflaterFactory2C3804yp.f70193P.getContext(), layoutInflaterFactory2C3804yp.f70193P, c3156jq);
                if (c3156jq.m14588B(og9Var, og9Var.mo3329c())) {
                    og9Var.mo3333h();
                    layoutInflaterFactory2C3804yp.f70193P.m653c(og9Var);
                    layoutInflaterFactory2C3804yp.f70192O = og9Var;
                    boolean z = layoutInflaterFactory2C3804yp.f70197T && (viewGroup = layoutInflaterFactory2C3804yp.f70198U) != null && viewGroup.isLaidOut();
                    ActionBarContextView actionBarContextView = layoutInflaterFactory2C3804yp.f70193P;
                    if (z) {
                        actionBarContextView.setAlpha(0.0f);
                        xua xuaVarM10630a = dta.m10630a(layoutInflaterFactory2C3804yp.f70193P);
                        xuaVarM10630a.m24703a(1.0f);
                        layoutInflaterFactory2C3804yp.f70196S = xuaVarM10630a;
                        xuaVarM10630a.m24706d(new C3421op(layoutInflaterFactory2C3804yp, i3));
                    } else {
                        actionBarContextView.setAlpha(1.0f);
                        layoutInflaterFactory2C3804yp.f70193P.setVisibility(0);
                        if (layoutInflaterFactory2C3804yp.f70193P.getParent() instanceof View) {
                            View view = (View) layoutInflaterFactory2C3804yp.f70193P.getParent();
                            WeakHashMap weakHashMap = dta.f36217a;
                            view.requestApplyInsets();
                        }
                    }
                    if (layoutInflaterFactory2C3804yp.f70194Q != null) {
                        layoutInflaterFactory2C3804yp.f70217l.getDecorView().post(layoutInflaterFactory2C3804yp.f70195R);
                    }
                } else {
                    layoutInflaterFactory2C3804yp.f70192O = null;
                }
            }
            layoutInflaterFactory2C3804yp.m25228G();
            layoutInflaterFactory2C3804yp.f70192O = layoutInflaterFactory2C3804yp.f70192O;
        }
        layoutInflaterFactory2C3804yp.m25228G();
        AbstractC0799b6 abstractC0799b8 = layoutInflaterFactory2C3804yp.f70192O;
        if (abstractC0799b8 != null) {
            return c3329mb.m16727d(abstractC0799b8);
        }
        return null;
    }

    @Override // androidx.appcompat.view.WindowCallbackWrapper, android.view.Window.Callback
    public final ActionMode onWindowStartingActionMode(ActionMode.Callback callback) {
        return null;
    }
}
