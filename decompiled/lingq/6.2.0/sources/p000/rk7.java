package p000;

import com.kochava.tracker.BuildConfig;
import com.kochava.tracker.payload.internal.PayloadType;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class rk7 {

    /* JADX INFO: renamed from: i */
    public static final sq5 f59437i;

    /* JADX INFO: renamed from: a */
    public final ny8 f59438a;

    /* JADX INFO: renamed from: b */
    public final List f59439b = Collections.synchronizedList(new ArrayList());

    /* JADX INFO: renamed from: c */
    public final ArrayList f59440c = new ArrayList();

    /* JADX INFO: renamed from: d */
    public final ArrayList f59441d = new ArrayList();

    /* JADX INFO: renamed from: e */
    public final ArrayList f59442e = new ArrayList();

    /* JADX INFO: renamed from: f */
    public final ArrayList f59443f = new ArrayList();

    /* JADX INFO: renamed from: g */
    public final ArrayList f59444g = new ArrayList();

    /* JADX INFO: renamed from: h */
    public boolean f59445h = false;

    static {
        sj5 sj5VarM20396w = r46.m20396w();
        f59437i = ux5.m22983f(sj5VarM20396w, sj5VarM20396w, BuildConfig.SDK_MODULE_NAME, "PrivacyProfileManager");
    }

    public rk7(ny8 ny8Var) {
        this.f59438a = ny8Var;
    }

    /* JADX INFO: renamed from: b */
    public static void m20677b(ArrayList arrayList, ArrayList arrayList2) {
        for (Object obj : arrayList2) {
            if (!arrayList.contains(obj)) {
                arrayList.add(obj);
            }
        }
    }

    /* JADX INFO: renamed from: a */
    public final void m20678a() {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        boolean z = false;
        for (pk7 pk7Var : this.f59440c) {
            if (m20679c(pk7Var.f56348a)) {
                m20677b(arrayList, new ArrayList(Arrays.asList(pk7Var.f56351d)));
                ArrayList arrayList3 = new ArrayList();
                for (String str : pk7Var.f56350c) {
                    PayloadType payloadTypeFromKeyNullable = PayloadType.fromKeyNullable(str);
                    if (payloadTypeFromKeyNullable != null) {
                        arrayList3.add(payloadTypeFromKeyNullable);
                    }
                }
                m20677b(arrayList2, arrayList3);
                if (pk7Var.f56349b) {
                    z = true;
                }
            }
        }
        for (pk7 pk7Var2 : this.f59441d) {
            if (m20679c(pk7Var2.f56348a)) {
                m20677b(arrayList, new ArrayList(Arrays.asList(pk7Var2.f56351d)));
                ArrayList arrayList4 = new ArrayList();
                for (String str2 : pk7Var2.f56350c) {
                    PayloadType payloadTypeFromKeyNullable2 = PayloadType.fromKeyNullable(str2);
                    if (payloadTypeFromKeyNullable2 != null) {
                        arrayList4.add(payloadTypeFromKeyNullable2);
                    }
                }
                m20677b(arrayList2, arrayList4);
                if (pk7Var2.f56349b) {
                    z = true;
                }
            }
        }
        Collections.sort(arrayList);
        Collections.sort(arrayList2);
        ArrayList arrayList5 = this.f59443f;
        boolean zEquals = arrayList.equals(arrayList5);
        ArrayList arrayList6 = this.f59444g;
        boolean zEquals2 = arrayList2.equals(arrayList6);
        final boolean z2 = z != this.f59445h;
        if (zEquals && zEquals2 && !z2) {
            return;
        }
        arrayList5.clear();
        m20677b(arrayList5, arrayList);
        arrayList6.clear();
        m20677b(arrayList6, arrayList2);
        this.f59445h = z;
        sq5 sq5Var = f59437i;
        if (!zEquals2) {
            sq5Var.m21555D("Privacy Profile payload deny list has changed to " + arrayList6);
        }
        if (!zEquals) {
            sq5Var.m21555D("Privacy Profile datapoint deny list has changed to " + arrayList5);
        }
        if (z2) {
            sq5Var.m21555D("Privacy Profile sleep has changed to ".concat(this.f59445h ? "Enabled" : "Disabled"));
        }
        final boolean z3 = (zEquals && zEquals2) ? false : true;
        final ArrayList arrayListM3224U = b34.m3224U(this.f59439b);
        if (arrayListM3224U.isEmpty()) {
            return;
        }
        this.f59438a.m17684L(new Runnable() { // from class: qk7
            @Override // java.lang.Runnable
            public final void run() {
                boolean z4 = z3;
                ArrayList arrayList7 = arrayListM3224U;
                if (z4) {
                    Iterator it = arrayList7.iterator();
                    while (it.hasNext()) {
                        ((sk7) it.next()).mo10459a();
                    }
                }
                if (z2) {
                    Iterator it2 = arrayList7.iterator();
                    while (it2.hasNext()) {
                        ((sk7) it2.next()).mo10462d();
                    }
                }
            }
        });
    }

    /* JADX INFO: renamed from: c */
    public final boolean m20679c(String str) {
        if ("_always".equals(str)) {
            return true;
        }
        return this.f59442e.contains(str);
    }

    /* JADX INFO: renamed from: d */
    public final synchronized void m20680d(ArrayList arrayList) {
        this.f59440c.clear();
        this.f59440c.addAll(arrayList);
        m20678a();
    }

    /* JADX INFO: renamed from: e */
    public final synchronized void m20681e(String str, boolean z) {
        try {
            boolean zM20679c = m20679c(str);
            if (z && !zM20679c) {
                f59437i.m21555D("Enabling privacy profile ".concat(str));
                this.f59442e.add(str);
                m20678a();
            } else if (!z && zM20679c) {
                f59437i.m21555D("Disabling privacy profile ".concat(str));
                this.f59442e.remove(str);
                m20678a();
            }
        } catch (Throwable th) {
            throw th;
        }
    }
}
