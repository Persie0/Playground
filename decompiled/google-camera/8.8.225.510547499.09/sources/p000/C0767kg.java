package p000;

import android.graphics.Insets;
import android.graphics.drawable.Drawable;
import android.hardware.camera2.params.OutputConfiguration;
import android.util.Log;
import android.util.Size;
import android.view.Surface;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;

/* JADX INFO: renamed from: kg */
/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class C0767kg {
    /* JADX INFO: renamed from: a */
    static Insets m14179a(Drawable drawable) {
        return drawable.getOpticalInsets();
    }

    /* JADX INFO: renamed from: b */
    public static final C1034ud m14180b(C0948qz c0948qz, C1097wm c1097wm, Map map, String str) {
        C0991so c0991so;
        OutputConfiguration outputConfiguration;
        List listM18666F;
        str.getClass();
        ArrayList arrayList = new ArrayList();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (C1095wk c1095wk : c1097wm.f47940b) {
            List list = c1095wk.f47931e;
            ArrayList arrayList2 = new ArrayList();
            Iterator it = list.iterator();
            while (it.hasNext()) {
                Surface surface = (Surface) map.get(C0979sc.m19386a(((C0959rj) it.next()).f47553a));
                if (surface != null) {
                    arrayList2.add(surface);
                }
            }
            if (arrayList2.size() != c1095wk.f47931e.size()) {
                List list2 = c1095wk.f47931e;
                ArrayList arrayList3 = new ArrayList();
                for (Object obj : list2) {
                    if (!map.containsKey(C0979sc.m19386a(((C0959rj) obj).f47553a))) {
                        arrayList3.add(obj);
                    }
                }
                throw new IllegalStateException("Surfaces are not yet available for " + c1095wk + "! Missing surfaces for " + arrayList3 + '!');
            }
            Surface surface2 = (Surface) omn.m18671K(arrayList2);
            Size size = c1095wk.f47927a;
            boolean z = c1095wk.f47932f;
            Integer num = c1095wk.f47930d;
            int iIntValue = num != null ? num.intValue() : -1;
            String str2 = !ooc.m18737c(c1095wk.f47929c, c0948qz.f47514a) ? c1095wk.f47929c : null;
            if (surface2 == null) {
                StringBuilder sb = new StringBuilder();
                sb.append("OutputConfigurations defined with ");
                sb.append((Object) "SURFACE");
                sb.append(" must provide a");
                throw new IllegalStateException("non-null surface!");
            }
            if (iIntValue != -1) {
                try {
                    outputConfiguration = new OutputConfiguration(iIntValue, surface2);
                } catch (Throwable th) {
                    Log.w("CXCP", "Failed to create an OutputConfiguration for " + surface2 + '!', th);
                    c0991so = null;
                }
            } else {
                outputConfiguration = new OutputConfiguration(surface2);
            }
            if (z) {
                C0995ss.m19422d(outputConfiguration);
            }
            if (str2 != null) {
                C0996st.m19439l(outputConfiguration, str2);
            }
            C0996st.m19428a(outputConfiguration);
            c0991so = new C0991so(outputConfiguration);
            if (c0991so == null) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append("Failed to create AndroidOutputConfiguration for ");
                sb2.append(c1095wk);
                Log.w("CXCP", "Failed to create AndroidOutputConfiguration for ".concat(String.valueOf(c1095wk)));
            } else {
                int size2 = arrayList2.size() - 1;
                if (size2 <= 0) {
                    listM18666F = okv.f46215a;
                } else if (size2 != 1) {
                    ArrayList arrayList4 = new ArrayList(size2);
                    int size3 = arrayList2.size();
                    for (int i = 1; i < size3; i++) {
                        arrayList4.add(arrayList2.get(i));
                    }
                    listM18666F = arrayList4;
                } else {
                    if (arrayList2.isEmpty()) {
                        throw new NoSuchElementException("List is empty.");
                    }
                    listM18666F = omn.m18666F(arrayList2.get(omn.m18667G(arrayList2)));
                }
                Iterator it2 = listM18666F.iterator();
                while (it2.hasNext()) {
                    c0991so.m19405a((Surface) it2.next());
                }
                arrayList.add(c0991so);
            }
        }
        return new C1034ud(arrayList, linkedHashMap);
    }
}
