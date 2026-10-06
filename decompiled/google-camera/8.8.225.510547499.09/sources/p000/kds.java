package p000;

import android.location.Location;
import android.media.MediaCodec;
import android.media.MediaFormat;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.libraries.vision.opengl.MUg.WIxTIdUIdfb;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ExecutionException;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class kds implements Runnable {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ Object f35669a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Object f35670b;

    /* JADX INFO: renamed from: c */
    private final /* synthetic */ int f35671c;

    public /* synthetic */ kds(List list, kkh kkhVar, int i) {
        this.f35671c = i;
        this.f35670b = list;
        this.f35669a = kkhVar;
    }

    public /* synthetic */ kds(kdt kdtVar, kct kctVar, int i) {
        this.f35671c = i;
        this.f35670b = kdtVar;
        this.f35669a = kctVar;
    }

    public /* synthetic */ kds(kdt kdtVar, kdv kdvVar, int i) {
        this.f35671c = i;
        this.f35669a = kdtVar;
        this.f35670b = kdvVar;
    }

    public /* synthetic */ kds(kgm kgmVar, kfd kfdVar, int i) {
        this.f35671c = i;
        this.f35670b = kgmVar;
        this.f35669a = kfdVar;
    }

    public /* synthetic */ kds(kgm kgmVar, kll kllVar, int i) {
        this.f35671c = i;
        this.f35669a = kgmVar;
        this.f35670b = kllVar;
    }

    public /* synthetic */ kds(kgm kgmVar, kpl kplVar, int i) {
        this.f35671c = i;
        this.f35669a = kgmVar;
        this.f35670b = kplVar;
    }

    public /* synthetic */ kds(kgm kgmVar, kpp kppVar, int i) {
        this.f35671c = i;
        this.f35669a = kgmVar;
        this.f35670b = kppVar;
    }

    public /* synthetic */ kds(kgs kgsVar, kiq kiqVar, int i) {
        this.f35671c = i;
        this.f35669a = kgsVar;
        this.f35670b = kiqVar;
    }

    public /* synthetic */ kds(khj khjVar, kge kgeVar, int i) {
        this.f35671c = i;
        this.f35670b = khjVar;
        this.f35669a = kgeVar;
    }

    public /* synthetic */ kds(kkh kkhVar, kpk kpkVar, int i) {
        this.f35671c = i;
        this.f35669a = kkhVar;
        this.f35670b = kpkVar;
    }

    public /* synthetic */ kds(kos kosVar, kay kayVar, int i) {
        this.f35671c = i;
        this.f35670b = kosVar;
        this.f35669a = kayVar;
    }

    public /* synthetic */ kds(kuz kuzVar, iuv iuvVar, int i) {
        this.f35671c = i;
        this.f35670b = kuzVar;
        this.f35669a = iuvVar;
    }

    public /* synthetic */ kds(kuz kuzVar, iuw iuwVar, int i) {
        this.f35671c = i;
        this.f35670b = kuzVar;
        this.f35669a = iuwVar;
    }

    public /* synthetic */ kds(kxy kxyVar, Runnable runnable, int i) {
        this.f35671c = i;
        this.f35669a = kxyVar;
        this.f35670b = runnable;
    }

    public /* synthetic */ kds(kyb kybVar, nps npsVar, int i) {
        this.f35671c = i;
        this.f35669a = kybVar;
        this.f35670b = npsVar;
    }

    public /* synthetic */ kds(kyc kycVar, Runnable runnable, int i) {
        this.f35671c = i;
        this.f35669a = kycVar;
        this.f35670b = runnable;
    }

    public /* synthetic */ kds(kyc kycVar, kyb kybVar, int i) {
        this.f35671c = i;
        this.f35670b = kycVar;
        this.f35669a = kybVar;
    }

    public /* synthetic */ kds(kyc kycVar, nps npsVar, int i) {
        this.f35671c = i;
        this.f35669a = kycVar;
        this.f35670b = npsVar;
    }

    public kds(kzp kzpVar, Object obj, int i) {
        this.f35671c = i;
        this.f35669a = kzpVar;
        this.f35670b = obj;
    }

    public kds(kzq kzqVar, kzr kzrVar, int i) {
        this.f35671c = i;
        this.f35669a = kzqVar;
        this.f35670b = kzrVar;
    }

    public /* synthetic */ kds(lfl lflVar, lpe lpeVar, int i, byte[] bArr) {
        this.f35671c = i;
        this.f35670b = lflVar;
        this.f35669a = lpeVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v35, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r0v39, types: [java.lang.Object, kos] */
    /* JADX WARN: Type inference failed for: r0v46, types: [android.os.IInterface, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v18, types: [java.lang.Object, kpk] */
    /* JADX WARN: Type inference failed for: r1v35, types: [java.lang.Object, java.lang.Runnable] */
    /* JADX WARN: Type inference failed for: r1v38, types: [java.lang.Object, java.util.concurrent.Future] */
    /* JADX WARN: Type inference failed for: r1v4, types: [java.lang.Object, kct] */
    /* JADX WARN: Type inference failed for: r1v47, types: [java.lang.Object, java.lang.Runnable] */
    /* JADX WARN: Type inference failed for: r1v49, types: [java.lang.Object, java.util.concurrent.Future, nps] */
    /* JADX WARN: Type inference failed for: r1v5, types: [java.lang.Object, kct] */
    /* JADX WARN: Type inference failed for: r1v6, types: [java.lang.Object, kpl] */
    /* JADX WARN: Type inference failed for: r1v9, types: [java.lang.Object, kpp] */
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
    @Override // java.lang.Runnable
    public final void run() {
        int i = 11;
        iuw iuwVar = null;
        switch (this.f35671c) {
            case 0:
                ((kdt) this.f35669a).f35673b.m13998e(this.f35670b);
                return;
            case 1:
                Object obj = this.f35670b;
                ?? r1 = this.f35669a;
                kdl kdlVar = ((kdt) obj).f35673b;
                synchronized (kdlVar.f35648a) {
                    kdlVar.f35650c.remove(r1);
                    break;
                }
                r1.mo13971a();
                return;
            case 2:
                ((kgm) this.f35669a).f35927a.mo6427bj(this.f35670b);
                return;
            case 3:
                ((kgm) this.f35670b).f35927a.mo8901bn((kfd) this.f35669a);
                return;
            case 4:
                ((kgm) this.f35669a).f35927a.mo3408bu(this.f35670b);
                return;
            case 5:
                ((kgm) this.f35669a).f35927a.mo5455ba((kll) this.f35670b);
                return;
            case 6:
                Object obj2 = this.f35669a;
                Object obj3 = this.f35670b;
                synchronized (((kgs) obj2).f35955e) {
                    Iterator it = ((kgs) obj2).f35955e.iterator();
                    while (it.hasNext()) {
                        ((kfb) it.next()).mo3625c((kiq) obj3);
                    }
                    break;
                }
                return;
            case 7:
                Object obj4 = this.f35670b;
                try {
                    ((khj) obj4).f36024b.m14260b((kge) this.f35669a);
                    return;
                } catch (InterruptedException e) {
                    Thread.currentThread().interrupt();
                    ((khj) obj4).f36023a.mo13941c("Interrupted when calling trigger3A.", e);
                    return;
                } catch (kec e2) {
                    ((khj) obj4).f36023a.mo13941c("FrameServer was closed when calling trigger3A.", e2);
                    return;
                }
            case 8:
                ?? r0 = this.f35670b;
                Object obj5 = this.f35669a;
                Iterator it2 = r0.iterator();
                while (it2.hasNext()) {
                    ((kkh) obj5).mo14420b((kpk) it2.next(), null);
                }
                return;
            case 9:
                ((kkh) this.f35669a).mo14420b(this.f35670b, null);
                return;
            case 10:
                this.f35670b.mo3955h((kay) this.f35669a);
                return;
            case 11:
                Object obj6 = this.f35670b;
                Object obj7 = this.f35669a;
                lle.m15692l();
                kuz kuzVar = (kuz) obj6;
                if (kuzVar.f37274i == null) {
                    Log.w("LensServiceConnImpl", "The service is no longer bound.");
                    kuzVar.m14920h();
                    return;
                }
                try {
                    ((kuz) obj6).f37275j = (iuw) obj7;
                    if (((kuz) obj6).f37275j == null) {
                        Log.e("LensServiceConnImpl", "Failed to create a Lens service session.");
                        ((kuz) obj6).f37273h = 11;
                        ((kuz) obj6).m14921i(7);
                        return;
                    }
                    ((kuz) obj6).m14921i(4);
                    nxn nxnVar = (nxn) ivc.f32254c.m18137O();
                    if (!nxnVar.f44974b.m18142ac()) {
                        nxnVar.mo18106p();
                    }
                    ivc ivcVar = (ivc) nxnVar.f44974b;
                    ivcVar.f32257b = 98;
                    ivcVar.f32256a |= 1;
                    ivc ivcVar2 = (ivc) nxnVar.mo18103l();
                    nxn nxnVar2 = (nxn) ivc.f32254c.m18137O();
                    if (!nxnVar2.f44974b.m18142ac()) {
                        nxnVar2.mo18106p();
                    }
                    ivc ivcVar3 = (ivc) nxnVar2.f44974b;
                    ivcVar3.f32257b = 348;
                    ivcVar3.f32256a |= 1;
                    ktz ktzVar = ivd.f32259a;
                    nxl nxlVarM18137O = ive.f32260c.m18137O();
                    if (!nxlVarM18137O.f44974b.m18142ac()) {
                        nxlVarM18137O.mo18106p();
                    }
                    ive iveVar = (ive) nxlVarM18137O.f44974b;
                    iveVar.f32262a = 1 | iveVar.f32262a;
                    iveVar.f32263b = 2;
                    nxnVar2.m18119aJ(ktzVar, (ive) nxlVarM18137O.mo18103l());
                    ivc ivcVar4 = (ivc) nxnVar2.mo18103l();
                    iuw iuwVar2 = ((kuz) obj6).f37275j;
                    lle.m15694n(iuwVar2);
                    iuwVar2.m11800e(ivcVar2.mo17760J());
                    iuw iuwVar3 = ((kuz) obj6).f37275j;
                    lle.m15694n(iuwVar3);
                    iuwVar3.m11800e(ivcVar4.mo17760J());
                    return;
                } catch (RemoteException e3) {
                    Log.w("LensServiceConnImpl", "Failed to call client event callbacks.", e3);
                    kuzVar.m14920h();
                    return;
                }
            case 12:
                ?? r2 = this.f35670b;
                Object obj8 = this.f35669a;
                try {
                    Parcel parcelM3398a = ((cbq) obj8).m3398a();
                    parcelM3398a.writeString("LENS_SERVICE_SESSION");
                    cbs.m3405d(parcelM3398a, r2);
                    parcelM3398a.writeByteArray(null);
                    Parcel parcelM3399y = ((cbq) obj8).m3399y(1, parcelM3398a);
                    IBinder strongBinder = parcelM3399y.readStrongBinder();
                    if (strongBinder != null) {
                        IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.apps.gsa.publicsearch.IPublicSearchServiceSession");
                        iuwVar = iInterfaceQueryLocalInterface instanceof iuw ? (iuw) iInterfaceQueryLocalInterface : new iuw(strongBinder);
                    }
                    parcelM3399y.recycle();
                    ((kuz) r2).f37266a.execute(new kds((kuz) r2, iuwVar, i));
                    return;
                } catch (RemoteException e4) {
                    Log.w("LensServiceConnImpl", "Failed to create a Lens service session.", e4);
                    kuz kuzVar2 = (kuz) r2;
                    kuzVar2.f37266a.execute(new kxw(kuzVar2, 1));
                    return;
                }
            case 13:
                Object obj9 = this.f35669a;
                try {
                    this.f35670b.run();
                    return;
                } catch (Throwable th) {
                    synchronized (((kxy) obj9).f37688a.f37692c) {
                        Throwable th2 = ((kxy) obj9).f37688a.f37693d;
                        if (th2 != null) {
                            ((nbe) ((nbe) ((nbe) kxz.f37690a.m17251b()).mo17283h(th2)).mo17276G(4476)).mo17290o("Muxer: due to new exception discarding the following throwable");
                        }
                        ((kxy) obj9).f37688a.f37693d = th;
                        return;
                    }
                }
            case 14:
                ((kyc) this.f35670b).f37713d.add(this.f35669a);
                return;
            case 15:
                Object obj10 = this.f35669a;
                try {
                    mrm mrmVar = (mrm) kxk.m14973S(this.f35670b);
                    if (mrmVar.mo16813g()) {
                        kyc kycVar = (kyc) obj10;
                        if (kycVar.f37711b) {
                            Log.w("ConfigurableMux", WIxTIdUIdfb.AgS);
                            return;
                        } else {
                            kycVar.f37715f.m975c((float) ((Location) mrmVar.mo16809c()).getLatitude(), (float) ((Location) mrmVar.mo16809c()).getLongitude());
                            return;
                        }
                    }
                    return;
                } catch (Throwable th3) {
                    Log.e("ConfigurableMux", "Couldn't set location", th3);
                    return;
                }
            case 16:
                Object obj11 = this.f35669a;
                try {
                    this.f35670b.run();
                    return;
                } catch (Throwable th4) {
                    ((kyc) obj11).f37712c.mo8566a(new ExecutionException(th4));
                    return;
                }
            case 17:
                Object obj12 = this.f35669a;
                ?? r3 = this.f35670b;
                if (r3.isCancelled()) {
                    kyb kybVar = (kyb) obj12;
                    kybVar.f37709c.f37713d.remove(obj12);
                    try {
                        ((kyb) obj12).f37709c.m15047e();
                        return;
                    } catch (IOException e5) {
                        kybVar.f37709c.f37712c.mo8566a(e5);
                        return;
                    }
                }
                try {
                    MediaFormat mediaFormat = (MediaFormat) kxk.m14973S(r3);
                    kyb kybVar2 = (kyb) obj12;
                    kybVar2.f37708b = mrm.m16829i(kybVar2.f37709c.f37715f.m978f(kybVar2.f37707a, mediaFormat));
                    Integer numM203b = acm.m203b(mediaFormat);
                    if (numM203b != null) {
                        kybVar2.f37709c.f37715f.m974b(numM203b.intValue());
                        return;
                    }
                    return;
                } catch (ExecutionException e6) {
                    ((kyb) obj12).f37709c.f37712c.mo8566a(e6);
                    return;
                }
            case 18:
                try {
                    Object obj13 = this.f35669a;
                    ((kzp) obj13).f37777c.mo15092a(this.f35670b, ((kzp) obj13).f37779e, ((kzp) obj13).f37775a);
                    return;
                } catch (Throwable th5) {
                    ((kzp) this.f35669a).m15094a(th5);
                    return;
                }
            case 19:
                lav lavVar = ((kzq) this.f35669a).f37781a;
                Object obj14 = this.f35670b;
                kzr kzrVar = (kzr) obj14;
                kzrVar.f37786b = true;
                while (kzrVar.f37786b) {
                    try {
                        Runnable runnable = (Runnable) ((kzr) obj14).f37785a.take();
                        if (runnable != null) {
                            runnable.run();
                        }
                    } catch (InterruptedException e7) {
                        Log.w("BlockingEventLoop", "Event loop on " + String.valueOf(Thread.currentThread()) + " interrupted.");
                    }
                }
                ArrayList arrayList = new ArrayList(kzrVar.f37785a.size());
                kzrVar.f37785a.drainTo(arrayList);
                lavVar.m15130l(arrayList);
                return;
            default:
                Object obj15 = this.f35670b;
                Object obj16 = this.f35669a;
                lfl lflVar = (lfl) obj15;
                if (lflVar.f38139d.isDone()) {
                    Log.w("MuxerTrackStreamImpl", "WriteSampleData called after close called. Packet dropped.");
                    return;
                }
                lpe lpeVar = (lpe) obj16;
                if (((MediaCodec.BufferInfo) lpeVar.f38883b).size != 0 || (4 & ((MediaCodec.BufferInfo) lpeVar.f38883b).flags) == 0) {
                    lflVar.f38141f.add(obj16);
                } else {
                    lflVar.f38139d.mo14894e(null);
                }
                lflVar.m15281a();
                return;
        }
    }
}
