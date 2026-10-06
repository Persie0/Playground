package p000;

import android.graphics.PointF;
import android.graphics.RectF;
import android.hardware.camera2.params.Face;
import com.google.android.apps.camera.faceobfuscation.api.FaceToObfuscate;
import java.io.IOException;
import java.util.Map;
import java.util.function.Function;
import p021j$.time.temporal.ChronoUnit;
import p021j$.util.Optional;
import p021j$.util.function.Function$CC;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class cqk implements Function {

    /* JADX INFO: renamed from: v */
    private final /* synthetic */ int f8935v;

    /* JADX INFO: renamed from: u */
    public static final /* synthetic */ cqk f8934u = new cqk(20);

    /* JADX INFO: renamed from: t */
    public static final /* synthetic */ cqk f8933t = new cqk(19);

    /* JADX INFO: renamed from: s */
    public static final /* synthetic */ cqk f8932s = new cqk(18);

    /* JADX INFO: renamed from: r */
    public static final /* synthetic */ cqk f8931r = new cqk(17);

    /* JADX INFO: renamed from: q */
    public static final /* synthetic */ cqk f8930q = new cqk(16);

    /* JADX INFO: renamed from: p */
    public static final /* synthetic */ cqk f8929p = new cqk(15);

    /* JADX INFO: renamed from: o */
    public static final /* synthetic */ cqk f8928o = new cqk(14);

    /* JADX INFO: renamed from: n */
    public static final /* synthetic */ cqk f8927n = new cqk(13);

    /* JADX INFO: renamed from: m */
    public static final /* synthetic */ cqk f8926m = new cqk(12);

    /* JADX INFO: renamed from: l */
    public static final /* synthetic */ cqk f8925l = new cqk(11);

    /* JADX INFO: renamed from: k */
    public static final /* synthetic */ cqk f8924k = new cqk(10);

    /* JADX INFO: renamed from: j */
    public static final /* synthetic */ cqk f8923j = new cqk(9);

    /* JADX INFO: renamed from: i */
    public static final /* synthetic */ cqk f8922i = new cqk(8);

    /* JADX INFO: renamed from: h */
    public static final /* synthetic */ cqk f8921h = new cqk(7);

    /* JADX INFO: renamed from: g */
    public static final /* synthetic */ cqk f8920g = new cqk(6);

    /* JADX INFO: renamed from: f */
    public static final /* synthetic */ cqk f8919f = new cqk(5);

    /* JADX INFO: renamed from: e */
    public static final /* synthetic */ cqk f8918e = new cqk(4);

    /* JADX INFO: renamed from: d */
    public static final /* synthetic */ cqk f8917d = new cqk(3);

    /* JADX INFO: renamed from: c */
    public static final /* synthetic */ cqk f8916c = new cqk(2);

    /* JADX INFO: renamed from: b */
    public static final /* synthetic */ cqk f8915b = new cqk(1);

    /* JADX INFO: renamed from: a */
    public static final /* synthetic */ cqk f8914a = new cqk(0);

    private /* synthetic */ cqk(int i) {
        this.f8935v = i;
    }

    public final /* synthetic */ Function andThen(Function function) {
        switch (this.f8935v) {
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
            case 18:
                break;
            case 19:
                break;
        }
        return Function$CC.$default$andThen(this, function);
    }

    public final /* synthetic */ Function compose(Function function) {
        switch (this.f8935v) {
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
            case 18:
                break;
            case 19:
                break;
        }
        return Function$CC.$default$compose(this, function);
    }

    @Override // java.util.function.Function
    public final Object apply(Object obj) {
        ikw ikwVar = null;
        switch (this.f8935v) {
            case 0:
                return gzr.m10021b((jxp) obj);
            case 1:
                return kcl.m13980b((kmh) obj);
            case 2:
                return (gzr) ((mrm) obj).mo16809c();
            case 3:
                return ((ipk) obj).mo3652a();
            case 4:
                return ((ctg) obj).f9423a;
            case 5:
                return dal.m5827p((gzm) obj);
            case 6:
                return ddr.m5952l((kmq) obj);
            case 7:
                return (Long) ((Map.Entry) obj).getKey();
            case 8:
                return ((gsu) obj).f26286a;
            case 9:
                String str = (String) obj;
                String str2 = dht.f11173a;
                try {
                    int i = Integer.parseInt(str);
                    for (ikw ikwVar2 : ikw.values()) {
                        if (ikwVar2.f31412u == i) {
                            ikwVar = ikwVar2;
                            return Optional.ofNullable(ikwVar);
                        }
                    }
                    return Optional.ofNullable(ikwVar);
                } catch (NumberFormatException e) {
                    return Optional.empty();
                }
            case 10:
                return (ikw) ((Optional) obj).get();
            case 11:
                chp chpVar = (chp) obj;
                return chpVar.mo3733b().mo3747g().toEpochMilli() != -1 ? chpVar.mo3733b().mo3747g().truncatedTo(ChronoUnit.SECONDS) : chpVar.mo3733b().mo3748h();
            case 12:
                return Long.valueOf(((chp) obj).mo3733b().mo3742b());
            case 13:
                Face face = (Face) obj;
                dss dssVarM4118c = FaceToObfuscate.m4118c(face.getId(), new RectF(face.getBounds()));
                dssVarM4118c.m6665c(face.getScore() / 100.0f);
                dssVarM4118c.f12509c = face.getLeftEyePosition() == null ? null : new PointF(face.getLeftEyePosition());
                dssVarM4118c.f12510d = face.getRightEyePosition() != null ? new PointF(face.getRightEyePosition()) : null;
                dssVarM4118c.m6664b(Float.MAX_VALUE);
                return dssVarM4118c.m6663a();
            case 14:
                kpm kpmVar = (kpm) obj;
                kpe kpeVar = kpmVar.f36801a;
                dss dssVarM4118c2 = FaceToObfuscate.m4118c(kpeVar.f36795a, new RectF(kpeVar.f36797c));
                dssVarM4118c2.m6665c(kpmVar.f36801a.f36796b / 100.0f);
                dssVarM4118c2.f12509c = kpmVar.m14673a((byte) 1);
                dssVarM4118c2.f12510d = kpmVar.m14673a((byte) 2);
                dssVarM4118c2.m6664b(kpmVar.f36804d);
                return dssVarM4118c2.m6663a();
            case 15:
                return Integer.valueOf((int) ((dyk) obj).f12918a);
            case 16:
                return dic.values()[((Integer) obj).intValue()];
            case 17:
                switch (dic.values()[((Integer) obj).intValue()].ordinal()) {
                    case 1:
                    case 2:
                    case 3:
                        return true;
                    default:
                        return false;
                }
            case 18:
                return "present";
            case 19:
                return "present";
            default:
                byte[] bArr = (byte[]) obj;
                try {
                    nxq nxqVarM18123Q = nxq.m18123Q(mqn.f41433b, bArr, 0, bArr.length, nxf.m18011a());
                    nxq.m18132ae(nxqVarM18123Q);
                    return ((mqn) nxqVarM18123Q).f41435a;
                } catch (IOException e2) {
                    ((nbe) ((nbe) ((nbe) egf.f13912a.m17252c()).mo17283h(e2)).mo17276G((char) 1433)).mo17290o("Error Parsing RESULT_AF_MULTI_DEPTH_FACE_DEBLUR.");
                    return false;
                }
        }
    }
}
