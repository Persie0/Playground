package com.lingq.feature.reader.old;

import com.lingq.core.domain.model.lesson.TokenType;
import java.util.ArrayList;
import kotlin.AbstractC3193b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.AbstractC3208a;
import p000.C3386nv;
import p000.c32;
import p000.fy7;
import p000.un1;
import p000.xfa;
import p000.xz7;
import p000.zi3;

/* JADX INFO: loaded from: classes3.dex */
@c32(m4290c = "com.lingq.feature.reader.old.ReaderPageViewModel$setSelectionAndShowPhrase$5", m4291f = "ReaderPageViewModel.kt", m4292l = {1132}, m4293m = "invokeSuspend", m4294v = 2)
final class ReaderPageViewModel$setSelectionAndShowPhrase$5 extends SuspendLambda implements zi3 {

    /* JADX INFO: renamed from: a */
    public int f28707a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ boolean f28708b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ C2411m f28709c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ xz7 f28710d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ ArrayList f28711e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ReaderPageViewModel$setSelectionAndShowPhrase$5(boolean z, C2411m c2411m, xz7 xz7Var, ArrayList arrayList, Continuation continuation) {
        super(2, continuation);
        this.f28708b = z;
        this.f28709c = c2411m;
        this.f28710d = xz7Var;
        this.f28711e = arrayList;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new ReaderPageViewModel$setSelectionAndShowPhrase$5(this.f28708b, this.f28709c, this.f28710d, this.f28711e, continuation);
    }

    @Override // p000.zi3
    public final Object invoke(Object obj, Object obj2) {
        return ((ReaderPageViewModel$setSelectionAndShowPhrase$5) create((un1) obj, (Continuation) obj2)).invokeSuspend(xfa.f68157a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.f28707a;
        if (i == 0) {
            AbstractC3193b.m15359b(obj);
            if (this.f28708b) {
                this.f28707a = 1;
                if (AbstractC3208a.m15437d(500L, this) == coroutineSingletons) {
                    return coroutineSingletons;
                }
            }
        } else {
            if (i != 1) {
                C3386nv.m17633t("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            AbstractC3193b.m15359b(obj);
        }
        this.f28709c.f29221Z.mo4677k(new fy7(this.f28710d, TokenType.NewWordOrPhraseType, this.f28711e, null, false));
        return xfa.f68157a;
    }
}
