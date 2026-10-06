package p000;

import com.google.android.clockwork.common.wearable.wearmaterial.time.HuCi.yTyWiTtGtnBhy;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class oej {

    /* JADX INFO: renamed from: a */
    private final Map f45737a = new HashMap();

    /* JADX INFO: renamed from: a */
    public final String m18415a(String str) {
        if (!this.f45737a.containsKey(str.toLowerCase(Locale.US))) {
            return null;
        }
        StringBuilder sb = new StringBuilder();
        boolean z = true;
        for (String str2 : (List) this.f45737a.get(str.toLowerCase(Locale.US))) {
            if (str2 != null) {
                if (!z) {
                    sb.append(",");
                }
                sb.append(str2);
                z = false;
            }
        }
        return sb.toString();
    }

    /* JADX INFO: renamed from: b */
    public final List m18416b(String str) {
        List list = (List) this.f45737a.get(str.toLowerCase(Locale.US));
        if (list != null) {
            return list;
        }
        int i = mws.f41739d;
        return mzr.f41857a;
    }

    /* JADX INFO: renamed from: c */
    public final Set m18417c() {
        return Collections.unmodifiableSet(this.f45737a.keySet());
    }

    /* JADX INFO: renamed from: d */
    public final void m18418d(String str, String str2) {
        lku.m15669w(!str.isEmpty());
        str2.getClass();
        String lowerCase = str.toLowerCase(Locale.US);
        if (!this.f45737a.containsKey(lowerCase)) {
            this.f45737a.put(lowerCase, new ArrayList());
        }
        ((List) this.f45737a.get(lowerCase)).add(str2);
    }

    /* JADX INFO: renamed from: e */
    public final void m18419e(String str, String str2) {
        boolean z = false;
        if (str != null && !str.isEmpty()) {
            z = true;
        }
        lku.m15669w(z);
        str2.getClass();
        String lowerCase = str.toLowerCase(Locale.US);
        this.f45737a.put(lowerCase, new ArrayList());
        ((List) this.f45737a.get(lowerCase)).add(str2);
    }

    /* JADX INFO: renamed from: f */
    public final boolean m18420f(String str) {
        return this.f45737a.containsKey(str.toLowerCase(Locale.US));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v6, types: [java.lang.CharSequence, java.lang.Object] */
    public final String toString() {
        ArrayList arrayList = new ArrayList(this.f45737a.entrySet());
        Collections.sort(arrayList, ned.f42089b);
        StringBuilder sb = new StringBuilder("{");
        lyz lyzVarM16212h = lyz.m16212h(", ");
        Iterator it = arrayList.iterator();
        String str = yTyWiTtGtnBhy.MqdkTrnbKhcbt;
        try {
            if (it.hasNext()) {
                Map.Entry entry = (Map.Entry) it.next();
                sb.append(lyz.m16211f(entry.getKey()));
                sb.append((CharSequence) str);
                sb.append(lyz.m16211f(entry.getValue()));
                while (it.hasNext()) {
                    sb.append((CharSequence) lyzVarM16212h.f39584a);
                    Map.Entry entry2 = (Map.Entry) it.next();
                    sb.append(lyz.m16211f(entry2.getKey()));
                    sb.append((CharSequence) str);
                    sb.append(lyz.m16211f(entry2.getValue()));
                }
            }
            sb.append('}');
            return sb.toString();
        } catch (IOException e) {
            throw new AssertionError(e);
        }
    }
}
