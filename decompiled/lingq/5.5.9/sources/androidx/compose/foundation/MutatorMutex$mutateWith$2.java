package androidx.compose.foundation;

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
import kotlinx.coroutines.sync.MutexImpl;
import no.InterfaceC7875v0;
import no.InterfaceC7882z;
import p260m8.C7499b;
import p464wl.InterfaceC9968c;
import p490xl.InterfaceC10224c;
import sl.C9072e;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m13364d1 = {"\u0000\n\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0003\u001a\u00028\u0001\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\u00020\u0002H\u008a@"}, m13365d2 = {"T", "R", "Lno/z;", "<anonymous>"}, m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
@InterfaceC10224c(m19205c = "androidx.compose.foundation.MutatorMutex$mutateWith$2", m19206f = "MutatorMutex.kt", m19207l = {173, 160}, m19208m = "invokeSuspend")
final class MutatorMutex$mutateWith$2 extends SuspendLambda implements InterfaceC2056p<InterfaceC7882z, InterfaceC9968c<Object>, Object> {

    /* JADX INFO: renamed from: H */
    public final /* synthetic */ InterfaceC2056p<Object, InterfaceC9968c<Object>, Object> f1891H;

    /* JADX INFO: renamed from: I */
    public final /* synthetic */ Object f1892I;

    /* JADX INFO: renamed from: e */
    public InterfaceC7198b f1893e;

    /* JADX INFO: renamed from: f */
    public Object f1894f;

    /* JADX INFO: renamed from: g */
    public Object f1895g;

    /* JADX INFO: renamed from: h */
    public C0392d f1896h;

    /* JADX INFO: renamed from: i */
    public int f1897i;

    /* JADX INFO: renamed from: j */
    public /* synthetic */ Object f1898j;

    /* JADX INFO: renamed from: k */
    public final /* synthetic */ MutatePriority f1899k;

    /* JADX INFO: renamed from: l */
    public final /* synthetic */ C0392d f1900l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public MutatorMutex$mutateWith$2(MutatePriority mutatePriority, C0392d c0392d, InterfaceC2056p<Object, ? super InterfaceC9968c<Object>, ? extends Object> interfaceC2056p, Object obj, InterfaceC9968c<? super MutatorMutex$mutateWith$2> interfaceC9968c) {
        super(2, interfaceC9968c);
        this.f1899k = mutatePriority;
        this.f1900l = c0392d;
        this.f1891H = interfaceC2056p;
        this.f1892I = obj;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /* JADX INFO: renamed from: a */
    public final InterfaceC9968c<C9072e> mo1336a(Object obj, InterfaceC9968c<?> interfaceC9968c) {
        MutatorMutex$mutateWith$2 mutatorMutex$mutateWith$2 = new MutatorMutex$mutateWith$2(this.f1899k, this.f1900l, this.f1891H, this.f1892I, interfaceC9968c);
        mutatorMutex$mutateWith$2.f1898j = obj;
        return mutatorMutex$mutateWith$2;
    }

    @Override // cm.InterfaceC2056p
    /* JADX INFO: renamed from: m0 */
    public final Object mo1337m0(InterfaceC7882z interfaceC7882z, InterfaceC9968c<Object> interfaceC9968c) {
        return ((MutatorMutex$mutateWith$2) mo1336a(interfaceC7882z, interfaceC9968c)).mo1338x(C9072e.f47360a);
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [int, kotlinx.coroutines.sync.b] */
    /* JADX WARN: Unreachable blocks removed: 3, instructions: 3 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /* JADX INFO: renamed from: x */
    public final Object mo1338x(Object obj) throws Throwable {
        C0392d c0392d;
        C0392d.a aVar;
        boolean z10;
        Object obj2;
        C0392d.a aVar2;
        InterfaceC7198b interfaceC7198b;
        InterfaceC2056p<Object, InterfaceC9968c<Object>, Object> interfaceC2056p;
        C0392d.a aVar3;
        C0392d c0392d2;
        Throwable th2;
        AtomicReference<C0392d.a> atomicReference;
        AtomicReference<C0392d.a> atomicReference2;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        ?? r10 = this.f1897i;
        try {
            try {
                if (r10 == 0) {
                    C7499b.m14977z0(obj);
                    CoroutineContext.InterfaceC6757a interfaceC6757aMo1474w = ((InterfaceC7882z) this.f1898j).getF6528b().mo1474w(InterfaceC7875v0.b.f42976a);
                    C5207g.m11108c(interfaceC6757aMo1474w);
                    C0392d.a aVar4 = new C0392d.a(this.f1899k, (InterfaceC7875v0) interfaceC6757aMo1474w);
                    do {
                        c0392d = this.f1900l;
                        AtomicReference<C0392d.a> atomicReference3 = c0392d.f1946a;
                        aVar = atomicReference3.get();
                        z10 = false;
                        if (aVar != null) {
                            if (!(aVar4.f1948a.compareTo(aVar.f1948a) >= 0)) {
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
                        aVar.f1949b.mo15618a(null);
                    }
                    this.f1898j = aVar4;
                    MutexImpl mutexImpl = c0392d.f1947b;
                    this.f1893e = mutexImpl;
                    InterfaceC2056p<Object, InterfaceC9968c<Object>, Object> interfaceC2056p2 = this.f1891H;
                    this.f1894f = interfaceC2056p2;
                    Object obj3 = this.f1892I;
                    this.f1895g = obj3;
                    this.f1896h = c0392d;
                    this.f1897i = 1;
                    if (mutexImpl.mo14510a(null, this) == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                    obj2 = obj3;
                    aVar2 = aVar4;
                    interfaceC7198b = mutexImpl;
                    interfaceC2056p = interfaceC2056p2;
                } else {
                    if (r10 != 1) {
                        if (r10 != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        c0392d2 = (C0392d) this.f1894f;
                        interfaceC7198b = this.f1893e;
                        aVar3 = (C0392d.a) this.f1898j;
                        try {
                            C7499b.m14977z0(obj);
                            atomicReference2 = c0392d2.f1946a;
                            while (!atomicReference2.compareAndSet(aVar3, null) && atomicReference2.get() == aVar3) {
                            }
                            interfaceC7198b.mo14511b(null);
                            return obj;
                        } catch (Throwable th3) {
                            th2 = th3;
                            atomicReference = c0392d2.f1946a;
                            while (!atomicReference.compareAndSet(aVar3, null) && atomicReference.get() == aVar3) {
                            }
                            throw th2;
                        }
                    }
                    C0392d c0392d3 = this.f1896h;
                    obj2 = this.f1895g;
                    interfaceC2056p = (InterfaceC2056p) this.f1894f;
                    InterfaceC7198b interfaceC7198b2 = this.f1893e;
                    aVar2 = (C0392d.a) this.f1898j;
                    C7499b.m14977z0(obj);
                    c0392d = c0392d3;
                    interfaceC7198b = interfaceC7198b2;
                }
                this.f1898j = aVar2;
                this.f1893e = interfaceC7198b;
                this.f1894f = c0392d;
                this.f1895g = null;
                this.f1896h = null;
                this.f1897i = 2;
                Object objMo1337m0 = interfaceC2056p.mo1337m0(obj2, this);
                if (objMo1337m0 == coroutineSingletons) {
                    return coroutineSingletons;
                }
                c0392d2 = c0392d;
                obj = objMo1337m0;
                aVar3 = aVar2;
                atomicReference2 = c0392d2.f1946a;
                while (!atomicReference2.compareAndSet(aVar3, null)) {
                }
                interfaceC7198b.mo14511b(null);
                return obj;
            } catch (Throwable th4) {
                aVar3 = aVar2;
                c0392d2 = c0392d;
                th2 = th4;
                atomicReference = c0392d2.f1946a;
                while (!atomicReference.compareAndSet(aVar3, null)) {
                }
                throw th2;
            }
        } catch (Throwable th5) {
            r10.mo14511b(null);
            throw th5;
        }
    }
}
