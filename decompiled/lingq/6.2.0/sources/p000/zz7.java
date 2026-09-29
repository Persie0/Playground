package p000;

import com.lingq.core.domain.model.theme.LqTheme;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.EmptyList;

/* JADX INFO: loaded from: classes.dex */
public final class zz7 {

    /* JADX INFO: renamed from: a */
    public static final zz7 f72426a = new zz7();

    /* JADX INFO: renamed from: b */
    public static final yz7 f72427b;

    /* JADX INFO: renamed from: c */
    public static final yz7 f72428c;

    /* JADX INFO: renamed from: d */
    public static final yz7 f72429d;

    /* JADX INFO: renamed from: e */
    public static final List f72430e;

    /* JADX INFO: renamed from: f */
    public static final vs3 f72431f;

    static {
        vs3 vs3Var = xs3.f68636a;
        vs3 vs3Var2 = xs3.f68637b;
        vs3 vs3Var3 = xs3.f68640e;
        vs3 vs3Var4 = xs3.f68639d;
        List listM23605K = vz1.m23605K(vs3Var, vs3Var2, vs3Var3, vs3Var4);
        LqTheme lqTheme = LqTheme.System;
        EmptyList emptyList = EmptyList.f47638a;
        yz7 yz7Var = new yz7("default", emptyList, listM23605K, lqTheme, true);
        f72427b = yz7Var;
        List listM23605K2 = vz1.m23605K(vs3Var, vs3Var4);
        LqTheme lqTheme2 = LqTheme.Light;
        yz7 yz7Var2 = new yz7("light", emptyList, listM23605K2, lqTheme2, true);
        f72428c = yz7Var2;
        List listM23605K3 = vz1.m23605K(vs3Var2, vs3Var3);
        LqTheme lqTheme3 = LqTheme.Dark;
        yz7 yz7Var3 = new yz7("dark", emptyList, listM23605K3, lqTheme3, true);
        f72429d = yz7Var3;
        f72430e = vz1.m23605K(yz7Var, yz7Var2, new yz7("yellowLight", vz1.m23605K("#fefaee", "#F4F1E4"), vz1.m23605K(vs3Var, vs3Var4), lqTheme2, false), new yz7("greenLight", vz1.m23605K("#cce6d0", "#B8D2BE"), vz1.m23605K(xs3.f68638c, vs3Var4), lqTheme2, false), yz7Var3, new yz7("blueDark", vz1.m23605K("#2d4481", "#3C5592"), vz1.m23605K(xs3.f68641f, xs3.f68642g), lqTheme3, false));
        f72431f = vs3Var;
    }

    /* JADX INFO: renamed from: a */
    public static yz7 m25898a(String str) {
        Object next;
        str.getClass();
        Iterator it = f72430e.iterator();
        while (it.hasNext()) {
            next = it.next();
            if (((yz7) next).f70705a.equals(str)) {
                return (yz7) next;
            }
        }
        next = null;
        return (yz7) next;
    }

    /* JADX INFO: renamed from: b */
    public static yz7 m25899b() {
        return f72429d;
    }

    /* JADX INFO: renamed from: c */
    public static yz7 m25900c() {
        return f72428c;
    }

    /* JADX INFO: renamed from: d */
    public static yz7 m25901d() {
        return f72427b;
    }
}
