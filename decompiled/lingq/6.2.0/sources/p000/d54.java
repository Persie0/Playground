package p000;

import android.util.Log;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

/* JADX INFO: loaded from: classes.dex */
public final class d54 {

    /* JADX INFO: renamed from: a */
    public final LinkedHashMap f35011a;

    public d54(int i) {
        switch (i) {
            case 1:
                this.f35011a = new LinkedHashMap();
                break;
            case 2:
                this.f35011a = new LinkedHashMap();
                break;
            default:
                this.f35011a = new LinkedHashMap();
                break;
        }
    }

    /* JADX INFO: renamed from: a */
    public void m10098a(z21 z21Var, vi3 vi3Var) {
        LinkedHashMap linkedHashMap = this.f35011a;
        if (linkedHashMap.containsKey(z21Var)) {
            v63.m23134l("A `initializer` with the same `clazz` has already been added: ", 46, z21Var.m25413b());
        } else {
            linkedHashMap.put(z21Var, new xta(z21Var, vi3Var));
        }
    }

    /* JADX INFO: renamed from: b */
    public void m10099b(ry5 ry5Var) {
        ry5Var.getClass();
        int i = ry5Var.f60039a;
        int i2 = ry5Var.f60040b;
        Integer numValueOf = Integer.valueOf(i);
        LinkedHashMap linkedHashMap = this.f35011a;
        Object treeMap = linkedHashMap.get(numValueOf);
        if (treeMap == null) {
            treeMap = new TreeMap();
            linkedHashMap.put(numValueOf, treeMap);
        }
        TreeMap treeMap2 = (TreeMap) treeMap;
        if (treeMap2.containsKey(Integer.valueOf(i2))) {
            Log.w("ROOM", "Overriding migration " + treeMap2.get(Integer.valueOf(i2)) + " with " + ry5Var);
        }
        treeMap2.put(Integer.valueOf(i2), ry5Var);
    }

    /* JADX INFO: renamed from: c */
    public C3601t7 m10100c() {
        Collection collectionValues = this.f35011a.values();
        collectionValues.getClass();
        xta[] xtaVarArr = (xta[]) collectionValues.toArray(new xta[0]);
        return new C3601t7((xta[]) Arrays.copyOf(xtaVarArr, xtaVarArr.length), 2);
    }

    /* JADX INFO: renamed from: d */
    public List m10101d(String str) {
        str.getClass();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        LinkedHashMap linkedHashMap2 = this.f35011a;
        for (Map.Entry entry : linkedHashMap2.entrySet()) {
            if (fa4.m11650l(((a8b) entry.getKey()).m181b(), str)) {
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        Iterator it = linkedHashMap.keySet().iterator();
        while (it.hasNext()) {
            linkedHashMap2.remove((a8b) it.next());
        }
        return u91.m22622n1(linkedHashMap.values());
    }

    /* JADX INFO: renamed from: e */
    public zg9 m10102e(a8b a8bVar) {
        LinkedHashMap linkedHashMap = this.f35011a;
        Object zg9Var = linkedHashMap.get(a8bVar);
        if (zg9Var == null) {
            zg9Var = new zg9(a8bVar);
            linkedHashMap.put(a8bVar, zg9Var);
        }
        return (zg9) zg9Var;
    }
}
