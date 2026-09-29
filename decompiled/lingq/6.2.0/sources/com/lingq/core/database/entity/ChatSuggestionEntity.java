package com.lingq.core.database.entity;

import p000.AbstractC3393o1;
import p000.ey8;
import p000.fa4;
import p000.hn1;
import p000.n3c;
import p000.ux5;
import p000.wq1;

/* JADX INFO: loaded from: classes.dex */
@ey8
public final class ChatSuggestionEntity {
    public static final C1336g Companion = new C1336g();

    /* JADX INFO: renamed from: a */
    public final String f17120a;

    /* JADX INFO: renamed from: b */
    public final int f17121b;

    /* JADX INFO: renamed from: c */
    public final int f17122c;

    /* JADX INFO: renamed from: d */
    public final String f17123d;

    /* JADX INFO: renamed from: e */
    public final String f17124e;

    public /* synthetic */ ChatSuggestionEntity(int i, int i2, int i3, String str, String str2, String str3) {
        if (31 != (i & 31)) {
            n3c.m17204b(i, 31, ChatSuggestionEntity$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        this.f17120a = str;
        this.f17121b = i2;
        this.f17122c = i3;
        this.f17123d = str2;
        this.f17124e = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ChatSuggestionEntity)) {
            return false;
        }
        ChatSuggestionEntity chatSuggestionEntity = (ChatSuggestionEntity) obj;
        return fa4.m11650l(this.f17120a, chatSuggestionEntity.f17120a) && this.f17121b == chatSuggestionEntity.f17121b && this.f17122c == chatSuggestionEntity.f17122c && fa4.m11650l(this.f17123d, chatSuggestionEntity.f17123d) && fa4.m11650l(this.f17124e, chatSuggestionEntity.f17124e);
    }

    public final int hashCode() {
        return this.f17124e.hashCode() + ux5.m22980c(wq1.m24106b(this.f17122c, wq1.m24106b(this.f17121b, this.f17120a.hashCode() * 31, 31), 31), this.f17123d, 31);
    }

    public final String toString() {
        StringBuilder sbM17741p = AbstractC3393o1.m17741p(this.f17121b, "ChatSuggestionEntity(language=", this.f17120a, ", chatId=", ", position=");
        hn1.m13361k(this.f17122c, ", source=", this.f17123d, ", target=", sbM17741p);
        return AbstractC3393o1.m17738m(sbM17741p, this.f17124e, ")");
    }

    public ChatSuggestionEntity(int i, int i2, String str, String str2, String str3) {
        ux5.m22974A(str, str2, str3);
        this.f17120a = str;
        this.f17121b = i;
        this.f17122c = i2;
        this.f17123d = str2;
        this.f17124e = str3;
    }
}
