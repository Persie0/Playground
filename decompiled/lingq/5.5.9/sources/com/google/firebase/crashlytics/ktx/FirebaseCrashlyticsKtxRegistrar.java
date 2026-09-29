package com.google.firebase.crashlytics.ktx;

import androidx.annotation.Keep;
import androidx.datastore.preferences.PreferencesProto$Value;
import com.google.firebase.components.ComponentRegistrar;
import java.util.List;
import kotlin.Metadata;
import p118fe.C5511c;
import p200jf.C6474f;
import p385sf.C9000b;

/* JADX INFO: loaded from: classes.dex */
@Keep
@Metadata(m13364d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0005\u0010\u0006J\u0012\u0010\u0004\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00030\u0002H\u0016¨\u0006\u0007"}, m13365d2 = {"Lcom/google/firebase/crashlytics/ktx/FirebaseCrashlyticsKtxRegistrar;", "Lcom/google/firebase/components/ComponentRegistrar;", "", "Lfe/c;", "getComponents", "<init>", "()V", "com.google.firebase-firebase-crashlytics-ktx"}, m13366k = 1, m13367mv = {1, PreferencesProto$Value.DOUBLE_FIELD_NUMBER, 1})
public final class FirebaseCrashlyticsKtxRegistrar implements ComponentRegistrar {
    @Override // com.google.firebase.components.ComponentRegistrar
    public List<C5511c<?>> getComponents() {
        return C9000b.m17251q(C6474f.m13081a("fire-cls-ktx", "18.3.6"));
    }
}
