package kotlinx.coroutines.flow;

import androidx.datastore.preferences.PreferencesProto$Value;
import cm.InterfaceC2056p;
import com.android.installreferrer.api.InstallReferrerClient;
import kotlin.Metadata;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p260m8.C7499b;
import p464wl.InterfaceC9968c;
import p490xl.InterfaceC10224c;
import sl.C9072e;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(m13364d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@"}, m13365d2 = {"Lkotlinx/coroutines/flow/SharingCommand;", "it", "", "<anonymous>"}, m13366k = 3, m13367mv = {1, PreferencesProto$Value.STRING_SET_FIELD_NUMBER, InstallReferrerClient.InstallReferrerResponse.f10530OK})
@InterfaceC10224c(m19205c = "kotlinx.coroutines.flow.StartedWhileSubscribed$command$2", m19206f = "SharingStarted.kt", m19207l = {}, m19208m = "invokeSuspend")
public final class StartedWhileSubscribed$command$2 extends SuspendLambda implements InterfaceC2056p<SharingCommand, InterfaceC9968c<? super Boolean>, Object> {

    /* JADX INFO: renamed from: e */
    public /* synthetic */ Object f40263e;

    public StartedWhileSubscribed$command$2(InterfaceC9968c<? super StartedWhileSubscribed$command$2> interfaceC9968c) {
        super(2, interfaceC9968c);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /* JADX INFO: renamed from: a */
    public final InterfaceC9968c<C9072e> mo1336a(Object obj, InterfaceC9968c<?> interfaceC9968c) {
        StartedWhileSubscribed$command$2 startedWhileSubscribed$command$2 = new StartedWhileSubscribed$command$2(interfaceC9968c);
        startedWhileSubscribed$command$2.f40263e = obj;
        return startedWhileSubscribed$command$2;
    }

    @Override // cm.InterfaceC2056p
    /* JADX INFO: renamed from: m0 */
    public final Object mo1337m0(SharingCommand sharingCommand, InterfaceC9968c<? super Boolean> interfaceC9968c) {
        return ((StartedWhileSubscribed$command$2) mo1336a(sharingCommand, interfaceC9968c)).mo1338x(C9072e.f47360a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /* JADX INFO: renamed from: x */
    public final Object mo1338x(Object obj) throws Throwable {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        C7499b.m14977z0(obj);
        return Boolean.valueOf(((SharingCommand) this.f40263e) != SharingCommand.START);
    }
}
