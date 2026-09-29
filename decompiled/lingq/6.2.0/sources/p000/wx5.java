package p000;

import com.google.firebase.messaging.reporting.MessagingClientEvent$Event;
import com.google.firebase.messaging.reporting.MessagingClientEvent$MessageType;
import com.google.firebase.messaging.reporting.MessagingClientEvent$SDKPlatform;

/* JADX INFO: loaded from: classes2.dex */
public final class wx5 {

    /* JADX INFO: renamed from: a */
    public final long f67472a;

    /* JADX INFO: renamed from: b */
    public final String f67473b;

    /* JADX INFO: renamed from: c */
    public final String f67474c;

    /* JADX INFO: renamed from: d */
    public final MessagingClientEvent$MessageType f67475d;

    /* JADX INFO: renamed from: e */
    public final MessagingClientEvent$SDKPlatform f67476e;

    /* JADX INFO: renamed from: f */
    public final String f67477f;

    /* JADX INFO: renamed from: g */
    public final String f67478g;

    /* JADX INFO: renamed from: h */
    public final int f67479h;

    /* JADX INFO: renamed from: i */
    public final int f67480i;

    /* JADX INFO: renamed from: j */
    public final String f67481j;

    /* JADX INFO: renamed from: k */
    public final MessagingClientEvent$Event f67482k;

    /* JADX INFO: renamed from: l */
    public final String f67483l;

    /* JADX INFO: renamed from: m */
    public final String f67484m;

    static {
        MessagingClientEvent$MessageType messagingClientEvent$MessageType = MessagingClientEvent$MessageType.UNKNOWN;
        MessagingClientEvent$SDKPlatform messagingClientEvent$SDKPlatform = MessagingClientEvent$SDKPlatform.UNKNOWN_OS;
        MessagingClientEvent$Event messagingClientEvent$Event = MessagingClientEvent$Event.UNKNOWN_EVENT;
    }

    public wx5(long j, String str, String str2, MessagingClientEvent$MessageType messagingClientEvent$MessageType, MessagingClientEvent$SDKPlatform messagingClientEvent$SDKPlatform, String str3, String str4, int i, int i2, String str5, MessagingClientEvent$Event messagingClientEvent$Event, String str6, String str7) {
        this.f67472a = j;
        this.f67473b = str;
        this.f67474c = str2;
        this.f67475d = messagingClientEvent$MessageType;
        this.f67476e = messagingClientEvent$SDKPlatform;
        this.f67477f = str3;
        this.f67478g = str4;
        this.f67479h = i;
        this.f67480i = i2;
        this.f67481j = str5;
        this.f67482k = messagingClientEvent$Event;
        this.f67483l = str6;
        this.f67484m = str7;
    }

    /* JADX INFO: renamed from: a */
    public static vx5 m24201a() {
        vx5 vx5Var = new vx5();
        vx5Var.f66047a = 0L;
        vx5Var.f66048b = "";
        vx5Var.f66049c = "";
        vx5Var.f66050d = MessagingClientEvent$MessageType.UNKNOWN;
        vx5Var.f66051e = MessagingClientEvent$SDKPlatform.UNKNOWN_OS;
        vx5Var.f66052f = "";
        vx5Var.f66053g = "";
        vx5Var.f66054h = 0;
        vx5Var.f66055i = 0;
        vx5Var.f66056j = "";
        vx5Var.f66057k = MessagingClientEvent$Event.UNKNOWN_EVENT;
        vx5Var.f66058l = "";
        vx5Var.f66059m = "";
        return vx5Var;
    }
}
