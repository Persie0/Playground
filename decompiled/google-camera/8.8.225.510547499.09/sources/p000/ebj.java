package p000;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class ebj implements edi {

    /* JADX INFO: renamed from: a */
    final /* synthetic */ ewq f13223a;

    /* JADX INFO: renamed from: b */
    final /* synthetic */ glk f13224b;

    public ebj(ewq ewqVar, glk glkVar, byte[] bArr, byte[] bArr2) {
        this.f13223a = ewqVar;
        this.f13224b = glkVar;
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [gyh, java.lang.Object] */
    /* JADX INFO: renamed from: d */
    private final void m7056d() {
        ((fua) this.f13224b.f25503d).f23578f.close();
        if (((cwd) this.f13223a.f20678l).m5652K()) {
            ((ftp) ((cwd) this.f13223a.f20678l).m5651J()).mo8735e(this.f13224b.f25502c.mo9902h());
        }
    }

    /* JADX WARN: Type inference failed for: r4v2, types: [java.lang.Object, kbz] */
    /* JADX WARN: Type inference failed for: r4v4, types: [gyh, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v7, types: [java.lang.Object, kbz] */
    /* JADX WARN: Type inference failed for: r4v9, types: [gyh, java.lang.Object] */
    @Override // p000.edi
    /* JADX INFO: renamed from: b */
    public final void mo7057b(eem eemVar, hkc hkcVar, ebp ebpVar) {
        this.f13223a.f20674h.mo13961e("ShotStatus-ShotCompleted");
        if (hkcVar != null) {
            this.f13224b.f25502c.mo9905k().mo10405g(new C1058va((fcy) ebpVar, Long.valueOf(hkcVar.f28120a), Integer.valueOf(hkcVar.f28121b)));
        } else {
            this.f13224b.f25502c.mo9905k().mo10405g(new C1058va((fcy) ebpVar, (Long) null, (Integer) null));
        }
        this.f13223a.f20674h.mo13962f();
    }

    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Object, kbo] */
    @Override // p000.edi
    /* JADX INFO: renamed from: c */
    public final void mo7058c(eem eemVar, edc edcVar) {
        this.f13223a.f20673g.mo13941c("Shot threw an error:", edcVar);
        m7056d();
    }

    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Object, kbo] */
    @Override // p000.edi
    /* JADX INFO: renamed from: p */
    public final void mo7059p(eem eemVar) {
        this.f13223a.f20673g.mo13940b("Shot aborted.");
        m7056d();
    }
}
