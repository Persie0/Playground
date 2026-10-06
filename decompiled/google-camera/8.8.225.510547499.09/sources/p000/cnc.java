package p000;

import android.media.MediaMuxer;
import android.net.Uri;
import android.util.Log;
import com.google.android.apps.camera.brella.examplestore.beholder.BeholderExampleStoreDataTtlService;
import java.io.FileDescriptor;
import java.io.IOException;
import java.util.List;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class cnc implements nom {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ Object f6335a;

    /* JADX INFO: renamed from: b */
    private final /* synthetic */ int f6336b;

    public /* synthetic */ cnc(cni cniVar, int i) {
        this.f6336b = i;
        this.f6335a = cniVar;
    }

    public /* synthetic */ cnc(cof cofVar, int i) {
        this.f6336b = i;
        this.f6335a = cofVar;
    }

    public /* synthetic */ cnc(BeholderExampleStoreDataTtlService beholderExampleStoreDataTtlService, int i) {
        this.f6336b = i;
        this.f6335a = beholderExampleStoreDataTtlService;
    }

    public /* synthetic */ cnc(cot cotVar, int i) {
        this.f6336b = i;
        this.f6335a = cotVar;
    }

    public /* synthetic */ cnc(fyf fyfVar, int i) {
        this.f6336b = i;
        this.f6335a = fyfVar;
    }

    public /* synthetic */ cnc(juw juwVar, int i) {
        this.f6336b = i;
        this.f6335a = juwVar;
    }

    public /* synthetic */ cnc(lfj lfjVar, int i) {
        this.f6336b = i;
        this.f6335a = lfjVar;
    }

    public /* synthetic */ cnc(lql lqlVar, int i) {
        this.f6336b = i;
        this.f6335a = lqlVar;
    }

    public /* synthetic */ cnc(lrd lrdVar, int i) {
        this.f6336b = i;
        this.f6335a = lrdVar;
    }

    public /* synthetic */ cnc(lte lteVar, int i) {
        this.f6336b = i;
        this.f6335a = lteVar;
    }

    public /* synthetic */ cnc(ltn ltnVar, int i) {
        this.f6336b = i;
        this.f6335a = ltnVar;
    }

    public /* synthetic */ cnc(ltp ltpVar, int i) {
        this.f6336b = i;
        this.f6335a = ltpVar;
    }

    public /* synthetic */ cnc(nom nomVar, int i) {
        this.f6336b = i;
        this.f6335a = nomVar;
    }

    /* JADX WARN: Type inference failed for: r0v13, types: [cof, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v14, types: [java.lang.Object, nom] */
    /* JADX WARN: Type inference failed for: r0v24, types: [java.lang.Object, juw] */
    /* JADX WARN: Type inference failed for: r0v25, types: [java.lang.Object, juw] */
    /* JADX WARN: Type inference failed for: r0v34, types: [java.lang.Object, lte] */
    @Override // p000.nom
    /* JADX INFO: renamed from: a */
    public final nps mo3942a(Object obj) {
        nps npsVarA;
        nps npsVar;
        MediaMuxer mediaMuxer;
        nps npsVar2;
        switch (this.f6336b) {
            case 0:
                return ((BeholderExampleStoreDataTtlService) this.f6335a).f6568c.m5214b(((mxk) obj).mo17025v());
            case 1:
                return ((BeholderExampleStoreDataTtlService) this.f6335a).m4066a().mo4000f(TimeUnit.DAYS.toMillis(7L));
            case 2:
                return ((cni) this.f6335a).mo3984d();
            case 3:
                return ((cot) this.f6335a).f8499c.mo4002h(((mxk) obj).mo17025v());
            case 4:
                return this.f6335a.mo3999e((mxk) obj);
            case 5:
                ?? r0 = this.f6335a;
                RuntimeException runtimeException = (RuntimeException) obj;
                ((nbe) ((nbe) ((nbe) fgh.f21843a.m17252c()).mo17283h(runtimeException)).mo17276G((char) 2197)).mo17290o("Could not finish microvideo session as it previously failed with cause:");
                return r0.mo3942a(runtimeException);
            case 6:
                Object obj2 = this.f6335a;
                grm grmVar = (grm) obj;
                synchronized (((fyf) obj2).f23886e.f23893e) {
                    grmVar.getClass();
                    fyg fygVar = ((fyf) obj2).f23886e;
                    fygVar.f23896h = 4;
                    npsVarA = fygVar.f23890b.mo8942a(grmVar);
                    kpw kpwVar = grmVar.f26152a;
                    kpwVar.getClass();
                    npsVarA.mo2282d(new fnx(kpwVar, 19), not.INSTANCE);
                    break;
                }
                return npsVarA;
            case 7:
                grm grmVar2 = (grm) obj;
                return (!dnr.m6446e(grmVar2.f26158g, grmVar2.f26157f) || (npsVar = grmVar2.f26154c) == null || grmVar2.f26160i == null) ? kxk.m14965K(grmVar2) : nod.m17553i(nod.m17554j(npm.m17611q(npsVar), new cqc((fyf) this.f6335a, grmVar2, 3), not.INSTANCE), new etx(grmVar2, 6), not.INSTANCE);
            case 8:
                ?? r1 = this.f6335a;
                List list = (List) obj;
                list.getClass();
                return r1.mo3468a(list.get(0), list.get(1));
            case 9:
                ?? r2 = this.f6335a;
                List list2 = (List) obj;
                list2.getClass();
                return r2.mo3468a(list2.get(0), list2.get(1));
            case 10:
                Object obj3 = this.f6335a;
                try {
                    mrm mrmVarM16828h = mrm.m16828h((Integer) kxk.m14973S(((lfj) obj3).f38125b));
                    mrm mrmVarM16828h2 = mrm.m16828h((Float) kxk.m14973S(((lfj) obj3).f38126c));
                    mrm mrmVarM16828h3 = mrm.m16828h((Float) kxk.m14973S(((lfj) obj3).f38127d));
                    lpe lpeVar = (lpe) kxk.m14973S(((lfj) obj3).f38124a);
                    Object obj4 = lpeVar.f38884c;
                    mediaMuxer = new MediaMuxer((FileDescriptor) ((mrq) lpeVar.f38883b).f41482a, 0);
                    try {
                        if (mrmVarM16828h.mo16813g()) {
                            mediaMuxer.setOrientationHint(((Integer) mrmVarM16828h.mo16809c()).intValue());
                        }
                        if (mrmVarM16828h2.mo16813g() && mrmVarM16828h3.mo16813g()) {
                            mediaMuxer.setLocation(((Float) mrmVarM16828h2.mo16809c()).floatValue(), ((Float) mrmVarM16828h3.mo16809c()).floatValue());
                        }
                        return kxk.m14965K(mediaMuxer);
                    } catch (Throwable th) {
                        th = th;
                        Log.e("MuxerImpl", "Error trying to construct MediaMuxer.", th);
                        lfj lfjVar = (lfj) obj3;
                        if (!lfjVar.f38132i && mediaMuxer != null) {
                            mediaMuxer.release();
                            lfjVar.f38132i = true;
                        }
                        return kxk.m14964J(th);
                    }
                } catch (Throwable th2) {
                    th = th2;
                    mediaMuxer = null;
                }
                break;
            case 11:
                return ((lrd) this.f6335a).m15911c((lre) obj);
            case 12:
                Object obj5 = this.f6335a;
                lqa lqaVar = (lqa) obj;
                if (lqaVar.f38948a == 29501) {
                    lql lqlVar = (lql) obj5;
                    Log.w("MobStoreFlagStore", "Failed to commit due to stale snapshot for " + lqlVar.f38971b + ", triggering flag update. Experiments may be delayed til next app start.");
                    lqlVar.m15883b();
                }
                return kxk.m14964J(lqaVar);
            case 13:
                return ((lrd) this.f6335a).m15911c((lre) obj);
            case 14:
                return this.f6335a.m15965c();
            case 15:
                ltn ltnVar = (ltn) this.f6335a;
                ltnVar.m15975c((Uri) kxk.m14973S(ltnVar.f39179b), obj);
                return npp.f44031a;
            case 16:
                Object obj6 = this.f6335a;
                Uri uri = (Uri) obj;
                Uri uriM15576c = lkm.m15576c(uri, ".bak");
                try {
                    if (((ltn) obj6).f39184g.m19468G(uriM15576c)) {
                        ((ltn) obj6).f39184g.m19467F(uriM15576c, uri);
                        break;
                    }
                    return npp.f44031a;
                } catch (IOException e) {
                    return kxk.m14964J(e);
                }
            case 17:
                ltn ltnVar2 = (ltn) this.f6335a;
                return kxk.m14965K(ltnVar2.m15974b((Uri) kxk.m14973S(ltnVar2.f39179b)));
            case 18:
                Object obj7 = this.f6335a;
                synchronized (((ltn) obj7).f39182e) {
                    npsVar2 = ((ltn) obj7).f39183f;
                    break;
                }
                return npsVar2;
            case 19:
                return ((ltn) ((ltp) this.f6335a).f39190b).m15973a();
            default:
                return ((ltp) this.f6335a).f39191c.m16668c();
        }
    }
}
