package p000;

import android.graphics.SurfaceTexture;
import android.hardware.camera2.CameraManager;
import android.view.View;
import androidx.wear.ambient.AmbientModeSupport;
import com.google.android.libraries.vision.opengl.Texture;
import java.util.Collections;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class eip implements kba {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ Object f14166a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Object f14167b;

    /* JADX INFO: renamed from: c */
    private final /* synthetic */ int f14168c;

    public /* synthetic */ eip(bkn bknVar, bkn bknVar2, int i, byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4, byte[] bArr5, byte[] bArr6) {
        this.f14168c = i;
        this.f14167b = bknVar;
        this.f14166a = bknVar2;
    }

    public /* synthetic */ eip(eby ebyVar, ebx ebxVar, int i) {
        this.f14168c = i;
        this.f14167b = ebyVar;
        this.f14166a = ebxVar;
    }

    public /* synthetic */ eip(eju ejuVar, SurfaceTexture surfaceTexture, int i) {
        this.f14168c = i;
        this.f14167b = ejuVar;
        this.f14166a = surfaceTexture;
    }

    public /* synthetic */ eip(elv elvVar, elw elwVar, int i) {
        this.f14168c = i;
        this.f14166a = elvVar;
        this.f14167b = elwVar;
    }

    public /* synthetic */ eip(elv elvVar, ely elyVar, int i) {
        this.f14168c = i;
        this.f14166a = elvVar;
        this.f14167b = elyVar;
    }

    public /* synthetic */ eip(esl eslVar, chg chgVar, int i) {
        this.f14168c = i;
        this.f14167b = eslVar;
        this.f14166a = chgVar;
    }

    public /* synthetic */ eip(frx frxVar, gyu gyuVar, int i) {
        this.f14168c = i;
        this.f14166a = frxVar;
        this.f14167b = gyuVar;
    }

    public /* synthetic */ eip(fvk fvkVar, fvj fvjVar, int i) {
        this.f14168c = i;
        this.f14167b = fvkVar;
        this.f14166a = fvjVar;
    }

    public /* synthetic */ eip(fws fwsVar, iek iekVar, int i, byte[] bArr) {
        this.f14168c = i;
        this.f14166a = fwsVar;
        this.f14167b = iekVar;
    }

    public /* synthetic */ eip(gdf gdfVar, kfc kfcVar, int i) {
        this.f14168c = i;
        this.f14166a = gdfVar;
        this.f14167b = kfcVar;
    }

    public /* synthetic */ eip(ges gesVar, AmbientModeSupport.AmbientController ambientController, int i, byte[] bArr, byte[] bArr2) {
        this.f14168c = i;
        this.f14167b = gesVar;
        this.f14166a = ambientController;
    }

    public eip(ggk ggkVar, kos kosVar, int i) {
        this.f14168c = i;
        this.f14166a = ggkVar;
        this.f14167b = kosVar;
    }

    public /* synthetic */ eip(guk gukVar, guj gujVar, int i) {
        this.f14168c = i;
        this.f14167b = gukVar;
        this.f14166a = gujVar;
    }

    public /* synthetic */ eip(gye gyeVar, ffh ffhVar, int i) {
        this.f14168c = i;
        this.f14167b = gyeVar;
        this.f14166a = ffhVar;
    }

    public /* synthetic */ eip(AtomicReference atomicReference, kba kbaVar, int i) {
        this.f14168c = i;
        this.f14167b = atomicReference;
        this.f14166a = kbaVar;
    }

    public /* synthetic */ eip(kfc kfcVar, epf epfVar, int i) {
        this.f14168c = i;
        this.f14167b = kfcVar;
        this.f14166a = epfVar;
    }

    public /* synthetic */ eip(kfo kfoVar, kba kbaVar, int i) {
        this.f14168c = i;
        this.f14167b = kfoVar;
        this.f14166a = kbaVar;
    }

    public /* synthetic */ eip(mrm mrmVar, hsh hshVar, int i) {
        this.f14168c = i;
        this.f14167b = mrmVar;
        this.f14166a = hshVar;
    }

    public /* synthetic */ eip(oju ojuVar, glk glkVar, int i, byte[] bArr, byte[] bArr2, byte[] bArr3) {
        this.f14168c = i;
        this.f14167b = ojuVar;
        this.f14166a = glkVar;
    }

    public eip(C1058va c1058va, fzr fzrVar, int i, byte[] bArr, byte[] bArr2, byte[] bArr3) {
        this.f14168c = i;
        this.f14167b = c1058va;
        this.f14166a = fzrVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v16, types: [java.lang.Object, kfc] */
    /* JADX WARN: Type inference failed for: r0v21, types: [java.lang.Object, kfo] */
    /* JADX WARN: Type inference failed for: r0v22, types: [java.lang.Object, oju] */
    /* JADX WARN: Type inference failed for: r0v59, types: [java.lang.Object, kfb] */
    /* JADX WARN: Type inference failed for: r1v13, types: [java.lang.Object, kba] */
    /* JADX WARN: Type inference failed for: r1v17, types: [gyi, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v19, types: [java.lang.Object, kba] */
    /* JADX WARN: Type inference failed for: r1v24, types: [hsh, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v26, types: [java.lang.Object, kfc] */
    /* JADX WARN: Type inference failed for: r1v28, types: [java.lang.Object, kos] */
    /* JADX WARN: Type inference failed for: r1v29, types: [guj, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v3, types: [ebx, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v7, types: [elw, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v8, types: [elw, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v9, types: [java.lang.Object, kfb] */
    /* JADX WARN: Type inference failed for: r2v7, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r6v6, types: [java.lang.Object, java.util.Map] */
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
        switch (this.f14168c) {
            case 0:
                ((iek) this.f14167b).mo11144a((View) ((fws) this.f14166a).f23764a);
                return;
            case 1:
                ((eby) this.f14167b).m7096g(this.f14166a);
                return;
            case 2:
                Object obj = this.f14167b;
                ((SurfaceTexture) this.f14166a).release();
                eju ejuVar = (eju) obj;
                ejuVar.f14394e = null;
                Texture texture = ejuVar.f14393d;
                lku.m15662p(texture);
                texture.delete();
                ejuVar.f14395f.mo7390a();
                return;
            case 3:
                ((elv) this.f14166a).mo7489k((ely) this.f14167b);
                return;
            case 4:
                ((elv) this.f14166a).mo7485g(this.f14167b);
                return;
            case 5:
                ((elv) this.f14166a).mo7485g(this.f14167b);
                return;
            case 6:
                this.f14167b.mo9412l(this.f14166a);
                return;
            case 7:
                Object obj2 = this.f14167b;
                chg chgVar = (chg) this.f14166a;
                chgVar.f5731c = null;
                chgVar.f5734f.remove(((esl) obj2).f15326H);
                return;
            case 8:
                Object obj3 = this.f14167b;
                Object obj4 = this.f14166a;
                synchronized (obj3) {
                    ((bkn) obj3).f3651a.remove(obj4);
                    break;
                }
                return;
            case 9:
                ?? r0 = this.f14167b;
                ?? r1 = this.f14166a;
                int i = ffo.f21705d;
                r0.close();
                r1.close();
                return;
            case 10:
                ?? r2 = this.f14167b;
                Object obj5 = this.f14166a;
                ffq ffqVar = (ffq) r2.get();
                synchronized (ffqVar.f21724d) {
                    if (!ffqVar.f21722b.remove(obj5)) {
                        ((nbe) ((nbe) ffq.f21721a.m17252c()).mo17276G(2177)).mo17290o("Detaching perOneCamera resources that were not attached");
                    }
                    break;
                }
                return;
            case 11:
                Object obj6 = this.f14167b;
                ?? r3 = this.f14166a;
                ((gye) obj6).m9973h(r3);
                ffh ffhVar = (ffh) r3;
                if (ffhVar.f21617c.mo16813g()) {
                    ffhVar.f21615a.set(false);
                    ((hgo) ffhVar.f21617c.mo16809c()).mo10214i(ffhVar.f21619e);
                    ffhVar.f21618d.close();
                    return;
                }
                return;
            case 12:
                Object obj7 = this.f14167b;
                ?? r4 = this.f14166a;
                AtomicReference atomicReference = (AtomicReference) obj7;
                if (atomicReference.get() != null) {
                    ((kba) atomicReference.get()).close();
                }
                r4.close();
                return;
            case 13:
                Object obj8 = this.f14166a;
                Object obj9 = this.f14167b;
                synchronized (obj8) {
                    ((frx) obj8).f23378b.mo13940b("removing fallback shot: " + String.valueOf(obj9));
                    ((frx) obj8).f23382f.remove(obj9);
                    break;
                }
                return;
            case 14:
                ((fvk) this.f14167b).f23635a.unregisterAvailabilityCallback((CameraManager.AvailabilityCallback) this.f14166a);
                return;
            case 15:
                ((hrx) ((mrm) this.f14167b).mo16809c()).mo10661g(this.f14166a);
                return;
            case 16:
                Object obj10 = this.f14167b;
                Object obj11 = this.f14166a;
                synchronized (((C1058va) obj10).f47803b) {
                    Iterator it = ((fzr) obj11).f23992d.iterator();
                    while (it.hasNext()) {
                        ((C1058va) obj10).f47804c.remove((Long) it.next());
                    }
                    kxk.m14975U(kxk.m14962H(bkn.m2550K(Collections.unmodifiableMap(((fzr) obj11).f23991c).values()), bkn.m2550K(Collections.unmodifiableList(((fzr) obj11).f23995g))), new eog((bkn) ((C1058va) obj10).f47802a, (fzr) obj11, 7, null, null, null), not.INSTANCE);
                    break;
                }
                return;
            case 17:
                ?? r5 = this.f14166a;
                ?? r6 = this.f14167b;
                synchronized (((gdf) r5).f24285a) {
                    r6.mo9412l(r5);
                    ((gdf) r5).f24286b = false;
                    break;
                }
                return;
            case 18:
                ((ite) ((ges) this.f14167b).f24430g).f32105j.remove(this.f14166a);
                return;
            case 19:
                ((ggk) this.f14166a).f24675a.m14649c(this.f14167b);
                return;
            default:
                ((guk) this.f14167b).m9777b(this.f14166a);
                return;
        }
    }
}
