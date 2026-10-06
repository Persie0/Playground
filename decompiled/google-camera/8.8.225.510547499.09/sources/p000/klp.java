package p000;

import android.hardware.camera2.CaptureResult;
import java.util.List;
import java.util.Map;
import p021j$.util.concurrent.ConcurrentHashMap;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public class klp implements kpl {

    /* JADX INFO: renamed from: a */
    private final CaptureResult f36484a;

    /* JADX INFO: renamed from: b */
    private final Map f36485b = new ConcurrentHashMap();

    public klp(CaptureResult captureResult) {
        this.f36484a = captureResult;
    }

    @Override // p000.kpl
    /* JADX INFO: renamed from: a */
    public final int mo9514a() {
        return this.f36484a.getSequenceId();
    }

    @Override // p000.kpl
    /* JADX INFO: renamed from: b */
    public final long mo9515b() {
        return this.f36484a.getFrameNumber();
    }

    @Override // p000.kpl
    /* JADX INFO: renamed from: c */
    public final kpk mo9516c() {
        return new klm(this.f36484a.getRequest());
    }

    @Override // p000.kpl
    /* JADX INFO: renamed from: d */
    public final Object mo9517d(CaptureResult.Key key) {
        klo kloVar = (klo) this.f36485b.get(key);
        if (kloVar == null) {
            synchronized (this.f36485b) {
                kloVar = (klo) this.f36485b.get(key);
                if (kloVar == null) {
                    kloVar = new klo(this.f36484a, key);
                    this.f36485b.put(key, kloVar);
                }
            }
        }
        Object obj = kloVar.f36483d;
        if (obj == klo.f36480a) {
            synchronized (kloVar) {
                obj = kloVar.f36483d;
                if (obj == klo.f36480a) {
                    obj = kloVar.f36481b.get(kloVar.f36482c);
                    kloVar.f36483d = obj;
                }
            }
        }
        return obj;
    }

    @Override // p000.kpl
    /* JADX INFO: renamed from: e */
    public final String mo9518e() {
        try {
            return (String) CaptureResult.class.getDeclaredMethod("getCameraId", new Class[0]).invoke(this.f36484a, new Object[0]);
        } catch (ReflectiveOperationException e) {
            return null;
        }
    }

    @Override // p000.kpl
    /* JADX INFO: renamed from: f */
    public final List mo9519f() {
        return this.f36484a.getKeys();
    }
}
