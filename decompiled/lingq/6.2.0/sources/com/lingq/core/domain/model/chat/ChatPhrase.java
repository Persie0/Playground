package com.lingq.core.domain.model.chat;

import java.util.List;
import kotlin.AbstractC3192a;
import kotlin.LazyThreadSafetyMode;
import kotlin.collections.EmptyList;
import p000.C3072he;
import p000.cs4;
import p000.ey8;
import p000.fa4;
import p000.hn1;
import p000.n3c;
import p000.ux5;
import p000.wq1;

/* JADX INFO: loaded from: classes2.dex */
@ey8
public final class ChatPhrase {
    public static final C1405f Companion = new C1405f();

    /* JADX INFO: renamed from: g */
    public static final cs4[] f18936g = {null, null, null, null, null, AbstractC3192a.m15357b(LazyThreadSafetyMode.PUBLICATION, new C3072he(20))};

    /* JADX INFO: renamed from: a */
    public final String f18937a;

    /* JADX INFO: renamed from: b */
    public final String f18938b;

    /* JADX INFO: renamed from: c */
    public final int f18939c;

    /* JADX INFO: renamed from: d */
    public final String f18940d;

    /* JADX INFO: renamed from: e */
    public final ChatPhraseCard f18941e;

    /* JADX INFO: renamed from: f */
    public final List f18942f;

    public /* synthetic */ ChatPhrase(int i, String str, String str2, int i2, String str3, ChatPhraseCard chatPhraseCard, List list) {
        if (15 != (i & 15)) {
            n3c.m17204b(i, 15, ChatPhrase$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        this.f18937a = str;
        this.f18938b = str2;
        this.f18939c = i2;
        this.f18940d = str3;
        if ((i & 16) == 0) {
            this.f18941e = null;
        } else {
            this.f18941e = chatPhraseCard;
        }
        if ((i & 32) == 0) {
            this.f18942f = EmptyList.f47638a;
        } else {
            this.f18942f = list;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ChatPhrase)) {
            return false;
        }
        ChatPhrase chatPhrase = (ChatPhrase) obj;
        return fa4.m11650l(this.f18937a, chatPhrase.f18937a) && fa4.m11650l(this.f18938b, chatPhrase.f18938b) && this.f18939c == chatPhrase.f18939c && fa4.m11650l(this.f18940d, chatPhrase.f18940d) && fa4.m11650l(this.f18941e, chatPhrase.f18941e) && fa4.m11650l(this.f18942f, chatPhrase.f18942f);
    }

    public final int hashCode() {
        int iM22980c = ux5.m22980c(wq1.m24106b(this.f18939c, ux5.m22980c(this.f18937a.hashCode() * 31, this.f18938b, 31), 31), this.f18940d, 31);
        ChatPhraseCard chatPhraseCard = this.f18941e;
        return this.f18942f.hashCode() + ((iM22980c + (chatPhraseCard == null ? 0 : chatPhraseCard.hashCode())) * 31);
    }

    public final String toString() {
        StringBuilder sbM23000w = ux5.m23000w("ChatPhrase(phrase=", this.f18937a, ", translation=", this.f18938b, ", status=");
        hn1.m13361k(this.f18939c, ", fragment=", this.f18940d, ", card=", sbM23000w);
        sbM23000w.append(this.f18941e);
        sbM23000w.append(", hints=");
        sbM23000w.append(this.f18942f);
        sbM23000w.append(")");
        return sbM23000w.toString();
    }

    public ChatPhrase(String str, String str2, int i, String str3, ChatPhraseCard chatPhraseCard, List list) {
        ux5.m22974A(str, str2, str3);
        this.f18937a = str;
        this.f18938b = str2;
        this.f18939c = i;
        this.f18940d = str3;
        this.f18941e = chatPhraseCard;
        this.f18942f = list;
    }
}
