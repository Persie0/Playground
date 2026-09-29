package com.lingq.shared.uimodel.language;

import com.android.installreferrer.api.InstallReferrerClient;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m13364d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\r\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000f¨\u0006\u0010"}, m13365d2 = {"Lcom/lingq/shared/uimodel/language/LanguageProgressSort;", "", "key", "", "(Ljava/lang/String;ILjava/lang/String;)V", "getKey", "()Ljava/lang/String;", "AllTime", "LastYear", "LastSixMonths", "LastThreeMonths", "LastMonth", "LastTwoWeeks", "LastWeek", "Yesterday", "Today", "shared_release"}, m13366k = 1, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK}, m13369xi = 48)
public enum LanguageProgressSort {
    AllTime("all_time"),
    LastYear("last_year"),
    LastSixMonths("last_six_months"),
    LastThreeMonths("last_two_months"),
    LastMonth("last_month"),
    LastTwoWeeks("last_two_weeks"),
    LastWeek("last_week"),
    Yesterday("yesterday"),
    Today("today");

    private final String key;

    LanguageProgressSort(String str) {
        this.key = str;
    }

    public final String getKey() {
        return this.key;
    }
}
