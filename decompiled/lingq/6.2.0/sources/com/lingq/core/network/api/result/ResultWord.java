package com.lingq.core.network.api.result;

import java.util.List;
import kotlin.AbstractC3192a;
import kotlin.LazyThreadSafetyMode;
import kotlin.collections.EmptyList;
import p000.AbstractC3393o1;
import p000.cs4;
import p000.ey8;
import p000.fa4;
import p000.g98;
import p000.g9a;
import p000.ux5;
import p000.wq1;

/* JADX INFO: loaded from: classes2.dex */
@ey8
public final class ResultWord {
    public static final C1794z4 Companion = new C1794z4();

    /* JADX INFO: renamed from: j */
    public static final cs4[] f21724j;

    /* JADX INFO: renamed from: a */
    public final String f21725a;

    /* JADX INFO: renamed from: b */
    public final int f21726b;

    /* JADX INFO: renamed from: c */
    public final String f21727c;

    /* JADX INFO: renamed from: d */
    public final int f21728d;

    /* JADX INFO: renamed from: e */
    public final boolean f21729e;

    /* JADX INFO: renamed from: f */
    public final List f21730f;

    /* JADX INFO: renamed from: g */
    public final List f21731g;

    /* JADX INFO: renamed from: h */
    public final int f21732h;

    /* JADX INFO: renamed from: i */
    public final ResultTokenReadings f21733i;

    static {
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.PUBLICATION;
        f21724j = new cs4[]{null, null, null, null, null, AbstractC3192a.m15357b(lazyThreadSafetyMode, new g98(24)), AbstractC3192a.m15357b(lazyThreadSafetyMode, new g98(25)), null, null};
    }

    public /* synthetic */ ResultWord(int i, String str, int i2, String str2, int i3, boolean z, List list, List list2, int i4, ResultTokenReadings resultTokenReadings) {
        if ((i & 1) == 0) {
            this.f21725a = null;
        } else {
            this.f21725a = str;
        }
        if ((i & 2) == 0) {
            this.f21726b = 0;
        } else {
            this.f21726b = i2;
        }
        if ((i & 4) == 0) {
            this.f21727c = null;
        } else {
            this.f21727c = str2;
        }
        if ((i & 8) == 0) {
            this.f21728d = 0;
        } else {
            this.f21728d = i3;
        }
        if ((i & 16) == 0) {
            this.f21729e = false;
        } else {
            this.f21729e = z;
        }
        int i5 = i & 32;
        EmptyList emptyList = EmptyList.f47638a;
        if (i5 == 0) {
            this.f21730f = emptyList;
        } else {
            this.f21730f = list;
        }
        if ((i & 64) == 0) {
            this.f21731g = emptyList;
        } else {
            this.f21731g = list2;
        }
        if ((i & 128) == 0) {
            this.f21732h = 0;
        } else {
            this.f21732h = i4;
        }
        if ((i & 256) == 0) {
            this.f21733i = null;
        } else {
            this.f21733i = resultTokenReadings;
        }
    }

    /* JADX INFO: renamed from: a */
    public final String m8402a() {
        return this.f21725a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ResultWord)) {
            return false;
        }
        ResultWord resultWord = (ResultWord) obj;
        return fa4.m11650l(this.f21725a, resultWord.f21725a) && this.f21726b == resultWord.f21726b && fa4.m11650l(this.f21727c, resultWord.f21727c) && this.f21728d == resultWord.f21728d && this.f21729e == resultWord.f21729e && fa4.m11650l(this.f21730f, resultWord.f21730f) && fa4.m11650l(this.f21731g, resultWord.f21731g) && this.f21732h == resultWord.f21732h && fa4.m11650l(this.f21733i, resultWord.f21733i);
    }

    public final int hashCode() {
        String str = this.f21725a;
        int iM24106b = wq1.m24106b(this.f21726b, (str == null ? 0 : str.hashCode()) * 31, 31);
        String str2 = this.f21727c;
        int iM24106b2 = wq1.m24106b(this.f21732h, ux5.m22979b(ux5.m22979b(g9a.m12428e(wq1.m24106b(this.f21728d, (iM24106b + (str2 == null ? 0 : str2.hashCode())) * 31, 31), 31, this.f21729e), 31, this.f21730f), 31, this.f21731g), 31);
        ResultTokenReadings resultTokenReadings = this.f21733i;
        return iM24106b2 + (resultTokenReadings != null ? resultTokenReadings.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbM17741p = AbstractC3393o1.m17741p(this.f21726b, "ResultWord(text=", this.f21725a, ", id=", ", status=");
        AbstractC3393o1.m17748w(this.f21728d, this.f21727c, ", importance=", ", isPhrase=", sbM17741p);
        sbM17741p.append(this.f21729e);
        sbM17741p.append(", meanings=");
        sbM17741p.append(this.f21730f);
        sbM17741p.append(", tags=");
        sbM17741p.append(this.f21731g);
        sbM17741p.append(", cardId=");
        sbM17741p.append(this.f21732h);
        sbM17741p.append(", readings=");
        sbM17741p.append(this.f21733i);
        sbM17741p.append(")");
        return sbM17741p.toString();
    }

    public ResultWord(String str, int i, String str2, int i2, boolean z, List list, List list2, int i3, ResultTokenReadings resultTokenReadings) {
        list.getClass();
        list2.getClass();
        this.f21725a = str;
        this.f21726b = i;
        this.f21727c = str2;
        this.f21728d = i2;
        this.f21729e = z;
        this.f21730f = list;
        this.f21731g = list2;
        this.f21732h = i3;
        this.f21733i = resultTokenReadings;
    }
}
