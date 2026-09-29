package p067d8;

import com.facebook.FacebookRequestError;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import kotlin.Pair;
import kotlin.collections.C6753d;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: renamed from: d8.i */
/* JADX INFO: loaded from: classes.dex */
public final class C5069i {

    /* JADX INFO: renamed from: d */
    public static final a f32950d = new a();

    /* JADX INFO: renamed from: e */
    public static C5069i f32951e;

    /* JADX INFO: renamed from: a */
    public final Map<Integer, Set<Integer>> f32952a;

    /* JADX INFO: renamed from: b */
    public final Map<Integer, Set<Integer>> f32953b;

    /* JADX INFO: renamed from: c */
    public final Map<Integer, Set<Integer>> f32954c;

    /* JADX INFO: renamed from: d8.i$a */
    public static final class a {
        /* JADX INFO: renamed from: b */
        public static C5069i m10763b() {
            return new C5069i(null, C6753d.m13461N0(new Pair(2, null), new Pair(4, null), new Pair(9, null), new Pair(17, null), new Pair(341, null)), C6753d.m13461N0(new Pair(102, null), new Pair(190, null), new Pair(412, null)), null, null, null);
        }

        /* JADX INFO: renamed from: c */
        public static HashMap m10764c(JSONObject jSONObject) {
            int iOptInt;
            HashSet hashSet;
            JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("items");
            if (jSONArrayOptJSONArray.length() == 0) {
                return null;
            }
            HashMap map = new HashMap();
            int length = jSONArrayOptJSONArray.length();
            if (length > 0) {
                int i10 = 0;
                while (true) {
                    int i11 = i10 + 1;
                    JSONObject jSONObjectOptJSONObject = jSONArrayOptJSONArray.optJSONObject(i10);
                    if (jSONObjectOptJSONObject != null && (iOptInt = jSONObjectOptJSONObject.optInt("code")) != 0) {
                        JSONArray jSONArrayOptJSONArray2 = jSONObjectOptJSONObject.optJSONArray("subcodes");
                        if (jSONArrayOptJSONArray2 == null || jSONArrayOptJSONArray2.length() <= 0) {
                            hashSet = null;
                        } else {
                            hashSet = new HashSet();
                            int length2 = jSONArrayOptJSONArray2.length();
                            if (length2 > 0) {
                                int i12 = 0;
                                while (true) {
                                    int i13 = i12 + 1;
                                    int iOptInt2 = jSONArrayOptJSONArray2.optInt(i12);
                                    if (iOptInt2 != 0) {
                                        hashSet.add(Integer.valueOf(iOptInt2));
                                    }
                                    if (i13 >= length2) {
                                        break;
                                    }
                                    i12 = i13;
                                }
                            }
                            map.put(Integer.valueOf(iOptInt), hashSet);
                        }
                        map.put(Integer.valueOf(iOptInt), hashSet);
                    }
                    if (i11 >= length) {
                        break;
                    }
                    i10 = i11;
                }
            }
            return map;
        }

        /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
        /* JADX INFO: renamed from: a */
        public final synchronized C5069i m10765a() {
            C5069i c5069i;
            try {
                if (C5069i.f32951e == null) {
                    C5069i.f32951e = m10763b();
                }
                c5069i = C5069i.f32951e;
                if (c5069i == null) {
                    throw new NullPointerException("null cannot be cast to non-null type com.facebook.internal.FacebookRequestErrorClassification");
                }
            } catch (Throwable th2) {
                throw th2;
            }
            return c5069i;
        }
    }

    /* JADX INFO: renamed from: d8.i$b */
    public /* synthetic */ class b {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f32955a;

        static {
            int[] iArr = new int[FacebookRequestError.Category.valuesCustom().length];
            iArr[FacebookRequestError.Category.OTHER.ordinal()] = 1;
            iArr[FacebookRequestError.Category.LOGIN_RECOVERABLE.ordinal()] = 2;
            iArr[FacebookRequestError.Category.TRANSIENT.ordinal()] = 3;
            f32955a = iArr;
        }
    }

    public C5069i(HashMap map, HashMap map2, HashMap map3, String str, String str2, String str3) {
        this.f32952a = map;
        this.f32953b = map2;
        this.f32954c = map3;
    }
}
