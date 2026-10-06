package p000;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class jxf implements jyt {

    /* JADX INFO: renamed from: a */
    final /* synthetic */ Object f34986a;

    /* JADX INFO: renamed from: b */
    private final /* synthetic */ int f34987b;

    public jxf(hpg hpgVar, int i) {
        this.f34987b = i;
        this.f34986a = hpgVar;
    }

    public jxf(jxj jxjVar, int i) {
        this.f34987b = i;
        this.f34986a = jxjVar;
    }

    @Override // p000.jyt
    /* JADX INFO: renamed from: f */
    public final void mo5350f() {
        switch (this.f34987b) {
            case 0:
                break;
            default:
                ctp ctpVarM5633j = ((hpg) this.f34986a).f28807an.m5633j(krd.MPEG4);
                jxj jxjVar = ((hpg) this.f34986a).f28799af;
                jxjVar.getClass();
                jxjVar.f35020a.mo13754m(ctpVarM5633j.mo5502f());
                Object obj = this.f34986a;
                hqq hqqVarM10635a = hqr.m10635a();
                hqqVarM10635a.m10628i(ctpVarM5633j);
                hqqVarM10635a.m10633n(mqu.f41450a);
                hqqVarM10635a.m10624e(((hpg) this.f34986a).f28831x);
                hqqVarM10635a.m10632m("");
                ((hpg) obj).f28792Y = hqqVarM10635a;
                break;
        }
    }

    @Override // p000.jyt
    /* JADX INFO: renamed from: i */
    public final void mo5353i(long j, long j2) {
        int i = this.f34987b;
    }

    @Override // p000.jzg
    /* JADX INFO: renamed from: a */
    public final void mo5259a(jzf jzfVar) {
        switch (this.f34987b) {
            case 0:
                ((jxj) this.f34986a).m13651b();
                break;
            default:
                ((nbe) ((nbe) hpg.f28767a.m17251b()).mo17276G((char) 3827)).mo17293r("onEncoderError(): %s", jzfVar);
                ((hpg) this.f34986a).f28800ag.m10582a();
                break;
        }
    }

    @Override // p000.jyt
    /* JADX INFO: renamed from: e */
    public final void mo5349e() {
        switch (this.f34987b) {
            case 0:
                ((jxj) this.f34986a).m13651b();
                break;
            default:
                ((hpg) this.f34986a).f28800ag.m10582a();
                break;
        }
    }

    @Override // p000.jyt
    /* JADX INFO: renamed from: g */
    public final void mo5351g() {
        switch (this.f34987b) {
            case 0:
                ((jxj) this.f34986a).m13651b();
                break;
            default:
                ((hpg) this.f34986a).f28800ag.m10582a();
                break;
        }
    }

    @Override // p000.jyt
    /* JADX INFO: renamed from: h */
    public final void mo5352h() {
        switch (this.f34987b) {
            case 0:
                return;
            default:
                synchronized (((hpg) this.f34986a).f28820m) {
                    ((hpg) this.f34986a).m10576c();
                    Object obj = this.f34986a;
                    ((hpg) obj).f28792Y.m10630k(((hpg) obj).f28772E);
                    Object obj2 = this.f34986a;
                    ((hpg) obj2).f28769B.add(((hpg) obj2).f28792Y);
                    if (!((hpg) this.f34986a).f28811d.mo6184l(diy.f11747d)) {
                        Object obj3 = this.f34986a;
                        hoj hojVar = ((hpg) obj3).f28817j;
                        hqq hqqVar = (hqq) mkv.m16515W(((hpg) obj3).f28769B);
                        synchronized (hojVar.f28613w) {
                            hqq hqqVar2 = hojVar.f28581E;
                            hqqVar2.getClass();
                            hqqVar2.m10627h(hojVar.m10538d());
                            hojVar.f28581E.m10629j(hojVar.m10537c());
                            hojVar.f28581E.m10622c(hojVar.m10535a());
                            hojVar.f28581E.m10623d(hojVar.m10536b());
                            hojVar.f28599i.set(0L);
                            hojVar.f28600j.set(0L);
                            hojVar.f28601k.set(0L);
                            hojVar.f28581E = hqqVar;
                        }
                    } else {
                        Object obj4 = this.f34986a;
                        hpa hpaVar = ((hpg) obj4).f28828u;
                        hqq hqqVar3 = (hqq) mkv.m16515W(((hpg) obj4).f28769B);
                        synchronized (hpaVar.f28750t) {
                            hqq hqqVar4 = hpaVar.f28754x;
                            hqqVar4.getClass();
                            hqqVar4.m10627h(hpaVar.m10559d());
                            hpaVar.f28754x.m10629j(hpaVar.m10558c());
                            hpaVar.f28754x.m10622c(hpaVar.m10556a());
                            hpaVar.f28754x.m10623d(hpaVar.m10557b());
                            hpaVar.f28737g.set(0L);
                            hpaVar.f28738h.set(0L);
                            hpaVar.f28736f.set(0L);
                            hpaVar.f28754x = hqqVar3;
                        }
                    }
                    break;
                }
                return;
        }
    }
}
