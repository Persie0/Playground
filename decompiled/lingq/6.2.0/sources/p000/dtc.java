package p000;

import androidx.compose.runtime.internal.C0282a;
import com.lingq.core.database.entity.NotificationEntity;
import com.lingq.core.network.api.result.ResultNotification;

/* JADX INFO: loaded from: classes2.dex */
public abstract class dtc {

    /* JADX INFO: renamed from: a */
    public static final C0282a f36226a = new C0282a(-1164090566, false, new je1(9));

    /* JADX INFO: renamed from: b */
    public static final C0282a f36227b = new C0282a(-1848320871, false, new je1(10));

    /* JADX INFO: renamed from: a */
    public static final NotificationEntity m10644a(ResultNotification resultNotification, String str) {
        resultNotification.getClass();
        str.getClass();
        return new NotificationEntity(resultNotification.f21343a, resultNotification.f21344b, str, resultNotification.f21345c, resultNotification.f21346d, resultNotification.f21347e, resultNotification.f21348f, resultNotification.f21349g, resultNotification.f21350h, resultNotification.f21351i);
    }
}
