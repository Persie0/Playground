package com.lingq.feature.library;

import androidx.compose.foundation.lazy.C0127b;
import kotlin.AbstractC3193b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p000.C3386nv;
import p000.c32;
import p000.un1;
import p000.xfa;
import p000.zi3;

/* JADX INFO: loaded from: classes.dex */
@c32(m4290c = "com.lingq.feature.library.LibraryUpdateScreenKt$LibraryScreen$18$2$2$1", m4291f = "LibraryUpdateScreen.kt", m4292l = {803}, m4293m = "invokeSuspend", m4294v = 2)
final class LibraryUpdateScreenKt$LibraryScreen$18$2$2$1 extends SuspendLambda implements zi3 {

    /* JADX INFO: renamed from: a */
    public int f26461a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ boolean f26462b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ C0127b f26463c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LibraryUpdateScreenKt$LibraryScreen$18$2$2$1(boolean z, C0127b c0127b, Continuation continuation) {
        super(2, continuation);
        this.f26462b = z;
        this.f26463c = c0127b;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new LibraryUpdateScreenKt$LibraryScreen$18$2$2$1(this.f26462b, this.f26463c, continuation);
    }

    @Override // p000.zi3
    public final Object invoke(Object obj, Object obj2) {
        return ((LibraryUpdateScreenKt$LibraryScreen$18$2$2$1) create((un1) obj, (Continuation) obj2)).invokeSuspend(xfa.f68157a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.f26461a;
        if (i == 0) {
            AbstractC3193b.m15359b(obj);
            if (this.f26462b) {
                C0127b c0127b = this.f26463c;
                if (c0127b.m978h() <= 3) {
                    this.f26461a = 1;
                    if (C0127b.m973l(c0127b, 0, this) == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                }
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
