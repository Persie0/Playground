package p000;

import android.os.DeadObjectException;
import android.os.RemoteException;
import com.google.android.gms.common.api.Status;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class jer extends jen {

    /* JADX INFO: renamed from: a */
    private final jgh f33838a;

    /* JADX INFO: renamed from: b */
    private final khb f33839b;

    public jer(int i, jgh jghVar, khb khbVar, byte[] bArr, byte[] bArr2) {
        super(i);
        this.f33839b = khbVar;
        this.f33838a = jghVar;
        if (i == 2 && jghVar.f33961b) {
            throw new IllegalArgumentException("Best-effort write calls cannot pass methods that should auto-resolve missing features.");
        }
    }

    @Override // p000.jen
    /* JADX INFO: renamed from: a */
    public final boolean mo12971a(jfj jfjVar) {
        return this.f33838a.f33961b;
    }

    @Override // p000.jen
    /* JADX INFO: renamed from: b */
    public final jcw[] mo12972b(jfj jfjVar) {
        return this.f33838a.f33960a;
    }

    @Override // p000.jet
    /* JADX INFO: renamed from: d */
    public final void mo12974d(Status status) {
        this.f33839b.m14244j(jib.m13212q(status));
    }

    @Override // p000.jet
    /* JADX INFO: renamed from: e */
    public final void mo12975e(Exception exc) {
        this.f33839b.m14244j(exc);
    }

    @Override // p000.jet
    /* JADX INFO: renamed from: f */
    public final void mo12976f(jfj jfjVar) throws DeadObjectException {
        try {
            jgh jghVar = this.f33838a;
            jghVar.f33963d.f33956a.mo13128a(jfjVar.f33870b, this.f33839b);
        } catch (DeadObjectException e) {
            throw e;
        } catch (RemoteException e2) {
            mo12974d(jet.m12978h(e2));
        } catch (RuntimeException e3) {
            mo12975e(e3);
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.Map] */
    @Override // p000.jet
    /* JADX INFO: renamed from: g */
    public final void mo12977g(ihk ihkVar, boolean z) {
        khb khbVar = this.f33839b;
        ihkVar.f30966a.put(khbVar, Boolean.valueOf(z));
        ((jpp) khbVar.f36008a).mo13454g(new jfg(ihkVar, khbVar, null, null, null, null));
    }
}
