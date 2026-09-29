package com.google.android.material.snackbar;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import java.lang.ref.WeakReference;

/* JADX INFO: renamed from: com.google.android.material.snackbar.g */
/* JADX INFO: loaded from: classes.dex */
public final class C3068g {

    /* JADX INFO: renamed from: e */
    public static C3068g f15594e;

    /* JADX INFO: renamed from: a */
    public final Object f15595a = new Object();

    /* JADX INFO: renamed from: b */
    public final Handler f15596b = new Handler(Looper.getMainLooper(), new a());

    /* JADX INFO: renamed from: c */
    public c f15597c;

    /* JADX INFO: renamed from: d */
    public c f15598d;

    /* JADX INFO: renamed from: com.google.android.material.snackbar.g$a */
    public class a implements Handler.Callback {
        public a() {
        }

        @Override // android.os.Handler.Callback
        public final boolean handleMessage(Message message) {
            if (message.what != 0) {
                return false;
            }
            C3068g c3068g = C3068g.this;
            c cVar = (c) message.obj;
            synchronized (c3068g.f15595a) {
                if (c3068g.f15597c == cVar || c3068g.f15598d == cVar) {
                    c3068g.m8848a(cVar, 2);
                }
            }
            return true;
        }
    }

    /* JADX INFO: renamed from: com.google.android.material.snackbar.g$b */
    public interface b {
        /* JADX INFO: renamed from: b */
        void mo8839b();

        /* JADX INFO: renamed from: c */
        void mo8840c(int i10);
    }

    /* JADX INFO: renamed from: com.google.android.material.snackbar.g$c */
    public static class c {

        /* JADX INFO: renamed from: a */
        public final WeakReference<b> f15600a;

        /* JADX INFO: renamed from: b */
        public int f15601b;

        /* JADX INFO: renamed from: c */
        public boolean f15602c;

        public c(int i10, BaseTransientBottomBar.C3059c c3059c) {
            this.f15600a = new WeakReference<>(c3059c);
            this.f15601b = i10;
        }
    }

    /* JADX INFO: renamed from: b */
    public static C3068g m8847b() {
        if (f15594e == null) {
            f15594e = new C3068g();
        }
        return f15594e;
    }

    /* JADX INFO: renamed from: a */
    public final boolean m8848a(c cVar, int i10) {
        b bVar = cVar.f15600a.get();
        if (bVar == null) {
            return false;
        }
        this.f15596b.removeCallbacksAndMessages(cVar);
        bVar.mo8840c(i10);
        return true;
    }

    /* JADX INFO: renamed from: c */
    public final boolean m8849c(BaseTransientBottomBar.C3059c c3059c) {
        c cVar = this.f15597c;
        boolean z10 = false;
        if (cVar != null) {
            if (c3059c != null && cVar.f15600a.get() == c3059c) {
                z10 = true;
            }
        }
        return z10;
    }

    /* JADX INFO: renamed from: d */
    public final void m8850d(c cVar) {
        int i10 = cVar.f15601b;
        if (i10 == -2) {
            return;
        }
        if (i10 <= 0) {
            i10 = i10 == -1 ? 1500 : 2750;
        }
        Handler handler = this.f15596b;
        handler.removeCallbacksAndMessages(cVar);
        handler.sendMessageDelayed(Message.obtain(handler, 0, cVar), i10);
    }
}
