package p000;

import android.graphics.Canvas;
import android.graphics.Point;
import android.graphics.PointF;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import com.google.googlex.gcam.FloatVector;
import com.google.googlex.gcam.GcamModuleJNI;
import com.google.googlex.gcam.MeshWarp;
import com.google.googlex.gcam.PixelRect;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class dxu {
    /* JADX INFO: renamed from: a */
    public static final void m6865a(Canvas canvas, Drawable drawable, boolean z, float f, float f2, int i) {
        int width = canvas.getWidth();
        canvas.save();
        float f3 = width;
        float f4 = (f3 - f) / 2.0f;
        canvas.translate(f4, f4);
        float f5 = f / f3;
        canvas.scale(f5, f5);
        if (f2 > 0.0f) {
            if (z) {
                GradientDrawable gradientDrawable = (GradientDrawable) drawable;
                int i2 = (int) (f2 * (1.0f - f5));
                if (i2 < 3) {
                    i2 = 3;
                }
                gradientDrawable.setStroke(i2, i);
            } else {
                ((GradientDrawable) drawable).setStroke((int) f2, i);
            }
        }
        drawable.draw(canvas);
        canvas.restore();
    }

    /* JADX INFO: renamed from: b */
    public static dvl m6866b(dtj dtjVar) {
        return new dvl(dtjVar);
    }

    /* JADX INFO: renamed from: c */
    public static dug m6867c(final gvh gvhVar, final dvg dvgVar, dth dthVar) {
        duc ducVarM6756b = duh.m6756b(dvgVar);
        ducVarM6756b.f12580c = dthVar;
        ducVarM6756b.m6752d(new duf() { // from class: duj
            @Override // p000.duf
            /* JADX INFO: renamed from: a */
            public final void mo6754a(long j, kpp kppVar) {
                dvgVar.m6774g(j, gvhVar.mo9790a(kppVar));
            }
        });
        return ducVarM6756b.m6749a();
    }

    /* JADX INFO: renamed from: d */
    public static Point m6868d(Point point, kzi kziVar, Rect rect) {
        int iHeight;
        float fM15089b = kziVar.m15089b() / kziVar.m15088a();
        float fWidth = rect.width() / rect.height();
        int iWidth = 0;
        int iWidth2 = rect.width();
        int iHeight2 = rect.height();
        if (fM15089b < fWidth) {
            iWidth2 = (int) (rect.height() * fM15089b);
            iWidth = (int) ((rect.width() - iWidth2) * 0.5f);
            iHeight = 0;
        } else {
            iHeight2 = (int) (rect.width() / fM15089b);
            iHeight = (int) ((rect.height() - iHeight2) * 0.5f);
        }
        return new Point((((point.x - rect.left) - iWidth) * kziVar.m15089b()) / iWidth2, (((point.y - rect.top) - iHeight) * kziVar.m15088a()) / iHeight2);
    }

    /* JADX INFO: renamed from: e */
    public static Point m6869e(Point point, MeshWarp meshWarp) {
        if (meshWarp.m5044a() == 0 || meshWarp.m5045b() == 0) {
            return point;
        }
        if (!meshWarp.m5048e()) {
            throw new IllegalArgumentException("Required forward mesh");
        }
        int iM5044a = meshWarp.m5044a();
        int iM5045b = meshWarp.m5045b();
        long jMeshWarp_mesh_warp_crop_region_get = GcamModuleJNI.MeshWarp_mesh_warp_crop_region_get(meshWarp.f8318a, meshWarp);
        PixelRect pixelRect = jMeshWarp_mesh_warp_crop_region_get == 0 ? null : new PixelRect(jMeshWarp_mesh_warp_crop_region_get, false);
        FloatVector floatVectorM5046c = meshWarp.m5046c();
        PointF pointF = new PointF((point.x - pixelRect.m5063a()) / pixelRect.m5066d(), (point.y - pixelRect.m5064b()) / pixelRect.m5065c());
        float fMin = Math.min(Math.max(pointF.x * iM5044a, 0.0f), iM5044a - 1);
        float fMin2 = Math.min(Math.max(pointF.y * iM5045b, 0.0f), iM5045b - 1);
        double d = fMin;
        int iFloor = (int) Math.floor(d);
        int iCeil = (int) Math.ceil(d);
        double d2 = fMin2;
        int iFloor2 = (int) Math.floor(d2);
        int iCeil2 = (int) Math.ceil(d2);
        int i = iFloor2 * iM5044a;
        int i2 = i + iFloor;
        int i3 = i2 + i2;
        Point point2 = new Point(i3, i3 + 1);
        int i4 = i + iCeil;
        int i5 = i4 + i4;
        Point point3 = new Point(i5, i5 + 1);
        int i6 = iCeil2 * iM5044a;
        int i7 = i6 + iFloor;
        int i8 = i7 + i7;
        Point point4 = new Point(i8, i8 + 1);
        int i9 = i6 + iCeil;
        int i10 = i9 + i9;
        Point point5 = new Point(i10, i10 + 1);
        PointF pointF2 = new PointF(floatVectorM5046c.m4948a(point2.x), floatVectorM5046c.m4948a(point2.y));
        PointF pointF3 = new PointF(floatVectorM5046c.m4948a(point3.x), floatVectorM5046c.m4948a(point3.y));
        PointF pointF4 = new PointF(floatVectorM5046c.m4948a(point4.x), floatVectorM5046c.m4948a(point4.y));
        PointF pointF5 = new PointF(floatVectorM5046c.m4948a(point5.x), floatVectorM5046c.m4948a(point5.y));
        float f = fMin - iFloor;
        float f2 = fMin2 - iFloor2;
        float f3 = 1.0f - f;
        float f4 = 1.0f - f2;
        return new Point((int) ((f2 * ((pointF5.x * f) + (pointF4.x * f3))) + (f4 * ((pointF3.x * f) + (pointF2.x * f3)))), (int) ((f * ((pointF5.y * f2) + (pointF3.y * f4))) + (f3 * ((pointF4.y * f2) + (pointF2.y * f4)))));
    }

    /* JADX INFO: renamed from: g */
    public static boolean m6871g(dsx dsxVar, lqc lqcVar) {
        return dsxVar.m6692g() && lqcVar.f38949a;
    }

    /* JADX INFO: renamed from: h */
    public static void m6872h(dsx dsxVar, dhv dhvVar, lqc lqcVar) {
        if (m6871g(dsxVar, lqcVar)) {
            return;
        }
        dhw dhwVar = dir.f11704a;
        dhvVar.mo6176d();
    }
}
