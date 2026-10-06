package p000;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class bso implements Runnable {

    /* JADX INFO: renamed from: a */
    final /* synthetic */ Object f4341a;

    /* JADX INFO: renamed from: b */
    private final /* synthetic */ int f4342b;

    /* JADX INFO: renamed from: c */
    private final Object f4343c;

    public bso(bsr bsrVar, cac cacVar, int i) {
        this.f4342b = i;
        this.f4341a = bsrVar;
        this.f4343c = cacVar;
    }

    public bso(jvi jviVar, Runnable runnable, int i) {
        this.f4342b = i;
        this.f4341a = jviVar;
        this.f4343c = runnable;
    }

    public bso(jvk jvkVar, Future future, int i) {
        this.f4342b = i;
        this.f4341a = jvkVar;
        this.f4343c = future;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object, java.util.concurrent.Future] */
    /* JADX WARN: Type inference failed for: r0v5, types: [java.lang.Object, java.lang.Runnable] */
    /* JADX WARN: Type inference failed for: r0v6, types: [cac, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v8, types: [cac, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v3, types: [cac, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v4, types: [cac, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v6, types: [cac, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v7, types: [cac, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v8, types: [cac, java.lang.Object] */
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
        switch (this.f4342b) {
            case 0:
                synchronized (this.f4343c.mo3348a()) {
                    synchronized (this.f4341a) {
                        if (((bsr) this.f4341a).f4347a.m3003d(this.f4343c)) {
                            ((bsr) this.f4341a).f4355i.m3017d();
                            Object obj = this.f4341a;
                            try {
                                this.f4343c.mo3350e(((bsr) obj).f4355i, ((bsr) obj).f4357k);
                                ((bsr) this.f4341a).m3011g(this.f4343c);
                            } catch (Throwable th) {
                                throw new brx(th);
                            }
                        }
                        ((bsr) this.f4341a).m3008c();
                    }
                }
                return;
            case 1:
                synchronized (this.f4343c.mo3348a()) {
                    synchronized (this.f4341a) {
                        if (((bsr) this.f4341a).f4347a.m3003d(this.f4343c)) {
                            Object obj2 = this.f4341a;
                            try {
                                this.f4343c.mo3349d(((bsr) obj2).f4353g);
                            } catch (Throwable th2) {
                                throw new brx(th2);
                            }
                        }
                        ((bsr) this.f4341a).m3008c();
                        break;
                    }
                }
                return;
            case 2:
                try {
                    this.f4343c.run();
                    return;
                } catch (Throwable th3) {
                    ((jvi) this.f4341a).f34888b.execute(new juz(th3, 2));
                    return;
                }
            default:
                try {
                    kxk.m14973S(this.f4343c);
                    return;
                } catch (ExecutionException e) {
                    ((jvk) this.f4341a).f34890a.execute(new juz(e, 3));
                    return;
                } catch (Throwable th4) {
                    ((jvk) this.f4341a).f34890a.execute(new juz(th4, 4, null));
                    return;
                }
        }
    }
}
