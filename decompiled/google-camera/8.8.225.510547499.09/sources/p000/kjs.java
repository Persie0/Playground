package p000;

import android.view.Surface;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public abstract class kjs {

    /* JADX INFO: renamed from: b */
    public final kky f36306b;

    /* JADX INFO: renamed from: c */
    protected final nps f36307c;

    public kjs(kky kkyVar, nps npsVar) {
        this.f36306b = kkyVar;
        this.f36307c = npsVar;
    }

    /* JADX INFO: renamed from: a */
    public abstract kpr mo14393a();

    /* JADX INFO: renamed from: c */
    public final Surface m14395c() {
        lku.m15613H(this.f36307c.isDone());
        return (Surface) kxk.m14974T(this.f36307c);
    }
}
