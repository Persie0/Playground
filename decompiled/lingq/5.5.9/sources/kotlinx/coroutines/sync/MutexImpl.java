package kotlinx.coroutines.sync;

import cm.InterfaceC2052l;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlinx.coroutines.internal.AbstractC7153c;
import kotlinx.coroutines.internal.AbstractC7163m;
import kotlinx.coroutines.internal.C7158h;
import kotlinx.coroutines.internal.C7164n;
import kotlinx.coroutines.internal.C7168r;
import kotlinx.coroutines.internal.LockFreeLinkedListNode;
import no.C7828f;
import no.C7836h1;
import no.C7843k;
import no.InterfaceC7838i0;
import no.InterfaceC7840j;
import p260m8.C7499b;
import p349qo.C8656b;
import p464wl.InterfaceC9968c;
import sl.C9072e;

/* JADX INFO: loaded from: classes2.dex */
public final class MutexImpl implements InterfaceC7198b {

    /* JADX INFO: renamed from: a */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f40511a = AtomicReferenceFieldUpdater.newUpdater(MutexImpl.class, Object.class, "_state");
    volatile /* synthetic */ Object _state;

    public final class LockCont extends AbstractC7194a {

        /* JADX INFO: renamed from: f */
        public final InterfaceC7840j<C9072e> f40512f;

        public LockCont(Object obj, C7843k c7843k) {
            super(obj);
            this.f40512f = c7843k;
        }

        @Override // kotlinx.coroutines.sync.MutexImpl.AbstractC7194a
        /* JADX INFO: renamed from: K */
        public final void mo14512K() {
            this.f40512f.mo15582t();
        }

        @Override // kotlinx.coroutines.sync.MutexImpl.AbstractC7194a
        /* JADX INFO: renamed from: L */
        public final boolean mo14513L() {
            if (!AbstractC7194a.f40516e.compareAndSet(this, 0, 1)) {
                return false;
            }
            C9072e c9072e = C9072e.f47360a;
            final MutexImpl mutexImpl = MutexImpl.this;
            return this.f40512f.mo15580e0(c9072e, null, new InterfaceC2052l<Throwable, C9072e>() { // from class: kotlinx.coroutines.sync.MutexImpl$LockCont$tryResumeLockWaiter$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                @Override // cm.InterfaceC2052l
                /* JADX INFO: renamed from: n */
                public final C9072e mo528n(Throwable th2) {
                    mutexImpl.mo14511b(this.f40517d);
                    return C9072e.f47360a;
                }
            }) != null;
        }

        @Override // kotlinx.coroutines.internal.LockFreeLinkedListNode
        public final String toString() {
            return "LockCont[" + this.f40517d + ", " + this.f40512f + "] for " + MutexImpl.this;
        }
    }

    /* JADX INFO: renamed from: kotlinx.coroutines.sync.MutexImpl$a */
    public abstract class AbstractC7194a extends LockFreeLinkedListNode implements InterfaceC7838i0 {

        /* JADX INFO: renamed from: e */
        public static final /* synthetic */ AtomicIntegerFieldUpdater f40516e = AtomicIntegerFieldUpdater.newUpdater(AbstractC7194a.class, "isTaken");

        /* JADX INFO: renamed from: d */
        public final Object f40517d;
        private volatile /* synthetic */ int isTaken = 0;

        public AbstractC7194a(Object obj) {
            this.f40517d = obj;
        }

        /* JADX INFO: renamed from: K */
        public abstract void mo14512K();

        /* JADX INFO: renamed from: L */
        public abstract boolean mo14513L();
    }

    /* JADX INFO: renamed from: kotlinx.coroutines.sync.MutexImpl$b */
    public static final class C7195b extends C7158h {
        public volatile Object owner;

        public C7195b(Object obj) {
            this.owner = obj;
        }

        @Override // kotlinx.coroutines.internal.LockFreeLinkedListNode
        public final String toString() {
            return "LockedQueue[" + this.owner + ']';
        }
    }

    /* JADX INFO: renamed from: kotlinx.coroutines.sync.MutexImpl$c */
    public static final class C7196c extends AbstractC7153c<MutexImpl> {

        /* JADX INFO: renamed from: b */
        public final C7195b f40518b;

        public C7196c(C7195b c7195b) {
            this.f40518b = c7195b;
        }

        @Override // kotlinx.coroutines.internal.AbstractC7153c
        /* JADX INFO: renamed from: d */
        public final void mo14426d(MutexImpl mutexImpl, Object obj) {
            MutexImpl mutexImpl2 = mutexImpl;
            Object obj2 = obj == null ? C7499b.f41436k : this.f40518b;
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = MutexImpl.f40511a;
            while (!atomicReferenceFieldUpdater.compareAndSet(mutexImpl2, this, obj2) && atomicReferenceFieldUpdater.get(mutexImpl2) == this) {
            }
        }

        @Override // kotlinx.coroutines.internal.AbstractC7153c
        /* JADX INFO: renamed from: i */
        public final Object mo14357i(MutexImpl mutexImpl) {
            C7195b c7195b = this.f40518b;
            if (c7195b.m14415x() == c7195b) {
                return null;
            }
            return C7499b.f41432g;
        }
    }

    public MutexImpl(boolean z10) {
        this._state = z10 ? C7499b.f41435j : C7499b.f41436k;
    }

    /* JADX WARN: Unreachable blocks removed: 2, instructions: 2 */
    @Override // kotlinx.coroutines.sync.InterfaceC7198b
    /* JADX INFO: renamed from: a */
    public final Object mo14510a(final Object obj, InterfaceC9968c<? super C9072e> interfaceC9968c) {
        C7197a c7197a;
        C7168r c7168r;
        boolean z10;
        boolean z11;
        Object obj2;
        boolean z12;
        loop0: while (true) {
            while (true) {
                Object obj3 = this._state;
                boolean z13 = obj3 instanceof C7197a;
                c7197a = C7499b.f41435j;
                c7168r = C7499b.f41434i;
                if (z13) {
                    if (((C7197a) obj3).f40521a == c7168r) {
                        C7197a c7197a2 = obj == null ? c7197a : new C7197a(obj);
                        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f40511a;
                        while (true) {
                            if (atomicReferenceFieldUpdater.compareAndSet(this, obj3, c7197a2)) {
                                z10 = true;
                                break;
                            }
                            if (atomicReferenceFieldUpdater.get(this) != obj3) {
                                z10 = false;
                                break;
                            }
                        }
                        if (z10) {
                            z11 = true;
                            break;
                        }
                    }
                } else if (obj3 instanceof C7195b) {
                    if (!(((C7195b) obj3).owner != obj)) {
                        throw new IllegalStateException(("Already locked by " + obj).toString());
                    }
                } else {
                    if (!(obj3 instanceof AbstractC7163m)) {
                        throw new IllegalStateException(("Illegal state " + obj3).toString());
                    }
                    ((AbstractC7163m) obj3).mo14428c(this);
                }
                z11 = false;
                break;
            }
        }
        if (z11) {
            return C9072e.f47360a;
        }
        C7843k c7843kM15569c = C7828f.m15569c(C8656b.m16874A(interfaceC9968c));
        LockCont lockCont = new LockCont(obj, c7843kM15569c);
        loop2: while (true) {
            while (true) {
                obj2 = this._state;
                if (obj2 instanceof C7197a) {
                    C7197a c7197a3 = (C7197a) obj2;
                    if (c7197a3.f40521a != c7168r) {
                        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = f40511a;
                        C7195b c7195b = new C7195b(c7197a3.f40521a);
                        while (!atomicReferenceFieldUpdater2.compareAndSet(this, obj2, c7195b) && atomicReferenceFieldUpdater2.get(this) == obj2) {
                        }
                    }
                } else {
                    if (obj2 instanceof C7195b) {
                        C7195b c7195b2 = (C7195b) obj2;
                        if (!(c7195b2.owner != obj)) {
                            throw new IllegalStateException(("Already locked by " + obj).toString());
                        }
                        while (!c7195b2.m14405B().m14412u(lockCont, c7195b2)) {
                        }
                        if (this._state != obj2 && AbstractC7194a.f40516e.compareAndSet(lockCont, 0, 1)) {
                            lockCont = new LockCont(obj, c7843kM15569c);
                        }
                        c7843kM15569c.mo15577R(new C7836h1(lockCont));
                        break loop2;
                    }
                    if (!(obj2 instanceof AbstractC7163m)) {
                        throw new IllegalStateException(("Illegal state " + obj2).toString());
                    }
                    ((AbstractC7163m) obj2).mo14428c(this);
                }
            }
            C7197a c7197a4 = obj == null ? c7197a : new C7197a(obj);
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater3 = f40511a;
            while (true) {
                if (atomicReferenceFieldUpdater3.compareAndSet(this, obj2, c7197a4)) {
                    z12 = true;
                    break;
                }
                if (atomicReferenceFieldUpdater3.get(this) != obj2) {
                    z12 = false;
                    break;
                }
            }
            if (z12) {
                c7843kM15569c.m15599z(C9072e.f47360a, c7843kM15569c.f42924c, new InterfaceC2052l<Throwable, C9072e>() { // from class: kotlinx.coroutines.sync.MutexImpl$lockSuspend$2$1$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(1);
                    }

                    @Override // cm.InterfaceC2052l
                    /* JADX INFO: renamed from: n */
                    public final C9072e mo528n(Throwable th2) {
                        this.f40519b.mo14511b(obj);
                        return C9072e.f47360a;
                    }
                });
                break;
            }
        }
        Object objM15593p = c7843kM15569c.m15593p();
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (objM15593p != coroutineSingletons) {
            objM15593p = C9072e.f47360a;
        }
        return objM15593p == coroutineSingletons ? objM15593p : C9072e.f47360a;
    }

    /* JADX WARN: Unreachable blocks removed: 3, instructions: 3 */
    @Override // kotlinx.coroutines.sync.InterfaceC7198b
    /* JADX INFO: renamed from: b */
    public final void mo14511b(Object obj) {
        LockFreeLinkedListNode lockFreeLinkedListNode;
        while (true) {
            while (true) {
                Object obj2 = this._state;
                boolean z10 = true;
                if (obj2 instanceof C7197a) {
                    if (obj == null) {
                        if (!(((C7197a) obj2).f40521a != C7499b.f41434i)) {
                            throw new IllegalStateException("Mutex is not locked".toString());
                        }
                    } else {
                        C7197a c7197a = (C7197a) obj2;
                        if (!(c7197a.f40521a == obj)) {
                            throw new IllegalStateException(("Mutex is locked by " + c7197a.f40521a + " but expected " + obj).toString());
                        }
                    }
                    AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f40511a;
                    C7197a c7197a2 = C7499b.f41436k;
                    while (!atomicReferenceFieldUpdater.compareAndSet(this, obj2, c7197a2)) {
                        if (atomicReferenceFieldUpdater.get(this) != obj2) {
                            z10 = false;
                            break;
                        }
                    }
                    if (!z10) {
                        break;
                    } else {
                        return;
                    }
                }
                if (!(obj2 instanceof AbstractC7163m)) {
                    if (!(obj2 instanceof C7195b)) {
                        throw new IllegalStateException(("Illegal state " + obj2).toString());
                    }
                    if (obj != null) {
                        C7195b c7195b = (C7195b) obj2;
                        if (!(c7195b.owner == obj)) {
                            throw new IllegalStateException(("Mutex is locked by " + c7195b.owner + " but expected " + obj).toString());
                        }
                    }
                    C7195b c7195b2 = (C7195b) obj2;
                    while (true) {
                        lockFreeLinkedListNode = (LockFreeLinkedListNode) c7195b2.m14415x();
                        if (lockFreeLinkedListNode == c7195b2) {
                            lockFreeLinkedListNode = null;
                            break;
                        } else if (lockFreeLinkedListNode.mo14408F()) {
                            break;
                        } else {
                            ((C7164n) lockFreeLinkedListNode.m14415x()).f40439a.m14406C();
                        }
                    }
                    if (lockFreeLinkedListNode != null) {
                        AbstractC7194a abstractC7194a = (AbstractC7194a) lockFreeLinkedListNode;
                        if (!abstractC7194a.mo14513L()) {
                            break;
                        }
                        Object obj3 = abstractC7194a.f40517d;
                        if (obj3 == null) {
                            obj3 = C7499b.f41433h;
                        }
                        c7195b2.owner = obj3;
                        abstractC7194a.mo14512K();
                        return;
                    }
                    C7196c c7196c = new C7196c(c7195b2);
                    AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = f40511a;
                    while (!atomicReferenceFieldUpdater2.compareAndSet(this, obj2, c7196c)) {
                        if (atomicReferenceFieldUpdater2.get(this) != obj2) {
                            z10 = false;
                            break;
                        }
                    }
                    if (!z10 || c7196c.mo14428c(this) != null) {
                        break;
                    } else {
                        return;
                    }
                }
                ((AbstractC7163m) obj2).mo14428c(this);
            }
        }
    }

    public final String toString() {
        while (true) {
            Object obj = this._state;
            if (obj instanceof C7197a) {
                return "Mutex[" + ((C7197a) obj).f40521a + ']';
            }
            if (!(obj instanceof AbstractC7163m)) {
                if (!(obj instanceof C7195b)) {
                    throw new IllegalStateException(("Illegal state " + obj).toString());
                }
                return "Mutex[" + ((C7195b) obj).owner + ']';
            }
            ((AbstractC7163m) obj).mo14428c(this);
        }
    }
}
