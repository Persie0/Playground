package p000;

import androidx.wear.ambient.AmbientModeSupport;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class hax implements ohi {

    /* JADX INFO: renamed from: a */
    private final oju f27111a;

    /* JADX INFO: renamed from: b */
    private final /* synthetic */ int f27112b;

    public hax(oju ojuVar, int i) {
        this.f27112b = i;
        this.f27111a = ojuVar;
    }

    /* JADX INFO: renamed from: a */
    public static hax m10053a(oju ojuVar) {
        return new hax(ojuVar, 19);
    }

    @Override // p000.oju
    public final /* synthetic */ Object get() {
        switch (this.f27112b) {
            case 0:
                return ((haj) this.f27111a).get().m11351s("pref_camera_resolution", "full");
            case 1:
                return ((haj) this.f27111a).get().m11349q("key_promote_launch_wear", false);
            case 2:
                return ((haj) this.f27111a).get().m11349q("perf_has_run_second_education", false);
            case 3:
                return ((haj) this.f27111a).get().m11350r("pref_shutter_command_string", 66);
            case 4:
                return ((haj) this.f27111a).get().m11350r("pref_switch_camera_command_string", 47);
            case 5:
                hqo hqoVar = ((dhv) this.f27111a.get()).mo6184l(diy.f11751h) ? hqo.AUTO_FPS_30_5X : hqo.MANUAL_FPS_30_1X;
                hqoVar.getClass();
                return hqoVar;
            case 6:
                return new haq(((haj) this.f27111a).get().m11351s("pref_video_fps_key", gzm.FPS_30.name()));
            case 7:
                return new haq(((haj) this.f27111a).get().m11351s("pref_video_fps_4k_key", gzm.FPS_30.name()));
            case 8:
                return new haq(((haj) this.f27111a).get().m11351s("pref_video_fps_cm_key", gzm.FPS_30.name()));
            case 9:
                return ((haj) this.f27111a).get().m11350r("pref_zoom_in_command_string", 19);
            case 10:
                return ((haj) this.f27111a).get().m11350r("pref_zoom_out_command_string", 20);
            case 11:
                return ((haj) this.f27111a).get().m11349q("pref_audio_zoom_key", true);
            case 12:
                return ((haj) this.f27111a).get().m11349q("pref_has_checked_cheetah_mode", false);
            case 13:
                return ((haj) this.f27111a).get().m11349q("pref_has_checked_lasagna_mode", false);
            case 14:
                return new kon(((dws) this.f27111a).m6830a());
            case 15:
                return (hce) ((mrq) ((etl) this.f27111a).m7866a()).f41482a;
            case 16:
                return new hcg(((dws) this.f27111a).m6830a());
            case 17:
                return new hds((nps) this.f27111a.get());
            case 18:
                return new AmbientModeSupport.AmbientController((nps) this.f27111a.get());
            case 19:
                return !((Boolean) this.f27111a.get()).booleanValue() ? mqu.f41450a : mrm.m16829i(new hfa());
            default:
                return Boolean.valueOf(((dhv) this.f27111a.get()).mo6184l(dij.f11593q));
        }
    }
}
