package p000;

import com.google.android.libraries.social.licenses.GWO.HEePJw;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class oys extends opv {

    /* JADX INFO: renamed from: a */
    private final int f46856a;

    /* JADX INFO: renamed from: b */
    private final oxc f46857b;

    public oys(oxc oxcVar, int i) {
        this.f46857b = oxcVar;
        this.f46856a = i;
    }

    @Override // p000.oni
    /* JADX INFO: renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo1803a(Object obj) {
        mo18869b((Throwable) obj);
        return oki.f46196a;
    }

    @Override // p000.opw
    /* JADX INFO: renamed from: b */
    public final void mo18869b(Throwable th) {
        oxc oxcVar = this.f46857b;
        int i = this.f46856a;
        oxcVar.f46762d.m15486i(i).m18855c(oyu.f46869e);
        if (oxcVar.f46761c.m18846b() != oyu.f46870f || oxcVar.m19124d()) {
            return;
        }
        oxcVar.m19123c();
    }

    public final String toString() {
        return "CancelSemaphoreAcquisitionHandler[" + this.f46857b + HEePJw.CNtTLkC + this.f46856a + "]";
    }
}
