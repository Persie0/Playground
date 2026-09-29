package p003a2;

import ag.C0075b;
import ag.C0076c;
import android.view.View;
import android.widget.TextView;
import androidx.view.C1046m0;
import com.google.android.exoplayer2.mediacodec.InterfaceC2428e;
import com.google.android.exoplayer2.mediacodec.MediaCodecUtil;
import com.google.firebase.concurrent.ExecutorsRegistrar;
import dm.C5207g;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.ServiceConfigurationError;
import p118fe.C5528t;
import p118fe.InterfaceC5514f;
import p261m9.InterfaceC7507h;
import p261m9.InterfaceC7511l;
import p275n9.C7733a;
import p307oo.C8097a;
import p322pd.C8228i;
import p338qd.C8573r0;
import sl.InterfaceC9070c;

/* JADX INFO: renamed from: a2.a */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C0009a implements InterfaceC5514f, InterfaceC7511l, InterfaceC2428e {
    /* JADX INFO: renamed from: d */
    public static int m16d(int i10, int i11, int i12) {
        return (Integer.hashCode(i10) + i11) * i12;
    }

    /* JADX INFO: renamed from: e */
    public static C0076c m17e(C0075b c0075b, C0075b c0075b2, String str, String str2) {
        c0075b.getClass();
        return new C0076c(c0075b2, str, str2);
    }

    /* JADX INFO: renamed from: f */
    public static C1046m0 m18f(InterfaceC9070c interfaceC9070c, String str) {
        C1046m0 c1046m0Mo796n = C8573r0.m16770y(interfaceC9070c).mo796n();
        C5207g.m11110e(c1046m0Mo796n, str);
        return c1046m0Mo796n;
    }

    /* JADX INFO: renamed from: g */
    public static String m19g(int i10, String str, String str2) {
        StringBuilder sb2 = new StringBuilder(i10);
        sb2.append(str);
        String string = sb2.toString();
        C5207g.m11110e(string, str2);
        return string;
    }

    /* JADX INFO: renamed from: h */
    public static String m20h(String str, int i10, String str2, int i11, String str3) {
        return str + i10 + str2 + i11 + str3;
    }

    /* JADX INFO: renamed from: i */
    public static String m21i(String str, String str2, String str3) {
        return str + str2 + str3;
    }

    /* JADX INFO: renamed from: j */
    public static String m22j(StringBuilder sb2, String str, char c10) {
        sb2.append(str);
        sb2.append(c10);
        return sb2.toString();
    }

    /* JADX INFO: renamed from: l */
    public static String m23l(StringBuilder sb2, String str, String str2) {
        sb2.append(str);
        sb2.append(str2);
        return sb2.toString();
    }

    /* JADX INFO: renamed from: m */
    public static String m24m(StringBuilder sb2, List list, String str) {
        sb2.append(list);
        sb2.append(str);
        return sb2.toString();
    }

    /* JADX INFO: renamed from: n */
    public static StringBuilder m25n(String str, int i10, String str2, int i11, String str3) {
        StringBuilder sb2 = new StringBuilder(str);
        sb2.append(i10);
        sb2.append(str2);
        sb2.append(i11);
        sb2.append(str3);
        return sb2;
    }

    /* JADX INFO: renamed from: o */
    public static StringBuilder m26o(String str, String str2) {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(str);
        sb2.append(str2);
        return sb2;
    }

    /* JADX INFO: renamed from: p */
    public static /* synthetic */ Iterator m27p() {
        try {
            return Arrays.asList(new C8097a()).iterator();
        } catch (Throwable th2) {
            throw new ServiceConfigurationError(th2.getMessage(), th2);
        }
    }

    /* JADX INFO: renamed from: q */
    public static Map m28q(HashMap map) {
        return Collections.unmodifiableMap(new HashMap(map));
    }

    /* JADX INFO: renamed from: r */
    public static C8228i m29r(View view, String str, int i10, boolean z10) {
        C5207g.m11111f(view, str);
        return new C8228i(i10, z10);
    }

    /* JADX INFO: renamed from: s */
    public static void m30s(int i10, ArrayList arrayList) {
        arrayList.add(new Integer(i10));
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    /* JADX INFO: renamed from: t */
    public static /* bridge */ /* synthetic */ void m31t(Object obj, int i10, int i11, int i12) {
        throw null;
    }

    /* JADX INFO: renamed from: u */
    public static void m32u(Object[] objArr, int i10, Locale locale, String str, String str2, TextView textView) {
        String str3 = String.format(locale, str, Arrays.copyOf(objArr, i10));
        C5207g.m11110e(str3, str2);
        textView.setText(str3);
    }

    @Override // com.google.android.exoplayer2.mediacodec.InterfaceC2428e
    /* JADX INFO: renamed from: a */
    public List mo33a(String str, boolean z10, boolean z11) {
        return MediaCodecUtil.m7165e(str, z10, z11);
    }

    @Override // p261m9.InterfaceC7511l
    /* JADX INFO: renamed from: b */
    public InterfaceC7507h[] mo34b() {
        return new InterfaceC7507h[]{new C7733a(0)};
    }

    @Override // p118fe.InterfaceC5514f
    /* JADX INFO: renamed from: k */
    public Object mo35k(C5528t c5528t) {
        return ExecutorsRegistrar.f16188b.get();
    }
}
