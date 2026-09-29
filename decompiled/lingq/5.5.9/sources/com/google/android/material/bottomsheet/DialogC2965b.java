package com.google.android.material.bottomsheet;

import ae.C0062b;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Build;
import android.os.Bundle;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.FrameLayout;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.linguist.R;
import gd.C5768g;
import java.util.ArrayList;
import java.util.WeakHashMap;
import mc.C7539e;
import mc.ViewOnClickListenerC7538d;
import mc.ViewOnTouchListenerC7540f;
import p080e.DialogC5282n;
import p471x2.C10029b0;
import p471x2.C10049l0;
import p471x2.C10057p0;
import p471x2.C10059q0;
import p471x2.C10063s0;
import p471x2.C10067u0;

/* JADX INFO: renamed from: com.google.android.material.bottomsheet.b */
/* JADX INFO: loaded from: classes.dex */
public final class DialogC2965b extends DialogC5282n {

    /* JADX INFO: renamed from: H */
    public b f14889H;

    /* JADX INFO: renamed from: I */
    public final boolean f14890I;

    /* JADX INFO: renamed from: J */
    public final a f14891J;

    /* JADX INFO: renamed from: f */
    public BottomSheetBehavior<FrameLayout> f14892f;

    /* JADX INFO: renamed from: g */
    public FrameLayout f14893g;

    /* JADX INFO: renamed from: h */
    public CoordinatorLayout f14894h;

    /* JADX INFO: renamed from: i */
    public FrameLayout f14895i;

    /* JADX INFO: renamed from: j */
    public boolean f14896j;

    /* JADX INFO: renamed from: k */
    public boolean f14897k;

    /* JADX INFO: renamed from: l */
    public boolean f14898l;

    /* JADX INFO: renamed from: com.google.android.material.bottomsheet.b$a */
    public class a extends BottomSheetBehavior.AbstractC2962c {
        public a() {
        }

        @Override // com.google.android.material.bottomsheet.BottomSheetBehavior.AbstractC2962c
        /* JADX INFO: renamed from: b */
        public final void mo8622b(View view) {
        }

        @Override // com.google.android.material.bottomsheet.BottomSheetBehavior.AbstractC2962c
        /* JADX INFO: renamed from: c */
        public final void mo8623c(View view, int i10) {
            if (i10 == 5) {
                DialogC2965b.this.cancel();
            }
        }
    }

    /* JADX INFO: renamed from: com.google.android.material.bottomsheet.b$b */
    public static class b extends BottomSheetBehavior.AbstractC2962c {

        /* JADX INFO: renamed from: a */
        public final Boolean f14900a;

        /* JADX INFO: renamed from: b */
        public final C10063s0 f14901b;

        /* JADX INFO: renamed from: c */
        public Window f14902c;

        /* JADX INFO: renamed from: d */
        public boolean f14903d;

        public b(FrameLayout frameLayout, C10063s0 c10063s0) {
            ColorStateList colorStateListM18713g;
            this.f14901b = c10063s0;
            C5768g c5768g = BottomSheetBehavior.m8602w(frameLayout).f14856i;
            if (c5768g != null) {
                colorStateListM18713g = c5768g.f34857a.f34872c;
            } else {
                WeakHashMap<View, C10049l0> weakHashMap = C10029b0.f50993a;
                colorStateListM18713g = C10029b0.i.m18713g(frameLayout);
            }
            if (colorStateListM18713g != null) {
                this.f14900a = Boolean.valueOf(C0062b.m402u1(colorStateListM18713g.getDefaultColor()));
            } else if (frameLayout.getBackground() instanceof ColorDrawable) {
                this.f14900a = Boolean.valueOf(C0062b.m402u1(((ColorDrawable) frameLayout.getBackground()).getColor()));
            } else {
                this.f14900a = null;
            }
        }

        @Override // com.google.android.material.bottomsheet.BottomSheetBehavior.AbstractC2962c
        /* JADX INFO: renamed from: a */
        public final void mo8621a(View view) {
            m8627d(view);
        }

        @Override // com.google.android.material.bottomsheet.BottomSheetBehavior.AbstractC2962c
        /* JADX INFO: renamed from: b */
        public final void mo8622b(View view) {
            m8627d(view);
        }

        @Override // com.google.android.material.bottomsheet.BottomSheetBehavior.AbstractC2962c
        /* JADX INFO: renamed from: c */
        public final void mo8623c(View view, int i10) {
            m8627d(view);
        }

        /* JADX INFO: renamed from: d */
        public final void m8627d(View view) {
            int top = view.getTop();
            C10063s0 c10063s0 = this.f14901b;
            if (top < c10063s0.m18868e()) {
                Window window = this.f14902c;
                if (window != null) {
                    Boolean bool = this.f14900a;
                    new C10067u0(window, window.getDecorView()).f51112a.mo18911d(bool == null ? this.f14903d : bool.booleanValue());
                }
                view.setPadding(view.getPaddingLeft(), c10063s0.m18868e() - view.getTop(), view.getPaddingRight(), view.getPaddingBottom());
                return;
            }
            if (view.getTop() != 0) {
                Window window2 = this.f14902c;
                if (window2 != null) {
                    new C10067u0(window2, window2.getDecorView()).f51112a.mo18911d(this.f14903d);
                }
                view.setPadding(view.getPaddingLeft(), 0, view.getPaddingRight(), view.getPaddingBottom());
            }
        }

        /* JADX INFO: renamed from: e */
        public final void m8628e(Window window) {
            if (this.f14902c == window) {
                return;
            }
            this.f14902c = window;
            if (window != null) {
                this.f14903d = new C10067u0(window, window.getDecorView()).f51112a.mo18910b();
            }
        }
    }

    public DialogC2965b(Context context, int i10) {
        if (i10 == 0) {
            TypedValue typedValue = new TypedValue();
            i10 = context.getTheme().resolveAttribute(R.attr.bottomSheetDialogTheme, typedValue, true) ? typedValue.resourceId : R.style.Theme_Design_Light_BottomSheetDialog;
        }
        super(context, i10);
        this.f14896j = true;
        this.f14897k = true;
        this.f14891J = new a();
        m11394d().mo11344t(1);
        this.f14890I = getContext().getTheme().obtainStyledAttributes(new int[]{R.attr.enableEdgeToEdge}).getBoolean(0, false);
    }

    @Override // android.app.Dialog, android.content.DialogInterface
    public final void cancel() {
        if (this.f14892f == null) {
            m8625f();
        }
        super.cancel();
    }

    /* JADX INFO: renamed from: f */
    public final void m8625f() {
        if (this.f14893g == null) {
            FrameLayout frameLayout = (FrameLayout) View.inflate(getContext(), R.layout.design_bottom_sheet_dialog, null);
            this.f14893g = frameLayout;
            this.f14894h = (CoordinatorLayout) frameLayout.findViewById(R.id.coordinator);
            FrameLayout frameLayout2 = (FrameLayout) this.f14893g.findViewById(R.id.design_bottom_sheet);
            this.f14895i = frameLayout2;
            BottomSheetBehavior<FrameLayout> bottomSheetBehaviorM8602w = BottomSheetBehavior.m8602w(frameLayout2);
            this.f14892f = bottomSheetBehaviorM8602w;
            ArrayList<BottomSheetBehavior.AbstractC2962c> arrayList = bottomSheetBehaviorM8602w.f14840W;
            a aVar = this.f14891J;
            if (!arrayList.contains(aVar)) {
                arrayList.add(aVar);
            }
            this.f14892f.m8604B(this.f14896j);
        }
    }

    /* JADX INFO: renamed from: g */
    public final FrameLayout m8626g(View view, int i10, ViewGroup.LayoutParams layoutParams) {
        m8625f();
        CoordinatorLayout coordinatorLayout = (CoordinatorLayout) this.f14893g.findViewById(R.id.coordinator);
        if (i10 != 0 && view == null) {
            view = getLayoutInflater().inflate(i10, (ViewGroup) coordinatorLayout, false);
        }
        if (this.f14890I) {
            FrameLayout frameLayout = this.f14895i;
            C2964a c2964a = new C2964a(this);
            WeakHashMap<View, C10049l0> weakHashMap = C10029b0.f50993a;
            C10029b0.i.m18727u(frameLayout, c2964a);
        }
        this.f14895i.removeAllViews();
        if (layoutParams == null) {
            this.f14895i.addView(view);
        } else {
            this.f14895i.addView(view, layoutParams);
        }
        coordinatorLayout.findViewById(R.id.touch_outside).setOnClickListener(new ViewOnClickListenerC7538d(this));
        C10029b0.m18658n(this.f14895i, new C7539e(this));
        this.f14895i.setOnTouchListener(new ViewOnTouchListenerC7540f());
        return this.f14893g;
    }

    @Override // android.app.Dialog, android.view.Window.Callback
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        Window window = getWindow();
        if (window != null) {
            boolean z10 = this.f14890I && Color.alpha(window.getNavigationBarColor()) < 255;
            FrameLayout frameLayout = this.f14893g;
            if (frameLayout != null) {
                frameLayout.setFitsSystemWindows(!z10);
            }
            CoordinatorLayout coordinatorLayout = this.f14894h;
            if (coordinatorLayout != null) {
                coordinatorLayout.setFitsSystemWindows(!z10);
            }
            boolean z11 = !z10;
            if (Build.VERSION.SDK_INT >= 30) {
                C10059q0.m18850a(window, z11);
            } else {
                C10057p0.m18849a(window, z11);
            }
            b bVar = this.f14889H;
            if (bVar != null) {
                bVar.m8628e(window);
            }
        }
    }

    @Override // p080e.DialogC5282n, androidx.activity.DialogC0192k, android.app.Dialog
    public final void onCreate(Bundle bundle) {
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
        b bVar = this.f14889H;
        if (bVar != null) {
            bVar.m8628e(null);
        }
    }

    @Override // androidx.activity.DialogC0192k, android.app.Dialog
    public final void onStart() {
        super.onStart();
        BottomSheetBehavior<FrameLayout> bottomSheetBehavior = this.f14892f;
        if (bottomSheetBehavior == null || bottomSheetBehavior.f14829L != 5) {
            return;
        }
        bottomSheetBehavior.m8606D(4);
    }

    @Override // android.app.Dialog
    public final void setCancelable(boolean z10) {
        super.setCancelable(z10);
        if (this.f14896j != z10) {
            this.f14896j = z10;
            BottomSheetBehavior<FrameLayout> bottomSheetBehavior = this.f14892f;
            if (bottomSheetBehavior != null) {
                bottomSheetBehavior.m8604B(z10);
            }
        }
    }

    @Override // android.app.Dialog
    public final void setCanceledOnTouchOutside(boolean z10) {
        super.setCanceledOnTouchOutside(z10);
        if (z10 && !this.f14896j) {
            this.f14896j = true;
        }
        this.f14897k = z10;
        this.f14898l = true;
    }

    @Override // p080e.DialogC5282n, androidx.activity.DialogC0192k, android.app.Dialog
    public final void setContentView(int i10) {
        super.setContentView(m8626g(null, i10, null));
    }

    @Override // p080e.DialogC5282n, androidx.activity.DialogC0192k, android.app.Dialog
    public final void setContentView(View view) {
        super.setContentView(m8626g(view, 0, null));
    }

    @Override // p080e.DialogC5282n, androidx.activity.DialogC0192k, android.app.Dialog
    public final void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        super.setContentView(m8626g(view, 0, layoutParams));
    }
}
