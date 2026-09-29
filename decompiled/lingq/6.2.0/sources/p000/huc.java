package p000;

import com.lingq.core.domain.model.lesson.LessonFurigana;
import com.lingq.core.domain.model.lesson.LessonTextToken;
import com.lingq.core.domain.model.lesson.LessonTransliteration;
import com.lingq.core.network.api.result.ResultLessonTransliteration;
import com.lingq.core.network.api.result.ResultTextToken;

/* JADX INFO: loaded from: classes2.dex */
public abstract class huc {

    /* JADX INFO: renamed from: a */
    public static final int[] f42962a = {-1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 36, -1, -1, -1, 37, 38, -1, -1, -1, -1, 39, 40, -1, 41, 42, 43, 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 44, -1, -1, -1, -1, -1, -1, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35, -1, -1, -1, -1, -1};

    /* JADX INFO: renamed from: a */
    public static final LessonTextToken m13483a(ResultTextToken resultTextToken) {
        LessonTransliteration lessonTransliteration;
        resultTextToken.getClass();
        String str = resultTextToken.f21568a;
        String str2 = resultTextToken.f21569b;
        boolean z = resultTextToken.f21570c;
        String str3 = resultTextToken.f21571d;
        String str4 = resultTextToken.f21572e;
        ResultLessonTransliteration resultLessonTransliteration = resultTextToken.f21573f;
        if (resultLessonTransliteration != null) {
            String str5 = resultLessonTransliteration.f21193a;
            String str6 = resultLessonTransliteration.f21194b;
            String str7 = resultLessonTransliteration.f21195c;
            String str8 = resultLessonTransliteration.f21196d;
            String str9 = resultLessonTransliteration.f21197e;
            String str10 = resultLessonTransliteration.f21198f;
            z88 z88Var = resultLessonTransliteration.f21199g;
            lessonTransliteration = new LessonTransliteration(str5, str6, str7, str8, str9, str10, z88Var != null ? new LessonFurigana(z88Var.f71092a, z88Var.f71093b) : null, resultLessonTransliteration.f21200h);
        } else {
            str2 = str2;
            lessonTransliteration = null;
        }
        return new LessonTextToken(str, str2, z, str3, str4, lessonTransliteration, resultTextToken.f21574g, resultTextToken.f21575h, resultTextToken.f21576i, resultTextToken.f21577j, resultTextToken.f21578k, resultTextToken.f21579l, resultTextToken.f21580m, resultTextToken.f21581n);
    }
}
