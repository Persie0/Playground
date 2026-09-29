package p000;

import android.content.Context;
import com.lingq.core.designsystem.R$attr;
import com.lingq.core.designsystem.R$color;
import com.lingq.core.p012ui.R$string;
import com.lingq.core.p012ui.challenges.ChallengeType;
import com.lingq.core.p012ui.challenges.HardcoreChallengeType;
import com.lingq.core.p012ui.challenges.Monthly90DaysChallengeType;
import com.lingq.core.p012ui.challenges.MonthlyLingqingType;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.EmptyList;

/* JADX INFO: loaded from: classes2.dex */
public abstract class e6d {
    /* JADX INFO: renamed from: a */
    public static final boolean m10896a(String str, String str2) {
        str.getClass();
        if (str.equals(str2)) {
            return true;
        }
        if (str.length() != 0) {
            int i = 0;
            int i2 = 0;
            int i3 = 0;
            while (i < str.length()) {
                char cCharAt = str.charAt(i);
                int i4 = i3 + 1;
                if (i3 != 0 || cCharAt == '(') {
                    if (cCharAt == '(') {
                        i2++;
                    } else if (cCharAt == ')' && (i2 = i2 - 1) == 0 && i3 != str.length() - 1) {
                    }
                    i++;
                    i3 = i4;
                }
            }
            if (i2 == 0) {
                return fa4.m11650l(vk9.m23376L0(str.substring(1, str.length() - 1)).toString(), str2);
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: b */
    public static final String m10897b(Collection collection) {
        collection.getClass();
        return !collection.isEmpty() ? wk9.m24028K(u91.m22596N0(collection, ",\n", "\n", "\n", null, 56), "    ").concat("},") : " }";
    }

    /* JADX INFO: renamed from: c */
    public static final String m10898c(Collection collection) {
        return wk9.m24028K(u91.m22596N0(collection, ",", null, null, null, 62), "    ").concat(wk9.m24028K(" }", "    "));
    }

    /* JADX INFO: renamed from: d */
    public static final String m10899d(Collection collection) {
        return wk9.m24028K(u91.m22596N0(collection, ",", null, null, null, 62), "    ").concat(wk9.m24028K("},", "    "));
    }

    /* JADX INFO: renamed from: e */
    public static final List m10900e(List list, ChallengeType challengeType, Context context) {
        Object next;
        String string;
        Object next2;
        String string2;
        Object next3;
        String string3;
        challengeType.getClass();
        context.getClass();
        int i = os0.f54928a[challengeType.ordinal()];
        if (i == 1) {
            List<jr0> list2 = list;
            ArrayList arrayList = new ArrayList(v91.m23189q0(list2, 10));
            for (jr0 jr0Var : list2) {
                Iterator<E> it = HardcoreChallengeType.getEntries().iterator();
                do {
                    if (!it.hasNext()) {
                        next = null;
                        break;
                    }
                    next = it.next();
                } while (!fa4.m11650l(((HardcoreChallengeType) next).getValue(), jr0Var.f46022b));
                HardcoreChallengeType hardcoreChallengeType = (HardcoreChallengeType) next;
                arrayList.add(new hr0(jr0Var.f46023c, jr0Var.f46025e, hardcoreChallengeType != null ? jfa.m14431n(context, hardcoreChallengeType.getColor()) : jfa.m14431n(context, R$attr.greenTint), (hardcoreChallengeType == null || (string = context.getString(hardcoreChallengeType.getTitle())) == null) ? "" : string));
            }
            return arrayList;
        }
        if (i == 2) {
            List<jr0> list3 = list;
            ArrayList arrayList2 = new ArrayList(v91.m23189q0(list3, 10));
            for (jr0 jr0Var2 : list3) {
                Iterator<E> it2 = Monthly90DaysChallengeType.getEntries().iterator();
                do {
                    if (!it2.hasNext()) {
                        next2 = null;
                        break;
                    }
                    next2 = it2.next();
                } while (!fa4.m11650l(((Monthly90DaysChallengeType) next2).getValue(), jr0Var2.f46022b));
                Monthly90DaysChallengeType monthly90DaysChallengeType = (Monthly90DaysChallengeType) next2;
                arrayList2.add(new hr0(jr0Var2.f46023c, jr0Var2.f46025e, jfa.m14431n(context, R$attr.greenTint), (monthly90DaysChallengeType == null || (string2 = context.getString(monthly90DaysChallengeType.getTitle())) == null) ? "" : string2));
            }
            return arrayList2;
        }
        if (i != 3) {
            if (i != 4) {
                return EmptyList.f47638a;
            }
            List<jr0> list4 = list;
            ArrayList arrayList3 = new ArrayList(v91.m23189q0(list4, 10));
            for (jr0 jr0Var3 : list4) {
                double d = jr0Var3.f46023c;
                double d2 = jr0Var3.f46025e;
                String string4 = context.getString(R$string.stats_known_words);
                string4.getClass();
                arrayList3.add(new hr0(d, d2, jfa.m14431n(context, R$attr.greenTint), string4));
            }
            return arrayList3;
        }
        List<jr0> list5 = list;
        ArrayList arrayList4 = new ArrayList(v91.m23189q0(list5, 10));
        for (jr0 jr0Var4 : list5) {
            Iterator<E> it3 = MonthlyLingqingType.getEntries().iterator();
            do {
                if (!it3.hasNext()) {
                    next3 = null;
                    break;
                }
                next3 = it3.next();
            } while (!fa4.m11650l(((MonthlyLingqingType) next3).getValue(), jr0Var4.f46022b));
            MonthlyLingqingType monthlyLingqingType = (MonthlyLingqingType) next3;
            arrayList4.add(new hr0(jr0Var4.f46023c, jr0Var4.f46025e, context.getColor(monthlyLingqingType != null ? monthlyLingqingType.getColor() : R$color.gold_activity_1), (monthlyLingqingType == null || (string3 = context.getString(monthlyLingqingType.getTitle())) == null) ? "" : string3));
        }
        return u91.m22614f1(arrayList4, new ma3(6));
    }
}
