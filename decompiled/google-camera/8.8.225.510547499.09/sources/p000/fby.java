package p000;

import android.location.Location;
import android.location.LocationManager;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class fby implements fbz {

    /* JADX INFO: renamed from: a */
    public final oju f21219a;

    /* JADX INFO: renamed from: b */
    public LocationManager f21220b;

    /* JADX INFO: renamed from: c */
    public final fbx[] f21221c = {new fbx("gps"), new fbx("network")};

    /* JADX INFO: renamed from: d */
    private boolean f21222d;

    public fby(oju ojuVar) {
        this.f21219a = ojuVar;
    }

    @Override // p000.fbz
    /* JADX INFO: renamed from: a */
    public final nps mo8111a() {
        nqf nqfVarM17621g = nqf.m17621g();
        int i = 0;
        while (true) {
            fbx[] fbxVarArr = this.f21221c;
            if (i >= 2) {
                nqfVarM17621g.mo14894e(null);
                return nqfVarM17621g;
            }
            fbx fbxVar = fbxVarArr[i];
            Location location = fbxVar.f21217b ? fbxVar.f21216a : null;
            if (location != null) {
                nqfVarM17621g.mo14894e(location);
                return nqfVarM17621g;
            }
            i++;
        }
    }

    @Override // p000.fbz
    /* JADX INFO: renamed from: c */
    public final void mo8113c(boolean z) {
        if (this.f21222d == z) {
            return;
        }
        this.f21222d = z;
        if (z) {
            jvh.m13554b().execute(new evu(this, 14));
            return;
        }
        if (this.f21220b == null) {
            return;
        }
        int i = 0;
        while (true) {
            fbx[] fbxVarArr = this.f21221c;
            if (i >= 2) {
                return;
            }
            try {
                this.f21220b.removeUpdates(fbxVarArr[i]);
            } catch (Exception e) {
            }
            i++;
        }
    }
}
