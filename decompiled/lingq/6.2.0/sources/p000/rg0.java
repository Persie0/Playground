package p000;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Color;
import android.os.Build;
import android.os.Bundle;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.FrameLayout;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.R$attr;
import com.google.android.material.R$id;
import com.google.android.material.R$layout;
import com.google.android.material.R$style;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import java.util.ArrayList;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes2.dex */
public class rg0 extends DialogC0782aq {

    /* JADX INFO: renamed from: H */
    public boolean f59217H;

    /* JADX INFO: renamed from: I */
    public qg0 f59218I;

    /* JADX INFO: renamed from: J */
    public final boolean f59219J;

    /* JADX INFO: renamed from: K */
    public gv5 f59220K;

    /* JADX INFO: renamed from: L */
    public final pg0 f59221L;

    /* JADX INFO: renamed from: g */
    public BottomSheetBehavior f59222g;

    /* JADX INFO: renamed from: h */
    public FrameLayout f59223h;

    /* JADX INFO: renamed from: i */
    public CoordinatorLayout f59224i;

    /* JADX INFO: renamed from: j */
    public FrameLayout f59225j;

    /* JADX INFO: renamed from: k */
    public boolean f59226k;

    /* JADX INFO: renamed from: l */
    public boolean f59227l;

    public rg0(Context context, int i) {
        if (i == 0) {
            TypedValue typedValue = new TypedValue();
            i = context.getTheme().resolveAttribute(R$attr.bottomSheetDialogTheme, typedValue, true) ? typedValue.resourceId : R$style.Theme_Design_Light_BottomSheetDialog;
        }
        super(context, i);
        this.f59226k = true;
        this.f59227l = true;
        this.f59221L = new pg0(this);
        m2975f().mo16970g(1);
        TypedArray typedArrayObtainStyledAttributes = getContext().getTheme().obtainStyledAttributes(new int[]{R$attr.enableEdgeToEdge});
        this.f59219J = typedArrayObtainStyledAttributes.getBoolean(0, false);
        typedArrayObtainStyledAttributes.recycle();
    }

    @Override // android.app.Dialog, android.content.DialogInterface
    public final void cancel() {
        m20655i();
        super.cancel();
    }

    /* JADX INFO: renamed from: h */
    public final void m20654h() {
        if (this.f59223h == null) {
            FrameLayout frameLayout = (FrameLayout) View.inflate(getContext(), R$layout.design_bottom_sheet_dialog, null);
            this.f59223h = frameLayout;
            this.f59224i = (CoordinatorLayout) this.f59223h.findViewById(R$id.coordinator);
            FrameLayout frameLayout2 = (FrameLayout) this.f59223h.findViewById(R$id.design_bottom_sheet);
            this.f59225j = frameLayout2;
            BottomSheetBehavior bottomSheetBehaviorM6021C = BottomSheetBehavior.m6021C(frameLayout2);
            this.f59222g = bottomSheetBehaviorM6021C;
            ArrayList arrayList = bottomSheetBehaviorM6021C.f12709Z;
            pg0 pg0Var = this.f59221L;
            if (!arrayList.contains(pg0Var)) {
                arrayList.add(pg0Var);
            }
            this.f59222g.m6030K(this.f59226k);
            this.f59220K = new gv5(this.f59222g, this.f59225j);
        }
    }

    /* JADX INFO: renamed from: i */
    public final BottomSheetBehavior m20655i() {
        if (this.f59222g == null) {
            m20654h();
        }
        return this.f59222g;
    }

    /* JADX INFO: renamed from: j */
    public final FrameLayout m20656j(View view, int i, ViewGroup.LayoutParams layoutParams) {
        m20654h();
        CoordinatorLayout coordinatorLayout = (CoordinatorLayout) this.f59223h.findViewById(R$id.coordinator);
        int i2 = 0;
        if (i != 0 && view == null) {
            view = getLayoutInflater().inflate(i, (ViewGroup) coordinatorLayout, false);
        }
        if (this.f59219J) {
            FrameLayout frameLayout = this.f59223h;
            vj6 vj6Var = new vj6(this, 6);
            WeakHashMap weakHashMap = dta.f36217a;
            wsa.m24145c(frameLayout, vj6Var);
        }
        this.f59225j.removeAllViews();
        FrameLayout frameLayout2 = this.f59225j;
        if (layoutParams == null) {
            frameLayout2.addView(view);
        } else {
            frameLayout2.addView(view, layoutParams);
        }
        coordinatorLayout.findViewById(R$id.touch_outside).setOnClickListener(new ViewOnClickListenerC3135j5(this, 2));
        dta.m10640k(this.f59225j, new og0(this, i2));
        this.f59225j.setOnTouchListener(new ja0(1));
        return this.f59223h;
    }

    /* JADX WARN: Code duplicated, block: B:13:0x0025  */
    @Override // android.app.Dialog, android.view.Window.Callback
    public void onAttachedToWindow() {
        boolean z;
        super.onAttachedToWindow();
        Window window = getWindow();
        if (window != null) {
            if (this.f59219J) {
                if (Color.alpha(Build.VERSION.SDK_INT < 35 ? window.getNavigationBarColor() : 0) < 255) {
                    z = true;
                } else {
                    z = false;
                }
            } else {
                z = false;
            }
            FrameLayout frameLayout = this.f59223h;
            if (frameLayout != null) {
                frameLayout.setFitsSystemWindows(!z);
            }
            CoordinatorLayout coordinatorLayout = this.f59224i;
            if (coordinatorLayout != null) {
                coordinatorLayout.setFitsSystemWindows(!z);
            }
            kaa.m15044f(window, !z);
            qg0 qg0Var = this.f59218I;
            if (qg0Var != null) {
                qg0Var.m19938e(window);
            }
        }
        gv5 gv5Var = this.f59220K;
        if (gv5Var == null) {
            return;
        }
        View view = (View) gv5Var.f41394d;
        boolean z2 = this.f59226k;
        kr5 kr5Var = (kr5) gv5Var.f41392b;
        if (z2) {
            if (kr5Var != null) {
                kr5Var.m15652b((jr5) gv5Var.f41393c, view, false);
            }
        } else if (kr5Var != null) {
            kr5Var.m15653c(view);
        }
    }

    @Override // p000.DialogC0782aq, p000.xc1, android.app.Dialog
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Window window = getWindow();
        if (window != null) {
            if (Build.VERSION.SDK_INT < 35) {
                window.setStatusBarColor(0);
            }
            window.addFlags(Integer.MIN_VALUE);
            window.setLayout(-1, -1);
        }
    }

    @Override // android.app.Dialog, android.view.Window.Callback
    public final void onDetachedFromWindow() {
        kr5 kr5Var;
        qg0 qg0Var = this.f59218I;
        if (qg0Var != null) {
            qg0Var.m19938e(null);
        }
        gv5 gv5Var = this.f59220K;
        if (gv5Var == null || (kr5Var = (kr5) gv5Var.f41392b) == null) {
            return;
        }
        kr5Var.m15653c((View) gv5Var.f41394d);
    }

    @Override // p000.xc1, android.app.Dialog
    public final void onStart() {
        super.onStart();
        BottomSheetBehavior bottomSheetBehavior = this.f59222g;
        if (bottomSheetBehavior == null || bottomSheetBehavior.f12698O != 5) {
            return;
        }
        bottomSheetBehavior.m6032M(4);
    }

    @Override // android.app.Dialog
    public final void setCancelable(boolean z) {
        gv5 gv5Var;
        super.setCancelable(z);
        if (this.f59226k != z) {
            this.f59226k = z;
            BottomSheetBehavior bottomSheetBehavior = this.f59222g;
            if (bottomSheetBehavior != null) {
                bottomSheetBehavior.m6030K(z);
            }
            if (getWindow() == null || (gv5Var = this.f59220K) == null) {
                return;
            }
            View view = (View) gv5Var.f41394d;
            boolean z2 = this.f59226k;
            kr5 kr5Var = (kr5) gv5Var.f41392b;
            if (z2) {
                if (kr5Var != null) {
                    kr5Var.m15652b((jr5) gv5Var.f41393c, view, false);
                }
            } else if (kr5Var != null) {
                kr5Var.m15653c(view);
            }
        }
    }

    @Override // android.app.Dialog
    public final void setCanceledOnTouchOutside(boolean z) {
        super.setCanceledOnTouchOutside(z);
        if (z && !this.f59226k) {
            this.f59226k = true;
        }
        this.f59227l = z;
        this.f59217H = true;
    }

    @Override // p000.DialogC0782aq, p000.xc1, android.app.Dialog
    public final void setContentView(View view) {
        super.setContentView(m20656j(view, 0, null));
    }

    @Override // p000.DialogC0782aq, p000.xc1, android.app.Dialog
    public final void setContentView(int i) {
        super.setContentView(m20656j(null, i, null));
    }

    @Override // p000.DialogC0782aq, p000.xc1, android.app.Dialog
    public final void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        super.setContentView(m20656j(view, 0, layoutParams));
    }
}
