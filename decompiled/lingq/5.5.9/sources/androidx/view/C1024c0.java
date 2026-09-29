package androidx.view;

import ae.C0062b;
import android.os.Binder;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.Size;
import android.util.SizeF;
import android.util.SparseArray;
import androidx.activity.C0185d;
import androidx.fragment.app.C0947d0;
import androidx.p544savedstate.C1189a;
import dm.C5207g;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import kotlin.Pair;
import kotlin.collections.C6753d;
import kotlinx.coroutines.flow.InterfaceC7133n;

/* JADX INFO: renamed from: androidx.lifecycle.c0 */
/* JADX INFO: loaded from: classes.dex */
public final class C1024c0 {

    /* JADX INFO: renamed from: f */
    public static final Class<? extends Object>[] f6615f = {Boolean.TYPE, boolean[].class, Double.TYPE, double[].class, Integer.TYPE, int[].class, Long.TYPE, long[].class, String.class, String[].class, Binder.class, Bundle.class, Byte.TYPE, byte[].class, Character.TYPE, char[].class, CharSequence.class, CharSequence[].class, ArrayList.class, Float.TYPE, float[].class, Parcelable.class, Parcelable[].class, Serializable.class, Short.TYPE, short[].class, SparseArray.class, Size.class, SizeF.class};

    /* JADX INFO: renamed from: a */
    public final LinkedHashMap f6616a;

    /* JADX INFO: renamed from: b */
    public final LinkedHashMap f6617b;

    /* JADX INFO: renamed from: c */
    public final LinkedHashMap f6618c;

    /* JADX INFO: renamed from: d */
    public final LinkedHashMap f6619d;

    /* JADX INFO: renamed from: e */
    public final C1189a.b f6620e;

    /* JADX INFO: renamed from: androidx.lifecycle.c0$a */
    public static final class a {
        /* JADX INFO: renamed from: a */
        public static C1024c0 m3931a(Bundle bundle, Bundle bundle2) {
            if (bundle == null) {
                if (bundle2 == null) {
                    return new C1024c0();
                }
                HashMap map = new HashMap();
                for (String str : bundle2.keySet()) {
                    C5207g.m11110e(str, "key");
                    map.put(str, bundle2.get(str));
                }
                return new C1024c0(map);
            }
            ArrayList parcelableArrayList = bundle.getParcelableArrayList("keys");
            ArrayList parcelableArrayList2 = bundle.getParcelableArrayList("values");
            if (!((parcelableArrayList == null || parcelableArrayList2 == null || parcelableArrayList.size() != parcelableArrayList2.size()) ? false : true)) {
                throw new IllegalStateException("Invalid bundle passed as restored state".toString());
            }
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            int size = parcelableArrayList.size();
            for (int i10 = 0; i10 < size; i10++) {
                Object obj = parcelableArrayList.get(i10);
                C5207g.m11109d(obj, "null cannot be cast to non-null type kotlin.String");
                linkedHashMap.put((String) obj, parcelableArrayList2.get(i10));
            }
            return new C1024c0(linkedHashMap);
        }
    }

    /* JADX INFO: renamed from: androidx.lifecycle.c0$b */
    public static final class b<T> extends C1056v<T> {
        @Override // androidx.view.C1056v, androidx.view.LiveData
        /* JADX INFO: renamed from: i */
        public final void mo3900i(T t10) {
            super.mo3900i(t10);
        }
    }

    public C1024c0() {
        this.f6616a = new LinkedHashMap();
        this.f6617b = new LinkedHashMap();
        this.f6618c = new LinkedHashMap();
        this.f6619d = new LinkedHashMap();
        this.f6620e = new C0947d0(1, this);
    }

    public C1024c0(HashMap map) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        this.f6616a = linkedHashMap;
        this.f6617b = new LinkedHashMap();
        this.f6618c = new LinkedHashMap();
        this.f6619d = new LinkedHashMap();
        this.f6620e = new C0185d(1, this);
        linkedHashMap.putAll(map);
    }

    /* JADX INFO: renamed from: a */
    public static Bundle m3928a(C1024c0 c1024c0) {
        C5207g.m11111f(c1024c0, "this$0");
        for (Map.Entry entry : C6753d.m13465R0(c1024c0.f6617b).entrySet()) {
            c1024c0.m3930c(((C1189a.b) entry.getValue()).mo811a(), (String) entry.getKey());
        }
        LinkedHashMap linkedHashMap = c1024c0.f6616a;
        Set<String> setKeySet = linkedHashMap.keySet();
        ArrayList arrayList = new ArrayList(setKeySet.size());
        ArrayList arrayList2 = new ArrayList(arrayList.size());
        for (String str : setKeySet) {
            arrayList.add(str);
            arrayList2.add(linkedHashMap.get(str));
        }
        return C0062b.m327Z(new Pair("keys", arrayList), new Pair("values", arrayList2));
    }

    /* JADX INFO: renamed from: b */
    public final <T> T m3929b(String str) {
        LinkedHashMap linkedHashMap = this.f6616a;
        try {
            return (T) linkedHashMap.get(str);
        } catch (ClassCastException unused) {
            linkedHashMap.remove(str);
            this.f6619d.remove(str);
            return null;
        }
    }

    /* JADX INFO: renamed from: c */
    public final void m3930c(Object obj, String str) {
        boolean z10;
        C5207g.m11111f(str, "key");
        if (obj == null) {
            z10 = true;
            break;
        }
        Class<? extends Object>[] clsArr = f6615f;
        z10 = false;
        for (int i10 = 0; i10 < 29; i10++) {
            Class<? extends Object> cls = clsArr[i10];
            C5207g.m11108c(cls);
            if (cls.isInstance(obj)) {
                z10 = true;
                break;
            }
        }
        if (!z10) {
            StringBuilder sb2 = new StringBuilder("Can't put value with type ");
            C5207g.m11108c(obj);
            sb2.append(obj.getClass());
            sb2.append(" into saved state");
            throw new IllegalArgumentException(sb2.toString());
        }
        Object obj2 = this.f6618c.get(str);
        C1056v c1056v = obj2 instanceof C1056v ? (C1056v) obj2 : null;
        if (c1056v != null) {
            c1056v.mo3900i(obj);
        } else {
            this.f6616a.put(str, obj);
        }
        InterfaceC7133n interfaceC7133n = (InterfaceC7133n) this.f6619d.get(str);
        if (interfaceC7133n == null) {
            return;
        }
        interfaceC7133n.setValue(obj);
    }
}
