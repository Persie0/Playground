package p000;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes2.dex */
public final class znd extends rfb {

    /* JADX INFO: renamed from: b */
    public final Map f71809b;

    public znd(afa afaVar, afa afaVar2) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        m25705d(linkedHashMap, afaVar);
        m25705d(linkedHashMap, afaVar2);
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            if (((end) entry.getKey()).f37586c) {
                entry.setValue(Collections.unmodifiableList((List) entry.getValue()));
            }
        }
        this.f71809b = Collections.unmodifiableMap(linkedHashMap);
    }

    /* JADX INFO: renamed from: d */
    public static void m25705d(LinkedHashMap linkedHashMap, afa afaVar) {
        for (int i = 0; i < afaVar.mo357g(); i++) {
            end endVarMo358h = afaVar.mo358h(i);
            Object obj = linkedHashMap.get(endVarMo358h);
            boolean z = endVarMo358h.f37586c;
            Class cls = endVarMo358h.f37585b;
            if (z) {
                List arrayList = (List) obj;
                if (arrayList == null) {
                    arrayList = new ArrayList();
                    linkedHashMap.put(endVarMo358h, arrayList);
                }
                arrayList.add(cls.cast(afaVar.mo359i(i)));
            } else {
                linkedHashMap.put(endVarMo358h, cls.cast(afaVar.mo359i(i)));
            }
        }
    }

    @Override // p000.rfb
    /* JADX INFO: renamed from: a */
    public final void mo20648a(vnd vndVar, qnd qndVar) {
        for (Map.Entry entry : this.f71809b.entrySet()) {
            end endVar = (end) entry.getKey();
            Object value = entry.getValue();
            if (endVar.f37586c) {
                vndVar.m23452b(endVar, ((List) value).iterator(), qndVar);
            } else {
                vndVar.m23451a(endVar, value, qndVar);
            }
        }
    }

    @Override // p000.rfb
    /* JADX INFO: renamed from: b */
    public final int mo20649b() {
        return this.f71809b.size();
    }

    @Override // p000.rfb
    /* JADX INFO: renamed from: c */
    public final Set mo20650c() {
        return this.f71809b.keySet();
    }
}
