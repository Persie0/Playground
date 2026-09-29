package com.google.firebase.analytics.ktx;

import com.android.installreferrer.api.InstallReferrerClient;
import com.google.firebase.components.ComponentRegistrar;
import java.util.List;
import kotlin.Metadata;
import p118fe.C5511c;
import p200jf.C6474f;
import p385sf.C9000b;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m13364d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m13365d2 = {"Lcom/google/firebase/analytics/ktx/FirebaseAnalyticsKtxRegistrar;", "Lcom/google/firebase/components/ComponentRegistrar;", "<init>", "()V", "java.com.google.android.libraries.firebase.firebase_analytics_ktx_granule"}, m13366k = 1, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
public final class FirebaseAnalyticsKtxRegistrar implements ComponentRegistrar {
    @Override // com.google.firebase.components.ComponentRegistrar
    public final List<C5511c<?>> getComponents() {
        return C9000b.m17251q(C6474f.m13081a("fire-analytics-ktx", "21.2.1"));
    }
}
