package p000;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
@omh(m18656b = "androidx.window.java.layout.WindowInfoTrackerCallbackAdapter$addListener$1$1", m18657c = "WindowInfoTrackerCallbackAdapter.kt", m18658d = "invokeSuspend", m18659e = {78})
public final class awl extends oml implements onm {

    /* JADX INFO: renamed from: a */
    int f2592a;

    /* JADX INFO: renamed from: b */
    final /* synthetic */ our f2593b;

    /* JADX INFO: renamed from: c */
    final /* synthetic */ aea f2594c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public awl(our ourVar, aea aeaVar, ols olsVar) {
        super(2, olsVar);
        this.f2593b = ourVar;
        this.f2594c = aeaVar;
    }

    @Override // p000.onm
    /* JADX INFO: renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo560a(Object obj, Object obj2) {
        return ((awl) mo562c((oqs) obj, (ols) obj2)).mo561b(oki.f46196a);
    }

    @Override // p000.omd
    /* JADX INFO: renamed from: b */
    public final Object mo561b(Object obj) {
        oma omaVar = oma.COROUTINE_SUSPENDED;
        switch (this.f2592a) {
            case 0:
                lkm.m15592s(obj);
                our ourVar = this.f2593b;
                ouy ouyVar = new ouy(this.f2594c, 1);
                this.f2592a = 1;
                if (owg.m19113d((owg) ourVar, ouyVar, this) == omaVar) {
                    return omaVar;
                }
                break;
            default:
                lkm.m15592s(obj);
                break;
        }
        return oki.f46196a;
    }

    @Override // p000.omd
    /* JADX INFO: renamed from: c */
    public final ols mo562c(Object obj, ols olsVar) {
        return new awl(this.f2593b, this.f2594c, olsVar);
    }
}
