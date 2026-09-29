package p000;

import com.lingq.core.domain.model.lesson.Translation;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public abstract class jjd {
    /* JADX INFO: renamed from: a */
    public static final double m14509a(double d) {
        return ss5.m21694U(d * 10.0d) / 10.0d;
    }

    /* JADX INFO: renamed from: b */
    public static final ArrayList m14510b(String str, String str2, List list) {
        list.getClass();
        str.getClass();
        str2.getClass();
        ArrayList arrayList = new ArrayList(list);
        Iterator it = arrayList.iterator();
        int i = 0;
        while (true) {
            if (!it.hasNext()) {
                i = -1;
                break;
            }
            if (fa4.m11650l(((Translation) it.next()).f19335b, str)) {
                break;
            }
            i++;
        }
        if (i < 0) {
            arrayList.add(new Translation(str2, str, false));
            return arrayList;
        }
        String str3 = ((Translation) arrayList.get(i)).f19335b;
        str3.getClass();
        arrayList.set(i, new Translation(str2, str3, false));
        return arrayList;
    }
}
