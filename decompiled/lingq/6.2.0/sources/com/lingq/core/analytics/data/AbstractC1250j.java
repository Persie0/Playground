package com.lingq.core.analytics.data;

/* JADX INFO: renamed from: com.lingq.core.analytics.data.j */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1250j {
    /* JADX INFO: renamed from: a */
    public static final String m7032a(LqAnalyticsValues$LessonPath lqAnalyticsValues$LessonPath) {
        if (lqAnalyticsValues$LessonPath instanceof LqAnalyticsValues$LessonPath.URL) {
            return ((LqAnalyticsValues$LessonPath.URL) lqAnalyticsValues$LessonPath).m7030a();
        }
        if (lqAnalyticsValues$LessonPath instanceof LqAnalyticsValues$LessonPath.Feed) {
            return "Library Feed";
        }
        if ((lqAnalyticsValues$LessonPath instanceof LqAnalyticsValues$LessonPath.SearchShelf) || (lqAnalyticsValues$LessonPath instanceof LqAnalyticsValues$LessonPath.Search)) {
            return "Library Search";
        }
        if (lqAnalyticsValues$LessonPath instanceof LqAnalyticsValues$LessonPath.Playlist) {
            return "Playlist";
        }
        if (lqAnalyticsValues$LessonPath instanceof LqAnalyticsValues$LessonPath.LessonComplete) {
            return "Lesson Complete";
        }
        if (lqAnalyticsValues$LessonPath instanceof LqAnalyticsValues$LessonPath.LessonInfo) {
            return "Lesson Info";
        }
        return lqAnalyticsValues$LessonPath instanceof LqAnalyticsValues$LessonPath.Deeplink ? "Deeplink" : "";
    }

    /* JADX INFO: renamed from: b */
    public static final String m7033b(LqAnalyticsValues$LessonPath lqAnalyticsValues$LessonPath) {
        if (lqAnalyticsValues$LessonPath instanceof LqAnalyticsValues$LessonPath.URL) {
            return ((LqAnalyticsValues$LessonPath.URL) lqAnalyticsValues$LessonPath).m7031b();
        }
        if (lqAnalyticsValues$LessonPath instanceof LqAnalyticsValues$LessonPath.Feed) {
            return ((LqAnalyticsValues$LessonPath.Feed) lqAnalyticsValues$LessonPath).f14307a;
        }
        if (lqAnalyticsValues$LessonPath instanceof LqAnalyticsValues$LessonPath.SearchShelf) {
            return ((LqAnalyticsValues$LessonPath.SearchShelf) lqAnalyticsValues$LessonPath).m7029a();
        }
        if (lqAnalyticsValues$LessonPath instanceof LqAnalyticsValues$LessonPath.LessonComplete) {
            return "Next Lesson";
        }
        return lqAnalyticsValues$LessonPath instanceof LqAnalyticsValues$LessonPath.Search ? "Library" : "";
    }
}
