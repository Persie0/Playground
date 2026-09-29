package com.lingq.feature.reader.content.domain;

import com.lingq.core.domain.model.lesson.LessonSentence;
import java.util.ArrayList;
import java.util.List;
import kotlin.AbstractC3193b;
import kotlin.collections.EmptyList;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p000.AbstractC3184kh;
import p000.bj3;
import p000.c32;
import p000.fa4;
import p000.lx8;
import p000.ox8;
import p000.s7d;
import p000.xfa;

/* JADX INFO: loaded from: classes2.dex */
@c32(m4290c = "com.lingq.feature.reader.content.domain.VideoTextProvider$observeSentenceParagraphs$1", m4291f = "VideoTextProvider.kt", m4292l = {}, m4293m = "invokeSuspend", m4294v = 2)
final class VideoTextProvider$observeSentenceParagraphs$1 extends SuspendLambda implements bj3 {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ List f27976a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ String f27977b;

    /* JADX INFO: renamed from: c */
    public /* synthetic */ boolean f27978c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ String f27979d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public VideoTextProvider$observeSentenceParagraphs$1(String str, Continuation continuation) {
        super(4, continuation);
        this.f27979d = str;
    }

    @Override // p000.bj3
    /* JADX INFO: renamed from: e */
    public final Object mo825e(Object obj, Object obj2, Object obj3, Object obj4) {
        boolean zBooleanValue = ((Boolean) obj3).booleanValue();
        VideoTextProvider$observeSentenceParagraphs$1 videoTextProvider$observeSentenceParagraphs$1 = new VideoTextProvider$observeSentenceParagraphs$1(this.f27979d, (Continuation) obj4);
        videoTextProvider$observeSentenceParagraphs$1.f27976a = (List) obj;
        videoTextProvider$observeSentenceParagraphs$1.f27977b = (String) obj2;
        videoTextProvider$observeSentenceParagraphs$1.f27978c = zBooleanValue;
        return videoTextProvider$observeSentenceParagraphs$1.invokeSuspend(xfa.f68157a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        lx8 lx8Var;
        List<LessonSentence> list = this.f27976a;
        String str = this.f27977b;
        boolean z = this.f27978c;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        AbstractC3193b.m15359b(obj);
        if (list.isEmpty()) {
            return EmptyList.f47638a;
        }
        if (!AbstractC3184kh.m15229x(this.f27979d)) {
            z = true;
        }
        ArrayList arrayList = new ArrayList();
        for (LessonSentence lessonSentence : list) {
            String str2 = lessonSentence.f19259g;
            int i = lessonSentence.f19256d;
            if (str2 == null || !fa4.m11650l(lessonSentence.f19260h, "img")) {
                ox8 ox8VarM21148a = s7d.m21148a(lessonSentence, i, 0, z, str);
                lx8Var = new lx8(i, ox8VarM21148a.f55141a, ox8VarM21148a.f55142b, lessonSentence);
            } else {
                lx8Var = null;
            }
            if (lx8Var != null) {
                arrayList.add(lx8Var);
            }
        }
        return arrayList;
    }
}
