package p000;

import android.os.DeadObjectException;
import android.util.Log;
import com.google.android.gms.common.api.Status;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class jep extends jet {

    /* JADX INFO: renamed from: a */
    protected final jey f33836a;

    public jep(int i, jey jeyVar) {
        super(i);
        this.f33836a = jeyVar;
    }

    @Override // p000.jet
    /* JADX INFO: renamed from: d */
    public final void mo12974d(Status status) {
        try {
            this.f33836a.m13008f(status);
        } catch (IllegalStateException e) {
            Log.w("ApiCallRunner", "Exception reporting failure", e);
        }
    }

    @Override // p000.jet
    /* JADX INFO: renamed from: e */
    public final void mo12975e(Exception exc) {
        try {
            this.f33836a.m13008f(new Status(10, exc.getClass().getSimpleName() + ": " + exc.getLocalizedMessage()));
        } catch (IllegalStateException e) {
            Log.w("ApiCallRunner", "Exception reporting failure", e);
        }
    }

    @Override // p000.jet
    /* JADX INFO: renamed from: f */
    public final void mo12976f(jfj jfjVar) throws DeadObjectException {
        try {
            this.f33836a.m13007e(jfjVar.f33870b);
        } catch (RuntimeException e) {
            mo12975e(e);
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.Map] */
    @Override // p000.jet
    /* JADX INFO: renamed from: g */
    public final void mo12977g(ihk ihkVar, boolean z) {
        jey jeyVar = this.f33836a;
        ihkVar.f30967b.put(jeyVar, Boolean.valueOf(z));
        jeyVar.mo4651k(new jff(ihkVar, jeyVar, null, null, null));
    }
}
