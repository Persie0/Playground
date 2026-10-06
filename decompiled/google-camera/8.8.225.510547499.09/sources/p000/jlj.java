package p000;

import android.util.Log;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class jlj implements nph {

    /* JADX INFO: renamed from: a */
    final /* synthetic */ Object f34303a;

    /* JADX INFO: renamed from: b */
    final /* synthetic */ Object f34304b;

    /* JADX INFO: renamed from: c */
    private final /* synthetic */ int f34305c;

    public jlj(cnh cnhVar, jkx jkxVar, int i) {
        this.f34305c = i;
        this.f34303a = cnhVar;
        this.f34304b = jkxVar;
    }

    public jlj(jlk jlkVar, jkx jkxVar, int i) {
        this.f34305c = i;
        this.f34304b = jlkVar;
        this.f34303a = jkxVar;
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, jkx] */
    /* JADX WARN: Type inference failed for: r0v5, types: [java.lang.Object, jkx] */
    @Override // p000.nph
    /* JADX INFO: renamed from: a */
    public final void mo3810a(Throwable th) {
        switch (this.f34305c) {
            case 0:
                Log.e("ExampleIterator", "Failed to get results", th);
                this.f34303a.mo13325a(8, msm.m16867b(th));
                break;
            default:
                ((nbe) ((nbe) ((nbe) cnh.f6338a.m17251b()).mo17283h(th)).mo17276G((char) 300)).mo17290o("Failed to get results");
                this.f34304b.mo13325a(8, msm.m16867b(th));
                break;
        }
    }

    /* JADX WARN: Type inference failed for: r1v11, types: [java.lang.Object, jkx] */
    /* JADX WARN: Type inference failed for: r1v12, types: [java.lang.Object, jkx] */
    /* JADX WARN: Type inference failed for: r1v6, types: [java.lang.Object, jkx] */
    /* JADX WARN: Type inference failed for: r3v5, types: [java.lang.Object, jkx] */
    @Override // p000.nph
    /* JADX INFO: renamed from: b */
    public final void mo3811b(Object obj) {
        switch (this.f34305c) {
            case 0:
                synchronized (((jlk) this.f34304b).f34306a) {
                    if (((jlk) this.f34304b).f34306a.isEmpty()) {
                        this.f34303a.mo13326b(null, null);
                        return;
                    } else {
                        mrn mrnVar = (mrn) ((jlk) this.f34304b).f34306a.removeFirst();
                        this.f34303a.mo13326b((byte[]) mrnVar.f41480b, ((nup) mrnVar.f41479a).mo17760J());
                        return;
                    }
                }
            default:
                synchronized (((cnh) this.f34303a).f6339b) {
                    if (((cnh) this.f34303a).f6339b.isEmpty()) {
                        this.f34304b.mo13326b(null, null);
                        return;
                    }
                    mrn mrnVar2 = (mrn) ((cnh) this.f34303a).f6339b.removeFirst();
                    this.f34304b.mo13326b((byte[]) mrnVar2.f41480b, ((cnw) mrnVar2.f41479a).mo17760J());
                    return;
                }
        }
    }
}
