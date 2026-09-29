package androidx.compose.animation.core;

import cm.InterfaceC2052l;
import cm.InterfaceC2056p;
import com.android.installreferrer.api.InstallReferrerClient;
import dm.C5207g;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.Metadata;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.sync.InterfaceC7198b;
import no.InterfaceC7875v0;
import no.InterfaceC7882z;
import p260m8.C7499b;
import p464wl.InterfaceC9968c;
import p490xl.InterfaceC10224c;
import sl.C9072e;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m13364d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u0000*\u00020\u0001H\u008a@"}, m13365d2 = {"R", "Lno/z;", "<anonymous>"}, m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
@InterfaceC10224c(m19205c = "androidx.compose.animation.core.MutatorMutex$mutate$2", m19206f = "InternalMutatorMutex.kt", m19207l = {171, 119}, m19208m = "invokeSuspend")
final class MutatorMutex$mutate$2 extends SuspendLambda implements InterfaceC2056p<InterfaceC7882z, InterfaceC9968c<Object>, Object> {

    /* JADX INFO: renamed from: e */
    public InterfaceC7198b f1526e;

    /* JADX INFO: renamed from: f */
    public Object f1527f;

    /* JADX INFO: renamed from: g */
    public C0371c f1528g;

    /* JADX INFO: renamed from: h */
    public int f1529h;

    /* JADX INFO: renamed from: i */
    public /* synthetic */ Object f1530i;

    /* JADX INFO: renamed from: j */
    public final /* synthetic */ MutatePriority f1531j;

    /* JADX INFO: renamed from: k */
    public final /* synthetic */ C0371c f1532k;

    /* JADX INFO: renamed from: l */
    public final /* synthetic */ InterfaceC2052l<InterfaceC9968c<Object>, Object> f1533l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public MutatorMutex$mutate$2(MutatePriority mutatePriority, C0371c c0371c, InterfaceC2052l<? super InterfaceC9968c<Object>, ? extends Object> interfaceC2052l, InterfaceC9968c<? super MutatorMutex$mutate$2> interfaceC9968c) {
        super(2, interfaceC9968c);
        this.f1531j = mutatePriority;
        this.f1532k = c0371c;
        this.f1533l = interfaceC2052l;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /* JADX INFO: renamed from: a */
    public final InterfaceC9968c<C9072e> mo1336a(Object obj, InterfaceC9968c<?> interfaceC9968c) {
        MutatorMutex$mutate$2 mutatorMutex$mutate$2 = new MutatorMutex$mutate$2(this.f1531j, this.f1532k, this.f1533l, interfaceC9968c);
        mutatorMutex$mutate$2.f1530i = obj;
        return mutatorMutex$mutate$2;
    }

    @Override // cm.InterfaceC2056p
    /* JADX INFO: renamed from: m0 */
    public final Object mo1337m0(InterfaceC7882z interfaceC7882z, InterfaceC9968c<Object> interfaceC9968c) {
        return ((MutatorMutex$mutate$2) mo1336a(interfaceC7882z, interfaceC9968c)).mo1338x(C9072e.f47360a);
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [int, kotlinx.coroutines.sync.b] */
    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /* JADX INFO: renamed from: x */
    public final Object mo1338x(Object obj) throws Throwable {
        C0371c c0371c;
        C0371c.a aVar;
        boolean z10;
        InterfaceC7198b interfaceC7198b;
        InterfaceC2052l<InterfaceC9968c<Object>, Object> interfaceC2052l;
        C0371c.a aVar2;
        InterfaceC7198b interfaceC7198b2;
        C0371c.a aVar3;
        C0371c c0371c2;
        Throwable th2;
        AtomicReference<C0371c.a> atomicReference;
        AtomicReference<C0371c.a> atomicReference2;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        ?? r10 = this.f1529h;
        try {
            try {
                if (r10 == 0) {
                    C7499b.m14977z0(obj);
                    CoroutineContext.InterfaceC6757a interfaceC6757aMo1474w = ((InterfaceC7882z) this.f1530i).getF6528b().mo1474w(InterfaceC7875v0.b.f42976a);
                    C5207g.m11108c(interfaceC6757aMo1474w);
                    C0371c.a aVar4 = new C0371c.a(this.f1531j, (InterfaceC7875v0) interfaceC6757aMo1474w);
                    do {
                        c0371c = this.f1532k;
                        AtomicReference<C0371c.a> atomicReference3 = c0371c.f1665a;
                        aVar = atomicReference3.get();
                        z10 = false;
                        if (aVar != null) {
                            if (!(aVar4.f1667a.compareTo(aVar.f1667a) >= 0)) {
                                throw new CancellationException("Current mutation had a higher priority");
                            }
                        }
                        do {
                            if (atomicReference3.compareAndSet(aVar, aVar4)) {
                                z10 = true;
                                break;
                            }
                        } while (atomicReference3.get() == aVar);
                    } while (!z10);
                    if (aVar != null) {
                        aVar.f1668b.mo15618a(null);
                    }
                    this.f1530i = aVar4;
                    interfaceC7198b = c0371c.f1666b;
                    this.f1526e = interfaceC7198b;
                    InterfaceC2052l<InterfaceC9968c<Object>, Object> interfaceC2052l2 = this.f1533l;
                    this.f1527f = interfaceC2052l2;
                    this.f1528g = c0371c;
                    this.f1529h = 1;
                    if (interfaceC7198b.mo14510a(null, this) == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                    interfaceC2052l = interfaceC2052l2;
                    aVar2 = aVar4;
                } else {
                    if (r10 != 1) {
                        if (r10 != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        c0371c2 = (C0371c) this.f1527f;
                        interfaceC7198b2 = this.f1526e;
                        aVar3 = (C0371c.a) this.f1530i;
                        try {
                            C7499b.m14977z0(obj);
                            atomicReference2 = c0371c2.f1665a;
                            while (!atomicReference2.compareAndSet(aVar3, null) && atomicReference2.get() == aVar3) {
                            }
                            interfaceC7198b2.mo14511b(null);
                            return obj;
                        } catch (Throwable th3) {
                            th2 = th3;
                            atomicReference = c0371c2.f1665a;
                            while (!atomicReference.compareAndSet(aVar3, null)) {
                            }
                            throw th2;
                        }
                    }
                    C0371c c0371c3 = this.f1528g;
                    interfaceC2052l = (InterfaceC2052l) this.f1527f;
                    interfaceC7198b = this.f1526e;
                    aVar2 = (C0371c.a) this.f1530i;
                    C7499b.m14977z0(obj);
                    c0371c = c0371c3;
                }
                this.f1530i = aVar2;
                this.f1526e = interfaceC7198b2;
                this.f1527f = c0371c;
                this.f1528g = null;
                this.f1529h = 2;
                Object objMo528n = interfaceC2052l.mo528n(this);
                if (objMo528n == coroutineSingletons) {
                    return coroutineSingletons;
                }
                c0371c2 = c0371c;
                obj = objMo528n;
                aVar3 = aVar2;
                atomicReference2 = c0371c2.f1665a;
                while (!atomicReference2.compareAndSet(aVar3, null)) {
                }
                interfaceC7198b2.mo14511b(null);
                return obj;
            } catch (Throwable th4) {
                aVar3 = aVar2;
                c0371c2 = c0371c;
                th2 = th4;
                atomicReference = c0371c2.f1665a;
                while (!atomicReference.compareAndSet(aVar3, null) && atomicReference.get() == aVar3) {
                }
                throw th2;
            }
            interfaceC7198b2 = interfaceC7198b;
        } catch (Throwable th5) {
            r10.mo14511b(null);
            throw th5;
        }
    }
}
