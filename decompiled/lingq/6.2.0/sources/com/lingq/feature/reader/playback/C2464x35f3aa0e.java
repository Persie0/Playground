package com.lingq.feature.reader.playback;

import com.lingq.core.data.repository.C1295k;
import com.lingq.core.domain.store.AudioUnderlineMode;
import java.util.List;
import kotlin.AbstractC3193b;
import kotlin.Triple;
import kotlin.collections.EmptyList;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.AbstractC3224d;
import p000.C3139j9;
import p000.C3386nv;
import p000.aj3;
import p000.c32;
import p000.c83;
import p000.e83;
import p000.i83;
import p000.xfa;

/* JADX INFO: renamed from: com.lingq.feature.reader.playback.PlayerStateHolder$startObservingAudioWave$$inlined$flatMapLatest$1 */
/* JADX INFO: loaded from: classes3.dex */
@c32(m4290c = "com.lingq.feature.reader.playback.PlayerStateHolder$startObservingAudioWave$$inlined$flatMapLatest$1", m4291f = "PlayerStateHolder.kt", m4292l = {189}, m4293m = "invokeSuspend", m4294v = 2)
public final class C2464x35f3aa0e extends SuspendLambda implements aj3 {

    /* JADX INFO: renamed from: a */
    public int f29753a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ e83 f29754b;

    /* JADX INFO: renamed from: c */
    public /* synthetic */ Object f29755c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ C2465a f29756d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2464x35f3aa0e(C2465a c2465a, Continuation continuation) {
        super(3, continuation);
        this.f29756d = c2465a;
    }

    @Override // p000.aj3
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        C2464x35f3aa0e c2464x35f3aa0e = new C2464x35f3aa0e(this.f29756d, (Continuation) obj3);
        c2464x35f3aa0e.f29754b = (e83) obj;
        c2464x35f3aa0e.f29755c = obj2;
        return c2464x35f3aa0e.invokeSuspend(xfa.f68157a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        c83 i83Var;
        e83 e83Var = this.f29754b;
        Object obj2 = this.f29755c;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.f29753a;
        if (i == 0) {
            AbstractC3193b.m15359b(obj);
            Triple triple = (Triple) obj2;
            List list = (List) triple.f47633a;
            AudioUnderlineMode audioUnderlineMode = (AudioUnderlineMode) triple.f47634b;
            boolean zBooleanValue = ((Boolean) triple.f47635c).booleanValue();
            if (audioUnderlineMode == AudioUnderlineMode.Off || !zBooleanValue || list.isEmpty()) {
                i83Var = new i83(EmptyList.f47638a, 1);
            } else {
                C2465a c2465a = this.f29756d;
                C3139j9 c3139j9 = c2465a.f29774h;
                int i2 = c2465a.f29786t;
                list.getClass();
                i83Var = ((C1295k) c3139j9.f45229a).m7254L(i2, list);
            }
            this.f29754b = null;
            this.f29755c = null;
            this.f29753a = 1;
            if (AbstractC3224d.m15537p(e83Var, i83Var, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                C3386nv.m17633t("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            AbstractC3193b.m15359b(obj);
        }
        return xfa.f68157a;
    }
}
