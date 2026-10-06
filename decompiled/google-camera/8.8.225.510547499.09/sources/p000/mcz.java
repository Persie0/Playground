package p000;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class mcz implements ous {

    /* JADX INFO: renamed from: a */
    final /* synthetic */ Object f40018a;

    /* JADX INFO: renamed from: b */
    final /* synthetic */ Object f40019b;

    /* JADX INFO: renamed from: c */
    private final /* synthetic */ int f40020c;

    public mcz(onm onmVar, ooi ooiVar, int i) {
        this.f40020c = i;
        this.f40019b = onmVar;
        this.f40018a = ooiVar;
    }

    public mcz(ooi ooiVar, drj drjVar, int i, byte[] bArr, byte[] bArr2) {
        this.f40020c = i;
        this.f40018a = ooiVar;
        this.f40019b = drjVar;
    }

    public mcz(ous ousVar, lwv lwvVar, int i) {
        this.f40020c = i;
        this.f40018a = ousVar;
        this.f40019b = lwvVar;
    }

    public mcz(ous ousVar, onm onmVar, int i) {
        this.f40020c = i;
        this.f40018a = ousVar;
        this.f40019b = onmVar;
    }

    public mcz(ous ousVar, ooi ooiVar, int i) {
        this.f40020c = i;
        this.f40018a = ousVar;
        this.f40019b = ooiVar;
    }

    /* JADX WARN: Code duplicated, block: B:125:0x0209  */
    /* JADX WARN: Code duplicated, block: B:14:0x002f  */
    /* JADX WARN: Code duplicated, block: B:35:0x0086  */
    /* JADX WARN: Code duplicated, block: B:60:0x00d0  */
    /* JADX WARN: Code duplicated, block: B:80:0x0142  */
    /* JADX WARN: Code restructure failed: missing block: B:136:0x0248, code lost:
    
        if (r10.mo16103a(r2, r0) == r5) goto L140;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v45 */
    /* JADX WARN: Type inference failed for: r10v46, types: [ous] */
    /* JADX WARN: Type inference failed for: r10v51 */
    /* JADX WARN: Type inference failed for: r11v13, types: [java.lang.Object, ous] */
    /* JADX WARN: Type inference failed for: r11v16, types: [java.lang.Object, ous] */
    /* JADX WARN: Type inference failed for: r11v20, types: [java.lang.Object, onm] */
    /* JADX WARN: Type inference failed for: r11v28, types: [java.lang.Object, ous] */
    /* JADX WARN: Type inference failed for: r3v4, types: [java.lang.Object, onm] */
    /* JADX WARN: Type inference failed for: r5v7, types: [java.lang.Object, oju] */
    @Override // p000.ous
    /* JADX INFO: renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object mo16103a(Object obj, ols olsVar) throws Throwable {
        mcy mcyVar;
        Object obj2;
        lwu lwuVar;
        ovg ovgVar;
        Throwable th;
        mcz mczVar;
        ovi oviVar;
        mcz mczVar2;
        ovk ovkVar;
        Object obj3;
        ?? r10;
        switch (this.f40020c) {
            case 0:
                if (olsVar instanceof mcy) {
                    mcyVar = (mcy) olsVar;
                    int i = mcyVar.f40015b;
                    if ((i & Integer.MIN_VALUE) != 0) {
                        mcyVar.f40015b = i - Integer.MIN_VALUE;
                    } else {
                        mcyVar = new mcy(this, olsVar);
                    }
                } else {
                    mcyVar = new mcy(this, olsVar);
                }
                Object obj4 = mcyVar.f40014a;
                oma omaVar = oma.COROUTINE_SUSPENDED;
                switch (mcyVar.f40015b) {
                    case 0:
                        lkm.m15592s(obj4);
                        Object obj5 = this.f40018a;
                        ooi ooiVar = (ooi) obj5;
                        kxk kxkVar = (kxk) obj;
                        mcf mcfVar = (mcf) ooiVar.f46351a;
                        if (kxkVar instanceof mef) {
                            Object obj6 = this.f40019b;
                            String str = ((mef) kxkVar).f40169a;
                            mcyVar.f40017d = ooiVar;
                            mcyVar.f40015b = 1;
                            Object objM6636p = ((drj) obj6).m6636p(mcfVar, str, mcyVar);
                            if (objM6636p == omaVar) {
                                return omaVar;
                            }
                            obj4 = objM6636p;
                            obj2 = obj5;
                        } else if (kxkVar instanceof med) {
                            Object obj7 = this.f40019b;
                            long j = ((med) kxkVar).f40167a;
                            mcyVar.f40017d = ooiVar;
                            mcyVar.f40015b = 2;
                            Object objM6637q = ((drj) obj7).m6637q(mcfVar, j, mcyVar);
                            if (objM6637q == omaVar) {
                                return omaVar;
                            }
                            obj4 = objM6637q;
                            obj2 = obj5;
                        } else {
                            if (!(kxkVar instanceof meb)) {
                                if (kxkVar instanceof mee) {
                                    Object obj8 = this.f40019b;
                                    mcyVar.f40015b = 4;
                                    if (((drj) obj8).m6634n(mcfVar, mcyVar) == omaVar) {
                                        return omaVar;
                                    }
                                    throw new ojx();
                                }
                                if (!(kxkVar instanceof mec)) {
                                    throw new ojz();
                                }
                                Object obj9 = this.f40019b;
                                mcyVar.f40015b = 5;
                                if (((drj) obj9).m6635o(mcfVar, (mec) kxkVar, mcyVar) == omaVar) {
                                    return omaVar;
                                }
                                throw new ojx();
                            }
                            Object obj10 = this.f40019b;
                            String str2 = ((meb) kxkVar).f40164a;
                            mcyVar.f40017d = ooiVar;
                            mcyVar.f40015b = 3;
                            Object objM6633m = ((drj) obj10).m6633m(mcfVar, str2, mcyVar);
                            if (objM6633m == omaVar) {
                                return omaVar;
                            }
                            obj4 = objM6633m;
                            obj2 = obj5;
                        }
                        ((ooi) obj2).f46351a = obj4;
                        return oki.f46196a;
                    case 1:
                    case 2:
                        obj2 = mcyVar.f40017d;
                        lkm.m15592s(obj4);
                        ((ooi) obj2).f46351a = obj4;
                        return oki.f46196a;
                    case 3:
                        obj2 = mcyVar.f40017d;
                        lkm.m15592s(obj4);
                        ((ooi) obj2).f46351a = obj4;
                        return oki.f46196a;
                    case 4:
                        lkm.m15592s(obj4);
                        throw new ojx();
                    case 5:
                        lkm.m15592s(obj4);
                        throw new ojx();
                    default:
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            case 1:
                if (olsVar instanceof lwu) {
                    lwuVar = (lwu) olsVar;
                    int i2 = lwuVar.f39465b;
                    if ((i2 & Integer.MIN_VALUE) != 0) {
                        lwuVar.f39465b = i2 - Integer.MIN_VALUE;
                    } else {
                        lwuVar = new lwu(this, olsVar, null);
                    }
                } else {
                    lwuVar = new lwu(this, olsVar, null);
                }
                Object obj11 = lwuVar.f39464a;
                oma omaVar2 = oma.COROUTINE_SUSPENDED;
                switch (lwuVar.f39465b) {
                    case 0:
                        lkm.m15592s(obj11);
                        ?? r11 = this.f40018a;
                        List<lzb> list = (List) obj;
                        ArrayList arrayList = new ArrayList(omn.m18678R(list));
                        for (lzb lzbVar : list) {
                            ((lqi) ((lwv) this.f40019b).f39468b.f39584a.get()).getClass();
                            lzbVar.getClass();
                            arrayList.add(new lxb(lzbVar));
                        }
                        lwuVar.f39465b = 1;
                        if (r11.mo16103a(arrayList, lwuVar) == omaVar2) {
                            return omaVar2;
                        }
                        break;
                    case 1:
                        lkm.m15592s(obj11);
                        break;
                    default:
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                return oki.f46196a;
            case 2:
                if (olsVar instanceof ovg) {
                    ovgVar = (ovg) olsVar;
                    int i3 = ovgVar.f46645b;
                    if ((i3 & Integer.MIN_VALUE) != 0) {
                        ovgVar.f46645b = i3 - Integer.MIN_VALUE;
                    } else {
                        ovgVar = new ovg(this, olsVar, null);
                    }
                } else {
                    ovgVar = new ovg(this, olsVar, null);
                }
                Object obj12 = ovgVar.f46644a;
                oma omaVar3 = oma.COROUTINE_SUSPENDED;
                switch (ovgVar.f46645b) {
                    case 0:
                        lkm.m15592s(obj12);
                        try {
                            ?? r12 = this.f40018a;
                            ovgVar.f46647d = this;
                            ovgVar.f46645b = 1;
                            if (r12.mo16103a(obj, ovgVar) == omaVar3) {
                                return omaVar3;
                            }
                            return oki.f46196a;
                        } catch (Throwable th2) {
                            th = th2;
                            mczVar = this;
                            ((ooi) mczVar.f40019b).f46351a = th;
                            throw th;
                        }
                    case 1:
                        mczVar = ovgVar.f46647d;
                        try {
                            lkm.m15592s(obj12);
                            return oki.f46196a;
                        } catch (Throwable th3) {
                            th = th3;
                            ((ooi) mczVar.f40019b).f46351a = th;
                            throw th;
                        }
                    default:
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            case 3:
                if (olsVar instanceof ovi) {
                    oviVar = (ovi) olsVar;
                    int i4 = oviVar.f46650b;
                    if ((i4 & Integer.MIN_VALUE) != 0) {
                        oviVar.f46650b = i4 - Integer.MIN_VALUE;
                    } else {
                        oviVar = new ovi(this, olsVar, null);
                    }
                } else {
                    oviVar = new ovi(this, olsVar, null);
                }
                Object objMo560a = oviVar.f46649a;
                oma omaVar4 = oma.COROUTINE_SUSPENDED;
                switch (oviVar.f46650b) {
                    case 0:
                        lkm.m15592s(objMo560a);
                        ?? r13 = this.f40019b;
                        oviVar.f46653e = this;
                        oviVar.f46651c = obj;
                        oviVar.f46650b = 1;
                        objMo560a = r13.mo560a(obj, oviVar);
                        if (objMo560a == omaVar4) {
                            return omaVar4;
                        }
                        mczVar2 = this;
                        break;
                        break;
                    case 1:
                        obj = oviVar.f46651c;
                        mczVar2 = oviVar.f46653e;
                        lkm.m15592s(objMo560a);
                        break;
                    default:
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                if (!((Boolean) objMo560a).booleanValue()) {
                    return oki.f46196a;
                }
                ((ooi) mczVar2.f40018a).f46351a = obj;
                throw new owa(mczVar2);
            default:
                if (olsVar instanceof ovk) {
                    ovkVar = (ovk) olsVar;
                    int i5 = ovkVar.f46660b;
                    if ((i5 & Integer.MIN_VALUE) != 0) {
                        ovkVar.f46660b = i5 - Integer.MIN_VALUE;
                    } else {
                        ovkVar = new ovk(this, olsVar, null);
                    }
                } else {
                    ovkVar = new ovk(this, olsVar, null);
                }
                Object obj13 = ovkVar.f46659a;
                oma omaVar5 = oma.COROUTINE_SUSPENDED;
                switch (ovkVar.f46660b) {
                    case 0:
                        lkm.m15592s(obj13);
                        ?? r14 = this.f40018a;
                        ?? r3 = this.f40019b;
                        ovkVar.f46661c = obj;
                        ovkVar.f46662d = r14;
                        ovkVar.f46660b = 1;
                        if (r3.mo560a(obj, ovkVar) != omaVar5) {
                            obj3 = obj;
                            r10 = r14;
                            ovkVar.f46661c = null;
                            ovkVar.f46662d = null;
                            ovkVar.f46660b = 2;
                            break;
                        }
                        return omaVar5;
                    case 1:
                        ous ousVar = ovkVar.f46662d;
                        obj3 = ovkVar.f46661c;
                        lkm.m15592s(obj13);
                        r10 = ousVar;
                        ovkVar.f46661c = null;
                        ovkVar.f46662d = null;
                        ovkVar.f46660b = 2;
                        break;
                    case 2:
                        lkm.m15592s(obj13);
                        return oki.f46196a;
                    default:
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                break;
        }
    }
}
