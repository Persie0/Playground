package p000;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public class hei implements hes {

    /* JADX INFO: renamed from: a */
    public hev f27461a;

    /* JADX INFO: renamed from: b */
    private hew f27462b;

    /* JADX INFO: renamed from: c */
    private boolean f27463c;

    @Override // p000.hes
    /* JADX INFO: renamed from: a */
    public void mo3950a() {
        this.f27461a = null;
        hew hewVar = this.f27462b;
        if (hewVar != null) {
            hewVar.mo10130a();
            this.f27462b = null;
        }
    }

    @Override // p000.hes
    /* JADX INFO: renamed from: b */
    public void mo3951b(hew hewVar) {
        this.f27462b = hewVar;
        hev hevVar = this.f27461a;
        if (hevVar != null) {
            hewVar.mo10131b(hevVar);
        }
    }

    /* JADX INFO: renamed from: c */
    public final void m10152c() {
        this.f27461a = null;
        hew hewVar = this.f27462b;
        if (hewVar != null) {
            hewVar.mo10130a();
        }
    }

    /* JADX INFO: renamed from: d */
    public final void m10153d(hev hevVar) {
        heu heuVarM10166b = hevVar.m10166b();
        Runnable runnable = hevVar.f27509e;
        if (runnable != null) {
            heuVarM10166b.f27494c = new hea(this, runnable, 2);
        }
        Runnable runnable2 = hevVar.f27512h;
        if (runnable2 != null) {
            heuVarM10166b.f27497f = new hea(this, runnable2, 3);
        }
        Runnable runnable3 = hevVar.f27510f;
        if (runnable3 != null) {
            heuVarM10166b.f27495d = new hea(this, runnable3, 4);
        }
        Runnable runnable4 = hevVar.f27515k;
        if (!hevVar.f27516l) {
            heuVarM10166b.f27500i = new hea(this, runnable4, 5);
        }
        hev hevVarM10160a = heuVarM10166b.m10160a();
        hew hewVar = this.f27462b;
        if (hewVar != null && !this.f27463c) {
            if (this.f27461a != null) {
                hewVar.mo10132c(hevVarM10160a);
            } else {
                hewVar.mo10131b(hevVarM10160a);
            }
        }
        this.f27461a = hevVarM10160a;
    }

    @Override // p000.hes
    /* JADX INFO: renamed from: v */
    public void mo3969v() {
        this.f27463c = true;
    }

    @Override // p000.hes
    /* JADX INFO: renamed from: w */
    public final void mo3970w() {
        this.f27463c = false;
        hev hevVar = this.f27461a;
        if (hevVar != null) {
            hew hewVar = this.f27462b;
            hewVar.getClass();
            hewVar.mo10131b(hevVar);
        }
    }
}
