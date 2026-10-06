package androidx.work;

import java.lang.reflect.Array;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import p000.C0138dq;
import p000.axt;
import p000.axw;
import p000.ooc;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class ArrayCreatingInputMerger extends axw {
    @Override // p000.axw
    /* JADX INFO: renamed from: a */
    public final axt mo1694a(List list) {
        Class<?> cls;
        HashMap map = new HashMap();
        HashMap map2 = new HashMap();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            Map mapM2092b = ((axt) it.next()).m2092b();
            mapM2092b.getClass();
            for (Map.Entry entry : mapM2092b.entrySet()) {
                String str = (String) entry.getKey();
                Object value = entry.getValue();
                if (value == null || (cls = value.getClass()) == null) {
                    cls = String.class;
                }
                Object obj = map2.get(str);
                str.getClass();
                if (obj != null) {
                    Class<?> cls2 = obj.getClass();
                    if (ooc.m18737c(cls2, cls)) {
                        value.getClass();
                        int length = Array.getLength(obj);
                        Class<?> cls3 = obj.getClass();
                        int length2 = Array.getLength(value);
                        Class<?> componentType = cls3.getComponentType();
                        componentType.getClass();
                        Object objNewInstance = Array.newInstance(componentType, length + length2);
                        System.arraycopy(obj, 0, objNewInstance, 0, length);
                        System.arraycopy(value, 0, objNewInstance, length, length2);
                        objNewInstance.getClass();
                        value = objNewInstance;
                    } else {
                        if (!ooc.m18737c(cls2.getComponentType(), cls)) {
                            throw new IllegalArgumentException();
                        }
                        int length3 = Array.getLength(obj);
                        Object objNewInstance2 = Array.newInstance(cls, length3 + 1);
                        System.arraycopy(obj, 0, objNewInstance2, 0, length3);
                        Array.set(objNewInstance2, length3, value);
                        objNewInstance2.getClass();
                        value = objNewInstance2;
                    }
                } else if (!cls.isArray()) {
                    Object objNewInstance3 = Array.newInstance(cls, 1);
                    Array.set(objNewInstance3, 0, value);
                    objNewInstance3.getClass();
                    value = objNewInstance3;
                }
                value.getClass();
                map2.put(str, value);
            }
        }
        C0138dq.m6570f(map2, map);
        return C0138dq.m6569e(map);
    }
}
