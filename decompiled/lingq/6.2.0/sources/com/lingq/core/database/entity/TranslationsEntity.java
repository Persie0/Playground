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
import p000.n3c;

/* JADX INFO: loaded from: classes2.dex */
@ey8
public final class TranslationsEntity {
    public static final C1355p0 Companion = new C1355p0();

    /* JADX INFO: renamed from: c */
    public static final cs4[] f17481c = {null, AbstractC3192a.m15357b(LazyThreadSafetyMode.PUBLICATION, new e5a(5))};

    /* JADX INFO: renamed from: a */
    public final String f17482a;

    /* JADX INFO: renamed from: b */
    public final List f17483b;

    public /* synthetic */ TranslationsEntity(int i, String str, List list) {
        if (1 != (i & 1)) {
            n3c.m17204b(i, 1, TranslationsEntity$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        this.f17482a = str;
        if ((i & 2) == 0) {
            this.f17483b = EmptyList.f47638a;
        } else {
            this.f17483b = list;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TranslationsEntity)) {
            return false;
        }
        TranslationsEntity translationsEntity = (TranslationsEntity) obj;
        return fa4.m11650l(this.f17482a, translationsEntity.f17482a) && fa4.m11650l(this.f17483b, translationsEntity.f17483b);
    }

    public final int hashCode() {
        return this.f17483b.hashCode() + (this.f17482a.hashCode() * 31);
    }

    public final String toString() {
        return "TranslationsEntity(termWithLanguageAndTarget=" + this.f17482a + ", translations=" + this.f17483b + ")";
    }

    public TranslationsEntity(String str, ArrayList arrayList) {
        this.f17482a = str;
        this.f17483b = arrayList;
    }
}
