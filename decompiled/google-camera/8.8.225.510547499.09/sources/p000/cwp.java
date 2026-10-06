package p000;

import android.content.Context;
import android.content.pm.ResolveInfo;
import android.database.Cursor;
import android.graphics.PointF;
import android.graphics.Rect;
import android.graphics.RectF;
import android.hardware.camera2.CaptureResult;
import android.view.View;
import com.google.android.apps.camera.faceobfuscation.api.FaceToObfuscate;
import com.google.android.apps.camera.zoomui.view.ZoomSliderView;
import java.util.function.Function;
import p021j$.util.function.Function$CC;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class cwp implements Function {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ Object f9885a;

    /* JADX INFO: renamed from: b */
    private final /* synthetic */ int f9886b;

    public /* synthetic */ cwp(Rect rect, int i) {
        this.f9886b = i;
        this.f9885a = rect;
    }

    public /* synthetic */ cwp(ckp ckpVar, int i) {
        this.f9886b = i;
        this.f9885a = ckpVar;
    }

    public /* synthetic */ cwp(ZoomSliderView zoomSliderView, int i) {
        this.f9886b = i;
        this.f9885a = zoomSliderView;
    }

    public /* synthetic */ cwp(cvy cvyVar, int i, byte[] bArr, byte[] bArr2) {
        this.f9886b = i;
        this.f9885a = cvyVar;
    }

    public /* synthetic */ cwp(cwo cwoVar, int i) {
        this.f9886b = i;
        this.f9885a = cwoVar;
    }

    public /* synthetic */ cwp(cwq cwqVar, int i) {
        this.f9886b = i;
        this.f9885a = cwqVar;
    }

    public /* synthetic */ cwp(dbr dbrVar, int i) {
        this.f9886b = i;
        this.f9885a = dbrVar;
    }

    public /* synthetic */ cwp(dkc dkcVar, int i) {
        this.f9886b = i;
        this.f9885a = dkcVar;
    }

    public /* synthetic */ cwp(dkg dkgVar, int i) {
        this.f9886b = i;
        this.f9885a = dkgVar;
    }

    public /* synthetic */ cwp(ewk ewkVar, int i) {
        this.f9886b = i;
        this.f9885a = ewkVar;
    }

    public /* synthetic */ cwp(geo geoVar, int i) {
        this.f9886b = i;
        this.f9885a = geoVar;
    }

    public /* synthetic */ cwp(gfc gfcVar, int i) {
        this.f9886b = i;
        this.f9885a = gfcVar;
    }

    public /* synthetic */ cwp(gva gvaVar, int i, byte[] bArr) {
        this.f9886b = i;
        this.f9885a = gvaVar;
    }

    public /* synthetic */ cwp(hgs hgsVar, int i) {
        this.f9886b = i;
        this.f9885a = hgsVar;
    }

    public /* synthetic */ cwp(hgx hgxVar, int i) {
        this.f9886b = i;
        this.f9885a = hgxVar;
    }

    public /* synthetic */ cwp(kpp kppVar, int i) {
        this.f9886b = i;
        this.f9885a = kppVar;
    }

    public final /* synthetic */ Function andThen(Function function) {
        switch (this.f9886b) {
            case 0:
                break;
            case 1:
                break;
            case 2:
                break;
            case 3:
                break;
            case 4:
                break;
            case 5:
                break;
            case 6:
                break;
            case 7:
                break;
            case 8:
                break;
            case 9:
                break;
            case 10:
                break;
            case 11:
                break;
            case 12:
                break;
            case 13:
                break;
            case 14:
                break;
            case 15:
                break;
            case 16:
                break;
            case 17:
                break;
        }
        return Function$CC.$default$andThen(this, function);
    }

    public final /* synthetic */ Function compose(Function function) {
        switch (this.f9886b) {
            case 0:
                break;
            case 1:
                break;
            case 2:
                break;
            case 3:
                break;
            case 4:
                break;
            case 5:
                break;
            case 6:
                break;
            case 7:
                break;
            case 8:
                break;
            case 9:
                break;
            case 10:
                break;
            case 11:
                break;
            case 12:
                break;
            case 13:
                break;
            case 14:
                break;
            case 15:
                break;
            case 16:
                break;
            case 17:
                break;
        }
        return Function$CC.$default$compose(this, function);
    }

    /* JADX WARN: Type inference failed for: r0v24, types: [java.lang.Object, kpl] */
    /* JADX WARN: Type inference failed for: r0v25, types: [java.lang.Object, kpl] */
    /* JADX WARN: Type inference failed for: r0v26, types: [java.lang.Object, kpl] */
    /* JADX WARN: Type inference failed for: r8v36, types: [java.lang.Object, ohb] */
    @Override // java.util.function.Function
    public final Object apply(Object obj) {
        switch (this.f9886b) {
            case 0:
                return ((cwq) this.f9885a).m5687d((Integer) obj);
            case 1:
                return ((cwo) this.f9885a).m5686d((Integer) obj);
            case 2:
                return ((dch) obj).mo4489a((kmq) ((jwf) ((dbr) this.f9885a).f10419b).f34942d);
            case 3:
                return ((dkc) this.f9885a).m6287b((Cursor) obj).m6276a();
            case 4:
                return ((dkc) this.f9885a).m6287b((Cursor) obj).m6276a();
            case 5:
                dkg dkgVar = (dkg) this.f9885a;
                return new dkf(dkgVar.f11885c, dkgVar.f11886d, (dkb) obj, dkgVar.f11890h, gyx.MEDIA_STORE);
            case 6:
                cvy cvyVar = (cvy) this.f9885a;
                return new dkh((Context) cvyVar.f9845b, (djy) cvyVar.f9846c, (dkb) obj, gyx.MEDIA_STORE);
            case 7:
                Object obj2 = this.f9885a;
                FaceToObfuscate faceToObfuscate = (FaceToObfuscate) obj;
                int iMo4120b = faceToObfuscate.mo4120b();
                RectF rectFBounds = faceToObfuscate.bounds();
                Rect rect = (Rect) obj2;
                PointF pointFM7078d = ebr.m7078d(new PointF(rectFBounds.left, rectFBounds.top), rect);
                PointF pointFM7078d2 = ebr.m7078d(new PointF(rectFBounds.right, rectFBounds.bottom), rect);
                pointFM7078d.getClass();
                pointFM7078d2.getClass();
                dss dssVarM4118c = FaceToObfuscate.m4118c(iMo4120b, new RectF(pointFM7078d.x, pointFM7078d.y, pointFM7078d2.x, pointFM7078d2.y));
                dssVarM4118c.m6665c(faceToObfuscate.mo4119a());
                dssVarM4118c.f12509c = ebr.m7078d(faceToObfuscate.leftEye(), rect);
                dssVarM4118c.f12510d = ebr.m7078d(faceToObfuscate.rightEye(), rect);
                dssVarM4118c.m6664b(faceToObfuscate.faceRoll());
                return dssVarM4118c.m6663a();
            case 8:
                return (Boolean) this.f9885a.mo9517d((CaptureResult.Key) obj);
            case 9:
                return (Integer) this.f9885a.mo9517d((CaptureResult.Key) obj);
            case 10:
                return (byte[]) this.f9885a.mo9517d((CaptureResult.Key) obj);
            case 11:
                return new dlr(((ckp) this.f9885a).m3841a((hjk) obj), 5);
            case 12:
                return Boolean.valueOf(((hml) ((ewk) this.f9885a).f20643e.get()).m10460a());
            case 13:
                return Boolean.valueOf(((hml) ((gva) this.f9885a).f26476g.get()).m10460a());
            case 14:
                return gew.m9151b((gfb) obj, ((geo) this.f9885a).f24405i.getResources());
            case 15:
                return mrm.m16828h((View) ((ggg) obj).f24654b.get(this.f9885a));
            case 16:
                ResolveInfo resolveInfo = (ResolveInfo) obj;
                return mrn.m16830a(resolveInfo.activityInfo.applicationInfo.loadLabel(((hgs) this.f9885a).f27740k).toString(), resolveInfo);
            case 17:
                ResolveInfo resolveInfo2 = (ResolveInfo) obj;
                return mrn.m16830a(resolveInfo2.activityInfo.applicationInfo.loadLabel(((hgx) this.f9885a).f27766k).toString(), resolveInfo2);
            default:
                ZoomSliderView zoomSliderView = (ZoomSliderView) this.f9885a;
                double dLog = Math.log(((Float) obj).floatValue() / zoomSliderView.f7383e) / Math.log(zoomSliderView.f7384f / zoomSliderView.f7383e);
                double dM4537f = zoomSliderView.m4537f();
                Double.isNaN(dM4537f);
                return Integer.valueOf(Math.round((float) (dLog * dM4537f)) + 1);
        }
    }
}
