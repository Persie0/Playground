package p000;

import java.util.Arrays;
import java.util.HashSet;

/* JADX INFO: loaded from: classes.dex */
public final class qnd {

    /* JADX INFO: renamed from: c */
    public static final HashSet f57996c = new HashSet(Arrays.asList(Boolean.class, Byte.class, Short.class, Integer.class, Long.class, Float.class, Double.class));

    /* JADX INFO: renamed from: a */
    public final StringBuilder f57997a;

    /* JADX INFO: renamed from: b */
    public boolean f57998b = false;

    public qnd(StringBuilder sb) {
        this.f57997a = sb;
    }

    /* JADX INFO: renamed from: b */
    public static int m20085b(int i, String str) {
        while (i < str.length()) {
            char cCharAt = str.charAt(i);
            if (cCharAt < ' ' || cCharAt == '\"' || cCharAt == '\\') {
                return i;
            }
            i++;
        }
        return -1;
    }

    /* JADX INFO: renamed from: a */
    public final void m20086a(Object obj, String str) {
        boolean z = this.f57998b;
        StringBuilder sb = this.f57997a;
        if (z) {
            sb.append(' ');
        } else {
            if (sb.length() > 0) {
                sb.append((sb.length() > 1000 || sb.indexOf("\n") != -1) ? '\n' : ' ');
            }
            sb.append("[CONTEXT ");
            this.f57998b = true;
        }
        sb.append(str);
        sb.append('=');
        if (obj == null) {
            sb.append(true);
            return;
        }
        if (f57996c.contains(obj.getClass())) {
            sb.append(obj);
            return;
        }
        sb.append('\"');
        String string = obj.toString();
        int i = 0;
        while (true) {
            int iM20085b = m20085b(i, string);
            if (iM20085b == -1) {
                sb.append((CharSequence) string, i, string.length());
                sb.append('\"');
                return;
            }
            sb.append((CharSequence) string, i, iM20085b);
            i = iM20085b + 1;
            char cCharAt = string.charAt(iM20085b);
            if (cCharAt == '\t') {
                cCharAt = 't';
            } else if (cCharAt == '\n') {
                cCharAt = 'n';
            } else if (cCharAt == '\r') {
                cCharAt = 'r';
            } else if (cCharAt != '\"' && cCharAt != '\\') {
                sb.append((char) 65533);
            }
            sb.append("\\");
            sb.append(cCharAt);
        }
    }
}
