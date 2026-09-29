package com.lingq.feature.reader.old;

import com.lingq.core.domain.model.lesson.Lesson;
import kotlin.AbstractC3193b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p000.c32;
import p000.cj3;
import p000.fa4;
import p000.vd7;
import p000.xfa;

/* JADX INFO: loaded from: classes3.dex */
@c32(m4290c = "com.lingq.feature.reader.old.ReaderViewModel$hideAudio$1", m4291f = "ReaderViewModel.kt", m4292l = {}, m4293m = "invokeSuspend", m4294v = 2)
final class ReaderViewModel$hideAudio$1 extends SuspendLambda implements cj3 {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ boolean f28969a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ Lesson f28970b;

    /* JADX INFO: renamed from: c */
    public /* synthetic */ Boolean f28971c;

    /* JADX INFO: renamed from: d */
    public /* synthetic */ vd7 f28972d;

    @Override // p000.cj3
    /* JADX INFO: renamed from: i */
    public final Object mo1291i(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        boolean zBooleanValue = ((Boolean) obj).booleanValue();
        ReaderViewModel$hideAudio$1 readerViewModel$hideAudio$1 = new ReaderViewModel$hideAudio$1(5, (Continuation) obj5);
        readerViewModel$hideAudio$1.f28969a = zBooleanValue;
        readerViewModel$hideAudio$1.f28970b = (Lesson) obj2;
        readerViewModel$hideAudio$1.f28971c = (Boolean) obj3;
        readerViewModel$hideAudio$1.f28972d = (vd7) obj4;
        return readerViewModel$hideAudio$1.invokeSuspend(xfa.f68157a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        String str;
        boolean z = this.f28969a;
        Lesson lesson = this.f28970b;
        Boolean bool = this.f28971c;
        vd7 vd7Var = this.f28972d;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        AbstractC3193b.m15359b(obj);
        return Boolean.valueOf(z || ((str = lesson.f19147f) == null && lesson.f19162u != null) || ((str == null && fa4.m11650l(bool, Boolean.FALSE)) || !(vd7Var == null || vd7Var.f65237b || vd7Var.f65238c <= 0)));
    }
}
