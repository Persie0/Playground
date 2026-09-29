package com.facebook.internal;

import android.content.Intent;
import java.util.Arrays;
import java.util.HashMap;
import kotlin.Metadata;
import p067d8.C5056a0;
import p291o7.C8004n;
import p291o7.InterfaceC7998h;

/* JADX INFO: loaded from: classes.dex */
public final class CallbackManagerImpl implements InterfaceC7998h {

    /* JADX INFO: renamed from: b */
    public static final C2301b f11543b = new C2301b();

    /* JADX INFO: renamed from: c */
    public static final HashMap f11544c = new HashMap();

    /* JADX INFO: renamed from: a */
    public final HashMap f11545a = new HashMap();

    @Metadata(m13364d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\u0014\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0006\u0010\u0005\u001a\u00020\u0003R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014j\u0002\b\u0015j\u0002\b\u0016¨\u0006\u0017"}, m13365d2 = {"Lcom/facebook/internal/CallbackManagerImpl$RequestCodeOffset;", "", "offset", "", "(Ljava/lang/String;II)V", "toRequestCode", "Login", "Share", "Message", "Like", "GameRequest", "AppGroupCreate", "AppGroupJoin", "AppInvite", "DeviceShare", "GamingFriendFinder", "GamingGroupIntegration", "Referral", "GamingContextCreate", "GamingContextSwitch", "GamingContextChoose", "TournamentShareDialog", "TournamentJoinDialog", "facebook-core_release"}, m13366k = 1, m13367mv = {1, 5, 1}, m13369xi = 48)
    public enum RequestCodeOffset {
        Login(0),
        Share(1),
        Message(2),
        Like(3),
        GameRequest(4),
        AppGroupCreate(5),
        AppGroupJoin(6),
        AppInvite(7),
        DeviceShare(8),
        GamingFriendFinder(9),
        GamingGroupIntegration(10),
        Referral(11),
        GamingContextCreate(12),
        GamingContextSwitch(13),
        GamingContextChoose(14),
        TournamentShareDialog(15),
        TournamentJoinDialog(16);

        private final int offset;

        RequestCodeOffset(int i10) {
            this.offset = i10;
        }

        /* JADX INFO: renamed from: values, reason: to resolve conflict with enum method */
        public static RequestCodeOffset[] valuesCustom() {
            RequestCodeOffset[] requestCodeOffsetArrValuesCustom = values();
            return (RequestCodeOffset[]) Arrays.copyOf(requestCodeOffsetArrValuesCustom, requestCodeOffsetArrValuesCustom.length);
        }

        public final int toRequestCode() {
            C8004n c8004n = C8004n.f43550a;
            C5056a0.m10747e();
            return C8004n.f43561l + this.offset;
        }
    }

    /* JADX INFO: renamed from: com.facebook.internal.CallbackManagerImpl$a */
    public interface InterfaceC2300a {
        /* JADX INFO: renamed from: a */
        void mo6663a(Intent intent, int i10);
    }

    /* JADX INFO: renamed from: com.facebook.internal.CallbackManagerImpl$b */
    public static final class C2301b {
    }

    @Override // p291o7.InterfaceC7998h
    /* JADX INFO: renamed from: a */
    public final boolean mo6662a(int i10, int i11, Intent intent) {
        InterfaceC2300a interfaceC2300a;
        InterfaceC2300a interfaceC2300a2 = (InterfaceC2300a) this.f11545a.get(Integer.valueOf(i10));
        if (interfaceC2300a2 != null) {
            interfaceC2300a2.mo6663a(intent, i11);
            return true;
        }
        synchronized (f11543b) {
            interfaceC2300a = (InterfaceC2300a) f11544c.get(Integer.valueOf(i10));
        }
        if (interfaceC2300a == null) {
            return false;
        }
        interfaceC2300a.mo6663a(intent, i11);
        return true;
    }
}
