package p000;

import androidx.wear.ambient.AmbientModeSupport;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class cdh implements kba {

    /* JADX INFO: renamed from: a */
    public final jww f5299a;

    /* JADX INFO: renamed from: b */
    private final kba f5300b;

    /* JADX INFO: renamed from: c */
    private boolean f5301c;

    /* JADX WARN: Type inference failed for: r7v2, types: [java.lang.Object, jww] */
    public cdh(dox doxVar, dxh dxhVar, drj drjVar, djm djmVar, byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4) {
        jwf jwfVar = new jwf(cdg.INITIAL);
        this.f5299a = jwfVar;
        cdg cdgVar = cdg.INITIAL;
        if (((Boolean) ((jwf) doxVar.mo6467c()).f34942d).booleanValue() && ((Boolean) ((jwf) dxhVar.mo4156n()).f34942d).booleanValue()) {
            cdgVar = cdg.AE_AF_LOCKED;
        } else if (((Boolean) ((jwf) doxVar.mo6467c()).f34942d).booleanValue()) {
            cdgVar = cdg.AE_LOCKED;
        } else if (((Boolean) ((jwf) dxhVar.mo4156n()).f34942d).booleanValue()) {
            cdgVar = cdg.AF_LOCKED;
        }
        if (!cdgVar.equals(cdg.INITIAL)) {
            cdgVar.name();
            jwfVar.mo3415bf(cdgVar);
        }
        doxVar.mo6483s(new AmbientModeSupport.AmbientController(this));
        dxhVar.mo4144C(new AmbientModeSupport.AmbientController(this));
        this.f5300b = djmVar.f11787a.mo3830a(new kkj(this, drjVar, 1, null, null), not.INSTANCE);
    }

    @Override // p000.kba, java.lang.AutoCloseable
    public final void close() {
        if (this.f5301c) {
            return;
        }
        this.f5301c = true;
        this.f5300b.close();
    }
}
