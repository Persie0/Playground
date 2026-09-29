package com.lingq.feature.library.preview;

import com.lingq.core.p012ui.UpgradeReason;
import com.lingq.feature.library.R$string;
import kotlin.AbstractC3193b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p000.C3386nv;
import p000.bh4;
import p000.c32;
import p000.cma;
import p000.f9a;
import p000.fr5;
import p000.gm5;
import p000.o55;
import p000.o5a;
import p000.q55;
import p000.un1;
import p000.xfa;
import p000.zi3;

/* JADX INFO: loaded from: classes3.dex */
@c32(m4290c = "com.lingq.feature.library.preview.LessonPreviewFragment$onViewCreated$2$1", m4291f = "LessonPreviewFragment.kt", m4292l = {84}, m4293m = "invokeSuspend", m4294v = 2)
final class LessonPreviewFragment$onViewCreated$2$1 extends SuspendLambda implements zi3 {

    /* JADX INFO: renamed from: a */
    public LessonPreviewFragment f26714a;

    /* JADX INFO: renamed from: b */
    public int f26715b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ LessonPreviewFragment f26716c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LessonPreviewFragment$onViewCreated$2$1(LessonPreviewFragment lessonPreviewFragment, Continuation continuation) {
        super(2, continuation);
        this.f26716c = lessonPreviewFragment;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new LessonPreviewFragment$onViewCreated$2$1(this.f26716c, continuation);
    }

    @Override // p000.zi3
    public final Object invoke(Object obj, Object obj2) {
        return ((LessonPreviewFragment$onViewCreated$2$1) create((un1) obj, (Continuation) obj2)).invokeSuspend(xfa.f68157a);
    }

    /* JADX WARN: Code duplicated, block: B:22:0x006b  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        LessonPreviewFragment lessonPreviewFragment;
        UpgradeReason upgradeReason;
        String string;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.f26715b;
        int i2 = 1;
        if (i == 0) {
            AbstractC3193b.m15359b(obj);
            bh4[] bh4VarArr = LessonPreviewFragment.f26702G0;
            LessonPreviewFragment lessonPreviewFragment2 = this.f26716c;
            C2155b c2155bM9083i0 = lessonPreviewFragment2.m9083i0();
            int i3 = lessonPreviewFragment2.m9081g0().f60380h;
            this.f26714a = lessonPreviewFragment2;
            this.f26715b = 1;
            Object objM9087V2 = c2155bM9083i0.m9087V2(i3, this);
            if (objM9087V2 == coroutineSingletons) {
                return coroutineSingletons;
            }
            obj = objM9087V2;
            lessonPreviewFragment = lessonPreviewFragment2;
        } else {
            if (i != 1) {
                C3386nv.m17633t("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            lessonPreviewFragment = this.f26714a;
            AbstractC3193b.m15359b(obj);
        }
        f9a f9aVar = (f9a) obj;
        bh4[] bh4VarArr2 = LessonPreviewFragment.f26702G0;
        lessonPreviewFragment.getClass();
        boolean z = f9aVar.f38694e;
        int i4 = f9aVar.f38693d;
        int i5 = f9aVar.f38692c;
        int i6 = f9aVar.f38691b;
        if (z) {
            cma cmaVar = lessonPreviewFragment.m9083i0().f26765b;
            boolean zMo4598w2 = cmaVar.mo4598w2();
            boolean zMo4588a0 = cmaVar.mo4588a0();
            boolean zMo4592m0 = cmaVar.mo4592m0();
            boolean zMo4590d0 = cmaVar.mo4590d0();
            if (zMo4588a0 || zMo4592m0 || zMo4590d0) {
                upgradeReason = null;
            } else {
                upgradeReason = zMo4598w2 ? UpgradeReason.TRANSCRIBE_PLUS : UpgradeReason.TRANSCRIBE;
            }
        } else {
            upgradeReason = null;
        }
        int i7 = q55.f57293b[f9aVar.f38690a.ordinal()];
        int i8 = 2;
        if (i7 == 1) {
            string = lessonPreviewFragment.m2110l().getString(R$string.import_transcription_confirm_message, Integer.valueOf(i6), Integer.valueOf(i5));
        } else if (i7 == 2) {
            string = lessonPreviewFragment.m2111m(com.lingq.core.premium.R$string.upgrade_reason_transcribe_audio_desc);
        } else if (i7 == 3) {
            string = lessonPreviewFragment.m2110l().getString(R$string.import_transcription_exceeded_message, Integer.valueOf(i4));
        } else {
            if (i7 != 4) {
                gm5.m12750e();
                return null;
            }
            string = lessonPreviewFragment.m2110l().getString(R$string.import_transcription_insufficient_message, Integer.valueOf(i6), Integer.valueOf(i5), Integer.valueOf(i4));
        }
        string.getClass();
        fr5 fr5Var = new fr5(lessonPreviewFragment.m2090R(), 0);
        fr5Var.m12028k(R$string.import_transcription_confirm_title);
        fr5Var.f71376a.f65209g = string;
        fr5Var.m12019b();
        fr5 fr5VarM12022e = fr5Var.m12022e(R$string.ui_return, new o55(lessonPreviewFragment, 0));
        fr5VarM12022e.getClass();
        if (!f9aVar.f38694e) {
            fr5VarM12022e.m12025h(com.lingq.core.p012ui.R$string.ui_continue, new o55(lessonPreviewFragment, i2));
        } else if (upgradeReason != null) {
            fr5VarM12022e.m12025h(com.lingq.core.p012ui.R$string.upgrade_go_premium_now, new o5a(lessonPreviewFragment, upgradeReason, i8));
        }
        fr5VarM12022e.m25557a();
        return xfa.f68157a;
    }
}
