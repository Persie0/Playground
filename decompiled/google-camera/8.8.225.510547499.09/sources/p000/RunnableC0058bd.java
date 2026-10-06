package p000;

import android.graphics.Rect;
import android.graphics.Typeface;
import android.util.Log;
import android.view.View;
import android.view.ViewPropertyAnimator;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: bd */
/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class RunnableC0058bd implements Runnable {

    /* JADX INFO: renamed from: a */
    final /* synthetic */ Object f2984a;

    /* JADX INFO: renamed from: b */
    final /* synthetic */ Object f2985b;

    /* JADX INFO: renamed from: c */
    private final /* synthetic */ int f2986c;

    public /* synthetic */ RunnableC0058bd(acl aclVar, Typeface typeface, int i) {
        this.f2986c = i;
        this.f2984a = aclVar;
        this.f2985b = typeface;
    }

    public RunnableC0058bd(aea aeaVar, Object obj, int i) {
        this.f2986c = i;
        this.f2985b = aeaVar;
        this.f2984a = obj;
    }

    public RunnableC0058bd(amm ammVar, Object obj, int i) {
        this.f2986c = i;
        this.f2985b = ammVar;
        this.f2984a = obj;
    }

    public RunnableC0058bd(View view, Rect rect, int i) {
        this.f2986c = i;
        this.f2984a = view;
        this.f2985b = rect;
    }

    public /* synthetic */ RunnableC0058bd(axl axlVar, awx awxVar, int i) {
        this.f2986c = i;
        this.f2984a = axlVar;
        this.f2985b = awxVar;
    }

    public /* synthetic */ RunnableC0058bd(azb azbVar, bcj bcjVar, int i) {
        this.f2986c = i;
        this.f2985b = azbVar;
        this.f2984a = bcjVar;
    }

    public /* synthetic */ RunnableC0058bd(azs azsVar, nps npsVar, int i) {
        this.f2986c = i;
        this.f2985b = azsVar;
        this.f2984a = npsVar;
    }

    public RunnableC0058bd(azs azsVar, nps npsVar, int i, byte[] bArr) {
        this.f2986c = i;
        this.f2985b = azsVar;
        this.f2984a = npsVar;
    }

    public RunnableC0058bd(azt aztVar, bcv bcvVar, int i) {
        this.f2986c = i;
        this.f2985b = aztVar;
        this.f2984a = bcvVar;
    }

    public RunnableC0058bd(C0062bh c0062bh, C0133dl c0133dl, int i) {
        this.f2986c = i;
        this.f2985b = c0062bh;
        this.f2984a = c0133dl;
    }

    public RunnableC0058bd(bkn bknVar, Typeface typeface, int i, byte[] bArr, byte[] bArr2) {
        this.f2986c = i;
        this.f2984a = bknVar;
        this.f2985b = typeface;
    }

    public RunnableC0058bd(C0134dm c0134dm, C0132dk c0132dk, int i) {
        this.f2986c = i;
        this.f2984a = c0134dm;
        this.f2985b = c0132dk;
    }

    public /* synthetic */ RunnableC0058bd(ExecutorC0184fi executorC0184fi, Runnable runnable, int i) {
        this.f2986c = i;
        this.f2985b = executorC0184fi;
        this.f2984a = runnable;
    }

    public /* synthetic */ RunnableC0058bd(Runnable runnable, beb bebVar, int i, byte[] bArr) {
        this.f2986c = i;
        this.f2984a = runnable;
        this.f2985b = bebVar;
    }

    public /* synthetic */ RunnableC0058bd(String str, akb akbVar, int i) {
        this.f2986c = i;
        this.f2984a = str;
        this.f2985b = akbVar;
    }

    public /* synthetic */ RunnableC0058bd(List list, bbh bbhVar, int i) {
        this.f2986c = i;
        this.f2984a = list;
        this.f2985b = bbhVar;
    }

    public RunnableC0058bd(List list, C0133dl c0133dl, int i) {
        this.f2986c = i;
        this.f2984a = list;
        this.f2985b = c0133dl;
    }

    public RunnableC0058bd(C0766kf c0766kf, ArrayList arrayList, int i) {
        this.f2986c = i;
        this.f2985b = c0766kf;
        this.f2984a = arrayList;
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r0v30, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r0v36, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r0v42, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r0v5, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r0v54, types: [aea, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v60, types: [java.lang.Object, java.lang.Runnable] */
    /* JADX WARN: Type inference failed for: r0v76, types: [java.lang.Object, nps] */
    /* JADX WARN: Type inference failed for: r0v84, types: [java.lang.Iterable, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v12, types: [java.lang.Object, java.lang.Runnable] */
    /* JADX WARN: Type inference failed for: r1v33, types: [java.lang.Object, nps] */
    @Override // java.lang.Runnable
    public final void run() throws Throwable {
        int i = 0;
        switch (this.f2986c) {
            case 0:
                AbstractC0127df.m6045s((View) this.f2984a, (Rect) this.f2985b);
                return;
            case 1:
                if (this.f2984a.contains(this.f2985b)) {
                    this.f2984a.remove(this.f2985b);
                    C0134dm.m6386h((C0133dl) this.f2985b);
                    return;
                }
                return;
            case 2:
                ((C0061bg) this.f2985b).m2373b();
                if (C0111cq.m5275S(2)) {
                    StringBuilder sb = new StringBuilder();
                    sb.append("Transition for operation ");
                    sb.append(this.f2984a);
                    sb.append("has completed");
                    return;
                }
                return;
            case 3:
                if (((C0134dm) this.f2984a).f12009b.contains(this.f2985b)) {
                    C0133dl c0133dl = (C0133dl) this.f2985b;
                    C0137dp.m6524u(c0133dl.f11919e, c0133dl.f11915a.f4586N);
                    return;
                }
                return;
            case 4:
                ((C0134dm) this.f2984a).f12009b.remove(this.f2985b);
                ((C0134dm) this.f2984a).f12010c.remove(this.f2985b);
                return;
            case 5:
                Object obj = this.f2985b;
                try {
                    this.f2984a.run();
                    return;
                } finally {
                    ((ExecutorC0184fi) obj).m8455a();
                }
            case 6:
                ?? r0 = this.f2984a;
                int size = r0.size();
                while (i < size) {
                    ixk ixkVar = (ixk) r0.get(i);
                    Object obj2 = this.f2985b;
                    C0829mo c0829mo = ixkVar.f32566a;
                    int i2 = ixkVar.f32567b;
                    int i3 = ixkVar.f32568c;
                    int i4 = ixkVar.f32569d;
                    int i5 = ixkVar.f32570e;
                    View view = c0829mo.f41155a;
                    int i6 = i4 - i2;
                    int i7 = i5 - i3;
                    if (i6 != 0) {
                        view.animate().translationX(0.0f);
                    }
                    if (i7 != 0) {
                        view.animate().translationY(0.0f);
                    }
                    ViewPropertyAnimator viewPropertyAnimatorAnimate = view.animate();
                    C0766kf c0766kf = (C0766kf) obj2;
                    c0766kf.f35803e.add(c0829mo);
                    viewPropertyAnimatorAnimate.setDuration(((AbstractC0809lv) obj2).f39373j).setListener(new C0762kb(c0766kf, c0829mo, i6, view, i7, viewPropertyAnimatorAnimate)).start();
                    i++;
                }
                ((ArrayList) this.f2984a).clear();
                ((C0766kf) this.f2985b).f35800b.remove(this.f2984a);
                return;
            case 7:
                ?? r1 = this.f2984a;
                int size2 = r1.size();
                while (i < size2) {
                    C0765ke c0765ke = (C0765ke) r1.get(i);
                    Object obj3 = this.f2985b;
                    C0829mo c0829mo2 = c0765ke.f35706a;
                    View view2 = c0829mo2 == null ? null : c0829mo2.f41155a;
                    C0829mo c0829mo3 = c0765ke.f35707b;
                    View view3 = c0829mo3 != null ? c0829mo3.f41155a : null;
                    if (view2 != null) {
                        ViewPropertyAnimator duration = view2.animate().setDuration(((AbstractC0809lv) obj3).f39374k);
                        C0766kf c0766kf2 = (C0766kf) obj3;
                        c0766kf2.f35805g.add(c0765ke.f35706a);
                        duration.translationX(c0765ke.f35710e - c0765ke.f35708c);
                        duration.translationY(c0765ke.f35711f - c0765ke.f35709d);
                        duration.alpha(0.0f).setListener(new C0763kc(c0766kf2, c0765ke, duration, view2)).start();
                    }
                    if (view3 != null) {
                        ViewPropertyAnimator viewPropertyAnimatorAnimate2 = view3.animate();
                        C0766kf c0766kf3 = (C0766kf) obj3;
                        c0766kf3.f35805g.add(c0765ke.f35707b);
                        viewPropertyAnimatorAnimate2.translationX(0.0f).translationY(0.0f).setDuration(((AbstractC0809lv) obj3).f39374k).alpha(1.0f).setListener(new C0764kd(c0766kf3, c0765ke, viewPropertyAnimatorAnimate2, view3)).start();
                    }
                    i++;
                }
                ((ArrayList) this.f2984a).clear();
                ((C0766kf) this.f2985b).f35801c.remove(this.f2984a);
                return;
            case 8:
                ?? r2 = this.f2984a;
                int size3 = r2.size();
                while (i < size3) {
                    C0829mo c0829mo4 = (C0829mo) r2.get(i);
                    Object obj4 = this.f2985b;
                    View view4 = c0829mo4.f41155a;
                    ViewPropertyAnimator viewPropertyAnimatorAnimate3 = view4.animate();
                    C0766kf c0766kf4 = (C0766kf) obj4;
                    c0766kf4.f35802d.add(c0829mo4);
                    viewPropertyAnimatorAnimate3.alpha(1.0f).setDuration(((AbstractC0809lv) obj4).f39371h).setListener(new C0761ka(c0766kf4, c0829mo4, view4, viewPropertyAnimatorAnimate3)).start();
                    i++;
                }
                ((ArrayList) this.f2984a).clear();
                ((C0766kf) this.f2985b).f35799a.remove(this.f2984a);
                return;
            case 9:
                ((acl) this.f2984a).mo198a((Typeface) this.f2985b);
                return;
            case 10:
                Object obj5 = this.f2984a;
                Object obj6 = this.f2985b;
                Object obj7 = ((bkn) obj5).f3651a;
                if (obj7 != null) {
                    ((acl) obj7).mo198a((Typeface) obj6);
                    return;
                }
                return;
            case 11:
                this.f2985b.mo309a(this.f2984a);
                return;
            case 12:
                Object obj8 = this.f2984a;
                Throwable th = (Throwable) this.f2985b;
                Log.e("FragmentStrictMode", "Policy violation with PENALTY_DEATH in ".concat(String.valueOf(obj8)), th);
                throw th;
            case 13:
                Object obj9 = this.f2985b;
                Object obj10 = this.f2984a;
                amm ammVar = (amm) obj9;
                if (ammVar.m960f()) {
                    ammVar.mo947c();
                } else {
                    ammVar.mo946b(obj10);
                }
                ammVar.f711f = 3;
                return;
            case 14:
                ?? r3 = this.f2984a;
                Object obj11 = this.f2985b;
                try {
                    r3.run();
                    return;
                } finally {
                    ((beb) obj11).m2263a();
                }
            case 15:
                ((axl) this.f2984a).f2661b.mo309a(this.f2985b);
                return;
            case 16:
                ((azb) this.f2985b).mo1714a((bcj) this.f2984a, false);
                return;
            case 17:
                Object obj12 = this.f2985b;
                ?? r4 = this.f2984a;
                if (((azs) obj12).f2800g.isCancelled()) {
                    r4.cancel(true);
                    return;
                }
                return;
            case 18:
                if (((azs) this.f2985b).f2800g.isCancelled()) {
                    return;
                }
                try {
                    this.f2984a.get();
                    ayc.m2099a();
                    Object obj13 = this.f2985b;
                    ((azs) obj13).f2800g.m2284f(((azs) obj13).f2797d.mo1695a());
                    return;
                } catch (Throwable th2) {
                    ((azs) this.f2985b).f2800g.m2283e(th2);
                    return;
                }
            case 19:
                ayc.m2099a();
                int i8 = azt.f2811d;
                bcv bcvVar = (bcv) this.f2984a;
                String str = bcvVar.f2964a;
                ((azt) this.f2985b).f2812a.mo2118c(bcvVar);
                return;
            default:
                ?? r5 = this.f2984a;
                Object obj14 = this.f2985b;
                Iterator it = r5.iterator();
                while (it.hasNext()) {
                    ((bal) it.next()).mo2165a(((bbh) obj14).f2899d);
                }
                return;
        }
    }
}
