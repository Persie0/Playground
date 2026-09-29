package kotlinx.coroutines.flow;

import androidx.datastore.preferences.PreferencesProto$Value;
import cm.InterfaceC2056p;
import com.android.installreferrer.api.InstallReferrerClient;
import kotlin.Metadata;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.Ref$ObjectRef;
import kotlinx.coroutines.flow.internal.AbortFlowException;
import p260m8.C7499b;
import p464wl.InterfaceC9968c;
import p490xl.InterfaceC10224c;
import sl.C9072e;

/* JADX INFO: loaded from: classes2.dex */
public final class FlowKt__ReduceKt$first$$inlined$collectWhile$2 implements InterfaceC7117d<Object> {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ InterfaceC2056p f40141a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Ref$ObjectRef f40142b;

    /* JADX INFO: renamed from: kotlinx.coroutines.flow.FlowKt__ReduceKt$first$$inlined$collectWhile$2$1 */
    @Metadata(m13366k = 3, m13367mv = {1, PreferencesProto$Value.STRING_SET_FIELD_NUMBER, InstallReferrerClient.InstallReferrerResponse.f10530OK}, m13369xi = 48)
    @InterfaceC10224c(m19205c = "kotlinx.coroutines.flow.FlowKt__ReduceKt$first$$inlined$collectWhile$2", m19206f = "Reduce.kt", m19207l = {142}, m19208m = "emit")
    public static final class C71011 extends ContinuationImpl {

        /* JADX INFO: renamed from: d */
        public FlowKt__ReduceKt$first$$inlined$collectWhile$2 f40143d;

        /* JADX INFO: renamed from: e */
        public /* synthetic */ Object f40144e;

        /* JADX INFO: renamed from: f */
        public int f40145f;

        /* JADX INFO: renamed from: h */
        public Object f40147h;

        public C71011(InterfaceC9968c interfaceC9968c) {
            super(interfaceC9968c);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /* JADX INFO: renamed from: x */
        public final Object mo1338x(Object obj) {
            this.f40144e = obj;
            this.f40145f |= Integer.MIN_VALUE;
            return FlowKt__ReduceKt$first$$inlined$collectWhile$2.this.mo1339r(null, this);
        }
    }

    public FlowKt__ReduceKt$first$$inlined$collectWhile$2(InterfaceC2056p interfaceC2056p, Ref$ObjectRef ref$ObjectRef) {
        this.f40141a = interfaceC2056p;
        this.f40142b = ref$ObjectRef;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x001a  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @Override // kotlinx.coroutines.flow.InterfaceC7117d
    /* JADX INFO: renamed from: r */
    public final Object mo1339r(Object obj, InterfaceC9968c<? super C9072e> interfaceC9968c) throws Throwable {
        C71011 c71011;
        FlowKt__ReduceKt$first$$inlined$collectWhile$2 flowKt__ReduceKt$first$$inlined$collectWhile$2;
        T t10;
        if (interfaceC9968c instanceof C71011) {
            c71011 = (C71011) interfaceC9968c;
            int i10 = c71011.f40145f;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                c71011.f40145f = i10 - Integer.MIN_VALUE;
            } else {
                c71011 = new C71011(interfaceC9968c);
            }
        } else {
            c71011 = new C71011(interfaceC9968c);
        }
        Object objMo1337m0 = c71011.f40144e;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i11 = c71011.f40145f;
        boolean z10 = true;
        if (i11 == 0) {
            C7499b.m14977z0(objMo1337m0);
            c71011.f40143d = this;
            c71011.f40147h = obj;
            c71011.f40145f = 1;
            objMo1337m0 = this.f40141a.mo1337m0(obj, c71011);
            if (objMo1337m0 == coroutineSingletons) {
                return coroutineSingletons;
            }
            flowKt__ReduceKt$first$$inlined$collectWhile$2 = this;
            t10 = obj;
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            Object obj2 = c71011.f40147h;
            flowKt__ReduceKt$first$$inlined$collectWhile$2 = c71011.f40143d;
            C7499b.m14977z0(objMo1337m0);
            t10 = obj2;
        }
        if (((Boolean) objMo1337m0).booleanValue()) {
            flowKt__ReduceKt$first$$inlined$collectWhile$2.f40142b.f38127a = t10;
            z10 = false;
        }
        if (z10) {
            return C9072e.f47360a;
        }
        throw new AbortFlowException(flowKt__ReduceKt$first$$inlined$collectWhile$2);
    }
}
