package tn;

import cm.InterfaceC2052l;
import dm.C5207g;
import jo.C6530b;
import kotlin.jvm.internal.Ref$ObjectRef;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor;

/* JADX INFO: renamed from: tn.b */
/* JADX INFO: loaded from: classes2.dex */
public final class C9345b extends C6530b.a<CallableMemberDescriptor, CallableMemberDescriptor> {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ Ref$ObjectRef<CallableMemberDescriptor> f48078a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ InterfaceC2052l<CallableMemberDescriptor, Boolean> f48079b;

    /* JADX WARN: Multi-variable type inference failed */
    public C9345b(Ref$ObjectRef<CallableMemberDescriptor> ref$ObjectRef, InterfaceC2052l<? super CallableMemberDescriptor, Boolean> interfaceC2052l) {
        this.f48078a = ref$ObjectRef;
        this.f48079b = interfaceC2052l;
    }

    @Override // jo.C6530b.c
    /* JADX INFO: renamed from: a */
    public final Object mo11208a() {
        return this.f48078a.f38127a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v1, types: [T, java.lang.Object, kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor] */
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
    @Override // jo.C6530b.a, jo.C6530b.c
    /* JADX INFO: renamed from: b */
    public final void mo13113b(Object obj) {
        ?? r10 = (CallableMemberDescriptor) obj;
        C5207g.m11111f(r10, "current");
        Ref$ObjectRef<CallableMemberDescriptor> ref$ObjectRef = this.f48078a;
        if (ref$ObjectRef.f38127a == null && ((Boolean) this.f48079b.mo528n(r10)).booleanValue()) {
            ref$ObjectRef.f38127a = r10;
        }
    }

    @Override // jo.C6530b.c
    /* JADX INFO: renamed from: c */
    public final boolean mo11209c(Object obj) {
        C5207g.m11111f((CallableMemberDescriptor) obj, "current");
        return this.f48078a.f38127a == null;
    }
}
