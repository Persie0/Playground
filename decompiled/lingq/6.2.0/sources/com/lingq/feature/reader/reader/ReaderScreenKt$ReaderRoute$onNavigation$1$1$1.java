package com.lingq.feature.reader.reader;

import android.os.Bundle;
import android.os.Parcelable;
import com.lingq.core.analytics.data.LqAnalyticsValues$LessonPath;
import com.lingq.core.domain.model.lesson.Lesson;
import com.lingq.core.domain.model.lesson.LessonBookmark;
import com.lingq.feature.reader.R$id;
import com.lingq.feature.reader.content.C2260a;
import java.io.Serializable;
import kotlin.AbstractC3193b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.C3244l;
import p000.C3386nv;
import p000.c32;
import p000.r43;
import p000.r86;
import p000.ud6;
import p000.un1;
import p000.wq1;
import p000.xfa;
import p000.yz4;
import p000.zi3;

/* JADX INFO: loaded from: classes3.dex */
@c32(m4290c = "com.lingq.feature.reader.reader.ReaderScreenKt$ReaderRoute$onNavigation$1$1$1", m4291f = "ReaderScreen.kt", m4292l = {371}, m4293m = "invokeSuspend", m4294v = 2)
final class ReaderScreenKt$ReaderRoute$onNavigation$1$1$1 extends SuspendLambda implements zi3 {

    /* JADX INFO: renamed from: a */
    public int f30166a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C2493a f30167b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ ud6 f30168c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ Lesson f30169d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ReaderScreenKt$ReaderRoute$onNavigation$1$1$1(C2493a c2493a, ud6 ud6Var, Lesson lesson, Continuation continuation) {
        super(2, continuation);
        this.f30167b = c2493a;
        this.f30168c = ud6Var;
        this.f30169d = lesson;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new ReaderScreenKt$ReaderRoute$onNavigation$1$1$1(this.f30167b, this.f30168c, this.f30169d, continuation);
    }

    @Override // p000.zi3
    public final Object invoke(Object obj, Object obj2) {
        return ((ReaderScreenKt$ReaderRoute$onNavigation$1$1$1) create((un1) obj, (Continuation) obj2)).invokeSuspend(xfa.f68157a);
    }

    /* JADX WARN: Code duplicated, block: B:19:0x004d  */
    /* JADX WARN: Code duplicated, block: B:21:0x0050 A[RETURN] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        int iIntValue;
        Object objM9253f;
        Integer num;
        String str;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.f30166a;
        xfa xfaVar = xfa.f68157a;
        C2493a c2493a = this.f30167b;
        if (i == 0) {
            AbstractC3193b.m15359b(obj);
            this.f30166a = 1;
            C2260a c2260a = c2493a.f30212e;
            yz4 yz4Var = (yz4) ((C3244l) c2260a.f27957w.f9311a).getValue();
            LessonBookmark lessonBookmark = yz4Var.f70671e;
            if (lessonBookmark == null || (num = lessonBookmark.f19169b) == null) {
                Integer numM9265g = c2493a.f30214f.m9265g(yz4Var.f70680n);
                if (numM9265g != null) {
                    iIntValue = numM9265g.intValue();
                } else {
                    objM9253f = xfaVar;
                }
                if (objM9253f == coroutineSingletons) {
                    return coroutineSingletons;
                }
            } else {
                iIntValue = num.intValue();
            }
            objM9253f = c2260a.m9253f(iIntValue, this);
            if (objM9253f != coroutineSingletons) {
                objM9253f = xfaVar;
            }
            if (objM9253f == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                C3386nv.m17633t("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            AbstractC3193b.m15359b(obj);
        }
        int i2 = R$id.fragment_reader_compose;
        int i3 = R$id.actionToSentenceMode;
        int i4 = c2493a.f30190L;
        Lesson lesson = this.f30169d;
        int i5 = lesson != null ? lesson.f19149h : -1;
        if (lesson == null || (str = lesson.f19150i) == null) {
            str = "";
        }
        Bundle bundle = new Bundle();
        bundle.putInt("lessonId", i4);
        bundle.putInt("courseId", i5);
        bundle.putString("courseTitle", str);
        bundle.putBoolean("isSentenceMode", true);
        bundle.putString("lessonLanguageFromDeeplink", "");
        if (Parcelable.class.isAssignableFrom(LqAnalyticsValues$LessonPath.class)) {
            bundle.putParcelable("lessonPath", null);
        } else {
            if (!Serializable.class.isAssignableFrom(LqAnalyticsValues$LessonPath.class)) {
                C3386nv.m17636w(LqAnalyticsValues$LessonPath.class.getName().concat(" must implement Parcelable or Serializable or must be an Enum."));
                return null;
            }
            bundle.putSerializable("lessonPath", null);
        }
        ud6 ud6Var = this.f30168c;
        ud6Var.getClass();
        r86 r86VarM13127f = ud6Var.f63760b.m13127f();
        if (r86VarM13127f == null || i2 != r86VarM13127f.f58881b.f57368b) {
            r43.m20289a().m20290b(new IllegalArgumentException(wq1.m24115k("Action not found for current destination: ", i2, i3, " and id: ")));
            return xfaVar;
        }
        ud6Var.m22687d(i3, bundle, null);
        return xfaVar;
    }
}
