package p000;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class cdc implements kao {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ Object f5261a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Object f5262b;

    /* JADX INFO: renamed from: c */
    private final /* synthetic */ int f5263c;

    public /* synthetic */ cdc(cdd cddVar, cdh cdhVar, int i) {
        this.f5263c = i;
        this.f5261a = cddVar;
        this.f5262b = cdhVar;
    }

    public /* synthetic */ cdc(cdh cdhVar, cdj cdjVar, int i) {
        this.f5263c = i;
        this.f5261a = cdhVar;
        this.f5262b = cdjVar;
    }

    public /* synthetic */ cdc(cke ckeVar, Runnable runnable, int i) {
        this.f5263c = i;
        this.f5261a = ckeVar;
        this.f5262b = runnable;
    }

    public /* synthetic */ cdc(dep depVar, deb debVar, int i) {
        this.f5263c = i;
        this.f5262b = depVar;
        this.f5261a = debVar;
    }

    public /* synthetic */ cdc(euf eufVar, jvb jvbVar, int i) {
        this.f5263c = i;
        this.f5261a = eufVar;
        this.f5262b = jvbVar;
    }

    public /* synthetic */ cdc(euf eufVar, oju ojuVar, int i) {
        this.f5263c = i;
        this.f5261a = eufVar;
        this.f5262b = ojuVar;
    }

    public /* synthetic */ cdc(grr grrVar, grt grtVar, int i) {
        this.f5263c = i;
        this.f5261a = grrVar;
        this.f5262b = grtVar;
    }

    public /* synthetic */ cdc(hes hesVar, het hetVar, int i) {
        this.f5263c = i;
        this.f5261a = hesVar;
        this.f5262b = hetVar;
    }

    public /* synthetic */ cdc(hmp hmpVar, hmo hmoVar, int i) {
        this.f5263c = i;
        this.f5262b = hmpVar;
        this.f5261a = hmoVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v28, types: [hes, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v10, types: [java.lang.Object, java.lang.Runnable] */
    /* JADX WARN: Type inference failed for: r1v16, types: [java.lang.Object, oju] */
    /* JADX WARN: Type inference failed for: r1v24, types: [hmo, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v5, types: [cdj, java.lang.Object] */
    @Override // p000.kao
    /* JADX INFO: renamed from: a */
    public final void mo3483a(Object obj) {
        switch (this.f5263c) {
            case 0:
                Object obj2 = this.f5261a;
                cdg cdgVar = (cdg) ((jwf) ((cdh) this.f5262b).f5299a).f34942d;
                if (!cdgVar.equals(cdg.AE_AF_LOCKED)) {
                    if (!cdgVar.equals(cdg.AE_LOCKED)) {
                        ((cdd) obj2).f5267d.mo3443h();
                    } else {
                        ((cdd) obj2).f5267d.mo3444i();
                    }
                    break;
                }
                break;
            case 1:
                Object obj3 = this.f5261a;
                ?? r1 = this.f5262b;
                cdg cdgVar2 = (cdg) ((jwf) ((cdh) obj3).f5299a).f34942d;
                if (!cdgVar2.equals(cdg.AE_AF_LOCKED)) {
                    if (!cdgVar2.equals(cdg.AE_LOCKED)) {
                        r1.mo3443h();
                    } else {
                        r1.mo3444i();
                    }
                    break;
                }
                break;
            case 2:
                Object obj4 = this.f5261a;
                if (!((cdg) ((jwf) ((cdh) this.f5262b).f5299a).f34942d).equals(cdg.AE_AF_LOCKED)) {
                    cdd cddVar = (cdd) obj4;
                    if (!((Boolean) cddVar.f5266c.mo3831be()).booleanValue()) {
                        cddVar.m3486d(mqu.f41450a);
                        ilv ilvVar = cddVar.f5269f;
                        if (ilvVar == null) {
                            cddVar.m3487e();
                        } else {
                            ilvVar.mo11449a().mo2282d(new baa(cddVar, 16), not.INSTANCE);
                        }
                    } else {
                        cddVar.m3485c(mqu.f41450a);
                    }
                    break;
                }
                break;
            case 3:
                Object obj5 = this.f5261a;
                ((cke) obj5).f5970a.execute(this.f5262b);
                break;
            case 4:
                Object obj6 = this.f5262b;
                Object obj7 = this.f5261a;
                Boolean bool = (Boolean) obj;
                if (bool != null && bool.booleanValue()) {
                    ((dep) obj6).m6014j((deb) obj7);
                    break;
                }
                break;
            case 5:
                Object obj8 = this.f5261a;
                cet cetVar = (cet) obj;
                if (!((jvb) this.f5262b).mo8995b()) {
                    cetVar.getClass();
                    cetVar.mo3578d(((euf) obj8).f19981ap.mo14556i());
                }
                break;
            case 6:
                Object obj9 = this.f5261a;
                ?? r2 = this.f5262b;
                cet cetVar2 = (cet) obj;
                euf eufVar = (euf) obj9;
                if (!eufVar.f19930Q.mo8995b()) {
                    cetVar2.getClass();
                    cetVar2.mo3584j((cfk) r2.get());
                    eufVar.f19930Q.m13537d(new eds(cetVar2, 9));
                    break;
                }
                break;
            case 7:
                Object obj10 = this.f5261a;
                gru gruVar = new gru(((grr) obj10).f26187e, (grt) this.f5262b, 3);
                ((grc) ((grv) obj10).f26185c).f26118k.mo8956a(gruVar, (gyu) obj);
                break;
            case 8:
                ?? r0 = this.f5261a;
                Object obj11 = this.f5262b;
                hdk hdkVar = (hdk) obj;
                lku.m15662p(hdkVar);
                jvd jvdVar = hdkVar.f27326b;
                het hetVar = (het) obj11;
                if (hetVar.f27490h.mo16813g()) {
                    jvdVar = (jvd) hetVar.f27490h.mo16809c();
                }
                hdkVar.f27338n.mo2282d(new gxn(hdkVar, (hes) r0, hetVar, 8), jvdVar);
                break;
            default:
                Object obj12 = this.f5262b;
                ?? r3 = this.f5261a;
                hmq hmqVar = (hmq) obj;
                hmqVar.getClass();
                ((hmp) obj12).f28347b = hmqVar;
                r3.mo10462a(hmqVar);
                break;
        }
    }
}
