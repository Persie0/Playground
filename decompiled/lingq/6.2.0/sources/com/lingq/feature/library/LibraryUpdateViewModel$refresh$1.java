package com.lingq.feature.library;

import com.lingq.core.common.util.AbstractC1263a;
import com.lingq.core.domain.model.language.Language;
import java.util.List;
import kotlin.AbstractC3193b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.AbstractC3224d;
import kotlinx.coroutines.flow.C3244l;
import p000.C3386nv;
import p000.c32;
import p000.cma;
import p000.eh9;
import p000.lda;
import p000.un1;
import p000.xfa;
import p000.zi3;

/* JADX INFO: loaded from: classes3.dex */
@c32(m4290c = "com.lingq.feature.library.LibraryUpdateViewModel$refresh$1", m4291f = "LibraryUpdateViewModel.kt", m4292l = {905, 918}, m4293m = "invokeSuspend", m4294v = 2)
final class LibraryUpdateViewModel$refresh$1 extends SuspendLambda implements zi3 {

    /* JADX INFO: renamed from: a */
    public int f26567a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C2146e f26568b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LibraryUpdateViewModel$refresh$1(C2146e c2146e, Continuation continuation) {
        super(2, continuation);
        this.f26568b = c2146e;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new LibraryUpdateViewModel$refresh$1(this.f26568b, continuation);
    }

    @Override // p000.zi3
    public final Object invoke(Object obj, Object obj2) {
        return ((LibraryUpdateViewModel$refresh$1) create((un1) obj, (Continuation) obj2)).invokeSuspend(xfa.f68157a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x0096, code lost:
    
        if (kotlinx.coroutines.AbstractC3208a.m15437d(1500, r10) == r3) goto L25;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object value;
        Object value2;
        Object value3;
        Object value4;
        C2146e c2146e = this.f26568b;
        cma cmaVar = c2146e.f26677b;
        C3244l c3244l = c2146e.f26668Q;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.f26567a;
        try {
            if (i == 0) {
                AbstractC3193b.m15359b(obj);
                eh9 eh9VarMo4572B0 = cmaVar.mo4572B0();
                this.f26567a = 1;
                obj = AbstractC3224d.m15542u(eh9VarMo4572B0, this);
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
            do {
                value4 = c3244l.getValue();
                ((Boolean) value4).getClass();
            } while (!c3244l.m15570h(value4, Boolean.FALSE));
            return xfa.f68157a;
            Language language = (Language) obj;
            if (language == null) {
                do {
                    value2 = c3244l.getValue();
                    ((Boolean) value2).getClass();
                } while (!c3244l.m15570h(value2, Boolean.FALSE));
                do {
                    value3 = c3244l.getValue();
                    ((Boolean) value3).getClass();
                } while (!c3244l.m15570h(value3, Boolean.FALSE));
            } else {
                c2146e.m9077i3(language);
                c2146e.m9067Y2(cmaVar.mo4589b2());
                String str = language.f19024a;
                AbstractC1263a.m7047b(lda.m16103C(c2146e), c2146e.f26655D, "library-fetch-collection-subs-" + str, new LibraryUpdateViewModel$refreshCollectionSubscriptions$1(c2146e, str, null));
                c2146e.m9065W2(language, (List) c2146e.f26671T.getValue());
                this.f26567a = 2;
            }
            return xfa.f68157a;
        } catch (Throwable th) {
            do {
                value = c3244l.getValue();
                ((Boolean) value).getClass();
            } while (!c3244l.m15570h(value, Boolean.FALSE));
            throw th;
        }
    }
}
