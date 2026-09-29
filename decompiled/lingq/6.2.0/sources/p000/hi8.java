package p000;

import android.os.Handler;
import android.os.SystemClock;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.datastore.preferences.protobuf.DescriptorProtos;
import coil.compose.C0858a;
import com.google.android.gms.common.internal.RootTelemetryConfiguration;
import com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton;
import com.lingq.core.data.repository.C1286b;
import com.lingq.core.data.repository.C1291g;
import com.lingq.core.data.repository.C1307w;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Objects;
import java.util.WeakHashMap;
import java.util.regex.Pattern;
import kotlin.Result;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.AbstractC3224d;

/* JADX INFO: loaded from: classes2.dex */
public final class hi8 implements i99, lw5, am0, gr6, ks2, jx2, cn9, xo6, g77, js6 {

    /* JADX INFO: renamed from: c */
    public static hi8 f42406c;

    /* JADX INFO: renamed from: d */
    public static final RootTelemetryConfiguration f42407d = new RootTelemetryConfiguration(0, false, false, 0, 0);

    /* JADX INFO: renamed from: e */
    public static final aoc f42408e = new aoc(1);

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f42409a;

    /* JADX INFO: renamed from: b */
    public Object f42410b;

    public hi8(int i) {
        qtc qtcVar;
        this.f42409a = i;
        switch (i) {
            case 10:
                this.f42410b = new LinkedHashMap();
                break;
            case DescriptorProtos.FileOptions.DEPRECATED_FIELD_NUMBER /* 23 */:
                this.f42410b = new k47();
                break;
            default:
                try {
                    qtcVar = (qtc) Class.forName("com.google.protobuf.DescriptorMessageInfoFactory").getDeclaredMethod("getInstance", null).invoke(null, null);
                } catch (Exception unused) {
                    qtcVar = f42408e;
                }
                qtc[] qtcVarArr = {aoc.f7308b, qtcVar};
                ksc kscVar = new ksc();
                kscVar.f48394a = qtcVarArr;
                Charset charset = noc.f53082a;
                this.f42410b = kscVar;
                break;
        }
    }

    /* JADX INFO: renamed from: u */
    public static synchronized hi8 m13280u() {
        try {
            if (f42406c == null) {
                f42406c = new hi8(0, false);
            }
        } catch (Throwable th) {
            throw th;
        }
        return f42406c;
    }

    @Override // p000.cn9
    /* JADX INFO: renamed from: C */
    public void mo4902C(byte[] bArr, int i, int i2, kk1 kk1Var) {
        cs1 cs1VarM4153a;
        k47 k47Var = (k47) this.f42410b;
        k47Var.m14816K(i2 + i, bArr);
        k47Var.m14818M(i);
        ArrayList arrayList = new ArrayList();
        while (k47Var.m14820a() > 0) {
            bna.m3967p("Incomplete Mp4Webvtt Top Level box header found.", k47Var.m14820a() >= 8);
            int iM14829m = k47Var.m14829m();
            if (k47Var.m14829m() == 1987343459) {
                int i3 = iM14829m - 8;
                CharSequence charSequenceM25431f = null;
                bs1 bs1VarM24934a = null;
                while (i3 > 0) {
                    bna.m3967p("Incomplete vtt cue box header found.", i3 >= 8);
                    int iM14829m2 = k47Var.m14829m();
                    int iM14829m3 = k47Var.m14829m();
                    int i4 = iM14829m2 - 8;
                    byte[] bArr2 = k47Var.f46700a;
                    int i5 = k47Var.f46701b;
                    String str = uma.f64080a;
                    String str2 = new String(bArr2, i5, i4, StandardCharsets.UTF_8);
                    k47Var.m14819N(i4);
                    i3 = (i3 - 8) - i4;
                    if (iM14829m3 == 1937011815) {
                        y3b y3bVar = new y3b();
                        z3b.m25430e(str2, y3bVar);
                        bs1VarM24934a = y3bVar.m24934a();
                    } else if (iM14829m3 == 1885436268) {
                        charSequenceM25431f = z3b.m25431f(null, str2.trim(), Collections.EMPTY_LIST);
                    }
                }
                if (charSequenceM25431f == null) {
                    charSequenceM25431f = "";
                }
                if (bs1VarM24934a != null) {
                    bs1VarM24934a.f8913a = charSequenceM25431f;
                    bs1VarM24934a.f8914b = null;
                    cs1VarM4153a = bs1VarM24934a.m4153a();
                } else {
                    Pattern pattern = z3b.f70840a;
                    y3b y3bVar2 = new y3b();
                    y3bVar2.f69251c = charSequenceM25431f;
                    cs1VarM4153a = y3bVar2.m24934a().m4153a();
                }
                arrayList.add(cs1VarM4153a);
            } else {
                k47Var.m14819N(iM14829m - 8);
            }
        }
        kk1Var.accept(new gs1(-9223372036854775807L, -9223372036854775807L, arrayList));
    }

    @Override // p000.jx2
    /* JADX INFO: renamed from: a */
    public int mo12897a() {
        return ((ExtendedFloatingActionButton) this.f42410b).getCollapsedSize();
    }

    @Override // p000.xo6
    /* JADX INFO: renamed from: b */
    public String mo9832b() {
        return "attempted to overwrite the existing value '" + this.f42410b + '\'';
    }

    @Override // p000.lw5
    /* JADX INFO: renamed from: c */
    public void mo3112c(hw5 hw5Var, MenuItem menuItem) {
        ((lo0) this.f42410b).f49901g.removeCallbacksAndMessages(hw5Var);
    }

    @Override // p000.jx2
    /* JADX INFO: renamed from: d */
    public int mo12900d() {
        return ((ExtendedFloatingActionButton) this.f42410b).getCollapsedSize();
    }

    /* JADX INFO: renamed from: e */
    public o40 m13281e() {
        return new o40((Integer) this.f42410b);
    }

    @Override // p000.jx2
    /* JADX INFO: renamed from: f */
    public int mo12902f() {
        return ((ExtendedFloatingActionButton) this.f42410b).getCollapsedPadding();
    }

    @Override // p000.js6
    /* JADX INFO: renamed from: g */
    public /* synthetic */ void mo320g(Object obj) {
        ((vi3) this.f42410b).invoke(obj);
    }

    @Override // p000.i99
    /* JADX INFO: renamed from: h */
    public Object mo11204h(Continuation continuation) {
        return AbstractC3224d.m15541t(new C3513qw(((C0858a) this.f42410b).f10433f, 0), continuation);
    }

    @Override // p000.jx2
    /* JADX INFO: renamed from: j */
    public ViewGroup.LayoutParams mo12903j() {
        ExtendedFloatingActionButton extendedFloatingActionButton = (ExtendedFloatingActionButton) this.f42410b;
        return new ViewGroup.LayoutParams(extendedFloatingActionButton.getCollapsedSize(), extendedFloatingActionButton.getCollapsedSize());
    }

    /* JADX INFO: renamed from: k */
    public sz1 m13282k() {
        sz1 sz1Var = new sz1((LinkedHashMap) this.f42410b);
        jad.m14369d(sz1Var);
        return sz1Var;
    }

    @Override // p000.am0
    /* JADX INFO: renamed from: l */
    public void mo553l(ul0 ul0Var, i88 i88Var) {
        switch (this.f42409a) {
            case 8:
                ((yb1) this.f42410b).complete(i88Var);
                break;
            default:
                ((sm0) this.f42410b).resumeWith(i88Var);
                break;
        }
    }

    @Override // p000.lw5
    /* JADX INFO: renamed from: m */
    public void mo3113m(hw5 hw5Var, mw5 mw5Var) {
        lo0 lo0Var = (lo0) this.f42410b;
        Handler handler = lo0Var.f49901g;
        handler.removeCallbacksAndMessages(null);
        ArrayList arrayList = lo0Var.f49903i;
        int size = arrayList.size();
        int i = 0;
        while (true) {
            if (i >= size) {
                i = -1;
                break;
            } else if (hw5Var == ((ko0) arrayList.get(i)).f47594b) {
                break;
            } else {
                i++;
            }
        }
        if (i == -1) {
            return;
        }
        int i2 = i + 1;
        handler.postAtTime(new jo0(this, i2 < arrayList.size() ? (ko0) arrayList.get(i2) : null, mw5Var, hw5Var, 0), hw5Var, SystemClock.uptimeMillis() + 200);
    }

    @Override // p000.g77
    /* JADX INFO: renamed from: n */
    public j77 mo12408n() {
        return (j77) this.f42410b;
    }

    @Override // p000.g77
    /* JADX INFO: renamed from: o */
    public void mo12409o() {
    }

    @Override // p000.am0
    /* JADX INFO: renamed from: p */
    public void mo554p(ul0 ul0Var, Throwable th) {
        switch (this.f42409a) {
            case 8:
                ((yb1) this.f42410b).completeExceptionally(th);
                break;
            default:
                ((sm0) this.f42410b).resumeWith(new Result.Failure(th));
                break;
        }
    }

    @Override // p000.jx2
    /* JADX INFO: renamed from: q */
    public int mo12909q() {
        return ((ExtendedFloatingActionButton) this.f42410b).getCollapsedPadding();
    }

    @Override // p000.ks2
    /* JADX INFO: renamed from: r */
    public Object mo13283r(String str) {
        return ((ns2) this.f42410b).mo10838d(str, null);
    }

    @Override // p000.gr6
    /* JADX INFO: renamed from: s */
    public f6b mo1889s(View view, f6b f6bVar) {
        c6b c6bVar = f6bVar.f38536a;
        CoordinatorLayout coordinatorLayout = (CoordinatorLayout) this.f42410b;
        if (!Objects.equals(coordinatorLayout.f5470I, f6bVar)) {
            coordinatorLayout.f5470I = f6bVar;
            boolean z = f6bVar.m11574d() > 0;
            coordinatorLayout.f5471J = z;
            coordinatorLayout.setWillNotDraw(!z && coordinatorLayout.getBackground() == null);
            if (!c6bVar.mo4372s()) {
                int childCount = coordinatorLayout.getChildCount();
                for (int i = 0; i < childCount; i++) {
                    View childAt = coordinatorLayout.getChildAt(i);
                    WeakHashMap weakHashMap = dta.f36217a;
                    if (childAt.getFitsSystemWindows() && ((lm1) childAt.getLayoutParams()).f49814a != null && c6bVar.mo4372s()) {
                        break;
                    }
                }
            }
            coordinatorLayout.requestLayout();
        }
        return f6bVar;
    }

    /* JADX INFO: renamed from: t */
    public RootTelemetryConfiguration m13284t() {
        return (RootTelemetryConfiguration) this.f42410b;
    }

    /* JADX INFO: renamed from: v */
    public c83 m13285v(String str) {
        str.getClass();
        return AbstractC3224d.m15536o(new bx0(((C1307w) this.f42410b).m7396k(str), 4));
    }

    /* JADX INFO: renamed from: w */
    public Object m13286w(String str, SuspendLambda suspendLambda) {
        Object objM7191d = ((C1291g) ((mu1) this.f42410b)).m7191d(str, suspendLambda);
        return objM7191d == CoroutineSingletons.COROUTINE_SUSPENDED ? objM7191d : xfa.f68157a;
    }

    /* JADX INFO: renamed from: x */
    public void m13287x(Object obj, String str) {
        Object[] objArr;
        str.getClass();
        LinkedHashMap linkedHashMap = (LinkedHashMap) this.f42410b;
        if (obj == null) {
            obj = null;
        } else {
            z21 z21VarM24933a = y38.m24933a(obj.getClass());
            if (!z21VarM24933a.equals(y38.m24933a(Boolean.TYPE)) && !z21VarM24933a.equals(y38.m24933a(Byte.TYPE)) && !z21VarM24933a.equals(y38.m24933a(Integer.TYPE)) && !z21VarM24933a.equals(y38.m24933a(Long.TYPE)) && !z21VarM24933a.equals(y38.m24933a(Float.TYPE)) && !z21VarM24933a.equals(y38.m24933a(Double.TYPE)) && !z21VarM24933a.equals(y38.m24933a(String.class)) && !z21VarM24933a.equals(y38.m24933a(Boolean[].class)) && !z21VarM24933a.equals(y38.m24933a(Byte[].class)) && !z21VarM24933a.equals(y38.m24933a(Integer[].class)) && !z21VarM24933a.equals(y38.m24933a(Long[].class)) && !z21VarM24933a.equals(y38.m24933a(Float[].class)) && !z21VarM24933a.equals(y38.m24933a(Double[].class)) && !z21VarM24933a.equals(y38.m24933a(String[].class))) {
                int i = 0;
                if (z21VarM24933a.equals(y38.m24933a(boolean[].class))) {
                    boolean[] zArr = (boolean[]) obj;
                    String str2 = r02.f58436a;
                    int length = zArr.length;
                    objArr = new Boolean[length];
                    while (i < length) {
                        objArr[i] = Boolean.valueOf(zArr[i]);
                        i++;
                    }
                } else if (z21VarM24933a.equals(y38.m24933a(byte[].class))) {
                    byte[] bArr = (byte[]) obj;
                    String str3 = r02.f58436a;
                    int length2 = bArr.length;
                    objArr = new Byte[length2];
                    while (i < length2) {
                        objArr[i] = Byte.valueOf(bArr[i]);
                        i++;
                    }
                } else if (z21VarM24933a.equals(y38.m24933a(int[].class))) {
                    int[] iArr = (int[]) obj;
                    String str4 = r02.f58436a;
                    int length3 = iArr.length;
                    objArr = new Integer[length3];
                    while (i < length3) {
                        objArr[i] = Integer.valueOf(iArr[i]);
                        i++;
                    }
                } else if (z21VarM24933a.equals(y38.m24933a(long[].class))) {
                    long[] jArr = (long[]) obj;
                    String str5 = r02.f58436a;
                    int length4 = jArr.length;
                    objArr = new Long[length4];
                    while (i < length4) {
                        objArr[i] = Long.valueOf(jArr[i]);
                        i++;
                    }
                } else if (z21VarM24933a.equals(y38.m24933a(float[].class))) {
                    float[] fArr = (float[]) obj;
                    String str6 = r02.f58436a;
                    int length5 = fArr.length;
                    objArr = new Float[length5];
                    while (i < length5) {
                        objArr[i] = Float.valueOf(fArr[i]);
                        i++;
                    }
                } else {
                    if (!z21VarM24933a.equals(y38.m24933a(double[].class))) {
                        uk9.m22776j("Key ", str, " has invalid type ", z21VarM24933a);
                        return;
                    }
                    double[] dArr = (double[]) obj;
                    String str7 = r02.f58436a;
                    int length6 = dArr.length;
                    objArr = new Double[length6];
                    while (i < length6) {
                        objArr[i] = Double.valueOf(dArr[i]);
                        i++;
                    }
                }
                obj = objArr;
            }
        }
        linkedHashMap.put(str, obj);
    }

    /* JADX INFO: renamed from: y */
    public void m13288y(HashMap map) {
        map.getClass();
        for (Map.Entry entry : map.entrySet()) {
            m13287x(entry.getValue(), (String) entry.getKey());
        }
    }

    /* JADX INFO: renamed from: z */
    public void m13289z(Integer num) {
        this.f42410b = num;
    }

    public /* synthetic */ hi8(Object obj, int i) {
        this.f42409a = i;
        this.f42410b = obj;
    }

    public /* synthetic */ hi8(int i, boolean z) {
        this.f42409a = i;
    }

    public hi8(xo1 xo1Var) {
        this.f42409a = 16;
        xo1Var.getClass();
        this.f42410b = xo1Var;
    }

    public hi8(mu1 mu1Var) {
        this.f42409a = 17;
        mu1Var.getClass();
        this.f42410b = mu1Var;
    }

    public hi8(C1286b c1286b) {
        this.f42409a = 7;
        c1286b.getClass();
        this.f42410b = c1286b;
    }

    public hi8(oo4 oo4Var) {
        this.f42409a = 18;
        oo4Var.getClass();
        this.f42410b = oo4Var;
    }

    public hi8(km7 km7Var) {
        this.f42409a = 11;
        km7Var.getClass();
        this.f42410b = km7Var;
    }

    public hi8(C1307w c1307w) {
        this.f42409a = 19;
        c1307w.getClass();
        this.f42410b = c1307w;
    }

    public hi8(lx4 lx4Var) {
        this.f42409a = 27;
        lx4Var.getClass();
        this.f42410b = lx4Var;
    }

    public hi8(j77 j77Var) {
        this.f42409a = 25;
        j77Var.getClass();
        this.f42410b = j77Var;
    }
}
