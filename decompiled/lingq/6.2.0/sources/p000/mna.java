package p000;

import kotlin.uuid.AbstractC3207a;

/* JADX INFO: loaded from: classes3.dex */
public abstract class mna extends AbstractC3207a {
    /* JADX INFO: renamed from: e */
    public static final String m16945e(String str) {
        return str.length() <= 64 ? str : str.substring(0, 64).concat("...");
    }

    /* JADX INFO: renamed from: f */
    public static final void m16946f(String str, int i, String str2) {
        StringBuilder sbM17741p = AbstractC3393o1.m17741p(i, "Expected ", str2, " at index ", ", but was '");
        sbM17741p.append(str.charAt(i));
        sbM17741p.append('\'');
        throw new IllegalArgumentException(sbM17741p.toString());
    }
}
