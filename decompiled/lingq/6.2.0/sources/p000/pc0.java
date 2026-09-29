package p000;

import androidx.compose.p002ui.input.pointer.C0327a;
import androidx.compose.p002ui.node.C0357g;
import androidx.compose.p002ui.platform.ViewTreeObserverOnGlobalLayoutListenerC0391c;
import com.google.common.collect.C1097m;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableSet;
import com.lingq.core.analytics.C1240a;
import java.io.IOException;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import kotlin.collections.EmptyList;

/* JADX INFO: loaded from: classes.dex */
public final class pc0 {

    /* JADX INFO: renamed from: a */
    public boolean f55937a = false;

    /* JADX INFO: renamed from: b */
    public Object f55938b;

    /* JADX INFO: renamed from: c */
    public Object f55939c;

    /* JADX INFO: renamed from: d */
    public Object f55940d;

    /* JADX INFO: renamed from: e */
    public Object f55941e;

    public pc0(z3d z3dVar, xp7 xp7Var) {
        ImmutableMap immutableMapM6339a;
        d3d d3dVar = z3dVar.f70850a;
        l2d l2dVar = z3dVar.f70851b;
        if (d3dVar.m10079e().isEmpty()) {
            l2d.m15751z().equals(l2dVar);
        }
        this.f55938b = l2dVar.m15752s();
        this.f55939c = l2dVar.m15753t();
        l2dVar.getClass();
        l2dVar.getClass();
        Map mapM15757x = l2dVar.m15756w() == 0 ? null : l2dVar.m15757x();
        if (mapM15757x != null) {
            ImmutableSet.m6308n(mapM15757x.keySet());
        } else {
            ImmutableSet.m6310s();
        }
        int iM15756w = l2dVar.m15756w();
        d3d d3dVarM10075a = z3dVar.f70850a;
        if (iM15756w > 0) {
            Collection<o1d> collectionValues = l2dVar.m15757x().values();
            if (collectionValues == null) {
                immutableMapM6339a = ImmutableMap.m6298f();
            } else {
                C1097m c1097mM6295a = ImmutableMap.m6295a();
                for (o1d o1dVar : collectionValues) {
                    int iM17762G = o1dVar.m17762G();
                    int i = iM17762G - 1;
                    if (iM17762G == 0) {
                        throw null;
                    }
                    if (i == 0) {
                        c1097mM6295a.m6340b(o1dVar.m17763s(), Long.valueOf(o1dVar.m17764t()));
                    } else if (i == 1) {
                        c1097mM6295a.m6340b(o1dVar.m17763s(), Boolean.valueOf(o1dVar.m17765u()));
                    } else if (i == 2) {
                        c1097mM6295a.m6340b(o1dVar.m17763s(), Double.valueOf(o1dVar.m17766v()));
                    } else if (i == 3) {
                        c1097mM6295a.m6340b(o1dVar.m17763s(), o1dVar.m17767w());
                    } else {
                        if (i != 4) {
                            C3386nv.m17633t("Could not serialize Flag for override: ".concat(String.valueOf(o1dVar.m17763s())));
                            throw null;
                        }
                        c1097mM6295a.m6340b(o1dVar.m17763s(), o1dVar.m17768x().m5434n());
                    }
                }
                immutableMapM6339a = c1097mM6295a.m6339a(false);
            }
            d3dVarM10075a = d3d.m10075a(d3dVarM10075a, immutableMapM6339a);
        }
        C1097m c1097mM6296b = ImmutableMap.m6296b(d3dVarM10075a.m10080f() + 3);
        d3dVarM10075a.m10078c(c1097mM6296b);
        c1097mM6296b.m6340b("__phenotype_server_token", l2dVar.m15754u());
        c1097mM6296b.m6340b("__phenotype_snapshot_token", l2dVar.m15752s());
        c1097mM6296b.m6340b("__phenotype_configuration_version", Long.valueOf(l2dVar.m15755v()));
        this.f55940d = c1097mM6296b.m6339a(false);
        this.f55941e = xp7Var;
    }

    /* JADX INFO: renamed from: a */
    public void m19060a() {
        synchronized (((fl0) this.f55941e)) {
            if (this.f55937a) {
                return;
            }
            this.f55937a = true;
            icb.m13766b((t89) this.f55939c);
            try {
                ((C3552rx) this.f55938b).m20967a();
            } catch (IOException unused) {
            }
        }
    }

    /* JADX INFO: renamed from: b */
    public void m19061b(qc0 qc0Var, List list) {
        hm5 hm5Var = (hm5) this.f55940d;
        cc4 cc4Var = (cc4) this.f55939c;
        qc0Var.getClass();
        int i = qc0Var.f57553a;
        if (i == 0) {
            if (list != null) {
                cc4Var.m4520v(list);
            }
        } else if (i == 1) {
            ((C1240a) hm5Var).m7025f("Upgrade aborted", null);
        } else {
            if (i != 7) {
                ((C1240a) hm5Var).m7025f("Upgrade error occurred", null);
                return;
            }
            if (list == null) {
                list = EmptyList.f47638a;
            }
            cc4Var.m4521w(list);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: c */
    public int m19062c(fs6 fs6Var, ViewTreeObserverOnGlobalLayoutListenerC0391c viewTreeObserverOnGlobalLayoutListenerC0391c, boolean z) {
        int i;
        Object[] objArr;
        int i2;
        int i3;
        C0327a c0327a = (C0327a) this.f55939c;
        cu3 cu3Var = (cu3) this.f55941e;
        if (this.f55937a) {
            return 0;
        }
        try {
            this.f55937a = true;
            x44 x44VarM18299L = ((or3) this.f55940d).m18299L(fs6Var, viewTreeObserverOnGlobalLayoutListenerC0391c);
            tk5 tk5Var = (tk5) x44VarM18299L.f67752c;
            int iM22182h = tk5Var.m22182h();
            while (true) {
                if (i >= iM22182h) {
                    objArr = true;
                    break;
                }
                kg7 kg7Var = (kg7) tk5Var.m22183i(i);
                i = (kg7Var.f47238d || kg7Var.f47242h) ? 0 : i + 1;
                objArr = false;
                break;
            }
            int iM22182h2 = tk5Var.m22182h();
            for (int i4 = 0; i4 < iM22182h2; i4++) {
                kg7 kg7Var2 = (kg7) tk5Var.m22183i(i4);
                if (objArr != false || ci8.m4723h(kg7Var2)) {
                    ((C0357g) this.f55938b).m1560C(kg7Var2.f47237c, (cu3) this.f55941e, kg7Var2.f47243i, true);
                    if (!cu3Var.f34537a.m719d()) {
                        c0327a.m1453a(kg7Var2.f47235a, cu3Var, ci8.m4723h(kg7Var2));
                        cu3Var.clear();
                    }
                }
            }
            boolean zM1454b = c0327a.m1454b(x44VarM18299L, z);
            if (x44VarM18299L.f67751b) {
                i2 = 0;
                break;
            }
            int iM22182h3 = tk5Var.m22182h();
            int i5 = 0;
            while (true) {
                if (i5 >= iM22182h3) {
                    i2 = 0;
                    break;
                }
                kg7 kg7Var3 = (kg7) tk5Var.m22183i(i5);
                if (!gq6.m12821b(ci8.m4702O(kg7Var3, true), 0L) && kg7Var3.m15191c()) {
                    i2 = 1;
                    break;
                }
                i5++;
            }
            int iM22182h4 = tk5Var.m22182h();
            for (int i6 = 0; i6 < iM22182h4; i6++) {
                if (((kg7) tk5Var.m22183i(i6)).m15191c()) {
                    i3 = 1;
                    return (zM1454b ? 1 : 0) | (i2 << 1) | (i3 << 2);
                }
            }
            i3 = 0;
            return (zM1454b ? 1 : 0) | (i2 << 1) | (i3 << 2);
        } finally {
            this.f55937a = false;
        }
    }

    public pc0(udd uddVar, xp7 xp7Var) {
        udd.m22703z().equals(uddVar);
        this.f55938b = uddVar.m22709s();
        this.f55939c = uddVar.m22710t();
        ImmutableSet.m6310s();
        C1097m c1097mM6296b = ImmutableMap.m6296b(uddVar.m22714x() + 3);
        for (aed aedVar : uddVar.m22713w()) {
            int iM328F = aedVar.m328F();
            int i = iM328F - 1;
            if (iM328F == 0) {
                throw null;
            }
            if (i == 0) {
                c1097mM6296b.m6340b(aedVar.m330s(), Long.valueOf(aedVar.m331t()));
            } else if (i == 1) {
                c1097mM6296b.m6340b(aedVar.m330s(), Boolean.valueOf(aedVar.m332u()));
            } else if (i == 2) {
                c1097mM6296b.m6340b(aedVar.m330s(), Double.valueOf(aedVar.m333v()));
            } else if (i == 3) {
                c1097mM6296b.m6340b(aedVar.m330s(), aedVar.m334w());
            } else if (i == 4) {
                c1097mM6296b.m6340b(aedVar.m330s(), aedVar.m335x().m5434n());
            }
        }
        c1097mM6296b.m6340b("__phenotype_server_token", uddVar.m22711u());
        c1097mM6296b.m6340b("__phenotype_snapshot_token", uddVar.m22709s());
        c1097mM6296b.m6340b("__phenotype_configuration_version", Long.valueOf(uddVar.m22712v()));
        this.f55940d = c1097mM6296b.m6339a(false);
        this.f55941e = xp7Var;
    }
}
