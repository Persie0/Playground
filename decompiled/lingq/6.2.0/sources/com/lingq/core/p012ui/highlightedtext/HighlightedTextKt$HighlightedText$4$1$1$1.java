package com.lingq.core.p012ui.highlightedtext;

import androidx.compose.animation.core.C0059a;
import kotlin.AbstractC3193b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p000.C3386nv;
import p000.aa1;
import p000.c32;
import p000.fda;
import p000.un1;
import p000.xfa;
import p000.zi3;

/* JADX INFO: loaded from: classes2.dex */
@c32(m4290c = "com.lingq.core.ui.highlightedtext.HighlightedTextKt$HighlightedText$4$1$1$1", m4291f = "HighlightedText.kt", m4292l = {357, 358, 362, 363, 366}, m4293m = "invokeSuspend", m4294v = 2)
final class HighlightedTextKt$HighlightedText$4$1$1$1 extends SuspendLambda implements zi3 {

    /* JADX INFO: renamed from: a */
    public long f24003a;

    /* JADX INFO: renamed from: b */
    public int f24004b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ C0059a f24005c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ long f24006d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ fda f24007e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HighlightedTextKt$HighlightedText$4$1$1$1(C0059a c0059a, long j, fda fdaVar, Continuation continuation) {
        super(2, continuation);
        this.f24005c = c0059a;
        this.f24006d = j;
        this.f24007e = fdaVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new HighlightedTextKt$HighlightedText$4$1$1$1(this.f24005c, this.f24006d, this.f24007e, continuation);
    }

    @Override // p000.zi3
    public final Object invoke(Object obj, Object obj2) {
        return ((HighlightedTextKt$HighlightedText$4$1$1$1) create((un1) obj, (Continuation) obj2)).invokeSuspend(xfa.f68157a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x007e, code lost:
    
        if (r0.m747f(r3, r16) == r6) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x00b6, code lost:
    
        if (androidx.compose.animation.core.C0059a.m744c(r0, r1, r2, null, r16, 12) == r6) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x00ca, code lost:
    
        if (androidx.compose.animation.core.C0059a.m744c(r0, r3, r2, null, r16, 12) == r6) goto L36;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) throws Throwable {
        long j;
        C0059a c0059a;
        C0059a c0059a2;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.f24004b;
        fda fdaVar = this.f24007e;
        C0059a c0059a3 = this.f24005c;
        long j2 = this.f24006d;
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    if (i == 3) {
                        long j3 = this.f24003a;
                        AbstractC3193b.m15359b(obj);
                        j = j3;
                        c0059a = c0059a3;
                        aa1 aa1Var = new aa1(j2);
                        this.f24003a = j;
                        this.f24004b = 4;
                    } else if (i != 4 && i != 5) {
                        C3386nv.m17633t("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                }
                AbstractC3193b.m15359b(obj);
            } else {
                long j4 = this.f24003a;
                AbstractC3193b.m15359b(obj);
                j = j4;
                c0059a2 = c0059a3;
                aa1 aa1Var2 = new aa1(aa1.f411j);
                this.f24003a = j;
                this.f24004b = 2;
            }
            return xfa.f68157a;
        }
        AbstractC3193b.m15359b(obj);
        j = ((aa1) c0059a3.m745d()).f414a;
        if (!aa1.m199c(j2, aa1.f411j) || aa1.m200d(j) <= 0.0f) {
            c0059a = c0059a3;
            if (aa1.m200d(j2) <= 0.0f || aa1.m200d(j) != 0.0f) {
                aa1 aa1Var3 = new aa1(j2);
                this.f24003a = j;
                this.f24004b = 5;
            } else {
                aa1 aa1Var4 = new aa1(aa1.m198b(0.0f, j2));
                this.f24003a = j;
                this.f24004b = 3;
                if (c0059a.m747f(aa1Var4, this) != coroutineSingletons) {
                    aa1 aa1Var5 = new aa1(j2);
                    this.f24003a = j;
                    this.f24004b = 4;
                }
            }
        } else {
            aa1 aa1Var6 = new aa1(aa1.m198b(0.0f, j));
            this.f24003a = j;
            this.f24004b = 1;
            c0059a2 = c0059a3;
            if (C0059a.m744c(c0059a2, aa1Var6, fdaVar, null, this, 12) != coroutineSingletons) {
                aa1 aa1Var7 = new aa1(aa1.f411j);
                this.f24003a = j;
                this.f24004b = 2;
            }
        }
        return coroutineSingletons;
    }
}
