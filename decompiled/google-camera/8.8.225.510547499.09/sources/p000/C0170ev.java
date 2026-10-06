package p000;

import android.content.Context;
import android.content.res.Resources;
import android.support.v7.widget.ActionBarContextView;
import android.support.v7.widget.ViewStubCompat;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.ActionMode;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.View;
import android.view.Window;
import android.widget.PopupWindow;
import androidx.wear.ambient.AmbientMode;
import com.google.android.apps.camera.bottombar.C0100R;
import java.util.List;

/* JADX INFO: renamed from: ev */
/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class C0170ev extends WindowCallbackC0212gj {

    /* JADX INFO: renamed from: a */
    public boolean f20274a;

    /* JADX INFO: renamed from: b */
    public boolean f20275b;

    /* JADX INFO: renamed from: c */
    final /* synthetic */ LayoutInflaterFactory2C0179fd f20276c;

    /* JADX INFO: renamed from: d */
    public AmbientMode.AmbientController f20277d;

    /* JADX INFO: renamed from: f */
    private boolean f20278f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0170ev(LayoutInflaterFactory2C0179fd layoutInflaterFactory2C0179fd, Window.Callback callback) {
        super(callback);
        this.f20276c = layoutInflaterFactory2C0179fd;
    }

    /* JADX INFO: renamed from: a */
    public final void m7918a(Window.Callback callback) {
        try {
            this.f20278f = true;
            callback.onContentChanged();
        } finally {
            this.f20278f = false;
        }
    }

    @Override // p000.WindowCallbackC0212gj, android.view.Window.Callback
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        if (this.f20274a) {
            return this.f24942e.dispatchKeyEvent(keyEvent);
        }
        return this.f20276c.m8239F(keyEvent) || super.dispatchKeyEvent(keyEvent);
    }

    @Override // p000.WindowCallbackC0212gj, android.view.Window.Callback
    public final boolean dispatchKeyShortcutEvent(KeyEvent keyEvent) {
        if (!super.dispatchKeyShortcutEvent(keyEvent)) {
            LayoutInflaterFactory2C0179fd layoutInflaterFactory2C0179fd = this.f20276c;
            int keyCode = keyEvent.getKeyCode();
            AbstractC0146dy abstractC0146dyMo7433b = layoutInflaterFactory2C0179fd.mo7433b();
            if (abstractC0146dyMo7433b == null || !abstractC0146dyMo7433b.mo6907n(keyCode, keyEvent)) {
                C0177fb c0177fb = layoutInflaterFactory2C0179fd.f21343B;
                if (c0177fb == null || !layoutInflaterFactory2C0179fd.m8247N(c0177fb, keyEvent.getKeyCode(), keyEvent)) {
                    if (layoutInflaterFactory2C0179fd.f21343B == null) {
                        C0177fb c0177fbM8246M = layoutInflaterFactory2C0179fd.m8246M(0);
                        layoutInflaterFactory2C0179fd.m8242I(c0177fbM8246M, keyEvent);
                        boolean zM8247N = layoutInflaterFactory2C0179fd.m8247N(c0177fbM8246M, keyEvent.getKeyCode(), keyEvent);
                        c0177fbM8246M.f21180k = false;
                        if (!zM8247N) {
                        }
                    }
                    return false;
                }
                C0177fb c0177fb2 = layoutInflaterFactory2C0179fd.f21343B;
                if (c0177fb2 != null) {
                    c0177fb2.f21181l = true;
                }
            }
        }
        return true;
    }

    @Override // p000.WindowCallbackC0212gj, android.view.Window.Callback
    public final void onContentChanged() {
        if (this.f20278f) {
            this.f24942e.onContentChanged();
        }
    }

    @Override // p000.WindowCallbackC0212gj, android.view.Window.Callback
    public final boolean onCreatePanelMenu(int i, Menu menu) {
        if (i == 0) {
            if (!(menu instanceof C0225gw)) {
                return false;
            }
            i = 0;
        }
        return super.onCreatePanelMenu(i, menu);
    }

    @Override // p000.WindowCallbackC0212gj, android.view.Window.Callback
    public final View onCreatePanelView(int i) {
        int i2;
        View view;
        AmbientMode.AmbientController ambientController = this.f20277d;
        if (ambientController != null) {
            if (i == 0) {
                view = new View(((C0186fk) ambientController.f1697a).f22353a.mo13674b());
                i2 = 0;
            } else {
                i2 = i;
                view = null;
            }
            if (view != null) {
                return view;
            }
            i = i2;
        }
        return super.onCreatePanelView(i);
    }

    @Override // p000.WindowCallbackC0212gj, android.view.Window.Callback
    public final boolean onMenuOpened(int i, Menu menu) {
        AbstractC0146dy abstractC0146dyMo7433b;
        super.onMenuOpened(i, menu);
        LayoutInflaterFactory2C0179fd layoutInflaterFactory2C0179fd = this.f20276c;
        if (i == 108 && (abstractC0146dyMo7433b = layoutInflaterFactory2C0179fd.mo7433b()) != null) {
            abstractC0146dyMo7433b.mo6897d(true);
        }
        return true;
    }

    @Override // p000.WindowCallbackC0212gj, android.view.Window.Callback
    public final void onPanelClosed(int i, Menu menu) {
        if (this.f20275b) {
            this.f24942e.onPanelClosed(i, menu);
            return;
        }
        super.onPanelClosed(i, menu);
        LayoutInflaterFactory2C0179fd layoutInflaterFactory2C0179fd = this.f20276c;
        if (i == 108) {
            AbstractC0146dy abstractC0146dyMo7433b = layoutInflaterFactory2C0179fd.mo7433b();
            if (abstractC0146dyMo7433b != null) {
                abstractC0146dyMo7433b.mo6897d(false);
                return;
            }
            return;
        }
        if (i == 0) {
            C0177fb c0177fbM8246M = layoutInflaterFactory2C0179fd.m8246M(0);
            if (c0177fbM8246M.f21182m) {
                layoutInflaterFactory2C0179fd.m8258y(c0177fbM8246M, false);
            }
        }
    }

    @Override // p000.WindowCallbackC0212gj, android.view.Window.Callback
    public final boolean onPreparePanel(int i, View view, Menu menu) {
        C0225gw c0225gw = menu instanceof C0225gw ? (C0225gw) menu : null;
        if (i == 0) {
            if (c0225gw == null) {
                return false;
            }
            i = 0;
        }
        if (c0225gw != null) {
            c0225gw.f26555i = true;
        }
        AmbientMode.AmbientController ambientController = this.f20277d;
        if (ambientController != null && i == 0) {
            C0186fk c0186fk = (C0186fk) ambientController.f1697a;
            if (c0186fk.f22355c) {
                i = 0;
            } else {
                c0186fk.f22353a.mo13682j();
                ((C0186fk) ambientController.f1697a).f22355c = true;
                i = 0;
            }
        }
        boolean zOnPreparePanel = super.onPreparePanel(i, view, menu);
        if (c0225gw != null) {
            c0225gw.f26555i = false;
        }
        return zOnPreparePanel;
    }

    @Override // p000.WindowCallbackC0212gj, android.view.Window.Callback
    public final void onProvideKeyboardShortcuts(List list, Menu menu, int i) {
        C0225gw c0225gw = this.f20276c.m8246M(0).f21177h;
        if (c0225gw != null) {
            super.onProvideKeyboardShortcuts(list, c0225gw, i);
        } else {
            super.onProvideKeyboardShortcuts(list, menu, i);
        }
    }

    @Override // p000.WindowCallbackC0212gj, android.view.Window.Callback
    public final ActionMode onWindowStartingActionMode(ActionMode.Callback callback) {
        return null;
    }

    @Override // p000.WindowCallbackC0212gj, android.view.Window.Callback
    public final ActionMode onWindowStartingActionMode(ActionMode.Callback callback, int i) {
        Context c0931qi;
        LayoutInflaterFactory2C0179fd layoutInflaterFactory2C0179fd = this.f20276c;
        if (layoutInflaterFactory2C0179fd.f21384s) {
            switch (i) {
                case 0:
                    C0201fz c0201fz = new C0201fz(layoutInflaterFactory2C0179fd.f21374i, callback);
                    LayoutInflaterFactory2C0179fd layoutInflaterFactory2C0179fd2 = this.f20276c;
                    AbstractC0199fx abstractC0199fx = layoutInflaterFactory2C0179fd2.f21380o;
                    if (abstractC0199fx != null) {
                        abstractC0199fx.mo8648f();
                    }
                    C0165eq c0165eq = new C0165eq(layoutInflaterFactory2C0179fd2, c0201fz);
                    AbstractC0146dy abstractC0146dyMo7433b = layoutInflaterFactory2C0179fd2.mo7433b();
                    if (abstractC0146dyMo7433b != null) {
                        layoutInflaterFactory2C0179fd2.f21380o = abstractC0146dyMo7433b.mo6896c(c0165eq);
                    }
                    if (layoutInflaterFactory2C0179fd2.f21380o == null) {
                        layoutInflaterFactory2C0179fd2.m8234A();
                        AbstractC0199fx abstractC0199fx2 = layoutInflaterFactory2C0179fd2.f21380o;
                        if (abstractC0199fx2 != null) {
                            abstractC0199fx2.mo8648f();
                        }
                        if (layoutInflaterFactory2C0179fd2.f21381p == null) {
                            if (layoutInflaterFactory2C0179fd2.f21391z) {
                                TypedValue typedValue = new TypedValue();
                                Resources.Theme theme = layoutInflaterFactory2C0179fd2.f21374i.getTheme();
                                theme.resolveAttribute(C0100R.attr.actionBarTheme, typedValue, true);
                                if (typedValue.resourceId != 0) {
                                    Resources.Theme themeNewTheme = layoutInflaterFactory2C0179fd2.f21374i.getResources().newTheme();
                                    themeNewTheme.setTo(theme);
                                    themeNewTheme.applyStyle(typedValue.resourceId, true);
                                    c0931qi = new C0931qi(layoutInflaterFactory2C0179fd2.f21374i, 0);
                                    c0931qi.getTheme().setTo(themeNewTheme);
                                } else {
                                    c0931qi = layoutInflaterFactory2C0179fd2.f21374i;
                                }
                                layoutInflaterFactory2C0179fd2.f21381p = new ActionBarContextView(c0931qi);
                                layoutInflaterFactory2C0179fd2.f21382q = new PopupWindow(c0931qi, (AttributeSet) null, C0100R.attr.actionModePopupWindowStyle);
                                ahp.m683c(layoutInflaterFactory2C0179fd2.f21382q, 2);
                                layoutInflaterFactory2C0179fd2.f21382q.setContentView(layoutInflaterFactory2C0179fd2.f21381p);
                                layoutInflaterFactory2C0179fd2.f21382q.setWidth(-1);
                                c0931qi.getTheme().resolveAttribute(C0100R.attr.actionBarSize, typedValue, true);
                                layoutInflaterFactory2C0179fd2.f21381p.f29381e = TypedValue.complexToDimensionPixelSize(typedValue.data, c0931qi.getResources().getDisplayMetrics());
                                layoutInflaterFactory2C0179fd2.f21382q.setHeight(-2);
                                layoutInflaterFactory2C0179fd2.f21383r = new RunnableC0059be(layoutInflaterFactory2C0179fd2, 9);
                            } else {
                                ViewStubCompat viewStubCompat = (ViewStubCompat) layoutInflaterFactory2C0179fd2.f21386u.findViewById(C0100R.id.action_mode_bar_stub);
                                if (viewStubCompat != null) {
                                    viewStubCompat.f1250a = LayoutInflater.from(layoutInflaterFactory2C0179fd2.m8252s());
                                    layoutInflaterFactory2C0179fd2.f21381p = (ActionBarContextView) viewStubCompat.m1357a();
                                }
                            }
                        }
                        if (layoutInflaterFactory2C0179fd2.f21381p != null) {
                            layoutInflaterFactory2C0179fd2.m8234A();
                            layoutInflaterFactory2C0179fd2.f21381p.m1045i();
                            C0200fy c0200fy = new C0200fy(layoutInflaterFactory2C0179fd2.f21381p.getContext(), layoutInflaterFactory2C0179fd2.f21381p, c0165eq);
                            if (c0165eq.mo7671c(c0200fy, c0200fy.f23851a)) {
                                c0200fy.mo8649g();
                                layoutInflaterFactory2C0179fd2.f21381p.m1044h(c0200fy);
                                layoutInflaterFactory2C0179fd2.f21380o = c0200fy;
                                if (layoutInflaterFactory2C0179fd2.m8243J()) {
                                    layoutInflaterFactory2C0179fd2.f21381p.setAlpha(0.0f);
                                    bkn bknVarM551k = afq.m551k(layoutInflaterFactory2C0179fd2.f21381p);
                                    bknVarM551k.m2594o(1.0f);
                                    layoutInflaterFactory2C0179fd2.f21352K = bknVarM551k;
                                    layoutInflaterFactory2C0179fd2.f21352K.m2596q(new C0163eo(layoutInflaterFactory2C0179fd2));
                                } else {
                                    layoutInflaterFactory2C0179fd2.f21381p.setAlpha(1.0f);
                                    layoutInflaterFactory2C0179fd2.f21381p.setVisibility(0);
                                    if (layoutInflaterFactory2C0179fd2.f21381p.getParent() instanceof View) {
                                        aff.m467c((View) layoutInflaterFactory2C0179fd2.f21381p.getParent());
                                    }
                                }
                                if (layoutInflaterFactory2C0179fd2.f21382q != null) {
                                    layoutInflaterFactory2C0179fd2.f21375j.getDecorView().post(layoutInflaterFactory2C0179fd2.f21383r);
                                }
                            } else {
                                layoutInflaterFactory2C0179fd2.f21380o = null;
                            }
                        }
                        layoutInflaterFactory2C0179fd2.m8238E();
                    }
                    layoutInflaterFactory2C0179fd2.m8238E();
                    AbstractC0199fx abstractC0199fx3 = layoutInflaterFactory2C0179fd2.f21380o;
                    if (abstractC0199fx3 != null) {
                        return c0201fz.m8962e(abstractC0199fx3);
                    }
                    return null;
            }
        }
        return super.onWindowStartingActionMode(callback, i);
    }
}
