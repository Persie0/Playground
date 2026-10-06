package p000;

import android.content.Context;
import android.hardware.camera2.CaptureResult;
import android.location.Location;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.google.android.apps.camera.bottombar.C0100R;
import com.google.android.apps.camera.p014ui.bottomsheet.BottomSheetButton;
import com.google.android.apps.camera.p014ui.eduimageview.EduImageView;
import com.google.googlex.gcam.AeShotParams;
import com.google.googlex.gcam.ClientShotMetadata;
import com.google.googlex.gcam.FrameMetadata;
import com.google.googlex.gcam.Gcam;
import com.google.googlex.gcam.GcamModuleJNI;
import com.google.googlex.gcam.InterleavedImageF;
import com.google.googlex.gcam.LocationData;
import com.google.googlex.gcam.ShotMetadata;
import com.google.googlex.gcam.SpatialGainMap;
import com.google.googlex.gcam.StaticMetadata;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class gjj {

    /* JADX INFO: renamed from: a */
    public final Object f24998a;

    /* JADX INFO: renamed from: b */
    public final Object f24999b;

    /* JADX INFO: renamed from: c */
    public final Object f25000c;

    /* JADX INFO: renamed from: d */
    public final Object f25001d;

    /* JADX INFO: renamed from: e */
    public final Object f25002e;

    /* JADX INFO: renamed from: f */
    public final Object f25003f;

    /* JADX INFO: renamed from: g */
    public final Object f25004g;

    /* JADX INFO: renamed from: h */
    public final Object f25005h;

    /* JADX INFO: renamed from: i */
    public final Object f25006i;

    /* JADX INFO: renamed from: j */
    public final Object f25007j;

    public gjj(Context context, hst hstVar, hah hahVar, hai haiVar, jwn jwnVar) {
        this.f25007j = context;
        this.f25001d = hstVar;
        this.f24998a = jwnVar;
        this.f24999b = hahVar;
        this.f25005h = haiVar;
        FrameLayout frameLayout = new FrameLayout(context);
        this.f25004g = frameLayout;
        View.inflate(context, C0100R.layout.jupiter_bottom_sheet_content, frameLayout);
        this.f25006i = (EduImageView) frameLayout.findViewById(C0100R.id.jupiter_bottom_sheet_image);
        this.f25000c = (TextView) frameLayout.findViewById(C0100R.id.jupiter_bottom_sheet_description);
        this.f25002e = (BottomSheetButton) frameLayout.findViewById(C0100R.id.confirm_button);
        this.f25003f = (BottomSheetButton) frameLayout.findViewById(C0100R.id.close_button);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [ecq, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v2, types: [ecq, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v7, types: [fca, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v10, types: [dhv, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v1, types: [java.lang.Object, kmd] */
    /* JADX WARN: Type inference failed for: r4v3, types: [java.lang.Object, jwn] */
    /* JADX WARN: Type inference failed for: r5v1, types: [dhv, java.lang.Object] */
    /* JADX INFO: renamed from: a */
    public final fta m9333a(kmg kmgVar, kpp kppVar, int i) {
        ClientShotMetadata clientShotMetadata;
        float fM17678a;
        int iMo7136c = this.f25004g.mo7136c(kppVar, kmgVar);
        StaticMetadata staticMetadataM4972b = ((Gcam) this.f25006i).m4972b(iMo7136c);
        ShotMetadata shotMetadata = new ShotMetadata();
        GcamModuleJNI.ShotMetadata_static_metadata_set(shotMetadata.f8356a, shotMetadata, StaticMetadata.m5118a(staticMetadataM4972b), staticMetadataM4972b);
        FrameMetadata frameMetadataMo7141h = this.f25004g.mo7141h(kppVar, null, kmgVar);
        GcamModuleJNI.ShotMetadata_frame_metadata_set(shotMetadata.f8356a, shotMetadata, FrameMetadata.m4951b(frameMetadataMo7141h), frameMetadataMo7141h);
        SpatialGainMap spatialGainMapM17686o = ((nta) this.f24998a).m17686o(kppVar);
        InterleavedImageF interleavedImageF = new InterleavedImageF(GcamModuleJNI.SpatialGainMap_gain_map(spatialGainMapM17686o.f8362a, spatialGainMapM17686o));
        GcamModuleJNI.ShotMetadata_gain_map_rggb_set(shotMetadata.f8356a, shotMetadata, InterleavedImageF.m4998a(interleavedImageF), interleavedImageF);
        mrm mrmVarMo8117c = this.f25000c.mo8117c();
        if (mrmVarMo8117c.mo16813g()) {
            Location location = (Location) mrmVarMo8117c.mo16809c();
            LocationData locationData = new LocationData();
            locationData.m5034b(location.getAltitude());
            locationData.m5035c(location.getAccuracy());
            locationData.m5036d(location.getLatitude());
            locationData.m5037e(location.getLongitude());
            locationData.m5039g(location.getTime() / 1000);
            locationData.m5038f(location.getProvider());
            ClientShotMetadata clientShotMetadata2 = new ClientShotMetadata();
            clientShotMetadata2.m4915c(locationData);
            clientShotMetadata = clientShotMetadata2;
        } else {
            clientShotMetadata = null;
        }
        if (clientShotMetadata != null) {
            GcamModuleJNI.ShotMetadata_client_shot_metadata_set(shotMetadata.f8356a, shotMetadata, ClientShotMetadata.m4913a(clientShotMetadata), clientShotMetadata);
        }
        Integer num = (Integer) kppVar.mo9517d(CaptureResult.CONTROL_AE_EXPOSURE_COMPENSATION);
        if (num != null) {
            fM17678a = ((nta) this.f24998a).m17678a(num.intValue());
        } else {
            fM17678a = 1.0f;
        }
        GcamModuleJNI.ShotMetadata_exposure_compensation_set(shotMetadata.f8356a, shotMetadata, fM17678a);
        GcamModuleJNI.ShotMetadata_image_rotation_set(shotMetadata.f8356a, shotMetadata, ntw.m17722h(cem.m3564b(i, (inm) this.f25003f, this.f25001d, this.f25002e, this.f25007j)).f44260j);
        GcamModuleJNI.ShotMetadata_wb_mode_set(shotMetadata.f8356a, shotMetadata, (((jxd) this.f24999b).mo3831be() == fvc.AUTO ? nsg.f44388a : nsg.f44389b).f44391c);
        GcamModuleJNI.ShotMetadata_flash_mode_set(shotMetadata.f8356a, shotMetadata, nrk.f44228c.f44230d);
        shotMetadata.m5108n("f");
        AeShotParams aeShotParams = new AeShotParams();
        aeShotParams.m4889f(fM17678a);
        aeShotParams.m4894k(nsf.f44381a);
        Object obj = this.f24998a;
        String strE = kppVar.mo9518e();
        strE.getClass();
        ((nta) obj).m17688u(kmg.m14575b(strE), aeShotParams, kppVar, ((Float) this.f25007j.mo6180h(dhu.f11199a).get()).floatValue(), ((gdz) this.f25005h).f24348b);
        aeShotParams.m4886c().m5142a();
        return new fta(shotMetadata, iMo7136c, aeShotParams, spatialGainMapM17686o);
    }

    /* JADX INFO: renamed from: b */
    public final void m9334b() {
        ((hst) this.f25001d).m10708g();
    }

    /* JADX WARN: Type inference failed for: r10v2, types: [java.lang.Object, oju] */
    /* JADX WARN: Type inference failed for: r12v0, types: [java.lang.Object, oju] */
    /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.Object, oju] */
    /* JADX WARN: Type inference failed for: r3v2, types: [java.lang.Object, oju] */
    /* JADX WARN: Type inference failed for: r4v2, types: [java.lang.Object, oju] */
    /* JADX WARN: Type inference failed for: r5v2, types: [java.lang.Object, oju] */
    /* JADX WARN: Type inference failed for: r6v2, types: [java.lang.Object, oju] */
    /* JADX WARN: Type inference failed for: r7v2, types: [java.lang.Object, oju] */
    /* JADX WARN: Type inference failed for: r9v0, types: [java.lang.Object, oju] */
    /* JADX INFO: renamed from: c */
    public final gji m9335c(kfo kfoVar, glk glkVar, gof gofVar) {
        kbz kbzVar = (kbz) this.f24998a.get();
        kbzVar.getClass();
        ecq ecqVar = (ecq) this.f24999b.get();
        ecqVar.getClass();
        eby ebyVar = (eby) this.f25000c.get();
        ebyVar.getClass();
        gjt gjtVar = (gjt) this.f25001d.get();
        gjtVar.getClass();
        eci eciVar = (eci) this.f25002e.get();
        eciVar.getClass();
        gva gvaVar = (gva) this.f25003f.get();
        gvaVar.getClass();
        ffn ffnVar = ffn.f21703b;
        dhv dhvVar = (dhv) this.f25004g.get();
        dhvVar.getClass();
        mrm mrmVar = (mrm) this.f25005h.get();
        mrmVar.getClass();
        goj gojVarM9582a = ((gok) this.f25006i).get();
        gir girVar = (gir) this.f25007j.get();
        girVar.getClass();
        return new gji(kbzVar, ecqVar, ebyVar, gjtVar, eciVar, gvaVar, ffnVar, dhvVar, mrmVar, gojVarM9582a, girVar, kfoVar, glkVar, gofVar, null, null);
    }

    public gjj(Gcam gcam, dhv dhvVar, kmd kmdVar, kme kmeVar, ecq ecqVar, fca fcaVar, fvd fvdVar, gdz gdzVar, inm inmVar, jwn jwnVar) {
        this.f25004g = ecqVar;
        this.f25000c = fcaVar;
        this.f25001d = kmdVar;
        this.f24999b = fvdVar;
        this.f24998a = new nta(kmdVar, kmeVar);
        this.f25005h = gdzVar;
        this.f25006i = gcam;
        this.f25007j = dhvVar;
        this.f25003f = inmVar;
        this.f25002e = jwnVar;
    }

    public gjj(oju ojuVar, oju ojuVar2, oju ojuVar3, oju ojuVar4, oju ojuVar5, oju ojuVar6, oju ojuVar7, oju ojuVar8, oju ojuVar9, oju ojuVar10) {
        ojuVar.getClass();
        this.f24998a = ojuVar;
        ojuVar2.getClass();
        this.f24999b = ojuVar2;
        ojuVar3.getClass();
        this.f25000c = ojuVar3;
        ojuVar4.getClass();
        this.f25001d = ojuVar4;
        ojuVar5.getClass();
        this.f25002e = ojuVar5;
        ojuVar6.getClass();
        this.f25003f = ojuVar6;
        ojuVar7.getClass();
        this.f25004g = ojuVar7;
        ojuVar8.getClass();
        this.f25005h = ojuVar8;
        ojuVar9.getClass();
        this.f25006i = ojuVar9;
        ojuVar10.getClass();
        this.f25007j = ojuVar10;
    }
}
