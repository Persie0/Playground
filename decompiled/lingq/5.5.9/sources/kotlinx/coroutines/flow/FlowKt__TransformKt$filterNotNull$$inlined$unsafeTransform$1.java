package kotlinx.coroutines.flow;

import androidx.datastore.preferences.PreferencesProto$Value;
import com.android.installreferrer.api.InstallReferrerClient;
import kotlin.Metadata;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p260m8.C7499b;
import p464wl.InterfaceC9968c;
import p490xl.InterfaceC10224c;
import sl.C9072e;

/* JADX INFO: loaded from: classes2.dex */
public final class FlowKt__TransformKt$filterNotNull$$inlined$unsafeTransform$1 implements InterfaceC7116c<Object> {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ InterfaceC7116c f40173a;

    /* JADX INFO: renamed from: kotlinx.coroutines.flow.FlowKt__TransformKt$filterNotNull$$inlined$unsafeTransform$1$2 */
    public static final class C71042<T> implements InterfaceC7117d {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ InterfaceC7117d f40174a;

        /* JADX INFO: renamed from: kotlinx.coroutines.flow.FlowKt__TransformKt$filterNotNull$$inlined$unsafeTransform$1$2$1, reason: invalid class name */
        @Metadata(m13366k = 3, m13367mv = {1, PreferencesProto$Value.STRING_SET_FIELD_NUMBER, InstallReferrerClient.InstallReferrerResponse.f10530OK}, m13369xi = 48)
        @InterfaceC10224c(m19205c = "kotlinx.coroutines.flow.FlowKt__TransformKt$filterNotNull$$inlined$unsafeTransform$1$2", m19206f = "Transform.kt", m19207l = {223}, m19208m = "emit")
        public static final class AnonymousClass1 extends ContinuationImpl {

            /* JADX INFO: renamed from: d */
            public /* synthetic */ Object f40175d;

            /* JADX INFO: renamed from: e */
            public int f40176e;

            public AnonymousClass1(InterfaceC9968c interfaceC9968c) {
                super(interfaceC9968c);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            /* JADX INFO: renamed from: x */
            public final Object mo1338x(Object obj) {
                this.f40175d = obj;
                this.f40176e |= Integer.MIN_VALUE;
                return C71042.this.mo1339r(null, this);
            }
        }

        public C71042(InterfaceC7117d interfaceC7117d) {
            this.f40174a = interfaceC7117d;
        }

        /* JADX WARN: Code duplicated, block: B:7:0x0018  */
        @Override // kotlinx.coroutines.flow.InterfaceC7117d
        /* JADX INFO: renamed from: r */
        public final Object mo1339r(T t10, InterfaceC9968c<? super C9072e> interfaceC9968c) throws Throwable {
            AnonymousClass1 anonymousClass1;
            if (interfaceC9968c instanceof AnonymousClass1) {
                anonymousClass1 = (AnonymousClass1) interfaceC9968c;
                int i10 = anonymousClass1.f40176e;
                if ((i10 & Integer.MIN_VALUE) != 0) {
                    anonymousClass1.f40176e = i10 - Integer.MIN_VALUE;
                } else {
                    anonymousClass1 = new AnonymousClass1(interfaceC9968c);
                }
            } else {
                anonymousClass1 = new AnonymousClass1(interfaceC9968c);
            }
            Object obj = anonymousClass1.f40175d;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i11 = anonymousClass1.f40176e;
            if (i11 == 0) {
                C7499b.m14977z0(obj);
                if (t10 != null) {
                    anonymousClass1.f40176e = 1;
                    if (this.f40174a.mo1339r(t10, anonymousClass1) == coroutineSingletons) {
                        return coroutineSingletons;
                    }
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

    public FlowKt__TransformKt$filterNotNull$$inlined$unsafeTransform$1(InterfaceC7116c interfaceC7116c) {
        this.f40173a = interfaceC7116c;
    }

    @Override // kotlinx.coroutines.flow.InterfaceC7116c
    /* JADX INFO: renamed from: a */
    public final Object mo9539a(InterfaceC7117d<? super Object> interfaceC7117d, InterfaceC9968c interfaceC9968c) {
        Object objMo9539a = this.f40173a.mo9539a(new C71042(interfaceC7117d), interfaceC9968c);
        return objMo9539a == CoroutineSingletons.COROUTINE_SUSPENDED ? objMo9539a : C9072e.f47360a;
    }
}
