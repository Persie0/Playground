package p000;

import androidx.wear.ambient.AmbientModeSupport;
import com.google.android.apps.camera.p014ui.popupmenu.PopupMenuView;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class iag implements idp {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ Object f30142a;

    /* JADX INFO: renamed from: b */
    private final /* synthetic */ int f30143b;

    public /* synthetic */ iag(AmbientModeSupport.AmbientController ambientController, int i, byte[] bArr) {
        this.f30143b = i;
        this.f30142a = ambientController;
    }

    public /* synthetic */ iag(iak iakVar, int i) {
        this.f30143b = i;
        this.f30142a = iakVar;
    }

    @Override // p000.idp
    /* JADX INFO: renamed from: a */
    public final void mo10983a(idw idwVar) {
        switch (this.f30143b) {
            case 0:
                Object obj = this.f30142a;
                synchronized (obj) {
                    PopupMenuView popupMenuView = ((iak) obj).f30159l;
                    popupMenuView.getClass();
                    popupMenuView.m4406b();
                    gyx gyxVar = gyx.MEDIA_STORE;
                    switch ((gyx) idwVar.f30530a) {
                        case MEDIA_STORE:
                            ((iak) obj).f30153f.mo10033e(gzy.f27036at, false);
                            return;
                        case MARS_STORE:
                            ((iak) obj).m10991h();
                            return;
                        default:
                            throw new AssertionError("Unexpected Mars selection: " + String.valueOf(idwVar.f30530a));
                    }
                }
            default:
                ((AmbientModeSupport.AmbientController) this.f30142a).m1652b((dbh) idwVar.f30530a);
                return;
        }
    }
}
