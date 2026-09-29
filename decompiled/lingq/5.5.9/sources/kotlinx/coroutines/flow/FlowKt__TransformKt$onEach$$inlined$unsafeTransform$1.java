package kotlinx.coroutines.flow;

import androidx.datastore.preferences.PreferencesProto$Value;
import cm.InterfaceC2056p;
import com.android.installreferrer.api.InstallReferrerClient;
import kotlin.Metadata;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p260m8.C7499b;
import p464wl.InterfaceC9968c;
import p490xl.InterfaceC10224c;
import sl.C9072e;

/* JADX INFO: loaded from: classes2.dex */
public final class FlowKt__TransformKt$onEach$$inlined$unsafeTransform$1 implements InterfaceC7116c<Object> {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ InterfaceC7116c f40178a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ InterfaceC2056p f40179b;

    /* JADX INFO: renamed from: kotlinx.coroutines.flow.FlowKt__TransformKt$onEach$$inlined$unsafeTransform$1$2 */
    public static final class C71052<T> implements InterfaceC7117d {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ InterfaceC7117d f40180a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ InterfaceC2056p f40181b;

        /* JADX INFO: renamed from: kotlinx.coroutines.flow.FlowKt__TransformKt$onEach$$inlined$unsafeTransform$1$2$1, reason: invalid class name */
        @Metadata(m13366k = 3, m13367mv = {1, PreferencesProto$Value.STRING_SET_FIELD_NUMBER, InstallReferrerClient.InstallReferrerResponse.f10530OK}, m13369xi = 48)
        @InterfaceC10224c(m19205c = "kotlinx.coroutines.flow.FlowKt__TransformKt$onEach$$inlined$unsafeTransform$1$2", m19206f = "Transform.kt", m19207l = {223, 224}, m19208m = "emit")
        public static final class AnonymousClass1 extends ContinuationImpl {

            /* JADX INFO: renamed from: d */
            public /* synthetic */ Object f40182d;

            /* JADX INFO: renamed from: e */
            public int f40183e;

            /* JADX INFO: renamed from: g */
            public Object f40185g;

            /* JADX INFO: renamed from: h */
            public InterfaceC7117d f40186h;

            public AnonymousClass1(InterfaceC9968c interfaceC9968c) {
                super(interfaceC9968c);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            /* JADX INFO: renamed from: x */
            public final Object mo1338x(Object obj) {
                this.f40182d = obj;
                this.f40183e |= Integer.MIN_VALUE;
                return C71052.this.mo1339r(null, this);
            }
        }

        public C71052(InterfaceC7117d interfaceC7117d, InterfaceC2056p interfaceC2056p) {
            this.f40180a = interfaceC7117d;
            this.f40181b = interfaceC2056p;
        }

        /* JADX WARN: Code duplicated, block: B:7:0x0017  */
        /* JADX WARN: Multi-variable type inference failed */
        @Override // kotlinx.coroutines.flow.InterfaceC7117d
        /* JADX INFO: renamed from: r */
        public final Object mo1339r(T t10, InterfaceC9968c<? super C9072e> interfaceC9968c) throws Throwable {
            AnonymousClass1 anonymousClass1;
            Object obj;
            InterfaceC7117d interfaceC7117d;
            if (interfaceC9968c instanceof AnonymousClass1) {
                anonymousClass1 = (AnonymousClass1) interfaceC9968c;
                int i10 = anonymousClass1.f40183e;
                if ((i10 & Integer.MIN_VALUE) != 0) {
                    anonymousClass1.f40183e = i10 - Integer.MIN_VALUE;
                } else {
                    anonymousClass1 = new AnonymousClass1(interfaceC9968c);
                }
            } else {
                anonymousClass1 = new AnonymousClass1(interfaceC9968c);
            }
            Object obj2 = anonymousClass1.f40182d;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i11 = anonymousClass1.f40183e;
            if (i11 != 0) {
                if (i11 == 1) {
                    InterfaceC7117d interfaceC7117d2 = anonymousClass1.f40186h;
                    obj = anonymousClass1.f40185g;
                    C7499b.m14977z0(obj2);
                    interfaceC7117d = interfaceC7117d2;
                } else {
                    if (i11 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    C7499b.m14977z0(obj2);
                }
                return C9072e.f47360a;
            }
            C7499b.m14977z0(obj2);
            anonymousClass1.f40185g = t10;
            InterfaceC7117d interfaceC7117d3 = this.f40180a;
            anonymousClass1.f40186h = interfaceC7117d3;
            anonymousClass1.f40183e = 1;
            if (this.f40181b.mo1337m0(t10, anonymousClass1) == coroutineSingletons) {
                return coroutineSingletons;
            }
            obj = t10;
            interfaceC7117d = interfaceC7117d3;
            anonymousClass1.f40185g = null;
            anonymousClass1.f40186h = null;
            anonymousClass1.f40183e = 2;
            if (interfaceC7117d.mo1339r(obj, anonymousClass1) == coroutineSingletons) {
                return coroutineSingletons;
            }
            return C9072e.f47360a;
        }
    }

    public FlowKt__TransformKt$onEach$$inlined$unsafeTransform$1(InterfaceC2056p interfaceC2056p, InterfaceC7116c interfaceC7116c) {
        this.f40178a = interfaceC7116c;
        this.f40179b = interfaceC2056p;
    }

    @Override // kotlinx.coroutines.flow.InterfaceC7116c
    /* JADX INFO: renamed from: a */
    public final Object mo9539a(InterfaceC7117d<? super Object> interfaceC7117d, InterfaceC9968c interfaceC9968c) {
        Object objMo9539a = this.f40178a.mo9539a(new C71052(interfaceC7117d, this.f40179b), interfaceC9968c);
        return objMo9539a == CoroutineSingletons.COROUTINE_SUSPENDED ? objMo9539a : C9072e.f47360a;
    }
}
