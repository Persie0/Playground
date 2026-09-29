package com.lingq.core.database.entity;

import java.util.ArrayList;
import java.util.List;
import kotlin.AbstractC3192a;
import kotlin.LazyThreadSafetyMode;
import kotlin.collections.EmptyList;
import p000.cs4;
import p000.e5a;
import p000.ey8;
import p000.fa4;
import p000.hn1;
import p000.n3c;
import p000.ux5;
import p000.wq1;

/* JADX INFO: loaded from: classes2.dex */
@ey8
public final class TranslationSentenceEntity {
    public static final C1353o0 Companion = new C1353o0();

    /* JADX INFO: renamed from: h */
    public static final cs4[] f17473h;

    /* JADX INFO: renamed from: a */
    public final int f17474a;

    /* JADX INFO: renamed from: b */
    public final int f17475b;

    /* JADX INFO: renamed from: c */
    public final Double f17476c;

    /* JADX INFO: renamed from: d */
    public final Double f17477d;

    /* JADX INFO: renamed from: e */
    public final String f17478e;

    /* JADX INFO: renamed from: f */
    public final List f17479f;

    /* JADX INFO: renamed from: g */
    public final List f17480g;

    static {
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.PUBLICATION;
        f17473h = new cs4[]{null, null, null, null, null, AbstractC3192a.m15357b(lazyThreadSafetyMode, new e5a(3)), AbstractC3192a.m15357b(lazyThreadSafetyMode, new e5a(4))};
    }

    public /* synthetic */ TranslationSentenceEntity(int i, int i2, int i3, Double d, Double d2, String str, List list, List list2) {
        if (15 != (i & 15)) {
            n3c.m17204b(i, 15, TranslationSentenceEntity$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        this.f17474a = i2;
        this.f17475b = i3;
        this.f17476c = d;
        this.f17477d = d2;
        if ((i & 16) == 0) {
            this.f17478e = "";
        } else {
            this.f17478e = str;
        }
        int i4 = i & 32;
        EmptyList emptyList = EmptyList.f47638a;
        if (i4 == 0) {
            this.f17479f = emptyList;
        } else {
            this.f17479f = list;
        }
        if ((i & 64) == 0) {
            this.f17480g = emptyList;
        } else {
            this.f17480g = list2;
        }
    }

    /* JADX INFO: renamed from: a */
    public static TranslationSentenceEntity m7813a(TranslationSentenceEntity translationSentenceEntity, Double d, Double d2, String str, ArrayList arrayList, ArrayList arrayList2, int i) {
        int i2 = translationSentenceEntity.f17474a;
        int i3 = translationSentenceEntity.f17475b;
        if ((i & 4) != 0) {
            d = translationSentenceEntity.f17476c;
        }
        Double d3 = d;
        if ((i & 8) != 0) {
            d2 = translationSentenceEntity.f17477d;
        }
        Double d4 = d2;
        if ((i & 16) != 0) {
            str = translationSentenceEntity.f17478e;
        }
        String str2 = str;
        List list = arrayList;
        if ((i & 32) != 0) {
            list = translationSentenceEntity.f17479f;
        }
        List list2 = list;
        List list3 = arrayList2;
        if ((i & 64) != 0) {
            list3 = translationSentenceEntity.f17480g;
        }
        List list4 = list3;
        translationSentenceEntity.getClass();
        str2.getClass();
        list2.getClass();
        list4.getClass();
        return new TranslationSentenceEntity(i2, i3, d3, d4, str2, list2, list4);
    }

    /* JADX INFO: renamed from: b */
    public final Double m7814b() {
        return this.f17476c;
    }

    /* JADX INFO: renamed from: c */
    public final Double m7815c() {
        return this.f17477d;
    }

    /* JADX INFO: renamed from: d */
    public final int m7816d() {
        return this.f17474a;
    }

    /* JADX INFO: renamed from: e */
    public final int m7817e() {
        return this.f17475b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TranslationSentenceEntity)) {
            return false;
        }
        TranslationSentenceEntity translationSentenceEntity = (TranslationSentenceEntity) obj;
        return this.f17474a == translationSentenceEntity.f17474a && this.f17475b == translationSentenceEntity.f17475b && fa4.m11650l(this.f17476c, translationSentenceEntity.f17476c) && fa4.m11650l(this.f17477d, translationSentenceEntity.f17477d) && fa4.m11650l(this.f17478e, translationSentenceEntity.f17478e) && fa4.m11650l(this.f17479f, translationSentenceEntity.f17479f) && fa4.m11650l(this.f17480g, translationSentenceEntity.f17480g);
    }

    /* JADX INFO: renamed from: f */
    public final List m7818f() {
        return this.f17480g;
    }

    /* JADX INFO: renamed from: g */
    public final String m7819g() {
        return this.f17478e;
    }

    /* JADX INFO: renamed from: h */
    public final List m7820h() {
        return this.f17479f;
    }

    public final int hashCode() {
        int iM24106b = wq1.m24106b(this.f17475b, Integer.hashCode(this.f17474a) * 31, 31);
        Double d = this.f17476c;
        int iHashCode = (iM24106b + (d == null ? 0 : d.hashCode())) * 31;
        Double d2 = this.f17477d;
        return this.f17480g.hashCode() + ux5.m22979b(ux5.m22980c((iHashCode + (d2 != null ? d2.hashCode() : 0)) * 31, this.f17478e, 31), 31, this.f17479f);
    }

    public final String toString() {
        StringBuilder sbM22994q = ux5.m22994q(this.f17474a, this.f17475b, "TranslationSentenceEntity(index=", ", lessonId=", ", audio=");
        sbM22994q.append(this.f17476c);
        sbM22994q.append(", audioEnd=");
        sbM22994q.append(this.f17477d);
        sbM22994q.append(", text=");
        hn1.m13366p(this.f17478e, ", translations=", ", notes=", sbM22994q, this.f17479f);
        return hn1.m13356f(sbM22994q, this.f17480g, ")");
    }

    public TranslationSentenceEntity(int i, int i2, Double d, Double d2, String str, List list, List list2) {
        str.getClass();
        list.getClass();
        list2.getClass();
        this.f17474a = i;
        this.f17475b = i2;
        this.f17476c = d;
        this.f17477d = d2;
        this.f17478e = str;
        this.f17479f = list;
        this.f17480g = list2;
    }

    public /* synthetic */ TranslationSentenceEntity(int i, int i2, Double d, Double d2, String str, List list) {
        this(i, i2, d, d2, str, list, EmptyList.f47638a);
    }
}
