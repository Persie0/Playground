package com.lingq.feature.vocabulary.filter;

import com.lingq.core.data.repository.C1296l;
import com.lingq.core.domain.model.library.LibraryItem;
import com.lingq.core.domain.model.library.Sort;
import kotlin.AbstractC3193b;
import kotlin.collections.EmptyList;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.AbstractC3224d;
import kotlinx.coroutines.flow.C3244l;
import p000.C3386nv;
import p000.c32;
import p000.c83;
import p000.fa4;
import p000.un1;
import p000.xfa;
import p000.y95;
import p000.zi3;

/* JADX INFO: loaded from: classes3.dex */
@c32(m4290c = "com.lingq.feature.vocabulary.filter.VocabularyFilterSelectionViewModel$networkCourseLessons$1", m4291f = "VocabularyFilterSelectionViewModel.kt", m4292l = {496, 498}, m4293m = "invokeSuspend", m4294v = 2)
final class VocabularyFilterSelectionViewModel$networkCourseLessons$1 extends SuspendLambda implements zi3 {

    /* JADX INFO: renamed from: a */
    public int f33626a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C2850b f33627b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ int f33628c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public VocabularyFilterSelectionViewModel$networkCourseLessons$1(C2850b c2850b, int i, Continuation continuation) {
        super(2, continuation);
        this.f33627b = c2850b;
        this.f33628c = i;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new VocabularyFilterSelectionViewModel$networkCourseLessons$1(this.f33627b, this.f33628c, continuation);
    }

    @Override // p000.zi3
    public final Object invoke(Object obj, Object obj2) {
        return ((VocabularyFilterSelectionViewModel$networkCourseLessons$1) create((un1) obj, (Continuation) obj2)).invokeSuspend(xfa.f68157a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x0067, code lost:
    
        if (((com.lingq.core.data.repository.C1296l) r1).m7309d(r2, r4, r5, r6, r11) == r8) goto L28;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) throws Throwable {
        C2850b c2850b = this.f33627b;
        y95 y95Var = c2850b.f33682g;
        EmptyList emptyList = EmptyList.f47638a;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.f33626a;
        try {
            if (i == 0) {
                AbstractC3193b.m15359b(obj);
                c83 c83VarM7315j = ((C1296l) y95Var).m7315j(this.f33628c);
                this.f33626a = 1;
                obj = AbstractC3224d.m15542u(c83VarM7315j, this);
                if (obj == coroutineSingletons) {
                }
                return coroutineSingletons;
            }
            if (i == 1) {
                AbstractC3193b.m15359b(obj);
            } else {
                if (i != 2) {
                    C3386nv.m17633t("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                AbstractC3193b.m15359b(obj);
            }
            C3244l c3244l = c2850b.f33687l;
            Boolean bool = Boolean.FALSE;
            c3244l.getClass();
            c3244l.m15572j(null, bool);
            return xfa.f68157a;
            LibraryItem libraryItem = (LibraryItem) obj;
            String strMo4589b2 = c2850b.f33677b.mo4589b2();
            int i2 = this.f33628c;
            Sort sort = Sort.Position;
            if (!fa4.m11650l(libraryItem != null ? libraryItem.f19435g : null, "private")) {
                fa4.m11650l(libraryItem != null ? libraryItem.f19435g : null, "shared");
            }
            this.f33626a = 2;
        } catch (Exception unused) {
        }
    }
}
