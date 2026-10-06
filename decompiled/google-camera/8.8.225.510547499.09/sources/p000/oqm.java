package p000;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class oqm extends ood implements onm {

    /* JADX INFO: renamed from: a */
    final /* synthetic */ ooi f46424a;

    /* JADX INFO: renamed from: b */
    final /* synthetic */ boolean f46425b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public oqm(ooi ooiVar, boolean z) {
        super(2);
        this.f46424a = ooiVar;
        this.f46425b = z;
    }

    @Override // p000.onm
    /* JADX INFO: renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo560a(Object obj, Object obj2) {
        oly olyVar = (oly) obj;
        olv olvVar = (olv) obj2;
        olyVar.getClass();
        if (!(olvVar instanceof oqk)) {
            return olyVar.plus(olvVar);
        }
        if (((oly) this.f46424a.f46351a).get(olvVar.getKey()) == null) {
            return olyVar.plus(this.f46425b ? ((oqk) olvVar).m18908a() : (oqk) olvVar);
        }
        ooi ooiVar = this.f46424a;
        ooiVar.f46351a = ((oly) ooiVar.f46351a).minusKey(olvVar.getKey());
        return olyVar.plus(((oqk) olvVar).m18909b());
    }
}
