package p000;

import android.os.Looper;
import com.google.android.apps.camera.bottombar.BottomBarController;
import com.google.android.apps.camera.bottombar.BottomBarListener;
import com.google.android.libraries.lens.lenslite.dynamicloading.ApiVersion;
import java.util.concurrent.Future;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class eds implements kba {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ Object f13527a;

    /* JADX INFO: renamed from: b */
    private final /* synthetic */ int f13528b;

    public /* synthetic */ eds(Looper looper, int i) {
        this.f13528b = i;
        this.f13527a = looper;
    }

    public /* synthetic */ eds(cet cetVar, int i) {
        this.f13528b = i;
        this.f13527a = cetVar;
    }

    public /* synthetic */ eds(cmo cmoVar, int i, byte[] bArr) {
        this.f13528b = i;
        this.f13527a = cmoVar;
    }

    public /* synthetic */ eds(efp efpVar, int i) {
        this.f13528b = i;
        this.f13527a = efpVar;
    }

    public /* synthetic */ eds(eoq eoqVar, int i) {
        this.f13528b = i;
        this.f13527a = eoqVar;
    }

    public /* synthetic */ eds(epf epfVar, int i) {
        this.f13528b = i;
        this.f13527a = epfVar;
    }

    public /* synthetic */ eds(eus eusVar, int i) {
        this.f13528b = i;
        this.f13527a = eusVar;
    }

    public /* synthetic */ eds(eva evaVar, int i) {
        this.f13528b = i;
        this.f13527a = evaVar;
    }

    public /* synthetic */ eds(ewa ewaVar, int i) {
        this.f13528b = i;
        this.f13527a = ewaVar;
    }

    public /* synthetic */ eds(fws fwsVar, int i, byte[] bArr) {
        this.f13528b = i;
        this.f13527a = fwsVar;
    }

    public /* synthetic */ eds(Future future, int i) {
        this.f13528b = i;
        this.f13527a = future;
    }

    public /* synthetic */ eds(jww jwwVar, int i) {
        this.f13528b = i;
        this.f13527a = jwwVar;
    }

    public /* synthetic */ eds(kba kbaVar, int i) {
        this.f13528b = i;
        this.f13527a = kbaVar;
    }

    public /* synthetic */ eds(C1058va c1058va, int i, byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4) {
        this.f13528b = i;
        this.f13527a = c1058va;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, jww] */
    /* JADX WARN: Type inference failed for: r0v12, types: [eop, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v15, types: [equ, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v16, types: [java.lang.Object, java.util.concurrent.Future] */
    /* JADX WARN: Type inference failed for: r0v17, types: [java.lang.Object, kba] */
    /* JADX WARN: Type inference failed for: r0v18, types: [cet, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v19, types: [cet, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v48, types: [com.google.android.libraries.lens.lenslite.dynamicloading.DLEngineApi, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v51, types: [com.google.android.libraries.lens.lenslite.dynamicloading.DLEngineApi, java.lang.Object] */
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
        switch (this.f13528b) {
            case 0:
                this.f13527a.mo3415bf(false);
                break;
            case 1:
                ((Looper) this.f13527a).quitSafely();
                break;
            case 2:
                ((efp) this.f13527a).m7281i();
                break;
            case 3:
                fws fwsVar = (fws) this.f13527a;
                ((BottomBarController) fwsVar.f23766c).removeListener((BottomBarListener) fwsVar.f23774k);
                break;
            case 4:
                fws fwsVar2 = (fws) this.f13527a;
                ((eoq) fwsVar2.f23772i).m7598b(fwsVar2.f23773j);
                break;
            case 5:
                ((eoq) this.f13527a).m7600g(3);
                break;
            case 6:
                ?? r0 = this.f13527a;
                ((epf) r0).f14962b.mo7636e(r0);
                break;
            case 7:
                ?? r1 = this.f13527a;
                ((nbe) ((nbe) epk.f14980a.m17252c()).mo17276G((char) 1711)).mo17290o("OneCamera closed, interrupting capture.");
                r1.cancel(false);
                break;
            case 8:
                ?? r2 = this.f13527a;
                nbh nbhVar = epr.f15012a;
                r2.close();
                break;
            case 9:
                this.f13527a.mo3584j(null);
                break;
            case 10:
                this.f13527a.mo3576b();
                break;
            case 11:
                eus eusVar = (eus) this.f13527a;
                eusVar.f20200r.removeListener(eusVar.f20153O);
                break;
            case 12:
                eus eusVar2 = (eus) this.f13527a;
                eusVar2.f20191i.m7598b(eusVar2.f20154P);
                break;
            case 13:
                ((eus) this.f13527a).f20206x.m8280a();
                break;
            case 14:
                eva evaVar = (eva) this.f13527a;
                evaVar.f20319m.removeListener(evaVar.f20283D);
                break;
            case 15:
                eva evaVar2 = (eva) this.f13527a;
                evaVar2.f20321o.m7598b(evaVar2.f20285F);
                break;
            case 16:
                ((evo) ((cmo) this.f13527a).f6236a).f20431p.m7924a(false);
                break;
            case 17:
                ewa ewaVar = (ewa) this.f13527a;
                ewaVar.f20564v.removeListener(ewaVar.f20514Q);
                break;
            case 18:
                ewa ewaVar2 = (ewa) this.f13527a;
                ewaVar2.f20554l.m7598b(ewaVar2.f20516S);
                break;
            case 19:
                C1058va c1058va = (C1058va) this.f13527a;
                if (c1058va.m19469H() >= ApiVersion.VERSION_8.getVersionCode()) {
                    c1058va.f47803b.stopLinkLogging();
                }
                break;
            default:
                ((C1058va) this.f13527a).f47803b.shutdown();
                break;
        }
    }
}
