package androidx.datastore.preferences.core;

import cm.InterfaceC2056p;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.C6753d;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p212k3.AbstractC6579a;
import p260m8.C7499b;
import p464wl.InterfaceC9968c;
import p490xl.InterfaceC10224c;
import sl.C9072e;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m13364d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@"}, m13365d2 = {"Lk3/a;", "it", "<anonymous>"}, m13366k = 3, m13367mv = {1, 5, 1})
@InterfaceC10224c(m19205c = "androidx.datastore.preferences.core.PreferencesKt$edit$2", m19206f = "Preferences.kt", m19207l = {329}, m19208m = "invokeSuspend")
public final class PreferencesKt$edit$2 extends SuspendLambda implements InterfaceC2056p<AbstractC6579a, InterfaceC9968c<? super AbstractC6579a>, Object> {

    /* JADX INFO: renamed from: e */
    public int f5790e;

    /* JADX INFO: renamed from: f */
    public /* synthetic */ Object f5791f;

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ InterfaceC2056p<MutablePreferences, InterfaceC9968c<? super C9072e>, Object> f5792g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public PreferencesKt$edit$2(InterfaceC2056p<? super MutablePreferences, ? super InterfaceC9968c<? super C9072e>, ? extends Object> interfaceC2056p, InterfaceC9968c<? super PreferencesKt$edit$2> interfaceC9968c) {
        super(2, interfaceC9968c);
        this.f5792g = interfaceC2056p;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /* JADX INFO: renamed from: a */
    public final InterfaceC9968c<C9072e> mo1336a(Object obj, InterfaceC9968c<?> interfaceC9968c) {
        PreferencesKt$edit$2 preferencesKt$edit$2 = new PreferencesKt$edit$2(this.f5792g, interfaceC9968c);
        preferencesKt$edit$2.f5791f = obj;
        return preferencesKt$edit$2;
    }

    @Override // cm.InterfaceC2056p
    /* JADX INFO: renamed from: m0 */
    public final Object mo1337m0(AbstractC6579a abstractC6579a, InterfaceC9968c<? super AbstractC6579a> interfaceC9968c) {
        return ((PreferencesKt$edit$2) mo1336a(abstractC6579a, interfaceC9968c)).mo1338x(C9072e.f47360a);
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /* JADX INFO: renamed from: x */
    public final Object mo1338x(Object obj) throws Throwable {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i10 = this.f5790e;
        if (i10 != 0) {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            MutablePreferences mutablePreferences = (MutablePreferences) this.f5791f;
            C7499b.m14977z0(obj);
            return mutablePreferences;
        }
        C7499b.m14977z0(obj);
        MutablePreferences mutablePreferences2 = new MutablePreferences((Map<AbstractC6579a.a<?>, Object>) C6753d.m13467T0(((AbstractC6579a) this.f5791f).mo3049a()), false);
        this.f5791f = mutablePreferences2;
        this.f5790e = 1;
        return this.f5792g.mo1337m0(mutablePreferences2, this) == coroutineSingletons ? coroutineSingletons : mutablePreferences2;
    }
}
