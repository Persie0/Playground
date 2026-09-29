package p000;

import android.graphics.Typeface;

/* JADX INFO: loaded from: classes2.dex */
public final class ss9 extends AbstractC3584sr {

    /* JADX INFO: renamed from: s */
    public final /* synthetic */ p6d f61370s;

    /* JADX INFO: renamed from: t */
    public final /* synthetic */ us9 f61371t;

    public ss9(us9 us9Var, p6d p6dVar) {
        this.f61371t = us9Var;
        this.f61370s = p6dVar;
    }

    @Override // p000.AbstractC3584sr
    /* JADX INFO: renamed from: Q */
    public final void mo21648Q(int i) {
        this.f61371t.f64311n = true;
        this.f61370s.mo33b(i);
    }

    @Override // p000.AbstractC3584sr
    /* JADX INFO: renamed from: R */
    public final void mo21649R(Typeface typeface) {
        us9 us9Var = this.f61371t;
        Typeface typefaceCreate = Typeface.create(typeface, us9Var.f64301d);
        us9Var.f64313p = typefaceCreate;
        us9Var.f64311n = true;
        this.f61370s.mo34c(typefaceCreate, false);
    }
}
