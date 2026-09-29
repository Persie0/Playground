package kotlinx.coroutines.flow;

import androidx.datastore.preferences.PreferencesProto$Value;
import cm.InterfaceC2056p;
import cm.InterfaceC2057q;
import cm.InterfaceC2059s;
import com.android.installreferrer.api.InstallReferrerClient;
import kotlin.Metadata;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.internal.C7127c;
import p260m8.C7499b;
import p464wl.InterfaceC9968c;
import p490xl.InterfaceC10224c;
import sl.C9072e;

/* JADX INFO: renamed from: kotlinx.coroutines.flow.FlowKt__ZipKt$combineTransform$$inlined$combineTransformUnsafe$FlowKt__ZipKt$3 */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(m13364d1 = {"\u0000\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0004\u001a\u00020\u0003\"\u0006\b\u0000\u0010\u0000\u0018\u0001\"\u0004\b\u0001\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00010\u0002H\u008a@"}, m13365d2 = {"T", "R", "Lkotlinx/coroutines/flow/d;", "Lsl/e;", "<anonymous>"}, m13366k = 3, m13367mv = {1, PreferencesProto$Value.STRING_SET_FIELD_NUMBER, InstallReferrerClient.InstallReferrerResponse.f10530OK})
@InterfaceC10224c(m19205c = "kotlinx.coroutines.flow.FlowKt__ZipKt$combineTransform$$inlined$combineTransformUnsafe$FlowKt__ZipKt$3", m19206f = "Zip.kt", m19207l = {273}, m19208m = "invokeSuspend")
public final class C7111xd7c321e8 extends SuspendLambda implements InterfaceC2056p<InterfaceC7117d<Object>, InterfaceC9968c<? super C9072e>, Object> {

    /* JADX INFO: renamed from: e */
    public int f40225e;

    /* JADX INFO: renamed from: f */
    public /* synthetic */ Object f40226f;

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ InterfaceC7116c[] f40227g;

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ InterfaceC2059s f40228h;

    /* JADX INFO: renamed from: kotlinx.coroutines.flow.FlowKt__ZipKt$combineTransform$$inlined$combineTransformUnsafe$FlowKt__ZipKt$3$1, reason: invalid class name */
    @Metadata(m13364d1 = {"\u0000\u0014\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0006\u001a\u00020\u0005\"\u0006\b\u0000\u0010\u0000\u0018\u0001\"\u0004\b\u0001\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00010\u00022\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003H\u008a@"}, m13365d2 = {"T", "R", "Lkotlinx/coroutines/flow/d;", "", "it", "Lsl/e;", "<anonymous>"}, m13366k = 3, m13367mv = {1, PreferencesProto$Value.STRING_SET_FIELD_NUMBER, InstallReferrerClient.InstallReferrerResponse.f10530OK})
    @InterfaceC10224c(m19205c = "kotlinx.coroutines.flow.FlowKt__ZipKt$combineTransform$$inlined$combineTransformUnsafe$FlowKt__ZipKt$3$1", m19206f = "Zip.kt", m19207l = {333}, m19208m = "invokeSuspend")
    public static final class AnonymousClass1 extends SuspendLambda implements InterfaceC2057q<InterfaceC7117d<Object>, Object[], InterfaceC9968c<? super C9072e>, Object> {

        /* JADX INFO: renamed from: e */
        public int f40229e;

        /* JADX INFO: renamed from: f */
        public /* synthetic */ InterfaceC7117d f40230f;

        /* JADX INFO: renamed from: g */
        public /* synthetic */ Object[] f40231g;

        /* JADX INFO: renamed from: h */
        public final /* synthetic */ InterfaceC2059s f40232h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(InterfaceC9968c interfaceC9968c, InterfaceC2059s interfaceC2059s) {
            super(3, interfaceC9968c);
            this.f40232h = interfaceC2059s;
        }

        @Override // cm.InterfaceC2057q
        /* JADX INFO: renamed from: M */
        public final Object mo1343M(InterfaceC7117d<Object> interfaceC7117d, Object[] objArr, InterfaceC9968c<? super C9072e> interfaceC9968c) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(interfaceC9968c, this.f40232h);
            anonymousClass1.f40230f = interfaceC7117d;
            anonymousClass1.f40231g = objArr;
            return anonymousClass1.mo1338x(C9072e.f47360a);
        }

        /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /* JADX INFO: renamed from: x */
        public final Object mo1338x(Object obj) throws Throwable {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i10 = this.f40229e;
            if (i10 == 0) {
                C7499b.m14977z0(obj);
                InterfaceC7117d interfaceC7117d = this.f40230f;
                Object[] objArr = this.f40231g;
                InterfaceC2059s interfaceC2059s = this.f40232h;
                Object obj2 = objArr[0];
                Object obj3 = objArr[1];
                Object obj4 = objArr[2];
                this.f40229e = 1;
                if (interfaceC2059s.mo1501o0(interfaceC7117d, obj2, obj3, obj4, this) == coroutineSingletons) {
                    return coroutineSingletons;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C7499b.m14977z0(obj);
            }
            return C9072e.f47360a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C7111xd7c321e8(InterfaceC7116c[] interfaceC7116cArr, InterfaceC9968c interfaceC9968c, InterfaceC2059s interfaceC2059s) {
        super(2, interfaceC9968c);
        this.f40227g = interfaceC7116cArr;
        this.f40228h = interfaceC2059s;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /* JADX INFO: renamed from: a */
    public final InterfaceC9968c<C9072e> mo1336a(Object obj, InterfaceC9968c<?> interfaceC9968c) {
        C7111xd7c321e8 c7111xd7c321e8 = new C7111xd7c321e8(this.f40227g, interfaceC9968c, this.f40228h);
        c7111xd7c321e8.f40226f = obj;
        return c7111xd7c321e8;
    }

    @Override // cm.InterfaceC2056p
    /* JADX INFO: renamed from: m0 */
    public final Object mo1337m0(InterfaceC7117d<Object> interfaceC7117d, InterfaceC9968c<? super C9072e> interfaceC9968c) {
        return ((C7111xd7c321e8) mo1336a(interfaceC7117d, interfaceC9968c)).mo1338x(C9072e.f47360a);
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /* JADX INFO: renamed from: x */
    public final Object mo1338x(Object obj) throws Throwable {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i10 = this.f40225e;
        if (i10 == 0) {
            C7499b.m14977z0(obj);
            InterfaceC7117d interfaceC7117d = (InterfaceC7117d) this.f40226f;
            FlowKt__ZipKt$nullArrayFactory$1 flowKt__ZipKt$nullArrayFactory$1 = FlowKt__ZipKt$nullArrayFactory$1.f40241b;
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(null, this.f40228h);
            this.f40225e = 1;
            if (C7127c.m14386a(this, flowKt__ZipKt$nullArrayFactory$1, anonymousClass1, interfaceC7117d, this.f40227g) == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C7499b.m14977z0(obj);
        }
        return C9072e.f47360a;
    }
}
