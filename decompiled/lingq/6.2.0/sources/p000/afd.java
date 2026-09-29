package p000;

import com.lingq.core.domain.model.lesson.LessonCard;
import com.lingq.core.domain.model.token.TextTokenType;
import com.lingq.core.domain.model.token.TokenTransliteration;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.ListIterator;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.logging.Level;
import java.util.logging.Logger;
import kotlin.collections.EmptyList;
import kotlin.text.Regex;

/* JADX INFO: loaded from: classes2.dex */
public abstract class afd {
    /* JADX INFO: renamed from: a */
    public static final ArrayList m361a(List list, Map map, Locale locale, int i, Integer num) {
        Iterable iterableM22615g1;
        map.getClass();
        Collection collectionValues = map.values();
        ArrayList<LessonCard> arrayList = new ArrayList();
        for (Object obj : collectionValues) {
            if (((LessonCard) obj).f19182e) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayListM363c = m363c(list);
        for (LessonCard lessonCard : arrayList) {
            List listM15429h = new Regex("[ \\-]").m15429h(lessonCard.f19178a);
            int i2 = 1;
            if (listM15429h.isEmpty()) {
                iterableM22615g1 = EmptyList.f47638a;
                break;
            }
            ListIterator listIterator = listM15429h.listIterator(listM15429h.size());
            while (true) {
                if (!listIterator.hasPrevious()) {
                    iterableM22615g1 = EmptyList.f47638a;
                    break;
                }
                if (((String) listIterator.previous()).length() != 0) {
                    iterableM22615g1 = u91.m22615g1(listM15429h, listIterator.nextIndex() + 1);
                    break;
                }
            }
            Iterable iterable = iterableM22615g1;
            ArrayList arrayList3 = new ArrayList(v91.m23189q0(iterable, 10));
            Iterator it = iterable.iterator();
            while (it.hasNext()) {
                arrayList3.add(vz1.m23610P((String) it.next(), locale));
            }
            ArrayList arrayList4 = new ArrayList();
            int i3 = 0;
            int i4 = 0;
            while (i3 < arrayListM363c.size()) {
                xz7 xz7Var = (xz7) arrayListM363c.get(i3);
                if (xz7Var.f69014k == TextTokenType.PUNCT) {
                    if (!arrayList4.isEmpty()) {
                        arrayList4.add(xz7Var);
                    }
                    i3++;
                } else {
                    String strM23610P = vz1.m23610P(xz7Var.f69008e, locale);
                    if (i4 < arrayList3.size()) {
                        if (!arrayList4.isEmpty() && xz7Var.f69010g != ((xz7) u91.m22589G0(arrayList4)).f69010g) {
                            arrayList4.clear();
                            i4 = 0;
                        }
                        if (strM23610P.equalsIgnoreCase((String) arrayList3.get(i4))) {
                            arrayList4.add(xz7Var);
                            i4++;
                        } else {
                            arrayList4.clear();
                            if (arrayList3.isEmpty() || !strM23610P.equalsIgnoreCase((String) arrayList3.get(0))) {
                                i4 = 0;
                            } else {
                                arrayList4.add(xz7Var);
                                i4 = i2;
                            }
                        }
                    }
                    if (i4 == arrayList3.size()) {
                        List listM364d = m364d(arrayList4, list, num);
                        if (!listM364d.isEmpty()) {
                            int iM15945h = l70.m15945h(((xz7) u91.m22589G0(listM364d)).f69004a, 0, i);
                            arrayList2.add(new d87(((xz7) u91.m22589G0(listM364d)).f69009f, iM15945h, l70.m15945h(((xz7) u91.m22597O0(listM364d)).f69005b, iM15945h, i), vz1.m23610P(lessonCard.f19178a, locale), listM364d, lessonCard.f19188k, lessonCard.f19189l, false));
                        }
                        arrayList4.clear();
                        i4 = 0;
                    }
                    i3++;
                    i2 = 1;
                }
            }
        }
        return arrayList2;
    }

    /* JADX INFO: renamed from: b */
    public static final ArrayList m362b(List list, Map map, Locale locale, Integer num) {
        Iterable iterableM22615g1;
        List<xz7> list2 = list;
        map.getClass();
        Collection collectionValues = map.values();
        ArrayList<LessonCard> arrayList = new ArrayList();
        for (Object obj : collectionValues) {
            if (((LessonCard) obj).f19182e) {
                arrayList.add(obj);
            }
        }
        ArrayList<xz7> arrayList2 = new ArrayList();
        ArrayList arrayListM363c = m363c(list2);
        for (LessonCard lessonCard : arrayList) {
            List listM15429h = new Regex("[ \\-]").m15429h(lessonCard.f19178a);
            if (listM15429h.isEmpty()) {
                iterableM22615g1 = EmptyList.f47638a;
                break;
            }
            ListIterator listIterator = listM15429h.listIterator(listM15429h.size());
            while (true) {
                if (!listIterator.hasPrevious()) {
                    iterableM22615g1 = EmptyList.f47638a;
                    break;
                }
                if (((String) listIterator.previous()).length() != 0) {
                    iterableM22615g1 = u91.m22615g1(listM15429h, listIterator.nextIndex() + 1);
                    break;
                }
            }
            Iterable iterable = iterableM22615g1;
            ArrayList arrayList3 = new ArrayList(v91.m23189q0(iterable, 10));
            Iterator it = iterable.iterator();
            while (it.hasNext()) {
                arrayList3.add(vz1.m23610P((String) it.next(), locale));
            }
            ArrayList arrayList4 = new ArrayList();
            int i = 0;
            int i2 = 0;
            while (i < arrayListM363c.size()) {
                xz7 xz7Var = (xz7) arrayListM363c.get(i);
                if (xz7Var.f69014k == TextTokenType.PUNCT) {
                    if (!arrayList4.isEmpty()) {
                        arrayList4.add(xz7Var);
                    }
                    i++;
                } else {
                    String strM23610P = vz1.m23610P(xz7Var.f69008e, locale);
                    if (i2 < arrayList3.size()) {
                        if (!arrayList4.isEmpty() && xz7Var.f69010g != ((xz7) u91.m22589G0(arrayList4)).f69010g) {
                            arrayList4.clear();
                            i2 = 0;
                        }
                        if (strM23610P.equalsIgnoreCase((String) arrayList3.get(i2))) {
                            arrayList4.add(xz7Var);
                            i2++;
                        } else {
                            arrayList4.clear();
                            if (arrayList3.isEmpty() || !strM23610P.equalsIgnoreCase((String) arrayList3.get(0))) {
                                i2 = 0;
                            } else {
                                arrayList4.add(xz7Var);
                                i2 = 1;
                            }
                        }
                    }
                    if (i2 == arrayList3.size()) {
                        List listM364d = m364d(arrayList4, list2, num);
                        if (!listM364d.isEmpty()) {
                            arrayList2.add(new xz7(((xz7) u91.m22589G0(listM364d)).f69004a, ((xz7) u91.m22597O0(listM364d)).f69005b, 0, 0, vz1.m23610P(lessonCard.f19178a, locale), ((xz7) u91.m22589G0(listM364d)).f69009f, 0, 0, (String) null, (TokenTransliteration) null, TextTokenType.PHRASE, 0, (Map) null, (String) null, (String) null, (String) null, 261068));
                        }
                        arrayList4.clear();
                        i2 = 0;
                    }
                    i++;
                }
            }
        }
        ArrayList<iy7> arrayList5 = new ArrayList();
        for (xz7 xz7Var2 : arrayList2) {
            arrayList5.add(new iy7(xz7Var2, xz7Var2.f69009f));
        }
        if (num != null) {
            ArrayList arrayList6 = new ArrayList();
            for (Object obj2 : list2) {
                if (((xz7) obj2).f69016m == num.intValue()) {
                    arrayList6.add(obj2);
                }
            }
            list2 = arrayList6;
        }
        for (iy7 iy7Var : arrayList5) {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            ArrayList arrayList7 = new ArrayList();
            for (xz7 xz7Var3 : list2) {
                xz7 xz7Var4 = iy7Var.f44779a;
                if (vk9.m23380c0(vz1.m23610P(xz7Var4.f69008e, locale), vz1.m23610P(xz7Var3.f69008e, locale), false) && xz7Var3.f69004a >= xz7Var4.f69004a && xz7Var3.f69005b <= xz7Var4.f69005b) {
                    linkedHashMap.put(xz7Var3.f69008e, xz7Var3);
                    arrayList7.add(xz7Var3);
                }
            }
            iy7Var.getClass();
            iy7Var.f44782d = arrayList7;
            iy7Var.f44781c = linkedHashMap;
        }
        return arrayList5;
    }

    /* JADX INFO: renamed from: c */
    public static final ArrayList m363c(List list) {
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            xz7 xz7Var = (xz7) obj;
            if (xz7Var.f69014k == TextTokenType.PUNCT || linkedHashSet.add(Integer.valueOf(xz7Var.f69009f))) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: d */
    public static final List m364d(ArrayList arrayList, List list, Integer num) {
        TextTokenType textTokenType;
        if (num == null) {
            return u91.m22622n1(arrayList);
        }
        ArrayList arrayList2 = new ArrayList();
        for (Object obj : arrayList) {
            if (((xz7) obj).f69014k != TextTokenType.PUNCT) {
                arrayList2.add(obj);
            }
        }
        ArrayList arrayList3 = new ArrayList(v91.m23189q0(arrayList2, 10));
        Iterator it = arrayList2.iterator();
        while (it.hasNext()) {
            arrayList3.add(Integer.valueOf(((xz7) it.next()).f69009f));
        }
        Set setM22627s1 = u91.m22627s1(arrayList3);
        ArrayList arrayList4 = new ArrayList();
        for (Object obj2 : arrayList) {
            if (((xz7) obj2).f69014k == TextTokenType.PUNCT) {
                arrayList4.add(obj2);
            }
        }
        Set setM22627s2 = u91.m22627s1(arrayList4);
        ArrayList arrayList5 = new ArrayList();
        for (Object obj3 : list) {
            xz7 xz7Var = (xz7) obj3;
            int i = xz7Var.f69016m;
            TextTokenType textTokenType2 = xz7Var.f69014k;
            if (i == num.intValue() && ((textTokenType2 != (textTokenType = TextTokenType.PUNCT) && setM22627s1.contains(Integer.valueOf(xz7Var.f69009f))) || (textTokenType2 == textTokenType && setM22627s2.contains(xz7Var)))) {
                arrayList5.add(obj3);
            }
        }
        return arrayList5;
    }

    /* JADX INFO: renamed from: e */
    public static String m365e(String str, Object... objArr) {
        int length;
        int iIndexOf;
        StringBuilder sb = new StringBuilder(str.length() + (objArr.length * 16));
        int i = 0;
        int i2 = 0;
        while (true) {
            length = objArr.length;
            if (i >= length || (iIndexOf = str.indexOf("%s", i2)) == -1) {
                break;
            }
            sb.append((CharSequence) str, i2, iIndexOf);
            sb.append(m366f(objArr[i]));
            i2 = iIndexOf + 2;
            i++;
        }
        sb.append((CharSequence) str, i2, str.length());
        if (i < length) {
            String str2 = " [";
            while (i < objArr.length) {
                sb.append(str2);
                sb.append(m366f(objArr[i]));
                i++;
                str2 = ", ";
            }
            sb.append(']');
        }
        return sb.toString();
    }

    /* JADX INFO: renamed from: f */
    public static String m366f(Object obj) {
        if (obj == null) {
            return "null";
        }
        try {
            return obj.toString();
        } catch (Exception e) {
            String name = obj.getClass().getName();
            String hexString = Integer.toHexString(System.identityHashCode(obj));
            String strM17739n = AbstractC3393o1.m17739n(new StringBuilder(name.length() + 1 + String.valueOf(hexString).length()), name, "@", hexString);
            Logger.getLogger("com.google.common.base.Strings").logp(Level.WARNING, "com.google.common.base.Strings", "lenientToString", "Exception during lenientFormat for ".concat(strM17739n), (Throwable) e);
            String name2 = e.getClass().getName();
            StringBuilder sb = new StringBuilder(strM17739n.length() + 8 + name2.length() + 1);
            AbstractC3393o1.m17725C(sb, "<", strM17739n, " threw ", name2);
            sb.append(">");
            return sb.toString();
        }
    }
}
