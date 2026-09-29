package com.google.firebase.messaging.reporting;

import ye.InterfaceC10353b;

/* JADX INFO: loaded from: classes.dex */
public final class MessagingClientEvent {

    /* JADX INFO: renamed from: p */
    public static final /* synthetic */ int f16419p = 0;

    /* JADX INFO: renamed from: a */
    public final long f16420a;

    /* JADX INFO: renamed from: b */
    public final String f16421b;

    /* JADX INFO: renamed from: c */
    public final String f16422c;

    /* JADX INFO: renamed from: d */
    public final MessageType f16423d;

    /* JADX INFO: renamed from: e */
    public final SDKPlatform f16424e;

    /* JADX INFO: renamed from: f */
    public final String f16425f;

    /* JADX INFO: renamed from: g */
    public final String f16426g;

    /* JADX INFO: renamed from: i */
    public final int f16428i;

    /* JADX INFO: renamed from: j */
    public final String f16429j;

    /* JADX INFO: renamed from: l */
    public final Event f16431l;

    /* JADX INFO: renamed from: m */
    public final String f16432m;

    /* JADX INFO: renamed from: o */
    public final String f16434o;

    /* JADX INFO: renamed from: h */
    public final int f16427h = 0;

    /* JADX INFO: renamed from: k */
    public final long f16430k = 0;

    /* JADX INFO: renamed from: n */
    public final long f16433n = 0;

    public enum Event implements InterfaceC10353b {
        UNKNOWN_EVENT(0),
        MESSAGE_DELIVERED(1),
        MESSAGE_OPEN(2);

        private final int number_;

        Event(int i10) {
            this.number_ = i10;
        }

        @Override // ye.InterfaceC10353b
        public int getNumber() {
            return this.number_;
        }
    }

    public enum MessageType implements InterfaceC10353b {
        UNKNOWN(0),
        DATA_MESSAGE(1),
        TOPIC(2),
        DISPLAY_NOTIFICATION(3);

        private final int number_;

        MessageType(int i10) {
            this.number_ = i10;
        }

        @Override // ye.InterfaceC10353b
        public int getNumber() {
            return this.number_;
        }
    }

    public enum SDKPlatform implements InterfaceC10353b {
        UNKNOWN_OS(0),
        ANDROID(1),
        IOS(2),
        WEB(3);

        private final int number_;

        SDKPlatform(int i10) {
            this.number_ = i10;
        }

        @Override // ye.InterfaceC10353b
        public int getNumber() {
            return this.number_;
        }
    }

    static {
        MessageType messageType = MessageType.UNKNOWN;
        SDKPlatform sDKPlatform = SDKPlatform.UNKNOWN_OS;
        Event event = Event.UNKNOWN_EVENT;
    }

    public MessagingClientEvent(long j10, String str, String str2, MessageType messageType, SDKPlatform sDKPlatform, String str3, String str4, int i10, String str5, Event event, String str6, String str7) {
        this.f16420a = j10;
        this.f16421b = str;
        this.f16422c = str2;
        this.f16423d = messageType;
        this.f16424e = sDKPlatform;
        this.f16425f = str3;
        this.f16426g = str4;
        this.f16428i = i10;
        this.f16429j = str5;
        this.f16431l = event;
        this.f16432m = str6;
        this.f16434o = str7;
    }
}
