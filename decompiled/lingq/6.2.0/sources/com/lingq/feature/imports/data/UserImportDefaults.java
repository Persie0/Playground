package com.lingq.feature.imports.data;

import com.lingq.core.domain.model.LearningLevel;
import kotlin.enums.AbstractC3201a;
import p000.ys2;

/* JADX INFO: loaded from: classes3.dex */
public enum UserImportDefaults {
    Course("Quick Imports"),
    Level(LearningLevel.Beginner1.getServerName()),
    Source("URL");

    private static final /* synthetic */ ys2 $ENTRIES = AbstractC3201a.m15404a(values());

    /* JADX INFO: renamed from: default, reason: not valid java name */
    private final String f72439default;

    UserImportDefaults(String str) {
        this.f72439default = str;
    }

    public static ys2 getEntries() {
        return $ENTRIES;
    }

    public final String getDefault() {
        return this.f72439default;
    }
}
