package androidx.compose.p002ui.input.nestedscroll;

import kotlin.AbstractC3193b;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p000.C3386nv;
import p000.dpa;
import p000.ui3;
import p000.un1;

/* JADX INFO: renamed from: androidx.compose.ui.input.nestedscroll.a */
/* JADX INFO: loaded from: classes.dex */
public final class C0317a {

    /* JADX INFO: renamed from: a */
    public C0320d f4083a;

    /* JADX INFO: renamed from: b */
    public C0320d f4084b;

    /* JADX INFO: renamed from: c */
    public ui3 f4085c = new ui3() { // from class: androidx.compose.ui.input.nestedscroll.NestedScrollDispatcher$calculateNestedScrollScope$1
        {
            super(0);
        }

        @Override // p000.ui3
        /* JADX INFO: renamed from: a */
        public final Object mo0a() {
            return this.f4065b.f4086d;
        }
    };

    /* JADX INFO: renamed from: d */
    public un1 f4086d;

    /* JADX WARN: Code duplicated, block: B:8:0x0014  */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0052, code lost:
    
        if (r0 == r1) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x006b, code lost:
    
        if (r0 == r1) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x006d, code lost:
    
        return r1;
     */
    /* JADX INFO: renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object m1447a(long j, long j2, ContinuationImpl continuationImpl) throws Throwable {
        NestedScrollDispatcher$dispatchPostFling$1 nestedScrollDispatcher$dispatchPostFling$1;
        long j3;
        if (continuationImpl instanceof NestedScrollDispatcher$dispatchPostFling$1) {
            nestedScrollDispatcher$dispatchPostFling$1 = (NestedScrollDispatcher$dispatchPostFling$1) continuationImpl;
            int i = nestedScrollDispatcher$dispatchPostFling$1.f4068c;
            if ((i & Integer.MIN_VALUE) != 0) {
                nestedScrollDispatcher$dispatchPostFling$1.f4068c = i - Integer.MIN_VALUE;
            } else {
                nestedScrollDispatcher$dispatchPostFling$1 = new NestedScrollDispatcher$dispatchPostFling$1(this, continuationImpl);
            }
        } else {
            nestedScrollDispatcher$dispatchPostFling$1 = new NestedScrollDispatcher$dispatchPostFling$1(this, continuationImpl);
        }
        NestedScrollDispatcher$dispatchPostFling$1 nestedScrollDispatcher$dispatchPostFling$2 = nestedScrollDispatcher$dispatchPostFling$1;
        Object objMo919t = nestedScrollDispatcher$dispatchPostFling$2.f4066a;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = nestedScrollDispatcher$dispatchPostFling$2.f4068c;
        if (i2 == 0) {
            AbstractC3193b.m15359b(objMo919t);
            C0320d c0320d = this.f4083a;
            j3 = 0;
            if ((c0320d != null ? c0320d.m1452a1() : null) == null) {
                C0320d c0320d2 = this.f4084b;
                if (c0320d2 != null) {
                    nestedScrollDispatcher$dispatchPostFling$2.f4068c = 1;
                    objMo919t = c0320d2.mo919t(j, j2, nestedScrollDispatcher$dispatchPostFling$2);
                }
            } else {
                C0320d c0320d3 = this.f4083a;
                C0320d c0320dM1452a1 = c0320d3 != null ? c0320d3.m1452a1() : null;
                if (c0320dM1452a1 != null) {
                    nestedScrollDispatcher$dispatchPostFling$2.f4068c = 2;
                    objMo919t = c0320dM1452a1.mo919t(j, j2, nestedScrollDispatcher$dispatchPostFling$2);
                }
            }
        } else if (i2 == 1) {
            AbstractC3193b.m15359b(objMo919t);
            j3 = ((dpa) objMo919t).f36010a;
        } else {
            if (i2 != 2) {
                C3386nv.m17633t("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            AbstractC3193b.m15359b(objMo919t);
            j3 = ((dpa) objMo919t).f36010a;
        }
        return new dpa(j3);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: b */
    public final Object m1448b(long j, ContinuationImpl continuationImpl) throws Throwable {
        NestedScrollDispatcher$dispatchPreFling$1 nestedScrollDispatcher$dispatchPreFling$1;
        long j2;
        if (continuationImpl instanceof NestedScrollDispatcher$dispatchPreFling$1) {
            nestedScrollDispatcher$dispatchPreFling$1 = (NestedScrollDispatcher$dispatchPreFling$1) continuationImpl;
            int i = nestedScrollDispatcher$dispatchPreFling$1.f4071c;
            if ((i & Integer.MIN_VALUE) != 0) {
                nestedScrollDispatcher$dispatchPreFling$1.f4071c = i - Integer.MIN_VALUE;
            } else {
                nestedScrollDispatcher$dispatchPreFling$1 = new NestedScrollDispatcher$dispatchPreFling$1(this, continuationImpl);
            }
        } else {
            nestedScrollDispatcher$dispatchPreFling$1 = new NestedScrollDispatcher$dispatchPreFling$1(this, continuationImpl);
        }
        Object objMo1198p0 = nestedScrollDispatcher$dispatchPreFling$1.f4069a;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = nestedScrollDispatcher$dispatchPreFling$1.f4071c;
        if (i2 == 0) {
            AbstractC3193b.m15359b(objMo1198p0);
            C0320d c0320d = this.f4083a;
            C0320d c0320dM1452a1 = c0320d != null ? c0320d.m1452a1() : null;
            if (c0320dM1452a1 != null) {
                nestedScrollDispatcher$dispatchPreFling$1.f4071c = 1;
                objMo1198p0 = c0320dM1452a1.mo1198p0(j, nestedScrollDispatcher$dispatchPreFling$1);
                if (objMo1198p0 == coroutineSingletons) {
                    return coroutineSingletons;
                }
            } else {
                j2 = 0;
            }
            return new dpa(j2);
        }
        if (i2 != 1) {
            C3386nv.m17633t("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        AbstractC3193b.m15359b(objMo1198p0);
        j2 = ((dpa) objMo1198p0).f36010a;
        return new dpa(j2);
    }

    /* JADX INFO: renamed from: c */
    public final un1 m1449c() {
        un1 un1Var = (un1) this.f4085c.mo0a();
        if (un1Var != null) {
            return un1Var;
        }
        C3386nv.m17633t("in order to access nested coroutine scope you need to attach dispatcher to the `Modifier.nestedScroll` first.");
        return null;
    }
}
