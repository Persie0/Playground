package kotlinx.coroutines.flow;

import androidx.datastore.preferences.PreferencesProto$Value;
import cm.InterfaceC2057q;
import com.android.installreferrer.api.InstallReferrerClient;
import kotlin.Metadata;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import no.C7828f;
import p260m8.C7499b;
import p464wl.InterfaceC9968c;
import p490xl.InterfaceC10224c;
import sl.C9072e;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(m13364d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0005\u001a\u00020\u0004*\b\u0012\u0004\u0012\u00020\u00010\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\u008a@"}, m13365d2 = {"Lkotlinx/coroutines/flow/d;", "Lkotlinx/coroutines/flow/SharingCommand;", "", "count", "Lsl/e;", "<anonymous>"}, m13366k = 3, m13367mv = {1, PreferencesProto$Value.STRING_SET_FIELD_NUMBER, InstallReferrerClient.InstallReferrerResponse.f10530OK})
@InterfaceC10224c(m19205c = "kotlinx.coroutines.flow.StartedWhileSubscribed$command$1", m19206f = "SharingStarted.kt", m19207l = {178, 180, 182, 183, 185}, m19208m = "invokeSuspend")
public final class StartedWhileSubscribed$command$1 extends SuspendLambda implements InterfaceC2057q<InterfaceC7117d<? super SharingCommand>, Integer, InterfaceC9968c<? super C9072e>, Object> {

    /* JADX INFO: renamed from: e */
    public int f40259e;

    /* JADX INFO: renamed from: f */
    public /* synthetic */ InterfaceC7117d f40260f;

    /* JADX INFO: renamed from: g */
    public /* synthetic */ int f40261g;

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ StartedWhileSubscribed f40262h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public StartedWhileSubscribed$command$1(StartedWhileSubscribed startedWhileSubscribed, InterfaceC9968c<? super StartedWhileSubscribed$command$1> interfaceC9968c) {
        super(3, interfaceC9968c);
        this.f40262h = startedWhileSubscribed;
    }

    @Override // cm.InterfaceC2057q
    /* JADX INFO: renamed from: M */
    public final Object mo1343M(InterfaceC7117d<? super SharingCommand> interfaceC7117d, Integer num, InterfaceC9968c<? super C9072e> interfaceC9968c) {
        int iIntValue = num.intValue();
        StartedWhileSubscribed$command$1 startedWhileSubscribed$command$1 = new StartedWhileSubscribed$command$1(this.f40262h, interfaceC9968c);
        startedWhileSubscribed$command$1.f40260f = interfaceC7117d;
        startedWhileSubscribed$command$1.f40261g = iIntValue;
        return startedWhileSubscribed$command$1.mo1338x(C9072e.f47360a);
    }

    /* JADX WARN: Code duplicated, block: B:37:0x0091  */
    /* JADX WARN: Code duplicated, block: B:42:0x00a4 A[RETURN] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /* JADX INFO: renamed from: x */
    public final Object mo1338x(Object obj) throws Throwable {
        InterfaceC7117d interfaceC7117d;
        long j10;
        SharingCommand sharingCommand;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i10 = this.f40259e;
        StartedWhileSubscribed startedWhileSubscribed = this.f40262h;
        if (i10 == 0) {
            C7499b.m14977z0(obj);
            InterfaceC7117d interfaceC7117d2 = this.f40260f;
            if (this.f40261g > 0) {
                SharingCommand sharingCommand2 = SharingCommand.START;
                this.f40259e = 1;
                if (interfaceC7117d2.mo1339r(sharingCommand2, this) == coroutineSingletons) {
                    return coroutineSingletons;
                }
            } else {
                long j11 = startedWhileSubscribed.f40257a;
                this.f40260f = interfaceC7117d2;
                this.f40259e = 2;
                if (C7828f.m15567a(j11, this) == coroutineSingletons) {
                    return coroutineSingletons;
                }
                interfaceC7117d = interfaceC7117d2;
            }
            return C9072e.f47360a;
        }
        if (i10 != 1) {
            if (i10 == 2) {
                interfaceC7117d = this.f40260f;
                C7499b.m14977z0(obj);
            } else if (i10 == 3) {
                interfaceC7117d = this.f40260f;
                C7499b.m14977z0(obj);
                j10 = startedWhileSubscribed.f40258b;
                this.f40260f = interfaceC7117d;
                this.f40259e = 4;
                if (C7828f.m15567a(j10, this) == coroutineSingletons) {
                    return coroutineSingletons;
                }
            } else if (i10 == 4) {
                interfaceC7117d = this.f40260f;
                C7499b.m14977z0(obj);
            } else if (i10 != 5) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            sharingCommand = SharingCommand.STOP_AND_RESET_REPLAY_CACHE;
            this.f40260f = null;
            this.f40259e = 5;
            if (interfaceC7117d.mo1339r(sharingCommand, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
            return C9072e.f47360a;
        }
        C7499b.m14977z0(obj);
        return C9072e.f47360a;
        if (startedWhileSubscribed.f40258b > 0) {
            SharingCommand sharingCommand3 = SharingCommand.STOP;
            this.f40260f = interfaceC7117d;
            this.f40259e = 3;
            if (interfaceC7117d.mo1339r(sharingCommand3, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
            j10 = startedWhileSubscribed.f40258b;
            this.f40260f = interfaceC7117d;
            this.f40259e = 4;
            if (C7828f.m15567a(j10, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        }
        sharingCommand = SharingCommand.STOP_AND_RESET_REPLAY_CACHE;
        this.f40260f = null;
        this.f40259e = 5;
        if (interfaceC7117d.mo1339r(sharingCommand, this) == coroutineSingletons) {
            return coroutineSingletons;
        }
        return C9072e.f47360a;
    }
}
