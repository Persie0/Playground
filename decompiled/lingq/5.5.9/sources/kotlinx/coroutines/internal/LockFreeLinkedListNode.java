package kotlinx.coroutines.internal;

import dm.C5206f;
import dm.C5207g;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.jvm.internal.PropertyReference0Impl;
import no.C7814a0;
import p260m8.C7499b;
import p338qd.C8573r0;

/* JADX INFO: loaded from: classes2.dex */
public class LockFreeLinkedListNode {

    /* JADX INFO: renamed from: a */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f40391a = AtomicReferenceFieldUpdater.newUpdater(LockFreeLinkedListNode.class, Object.class, "_next");

    /* JADX INFO: renamed from: b */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f40392b = AtomicReferenceFieldUpdater.newUpdater(LockFreeLinkedListNode.class, Object.class, "_prev");

    /* JADX INFO: renamed from: c */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f40393c = AtomicReferenceFieldUpdater.newUpdater(LockFreeLinkedListNode.class, Object.class, "_removedRef");
    volatile /* synthetic */ Object _next = this;
    volatile /* synthetic */ Object _prev = this;
    private volatile /* synthetic */ Object _removedRef = null;

    /* JADX INFO: renamed from: kotlinx.coroutines.internal.LockFreeLinkedListNode$a */
    public static abstract class AbstractC7146a extends AbstractC7152b {
        @Override // kotlinx.coroutines.internal.AbstractC7152b
        /* JADX INFO: renamed from: a */
        public final void mo14417a(AbstractC7153c<?> abstractC7153c, Object obj) {
            LockFreeLinkedListNode lockFreeLinkedListNodeMo14422g;
            boolean z10 = true;
            boolean z11 = obj == null;
            LockFreeLinkedListNode lockFreeLinkedListNodeMo14421f = mo14421f();
            if (lockFreeLinkedListNodeMo14421f == null || (lockFreeLinkedListNodeMo14422g = mo14422g()) == null) {
                return;
            }
            C7164n c7164nMo14425l = z11 ? mo14425l(lockFreeLinkedListNodeMo14422g) : lockFreeLinkedListNodeMo14422g;
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = LockFreeLinkedListNode.f40391a;
            while (!atomicReferenceFieldUpdater.compareAndSet(lockFreeLinkedListNodeMo14421f, abstractC7153c, c7164nMo14425l)) {
                if (atomicReferenceFieldUpdater.get(lockFreeLinkedListNodeMo14421f) != abstractC7153c) {
                    z10 = false;
                    break;
                }
            }
            if (z10 && z11) {
                mo14419d(lockFreeLinkedListNodeMo14422g);
            }
        }

        @Override // kotlinx.coroutines.internal.AbstractC7152b
        /* JADX INFO: renamed from: b */
        public final Object mo14418b(AbstractC7153c<?> abstractC7153c) {
            boolean z10;
            while (true) {
                LockFreeLinkedListNode lockFreeLinkedListNodeMo14424k = mo14424k(abstractC7153c);
                C7168r c7168r = C7499b.f41431f;
                if (lockFreeLinkedListNodeMo14424k == null) {
                    return c7168r;
                }
                Object obj = lockFreeLinkedListNodeMo14424k._next;
                if (obj == abstractC7153c || abstractC7153c.m14439h()) {
                    return null;
                }
                if (obj instanceof AbstractC7163m) {
                    AbstractC7163m abstractC7163m = (AbstractC7163m) obj;
                    if (abstractC7153c.m14461b(abstractC7163m)) {
                        return c7168r;
                    }
                    abstractC7163m.mo14428c(lockFreeLinkedListNodeMo14424k);
                } else {
                    Object objMo14354c = mo14354c(lockFreeLinkedListNodeMo14424k);
                    if (objMo14354c != null) {
                        return objMo14354c;
                    }
                    if (mo14423j(obj)) {
                        continue;
                    } else {
                        C7148c c7148c = new C7148c(lockFreeLinkedListNodeMo14424k, (LockFreeLinkedListNode) obj, this);
                        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = LockFreeLinkedListNode.f40391a;
                        while (true) {
                            if (atomicReferenceFieldUpdater.compareAndSet(lockFreeLinkedListNodeMo14424k, obj, c7148c)) {
                                z10 = true;
                                break;
                            }
                            if (atomicReferenceFieldUpdater.get(lockFreeLinkedListNodeMo14424k) != obj) {
                                z10 = false;
                                break;
                            }
                        }
                        if (z10) {
                            try {
                                if (c7148c.mo14428c(lockFreeLinkedListNodeMo14424k) != C5206f.f33271f) {
                                    return null;
                                }
                            } catch (Throwable th2) {
                                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = LockFreeLinkedListNode.f40391a;
                                while (!atomicReferenceFieldUpdater2.compareAndSet(lockFreeLinkedListNodeMo14424k, c7148c, obj) && atomicReferenceFieldUpdater2.get(lockFreeLinkedListNodeMo14424k) == c7148c) {
                                }
                                throw th2;
                            }
                        } else {
                            continue;
                        }
                    }
                }
            }
        }

        /* JADX INFO: renamed from: c */
        public abstract Object mo14354c(LockFreeLinkedListNode lockFreeLinkedListNode);

        /* JADX INFO: renamed from: d */
        public abstract void mo14419d(LockFreeLinkedListNode lockFreeLinkedListNode);

        /* JADX INFO: renamed from: e */
        public abstract void mo14420e(C7148c c7148c);

        /* JADX INFO: renamed from: f */
        public abstract LockFreeLinkedListNode mo14421f();

        /* JADX INFO: renamed from: g */
        public abstract LockFreeLinkedListNode mo14422g();

        /* JADX INFO: renamed from: h */
        public Object mo14355h(C7148c c7148c) {
            mo14420e(c7148c);
            return null;
        }

        /* JADX INFO: renamed from: i */
        public void mo14356i(LockFreeLinkedListNode lockFreeLinkedListNode) {
        }

        /* JADX INFO: renamed from: j */
        public abstract boolean mo14423j(Object obj);

        /* JADX INFO: renamed from: k */
        public abstract LockFreeLinkedListNode mo14424k(AbstractC7163m abstractC7163m);

        /* JADX INFO: renamed from: l */
        public abstract C7164n mo14425l(LockFreeLinkedListNode lockFreeLinkedListNode);
    }

    /* JADX INFO: renamed from: kotlinx.coroutines.internal.LockFreeLinkedListNode$b */
    public static abstract class AbstractC7147b extends AbstractC7153c<LockFreeLinkedListNode> {

        /* JADX INFO: renamed from: b */
        public final LockFreeLinkedListNode f40394b;

        /* JADX INFO: renamed from: c */
        public LockFreeLinkedListNode f40395c;

        public AbstractC7147b(LockFreeLinkedListNode lockFreeLinkedListNode) {
            this.f40394b = lockFreeLinkedListNode;
        }

        @Override // kotlinx.coroutines.internal.AbstractC7153c
        /* JADX INFO: renamed from: d */
        public final void mo14426d(LockFreeLinkedListNode lockFreeLinkedListNode, Object obj) {
            LockFreeLinkedListNode lockFreeLinkedListNode2 = lockFreeLinkedListNode;
            boolean z10 = true;
            boolean z11 = obj == null;
            LockFreeLinkedListNode lockFreeLinkedListNode3 = this.f40394b;
            LockFreeLinkedListNode lockFreeLinkedListNode4 = z11 ? lockFreeLinkedListNode3 : this.f40395c;
            if (lockFreeLinkedListNode4 != null) {
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = LockFreeLinkedListNode.f40391a;
                while (!atomicReferenceFieldUpdater.compareAndSet(lockFreeLinkedListNode2, this, lockFreeLinkedListNode4)) {
                    if (atomicReferenceFieldUpdater.get(lockFreeLinkedListNode2) != this) {
                        z10 = false;
                        break;
                    }
                }
                if (z10 && z11) {
                    LockFreeLinkedListNode lockFreeLinkedListNode5 = this.f40395c;
                    C5207g.m11108c(lockFreeLinkedListNode5);
                    lockFreeLinkedListNode3.m14414w(lockFreeLinkedListNode5);
                }
            }
        }
    }

    /* JADX INFO: renamed from: kotlinx.coroutines.internal.LockFreeLinkedListNode$c */
    public static final class C7148c extends AbstractC7163m {

        /* JADX INFO: renamed from: a */
        public final LockFreeLinkedListNode f40396a;

        /* JADX INFO: renamed from: b */
        public final LockFreeLinkedListNode f40397b;

        /* JADX INFO: renamed from: c */
        public final AbstractC7146a f40398c;

        public C7148c(LockFreeLinkedListNode lockFreeLinkedListNode, LockFreeLinkedListNode lockFreeLinkedListNode2, AbstractC7146a abstractC7146a) {
            this.f40396a = lockFreeLinkedListNode;
            this.f40397b = lockFreeLinkedListNode2;
            this.f40398c = abstractC7146a;
        }

        /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
        @Override // kotlinx.coroutines.internal.AbstractC7163m
        /* JADX INFO: renamed from: a */
        public final AbstractC7153c<?> mo14427a() {
            AbstractC7153c<?> abstractC7153c = this.f40398c.f40415a;
            if (abstractC7153c != null) {
                return abstractC7153c;
            }
            C5207g.m11117l("atomicOp");
            throw null;
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
        @Override // kotlinx.coroutines.internal.AbstractC7163m
        /* JADX INFO: renamed from: c */
        public final Object mo14428c(Object obj) {
            Object objMo14427a;
            boolean z10;
            if (obj == null) {
                throw new NullPointerException("null cannot be cast to non-null type kotlinx.coroutines.internal.LockFreeLinkedListNode{ kotlinx.coroutines.internal.LockFreeLinkedListKt.Node }");
            }
            LockFreeLinkedListNode lockFreeLinkedListNode = (LockFreeLinkedListNode) obj;
            AbstractC7146a abstractC7146a = this.f40398c;
            Object objMo14355h = abstractC7146a.mo14355h(this);
            C7168r c7168r = C5206f.f33271f;
            LockFreeLinkedListNode lockFreeLinkedListNode2 = this.f40397b;
            if (objMo14355h != c7168r) {
                Object objM14436e = objMo14355h != null ? mo14427a().m14436e(objMo14355h) : mo14427a().m14437f();
                LockFreeLinkedListNode lockFreeLinkedListNodeMo14425l = lockFreeLinkedListNode2;
                if (objM14436e == C7499b.f41430e) {
                    objMo14427a = mo14427a();
                } else {
                    if (objM14436e == null) {
                        lockFreeLinkedListNodeMo14425l = abstractC7146a.mo14425l(lockFreeLinkedListNode2);
                    }
                    objMo14427a = lockFreeLinkedListNodeMo14425l;
                }
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = LockFreeLinkedListNode.f40391a;
                while (!atomicReferenceFieldUpdater.compareAndSet(lockFreeLinkedListNode, this, objMo14427a) && atomicReferenceFieldUpdater.get(lockFreeLinkedListNode) == this) {
                }
                return null;
            }
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = LockFreeLinkedListNode.f40391a;
            C7164n c7164nM14410H = lockFreeLinkedListNode2.m14410H();
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater3 = LockFreeLinkedListNode.f40391a;
            while (true) {
                if (atomicReferenceFieldUpdater3.compareAndSet(lockFreeLinkedListNode, this, c7164nM14410H)) {
                    z10 = true;
                    break;
                }
                if (atomicReferenceFieldUpdater3.get(lockFreeLinkedListNode) != this) {
                    z10 = false;
                    break;
                }
            }
            if (z10) {
                abstractC7146a.mo14356i(lockFreeLinkedListNode);
                lockFreeLinkedListNode2.m14413v();
            }
            return c7168r;
        }

        /* JADX INFO: renamed from: d */
        public final void m14429d() {
            this.f40398c.mo14420e(this);
        }

        @Override // kotlinx.coroutines.internal.AbstractC7163m
        public final String toString() {
            return "PrepareOp(op=" + mo14427a() + ')';
        }
    }

    /* JADX INFO: renamed from: kotlinx.coroutines.internal.LockFreeLinkedListNode$d */
    public static class C7149d<T> extends AbstractC7146a {

        /* JADX INFO: renamed from: c */
        public static final /* synthetic */ AtomicReferenceFieldUpdater f40399c = AtomicReferenceFieldUpdater.newUpdater(C7149d.class, Object.class, "_affectedNode");

        /* JADX INFO: renamed from: d */
        public static final /* synthetic */ AtomicReferenceFieldUpdater f40400d = AtomicReferenceFieldUpdater.newUpdater(C7149d.class, Object.class, "_originalNext");
        private volatile /* synthetic */ Object _affectedNode = null;
        private volatile /* synthetic */ Object _originalNext = null;

        /* JADX INFO: renamed from: b */
        public final LockFreeLinkedListNode f40401b;

        public C7149d(C7158h c7158h) {
            this.f40401b = c7158h;
        }

        @Override // kotlinx.coroutines.internal.LockFreeLinkedListNode.AbstractC7146a
        /* JADX INFO: renamed from: c */
        public Object mo14354c(LockFreeLinkedListNode lockFreeLinkedListNode) {
            if (lockFreeLinkedListNode == this.f40401b) {
                return C8573r0.f45974k;
            }
            return null;
        }

        @Override // kotlinx.coroutines.internal.LockFreeLinkedListNode.AbstractC7146a
        /* JADX INFO: renamed from: d */
        public final void mo14419d(LockFreeLinkedListNode lockFreeLinkedListNode) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = LockFreeLinkedListNode.f40391a;
            lockFreeLinkedListNode.m14413v();
        }

        @Override // kotlinx.coroutines.internal.LockFreeLinkedListNode.AbstractC7146a
        /* JADX INFO: renamed from: e */
        public final void mo14420e(C7148c c7148c) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2;
            LockFreeLinkedListNode lockFreeLinkedListNode = c7148c.f40396a;
            do {
                atomicReferenceFieldUpdater = f40399c;
                if (atomicReferenceFieldUpdater.compareAndSet(this, null, lockFreeLinkedListNode)) {
                    break;
                }
            } while (atomicReferenceFieldUpdater.get(this) == null);
            do {
                atomicReferenceFieldUpdater2 = f40400d;
                if (atomicReferenceFieldUpdater2.compareAndSet(this, null, c7148c.f40397b)) {
                    return;
                }
            } while (atomicReferenceFieldUpdater2.get(this) == null);
        }

        @Override // kotlinx.coroutines.internal.LockFreeLinkedListNode.AbstractC7146a
        /* JADX INFO: renamed from: f */
        public final LockFreeLinkedListNode mo14421f() {
            return (LockFreeLinkedListNode) this._affectedNode;
        }

        @Override // kotlinx.coroutines.internal.LockFreeLinkedListNode.AbstractC7146a
        /* JADX INFO: renamed from: g */
        public final LockFreeLinkedListNode mo14422g() {
            return (LockFreeLinkedListNode) this._originalNext;
        }

        @Override // kotlinx.coroutines.internal.LockFreeLinkedListNode.AbstractC7146a
        /* JADX INFO: renamed from: j */
        public final boolean mo14423j(Object obj) {
            if (!(obj instanceof C7164n)) {
                return false;
            }
            ((C7164n) obj).f40439a.m14406C();
            return true;
        }

        @Override // kotlinx.coroutines.internal.LockFreeLinkedListNode.AbstractC7146a
        /* JADX INFO: renamed from: k */
        public final LockFreeLinkedListNode mo14424k(AbstractC7163m abstractC7163m) {
            LockFreeLinkedListNode lockFreeLinkedListNode = this.f40401b;
            while (true) {
                Object obj = lockFreeLinkedListNode._next;
                if (!(obj instanceof AbstractC7163m)) {
                    return (LockFreeLinkedListNode) obj;
                }
                AbstractC7163m abstractC7163m2 = (AbstractC7163m) obj;
                if (abstractC7163m.m14461b(abstractC7163m2)) {
                    return null;
                }
                abstractC7163m2.mo14428c(this.f40401b);
            }
        }

        @Override // kotlinx.coroutines.internal.LockFreeLinkedListNode.AbstractC7146a
        /* JADX INFO: renamed from: l */
        public final C7164n mo14425l(LockFreeLinkedListNode lockFreeLinkedListNode) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = LockFreeLinkedListNode.f40391a;
            return lockFreeLinkedListNode.m14410H();
        }

        /* JADX INFO: renamed from: m */
        public final LockFreeLinkedListNode m14430m() {
            LockFreeLinkedListNode lockFreeLinkedListNode = (LockFreeLinkedListNode) this._affectedNode;
            C5207g.m11108c(lockFreeLinkedListNode);
            return lockFreeLinkedListNode;
        }
    }

    /* JADX INFO: renamed from: B */
    public final LockFreeLinkedListNode m14405B() {
        LockFreeLinkedListNode lockFreeLinkedListNodeM14413v = m14413v();
        if (lockFreeLinkedListNodeM14413v == null) {
            lockFreeLinkedListNodeM14413v = (LockFreeLinkedListNode) this._prev;
            while (lockFreeLinkedListNodeM14413v.mo14407D()) {
                lockFreeLinkedListNodeM14413v = (LockFreeLinkedListNode) lockFreeLinkedListNodeM14413v._prev;
            }
        }
        return lockFreeLinkedListNodeM14413v;
    }

    /* JADX INFO: renamed from: C */
    public final void m14406C() {
        LockFreeLinkedListNode lockFreeLinkedListNode = this;
        while (true) {
            Object objM14415x = lockFreeLinkedListNode.m14415x();
            if (!(objM14415x instanceof C7164n)) {
                lockFreeLinkedListNode.m14413v();
                return;
            }
            lockFreeLinkedListNode = ((C7164n) objM14415x).f40439a;
        }
    }

    /* JADX INFO: renamed from: D */
    public boolean mo14407D() {
        return m14415x() instanceof C7164n;
    }

    /* JADX INFO: renamed from: F */
    public boolean mo14408F() {
        return m14409G() == null;
    }

    /* JADX INFO: renamed from: G */
    public final LockFreeLinkedListNode m14409G() {
        LockFreeLinkedListNode lockFreeLinkedListNode;
        boolean z10;
        do {
            Object objM14415x = m14415x();
            if (objM14415x instanceof C7164n) {
                return ((C7164n) objM14415x).f40439a;
            }
            if (objM14415x == this) {
                return (LockFreeLinkedListNode) objM14415x;
            }
            lockFreeLinkedListNode = (LockFreeLinkedListNode) objM14415x;
            C7164n c7164nM14410H = lockFreeLinkedListNode.m14410H();
            while (true) {
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f40391a;
                if (atomicReferenceFieldUpdater.compareAndSet(this, objM14415x, c7164nM14410H)) {
                    z10 = true;
                    break;
                }
                if (atomicReferenceFieldUpdater.get(this) != objM14415x) {
                    z10 = false;
                    break;
                }
            }
        } while (!z10);
        lockFreeLinkedListNode.m14413v();
        return null;
    }

    /* JADX INFO: renamed from: H */
    public final C7164n m14410H() {
        C7164n c7164n = (C7164n) this._removedRef;
        if (c7164n != null) {
            return c7164n;
        }
        C7164n c7164n2 = new C7164n(this);
        f40393c.lazySet(this, c7164n2);
        return c7164n2;
    }

    /* JADX INFO: renamed from: I */
    public final int m14411I(LockFreeLinkedListNode lockFreeLinkedListNode, LockFreeLinkedListNode lockFreeLinkedListNode2, AbstractC7147b abstractC7147b) {
        boolean z10;
        f40392b.lazySet(lockFreeLinkedListNode, this);
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f40391a;
        atomicReferenceFieldUpdater.lazySet(lockFreeLinkedListNode, lockFreeLinkedListNode2);
        abstractC7147b.f40395c = lockFreeLinkedListNode2;
        while (true) {
            if (atomicReferenceFieldUpdater.compareAndSet(this, lockFreeLinkedListNode2, abstractC7147b)) {
                z10 = true;
                break;
            }
            if (atomicReferenceFieldUpdater.get(this) != lockFreeLinkedListNode2) {
                z10 = false;
                break;
            }
        }
        if (z10) {
            return abstractC7147b.mo14428c(this) == null ? 1 : 2;
        }
        return 0;
    }

    /* JADX INFO: renamed from: a */
    public void mo14330a() {
        mo14408F();
    }

    public String toString() {
        return new PropertyReference0Impl(this) { // from class: kotlinx.coroutines.internal.LockFreeLinkedListNode.toString.1
            @Override // km.InterfaceC6724g
            public final Object get() {
                return this.f38112b.getClass().getSimpleName();
            }
        } + '@' + C7814a0.m15551c(this);
    }

    /* JADX INFO: renamed from: u */
    public final boolean m14412u(LockFreeLinkedListNode lockFreeLinkedListNode, C7158h c7158h) {
        boolean z10;
        f40392b.lazySet(lockFreeLinkedListNode, this);
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f40391a;
        atomicReferenceFieldUpdater.lazySet(lockFreeLinkedListNode, c7158h);
        while (true) {
            if (atomicReferenceFieldUpdater.compareAndSet(this, c7158h, lockFreeLinkedListNode)) {
                z10 = true;
                break;
            }
            if (atomicReferenceFieldUpdater.get(this) != c7158h) {
                z10 = false;
                break;
            }
        }
        if (!z10) {
            return false;
        }
        lockFreeLinkedListNode.m14414w(c7158h);
        return true;
    }

    /* JADX INFO: renamed from: v */
    public final LockFreeLinkedListNode m14413v() {
        Object obj;
        boolean z10;
        while (true) {
            LockFreeLinkedListNode lockFreeLinkedListNode = (LockFreeLinkedListNode) this._prev;
            LockFreeLinkedListNode lockFreeLinkedListNode2 = lockFreeLinkedListNode;
            while (true) {
                LockFreeLinkedListNode lockFreeLinkedListNode3 = null;
                while (true) {
                    obj = lockFreeLinkedListNode2._next;
                    z10 = false;
                    if (obj == this) {
                        if (lockFreeLinkedListNode == lockFreeLinkedListNode2) {
                            return lockFreeLinkedListNode2;
                        }
                        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f40392b;
                        do {
                            if (atomicReferenceFieldUpdater.compareAndSet(this, lockFreeLinkedListNode, lockFreeLinkedListNode2)) {
                                z10 = true;
                                break;
                            }
                        } while (atomicReferenceFieldUpdater.get(this) == lockFreeLinkedListNode);
                        if (!z10) {
                            break;
                        }
                        return lockFreeLinkedListNode2;
                    }
                    if (mo14407D()) {
                        return null;
                    }
                    if (obj == null) {
                        return lockFreeLinkedListNode2;
                    }
                    if (obj instanceof AbstractC7163m) {
                        ((AbstractC7163m) obj).mo14428c(lockFreeLinkedListNode2);
                        break;
                    }
                    if (!(obj instanceof C7164n)) {
                        lockFreeLinkedListNode3 = lockFreeLinkedListNode2;
                        lockFreeLinkedListNode2 = (LockFreeLinkedListNode) obj;
                    } else {
                        if (lockFreeLinkedListNode3 != null) {
                            break;
                        }
                        lockFreeLinkedListNode2 = (LockFreeLinkedListNode) lockFreeLinkedListNode2._prev;
                    }
                }
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = f40391a;
                LockFreeLinkedListNode lockFreeLinkedListNode4 = ((C7164n) obj).f40439a;
                do {
                    if (atomicReferenceFieldUpdater2.compareAndSet(lockFreeLinkedListNode3, lockFreeLinkedListNode2, lockFreeLinkedListNode4)) {
                        z10 = true;
                        break;
                    }
                } while (atomicReferenceFieldUpdater2.get(lockFreeLinkedListNode3) == lockFreeLinkedListNode2);
                if (!z10) {
                    break;
                }
                lockFreeLinkedListNode2 = lockFreeLinkedListNode3;
            }
        }
    }

    /* JADX INFO: renamed from: w */
    public final void m14414w(LockFreeLinkedListNode lockFreeLinkedListNode) {
        boolean z10;
        do {
            LockFreeLinkedListNode lockFreeLinkedListNode2 = (LockFreeLinkedListNode) lockFreeLinkedListNode._prev;
            if (m14415x() != lockFreeLinkedListNode) {
                return;
            }
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f40392b;
            while (true) {
                if (atomicReferenceFieldUpdater.compareAndSet(lockFreeLinkedListNode, lockFreeLinkedListNode2, this)) {
                    z10 = true;
                    break;
                } else if (atomicReferenceFieldUpdater.get(lockFreeLinkedListNode) != lockFreeLinkedListNode2) {
                    z10 = false;
                    break;
                }
            }
        } while (!z10);
        if (mo14407D()) {
            lockFreeLinkedListNode.m14413v();
        }
    }

    /* JADX INFO: renamed from: x */
    public final Object m14415x() {
        while (true) {
            Object obj = this._next;
            if (!(obj instanceof AbstractC7163m)) {
                return obj;
            }
            ((AbstractC7163m) obj).mo14428c(this);
        }
    }

    /* JADX INFO: renamed from: z */
    public final LockFreeLinkedListNode m14416z() {
        LockFreeLinkedListNode lockFreeLinkedListNode;
        Object objM14415x = m14415x();
        C7164n c7164n = objM14415x instanceof C7164n ? (C7164n) objM14415x : null;
        if (c7164n == null || (lockFreeLinkedListNode = c7164n.f40439a) == null) {
            lockFreeLinkedListNode = (LockFreeLinkedListNode) objM14415x;
        }
        return lockFreeLinkedListNode;
    }
}
