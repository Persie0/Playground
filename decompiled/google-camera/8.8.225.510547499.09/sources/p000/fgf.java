package p000;

import com.google.android.apps.camera.p014ui.captureframe.Tjcw.gBCSQzBeB;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class fgf implements nph {

    /* JADX INFO: renamed from: a */
    final /* synthetic */ Object f21817a;

    /* JADX INFO: renamed from: b */
    final /* synthetic */ Object f21818b;

    /* JADX INFO: renamed from: c */
    final /* synthetic */ Object f21819c;

    /* JADX INFO: renamed from: d */
    private final /* synthetic */ int f21820d;

    public fgf(fgh fghVar, fgg fggVar, drj drjVar, int i, byte[] bArr, byte[] bArr2) {
        this.f21820d = i;
        this.f21819c = fghVar;
        this.f21817a = fggVar;
        this.f21818b = drjVar;
    }

    public fgf(kbo kboVar, String str, String str2, int i) {
        this.f21820d = i;
        this.f21818b = kboVar;
        this.f21819c = str;
        this.f21817a = str2;
    }

    /* JADX WARN: Type inference failed for: r0v19, types: [java.lang.Object, kbo] */
    @Override // p000.nph
    /* JADX INFO: renamed from: a */
    public final void mo3810a(Throwable th) {
        switch (this.f21820d) {
            case 0:
                if (((fgg) this.f21817a).f21834n.mo8411b().isCancelled()) {
                    fgh.m8378k((fgg) this.f21817a, th, (drj) this.f21818b);
                    ((fgg) this.f21817a).f21830j.mo9917w(th);
                } else {
                    Object obj = this.f21819c;
                    fgh fghVar = (fgh) obj;
                    fghVar.m8383h((fgg) this.f21817a, th, (drj) this.f21818b);
                    ((fgg) this.f21817a).f21830j.mo9870B(ihd.f30944a, th);
                }
                ((fgh) this.f21819c).m8381c((fgg) this.f21817a);
                ((fgg) this.f21817a).f21836p = mqu.f41450a;
                break;
            default:
                this.f21818b.mo13948j((String) this.f21817a, th);
                break;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v21, types: [fmy, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r9v37, types: [java.lang.Object, kbo] */
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
    @Override // p000.nph
    /* JADX INFO: renamed from: b */
    public final void mo3811b(Object obj) {
        String str;
        switch (this.f21820d) {
            case 0:
                fil filVarM8463a = ((fgg) this.f21817a).f21824d.m8463a();
                if (filVarM8463a.f22121a == 0) {
                    ((nbe) ((nbe) fgh.f21843a.m17251b()).mo17276G(2186)).mo17293r("No key video frames in long shot. Shot=%s", ((fgg) this.f21817a).f21821a);
                    fgg fggVar = (fgg) this.f21817a;
                    boolean z = fggVar.f21835o && fggVar.f21836p.mo16813g();
                    String str2 = gBCSQzBeB.IpvAkdCrh;
                    if (!z) {
                        Object obj2 = this.f21819c;
                        fgg fggVar2 = (fgg) this.f21817a;
                        ((fgh) obj2).m8383h(fggVar2, new IllegalStateException(String.format(str2, fggVar2.f21821a)), (drj) this.f21818b);
                    }
                    ((fgh) this.f21819c).m8381c((fgg) this.f21817a);
                    if (z) {
                        if (((fgg) this.f21817a).f21836p.mo16813g()) {
                            ((fgh) this.f21819c).f21872x.m9425b(((bkn) ((fgg) this.f21817a).f21836p.mo16809c()).f3651a);
                            str = "No video frames available. Trigger backup shot.";
                        } else {
                            ((nbe) ((nbe) fgh.f21843a.m17252c()).mo17276G((char) 2188)).mo17290o("Didn't take second shot since UI resources are missing");
                            str = "No video frames available. Unable to trigger backup shot.";
                        }
                        ((fgg) this.f21817a).f21830j.mo9917w(new Throwable(str));
                    } else {
                        fgg fggVar3 = (fgg) this.f21817a;
                        fggVar3.f21830j.mo9870B(ihd.f30944a, new IllegalStateException(String.format(str2, fggVar3.f21821a)));
                    }
                } else {
                    ((fgh) this.f21819c).m8384j((fgg) this.f21817a, (drj) this.f21818b, filVarM8463a.f22124d - filVarM8463a.f22123c);
                }
                ((fgg) this.f21817a).f21836p = mqu.f41450a;
                break;
            default:
                this.f21818b.mo13944f((String) this.f21819c);
                break;
        }
    }
}
