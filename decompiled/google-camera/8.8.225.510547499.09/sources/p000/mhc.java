package p000;

import android.content.Context;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.FrameLayout;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.apps.camera.bottombar.C0100R;
import com.google.android.material.bottomsheet.BottomSheetBehavior;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class mhc extends DialogC0181ff {

    /* JADX INFO: renamed from: a */
    public BottomSheetBehavior f40477a;

    /* JADX INFO: renamed from: b */
    public FrameLayout f40478b;

    /* JADX INFO: renamed from: c */
    public boolean f40479c;

    /* JADX INFO: renamed from: d */
    public boolean f40480d;

    /* JADX INFO: renamed from: e */
    public boolean f40481e;

    /* JADX INFO: renamed from: f */
    public boolean f40482f;

    /* JADX INFO: renamed from: g */
    public mhb f40483g;

    /* JADX INFO: renamed from: h */
    private FrameLayout f40484h;

    /* JADX INFO: renamed from: i */
    private CoordinatorLayout f40485i;

    /* JADX INFO: renamed from: j */
    private final boolean f40486j;

    /* JADX INFO: renamed from: k */
    private final mgv f40487k;

    public mhc(Context context) {
        super(context, C0100R.style.Theme_BottomSheet);
        this.f40480d = true;
        this.f40481e = true;
        this.f40487k = new mha(this);
        m8323d();
        this.f40486j = getContext().getTheme().obtainStyledAttributes(new int[]{C0100R.attr.enableEdgeToEdge}).getBoolean(0, false);
    }

    /* JADX INFO: renamed from: f */
    private final View m16367f(int i, View view, ViewGroup.LayoutParams layoutParams) {
        m16368g();
        CoordinatorLayout coordinatorLayout = (CoordinatorLayout) this.f40484h.findViewById(C0100R.id.coordinator);
        if (i != 0 && view == null) {
            view = getLayoutInflater().inflate(i, (ViewGroup) coordinatorLayout, false);
        }
        if (this.f40486j) {
            afh.m483n(this.f40478b, new mfx(this, 2));
        }
        this.f40478b.removeAllViews();
        if (layoutParams == null) {
            this.f40478b.addView(view);
        } else {
            this.f40478b.addView(view, layoutParams);
        }
        coordinatorLayout.findViewById(C0100R.id.touch_outside).setOnClickListener(new iec(this, 12));
        afq.m547g(this.f40478b, new mgz(this));
        this.f40478b.setOnTouchListener(new ggc(3));
        return this.f40484h;
    }

    /* JADX INFO: renamed from: g */
    private final void m16368g() {
        if (this.f40484h == null) {
            FrameLayout frameLayout = (FrameLayout) View.inflate(getContext(), C0100R.layout.design_bottom_sheet_dialog, null);
            this.f40484h = frameLayout;
            this.f40485i = (CoordinatorLayout) frameLayout.findViewById(C0100R.id.coordinator);
            FrameLayout frameLayout2 = (FrameLayout) this.f40484h.findViewById(C0100R.id.design_bottom_sheet);
            this.f40478b = frameLayout2;
            BottomSheetBehavior bottomSheetBehaviorM4805w = BottomSheetBehavior.m4805w(frameLayout2);
            this.f40477a = bottomSheetBehaviorM4805w;
            bottomSheetBehaviorM4805w.m4816x(this.f40487k);
            this.f40477a.m4806A(this.f40480d);
        }
    }

    /* JADX INFO: renamed from: a */
    public final BottomSheetBehavior m16369a() {
        if (this.f40477a == null) {
            m16368g();
        }
        return this.f40477a;
    }

    @Override // android.app.Dialog, android.content.DialogInterface
    public final void cancel() {
        BottomSheetBehavior bottomSheetBehaviorM16369a = m16369a();
        if (!this.f40479c || bottomSheetBehaviorM16369a.f8128x == 5) {
            super.cancel();
        } else {
            bottomSheetBehaviorM16369a.m4808C(5);
        }
    }

    @Override // android.app.Dialog, android.view.Window.Callback
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        Window window = getWindow();
        if (window != null) {
            boolean z = false;
            if (this.f40486j && Color.alpha(window.getNavigationBarColor()) < 255) {
                z = true;
            }
            FrameLayout frameLayout = this.f40484h;
            if (frameLayout != null) {
                frameLayout.setFitsSystemWindows(!z);
            }
            CoordinatorLayout coordinatorLayout = this.f40485i;
            if (coordinatorLayout != null) {
                coordinatorLayout.setFitsSystemWindows(!z);
            }
            agc.m574a(window, !z);
            mhb mhbVar = this.f40483g;
            if (mhbVar != null) {
                mhbVar.m16366d(window);
            }
        }
    }

    @Override // p000.DialogC0181ff, p000.DialogC0908pm, android.app.Dialog
    protected final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Window window = getWindow();
        if (window != null) {
            window.setStatusBarColor(0);
            window.addFlags(Integer.MIN_VALUE);
            window.setLayout(-1, -1);
        }
    }

    @Override // android.app.Dialog, android.view.Window.Callback
    public final void onDetachedFromWindow() {
        mhb mhbVar = this.f40483g;
        if (mhbVar != null) {
            mhbVar.m16366d(null);
        }
    }

    @Override // p000.DialogC0908pm, android.app.Dialog
    protected final void onStart() {
        super.onStart();
        BottomSheetBehavior bottomSheetBehavior = this.f40477a;
        if (bottomSheetBehavior == null || bottomSheetBehavior.f8128x != 5) {
            return;
        }
        bottomSheetBehavior.m4808C(4);
    }

    @Override // android.app.Dialog
    public final void setCancelable(boolean z) {
        super.setCancelable(z);
        if (this.f40480d != z) {
            this.f40480d = z;
            BottomSheetBehavior bottomSheetBehavior = this.f40477a;
            if (bottomSheetBehavior != null) {
                bottomSheetBehavior.m4806A(z);
            }
        }
    }

    @Override // android.app.Dialog
    public final void setCanceledOnTouchOutside(boolean z) {
        super.setCanceledOnTouchOutside(z);
        if (z && !this.f40480d) {
            this.f40480d = true;
        }
        this.f40481e = z;
        this.f40482f = true;
    }

    @Override // p000.DialogC0181ff, p000.DialogC0908pm, android.app.Dialog
    public final void setContentView(int i) {
        super.setContentView(m16367f(i, null, null));
    }

    @Override // p000.DialogC0181ff, p000.DialogC0908pm, android.app.Dialog
    public final void setContentView(View view) {
        super.setContentView(m16367f(0, view, null));
    }

    @Override // p000.DialogC0181ff, p000.DialogC0908pm, android.app.Dialog
    public final void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        super.setContentView(m16367f(0, view, layoutParams));
    }
}
