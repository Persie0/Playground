package p000;

import android.content.Context;
import android.graphics.Point;
import android.graphics.Rect;
import android.view.Display;
import android.view.Gravity;
import android.view.View;
import android.view.WindowManager;
import android.widget.PopupWindow;
import androidx.appcompat.R$dimen;

/* JADX INFO: loaded from: classes2.dex */
public class ww5 {

    /* JADX INFO: renamed from: a */
    public final Context f67412a;

    /* JADX INFO: renamed from: b */
    public final hw5 f67413b;

    /* JADX INFO: renamed from: c */
    public final boolean f67414c;

    /* JADX INFO: renamed from: d */
    public final int f67415d;

    /* JADX INFO: renamed from: e */
    public final int f67416e;

    /* JADX INFO: renamed from: f */
    public View f67417f;

    /* JADX INFO: renamed from: h */
    public boolean f67419h;

    /* JADX INFO: renamed from: i */
    public dx5 f67420i;

    /* JADX INFO: renamed from: j */
    public uw5 f67421j;

    /* JADX INFO: renamed from: k */
    public PopupWindow.OnDismissListener f67422k;

    /* JADX INFO: renamed from: g */
    public int f67418g = 8388611;

    /* JADX INFO: renamed from: l */
    public final vw5 f67423l = new vw5(this);

    public ww5(int i, int i2, hw5 hw5Var, Context context, View view, boolean z) {
        this.f67412a = context;
        this.f67413b = hw5Var;
        this.f67417f = view;
        this.f67414c = z;
        this.f67415d = i;
        this.f67416e = i2;
    }

    /* JADX INFO: renamed from: a */
    public final void m24176a() {
        if (m24178c()) {
            this.f67421j.dismiss();
        }
    }

    /* JADX INFO: renamed from: b */
    public final uw5 m24177b() {
        uw5 sg9Var;
        if (this.f67421j == null) {
            Context context = this.f67412a;
            Display defaultDisplay = ((WindowManager) context.getSystemService("window")).getDefaultDisplay();
            Point point = new Point();
            defaultDisplay.getRealSize(point);
            if (Math.min(point.x, point.y) >= context.getResources().getDimensionPixelSize(R$dimen.abc_cascading_menus_min_smallest_width)) {
                sg9Var = new lo0(this.f67412a, this.f67417f, this.f67415d, this.f67416e, this.f67414c);
            } else {
                View view = this.f67417f;
                sg9Var = new sg9(this.f67415d, this.f67416e, this.f67413b, this.f67412a, view, this.f67414c);
            }
            sg9Var.mo16399n(this.f67413b);
            sg9Var.mo16404t(this.f67423l);
            sg9Var.mo16400p(this.f67417f);
            sg9Var.mo709i(this.f67420i);
            sg9Var.mo16401q(this.f67419h);
            sg9Var.mo16402r(this.f67418g);
            this.f67421j = sg9Var;
        }
        return this.f67421j;
    }

    /* JADX INFO: renamed from: c */
    public final boolean m24178c() {
        uw5 uw5Var = this.f67421j;
        return uw5Var != null && uw5Var.mo10357a();
    }

    /* JADX INFO: renamed from: d */
    public void mo22470d() {
        this.f67421j = null;
        PopupWindow.OnDismissListener onDismissListener = this.f67422k;
        if (onDismissListener != null) {
            onDismissListener.onDismiss();
        }
    }

    /* JADX INFO: renamed from: e */
    public final void m24179e(boolean z) {
        this.f67419h = z;
        uw5 uw5Var = this.f67421j;
        if (uw5Var != null) {
            uw5Var.mo16401q(z);
        }
    }

    /* JADX INFO: renamed from: f */
    public final void m24180f() {
        if (m24178c()) {
            return;
        }
        if (this.f67417f != null) {
            m24181g(0, 0, false, false);
        } else {
            C3386nv.m17633t("MenuPopupHelper cannot be used without an anchor");
        }
    }

    /* JADX INFO: renamed from: g */
    public final void m24181g(int i, int i2, boolean z, boolean z2) {
        uw5 uw5VarM24177b = m24177b();
        uw5VarM24177b.mo16405u(z2);
        if (z) {
            if ((Gravity.getAbsoluteGravity(this.f67418g, this.f67417f.getLayoutDirection()) & 7) == 5) {
                i -= this.f67417f.getWidth();
            }
            uw5VarM24177b.mo16403s(i);
            uw5VarM24177b.mo16406v(i2);
            int i3 = (int) ((this.f67412a.getResources().getDisplayMetrics().density * 48.0f) / 2.0f);
            uw5VarM24177b.f64467a = new Rect(i - i3, i2 - i3, i + i3, i2 + i3);
        }
        uw5VarM24177b.mo10360f();
    }
}
