package com.lingq.core.settings.theme;

import com.lingq.core.p012ui.R$string;
import kotlin.enums.AbstractC3201a;
import p000.ys2;

/* JADX INFO: loaded from: classes2.dex */
public enum ThemeSettingsTab {
    Theme(R$string.settings_theme),
    Font(R$string.settings_text_font),
    Reading(R$string.settings_reading),
    Script(R$string.settings_text_asian_script);

    private static final /* synthetic */ ys2 $ENTRIES = AbstractC3201a.m15404a(values());
    private final int titleRes;

    ThemeSettingsTab(int i) {
        this.titleRes = i;
    }

    public static ys2 getEntries() {
        return $ENTRIES;
    }

    public final int getTitleRes() {
        return this.titleRes;
    }
}
