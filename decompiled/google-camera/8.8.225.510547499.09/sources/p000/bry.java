package p000;

import java.io.File;
import java.util.List;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class bry implements bsb, bqz {

    /* JADX INFO: renamed from: a */
    private final List f4244a;

    /* JADX INFO: renamed from: b */
    private final bsc f4245b;

    /* JADX INFO: renamed from: c */
    private final bsa f4246c;

    /* JADX INFO: renamed from: d */
    private int f4247d = -1;

    /* JADX INFO: renamed from: e */
    private bqn f4248e;

    /* JADX INFO: renamed from: f */
    private List f4249f;

    /* JADX INFO: renamed from: g */
    private int f4250g;

    /* JADX INFO: renamed from: h */
    private File f4251h;

    /* JADX INFO: renamed from: i */
    private volatile C1058va f4252i;

    public bry(List list, bsc bscVar, bsa bsaVar) {
        this.f4244a = list;
        this.f4245b = bscVar;
        this.f4246c = bsaVar;
    }

    /* JADX INFO: renamed from: d */
    private final boolean m2965d() {
        return this.f4250g < this.f4249f.size();
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [bra, java.lang.Object] */
    @Override // p000.bsb
    /* JADX INFO: renamed from: a */
    public final void mo2966a() {
        C1058va c1058va = this.f4252i;
        if (c1058va != null) {
            c1058va.f47802a.mo2937aY();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v0, types: [bra, java.lang.Object] */
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
    @Override // p000.bqz
    /* JADX INFO: renamed from: b */
    public final void mo2945b(Object obj) {
        this.f4246c.mo2969d(this.f4248e, obj, this.f4252i.f47802a, 3, this.f4248e);
    }

    /* JADX WARN: Type inference failed for: r0v20, types: [bra, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v5, types: [bra, java.lang.Object] */
    @Override // p000.bsb
    /* JADX INFO: renamed from: c */
    public final boolean mo2967c() {
        while (true) {
            boolean z = false;
            if (this.f4249f != null && m2965d()) {
                this.f4252i = null;
                while (!z && m2965d()) {
                    List list = this.f4249f;
                    int i = this.f4250g;
                    this.f4250g = i + 1;
                    bvl bvlVar = (bvl) list.get(i);
                    File file = this.f4251h;
                    bsc bscVar = this.f4245b;
                    this.f4252i = bvlVar.mo3084b(file, bscVar.f4280e, bscVar.f4281f, bscVar.f4283h);
                    if (this.f4252i != null && this.f4245b.m2977h(this.f4252i.f47802a.mo2934a())) {
                        this.f4252i.f47802a.mo2941f(this.f4245b.f4289n, this);
                        z = true;
                    }
                }
                return z;
            }
            int i2 = this.f4247d + 1;
            this.f4247d = i2;
            if (i2 >= this.f4244a.size()) {
                return false;
            }
            bqn bqnVar = (bqn) this.f4244a.get(this.f4247d);
            bsc bscVar2 = this.f4245b;
            File fileMo3068a = bscVar2.m2973d().mo3068a(new brz(bqnVar, bscVar2.f4288m));
            this.f4251h = fileMo3068a;
            if (fileMo3068a != null) {
                this.f4248e = bqnVar;
                this.f4249f = this.f4245b.m2976g(fileMo3068a);
                this.f4250g = 0;
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v1, types: [bra, java.lang.Object] */
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
    @Override // p000.bqz
    /* JADX INFO: renamed from: e */
    public final void mo2946e(Exception exc) {
        this.f4246c.mo2968b(this.f4248e, exc, this.f4252i.f47802a, 3);
    }
}
