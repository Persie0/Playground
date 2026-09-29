package com.pierfrancescosoffritti.androidyoutubeplayer.core.player;

import kotlin.enums.AbstractC3201a;
import p000.ys2;

/* JADX INFO: loaded from: classes3.dex */
public enum PlayerConstants$PlayerError {
    UNKNOWN,
    INVALID_PARAMETER_IN_REQUEST,
    HTML_5_PLAYER,
    VIDEO_NOT_FOUND,
    VIDEO_NOT_PLAYABLE_IN_EMBEDDED_PLAYER,
    REQUEST_MISSING_HTTP_REFERER;

    private static final /* synthetic */ ys2 $ENTRIES = AbstractC3201a.m15404a(values());

    public static ys2 getEntries() {
        return $ENTRIES;
    }
}
