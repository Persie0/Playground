package com.lingq.core.network.api.result;

import p000.ey8;
import p000.fa4;
import p000.wq1;

/* JADX INFO: loaded from: classes.dex */
@ey8
public final class ResultChatBotLabel {
    public static final C1643e0 Companion = new C1643e0();

    /* JADX INFO: renamed from: a */
    public final String f20698a;

    public /* synthetic */ ResultChatBotLabel(int i, String str) {
        if ((i & 1) == 0) {
            this.f20698a = "";
        } else {
            this.f20698a = str;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ResultChatBotLabel) && fa4.m11650l(this.f20698a, ((ResultChatBotLabel) obj).f20698a);
    }

    public final int hashCode() {
        return this.f20698a.hashCode();
    }

    public final String toString() {
        return wq1.m24118n("ResultChatBotLabel(title=", this.f20698a, ")");
    }

    public ResultChatBotLabel() {
        this.f20698a = "";
    }
}
