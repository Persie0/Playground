package p000;

import com.lingq.core.database.entity.LessonEntity;
import com.lingq.core.database.entity.TranslationSentenceEntity;
import com.lingq.core.domain.model.lesson.Lesson;
import com.lingq.core.domain.model.lesson.LessonSentencesTranslation;
import com.lingq.core.domain.model.lesson.LessonTranslationSentence;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public abstract class tid {
    /* JADX INFO: renamed from: a */
    public static final Lesson m22081a(LessonEntity lessonEntity) {
        lessonEntity.getClass();
        int i = lessonEntity.f17274a;
        String str = lessonEntity.f17282e;
        if (str == null) {
            str = "";
        }
        String str2 = lessonEntity.f17284f;
        String str3 = lessonEntity.f17277b0;
        String str4 = lessonEntity.f17288h;
        String str5 = lessonEntity.f17290i;
        int i2 = lessonEntity.f17292j;
        int i3 = lessonEntity.f17310s;
        String str6 = lessonEntity.f17312t;
        LessonSentencesTranslation lessonSentencesTranslation = lessonEntity.f17318w;
        Integer num = lessonEntity.f17246D;
        Integer num2 = lessonEntity.f17248E;
        boolean z = lessonEntity.f17257J;
        int i4 = lessonEntity.f17305p0;
        List list = lessonEntity.f17309r0;
        String str7 = str;
        ArrayList arrayList = new ArrayList(v91.m23189q0(list, 10));
        for (Iterator it = list.iterator(); it.hasNext(); it = it) {
            TranslationSentenceEntity translationSentenceEntity = (TranslationSentenceEntity) it.next();
            arrayList.add(translationSentenceEntity != null ? new LessonTranslationSentence(translationSentenceEntity.f17474a, translationSentenceEntity.f17475b, translationSentenceEntity.f17476c, translationSentenceEntity.f17477d, translationSentenceEntity.f17478e, translationSentenceEntity.f17479f, translationSentenceEntity.f17480g) : null);
        }
        String str8 = lessonEntity.f17311s0;
        String str9 = lessonEntity.f17313t0;
        String str10 = lessonEntity.f17301n0;
        int i5 = lessonEntity.f17258K;
        Boolean bool = lessonEntity.f17325z0;
        String str11 = lessonEntity.f17268U;
        Boolean bool2 = lessonEntity.f17243B0;
        return new Lesson(i, str7, str2, str3, str4, str5, i2, i3, str6, lessonSentencesTranslation, num, num2, z, i4, arrayList, str8, str9, str10, i5, bool, str11, bool2 != null ? bool2.booleanValue() : false, lessonEntity.f17283e0, lessonEntity.f17295k0, lessonEntity.f17293j0, lessonEntity.f17291i0, lessonEntity.f17262O, lessonEntity.f17245C0, lessonEntity.f17303o0, lessonEntity.f17250F, lessonEntity.f17252G, lessonEntity.f17247D0, lessonEntity.f17249E0, lessonEntity.f17251F0, lessonEntity.f17253G0, lessonEntity.f17294k, lessonEntity.f17255H0);
    }
}
