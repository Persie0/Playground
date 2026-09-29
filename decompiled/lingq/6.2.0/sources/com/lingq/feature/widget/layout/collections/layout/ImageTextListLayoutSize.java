package com.lingq.feature.widget.layout.collections.layout;

import kotlin.enums.AbstractC3201a;
import p000.ys2;

/* JADX INFO: loaded from: classes3.dex */
enum ImageTextListLayoutSize {
    Small(260.0f),
    Medium(479.0f),
    Large(644.0f);

    private final float maxWidth;
    private static final /* synthetic */ ys2 $ENTRIES = AbstractC3201a.m15404a(values());
    public static final C2869e Companion = new C2869e();

    ImageTextListLayoutSize(float f) {
        this.maxWidth = f;
    }

    public static ys2 getEntries() {
        return $ENTRIES;
    }

    /* JADX INFO: renamed from: getMaxWidth-D9Ej5fM, reason: not valid java name */
    public final float m25920getMaxWidthD9Ej5fM() {
        return this.maxWidth;
    }
}
