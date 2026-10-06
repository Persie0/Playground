package p000;

import android.view.View;
import android.view.animation.Interpolator;
import java.lang.ref.WeakReference;
import java.util.ArrayList;

/* JADX INFO: renamed from: gf */
/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class C0208gf {

    /* JADX INFO: renamed from: b */
    aga f24468b;

    /* JADX INFO: renamed from: c */
    public boolean f24469c;

    /* JADX INFO: renamed from: e */
    private Interpolator f24471e;

    /* JADX INFO: renamed from: d */
    private long f24470d = -1;

    /* JADX INFO: renamed from: f */
    private final agb f24472f = new C0207ge(this);

    /* JADX INFO: renamed from: a */
    public final ArrayList f24467a = new ArrayList();

    /* JADX INFO: renamed from: a */
    public final void m9154a() {
        if (this.f24469c) {
            ArrayList arrayList = this.f24467a;
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                ((bkn) arrayList.get(i)).m2593n();
            }
            this.f24469c = false;
        }
    }

    /* JADX INFO: renamed from: b */
    public final void m9155b() {
        View view;
        if (this.f24469c) {
            return;
        }
        ArrayList arrayList = this.f24467a;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            bkn bknVar = (bkn) arrayList.get(i);
            long j = this.f24470d;
            if (j >= 0) {
                bknVar.m2595p(j);
            }
            Interpolator interpolator = this.f24471e;
            if (interpolator != null && (view = (View) ((WeakReference) bknVar.f3651a).get()) != null) {
                view.animate().setInterpolator(interpolator);
            }
            if (this.f24468b != null) {
                bknVar.m2596q(this.f24472f);
            }
            View view2 = (View) ((WeakReference) bknVar.f3651a).get();
            if (view2 != null) {
                view2.animate().start();
            }
        }
        this.f24469c = true;
    }

    /* JADX INFO: renamed from: c */
    public final void m9156c() {
        if (this.f24469c) {
            return;
        }
        this.f24470d = 250L;
    }

    /* JADX INFO: renamed from: d */
    public final void m9157d(Interpolator interpolator) {
        if (this.f24469c) {
            return;
        }
        this.f24471e = interpolator;
    }

    /* JADX INFO: renamed from: e */
    public final void m9158e(aga agaVar) {
        if (this.f24469c) {
            return;
        }
        this.f24468b = agaVar;
    }

    /* JADX INFO: renamed from: f */
    public final void m9159f(bkn bknVar) {
        if (this.f24469c) {
            return;
        }
        this.f24467a.add(bknVar);
    }
}
