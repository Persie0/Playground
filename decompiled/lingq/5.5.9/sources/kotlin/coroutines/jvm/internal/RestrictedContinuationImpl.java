package kotlin.coroutines.jvm.internal;

import com.android.installreferrer.api.InstallReferrerClient;
import kotlin.Metadata;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.EmptyCoroutineContext;
import p464wl.InterfaceC9968c;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(m13364d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b!\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m13365d2 = {"Lkotlin/coroutines/jvm/internal/RestrictedContinuationImpl;", "Lkotlin/coroutines/jvm/internal/BaseContinuationImpl;", "kotlin-stdlib"}, m13366k = 1, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
public abstract class RestrictedContinuationImpl extends BaseContinuationImpl {
    public RestrictedContinuationImpl(InterfaceC9968c<Object> interfaceC9968c) {
        super(interfaceC9968c);
        if (interfaceC9968c != null) {
            if (!(interfaceC9968c.mo2029e() == EmptyCoroutineContext.f38093a)) {
                throw new IllegalArgumentException("Coroutines with restricted suspension must have EmptyCoroutineContext".toString());
            }
        }
    }

    @Override // p464wl.InterfaceC9968c
    /* JADX INFO: renamed from: e */
    public final CoroutineContext mo2029e() {
        return EmptyCoroutineContext.f38093a;
    }
}
