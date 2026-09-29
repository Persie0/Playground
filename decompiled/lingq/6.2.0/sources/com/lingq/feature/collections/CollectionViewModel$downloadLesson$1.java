package com.lingq.feature.collections;

import com.lingq.core.data.repository.C1295k;
import com.lingq.core.domain.lesson.C1381c;
import com.lingq.core.domain.model.audio.DownloadItem;
import com.lingq.core.domain.model.library.LessonInfo;
import com.lingq.feature.collections.domain.C2035a;
import kotlin.AbstractC3193b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p000.C3139j9;
import p000.C3386nv;
import p000.InterfaceC3812yx;
import p000.c32;
import p000.l91;
import p000.vi3;
import p000.vk9;
import p000.xfa;

/* JADX INFO: loaded from: classes2.dex */
@c32(m4290c = "com.lingq.feature.collections.CollectionViewModel$downloadLesson$1", m4291f = "CollectionViewModel.kt", m4292l = {786, 789, 794, 803, 812}, m4293m = "invokeSuspend", m4294v = 2)
final class CollectionViewModel$downloadLesson$1 extends SuspendLambda implements vi3 {

    /* JADX INFO: renamed from: a */
    public LessonInfo f25363a;

    /* JADX INFO: renamed from: b */
    public String f25364b;

    /* JADX INFO: renamed from: c */
    public int f25365c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ C2034d f25366d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ int f25367e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ l91 f25368f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CollectionViewModel$downloadLesson$1(C2034d c2034d, int i, l91 l91Var, Continuation continuation) {
        super(1, continuation);
        this.f25366d = c2034d;
        this.f25367e = i;
        this.f25368f = l91Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Continuation continuation) {
        return new CollectionViewModel$downloadLesson$1(this.f25366d, this.f25367e, this.f25368f, continuation);
    }

    @Override // p000.vi3
    public final Object invoke(Object obj) {
        return ((CollectionViewModel$downloadLesson$1) create((Continuation) obj)).invokeSuspend(xfa.f68157a);
    }

    /* JADX WARN: Code duplicated, block: B:39:0x0088  */
    /* JADX WARN: Code duplicated, block: B:47:0x00bc A[PHI: r1
      0x00bc: PHI (r1v5 com.lingq.core.domain.model.library.LessonInfo) = 
      (r1v3 com.lingq.core.domain.model.library.LessonInfo)
      (r1v3 com.lingq.core.domain.model.library.LessonInfo)
      (r1v4 com.lingq.core.domain.model.library.LessonInfo)
      (r1v4 com.lingq.core.domain.model.library.LessonInfo)
      (r1v9 com.lingq.core.domain.model.library.LessonInfo)
     binds: [B:43:0x00a4, B:45:0x00b9, B:38:0x0086, B:40:0x009d, B:13:0x0026] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:50:0x00d3  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        LessonInfo lessonInfo;
        String str;
        String str2;
        InterfaceC3812yx interfaceC3812yx;
        DownloadItem downloadItem;
        Object objM7286l;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.f25365c;
        xfa xfaVar = xfa.f68157a;
        l91 l91Var = this.f25368f;
        C2034d c2034d = this.f25366d;
        if (i == 0) {
            AbstractC3193b.m15359b(obj);
            C2035a c2035a = c2034d.f25543B;
            this.f25365c = 1;
            obj = c2035a.m8956b(this.f25367e, this);
            if (obj != coroutineSingletons) {
            }
        }
        if (i == 1) {
            AbstractC3193b.m15359b(obj);
        } else {
            if (i == 2) {
                String str3 = this.f25364b;
                LessonInfo lessonInfo2 = this.f25363a;
                AbstractC3193b.m15359b(obj);
                str = str3;
                lessonInfo = lessonInfo2;
                str2 = (String) obj;
                if (str2.length() > 0) {
                    interfaceC3812yx = c2034d.f25552K;
                    downloadItem = new DownloadItem(l91Var.f49324a, lessonInfo.f19365a, str2);
                    this.f25363a = lessonInfo;
                    this.f25364b = str;
                    this.f25365c = 3;
                    if (interfaceC3812yx.mo8234r(downloadItem, this) != coroutineSingletons) {
                    }
                }
            }
            if (i != 3 && i != 4) {
                if (i == 5) {
                    AbstractC3193b.m15359b(obj);
                    return xfaVar;
                }
                C3386nv.m17633t("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            lessonInfo = this.f25363a;
            AbstractC3193b.m15359b(obj);
        }
        C3139j9 c3139j9 = c2034d.f25544C;
        String str4 = l91Var.f49324a;
        int i2 = lessonInfo.f19365a;
        this.f25363a = null;
        this.f25364b = null;
        this.f25365c = 5;
        objM7286l = ((C1295k) c3139j9.f45229a).m7286l(i2, str4, this);
        if (objM7286l != coroutineSingletons) {
            objM7286l = xfaVar;
        }
        return objM7286l == coroutineSingletons ? coroutineSingletons : xfaVar;
        lessonInfo = (LessonInfo) obj;
        if (lessonInfo != null) {
            int i3 = lessonInfo.f19365a;
            str = lessonInfo.f19369e;
            if (str == null || vk9.m23391n0(str)) {
                str = null;
            }
            if (str == null) {
                str = "";
            }
            if (vk9.m23391n0(str) && lessonInfo.f19360P == null) {
                C1381c c1381c = c2034d.f25549H;
                String str5 = l91Var.f49324a;
                this.f25363a = lessonInfo;
                this.f25364b = str;
                this.f25365c = 2;
                obj = c1381c.m7991b(i3, str5, this);
                if (obj != coroutineSingletons) {
                    str2 = (String) obj;
                    if (str2.length() > 0) {
                        interfaceC3812yx = c2034d.f25552K;
                        downloadItem = new DownloadItem(l91Var.f49324a, lessonInfo.f19365a, str2);
                        this.f25363a = lessonInfo;
                        this.f25364b = str;
                        this.f25365c = 3;
                        if (interfaceC3812yx.mo8234r(downloadItem, this) != coroutineSingletons) {
                            C3139j9 c3139j10 = c2034d.f25544C;
                            String str6 = l91Var.f49324a;
                            int i4 = lessonInfo.f19365a;
                            this.f25363a = null;
                            this.f25364b = null;
                            this.f25365c = 5;
                            objM7286l = ((C1295k) c3139j10.f45229a).m7286l(i4, str6, this);
                            if (objM7286l != coroutineSingletons) {
                                objM7286l = xfaVar;
                            }
                            if (objM7286l == coroutineSingletons) {
                            }
                        }
                    } else {
                        C3139j9 c3139j11 = c2034d.f25544C;
                        String str7 = l91Var.f49324a;
                        int i5 = lessonInfo.f19365a;
                        this.f25363a = null;
                        this.f25364b = null;
                        this.f25365c = 5;
                        objM7286l = ((C1295k) c3139j11.f45229a).m7286l(i5, str7, this);
                        if (objM7286l != coroutineSingletons) {
                            objM7286l = xfaVar;
                        }
                        if (objM7286l == coroutineSingletons) {
                        }
                    }
                }
            } else if (vk9.m23391n0(str)) {
                C3139j9 c3139j12 = c2034d.f25544C;
                String str8 = l91Var.f49324a;
                int i6 = lessonInfo.f19365a;
                this.f25363a = null;
                this.f25364b = null;
                this.f25365c = 5;
                objM7286l = ((C1295k) c3139j12.f45229a).m7286l(i6, str8, this);
                if (objM7286l != coroutineSingletons) {
                    objM7286l = xfaVar;
                }
                if (objM7286l == coroutineSingletons) {
                }
            } else {
                InterfaceC3812yx interfaceC3812yx2 = c2034d.f25552K;
                DownloadItem downloadItem2 = new DownloadItem(l91Var.f49324a, i3, str);
                this.f25363a = lessonInfo;
                this.f25364b = str;
                this.f25365c = 4;
                if (interfaceC3812yx2.mo8234r(downloadItem2, this) != coroutineSingletons) {
                    C3139j9 c3139j13 = c2034d.f25544C;
                    String str9 = l91Var.f49324a;
                    int i7 = lessonInfo.f19365a;
                    this.f25363a = null;
                    this.f25364b = null;
                    this.f25365c = 5;
                    objM7286l = ((C1295k) c3139j13.f45229a).m7286l(i7, str9, this);
                    if (objM7286l != coroutineSingletons) {
                        objM7286l = xfaVar;
                    }
                    if (objM7286l == coroutineSingletons) {
                    }
                }
            }
        }
    }
}
