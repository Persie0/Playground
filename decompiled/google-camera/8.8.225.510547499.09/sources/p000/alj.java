package p000;

import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcelable;
import android.util.Size;
import android.util.SizeF;
import android.util.SparseArray;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class alj {

    /* JADX INFO: renamed from: a */
    public static final Class[] f635a = {Boolean.TYPE, boolean[].class, Double.TYPE, double[].class, Integer.TYPE, int[].class, Long.TYPE, long[].class, String.class, String[].class, Binder.class, Bundle.class, Byte.TYPE, byte[].class, Character.TYPE, char[].class, CharSequence.class, CharSequence[].class, ArrayList.class, Float.TYPE, float[].class, Parcelable.class, Parcelable[].class, Serializable.class, Short.TYPE, short[].class, SparseArray.class, Size.class, SizeF.class};

    /* JADX INFO: renamed from: b */
    public final Map f636b;

    /* JADX INFO: renamed from: c */
    public final Map f637c;

    /* JADX INFO: renamed from: d */
    public final Map f638d;

    /* JADX INFO: renamed from: e */
    public final Map f639e;

    /* JADX INFO: renamed from: f */
    public final aql f640f;

    public alj() {
        this.f636b = new LinkedHashMap();
        this.f637c = new LinkedHashMap();
        this.f638d = new LinkedHashMap();
        this.f639e = new LinkedHashMap();
        this.f640f = new aql() { // from class: ali
            @Override // p000.aql
            /* JADX INFO: renamed from: a */
            public final Bundle mo910a() {
                Map mapSingletonMap;
                alj aljVar = this.f634a;
                Map map = aljVar.f637c;
                switch (map.size()) {
                    case 0:
                        mapSingletonMap = okw.f46216a;
                        break;
                    case 1:
                        Map.Entry entry = (Map.Entry) map.entrySet().iterator().next();
                        mapSingletonMap = Collections.singletonMap(entry.getKey(), entry.getValue());
                        mapSingletonMap.getClass();
                        break;
                    default:
                        mapSingletonMap = new LinkedHashMap(map);
                        break;
                }
                Iterator it = mapSingletonMap.entrySet().iterator();
                while (true) {
                    int i = 0;
                    if (!it.hasNext()) {
                        Set<String> setKeySet = aljVar.f636b.keySet();
                        ArrayList arrayList = new ArrayList(setKeySet.size());
                        ArrayList arrayList2 = new ArrayList(arrayList.size());
                        for (String str : setKeySet) {
                            arrayList.add(str);
                            arrayList2.add(aljVar.f636b.get(str));
                        }
                        okb[] okbVarArr = {lkm.m15590q("keys", arrayList), lkm.m15590q("values", arrayList2)};
                        Bundle bundle = new Bundle(2);
                        while (i < 2) {
                            okb okbVar = okbVarArr[i];
                            String str2 = (String) okbVar.f46186a;
                            Object obj = okbVar.f46187b;
                            if (obj == null) {
                                bundle.putString(str2, null);
                            } else if (obj instanceof Boolean) {
                                bundle.putBoolean(str2, ((Boolean) obj).booleanValue());
                            } else if (obj instanceof Byte) {
                                bundle.putByte(str2, ((Number) obj).byteValue());
                            } else if (obj instanceof Character) {
                                bundle.putChar(str2, ((Character) obj).charValue());
                            } else if (obj instanceof Double) {
                                bundle.putDouble(str2, ((Number) obj).doubleValue());
                            } else if (obj instanceof Float) {
                                bundle.putFloat(str2, ((Number) obj).floatValue());
                            } else if (obj instanceof Integer) {
                                bundle.putInt(str2, ((Number) obj).intValue());
                            } else if (obj instanceof Long) {
                                bundle.putLong(str2, ((Number) obj).longValue());
                            } else if (obj instanceof Short) {
                                bundle.putShort(str2, ((Number) obj).shortValue());
                            } else if (obj instanceof Bundle) {
                                bundle.putBundle(str2, (Bundle) obj);
                            } else if (obj instanceof CharSequence) {
                                bundle.putCharSequence(str2, (CharSequence) obj);
                            } else if (obj instanceof Parcelable) {
                                bundle.putParcelable(str2, (Parcelable) obj);
                            } else if (obj instanceof boolean[]) {
                                bundle.putBooleanArray(str2, (boolean[]) obj);
                            } else if (obj instanceof byte[]) {
                                bundle.putByteArray(str2, (byte[]) obj);
                            } else if (obj instanceof char[]) {
                                bundle.putCharArray(str2, (char[]) obj);
                            } else if (obj instanceof double[]) {
                                bundle.putDoubleArray(str2, (double[]) obj);
                            } else if (obj instanceof float[]) {
                                bundle.putFloatArray(str2, (float[]) obj);
                            } else if (obj instanceof int[]) {
                                bundle.putIntArray(str2, (int[]) obj);
                            } else if (obj instanceof long[]) {
                                bundle.putLongArray(str2, (long[]) obj);
                            } else if (obj instanceof short[]) {
                                bundle.putShortArray(str2, (short[]) obj);
                            } else if (obj instanceof Object[]) {
                                Class<?> componentType = obj.getClass().getComponentType();
                                componentType.getClass();
                                if (Parcelable.class.isAssignableFrom(componentType)) {
                                    bundle.putParcelableArray(str2, (Parcelable[]) obj);
                                } else if (String.class.isAssignableFrom(componentType)) {
                                    bundle.putStringArray(str2, (String[]) obj);
                                } else if (CharSequence.class.isAssignableFrom(componentType)) {
                                    bundle.putCharSequenceArray(str2, (CharSequence[]) obj);
                                } else {
                                    if (!Serializable.class.isAssignableFrom(componentType)) {
                                        throw new IllegalArgumentException("Illegal value array type " + componentType.getCanonicalName() + " for key \"" + str2 + '\"');
                                    }
                                    bundle.putSerializable(str2, (Serializable) obj);
                                }
                            } else if (obj instanceof Serializable) {
                                bundle.putSerializable(str2, (Serializable) obj);
                            } else if (obj instanceof IBinder) {
                                adh.m285a(bundle, str2, (IBinder) obj);
                            } else if (obj instanceof Size) {
                                adi.m288a(bundle, str2, (Size) obj);
                            } else {
                                if (!(obj instanceof SizeF)) {
                                    throw new IllegalArgumentException("Illegal value type " + obj.getClass().getCanonicalName() + " for key \"" + str2 + '\"');
                                }
                                adi.m289b(bundle, str2, (SizeF) obj);
                            }
                            i++;
                        }
                        return bundle;
                    }
                    Map.Entry entry2 = (Map.Entry) it.next();
                    String str3 = (String) entry2.getKey();
                    Bundle bundleMo910a = ((aql) entry2.getValue()).mo910a();
                    str3.getClass();
                    Class[] clsArr = alj.f635a;
                    while (true) {
                        if (i >= 29) {
                            throw new IllegalArgumentException("Can't put value with type " + bundleMo910a.getClass() + " into saved state");
                        }
                        Class cls = clsArr[i];
                        cls.getClass();
                        if (!cls.isInstance(bundleMo910a)) {
                            i++;
                        }
                    }
                    Object obj2 = aljVar.f638d.get(str3);
                    ald aldVar = obj2 instanceof ald ? (ald) obj2 : null;
                    if (aldVar != null) {
                        aldVar.mo904g(bundleMo910a);
                    } else {
                        aljVar.f636b.put(str3, bundleMo910a);
                    }
                    ovm ovmVar = (ovm) aljVar.f639e.get(str3);
                    if (ovmVar != null) {
                        ovmVar.mo19087d(bundleMo910a);
                    }
                }
            }
        };
    }

    public alj(Map map) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        this.f636b = linkedHashMap;
        this.f637c = new LinkedHashMap();
        this.f638d = new LinkedHashMap();
        this.f639e = new LinkedHashMap();
        this.f640f = new aql() { // from class: ali
            @Override // p000.aql
            /* JADX INFO: renamed from: a */
            public final Bundle mo910a() {
                Map mapSingletonMap;
                alj aljVar = this.f634a;
                Map map2 = aljVar.f637c;
                switch (map2.size()) {
                    case 0:
                        mapSingletonMap = okw.f46216a;
                        break;
                    case 1:
                        Map.Entry entry = (Map.Entry) map2.entrySet().iterator().next();
                        mapSingletonMap = Collections.singletonMap(entry.getKey(), entry.getValue());
                        mapSingletonMap.getClass();
                        break;
                    default:
                        mapSingletonMap = new LinkedHashMap(map2);
                        break;
                }
                Iterator it = mapSingletonMap.entrySet().iterator();
                while (true) {
                    int i = 0;
                    if (!it.hasNext()) {
                        Set<String> setKeySet = aljVar.f636b.keySet();
                        ArrayList arrayList = new ArrayList(setKeySet.size());
                        ArrayList arrayList2 = new ArrayList(arrayList.size());
                        for (String str : setKeySet) {
                            arrayList.add(str);
                            arrayList2.add(aljVar.f636b.get(str));
                        }
                        okb[] okbVarArr = {lkm.m15590q("keys", arrayList), lkm.m15590q("values", arrayList2)};
                        Bundle bundle = new Bundle(2);
                        while (i < 2) {
                            okb okbVar = okbVarArr[i];
                            String str2 = (String) okbVar.f46186a;
                            Object obj = okbVar.f46187b;
                            if (obj == null) {
                                bundle.putString(str2, null);
                            } else if (obj instanceof Boolean) {
                                bundle.putBoolean(str2, ((Boolean) obj).booleanValue());
                            } else if (obj instanceof Byte) {
                                bundle.putByte(str2, ((Number) obj).byteValue());
                            } else if (obj instanceof Character) {
                                bundle.putChar(str2, ((Character) obj).charValue());
                            } else if (obj instanceof Double) {
                                bundle.putDouble(str2, ((Number) obj).doubleValue());
                            } else if (obj instanceof Float) {
                                bundle.putFloat(str2, ((Number) obj).floatValue());
                            } else if (obj instanceof Integer) {
                                bundle.putInt(str2, ((Number) obj).intValue());
                            } else if (obj instanceof Long) {
                                bundle.putLong(str2, ((Number) obj).longValue());
                            } else if (obj instanceof Short) {
                                bundle.putShort(str2, ((Number) obj).shortValue());
                            } else if (obj instanceof Bundle) {
                                bundle.putBundle(str2, (Bundle) obj);
                            } else if (obj instanceof CharSequence) {
                                bundle.putCharSequence(str2, (CharSequence) obj);
                            } else if (obj instanceof Parcelable) {
                                bundle.putParcelable(str2, (Parcelable) obj);
                            } else if (obj instanceof boolean[]) {
                                bundle.putBooleanArray(str2, (boolean[]) obj);
                            } else if (obj instanceof byte[]) {
                                bundle.putByteArray(str2, (byte[]) obj);
                            } else if (obj instanceof char[]) {
                                bundle.putCharArray(str2, (char[]) obj);
                            } else if (obj instanceof double[]) {
                                bundle.putDoubleArray(str2, (double[]) obj);
                            } else if (obj instanceof float[]) {
                                bundle.putFloatArray(str2, (float[]) obj);
                            } else if (obj instanceof int[]) {
                                bundle.putIntArray(str2, (int[]) obj);
                            } else if (obj instanceof long[]) {
                                bundle.putLongArray(str2, (long[]) obj);
                            } else if (obj instanceof short[]) {
                                bundle.putShortArray(str2, (short[]) obj);
                            } else if (obj instanceof Object[]) {
                                Class<?> componentType = obj.getClass().getComponentType();
                                componentType.getClass();
                                if (Parcelable.class.isAssignableFrom(componentType)) {
                                    bundle.putParcelableArray(str2, (Parcelable[]) obj);
                                } else if (String.class.isAssignableFrom(componentType)) {
                                    bundle.putStringArray(str2, (String[]) obj);
                                } else if (CharSequence.class.isAssignableFrom(componentType)) {
                                    bundle.putCharSequenceArray(str2, (CharSequence[]) obj);
                                } else {
                                    if (!Serializable.class.isAssignableFrom(componentType)) {
                                        throw new IllegalArgumentException("Illegal value array type " + componentType.getCanonicalName() + " for key \"" + str2 + '\"');
                                    }
                                    bundle.putSerializable(str2, (Serializable) obj);
                                }
                            } else if (obj instanceof Serializable) {
                                bundle.putSerializable(str2, (Serializable) obj);
                            } else if (obj instanceof IBinder) {
                                adh.m285a(bundle, str2, (IBinder) obj);
                            } else if (obj instanceof Size) {
                                adi.m288a(bundle, str2, (Size) obj);
                            } else {
                                if (!(obj instanceof SizeF)) {
                                    throw new IllegalArgumentException("Illegal value type " + obj.getClass().getCanonicalName() + " for key \"" + str2 + '\"');
                                }
                                adi.m289b(bundle, str2, (SizeF) obj);
                            }
                            i++;
                        }
                        return bundle;
                    }
                    Map.Entry entry2 = (Map.Entry) it.next();
                    String str3 = (String) entry2.getKey();
                    Bundle bundleMo910a = ((aql) entry2.getValue()).mo910a();
                    str3.getClass();
                    Class[] clsArr = alj.f635a;
                    while (true) {
                        if (i >= 29) {
                            throw new IllegalArgumentException("Can't put value with type " + bundleMo910a.getClass() + " into saved state");
                        }
                        Class cls = clsArr[i];
                        cls.getClass();
                        if (!cls.isInstance(bundleMo910a)) {
                            i++;
                        }
                    }
                    Object obj2 = aljVar.f638d.get(str3);
                    ald aldVar = obj2 instanceof ald ? (ald) obj2 : null;
                    if (aldVar != null) {
                        aldVar.mo904g(bundleMo910a);
                    } else {
                        aljVar.f636b.put(str3, bundleMo910a);
                    }
                    ovm ovmVar = (ovm) aljVar.f639e.get(str3);
                    if (ovmVar != null) {
                        ovmVar.mo19087d(bundleMo910a);
                    }
                }
            }
        };
        linkedHashMap.putAll(map);
    }
}
