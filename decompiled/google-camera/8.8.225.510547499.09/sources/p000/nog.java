package p000;

import java.util.Set;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.logging.Level;
import java.util.logging.Logger;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
abstract class nog extends nok {

    /* JADX INFO: renamed from: c */
    private static final Logger f43977c = Logger.getLogger(nog.class.getName());

    /* JADX INFO: renamed from: a */
    public mwj f43978a;

    /* JADX INFO: renamed from: f */
    private final boolean f43979f;

    /* JADX INFO: renamed from: g */
    private final boolean f43980g;

    public nog(mwj mwjVar, boolean z, boolean z2) {
        super(mwjVar.size());
        mwjVar.getClass();
        this.f43978a = mwjVar;
        this.f43979f = z;
        this.f43980g = z2;
    }

    /* JADX INFO: renamed from: t */
    private final void m17555t(Throwable th) {
        th.getClass();
        if (this.f43979f && !mo8566a(th)) {
            Set set = this.seenExceptions;
            if (set == null) {
                Set setM16752D = mpw.m16752D();
                mo17558g(setM16752D);
                nok.f43984b.mo17566b(this, setM16752D);
                set = this.seenExceptions;
                set.getClass();
            }
            if (m17557v(set, th)) {
                m17556u(th);
                return;
            }
        }
        if (th instanceof Error) {
            m17556u(th);
        }
    }

    /* JADX INFO: renamed from: u */
    private static void m17556u(Throwable th) {
        f43977c.logp(Level.SEVERE, "com.google.common.util.concurrent.AggregateFuture", "log", true != (th instanceof Error) ? "Got more than one input Future failure. Logging failures after the first" : "Input Future failed with Error", th);
    }

    /* JADX INFO: renamed from: v */
    private static boolean m17557v(Set set, Throwable th) {
        while (th != null) {
            if (!set.add(th)) {
                return false;
            }
            th = th.getCause();
        }
        return true;
    }

    @Override // p000.nnz
    /* JADX INFO: renamed from: bQ */
    protected final String mo14892bQ() {
        mwj mwjVar = this.f43978a;
        return mwjVar != null ? "futures=".concat(mwjVar.toString()) : super.mo14892bQ();
    }

    @Override // p000.nnz
    /* JADX INFO: renamed from: c */
    protected final void mo14893c() {
        mwj mwjVar = this.f43978a;
        mo17564s(1);
        if ((mwjVar != null) && isCancelled()) {
            boolean zM17547p = m17547p();
            naz nazVarListIterator = mwjVar.listIterator();
            while (nazVarListIterator.hasNext()) {
                ((Future) nazVarListIterator.next()).cancel(zM17547p);
            }
        }
    }

    @Override // p000.nok
    /* JADX INFO: renamed from: g */
    public final void mo17558g(Set set) {
        set.getClass();
        if (isCancelled()) {
            return;
        }
        Throwable thMo17544l = mo17544l();
        thMo17544l.getClass();
        m17557v(set, thMo17544l);
    }

    /* JADX INFO: renamed from: h */
    public abstract void mo17559h(int i, Object obj);

    /* JADX INFO: renamed from: i */
    public final void m17560i(int i, Future future) {
        try {
            mo17559h(i, kxk.m14973S(future));
        } catch (Error e) {
            e = e;
            m17555t(e);
        } catch (RuntimeException e2) {
            e = e2;
            m17555t(e);
        } catch (ExecutionException e3) {
            m17555t(e3.getCause());
        }
    }

    /* JADX INFO: renamed from: j */
    public final void m17561j(mwj mwjVar) {
        int iMo17565a = nok.f43984b.mo17565a(this);
        int i = 0;
        lku.m15614I(iMo17565a >= 0, "Less than 0 remaining futures");
        if (iMo17565a == 0) {
            if (mwjVar != null) {
                naz nazVarListIterator = mwjVar.listIterator();
                while (nazVarListIterator.hasNext()) {
                    Future future = (Future) nazVarListIterator.next();
                    if (!future.isCancelled()) {
                        m17560i(i, future);
                    }
                    i++;
                }
            }
            this.seenExceptions = null;
            mo17562q();
            mo17564s(2);
        }
    }

    /* JADX INFO: renamed from: q */
    public abstract void mo17562q();

    /* JADX INFO: renamed from: r */
    final void m17563r() {
        mwj mwjVar = this.f43978a;
        mwjVar.getClass();
        if (mwjVar.isEmpty()) {
            mo17562q();
            return;
        }
        if (!this.f43979f) {
            final mwj mwjVar2 = this.f43980g ? this.f43978a : null;
            Runnable runnable = new Runnable() { // from class: nof
                @Override // java.lang.Runnable
                public final void run() {
                    this.f43975a.m17561j(mwjVar2);
                }
            };
            naz nazVarListIterator = this.f43978a.listIterator();
            while (nazVarListIterator.hasNext()) {
                ((nps) nazVarListIterator.next()).mo2282d(runnable, not.INSTANCE);
            }
            return;
        }
        naz nazVarListIterator2 = this.f43978a.listIterator();
        final int i = 0;
        while (nazVarListIterator2.hasNext()) {
            final nps npsVar = (nps) nazVarListIterator2.next();
            npsVar.mo2282d(new Runnable() { // from class: noe
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
                @Override // java.lang.Runnable
                public final void run() {
                    nog nogVar = this.f43972a;
                    nps npsVar2 = npsVar;
                    int i2 = i;
                    try {
                        if (npsVar2.isCancelled()) {
                            nogVar.f43978a = null;
                            nogVar.cancel(false);
                        } else {
                            nogVar.m17560i(i2, npsVar2);
                        }
                    } finally {
                        nogVar.m17561j(null);
                    }
                }
            }, not.INSTANCE);
            i++;
        }
    }

    /* JADX INFO: renamed from: s */
    public void mo17564s(int i) {
        this.f43978a = null;
    }
}
