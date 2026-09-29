package p000;

import androidx.compose.runtime.internal.C0282a;
import com.lingq.core.database.entity.LessonNextSuggestionEntity;
import com.lingq.core.network.api.result.MoreLesson;
import com.lingq.core.network.api.result.ResultLessonMediaSource;

/* JADX INFO: loaded from: classes2.dex */
public abstract class xrc {

    /* JADX INFO: renamed from: a */
    public static final C0282a f68591a = new C0282a(1801953064, false, new ge1(27));

    /* JADX INFO: renamed from: b */
    public static final C0282a f68592b = new C0282a(-1368506974, false, new he1(8));

    /* JADX INFO: renamed from: c */
    public static final C0282a f68593c = new C0282a(-2030096447, false, new he1(9));

    /* JADX INFO: renamed from: a */
    public static final LessonNextSuggestionEntity m24660a(MoreLesson moreLesson, int i) {
        moreLesson.getClass();
        Integer num = moreLesson.f20564a;
        int iIntValue = num != null ? num.intValue() : 0;
        String str = moreLesson.f20568e;
        if (str == null) {
            str = "";
        }
        String str2 = str;
        String str3 = moreLesson.f20565b;
        ResultLessonMediaSource resultLessonMediaSource = moreLesson.f20566c;
        String str4 = resultLessonMediaSource != null ? resultLessonMediaSource.f21090a : null;
        String str5 = resultLessonMediaSource != null ? resultLessonMediaSource.f21091b : null;
        String str6 = resultLessonMediaSource != null ? resultLessonMediaSource.f21092c : null;
        return new LessonNextSuggestionEntity(iIntValue, i, str2, str3, str4, str5, str6, moreLesson.f20567d);
    }
}
