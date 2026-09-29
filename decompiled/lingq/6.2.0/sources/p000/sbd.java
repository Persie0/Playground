package p000;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import androidx.glance.AbstractC0640a;
import androidx.glance.appwidget.proto.LayoutProto$ContentScale;
import androidx.glance.appwidget.proto.LayoutProto$DimensionType;
import androidx.glance.appwidget.proto.LayoutProto$HorizontalAlignment;
import androidx.glance.appwidget.proto.LayoutProto$LayoutType;
import androidx.glance.appwidget.proto.LayoutProto$NodeIdentity;
import androidx.glance.appwidget.proto.LayoutProto$VerticalAlignment;
import coil.size.Scale;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: classes2.dex */
public abstract class sbd {
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0053, code lost:
    
        if (p000.AbstractC3122is.m14098l(r9, r1, p000.fa4.m11650l(r7, r2) ? r0.getWidth() : p000.AbstractC3057h.m12990e(r7.f66531a, r8), p000.fa4.m11650l(r7, r2) ? r0.getHeight() : p000.AbstractC3057h.m12990e(r7.f66532b, r8), r8) == 1.0d) goto L24;
     */
    /* JADX INFO: renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static Bitmap m21208a(Drawable drawable, Bitmap.Config config, w89 w89Var, Scale scale, boolean z) {
        Bitmap bitmap;
        Bitmap bitmap2;
        if (drawable instanceof BitmapDrawable) {
            Bitmap bitmap3 = ((BitmapDrawable) drawable).getBitmap();
            if (bitmap3.getConfig() == ((config == null || config == Bitmap.Config.HARDWARE) ? Bitmap.Config.ARGB_8888 : config)) {
                if (!z) {
                    int width = bitmap3.getWidth();
                    int height = bitmap3.getHeight();
                    w89 w89Var2 = w89.f66530c;
                }
                return bitmap3;
            }
        }
        Drawable drawableMutate = drawable.mutate();
        Bitmap.Config[] configArr = AbstractC3057h.f41581a;
        boolean z2 = drawableMutate instanceof BitmapDrawable;
        BitmapDrawable bitmapDrawable = z2 ? (BitmapDrawable) drawableMutate : null;
        int intrinsicWidth = (bitmapDrawable == null || (bitmap2 = bitmapDrawable.getBitmap()) == null) ? drawableMutate.getIntrinsicWidth() : bitmap2.getWidth();
        if (intrinsicWidth <= 0) {
            intrinsicWidth = 512;
        }
        BitmapDrawable bitmapDrawable2 = z2 ? (BitmapDrawable) drawableMutate : null;
        int intrinsicHeight = (bitmapDrawable2 == null || (bitmap = bitmapDrawable2.getBitmap()) == null) ? drawableMutate.getIntrinsicHeight() : bitmap.getHeight();
        int i = intrinsicHeight > 0 ? intrinsicHeight : 512;
        w89 w89Var3 = w89.f66530c;
        double dM14098l = AbstractC3122is.m14098l(intrinsicWidth, i, fa4.m11650l(w89Var, w89Var3) ? intrinsicWidth : AbstractC3057h.m12990e(w89Var.f66531a, scale), fa4.m11650l(w89Var, w89Var3) ? i : AbstractC3057h.m12990e(w89Var.f66532b, scale), scale);
        int iM21692S = ss5.m21692S(((double) intrinsicWidth) * dM14098l);
        int iM21692S2 = ss5.m21692S(dM14098l * ((double) i));
        if (config == null || config == Bitmap.Config.HARDWARE) {
            config = Bitmap.Config.ARGB_8888;
        }
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(iM21692S, iM21692S2, config);
        Rect bounds = drawableMutate.getBounds();
        int i2 = bounds.left;
        int i3 = bounds.top;
        int i4 = bounds.right;
        int i5 = bounds.bottom;
        drawableMutate.setBounds(0, 0, iM21692S, iM21692S2);
        drawableMutate.draw(new Canvas(bitmapCreateBitmap));
        drawableMutate.setBounds(i2, i3, i4, i5);
        return bitmapCreateBitmap;
    }

    /* JADX INFO: renamed from: b */
    public static final vr4 m21209b(Context context, vp2 vp2Var) {
        LayoutProto$LayoutType layoutProto$LayoutType;
        LayoutProto$ContentScale layoutProto$ContentScale;
        ur4 ur4VarM23516A = vr4.m23516A();
        if (vp2Var instanceof wp2) {
            layoutProto$LayoutType = LayoutProto$LayoutType.BOX;
        } else if (vp2Var instanceof fq2) {
            layoutProto$LayoutType = gic.m12673a(((fq2) vp2Var).f39450d) ? LayoutProto$LayoutType.RADIO_ROW : LayoutProto$LayoutType.ROW;
        } else if (vp2Var instanceof xp2) {
            layoutProto$LayoutType = gic.m12673a(((xp2) vp2Var).f68480d) ? LayoutProto$LayoutType.RADIO_COLUMN : LayoutProto$LayoutType.COLUMN;
        } else if (vp2Var instanceof iq2) {
            layoutProto$LayoutType = LayoutProto$LayoutType.TEXT;
        } else if (vp2Var instanceof cq2) {
            layoutProto$LayoutType = LayoutProto$LayoutType.LIST_ITEM;
        } else if (vp2Var instanceof aq2) {
            layoutProto$LayoutType = LayoutProto$LayoutType.LAZY_COLUMN;
        } else if (vp2Var instanceof hq2) {
            layoutProto$LayoutType = LayoutProto$LayoutType.SPACER;
        } else if (vp2Var instanceof zp2) {
            layoutProto$LayoutType = LayoutProto$LayoutType.IMAGE;
        } else if (vp2Var instanceof dq2) {
            layoutProto$LayoutType = LayoutProto$LayoutType.LAZY_VERTICAL_GRID;
        } else if (vp2Var instanceof eq2) {
            layoutProto$LayoutType = LayoutProto$LayoutType.LIST_ITEM;
        } else if (vp2Var instanceof w58) {
            layoutProto$LayoutType = LayoutProto$LayoutType.REMOTE_VIEWS_ROOT;
        } else {
            if (!(vp2Var instanceof gq2)) {
                C3386nv.m17625k(vp2Var.getClass().getCanonicalName(), "Unknown element type ");
                return null;
            }
            layoutProto$LayoutType = LayoutProto$LayoutType.SIZE_BOX;
        }
        ur4VarM23516A.m23361c();
        vr4.m23517n((vr4) ur4VarM23516A.f65532b, layoutProto$LayoutType);
        m4b m4bVar = (m4b) vp2Var.mo2977a().mo11685a(null, uz3.f64601S);
        pg2 pg2Var = og2.f54304a;
        LayoutProto$DimensionType layoutProto$DimensionTypeM21210c = m21210c(m4bVar != null ? m4bVar.f50591a : pg2Var, context);
        ur4VarM23516A.m23361c();
        vr4.m23518o((vr4) ur4VarM23516A.f65532b, layoutProto$DimensionTypeM21210c);
        cs3 cs3Var = (cs3) vp2Var.mo2977a().mo11685a(null, uz3.f64602T);
        if (cs3Var != null) {
            pg2Var = cs3Var.f34485a;
        }
        LayoutProto$DimensionType layoutProto$DimensionTypeM21210c2 = m21210c(pg2Var, context);
        ur4VarM23516A.m23361c();
        vr4.m23519p((vr4) ur4VarM23516A.f65532b, layoutProto$DimensionTypeM21210c2);
        boolean z = vp2Var.mo2977a().mo11685a(null, uz3.f64599Q) != null;
        ur4VarM23516A.m23361c();
        vr4.m23524u((vr4) ur4VarM23516A.f65532b, z);
        if (vp2Var.mo2977a().mo11685a(null, uz3.f64600R) != null) {
            LayoutProto$NodeIdentity layoutProto$NodeIdentity = LayoutProto$NodeIdentity.BACKGROUND_NODE;
            ur4VarM23516A.m23361c();
            vr4.m23523t((vr4) ur4VarM23516A.f65532b, layoutProto$NodeIdentity);
        }
        if (vp2Var instanceof zp2) {
            zp2 zp2Var = (zp2) vp2Var;
            int i = zp2Var.f71935e;
            if (i == 1) {
                layoutProto$ContentScale = LayoutProto$ContentScale.FIT;
            } else if (i == 0) {
                layoutProto$ContentScale = LayoutProto$ContentScale.CROP;
            } else {
                if (i != 2) {
                    ij6.m13967y(il1.m14010a(zp2Var.f71935e), "Unknown content scale ");
                    return null;
                }
                layoutProto$ContentScale = LayoutProto$ContentScale.FILL_BOUNDS;
            }
            ur4VarM23516A.m23361c();
            vr4.m23522s((vr4) ur4VarM23516A.f65532b, layoutProto$ContentScale);
            boolean z2 = !AbstractC0640a.m2212c(zp2Var);
            ur4VarM23516A.m23361c();
            vr4.m23526w((vr4) ur4VarM23516A.f65532b, z2);
            boolean z3 = zp2Var.f71933c != null;
            ur4VarM23516A.m23361c();
            vr4.m23527x((vr4) ur4VarM23516A.f65532b, z3);
            boolean z4 = zp2Var.f71934d != null;
            ur4VarM23516A.m23361c();
            vr4.m23528y((vr4) ur4VarM23516A.f65532b, z4);
        } else if (vp2Var instanceof xp2) {
            LayoutProto$HorizontalAlignment layoutProto$HorizontalAlignmentM21212e = m21212e(((xp2) vp2Var).f68482f);
            ur4VarM23516A.m23361c();
            vr4.m23520q((vr4) ur4VarM23516A.f65532b, layoutProto$HorizontalAlignmentM21212e);
        } else if (vp2Var instanceof fq2) {
            LayoutProto$VerticalAlignment layoutProto$VerticalAlignmentM21211d = m21211d(((fq2) vp2Var).f39452f);
            ur4VarM23516A.m23361c();
            vr4.m23521r((vr4) ur4VarM23516A.f65532b, layoutProto$VerticalAlignmentM21211d);
        } else if (vp2Var instanceof wp2) {
            wp2 wp2Var = (wp2) vp2Var;
            LayoutProto$HorizontalAlignment layoutProto$HorizontalAlignmentM21212e2 = m21212e(wp2Var.f67150e.f59148a);
            ur4VarM23516A.m23361c();
            vr4.m23520q((vr4) ur4VarM23516A.f65532b, layoutProto$HorizontalAlignmentM21212e2);
            LayoutProto$VerticalAlignment layoutProto$VerticalAlignmentM21211d2 = m21211d(wp2Var.f67150e.f59149b);
            ur4VarM23516A.m23361c();
            vr4.m23521r((vr4) ur4VarM23516A.f65532b, layoutProto$VerticalAlignmentM21211d2);
        } else if (vp2Var instanceof aq2) {
            LayoutProto$HorizontalAlignment layoutProto$HorizontalAlignmentM21212e3 = m21212e(((aq2) vp2Var).f7357e);
            ur4VarM23516A.m23361c();
            vr4.m23520q((vr4) ur4VarM23516A.f65532b, layoutProto$HorizontalAlignmentM21212e3);
        }
        if ((vp2Var instanceof jq2) && !(vp2Var instanceof aq2)) {
            ArrayList arrayList = ((jq2) vp2Var).f45997c;
            ArrayList arrayList2 = new ArrayList(v91.m23189q0(arrayList, 10));
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                arrayList2.add(m21209b(context, (vp2) it.next()));
            }
            ur4VarM23516A.m23361c();
            vr4.m23525v((vr4) ur4VarM23516A.f65532b, arrayList2);
        }
        return (vr4) ur4VarM23516A.m23359a();
    }

    /* JADX INFO: renamed from: c */
    public static final LayoutProto$DimensionType m21210c(pg2 pg2Var, Context context) {
        if (Build.VERSION.SDK_INT >= 31) {
            return pg2Var instanceof jg2 ? LayoutProto$DimensionType.EXPAND : LayoutProto$DimensionType.WRAP;
        }
        pg2 pg2VarM24655e = xr4.m24655e(pg2Var, context);
        if (pg2VarM24655e instanceof ig2) {
            return LayoutProto$DimensionType.EXACT;
        }
        if (pg2VarM24655e instanceof og2) {
            return LayoutProto$DimensionType.WRAP;
        }
        if (pg2VarM24655e instanceof kg2) {
            return LayoutProto$DimensionType.FILL;
        }
        if (pg2VarM24655e instanceof jg2) {
            return LayoutProto$DimensionType.EXPAND;
        }
        C3386nv.m17633t("After resolution, no other type should be present");
        return null;
    }

    /* JADX INFO: renamed from: d */
    public static final LayoutProto$VerticalAlignment m21211d(int i) {
        if (i == 0) {
            return LayoutProto$VerticalAlignment.TOP;
        }
        if (i == 1) {
            return LayoutProto$VerticalAlignment.CENTER_VERTICALLY;
        }
        if (i == 2) {
            return LayoutProto$VerticalAlignment.BOTTOM;
        }
        ij6.m13967y(C3494qe.m19887b(i), "unknown vertical alignment ");
        return null;
    }

    /* JADX INFO: renamed from: e */
    public static final LayoutProto$HorizontalAlignment m21212e(int i) {
        if (i == 0) {
            return LayoutProto$HorizontalAlignment.START;
        }
        if (i == 1) {
            return LayoutProto$HorizontalAlignment.CENTER_HORIZONTALLY;
        }
        if (i == 2) {
            return LayoutProto$HorizontalAlignment.END;
        }
        ij6.m13967y(C3406oe.m17945b(i), "unknown horizontal alignment ");
        return null;
    }
}
