package p000;

import android.content.Context;
import android.os.Bundle;
import android.util.Log;
import androidx.compose.p002ui.unit.LayoutDirection;
import androidx.datastore.preferences.protobuf.DescriptorProtos;
import java.security.KeyFactory;
import java.security.Provider;
import java.util.Date;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.time.Instant;

/* JADX INFO: loaded from: classes.dex */
public final class tr3 implements jn1, zc1, yc9, InterfaceC3624tu, InterfaceC3735wu, jl1, ns2, b41, jg9, k94, InterfaceC3407of, dqb, zn2 {

    /* JADX INFO: renamed from: f */
    public static tr3 f62760f;

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f62767a;

    /* JADX INFO: renamed from: b */
    public static final /* synthetic */ tr3 f62756b = new tr3(1);

    /* JADX INFO: renamed from: c */
    public static final tr3 f62757c = new tr3(2);

    /* JADX INFO: renamed from: d */
    public static final tr3 f62758d = new tr3(3);

    /* JADX INFO: renamed from: e */
    public static final Object f62759e = new Object();

    /* JADX INFO: renamed from: g */
    public static final tr3 f62761g = new tr3(5);

    /* JADX INFO: renamed from: h */
    public static final /* synthetic */ tr3 f62762h = new tr3(19);

    /* JADX INFO: renamed from: i */
    public static final /* synthetic */ tr3 f62763i = new tr3(20);

    /* JADX INFO: renamed from: j */
    public static final /* synthetic */ tr3 f62764j = new tr3(21);

    /* JADX INFO: renamed from: k */
    public static final /* synthetic */ tr3 f62765k = new tr3(22);

    /* JADX INFO: renamed from: l */
    public static final /* synthetic */ tr3 f62766l = new tr3(23);

    /* JADX INFO: renamed from: H */
    public static final /* synthetic */ tr3 f62751H = new tr3(24);

    /* JADX INFO: renamed from: I */
    public static final /* synthetic */ tr3 f62752I = new tr3(25);

    /* JADX INFO: renamed from: J */
    public static final /* synthetic */ tr3 f62753J = new tr3(26);

    /* JADX INFO: renamed from: K */
    public static final /* synthetic */ tr3 f62754K = new tr3(27);

    /* JADX INFO: renamed from: L */
    public static final /* synthetic */ tr3 f62755L = new tr3(28);

    public /* synthetic */ tr3(int i) {
        this.f62767a = i;
    }

    /* JADX INFO: renamed from: i */
    public static final boolean m22268i(d57 d57Var) {
        d57 d57Var2 = w78.f66487e;
        return !cl9.m4833P(d57Var.m10104b(), ".class", true);
    }

    /* JADX INFO: renamed from: n */
    public static tr3 m22269n() {
        if (f62760f == null) {
            synchronized (f62759e) {
                try {
                    if (f62760f == null) {
                        f62760f = new tr3(4);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return f62760f;
    }

    @Override // p000.InterfaceC3624tu
    /* JADX INFO: renamed from: a */
    public float mo9967a() {
        return 0.0f;
    }

    @Override // p000.jl1
    /* JADX INFO: renamed from: b */
    public long mo10837b(long j, long j2) {
        float fIntBitsToFloat = Float.intBitsToFloat((int) (j2 >> 32)) / Float.intBitsToFloat((int) (j >> 32));
        long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(fIntBitsToFloat)) << 32) | (((long) Float.floatToRawIntBits(fIntBitsToFloat)) & 4294967295L);
        int i = km8.f47515a;
        return jFloatToRawIntBits;
    }

    @Override // p000.jg9
    /* JADX INFO: renamed from: c */
    public StackTraceElement[] mo3847c(StackTraceElement[] stackTraceElementArr) {
        if (stackTraceElementArr.length <= 1024) {
            return stackTraceElementArr;
        }
        StackTraceElement[] stackTraceElementArr2 = new StackTraceElement[1024];
        System.arraycopy(stackTraceElementArr, 0, stackTraceElementArr2, 0, 512);
        System.arraycopy(stackTraceElementArr, stackTraceElementArr.length - 512, stackTraceElementArr2, 512, 512);
        return stackTraceElementArr2;
    }

    @Override // p000.ns2
    /* JADX INFO: renamed from: d */
    public Object mo10838d(String str, Provider provider) {
        return provider == null ? KeyFactory.getInstance(str) : KeyFactory.getInstance(str, provider);
    }

    @Override // p000.b41
    /* JADX INFO: renamed from: e */
    public Instant mo3285e() {
        java.time.Instant instantNow = java.time.Instant.now();
        instantNow.getClass();
        Instant instant = Instant.f47731c;
        return wfb.m23920o(instantNow.getEpochSecond(), instantNow.getNano());
    }

    @Override // p000.yc9
    /* JADX INFO: renamed from: f */
    public boolean mo21078f(Object obj, Object obj2) {
        return fa4.m11650l(obj, obj2);
    }

    @Override // p000.InterfaceC3407of
    /* JADX INFO: renamed from: g */
    public void mo16507g(Bundle bundle) {
        if (Log.isLoggable("FirebaseCrashlytics", 3)) {
            Log.d("FirebaseCrashlytics", "Skipping logging Crashlytics event to Firebase, no Firebase Analytics", null);
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x001b A[DONT_INVERT, PHI: r3
      0x001b: PHI (r3v2 int) = (r3v1 int), (r3v3 int) binds: [B:3:0x0014, B:5:0x0017] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:8:0x001d  */
    @Override // p000.zn2
    /* JADX INFO: renamed from: h */
    public yn2 mo12443h(Context context, String str, xn2 xn2Var) {
        yn2 yn2Var = new yn2();
        yn2Var.f70101a = xn2Var.mo9834e(context, str);
        int i = 1;
        int iMo9833c = xn2Var.mo9833c(context, str, true);
        yn2Var.f70102b = iMo9833c;
        int i2 = yn2Var.f70101a;
        if (i2 == 0) {
            i2 = 0;
            if (iMo9833c == 0) {
                i = 0;
            } else if (i2 >= iMo9833c) {
                i = -1;
            }
        } else if (i2 >= iMo9833c) {
            i = -1;
        }
        yn2Var.f70103c = i;
        return yn2Var;
    }

    @Override // p000.InterfaceC3624tu
    /* JADX INFO: renamed from: j */
    public void mo9968j(fb2 fb2Var, int i, int[] iArr, LayoutDirection layoutDirection, int[] iArr2) {
        if (layoutDirection == LayoutDirection.Ltr) {
            eh0.m11110G(i, iArr, iArr2, false);
        } else {
            eh0.m11110G(i, iArr, iArr2, true);
        }
    }

    @Override // p000.InterfaceC3735wu
    /* JADX INFO: renamed from: k */
    public void mo10843k(fb2 fb2Var, int i, int[] iArr, int[] iArr2) {
        eh0.m11110G(i, iArr, iArr2, false);
    }

    @Override // p000.zc1
    /* JADX INFO: renamed from: l */
    public Object mo3790l(co7 co7Var) {
        switch (this.f62767a) {
            case 2:
                Object objMo4932g = co7Var.mo4932g(new rp7(kfa.class, Executor.class));
                objMo4932g.getClass();
                return bna.m3926O((Executor) objMo4932g);
            default:
                return new u06(0);
        }
    }

    /* JADX INFO: renamed from: m */
    public w41 m22270m() {
        w41 w41Var;
        w41 w41Var2 = w41.f66362i;
        if (w41Var2 != null) {
            return w41Var2;
        }
        synchronized (this) {
            w41Var = w41.f66362i;
            if (w41Var == null) {
                w41 w41VarM23706r = w41.m23706r(sy2.m21766a());
                w41VarM23706r.getClass();
                C3744x2 c3744x2 = new C3744x2(0);
                w41 w41Var3 = new w41();
                w41Var3.f66365a = w41VarM23706r;
                w41Var3.f66366b = c3744x2;
                w41Var3.f66368d = new AtomicBoolean(false);
                w41Var3.f66369e = new Date(0L);
                w41.f66362i = w41Var3;
                w41Var = w41Var3;
            }
        }
        return w41Var;
    }

    public String toString() {
        switch (this.f62767a) {
            case 5:
                return "StructuralEqualityPolicy";
            case 6:
            default:
                return super.toString();
            case 7:
                return "Arrangement#SpaceAround";
        }
    }

    @Override // p000.dqb
    public Object zza() {
        switch (this.f62767a) {
            case 19:
                ((fkb) ekb.f37399b.f37400a.get()).getClass();
                return new Boolean(((Boolean) fkb.f39236a.get()).booleanValue());
            case 20:
                List list = z8c.f71153a;
                wjb.f66949b.get().getClass();
                return Integer.valueOf((int) ((Long) xjb.f68306a.m19918r("measurement.store.max_stored_events_per_app", 20, 100000L).get()).longValue());
            case 21:
                List list2 = z8c.f71153a;
                wjb.f66949b.get().getClass();
                return Integer.valueOf((int) ((Long) xjb.f68306a.m19918r("measurement.sgtm.upload.batches_retrieval_limit", 46, 5L).get()).longValue());
            case 22:
                List list3 = z8c.f71153a;
                wjb.f66949b.get().getClass();
                return (Long) xjb.f68306a.m19918r("measurement.upload.stale_data_deletion_interval", 53, 86400000L).get();
            case DescriptorProtos.FileOptions.DEPRECATED_FIELD_NUMBER /* 23 */:
                List list4 = z8c.f71153a;
                zkb.f71689b.get().getClass();
                return (Boolean) alb.f818a.m19916p("measurement.test.boolean_flag", 0, false).get();
            case 24:
                List list5 = z8c.f71153a;
                wjb.f66949b.get().getClass();
                return (Long) xjb.f68306a.m19918r("measurement.redaction.app_instance_id.ttl", 62, 7200000L).get();
            case 25:
                List list6 = z8c.f71153a;
                wjb.f66949b.get().getClass();
                return Integer.valueOf((int) ((Long) xjb.f68306a.m19918r("measurement.upload.max_batch_size", 75, 65536L).get()).longValue());
            case 26:
                List list7 = z8c.f71153a;
                ((nkb) mkb.f51455b.f51456a.get()).getClass();
                return (Boolean) nkb.f52894a.get();
            case DescriptorProtos.FileOptions.JAVA_STRING_CHECK_UTF8_FIELD_NUMBER /* 27 */:
                List list8 = z8c.f71153a;
                blb.f8664b.get().getClass();
                return (Boolean) clb.f10242a.m19916p("measurement.rb.attribution.service", 6, true).get();
            default:
                ((rkb) qkb.f57881b.f57882a.get()).getClass();
                return new Boolean(((Boolean) rkb.f59451b.get()).booleanValue());
        }
    }
}
