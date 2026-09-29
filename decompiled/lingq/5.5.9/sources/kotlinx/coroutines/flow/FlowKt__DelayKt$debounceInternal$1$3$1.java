package kotlinx.coroutines.flow;

import androidx.datastore.preferences.PreferencesProto$Value;
import cm.InterfaceC2052l;
import com.android.installreferrer.api.InstallReferrerClient;
import dm.C5206f;
import kotlin.Metadata;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.Ref$ObjectRef;
import kotlinx.coroutines.internal.C7168r;
import p260m8.C7499b;
import p464wl.InterfaceC9968c;
import p490xl.InterfaceC10224c;
import sl.C9072e;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(m13364d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0000H\u008a@"}, m13365d2 = {"T", "Lsl/e;", "<anonymous>"}, m13366k = 3, m13367mv = {1, PreferencesProto$Value.STRING_SET_FIELD_NUMBER, InstallReferrerClient.InstallReferrerResponse.f10530OK})
@InterfaceC10224c(m19205c = "kotlinx.coroutines.flow.FlowKt__DelayKt$debounceInternal$1$3$1", m19206f = "Delay.kt", m19207l = {233}, m19208m = "invokeSuspend")
public final class FlowKt__DelayKt$debounceInternal$1$3$1 extends SuspendLambda implements InterfaceC2052l<InterfaceC9968c<? super C9072e>, Object> {

    /* JADX INFO: renamed from: e */
    public int f40068e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ InterfaceC7117d<Object> f40069f;

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ Ref$ObjectRef<Object> f40070g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FlowKt__DelayKt$debounceInternal$1$3$1(InterfaceC9968c interfaceC9968c, Ref$ObjectRef ref$ObjectRef, InterfaceC7117d interfaceC7117d) {
        super(1, interfaceC9968c);
        this.f40069f = interfaceC7117d;
        this.f40070g = ref$ObjectRef;
    }

    @Override // cm.InterfaceC2052l
    /* JADX INFO: renamed from: n */
    public final Object mo528n(InterfaceC9968c<? super C9072e> interfaceC9968c) {
        return ((FlowKt__DelayKt$debounceInternal$1$3$1) mo1353s(interfaceC9968c)).mo1338x(C9072e.f47360a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /* JADX INFO: renamed from: s */
    public final InterfaceC9968c<C9072e> mo1353s(InterfaceC9968c<?> interfaceC9968c) {
        return new FlowKt__DelayKt$debounceInternal$1$3$1(interfaceC9968c, this.f40070g, this.f40069f);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /* JADX INFO: renamed from: x */
    public final Object mo1338x(Object obj) throws Throwable {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i10 = this.f40068e;
        Ref$ObjectRef<Object> ref$ObjectRef = this.f40070g;
        if (i10 == 0) {
            C7499b.m14977z0(obj);
            C7168r c7168r = C5206f.f33272g;
            Object obj2 = ref$ObjectRef.f38127a;
            if (obj2 == c7168r) {
                obj2 = null;
            }
            this.f40068e = 1;
            if (this.f40069f.mo1339r(obj2, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C7499b.m14977z0(obj);
        }
        ref$ObjectRef.f38127a = null;
        return C9072e.f47360a;
    }
}
