package com.lingq.feature.karaoke;

import com.lingq.core.domain.model.lesson.LessonTranslationSentence;
import kotlin.jvm.internal.FunctionReferenceImpl;
import p000.nb7;
import p000.vi3;
import p000.xfa;

/* JADX INFO: loaded from: classes3.dex */
final /* synthetic */ class KaraokeScreenKt$KaraokeRoute$2$1 extends FunctionReferenceImpl implements vi3 {
    @Override // p000.vi3
    public final Object invoke(Object obj) {
        LessonTranslationSentence lessonTranslationSentence = (LessonTranslationSentence) obj;
        lessonTranslationSentence.getClass();
        C2118c c2118c = (C2118c) this.f47704b;
        c2118c.getClass();
        Double d = lessonTranslationSentence.f19294c;
        double dDoubleValue = 0.0d;
        if (lessonTranslationSentence.f19292a != 1 && ((d != null && d.doubleValue() == 0.0d) || d == null)) {
            dDoubleValue = -1.0d;
        } else if (d != null) {
            dDoubleValue = d.doubleValue();
        }
        c2118c.f26293g.m8442C(new nb7(dDoubleValue));
        c2118c.m9031W2(dDoubleValue);
        return xfa.f68157a;
    }
}
