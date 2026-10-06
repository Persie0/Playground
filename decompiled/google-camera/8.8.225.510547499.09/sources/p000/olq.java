package p000;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class olq extends ood implements onm {

    /* JADX INFO: renamed from: a */
    final /* synthetic */ oly[] f46264a;

    /* JADX INFO: renamed from: b */
    final /* synthetic */ ooh f46265b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public olq(oly[] olyVarArr, ooh oohVar) {
        super(2);
        this.f46264a = olyVarArr;
        this.f46265b = oohVar;
    }

    @Override // p000.onm
    /* JADX INFO: renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo560a(Object obj, Object obj2) {
        ((oki) obj).getClass();
        oly[] olyVarArr = this.f46264a;
        ooh oohVar = this.f46265b;
        int i = oohVar.f46350a;
        oohVar.f46350a = i + 1;
        olyVarArr[i] = (olv) obj2;
        return oki.f46196a;
    }
}
