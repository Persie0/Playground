package androidx.room;

import androidx.datastore.preferences.PreferencesProto$Value;
import cm.InterfaceC2056p;
import java.util.concurrent.Callable;
import kotlin.Metadata;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import no.InterfaceC7882z;
import p260m8.C7499b;
import p464wl.InterfaceC9968c;
import p490xl.InterfaceC10224c;
import sl.C9072e;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m13364d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\n \u0002*\u0004\u0018\u00018\u00008\u0000\"\u0004\b\u0000\u0010\u0000*\u00020\u0001H\u008a@"}, m13365d2 = {"R", "Lno/z;", "kotlin.jvm.PlatformType", "<anonymous>"}, m13366k = 3, m13367mv = {1, PreferencesProto$Value.DOUBLE_FIELD_NUMBER, 1})
@InterfaceC10224c(m19205c = "androidx.room.CoroutinesRoom$Companion$execute$2", m19206f = "CoroutinesRoom.kt", m19207l = {}, m19208m = "invokeSuspend")
final class CoroutinesRoom$Companion$execute$2 extends SuspendLambda implements InterfaceC2056p<InterfaceC7882z, InterfaceC9968c<Object>, Object> {

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ Callable<Object> f7499e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CoroutinesRoom$Companion$execute$2(Callable<Object> callable, InterfaceC9968c<? super CoroutinesRoom$Companion$execute$2> interfaceC9968c) {
        super(2, interfaceC9968c);
        this.f7499e = callable;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /* JADX INFO: renamed from: a */
    public final InterfaceC9968c<C9072e> mo1336a(Object obj, InterfaceC9968c<?> interfaceC9968c) {
        return new CoroutinesRoom$Companion$execute$2(this.f7499e, interfaceC9968c);
    }

    @Override // cm.InterfaceC2056p
    /* JADX INFO: renamed from: m0 */
    public final Object mo1337m0(InterfaceC7882z interfaceC7882z, InterfaceC9968c<Object> interfaceC9968c) {
        return ((CoroutinesRoom$Companion$execute$2) mo1336a(interfaceC7882z, interfaceC9968c)).mo1338x(C9072e.f47360a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /* JADX INFO: renamed from: x */
    public final Object mo1338x(Object obj) throws Throwable {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        C7499b.m14977z0(obj);
        return this.f7499e.call();
    }
}
