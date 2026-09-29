package com.lingq.feature.reader.shared.p018ui.components;

import androidx.compose.runtime.snapshots.SnapshotStateList;
import kotlin.AbstractC3193b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.C3229i;
import p000.C3386nv;
import p000.c32;
import p000.un1;
import p000.v56;
import p000.vn0;
import p000.xfa;
import p000.zi3;

/* JADX INFO: loaded from: classes2.dex */
@c32(m4290c = "com.lingq.feature.reader.shared.ui.components.LessonProgressBarKt$LessonProgressBar$7$1", m4291f = "LessonProgressBar.kt", m4292l = {133}, m4293m = "invokeSuspend", m4294v = 2)
final class LessonProgressBarKt$LessonProgressBar$7$1 extends SuspendLambda implements zi3 {

    /* JADX INFO: renamed from: a */
    public int f30390a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ v56 f30391b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ SnapshotStateList f30392c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LessonProgressBarKt$LessonProgressBar$7$1(v56 v56Var, SnapshotStateList snapshotStateList, Continuation continuation) {
        super(2, continuation);
        this.f30391b = v56Var;
        this.f30392c = snapshotStateList;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new LessonProgressBarKt$LessonProgressBar$7$1(this.f30391b, this.f30392c, continuation);
    }

    @Override // p000.zi3
    public final Object invoke(Object obj, Object obj2) {
        return ((LessonProgressBarKt$LessonProgressBar$7$1) create((un1) obj, (Continuation) obj2)).invokeSuspend(xfa.f68157a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.f30390a;
        if (i == 0) {
            AbstractC3193b.m15359b(obj);
            C3229i c3229i = this.f30391b.f64886a;
            vn0 vn0Var = new vn0(this.f30392c, 2);
            this.f30390a = 1;
            c3229i.getClass();
            if (C3229i.m15548j(c3229i, vn0Var, this) == coroutineSingletons) {
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
