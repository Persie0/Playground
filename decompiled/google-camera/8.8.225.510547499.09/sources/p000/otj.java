package p000;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
@omh(m18656b = "kotlinx.coroutines.channels.AbstractChannel", m18657c = "AbstractChannel.kt", m18658d = "receiveCatching-JP2dKIU", m18659e = {633})
final class otj extends omf {

    /* JADX INFO: renamed from: a */
    /* synthetic */ Object f46524a;

    /* JADX INFO: renamed from: b */
    final /* synthetic */ otk f46525b;

    /* JADX INFO: renamed from: c */
    int f46526c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public otj(otk otkVar, ols olsVar) {
        super(olsVar);
        this.f46525b = otkVar;
    }

    @Override // p000.omd
    /* JADX INFO: renamed from: b */
    public final Object mo561b(Object obj) {
        this.f46524a = obj;
        this.f46526c |= Integer.MIN_VALUE;
        Object objMo19038c = this.f46525b.mo19038c(this);
        return objMo19038c == oma.COROUTINE_SUSPENDED ? objMo19038c : otu.m19065a(objMo19038c);
    }
}
