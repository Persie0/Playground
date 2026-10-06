package p000;

import java.util.Iterator;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
final class mnk extends mnh {

    /* JADX INFO: renamed from: a */
    final /* synthetic */ mnh f41111a;

    /* JADX INFO: renamed from: b */
    final /* synthetic */ mnq f41112b;

    /* JADX INFO: renamed from: c */
    final /* synthetic */ khb f41113c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mnk(mnq mnqVar, khb khbVar, khb khbVar2, mnh mnhVar, byte[] bArr, byte[] bArr2) {
        super(khbVar, null, null);
        this.f41112b = mnqVar;
        this.f41113c = khbVar2;
        this.f41111a = mnhVar;
    }

    @Override // p000.mnh
    /* JADX INFO: renamed from: a */
    public final void mo16640a() {
        synchronized (this.f41112b.f41124d) {
            final mnq mnqVar = this.f41112b;
            final khb khbVar = this.f41113c;
            mnqVar.f41123c.add(khbVar);
            final byte[] bArr = null;
            ((jpp) khbVar.f36008a).mo13454g(new jpj(khbVar, bArr, bArr) { // from class: mni

                /* JADX INFO: renamed from: b */
                public final /* synthetic */ khb f41109b;

                @Override // p000.jpj
                /* JADX INFO: renamed from: a */
                public final void mo8108a(jpp jppVar) {
                    mnq mnqVar2 = this.f41108a;
                    khb khbVar2 = this.f41109b;
                    synchronized (mnqVar2.f41124d) {
                        mnqVar2.f41123c.remove(khbVar2);
                    }
                }
            });
            this.f41112b.f41129i.getAndIncrement();
            mnq mnqVar2 = this.f41112b;
            mnh mnhVar = this.f41111a;
            if (mnqVar2.f41131k == null && !mnqVar2.f41125e) {
                mnqVar2.f41122b.add(mnhVar);
                mnqVar2.f41130j = new mnp(mnqVar2, 0);
                mnqVar2.f41125e = true;
                if (!mnqVar2.f41121a.bindService(mnqVar2.f41126f, mnqVar2.f41130j, 1)) {
                    mnqVar2.f41125e = false;
                    Iterator it = mnqVar2.f41122b.iterator();
                    while (it.hasNext()) {
                        ((mnh) it.next()).m16657b(new mnr());
                    }
                    mnqVar2.f41122b.clear();
                }
            } else if (mnqVar2.f41125e) {
                mnqVar2.f41122b.add(mnhVar);
            } else {
                mnhVar.run();
            }
        }
    }
}
