package p000;

import android.app.Notification;
import android.app.job.JobParameters;
import android.graphics.Path;
import android.os.Build;
import android.os.StrictMode;
import android.util.SizeF;
import android.view.DisplayCutout;
import android.widget.RemoteViews;
import androidx.work.impl.background.systemjob.SystemJobService;
import java.util.Map;

/* JADX INFO: renamed from: ao */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC0780ao {
    /* JADX INFO: renamed from: a */
    public static void m2935a(RemoteViews remoteViews, int i, RemoteViews remoteViews2, int i2) {
        remoteViews.addStableView(i, remoteViews2, i2);
    }

    /* JADX INFO: renamed from: b */
    public static void m2936b(RemoteViews remoteViews, int i, pg2 pg2Var) {
        remoteViews.getClass();
        if (Build.VERSION.SDK_INT < 31) {
            C3386nv.m17624j("setClipToOutline is only available on SDK 31 and higher");
            return;
        }
        remoteViews.setBoolean(i, "setClipToOutline", true);
        if (pg2Var instanceof ig2) {
            remoteViews.setViewOutlinePreferredRadius(i, ((ig2) pg2Var).f44068a, 1);
        } else if (pg2Var instanceof mg2) {
            remoteViews.setViewOutlinePreferredRadiusDimen(i, ((mg2) pg2Var).f51278a);
        } else {
            ij6.m13967y(pg2Var.getClass().getCanonicalName(), "Rounded corners should not be ");
        }
    }

    /* JADX INFO: renamed from: c */
    public static RemoteViews m2937c(Map map) {
        return new RemoteViews((Map<SizeF, RemoteViews>) map);
    }

    /* JADX INFO: renamed from: d */
    public static Path m2938d(DisplayCutout displayCutout) {
        return displayCutout.getCutoutPath();
    }

    /* JADX INFO: renamed from: e */
    public static int m2939e(JobParameters jobParameters) {
        int stopReason = jobParameters.getStopReason();
        String str = SystemJobService.f7215e;
        switch (stopReason) {
            case 0:
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
            case 13:
            case 14:
            case 15:
                return stopReason;
            default:
                return -512;
        }
    }

    /* JADX INFO: renamed from: f */
    public static StrictMode.VmPolicy.Builder m2940f(StrictMode.VmPolicy.Builder builder) {
        return builder.permitUnsafeIntentLaunch();
    }

    /* JADX INFO: renamed from: g */
    public static RemoteViews m2941g(int i, String str, int i2) {
        return new RemoteViews(str, i, i2);
    }

    /* JADX INFO: renamed from: h */
    public static void m2942h(Notification.Action.Builder builder) {
        builder.setAuthenticationRequired(false);
    }

    /* JADX INFO: renamed from: i */
    public static void m2943i(Notification.Builder builder, int i) {
        builder.setForegroundServiceBehavior(i);
    }

    /* JADX INFO: renamed from: j */
    public static void m2944j(RemoteViews remoteViews, int i, b58 b58Var) {
        RemoteViews.RemoteCollectionItems.Builder viewTypeCount = new RemoteViews.RemoteCollectionItems.Builder().setHasStableIds(b58Var.f7973c).setViewTypeCount(b58Var.f7974d);
        long[] jArr = b58Var.f7971a;
        int length = jArr.length;
        for (int i2 = 0; i2 < length; i2++) {
            viewTypeCount.addItem(jArr[i2], b58Var.f7972b[i2]);
        }
        remoteViews.setRemoteAdapter(i, viewTypeCount.build());
    }

    /* JADX INFO: renamed from: k */
    public static void m2945k(RemoteViews remoteViews, int i, pg2 pg2Var) {
        if (pg2Var instanceof og2) {
            remoteViews.setViewLayoutHeight(i, -2.0f, 0);
            return;
        }
        if (pg2Var instanceof jg2) {
            remoteViews.setViewLayoutHeight(i, 0.0f, 0);
            return;
        }
        if (pg2Var instanceof ig2) {
            remoteViews.setViewLayoutHeight(i, ((ig2) pg2Var).f44068a, 1);
            return;
        }
        if (pg2Var instanceof mg2) {
            remoteViews.setViewLayoutHeightDimen(i, ((mg2) pg2Var).f51278a);
        } else if (pg2Var.equals(kg2.f47164a)) {
            remoteViews.setViewLayoutHeight(i, -1.0f, 0);
        } else {
            gm5.m12750e();
        }
    }

    /* JADX INFO: renamed from: l */
    public static void m2946l(RemoteViews remoteViews, int i, pg2 pg2Var) {
        if (pg2Var instanceof og2) {
            remoteViews.setViewLayoutWidth(i, -2.0f, 0);
            return;
        }
        if (pg2Var instanceof jg2) {
            remoteViews.setViewLayoutWidth(i, 0.0f, 0);
            return;
        }
        if (pg2Var instanceof ig2) {
            remoteViews.setViewLayoutWidth(i, ((ig2) pg2Var).f44068a, 1);
            return;
        }
        if (pg2Var instanceof mg2) {
            remoteViews.setViewLayoutWidthDimen(i, ((mg2) pg2Var).f51278a);
        } else if (pg2Var.equals(kg2.f47164a)) {
            remoteViews.setViewLayoutWidth(i, -1.0f, 0);
        } else {
            gm5.m12750e();
        }
    }
}
