package p000;

import android.content.pm.PackageInfo;
import android.hardware.camera2.CameraCharacteristics;
import com.google.googlex.gcam.GcamModuleJNI;
import com.google.googlex.gcam.StaticMetadata;
import com.google.googlex.gcam.StaticMetadataVector;
import com.google.googlex.gcam.hdrplus.NativeHdrPlusInterface;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class ecd {

    /* JADX INFO: renamed from: a */
    public static final nbh f13339a = nbh.m17259h("com/google/android/apps/camera/hdrplus/HdrPlusModule");

    /* JADX INFO: renamed from: b */
    private static final int[] f13340b = new int[0];

    /* JADX INFO: renamed from: a */
    public static float m7107a(StaticMetadataVector staticMetadataVector, nrp nrpVar) {
        float f = Float.POSITIVE_INFINITY;
        float f2 = -1.0f;
        for (int i = 0; i < GcamModuleJNI.StaticMetadataVector_size(staticMetadataVector.f8366a, staticMetadataVector); i++) {
            StaticMetadata staticMetadata = new StaticMetadata(GcamModuleJNI.StaticMetadataVector_get(staticMetadataVector.f8366a, staticMetadataVector, i), false);
            if (staticMetadata.m5119b() == nrpVar) {
                nse nseVarM5121d = staticMetadata.m5121d();
                if (!GcamModuleJNI.IsLogical(nseVarM5121d.f44379q) && GcamModuleJNI.IsRgb(nseVarM5121d.f44379q)) {
                    float fStaticMetadata_FocalLength35mm = GcamModuleJNI.StaticMetadata_FocalLength35mm(staticMetadata.f8364a, staticMetadata);
                    if (fStaticMetadata_FocalLength35mm > 0.0f) {
                        float fAbs = Math.abs((-28.0f) + fStaticMetadata_FocalLength35mm);
                        if (fAbs < f) {
                            f2 = fStaticMetadata_FocalLength35mm;
                            f = fAbs;
                        }
                    }
                }
            }
        }
        return f2;
    }

    /* JADX INFO: renamed from: b */
    public static nsx m7108b() {
        return new NativeHdrPlusInterface();
    }

    /* JADX INFO: renamed from: c */
    public static boolean m7109c(kmd kmdVar) {
        for (int i : (int[]) kmdVar.mo14560m(CameraCharacteristics.REQUEST_AVAILABLE_CAPABILITIES, f13340b)) {
            if (i == 3) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: d */
    public static void m7110d(PackageInfo packageInfo, StaticMetadata staticMetadata) {
        GcamModuleJNI.StaticMetadata_package_name_set(staticMetadata.f8364a, staticMetadata, packageInfo.packageName);
        GcamModuleJNI.StaticMetadata_package_version_set(staticMetadata.f8364a, staticMetadata, packageInfo.versionName);
    }
}
