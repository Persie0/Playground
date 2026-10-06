package p000;

import java.util.concurrent.Executor;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class fjl implements kba {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ Object f22265a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Object f22266b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ Object f22267c;

    /* JADX INFO: renamed from: d */
    private final /* synthetic */ int f22268d;

    public /* synthetic */ fjl(drm drmVar, Executor executor, kbz kbzVar, int i) {
        this.f22268d = i;
        this.f22265a = drmVar;
        this.f22267c = executor;
        this.f22266b = kbzVar;
    }

    public /* synthetic */ fjl(igt igtVar, igq igqVar, igx igxVar, int i) {
        this.f22268d = i;
        this.f22266b = igtVar;
        this.f22265a = igqVar;
        this.f22267c = igxVar;
    }

    public /* synthetic */ fjl(kbz kbzVar, oju ojuVar, oju ojuVar2, int i) {
        this.f22268d = i;
        this.f22265a = kbzVar;
        this.f22266b = ojuVar;
        this.f22267c = ojuVar2;
    }

    public /* synthetic */ fjl(kdp kdpVar, String str, kba kbaVar, int i) {
        this.f22268d = i;
        this.f22266b = kdpVar;
        this.f22267c = str;
        this.f22265a = kbaVar;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, kbz] */
    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, oju] */
    /* JADX WARN: Type inference failed for: r1v5, types: [java.lang.Object, java.util.concurrent.Executor] */
    /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.Object, oju] */
    /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.Object, kbz] */
    /* JADX WARN: Type inference failed for: r2v2, types: [igx, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v3, types: [java.lang.Object, kba] */
    @Override // p000.kba, java.lang.AutoCloseable
    public final void close() {
        switch (this.f22268d) {
            case 0:
                ?? r0 = this.f22265a;
                ?? r1 = this.f22266b;
                ?? r2 = this.f22267c;
                r0.mo13961e("MICRO_EncoderModule#shutdown_controller");
                ((fie) r1.get()).m8458a(false);
                ((gtd) r2.get()).m9745j();
                r0.mo13962f();
                return;
            case 1:
                this.f22267c.execute(this.f22266b.mo13959c("FaceMetadataExtractor.close", new dgt((drm) this.f22265a, 20)));
                return;
            case 2:
                Object obj = this.f22266b;
                Object obj2 = this.f22265a;
                ?? r3 = this.f22267c;
                synchronized (((igt) obj).f30877l) {
                    ((igt) obj).f30876k = true;
                    break;
                }
                ((igq) obj2).close();
                r3.close();
                return;
            default:
                Object obj3 = this.f22266b;
                Object obj4 = this.f22267c;
                ?? r4 = this.f22265a;
                ((kdp) obj3).f35662c.mo13940b("Closed by ".concat((String) obj4));
                r4.close();
                return;
        }
    }
}
