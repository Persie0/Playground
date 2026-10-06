package p000;

import androidx.wear.ambient.AmbientMode;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class jgt implements jgr {

    /* JADX INFO: renamed from: a */
    final /* synthetic */ jgw f33980a;

    public jgt(jgw jgwVar) {
        this.f33980a = jgwVar;
    }

    @Override // p000.jgr
    /* JADX INFO: renamed from: a */
    public final void mo13037a(jcu jcuVar) {
        if (jcuVar.m12895b()) {
            jgw jgwVar = this.f33980a;
            jgwVar.m13165q(null, ((jhh) jgwVar).f34057s);
        } else {
            AmbientMode.AmbientController ambientController = this.f33980a.f34000q;
            if (ambientController != null) {
                ambientController.m1647t(jcuVar);
            }
        }
    }
}
