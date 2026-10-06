package p000;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class eoz implements mly {

    /* JADX INFO: renamed from: a */
    final /* synthetic */ bgv f14938a;

    /* JADX INFO: renamed from: b */
    final /* synthetic */ bgv f14939b;

    /* JADX INFO: renamed from: c */
    final /* synthetic */ epc f14940c;

    public eoz(epc epcVar, bgv bgvVar, bgv bgvVar2) {
        this.f14940c = epcVar;
        this.f14938a = bgvVar;
        this.f14939b = bgvVar2;
    }

    /* JADX WARN: Code duplicated, block: B:12:0x0045 A[Catch: all -> 0x0055, TRY_LEAVE, TryCatch #0 {all -> 0x0055, blocks: (B:7:0x0035, B:9:0x0039, B:12:0x0045), top: B:20:0x0035 }] */
    @Override // p000.mlx
    /* JADX INFO: renamed from: a */
    public final void mo5864a(mmb mmbVar) {
        npk.m17604h(mmbVar.f41017h);
        Object obj = mmbVar.f41010a;
        obj.getClass();
        if (((eqz) obj).equals(eqz.ACTION)) {
            this.f14940c.f14952e.m13090Z("lasagna_edu_action");
            this.f14938a.m2444k();
        } else {
            this.f14940c.f14952e.m13090Z("lasagna_edu_landscape");
            this.f14939b.m2444k();
        }
        epc epcVar = this.f14940c;
        try {
            if (epcVar.f14950c) {
                epcVar.f14951d = (eqz) obj;
            } else {
                if (((eqz) obj).equals(epcVar.f14949b)) {
                    epcVar.f14951d = (eqz) obj;
                }
            }
            epcVar.f14950c = true;
            hsv hsvVar = this.f14940c.f29467h;
            if (hsvVar != null) {
                hsvVar.f29462d = 0;
            }
        } catch (Throwable th) {
            epcVar.f14950c = true;
            throw th;
        }
    }

    @Override // p000.mlx
    /* JADX INFO: renamed from: b */
    public final void mo5865b(mmb mmbVar) {
        Object obj = mmbVar.f41010a;
        obj.getClass();
        if (((eqz) obj).equals(eqz.ACTION)) {
            this.f14938a.m2442i();
        } else {
            this.f14939b.m2442i();
        }
        this.f14940c.m7610a();
    }

    @Override // p000.mlx
    /* JADX INFO: renamed from: c */
    public final void mo5866c() {
    }
}
