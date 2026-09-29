package p000;

import kotlinx.serialization.json.ClassDiscriminatorMode;

/* JADX INFO: loaded from: classes.dex */
public final class kf4 {

    /* JADX INFO: renamed from: a */
    public final boolean f47125a;

    /* JADX INFO: renamed from: b */
    public final boolean f47126b;

    /* JADX INFO: renamed from: c */
    public final boolean f47127c;

    /* JADX INFO: renamed from: d */
    public final boolean f47128d;

    /* JADX INFO: renamed from: e */
    public final String f47129e;

    /* JADX INFO: renamed from: f */
    public final String f47130f;

    /* JADX INFO: renamed from: g */
    public final boolean f47131g;

    /* JADX INFO: renamed from: h */
    public final ClassDiscriminatorMode f47132h;

    /* JADX INFO: renamed from: i */
    public final boolean f47133i;

    public kf4(boolean z, boolean z2, boolean z3, boolean z4, String str, String str2, boolean z5, ClassDiscriminatorMode classDiscriminatorMode, boolean z6) {
        str.getClass();
        str2.getClass();
        classDiscriminatorMode.getClass();
        this.f47125a = z;
        this.f47126b = z2;
        this.f47127c = z3;
        this.f47128d = z4;
        this.f47129e = str;
        this.f47130f = str2;
        this.f47131g = z5;
        this.f47132h = classDiscriminatorMode;
        this.f47133i = z6;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("JsonConfiguration(encodeDefaults=");
        sb.append(this.f47125a);
        sb.append(", ignoreUnknownKeys=");
        sb.append(this.f47126b);
        sb.append(", isLenient=");
        sb.append(this.f47127c);
        sb.append(", allowStructuredMapKeys=false, prettyPrint=false, explicitNulls=");
        sb.append(this.f47128d);
        sb.append(", prettyPrintIndent='");
        sb.append(this.f47129e);
        sb.append("', coerceInputValues=false, useArrayPolymorphism=false, classDiscriminator='");
        sb.append(this.f47130f);
        sb.append("', allowSpecialFloatingPointValues=false, useAlternativeNames=");
        sb.append(this.f47131g);
        sb.append(", namingStrategy=null, decodeEnumsCaseInsensitive=false, allowTrailingComma=false, allowComments=false, classDiscriminatorMode=");
        sb.append(this.f47132h);
        sb.append(", exceptionsWithDebugInfo=");
        return ux5.m22993p(sb, this.f47133i, ')');
    }
}
