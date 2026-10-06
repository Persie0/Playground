package p000;

import java.util.Collection;
import java.util.Comparator;
import java.util.NavigableSet;
import java.util.Set;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class nbb extends mzf implements naf {
    private static final long serialVersionUID = 0;

    /* JADX INFO: renamed from: d */
    private transient nbb f41932d;

    public nbb(naf nafVar) {
        super(nafVar);
    }

    @Override // p000.mzf, p000.mvl, p000.mvq
    /* JADX INFO: renamed from: a */
    protected final /* synthetic */ Object mo3817b() {
        return this.f41836a;
    }

    @Override // p000.mzf, p000.mvp, p000.mvl
    /* JADX INFO: renamed from: b */
    protected final /* synthetic */ Collection mo3817b() {
        return this.f41836a;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [myy, naf] */
    @Override // p000.mzf
    /* JADX INFO: renamed from: c */
    public final /* bridge */ /* synthetic */ Set mo17164c() {
        return mpw.m16751C(this.f41836a.mo16920f());
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [myy, naf] */
    @Override // p000.naf, p000.nae
    public final Comparator comparator() {
        return this.f41836a.comparator();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [myy, naf] */
    @Override // p000.naf
    /* JADX INFO: renamed from: j */
    public final myx mo16928j() {
        return this.f41836a.mo16928j();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [myy, naf] */
    @Override // p000.naf
    /* JADX INFO: renamed from: k */
    public final myx mo16929k() {
        return this.f41836a.mo16929k();
    }

    @Override // p000.naf
    /* JADX INFO: renamed from: l */
    public final myx mo16930l() {
        throw new UnsupportedOperationException();
    }

    @Override // p000.naf
    /* JADX INFO: renamed from: m */
    public final myx mo16931m() {
        throw new UnsupportedOperationException();
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [myy, naf] */
    @Override // p000.naf
    /* JADX INFO: renamed from: n */
    public final naf mo16932n() {
        nbb nbbVar = this.f41932d;
        if (nbbVar != null) {
            return nbbVar;
        }
        nbb nbbVar2 = new nbb(this.f41836a.mo16932n());
        nbbVar2.f41932d = this;
        this.f41932d = nbbVar2;
        return nbbVar2;
    }

    @Override // p000.mzf, p000.mvp
    /* JADX INFO: renamed from: o */
    protected final /* synthetic */ myy mo3817b() {
        return this.f41836a;
    }

    @Override // p000.mzf, p000.mvp, p000.myy
    /* JADX INFO: renamed from: p */
    public final NavigableSet mo16920f() {
        return (NavigableSet) super.mo16920f();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [myy, naf] */
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
    @Override // p000.naf
    /* JADX INFO: renamed from: q */
    public final naf mo16935q(Object obj, int i, Object obj2, int i2) {
        return mkv.m16555t(this.f41836a.mo16935q(obj, i, obj2, i2));
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [myy, naf] */
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
    @Override // p000.naf
    /* JADX INFO: renamed from: r */
    public final naf mo17016r(Object obj, int i) {
        return mkv.m16555t(this.f41836a.mo17016r(obj, i));
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [myy, naf] */
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
    @Override // p000.naf
    /* JADX INFO: renamed from: s */
    public final naf mo17017s(Object obj, int i) {
        return mkv.m16555t(this.f41836a.mo17017s(obj, i));
    }
}
