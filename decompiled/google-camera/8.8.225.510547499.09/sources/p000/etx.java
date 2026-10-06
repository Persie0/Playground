package p000;

import android.hardware.camera2.CaptureRequest;
import android.preference.PreferenceScreen;
import android.util.Log;
import com.google.android.libraries.camera.exif.ExifInterface;
import java.util.List;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class etx implements mrf {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ Object f19891a;

    /* JADX INFO: renamed from: b */
    private final /* synthetic */ int f19892b;

    public /* synthetic */ etx(CaptureRequest.Key key, int i) {
        this.f19892b = i;
        this.f19891a = key;
    }

    public /* synthetic */ etx(PreferenceScreen preferenceScreen, int i) {
        this.f19892b = i;
        this.f19891a = preferenceScreen;
    }

    public /* synthetic */ etx(ciw ciwVar, int i) {
        this.f19892b = i;
        this.f19891a = ciwVar;
    }

    public /* synthetic */ etx(eby ebyVar, int i) {
        this.f19892b = i;
        this.f19891a = ebyVar;
    }

    public /* synthetic */ etx(esl eslVar, int i) {
        this.f19892b = i;
        this.f19891a = eslVar;
    }

    public /* synthetic */ etx(euf eufVar, int i) {
        this.f19892b = i;
        this.f19891a = eufVar;
    }

    public /* synthetic */ etx(ghy ghyVar, int i) {
        this.f19892b = i;
        this.f19891a = ghyVar;
    }

    public /* synthetic */ etx(grm grmVar, int i) {
        this.f19892b = i;
        this.f19891a = grmVar;
    }

    public /* synthetic */ etx(gxm gxmVar, int i) {
        this.f19892b = i;
        this.f19891a = gxmVar;
    }

    public /* synthetic */ etx(hah hahVar, int i) {
        this.f19892b = i;
        this.f19891a = hahVar;
    }

    public /* synthetic */ etx(hgs hgsVar, int i) {
        this.f19892b = i;
        this.f19891a = hgsVar;
    }

    public /* synthetic */ etx(hgx hgxVar, int i) {
        this.f19892b = i;
        this.f19891a = hgxVar;
    }

    public /* synthetic */ etx(hmw hmwVar, int i) {
        this.f19892b = i;
        this.f19891a = hmwVar;
    }

    public /* synthetic */ etx(String str, int i) {
        this.f19892b = i;
        this.f19891a = str;
    }

    public /* synthetic */ etx(kcc kccVar, int i) {
        this.f19892b = i;
        this.f19891a = kccVar;
    }

    public /* synthetic */ etx(kfk kfkVar, int i) {
        this.f19892b = i;
        this.f19891a = kfkVar;
    }

    public /* synthetic */ etx(kmd kmdVar, int i) {
        this.f19892b = i;
        this.f19891a = kmdVar;
    }

    public /* synthetic */ etx(oju ojuVar, int i) {
        this.f19892b = i;
        this.f19891a = ojuVar;
    }

    /* JADX WARN: Type inference failed for: r0v11, types: [java.lang.Object, kfk] */
    /* JADX WARN: Type inference failed for: r0v18, types: [ciw, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v19, types: [java.lang.Object, kcc] */
    /* JADX WARN: Type inference failed for: r0v28, types: [hah, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v29, types: [java.lang.Object, oju] */
    /* JADX WARN: Type inference failed for: r0v34, types: [java.lang.Object, oju] */
    /* JADX WARN: Type inference failed for: r0v39, types: [java.lang.Object, kmd] */
    /* JADX WARN: Type inference failed for: r0v45, types: [java.lang.Object, kfk] */
    /* JADX WARN: Type inference failed for: r0v46, types: [java.lang.Object, kfk] */
    @Override // p000.mrf
    public final Object apply(Object obj) {
        switch (this.f19892b) {
            case 0:
                Object obj2 = this.f19891a;
                List list = (List) obj;
                list.getClass();
                lku.m15669w(list.size() == 3);
                return Boolean.valueOf((((Boolean) list.get(0)).booleanValue() || ((Boolean) list.get(1)).booleanValue() || ((Boolean) list.get(2)).booleanValue() || ((euf) obj2).f19996c.mo3831be() != gdb.ON) ? false : true);
            case 1:
                Object obj3 = this.f19891a;
                Boolean bool = (Boolean) obj;
                bool.getClass();
                if (bool.booleanValue()) {
                    ((esl) obj3).f15329K.mo3415bf(true);
                    return true;
                }
                ((esl) obj3).f15335Q.m4498j();
                return false;
            case 2:
                Object obj4 = this.f19891a;
                String str = (String) obj;
                int i = ewp.f20659c;
                ((PreferenceScreen) obj4).setSummary(str);
                return str;
            case 3:
                return this.f19891a.mo14132s((kgg) obj);
            case 4:
                Log.e((String) this.f19891a, Log.getStackTraceString((Throwable) obj));
                return flu.class;
            case 5:
                return kgq.m14215e((CaptureRequest.Key) this.f19891a, obj);
            case 6:
                drb drbVar = (drb) obj;
                grm grmVar = (grm) this.f19891a;
                hjy hjyVar = grmVar.f26155d;
                drbVar.mo6598b(null);
                if (drbVar.mo6599c()) {
                    ExifInterface exifInterface = grmVar.f26159h;
                }
                return grm.m9673c(drbVar.mo6597a(), grmVar);
            case 7:
                Boolean bool2 = (Boolean) obj;
                this.f19891a.mo3539c();
                bool2.booleanValue();
                return bool2;
            case 8:
                ?? r0 = this.f19891a;
                boolean z = true;
                for (Boolean bool3 : (List) obj) {
                    z &= bool3 != null && bool3.booleanValue();
                }
                r0.mo13952a();
                return Boolean.valueOf(z);
            case 9:
                return ((Boolean) ((eby) this.f19891a).f13316b.mo3831be()).booleanValue() ? fxg.LONG_EXPOSURE : (fxg) obj;
            case 10:
                return Boolean.valueOf(Boolean.TRUE.equals((Boolean) obj) && !((Boolean) ((hmw) this.f19891a).m10476a().mo3831be()).booleanValue());
            case 11:
                return Boolean.valueOf(Boolean.TRUE.equals((Boolean) obj) && !((Boolean) this.f19891a.mo10031c(gzy.f27036at)).booleanValue());
            case 12:
                ?? r1 = this.f19891a;
                Byte b = (Byte) obj;
                b.byteValue();
                ((jwn) r1.get()).mo3831be();
                return fxo.m8930d(kgq.m14215e(ivx.f32447j, Byte.valueOf(b.byteValue())), kgq.m14215e(ivx.f32448k, (Float) ((jwn) r1.get()).mo3831be()));
            case 13:
                return fxo.m8930d(kgq.m14215e(CaptureRequest.SCALER_CROP_REGION, ((gef) obj).f24364b), kgq.m14215e(CaptureRequest.CONTROL_ZOOM_RATIO, (Float) ((jwn) this.f19891a.get()).mo3831be()));
            case 14:
                gzk gzkVar = (gzk) obj;
                float f = 0.0f;
                if (this.f19891a.mo14558k() == kmq.f36557a) {
                    gzk gzkVar2 = gzk.ON;
                    switch (gzkVar.ordinal()) {
                        case 1:
                        case 2:
                            f = 2.0f;
                            break;
                        case 3:
                            f = 1.0f;
                            break;
                    }
                } else {
                    gzk gzkVar3 = gzk.ON;
                    switch (gzkVar.ordinal()) {
                        case 2:
                            f = 0.833f;
                            break;
                    }
                }
                return Float.valueOf(f);
            case 15:
                return ((ghy) this.f19891a).m9263b((hsg) obj);
            case 16:
                return this.f19891a.mo14133t(mxk.m17136H((kgg) obj));
            case 17:
                return this.f19891a.mo14133t(mxk.m17136H((kgg) obj));
            case 18:
                return ((gxm) this.f19891a).f26725a;
            case 19:
                mws mwsVar = (mws) obj;
                hgs hgsVar = (hgs) this.f19891a;
                hgsVar.f27741l = mwsVar;
                hgsVar.f27735f.mo10271h(mwsVar);
                hgsVar.f27735f.mo10268e(mwsVar);
                return mwsVar;
            default:
                mws mwsVar2 = (mws) obj;
                hgx hgxVar = (hgx) this.f19891a;
                hgxVar.f27767l = mwsVar2;
                hgxVar.f27761f.mo10271h(mwsVar2);
                hgxVar.f27761f.mo10268e(mwsVar2);
                return mwsVar2;
        }
    }
}
