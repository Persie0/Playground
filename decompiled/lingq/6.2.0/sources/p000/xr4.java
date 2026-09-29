package p000;

import android.R;
import android.content.Context;
import android.os.Build;
import android.util.Log;
import android.widget.RemoteViews;
import androidx.glance.appwidget.LayoutSize;
import androidx.glance.appwidget.LayoutType;
import androidx.glance.appwidget.R$id;
import androidx.glance.appwidget.R$layout;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import kotlin.Pair;
import kotlin.collections.AbstractC3194a;

/* JADX INFO: loaded from: classes2.dex */
public abstract class xr4 {

    /* JADX INFO: renamed from: a */
    public static final Map f68580a = AbstractC3194a.m15365R(new Pair(LayoutType.Text, Integer.valueOf(R$layout.glance_text)), new Pair(LayoutType.List, Integer.valueOf(R$layout.glance_list)), new Pair(LayoutType.CheckBox, Integer.valueOf(R$layout.glance_check_box)), new Pair(LayoutType.CheckBoxBackport, Integer.valueOf(R$layout.glance_check_box_backport)), new Pair(LayoutType.Button, Integer.valueOf(R$layout.glance_button)), new Pair(LayoutType.Swtch, Integer.valueOf(R$layout.glance_swtch)), new Pair(LayoutType.SwtchBackport, Integer.valueOf(R$layout.glance_swtch_backport)), new Pair(LayoutType.Frame, Integer.valueOf(R$layout.glance_frame)), new Pair(LayoutType.ImageCrop, Integer.valueOf(R$layout.glance_image_crop)), new Pair(LayoutType.ImageCropDecorative, Integer.valueOf(R$layout.glance_image_crop_decorative)), new Pair(LayoutType.ImageFit, Integer.valueOf(R$layout.glance_image_fit)), new Pair(LayoutType.ImageFitDecorative, Integer.valueOf(R$layout.glance_image_fit_decorative)), new Pair(LayoutType.ImageFillBounds, Integer.valueOf(R$layout.glance_image_fill_bounds)), new Pair(LayoutType.ImageFillBoundsDecorative, Integer.valueOf(R$layout.glance_image_fill_bounds_decorative)), new Pair(LayoutType.LinearProgressIndicator, Integer.valueOf(R$layout.glance_linear_progress_indicator)), new Pair(LayoutType.CircularProgressIndicator, Integer.valueOf(R$layout.glance_circular_progress_indicator)), new Pair(LayoutType.VerticalGridOneColumn, Integer.valueOf(R$layout.glance_vertical_grid_one_column)), new Pair(LayoutType.VerticalGridTwoColumns, Integer.valueOf(R$layout.glance_vertical_grid_two_columns)), new Pair(LayoutType.VerticalGridThreeColumns, Integer.valueOf(R$layout.glance_vertical_grid_three_columns)), new Pair(LayoutType.VerticalGridFourColumns, Integer.valueOf(R$layout.glance_vertical_grid_four_columns)), new Pair(LayoutType.VerticalGridFiveColumns, Integer.valueOf(R$layout.glance_vertical_grid_five_columns)), new Pair(LayoutType.VerticalGridAutoFit, Integer.valueOf(R$layout.glance_vertical_grid_auto_fit)), new Pair(LayoutType.RadioButton, Integer.valueOf(R$layout.glance_radio_button)), new Pair(LayoutType.RadioButtonBackport, Integer.valueOf(R$layout.glance_radio_button_backport)));

    /* JADX INFO: renamed from: b */
    public static final int f68581b;

    /* JADX INFO: renamed from: c */
    public static final int f68582c;

    static {
        int size = pk3.f56341f.size();
        f68581b = size;
        f68582c = Build.VERSION.SDK_INT >= 31 ? pk3.f56343h : pk3.f56343h / size;
    }

    /* JADX INFO: renamed from: a */
    public static final v58 m24651a(yaa yaaVar, on3 on3Var, int i) {
        Context context = yaaVar.f69568a;
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 31) {
            int i3 = pk3.f56343h;
            if (i >= i3) {
                C3386nv.m17624j(wq1.m24115k("Index of the root view cannot be more than ", i3, i, ", currently "));
                return null;
            }
            LayoutSize layoutSize = LayoutSize.Wrap;
            j99 j99Var = new j99(layoutSize, layoutSize);
            RemoteViews remoteViews = new RemoteViews(context.getPackageName(), pk3.f56342g + i);
            m4b m4bVar = (m4b) on3Var.mo11685a(null, uz3.f64608g);
            if (m4bVar != null) {
                e3d.m10833h(context, remoteViews, m4bVar, R$id.rootView);
            }
            cs3 cs3Var = (cs3) on3Var.mo11685a(null, uz3.f64609h);
            if (cs3Var != null) {
                e3d.m10832g(context, remoteViews, cs3Var, R$id.rootView);
            }
            if (i2 >= 33) {
                remoteViews.removeAllViews(R$id.rootView);
            }
            return new v58(remoteViews, new j64(R$id.rootView, 0, i2 >= 33 ? AbstractC3194a.m15360M() : AbstractC3194a.m15364Q(new Pair(0, AbstractC3194a.m15364Q(new Pair(j99Var, Integer.valueOf(R$id.rootStubId))))), 2));
        }
        int i4 = f68581b * i;
        int i5 = pk3.f56343h;
        if (i4 >= i5) {
            throw new IllegalArgumentException(("Index of the root view cannot be more than " + (i5 / 4) + ", currently " + i).toString());
        }
        m4b m4bVar2 = (m4b) on3Var.mo11685a(null, uz3.f64606e);
        pg2 pg2VarM24655e = og2.f54304a;
        pg2 pg2VarM24655e2 = m4bVar2 != null ? m24655e(m4bVar2.f50591a, context) : pg2VarM24655e;
        cs3 cs3Var2 = (cs3) on3Var.mo11685a(null, uz3.f64607f);
        if (cs3Var2 != null) {
            pg2VarM24655e = m24655e(cs3Var2.f34485a, context);
        }
        kg2 kg2Var = kg2.f47164a;
        LayoutSize layoutSize2 = pg2VarM24655e2.equals(kg2Var) ? LayoutSize.MatchParent : LayoutSize.Wrap;
        LayoutSize layoutSize3 = pg2VarM24655e.equals(kg2Var) ? LayoutSize.MatchParent : LayoutSize.Wrap;
        LayoutSize layoutSize4 = LayoutSize.Fixed;
        j99 j99Var2 = new j99(layoutSize2 == layoutSize4 ? LayoutSize.Wrap : layoutSize2, layoutSize3 == layoutSize4 ? LayoutSize.Wrap : layoutSize3);
        Integer num = (Integer) pk3.f56341f.get(j99Var2);
        if (num != null) {
            return new v58(new RemoteViews(context.getPackageName(), i4 + pk3.f56342g + num.intValue()), new j64(0, 0, AbstractC3194a.m15364Q(new Pair(0, AbstractC3194a.m15364Q(new Pair(j99Var2, Integer.valueOf(R$id.rootStubId))))), 3));
        }
        throw new IllegalStateException("Cannot find root element for size [" + layoutSize2 + ", " + layoutSize3 + ']');
    }

    /* JADX INFO: renamed from: b */
    public static final j64 m24652b(RemoteViews remoteViews, yaa yaaVar, LayoutType layoutType, int i, on3 on3Var, C3406oe c3406oe, C3494qe c3494qe) {
        int iIntValue;
        if (i > 10) {
            Log.e("GlanceAppWidget", "Truncated " + layoutType + " container from " + i + " to 10 elements", new IllegalArgumentException(layoutType + " container cannot have more than 10 elements"));
        }
        int i2 = i <= 10 ? i : 10;
        Integer numM24657g = m24657g(layoutType, on3Var);
        if (numM24657g != null) {
            iIntValue = numM24657g.intValue();
        } else {
            ok1 ok1Var = (ok1) pk3.f56336a.get(new pk1(layoutType, i2, c3406oe, c3494qe));
            Integer numValueOf = ok1Var != null ? Integer.valueOf(ok1Var.f54490a) : null;
            if (numValueOf == null) {
                throw new IllegalArgumentException("Cannot find container " + layoutType + " with " + i + " children");
            }
            iIntValue = numValueOf.intValue();
        }
        Map map = (Map) pk3.f56337b.get(layoutType);
        if (map == null) {
            v63.m23142t(layoutType, "Cannot find generated children for ");
            return null;
        }
        j64 j64VarM24654d = m24654d(remoteViews, yaaVar, iIntValue, on3Var);
        int i3 = j64VarM24654d.f45111a;
        j64 j64Var = new j64(i3, j64VarM24654d.f45112b, map);
        if (Build.VERSION.SDK_INT >= 33) {
            remoteViews.removeAllViews(i3);
        }
        return j64Var;
    }

    /* JADX INFO: renamed from: c */
    public static final j64 m24653c(RemoteViews remoteViews, yaa yaaVar, LayoutType layoutType, on3 on3Var) {
        Integer numM24657g = m24657g(layoutType, on3Var);
        if (numM24657g != null || (numM24657g = (Integer) f68580a.get(layoutType)) != null) {
            return m24654d(remoteViews, yaaVar, numM24657g.intValue(), on3Var);
        }
        v63.m23142t(layoutType, "Cannot use `insertView` with a container like ");
        return null;
    }

    /* JADX INFO: renamed from: d */
    public static final j64 m24654d(RemoteViews remoteViews, yaa yaaVar, int i, on3 on3Var) {
        Integer numValueOf;
        int iIntValue;
        int i2 = yaaVar.f69572e;
        Context context = yaaVar.f69568a;
        m4b m4bVar = (m4b) on3Var.mo11685a(null, uz3.f64610i);
        pg2 pg2Var = og2.f54304a;
        pg2 pg2Var2 = m4bVar != null ? m4bVar.f50591a : pg2Var;
        cs3 cs3Var = (cs3) on3Var.mo11685a(null, uz3.f64611j);
        if (cs3Var != null) {
            pg2Var = cs3Var.f34485a;
        }
        if (on3Var.mo11686b(new qy3(25))) {
            numValueOf = null;
        } else {
            if (yaaVar.f69576i.getAndSet(true)) {
                C3386nv.m17633t("At most one view can be set as AppWidgetBackground.");
                return null;
            }
            numValueOf = Integer.valueOf(R.id.background);
        }
        int i3 = Build.VERSION.SDK_INT;
        if (i3 >= 33) {
            if (numValueOf != null) {
                iIntValue = numValueOf.intValue();
            } else {
                int iIncrementAndGet = yaaVar.f69574g.incrementAndGet();
                if (iIncrementAndGet >= pk3.f56345j) {
                    C3386nv.m17633t("There are too many views");
                    return null;
                }
                iIntValue = iIncrementAndGet + pk3.f56344i;
            }
            RemoteViews remoteViewsM2941g = AbstractC0780ao.m2941g(i, context.getPackageName(), iIntValue);
            int i4 = yaaVar.f69575h.f45111a;
            if (i3 >= 31) {
                AbstractC0780ao.m2935a(remoteViews, i4, remoteViewsM2941g, i2);
            } else {
                remoteViews.addView(i4, remoteViewsM2941g);
            }
            return new j64(iIntValue, 0, null, 6);
        }
        if (i3 >= 31) {
            jg2 jg2Var = jg2.f45515a;
            return new j64(fad.m11684g(remoteViews, yaaVar, m24656f(remoteViews, yaaVar, i2, pg2Var2.equals(jg2Var) ? LayoutSize.Expand : LayoutSize.Wrap, pg2Var.equals(jg2Var) ? LayoutSize.Expand : LayoutSize.Wrap), i, numValueOf), 0, null, 6);
        }
        LayoutSize layoutSizeM24658h = m24658h(m24655e(pg2Var2, context));
        LayoutSize layoutSizeM24658h2 = m24658h(m24655e(pg2Var, context));
        int iM24656f = m24656f(remoteViews, yaaVar, i2, layoutSizeM24658h, layoutSizeM24658h2);
        LayoutSize layoutSize = LayoutSize.Fixed;
        if (layoutSizeM24658h != layoutSize && layoutSizeM24658h2 != layoutSize) {
            return new j64(fad.m11684g(remoteViews, yaaVar, iM24656f, i, numValueOf), 0, null, 6);
        }
        gq4 gq4Var = (gq4) pk3.f56340e.get(new j99(layoutSizeM24658h, layoutSizeM24658h2));
        if (gq4Var != null) {
            return new j64(fad.m11684g(remoteViews, yaaVar, R$id.glanceViewStub, i, numValueOf), fad.m11684g(remoteViews, yaaVar, iM24656f, gq4Var.f41185a, null), null, 4);
        }
        uk9.m22776j("Could not find complex layout for width=", layoutSizeM24658h, ", height=", layoutSizeM24658h2);
        return null;
    }

    /* JADX INFO: renamed from: e */
    public static final pg2 m24655e(pg2 pg2Var, Context context) {
        if (!(pg2Var instanceof mg2)) {
            return pg2Var;
        }
        float dimension = context.getResources().getDimension(((mg2) pg2Var).f51278a);
        int i = (int) dimension;
        if (i != -2) {
            return i != -1 ? new ig2(dimension / context.getResources().getDisplayMetrics().density) : kg2.f47164a;
        }
        return og2.f54304a;
    }

    /* JADX INFO: renamed from: f */
    public static final int m24656f(RemoteViews remoteViews, yaa yaaVar, int i, LayoutSize layoutSize, LayoutSize layoutSize2) {
        LayoutSize layoutSize3 = LayoutSize.Fixed;
        j99 j99Var = new j99(layoutSize == layoutSize3 ? LayoutSize.Wrap : layoutSize, layoutSize2 == layoutSize3 ? LayoutSize.Wrap : layoutSize2);
        Map map = (Map) yaaVar.f69575h.f45113c.get(Integer.valueOf(i));
        if (map == null) {
            C3386nv.m17633t(ux5.m22988k(i, "Parent doesn't have child position "));
            return 0;
        }
        Integer num = (Integer) map.get(j99Var);
        if (num == null) {
            throw new IllegalStateException("No child for position " + i + " and size " + layoutSize + " x " + layoutSize2);
        }
        int iIntValue = num.intValue();
        Collection collectionValues = map.values();
        ArrayList arrayList = new ArrayList();
        for (Object obj : collectionValues) {
            if (((Number) obj).intValue() != iIntValue) {
                arrayList.add(obj);
            }
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            fad.m11684g(remoteViews, yaaVar, ((Number) it.next()).intValue(), R$layout.glance_deleted_view, Integer.valueOf(R$id.deletedViewId));
        }
        return iIntValue;
    }

    /* JADX INFO: renamed from: g */
    public static final Integer m24657g(LayoutType layoutType, on3 on3Var) {
        if (Build.VERSION.SDK_INT >= 33) {
            C3719we c3719we = (C3719we) on3Var.mo11685a(null, uz3.f64612k);
            m4b m4bVar = (m4b) on3Var.mo11685a(null, uz3.f64613l);
            jg2 jg2Var = jg2.f45515a;
            boolean zEquals = m4bVar != null ? m4bVar.f50591a.equals(jg2Var) : false;
            cs3 cs3Var = (cs3) on3Var.mo11685a(null, uz3.f64590H);
            boolean zEquals2 = cs3Var != null ? cs3Var.f34485a.equals(jg2Var) : false;
            if (c3719we != null) {
                C3532re c3532re = c3719we.f66675a;
                gq4 gq4Var = (gq4) pk3.f56338c.get(new nh0(layoutType, c3532re.f59148a, c3532re.f59149b));
                if (gq4Var != null) {
                    return Integer.valueOf(gq4Var.f41185a);
                }
                uk9.m22776j("Cannot find ", layoutType, " with alignment ", c3532re);
                return null;
            }
            if (zEquals || zEquals2) {
                gq4 gq4Var2 = (gq4) pk3.f56339d.get(new nj8(layoutType, zEquals, zEquals2));
                if (gq4Var2 != null) {
                    return Integer.valueOf(gq4Var2.f41185a);
                }
                ij6.m13965w("Cannot find ", layoutType, " with defaultWeight set");
                return null;
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: h */
    public static final LayoutSize m24658h(pg2 pg2Var) {
        if (pg2Var instanceof og2) {
            return LayoutSize.Wrap;
        }
        if (pg2Var instanceof jg2) {
            return LayoutSize.Expand;
        }
        if (pg2Var instanceof kg2) {
            return LayoutSize.MatchParent;
        }
        if ((pg2Var instanceof ig2) || (pg2Var instanceof mg2)) {
            return LayoutSize.Fixed;
        }
        gm5.m12750e();
        return null;
    }
}
