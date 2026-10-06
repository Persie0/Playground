package p000;

import android.util.ArraySet;
import java.util.Set;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class dni implements kev {

    /* JADX INFO: renamed from: a */
    private static final nbh f12093a = nbh.m17259h("com/google/android/apps/camera/device/CameraDeviceErrorBroadcaster");

    /* JADX INFO: renamed from: c */
    private long f12095c;

    /* JADX INFO: renamed from: b */
    private kcl f12094b = kcl.CAMERA_ERROR_CODE_UNKNOWN;

    /* JADX INFO: renamed from: e */
    private int f12097e = 1;

    /* JADX INFO: renamed from: d */
    private final Set f12096d = new ArraySet();

    @Override // p000.kev
    /* JADX INFO: renamed from: a */
    public final void mo5508a(kcl kclVar, long j) {
        synchronized (this) {
            if (this.f12097e != 3) {
                this.f12097e = 2;
                ((nbe) ((nbe) f12093a.m17252c()).mo17276G(1023)).mo17300y("CameraDeviceError : %s Open duration = %s", kclVar.m13983c(), j);
                this.f12094b = kclVar;
                this.f12095c = j;
                mxk mxkVarM17134F = mxk.m17134F(this.f12096d);
                this.f12096d.clear();
                naz nazVarListIterator = mxkVarM17134F.listIterator();
                while (nazVarListIterator.hasNext()) {
                    ((kev) nazVarListIterator.next()).mo5508a(kclVar, j);
                }
            }
        }
    }

    @Override // p000.kev
    /* JADX INFO: renamed from: b */
    public final void mo5509b() {
        synchronized (this) {
            if (this.f12097e != 2) {
                this.f12097e = 3;
                mxk mxkVarM17134F = mxk.m17134F(this.f12096d);
                this.f12096d.clear();
                naz nazVarListIterator = mxkVarM17134F.listIterator();
                while (nazVarListIterator.hasNext()) {
                    ((kev) nazVarListIterator.next()).mo5509b();
                }
            }
        }
    }

    /* JADX INFO: renamed from: d */
    public final synchronized void m6434d(kev kevVar) {
        if (this.f12097e != 2 && this.f12096d.contains(kevVar)) {
            kevVar.mo5509b();
        }
        this.f12096d.remove(kevVar);
    }

    /* JADX INFO: renamed from: c */
    public final kba m6433c(kev kevVar) {
        kcl kclVar;
        boolean z;
        long j;
        synchronized (this) {
            int i = this.f12097e;
            int i2 = i - 1;
            kclVar = null;
            if (i == 0) {
                throw null;
            }
            z = false;
            j = 0;
            switch (i2) {
                case 1:
                    kclVar = this.f12094b;
                    j = this.f12095c;
                    break;
                case 2:
                    z = true;
                    break;
                default:
                    this.f12096d.add(kevVar);
                    break;
            }
        }
        if (kclVar != null) {
            kevVar.mo5508a(kclVar, j);
            return new gog(14);
        }
        if (!z) {
            return new cic(this, kevVar, 15);
        }
        kevVar.mo5509b();
        return new gog(14);
    }
}
