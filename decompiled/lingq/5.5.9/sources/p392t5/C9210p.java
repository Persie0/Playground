package p392t5;

import com.bumptech.glide.load.data.InterfaceC2097d;
import com.bumptech.glide.load.engine.C2123i;
import com.bumptech.glide.load.engine.InterfaceC2117c;
import p356r5.InterfaceC8732b;
import p474x5.InterfaceC10090o;

/* JADX INFO: renamed from: t5.p */
/* JADX INFO: loaded from: classes.dex */
public final class C9210p implements InterfaceC2097d.a<Object> {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ InterfaceC10090o.a f47780a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C2123i f47781b;

    public C9210p(C2123i c2123i, InterfaceC10090o.a aVar) {
        this.f47781b = c2123i;
        this.f47780a = aVar;
    }

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
    @Override // com.bumptech.glide.load.data.InterfaceC2097d.a
    /* JADX INFO: renamed from: c */
    public final void mo6277c(Exception exc) {
        C2123i c2123i = this.f47781b;
        InterfaceC10090o.a<?> aVar = this.f47780a;
        InterfaceC10090o.a<?> aVar2 = c2123i.f10795f;
        if (aVar2 != null && aVar2 == aVar) {
            C2123i c2123i2 = this.f47781b;
            InterfaceC10090o.a aVar3 = this.f47780a;
            InterfaceC2117c.a aVar4 = c2123i2.f10791b;
            InterfaceC8732b interfaceC8732b = c2123i2.f10796g;
            InterfaceC2097d<Data> interfaceC2097d = aVar3.f51181c;
            aVar4.mo6282f(interfaceC8732b, exc, interfaceC2097d, interfaceC2097d.mo6274d());
        }
    }

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
    @Override // com.bumptech.glide.load.data.InterfaceC2097d.a
    /* JADX INFO: renamed from: f */
    public final void mo6278f(Object obj) {
        C2123i c2123i = this.f47781b;
        InterfaceC10090o.a<?> aVar = this.f47780a;
        InterfaceC10090o.a<?> aVar2 = c2123i.f10795f;
        if (aVar2 != null && aVar2 == aVar) {
            C2123i c2123i2 = this.f47781b;
            InterfaceC10090o.a aVar3 = this.f47780a;
            AbstractC9200f abstractC9200f = c2123i2.f10790a.f10712p;
            if (obj != null && abstractC9200f.mo17539c(aVar3.f51181c.mo6274d())) {
                c2123i2.f10794e = obj;
                c2123i2.f10791b.mo6283g();
            } else {
                InterfaceC2117c.a aVar4 = c2123i2.f10791b;
                InterfaceC8732b interfaceC8732b = aVar3.f51179a;
                InterfaceC2097d<Data> interfaceC2097d = aVar3.f51181c;
                aVar4.mo6284i(interfaceC8732b, obj, interfaceC2097d, interfaceC2097d.mo6274d(), c2123i2.f10796g);
            }
        }
    }
}
