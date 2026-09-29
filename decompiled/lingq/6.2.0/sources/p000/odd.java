package p000;

import java.lang.reflect.Array;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Arrays;

/* JADX INFO: loaded from: classes2.dex */
public abstract class odd {
    /* JADX INFO: renamed from: a */
    public static p33 m17941a(k47 k47Var) {
        int i = 1;
        k47Var.m14819N(1);
        int iM14808C = k47Var.m14808C();
        long j = ((long) k47Var.f46701b) + ((long) iM14808C);
        int i2 = iM14808C / 18;
        long[] jArrCopyOf = new long[i2];
        long[] jArrCopyOf2 = new long[i2];
        for (int i3 = 0; i3 < i2; i3++) {
            long jM14836t = k47Var.m14836t();
            if (jM14836t == -1) {
                jArrCopyOf = Arrays.copyOf(jArrCopyOf, i3);
                jArrCopyOf2 = Arrays.copyOf(jArrCopyOf2, i3);
                break;
            }
            jArrCopyOf[i3] = jM14836t;
            jArrCopyOf2[i3] = k47Var.m14836t();
            k47Var.m14819N(2);
        }
        k47Var.m14819N((int) (j - ((long) k47Var.f46701b)));
        return new p33(i, jArrCopyOf, jArrCopyOf2);
    }

    /* JADX INFO: renamed from: b */
    public static void m17942b(String str, Object obj, StringBuffer stringBuffer, StringBuffer stringBuffer2) throws IllegalAccessException {
        if (obj != null) {
            int i = 0;
            if (!(obj instanceof f8c)) {
                String strM17943c = m17943c(str);
                stringBuffer2.append(stringBuffer);
                stringBuffer2.append(strM17943c);
                stringBuffer2.append(": ");
                if (obj instanceof String) {
                    String strConcat = (String) obj;
                    if (!strConcat.startsWith("http") && strConcat.length() > 200) {
                        strConcat = strConcat.substring(0, 200).concat("[...]");
                    }
                    int length = strConcat.length();
                    StringBuilder sb = new StringBuilder(length);
                    while (i < length) {
                        char cCharAt = strConcat.charAt(i);
                        if (cCharAt < ' ' || cCharAt > '~' || cCharAt == '\"' || cCharAt == '\'') {
                            sb.append(String.format("\\u%04x", Integer.valueOf(cCharAt)));
                        } else {
                            sb.append(cCharAt);
                        }
                        i++;
                    }
                    String string = sb.toString();
                    stringBuffer2.append("\"");
                    stringBuffer2.append(string);
                    stringBuffer2.append("\"");
                } else if (obj instanceof byte[]) {
                    byte[] bArr = (byte[]) obj;
                    stringBuffer2.append('\"');
                    while (i < bArr.length) {
                        int i2 = bArr[i] & 255;
                        if (i2 == 92 || i2 == 34) {
                            stringBuffer2.append('\\');
                        } else {
                            if (i2 < 32 || i2 >= 127) {
                                stringBuffer2.append(String.format("\\%03o", Integer.valueOf(i2)));
                            }
                            i++;
                        }
                        stringBuffer2.append((char) i2);
                        i++;
                    }
                    stringBuffer2.append('\"');
                } else {
                    stringBuffer2.append(obj);
                }
                stringBuffer2.append("\n");
                return;
            }
            int length2 = stringBuffer.length();
            if (str != null) {
                stringBuffer2.append(stringBuffer);
                stringBuffer2.append(m17943c(str));
                stringBuffer2.append(" <\n");
                stringBuffer.append("  ");
            }
            Class<?> cls = obj.getClass();
            for (Field field : cls.getFields()) {
                int modifiers = field.getModifiers();
                String name = field.getName();
                if (!"cachedSize".equals(name) && (modifiers & 1) == 1 && (modifiers & 8) != 8 && !name.startsWith("_") && !name.endsWith("_")) {
                    Class<?> type = field.getType();
                    Object obj2 = field.get(obj);
                    if (!type.isArray() || type.getComponentType() == Byte.TYPE) {
                        m17942b(name, obj2, stringBuffer, stringBuffer2);
                    } else {
                        int length3 = obj2 == null ? 0 : Array.getLength(obj2);
                        for (int i3 = 0; i3 < length3; i3++) {
                            m17942b(name, Array.get(obj2, i3), stringBuffer, stringBuffer2);
                        }
                    }
                }
            }
            Method[] methods = cls.getMethods();
            int length4 = methods.length;
            while (i < length4) {
                String name2 = methods[i].getName();
                if (name2.startsWith("set")) {
                    String strSubstring = name2.substring(3);
                    try {
                        if (((Boolean) cls.getMethod(strSubstring.length() != 0 ? "has".concat(strSubstring) : new String("has"), null).invoke(obj, null)).booleanValue()) {
                            m17942b(strSubstring, cls.getMethod(strSubstring.length() != 0 ? "get".concat(strSubstring) : new String("get"), null).invoke(obj, null), stringBuffer, stringBuffer2);
                        }
                    } catch (NoSuchMethodException unused) {
                    }
                }
                i++;
            }
            if (str != null) {
                stringBuffer.setLength(length2);
                stringBuffer2.append(stringBuffer);
                stringBuffer2.append(">\n");
            }
        }
    }

    /* JADX INFO: renamed from: c */
    public static String m17943c(String str) {
        StringBuffer stringBuffer = new StringBuffer();
        for (int i = 0; i < str.length(); i++) {
            char cCharAt = str.charAt(i);
            if (i == 0) {
                cCharAt = Character.toLowerCase(cCharAt);
            } else if (Character.isUpperCase(cCharAt)) {
                stringBuffer.append('_');
                cCharAt = Character.toLowerCase(cCharAt);
            }
            stringBuffer.append(cCharAt);
        }
        return stringBuffer.toString();
    }
}
