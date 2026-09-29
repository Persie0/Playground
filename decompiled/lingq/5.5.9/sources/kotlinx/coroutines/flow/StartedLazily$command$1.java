package kotlinx.coroutines.flow;

import androidx.datastore.preferences.PreferencesProto$Value;
import cm.InterfaceC2056p;
import com.android.installreferrer.api.InstallReferrerClient;
import kotlin.KotlinNothingValueException;
import kotlin.Metadata;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.Ref$BooleanRef;
import p260m8.C7499b;
import p464wl.InterfaceC9968c;
import p490xl.InterfaceC10224c;
import sl.C9072e;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(m13364d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@"}, m13365d2 = {"Lkotlinx/coroutines/flow/d;", "Lkotlinx/coroutines/flow/SharingCommand;", "Lsl/e;", "<anonymous>"}, m13366k = 3, m13367mv = {1, PreferencesProto$Value.STRING_SET_FIELD_NUMBER, InstallReferrerClient.InstallReferrerResponse.f10530OK})
@InterfaceC10224c(m19205c = "kotlinx.coroutines.flow.StartedLazily$command$1", m19206f = "SharingStarted.kt", m19207l = {155}, m19208m = "invokeSuspend")
public final class StartedLazily$command$1 extends SuspendLambda implements InterfaceC2056p<InterfaceC7117d<? super SharingCommand>, InterfaceC9968c<? super C9072e>, Object> {

    /* JADX INFO: renamed from: e */
    public int f40249e;

    /* JADX INFO: renamed from: f */
    public /* synthetic */ Object f40250f;

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ InterfaceC7142w<Integer> f40251g;

    /* JADX INFO: renamed from: kotlinx.coroutines.flow.StartedLazily$command$1$1 */
    public static final class C71131<T> implements InterfaceC7117d {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ Ref$BooleanRef f40252a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ InterfaceC7117d<SharingCommand> f40253b;

        /* JADX WARN: Multi-variable type inference failed */
        public C71131(Ref$BooleanRef ref$BooleanRef, InterfaceC7117d<? super SharingCommand> interfaceC7117d) {
            this.f40252a = ref$BooleanRef;
            this.f40253b = interfaceC7117d;
        }

        /* JADX WARN: Code duplicated, block: B:7:0x0017  */
        /* JADX INFO: renamed from: a */
        public final Object m14364a(int i10, InterfaceC9968c<? super C9072e> interfaceC9968c) throws Throwable {
            StartedLazily$command$1$1$emit$1 startedLazily$command$1$1$emit$1;
            if (interfaceC9968c instanceof StartedLazily$command$1$1$emit$1) {
                startedLazily$command$1$1$emit$1 = (StartedLazily$command$1$1$emit$1) interfaceC9968c;
                int i11 = startedLazily$command$1$1$emit$1.f40256f;
                if ((i11 & Integer.MIN_VALUE) != 0) {
                    startedLazily$command$1$1$emit$1.f40256f = i11 - Integer.MIN_VALUE;
                } else {
                    startedLazily$command$1$1$emit$1 = new StartedLazily$command$1$1$emit$1(this, interfaceC9968c);
                }
            } else {
                startedLazily$command$1$1$emit$1 = new StartedLazily$command$1$1$emit$1(this, interfaceC9968c);
            }
            Object obj = startedLazily$command$1$1$emit$1.f40254d;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i12 = startedLazily$command$1$1$emit$1.f40256f;
            if (i12 == 0) {
                C7499b.m14977z0(obj);
                if (i10 > 0) {
                    Ref$BooleanRef ref$BooleanRef = this.f40252a;
                    if (!ref$BooleanRef.f38122a) {
                        ref$BooleanRef.f38122a = true;
                        SharingCommand sharingCommand = SharingCommand.START;
                        startedLazily$command$1$1$emit$1.f40256f = 1;
                        if (this.f40253b.mo1339r(sharingCommand, startedLazily$command$1$1$emit$1) == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                    }
                }
                return C9072e.f47360a;
            }
            if (i12 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C7499b.m14977z0(obj);
            return C9072e.f47360a;
        }

        @Override // kotlinx.coroutines.flow.InterfaceC7117d
        /* JADX INFO: renamed from: r */
        public final /* bridge */ /* synthetic */ Object mo1339r(Object obj, InterfaceC9968c interfaceC9968c) {
            return m14364a(((Number) obj).intValue(), interfaceC9968c);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public StartedLazily$command$1(InterfaceC7142w<Integer> interfaceC7142w, InterfaceC9968c<? super StartedLazily$command$1> interfaceC9968c) {
        super(2, interfaceC9968c);
        this.f40251g = interfaceC7142w;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /* JADX INFO: renamed from: a */
    public final InterfaceC9968c<C9072e> mo1336a(Object obj, InterfaceC9968c<?> interfaceC9968c) {
        StartedLazily$command$1 startedLazily$command$1 = new StartedLazily$command$1(this.f40251g, interfaceC9968c);
        startedLazily$command$1.f40250f = obj;
        return startedLazily$command$1;
    }

    @Override // cm.InterfaceC2056p
    /* JADX INFO: renamed from: m0 */
    public final Object mo1337m0(InterfaceC7117d<? super SharingCommand> interfaceC7117d, InterfaceC9968c<? super C9072e> interfaceC9968c) {
        return ((StartedLazily$command$1) mo1336a(interfaceC7117d, interfaceC9968c)).mo1338x(C9072e.f47360a);
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /* JADX INFO: renamed from: x */
    public final Object mo1338x(Object obj) throws Throwable {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i10 = this.f40249e;
        if (i10 == 0) {
            C7499b.m14977z0(obj);
            C71131 c71131 = new C71131(new Ref$BooleanRef(), (InterfaceC7117d) this.f40250f);
            this.f40249e = 1;
            if (this.f40251g.mo9539a(c71131, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C7499b.m14977z0(obj);
        }
        throw new KotlinNothingValueException();
    }
}
