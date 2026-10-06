package p021j$.desugar.sun.nio.p023fs;

import java.nio.channels.FileChannel;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.regex.PatternSyntaxException;

/* JADX INFO: renamed from: j$.desugar.sun.nio.fs.g */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC0293g {
    /* JADX INFO: renamed from: a */
    public static /* synthetic */ String m11978a(Iterable iterable) {
        StringBuilder sb = new StringBuilder();
        Iterator it = iterable.iterator();
        if (it.hasNext()) {
            while (true) {
                sb.append((CharSequence) it.next());
                if (!it.hasNext()) {
                    break;
                }
                sb.append((CharSequence) "/");
            }
        }
        return sb.toString();
    }

    /* JADX INFO: renamed from: b */
    public static List m11979b(Object[] objArr) {
        ArrayList arrayList = new ArrayList(objArr.length);
        for (Object obj : objArr) {
            obj.getClass();
            arrayList.add(obj);
        }
        return Collections.unmodifiableList(arrayList);
    }

    /* JADX INFO: renamed from: c */
    public static Set m11980c(Object[] objArr) {
        HashSet hashSet = new HashSet(objArr.length);
        for (Object obj : objArr) {
            obj.getClass();
            if (!hashSet.add(obj)) {
                throw new IllegalArgumentException("duplicate element: " + obj);
            }
        }
        return Collections.unmodifiableSet(hashSet);
    }

    /* JADX INFO: renamed from: e */
    private static char m11982e(String str, int i) {
        if (i < str.length()) {
            return str.charAt(i);
        }
        return (char) 0;
    }

    /* JADX WARN: Code duplicated, block: B:116:0x0107 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:117:0x00fb A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:119:0x0115 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:136:0x0102 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:140:0x00bc A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:141:0x00da A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:40:0x006e  */
    /* JADX WARN: Code duplicated, block: B:57:0x00b4  */
    /* JADX WARN: Code duplicated, block: B:60:0x00c2 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:61:0x00c4  */
    /* JADX WARN: Code duplicated, block: B:67:0x00d2  */
    /* JADX WARN: Code duplicated, block: B:72:0x00de  */
    /* JADX WARN: Code duplicated, block: B:87:0x0112  */
    /* JADX INFO: renamed from: f */
    static String m11983f(String str) {
        int i;
        String str2;
        boolean z;
        char c;
        int i2;
        char cCharAt;
        int i3;
        StringBuilder sb = new StringBuilder("^");
        int i4 = 0;
        while (true) {
            boolean z2 = false;
            while (true) {
                if (i4 >= str.length()) {
                    if (z2) {
                        throw new PatternSyntaxException("Missing '}", str, i4 - 1);
                    }
                    sb.append('$');
                    return sb.toString();
                }
                i = i4 + 1;
                char cCharAt2 = str.charAt(i4);
                if (cCharAt2 == '*') {
                    if (m11982e(str, i) == '*') {
                        sb.append(".*");
                        i++;
                    } else {
                        str2 = "[^/]*";
                        sb.append(str2);
                    }
                    i4 = i;
                } else if (cCharAt2 != ',') {
                    if (cCharAt2 != '/') {
                        if (cCharAt2 == '?') {
                            str2 = "[^/]";
                        } else if (cCharAt2 != '{') {
                            if (cCharAt2 != '}') {
                                if (cCharAt2 == '[') {
                                    sb.append("[[^/]&&[");
                                    if (m11982e(str, i) == '^') {
                                        sb.append("\\^");
                                    } else {
                                        if (m11982e(str, i) == '!') {
                                            sb.append('^');
                                            i++;
                                        }
                                        if (m11982e(str, i) == '-') {
                                            sb.append('-');
                                        }
                                        z = false;
                                        c = 0;
                                        while (i < str.length()) {
                                            i2 = i + 1;
                                            cCharAt = str.charAt(i);
                                            if (cCharAt == ']') {
                                                i = i2;
                                                cCharAt2 = cCharAt;
                                                break;
                                            }
                                            if (cCharAt != '/') {
                                                throw new PatternSyntaxException("Explicit 'name separator' in class", str, i2 - 1);
                                            }
                                            if (cCharAt != '\\' || cCharAt == '[' || (cCharAt == '&' && m11982e(str, i2) == '&')) {
                                                sb.append('\\');
                                            }
                                            sb.append(cCharAt);
                                            if (cCharAt != '-') {
                                                c = cCharAt;
                                                z = true;
                                                i = i2;
                                                cCharAt2 = c;
                                            } else {
                                                if (z) {
                                                    throw new PatternSyntaxException("Invalid range", str, i2 - 1);
                                                }
                                                i3 = i2 + 1;
                                                cCharAt2 = m11982e(str, i2);
                                                if (cCharAt2 != 0 || cCharAt2 == ']') {
                                                    i = i3;
                                                    break;
                                                }
                                                if (cCharAt2 < c) {
                                                    throw new PatternSyntaxException("Invalid range", str, i3 - 3);
                                                }
                                                sb.append(cCharAt2);
                                                i = i3;
                                                z = false;
                                            }
                                        }
                                        if (cCharAt2 == ']') {
                                            throw new PatternSyntaxException("Missing ']", str, i - 1);
                                        }
                                        str2 = "]]";
                                    }
                                    i++;
                                    z = false;
                                    c = 0;
                                    while (i < str.length()) {
                                        i2 = i + 1;
                                        cCharAt = str.charAt(i);
                                        if (cCharAt == ']') {
                                            i = i2;
                                            cCharAt2 = cCharAt;
                                            break;
                                        }
                                        if (cCharAt != '/') {
                                            throw new PatternSyntaxException("Explicit 'name separator' in class", str, i2 - 1);
                                        }
                                        if (cCharAt != '\\') {
                                            sb.append('\\');
                                        } else {
                                            sb.append('\\');
                                        }
                                        sb.append(cCharAt);
                                        if (cCharAt != '-') {
                                            if (z) {
                                                throw new PatternSyntaxException("Invalid range", str, i2 - 1);
                                            }
                                            i3 = i2 + 1;
                                            cCharAt2 = m11982e(str, i2);
                                            if (cCharAt2 != 0) {
                                            }
                                            i = i3;
                                            break;
                                        }
                                        c = cCharAt;
                                        z = true;
                                        i = i2;
                                        cCharAt2 = c;
                                    }
                                    if (cCharAt2 == ']') {
                                        throw new PatternSyntaxException("Missing ']", str, i - 1);
                                    }
                                    str2 = "]]";
                                } else if (cCharAt2 != '\\') {
                                    if (".^$+{[]|()".indexOf(cCharAt2) != -1) {
                                        sb.append('\\');
                                    }
                                } else {
                                    if (i == str.length()) {
                                        throw new PatternSyntaxException("No character to escape", str, i - 1);
                                    }
                                    i4 = i + 1;
                                    char cCharAt3 = str.charAt(i);
                                    if ("\\*?[{".indexOf(cCharAt3) != -1) {
                                        sb.append('\\');
                                    } else {
                                        if (".^$+{[]|()".indexOf(cCharAt3) != -1) {
                                            sb.append('\\');
                                        }
                                    }
                                    sb.append(cCharAt3);
                                }
                            } else {
                                if (z2) {
                                    break;
                                }
                                sb.append('}');
                                i4 = i;
                            }
                        } else {
                            if (z2) {
                                throw new PatternSyntaxException("Cannot nest groups", str, i - 1);
                            }
                            sb.append("(?:(?:");
                            i4 = i;
                            z2 = true;
                        }
                        sb.append(str2);
                        i4 = i;
                    }
                    sb.append(cCharAt2);
                    i4 = i;
                } else {
                    if (z2) {
                        str2 = ")|(?:";
                        sb.append(str2);
                    } else {
                        sb.append(',');
                    }
                    i4 = i;
                }
            }
            sb.append("))");
            i4 = i;
        }
    }

    /* JADX INFO: renamed from: g */
    public static FileChannel m11984g(FileChannel fileChannel) {
        return C0291e.m11977c(fileChannel);
    }
}
