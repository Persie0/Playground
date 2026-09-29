package p080e;

import android.view.View;
import android.view.ViewGroup;
import java.util.WeakHashMap;
import p471x2.C10029b0;
import p471x2.C10049l0;
import p471x2.C10053n0;

/* JADX INFO: renamed from: e.j */
/* JADX INFO: loaded from: classes.dex */
public final class RunnableC5278j implements Runnable {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ LayoutInflaterFactory2C5275g f33469a;

    /* JADX INFO: renamed from: e.j$a */
    public class a extends C10053n0 {
        public a() {
        }

        @Override // p471x2.InterfaceC10051m0
        /* JADX INFO: renamed from: a */
        public final void mo1078a() {
            RunnableC5278j runnableC5278j = RunnableC5278j.this;
            runnableC5278j.f33469a.f33393Q.setAlpha(1.0f);
            LayoutInflaterFactory2C5275g layoutInflaterFactory2C5275g = runnableC5278j.f33469a;
            layoutInflaterFactory2C5275g.f33396T.m18838d(null);
            layoutInflaterFactory2C5275g.f33396T = null;
        }

        @Override // p471x2.C10053n0, p471x2.InterfaceC10051m0
        /* JADX INFO: renamed from: c */
        public final void mo1080c() {
            RunnableC5278j.this.f33469a.f33393Q.setVisibility(0);
        }
    }

    public RunnableC5278j(LayoutInflaterFactory2C5275g layoutInflaterFactory2C5275g) {
        this.f33469a = layoutInflaterFactory2C5275g;
    }

    /* JADX WARN: Code duplicated, block: B:12:0x0033  */
    @Override // java.lang.Runnable
    public final void run() {
        boolean z10;
        ViewGroup viewGroup;
        LayoutInflaterFactory2C5275g layoutInflaterFactory2C5275g = this.f33469a;
        layoutInflaterFactory2C5275g.f33394R.showAtLocation(layoutInflaterFactory2C5275g.f33393Q, 55, 0, 0);
        C10049l0 c10049l0 = layoutInflaterFactory2C5275g.f33396T;
        if (c10049l0 != null) {
            c10049l0.m18836b();
        }
        if (!layoutInflaterFactory2C5275g.f33398V || (viewGroup = layoutInflaterFactory2C5275g.f33399W) == null) {
            z10 = false;
        } else {
            WeakHashMap<View, C10049l0> weakHashMap = C10029b0.f50993a;
            if (C10029b0.g.m18699c(viewGroup)) {
                z10 = true;
            } else {
                z10 = false;
            }
        }
        if (!z10) {
            layoutInflaterFactory2C5275g.f33393Q.setAlpha(1.0f);
            layoutInflaterFactory2C5275g.f33393Q.setVisibility(0);
            return;
        }
        layoutInflaterFactory2C5275g.f33393Q.setAlpha(0.0f);
        C10049l0 c10049l0M18645a = C10029b0.m18645a(layoutInflaterFactory2C5275g.f33393Q);
        c10049l0M18645a.m18835a(1.0f);
        layoutInflaterFactory2C5275g.f33396T = c10049l0M18645a;
        c10049l0M18645a.m18838d(new a());
    }
}
