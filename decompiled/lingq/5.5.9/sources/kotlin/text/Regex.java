package kotlin.text;

import android.support.v4.media.C0141b;
import cm.InterfaceC2041a;
import com.android.installreferrer.api.InstallReferrerClient;
import dm.C5207g;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import kotlin.Metadata;
import mo.InterfaceC7656d;
import p249lo.C7414g;
import p385sf.C9000b;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(m13364d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\u0018\u00002\u00060\u0001j\u0002`\u0002:\u0001\u0005J\b\u0010\u0004\u001a\u00020\u0003H\u0002¨\u0006\u0006"}, m13365d2 = {"Lkotlin/text/Regex;", "Ljava/io/Serializable;", "Lkotlin/io/Serializable;", "", "writeReplace", "Serialized", "kotlin-stdlib"}, m13366k = 1, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
public final class Regex implements Serializable {

    /* JADX INFO: renamed from: a */
    public final Pattern f39972a;

    @Metadata(m13364d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0002\u0018\u00002\u00060\u0001j\u0002`\u0002J\b\u0010\u0004\u001a\u00020\u0003H\u0002¨\u0006\u0005"}, m13365d2 = {"Lkotlin/text/Regex$Serialized;", "Ljava/io/Serializable;", "Lkotlin/io/Serializable;", "", "readResolve", "kotlin-stdlib"}, m13366k = 1, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
    public static final class Serialized implements Serializable {

        /* JADX INFO: renamed from: a */
        public final String f39973a;

        /* JADX INFO: renamed from: b */
        public final int f39974b;

        public Serialized(String str, int i10) {
            this.f39973a = str;
            this.f39974b = i10;
        }

        private final Object readResolve() {
            Pattern patternCompile = Pattern.compile(this.f39973a, this.f39974b);
            C5207g.m11110e(patternCompile, "compile(pattern, flags)");
            return new Regex(patternCompile);
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public Regex(String str) {
        C5207g.m11111f(str, "pattern");
        Pattern patternCompile = Pattern.compile(str);
        C5207g.m11110e(patternCompile, "compile(pattern)");
        this(patternCompile);
    }

    public Regex(Pattern pattern) {
        C5207g.m11111f(pattern, "nativePattern");
        this.f39972a = pattern;
    }

    /* JADX INFO: renamed from: a */
    public static C7414g m14270a(final Regex regex, final CharSequence charSequence) {
        C5207g.m11111f(charSequence, "input");
        final int i10 = 0;
        if (charSequence.length() < 0) {
            StringBuilder sbM614j = C0141b.m614j("Start index out of bounds: ", 0, ", input length: ");
            sbM614j.append(charSequence.length());
            throw new IndexOutOfBoundsException(sbM614j.toString());
        }
        InterfaceC2041a<InterfaceC7656d> interfaceC2041a = new InterfaceC2041a<InterfaceC7656d>() { // from class: kotlin.text.Regex$findAll$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // cm.InterfaceC2041a
            /* JADX INFO: renamed from: E */
            public final InterfaceC7656d mo807E() {
                Regex regex2 = this.f39975b;
                regex2.getClass();
                CharSequence charSequence2 = charSequence;
                C5207g.m11111f(charSequence2, "input");
                Matcher matcher = regex2.f39972a.matcher(charSequence2);
                C5207g.m11110e(matcher, "nativePattern.matcher(input)");
                if (matcher.find(i10)) {
                    return new MatcherMatchResult(matcher, charSequence2);
                }
                return null;
            }
        };
        Regex$findAll$2 regex$findAll$2 = Regex$findAll$2.f39978j;
        C5207g.m11111f(regex$findAll$2, "nextFunction");
        return new C7414g(interfaceC2041a, regex$findAll$2);
    }

    private final Object writeReplace() {
        Pattern pattern = this.f39972a;
        String strPattern = pattern.pattern();
        C5207g.m11110e(strPattern, "nativePattern.pattern()");
        return new Serialized(strPattern, pattern.flags());
    }

    /* JADX INFO: renamed from: b */
    public final boolean m14271b(CharSequence charSequence) {
        C5207g.m11111f(charSequence, "input");
        return this.f39972a.matcher(charSequence).matches();
    }

    /* JADX INFO: renamed from: c */
    public final String m14272c(CharSequence charSequence, String str) {
        C5207g.m11111f(charSequence, "input");
        String strReplaceAll = this.f39972a.matcher(charSequence).replaceAll(str);
        C5207g.m11110e(strReplaceAll, "nativePattern.matcher(in…).replaceAll(replacement)");
        return strReplaceAll;
    }

    /* JADX INFO: renamed from: d */
    public final List m14273d(CharSequence charSequence) {
        C5207g.m11111f(charSequence, "input");
        int iEnd = 0;
        C7076b.m14296p3(0);
        Matcher matcher = this.f39972a.matcher(charSequence);
        if (!matcher.find()) {
            return C9000b.m17251q(charSequence.toString());
        }
        ArrayList arrayList = new ArrayList(10);
        do {
            arrayList.add(charSequence.subSequence(iEnd, matcher.start()).toString());
            iEnd = matcher.end();
        } while (matcher.find());
        arrayList.add(charSequence.subSequence(iEnd, charSequence.length()).toString());
        return arrayList;
    }

    public final String toString() {
        String string = this.f39972a.toString();
        C5207g.m11110e(string, "nativePattern.toString()");
        return string;
    }
}
