package com.lingq.core.domain.model.chat;

import p000.ey8;
import p000.fa4;
import p000.n3c;
import p000.ux5;
import p000.wq1;

/* JADX INFO: loaded from: classes2.dex */
@ey8
public final class ChatHistoryOld {
    public static final C1401b Companion = new C1401b();

    /* JADX INFO: renamed from: a */
    public final int f18915a;

    /* JADX INFO: renamed from: b */
    public final String f18916b;

    /* JADX INFO: renamed from: c */
    public final String f18917c;

    /* JADX INFO: renamed from: d */
    public final String f18918d;

    public /* synthetic */ ChatHistoryOld(int i, int i2, String str, String str2, String str3) {
        if (15 != (i & 15)) {
            n3c.m17204b(i, 15, ChatHistoryOld$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        this.f18915a = i2;
        this.f18916b = str;
        this.f18917c = str2;
        this.f18918d = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ChatHistoryOld)) {
            return false;
        }
        ChatHistoryOld chatHistoryOld = (ChatHistoryOld) obj;
        return this.f18915a == chatHistoryOld.f18915a && fa4.m11650l(this.f18916b, chatHistoryOld.f18916b) && fa4.m11650l(this.f18917c, chatHistoryOld.f18917c) && fa4.m11650l(this.f18918d, chatHistoryOld.f18918d);
    }

    public final int hashCode() {
        return this.f18918d.hashCode() + ux5.m22980c(ux5.m22980c(Integer.hashCode(this.f18915a) * 31, this.f18916b, 31), this.f18917c, 31);
    }

    public final String toString() {
        return wq1.m24125u(ux5.m22995r(this.f18915a, "ChatHistoryOld(id=", ", title=", this.f18916b, ", image="), this.f18917c, ", startedAt=", this.f18918d, ")");
    }

    public ChatHistoryOld(String str, int i, String str2, String str3) {
        ux5.m22974A(str, str2, str3);
        this.f18915a = i;
        this.f18916b = str;
        this.f18917c = str2;
        this.f18918d = str3;
    }
}
