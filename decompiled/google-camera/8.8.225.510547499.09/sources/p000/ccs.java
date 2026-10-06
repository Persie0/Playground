package p000;

import android.hardware.camera2.CaptureResult;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class ccs extends kfv {

    /* JADX INFO: renamed from: b */
    kpp f5195b;

    /* JADX INFO: renamed from: c */
    private final jwn f5196c;

    /* JADX INFO: renamed from: d */
    private final jwn f5197d;

    /* JADX INFO: renamed from: f */
    private final cbv f5199f;

    /* JADX INFO: renamed from: a */
    public volatile ikw f5194a = ikw.UNINITIALIZED;

    /* JADX INFO: renamed from: e */
    private final Set f5198e = new HashSet();

    public ccs(cbv cbvVar, jww jwwVar, jww jwwVar2, dhv dhvVar) {
        this.f5196c = jwwVar;
        this.f5197d = jwwVar2;
        dhw dhwVar = dhu.f11199a;
        dhvVar.mo6175c();
        this.f5199f = cbvVar;
        this.f5195b = null;
    }

    /* JADX INFO: renamed from: b */
    public final synchronized void m3465b(Runnable runnable) {
        this.f5198e.add(runnable);
    }

    @Override // p000.kfv
    /* JADX INFO: renamed from: bu */
    public final void mo3408bu(kpp kppVar) {
        Integer num;
        HashSet hashSet;
        synchronized (this) {
            this.f5195b = kppVar;
        }
        if (ivr.f32310b == null || (num = (Integer) kppVar.mo9517d(ivr.f32310b)) == null || num.intValue() != 1 || this.f5199f.m3410a() || ((Boolean) this.f5196c.mo3831be()).booleanValue() || ((Boolean) this.f5197d.mo3831be()).booleanValue()) {
            return;
        }
        synchronized (this) {
            hashSet = new HashSet(this.f5198e);
        }
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            ((Runnable) it.next()).run();
        }
    }

    /* JADX INFO: renamed from: c */
    public final synchronized void m3466c(Runnable runnable) {
        this.f5198e.remove(runnable);
    }

    /* JADX INFO: renamed from: d */
    public final synchronized boolean m3467d(imu imuVar) {
        String str = (String) this.f5195b.mo9517d(CaptureResult.LOGICAL_MULTI_CAMERA_ACTIVE_PHYSICAL_ID);
        if (str == null) {
            return true;
        }
        kmd kmdVarM11486a = imuVar.m11486a(str);
        if (kmdVarM11486a == null) {
            return true;
        }
        return kmdVarM11486a.mo14537F();
    }
}
