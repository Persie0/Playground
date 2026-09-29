package kotlinx.coroutines.flow;

import androidx.datastore.preferences.PreferencesProto$Value;
import cm.InterfaceC2057q;
import com.android.installreferrer.api.InstallReferrerClient;
import kotlin.Metadata;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p260m8.C7499b;
import p464wl.InterfaceC9968c;
import p490xl.InterfaceC10224c;
import sl.C9072e;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(m13364d1 = {"\u0000\u0018\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\b\u001a\u00020\u0007\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001\"\u0004\b\u0002\u0010\u0002*\b\u0012\u0004\u0012\u00028\u00020\u00032\u000e\u0010\u0006\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0004H\u008a@"}, m13365d2 = {"T1", "T2", "R", "Lkotlinx/coroutines/flow/d;", "", "", "it", "Lsl/e;", "<anonymous>"}, m13366k = 3, m13367mv = {1, PreferencesProto$Value.STRING_SET_FIELD_NUMBER, InstallReferrerClient.InstallReferrerResponse.f10530OK})
@InterfaceC10224c(m19205c = "kotlinx.coroutines.flow.FlowKt__ZipKt$combine$1$1", m19206f = "Zip.kt", m19207l = {33, 33}, m19208m = "invokeSuspend")
final class FlowKt__ZipKt$combine$1$1 extends SuspendLambda implements InterfaceC2057q<InterfaceC7117d<Object>, Object[], InterfaceC9968c<? super C9072e>, Object> {

    /* JADX INFO: renamed from: e */
    public int f40205e;

    /* JADX INFO: renamed from: f */
    public /* synthetic */ InterfaceC7117d f40206f;

    /* JADX INFO: renamed from: g */
    public /* synthetic */ Object[] f40207g;

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ InterfaceC2057q<Object, Object, InterfaceC9968c<Object>, Object> f40208h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public FlowKt__ZipKt$combine$1$1(InterfaceC2057q<Object, Object, ? super InterfaceC9968c<Object>, ? extends Object> interfaceC2057q, InterfaceC9968c<? super FlowKt__ZipKt$combine$1$1> interfaceC9968c) {
        super(3, interfaceC9968c);
        this.f40208h = interfaceC2057q;
    }

    @Override // cm.InterfaceC2057q
    /* JADX INFO: renamed from: M */
    public final Object mo1343M(InterfaceC7117d<Object> interfaceC7117d, Object[] objArr, InterfaceC9968c<? super C9072e> interfaceC9968c) {
        FlowKt__ZipKt$combine$1$1 flowKt__ZipKt$combine$1$1 = new FlowKt__ZipKt$combine$1$1(this.f40208h, interfaceC9968c);
        flowKt__ZipKt$combine$1$1.f40206f = interfaceC7117d;
        flowKt__ZipKt$combine$1$1.f40207g = objArr;
        return flowKt__ZipKt$combine$1$1.mo1338x(C9072e.f47360a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /* JADX INFO: renamed from: x */
    public final Object mo1338x(Object obj) throws Throwable {
        InterfaceC7117d interfaceC7117d;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i10 = this.f40205e;
        if (i10 != 0) {
            if (i10 == 1) {
                interfaceC7117d = this.f40206f;
                C7499b.m14977z0(obj);
            } else {
                if (i10 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C7499b.m14977z0(obj);
            }
            return C9072e.f47360a;
        }
        C7499b.m14977z0(obj);
        interfaceC7117d = this.f40206f;
        Object[] objArr = this.f40207g;
        Object obj2 = objArr[0];
        Object obj3 = objArr[1];
        this.f40206f = interfaceC7117d;
        this.f40205e = 1;
        obj = this.f40208h.mo1343M(obj2, obj3, this);
        if (obj == coroutineSingletons) {
            return coroutineSingletons;
        }
        this.f40206f = null;
        this.f40205e = 2;
        if (interfaceC7117d.mo1339r(obj, this) == coroutineSingletons) {
            return coroutineSingletons;
        }
        return C9072e.f47360a;
    }
}
