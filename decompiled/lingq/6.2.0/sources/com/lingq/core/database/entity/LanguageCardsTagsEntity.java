package com.lingq.core.database.entity;

import java.util.List;
import kotlin.AbstractC3192a;
import kotlin.LazyThreadSafetyMode;
import kotlin.collections.EmptyList;
import p000.cs4;
import p000.ey8;
import p000.fa4;
import p000.n3c;
import p000.wf1;

/* JADX INFO: loaded from: classes2.dex */
@ey8
public final class LanguageCardsTagsEntity {
    public static final C1344k Companion = new C1344k();

    /* JADX INFO: renamed from: c */
    public static final cs4[] f17145c = {null, AbstractC3192a.m15357b(LazyThreadSafetyMode.PUBLICATION, new wf1(17))};

    /* JADX INFO: renamed from: a */
    public final String f17146a;

    /* JADX INFO: renamed from: b */
    public final List f17147b;

    public /* synthetic */ LanguageCardsTagsEntity(int i, String str, List list) {
        if (1 != (i & 1)) {
            n3c.m17204b(i, 1, LanguageCardsTagsEntity$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        this.f17146a = str;
        if ((i & 2) == 0) {
            this.f17147b = EmptyList.f47638a;
        } else {
            this.f17147b = list;
        }
    }

    /* JADX INFO: renamed from: a */
    public final String m7593a() {
        return this.f17146a;
    }

    /* JADX INFO: renamed from: b */
    public final List m7594b() {
        return this.f17147b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LanguageCardsTagsEntity)) {
            return false;
        }
        LanguageCardsTagsEntity languageCardsTagsEntity = (LanguageCardsTagsEntity) obj;
        return fa4.m11650l(this.f17146a, languageCardsTagsEntity.f17146a) && fa4.m11650l(this.f17147b, languageCardsTagsEntity.f17147b);
    }

    public final int hashCode() {
        return this.f17147b.hashCode() + (this.f17146a.hashCode() * 31);
    }

    public final String toString() {
        return "LanguageCardsTagsEntity(code=" + this.f17146a + ", tags=" + this.f17147b + ")";
    }

    public LanguageCardsTagsEntity(String str, List list) {
        str.getClass();
        this.f17146a = str;
        this.f17147b = list;
    }
}
