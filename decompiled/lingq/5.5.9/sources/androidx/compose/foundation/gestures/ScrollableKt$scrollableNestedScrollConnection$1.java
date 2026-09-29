package androidx.compose.foundation.gestures;

import kotlin.coroutines.intrinsics.CoroutineSingletons;
import p037c1.InterfaceC1657a;
import p081e0.InterfaceC5301c1;
import p081e0.InterfaceC5312g0;
import p260m8.C7499b;
import p375s0.C8941c;
import p401u.InterfaceC9357j;
import p464wl.InterfaceC9968c;
import p470x1.C10025m;

/* JADX INFO: loaded from: classes.dex */
public final class ScrollableKt$scrollableNestedScrollConnection$1 implements InterfaceC1657a {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ InterfaceC5301c1<ScrollingLogic> f2196a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ boolean f2197b;

    public ScrollableKt$scrollableNestedScrollConnection$1(InterfaceC5312g0 interfaceC5312g0, boolean z10) {
        this.f2196a = interfaceC5312g0;
        this.f2197b = z10;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0018  */
    @Override // p037c1.InterfaceC1657a
    /* JADX INFO: renamed from: c */
    public final Object mo1476c(long j10, long j11, InterfaceC9968c<? super C10025m> interfaceC9968c) throws Throwable {
        ScrollableKt$scrollableNestedScrollConnection$1$onPostFling$1 scrollableKt$scrollableNestedScrollConnection$1$onPostFling$1;
        long jM18638d;
        ScrollableKt$scrollableNestedScrollConnection$1 scrollableKt$scrollableNestedScrollConnection$1;
        if (interfaceC9968c instanceof ScrollableKt$scrollableNestedScrollConnection$1$onPostFling$1) {
            scrollableKt$scrollableNestedScrollConnection$1$onPostFling$1 = (ScrollableKt$scrollableNestedScrollConnection$1$onPostFling$1) interfaceC9968c;
            int i10 = scrollableKt$scrollableNestedScrollConnection$1$onPostFling$1.f2202h;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                scrollableKt$scrollableNestedScrollConnection$1$onPostFling$1.f2202h = i10 - Integer.MIN_VALUE;
            } else {
                scrollableKt$scrollableNestedScrollConnection$1$onPostFling$1 = new ScrollableKt$scrollableNestedScrollConnection$1$onPostFling$1(this, interfaceC9968c);
            }
        } else {
            scrollableKt$scrollableNestedScrollConnection$1$onPostFling$1 = new ScrollableKt$scrollableNestedScrollConnection$1$onPostFling$1(this, interfaceC9968c);
        }
        Object objM1480b = scrollableKt$scrollableNestedScrollConnection$1$onPostFling$1.f2200f;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i11 = scrollableKt$scrollableNestedScrollConnection$1$onPostFling$1.f2202h;
        if (i11 == 0) {
            C7499b.m14977z0(objM1480b);
            if (this.f2197b) {
                ScrollingLogic value = this.f2196a.getValue();
                scrollableKt$scrollableNestedScrollConnection$1$onPostFling$1.f2198d = this;
                scrollableKt$scrollableNestedScrollConnection$1$onPostFling$1.f2199e = j11;
                scrollableKt$scrollableNestedScrollConnection$1$onPostFling$1.f2202h = 1;
                objM1480b = value.m1480b(j11, scrollableKt$scrollableNestedScrollConnection$1$onPostFling$1);
                if (objM1480b == coroutineSingletons) {
                    return coroutineSingletons;
                }
                scrollableKt$scrollableNestedScrollConnection$1 = this;
            } else {
                jM18638d = C10025m.f50985b;
                scrollableKt$scrollableNestedScrollConnection$1 = this;
            }
            C10025m c10025m = new C10025m(jM18638d);
            scrollableKt$scrollableNestedScrollConnection$1.f2196a.getValue().f2209g.setValue(Boolean.FALSE);
            return c10025m;
        }
        if (i11 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        j11 = scrollableKt$scrollableNestedScrollConnection$1$onPostFling$1.f2199e;
        scrollableKt$scrollableNestedScrollConnection$1 = scrollableKt$scrollableNestedScrollConnection$1$onPostFling$1.f2198d;
        C7499b.m14977z0(objM1480b);
        jM18638d = C10025m.m18638d(j11, ((C10025m) objM1480b).f50987a);
        C10025m c10025m2 = new C10025m(jM18638d);
        scrollableKt$scrollableNestedScrollConnection$1.f2196a.getValue().f2209g.setValue(Boolean.FALSE);
        return c10025m2;
    }

    @Override // p037c1.InterfaceC1657a
    /* JADX INFO: renamed from: d */
    public final long mo1477d(int i10, long j10) {
        if (i10 == 2) {
            this.f2196a.getValue().f2209g.setValue(Boolean.TRUE);
        }
        return C8941c.f46888b;
    }

    @Override // p037c1.InterfaceC1657a
    /* JADX INFO: renamed from: i */
    public final long mo1478i(int i10, long j10, long j11) {
        if (!this.f2197b) {
            return C8941c.f46888b;
        }
        ScrollingLogic value = this.f2196a.getValue();
        InterfaceC9357j interfaceC9357j = value.f2206d;
        if (interfaceC9357j.mo1416a()) {
            return C8941c.f46888b;
        }
        float fM1482d = value.m1482d(j11);
        boolean z10 = value.f2204b;
        if (z10) {
            fM1482d *= -1;
        }
        float fMo1420f = interfaceC9357j.mo1420f(fM1482d);
        if (z10) {
            fMo1420f *= -1;
        }
        return value.m1483e(fMo1420f);
    }
}
