package androidx.room;

import kotlin.AbstractC3193b;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.flow.C3244l;
import p000.AbstractC3352my;
import p000.C3386nv;

/* JADX INFO: renamed from: androidx.room.b */
/* JADX INFO: loaded from: classes.dex */
public final class C0737b {

    /* JADX INFO: renamed from: a */
    public final C3244l f6824a;

    public C0737b(int i) {
        this.f6824a = AbstractC3352my.m17114d(new int[i]);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: a */
    public final CoroutineSingletons m2810a(C0749g c0749g, ContinuationImpl continuationImpl) throws Throwable {
        ObservedTableVersions$collect$1 observedTableVersions$collect$1;
        if (continuationImpl instanceof ObservedTableVersions$collect$1) {
            observedTableVersions$collect$1 = (ObservedTableVersions$collect$1) continuationImpl;
            int i = observedTableVersions$collect$1.f6729c;
            if ((i & Integer.MIN_VALUE) != 0) {
                observedTableVersions$collect$1.f6729c = i - Integer.MIN_VALUE;
            } else {
                observedTableVersions$collect$1 = new ObservedTableVersions$collect$1(this, continuationImpl);
            }
        } else {
            observedTableVersions$collect$1 = new ObservedTableVersions$collect$1(this, continuationImpl);
        }
        Object obj = observedTableVersions$collect$1.f6727a;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = observedTableVersions$collect$1.f6729c;
        if (i2 == 0) {
            AbstractC3193b.m15359b(obj);
            observedTableVersions$collect$1.f6729c = 1;
            if (this.f6824a.collect(c0749g, observedTableVersions$collect$1) == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i2 != 1) {
                C3386nv.m17633t("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            AbstractC3193b.m15359b(obj);
        }
        C3386nv.m17631r();
        return null;
    }
}
