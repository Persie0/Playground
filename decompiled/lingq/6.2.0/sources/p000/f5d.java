package p000;

import androidx.concurrent.futures.C0464b;
import com.lingq.core.domain.model.library.Accent;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Locale;
import kotlin.Pair;

/* JADX INFO: loaded from: classes2.dex */
public abstract class f5d {
    /* JADX INFO: renamed from: a */
    public static final String m11559a(String str) {
        str.getClass();
        ys2 entries = Accent.getEntries();
        ArrayList arrayList = new ArrayList(v91.m23189q0(entries, 10));
        Iterator<E> it = entries.iterator();
        while (it.hasNext()) {
            arrayList.add(((Accent) it.next()).getValue());
        }
        String str2 = null;
        for (String str3 : u91.m22620l1(arrayList)) {
            if (vk9.m23380c0(str, str3, false)) {
                str2 = str3;
            }
        }
        return str2;
    }

    /* JADX INFO: renamed from: b */
    public static final Pair m11560b(int i, String str) {
        int iM23389l0;
        str.getClass();
        String str2 = String.format(Locale.getDefault(), "%,d", Arrays.copyOf(new Object[]{Integer.valueOf(i)}, 1));
        int i2 = 0;
        int i3 = 0;
        int length = 0;
        while (i2 < str.length() && (iM23389l0 = vk9.m23389l0(str, str2, i2, false, 4)) != -1) {
            length = str2.length() + iM23389l0;
            i2++;
            i3 = iM23389l0;
        }
        return new Pair(Integer.valueOf(i3), Integer.valueOf(length));
    }

    /* JADX INFO: renamed from: c */
    public static gm0 m11561c(em0 em0Var) {
        C0464b c0464b = new C0464b();
        c0464b.f5330c = new r78();
        gm0 gm0Var = new gm0(c0464b);
        c0464b.f5329b = gm0Var;
        c0464b.f5328a = em0Var.getClass();
        try {
            Object objMo392c = em0Var.mo392c(c0464b);
            if (objMo392c == null) {
                return gm0Var;
            }
            c0464b.f5328a = objMo392c;
            return gm0Var;
        } catch (Exception e) {
            gm0Var.f40990b.mo20435l(e);
            return gm0Var;
        }
    }

    /* JADX INFO: renamed from: d */
    public static final boolean m11562d(String str) {
        str.getClass();
        String lowerCase = vk9.m23369E0('.', str, "").toLowerCase(Locale.ROOT);
        lowerCase.getClass();
        return AbstractC3550rv.m20855w0(new String[]{"mp3", "m4a", "wav"}).contains(lowerCase);
    }
}
