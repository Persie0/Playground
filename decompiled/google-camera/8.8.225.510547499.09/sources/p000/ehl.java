package p000;

import com.google.googlex.gcam.AeResults;
import com.google.googlex.gcam.GcamModuleJNI;
import com.google.googlex.gcam.InterleavedImageF;
import com.google.googlex.gcam.PortraitRequest;
import com.google.googlex.gcam.ShotMetadata;
import com.google.googlex.gcam.SpatialGainMap;
import com.google.googlex.gcam.StringAeResultsMap;
import com.google.googlex.gcam.StringFrameMetadataMap;
import com.google.googlex.gcam.StringSpatialGainMap;
import com.google.googlex.gcam.StringStaticMetadataMap;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class ehl {

    /* JADX INFO: renamed from: a */
    public static final nbh f14047a = nbh.m17259h("com/google/android/apps/camera/hdrplus/portrait/PortraitRequestDecorator");

    /* JADX INFO: renamed from: b */
    public final oju f14048b;

    /* JADX INFO: renamed from: c */
    public final dhv f14049c;

    public ehl(oju ojuVar, dhv dhvVar) {
        this.f14048b = ojuVar;
        this.f14049c = dhvVar;
    }

    /* JADX INFO: renamed from: a */
    public static final void m7326a(String str, PortraitRequest portraitRequest, ShotMetadata shotMetadata) {
        long jPortraitRequest_ae_results_get = GcamModuleJNI.PortraitRequest_ae_results_get(portraitRequest.f8338a, portraitRequest);
        StringAeResultsMap stringAeResultsMap = jPortraitRequest_ae_results_get == 0 ? null : new StringAeResultsMap(jPortraitRequest_ae_results_get);
        AeResults aeResultsM5097c = shotMetadata.m5097c();
        GcamModuleJNI.StringAeResultsMap_set(stringAeResultsMap.f8368a, stringAeResultsMap, str, AeResults.m4881b(aeResultsM5097c), aeResultsM5097c);
        long jPortraitRequest_frame_metadata_get = GcamModuleJNI.PortraitRequest_frame_metadata_get(portraitRequest.f8338a, portraitRequest);
        (jPortraitRequest_frame_metadata_get == 0 ? null : new StringFrameMetadataMap(jPortraitRequest_frame_metadata_get, false)).m5129b(str, shotMetadata.m5098d());
        long jPortraitRequest_static_metadata_get = GcamModuleJNI.PortraitRequest_static_metadata_get(portraitRequest.f8338a, portraitRequest);
        (jPortraitRequest_static_metadata_get == 0 ? null : new StringStaticMetadataMap(jPortraitRequest_static_metadata_get, false)).m5134b(str, shotMetadata.m5101g());
        long jPortraitRequest_gain_map_get = GcamModuleJNI.PortraitRequest_gain_map_get(portraitRequest.f8338a, portraitRequest);
        StringSpatialGainMap stringSpatialGainMap = jPortraitRequest_gain_map_get == 0 ? null : new StringSpatialGainMap(jPortraitRequest_gain_map_get);
        long jShotMetadata_gain_map_rggb_get = GcamModuleJNI.ShotMetadata_gain_map_rggb_get(shotMetadata.f8356a, shotMetadata);
        InterleavedImageF interleavedImageF = jShotMetadata_gain_map_rggb_get != 0 ? new InterleavedImageF(jShotMetadata_gain_map_rggb_get) : null;
        SpatialGainMap spatialGainMap = new SpatialGainMap(GcamModuleJNI.new_SpatialGainMap__SWIG_1(InterleavedImageF.m4998a(interleavedImageF), interleavedImageF));
        GcamModuleJNI.StringSpatialGainMap_set(stringSpatialGainMap.f8373a, stringSpatialGainMap, str, spatialGainMap.f8362a, spatialGainMap);
    }
}
