package p502y7;

import com.facebook.appevents.p050ml.ModelManager;
import dm.C5207g;
import java.util.HashMap;
import kotlin.Pair;
import kotlin.collections.C6753d;
import p173i8.C6205a;
import p260m8.C7499b;

/* JADX INFO: renamed from: y7.b */
/* JADX INFO: loaded from: classes.dex */
public final class C10301b {

    /* JADX INFO: renamed from: m */
    public static final HashMap f51818m = C6753d.m13461N0(new Pair("embedding.weight", "embed.weight"), new Pair("dense1.weight", "fc1.weight"), new Pair("dense2.weight", "fc2.weight"), new Pair("dense3.weight", "fc3.weight"), new Pair("dense1.bias", "fc1.bias"), new Pair("dense2.bias", "fc2.bias"), new Pair("dense3.bias", "fc3.bias"));

    /* JADX INFO: renamed from: a */
    public final C10300a f51819a;

    /* JADX INFO: renamed from: b */
    public final C10300a f51820b;

    /* JADX INFO: renamed from: c */
    public final C10300a f51821c;

    /* JADX INFO: renamed from: d */
    public final C10300a f51822d;

    /* JADX INFO: renamed from: e */
    public final C10300a f51823e;

    /* JADX INFO: renamed from: f */
    public final C10300a f51824f;

    /* JADX INFO: renamed from: g */
    public final C10300a f51825g;

    /* JADX INFO: renamed from: h */
    public final C10300a f51826h;

    /* JADX INFO: renamed from: i */
    public final C10300a f51827i;

    /* JADX INFO: renamed from: j */
    public final C10300a f51828j;

    /* JADX INFO: renamed from: k */
    public final C10300a f51829k;

    /* JADX INFO: renamed from: l */
    public final HashMap f51830l;

    public C10301b() {
        throw null;
    }

    /* JADX WARN: Unreachable blocks removed: 6, instructions: 6 */
    public C10301b(HashMap map) {
        Object obj = map.get("embed.weight");
        if (obj == null) {
            throw new IllegalStateException("Required value was null.".toString());
        }
        this.f51819a = (C10300a) obj;
        int i10 = C10303d.f51832a;
        Object obj2 = map.get("convs.0.weight");
        if (obj2 == null) {
            throw new IllegalStateException("Required value was null.".toString());
        }
        this.f51820b = C10303d.m19309l((C10300a) obj2);
        Object obj3 = map.get("convs.1.weight");
        if (obj3 == null) {
            throw new IllegalStateException("Required value was null.".toString());
        }
        this.f51821c = C10303d.m19309l((C10300a) obj3);
        Object obj4 = map.get("convs.2.weight");
        if (obj4 == null) {
            throw new IllegalStateException("Required value was null.".toString());
        }
        this.f51822d = C10303d.m19309l((C10300a) obj4);
        Object obj5 = map.get("convs.0.bias");
        if (obj5 == null) {
            throw new IllegalStateException("Required value was null.".toString());
        }
        this.f51823e = (C10300a) obj5;
        Object obj6 = map.get("convs.1.bias");
        if (obj6 == null) {
            throw new IllegalStateException("Required value was null.".toString());
        }
        this.f51824f = (C10300a) obj6;
        Object obj7 = map.get("convs.2.bias");
        if (obj7 == null) {
            throw new IllegalStateException("Required value was null.".toString());
        }
        this.f51825g = (C10300a) obj7;
        Object obj8 = map.get("fc1.weight");
        if (obj8 == null) {
            throw new IllegalStateException("Required value was null.".toString());
        }
        this.f51826h = C10303d.m19308k((C10300a) obj8);
        Object obj9 = map.get("fc2.weight");
        if (obj9 == null) {
            throw new IllegalStateException("Required value was null.".toString());
        }
        this.f51827i = C10303d.m19308k((C10300a) obj9);
        Object obj10 = map.get("fc1.bias");
        if (obj10 == null) {
            throw new IllegalStateException("Required value was null.".toString());
        }
        this.f51828j = (C10300a) obj10;
        Object obj11 = map.get("fc2.bias");
        if (obj11 == null) {
            throw new IllegalStateException("Required value was null.".toString());
        }
        this.f51829k = (C10300a) obj11;
        this.f51830l = new HashMap();
        for (String str : C7499b.m14973x0(ModelManager.Task.MTML_INTEGRITY_DETECT.toKey(), ModelManager.Task.MTML_APP_EVENT_PREDICTION.toKey())) {
            String strM11116k = C5207g.m11116k(".weight", str);
            String strM11116k2 = C5207g.m11116k(".bias", str);
            C10300a c10300a = (C10300a) map.get(strM11116k);
            C10300a c10300a2 = (C10300a) map.get(strM11116k2);
            if (c10300a != null) {
                this.f51830l.put(strM11116k, C10303d.m19308k(c10300a));
            }
            if (c10300a2 != null) {
                this.f51830l.put(strM11116k2, c10300a2);
            }
        }
    }

    /* JADX INFO: renamed from: a */
    public final C10300a m19297a(C10300a c10300a, String[] strArr, String str) {
        if (C6205a.m12742b(this)) {
            return null;
        }
        try {
            C5207g.m11111f(str, "task");
            int i10 = C10303d.f51832a;
            C10300a c10300aM19300c = C10303d.m19300c(C10303d.m19302e(strArr, this.f51819a), this.f51820b);
            C10303d.m19298a(c10300aM19300c, this.f51823e);
            C10303d.m19306i(c10300aM19300c);
            C10300a c10300aM19300c2 = C10303d.m19300c(c10300aM19300c, this.f51821c);
            C10303d.m19298a(c10300aM19300c2, this.f51824f);
            C10303d.m19306i(c10300aM19300c2);
            C10300a c10300aM19304g = C10303d.m19304g(c10300aM19300c2, 2);
            C10300a c10300aM19300c3 = C10303d.m19300c(c10300aM19304g, this.f51822d);
            C10303d.m19298a(c10300aM19300c3, this.f51825g);
            C10303d.m19306i(c10300aM19300c3);
            C10300a c10300aM19304g2 = C10303d.m19304g(c10300aM19300c, c10300aM19300c.f51815a[1]);
            C10300a c10300aM19304g3 = C10303d.m19304g(c10300aM19304g, c10300aM19304g.f51815a[1]);
            C10300a c10300aM19304g4 = C10303d.m19304g(c10300aM19300c3, c10300aM19300c3.f51815a[1]);
            C10303d.m19303f(c10300aM19304g2);
            C10303d.m19303f(c10300aM19304g3);
            C10303d.m19303f(c10300aM19304g4);
            C10300a c10300aM19301d = C10303d.m19301d(C10303d.m19299b(new C10300a[]{c10300aM19304g2, c10300aM19304g3, c10300aM19304g4, c10300a}), this.f51826h, this.f51828j);
            C10303d.m19306i(c10300aM19301d);
            C10300a c10300aM19301d2 = C10303d.m19301d(c10300aM19301d, this.f51827i, this.f51829k);
            C10303d.m19306i(c10300aM19301d2);
            HashMap map = this.f51830l;
            C10300a c10300a2 = (C10300a) map.get(C5207g.m11116k(".weight", str));
            C10300a c10300a3 = (C10300a) map.get(C5207g.m11116k(".bias", str));
            if (c10300a2 != null && c10300a3 != null) {
                C10300a c10300aM19301d3 = C10303d.m19301d(c10300aM19301d2, c10300a2, c10300a3);
                C10303d.m19307j(c10300aM19301d3);
                return c10300aM19301d3;
            }
            return null;
        } catch (Throwable th2) {
            C6205a.m12741a(this, th2);
            return null;
        }
    }
}
