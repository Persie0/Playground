package p080e;

import android.view.View;
import java.util.WeakHashMap;
import p471x2.C10029b0;
import p471x2.C10049l0;
import p471x2.C10053n0;

/* JADX INFO: renamed from: e.k */
/* JADX INFO: loaded from: classes.dex */
public final class C5279k extends C10053n0 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ LayoutInflaterFactory2C5275g f33471a;

    public C5279k(LayoutInflaterFactory2C5275g layoutInflaterFactory2C5275g) {
        this.f33471a = layoutInflaterFactory2C5275g;
    }

    @Override // p471x2.InterfaceC10051m0
    /* JADX INFO: renamed from: a */
    public final void mo1078a() {
        LayoutInflaterFactory2C5275g layoutInflaterFactory2C5275g = this.f33471a;
        layoutInflaterFactory2C5275g.f33393Q.setAlpha(1.0f);
        layoutInflaterFactory2C5275g.f33396T.m18838d(null);
        layoutInflaterFactory2C5275g.f33396T = null;
    }

    @Override // p471x2.C10053n0, p471x2.InterfaceC10051m0
    /* JADX INFO: renamed from: c */
    public final void mo1080c() {
        LayoutInflaterFactory2C5275g layoutInflaterFactory2C5275g = this.f33471a;
        layoutInflaterFactory2C5275g.f33393Q.setVisibility(0);
        if (layoutInflaterFactory2C5275g.f33393Q.getParent() instanceof View) {
            View view = (View) layoutInflaterFactory2C5275g.f33393Q.getParent();
            WeakHashMap<View, C10049l0> weakHashMap = C10029b0.f50993a;
            C10029b0.h.m18706c(view);
        }
    }
}
