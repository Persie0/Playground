package p000;

import android.content.Context;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class ceq implements cfi {

    /* JADX INFO: renamed from: a */
    private final idb f5465a;

    /* JADX INFO: renamed from: b */
    private final elx f5466b;

    /* JADX INFO: renamed from: c */
    private int f5467c = 1;

    /* JADX INFO: renamed from: d */
    private final jho f5468d;

    public ceq(elx elxVar, Context context, jho jhoVar, byte[] bArr) {
        this.f5466b = elxVar;
        this.f5468d = jhoVar;
        this.f5465a = jpd.m13426g(jhoVar.f34086b, jhoVar.f34085a, null, null, (String) jhoVar.f34087c, context, false, -1, 3);
    }

    @Override // p000.cfi
    /* JADX INFO: renamed from: a */
    public final void mo3571a() {
        this.f5466b.mo7485g(this.f5465a);
        this.f5467c = 3;
        ((bzq) this.f5468d.f34088d).mo3287ae();
    }

    @Override // p000.cfi
    /* JADX INFO: renamed from: b */
    public final void mo3572b() {
        this.f5466b.mo7482d(this.f5465a);
        this.f5467c = 2;
        ((bzq) this.f5468d.f34088d).mo3288af();
    }

    @Override // p000.cfi
    /* JADX INFO: renamed from: c */
    public final int mo3573c() {
        return this.f5467c;
    }
}
