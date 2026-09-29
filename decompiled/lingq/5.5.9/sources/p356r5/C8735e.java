package p356r5;

import java.security.MessageDigest;
import p258m6.C7482b;

/* JADX INFO: renamed from: r5.e */
/* JADX INFO: loaded from: classes.dex */
public final class C8735e implements InterfaceC8732b {

    /* JADX INFO: renamed from: b */
    public final C7482b f46331b = new C7482b();

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$ArrayArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // p356r5.InterfaceC8732b
    /* JADX INFO: renamed from: b */
    public final void mo162b(MessageDigest messageDigest) {
        int i10 = 0;
        while (true) {
            C7482b c7482b = this.f46331b;
            if (i10 >= c7482b.f45619c) {
                return;
            }
            C8734d c8734d = (C8734d) c7482b.m16529h(i10);
            V vM16530m = this.f46331b.m16530m(i10);
            C8734d.b<T> bVar = c8734d.f46328b;
            if (c8734d.f46330d == null) {
                c8734d.f46330d = c8734d.f46329c.getBytes(InterfaceC8732b.f46324a);
            }
            bVar.mo6346a(c8734d.f46330d, vM16530m, messageDigest);
            i10++;
        }
    }

    /* JADX INFO: renamed from: c */
    public final <T> T m16963c(C8734d<T> c8734d) {
        C7482b c7482b = this.f46331b;
        return c7482b.containsKey(c8734d) ? (T) c7482b.getOrDefault(c8734d, null) : c8734d.f46327a;
    }

    @Override // p356r5.InterfaceC8732b
    public final boolean equals(Object obj) {
        if (obj instanceof C8735e) {
            return this.f46331b.equals(((C8735e) obj).f46331b);
        }
        return false;
    }

    @Override // p356r5.InterfaceC8732b
    public final int hashCode() {
        return this.f46331b.hashCode();
    }

    public final String toString() {
        return "Options{values=" + this.f46331b + '}';
    }
}
