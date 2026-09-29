package p000;

import android.content.Context;
import android.os.Bundle;
import androidx.datastore.preferences.protobuf.DescriptorProtos;
import com.facebook.LoggingBehavior;
import com.facebook.appevents.AppEventsLogger$FlushBehavior;
import com.facebook.appevents.FlushReason;
import com.google.android.gms.internal.play_billing.AbstractC0998i;
import com.iterable.iterableapi.C1207c;
import java.io.File;
import java.security.KeyStore;
import java.security.Provider;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Set;
import java.util.concurrent.Executor;
import javax.crypto.Cipher;
import kotlin.collections.builders.ListBuilder;
import okio.ByteString;

/* JADX INFO: loaded from: classes.dex */
public final class gz8 implements zc1, jn1, xdc, d94, jl1, ns2, dqb {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f41572a;

    /* JADX INFO: renamed from: b */
    public static final gz8 f41561b = new gz8(0);

    /* JADX INFO: renamed from: c */
    public static final long[] f41562c = {300000, 900000, 1800000, 3600000, 21600000, 43200000, 86400000, 172800000, 259200000, 604800000, 1209600000, 1814400000, 2419200000L, 5184000000L, 7776000000L, 10368000000L, 12960000000L, 15552000000L, 31536000000L};

    /* JADX INFO: renamed from: d */
    public static final gz8 f41563d = new gz8(1);

    /* JADX INFO: renamed from: e */
    public static final gz8 f41564e = new gz8(2);

    /* JADX INFO: renamed from: f */
    public static final /* synthetic */ gz8 f41565f = new gz8(3);

    /* JADX INFO: renamed from: g */
    public static final gz8 f41566g = new gz8(4);

    /* JADX INFO: renamed from: h */
    public static final gz8 f41567h = new gz8(5);

    /* JADX INFO: renamed from: i */
    public static final gz8 f41568i = new gz8(6);

    /* JADX INFO: renamed from: j */
    public static final /* synthetic */ gz8 f41569j = new gz8(19);

    /* JADX INFO: renamed from: k */
    public static final /* synthetic */ gz8 f41570k = new gz8(20);

    /* JADX INFO: renamed from: l */
    public static final /* synthetic */ gz8 f41571l = new gz8(21);

    /* JADX INFO: renamed from: H */
    public static final /* synthetic */ gz8 f41554H = new gz8(22);

    /* JADX INFO: renamed from: I */
    public static final /* synthetic */ gz8 f41555I = new gz8(23);

    /* JADX INFO: renamed from: J */
    public static final /* synthetic */ gz8 f41556J = new gz8(24);

    /* JADX INFO: renamed from: K */
    public static final /* synthetic */ gz8 f41557K = new gz8(25);

    /* JADX INFO: renamed from: L */
    public static final /* synthetic */ gz8 f41558L = new gz8(26);

    /* JADX INFO: renamed from: M */
    public static final /* synthetic */ gz8 f41559M = new gz8(27);

    /* JADX INFO: renamed from: N */
    public static final /* synthetic */ gz8 f41560N = new gz8(28);

    public /* synthetic */ gz8(int i) {
        this.f41572a = i;
    }

    /* JADX INFO: renamed from: e */
    public static final KeyStore m12973e() {
        char[] cArr = C1207c.f13995a;
        Object value = C1207c.f13996b.getValue();
        value.getClass();
        return (KeyStore) value;
    }

    /* JADX INFO: renamed from: f */
    public static final float m12974f(float f, float[] fArr, float[] fArr2) {
        float f2;
        float f3;
        float f4;
        float f5;
        float fAbs = Math.abs(f);
        float fSignum = Math.signum(f);
        int iBinarySearch = Arrays.binarySearch(fArr, fAbs);
        if (iBinarySearch >= 0) {
            return fSignum * fArr2[iBinarySearch];
        }
        int i = -(iBinarySearch + 1);
        int i2 = i - 1;
        if (i2 >= fArr.length - 1) {
            float f6 = fArr[fArr.length - 1];
            float f7 = fArr2[fArr.length - 1];
            if (f6 == 0.0f) {
                return 0.0f;
            }
            return (f7 / f6) * f;
        }
        if (i2 == -1) {
            float f8 = fArr[0];
            f4 = fArr2[0];
            f5 = f8;
            f3 = 0.0f;
            f2 = 0.0f;
        } else {
            float f9 = fArr[i2];
            float f10 = fArr[i];
            f2 = fArr2[i2];
            f3 = f9;
            f4 = fArr2[i];
            f5 = f10;
        }
        return (((f4 - f2) * Math.max(0.0f, Math.min(1.0f, f3 == f5 ? 0.0f : (fAbs - f3) / (f5 - f3)))) + f2) * fSignum;
    }

    /* JADX INFO: renamed from: g */
    public static bj8 m12975g(gz8 gz8Var, List list, int i, int i2) {
        char c;
        long j;
        List listM23635i;
        float f;
        long j2 = 4294967295L;
        long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(0.5f)) << 32) | (((long) Float.floatToRawIntBits(0.5f)) & 4294967295L);
        int i3 = 0;
        float f2 = 360.0f;
        if ((i2 & 8) == 0) {
            ListBuilder listBuilderM23650t = vz1.m23650t();
            ArrayList arrayList = new ArrayList(list.size());
            List list2 = list;
            int size = list2.size();
            c = ' ';
            int i4 = 0;
            while (i4 < size) {
                gs5 gs5Var = (gs5) list.get(i4);
                gz8 gz8Var2 = hs5.f42876a;
                long j3 = j2;
                long jM12824e = gq6.m12824e(gs5Var.f41265a, jFloatToRawIntBits);
                arrayList.add(Float.valueOf((((float) Math.atan2(Float.intBitsToFloat((int) (jM12824e & j3)), Float.intBitsToFloat((int) (jM12824e >> 32)))) * 180.0f) / 3.1415927f));
                i4++;
                j2 = j3;
            }
            j = j2;
            float f3 = 2.0f;
            ArrayList arrayList2 = new ArrayList(list.size());
            int size2 = list2.size();
            for (int i5 = 0; i5 < size2; i5++) {
                arrayList2.add(Float.valueOf(gq6.m12822c(gq6.m12824e(((gs5) list.get(i5)).f41265a, jFloatToRawIntBits))));
            }
            int i6 = i * 2;
            float f4 = 360.0f / i6;
            int i7 = 0;
            while (i7 < i6) {
                Iterator it = vz1.m23601G(list2).iterator();
                while (((h84) it).f41941c) {
                    int iNextInt = ((a84) it).nextInt();
                    int i8 = i7 % 2;
                    if (i8 != 0) {
                        iNextInt = (list.size() - 1) - iNextInt;
                    }
                    if (iNextInt > 0 || i8 == 0) {
                        gz8 gz8Var3 = hs5.f42876a;
                        f = f3;
                        double dFloatValue = (((i7 * f4) + (i8 == 0 ? ((Number) arrayList.get(iNextInt)).floatValue() : (((Number) arrayList.get(i3)).floatValue() * f) + (f4 - ((Number) arrayList.get(iNextInt)).floatValue()))) / f2) * f * 3.1415927f;
                        listBuilderM23650t.add(new gs5(gq6.m12825f(gq6.m12826g(((Number) arrayList2.get(iNextInt)).floatValue(), (((long) Float.floatToRawIntBits((float) Math.sin(dFloatValue))) & j) | (((long) Float.floatToRawIntBits((float) Math.cos(dFloatValue))) << 32)), jFloatToRawIntBits), ((gs5) list.get(iNextInt)).f41266b));
                    } else {
                        f = f3;
                    }
                    it = it;
                    f2 = f2;
                    f3 = f;
                    arrayList = arrayList;
                    i3 = 0;
                }
                i7++;
                i3 = 0;
            }
            listM23635i = vz1.m23635i(listBuilderM23650t);
        } else {
            c = ' ';
            j = 4294967295L;
            float f5 = 360.0f;
            int size3 = list.size();
            i84 i84VarM15922M = l70.m15922M(0, size3 * i);
            ArrayList arrayList3 = new ArrayList(v91.m23189q0(i84VarM15922M, 10));
            Iterator it2 = i84VarM15922M.iterator();
            while (((h84) it2).f41941c) {
                int iNextInt2 = ((a84) it2).nextInt();
                gz8 gz8Var4 = hs5.f42876a;
                int i9 = iNextInt2 % size3;
                long jM12824e2 = gq6.m12824e(((gs5) list.get(i9)).f41265a, jFloatToRawIntBits);
                int i10 = (int) (jM12824e2 >> 32);
                double d = ((((iNextInt2 / size3) * f5) / i) / f5) * 2.0f * 3.1415927f;
                int i11 = (int) (jM12824e2 & 4294967295L);
                arrayList3.add(new gs5(gq6.m12825f((((long) Float.floatToRawIntBits((Float.intBitsToFloat(i10) * ((float) Math.cos(d))) - (Float.intBitsToFloat(i11) * ((float) Math.sin(d))))) << 32) | (((long) Float.floatToRawIntBits((Float.intBitsToFloat(i11) * ((float) Math.cos(d))) + (Float.intBitsToFloat(i10) * ((float) Math.sin(d))))) & 4294967295L), jFloatToRawIntBits), ((gs5) list.get(i9)).f41266b));
                f5 = 360.0f;
            }
            listM23635i = arrayList3;
        }
        int size4 = listM23635i.size() * 2;
        float[] fArr = new float[size4];
        for (int i12 = 0; i12 < size4; i12++) {
            long j4 = ((gs5) listM23635i.get(i12 / 2)).f41265a;
            fArr[i12] = Float.intBitsToFloat((int) (i12 % 2 == 0 ? j4 >> c : j4 & j));
        }
        ListBuilder listBuilderM23650t2 = vz1.m23650t();
        Iterator it3 = listM23635i.iterator();
        while (it3.hasNext()) {
            listBuilderM23650t2.add(((gs5) it3.next()).f41266b);
        }
        return pb1.m19036f(fArr, en1.f37551b, vz1.m23635i(listBuilderM23650t2), Float.intBitsToFloat((int) (jFloatToRawIntBits >> c)), Float.intBitsToFloat((int) (jFloatToRawIntBits & j)));
    }

    /* JADX INFO: renamed from: h */
    public static d57 m12976h(String str, boolean z) {
        str.getClass();
        ByteString byteString = AbstractC2909d.f34749a;
        aj0 aj0Var = new aj0();
        aj0Var.m495q0(str);
        return AbstractC2909d.m9952d(aj0Var, z);
    }

    /* JADX INFO: renamed from: i */
    public static d57 m12977i(File file) {
        String str = d57.f35013b;
        String string = file.toString();
        string.getClass();
        return m12976h(string, false);
    }

    /* JADX INFO: renamed from: k */
    public static final void m12978k(Context context, String str, String str2) {
        Set set = lp1.f49971a;
        if (set.contains(gz8.class)) {
            return;
        }
        try {
            context.getClass();
            Bundle bundle = new Bundle();
            bundle.putString("fb_mobile_launch_source", "Unclassified");
            C3012fs c3012fs = new C3012fs(str, str2);
            sy2 sy2Var = sy2.f61585a;
            if (ema.m11256c()) {
                c3012fs.m12038d("fb_mobile_activate_app", bundle);
            }
            String str3 = C3012fs.f39540c;
            if (iy5.m14194i() == AppEventsLogger$FlushBehavior.EXPLICIT_ONLY || set.contains(c3012fs)) {
                return;
            }
            try {
                AbstractC3546rr.m20754c(FlushReason.EXPLICIT);
            } catch (Throwable th) {
                lp1.m16420a(c3012fs, th);
            }
        } catch (Throwable th2) {
            lp1.m16420a(gz8.class, th2);
        }
    }

    /* JADX INFO: renamed from: n */
    public static final void m12979n(String str, C3488q8 c3488q8, String str2) {
        Long l;
        Set set = lp1.f49971a;
        if (set.contains(gz8.class) || c3488q8 == null) {
            return;
        }
        try {
            Long l2 = (Long) c3488q8.f57372f;
            if (l2 == null) {
                l2 = 0L;
            }
            long jLongValue = l2.longValue();
            gz8 gz8Var = f41561b;
            if (jLongValue < 0) {
                gz8Var.m12981m();
                jLongValue = 0;
            }
            Long l3 = (Long) c3488q8.f57369c;
            long jLongValue2 = (l3 == null || (l = (Long) c3488q8.f57370d) == null) ? 0L : l.longValue() - l3.longValue();
            if (jLongValue2 < 0) {
                gz8Var.m12981m();
                jLongValue2 = 0;
            }
            Bundle bundle = new Bundle();
            bundle.putInt("fb_mobile_app_interruptions", c3488q8.f57368b);
            Locale locale = Locale.ROOT;
            int i = 0;
            if (!set.contains(gz8.class)) {
                int i2 = 0;
                while (true) {
                    try {
                        long[] jArr = f41562c;
                        if (i2 >= 19 || jArr[i2] >= jLongValue) {
                            break;
                        } else {
                            i2++;
                        }
                    } catch (Throwable th) {
                        lp1.m16420a(gz8.class, th);
                    }
                }
                i = i2;
            }
            bundle.putString("fb_mobile_time_between_sessions", String.format(locale, "session_quanta_%d", Arrays.copyOf(new Object[]{Integer.valueOf(i)}, 1)));
            mc0 mc0Var = (mc0) c3488q8.f57373g;
            bundle.putString("fb_mobile_launch_source", mc0Var != null ? mc0Var.toString() : "Unclassified");
            Long l4 = (Long) c3488q8.f57370d;
            bundle.putLong("_logTime", (l4 != null ? l4.longValue() : 0L) / 1000);
            C3012fs c3012fs = new C3012fs(str, str2);
            double d = jLongValue2 / 1000.0d;
            sy2 sy2Var = sy2.f61585a;
            if (!ema.m11256c() || lp1.f49971a.contains(c3012fs)) {
                return;
            }
            try {
                C3012fs.m12037f(c3012fs, "fb_mobile_deactivate_app", Double.valueOf(d), bundle, false, AbstractC3785y6.m24949b());
            } catch (Throwable th2) {
                lp1.m16420a(c3012fs, th2);
            }
        } catch (Throwable th3) {
            lp1.m16420a(gz8.class, th3);
        }
    }

    @Override // p000.xdc
    /* JADX INFO: renamed from: a */
    public fgc mo12668a(Class cls) {
        if (!AbstractC0998i.class.isAssignableFrom(cls)) {
            C3386nv.m17626m("Unsupported message type: ".concat(cls.getName()));
            return null;
        }
        try {
            return (fgc) AbstractC0998i.m5535m(cls.asSubclass(AbstractC0998i.class)).mo5511j(3);
        } catch (Exception e) {
            ij6.m13958p("Unable to get message info for ".concat(cls.getName()), e);
            return null;
        }
    }

    @Override // p000.jl1
    /* JADX INFO: renamed from: b */
    public long mo10837b(long j, long j2) {
        float fIntBitsToFloat = Float.intBitsToFloat((int) (j2 >> 32)) / Float.intBitsToFloat((int) (j >> 32));
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (j2 & 4294967295L)) / Float.intBitsToFloat((int) (j & 4294967295L));
        long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(fIntBitsToFloat)) << 32) | (((long) Float.floatToRawIntBits(fIntBitsToFloat2)) & 4294967295L);
        int i = km8.f47515a;
        return jFloatToRawIntBits;
    }

    @Override // p000.xdc
    /* JADX INFO: renamed from: c */
    public boolean mo12669c(Class cls) {
        return AbstractC0998i.class.isAssignableFrom(cls);
    }

    @Override // p000.ns2
    /* JADX INFO: renamed from: d */
    public Object mo10838d(String str, Provider provider) {
        return provider == null ? Cipher.getInstance(str) : Cipher.getInstance(str, provider);
    }

    /* JADX INFO: renamed from: j */
    public bj8 m12980j() {
        bj8 bj8Var = hs5.f42888m;
        if (bj8Var != null) {
            return bj8Var;
        }
        bj8 bj8VarM3787a = m12975g(this, vz1.m23605K(new gs5((((long) Float.floatToRawIntBits(0.193f)) << 32) | (((long) Float.floatToRawIntBits(0.277f)) & 4294967295L), new en1(2, 0.053f)), new gs5((((long) Float.floatToRawIntBits(0.176f)) << 32) | (((long) Float.floatToRawIntBits(0.055f)) & 4294967295L), new en1(2, 0.053f))), 10, 12).m3787a();
        hs5.f42888m = bj8VarM3787a;
        return bj8VarM3787a;
    }

    @Override // p000.zc1
    /* JADX INFO: renamed from: l */
    public Object mo3790l(co7 co7Var) {
        Object objMo4932g = co7Var.mo4932g(new rp7(ec5.class, Executor.class));
        objMo4932g.getClass();
        return bna.m3926O((Executor) objMo4932g);
    }

    /* JADX INFO: renamed from: m */
    public void m12981m() {
        if (lp1.f49971a.contains(this)) {
            return;
        }
        try {
            iy5 iy5Var = qj5.f57852d;
            iy5.m14197m(LoggingBehavior.APP_EVENTS, "gz8", "Clock skew detected");
        } catch (Throwable th) {
            lp1.m16420a(this, th);
        }
    }

    public String toString() {
        switch (this.f41572a) {
            case 5:
                return "Start";
            default:
                return super.toString();
        }
    }

    @Override // p000.dqb
    public Object zza() {
        switch (this.f41572a) {
            case 19:
                ((dkb) akb.f784b.f785a.get()).getClass();
                return new Boolean(((Boolean) dkb.f35754a.get()).booleanValue());
            case 20:
                List list = z8c.f71153a;
                wjb.f66949b.get().getClass();
                return Integer.valueOf((int) ((Long) xjb.f68306a.m19918r("measurement.upload.max_conversions_per_day", 68, 10000L).get()).longValue());
            case 21:
                List list2 = z8c.f71153a;
                wjb.f66949b.get().getClass();
                return Integer.valueOf((int) ((Long) xjb.f68306a.m19918r("measurement.sgtm.batch.retry_max_count", 42, 10L).get()).longValue());
            case 22:
                List list3 = z8c.f71153a;
                wjb.f66949b.get().getClass();
                return (Long) xjb.f68306a.m19918r("measurement.upload.minimum_delay", 28, 500L).get();
            case DescriptorProtos.FileOptions.DEPRECATED_FIELD_NUMBER /* 23 */:
                List list4 = z8c.f71153a;
                wjb.f66949b.get().getClass();
                return (Long) xjb.f68306a.m19918r("measurement.service_client.idle_disconnect_millis", 36, 5000L).get();
            case 24:
                List list5 = z8c.f71153a;
                wjb.f66949b.get().getClass();
                return Integer.valueOf((int) ((Long) xjb.f68306a.m19918r("measurement.max_bundles_per_iteration", 3, 100L).get()).longValue());
            case 25:
                List list6 = z8c.f71153a;
                wjb.f66949b.get().getClass();
                return (String) xjb.f68306a.m19920u("measurement.rb.attribution.event_params", 13, "value|currency").get();
            case 26:
                List list7 = z8c.f71153a;
                wjb.f66949b.get().getClass();
                return Integer.valueOf((int) ((Long) xjb.f68306a.m19918r("measurement.upload.max_bundle_size", 66, 65536L).get()).longValue());
            case DescriptorProtos.FileOptions.JAVA_STRING_CHECK_UTF8_FIELD_NUMBER /* 27 */:
                List list8 = z8c.f71153a;
                wjb.f66949b.get().getClass();
                return Integer.valueOf((int) ((Long) xjb.f68306a.m19918r("measurement.upload.max_events_per_bundle", 70, 1000L).get()).longValue());
            default:
                List list9 = z8c.f71153a;
                wjb.f66949b.get().getClass();
                return (Long) xjb.f68306a.m19918r("measurement.ad_id_cache_time", 0, 10000L).get();
        }
    }
}
