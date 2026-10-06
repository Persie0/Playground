package p000;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public enum hkp {
    ACTIVITY_ONCREATE_START(true),
    ACTIVITY_ONCREATE_END(true),
    PERMISSIONS_STARTUP_TASK_START(true),
    PERMISSIONS_STARTUP_TASK_END(true),
    WAIT_FOR_CAMERA_DEVICES_TASK_START(true),
    WAIT_FOR_CAMERA_DEVICES_TASK_END(true),
    ACTIVITY_ONSTART_START(false),
    ACTIVITY_ONRESUME_START(false),
    ACTIVITY_ONRESUME_END(false),
    ACTIVITY_SURFACE_VIEW_CREATED(false),
    ACTIVITY_INITIALIZED(true),
    f28195l(false),
    ACTIVITY_FIRST_PREVIEW_FRAME_RENDERED(false),
    ACTIVITY_FIRST_PREVIEW_FRAME_VFE_RENDERED(false, false),
    ACTIVITY_SHUTTER_BUTTON_DRAWN(false),
    ACTIVITY_SHUTTER_BUTTON_ENABLED(false),
    ACTIVITY_SCRIPT_FINISHED(false, false),
    ACTIVITY_STEADY(false, false);


    /* JADX INFO: renamed from: s */
    public final boolean f28203s;

    /* JADX INFO: renamed from: t */
    public final boolean f28204t;

    hkp(boolean z) {
        this(z, true);
    }

    hkp(boolean z, boolean z2) {
        this.f28203s = z;
        this.f28204t = z2;
    }
}
