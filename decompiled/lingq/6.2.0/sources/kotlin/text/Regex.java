package kotlin.text;

import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import p000.C3006fm;
import p000.bl3;
import p000.dr5;
import p000.ij6;
import p000.ux5;
import p000.vk9;
import p000.vz1;

/* JADX INFO: loaded from: classes.dex */
public final class Regex implements Serializable {

    /* JADX INFO: renamed from: a */
    public final Pattern f47727a;

    /* JADX INFO: loaded from: classes2.dex */
    public static final class Serialized implements Serializable {

        /* JADX INFO: renamed from: a */
        public final String f47728a;

        /* JADX INFO: renamed from: b */
        public final int f47729b;

        public Serialized(String str, int i) {
            this.f47728a = str;
            this.f47729b = i;
        }

        private final Object readResolve() {
            Pattern patternCompile = Pattern.compile(this.f47728a, this.f47729b);
            patternCompile.getClass();
            return new Regex(patternCompile);
        }
    }

    public Regex(String str, RegexOption regexOption) {
        str.getClass();
        regexOption.getClass();
        int value = regexOption.getValue();
        Pattern patternCompile = Pattern.compile(str, (value & 2) != 0 ? value | 64 : value);
        patternCompile.getClass();
        this.f47727a = patternCompile;
    }

    /* JADX INFO: renamed from: c */
    public static bl3 m15422c(Regex regex, CharSequence charSequence) {
        regex.getClass();
        charSequence.getClass();
        int i = 0;
        if (charSequence.length() >= 0) {
            return new bl3(new C3006fm(28, regex, charSequence), Regex$findAll$2.f47730i, i);
        }
        ij6.m13949f(charSequence.length(), ux5.m22998u("Start index out of bounds: ", 0, ", input length: "));
        return null;
    }

    private final void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Deserialization is supported via proxy only");
    }

    private final Object writeReplace() {
        Pattern pattern = this.f47727a;
        String strPattern = pattern.pattern();
        strPattern.getClass();
        return new Serialized(strPattern, pattern.flags());
    }

    /* JADX INFO: renamed from: a */
    public final boolean m15423a(CharSequence charSequence) {
        charSequence.getClass();
        return this.f47727a.matcher(charSequence).find();
    }

    /* JADX INFO: renamed from: b */
    public final dr5 m15424b(CharSequence charSequence) {
        charSequence.getClass();
        Matcher matcher = this.f47727a.matcher(charSequence);
        matcher.getClass();
        if (matcher.find(0)) {
            return new dr5(matcher, charSequence);
        }
        return null;
    }

    /* JADX INFO: renamed from: d */
    public final dr5 m15425d(int i, String str) {
        str.getClass();
        Matcher matcherRegion = this.f47727a.matcher(str).useAnchoringBounds(false).useTransparentBounds(true).region(i, str.length());
        if (matcherRegion.lookingAt()) {
            return new dr5(matcherRegion, str);
        }
        return null;
    }

    /* JADX INFO: renamed from: e */
    public final dr5 m15426e(CharSequence charSequence) {
        charSequence.getClass();
        Matcher matcher = this.f47727a.matcher(charSequence);
        matcher.getClass();
        if (matcher.matches()) {
            return new dr5(matcher, charSequence);
        }
        return null;
    }

    /* JADX INFO: renamed from: f */
    public final boolean m15427f(CharSequence charSequence) {
        charSequence.getClass();
        return this.f47727a.matcher(charSequence).matches();
    }

    /* JADX INFO: renamed from: g */
    public final String m15428g(CharSequence charSequence, String str) {
        charSequence.getClass();
        String strReplaceAll = this.f47727a.matcher(charSequence).replaceAll(str);
        strReplaceAll.getClass();
        return strReplaceAll;
    }

    /* JADX INFO: renamed from: h */
    public final List m15429h(String str) {
        str.getClass();
        int iEnd = 0;
        vk9.m23401x0(0);
        Matcher matcher = this.f47727a.matcher(str);
        if (!matcher.find()) {
            return vz1.m23604J(str.toString());
        }
        ArrayList arrayList = new ArrayList(10);
        do {
            arrayList.add(str.subSequence(iEnd, matcher.start()).toString());
            iEnd = matcher.end();
        } while (matcher.find());
        arrayList.add(str.subSequence(iEnd, str.length()).toString());
        return arrayList;
    }

    public final String toString() {
        String string = this.f47727a.toString();
        string.getClass();
        return string;
    }

    public Regex(String str) {
        str.getClass();
        Pattern patternCompile = Pattern.compile(str);
        patternCompile.getClass();
        this.f47727a = patternCompile;
    }

    public Regex(Pattern pattern) {
        this.f47727a = pattern;
    }
}
