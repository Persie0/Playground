package p000;

import android.os.Build;
import android.view.View;
import androidx.compose.p002ui.node.AbstractC0362l;
import androidx.compose.p002ui.node.C0357g;
import androidx.datastore.preferences.protobuf.DescriptorProtos;
import com.facebook.appevents.p008ml.ModelManager$Task;
import com.google.android.gms.internal.measurement.AbstractC0964h;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.atomic.AtomicReferenceArray;
import kotlin.Pair;
import kotlin.collections.AbstractC3194a;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public final class p84 implements g94, yva, sl6, d94, dqb {

    /* JADX INFO: renamed from: c */
    public static boolean f55741c;

    /* JADX INFO: renamed from: d */
    public static boolean f55742d;

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f55751a;

    /* JADX INFO: renamed from: b */
    public static final p84 f55740b = new p84(0);

    /* JADX INFO: renamed from: e */
    public static final p84 f55743e = new p84(1);

    /* JADX INFO: renamed from: f */
    public static final p84 f55744f = new p84(2);

    /* JADX INFO: renamed from: g */
    public static final p84 f55745g = new p84(3);

    /* JADX INFO: renamed from: h */
    public static final p84 f55746h = new p84(4);

    /* JADX INFO: renamed from: i */
    public static final ij6 f55747i = new ij6(23);

    /* JADX INFO: renamed from: j */
    public static final ij6 f55748j = new ij6(24);

    /* JADX INFO: renamed from: k */
    public static final ij6 f55749k = new ij6(25);

    /* JADX INFO: renamed from: l */
    public static final ij6 f55750l = new ij6(26);

    /* JADX INFO: renamed from: H */
    public static final w6b f55730H = new w6b();

    /* JADX INFO: renamed from: I */
    public static final /* synthetic */ p84 f55731I = new p84(20);

    /* JADX INFO: renamed from: J */
    public static final /* synthetic */ p84 f55732J = new p84(21);

    /* JADX INFO: renamed from: K */
    public static final /* synthetic */ p84 f55733K = new p84(22);

    /* JADX INFO: renamed from: L */
    public static final /* synthetic */ p84 f55734L = new p84(23);

    /* JADX INFO: renamed from: M */
    public static final /* synthetic */ p84 f55735M = new p84(24);

    /* JADX INFO: renamed from: N */
    public static final /* synthetic */ p84 f55736N = new p84(25);

    /* JADX INFO: renamed from: O */
    public static final /* synthetic */ p84 f55737O = new p84(26);

    /* JADX INFO: renamed from: P */
    public static final /* synthetic */ p84 f55738P = new p84(27);

    /* JADX INFO: renamed from: Q */
    public static final /* synthetic */ p84 f55739Q = new p84(28);

    public p84() {
        this.f55751a = 10;
        if (Build.VERSION.SDK_INT >= 35) {
        }
    }

    /* JADX INFO: renamed from: h */
    public static final void m18963h(List list, StringBuilder sb) {
        g84 g84VarM15914E = l70.m15914E(2, l70.m15922M(0, list.size()));
        int i = g84VarM15914E.f40379a;
        int i2 = g84VarM15914E.f40380b;
        int i3 = g84VarM15914E.f40381c;
        if ((i3 <= 0 || i > i2) && (i3 >= 0 || i2 > i)) {
            return;
        }
        while (true) {
            String str = (String) list.get(i);
            String str2 = (String) list.get(i + 1);
            if (i > 0) {
                sb.append('&');
            }
            sb.append(str);
            if (str2 != null) {
                sb.append('=');
                sb.append(str2);
            }
            if (i == i2) {
                return;
            } else {
                i += i3;
            }
        }
    }

    /* JADX INFO: renamed from: j */
    public static qy2 m18964j() {
        return new qy2(null, AbstractC3194a.m15362O(new Pair(2, null), new Pair(4, null), new Pair(9, null), new Pair(17, null), new Pair(341, null)), AbstractC3194a.m15362O(new Pair(102, null), new Pair(190, null), new Pair(412, null)), null, null, null);
    }

    /* JADX INFO: renamed from: l */
    public static HashMap m18965l(JSONObject jSONObject) {
        int iOptInt;
        HashSet hashSet;
        JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("items");
        if (jSONArrayOptJSONArray == null || jSONArrayOptJSONArray.length() == 0) {
            return null;
        }
        HashMap map = new HashMap();
        int length = jSONArrayOptJSONArray.length();
        for (int i = 0; i < length; i++) {
            JSONObject jSONObjectOptJSONObject = jSONArrayOptJSONArray.optJSONObject(i);
            if (jSONObjectOptJSONObject != null && (iOptInt = jSONObjectOptJSONObject.optInt("code")) != 0) {
                JSONArray jSONArrayOptJSONArray2 = jSONObjectOptJSONObject.optJSONArray("subcodes");
                if (jSONArrayOptJSONArray2 == null || jSONArrayOptJSONArray2.length() <= 0) {
                    hashSet = null;
                } else {
                    hashSet = new HashSet();
                    int length2 = jSONArrayOptJSONArray2.length();
                    for (int i2 = 0; i2 < length2; i2++) {
                        int iOptInt2 = jSONArrayOptJSONArray2.optInt(i2);
                        if (iOptInt2 != 0) {
                            hashSet.add(Integer.valueOf(iOptInt2));
                        }
                    }
                }
                map.put(Integer.valueOf(iOptInt), hashSet);
            }
        }
        return map;
    }

    @Override // p000.sl6
    /* JADX INFO: renamed from: a */
    public boolean mo18966a(d16 d16Var) {
        return false;
    }

    @Override // p000.sl6
    /* JADX INFO: renamed from: b */
    public int mo18967b() {
        return 8;
    }

    @Override // p000.sl6
    /* JADX INFO: renamed from: c */
    public boolean mo18968c(d16 d16Var) {
        return xwc.m24736I(pvc.m19511g(te1.m21979L(d16Var), false));
    }

    @Override // p000.sl6
    /* JADX INFO: renamed from: d */
    public void mo18969d(C0357g c0357g, long j, cu3 cu3Var, int i, boolean z) {
        k40 k40Var = c0357g.f4335a0;
        AbstractC0362l abstractC0362l = (AbstractC0362l) k40Var.f46677e;
        q98 q98Var = AbstractC0362l.f4427i0;
        ((AbstractC0362l) k40Var.f46677e).m1689k1(AbstractC0362l.f4431m0, abstractC0362l.m1679c1(j), cu3Var, 1, z);
    }

    @Override // p000.sl6
    /* JADX INFO: renamed from: e */
    public boolean mo18970e(cu3 cu3Var, C0357g c0357g) {
        return false;
    }

    @Override // p000.sl6
    /* JADX INFO: renamed from: f */
    public boolean mo18971f(C0357g c0357g) {
        kv8 kv8VarM1613z = c0357g.m1613z();
        boolean z = false;
        if (kv8VarM1613z != null && kv8VarM1613z.f48474d) {
            z = true;
        }
        return !z;
    }

    @Override // p000.yva
    /* JADX INFO: renamed from: g */
    public f6b mo13223g(View view, f6b f6bVar, zva zvaVar) {
        zvaVar.f72288d = f6bVar.m11571a() + zvaVar.f72288d;
        boolean z = view.getLayoutDirection() == 1;
        int iM11572b = f6bVar.m11572b();
        int iM11573c = f6bVar.m11573c();
        int i = zvaVar.f72285a + (z ? iM11573c : iM11572b);
        zvaVar.f72285a = i;
        int i2 = zvaVar.f72287c;
        if (!z) {
            iM11572b = iM11573c;
        }
        int i3 = i2 + iM11572b;
        zvaVar.f72287c = i3;
        view.setPaddingRelative(i, zvaVar.f72286b, i3, zvaVar.f72288d);
        return f6bVar;
    }

    /* JADX INFO: renamed from: i */
    public synchronized qy2 m18972i() {
        qy2 qy2Var;
        try {
            if (qy2.f58370e == null) {
                qy2.f58370e = m18964j();
            }
            qy2Var = qy2.f58370e;
            qy2Var.getClass();
        } catch (Throwable th) {
            throw th;
        }
        return qy2Var;
    }

    /* JADX INFO: renamed from: k */
    public synchronized C3309ls m18973k() {
        C3309ls c3309ls;
        try {
            if (C3309ls.f50062l == null) {
                w41 w41VarM23706r = w41.m23706r(sy2.m21766a());
                w41VarM23706r.getClass();
                C3309ls.f50062l = new C3309ls(w41VarM23706r, new C3336mi(), 3);
            }
            c3309ls = C3309ls.f50062l;
            if (c3309ls == null) {
                fa4.m11636J("instance");
                throw null;
            }
        } catch (Throwable th) {
            throw th;
        }
        return c3309ls;
    }

    /* JADX INFO: renamed from: m */
    public boolean m18974m(String str) {
        Set set = lp1.f49971a;
        if (set.contains(this)) {
            return false;
        }
        try {
            String str2 = null;
            if (!set.contains(this)) {
                try {
                    float[] fArr = new float[30];
                    for (int i = 0; i < 30; i++) {
                        fArr[i] = 0.0f;
                    }
                    String[] strArrM24815f = y06.m24815f(ModelManager$Task.MTML_INTEGRITY_DETECT, new float[][]{fArr}, new String[]{str});
                    if (strArrM24815f == null || (str2 = strArrM24815f[0]) == null) {
                        str2 = "none";
                    }
                } catch (Throwable th) {
                    lp1.m16420a(this, th);
                }
            }
            return !"none".equals(str2);
        } catch (Throwable th2) {
            lp1.m16420a(this, th2);
            return false;
        }
    }

    public String toString() {
        switch (this.f55751a) {
            case 4:
                return "coil.request.NullRequestData";
            case 9:
                return "Empty";
            default:
                return super.toString();
        }
    }

    @Override // p000.dqb
    public Object zza() {
        i6d i6dVar;
        switch (this.f55751a) {
            case 20:
                List list = z8c.f71153a;
                ((hkb) gkb.f40919b.f40920a.get()).getClass();
                return (String) hkb.f42552b.get();
            case 21:
                List list2 = z8c.f71153a;
                wjb.f66949b.get().getClass();
                return (Long) xjb.f68306a.m19918r("measurement.monitoring.sample_period_millis", 29, 86400000L).get();
            case 22:
                List list3 = z8c.f71153a;
                wjb.f66949b.get().getClass();
                return (Long) xjb.f68306a.m19918r("measurement.upload.window_interval", 79, 3600000L).get();
            case DescriptorProtos.FileOptions.DEPRECATED_FIELD_NUMBER /* 23 */:
                List list4 = z8c.f71153a;
                wjb.f66949b.get().getClass();
                return (Long) xjb.f68306a.m19918r("measurement.upload.max_queue_time", 73, 518400000L).get();
            case 24:
                List list5 = z8c.f71153a;
                zkb.f71689b.get().getClass();
                qfa qfaVar = alb.f818a;
                AtomicReferenceArray atomicReferenceArray = (AtomicReferenceArray) qfaVar.f57705a;
                AbstractC0964h abstractC0964h = (AbstractC0964h) atomicReferenceArray.get(2);
                AbstractC0964h abstractC0964h2 = abstractC0964h;
                if (abstractC0964h == null) {
                    i6dVar = new i6d((pl1) ((nr9) qfaVar.f57706b).f53173a);
                    if (!dnb.m10509j(atomicReferenceArray, i6dVar)) {
                        abstractC0964h2 = i6dVar;
                        AbstractC0964h abstractC0964h3 = (AbstractC0964h) atomicReferenceArray.get(2);
                        abstractC0964h3.getClass();
                        abstractC0964h2 = abstractC0964h3;
                    }
                }
                abstractC0964h2 = i6dVar;
                return (Double) abstractC0964h2.get();
            case 25:
                List list6 = z8c.f71153a;
                wjb.f66949b.get().getClass();
                return (String) xjb.f68306a.m19920u("measurement.rb.attribution.uri_path", 58, "privacy-sandbox/register-app-conversion").get();
            case 26:
                List list7 = z8c.f71153a;
                wjb.f66949b.get().getClass();
                return (Boolean) xjb.f68306a.m19916p("measurement.config.notify_trigger_uris_on_backgrounded", 31, true).get();
            case DescriptorProtos.FileOptions.JAVA_STRING_CHECK_UTF8_FIELD_NUMBER /* 27 */:
                List list8 = z8c.f71153a;
                return Integer.valueOf((int) yjb.m25161a());
            default:
                List list9 = z8c.f71153a;
                blb.f8664b.get().getClass();
                return (Boolean) clb.f10242a.m19916p("measurement.rb.attribution.service.trigger_uris_high_priority", 2, true).get();
        }
    }

    public /* synthetic */ p84(Object obj, int i) {
        this.f55751a = i;
    }

    public /* synthetic */ p84(int i) {
        this.f55751a = i;
    }
}
