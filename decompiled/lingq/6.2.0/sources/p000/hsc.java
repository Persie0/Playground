package p000;

import androidx.compose.runtime.internal.C0282a;
import com.lingq.core.database.entity.LessonStatsEntity;
import com.lingq.core.network.api.result.ResultLessonStats;

/* JADX INFO: loaded from: classes2.dex */
public abstract class hsc {

    /* JADX INFO: renamed from: a */
    public static final C0282a f42893a = new C0282a(-1304333461, false, new ge1(28));

    /* JADX INFO: renamed from: b */
    public static final C0282a f42894b = new C0282a(644770786, false, new ge1(29));

    /* JADX INFO: renamed from: c */
    public static final C0282a f42895c = new C0282a(-1776076316, false, new he1(16));

    /* JADX INFO: renamed from: a */
    public static final LessonStatsEntity m13453a(ResultLessonStats resultLessonStats, int i) {
        resultLessonStats.getClass();
        Double d = resultLessonStats.f21111a;
        double dDoubleValue = d != null ? d.doubleValue() : 0.0d;
        Double d2 = resultLessonStats.f21112b;
        double dDoubleValue2 = d2 != null ? d2.doubleValue() : 0.0d;
        Double d3 = resultLessonStats.f21113c;
        double dDoubleValue3 = d3 != null ? d3.doubleValue() : 0.0d;
        Double d4 = resultLessonStats.f21114d;
        double dDoubleValue4 = d4 != null ? d4.doubleValue() : 0.0d;
        Double d5 = resultLessonStats.f21115e;
        double dDoubleValue5 = d5 != null ? d5.doubleValue() : 0.0d;
        Double d6 = resultLessonStats.f21116f;
        double dDoubleValue6 = d6 != null ? d6.doubleValue() : 0.0d;
        Double d7 = resultLessonStats.f21117g;
        double dDoubleValue7 = d7 != null ? d7.doubleValue() : 0.0d;
        Double d8 = resultLessonStats.f21118h;
        return new LessonStatsEntity(i, dDoubleValue, dDoubleValue2, dDoubleValue3, dDoubleValue4, dDoubleValue5, dDoubleValue6, dDoubleValue7, d8 != null ? d8.doubleValue() : 0.0d);
    }
}
