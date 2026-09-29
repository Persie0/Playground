package com.lingq.feature.search.search;

import com.lingq.core.data.repository.C1295k;
import com.lingq.core.domain.lesson.C1381c;
import com.lingq.core.domain.model.audio.DownloadItem;
import com.lingq.core.domain.model.library.LessonInfo;
import com.lingq.feature.search.domain.C2765a;
import kotlin.AbstractC3193b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p000.C3386nv;
import p000.InterfaceC3812yx;
import p000.c32;
import p000.qj2;
import p000.vi3;
import p000.vk9;
import p000.xfa;

/* JADX INFO: loaded from: classes3.dex */
@c32(m4290c = "com.lingq.feature.search.search.SearchCollectionsStateHolder$downloadLesson$1", m4291f = "SearchCollectionsStateHolder.kt", m4292l = {325, 329, 334, 343, 352}, m4293m = "invokeSuspend", m4294v = 2)
final class SearchCollectionsStateHolder$downloadLesson$1 extends SuspendLambda implements vi3 {

    /* JADX INFO: renamed from: a */
    public C2775b f32940a;

    /* JADX INFO: renamed from: b */
    public LessonInfo f32941b;

    /* JADX INFO: renamed from: c */
    public String f32942c;

    /* JADX INFO: renamed from: d */
    public int f32943d;

    /* JADX INFO: renamed from: e */
    public int f32944e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ C2775b f32945f;

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ int f32946g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SearchCollectionsStateHolder$downloadLesson$1(C2775b c2775b, int i, Continuation continuation) {
        super(1, continuation);
        this.f32945f = c2775b;
        this.f32946g = i;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Continuation continuation) {
        return new SearchCollectionsStateHolder$downloadLesson$1(this.f32945f, this.f32946g, continuation);
    }

    @Override // p000.vi3
    public final Object invoke(Object obj) {
        return ((SearchCollectionsStateHolder$downloadLesson$1) create((Continuation) obj)).invokeSuspend(xfa.f68157a);
    }

    /* JADX WARN: Code duplicated, block: B:28:0x007e  */
    /* JADX WARN: Code duplicated, block: B:39:0x00ae  */
    /* JADX WARN: Code duplicated, block: B:53:0x0110  */
    /* JADX WARN: Code duplicated, block: B:55:0x0113 A[RETURN] */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x00c9, code lost:
    
        if (r7.mo8234r(r8, r13) == r0) goto L55;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) throws Throwable {
        LessonInfo lessonInfo;
        int i;
        int i2;
        LessonInfo lessonInfo2;
        int i3;
        String str;
        Object objM7286l;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i4 = this.f32944e;
        xfa xfaVar = xfa.f68157a;
        C2775b c2775b = this.f32945f;
        if (i4 == 0) {
            AbstractC3193b.m15359b(obj);
            C2765a c2765a = c2775b.f33067c;
            this.f32944e = 1;
            obj = c2765a.m9673a(this.f32946g, this);
            if (obj != coroutineSingletons) {
            }
            return coroutineSingletons;
        }
        if (i4 == 1) {
            AbstractC3193b.m15359b(obj);
        } else if (i4 == 2) {
            i3 = this.f32943d;
            LessonInfo lessonInfo3 = this.f32941b;
            C2775b c2775b2 = this.f32940a;
            AbstractC3193b.m15359b(obj);
            lessonInfo2 = lessonInfo3;
            c2775b = c2775b2;
            str = (String) obj;
            if (str.length() > 0) {
                InterfaceC3812yx interfaceC3812yx = c2775b.f33081q;
                DownloadItem downloadItem = new DownloadItem(c2775b.f33086v.f72109a, lessonInfo2.f19365a, str);
                this.f32940a = c2775b;
                this.f32941b = lessonInfo2;
                this.f32942c = null;
                this.f32943d = i3;
                this.f32944e = 3;
            }
            i = i3;
            lessonInfo = lessonInfo2;
            qj2 qj2Var = c2775b.f33069e;
            String str2 = c2775b.f33086v.f72109a;
            int i5 = lessonInfo.f19365a;
            this.f32940a = null;
            this.f32941b = null;
            this.f32942c = null;
            this.f32943d = i;
            this.f32944e = 5;
            objM7286l = ((C1295k) qj2Var.f57848a).m7286l(i5, str2, this);
            if (objM7286l != coroutineSingletons) {
                objM7286l = xfaVar;
            }
            if (objM7286l == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else if (i4 == 3) {
            i3 = this.f32943d;
            LessonInfo lessonInfo4 = this.f32941b;
            C2775b c2775b3 = this.f32940a;
            AbstractC3193b.m15359b(obj);
            lessonInfo2 = lessonInfo4;
            c2775b = c2775b3;
            i = i3;
            lessonInfo = lessonInfo2;
            qj2 qj2Var2 = c2775b.f33069e;
            String str3 = c2775b.f33086v.f72109a;
            int i6 = lessonInfo.f19365a;
            this.f32940a = null;
            this.f32941b = null;
            this.f32942c = null;
            this.f32943d = i;
            this.f32944e = 5;
            objM7286l = ((C1295k) qj2Var2.f57848a).m7286l(i6, str3, this);
            if (objM7286l != coroutineSingletons) {
                objM7286l = xfaVar;
            }
            if (objM7286l == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else if (i4 == 4) {
            i2 = this.f32943d;
            LessonInfo lessonInfo5 = this.f32941b;
            C2775b c2775b4 = this.f32940a;
            AbstractC3193b.m15359b(obj);
            lessonInfo = lessonInfo5;
            c2775b = c2775b4;
            i = i2;
            qj2 qj2Var3 = c2775b.f33069e;
            String str4 = c2775b.f33086v.f72109a;
            int i7 = lessonInfo.f19365a;
            this.f32940a = null;
            this.f32941b = null;
            this.f32942c = null;
            this.f32943d = i;
            this.f32944e = 5;
            objM7286l = ((C1295k) qj2Var3.f57848a).m7286l(i7, str4, this);
            if (objM7286l != coroutineSingletons) {
                objM7286l = xfaVar;
            }
            if (objM7286l == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i4 != 5) {
                C3386nv.m17633t("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            AbstractC3193b.m15359b(obj);
        }
        return xfaVar;
        lessonInfo = (LessonInfo) obj;
        if (lessonInfo != null) {
            int i8 = lessonInfo.f19365a;
            String str5 = lessonInfo.f19369e;
            if (str5 == null) {
                str5 = "";
            } else {
                if (str5.length() <= 0) {
                    str5 = null;
                }
                if (str5 == null) {
                    str5 = "";
                }
            }
            i = 0;
            if (vk9.m23391n0(str5) && lessonInfo.f19360P == null) {
                C1381c c1381c = c2775b.f33068d;
                String str6 = c2775b.f33086v.f72109a;
                this.f32940a = c2775b;
                this.f32941b = lessonInfo;
                this.f32942c = str5;
                this.f32943d = 0;
                this.f32944e = 2;
                Object objM7991b = c1381c.m7991b(i8, str6, this);
                if (objM7991b != coroutineSingletons) {
                    lessonInfo2 = lessonInfo;
                    obj = objM7991b;
                    i3 = 0;
                    str = (String) obj;
                    if (str.length() > 0) {
                        InterfaceC3812yx interfaceC3812yx2 = c2775b.f33081q;
                        DownloadItem downloadItem2 = new DownloadItem(c2775b.f33086v.f72109a, lessonInfo2.f19365a, str);
                        this.f32940a = c2775b;
                        this.f32941b = lessonInfo2;
                        this.f32942c = null;
                        this.f32943d = i3;
                        this.f32944e = 3;
                    }
                    i = i3;
                    lessonInfo = lessonInfo2;
                    qj2 qj2Var4 = c2775b.f33069e;
                    String str7 = c2775b.f33086v.f72109a;
                    int i9 = lessonInfo.f19365a;
                    this.f32940a = null;
                    this.f32941b = null;
                    this.f32942c = null;
                    this.f32943d = i;
                    this.f32944e = 5;
                    objM7286l = ((C1295k) qj2Var4.f57848a).m7286l(i9, str7, this);
                    if (objM7286l != coroutineSingletons) {
                        objM7286l = xfaVar;
                    }
                    if (objM7286l == coroutineSingletons) {
                    }
                }
            } else if (vk9.m23391n0(str5)) {
                qj2 qj2Var5 = c2775b.f33069e;
                String str8 = c2775b.f33086v.f72109a;
                int i10 = lessonInfo.f19365a;
                this.f32940a = null;
                this.f32941b = null;
                this.f32942c = null;
                this.f32943d = i;
                this.f32944e = 5;
                objM7286l = ((C1295k) qj2Var5.f57848a).m7286l(i10, str8, this);
                if (objM7286l != coroutineSingletons) {
                    objM7286l = xfaVar;
                }
                if (objM7286l == coroutineSingletons) {
                }
            } else {
                InterfaceC3812yx interfaceC3812yx3 = c2775b.f33081q;
                DownloadItem downloadItem3 = new DownloadItem(c2775b.f33086v.f72109a, i8, str5);
                this.f32940a = c2775b;
                this.f32941b = lessonInfo;
                this.f32942c = str5;
                this.f32943d = 0;
                this.f32944e = 4;
                if (interfaceC3812yx3.mo8234r(downloadItem3, this) != coroutineSingletons) {
                    i2 = 0;
                    i = i2;
                    qj2 qj2Var6 = c2775b.f33069e;
                    String str9 = c2775b.f33086v.f72109a;
                    int i11 = lessonInfo.f19365a;
                    this.f32940a = null;
                    this.f32941b = null;
                    this.f32942c = null;
                    this.f32943d = i;
                    this.f32944e = 5;
                    objM7286l = ((C1295k) qj2Var6.f57848a).m7286l(i11, str9, this);
                    if (objM7286l != coroutineSingletons) {
                        objM7286l = xfaVar;
                    }
                    if (objM7286l == coroutineSingletons) {
                    }
                }
            }
            return coroutineSingletons;
        }
        return xfaVar;
    }
}
