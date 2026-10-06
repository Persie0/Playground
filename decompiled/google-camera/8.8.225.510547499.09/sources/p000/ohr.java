package p000;

import com.google.android.play.core.common.wMe.NptsKnlVczSZ;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class ohr implements ohq {

    /* JADX INFO: renamed from: a */
    public static final lpv f46030a;

    /* JADX INFO: renamed from: b */
    public static final lpv f46031b;

    /* JADX INFO: renamed from: c */
    public static final lpv f46032c;

    /* JADX INFO: renamed from: d */
    public static final lpv f46033d;

    static {
        lpt lptVarM15833b = new lpt(lph.m15821a("com.google.android.apps.camera")).m15834c().m15832a().m15833b();
        lptVarM15833b.m15838g("General__camera_hermes_enabled", false);
        lptVarM15833b.m15836e("General__camera_perfetto_trigger_millis", 1000L);
        lptVarM15833b.m15836e("General__camera_slow_launch_dialog_trigger_ms", 3000L);
        lptVarM15833b.m15836e("General__camera_slow_launch_trigger_ms", 3000L);
        lptVarM15833b.m15838g("General__enable_fsb", false);
        lptVarM15833b.m15838g("General__enable_optical_flow_dsp", false);
        lptVarM15833b.m15836e("General__fatal_error_tracker_days_to_reset", 4L);
        f46030a = lptVarM15833b.m15836e("General__psj_threshold_millis", 250L);
        f46031b = lptVarM15833b.m15836e("General__sideline_max_attempts", 3L);
        f46032c = lptVarM15833b.m15838g("General__sideline_remote_disable", false);
        lptVarM15833b.m15836e(NptsKnlVczSZ.OXdSqWBkrqQtGhZ, 360L);
        f46033d = lptVarM15833b.m15836e("General__svj_threshold_millis", 250L);
    }

    @Override // p000.ohq
    /* JADX INFO: renamed from: a */
    public final long mo18496a() {
        return ((Long) f46030a.m15845e()).longValue();
    }

    @Override // p000.ohq
    /* JADX INFO: renamed from: b */
    public final long mo18497b() {
        return ((Long) f46031b.m15845e()).longValue();
    }

    @Override // p000.ohq
    /* JADX INFO: renamed from: c */
    public final long mo18498c() {
        return ((Long) f46033d.m15845e()).longValue();
    }

    @Override // p000.ohq
    /* JADX INFO: renamed from: d */
    public final boolean mo18499d() {
        return ((Boolean) f46032c.m15845e()).booleanValue();
    }
}
