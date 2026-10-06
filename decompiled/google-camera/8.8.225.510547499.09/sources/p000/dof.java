package p000;

import androidx.work.impl.workers.NHKG.pIeXJQLZLfgIN;
import com.google.android.apps.camera.app.silentfeedback.p004ip.TVkaNXnfP;
import p021j$.time.Duration;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class dof extends Exception {

    /* JADX INFO: renamed from: a */
    public final kcl f12153a;

    /* JADX INFO: renamed from: b */
    public final kmg f12154b;

    /* JADX INFO: renamed from: c */
    public final long f12155c;

    /* JADX WARN: Illegal instructions before constructor call */
    public dof(kmg kmgVar, kcl kclVar, long j) {
        String str;
        String str2 = kmgVar.f36540a;
        if (j == 0) {
            str = TVkaNXnfP.EAvLzz;
        } else {
            str = "after being open for " + Duration.ofNanos(j).toMillis() + " milli seconds: ";
        }
        super("Camera " + str2 + pIeXJQLZLfgIN.AyodITA + str + kclVar.m13983c());
        this.f12154b = kmgVar;
        this.f12153a = kclVar;
        this.f12155c = j;
    }
}
