package p000;

/* JADX INFO: loaded from: classes2.dex */
public final class gnd extends ind {

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ ind f41059c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ ind f41060d;

    public gnd(ind indVar, ind indVar2) {
        this.f41059c = indVar;
        this.f41060d = indVar2;
    }

    @Override // p000.ind
    /* JADX INFO: renamed from: a */
    public final void mo11963a() {
        ind indVar = this.f41060d;
        try {
            this.f41059c.mo11963a();
        } finally {
            indVar.mo11963a();
        }
    }
}
