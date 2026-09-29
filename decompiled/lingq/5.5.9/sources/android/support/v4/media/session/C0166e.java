package android.support.v4.media.session;

import android.os.Bundle;
import androidx.compose.runtime.ParcelableSnapshotMutableState;
import androidx.fragment.app.Fragment;
import com.google.android.gms.internal.measurement.C2601b4;
import com.google.android.gms.internal.measurement.zzbl;
import com.squareup.moshi.AbstractC4949k;
import dm.C5207g;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import kn.C6732b;
import mk.C7633z0;
import p081e0.C5310f1;
import p174i9.C6236z;
import p174i9.InterfaceC6208b;
import p256m4.C7478a;
import p261m9.InterfaceC7507h;
import p261m9.InterfaceC7511l;
import p335q9.C8505a;
import p338qd.C8573r0;
import p346ql.C8642a;
import p371rl.InterfaceC8825a;
import p387t0.C9169u;
import p479xa.C10144m;
import p479xa.InterfaceC10133c;
import p482xd.InterfaceC10171c;
import tk.AbstractC9310n;

/* JADX INFO: renamed from: android.support.v4.media.session.e */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C0166e implements InterfaceC10171c, C10144m.a, InterfaceC7511l {
    public /* synthetic */ C0166e() {
    }

    public /* synthetic */ C0166e(int i10, long j10, InterfaceC6208b.a aVar) {
    }

    /* JADX INFO: renamed from: a */
    public static int m757a(int i10, int i11, int i12, int i13) {
        return ((i10 * i11) / i12) + i13;
    }

    /* JADX INFO: renamed from: d */
    public static int m758d(String str, int i10, int i11) {
        return (str.hashCode() + i10) * i11;
    }

    /* JADX INFO: renamed from: e */
    public static ParcelableSnapshotMutableState m759e(long j10, C5310f1 c5310f1) {
        return C8573r0.m16682K0(new C9169u(j10), c5310f1);
    }

    /* JADX INFO: renamed from: f */
    public static Object m760f(zzbl zzblVar, int i10, ArrayList arrayList, int i11) {
        C2601b4.m7692h(i10, zzblVar.name(), arrayList);
        return arrayList.get(i11);
    }

    /* JADX INFO: renamed from: g */
    public static String m761g(String str, int i10) {
        return str + i10;
    }

    /* JADX INFO: renamed from: h */
    public static String m762h(String str, int i10, String str2) {
        return str + i10 + str2;
    }

    /* JADX INFO: renamed from: i */
    public static String m763i(String str, long j10) {
        return str + j10;
    }

    /* JADX INFO: renamed from: j */
    public static String m764j(String str, Fragment fragment, String str2) {
        return str + fragment + str2;
    }

    /* JADX INFO: renamed from: k */
    public static String m765k(String str, String str2) {
        return str + str2;
    }

    /* JADX INFO: renamed from: l */
    public static String m766l(String str, String str2, String str3, String str4, String str5) {
        return str + str2 + str3 + str4 + str5;
    }

    /* JADX INFO: renamed from: m */
    public static String m767m(String str, C7478a c7478a, String str2, C7478a c7478a2) {
        return str + c7478a + str2 + c7478a2;
    }

    /* JADX INFO: renamed from: o */
    public static String m768o(StringBuilder sb2, int i10, String str) {
        sb2.append(i10);
        sb2.append(str);
        return sb2.toString();
    }

    /* JADX INFO: renamed from: p */
    public static String m769p(StringBuilder sb2, boolean z10, String str) {
        sb2.append(z10);
        sb2.append(str);
        return sb2.toString();
    }

    /* JADX INFO: renamed from: q */
    public static String m770q(Object[] objArr, int i10, String str, String str2) {
        String str3 = String.format(str, Arrays.copyOf(objArr, i10));
        C5207g.m11110e(str3, str2);
        return str3;
    }

    /* JADX INFO: renamed from: r */
    public static StringBuilder m771r(String str) {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(str);
        return sb2;
    }

    /* JADX INFO: renamed from: s */
    public static InterfaceC8825a m772s(C7633z0 c7633z0, int i10) {
        return C8642a.m16861a(new C7633z0.a(c7633z0, i10));
    }

    /* JADX INFO: renamed from: t */
    public static /* synthetic */ void m773t() {
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    /* JADX INFO: renamed from: u */
    public static /* bridge */ /* synthetic */ void m774u(int i10, int i11, Class cls) {
        throw null;
    }

    /* JADX INFO: renamed from: v */
    public static void m775v(int i10, AbstractC4949k abstractC4949k, AbstractC9310n abstractC9310n, String str) throws IOException {
        abstractC4949k.mo9386f(abstractC9310n, Integer.valueOf(i10));
        abstractC9310n.mo10551C(str);
    }

    /* JADX INFO: renamed from: w */
    public static /* synthetic */ void m776w(Object obj) {
        if (obj != null) {
            throw new ClassCastException();
        }
    }

    /* JADX INFO: renamed from: x */
    public static void m777x(StringBuilder sb2, String str, String str2, String str3, String str4) {
        sb2.append(str);
        sb2.append(str2);
        sb2.append(str3);
        sb2.append(str4);
    }

    /* JADX INFO: renamed from: y */
    public static boolean m778y(Bundle bundle, String str, Class cls, String str2) {
        C5207g.m11111f(bundle, str);
        bundle.setClassLoader(cls.getClassLoader());
        return bundle.containsKey(str2);
    }

    /* JADX INFO: renamed from: z */
    public static boolean m779z(C6732b.a aVar, int i10, String str) {
        Boolean boolM13346c = aVar.m13346c(i10);
        C5207g.m11110e(boolM13346c, str);
        return boolM13346c.booleanValue();
    }

    @Override // p482xd.InterfaceC10171c
    public Object apply(Object obj) {
        return new C6236z((InterfaceC10133c) obj);
    }

    @Override // p261m9.InterfaceC7511l
    /* JADX INFO: renamed from: b */
    public InterfaceC7507h[] mo34b() {
        return new InterfaceC7507h[]{new C8505a()};
    }

    @Override // p479xa.C10144m.a
    /* JADX INFO: renamed from: n */
    public void mo780n(Object obj) {
        ((InterfaceC6208b) obj).getClass();
    }
}
