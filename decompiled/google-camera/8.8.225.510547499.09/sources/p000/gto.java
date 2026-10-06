package p000;

import android.os.Handler;
import android.view.View;
import androidx.wear.ambient.AmbientMode;
import androidx.wear.ambient.AmbientModeSupport;
import com.google.android.apps.camera.bottombar.BottomBar;
import com.google.android.apps.camera.smarts.SmartsChipView;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class gto implements kba {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ Object f26376a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Object f26377b;

    /* JADX INFO: renamed from: c */
    private final /* synthetic */ int f26378c;

    public /* synthetic */ gto(Handler handler, Runnable runnable, int i) {
        this.f26378c = i;
        this.f26376a = handler;
        this.f26377b = runnable;
    }

    public /* synthetic */ gto(SmartsChipView smartsChipView, View.OnLayoutChangeListener onLayoutChangeListener, int i) {
        this.f26378c = i;
        this.f26377b = smartsChipView;
        this.f26376a = onLayoutChangeListener;
    }

    public /* synthetic */ gto(glj gljVar, AtomicBoolean atomicBoolean, int i) {
        this.f26378c = i;
        this.f26376a = gljVar;
        this.f26377b = atomicBoolean;
    }

    public /* synthetic */ gto(hdk hdkVar, hdj hdjVar, int i) {
        this.f26378c = i;
        this.f26377b = hdkVar;
        this.f26376a = hdjVar;
    }

    public /* synthetic */ gto(hdk hdkVar, Runnable runnable, int i) {
        this.f26378c = i;
        this.f26376a = hdkVar;
        this.f26377b = runnable;
    }

    public /* synthetic */ gto(hdp hdpVar, kba kbaVar, int i) {
        this.f26378c = i;
        this.f26376a = hdpVar;
        this.f26377b = kbaVar;
    }

    public /* synthetic */ gto(hfu hfuVar, BottomBar.OnContentVisibilityChangedListener onContentVisibilityChangedListener, int i) {
        this.f26378c = i;
        this.f26377b = hfuVar;
        this.f26376a = onContentVisibilityChangedListener;
    }

    public /* synthetic */ gto(hio hioVar, hiv hivVar, int i) {
        this.f26378c = i;
        this.f26376a = hioVar;
        this.f26377b = hivVar;
    }

    public /* synthetic */ gto(hjj hjjVar, AmbientMode.AmbientController ambientController, int i, byte[] bArr, byte[] bArr2) {
        this.f26378c = i;
        this.f26377b = hjjVar;
        this.f26376a = ambientController;
    }

    public /* synthetic */ gto(hng hngVar, jvb jvbVar, int i) {
        this.f26378c = i;
        this.f26376a = hngVar;
        this.f26377b = jvbVar;
    }

    public /* synthetic */ gto(hnt hntVar, hnu hnuVar, int i) {
        this.f26378c = i;
        this.f26376a = hntVar;
        this.f26377b = hnuVar;
    }

    public /* synthetic */ gto(hrp hrpVar, kba kbaVar, int i) {
        this.f26378c = i;
        this.f26376a = hrpVar;
        this.f26377b = kbaVar;
    }

    public /* synthetic */ gto(hru hruVar, mrm mrmVar, int i) {
        this.f26378c = i;
        this.f26376a = hruVar;
        this.f26377b = mrmVar;
    }

    public gto(htb htbVar, hco hcoVar, int i, byte[] bArr) {
        this.f26378c = i;
        this.f26377b = htbVar;
        this.f26376a = hcoVar;
    }

    public /* synthetic */ gto(hth hthVar, hte hteVar, int i) {
        this.f26378c = i;
        this.f26377b = hthVar;
        this.f26376a = hteVar;
    }

    public /* synthetic */ gto(hyg hygVar, AmbientModeSupport.AmbientController ambientController, int i, byte[] bArr, byte[] bArr2, byte[] bArr3) {
        this.f26378c = i;
        this.f26377b = hygVar;
        this.f26376a = ambientController;
    }

    public /* synthetic */ gto(iak iakVar, gfg gfgVar, int i) {
        this.f26378c = i;
        this.f26377b = iakVar;
        this.f26376a = gfgVar;
    }

    public /* synthetic */ gto(ige igeVar, igf igfVar, int i) {
        this.f26378c = i;
        this.f26376a = igeVar;
        this.f26377b = igfVar;
    }

    public /* synthetic */ gto(Object obj, ExecutorService executorService, int i) {
        this.f26378c = i;
        this.f26376a = obj;
        this.f26377b = executorService;
    }

    public /* synthetic */ gto(mrm mrmVar, oju ojuVar, int i) {
        this.f26378c = i;
        this.f26376a = mrmVar;
        this.f26377b = ojuVar;
    }

    public /* synthetic */ gto(oju ojuVar, oju ojuVar2, int i) {
        this.f26378c = i;
        this.f26376a = ojuVar;
        this.f26377b = ojuVar2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, oju] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, oju] */
    /* JADX WARN: Type inference failed for: r1v13, types: [java.lang.Object, java.util.Set] */
    /* JADX WARN: Type inference failed for: r1v14, types: [android.view.View$OnLayoutChangeListener, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v15, types: [java.lang.Object, java.lang.Runnable] */
    /* JADX WARN: Type inference failed for: r1v16, types: [gyi, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v17, types: [java.lang.Object, kba] */
    /* JADX WARN: Type inference failed for: r1v19, types: [com.google.android.apps.camera.bottombar.BottomBar$OnContentVisibilityChangedListener, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v24, types: [java.lang.Object, kba] */
    /* JADX WARN: Type inference failed for: r1v31, types: [gfg, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v32, types: [java.lang.Object, java.lang.Runnable] */
    /* JADX WARN: Type inference failed for: r1v5, types: [java.lang.Object, oju] */
    /* JADX WARN: Type inference failed for: r1v8, types: [java.lang.Object, java.util.concurrent.ExecutorService] */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // p000.kba, java.lang.AutoCloseable
    public final void close() {
        switch (this.f26378c) {
            case 0:
                ((dxx) this.f26376a.get()).m6890f((dxy) this.f26377b.get());
                return;
            case 1:
                Object obj = this.f26376a;
                if (((AtomicBoolean) this.f26377b).getAndSet(false)) {
                    ((glj) obj).f25492b.unlock();
                    return;
                }
                return;
            case 2:
                ((dyo) ((mrm) this.f26376a).mo16809c()).mo6928g((dyn) this.f26377b.get());
                return;
            case 3:
                Object obj2 = this.f26376a;
                ?? r1 = this.f26377b;
                synchronized (obj2) {
                    r1.shutdown();
                    break;
                }
                return;
            case 4:
                synchronized (this.f26377b) {
                    ((htb) this.f26377b).f29485a.remove(this.f26376a);
                    break;
                }
                return;
            case 5:
                ((SmartsChipView) this.f26377b).removeOnLayoutChangeListener(this.f26376a);
                return;
            case 6:
                Object obj3 = this.f26376a;
                ((hdk) obj3).f27329e.m3466c(this.f26377b);
                return;
            case 7:
                Object obj4 = this.f26377b;
                ((hdk) obj4).f27328d.m9973h(this.f26376a);
                return;
            case 8:
                Object obj5 = this.f26376a;
                this.f26377b.close();
                ((hdp) obj5).f27370f = hdp.f27366b;
                return;
            case 9:
                Object obj6 = this.f26377b;
                ((hfu) obj6).f27594j.removeOnContentVisibilityChangedListener(this.f26376a);
                return;
            case 10:
                Object obj7 = this.f26376a;
                ((hio) obj7).f27929g.remove(this.f26377b);
                return;
            case 11:
                Object obj8 = this.f26377b;
                ((hjj) obj8).f28048a.remove(this.f26376a);
                return;
            case 12:
                Object obj9 = this.f26376a;
                Object obj10 = this.f26377b;
                hng hngVar = (hng) obj9;
                hngVar.f28442i.mo8204x(hngVar.f28420B.m17081f());
                hngVar.f28442i.mo8193m(hngVar.f28453t);
                hngVar.f28442i.mo8192l(hngVar.f28454u);
                hngVar.m10498g();
                hngVar.m10499h();
                hngVar.f28438e.f5556a = false;
                hngVar.f28435b.mo3415bf(hno.INACTIVE);
                if (((Integer) hngVar.f28443j.mo6173a(dib.f11228O).get()).intValue() == -1) {
                    if (hngVar.f28443j.mo6184l(dib.f11353cg) && ((hnp) hngVar.f28434a.mo3831be()).equals(hnp.ON)) {
                        hngVar.f28445l.mo10033e(gzy.f27028al, Integer.valueOf(hnp.AUTO.f28521d));
                    }
                    hngVar.f28434a.mo3415bf(hnp.m10514a(((Boolean) hngVar.f28446m.mo10031c(gzy.f27055n)).booleanValue()));
                }
                hngVar.f28437d.mo3415bf(Boolean.FALSE);
                ((jvb) obj10).close();
                hngVar.f28449p = null;
                hngVar.f28450q = null;
                hngVar.f28451r = false;
                hngVar.f28452s = false;
                hngVar.f28456w = false;
                hngVar.f28457x = false;
                hngVar.f28458y = false;
                hngVar.f28453t = 0;
                hngVar.f28454u = 0;
                hngVar.f28419A = 0;
                return;
            case 13:
                Object obj11 = this.f26376a;
                Object obj12 = this.f26377b;
                synchronized (obj11) {
                    ((hnt) obj11).f28529a.remove(obj12);
                    break;
                }
                return;
            case 14:
                Object obj13 = this.f26376a;
                ?? r2 = this.f26377b;
                synchronized (obj13) {
                    mrm mrmVar = ((hrp) obj13).f29334e;
                    break;
                }
                hrp hrpVar = (hrp) obj13;
                hrpVar.f29330a.execute(hrpVar.f29331b.mo13959c("detachResources.close", new hps((kba) r2, 14)));
                return;
            case 15:
                ((hru) this.f26376a).m10667j((mrm) this.f26377b);
                return;
            case 16:
                Object obj14 = this.f26377b;
                ((hth) obj14).f29501b.remove(this.f26376a);
                return;
            case 17:
                Object obj15 = this.f26377b;
                ((hyg) obj15).f29909a.remove(this.f26376a);
                return;
            case 18:
                Object obj16 = this.f26377b;
                ((iak) obj16).f30156i.mo9128n(this.f26376a);
                return;
            case 19:
                ((Handler) this.f26376a).removeCallbacks(this.f26377b);
                return;
            default:
                Object obj17 = this.f26376a;
                Object obj18 = this.f26377b;
                synchronized (((ige) obj17).f30727b) {
                    ((ige) obj17).f30728c.remove(obj18);
                    if (!((ige) obj17).m11260ao()) {
                        ((ige) obj17).m11259an(false, false, true);
                        ((ige) obj17).m11258am(false, false);
                    }
                    break;
                }
                return;
        }
    }
}
