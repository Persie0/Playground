package androidx.compose.foundation.gestures;

import kotlin.AbstractC3193b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p000.C3386nv;
import p000.dpa;
import p000.pj6;

/* JADX INFO: renamed from: androidx.compose.foundation.gestures.s */
/* JADX INFO: loaded from: classes.dex */
public final class C0111s implements pj6 {

    /* JADX INFO: renamed from: a */
    public final C0116v f2314a;

    /* JADX INFO: renamed from: b */
    public boolean f2315b;

    public C0111s(C0116v c0116v, boolean z) {
        this.f2314a = c0116v;
        this.f2315b = z;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // p000.pj6
    /* JADX INFO: renamed from: t */
    public final Object mo919t(long j, long j2, Continuation continuation) throws Throwable {
        ScrollableNestedScrollConnection$onPostFling$1 scrollableNestedScrollConnection$onPostFling$1;
        long jM10573d;
        if (continuation instanceof ScrollableNestedScrollConnection$onPostFling$1) {
            scrollableNestedScrollConnection$onPostFling$1 = (ScrollableNestedScrollConnection$onPostFling$1) continuation;
            int i = scrollableNestedScrollConnection$onPostFling$1.f2062d;
            if ((i & Integer.MIN_VALUE) != 0) {
                scrollableNestedScrollConnection$onPostFling$1.f2062d = i - Integer.MIN_VALUE;
            } else {
                scrollableNestedScrollConnection$onPostFling$1 = new ScrollableNestedScrollConnection$onPostFling$1(this, (ContinuationImpl) continuation);
            }
        } else {
            scrollableNestedScrollConnection$onPostFling$1 = new ScrollableNestedScrollConnection$onPostFling$1(this, (ContinuationImpl) continuation);
        }
        Object objM929a = scrollableNestedScrollConnection$onPostFling$1.f2060b;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = scrollableNestedScrollConnection$onPostFling$1.f2062d;
        if (i2 == 0) {
            AbstractC3193b.m15359b(objM929a);
            jM10573d = 0;
            if (this.f2315b) {
                C0116v c0116v = this.f2314a;
                if (!c0116v.f2368i) {
                    scrollableNestedScrollConnection$onPostFling$1.f2059a = j2;
                    scrollableNestedScrollConnection$onPostFling$1.f2062d = 1;
                    objM929a = c0116v.m929a(j2, scrollableNestedScrollConnection$onPostFling$1);
                    if (objM929a == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                }
                jM10573d = dpa.m10573d(j2, jM10573d);
            }
            return new dpa(jM10573d);
        }
        if (i2 != 1) {
            C3386nv.m17633t("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        j2 = scrollableNestedScrollConnection$onPostFling$1.f2059a;
        AbstractC3193b.m15359b(objM929a);
        jM10573d = ((dpa) objM929a).f36010a;
        jM10573d = dpa.m10573d(j2, jM10573d);
        return new dpa(jM10573d);
    }

    @Override // p000.pj6
    /* JADX INFO: renamed from: u0 */
    public final long mo920u0(int i, long j, long j2) {
        if (!this.f2315b) {
            return 0L;
        }
        C0116v c0116v = this.f2314a;
        if (c0116v.f2360a.mo863a()) {
            return 0L;
        }
        return c0116v.m936h(c0116v.m932d(c0116v.f2360a.mo865e(c0116v.m932d(c0116v.m935g(j2)))));
    }
}
