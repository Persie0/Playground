package com.lingq.core.player.video;

import com.pierfrancescosoffritti.androidyoutubeplayer.core.player.PlayerConstants$PlayerState;

/* JADX INFO: renamed from: com.lingq.core.player.video.a */
/* JADX INFO: loaded from: classes2.dex */
public abstract /* synthetic */ class AbstractC1820a {

    /* JADX INFO: renamed from: a */
    public static final /* synthetic */ int[] f22191a;

    /* JADX INFO: renamed from: b */
    public static final /* synthetic */ int[] f22192b;

    static {
        int[] iArr = new int[PlayerConstants$PlayerState.values().length];
        try {
            iArr[PlayerConstants$PlayerState.PLAYING.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[PlayerConstants$PlayerState.PAUSED.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[PlayerConstants$PlayerState.ENDED.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[PlayerConstants$PlayerState.UNSTARTED.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr[PlayerConstants$PlayerState.VIDEO_CUED.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
        f22191a = iArr;
        int[] iArr2 = new int[YoutubePlaybackRateRestoration$State.values().length];
        try {
            iArr2[YoutubePlaybackRateRestoration$State.RESTORE_ON_PLAYBACK.ordinal()] = 1;
        } catch (NoSuchFieldError unused6) {
        }
        try {
            iArr2[YoutubePlaybackRateRestoration$State.WAITING_FOR_BASELINE_RATE.ordinal()] = 2;
        } catch (NoSuchFieldError unused7) {
        }
        try {
            iArr2[YoutubePlaybackRateRestoration$State.WAITING_FOR_TARGET_RATE.ordinal()] = 3;
        } catch (NoSuchFieldError unused8) {
        }
        try {
            iArr2[YoutubePlaybackRateRestoration$State.IDLE.ordinal()] = 4;
        } catch (NoSuchFieldError unused9) {
        }
        f22192b = iArr2;
    }
}
