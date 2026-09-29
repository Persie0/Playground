package p000;

import android.app.Activity;
import android.view.View;
import android.view.ViewTreeObserver;
import com.airbnb.lottie.parser.moshi.AbstractC0875a;
import com.google.android.gms.internal.measurement.zzacr;
import com.google.android.gms.internal.measurement.zzjf;
import com.google.android.gms.internal.measurement.zzjh;
import com.google.android.gms.internal.measurement.zzjo;
import com.google.android.gms.tasks.Task;
import com.lingq.core.data.repository.C1286b;
import java.util.HashMap;
import java.util.Set;
import kotlin.text.Regex;

/* JADX INFO: loaded from: classes2.dex */
public final class wkd implements coa, o9a, xr2, e94, xoc, bm1 {

    /* JADX INFO: renamed from: a */
    public static wkd f66983a;

    /* JADX INFO: renamed from: b */
    public static final wkd f66984b = new wkd();

    /* JADX INFO: renamed from: c */
    public static final fg2 f66985c = new fg2(20);

    /* JADX INFO: renamed from: d */
    public static final /* synthetic */ wkd f66986d = new wkd();

    public wkd(C1286b c1286b) {
        c1286b.getClass();
    }

    /* JADX WARN: Code duplicated, block: B:17:0x0045  */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX INFO: renamed from: a */
    public static final void m24039a(HashMap map, String str, String str2) {
        HashMap map2 = qy5.f58386e;
        switch (str.hashCode()) {
            case 3585:
                if (str.equals("r3")) {
                    str2 = (!cl9.m4842Y(str2, "m", false) && !cl9.m4842Y(str2, "b", false) && !cl9.m4842Y(str2, "ge", false)) ? "f" : "m";
                }
                break;
            case 3586:
                if (str.equals("r4")) {
                    str2 = new Regex("[^a-z]+").m15428g(str2, "");
                }
                break;
            case 3587:
                if (str.equals("r5")) {
                    str2 = new Regex("[^a-z]+").m15428g(str2, "");
                }
                break;
            case 3588:
                if (str.equals("r6") && vk9.m23380c0(str2, "-", false)) {
                    str2 = ((String[]) new Regex("-").m15429h(str2).toArray(new String[0]))[0];
                }
                break;
        }
        map.put(str, str2);
    }

    /* JADX INFO: renamed from: b */
    public static String m24040b(String str, String str2) {
        str.getClass();
        str2.getClass();
        StringBuilder sb = new StringBuilder("https://www.lingq.com/");
        sb.append(str);
        sb.append("/learn/");
        return AbstractC3393o1.m17738m(sb, str2, "/web/settings/points");
    }

    /* JADX INFO: renamed from: c */
    public static void m24041c(Activity activity) {
        View viewM23508s;
        int iHashCode = activity.hashCode();
        HashMap map = null;
        if (!lp1.f49971a.contains(qy5.class)) {
            try {
                map = qy5.f58386e;
            } catch (Throwable th) {
                lp1.m16420a(qy5.class, th);
            }
        }
        Integer numValueOf = Integer.valueOf(iHashCode);
        Object qy5Var = map.get(numValueOf);
        if (qy5Var == null) {
            qy5Var = new qy5(activity);
            map.put(numValueOf, qy5Var);
        }
        qy5 qy5Var2 = (qy5) qy5Var;
        Set set = lp1.f49971a;
        if (set.contains(qy5.class)) {
            return;
        }
        try {
            if (set.contains(qy5Var2)) {
                return;
            }
            try {
                if (!qy5Var2.f58390d.getAndSet(true) && (viewM23508s = AbstractC3695vr.m23508s((Activity) qy5Var2.f58389c.get())) != null) {
                    ViewTreeObserver viewTreeObserver = viewM23508s.getViewTreeObserver();
                    if (viewTreeObserver.isAlive()) {
                        viewTreeObserver.addOnGlobalFocusChangeListener(qy5Var2);
                        return;
                    }
                    return;
                    lp1.m16420a(qy5.class, th);
                }
            } catch (Throwable th2) {
                lp1.m16420a(qy5Var2, th2);
            }
        } catch (Throwable th3) {
            lp1.m16420a(qy5.class, th3);
        }
    }

    /* JADX INFO: renamed from: f */
    public static synchronized void m24042f() {
        if (f66983a == null) {
            f66983a = new wkd();
        }
    }

    @Override // p000.o9a
    public Object apply(Object obj) {
        return (byte[]) obj;
    }

    @Override // p000.xr2
    /* JADX INFO: renamed from: d */
    public void mo10679d(as2 as2Var) {
        StringBuilder sb;
        StringBuilder sb2 = new StringBuilder();
        sb2.append((char) 0);
        while (true) {
            boolean zM3017b = as2Var.m3017b();
            sb = as2Var.f7419c;
            if (!zM3017b) {
                break;
            }
            sb2.append(as2Var.m3016a());
            int i = as2Var.f7420d + 1;
            as2Var.f7420d = i;
            if (zed.m25587f(as2Var.f7417a, i, 5) != 5) {
                as2Var.f7421e = 0;
                break;
            }
        }
        int length = sb2.length() - 1;
        int length2 = sb.length() + length + 1;
        as2Var.m3018c(length2);
        boolean z = as2Var.f7422f.f34352b - length2 > 0;
        if (as2Var.m3017b() || z) {
            if (length <= 249) {
                sb2.setCharAt(0, (char) length);
            } else if (length > 1555) {
                C3386nv.m17633t("Message length not in valid ranges: ".concat(String.valueOf(length)));
                return;
            } else {
                sb2.setCharAt(0, (char) ((length / 250) + 249));
                sb2.insert(1, (char) (length % 250));
            }
        }
        int length3 = sb2.length();
        for (int i2 = 0; i2 < length3; i2++) {
            int length4 = (((sb.length() + 1) * 149) % 255) + 1 + sb2.charAt(i2);
            if (length4 > 255) {
                length4 -= 256;
            }
            as2Var.m3019d((char) length4);
        }
    }

    @Override // p000.bm1
    /* JADX INFO: renamed from: e */
    public Object mo393e(Task task) {
        whb whbVarM22741d;
        zzjh zzjhVar = (zzjh) task.mo5967i();
        c1d c1dVarM12284y = g1d.m12284y();
        String str = zzjhVar.f11886a;
        c1dVarM12284y.m22739b();
        ((g1d) c1dVarM12284y.f63950b).m12297z(str);
        String str2 = zzjhVar.f11888c;
        c1dVarM12284y.m22739b();
        ((g1d) c1dVarM12284y.f63950b).m12286B(str2);
        boolean z = zzjhVar.f11891f;
        c1dVarM12284y.m22739b();
        ((g1d) c1dVarM12284y.f63950b).m12289E(z);
        long j = zzjhVar.f11892g;
        c1dVarM12284y.m22739b();
        ((g1d) c1dVarM12284y.f63950b).m12290F(j);
        byte[] bArr = zzjhVar.f11887b;
        if (bArr != null) {
            zzacr zzacrVarM5430l = zzacr.m5430l(bArr, 0, bArr.length);
            c1dVarM12284y.m22739b();
            ((g1d) c1dVarM12284y.f63950b).m12285A(zzacrVarM5430l);
        }
        for (zzjf zzjfVar : zzjhVar.f11889d) {
            for (zzjo zzjoVar : zzjfVar.f11883b) {
                int i = zzjoVar.f11910g;
                String str3 = zzjoVar.f11904a;
                if (i == 1) {
                    l1d l1dVarM17754y = o1d.m17754y();
                    l1dVarM17754y.m15743g(str3);
                    if (i != 1) {
                        C3386nv.m17626m("Not a long type");
                        return null;
                    }
                    long j2 = zzjoVar.f11905b;
                    l1dVarM17754y.m22739b();
                    ((o1d) l1dVarM17754y.f63950b).m17757B(j2);
                    whbVarM22741d = l1dVarM17754y.m22741d();
                } else if (i == 2) {
                    l1d l1dVarM17754y2 = o1d.m17754y();
                    l1dVarM17754y2.m15743g(str3);
                    if (i != 2) {
                        C3386nv.m17626m("Not a boolean type");
                        return null;
                    }
                    boolean z2 = zzjoVar.f11906c;
                    l1dVarM17754y2.m22739b();
                    ((o1d) l1dVarM17754y2.f63950b).m17758C(z2);
                    whbVarM22741d = l1dVarM17754y2.m22741d();
                } else if (i == 3) {
                    l1d l1dVarM17754y3 = o1d.m17754y();
                    l1dVarM17754y3.m15743g(str3);
                    if (i != 3) {
                        C3386nv.m17626m("Not a double type");
                        return null;
                    }
                    double d = zzjoVar.f11907d;
                    l1dVarM17754y3.m22739b();
                    ((o1d) l1dVarM17754y3.f63950b).m17759D(d);
                    whbVarM22741d = l1dVarM17754y3.m22741d();
                } else if (i == 4) {
                    l1d l1dVarM17754y4 = o1d.m17754y();
                    l1dVarM17754y4.m15743g(str3);
                    if (i != 4) {
                        C3386nv.m17626m("Not a String type");
                        return null;
                    }
                    String str4 = zzjoVar.f11908e;
                    lda.m16130p(str4);
                    l1dVarM17754y4.m22739b();
                    ((o1d) l1dVarM17754y4.f63950b).m17760E(str4);
                    whbVarM22741d = l1dVarM17754y4.m22741d();
                } else {
                    if (i != 5) {
                        C3386nv.m17626m(wq1.m24124t(new StringBuilder(String.valueOf(i).length() + 24), "Unrecognized flag type: ", i));
                        return null;
                    }
                    l1d l1dVarM17754y5 = o1d.m17754y();
                    l1dVarM17754y5.m15743g(str3);
                    if (i != 5) {
                        C3386nv.m17626m("Not a bytes type");
                        return null;
                    }
                    byte[] bArr2 = zzjoVar.f11909f;
                    lda.m16130p(bArr2);
                    zzacr zzacrVarM5430l2 = zzacr.m5430l(bArr2, 0, bArr2.length);
                    l1dVarM17754y5.m22739b();
                    ((o1d) l1dVarM17754y5.f63950b).m17761F(zzacrVarM5430l2);
                    whbVarM22741d = l1dVarM17754y5.m22741d();
                }
                c1dVarM12284y.m22739b();
                ((g1d) c1dVarM12284y.f63950b).m12287C((o1d) whbVarM22741d);
            }
            String[] strArr = zzjfVar.f11884c;
            if (strArr != null) {
                for (String str5 : strArr) {
                    c1dVarM12284y.m22739b();
                    ((g1d) c1dVarM12284y.f63950b).m12288D(str5);
                }
            }
        }
        return (g1d) c1dVarM12284y.m22741d();
    }

    @Override // p000.coa
    /* JADX INFO: renamed from: g */
    public Object mo87g(AbstractC0875a abstractC0875a, float f) {
        return Float.valueOf(og4.m17980d(abstractC0875a) * f);
    }

    public /* synthetic */ wkd() {
    }
}
