package com.lingq.shared.uimodel.vocabulary;

import com.android.installreferrer.api.InstallReferrerClient;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m13364d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\u000e\b\u0086\u0001\u0018\u0000 \t2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\nB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0007\u0010\bR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000f¨\u0006\u0010"}, m13365d2 = {"Lcom/lingq/shared/uimodel/vocabulary/VocabularySearch;", "", "", "columnName", "Ljava/lang/String;", "getColumnName", "()Ljava/lang/String;", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "Companion", "a", "StartsWith", "EndsWith", "Contains", "PhraseContaining", "MeaningContaining", "shared_release"}, m13366k = 1, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
public enum VocabularySearch {
    StartsWith("startsWith"),
    EndsWith("endsWith"),
    Contains("contains"),
    PhraseContaining("phraseContaining"),
    MeaningContaining("hintsContaining");


    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion();
    private final String columnName;

    /* JADX INFO: renamed from: com.lingq.shared.uimodel.vocabulary.VocabularySearch$a, reason: from kotlin metadata */
    public static final class Companion {
    }

    VocabularySearch(String str) {
        this.columnName = str;
    }

    public final String getColumnName() {
        return this.columnName;
    }
}
