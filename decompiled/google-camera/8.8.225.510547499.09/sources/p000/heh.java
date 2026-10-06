package p000;

import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public abstract class heh implements hes, cnb {

    /* JADX INFO: renamed from: b */
    public final AtomicBoolean f27459b = new AtomicBoolean(false);

    /* JADX INFO: renamed from: c */
    public hew f27460c;

    @Override // p000.hes
    /* JADX INFO: renamed from: a */
    public final void mo3950a() {
    }

    @Override // p000.hes
    /* JADX INFO: renamed from: b */
    public final void mo3951b(hew hewVar) {
        this.f27460c = hewVar;
        heu heuVarM10166b = mo7344c().f27457c.m10166b();
        heuVarM10166b.f27497f = new gxw(this, 15);
        heuVarM10166b.m10160a();
    }

    /* JADX INFO: renamed from: c */
    protected abstract heg mo7344c();

    @Override // p000.hes
    /* JADX INFO: renamed from: v */
    public final void mo3969v() {
        this.f27459b.set(false);
    }

    @Override // p000.hes
    /* JADX INFO: renamed from: w */
    public final void mo3970w() {
    }
}
