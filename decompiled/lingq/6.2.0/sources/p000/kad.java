package p000;

import android.content.Context;
import androidx.compose.animation.AbstractC0054a;
import androidx.compose.animation.AbstractC0070i;
import androidx.compose.p002ui.platform.AbstractC0394f;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.TextStyle;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes3.dex */
public abstract class kad {
    /* JADX INFO: renamed from: a */
    public static final void m15048a(h24 h24Var, String str, vi3 vi3Var, ye1 ye1Var, int i) {
        vi3 vi3Var2;
        str.getClass();
        vi3Var.getClass();
        tj3 tj3Var = (tj3) ye1Var;
        tj3Var.m22115d0(1684146435);
        int i2 = (tj3Var.m22124i(h24Var) ? 4 : 2) | i | (tj3Var.m22120g(str) ? 32 : 16);
        if ((i & 384) == 0) {
            vi3Var2 = vi3Var;
            i2 |= tj3Var.m22124i(vi3Var2) ? 256 : 128;
        } else {
            vi3Var2 = vi3Var;
        }
        if (tj3Var.m22099R(i2 & 1, (i2 & 147) != 146)) {
            Context context = (Context) tj3Var.m22128k(AbstractC0394f.f4761b);
            boolean z = h24Var != null;
            vs2 vs2VarM778m = AbstractC0070i.m778m(null, 3);
            qv2 qv2VarM20180a = AbstractC0070i.m780o(null, 3).m20180a(AbstractC0070i.m773h(null, 3));
            WeakHashMap weakHashMap = l6b.f49204w;
            AbstractC0054a.m729d(z, wfb.m23904F(b16.f7762a, ho5.m13397r(tj3Var).f49210f), vs2VarM778m, qv2VarM20180a, null, ci8.m4703P(-1736082469, new C3357n2((Object) h24Var, (Object) context, str, vi3Var2, 21), tj3Var), tj3Var, 200064, 16);
        } else {
            tj3Var.m22102U();
        }
        x18 x18VarM22143u = tj3Var.m22143u();
        if (x18VarM22143u != null) {
            x18VarM22143u.f67642d = new y35(h24Var, str, vi3Var, i, 20);
        }
    }

    /* JADX INFO: renamed from: b */
    public static final String m15049b() {
        try {
            String str = new SimpleDateFormat("yyyy-MM-dd", Locale.getDefault()).format(Calendar.getInstance().getTime());
            str.getClass();
            return str;
        } catch (Exception unused) {
            return "";
        }
    }

    /* JADX INFO: renamed from: c */
    public static final List m15050c(String str, ArrayList arrayList) {
        String displayName;
        str.getClass();
        Locale localeForLanguageTag = Locale.forLanguageTag(cl9.m4839V(str, "_", "-"));
        DateTimeFormatter dateTimeFormatterOfPattern = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        ArrayList arrayList2 = new ArrayList();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            try {
                displayName = LocalDate.parse((String) it.next(), dateTimeFormatterOfPattern).getDayOfWeek().getDisplayName(TextStyle.SHORT, localeForLanguageTag);
            } catch (Exception unused) {
                displayName = null;
            }
            if (displayName != null) {
                arrayList2.add(displayName);
            }
        }
        if (arrayList2.size() >= 7) {
            return u91.m22615g1(arrayList2, 7);
        }
        int size = 7 - arrayList2.size();
        ArrayList arrayList3 = new ArrayList(size);
        for (int i = 0; i < size; i++) {
            arrayList3.add("");
        }
        return u91.m22603U0(arrayList3, arrayList2);
    }
}
