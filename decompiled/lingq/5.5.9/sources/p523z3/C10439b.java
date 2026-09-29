package p523z3;

import android.media.session.MediaSessionManager;
import p007a6.C0024c;
import p007a6.C0025d;

/* JADX INFO: renamed from: z3.b */
/* JADX INFO: loaded from: classes.dex */
public final class C10439b extends C10440c {
    public C10439b(MediaSessionManager.RemoteUserInfo remoteUserInfo) {
        super(remoteUserInfo.getPackageName(), remoteUserInfo.getPid(), remoteUserInfo.getUid());
    }

    public C10439b(String str, int i10, int i11) {
        super(str, i10, i11);
        C0025d.m120q();
        C0024c.m100y(str, i10, i11);
    }
}
