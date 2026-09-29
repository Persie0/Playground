package p000;

import android.widget.EditText;
import com.lingq.core.domain.model.lesson.LessonCard;
import com.lingq.core.domain.model.lesson.LessonWord;
import com.lingq.core.domain.model.status.CardStatus;
import com.lingq.core.domain.model.status.WordStatus;
import com.lingq.core.domain.model.token.TextTokenType;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import kotlin.collections.EmptyList;

/* JADX INFO: loaded from: classes2.dex */
public abstract class wbd {
    /* JADX WARN: Code duplicated, block: B:51:0x00d2  */
    /* JADX INFO: renamed from: a */
    public static final ArrayList m23840a(List list, Map map, Map map2, Locale locale, boolean z) {
        String value;
        boolean z2;
        q7b q7bVar;
        list.getClass();
        map.getClass();
        map2.getClass();
        List<xz7> list2 = list;
        ArrayList arrayList = new ArrayList(v91.m23189q0(list2, 10));
        for (xz7 xz7Var : list2) {
            if (xz7Var.f69014k == TextTokenType.LINK) {
                q7bVar = new q7b(xz7Var, false, false, 0, (Integer) null, (String) null, false, false, 254);
            } else {
                String strM23610P = vz1.m23610P(xz7Var.f69008e, locale);
                LessonCard lessonCard = (LessonCard) map.get(strM23610P);
                LessonWord lessonWord = (LessonWord) map2.get(strM23610P);
                boolean z3 = xz7Var.f69014k == TextTokenType.PUNCT;
                LessonWord lessonWord2 = !z3 ? lessonWord : null;
                boolean z4 = (lessonCard == null || y7d.m24985d(lessonCard.f19178a)) ? false : true;
                boolean z5 = lessonWord2 != null && lessonCard == null;
                int value2 = lessonCard != null ? lessonCard.f19188k : CardStatus.Ignored.getValue();
                Integer num = lessonCard != null ? lessonCard.f19189l : null;
                if (lessonWord2 == null || (value = lessonWord2.f19322i) == null) {
                    value = WordStatus.Known.getValue();
                }
                if (z3 || ((lessonCard != null && lessonCard.f19188k == CardStatus.Known.getValue()) || (lessonCard != null && lessonCard.f19188k == CardStatus.Learned.getValue()))) {
                    z2 = true;
                } else if (fa4.m11650l(lessonWord2 != null ? lessonWord2.f19322i : null, WordStatus.Known.getValue())) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                q7bVar = new q7b(xz7Var, z4, z5, value2, num, value, z && (lessonCard == null ? !(lessonWord == null || fa4.m11650l(lessonWord.f19322i, WordStatus.New.getValue())) : !lessonCard.m8042j()), z2, 256);
            }
            arrayList.add(q7bVar);
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: b */
    public static final List m23841b(ArrayList arrayList) {
        if (!arrayList.isEmpty()) {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                q7b q7bVar = (q7b) it.next();
                if (q7bVar.f57358b || q7bVar.f57359c || q7bVar.f57365i) {
                    return arrayList;
                }
            }
        }
        return EmptyList.f47638a;
    }

    /* JADX INFO: renamed from: c */
    public static boolean m23842c(EditText editText) {
        return editText.getInputType() != 0;
    }
}
