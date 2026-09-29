package p000;

import androidx.compose.runtime.internal.C0282a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
public abstract class opb {

    /* JADX INFO: renamed from: a */
    public static final C0282a f54704a = new C0282a(-1168749078, false, new nd1(7));

    /* JADX INFO: renamed from: b */
    public static final C0282a f54705b = new C0282a(364847270, false, new nd1(8));

    /* JADX INFO: renamed from: c */
    public static final C0282a f54706c = new C0282a(-292691759, false, new nd1(9));

    /* JADX INFO: renamed from: a */
    public static String m18202a(ArrayList arrayList) {
        Iterator it = arrayList.iterator();
        boolean z = false;
        String str = null;
        while (it.hasNext()) {
            String str2 = ((o8a) it.next()).f54015a.f40397g.f6406o;
            if (ez5.m11401k(str2)) {
                return "video/mp4";
            }
            if (ez5.m11398h(str2)) {
                z = true;
            } else if (ez5.m11399i(str2)) {
                if (Objects.equals(str2, "image/heic")) {
                    str = "image/heif";
                } else if (Objects.equals(str2, "image/avif")) {
                    str = "image/avif";
                }
            }
        }
        if (z) {
            return "audio/mp4";
        }
        return str != null ? str : "application/mp4";
    }
}
