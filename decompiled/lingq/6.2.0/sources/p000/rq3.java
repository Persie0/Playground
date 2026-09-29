package p000;

/* JADX INFO: loaded from: classes2.dex */
public final class rq3 {

    /* JADX INFO: renamed from: a */
    public final n8a f59704a;

    /* JADX INFO: renamed from: b */
    public long f59705b;

    /* JADX INFO: renamed from: c */
    public boolean f59706c;

    /* JADX INFO: renamed from: d */
    public int f59707d;

    /* JADX INFO: renamed from: e */
    public long f59708e;

    /* JADX INFO: renamed from: f */
    public boolean f59709f;

    /* JADX INFO: renamed from: g */
    public boolean f59710g;

    /* JADX INFO: renamed from: h */
    public boolean f59711h;

    /* JADX INFO: renamed from: i */
    public boolean f59712i;

    /* JADX INFO: renamed from: j */
    public boolean f59713j;

    /* JADX INFO: renamed from: k */
    public long f59714k;

    /* JADX INFO: renamed from: l */
    public long f59715l;

    /* JADX INFO: renamed from: m */
    public boolean f59716m;

    public rq3(n8a n8aVar) {
        this.f59704a = n8aVar;
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    /* JADX INFO: renamed from: a */
    public final void m20744a(int i) {
        long j = this.f59715l;
        if (j != -9223372036854775807L) {
            long j2 = this.f59705b;
            long j3 = this.f59714k;
            if (j2 == j3) {
                return;
            }
            int i2 = (int) (j2 - j3);
            this.f59704a.mo2531a(j, this.f59716m ? 1 : 0, i2, i, null);
        }
    }
}
