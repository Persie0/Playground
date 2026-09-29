package androidx.compose.p002ui.window;

import android.R;
import android.os.Build;
import android.view.ContextThemeWrapper;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import androidx.compose.p002ui.R$id;
import androidx.compose.p002ui.R$style;
import androidx.compose.p002ui.unit.LayoutDirection;
import java.util.UUID;
import p000.C3386nv;
import p000.C3765xn;
import p000.C3802yn;
import p000.c41;
import p000.dja;
import p000.eja;
import p000.fb2;
import p000.ge2;
import p000.gm5;
import p000.ie2;
import p000.kaa;
import p000.pr6;
import p000.pt8;
import p000.qr6;
import p000.ss5;
import p000.ui3;
import p000.vi3;
import p000.xc1;
import p000.xfa;
import p000.zha;

/* JADX INFO: renamed from: androidx.compose.ui.window.h */
/* JADX INFO: loaded from: classes2.dex */
public final class DialogC0460h extends xc1 {

    /* JADX INFO: renamed from: e */
    public ui3 f5301e;

    /* JADX INFO: renamed from: f */
    public ge2 f5302f;

    /* JADX INFO: renamed from: g */
    public final View f5303g;

    /* JADX INFO: renamed from: h */
    public final C0459g f5304h;

    /* JADX INFO: renamed from: i */
    public boolean f5305i;

    public DialogC0460h(ui3 ui3Var, ge2 ge2Var, View view, LayoutDirection layoutDirection, fb2 fb2Var, UUID uuid) {
        super(new ContextThemeWrapper(view.getContext(), ge2Var.f40625e ? R$style.DialogWindowTheme : R$style.FloatingDialogWindowTheme), 0);
        this.f5301e = ui3Var;
        this.f5302f = ge2Var;
        this.f5303g = view;
        Window window = getWindow();
        if (window == null) {
            C3386nv.m17633t("Dialog has no window");
            throw null;
        }
        ge2 ge2Var2 = this.f5302f;
        Window window2 = getWindow();
        if (window2 != null) {
            WindowManager.LayoutParams attributes = window2.getAttributes();
            attributes.type = ge2Var2.f40627g;
            window2.setAttributes(attributes);
        }
        window.requestFeature(1);
        window.setBackgroundDrawableResource(R.color.transparent);
        kaa.m15044f(window, this.f5302f.f40625e);
        window.setGravity(17);
        if (!this.f5302f.f40625e) {
            window.addFlags(65792);
            WindowManager.LayoutParams attributes2 = window.getAttributes();
            C3765xn.f68380a.m24619a(attributes2);
            if (Build.VERSION.SDK_INT >= 30) {
                C3802yn c3802yn = C3802yn.f70089a;
                c3802yn.m25208b(attributes2, 0);
                c3802yn.m25209c(attributes2, 0);
            }
            window.setAttributes(attributes2);
        }
        C0459g c0459g = new C0459g(getContext(), window);
        setTitle(this.f5302f.f40626f);
        c0459g.setTag(R$id.compose_view_saveable_id_tag, "Dialog:" + uuid);
        c0459g.setClipChildren(false);
        c0459g.setElevation(fb2Var.mo912g0(8.0f));
        c0459g.setOutlineProvider(new c41(1));
        this.f5304h = c0459g;
        View decorView = window.getDecorView();
        ViewGroup viewGroup = decorView instanceof ViewGroup ? (ViewGroup) decorView : null;
        if (viewGroup != null) {
            m1900f(viewGroup);
        }
        setContentView(c0459g);
        c0459g.setTag(androidx.lifecycle.runtime.R$id.view_tree_lifecycle_owner, zha.m25659b(view));
        c0459g.setTag(androidx.lifecycle.viewmodel.R$id.view_tree_view_model_store_owner, eja.m11183a(view));
        c0459g.setTag(androidx.savedstate.R$id.view_tree_saved_state_registry_owner, dja.m10417a(view));
        m1901g(this.f5301e, this.f5302f, layoutDirection);
        pr6 pr6VarMo13202c = mo13202c();
        vi3 vi3Var = new vi3() { // from class: androidx.compose.ui.window.DialogWrapper$2
            {
                super(1);
            }

            @Override // p000.vi3
            public final Object invoke(Object obj) {
                DialogC0460h dialogC0460h = this.f5278b;
                if (dialogC0460h.f5302f.f40621a) {
                    dialogC0460h.f5301e.mo0a();
                }
                return xfa.f68157a;
            }
        };
        pr6VarMo13202c.getClass();
        pr6VarMo13202c.m19462a(this, new qr6(vi3Var));
    }

    /* JADX INFO: renamed from: f */
    public static final void m1900f(ViewGroup viewGroup) {
        viewGroup.setClipChildren(false);
        if (viewGroup instanceof C0459g) {
            return;
        }
        int childCount = viewGroup.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = viewGroup.getChildAt(i);
            ViewGroup viewGroup2 = childAt instanceof ViewGroup ? (ViewGroup) childAt : null;
            if (viewGroup2 != null) {
                m1900f(viewGroup2);
            }
        }
    }

    @Override // android.app.Dialog, android.content.DialogInterface
    public final void cancel() {
    }

    /* JADX INFO: renamed from: g */
    public final void m1901g(ui3 ui3Var, ge2 ge2Var, LayoutDirection layoutDirection) {
        int i;
        this.f5301e = ui3Var;
        this.f5302f = ge2Var;
        SecureFlagPolicy secureFlagPolicy = ge2Var.f40623c;
        boolean zM1899c = AbstractC0456d.m1899c(this.f5303g);
        int i2 = pt8.f56782a[secureFlagPolicy.ordinal()];
        int i3 = 0;
        if (i2 == 1) {
            zM1899c = false;
        } else if (i2 == 2) {
            zM1899c = true;
        } else if (i2 != 3) {
            gm5.m12750e();
            return;
        }
        Window window = getWindow();
        window.getClass();
        window.setFlags(zM1899c ? 8192 : -8193, 8192);
        int i4 = ie2.f44014a[layoutDirection.ordinal()];
        if (i4 == 1) {
            i = 0;
        } else {
            if (i4 != 2) {
                gm5.m12750e();
                return;
            }
            i = 1;
        }
        C0459g c0459g = this.f5304h;
        c0459g.setLayoutDirection(i);
        boolean z = ge2Var.f40625e;
        boolean z2 = ge2Var.f40624d;
        Window window2 = c0459g.f5298j;
        boolean z3 = (c0459g.f5296I && z2 == c0459g.f5300l && z == c0459g.f5295H) ? false : true;
        c0459g.f5300l = z2;
        c0459g.f5295H = z;
        if (z3) {
            WindowManager.LayoutParams attributes = window2.getAttributes();
            int i5 = z2 ? -2 : -1;
            if (i5 != attributes.width || !c0459g.f5296I) {
                window2.setLayout(i5, -2);
                c0459g.f5296I = true;
            }
        }
        setCanceledOnTouchOutside(ge2Var.f40622b);
        Window window3 = getWindow();
        if (window3 != null) {
            if (!z) {
                i3 = Build.VERSION.SDK_INT < 31 ? 16 : 48;
            }
            window3.setSoftInputMode(i3);
        }
    }

    @Override // android.app.Dialog, android.view.KeyEvent.Callback
    public final boolean onKeyUp(int i, KeyEvent keyEvent) {
        if (!this.f5302f.f40621a || !keyEvent.isTracking() || keyEvent.isCanceled() || i != 111) {
            return super.onKeyUp(i, keyEvent);
        }
        this.f5301e.mo0a();
        return true;
    }

    /* JADX WARN: Code duplicated, block: B:31:0x0086  */
    @Override // android.app.Dialog
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        int actionMasked;
        View childAt;
        int iM21693T;
        boolean zOnTouchEvent = super.onTouchEvent(motionEvent);
        if (!this.f5302f.f40622b) {
            actionMasked = motionEvent.getActionMasked();
            if (actionMasked != 0) {
            }
            this.f5305i = false;
            return zOnTouchEvent;
        }
        C0459g c0459g = this.f5304h;
        c0459g.getClass();
        if (Math.abs(motionEvent.getX()) <= Float.MAX_VALUE && Math.abs(motionEvent.getY()) <= Float.MAX_VALUE && (childAt = c0459g.getChildAt(0)) != null) {
            int left = childAt.getLeft() + c0459g.getLeft();
            int width = childAt.getWidth() + left;
            int top = childAt.getTop() + c0459g.getTop();
            int height = childAt.getHeight() + top;
            int iM21693T2 = ss5.m21693T(motionEvent.getX());
            if (left <= iM21693T2 && iM21693T2 <= width && top <= (iM21693T = ss5.m21693T(motionEvent.getY())) && iM21693T <= height) {
                actionMasked = motionEvent.getActionMasked();
                if (actionMasked != 0 || actionMasked == 1 || actionMasked == 3) {
                    this.f5305i = false;
                    return zOnTouchEvent;
                }
            }
        }
        int actionMasked2 = motionEvent.getActionMasked();
        if (actionMasked2 == 0) {
            this.f5305i = true;
            return true;
        }
        if (actionMasked2 != 1) {
            if (actionMasked2 == 3) {
                this.f5305i = false;
                return zOnTouchEvent;
            }
        } else if (this.f5305i) {
            this.f5301e.mo0a();
            this.f5305i = false;
            return true;
        }
        return zOnTouchEvent;
    }
}
