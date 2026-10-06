package p000;

import android.content.Context;
import android.location.Location;
import android.net.Uri;
import android.os.SystemClock;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class fbw implements fbz, jne {

    /* JADX INFO: renamed from: a */
    public static final nbh f21205a = nbh.m17259h("com/google/android/apps/camera/location/FusedLocationController");

    /* JADX INFO: renamed from: b */
    public static final int f21206b = jzn.m13809L(20);

    /* JADX INFO: renamed from: c */
    public static final int f21207c = jzn.m13809L(60);

    /* JADX INFO: renamed from: d */
    public static final Uri f21208d = Uri.parse("content://com.google.settings/partner");

    /* JADX INFO: renamed from: e */
    public boolean f21209e = false;

    /* JADX INFO: renamed from: f */
    public Location f21210f;

    /* JADX INFO: renamed from: g */
    public long f21211g;

    /* JADX INFO: renamed from: h */
    public long f21212h;

    /* JADX INFO: renamed from: i */
    public boolean f21213i;

    /* JADX INFO: renamed from: j */
    public final jnp f21214j;

    /* JADX INFO: renamed from: k */
    private final Executor f21215k;

    public fbw(Context context, Executor executor) {
        this.f21214j = new jnp(context);
        this.f21215k = executor;
    }

    /* JADX INFO: renamed from: d */
    public static final boolean m8109d(Location location) {
        if (location == null) {
            ((nbe) ((nbe) f21205a.m17252c()).mo17276G((char) 2086)).mo17290o("Fused location API did not provide a location.");
            return false;
        }
        if (Double.isInfinite(location.getLatitude()) || Double.isNaN(location.getLatitude()) || Double.isInfinite(location.getLongitude()) || Double.isNaN(location.getLongitude()) || (location.getLatitude() == 0.0d && location.getLongitude() == 0.0d)) {
            ((nbe) ((nbe) f21205a.m17252c()).mo17276G((char) 2084)).mo17293r("Fused location API provided a location that is probably incorrect: %s", location);
            return false;
        }
        long jM13811N = jzn.m13811N(SystemClock.elapsedRealtimeNanos() - location.getElapsedRealtimeNanos());
        if (jM13811N <= jzn.m13809L(1800)) {
            return true;
        }
        ((nbe) ((nbe) f21205a.m17252c()).mo17276G((char) 2085)).mo17293r("Fused location API provided a location from %g seconds ago. Ignoring location.", Float.valueOf(jzn.m13806I(jM13811N)));
        return false;
    }

    /* JADX INFO: renamed from: e */
    private final void m8110e() {
        synchronized (this) {
            this.f21213i = true;
            if (this.f21209e) {
                try {
                    jnp jnpVar = this.f21214j;
                    String simpleName = jne.class.getSimpleName();
                    jib.m13206k(simpleName, "Listener type must not be null");
                    jib.m13204i(simpleName, "Listener type must not be empty");
                    jnpVar.m12961f(new jfv(this, simpleName), 2418).mo13448a(ExecutorC0932qj.f47487c, jnm.f34402a);
                } catch (Exception e) {
                    ((nbe) ((nbe) ((nbe) f21205a.m17252c()).mo17283h(e)).mo17276G(2083)).mo17290o("Failed to remove location listeners. ");
                }
                this.f21209e = false;
            } else {
                this.f21209e = false;
            }
            throw th;
        }
    }

    @Override // p000.fbz
    /* JADX INFO: renamed from: a */
    public final nps mo8111a() {
        Location location;
        final nqf nqfVarM17621g = nqf.m17621g();
        if (this.f21210f == null || System.currentTimeMillis() - this.f21211g >= 1000) {
            location = null;
            this.f21210f = null;
        } else {
            System.currentTimeMillis();
            location = this.f21210f;
        }
        if (location != null) {
            nqfVarM17621g.mo14894e(location);
            return nqfVarM17621g;
        }
        this.f21214j.m13392a().mo13455h(this.f21215k, new jpj() { // from class: fbv
            @Override // p000.jpj
            /* JADX INFO: renamed from: a */
            public final void mo8108a(jpp jppVar) {
                fbw fbwVar = this.f21203a;
                nqf nqfVar = nqfVarM17621g;
                try {
                    Location location2 = (Location) jppVar.mo13450c();
                    if (!fbw.m8109d(location2)) {
                        nqfVar.mo14894e(null);
                        return;
                    }
                    fbwVar.f21210f = location2;
                    fbwVar.f21211g = System.currentTimeMillis();
                    nqfVar.mo14894e(location2);
                } catch (jpo e) {
                    ((nbe) ((nbe) ((nbe) fbw.f21205a.m17252c()).mo17283h(e)).mo17276G((char) 2073)).mo17290o("getCurrentLocation meet exception!");
                    nqfVar.mo14894e(null);
                }
            }
        });
        return nqfVarM17621g;
    }

    @Override // p000.jne
    /* JADX INFO: renamed from: b */
    public final void mo8112b(Location location) {
        if (m8109d(location)) {
            long jCurrentTimeMillis = System.currentTimeMillis() - this.f21212h;
            long jCurrentTimeMillis2 = System.currentTimeMillis() - this.f21212h;
            long j = f21207c;
            if (location.getAccuracy() < ((int) (((jCurrentTimeMillis / jzn.m13809L(10)) + 1.0f) * 50.0f)) || jCurrentTimeMillis2 > j) {
                m8110e();
                location.getAccuracy();
            }
        }
    }

    @Override // p000.fbz
    /* JADX INFO: renamed from: c */
    public final void mo8113c(boolean z) {
        if (!z) {
            m8110e();
            return;
        }
        synchronized (this) {
            if (this.f21209e) {
                return;
            }
            this.f21213i = false;
            this.f21214j.m13392a().mo13455h(this.f21215k, new fbu(this, 0));
        }
    }
}
