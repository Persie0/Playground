package p000;

import com.google.android.gms.common.Feature;
import java.util.Map;
import java.util.TreeMap;

/* JADX INFO: loaded from: classes2.dex */
public abstract class hyc {

    /* JADX INFO: renamed from: a */
    public static final Feature f43223a;

    /* JADX INFO: renamed from: b */
    public static final Feature[] f43224b;

    static {
        Feature feature = new Feature("moduleinstall", 7L);
        f43223a = feature;
        f43224b = new Feature[]{feature};
    }

    /* JADX INFO: renamed from: a */
    public static ei8 m13591a(p33 p33Var) {
        ei8 ei8Var;
        String str = (String) p33Var.f55513b;
        Object[] objArr = (Object[]) p33Var.f55514c;
        int length = objArr != null ? objArr.length : 0;
        str.getClass();
        TreeMap treeMap = ei8.f37291h;
        synchronized (treeMap) {
            Map.Entry entryCeilingEntry = treeMap.ceilingEntry(Integer.valueOf(length));
            if (entryCeilingEntry != null) {
                treeMap.remove(entryCeilingEntry.getKey());
                ei8Var = (ei8) entryCeilingEntry.getValue();
                ei8Var.getClass();
                ei8Var.f37292a = str;
                ei8Var.f37298g = length;
            } else {
                ei8Var = new ei8(length);
                ei8Var.f37292a = str;
                ei8Var.f37298g = length;
            }
        }
        j3d.m14283a(new di8(ei8Var), (Object[]) p33Var.f55514c);
        return ei8Var;
    }
}
