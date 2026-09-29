package com.google.firebase.sessions;

import android.util.Log;
import com.google.firebase.sessions.api.C1165a;
import com.google.firebase.sessions.api.SessionSubscriber$Name;
import com.google.firebase.sessions.settings.C1170b;
import java.util.Map;
import kotlin.AbstractC3193b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p000.C3386nv;
import p000.az8;
import p000.bz8;
import p000.c32;
import p000.c74;
import p000.fz8;
import p000.np1;
import p000.q43;
import p000.un1;
import p000.wz1;
import p000.x43;
import p000.xfa;
import p000.zi3;
import p000.zy8;

/* JADX INFO: loaded from: classes.dex */
@c32(m4290c = "com.google.firebase.sessions.SessionFirelogPublisherImpl$mayLogSession$1", m4291f = "SessionFirelogPublisher.kt", m4292l = {70, 71, 77}, m4293m = "invokeSuspend")
final class SessionFirelogPublisherImpl$mayLogSession$1 extends SuspendLambda implements zi3 {

    /* JADX INFO: renamed from: a */
    public c74 f13807a;

    /* JADX INFO: renamed from: b */
    public C1167c f13808b;

    /* JADX INFO: renamed from: c */
    public bz8 f13809c;

    /* JADX INFO: renamed from: d */
    public q43 f13810d;

    /* JADX INFO: renamed from: e */
    public zy8 f13811e;

    /* JADX INFO: renamed from: f */
    public C1170b f13812f;

    /* JADX INFO: renamed from: g */
    public int f13813g;

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ C1167c f13814h;

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ zy8 f13815i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SessionFirelogPublisherImpl$mayLogSession$1(C1167c c1167c, zy8 zy8Var, Continuation continuation) {
        super(2, continuation);
        this.f13814h = c1167c;
        this.f13815i = zy8Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new SessionFirelogPublisherImpl$mayLogSession$1(this.f13814h, this.f13815i, continuation);
    }

    @Override // p000.zi3
    public final Object invoke(Object obj, Object obj2) {
        return ((SessionFirelogPublisherImpl$mayLogSession$1) create((un1) obj, (Continuation) obj2)).invokeSuspend(xfa.f68157a);
    }

    /* JADX WARN: Code duplicated, block: B:23:0x007c  */
    /* JADX WARN: Code duplicated, block: B:26:0x00b0  */
    /* JADX WARN: Code duplicated, block: B:28:0x00b5  */
    /* JADX WARN: Code duplicated, block: B:30:0x00bd  */
    /* JADX WARN: Code duplicated, block: B:31:0x00c0  */
    /* JADX WARN: Code duplicated, block: B:34:0x00cd  */
    /* JADX WARN: Code duplicated, block: B:36:0x00d2  */
    /* JADX WARN: Code duplicated, block: B:38:0x00da  */
    /* JADX WARN: Code duplicated, block: B:39:0x00dd  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objM6755a;
        Object objM6754a;
        c74 c74Var;
        bz8 bz8Var;
        q43 q43Var;
        C1170b c1170b;
        zy8 zy8Var;
        Object objM6753b;
        q43 q43Var2;
        C1170b c1170b2;
        np1 np1Var;
        DataCollectionState dataCollectionState;
        np1 np1Var2;
        DataCollectionState dataCollectionState2;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.f13813g;
        C1167c c1167c = this.f13814h;
        if (i == 0) {
            AbstractC3193b.m15359b(obj);
            this.f13813g = 1;
            objM6755a = C1167c.m6755a(c1167c, this);
            if (objM6755a != coroutineSingletons) {
            }
            return coroutineSingletons;
        }
        if (i == 1) {
            AbstractC3193b.m15359b(obj);
            objM6755a = obj;
        } else {
            if (i == 2) {
                AbstractC3193b.m15359b(obj);
                objM6754a = obj;
                c74Var = (c74) objM6754a;
                bz8Var = bz8.f9201a;
                q43Var = c1167c.f13853a;
                c1170b = c1167c.f13855c;
                C1165a c1165a = C1165a.f13849a;
                this.f13807a = c74Var;
                this.f13808b = c1167c;
                this.f13809c = bz8Var;
                this.f13810d = q43Var;
                zy8Var = this.f13815i;
                this.f13811e = zy8Var;
                this.f13812f = c1170b;
                this.f13813g = 3;
                objM6753b = c1165a.m6753b(this);
                if (objM6753b != coroutineSingletons) {
                    q43Var2 = q43Var;
                    c1170b2 = c1170b;
                }
                return coroutineSingletons;
            }
            if (i != 3) {
                C3386nv.m17633t("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            c1170b2 = this.f13812f;
            zy8 zy8Var2 = this.f13811e;
            q43Var2 = this.f13810d;
            bz8Var = this.f13809c;
            c1167c = this.f13808b;
            c74 c74Var2 = this.f13807a;
            AbstractC3193b.m15359b(obj);
            zy8Var = zy8Var2;
            c74Var = c74Var2;
            objM6753b = obj;
        }
        Map map = (Map) objM6753b;
        String str = c74Var.f9659a;
        String str2 = c74Var.f9660b;
        bz8Var.getClass();
        q43Var2.getClass();
        zy8Var.getClass();
        c1170b2.getClass();
        map.getClass();
        str2.getClass();
        EventType eventType = EventType.SESSION_START;
        String str3 = zy8Var.f72388a;
        String str4 = zy8Var.f72389b;
        int i2 = zy8Var.f72390c;
        long j = zy8Var.f72391d;
        np1Var = (np1) map.get(SessionSubscriber$Name.PERFORMANCE);
        if (np1Var == null) {
            dataCollectionState = DataCollectionState.COLLECTION_SDK_NOT_INSTALLED;
        } else if (np1Var.f53086a.m22354a()) {
            dataCollectionState = DataCollectionState.COLLECTION_ENABLED;
        } else {
            dataCollectionState = DataCollectionState.COLLECTION_DISABLED;
        }
        C1170b c1170b3 = c1170b2;
        np1Var2 = (np1) map.get(SessionSubscriber$Name.CRASHLYTICS);
        if (np1Var2 == null) {
            dataCollectionState2 = DataCollectionState.COLLECTION_SDK_NOT_INSTALLED;
        } else if (np1Var2.f53086a.m22354a()) {
            dataCollectionState2 = DataCollectionState.COLLECTION_ENABLED;
        } else {
            dataCollectionState2 = DataCollectionState.COLLECTION_DISABLED;
        }
        az8 az8Var = new az8(eventType, new fz8(str3, str4, i2, j, new wz1(dataCollectionState, dataCollectionState2, c1170b3.m6765a()), str, str2), bz8.m4240a(q43Var2));
        int i3 = C1167c.f13852g;
        c1167c.getClass();
        try {
            c1167c.f13856d.m22299a(az8Var);
            Log.d("FirebaseSessions", "Successfully logged Session Start event.");
        } catch (RuntimeException e) {
            Log.e("FirebaseSessions", "Error logging Session Start event to DataTransport: ", e);
        }
        return xfa.f68157a;
        if (((Boolean) objM6755a).booleanValue()) {
            x43 x43Var = c1167c.f13854b;
            this.f13813g = 2;
            objM6754a = c74.f9658c.m6754a(x43Var, this);
            if (objM6754a != coroutineSingletons) {
                c74Var = (c74) objM6754a;
                bz8Var = bz8.f9201a;
                q43Var = c1167c.f13853a;
                c1170b = c1167c.f13855c;
                C1165a c1165a2 = C1165a.f13849a;
                this.f13807a = c74Var;
                this.f13808b = c1167c;
                this.f13809c = bz8Var;
                this.f13810d = q43Var;
                zy8Var = this.f13815i;
                this.f13811e = zy8Var;
                this.f13812f = c1170b;
                this.f13813g = 3;
                objM6753b = c1165a2.m6753b(this);
                if (objM6753b != coroutineSingletons) {
                    q43Var2 = q43Var;
                    c1170b2 = c1170b;
                    Map map2 = (Map) objM6753b;
                    String str5 = c74Var.f9659a;
                    String str6 = c74Var.f9660b;
                    bz8Var.getClass();
                    q43Var2.getClass();
                    zy8Var.getClass();
                    c1170b2.getClass();
                    map2.getClass();
                    str6.getClass();
                    EventType eventType2 = EventType.SESSION_START;
                    String str7 = zy8Var.f72388a;
                    String str8 = zy8Var.f72389b;
                    int i4 = zy8Var.f72390c;
                    long j2 = zy8Var.f72391d;
                    np1Var = (np1) map2.get(SessionSubscriber$Name.PERFORMANCE);
                    if (np1Var == null) {
                        dataCollectionState = DataCollectionState.COLLECTION_SDK_NOT_INSTALLED;
                    } else if (np1Var.f53086a.m22354a()) {
                        dataCollectionState = DataCollectionState.COLLECTION_ENABLED;
                    } else {
                        dataCollectionState = DataCollectionState.COLLECTION_DISABLED;
                    }
                    C1170b c1170b4 = c1170b2;
                    np1Var2 = (np1) map2.get(SessionSubscriber$Name.CRASHLYTICS);
                    if (np1Var2 == null) {
                        dataCollectionState2 = DataCollectionState.COLLECTION_SDK_NOT_INSTALLED;
                    } else if (np1Var2.f53086a.m22354a()) {
                        dataCollectionState2 = DataCollectionState.COLLECTION_ENABLED;
                    } else {
                        dataCollectionState2 = DataCollectionState.COLLECTION_DISABLED;
                    }
                    az8 az8Var2 = new az8(eventType2, new fz8(str7, str8, i4, j2, new wz1(dataCollectionState, dataCollectionState2, c1170b4.m6765a()), str5, str6), bz8.m4240a(q43Var2));
                    int i5 = C1167c.f13852g;
                    c1167c.getClass();
                    c1167c.f13856d.m22299a(az8Var2);
                    Log.d("FirebaseSessions", "Successfully logged Session Start event.");
                }
            }
            return coroutineSingletons;
        }
        return xfa.f68157a;
    }
}
