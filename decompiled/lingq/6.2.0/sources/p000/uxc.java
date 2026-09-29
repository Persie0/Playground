package p000;

import android.content.Context;
import android.content.pm.PackageManager;
import com.google.android.gms.internal.measurement.C0962f;
import com.google.common.base.AbstractC1083c;
import com.google.common.base.Optional;
import java.util.ArrayList;
import java.util.Collections;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class uxc implements on9 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f64495a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Context f64496b;

    public /* synthetic */ uxc(Context context, int i) {
        this.f64495a = i;
        this.f64496b = context;
    }

    @Override // p000.on9
    public final Object get() {
        int i = this.f64495a;
        Context context = this.f64496b;
        switch (i) {
            case 0:
                Object obj = C0962f.f11840j;
                final co7 co7Var = new co7(7);
                co7Var.f10359b = context;
                context.getClass();
                if (((on9) co7Var.f10360c) == null) {
                    co7Var.f10360c = C0962f.f11843m;
                }
                final int i2 = 1;
                if (((on9) co7Var.f10361d) == null) {
                    co7Var.f10361d = AbstractC1083c.m6269a(new uxc((Context) co7Var.f10359b, i2));
                }
                if (((fxc) co7Var.f10362e) == null) {
                    co7Var.f10362e = new on9() { // from class: fxc
                        @Override // p000.on9
                        public final /* synthetic */ Object get() {
                            int i3 = i2;
                            co7 co7Var2 = co7Var;
                            switch (i3) {
                                case 0:
                                    Context context2 = (Context) co7Var2.f10359b;
                                    Object obj2 = C0962f.f11840j;
                                    try {
                                        return Optional.m6263d(context2.getPackageManager().getApplicationInfo("com.google.android.gms", 0));
                                    } catch (PackageManager.NameNotFoundException unused) {
                                        return Optional.m6262a();
                                    }
                                default:
                                    return Optional.m6263d(new pcd((on9) co7Var2.f10360c));
                            }
                        }
                    };
                }
                final int i3 = 0;
                if (((on9) co7Var.f10363f) == null) {
                    Context context2 = (Context) co7Var.f10359b;
                    ArrayList arrayList = new ArrayList();
                    jgd jgdVar = new jgd(new C3002fi(context2, 8));
                    new ConcurrentHashMap();
                    Collections.addAll(arrayList, jgdVar, new wgd());
                    co7Var.f10363f = AbstractC1083c.m6269a(new yxc(arrayList, i3));
                }
                if (((fxc) co7Var.f10364g) == null) {
                    co7Var.f10364g = new on9() { // from class: fxc
                        @Override // p000.on9
                        public final /* synthetic */ Object get() {
                            int i4 = i3;
                            co7 co7Var2 = co7Var;
                            switch (i4) {
                                case 0:
                                    Context context3 = (Context) co7Var2.f10359b;
                                    Object obj2 = C0962f.f11840j;
                                    try {
                                        return Optional.m6263d(context3.getPackageManager().getApplicationInfo("com.google.android.gms", 0));
                                    } catch (PackageManager.NameNotFoundException unused) {
                                        return Optional.m6262a();
                                    }
                                default:
                                    return Optional.m6263d(new pcd((on9) co7Var2.f10360c));
                            }
                        }
                    };
                }
                return new C0962f((Context) co7Var.f10359b, (on9) co7Var.f10360c, (on9) co7Var.f10361d, (fxc) co7Var.f10362e, (on9) co7Var.f10363f, (fxc) co7Var.f10364g);
            case 1:
                Object obj2 = C0962f.f11840j;
                return new d2d(new ltc(context, grc.f41252a, InterfaceC3691vn.f65627m, mo3.f51630c));
            default:
                Object obj3 = kzc.f48830a;
                return xwc.m24771i0(context);
        }
    }
}
