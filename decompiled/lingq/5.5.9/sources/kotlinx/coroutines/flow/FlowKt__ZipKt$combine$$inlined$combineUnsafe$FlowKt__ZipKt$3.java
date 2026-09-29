package kotlinx.coroutines.flow;

import androidx.datastore.preferences.PreferencesProto$Value;
import cm.InterfaceC2057q;
import cm.InterfaceC2060t;
import com.android.installreferrer.api.InstallReferrerClient;
import kotlin.Metadata;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.internal.C7127c;
import p260m8.C7499b;
import p464wl.InterfaceC9968c;
import p490xl.InterfaceC10224c;
import sl.C9072e;

/* JADX INFO: loaded from: classes2.dex */
public final class FlowKt__ZipKt$combine$$inlined$combineUnsafe$FlowKt__ZipKt$3 implements InterfaceC7116c<Object> {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ InterfaceC7116c[] f40199a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ InterfaceC2060t f40200b;

    /* JADX INFO: renamed from: kotlinx.coroutines.flow.FlowKt__ZipKt$combine$$inlined$combineUnsafe$FlowKt__ZipKt$3$2 */
    @Metadata(m13364d1 = {"\u0000\u0014\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0006\u001a\u00020\u0005\"\u0006\b\u0000\u0010\u0000\u0018\u0001\"\u0004\b\u0001\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00010\u00022\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003H\u008a@"}, m13365d2 = {"T", "R", "Lkotlinx/coroutines/flow/d;", "", "it", "Lsl/e;", "<anonymous>"}, m13366k = 3, m13367mv = {1, PreferencesProto$Value.STRING_SET_FIELD_NUMBER, InstallReferrerClient.InstallReferrerResponse.f10530OK})
    @InterfaceC10224c(m19205c = "kotlinx.coroutines.flow.FlowKt__ZipKt$combine$$inlined$combineUnsafe$FlowKt__ZipKt$3$2", m19206f = "Zip.kt", m19207l = {333, 333}, m19208m = "invokeSuspend")
    public static final class C71082 extends SuspendLambda implements InterfaceC2057q<InterfaceC7117d<Object>, Object[], InterfaceC9968c<? super C9072e>, Object> {

        /* JADX INFO: renamed from: e */
        public int f40201e;

        /* JADX INFO: renamed from: f */
        public /* synthetic */ InterfaceC7117d f40202f;

        /* JADX INFO: renamed from: g */
        public /* synthetic */ Object[] f40203g;

        /* JADX INFO: renamed from: h */
        public final /* synthetic */ InterfaceC2060t f40204h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C71082(InterfaceC9968c interfaceC9968c, InterfaceC2060t interfaceC2060t) {
            super(3, interfaceC9968c);
            this.f40204h = interfaceC2060t;
        }

        @Override // cm.InterfaceC2057q
        /* JADX INFO: renamed from: M */
        public final Object mo1343M(InterfaceC7117d<Object> interfaceC7117d, Object[] objArr, InterfaceC9968c<? super C9072e> interfaceC9968c) {
            C71082 c71082 = new C71082(interfaceC9968c, this.f40204h);
            c71082.f40202f = interfaceC7117d;
            c71082.f40203g = objArr;
            return c71082.mo1338x(C9072e.f47360a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /* JADX INFO: renamed from: x */
        public final Object mo1338x(Object obj) throws Throwable {
            InterfaceC7117d interfaceC7117d;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i10 = this.f40201e;
            if (i10 != 0) {
                if (i10 == 1) {
                    interfaceC7117d = this.f40202f;
                    C7499b.m14977z0(obj);
                } else {
                    if (i10 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    C7499b.m14977z0(obj);
                }
            }
            C7499b.m14977z0(obj);
            interfaceC7117d = this.f40202f;
            Object[] objArr = this.f40203g;
            InterfaceC2060t interfaceC2060t = this.f40204h;
            Object obj2 = objArr[0];
            Object obj3 = objArr[1];
            Object obj4 = objArr[2];
            Object obj5 = objArr[3];
            Object obj6 = objArr[4];
            this.f40202f = interfaceC7117d;
            this.f40201e = 1;
            obj = interfaceC2060t.mo1858g0(obj2, obj3, obj4, obj5, obj6, this);
            if (obj == coroutineSingletons) {
                return coroutineSingletons;
            }
            this.f40202f = null;
            this.f40201e = 2;
            return interfaceC7117d.mo1339r(obj, this) == coroutineSingletons ? coroutineSingletons : C9072e.f47360a;
        }
    }

    public FlowKt__ZipKt$combine$$inlined$combineUnsafe$FlowKt__ZipKt$3(InterfaceC7116c[] interfaceC7116cArr, InterfaceC2060t interfaceC2060t) {
        this.f40199a = interfaceC7116cArr;
        this.f40200b = interfaceC2060t;
    }

    @Override // kotlinx.coroutines.flow.InterfaceC7116c
    /* JADX INFO: renamed from: a */
    public final Object mo9539a(InterfaceC7117d<? super Object> interfaceC7117d, InterfaceC9968c interfaceC9968c) throws Throwable {
        Object objM14386a = C7127c.m14386a(interfaceC9968c, FlowKt__ZipKt$nullArrayFactory$1.f40241b, new C71082(null, this.f40200b), interfaceC7117d, this.f40199a);
        return objM14386a == CoroutineSingletons.COROUTINE_SUSPENDED ? objM14386a : C9072e.f47360a;
    }
}
