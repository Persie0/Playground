package androidx.compose.foundation.gestures;

import androidx.compose.p002ui.input.nestedscroll.C0317a;
import kotlin.AbstractC3193b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p000.C3386nv;
import p000.c32;
import p000.dpa;
import p000.xfa;
import p000.zi3;

/* JADX INFO: loaded from: classes.dex */
@c32(m4290c = "androidx.compose.foundation.gestures.ScrollingLogic$onScrollStopped$performFling$1", m4291f = "Scrollable.kt", m4292l = {855, 858, 861}, m4293m = "invokeSuspend", m4294v = 1)
final class ScrollingLogic$onScrollStopped$performFling$1 extends SuspendLambda implements zi3 {

    /* JADX INFO: renamed from: a */
    public long f2100a;

    /* JADX INFO: renamed from: b */
    public int f2101b;

    /* JADX INFO: renamed from: c */
    public /* synthetic */ long f2102c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ C0116v f2103d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ScrollingLogic$onScrollStopped$performFling$1(C0116v c0116v, Continuation continuation) {
        super(2, continuation);
        this.f2103d = c0116v;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        ScrollingLogic$onScrollStopped$performFling$1 scrollingLogic$onScrollStopped$performFling$1 = new ScrollingLogic$onScrollStopped$performFling$1(this.f2103d, continuation);
        scrollingLogic$onScrollStopped$performFling$1.f2102c = ((dpa) obj).f36010a;
        return scrollingLogic$onScrollStopped$performFling$1;
    }

    @Override // p000.zi3
    public final Object invoke(Object obj, Object obj2) {
        long j = ((dpa) obj).f36010a;
        ScrollingLogic$onScrollStopped$performFling$1 scrollingLogic$onScrollStopped$performFling$1 = new ScrollingLogic$onScrollStopped$performFling$1(this.f2103d, (Continuation) obj2);
        scrollingLogic$onScrollStopped$performFling$1.f2102c = j;
        return scrollingLogic$onScrollStopped$performFling$1.invokeSuspend(xfa.f68157a);
    }

    /* JADX WARN: Code duplicated, block: B:22:0x006e  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        long j;
        long j2;
        long j3;
        long j4;
        long j5;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.f2101b;
        C0116v c0116v = this.f2103d;
        if (i == 0) {
            AbstractC3193b.m15359b(obj);
            j = this.f2102c;
            C0317a c0317a = c0116v.f2365f;
            this.f2102c = j;
            this.f2101b = 1;
            obj = c0317a.m1448b(j, this);
            if (obj != coroutineSingletons) {
            }
            return coroutineSingletons;
        }
        if (i == 1) {
            j = this.f2102c;
            AbstractC3193b.m15359b(obj);
        } else {
            if (i == 2) {
                j2 = this.f2100a;
                j = this.f2102c;
                AbstractC3193b.m15359b(obj);
                j3 = ((dpa) obj).f36010a;
                C0317a c0317a2 = c0116v.f2365f;
                long jM10573d = dpa.m10573d(j2, j3);
                this.f2102c = j;
                this.f2100a = j3;
                this.f2101b = 3;
                obj = c0317a2.m1447a(jM10573d, j3, this);
                if (obj != coroutineSingletons) {
                    j4 = j;
                    j5 = j3;
                }
                return coroutineSingletons;
            }
            if (i != 3) {
                C3386nv.m17633t("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            j5 = this.f2100a;
            j4 = this.f2102c;
            AbstractC3193b.m15359b(obj);
        }
        return new dpa(dpa.m10573d(j4, dpa.m10573d(j5, ((dpa) obj).f36010a)));
        long jM10573d2 = dpa.m10573d(j, ((dpa) obj).f36010a);
        this.f2102c = j;
        this.f2100a = jM10573d2;
        this.f2101b = 2;
        obj = c0116v.m929a(jM10573d2, this);
        if (obj != coroutineSingletons) {
            j2 = jM10573d2;
            j3 = ((dpa) obj).f36010a;
            C0317a c0317a3 = c0116v.f2365f;
            long jM10573d3 = dpa.m10573d(j2, j3);
            this.f2102c = j;
            this.f2100a = j3;
            this.f2101b = 3;
            obj = c0317a3.m1447a(jM10573d3, j3, this);
            if (obj != coroutineSingletons) {
                j4 = j;
                j5 = j3;
                return new dpa(dpa.m10573d(j4, dpa.m10573d(j5, ((dpa) obj).f36010a)));
            }
        }
        return coroutineSingletons;
    }
}
