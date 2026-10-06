package p000;

import androidx.wear.ambient.AmbientDelegate;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class kie implements kba {

    /* JADX INFO: renamed from: a */
    public final knv f36136a;

    /* JADX INFO: renamed from: b */
    public Runnable f36137b;

    /* JADX INFO: renamed from: c */
    private final jvb f36138c;

    /* JADX INFO: renamed from: d */
    private final kiv f36139d;

    /* JADX INFO: renamed from: e */
    private final oju f36140e;

    /* JADX INFO: renamed from: f */
    private kic f36141f;

    /* JADX INFO: renamed from: g */
    private boolean f36142g;

    /* JADX INFO: renamed from: h */
    private final ihk f36143h;

    public kie(kiv kivVar, jvb jvbVar, ihk ihkVar, oju ojuVar, byte[] bArr, byte[] bArr2) {
        this.f36139d = kivVar;
        this.f36138c = jvbVar;
        this.f36143h = ihkVar;
        this.f36140e = ojuVar;
        knv knvVar = new knv(1L);
        jvbVar.m13537d(knvVar);
        this.f36136a = knvVar;
    }

    /* JADX INFO: renamed from: a */
    public final kic m14322a() throws InterruptedException, kec {
        nps npsVarM14606c = this.f36136a.m14606c(1L);
        try {
            return m14323b((knt) npsVarM14606c.get());
        } catch (InterruptedException e) {
            npsVarM14606c.cancel(true);
            try {
                ((knt) kxk.m14973S(npsVarM14606c)).close();
            } catch (CancellationException e2) {
            } catch (ExecutionException e3) {
                try {
                    Throwable.class.getDeclaredMethod("addSuppressed", Throwable.class).invoke(e, e3);
                } catch (Exception e4) {
                }
            }
            throw e;
        } catch (ExecutionException e5) {
            throw new kec(e5);
        }
    }

    /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Object, oju] */
    /* JADX WARN: Type inference failed for: r1v2, types: [java.lang.Object, oju] */
    /* JADX INFO: renamed from: b */
    public final kic m14323b(knt kntVar) {
        kic kicVar;
        kic kicVar2;
        synchronized (this) {
            if (this.f36138c.mo8995b() || this.f36142g) {
                kntVar.close();
                throw new kec("FrameServer is closed.");
            }
            kicVar = this.f36141f;
        }
        if (kicVar != null) {
            kicVar.close();
        }
        synchronized (this) {
            ihk ihkVar = this.f36143h;
            Runnable runnable = this.f36137b;
            kiv kivVar = this.f36139d;
            AmbientDelegate ambientDelegateM14329a = ((kii) this.f36140e).get();
            Object obj = ihkVar.f30967b.get();
            Object obj2 = ihkVar.f30966a.get();
            kntVar.getClass();
            kivVar.getClass();
            kicVar2 = new kic((ljf) obj, (ktz) obj2, kntVar, runnable, kivVar, ambientDelegateM14329a, null, null, null);
            this.f36141f = kicVar2;
        }
        return kicVar2;
    }

    @Override // p000.kba, java.lang.AutoCloseable
    public final void close() {
        synchronized (this) {
            if (this.f36142g) {
                return;
            }
            this.f36142g = true;
            kic kicVar = this.f36141f;
            this.f36141f = null;
            if (kicVar != null) {
                kicVar.close();
            }
        }
    }
}
