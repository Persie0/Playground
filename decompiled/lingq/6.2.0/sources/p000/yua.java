package p000;

import android.view.View;
import android.view.animation.Interpolator;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: classes2.dex */
public final class yua {

    /* JADX INFO: renamed from: c */
    public Interpolator f70519c;

    /* JADX INFO: renamed from: d */
    public zua f70520d;

    /* JADX INFO: renamed from: e */
    public boolean f70521e;

    /* JADX INFO: renamed from: b */
    public long f70518b = -1;

    /* JADX INFO: renamed from: f */
    public final w5a f70522f = new w5a(this);

    /* JADX INFO: renamed from: a */
    public final ArrayList f70517a = new ArrayList();

    /* JADX INFO: renamed from: a */
    public final void m25346a() {
        if (this.f70521e) {
            Iterator it = this.f70517a.iterator();
            while (it.hasNext()) {
                ((xua) it.next()).m24704b();
            }
            this.f70521e = false;
        }
    }

    /* JADX INFO: renamed from: b */
    public final void m25347b(xua xuaVar) {
        if (this.f70521e) {
            return;
        }
        this.f70517a.add(xuaVar);
    }

    /* JADX INFO: renamed from: c */
    public final void m25348c(xua xuaVar, xua xuaVar2) {
        ArrayList arrayList = this.f70517a;
        arrayList.add(xuaVar);
        View view = (View) xuaVar.f68829a.get();
        long duration = view != null ? view.animate().getDuration() : 0L;
        View view2 = (View) xuaVar2.f68829a.get();
        if (view2 != null) {
            view2.animate().setStartDelay(duration);
        }
        arrayList.add(xuaVar2);
    }

    /* JADX INFO: renamed from: d */
    public final void m25349d() {
        if (this.f70521e) {
            return;
        }
        this.f70518b = 250L;
    }

    /* JADX INFO: renamed from: e */
    public final void m25350e(Interpolator interpolator) {
        if (this.f70521e) {
            return;
        }
        this.f70519c = interpolator;
    }

    /* JADX INFO: renamed from: f */
    public final void m25351f(dha dhaVar) {
        if (this.f70521e) {
            return;
        }
        this.f70520d = dhaVar;
    }

    /* JADX INFO: renamed from: g */
    public final void m25352g() {
        View view;
        if (this.f70521e) {
            return;
        }
        for (xua xuaVar : this.f70517a) {
            long j = this.f70518b;
            if (j >= 0) {
                xuaVar.m24705c(j);
            }
            Interpolator interpolator = this.f70519c;
            if (interpolator != null && (view = (View) xuaVar.f68829a.get()) != null) {
                view.animate().setInterpolator(interpolator);
            }
            if (this.f70520d != null) {
                xuaVar.m24706d(this.f70522f);
            }
            View view2 = (View) xuaVar.f68829a.get();
            if (view2 != null) {
                view2.animate().start();
            }
        }
        this.f70521e = true;
    }
}
