package p000;

import android.location.Location;
import android.os.Looper;
import android.os.SystemClock;
import android.os.WorkSource;
import com.google.android.apps.camera.app.silentfeedback.SilentFeedbackService;
import com.google.android.gms.location.LocationRequest;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class fbu implements jpj {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ Object f21201a;

    /* JADX INFO: renamed from: b */
    private final /* synthetic */ int f21202b;

    public /* synthetic */ fbu(SilentFeedbackService silentFeedbackService, int i) {
        this.f21202b = i;
        this.f21201a = silentFeedbackService;
    }

    public /* synthetic */ fbu(fbw fbwVar, int i) {
        this.f21202b = i;
        this.f21201a = fbwVar;
    }

    public /* synthetic */ fbu(kuj kujVar, int i) {
        this.f21202b = i;
        this.f21201a = kujVar;
    }

    @Override // p000.jpj
    /* JADX INFO: renamed from: a */
    public final void mo8108a(jpp jppVar) {
        Location location;
        switch (this.f21202b) {
            case 0:
                Object obj = this.f21201a;
                synchronized (obj) {
                    if (((fbw) obj).f21213i) {
                        ((fbw) obj).f21213i = false;
                        return;
                    }
                    try {
                        location = (Location) jppVar.mo13450c();
                        break;
                    } catch (jpo e) {
                        ((nbe) ((nbe) ((nbe) fbw.f21205a.m17252c()).mo17283h(e)).mo17276G(2077)).mo17290o("getCurrentLocation meet exception!");
                        location = null;
                    }
                    if (fbw.m8109d(location) && jzn.m13811N(SystemClock.elapsedRealtimeNanos() - location.getElapsedRealtimeNanos()) < jzn.m13809L(60) && location.getAccuracy() < 50.0f) {
                        location.getAccuracy();
                        return;
                    }
                    LocationRequest locationRequest = new LocationRequest(102, 3600000L, 600000L, 0L, Long.MAX_VALUE, Long.MAX_VALUE, Integer.MAX_VALUE, 0.0f, true, 3600000L, 0, 0, null, false, new WorkSource(), null);
                    long j = fbw.f21206b;
                    int i = 1;
                    jib.m13197b(true, "intervalMillis must be greater than or equal to 0");
                    long j2 = locationRequest.f7755c;
                    long j3 = locationRequest.f7754b;
                    if (j2 == j3 / 6) {
                        locationRequest.f7755c = j / 6;
                    }
                    if (locationRequest.f7761i == j3) {
                        locationRequest.f7761i = j;
                    }
                    locationRequest.f7754b = j;
                    jib.m13198c(true, "priority %d must be a Priority.PRIORITY_* constant", 100);
                    locationRequest.f7753a = 100;
                    long j4 = fbw.f21207c;
                    jib.m13197b(true, "durationMillis must be greater than 0");
                    locationRequest.f7757e = j4;
                    try {
                        jnp jnpVar = ((fbw) obj).f21214j;
                        Looper looperMyLooper = jnpVar.f33824g;
                        if (looperMyLooper == null) {
                            looperMyLooper = Looper.myLooper();
                            jib.m13206k(looperMyLooper, "invalid null looper");
                        }
                        jfx jfxVarM13213r = jib.m13213r(obj, looperMyLooper, jne.class.getSimpleName());
                        jno jnoVar = new jno(jnpVar, jfxVarM13213r);
                        jom jomVar = new jom(jnoVar, locationRequest, i);
                        jgb jgbVarM6219x = djm.m6219x();
                        jgbVarM6219x.f33938a = jomVar;
                        jgbVarM6219x.f33939b = jnoVar;
                        jgbVarM6219x.f33940c = jfxVarM13213r;
                        jgbVarM6219x.f33942e = 2435;
                        jnpVar.m12965k(jgbVarM6219x.m13127a());
                        ((fbw) obj).f21209e = true;
                        ((fbw) obj).f21212h = System.currentTimeMillis();
                        break;
                    } catch (Exception e2) {
                        ((nbe) ((nbe) ((nbe) fbw.f21205a.m17252c()).mo17283h(e2)).mo17276G(2075)).mo17290o("requestLocationUpdates failed!");
                    }
                    return;
                }
            case 1:
                ((SilentFeedbackService) this.f21201a).m4034a();
                return;
            default:
                Object obj2 = this.f21201a;
                if (((jpt) jppVar).f34565c) {
                    ((nnz) obj2).cancel(false);
                    return;
                }
                if (jppVar.mo13452e()) {
                    ((kuj) obj2).mo14894e(jppVar.mo13450c());
                    return;
                }
                Exception excMo13449b = jppVar.mo13449b();
                if (excMo13449b == null) {
                    throw new IllegalStateException();
                }
                ((kuj) obj2).mo8566a(excMo13449b);
                return;
        }
    }
}
