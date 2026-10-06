package p000;

import android.os.Trace;
import com.google.android.apps.camera.bottombar.C0100R;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class esc implements Runnable {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ Object f15302a;

    /* JADX INFO: renamed from: b */
    private final /* synthetic */ int f15303b;

    public /* synthetic */ esc(cht chtVar, int i) {
        this.f15303b = i;
        this.f15302a = chtVar;
    }

    public /* synthetic */ esc(esg esgVar, int i) {
        this.f15303b = i;
        this.f15302a = esgVar;
    }

    public /* synthetic */ esc(esl eslVar, int i) {
        this.f15303b = i;
        this.f15302a = eslVar;
    }

    public /* synthetic */ esc(esp espVar, int i) {
        this.f15303b = i;
        this.f15302a = espVar;
    }

    public /* synthetic */ esc(etr etrVar, int i) {
        this.f15303b = i;
        this.f15302a = etrVar;
    }

    public /* synthetic */ esc(etz etzVar, int i) {
        this.f15303b = i;
        this.f15302a = etzVar;
    }

    public /* synthetic */ esc(eua euaVar, int i) {
        this.f15303b = i;
        this.f15302a = euaVar;
    }

    public /* synthetic */ esc(eue eueVar, int i) {
        this.f15303b = i;
        this.f15302a = eueVar;
    }

    public /* synthetic */ esc(euf eufVar, int i) {
        this.f15303b = i;
        this.f15302a = eufVar;
    }

    public /* synthetic */ esc(euh euhVar, int i) {
        this.f15303b = i;
        this.f15302a = euhVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v10, types: [cht, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v11, types: [hgp, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v6, types: [cht, java.lang.Object] */
    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f15303b) {
            case 0:
                ((iqi) ((esl) this.f15302a).f15336R.get()).mo11606f();
                break;
            case 1:
                this.f15302a.mo3755g();
                break;
            case 2:
                esl eslVar = (esl) this.f15302a;
                if (!eslVar.f15421y && !eslVar.f15422z) {
                    ((hgo) eslVar.f15413q.mo16809c()).mo10213h(eslVar.f15320B, eslVar.f15321C);
                    break;
                }
                break;
            case 3:
                this.f15302a.mo3756h();
                break;
            case 4:
                ?? r0 = this.f15302a;
                ((hgo) ((esg) r0).f15309a.f15413q.mo16809c()).mo10214i(r0);
                break;
            case 5:
                Object obj = this.f15302a;
                int i = esq.f15502a;
                Trace.beginSection("retrievePhenotypeFlags");
                ggp.m9224a(((esp) obj).f15501a);
                Trace.endSection();
                break;
            case 6:
                Object obj2 = this.f15302a;
                int i2 = esq.f15502a;
                ((esp) obj2).m7787a();
                break;
            case 7:
                Object obj3 = this.f15302a;
                int i3 = esq.f15502a;
                Trace.beginSection("prewarmSensorService");
                ((esp) obj3).f15501a.getSystemService("sensor");
                Trace.endSection();
                break;
            case 8:
                ((ikg) ((etr) this.f15302a).f19861a.get()).mo6340a();
                break;
            case 9:
                ((euf) this.f15302a).m7892B(true);
                break;
            case 10:
                euf eufVar = (euf) this.f15302a;
                eufVar.f19938Y.mo10753b(eufVar.f19981ap, eufVar.f19935V);
                break;
            case 11:
                euf eufVar2 = (euf) this.f15302a;
                eufVar2.f20000g.mo13961e("countdown#startHotshot");
                eufVar2.f19920G.m10882e();
                eufVar2.f20000g.mo13962f();
                break;
            case 12:
                euf eufVar3 = (euf) this.f15302a;
                eufVar3.f20000g.mo13961e("changeCamera#startHotshot");
                eufVar3.f19920G.m10882e();
                eufVar3.f20000g.mo13962f();
                break;
            case 13:
                euf eufVar4 = (euf) this.f15302a;
                eufVar4.m7900y(false, eufVar4.f20007n.mo5895d());
                break;
            case 14:
                ((chw) this.f15302a).mo3777k();
                break;
            case 15:
                ((chw) this.f15302a).mo3783r();
                break;
            case 16:
                euf eufVar5 = (euf) this.f15302a;
                eufVar5.f20000g.mo13961e("resume#startHotshot");
                eufVar5.f19920G.m10882e();
                eufVar5.f20000g.mo13962f();
                break;
            case 17:
                ((etz) this.f15302a).f19900e.m7892B(true);
                break;
            case 18:
                ((eua) this.f15302a).f19902a.m7892B(true);
                break;
            case 19:
                eue eueVar = (eue) this.f15302a;
                eueVar.f19911a.m7894D();
                if (!((ffl) eueVar.f19911a.f20016w.get()).f21669o) {
                    eueVar.f19911a.f19916C.mo10316b(C0100R.raw.camera_shutter);
                }
                break;
            default:
                euh euhVar = (euh) this.f15302a;
                euf eufVar6 = (euf) euhVar.f20103a.get();
                eufVar6.f19966aa.mo3415bf(false);
                iuj iujVar = eufVar6.f20004k;
                if (iujVar != null) {
                    iujVar.mo11766q(false);
                    if (eufVar6.f19968ac.mo6184l(dib.f11276aj) || (eufVar6.f20007n.m5901j() && eufVar6.f19981ap.mo14534C())) {
                        eufVar6.f20004k.mo11765p();
                    }
                }
                dox doxVar = eufVar6.f20005l;
                if (doxVar != null) {
                    doxVar.mo6472h();
                }
                eufVar6.f19917D.m8582c();
                if (eufVar6.f20018y.mo16813g()) {
                    ((cld) eufVar6.f20018y.mo16809c()).mo3908l();
                }
                if (eufVar6.f20017x.mo16813g()) {
                    ((hnn) eufVar6.f20017x.mo16809c()).mo10510s();
                    ((hnn) eufVar6.f20017x.mo16809c()).mo10504m(mqu.f41450a);
                }
                eufVar6.f19970ae.m7099j();
                if (((Boolean) eufVar6.f19970ae.f13316b.mo3831be()).booleanValue()) {
                    eufVar6.f20002i.mo11236h();
                }
                eufVar6.f20006m.m10837d(true);
                eufVar6.f20013t.mo11013l(true);
                eufVar6.f19915B.mo3693g().mo3716f();
                eufVar6.f19967ab.mo9124j();
                eufVar6.f19973ah.mo7489k(ely.FIRST_RUN_TOAST);
                eufVar6.f19977al.m9147e();
                euhVar.f20105c = true;
                euhVar.f20104b.m13643c();
                break;
        }
    }
}
