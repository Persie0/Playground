package p000;

import android.app.Activity;
import android.content.ComponentName;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.os.StrictMode;
import androidx.compose.material3.AbstractC0231g;
import androidx.compose.p002ui.AbstractC0287b;
import androidx.compose.p002ui.node.C0352b;
import androidx.glance.appwidget.action.ActionTrampolineType;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes2.dex */
public abstract class i1d {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: a */
    public static final void m13630a(ArrayList arrayList, vi3 vi3Var, ye1 ye1Var, int i) {
        vi3Var.getClass();
        tj3 tj3Var = (tj3) ye1Var;
        tj3Var.m22115d0(1078877139);
        int i2 = 32;
        int i3 = (tj3Var.m22124i(arrayList) ? 4 : 2) | i | (tj3Var.m22124i(vi3Var) ? 32 : 16);
        int i4 = 1;
        if (tj3Var.m22099R(i3 & 1, (i3 & 19) != 18)) {
            yn8 yn8VarM3972r0 = bna.m3972r0(tj3Var);
            b16 b16Var = b16.f7762a;
            e16 e16VarM4412e = c99.m4412e(bna.m3974s0(b16Var, yn8VarM3972r0, true, false), 1.0f);
            sj8 sj8VarM20003a = qj8.m20003a(eh0.f37236b, nj0.f52789H, tj3Var, 48);
            int iHashCode = Long.hashCode(tj3Var.f62385T);
            l77 l77VarM22132m = tj3Var.m22132m();
            e16 e16VarM1322c = AbstractC0287b.m1322c(tj3Var, e16VarM4412e);
            se1.f60731q.getClass();
            ui3 ui3Var = C0352b.f4299b;
            tj3Var.m22119f0();
            if (tj3Var.f62384S) {
                tj3Var.m22130l(ui3Var);
            } else {
                tj3Var.m22137o0();
            }
            oha.m18001g(tj3Var, C0352b.f4303f, sj8VarM20003a);
            oha.m18001g(tj3Var, C0352b.f4302e, l77VarM22132m);
            oha.m18001g(tj3Var, C0352b.f4304g, Integer.valueOf(iHashCode));
            oha.m18000f(tj3Var, C0352b.f4305h);
            oha.m18001g(tj3Var, C0352b.f4301d, e16VarM1322c);
            tj3Var.m22111b0(748482223);
            for (Object obj : arrayList) {
                bb1 bb1VarM230a = ab1.m230a(eh0.f37238d, nj0.f52791J, tj3Var, 0);
                int iHashCode2 = Long.hashCode(tj3Var.f62385T);
                l77 l77VarM22132m2 = tj3Var.m22132m();
                e16 e16VarM1322c2 = AbstractC0287b.m1322c(tj3Var, b16Var);
                se1.f60731q.getClass();
                ui3 ui3Var2 = C0352b.f4299b;
                tj3Var.m22119f0();
                if (tj3Var.f62384S) {
                    tj3Var.m22130l(ui3Var2);
                } else {
                    tj3Var.m22137o0();
                }
                oha.m18001g(tj3Var, C0352b.f4303f, bb1VarM230a);
                oha.m18001g(tj3Var, C0352b.f4302e, l77VarM22132m2);
                oha.m18001g(tj3Var, C0352b.f4304g, Integer.valueOf(iHashCode2));
                oha.m18000f(tj3Var, C0352b.f4305h);
                oha.m18001g(tj3Var, C0352b.f4301d, e16VarM1322c2);
                int i5 = ((i3 & 112) == i2 ? i4 : 0) | (tj3Var.m22124i(obj) ? 1 : 0);
                Object objM22097O = tj3Var.m22097O();
                if (i5 != 0 || objM22097O == we1.f66679a) {
                    objM22097O = new a45(23, vi3Var, obj);
                    tj3Var.m22131l0(objM22097O);
                }
                boolean z = i4;
                AbstractC0231g.m1153f(805306368, 510, null, tj3Var, (ui3) objM22097O, ci8.m4703P(-1220903299, new iq8(obj, i4), tj3Var), null, null, null, false);
                tj3Var.m22139q(z);
                i4 = z ? 1 : 0;
                b16Var = b16Var;
                i2 = 32;
            }
            tj3Var.m22139q(false);
            tj3Var.m22139q(i4);
        } else {
            tj3Var.m22102U();
        }
        x18 x18VarM22143u = tj3Var.m22143u();
        if (x18VarM22143u != null) {
            x18VarM22143u.f67642d = new eq8(arrayList, i, 5, vi3Var);
        }
    }

    /* JADX INFO: renamed from: b */
    public static Intent m13631b(Intent intent, yaa yaaVar, int i, ActionTrampolineType actionTrampolineType) {
        Intent intent2 = new Intent();
        ActionTrampolineType actionTrampolineType2 = ActionTrampolineType.ACTIVITY;
        C3329mb c3329mb = yaaVar.f69582o;
        intent2.setComponent(actionTrampolineType == actionTrampolineType2 ? (ComponentName) c3329mb.f50860b : (ComponentName) c3329mb.f50861c);
        intent2.setData(m13632c(yaaVar, i, actionTrampolineType, ""));
        intent2.putExtra("ACTION_TYPE", actionTrampolineType.name());
        intent2.putExtra("ACTION_INTENT", intent);
        return intent2;
    }

    /* JADX INFO: renamed from: c */
    public static final Uri m13632c(yaa yaaVar, int i, ActionTrampolineType actionTrampolineType, String str) {
        Uri.Builder builder = new Uri.Builder();
        builder.scheme("glance-action");
        builder.path(actionTrampolineType.name());
        builder.appendQueryParameter("appWidgetId", String.valueOf(yaaVar.f69569b));
        builder.appendQueryParameter("viewId", String.valueOf(i));
        builder.appendQueryParameter("viewSize", bk2.m3807c(yaaVar.f69577j));
        builder.appendQueryParameter("extraData", str);
        if (yaaVar.f69573f) {
            builder.appendQueryParameter("lazyCollection", String.valueOf(yaaVar.f69578k));
            builder.appendQueryParameter("lazeViewItem", String.valueOf(-1));
        }
        return builder.build();
    }

    /* JADX INFO: renamed from: d */
    public static final void m13633d(Activity activity, Intent intent) {
        Parcelable parcelableExtra = intent.getParcelableExtra("ACTION_INTENT");
        if (parcelableExtra == null) {
            C3386nv.m17626m("List adapter activity trampoline invoked without specifying target intent.");
            return;
        }
        Intent intent2 = (Intent) parcelableExtra;
        if (intent.hasExtra("android.widget.extra.CHECKED")) {
            intent2.putExtra("android.widget.extra.CHECKED", intent.getBooleanExtra("android.widget.extra.CHECKED", false));
        }
        String stringExtra = intent.getStringExtra("ACTION_TYPE");
        if (stringExtra == null) {
            C3386nv.m17626m("List adapter activity trampoline invoked without trampoline type");
            return;
        }
        Bundle bundleExtra = intent.getBundleExtra("ACTIVITY_OPTIONS");
        StrictMode.VmPolicy vmPolicy = StrictMode.getVmPolicy();
        StrictMode.setVmPolicy(Build.VERSION.SDK_INT >= 31 ? AbstractC0780ao.m2940f(new StrictMode.VmPolicy.Builder(vmPolicy)).build() : new StrictMode.VmPolicy.Builder().build());
        int i = AbstractC3101i6.f43561a[ActionTrampolineType.valueOf(stringExtra).ordinal()];
        if (i == 1) {
            activity.startActivity(intent2, bundleExtra);
        } else if (i == 2 || i == 3) {
            activity.sendBroadcast(intent2);
        } else if (i == 4) {
            activity.startService(intent2);
        } else {
            if (i != 5) {
                gm5.m12750e();
                return;
            }
            activity.startForegroundService(intent2);
        }
        StrictMode.setVmPolicy(vmPolicy);
        activity.finish();
    }
}
