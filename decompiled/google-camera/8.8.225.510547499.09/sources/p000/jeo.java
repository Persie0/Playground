package p000;

import android.os.DeadObjectException;
import android.os.RemoteException;
import com.google.android.gms.common.api.Status;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
abstract class jeo extends jen {

    /* JADX INFO: renamed from: a */
    protected final khb f33835a;

    public jeo(int i, khb khbVar, byte[] bArr, byte[] bArr2) {
        super(i);
        this.f33835a = khbVar;
    }

    /* JADX INFO: renamed from: c */
    protected abstract void mo12973c(jfj jfjVar);

    @Override // p000.jet
    /* JADX INFO: renamed from: d */
    public final void mo12974d(Status status) {
        this.f33835a.m14244j(new jdv(status));
    }

    @Override // p000.jet
    /* JADX INFO: renamed from: e */
    public final void mo12975e(Exception exc) {
        this.f33835a.m14244j(exc);
    }

    @Override // p000.jet
    /* JADX INFO: renamed from: f */
    public final void mo12976f(jfj jfjVar) throws DeadObjectException {
        try {
            mo12973c(jfjVar);
        } catch (DeadObjectException e) {
            mo12974d(jet.m12978h(e));
            throw e;
        } catch (RemoteException e2) {
            mo12974d(jet.m12978h(e2));
        } catch (RuntimeException e3) {
            mo12975e(e3);
        }
    }

    @Override // p000.jet
    /* JADX INFO: renamed from: g */
    public void mo12977g(ihk ihkVar, boolean z) {
    }
}
