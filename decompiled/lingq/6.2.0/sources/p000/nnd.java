package p000;

import com.google.android.gms.internal.measurement.zzyz;
import java.io.IOException;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Formattable;
import java.util.Formatter;
import java.util.Locale;

/* JADX INFO: loaded from: classes.dex */
public final class nnd {

    /* JADX INFO: renamed from: a */
    public final vfb f53021a;

    /* JADX INFO: renamed from: b */
    public int f53022b = 0;

    /* JADX INFO: renamed from: c */
    public int f53023c = -1;

    /* JADX INFO: renamed from: d */
    public final Object[] f53024d;

    /* JADX INFO: renamed from: e */
    public final StringBuilder f53025e;

    /* JADX INFO: renamed from: f */
    public int f53026f;

    public nnd(vfb vfbVar, Object[] objArr, StringBuilder sb) {
        dja.m10418b(vfbVar, "context");
        this.f53021a = vfbVar;
        this.f53026f = 0;
        this.f53024d = objArr;
        this.f53025e = sb;
    }

    /* JADX INFO: renamed from: b */
    public static void m17565b(StringBuilder sb, Object obj, String str) {
        sb.append("[INVALID: format=");
        sb.append(str);
        sb.append(", type=");
        sb.append(obj.getClass().getCanonicalName());
        sb.append(", value=");
        sb.append(rnd.m20726a(obj));
        sb.append("]");
    }

    /* JADX WARN: Code duplicated, block: B:106:0x012c  */
    /* JADX WARN: Code duplicated, block: B:108:0x0132  */
    /* JADX WARN: Code duplicated, block: B:14:0x0025  */
    /* JADX WARN: Code duplicated, block: B:15:0x0027  */
    /* JADX WARN: Code duplicated, block: B:64:0x0094  */
    /* JADX INFO: renamed from: a */
    public final void m17566a(Object obj, zzyz zzyzVar, pnd pndVar) {
        String simpleName;
        pnd pndVar2;
        boolean zIsValidCodePoint;
        int iOrdinal = zzyzVar.zzc().ordinal();
        StringBuilder sb = this.f53025e;
        if (iOrdinal != 0) {
            if (iOrdinal == 1) {
                zIsValidCodePoint = obj instanceof Boolean;
            } else if (iOrdinal != 2) {
                if (iOrdinal != 3) {
                    if (iOrdinal != 4) {
                        throw null;
                    }
                    if ((obj instanceof Double) || (obj instanceof Float) || (obj instanceof BigDecimal)) {
                        zIsValidCodePoint = true;
                    } else {
                        zIsValidCodePoint = false;
                    }
                } else if ((obj instanceof Integer) || (obj instanceof Long) || (obj instanceof Byte) || (obj instanceof Short) || (obj instanceof BigInteger)) {
                    zIsValidCodePoint = true;
                } else {
                    zIsValidCodePoint = false;
                }
            } else if (obj instanceof Character) {
                zIsValidCodePoint = true;
            } else if ((obj instanceof Integer) || (obj instanceof Byte) || (obj instanceof Short)) {
                zIsValidCodePoint = Character.isValidCodePoint(((Number) obj).intValue());
            } else {
                zIsValidCodePoint = false;
            }
            if (!zIsValidCodePoint) {
                m17565b(sb, obj, zzyzVar.zze());
                return;
            }
        }
        int iOrdinal2 = zzyzVar.ordinal();
        if (iOrdinal2 != 0) {
            if (iOrdinal2 == 1) {
                if (pndVar.m19419a()) {
                    sb.append(obj);
                    return;
                }
            } else if (iOrdinal2 != 2) {
                if (iOrdinal2 != 3) {
                    if (iOrdinal2 == 5) {
                        if (pndVar.m19419a()) {
                            pndVar2 = pndVar;
                        } else {
                            int i = pndVar.f56540a;
                            int i2 = i & 128;
                            if (i2 == 0) {
                                pndVar2 = pnd.f56539e;
                            } else if (i2 == i && pndVar.f56541b == -1 && pndVar.f56542c == -1) {
                                pndVar2 = pndVar;
                            } else {
                                pndVar2 = new pnd(i2, -1, -1);
                            }
                        }
                        if (pndVar2.equals(pndVar)) {
                            Number number = (Number) obj;
                            Locale locale = rnd.f59602a;
                            boolean zM19421c = pndVar.m19421c();
                            long jLongValue = number.longValue();
                            if (number instanceof Long) {
                                rnd.m20727b(sb, jLongValue, zM19421c);
                                return;
                            }
                            if (number instanceof Integer) {
                                rnd.m20727b(sb, jLongValue & 4294967295L, zM19421c);
                                return;
                            }
                            if (number instanceof Byte) {
                                rnd.m20727b(sb, jLongValue & 255, zM19421c);
                                return;
                            }
                            if (number instanceof Short) {
                                rnd.m20727b(sb, jLongValue & 65535, zM19421c);
                                return;
                            }
                            if (!(number instanceof BigInteger)) {
                                C3386nv.m17633t("unsupported number type: ".concat(String.valueOf(number.getClass())));
                                return;
                            }
                            String string = ((BigInteger) number).toString(16);
                            if (zM19421c) {
                                string = string.toUpperCase(rnd.f59602a);
                            }
                            sb.append(string);
                            return;
                        }
                    }
                } else if (pndVar.m19419a()) {
                    sb.append(obj);
                    return;
                }
            } else if (pndVar.m19419a()) {
                if (obj instanceof Character) {
                    sb.append(obj);
                    return;
                }
                int iIntValue = ((Number) obj).intValue();
                if ((iIntValue >>> 16) == 0) {
                    sb.append((char) iIntValue);
                    return;
                } else {
                    sb.append(Character.toChars(iIntValue));
                    return;
                }
            }
        } else {
            if (obj instanceof Formattable) {
                Formattable formattable = (Formattable) obj;
                Locale locale2 = rnd.f59602a;
                int i3 = pndVar.f56540a;
                int i4 = i3 & 162;
                if (i4 != 0) {
                    i4 = ((i3 & 32) == 0 ? 0 : 1) | ((i3 & 128) != 0 ? 2 : 0) | ((i3 & 2) == 0 ? 0 : 4);
                }
                int length = sb.length();
                Formatter formatter = new Formatter(sb, rnd.f59602a);
                try {
                    formattable.formatTo(formatter, i4, pndVar.f56541b, pndVar.f56542c);
                    return;
                } catch (RuntimeException e) {
                    sb.setLength(length);
                    try {
                        Appendable appendableOut = formatter.out();
                        try {
                            simpleName = e.toString();
                        } catch (RuntimeException e2) {
                            simpleName = e2.getClass().getSimpleName();
                        }
                        appendableOut.append(rnd.m20728c(formattable, simpleName));
                        return;
                    } catch (IOException unused) {
                        return;
                    }
                }
            }
            if (pndVar.m19419a()) {
                sb.append(rnd.m20726a(obj));
                return;
            }
        }
        String strZze = zzyzVar.zze();
        if (!pndVar.m19419a()) {
            int iZzb = zzyzVar.zzb();
            if (pndVar.m19421c()) {
                iZzb &= 65503;
            }
            StringBuilder sb2 = new StringBuilder("%");
            pndVar.m19422d(sb2);
            sb2.append((char) iZzb);
            strZze = sb2.toString();
        }
        sb.append(String.format(rnd.f59602a, strZze, obj));
    }
}
