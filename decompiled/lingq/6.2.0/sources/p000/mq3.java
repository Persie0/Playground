package p000;

/* JADX INFO: loaded from: classes2.dex */
public final class mq3 {

    /* JADX INFO: renamed from: a */
    public final n8a f51718a;

    /* JADX INFO: renamed from: b */
    public boolean f51719b;

    /* JADX INFO: renamed from: c */
    public boolean f51720c;

    /* JADX INFO: renamed from: d */
    public boolean f51721d;

    /* JADX INFO: renamed from: e */
    public int f51722e;

    /* JADX INFO: renamed from: f */
    public int f51723f;

    /* JADX INFO: renamed from: g */
    public long f51724g;

    /* JADX INFO: renamed from: h */
    public long f51725h;

    public mq3(n8a n8aVar) {
        this.f51718a = n8aVar;
    }

    /* JADX INFO: renamed from: a */
    public final void m16995a(byte[] bArr, int i, int i2) {
        if (this.f51720c) {
            int i3 = this.f51723f;
            int i4 = (i + 1) - i3;
            if (i4 >= i2) {
                this.f51723f = (i2 - i) + i3;
            } else {
                this.f51721d = ((bArr[i4] & 192) >> 6) == 0;
                this.f51720c = false;
            }
        }
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
    /* JADX INFO: renamed from: b */
    public final void m16996b(int i, long j, boolean z) {
        bna.m3987z(this.f51725h != -9223372036854775807L);
        if (this.f51722e == 182 && z && this.f51719b) {
            this.f51718a.mo2531a(this.f51725h, this.f51721d ? 1 : 0, (int) (j - this.f51724g), i, null);
        }
        if (this.f51722e != 179) {
            this.f51724g = j;
        }
    }
}
