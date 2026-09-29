package com.lingq.p055ui.lesson;

import cm.InterfaceC2057q;
import com.android.installreferrer.api.InstallReferrerClient;
import java.util.List;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p260m8.C7499b;
import p265mj.C7567a;
import p464wl.InterfaceC9968c;
import p490xl.InterfaceC10224c;
import sl.C9072e;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(m13364d1 = {"\u0000\u0016\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00000\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u008a@"}, m13365d2 = {"", "currentPage", "", "Lmj/a;", "pages", "Lkotlin/Pair;", "<anonymous>"}, m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
@InterfaceC10224c(m19205c = "com.lingq.ui.lesson.LessonViewModel$pagesInfo$1", m19206f = "LessonViewModel.kt", m19207l = {}, m19208m = "invokeSuspend")
final class LessonViewModel$pagesInfo$1 extends SuspendLambda implements InterfaceC2057q<Integer, List<? extends C7567a>, InterfaceC9968c<? super Pair<? extends Integer, ? extends Integer>>, Object> {

    /* JADX INFO: renamed from: e */
    public /* synthetic */ int f27721e;

    /* JADX INFO: renamed from: f */
    public /* synthetic */ List f27722f;

    public LessonViewModel$pagesInfo$1(InterfaceC9968c<? super LessonViewModel$pagesInfo$1> interfaceC9968c) {
        super(3, interfaceC9968c);
    }

    @Override // cm.InterfaceC2057q
    /* JADX INFO: renamed from: M */
    public final Object mo1343M(Integer num, List<? extends C7567a> list, InterfaceC9968c<? super Pair<? extends Integer, ? extends Integer>> interfaceC9968c) {
        int iIntValue = num.intValue();
        LessonViewModel$pagesInfo$1 lessonViewModel$pagesInfo$1 = new LessonViewModel$pagesInfo$1(interfaceC9968c);
        lessonViewModel$pagesInfo$1.f27721e = iIntValue;
        lessonViewModel$pagesInfo$1.f27722f = list;
        return lessonViewModel$pagesInfo$1.mo1338x(C9072e.f47360a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /* JADX INFO: renamed from: x */
    public final Object mo1338x(Object obj) throws Throwable {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        C7499b.m14977z0(obj);
        return new Pair(new Integer(this.f27721e + 1), new Integer(this.f27722f.size()));
    }
}
