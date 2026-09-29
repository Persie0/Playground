package com.lingq.feature.lessoninfo;

import com.lingq.core.domain.lesson.C1380b;
import com.lingq.core.domain.lesson.C1381c;
import com.lingq.core.domain.model.audio.DownloadItem;
import com.lingq.core.domain.model.library.LessonInfo;
import kotlin.AbstractC3193b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p000.C3386nv;
import p000.c32;
import p000.un1;
import p000.vk9;
import p000.xfa;
import p000.zi3;

/* JADX INFO: loaded from: classes3.dex */
@c32(m4290c = "com.lingq.feature.lessoninfo.LessonInfoViewModel$downloadLesson$1", m4291f = "LessonInfoViewModel.kt", m4292l = {432, 434, 443, 452}, m4293m = "invokeSuspend", m4294v = 2)
final class LessonInfoViewModel$downloadLesson$1 extends SuspendLambda implements zi3 {

    /* JADX INFO: renamed from: a */
    public String f26349a;

    /* JADX INFO: renamed from: b */
    public int f26350b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ LessonInfo f26351c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ C2132c f26352d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LessonInfoViewModel$downloadLesson$1(LessonInfo lessonInfo, C2132c c2132c, Continuation continuation) {
        super(2, continuation);
        this.f26351c = lessonInfo;
        this.f26352d = c2132c;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new LessonInfoViewModel$downloadLesson$1(this.f26351c, this.f26352d, continuation);
    }

    @Override // p000.zi3
    public final Object invoke(Object obj, Object obj2) {
        return ((LessonInfoViewModel$downloadLesson$1) create((un1) obj, (Continuation) obj2)).invokeSuspend(xfa.f68157a);
    }

    /* JADX WARN: Code duplicated, block: B:20:0x0044  */
    /* JADX WARN: Code duplicated, block: B:39:0x00a2 A[PHI: r3
      0x00a2: PHI (r3v8 java.lang.String) = (r3v3 java.lang.String), (r3v7 java.lang.String), (r3v9 java.lang.String) binds: [B:35:0x0088, B:28:0x0067, B:33:0x0082] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:42:0x00af  */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x007e, code lost:
    
        if (r10.f26412c.mo8234r(r12, r14) == r6) goto L45;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0081, code lost:
    
        r2 = r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x009f, code lost:
    
        if (r10.f26412c.mo8234r(r8, r14) == r6) goto L45;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x00bd, code lost:
    
        if (r2.m7988b(r0, r7, r3, r14, r9) == r6) goto L45;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) throws Throwable {
        String str;
        Object objM7991b;
        LessonInfo lessonInfo = this.f26351c;
        String str2 = lessonInfo.f19360P;
        int i = lessonInfo.f19365a;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = this.f26350b;
        C2132c c2132c = this.f26352d;
        if (i2 != 0) {
            if (i2 == 1) {
                str = this.f26349a;
                AbstractC3193b.m15359b(obj);
                objM7991b = obj;
            } else if (i2 == 2 || i2 == 3) {
                String str3 = this.f26349a;
                AbstractC3193b.m15359b(obj);
                str = str3;
                C1380b c1380b = c2132c.f26418i;
                String strMo4589b2 = c2132c.f26411b.mo4589b2();
                int i3 = lessonInfo.f19365a;
                boolean z = str2 != null;
                this.f26349a = null;
                this.f26350b = 4;
            } else {
                if (i2 != 4) {
                    C3386nv.m17633t("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                AbstractC3193b.m15359b(obj);
            }
            return xfa.f68157a;
        }
        AbstractC3193b.m15359b(obj);
        str = lessonInfo.f19369e;
        if (str == null) {
            str = "";
        } else {
            if (str.length() <= 0) {
                str = null;
            }
            if (str == null) {
                str = "";
            }
        }
        if (vk9.m23391n0(str) && str2 == null) {
            C1381c c1381c = c2132c.f26419j;
            String strMo4589b3 = c2132c.f26411b.mo4589b2();
            this.f26349a = str;
            this.f26350b = 1;
            objM7991b = c1381c.m7991b(i, strMo4589b3, this);
            if (objM7991b != coroutineSingletons) {
            }
        } else if (vk9.m23391n0(str)) {
            C1380b c1380b2 = c2132c.f26418i;
            String strMo4589b4 = c2132c.f26411b.mo4589b2();
            int i4 = lessonInfo.f19365a;
            if (str2 != null) {
            }
            this.f26349a = null;
            this.f26350b = 4;
        } else {
            DownloadItem downloadItem = new DownloadItem(c2132c.f26411b.mo4589b2(), i, str);
            this.f26349a = str;
            this.f26350b = 3;
        }
        return coroutineSingletons;
        String str4 = (String) objM7991b;
        if (str4.length() > 0) {
            DownloadItem downloadItem2 = new DownloadItem(c2132c.f26411b.mo4589b2(), i, str4);
            this.f26349a = str;
            this.f26350b = 2;
        } else {
            C1380b c1380b3 = c2132c.f26418i;
            String strMo4589b5 = c2132c.f26411b.mo4589b2();
            int i5 = lessonInfo.f19365a;
            if (str2 != null) {
            }
            this.f26349a = null;
            this.f26350b = 4;
        }
        return coroutineSingletons;
    }
}
