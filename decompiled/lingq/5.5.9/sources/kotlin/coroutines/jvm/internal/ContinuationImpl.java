package kotlin.coroutines.jvm.internal;

import com.android.installreferrer.api.InstallReferrerClient;
import dm.C5207g;
import kotlin.Metadata;
import kotlin.coroutines.CoroutineContext;
import p464wl.InterfaceC9968c;
import p464wl.InterfaceC9969d;
import p490xl.C10222a;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(m13364d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b!\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m13365d2 = {"Lkotlin/coroutines/jvm/internal/ContinuationImpl;", "Lkotlin/coroutines/jvm/internal/BaseContinuationImpl;", "kotlin-stdlib"}, m13366k = 1, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
public abstract class ContinuationImpl extends BaseContinuationImpl {

    /* JADX INFO: renamed from: b */
    public final CoroutineContext f38105b;

    /* JADX INFO: renamed from: c */
    public transient InterfaceC9968c<Object> f38106c;

    public ContinuationImpl(InterfaceC9968c<Object> interfaceC9968c) {
        this(interfaceC9968c, interfaceC9968c != null ? interfaceC9968c.mo2029e() : null);
    }

    public ContinuationImpl(InterfaceC9968c<Object> interfaceC9968c, CoroutineContext coroutineContext) {
        super(interfaceC9968c);
        this.f38105b = coroutineContext;
    }

    @Override // p464wl.InterfaceC9968c
    /* JADX INFO: renamed from: e */
    public CoroutineContext mo2029e() {
        CoroutineContext coroutineContext = this.f38105b;
        C5207g.m11108c(coroutineContext);
        return coroutineContext;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /* JADX INFO: renamed from: z */
    public void mo13475z() {
        InterfaceC9968c<?> interfaceC9968c = this.f38106c;
        if (interfaceC9968c != null && interfaceC9968c != this) {
            CoroutineContext coroutineContextMo2029e = mo2029e();
            int i10 = InterfaceC9969d.f50691G;
            CoroutineContext.InterfaceC6757a interfaceC6757aMo1474w = coroutineContextMo2029e.mo1474w(InterfaceC9969d.a.f50692a);
            C5207g.m11108c(interfaceC6757aMo1474w);
            ((InterfaceC9969d) interfaceC6757aMo1474w).mo14312l(interfaceC9968c);
        }
        this.f38106c = C10222a.f51641a;
    }
}
