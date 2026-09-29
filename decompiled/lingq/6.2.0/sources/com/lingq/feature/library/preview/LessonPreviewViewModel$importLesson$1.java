package com.lingq.feature.library.preview;

import com.lingq.core.data.repository.C1295k;
import com.lingq.core.domain.model.lesson.Lesson;
import com.lingq.core.domain.model.user.ProfileAccount;
import com.lingq.core.p012ui.UpgradeReason;
import kotlin.AbstractC3193b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.text.Regex;
import kotlin.text.RegexOption;
import kotlinx.coroutines.flow.AbstractC3224d;
import kotlinx.coroutines.flow.C3244l;
import p000.AbstractC3352my;
import p000.C3386nv;
import p000.aj3;
import p000.c32;
import p000.c83;
import p000.cma;
import p000.d65;
import p000.e83;
import p000.kk8;
import p000.l83;
import p000.m83;
import p000.un1;
import p000.xfa;
import p000.zi3;

/* JADX INFO: loaded from: classes3.dex */
@c32(m4290c = "com.lingq.feature.library.preview.LessonPreviewViewModel$importLesson$1", m4291f = "LessonPreviewViewModel.kt", m4292l = {92, 118}, m4293m = "invokeSuspend", m4294v = 2)
final class LessonPreviewViewModel$importLesson$1 extends SuspendLambda implements zi3 {

    /* JADX INFO: renamed from: a */
    public int f26735a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C2155b f26736b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ String f26737c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ String f26738d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ int f26739e;

    /* JADX INFO: renamed from: com.lingq.feature.library.preview.LessonPreviewViewModel$importLesson$1$1 */
    @c32(m4290c = "com.lingq.feature.library.preview.LessonPreviewViewModel$importLesson$1$1", m4291f = "LessonPreviewViewModel.kt", m4292l = {97, 104, 95}, m4293m = "invokeSuspend", m4294v = 2)
    final class C21511 extends SuspendLambda implements zi3 {

        /* JADX INFO: renamed from: a */
        public e83 f26740a;

        /* JADX INFO: renamed from: b */
        public int f26741b;

        /* JADX INFO: renamed from: c */
        public /* synthetic */ Object f26742c;

        /* JADX INFO: renamed from: d */
        public final /* synthetic */ String f26743d;

        /* JADX INFO: renamed from: e */
        public final /* synthetic */ C2155b f26744e;

        /* JADX INFO: renamed from: f */
        public final /* synthetic */ String f26745f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C21511(String str, C2155b c2155b, String str2, Continuation continuation) {
            super(2, continuation);
            this.f26743d = str;
            this.f26744e = c2155b;
            this.f26745f = str2;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            C21511 c21511 = new C21511(this.f26743d, this.f26744e, this.f26745f, continuation);
            c21511.f26742c = obj;
            return c21511;
        }

        @Override // p000.zi3
        public final Object invoke(Object obj, Object obj2) {
            return ((C21511) create((e83) obj, (Continuation) obj2)).invokeSuspend(xfa.f68157a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:15:0x0064, code lost:
        
            if (r0 == r10) goto L24;
         */
        /* JADX WARN: Code restructure failed: missing block: B:19:0x007c, code lost:
        
            if (r0 == r10) goto L24;
         */
        /* JADX WARN: Code restructure failed: missing block: B:23:0x008b, code lost:
        
            if (r9.emit(r0, r13) == r10) goto L24;
         */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) throws Throwable {
            Object objM7247E;
            Object objM7250H;
            Lesson lesson;
            e83 e83Var = (e83) this.f26742c;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i = this.f26741b;
            if (i != 0) {
                if (i == 1) {
                    e83Var = this.f26740a;
                    AbstractC3193b.m15359b(obj);
                    objM7250H = obj;
                    lesson = (Lesson) objM7250H;
                } else if (i == 2) {
                    e83Var = this.f26740a;
                    AbstractC3193b.m15359b(obj);
                    objM7247E = obj;
                    lesson = (Lesson) objM7247E;
                } else {
                    if (i != 3) {
                        C3386nv.m17633t("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    AbstractC3193b.m15359b(obj);
                }
                return xfa.f68157a;
            }
            AbstractC3193b.m15359b(obj);
            Regex regex = new Regex("^https?://(?:www\\.)?(?:[a-z]+\\.)*(?:youtube\\.com|youtu\\.be)/", RegexOption.IGNORE_CASE);
            String str = this.f26743d;
            boolean zM15423a = regex.m15423a(str);
            C2155b c2155b = this.f26744e;
            cma cmaVar = c2155b.f26765b;
            d65 d65Var = c2155b.f26768e;
            String str2 = this.f26745f;
            if (zM15423a) {
                String strMo4589b2 = cmaVar.mo4589b2();
                String strM17131l0 = AbstractC3352my.m17131l0(str);
                this.f26742c = null;
                this.f26740a = e83Var;
                this.f26741b = 1;
                objM7250H = ((C1295k) d65Var).m7250H(strMo4589b2, str2, str, strM17131l0, null, null, null, this);
            } else {
                String strMo4589b3 = cmaVar.mo4589b2();
                this.f26742c = null;
                this.f26740a = e83Var;
                this.f26741b = 2;
                objM7247E = ((C1295k) d65Var).m7247E(strMo4589b3, str, str2, this);
            }
            return coroutineSingletons;
            this.f26742c = null;
            this.f26740a = null;
            this.f26741b = 3;
        }
    }

    /* JADX INFO: renamed from: com.lingq.feature.library.preview.LessonPreviewViewModel$importLesson$1$2 */
    @c32(m4290c = "com.lingq.feature.library.preview.LessonPreviewViewModel$importLesson$1$2", m4291f = "LessonPreviewViewModel.kt", m4292l = {}, m4293m = "invokeSuspend", m4294v = 2)
    final class C21522 extends SuspendLambda implements zi3 {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ C2155b f26746a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C21522(C2155b c2155b, Continuation continuation) {
            super(2, continuation);
            this.f26746a = c2155b;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return new C21522(this.f26746a, continuation);
        }

        @Override // p000.zi3
        public final Object invoke(Object obj, Object obj2) throws Throwable {
            C21522 c21522 = (C21522) create((e83) obj, (Continuation) obj2);
            xfa xfaVar = xfa.f68157a;
            c21522.invokeSuspend(xfaVar);
            return xfaVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            AbstractC3193b.m15359b(obj);
            C3244l c3244l = this.f26746a.f26773j;
            Boolean bool = Boolean.TRUE;
            c3244l.getClass();
            c3244l.m15572j(null, bool);
            return xfa.f68157a;
        }
    }

    /* JADX INFO: renamed from: com.lingq.feature.library.preview.LessonPreviewViewModel$importLesson$1$3 */
    @c32(m4290c = "com.lingq.feature.library.preview.LessonPreviewViewModel$importLesson$1$3", m4291f = "LessonPreviewViewModel.kt", m4292l = {}, m4293m = "invokeSuspend", m4294v = 2)
    final class C21533 extends SuspendLambda implements aj3 {

        /* JADX INFO: renamed from: a */
        public /* synthetic */ Throwable f26747a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ C2155b f26748b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C21533(C2155b c2155b, Continuation continuation) {
            super(3, continuation);
            this.f26748b = c2155b;
        }

        @Override // p000.aj3
        public final Object invoke(Object obj, Object obj2, Object obj3) throws Throwable {
            C21533 c21533 = new C21533(this.f26748b, (Continuation) obj3);
            c21533.f26747a = (Throwable) obj2;
            xfa xfaVar = xfa.f68157a;
            c21533.invokeSuspend(xfaVar);
            return xfaVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            Throwable th = this.f26747a;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            AbstractC3193b.m15359b(obj);
            C3244l c3244l = this.f26748b.f26773j;
            Boolean bool = Boolean.FALSE;
            c3244l.getClass();
            c3244l.m15572j(null, bool);
            th.printStackTrace();
            return xfa.f68157a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LessonPreviewViewModel$importLesson$1(C2155b c2155b, String str, String str2, int i, Continuation continuation) {
        super(2, continuation);
        this.f26736b = c2155b;
        this.f26737c = str;
        this.f26738d = str2;
        this.f26739e = i;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new LessonPreviewViewModel$importLesson$1(this.f26736b, this.f26737c, this.f26738d, this.f26739e, continuation);
    }

    @Override // p000.zi3
    public final Object invoke(Object obj, Object obj2) {
        return ((LessonPreviewViewModel$importLesson$1) create((un1) obj, (Continuation) obj2)).invokeSuspend(xfa.f68157a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0072, code lost:
    
        if (r1.collect(r9, r8) == r2) goto L21;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) throws Throwable {
        C2155b c2155b = this.f26736b;
        cma cmaVar = c2155b.f26765b;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.f26735a;
        if (i == 0) {
            AbstractC3193b.m15359b(obj);
            c83 c83VarMo4583O1 = cmaVar.mo4583O1();
            this.f26735a = 1;
            obj = AbstractC3224d.m15541t(c83VarMo4583O1, this);
            if (obj != coroutineSingletons) {
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
        return xfa.f68157a;
        ProfileAccount profileAccount = (ProfileAccount) obj;
        if (cmaVar.mo4598w2() || profileAccount.f19687k < 5) {
            String str = this.f26738d;
            String str2 = this.f26737c;
            l83 l83Var = new l83(new m83(new kk8(new C21511(str2, c2155b, str, null)), new C21522(c2155b, null)), new C21533(c2155b, null), 1);
            C2154a c2154a = new C2154a(c2155b, str2, this.f26739e);
            this.f26735a = 2;
        } else {
            c2155b.mo3737M1(UpgradeReason.LIMIT_IMPORTS);
        }
        return xfa.f68157a;
    }
}
