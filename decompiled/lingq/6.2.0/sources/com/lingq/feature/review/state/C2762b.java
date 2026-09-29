package com.lingq.feature.review.state;

import com.lingq.core.data.repository.C1287c;
import com.lingq.core.domain.model.lesson.LessonCard;
import com.lingq.core.domain.model.user.ProfileAccount;
import com.lingq.feature.review.R$string;
import java.util.ArrayList;
import java.util.List;
import kotlin.AbstractC3193b;
import kotlin.collections.EmptyList;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.flow.AbstractC3224d;
import p000.AbstractC3352my;
import p000.C3386nv;
import p000.bd8;
import p000.c83;
import p000.cd8;
import p000.cma;
import p000.eh9;
import p000.fa8;
import p000.ib8;
import p000.ie8;
import p000.ld8;
import p000.md8;
import p000.nd8;
import p000.t7d;
import p000.u91;
import p000.v91;
import p000.wc8;
import p000.xa2;

/* JADX INFO: renamed from: com.lingq.feature.review.state.b */
/* JADX INFO: loaded from: classes3.dex */
public final class C2762b implements cma {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ cma f32724a;

    /* JADX INFO: renamed from: b */
    public final xa2 f32725b;

    /* JADX INFO: renamed from: c */
    public List f32726c;

    public C2762b(xa2 xa2Var, cma cmaVar) {
        cmaVar.getClass();
        this.f32724a = cmaVar;
        this.f32725b = xa2Var;
        this.f32726c = EmptyList.f47638a;
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: A */
    public final c83 mo4571A() {
        return this.f32724a.mo4571A();
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: B0 */
    public final eh9 mo4572B0() {
        return this.f32724a.mo4572B0();
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: B1 */
    public final eh9 mo4573B1() {
        return this.f32724a.mo4573B1();
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: C1 */
    public final c83 mo4574C1() {
        return this.f32724a.mo4574C1();
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: D0 */
    public final Object mo4575D0(Continuation continuation) {
        return this.f32724a.mo4575D0(continuation);
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: F1 */
    public final Object mo4576F1(String str, Continuation continuation) {
        return this.f32724a.mo4576F1(str, continuation);
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: H */
    public final eh9 mo4577H() {
        return this.f32724a.mo4577H();
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: J */
    public final Object mo4578J(Continuation continuation) {
        return this.f32724a.mo4578J(continuation);
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: K */
    public final Object mo4579K(Continuation continuation) {
        return this.f32724a.mo4579K(continuation);
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: K1 */
    public final String mo4580K1() {
        return this.f32724a.mo4580K1();
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: L0 */
    public final boolean mo4581L0() {
        return this.f32724a.mo4581L0();
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: N */
    public final c83 mo4582N() {
        return this.f32724a.mo4582N();
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: O1 */
    public final c83 mo4583O1() {
        return this.f32724a.mo4583O1();
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: Q0 */
    public final int mo4584Q0() {
        return this.f32724a.mo4584Q0();
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: R */
    public final eh9 mo4585R() {
        return this.f32724a.mo4585R();
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: T0 */
    public final boolean mo4586T0() {
        return this.f32724a.mo4586T0();
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: X */
    public final void mo4587X() {
        this.f32724a.mo4587X();
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: a */
    public final Object m9634a(ib8 ib8Var, ContinuationImpl continuationImpl) throws Throwable {
        ReviewMatchingContentStateHolder$renderMatchingActivity$1 reviewMatchingContentStateHolder$renderMatchingActivity$1;
        C2762b c2762b;
        if (continuationImpl instanceof ReviewMatchingContentStateHolder$renderMatchingActivity$1) {
            reviewMatchingContentStateHolder$renderMatchingActivity$1 = (ReviewMatchingContentStateHolder$renderMatchingActivity$1) continuationImpl;
            int i = reviewMatchingContentStateHolder$renderMatchingActivity$1.f32618d;
            if ((i & Integer.MIN_VALUE) != 0) {
                reviewMatchingContentStateHolder$renderMatchingActivity$1.f32618d = i - Integer.MIN_VALUE;
            } else {
                reviewMatchingContentStateHolder$renderMatchingActivity$1 = new ReviewMatchingContentStateHolder$renderMatchingActivity$1(this, continuationImpl);
            }
        } else {
            reviewMatchingContentStateHolder$renderMatchingActivity$1 = new ReviewMatchingContentStateHolder$renderMatchingActivity$1(this, continuationImpl);
        }
        Object objM15541t = reviewMatchingContentStateHolder$renderMatchingActivity$1.f32616b;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = reviewMatchingContentStateHolder$renderMatchingActivity$1.f32618d;
        if (i2 == 0) {
            AbstractC3193b.m15359b(objM15541t);
            String strMo4589b2 = this.f32724a.mo4589b2();
            List list = ib8Var.f43905a;
            strMo4589b2.getClass();
            c83 c83VarM7123m = ((C1287c) this.f32725b.f67988a).m7123m(strMo4589b2, list);
            reviewMatchingContentStateHolder$renderMatchingActivity$1.f32615a = this;
            reviewMatchingContentStateHolder$renderMatchingActivity$1.f32618d = 1;
            objM15541t = AbstractC3224d.m15541t(c83VarM7123m, reviewMatchingContentStateHolder$renderMatchingActivity$1);
            if (objM15541t == coroutineSingletons) {
                return coroutineSingletons;
            }
            c2762b = this;
        } else {
            if (i2 != 1) {
                C3386nv.m17633t("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            c2762b = reviewMatchingContentStateHolder$renderMatchingActivity$1.f32615a;
            AbstractC3193b.m15359b(objM15541t);
        }
        c2762b.f32726c = (List) objM15541t;
        ArrayList<LessonCard> arrayListM22624p1 = u91.m22624p1(this.f32726c);
        while (arrayListM22624p1.size() < 3 && !arrayListM22624p1.isEmpty()) {
            arrayListM22624p1.add(u91.m22589G0(arrayListM22624p1));
        }
        ArrayList arrayList = new ArrayList(v91.m23189q0(arrayListM22624p1, 10));
        for (LessonCard lessonCard : arrayListM22624p1) {
            String str = lessonCard.f19181d;
            String str2 = lessonCard.f19178a;
            List list2 = lessonCard.f19180c;
            if (list2.isEmpty()) {
                list2 = lessonCard.f19179b;
            }
            arrayList.add(new md8(AbstractC3352my.m17122h(str, str2, list2), t7d.m21897b(lessonCard.f19183f)));
        }
        return new ld8(new wc8(new nd8(arrayList)), new cd8(new bd8(R$string.activities_skip_activity, fa8.f38724a, 12), (bd8) null, (ie8) null, 14));
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: a0 */
    public final boolean mo4588a0() {
        return this.f32724a.mo4588a0();
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: b2 */
    public final String mo4589b2() {
        return this.f32724a.mo4589b2();
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: d0 */
    public final boolean mo4590d0() {
        return this.f32724a.mo4590d0();
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: h0 */
    public final Object mo4591h0(ProfileAccount profileAccount, Continuation continuation) {
        return this.f32724a.mo4591h0(profileAccount, continuation);
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: m0 */
    public final boolean mo4592m0() {
        return this.f32724a.mo4592m0();
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: p0 */
    public final boolean mo4593p0() {
        return this.f32724a.mo4593p0();
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: r1 */
    public final eh9 mo4594r1() {
        return this.f32724a.mo4594r1();
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: s1 */
    public final boolean mo4595s1() {
        return this.f32724a.mo4595s1();
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: t */
    public final c83 mo4596t() {
        return this.f32724a.mo4596t();
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: w0 */
    public final Object mo4597w0(Continuation continuation) {
        return this.f32724a.mo4597w0(continuation);
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: w2 */
    public final boolean mo4598w2() {
        return this.f32724a.mo4598w2();
    }
}
