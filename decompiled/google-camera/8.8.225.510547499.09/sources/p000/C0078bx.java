package p000;

import android.content.res.Configuration;
import android.graphics.Canvas;
import androidx.wear.ambient.AmbientModeSupport;
import com.google.android.clockwork.common.wearable.wearmaterial.picker.CenteredRecyclerView;
import com.google.android.clockwork.common.wearable.wearmaterial.picker.WearPickerColumn;
import java.util.Iterator;

/* JADX INFO: renamed from: bx */
/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C0078bx implements aea {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ Object f4675a;

    /* JADX INFO: renamed from: b */
    private final /* synthetic */ int f4676b;

    public /* synthetic */ C0078bx(ActivityC0080bz activityC0080bz, int i) {
        this.f4676b = i;
        this.f4675a = activityC0080bz;
    }

    public /* synthetic */ C0078bx(CenteredRecyclerView centeredRecyclerView, int i) {
        this.f4676b = i;
        this.f4675a = centeredRecyclerView;
    }

    public /* synthetic */ C0078bx(WearPickerColumn wearPickerColumn, int i) {
        this.f4676b = i;
        this.f4675a = wearPickerColumn;
    }

    public /* synthetic */ C0078bx(C0111cq c0111cq, int i) {
        this.f4676b = i;
        this.f4675a = c0111cq;
    }

    public /* synthetic */ C0078bx(enn ennVar, int i) {
        this.f4676b = i;
        this.f4675a = ennVar;
    }

    public /* synthetic */ C0078bx(hyg hygVar, int i) {
        this.f4676b = i;
        this.f4675a = hygVar;
    }

    public /* synthetic */ C0078bx(oub oubVar, int i) {
        this.f4676b = i;
        this.f4675a = oubVar;
    }

    /* JADX WARN: Code duplicated, block: B:32:0x0096  */
    @Override // p000.aea
    /* JADX INFO: renamed from: a */
    public final void mo309a(Object obj) {
        hyd hydVarM13264Z;
        switch (this.f4676b) {
            case 0:
                ((ActivityC0080bz) this.f4675a).f4796e.m2603x();
                break;
            case 1:
                ((ActivityC0080bz) this.f4675a).f4796e.m2603x();
                break;
            case 2:
                Configuration configuration = (Configuration) obj;
                C0111cq c0111cq = (C0111cq) this.f4675a;
                if (c0111cq.m5311T()) {
                    c0111cq.m5333o(configuration, false);
                }
                break;
            case 3:
                Integer num = (Integer) obj;
                C0111cq c0111cq2 = (C0111cq) this.f4675a;
                if (c0111cq2.m5311T() && num.intValue() == 80) {
                    c0111cq2.m5336r(false);
                    break;
                }
                break;
            case 4:
                lqc lqcVar = (lqc) obj;
                C0111cq c0111cq3 = (C0111cq) this.f4675a;
                if (c0111cq3.m5311T()) {
                    c0111cq3.m5337s(lqcVar.f38949a, false);
                }
                break;
            case 5:
                lqc lqcVar2 = (lqc) obj;
                C0111cq c0111cq4 = (C0111cq) this.f4675a;
                if (c0111cq4.m5311T()) {
                    c0111cq4.m5342x(lqcVar2.f38949a, false);
                }
                break;
            case 6:
                ((otr) this.f4675a).mo19057s((awx) obj);
                break;
            case 7:
                avx avxVar = (avx) obj;
                enn ennVar = (enn) this.f4675a;
                ennVar.f14766c.mo3831be();
                if (((Boolean) ennVar.f14766c.mo3831be()).booleanValue()) {
                    ennVar.f14764a.showJupiterButton();
                } else if (avx.f2560a.equals(avxVar) || avx.f2561b.equals(avxVar)) {
                    ennVar.f14764a.hideJupiterButton();
                } else if (avx.f2562c.equals(avxVar)) {
                    ennVar.f14764a.showJupiterButton();
                }
                break;
            case 8:
                Object obj2 = this.f4675a;
                mwn mwnVarM17090e = mws.m17090e();
                for (awq awqVar : ((awx) obj).f2621a) {
                    if (awqVar instanceof awq) {
                        mwnVarM17090e.m17082g(awqVar);
                    }
                }
                mws mwsVarM17081f = mwnVarM17090e.m17081f();
                hyg hygVar = (hyg) obj2;
                if (!hygVar.f29910b.isInMultiWindowMode()) {
                    if (((mzr) mwsVarM17081f).f41859c == 1) {
                        awq awqVar2 = (awq) mwsVarM17081f.get(0);
                        awo awoVar = awo.f2601a;
                        awo awoVar2 = awqVar2.f2608b;
                        if (awoVar == awoVar2) {
                            hydVarM13264Z = jiy.m13266aa();
                        } else if (awo.f2602b == awoVar2 && awn.f2598a == awqVar2.m2076a()) {
                            hydVarM13264Z = jiy.m13266aa();
                        } else if (awo.f2602b == awqVar2.f2608b && awn.f2599b == awqVar2.m2076a()) {
                            hydVarM13264Z = new hyd(hye.JARVIS, mrm.m16829i(awqVar2.f2607a.m2067c()));
                        } else {
                            hydVarM13264Z = jiy.m13264Z();
                        }
                    } else {
                        hydVarM13264Z = jiy.m13264Z();
                    }
                    Iterator it = hygVar.f29909a.iterator();
                    while (it.hasNext()) {
                        Object obj3 = ((AmbientModeSupport.AmbientController) it.next()).f1702a;
                        if (!hydVarM13264Z.equals(jiy.m13267ab())) {
                            ((fvk) obj3).m8830b(hydVarM13264Z);
                        }
                    }
                    hygVar.f29911c.mo3415bf(hydVarM13264Z);
                    break;
                }
                break;
            case 9:
                ((CenteredRecyclerView) this.f4675a).m4609aB((Canvas) obj);
                break;
            default:
                ((WearPickerColumn) this.f4675a).m4616a((iyp) obj);
                break;
        }
    }
}
