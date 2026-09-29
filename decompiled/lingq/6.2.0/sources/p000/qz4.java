package p000;

import android.os.CountDownTimer;
import com.lingq.feature.reader.stats.C2535j;
import java.util.Arrays;
import java.util.concurrent.TimeUnit;
import kotlinx.coroutines.flow.C3244l;

/* JADX INFO: loaded from: classes3.dex */
public final class qz4 extends CountDownTimer {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ C2535j f58416a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qz4(C2535j c2535j, long j) {
        super(j, 1000L);
        this.f58416a = c2535j;
    }

    @Override // android.os.CountDownTimer
    public final void onFinish() {
    }

    @Override // android.os.CountDownTimer
    public final void onTick(long j) {
        String str;
        long millis = j - TimeUnit.DAYS.toMillis(j / 86400000);
        long j2 = millis / 3600000;
        long millis2 = millis - TimeUnit.HOURS.toMillis(j2);
        long j3 = millis2 / 60000;
        long millis3 = (millis2 - TimeUnit.MINUTES.toMillis(j3)) / 1000;
        String str2 = j2 == 1 ? "Hour" : "Hours";
        String str3 = j3 == 1 ? "Minute" : "Minutes";
        String str4 = millis3 == 1 ? "Second" : "Seconds";
        if (j2 == 0 && j3 == 0) {
            str = String.format("%d ".concat(str4), Arrays.copyOf(new Object[]{Integer.valueOf((int) millis3)}, 1));
        } else if (j2 == 0 && j3 > 0) {
            str = String.format(wq1.m24119o("%d ", str3, ", %d ", str4), Arrays.copyOf(new Object[]{Integer.valueOf((int) j3), Integer.valueOf((int) millis3)}, 2));
        } else if (j2 <= 0 || j3 != 0) {
            str = (j2 <= 0 || j3 <= 0) ? "" : String.format(wq1.m24119o("%d ", str2, ", %d ", str3), Arrays.copyOf(new Object[]{Integer.valueOf((int) j2), Integer.valueOf((int) j3)}, 2));
        } else {
            str = String.format("%d ".concat(str2), Arrays.copyOf(new Object[]{Integer.valueOf((int) j2)}, 1));
        }
        boolean zM23391n0 = vk9.m23391n0(str);
        C2535j c2535j = this.f58416a;
        if (zM23391n0) {
            c2535j.m9465a3();
            return;
        }
        C3244l c3244l = c2535j.f30843n0;
        c3244l.getClass();
        c3244l.m15572j(null, str);
    }
}
