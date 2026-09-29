package com.lingq.core.database.entity;

import p000.AbstractC3393o1;
import p000.ey8;
import p000.fa4;
import p000.g9a;
import p000.hn1;
import p000.n3c;
import p000.ux5;
import p000.wq1;

/* JADX INFO: loaded from: classes.dex */
@ey8
public final class DictionaryDataEntity {
    public static final C1342j Companion = new C1342j();

    /* JADX INFO: renamed from: a */
    public final int f17132a;

    /* JADX INFO: renamed from: b */
    public final String f17133b;

    /* JADX INFO: renamed from: c */
    public final int f17134c;

    /* JADX INFO: renamed from: d */
    public final String f17135d;

    /* JADX INFO: renamed from: e */
    public final String f17136e;

    /* JADX INFO: renamed from: f */
    public final boolean f17137f;

    /* JADX INFO: renamed from: g */
    public final String f17138g;

    /* JADX INFO: renamed from: h */
    public final String f17139h;

    /* JADX INFO: renamed from: i */
    public final String f17140i;

    /* JADX INFO: renamed from: j */
    public final String f17141j;

    /* JADX INFO: renamed from: k */
    public final String f17142k;

    /* JADX INFO: renamed from: l */
    public final String f17143l;

    /* JADX INFO: renamed from: m */
    public final String f17144m;

    public /* synthetic */ DictionaryDataEntity(int i, int i2, String str, int i3, String str2, String str3, boolean z, String str4, String str5, String str6, String str7, String str8, String str9, String str10) {
        if (8159 != (i & 8159)) {
            n3c.m17204b(i, 8159, DictionaryDataEntity$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        this.f17132a = i2;
        this.f17133b = str;
        this.f17134c = i3;
        this.f17135d = str2;
        this.f17136e = str3;
        if ((i & 32) == 0) {
            this.f17137f = false;
        } else {
            this.f17137f = z;
        }
        this.f17138g = str4;
        this.f17139h = str5;
        this.f17140i = str6;
        this.f17141j = str7;
        this.f17142k = str8;
        this.f17143l = str9;
        this.f17144m = str10;
    }

    /* JADX INFO: renamed from: a */
    public static DictionaryDataEntity m7592a(DictionaryDataEntity dictionaryDataEntity, int i) {
        int i2 = dictionaryDataEntity.f17132a;
        String str = dictionaryDataEntity.f17133b;
        String str2 = dictionaryDataEntity.f17135d;
        String str3 = dictionaryDataEntity.f17136e;
        boolean z = dictionaryDataEntity.f17137f;
        String str4 = dictionaryDataEntity.f17138g;
        String str5 = dictionaryDataEntity.f17139h;
        String str6 = dictionaryDataEntity.f17140i;
        String str7 = dictionaryDataEntity.f17141j;
        String str8 = dictionaryDataEntity.f17142k;
        String str9 = dictionaryDataEntity.f17143l;
        String str10 = dictionaryDataEntity.f17144m;
        dictionaryDataEntity.getClass();
        str.getClass();
        str2.getClass();
        str3.getClass();
        str4.getClass();
        ux5.m22975B(str5, str6, str7, str8, str9);
        str10.getClass();
        return new DictionaryDataEntity(i2, str, i, str2, str3, z, str4, str5, str6, str7, str8, str9, str10);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DictionaryDataEntity)) {
            return false;
        }
        DictionaryDataEntity dictionaryDataEntity = (DictionaryDataEntity) obj;
        return this.f17132a == dictionaryDataEntity.f17132a && fa4.m11650l(this.f17133b, dictionaryDataEntity.f17133b) && this.f17134c == dictionaryDataEntity.f17134c && fa4.m11650l(this.f17135d, dictionaryDataEntity.f17135d) && fa4.m11650l(this.f17136e, dictionaryDataEntity.f17136e) && this.f17137f == dictionaryDataEntity.f17137f && fa4.m11650l(this.f17138g, dictionaryDataEntity.f17138g) && fa4.m11650l(this.f17139h, dictionaryDataEntity.f17139h) && fa4.m11650l(this.f17140i, dictionaryDataEntity.f17140i) && fa4.m11650l(this.f17141j, dictionaryDataEntity.f17141j) && fa4.m11650l(this.f17142k, dictionaryDataEntity.f17142k) && fa4.m11650l(this.f17143l, dictionaryDataEntity.f17143l) && fa4.m11650l(this.f17144m, dictionaryDataEntity.f17144m);
    }

    public final int hashCode() {
        return this.f17144m.hashCode() + ux5.m22980c(ux5.m22980c(ux5.m22980c(ux5.m22980c(ux5.m22980c(ux5.m22980c(g9a.m12428e(ux5.m22980c(ux5.m22980c(wq1.m24106b(this.f17134c, ux5.m22980c(Integer.hashCode(this.f17132a) * 31, this.f17133b, 31), 31), this.f17135d, 31), this.f17136e, 31), 31, this.f17137f), this.f17138g, 31), this.f17139h, 31), this.f17140i, 31), this.f17141j, 31), this.f17142k, 31), this.f17143l, 31);
    }

    public final String toString() {
        StringBuilder sbM22995r = ux5.m22995r(this.f17132a, "DictionaryDataEntity(id=", ", name=", this.f17133b, ", order=");
        hn1.m13361k(this.f17134c, ", urlToTransform=", this.f17135d, ", urlDefinition=", sbM22995r);
        ux5.m22976C(this.f17136e, ", isPopUpWindow=", ", languageTo=", sbM22995r, this.f17137f);
        AbstractC3393o1.m17725C(sbM22995r, this.f17138g, ", urlVar1=", this.f17139h, ", urlVar2=");
        AbstractC3393o1.m17725C(sbM22995r, this.f17140i, ", urlVar3=", this.f17141j, ", urlVar4=");
        AbstractC3393o1.m17725C(sbM22995r, this.f17142k, ", urlVar5=", this.f17143l, ", overrideUrl=");
        return AbstractC3393o1.m17738m(sbM22995r, this.f17144m, ")");
    }

    public DictionaryDataEntity(int i, String str, int i2, String str2, String str3, boolean z, String str4, String str5, String str6, String str7, String str8, String str9, String str10) {
        this.f17132a = i;
        this.f17133b = str;
        this.f17134c = i2;
        this.f17135d = str2;
        this.f17136e = str3;
        this.f17137f = z;
        this.f17138g = str4;
        this.f17139h = str5;
        this.f17140i = str6;
        this.f17141j = str7;
        this.f17142k = str8;
        this.f17143l = str9;
        this.f17144m = str10;
    }
}
