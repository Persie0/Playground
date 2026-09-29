package androidx.compose.p017ui.input.nestedscroll;

import cm.InterfaceC2041a;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import no.InterfaceC7882z;
import p037c1.InterfaceC1657a;
import p260m8.C7499b;
import p464wl.InterfaceC9968c;
import p470x1.C10025m;

/* JADX INFO: loaded from: classes.dex */
public final class NestedScrollDispatcher {

    /* JADX INFO: renamed from: a */
    public InterfaceC2041a<? extends InterfaceC7882z> f3578a = new InterfaceC2041a<InterfaceC7882z>() { // from class: androidx.compose.ui.input.nestedscroll.NestedScrollDispatcher$calculateNestedScrollScope$1
        {
            super(0);
        }

        @Override // cm.InterfaceC2041a
        /* JADX INFO: renamed from: E */
        public final InterfaceC7882z mo807E() {
            return this.f3581b.f3579b;
        }
    };

    /* JADX INFO: renamed from: b */
    public InterfaceC7882z f3579b;

    /* JADX INFO: renamed from: c */
    public InterfaceC1657a f3580c;

    /* JADX WARN: Code duplicated, block: B:7:0x0019  */
    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    /* JADX INFO: renamed from: a */
    public final Object m2014a(long j10, long j11, InterfaceC9968c<? super C10025m> interfaceC9968c) throws Throwable {
        NestedScrollDispatcher$dispatchPostFling$1 nestedScrollDispatcher$dispatchPostFling$1;
        long j12;
        if (interfaceC9968c instanceof NestedScrollDispatcher$dispatchPostFling$1) {
            nestedScrollDispatcher$dispatchPostFling$1 = (NestedScrollDispatcher$dispatchPostFling$1) interfaceC9968c;
            int i10 = nestedScrollDispatcher$dispatchPostFling$1.f3584f;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                nestedScrollDispatcher$dispatchPostFling$1.f3584f = i10 - Integer.MIN_VALUE;
            } else {
                nestedScrollDispatcher$dispatchPostFling$1 = new NestedScrollDispatcher$dispatchPostFling$1(this, interfaceC9968c);
            }
        } else {
            nestedScrollDispatcher$dispatchPostFling$1 = new NestedScrollDispatcher$dispatchPostFling$1(this, interfaceC9968c);
        }
        NestedScrollDispatcher$dispatchPostFling$1 nestedScrollDispatcher$dispatchPostFling$2 = nestedScrollDispatcher$dispatchPostFling$1;
        Object objMo1476c = nestedScrollDispatcher$dispatchPostFling$2.f3582d;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i11 = nestedScrollDispatcher$dispatchPostFling$2.f3584f;
        if (i11 == 0) {
            C7499b.m14977z0(objMo1476c);
            InterfaceC1657a interfaceC1657a = this.f3580c;
            if (interfaceC1657a != null) {
                nestedScrollDispatcher$dispatchPostFling$2.f3584f = 1;
                objMo1476c = interfaceC1657a.mo1476c(j10, j11, nestedScrollDispatcher$dispatchPostFling$2);
                if (objMo1476c == coroutineSingletons) {
                    return coroutineSingletons;
                }
            } else {
                int i12 = C10025m.f50986c;
                j12 = C10025m.f50985b;
            }
            return new C10025m(j12);
        }
        if (i11 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        C7499b.m14977z0(objMo1476c);
        j12 = ((C10025m) objMo1476c).f50987a;
        return new C10025m(j12);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0018  */
    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    /* JADX INFO: renamed from: b */
    public final Object m2015b(long j10, InterfaceC9968c<? super C10025m> interfaceC9968c) throws Throwable {
        NestedScrollDispatcher$dispatchPreFling$1 nestedScrollDispatcher$dispatchPreFling$1;
        long j11;
        if (interfaceC9968c instanceof NestedScrollDispatcher$dispatchPreFling$1) {
            nestedScrollDispatcher$dispatchPreFling$1 = (NestedScrollDispatcher$dispatchPreFling$1) interfaceC9968c;
            int i10 = nestedScrollDispatcher$dispatchPreFling$1.f3587f;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                nestedScrollDispatcher$dispatchPreFling$1.f3587f = i10 - Integer.MIN_VALUE;
            } else {
                nestedScrollDispatcher$dispatchPreFling$1 = new NestedScrollDispatcher$dispatchPreFling$1(this, interfaceC9968c);
            }
        } else {
            nestedScrollDispatcher$dispatchPreFling$1 = new NestedScrollDispatcher$dispatchPreFling$1(this, interfaceC9968c);
        }
        Object objMo2017h = nestedScrollDispatcher$dispatchPreFling$1.f3585d;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i11 = nestedScrollDispatcher$dispatchPreFling$1.f3587f;
        if (i11 == 0) {
            C7499b.m14977z0(objMo2017h);
            InterfaceC1657a interfaceC1657a = this.f3580c;
            if (interfaceC1657a != null) {
                nestedScrollDispatcher$dispatchPreFling$1.f3587f = 1;
                objMo2017h = interfaceC1657a.mo2017h(j10, nestedScrollDispatcher$dispatchPreFling$1);
                if (objMo2017h == coroutineSingletons) {
                    return coroutineSingletons;
                }
            } else {
                int i12 = C10025m.f50986c;
                j11 = C10025m.f50985b;
            }
            return new C10025m(j11);
        }
        if (i11 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        C7499b.m14977z0(objMo2017h);
        j11 = ((C10025m) objMo2017h).f50987a;
        return new C10025m(j11);
    }
}
