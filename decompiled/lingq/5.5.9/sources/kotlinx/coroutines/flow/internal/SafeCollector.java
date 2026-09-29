package kotlinx.coroutines.flow.internal;

import ae.C0062b;
import androidx.datastore.preferences.PreferencesProto$Value;
import cm.InterfaceC2056p;
import com.android.installreferrer.api.InstallReferrerClient;
import dm.C5207g;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.text.C7075a;
import kotlinx.coroutines.flow.InterfaceC7117d;
import kotlinx.coroutines.internal.C7166p;
import no.InterfaceC7852n;
import no.InterfaceC7875v0;
import p349qo.C8659e;
import p349qo.C8662h;
import p464wl.InterfaceC9968c;
import p490xl.InterfaceC10223b;
import sl.C9072e;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(m13364d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u00022\u00020\u00032\u00020\u0004¨\u0006\u0005"}, m13365d2 = {"Lkotlinx/coroutines/flow/internal/SafeCollector;", "T", "Lkotlinx/coroutines/flow/d;", "Lkotlin/coroutines/jvm/internal/ContinuationImpl;", "Lxl/b;", "kotlinx-coroutines-core"}, m13366k = 1, m13367mv = {1, PreferencesProto$Value.STRING_SET_FIELD_NUMBER, InstallReferrerClient.InstallReferrerResponse.f10530OK})
public final class SafeCollector<T> extends ContinuationImpl implements InterfaceC7117d<T> {

    /* JADX INFO: renamed from: d */
    public final InterfaceC7117d<T> f40341d;

    /* JADX INFO: renamed from: e */
    public final CoroutineContext f40342e;

    /* JADX INFO: renamed from: f */
    public final int f40343f;

    /* JADX INFO: renamed from: g */
    public CoroutineContext f40344g;

    /* JADX INFO: renamed from: h */
    public InterfaceC9968c<? super C9072e> f40345h;

    /* JADX WARN: Multi-variable type inference failed */
    public SafeCollector(InterfaceC7117d<? super T> interfaceC7117d, CoroutineContext coroutineContext) {
        super(C8662h.f46240a, EmptyCoroutineContext.f38093a);
        this.f40341d = interfaceC7117d;
        this.f40342e = coroutineContext;
        this.f40343f = ((Number) coroutineContext.mo1475y0(0, new InterfaceC2056p<Integer, CoroutineContext.InterfaceC6757a, Integer>() { // from class: kotlinx.coroutines.flow.internal.SafeCollector$collectContextSize$1
            @Override // cm.InterfaceC2056p
            /* JADX INFO: renamed from: m0 */
            public final Integer mo1337m0(Integer num, CoroutineContext.InterfaceC6757a interfaceC6757a) {
                return Integer.valueOf(num.intValue() + 1);
            }
        })).intValue();
    }

    /* JADX INFO: renamed from: C */
    public final Object m14385C(InterfaceC9968c<? super C9072e> interfaceC9968c, T t10) {
        CoroutineContext coroutineContextMo2029e = interfaceC9968c.mo2029e();
        C0062b.m286L0(coroutineContextMo2029e);
        CoroutineContext coroutineContext = this.f40344g;
        if (coroutineContext != coroutineContextMo2029e) {
            if (coroutineContext instanceof C8659e) {
                throw new IllegalStateException(C7075a.m14274I2("\n            Flow exception transparency is violated:\n                Previous 'emit' call has thrown exception " + ((C8659e) coroutineContext).f46238a + ", but then emission attempt of value '" + t10 + "' has been detected.\n                Emissions from 'catch' blocks are prohibited in order to avoid unspecified behaviour, 'Flow.catch' operator can be used instead.\n                For a more detailed explanation, please refer to Flow documentation.\n            ").toString());
            }
            if (((Number) coroutineContextMo2029e.mo1475y0(0, new InterfaceC2056p<Integer, CoroutineContext.InterfaceC6757a, Integer>(this) { // from class: kotlinx.coroutines.flow.internal.SafeCollector_commonKt$checkContext$result$1

                /* JADX INFO: renamed from: b */
                public final /* synthetic */ SafeCollector<?> f40349b;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                    this.f40349b = this;
                }

                @Override // cm.InterfaceC2056p
                /* JADX INFO: renamed from: m0 */
                public final Integer mo1337m0(Integer num, CoroutineContext.InterfaceC6757a interfaceC6757a) {
                    int iIntValue = num.intValue();
                    CoroutineContext.InterfaceC6757a interfaceC6757a2 = interfaceC6757a;
                    CoroutineContext.InterfaceC6758b<?> key = interfaceC6757a2.getKey();
                    CoroutineContext.InterfaceC6757a interfaceC6757aMo1474w = this.f40349b.f40342e.mo1474w(key);
                    int i10 = InterfaceC7875v0.f42975B;
                    if (key != InterfaceC7875v0.b.f42976a) {
                        return Integer.valueOf(interfaceC6757a2 != interfaceC6757aMo1474w ? Integer.MIN_VALUE : iIntValue + 1);
                    }
                    InterfaceC7875v0 interfaceC7875v0 = (InterfaceC7875v0) interfaceC6757aMo1474w;
                    InterfaceC7875v0 parent = (InterfaceC7875v0) interfaceC6757a2;
                    while (true) {
                        if (parent != null) {
                            if (parent == interfaceC7875v0 || !(parent instanceof C7166p)) {
                                break;
                                break;
                            }
                            InterfaceC7852n interfaceC7852nM15633L = ((C7166p) parent).m15633L();
                            parent = interfaceC7852nM15633L != null ? interfaceC7852nM15633L.getParent() : null;
                        } else {
                            parent = null;
                            break;
                        }
                    }
                    if (parent == interfaceC7875v0) {
                        if (interfaceC7875v0 != null) {
                            iIntValue++;
                        }
                        return Integer.valueOf(iIntValue);
                    }
                    throw new IllegalStateException(("Flow invariant is violated:\n\t\tEmission from another coroutine is detected.\n\t\tChild of " + parent + ", expected child of " + interfaceC7875v0 + ".\n\t\tFlowCollector is not thread-safe and concurrent emissions are prohibited.\n\t\tTo mitigate this restriction please use 'channelFlow' builder instead of 'flow'").toString());
                }
            })).intValue() != this.f40343f) {
                throw new IllegalStateException(("Flow invariant is violated:\n\t\tFlow was collected in " + this.f40342e + ",\n\t\tbut emission happened in " + coroutineContextMo2029e + ".\n\t\tPlease refer to 'flow' documentation or use 'flowOn' instead").toString());
            }
            this.f40344g = coroutineContextMo2029e;
        }
        this.f40345h = interfaceC9968c;
        Object objMo1343M = SafeCollectorKt.f40347a.mo1343M(this.f40341d, t10, this);
        if (!C5207g.m11106a(objMo1343M, CoroutineSingletons.COROUTINE_SUSPENDED)) {
            this.f40345h = null;
        }
        return objMo1343M;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl, p490xl.InterfaceC10223b
    /* JADX INFO: renamed from: d */
    public final InterfaceC10223b mo13473d() {
        InterfaceC9968c<? super C9072e> interfaceC9968c = this.f40345h;
        if (interfaceC9968c instanceof InterfaceC10223b) {
            return (InterfaceC10223b) interfaceC9968c;
        }
        return null;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl, p464wl.InterfaceC9968c
    /* JADX INFO: renamed from: e */
    public final CoroutineContext mo2029e() {
        CoroutineContext coroutineContext = this.f40344g;
        if (coroutineContext == null) {
            coroutineContext = EmptyCoroutineContext.f38093a;
        }
        return coroutineContext;
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @Override // kotlinx.coroutines.flow.InterfaceC7117d
    /* JADX INFO: renamed from: r */
    public final Object mo1339r(T t10, InterfaceC9968c<? super C9072e> interfaceC9968c) {
        try {
            Object objM14385C = m14385C(interfaceC9968c, t10);
            return objM14385C == CoroutineSingletons.COROUTINE_SUSPENDED ? objM14385C : C9072e.f47360a;
        } catch (Throwable th2) {
            this.f40344g = new C8659e(interfaceC9968c.mo2029e(), th2);
            throw th2;
        }
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /* JADX INFO: renamed from: w */
    public final StackTraceElement mo13474w() {
        return null;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /* JADX INFO: renamed from: x */
    public final Object mo1338x(Object obj) {
        Throwable thM13371a = Result.m13371a(obj);
        if (thM13371a != null) {
            this.f40344g = new C8659e(mo2029e(), thM13371a);
        }
        InterfaceC9968c<? super C9072e> interfaceC9968c = this.f40345h;
        if (interfaceC9968c != null) {
            interfaceC9968c.mo2031y(obj);
        }
        return CoroutineSingletons.COROUTINE_SUSPENDED;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl, kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /* JADX INFO: renamed from: z */
    public final void mo13475z() {
        super.mo13475z();
    }
}
