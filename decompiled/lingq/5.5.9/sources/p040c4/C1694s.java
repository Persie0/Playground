package p040c4;

import android.annotation.SuppressLint;
import android.support.v4.media.C0141b;
import androidx.navigation.Navigator;
import dm.C5207g;
import java.util.LinkedHashMap;

/* JADX INFO: renamed from: c4.s */
/* JADX INFO: loaded from: classes.dex */
@SuppressLint({"TypeParameterUnusedInFormals"})
public class C1694s {

    /* JADX INFO: renamed from: b */
    public static final LinkedHashMap f9459b = new LinkedHashMap();

    /* JADX INFO: renamed from: a */
    public final LinkedHashMap f9460a = new LinkedHashMap();

    /* JADX INFO: renamed from: c4.s$a */
    public static final class a {
        /* JADX INFO: renamed from: a */
        public static String m5426a(Class cls) {
            LinkedHashMap linkedHashMap = C1694s.f9459b;
            String strValue = (String) linkedHashMap.get(cls);
            if (strValue == null) {
                Navigator.InterfaceC1082b interfaceC1082b = (Navigator.InterfaceC1082b) cls.getAnnotation(Navigator.InterfaceC1082b.class);
                strValue = interfaceC1082b != null ? interfaceC1082b.value() : null;
                if (!m5427b(strValue)) {
                    throw new IllegalArgumentException("No @Navigator.Name annotation found for ".concat(cls.getSimpleName()).toString());
                }
                linkedHashMap.put(cls, strValue);
            }
            C5207g.m11108c(strValue);
            return strValue;
        }

        /* JADX INFO: renamed from: b */
        public static boolean m5427b(String str) {
            boolean z10 = false;
            if (str != null) {
                if (str.length() > 0) {
                    z10 = true;
                }
            }
            return z10;
        }
    }

    /* JADX WARN: Unreachable blocks removed: 2, instructions: 2 */
    /* JADX INFO: renamed from: a */
    public final void m5425a(Navigator navigator) {
        String strM5426a = a.m5426a(navigator.getClass());
        if (!a.m5427b(strM5426a)) {
            throw new IllegalArgumentException("navigator name cannot be an empty string".toString());
        }
        LinkedHashMap linkedHashMap = this.f9460a;
        Navigator navigator2 = (Navigator) linkedHashMap.get(strM5426a);
        if (C5207g.m11106a(navigator2, navigator)) {
            return;
        }
        if (!(!(navigator2 != null && navigator2.f6854b))) {
            throw new IllegalStateException(("Navigator " + navigator + " is replacing an already attached " + navigator2).toString());
        }
        if (!navigator.f6854b) {
            return;
        }
        throw new IllegalStateException(("Navigator " + navigator + " is already attached to another NavController").toString());
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    /* JADX INFO: renamed from: b */
    public <T extends Navigator<?>> T mo5414b(String str) {
        C5207g.m11111f(str, "name");
        if (!a.m5427b(str)) {
            throw new IllegalArgumentException("navigator name cannot be an empty string".toString());
        }
        T t10 = (T) this.f9460a.get(str);
        if (t10 != null) {
            return t10;
        }
        throw new IllegalStateException(C0141b.m611g("Could not find Navigator with name \"", str, "\". You must call NavController.addNavigator() for each navigation type."));
    }
}
