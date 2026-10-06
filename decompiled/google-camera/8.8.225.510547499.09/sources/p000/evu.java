package p000;

import android.location.LocationManager;
import android.widget.TextView;
import com.google.android.apps.camera.bottombar.C0100R;
import com.google.android.apps.camera.legacy.lightcycle.p012ui.PhotoSphereMessageOverlay;
import com.google.android.libraries.social.licenses.GWO.HEePJw;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class evu implements Runnable {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ Object f20481a;

    /* JADX INFO: renamed from: b */
    private final /* synthetic */ int f20482b;

    public evu(TextView textView, int i) {
        this.f20482b = i;
        this.f20481a = textView;
    }

    public evu(PhotoSphereMessageOverlay photoSphereMessageOverlay, int i) {
        this.f20482b = i;
        this.f20481a = photoSphereMessageOverlay;
    }

    public /* synthetic */ evu(evv evvVar, int i) {
        this.f20482b = i;
        this.f20481a = evvVar;
    }

    public /* synthetic */ evu(evz evzVar, int i) {
        this.f20482b = i;
        this.f20481a = evzVar;
    }

    public /* synthetic */ evu(ewa ewaVar, int i) {
        this.f20482b = i;
        this.f20481a = ewaVar;
    }

    public /* synthetic */ evu(ezi eziVar, int i) {
        this.f20482b = i;
        this.f20481a = eziVar;
    }

    public /* synthetic */ evu(fby fbyVar, int i) {
        this.f20482b = i;
        this.f20481a = fbyVar;
    }

    public /* synthetic */ evu(fcn fcnVar, int i) {
        this.f20482b = i;
        this.f20481a = fcnVar;
    }

    public /* synthetic */ evu(fdc fdcVar, int i) {
        this.f20482b = i;
        this.f20481a = fdcVar;
    }

    public /* synthetic */ evu(fde fdeVar, int i) {
        this.f20482b = i;
        this.f20481a = fdeVar;
    }

    public /* synthetic */ evu(hew hewVar, int i) {
        this.f20482b = i;
        this.f20481a = hewVar;
    }

    public /* synthetic */ evu(jww jwwVar, int i) {
        this.f20482b = i;
        this.f20481a = jwwVar;
    }

    /* JADX WARN: Type inference failed for: r0v23, types: [java.lang.Object, jww] */
    /* JADX WARN: Type inference failed for: r0v24, types: [java.lang.Object, jww] */
    /* JADX WARN: Type inference failed for: r0v52, types: [hew, java.lang.Object] */
    @Override // java.lang.Runnable
    public final void run() {
        hew hewVar;
        switch (this.f20482b) {
            case 0:
                Object obj = this.f20481a;
                ((ewa) obj).f20550h.m8839d();
                ((chw) obj).mo3777k();
                break;
            case 1:
                ewa ewaVar = (ewa) this.f20481a;
                ewaVar.f20545c.mo13961e(HEePJw.ohYOLKjdZpV);
                ewaVar.f20502E.m10882e();
                ewaVar.f20545c.mo13962f();
                break;
            case 2:
                ewa ewaVar2 = ((evv) this.f20481a).f20483a;
                if (ewaVar2.f5764a) {
                    if (ewaVar2.f20518U != null) {
                        ewaVar2.f20546d.m5900i();
                    }
                    if (ewaVar2.f20561s.mo6184l(dib.f11357ck)) {
                        ewaVar2.f20502E.m10883f();
                        if (((gzp) ewaVar2.f20567y.mo3831be()).equals(gzp.OFF)) {
                            ewaVar2.f20549g.execute(new euj(ewaVar2, 18));
                        }
                    }
                    ewaVar2.f20560r.mo11768s();
                    ewaVar2.mo3777k();
                    ewaVar2.f20560r.mo11721B(false);
                    break;
                }
                break;
            case 3:
                evz evzVar = (evz) this.f20481a;
                evzVar.f20493a.f20547e.mo3693g().mo3721k();
                evzVar.f20493a.f20552j.mo10316b(C0100R.raw.camera_shutter);
                break;
            case 4:
                ((TextView) ((PhotoSphereMessageOverlay) this.f20481a).findViewById(C0100R.id.short_info_message)).setVisibility(4);
                break;
            case 5:
                ((TextView) this.f20481a).setVisibility(4);
                break;
            case 6:
                PhotoSphereMessageOverlay photoSphereMessageOverlay = (PhotoSphereMessageOverlay) this.f20481a;
                if (photoSphereMessageOverlay.f6810a) {
                    photoSphereMessageOverlay.f6810a = false;
                    photoSphereMessageOverlay.findViewById(C0100R.id.rotate_device_icon).setVisibility(4);
                }
                break;
            case 7:
                this.f20481a.mo3415bf(false);
                break;
            case 8:
                this.f20481a.mo3415bf(true);
                break;
            case 9:
                ezi eziVar = (ezi) this.f20481a;
                eziVar.f21059o = true;
                eziVar.m8063d();
                break;
            case 10:
                ezi eziVar2 = (ezi) this.f20481a;
                eziVar2.f21060p = true;
                eziVar2.m8064e();
                break;
            case 11:
                ((ezi) this.f20481a).f21049e.close();
                break;
            case 12:
                ezi eziVar3 = (ezi) this.f20481a;
                eziVar3.f21059o = false;
                eziVar3.m8064e();
                break;
            case 13:
                ezi eziVar4 = (ezi) this.f20481a;
                eziVar4.f21060p = false;
                eziVar4.m8063d();
                break;
            case 14:
                Object obj2 = this.f20481a;
                jvd.m13538a();
                fby fbyVar = (fby) obj2;
                if (fbyVar.f21220b == null) {
                    fbyVar.f21220b = ((emr) fbyVar.f21219a).get();
                }
                LocationManager locationManager = fbyVar.f21220b;
                if (locationManager != null) {
                    try {
                        locationManager.requestLocationUpdates("network", 1000L, 0.0f, ((fby) obj2).f21221c[1]);
                        break;
                    } catch (IllegalArgumentException e) {
                        e.getMessage();
                    } catch (SecurityException e2) {
                    }
                    try {
                        ((fby) obj2).f21220b.requestLocationUpdates("gps", 1000L, 0.0f, ((fby) obj2).f21221c[0]);
                    } catch (IllegalArgumentException e3) {
                        e3.getMessage();
                        return;
                    } catch (SecurityException e4) {
                        return;
                    }
                }
                break;
            case 15:
                fcn fcnVar = (fcn) this.f20481a;
                fcnVar.m8124c(false);
                fcnVar.m8122a();
                break;
            case 16:
                ((fdc) this.f20481a).f21399f.mo3953f(ikw.LONG_EXPOSURE);
                break;
            case 17:
                fdc fdcVar = (fdc) this.f20481a;
                fdcVar.f21402i = true;
                fdcVar.f21397d.mo8564b(ikw.LONG_EXPOSURE);
                break;
            case 18:
                fdc fdcVar2 = (fdc) this.f20481a;
                if (fdcVar2.f21394a.compareAndSet(true, false) && (hewVar = fdcVar2.f21395b) != null) {
                    hewVar.mo10130a();
                    break;
                }
                break;
            case 19:
                this.f20481a.mo10130a();
                break;
            default:
                ((fde) this.f20481a).f21416a.mo8564b(ikw.LONG_EXPOSURE);
                break;
        }
    }
}
