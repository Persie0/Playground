package p000;

import androidx.wear.ambient.AmbientDelegate;
import androidx.wear.ambient.AmbientMode;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class awu extends ood implements omx {

    /* JADX INFO: renamed from: a */
    final /* synthetic */ Object f2613a;

    /* JADX INFO: renamed from: b */
    final /* synthetic */ Object f2614b;

    /* JADX INFO: renamed from: c */
    private final /* synthetic */ int f2615c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public awu(aww awwVar, aea aeaVar, int i) {
        super(0);
        this.f2615c = i;
        this.f2613a = awwVar;
        this.f2614b = aeaVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public awu(mbb mbbVar, lxm lxmVar, int i) {
        super(0);
        this.f2615c = i;
        this.f2613a = mbbVar;
        this.f2614b = lxmVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public awu(ouh ouhVar, AmbientDelegate ambientDelegate, int i, byte[] bArr) {
        super(0);
        this.f2615c = i;
        this.f2613a = ouhVar;
        this.f2614b = ambientDelegate;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v5, types: [java.lang.Object, ouh] */
    /* JADX WARN: Type inference failed for: r1v0, types: [aea, java.lang.Object] */
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
    @Override // p000.omx
    /* JADX INFO: renamed from: a */
    public final /* synthetic */ Object mo2077a() {
        switch (this.f2615c) {
            case 0:
                ((aww) this.f2613a).f2620a.mo2079b(this.f2614b);
                return oki.f46196a;
            case 1:
                otu.m19066b(this.f2613a.mo19057s(new C1035ue((AmbientDelegate) this.f2614b, null)));
                return oki.f46196a;
            default:
                return ((AmbientMode.AmbientController) ((mbb) this.f2613a).f39761b).m1646s((lxm) this.f2614b);
        }
    }
}
