package com.lingq.feature.vocabulary.state;

import com.lingq.core.data.repository.C1296l;
import com.lingq.core.domain.model.library.Sort;
import kotlin.AbstractC3193b;
import kotlin.collections.EmptyList;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.AbstractC3224d;
import p000.C3386nv;
import p000.c32;
import p000.c83;
import p000.un1;
import p000.xfa;
import p000.y95;
import p000.zi3;

/* JADX INFO: loaded from: classes3.dex */
@c32(m4290c = "com.lingq.feature.vocabulary.state.VocabularyFilterSheetStateHolder$loadCourseLessons$2", m4291f = "VocabularyFilterSheetStateHolder.kt", m4292l = {278, 279}, m4293m = "invokeSuspend", m4294v = 2)
final class VocabularyFilterSheetStateHolder$loadCourseLessons$2 extends SuspendLambda implements zi3 {

    /* JADX INFO: renamed from: a */
    public int f33719a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C2860b f33720b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ int f33721c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public VocabularyFilterSheetStateHolder$loadCourseLessons$2(C2860b c2860b, int i, Continuation continuation) {
        super(2, continuation);
        this.f33720b = c2860b;
        this.f33721c = i;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new VocabularyFilterSheetStateHolder$loadCourseLessons$2(this.f33720b, this.f33721c, continuation);
    }

    @Override // p000.zi3
    public final Object invoke(Object obj, Object obj2) {
        return ((VocabularyFilterSheetStateHolder$loadCourseLessons$2) create((un1) obj, (Continuation) obj2)).invokeSuspend(xfa.f68157a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x004d, code lost:
    
        if (((com.lingq.core.data.repository.C1296l) r11).m7309d(r5, r6, r7, r8, r10) == r0) goto L18;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) throws Throwable {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.f33719a;
        C2860b c2860b = this.f33720b;
        try {
            if (i != 0) {
                if (i == 1) {
                    AbstractC3193b.m15359b(obj);
                } else {
                    if (i != 2) {
                        C3386nv.m17633t("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    AbstractC3193b.m15359b(obj);
                }
                return xfa.f68157a;
            }
            AbstractC3193b.m15359b(obj);
            c83 c83VarM7315j = ((C1296l) c2860b.f33776e).m7315j(this.f33721c);
            this.f33719a = 1;
            obj = AbstractC3224d.m15542u(c83VarM7315j, this);
            if (obj == coroutineSingletons) {
            }
            return coroutineSingletons;
            y95 y95Var = c2860b.f33776e;
            String strMo4589b2 = c2860b.f33777f.mo4589b2();
            int i2 = this.f33721c;
            Sort sort = Sort.Position;
            EmptyList emptyList = EmptyList.f47638a;
            this.f33719a = 2;
        } catch (Exception unused) {
        }
    }
}
