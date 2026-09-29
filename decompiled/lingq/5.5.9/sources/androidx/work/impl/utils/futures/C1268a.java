package androidx.work.impl.utils.futures;

import p532zd.InterfaceFutureC10478a;

/* JADX INFO: renamed from: androidx.work.impl.utils.futures.a */
/* JADX INFO: loaded from: classes.dex */
public final class C1268a<V> extends AbstractFuture<V> {
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
    /* JADX INFO: renamed from: i */
    public final boolean m4766i(V v10) {
        if (v10 == null) {
            v10 = (V) AbstractFuture.f7923g;
        }
        if (!AbstractFuture.f7922f.mo4762b(this, null, v10)) {
            return false;
        }
        AbstractFuture.m4754b(this);
        return true;
    }

    /* JADX INFO: renamed from: j */
    public final boolean m4767j(Throwable th2) {
        th2.getClass();
        if (!AbstractFuture.f7922f.mo4762b(this, null, new AbstractFuture.Failure(th2))) {
            return false;
        }
        AbstractFuture.m4754b(this);
        return true;
    }

    /* JADX WARN: Code duplicated, block: B:23:0x005b  */
    /* JADX INFO: renamed from: k */
    public final boolean m4768k(InterfaceFutureC10478a<? extends V> interfaceFutureC10478a) {
        AbstractFuture.Failure failure;
        interfaceFutureC10478a.getClass();
        Object obj = this.f7924a;
        if (obj == null) {
            if (interfaceFutureC10478a.isDone()) {
                if (AbstractFuture.f7922f.mo4762b(this, null, AbstractFuture.m4756e(interfaceFutureC10478a))) {
                    AbstractFuture.m4754b(this);
                }
            } else {
                AbstractFuture.RunnableC1265e runnableC1265e = new AbstractFuture.RunnableC1265e(this, interfaceFutureC10478a);
                if (AbstractFuture.f7922f.mo4762b(this, null, runnableC1265e)) {
                    try {
                        interfaceFutureC10478a.mo2629f(runnableC1265e, DirectExecutor.INSTANCE);
                    } catch (Throwable th2) {
                        try {
                            failure = new AbstractFuture.Failure(th2);
                        } catch (Throwable unused) {
                            failure = AbstractFuture.Failure.f7927b;
                        }
                        AbstractFuture.f7922f.mo4762b(this, runnableC1265e, failure);
                    }
                } else {
                    obj = this.f7924a;
                    if (obj instanceof AbstractFuture.C1262b) {
                        interfaceFutureC10478a.cancel(((AbstractFuture.C1262b) obj).f7931a);
                    }
                }
            }
            return true;
        }
        if (obj instanceof AbstractFuture.C1262b) {
            interfaceFutureC10478a.cancel(((AbstractFuture.C1262b) obj).f7931a);
        }
        return false;
    }
}
