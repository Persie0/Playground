package p000;

import android.util.Log;
import com.google.android.apps.camera.util.p015ui.mfv.EArqVBjecl;
import java.io.File;
import java.io.IOException;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class btz implements btx {

    /* JADX INFO: renamed from: a */
    private final File f4465a;

    /* JADX INFO: renamed from: b */
    private bpv f4466b;

    /* JADX INFO: renamed from: d */
    private final dsx f4468d = new dsx((byte[]) null, (byte[]) null, (byte[]) null);

    /* JADX INFO: renamed from: c */
    private final dsx f4467c = new dsx((char[]) null);

    @Deprecated
    public btz(File file) {
        this.f4465a = file;
    }

    /* JADX INFO: renamed from: c */
    private final synchronized bpv m3070c() {
        if (this.f4466b == null) {
            this.f4466b = bpv.m2885f(this.f4465a, 262144000L);
        }
        return this.f4466b;
    }

    @Override // p000.btx
    /* JADX INFO: renamed from: a */
    public final File mo3068a(bqn bqnVar) {
        try {
            bkn bknVarM2898h = m3070c().m2898h(this.f4467c.m6681E(bqnVar));
            if (bknVarM2898h != null) {
                return bknVarM2898h.m2585f();
            }
            return null;
        } catch (IOException e) {
            String str = EArqVBjecl.rNK;
            if (!Log.isLoggable(str, 5)) {
                return null;
            }
            Log.w(str, "Unable to get from disk cache", e);
            return null;
        }
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, java.util.concurrent.locks.Lock] */
    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r1v11, types: [java.lang.Object, java.util.Queue] */
    /* JADX WARN: Type inference failed for: r2v2, types: [bqf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v6, types: [java.lang.Object, java.util.Map] */
    @Override // p000.btx
    /* JADX INFO: renamed from: b */
    public final void mo3069b(bqn bqnVar, C1058va c1058va) {
        msg msgVar;
        dsx dsxVar;
        String strM6681E = this.f4467c.m6681E(bqnVar);
        dsx dsxVar2 = this.f4468d;
        synchronized (dsxVar2) {
            msgVar = (msg) dsxVar2.f12522b.get(strM6681E);
            if (msgVar == null) {
                Object obj = dsxVar2.f12521a;
                synchronized (((bkn) obj).f3651a) {
                    msgVar = (msg) ((bkn) obj).f3651a.poll();
                }
                if (msgVar == null) {
                    msgVar = new msg(null);
                }
                dsxVar2.f12522b.put(strM6681E, msgVar);
            }
            msgVar.f41540a++;
        }
        msgVar.f41541b.lock();
        try {
            try {
                bpv bpvVarM3070c = m3070c();
                if (bpvVarM3070c.m2898h(strM6681E) == null) {
                    bpt bptVarM2896e = bpvVarM3070c.m2896e(strM6681E);
                    if (bptVarM2896e == null) {
                        throw new IllegalStateException("Had two simultaneous puts for: " + strM6681E);
                    }
                    try {
                        if (c1058va.f47802a.mo2915a(c1058va.f47804c, bptVarM2896e.m2879d(), (bqr) c1058va.f47803b)) {
                            bptVarM2896e.m2878c();
                        }
                        bptVarM2896e.m2877b();
                        dsxVar = this.f4468d;
                    } catch (Throwable th) {
                        bptVarM2896e.m2877b();
                        throw th;
                    }
                } else {
                    dsxVar = this.f4468d;
                }
            } catch (IOException e) {
                if (Log.isLoggable("DiskLruCacheWrapper", 5)) {
                    Log.w("DiskLruCacheWrapper", "Unable to put to disk cache", e);
                }
            }
            dsxVar.m6682F(strM6681E);
        } catch (Throwable th2) {
            this.f4468d.m6682F(strM6681E);
            throw th2;
        }
    }
}
