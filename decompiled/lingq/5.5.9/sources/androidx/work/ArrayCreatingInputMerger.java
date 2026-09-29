package androidx.work;

import androidx.datastore.preferences.PreferencesProto$Value;
import dm.C5207g;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import kotlin.Metadata;
import p026b5.AbstractC1312e;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m13364d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m13365d2 = {"Landroidx/work/ArrayCreatingInputMerger;", "Lb5/e;", "<init>", "()V", "work-runtime_release"}, m13366k = 1, m13367mv = {1, PreferencesProto$Value.DOUBLE_FIELD_NUMBER, 1})
public final class ArrayCreatingInputMerger extends AbstractC1312e {
    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @Override // p026b5.AbstractC1312e
    /* JADX INFO: renamed from: a */
    public final C1244b mo4694a(ArrayList arrayList) {
        Object objNewInstance;
        C1244b.a aVar = new C1244b.a();
        HashMap map = new HashMap();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            Map mapUnmodifiableMap = Collections.unmodifiableMap(((C1244b) it.next()).f7824a);
            C5207g.m11110e(mapUnmodifiableMap, "input.keyValueMap");
            for (Map.Entry entry : mapUnmodifiableMap.entrySet()) {
                String str = (String) entry.getKey();
                Object value = entry.getValue();
                Class<?> cls = value != null ? value.getClass() : String.class;
                Object obj = map.get(str);
                C5207g.m11110e(str, "key");
                if (obj != null) {
                    Class<?> cls2 = obj.getClass();
                    if (C5207g.m11106a(cls2, cls)) {
                        C5207g.m11110e(value, "value");
                        int length = Array.getLength(obj);
                        int length2 = Array.getLength(value);
                        Class<?> componentType = obj.getClass().getComponentType();
                        C5207g.m11108c(componentType);
                        Object objNewInstance2 = Array.newInstance(componentType, length + length2);
                        System.arraycopy(obj, 0, objNewInstance2, 0, length);
                        System.arraycopy(value, 0, objNewInstance2, length, length2);
                        C5207g.m11110e(objNewInstance2, "newArray");
                        value = objNewInstance2;
                    } else {
                        if (!C5207g.m11106a(cls2.getComponentType(), cls)) {
                            throw new IllegalArgumentException();
                        }
                        int length3 = Array.getLength(obj);
                        objNewInstance = Array.newInstance(cls, length3 + 1);
                        System.arraycopy(obj, 0, objNewInstance, 0, length3);
                        Array.set(objNewInstance, length3, value);
                        C5207g.m11110e(objNewInstance, "newArray");
                        value = objNewInstance;
                    }
                } else if (!cls.isArray()) {
                    objNewInstance = Array.newInstance(cls, 1);
                    Array.set(objNewInstance, 0, value);
                    C5207g.m11110e(objNewInstance, "newArray");
                    value = objNewInstance;
                }
                C5207g.m11110e(value, "if (existingValue == nul…      }\n                }");
                map.put(str, value);
            }
        }
        aVar.m4710c(map);
        return aVar.m4708a();
    }
}
