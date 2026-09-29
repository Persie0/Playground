package androidx.glance.appwidget;

import android.content.BroadcastReceiver;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.jvm.internal.FunctionReference;
import p000.AbstractC3393o1;
import p000.C3386nv;
import p000.C3472pt;
import p000.ec3;
import p000.je1;
import p000.jq2;
import p000.kn1;
import p000.pk9;
import p000.tj3;
import p000.ui3;
import p000.vl1;
import p000.vp2;
import p000.vz1;
import p000.we1;
import p000.wfb;
import p000.x18;
import p000.ye1;
import p000.yp2;
import p000.zi3;

/* JADX INFO: renamed from: androidx.glance.appwidget.f */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC0658f {
    /* JADX INFO: renamed from: a */
    public static final void m2228a(ye1 ye1Var, int i) {
        tj3 tj3Var = (tj3) ye1Var;
        tj3Var.m22115d0(1257244356);
        if (i == 0 && tj3Var.m22086D()) {
            tj3Var.m22102U();
        } else {
            Object objM22097O = tj3Var.m22097O();
            if (objM22097O == we1.f66679a) {
                objM22097O = IgnoreResultKt$IgnoreResult$1$1.f5957i;
                tj3Var.m22131l0(objM22097O);
            }
            final ui3 ui3Var = (ui3) ((FunctionReference) objM22097O);
            tj3Var.m22113c0(-1115894518);
            tj3Var.m22113c0(1886828752);
            if (!(tj3Var.f62387a instanceof C3472pt)) {
                pk9.m19377r();
                throw null;
            }
            tj3Var.m22107Z();
            if (tj3Var.f62384S) {
                tj3Var.m22130l(new ui3() { // from class: androidx.glance.appwidget.IgnoreResultKt$IgnoreResult$$inlined$GlanceNode$1
                    {
                        super(0);
                    }

                    @Override // p000.ui3
                    /* JADX INFO: renamed from: a */
                    public final Object mo0a() {
                        return ui3Var.mo0a();
                    }
                });
            } else {
                tj3Var.m22137o0();
            }
            AbstractC3393o1.m17723A(tj3Var, true, false, false);
        }
        x18 x18VarM22143u = tj3Var.m22143u();
        if (x18VarM22143u != null) {
            x18VarM22143u.f67642d = new je1(i, 20);
        }
    }

    /* JADX INFO: renamed from: b */
    public static final void m2229b(BroadcastReceiver broadcastReceiver, kn1 kn1Var, zi3 zi3Var) {
        if (ec3.f36994a.get()) {
            C3386nv.m17633t("goAsync must never be called when the AsyncRequestWorker is meant to be used");
        } else {
            vl1 vl1VarM23619a = vz1.m23619a(kn1Var);
            wfb.m23926u(vl1VarM23619a, null, null, new CoroutineBroadcastReceiverKt$goAsync$2(vl1VarM23619a, broadcastReceiver.goAsync(), zi3Var, null), 3);
        }
    }

    /* JADX INFO: renamed from: c */
    public static final boolean m2230c(vp2 vp2Var) {
        if (vp2Var instanceof yp2) {
            return true;
        }
        if (!(vp2Var instanceof jq2)) {
            return false;
        }
        ArrayList arrayList = ((jq2) vp2Var).f45997c;
        if (arrayList != null && arrayList.isEmpty()) {
            return false;
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            if (m2230c((vp2) it.next())) {
                return true;
            }
        }
        return false;
    }
}
