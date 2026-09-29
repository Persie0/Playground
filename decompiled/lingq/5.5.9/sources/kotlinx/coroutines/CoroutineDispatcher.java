package kotlinx.coroutines;

import cm.InterfaceC2052l;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.internal.C7156f;
import no.C7814a0;
import p464wl.AbstractC9966a;
import p464wl.AbstractC9967b;
import p464wl.InterfaceC9968c;
import p464wl.InterfaceC9969d;

/* JADX INFO: loaded from: classes2.dex */
public abstract class CoroutineDispatcher extends AbstractC9966a implements InterfaceC9969d {

    /* JADX INFO: renamed from: b */
    public static final Key f39989b = new Key();

    public static final class Key extends AbstractC9967b<InterfaceC9969d, CoroutineDispatcher> {
        public Key() {
            super(InterfaceC9969d.a.f50692a, new InterfaceC2052l<CoroutineContext.InterfaceC6757a, CoroutineDispatcher>() { // from class: kotlinx.coroutines.CoroutineDispatcher.Key.1
                @Override // cm.InterfaceC2052l
                /* JADX INFO: renamed from: n */
                public final CoroutineDispatcher mo528n(CoroutineContext.InterfaceC6757a interfaceC6757a) {
                    CoroutineContext.InterfaceC6757a interfaceC6757a2 = interfaceC6757a;
                    if (interfaceC6757a2 instanceof CoroutineDispatcher) {
                        return (CoroutineDispatcher) interfaceC6757a2;
                    }
                    return null;
                }
            });
        }
    }

    public CoroutineDispatcher() {
        super(InterfaceC9969d.a.f50692a);
    }

    /* JADX INFO: renamed from: A1 */
    public void mo14310A1(CoroutineContext coroutineContext, Runnable runnable) {
        mo2307z1(coroutineContext, runnable);
    }

    /* JADX INFO: renamed from: B1 */
    public boolean mo3964B1(CoroutineContext coroutineContext) {
        return !(this instanceof C7093e);
    }

    @Override // p464wl.InterfaceC9969d
    /* JADX INFO: renamed from: Q0 */
    public final C7156f mo14311Q0(ContinuationImpl continuationImpl) {
        return new C7156f(this, continuationImpl);
    }

    @Override // p464wl.InterfaceC9969d
    /* JADX INFO: renamed from: l */
    public final void mo14312l(InterfaceC9968c<?> interfaceC9968c) {
        ((C7156f) interfaceC9968c).m14446m();
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    /*  JADX ERROR: JadxRuntimeException in pass: ModVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't change immutable type java.lang.Object to kotlinx.coroutines.CoroutineDispatcher for r4v1 'this'  java.lang.Object
        	at jadx.core.dex.instructions.args.SSAVar.setType(SSAVar.java:114)
        	at jadx.core.dex.instructions.args.RegisterArg.setType(RegisterArg.java:52)
        	at jadx.core.dex.visitors.ModVisitor.removeCheckCast(ModVisitor.java:417)
        	at jadx.core.dex.visitors.ModVisitor.replaceStep(ModVisitor.java:152)
        	at jadx.core.dex.visitors.ModVisitor.visit(ModVisitor.java:96)
        */
    @Override // p464wl.AbstractC9966a, kotlin.coroutines.CoroutineContext
    /* JADX INFO: renamed from: m0 */
    public final kotlin.coroutines.CoroutineContext mo1473m0(kotlin.coroutines.CoroutineContext.InterfaceC6758b<?> r5) {
        /*
            r4 = this;
            java.lang.String r0 = "key"
            r3 = 3
            dm.C5207g.m11111f(r5, r0)
            r3 = 6
            boolean r1 = r5 instanceof p464wl.AbstractC9967b
            if (r1 == 0) goto L33
            wl.b r5 = (p464wl.AbstractC9967b) r5
            kotlin.coroutines.CoroutineContext$b<?> r1 = r4.f50688a
            r3 = 1
            dm.C5207g.m11111f(r1, r0)
            r3 = 4
            if (r1 == r5) goto L1e
            kotlin.coroutines.CoroutineContext$b<?> r0 = r5.f50690b
            if (r0 != r1) goto L1b
            goto L1e
        L1b:
            r0 = 0
            r3 = 3
            goto L20
        L1e:
            r0 = 1
            r3 = 2
        L20:
            if (r0 == 0) goto L3e
            cm.l<kotlin.coroutines.CoroutineContext$a, E extends B> r5 = r5.f50689a
            java.lang.Object r2 = r5.mo528n(r4)
            r5 = r2
            kotlin.coroutines.CoroutineContext$a r5 = (kotlin.coroutines.CoroutineContext.InterfaceC6757a) r5
            r3 = 3
            if (r5 == 0) goto L3e
            r3 = 2
            kotlin.coroutines.EmptyCoroutineContext r5 = kotlin.coroutines.EmptyCoroutineContext.f38093a
            r3 = 6
            goto L3f
        L33:
            r3 = 1
            wl.d$a r0 = p464wl.InterfaceC9969d.a.f50692a
            r3 = 1
            if (r0 != r5) goto L3e
            r3 = 5
            kotlin.coroutines.EmptyCoroutineContext r5 = kotlin.coroutines.EmptyCoroutineContext.f38093a
            r3 = 7
            goto L3f
        L3e:
            r5 = r4
        L3f:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.CoroutineDispatcher.mo1473m0(kotlin.coroutines.CoroutineContext$b):kotlin.coroutines.CoroutineContext");
    }

    public String toString() {
        return getClass().getSimpleName() + '@' + C7814a0.m15551c(this);
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    /*  JADX ERROR: JadxRuntimeException in pass: ModVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't change immutable type java.lang.Object to kotlinx.coroutines.CoroutineDispatcher for r6v1 'this'  java.lang.Object
        	at jadx.core.dex.instructions.args.SSAVar.setType(SSAVar.java:114)
        	at jadx.core.dex.instructions.args.RegisterArg.setType(RegisterArg.java:52)
        	at jadx.core.dex.visitors.ModVisitor.removeCheckCast(ModVisitor.java:417)
        	at jadx.core.dex.visitors.ModVisitor.replaceStep(ModVisitor.java:152)
        	at jadx.core.dex.visitors.ModVisitor.visit(ModVisitor.java:96)
        */
    @Override // p464wl.AbstractC9966a, kotlin.coroutines.CoroutineContext
    /* JADX INFO: renamed from: w */
    public final <E extends kotlin.coroutines.CoroutineContext.InterfaceC6757a> E mo1474w(kotlin.coroutines.CoroutineContext.InterfaceC6758b<E> r7) {
        /*
            r6 = this;
            r2 = r6
            java.lang.String r0 = "key"
            r5 = 1
            dm.C5207g.m11111f(r7, r0)
            r5 = 1
            boolean r1 = r7 instanceof p464wl.AbstractC9967b
            if (r1 == 0) goto L39
            r4 = 6
            wl.b r7 = (p464wl.AbstractC9967b) r7
            kotlin.coroutines.CoroutineContext$b<?> r1 = r2.f50688a
            r4 = 1
            dm.C5207g.m11111f(r1, r0)
            r5 = 4
            if (r1 == r7) goto L22
            r4 = 6
            kotlin.coroutines.CoroutineContext$b<?> r0 = r7.f50690b
            r5 = 6
            if (r0 != r1) goto L1f
            goto L23
        L1f:
            r5 = 4
            r0 = 0
            goto L25
        L22:
            r5 = 4
        L23:
            r4 = 1
            r0 = r4
        L25:
            if (r0 == 0) goto L3f
            r4 = 1
            cm.l<kotlin.coroutines.CoroutineContext$a, E extends B> r7 = r7.f50689a
            r4 = 4
            java.lang.Object r4 = r7.mo528n(r2)
            r7 = r4
            kotlin.coroutines.CoroutineContext$a r7 = (kotlin.coroutines.CoroutineContext.InterfaceC6757a) r7
            r4 = 1
            boolean r0 = r7 instanceof kotlin.coroutines.CoroutineContext.InterfaceC6757a
            r4 = 3
            if (r0 == 0) goto L3f
            goto L41
        L39:
            wl.d$a r0 = p464wl.InterfaceC9969d.a.f50692a
            if (r0 != r7) goto L3f
            r7 = r2
            goto L41
        L3f:
            r4 = 0
            r7 = r4
        L41:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.CoroutineDispatcher.mo1474w(kotlin.coroutines.CoroutineContext$b):kotlin.coroutines.CoroutineContext$a");
    }

    /* JADX INFO: renamed from: z1 */
    public abstract void mo2307z1(CoroutineContext coroutineContext, Runnable runnable);
}
