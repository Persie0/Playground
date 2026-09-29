package com.lingq.core.player.video;

import kotlin.enums.AbstractC3201a;
import p000.ys2;

/* JADX INFO: loaded from: classes2.dex */
enum YoutubePlaybackRateRestoration$State {
    IDLE,
    RESTORE_ON_PLAYBACK,
    WAITING_FOR_BASELINE_RATE,
    WAITING_FOR_TARGET_RATE;

    private static final /* synthetic */ ys2 $ENTRIES = AbstractC3201a.m15404a(values());

    public static ys2 getEntries() {
        return $ENTRIES;
    }
}
