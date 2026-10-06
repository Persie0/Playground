package p000;

import com.google.android.clockwork.common.wearable.wearmaterial.selectioncontrol.eMjB.VzWFSVj;
import java.io.IOException;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Formattable;
import java.util.Formatter;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class neq implements nem {

    /* JADX INFO: renamed from: a */
    public int f42149a = 0;

    /* JADX INFO: renamed from: b */
    public int f42150b = -1;

    /* JADX INFO: renamed from: c */
    public final Object[] f42151c;

    /* JADX INFO: renamed from: d */
    public final StringBuilder f42152d;

    /* JADX INFO: renamed from: e */
    public int f42153e;

    /* JADX INFO: renamed from: f */
    private final ndm f42154f;

    public neq(ndm ndmVar, Object[] objArr, StringBuilder sb) {
        nea.m17397k(ndmVar, "context");
        this.f42154f = ndmVar;
        this.f42153e = 0;
        nea.m17397k(objArr, "arguments");
        this.f42151c = objArr;
        this.f42152d = sb;
    }

    /* JADX INFO: renamed from: d */
    public static void m17419d(StringBuilder sb, Object obj, String str) {
        sb.append("[INVALID: format=");
        sb.append(str);
        sb.append(VzWFSVj.KCbEOXAtMDwN);
        sb.append(obj.getClass().getCanonicalName());
        sb.append(", value=");
        sb.append(ncp.m17343b(obj));
        sb.append("]");
    }

    /* JADX WARN: Code duplicated, block: B:101:0x0126  */
    /* JADX WARN: Code duplicated, block: B:103:0x012c  */
    /* JADX WARN: Code duplicated, block: B:105:0x0130  */
    /* JADX WARN: Code duplicated, block: B:107:0x0134  */
    /* JADX WARN: Code duplicated, block: B:109:0x013a  */
    /* JADX WARN: Code duplicated, block: B:111:0x0142  */
    /* JADX WARN: Code duplicated, block: B:113:0x014a  */
    /* JADX WARN: Code duplicated, block: B:116:0x014f  */
    /* JADX WARN: Code duplicated, block: B:119:0x0154  */
    /* JADX WARN: Code duplicated, block: B:120:0x0156  */
    /* JADX WARN: Code duplicated, block: B:123:0x015b  */
    /* JADX WARN: Code duplicated, block: B:138:0x0190  */
    /* JADX WARN: Code duplicated, block: B:140:0x0198  */
    /* JADX WARN: Code duplicated, block: B:48:0x0072  */
    /* JADX WARN: Code duplicated, block: B:51:0x0079  */
    /* JADX WARN: Code duplicated, block: B:53:0x007f  */
    /* JADX WARN: Code duplicated, block: B:54:0x0082  */
    /* JADX WARN: Code duplicated, block: B:60:0x008d  */
    /* JADX WARN: Code duplicated, block: B:64:0x009a  */
    /* JADX WARN: Code duplicated, block: B:66:0x00a8  */
    /* JADX WARN: Code duplicated, block: B:68:0x00ac  */
    /* JADX WARN: Code duplicated, block: B:70:0x00b0  */
    /* JADX WARN: Code duplicated, block: B:72:0x00ba  */
    /* JADX WARN: Code duplicated, block: B:74:0x00be  */
    /* JADX WARN: Code duplicated, block: B:76:0x00c5  */
    /* JADX WARN: Code duplicated, block: B:78:0x00c9  */
    /* JADX WARN: Code duplicated, block: B:80:0x00d1  */
    /* JADX WARN: Code duplicated, block: B:82:0x00d5  */
    /* JADX WARN: Code duplicated, block: B:84:0x00df  */
    /* JADX WARN: Code duplicated, block: B:87:0x00e9  */
    /* JADX WARN: Code duplicated, block: B:89:0x0101  */
    /* JADX WARN: Code duplicated, block: B:91:0x0107  */
    /* JADX WARN: Code duplicated, block: B:93:0x010b  */
    /* JADX WARN: Code duplicated, block: B:95:0x010f  */
    /* JADX WARN: Code duplicated, block: B:97:0x0119  */
    /* JADX WARN: Code duplicated, block: B:99:0x011e  */
    @Override // p000.nem
    /* JADX INFO: renamed from: a */
    public final void mo17418a(Object obj, nci nciVar, ncj ncjVar) {
        StringBuilder sb;
        String string;
        int i;
        Formattable formattable;
        int i2;
        Formatter formatter;
        int i3;
        int iIntValue;
        ncj ncjVar2;
        Number number;
        boolean zM17334d;
        long jLongValue;
        String string2;
        int i4;
        int i5;
        boolean zIsValidCodePoint;
        switch (nciVar.f42001m) {
            case GENERAL:
                sb = this.f42152d;
                switch (nciVar) {
                    case null:
                        if (!(obj instanceof Formattable)) {
                            formattable = (Formattable) obj;
                            i2 = ncjVar.f42006b & 162;
                            if (i2 != 0) {
                                int i6 = (i2 & 32) == 0 ? 0 : 1;
                                if ((i2 & 128) != 0) {
                                    i3 = 2;
                                } else {
                                    i3 = 0;
                                }
                                i2 = i6 | i3 | ((i2 & 2) != 0 ? 4 : 0);
                            }
                            int length = sb.length();
                            formatter = new Formatter(sb, ncp.f42021a);
                            try {
                                formattable.formatTo(formatter, i2, ncjVar.f42007c, ncjVar.f42008d);
                                return;
                            } catch (RuntimeException e) {
                                sb.setLength(length);
                                try {
                                    formatter.out().append(ncp.m17342a(formattable, e));
                                    return;
                                } catch (IOException e2) {
                                    return;
                                }
                            }
                        }
                        if (ncjVar.m17333c()) {
                            sb.append(ncp.m17343b(obj));
                            return;
                        }
                        break;
                    case 1:
                    case 3:
                        if (ncjVar.m17333c()) {
                            sb.append(obj);
                            return;
                        }
                        break;
                    case 2:
                        if (ncjVar.m17333c()) {
                            if (obj instanceof Character) {
                                sb.append(obj);
                                return;
                            }
                            iIntValue = ((Number) obj).intValue();
                            if ((iIntValue >>> 16) == 0) {
                                sb.append((char) iIntValue);
                                return;
                            } else {
                                sb.append(Character.toChars(iIntValue));
                                return;
                            }
                        }
                        break;
                    case 5:
                        if (ncjVar.m17333c()) {
                            ncjVar2 = ncjVar;
                        } else {
                            i4 = ncjVar.f42006b;
                            i5 = i4 & 128;
                            if (i5 == 0) {
                                ncjVar2 = ncj.f42004a;
                            } else if (i5 != i4 && ncjVar.f42007c == -1 && ncjVar.f42008d == -1) {
                                ncjVar2 = ncjVar;
                            } else {
                                ncjVar2 = new ncj(i5, -1, -1);
                            }
                        }
                        if (ncjVar2.equals(ncjVar)) {
                            number = (Number) obj;
                            zM17334d = ncjVar.m17334d();
                            jLongValue = number.longValue();
                            if (number instanceof Long) {
                                ncp.m17344c(sb, jLongValue, zM17334d);
                                return;
                            }
                            if (number instanceof Integer) {
                                ncp.m17344c(sb, jLongValue & 4294967295L, zM17334d);
                                return;
                            }
                            if (number instanceof Byte) {
                                ncp.m17344c(sb, jLongValue & 255, zM17334d);
                                return;
                            }
                            if (number instanceof Short) {
                                ncp.m17344c(sb, jLongValue & 65535, zM17334d);
                                return;
                            } else {
                                if (number instanceof BigInteger) {
                                    throw new IllegalStateException("unsupported number type: ".concat(String.valueOf(String.valueOf(number.getClass()))));
                                }
                                string2 = ((BigInteger) number).toString(16);
                                if (zM17334d) {
                                    string2 = string2.toUpperCase(ncp.f42021a);
                                }
                                sb.append(string2);
                                return;
                            }
                        }
                        break;
                }
                string = nciVar.f42003o;
                if (!ncjVar.m17333c()) {
                    i = nciVar.f42000l;
                    if (ncjVar.m17334d()) {
                        i &= 65503;
                    }
                    StringBuilder sb2 = new StringBuilder("%");
                    ncjVar.m17336f(sb2);
                    sb2.append((char) i);
                    string = sb2.toString();
                }
                sb.append(String.format(ncp.f42021a, string, obj));
            case BOOLEAN:
                zIsValidCodePoint = obj instanceof Boolean;
                break;
            case CHARACTER:
                if (!(obj instanceof Character)) {
                    zIsValidCodePoint = (!(obj instanceof Integer) && !(obj instanceof Byte) && !(obj instanceof Short)) ? false : Character.isValidCodePoint(((Number) obj).intValue());
                } else {
                    zIsValidCodePoint = true;
                }
                break;
            case INTEGRAL:
                zIsValidCodePoint = (obj instanceof Integer) || (obj instanceof Long) || (obj instanceof Byte) || (obj instanceof Short) || (obj instanceof BigInteger);
                break;
            case FLOAT:
                zIsValidCodePoint = (obj instanceof Double) || (obj instanceof Float) || (obj instanceof BigDecimal);
                break;
            default:
                throw null;
        }
        if (!zIsValidCodePoint) {
            m17419d(this.f42152d, obj, nciVar.f42003o);
            return;
        }
        sb = this.f42152d;
        switch (nciVar) {
            case STRING:
                if (!(obj instanceof Formattable)) {
                    formattable = (Formattable) obj;
                    i2 = ncjVar.f42006b & 162;
                    if (i2 != 0) {
                        if ((i2 & 32) == 0) {
                        }
                        if ((i2 & 128) != 0) {
                            i3 = 2;
                        } else {
                            i3 = 0;
                        }
                        i2 = i6 | i3 | ((i2 & 2) != 0 ? 4 : 0);
                    }
                    int length2 = sb.length();
                    formatter = new Formatter(sb, ncp.f42021a);
                    formattable.formatTo(formatter, i2, ncjVar.f42007c, ncjVar.f42008d);
                    return;
                }
                if (ncjVar.m17333c()) {
                    sb.append(ncp.m17343b(obj));
                    return;
                }
                break;
            case BOOLEAN:
            case DECIMAL:
                if (ncjVar.m17333c()) {
                    sb.append(obj);
                    return;
                }
                break;
            case CHAR:
                if (ncjVar.m17333c()) {
                    if (obj instanceof Character) {
                        sb.append(obj);
                        return;
                    }
                    iIntValue = ((Number) obj).intValue();
                    if ((iIntValue >>> 16) == 0) {
                        sb.append((char) iIntValue);
                        return;
                    } else {
                        sb.append(Character.toChars(iIntValue));
                        return;
                    }
                }
                break;
            case HEX:
                if (ncjVar.m17333c()) {
                    i4 = ncjVar.f42006b;
                    i5 = i4 & 128;
                    if (i5 == 0) {
                        ncjVar2 = ncj.f42004a;
                    } else {
                        if (i5 != i4) {
                        }
                        ncjVar2 = new ncj(i5, -1, -1);
                    }
                } else {
                    ncjVar2 = ncjVar;
                }
                if (ncjVar2.equals(ncjVar)) {
                    number = (Number) obj;
                    zM17334d = ncjVar.m17334d();
                    jLongValue = number.longValue();
                    if (number instanceof Long) {
                        ncp.m17344c(sb, jLongValue, zM17334d);
                        return;
                    }
                    if (number instanceof Integer) {
                        ncp.m17344c(sb, jLongValue & 4294967295L, zM17334d);
                        return;
                    }
                    if (number instanceof Byte) {
                        ncp.m17344c(sb, jLongValue & 255, zM17334d);
                        return;
                    }
                    if (number instanceof Short) {
                        ncp.m17344c(sb, jLongValue & 65535, zM17334d);
                        return;
                    } else {
                        if (number instanceof BigInteger) {
                            throw new IllegalStateException("unsupported number type: ".concat(String.valueOf(String.valueOf(number.getClass()))));
                        }
                        string2 = ((BigInteger) number).toString(16);
                        if (zM17334d) {
                            string2 = string2.toUpperCase(ncp.f42021a);
                        }
                        sb.append(string2);
                        return;
                    }
                }
                break;
        }
        string = nciVar.f42003o;
        if (!ncjVar.m17333c()) {
            i = nciVar.f42000l;
            if (ncjVar.m17334d()) {
                i &= 65503;
            }
            StringBuilder sb3 = new StringBuilder("%");
            ncjVar.m17336f(sb3);
            sb3.append((char) i);
            string = sb3.toString();
        }
        sb.append(String.format(ncp.f42021a, string, obj));
    }

    /* JADX INFO: renamed from: b */
    public final ner m17420b() {
        return this.f42154f.f42052a;
    }

    /* JADX INFO: renamed from: c */
    public final String m17421c() {
        return this.f42154f.f42053b;
    }
}
