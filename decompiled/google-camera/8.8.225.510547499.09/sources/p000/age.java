package p000;

import android.view.WindowInsets;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
class age extends agg {

    /* JADX INFO: renamed from: a */
    final WindowInsets.Builder f296a;

    public age() {
        this.f296a = new WindowInsets.Builder();
    }

    @Override // p000.agg
    /* JADX INFO: renamed from: a */
    public ago mo575a() {
        ago agoVarM601m = ago.m601m(this.f296a.build());
        agoVarM601m.f309b.mo586f(null);
        return agoVarM601m;
    }

    @Override // p000.agg
    /* JADX INFO: renamed from: b */
    public void mo576b(acr acrVar) {
        this.f296a.setStableInsets(acrVar.m222a());
    }

    @Override // p000.agg
    /* JADX INFO: renamed from: c */
    public void mo577c(acr acrVar) {
        this.f296a.setSystemWindowInsets(acrVar.m222a());
    }

    public age(ago agoVar) {
        WindowInsets.Builder builder;
        super(agoVar);
        WindowInsets windowInsetsM607e = agoVar.m607e();
        if (windowInsetsM607e != null) {
            builder = new WindowInsets.Builder(windowInsetsM607e);
        } else {
            builder = new WindowInsets.Builder();
        }
        this.f296a = builder;
    }
}
