package p000;

import com.google.android.apps.camera.bottombar.C0100R;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class dap implements Runnable {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ dar f10287a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ boolean f10288b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ boolean f10289c;

    /* JADX INFO: renamed from: d */
    private final /* synthetic */ int f10290d;

    public /* synthetic */ dap(dar darVar, boolean z, boolean z2, int i) {
        this.f10290d = i;
        this.f10287a = darVar;
        this.f10288b = z;
        this.f10289c = z2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f10290d) {
            case 0:
                dar darVar = this.f10287a;
                boolean z = this.f10288b;
                boolean z2 = this.f10289c;
                darVar.m5836o();
                jvd.m13538a();
                if (z) {
                    darVar.f10302j.mo11109s(darVar.f10297e.getString(C0100R.string.external_wired_mic_disconnected));
                } else if (z2) {
                    darVar.f10302j.mo11109s(darVar.f10297e.getString(C0100R.string.external_bluetooth_mic_disconnected));
                }
                darVar.f10295c.mo7482d(darVar.f10302j);
                break;
            default:
                dar darVar2 = this.f10287a;
                boolean z3 = this.f10288b;
                boolean z4 = this.f10289c;
                if (!z4 || z3 || darVar2.f10304l.m13090Z("pref_ext_mic_bluetooth_chip_display_count") <= 3) {
                    darVar2.m5836o();
                    jvd.m13538a();
                    if (z3 && z4) {
                        darVar2.f10301i.mo11109s(darVar2.f10297e.getString(C0100R.string.external_mic_connected));
                    } else if (z3) {
                        darVar2.f10301i.mo11109s(darVar2.f10297e.getString(C0100R.string.external_wired_mic_connected));
                    } else if (z4) {
                        darVar2.f10301i.mo11109s(darVar2.f10297e.getString(C0100R.string.external_bluetooth_mic_connected));
                    }
                    darVar2.f10295c.mo7482d(darVar2.f10301i);
                }
                break;
        }
    }
}
