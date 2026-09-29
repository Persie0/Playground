package androidx.compose.foundation.gestures;

import androidx.compose.foundation.MutatePriority;
import androidx.compose.p017ui.input.nestedscroll.NestedScrollDispatcher;
import androidx.compose.runtime.ParcelableSnapshotMutableState;
import cm.InterfaceC2052l;
import dm.C5207g;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.jvm.internal.Ref$LongRef;
import p037c1.InterfaceC1657a;
import p081e0.InterfaceC5301c1;
import p081e0.InterfaceC5312g0;
import p260m8.C7499b;
import p338qd.C8573r0;
import p375s0.C8941c;
import p386t.InterfaceC9132x;
import p401u.InterfaceC9351d;
import p401u.InterfaceC9356i;
import p401u.InterfaceC9357j;
import p464wl.InterfaceC9968c;
import p470x1.C10025m;
import sl.C9072e;

/* JADX INFO: loaded from: classes.dex */
public final class ScrollingLogic {

    /* JADX INFO: renamed from: a */
    public final Orientation f2203a;

    /* JADX INFO: renamed from: b */
    public final boolean f2204b;

    /* JADX INFO: renamed from: c */
    public final InterfaceC5301c1<NestedScrollDispatcher> f2205c;

    /* JADX INFO: renamed from: d */
    public final InterfaceC9357j f2206d;

    /* JADX INFO: renamed from: e */
    public final InterfaceC9351d f2207e;

    /* JADX INFO: renamed from: f */
    public final InterfaceC9132x f2208f;

    /* JADX INFO: renamed from: g */
    public final ParcelableSnapshotMutableState f2209g;

    public ScrollingLogic(Orientation orientation, boolean z10, InterfaceC5312g0 interfaceC5312g0, InterfaceC9357j interfaceC9357j, InterfaceC9351d interfaceC9351d, InterfaceC9132x interfaceC9132x) {
        C5207g.m11111f(orientation, "orientation");
        C5207g.m11111f(interfaceC5312g0, "nestedScrollDispatcher");
        C5207g.m11111f(interfaceC9357j, "scrollableState");
        C5207g.m11111f(interfaceC9351d, "flingBehavior");
        this.f2203a = orientation;
        this.f2204b = z10;
        this.f2205c = interfaceC5312g0;
        this.f2206d = interfaceC9357j;
        this.f2207e = interfaceC9351d;
        this.f2208f = interfaceC9132x;
        this.f2209g = C8573r0.m16684L0(Boolean.FALSE);
    }

    /* JADX INFO: renamed from: a */
    public final long m1479a(final InterfaceC9356i interfaceC9356i, long j10, final int i10) {
        C5207g.m11111f(interfaceC9356i, "$this$dispatchScroll");
        long jM14932c = this.f2203a == Orientation.Horizontal ? C7499b.m14932c(C8941c.m17164c(j10), 0.0f) : C7499b.m14932c(0.0f, C8941c.m17165d(j10));
        InterfaceC2052l<C8941c, C8941c> interfaceC2052l = new InterfaceC2052l<C8941c, C8941c>() { // from class: androidx.compose.foundation.gestures.ScrollingLogic$dispatchScroll$performScroll$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // cm.InterfaceC2052l
            /* JADX INFO: renamed from: n */
            public final C8941c mo528n(C8941c c8941c) {
                long j11 = c8941c.f46892a;
                ScrollingLogic scrollingLogic = this.f2210b;
                NestedScrollDispatcher value = scrollingLogic.f2205c.getValue();
                InterfaceC1657a interfaceC1657a = value.f3580c;
                long jMo1477d = interfaceC1657a != null ? interfaceC1657a.mo1477d(i10, j11) : C8941c.f46888b;
                long jM17166e = C8941c.m17166e(j11, jMo1477d);
                boolean z10 = scrollingLogic.f2204b;
                long jM1483e = scrollingLogic.m1483e(interfaceC9356i.mo1442a(scrollingLogic.m1482d(z10 ? C8941c.m17168g(-1.0f, jM17166e) : jM17166e)));
                if (z10) {
                    jM1483e = C8941c.m17168g(-1.0f, jM1483e);
                }
                long jM17166e2 = C8941c.m17166e(jM17166e, jM1483e);
                int i11 = i10;
                InterfaceC1657a interfaceC1657a2 = value.f3580c;
                return new C8941c(C8941c.m17167f(C8941c.m17167f(jMo1477d, jM1483e), interfaceC1657a2 != null ? interfaceC1657a2.mo1478i(i11, jM1483e, jM17166e2) : C8941c.f46888b));
            }
        };
        InterfaceC9132x interfaceC9132x = this.f2208f;
        if (interfaceC9132x != null) {
            InterfaceC9357j interfaceC9357j = this.f2206d;
            if (interfaceC9357j.mo1419e() || interfaceC9357j.mo1418c()) {
                return interfaceC9132x.mo1396c(jM14932c, i10, interfaceC2052l);
            }
        }
        return ((C8941c) interfaceC2052l.mo528n(new C8941c(jM14932c))).f46892a;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0019  */
    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    /* JADX INFO: renamed from: b */
    public final Object m1480b(long j10, InterfaceC9968c<? super C10025m> interfaceC9968c) throws Throwable {
        ScrollingLogic$doFlingAnimation$1 scrollingLogic$doFlingAnimation$1;
        Ref$LongRef ref$LongRef;
        if (interfaceC9968c instanceof ScrollingLogic$doFlingAnimation$1) {
            scrollingLogic$doFlingAnimation$1 = (ScrollingLogic$doFlingAnimation$1) interfaceC9968c;
            int i10 = scrollingLogic$doFlingAnimation$1.f2216g;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                scrollingLogic$doFlingAnimation$1.f2216g = i10 - Integer.MIN_VALUE;
            } else {
                scrollingLogic$doFlingAnimation$1 = new ScrollingLogic$doFlingAnimation$1(this, interfaceC9968c);
            }
        } else {
            scrollingLogic$doFlingAnimation$1 = new ScrollingLogic$doFlingAnimation$1(this, interfaceC9968c);
        }
        Object obj = scrollingLogic$doFlingAnimation$1.f2214e;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i11 = scrollingLogic$doFlingAnimation$1.f2216g;
        if (i11 == 0) {
            C7499b.m14977z0(obj);
            Ref$LongRef ref$LongRef2 = new Ref$LongRef();
            ref$LongRef2.f38126a = j10;
            ScrollingLogic$doFlingAnimation$2 scrollingLogic$doFlingAnimation$2 = new ScrollingLogic$doFlingAnimation$2(this, ref$LongRef2, j10, null);
            scrollingLogic$doFlingAnimation$1.f2213d = ref$LongRef2;
            scrollingLogic$doFlingAnimation$1.f2216g = 1;
            if (this.f2206d.mo1417b(MutatePriority.Default, scrollingLogic$doFlingAnimation$2, scrollingLogic$doFlingAnimation$1) == coroutineSingletons) {
                return coroutineSingletons;
            }
            ref$LongRef = ref$LongRef2;
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ref$LongRef = scrollingLogic$doFlingAnimation$1.f2213d;
            C7499b.m14977z0(obj);
        }
        return new C10025m(ref$LongRef.f38126a);
    }

    /* JADX WARN: Code duplicated, block: B:34:0x0092  */
    /* JADX WARN: Code duplicated, block: B:36:0x00a3 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:7:0x0019  */
    /* JADX INFO: renamed from: c */
    public final Object m1481c(long j10, InterfaceC9968c<? super C9072e> interfaceC9968c) throws Throwable {
        ScrollingLogic$onDragStopped$1 scrollingLogic$onDragStopped$1;
        C10025m c10025m;
        ScrollingLogic scrollingLogic;
        if (interfaceC9968c instanceof ScrollingLogic$onDragStopped$1) {
            scrollingLogic$onDragStopped$1 = (ScrollingLogic$onDragStopped$1) interfaceC9968c;
            int i10 = scrollingLogic$onDragStopped$1.f2232g;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                scrollingLogic$onDragStopped$1.f2232g = i10 - Integer.MIN_VALUE;
            } else {
                scrollingLogic$onDragStopped$1 = new ScrollingLogic$onDragStopped$1(this, interfaceC9968c);
            }
        } else {
            scrollingLogic$onDragStopped$1 = new ScrollingLogic$onDragStopped$1(this, interfaceC9968c);
        }
        Object obj = scrollingLogic$onDragStopped$1.f2230e;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i11 = scrollingLogic$onDragStopped$1.f2232g;
        if (i11 == 0) {
            C7499b.m14977z0(obj);
            this.f2209g.setValue(Boolean.TRUE);
            long jM18635a = C10025m.m18635a(j10, 0.0f, 0.0f, this.f2203a == Orientation.Horizontal ? 1 : 2);
            ScrollingLogic$onDragStopped$performFling$1 scrollingLogic$onDragStopped$performFling$1 = new ScrollingLogic$onDragStopped$performFling$1(this, null);
            InterfaceC9132x interfaceC9132x = this.f2208f;
            if (interfaceC9132x != null) {
                InterfaceC9357j interfaceC9357j = this.f2206d;
                if (interfaceC9357j.mo1419e() || interfaceC9357j.mo1418c()) {
                    scrollingLogic$onDragStopped$1.f2229d = this;
                    scrollingLogic$onDragStopped$1.f2232g = 1;
                    if (interfaceC9132x.mo1395b(jM18635a, scrollingLogic$onDragStopped$performFling$1, scrollingLogic$onDragStopped$1) == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    c10025m = new C10025m(jM18635a);
                    scrollingLogic$onDragStopped$1.f2229d = this;
                    scrollingLogic$onDragStopped$1.f2232g = 2;
                    if (scrollingLogic$onDragStopped$performFling$1.mo1337m0(c10025m, scrollingLogic$onDragStopped$1) == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                }
            } else {
                c10025m = new C10025m(jM18635a);
                scrollingLogic$onDragStopped$1.f2229d = this;
                scrollingLogic$onDragStopped$1.f2232g = 2;
                if (scrollingLogic$onDragStopped$performFling$1.mo1337m0(c10025m, scrollingLogic$onDragStopped$1) == coroutineSingletons) {
                    return coroutineSingletons;
                }
            }
            scrollingLogic = this;
        } else {
            if (i11 != 1 && i11 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            scrollingLogic = scrollingLogic$onDragStopped$1.f2229d;
            C7499b.m14977z0(obj);
        }
        scrollingLogic.f2209g.setValue(Boolean.FALSE);
        return C9072e.f47360a;
    }

    /* JADX INFO: renamed from: d */
    public final float m1482d(long j10) {
        return this.f2203a == Orientation.Horizontal ? C8941c.m17164c(j10) : C8941c.m17165d(j10);
    }

    /* JADX INFO: renamed from: e */
    public final long m1483e(float f3) {
        if (!(f3 == 0.0f)) {
            return this.f2203a == Orientation.Horizontal ? C7499b.m14932c(f3, 0.0f) : C7499b.m14932c(0.0f, f3);
        }
        int i10 = C8941c.f46891e;
        return C8941c.f46888b;
    }
}
