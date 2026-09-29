package p471x2;

import android.R;
import android.os.Build;
import android.view.View;
import android.view.Window;
import android.view.WindowInsetsController;
import android.view.inputmethod.InputMethodManager;
import p326q.C8452h;

/* JADX INFO: renamed from: x2.u0 */
/* JADX INFO: loaded from: classes.dex */
public final class C10067u0 {

    /* JADX INFO: renamed from: a */
    public final e f51112a;

    /* JADX INFO: renamed from: x2.u0$a */
    public static class a extends e {

        /* JADX INFO: renamed from: a */
        public final Window f51113a;

        /* JADX INFO: renamed from: b */
        public final View f51114b;

        public a(Window window, View view) {
            this.f51113a = window;
            this.f51114b = view;
        }

        @Override // p471x2.C10067u0.e
        /* JADX INFO: renamed from: a */
        public final void mo18906a() {
            for (int i10 = 1; i10 <= 256; i10 <<= 1) {
                if ((8 & i10) != 0) {
                    if (i10 == 1) {
                        m18908f(4);
                    } else if (i10 == 2) {
                        m18908f(2);
                    } else if (i10 == 8) {
                        Window window = this.f51113a;
                        ((InputMethodManager) window.getContext().getSystemService("input_method")).hideSoftInputFromWindow(window.getDecorView().getWindowToken(), 0);
                    }
                }
            }
        }

        @Override // p471x2.C10067u0.e
        /* JADX INFO: renamed from: e */
        public final void mo18907e() {
            for (int i10 = 1; i10 <= 256; i10 <<= 1) {
                if ((8 & i10) != 0) {
                    Window window = this.f51113a;
                    if (i10 == 1) {
                        m18909g(4);
                        window.clearFlags(1024);
                    } else if (i10 == 2) {
                        m18909g(2);
                    } else if (i10 == 8) {
                        final View viewFindViewById = this.f51114b;
                        if (viewFindViewById.isInEditMode() || viewFindViewById.onCheckIsTextEditor()) {
                            viewFindViewById.requestFocus();
                        } else {
                            viewFindViewById = window.getCurrentFocus();
                        }
                        if (viewFindViewById == null) {
                            viewFindViewById = window.findViewById(R.id.content);
                        }
                        if (viewFindViewById != null && viewFindViewById.hasWindowFocus()) {
                            viewFindViewById.post(new Runnable() { // from class: x2.t0
                                @Override // java.lang.Runnable
                                public final void run() {
                                    View view = viewFindViewById;
                                    ((InputMethodManager) view.getContext().getSystemService("input_method")).showSoftInput(view, 0);
                                }
                            });
                        }
                    }
                }
            }
        }

        /* JADX INFO: renamed from: f */
        public final void m18908f(int i10) {
            View decorView = this.f51113a.getDecorView();
            decorView.setSystemUiVisibility(i10 | decorView.getSystemUiVisibility());
        }

        /* JADX INFO: renamed from: g */
        public final void m18909g(int i10) {
            View decorView = this.f51113a.getDecorView();
            decorView.setSystemUiVisibility((~i10) & decorView.getSystemUiVisibility());
        }
    }

    /* JADX INFO: renamed from: x2.u0$b */
    public static class b extends a {
        public b(Window window, View view) {
            super(window, view);
        }

        @Override // p471x2.C10067u0.e
        /* JADX INFO: renamed from: b */
        public final boolean mo18910b() {
            return (this.f51113a.getDecorView().getSystemUiVisibility() & 8192) != 0;
        }

        @Override // p471x2.C10067u0.e
        /* JADX INFO: renamed from: d */
        public final void mo18911d(boolean z10) {
            if (!z10) {
                m18909g(8192);
                return;
            }
            Window window = this.f51113a;
            window.clearFlags(67108864);
            window.addFlags(Integer.MIN_VALUE);
            m18908f(8192);
        }
    }

    /* JADX INFO: renamed from: x2.u0$c */
    public static class c extends b {
        public c(Window window, View view) {
            super(window, view);
        }

        @Override // p471x2.C10067u0.e
        /* JADX INFO: renamed from: c */
        public final void mo18912c(boolean z10) {
            if (!z10) {
                m18909g(16);
                return;
            }
            Window window = this.f51113a;
            window.clearFlags(134217728);
            window.addFlags(Integer.MIN_VALUE);
            m18908f(16);
        }
    }

    /* JADX INFO: renamed from: x2.u0$d */
    public static class d extends e {

        /* JADX INFO: renamed from: a */
        public final WindowInsetsController f51115a;

        /* JADX INFO: renamed from: b */
        public final Window f51116b;

        public d(Window window) {
            WindowInsetsController insetsController = window.getInsetsController();
            new C8452h();
            this.f51115a = insetsController;
            this.f51116b = window;
        }

        @Override // p471x2.C10067u0.e
        /* JADX INFO: renamed from: a */
        public final void mo18906a() {
            this.f51115a.hide(8);
        }

        @Override // p471x2.C10067u0.e
        /* JADX INFO: renamed from: b */
        public final boolean mo18910b() {
            return (this.f51115a.getSystemBarsAppearance() & 8) != 0;
        }

        @Override // p471x2.C10067u0.e
        /* JADX INFO: renamed from: c */
        public final void mo18912c(boolean z10) {
            WindowInsetsController windowInsetsController = this.f51115a;
            Window window = this.f51116b;
            if (z10) {
                if (window != null) {
                    View decorView = window.getDecorView();
                    decorView.setSystemUiVisibility(decorView.getSystemUiVisibility() | 16);
                }
                windowInsetsController.setSystemBarsAppearance(16, 16);
                return;
            }
            if (window != null) {
                View decorView2 = window.getDecorView();
                decorView2.setSystemUiVisibility(decorView2.getSystemUiVisibility() & (-17));
            }
            windowInsetsController.setSystemBarsAppearance(0, 16);
        }

        @Override // p471x2.C10067u0.e
        /* JADX INFO: renamed from: d */
        public final void mo18911d(boolean z10) {
            WindowInsetsController windowInsetsController = this.f51115a;
            Window window = this.f51116b;
            if (z10) {
                if (window != null) {
                    View decorView = window.getDecorView();
                    decorView.setSystemUiVisibility(decorView.getSystemUiVisibility() | 8192);
                }
                windowInsetsController.setSystemBarsAppearance(8, 8);
                return;
            }
            if (window != null) {
                View decorView2 = window.getDecorView();
                decorView2.setSystemUiVisibility(decorView2.getSystemUiVisibility() & (-8193));
            }
            windowInsetsController.setSystemBarsAppearance(0, 8);
        }

        @Override // p471x2.C10067u0.e
        /* JADX INFO: renamed from: e */
        public final void mo18907e() {
            Window window = this.f51116b;
            if (window != null && Build.VERSION.SDK_INT < 32) {
                ((InputMethodManager) window.getContext().getSystemService("input_method")).isActive();
            }
            this.f51115a.show(8);
        }
    }

    /* JADX INFO: renamed from: x2.u0$e */
    public static class e {
        /* JADX INFO: renamed from: a */
        public void mo18906a() {
            throw null;
        }

        /* JADX INFO: renamed from: b */
        public boolean mo18910b() {
            throw null;
        }

        /* JADX INFO: renamed from: c */
        public void mo18912c(boolean z10) {
            throw null;
        }

        /* JADX INFO: renamed from: d */
        public void mo18911d(boolean z10) {
            throw null;
        }

        /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
        /* JADX INFO: renamed from: e */
        public void mo18907e() {
            throw null;
        }
    }

    public C10067u0(Window window, View view) {
        if (Build.VERSION.SDK_INT >= 30) {
            this.f51112a = new d(window);
        } else {
            this.f51112a = new c(window, view);
        }
    }
}
