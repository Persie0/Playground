package p000;

/* JADX INFO: loaded from: classes2.dex */
public final class k3d extends enc {

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ int f46671b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ Object f46672c;

    public /* synthetic */ k3d(Object obj, int i) {
        this.f46671b = i;
        this.f46672c = obj;
    }

    @Override // p000.enc
    /* JADX INFO: renamed from: a */
    public final void mo3295a() {
        switch (this.f46671b) {
            case 0:
                synchronized (((ajd) this.f46672c).f740f) {
                    try {
                        if (((ajd) this.f46672c).f745k.get() > 0 && ((ajd) this.f46672c).f745k.decrementAndGet() > 0) {
                            ((ajd) this.f46672c).f736b.m12786b("Leaving the connection open for other ongoing calls.", new Object[0]);
                            return;
                        }
                        ajd ajdVar = (ajd) this.f46672c;
                        if (ajdVar.f747m != null) {
                            ajdVar.f736b.m12786b("Unbind from service.", new Object[0]);
                            ajd ajdVar2 = (ajd) this.f46672c;
                            ajdVar2.f735a.unbindService(ajdVar2.f746l);
                            ajd ajdVar3 = (ajd) this.f46672c;
                            ajdVar3.f741g = false;
                            ajdVar3.f747m = null;
                            ajdVar3.f746l = null;
                        }
                        ((ajd) this.f46672c).m508c();
                        return;
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            default:
                ajd ajdVar4 = (ajd) ((yub) this.f46672c).f70524b;
                ajdVar4.f736b.m12786b("unlinkToDeath", new Object[0]);
                ajdVar4.f747m.asBinder().unlinkToDeath(ajdVar4.f744j, 0);
                ajdVar4.f747m = null;
                ajdVar4.f741g = false;
                return;
        }
    }
}
