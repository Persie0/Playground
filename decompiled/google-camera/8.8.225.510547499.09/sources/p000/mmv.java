package p000;

import android.os.Bundle;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class mmv extends mna {
    public mmv(mmx mmxVar, khb khbVar, byte[] bArr, byte[] bArr2) {
        new mav("OnCompleteUpdateCallback");
        super(mmxVar, khbVar, null, null);
    }

    @Override // p000.mna
    /* JADX INFO: renamed from: b */
    public final void mo16641b(Bundle bundle) {
        super.mo16641b(bundle);
        if (mmx.m16643a(bundle) != 0) {
            this.f41092c.m14244j(new mnd(mmx.m16643a(bundle)));
        } else {
            this.f41092c.m14245k(null);
        }
    }
}
