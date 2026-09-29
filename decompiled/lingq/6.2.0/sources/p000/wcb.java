package p000;

import android.os.SystemClock;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.ApiException;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.ConnectionTelemetryConfiguration;
import com.google.android.gms.common.internal.MethodInvocation;
import com.google.android.gms.common.internal.RootTelemetryConfiguration;
import com.google.android.gms.common.internal.zzj;
import com.google.android.gms.tasks.Task;

/* JADX INFO: loaded from: classes2.dex */
public final class wcb implements tr6 {

    /* JADX INFO: renamed from: a */
    public final so3 f66624a;

    /* JADX INFO: renamed from: b */
    public final int f66625b;

    /* JADX INFO: renamed from: c */
    public final C3118io f66626c;

    /* JADX INFO: renamed from: d */
    public final long f66627d;

    /* JADX INFO: renamed from: e */
    public final long f66628e;

    public wcb(so3 so3Var, int i, C3118io c3118io, long j, long j2) {
        this.f66624a = so3Var;
        this.f66625b = i;
        this.f66626c = c3118io;
        this.f66627d = j;
        this.f66628e = j2;
    }

    /* JADX WARN: Code duplicated, block: B:20:0x0042  */
    /* JADX INFO: renamed from: a */
    public static wcb m23850a(so3 so3Var, int i, C3118io c3118io) {
        if (!so3Var.m21518f()) {
            return null;
        }
        RootTelemetryConfiguration rootTelemetryConfiguration = (RootTelemetryConfiguration) hi8.m13280u().f42410b;
        boolean z = true;
        if (rootTelemetryConfiguration != null) {
            if (!rootTelemetryConfiguration.f11722b) {
                return null;
            }
            boolean z2 = rootTelemetryConfiguration.f11723c;
            scb scbVar = (scb) so3Var.f61103j.get(c3118io);
            if (scbVar != null) {
                co3 co3Var = scbVar.f60689g;
                if (!(co3Var instanceof f90)) {
                    return null;
                }
                co3 co3Var2 = co3Var;
                if (co3Var2.f38662w == null || co3Var2.m11613q()) {
                    z = z2;
                } else {
                    ConnectionTelemetryConfiguration connectionTelemetryConfigurationM23851b = m23851b(scbVar, co3Var2, i);
                    if (connectionTelemetryConfigurationM23851b == null) {
                        return null;
                    }
                    scbVar.f60699q++;
                    z = connectionTelemetryConfigurationM23851b.f11692c;
                }
            } else {
                z = z2;
            }
        }
        return new wcb(so3Var, i, c3118io, z ? System.currentTimeMillis() : 0L, z ? SystemClock.elapsedRealtime() : 0L);
    }

    /* JADX WARN: Code duplicated, block: B:26:0x0031 A[RETURN] */
    /* JADX INFO: renamed from: b */
    public static ConnectionTelemetryConfiguration m23851b(scb scbVar, f90 f90Var, int i) {
        zzj zzjVar = f90Var.f38662w;
        ConnectionTelemetryConfiguration connectionTelemetryConfiguration = zzjVar == null ? null : zzjVar.f11746d;
        if (connectionTelemetryConfiguration != null && connectionTelemetryConfiguration.f11691b) {
            int[] iArr = connectionTelemetryConfiguration.f11693d;
            int i2 = 0;
            if (iArr == null) {
                int[] iArr2 = connectionTelemetryConfiguration.f11695f;
                if (iArr2 != null) {
                    while (i2 < iArr2.length) {
                        if (iArr2[i2] != i) {
                            i2++;
                        }
                    }
                    if (scbVar.f60699q < connectionTelemetryConfiguration.f11694e) {
                        return connectionTelemetryConfiguration;
                    }
                } else if (scbVar.f60699q < connectionTelemetryConfiguration.f11694e) {
                    return connectionTelemetryConfiguration;
                }
            } else {
                while (i2 < iArr.length) {
                    if (iArr[i2] != i) {
                        i2++;
                    } else if (scbVar.f60699q < connectionTelemetryConfiguration.f11694e) {
                        return connectionTelemetryConfiguration;
                    }
                }
            }
        }
        return null;
    }

    @Override // p000.tr6
    /* JADX INFO: renamed from: f */
    public final void mo4558f(Task task) {
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        long j;
        long j2;
        so3 so3Var = this.f66624a;
        if (so3Var.m21518f()) {
            RootTelemetryConfiguration rootTelemetryConfiguration = (RootTelemetryConfiguration) hi8.m13280u().f42410b;
            if (rootTelemetryConfiguration == null || rootTelemetryConfiguration.f11722b) {
                scb scbVar = (scb) so3Var.f61103j.get(this.f66626c);
                if (scbVar != null) {
                    co3 co3Var = scbVar.f60689g;
                    if (co3Var instanceof f90) {
                        co3 co3Var2 = co3Var;
                        long j3 = this.f66627d;
                        int i6 = 0;
                        boolean z = j3 > 0;
                        int i7 = co3Var2.f38656q;
                        if (rootTelemetryConfiguration != null) {
                            z &= rootTelemetryConfiguration.f11723c;
                            i = rootTelemetryConfiguration.f11724d;
                            i3 = rootTelemetryConfiguration.f11725e;
                            i2 = rootTelemetryConfiguration.f11721a;
                            if (co3Var2.f38662w != null && !co3Var2.m11613q()) {
                                ConnectionTelemetryConfiguration connectionTelemetryConfigurationM23851b = m23851b(scbVar, co3Var2, this.f66625b);
                                if (connectionTelemetryConfigurationM23851b == null) {
                                    return;
                                }
                                boolean z2 = connectionTelemetryConfigurationM23851b.f11692c && j3 > 0;
                                i3 = connectionTelemetryConfigurationM23851b.f11694e;
                                z = z2;
                            }
                        } else {
                            i = 5000;
                            i2 = 0;
                            i3 = 100;
                        }
                        int i8 = i;
                        int iElapsedRealtime = -1;
                        if (task.mo5971m()) {
                            i5 = 0;
                        } else if (task.mo5969k()) {
                            i6 = -1;
                            i5 = 100;
                        } else {
                            Exception excMo5966h = task.mo5966h();
                            if (excMo5966h instanceof ApiException) {
                                Status status = ((ApiException) excMo5966h).f11645a;
                                i4 = status.f11662a;
                                ConnectionResult connectionResult = status.f11665d;
                                if (connectionResult != null) {
                                    i5 = i4;
                                    i6 = connectionResult.f11637b;
                                }
                            } else {
                                i4 = 101;
                            }
                            i5 = i4;
                            i6 = -1;
                        }
                        if (z) {
                            long j4 = this.f66628e;
                            long jCurrentTimeMillis = System.currentTimeMillis();
                            iElapsedRealtime = (int) (SystemClock.elapsedRealtime() - j4);
                            j2 = jCurrentTimeMillis;
                            j = j3;
                        } else {
                            j = 0;
                            j2 = 0;
                        }
                        xcb xcbVar = new xcb(new MethodInvocation(this.f66625b, i5, i6, j, j2, null, null, i7, iElapsedRealtime), i2, i8, i3);
                        wdb wdbVar = so3Var.f61092H;
                        wdbVar.sendMessage(wdbVar.obtainMessage(18, xcbVar));
                    }
                }
            }
        }
    }
}
