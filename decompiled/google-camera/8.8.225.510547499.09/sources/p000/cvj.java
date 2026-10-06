package p000;

import java.io.FileDescriptor;
import java.io.FileOutputStream;
import p021j$.time.ZoneId;
import p021j$.util.DesugarTimeZone;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class cvj implements jyq {

    /* JADX INFO: renamed from: a */
    private final dhv f9788a;

    public cvj(dhv dhvVar) {
        this.f9788a = dhvVar;
    }

    @Override // p000.jyq
    /* JADX INFO: renamed from: a */
    public final kqa mo5570a(FileDescriptor fileDescriptor, int i) {
        FileOutputStream fileOutputStream = new FileOutputStream(fileDescriptor);
        dhv dhvVar = this.f9788a;
        dhx dhxVar = dhh.f11074a;
        dhvVar.mo6175c();
        kyd kydVar = new kyd(fileOutputStream, acx.m250d(0), null, null, null);
        long jCurrentTimeMillis = System.currentTimeMillis();
        DesugarTimeZone.getTimeZone(ZoneId.systemDefault());
        dhv dhvVar2 = this.f9788a;
        kydVar.f37718a.m976d(jCurrentTimeMillis);
        dhvVar2.mo6177e();
        return new kxz(kydVar, jzn.m13824l("gca-muxer"));
    }
}
