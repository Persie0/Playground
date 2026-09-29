package p000;

import android.app.PendingIntent;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.text.ParcelableSpan;
import android.text.SpannableString;
import android.text.style.TextAppearanceSpan;
import android.util.Log;
import android.util.SizeF;
import android.widget.RemoteViews;
import androidx.compose.runtime.internal.C0282a;
import androidx.glance.AbstractC0640a;
import androidx.glance.appwidget.C0664l;
import androidx.glance.appwidget.GlanceRemoteViewsService;
import androidx.glance.appwidget.LayoutType;
import androidx.glance.appwidget.R$style;
import androidx.glance.appwidget.action.ActionCallbackBroadcastReceiver;
import androidx.glance.appwidget.action.ActionTrampolineActivity;
import androidx.glance.appwidget.action.InvisibleActionTrampolineActivity;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.Pair;
import kotlin.collections.AbstractC3194a;

/* JADX INFO: loaded from: classes2.dex */
public abstract class foc {

    /* JADX INFO: renamed from: a */
    public static final C0282a f39397a = new C0282a(1336597326, false, new de1(6));

    /* JADX INFO: renamed from: b */
    public static final C0282a f39398b = new C0282a(578342574, false, new de1(7));

    /* JADX INFO: renamed from: c */
    public static final C0282a f39399c = new C0282a(1071105920, false, new ee1(0));

    /* JADX INFO: renamed from: d */
    public static final C0282a f39400d = new C0282a(1351623351, false, new ee1(1));

    /* JADX INFO: renamed from: a */
    public static final void m11969a(List list) {
        List<vp2> list2 = list;
        if ((list2 instanceof Collection) && list2.isEmpty()) {
            return;
        }
        for (vp2 vp2Var : list2) {
        }
    }

    /* JADX INFO: renamed from: b */
    public static final void m11970b(RemoteViews remoteViews, yaa yaaVar, j64 j64Var, List list) {
        int i = 0;
        for (Object obj : u91.m22615g1(list, 10)) {
            int i2 = i + 1;
            if (i < 0) {
                vz1.m23628e0();
                throw null;
            }
            m11973e(remoteViews, yaaVar.m25021b(j64Var, i), (vp2) obj);
            i = i2;
        }
    }

    /* JADX INFO: renamed from: c */
    public static final int m11971c(C3532re c3532re) {
        int i = c3532re.f59148a;
        int i2 = 8388611;
        if (i != 0) {
            if (i == 2) {
                i2 = 8388613;
            } else if (i == 1) {
                i2 = 1;
            } else {
                Log.w("GlanceAppWidget", "Unknown horizontal alignment: " + ((Object) C3406oe.m17945b(i)));
            }
        }
        int i3 = c3532re.f59149b;
        int i4 = 48;
        if (i3 != 0) {
            if (i3 == 2) {
                i4 = 80;
            } else if (i3 == 1) {
                i4 = 16;
            } else {
                Log.w("GlanceAppWidget", "Unknown vertical alignment: " + ((Object) C3494qe.m19887b(i3)));
            }
        }
        return i2 | i4;
    }

    /* JADX INFO: renamed from: d */
    public static final String m11972d(long j) {
        if (j == 9205357640488583168L) {
            return "Unspecified";
        }
        StringBuilder sb = new StringBuilder();
        sb.append((Object) xj2.m24561c(bk2.m3806b(j)));
        sb.append('x');
        sb.append((Object) xj2.m24561c(bk2.m3805a(j)));
        return sb.toString();
    }

    /* JADX WARN: Code duplicated, block: B:174:0x046f  */
    /* JADX INFO: renamed from: e */
    public static final void m11973e(RemoteViews remoteViews, yaa yaaVar, vp2 vp2Var) {
        LayoutType layoutType;
        int i;
        LayoutType layoutType2;
        boolean z;
        long j = yaaVar.f69577j;
        C0664l c0664l = yaaVar.f69571d;
        boolean z2 = yaaVar.f69573f;
        Context context = yaaVar.f69568a;
        if (vp2Var instanceof wp2) {
            wp2 wp2Var = (wp2) vp2Var;
            ArrayList<vp2> arrayList = wp2Var.f45997c;
            LayoutType layoutType3 = LayoutType.Box;
            int size = arrayList.size();
            on3 on3Var = wp2Var.f67149d;
            C3532re c3532re = wp2Var.f67150e;
            j64 j64VarM24652b = xr4.m24652b(remoteViews, yaaVar, layoutType3, size, on3Var, new C3406oe(c3532re.f59148a), new C3494qe(c3532re.f59149b));
            e3d.m10831f(yaaVar, remoteViews, wp2Var.f67149d, j64VarM24652b);
            for (vp2 vp2Var2 : arrayList) {
                vp2Var2.mo2978b(vp2Var2.mo2977a().mo16935d(new C3719we(wp2Var.f67150e)));
            }
            m11970b(remoteViews, yaaVar, j64VarM24652b, arrayList);
            return;
        }
        if (vp2Var instanceof fq2) {
            fq2 fq2Var = (fq2) vp2Var;
            LayoutType layoutType4 = (Build.VERSION.SDK_INT < 31 || !gic.m12673a(fq2Var.f39450d)) ? LayoutType.Row : LayoutType.RadioRow;
            ArrayList arrayList2 = fq2Var.f45997c;
            j64 j64VarM24652b2 = xr4.m24652b(remoteViews, yaaVar, layoutType4, arrayList2.size(), fq2Var.f39450d, null, new C3494qe(fq2Var.f39452f));
            remoteViews.setInt(j64VarM24652b2.f45111a, "setGravity", m11971c(new C3532re(fq2Var.f39451e, fq2Var.f39452f)));
            e3d.m10831f(yaa.m25020a(yaaVar, 0, null, null, null, 0L, 0, null, 61439), remoteViews, fq2Var.f39450d, j64VarM24652b2);
            m11970b(remoteViews, yaaVar, j64VarM24652b2, arrayList2);
            if (gic.m12673a(fq2Var.f39450d)) {
                m11969a(arrayList2);
                return;
            }
            return;
        }
        if (vp2Var instanceof xp2) {
            xp2 xp2Var = (xp2) vp2Var;
            LayoutType layoutType5 = (Build.VERSION.SDK_INT < 31 || !gic.m12673a(xp2Var.f68480d)) ? LayoutType.Column : LayoutType.RadioColumn;
            ArrayList arrayList3 = xp2Var.f45997c;
            j64 j64VarM24652b3 = xr4.m24652b(remoteViews, yaaVar, layoutType5, arrayList3.size(), xp2Var.f68480d, new C3406oe(xp2Var.f68482f), null);
            remoteViews.setInt(j64VarM24652b3.f45111a, "setGravity", m11971c(new C3532re(xp2Var.f68482f, xp2Var.f68481e)));
            e3d.m10831f(yaa.m25020a(yaaVar, 0, null, null, null, 0L, 0, null, 61439), remoteViews, xp2Var.f68480d, j64VarM24652b3);
            m11970b(remoteViews, yaaVar, j64VarM24652b3, arrayList3);
            if (gic.m12673a(xp2Var.f68480d)) {
                m11969a(arrayList3);
                return;
            }
            return;
        }
        if (vp2Var instanceof iq2) {
            iq2 iq2Var = (iq2) vp2Var;
            j64 j64VarM24653c = xr4.m24653c(remoteViews, yaaVar, LayoutType.Text, iq2Var.f44420d);
            int i2 = j64VarM24653c.f45111a;
            CharSequence charSequence = iq2Var.f44417a;
            ux9 ux9Var = iq2Var.f44418b;
            int i3 = iq2Var.f44419c;
            if (i3 != Integer.MAX_VALUE) {
                remoteViews.setInt(i2, "setMaxLines", i3);
            }
            if (ux9Var == null) {
                remoteViews.setTextViewText(i2, charSequence);
            } else {
                SpannableString spannableString = new SpannableString(charSequence);
                int length = spannableString.length();
                zx9 zx9Var = ux9Var.f64491b;
                if (zx9Var != null) {
                    long j2 = zx9Var.f72360a;
                    if ((1095216660480L & j2) != 4294967296L) {
                        C3386nv.m17626m("Only Sp is currently supported for font sizes");
                        return;
                    }
                    remoteViews.setTextViewTextSize(i2, 2, zx9.m25848c(j2));
                }
                ArrayList arrayList4 = new ArrayList();
                ac3 ac3Var = ux9Var.f64492c;
                if (ac3Var != null) {
                    int i4 = ac3Var.f482a;
                    arrayList4.add(new TextAppearanceSpan(context, i4 == 700 ? R$style.Glance_AppWidget_TextAppearance_Bold : i4 == 500 ? R$style.Glance_AppWidget_TextAppearance_Medium : R$style.Glance_AppWidget_TextAppearance_Normal));
                }
                Iterator it = arrayList4.iterator();
                while (it.hasNext()) {
                    spannableString.setSpan((ParcelableSpan) it.next(), 0, length, 17);
                }
                remoteViews.setTextViewText(i2, spannableString);
                oa1 oa1Var = ux9Var.f64490a;
                if (oa1Var instanceof a63) {
                    remoteViews.setTextColor(i2, d32.m10042h0(((a63) oa1Var).f280a));
                } else if (!(oa1Var instanceof v78)) {
                    Log.w("GlanceAppWidget", "Unexpected text color: " + oa1Var);
                } else if (Build.VERSION.SDK_INT >= 31) {
                    s58.m21113g(remoteViews, i2, "setTextColor", ((v78) oa1Var).f64981a);
                } else {
                    remoteViews.setTextColor(i2, d32.m10042h0(((v78) oa1Var).mo134a(context)));
                }
            }
            e3d.m10831f(yaaVar, remoteViews, iq2Var.f44420d, j64VarM24653c);
            return;
        }
        boolean z3 = vp2Var instanceof cq2;
        C3532re c3532re2 = C3532re.f59145e;
        if (z3) {
            cq2 cq2Var = (cq2) vp2Var;
            ArrayList arrayList5 = cq2Var.f45997c;
            if (arrayList5.size() == 1 && fa4.m11650l(cq2Var.f8864d, c3532re2)) {
                m11973e(remoteViews, yaaVar, (vp2) u91.m22589G0(arrayList5));
                return;
            } else {
                C3386nv.m17626m("Lazy list items can only have a single child align at the center start of the view. The normalization of the composition tree failed.");
                return;
            }
        }
        if (vp2Var instanceof aq2) {
            aq2 aq2Var = (aq2) vp2Var;
            j64 j64VarM24653c2 = xr4.m24653c(remoteViews, yaaVar, LayoutType.List, aq2Var.f7356d);
            if (z2) {
                C3386nv.m17633t("Glance does not support nested list views.");
                return;
            }
            int i5 = j64VarM24653c2.f45111a;
            remoteViews.setPendingIntentTemplate(i5, PendingIntent.getActivity(context, 0, new Intent(), 184549384, null));
            ArrayList arrayList6 = new ArrayList();
            ArrayList arrayList7 = new ArrayList();
            yaa yaaVarM25020a = yaa.m25020a(yaaVar, 0, null, null, null, 0L, i5, null, 64479);
            boolean z4 = false;
            int i6 = 0;
            for (Object obj : aq2Var.f45997c) {
                int i7 = i6 + 1;
                if (i6 < 0) {
                    vz1.m23628e0();
                    throw null;
                }
                vp2 vp2Var3 = (vp2) obj;
                vp2Var3.getClass();
                long j3 = ((cq2) vp2Var3).f34372f;
                RemoteViews remoteViewsM11974f = m11974f(yaa.m25020a(yaaVarM25020a, 0, new AtomicInteger(1048576), null, null, 0L, i6, null, 64447), vz1.m23604J(vp2Var3), c0664l.m2254a(vp2Var3));
                arrayList6.add(Long.valueOf(j3));
                arrayList7.add(remoteViewsM11974f);
                z4 = z4 || j3 > -4611686018427387904L;
                i6 = i7;
            }
            int size2 = xr4.f68582c;
            if (size2 < 1) {
                ArrayList arrayList8 = new ArrayList(v91.m23189q0(arrayList7, 10));
                Iterator it2 = arrayList7.iterator();
                while (it2.hasNext()) {
                    arrayList8.add(Integer.valueOf(((RemoteViews) it2.next()).getLayoutId()));
                }
                size2 = u91.m22583A0(arrayList8).size();
            }
            red.m20596a(remoteViews, yaaVar, i5, m11972d(j), new b58(u91.m22623o1(arrayList6), (RemoteViews[]) arrayList7.toArray(new RemoteViews[0]), z4, Math.max(size2, 1)));
            e3d.m10831f(yaaVar, remoteViews, aq2Var.f7356d, j64VarM24653c2);
            return;
        }
        if (vp2Var instanceof hq2) {
            hq2 hq2Var = (hq2) vp2Var;
            e3d.m10831f(yaaVar, remoteViews, hq2Var.f42769a, xr4.m24653c(remoteViews, yaaVar, LayoutType.Frame, hq2Var.f42769a));
            return;
        }
        if (vp2Var instanceof zp2) {
            zp2 zp2Var = (zp2) vp2Var;
            boolean zM2212c = AbstractC0640a.m2212c(zp2Var);
            int i8 = zp2Var.f71935e;
            if (i8 == 0) {
                layoutType2 = zM2212c ? LayoutType.ImageCropDecorative : LayoutType.ImageCrop;
            } else if (i8 == 1) {
                layoutType2 = zM2212c ? LayoutType.ImageFitDecorative : LayoutType.ImageFit;
            } else if (i8 == 2) {
                layoutType2 = zM2212c ? LayoutType.ImageFillBoundsDecorative : LayoutType.ImageFillBounds;
            } else {
                Log.w("GlanceAppWidget", "Unsupported ContentScale user: " + ((Object) il1.m14010a(zp2Var.f71935e)));
                layoutType2 = LayoutType.ImageFit;
            }
            j64 j64VarM24653c3 = xr4.m24653c(remoteViews, yaaVar, layoutType2, zp2Var.f71931a);
            int i9 = j64VarM24653c3.f45111a;
            zz3 zz3Var = zp2Var.f71932b;
            if (zz3Var instanceof C0850ck) {
                remoteViews.setImageViewResource(i9, ((C0850ck) zz3Var).f10187a);
            } else {
                if (!(zz3Var instanceof gd0)) {
                    C3386nv.m17626m("An unsupported ImageProvider type was used.");
                    return;
                }
                remoteViews.setImageViewBitmap(i9, ((gd0) zz3Var).f40558a);
            }
            j1a j1aVar = zp2Var.f71933c;
            if (j1aVar != null) {
                if (!(j1aVar instanceof j1a)) {
                    C3386nv.m17626m("An unsupported ColorFilter was used.");
                    return;
                }
                oa1 oa1Var2 = j1aVar.f44913a;
                if (Build.VERSION.SDK_INT < 31 || !(oa1Var2 instanceof v78)) {
                    remoteViews.setInt(i9, "setColorFilter", d32.m10042h0(oa1Var2.mo134a(context)));
                } else {
                    s58.m21110d(remoteViews, i9, "setColorFilter", ((v78) oa1Var2).f64981a);
                }
            }
            Float f = zp2Var.f71934d;
            if (f != null) {
                remoteViews.setInt(i9, "setImageAlpha", l70.m15945h((int) Math.rint(l70.m15944g(f.floatValue(), 0.0f, 1.0f) * 255.0f), 0, 255));
            }
            e3d.m10831f(yaaVar, remoteViews, zp2Var.f71931a, j64VarM24653c3);
            if (zp2Var.f71935e != 1) {
                z = false;
            } else {
                m4b m4bVar = (m4b) zp2Var.f71931a.mo11685a(null, uz3.f64604c);
                pg2 pg2Var = m4bVar != null ? m4bVar.f50591a : null;
                og2 og2Var = og2.f54304a;
                if (!fa4.m11650l(pg2Var, og2Var)) {
                    cs3 cs3Var = (cs3) zp2Var.f71931a.mo11685a(null, uz3.f64605d);
                    if (!fa4.m11650l(cs3Var != null ? cs3Var.f34485a : null, og2Var)) {
                        z = false;
                    }
                }
                z = true;
            }
            remoteViews.setBoolean(i9, "setAdjustViewBounds", z);
            return;
        }
        if (!(vp2Var instanceof dq2)) {
            if (vp2Var instanceof eq2) {
                eq2 eq2Var = (eq2) vp2Var;
                ArrayList arrayList9 = eq2Var.f45997c;
                if (arrayList9.size() == 1 && fa4.m11650l(eq2Var.f8864d, c3532re2)) {
                    m11973e(remoteViews, yaaVar, (vp2) u91.m22589G0(arrayList9));
                    return;
                } else {
                    C3386nv.m17626m("Lazy vertical grid items can only have a single child align at the center start of the view. The normalization of the composition tree failed.");
                    return;
                }
            }
            if (!(vp2Var instanceof gq2)) {
                C3386nv.m17625k(vp2Var.getClass().getCanonicalName(), "Unknown element type ");
                return;
            }
            ArrayList arrayList10 = ((gq2) vp2Var).f45997c;
            if (arrayList10.size() <= 1) {
                vp2 vp2Var4 = (vp2) u91.m22591I0(arrayList10);
                if (vp2Var4 != null) {
                    m11973e(remoteViews, yaaVar, vp2Var4);
                    return;
                }
                return;
            }
            throw new IllegalArgumentException(("Size boxes can only have at most one child " + arrayList10.size() + ". The normalization of the composition tree failed.").toString());
        }
        dq2 dq2Var = (dq2) vp2Var;
        xp3 xp3Var = dq2Var.f36017f;
        if (fa4.m11650l(xp3Var, new xp3(1))) {
            layoutType = LayoutType.VerticalGridOneColumn;
        } else if (fa4.m11650l(xp3Var, new xp3(2))) {
            layoutType = LayoutType.VerticalGridTwoColumns;
        } else if (fa4.m11650l(xp3Var, new xp3(3))) {
            layoutType = LayoutType.VerticalGridThreeColumns;
        } else if (fa4.m11650l(xp3Var, new xp3(4))) {
            layoutType = LayoutType.VerticalGridFourColumns;
        } else {
            layoutType = fa4.m11650l(xp3Var, new xp3(5)) ? LayoutType.VerticalGridFiveColumns : LayoutType.VerticalGridAutoFit;
        }
        j64 j64VarM24653c4 = xr4.m24653c(remoteViews, yaaVar, layoutType, dq2Var.f36015d);
        if (z2) {
            C3386nv.m17633t("Glance does not support nested list views.");
            return;
        }
        xp3 xp3Var2 = dq2Var.f36017f;
        if ((xp3Var2 instanceof xp3) && (1 > (i = xp3Var2.f68483a) || i >= 6)) {
            C3386nv.m17626m("Only counts from 1 to 5 are supported.");
            return;
        }
        int i10 = j64VarM24653c4.f45111a;
        remoteViews.setPendingIntentTemplate(i10, PendingIntent.getActivity(context, 0, new Intent(), 184549384, null));
        ArrayList arrayList11 = new ArrayList();
        ArrayList arrayList12 = new ArrayList();
        yaa yaaVarM25020a2 = yaa.m25020a(yaaVar, 0, null, null, null, 0L, i10, null, 64479);
        boolean z5 = false;
        int i11 = 0;
        for (Object obj2 : dq2Var.f45997c) {
            int i12 = i11 + 1;
            if (i11 < 0) {
                vz1.m23628e0();
                throw null;
            }
            vp2 vp2Var5 = (vp2) obj2;
            vp2Var5.getClass();
            long j4 = ((eq2) vp2Var5).f37703f;
            RemoteViews remoteViewsM11974f2 = m11974f(yaa.m25020a(yaaVarM25020a2, 0, new AtomicInteger(1048576), null, null, 0L, i11, null, 64447), vz1.m23604J(vp2Var5), c0664l.m2254a(vp2Var5));
            arrayList11.add(Long.valueOf(j4));
            arrayList12.add(remoteViewsM11974f2);
            z5 = z5 || j4 > -4611686018427387904L;
            i11 = i12;
        }
        int size3 = xr4.f68582c;
        if (size3 < 1) {
            ArrayList arrayList13 = new ArrayList(v91.m23189q0(arrayList12, 10));
            Iterator it3 = arrayList12.iterator();
            while (it3.hasNext()) {
                arrayList13.add(Integer.valueOf(((RemoteViews) it3.next()).getLayoutId()));
            }
            size3 = u91.m22583A0(arrayList13).size();
        }
        red.m20596a(remoteViews, yaaVar, i10, m11972d(j), new b58(u91.m22623o1(arrayList11), (RemoteViews[]) arrayList12.toArray(new RemoteViews[0]), z5, Math.max(size3, 1)));
        e3d.m10831f(yaaVar, remoteViews, dq2Var.f36015d, j64VarM24653c4);
    }

    /* JADX INFO: renamed from: f */
    public static final RemoteViews m11974f(yaa yaaVar, List list, int i) {
        List list2 = list;
        if (!(list2 instanceof Collection) || !list2.isEmpty()) {
            Iterator it = list2.iterator();
            while (it.hasNext()) {
                if (!(((vp2) it.next()) instanceof gq2)) {
                    vp2 vp2Var = (vp2) u91.m22611c1(list);
                    v58 v58VarM24651a = xr4.m24651a(yaaVar, vp2Var.mo2977a(), i);
                    RemoteViews remoteViews = v58VarM24651a.f64893a;
                    m11973e(remoteViews, yaa.m25020a(yaaVar.m25021b(v58VarM24651a.f64894b, 0), 0, new AtomicInteger(-1), null, new AtomicBoolean(false), 0L, 0, null, 65215), vp2Var);
                    return remoteViews;
                }
            }
        }
        Object objM22589G0 = u91.m22589G0(list);
        objM22589G0.getClass();
        g99 g99Var = ((gq2) objM22589G0).f41178e;
        List<vp2> list3 = list;
        ArrayList arrayList = new ArrayList(v91.m23189q0(list3, 10));
        for (vp2 vp2Var2 : list3) {
            vp2Var2.getClass();
            gq2 gq2Var = (gq2) vp2Var2;
            long j = gq2Var.f41177d;
            v58 v58VarM24651a2 = xr4.m24651a(yaaVar, gq2Var.mo2977a(), i);
            RemoteViews remoteViews2 = v58VarM24651a2.f64893a;
            m11973e(remoteViews2, yaa.m25020a(yaaVar.m25021b(v58VarM24651a2.f64894b, 0), 0, new AtomicInteger(-1), null, new AtomicBoolean(false), j, 0, null, 64703), vp2Var2);
            arrayList.add(new Pair(new SizeF(bk2.m3806b(j), bk2.m3805a(j)), remoteViews2));
        }
        if (g99Var instanceof f99) {
            return (RemoteViews) ((Pair) u91.m22611c1(arrayList)).f47624b;
        }
        if (!(g99Var instanceof e99) && !fa4.m11650l(g99Var, d99.f35221a)) {
            gm5.m12750e();
            return null;
        }
        if (Build.VERSION.SDK_INT >= 31) {
            return AbstractC0780ao.m2937c(AbstractC3194a.m15370W(arrayList));
        }
        if (arrayList.size() != 1 && arrayList.size() != 2) {
            C3386nv.m17626m("unsupported views size");
            return null;
        }
        ArrayList arrayList2 = new ArrayList(v91.m23189q0(arrayList, 10));
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            arrayList2.add((RemoteViews) ((Pair) it2.next()).f47624b);
        }
        int size = arrayList2.size();
        if (size == 1) {
            return (RemoteViews) arrayList2.get(0);
        }
        if (size == 2) {
            return new RemoteViews((RemoteViews) arrayList2.get(0), (RemoteViews) arrayList2.get(1));
        }
        C3386nv.m17626m("There must be between 1 and 2 views.");
        return null;
    }

    /* JADX INFO: renamed from: g */
    public static final RemoteViews m11975g(Context context, int i, w58 w58Var, C0664l c0664l, int i2, ComponentName componentName, C3329mb c3329mb) {
        return m11974f(new yaa(context, i, context.getResources().getConfiguration().getLayoutDirection() == 1, c0664l, -1, false, new AtomicInteger(-1), new j64(0, 0, null, 7), new AtomicBoolean(false), 9205357640488583168L, -1, false, null, componentName, c3329mb), w58Var.f45997c, i2);
    }

    /* JADX INFO: renamed from: h */
    public static RemoteViews m11976h(Context context, w58 w58Var, C0664l c0664l, int i) {
        return m11975g(context, -1, w58Var, c0664l, i, null, new C3329mb(new ComponentName(context, (Class<?>) ActionTrampolineActivity.class), new ComponentName(context, (Class<?>) InvisibleActionTrampolineActivity.class), new ComponentName(context, (Class<?>) ActionCallbackBroadcastReceiver.class), new ComponentName(context, (Class<?>) GlanceRemoteViewsService.class), 6));
    }
}
