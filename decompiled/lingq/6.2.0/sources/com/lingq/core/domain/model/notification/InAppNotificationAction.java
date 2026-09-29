package com.lingq.core.domain.model.notification;

import kotlin.enums.AbstractC3201a;
import p000.ys2;

/* JADX INFO: loaded from: classes2.dex */
public enum InAppNotificationAction {
    Yes("ui_yes"),
    No("ui_no"),
    AdjustSettings("notification_adjust_settings"),
    Reload("ui_reload_lesson"),
    Close("ui_close"),
    Understood("ui_action_understood");

    private static final /* synthetic */ ys2 $ENTRIES = AbstractC3201a.m15404a(values());
    private final String titleKey;

    InAppNotificationAction(String str) {
        this.titleKey = str;
    }

    public static ys2 getEntries() {
        return $ENTRIES;
    }

    public final String getTitleKey() {
        return this.titleKey;
    }
}
