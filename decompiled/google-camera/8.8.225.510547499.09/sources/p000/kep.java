package p000;

import android.hardware.camera2.CaptureResult;
import android.location.Location;
import android.os.Build;
import android.util.Log;
import com.google.android.libraries.camera.exif.ExifInterface;
import java.io.IOException;
import java.util.ArrayList;
import java.util.TimeZone;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class kep {

    /* JADX INFO: renamed from: b */
    private static final double f35781b = Math.log(2.0d);

    /* JADX INFO: renamed from: c */
    private static final Long f35782c = 1000L;

    /* JADX INFO: renamed from: a */
    public final ExifInterface f35783a;

    public kep(ExifInterface exifInterface) {
        this.f35783a = exifInterface;
    }

    /* JADX INFO: renamed from: a */
    public static ExifInterface m14063a(byte[] bArr) {
        ExifInterface exifInterface = new ExifInterface();
        try {
            exifInterface.m4691r(bArr);
        } catch (IOException e) {
            Log.w("CAM_CameraExif", "Failed to read EXIF data", e);
        }
        return exifInterface;
    }

    /* JADX INFO: renamed from: b */
    public static kep m14064b() {
        return new kep(new ExifInterface());
    }

    /* JADX INFO: renamed from: i */
    public static final kaz m14065i(Float f, Long l) {
        if (f == null || l == null) {
            return null;
        }
        return new kaz((long) (f.floatValue() * l.longValue()), l.longValue());
    }

    /* JADX INFO: renamed from: j */
    private static final kaz m14066j(Double d, Long l) {
        double dDoubleValue = d.doubleValue();
        l.longValue();
        l.longValue();
        return new kaz((long) (dDoubleValue * 100.0d), 100L);
    }

    /* JADX INFO: renamed from: c */
    public final void m14067c(int i, Object obj) {
        if (obj != null) {
            ExifInterface exifInterface = this.f35783a;
            exifInterface.m4695y(exifInterface.m4684i(i, obj));
        }
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    /* JADX INFO: renamed from: d */
    public final void m14068d(Location location) {
        ExifInterface exifInterface = this.f35783a;
        double latitude = location.getLatitude();
        double longitude = location.getLongitude();
        ken kenVarM4684i = exifInterface.m4684i(ExifInterface.f7833aT, ExifInterface.m4678w(latitude));
        ken kenVarM4684i2 = exifInterface.m4684i(ExifInterface.f7835aV, ExifInterface.m4678w(longitude));
        ken kenVarM4684i3 = exifInterface.m4684i(ExifInterface.f7832aS, latitude >= 0.0d ? "N" : "S");
        ken kenVarM4684i4 = exifInterface.m4684i(ExifInterface.f7834aU, longitude >= 0.0d ? "E" : "W");
        if (kenVarM4684i != null && kenVarM4684i2 != null && kenVarM4684i3 != null && kenVarM4684i4 != null) {
            exifInterface.m4695y(kenVarM4684i);
            exifInterface.m4695y(kenVarM4684i2);
            exifInterface.m4695y(kenVarM4684i3);
            exifInterface.m4695y(kenVarM4684i4);
        }
        ExifInterface exifInterface2 = this.f35783a;
        long time = location.getTime();
        ken kenVarM4684i5 = exifInterface2.m4684i(ExifInterface.f7887bs, exifInterface2.f7920bC.format(Long.valueOf(time)));
        if (kenVarM4684i5 != null) {
            exifInterface2.m4695y(kenVarM4684i5);
            exifInterface2.f7921bD.setTimeInMillis(time);
            ken kenVarM4684i6 = exifInterface2.m4684i(ExifInterface.f7838aY, new kaz[]{new kaz(exifInterface2.f7921bD.get(11), 1L), new kaz(exifInterface2.f7921bD.get(12), 1L), new kaz(exifInterface2.f7921bD.get(13), 1L)});
            if (kenVarM4684i6 != null) {
                exifInterface2.m4695y(kenVarM4684i6);
            }
        }
        if (location.hasAltitude()) {
            ExifInterface exifInterface3 = this.f35783a;
            double altitude = location.getAltitude();
            int i = ExifInterface.f7837aX;
            double dAbs = Math.abs(altitude);
            ExifInterface.f7892bx.longValue();
            ExifInterface.f7892bx.longValue();
            ken kenVarM4684i7 = exifInterface3.m4684i(i, new kaz((int) (dAbs * 100.0d), 100L));
            ken kenVarM4684i8 = exifInterface3.m4684i(ExifInterface.f7836aW, Byte.valueOf(altitude >= 0.0d ? (byte) 0 : (byte) 1));
            if (kenVarM4684i7 == null || kenVarM4684i8 == null) {
                return;
            }
            exifInterface3.m4695y(kenVarM4684i7);
            exifInterface3.m4695y(kenVarM4684i8);
        }
    }

    /* JADX INFO: renamed from: e */
    public final void m14069e() {
        m14067c(ExifInterface.f7898g, Build.MANUFACTURER);
        m14067c(ExifInterface.f7899h, Build.MODEL);
    }

    /* JADX INFO: renamed from: f */
    public final void m14070f(int i, int i2, kay kayVar, mrm mrmVar) {
        Object kazVar;
        Object kazVar2;
        m14069e();
        ExifInterface exifInterface = this.f35783a;
        int i3 = ExifInterface.f7848ai;
        Integer numValueOf = Integer.valueOf(i);
        exifInterface.m4695y(exifInterface.m4684i(i3, numValueOf));
        ExifInterface exifInterface2 = this.f35783a;
        int i4 = ExifInterface.f7849aj;
        Integer numValueOf2 = Integer.valueOf(i2);
        exifInterface2.m4695y(exifInterface2.m4684i(i4, numValueOf2));
        ExifInterface exifInterface3 = this.f35783a;
        exifInterface3.m4695y(exifInterface3.m4684i(ExifInterface.f7813a, numValueOf));
        ExifInterface exifInterface4 = this.f35783a;
        exifInterface4.m4695y(exifInterface4.m4684i(ExifInterface.f7866b, numValueOf2));
        ExifInterface exifInterface5 = this.f35783a;
        exifInterface5.m4695y(exifInterface5.m4684i(ExifInterface.f7901j, Short.valueOf(kei.m14033b(kayVar).f35732i)));
        if (mrmVar.mo16813g()) {
            kpl kplVar = (kpl) mrmVar.mo16809c();
            Long l = 1000000000L;
            Long l2 = (Long) kplVar.mo9517d(CaptureResult.SENSOR_EXPOSURE_TIME);
            int i5 = ExifInterface.f7792F;
            if (l2 != null) {
                long jLongValue = l2.longValue();
                l.longValue();
                kazVar = new kaz(jLongValue, 1000000000L);
            } else {
                kazVar = null;
            }
            m14067c(i5, kazVar);
            if (l2 != null) {
                double dLongValue = l2.longValue();
                l.longValue();
                Double.isNaN(dLongValue);
                m14067c(ExifInterface.f7803Q, m14066j(Double.valueOf(Math.log(Double.valueOf(dLongValue / 1.0E9d).doubleValue()) / f35781b), 100L));
            }
            Integer numValueOf3 = (Integer) kplVar.mo9517d(CaptureResult.SENSOR_SENSITIVITY);
            if (numValueOf3 != null) {
                Integer num = (Integer) kplVar.mo9517d(CaptureResult.CONTROL_POST_RAW_SENSITIVITY_BOOST);
                if (num != null) {
                    numValueOf3 = Integer.valueOf(Math.round(numValueOf3.intValue() * (num.intValue() / 100.0f)));
                }
                m14067c(ExifInterface.f7796J, numValueOf3);
            }
            Float f = (Float) kplVar.mo9517d(CaptureResult.LENS_APERTURE);
            m14067c(ExifInterface.f7793G, m14065i(f, 100L));
            if (f != null) {
                double dDoubleValue = Double.valueOf(Math.log(f.floatValue()) / f35781b).doubleValue();
                m14067c(ExifInterface.f7804R, m14066j(Double.valueOf(dDoubleValue + dDoubleValue), 100L));
            }
            m14067c(ExifInterface.f7812Z, m14065i((Float) kplVar.mo9517d(CaptureResult.LENS_FOCAL_LENGTH), 1000L));
            Integer num2 = (Integer) kplVar.mo9517d(CaptureResult.FLASH_STATE);
            short s = 1;
            if (num2 == null || num2.intValue() != 3) {
                m14067c(ExifInterface.f7811Y, (short) 0);
            } else {
                m14067c(ExifInterface.f7811Y, (short) 1);
            }
            Float f2 = (Float) kplVar.mo9517d(CaptureResult.LENS_FOCUS_DISTANCE);
            if (f2 != null) {
                if (f2.floatValue() > 1.0E-6f) {
                    float fFloatValue = 1.0f / f2.floatValue();
                    kazVar2 = m14065i(Float.valueOf(fFloatValue), f35782c);
                    if (fFloatValue >= 1.0f) {
                        s = fFloatValue < 3.0f ? (short) 2 : (short) 3;
                    }
                } else if (f2.floatValue() >= 0.0f) {
                    kazVar2 = new kaz(-1L, 1L);
                    s = 3;
                } else {
                    kazVar2 = new kaz(0L, 1L);
                    s = 0;
                }
                m14067c(ExifInterface.f7808V, kazVar2);
                m14067c(ExifInterface.f7822aI, Short.valueOf(s));
            }
        }
    }

    /* JADX INFO: renamed from: g */
    public final void m14071g(long j) {
        if (j > 0) {
            this.f35783a.m4694x(ExifInterface.f7910s, j, TimeZone.getDefault());
            this.f35783a.m4694x(ExifInterface.f7799M, j, TimeZone.getDefault());
            this.f35783a.m4694x(ExifInterface.f7800N, j, TimeZone.getDefault());
        }
    }

    /* JADX INFO: renamed from: h */
    public final void m14072h(kmq kmqVar, kaz kazVar, kaz kazVar2) {
        String str;
        String str2 = Build.MANUFACTURER;
        String str3 = Build.MODEL;
        m14067c(ExifInterface.f7824aK, str2);
        ArrayList arrayList = new ArrayList();
        arrayList.add(str3);
        kmq kmqVar2 = kmq.f36557a;
        switch (kmqVar) {
            case f36557a:
                str = "front";
                break;
            case BACK:
                str = "back";
                break;
            case EXTERNAL:
                str = "external";
                break;
            default:
                str = "unknown";
                break;
        }
        arrayList.add(str.concat(" camera"));
        if (kazVar != null) {
            arrayList.add(kazVar.m13895a() + "mm");
        }
        if (kazVar2 != null) {
            arrayList.add("f/" + kazVar2.m13895a());
        }
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < arrayList.size(); i++) {
            sb.append((String) arrayList.get(i));
            if (i < arrayList.size() - 1) {
                sb.append(' ');
            }
        }
        ExifInterface exifInterface = this.f35783a;
        exifInterface.m4695y(exifInterface.m4684i(ExifInterface.f7825aL, sb.toString()));
    }
}
