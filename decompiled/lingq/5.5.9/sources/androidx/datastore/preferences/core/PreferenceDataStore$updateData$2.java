package androidx.datastore.preferences.core;

import cm.InterfaceC2056p;
import kotlin.Metadata;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p212k3.AbstractC6579a;
import p260m8.C7499b;
import p464wl.InterfaceC9968c;
import p490xl.InterfaceC10224c;
import sl.C9072e;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m13364d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@"}, m13365d2 = {"Lk3/a;", "it", "<anonymous>"}, m13366k = 3, m13367mv = {1, 5, 1})
@InterfaceC10224c(m19205c = "androidx.datastore.preferences.core.PreferenceDataStore$updateData$2", m19206f = "PreferenceDataStoreFactory.kt", m19207l = {85}, m19208m = "invokeSuspend")
public final class PreferenceDataStore$updateData$2 extends SuspendLambda implements InterfaceC2056p<AbstractC6579a, InterfaceC9968c<? super AbstractC6579a>, Object> {

    /* JADX INFO: renamed from: e */
    public int f5786e;

    /* JADX INFO: renamed from: f */
    public /* synthetic */ Object f5787f;

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ InterfaceC2056p<AbstractC6579a, InterfaceC9968c<? super AbstractC6579a>, Object> f5788g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public PreferenceDataStore$updateData$2(InterfaceC2056p<? super AbstractC6579a, ? super InterfaceC9968c<? super AbstractC6579a>, ? extends Object> interfaceC2056p, InterfaceC9968c<? super PreferenceDataStore$updateData$2> interfaceC9968c) {
        super(2, interfaceC9968c);
        this.f5788g = interfaceC2056p;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /* JADX INFO: renamed from: a */
    public final InterfaceC9968c<C9072e> mo1336a(Object obj, InterfaceC9968c<?> interfaceC9968c) {
        PreferenceDataStore$updateData$2 preferenceDataStore$updateData$2 = new PreferenceDataStore$updateData$2(this.f5788g, interfaceC9968c);
        preferenceDataStore$updateData$2.f5787f = obj;
        return preferenceDataStore$updateData$2;
    }

    @Override // cm.InterfaceC2056p
    /* JADX INFO: renamed from: m0 */
    public final Object mo1337m0(AbstractC6579a abstractC6579a, InterfaceC9968c<? super AbstractC6579a> interfaceC9968c) {
        return ((PreferenceDataStore$updateData$2) mo1336a(abstractC6579a, interfaceC9968c)).mo1338x(C9072e.f47360a);
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /* JADX INFO: renamed from: x */
    public final Object mo1338x(Object obj) throws Throwable {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i10 = this.f5786e;
        if (i10 == 0) {
            C7499b.m14977z0(obj);
            AbstractC6579a abstractC6579a = (AbstractC6579a) this.f5787f;
            this.f5786e = 1;
            obj = this.f5788g.mo1337m0(abstractC6579a, this);
            if (obj == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C7499b.m14977z0(obj);
        }
        AbstractC6579a abstractC6579a2 = (AbstractC6579a) obj;
        ((MutablePreferences) abstractC6579a2).f5783b.set(true);
        return abstractC6579a2;
    }
}
