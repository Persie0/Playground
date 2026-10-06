package p000;

import androidx.wear.ambient.AmbientMode;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class jes extends jeo {

    /* JADX INFO: renamed from: b */
    public final jfv f33840b;

    public jes(jfv jfvVar, khb khbVar, byte[] bArr, byte[] bArr2) {
        super(4, khbVar, null, null);
        this.f33840b = jfvVar;
    }

    @Override // p000.jen
    /* JADX INFO: renamed from: a */
    public final boolean mo12971a(jfj jfjVar) {
        return ((djm) jfjVar.f33873e.get(this.f33840b)) != null;
    }

    @Override // p000.jen
    /* JADX INFO: renamed from: b */
    public final jcw[] mo12972b(jfj jfjVar) {
        djm djmVar = (djm) jfjVar.f33873e.get(this.f33840b);
        if (djmVar == null) {
            return null;
        }
        return (jcw[]) ((kyl) djmVar.f11789c).f37730b;
    }

    @Override // p000.jeo
    /* JADX INFO: renamed from: c */
    public final void mo12973c(jfj jfjVar) {
        djm djmVar = (djm) jfjVar.f33873e.remove(this.f33840b);
        if (djmVar == null) {
            this.f33835a.m14245k(false);
            return;
        }
        Object obj = djmVar.f11787a;
        ((jgb) ((AmbientMode.AmbientController) obj).f1697a).f33939b.mo13128a(jfjVar.f33870b, this.f33835a);
        ((jfx) ((kyl) djmVar.f11789c).f37731c).m13122a();
    }

    @Override // p000.jeo, p000.jet
    /* JADX INFO: renamed from: g */
    public final /* bridge */ /* synthetic */ void mo12977g(ihk ihkVar, boolean z) {
    }
}
