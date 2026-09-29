package kotlinx.coroutines.flow;

import androidx.datastore.preferences.PreferencesProto$Value;
import cm.InterfaceC2056p;
import com.android.installreferrer.api.InstallReferrerClient;
import dm.C5206f;
import kotlin.Metadata;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p260m8.C7499b;
import p325po.InterfaceC8436l;
import p464wl.InterfaceC9968c;
import p490xl.InterfaceC10224c;
import sl.C9072e;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(m13364d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0004\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00020\u00020\u0001H\u008a@"}, m13365d2 = {"T", "Lpo/l;", "", "Lsl/e;", "<anonymous>"}, m13366k = 3, m13367mv = {1, PreferencesProto$Value.STRING_SET_FIELD_NUMBER, InstallReferrerClient.InstallReferrerResponse.f10530OK})
@InterfaceC10224c(m19205c = "kotlinx.coroutines.flow.FlowKt__DelayKt$debounceInternal$1$values$1", m19206f = "Delay.kt", m19207l = {211}, m19208m = "invokeSuspend")
public final class FlowKt__DelayKt$debounceInternal$1$values$1 extends SuspendLambda implements InterfaceC2056p<InterfaceC8436l<? super Object>, InterfaceC9968c<? super C9072e>, Object> {

    /* JADX INFO: renamed from: e */
    public int f40076e;

    /* JADX INFO: renamed from: f */
    public /* synthetic */ Object f40077f;

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ InterfaceC7116c<Object> f40078g;

    /* JADX INFO: renamed from: kotlinx.coroutines.flow.FlowKt__DelayKt$debounceInternal$1$values$1$1 */
    public static final class C70951<T> implements InterfaceC7117d {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ InterfaceC8436l<Object> f40079a;

        public C70951(InterfaceC8436l<Object> interfaceC8436l) {
            this.f40079a = interfaceC8436l;
        }

        /* JADX WARN: Code duplicated, block: B:7:0x001a  */
        /* JADX WARN: Type inference fix 'apply assigned field type' failed
        java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
        	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
        	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
        	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
         */
        @Override // kotlinx.coroutines.flow.InterfaceC7117d
        /* JADX INFO: renamed from: r */
        public final Object mo1339r(T t10, InterfaceC9968c<? super C9072e> interfaceC9968c) throws Throwable {
            FlowKt__DelayKt$debounceInternal$1$values$1$1$emit$1 flowKt__DelayKt$debounceInternal$1$values$1$1$emit$1;
            if (interfaceC9968c instanceof FlowKt__DelayKt$debounceInternal$1$values$1$1$emit$1) {
                flowKt__DelayKt$debounceInternal$1$values$1$1$emit$1 = (FlowKt__DelayKt$debounceInternal$1$values$1$1$emit$1) interfaceC9968c;
                int i10 = flowKt__DelayKt$debounceInternal$1$values$1$1$emit$1.f40082f;
                if ((i10 & Integer.MIN_VALUE) != 0) {
                    flowKt__DelayKt$debounceInternal$1$values$1$1$emit$1.f40082f = i10 - Integer.MIN_VALUE;
                } else {
                    flowKt__DelayKt$debounceInternal$1$values$1$1$emit$1 = new FlowKt__DelayKt$debounceInternal$1$values$1$1$emit$1(this, interfaceC9968c);
                }
            } else {
                flowKt__DelayKt$debounceInternal$1$values$1$1$emit$1 = new FlowKt__DelayKt$debounceInternal$1$values$1$1$emit$1(this, interfaceC9968c);
            }
            Object obj = flowKt__DelayKt$debounceInternal$1$values$1$1$emit$1.f40080d;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i11 = flowKt__DelayKt$debounceInternal$1$values$1$1$emit$1.f40082f;
            if (i11 == 0) {
                C7499b.m14977z0(obj);
                if (t10 == null) {
                    t10 = (T) C5206f.f33272g;
                }
                flowKt__DelayKt$debounceInternal$1$values$1$1$emit$1.f40082f = 1;
                if (this.f40079a.mo16480k(t10, flowKt__DelayKt$debounceInternal$1$values$1$1$emit$1) == coroutineSingletons) {
                    return coroutineSingletons;
                }
            } else {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C7499b.m14977z0(obj);
            }
            return C9072e.f47360a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FlowKt__DelayKt$debounceInternal$1$values$1(InterfaceC7116c<Object> interfaceC7116c, InterfaceC9968c<? super FlowKt__DelayKt$debounceInternal$1$values$1> interfaceC9968c) {
        super(2, interfaceC9968c);
        this.f40078g = interfaceC7116c;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /* JADX INFO: renamed from: a */
    public final InterfaceC9968c<C9072e> mo1336a(Object obj, InterfaceC9968c<?> interfaceC9968c) {
        FlowKt__DelayKt$debounceInternal$1$values$1 flowKt__DelayKt$debounceInternal$1$values$1 = new FlowKt__DelayKt$debounceInternal$1$values$1(this.f40078g, interfaceC9968c);
        flowKt__DelayKt$debounceInternal$1$values$1.f40077f = obj;
        return flowKt__DelayKt$debounceInternal$1$values$1;
    }

    @Override // cm.InterfaceC2056p
    /* JADX INFO: renamed from: m0 */
    public final Object mo1337m0(InterfaceC8436l<? super Object> interfaceC8436l, InterfaceC9968c<? super C9072e> interfaceC9968c) {
        return ((FlowKt__DelayKt$debounceInternal$1$values$1) mo1336a(interfaceC8436l, interfaceC9968c)).mo1338x(C9072e.f47360a);
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /* JADX INFO: renamed from: x */
    public final Object mo1338x(Object obj) throws Throwable {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i10 = this.f40076e;
        if (i10 == 0) {
            C7499b.m14977z0(obj);
            C70951 c70951 = new C70951((InterfaceC8436l) this.f40077f);
            this.f40076e = 1;
            if (this.f40078g.mo9539a(c70951, this) == coroutineSingletons) {
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
