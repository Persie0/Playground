package p000;

import android.content.Context;
import android.content.res.Configuration;
import android.media.MediaDescription;
import android.net.Uri;
import com.google.android.apps.camera.bottombar.C0100R;
import java.util.Map;
import java.util.Set;

/* JADX INFO: renamed from: dq */
/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class C0138dq {
    /* JADX INFO: renamed from: a */
    public static Uri m6565a(MediaDescription mediaDescription) {
        return mediaDescription.getMediaUri();
    }

    /* JADX INFO: renamed from: b */
    public static void m6566b(MediaDescription.Builder builder, Uri uri) {
        builder.setMediaUri(uri);
    }

    /* JADX INFO: renamed from: c */
    public static final int m6567c(Context context) {
        Configuration configuration = context.getResources().getConfiguration();
        int i = configuration.screenWidthDp;
        int i2 = configuration.screenHeightDp;
        if (configuration.smallestScreenWidthDp > 600 || i > 600) {
            return 5;
        }
        if (i >= 500) {
            return 4;
        }
        if (i <= 480 || i2 <= 640) {
            return i >= 360 ? 3 : 2;
        }
        return 4;
    }

    /* JADX INFO: renamed from: d */
    public static final boolean m6568d(Context context) {
        return context.getResources().getBoolean(C0100R.bool.abc_action_bar_embed_tabs);
    }

    /* JADX INFO: renamed from: e */
    public static final axt m6569e(Map map) {
        axt axtVar = new axt(map);
        axt.m2091c(axtVar);
        return axtVar;
    }

    /* JADX INFO: renamed from: f */
    public static final void m6570f(Map map, Map map2) {
        for (Map.Entry entry : map.entrySet()) {
            String str = (String) entry.getKey();
            Object value = entry.getValue();
            if (value == null) {
                map2.put(str, null);
            } else {
                Class<?> cls = value.getClass();
                if (cls == Boolean.class || cls == Byte.class || cls == Integer.class || cls == Long.class || cls == Float.class || cls == Double.class || cls == String.class || cls == Boolean[].class || cls == Byte[].class || cls == Integer[].class || cls == Long[].class || cls == Float[].class || cls == Double[].class || cls == String[].class) {
                    map2.put(str, value);
                } else {
                    int i = 0;
                    if (cls == boolean[].class) {
                        boolean[] zArr = (boolean[]) value;
                        int length = zArr.length;
                        axt axtVar = axt.f2689a;
                        Boolean[] boolArr = new Boolean[length];
                        while (i < zArr.length) {
                            boolArr[i] = Boolean.valueOf(zArr[i]);
                            i++;
                        }
                        map2.put(str, boolArr);
                    } else if (cls == byte[].class) {
                        byte[] bArr = (byte[]) value;
                        int length2 = bArr.length;
                        axt axtVar2 = axt.f2689a;
                        Byte[] bArr2 = new Byte[length2];
                        while (i < bArr.length) {
                            bArr2[i] = Byte.valueOf(bArr[i]);
                            i++;
                        }
                        map2.put(str, bArr2);
                    } else if (cls == int[].class) {
                        int[] iArr = (int[]) value;
                        int length3 = iArr.length;
                        axt axtVar3 = axt.f2689a;
                        Integer[] numArr = new Integer[length3];
                        while (i < iArr.length) {
                            numArr[i] = Integer.valueOf(iArr[i]);
                            i++;
                        }
                        map2.put(str, numArr);
                    } else if (cls == long[].class) {
                        long[] jArr = (long[]) value;
                        int length4 = jArr.length;
                        axt axtVar4 = axt.f2689a;
                        Long[] lArr = new Long[length4];
                        while (i < jArr.length) {
                            lArr[i] = Long.valueOf(jArr[i]);
                            i++;
                        }
                        map2.put(str, lArr);
                    } else if (cls == float[].class) {
                        float[] fArr = (float[]) value;
                        int length5 = fArr.length;
                        axt axtVar5 = axt.f2689a;
                        Float[] fArr2 = new Float[length5];
                        while (i < fArr.length) {
                            fArr2[i] = Float.valueOf(fArr[i]);
                            i++;
                        }
                        map2.put(str, fArr2);
                    } else {
                        if (cls != double[].class) {
                            throw new IllegalArgumentException("Key " + str + "has invalid type " + cls);
                        }
                        double[] dArr = (double[]) value;
                        int length6 = dArr.length;
                        axt axtVar6 = axt.f2689a;
                        Double[] dArr2 = new Double[length6];
                        while (i < dArr.length) {
                            dArr2[i] = Double.valueOf(dArr[i]);
                            i++;
                        }
                        map2.put(str, dArr2);
                    }
                }
            }
        }
    }

    /* JADX INFO: renamed from: g */
    public static final axr m6571g(Set set, int i) {
        return new axr(i, false, false, false, false, -1L, -1L, omn.m18675O(set));
    }
}
