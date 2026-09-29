package com.lingq.core.domain.model.audio;

import kotlin.enums.AbstractC3201a;
import p000.ys2;

/* JADX INFO: loaded from: classes3.dex */
public enum AudioFetchErrorType {
    NoVoiceAvailable,
    TtsApiFailed,
    TtsTimeout,
    DownloadFailed,
    NetworkError,
    WrongVoice;

    private static final /* synthetic */ ys2 $ENTRIES = AbstractC3201a.m15404a(values());

    public static ys2 getEntries() {
        return $ENTRIES;
    }
}
