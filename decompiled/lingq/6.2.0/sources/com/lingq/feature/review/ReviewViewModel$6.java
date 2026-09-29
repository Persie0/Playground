package com.lingq.feature.review;

import android.os.Bundle;
import com.lingq.core.analytics.C1240a;
import java.util.List;
import kotlin.AbstractC3193b;
import kotlin.collections.EmptyList;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.AbstractC3224d;
import kotlinx.coroutines.flow.C3244l;
import p000.C3386nv;
import p000.C3540rl;
import p000.c32;
import p000.dj3;
import p000.gxc;
import p000.id8;
import p000.lda;
import p000.n83;
import p000.nn1;
import p000.p08;
import p000.un1;
import p000.vg8;
import p000.wfb;
import p000.xfa;
import p000.zi3;

/* JADX INFO: loaded from: classes3.dex */
@c32(m4290c = "com.lingq.feature.review.ReviewViewModel$6", m4291f = "ReviewViewModel.kt", m4292l = {337}, m4293m = "invokeSuspend", m4294v = 2)
final class ReviewViewModel$6 extends SuspendLambda implements zi3 {

    /* JADX INFO: renamed from: a */
    public int f31845a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C2758f f31846b;

    /* JADX INFO: renamed from: com.lingq.feature.review.ReviewViewModel$6$2 */
    @c32(m4290c = "com.lingq.feature.review.ReviewViewModel$6$2", m4291f = "ReviewViewModel.kt", m4292l = {}, m4293m = "invokeSuspend", m4294v = 2)
    final class C26332 extends SuspendLambda implements dj3 {

        /* JADX INFO: renamed from: a */
        public /* synthetic */ List f31847a;

        /* JADX INFO: renamed from: b */
        public /* synthetic */ boolean f31848b;

        /* JADX INFO: renamed from: c */
        public /* synthetic */ boolean f31849c;

        /* JADX INFO: renamed from: d */
        public /* synthetic */ boolean f31850d;

        /* JADX INFO: renamed from: e */
        public /* synthetic */ boolean f31851e;

        public C26332(Continuation continuation) {
            super(6, continuation);
        }

        @Override // p000.dj3
        /* JADX INFO: renamed from: h */
        public final Object mo1290h(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6) {
            boolean zBooleanValue = ((Boolean) obj2).booleanValue();
            boolean zBooleanValue2 = ((Boolean) obj3).booleanValue();
            boolean zBooleanValue3 = ((Boolean) obj4).booleanValue();
            boolean zBooleanValue4 = ((Boolean) obj5).booleanValue();
            C26332 c26332 = new C26332((Continuation) obj6);
            c26332.f31847a = (List) obj;
            c26332.f31848b = zBooleanValue;
            c26332.f31849c = zBooleanValue2;
            c26332.f31850d = zBooleanValue3;
            c26332.f31851e = zBooleanValue4;
            return c26332.invokeSuspend(xfa.f68157a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            List list = this.f31847a;
            boolean z = this.f31848b;
            boolean z2 = this.f31849c;
            boolean z3 = this.f31850d;
            boolean z4 = this.f31851e;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            AbstractC3193b.m15359b(obj);
            return new vg8(list, z, z2, z3, z4);
        }
    }

    /* JADX INFO: renamed from: com.lingq.feature.review.ReviewViewModel$6$3 */
    @c32(m4290c = "com.lingq.feature.review.ReviewViewModel$6$3", m4291f = "ReviewViewModel.kt", m4292l = {}, m4293m = "invokeSuspend", m4294v = 2)
    final class C26343 extends SuspendLambda implements zi3 {

        /* JADX INFO: renamed from: a */
        public /* synthetic */ Object f31852a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ C2758f f31853b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C26343(C2758f c2758f, Continuation continuation) {
            super(2, continuation);
            this.f31853b = c2758f;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            C26343 c26343 = new C26343(this.f31853b, continuation);
            c26343.f31852a = obj;
            return c26343;
        }

        @Override // p000.zi3
        public final Object invoke(Object obj, Object obj2) throws Throwable {
            C26343 c26343 = (C26343) create((vg8) obj, (Continuation) obj2);
            xfa xfaVar = xfa.f68157a;
            c26343.invokeSuspend(xfaVar);
            return xfaVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            Object value;
            Object value2;
            vg8 vg8Var = (vg8) this.f31852a;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            AbstractC3193b.m15359b(obj);
            C2758f c2758f = this.f31853b;
            nn1 nn1Var = c2758f.f32513i;
            id8 id8Var = c2758f.f32516l;
            if (gxc.m12970b(id8Var.f43979b)) {
                Bundle bundle = new Bundle();
                bundle.putString("Review type", gxc.m12971c(id8Var.f43979b));
                bundle.putString("Review location", c2758f.f32517m);
                ((C1240a) c2758f.f32515k).m7025f("Review session started", bundle);
                List list = vg8Var.f65354a;
                boolean z = vg8Var.f65355b;
                boolean z2 = vg8Var.f65356c;
                boolean z3 = vg8Var.f65357d;
                wfb.m23926u(lda.m16103C(c2758f), nn1Var, null, new ReviewViewModel$buildMultiWordActivities$1(c2758f, list, z2, vg8Var.f65358e, z3, z, null), 2);
            } else {
                String strMo4589b2 = c2758f.f32506b.mo4589b2();
                C3244l c3244l = c2758f.f32528x;
                do {
                    value = c3244l.getValue();
                    ((Boolean) value).getClass();
                } while (!c3244l.m15570h(value, Boolean.TRUE));
                C3244l c3244l2 = c2758f.f32526v;
                do {
                    value2 = c3244l2.getValue();
                } while (!c3244l2.m15570h(value2, EmptyList.f47638a));
                wfb.m23926u(lda.m16103C(c2758f), nn1Var, null, new ReviewViewModel$cardsForAnswers$5(c2758f, strMo4589b2, null), 2);
            }
            return xfa.f68157a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ReviewViewModel$6(C2758f c2758f, Continuation continuation) {
        super(2, continuation);
        this.f31846b = c2758f;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new ReviewViewModel$6(this.f31846b, continuation);
    }

    @Override // p000.zi3
    public final Object invoke(Object obj, Object obj2) {
        return ((ReviewViewModel$6) create((un1) obj, (Continuation) obj2)).invokeSuspend(xfa.f68157a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.f31845a;
        if (i == 0) {
            AbstractC3193b.m15359b(obj);
            C2758f c2758f = this.f31846b;
            n83 n83VarM15530i = AbstractC3224d.m15530i(new p08(c2758f.f32519o, 10), new C3540rl(c2758f.f32490I, 5), c2758f.f32498Q, c2758f.f32499R, c2758f.f32497P, new C26332(null));
            C26343 c26343 = new C26343(c2758f, null);
            this.f31845a = 1;
            if (AbstractC3224d.m15529h(n83VarM15530i, c26343, this) == coroutineSingletons) {
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
