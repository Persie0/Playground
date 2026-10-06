package p000;

import android.content.Intent;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class dbw implements dcj {

    /* JADX INFO: renamed from: a */
    private dcj f10456a;

    /* JADX INFO: renamed from: b */
    private final kmq f10457b;

    public dbw(Intent intent) {
        this.f10457b = cds.m3511j(intent) ? kmq.f36557a : kmq.BACK;
    }

    /* JADX INFO: renamed from: a */
    public final synchronized void m5912a(dcj dcjVar) {
        this.f10456a = dcjVar;
    }

    @Override // p000.dcj
    /* JADX INFO: renamed from: d */
    public final synchronized kmq mo5895d() {
        dcj dcjVar;
        dcjVar = this.f10456a;
        return dcjVar != null ? dcjVar.mo5895d() : this.f10457b;
    }
}
