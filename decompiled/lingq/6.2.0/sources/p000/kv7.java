package p000;

import com.lingq.feature.reader.reader.C2489xbd776d4d;
import kotlin.AbstractC3193b;
import kotlin.Pair;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* JADX INFO: loaded from: classes3.dex */
public final class kv7 implements e83 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ e83 f48469a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ boolean f48470b;

    public kv7(e83 e83Var, boolean z) {
        this.f48469a = e83Var;
        this.f48470b = z;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // p000.e83
    public final Object emit(Object obj, Continuation continuation) throws Throwable {
        C2489xbd776d4d c2489xbd776d4d;
        if (continuation instanceof C2489xbd776d4d) {
            c2489xbd776d4d = (C2489xbd776d4d) continuation;
            int i = c2489xbd776d4d.f30053b;
            if ((i & Integer.MIN_VALUE) != 0) {
                c2489xbd776d4d.f30053b = i - Integer.MIN_VALUE;
            } else {
                c2489xbd776d4d = new C2489xbd776d4d(this, continuation);
            }
        } else {
            c2489xbd776d4d = new C2489xbd776d4d(this, continuation);
        }
        Object obj2 = c2489xbd776d4d.f30052a;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = c2489xbd776d4d.f30053b;
        if (i2 == 0) {
            AbstractC3193b.m15359b(obj2);
            Pair pair = new Pair(Boolean.valueOf(this.f48470b), Boolean.valueOf(((jy7) obj).f46393a));
            c2489xbd776d4d.f30053b = 1;
            if (this.f48469a.emit(pair, c2489xbd776d4d) == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i2 != 1) {
                C3386nv.m17633t("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            AbstractC3193b.m15359b(obj2);
        }
        return xfa.f68157a;
    }
}
