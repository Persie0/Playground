package p000;

import android.os.Bundle;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class fam implements faz {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ Bundle f21131a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ fba f21132b;

    /* JADX INFO: renamed from: c */
    private final /* synthetic */ int f21133c;

    public /* synthetic */ fam(fan fanVar, Bundle bundle, int i) {
        this.f21133c = i;
        this.f21132b = fanVar;
        this.f21131a = bundle;
    }

    public /* synthetic */ fam(fba fbaVar, Bundle bundle, int i) {
        this.f21133c = i;
        this.f21132b = fbaVar;
        this.f21131a = bundle;
    }

    @Override // p000.faz
    /* JADX INFO: renamed from: a */
    public final void mo8080a(fbp fbpVar) {
        switch (this.f21133c) {
            case 0:
                Bundle bundle = this.f21131a;
                if (fbpVar instanceof ezy) {
                    fan.m8092g(fbpVar, bundle);
                    ((ezy) fbpVar).mo5209b();
                }
                break;
            case 1:
                Bundle bundle2 = this.f21131a;
                if (fbpVar instanceof fab) {
                    Bundle bundleG = fan.m8092g(fbpVar, bundle2);
                    bundleG.getClass();
                    ((fab) fbpVar).mo3551g(bundleG);
                }
                break;
            default:
                Bundle bundle3 = this.f21131a;
                if (fbpVar instanceof fbd) {
                    fba.m8092g(fbpVar, bundle3);
                    ((fbd) fbpVar).mo6422bI();
                }
                break;
        }
    }
}
