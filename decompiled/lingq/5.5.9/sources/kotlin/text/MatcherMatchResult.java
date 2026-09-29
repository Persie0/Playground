package kotlin.text;

import ae.C0062b;
import dm.C5207g;
import java.util.List;
import java.util.regex.Matcher;
import jm.C6526i;
import mo.InterfaceC7656d;
import tl.AbstractC9313a;

/* JADX INFO: loaded from: classes2.dex */
public final class MatcherMatchResult implements InterfaceC7656d {

    /* JADX INFO: renamed from: a */
    public final Matcher f39966a;

    /* JADX INFO: renamed from: b */
    public final CharSequence f39967b;

    /* JADX INFO: renamed from: c */
    public C7074a f39968c;

    /* JADX INFO: renamed from: kotlin.text.MatcherMatchResult$a */
    public static final class C7074a extends AbstractC9313a<String> {
        public C7074a() {
        }

        @Override // kotlin.collections.AbstractCollection
        /* JADX INFO: renamed from: a */
        public final int mo1847a() {
            return MatcherMatchResult.this.f39966a.groupCount() + 1;
        }

        @Override // kotlin.collections.AbstractCollection, java.util.Collection, java.util.List
        public final /* bridge */ boolean contains(Object obj) {
            if (obj instanceof String) {
                return super.contains((String) obj);
            }
            return false;
        }

        @Override // java.util.List
        public final Object get(int i10) {
            String strGroup = MatcherMatchResult.this.f39966a.group(i10);
            if (strGroup == null) {
                strGroup = "";
            }
            return strGroup;
        }

        @Override // tl.AbstractC9313a, java.util.List
        public final /* bridge */ int indexOf(Object obj) {
            if (obj instanceof String) {
                return super.indexOf((String) obj);
            }
            return -1;
        }

        @Override // tl.AbstractC9313a, java.util.List
        public final /* bridge */ int lastIndexOf(Object obj) {
            if (obj instanceof String) {
                return super.lastIndexOf((String) obj);
            }
            return -1;
        }
    }

    public MatcherMatchResult(Matcher matcher, CharSequence charSequence) {
        C5207g.m11111f(charSequence, "input");
        this.f39966a = matcher;
        this.f39967b = charSequence;
        new MatcherMatchResult$groups$1(this);
    }

    @Override // mo.InterfaceC7656d
    /* JADX INFO: renamed from: a */
    public final C6526i mo14268a() {
        Matcher matcher = this.f39966a;
        return C0062b.m411w2(matcher.start(), matcher.end());
    }

    /* JADX INFO: renamed from: b */
    public final List<String> m14269b() {
        if (this.f39968c == null) {
            this.f39968c = new C7074a();
        }
        C7074a c7074a = this.f39968c;
        C5207g.m11108c(c7074a);
        return c7074a;
    }

    @Override // mo.InterfaceC7656d
    public final String getValue() {
        String strGroup = this.f39966a.group();
        C5207g.m11110e(strGroup, "matchResult.group()");
        return strGroup;
    }

    @Override // mo.InterfaceC7656d
    public final MatcherMatchResult next() {
        Matcher matcher = this.f39966a;
        int iEnd = matcher.end() + (matcher.end() == matcher.start() ? 1 : 0);
        CharSequence charSequence = this.f39967b;
        MatcherMatchResult matcherMatchResult = null;
        if (iEnd <= charSequence.length()) {
            Matcher matcher2 = matcher.pattern().matcher(charSequence);
            C5207g.m11110e(matcher2, "matcher.pattern().matcher(input)");
            if (matcher2.find(iEnd)) {
                matcherMatchResult = new MatcherMatchResult(matcher2, charSequence);
            }
        }
        return matcherMatchResult;
    }
}
