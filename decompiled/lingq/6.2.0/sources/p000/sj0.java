package p000;

import android.os.Bundle;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public abstract class sj0 {

    /* JADX INFO: renamed from: a */
    public static final HashMap f60912a;

    static {
        HashMap map = new HashMap();
        f60912a = map;
        map.put(Boolean.class, new rj0(0));
        map.put(Integer.class, new rj0(1));
        map.put(Long.class, new rj0(2));
        map.put(Double.class, new rj0(3));
        map.put(String.class, new rj0(4));
        map.put(String[].class, new rj0(5));
        map.put(JSONArray.class, new rj0(6));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: a */
    public static final Bundle m21399a(JSONObject jSONObject) throws JSONException {
        Bundle bundle = new Bundle();
        Iterator<String> itKeys = jSONObject.keys();
        while (itKeys.hasNext()) {
            String next = itKeys.next();
            Object obj = jSONObject.get(next);
            if (obj != JSONObject.NULL) {
                if (!(obj instanceof JSONObject)) {
                    rj0 rj0Var = (rj0) f60912a.get(obj.getClass());
                    if (rj0Var == null) {
                        C3386nv.m17625k(obj.getClass(), "Unsupported type: ");
                        return null;
                    }
                    next.getClass();
                    switch (rj0Var.f59385a) {
                        case 0:
                            bundle.putBoolean(next, ((Boolean) obj).booleanValue());
                            break;
                        case 1:
                            bundle.putInt(next, ((Integer) obj).intValue());
                            break;
                        case 2:
                            bundle.putLong(next, ((Long) obj).longValue());
                            break;
                        case 3:
                            bundle.putDouble(next, ((Double) obj).doubleValue());
                            break;
                        case 4:
                            bundle.putString(next, (String) obj);
                            break;
                        case 5:
                            throw new IllegalArgumentException("Unexpected type from JSON");
                        default:
                            JSONArray jSONArray = (JSONArray) obj;
                            ArrayList arrayList = new ArrayList();
                            if (jSONArray.length() != 0) {
                                int length = jSONArray.length();
                                int i = 0;
                                while (true) {
                                    if (i >= length) {
                                        bundle.putStringArrayList(next, arrayList);
                                    }
                                    Object obj2 = jSONArray.get(i);
                                    if (!(obj2 instanceof String)) {
                                        C3386nv.m17625k(obj2.getClass(), "Unexpected type in an array: ");
                                    }
                                    arrayList.add(obj2);
                                    i++;
                                    break;
                                }
                            } else {
                                bundle.putStringArrayList(next, arrayList);
                            }
                            break;
                    }
                } else {
                    bundle.putBundle(next, m21399a((JSONObject) obj));
                }
            }
        }
        return bundle;
    }
}
