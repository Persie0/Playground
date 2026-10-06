package p000;

import android.app.KeyguardManager;
import android.app.NotificationManager;
import android.app.admin.DevicePolicyManager;
import android.app.job.JobScheduler;
import android.hardware.SensorManager;
import android.hardware.camera2.CameraManager;
import android.hardware.display.DisplayManager;
import android.location.LocationManager;
import android.media.AudioManager;
import android.os.PowerManager;
import android.os.UserManager;
import android.view.accessibility.AccessibilityManager;
import com.google.android.material.behavior.iWN.zuAgeeF;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public interface emj {

    /* JADX INFO: renamed from: b */
    public static final lqq f14709b = new lqq(AudioManager.class, "audio", 2);

    /* JADX INFO: renamed from: c */
    public static final lqq f14710c = new lqq(AccessibilityManager.class, "accessibility", 3);

    /* JADX INFO: renamed from: d */
    public static final lqq f14711d = new lqq(CameraManager.class, "camera", 4);

    /* JADX INFO: renamed from: e */
    public static final lqq f14712e = new lqq(DevicePolicyManager.class, zuAgeeF.KVLrihr, 5);

    /* JADX INFO: renamed from: f */
    public static final lqq f14713f = new lqq(DisplayManager.class, "display", 6);

    /* JADX INFO: renamed from: g */
    public static final lqq f14714g = new lqq(KeyguardManager.class, "keyguard", 7);

    /* JADX INFO: renamed from: h */
    public static final lqq f14715h = new lqq(LocationManager.class, "location", 8);

    /* JADX INFO: renamed from: i */
    public static final lqq f14716i = new lqq(NotificationManager.class, "notification", 9);

    /* JADX INFO: renamed from: j */
    public static final lqq f14717j = new lqq(PowerManager.class, "power", 10);

    /* JADX INFO: renamed from: k */
    public static final lqq f14718k = new lqq(SensorManager.class, "sensor", 11);

    /* JADX INFO: renamed from: l */
    public static final lqq f14719l = new lqq(JobScheduler.class, "jobscheduler", 15);

    /* JADX INFO: renamed from: m */
    public static final lqq f14720m = new lqq(UserManager.class, "user", 16);

    /* JADX INFO: renamed from: a */
    Object mo7509a(lqq lqqVar);
}
