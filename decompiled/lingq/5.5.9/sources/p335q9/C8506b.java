package p335q9;

import com.google.android.exoplayer2.extractor.flv.TagPayloadReader;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import p261m9.C7506g;
import p479xa.C10151t;

/* JADX INFO: renamed from: q9.b */
/* JADX INFO: loaded from: classes.dex */
public final class C8506b extends TagPayloadReader {

    /* JADX INFO: renamed from: b */
    public long f45770b;

    /* JADX INFO: renamed from: c */
    public long[] f45771c;

    /* JADX INFO: renamed from: d */
    public long[] f45772d;

    public C8506b() {
        super(new C7506g());
        this.f45770b = -9223372036854775807L;
        this.f45771c = new long[0];
        this.f45772d = new long[0];
    }

    /* JADX INFO: renamed from: b */
    public static Serializable m16611b(int i10, C10151t c10151t) {
        if (i10 == 0) {
            return Double.valueOf(Double.longBitsToDouble(c10151t.m19138m()));
        }
        boolean z10 = true;
        if (i10 == 1) {
            if (c10151t.m19145t() != 1) {
                z10 = false;
            }
            return Boolean.valueOf(z10);
        }
        if (i10 == 2) {
            return m16613d(c10151t);
        }
        if (i10 != 3) {
            if (i10 == 8) {
                return m16612c(c10151t);
            }
            if (i10 != 10) {
                if (i10 != 11) {
                    return null;
                }
                Date date = new Date((long) Double.valueOf(Double.longBitsToDouble(c10151t.m19138m())).doubleValue());
                c10151t.m19125F(2);
                return date;
            }
            int iM19148w = c10151t.m19148w();
            ArrayList arrayList = new ArrayList(iM19148w);
            for (int i11 = 0; i11 < iM19148w; i11++) {
                Serializable serializableM16611b = m16611b(c10151t.m19145t(), c10151t);
                if (serializableM16611b != null) {
                    arrayList.add(serializableM16611b);
                }
            }
            return arrayList;
        }
        HashMap map = new HashMap();
        while (true) {
            String strM16613d = m16613d(c10151t);
            int iM19145t = c10151t.m19145t();
            if (iM19145t == 9) {
                return map;
            }
            Serializable serializableM16611b2 = m16611b(iM19145t, c10151t);
            if (serializableM16611b2 != null) {
                map.put(strM16613d, serializableM16611b2);
            }
        }
    }

    /* JADX INFO: renamed from: c */
    public static HashMap<String, Object> m16612c(C10151t c10151t) {
        int iM19148w = c10151t.m19148w();
        HashMap<String, Object> map = new HashMap<>(iM19148w);
        for (int i10 = 0; i10 < iM19148w; i10++) {
            String strM16613d = m16613d(c10151t);
            Serializable serializableM16611b = m16611b(c10151t.m19145t(), c10151t);
            if (serializableM16611b != null) {
                map.put(strM16613d, serializableM16611b);
            }
        }
        return map;
    }

    /* JADX INFO: renamed from: d */
    public static String m16613d(C10151t c10151t) {
        int iM19150y = c10151t.m19150y();
        int i10 = c10151t.f51439b;
        c10151t.m19125F(iM19150y);
        return new String(c10151t.f51438a, i10, iM19150y);
    }

    /* JADX INFO: renamed from: a */
    public final boolean m16614a(long j10, C10151t c10151t) {
        if (c10151t.m19145t() == 2 && "onMetaData".equals(m16613d(c10151t)) && c10151t.f51440c - c10151t.f51439b != 0 && c10151t.m19145t() == 8) {
            HashMap<String, Object> mapM16612c = m16612c(c10151t);
            Object obj = mapM16612c.get("duration");
            if (obj instanceof Double) {
                double dDoubleValue = ((Double) obj).doubleValue();
                if (dDoubleValue > 0.0d) {
                    this.f45770b = (long) (dDoubleValue * 1000000.0d);
                }
            }
            Object obj2 = mapM16612c.get("keyframes");
            if (obj2 instanceof Map) {
                Map map = (Map) obj2;
                Object obj3 = map.get("filepositions");
                Object obj4 = map.get("times");
                if ((obj3 instanceof List) && (obj4 instanceof List)) {
                    List list = (List) obj3;
                    List list2 = (List) obj4;
                    int size = list2.size();
                    this.f45771c = new long[size];
                    this.f45772d = new long[size];
                    for (int i10 = 0; i10 < size; i10++) {
                        Object obj5 = list.get(i10);
                        Object obj6 = list2.get(i10);
                        if (!(obj6 instanceof Double) || !(obj5 instanceof Double)) {
                            this.f45771c = new long[0];
                            this.f45772d = new long[0];
                            break;
                        }
                        this.f45771c[i10] = (long) (((Double) obj6).doubleValue() * 1000000.0d);
                        this.f45772d[i10] = ((Double) obj5).longValue();
                    }
                }
            }
            return false;
        }
        return false;
    }
}
