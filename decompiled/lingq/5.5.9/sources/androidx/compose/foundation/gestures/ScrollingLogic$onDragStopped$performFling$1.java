package androidx.compose.foundation.gestures;

import androidx.compose.p017ui.input.nestedscroll.NestedScrollDispatcher;
import cm.InterfaceC2056p;
import com.android.installreferrer.api.InstallReferrerClient;
import kotlin.Metadata;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p260m8.C7499b;
import p464wl.InterfaceC9968c;
import p470x1.C10025m;
import p490xl.InterfaceC10224c;
import sl.C9072e;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m13364d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@"}, m13365d2 = {"Lx1/m;", "velocity", "<anonymous>"}, m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
@InterfaceC10224c(m19205c = "androidx.compose.foundation.gestures.ScrollingLogic$onDragStopped$performFling$1", m19206f = "Scrollable.kt", m19207l = {406, 408, 410}, m19208m = "invokeSuspend")
public final class ScrollingLogic$onDragStopped$performFling$1 extends SuspendLambda implements InterfaceC2056p<C10025m, InterfaceC9968c<? super C10025m>, Object> {

    /* JADX INFO: renamed from: e */
    public long f2233e;

    /* JADX INFO: renamed from: f */
    public int f2234f;

    /* JADX INFO: renamed from: g */
    public /* synthetic */ long f2235g;

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ ScrollingLogic f2236h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ScrollingLogic$onDragStopped$performFling$1(ScrollingLogic scrollingLogic, InterfaceC9968c<? super ScrollingLogic$onDragStopped$performFling$1> interfaceC9968c) {
        super(2, interfaceC9968c);
        this.f2236h = scrollingLogic;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /* JADX INFO: renamed from: a */
    public final InterfaceC9968c<C9072e> mo1336a(Object obj, InterfaceC9968c<?> interfaceC9968c) {
        ScrollingLogic$onDragStopped$performFling$1 scrollingLogic$onDragStopped$performFling$1 = new ScrollingLogic$onDragStopped$performFling$1(this.f2236h, interfaceC9968c);
        scrollingLogic$onDragStopped$performFling$1.f2235g = ((C10025m) obj).f50987a;
        return scrollingLogic$onDragStopped$performFling$1;
    }

    @Override // cm.InterfaceC2056p
    /* JADX INFO: renamed from: m0 */
    public final Object mo1337m0(C10025m c10025m, InterfaceC9968c<? super C10025m> interfaceC9968c) {
        return ((ScrollingLogic$onDragStopped$performFling$1) mo1336a(new C10025m(c10025m.f50987a), interfaceC9968c)).mo1338x(C9072e.f47360a);
    }

    /* JADX WARN: Code duplicated, block: B:24:0x009a A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:25:0x009b  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /* JADX INFO: renamed from: x */
    public final Object mo1338x(Object obj) throws Throwable {
        long j10;
        Object objM2015b;
        Object objM1480b;
        long j11;
        long j12;
        Object objM2014a;
        long j13;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i10 = this.f2234f;
        ScrollingLogic scrollingLogic = this.f2236h;
        if (i10 != 0) {
            if (i10 == 1) {
                j10 = this.f2235g;
                C7499b.m14977z0(obj);
                objM2015b = obj;
            } else if (i10 == 2) {
                j11 = this.f2233e;
                j10 = this.f2235g;
                C7499b.m14977z0(obj);
                objM1480b = obj;
                j12 = ((C10025m) objM1480b).f50987a;
                NestedScrollDispatcher value = scrollingLogic.f2205c.getValue();
                long jM18638d = C10025m.m18638d(j11, j12);
                this.f2235g = j10;
                this.f2233e = j12;
                this.f2234f = 3;
                objM2014a = value.m2014a(jM18638d, j12, this);
                if (objM2014a == coroutineSingletons) {
                    return coroutineSingletons;
                }
                j13 = j10;
            } else {
                if (i10 != 3) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                long j14 = this.f2233e;
                j13 = this.f2235g;
                C7499b.m14977z0(obj);
                j12 = j14;
                objM2014a = obj;
            }
            return new C10025m(C10025m.m18638d(j13, C10025m.m18638d(j12, ((C10025m) objM2014a).f50987a)));
        }
        C7499b.m14977z0(obj);
        j10 = this.f2235g;
        NestedScrollDispatcher value2 = scrollingLogic.f2205c.getValue();
        this.f2235g = j10;
        this.f2234f = 1;
        objM2015b = value2.m2015b(j10, this);
        if (objM2015b == coroutineSingletons) {
            return coroutineSingletons;
        }
        long jM18638d2 = C10025m.m18638d(j10, ((C10025m) objM2015b).f50987a);
        this.f2235g = j10;
        this.f2233e = jM18638d2;
        this.f2234f = 2;
        objM1480b = scrollingLogic.m1480b(jM18638d2, this);
        if (objM1480b == coroutineSingletons) {
            return coroutineSingletons;
        }
        j11 = jM18638d2;
        j12 = ((C10025m) objM1480b).f50987a;
        NestedScrollDispatcher value3 = scrollingLogic.f2205c.getValue();
        long jM18638d3 = C10025m.m18638d(j11, j12);
        this.f2235g = j10;
        this.f2233e = j12;
        this.f2234f = 3;
        objM2014a = value3.m2014a(jM18638d3, j12, this);
        if (objM2014a == coroutineSingletons) {
            return coroutineSingletons;
        }
        j13 = j10;
        return new C10025m(C10025m.m18638d(j13, C10025m.m18638d(j12, ((C10025m) objM2014a).f50987a)));
    }
}
