package p000;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class hau implements ohi {

    /* JADX INFO: renamed from: a */
    private final oju f27105a;

    /* JADX INFO: renamed from: b */
    private final /* synthetic */ int f27106b;

    public hau(oju ojuVar, int i) {
        this.f27106b = i;
        this.f27105a = ojuVar;
    }

    /* JADX WARN: Type inference failed for: r1v20, types: [java.lang.Object, kbo] */
    @Override // p000.oju
    public final /* synthetic */ Object get() {
        switch (this.f27106b) {
            case 0:
                return ((haj) this.f27105a).get().m11350r("pref_af_mode_front", gzk.ON.f26932f);
            case 1:
                return ((haj) this.f27105a).get().m11350r("pref_af_mode_back", gzk.ON.f26932f);
            case 2:
                return ((haj) this.f27105a).get().m11350r("pref_camera_beholder_example_percent_key", -1);
            case 3:
                dhv dhvVar = (dhv) this.f27105a.get();
                dhx dhxVar = dhh.f11074a;
                dhvVar.mo6177e();
                gzr gzrVar = gzr.RES_1080P;
                gzrVar.getClass();
                return gzrVar;
            case 4:
                return ((haj) this.f27105a).get().m11351s("pref_release_dialog_last_shown_version", "");
            case 5:
                return ((haj) this.f27105a).get().m11349q("pref_exposure_control_key", true);
            case 6:
                return ((haj) this.f27105a).get().m11349q("perf_has_run_first_education", false);
            case 7:
                return ((haj) this.f27105a).get().m11349q("pref_has_checked_dual_ev_brightness", false);
            case 8:
                return ((haj) this.f27105a).get().m11349q("pref_has_checked_dual_ev_shadow", false);
            case 9:
                return ((haj) this.f27105a).get().m11349q("pref_has_checked_lens_mode", false);
            case 10:
                return ((haj) this.f27105a).get().m11349q("pref_has_checked_measure_mode", false);
            case 11:
                return ((haj) this.f27105a).get().m11349q("pref_has_checked_ornament_mode", false);
            case 12:
                return ((haj) this.f27105a).get().m11349q("pref_has_checked_tiara_mode", false);
            case 13:
                return ((haj) this.f27105a).get().m11349q("pref_has_checked_gouda_mode", false);
            case 14:
                return ((haj) this.f27105a).get().m11349q("pref_camera_enable_iris", true);
            case 15:
                ihk ihkVar = ((haj) this.f27105a).get();
                if (!((had) ihkVar.f30966a).mo10047n("pref_link_first_time_chip_click_ms")) {
                    ihkVar.f30967b.mo13944f("Initializing default value (0) for key: (pref_link_first_time_chip_click_ms)");
                    ((had) ihkVar.f30966a).mo10043j("pref_link_first_time_chip_click_ms", 0L);
                }
                return new gzi((had) ihkVar.f30966a);
            case 16:
                return ((haj) this.f27105a).get().m11349q("pref_has_shown_longp_education", false);
            case 17:
                return ((haj) this.f27105a).get().m11350r("pref_switch_to_next_mode_command_string", 72);
            case 18:
                return ((haj) this.f27105a).get().m11349q("perf_has_shown_options_bar", false);
            case 19:
                hai haiVar = (hai) this.f27105a.get();
                cwd cwdVar = new cwd((byte[]) null, (byte[]) null, (byte[]) null);
                cwdVar.m5662i(haiVar.mo10030b(gzy.f27063v));
                cwdVar.m5662i(haiVar.mo10030b(gzy.f27064w));
                cwdVar.m5662i(haiVar.mo10030b(gzy.f27065x));
                return cwdVar;
            default:
                return ((haj) this.f27105a).get().m11350r("pref_switch_to_previous_mode_command_string", 71);
        }
    }
}
