package androidx.work;

import androidx.datastore.preferences.PreferencesProto$Value;
import cm.InterfaceC2056p;
import kotlin.Metadata;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import no.InterfaceC7882z;
import p026b5.C1310c;
import p260m8.C7499b;
import p464wl.InterfaceC9968c;
import p490xl.InterfaceC10224c;
import sl.C9072e;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m13364d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, m13365d2 = {"Lno/z;", "Lsl/e;", "<anonymous>"}, m13366k = 3, m13367mv = {1, PreferencesProto$Value.DOUBLE_FIELD_NUMBER, 1})
@InterfaceC10224c(m19205c = "androidx.work.CoroutineWorker$getForegroundInfoAsync$1", m19206f = "CoroutineWorker.kt", m19207l = {134}, m19208m = "invokeSuspend")
public final class CoroutineWorker$getForegroundInfoAsync$1 extends SuspendLambda implements InterfaceC2056p<InterfaceC7882z, InterfaceC9968c<? super C9072e>, Object> {

    /* JADX INFO: renamed from: e */
    public C1245c f7790e;

    /* JADX INFO: renamed from: f */
    public int f7791f;

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ C1245c<C1310c> f7792g;

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ CoroutineWorker f7793h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CoroutineWorker$getForegroundInfoAsync$1(C1245c<C1310c> c1245c, CoroutineWorker coroutineWorker, InterfaceC9968c<? super CoroutineWorker$getForegroundInfoAsync$1> interfaceC9968c) {
        super(2, interfaceC9968c);
        this.f7792g = c1245c;
        this.f7793h = coroutineWorker;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /* JADX INFO: renamed from: a */
    public final InterfaceC9968c<C9072e> mo1336a(Object obj, InterfaceC9968c<?> interfaceC9968c) {
        return new CoroutineWorker$getForegroundInfoAsync$1(this.f7792g, this.f7793h, interfaceC9968c);
    }

    @Override // cm.InterfaceC2056p
    /* JADX INFO: renamed from: m0 */
    public final Object mo1337m0(InterfaceC7882z interfaceC7882z, InterfaceC9968c<? super C9072e> interfaceC9968c) {
        return ((CoroutineWorker$getForegroundInfoAsync$1) mo1336a(interfaceC7882z, interfaceC9968c)).mo1338x(C9072e.f47360a);
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /* JADX INFO: renamed from: x */
    public final Object mo1338x(Object obj) throws Throwable {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i10 = this.f7791f;
        if (i10 == 0) {
            C7499b.m14977z0(obj);
            this.f7790e = this.f7792g;
            this.f7791f = 1;
            this.f7793h.getClass();
            throw new IllegalStateException("Not implemented");
        }
        if (i10 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        C1245c c1245c = this.f7790e;
        C7499b.m14977z0(obj);
        c1245c.f7827b.m4766i((R) obj);
        return C9072e.f47360a;
    }
}
