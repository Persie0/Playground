package p000;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class dqm implements Runnable {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ dqv f12330a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ boolean f12331b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ oju f12332c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ boolean f12333d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ oju f12334e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ Object f12335f;

    /* JADX INFO: renamed from: g */
    private final /* synthetic */ int f12336g;

    public /* synthetic */ dqm(dqv dqvVar, jww jwwVar, boolean z, oju ojuVar, boolean z2, oju ojuVar2, int i) {
        this.f12336g = i;
        this.f12330a = dqvVar;
        this.f12335f = jwwVar;
        this.f12331b = z;
        this.f12332c = ojuVar;
        this.f12333d = z2;
        this.f12334e = ojuVar2;
    }

    public /* synthetic */ dqm(fvu fvuVar, dqv dqvVar, boolean z, oju ojuVar, boolean z2, oju ojuVar2, int i) {
        this.f12336g = i;
        this.f12335f = fvuVar;
        this.f12330a = dqvVar;
        this.f12331b = z;
        this.f12332c = ojuVar;
        this.f12333d = z2;
        this.f12334e = ojuVar2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v5, types: [java.lang.Object, jww] */
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
        switch (this.f12336g) {
            case 0:
                Object obj = this.f12335f;
                dqv dqvVar = this.f12330a;
                boolean z = this.f12331b;
                oju ojuVar = this.f12332c;
                boolean z2 = this.f12333d;
                oju ojuVar2 = this.f12334e;
                kmq kmqVarMo14558k = ((kmr) obj).mo14558k();
                dqvVar.m6609f(kmqVarMo14558k);
                if (z) {
                    ((dqv) ojuVar.get()).m6609f(kmqVarMo14558k);
                }
                if (z2) {
                    ((dqv) ojuVar2.get()).m6609f(kmqVarMo14558k);
                }
                break;
            default:
                dqv dqvVar2 = this.f12330a;
                ?? r1 = this.f12335f;
                boolean z3 = this.f12331b;
                oju ojuVar3 = this.f12332c;
                boolean z4 = this.f12333d;
                oju ojuVar4 = this.f12334e;
                dqvVar2.m6608e(r1);
                if (z3) {
                    ((dqv) ojuVar3.get()).m6608e(r1);
                }
                if (z4) {
                    ((dqv) ojuVar4.get()).m6608e(r1);
                }
                break;
        }
    }
}
