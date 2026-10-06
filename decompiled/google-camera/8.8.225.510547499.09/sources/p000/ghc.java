package p000;

import android.graphics.Bitmap;
import android.util.Pair;
import com.google.android.libraries.camera.jni.yuv.YuvUtilNative;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class ghc implements Runnable {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ Object f24726a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Object f24727b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ Object f24728c;

    /* JADX INFO: renamed from: d */
    private final /* synthetic */ int f24729d;

    public /* synthetic */ ghc(gni gniVar, gnj gnjVar, eem eemVar, int i) {
        this.f24729d = i;
        this.f24726a = gniVar;
        this.f24728c = gnjVar;
        this.f24727b = eemVar;
    }

    public /* synthetic */ ghc(gnm gnmVar, eem eemVar, key keyVar, int i) {
        this.f24729d = i;
        this.f24726a = gnmVar;
        this.f24727b = eemVar;
        this.f24728c = keyVar;
    }

    public /* synthetic */ ghc(gns gnsVar, eem eemVar, gnr gnrVar, int i) {
        this.f24729d = i;
        this.f24728c = gnsVar;
        this.f24727b = eemVar;
        this.f24726a = gnrVar;
    }

    public /* synthetic */ ghc(gny gnyVar, kpw kpwVar, eem eemVar, int i) {
        this.f24729d = i;
        this.f24726a = gnyVar;
        this.f24728c = kpwVar;
        this.f24727b = eemVar;
    }

    public /* synthetic */ ghc(guk gukVar, kfk kfkVar, jvb jvbVar, int i) {
        this.f24729d = i;
        this.f24727b = gukVar;
        this.f24728c = kfkVar;
        this.f24726a = jvbVar;
    }

    public /* synthetic */ ghc(jvb jvbVar, drj drjVar, kfk kfkVar, int i, byte[] bArr, byte[] bArr2) {
        this.f24729d = i;
        this.f24726a = jvbVar;
        this.f24727b = drjVar;
        this.f24728c = kfkVar;
    }

    public /* synthetic */ ghc(mrm mrmVar, kfc kfcVar, mrm mrmVar2, int i) {
        this.f24729d = i;
        this.f24726a = mrmVar;
        this.f24727b = kfcVar;
        this.f24728c = mrmVar2;
    }

    /* JADX WARN: Code duplicated, block: B:33:0x0109  */
    /* JADX WARN: Code duplicated, block: B:69:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v21, types: [gyh, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v15, types: [java.lang.Object, kpw] */
    /* JADX WARN: Type inference failed for: r1v2, types: [java.lang.Object, jww] */
    /* JADX WARN: Type inference failed for: r1v4, types: [java.lang.Object, kfk] */
    /* JADX WARN: Type inference failed for: r1v6, types: [java.lang.Object, kfc] */
    /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.Object, kfk] */
    /* JADX WARN: Type inference failed for: r2v10, types: [java.lang.Object, key] */
    /* JADX WARN: Type inference failed for: r2v20, types: [gyh, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v15, types: [gyh, java.lang.Object] */
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
        switch (this.f24729d) {
            case 0:
                Object obj = this.f24726a;
                jvb jvbVar = (jvb) obj;
                jvbVar.m13537d(((drj) this.f24727b).f12399e.mo3830a(new gcu((kfk) this.f24728c, 17), not.INSTANCE));
                return;
            case 1:
                Object obj2 = this.f24727b;
                ?? r1 = this.f24728c;
                Object obj3 = this.f24726a;
                guk gukVar = (guk) obj2;
                if (!gukVar.f26433a || ivw.f32421g == null) {
                    return;
                }
                ccr ccrVar = new ccr(gukVar, r1);
                gukVar.m9776a(ccrVar);
                ((jvb) obj3).m13537d(new eip(gukVar, ccrVar, 20));
                return;
            case 2:
                Object obj4 = this.f24726a;
                ((ipp) ((mrm) obj4).mo16809c()).mo11590a(this.f24727b, (kgg) ((mrm) this.f24728c).mo16809c());
                return;
            case 3:
                Object obj5 = this.f24726a;
                gni gniVar = (gni) obj5;
                gniVar.m9552k((gnj) this.f24728c, (eem) this.f24727b);
                return;
            case 4:
                Object obj6 = this.f24726a;
                Object obj7 = this.f24727b;
                ?? r2 = this.f24728c;
                Pair pair = null;
                try {
                    try {
                        kfv.m14171t(r2);
                        gmc gmcVarM9784a = ((gnm) obj6).f25764m.m9784a(r2);
                        kpw kpwVarM9496e = gmcVarM9784a.m9496e();
                        kpp kppVarMo7042c = r2.mo7042c();
                        if (kpwVarM9496e != null && kppVarMo7042c != null) {
                            Bitmap bitmapMo7129D = ((ecq) ((gnm) obj6).f25753b.get()).mo7129D(gmcVarM9784a.m9492a().mo14193c(), kpwVarM9496e, kppVarMo7042c, ((gnm) obj6).f25763l.f13252g, ((eem) obj7).f13667n, mrm.m16829i(((gnm) obj6).f25754c), mrm.m16829i(Integer.valueOf(((gnm) obj6).f25759h)), mrm.m16829i(Integer.valueOf(((gnm) obj6).f25760i)));
                            kpwVarM9496e.close();
                            if (bitmapMo7129D != null) {
                                synchronized (obj6) {
                                    if (((gnm) obj6).f25761j) {
                                        int iM3564b = cem.m3564b(((fua) ((eem) obj7).f13675v.f25503d).f23573a, ((gnm) obj6).f25755d, ((gnm) obj6).f25762k, ((gnm) obj6).f25757f, ((gnm) obj6).f25756e);
                                        Pair pair2 = new Pair(imq.m11478a(bitmapMo7129D, iM3564b), Integer.valueOf(iM3564b));
                                        r2.close();
                                        pair = pair2;
                                    } else {
                                        bitmapMo7129D.recycle();
                                    }
                                }
                            }
                            if (pair != null) {
                                ((eem) obj7).f13675v.f25502c.mo9894Z((Bitmap) pair.first, ((Integer) pair.second).intValue());
                                return;
                            }
                            return;
                        }
                        ((nbe) ((nbe) gnm.f25752a.m17251b()).mo17276G(3052)).mo17290o("Error getting the required input.");
                    } catch (InterruptedException e) {
                        Thread.currentThread().interrupt();
                        ((nbe) ((nbe) gnm.f25752a.m17251b()).mo17276G(3053)).mo17290o("Error generating on-demand preview image");
                    }
                    r2.close();
                    if (pair != null) {
                        ((eem) obj7).f13675v.f25502c.mo9894Z((Bitmap) pair.first, ((Integer) pair.second).intValue());
                        return;
                    }
                    return;
                } catch (Throwable th) {
                    r2.close();
                    throw th;
                }
            case 5:
                Object obj8 = this.f24728c;
                gns gnsVar = (gns) obj8;
                gnsVar.m9566k((eem) this.f24727b, (gnr) this.f24726a);
                return;
            default:
                Object obj9 = this.f24726a;
                ?? r3 = this.f24728c;
                Object obj10 = this.f24727b;
                try {
                    ((gny) obj9).f25823c.mo13961e("ThumbnailProcessor#processBaseFrameImage");
                    ((gny) obj9).f25823c.mo13961e("convert");
                    Bitmap bitmapM4697a = YuvUtilNative.m4697a(r3);
                    ((gny) obj9).f25823c.mo13963g("flip");
                    int iM3564b2 = cem.m3564b(((fua) ((eem) obj10).f13675v.f25503d).f23573a, ((gny) obj9).f25824d, ((gny) obj9).f25829i, ((gny) obj9).f25828h, ((gny) obj9).f25825e);
                    gvw gvwVar = ((gny) obj9).f25822b;
                    bitmapM4697a.getClass();
                    Bitmap bitmapMo9806b = gvwVar.mo9806b(bitmapM4697a, iM3564b2, ((gny) obj9).f25829i.mo14558k());
                    ebn ebnVar = (ebn) ((gny) obj9).f25827g.get(((eem) obj10).f13675v.f25502c.mo9902h());
                    if (ebnVar != null && ebnVar.f13255j) {
                        bitmapMo9806b = dst.m6666a((dsl) ((gny) obj9).f25826f.get(), bitmapMo9806b, mqu.f41450a);
                    }
                    ((gny) obj9).f25823c.mo13963g("updateIndicator");
                    if (true == ((gny) obj9).f25822b.mo9812h(((gny) obj9).f25829i.mo14558k())) {
                        iM3564b2 = 0;
                    }
                    ((eem) obj10).f13675v.f25502c.mo9892X(bitmapMo9806b, iM3564b2);
                    return;
                } finally {
                    r3.close();
                    gny gnyVar = (gny) obj9;
                    gnyVar.f25823c.mo13962f();
                    gnyVar.f25823c.mo13962f();
                }
        }
    }
}
