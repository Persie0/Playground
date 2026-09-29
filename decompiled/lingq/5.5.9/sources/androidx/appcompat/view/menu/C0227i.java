package androidx.appcompat.view.menu;

import android.content.Context;
import android.graphics.Point;
import android.graphics.Rect;
import android.view.Display;
import android.view.Gravity;
import android.view.View;
import android.view.WindowManager;
import android.widget.PopupWindow;
import com.linguist.R;
import java.util.WeakHashMap;
import p185j.AbstractC6394d;
import p471x2.C10029b0;
import p471x2.C10049l0;

/* JADX INFO: renamed from: androidx.appcompat.view.menu.i */
/* JADX INFO: loaded from: classes.dex */
public class C0227i {

    /* JADX INFO: renamed from: a */
    public final Context f750a;

    /* JADX INFO: renamed from: b */
    public final C0224f f751b;

    /* JADX INFO: renamed from: c */
    public final boolean f752c;

    /* JADX INFO: renamed from: d */
    public final int f753d;

    /* JADX INFO: renamed from: e */
    public final int f754e;

    /* JADX INFO: renamed from: f */
    public View f755f;

    /* JADX INFO: renamed from: g */
    public int f756g;

    /* JADX INFO: renamed from: h */
    public boolean f757h;

    /* JADX INFO: renamed from: i */
    public InterfaceC0228j.a f758i;

    /* JADX INFO: renamed from: j */
    public AbstractC6394d f759j;

    /* JADX INFO: renamed from: k */
    public PopupWindow.OnDismissListener f760k;

    /* JADX INFO: renamed from: l */
    public final a f761l;

    /* JADX INFO: renamed from: androidx.appcompat.view.menu.i$a */
    public class a implements PopupWindow.OnDismissListener {
        public a() {
        }

        @Override // android.widget.PopupWindow.OnDismissListener
        public final void onDismiss() {
            C0227i.this.mo952c();
        }
    }

    /* JADX INFO: renamed from: androidx.appcompat.view.menu.i$b */
    public static class b {
        /* JADX INFO: renamed from: a */
        public static void m954a(Display display, Point point) {
            display.getRealSize(point);
        }
    }

    public C0227i(int i10, int i11, Context context, View view, C0224f c0224f, boolean z10) {
        this.f756g = 8388611;
        this.f761l = new a();
        this.f750a = context;
        this.f751b = c0224f;
        this.f755f = view;
        this.f752c = z10;
        this.f753d = i10;
        this.f754e = i11;
    }

    public C0227i(Context context, C0224f c0224f, View view, boolean z10) {
        this(R.attr.actionOverflowMenuStyle, 0, context, view, c0224f, z10);
    }

    /* JADX INFO: renamed from: a */
    public final AbstractC6394d m950a() {
        AbstractC6394d viewOnKeyListenerC0230l;
        if (this.f759j == null) {
            Context context = this.f750a;
            Display defaultDisplay = ((WindowManager) context.getSystemService("window")).getDefaultDisplay();
            Point point = new Point();
            b.m954a(defaultDisplay, point);
            if (Math.min(point.x, point.y) >= context.getResources().getDimensionPixelSize(R.dimen.abc_cascading_menus_min_smallest_width)) {
                viewOnKeyListenerC0230l = new ViewOnKeyListenerC0220b(this.f750a, this.f755f, this.f753d, this.f754e, this.f752c);
            } else {
                viewOnKeyListenerC0230l = new ViewOnKeyListenerC0230l(this.f753d, this.f754e, this.f750a, this.f755f, this.f751b, this.f752c);
            }
            viewOnKeyListenerC0230l.mo902n(this.f751b);
            viewOnKeyListenerC0230l.mo907t(this.f761l);
            viewOnKeyListenerC0230l.mo903p(this.f755f);
            viewOnKeyListenerC0230l.mo890f(this.f758i);
            viewOnKeyListenerC0230l.mo904q(this.f757h);
            viewOnKeyListenerC0230l.mo905r(this.f756g);
            this.f759j = viewOnKeyListenerC0230l;
        }
        return this.f759j;
    }

    /* JADX INFO: renamed from: b */
    public final boolean m951b() {
        AbstractC6394d abstractC6394d = this.f759j;
        return abstractC6394d != null && abstractC6394d.mo893a();
    }

    /* JADX INFO: renamed from: c */
    public void mo952c() {
        this.f759j = null;
        PopupWindow.OnDismissListener onDismissListener = this.f760k;
        if (onDismissListener != null) {
            onDismissListener.onDismiss();
        }
    }

    /* JADX INFO: renamed from: d */
    public final void m953d(int i10, int i11, boolean z10, boolean z11) {
        AbstractC6394d abstractC6394dM950a = m950a();
        abstractC6394dM950a.mo908u(z11);
        if (z10) {
            int i12 = this.f756g;
            View view = this.f755f;
            WeakHashMap<View, C10049l0> weakHashMap = C10029b0.f50993a;
            if ((Gravity.getAbsoluteGravity(i12, C10029b0.e.m18686d(view)) & 7) == 5) {
                i10 -= this.f755f.getWidth();
            }
            abstractC6394dM950a.mo906s(i10);
            abstractC6394dM950a.mo909v(i11);
            int i13 = (int) ((this.f750a.getResources().getDisplayMetrics().density * 48.0f) / 2.0f);
            abstractC6394dM950a.f36849a = new Rect(i10 - i13, i11 - i13, i10 + i13, i11 + i13);
        }
        abstractC6394dM950a.mo894b();
    }
}
