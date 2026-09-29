package com.lingq.feature.library.p013ui.components;

import com.lingq.feature.library.R$string;
import kotlin.enums.AbstractC3201a;
import p000.ys2;

/* JADX INFO: loaded from: classes2.dex */
public enum ReportScope {
    Offensive("offensive", R$string.report_offensive_content),
    AudioProblems("audioProblems", R$string.report_audio_problems),
    PoorTranscript("poorTranscript", R$string.report_poor_quality_transcript),
    Other("other", R$string.report_other);

    private static final /* synthetic */ ys2 $ENTRIES = AbstractC3201a.m15404a(values());
    private final String apiValue;
    private final int displayResId;

    ReportScope(String str, int i) {
        this.apiValue = str;
        this.displayResId = i;
    }

    public static ys2 getEntries() {
        return $ENTRIES;
    }

    public final String getApiValue() {
        return this.apiValue;
    }

    public final int getDisplayResId() {
        return this.displayResId;
    }
}
