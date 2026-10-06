package p000;

import com.google.android.apps.camera.jni.tracking.yRU.CswIK;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class ciu implements nph {

    /* JADX INFO: renamed from: a */
    final /* synthetic */ civ f5899a;

    public ciu(civ civVar) {
        this.f5899a = civVar;
    }

    @Override // p000.nph
    /* JADX INFO: renamed from: a */
    public final void mo3810a(Throwable th) {
        khb khbVar = this.f5899a.f5903d;
        if (khbVar != null) {
            khbVar.m14240f(th);
        }
    }

    @Override // p000.nph
    /* JADX INFO: renamed from: b */
    public final /* bridge */ /* synthetic */ void mo3811b(Object obj) {
        Boolean bool = (Boolean) obj;
        if (this.f5899a.f5902c != null && bool != null && bool.booleanValue()) {
            this.f5899a.f5902c.mo13944f("Initialization completed.");
        }
        if (this.f5899a.f5902c == null || bool == null || bool.booleanValue()) {
            return;
        }
        this.f5899a.f5902c.mo13947i(CswIK.qVuM);
    }
}
