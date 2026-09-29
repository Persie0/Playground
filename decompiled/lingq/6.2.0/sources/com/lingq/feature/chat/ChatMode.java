package com.lingq.feature.chat;

import kotlin.enums.AbstractC3201a;
import p000.rw0;
import p000.y52;
import p000.ys2;

/* JADX INFO: loaded from: classes2.dex */
public enum ChatMode {
    Standard(R$string.chat_mode_standard, R$string.chat_mode_standard_desc, false, "standard", 4, null),
    Plus(R$string.chat_mode_plus, R$string.chat_mode_plus_desc, true, "plus"),
    Tutor(R$string.chat_mode_tutor, R$string.chat_mode_tutor_desc, true, "tutor");

    private final int description;
    private final boolean isPlus;
    private final String serverId;
    private final int title;
    private static final /* synthetic */ ys2 $ENTRIES = AbstractC3201a.m15404a(values());
    public static final rw0 Companion = new rw0();

    /* synthetic */ ChatMode(int i, int i2, boolean z, String str, int i3, y52 y52Var) {
        this(i, i2, (i3 & 4) != 0 ? false : z, str);
    }

    public static ys2 getEntries() {
        return $ENTRIES;
    }

    public final int getDescription() {
        return this.description;
    }

    public final String getServerId() {
        return this.serverId;
    }

    public final int getTitle() {
        return this.title;
    }

    public final boolean isPlus() {
        return this.isPlus;
    }

    ChatMode(int i, int i2, boolean z, String str) {
        this.title = i;
        this.description = i2;
        this.isPlus = z;
        this.serverId = str;
    }
}
