package p000;

import androidx.wear.ambient.AmbientModeSupport;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class iah implements idt {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ Object f30144a;

    /* JADX INFO: renamed from: b */
    private final /* synthetic */ int f30145b;

    public /* synthetic */ iah(AmbientModeSupport.AmbientController ambientController, int i, byte[] bArr) {
        this.f30145b = i;
        this.f30144a = ambientController;
    }

    public /* synthetic */ iah(iak iakVar, int i) {
        this.f30145b = i;
        this.f30144a = iakVar;
    }

    @Override // p000.idt
    /* JADX INFO: renamed from: a */
    public final void mo10984a(Object obj) {
        switch (this.f30145b) {
            case 0:
                Object obj2 = this.f30144a;
                gyx gyxVar = (gyx) obj;
                synchronized (obj2) {
                    gyx gyxVar2 = gyx.MEDIA_STORE;
                    switch (gyxVar) {
                        case MEDIA_STORE:
                            ((iak) obj2).f30153f.mo10033e(gzy.f27036at, false);
                            return;
                        case MARS_STORE:
                            ((iak) obj2).m10991h();
                            return;
                        default:
                            throw new AssertionError("Unexpected Mars selection: " + String.valueOf(gyxVar));
                    }
                }
            default:
                ((AmbientModeSupport.AmbientController) this.f30144a).m1652b((dbh) obj);
                return;
        }
    }
}
