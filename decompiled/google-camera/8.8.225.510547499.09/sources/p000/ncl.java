package p000;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class ncl implements nby {

    /* JADX INFO: renamed from: d */
    private static final Set f42016d = new HashSet(Arrays.asList(Boolean.class, Byte.class, Short.class, Integer.class, Long.class, Float.class, Double.class));

    /* JADX INFO: renamed from: b */
    public final StringBuilder f42018b;

    /* JADX INFO: renamed from: c */
    public boolean f42019c = false;

    /* JADX INFO: renamed from: e */
    private final String f42020e = "[CONTEXT ";

    /* JADX INFO: renamed from: a */
    public final String f42017a = " ]";

    public ncl(StringBuilder sb) {
        this.f42018b = sb;
    }

    /* JADX INFO: renamed from: b */
    private static int m17337b(String str, int i) {
        while (i < str.length()) {
            char cCharAt = str.charAt(i);
            if (cCharAt < ' ' || cCharAt == '\"' || cCharAt == '\\') {
                return i;
            }
            i++;
        }
        return -1;
    }

    @Override // p000.nby
    /* JADX INFO: renamed from: a */
    public final void mo17308a(String str, Object obj) {
        char c = ' ';
        if (this.f42019c) {
            this.f42018b.append(' ');
        } else {
            if (this.f42018b.length() > 0) {
                StringBuilder sb = this.f42018b;
                if (sb.length() > 1000 || this.f42018b.indexOf("\n") != -1) {
                    c = '\n';
                }
                sb.append(c);
            }
            this.f42018b.append(this.f42020e);
            this.f42019c = true;
        }
        StringBuilder sb2 = this.f42018b;
        sb2.append(str);
        sb2.append('=');
        if (obj == null) {
            sb2.append(true);
            return;
        }
        if (f42016d.contains(obj.getClass())) {
            sb2.append(obj);
            return;
        }
        sb2.append('\"');
        String string = obj.toString();
        int i = 0;
        while (true) {
            int iM17337b = m17337b(string, i);
            if (iM17337b == -1) {
                sb2.append((CharSequence) string, i, string.length());
                sb2.append('\"');
                return;
            }
            sb2.append((CharSequence) string, i, iM17337b);
            i = iM17337b + 1;
            char cCharAt = string.charAt(iM17337b);
            switch (cCharAt) {
                case '\t':
                    cCharAt = 't';
                    break;
                case '\n':
                    cCharAt = 'n';
                    break;
                case '\r':
                    cCharAt = 'r';
                    break;
                case '\"':
                case '\\':
                    break;
                default:
                    sb2.append((char) 65533);
                    continue;
            }
            sb2.append("\\");
            sb2.append(cCharAt);
        }
    }
}
