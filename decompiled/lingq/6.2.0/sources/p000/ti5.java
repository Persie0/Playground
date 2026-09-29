package p000;

import java.util.Locale;

/* JADX INFO: loaded from: classes.dex */
public final class ti5 {

    /* JADX INFO: renamed from: a */
    public final Locale f62341a;

    /* JADX WARN: Illegal instructions before constructor call */
    public ti5(String str) {
        Locale localeForLanguageTag = Locale.forLanguageTag(str);
        if (fa4.m11650l(localeForLanguageTag.toLanguageTag(), "und")) {
            System.err.println("The language tag " + str + " is not well-formed. Locale is resolved to Undetermined. Note that underscore '_' is not a valid subtag delimiter and must be replaced with '-'.");
        }
        this(localeForLanguageTag);
    }

    public final boolean equals(Object obj) {
        if (obj == null || !(obj instanceof ti5)) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        return fa4.m11650l(this.f62341a.toLanguageTag(), ((ti5) obj).f62341a.toLanguageTag());
    }

    public final int hashCode() {
        return this.f62341a.toLanguageTag().hashCode();
    }

    public final String toString() {
        return this.f62341a.toLanguageTag();
    }

    public ti5(Locale locale) {
        this.f62341a = locale;
    }
}
