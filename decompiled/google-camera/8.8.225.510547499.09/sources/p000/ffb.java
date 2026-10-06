package p000;

import android.app.Activity;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class ffb implements aea {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ Object f21596a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Object f21597b;

    /* JADX INFO: renamed from: c */
    private final /* synthetic */ int f21598c;

    public /* synthetic */ ffb(axj axjVar, Activity activity, int i) {
        this.f21598c = i;
        this.f21597b = axjVar;
        this.f21596a = activity;
    }

    public /* synthetic */ ffb(kiq kiqVar, fgx fgxVar, int i) {
        this.f21598c = i;
        this.f21597b = kiqVar;
        this.f21596a = fgxVar;
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [fgx, java.lang.Object] */
    @Override // p000.aea
    /* JADX INFO: renamed from: a */
    public final void mo309a(Object obj) {
        switch (this.f21598c) {
            case 0:
                Object obj2 = this.f21597b;
                ?? r1 = this.f21596a;
                kfd kfdVarM14358b = ((kiq) obj2).m14358b();
                if (kfdVarM14358b != null) {
                    r1.mo6927f(kfdVarM14358b.f35811b);
                    break;
                }
                break;
            default:
                Object obj3 = this.f21597b;
                Object obj4 = this.f21596a;
                axj axjVar = (axj) obj3;
                axh axhVar = axjVar.f2658e;
                if (axhVar != null) {
                    Activity activity = (Activity) obj4;
                    axhVar.m2083a(activity, axjVar.m2084a(activity));
                }
                break;
        }
    }
}
