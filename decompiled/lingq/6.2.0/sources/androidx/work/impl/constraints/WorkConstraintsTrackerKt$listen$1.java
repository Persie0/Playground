package androidx.work.impl.constraints;

import java.util.ArrayList;
import java.util.Iterator;
import kotlin.AbstractC3193b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.AbstractC3224d;
import p000.C3386nv;
import p000.C3602t8;
import p000.c32;
import p000.c83;
import p000.dj1;
import p000.f57;
import p000.p8b;
import p000.t91;
import p000.u91;
import p000.un1;
import p000.v91;
import p000.vr6;
import p000.xfa;
import p000.zi3;

/* JADX INFO: loaded from: classes2.dex */
@c32(m4290c = "androidx.work.impl.constraints.WorkConstraintsTrackerKt$listen$1", m4291f = "WorkConstraintsTracker.kt", m4292l = {69}, m4293m = "invokeSuspend")
final class WorkConstraintsTrackerKt$listen$1 extends SuspendLambda implements zi3 {

    /* JADX INFO: renamed from: a */
    public int f7230a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ f57 f7231b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ p8b f7232c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ vr6 f7233d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WorkConstraintsTrackerKt$listen$1(f57 f57Var, p8b p8bVar, vr6 vr6Var, Continuation continuation) {
        super(2, continuation);
        this.f7231b = f57Var;
        this.f7232c = p8bVar;
        this.f7233d = vr6Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new WorkConstraintsTrackerKt$listen$1(this.f7231b, this.f7232c, this.f7233d, continuation);
    }

    @Override // p000.zi3
    public final Object invoke(Object obj, Object obj2) {
        return ((WorkConstraintsTrackerKt$listen$1) create((un1) obj, (Continuation) obj2)).invokeSuspend(xfa.f68157a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        p8b p8bVar;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.f7230a;
        if (i == 0) {
            AbstractC3193b.m15359b(obj);
            f57 f57Var = this.f7231b;
            f57Var.getClass();
            ArrayList arrayList = f57Var.f38440a;
            ArrayList arrayList2 = new ArrayList();
            Iterator it = arrayList.iterator();
            while (true) {
                boolean zHasNext = it.hasNext();
                p8bVar = this.f7232c;
                if (!zHasNext) {
                    break;
                }
                Object next = it.next();
                if (((dj1) next).mo2921b(p8bVar)) {
                    arrayList2.add(next);
                }
            }
            ArrayList arrayList3 = new ArrayList(v91.m23189q0(arrayList2, 10));
            Iterator it2 = arrayList2.iterator();
            while (it2.hasNext()) {
                arrayList3.add(((dj1) it2.next()).mo2920a(p8bVar.f55781j));
            }
            c83 c83VarM15536o = AbstractC3224d.m15536o(new t91((c83[]) u91.m22622n1(arrayList3).toArray(new c83[0]), 4));
            C3602t8 c3602t8 = new C3602t8(16, this.f7233d, p8bVar);
            this.f7230a = 1;
            if (c83VarM15536o.collect(c3602t8, this) == coroutineSingletons) {
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
