package androidx.compose.runtime;

import android.os.Looper;
import cm.InterfaceC2041a;
import kotlin.C6740a;
import p081e0.InterfaceC5297b0;

/* JADX INFO: loaded from: classes.dex */
public final class ActualAndroid_androidKt {

    /* JADX INFO: renamed from: a */
    public static final /* synthetic */ int f2870a = 0;

    static {
        C6740a.m13372a(new InterfaceC2041a<InterfaceC5297b0>() { // from class: androidx.compose.runtime.ActualAndroid_androidKt$DefaultMonotonicFrameClock$2
            @Override // cm.InterfaceC2041a
            /* JADX INFO: renamed from: E */
            public final InterfaceC5297b0 mo807E() {
                return Looper.getMainLooper() != null ? DefaultChoreographerFrameClock.f3022a : SdkStubsFallbackFrameClock.f3105a;
            }
        });
    }
}
