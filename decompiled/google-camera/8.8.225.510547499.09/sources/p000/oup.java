package p000;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class oup implements ous {

    /* JADX INFO: renamed from: a */
    final /* synthetic */ Object f46587a;

    /* JADX INFO: renamed from: b */
    final /* synthetic */ Object f46588b;

    /* JADX INFO: renamed from: c */
    final /* synthetic */ Object f46589c;

    /* JADX INFO: renamed from: d */
    private final /* synthetic */ int f46590d;

    public oup(ooi ooiVar, lwz lwzVar, mdz mdzVar, int i, byte[] bArr) {
        this.f46590d = i;
        this.f46589c = ooiVar;
        this.f46588b = lwzVar;
        this.f46587a = mdzVar;
    }

    public oup(ouq ouqVar, ooi ooiVar, ous ousVar, int i) {
        this.f46590d = i;
        this.f46587a = ouqVar;
        this.f46588b = ooiVar;
        this.f46589c = ousVar;
    }

    /* JADX WARN: Code duplicated, block: B:14:0x002c  */
    /* JADX WARN: Code duplicated, block: B:31:0x007b  */
    /* JADX WARN: Type inference failed for: r13v7, types: [java.lang.Object, ous] */
    @Override // p000.ous
    /* JADX INFO: renamed from: a */
    public final Object mo16103a(Object obj, ols olsVar) throws Throwable {
        ouo ouoVar;
        mdv mdvVar;
        Object obj2;
        switch (this.f46590d) {
            case 0:
                if (olsVar instanceof ouo) {
                    ouoVar = (ouo) olsVar;
                    int i = ouoVar.f46586c;
                    if ((i & Integer.MIN_VALUE) != 0) {
                        ouoVar.f46586c = i - Integer.MIN_VALUE;
                    } else {
                        ouoVar = new ouo(this, olsVar);
                    }
                } else {
                    ouoVar = new ouo(this, olsVar);
                }
                Object obj3 = ouoVar.f46584a;
                oma omaVar = oma.COROUTINE_SUSPENDED;
                switch (ouoVar.f46586c) {
                    case 0:
                        lkm.m15592s(obj3);
                        Object obj4 = ((ooi) this.f46588b).f46351a;
                        if (obj4 != owm.f46723a && ((Boolean) ((ouq) this.f46587a).f46592b.mo560a(obj4, obj)).booleanValue()) {
                            return oki.f46196a;
                        }
                        ((ooi) this.f46588b).f46351a = obj;
                        ?? r13 = this.f46589c;
                        ouoVar.f46586c = 1;
                        if (r13.mo16103a(obj, ouoVar) == omaVar) {
                            return omaVar;
                        }
                        break;
                    case 1:
                        lkm.m15592s(obj3);
                        break;
                    default:
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                return oki.f46196a;
            default:
                if (olsVar instanceof mdv) {
                    mdvVar = (mdv) olsVar;
                    int i2 = mdvVar.f40141b;
                    if ((i2 & Integer.MIN_VALUE) != 0) {
                        mdvVar.f40141b = i2 - Integer.MIN_VALUE;
                    } else {
                        mdvVar = new mdv(this, olsVar, null);
                    }
                } else {
                    mdvVar = new mdv(this, olsVar, null);
                }
                mdv mdvVar2 = mdvVar;
                Object obj5 = mdvVar2.f40140a;
                oma omaVar2 = oma.COROUTINE_SUSPENDED;
                switch (mdvVar2.f40141b) {
                    case 0:
                        lkm.m15592s(obj5);
                        Object obj6 = this.f46589c;
                        ooi ooiVar = (ooi) obj6;
                        kxk kxkVar = (kxk) obj;
                        mea meaVar = (mea) ooiVar.f46351a;
                        if (kxkVar instanceof mef) {
                            Object obj7 = this.f46588b;
                            String str = ((mef) kxkVar).f40169a;
                            mdvVar2.f40142c = ooiVar;
                            mdvVar2.f40141b = 1;
                            Object objM16111f = ((lwz) obj7).m16111f(meaVar, str, mdvVar2);
                            if (objM16111f == omaVar2) {
                                return omaVar2;
                            }
                            obj5 = objM16111f;
                            obj2 = obj6;
                        } else if (kxkVar instanceof med) {
                            Object obj8 = this.f46588b;
                            Object obj9 = this.f46587a;
                            long j = ((med) kxkVar).f40167a;
                            mdvVar2.f40142c = ooiVar;
                            mdvVar2.f40141b = 2;
                            Object objM16112g = ((lwz) obj8).m16112g(meaVar, (mdz) obj9, j, mdvVar2);
                            if (objM16112g == omaVar2) {
                                return omaVar2;
                            }
                            obj5 = objM16112g;
                            obj2 = obj6;
                        } else {
                            if (!(kxkVar instanceof mee)) {
                                if (kxkVar instanceof meb) {
                                    Object obj10 = this.f46588b;
                                    mdvVar2.f40141b = 4;
                                    if (((lwz) obj10).m16109d(meaVar, mdvVar2) == omaVar2) {
                                        return omaVar2;
                                    }
                                    throw new ojx();
                                }
                                if (!(kxkVar instanceof mec)) {
                                    throw new ojz();
                                }
                                Object obj11 = this.f46588b;
                                Object obj12 = this.f46587a;
                                mdvVar2.f40141b = 5;
                                if (((lwz) obj11).m16110e(meaVar, (mdz) obj12, (mec) kxkVar, mdvVar2) == omaVar2) {
                                    return omaVar2;
                                }
                                throw new ojx();
                            }
                            Object obj13 = this.f46588b;
                            String str2 = ((mee) kxkVar).f40168a;
                            mdvVar2.f40142c = ooiVar;
                            mdvVar2.f40141b = 3;
                            Object objM16108c = ((lwz) obj13).m16108c(meaVar, str2, mdvVar2);
                            if (objM16108c == omaVar2) {
                                return omaVar2;
                            }
                            obj5 = objM16108c;
                            obj2 = obj6;
                        }
                        ((ooi) obj2).f46351a = obj5;
                        return oki.f46196a;
                    case 1:
                    case 2:
                        obj2 = mdvVar2.f40142c;
                        lkm.m15592s(obj5);
                        ((ooi) obj2).f46351a = obj5;
                        return oki.f46196a;
                    case 3:
                        obj2 = mdvVar2.f40142c;
                        lkm.m15592s(obj5);
                        ((ooi) obj2).f46351a = obj5;
                        return oki.f46196a;
                    case 4:
                        lkm.m15592s(obj5);
                        throw new ojx();
                    case 5:
                        lkm.m15592s(obj5);
                        throw new ojx();
                    default:
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
        }
    }
}
