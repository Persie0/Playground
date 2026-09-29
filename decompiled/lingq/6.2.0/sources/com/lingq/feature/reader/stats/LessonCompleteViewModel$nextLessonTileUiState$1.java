package com.lingq.feature.reader.stats;

import com.lingq.core.domain.model.lesson.LessonCompleteData;
import com.lingq.core.domain.model.lesson.LessonCompleteNext;
import com.lingq.core.domain.model.lesson.LessonReference;
import com.lingq.core.domain.model.library.LessonInfo;
import com.lingq.core.domain.model.library.LibraryItemCounter;
import kotlin.AbstractC3193b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p000.c32;
import p000.cj3;
import p000.el6;
import p000.gl6;
import p000.hl6;
import p000.il6;
import p000.vk9;
import p000.xfa;
import p000.y02;

/* JADX INFO: loaded from: classes3.dex */
@c32(m4290c = "com.lingq.feature.reader.stats.LessonCompleteViewModel$nextLessonTileUiState$1", m4291f = "LessonCompleteViewModel.kt", m4292l = {}, m4293m = "invokeSuspend", m4294v = 2)
final class LessonCompleteViewModel$nextLessonTileUiState$1 extends SuspendLambda implements cj3 {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ LessonCompleteData f30615a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ LessonInfo f30616b;

    /* JADX INFO: renamed from: c */
    public /* synthetic */ LessonCompleteNext f30617c;

    /* JADX INFO: renamed from: d */
    public /* synthetic */ LibraryItemCounter f30618d;

    @Override // p000.cj3
    /* JADX INFO: renamed from: i */
    public final Object mo1291i(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        LessonCompleteViewModel$nextLessonTileUiState$1 lessonCompleteViewModel$nextLessonTileUiState$1 = new LessonCompleteViewModel$nextLessonTileUiState$1(5, (Continuation) obj5);
        lessonCompleteViewModel$nextLessonTileUiState$1.f30615a = (LessonCompleteData) obj;
        lessonCompleteViewModel$nextLessonTileUiState$1.f30616b = (LessonInfo) obj2;
        lessonCompleteViewModel$nextLessonTileUiState$1.f30617c = (LessonCompleteNext) obj3;
        lessonCompleteViewModel$nextLessonTileUiState$1.f30618d = (LibraryItemCounter) obj4;
        return lessonCompleteViewModel$nextLessonTileUiState$1.invokeSuspend(xfa.f68157a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        String str;
        String str2;
        int iIntValue;
        Integer num;
        String str3;
        LessonCompleteData lessonCompleteData = this.f30615a;
        LessonInfo lessonInfo = this.f30616b;
        LessonCompleteNext lessonCompleteNext = this.f30617c;
        LibraryItemCounter libraryItemCounter = this.f30618d;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        AbstractC3193b.m15359b(obj);
        String str4 = "";
        if (lessonCompleteNext != null && lessonCompleteData.f19205b == null) {
            String str5 = lessonCompleteNext.f19223b;
            String str6 = lessonCompleteNext.f19224c;
            if (str6 == null) {
                str6 = "";
            }
            return new il6(new el6(str5, str6, "", "--:-- min"), true, libraryItemCounter != null ? libraryItemCounter.f19464j : 0, libraryItemCounter != null ? libraryItemCounter.f19466l : 0, libraryItemCounter != null ? libraryItemCounter.f19465k : 0);
        }
        if (lessonCompleteData.f19205b == null) {
            return hl6.f42579a;
        }
        LessonReference lessonReference = lessonCompleteData.f19220q;
        if (lessonReference == null && lessonInfo == null) {
            return new gl6();
        }
        if (lessonReference == null || (str = lessonReference.f19247g) == null) {
            str = lessonInfo != null ? lessonInfo.f19366b : "";
        }
        if (lessonReference == null || (str2 = lessonReference.f19248h) == null) {
            str2 = lessonInfo != null ? lessonInfo.f19368d : null;
            if (str2 == null) {
                str2 = "";
            }
        }
        if (lessonReference == null || (str3 = lessonReference.f19243c) == null) {
            String str7 = lessonInfo != null ? lessonInfo.f19373i : null;
            if (str7 != null) {
                str4 = str7;
            }
        } else {
            str4 = str3;
        }
        if (lessonReference == null || (num = lessonReference.f19249i) == null) {
            iIntValue = lessonInfo != null ? lessonInfo.f19371g : 0;
        } else {
            iIntValue = num.intValue();
        }
        String strM24809g = y02.m24809g(((long) iIntValue) * 1000);
        return new il6(new el6(str, str2, str4, vk9.m23391n0(strM24809g) ? "--:-- min" : strM24809g), false, libraryItemCounter != null ? libraryItemCounter.f19464j : 0, libraryItemCounter != null ? libraryItemCounter.f19466l : 0, libraryItemCounter != null ? libraryItemCounter.f19465k : 0);
    }
}
