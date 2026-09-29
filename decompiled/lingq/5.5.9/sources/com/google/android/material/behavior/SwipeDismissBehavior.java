package com.google.android.material.behavior;

import android.view.MotionEvent;
import android.view.View;
import android.view.ViewParent;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.snackbar.BaseTransientBottomBar;
import com.google.android.material.snackbar.C3066e;
import com.google.android.material.snackbar.C3068g;
import java.util.WeakHashMap;
import p084e3.C5365c;
import p471x2.C10029b0;
import p471x2.C10049l0;
import p497y2.C10284f;

/* JADX INFO: loaded from: classes.dex */
public class SwipeDismissBehavior<V extends View> extends CoordinatorLayout.AbstractC0768c<V> {

    /* JADX INFO: renamed from: a */
    public C5365c f14778a;

    /* JADX INFO: renamed from: b */
    public InterfaceC2951b f14779b;

    /* JADX INFO: renamed from: c */
    public boolean f14780c;

    /* JADX INFO: renamed from: d */
    public boolean f14781d;

    /* JADX INFO: renamed from: e */
    public int f14782e = 2;

    /* JADX INFO: renamed from: f */
    public final float f14783f = 0.5f;

    /* JADX INFO: renamed from: g */
    public float f14784g = 0.0f;

    /* JADX INFO: renamed from: h */
    public float f14785h = 0.5f;

    /* JADX INFO: renamed from: i */
    public final C2950a f14786i = new C2950a();

    /* JADX INFO: renamed from: com.google.android.material.behavior.SwipeDismissBehavior$a */
    public class C2950a extends C5365c.c {

        /* JADX INFO: renamed from: a */
        public int f14787a;

        /* JADX INFO: renamed from: b */
        public int f14788b = -1;

        public C2950a() {
        }

        @Override // p084e3.C5365c.c
        /* JADX INFO: renamed from: a */
        public final int mo8584a(View view, int i10) {
            int width;
            int width2;
            int width3;
            WeakHashMap<View, C10049l0> weakHashMap = C10029b0.f50993a;
            boolean z10 = C10029b0.e.m18686d(view) == 1;
            int i11 = SwipeDismissBehavior.this.f14782e;
            if (i11 == 0) {
                if (z10) {
                    width = this.f14787a - view.getWidth();
                    width2 = this.f14787a;
                } else {
                    width = this.f14787a;
                    width3 = view.getWidth();
                    width2 = width3 + width;
                }
            } else if (i11 != 1) {
                width = this.f14787a - view.getWidth();
                width2 = view.getWidth() + this.f14787a;
            } else if (z10) {
                width = this.f14787a;
                width3 = view.getWidth();
                width2 = width3 + width;
            } else {
                width = this.f14787a - view.getWidth();
                width2 = this.f14787a;
            }
            return Math.min(Math.max(width, i10), width2);
        }

        @Override // p084e3.C5365c.c
        /* JADX INFO: renamed from: b */
        public final int mo8585b(View view, int i10) {
            return view.getTop();
        }

        @Override // p084e3.C5365c.c
        /* JADX INFO: renamed from: c */
        public final int mo8586c(View view) {
            return view.getWidth();
        }

        @Override // p084e3.C5365c.c
        /* JADX INFO: renamed from: e */
        public final void mo8587e(View view, int i10) {
            this.f14788b = i10;
            this.f14787a = view.getLeft();
            ViewParent parent = view.getParent();
            if (parent != null) {
                SwipeDismissBehavior swipeDismissBehavior = SwipeDismissBehavior.this;
                swipeDismissBehavior.f14781d = true;
                parent.requestDisallowInterceptTouchEvent(true);
                swipeDismissBehavior.f14781d = false;
            }
        }

        /* JADX WARN: Unreachable blocks removed: 2, instructions: 2 */
        @Override // p084e3.C5365c.c
        /* JADX INFO: renamed from: f */
        public final void mo8588f(int i10) {
            InterfaceC2951b interfaceC2951b = SwipeDismissBehavior.this.f14779b;
            if (interfaceC2951b != null) {
                BaseTransientBottomBar baseTransientBottomBar = ((C3066e) interfaceC2951b).f15592a;
                if (i10 == 0) {
                    C3068g c3068gM8847b = C3068g.m8847b();
                    BaseTransientBottomBar.C3059c c3059c = baseTransientBottomBar.f15564t;
                    synchronized (c3068gM8847b.f15595a) {
                        if (c3068gM8847b.m8849c(c3059c)) {
                            C3068g.c cVar = c3068gM8847b.f15597c;
                            if (cVar.f15602c) {
                                cVar.f15602c = false;
                                c3068gM8847b.m8850d(cVar);
                            }
                        }
                    }
                    return;
                }
                if (i10 == 1 || i10 == 2) {
                    C3068g c3068gM8847b2 = C3068g.m8847b();
                    BaseTransientBottomBar.C3059c c3059c2 = baseTransientBottomBar.f15564t;
                    synchronized (c3068gM8847b2.f15595a) {
                        if (c3068gM8847b2.m8849c(c3059c2)) {
                            C3068g.c cVar2 = c3068gM8847b2.f15597c;
                            if (!cVar2.f15602c) {
                                cVar2.f15602c = true;
                                c3068gM8847b2.f15596b.removeCallbacksAndMessages(cVar2);
                            }
                        }
                    }
                }
            }
        }

        @Override // p084e3.C5365c.c
        /* JADX INFO: renamed from: g */
        public final void mo8589g(View view, int i10, int i11) {
            float width = view.getWidth();
            SwipeDismissBehavior swipeDismissBehavior = SwipeDismissBehavior.this;
            float f3 = width * swipeDismissBehavior.f14784g;
            float width2 = view.getWidth() * swipeDismissBehavior.f14785h;
            float fAbs = Math.abs(i10 - this.f14787a);
            if (fAbs <= f3) {
                view.setAlpha(1.0f);
            } else if (fAbs >= width2) {
                view.setAlpha(0.0f);
            } else {
                view.setAlpha(Math.min(Math.max(0.0f, 1.0f - ((fAbs - f3) / (width2 - f3))), 1.0f));
            }
        }

        /* JADX WARN: Code duplicated, block: B:31:0x0069  */
        @Override // p084e3.C5365c.c
        /* JADX INFO: renamed from: h */
        public final void mo8590h(View view, float f3, float f10) {
            boolean z10;
            int i10;
            InterfaceC2951b interfaceC2951b;
            this.f14788b = -1;
            int width = view.getWidth();
            boolean z11 = true;
            SwipeDismissBehavior swipeDismissBehavior = SwipeDismissBehavior.this;
            if (f3 != 0.0f) {
                WeakHashMap<View, C10049l0> weakHashMap = C10029b0.f50993a;
                boolean z12 = C10029b0.e.m18686d(view) == 1;
                int i11 = swipeDismissBehavior.f14782e;
                if (i11 != 2) {
                    if (i11 != 0) {
                        if (i11 == 1) {
                            if (z12) {
                                if (f3 > 0.0f) {
                                }
                            } else if (f3 < 0.0f) {
                            }
                        }
                        z10 = false;
                    } else if (z12) {
                        if (f3 >= 0.0f) {
                            z10 = false;
                        }
                    } else if (f3 <= 0.0f) {
                        z10 = false;
                    }
                }
                z10 = true;
            } else {
                if (Math.abs(view.getLeft() - this.f14787a) >= Math.round(view.getWidth() * swipeDismissBehavior.f14783f)) {
                    z10 = true;
                } else {
                    z10 = false;
                }
            }
            if (z10) {
                if (f3 >= 0.0f) {
                    int left = view.getLeft();
                    int i12 = this.f14787a;
                    if (left >= i12) {
                        i10 = i12 + width;
                    }
                }
                i10 = this.f14787a - width;
            } else {
                i10 = this.f14787a;
                z11 = false;
            }
            if (swipeDismissBehavior.f14778a.m11537q(i10, view.getTop())) {
                RunnableC2952c runnableC2952c = new RunnableC2952c(view, z11);
                WeakHashMap<View, C10049l0> weakHashMap2 = C10029b0.f50993a;
                C10029b0.d.m18676m(view, runnableC2952c);
            } else {
                if (z11 && (interfaceC2951b = swipeDismissBehavior.f14779b) != null) {
                    ((C3066e) interfaceC2951b).m8846a(view);
                }
            }
        }

        @Override // p084e3.C5365c.c
        /* JADX INFO: renamed from: i */
        public final boolean mo8591i(View view, int i10) {
            int i11 = this.f14788b;
            if (i11 == -1 || i11 == i10) {
                if (SwipeDismissBehavior.this.mo8583s(view)) {
                    return true;
                }
            }
            return false;
        }
    }

    /* JADX INFO: renamed from: com.google.android.material.behavior.SwipeDismissBehavior$b */
    public interface InterfaceC2951b {
    }

    /* JADX INFO: renamed from: com.google.android.material.behavior.SwipeDismissBehavior$c */
    public class RunnableC2952c implements Runnable {

        /* JADX INFO: renamed from: a */
        public final View f14790a;

        /* JADX INFO: renamed from: b */
        public final boolean f14791b;

        public RunnableC2952c(View view, boolean z10) {
            this.f14790a = view;
            this.f14791b = z10;
        }

        @Override // java.lang.Runnable
        public final void run() {
            InterfaceC2951b interfaceC2951b;
            SwipeDismissBehavior swipeDismissBehavior = SwipeDismissBehavior.this;
            C5365c c5365c = swipeDismissBehavior.f14778a;
            View view = this.f14790a;
            if (c5365c != null && c5365c.m11527g()) {
                WeakHashMap<View, C10049l0> weakHashMap = C10029b0.f50993a;
                C10029b0.d.m18676m(view, this);
            } else {
                if (!this.f14791b || (interfaceC2951b = swipeDismissBehavior.f14779b) == null) {
                    return;
                }
                ((C3066e) interfaceC2951b).m8846a(view);
            }
        }
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.AbstractC0768c
    /* JADX INFO: renamed from: g */
    public boolean mo2941g(CoordinatorLayout coordinatorLayout, V v10, MotionEvent motionEvent) {
        boolean zM2926j = this.f14780c;
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            zM2926j = coordinatorLayout.m2926j(v10, (int) motionEvent.getX(), (int) motionEvent.getY());
            this.f14780c = zM2926j;
        } else if (actionMasked == 1 || actionMasked == 3) {
            this.f14780c = false;
        }
        if (!zM2926j) {
            return false;
        }
        if (this.f14778a == null) {
            this.f14778a = new C5365c(coordinatorLayout.getContext(), coordinatorLayout, this.f14786i);
        }
        return !this.f14781d && this.f14778a.m11538r(motionEvent);
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.AbstractC0768c
    /* JADX INFO: renamed from: h */
    public final boolean mo2942h(CoordinatorLayout coordinatorLayout, V v10, int i10) {
        WeakHashMap<View, C10049l0> weakHashMap = C10029b0.f50993a;
        if (C10029b0.d.m18666c(v10) == 0) {
            C10029b0.d.m18682s(v10, 1);
            C10029b0.m18655k(v10, 1048576);
            C10029b0.m18652h(v10, 0);
            if (mo8583s(v10)) {
                C10029b0.m18656l(v10, C10284f.a.f51749l, new C2953a(this));
            }
        }
        return false;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.AbstractC0768c
    /* JADX INFO: renamed from: r */
    public final boolean mo2952r(CoordinatorLayout coordinatorLayout, V v10, MotionEvent motionEvent) {
        if (this.f14778a == null) {
            return false;
        }
        if (!this.f14781d || motionEvent.getActionMasked() != 3) {
            this.f14778a.m11531k(motionEvent);
        }
        return true;
    }

    /* JADX INFO: renamed from: s */
    public boolean mo8583s(View view) {
        return true;
    }
}
