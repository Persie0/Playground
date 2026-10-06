package p000;

/* JADX INFO: renamed from: hr */
/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class C0247hr implements aga {

    /* JADX INFO: renamed from: a */
    int f29234a;

    /* JADX INFO: renamed from: b */
    final /* synthetic */ AbstractC0248hs f29235b;

    /* JADX INFO: renamed from: c */
    private boolean f29236c = false;

    protected C0247hr(AbstractC0248hs abstractC0248hs) {
        this.f29235b = abstractC0248hs;
    }

    @Override // p000.aga
    /* JADX INFO: renamed from: a */
    public final void mo571a() {
        if (this.f29236c) {
            return;
        }
        AbstractC0248hs abstractC0248hs = this.f29235b;
        abstractC0248hs.f29382f = null;
        super/*android.view.ViewGroup*/.setVisibility(this.f29234a);
    }

    @Override // p000.aga
    /* JADX INFO: renamed from: b */
    public final void mo572b() {
        super/*android.view.ViewGroup*/.setVisibility(0);
        this.f29236c = false;
    }

    @Override // p000.aga
    /* JADX INFO: renamed from: c */
    public final void mo573c() {
        this.f29236c = true;
    }

    /* JADX INFO: renamed from: d */
    public final void m10645d(bkn bknVar, int i) {
        this.f29235b.f29382f = bknVar;
        this.f29234a = i;
    }
}
