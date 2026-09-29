package com.lingq.core.domain.model.reader;

import kotlin.enums.AbstractC3201a;
import p000.dy7;
import p000.ys2;

/* JADX INFO: loaded from: classes2.dex */
public enum ReaderPageMode {
    Standard("standard"),
    Wide("wide"),
    TwoPage("twopage");


    /* JADX INFO: renamed from: id */
    private final String f19559id;
    private static final /* synthetic */ ys2 $ENTRIES = AbstractC3201a.m15404a(values());
    public static final dy7 Companion = new dy7();

    ReaderPageMode(String str) {
        this.f19559id = str;
    }

    public static ys2 getEntries() {
        return $ENTRIES;
    }

    public final String getId() {
        return this.f19559id;
    }
}
