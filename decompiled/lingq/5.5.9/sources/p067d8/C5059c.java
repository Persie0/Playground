package p067d8;

import android.os.Bundle;
import dm.C5207g;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: d8.c */
/* JADX INFO: loaded from: classes.dex */
public final class C5059c {

    /* JADX INFO: renamed from: a */
    public static final HashMap f32914a;

    /* JADX INFO: renamed from: d8.c$a */
    public static final class a implements h {
        @Override // p067d8.C5059c.h
        /* JADX INFO: renamed from: a */
        public final void mo10751a(Bundle bundle, String str, Object obj) throws JSONException {
            bundle.putBoolean(str, ((Boolean) obj).booleanValue());
        }
    }

    /* JADX INFO: renamed from: d8.c$b */
    public static final class b implements h {
        @Override // p067d8.C5059c.h
        /* JADX INFO: renamed from: a */
        public final void mo10751a(Bundle bundle, String str, Object obj) throws JSONException {
            bundle.putInt(str, ((Integer) obj).intValue());
        }
    }

    /* JADX INFO: renamed from: d8.c$c */
    public static final class c implements h {
        @Override // p067d8.C5059c.h
        /* JADX INFO: renamed from: a */
        public final void mo10751a(Bundle bundle, String str, Object obj) throws JSONException {
            bundle.putLong(str, ((Long) obj).longValue());
        }
    }

    /* JADX INFO: renamed from: d8.c$d */
    public static final class d implements h {
        @Override // p067d8.C5059c.h
        /* JADX INFO: renamed from: a */
        public final void mo10751a(Bundle bundle, String str, Object obj) throws JSONException {
            bundle.putDouble(str, ((Double) obj).doubleValue());
        }
    }

    /* JADX INFO: renamed from: d8.c$e */
    public static final class e implements h {
        @Override // p067d8.C5059c.h
        /* JADX INFO: renamed from: a */
        public final void mo10751a(Bundle bundle, String str, Object obj) throws JSONException {
            bundle.putString(str, (String) obj);
        }
    }

    /* JADX INFO: renamed from: d8.c$f */
    public static final class f implements h {
        @Override // p067d8.C5059c.h
        /* JADX INFO: renamed from: a */
        public final void mo10751a(Bundle bundle, String str, Object obj) throws JSONException {
            throw new IllegalArgumentException("Unexpected type from JSON");
        }
    }

    /* JADX INFO: renamed from: d8.c$g */
    public static final class g implements h {
        /* JADX WARN: Multi-variable type inference failed */
        @Override // p067d8.C5059c.h
        /* JADX INFO: renamed from: a */
        public final void mo10751a(Bundle bundle, String str, Object obj) throws JSONException {
            JSONArray jSONArray = (JSONArray) obj;
            ArrayList arrayList = new ArrayList();
            if (jSONArray.length() == 0) {
                bundle.putStringArrayList(str, arrayList);
                return;
            }
            int length = jSONArray.length();
            if (length > 0) {
                int i10 = 0;
                while (true) {
                    int i11 = i10 + 1;
                    Object obj2 = jSONArray.get(i10);
                    if (!(obj2 instanceof String)) {
                        throw new IllegalArgumentException(C5207g.m11116k(obj2.getClass(), "Unexpected type in an array: "));
                    }
                    arrayList.add(obj2);
                    if (i11 < length) {
                        i10 = i11;
                    }
                }
            }
            bundle.putStringArrayList(str, arrayList);
        }
    }

    /* JADX INFO: renamed from: d8.c$h */
    public interface h {
        /* JADX INFO: renamed from: a */
        void mo10751a(Bundle bundle, String str, Object obj) throws JSONException;
    }

    static {
        HashMap map = new HashMap();
        f32914a = map;
        map.put(Boolean.class, new a());
        map.put(Integer.class, new b());
        map.put(Long.class, new c());
        map.put(Double.class, new d());
        map.put(String.class, new e());
        map.put(String[].class, new f());
        map.put(JSONArray.class, new g());
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    /* JADX INFO: renamed from: a */
    public static final Bundle m10750a(JSONObject jSONObject) throws JSONException {
        C5207g.m11111f(jSONObject, "jsonObject");
        Bundle bundle = new Bundle();
        Iterator<String> itKeys = jSONObject.keys();
        while (itKeys.hasNext()) {
            String next = itKeys.next();
            Object obj = jSONObject.get(next);
            if (obj != JSONObject.NULL) {
                if (obj instanceof JSONObject) {
                    bundle.putBundle(next, m10750a((JSONObject) obj));
                } else {
                    h hVar = (h) f32914a.get(obj.getClass());
                    if (hVar == null) {
                        throw new IllegalArgumentException(C5207g.m11116k(obj.getClass(), "Unsupported type: "));
                    }
                    C5207g.m11110e(next, "key");
                    hVar.mo10751a(bundle, next, obj);
                }
            }
        }
        return bundle;
    }
}
