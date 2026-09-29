package com.lingq.feature.search.fastsearch;

import com.lingq.core.common.util.AbstractC1263a;
import com.lingq.core.data.repository.C1305u;
import java.util.List;
import kotlin.AbstractC3193b;
import kotlin.Triple;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.C3244l;
import p000.C3386nv;
import p000.c32;
import p000.cr8;
import p000.lda;
import p000.nn1;
import p000.um5;
import p000.vi3;
import p000.vj6;
import p000.vz2;
import p000.xfa;
import p000.xm5;
import p000.ym5;

/* JADX INFO: loaded from: classes3.dex */
@c32(m4290c = "com.lingq.feature.search.fastsearch.FastSearchViewModel$fetchFromNetwork$1", m4291f = "FastSearchViewModel.kt", m4292l = {228}, m4293m = "invokeSuspend", m4294v = 2)
final class FastSearchViewModel$fetchFromNetwork$1 extends SuspendLambda implements vi3 {

    /* JADX INFO: renamed from: a */
    public int f32843a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C2768b f32844b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ String f32845c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FastSearchViewModel$fetchFromNetwork$1(C2768b c2768b, String str, Continuation continuation) {
        super(1, continuation);
        this.f32844b = c2768b;
        this.f32845c = str;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Continuation continuation) {
        return new FastSearchViewModel$fetchFromNetwork$1(this.f32844b, this.f32845c, continuation);
    }

    @Override // p000.vi3
    public final Object invoke(Object obj) {
        return ((FastSearchViewModel$fetchFromNetwork$1) create((Continuation) obj)).invokeSuspend(xfa.f68157a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objM7372c;
        Object value;
        Object value2;
        Object value3;
        C2768b c2768b = this.f32844b;
        nn1 nn1Var = c2768b.f32890n;
        C3244l c3244l = c2768b.f32892p;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.f32843a;
        if (i == 0) {
            AbstractC3193b.m15359b(obj);
            vj6 vj6Var = c2768b.f32884h;
            String strMo4589b2 = c2768b.f32878b.mo4589b2();
            this.f32843a = 1;
            objM7372c = ((C1305u) ((cr8) vj6Var.f65506b)).m7372c(strMo4589b2, this.f32845c, this);
            if (objM7372c == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                C3386nv.m17633t("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            AbstractC3193b.m15359b(obj);
            objM7372c = obj;
        }
        ym5 ym5Var = (ym5) objM7372c;
        if (ym5Var instanceof xm5) {
            Triple triple = (Triple) ((xm5) ym5Var).f68348a;
            int iIntValue = ((Number) triple.f47633a).intValue();
            List list = (List) triple.f47634b;
            List list2 = (List) triple.f47635c;
            do {
                value3 = c3244l.getValue();
            } while (!c3244l.m15570h(value3, vz2.m23657a((vz2) value3, null, false, iIntValue == 0, null, null, null, null, null, null, 505)));
            if (!list.isEmpty()) {
                AbstractC1263a.m7047b(lda.m16103C(c2768b), nn1Var, "fetchNetworkLessons", new FastSearchViewModel$fetchNetworkLessons$1(c2768b, list, null));
            }
            if (!list2.isEmpty()) {
                AbstractC1263a.m7047b(lda.m16103C(c2768b), nn1Var, "fetchNetworkCourses", new FastSearchViewModel$fetchNetworkCourses$1(c2768b, list2, null));
            }
        } else if (ym5Var instanceof um5) {
            do {
                value2 = c3244l.getValue();
            } while (!c3244l.m15570h(value2, vz2.m23657a((vz2) value2, null, false, true, null, null, null, null, null, null, 505)));
        } else {
            do {
                value = c3244l.getValue();
            } while (!c3244l.m15570h(value, vz2.m23657a((vz2) value, null, false, false, null, null, null, null, null, null, 509)));
        }
        return xfa.f68157a;
    }
}
