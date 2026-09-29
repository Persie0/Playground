package com.lingq.feature.library;

import com.lingq.core.domain.model.language.LanguageProgress;
import com.lingq.core.domain.model.language.LanguageStudyStats;
import java.util.Arrays;
import kotlin.AbstractC3193b;
import kotlin.Pair;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.C3244l;
import p000.c32;
import p000.f95;
import p000.xfa;
import p000.zi3;

/* JADX INFO: loaded from: classes.dex */
@c32(m4290c = "com.lingq.feature.library.LibraryUpdateViewModel$loadStats$1", m4291f = "LibraryUpdateViewModel.kt", m4292l = {}, m4293m = "invokeSuspend", m4294v = 2)
final class LibraryUpdateViewModel$loadStats$1 extends SuspendLambda implements zi3 {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f26503a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C2146e f26504b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LibraryUpdateViewModel$loadStats$1(C2146e c2146e, Continuation continuation) {
        super(2, continuation);
        this.f26504b = c2146e;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        LibraryUpdateViewModel$loadStats$1 libraryUpdateViewModel$loadStats$1 = new LibraryUpdateViewModel$loadStats$1(this.f26504b, continuation);
        libraryUpdateViewModel$loadStats$1.f26503a = obj;
        return libraryUpdateViewModel$loadStats$1;
    }

    @Override // p000.zi3
    public final Object invoke(Object obj, Object obj2) throws Throwable {
        LibraryUpdateViewModel$loadStats$1 libraryUpdateViewModel$loadStats$1 = (LibraryUpdateViewModel$loadStats$1) create((Pair) obj, (Continuation) obj2);
        xfa xfaVar = xfa.f68157a;
        libraryUpdateViewModel$loadStats$1.invokeSuspend(xfaVar);
        return xfaVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        C3244l c3244l = this.f26504b.f26662K;
        Pair pair = (Pair) this.f26503a;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        AbstractC3193b.m15359b(obj);
        LanguageStudyStats languageStudyStats = (LanguageStudyStats) pair.f47623a;
        LanguageProgress languageProgress = (LanguageProgress) pair.f47624b;
        if (languageStudyStats == null || languageProgress == null) {
            f95 f95Var = new f95(0, 0, 0, 0, null, 0, true, 191);
            c3244l.getClass();
            c3244l.m15572j(null, f95Var);
        } else {
            int i = languageStudyStats.f19108c;
            int i2 = languageProgress.f19067u;
            int i3 = languageStudyStats.f19107b;
            int i4 = (int) languageProgress.f19052f;
            double d = languageProgress.f19063q;
            int i5 = (int) d;
            f95 f95Var2 = new f95(i, i2, i3, i4, d - ((double) i5) == 0.0d ? String.valueOf(i5) : String.format("%.1f", Arrays.copyOf(new Object[]{Double.valueOf(d)}, 1)), languageStudyStats.f19112g, false, 128);
            c3244l.getClass();
            c3244l.m15572j(null, f95Var2);
        }
        return xfa.f68157a;
    }
}
