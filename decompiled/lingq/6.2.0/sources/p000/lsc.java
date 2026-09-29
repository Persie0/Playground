package p000;

import androidx.compose.runtime.internal.C0282a;
import com.lingq.core.database.entity.LessonTagEntity;
import com.lingq.core.network.api.result.ResultLessonTags;

/* JADX INFO: loaded from: classes2.dex */
public abstract class lsc {

    /* JADX INFO: renamed from: a */
    public static final C0282a f50089a = new C0282a(-1422869580, false, new ie1(0));

    /* JADX INFO: renamed from: b */
    public static final C0282a f50090b = new C0282a(917591902, false, new he1(17));

    /* JADX INFO: renamed from: c */
    public static final C0282a f50091c = new C0282a(1202727805, false, new he1(18));

    /* JADX INFO: renamed from: a */
    public static final LessonTagEntity m16528a(ResultLessonTags resultLessonTags) {
        resultLessonTags.getClass();
        String str = resultLessonTags.f21119a;
        if (str == null) {
            str = "";
        }
        return new LessonTagEntity(str);
    }
}
