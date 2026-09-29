package com.lingq.core.database.entity;

import java.util.ArrayList;
import java.util.List;
import kotlin.AbstractC3192a;
import kotlin.LazyThreadSafetyMode;
import kotlin.collections.EmptyList;
import p000.AbstractC3393o1;
import p000.C3072he;
import p000.cs4;
import p000.ey8;
import p000.fa4;
import p000.g9a;
import p000.n3c;
import p000.ux5;
import p000.wq1;

/* JADX INFO: loaded from: classes2.dex */
@ey8
public final class ChatSentenceEntity {
    public static final C1332e Companion = new C1332e();

    /* JADX INFO: renamed from: k */
    public static final cs4[] f17102k;

    /* JADX INFO: renamed from: a */
    public final int f17103a;

    /* JADX INFO: renamed from: b */
    public final int f17104b;

    /* JADX INFO: renamed from: c */
    public final int f17105c;

    /* JADX INFO: renamed from: d */
    public final List f17106d;

    /* JADX INFO: renamed from: e */
    public final String f17107e;

    /* JADX INFO: renamed from: f */
    public final String f17108f;

    /* JADX INFO: renamed from: g */
    public final List f17109g;

    /* JADX INFO: renamed from: h */
    public final boolean f17110h;

    /* JADX INFO: renamed from: i */
    public final String f17111i;

    /* JADX INFO: renamed from: j */
    public final String f17112j;

    static {
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.PUBLICATION;
        f17102k = new cs4[]{null, null, null, AbstractC3192a.m15357b(lazyThreadSafetyMode, new C3072he(24)), null, null, AbstractC3192a.m15357b(lazyThreadSafetyMode, new C3072he(25)), null, null, null};
    }

    public /* synthetic */ ChatSentenceEntity(int i, int i2, int i3, int i4, List list, String str, String str2, List list2, boolean z, String str3, String str4) {
        if (55 != (i & 55)) {
            n3c.m17204b(i, 55, ChatSentenceEntity$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        this.f17103a = i2;
        this.f17104b = i3;
        this.f17105c = i4;
        int i5 = i & 8;
        EmptyList emptyList = EmptyList.f47638a;
        if (i5 == 0) {
            this.f17106d = emptyList;
        } else {
            this.f17106d = list;
        }
        this.f17107e = str;
        this.f17108f = str2;
        if ((i & 64) == 0) {
            this.f17109g = emptyList;
        } else {
            this.f17109g = list2;
        }
        if ((i & 128) == 0) {
            this.f17110h = false;
        } else {
            this.f17110h = z;
        }
        if ((i & 256) == 0) {
            this.f17111i = null;
        } else {
            this.f17111i = str3;
        }
        if ((i & 512) == 0) {
            this.f17112j = null;
        } else {
            this.f17112j = str4;
        }
    }

    /* JADX INFO: renamed from: a */
    public final int m7568a() {
        return this.f17103a;
    }

    /* JADX INFO: renamed from: b */
    public final int m7569b() {
        return this.f17105c;
    }

    /* JADX INFO: renamed from: c */
    public final int m7570c() {
        return this.f17104b;
    }

    /* JADX INFO: renamed from: d */
    public final String m7571d() {
        return this.f17108f;
    }

    /* JADX INFO: renamed from: e */
    public final String m7572e() {
        return this.f17112j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ChatSentenceEntity)) {
            return false;
        }
        ChatSentenceEntity chatSentenceEntity = (ChatSentenceEntity) obj;
        return this.f17103a == chatSentenceEntity.f17103a && this.f17104b == chatSentenceEntity.f17104b && this.f17105c == chatSentenceEntity.f17105c && fa4.m11650l(this.f17106d, chatSentenceEntity.f17106d) && fa4.m11650l(this.f17107e, chatSentenceEntity.f17107e) && fa4.m11650l(this.f17108f, chatSentenceEntity.f17108f) && fa4.m11650l(this.f17109g, chatSentenceEntity.f17109g) && this.f17110h == chatSentenceEntity.f17110h && fa4.m11650l(this.f17111i, chatSentenceEntity.f17111i) && fa4.m11650l(this.f17112j, chatSentenceEntity.f17112j);
    }

    /* JADX INFO: renamed from: f */
    public final boolean m7573f() {
        return this.f17110h;
    }

    /* JADX INFO: renamed from: g */
    public final String m7574g() {
        return this.f17107e;
    }

    /* JADX INFO: renamed from: h */
    public final List m7575h() {
        return this.f17109g;
    }

    public final int hashCode() {
        int iM22979b = ux5.m22979b(wq1.m24106b(this.f17105c, wq1.m24106b(this.f17104b, Integer.hashCode(this.f17103a) * 31, 31), 31), 31, this.f17106d);
        String str = this.f17107e;
        int iHashCode = (iM22979b + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f17108f;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        List list = this.f17109g;
        int iM12428e = g9a.m12428e((iHashCode2 + (list == null ? 0 : list.hashCode())) * 31, 31, this.f17110h);
        String str3 = this.f17111i;
        int iHashCode3 = (iM12428e + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.f17112j;
        return iHashCode3 + (str4 != null ? str4.hashCode() : 0);
    }

    /* JADX INFO: renamed from: i */
    public final List m7576i() {
        return this.f17106d;
    }

    /* JADX INFO: renamed from: j */
    public final String m7577j() {
        return this.f17111i;
    }

    public final String toString() {
        StringBuilder sbM22994q = ux5.m22994q(this.f17103a, this.f17104b, "ChatSentenceEntity(chatId=", ", messageIndex=", ", index=");
        sbM22994q.append(this.f17105c);
        sbM22994q.append(", tokens=");
        sbM22994q.append(this.f17106d);
        sbM22994q.append(", text=");
        AbstractC3393o1.m17725C(sbM22994q, this.f17107e, ", normalizedText=", this.f17108f, ", timestamp=");
        sbM22994q.append(this.f17109g);
        sbM22994q.append(", startParagraph=");
        sbM22994q.append(this.f17110h);
        sbM22994q.append(", url=");
        return wq1.m24125u(sbM22994q, this.f17111i, ", opentag=", this.f17112j, ")");
    }

    public ChatSentenceEntity(int i, int i2, int i3, ArrayList arrayList, String str, String str2, ArrayList arrayList2, boolean z, String str3, String str4) {
        this.f17103a = i;
        this.f17104b = i2;
        this.f17105c = i3;
        this.f17106d = arrayList;
        this.f17107e = str;
        this.f17108f = str2;
        this.f17109g = arrayList2;
        this.f17110h = z;
        this.f17111i = str3;
        this.f17112j = str4;
    }
}
