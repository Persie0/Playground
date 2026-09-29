package android.support.v4.media;

import android.database.sqlite.SQLiteStatement;
import android.media.UnsupportedSchemeException;
import android.os.CancellationSignal;
import androidx.compose.runtime.C0480e;
import com.clevertap.android.sdk.C2181a;
import com.google.android.exoplayer2.drm.C2400d;
import com.google.android.exoplayer2.drm.C2403g;
import com.google.android.exoplayer2.drm.InterfaceC2402f;
import com.google.android.exoplayer2.drm.UnsupportedDrmException;
import com.squareup.moshi.AbstractC4949k;
import com.tonyodev.fetch2.Error;
import dm.C5207g;
import java.io.IOException;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Locale;
import java.util.ServiceConfigurationError;
import java.util.UUID;
import mk.C7633z0;
import p081e0.InterfaceC5299c;
import p081e0.InterfaceC5336s0;
import p122fl.InterfaceC5585h;
import p213k4.C6595o;
import p256m4.C7478a;
import p261m9.InterfaceC7507h;
import p261m9.InterfaceC7511l;
import p307oo.C8098b;
import p346ql.C8643b;
import p371rl.InterfaceC8825a;
import p411u9.C9488k;
import p479xa.C10145n;
import p482xd.InterfaceC10171c;
import tk.AbstractC9310n;

/* JADX INFO: renamed from: android.support.v4.media.b */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C0141b implements InterfaceC2402f.c, InterfaceC5585h, InterfaceC7511l, InterfaceC10171c {
    /* JADX INFO: renamed from: e */
    public static int m609e(double d10, int i10, int i11) {
        return (Double.hashCode(d10) + i10) * i11;
    }

    /* JADX INFO: renamed from: f */
    public static CancellationSignal m610f(C6595o c6595o, int i10, long j10) {
        c6595o.mo13194W(i10, j10);
        return new CancellationSignal();
    }

    /* JADX INFO: renamed from: g */
    public static String m611g(String str, String str2, String str3) {
        return str + str2 + str3;
    }

    /* JADX INFO: renamed from: h */
    public static String m612h(StringBuilder sb2, float f3, char c10) {
        sb2.append(f3);
        sb2.append(c10);
        return sb2.toString();
    }

    /* JADX INFO: renamed from: i */
    public static String m613i(Object[] objArr, int i10, Locale locale, String str, String str2) {
        String str3 = String.format(locale, str, Arrays.copyOf(objArr, i10));
        C5207g.m11110e(str3, str2);
        return str3;
    }

    /* JADX INFO: renamed from: j */
    public static StringBuilder m614j(String str, int i10, String str2) {
        StringBuilder sb2 = new StringBuilder(str);
        sb2.append(i10);
        sb2.append(str2);
        return sb2;
    }

    /* JADX INFO: renamed from: k */
    public static HashSet m615k(HashMap map, String str, C7478a.a aVar, int i10) {
        map.put(str, aVar);
        return new HashSet(i10);
    }

    /* JADX INFO: renamed from: l */
    public static /* synthetic */ Iterator m616l() {
        try {
            return Arrays.asList(new C8098b()).iterator();
        } catch (Throwable th2) {
            throw new ServiceConfigurationError(th2.getMessage(), th2);
        }
    }

    /* JADX INFO: renamed from: m */
    public static InterfaceC8825a m617m(C7633z0 c7633z0, int i10) {
        return C8643b.m16862a(new C7633z0.a(c7633z0, i10));
    }

    /* JADX INFO: renamed from: n */
    public static void m618n(int i10, HashMap map, String str, int i11, String str2, int i12, String str3, int i13, String str4) {
        map.put(str, Integer.valueOf(i10));
        map.put(str2, Integer.valueOf(i11));
        map.put(str3, Integer.valueOf(i12));
        map.put(str4, Integer.valueOf(i13));
    }

    /* JADX INFO: renamed from: o */
    public static void m619o(InterfaceC5299c interfaceC5299c, String str, C0480e c0480e, String str2, InterfaceC5336s0 interfaceC5336s0, String str3) {
        C5207g.m11111f(interfaceC5299c, str);
        C5207g.m11111f(c0480e, str2);
        C5207g.m11111f(interfaceC5336s0, str3);
    }

    /* JADX INFO: renamed from: p */
    public static void m620p(String str, int i10, String str2) {
        C10145n.m19099g(str2, str + i10);
    }

    /* JADX INFO: renamed from: q */
    public static void m621q(String str, String str2, SQLiteStatement sQLiteStatement) {
        C2181a.m6455h(str + str2);
        sQLiteStatement.execute();
    }

    /* JADX INFO: renamed from: r */
    public static void m622r(String str, String str2, String str3) {
        C10145n.m19099g(str3, str + str2);
    }

    /* JADX INFO: renamed from: s */
    public static void m623s(boolean z10, AbstractC4949k abstractC4949k, AbstractC9310n abstractC9310n, String str) throws IOException {
        abstractC4949k.mo9386f(abstractC9310n, Boolean.valueOf(z10));
        abstractC9310n.mo10551C(str);
    }

    @Override // com.google.android.exoplayer2.drm.InterfaceC2402f.c
    /* JADX INFO: renamed from: a */
    public InterfaceC2402f mo624a(UUID uuid) {
        try {
            try {
                return new C2403g(uuid);
            } catch (UnsupportedDrmException unused) {
                C10145n.m19095c("FrameworkMediaDrm", "Failed to instantiate a FrameworkMediaDrm for uuid: " + uuid + ".");
                return new C2400d();
            }
        } catch (UnsupportedSchemeException e10) {
            throw new UnsupportedDrmException(e10);
        } catch (Exception e11) {
            throw new UnsupportedDrmException(e11);
        }
    }

    @Override // p482xd.InterfaceC10171c
    public Object apply(Object obj) {
        return (C9488k) obj;
    }

    @Override // p261m9.InterfaceC7511l
    /* JADX INFO: renamed from: b */
    public InterfaceC7507h[] mo34b() {
        return new InterfaceC7507h[0];
    }

    @Override // p122fl.InterfaceC5585h
    /* JADX INFO: renamed from: d */
    public void mo520d(Object obj) {
        C5207g.m11111f((Error) obj, "error");
    }
}
